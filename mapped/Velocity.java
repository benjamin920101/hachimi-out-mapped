/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.FishingBobberEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 *  net.minecraft.world.CollisionView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$AxisDirection
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.world.BlockCollisionSpliterator
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1226;
import mapped.Class133;
import mapped.Class1422;
import mapped.Class1447;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class167;
import mapped.Class1736;
import mapped.Class1807;
import mapped.Class181;
import mapped.Class191;
import mapped.Class195;
import mapped.Class207;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Chams;
import mapped.Debug;
import mapped.Class3348;
import mapped.Class3390;
import mapped.Class3466;
import mapped.Blink;
import mapped.Class3806;
import mapped.Class3871;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class411;
import mapped.Class4113;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Flatten;
import mapped.Class45;
import mapped.Server;
import mapped.Colors;
import mapped.Class46;
import mapped.Class48;
import mapped.Class50;
import mapped.Class524;
import mapped.Class53;
import mapped.Class543;
import mapped.Class5449;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5859;
import mapped.Class59;
import mapped.Class5951;
import mapped.Class6009;
import mapped.Class619;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class760;
import mapped.Class767;
import mapped.Class80;
import mapped.Class81;
import mapped.Class89;
import mapped.Class906;
import mapped.Class925;
import mapped.Class926;
import mapped.Class942;
import net.hachimi.client.mixin.bc;
import net.hachimi.client.mixin.bm;
import net.hachimi.client.mixin.c;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.CollisionView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.BlockCollisionSpliterator;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Velocity
extends Class411 {
    Class248 field2308;
    Class248 field2309;
    private boolean field2310;
    Class248 field2311;
    private static final int[] field2312;
    Class248 field2313;
    Class248 field2314;
    private static final double field2315;
    Class248 field2316;
    Class248 field2317;
    Class248 field2318;
    Class248 field2319;
    Class248 field2320;
    Class248 field2321;
    Class248 field2322;
    private static Velocity INSTANCE;
    public Class925 field2323;
    Class248 field2324;
    Class248 field2325;
    Class248 field2326;
    private boolean field2327;
    Class248 field2328;
    private static long[] field2329;
    Class248 field2330;
    Class248 field2331;
    Class248 field2332 = this.method450(new Class253("Knockback", "Removes player knockback velocity", (boolean)field2329[3]));
    private static final double[] field2333;
    Class248 field2334;
    public static boolean $skidonion$998553946;

    private static void method10161() {
        Class5659.method22184();
    }

    private static boolean method10162() {
        return Class5836.method22894();
    }

    private static void method10163() {
        Class5836.method22897();
    }

    private static boolean method10164(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method10165() {
        Chams.method1924();
    }

    private Boolean method10166() {
        return (Boolean)this.field2322.method507();
    }

    private static boolean method10167(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method10168() {
        return Blink.method4987();
    }

    private static int method10169(int n2, int n3, Class46 class46, Class3871 class3871) {
        return Class5859.method23061(n2, n3, class46, class3871);
    }

    private static boolean method10170() {
        return Replenish.method6431();
    }

    private static void method10171() {
        Class5836.method22890();
    }

    private static boolean method10172(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method10173(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static class_746 method10174(class_310 class_3102) {
        return Velocity.method10329(class_3102);
    }

    private static boolean method10175(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    /*
     * Unable to fully structure code
     */
    public boolean method10176(class_2743 a) {
        block27: {
            block28: {
                block29: {
                    if (!((Boolean)this.field2332.method507()).booleanValue()) break block27;
                    if (a.method_11818() != Velocity.field290.field_1724.method_5628()) {
                        return (boolean)((int)Velocity.field2329[1]);
                    }
                    if (a.method_11815() != 0.0 || a.method_11819() != 0.0) break block28;
                    if (a.method_11816() == 0.0) ** GOTO lbl-1000
                    if (!(a.method_11816() < 0.0)) break block29;
                    v0 = 65482;
                    ** GOTO lbl14
                }
                v0 = 65483;
                if (true) ** GOTO lbl14
                block12: while (true) {
                    v0 = 65481;
lbl14:
                    // 3 sources

                    switch (v0) {
                        case 65483: {
                            continue block12;
                        }
                        case 65482: {
                            if (!Velocity.field290.field_1724.method_24828()) ** GOTO lbl21
                            v1 = 51090;
                            ** GOTO lbl25
lbl21:
                            // 1 sources

                            v1 = 51091;
                            if (true) ** GOTO lbl25
                            block13: while (true) {
                                v1 = 51089;
lbl25:
                                // 3 sources

                                switch (v1) {
                                    case 51091: {
                                        continue block13;
                                    }
                                    case 51090: lbl-1000:
                                    // 2 sources

                                    {
                                        return (boolean)(!((Boolean)Velocity.method10310(this).method507()).booleanValue() ? (int)Velocity.field2329[3] : (int)Velocity.field2329[1]);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            if (((Boolean)Velocity.method10223(Velocity.method10191(this))).booleanValue()) {
                if (!Velocity.method10252()) {
                    if (!((Boolean)Velocity.method10281(this).method507()).booleanValue() || !this.method10336()) {
                        return (boolean)((int)Velocity.field2329[1]);
                    }
                }
                if (((Boolean)this.field2328.method507()).booleanValue() && !Velocity.method10265(Velocity.field290).method_24828()) {
                    return (boolean)((int)Velocity.field2329[1]);
                }
            }
            switch (((Class524)this.field2316.method507()).ordinal()) {
                case 0: {
                    if (((Float)Velocity.method10248(this.field2334)).floatValue() != 0.0f) ** GOTO lbl57
                    if (((Float)this.field2309.method507()).floatValue() != 0.0f) ** GOTO lbl43
                    v2 = 52020;
                    ** GOTO lbl47
lbl43:
                    // 1 sources

                    v2 = 52021;
                    if (true) ** GOTO lbl47
                    while (true) {
                        v2 = var2_2 = 52019;
lbl47:
                        // 3 sources

                        if (var2_2 == 52020) break;
                        if (var2_2 == 52021) {
                            continue;
                        }
                        ** GOTO lbl57
                        break;
                    }
                    if (((Boolean)this.field2321.method507()).booleanValue()) {
                        ((bc)a).setVelocityX((int)Velocity.field2329[1]);
                        ((bc)a).setVelocityY((int)Velocity.field2329[1]);
                        ((bc)a).setVelocityZ((int)Velocity.field2329[1]);
                        return (boolean)((int)Velocity.field2329[1]);
                    }
                    return (boolean)((int)Velocity.field2329[3]);
lbl57:
                    // 2 sources

                    ((bc)a).setVelocityX((int)(a.method_11815() * (double)(((Float)this.field2334.method507()).floatValue() / 100.0f)));
                    ((bc)a).setVelocityY((int)(a.method_11816() * (double)(((Float)this.field2309.method507()).floatValue() / 100.0f)));
                    ((bc)a).setVelocityZ((int)(a.method_11819() * (double)(((Float)this.field2334.method507()).floatValue() / Class3348.field7240)));
                    break;
                }
                case 1: {
                    if (Velocity.method10278(Class5723.field11056, ((Integer)this.field2331.method507()).intValue())) ** GOTO lbl75
                    if (!this.field2323.method12595((Number)this.field2326.method507())) ** GOTO lbl66
                    v3 = 3998;
                    ** GOTO lbl70
lbl66:
                    // 1 sources

                    v3 = 3999;
                    if (true) ** GOTO lbl70
                    while (true) {
                        v3 = var3_3 = 3997;
lbl70:
                        // 3 sources

                        if (var3_3 == 3998) break;
                        if (var3_3 == 3999) {
                            continue;
                        }
                        ** GOTO lbl75
                        break;
                    }
                    return (boolean)((int)Velocity.field2329[1]);
lbl75:
                    // 2 sources

                    if (!(Velocity.method10252() || Velocity.method10346(this) != null || ((Boolean)this.field2318.method507()).booleanValue() && Velocity.method10322())) {
                        return (boolean)((int)Velocity.field2329[1]);
                    }
                    if (!this.field2327) {
                        this.field2310 = (int)Velocity.field2329[3];
                    }
                    if (((Boolean)Velocity.method10268(this.field2321)).booleanValue()) {
                        ((bc)a).setVelocityX((int)Velocity.field2329[1]);
                        ((bc)a).setVelocityY((int)Velocity.field2329[1]);
                        ((bc)a).setVelocityZ((int)Velocity.field2329[1]);
                        break;
                    }
                    return (boolean)((int)Velocity.field2329[3]);
                }
            }
        }
        return (boolean)((int)Velocity.field2329[1]);
    }

    private Boolean method1278() {
        if (Velocity.method10289(this).method507() == Class524.field2596) {
            int n2 = (int)field2329[3];
            Class6009.method23560();
            return null;
        }
        return (boolean)field2329[1];
    }

    private boolean method10177(class_2338 a2) {
        class_238 b2 = Velocity.field290.field_1724.method_5829();
        class_238 c2 = new class_238((double)a2.method_10263(), b2.field_1322, (double)a2.method_10260(), (double)a2.method_10263() + 1.0, b2.field_1325, (double)a2.method_10260() + 1.0).method_1011(1.0E-7);
        return Velocity.field290.field_1724.method_37908().method_39454((class_1297)Velocity.field290.field_1724, c2);
    }

    public List method10178(class_1657 a2) {
        class_2338 b2 = Class5659.method22153(a2, (boolean)field2329[1]);
        return new ArrayList(Class5449.method21109(a2.method_5829(), b2));
    }

    private static boolean method10179() {
        return Class5659.method22111();
    }

    static {
        ___.___(26, Velocity.class);
        ____.___26_270(Velocity.class);
    }

    private static void method10180() {
        Class6454.method24594();
    }

    private static class_746 method10181(class_310 class_3102) {
        return Velocity.method10194(class_3102);
    }

    private void method10182(double i2, double j2) {
        class_2338 k2 = class_2338.method_49637((double)i2, (double)Velocity.field290.field_1724.method_23318(), (double)j2);
        if (this.method10177(k2)) {
            class_2350[] h2;
            double d2 = i2 - (double)k2.method_10263();
            double e2 = j2 - (double)k2.method_10260();
            class_2350 f2 = null;
            double g2 = Double.MAX_VALUE;
            class_2350[] class_2350Array = new class_2350[(int)field2329[12]];
            class_2350Array[(int)Velocity.field2329[1]] = class_2350.field_11039;
            class_2350Array[(int)Velocity.field2329[3]] = class_2350.field_11034;
            class_2350Array[(int)Velocity.field2329[7]] = class_2350.field_11043;
            class_2350Array[(int)Velocity.field2329[11]] = class_2350.field_11035;
            class_2350[] class_2350Array2 = h2 = class_2350Array;
            int n2 = class_2350Array2.length;
            for (int i3 = (int)field2329[1]; i3 < n2; ++i3) {
                double b2;
                class_2350 c2 = class_2350Array2[i3];
                double a2 = c2.method_10166().method_10172(d2, 0.0, e2);
                double d3 = b2 = c2.method_10171() == class_2350.class_2352.field_11056 ? 1.0 - a2 : a2;
                if (!(b2 < g2) || this.method10177(k2.method_10093(c2))) continue;
                g2 = b2;
                f2 = c2;
            }
            if (f2 != null) {
                this.field2327 = (int)field2329[3];
            }
        }
    }

    private static void method10183() {
        Class4146.method20697();
    }

    private static String method10184(Enum enum_) {
        return Class5587.method21919(enum_);
    }

    private static boolean method10185(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static void method10186(Velocity class447, boolean bl2) {
        class447.field2310 = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List method10187(class_1657 d2, float e2) {
        class_2338 a2;
        class_2338 c2;
        class_2350[] class_2350Array;
        int n2;
        int n3;
        ArrayList<class_2338> f2 = new ArrayList<class_2338>();
        List g2 = this.method10178(d2);
        Iterator iterator = g2.iterator();
        do {
            if (!iterator.hasNext()) {
                return f2;
            }
            c2 = (class_2338)iterator.next();
            if (!(e2 > 0.0f) || !(Velocity.field290.field_1724.method_33571().method_1025(c2.method_46558()) > (double)(e2 * e2))) continue;
            Class1807.method15744();
            return null;
        } while ((n3 = (int)field2329[1]) >= (n2 = (class_2350Array = class_2350.values()).length));
        class_2350 b2 = class_2350Array[n3];
        if (b2.method_10166().method_10179() && !f2.contains(a2 = c2.method_10093(b2))) {
            int n4 = g2.contains(a2) ? 60886 : 60887;
            block5: while (true) {
                switch (n4) {
                    case 60887: {
                        n4 = 60885;
                        continue block5;
                    }
                    case 60886: {
                        break block5;
                    }
                    default: {
                        f2.add(a2);
                    }
                }
                break;
            }
        }
        ++n3;
        Class4146.method20697();
        return null;
    }

    private static boolean method10188(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method10189(class_2664 a2) {
        ((bm)Velocity.method10317(field290)).hookPlaySound(a2.method_11475(), a2.method_11477(), a2.method_11478(), (class_3414)class_3417.field_15152.comp_349(), class_3419.field_15245, 4.0f, (1.0f + (field289.nextFloat() - field289.nextFloat()) * Class1422.field5460) * 0.7f, (boolean)field2329[1], field289.nextLong());
    }

    private static void method10190(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method10191(Velocity class447) {
        return class447.field2322;
    }

    private static boolean method10192() {
        return Velocity.method10252();
    }

    private class_2338 method10193() {
        if (!((Boolean)Velocity.method10323(this).method507()).booleanValue()) {
            return null;
        }
        class_238 e2 = Velocity.field290.field_1724.method_5829().method_1014(0.001);
        class_2338.class_2339 f2 = new class_2338.class_2339();
        double[] dArray = field2333;
        int n2 = dArray.length;
        for (int i2 = (int)field2329[1]; i2 < n2; ++i2) {
            double d2 = dArray[i2];
            double[] dArray2 = Velocity.method10337();
            int n3 = dArray2.length;
            for (int i3 = (int)field2329[1]; i3 < n3; ++i3) {
                double c2 = dArray2[i3];
                f2.method_10102(Velocity.field290.field_1724.method_23317() + d2, Velocity.field290.field_1724.method_23318(), Velocity.field290.field_1724.method_23321() + c2);
                if (((Boolean)this.field2324.method507()).booleanValue()) {
                    int n4 = (int)field2329[10];
                    Chams.method1924();
                    return null;
                }
                for (int b2 = (int)field2329[1]; b2 <= (int)field2329[7]; ++b2) {
                    class_2338 a2 = this.method10283((class_2338)f2, b2, e2);
                    if (a2 == null) continue;
                    return a2;
                }
            }
        }
        return null;
    }

    public static class_746 method10194(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method10195(class_2338 class_23382) {
        return Class5595.method21942(class_23382);
    }

    private static void method10196(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method10197(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public Velocity() {
        super("Velocity", "Reduces the amount of player knockback velocity", Class556.field2752, (int)field2329[0]);
        this.field2319 = this.method450(new Class253("Explosion", "Removes player explosion velocity", (boolean)field2329[3]));
        this.field2316 = this.method450(new Class260("Mode", "The mode for velocity", Class524.field2596, Class524.values()));
        this.field2334 = this.method450(new Class252("Horizontal", "How much horizontal knock-back to take", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), Class619.field3012, this::method1269));
        this.field2309 = this.method450(new Class252("Vertical", "How much vertical knock-back to take", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), Class619.field3012, this::method1278));
        this.field2321 = this.method450(new Class253("ResetVelocity", "Reset velocity when get knockback velocity", (boolean)field2329[3], this::method10318));
        this.field2313 = this.method450(new Class253("GrimV2", "Packet bypass grim v2", (boolean)field2329[1], this::method10224));
        this.field2318 = this.method450(new Class253("Static", "Works when you static", (boolean)field2329[3], this::method10211));
        this.field2324 = this.method450(new Class253("AllowLag", "Allow use the lag back to prevents velocity", (boolean)field2329[1], this::method10255));
        this.field2331 = this.method450(new Class252("LagPause", "How long does velocity pause during lag", (Number)((int)field2329[1]), (Number)((int)field2329[2]), (Number)((int)field2329[4]), this::method10208));
        this.field2326 = this.method450(new Class252("PearlPass", "How long does velocity work during phase", (Number)((int)field2329[1]), (Number)((int)field2329[6]), (Number)((int)field2329[5]), this::method10312));
        this.field2322 = this.method450(new Class253("OnlyPhased", "Only prevents velocity in walls", (boolean)field2329[1]));
        this.field2328 = this.method450(new Class253("GroundOnly", "Only applies velocity in walls while on ground", (boolean)field2329[1], this::method10240));
        this.field2330 = this.method450(new Class253("Trapped", "Applies velocity while player head is trapped", (boolean)field2329[1], this::method10166));
        this.field2311 = this.method450(new Class253("NoRotation", "Fix your head", (boolean)field2329[1], this::method10315));
        this.field2308 = this.method450(new Class253("NoPush-Entities", "Prevents being pushed away from entities", (boolean)field2329[3]));
        this.field2325 = this.method450(new Class253("NoPush-Blocks", "Prevents being pushed out of blocks", (boolean)field2329[3]));
        this.field2320 = this.method450(new Class253("NoPush-Liquids", "Prevents being pushed by flowing liquids", (boolean)field2329[3]));
        this.field2317 = this.method450(new Class253("NoPush-Fishhook", "Prevents being pulled by fishing rod hooks", (boolean)field2329[3]));
        this.field2314 = this.method450(new Class253("Debug", "Dev only", (boolean)field2329[1], this::method10249));
        this.field2323 = new Class926();
        INSTANCE = this;
    }

    public static Class248 method10198(Velocity class447) {
        return class447.field2322;
    }

    private static int method10199(int n2, int n3, Debug class300, Class767 class767) {
        return Class5859.method23051(n2, n3, class300, class767);
    }

    @Class1
    public void method10200(Class207 a2) {
        if (!((Boolean)this.field2320.method507()).booleanValue()) {
            Class1668.method15147(1119507259, -2091947995, 1089846284, -1752862543);
            return;
        }
        a2.method10();
    }

    private static void method10201() {
        Class1503.method14420();
    }

    private static void method10202() {
        Class5659.method22184();
    }

    @Class1
    public void method10203(Class50 a2) {
        if (((Boolean)this.field2308.method507()).booleanValue() && a2.method102().equals((Object)Velocity.field290.field_1724)) {
            a2.method10();
        }
    }

    public static class_746 method10204(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10205(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_746 method10206(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method10207() {
        return Replenish.method6431();
    }

    private Boolean method10208() {
        if (this.field2316.method507() == Velocity.method10272()) {
            int n2 = (int)field2329[3];
            Class4146.method20694();
            return null;
        }
        return (boolean)field2329[1];
    }

    private static native class_265 method10209(class_2338.class_2339 var0, class_265 var1);

    private static boolean method10210() {
        return Class3979.method19543();
    }

    private Boolean method10211() {
        return (this.field2316.method507() == Class524.field2594 ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    private static Object method10212(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method10213(Class63 a2) {
        if (a2.method128() == Class543.field2691) {
            this.field2327 = (int)field2329[1];
            Velocity.method10316(this, Velocity.field290.field_1724.method_23317() - (double)Velocity.field290.field_1724.method_17681() * 0.35, Velocity.field290.field_1724.method_23321() + (double)Velocity.field290.field_1724.method_17681() * 0.35);
            Velocity.method10243(this, Velocity.field290.field_1724.method_23317() - (double)Velocity.field290.field_1724.method_17681() * 0.35, Velocity.field290.field_1724.method_23321() - (double)Velocity.field290.field_1724.method_17681() * Class5951.field11826);
            this.method10182(Velocity.field290.field_1724.method_23317() + (double)Velocity.field290.field_1724.method_17681() * 0.35, Velocity.method10338(field290).method_23321() - (double)Velocity.method10204(field290).method_17681() * 0.35);
            this.method10182(Velocity.method10247(field290).method_23317() + (double)Velocity.method10311(field290).method_17681() * 0.35, Velocity.field290.field_1724.method_23321() + (double)Velocity.field290.field_1724.method_17681() * 0.35);
        }
    }

    private static void method10214(float f2) {
        Class5836.method22907(f2);
    }

    private static Class248 method10215(Velocity class447) {
        return Velocity.method10279(class447);
    }

    private static void method10216() {
        Class5836.method22890();
    }

    private static boolean method10217(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method10218() {
        Class6009.method23561();
    }

    private static int method10219(int n2, int n3, Class80 class80, Class45 class45) {
        return Class5859.method22990(n2, n3, class80, class45);
    }

    private static void method10220(Class760 class760, Class1226 class1226) {
        class760.method12006(class1226);
    }

    private static boolean method10221(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static Object method10222(Class248 class248) {
        return class248.method507();
    }

    private static Object method10223(Class248 class248) {
        return class248.method507();
    }

    private Boolean method10224() {
        if (this.field2316.method507() != Class524.field2594) {
            Class5836.method22907(0.3464797f);
            return null;
        }
        return (boolean)field2329[3];
    }

    private static void method10225() {
        Class4146.method20694();
    }

    private static int method10226(int n2, int n3, Class167 class167, Class1447 class1447) {
        return Class5859.method23062(n2, n3, class167, class1447);
    }

    private static void method10227(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method10228(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method10229(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10230(Class210 b2) {
        block14: {
            block15: {
                block13: {
                    int n2;
                    int n3 = (Boolean)Velocity.method10198(this).method507() != false ? 47330 : 47331;
                    block8: while (true) {
                        switch (n3) {
                            case 47331: {
                                n3 = 47329;
                                continue block8;
                            }
                            case 47330: {
                                if (!((Boolean)this.field2311.method507()).booleanValue() || !Velocity.method10252()) break block8;
                                Velocity.method10220(Class5723.field11049, new Class1226((int)field2329[9], Velocity.method10286(Velocity.method10245(field290)), 89.0f));
                                break block8;
                            }
                        }
                        break;
                    }
                    if (!this.field2310) break block14;
                    if (this.field2316.method507() == Class524.field2594) {
                        int n4 = 55623;
                        Velocity.method10241(0.514358f, 0.63647825f);
                        return;
                    }
                    int n5 = 55624;
                    boolean bl2 = true;
                    do {
                        if (!bl2 || (bl2 = false) || !true) {
                            n5 = n2 = 55622;
                        }
                        if (n2 == 55623) break block13;
                    } while (n2 == 55624);
                    break block15;
                }
                int n6 = (Boolean)this.field2313.method507() != false ? 5211 : 5212;
                block10: while (true) {
                    switch (n6) {
                        case 5212: {
                            n6 = 5210;
                            continue block10;
                        }
                        case 5211: {
                            Velocity.method10339().method21341((class_2596)new class_2828.class_2830(Velocity.field290.field_1724.method_23317(), Velocity.field290.field_1724.method_23318(), Velocity.field290.field_1724.method_23321(), Velocity.method10174((class_310)Velocity.field290).field_3941, Velocity.field290.field_1724.field_3925, Velocity.field290.field_1724.method_24828()));
                            class_2338 a2 = this.method10193();
                            if (a2 == null) break block10;
                            field290.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, a2, Velocity.field290.field_1724.method_5735().method_10153()));
                            break block10;
                        }
                    }
                    break;
                }
            }
            Velocity.method10186(this, (boolean)field2329[1]);
        }
    }

    public static Velocity method10231() {
        return INSTANCE;
    }

    private static void method10232(long l2) {
        Velocity.method10288(l2);
    }

    private static void method10233() {
        Class6009.method23560();
    }

    private static void method10234(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10235(Class133 k2) {
        class_2596 d2;
        if (Velocity.field290.field_1724 == null) return;
        if (Velocity.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = k2.method251();
        if (class_25962 instanceof class_2743) {
            class_2743 a2 = (class_2743)class_25962;
            if (!this.method10176(a2)) {
                return;
            }
            k2.method10();
            return;
        }
        class_25962 = k2.method251();
        if (class_25962 instanceof class_2664) {
            class_2664 b2 = (class_2664)class_25962;
            if (!this.method10321(b2)) return;
            field290.method_40000(() -> Velocity.method10189(b2));
            k2.method10();
            return;
        }
        class_25962 = k2.method251();
        int n2 = class_25962 instanceof class_2663 ? 34100 : 34101;
        block4: while (true) {
            switch (n2) {
                case 34101: {
                    n2 = 34099;
                    continue block4;
                }
                case 34100: {
                    class_2663 e2 = (class_2663)class_25962;
                    if (e2.method_11470() != (int)field2329[8] || !((Boolean)this.field2317.method507()).booleanValue()) break block4;
                    d2 = e2.method_11469((class_1937)Velocity.field290.field_1687);
                    if (!(d2 instanceof class_1536)) return;
                    class_1536 c2 = (class_1536)d2;
                    if (c2.method_26957() != Velocity.field290.field_1724) {
                        return;
                    }
                    k2.method10();
                    return;
                }
            }
            break;
        }
        d2 = k2.method251();
        if (!(d2 instanceof class_8042)) return;
        class_8042 j2 = (class_8042)d2;
        ArrayList<class_2596> i2 = new ArrayList<class_2596>();
        for (class_2596 h2 : j2.method_48324()) {
            class_2664 g2;
            if (h2 instanceof class_2743) {
                class_2743 f2 = (class_2743)h2;
                if (this.method10176(f2)) {
                    continue;
                }
            } else if (h2 instanceof class_2664 && this.method10321(g2 = (class_2664)h2)) {
                field290.method_40000(() -> Velocity.method10306(g2));
                continue;
            }
            i2.add(h2);
        }
        ((c)j2).setIterable(i2);
    }

    private static boolean method10236() {
        return Class4196.method20801();
    }

    private static Object method10237(Class248 class248) {
        return class248.method507();
    }

    private static void method10238(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method10239(int n2, int n3, Class1736 class1736, Class89 class89) {
        return Class5859.method23006(n2, n3, class1736, class89);
    }

    private Boolean method10240() {
        return (Boolean)Velocity.method10251(this).method507();
    }

    private static void method10241(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method10242() {
        return Class1807.method15742();
    }

    private static void method10243(Velocity class447, double d2, double d3) {
        class447.method10182(d2, d3);
    }

    private static boolean method10244(double d2) {
        return Class5659.method22193(d2);
    }

    public static class_746 method10245(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method10246(int n2, int n3, Class942 class942, Class191 class191) {
        return Class5859.method23091(n2, n3, class942, class191);
    }

    public static class_746 method10247(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method10248(Class248 class248) {
        return class248.method507();
    }

    private Boolean method10249() {
        return (this.field2316.method507() == Class524.field2594 ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    private static void method10250(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static Class248 method10251(Velocity class447) {
        return class447.field2322;
    }

    public static boolean method10252() {
        return Velocity.method10292((class_1297)Velocity.field290.field_1724, Velocity.field290.field_1724.method_5829());
    }

    public static Class248 method10253(Velocity class447) {
        return class447.field2316;
    }

    private static boolean method10254() {
        return Velocity.method10322();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method10255() {
        int n2;
        int n3 = Velocity.method10340(this.field2316) == Class524.field2594 ? 35713 : 35714;
        block4: while (true) {
            switch (n3) {
                case 35714: {
                    n3 = 35712;
                    continue block4;
                }
                case 35713: {
                    if (!((Boolean)this.field2313.method507()).booleanValue()) break block4;
                    n2 = (int)field2329[3];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2329[1];
        return n2 != 0;
    }

    private static void method10256(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method10257(int n2, int n3, Class181 class181, Class906 class906) {
        return Class5859.method23088(n2, n3, class181, class906);
    }

    private static boolean method10258() {
        return Class3979.method19543();
    }

    private static List method10259(Velocity class447, class_1657 class_16572, float f2) {
        return class447.method10187(class_16572, f2);
    }

    private static class_746 method10260(class_310 class_3102) {
        return Velocity.method10206(class_3102);
    }

    private static int method10261(int n2, int n3, Class48 class48, Class3806 class3806) {
        return Class5859.method23082(n2, n3, class48, class3806);
    }

    private static boolean method10262() {
        return Class3979.method19551();
    }

    private static boolean method10263() {
        return Class3979.method19544();
    }

    private static void method10264(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method10265(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method1269() {
        return (this.field2316.method507() == Class524.field2596 ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    private static void method10266(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method10267(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method10268(Class248 class248) {
        return class248.method507();
    }

    private static void method10269() {
        Class6454.method24594();
    }

    @Override
    public void method1279() {
        if (this.field2310) {
            if (Velocity.method10237(Velocity.method10349(this)) == Class524.field2594) {
                Velocity.method10250(Class5723.field11048, (class_2596)new class_2828.class_2830(Velocity.field290.field_1724.method_23317(), Velocity.method10181(field290).method_23318(), Velocity.field290.field_1724.method_23321(), Velocity.method10260((class_310)Velocity.field290).field_3941, Velocity.field290.field_1724.field_3925, Velocity.method10273(field290).method_24828()));
                class_2338 a2 = this.method10193();
                if (a2 != null) {
                    field290.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, a2, Velocity.field290.field_1724.method_5735().method_10153()));
                }
            }
            this.field2310 = (int)field2329[1];
        }
    }

    private static void method10270(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method10271() {
        Class5836.method22897();
    }

    public static Class524 method10272() {
        return Class524.field2594;
    }

    public static class_746 method10273(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method10274() {
        return Class5659.method22194();
    }

    private static boolean method10275() {
        return Velocity.method10252();
    }

    private static int method10276(int n2, int n3, Class4113 class4113, Server class453) {
        return Class5859.method23119(n2, n3, class4113, class453);
    }

    private static boolean method10277() {
        return Class5659.method22111();
    }

    private static boolean method10278(Class1447 class1447, long l2) {
        return class1447.method14268(l2);
    }

    public static Class248 method10279(Velocity class447) {
        return class447.field2309;
    }

    private static boolean method10280(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static Class248 method10281(Velocity class447) {
        return class447.field2330;
    }

    private static boolean method10282() {
        return Velocity.method10252();
    }

    private class_2338 method10283(class_2338 c2, int d2, class_238 e2) {
        class_2338.class_2339 f2 = new class_2338.class_2339();
        int n2 = (int)field2329[1];
        int[] nArray = field2312;
        int n3 = nArray.length;
        if (n2 < n3) {
            int b2 = nArray[n2];
            int[] nArray2 = field2312;
            int n4 = nArray2.length;
            int n5 = (int)field2329[1];
            while (true) {
                if (n5 >= n4) {
                    Class3979.method19561();
                    return null;
                }
                int a2 = nArray2[n5];
                f2.method_10103(c2.method_10263() + b2, c2.method_10264() + d2, c2.method_10260() + a2);
                if (this.method10284((class_2338)f2, e2)) {
                    return f2.method_10062();
                }
                ++n5;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private boolean method10284(class_2338 a, class_238 b) {
        block4: {
            block2: {
                block1: {
                    block3: {
                        if (Velocity.field290.field_1687.method_22347(a) || !new class_238(a).method_994(b) || !Velocity.field290.field_1687.method_8320(a).method_26234((class_1922)Velocity.field290.field_1687, a)) break block2;
                        if (Velocity.method10195(a)) break block3;
                        v0 = 24737;
                        ** GOTO lbl10
                    }
                    v0 = 24738;
                    if (true) ** GOTO lbl10
                    do {
                        v0 = var3_3 = 24736;
lbl10:
                        // 3 sources

                        if (var3_3 == 24737) break block1;
                    } while (var3_3 == 24738);
                    break block2;
                }
                v1 = (int)Velocity.field2329[3];
                break block4;
            }
            v1 = (int)Velocity.field2329[1];
        }
        return (boolean)v1;
    }

    private static boolean method10285() {
        return Replenish.method6431();
    }

    public static float method10286(class_746 class_7462) {
        return class_7462.field_3941;
    }

    private static void method10287() {
        Class5836.method22897();
    }

    private static void method10288(long l2) {
        Velocity.field2329[9] = l2 ^ 0xFD85F29AF882487BL;
        Velocity.field2329[3] = l2 ^ 0xFD85F29AF8824B9DL;
        Velocity.field2329[0] = l2 ^ 0xFD85F29AF8824BA0L;
        Velocity.field2329[8] = l2 ^ 0xFD85F29AF8824B83L;
        Velocity.field2329[4] = l2 ^ 0xFD85F29AF8824B54L;
        Velocity.field2329[7] = l2 ^ 0xFD85F29AF8824B9EL;
        Velocity.field2329[5] = l2 ^ 0xFD85F29AF8824A68L;
        Velocity.field2329[2] = l2 ^ 0xFD85F29AF8824BAEL;
        Velocity.field2329[1] = l2 ^ 0xFD85F29AF8824B9CL;
        Velocity.field2329[10] = l2 ^ 0x27A0D65077DB463L;
        Velocity.field2329[11] = l2 ^ 0xFD85F29AF8824B9FL;
        Velocity.field2329[12] = l2 ^ 0xFD85F29AF8824B98L;
        Velocity.field2329[6] = l2 ^ 0xFD85F29AF8824BF8L;
    }

    public static Class248 method10289(Velocity class447) {
        return class447.field2316;
    }

    private static void method10290(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class524 method10291() {
        return Class524.field2594;
    }

    public static boolean method10292(class_1297 a2, class_238 b2) {
        class_5329 c2 = new class_5329((class_1941)Velocity.field290.field_1687, a2, b2, (boolean)field2329[1], Velocity::method10209);
        do {
            if (c2.hasNext()) continue;
            return (int)field2329[1] != 0;
        } while (((class_265)c2.next()).method_1110());
        return (int)field2329[3] != 0;
    }

    private static void method10293(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public List method10294(class_1657 a2) {
        return Velocity.method10259(this, a2, 0.0f);
    }

    private static boolean method10295(class_2338 a2) {
        return Velocity.field290.field_1687.method_8320(Velocity.field290.field_1724.method_20448() ? a2 : a2.method_10084()).method_45474();
    }

    private static void method10296(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method10297() {
        return Class5659.method22194();
    }

    private static boolean method10298() {
        return Class5659.method22194();
    }

    private static void method10299() {
        Chams.method1924();
    }

    private static void method10300() {
        Class5836.method22890();
    }

    private static Object method10301(Class248 class248) {
        return class248.method507();
    }

    private static void method10302(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method10303() {
        return Class3979.method19544();
    }

    private static boolean method10304(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    @Class1
    public void method10305(Class59 b2) {
        if (((Boolean)this.field2314.method507()).booleanValue()) {
            class_2338 a2 = this.method10193();
            if (a2 == null) {
                return;
            }
            Velocity.method10309();
            Class6454.method24621(b2.method125(), new class_238(a2).method_1014(0.01), Colors.method10620().method10615((int)field2329[6]));
            Velocity.method10218();
        }
    }

    private static void method10306(class_2664 a2) {
        ((bm)Velocity.field290.field_1687).hookPlaySound(a2.method_11475(), a2.method_11477(), a2.method_11478(), (class_3414)class_3417.field_15152.comp_349(), class_3419.field_15245, 4.0f, (1.0f + (field289.nextFloat() - field289.nextFloat()) * Class3390.field7370) * 0.7f, (boolean)field2329[1], field289.nextLong());
    }

    private static boolean method10307() {
        return Replenish.method6431();
    }

    private static void method10308() {
        Class6009.method23560();
    }

    private static void method10309() {
        Class6009.method23560();
    }

    public static Class248 method10310(Velocity class447) {
        return class447.field2321;
    }

    public static class_746 method10311(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method10312() {
        return (Velocity.method10319(this).method507() == Velocity.method10291() ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    private static void method10313() {
        Chams.method1924();
    }

    private static boolean method10314() {
        return Velocity.method10252();
    }

    private Boolean method10315() {
        return (Boolean)this.field2322.method507();
    }

    private static void method10316(Velocity class447, double d2, double d3) {
        class447.method10182(d2, d3);
    }

    public static class_638 method10317(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private Boolean method10318() {
        return (((Float)this.field2334.method507()).floatValue() == 0.0f && ((Float)Velocity.method10212(this.field2309)).floatValue() == 0.0f || this.field2316.method507() == Class524.field2594 ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    public static Class248 method10319(Velocity class447) {
        return class447.field2316;
    }

    private static boolean method10320() {
        return Class1807.method15742();
    }

    public boolean method10321(class_2664 a2) {
        int n2;
        int n3 = n2 = (Boolean)this.field2319.method507() != false ? 35253 : 35254;
        if (n2 == 35253) {
            return Class1215.method13261(0.670568387805221, 0.9828481625105373);
        }
        if (n2 == 35254) {
            return Class4196.method20801();
        }
        return (int)field2329[1] != 0;
    }

    public static boolean method10322() {
        return (Velocity.field290.field_1724.method_18798().method_10216() == 0.0 && Velocity.field290.field_1724.method_24828() && Velocity.field290.field_1724.method_18798().method_10215() == 0.0 ? (int)field2329[3] : (int)field2329[1]) != 0;
    }

    public static Class248 method10323(Velocity class447) {
        return class447.field2313;
    }

    private static boolean method10324() {
        return Class3979.method19539();
    }

    private static boolean method10325() {
        return Class5836.method22894();
    }

    private static void method10326() {
        Class6454.method24594();
    }

    private static boolean method10327() {
        return Class5836.method22894();
    }

    private static void method10328(float f2) {
        Class5836.method22907(f2);
    }

    public static class_746 method10329(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method10330(int n2, int n3, Class3466 class3466, Flatten class426) {
        return Class5859.method23014(n2, n3, class3466, class426);
    }

    private static void method10331() {
        Class1503.method14420();
    }

    private static boolean method10332() {
        return Class1807.method15753();
    }

    private static void method10333(float f2) {
        Class5836.method22907(f2);
    }

    private static void method10334() {
        Class4146.method20697();
    }

    private static void method10335(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private boolean method10336() {
        class_2338 a2 = Velocity.field290.field_1724.method_24515().method_10086(Velocity.field290.field_1724.method_20448() ? (int)field2329[3] : (int)field2329[7]);
        if (Velocity.field290.field_1687.method_8320(a2).method_45474()) {
            return (int)field2329[1] != 0;
        }
        return this.method10294((class_1657)Velocity.field290.field_1724).stream().noneMatch(Velocity::method10295);
    }

    public static double[] method10337() {
        return field2333;
    }

    public static class_746 method10338(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class5496 method10339() {
        return Class5723.field11048;
    }

    private static Object method10340(Class248 class248) {
        return class248.method507();
    }

    private static void method10341() {
        Class4146.method20697();
    }

    private static int method10342(int n2, int n3, Class53 class53, Class81 class81) {
        return Class5859.method23123(n2, n3, class53, class81);
    }

    @Override
    public String method1248() {
        if (this.field2316.method507() != Class524.field2596) {
            Chams.method1924();
            return null;
        }
        Object[] objectArray = new Object[(int)field2329[7]];
        objectArray[(int)Velocity.field2329[1]] = field395.format(this.field2334.method507());
        objectArray[(int)Velocity.field2329[3]] = field395.format(Velocity.method10215(this).method507());
        return String.format("H:%s%%, V:%s%%", objectArray);
    }

    private static void method10343() {
        Chams.method1924();
    }

    @Class1
    public void method10344(Class195 a2) {
        if (((Boolean)Velocity.method10301(this.field2325)).booleanValue()) {
            a2.method10();
        }
    }

    private static boolean method10345() {
        return Class1807.method15753();
    }

    private static class_2338 method10346(Velocity class447) {
        return class447.method10193();
    }

    private static boolean method10347() {
        return Class4196.method20801();
    }

    private static void method10348(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method10349(Velocity class447) {
        return class447.field2316;
    }

    private static native Object 1(char var0);
}

