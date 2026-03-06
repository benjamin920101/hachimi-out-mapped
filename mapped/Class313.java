/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.option.GameOptions
 */
package mapped;

import baritone.api.BaritoneAPI;
import mapped.Class1;
import mapped.Class1503;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6188;
import mapped.Class63;
import mapped.Class6322;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.GameOptions;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class313
extends Class278 {
    private static long[] field712 = new long[2];
    Class248 field713 = this.method450(new Class253("Lock", "Stops movement when sneaking or jumping", (boolean)field712[0]));
    private static Class313 INSTANCE;

    @Class1
    public void method2554(Class63 a2) {
        if (a2.method128() == Class543.field2690) {
            if (Class3979.method19539()) {
                if (BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
                    return;
                }
            }
            Class313.field290.field_1690.field_1894.method_23481((!Class313.method2555(Class313.field290.field_1690).method_1434() && ((Boolean)this.field713.method507() == false || !Class313.method2557(Class313.field290.field_1690).method_1434() && Class313.field290.field_1724.method_24828()) ? (int)field712[1] : (int)field712[0]) != 0);
        }
    }

    public static class_304 method2555(class_315 class_3152) {
        return class_3152.field_1832;
    }

    private static void method2556(long l2) {
        Class313.field712[1] = l2 ^ 0x9F451460C6E45422L;
        Class313.field712[0] = l2 ^ 0x9F451460C6E45423L;
    }

    public static class_304 method2557(class_315 class_3152) {
        return class_3152.field_1903;
    }

    public Class313() {
        super("AutoWalk", "Automatically moves forward", Class556.field2752);
        INSTANCE = this;
    }

    private static void method2558() {
        Class3979.method19561();
    }

    private static void method2559() {
        Class6009.method23561();
    }

    static {
        Class313.method2556(-6970142442399706077L);
    }

    public static Class313 method2560() {
        return INSTANCE;
    }

    private static void method2561(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Override
    public void method1279() {
        ((Class6188)Class313.field290.field_1690.field_1894).method24106();
    }

    private static void method2562() {
        Class5836.method22885();
    }

    private static void method2563() {
        Class1503.method14420();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

