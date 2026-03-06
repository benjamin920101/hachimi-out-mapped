/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.render.entity.PlayerEntityRenderer
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.Arm
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.entity.EntityPose
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.entity.model.AnimalModel
 *  net.minecraft.client.render.entity.model.CompositeEntityModel
 *  net.minecraft.client.render.entity.model.SinglePartEntityModel
 *  net.minecraft.client.render.entity.model.BipedEntityModel
 *  net.minecraft.client.render.entity.model.BipedEntityModel$ArmPose
 *  net.minecraft.client.render.entity.model.LlamaEntityModel
 *  net.minecraft.client.render.entity.model.EntityModel
 *  net.minecraft.client.render.entity.model.PlayerEntityModel
 *  net.minecraft.client.render.entity.model.RabbitEntityModel
 *  net.minecraft.client.model.ModelPart
 *  net.minecraft.client.model.ModelPart$Quad
 *  net.minecraft.client.model.ModelPart$Vertex
 *  net.minecraft.client.model.ModelPart$Cuboid
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.item.HeldItemRenderer
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.entity.LimbAnimator
 *  net.minecraft.client.render.entity.EndCrystalEntityRenderer
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.item.ItemRenderer
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package mapped;

import com.google.common.base.MoreObjects;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.LambdaMetafactory;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import mapped.Class1;
import mapped.Class1001;
import mapped.Class1057;
import mapped.Class1090;
import mapped.Class1108;
import mapped.Class1223;
import mapped.Class1261;
import mapped.Class1322;
import mapped.Class139;
import mapped.Class1455;
import mapped.Class1473;
import mapped.Class1476;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1736;
import mapped.Class1745;
import mapped.Class1762;
import mapped.Class1807;
import mapped.Class2298;
import mapped.Class298;
import mapped.Class309;
import mapped.Class3489;
import mapped.Class3574;
import mapped.Class3590;
import mapped.Class3634;
import mapped.Class365;
import mapped.Class3689;
import mapped.Class375;
import mapped.Class3874;
import mapped.Class3935;
import mapped.Class396;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4152;
import mapped.Class4218;
import mapped.Class4245;
import mapped.Class52;
import mapped.Class5422;
import mapped.Class5427;
import mapped.Class55;
import mapped.Class5516;
import mapped.Class5541;
import mapped.Class5639;
import mapped.Class5659;
import mapped.Class5765;
import mapped.Class5836;
import mapped.Class5968;
import mapped.Class6009;
import mapped.Class6018;
import mapped.Class603;
import mapped.Class6098;
import mapped.Class6110;
import mapped.Class6167;
import mapped.Class6322;
import mapped.Class6402;
import mapped.Class6454;
import mapped.Class6467;
import mapped.Class723;
import mapped.Class751;
import mapped.Class803;
import mapped.Class969;
import net.hachimi.client.mixin.J;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.util.Arm;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.EntityPose;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.LlamaEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.model.RabbitEntityModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.entity.LimbAnimator;
import net.minecraft.client.render.entity.EndCrystalEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1567 {
    private static final float field5867;
    private static final Vector4f field5868;
    private static final Vector4f field5869;
    private static final Vector4f field5870;
    private static final Vector4f field5871;
    private static long[] field5872;
    private static final class_4587 field5873;

    private static void method14558(long l2) {
        Class1567.field5872[2] = l2 ^ 0xDBC2569F7C01C553L;
        Class1567.field5872[1] = l2 ^ 0xDBC2569F7C01C550L;
        Class1567.field5872[3] = l2 ^ 0xDBC2569F7C01C552L;
        Class1567.field5872[0] = l2 ^ 0xDBC2569F7C01C551L;
    }

    public static Class603 method14559() {
        return Class603.field2935;
    }

    private static void method14560() {
        Class5836.method22885();
    }

    private static int method14561(int n2, int n3, Class55 class55, Class5541 class5541) {
        return Class6098.method23846(n2, n3, class55, class5541);
    }

    public static Vector4f method14562() {
        return field5868;
    }

    public static class_4587 method14563() {
        return field5873;
    }

    public static int method14564(class_1511 class_15112) {
        return class_15112.field_7034;
    }

    private static void method14565() {
        Class1807.method15744();
    }

    public static class_630 method14566(class_596 class_5962) {
        return class_5962.field_27482;
    }

    private static void method14567(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static void method14568(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static float method14569(Vector4f vector4f) {
        return vector4f.x;
    }

    public static float method14570(Vector4f vector4f) {
        return vector4f.z;
    }

    private static void method14571() {
        Class4146.method20697();
    }

    private static void method14572() {
        Class5836.method22890();
    }

    private static float method14573(class_1309 class_13092) {
        return Class1567.method14668(class_13092);
    }

    private static void method14574(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static Class4218 method14575(Class4218 class4218, double d2, double d3, double d4) {
        return class4218.method20866(d2, d3, d4);
    }

    private static class_746 method14576(class_310 class_3102) {
        return Class1567.method14587(class_3102);
    }

    private static void method14577() {
        Class5659.method22184();
    }

    private static class_4587 method14578() {
        return Class1567.method14735();
    }

    public static void method14579(class_742 k2, class_4587 l2, float m2, float n2, float o2) {
        float p2 = k2.method_6024(o2);
        float q2 = k2.method_5695(o2);
        if (k2.method_6128()) {
            Class1567.method14747((class_1309)k2, l2, m2, n2, o2);
            float c2 = (float)k2.method_6003() + o2;
            float d2 = class_3532.method_15363((float)(c2 * c2 / Class4245.field9914), (float)0.0f, (float)1.0f);
            if (!k2.method_6123()) {
                l2.method_22907(class_7833.field_40714.rotationDegrees(d2 * (Class1473.field5579 - q2)));
            }
            class_243 e2 = k2.method_5828(o2);
            class_243 f2 = k2.method_49339(o2);
            double g2 = f2.method_37268();
            double h2 = e2.method_37268();
            if (g2 > 0.0) {
                if (h2 > 0.0) {
                    double a2 = (f2.field_1352 * e2.field_1352 + f2.field_1350 * e2.field_1350) / Math.sqrt(g2 * h2);
                    double b2 = f2.field_1352 * e2.field_1350 - f2.field_1350 * e2.field_1352;
                    l2.method_22907(class_7833.field_40716.rotation((float)(Math.signum(b2) * Math.acos(a2))));
                }
            }
        } else if (p2 > 0.0f) {
            Class1567.method14747((class_1309)k2, l2, m2, n2, o2);
            float i2 = k2.method_5799() ? -90.0f - q2 : Class1057.field4335;
            float j2 = class_3532.method_16439((float)p2, (float)0.0f, (float)i2);
            l2.method_22907(class_7833.field_40714.rotationDegrees(j2));
            if (k2.method_20232()) {
                l2.method_46416(0.0f, -1.0f, 0.3f);
            }
        } else {
            Class1567.method14699((class_1309)k2, l2, m2, n2, o2);
        }
    }

    public static Vector4f method14580() {
        return field5870;
    }

    public static float method14581(Vector4f vector4f) {
        return vector4f.x;
    }

    /*
     * Unable to fully structure code
     */
    public static void method14582(class_4587 c, class_630 d, double e, double f, double g, int h, int i, float j, boolean k, boolean l, boolean m) {
        if (d.field_3665) {
            if (d.field_3663.isEmpty()) {
                if (!d.field_3661.isEmpty()) {
                    Class1503.method14417(0.70811343f, 0.6429791f);
                    return;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            return;
        }
        Class1567.field5873.method_22903();
        d.method_22703(Class1567.field5873);
        for (class_630.class_628 a : Class1567.method14613(d)) {
            Class1567.method14677(c, a, e, f, g, h, i, j, k, l, m);
        }
        var14_11 = d.field_3661.values().iterator();
        while (true) {
            block7: {
                block8: {
                    if (!var14_11.hasNext()) break block8;
                    v0 = 35754;
                    ** GOTO lbl23
                }
                v0 = 35755;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_13 = 35753;
lbl23:
                    // 3 sources

                    if (var16_13 == 35754) break block7;
                } while (var16_13 == 35755);
                break;
            }
            b = (class_630)var14_11.next();
            Class1567.method14651(c, b, e, f, g, h, i, j, k, l, m);
        }
        Class1567.field5873.method_22909();
    }

    public static class_310 method14583() {
        return Class4122.field9561;
    }

    private static void method14584(Class4218 class4218, class_4587 class_45872) {
        class4218.method20891(class_45872);
    }

    public static Vector4f method14585() {
        return field5871;
    }

    public static class_7833 method14586() {
        return class_7833.field_40718;
    }

    public static class_746 method14587(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static float method14588(Vector4f vector4f) {
        return vector4f.x;
    }

    public static float method14589(class_1657 class_16572) {
        return class_16572.field_7483;
    }

    public static Class4218 method14590() {
        return Class6009.field11998;
    }

    private static Class4218 method14591(Class4218 class4218, double d2, double d3, double d4, double d5, double d6, double d7) {
        return class4218.method20883(d2, d3, d4, d5, d6, d7);
    }

    private static void method14592() {
        Class1745.method15538();
    }

    private static void method14593(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_630 method14594(class_572 class_5722) {
        return class_5722.field_3397;
    }

    public static void method14595(class_4587 a2, float b2, class_1007 c2, class_1306 d2, float e2, float f2, int g2, int h2, float i2, boolean j2, boolean k2, boolean l2) {
        int p2;
        RenderSystem.disableDepthTest();
        double m2 = Class4122.field9561.field_1773.method_19418().method_19326().field_1352;
        double n2 = Class1567.method14750(Class1567.method14744(Class4122.field9561).method_19418().method_19326());
        double o2 = Class4122.field9561.field_1773.method_19418().method_19326().field_1350;
        Class1567.method14578().method_22903();
        int n3 = p2 = d2 != class_1306.field_6182 ? (int)field5872[1] : (int)field5872[0];
        float q2 = p2 != 0 ? 1.0f : -1.0f;
        float r2 = class_3532.method_15355((float)e2);
        float s2 = -0.3f * class_3532.method_15374((float)(r2 * (float)Math.PI));
        float t2 = 0.4f * class_3532.method_15374((float)(r2 * ((float)Math.PI * 2)));
        float u2 = Class723.field3321 * class_3532.method_15374((float)(e2 * (float)Math.PI));
        field5873.method_46416(q2 * (s2 + 0.64000005f), t2 - 0.6f + f2 * -0.6f, u2 - 0.71999997f);
        Class1567.method14634().method_22907(Class1567.method14607().rotationDegrees(q2 * 45.0f));
        float v2 = class_3532.method_15374((float)(e2 * e2 * (float)Math.PI));
        float w2 = class_3532.method_15374((float)(r2 * Class5516.field10418));
        field5873.method_22907(class_7833.field_40716.rotationDegrees(q2 * w2 * 70.0f));
        field5873.method_22907(class_7833.field_40718.rotationDegrees(q2 * v2 * -20.0f));
        Class1567.method14666().method_46416(q2 * -1.0f, 3.6f, Class5427.field10103);
        Class1567.method14736().method_22907(class_7833.field_40718.rotationDegrees(q2 * 120.0f));
        field5873.method_22907(class_7833.field_40714.rotationDegrees(200.0f));
        field5873.method_22907(class_7833.field_40716.rotationDegrees(q2 * -135.0f));
        field5873.method_46416(q2 * 5.6f, 0.0f, 0.0f);
        c2.method_4218((class_742)Class4122.field9561.field_1724);
        class_591 x2 = (class_591)c2.method_4038();
        x2.field_3447 = 0.0f;
        x2.field_3400 = (int)field5872[0];
        x2.field_3396 = 0.0f;
        x2.method_17087((class_1309)Class1567.method14711().field_1724, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        if (d2 == class_1306.field_6183) {
            x2.field_3401.field_3654 = 0.0f;
            Class1567.method14582(a2, x2.field_3401, m2, n2, o2, h2, g2, i2, j2, k2, l2);
            x2.field_3486.field_3654 = 0.0f;
        } else {
            x2.field_27433.field_3654 = 0.0f;
            Class1567.method14582(a2, x2.field_27433, m2, n2, o2, h2, g2, i2, j2, k2, l2);
            x2.field_3484.field_3654 = 0.0f;
        }
        field5873.method_22909();
    }

    public static Vector4f method14596() {
        return field5868;
    }

    public static class_630 method14597(class_578 class_5782) {
        return class_5782.field_27448;
    }

    private static void method14598(long l2) {
        Class1567.method14558(l2);
    }

    public static Vector3f method14599(class_630.class_618 class_6182) {
        return class_6182.field_3605;
    }

    private static Class4218 method14600(Class4218 class4218, double d2, double d3, double d4, double d5, double d6, double d7) {
        return class4218.method20883(d2, d3, d4, d5, d6, d7);
    }

    public static int[] method14601() {
        return Class4152.field9655;
    }

    private static void method14602(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method14603(class_4587 a2, double b2, double c2, double d2, int e2, int f2, float g2, boolean h2, boolean i2, boolean j2, class_630 k2) {
        Class1567.method14582(a2, k2, b2, c2, d2, e2, f2, g2, h2, i2, j2);
    }

    public static class_1792 method14604() {
        return class_1802.field_8399;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void method14605(class_4587 q2, float r2, int s2, int t2, float u2, boolean v2, boolean w2, boolean x2) {
        if (!Class1567.method14636(Class4122.field9561).method_31044().method_31034()) return;
        if (!Class365.method4718().method1265()) {
            int n2 = 60777;
            Class1668.method15147(2090049289, 642492961, 1433378464, 121269222);
            return;
        }
        int n3 = 60776;
        block8: while (true) {
            switch (n3) {
                case 60777: {
                    n3 = 60775;
                    continue block8;
                }
                case 60776: {
                    return;
                }
            }
            break;
        }
        double y2 = ((Integer)Class4122.field9561.field_1690.method_41808().method_41753()).intValue();
        q2.method_34425(Class4122.field9561.field_1773.method_22973(y2));
        q2.method_34426();
        if (((Boolean)Class4122.field9561.field_1690.method_42448().method_41753()).booleanValue()) {
            class_1657 a2 = (class_1657)Class1567.method14746().method_1560();
            float b2 = a2.field_5973 - a2.field_6039;
            float c2 = -(a2.field_5973 + b2 * r2);
            float d2 = class_3532.method_16439((float)r2, (float)a2.field_7505, (float)Class1567.method14589(a2));
            q2.method_46416(class_3532.method_15374((float)(c2 * (float)Math.PI)) * d2 * 0.5f, -Math.abs(class_3532.method_15362((float)(c2 * (float)Math.PI)) * d2), 0.0f);
            q2.method_22907(Class1567.method14586().rotationDegrees(class_3532.method_15374((float)(c2 * Class1001.field4153)) * d2 * 3.0f));
            q2.method_22907(class_7833.field_40714.rotationDegrees(Math.abs(class_3532.method_15362((float)(c2 * (float)Math.PI - 0.2f)) * d2) * 5.0f));
        }
        float z2 = class_3532.method_16439((float)r2, (float)Class1567.method14618().field_1724.field_3914, (float)Class1567.method14638().field_1724.field_3916);
        float A2 = class_3532.method_16439((float)r2, (float)Class1567.method14576((class_310)Class4122.field9561).field_3931, (float)Class1567.method14716(Class4122.field9561.field_1724));
        q2.method_22907(class_7833.field_40714.rotationDegrees((Class1567.method14635(Class4122.field9561).method_5695(r2) - z2) * 0.1f));
        q2.method_22907(Class1567.method14742().rotationDegrees((Class1567.method14709(Class4122.field9561).method_5705(r2) - A2) * Class1455.field5536));
        float B2 = Class4122.field9561.field_1724.method_6055(r2);
        class_1268 C2 = !Class309.method2410().method1265() ? (class_1268)MoreObjects.firstNonNull((Object)Class4122.field9561.field_1724.field_6266, (Object)class_1268.field_5808) : Class309.method2410().method2411();
        class_1799 E2 = Class1567.method14583().field_1724.method_6047();
        class_1799 F2 = Class4122.field9561.field_1724.method_6079();
        int G2 = !E2.method_31574(class_1802.field_8102) && !F2.method_31574(class_1802.field_8102) ? (int)field5872[0] : (int)field5872[1];
        int D2 = E2.method_31574(Class1567.method14680()) || F2.method_31574(class_1802.field_8399) ? (int)field5872[1] : (int)field5872[0];
        Class603 H2 = Class1567.method14559();
        if (G2 == 0 && D2 == 0) {
            H2 = Class603.field2935;
        } else if (Class4122.field9561.field_1724.method_6115()) {
            class_1799 e2 = Class4122.field9561.field_1724.method_6030();
            class_1268 f2 = Class4122.field9561.field_1724.method_6058();
            if (e2.method_31574(class_1802.field_8102) || e2.method_31574(class_1802.field_8399)) {
                H2 = Class603.method11246(f2);
                Class1668.method15147(334490932, -1545078393, 1692057651, -1978565515);
                return;
            }
            H2 = C2 == class_1268.field_5808 && Class4122.field9561.field_1724.method_6079().method_31574(class_1802.field_8399) && class_1764.method_7781((class_1799)Class4122.field9561.field_1724.method_6079()) ? Class603.field2931 : Class603.field2935;
        } else if (E2.method_31574(Class1567.method14604())) {
            if (!class_1764.method_7781((class_1799)E2)) {
                Class1567.method14661(0.66213113f, 0.8168292f);
                return;
            }
            H2 = Class1567.method14665();
        }
        class_1007 I2 = (class_1007)Class4122.field9561.method_1561().method_3953((class_1297)Class1567.method14629(Class4122.field9561));
        if (H2.field2937) {
            class_1306 i2;
            int g2 = C2 != class_1268.field_5808 ? (int)field5872[0] : (int)field5872[1];
            int h2 = Class4122.field9561.field_1724.field_6266 == class_1268.field_5808 ? (int)field5872[1] : (int)field5872[0];
            float k2 = h2 != 0 ? B2 : 0.0f;
            float j2 = 1.0f - class_3532.method_16439((float)r2, (float)Class4122.field9561.field_1773.field_4012.field_4053, (float)Class4122.field9561.field_1773.field_4012.field_4043);
            class_1306 class_13062 = i2 = g2 != 0 ? Class4122.field9561.field_1724.method_6068() : Class1567.method14714().field_1724.method_6068().method_5928();
            if (E2.method_7960() && g2 != 0 && !Class4122.field9561.field_1724.method_5767()) {
                Class1567.method14595(q2, r2, I2, i2, k2, j2, s2, t2, u2, v2, w2, x2);
            }
        }
        if (!H2.field2932) return;
        int l2 = C2 == class_1268.field_5810 ? (int)field5872[1] : (int)field5872[0];
        int m2 = Class4122.field9561.field_1724.field_6266 == Class1567.method14663() ? (int)field5872[1] : (int)field5872[0];
        float p2 = m2 != 0 ? B2 : 0.0f;
        float o2 = 1.0f - class_3532.method_16439((float)r2, (float)Class1567.method14609(Class1567.method14689((class_310)Class4122.field9561).field_4012), (float)Class4122.field9561.field_1773.field_4012.field_4052);
        class_1306 n4 = l2 != 0 ? Class4122.field9561.field_1724.method_6068().method_5928() : Class4122.field9561.field_1724.method_6068();
        int n5 = E2.method_7960() ? 5323 : 5324;
        block9: while (true) {
            switch (n5) {
                case 5324: {
                    n5 = 5322;
                    continue block9;
                }
                case 5323: {
                    if (l2 == 0 || Class4122.field9561.field_1724.method_5767()) return;
                    Class1567.method14595(q2, r2, I2, n4, p2, o2, s2, t2, u2, v2, w2, x2);
                    return;
                }
            }
            break;
        }
    }

    public static float method14606() {
        return field5867;
    }

    public static class_7833 method14607() {
        return class_7833.field_40716;
    }

    private static class_4587 method14608() {
        return Class1567.method14684();
    }

    public static float method14609(class_759 class_7593) {
        return class_7593.field_4051;
    }

    public static void method14610(class_583 class_5832, boolean bl2) {
        class_5832.field_3449 = bl2;
    }

    private static void method14611(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static Vector4f method14612() {
        return field5871;
    }

    public static List method14613(class_630 class_6302) {
        return class_6302.field_3663;
    }

    private static void method14614(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Vector4f method14615() {
        return field5868;
    }

    private static void method14616() {
        Class298.method1924();
    }

    public static class_630 method14617(class_572 class_5722) {
        return class_5722.field_3401;
    }

    private static class_310 method14618() {
        return Class1567.method14621();
    }

    public static class_4587 method14619() {
        return field5873;
    }

    public static class_630 method14620(class_572 class_5722) {
        return class_5722.field_3392;
    }

    public static class_310 method14621() {
        return Class4122.field9561;
    }

    private static void method14622(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static double method14623(class_1297 class_12972) {
        return class_12972.field_5971;
    }

    public static class_310 method14624() {
        return Class4122.field9561;
    }

    private static void method14625(class_4587 a2, double b2, double c2, double d2, int e2, int f2, float g2, boolean h2, boolean i2, boolean j2, class_630 k2) {
        Class1567.method14582(a2, k2, b2, c2, d2, e2, f2, g2, h2, i2, j2);
    }

    private static Vector4f method14626() {
        return Class1567.method14643();
    }

    public static class_630 method14627(class_578 class_5782) {
        return class_5782.field_27448;
    }

    public static void method14628(class_4587 c2, class_742 d2, Class6402 e2, float f2, int g2, int h2, float i2, boolean j2, boolean k2, boolean l2) {
        double m2 = e2.method24408();
        double n2 = e2.method24409();
        double o2 = e2.method24411();
        Class1567.method14691().method_22903();
        class_897 p2 = Class4122.field9561.method_1561().method_3953((class_1297)d2);
        if (p2 instanceof class_1007) {
            class_1007 b2 = (class_1007)p2;
            float a2 = b2.method_4045((class_1309)d2, f2);
            Class1567.method14579(d2, field5873, a2, d2.method_43078(), f2);
            field5873.method_22905(-1.0f, -1.0f, 1.0f);
            b2.method_4217(d2, field5873, f2);
            field5873.method_22904(0.0, Class6110.field12332, 0.0);
            Class1567.method14582(c2, e2.field_3398, m2, n2, o2, g2, h2, i2, j2, k2, l2);
            Class1567.method14582(c2, e2.field_3391, m2, n2, o2, g2, h2, i2, j2, k2, l2);
            Class1567.method14718(c2, e2.field_27433, m2, n2, o2, g2, h2, i2, j2, k2, l2);
            Class1567.method14582(c2, e2.field_3401, m2, n2, o2, g2, h2, i2, j2, k2, l2);
            Class1567.method14739(c2, e2.field_3397, m2, n2, o2, g2, h2, i2, j2, k2, l2);
            Class1567.method14582(c2, e2.field_3392, m2, n2, o2, g2, h2, i2, j2, k2, l2);
        }
        field5873.method_22909();
    }

    public static class_746 method14629(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method14630(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static Vector4f method14631() {
        return Class1567.method14751();
    }

    public static float method14632(Vector3f vector3f) {
        return vector3f.x;
    }

    public static float method14633(Vector4f vector4f) {
        return vector4f.x;
    }

    public static class_4587 method14634() {
        return field5873;
    }

    public static class_746 method14635(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_315 method14636(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method14637() {
        Class4146.method20694();
    }

    private static class_310 method14638() {
        return Class1567.method14667();
    }

    private static Vector4f method14639() {
        return Class1567.method14615();
    }

    public static class_4587 method14640() {
        return field5873;
    }

    private static void method14641(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Vector4f method14642() {
        return field5871;
    }

    public static Vector4f method14643() {
        return field5871;
    }

    private static void method14644() {
        Class4146.method20697();
    }

    private static int method14645(int n2, int n3, Class3935 class3935, Class396 class396) {
        return Class6098.method23926(n2, n3, class3935, class396);
    }

    private static double method14646(class_1297 class_12972) {
        return Class1567.method14655(class_12972);
    }

    public static float method14647(Vector4f vector4f) {
        return vector4f.y;
    }

    private static void method14648() {
        Class6454.method24594();
    }

    public static class_630 method14649(class_578 class_5782) {
        return class_5782.field_27443;
    }

    public static class_7833 method14650() {
        return class_7833.field_40716;
    }

    private static void method14651(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static void method14652(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method14653() {
        Class4146.method20694();
    }

    public static Vector4f method14654() {
        return field5870;
    }

    public static double method14655(class_1297 class_12972) {
        return class_12972.field_5989;
    }

    public static Class4218 method14656() {
        return Class6009.field11998;
    }

    public static class_630 method14657(class_596 class_5962) {
        return class_5962.field_27482;
    }

    private static void method14658() {
        Class3979.method19561();
    }

    /*
     * Unable to fully structure code
     */
    public static void method14659(class_4587 F, class_1297 G, float H, int I, int J, float K, boolean L, boolean M, boolean N) {
        block54: {
            block42: {
                block52: {
                    block53: {
                        block49: {
                            block50: {
                                block51: {
                                    block47: {
                                        block48: {
                                            block46: {
                                                block41: {
                                                    block45: {
                                                        block43: {
                                                            block44: {
                                                                O = class_3532.method_16436((double)H, (double)G.field_6038, (double)G.method_23317());
                                                                P = class_3532.method_16436((double)H, (double)Class1567.method14623(G), (double)G.method_23318());
                                                                Q = class_3532.method_16436((double)H, (double)Class1567.method14646(G), (double)G.method_23321());
                                                                Class1567.field5873.method_22903();
                                                                R = Class1567.method14624().method_1561().method_3953(G);
                                                                if (!(R instanceof class_922)) break block42;
                                                                z = (class_922)R;
                                                                q = (class_1309)G;
                                                                r = z.method_4038();
                                                                if (!(R instanceof class_1007)) {
                                                                    while (true) {
                                                                        // Infinite loop
                                                                    }
                                                                }
                                                                d = (class_1007)R;
                                                                a = (class_591)d.method_4038();
                                                                a.field_3400 = G.method_18276();
                                                                b = class_1007.method_4210((class_742)((class_742)G), (class_1268)class_1268.field_5808);
                                                                c = class_1007.method_4210((class_742)((class_742)G), (class_1268)class_1268.field_5810);
                                                                if (!b.method_30156()) break block43;
                                                                if (!q.method_6079().method_7960()) break block44;
                                                                v0 = 57786;
                                                                ** GOTO lbl28
                                                            }
                                                            v0 = 57787;
                                                            if (true) ** GOTO lbl28
                                                            block19: while (true) {
                                                                v0 = 57785;
lbl28:
                                                                // 3 sources

                                                                switch (v0) {
                                                                    case 57787: {
                                                                        continue block19;
                                                                    }
                                                                    case 57786: {
                                                                        v1 = class_572.class_573.field_3409;
                                                                        break block19;
                                                                    }
                                                                    default: {
                                                                        v1 = c = class_572.class_573.field_3410;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        if (q.method_6068() != class_1306.field_6183) {
                                                            Class1567.method14653();
                                                            return;
                                                        }
                                                        a.field_3395 = b;
                                                        a.field_3399 = c;
                                                        r.field_3447 = q.method_6055(H);
                                                        Class1567.method14610(r, q.method_5765());
                                                        r.field_3448 = q.method_6109();
                                                        s = class_3532.method_17821((float)H, (float)q.field_6220, (float)q.field_6283);
                                                        t = class_3532.method_17821((float)H, (float)q.field_6259, (float)q.field_6241);
                                                        u = t - s;
                                                        if (!q.method_5765()) break block45;
                                                        v2 = 31127;
                                                        ** GOTO lbl56
                                                    }
                                                    v2 = 31128;
                                                    if (true) ** GOTO lbl56
                                                    do {
                                                        v2 = var23_26 = 31126;
lbl56:
                                                        // 3 sources

                                                        if (var23_26 == 31127) break block41;
                                                    } while (var23_26 == 31128);
                                                    break block46;
                                                }
                                                var24_27 = q.method_5854();
                                                if (var24_27 instanceof class_1309) {
                                                    f = (class_1309)var24_27;
                                                    s = class_3532.method_17821((float)H, (float)Class1567.method14573(f), (float)f.field_6283);
                                                    u = t - s;
                                                    e = class_3532.method_15393((float)u);
                                                    if (e < -85.0f) {
                                                        e = -85.0f;
                                                    }
                                                    if (e >= Class3574.field7948) {
                                                        e = 85.0f;
                                                    }
                                                    s = t - e;
                                                    if (e * e > 2500.0f) {
                                                        s += (float)((double)e * 0.2);
                                                    }
                                                    u = t - s;
                                                }
                                            }
                                            w = class_3532.method_16439((float)H, (float)q.field_6004, (float)q.method_36455());
                                            v = z.method_4045(q, H);
                                            x = 0.0f;
                                            y = 0.0f;
                                            if (q.method_5765()) break block47;
                                            if (!q.method_5805()) break block48;
                                            v3 = 54996;
                                            ** GOTO lbl88
                                        }
                                        v3 = 54997;
                                        if (true) ** GOTO lbl88
                                        do {
                                            v3 = var27_32 = 54995;
lbl88:
                                            // 3 sources

                                            if (var27_32 != 54996) continue;
                                            Class5836.method22890();
                                            return;
                                        } while (var27_32 == 54997);
                                    }
                                    r.method_2816((class_1297)q, y, x, H);
                                    r.method_2819((class_1297)q, y, x, v, u, w);
                                    z.method_4058(q, Class1567.field5873, v, s, H, 1.0f);
                                    Class1567.field5873.method_22905(-1.0f, -1.0f, 1.0f);
                                    z.method_4042(q, Class1567.field5873, H);
                                    Class1567.field5873.method_22904(0.0, Class1090.field4426, 0.0);
                                    if (!(r instanceof class_4592)) break block49;
                                    l = (class_4592)r;
                                    if (!l.field_3448) break block50;
                                    Class1567.field5873.method_22903();
                                    if (!((J)l).hookGetHeadScaled()) break block51;
                                    v4 = 32845;
                                    ** GOTO lbl111
                                }
                                v4 = 32846;
                                if (true) ** GOTO lbl111
                                block22: while (true) {
                                    v4 = 32844;
lbl111:
                                    // 3 sources

                                    switch (v4) {
                                        case 32846: {
                                            continue block22;
                                        }
                                        case 32845: {
                                            g = Class3689.field8282 / ((J)l).hookGetInvertedChildHeadScale();
                                            Class1567.field5873.method_22905(g, g, g);
                                        }
                                    }
                                    break;
                                }
                                Class1567.field5873.method_22904(0.0, (double)(((J)l).hookGetChildHeadYOffset() / 16.0f), (double)(((J)l).hookGetChildHeadZOffset() / 16.0f));
                                if (r instanceof class_572) {
                                    h = (class_572)r;
                                    Class1567.method14630(F, h.field_3398, O, P, Q, I, J, K, L, M, N);
                                } else {
                                    ((J)l).hookGetHeadParts().forEach((Consumer<class_630>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method14676(net.minecraft.client.util.math.MatrixStack double double double int int float boolean boolean boolean net.minecraft.client.model.ModelPart ), (Lnet/minecraft/class_630;)V)((class_4587)F, (double)O, (double)P, (double)Q, (int)I, (int)J, (float)K, (boolean)L, (boolean)M, (boolean)N));
                                }
                                Class1567.field5873.method_22909();
                                Class1567.field5873.method_22903();
                                j = 1.0f / ((J)l).hookGetInvertedChildBodyScale();
                                Class1567.field5873.method_22905(j, j, j);
                                Class1567.field5873.method_22904(0.0, (double)(((J)l).hookGetChildBodyYOffset() / 16.0f), 0.0);
                                if (!(r instanceof class_572)) {
                                    Class1567.method14652(0.93783355f, 0.73811895f);
                                    return;
                                }
                                i = (class_572)r;
                                Class1567.method14743(F, i.field_3391, O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, Class1567.method14724(i), O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, Class1567.method14617(i), O, P, Q, I, J, K, L, M, N);
                                Class1567.method14567(F, Class1567.method14594(i), O, P, Q, I, J, K, L, M, N);
                                Class1567.method14701(F, Class1567.method14669(i), O, P, Q, I, J, K, L, M, N);
                                Class1567.field5873.method_22909();
                                break block42;
                            }
                            if (r instanceof class_572) {
                                k = (class_572)r;
                                Class1567.method14582(F, Class1567.method14672(k), O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, k.field_3391, O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, k.field_27433, O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, k.field_3401, O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, k.field_3397, O, P, Q, I, J, K, L, M, N);
                                Class1567.method14582(F, Class1567.method14721(k), O, P, Q, I, J, K, L, M, N);
                            } else {
                                ((J)l).hookGetHeadParts().forEach((Consumer<class_630>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method14681(net.minecraft.client.util.math.MatrixStack double double double int int float boolean boolean boolean net.minecraft.client.model.ModelPart ), (Lnet/minecraft/class_630;)V)((class_4587)F, (double)O, (double)P, (double)Q, (int)I, (int)J, (float)K, (boolean)L, (boolean)M, (boolean)N));
                                ((J)l).hookGetBodyParts().forEach((Consumer<class_630>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method14670(net.minecraft.client.util.math.MatrixStack double double double int int float boolean boolean boolean net.minecraft.client.model.ModelPart ), (Lnet/minecraft/class_630;)V)((class_4587)F, (double)O, (double)P, (double)Q, (int)I, (int)J, (float)K, (boolean)L, (boolean)M, (boolean)N));
                            }
                            break block42;
                        }
                        v5 = r;
                        Objects.requireNonNull(v5);
                        var29_36 = v5;
                        var30_38 = (int)Class1567.field5872[0];
                        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_5597.class, class_4595.class, class_578.class, class_596.class}, (Object)var29_36, var30_38) ^ -1439828293) {
                            default: {
                                break block42;
                            }
                            case -1439828296: {
                                break block52;
                            }
                            case -1439828295: {
                                break block53;
                            }
                            case -1439828294: {
                                break;
                            }
                            case -1439828293: {
                                m = (class_5597)var29_36;
                                Class1567.method14593(F, m.method_32008(), O, P, Q, I, J, K, L, M, N);
                                while (true) {
                                    // Infinite loop
                                }
                            }
                        }
                        n = (class_4595)var29_36;
                        n.method_22960().forEach((Consumer<class_630>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method14625(net.minecraft.client.util.math.MatrixStack double double double int int float boolean boolean boolean net.minecraft.client.model.ModelPart ), (Lnet/minecraft/class_630;)V)((class_4587)F, (double)O, (double)P, (double)Q, (int)I, (int)J, (float)K, (boolean)L, (boolean)M, (boolean)N));
                        break block42;
                    }
                    o = (class_578)var29_36;
                    if (o.field_3448) {
                        Class1567.field5873.method_22903();
                        Class1567.method14704().method_22905(Class1476.field5591, 0.64935064f, 0.7936508f);
                        Class1567.field5873.method_22904(0.0, 1.3125, 0.2199999988079071);
                        Class1567.method14675(F, o.field_27443, O, P, Q, I, J, K, L, M, N);
                        Class1567.field5873.method_22909();
                        Class1567.field5873.method_22903();
                        Class1567.field5873.method_22905(0.625f, 0.45454544f, Class5422.field10084);
                        Class1567.field5873.method_22904(0.0, 2.0625, 0.0);
                        Class1567.method14582(F, o.field_27444, O, P, Q, I, J, K, L, M, N);
                        Class1567.field5873.method_22909();
                        Class1567.method14745().method_22903();
                        Class1567.method14608().method_22905(Class6467.field13443, 0.41322312f, Class5968.field11883);
                        Class1567.field5873.method_22904(0.0, 2.0625, 0.0);
                        Class1567.method14582(F, o.field_27445, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27446, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27447, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, Class1567.method14627(o), O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27449, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14698(F, o.field_27450, O, P, Q, I, J, K, L, M, N);
                        Class1567.field5873.method_22909();
                    } else {
                        Class1567.method14582(F, Class1567.method14649(o), O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27444, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27445, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27446, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27447, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, Class1567.method14597(o), O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27449, O, P, Q, I, J, K, L, M, N);
                        Class1567.method14582(F, o.field_27450, O, P, Q, I, J, K, L, M, N);
                    }
                    break block42;
                }
                p = (class_596)var29_36;
                if (p.field_3448) {
                    Class1567.field5873.method_22903();
                    Class1567.field5873.method_22905(0.56666666f, 0.56666666f, 0.56666666f);
                    Class1567.method14752().method_22904(0.0, 1.375, 0.125);
                    Class1567.method14611(F, p.field_27486, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14678(F, p.field_27488, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14710(F, Class1567.method14664(p), O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_3530, O, P, Q, I, J, K, L, M, N);
                    Class1567.field5873.method_22909();
                    Class1567.field5873.method_22903();
                    Class1567.field5873.method_22905(0.4f, 0.4f, 0.4f);
                    Class1567.method14715().method_22904(0.0, 2.25, 0.0);
                    Class1567.method14582(F, p.field_27480, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27481, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14574(F, Class1567.method14566(p), O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27483, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, Class1567.method14692(p), O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27484, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27485, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_3524, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14690().method_22909();
                } else {
                    Class1567.method14702().method_22903();
                    Class1567.field5873.method_22905(Class1223.field4799, Class1762.field6609, 0.6f);
                    Class1567.field5873.method_22904(0.0, 1.0, 0.0);
                    Class1567.method14582(F, p.field_27480, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27481, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14695(F, Class1567.method14657(p), O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27483, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_3528, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27484, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14734(F, Class1567.method14722(p), O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27486, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27487, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_27488, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_3524, O, P, Q, I, J, K, L, M, N);
                    Class1567.method14582(F, p.field_3530, O, P, Q, I, J, K, L, M, N);
                    Class1567.field5873.method_22909();
                }
            }
            if (!(R instanceof class_892)) break block54;
            v6 = 12162;
            ** GOTO lbl258
        }
        v6 = 12163;
        if (true) ** GOTO lbl258
        block24: while (true) {
            v6 = 12161;
lbl258:
            // 3 sources

            switch (v6) {
                case 12163: {
                    continue block24;
                }
                case 12162: {
                    E = (class_892)R;
                    B = (class_1511)G;
                    Class1567.field5873.method_22903();
                    C = Class375.method4932().method1265() != false && Class375.method4932().method4926() == false ? -1.0f : class_892.method_23155((class_1511)B, (float)H);
                    D = ((float)Class1567.method14564(B) + H) * (Class375.method4932().method1265() ? Class375.method4932().method4934() : 1.0f) * 3.0f;
                    Class1567.field5873.method_22903();
                    if (Class1567.method14728().method1265()) {
                        A = Class1567.method14707().method4930();
                        Class1567.field5873.method_22905(A, A, A);
                    }
                    Class1567.field5873.method_22905(2.0f, 2.0f, 2.0f);
                    Class1567.field5873.method_46416(0.0f, Class6167.field12504, 0.0f);
                    Class1567.field5873.method_22907(class_7833.field_40716.rotationDegrees(D));
                    Class1567.method14619().method_22904(0.0, (double)(1.5f + C / 2.0f), 0.0);
                    Class1567.field5873.method_22907(new Quaternionf().setAngleAxis(1.0471976f, Class1567.method14671(), 0.0f, Class1567.method14606()));
                    Class1567.method14582(F, E.field_21004, O, P, Q, I, J, K, L, M, N);
                    Class1567.field5873.method_22905(0.875f, 0.875f, 0.875f);
                    Class1567.field5873.method_22907(new Quaternionf().setAngleAxis(1.0471976f, Class1567.field5867, 0.0f, Class1567.field5867));
                    Class1567.field5873.method_22907(Class1567.method14650().rotationDegrees(D));
                    Class1567.method14741(F, E.field_21004, O, P, Q, I, J, K, L, M, N);
                    Class1567.field5873.method_22905(0.875f, 0.875f, 0.875f);
                    Class1567.field5873.method_22907(new Quaternionf().setAngleAxis(Class3874.field8808, Class1567.field5867, 0.0f, Class1567.field5867));
                    Class1567.method14683().method_22907(class_7833.field_40716.rotationDegrees(D));
                    Class1567.field5873.method_22909();
                    Class1567.method14640().method_22909();
                }
            }
            break;
        }
        Class1567.method14703().method_22909();
    }

    private static float method14660(Vector4f vector4f) {
        return Class1567.method14700(vector4f);
    }

    private static void method14661(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method14662() {
        Class4146.method20697();
    }

    public static class_1268 method14663() {
        return class_1268.field_5808;
    }

    public static class_630 method14664(class_596 class_5962) {
        return class_5962.field_27487;
    }

    public static Class603 method14665() {
        return Class603.field2931;
    }

    private static class_4587 method14666() {
        return Class1567.method14725();
    }

    public static class_310 method14667() {
        return Class4122.field9561;
    }

    public static float method14668(class_1309 class_13092) {
        return class_13092.field_6220;
    }

    private static class_630 method14669(class_572 class_5722) {
        return Class1567.method14620(class_5722);
    }

    private static void method14670(class_4587 a2, double b2, double c2, double d2, int e2, int f2, float g2, boolean h2, boolean i2, boolean j2, class_630 k2) {
        Class1567.method14753(a2, k2, b2, c2, d2, e2, f2, g2, h2, i2, j2);
    }

    public static float method14671() {
        return field5867;
    }

    public static class_630 method14672(class_572 class_5722) {
        return class_5722.field_3398;
    }

    private static int method14673(int n2, int n3, Class52 class52, Class1 class1) {
        return Class6098.method23898(n2, n3, class52, class1);
    }

    private static void method14674(float f2) {
        Class5836.method22907(f2);
    }

    private static void method14675(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static void method14676(class_4587 a2, double b2, double c2, double d2, int e2, int f2, float g2, boolean h2, boolean i2, boolean j2, class_630 k2) {
        Class1567.method14582(a2, k2, b2, c2, d2, e2, f2, g2, h2, i2, j2);
    }

    private static void method14677(class_4587 b2, class_630.class_628 c2, double d2, double e2, double f2, int g2, int h2, float i2, boolean j2, boolean k2, boolean l2) {
        Matrix4f m2 = Class1567.method14685().method_23760().method_23761();
        class_630.class_593[] class_593Array = c2.field_3649;
        int n2 = class_593Array.length;
        for (int i3 = (int)field5872[0]; i3 < n2; ++i3) {
            class_630.class_593 a2 = class_593Array[i3];
            field5868.set(a2.field_3502[(int)Class1567.field5872[0]].field_3605.x / 16.0f, a2.field_3502[(int)Class1567.field5872[0]].field_3605.y / 16.0f, a2.field_3502[(int)Class1567.field5872[0]].field_3605.z / 16.0f, 1.0f);
            field5868.mul((Matrix4fc)m2);
            field5870.set(Class1567.method14599((class_630.class_618)a2.field_3502[(int)Class1567.field5872[1]]).x / 16.0f, a2.field_3502[(int)Class1567.field5872[1]].field_3605.y / 16.0f, a2.field_3502[(int)Class1567.field5872[1]].field_3605.z / 16.0f, 1.0f);
            Class1567.method14580().mul((Matrix4fc)m2);
            field5871.set(Class1567.method14632(a2.field_3502[(int)Class1567.field5872[2]].field_3605) / Class5639.field10794, a2.field_3502[(int)Class1567.field5872[2]].field_3605.y / 16.0f, Class1567.method14732(a2.field_3502[(int)Class1567.field5872[2]].field_3605) / Class1261.field4934, 1.0f);
            field5871.mul((Matrix4fc)m2);
            field5869.set(a2.field_3502[(int)Class1567.field5872[3]].field_3605.x / 16.0f, a2.field_3502[(int)Class1567.field5872[3]].field_3605.y / 16.0f, a2.field_3502[(int)Class1567.field5872[3]].field_3605.z / 16.0f, 1.0f);
            field5869.mul((Matrix4fc)m2);
            if (k2) {
                if (l2) {
                    Class1567.method14584(Class6009.field11996, b2);
                    RenderSystem.setShaderTexture((int)((int)field5872[0]), (class_2960)class_918.field_43087);
                    Class6009.field11996.method20881(g2);
                    Class6009.field11996.method20863(d2 + (double)Class1567.field5868.x, e2 + (double)Class1567.field5868.y, f2 + (double)Class1567.field5868.z, 0.0f, 0.0f).method20863(d2 + (double)Class1567.field5870.x, e2 + (double)Class1567.field5870.y, f2 + (double)Class1567.field5870.z, 0.0f, 1.0f).method20863(d2 + (double)Class1567.method14585().x, e2 + (double)Class1567.field5871.y, f2 + (double)Class1567.field5871.z, 1.0f, 1.0f).method20863(d2 + (double)Class1567.method14726(field5869), e2 + (double)Class1567.field5869.y, f2 + (double)Class1567.field5869.z, 1.0f, 0.0f);
                    Class6009.field11996.method20865();
                } else {
                    Class6009.field11995.method20891(b2);
                    Class6009.field11995.method20881(g2);
                    Class1567.method14575(Class6009.field11995.method20866(d2 + (double)Class1567.field5868.x, e2 + (double)Class1567.field5868.y, f2 + (double)Class1567.field5868.z).method20866(d2 + (double)Class1567.field5870.x, e2 + (double)Class1567.method14679().y, f2 + (double)Class1567.field5870.z), d2 + (double)Class1567.field5871.x, e2 + (double)Class1567.method14626().y, f2 + (double)Class1567.method14642().z).method20866(d2 + (double)Class1567.method14727(Class1567.method14713()), e2 + (double)Class1567.field5869.y, f2 + (double)Class1567.field5869.z);
                    Class6009.field11995.method20865();
                }
            }
            if (!j2) continue;
            Class1567.method14656().method20891(b2);
            RenderSystem.lineWidth((float)i2);
            Class6009.field11998.method20881(h2);
            Class6009.field11998.method20883(d2 + (double)Class1567.method14569(field5868), e2 + (double)Class1567.method14562().y, f2 + (double)Class1567.field5868.z, d2 + (double)Class1567.method14581(Class1567.method14654()), e2 + (double)Class1567.field5870.y, f2 + (double)Class1567.method14631().z);
            Class1567.method14590().method20883(d2 + (double)Class1567.field5870.x, e2 + (double)Class1567.field5870.y, f2 + (double)Class1567.field5870.z, d2 + (double)Class1567.field5871.x, e2 + (double)Class1567.field5871.y, f2 + (double)Class1567.method14612().z);
            Class1567.method14591(Class6009.field11998, d2 + (double)Class1567.field5871.x, e2 + (double)Class1567.method14749(field5871), f2 + (double)Class1567.method14570(field5871), d2 + (double)Class1567.field5869.x, e2 + (double)Class1567.field5869.y, f2 + (double)Class1567.field5869.z);
            Class1567.method14600(Class6009.field11998, d2 + (double)Class1567.method14719(field5868), e2 + (double)Class1567.field5868.y, f2 + (double)Class1567.method14639().z, d2 + (double)Class1567.field5868.x, e2 + (double)Class1567.method14647(field5868), f2 + (double)Class1567.method14660(Class1567.method14596()));
            Class1567.method14720(Class6009.field11998);
        }
    }

    private static void method14678(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static Vector4f method14679() {
        return field5870;
    }

    public static class_1792 method14680() {
        return class_1802.field_8399;
    }

    private static void method14681(class_4587 a2, double b2, double c2, double d2, int e2, int f2, float g2, boolean h2, boolean i2, boolean j2, class_630 k2) {
        Class1567.method14582(a2, k2, b2, c2, d2, e2, f2, g2, h2, i2, j2);
    }

    private static void method14682() {
        Class4146.method20697();
    }

    public static class_4587 method14683() {
        return field5873;
    }

    public static class_4587 method14684() {
        return field5873;
    }

    public static class_4587 method14685() {
        return field5873;
    }

    private static void method14686() {
        Class1503.method14420();
    }

    private static void method14687(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method14688(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_757 method14689(class_310 class_3102) {
        return Class1567.method14731(class_3102);
    }

    public static class_4587 method14690() {
        return field5873;
    }

    public static class_4587 method14691() {
        return field5873;
    }

    public static class_630 method14692(class_596 class_5962) {
        return class_5962.field_3528;
    }

    private static void method14693(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method14694(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method14695(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static int method14696(int n2, int n3, Class2298 class2298, Class139 class139) {
        return Class6098.method23917(n2, n3, class2298, class139);
    }

    public static class_310 method14697() {
        return Class4122.field9561;
    }

    private static void method14698(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static void method14699(class_1309 class_13092, class_4587 class_45872, float f2, float f3, float f4) {
        Class1567.method14747(class_13092, class_45872, f2, f3, f4);
    }

    public static float method14700(Vector4f vector4f) {
        return vector4f.z;
    }

    private static void method14701(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_4587 method14702() {
        return field5873;
    }

    public static class_4587 method14703() {
        return field5873;
    }

    public static class_4587 method14704() {
        return field5873;
    }

    private static void method14705() {
        Class3979.method19561();
    }

    private static void method14706() {
        Class3979.method19561();
    }

    private static Class375 method14707() {
        return Class375.method4932();
    }

    private static void method14708(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method14709(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method14710(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static class_310 method14711() {
        return Class1567.method14697();
    }

    private static void method14712() {
        Class1807.method15744();
    }

    public static Vector4f method14713() {
        return field5869;
    }

    public static class_310 method14714() {
        return Class4122.field9561;
    }

    private static class_4587 method14715() {
        return Class1567.method14563();
    }

    public static float method14716(class_746 class_7462) {
        return class_7462.field_3932;
    }

    private static void method14717() {
        Class5836.method22897();
    }

    private static void method14718(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static float method14719(Vector4f vector4f) {
        return Class1567.method14588(vector4f);
    }

    private static void method14720(Class4218 class4218) {
        class4218.method20865();
    }

    public static class_630 method14721(class_572 class_5722) {
        return class_5722.field_3392;
    }

    public static class_630 method14722(class_596 class_5962) {
        return class_5962.field_27485;
    }

    private static int method14723(int n2, int n3, Class1736 class1736, Class803 class803) {
        return Class6098.method23843(n2, n3, class1736, class803);
    }

    public static class_630 method14724(class_572 class_5722) {
        return class_5722.field_27433;
    }

    public static class_4587 method14725() {
        return field5873;
    }

    public static float method14726(Vector4f vector4f) {
        return vector4f.x;
    }

    private static float method14727(Vector4f vector4f) {
        return Class1567.method14633(vector4f);
    }

    private static Class375 method14728() {
        return Class375.method4932();
    }

    private static float method14729(class_2350 a2) {
        float f2;
        switch (Class1567.method14601()[a2.ordinal()]) {
            case 1: {
                f2 = 90.0f;
                break;
            }
            case 2: {
                float f3 = 0.0f;
                return Class803.method12252(0.65595555f, 0.82374734f, Class3590.field7998);
            }
            case 3: {
                f2 = Class1322.field5123;
                break;
            }
            case 4: {
                f2 = Class969.field4045;
                break;
            }
            default: {
                f2 = 0.0f;
            }
        }
        return f2;
    }

    private static float method14730() {
        return Class6322.method24337();
    }

    public static class_757 method14731(class_310 class_3102) {
        return class_3102.field_1773;
    }

    public static float method14732(Vector3f vector3f) {
        return vector3f.z;
    }

    private static void method14733() {
        Class6009.method23560();
    }

    private static void method14734(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_4587 method14735() {
        return field5873;
    }

    public static class_4587 method14736() {
        return field5873;
    }

    private static void method14737() {
        Class4146.method20694();
    }

    private static void method14738(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method14739(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    private static void method14740() {
        Class1807.method15744();
    }

    private static void method14741(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_7833 method14742() {
        return class_7833.field_40716;
    }

    private static void method14743(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_757 method14744(class_310 class_3102) {
        return class_3102.field_1773;
    }

    public static class_4587 method14745() {
        return field5873;
    }

    public static class_310 method14746() {
        return Class4122.field9561;
    }

    public static void method14747(class_1309 d2, class_4587 e2, float f2, float g2, float h2) {
        if (d2.method_32314()) {
            g2 += (float)(Math.cos((double)d2.field_6012 * Class3634.field8119) * Math.PI * (double)0.4f);
        }
        if (!d2.method_41328(class_4050.field_18078)) {
            e2.method_22907(class_7833.field_40716.rotationDegrees(180.0f - g2));
        }
        if (d2.field_6213 > 0) {
            float f3;
            float a2 = ((float)d2.field_6213 + h2 - 1.0f) / 20.0f * 1.6f;
            a2 = class_3532.method_15355((float)a2);
            if (f3 > 1.0f) {
                a2 = 1.0f;
            }
            e2.method_22907(class_7833.field_40718.rotationDegrees(a2 * Class6018.field12031));
            Class5836.method22885();
            return;
        }
        if (d2.method_6123()) {
            e2.method_22907(class_7833.field_40714.rotationDegrees(Class5765.field11184 - d2.method_36455()));
            e2.method_22907(class_7833.field_40716.rotationDegrees(((float)d2.field_6012 + h2) * -75.0f));
        } else if (d2.method_41328(class_4050.field_18078)) {
            class_2350 b2 = d2.method_18401();
            float c2 = b2 != null ? Class1567.method14729(b2) : g2;
            e2.method_22907(class_7833.field_40716.rotationDegrees(c2));
            e2.method_22907(class_7833.field_40718.rotationDegrees(Class751.field3401));
            e2.method_22907(class_7833.field_40716.rotationDegrees(Class3489.field7680));
        } else if (class_922.method_38563((class_1309)d2)) {
            e2.method_46416(0.0f, d2.method_17682() + 0.1f, 0.0f);
            e2.method_22907(class_7833.field_40718.rotationDegrees(180.0f));
        }
    }

    private static void method14748() {
        Class5836.method22890();
    }

    public static float method14749(Vector4f vector4f) {
        return vector4f.y;
    }

    public static double method14750(class_243 class_2432) {
        return class_2432.field_1351;
    }

    static {
        field5872 = new long[4];
        Class1567.method14598(-2611429590941186735L);
        field5867 = (float)Math.sin(0.7853981633974483);
        field5873 = new class_4587();
        field5868 = new Vector4f();
        field5870 = new Vector4f();
        field5871 = new Vector4f();
        field5869 = new Vector4f();
    }

    public static Vector4f method14751() {
        return field5870;
    }

    public static class_4587 method14752() {
        return field5873;
    }

    private static void method14753(class_4587 class_45872, class_630 class_6302, double d2, double d3, double d4, int n2, int n3, float f2, boolean bl2, boolean bl3, boolean bl4) {
        Class1567.method14582(class_45872, class_6302, d2, d3, d4, n2, n3, f2, bl2, bl3, bl4);
    }

    public static class_8080 method14754(class_1309 class_13092) {
        return class_13092.field_42108;
    }

    private static void method14755(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

