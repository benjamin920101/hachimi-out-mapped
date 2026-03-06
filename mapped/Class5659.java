/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.GameMode
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.CobwebBlock
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.registry.tag.EntityTypeTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  org.joml.Math
 */
package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mapped.Class1002;
import mapped.Class1162;
import mapped.Class1215;
import mapped.Class123;
import mapped.Class1377;
import mapped.Class14;
import mapped.Class180;
import mapped.Class1807;
import mapped.Class2830;
import mapped.Debug;
import mapped.MaceSpoof;
import mapped.TextRadar;
import mapped.Yaw;
import mapped.Class3583;
import mapped.Ping;
import mapped.Class3691;
import mapped.Blink;
import mapped.BreakESP;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Replenish;
import mapped.Class4089;
import mapped.Class4122;
import mapped.Class4196;
import mapped.Class4197;
import mapped.Velocity;
import mapped.Class5449;
import mapped.Class5649;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class596;
import mapped.Class613;
import mapped.Class6454;
import mapped.Class681;
import mapped.Class712;
import mapped.Class76;
import mapped.Class803;
import mapped.Class821;
import net.hachimi.client.mixin.ac;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.CobwebBlock;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class5659 {
    private static long[] field10852 = new long[2];

    private static double method22097(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    private static int method22098() {
        return Class6454.method24637();
    }

    private static boolean method22099() {
        return Class5836.method22894();
    }

    private static boolean method22100() {
        return Blink.method4987();
    }

    public static int method22101() {
        if (Class5659.method22226().method_1562() == null) {
            return (int)field10852[0];
        }
        class_640 a2 = Class4122.field9561.method_1562().method_2871(Class4122.field9561.field_1724.method_5667());
        if (a2 == null) {
            return (int)field10852[0];
        }
        return a2.method_2959();
    }

    public static double method22102(double a2, double b2, double c2) {
        return Math.sqrt(Class5659.method22110(a2, b2, c2));
    }

    public static double method22103(class_1297 a2) {
        return Class5659.method22191(a2.method_23317(), a2.method_23318() + (double)a2.method_18381(a2.method_18376()), a2.method_23321());
    }

    public static class_310 method22104() {
        return Class4122.field9561;
    }

    public static boolean method22105(class_243 a2, double b2) {
        return (Class5659.method22097(a2.method_10216(), a2.method_10214(), a2.method_10215()) <= b2 * b2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static boolean method22106() {
        return Class1807.method15742();
    }

    private static boolean method22107(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static class_310 method22108() {
        return Class4122.field9561;
    }

    private static boolean method22109() {
        return Class3979.method19551();
    }

    public static double method22110(double a2, double b2, double c2) {
        return Class5659.method22200(Class5659.method22138(Class4122.field9561).method_23317(), Class5659.method22221().field_1724.method_23318(), Class4122.field9561.field_1724.method_23321(), a2, b2, c2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method22111() {
        int n2;
        if (!Class5659.method22192(Class4122.field9561).method_5805()) {
            n2 = (int)field10852[0];
            return n2 != 0;
        }
        int n3 = !Class4122.field9561.field_1724.method_29504() ? 8848 : 8849;
        while (true) {
            int n4;
            if ((n4 = n3) == 8848) {
                n2 = (int)field10852[1];
                return n2 != 0;
            }
            if (n4 != 8849) return Class5659.method22194();
            n3 = 8847;
        }
    }

    public static class_746 method22112(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_2350[] method22113() {
        return Class5449.field10190;
    }

    public static class_3959.class_242 method22114() {
        return class_3959.class_242.field_1348;
    }

    public static boolean method22115(class_243 a2) {
        class_3965 b2 = Class5659.method22133(Class4122.field9561).method_17742(new class_3959(Class4122.field9561.field_1724.method_33571(), a2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)Class4122.field9561.field_1724));
        return (b2 == null || b2.method_17783() == Class5659.method22168() ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    public static double method22116(class_1297 a2) {
        return Class5659.method22102(a2.method_23317(), a2.method_23318(), a2.method_23321());
    }

    public static boolean method22117(class_243 a2, double b2) {
        return (Class5659.method22159(a2.method_10216(), a2.method_10214(), a2.method_10215()) <= b2 * b2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    public static class_746 method22118(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method22119(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method22120() {
        return Velocity.method10322();
    }

    private static List method22121(class_238 class_2383) {
        return Class5449.method21083(class_2383);
    }

    public static class_310 method22122() {
        return Class4122.field9561;
    }

    private static boolean method22123(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method22124() {
        return Class3979.method19543();
    }

    /*
     * Unable to fully structure code
     */
    public static boolean method22125(class_1657 d, class_2338 e, boolean f, boolean g, boolean h, boolean i) {
        block12: {
            if (d.method_5829().method_994(new class_238(e))) {
                return (boolean)((int)Class5659.field10852[0]);
            }
            if (!h) ** GOTO lbl-1000
            if (i) {
                v0 = 65296;
                return Class5659.method22183(0.5246468857845179, 0.24484337408025547, 0.5279742158938769, 0.5200905981361088, 0.4546794071288045, Class1377.field5314);
            }
            v1 = 65297;
            if (true) ** GOTO lbl11
            block4: while (true) {
                v1 = 65295;
lbl11:
                // 2 sources

                switch (v1) {
                    case 65297: {
                        continue block4;
                    }
                    case 65296: {
                        v2 = Class5659.method22113();
                        break block4;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (h) {
                            v2 = Class5659.method22217();
                            break block4;
                        }
                        if (i) {
                            v2 = Class5449.field10186;
                            break block4;
                        }
                        v2 = j = null;
                    }
                }
                break;
            }
            if (j != null) break block12;
            v3 = 41359;
            ** GOTO lbl33
        }
        v3 = 41360;
        if (true) ** GOTO lbl33
        do {
            v3 = var7_7 = 41358;
lbl33:
            // 3 sources

            if (var7_7 != 41359) continue;
            return Class5659.method22229(0.1571289161428817, 0.42774467515665127, 0.3840017936061908, 0.23506199144528428);
        } while (var7_7 == 41360);
        var8_8 = j;
        var9_9 = var8_8.length;
        for (var10_10 = (int)Class5659.field10852[0]; var10_10 < var9_9; ++var10_10) {
            c = var8_8[var10_10];
            a = e.method_10093(c);
            b = Class5659.method22147(d, (boolean)Class5659.field10852[0]);
            if (!f && e.method_10264() == b.method_10264()) continue;
            if (g) {
                return Class4196.method20801();
            }
            if (e.method_10264() == b.method_10084().method_10264()) continue;
            return Class803.method12224(0.7564186902501662, 0.2831175566550087, 0.5242376543145314, 0.5271367574746015, 0.4023142518208752, 0.1181871281181095);
        }
        return (boolean)((int)Class5659.field10852[0]);
    }

    private static boolean method22126() {
        return Class5659.method22194();
    }

    private static int method22127(int n2, int n3, TextRadar class325, Class180 class180) {
        return Class4089.method20428(n2, n3, class325, class180);
    }

    private static int method22128(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static class_304[] method22129(class_315 class_3152) {
        return class_3152.field_1852;
    }

    public static double method22130(class_1297 a2) {
        return Class5659.method22171(a2.method_23317(), a2.method_23318() + (double)a2.method_18381(a2.method_18376()), a2.method_23321());
    }

    private static int method22131(int n2, int n3, Class596 class596, MaceSpoof class322) {
        return Class4089.method20421(n2, n3, class596, class322);
    }

    public static boolean method22132(class_2338 a2) {
        return Class5659.method22150(a2.method_10263(), a2.method_10264(), a2.method_10260());
    }

    public static class_638 method22133(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static class_746 method22134(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method22135(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static List method22136(class_238 c2) {
        ArrayList<class_2338> d2 = new ArrayList<class_2338>();
        for (class_2338 b2 : Class5449.method21095(c2)) {
            class_2680 a2 = Class4122.field9561.field_1687.method_8320(b2);
            if (!(a2.method_26204() instanceof class_2560)) continue;
            d2.add(b2);
        }
        return d2;
    }

    public static List method22137() {
        return Class5659.method22141(Class5659.method22134(Class5659.method22161()).method_19538());
    }

    public static class_746 method22138(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method22139(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method22140() {
        return Class5659.method22111();
    }

    public static List method22141(class_243 a2) {
        return Class5449.method21083(new class_238(a2.method_10216() - 0.3, a2.method_10214(), a2.method_10215() - 0.3, a2.method_10216() + 0.3, a2.method_10214() + 0.4, a2.method_10215() + 0.3));
    }

    private static int method22142(int n2, int n3, Class613 class613, Class123 class123) {
        return Class4089.method20390(n2, n3, class613, class123);
    }

    public static class_310 method22143() {
        return Class4122.field9561;
    }

    private static double method22144(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    public static double method22145(class_2338 a2) {
        return Class5659.method22102(a2.method_10263(), a2.method_10264(), a2.method_10260());
    }

    private static boolean method22146() {
        return Class3979.method19539();
    }

    private static class_2338 method22147(class_1657 class_16572, boolean bl2) {
        return Class5659.method22153(class_16572, bl2);
    }

    public static class_310 method22148() {
        return Class4122.field9561;
    }

    private static boolean method22149() {
        return Class3979.method19539();
    }

    public static boolean method22150(double a2, double b2, double c2) {
        return (Class5659.method22200(Class4122.field9561.field_1724.method_23317(), Class4122.field9561.field_1724.method_23320(), Class4122.field9561.field_1724.method_23321(), a2, b2, c2) <= Class4122.field9561.field_1724.method_55754() * Class5659.method22203().field_1724.method_55754() ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static boolean method22151() {
        return Class3979.method19539();
    }

    private static boolean method22152(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static class_2338 method22153(class_1657 a2, boolean b2) {
        if (b2) {
            return a2.method_24515();
        }
        return new class_2338.class_2339(Math.floor(a2.method_23317()), (double)Math.round(a2.method_23318()), Math.floor(a2.method_23321()));
    }

    public static class_634 method22154(class_746 class_7462) {
        return class_7462.field_3944;
    }

    public static double method22155(class_243 a2) {
        return Class5659.method22102(a2.method_10216(), a2.method_10214(), a2.method_10215());
    }

    public static boolean method22156(class_1792 a2) {
        class_1799 b2 = Class4122.field9561.field_1724.method_6047();
        if (!b2.method_7960() && b2.method_7909() == a2) {
            return (int)field10852[1] != 0;
        }
        b2 = Class5659.method22230().field_1724.method_6079();
        return (!b2.method_7960() && b2.method_7909() == a2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static boolean method22157() {
        return Class1807.method15753();
    }

    public static class_239.class_240 method22158() {
        return class_239.class_240.field_1333;
    }

    private static double method22159(double d2, double d3, double d4) {
        return Class5659.method22110(d2, d3, d4);
    }

    public static class_310 method22160() {
        return Class4122.field9561;
    }

    public static class_310 method22161() {
        return Class4122.field9561;
    }

    public static boolean method22162(class_1297 a2) {
        int e2;
        class_243 b2 = new class_243(0.0, 0.0, 0.0);
        class_243 c2 = new class_243(0.0, 0.0, 0.0);
        ((ac)b2).setX(Class5659.method22148().field_1724.method_23317());
        ((ac)b2).setY(Class4122.field9561.field_1724.method_23318() + (double)Class4122.field9561.field_1724.method_5751());
        ((ac)b2).setZ(Class4122.field9561.field_1724.method_23321());
        ((ac)c2).setX(a2.method_23317());
        ((ac)c2).setY(a2.method_23318());
        ((ac)c2).setZ(a2.method_23321());
        int d2 = Class5659.method22173().field_1687.method_17742(new class_3959(b2, c2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)Class4122.field9561.field_1724)).method_17783() == Class5659.method22197() ? (int)field10852[1] : (int)field10852[0];
        ((ac)c2).setX(a2.method_23317());
        ((ac)c2).setY(a2.method_23318() + (double)a2.method_5751());
        ((ac)c2).setZ(a2.method_23321());
        int n2 = e2 = Class4122.field9561.field_1687.method_17742(new class_3959(b2, c2, class_3959.class_3960.field_17558, Class5659.method22114(), (class_1297)Class4122.field9561.field_1724)).method_17783() == Class5659.method22177() ? (int)field10852[1] : (int)field10852[0];
        return (d2 != 0 || e2 != 0 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method22163(class_2338 a2, double b2) {
        int n2;
        int n3 = !(Class5659.method22110(a2.method_10263(), a2.method_10264(), a2.method_10260()) <= b2 * b2) ? 60647 : 60646;
        block4: while (true) {
            switch (n3) {
                case 60647: {
                    n3 = 60645;
                    continue block4;
                }
                case 60646: {
                    n2 = (int)field10852[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field10852[0];
        return n2 != 0;
    }

    public static double method22164(class_2338 a2) {
        return Class5659.method22175(a2.method_10263(), a2.method_10264(), a2.method_10260());
    }

    public static List method22165() {
        return Class5659.method22121(new class_238(Class4122.field9561.field_1724.method_23317() - Class2830.field6834, Class5659.method22169().field_1724.method_23318() + Class4197.field9801, Class4122.field9561.field_1724.method_23321() - Class1162.field4635, Class5659.method22196(Class4122.field9561).method_23317() + 0.3, Class4122.field9561.field_1724.method_23318() + Class3583.field7974, Class5659.method22108().field_1724.method_23321() + 0.3));
    }

    public static class_310 method22166() {
        return Class4122.field9561;
    }

    private static int method22167(int n2, int n3, Class3691 class3691, Debug class300) {
        return Class4089.method20392(n2, n3, class3691, class300);
    }

    private static class_239.class_240 method22168() {
        return Class5659.method22158();
    }

    public static class_310 method22169() {
        return Class4122.field9561;
    }

    private static void method22170(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static double method22171(double a2, double b2, double c2) {
        class_243 d2 = Class5659.method22218(Class4122.field9561).method_19418().method_19326();
        return Class5659.method22200(d2.field_1352, d2.field_1351, d2.field_1350, a2, b2, c2);
    }

    private static boolean method22172() {
        return Velocity.method10322();
    }

    private static class_310 method22173() {
        return Class5659.method22122();
    }

    private static boolean method22174(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static double method22175(double d2, double d3, double d4) {
        return Class5659.method22110(d2, d3, d4);
    }

    private static boolean method22176(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static class_239.class_240 method22177() {
        return class_239.class_240.field_1333;
    }

    private static void method22178(long l2) {
        Class5659.field10852[1] = l2 ^ 0x2C24425779453806L;
        Class5659.field10852[0] = l2 ^ 0x2C24425779453807L;
    }

    private static boolean method22179(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static boolean method22180(class_1309 b2) {
        for (class_1799 a2 : b2.method_5661()) {
            if (a2 == null || a2.method_7960()) continue;
            return (int)field10852[0] != 0;
        }
        return (int)field10852[1] != 0;
    }

    public static double method22181(double a2, double b2, double c2, double d2, double e2, double f2) {
        return Math.sqrt(Class5659.method22200(a2, b2, c2, d2, e2, f2));
    }

    public static class_310 method22182() {
        return Class4122.field9561;
    }

    private static boolean method22183(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static void method22184() {
        double a2 = (double)class_3532.method_15357((double)Class4122.field9561.field_1724.method_23317()) + 0.5;
        double b2 = (double)class_3532.method_15357((double)Class5659.method22112(Class4122.field9561).method_23321()) + 0.5;
        Class5659.method22199(Class4122.field9561).method_5814(a2, Class4122.field9561.field_1724.method_23318(), b2);
        Class5659.method22154(Class4122.field9561.field_1724).method_52787((class_2596)new class_2828.class_2829(Class5659.method22104().field_1724.method_23317(), Class4122.field9561.field_1724.method_23318(), Class5659.method22214(Class5659.method22143()).method_23321(), Class5659.method22118(Class4122.field9561).method_24828()));
    }

    public static boolean method22185(class_1297 a2, double b2) {
        if (Class5659.method22110(a2.method_23317(), a2.method_23318(), a2.method_23321()) <= b2 * b2) {
            int n2 = (int)field10852[1];
            return Class5659.method22193(0.28540161195956826);
        }
        return (int)field10852[0] != 0;
    }

    public static boolean method22186(class_1297 a2, double b2) {
        return (Class5659.method22171(a2.method_23317(), a2.method_23318(), a2.method_23321()) <= b2 * b2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static boolean method22187() {
        return Replenish.method6431();
    }

    public static boolean method22188(double a2, double b2, double c2, double d2) {
        return (Class5659.method22110(a2, b2, c2) <= d2 * d2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static int method22189(int n2) {
        return Class4045.method20095(n2);
    }

    private static boolean method22190() {
        return Velocity.method10322();
    }

    public static double method22191(double a2, double b2, double c2) {
        return Math.sqrt(Class5659.method22144(a2, b2, c2));
    }

    public static class_746 method22192(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static boolean method22193(double c2) {
        Iterator iterator = Class5449.method21095(Class4122.field9561.field_1724.method_5829().method_1014(c2)).iterator();
        if (iterator.hasNext()) {
            class_2338 b2 = (class_2338)iterator.next();
            class_2680 a2 = Class4122.field9561.field_1687.method_8320(b2);
            if (a2.method_26204() instanceof class_2560) {
                return (int)field10852[1] != 0;
            }
            return Replenish.method6431();
        }
        return (int)field10852[0] != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method22194() {
        int n2 = (int)field10852[0];
        class_304[] class_304Array = Class5659.method22129(Class4122.field9561.field_1690);
        int n3 = class_304Array.length;
        if (n2 >= n3) {
            return Class5659.method22194();
        }
        int n4 = 47253;
        block4: while (true) {
            switch (n4) {
                case 47254: {
                    n4 = 47252;
                    continue block4;
                }
                case 47253: {
                    class_304 a2 = class_304Array[n2];
                    if (!a2.method_1434()) {
                        return Class5659.method22206(0.22575509246979808, 0.4275373093998325, Class821.field3613, Class1002.field4158, 0.9470676837411696, 0.7939509925523608);
                    }
                    return (int)field10852[1] != 0;
                }
            }
            break;
        }
        return (int)field10852[0] != 0;
    }

    private static class_746 method22195(class_310 class_3102) {
        return Class5659.method22139(class_3102);
    }

    private static class_746 method22196(class_310 class_3102) {
        return Class5659.method22224(class_3102);
    }

    private static class_239.class_240 method22197() {
        return Class5659.method22207();
    }

    private static boolean method22198() {
        return Class1807.method15742();
    }

    public static class_746 method22199(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method22200(double a2, double b2, double c2, double d2, double e2, double f2) {
        double g2 = a2 - d2;
        double h2 = b2 - e2;
        double i2 = c2 - f2;
        return org.joml.Math.fma((double)g2, (double)g2, (double)org.joml.Math.fma((double)h2, (double)h2, (double)(i2 * i2)));
    }

    public static double method22201(class_1297 a2) {
        return Class5659.method22110(a2.method_23317(), a2.method_23318(), a2.method_23321());
    }

    private static boolean method22202() {
        return Velocity.method10252();
    }

    public static class_310 method22203() {
        return Class4122.field9561;
    }

    public static boolean method22204(class_1297 a2) {
        return Class5659.method22150(a2.method_23317(), a2.method_23318(), a2.method_23321());
    }

    public static int method22205(float c2, float d2) {
        if (!Class5659.method22160().field_1724.method_5864().method_20210(class_3483.field_42971)) {
            return Class5659.method22128(1118579651, 2064806886);
        }
        return (int)field10852[0];
    }

    private static boolean method22206(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static class_239.class_240 method22207() {
        return class_239.class_240.field_1333;
    }

    public static float method22208() {
        return Class4122.field9561.field_1724.method_6032() + Class5659.method22195(Class4122.field9561).method_6067();
    }

    public static boolean method22209(class_2338 a2, double b2) {
        return (Class5659.method22171(a2.method_10263(), a2.method_10264(), a2.method_10260()) <= b2 * b2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    private static int method22210(int n2, int n3, Class14 class14, BreakESP class380) {
        return Class4089.method20371(n2, n3, class14, class380);
    }

    private static boolean method22211(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method22212(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static int method22213(int n2, int n3, Yaw class327, Class681 class681) {
        return Class4089.method20370(n2, n3, class327, class681);
    }

    public static class_746 method22214(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method22215(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method22216(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static class_2350[] method22217() {
        return Class5449.field10188;
    }

    public static class_757 method22218(class_310 class_3102) {
        return class_3102.field_1773;
    }

    private static boolean method22219() {
        return Velocity.method10322();
    }

    public static class_1934 method22220() {
        if (Class4122.field9561.field_1724 == null) {
            return null;
        }
        class_640 a2 = Class5659.method22166().method_1562().method_2871(Class4122.field9561.field_1724.method_5667());
        if (a2 == null) {
            return null;
        }
        return a2.method_2958();
    }

    static {
        Class5659.method22178(3180740180294580231L);
    }

    public static class_310 method22221() {
        return Class4122.field9561;
    }

    public static boolean method22222(class_243 a2) {
        return Class5659.method22179(a2.method_10216(), a2.method_10214(), a2.method_10215());
    }

    public static float method22223() {
        return Class4122.field9561.field_1724.method_6032() + Class4122.field9561.field_1724.method_6067();
    }

    public static class_746 method22224(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method22225(int n2, int n3, Class712 class712, Ping class359) {
        return Class4089.method20375(n2, n3, class712, class359);
    }

    private static class_310 method22226() {
        return Class5659.method22182();
    }

    private static int method22227(int n2, int n3, Class76 class76, Class59 class59) {
        return Class4089.method20403(n2, n3, class76, class59);
    }

    private static boolean method22228(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static boolean method22229(double a2, double b2, double c2, double d2) {
        return (Class5659.method22171(a2, b2, c2) <= d2 * d2 ? (int)field10852[1] : (int)field10852[0]) != 0;
    }

    public static class_310 method22230() {
        return Class4122.field9561;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

