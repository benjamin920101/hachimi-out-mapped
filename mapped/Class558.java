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
final class Class558
extends Enum {
    private static final Class558[] field2764;
    public static final /* enum */ Class558 field2765;
    public static final /* enum */ Class558 field2766;
    private static long[] field2767;

    private static Class558[] method11047() {
        Class558[] class558Array = new Class558[(int)field2767[0]];
        class558Array[(int)Class558.field2767[1]] = field2766;
        class558Array[(int)Class558.field2767[2]] = field2765;
        return class558Array;
    }

    public static CallSite mVpevfQQFZ0weyU6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class558.4BWrKZPh6CaAbwAz(string7), Class558.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class558.4BWrKZPh6CaAbwAz(string5)), Class558.4BWrKZPh6CaAbwAz(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class558.4BWrKZPh6CaAbwAz(string5)), Class558.4BWrKZPh6CaAbwAz(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String 4BWrKZPh6CaAbwAz(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xC679A7B2));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        field2767 = new long[3];
        Class558.method11048(-3644116944572939627L);
        field2766 = new Class558("VANILLA", (int)field2767[1]);
        field2765 = new Class558("NORMAL", (int)field2767[2]);
        field2764 = Class558.method11047();
    }

    private static void method11048(long l2) {
        Class558.field2767[1] = l2 ^ 0xCD6D7EF23EBF8295L;
        Class558.field2767[2] = l2 ^ 0xCD6D7EF23EBF8294L;
        Class558.field2767[0] = l2 ^ 0xCD6D7EF23EBF8297L;
    }

    public static Class558[] values() {
        return field2764;
    }

    public static Class558 method11049(String a2) {
        return Enum.valueOf(Class558.class, a2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class558() {
        void var2_-1;
        void var1_-1;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

