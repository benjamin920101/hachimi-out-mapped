/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class139;
import mapped.Class3;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class141
extends Class139 {
    private final String field184;

    public static String method273(Class141 class141) {
        return class141.field184;
    }

    private static String LT3196bqSwAhRpfj(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x2581BCCF));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public String method274() {
        return Class141.method273(this);
    }

    public static CallSite 5EJhHXPunxT4IArO(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class141.LT3196bqSwAhRpfj(string7), Class141.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class141.LT3196bqSwAhRpfj(string5)), Class141.LT3196bqSwAhRpfj(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class141.LT3196bqSwAhRpfj(string5)), Class141.LT3196bqSwAhRpfj(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class141(String a2) {
        this.field184 = a2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

