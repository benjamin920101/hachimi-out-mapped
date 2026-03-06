/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.Iterator;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class131;
import mapped.Class132;
import mapped.Class1336;
import mapped.Class1387;
import mapped.Class1503;
import mapped.Class1533;
import mapped.Class1576;
import mapped.Class1650;
import mapped.Class1668;
import mapped.Class1696;
import mapped.Class1745;
import mapped.Class175;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class219;
import mapped.Class248;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.NoRotate;
import mapped.Chams;
import mapped.Class3248;
import mapped.AutoRespawn;
import mapped.Class3695;
import mapped.Blink;
import mapped.Class3833;
import mapped.Class3834;
import mapped.Class3976;
import mapped.Class3979;
import mapped.Class4108;
import mapped.Class411;
import mapped.Class4146;
import mapped.Class4165;
import mapped.AutoTrap;
import mapped.AutoCrystal;
import mapped.Class4196;
import mapped.HoleFill;
import mapped.AutoCrawlTrap;
import mapped.AutoXP;
import mapped.Velocity;
import mapped.Class5449;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class56;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class606;
import mapped.Class621;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class760;
import mapped.Class807;
import mapped.Class829;
import mapped.Class925;
import mapped.Class926;
import mapped.Class929;
import net.hachimi.client.mixin.bH;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Criticals
extends Class278 {
    private boolean field629;
    Class248 field630;
    private boolean field631;
    Class248 field632;
    Class248 field633;
    private final Class248 field634;
    private boolean field635;
    private final Class248 field636;
    Class248 field637;
    Class248 field638;
    private final Class925 field639 = new Class926();
    private static final int[] field640;
    private final Class248 field641;
    private static long[] field642;
    Class248 field643;
    private static final double field644 = 2.0E-4;
    Class248 field645;
    private static final double[] field646;
    private final Class248 field647;
    private final Class248 field648;
    private final Class248 field649;
    private final Class248 field650;
    private static Criticals INSTANCE;
    private final Class248 field651;
    private final Class248 field652;
    Class248 field653 = this.method450(new Class253("Multitask", "Allows crits when other combat modules are enabled", (boolean)field642[0]));
    private final Class248 field654;

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)Criticals.method2350(this).method507());
    }

    private Boolean method2222() {
        return (Criticals.method2323(this).method507() == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static void method2223(long l2) {
        Criticals.field642[0] = l2 ^ 0x6D86A4AA95283451L;
        Criticals.field642[4] = l2 ^ 0x6D86A4AA95283472L;
        Criticals.field642[7] = l2 ^ 0x6D86A4AA95283452L;
        Criticals.field642[1] = l2 ^ 0x6D86A4AA95283450L;
        Criticals.field642[2] = l2 ^ 0x6D86A4AA95283455L;
        Criticals.field642[6] = l2 ^ 0x6D86A4AA952834AAL;
        Criticals.field642[9] = l2 ^ 0x92795B556AD7CBAFL;
        Criticals.field642[3] = l2 ^ 0x6D86A4AA952835A4L;
        Criticals.field642[8] = l2 ^ 0x6D86A4AA95283453L;
        Criticals.field642[5] = l2 ^ 0x6D86A4AA9528347BL;
    }

    public boolean method2224() {
        for (class_2338 a2 : Class5449.method21095(Criticals.field290.field_1724.method_5829())) {
            if (!Criticals.field290.field_1687.method_8320(a2).method_51366()) continue;
            return (int)field642[0] != 0;
        }
        return (int)field642[1] != 0;
    }

    public static Class248 method2225(Criticals class307) {
        return class307.field632;
    }

    private static void method2226() {
        Class5836.method22890();
    }

    private static Object method2227(Class248 class248) {
        return class248.method507();
    }

    private Boolean method2228() {
        return (this.field632.method507() == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static int method2229(int n2, int n3, Class3976 class3976, NoRotate class286) {
        return Class4108.method20442(n2, n3, class3976, class286);
    }

    private static void method2230() {
        Class6009.method23561();
    }

    @Override
    protected void method1274() {
        this.field631 = (int)field642[0];
    }

    private static void method2231(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object method2232(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2233(Class210 c) {
        block8: {
            block16: {
                block14: {
                    block15: {
                        block13: {
                            block12: {
                                block11: {
                                    block10: {
                                        block9: {
                                            if (this.field632.method507() != Class621.field3035) break block8;
                                            if (!((Boolean)Criticals.method2279(this).method507()).booleanValue() || !Criticals.field290.field_1724.method_20448()) break block9;
                                            this.method1273();
                                            break block8;
                                        }
                                        if (!((Boolean)this.field649.method507()).booleanValue() || Criticals.field290.field_1724.field_3913.field_3905 == 0.0f && Criticals.method2345((class_310)Criticals.field290).field_3913.field_3907 == 0.0f) break block10;
                                        this.method1273();
                                        break block8;
                                    }
                                    if (!((Boolean)this.field652.method507()).booleanValue() || !Blink.method4986().method1265()) break block11;
                                    this.method1273();
                                    break block8;
                                }
                                if (!Class5659.method22193(0.0)) break block12;
                                if (((Boolean)this.field636.method507()).booleanValue()) {
                                    this.method1273();
                                }
                                break block8;
                            }
                            if (!((Boolean)this.field641.method507()).booleanValue() || !(Criticals.field290.field_1724.field_6017 > 0.0f)) break block13;
                            Criticals.field290.field_1724.method_18800(0.0, 0.0, 0.0);
                            this.field631 = (int)Criticals.field642[1];
                            break block8;
                        }
                        if (!((Boolean)Criticals.method2381(this.field647)).booleanValue()) break block8;
                        v0 = b = (Boolean)this.field651.method507() != false && ((Boolean)Criticals.method2232(Criticals.method2378(this)) == false || this.method2272() != null) ? (int)Criticals.field642[0] : (int)Criticals.field642[1];
                        if (b != 0) break block14;
                        if (!((Boolean)Criticals.method2257(this.field648)).booleanValue()) break block15;
                        if (!this.method2309()) break block8;
                    }
                    Criticals.field290.field_1724.method_6043();
                    this.field631 = (int)Criticals.field642[1];
                    break block8;
                }
                if (!Criticals.field290.field_1724.method_24828()) break block8;
                if (!((Boolean)this.field647.method507()).booleanValue()) break block8;
                if (((Boolean)this.field641.method507()).booleanValue()) ** GOTO lbl-1000
                if (!Criticals.method2307(this)) break block16;
                v1 = 55757;
                ** GOTO lbl46
            }
            v1 = 55758;
            if (true) ** GOTO lbl46
            block4: while (true) {
                v1 = 55756;
lbl46:
                // 3 sources

                switch (v1) {
                    case 55758: {
                        continue block4;
                    }
                    case 55757: lbl-1000:
                    // 2 sources

                    {
                        a = Criticals.field290.field_1724.method_18798();
                        if (!(a.field_1351 < 0.05)) break block4;
                        Criticals.field290.field_1724.method_18800(Criticals.method2316(a), 0.05, a.field_1350);
                        this.field631 = (int)Criticals.field642[1];
                    }
                }
                break;
            }
        }
    }

    private static void method2234() {
        Class5836.method22897();
    }

    private static void method2235() {
        Class3979.method19561();
    }

    private static void method2236() {
        Chams.method1924();
    }

    private static void method2237() {
        Class1807.method15744();
    }

    private static int method2238(int n2, int n3, Class219 class219, Blink class376) {
        return Class4108.method20525(n2, n3, class219, class376);
    }

    private static void method2239() {
        Class1503.method14420();
    }

    private static void method2240() {
        Class5836.method22890();
    }

    private static void method2241() {
        Class6009.method23560();
    }

    private static void method2242() {
        Class4146.method20697();
    }

    private static void method2243() {
        Class1807.method15744();
    }

    static {
        field642 = new long[10];
        Criticals.method2223(7892176449567208528L);
        double[] dArray = new double[(int)field642[7]];
        dArray[(int)Criticals.field642[1]] = 0.3;
        dArray[(int)Criticals.field642[0]] = Class1576.field5889;
        field646 = dArray;
        int[] nArray = new int[(int)field642[8]];
        nArray[(int)Criticals.field642[1]] = (int)field642[0];
        nArray[(int)Criticals.field642[0]] = (int)field642[1];
        nArray[(int)Criticals.field642[7]] = (int)field642[9];
        field640 = nArray;
    }

    public static class_638 method2244(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static void method2245(Criticals class307, boolean bl2) {
        class307.field629 = bl2;
    }

    private static Object method2246(Class248 class248) {
        return class248.method507();
    }

    private static void method2247(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method2248(Criticals class307) {
        return class307.field638;
    }

    private static void method2249() {
        Class5659.method22184();
    }

    private Boolean method1269() {
        return (Criticals.method2359(Criticals.method2264(this)) == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static void method2250(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method2251(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2252() {
        Class5836.method22890();
    }

    private static void method2253() {
        Class5836.method22890();
    }

    private static void method2254() {
        Class5836.method22897();
    }

    private static void method2255() {
        Class1745.method15538();
    }

    private static void method2256() {
        Class5836.method22885();
    }

    private static Object method2257(Class248 class248) {
        return class248.method507();
    }

    private Boolean method2258() {
        return (this.field632.method507() == Class621.field3034 || this.field632.method507() == Class621.field3029 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    public static Class5496 method2259() {
        return Class5723.field11048;
    }

    public static Criticals method2260() {
        return INSTANCE;
    }

    private static void method2261() {
        Class6009.method23561();
    }

    private static void method2262() {
        Class6009.method23561();
    }

    public static class_746 method2263(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method2264(Criticals class307) {
        return class307.field632;
    }

    public static class_746 method2265(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2266() {
        Class5659.method22184();
    }

    public static class_744 method2267(class_746 class_7462) {
        return class_7462.field_3913;
    }

    public static Class925 method2268(Criticals class307) {
        return class307.field639;
    }

    private static Object method2269(Class248 class248) {
        return class248.method507();
    }

    private static int method2270(int n2, int n3, Class807 class807, Class926 class926) {
        return Class4108.method20460(n2, n3, class807, class926);
    }

    private static Object method2271(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     */
    public class_2338 method2272() {
        block9: {
            h = Criticals.method2332(Criticals.field290).method_5829().method_1014(Class4165.field9699);
            var4_4 = (int)Criticals.field642[1];
            var2_2 = Criticals.field646;
            var3_3 = var2_2.length;
            if (var4_4 >= var3_3) break block9;
            g = var2_2[var4_4];
            var7_6 = Criticals.field646;
            var8_7 = var7_6.length;
            for (var9_8 = (int)Criticals.field642[1]; var9_8 < var8_7; ++var9_8) {
                f = var7_6[var9_8];
                e = new class_2338.class_2339(Criticals.method2356(Criticals.field290).method_23317() + g, Criticals.field290.field_1724.method_23318(), Criticals.field290.field_1724.method_23321() + f);
                for (d = (int)Criticals.field642[0]; d <= (int)Criticals.field642[7]; ++d) {
                    var14_12 = Criticals.field640;
                    var15_13 = var14_12.length;
                    for (var16_14 = (int)Criticals.field642[1]; var16_14 < var15_13; ++var16_14) {
                        c = var14_12[var16_14];
                        var18_16 = Criticals.field640;
                        var19_17 = var18_16.length;
                        block7: for (var20_18 = (int)Criticals.field642[1]; var20_18 < var19_17; ++var20_18) {
                            block10: {
                                b = var18_16[var20_18];
                                a = e.method_10069(c, (int)Criticals.field642[1], b).method_10086(d);
                                if (Criticals.field290.field_1687.method_22347(a)) continue;
                                if (!new class_238(a).method_994(h)) break block10;
                                v0 = 47756;
                                ** GOTO lbl31
                            }
                            v0 = 47757;
                            if (true) ** GOTO lbl31
                            block8: while (true) {
                                v0 = 47755;
lbl31:
                                // 3 sources

                                switch (v0) {
                                    case 47757: {
                                        continue block8;
                                    }
                                    case 47756: {
                                        if (!Criticals.field290.field_1687.method_8320(a).method_26234((class_1922)Criticals.field290.field_1687, a)) continue block7;
                                        return a;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
            ++var4_4;
            Class6454.method24636(Class1336.field5170, Class3834.field8693, Class929.field3927, 0.11403636577519294);
            return null;
        }
        return null;
    }

    public static Class5496 method2273() {
        return Class5723.field11048;
    }

    private static void method2274() {
        Class4146.method20694();
    }

    private static void method2275() {
        Class4146.method20697();
    }

    private static void method2276() {
        Class5836.method22890();
    }

    public static Class248 method2277(Criticals class307) {
        return class307.field632;
    }

    public static class_638 method2278(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class248 method2279(Criticals class307) {
        return class307.field634;
    }

    private static int method2280(int n2, int n3, Class175 class175, Class1533 class1533) {
        return Class4108.method20530(n2, n3, class175, class1533);
    }

    private static void method2281() {
        Class1745.method15538();
    }

    public static Class1387 method2282() {
        return Class5723.field11052;
    }

    public static Class248 method2283(Criticals class307) {
        return class307.field645;
    }

    private static void method2284(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2285() {
        Class6454.method24594();
    }

    private Boolean method2286() {
        return (this.field632.method507() == Class621.field3035 && (Boolean)this.field651.method507() != false ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static void method2287() {
        Class4146.method20697();
    }

    public static class_746 method2288(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method2289(Class248 class248) {
        return class248.method507();
    }

    private static void method2290(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Unable to fully structure code
     */
    public void method2291(class_1297 d) {
        e = Class5723.field11053.method12401();
        f = Class5723.field11053.method12402();
        g = Criticals.method2347().method12406();
        switch (((Class621)this.field632.method507()).ordinal()) {
            case 3: {
                if (!Criticals.method2321(Criticals.field290).method_24828() || Criticals.method2369((class_746)Criticals.field290.field_1724).field_3904) break;
                a = 1.0E-7 + 1.0E-7 * (1.0 + (double)Criticals.field289.nextInt(Criticals.field289.nextBoolean() != false ? (int)Criticals.field642[4] : (int)Criticals.field642[5]));
                Criticals.method2368().method21341((class_2596)new class_2828.class_2829(e, f + 0.10159999877214432 + a * Class3695.field8303, g, (boolean)Criticals.field642[1]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 0.02019999921321869 + a * 2.0, g, (boolean)Criticals.field642[1]));
                Criticals.method2250(Class5723.field11048, (class_2596)new class_2828.class_2829(e, f + 3.239E-4 + a, g, (boolean)Criticals.field642[1]));
                Criticals.method2317(Criticals.field290).method_7277(d);
                break;
            }
            case 0: {
                if (!Criticals.method2374(Criticals.field290).method_24828() || Criticals.method2267((class_746)Criticals.field290.field_1724).field_3904) break;
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 0.0625, g, (boolean)Criticals.field642[1]));
                Criticals.method2344(Criticals.method2259(), (class_2596)new class_2828.class_2829(e, f, g, (boolean)Criticals.field642[1]));
                Criticals.field290.field_1724.method_7277(d);
                break;
            }
            case 1: {
                if (!this.field639.method12595((int)Criticals.field642[3]) || !Criticals.method2293(Criticals.field290).method_24828() || Criticals.field290.field_1724.field_3913.field_3904) break;
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 1.1000000199601345E-7, g, (boolean)Criticals.field642[1]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 9.99999993922529E-9, g, (boolean)Criticals.field642[1]));
                Criticals.method2354(this, (boolean)Criticals.field642[0]);
                this.field639.method12593();
                break;
            }
            case 4: {
                if (!((Boolean)Criticals.method2289(this.field645)).booleanValue()) ** GOTO lbl43
                if (!((Boolean)this.field633.method507()).booleanValue()) ** GOTO lbl31
                if (this.method2366()) ** GOTO lbl43
                ** GOTO lbl-1000
lbl31:
                // 1 sources

                if (this.method2224()) ** GOTO lbl34
                v0 = 51237;
                ** GOTO lbl38
lbl34:
                // 1 sources

                v0 = 51238;
                if (true) ** GOTO lbl38
                block12: while (true) {
                    v0 = 51236;
lbl38:
                    // 3 sources

                    switch (v0) {
                        case 51238: {
                            continue block12;
                        }
                        case 51237: lbl-1000:
                        // 2 sources

                        {
                            return;
                        }
                    }
                    break;
                }
lbl43:
                // 3 sources

                if (((Boolean)this.field643.method507()).booleanValue() && Criticals.method2362()) {
                    return;
                }
                if (((Boolean)this.field637.method507()).booleanValue() && Criticals.field290.field_1724.method_20448()) {
                    return;
                }
                if (!this.field639.method12595((int)Criticals.field642[6]) || !Criticals.field290.field_1724.method_24828()) break;
                b = Class5723.field11049.method12027();
                c = Criticals.method2335(Class5723.field11049);
                Class5723.field11048.method21341((class_2596)new class_2828.class_2830(e, f + 0.0625, g, b, c, (boolean)Criticals.field642[1]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2830(e, f + 0.0625013579, g, b, c, (boolean)Criticals.field642[1]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2830(e, f + Class1696.field6280, g, b, c, (boolean)Criticals.field642[1]));
                Criticals.method2268(this).method12593();
                break;
            }
            case 5: {
                if (((Boolean)Criticals.method2303(Criticals.method2283(this))).booleanValue() && ((Boolean)this.field633.method507() != false ? this.method2366() == false : this.method2224() == false)) {
                    return;
                }
                if (((Boolean)this.field643.method507()).booleanValue() && Class1807.method15753()) {
                    return;
                }
                if (((Boolean)this.field637.method507()).booleanValue() && Criticals.field290.field_1724.method_20448()) {
                    return;
                }
                if (!Criticals.field290.field_1724.method_24828()) {
                    Criticals.method2314();
                    return;
                }
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f, g, (boolean)Criticals.field642[0]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 0.0625, g, (boolean)Criticals.field642[1]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(e, f + 0.04535000026226044, g, (boolean)Criticals.field642[1]));
                break;
            }
            case 6: {
                Criticals.method2312().method14002(0.3425);
            }
        }
    }

    private static int method2292(int n2, int n3, Class56 class56, Class3248 class3248) {
        return Class4108.method20494(n2, n3, class56, class3248);
    }

    public static class_746 method2293(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2294() {
        Class6009.method23560();
    }

    private static void method2295() {
        Class6454.method24594();
    }

    private static void method2296() {
        Class1745.method15538();
    }

    public static Class621 method2297() {
        return Class621.field3029;
    }

    private static void method2298() {
        Class6454.method24594();
    }

    private Boolean method2299() {
        return (this.field632.method507() == Class621.field3034 || Criticals.method2227(this.field632) == Class621.field3029 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private Boolean method2300() {
        return (this.field632.method507() == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static void method2301(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method2302() {
        Class5659.method22184();
    }

    private static Object method2303(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method2304() {
        int n2;
        int n3 = Criticals.method2311(this.field632) == Class621.field3035 ? 5545 : 5546;
        block4: while (true) {
            switch (n3) {
                case 5546: {
                    n3 = 5544;
                    continue block4;
                }
                case 5545: {
                    n2 = (int)field642[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field642[1];
        return n2 != 0;
    }

    private static void method2305() {
        Class6009.method23561();
    }

    private static Class5496 method2306() {
        return Criticals.method2383();
    }

    private static boolean method2307(Criticals class307) {
        return Criticals.method2358(class307);
    }

    private static HoleFill method2308() {
        return HoleFill.method8657();
    }

    private boolean method2309() {
        class_243 a2 = Criticals.field290.field_1724.method_33571();
        return Velocity.method10292((class_1297)Criticals.field290.field_1724, new class_238(a2.field_1352 - 0.3, a2.field_1351 + 0.5, a2.field_1350 - 0.3, a2.field_1352 + 0.3, a2.field_1351 + 1.0, a2.field_1350 + 0.3));
    }

    public Criticals() {
        super("Criticals", "Modifies attacks to always land critical hits", Class556.field2758);
        this.field632 = this.method450(new Class260("Mode", "Mode for critical attack modifier", Class621.field3036, Class621.values()));
        this.field649 = this.method450(new Class253("MovingDisable", "Automatically disables when you are moving", (boolean)field642[0], this::method1269));
        this.field634 = this.method450(new Class253("CrawlingDisable", "Automatically disables when you are crawling", (boolean)field642[0], this::method1278));
        this.field652 = this.method450(new Class253("BlinkingDisable", "Automatically disables when you are blinking", (boolean)field642[0], this::method2327));
        this.field636 = this.method450(new Class253("WebDisable", "Automatically disables when you in web", (boolean)field642[0], this::method2304));
        this.field647 = this.method450(new Class253("AutoJump", "Automatically jump once when enabled", (boolean)field642[0], this::method2310));
        this.field648 = this.method450(new Class253("OnlyTrapped", "Only jump when you are trapped (to prevent jumping out of the block)", (boolean)field642[0], this::method2337));
        this.field651 = this.method450(new Class253("LowJump", "Use mini jumps (to prevent you from jumping out of blocks)", (boolean)field642[0], this::method2228));
        this.field650 = this.method450(new Class253("1.21+", "Applicable minijump bypass 1.21+ grim server", (boolean)field642[1], this::method2286));
        this.field641 = this.method450(new Class253("Static", "Keep you static in the air", (boolean)field642[0], this::method2300));
        this.field654 = this.method450(new Class253("GroundSpoof", "Set all move packet on ground to false", (boolean)field642[1], this::method2222));
        this.field630 = this.method450(new Class253("BoatKiller", "Crit boat", (boolean)field642[0]));
        this.field638 = this.method450(new Class253("StopSprint", "Stop sprinting (Sprinting cant crit)", (boolean)field642[1]));
        this.field645 = this.method450(new Class253("PhasedOnly", "Only attempts criticals when phased", (boolean)field642[1], this::method2258));
        this.field633 = this.method450(new Class253("WallsOnly", "Only attempts criticals in walls", (boolean)field642[1], this::method2322));
        this.field643 = this.method450(new Class253("MoveFix", "Pauses crits when moving", (boolean)field642[1], this::method2299));
        this.field637 = this.method450(new Class253("CrawlPause", "Only attempts criticals when standing", (boolean)field642[1], this::method2363));
        INSTANCE = this;
    }

    private Boolean method2310() {
        return (this.field632.method507() == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static Object method2311(Class248 class248) {
        return class248.method507();
    }

    private static Class1387 method2312() {
        return Criticals.method2282();
    }

    private static void method2313() {
        Class5836.method22890();
    }

    private static void method2314() {
        Class5836.method22885();
    }

    private static void method2315(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static double method2316(class_243 class_2432) {
        return Criticals.method2338(class_2432);
    }

    @Override
    public void method1279() {
        this.field635 = (int)field642[1];
        this.field629 = (int)field642[1];
    }

    public static class_746 method2317(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2318(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2319(Criticals class307, class_1297 class_12972) {
        class307.method2291(class_12972);
    }

    private static void method2320() {
        Class6009.method23561();
    }

    public static class_746 method2321(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method2322() {
        if (Criticals.method2269(this.field632) != Class621.field3034) {
            Class6454.method24636(0.9731650084645281, 0.5812903292120928, Class1650.field6131, 0.565630677847185);
            return null;
        }
        return ((Boolean)this.field645.method507() != false ? (int)field642[0] : (int)field642[1]) != 0;
    }

    public static Class248 method2323(Criticals class307) {
        return class307.field632;
    }

    private static void method2324() {
        Class1503.method14420();
    }

    private static void method2325() {
        Class1503.method14420();
    }

    private static void method2326() {
        Class5836.method22885();
    }

    private Boolean method2327() {
        return (this.field632.method507() == Criticals.method2367() ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static Class248 method2328(Criticals class307) {
        return Criticals.method2277(class307);
    }

    private static void method2329() {
        Class4146.method20694();
    }

    private static void method2330(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public boolean method2331() {
        return (Criticals.method2365(Criticals.method2328(this)) == Class621.field3029 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static class_746 method2332(class_310 class_3102) {
        return Criticals.method2288(class_3102);
    }

    private static void method2333(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2334(float f2) {
        Class5836.method22907(f2);
    }

    private static float method2335(Class760 class760) {
        return class760.method12021();
    }

    private static Object method2336(Class248 class248) {
        return class248.method507();
    }

    private Boolean method2337() {
        if (Criticals.method2246(this.field632) == Class621.field3035) {
            int n2 = (int)field642[0];
            Class6009.method23561();
            return null;
        }
        return (boolean)field642[1];
    }

    public static double method2338(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method2339(Class5496 class5496, class_2596 class_25962) {
        class5496.method21342(class_25962);
    }

    private static void method2340(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class829 method2341() {
        return Class5723.field11053;
    }

    private Boolean method1278() {
        return (this.field632.method507() == Class621.field3035 ? (int)field642[0] : (int)field642[1]) != 0;
    }

    private static boolean method2342() {
        return Class3979.method19543();
    }

    private static void method2343() {
        Class5659.method22184();
    }

    private static void method2344(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static class_746 method2345(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method2346() {
        return Velocity.method10322();
    }

    public static Class829 method2347() {
        return Class5723.field11053;
    }

    private static void method2348() {
        Class1503.method14420();
    }

    public static class_6880 method2349() {
        return class_1294.field_5919;
    }

    public static Class248 method2350(Criticals class307) {
        return class307.field632;
    }

    private static boolean method2351(HoleFill class429) {
        return class429.method8672();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2352(Class131 e) {
        block40: {
            block34: {
                block29: {
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    block32: {
                                        block33: {
                                            block28: {
                                                block31: {
                                                    block30: {
                                                        if (Criticals.field290.field_1724 == null) ** GOTO lbl-1000
                                                        if (Criticals.method2278(Criticals.field290) != null) break block30;
                                                        v0 = 39951;
                                                        ** GOTO lbl10
                                                    }
                                                    v0 = 39952;
                                                    if (true) ** GOTO lbl10
                                                    block8: while (true) {
                                                        v0 = 39950;
lbl10:
                                                        // 3 sources

                                                        switch (v0) {
                                                            case 39952: {
                                                                continue block8;
                                                            }
                                                            case 39951: lbl-1000:
                                                            // 2 sources

                                                            {
                                                                return;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    if (AutoCrystal.method7217().method7126() || AutoCrystal.method7217().method7564()) {
                                                        return;
                                                    }
                                                    if (((Boolean)this.field653.method507()).booleanValue()) break block31;
                                                    v1 = 52693;
                                                    ** GOTO lbl25
                                                }
                                                v1 = 52694;
                                                if (true) ** GOTO lbl25
                                                do {
                                                    v1 = var2_2 = 52692;
lbl25:
                                                    // 3 sources

                                                    if (var2_2 == 52693) break block28;
                                                } while (var2_2 == 52694);
                                                break block32;
                                            }
                                            if (AutoTrap.method7031().method6998() || AutoCrawlTrap.method8679().method8731()) break block33;
                                            if (!Criticals.method2351(Criticals.method2308()) && !AutoXP.method10155().method1265()) break block32;
                                        }
                                        return;
                                    }
                                    var3_3 = e.method251();
                                    if (!(var3_3 instanceof Class3833)) {
                                        Class6009.method23561();
                                        return;
                                    }
                                    c = (Class3833)var3_3;
                                    if (c.method18777() != Class606.field2947) break block34;
                                    if (Criticals.field290.field_1724.method_3144() || Criticals.method2371(Criticals.field290).method_6128() || Criticals.field290.field_1724.method_5799() || Criticals.field290.field_1724.method_5771() || Criticals.field290.field_1724.method_21754() || Criticals.field290.field_1724.method_6059(Criticals.method2349())) break block35;
                                    if (!Class4196.method20801()) break block36;
                                }
                                return;
                            }
                            b = c.method18778();
                            if (b == null || !b.method_5805() || !(b instanceof class_1309)) {
                                return;
                            }
                            if (!Class1158.method13114(b)) break block37;
                            v2 = 43440;
                            ** GOTO lbl56
                        }
                        v2 = 43441;
                        if (true) ** GOTO lbl56
                        while (true) {
                            v2 = var5_5 = 43439;
lbl56:
                            // 3 sources

                            if (var5_5 == 43440) break;
                            if (var5_5 == 43441) {
                                continue;
                            }
                            break block29;
                            break;
                        }
                        if (!((Boolean)this.field630.method507()).booleanValue()) break block38;
                        a = (int)Criticals.field642[1];
                        block11: while (true) {
                            block39: {
                                if (a >= (int)Criticals.field642[2]) break block39;
                                v3 = 40414;
                                ** GOTO lbl71
                            }
                            v3 = 40415;
                            if (true) ** GOTO lbl71
                            block12: while (true) {
                                v3 = 40413;
lbl71:
                                // 3 sources

                                switch (v3) {
                                    case 40415: {
                                        continue block12;
                                    }
                                    case 40414: {
                                        Criticals.method2339(Class5723.field11048, (class_2596)class_2824.method_34206((class_1297)b, (boolean)Criticals.method2341().method12433()));
                                        Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
                                        ++a;
                                        continue block11;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    return;
                }
                Criticals.method2245(this, (boolean)(((Boolean)Criticals.method2248(this).method507()).booleanValue() && Criticals.field290.field_1724.method_5624() ? (int)Criticals.field642[0] : (int)Criticals.field642[1]));
                if (this.field629) {
                    Criticals.method2306().method21341((class_2596)new class_2848((class_1297)Criticals.field290.field_1724, class_2848.class_2849.field_12985));
                }
                Criticals.method2319(this, b);
                break block40;
            }
            var3_3 = e.method251();
            if (var3_3 instanceof class_2828) {
                d = (class_2828)var3_3;
                if (Criticals.method2271(this.field632) == Class621.field3035 && ((Boolean)this.field654.method507()).booleanValue()) {
                    ((bH)d).hookSetOnGround((boolean)Criticals.field642[1]);
                }
            }
        }
    }

    private static void method2353(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static void method2354(Criticals class307, boolean bl2) {
        class307.field635 = bl2;
    }

    private static int method2355(int n2, int n3, Class411 class411, AutoRespawn class337) {
        return Class4108.method20496(n2, n3, class411, class337);
    }

    public static class_746 method2356(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2357() {
        Class3979.method19561();
    }

    public static boolean method2358(Criticals class307) {
        return class307.field631;
    }

    private static Object method2359(Class248 class248) {
        return class248.method507();
    }

    private static void method2360(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method2361() {
        Class1745.method15538();
    }

    private static boolean method2362() {
        return Class1807.method15753();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method2363() {
        int n2;
        if (Criticals.method2225(this).method507() != Class621.field3034 && Criticals.method2336(Criticals.method2376(this)) != Class621.field3029) {
            n2 = (int)field642[1];
            return n2 != 0;
        }
        n2 = (int)field642[0];
        return n2 != 0;
    }

    @Class1
    public void method2364(Class132 a2) {
        if (Criticals.field290.field_1724 == null) {
            return;
        }
        if (a2.method251() instanceof class_2824) {
            if (this.field635) {
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(Criticals.field290.field_1724.method_23317(), Criticals.field290.field_1724.method_23318(), Criticals.field290.field_1724.method_23321(), (boolean)field642[1]));
                this.field635 = (int)field642[1];
            }
            if (this.field629) {
                Criticals.method2360(Criticals.method2273(), (class_2596)new class_2848((class_1297)Criticals.method2265(field290), class_2848.class_2849.field_12981));
                this.field629 = (int)field642[1];
            }
        }
    }

    private static Object method2365(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method2366() {
        Iterator iterator = Class5449.method21109(Criticals.method2263(field290).method_5829(), Criticals.field290.field_1724.method_24515()).iterator();
        block4: while (true) {
            if (!iterator.hasNext()) {
                return Criticals.method2342();
            }
            int n2 = 51115;
            block5: while (true) {
                switch (n2) {
                    case 51116: {
                        n2 = 51114;
                        continue block5;
                    }
                    case 51115: {
                        class_2338 c2 = (class_2338)iterator.next();
                        class_2680 a2 = Criticals.method2244(field290).method_8320(c2);
                        class_2680 b2 = Criticals.field290.field_1687.method_8320(c2.method_10084());
                        if (!a2.method_51366() || !b2.method_51366()) continue block4;
                        return (int)field642[0] != 0;
                    }
                }
                break;
            }
            break;
        }
        return (int)field642[1] != 0;
    }

    private static Class621 method2367() {
        return Criticals.method2377();
    }

    public static Class5496 method2368() {
        return Class5723.field11048;
    }

    public static class_744 method2369(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static void method2370() {
        Class6009.method23561();
    }

    public static class_746 method2371(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2372(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2373() {
        Class3979.method19561();
    }

    public static class_746 method2374(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2375(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method2376(Criticals class307) {
        return class307.field632;
    }

    public static Class621 method2377() {
        return Class621.field3035;
    }

    public static Class248 method2378(Criticals class307) {
        return class307.field650;
    }

    private static void method2379(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2380() {
        Class4146.method20697();
    }

    private static Object method2381(Class248 class248) {
        return class248.method507();
    }

    private static void method2382() {
        Class3979.method19561();
    }

    public static Class5496 method2383() {
        return Class5723.field11048;
    }

    private static void method2384() {
        Class5836.method22897();
    }

    private static void method2385(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

