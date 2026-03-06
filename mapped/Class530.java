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
public final class Class530
extends Enum {
    private static final Class530[] field2629;
    public static final /* enum */ Class530 field2630;
    private static long[] field2631;
    public static final /* enum */ Class530 field2632;

    public static Class530[] values() {
        return field2629;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class530() {
        void var2_-1;
        void var1_-1;
    }

    private static String dHgYw7QCb4Kqt2Sv(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x251B4FE6));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10934(long l2) {
        Class530.field2631[1] = l2 ^ 0x57AF99A68B2E2509L;
        Class530.field2631[0] = l2 ^ 0x57AF99A68B2E2508L;
        Class530.field2631[2] = l2 ^ 0x57AF99A68B2E250AL;
    }

    private static Class530[] method10935() {
        return Class530.method10937();
    }

    public static Class530 method10936(String a2) {
        return Enum.valueOf(Class530.class, a2);
    }

    public static CallSite yALnsrneZ85D1Ewj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class530.dHgYw7QCb4Kqt2Sv(string7), Class530.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class530.dHgYw7QCb4Kqt2Sv(string5)), Class530.dHgYw7QCb4Kqt2Sv(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class530.dHgYw7QCb4Kqt2Sv(string5)), Class530.dHgYw7QCb4Kqt2Sv(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Class530[] method10937() {
        Class530[] class530Array = new Class530[(int)field2631[2]];
        class530Array[(int)Class530.field2631[0]] = field2630;
        class530Array[(int)Class530.field2631[1]] = field2632;
        return class530Array;
    }

    static {
        field2631 = new long[3];
        Class530.method10934(6318437742802773256L);
        field2630 = new Class530("IGNORE", (int)field2631[0]);
        field2632 = new Class530("TARGET", (int)field2631[1]);
        field2629 = Class530.method10935();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

