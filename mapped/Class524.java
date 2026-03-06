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
final class Class524
extends Enum {
    public static final /* enum */ Class524 field2594;
    private static final Class524[] field2595;
    public static final /* enum */ Class524 field2596;
    private static long[] field2597;

    private static Class524[] method10876() {
        Class524[] class524Array = new Class524[(int)field2597[1]];
        class524Array[(int)Class524.field2597[0]] = field2596;
        class524Array[(int)Class524.field2597[2]] = field2594;
        return class524Array;
    }

    public static CallSite cnZKKxtaQMeDjwA2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class524.HwQw2OV6BWwzFtVm(string7), Class524.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class524.HwQw2OV6BWwzFtVm(string5)), Class524.HwQw2OV6BWwzFtVm(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class524.HwQw2OV6BWwzFtVm(string5)), Class524.HwQw2OV6BWwzFtVm(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class524 method10877(String a2) {
        return Enum.valueOf(Class524.class, a2);
    }

    private static String HwQw2OV6BWwzFtVm(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x17505ED3));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        field2597 = new long[3];
        Class524.method10878(7166148048243304066L);
        field2596 = new Class524("NORMAL", (int)field2597[0]);
        field2594 = new Class524("GRIM", (int)field2597[2]);
        field2595 = Class524.method10876();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class524() {
        void var2_-1;
        void var1_-1;
    }

    public static Class524[] values() {
        return field2595;
    }

    private static void method10878(long l2) {
        Class524.field2597[2] = l2 ^ 0x637345AE9766A683L;
        Class524.field2597[1] = l2 ^ 0x637345AE9766A680L;
        Class524.field2597[0] = l2 ^ 0x637345AE9766A682L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

