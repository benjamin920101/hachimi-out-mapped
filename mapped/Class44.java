/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package mapped;

import mapped.Class8;
import net.minecraft.class_243;

public class Class44
extends Class8 {
    private double field60;
    private double field61;
    private final float field62;
    private double field63;

    public static double method83(Class44 class44) {
        return class44.field61;
    }

    public static void method84(Class44 class44, double d2) {
        class44.field61 = d2;
    }

    public void method85(double a2) {
        this.field60 = a2;
    }

    public double method86() {
        return this.field61;
    }

    public Class44(double a2, double b2, double c2, float d2) {
        this.field60 = a2;
        this.field61 = b2;
        this.field63 = c2;
        this.field62 = d2;
    }

    public static double method87(Class44 class44) {
        return class44.field63;
    }

    public void method88(double a2) {
        Class44.method84(this, a2);
    }

    public void method89(class_243 a2) {
        this.field60 = a2.method_10216();
        this.field61 = a2.method_10214();
        this.field63 = a2.method_10215();
    }

    public float method90() {
        return this.field62;
    }

    public void method91(double a2) {
        this.field63 = a2;
    }

    public class_243 method92() {
        return new class_243(this.field60, Class44.method83(this), this.field63);
    }

    public double method93() {
        return Class44.method87(this);
    }

    public double method94() {
        return this.field60;
    }
}

