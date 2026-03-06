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
final class Class557
extends Enum {
    private static long[] field2760 = new long[3];
    private static final Class557[] field2761;
    public static final /* enum */ Class557 field2762;
    public static final /* enum */ Class557 field2763;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class557() {
        void var2_-1;
        void var1_-1;
    }

    public static Class557[] values() {
        return field2761;
    }

    public static CallSite LKnAv9Rk8VOBPWbY(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class557.U1lSgUI5GAIfFJ4Q(string7), Class557.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class557.U1lSgUI5GAIfFJ4Q(string5)), Class557.U1lSgUI5GAIfFJ4Q(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class557.U1lSgUI5GAIfFJ4Q(string5)), Class557.U1lSgUI5GAIfFJ4Q(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Class557[] method11042() {
        Class557[] class557Array = new Class557[(int)field2760[1]];
        class557Array[(int)Class557.field2760[2]] = Class557.method11044();
        class557Array[(int)Class557.field2760[0]] = field2762;
        return class557Array;
    }

    public static Class557 method11043(String a2) {
        return Enum.valueOf(Class557.class, a2);
    }

    static {
        Class557.method11045(-1131802117308091769L);
        field2763 = new Class557("NORMAL", (int)field2760[2]);
        field2762 = new Class557("GREATEST", (int)field2760[0]);
        field2761 = Class557.method11042();
    }

    private static String U1lSgUI5GAIfFJ4Q(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xBF42708C));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Class557 method11044() {
        return Class557.method11046();
    }

    private static void method11045(long l2) {
        Class557.field2760[0] = l2 ^ 0xF04B07F889D0F286L;
        Class557.field2760[2] = l2 ^ 0xF04B07F889D0F287L;
        Class557.field2760[1] = l2 ^ 0xF04B07F889D0F285L;
    }

    public static Class557 method11046() {
        return field2763;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

