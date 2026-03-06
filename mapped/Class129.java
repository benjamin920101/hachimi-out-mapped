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
public class Class129
extends Class8 {
    private double field168;
    private double field169;
    private double field170;

    private static String Ue7mFyQl6qleHYi7(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xBA76C2B6));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public double method238() {
        return this.field170;
    }

    public void method239(double a2) {
        this.field169 = a2;
    }

    public double method240() {
        return this.field168;
    }

    private static void method241(Class129 class129, double d2) {
        Class129.method246(class129, d2);
    }

    public void method242(double a2) {
        this.field168 = a2;
    }

    public double method243() {
        return Class129.method248(this);
    }

    public static CallSite ePAfrlqvGSOnQISU(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class129.Ue7mFyQl6qleHYi7(string7), Class129.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class129.Ue7mFyQl6qleHYi7(string5)), Class129.Ue7mFyQl6qleHYi7(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class129.Ue7mFyQl6qleHYi7(string5)), Class129.Ue7mFyQl6qleHYi7(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void method244(Class129 class129, double d2) {
        class129.field170 = d2;
    }

    public void method245(double a2, double b2, double c2) {
        this.field169 = a2;
        this.field168 = b2;
        Class129.method241(this, c2);
    }

    public Class129(double a2, double b2, double c2) {
        this.field169 = a2;
        this.field168 = b2;
        this.field170 = c2;
    }

    public static void method246(Class129 class129, double d2) {
        class129.field170 = d2;
    }

    public void method247(double a2) {
        Class129.method244(this, a2);
    }

    public static double method248(Class129 class129) {
        return class129.field169;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

