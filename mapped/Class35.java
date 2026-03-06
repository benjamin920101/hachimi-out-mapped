/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_303$class_7590
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class8;
import net.minecraft.class_303;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class35
extends Class8 {
    private final class_303.class_7590 field50;
    private final double field51;

    public static CallSite CRErqgAo9XiPHqSR(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class35.QfOw43VbOTIFfHOL(string7), Class35.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class35.QfOw43VbOTIFfHOL(string5)), Class35.QfOw43VbOTIFfHOL(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class35.QfOw43VbOTIFfHOL(string5)), Class35.QfOw43VbOTIFfHOL(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public class_303.class_7590 method65() {
        return Class35.method66(this);
    }

    private static String QfOw43VbOTIFfHOL(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x8BFDB8A0));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static class_303.class_7590 method66(Class35 class35) {
        return class35.field50;
    }

    public double method67() {
        return this.field51;
    }

    public Class35(class_303.class_7590 a2, double b2) {
        this.field50 = a2;
        this.field51 = b2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

