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
public final class Class555
extends Enum {
    private static long[] field2747 = new long[3];
    public static final /* enum */ Class555 field2748;
    private static final Class555[] field2749;
    public static final /* enum */ Class555 field2750;

    public static CallSite 5BoZngVN3NfoQSQv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class555.vbiR1vfA4c3SuW9O(string7), Class555.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class555.vbiR1vfA4c3SuW9O(string5)), Class555.vbiR1vfA4c3SuW9O(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class555.vbiR1vfA4c3SuW9O(string5)), Class555.vbiR1vfA4c3SuW9O(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class555 method11035(String a2) {
        return Enum.valueOf(Class555.class, a2);
    }

    private static void method11036(long l2) {
        Class555.field2747[2] = l2 ^ 0x8C3D07C87A16982AL;
        Class555.field2747[1] = l2 ^ 0x8C3D07C87A16982BL;
        Class555.field2747[0] = l2 ^ 0x8C3D07C87A169829L;
    }

    public static Class555[] values() {
        return field2749;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class555() {
        void var2_-1;
        void var1_-1;
    }

    private static Class555[] method11037() {
        Class555[] class555Array = new Class555[(int)field2747[0]];
        class555Array[(int)Class555.field2747[1]] = field2748;
        class555Array[(int)Class555.field2747[2]] = field2750;
        return class555Array;
    }

    static {
        Class555.method11036(-8341502377197135829L);
        field2748 = new Class555("LENGTH", (int)field2747[1]);
        field2750 = new Class555("ALPHABETICAL", (int)field2747[2]);
        field2749 = Class555.method11037();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String vbiR1vfA4c3SuW9O(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        block4: while (true) {
            int n3 = n2 < string.length() ? 43154 : 43153;
            block5: while (true) {
                switch (n3) {
                    default: {
                        stringBuilder.append((char)(string.charAt(n2) ^ 0x3D2D5066));
                        ++n2;
                        continue block4;
                    }
                    case 43154: {
                        n3 = 43152;
                        continue block5;
                    }
                    case 43153: 
                }
                break;
            }
            break;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

