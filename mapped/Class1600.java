/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1462;
import mapped.Class3979;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1600
extends Thread {
    @Override
    public void run() {
        if (Class3979.field9084) {
            Class3979.method19567("Saving configurations and shutting down!");
            Class1600.method14760().method14351();
            Class3979.field9083.method14372();
            Class1600.method14759().method14382();
        } else {
            Class3979.method19554("Hachimi has not loaded any config!");
        }
    }

    public static Class1462 method14759() {
        return Class3979.field9083;
    }

    public Class1600() {
        this.setName("Hachimi-ShutdownHook");
    }

    public static CallSite gaVV6yrGlSe1ToEe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1600.nvJjimvTIhi9614W(string7), Class1600.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1600.nvJjimvTIhi9614W(string5)), Class1600.nvJjimvTIhi9614W(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1600.nvJjimvTIhi9614W(string5)), Class1600.nvJjimvTIhi9614W(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class1462 method14760() {
        return Class3979.field9083;
    }

    private static String nvJjimvTIhi9614W(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x25D290D5));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

