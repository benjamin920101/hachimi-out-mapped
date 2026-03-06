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
public final class Class151
extends Class8 {
    private float field196;

    private static String cfgk1uiMjyFjA9L5(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xF46AE0A0));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public float method294() {
        return this.field196;
    }

    public Class151(float a2) {
        this.field196 = a2;
    }

    public void method295(float a2) {
        Class151.method296(this, a2);
    }

    public static void method296(Class151 class151, float f2) {
        class151.field196 = f2;
    }

    public static CallSite baEBoBajRwg5DdWS(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class151.cfgk1uiMjyFjA9L5(string7), Class151.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class151.cfgk1uiMjyFjA9L5(string5)), Class151.cfgk1uiMjyFjA9L5(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class151.cfgk1uiMjyFjA9L5(string5)), Class151.cfgk1uiMjyFjA9L5(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

