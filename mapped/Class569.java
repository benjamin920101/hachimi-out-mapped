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
final class Class569
extends Enum {
    private static final Class569[] field2782;
    private static long[] field2783;
    public static final /* enum */ Class569 field2784;
    public static final /* enum */ Class569 field2785;
    public static final /* enum */ Class569 field2786;
    public static final /* enum */ Class569 field2787;

    public static CallSite Xt62rtdOqyNV24Ng(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class569.1DQTY3LTqeWgmPjC(string7), Class569.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class569.1DQTY3LTqeWgmPjC(string5)), Class569.1DQTY3LTqeWgmPjC(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class569.1DQTY3LTqeWgmPjC(string5)), Class569.1DQTY3LTqeWgmPjC(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method11074(long l2) {
        Class569.field2783[3] = l2 ^ 0x90828090F2514534L;
        Class569.field2783[0] = l2 ^ 0x90828090F2514537L;
        Class569.field2783[4] = l2 ^ 0x90828090F2514531L;
        Class569.field2783[1] = l2 ^ 0x90828090F2514536L;
        Class569.field2783[2] = l2 ^ 0x90828090F2514535L;
    }

    private static String 1DQTY3LTqeWgmPjC(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x3E4D2D2A));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        field2783 = new long[5];
        Class569.method11074(-8033717425246485195L);
        field2784 = new Class569("GRIM", (int)field2783[2]);
        field2785 = new Class569("GRIM_TRIDENT", (int)field2783[3]);
        field2787 = new Class569("GRIM_FIREWORK", (int)field2783[0]);
        field2786 = new Class569("GRIM_OVERFLOW", (int)field2783[1]);
        field2782 = Class569.method11075();
    }

    public static Class569[] values() {
        return field2782;
    }

    private static Class569[] method11075() {
        Class569[] class569Array = new Class569[(int)field2783[4]];
        class569Array[(int)Class569.field2783[2]] = field2784;
        class569Array[(int)Class569.field2783[3]] = field2785;
        class569Array[(int)Class569.field2783[0]] = Class569.method11076();
        class569Array[(int)Class569.field2783[1]] = field2786;
        return class569Array;
    }

    public static Class569 method11076() {
        return field2787;
    }

    public static Class569 method11077(String a2) {
        return Enum.valueOf(Class569.class, a2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class569() {
        void var2_-1;
        void var1_-1;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

