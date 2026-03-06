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
public final class Class554
extends Enum {
    public static final /* enum */ Class554 field2742;
    public static final /* enum */ Class554 field2743;
    public static final /* enum */ Class554 field2744;
    private static long[] field2745;
    private static final Class554[] field2746;

    public static Class554[] method11029() {
        return field2746;
    }

    private static Class554[] method11030() {
        return Class554.method11032();
    }

    public static Class554 method11031(String a2) {
        return Enum.valueOf(Class554.class, a2);
    }

    public static CallSite GjIxOoYdYIxgfLL3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class554.ePVgavjoBGEutNQn(string7), Class554.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class554.ePVgavjoBGEutNQn(string5)), Class554.ePVgavjoBGEutNQn(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class554.ePVgavjoBGEutNQn(string5)), Class554.ePVgavjoBGEutNQn(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class554() {
        void var2_-1;
        void var1_-1;
    }

    private static Class554[] method11032() {
        Class554[] class554Array = new Class554[(int)field2745[1]];
        class554Array[(int)Class554.field2745[3]] = field2742;
        class554Array[(int)Class554.field2745[0]] = Class554.method11034();
        class554Array[(int)Class554.field2745[2]] = field2744;
        return class554Array;
    }

    public static Class554[] values() {
        return Class554.method11029();
    }

    private static void method11033(long l2) {
        Class554.field2745[0] = l2 ^ 0x231D5B77656E604FL;
        Class554.field2745[3] = l2 ^ 0x231D5B77656E604EL;
        Class554.field2745[1] = l2 ^ 0x231D5B77656E604DL;
        Class554.field2745[2] = l2 ^ 0x231D5B77656E604CL;
    }

    static {
        field2745 = new long[4];
        Class554.method11033(2530279134013055054L);
        field2742 = new Class554("Disabler", (int)field2745[3]);
        field2743 = new Class554("Delay", (int)field2745[0]);
        field2744 = new Class554("None", (int)field2745[2]);
        field2746 = Class554.method11030();
    }

    public static Class554 method11034() {
        return field2743;
    }

    private static String ePVgavjoBGEutNQn(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x63604A40));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

