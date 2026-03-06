/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1004;
import mapped.Class1269;
import mapped.Class489;
import mapped.Class5659;
import mapped.Class6023;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class516
extends Class489 {
    /*
     * Unable to fully structure code
     */
    private static String eV8YNYJ4dyjKq8gy(String var0) {
        var1_1 = new StringBuilder();
        var2_2 = 0;
        if (true) ** GOTO lbl8
        block0: while (true) {
            block2: {
                var1_1.append((char)(var0.charAt(var2_2) ^ 1566184648));
                ++var2_2;
lbl8:
                // 2 sources

                if (var2_2 < var0.length()) break block2;
                v0 = 44608;
                ** GOTO lbl16
            }
            v0 = 44609;
            if (true) ** GOTO lbl16
            do {
                v0 = var3_3 = 44607;
lbl16:
                // 3 sources

                if (var3_3 == 44608) break block0;
            } while (var3_3 == 44609);
        }
        return var1_1.toString();
    }

    private static double method10826(double d2, double d3, double d4) {
        return Class5659.method22102(d2, d3, d4);
    }

    @Override
    public double method10803(double a2) {
        return a2 == 0.0 ? 0.0 : (a2 == 1.0 ? 1.0 : Math.pow(Class1269.field4961, -10.0 * a2) * Math.sin((a2 * 10.0 - 0.75) * 2.0943951023931953) + 1.0);
    }

    private static double method10827(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    public static CallSite gMvQkvkTFHWa6itx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class516.eV8YNYJ4dyjKq8gy(string7), Class516.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class516.eV8YNYJ4dyjKq8gy(string5)), Class516.eV8YNYJ4dyjKq8gy(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class516.eV8YNYJ4dyjKq8gy(string5)), Class516.eV8YNYJ4dyjKq8gy(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static double method10828(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5659.method22181(d2, d3, d4, d5, d6, d7);
    }

    private static double method10829(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

