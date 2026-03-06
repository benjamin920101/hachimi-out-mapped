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
public final class Class538
extends Enum {
    private static final Class538[] field2661;
    public static final /* enum */ Class538 field2662;
    public static final /* enum */ Class538 field2663;
    public static final /* enum */ Class538 field2664;
    public static final /* enum */ Class538 field2665;
    public static final /* enum */ Class538 field2666;
    private static long[] field2667;

    public static Class538[] values() {
        return Class538.method10962();
    }

    public static Class538 method10959(String a2) {
        return Enum.valueOf(Class538.class, a2);
    }

    public static CallSite tvwTt7gOQrvuUAsg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class538.WbgAx1EEtj0wdu3L(string7), Class538.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class538.WbgAx1EEtj0wdu3L(string5)), Class538.WbgAx1EEtj0wdu3L(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class538.WbgAx1EEtj0wdu3L(string5)), Class538.WbgAx1EEtj0wdu3L(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String WbgAx1EEtj0wdu3L(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x27446AA2));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Class538[] method10960() {
        Class538[] class538Array = new Class538[(int)field2667[3]];
        class538Array[(int)Class538.field2667[1]] = field2665;
        class538Array[(int)Class538.field2667[4]] = field2664;
        class538Array[(int)Class538.field2667[2]] = field2663;
        class538Array[(int)Class538.field2667[5]] = field2666;
        class538Array[(int)Class538.field2667[0]] = field2662;
        return class538Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class538() {
        void var2_-1;
        void var1_-1;
    }

    private static void method10961(long l2) {
        Class538.method10963(l2);
    }

    static {
        field2667 = new long[6];
        Class538.method10961(921609772775263917L);
        field2665 = new Class538("ARMOR", (int)field2667[1]);
        field2664 = new Class538("SELECTOR", (int)field2667[4]);
        field2663 = new Class538("CONSOLE", (int)field2667[2]);
        field2666 = new Class538("OUT_OF_BOUNDS", (int)field2667[5]);
        field2662 = new Class538("UNICODE", (int)field2667[0]);
        field2661 = Class538.method10960();
    }

    public static Class538[] method10962() {
        return field2661;
    }

    private static void method10963(long l2) {
        Class538.field2667[1] = l2 ^ 0xCCA373497CC4EADL;
        Class538.field2667[2] = l2 ^ 0xCCA373497CC4EAFL;
        Class538.field2667[5] = l2 ^ 0xCCA373497CC4EAEL;
        Class538.field2667[4] = l2 ^ 0xCCA373497CC4EACL;
        Class538.field2667[3] = l2 ^ 0xCCA373497CC4EA8L;
        Class538.field2667[0] = l2 ^ 0xCCA373497CC4EA9L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

