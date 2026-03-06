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
final class Class485
extends Enum {
    public static final /* enum */ Class485 field2513;
    private static long[] field2514;
    public static final /* enum */ Class485 field2515;
    private static final Class485[] field2516;
    public static final /* enum */ Class485 field2517;

    public static Class485[] values() {
        return field2516;
    }

    static {
        field2514 = new long[4];
        Class485.method10789(2496659237363184191L);
        field2517 = new Class485("Fade", (int)field2514[1]);
        field2513 = new Class485("Shrink", (int)field2514[3]);
        field2515 = new Class485("Both", (int)field2514[0]);
        field2516 = Class485.method10788();
    }

    public static CallSite 39XL42xVw6nvBUL0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class485.JOo2ozlVXJjRdI3h(string7), Class485.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class485.JOo2ozlVXJjRdI3h(string5)), Class485.JOo2ozlVXJjRdI3h(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class485.JOo2ozlVXJjRdI3h(string5)), Class485.JOo2ozlVXJjRdI3h(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String JOo2ozlVXJjRdI3h(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x7BF38FAD));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class485 method10787(String a2) {
        return Enum.valueOf(Class485.class, a2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class485() {
        void var2_-1;
        void var1_-1;
    }

    private static Class485[] method10788() {
        Class485[] class485Array = new Class485[(int)field2514[2]];
        class485Array[(int)Class485.field2514[1]] = field2517;
        class485Array[(int)Class485.field2514[3]] = field2513;
        class485Array[(int)Class485.field2514[0]] = field2515;
        return class485Array;
    }

    private static void method10789(long l2) {
        Class485.field2514[2] = l2 ^ 0x22A5EA59383AF23CL;
        Class485.field2514[3] = l2 ^ 0x22A5EA59383AF23EL;
        Class485.field2514[1] = l2 ^ 0x22A5EA59383AF23FL;
        Class485.field2514[0] = l2 ^ 0x22A5EA59383AF23DL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

