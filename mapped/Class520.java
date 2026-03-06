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
public final class Class520
extends Enum {
    public static final /* enum */ Class520 field2569;
    private static final Class520[] field2570;
    public static final /* enum */ Class520 field2571;
    private static long[] field2572;
    public static final /* enum */ Class520 field2573;

    private static String NLwFBYE7IO3SL9qU(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x4583A904));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Class520[] method10836() {
        Class520[] class520Array = new Class520[(int)field2572[3]];
        class520Array[(int)Class520.field2572[2]] = field2569;
        class520Array[(int)Class520.field2572[1]] = field2571;
        class520Array[(int)Class520.field2572[0]] = field2573;
        return class520Array;
    }

    public static Class520[] values() {
        return field2570;
    }

    private static void method10837(long l2) {
        Class520.field2572[1] = l2 ^ 0x685969CE799B2E86L;
        Class520.field2572[0] = l2 ^ 0x685969CE799B2E85L;
        Class520.field2572[2] = l2 ^ 0x685969CE799B2E87L;
        Class520.field2572[3] = l2 ^ 0x685969CE799B2E84L;
    }

    public static CallSite 6NwcJxIi0VNpny2C(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class520.NLwFBYE7IO3SL9qU(string7), Class520.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class520.NLwFBYE7IO3SL9qU(string5)), Class520.NLwFBYE7IO3SL9qU(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class520.NLwFBYE7IO3SL9qU(string5)), Class520.NLwFBYE7IO3SL9qU(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class520() {
        void var2_-1;
        void var1_-1;
    }

    private static Class520[] method10838() {
        return Class520.method10836();
    }

    public static Class520 method10839(String a2) {
        return Enum.valueOf(Class520.class, a2);
    }

    static {
        field2572 = new long[4];
        Class520.method10837(7519157388396146311L);
        field2569 = new Class520("MOVE", (int)field2572[2]);
        field2571 = new Class520("HIDE", (int)field2572[1]);
        field2573 = new Class520("KEEP", (int)field2572[0]);
        field2570 = Class520.method10838();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

