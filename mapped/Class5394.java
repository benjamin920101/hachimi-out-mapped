/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class3815;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5394 {
    public static int field10079;
    private static long[] field10080;

    private static void method21064(long l2) {
        Class5394.field10080[0] = l2 ^ 0xBCCE0112DDED4D7CL;
    }

    private static int method21065() {
        return Class5394.method21067();
    }

    private static String YnlQF7jTth4NtUJM(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x99F9E4D6));
            ++n2;
        }
        return stringBuilder.toString();
    }

    @Class1
    public static void method21066(Class210 a2) {
        if (Class5394.method21065() > 0) {
            Class1807.method15744();
            return;
        }
        Class3815.INSTANCE.method18538(Class5394.class);
    }

    static {
        field10080 = new long[1];
        Class5394.method21064(-4841931368832348803L);
    }

    public static CallSite tl4BvJwwTB6tVGDY(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class5394.YnlQF7jTth4NtUJM(string7), Class5394.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class5394.YnlQF7jTth4NtUJM(string5)), Class5394.YnlQF7jTth4NtUJM(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class5394.YnlQF7jTth4NtUJM(string5)), Class5394.YnlQF7jTth4NtUJM(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static int method21067() {
        return field10079;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

