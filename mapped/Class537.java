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
public final class Class537
extends Enum {
    private static long[] field2655 = new long[5];
    public static final /* enum */ Class537 field2656;
    private static final Class537[] field2657;
    public static final /* enum */ Class537 field2658;
    public static final /* enum */ Class537 field2659;
    public static final /* enum */ Class537 field2660;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class537() {
        void var2_-1;
        void var1_-1;
    }

    private static Class537[] method10954() {
        Class537[] class537Array = new Class537[(int)field2655[0]];
        class537Array[(int)Class537.field2655[1]] = field2659;
        class537Array[(int)Class537.field2655[4]] = field2660;
        class537Array[(int)Class537.field2655[3]] = Class537.method10955();
        class537Array[(int)Class537.field2655[2]] = field2656;
        return class537Array;
    }

    private static Class537 method10955() {
        return Class537.method10957();
    }

    public static Class537 method10956(String a2) {
        return Enum.valueOf(Class537.class, a2);
    }

    static {
        Class537.method10958(5532820697017160183L);
        field2659 = new Class537("OBSIDIAN", (int)field2655[1]);
        field2660 = new Class537("OBSIDIAN_BEDROCK", (int)field2655[4]);
        field2658 = new Class537("BEDROCK", (int)field2655[3]);
        field2656 = new Class537("VOID", (int)field2655[2]);
        field2657 = Class537.method10954();
    }

    private static String 1T6ANOASwMbx4JZ1(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x4B521674));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite Ocv6iEWnHr3TT6ZZ(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class537.1T6ANOASwMbx4JZ1(string7), Class537.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class537.1T6ANOASwMbx4JZ1(string5)), Class537.1T6ANOASwMbx4JZ1(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class537.1T6ANOASwMbx4JZ1(string5)), Class537.1T6ANOASwMbx4JZ1(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class537 method10957() {
        return field2658;
    }

    private static void method10958(long l2) {
        Class537.field2655[0] = l2 ^ 0x4CC8871C1BA311F3L;
        Class537.field2655[3] = l2 ^ 0x4CC8871C1BA311F5L;
        Class537.field2655[4] = l2 ^ 0x4CC8871C1BA311F6L;
        Class537.field2655[2] = l2 ^ 0x4CC8871C1BA311F4L;
        Class537.field2655[1] = l2 ^ 0x4CC8871C1BA311F7L;
    }

    public static Class537[] values() {
        return field2657;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

