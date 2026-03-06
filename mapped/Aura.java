/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.mob.MobEntity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.passive.WolfEntity
 *  net.minecraft.entity.mob.EndermanEntity
 *  net.minecraft.entity.mob.ZombifiedPiglinEntity
 *  net.minecraft.entity.mob.SlimeEntity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.SwordItem
 *  net.minecraft.item.TridentItem
 *  net.minecraft.world.GameMode
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.passive.WanderingTraderEntity
 *  net.minecraft.entity.Tameable
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.MaceItem
 */
package mapped;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1037;
import mapped.Class131;
import mapped.Class144;
import mapped.Class1498;
import mapped.Class1503;
import mapped.Class160;
import mapped.Class1659;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class2459;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Chams;
import mapped.ScreenKeeper;
import mapped.Criticals;
import mapped.Class3328;
import mapped.Class3493;
import mapped.Class3498;
import mapped.Class3741;
import mapped.Blink;
import mapped.Class3812;
import mapped.Class3975;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Velocity;
import mapped.Class468;
import mapped.Class480;
import mapped.Class525;
import mapped.Class535;
import mapped.Class5449;
import mapped.Class5496;
import mapped.Class5524;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class570;
import mapped.Class5723;
import mapped.Class576;
import mapped.Class5836;
import mapped.Class586;
import mapped.Class596;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class609;
import mapped.Class6161;
import mapped.Class6201;
import mapped.Class625;
import mapped.Class6322;
import mapped.Class6323;
import mapped.Class6454;
import mapped.Class677;
import mapped.Class760;
import mapped.Class803;
import mapped.Class926;
import mapped.Class971;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.entity.Tameable;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.MaceItem;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Aura
extends Class414 {
    Class248 field2074;
    Class248 field2075;
    Class248 field2076;
    Class248 field2077;
    private final List field2078 = new ArrayList();
    private int field2079;
    Class248 field2080;
    Class248 field2081;
    Class248 field2082;
    Class248 field2083;
    Class248 field2084;
    Class248 field2085;
    Class248 field2086;
    Class248 field2087;
    Class248 field2088;
    Class248 field2089;
    Class248 field2090;
    Class248 field2091;
    Class926 field2092;
    Class248 field2093;
    Class248 field2094;
    Class248 field2095;
    Class248 field2096;
    Class248 field2097;
    Class248 field2098;
    Class248 field2099;
    Class248 field2100;
    Class248 field2101;
    private static long[] field2102 = new long[6];
    int field2103;

    private static boolean method9071() {
        return Class3979.method19544();
    }

    private static void method9072(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method9073() {
        Chams.method1924();
    }

    public static class_746 method9074(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method9075(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method9076(Class248 class248) {
        return class248.method507();
    }

    private static void method9077(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class760 method9078() {
        return Class5723.field11049;
    }

    static {
        Aura.method9102(-1646076626498103767L);
    }

    public static Class248 method9079(Aura class434) {
        return class434.field2101;
    }

    public static int method9080(Aura class434) {
        return class434.field2103;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9081() {
        int n2;
        int n3 = this.field2078.size() > (int)field2102[1] ? 55337 : 55338;
        block8: while (true) {
            switch (n3) {
                case 55338: {
                    n3 = 55336;
                    continue block8;
                }
                case 55337: {
                    int n4 = ((Class586)((Object)Aura.method9115(this.field2090))).ordinal();
                    if (n4 == 0) {
                        if (this.field2103 >= Aura.method9132(this).size()) {
                            n2 = 41006;
                            break block8;
                        }
                        n2 = 41007;
                        break block8;
                    }
                    if (n4 != 1) {
                        if (n4 != 2) return;
                        this.field2078.forEach(this::method9112);
                        Class6454.method24594();
                        return;
                    }
                    this.method9112((class_1297)this.field2078.get(field289.nextInt(this.field2078.size())));
                    return;
                }
                default: {
                    Aura.method9142(this).forEach(this::method9112);
                    return;
                }
            }
            break;
        }
        block9: while (true) {
            switch (n2) {
                case 41007: {
                    n2 = 41005;
                    continue block9;
                }
                case 41006: {
                    this.field2103 = (int)field2102[0];
                    break block9;
                }
            }
            break;
        }
        this.method9112((class_1297)this.field2078.get(this.field2103));
        Aura class434 = this;
        Aura.method9168(class434, Aura.method9186(class434) + (int)field2102[1]);
    }

    private static void method9082(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9083() {
        Class5836.method22890();
    }

    private static boolean method9084() {
        return Class5659.method22194();
    }

    private static boolean method9085() {
        return Class3979.method19551();
    }

    public class_1297 method9086() {
        if (!Aura.method9143(this).isEmpty()) {
            return (class_1297)this.field2078.getFirst();
        }
        return null;
    }

    private static boolean method9087(class_1799 a2) {
        return a2.method_7909() instanceof class_1829;
    }

    private static boolean method9088(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method9089() {
        return Class1807.method15753();
    }

    private static int method9090(int n2, int n3, Class625 class625, Class1659 class1659) {
        return Class2459.method15915(n2, n3, class625, class1659);
    }

    private static boolean method9091() {
        return Replenish.method6431();
    }

    public static class_746 method9092(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9093(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method9094() {
        return Class1807.method15769();
    }

    private static boolean method9095(class_1799 a2) {
        return a2.method_7909() instanceof class_1743;
    }

    private static boolean method9096() {
        return Class3979.method19539();
    }

    private static void method9097(Class926 class926) {
        class926.method12593();
    }

    private static boolean method9098() {
        return Class3979.method19551();
    }

    private boolean method9099(class_1297 a2) {
        block8: {
            block7: {
                if (a2 instanceof class_1621) {
                    return (Boolean)this.field2084.method507();
                }
                if (a2 instanceof class_1657) {
                    return (Boolean)this.field2097.method507();
                }
                if (a2 instanceof class_1646) break block7;
                if (!(a2 instanceof class_3989)) break block8;
            }
            return (Boolean)Aura.method9161(this.field2082);
        }
        if (a2 instanceof class_1429) {
            return (Boolean)Aura.method9169(this.field2076);
        }
        if (a2 instanceof class_1308) {
            return (Boolean)this.field2099.method507();
        }
        return (int)field2102[0] != 0;
    }

    public static Class248 method9100(Aura class434) {
        return class434.field2083;
    }

    private static boolean method9101() {
        return Class5836.method22894();
    }

    private static void method9102(long l2) {
        Aura.field2102[2] = l2 ^ 0xE927F6078C81D623L;
        Aura.field2102[0] = l2 ^ 0xE927F6078C81D629L;
        Aura.field2102[5] = l2 ^ 0xE927F6078C81D62BL;
        Aura.field2102[4] = l2 ^ 0xE927F6078C81D62AL;
        Aura.field2102[1] = l2 ^ 0xE927F6078C81D628L;
        Aura.field2102[3] = l2 ^ 0xE927F6078C81D495L;
    }

    private static void method9103(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method9104() {
        Class4146.method20697();
    }

    private static boolean method9105(int n2) {
        return Class4196.method20803(n2);
    }

    private static void method9106() {
        Class3979.method19561();
    }

    private static void method9107() {
        Class1745.method15538();
    }

    @Class1
    private void method9108(Class131 a2) {
        if (a2.method251() instanceof class_2868) {
            this.field2079 = (Integer)Aura.method9100(this).method507();
        }
    }

    private static class_746 method9109(class_310 class_3102) {
        return Aura.method9118(class_3102);
    }

    private static Object method9110(Class248 class248) {
        return class248.method507();
    }

    private static Object method9111(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9112(class_1297 d2) {
        class_238 e2 = d2.method_5829();
        class_243 f2 = Class5449.method21103(e2);
        if (Aura.method9074(field290).method_33571().method_1022(f2) > (Double)this.field2093.method507()) {
            return;
        }
        if (((Boolean)Aura.method9137(this.field2081)).booleanValue()) {
            float[] a2 = Class1503.method14416(Aura.method9075(field290).method_33571(), f2);
            Class1503.method14417(a2[(int)field2102[0]], a2[(int)field2102[1]]);
        }
        int g2 = (int)field2102[0];
        if (((Boolean)Aura.method9136(this.field2101)).booleanValue()) {
            if (!Criticals.method2260().method1265()) {
                Class6009.method23559(true);
                return;
            }
            Class6454.method24636(0.7972231644777525, 0.4756123335392225, 0.8216544833082642, 0.16379929673006788);
            return;
        }
        if (Class1745.field6552) {
            Aura.method9177(Aura.field290.field_1724).method_52787((class_2596)class_2824.method_34206((class_1297)d2, (boolean)Aura.field290.field_1724.method_5715()));
            Aura.field290.field_1724.method_7350();
        } else {
            Aura.field290.field_1761.method_2918((class_1657)Aura.field290.field_1724, d2);
        }
        Aura.method9178((Class480)((Object)this.field2095.method507()), class_1268.field_5808);
        if (((Boolean)Aura.method9076(Aura.method9079(this))).booleanValue() && !Criticals.method2260().method1265()) {
            if (g2 != 0) {
                Aura.method9179(Class5723.field11048, (class_2596)new class_2848((class_1297)Aura.field290.field_1724, class_2848.class_2849.field_12985));
            }
            if (!((Boolean)this.field2081.method507()).booleanValue()) {
                int n2 = 61515;
                Class6454.method24594();
                return;
            }
            int n3 = 61514;
            block4: while (true) {
                switch (n3) {
                    case 61515: {
                        n3 = 61513;
                        continue block4;
                    }
                    case 61514: {
                        float[] c2 = Class1503.method14416(Aura.field290.field_1724.method_33571(), f2);
                        Class1503.method14417(c2[(int)field2102[0]], c2[(int)field2102[1]]);
                        break block4;
                    }
                }
                break;
            }
        }
        if (((Boolean)this.field2081.method507()).booleanValue()) {
            Aura.method9078().method12049();
        }
        Aura.method9097(Aura.method9150(this));
    }

    private static boolean method9113(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private boolean method9114() {
        class_1657 a2;
        class_1297 b2;
        Iterator iterator = this.field2078.iterator();
        do {
            if (iterator.hasNext()) continue;
            return Class3979.method19539();
        } while (!((b2 = (class_1297)iterator.next()) instanceof class_1657) || !(a2 = (class_1657)b2).method_6061(Aura.field290.field_1687.method_48963().method_48802((class_1657)Aura.field290.field_1724)) || this.field2075.method507() != Class596.field2898);
        return (int)field2102[1] != 0;
    }

    private static Object method9115(Class248 class248) {
        return class248.method507();
    }

    @Override
    public String method1248() {
        if (!this.field2078.isEmpty()) {
            return this.method9086().method_5477().getString();
        }
        return super.method1248();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9116(class_1297 h2) {
        int n2;
        class_6025 b2;
        if (h2.equals((Object)Aura.field290.field_1724)) return (int)field2102[0] != 0;
        if (h2.equals((Object)Aura.field290.field_1719)) {
            return (int)field2102[0] != 0;
        }
        if (h2 instanceof class_1309) {
            class_1309 a2 = (class_1309)h2;
            if (a2.method_29504()) return (int)field2102[0] != 0;
        }
        if (!h2.method_5805()) {
            return (int)field2102[0] != 0;
        }
        class_243 i2 = Class5449.method21096(Aura.method9127(field290).method_33571(), h2.method_5829());
        if (Aura.field290.field_1724.method_33571().method_1022(i2) > (Double)this.field2093.method507()) {
            return (int)field2102[0] != 0;
        }
        if (!this.method9099(h2)) {
            return (int)field2102[0] != 0;
        }
        if (((Boolean)this.field2087.method507()).booleanValue()) {
            if (h2.method_16914()) return (int)field2102[0] != 0;
        }
        if (Class5659.method22162(h2)) {
            return Aura.method9171(Class5524.field10443, 0.4046020534069612, 0.6105274656698135, 0.9465661573176375);
        }
        if (Aura.method9181(field290).method_33571().method_1022(i2) > (Double)this.field2098.method507()) {
            return (int)field2102[0] != 0;
        }
        if (((Boolean)this.field2080.method507()).booleanValue() && h2 instanceof class_6025 && (b2 = (class_6025)h2).method_6139() != null && b2.method_6139().equals(Aura.field290.field_1724.method_5667())) {
            return (int)field2102[0] != 0;
        }
        if (((Boolean)this.field2089.method507()).booleanValue()) {
            class_1297 class_12972 = h2;
            Objects.requireNonNull(class_12972);
            b2 = class_12972;
            int n3 = (int)field2102[0];
            block13: while (true) {
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_1560.class, class_1590.class, class_1493.class}, (Object)b2, n3)) {
                    case 0: {
                        class_1560 c2 = (class_1560)b2;
                        int n4 = !c2.method_7028() ? 33310 : 33309;
                        block14: while (true) {
                            switch (n4) {
                                case 33310: {
                                    n4 = 33308;
                                    continue block14;
                                }
                                case 33309: {
                                    n3 = (int)field2102[1];
                                    continue block13;
                                }
                            }
                            break;
                        }
                        return (int)field2102[0] != 0;
                    }
                    case 1: {
                        class_1590 d2 = (class_1590)b2;
                        if (!d2.method_6510()) return (int)field2102[0] != 0;
                        n3 = (int)field2102[5];
                        return Class5659.method22188(Class1498.field5650, 0.8380259897859386, Class6323.field13002, Class677.field3257);
                    }
                    case 2: {
                        class_1493 e2 = (class_1493)b2;
                        if (!e2.method_6510()) return (int)field2102[0] != 0;
                        n3 = (int)field2102[4];
                        while (true) {
                            // Infinite loop
                        }
                    }
                }
                break;
            }
        }
        if (h2 instanceof class_1657) {
            class_1657 f2 = (class_1657)h2;
            if (f2.method_7337()) {
                return (int)field2102[0] != 0;
            }
            if (Class5723.field11045.method21261(f2)) {
                return (int)field2102[0] != 0;
            }
            if (Aura.method9111(this.field2075) == Class596.field2896) {
                if (f2.method_6061(Aura.field290.field_1687.method_48963().method_48802((class_1657)Aura.method9092(field290)))) {
                    return Class1807.method15753();
                }
                int n5 = 37155;
                block16: while (true) {
                    switch (n5) {
                        case 37155: {
                            n5 = 37153;
                            continue block16;
                        }
                        case 37154: {
                            return (int)field2102[0] != 0;
                        }
                    }
                    break;
                }
            }
        }
        if (!(h2 instanceof class_1429)) return (int)field2102[1] != 0;
        class_1429 g2 = (class_1429)h2;
        int n6 = ((Class576)((Object)Aura.method9119(this.field2096))).ordinal() ^ 0x3B4C86E7;
        if (n6 == 994871013) {
            n2 = (int)field2102[1];
            return n2 != 0;
        }
        if (n6 != 994871014) {
            if (n6 != 994871015) throw new MatchException(null, null);
            n2 = g2.method_6109() ? 1 : 0;
            return n2 != 0;
        }
        if (g2.method_6109()) {
            n2 = (int)field2102[0];
            return n2 != 0;
        }
        int n7 = (int)field2102[1];
        while (true) {
            // Infinite loop
        }
    }

    private static boolean method9117(Aura class434) {
        return class434.method9131();
    }

    public static class_746 method9118(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method9119(Class248 class248) {
        return class248.method507();
    }

    private static void method9120(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static List method9121(Aura class434) {
        return class434.field2078;
    }

    public static class_746 method9122(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method9123() {
        return Class1807.method15769();
    }

    private static void method9124() {
        Class5836.method22897();
    }

    private static boolean method9125(Aura class434) {
        return class434.method9114();
    }

    private static boolean method9126(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static class_746 method9127(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method9128(int n2, int n3, Class160 class160, ScreenKeeper class301) {
        return Class2459.method15941(n2, n3, class160, class301);
    }

    private static void method9129() {
        Class1745.method15538();
    }

    private static boolean method9130(class_1799 a2) {
        return (int)field2102[1] != 0;
    }

    private boolean method9131() {
        if (this.field2079 > 0) {
            return (int)field2102[0] != 0;
        }
        if (((Boolean)this.field2091.method507()).booleanValue()) {
            int n2 = 56920;
            return Class5659.method22194();
        }
        int n3 = 56921;
        return Class5659.method22188(0.631600213027724, Class6201.field12616, 0.8917820338459367, 0.057504050152083264);
    }

    private Boolean method1278() {
        if (!((Boolean)this.field2091.method507()).booleanValue()) {
            int n2 = (int)field2102[1];
            Aura.method9145(0.5427801f, 0.33802336f);
            return null;
        }
        return (boolean)field2102[0];
    }

    private static List method9132(Aura class434) {
        return Aura.method9121(class434);
    }

    private static boolean method9133(int n2) {
        return Class4196.method20803(n2);
    }

    private static void method9134(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method9135() {
        return Class1807.method15742();
    }

    private static Object method9136(Class248 class248) {
        return class248.method507();
    }

    private static Object method9137(Class248 class248) {
        return class248.method507();
    }

    private static int method9138(int n2, int n3, Class3741 class3741, Chams class298) {
        return Class2459.method15925(n2, n3, class3741, class298);
    }

    private static boolean method9139(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method9140() {
        return Velocity.method10252();
    }

    private static void method9141() {
        Class6454.method24594();
    }

    private static List method9142(Aura class434) {
        return Aura.method9155(class434);
    }

    public static List method9143(Aura class434) {
        return class434.field2078;
    }

    private static boolean method9144(int n2) {
        return Class4196.method20803(n2);
    }

    private static void method9145(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method9146() {
        return Velocity.method10322();
    }

    public static Class248 method9147(Aura class434) {
        return class434.field2077;
    }

    private static boolean method9148(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method9149() {
        Class6454.method24594();
    }

    private static Class926 method9150(Aura class434) {
        return Aura.method9151(class434);
    }

    public static Class926 method9151(Aura class434) {
        return class434.field2092;
    }

    private static Class248 method9152(Aura class434) {
        return Aura.method9147(class434);
    }

    private static boolean method9153(class_1799 a2) {
        return a2.method_7909() instanceof class_9362;
    }

    @Override
    public void method1279() {
        this.field2078.clear();
    }

    private static boolean method9154(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static List method9155(Aura class434) {
        return class434.field2078;
    }

    private static Class3812 method9156(Class3812 class3812) {
        return class3812.method18502();
    }

    private static boolean method9157(class_1799 a2) {
        return a2.method_7909() instanceof class_1743;
    }

    private static void method9158(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    private static int method9159(int n2, int n3, Class144 class144, Class468 class468) {
        return Class2459.method15971(n2, n3, class144, class468);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9160() {
        int n2;
        if (Aura.method9125(this)) {
            return Aura.method9164(field290).method_6047().method_7909() instanceof class_1743;
        }
        switch (((Class535)((Object)this.field2074.method507())).ordinal()) {
            case 1: {
                boolean bl2 = Aura.method9193(field290).method_6047().method_7909() instanceof class_1743;
                return Class5659.method22229(Class3498.field7695, Class971.field4056, Class1037.field4264, 0.15052012017169802);
            }
            case 0: {
                n2 = Aura.field290.field_1724.method_6047().method_7909() instanceof class_1829;
                return n2 != 0;
            }
            case 2: {
                n2 = Aura.field290.field_1724.method_6047().method_7909() instanceof class_9362;
                return n2 != 0;
            }
            case 3: {
                n2 = Aura.field290.field_1724.method_6047().method_7909() instanceof class_1835;
                return n2 != 0;
            }
            case 4: {
                if (!(Aura.field290.field_1724.method_6047().method_7909() instanceof class_1743 || Aura.field290.field_1724.method_6047().method_7909() instanceof class_1829 || Aura.field290.field_1724.method_6047().method_7909() instanceof class_9362 || Aura.method9109(field290).method_6047().method_7909() instanceof class_1835)) {
                    n2 = (int)field2102[0];
                    return n2 != 0;
                }
                n2 = (int)field2102[1];
                return n2 != 0;
            }
        }
        n2 = (int)field2102[1];
        return n2 != 0;
    }

    private static Object method9161(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9162(class_1799 a2) {
        return a2.method_7909() instanceof class_1835;
    }

    private Boolean method1269() {
        return ((Integer)this.field2094.method507() > (int)field2102[1] ? (int)field2102[1] : (int)field2102[0]) != 0;
    }

    private static boolean method9163(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static class_746 method9164(class_310 class_3102) {
        return Aura.method9122(class_3102);
    }

    private static void method9165() {
        Class4146.method20694();
    }

    private static boolean method9166(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method9167() {
        return Class3979.method19544();
    }

    public static void method9168(Aura class434, int n2) {
        class434.field2103 = n2;
    }

    private static Object method9169(Class248 class248) {
        return class248.method507();
    }

    private static void method9170() {
        Class6454.method24594();
    }

    private static boolean method9171(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method9172() {
        Class1503.method14420();
    }

    private static boolean method9173() {
        return Class5659.method22111();
    }

    private static boolean method9174() {
        return Class4196.method20801();
    }

    private static boolean method9175() {
        return Class5836.method22894();
    }

    private static boolean method9176() {
        return Class1807.method15753();
    }

    public static class_634 method9177(class_746 class_7462) {
        return class_7462.field_3944;
    }

    private static void method9178(Class480 class480, class_1268 class_12682) {
        class480.method10782(class_12682);
    }

    private static void method9179(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static Object method9180(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method9181(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9182(Class210 e2) {
        int d2;
        Class3812 c2;
        block22: {
            Class3812 a2;
            Predicate<class_1799> predicate;
            block27: {
                block23: {
                    block26: {
                        block25: {
                            block24: {
                                this.field2079 -= (int)field2102[1];
                                if (Class3493.method17602((class_1657)Aura.field290.field_1724) == class_1934.field_9219) {
                                    return;
                                }
                                if (!((Boolean)this.field1536.method507()).booleanValue()) {
                                    if (this.method6619((boolean)field2102[1])) return;
                                }
                                if (Blink.method4987()) {
                                    return;
                                }
                                this.field2078.clear();
                                Class3493.method17601(this.field2078, this::method9116, (Class525)this.field2088.method507(), (Integer)this.field2094.method507());
                                if (this.field2078.isEmpty()) {
                                    return;
                                }
                                if (this.method9160()) {
                                    if (!this.method9131()) return;
                                    this.method9081();
                                    return;
                                }
                                if (this.field2077.method507() == Class609.field2966) return;
                                if (Aura.method9152(this).method507() != Class609.field2963) {
                                    Class1503.method14417(0.9301087f, Class3975.field9068);
                                    return;
                                }
                                int n2 = 34418;
                                if (!Aura.method9117(this)) {
                                    return;
                                }
                                switch (((Class535)((Object)this.field2074.method507())).ordinal() ^ 0x6DC273E1) {
                                    default: {
                                        break block23;
                                    }
                                    case 1841460192: {
                                        break;
                                    }
                                    case 1841460193: {
                                        break block24;
                                    }
                                    case 1841460194: {
                                        Class6009.method23561();
                                        return;
                                    }
                                    case 1841460195: {
                                        break block25;
                                    }
                                    case 1841460197: {
                                        break block26;
                                    }
                                }
                                predicate = Aura::method9095;
                                break block27;
                            }
                            predicate = Aura::method9087;
                            break block27;
                        }
                        predicate = Aura::method9153;
                        break block27;
                    }
                    predicate = Aura::method9185;
                    break block27;
                }
                predicate = Aura::method9130;
            }
            Predicate<class_1799> b2 = predicate;
            c2 = Aura.method9156(new Class3812(b2, (Class607)((Object)this.field2086.method507())));
            d2 = Class5723.field11058.method18969();
            int n3 = !this.method9114() ? 64311 : 64310;
            while (true) {
                int n4;
                if ((n4 = n3) == 64310) {
                    a2 = new Class3812(Aura::method9157, (Class607)((Object)this.field2086.method507())).method18502();
                    if (a2.method18523()) {
                        break;
                    }
                } else if (n4 == 64311) {
                    n3 = 64309;
                    continue;
                }
                break block22;
                break;
            }
            c2 = a2;
        }
        if (!c2.method18523()) {
            return;
        }
        if (this.field2077.method507() != Class609.field2963) {
            Aura.method9158(c2, d2);
            if (Aura.method9110(this.field2086) != Class607.field2953) return;
            Aura.field290.field_1724.method_31548().field_7545 = c2.method18530();
            return;
        }
        c2.method18531(d2);
        this.method9081();
        c2.method18534(d2);
        while (true) {
            // Infinite loop
        }
    }

    private static void method9183() {
        Class1745.method15538();
    }

    private static void method9184(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method9185(class_1799 a2) {
        return (a2.method_7909() instanceof class_1743 || a2.method_7909() instanceof class_1829 || a2.method_7909() instanceof class_9362 || a2.method_7909() instanceof class_1835 ? (int)field2102[1] : (int)field2102[0]) != 0;
    }

    private static int method9186(Aura class434) {
        return Aura.method9080(class434);
    }

    private static boolean method9187(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method9188() {
        return Class1807.method15753();
    }

    private static int method9189(int n2, int n3, Class570 class570, Class6161 class6161) {
        return Class2459.method15907(n2, n3, class570, class6161);
    }

    public Aura() {
        super("Aura", "Attacks specified entities around you", Class556.field2758, (int)field2102[3]);
        this.field2074 = this.method450(new Class260("Weapon", "Only attacks an entity when a specified weapon is in your hand", Class535.field2644, Class535.values()));
        this.field2081 = this.method450(new Class253("Rotate", "Automatically faces towards the target", (boolean)field2102[1]));
        this.field2095 = this.method450(new Class260("Swing", "Swing side for attack", Class480.field2509, Class480.values()));
        this.field2077 = this.method450(new Class260("AutoSwitch", "Switches to your selected weapon when attacking the target", Class609.field2966, Class609.values()));
        this.field2086 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field2075 = this.method450(new Class260("ShieldMode", "Will try and use an axe to break target shields", Class596.field2898, Class596.values()));
        this.field2088 = this.method450(new Class260("SortPriority", "How to filter targets within range", Class525.field2605, Class525.values()));
        this.field2094 = this.method450(new Class252("MaxTargets", "How many entities to target at once", (int)field2102[1], (int)field2102[1], (int)field2102[2]));
        this.field2090 = this.method450(new Class260("Mode", "mode", Class586.field2862, Class586.values(), this::method1269));
        this.field2093 = this.method450(new Class252("Range", "The maximum range the entity can be to attack it", 0.0, Class3328.field7181, 6.0));
        this.field2098 = this.method450(new Class252("WallsRange", "The maximum range the entity can be attacked through walls", 0.0, 3.0, 6.0));
        this.field2096 = this.method450(new Class260("MobAgeFilter", "Determines the age of the mobs to target (baby, adult, or both)", Class576.field2818, Class576.values()));
        this.field2087 = this.method450(new Class253("IgnoreNamed", "Whether or not to attack mobs with a name", (boolean)field2102[0]));
        this.field2089 = this.method450(new Class253("IgnorePassive", "Will only attack sometimes passive mobs if they are targeting you", (boolean)field2102[1]));
        this.field2080 = this.method450(new Class253("IgnoreTamed", "Will avoid attacking mobs you tamed", (boolean)field2102[0]));
        this.field2101 = this.method450(new Class253("Reverse", "Reverse the entity knock back", (boolean)field2102[0]));
        this.field2091 = this.method450(new Class253("CustomDelay", "Use a custom delay instead of the vanilla cooldown", (boolean)field2102[0]));
        this.field2100 = this.method450(new Class252("HitDelay", "How fast you hit the entity", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(11.0f), (Number)Float.valueOf(60.0f), this.field2091::method507));
        this.field2085 = this.method450(new Class252("AttackCD", "How fast you hit the entity", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(2.0f), this::method1278));
        this.field2083 = this.method450(new Class252("SwitchDelay", "How many ticks to wait before hitting an entity after switching hotbar slots", (int)field2102[0], (int)field2102[0], (int)field2102[2]));
        this.field2097 = this.method450(new Class253("Players", "Entities to attack", (boolean)field2102[1]));
        this.field2099 = this.method450(new Class253("Mobs", "Entities to attack", (boolean)field2102[0]));
        this.field2076 = this.method450(new Class253("Animals", "Entities to attack", (boolean)field2102[0]));
        this.field2082 = this.method450(new Class253("Villagers", "Entities to attack", (boolean)field2102[0]));
        this.field2084 = this.method450(new Class253("Slimes", "Entities to attack", (boolean)field2102[0]));
        this.field2092 = new Class926();
    }

    private static void method9190() {
        Class6009.method23560();
    }

    private static boolean method9191() {
        return Class3979.method19551();
    }

    private static boolean method9192() {
        return Class1807.method15742();
    }

    public static class_746 method9193(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

