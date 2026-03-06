/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.MovementType
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import mapped.Class3;
import mapped.Class8;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class204
extends Class8 {
    private double field248;
    private double field249;
    private double field250;
    private final class_1313 field251;

    public double method381() {
        return this.field250;
    }

    private static double method382(Class204 class204) {
        return Class204.method387(class204);
    }

    public double method383() {
        return this.field249;
    }

    public class_1313 method384() {
        return this.field251;
    }

    public static void method385(Class204 class204, double d2) {
        class204.field249 = d2;
    }

    public void method386(double a2) {
        Class204.method385(this, a2);
    }

    public static double method387(Class204 class204) {
        return class204.field250;
    }

    public class_243 method388() {
        return new class_243(this.field249, Class204.method382(this), this.field248);
    }

    public void method389(double a2) {
        this.field248 = a2;
    }

    public Class204(class_1313 a2, class_243 b2) {
        this.field251 = a2;
        this.field249 = b2.method_10216();
        this.field250 = b2.method_10214();
        this.field248 = b2.method_10215();
    }

    public double method390() {
        return this.field248;
    }

    public void method391(double a2) {
        this.field250 = a2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

