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
public final class Class526
extends Enum {
    public static final /* enum */ Class526 field2606;
    private static long[] field2607;
    public static final /* enum */ Class526 field2608;
    public static final /* enum */ Class526 field2609;
    private static final Class526[] field2610;
    public static final /* enum */ Class526 field2611;
    public static final /* enum */ Class526 field2612;

    public static Class526[] values() {
        return field2610;
    }

    public static CallSite 6td0glNHAoFSZeyy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class526.A9npZMnsr2rL6aQA(string7), Class526.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class526.A9npZMnsr2rL6aQA(string5)), Class526.A9npZMnsr2rL6aQA(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class526.A9npZMnsr2rL6aQA(string5)), Class526.A9npZMnsr2rL6aQA(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        field2607 = new long[6];
        Class526.method10917(-1456142303138642103L);
        field2606 = new Class526("NORMAL", (int)field2607[4]);
        field2608 = new Class526("SAND", (int)field2607[5]);
        field2612 = new Class526("CLIMB", (int)field2607[0]);
        field2611 = new Class526("PEARL", (int)field2607[1]);
        field2609 = new Class526("CLIP", (int)field2607[2]);
        field2610 = Class526.method10916();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class526() {
        void var2_-1;
        void var1_-1;
    }

    private static Class526[] method10916() {
        Class526[] class526Array = new Class526[(int)field2607[3]];
        class526Array[(int)Class526.field2607[4]] = field2606;
        class526Array[(int)Class526.field2607[5]] = field2608;
        class526Array[(int)Class526.field2607[0]] = Class526.method10919();
        class526Array[(int)Class526.field2607[1]] = field2611;
        class526Array[(int)Class526.field2607[2]] = field2609;
        return class526Array;
    }

    private static void method10917(long l2) {
        Class526.field2607[0] = l2 ^ 0xEBCABE4A4F00874BL;
        Class526.field2607[2] = l2 ^ 0xEBCABE4A4F00874DL;
        Class526.field2607[3] = l2 ^ 0xEBCABE4A4F00874CL;
        Class526.field2607[4] = l2 ^ 0xEBCABE4A4F008749L;
        Class526.field2607[5] = l2 ^ 0xEBCABE4A4F008748L;
        Class526.field2607[1] = l2 ^ 0xEBCABE4A4F00874AL;
    }

    public static Class526 method10918(String a2) {
        return Enum.valueOf(Class526.class, a2);
    }

    private static String A9npZMnsr2rL6aQA(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xC289FB86));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class526 method10919() {
        return field2612;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

