/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.util.ActionResult
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.HashSet;
import java.util.Set;
import mapped.Class1417;
import mapped.Class1463;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class1981;
import mapped.Class298;
import mapped.Class379;
import mapped.Class3815;
import mapped.Class3850;
import mapped.Class3878;
import mapped.Class3979;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class447;
import mapped.Class455;
import mapped.Class4971;
import mapped.Class5496;
import mapped.Class5574;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5852;
import mapped.Class6009;
import mapped.Class6134;
import mapped.Class6292;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class67;
import mapped.Class803;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class1011 {
    private static long[] field4186 = new long[3];

    private static boolean method12744() {
        return Class3979.method19544();
    }

    public static double method12745(class_243 class_2432) {
        return class_2432.field_1350;
    }

    /*
     * Unable to fully structure code
     */
    public class_2350 method12746(class_2338 c, boolean d) {
        block5: {
            e = new class_243(Class1011.method12820(Class4122.field9561).method_23317(), Class4122.field9561.field_1724.method_23318() + (double)Class4122.field9561.field_1724.method_5751(), Class1011.method12769(Class4122.field9561).method_23321());
            if ((double)c.method_10263() == e.method_10216() && (double)c.method_10264() == e.method_10214() && (double)c.method_10260() == e.method_10215()) {
                Class6009.method23560();
                return null;
            }
            b = this.method12822(e, c.method_46558());
            var5_5 = b.iterator();
            block0: do {
                block7: {
                    block6: {
                        if (!var5_5.hasNext()) break block6;
                        v0 = 45570;
                        ** GOTO lbl16
                    }
                    v0 = 45571;
                    if (true) ** GOTO lbl16
                    while (true) {
                        v0 = var6_6 = 45569;
lbl16:
                        // 3 sources

                        if (var6_6 == 45570) break;
                        if (var6_6 == 45571) {
                            continue;
                        }
                        break block5;
                        break;
                    }
                    a = (class_2350)var5_5.next();
                    if (!d) break block7;
                    v1 = 57725;
                    ** GOTO lbl29
                }
                v1 = 57726;
                if (true) ** GOTO lbl29
                do {
                    v1 = var8_8 = 57724;
lbl29:
                    // 3 sources

                    if (var8_8 == 57725) continue block0;
                } while (var8_8 == 57726);
                break;
            } while (!Class4122.field9561.field_1687.method_22347(c.method_10093(a)));
            return a;
        }
        return class_2350.field_11036;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method12747(class_3965 c2, int d2, boolean e2, boolean f2, boolean g2, Class6134 h2) {
        int n2;
        int n3 = d2 != Class1011.method12819().method18969() ? 47942 : 47943;
        block4: while (true) {
            switch (n3) {
                case 47943: {
                    n3 = 47941;
                    continue block4;
                }
                case 47942: {
                    n2 = (int)field4186[1];
                    break block4;
                }
                default: {
                    n2 = (int)field4186[0];
                }
            }
            break;
        }
        int i2 = n2;
        int j2 = Class5723.field11058.method18969();
        if (i2 != 0) {
            Class5723.field11058.method18887(d2);
        }
        if (f2) {
            return Class447.method10252();
        }
        return Class803.method12224(0.7933515556947149, 0.02535533383821542, Class1981.field6779, 0.4781588451839812, 0.07941603754148996, 0.13669354437242065);
    }

    private static class_638 method12748(class_310 class_3102) {
        return Class1011.method12780(class_3102);
    }

    private static float[] method12749(class_243 class_2432, class_243 class_2433) {
        return Class1503.method14416(class_2432, class_2433);
    }

    public static class_746 method12750(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method12751(double d2) {
        return Class5659.method22193(d2);
    }

    public boolean method12752(class_2338 a2, class_2350 b2, int c2, boolean d2, boolean e2, boolean f2, Class6134 g2) {
        class_243 h2 = a2.method_46558().method_1019(new class_243(b2.method_23955()).method_1021(Class6292.field12910));
        return Class1011.method12770(this, new class_3965(h2, b2, a2, (boolean)field4186[0]), c2, d2, e2, f2, g2);
    }

    public static class_1268 method12753() {
        return class_1268.field_5808;
    }

    private static void method12754() {
        Class1807.method15744();
    }

    private static class_2596 method12755(class_1268 a2, class_3965 b2, int c2) {
        return new class_2885(a2, b2, c2);
    }

    public boolean method12756(class_2338 a2, class_2350 b2, int c2, boolean d2, boolean e2, Class6134 f2) {
        class_243 g2 = a2.method_46558().method_1019(new class_243(b2.method_23955()).method_1021(0.5));
        return this.method12817(new class_3965(g2, b2, a2, (boolean)field4186[0]), c2, d2, e2, f2);
    }

    /*
     * Unable to fully structure code
     */
    public boolean method12757(class_2338 a, int b, boolean c, boolean d, boolean e, boolean f, Class6134 g) {
        block6: {
            block7: {
                h = Class1011.method12777(this, a, c);
                if (f) ** GOTO lbl-1000
                if (!Class379.method5038().method1265()) break block6;
                if (h != null) break block7;
                v0 = 24741;
                ** GOTO lbl12
            }
            v0 = 24742;
            if (true) ** GOTO lbl12
            block4: while (true) {
                v0 = 24740;
lbl12:
                // 3 sources

                switch (v0) {
                    case 24742: {
                        continue block4;
                    }
                    case 24741: lbl-1000:
                    // 2 sources

                    {
                        h = class_2350.field_11033;
                        return this.method12756(a, h, b, d, Class455.method10581().method10559(), g);
                    }
                }
                break;
            }
        }
        if (h == null) {
            return (boolean)((int)Class1011.field4186[0]);
        }
        i = a.method_10093(h.method_10153());
        return this.method12752(i, h, b, d, (boolean)Class1011.field4186[0], e, g);
    }

    private static boolean method12758() {
        return Class5659.method22111();
    }

    private static void method12759() {
        Class5659.method22184();
    }

    private static void method12760(long l2) {
        Class1011.field4186[0] = l2 ^ 0xDD8BAB1E5EA3364EL;
        Class1011.field4186[1] = l2 ^ 0xDD8BAB1E5EA3364FL;
        Class1011.field4186[2] = l2 ^ 0xDD8BAB1E5EA33648L;
    }

    private static void method12761(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    static {
        Class1011.method12760(-2482702622639573426L);
    }

    /*
     * Unable to fully structure code
     */
    public class_2350 method12762(class_2338 c, boolean d) {
        e = Class1011.method12776(this, Class1011.method12787(Class4122.field9561).method_33571(), c.method_46558());
        f = null;
        var5_5 = class_2350.values();
        var6_6 = var5_5.length;
        block8: for (var7_7 = (int)Class1011.field4186[0]; var7_7 < var6_6; ++var7_7) {
            block12: {
                b = var5_5[var7_7];
                a = Class4122.field9561.field_1687.method_8320(c.method_10093(b));
                if (a.method_26215() || !a.method_26227().method_15769() || a.method_26204() == class_2246.field_10535) continue;
                if (a.method_26204() == class_2246.field_10105) break block12;
                v0 = 13650;
                ** GOTO lbl17
            }
            v0 = 13651;
            if (true) ** GOTO lbl17
            block9: while (true) {
                v0 = 13649;
lbl17:
                // 3 sources

                switch (v0) {
                    case 13651: {
                        continue block9;
                    }
                    case 13650: {
                        if (a.method_26204() == class_2246.field_10414) ** GOTO lbl38
                        if (!d) ** GOTO lbl-1000
                        if (e.contains(b.method_10153())) ** GOTO lbl26
                        v1 = 59897;
                        ** GOTO lbl30
lbl26:
                        // 1 sources

                        v1 = 59898;
                        if (true) ** GOTO lbl30
                        block10: while (true) {
                            v1 = 59896;
lbl30:
                            // 3 sources

                            switch (v1) {
                                case 59898: {
                                    continue block10;
                                }
                                case 59897: {
                                    break block10;
                                }
                                default: lbl-1000:
                                // 2 sources

                                {
                                    f = b;
                                    break block8;
                                }
                            }
                            break;
                        }
                    }
lbl38:
                    // 3 sources

                    default: {
                        continue block8;
                    }
                }
                break;
            }
        }
        if (f == null) {
            return null;
        }
        return f.method_10153();
    }

    private static boolean method12763() {
        return Class1807.method15769();
    }

    private static void method12764() {
        Class298.method1924();
    }

    private static int method12765(int n2, int n3, Class4971 class4971, Class67 class67) {
        return Class3878.method19185(n2, n3, class4971, class67);
    }

    public Class1011() {
        Class3815.INSTANCE.method18546(this);
    }

    private static boolean method12766() {
        return Class1807.method15769();
    }

    private static boolean method12767() {
        return Class1807.method15769();
    }

    private static void method12768() {
        Class6009.method23561();
    }

    public static class_746 method12769(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method12770(Class1011 class1011, class_3965 class_39652, int n2, boolean bl2, boolean bl3, boolean bl4, Class6134 class6134) {
        return class1011.method12747(class_39652, n2, bl2, bl3, bl4, class6134);
    }

    private static boolean method12771(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method12772(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static class_1269 method12773() {
        return class_1269.field_5812;
    }

    private static void method12774() {
        Class5659.method22184();
    }

    public class_1269 method12775(class_3965 a2, class_1268 b2) {
        Class1011.method12789(Class5723.field11048, arg_0 -> Class1011.method12755(b2, a2, arg_0));
        return Class1011.method12773();
    }

    private static Set method12776(Class1011 class1011, class_243 class_2432, class_243 class_2433) {
        return class1011.method12822(class_2432, class_2433);
    }

    private static class_2350 method12777(Class1011 class1011, class_2338 class_23382, boolean bl2) {
        return class1011.method12762(class_23382, bl2);
    }

    private static void method12778() {
        Class4146.method20697();
    }

    private static boolean method12779() {
        return Class447.method10322();
    }

    public static class_638 method12780(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static boolean method12781() {
        return Class447.method10322();
    }

    private static boolean method12782() {
        return Class1807.method15753();
    }

    private static void method12783() {
        Class3979.method19561();
    }

    public boolean method12784(class_2338 a2, int b2, boolean c2, boolean d2, Class6134 e2) {
        return this.method12804(a2, b2, c2, d2, e2, (boolean)field4186[0]);
    }

    public static class_746 method12785(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private class_1269 method12786(class_3965 a2, class_1268 b2) {
        return Class1011.method12810().field_1761.method_2896(Class4122.field9561.field_1724, b2, a2);
    }

    public static class_746 method12787(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method12788() {
        return Class447.method10252();
    }

    private static void method12789(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    public boolean method12790(class_2338 a2) {
        return ((double)a2.method_10264() > Class4122.field9561.field_1724.method_23318() + (double)Class4122.field9561.field_1724.method_5751() ? (int)field4186[1] : (int)field4186[0]) != 0;
    }

    private static void method12791() {
        Class1745.method15538();
    }

    public Set method12792(double a2, double b2, double c2, double d2, double e2, double f2) {
        double g2 = a2 - d2;
        double h2 = b2 - e2;
        double i2 = c2 - f2;
        HashSet<class_2350> j2 = new HashSet<class_2350>((int)field4186[2]);
        if (h2 > 0.5) {
            j2.add(class_2350.field_11036);
        } else if (h2 < -0.5) {
            j2.add(Class1011.method12803());
        } else {
            j2.add(class_2350.field_11036);
            j2.add(class_2350.field_11033);
        }
        if (g2 > Class5574.field10580) {
            j2.add(class_2350.field_11034);
        } else if (g2 < Class1417.field5445) {
            j2.add(class_2350.field_11039);
        } else {
            j2.add(class_2350.field_11034);
            j2.add(class_2350.field_11039);
        }
        if (i2 > 0.5) {
            j2.add(class_2350.field_11035);
        } else if (i2 < -0.5) {
            j2.add(class_2350.field_11043);
        } else {
            j2.add(class_2350.field_11035);
            j2.add(class_2350.field_11043);
        }
        return j2;
    }

    public static class_2350 method12793() {
        return class_2350.field_11036;
    }

    public boolean method12794(class_2338 a2, int b2, boolean c2, boolean d2, boolean e2, Class6134 f2) {
        return this.method12757(a2, b2, c2, d2, e2, (boolean)field4186[0], f2);
    }

    public static class_2350 method12795() {
        return class_2350.field_11033;
    }

    private static boolean method12796() {
        return Class3979.method19551();
    }

    private static void method12797(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method12798() {
        return Class3979.method19544();
    }

    public class_2350 method12799(class_2338 a2, boolean b2) {
        class_2350 c2 = this.method12762(a2, b2);
        return c2 == null ? Class1011.method12793() : c2;
    }

    private static void method12800() {
        Class1503.method14420();
    }

    private static int method12801(int n2, int n3, Class1463 class1463, Class298 class298) {
        return Class3878.method19190(n2, n3, class1463, class298);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method12802(class_3965 a2, class_1268 b2, boolean c2, boolean d2) {
        class_1269 g2;
        int f2;
        class_2680 e2 = Class1011.method12748(Class4122.field9561).method_8320(a2.method_17777());
        int n2 = Class5852.method22958(e2) && !Class1011.method12750(Class4122.field9561).method_5715() ? (int)field4186[1] : (f2 = (int)field4186[0]);
        if (f2 != 0) {
            Class5723.field11052.method14000((boolean)field4186[1]);
            Class1807.method15744();
        }
        class_1269 class_12692 = g2 = d2 ? this.method12775(a2, b2) : this.method12786(a2, b2);
        if (!g2.method_23665()) {
            return Class803.method12224(0.8774339861740219, 0.2735405519270917, 0.5344265731995477, 0.03451892806080048, 0.7223070446086831, 0.7666642530596932);
        }
        int n3 = 38285;
        block4: while (true) {
            switch (n3) {
                case 38286: {
                    n3 = 38284;
                    continue block4;
                }
                case 38285: {
                    if (!g2.method_23666()) break block4;
                    if (!c2) {
                        Class5723.field11048.method21341((class_2596)new class_2879(Class1011.method12811()));
                        break block4;
                    }
                    Class4122.field9561.field_1724.method_6104(Class1011.method12753());
                    break block4;
                }
            }
            break;
        }
        if (f2 != 0) {
            Class5723.field11052.method14000((boolean)field4186[0]);
        }
        return g2.method_23665();
    }

    public static class_2350 method12803() {
        return class_2350.field_11033;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method12804(class_2338 a2, int b2, boolean c2, boolean d2, Class6134 e2, boolean f2) {
        class_2350 g2 = this.method12762(a2, c2);
        if (f2 || Class379.method5038().method1265() && g2 == null) {
            g2 = class_2350.field_11033;
            return this.method12756(a2, g2, b2, d2, Class455.method10581().method10559(), e2);
        }
        int n2 = g2 == null ? 4006 : 4007;
        block4: while (true) {
            switch (n2) {
                case 4007: {
                    n2 = 4005;
                    continue block4;
                }
                case 4006: {
                    return (int)field4186[0] != 0;
                }
            }
            break;
        }
        class_2338 h2 = a2.method_10093(g2.method_10153());
        return this.method12756(h2, g2, b2, d2, (boolean)field4186[0], e2);
    }

    private static void method12805() {
        Class4146.method20694();
    }

    private static boolean method12806(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method12807() {
        Class6454.method24594();
    }

    public static double method12808(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method12809(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_310 method12810() {
        return Class4122.field9561;
    }

    public static class_1268 method12811() {
        return class_1268.field_5808;
    }

    private static boolean method12812() {
        return Class5659.method22194();
    }

    private static void method12813() {
        Class1745.method15538();
    }

    private static void method12814(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static boolean method12815() {
        return Class1807.method15742();
    }

    private static boolean method12816() {
        return Class5659.method22194();
    }

    public boolean method12817(class_3965 c2, int d2, boolean e2, boolean f2, Class6134 g2) {
        int j2;
        int h2 = d2 != Class5723.field11058.method18969() ? (int)field4186[1] : (int)field4186[0];
        int i2 = Class5723.field11058.method18969();
        if (h2 != 0) {
            Class5723.field11058.method18887(d2);
        }
        if (f2) {
            Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
        }
        int n2 = j2 = g2 != null ? (int)field4186[1] : (int)field4186[0];
        if (j2 != 0) {
            float[] a2 = Class1011.method12749(Class4122.field9561.field_1724.method_33571(), c2.method_17784());
            g2.handleRotation((boolean)field4186[1], a2);
        }
        boolean k2 = this.method12802(c2, f2 ? class_1268.field_5810 : class_1268.field_5808, e2, (boolean)field4186[1]);
        if (j2 != 0) {
            float[] b2 = Class1503.method14416(Class4122.field9561.field_1724.method_33571(), c2.method_17784());
            g2.handleRotation((boolean)field4186[0], b2);
        }
        if (f2) {
            Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
        }
        if (h2 != 0) {
            Class5723.field11058.method18987(i2);
        }
        return k2;
    }

    public static double method12818(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static Class3850 method12819() {
        return Class5723.field11058;
    }

    public static class_746 method12820(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method12821() {
        return Class1807.method15753();
    }

    public Set method12822(class_243 a2, class_243 b2) {
        return this.method12792(a2.field_1352, Class1011.method12818(a2), a2.field_1350, Class1011.method12808(b2), b2.field_1351, Class1011.method12745(b2));
    }

    public static class_310 method12823() {
        return Class4122.field9561;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

