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
public final class Class519
extends Enum {
    public static final /* enum */ Class519 field2564;
    private static final Class519[] field2565;
    public static final /* enum */ Class519 field2566;
    private static long[] field2567;
    public static final /* enum */ Class519 field2568;

    private static void method10831(long l2) {
        Class519.method10833(l2);
    }

    public static Class519 method10832(String a2) {
        return Enum.valueOf(Class519.class, a2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class519() {
        void var2_-1;
        void var1_-1;
    }

    public static CallSite lGC2w65TJiBOjOrl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class519.jO3U9QAHhQnKgKAO(string7), Class519.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class519.jO3U9QAHhQnKgKAO(string5)), Class519.jO3U9QAHhQnKgKAO(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class519.jO3U9QAHhQnKgKAO(string5)), Class519.jO3U9QAHhQnKgKAO(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String jO3U9QAHhQnKgKAO(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xC5F2BCC6));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10833(long l2) {
        Class519.field2567[0] = l2 ^ 0x5D6569F1E2D956AEL;
        Class519.field2567[1] = l2 ^ 0x5D6569F1E2D956ACL;
        Class519.field2567[3] = l2 ^ 0x5D6569F1E2D956AFL;
        Class519.field2567[2] = l2 ^ 0x5D6569F1E2D956ADL;
    }

    static {
        field2567 = new long[4];
        Class519.method10831(6729901705789003436L);
        field2568 = new Class519("NORMAL", (int)field2567[1]);
        field2566 = new Class519("PACKET", (int)field2567[2]);
        field2564 = new Class519("OFF", (int)field2567[0]);
        field2565 = Class519.method10835();
    }

    public static Class519[] values() {
        return Class519.method10834();
    }

    public static Class519[] method10834() {
        return field2565;
    }

    private static Class519[] method10835() {
        Class519[] class519Array = new Class519[(int)field2567[3]];
        class519Array[(int)Class519.field2567[1]] = field2568;
        class519Array[(int)Class519.field2567[2]] = field2566;
        class519Array[(int)Class519.field2567[0]] = field2564;
        return class519Array;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

