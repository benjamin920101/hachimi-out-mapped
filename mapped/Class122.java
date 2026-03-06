/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class8;
import net.minecraft.entity.LivingEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class122
extends Class8 {
    private final double field159;
    private final float field160;
    private final double field161;
    private final float field162;
    private final double field163;
    private final class_1309 field164;

    public static float method223(Class122 class122) {
        return class122.field160;
    }

    private static String TNJ42brDwgGnSTIg(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x6D13A287));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public float method224() {
        return this.field162;
    }

    public double method225() {
        return this.field159;
    }

    public class_1309 method226() {
        return this.field164;
    }

    public double method227() {
        return this.field161;
    }

    public double method228() {
        return this.field163;
    }

    public static CallSite nmsevg1CwY6poNs9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class122.TNJ42brDwgGnSTIg(string7), Class122.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class122.TNJ42brDwgGnSTIg(string5)), Class122.TNJ42brDwgGnSTIg(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class122.TNJ42brDwgGnSTIg(string5)), Class122.TNJ42brDwgGnSTIg(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class122(class_1309 a2, double b2, double c2, double d2, float e2, float f2) {
        this.field164 = a2;
        this.field163 = b2;
        this.field159 = c2;
        this.field161 = d2;
        this.field160 = e2;
        this.field162 = f2;
    }

    public float method229() {
        return Class122.method223(this);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

