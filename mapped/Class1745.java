/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class137;
import mapped.Class1429;
import mapped.Class1453;
import mapped.Class1503;
import mapped.Class155;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class182;
import mapped.Class2298;
import mapped.Class2300;
import mapped.Class231;
import mapped.Nametags;
import mapped.Chams;
import mapped.HoleESP;
import mapped.AutoEat;
import mapped.Class3850;
import mapped.Disabler;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class43;
import mapped.AntiCheat;
import mapped.Class480;
import mapped.Class521;
import mapped.Class5449;
import mapped.Class5489;
import mapped.Class5496;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5829;
import mapped.Class5836;
import mapped.Class5852;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class633;
import mapped.Class64;
import mapped.Class641;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class657;
import mapped.Class803;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1745 {
    public static boolean field6542;
    public static final List field6543;
    private static final class_2680 field6544;
    public static boolean field6545;
    public static boolean field6546;
    public static Class2298 field6547;
    public static boolean field6548;
    public static Class480 field6549;
    private static long[] field6550;
    public static boolean field6551;
    public static boolean field6552;
    public static boolean field6553;
    public static boolean field6554;
    public static boolean field6555;
    public static Class480 field6556;
    private static final List field6557;

    private static void method15519(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method15520() {
        Class5659.method22184();
    }

    public static class_746 method15521(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15522() {
        Class1503.method14420();
    }

    private static void method15523(float f2) {
        Class5836.method22907(f2);
    }

    private static void method15524(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_2338 method15525() {
        return class_2338.field_10980;
    }

    public static class_310 method15526() {
        return Class4122.field9561;
    }

    private static void method15527(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class2298 method15528() {
        return field6547;
    }

    private static void method15529() {
        Class5836.method22885();
    }

    private static void method15530(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    private static void method15531() {
        Class6009.method23561();
    }

    private static void method15532() {
        Class4146.method20694();
    }

    private static void method15533(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method15534(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static class_310 method15535() {
        return Class4122.field9561;
    }

    public static class_2848.class_2849 method15536() {
        return class_2848.class_2849.field_12984;
    }

    public static class_746 method15537(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method15538() {
        Class1745.method15670().clear();
        Class1745.method15543(Class2298.method15863(Class1745.method15542().method10569()));
        Class1745.method15575(AntiCheat.method10581().method10584());
        field6549 = AntiCheat.method10581().method10558();
        field6555 = Class1745.method15598().method10598();
        field6545 = AntiCheat.method10581().method10579();
        field6552 = Class1745.method15639(AntiCheat.method10581());
        field6554 = AntiCheat.method10581().method10576();
        field6553 = Class1745.method15669(AntiCheat.method10581());
        field6542 = AntiCheat.method10581().method10560();
        Class1745.method15617(AntiCheat.method10581().method10589());
        field6548 = (int)field6550[0];
    }

    private static void method15539(Class480 class480, class_1268 class_12682) {
        class480.method10782(class_12682);
    }

    public static class_310 method15540() {
        return Class4122.field9561;
    }

    public static class_2350 method15541(class_2338 a2) {
        return Class1745.method15668(a2, Double.MAX_VALUE);
    }

    private static AntiCheat method15542() {
        return AntiCheat.method10581();
    }

    public static void method15543(Class2298 class2298) {
        field6547 = class2298;
    }

    public static class_746 method15544(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method15545() {
        return Class1807.method15753();
    }

    private static void method15546() {
        Class6454.method24594();
    }

    public static boolean method15547(class_2338 a2, class_2350 b2) {
        class_2338 c2 = a2.method_10093(b2);
        return Class1745.method15555(field6547, c2, b2.method_10153(), Class4122.field9561.field_1687, (class_1657)Class1745.method15537(Class4122.field9561), new Class657(c2, field6544));
    }

    private static boolean method15548(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method15549(float f2) {
        Class5836.method22907(f2);
    }

    private static int method15550(int n2, int n3, Disabler class390, Class3850 class3850) {
        return Class5829.method22826(n2, n3, class390, class3850);
    }

    private static class_2596 method15551(class_1268 a2, class_3965 b2, int c2) {
        return new class_2885(a2, b2, c2);
    }

    private static class_2338 method15552() {
        return Class1745.method15525();
    }

    public static class_310 method15553() {
        return Class4122.field9561;
    }

    private static void method15554() {
        Class5836.method22885();
    }

    private static boolean method15555(Class2298 class2298, class_2338 class_23382, class_2350 class_23502, class_638 class_6383, class_1657 class_16572, Class657 class657) {
        return class2298.method15828(class_23382, class_23502, class_6383, class_16572, class657);
    }

    private static void method15556() {
        Class5836.method22885();
    }

    public static class_638 method15557(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static class_2350.class_2351 method15558() {
        return class_2350.class_2351.field_11048;
    }

    private static int method15559(int n2, int n3, Class43 class43, Class521 class521) {
        return Class5829.method22870(n2, n3, class43, class521);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method15560(class_2680 a2, class_2338 b2) {
        int n2;
        int n3 = !field6545 ? 63792 : 63793;
        block4: while (true) {
            switch (n3) {
                case 63793: {
                    n3 = 63791;
                    continue block4;
                }
                case 63792: {
                    if (!Class5852.method22974(a2, b2) || Class4122.field9561.field_1724.method_5715()) break block4;
                    n2 = (int)field6550[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field6550[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static class_2350 method15561(class_2338 b2, double c2) {
        class_2350 d2 = Class1745.method15528().method15860(b2);
        if (d2 == null) {
            int n2 = 9758;
            Class6322.method24332(Class1453.field5533, 0.65470904f);
            return null;
        }
        int n3 = 9757;
        int n4 = n3;
        if (n4 != 9757) {
            if (n4 != 9758) return null;
            return null;
        }
        class_243 a2 = Class1745.method15658(b2, d2);
        if (!(Class4122.field9561.field_1724.method_33571().method_1022(a2) <= c2)) return null;
        return d2;
    }

    public static class_310 method15562() {
        return Class4122.field9561;
    }

    private static void method15563() {
        Class4146.method20697();
    }

    /*
     * Unable to fully structure code
     */
    public static List method15564(class_2338 i, double j, int k, List l) {
        block6: {
            block7: {
                if (k <= 0) break block6;
                if (l == null) {
                    l = new ArrayList<Class653>();
                }
                if ((h = Class1745.method15578(i, j)) != null) {
                    l.add(new Class653(h, (boolean)Class1745.field6550[0]));
                    return l;
                }
                if (k <= (int)Class1745.field6550[1]) break block7;
                v0 = g = Class1745.field6551 != false ? k - (int)Class1745.field6550[1] : (int)Class1745.field6550[1];
                if (g >= k) break block6;
                var7_6 = class_2350.values();
                var8_7 = var7_6.length;
                for (var9_8 = (int)Class1745.field6550[0]; var9_8 < var8_7; ++var9_8) {
                    block9: {
                        block5: {
                            block8: {
                                f = var7_6[var9_8];
                                c = new ArrayList<Class653>(l);
                                d = i.method_10093(f);
                                e = (int)Class1745.field6550[0];
                                for (Class653 a : c) {
                                    if (!a.method11461().equals((Object)d)) continue;
                                    e = (int)Class1745.field6550[1];
                                    break;
                                }
                                if (e != 0) continue;
                                if (!Class1215.method13257(d)) continue;
                                if (!Class1745.field6547.method15828(d, f.method_10153(), Class1745.method15602(Class4122.field9561), (class_1657)Class4122.field9561.field_1724, new Class657(d, Class1745.field6544))) continue;
                                if (Class1745.method15668(d, j) != null) break block8;
                                v1 = 9227;
                                ** GOTO lbl33
                            }
                            v1 = 9228;
                            if (true) ** GOTO lbl33
                            do {
                                v1 = var16_15 = 9226;
lbl33:
                                // 3 sources

                                if (var16_15 == 9227) break block5;
                            } while (var16_15 == 9228);
                            break block9;
                        }
                        c.add(new Class653(d, (boolean)Class1745.field6550[1]));
                        b = Class1745.method15564(d, j, g, c);
                        if (b.isEmpty()) continue;
                        if (((Class653)b.getLast()).method11462()) continue;
                        return b;
                    }
                    c.add(new Class653(d, (boolean)Class1745.field6550[0]));
                    return c;
                }
                ++g;
                Class1807.method15744();
                return null;
            }
            return Class1745.method15591();
        }
        return Class1745.field6557;
    }

    private static void method15565(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method15566(class_2338 b2, class_2350 c2, class_1268 d2, boolean e2, boolean f2) {
        class_243 g2 = Class1745.method15652(b2, c2);
        if (f2) {
            float[] a2 = Class1503.method14416(Class4122.field9561.field_1724.method_33571(), g2);
            Class1503.method14417(a2[(int)field6550[0]], a2[(int)field6550[1]]);
        }
        class_3965 h2 = new class_3965(g2, c2, b2, (boolean)field6550[0]);
        if (e2) {
            Class1745.method15530(Class1745.method15603(), arg_0 -> Class1745.method15551(d2, h2, arg_0));
        } else {
            Class4122.field9561.field_1761.method_2896(Class1745.method15655(Class1745.method15540()), d2, h2);
        }
        if (f2) {
            Class1745.method15608();
        }
        Class1745.method15576().method10782(d2);
        Class1745.method15612(Class4122.field9561, (int)field6550[2]);
    }

    public static boolean method15567(class_1297 a2, double b2, boolean c2) {
        return Class1745.method15574(a2, b2, c2, (boolean)field6550[1]);
    }

    private static void method15568(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method15569() {
        Class1745.method15538();
    }

    private static void method15570() {
        Class5836.method22897();
    }

    private static void method15571() {
        Class1503.method14420();
    }

    private static void method15572(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_243 method15573(class_2338 class_23382, class_2350 class_23502) {
        return Class1745.method15658(class_23382, class_23502);
    }

    public static boolean method15574(class_1297 b2, double c2, boolean d2, boolean e2) {
        class_238 f2 = b2.method_5829();
        class_243 g2 = Class5449.method21103(f2);
        if (Class1745.method15601(Class4122.field9561).method_33571().method_1022(g2) > c2) {
            return (int)field6550[0] != 0;
        }
        if (d2) {
            float[] a2 = Class1503.method14416(Class1745.method15553().field_1724.method_33571(), g2);
            Class1745.method15527(a2[(int)field6550[0]], a2[(int)field6550[1]]);
        }
        if (field6552) {
            Class1745.method15589((class_310)Class4122.field9561).field_3944.method_52787((class_2596)class_2824.method_34206((class_1297)b2, (boolean)Class4122.field9561.field_1724.method_5715()));
            Class4122.field9561.field_1724.method_7350();
        } else {
            Class1745.method15595(Class4122.field9561).method_2918((class_1657)Class4122.field9561.field_1724, b2);
        }
        if (!e2) {
            return Class5659.method22150(Class5489.field10295, 0.6398682427568918, 0.10465712556563644);
        }
        Class1745.method15539(Class1745.method15586(), class_1268.field_5808);
        if (d2) {
            Class1503.method14420();
        }
        Class4122.field9561.field_1724.method_7350();
        Class5723.field11056.field5507.method12593();
        if (b2 instanceof class_1511) {
            field6548 = (int)field6550[1];
        }
        return (int)field6550[1] != 0;
    }

    private static void method15575(Class480 class480) {
        Class1745.method15671(class480);
    }

    public static Class480 method15576() {
        return field6549;
    }

    public static class_310 method15577() {
        return Class4122.field9561;
    }

    public static class_2338 method15578(class_2338 c2, double d2) {
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        for (int i2 = (int)field6550[0]; i2 < n2; ++i2) {
            class_2350 b2 = class_2350Array[i2];
            class_2338 a2 = c2.method_10093(b2);
            if (!Class1215.method13257(a2) || !field6547.method15828(a2, b2.method_10153(), Class4122.field9561.field_1687, (class_1657)Class1745.method15628().field_1724, new Class657(a2, field6544)) || Class1745.method15668(a2, d2) == null) continue;
            return a2;
        }
        return null;
    }

    public static class_638 method15579(class_310 class_3102) {
        return class_3102.field_1687;
    }

    static {
        field6550 = new long[3];
        Class1745.method15626(-2748255935911716526L);
        field6543 = new ArrayList();
        field6544 = class_2246.field_10540.method_9564();
        field6557 = new ArrayList();
        field6548 = (int)field6550[0];
        field6547 = Class2300.INSTANCE;
        field6556 = Class480.field2509;
        field6549 = Class480.field2509;
        field6551 = (int)field6550[1];
    }

    private static void method15580() {
        Class1807.method15744();
    }

    private static class_310 method15581() {
        return Class1745.method15562();
    }

    private static void method15582(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method15583() {
        Class1503.method14420();
    }

    private static void method15584() {
        Class5659.method22184();
    }

    private static void method15585(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class480 method15586() {
        return field6556;
    }

    private static boolean method15587() {
        return Class3979.method19543();
    }

    private static boolean method15588(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static class_746 method15589(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15590(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static List method15591() {
        return Class1745.method15648();
    }

    private static void method15592(float f2) {
        Class5836.method22907(f2);
    }

    private static class_310 method15593() {
        return Class1745.method15600();
    }

    private static void method15594(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_636 method15595(class_310 class_3102) {
        return class_3102.field_1761;
    }

    public static class_2846.class_2847 method15596() {
        return class_2846.class_2847.field_12969;
    }

    public static List method15597(class_2338 a2, double b2, int c2) {
        List d2 = Class1745.method15564(a2, b2, c2, null);
        Collections.reverse(d2);
        return d2;
    }

    private static AntiCheat method15598() {
        return AntiCheat.method10581();
    }

    public static class_746 method15599(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_310 method15600() {
        return Class4122.field9561;
    }

    public static class_746 method15601(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_638 method15602(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class5496 method15603() {
        return Class5723.field11048;
    }

    private static void method15604() {
        Class1745.method15538();
    }

    private static void method15605() {
        Class5836.method22897();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static class_2350 method15606(class_2338 k2, double l2) {
        int n2;
        class_2350[] class_2350Array;
        int n3;
        if (k2.method_10264() < Class1745.method15557(Class4122.field9561).method_31607()) return null;
        if (k2.method_10264() >= Class1745.method15581().field_1687.method_31600()) {
            return null;
        }
        if (!field6554) {
            n3 = (int)field6550[0];
            class_2350Array = class_2350.values();
            int n4 = class_2350Array.length;
            n2 = n3 < n4 ? 1464 : 1465;
        } else {
            double e2 = l2;
            class_2350 f2 = null;
            class_2350[] class_2350Array2 = class_2350.values();
            int n5 = class_2350Array2.length;
            int n6 = (int)field6550[0];
            while (n6 < n5) {
                class_2350 d2 = class_2350Array2[n6];
                class_2338 a2 = k2.method_10093(d2);
                class_2680 b2 = Class4122.field9561.field_1687.method_8320(a2);
                if (!Class1745.method15644(b2, a2)) {
                    Class5836.method22907(0.040040255f);
                    return null;
                }
                ++n6;
            }
            return f2;
        }
        block5: while (true) {
            switch (n2) {
                case 1465: {
                    n2 = 1463;
                    continue block5;
                }
                case 1464: {
                    double i2;
                    class_2350 j2 = class_2350Array[n3];
                    class_2338 g2 = k2.method_10093(j2);
                    class_2680 h2 = Class4122.field9561.field_1687.method_8320(g2);
                    if (!Class1745.method15560(h2, g2) && !h2.method_45474() && h2.method_26227().method_15769() && field6547.method15828(g2, j2.method_10153(), Class1745.method15607().field_1687, (class_1657)Class4122.field9561.field_1724, new Class657(k2, class_2246.field_10124.method_9564())) && (i2 = Class4122.field9561.field_1724.method_33571().method_1022(Class1745.method15658(g2, j2.method_10153()))) <= l2) {
                        return j2;
                    }
                    ++n3;
                    Class5836.method22897();
                    return null;
                }
            }
            break;
        }
        return null;
    }

    public static class_310 method15607() {
        return Class4122.field9561;
    }

    private static void method15608() {
        Class1503.method14420();
    }

    private static Class2298 method15609() {
        return Class1745.method15631();
    }

    private static int method15610(int n2, int n3, HoleESP class315, Class182 class182) {
        return Class5829.method22821(n2, n3, class315, class182);
    }

    public static class_2848.class_2849 method15611() {
        return class_2848.class_2849.field_12979;
    }

    public static void method15612(class_310 class_3102, int n2) {
        class_3102.field_1752 = n2;
    }

    private static void method15613() {
        Chams.method1924();
    }

    private static boolean method15614(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static int method15615(int n2, int n3, Class231 class231, Nametags class287) {
        return Class5829.method22874(n2, n3, class231, class287);
    }

    private static void method15616(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method15617(boolean bl2) {
        field6546 = bl2;
    }

    public static class_2350 method15618(class_2338 a2) {
        return Class1745.method15609().method15860(a2);
    }

    /*
     * Unable to fully structure code
     */
    public static void method15619(class_2338 a, class_2350 b, class_1268 c, boolean d, boolean e) {
        block6: {
            block4: {
                block3: {
                    block5: {
                        if (c != class_1268.field_5808) break block4;
                        if (!Class1745.field6555) break block5;
                        v0 = 20908;
                        ** GOTO lbl10
                    }
                    v0 = 20909;
                    if (true) ** GOTO lbl10
                    do {
                        v0 = var5_5 = 20907;
lbl10:
                        // 3 sources

                        if (var5_5 == 20908) break block3;
                    } while (var5_5 == 20909);
                    break block4;
                }
                v1 = (int)Class1745.field6550[1];
                break block6;
            }
            v1 = f = (int)Class1745.field6550[0];
        }
        if (f != 0) {
            c = class_1268.field_5810;
            Class4122.field9561.method_1562().method_52787((class_2596)new class_2846(Class1745.method15596(), Class1745.method15552(), class_2350.field_11033));
        }
        Class1745.method15641(a, b, c, d, e);
        if (f != 0) {
            Class4122.field9561.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, class_2338.field_10980, Class1745.method15640()));
        }
    }

    private static void method15620() {
        Class6454.method24594();
    }

    private static void method15621() {
        Class4146.method20694();
    }

    private static void method15622() {
        Class6454.method24594();
    }

    private static int method15623(int n2, int n3, AutoEat class364, Class64 class64) {
        return Class5829.method22818(n2, n3, class364, class64);
    }

    private static boolean method15624(int n2) {
        return Class4196.method20803(n2);
    }

    public static void method15625(class_2338 a2, class_2350 b2, class_1268 c2, boolean d2, boolean e2) {
        int g2;
        class_2680 f2 = Class4122.field9561.field_1687.method_8320(a2.method_10093(b2));
        int n2 = g2 = Class5852.method22974(f2, a2.method_10093(b2)) && !Class1745.method15599(Class4122.field9561).method_5715() && field6545 ? (int)field6550[1] : (int)field6550[0];
        if (g2 != 0) {
            Class1745.method15593().field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)Class4122.field9561.field_1724, Class1745.method15611()));
        }
        Class1745.method15566(a2.method_10093(b2), b2.method_10153(), c2, d2, e2);
        if (g2 != 0) {
            Class4122.field9561.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)Class1745.method15577().field_1724, Class1745.method15536()));
        }
    }

    private static void method15626(long l2) {
        Class1745.method15650(l2);
    }

    private static int method15627(int n2, int n3, Class137 class137, Class155 class155) {
        return Class5829.method22834(n2, n3, class137, class155);
    }

    private static class_310 method15628() {
        return Class1745.method15535();
    }

    public static class_238 method15629(class_2338 a2, class_2350 b2) {
        double j2;
        class_243 c2 = a2.method_46558();
        class_2382 d2 = b2.method_10163();
        double e2 = d2.method_10263();
        double f2 = d2.method_10264();
        double g2 = d2.method_10260();
        class_2350.class_2351 h2 = b2.method_10166();
        double i2 = h2 != Class1745.method15558() ? Class1429.field5470 : 0.0;
        double d3 = j2 = h2 != class_2350.class_2351.field_11052 ? Class641.field3133 : 0.0;
        if (h2 != class_2350.class_2351.field_11051) {
            double d4 = 0.5;
            Class5659.method22184();
            return null;
        }
        double k2 = 0.0;
        class_243 l2 = new class_243(c2.method_10216() + e2 / 2.0, c2.method_10214() + f2 / 2.0, c2.method_10215() + g2 / 2.0);
        return new class_238(l2.method_10216() - i2, l2.method_10214() - j2, l2.method_10215() - k2, l2.method_10216() + i2, l2.method_10214() + j2, l2.method_10215() + k2);
    }

    private static int method15630(int n2, int n3, Class1108 class1108, Class633 class633) {
        return Class5829.method22879(n2, n3, class1108, class633);
    }

    public static Class2298 method15631() {
        return field6547;
    }

    private static void method15632() {
        Chams.method1924();
    }

    private static void method15633(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method15634(Class2298 class2298, class_2338 class_23382, class_2350 class_23502, class_638 class_6383, class_1657 class_16572) {
        return class2298.method15846(class_23382, class_23502, class_6383, class_16572);
    }

    public static void method15635(class_2338 b2, class_1268 c2, boolean d2, boolean e2, boolean f2) {
        class_2350 g2 = Class1745.method15541(b2);
        if (g2 != null) {
            Class1745.method15625(b2, g2, c2, d2, e2);
        } else if (f2) {
            class_2350 a2 = Class1745.method15618(b2);
            if (a2 != null) {
                Class1745.method15619(b2, a2, c2, d2, e2);
            }
        }
    }

    private static void method15636() {
        Class5836.method22885();
    }

    public static void method15637(class_2338 a2, class_1268 b2, boolean c2, boolean d2) {
        class_2350 e2 = Class1745.method15541(a2);
        if (e2 != null) {
            Class1745.method15625(a2, e2, b2, c2, d2);
        }
    }

    private static void method15638(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Boolean method15639(AntiCheat class455) {
        return class455.method10563();
    }

    public static class_2350 method15640() {
        return class_2350.field_11033;
    }

    private static void method15641(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682, boolean bl2, boolean bl3) {
        Class1745.method15566(class_23382, class_23502, class_12682, bl2, bl3);
    }

    private static void method15642() {
        Class3979.method19561();
    }

    private static class_746 method15643(class_310 class_3102) {
        return Class1745.method15659(class_3102);
    }

    private static boolean method15644(class_2680 class_26802, class_2338 class_23382) {
        return Class1745.method15560(class_26802, class_23382);
    }

    private static void method15645(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method15646() {
        Class1745.method15538();
    }

    private static class_746 method15647(class_310 class_3102) {
        return Class1745.method15544(class_3102);
    }

    public static List method15648() {
        return field6557;
    }

    private static boolean method15649(Class2298 class2298, class_2338 class_23382, class_2350 class_23502, class_638 class_6383, class_1657 class_16572, Class657 class657) {
        return class2298.method15828(class_23382, class_23502, class_6383, class_16572, class657);
    }

    private static void method15650(long l2) {
        Class1745.field6550[1] = l2 ^ 0xD9DC3BC9841F9953L;
        Class1745.field6550[0] = l2 ^ 0xD9DC3BC9841F9952L;
        Class1745.field6550[2] = l2 ^ 0xD9DC3BC9841F9956L;
    }

    public static boolean method15651(class_2338 a2, boolean b2) {
        class_2350 c2 = Class1745.method15618(a2);
        if (c2 == null) {
            return (int)field6550[0] != 0;
        }
        Class1745.method15566(a2, c2, class_1268.field_5808, field6542, b2);
        return (int)field6550[1] != 0;
    }

    private static class_243 method15652(class_2338 class_23382, class_2350 class_23502) {
        return Class1745.method15658(class_23382, class_23502);
    }

    private static void method15653(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_746 method15654(class_310 class_3102) {
        return Class1745.method15521(class_3102);
    }

    public static class_746 method15655(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_638 method15656(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method15657(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_243 method15658(class_2338 a2, class_2350 b2) {
        if (field6553) {
            return Class5449.method21103(Class1745.method15629(a2, b2));
        }
        return a2.method_46558().method_43206(b2, 0.5);
    }

    public static class_746 method15659(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15660() {
        Class6009.method23561();
    }

    private static void method15661(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method15662() {
        Class5659.method22184();
    }

    private static void method15663() {
        Class1745.method15538();
    }

    private static void method15664() {
        Class5836.method22897();
    }

    private static void method15665() {
        Class1503.method14420();
    }

    private static void method15666() {
        Class6454.method24594();
    }

    private static boolean method15667() {
        return Class5836.method22894();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static class_2350 method15668(class_2338 k2, double l2) {
        block12: {
            if (k2.method_10264() < Class4122.field9561.field_1687.method_31607()) {
                return null;
            }
            if (k2.method_10264() >= Class4122.field9561.field_1687.method_31600()) {
                return null;
            }
            if (!field6554) break block12;
            double e2 = l2;
            class_2350 f2 = null;
            class_2350[] class_2350Array = class_2350.values();
            int n2 = class_2350Array.length;
            int n3 = (int)field6550[0];
            while (n3 < n2) {
                block14: {
                    class_2338 a2;
                    class_2350 d2;
                    block15: {
                        block13: {
                            d2 = class_2350Array[n3];
                            a2 = k2.method_10093(d2);
                            class_2680 b2 = Class4122.field9561.field_1687.method_8320(a2);
                            if (field6546 && field6543.contains(a2)) break block13;
                            if (Class1745.method15560(b2, a2) || b2.method_45474() || !b2.method_26227().method_15769() || !field6547.method15846(a2, d2.method_10153(), Class1745.method15656(Class4122.field9561), (class_1657)Class4122.field9561.field_1724)) break block14;
                            break block15;
                        }
                        if (!field6547.method15828(a2, d2.method_10153(), Class1745.method15526().field_1687, (class_1657)Class4122.field9561.field_1724, new Class657(a2, class_2246.field_10540.method_9564()))) break block14;
                    }
                    double c2 = Class4122.field9561.field_1724.method_33571().method_1022(Class1745.method15658(a2, d2.method_10153()));
                    if (!(c2 > e2)) {
                        f2 = d2;
                        e2 = c2;
                    }
                }
                ++n3;
            }
            return f2;
        }
        class_2350[] class_2350Array = class_2350.values();
        int n4 = class_2350Array.length;
        int n5 = (int)field6550[0];
        while (true) {
            block17: {
                class_2338 g2;
                class_2350 j2;
                block18: {
                    block16: {
                        if (n5 >= n4) {
                            return null;
                        }
                        j2 = class_2350Array[n5];
                        g2 = k2.method_10093(j2);
                        class_2680 h2 = Class4122.field9561.field_1687.method_8320(g2);
                        if (field6546 && field6543.contains(g2)) break block16;
                        if (Class1745.method15560(h2, g2) || h2.method_45474() || !h2.method_26227().method_15769() || !Class1745.method15634(field6547, g2, j2.method_10153(), Class4122.field9561.field_1687, (class_1657)Class4122.field9561.field_1724)) break block17;
                        break block18;
                    }
                    if (!field6547.method15828(g2, j2.method_10153(), Class4122.field9561.field_1687, (class_1657)Class1745.method15643(Class4122.field9561), new Class657(g2, class_2246.field_10540.method_9564()))) break block17;
                }
                double i2 = Class4122.field9561.field_1724.method_33571().method_1022(Class1745.method15573(g2, j2.method_10153()));
                if (i2 <= l2) return j2;
            }
            ++n5;
        }
    }

    private static Boolean method15669(AntiCheat class455) {
        return class455.method10594();
    }

    public static List method15670() {
        return field6543;
    }

    public static void method15671(Class480 class480) {
        field6556 = class480;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

