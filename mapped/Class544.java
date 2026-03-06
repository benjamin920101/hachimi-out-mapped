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
public final class Class544
extends Enum {
    public static final /* enum */ Class544 field2693;
    public static final /* enum */ Class544 field2694;
    public static final /* enum */ Class544 field2695;
    private static final Class544[] field2696;
    private static long[] field2697;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class544() {
        void var2_-1;
        void var1_-1;
    }

    private static Class544[] method10984() {
        return Class544.method10986();
    }

    public static Class544[] values() {
        return field2696;
    }

    private static String BQaNtJWAVGa9JWBr(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x4065186B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10985(long l2) {
        Class544.field2697[1] = l2 ^ 0xB3B260C1B45D30D3L;
        Class544.field2697[0] = l2 ^ 0xB3B260C1B45D30D1L;
        Class544.field2697[2] = l2 ^ 0xB3B260C1B45D30D0L;
        Class544.field2697[3] = l2 ^ 0xB3B260C1B45D30D2L;
    }

    private static Class544[] method10986() {
        Class544[] class544Array = new Class544[(int)field2697[2]];
        class544Array[(int)Class544.field2697[1]] = Class544.method10987();
        class544Array[(int)Class544.field2697[3]] = field2695;
        class544Array[(int)Class544.field2697[0]] = field2693;
        return class544Array;
    }

    static {
        field2697 = new long[4];
        Class544.method10985(-5498225809994993453L);
        field2694 = new Class544("WHITELIST", (int)field2697[1]);
        field2695 = new Class544("BLACKLIST", (int)field2697[3]);
        field2693 = new Class544("ALL", (int)field2697[0]);
        field2696 = Class544.method10984();
    }

    public static CallSite X36LSZITgPwyTjee(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class544.BQaNtJWAVGa9JWBr(string7), Class544.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class544.BQaNtJWAVGa9JWBr(string5)), Class544.BQaNtJWAVGa9JWBr(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class544.BQaNtJWAVGa9JWBr(string5)), Class544.BQaNtJWAVGa9JWBr(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class544 method10987() {
        return field2694;
    }

    public static Class544 method10988(String a2) {
        return Enum.valueOf(Class544.class, a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

