/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import mapped.Class248;
import mapped.Class257;
import mapped.Class260;
import mapped.Class278;
import mapped.Class530;
import mapped.Class556;
import net.minecraft.class_2246;
import net.minecraft.class_2248;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class346
extends Class278 {
    private static long[] field995 = new long[2];
    private static Class346 INSTANCE;
    Class248 field996;
    Class248 field997 = this.method450(new Class260("Mode", "mode", Class530.field2630, Class530.values()));
    Class248 field998;

    public Class346() {
        super("GhostHand", "Wall hack", Class556.field2754);
        class_2248[] class_2248Array = new class_2248[(int)field995[0]];
        class_2248Array[(int)Class346.field995[1]] = class_2246.field_10034;
        this.field998 = this.method450(new Class257("TargetList", "Valid block whitelist", class_2248Array));
        class_2248[] class_2248Array2 = new class_2248[(int)field995[0]];
        class_2248Array2[(int)Class346.field995[1]] = class_2246.field_9987;
        this.field996 = this.method450(new Class257("IgnoreList", "Valid block blacklist", class_2248Array2));
        INSTANCE = this;
    }

    private static Object method3829(Class248 class248) {
        return class248.method507();
    }

    private static String t92Iw49OdEfG9F7T(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xE1A5DE5B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public boolean method3830(class_2248 a2) {
        switch (((Class530)((Object)Class346.method3829(this.field997))).ordinal()) {
            case 0: {
                if (!((List)this.field996.method507()).contains(a2)) break;
                return (int)field995[0] != 0;
            }
            case 1: {
                if (((List)this.field998.method507()).contains(a2)) break;
                return (int)field995[0] != 0;
            }
        }
        return (int)field995[1] != 0;
    }

    private static void method3831(long l2) {
        Class346.field995[0] = l2 ^ 0x696D361CEA068147L;
        Class346.field995[1] = l2 ^ 0x696D361CEA068146L;
    }

    public static CallSite Jy5F2lSIWlyYDwSm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class346.t92Iw49OdEfG9F7T(string7), Class346.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class346.t92Iw49OdEfG9F7T(string5)), Class346.t92Iw49OdEfG9F7T(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class346.t92Iw49OdEfG9F7T(string5)), Class346.t92Iw49OdEfG9F7T(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        Class346.method3831(7596787644257173830L);
    }

    public static Class346 method3832() {
        return INSTANCE;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

