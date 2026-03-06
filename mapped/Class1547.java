/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1737;
import mapped.Class264;
import mapped.Class5961;
import mapped.Class597;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class1547 {
    static final int[] field5805;
    private static long[] field5806;

    private static void method14516(long l2) {
        Class1547.field5806[1] = l2 ^ 0xDD2A78B681422AC4L;
        Class1547.field5806[3] = l2 ^ 0xDD2A78B681422AC1L;
        Class1547.field5806[0] = l2 ^ 0xDD2A78B681422AC6L;
        Class1547.field5806[2] = l2 ^ 0xDD2A78B681422AC7L;
    }

    private static String ywtjoSyjrcxe9WTG(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x8EDA43));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        field5806 = new long[4];
        Class1547.method14516(-2510061117057652027L);
        field5805 = new int[Class597.values().length];
        try {
            Class1547.field5805[Class597.field2899.ordinal()] = (int)field5806[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class1547.field5805[Class597.field2904.ordinal()] = (int)field5806[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class1547.field5805[Class597.field2903.ordinal()] = (int)field5806[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class1547.field5805[Class597.field2901.ordinal()] = (int)field5806[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static int method14517(int n2, int n3, Class264 class264, Class1737 class1737) {
        return Class5961.method23396(n2, n3, class264, class1737);
    }

    public static CallSite lFysEye5EtOvYWjB(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1547.ywtjoSyjrcxe9WTG(string7), Class1547.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1547.ywtjoSyjrcxe9WTG(string5)), Class1547.ywtjoSyjrcxe9WTG(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1547.ywtjoSyjrcxe9WTG(string5)), Class1547.ywtjoSyjrcxe9WTG(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

