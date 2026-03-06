/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_742
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1468;
import mapped.Class6402;
import net.minecraft.class_1657;
import net.minecraft.class_742;

public class Class1467
extends Class1468 {
    private static long[] field5559 = new long[1];
    private final Class6402 field5560;

    public static CallSite NlWQlqp6UDUyhy7F(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1467.kfE3l5J6iRptaqge(string7), Class1467.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1467.kfE3l5J6iRptaqge(string5)), Class1467.kfE3l5J6iRptaqge(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1467.kfE3l5J6iRptaqge(string5)), Class1467.kfE3l5J6iRptaqge(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class1467(class_1657 a2, float b2) {
        super(a2);
        this.field5560 = new Class6402((class_742)a2, (boolean)field5559[0], b2);
        this.field_6243 = a2.field_6243;
        this.field_6264 = a2.field_6243;
        this.method_18380(a2.method_18376());
    }

    private static String kfE3l5J6iRptaqge(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x1960B5E0));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public Class6402 method14388() {
        return this.field5560;
    }

    private static void method14389(long l2) {
        Class1467.field5559[0] = l2 ^ 0xA0452DFDD1E84E5CL;
    }

    static {
        Class1467.method14389(-6898056686076408228L);
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

