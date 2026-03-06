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
final class Class476
extends Enum {
    public static final /* enum */ Class476 field2488;
    private static final Class476[] field2489;
    public static final /* enum */ Class476 field2490;
    private static long[] field2491;

    private static void method10751(long l2) {
        Class476.method10752(l2);
    }

    private static String FtdkIq2E0GVwPcrn(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x23E1A96D));
            ++n2;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class476() {
        void var2_-1;
        void var1_-1;
    }

    static {
        field2491 = new long[3];
        Class476.method10751(6828884251226350152L);
        field2488 = new Class476("NETHERITE", (int)field2491[2]);
        field2490 = new Class476("DIAMOND", (int)field2491[1]);
        field2489 = Class476.method10755();
    }

    private static void method10752(long l2) {
        Class476.field2491[1] = l2 ^ 0x5EC5120BA69B2249L;
        Class476.field2491[2] = l2 ^ 0x5EC5120BA69B2248L;
        Class476.field2491[0] = l2 ^ 0x5EC5120BA69B224AL;
    }

    private static Class476[] method10753() {
        Class476[] class476Array = new Class476[(int)field2491[0]];
        class476Array[(int)Class476.field2491[2]] = field2488;
        class476Array[(int)Class476.field2491[1]] = field2490;
        return class476Array;
    }

    public static Class476 method10754(String a2) {
        return Enum.valueOf(Class476.class, a2);
    }

    private static Class476[] method10755() {
        return Class476.method10753();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite sBViVWrzAjnsBZPF(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class476.FtdkIq2E0GVwPcrn(string7), Class476.class.getClassLoader());
        try {
            int n4 = n3 != 1 ? 42858 : 42857;
            block6: while (true) {
                switch (n4) {
                    case 42858: {
                        n4 = 42856;
                        continue block6;
                    }
                    case 42857: {
                        return new ConstantCallSite(lookup.findVirtual(Class.forName(Class476.FtdkIq2E0GVwPcrn(string5)), Class476.FtdkIq2E0GVwPcrn(string6), methodType2).asType(methodType));
                    }
                }
                break;
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class476.FtdkIq2E0GVwPcrn(string5)), Class476.FtdkIq2E0GVwPcrn(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class476[] values() {
        return field2489;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

