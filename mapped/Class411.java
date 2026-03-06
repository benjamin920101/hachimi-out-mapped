/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1226;
import mapped.Class278;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class760;

public class Class411
extends Class278 {
    private static long[] field1519 = new long[1];
    private final int field1520;

    public Class411(String a2, String b2, Class556 c2, int d2) {
        super(a2, b2, c2);
        this.field1520 = d2;
    }

    private static void method6464(long l2) {
        Class411.field1519[0] = l2 ^ 0xD22E4FA02C984D4DL;
    }

    protected void method6465(float a2, float b2) {
        Class5723.field11049.method12006(new Class1226(this.method6470(), a2, b2));
    }

    public static int method6466(Class411 class411) {
        return class411.field1520;
    }

    public Class411(String a2, String b2, Class556 c2) {
        super(a2, b2, c2);
        this.field1520 = (int)field1519[0];
    }

    private static Class760 method6467() {
        return Class411.method6471();
    }

    private static String t2PVjyC1eyOnaXwy(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xEC90A161));
            ++n2;
        }
        return stringBuilder.toString();
    }

    protected void method6468(float a2, float b2) {
        Class411.method6467().method12012(a2, b2);
    }

    protected boolean method6469() {
        return Class5723.field11049.method12043(this.method6470());
    }

    protected int method6470() {
        return Class411.method6473(this);
    }

    public static Class760 method6471() {
        return Class5723.field11049;
    }

    private static void method6472(long l2) {
        Class411.method6464(l2);
    }

    public static CallSite AqOO6qLNQAFV1tdg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class411.t2PVjyC1eyOnaXwy(string7), Class411.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class411.t2PVjyC1eyOnaXwy(string5)), Class411.t2PVjyC1eyOnaXwy(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class411.t2PVjyC1eyOnaXwy(string5)), Class411.t2PVjyC1eyOnaXwy(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        Class411.method6472(-3301613927454454487L);
    }

    private static int method6473(Class411 class411) {
        return Class411.method6466(class411);
    }

    private static Object l(char c2) {
        return ((Object[])l)[c2];
    }
}

