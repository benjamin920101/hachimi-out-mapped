/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class4112 {
    public static double field9538 = 0.4102925536269473;

    public static CallSite 0xdYNDgEqA82jUdI(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class4112.yAJZAVhYnTnn9Bxq(string7), Class4112.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class4112.yAJZAVhYnTnn9Bxq(string5)), Class4112.yAJZAVhYnTnn9Bxq(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class4112.yAJZAVhYnTnn9Bxq(string5)), Class4112.yAJZAVhYnTnn9Bxq(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String yAJZAVhYnTnn9Bxq(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xA2092CC9));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        S\u200e = "WINDOWS";
        cc\u200e = "Target monsters";
    }
}

