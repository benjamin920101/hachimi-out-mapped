/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class191
extends Class8 {
    private double field242;

    public static void method371(Class191 class191, double d2) {
        class191.field242 = d2;
    }

    public double method372() {
        return this.field242;
    }

    public static CallSite XnGz1Age0vNLWAub(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class191.86JqP4gvHrLBj2OY(string7), Class191.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class191.86JqP4gvHrLBj2OY(string5)), Class191.86JqP4gvHrLBj2OY(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class191.86JqP4gvHrLBj2OY(string5)), Class191.86JqP4gvHrLBj2OY(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void method373(double a2) {
        Class191.method371(this, a2);
    }

    private static String 86JqP4gvHrLBj2OY(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x64A4ED84));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

