/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class7;
import net.minecraft.class_332;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class233
extends Class7 {
    private final float field275;

    private static String bto4oOGr7L77btoa(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xEFFE9782));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public float method425() {
        return Class233.method426(this);
    }

    public static float method426(Class233 class233) {
        return class233.field275;
    }

    public Class233(class_332 a2, float b2) {
        super(a2);
        this.field275 = b2;
    }

    public static CallSite W5Avr9Eobt7NF6lz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class233.bto4oOGr7L77btoa(string7), Class233.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class233.bto4oOGr7L77btoa(string5)), Class233.bto4oOGr7L77btoa(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class233.bto4oOGr7L77btoa(string5)), Class233.bto4oOGr7L77btoa(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

