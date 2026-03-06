#!/usr/bin/env bash
# rename_from_super_no_bak_Version3.sh
# Fixed: reliably finds .java files and extracts mappings from super("NAME", ...)
# Usage:
#   bash ./rename_from_super_no_bak_Version3.sh [--dir mapped] [--use-git] [--dry-run]
set -euo pipefail

TARGET_DIR="mapped"
USE_GIT=false
DRY_RUN=false

while [ $# -gt 0 ]; do
  case "$1" in
    --dir) TARGET_DIR="$2"; shift 2;;
    --use-git) USE_GIT=true; shift;;
    --dry-run) DRY_RUN=true; shift;;
    *) echo "Unknown option: $1" >&2; exit 2;;
  esac
done

if ! command -v perl >/dev/null 2>&1; then
  echo "perl is required. Install perl and retry." >&2
  exit 1
fi

if [ ! -d "$TARGET_DIR" ]; then
  echo "Target directory '$TARGET_DIR' not found." >&2
  exit 1
fi

if $USE_GIT && ! command -v git >/dev/null 2>&1; then
  echo "--use-git specified but git not found. Install git or omit --use-git." >&2
  exit 1
fi

echo "Collecting .java files under: $TARGET_DIR ..."
TMP_JAVA_LIST="$(mktemp)"
trap 'rm -f "$TMP_JAVA_LIST"' EXIT

# Write find results to a temp file (null-separated)
find "$TARGET_DIR" -type f -name '*.java' -print0 > "$TMP_JAVA_LIST"

# Count entries (number of null bytes)
JAVA_FILES_COUNT=0
if [ -s "$TMP_JAVA_LIST" ]; then
  JAVA_FILES_COUNT=$(tr -cd '\0' < "$TMP_JAVA_LIST" | wc -c)
fi

if [ "$JAVA_FILES_COUNT" -eq 0 ]; then
  echo "No .java files found under $TARGET_DIR"
  exit 0
fi

echo "Scanning $JAVA_FILES_COUNT files for super(\"NAME\", ...)..."
TMP_MAPS="$(mktemp)"
trap 'rm -f "$TMP_MAPS" "$TMP_JAVA_LIST" "$TMP_MAPS".uniq' EXIT

# Iterate over java files (read from temp file)
while IFS= read -r -d '' f; do
  filename="$(basename "$f")"
  class="${filename%.java}"

  # capture first super("...") string literal in file (double- or single-quoted)
  newname="$(perl -0777 -ne 'if (/super\s*\(\s*"([^"]+)"/s) { print $1; exit } elsif (/super\s*\(\s*'\''([^'\'']+)'\''/s) { print $1; exit }' "$f" || true)"

  if [ -n "$newname" ] && [ "$newname" != "$class" ]; then
    printf '%s=%s\n' "$class" "$newname" >> "$TMP_MAPS"
  fi
done < "$TMP_JAVA_LIST"

if [ ! -s "$TMP_MAPS" ]; then
  echo "No mappings extracted from super(\"...\") calls."
  exit 0
fi

# dedupe: keep first mapping for same old name
awk -F= '!seen[$1]++ {print $0}' "$TMP_MAPS" > "${TMP_MAPS}.uniq"
mv "${TMP_MAPS}.uniq" "$TMP_MAPS"

echo "Mappings extracted:"
nl -ba "$TMP_MAPS" | sed 's/^/  /'

if $DRY_RUN; then
  echo
  echo "DRY-RUN: listing files that would be modified (files containing the old symbol):"
  while IFS='=' read -r old new; do
    echo
    echo "Mapping: $old -> $new"
    grep -R --line-number --word-regexp -- "$old" "$TARGET_DIR" || true
  done < "$TMP_MAPS"
  echo
  echo "Dry-run complete. No files were modified."
  exit 0
fi

echo
echo "Applying in-place replacements (no backups). This will modify files!"
# Replace occurrences (word-boundary) in all .java files
while IFS='=' read -r old new; do
  echo "Replacing: $old -> $new"
  find "$TARGET_DIR" -type f -name '*.java' -print0 | while IFS= read -r -d '' f; do
    perl -0777 -pe "s/\\b\\Q${old}\\E\\b/${new}/gms" -i "$f" || { echo "Replace failed in $f" >&2; exit 1; }
  done
done < "$TMP_MAPS"

# Rename files named Old.java -> New.java
echo
echo "Renaming files Old.java -> New.java (if present)..."
while IFS='=' read -r old new; do
  find "$TARGET_DIR" -type f -name "${old}.java" -print0 | while IFS= read -r -d '' file; do
    dirpath="$(dirname "$file")"
    newpath="$dirpath/$new.java"
    echo "  Candidate: $file -> $newpath"
    if [ -e "$newpath" ]; then
      echo "  Warning: target exists, skipping: $newpath" >&2
      continue
    fi
    if $USE_GIT && git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
      git mv "$file" "$newpath"
    else
      mv "$file" "$newpath"
    fi
  done
done < "$TMP_MAPS"

echo
echo "Done. Please review changes (git status / git diff) and commit as desired."
