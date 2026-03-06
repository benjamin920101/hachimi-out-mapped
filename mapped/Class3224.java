/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_7919
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1104;
import mapped.Class3868;
import mapped.Class3992;
import net.minecraft.class_2561;
import net.minecraft.class_7919;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3224 {
    private int field6910;
    private int field6911;
    private final class_2561 field6912;
    private final Class1104 field6913;
    private int field6914 = (int)field6915[0];
    private static long[] field6915 = new long[2];
    private class_7919 field6916;
    private Class3868 field6917;
    private String field6918;
    private int field6919 = (int)field6915[1];

    public Class3224 method16277(int a2, int b2) {
        Class3224.method16283(this, a2);
        this.field6911 = b2;
        return this;
    }

    public Class3992 method16278() {
        Class3992 a2 = new Class3992(this.field6910, this.field6911, this.field6914, this.field6919, this.field6912, this.field6913, this.field6917, this.field6918);
        a2.method_47400(this.field6916);
        return a2;
    }

    public Class3224 method16279(String a2) {
        this.field6918 = a2;
        return this;
    }

    public static CallSite t1wFuwaXic4nZadU(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class3224.aO6eZz1MBViMfH9s(string7), Class3224.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class3224.aO6eZz1MBViMfH9s(string5)), Class3224.aO6eZz1MBViMfH9s(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class3224.aO6eZz1MBViMfH9s(string5)), Class3224.aO6eZz1MBViMfH9s(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method16280(long l2) {
        Class3224.field6915[0] = l2 ^ 0x5E2AA2CA3B28B6C8L;
        Class3224.field6915[1] = l2 ^ 0x5E2AA2CA3B28B64AL;
    }

    public Class3224 method16281(Class3868 a2) {
        this.field6917 = a2;
        return this;
    }

    public Class3224 method16282(int a2, int b2) {
        this.field6914 = a2;
        this.field6919 = b2;
        return this;
    }

    private static String aO6eZz1MBViMfH9s(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xE12AB51A));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static void method16283(Class3224 class3224, int n2) {
        class3224.field6910 = n2;
    }

    public Class3224 method16284(int a2, int b2, int c2, int d2) {
        return this.method16277(a2, b2).method16282(c2, d2);
    }

    public Class3224(class_2561 a2, Class1104 b2) {
        this.field6917 = Class3992.field9126;
        this.field6912 = a2;
        this.field6913 = b2;
    }

    public Class3224 method16285(int a2) {
        this.field6914 = a2;
        return this;
    }

    public Class3224 method16286(@Nullable class_7919 a2) {
        this.field6916 = a2;
        return this;
    }

    static {
        Class3224.method16280(6785414778046690910L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

