/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.HorseEntity
 *  net.minecraft.entity.passive.MuleEntity
 *  net.minecraft.entity.passive.LlamaEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1145;
import mapped.Class115;
import mapped.Class1194;
import mapped.Class120;
import mapped.Class121;
import mapped.Class130;
import mapped.Class1337;
import mapped.Class147;
import mapped.Class1503;
import mapped.Class154;
import mapped.Class1567;
import mapped.Class1572;
import mapped.Class1589;
import mapped.Class1594;
import mapped.Class1665;
import mapped.Class1677;
import mapped.Class1708;
import mapped.Class1745;
import mapped.Class175;
import mapped.Class1782;
import mapped.Class1807;
import mapped.Class204;
import mapped.Class211;
import mapped.Class217;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3305;
import mapped.Class3440;
import mapped.Class346;
import mapped.Class3482;
import mapped.Class376;
import mapped.Class3776;
import mapped.Class3911;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4205;
import mapped.Class4378;
import mapped.Class47;
import mapped.Class543;
import mapped.Class5445;
import mapped.Class5532;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5694;
import mapped.Class5723;
import mapped.Class578;
import mapped.Class5836;
import mapped.Class6008;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6332;
import mapped.Class6405;
import mapped.Class6454;
import mapped.Class65;
import mapped.Class69;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.passive.MuleEntity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.ShapeContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class338
extends Class278 {
    private static long[] field879 = new long[12];
    private final Class925 field880 = new Class926();
    Class248 field881 = this.method450(new Class260("Mode", "Step mode", Class578.field2831, Class578.values()));
    Class248 field882 = this.method450(new Class252("Height", "The maximum height for stepping up blocks", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(2.5f), (Number)Float.valueOf(Class5445.field10173), this::method1269));
    Class248 field883;
    Class248 field884 = this.method450(new Class253("Strict", "Confirms the step height for NCP servers", (boolean)field879[1], this::method1278));
    private boolean field885;
    Class248 field886;
    private float field887;
    private boolean field888;

    private static void method3129() {
        Class4146.method20694();
    }

    private static void method3130() {
        Class6454.method24594();
    }

    private static boolean method3131(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private Boolean method3132() {
        return (Class338.method3180(this.field881) != Class578.field2830 ? (int)field879[0] : (int)field879[1]) != 0;
    }

    @Class1(priority=-100)
    public void method3133(Class69 a2) {
        if (Class338.method3197(this.field881) == Class338.method3188() && Class338.method3155(this)) {
            Class338.method3193((class_746)Class338.field290.field_1724).field_3904 = (int)field879[0];
        }
    }

    private static void method3134() {
        Class1745.method15538();
    }

    public static Class248 method3135(Class338 class338) {
        return class338.field881;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Class1
    public void method3136(Class65 d2) {
        if (d2.method128() != Class543.field2690) return;
        if (this.field881.method507() != Class578.field2831) return;
        double b2 = Class338.field290.field_1724.method_23318() - Class338.method3173((class_310)Class338.field290).field_6036;
        if (b2 <= 0.5) return;
        if (!(b2 > (double)((Float)this.field882.method507()).floatValue())) {
            int n2 = 60497;
            Class1503.method14417(Class6405.field13283, Class1594.field5960);
            return;
        }
        int n3 = 60496;
        block4: while (true) {
            switch (n3) {
                case 60497: {
                    n3 = 60495;
                    continue block4;
                }
                case 60496: {
                    return;
                }
            }
            break;
        }
        double[] c2 = this.method3143(b2);
        if (((Boolean)this.field883.method507()).booleanValue()) {
            Class338.method3226(Class5723.field11047, b2 > 1.0 ? 0.15f : 0.35f);
            Class338.method3151(this, (boolean)field879[0]);
        }
        double[] dArray = c2;
        int n4 = dArray.length;
        int n5 = (int)field879[1];
        while (true) {
            if (n5 >= n4) {
                Class338.method3182(this).method12593();
                return;
            }
            double a2 = dArray[n5];
            Class5723.field11048.method21341((class_2596)new class_2828.class_2829(Class338.field290.field_1724.field_6014, Class338.field290.field_1724.field_6036 + a2, Class338.field290.field_1724.field_5969, (boolean)field879[1]));
            ++n5;
        }
    }

    public static class_746 method3137(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3138(Class338 class338, float f2) {
        Class338.method3149(class338, f2);
    }

    private static Class248 method3139(Class338 class338) {
        return Class338.method3147(class338);
    }

    private static void method3140(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3141() {
        Class5836.method22890();
    }

    private static int method3142(int n2, int n3, Class115 class115, Class120 class120) {
        return Class5532.method21743(n2, n3, class115, class120);
    }

    private double[] method3143(double a2) {
        double[] b2 = new double[(int)field879[1]];
        if (((Boolean)this.field884.method507()).booleanValue()) {
            if (a2 > 1.1661) {
                double[] dArray = new double[(int)field879[4]];
                dArray[(int)Class338.field879[1]] = 0.42;
                dArray[(int)Class338.field879[0]] = Class1677.field6216;
                dArray[(int)Class338.field879[6]] = 1.001;
                dArray[(int)Class338.field879[7]] = Class6332.field13036;
                dArray[(int)Class338.field879[2]] = a2;
                b2 = dArray;
            } else if (a2 > 1.015) {
                double[] dArray = new double[(int)field879[2]];
                dArray[(int)Class338.field879[1]] = 0.42;
                dArray[(int)Class338.field879[0]] = 0.7532;
                dArray[(int)Class338.field879[6]] = 1.001;
                dArray[(int)Class338.field879[7]] = a2;
                b2 = dArray;
            } else if (a2 > Class4378.field9985) {
                double[] dArray = new double[(int)field879[7]];
                dArray[(int)Class338.field879[1]] = 0.42 * a2;
                dArray[(int)Class338.field879[0]] = 0.7532 * a2;
                dArray[(int)Class338.field879[6]] = a2;
                b2 = dArray;
            }
            return b2;
        }
        if (a2 > 2.019) {
            double[] dArray = new double[(int)field879[5]];
            dArray[(int)Class338.field879[1]] = 0.425;
            dArray[(int)Class338.field879[0]] = Class3776.field8556;
            dArray[(int)Class338.field879[6]] = 0.699;
            dArray[(int)Class338.field879[7]] = Class3911.field8907;
            dArray[(int)Class338.field879[2]] = 1.022;
            dArray[(int)Class338.field879[4]] = 1.372;
            dArray[(int)Class338.field879[10]] = 1.652;
            dArray[(int)Class338.field879[11]] = 1.869;
            dArray[(int)Class338.field879[8]] = 2.019;
            dArray[(int)Class338.field879[9]] = Class1589.field5940;
            b2 = dArray;
        } else if (a2 > 1.5) {
            double[] dArray = new double[(int)field879[8]];
            dArray[(int)Class338.field879[1]] = Class3305.field7114;
            dArray[(int)Class338.field879[0]] = Class1782.field6678;
            dArray[(int)Class338.field879[6]] = 0.63;
            dArray[(int)Class338.field879[7]] = 0.51;
            dArray[(int)Class338.field879[2]] = 0.9;
            dArray[(int)Class338.field879[4]] = 1.21;
            dArray[(int)Class338.field879[10]] = Class1572.field5877;
            dArray[(int)Class338.field879[11]] = Class1145.field4593;
            b2 = dArray;
        } else if (a2 > 1.015) {
            double[] dArray = new double[(int)field879[4]];
            dArray[(int)Class338.field879[1]] = 0.42;
            dArray[(int)Class338.field879[0]] = Class3482.field7648;
            dArray[(int)Class338.field879[6]] = Class6008.field11992;
            dArray[(int)Class338.field879[7]] = 1.093;
            dArray[(int)Class338.field879[2]] = Class1708.field6327;
            b2 = dArray;
        } else if (a2 > 0.6) {
            double[] dArray = new double[(int)field879[6]];
            dArray[(int)Class338.field879[1]] = 0.42 * a2;
            dArray[(int)Class338.field879[0]] = Class4205.field9829 * a2;
            b2 = dArray;
        }
        return b2;
    }

    /*
     * Unable to fully structure code
     */
    protected void method3144(double R, double S) {
        block16: {
            block17: {
                if (!this.method3196()) break block16;
                I = Class338.field290.field_1724.method_19538();
                J = I.method_1031(R, 0.0, S);
                K = new class_243(R, 0.0, S);
                L = Class338.field290.field_1724.method_6029();
                M = (float)K.method_1027();
                if (M <= 0.001f) {
                    a = Class338.field290.field_1724.field_3913.method_3128();
                    b = L * a.field_1343;
                    c = L * a.field_1342;
                    e = class_3532.method_15374((float)(Class338.method3230(Class338.field290).method_36454() * 0.017453292f));
                    d = class_3532.method_15362((float)(Class338.field290.field_1724.method_36454() * Class3440.field7508));
                    K = new class_243((double)(b * d - c * e), K.field_1351, (double)(c * d + b * e));
                    M = (float)K.method_1027();
                    if (M <= 0.001f) {
                        return;
                    }
                }
                O = class_3532.method_48119((float)M);
                P = K.method_1021((double)O);
                Q = Class338.field290.field_1724.method_5663();
                N = (float)(Q.field_1352 * P.field_1352 + Q.field_1350 * P.field_1350);
                if (N < -0.15f) break block16;
                F = class_3726.method_16195((class_1297)Class338.field290.field_1724);
                G = class_2338.method_49637((double)Class338.field290.field_1724.method_23317(), (double)Class338.field290.field_1724.method_5829().field_1325, (double)Class338.method3137(Class338.field290).method_23321());
                H = Class338.method3160(Class338.field290).method_37908().method_8320(G);
                if (!H.method_26194((class_1922)Class338.field290.field_1724.method_37908(), G, F).method_1110()) break block17;
                v0 = 31470;
                ** GOTO lbl33
            }
            v0 = 31471;
            if (true) ** GOTO lbl33
            block4: while (true) {
                v0 = 31469;
lbl33:
                // 3 sources

                switch (v0) {
                    case 31471: {
                        continue block4;
                    }
                    case 31470: {
                        G = G.method_10084();
                        E = Class338.field290.field_1724.method_37908().method_8320(G);
                        if (!E.method_26194((class_1922)Class338.field290.field_1724.method_37908(), G, F).method_1110()) break block4;
                        o = 1.2f;
                        if (Class338.field290.field_1724.method_6059(Class338.method3145())) {
                            o += (float)(Class338.field290.field_1724.method_6112(class_1294.field_5913).method_5578() + (int)Class338.field879[0]) * 0.75f;
                        }
                        p = Math.max(L * 7.0f, 1.0f / O);
                        q = J.method_1019(P.method_1021((double)p));
                        r = Class338.field290.field_1724.method_17681();
                        s = Class338.field290.field_1724.method_17682();
                        t = new class_238(I, q.method_1031(0.0, (double)s, 0.0)).method_1009((double)r, 0.0, (double)r);
                        u = I.method_1031(0.0, 0.5099999904632568, 0.0);
                        q = q.method_1031(0.0, Class1337.field5178, 0.0);
                        v = P.method_1036(new class_243(0.0, 1.0, 0.0));
                        w = v.method_1021((double)(r * Class1194.field4725));
                        x = u.method_1020(w);
                        y = q.method_1020(w);
                        z = u.method_1019(w);
                        A = q.method_1019(w);
                        B = Class338.field290.field_1724.method_37908().method_8600((class_1297)Class338.field290.field_1724, t);
                        C = StreamSupport.stream(B.spliterator(), (boolean)Class338.field879[1]).flatMap((Function<class_265, Stream>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, method3223(net.minecraft.util.shape.VoxelShape ), (Lnet/minecraft/class_265;)Ljava/util/stream/Stream;)()).iterator();
                        D = 1.4E-45f;
                        while (C.hasNext()) {
                            m = (class_238)C.next();
                            if (!m.method_993(x, y) && !m.method_993(z, A)) continue;
                            D = (float)m.field_1325;
                            j = m.method_1005();
                            k = class_2338.method_49638((class_2374)j);
                            l = (int)Class338.field879[0];
                            while ((float)l < o) {
                                g = k.method_10086(l);
                                h = Class338.field290.field_1724.method_37908().method_8320(g);
                                i = h.method_26194((class_1922)Class338.field290.field_1724.method_37908(), g, F);
                                if (i.method_1110()) ** GOTO lbl73
                                v1 = 25516;
                                ** GOTO lbl77
lbl73:
                                // 1 sources

                                v1 = 25517;
                                if (true) ** GOTO lbl77
                                do {
                                    v1 = var41_44 = 25515;
lbl77:
                                    // 3 sources

                                    if (var41_44 == 25516) ** GOTO lbl81
                                } while (var41_44 == 25517);
                                Class338.method3150();
                                return;
lbl81:
                                // 1 sources

                                D = (float)i.method_1105(class_2350.class_2351.field_11052) + (float)g.method_10264();
                                if ((double)D - Class338.method3157(Class338.field290).method_23318() > (double)o) {
                                    return;
                                }
                                if (l <= (int)Class338.field879[0]) ** GOTO lbl99
                                G = G.method_10084();
                                f = Class338.field290.field_1724.method_37908().method_8320(G);
                                if (f.method_26194((class_1922)Class338.field290.field_1724.method_37908(), G, F).method_1110()) ** GOTO lbl90
                                v2 = 13879;
                                ** GOTO lbl94
lbl90:
                                // 1 sources

                                v2 = 13880;
                                if (true) ** GOTO lbl94
                                while (true) {
                                    v2 = var43_46 = 13878;
lbl94:
                                    // 3 sources

                                    if (var43_46 == 13879) break;
                                    if (var43_46 == 13880) {
                                        continue;
                                    }
                                    ** GOTO lbl99
                                    break;
                                }
                                return;
lbl99:
                                // 2 sources

                                ++l;
                            }
                            break block5;
                        }
                        if (D == 1.4E-45f) break block4;
                        n = (float)((double)D - Class338.field290.field_1724.method_23318());
                        if (n <= 0.5f) {
                            while (true) {
                                // Infinite loop
                            }
                        }
                        if (n > o) break block4;
                        Class338.method3205(this, (boolean)Class338.field879[0]);
                    }
                }
                break;
            }
        }
    }

    public static class_6880 method3145() {
        return class_1294.field_5913;
    }

    private static void method3146() {
        Class6009.method23561();
    }

    public static Class248 method3147(Class338 class338) {
        return class338.field881;
    }

    private static boolean method3148(Class338 class338) {
        return Class338.method3171(class338);
    }

    public static void method3149(Class338 class338, float f2) {
        class338.field887 = f2;
    }

    private static void method3150() {
        Class4146.method20694();
    }

    public static void method3151(Class338 class338, boolean bl2) {
        class338.field888 = bl2;
    }

    public static Class578 method3152() {
        return Class578.field2830;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3153(Class130 a2) {
        if (Class338.field290.field_1724 == null) {
            return;
        }
        int n2 = a2.method251() instanceof class_2708 ? 918 : 919;
        block4: while (true) {
            switch (n2) {
                case 919: {
                    n2 = 917;
                    continue block4;
                }
                case 918: {
                    this.method1268();
                    return;
                }
            }
            break;
        }
    }

    public static Class248 method3154(Class338 class338) {
        return class338.field881;
    }

    public static boolean method3155(Class338 class338) {
        return class338.field885;
    }

    private static Object method3156(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method3157(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3158() {
        Class1503.method14420();
    }

    private static class_1309 method3159(Class154 class154) {
        return class154.method302();
    }

    private static class_746 method3160(class_310 class_3102) {
        return Class338.method3170(class_3102);
    }

    private static void method3161() {
        Class5836.method22885();
    }

    private static int method3162(int n2, int n3, Class1665 class1665, Class211 class211) {
        return Class5532.method21732(n2, n3, class1665, class211);
    }

    public Class338() {
        super("Step", "Allows the player to step up blocks", Class556.field2752);
        this.field883 = this.method450(new Class253("UseTimer", "Slows down packets by applying timer when stepping", (boolean)field879[0], this::method3221));
        this.field886 = this.method450(new Class253("EntityStep", "Allows entities to step up blocks", (boolean)field879[1], this::method3132));
    }

    private static void method3163() {
        Class5836.method22885();
    }

    private static Class248 method3164(Class338 class338) {
        return Class338.method3135(class338);
    }

    private static void method3165() {
        Class298.method1924();
    }

    private static void method3166() {
        Class5659.method22184();
    }

    private static double method3167(Class204 class204) {
        return class204.method383();
    }

    private static void method3168(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method3169(Class154 class154, float f2) {
        class154.method304(f2);
    }

    public static class_746 method3170(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static boolean method3171(Class338 class338) {
        return class338.field888;
    }

    public static float method3172(Class338 class338) {
        return class338.field887;
    }

    public static class_746 method3173(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3174(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_746 method3175(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3176(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method3177(Class154 a2) {
        block4: {
            block5: {
                if (this.field881.method507() == Class338.method3152()) {
                    return;
                }
                if (Class338.field290.field_1724 == null) break block4;
                if (a2.method302() == Class338.field290.field_1724) break block5;
                if (!((Boolean)Class338.method3156(this.field886)).booleanValue()) break block4;
                if (Class338.field290.field_1724.method_5854() == null || Class338.method3159(a2) != Class338.field290.field_1724.method_5854()) break block4;
            }
            a2.method10();
            Class338.method3169(a2, Class338.method3172(this));
        }
    }

    private static class_746 method3178(class_310 class_3102) {
        return Class338.method3176(class_3102);
    }

    public static Class925 method3179(Class338 class338) {
        return class338.field880;
    }

    static {
        Class338.method3207(-2123511537891240934L);
    }

    private static Object method3180(Class248 class248) {
        return class248.method507();
    }

    private static class_746 method3181(class_310 class_3102) {
        return Class338.method3175(class_3102);
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)Class338.method3139(this).method507());
    }

    private static Class925 method3182(Class338 class338) {
        return Class338.method3179(class338);
    }

    private static void method3183() {
        Class6454.method24594();
    }

    private static int method3184(int n2, int n3, Class1567 class1567, Class346 class346) {
        return Class5532.method21717(n2, n3, class1567, class346);
    }

    public static class_746 method3185(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3186() {
        Class1807.method15744();
    }

    private static void method3187(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class578 method3188() {
        return Class578.field2830;
    }

    private static boolean method3189() {
        return Class5659.method22111();
    }

    public static Class578 method3190() {
        return Class578.field2831;
    }

    private static void method3191() {
        Class6454.method24594();
    }

    private static void method3192(Class3978 class3978, float f2) {
        class3978.method19512(f2);
    }

    private Boolean method1278() {
        return (Class338.method3201(this).method507() == Class578.field2831 && ((Float)this.field882.method507()).floatValue() <= 2.5f ? (int)field879[0] : (int)field879[1]) != 0;
    }

    public static class_744 method3193(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static void method3194(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_746 method3195(class_310 class_3102) {
        return Class338.method3209(class_3102);
    }

    /*
     * Unable to fully structure code
     */
    private boolean method3196() {
        block3: {
            block4: {
                if (!Class338.field290.field_1724.method_24828() || Class338.field290.field_1724.method_5715()) ** GOTO lbl-1000
                if (Class338.field290.field_1724.method_5765()) break block4;
                v0 = 62715;
                ** GOTO lbl10
            }
            v0 = 62716;
            if (true) ** GOTO lbl10
            do {
                v0 = var1_1 = 62714;
lbl10:
                // 3 sources

                if (var1_1 == 62715) break block3;
            } while (var1_1 == 62716);
            return Class3979.method19539();
        }
        if (Class338.method3199()) {
            v1 = (int)Class338.field879[0];
        } else lbl-1000:
        // 2 sources

        {
            v1 = (int)Class338.field879[1];
        }
        return (boolean)v1;
    }

    private static Object method3197(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method3198(Class63 a2) {
        block7: {
            block6: {
                if (a2.method128() != Class543.field2690) {
                    return;
                }
                if (Class338.method3195(field290).method_5799() || Class338.field290.field_1724.method_5771()) break block6;
                if (!Class338.method3178(field290).method_6128()) break block7;
            }
            Class5723.field11047.method19512(1.0f);
            Class338.method3138(this, this.method3219(Class338.method3220(field290).method_5854()) ? 1.0f : 0.6f);
            return;
        }
        if (Class338.method3148(this) && Class338.field290.field_1724.method_24828()) {
            Class5723.field11047.method19512(1.0f);
            this.field888 = (int)field879[1];
        }
        if (Class338.method3181(field290).method_24828() && Class338.method3231(this).method12595((int)field879[3])) {
            this.field887 = ((Float)this.field882.method507()).floatValue();
            Class6454.method24594();
            return;
        }
        Class338.method3229(this, this.method3219(Class338.field290.field_1724.method_5854()) ? 1.0f : 0.6f);
    }

    private static boolean method3199() {
        return Class1807.method15753();
    }

    private static int method3200(int n2, int n3, Class121 class121, Class5694 class5694) {
        return Class5532.method21720(n2, n3, class121, class5694);
    }

    private static Class248 method3201(Class338 class338) {
        return Class338.method3154(class338);
    }

    private static boolean method3202() {
        return Class376.method4987();
    }

    private static boolean method3203(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static int method3204(int n2, int n3, Class47 class47, Class175 class175) {
        return Class5532.method21716(n2, n3, class47, class175);
    }

    @Override
    public void method1274() {
        if (Class338.method3185(field290) == null) {
            return;
        }
        this.field887 = this.method3219(Class338.field290.field_1724.method_5854()) ? 1.0f : 0.6f;
        Class5723.field11047.method19512(1.0f);
    }

    private static void method3205(Class338 class338, boolean bl2) {
        Class338.method3208(class338, bl2);
    }

    private static boolean method3206() {
        return Class3979.method19544();
    }

    private static void method3207(long l2) {
        Class338.field879[7] = l2 ^ 0xE287C581D38C9419L;
        Class338.field879[9] = l2 ^ 0xE287C581D38C9413L;
        Class338.field879[10] = l2 ^ 0xE287C581D38C941CL;
        Class338.field879[2] = l2 ^ 0xE287C581D38C941EL;
        Class338.field879[6] = l2 ^ 0xE287C581D38C9418L;
        Class338.field879[1] = l2 ^ 0xE287C581D38C941AL;
        Class338.field879[4] = l2 ^ 0xE287C581D38C941FL;
        Class338.field879[11] = l2 ^ 0xE287C581D38C941DL;
        Class338.field879[3] = l2 ^ 0xE287C581D38C94D2L;
        Class338.field879[5] = l2 ^ 0xE287C581D38C9410L;
        Class338.field879[8] = l2 ^ 0xE287C581D38C9412L;
        Class338.field879[0] = l2 ^ 0xE287C581D38C941BL;
    }

    public static void method3208(Class338 class338, boolean bl2) {
        class338.field885 = bl2;
    }

    public static class_746 method3209(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3210(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method3211(int n2, int n3, Class6283 class6283, Class147 class147) {
        return Class5532.method21706(n2, n3, class6283, class147);
    }

    private static void method3212() {
        Class4146.method20697();
    }

    private static void method3213(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private Boolean method1269() {
        return (this.field881.method507() != Class578.field2830 ? (int)field879[0] : (int)field879[1]) != 0;
    }

    private static void method3214() {
        Class1807.method15744();
    }

    @Class1(priority=-9999)
    public void method3215(Class204 a2) {
        if (this.field881.method507() == Class578.field2830) {
            Class338.method3222(this, Class338.method3167(a2), a2.method390());
        }
    }

    private static void method3216() {
        Class1745.method15538();
    }

    private static void method3217(float f2) {
        Class5836.method22907(f2);
    }

    private static void method3218() {
        Class4146.method20694();
    }

    private boolean method3219(class_1297 a2) {
        return (a2 instanceof class_1498 || a2 instanceof class_1501 || a2 instanceof class_1500 ? (int)field879[0] : (int)field879[1]) != 0;
    }

    public static class_746 method3220(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method3221() {
        return (Class338.method3164(this).method507() == Class338.method3190() ? (int)field879[0] : (int)field879[1]) != 0;
    }

    @Override
    public void method1279() {
        Class338.method3192(Class5723.field11047, 1.0f);
    }

    private static void method3222(Class338 class338, double d2, double d3) {
        class338.method3144(d2, d3);
    }

    private static Stream method3223(class_265 a2) {
        return a2.method_1090().stream();
    }

    private static void method3224(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method3225(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method3226(Class3978 class3978, float f2) {
        class3978.method19512(f2);
    }

    private static void method3227() {
        Class6009.method23560();
    }

    private static void method3228() {
        Class5836.method22897();
    }

    public static void method3229(Class338 class338, float f2) {
        class338.field887 = f2;
    }

    public static class_746 method3230(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class925 method3231(Class338 class338) {
        return class338.field880;
    }

    private static void method3232() {
        Class5659.method22184();
    }

    @Class1
    public void method3233(Class217 a2) {
        if (this.field881.method507() == Class578.field2830) {
            if (this.field885 && Class338.field290.field_1724.field_3913.field_3904) {
                a2.method10();
                a2.method408((int)field879[2]);
                this.field885 = (int)field879[1];
            }
        }
    }

    private static void method3234() {
        Class4146.method20697();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

