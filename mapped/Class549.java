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
public final class Class549
extends Enum {
    public static final /* enum */ Class549 field2718;
    private static long[] field2719;
    public static final /* enum */ Class549 field2720;
    public static final /* enum */ Class549 field2721;
    private static final Class549[] field2722;

    public static Class549 method11007() {
        return field2721;
    }

    public static CallSite bf0rp5C2mF7aYhKa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class549.YANoyQgjTtiFWGBk(string7), Class549.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class549.YANoyQgjTtiFWGBk(string5)), Class549.YANoyQgjTtiFWGBk(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class549.YANoyQgjTtiFWGBk(string5)), Class549.YANoyQgjTtiFWGBk(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String YANoyQgjTtiFWGBk(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xE3361222));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        field2719 = new long[4];
        Class549.method11008(196146871124229306L);
        field2721 = new Class549("Always", (int)field2719[2]);
        field2720 = new Class549("Mining", (int)field2719[0]);
        field2718 = new Class549("Disable", (int)field2719[3]);
        field2722 = Class549.method11010();
    }

    private static void method11008(long l2) {
        Class549.field2719[0] = l2 ^ 0x2B8DA8A4129FCBBL;
        Class549.field2719[3] = l2 ^ 0x2B8DA8A4129FCB8L;
        Class549.field2719[1] = l2 ^ 0x2B8DA8A4129FCB9L;
        Class549.field2719[2] = l2 ^ 0x2B8DA8A4129FCBAL;
    }

    public static Class549[] values() {
        return field2722;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class549() {
        void var2_-1;
        void var1_-1;
    }

    public static Class549 method11009(String a2) {
        return Enum.valueOf(Class549.class, a2);
    }

    private static Class549[] method11010() {
        Class549[] class549Array = new Class549[(int)field2719[1]];
        class549Array[(int)Class549.field2719[2]] = Class549.method11007();
        class549Array[(int)Class549.field2719[0]] = field2720;
        class549Array[(int)Class549.field2719[3]] = field2718;
        return class549Array;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

