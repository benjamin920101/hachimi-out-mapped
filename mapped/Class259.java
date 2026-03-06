/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import mapped.Class1804;
import mapped.Class246;
import mapped.Class248;
import mapped.Class298;
import mapped.Class31;
import mapped.Class54;
import mapped.Class5723;
import mapped.Class6257;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class259
extends Class248 {
    public static boolean $skidonion$998554057;

    public static CallSite txtGNB4vO1O0gd22(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class259.3zC7qcJnGKm64s4L(string7), Class259.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class259.3zC7qcJnGKm64s4L(string5)), Class259.3zC7qcJnGKm64s4L(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class259.3zC7qcJnGKm64s4L(string5)), Class259.3zC7qcJnGKm64s4L(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method624(Class6257 class6257, Class246 class246, int n2) {
        class6257.method24171(class246, n2);
    }

    public Class259(String a2, String b2, Class246 c2) {
        super(a2, b2, c2);
    }

    public Runnable method625() {
        return ((Class246)this.field305).method498();
    }

    private static String 3zC7qcJnGKm64s4L(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x64612CB5));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method626() {
        Class298.method1924();
    }

    private static int method627(Class259 class259) {
        return class259.method633();
    }

    @Override
    public native Object method482(JsonObject var1);

    public void method628(int a2) {
        ((Class246)this.field305).method493(a2);
        Class259.method624(Class5723.field11059, (Class246)this.method507(), a2);
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = super.method438();
        a2.addProperty("value", (Number)Class259.method627(this));
        return a2;
    }

    private static String method629(Class259 class259) {
        return class259.method631();
    }

    public String method630() {
        return ((Class246)this.field305).method488();
    }

    public Class259(String a2, String b2, Class246 c2, Supplier d2) {
        super(a2, b2, c2, d2);
    }

    public String method631() {
        return ((Class246)this.field305).method499();
    }

    public native Class246 method632(JsonObject var1);

    public int method633() {
        return ((Class246)this.field305).method500();
    }

    private static int method634(int n2, int n3, Class54 class54, Class31 class31) {
        return Class1804.method15722(n2, n3, class54, class31);
    }

    static {
        ___.___(38, Class259.class);
        ____.___38_190(Class259.class);
    }

    private static native Object 1(char var0);
}

