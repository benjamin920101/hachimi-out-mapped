/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class248;
import mapped.Class253;
import mapped.Class260;
import mapped.Class390;
import mapped.Class451;
import mapped.Class522;
import mapped.Class556;
import mapped.Class632;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class456
extends Class451 {
    private static long[] field2406 = new long[2];
    Class248 field2407;
    Class248 field2408 = this.method450(new Class253("MovementFix", "Fixes movement on Grim when rotating", (boolean)field2406[0]));
    private static Class456 INSTANCE;
    Class248 field2409;
    Class248 field2410;

    public boolean method10600() {
        return (Boolean)Class456.method10609(this).method507();
    }

    public Class522 method10601() {
        return (Class522)((Object)Class456.method10608(this.field2410));
    }

    public static Class456 method10602() {
        return INSTANCE;
    }

    private static void method10603(long l2) {
        Class456.method10611(l2);
    }

    private static Class390 method10604() {
        return Class390.method5496();
    }

    private static boolean method10605(Class390 class390) {
        return class390.method5518();
    }

    public Class456() {
        super("Rotations", "Manages client rotations", Class556.field2757);
        this.field2407 = this.method450(new Class253("MouseSensFix", "Fixes movement on Grim when applying mouse sensitivity", (boolean)field2406[0]));
        this.field2410 = this.method450(new Class260("Animation", "Rotation apply player animation", Class522.field2583, Class522.values()));
        this.field2409 = this.method450(new Class260("SnapBack", "Snap back to bypass the grim check", Class632.field3087, Class632.values()));
        INSTANCE = this;
    }

    public static Class248 method10606(Class456 class456) {
        return class456.field2409;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method10607() {
        int n2;
        if (!(!((Boolean)this.field2408.method507()).booleanValue() || Class456.method10604().method1265() && Class456.method10605(Class390.method5496()))) {
            n2 = (int)field2406[1];
            return n2 != 0;
        }
        n2 = (int)field2406[0];
        return n2 != 0;
    }

    private static Object method10608(Class248 class248) {
        return class248.method507();
    }

    private static String Nih6eDuq5Blyzh6z(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xBBC7224D));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class248 method10609(Class456 class456) {
        return class456.field2407;
    }

    public Class632 method10610() {
        return (Class632)((Object)Class456.method10606(this).method507());
    }

    private static void method10611(long l2) {
        Class456.field2406[0] = l2 ^ 0x6E523B33E1E756A5L;
        Class456.field2406[1] = l2 ^ 0x6E523B33E1E756A4L;
    }

    public static CallSite uSwajv4i6j8GDmBG(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class456.Nih6eDuq5Blyzh6z(string7), Class456.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class456.Nih6eDuq5Blyzh6z(string5)), Class456.Nih6eDuq5Blyzh6z(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class456.Nih6eDuq5Blyzh6z(string5)), Class456.Nih6eDuq5Blyzh6z(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        Class456.method10603(7949481386281752229L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

