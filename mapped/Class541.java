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
public final class Class541
extends Enum {
    public static final /* enum */ Class541 field2678;
    public static final /* enum */ Class541 field2679;
    private static long[] field2680;
    private static final Class541[] field2681;
    public static final /* enum */ Class541 field2682;
    public static final /* enum */ Class541 field2683;

    public static CallSite g9aawSIkF9rfOG7r(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class541.JDfZC6n46CwBJt10(string7), Class541.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class541.JDfZC6n46CwBJt10(string5)), Class541.JDfZC6n46CwBJt10(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class541.JDfZC6n46CwBJt10(string5)), Class541.JDfZC6n46CwBJt10(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        field2680 = new long[5];
        Class541.method10972(3381200548263622630L);
        field2683 = new Class541("OFF", (int)field2680[3]);
        field2678 = new Class541("GRADIENT", (int)field2680[1]);
        field2679 = new Class541("GRADIENT_HUE", (int)field2680[0]);
        field2682 = new Class541("STATIC_HUE", (int)field2680[2]);
        field2681 = Class541.method10973();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class541() {
        void var2_-1;
        void var1_-1;
    }

    private static void method10972(long l2) {
        Class541.field2680[1] = l2 ^ 0x2EEC6FFBF99BF7E7L;
        Class541.field2680[4] = l2 ^ 0x2EEC6FFBF99BF7E2L;
        Class541.field2680[2] = l2 ^ 0x2EEC6FFBF99BF7E5L;
        Class541.field2680[3] = l2 ^ 0x2EEC6FFBF99BF7E6L;
        Class541.field2680[0] = l2 ^ 0x2EEC6FFBF99BF7E4L;
    }

    private static String JDfZC6n46CwBJt10(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xF3A0D273));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class541[] values() {
        return field2681;
    }

    private static Class541[] method10973() {
        Class541[] class541Array = new Class541[(int)field2680[4]];
        class541Array[(int)Class541.field2680[3]] = field2683;
        class541Array[(int)Class541.field2680[1]] = field2678;
        class541Array[(int)Class541.field2680[0]] = field2679;
        class541Array[(int)Class541.field2680[2]] = Class541.method10974();
        return class541Array;
    }

    public static Class541 method10974() {
        return field2682;
    }

    public static Class541 method10975(String a2) {
        return Enum.valueOf(Class541.class, a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

