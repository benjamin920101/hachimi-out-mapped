/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.decoration.ItemFrameEntity
 *  net.minecraft.entity.decoration.painting.PaintingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.block.LadderBlock
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.ScaffoldingBlock
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class133;
import mapped.Class1348;
import mapped.Class1503;
import mapped.Class159;
import mapped.Class1668;
import mapped.Class171;
import mapped.Class1745;
import mapped.Class178;
import mapped.Class1807;
import mapped.Class195;
import mapped.Class210;
import mapped.Class2300;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.AutoTunnel;
import mapped.NameProtect;
import mapped.Chams;
import mapped.AntiLevitation;
import mapped.Class3209;
import mapped.Class3282;
import mapped.Class3355;
import mapped.Class3449;
import mapped.NoInteract;
import mapped.Blink;
import mapped.Class3812;
import mapped.Class3815;
import mapped.Class3850;
import mapped.Fullbright;
import mapped.Shaders;
import mapped.Class4036;
import mapped.MainHand;
import mapped.Class411;
import mapped.Class4146;
import mapped.AutoTrap;
import mapped.Class4196;
import mapped.SpeedMine;
import mapped.Velocity;
import mapped.Server;
import mapped.Class477;
import mapped.Class480;
import mapped.Class526;
import mapped.Class538;
import mapped.Class543;
import mapped.Class5541;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5760;
import mapped.Class5788;
import mapped.Class5836;
import mapped.Class5858;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6132;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6373;
import mapped.Class6402;
import mapped.Class6408;
import mapped.Class6454;
import mapped.Class65;
import mapped.Class700;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.decoration.painting.PaintingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.block.LadderBlock;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Phase
extends Class411 {
    Class248 field2274;
    Class248 field2275;
    Class248 field2276;
    Class248 field2277;
    private static long[] field2278 = new long[10];
    Class248 field2279;
    private static Phase INSTANCE;
    Class248 field2280;
    Class248 field2281;
    Class248 field2282;
    Class248 field2283;
    Class248 field2284;
    Class248 field2285 = this.method450(new Class260("Mode", "The phase mode for clipping into blocks", Class526.field2611, Class526.values()));
    Class248 field2286;
    Class248 field2287;
    Class248 field2288;
    Class248 field2289;
    Class248 field2290;
    Class248 field2291;
    Class248 field2292;
    Class248 field2293;
    Class248 field2294;
    Class248 field2295;

    public boolean method9945() {
        class_238 d2 = Phase.method10113(field290).method_5829();
        for (int c2 = class_3532.method_15357((double)d2.field_1323); c2 < class_3532.method_15357((double)Phase.method10108(d2)) + (int)field2278[1]; ++c2) {
            for (int b2 = class_3532.method_15357((double)d2.field_1322); b2 < class_3532.method_15357((double)d2.field_1325) + (int)field2278[1]; ++b2) {
                int a2 = class_3532.method_15357((double)Phase.method10092(d2));
                if (a2 >= class_3532.method_15357((double)d2.field_1324) + (int)field2278[1]) continue;
                if (Phase.field290.field_1687.method_8320(new class_2338(c2, b2, a2)).method_51366() && d2.method_994(new class_238((double)c2, (double)b2, (double)a2, (double)c2 + 1.0, (double)b2 + 1.0, (double)a2 + 1.0))) {
                    return (int)field2278[1] != 0;
                }
                ++a2;
                return Class4196.method20803(-1336499199);
            }
        }
        return (int)field2278[6] != 0;
    }

    public static class_746 method9946(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9947(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method9948(float f2) {
        Class5836.method22907(f2);
    }

    private static class_2338 method9949(Class178 class178) {
        return class178.method346();
    }

    private static int method9950(int n2, int n3, Fullbright class395, Server class453) {
        return Class1348.method13852(n2, n3, class395, class453);
    }

    private static Object method9951(Class248 class248) {
        return class248.method507();
    }

    private static class_2338 method9952(class_1657 class_16572, boolean bl2) {
        return Class5659.method22153(class_16572, bl2);
    }

    public static Class248 method9953(Phase class445) {
        return class445.field2276;
    }

    private static int method9954(int n2, int n3, Class5649 class5649, Shaders class402) {
        return Class1348.method13855(n2, n3, class5649, class402);
    }

    public static Class526 method9955() {
        return Class526.field2611;
    }

    private static Object method9956(Class248 class248) {
        return class248.method507();
    }

    private static Object method9957(Class248 class248) {
        return class248.method507();
    }

    private Boolean method9958() {
        if (this.field2285.method507() == Class526.field2611) {
            int n2 = (int)field2278[1];
            Phase.method10057();
            return null;
        }
        return (boolean)field2278[6];
    }

    private static void method9959(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method9960(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method9961(Class248 class248) {
        return class248.method507();
    }

    private static void method9962() {
        Class1745.method15538();
    }

    private static boolean method9963(class_1297 class_12972, double d2, boolean bl2) {
        return Class1745.method15567(class_12972, d2, bl2);
    }

    private static void method9964(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private class_2596 method9965(int a2) {
        return new class_2886(class_1268.field_5808, a2, this.method10103(), this.method10121());
    }

    private static void method9966() {
        Class5836.method22890();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9967() {
        int n2;
        if (this.field2285.method507() == Class526.field2611 && ((Boolean)Phase.method10102(this).method507()).booleanValue()) {
            n2 = (int)field2278[1];
            return n2 != 0;
        }
        n2 = (int)field2278[6];
        return n2 != 0;
    }

    public static double method9968(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method9969() {
        Class5836.method22885();
    }

    private static Object method9970(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method9971(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private Boolean method9972() {
        return (this.field2285.method507() == Class526.field2611 && (Boolean)this.field2287.method507() != false ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    public static double method9973(class_238 class_2383) {
        return class_2383.field_1322;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9974() {
        int n2;
        if (this.field2285.method507() == Phase.method10078() && ((Boolean)this.field2287.method507()).booleanValue()) {
            n2 = (int)field2278[1];
            return n2 != 0;
        }
        n2 = (int)field2278[6];
        return n2 != 0;
    }

    private static void method9975(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Class248 method9976(Phase class445) {
        return Phase.method10105(class445);
    }

    private Boolean method9977() {
        return (this.field2285.method507() == Class526.field2611 && ((Boolean)this.field2287.method507()).booleanValue() ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static Object method9978(Class248 class248) {
        return class248.method507();
    }

    private Boolean method9979() {
        return (Phase.method9957(this.field2285) == Class526.field2611 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static Velocity method9980() {
        return Velocity.method10231();
    }

    private static void method9981() {
        Class5836.method22890();
    }

    private static void method9982(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method9983(Phase class445) {
        return class445.field2284;
    }

    public static class_746 method9984(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method9985() {
        return (Phase.method10070(this.field2285) == Class526.field2611 && (Boolean)this.field2295.method507() != false && (Boolean)this.field2288.method507() != false ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    @Class1
    public void method9986(Class195 a2) {
        a2.method10();
    }

    private Boolean method9987() {
        return (Phase.method9999(this).method507() == Class526.field2611 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    @Class1
    public void method9988(Class65 b2) {
        block2: {
            block1: {
                int n2 = ((Class526)((Object)this.field2285.method507())).ordinal();
                if (n2 == 0) break block1;
                if (n2 == 1) {
                    Class5836.method22907(0.23915982f);
                    return;
                }
                break block2;
            }
            if (!Phase.field290.field_1724.method_5715() || !Phase.method10016(this)) break block2;
            float a2 = Phase.field290.field_1724.method_36454();
            Phase.field290.field_1724.method_5857(Phase.field290.field_1724.method_5829().method_989((double)((Float)this.field2293.method507()).floatValue() * Math.cos(Math.toRadians(a2 + Class5788.field11242)), 0.0, (double)((Float)this.field2293.method507()).floatValue() * Math.sin(Math.toRadians(a2 + Class6373.field13172))));
        }
    }

    private static void method9989() {
        Class4146.method20697();
    }

    private static int method9990(int n2, int n3, Class5541 class5541, Class5760 class5760) {
        return Class1348.method13864(n2, n3, class5541, class5760);
    }

    public static double method9991(class_238 class_2383) {
        return class_2383.field_1321;
    }

    public static class_746 method9992(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9993() {
        Class1745.method15538();
    }

    private static int method9994(int n2, int n3, AutoTrap class418, Class159 class159) {
        return Class1348.method13833(n2, n3, class418, class159);
    }

    private static void method9995() {
        Class1745.method15538();
    }

    private Boolean method9996() {
        return (this.field2285.method507() == Class526.field2611 && ((Boolean)this.field2287.method507()).booleanValue() ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private class_243 method9997() {
        int[] k2;
        class_2338 e2 = Phase.field290.field_1724.method_24515();
        class_243 f2 = Phase.field290.field_1724.method_19538();
        class_243 g2 = Phase.method10021(field290).method_24515().method_61082();
        float h2 = ((Float)this.field2274.method507()).floatValue();
        class_243 i2 = g2;
        double j2 = Double.MAX_VALUE;
        int[] nArray = new int[(int)field2278[9]];
        nArray[(int)Phase.field2278[6]] = (int)field2278[1];
        nArray[(int)Phase.field2278[1]] = (int)field2278[8];
        int[] nArray2 = k2 = nArray;
        int n2 = nArray2.length;
        for (int i3 = (int)field2278[6]; i3 < n2; ++i3) {
            int d2 = nArray2[i3];
            int[] nArray3 = k2;
            int n3 = nArray3.length;
            for (int i4 = (int)field2278[6]; i4 < n3; ++i4) {
                class_243 a2;
                double b2;
                int c2;
                block5: {
                    block4: {
                        c2 = nArray3[i4];
                        if (((Boolean)this.field2291.method507()).booleanValue()) break block4;
                        if (!Phase.field290.field_1687.method_22347(e2.method_10069(d2, (int)field2278[6], (int)field2278[6]))) break block5;
                        if (!Phase.field290.field_1687.method_22347(e2.method_10069((int)field2278[6], (int)field2278[6], c2))) break block5;
                        if (!Phase.field290.field_1687.method_22347(e2.method_10069(d2, (int)field2278[6], c2))) break block5;
                    }
                    if (!this.method10014(e2.method_10069(d2, (int)field2278[6], (int)field2278[6])) && !Phase.method10041(this, e2.method_10069((int)field2278[6], (int)field2278[6], c2)) && !this.method10014(e2.method_10069(d2, (int)field2278[6], c2))) continue;
                }
                if (!((b2 = (a2 = g2.method_1031((double)((float)d2 * h2), 0.0, (double)((float)c2 * h2))).method_1022(f2)) < j2)) continue;
                j2 = b2;
                i2 = a2;
            }
        }
        return i2;
    }

    private static void method9998() {
        Class6454.method24594();
    }

    public static Class248 method9999(Phase class445) {
        return class445.field2285;
    }

    private static int method10000(int n2, int n3, AntiLevitation class308, Class133 class133) {
        return Class1348.method13842(n2, n3, class308, class133);
    }

    private static int method10001(int n2, int n3, Class171 class171, Class700 class700) {
        return Class1348.method13826(n2, n3, class171, class700);
    }

    private static void method10002(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method10003(class_1297 class_12972, double d2, boolean bl2) {
        return Class1745.method15567(class_12972, d2, bl2);
    }

    private static void method10004() {
        Class1503.method14420();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10005(Class178 a2) {
        if (Phase.field290.field_1724 == null) {
            return;
        }
        int n2 = ((Class526)((Object)this.field2285.method507())).ordinal();
        if (n2 == 0) {
            if (Phase.method10073(a2) == class_259.method_1073()) {
                while (true) {
                    // Infinite loop
                }
            }
        } else {
            if (n2 == 1) {
                a2.method10();
                a2.method349(class_259.method_1073());
                Phase.method10072((class_310)Phase.field290).field_5960 = (int)field2278[1];
                return;
            }
            if (n2 != 2) {
                Class5836.method22907(0.4323154f);
                return;
            }
            if (Phase.field290.field_1724.field_5976) {
                a2.method10();
                a2.method349(class_259.method_1073());
            }
            if (!Phase.field290.field_1724.field_3913.field_3903) {
                if (!Phase.method10111(Phase.field290.field_1724.field_3913)) return;
                if (!((double)Phase.method9949(a2).method_10264() > Phase.method10050(field290).method_23318())) return;
            }
            a2.method10();
            return;
        }
        int n3 = 22650;
        block5: while (true) {
            switch (n3) {
                case 22651: {
                    n3 = 22649;
                    continue block5;
                }
                case 22650: {
                    if (!(a2.method345().method_1107().field_1325 > Phase.method10048(Phase.field290.field_1724.method_5829()))) {
                        return;
                    }
                    if (!Phase.field290.field_1724.method_5715()) return;
                    a2.method10();
                    a2.method349(class_259.method_1073());
                    return;
                }
            }
            break;
        }
    }

    private Boolean method10006() {
        return (Phase.method10085(this.field2285) == Phase.method10083() && (Boolean)Phase.method10034(this.field2287) != false && (Boolean)Phase.method10119(this).method507() != false ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static void method10007() {
        Class1745.method15538();
    }

    private static void method10008() {
        Class6009.method23561();
    }

    public static boolean method10009(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private static float method10010(Phase class445) {
        return class445.method10103();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method10011() {
        int n2 = Phase.method10075(this).method507() != Class526.field2611 ? 12700 : 12699;
        block4: while (true) {
            switch (n2) {
                case 12700: {
                    n2 = 12698;
                    continue block4;
                }
                case 12699: {
                    int n3 = (int)field2278[1];
                    Phase.method9995();
                    return null;
                }
            }
            break;
        }
        return (boolean)field2278[6];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10012(Class210 h2) {
        Class3812 f2;
        block20: {
            block19: {
                block18: {
                    if (this.field2285.method507() != Class526.field2611) {
                        Phase.method10069();
                        return;
                    }
                    f2 = new Class3812(class_1802.field_8634, (Class607)((Object)this.field2286.method507())).method18502();
                    if (!Phase.method10025(f2) || Phase.field290.field_1724.method_7357().method_7904(Phase.method10060())) break block18;
                    if (((Boolean)this.field2277.method507()).booleanValue()) break block19;
                    break block20;
                }
                this.method1268();
                return;
            }
            if (!Phase.field290.field_1724.method_24828() && !(Phase.method9971(field290).method_8320(Phase.field290.field_1724.method_24515()).method_26204() instanceof class_2399)) {
                return;
            }
        }
        if (Blink.method4987()) {
            return;
        }
        int n2 = 40310;
        while (true) {
            int n3;
            if ((n3 = n2) == 40309) {
                return;
            }
            if (n3 != 40310) break;
            n2 = 40308;
        }
        if (!((Boolean)this.field2287.method507()).booleanValue()) {
            Chams.method1924();
            return;
        }
        if (((Boolean)this.field2290.method507()).booleanValue()) {
            class_2338 a2 = Phase.method9952((class_1657)Phase.method9992(field290), (boolean)field2278[1]);
            class_2338 b2 = a2.method_10084();
            SpeedMine c2 = SpeedMine.method8407();
            if (Phase.field290.field_1687.method_8320(a2).method_26204() instanceof class_3736) {
                c2.method8517(a2, (Integer)this.field2281.method507());
                return;
            }
            if (Phase.field290.field_1687.method_8320(b2).method_26204() instanceof class_3736) {
                c2.method8517(b2, (Integer)Phase.method10032(this.field2281));
                return;
            }
        }
        for (class_1297 e2 : Phase.field290.field_1687.method_18112()) {
            if (e2 instanceof class_1511 && ((Boolean)Phase.method10098(Phase.method10064(this))).booleanValue()) {
                if (e2.method_23318() >= Phase.field290.field_1724.method_23318() || !e2.method_5829().method_994(Phase.field290.field_1724.method_5829())) continue;
                Class1745.method15567(e2, (Double)this.field2282.method507(), (Boolean)Phase.method10081(this.field2276));
                Chams.method1924();
                return;
            }
            if (((Boolean)this.field2275.method507()).booleanValue() && e2 instanceof class_1533) {
                class_1533 d2 = (class_1533)e2;
                if (!e2.method_5829().method_994(new class_238(Phase.field290.field_1724.method_24515()))) continue;
                if (!d2.method_6940().method_7960()) {
                    Phase.method9963(e2, (Double)this.field2282.method507(), (Boolean)this.field2276.method507());
                }
                Phase.method10003(e2, (Double)Phase.method10049(this.field2282), (Boolean)this.field2276.method507());
                continue;
            }
            if (!((Boolean)this.field2283.method507()).booleanValue() || !(e2 instanceof class_1534) || !e2.method_5829().method_994(new class_238(Phase.field290.field_1724.method_24515()))) continue;
            Class1745.method15567(e2, (Double)this.field2282.method507(), (Boolean)Phase.method9953(this).method507());
            return;
        }
        int g2 = Phase.method10013().method18969();
        f2.method18531(g2);
        Class1503.method14417(Phase.method10010(this), this.method10121());
        Class5723.field11048.method21353(this::method9965);
        Class1503.method14420();
        f2.method18534(g2);
        ((Class480)((Object)this.field2279.method507())).method10782(class_1268.field_5808);
        Phase.method9980().field2323.method12593();
        int n4 = (Boolean)Phase.method10031(this).method507() == false ? 4015 : 4016;
        block6: while (true) {
            switch (n4) {
                case 4016: {
                    n4 = 4014;
                    continue block6;
                }
                case 4015: {
                    this.method1268();
                    return;
                }
            }
            break;
        }
    }

    public static Class3850 method10013() {
        return Class5723.field11058;
    }

    private boolean method10014(class_2338 a2) {
        return (Class5595.method21932(a2) || Class5595.method21942(a2) ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static int method10015(int n2, int n3, Class3449 class3449, Class6402 class6402) {
        return Class1348.method13853(n2, n3, class3449, class6402);
    }

    private static boolean method10016(Phase class445) {
        return class445.method9945();
    }

    private static void method10017(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method10018(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method10019(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10020(float f2) {
        Class5836.method22907(f2);
    }

    public static class_746 method10021(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10022() {
        Class6009.method23560();
    }

    private static int method10023(int n2, int n3, Class538 class538, Class6408 class6408) {
        return Class1348.method13828(n2, n3, class538, class6408);
    }

    private static void method10024() {
        Class5659.method22184();
    }

    private static boolean method10025(Class3812 class3812) {
        return class3812.method18523();
    }

    private static void method10026() {
        Chams.method1924();
    }

    private static Class526 method10027() {
        return Phase.method9955();
    }

    public static Phase method10028() {
        return INSTANCE;
    }

    private static int method10029(int n2, int n3, Class1503 class1503, NoInteract class367) {
        return Class1348.method13775(n2, n3, class1503, class367);
    }

    private static void method10030(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Class248 method10031(Phase class445) {
        return Phase.method9983(class445);
    }

    private static Object method10032(Class248 class248) {
        return class248.method507();
    }

    private static Object method10033(Class248 class248) {
        return class248.method507();
    }

    private static Object method10034(Class248 class248) {
        return class248.method507();
    }

    public static Class526 method10035() {
        return Class526.field2611;
    }

    private static void method10036() {
        Class4146.method20694();
    }

    private static class_746 method10037(class_310 class_3102) {
        return Phase.method9946(class_3102);
    }

    private static void method10038(long l2) {
        Phase.field2278[1] = l2 ^ 0xE81F281997B86B79L;
        Phase.field2278[8] = l2 ^ 0x17E0D7E668479487L;
        Phase.field2278[6] = l2 ^ 0xE81F281997B86B78L;
        Phase.field2278[4] = l2 ^ 0xE81F281997B86890L;
        Phase.field2278[7] = l2 ^ 0xE81F281997B86B22L;
        Phase.field2278[2] = l2 ^ 0xE81F281997B86B7FL;
        Phase.field2278[9] = l2 ^ 0xE81F281997B86B7AL;
        Phase.field2278[0] = l2 ^ 0xE81F281997B86B3EL;
        Phase.field2278[5] = l2 ^ 0xE81F281997B86B72L;
        Phase.field2278[3] = l2 ^ 0xE81F281997B86B2DL;
    }

    private static void method10039(float f2) {
        Class5836.method22907(f2);
    }

    static {
        Phase.method10038(-1720612442247500936L);
    }

    public static class_746 method10040(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method10041(Phase class445, class_2338 class_23382) {
        return class445.method10014(class_23382);
    }

    private static void method10042(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method10043() {
        Class6454.method24594();
    }

    private Boolean method1278() {
        return (Phase.method9976(this).method507() == Class526.field2611 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static void method10044(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method10045() {
        Class5659.method22184();
    }

    private static float[] method10046(class_243 class_2432) {
        return Class1503.method14431(class_2432);
    }

    @Override
    public void method1274() {
        if (Phase.field290.field_1724 == null) {
            return;
        }
        if (((Boolean)this.field2280.method507()).booleanValue()) {
            double a2 = Math.cos(Math.toRadians(Phase.method10093(field290).method_36454() + 90.0f));
            double b2 = Math.sin(Math.toRadians(Phase.field290.field_1724.method_36454() + 90.0f));
            Phase.field290.field_1724.method_5814(Phase.field290.field_1724.method_23317() + (1.0 * (double)((Float)this.field2292.method507()).floatValue() * a2 + 0.0 * (double)((Float)this.field2292.method507()).floatValue() * b2), Phase.field290.field_1724.method_23318(), Phase.method10051(field290).method_23321() + (1.0 * (double)((Float)this.field2292.method507()).floatValue() * b2 - 0.0 * (double)((Float)this.field2292.method507()).floatValue() * a2));
        }
    }

    public Phase() {
        super("Phase", "Allows player to phase through solid blocks", Class556.field2755, (int)field2278[4]);
        this.field2277 = this.method450(new Class253("GroundOnly", "Only throw pearl while on ground", (boolean)field2278[6], this::method1269));
        this.field2284 = this.method450(new Class253("WaitConfirm", "Only toggle when server confirm", (boolean)field2278[6], this::method1278));
        this.field2294 = this.method450(new Class252("Pitch", "The pitch to throw pearls", (Number)((int)field2278[0]), (Number)((int)field2278[3]), (Number)((int)field2278[7]), this::method10011));
        this.field2295 = this.method450(new Class253("Correct", "Correct your throw angle", (boolean)field2278[1], this::method9979));
        this.field2288 = this.method450(new Class253("DynamicPitch", "Dynamically calc the pearl angel", (boolean)field2278[1], this::method9967));
        this.field2274 = this.method450(new Class252("Factor", "Anchor distance", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.3f), (Number)Float.valueOf(1.0f), this::method10120));
        this.field2291 = this.method450(new Class253("ResistantOnly", "Only phase to blast resistant block", (boolean)field2278[1], this::method9985));
        this.field2286 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Phase.method10084(), this::method10062));
        this.field2287 = this.method450(new Class253("Break", "Destroy obstacles in the way of the pearl phase", (boolean)field2278[1], this::method9987));
        this.field2290 = this.method450(new Class253("Scaffolding", "The obstacles to destroy", (boolean)field2278[1], this::method9996));
        this.field2281 = this.method450(new Class252("Priority", "Priority of mining", (Number)((int)field2278[6]), (Number)((int)field2278[2]), (Number)((int)field2278[5]), this::method10006));
        this.field2289 = this.method450(new Class253("Crystal", "The obstacles to destroy", (boolean)field2278[1], this::method9974));
        this.field2275 = this.method450(new Class253("ItemFrame", "The obstacles to destroy", (boolean)field2278[1], this::method9977));
        this.field2283 = this.method450(new Class253("Painting", "The obstacles to destroy", (boolean)field2278[1], this::method10117));
        this.field2276 = this.method450(new Class253("Rotate", "Rotate to obstacles", (boolean)field2278[1], this::method10096));
        this.field2282 = this.method450(new Class252("BreakRange", "The distance of your reach", (Number)0.0, (Number)3.0, (Number)6.0, this::method9972));
        this.field2279 = this.method450(new Class260("Swing", "Swing side for throw pearl", Class480.field2509, Class480.values(), this::method9958));
        this.field2292 = this.method450(new Class252("Blocks", "The blocks distance to phase clip", (Number)Float.valueOf(0.001f), (Number)Float.valueOf(0.003f), (Number)Float.valueOf(10.0f), this::method10112));
        this.field2293 = this.method450(new Class252("Distance", "The distance to phase", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(Class3282.field7054), (Number)Float.valueOf(10.0f), this::method10095));
        this.field2280 = this.method450(new Class253("AutoClip", "Automatically clips into the block", (boolean)field2278[1], this::method10099));
        INSTANCE = this;
    }

    @Class1
    public void method10047(Class63 a2) {
        if (a2.method128() != Class543.field2690 || this.field2285.method507() != Class526.field2609 || !Phase.field290.field_1724.method_24828() || Phase.field290.field_1724.method_3144()) {
            return;
        }
        class_243 b2 = Phase.method10037(field290).method_24515().method_46558();
        int c2 = b2.field_1352 - Phase.field290.field_1724.method_23317() > 0.0 ? (int)field2278[1] : (int)field2278[6];
        int d2 = b2.field_1350 - Phase.method9984(field290).method_23321() > 0.0 ? (int)field2278[1] : (int)field2278[6];
        double e2 = Phase.method9968(b2) + 0.20000000009497754 * (double)(c2 != 0 ? (int)field2278[8] : (int)field2278[1]);
        double f2 = b2.field_1350 + Class3355.field7272 * (double)(d2 != 0 ? (int)field2278[8] : (int)field2278[1]);
        Phase.field290.field_1724.method_5814(e2, Phase.field290.field_1724.method_23318(), f2);
        this.method1268();
    }

    private static double method10048(class_238 class_2383) {
        return Phase.method9973(class_2383);
    }

    private Boolean method1269() {
        return (this.field2285.method507() == Class526.field2611 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static Object method10049(Class248 class248) {
        return class248.method507();
    }

    private static class_746 method10050(class_310 class_3102) {
        return Phase.method10040(class_3102);
    }

    public static class_746 method10051(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10052() {
        Class6009.method23561();
    }

    private static void method10053(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method10054() {
        Class5659.method22184();
    }

    private static void method10055() {
        Class1807.method15744();
    }

    private static int method10056(int n2, int n3, Class3815 class3815, AutoTunnel class284) {
        return Class1348.method13779(n2, n3, class3815, class284);
    }

    private static void method10057() {
        Class5836.method22890();
    }

    private static int method10058(int n2, int n3, Class477 class477, MainHand class404) {
        return Class1348.method13787(n2, n3, class477, class404);
    }

    private static void method10059(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_1792 method10060() {
        return class_1802.field_8634;
    }

    private static void method10061() {
        Class5836.method22890();
    }

    private Boolean method10062() {
        if (this.field2285.method507() == Class526.field2611) {
            int n2 = (int)field2278[1];
            Class4146.method20694();
            return null;
        }
        return (boolean)field2278[6];
    }

    private static void method10063(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Class248 method10064(Phase class445) {
        return Phase.method10109(class445);
    }

    private static void method10065() {
        Class4146.method20697();
    }

    public static Class526 method10066() {
        return Class526.field2609;
    }

    private static void method10067(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method10068(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method10069() {
        Class5836.method22890();
    }

    private static Object method10070(Class248 class248) {
        return class248.method507();
    }

    private static float[] method10071(class_243 class_2432) {
        return Class1503.method14431(class_2432);
    }

    public static class_746 method10072(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_265 method10073(Class178 class178) {
        return class178.method345();
    }

    public static class_746 method10074(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)Phase.method10033(this.field2285));
    }

    public static Class248 method10075(Phase class445) {
        return class445.field2285;
    }

    private static void method10076(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method10077() {
        Class4146.method20697();
    }

    public static Class526 method10078() {
        return Class526.field2611;
    }

    private static void method10079(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method10080() {
        Chams.method1924();
    }

    private static Object method10081(Class248 class248) {
        return class248.method507();
    }

    private static void method10082() {
        Class1807.method15744();
    }

    public static Class526 method10083() {
        return Class526.field2611;
    }

    private static Class607[] method10084() {
        return Class607.values();
    }

    private static Object method10085(Class248 class248) {
        return class248.method507();
    }

    private static void method10086() {
        Class5836.method22885();
    }

    private static void method10087() {
        Class5836.method22890();
    }

    private static Object method10088(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method10089(Phase class445) {
        return class445.field2285;
    }

    private static void method10090() {
        Class4146.method20697();
    }

    private static void method10091() {
        Class5659.method22184();
    }

    private static double method10092(class_238 class_2383) {
        return Phase.method9991(class_2383);
    }

    public static class_746 method10093(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method10094(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method10095() {
        return (this.field2285.method507() != Class526.field2611 && Phase.method9970(this.field2285) != Class526.field2609 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method10096() {
        int n2;
        if (this.field2285.method507() == Phase.method10027()) {
            int n3 = (Boolean)Phase.method10088(this.field2287) != false ? 10435 : 10436;
            block4: while (true) {
                switch (n3) {
                    case 10436: {
                        n3 = 10434;
                        continue block4;
                    }
                    case 10435: {
                        n2 = (int)field2278[1];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field2278[6];
        return n2 != 0;
    }

    private static void method10097() {
        Chams.method1924();
    }

    private static Object method10098(Class248 class248) {
        return class248.method507();
    }

    private Boolean method10099() {
        if (this.field2285.method507() != Class526.field2611) {
            if (this.field2285.method507() != Phase.method10066()) {
                int n2 = (int)field2278[1];
                Class1668.method15147(-766373759, -1000213306, 1488917994, 1364843299);
                return null;
            }
        }
        return (boolean)field2278[6];
    }

    private static int method10100(int n2, int n3, Class6132 class6132, Class3209 class3209) {
        return Class1348.method13829(n2, n3, class6132, class3209);
    }

    private static void method10101() {
        Class1807.method15744();
    }

    public static Class248 method10102(Phase class445) {
        return class445.field2295;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float method10103() {
        int n2 = (Boolean)Phase.method9956(this.field2295) != false ? 35432 : 35433;
        block4: while (true) {
            switch (n2) {
                case 35433: {
                    n2 = 35431;
                    continue block4;
                }
                case 35432: {
                    class_243 a2;
                    if (((Boolean)this.field2288.method507()).booleanValue() && (a2 = this.method9997()) != null) {
                        return Class1503.method14431(a2)[(int)field2278[6]];
                    }
                    return class_3532.method_15393((float)(Phase.method10046(Phase.field290.field_1724.method_24515().method_46558())[(int)field2278[6]] - Class5858.field11560));
                }
            }
            break;
        }
        return Phase.method10094(field290).method_36454();
    }

    private static int method10104(int n2, int n3, NameProtect class288, Class2300 class2300) {
        return Class1348.method13834(n2, n3, class288, class2300);
    }

    public static Class248 method10105(Phase class445) {
        return class445.field2285;
    }

    private static void method10106() {
        Class4146.method20697();
    }

    private static void method10107(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static double method10108(class_238 class_2383) {
        return class_2383.field_1320;
    }

    public static Class248 method10109(Phase class445) {
        return class445.field2289;
    }

    private static void method10110(float f2) {
        Class5836.method22907(f2);
    }

    public static boolean method10111(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private Boolean method10112() {
        return (this.field2285.method507() != Class526.field2611 && Phase.method9978(this.field2285) != Class526.field2609 ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static class_746 method10113(class_310 class_3102) {
        return Phase.method10115(class_3102);
    }

    private static void method10114(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_746 method10115(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10116() {
        Class1503.method14420();
    }

    private Boolean method10117() {
        return (this.field2285.method507() == Class526.field2611 && (Boolean)Phase.method9961(this.field2287) != false ? (int)field2278[1] : (int)field2278[6]) != 0;
    }

    private static void method10118() {
        Class4146.method20694();
    }

    public static Class248 method10119(Phase class445) {
        return class445.field2290;
    }

    /*
     * Unable to fully structure code
     */
    private Boolean method10120() {
        block9: {
            block7: {
                block8: {
                    if (Phase.method9951(Phase.method10089(this)) != Phase.method10035()) break block8;
                    v0 = 16617;
                    ** GOTO lbl9
                }
                v0 = 16618;
                if (true) ** GOTO lbl9
                do {
                    v0 = var1_1 = 16616;
lbl9:
                    // 3 sources

                    if (var1_1 == 16617) break block7;
                } while (var1_1 == 16618);
                ** GOTO lbl-1000
            }
            if (!((Boolean)this.field2295.method507()).booleanValue()) break block9;
            v1 = 45892;
            ** GOTO lbl21
        }
        v1 = 45893;
        if (true) ** GOTO lbl21
        block5: while (true) {
            v1 = 45891;
lbl21:
            // 3 sources

            switch (v1) {
                case 45893: {
                    continue block5;
                }
                case 45892: {
                    if (((Boolean)this.field2288.method507()).booleanValue()) {
                        v2 = (int)Phase.field2278[1];
                        break block5;
                    }
                }
                default: lbl-1000:
                // 2 sources

                {
                    v2 = (int)Phase.field2278[6];
                }
            }
            break;
        }
        return (boolean)v2;
    }

    private float method10121() {
        class_243 a2;
        if (((Boolean)this.field2295.method507()).booleanValue() && ((Boolean)this.field2288.method507()).booleanValue() && (a2 = this.method9997()) != null) {
            return Phase.method10071(a2)[(int)field2278[1]];
        }
        return ((Integer)this.field2294.method507()).intValue();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

