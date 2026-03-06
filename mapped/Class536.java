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
public final class Class536
extends Enum {
    public static final /* enum */ Class536 field2651;
    private static final Class536[] field2652;
    public static final /* enum */ Class536 field2653;
    private static long[] field2654;

    public static Class536 method10951(String a2) {
        return Enum.valueOf(Class536.class, a2);
    }

    private static void method10952(long l2) {
        Class536.field2654[0] = l2 ^ 0x2ECA0C3AF4C56148L;
        Class536.field2654[2] = l2 ^ 0x2ECA0C3AF4C5614AL;
        Class536.field2654[1] = l2 ^ 0x2ECA0C3AF4C5614BL;
    }

    static {
        field2654 = new long[3];
        Class536.method10952(3371520718394450250L);
        field2653 = new Class536("None", (int)field2654[2]);
        field2651 = new Class536("Bypass", (int)field2654[1]);
        field2652 = Class536.method10953();
    }

    public static CallSite bSjW5cOplQiAAGSa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class536.nprPtfFLQLA1QWFo(string7), Class536.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class536.nprPtfFLQLA1QWFo(string5)), Class536.nprPtfFLQLA1QWFo(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class536.nprPtfFLQLA1QWFo(string5)), Class536.nprPtfFLQLA1QWFo(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class536[] values() {
        return field2652;
    }

    private static String nprPtfFLQLA1QWFo(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x20886DB1));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Class536[] method10953() {
        Class536[] class536Array = new Class536[(int)field2654[0]];
        class536Array[(int)Class536.field2654[2]] = field2653;
        class536Array[(int)Class536.field2654[1]] = field2651;
        return class536Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class536() {
        void var2_-1;
        void var1_-1;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

