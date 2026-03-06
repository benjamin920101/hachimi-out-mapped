/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1630;
import mapped.Class3689;
import mapped.Class489;
import mapped.Class5659;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class518
extends Class489 {
    @Override
    public double method10803(double a2) {
        return a2 < 0.5 ? (1.0 - Class489.method10804(1.0 - 2.0 * a2)) / 2.0 : (1.0 + Class489.method10804(Class3689.field8280 * a2 - 1.0)) / Class1630.field6071;
    }

    private static double method10830(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    private static String Se2H6DU7KQXR91t2(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xA0F3AAE0));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite Bc2OWwoF7gr4BryF(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class518.Se2H6DU7KQXR91t2(string7), Class518.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class518.Se2H6DU7KQXR91t2(string5)), Class518.Se2H6DU7KQXR91t2(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class518.Se2H6DU7KQXR91t2(string5)), Class518.Se2H6DU7KQXR91t2(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

