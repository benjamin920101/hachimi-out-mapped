/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class248;
import mapped.Class250;
import mapped.Class278;
import mapped.Class556;
import mapped.Class93;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class288
extends Class278 {
    Class248 field488 = this.method450(new Class250("Placeholder", "The placeholder name for the player", "Player"));

    @Class1
    public void method1635(Class93 a2) {
        if (Class288.field290.field_1724 == null) {
            return;
        }
        String b2 = field290.method_1548().method_1676();
        String c2 = a2.method184();
        if (c2.contains(b2)) {
            a2.method10();
            a2.method182(c2.replace(b2, (CharSequence)this.field488.method507()));
        }
    }

    public Class288() {
        super("NameProtect", "Hides the player name in chat and tablist", Class556.field2756);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

