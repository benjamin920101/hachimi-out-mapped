/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_241
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class8;
import net.minecraft.class_241;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class17
extends Class8 {
    private final float field12;
    private float field13;
    private float field14;

    public static CallSite 1CGFjMIYqTFDPHIl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class17.Ji86h2qbDcCQGqjq(string7), Class17.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class17.Ji86h2qbDcCQGqjq(string5)), Class17.Ji86h2qbDcCQGqjq(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class17.Ji86h2qbDcCQGqjq(string5)), Class17.Ji86h2qbDcCQGqjq(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void method24(float a2) {
        this.field13 = a2;
    }

    public float method25() {
        return Class17.method29(this);
    }

    public float method26() {
        return this.field13;
    }

    public void method27(float a2) {
        this.field14 = a2;
    }

    public static float method28(Class17 class17) {
        return class17.field12;
    }

    public static float method29(Class17 class17) {
        return class17.field14;
    }

    public Class17(float a2, float b2, float c2) {
        this.field14 = a2;
        this.field13 = b2;
        this.field12 = c2;
    }

    public float method30() {
        return Class17.method28(this);
    }

    public void method31(class_241 a2) {
        this.field14 = a2.field_1343;
        Class17.method32(this, a2.field_1342);
    }

    public static void method32(Class17 class17, float f2) {
        class17.field13 = f2;
    }

    private static String Ji86h2qbDcCQGqjq(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xED59CB7A));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

