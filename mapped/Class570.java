/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class5433;
import mapped.Class5659;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class570
extends Enum {
    private static final Class570[] field2788;
    public static final /* enum */ Class570 field2789;
    private static long[] field2790;
    public static final /* enum */ Class570 field2791;
    public static final /* enum */ Class570 field2792;

    public static Class570 method11078(String a2) {
        return Enum.valueOf(Class570.class, a2);
    }

    private static void method11079(long l2) {
        Class570.method11080(l2);
    }

    private static void method11080(long l2) {
        Class570.field2790[0] = l2 ^ 0xD5AE07D0FA8DC1L;
        Class570.field2790[1] = l2 ^ 0xD5AE07D0FA8DC0L;
        Class570.field2790[2] = l2 ^ 0xD5AE07D0FA8DC2L;
        Class570.field2790[3] = l2 ^ 0xD5AE07D0FA8DC3L;
    }

    public static Class570 method11081() {
        return field2792;
    }

    private static Class570[] method11082() {
        Class570[] class570Array = new Class570[(int)field2790[3]];
        class570Array[(int)Class570.field2790[1]] = field2791;
        class570Array[(int)Class570.field2790[0]] = field2789;
        class570Array[(int)Class570.field2790[2]] = field2792;
        return class570Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class570() {
        void var2_-1;
        void var1_-1;
    }

    public static CallSite A0KVYQ9Fy1rIbfoj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class570.53dBvdx6wk7B2qa4(string7), Class570.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class570.53dBvdx6wk7B2qa4(string5)), Class570.53dBvdx6wk7B2qa4(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class570.53dBvdx6wk7B2qa4(string5)), Class570.53dBvdx6wk7B2qa4(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static boolean method11083(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static Class570[] method11084() {
        return Class570.method11088();
    }

    public boolean method11085() {
        block3: {
            block2: {
                if (this == field2789) break block2;
                if (this != Class570.method11081()) break block3;
            }
            int n2 = (int)field2790[0];
            return Class570.method11086(0.997302598882565, 0.1965118681519823, Class5433.field10133, 0.9667340248696878);
        }
        return (int)field2790[1] != 0;
    }

    private static String 53dBvdx6wk7B2qa4(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x20424229));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static boolean method11086(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    static {
        field2790 = new long[4];
        Class570.method11079(60145518633455040L);
        field2791 = new Class570("Lines", (int)field2790[1]);
        field2789 = new Class570("Sides", (int)field2790[0]);
        field2792 = new Class570("Both", (int)field2790[2]);
        field2788 = Class570.method11082();
    }

    public static Class570[] values() {
        return Class570.method11084();
    }

    public boolean method11087() {
        return (this == field2791 || this == field2792 ? (int)field2790[0] : (int)field2790[1]) != 0;
    }

    public static Class570[] method11088() {
        return field2788;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

