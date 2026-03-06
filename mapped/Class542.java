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
public final class Class542
extends Enum {
    private static final Class542[] field2684;
    public static final /* enum */ Class542 field2685;
    private static long[] field2686;
    public static final /* enum */ Class542 field2687;
    public static final /* enum */ Class542 field2688;

    public static Class542 method10976() {
        return field2688;
    }

    private static void method10977(long l2) {
        Class542.field2686[1] = l2 ^ 0x98AE47B7C9CA34A6L;
        Class542.field2686[2] = l2 ^ 0x98AE47B7C9CA34A4L;
        Class542.field2686[3] = l2 ^ 0x98AE47B7C9CA34A5L;
        Class542.field2686[0] = l2 ^ 0x98AE47B7C9CA34A7L;
    }

    public static CallSite dSO73AZnfgI7GGuu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class542.wOiGzALgi7jhV7Al(string7), Class542.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class542.wOiGzALgi7jhV7Al(string5)), Class542.wOiGzALgi7jhV7Al(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class542.wOiGzALgi7jhV7Al(string5)), Class542.wOiGzALgi7jhV7Al(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class542[] values() {
        return Class542.method10980();
    }

    static {
        field2686 = new long[4];
        Class542.method10977(-7444934279306791769L);
        field2685 = new Class542("FACTOR", (int)field2686[0]);
        field2688 = new Class542("FAST", (int)field2686[1]);
        field2687 = new Class542("SETBACK", (int)field2686[3]);
        field2684 = Class542.method10978();
    }

    private static Class542[] method10978() {
        Class542[] class542Array = new Class542[(int)field2686[2]];
        class542Array[(int)Class542.field2686[0]] = field2685;
        class542Array[(int)Class542.field2686[1]] = Class542.method10976();
        class542Array[(int)Class542.field2686[3]] = field2687;
        return class542Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class542() {
        void var2_-1;
        void var1_-1;
    }

    private static String wOiGzALgi7jhV7Al(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xFCA9EA18));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class542 method10979(String a2) {
        return Enum.valueOf(Class542.class, a2);
    }

    public static Class542[] method10980() {
        return field2684;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

