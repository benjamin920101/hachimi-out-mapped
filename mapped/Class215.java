/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.math.MatrixStack
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;
import net.minecraft.client.util.math.MatrixStack;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class215
extends Class8 {
    private final class_4587 field259;
    private final float field260;

    public static CallSite GBvb477grODY83Wx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class215.wrpt6g3rLP8bvKSq(string7), Class215.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class215.wrpt6g3rLP8bvKSq(string5)), Class215.wrpt6g3rLP8bvKSq(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class215.wrpt6g3rLP8bvKSq(string5)), Class215.wrpt6g3rLP8bvKSq(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public class_4587 method402() {
        return Class215.method403(this);
    }

    private static String wrpt6g3rLP8bvKSq(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x46D066B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static class_4587 method403(Class215 class215) {
        return class215.field259;
    }

    public static float method404(Class215 class215) {
        return class215.field260;
    }

    public float method405() {
        return Class215.method404(this);
    }

    public Class215(class_4587 a2, float b2) {
        this.field259 = a2;
        this.field260 = b2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

