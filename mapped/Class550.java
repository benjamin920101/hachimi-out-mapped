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
public final class Class550
extends Enum {
    public static final /* enum */ Class550 field2723;
    public static final /* enum */ Class550 field2724;
    public static final /* enum */ Class550 field2725;
    private static final Class550[] field2726;
    private static long[] field2727;

    private static String 93YJKAzOGrwL900b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x4CD5FD03));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class550 method11011(String a2) {
        return Enum.valueOf(Class550.class, a2);
    }

    private static void method11012(long l2) {
        Class550.method11014(l2);
    }

    public static CallSite TqFafX2JqpoRsLTV(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class550.93YJKAzOGrwL900b(string7), Class550.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class550.93YJKAzOGrwL900b(string5)), Class550.93YJKAzOGrwL900b(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class550.93YJKAzOGrwL900b(string5)), Class550.93YJKAzOGrwL900b(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        field2727 = new long[4];
        Class550.method11012(-2317640091884200877L);
        field2725 = new Class550("K_M_H", (int)field2727[1]);
        field2723 = new Class550("B_P_S", (int)field2727[2]);
        field2724 = new Class550("OFF", (int)field2727[3]);
        field2726 = Class550.method11015();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class550() {
        void var2_-1;
        void var1_-1;
    }

    public static Class550 method11013() {
        return field2725;
    }

    public static Class550[] values() {
        return field2726;
    }

    private static void method11014(long l2) {
        Class550.field2727[1] = l2 ^ 0xDFD6169DA609DC53L;
        Class550.field2727[3] = l2 ^ 0xDFD6169DA609DC51L;
        Class550.field2727[2] = l2 ^ 0xDFD6169DA609DC52L;
        Class550.field2727[0] = l2 ^ 0xDFD6169DA609DC50L;
    }

    private static Class550[] method11015() {
        Class550[] class550Array = new Class550[(int)field2727[0]];
        class550Array[(int)Class550.field2727[1]] = Class550.method11013();
        class550Array[(int)Class550.field2727[2]] = field2723;
        class550Array[(int)Class550.field2727[3]] = field2724;
        return class550Array;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

