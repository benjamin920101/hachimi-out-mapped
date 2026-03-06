/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5498
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class8;
import net.minecraft.class_5498;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class227
extends Class8 {
    private final class_5498 field273;

    public static CallSite VaETMtH91nBe95rD(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class227.Vh2WSScljEOIX7nj(string7), Class227.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class227.Vh2WSScljEOIX7nj(string5)), Class227.Vh2WSScljEOIX7nj(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class227.Vh2WSScljEOIX7nj(string5)), Class227.Vh2WSScljEOIX7nj(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public class_5498 method422() {
        return Class227.method423(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Vh2WSScljEOIX7nj(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        block4: while (true) {
            int n3 = n2 >= string.length() ? 49725 : 49726;
            block5: while (true) {
                switch (n3) {
                    default: {
                        stringBuilder.append((char)(string.charAt(n2) ^ 0x524388E8));
                        ++n2;
                        continue block4;
                    }
                    case 49726: {
                        n3 = 49724;
                        continue block5;
                    }
                    case 49725: 
                }
                break;
            }
            break;
        }
        return stringBuilder.toString();
    }

    private static class_5498 method423(Class227 class227) {
        return Class227.method424(class227);
    }

    public static class_5498 method424(Class227 class227) {
        return class227.field273;
    }

    public Class227(class_5498 a2) {
        this.field273 = a2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

