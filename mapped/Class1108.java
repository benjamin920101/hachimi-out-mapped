/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class4122;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1108 {
    private static long[] field4476 = new long[1];

    private static class_310 method12913() {
        return Class1108.method12914();
    }

    public static class_310 method12914() {
        return Class4122.field9561;
    }

    static {
        Class1108.method12917(1112672803682557220L);
    }

    private static class_746 method12915(class_310 class_3102) {
        return Class1108.method12919(class_3102);
    }

    public static class_310 method12916() {
        return Class4122.field9561;
    }

    private static void method12917(long l2) {
        Class1108.field4476[0] = l2 ^ 0xF7102050EBC9D34L;
    }

    public static void method12918(boolean e2) {
        if (e2) {
            int a2 = (int)Class4122.field9561.field_1724.method_23317();
            int b2 = (int)Class4122.field9561.field_1724.method_23318();
            int c2 = (int)Class1108.method12915(Class4122.field9561).method_23321();
            int d2 = (Integer)Class1108.method12920().field_1690.method_42503().method_41753() * (int)field4476[0];
            Class1108.method12913().field_1769.method_18146(a2 - d2, b2 - d2, c2 - d2, a2 + d2, b2 + d2, c2 + d2);
        } else {
            Class4122.field9561.field_1769.method_3279();
        }
    }

    public static class_746 method12919(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static CallSite 2T5lx3jJDYOdSNiE(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1108.k2NBv7NkiZd4CGY8(string7), Class1108.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1108.k2NBv7NkiZd4CGY8(string5)), Class1108.k2NBv7NkiZd4CGY8(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1108.k2NBv7NkiZd4CGY8(string5)), Class1108.k2NBv7NkiZd4CGY8(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static class_310 method12920() {
        return Class1108.method12916();
    }

    private static String k2NBv7NkiZd4CGY8(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x61F1F1F1));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

