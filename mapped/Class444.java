/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  net.minecraft.util.Formatting
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ElytraItem
 *  net.minecraft.item.FireworkRocketItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1002;
import mapped.Class1108;
import mapped.Class1124;
import mapped.Class1181;
import mapped.Class1215;
import mapped.Class1226;
import mapped.Class1365;
import mapped.Class1391;
import mapped.Class1435;
import mapped.Class1447;
import mapped.Class148;
import mapped.Class1503;
import mapped.Class1585;
import mapped.Class1661;
import mapped.Class1668;
import mapped.Class1742;
import mapped.Class1745;
import mapped.Class18;
import mapped.Class1807;
import mapped.Class204;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class294;
import mapped.Class298;
import mapped.Class376;
import mapped.Class3815;
import mapped.Class3850;
import mapped.Class3862;
import mapped.Class3935;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Class3988;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class411;
import mapped.Class4123;
import mapped.Class4146;
import mapped.Class423;
import mapped.Class442;
import mapped.Class447;
import mapped.Class535;
import mapped.Class5394;
import mapped.Class5496;
import mapped.Class552;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class573;
import mapped.Class5836;
import mapped.Class5880;
import mapped.Class59;
import mapped.Class6008;
import mapped.Class6009;
import mapped.Class6017;
import mapped.Class6037;
import mapped.Class6055;
import mapped.Class619;
import mapped.Class62;
import mapped.Class630;
import mapped.Class6322;
import mapped.Class6339;
import mapped.Class644;
import mapped.Class6454;
import mapped.Class69;
import mapped.Class703;
import mapped.Class707;
import mapped.Class76;
import mapped.Class760;
import mapped.Class91;
import mapped.Class924;
import mapped.Class925;
import mapped.Class926;
import mapped.Class955;
import net.hachimi.client.mixin.au;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.FireworkRocketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class444
extends Class411 {
    Class248 field2230;
    private final Class924 field2231;
    private boolean field2232;
    Class248 field2233;
    Class248 field2234;
    Class248 field2235;
    Class248 field2236;
    Class248 field2237;
    Class248 field2238;
    Class248 field2239;
    Class248 field2240;
    boolean field2241;
    Class248 field2242;
    private class_243 field2243;
    Class248 field2244;
    Class248 field2245;
    private float field2246;
    private final Class926 field2247;
    private boolean field2248;
    private int field2249;
    private static Class444 INSTANCE;
    Class248 field2250;
    Class248 field2251;
    Class248 field2252;
    private final Class924 field2253 = new Class924();
    Class248 field2254;
    Class248 field2255;
    Class248 field2256;
    Class248 field2257;
    Class248 field2258;
    private static long[] field2259;
    Class248 field2260;
    private float field2261;
    Class248 field2262;
    Class248 field2263;
    Class248 field2264;
    Class248 field2265;
    private boolean field2266;
    private float field2267;
    Class248 field2268;
    public boolean field2269;
    Class248 field2270;
    Class248 field2271;
    Class248 field2272;
    Class248 field2273;

    private static void method9670() {
        Class4146.method20694();
    }

    private static void method9671(Class924 class924) {
        class924.method12593();
    }

    private static int method9672(class_1703 class_17032) {
        return Class444.method9832(class_17032);
    }

    private static void method9673() {
        Class3979.method19561();
    }

    public static class_746 method9674(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method9675(Class444 class444) {
        return class444.method9811();
    }

    private static void method9676() {
        Class298.method1924();
    }

    public static Class248 method9677(Class444 class444) {
        return class444.field2238;
    }

    public static class_746 method9678(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9679() {
        int n2 = !this.method9866() ? 41586 : 41587;
        block4: while (true) {
            switch (n2) {
                case 41587: {
                    n2 = 41585;
                    continue block4;
                }
                case 41586: {
                    this.field2267 = Class444.field290.field_1724.method_36454();
                    this.field2261 = 0.0f;
                    return;
                }
            }
            break;
        }
        if (((Boolean)this.field2244.method507()).booleanValue()) {
            Class444.method9944(this);
            Class444.method9803();
            return;
        }
        this.method9720();
        if (((Boolean)Class444.method9793(this).method507()).booleanValue()) {
            int a2 = !Class444.field290.field_1690.field_1894.method_1434() && !Class444.field290.field_1690.field_1881.method_1434() && !Class444.field290.field_1690.field_1913.method_1434() && !Class444.field290.field_1690.field_1849.method_1434() ? (int)field2259[0] : (int)field2259[4];
            boolean b2 = Class444.field290.field_1690.field_1903.method_1434();
            boolean c2 = Class444.field290.field_1690.field_1832.method_1434();
            if ((a2 == 0 && !b2 && !c2 || a2 == 0 && b2 && c2) && !Class444.method9927().method8226()) {
                return;
            }
        }
        if (((Boolean)Class444.method9787(this).method507()).booleanValue() && !this.method9680() && this.field2231.method12595((Number)this.field2260.method507())) {
            int g2;
            block13: {
                g2 = (int)field2259[3];
                int e2 = (int)field2259[0];
                while (true) {
                    if (((Boolean)this.field2236.method507()).booleanValue()) {
                        int n3 = (int)field2259[8];
                        Class444.method9782(false);
                        return;
                    }
                    if (e2 >= (int)field2259[5]) break block13;
                    class_1799 d2 = Class444.field290.field_1724.method_31548().method_5438(e2);
                    if (d2.method_7909() instanceof class_1781) break;
                    ++e2;
                }
                g2 = e2;
            }
            if (g2 != (int)field2259[3]) {
                if (g2 < (int)field2259[5]) {
                    int f2 = Class444.method9893(Class5723.field11058);
                    Class444.method9704().method18887(g2);
                    Class444.method9921(Class5723.field11048, Class444::method9753);
                    Class444.method9853().method18987(f2);
                    Class1503.method14420();
                    return;
                }
                Class4146.method20697();
                return;
            }
        }
    }

    private boolean method9680() {
        Iterator iterator = Class444.method9747(field290).method_18112().iterator();
        if (iterator.hasNext()) {
            class_1671 a2;
            class_1297 b2 = (class_1297)iterator.next();
            if (b2 instanceof class_1671 && ((au)(a2 = (class_1671)b2)).hookWasShotByEntity()) {
                if (((au)a2).hookGetShooter() == Class444.field290.field_1724) {
                    return (int)field2259[4] != 0;
                }
            }
            return Class1215.method13261(0.029139452764285645, Class1002.field4157);
        }
        return (int)field2259[0] != 0;
    }

    private static void method9681() {
        Class5836.method22897();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9682() {
        int n2;
        if (!this.method9755()) {
            int n3 = Class444.method9675(this) ? 43548 : 43549;
            block4: while (true) {
                switch (n3) {
                    case 43549: {
                        n3 = 43547;
                        continue block4;
                    }
                    case 43548: {
                        if (!((Boolean)this.field2255.method507()).booleanValue()) break block4;
                        n2 = (int)field2259[4];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field2259[0];
        return n2 != 0;
    }

    public static Class1447 method9683() {
        return Class5723.field11056;
    }

    public static Class248 method9684(Class444 class444) {
        return class444.field2240;
    }

    public static class_636 method9685(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method9686() {
        Class6009.method23560();
    }

    private static void method9687(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9688() {
        Class4146.method20694();
    }

    private static void method9689(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method9690(Class444 class444) {
        return class444.field2273;
    }

    private static class_2596 method9691(int a2) {
        return new class_2886(Class444.method9805(), a2, Class444.method9801(field290).method_36454(), Class444.method9932(field290).method_36455());
    }

    private static void method9692() {
        Class5836.method22885();
    }

    private static void method9693(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_243 method9694(Class444 class444) {
        return class444.field2243;
    }

    private static void method9695(Class444 class444) {
        class444.method9679();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=-100)
    public void method9696(Class69 a2) {
        if (Class3979.method19539() && BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            return;
        }
        if (this.field2233.method507() == Class444.method9730() && ((Boolean)this.field2239.method507()).booleanValue() && this.method9866()) {
            Class444.method9809(Class444.field290.field_1724.field_3913, 0.0f);
            Class444.method9900((class_310)Class444.field290).field_3913.field_3905 = 0.0f;
        }
        if (this.method9755()) {
            if (((Boolean)this.field2272.method507()).booleanValue()) {
                if (Class5723.field11056.method14268(field2259[10])) {
                    int n2 = 18869;
                    Class3979.method19561();
                    return;
                }
                int n3 = 18868;
                block4: while (true) {
                    switch (n3) {
                        case 18869: {
                            n3 = 18867;
                            continue block4;
                        }
                        case 18868: {
                            return;
                        }
                    }
                    break;
                }
            }
            Class444.method9706((class_310)Class444.field290).field_3913.field_3904 = (int)field2259[4];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1279() {
        if (this.field2266) {
            Class5723.field11047.method19512(1.0f);
        }
        if (this.field2269) {
            if ((Integer)Class444.method9874(this.field2265) > 0) {
                Class444.method9779((Integer)this.field2265.method507());
                Class3815.INSTANCE.method18542(Class5394.class);
            }
            this.field2269 = (int)field2259[0];
        }
        int n2 = Class3979.method19539() ? 2096 : 2097;
        block4: while (true) {
            switch (n2) {
                case 2097: {
                    n2 = 2095;
                    continue block4;
                }
                case 2096: {
                    BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().forceCancel();
                    break block4;
                }
            }
            break;
        }
        if (Class444.field290.field_1724 != null && ((Boolean)this.field2254.method507()).booleanValue()) {
            Class444.field290.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)Class444.field290.field_1724, class_2848.class_2849.field_12984));
        }
    }

    private static boolean method9697(Class444 class444) {
        return class444.method9755();
    }

    private static void method9698(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_2848.class_2849 method9699() {
        return class_2848.class_2849.field_12982;
    }

    private static void method9700(Class444 class444, boolean bl2) {
        Class444.method9820(class444, bl2);
    }

    public static void method9701(Class444 class444, int n2) {
        class444.field2249 = n2;
    }

    private static float method9702(Class444 class444) {
        return Class444.method9715(class444);
    }

    private static void method9703(Class444 class444, class_243 class_2432) {
        Class444.method9936(class444, class_2432);
    }

    private static Class3850 method9704() {
        return Class444.method9741();
    }

    private static int method9705(int n2, int n3, Class630 class630, Class925 class925) {
        return Class6017.method23612(n2, n3, class630, class925);
    }

    public static class_746 method9706(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9707() {
        Class4146.method20697();
    }

    private static boolean method9708() {
        return Class1807.method15742();
    }

    public static class_1713 method9709() {
        return class_1713.field_7791;
    }

    private static int method9710(int n2, int n3, Class1391 class1391, Class703 class703) {
        return Class6017.method23672(n2, n3, class1391, class703);
    }

    public static class_315 method9711(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static Class442 method9712() {
        return Class442.method9614();
    }

    /*
     * Unable to fully structure code
     */
    @Class1(priority=-50)
    public void method9713(Class210 o) {
        block52: {
            block48: {
                block53: {
                    block51: {
                        block49: {
                            block50: {
                                p = this.field2241;
                                this.field2269 = (int)Class444.field2259[0];
                                Class444.method9786(this, (boolean)Class444.field2259[0]);
                                if (Class3979.method19539()) {
                                    if (BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
                                        return;
                                    }
                                }
                                if (!Class444.method9872()) break block49;
                                if (!((Boolean)Class444.method9775(this.field2268)).booleanValue()) break block49;
                                if (!((Boolean)BaritoneAPI.getSettings().freeLook.value).booleanValue()) {
                                    Class444.method9742(String.valueOf(class_124.field_1061) + "Please enable FreeLook in Baritone to use ObstaclePasser!", (int)Class444.field2259[9]);
                                    return;
                                }
                                if (!Class444.field290.field_1724.field_5976) break block49;
                                e = null;
                                f = Class444.field290.field_1724.method_19538();
                                g = Class1503.method14432(0.0f, Class444.field290.field_1724.method_36454());
                                for (c = (int)Class444.field2259[12]; c < (int)Class444.field2259[11]; ++c) {
                                    a = f.method_1031(g.field_1352 * (double)c, 0.0, g.field_1350 * (double)c);
                                    b = class_2338.method_49638((class_2374)a);
                                    if (!Class444.field290.field_1687.method_8320(b).method_26215() || !Class444.field290.field_1687.method_8320(b.method_10084()).method_26215()) continue;
                                    e = b;
                                    break;
                                }
                                if (e != null) break block50;
                                v0 = 27835;
                                ** GOTO lbl30
                            }
                            v0 = 27836;
                            if (true) ** GOTO lbl30
                            block13: while (true) {
                                v0 = 27834;
lbl30:
                                // 3 sources

                                switch (v0) {
                                    case 27836: {
                                        continue block13;
                                    }
                                    case 27835: {
                                        d = f.method_1031(g.field_1352 * 200.0, 0.0, g.field_1350 * 200.0);
                                        e = class_2338.method_49638((class_2374)d);
                                    }
                                }
                                break;
                            }
                            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(e.method_10263(), e.method_10264(), e.method_10260()));
                            return;
                        }
                        if (!this.method9755()) break block51;
                        v1 = 8648;
                        ** GOTO lbl47
                    }
                    v1 = 8649;
                    if (true) ** GOTO lbl47
                    block14: while (true) {
                        v1 = 8647;
lbl47:
                        // 3 sources

                        switch (v1) {
                            case 8649: {
                                continue block14;
                            }
                            case 8648: {
                                if (Class444.field290.field_1724.method_5765() || Class444.field290.field_1724.method_6101() || Class444.method9882(Class444.field290).method_5799()) ** GOTO lbl113
                                j = Class444.field290.field_1724.method_6118(class_1304.field_6174);
                                if (!j.method_31574(class_1802.field_8833)) ** GOTO lbl85
                                if (!class_1770.method_7804((class_1799)j)) ** GOTO lbl57
                                v2 = 60285;
                                ** GOTO lbl61
lbl57:
                                // 1 sources

                                v2 = 60286;
                                if (true) ** GOTO lbl61
                                block15: while (true) {
                                    v2 = 60284;
lbl61:
                                    // 3 sources

                                    switch (v2) {
                                        case 60286: {
                                            continue block15;
                                        }
                                        case 60285: {
                                            this.method9714();
                                            if (((Boolean)this.field2272.method507()).booleanValue() && !Class5723.field11056.method14268(Class444.field2259[10])) {
                                                return;
                                            }
                                            if (Class444.field290.field_1724.method_24828()) {
                                                Class4036.method20085(Class6055.field12167, Class4123.field9565, 0.65247387f, 0.5718692f, Class1124.field4521, 0.17285657f);
                                                return;
                                            }
                                            if (!Class444.method9749(Class444.field290).method_6128()) {
                                                Class444.field290.method_1562().method_52787((class_2596)new class_2848((class_1297)Class444.field290.field_1724, class_2848.class_2849.field_12982));
                                                this.field2241 = (int)Class444.field2259[4];
                                            } else {
                                                if (Class444.field290.field_1724.method_24828() && ((Boolean)Class444.method9774(this).method507()).booleanValue()) {
                                                    Class444.field290.method_1562().method_52787((class_2596)new class_2848((class_1297)Class444.field290.field_1724, class_2848.class_2849.field_12982));
                                                    this.field2241 = (int)Class444.field2259[4];
                                                    Class1503.method14420();
                                                    return;
                                                }
                                                if (p && Class444.field290.field_1724.method_24828()) {
                                                    this.field2241 = (int)Class444.field2259[4];
                                                }
                                            }
                                            if (this.method9752()) {
                                                Class444.method9859(Class444.field290).method_5728((boolean)Class444.field2259[4]);
                                            }
                                            return;
                                        }
                                    }
                                    break;
                                }
lbl85:
                                // 2 sources

                                if (this.method9811()) {
                                    i = (int)Class444.field2259[0];
                                    while (true) {
                                        if (i >= (((Boolean)this.field2236.method507()).booleanValue() ? (int)Class444.field2259[8] : (int)Class444.field2259[5])) break;
                                        h = Class444.field290.field_1724.method_31548().method_5438(i);
                                        if (h.method_7909() instanceof class_1770) {
                                            Class444.method9886(this, i);
                                            break;
                                        }
                                        ++i;
                                    }
                                    if (this.field2249 == (int)Class444.field2259[3]) {
                                        Class3979.method19561();
                                        return;
                                    }
                                    if (this.method9752()) {
                                        Class444.method9717(Class444.field290).method_5728((boolean)Class444.field2259[4]);
                                    }
                                    this.method9714();
                                    if (this.field2249 < (int)Class444.field2259[5]) {
                                        Class444.field290.field_1761.method_2906(Class444.field290.field_1724.field_7512.field_7763, (int)Class444.field2259[6], this.field2249, class_1713.field_7791, (class_1657)Class444.field290.field_1724);
                                    } else {
                                        Class444.field290.field_1761.method_2906(Class444.field290.field_1724.field_7512.field_7763, Class444.method9924(this), (int)Class444.field2259[7], class_1713.field_7791, (class_1657)Class444.field290.field_1724);
                                        Class444.method9685(Class444.field290).method_2906(Class444.field290.field_1724.field_7512.field_7763, (int)Class444.field2259[6], (int)Class444.field2259[7], class_1713.field_7791, (class_1657)Class444.field290.field_1724);
                                    }
                                    Class444.field290.method_1562().method_52787((class_2596)new class_2848((class_1297)Class444.method9879(Class444.field290), Class444.method9940()));
                                    this.field2241 = (int)Class444.field2259[4];
                                    if (this.field2249 < (int)Class444.field2259[5]) {
                                        Class444.field290.field_1761.method_2906(Class444.method9672(Class444.field290.field_1724.field_7512), (int)Class444.field2259[6], this.field2249, class_1713.field_7791, (class_1657)Class444.method9757(Class444.field290));
                                    } else {
                                        Class444.field290.field_1761.method_2906(Class444.field290.field_1724.field_7512.field_7763, (int)Class444.field2259[6], (int)Class444.field2259[7], class_1713.field_7791, (class_1657)Class444.method9674(Class444.field290));
                                        Class444.field290.field_1761.method_2906(Class444.field290.field_1724.field_7512.field_7763, this.field2249, (int)Class444.field2259[7], class_1713.field_7791, (class_1657)Class444.field290.field_1724);
                                    }
                                }
lbl113:
                                // 5 sources

                                return;
                            }
                        }
                        break;
                    }
                    if (Class444.field290.field_1724.method_5765() || Class444.field290.field_1724.method_6101()) break block52;
                    if (Class444.field290.field_1724.method_5799()) break block53;
                    v3 = 52414;
                    ** GOTO lbl123
                }
                v3 = 52415;
                if (true) ** GOTO lbl123
                do {
                    v3 = var9_17 = 52413;
lbl123:
                    // 3 sources

                    if (var9_17 == 52414) break block48;
                } while (var9_17 == 52415);
                break block52;
            }
            n = Class444.field290.field_1724.method_6118(class_1304.field_6174);
            if (n.method_31574(Class444.method9887())) {
                if (!class_1770.method_7804((class_1799)n)) {
                    Class1503.method14420();
                    return;
                }
                if (Class444.field290.field_1724.method_24828()) {
                    if (((Boolean)this.field2235.method507()).booleanValue()) {
                        Class444.field290.field_1724.method_6043();
                    }
                } else if (((Boolean)Class444.method9690(this).method507()).booleanValue() && !Class444.field290.field_1724.method_6128()) {
                    if (Class444.field290.field_1724.method_23668()) {
                        Class444.field290.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)Class444.field290.field_1724, class_2848.class_2849.field_12982));
                    }
                }
            } else if (this.method9811()) {
                m = (int)Class444.field2259[3];
                for (l = (int)Class444.field2259[0]; l < ((Boolean)this.field2236.method507() != false ? (int)Class444.field2259[8] : (int)Class444.field2259[5]); ++l) {
                    k = Class444.field290.field_1724.method_31548().method_5438(l);
                    if (!(k.method_7909() instanceof class_1770)) continue;
                    m = l;
                    Class444.method9895();
                    return;
                }
                if (m != (int)Class444.field2259[3]) {
                    while (true) {
                        // Infinite loop
                    }
                }
            }
        }
        Class444.method9695(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method9714() {
        int n2 = ((Class573)((Object)this.field2233.method507())).ordinal();
        if (n2 == 1) {
            this.method6465(Class444.field290.field_1724.method_36454(), ((Float)this.field2262.method507()).floatValue());
            return;
        }
        if (n2 != 2) {
            return;
        }
        int a2 = Class444.method9783(Class444.method9925(field290)).method_1434() || Class444.field290.field_1690.field_1881.method_1434() || Class444.field290.field_1690.field_1913.method_1434() || Class444.field290.field_1690.field_1849.method_1434() ? (int)field2259[4] : (int)field2259[0];
        boolean b2 = Class444.method9920((class_310)Class444.field290).field_1903.method_1434();
        boolean c2 = Class444.method9922((class_310)Class444.field290).field_1832.method_1434();
        int n3 = a2 != 0 ? 34280 : 34281;
        block4: while (true) {
            switch (n3) {
                case 34281: {
                    n3 = 34279;
                    continue block4;
                }
                case 34280: {
                    if (b2 && !c2) {
                        this.field2261 = -45.0f;
                        Class444.method9759(0.5708266f, 0.93243825f);
                        return;
                    }
                    if (c2 && !b2) {
                        Class444.method9777(this, 45.0f);
                        break block4;
                    }
                    Class444.method9818(this, 0.0f);
                    break block4;
                }
                default: {
                    if (b2 && !c2) {
                        this.field2261 = -89.0f;
                        break block4;
                    }
                    if (c2 && !b2) {
                        this.field2261 = Class6008.field11994;
                        break block4;
                    }
                    this.field2232 = (Boolean)this.field2240.method507() != false && !Class423.method8246().method8226() ? (int)field2259[4] : (int)field2259[0];
                    int n4 = this.field2232 ? 1 : 0;
                }
            }
            break;
        }
        if (a2 != 0) {
            this.field2267 = Class444.method9712().method9636(Class444.field290.field_1724.method_36454());
        }
        if (this.field2232) {
            if ((Boolean)this.field2237.method507() == false) return;
            Class444.method9894().method12006(new Class1226((int)field2259[13], this.field2267, this.field2261));
            return;
        }
        Class444.method9761(Class444.method9844(this));
        this.method6465(this.field2267, this.field2261);
    }

    public static float method9715(Class444 class444) {
        return class444.field2246;
    }

    private static void method9716() {
        Class3979.method19561();
    }

    public static class_746 method9717(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9718(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9719() {
        int n2;
        if (this.field2233.method507() == Class573.field2803 && !((Boolean)Class444.method9816(this.field2244)).booleanValue() && ((Boolean)Class444.method9797(this).method507()).booleanValue()) {
            n2 = (int)field2259[4];
            return n2 != 0;
        }
        n2 = (int)field2259[0];
        return n2 != 0;
    }

    public void method9720() {
        if (this.field2233.method507() != Class573.field2803) {
            Class1503.method14417(Class1585.field5927, 0.19608486f);
            return;
        }
        if (((Boolean)this.field2250.method507()).booleanValue()) {
            Class444.method9899(this);
            this.method6465(Class444.method9852(field290).method_36454(), Class444.method9702(this));
        }
    }

    private Boolean method9721() {
        if (!this.method9755()) {
            int n2 = (int)field2259[4];
            Class5659.method22184();
            return null;
        }
        return (boolean)field2259[0];
    }

    private static void method9722() {
        Class298.method1924();
    }

    private static void method9723() {
        Class5836.method22890();
    }

    private static Class1447 method9724() {
        return Class444.method9683();
    }

    public boolean method9725() {
        return (!Class444.field290.field_1724.method_5765() && !Class444.field290.field_1724.method_6101() && !Class444.field290.field_1724.method_5799() && this.field2241 ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9726() {
        Class298.method1924();
    }

    public static Class248 method9727(Class444 class444) {
        return class444.field2251;
    }

    public static Class248 method9728(Class444 class444) {
        return class444.field2238;
    }

    private static Class423 method9729() {
        return Class423.method8246();
    }

    public static Class573 method9730() {
        return Class573.field2803;
    }

    private static void method9731(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method9732() {
        Class1503.method14420();
    }

    private Boolean method9733() {
        if (!((Boolean)this.field2264.method507()).booleanValue()) {
            Class6454.method24594();
            return null;
        }
        return (Class444.method9697(this) ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static int method9734(int n2, int n3, Class76 class76, Class294 class294) {
        return Class6017.method23725(n2, n3, class76, class294);
    }

    private static void method9735() {
        Class1807.method15744();
    }

    private static void method9736() {
        Class6454.method24594();
    }

    private static void method9737() {
        Class6009.method23560();
    }

    private static void method9738() {
        Class4146.method20697();
    }

    public static class_746 method9739(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9740(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class3850 method9741() {
        return Class5723.field11058;
    }

    private static void method9742(String string, int n2) {
        Class1365.method13948(string, n2);
    }

    private static void method9743() {
        Class5659.method22184();
    }

    private static Object method9744(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9745() {
        int n2;
        int n3 = !this.method9755() ? 16054 : 16055;
        block4: while (true) {
            switch (n3) {
                case 16055: {
                    n3 = 16053;
                    continue block4;
                }
                case 16054: {
                    n2 = (int)field2259[4];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2259[0];
        return n2 != 0;
    }

    static {
        field2259 = new long[14];
        Class444.method9863(5801969338681410686L);
    }

    private static double method9746(class_243 class_2432) {
        return Class444.method9892(class_2432);
    }

    public static class_638 method9747(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class248 method9748(Class444 class444) {
        return class444.field2235;
    }

    public static class_746 method9749(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method9750(int n2, int n3, Class6339 class6339, Class1742 class1742) {
        return Class6017.method23594(n2, n3, class6339, class1742);
    }

    private static Object method9751(Class248 class248) {
        return class248.method507();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean method9752() {
        int n2;
        block17: {
            if (!Class444.method9678(field290).method_5715()) {
                block16: {
                    int n3;
                    if (!Class444.field290.field_1724.method_3144()) {
                        return Class444.method9841();
                    }
                    int n4 = 50802;
                    boolean bl2 = true;
                    do {
                        if (!bl2 || (bl2 = false) || !true) {
                            n4 = n3 = 50800;
                        }
                        if (n3 == 50801) break block16;
                    } while (n3 == 50802);
                    break block17;
                }
                if (!Class444.field290.field_1724.method_5799()) {
                    if (!Class444.field290.field_1724.method_5771()) {
                        return Class447.method10322();
                    }
                    int n5 = 46114;
                    block9: while (true) {
                        switch (n5) {
                            case 46114: {
                                n5 = 46112;
                                continue block9;
                            }
                            case 46113: {
                                if (Class444.method9739(field290).method_21754() || Class444.method9911(field290).method_6059(Class444.method9896())) break block9;
                                int n6 = (float)Class444.field290.field_1724.method_7344().method_7586() > 6.0f ? 53404 : 53405;
                                block10: while (true) {
                                    switch (n6) {
                                        case 53405: {
                                            n6 = 53403;
                                            continue block10;
                                        }
                                        case 53404: {
                                            n2 = (int)field2259[4];
                                            return n2 != 0;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        n2 = (int)field2259[0];
        return n2 != 0;
    }

    private static class_2596 method9753(int a2) {
        return new class_2886(Class444.method9778(), a2, Class444.field290.field_1724.method_36454(), Class444.field290.field_1724.method_36455());
    }

    private static void method9754() {
        Class4146.method20694();
    }

    public boolean method9755() {
        return (this.field2233.method507() == Class573.field2802 ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9756() {
        Class298.method1924();
    }

    public static class_746 method9757(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method9758() {
        return (this.field2233.method507() == Class573.field2803 && !((Boolean)Class444.method9850(this).method507()).booleanValue() && ((Boolean)this.field2250.method507()).booleanValue() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9759(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method9760() {
        Class4146.method20697();
    }

    private static void method9761(Class924 class924) {
        class924.method12593();
    }

    private static Object method9762(Class248 class248) {
        return class248.method507();
    }

    private static void method9763(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9764() {
        Class6009.method23561();
    }

    public static Class444 method9765() {
        return INSTANCE;
    }

    private static class_746 method9766(class_310 class_3102) {
        return Class444.method9802(class_3102);
    }

    private static boolean method9767(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method9768() {
        Class1503.method14420();
    }

    private static boolean method9769() {
        return Class3979.method19539();
    }

    private Boolean method9770() {
        return (!Class444.method9934(this) ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    public static class_636 method9771(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method9772() {
        Class5836.method22897();
    }

    private static void method9773() {
        Class4146.method20694();
    }

    public static Class248 method9774(Class444 class444) {
        return class444.field2255;
    }

    private static Object method9775(Class248 class248) {
        return class248.method507();
    }

    public static int method9776(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    public static void method9777(Class444 class444, float f2) {
        class444.field2261 = f2;
    }

    public static class_1268 method9778() {
        return class_1268.field_5808;
    }

    public static void method9779(int n2) {
        Class5394.field10079 = n2;
    }

    private static Object method9780(Class248 class248) {
        return class248.method507();
    }

    private static void method9781() {
        Class4146.method20694();
    }

    private static void method9782(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_304 method9783(class_315 class_3152) {
        return class_3152.field_1894;
    }

    public boolean method9784() {
        return (Boolean)Class444.method9837(this).method507();
    }

    private static void method9785() {
        Class4146.method20694();
    }

    public static void method9786(Class444 class444, boolean bl2) {
        class444.field2241 = bl2;
    }

    public static Class248 method9787(Class444 class444) {
        return class444.field2256;
    }

    private void method9788() {
        if (this.field2243 == null) {
            return;
        }
        double a2 = Math.hypot(Class444.field290.field_1724.method_23317() - Class444.method9694(this).method_10216(), Class444.field290.field_1724.method_23321() - this.field2243.method_10215()) * 72.0;
        if (Class444.field290.field_1724.method_23318() < (double)((Float)Class444.method9727(this).method507()).floatValue()) {
            if (a2 < (double)((Float)Class444.method9843(this.field2257)).floatValue()) {
                this.field2248 = (int)field2259[4];
            } else if (a2 > (double)((Float)this.field2271.method507()).floatValue()) {
                this.field2248 = (int)field2259[0];
            }
        } else {
            this.field2248 = (int)field2259[4];
        }
        this.field2246 = this.field2248 ? (this.field2246 += 3.0f) : (this.field2246 -= 3.0f);
        this.field2246 = class_3532.method_15363((float)this.field2246, (float)-40.0f, (float)Class1181.field4687);
    }

    private static void method9789() {
        Class1503.method14420();
    }

    private static boolean method9790(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static class_746 method9791(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method9792() {
        return Class1807.method15769();
    }

    public static Class248 method9793(Class444 class444) {
        return class444.field2240;
    }

    private static void method9794() {
        Class6009.method23560();
    }

    private Boolean method9795() {
        int n2;
        if (this.field2233.method507() == Class573.field2803) {
            if (((Boolean)Class444.method9889(this).method507()).booleanValue()) {
                Class5836.method22885();
                return null;
            }
            n2 = (int)field2259[4];
        } else {
            n2 = (int)field2259[0];
        }
        return n2 != 0;
    }

    private static void method9796(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method9797(Class444 class444) {
        return class444.field2250;
    }

    private static void method9798() {
        Class1807.method15744();
    }

    private Boolean method9799() {
        return (!this.method9755() && (Boolean)this.field2244.method507() != false ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9800(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_746 method9801(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method9802(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9803() {
        Class3979.method19561();
    }

    public static Class248 method9804(Class444 class444) {
        return class444.field2240;
    }

    public static class_1268 method9805() {
        return class_1268.field_5808;
    }

    private static void method9806() {
        Class6009.method23561();
    }

    private static void method9807(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method9808() {
        Class1503.method14420();
    }

    public static void method9809(class_744 class_7442, float f2) {
        class_7442.field_3907 = f2;
    }

    private static void method9810(Class3978 class3978, float f2) {
        class3978.method19512(f2);
    }

    public boolean method9811() {
        return (Boolean)Class444.method9919(this).method507();
    }

    private static int method9812(int n2, int n3, Class707 class707, Class1661 class1661) {
        return Class6017.method23707(n2, n3, class707, class1661);
    }

    public static class_746 method9813(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method9814(Class148 a2) {
        if (((Boolean)this.field2252.method507()).booleanValue()) {
            if (a2.method292() == Class444.field290.field_1724) {
                a2.method10();
            }
        }
    }

    private static void method9815() {
        Class6009.method23561();
    }

    private static Object method9816(Class248 class248) {
        return class248.method507();
    }

    private static void method9817(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method9818(Class444 class444, float f2) {
        class444.field2261 = f2;
    }

    private static void method9819() {
        Class1745.method15538();
    }

    public static void method9820(Class444 class444, boolean bl2) {
        class444.field2241 = bl2;
    }

    private static void method9821() {
        Class6009.method23560();
    }

    private static boolean method9822(Class924 class924, Number number) {
        return class924.method12595(number);
    }

    public static Class924 method9823(Class444 class444) {
        return class444.field2253;
    }

    private static void method9824(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9825() {
        Class1807.method15744();
    }

    private static void method9826(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static int method9827(int n2, int n3, Class535 class535, Class3935 class3935) {
        return Class6017.method23696(n2, n3, class535, class3935);
    }

    public static Class760 method9828() {
        return Class5723.field11049;
    }

    private static void method9829() {
        Class5836.method22890();
    }

    private Boolean method9830() {
        return (!this.method9755() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9831() {
        Class4146.method20697();
    }

    public static int method9832(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    private static void method9833(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_636 method9834(class_310 class_3102) {
        return Class444.method9914(class_3102);
    }

    private static void method9835() {
        Class4146.method20694();
    }

    public Class444() {
        super("ElytraFly", "Allows you to fly freely using an elytra", Class556.field2752, (int)field2259[2]);
        this.field2231 = new Class924();
        this.field2247 = new Class926();
        this.field2233 = this.method450(new Class260("Mode", "The mode for elytra flight", Class573.field2805, Class573.values()));
        this.field2230 = this.method450(new Class252("Speed", "The horizontal flight speed", (Number)Float.valueOf(Class3988.field9119), (Number)Float.valueOf(2.5f), (Number)Float.valueOf(10.0f), this::method1269));
        this.field2242 = this.method450(new Class253("AntiCollide", "Prevent head collision", (boolean)field2259[0]));
        this.field2239 = this.method450(new Class253("NoMove", "Prevent move check", (boolean)field2259[0], this::method1278));
        this.field2252 = this.method450(new Class253("NoAnimation", "No elytra fly animation", (boolean)field2259[0]));
        this.field2254 = this.method450(new Class253("SneakingFix", "Fix the sneaking bug", (boolean)field2259[4]));
        this.field2236 = this.method450(new Class253("SwapAlternative", "Uses inventory swap for swapping", (boolean)field2259[0]));
        this.field2240 = this.method450(new Class253("Freeze", "Freeze when you not moving", (boolean)field2259[0], this::method9905));
        this.field2263 = this.method450(new Class260("FreezeMode", "Freeze mode", Class552.field2735, Class552.values(), this::method9871));
        this.field2237 = this.method450(new Class253("NoRotation", "No rotation when you freeze", (boolean)field2259[4], this::method9931));
        this.field2258 = this.method450(new Class253("Packet", "Uses packet to fly", (boolean)field2259[0]));
        this.field2255 = this.method450(new Class253("GrimV3", "Bypass the packet elytra fly on 2b2t.org", (boolean)field2259[0], this::method9904));
        this.field2234 = this.method450(new Class252("GrimDelay", "", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(5.0f), (Number)Float.valueOf(Class644.field3142), this::method9682));
        this.field2235 = this.method450(new Class253("AutoJump", "Auto jump when you on ground", (boolean)field2259[0], this::method9770));
        this.field2273 = this.method450(new Class253("AutoFly", "Auto start flying", (boolean)field2259[0], this::method9721));
        this.field2256 = this.method450(new Class253("Fireworks", "Uses fireworks when flying", (boolean)field2259[0], this::method9830));
        this.field2260 = this.method450(new Class252("Delay", "Delay to use fireworks in ticks", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class1435.field5482), (Number)Float.valueOf(40.0f), Class619.field3013, this::method9939));
        this.field2244 = this.method450(new Class253("Rotate", "Rotates the player when moving", (boolean)field2259[0], this::method9745));
        this.field2265 = this.method450(new Class252("RotateHold", "Rotates hold ticks", (Number)((int)field2259[0]), (Number)((int)field2259[0]), (Number)((int)field2259[1]), this::method9799));
        this.field2250 = this.method450(new Class253("Pitch40", "Infinite fly", (boolean)field2259[0], this::method9795));
        this.field2271 = this.method450(new Class252("Pitch40MaxSpeed", "", (Number)Float.valueOf(50.0f), (Number)Float.valueOf(150.0f), (Number)Float.valueOf(170.0f), this::method9719));
        this.field2257 = this.method450(new Class252("Pitch40MinSpeed", "", (Number)Float.valueOf(10.0f), (Number)Float.valueOf(25.0f), (Number)Float.valueOf(70.0f), this::method9890));
        this.field2251 = this.method450(new Class252("Pitch40Height", "", (Number)Float.valueOf(Class6037.field12104), (Number)Float.valueOf(200.0f), (Number)Float.valueOf(500.0f), this::method9758));
        this.field2272 = this.method450(new Class253("LagLimit", "Pause the fly when you get lagback", (boolean)field2259[4], this::method9755));
        this.field2264 = this.method450(new Class253("Boost", "Motion y boost exploit", (boolean)field2259[0], this::method9755));
        this.field2238 = this.method450(new Class253("1.21+", "Super fast", (boolean)field2259[0], this::method9733));
        this.field2270 = this.method450(new Class252("MinBps", "Min bps to active 1.21+ mode", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), (Number)Float.valueOf(200.0f), this::method9840));
        this.field2245 = this.method450(new Class252("MaxBps", "Max bounce speed", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(140.0f), (Number)Float.valueOf(300.0f), this::method9861));
        this.field2262 = this.method450(new Class252("Pitch", "The pitch angle of bounce", (Number)Float.valueOf(-90.0f), (Number)Float.valueOf(Class3862.field8788), (Number)Float.valueOf(90.0f), this::method9755));
        this.field2268 = new Class253("ObstaclePasser", "Passes obstacles and resets fly using Baritone", this.method9755());
        this.field2249 = (int)field2259[3];
        INSTANCE = this;
        if (Class3979.method19539()) {
            this.method450(this.field2268);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9836(Class59 d2) {
        if (!((Boolean)Class444.method9684(this).method507()).booleanValue() || this.field2263.method507() != Class552.field2736) return;
        int a2 = Class444.method9907(Class444.field290.field_1690).method_1434() || Class444.field290.field_1690.field_1881.method_1434() || Class444.field290.field_1690.field_1913.method_1434() || Class444.field290.field_1690.field_1849.method_1434() ? (int)field2259[4] : (int)field2259[0];
        boolean b2 = Class444.method9858(Class444.field290.field_1690).method_1434();
        boolean c2 = Class444.method9711((class_310)Class444.field290).field_1832.method_1434();
        if (a2 == 0 && !b2 && !c2 && !Class444.method9903(Class444.method9729())) return;
        if (!Class444.method9918(this)) {
            int n2 = 53201;
            Class444.method9912(0.02011472f, 0.6796315f, 0.35953587f, Class955.field4001, 0.34468746f, 0.15700811f);
            return;
        }
        int n3 = 53200;
        block4: while (true) {
            switch (n3) {
                case 53201: {
                    n3 = 53199;
                    continue block4;
                }
                case 53200: {
                    Class5723.field11047.method19512(1.0f);
                    this.field2266 = (int)field2259[0];
                    return;
                }
            }
            break;
        }
    }

    public static Class248 method9837(Class444 class444) {
        return class444.field2242;
    }

    private static void method9838(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method9839() {
        return Class376.method4987();
    }

    private Boolean method9840() {
        return (this.method9755() && ((Boolean)Class444.method9780(Class444.method9938(this))).booleanValue() && ((Boolean)Class444.method9728(this).method507()).booleanValue() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static boolean method9841() {
        return Class408.method6431();
    }

    private static void method9842() {
        Class1745.method15538();
    }

    private static Object method9843(Class248 class248) {
        return class248.method507();
    }

    public static Class924 method9844(Class444 class444) {
        return class444.field2253;
    }

    private static void method9845() {
        Class1503.method14420();
    }

    public static int method9846(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    private static void method9847(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method9848(Class444 class444) {
        return class444.field2255;
    }

    private static Class248 method9849(Class444 class444) {
        return Class444.method9867(class444);
    }

    public static Class248 method9850(Class444 class444) {
        return class444.field2244;
    }

    private static void method9851(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method9852(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class3850 method9853() {
        return Class444.method9888();
    }

    private static boolean method9854(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method9855() {
        Class6009.method23561();
    }

    private static void method9856(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method9857() {
        Class5659.method22184();
    }

    public static class_304 method9858(class_315 class_3152) {
        return class_3152.field_1903;
    }

    public static class_746 method9859(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9860() {
        Class5836.method22897();
    }

    private Boolean method9861() {
        return (this.method9755() && (Boolean)this.field2264.method507() != false ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    public static class_315 method9862(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method9863(long l2) {
        Class444.field2259[4] = l2 ^ 0x5084BC5F95D0447FL;
        Class444.field2259[12] = l2 ^ 0x5084BC5F95D0447DL;
        Class444.field2259[6] = l2 ^ 0x5084BC5F95D04478L;
        Class444.field2259[1] = l2 ^ 0x5084BC5F95D0446AL;
        Class444.field2259[8] = l2 ^ 0x5084BC5F95D0445AL;
        Class444.field2259[13] = l2 ^ 0x5084BC5F95D0444CL;
        Class444.field2259[3] = l2 ^ 0xAF7B43A06A2FBB81L;
        Class444.field2259[5] = l2 ^ 0x5084BC5F95D04477L;
        Class444.field2259[7] = l2 ^ 0x5084BC5F95D04476L;
        Class444.field2259[9] = l2 ^ 0x5084BC5F95D057F3L;
        Class444.field2259[11] = l2 ^ 0x5084BC5F95D0443EL;
        Class444.field2259[2] = l2 ^ 0x5084BC5F95D04FC6L;
        Class444.field2259[10] = l2 ^ 0x5084BC5F95D043AEL;
        Class444.field2259[0] = l2 ^ 0x5084BC5F95D0447EL;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9864(Class204 c2) {
        if (Class444.method9928(this) != null && this.method9755() && ((Boolean)Class444.method9751(this.field2264)).booleanValue()) {
            int a2 = (Boolean)Class444.method9762(this.field2272) != false && !Class444.method9724().method14268(field2259[10]) ? (int)field2259[4] : (int)field2259[0];
            double b2 = Class444.field290.field_1724.method_19538().method_1020(this.field2243).method_18805(20.0, 0.0, 20.0).method_1033();
            if (Class444.field290.field_1724.method_24828() && Class444.field290.field_1724.method_5624() && b2 <= (double)((Float)this.field2245.method507()).floatValue()) {
                int n2 = a2 != 0 ? 25144 : 25143;
                block4: while (true) {
                    switch (n2) {
                        case 25144: {
                            n2 = 25142;
                            continue block4;
                        }
                        case 25143: {
                            if (b2 >= (double)((Float)this.field2270.method507()).floatValue() && ((Boolean)Class444.method9677(this).method507()).booleanValue()) {
                                c2.method391(0.0);
                                c2.method10();
                            }
                            Class444.field290.field_1724.method_18800(Class444.method9746(Class444.field290.field_1724.method_18798()), 0.0, Class444.field290.field_1724.method_18798().field_1350);
                            break block4;
                        }
                    }
                    break;
                }
            }
        }
        this.field2243 = Class444.field290.field_1724.method_19538();
        if (this.field2266) {
            Class5723.field11047.method19512(1.0f);
            this.field2266 = (int)field2259[0];
        }
        if (Class3979.method19539() && BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            return;
        }
        if (!this.field2232) return;
        this.field2232 = (int)field2259[0];
        if (this.field2263.method507() != Class552.field2736) {
            return;
        }
        Class444.method9810(Class5723.field11047, Class5880.field11626);
        this.field2266 = (int)field2259[4];
    }

    private static boolean method9865() {
        return Class447.method10322();
    }

    public boolean method9866() {
        return (this.field2269 || Class444.field290.field_1724.method_6128() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    public static Class248 method9867(Class444 class444) {
        return class444.field2263;
    }

    private static void method9868() {
        Class1807.method15744();
    }

    private static void method9869() {
        Class3979.method19561();
    }

    public static Class552 method9870() {
        return Class552.field2735;
    }

    private Boolean method9871() {
        return (!this.method9755() && ((Boolean)this.field2240.method507()).booleanValue() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static boolean method9872() {
        return Class3979.method19539();
    }

    private static void method9873() {
        Class6454.method24594();
    }

    private static Object method9874(Class248 class248) {
        return class248.method507();
    }

    private static void method9875(Class444 class444) {
        class444.method9679();
    }

    private static void method9876(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method9877() {
        Class4146.method20697();
    }

    private static void method9878(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method9879(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9880() {
        Class1745.method15538();
    }

    private static void method9881() {
        Class1807.method15744();
    }

    public static class_746 method9882(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Override
    public void method1274() {
        this.field2249 = (int)field2259[3];
        Class444.method9703(this, null);
        Class444.method9700(this, (boolean)field2259[0]);
    }

    private static boolean method9883(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method9884(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method9885() {
        Class5836.method22890();
    }

    private static void method9886(Class444 class444, int n2) {
        Class444.method9701(class444, n2);
    }

    public static class_1792 method9887() {
        return class_1802.field_8833;
    }

    public static Class3850 method9888() {
        return Class5723.field11058;
    }

    public static Class248 method9889(Class444 class444) {
        return class444.field2244;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method9890() {
        int n2;
        if (this.field2233.method507() == Class573.field2803 && !((Boolean)this.field2244.method507()).booleanValue() && ((Boolean)this.field2250.method507()).booleanValue()) {
            n2 = (int)field2259[4];
            return n2 != 0;
        }
        n2 = (int)field2259[0];
        return n2 != 0;
    }

    private Boolean method1269() {
        return (this.field2233.method507() == Class573.field2805 ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9891() {
        Class6009.method23560();
    }

    public static double method9892(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static int method9893(Class3850 class3850) {
        return class3850.method18969();
    }

    private static Class760 method9894() {
        return Class444.method9828();
    }

    private static void method9895() {
        Class1503.method14420();
    }

    public static class_6880 method9896() {
        return class_1294.field_5919;
    }

    private static void method9897() {
        Class4146.method20697();
    }

    private static void method9898() {
        Class5836.method22885();
    }

    private static void method9899(Class444 class444) {
        class444.method9788();
    }

    public static class_746 method9900(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public boolean method9901() {
        return (Boolean)this.field2255.method507();
    }

    private static void method9902(Class444 class444) {
        class444.method9714();
    }

    private static boolean method9903(Class423 class423) {
        return class423.method8226();
    }

    private Boolean method9904() {
        return (this.method9811() || this.method9755() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private Boolean method9905() {
        return (!this.method9755() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static int method9906(int n2, int n3, Class18 class18, Class5693 class5693) {
        return Class6017.method23680(n2, n3, class18, class5693);
    }

    public static class_304 method9907(class_315 class_3152) {
        return class_3152.field_1894;
    }

    private static void method9908(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method9909(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1(priority=-999)
    public void method9910(Class91 a2) {
        if (this.method9755()) {
            a2.method10();
        }
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)this.field2233.method507());
    }

    public static class_746 method9911(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9912(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private Boolean method1278() {
        return (this.field2233.method507() == Class573.field2803 ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static void method9913(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    public static class_636 method9914(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method9915() {
        Class5836.method22890();
    }

    private static void method9916() {
        Class5836.method22885();
    }

    private static void method9917() {
        Class5836.method22897();
    }

    private static boolean method9918(Class444 class444) {
        return Class444.method9926(class444);
    }

    public static Class248 method9919(Class444 class444) {
        return class444.field2258;
    }

    public static class_315 method9920(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method9921(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    public static class_315 method9922(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method9923(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static int method9924(Class444 class444) {
        return class444.field2249;
    }

    private static class_315 method9925(class_310 class_3102) {
        return Class444.method9862(class_3102);
    }

    public static boolean method9926(Class444 class444) {
        return class444.field2266;
    }

    private static Class423 method9927() {
        return Class423.method8246();
    }

    private static class_243 method9928(Class444 class444) {
        return Class444.method9941(class444);
    }

    private static void method9929(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method9930(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private Boolean method9931() {
        return (!this.method9755() && (Boolean)Class444.method9804(this).method507() != false ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    public static class_746 method9932(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9933(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method9934(Class444 class444) {
        return class444.method9755();
    }

    private static void method9935() {
        Class5836.method22897();
    }

    public static void method9936(Class444 class444, class_243 class_2432) {
        class444.field2243 = class_2432;
    }

    private static void method9937(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method9938(Class444 class444) {
        return class444.field2264;
    }

    private Boolean method9939() {
        return (!this.method9755() && ((Boolean)this.field2256.method507()).booleanValue() ? (int)field2259[4] : (int)field2259[0]) != 0;
    }

    private static class_2848.class_2849 method9940() {
        return Class444.method9699();
    }

    public static class_243 method9941(Class444 class444) {
        return class444.field2243;
    }

    @Class1
    public void method9942(Class62 a2) {
        if (Class444.field290.field_1724 == null || Class444.field290.field_1687 == null) {
            return;
        }
        if (Class3979.method19539() && BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            return;
        }
        if (this.field2232) {
            if (this.field2263.method507() == Class552.field2732) {
                this.field2232 = (int)field2259[0];
                if (Class444.method9822(this.field2253, (int)field2259[1])) {
                    Class444.method9671(Class444.method9823(this));
                } else {
                    a2.method10();
                }
                return;
            }
            if (Class444.method9849(this).method507() == Class444.method9870()) {
                this.field2232 = (int)field2259[0];
                a2.method10();
                return;
            }
        }
        if (this.field2233.method507() != Class573.field2805) {
            Class444.method9676();
            return;
        }
    }

    private static void method9943() {
        Class5659.method22184();
    }

    private static void method9944(Class444 class444) {
        class444.method9714();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

