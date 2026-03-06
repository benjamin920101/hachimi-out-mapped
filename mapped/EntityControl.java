/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.LlamaEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class119;
import mapped.Class13;
import mapped.Class184;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class63;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class EntityControl
extends Class278 {
    Class248 field1501 = this.method450(new Class252("JumpStrength", "The fixed jump strength of the mounted entity", Float.valueOf(0.1f), Float.valueOf(0.7f), Float.valueOf(2.0f)));
    Class248 field1502 = this.method450(new Class253("NoPigAI", "Prevents the pig movement when controlling pigs", (boolean)field1503[0]));
    private static long[] field1503 = new long[1];

    @Class1
    public void method6395(Class184 a2) {
        if (EntityControl.method6397(field290) == null) {
            return;
        }
        if (((Boolean)this.field1502.method507()).booleanValue()) {
            if (a2.method360().method_5685().contains(EntityControl.method6402(field290))) {
                a2.method10();
            }
        }
    }

    @Class1
    public void method6396(Class119 a2) {
        a2.method10();
        EntityControl.method6401(a2, ((Float)EntityControl.method6404(this.field1501)).floatValue());
    }

    public static class_746 method6397(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6398() {
        Class5836.method22897();
    }

    static {
        EntityControl.method6400(8808146478057988196L);
    }

    @Class1
    public void method6399(Class13 a2) {
        a2.method10();
    }

    private static void method6400(long l2) {
        EntityControl.field1503[0] = l2 ^ 0x7A3CD28DE2412064L;
    }

    public EntityControl() {
        super("EntityControl", "Allows you to steer entities without a saddle", Class556.field2752);
    }

    private static void method6401(Class119 class119, float f2) {
        class119.method209(f2);
    }

    public static class_746 method6402(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method6403(Class63 b2) {
        class_1297 c2 = EntityControl.method6405(field290).method_5854();
        if (c2 == null) {
            return;
        }
        c2.method_36456(EntityControl.field290.field_1724.method_36454());
        if (c2 instanceof class_1501) {
            class_1501 a2 = (class_1501)c2;
            a2.field_6241 = EntityControl.field290.field_1724.method_36454();
        }
    }

    private static Object method6404(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method6405(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

