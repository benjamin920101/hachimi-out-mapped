/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  net.minecraft.class_5321
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class4045;
import mapped.Class4122;
import net.minecraft.class_1937;
import net.minecraft.class_5321;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5550 {
    private static long[] field10503 = new long[3];

    public static CallSite bXGw7EHRQLYdar11(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class5550.GYATBN4LFOqjbaoA(string7), Class5550.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class5550.GYATBN4LFOqjbaoA(string5)), Class5550.GYATBN4LFOqjbaoA(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class5550.GYATBN4LFOqjbaoA(string5)), Class5550.GYATBN4LFOqjbaoA(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method21883(long l2) {
        Class5550.field10503[2] = l2 ^ 0xFA213758369F4BCL;
        Class5550.field10503[1] = l2 ^ 0xF05DEC8A7C960B42L;
        Class5550.field10503[0] = l2 ^ 0xF05DEC8A7C960B43L;
    }

    private static String GYATBN4LFOqjbaoA(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xFC51A920));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static int method21884(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    static {
        Class5550.method21887(-1126484252232905917L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int method21885() {
        class_5321 a2 = Class4122.field9561.field_1687.method_27983();
        if (a2 == Class5550.method21886()) {
            return (int)field10503[1];
        }
        if (a2 != class_1937.field_25180) {
            return Class4045.method20100(1746206348, 0.513736f);
        }
        int n2 = 2096;
        block4: while (true) {
            switch (n2) {
                case 2097: {
                    n2 = 2095;
                    continue block4;
                }
                case 2096: {
                    return (int)field10503[0];
                }
            }
            break;
        }
        if (a2 == class_1937.field_25181) {
            return (int)field10503[2];
        }
        return (int)field10503[1];
    }

    public static class_5321 method21886() {
        return class_1937.field_25179;
    }

    private static void method21887(long l2) {
        Class5550.method21883(l2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

