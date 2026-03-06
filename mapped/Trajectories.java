/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.ProjectileEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.entity.projectile.TridentEntity
 *  net.minecraft.entity.projectile.thrown.PotionEntity
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.EggItem
 *  net.minecraft.item.EnderPearlItem
 *  net.minecraft.item.ExperienceBottleItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.LingeringPotionItem
 *  net.minecraft.item.SnowballItem
 *  net.minecraft.item.SplashPotionItem
 *  net.minecraft.item.TridentItem
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  com.mojang.blaze3d.systems.VertexSorter
 *  org.joml.Matrix4f
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import mapped.Class1;
import mapped.Class1097;
import mapped.Class1108;
import mapped.Class1306;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1702;
import mapped.Class1745;
import mapped.Class1758;
import mapped.Class1807;
import mapped.Class1815;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class28;
import mapped.Chams;
import mapped.Class3687;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4065;
import mapped.Class4068;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class4265;
import mapped.Colors;
import mapped.Class526;
import mapped.Class5450;
import mapped.Class556;
import mapped.Class5575;
import mapped.Class5659;
import mapped.Class5763;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6006;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class6322;
import mapped.Class6427;
import mapped.Class6454;
import mapped.Class685;
import mapped.Class773;
import mapped.Class909;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.LingeringPotionItem;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.item.TridentItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import com.mojang.blaze3d.systems.VertexSorter;
import org.joml.Matrix4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Trajectories
extends Class278 {
    Class248 field1384 = this.method450(new Class253("Hand", "Render the trajectory of the projectile you\u2019re holding", (boolean)field1386[0]));
    Class248 field1385 = this.method450(new Class253("Pearl", "Render the trajectory path of the pearls", (boolean)field1386[0]));
    private static long[] field1386 = new long[7];

    private static void method5763() {
        Class5836.method22885();
    }

    private static int method5764(Colors class457, int n2) {
        return class457.method10615(n2);
    }

    private static void method5765(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_238 method5766(class_1297 class_12972) {
        return Class6023.method23731(class_12972);
    }

    private static void method5767() {
        Class6009.method23561();
    }

    public static class_2248 method5768() {
        return class_2246.field_10382;
    }

    private static void method5769() {
        Class3979.method19561();
    }

    public static class_746 method5770(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method5771(int n2, int n3, Class526 class526, Class1097 class1097) {
        return Class4065.method20185(n2, n3, class526, class1097);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method5772(class_1297 a2) {
        if (a2 instanceof class_1683) return (int)field1386[0] != 0;
        if (a2 instanceof class_1684) return (int)field1386[0] != 0;
        if (a2 instanceof class_1303) return (int)field1386[0] != 0;
        int n2 = a2 instanceof class_1686 ? 38556 : 38555;
        block4: while (true) {
            switch (n2) {
                case 38556: {
                    n2 = 38554;
                    continue block4;
                }
                case 38555: {
                    if (a2 instanceof class_1667) return (int)field1386[0] != 0;
                    if (a2 instanceof class_1685) return (int)field1386[0] != 0;
                    while (true) {
                        // Infinite loop
                    }
                }
            }
            break;
        }
        return (int)field1386[0] != 0;
    }

    private static void method5773(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5774(Class59 K) {
        block52: {
            block48: {
                block49: {
                    block53: {
                        block51: {
                            L = new class_4587();
                            Class6009.method23560();
                            if (!((Boolean)this.field1385.method507()).booleanValue()) break block51;
                            block16: for (class_1297 k : Trajectories.field290.field_1687.method_18112()) {
                                block47: {
                                    if (!(k instanceof class_1684)) continue;
                                    if (!((Boolean)this.field1385.method507()).booleanValue()) {
                                        Class6009.method23559(true);
                                        return;
                                    }
                                    v0 = 61524;
                                    if (true) ** GOTO lbl13
                                    do {
                                        v0 = var5_5 = 61523;
lbl13:
                                        // 2 sources

                                        if (var5_5 == 61524) break block47;
                                    } while (var5_5 == 61525);
                                    Class4146.method20694();
                                    return;
                                }
                                i = new Class773((class_1676)k);
                                j = (int)Trajectories.field1386[4];
                                for (h = (int)Trajectories.field1386[4]; h < (int)Trajectories.field1386[5]; ++h) {
                                    g = i.method12121();
                                    if (g != null) {
                                        if (g.method_17783() == class_239.class_240.field_1332 && g instanceof class_3965) {
                                            e = (class_3965)g;
                                            a = e.method_17780();
                                            b = e.method_17777().method_10263();
                                            c = e.method_17777().method_10264();
                                            d = e.method_17777().method_10260();
                                            Class6454.method24658(K.method125(), b, c, d, b + (int)Trajectories.field1386[0], c + (int)Trajectories.field1386[0], d + (int)Trajectories.field1386[0], a, Colors.method10620().method10615((int)Trajectories.field1386[2]));
                                            continue block16;
                                        }
                                        if (g.method_17783() != class_239.class_240.field_1331) continue block16;
                                        if (!(g instanceof class_3966)) {
                                            Trajectories.method5837();
                                            return;
                                        }
                                        f = (class_3966)g;
                                        Class6454.method24621(Trajectories.method5808(K), Trajectories.method5766(f.method_17782()), Colors.method10620().method10615((int)Trajectories.field1386[1]));
                                        Class6454.method24605(K.method125(), Class6023.method23731(f.method_17782()), 1.5f, Colors.method10620().method10615((int)Trajectories.field1386[6]));
                                        continue block16;
                                    }
                                    Class6454.method24682(Trajectories.method5783(K), new class_243(i.field_6014, i.field_6036, i.field_5969), i.method_19538(), 1.5f, Colors.method10620().method10618(j).getRGB());
                                    j += 40;
                                }
                            }
                        }
                        if (!((Boolean)Trajectories.method5776(this.field1384)).booleanValue()) break block52;
                        G = ((Integer)Trajectories.field290.field_1690.method_41808().method_41753()).intValue();
                        H = Trajectories.field290.field_1724.method_6047();
                        I = H.method_7909();
                        L.method_34425(Trajectories.field290.field_1773.method_22973(G));
                        J = RenderSystem.getProjectionMatrix();
                        RenderSystem.setProjectionMatrix((Matrix4f)L.method_23760().method_23761(), (class_8251)class_8251.field_43360);
                        if (I instanceof class_1753 || I instanceof class_1764) ** GOTO lbl-1000
                        if (!(I instanceof class_1835)) break block53;
                        v1 = 34282;
                        if (true) ** GOTO lbl61
                    }
                    v2 = 34283;
                    Class4146.method20694();
                    return;
                    block19: while (true) {
                        v1 = 34281;
lbl61:
                        // 2 sources

                        switch (v1) {
                            case 34283: {
                                continue block19;
                            }
                            case 34282: lbl-1000:
                            // 2 sources

                            {
                                if (Trajectories.field290.field_1724.method_6048() > 0) break block19;
                            }
                            default: {
                                if (!this.method5799(I)) break block48;
                            }
                        }
                        break;
                    }
                    s = Trajectories.method5839(Trajectories.field290).method_36454();
                    t = Class6023.method23738(Trajectories.field290.field_1724.field_6014, Trajectories.field290.field_1724.method_23317(), Trajectories.field290.method_60646().method_60637((boolean)Trajectories.field1386[0]));
                    u = Class6023.method23738(Trajectories.method5838((class_310)Trajectories.field290).field_6036, Trajectories.field290.field_1724.method_23318(), Trajectories.field290.method_60646().method_60637((boolean)Trajectories.field1386[0]));
                    v = Class6023.method23738(Trajectories.field290.field_1724.field_5969, Trajectories.field290.field_1724.method_23321(), Trajectories.field290.method_60646().method_60637((boolean)Trajectories.field1386[0]));
                    u = u + (double)Trajectories.field290.field_1724.method_18381(Trajectories.field290.field_1724.method_18376()) - 0.1000000014901161;
                    if (I == Trajectories.field290.field_1724.method_6047().method_7909()) {
                        t -= (double)(class_3532.method_15362((float)(s / Class5575.field10583 * Class4265.field9963)) * 0.16f);
                        v -= (double)(class_3532.method_15374((float)(s / 180.0f * Class6427.field13343)) * 0.16f);
                    } else {
                        t += (double)(class_3532.method_15362((float)(s / Class1306.field5074 * 3.1415927f)) * 0.16f);
                        v += (double)(class_3532.method_15374((float)(s / 180.0f * 3.1415927f)) * 0.16f);
                    }
                    w = I instanceof class_1753 ? 1.0f : 0.4f;
                    x = -class_3532.method_15374((float)(s / 180.0f * Class4068.field9398)) * class_3532.method_15362((float)(Trajectories.field290.field_1724.method_36455() / 180.0f * 3.1415927f)) * w;
                    y = -class_3532.method_15374((float)((Trajectories.field290.field_1724.method_36455() + (float)(I instanceof class_1828 || I instanceof class_1803 || I instanceof class_1779 ? (int)Trajectories.field1386[3] : (int)Trajectories.field1386[4])) / 180.0f * 3.1415927f)) * w;
                    z = class_3532.method_15362((float)(s / 180.0f * 3.1415927f)) * class_3532.method_15362((float)(Trajectories.field290.field_1724.method_36455() / 180.0f * 3.1415927f)) * w;
                    A = (float)Trajectories.field290.field_1724.method_6048() / 20.0f;
                    A = (A * A + A * 2.0f) / 3.0f;
                    if (A > 1.0f) {
                        A = 1.0f;
                    }
                    B = class_3532.method_15355((float)((float)(x * x + y * y + z * z)));
                    x /= (double)B;
                    y /= (double)B;
                    z /= (double)B;
                    if (!(I instanceof class_1753)) {
                        Class3979.method19561();
                        return;
                    }
                    C = A * 2.0f * this.method5816(I);
                    x *= (double)C;
                    y *= (double)C;
                    z *= (double)C;
                    if (!Trajectories.field290.field_1724.method_24828()) {
                        y += Trajectories.field290.field_1724.method_18798().method_10214();
                    }
                    x += Trajectories.field290.field_1724.method_18798().method_10216();
                    z += Trajectories.field290.field_1724.method_18798().method_10215();
                    if (I instanceof class_1753) {
                        Class5836.method22885();
                        return;
                    }
                    v3 = 37647;
                    if (true) ** GOTO lbl109
                    block20: while (true) {
                        v3 = 37646;
lbl109:
                        // 2 sources

                        switch (v3) {
                            case 37648: {
                                continue block20;
                            }
                            case 37647: {
                                if (!(I instanceof class_1764)) break block20;
                            }
                            default: {
                                v4 = 0.3f;
                                break block49;
                            }
                        }
                        break;
                    }
                    v4 = 0.25f;
                }
                D = v4;
                F = (int)Trajectories.field1386[4];
                while (F == 0) {
                    block59: {
                        block60: {
                            block56: {
                                block55: {
                                    block50: {
                                        block54: {
                                            n = (int)Trajectories.field1386[4];
                                            E = new class_243(t, u, v);
                                            o = class_2338.method_49637((double)(t += x), (double)(u += y), (double)(v += z));
                                            if (Trajectories.field290.field_1687.method_8320(o).method_26204() == Trajectories.method5768()) {
                                                x *= 0.8;
                                                y *= 0.8;
                                                z *= 0.8;
                                            } else {
                                                x *= 0.99;
                                                y *= 0.99;
                                                z *= Class3687.field8269;
                                            }
                                            if (I instanceof class_1753) {
                                                y -= 0.05000000074505806;
                                                Trajectories.method5834();
                                                return;
                                            }
                                            if (!(Trajectories.method5770(Trajectories.field290).method_6047().method_7909() instanceof class_1764)) break block54;
                                            v5 = 4583;
                                            ** GOTO lbl145
                                        }
                                        v5 = 4584;
                                        if (true) ** GOTO lbl145
                                        do {
                                            v5 = var39_35 = 4582;
lbl145:
                                            // 3 sources

                                            if (var39_35 == 4583) break block50;
                                        } while (var39_35 == 4584);
                                        break block55;
                                    }
                                    y -= 0.05000000074505806;
                                    break block56;
                                }
                                y -= 0.029999999329447746;
                            }
                            p = new class_238(t - (double)D, u - (double)D, v - (double)D, t + (double)D, u + (double)D, v + (double)D);
                            var41_37 = Trajectories.field290.field_1687.method_8335(null, p).iterator();
                            block23: while (true) {
                                block58: {
                                    block57: {
                                        if (!var41_37.hasNext()) break block57;
                                        v6 = 59525;
                                        ** GOTO lbl165
                                    }
                                    v6 = 59526;
                                    if (true) ** GOTO lbl165
                                    while (true) {
                                        v6 = var42_38 = 59524;
lbl165:
                                        // 3 sources

                                        if (var42_38 == 59525) break;
                                        if (var42_38 != 59526) break block23;
                                    }
                                    l = (class_1297)var41_37.next();
                                    if (l == Trajectories.field290.field_1724) break block58;
                                    v7 = 45647;
                                    if (true) ** GOTO lbl178
                                }
                                v8 = 45648;
                                Class4036.method20085(0.22073835f, 0.18057209f, 0.89425445f, 0.68008566f, 0.770525f, 0.044588447f);
                                return;
                                block25: while (true) {
                                    v7 = 45646;
lbl178:
                                    // 2 sources

                                    switch (v7) {
                                        default: {
                                            continue block23;
                                        }
                                        case 45648: {
                                            continue block25;
                                        }
                                        case 45647: 
                                    }
                                    break;
                                }
                                if (this.method5772(l)) continue;
                                Class6454.method24621(K.method125(), Trajectories.method5787(l), Trajectories.method5764(Colors.method10620(), (int)Trajectories.field1386[1]));
                                Class6454.method24605(K.method125(), Class6023.method23731(l), 1.5f, Colors.method10620().method10615((int)Trajectories.field1386[6]));
                                n = (int)Trajectories.field1386[0];
                            }
                            q = new class_243(t, u, v);
                            r = Trajectories.method5807(Trajectories.field290).method_17742(new class_3959(E, q, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)Trajectories.field290.field_1724));
                            v9 = var44_40 = r != null ? 36337 : 36338;
                            if (var44_40 != 36337) {
                                if (var44_40 == 36338) {
                                    Class3979.method19561();
                                    return;
                                }
                                Trajectories.method5831();
                                return;
                            }
                            if (r.method_17783() != class_239.class_240.field_1332) break block59;
                            n = (int)Trajectories.field1386[0];
                            m = r.method_17780();
                            if (m == class_2350.field_11043) ** GOTO lbl-1000
                            if (m != class_2350.field_11035) break block60;
                            v10 = 52103;
                            if (true) ** GOTO lbl212
                        }
                        v11 = 52104;
                        while (true) {
                            // Infinite loop
                        }
                        block27: while (true) {
                            v10 = 52102;
lbl212:
                            // 2 sources

                            switch (v10) {
                                case 52104: {
                                    continue block27;
                                }
                                case 52103: lbl-1000:
                                // 2 sources

                                {
                                    Class6454.method24700(K.method125(), t - Class5763.field11171, u - 0.6000000238418579, v, t + 0.6000000238418579, u + Class1758.field6594, v, m, Colors.method10620().method10615((int)Trajectories.field1386[2]));
                                    break block27;
                                }
                                default: {
                                    if (m == class_2350.field_11039) ** GOTO lbl221
                                    if (m != class_2350.field_11034) ** GOTO lbl223
lbl221:
                                    // 2 sources

                                    Class6454.method24700(K.method125(), t, u - 0.6000000238418579, v - Class6006.field11986, t, u + Class1815.field6757, v + 0.6000000238418579, m, Colors.method10620().method10615((int)Trajectories.field1386[2]));
                                    break block27;
lbl223:
                                    // 1 sources

                                    Class6454.method24700(K.method125(), t - 0.6000000238418579, u, v - Class1702.field6312, t + 0.6000000238418579, u, v + 0.6000000238418579, m, Colors.method10620().method10615((int)Trajectories.field1386[2]));
                                }
                            }
                            break;
                        }
                    }
                    if (u < (double)Trajectories.field290.field_1687.method_31607()) break;
                    if (x == 0.0 && y == 0.0) {
                        if (z == 0.0) continue;
                    }
                    Class6454.method24682(Trajectories.method5825(K), E, q, 1.5f, Colors.method10620().method10621());
                    if (n == 0) continue;
                    F = (int)Trajectories.field1386[0];
                }
            }
            RenderSystem.setProjectionMatrix((Matrix4f)J, (class_8251)class_8251.field_43360);
        }
        Trajectories.method5820();
    }

    private static void method5775(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method5776(Class248 class248) {
        return class248.method507();
    }

    private static boolean method5777() {
        return Class4196.method20801();
    }

    private static boolean method5778(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method5779(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method5780() {
        Chams.method1924();
    }

    private static void method5781() {
        Class5836.method22885();
    }

    private static void method5782() {
        Class4146.method20697();
    }

    private static class_4587 method5783(Class59 class59) {
        return class59.method125();
    }

    private static void method5784() {
        Class4146.method20697();
    }

    private static float method5785() {
        return Class6322.method24336();
    }

    public Trajectories() {
        super("Trajectories", "Renders the trajectory path of projectiles", Class556.field2759);
    }

    private static void method5786() {
        Class5659.method22184();
    }

    private static class_238 method5787(class_1297 class_12972) {
        return Class6023.method23731(class_12972);
    }

    private static void method5788() {
        Class4146.method20694();
    }

    private static void method5789() {
        Class5836.method22890();
    }

    private static boolean method5790() {
        return Class3979.method19551();
    }

    private static void method5791(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5792() {
        Class5836.method22885();
    }

    private static void method5793() {
        Class1745.method15538();
    }

    private static void method5794() {
        Class3979.method19561();
    }

    private static void method5795(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5796() {
        Chams.method1924();
    }

    private static void method5797() {
        Chams.method1924();
    }

    private static void method5798() {
        Chams.method1924();
    }

    private boolean method5799(class_1792 a2) {
        return (a2 instanceof class_1776 || a2 instanceof class_1779 || a2 instanceof class_1823 || a2 instanceof class_1771 || a2 instanceof class_1828 || a2 instanceof class_1803 ? (int)field1386[0] : (int)field1386[4]) != 0;
    }

    private static void method5800(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5801(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5802(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5803() {
        Class5836.method22897();
    }

    private static void method5804() {
        Class6454.method24594();
    }

    private static int method5805(int n2, int n3, Class28 class28, Class5450 class5450) {
        return Class4065.method20188(n2, n3, class28, class5450);
    }

    private static void method5806() {
        Class5836.method22885();
    }

    private static class_638 method5807(class_310 class_3102) {
        return Trajectories.method5811(class_3102);
    }

    private static class_4587 method5808(Class59 class59) {
        return class59.method125();
    }

    private static void method5809() {
        Class5659.method22184();
    }

    private static void method5810(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_638 method5811(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method5812(int n2, int n3, Class909 class909, Class685 class685) {
        return Class4065.method20167(n2, n3, class909, class685);
    }

    private static void method5813() {
        Class1745.method15538();
    }

    private static void method5814() {
        Class5836.method22890();
    }

    private static void method5815(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private float method5816(class_1792 a2) {
        if (a2 instanceof class_1828 || a2 instanceof class_1803) {
            return 0.4f;
        }
        if (a2 instanceof class_1779) {
            return 0.5f;
        }
        if (a2 instanceof class_1835) {
            return 2.0f;
        }
        return 1.5f;
    }

    private static void method5817(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5818(long l2) {
        Trajectories.field1386[1] = l2 ^ 0xDB9C041133C4236CL;
        Trajectories.field1386[6] = l2 ^ 0xDB9C041133C423D5L;
        Trajectories.field1386[3] = l2 ^ 0x2463FBEECC3BDCA8L;
        Trajectories.field1386[4] = l2 ^ 0xDB9C041133C42344L;
        Trajectories.field1386[5] = l2 ^ 0xDB9C041133C422B0L;
        Trajectories.field1386[0] = l2 ^ 0xDB9C041133C42345L;
        Trajectories.field1386[2] = l2 ^ 0xDB9C041133C423C8L;
    }

    private static void method5819() {
        Class5836.method22885();
    }

    private static void method5820() {
        Class6009.method23561();
    }

    static {
        Trajectories.method5818(-2622216411107024060L);
    }

    private static void method5821(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5822() {
        Class4146.method20697();
    }

    private static void method5823(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5824(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static class_4587 method5825(Class59 class59) {
        return class59.method125();
    }

    private static boolean method5826() {
        return Class1807.method15742();
    }

    private static void method5827(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5828() {
        Class4146.method20697();
    }

    private static void method5829() {
        Class4146.method20694();
    }

    private static void method5830() {
        Class4146.method20694();
    }

    private static void method5831() {
        Class1503.method14420();
    }

    private static void method5832(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5833() {
        Class6009.method23560();
    }

    private static void method5834() {
        Class6454.method24594();
    }

    private static void method5835(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5836(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5837() {
        Class6009.method23561();
    }

    public static class_746 method5838(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5839(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5840() {
        Class5659.method22184();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

