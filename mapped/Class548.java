/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class548
extends Enum {
    public static final /* enum */ Class548 field2711;
    public static final /* enum */ Class548 field2712;
    public static final /* enum */ Class548 field2713;
    public static final /* enum */ Class548 field2714;
    public static final /* enum */ Class548 field2715;
    private static final Class548[] field2716;
    private static long[] field2717;

    private static Class548[] method11002() {
        Class548[] class548Array = new Class548[(int)field2717[3]];
        class548Array[(int)Class548.field2717[2]] = field2713;
        class548Array[(int)Class548.field2717[1]] = field2714;
        class548Array[(int)Class548.field2717[4]] = field2715;
        class548Array[(int)Class548.field2717[0]] = field2712;
        class548Array[(int)Class548.field2717[5]] = Class548.method11005();
        return class548Array;
    }

    private static String 5KLKwrOdQQndv8yd(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xA6B4030B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class548 method11003(String a2) {
        return Enum.valueOf(Class548.class, a2);
    }

    static {
        field2717 = new long[6];
        Class548.method11004(-791486727233278426L);
        field2713 = new Class548("LEGIT", (int)field2717[2]);
        field2714 = new Class548("RAGE", (int)field2717[1]);
        field2715 = new Class548("RAGE_STRICT", (int)field2717[4]);
        field2712 = new Class548("GRIM", (int)field2717[0]);
        field2711 = new Class548("OFF", (int)field2717[5]);
        field2716 = Class548.method11002();
    }

    public static Class548[] values() {
        return field2716;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class548() {
        void var2_-1;
        void var1_-1;
    }

    private static void method11004(long l2) {
        Class548.method11006(l2);
    }

    public static CallSite JxfL9NDDCWL1rCer(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class548.5KLKwrOdQQndv8yd(string7), Class548.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class548.5KLKwrOdQQndv8yd(string5)), Class548.5KLKwrOdQQndv8yd(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class548.5KLKwrOdQQndv8yd(string5)), Class548.5KLKwrOdQQndv8yd(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class548 method11005() {
        return field2711;
    }

    private static void method11006(long l2) {
        Class548.field2717[0] = l2 ^ 0xF5041303DAD2EE25L;
        Class548.field2717[2] = l2 ^ 0xF5041303DAD2EE26L;
        Class548.field2717[5] = l2 ^ 0xF5041303DAD2EE22L;
        Class548.field2717[1] = l2 ^ 0xF5041303DAD2EE27L;
        Class548.field2717[4] = l2 ^ 0xF5041303DAD2EE24L;
        Class548.field2717[3] = l2 ^ 0xF5041303DAD2EE23L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

