/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.MathHelper
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class209;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3239;
import mapped.Class3749;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6454;
import net.minecraft.util.math.MathHelper;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class327
extends Class278 {
    Class248 field786 = this.method450(new Class253("Lock", "Locks the yaw in cardinal direction", (boolean)field787[0]));
    private static long[] field787 = new long[1];

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method2821(Class209 b2) {
        int n2 = ((Boolean)Class327.method2827(this.field786)).booleanValue() ? 13489 : 13490;
        int n3 = n2;
        if (n3 != 13489) {
            if (n3 == 13490) return;
            return;
        } else {
            b2.method10();
            float a2 = (float)b2.method395() * 0.15f;
            Class327.field290.field_1724.method_36457(class_3532.method_15363((float)(Class327.field290.field_1724.method_36455() + a2), (float)Class3749.field8487, (float)Class3239.field6945));
        }
    }

    static {
        Class327.method2834(-5786006972326298065L);
    }

    private static void method2822(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2823(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2824(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Class1
    public void method2825(Class63 d2) {
        if (d2.method128() == Class543.field2690) {
            int n2 = 54975;
            Class6454.method24636(0.45409836877816667, 0.07000259358874772, 0.5034889447690368, 0.5836981471983482);
            return;
        }
        int n3 = 54976;
        Class5836.method22890();
    }

    private static void method2826() {
        Class6009.method23561();
    }

    private static Object method2827(Class248 class248) {
        return class248.method507();
    }

    private static void method2828() {
        Class4146.method20694();
    }

    private static void method2829() {
        Class1807.method15744();
    }

    private static void method2830() {
        Class6454.method24594();
    }

    private static void method2831() {
        Class5836.method22897();
    }

    private static void method2832(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2833(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2834(long l2) {
        Class327.field787[0] = l2 ^ 0xAFB3F950728EBE2FL;
    }

    public Class327() {
        super("Yaw", "Locks player yaw to a cardinal axis", Class556.field2752);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

