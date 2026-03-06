/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;
import net.minecraft.class_4587;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class30
extends Class8 {
    private float field38;
    private final float field39;
    private final class_4587 field40;

    public static class_4587 method59(Class30 class30) {
        return class30.field40;
    }

    public static CallSite eYrG22o4NDBLxefe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class30.ZUqJaAEKvoLe3zwn(string7), Class30.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class30.ZUqJaAEKvoLe3zwn(string5)), Class30.ZUqJaAEKvoLe3zwn(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class30.ZUqJaAEKvoLe3zwn(string5)), Class30.ZUqJaAEKvoLe3zwn(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String ZUqJaAEKvoLe3zwn(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xB44AE894));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public Class30(class_4587 a2, float b2) {
        this.field40 = a2;
        this.field39 = b2;
    }

    public float method60() {
        return this.field39;
    }

    public void method61(float a2) {
        Class30.method64(this, a2);
    }

    public class_4587 method62() {
        return Class30.method59(this);
    }

    public float method63() {
        return this.field38;
    }

    public static void method64(Class30 class30, float f2) {
        class30.field38 = f2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

