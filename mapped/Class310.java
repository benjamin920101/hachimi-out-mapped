/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.projectile.TridentEntity
 *  net.minecraft.entity.projectile.WitherSkullEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import mapped.Class1;
import mapped.Class101;
import mapped.Class102;
import mapped.Class103;
import mapped.Class1108;
import mapped.Class111;
import mapped.Class113;
import mapped.Class116;
import mapped.Class137;
import mapped.Class145;
import mapped.Class1503;
import mapped.Class155;
import mapped.Class1599;
import mapped.Class1621;
import mapped.Class163;
import mapped.Class1659;
import mapped.Class169;
import mapped.Class172;
import mapped.Class173;
import mapped.Class174;
import mapped.Class176;
import mapped.Class1789;
import mapped.Class1807;
import mapped.Class185;
import mapped.Class199;
import mapped.Class210;
import mapped.Class231;
import mapped.Class232;
import mapped.Class234;
import mapped.Class235;
import mapped.Class236;
import mapped.Class238;
import mapped.Class239;
import mapped.Class24;
import mapped.Class240;
import mapped.Class248;
import mapped.Class253;
import mapped.Class258;
import mapped.Class26;
import mapped.Class260;
import mapped.Class278;
import mapped.Class29;
import mapped.Class298;
import mapped.Class330;
import mapped.Class361;
import mapped.Class38;
import mapped.Class3952;
import mapped.Class3979;
import mapped.Class403;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class540;
import mapped.Class543;
import mapped.Class545;
import mapped.Class556;
import mapped.Class559;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class691;
import mapped.Class714;
import mapped.Class807;
import mapped.Class83;
import mapped.Class88;
import mapped.Class9;
import mapped.Class92;
import mapped.Class96;
import mapped.Class99;
import net.hachimi.client.mixin.au;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class310
extends Class278 {
    Class248 field659;
    private static Class310 INSTANCE;
    Class248 field660;
    private static long[] field661;
    Class248 field662;
    Class248 field663;
    Class248 field664;
    Class248 field665;
    Class248 field666;
    Class248 field667;
    public Class248 field668;
    Class248 field669;
    Class248 field670;
    Class248 field671;
    Class248 field672;
    Class248 field673;
    Class248 field674;
    public Class248 field675;
    Class248 field676;
    Class248 field677;
    Class248 field678;
    Class248 field679;
    Class248 field680;
    Class248 field681;
    public Class248 field682;
    Class248 field683;
    Class248 field684;
    public Class248 field685;
    Class248 field686;
    Class248 field687;
    Class248 field688;
    Class248 field689;
    public Class248 field690 = this.method450(new Class260("Items", "Prevents dropped items from rendering", Class540.field2675, Class310.method2460()));
    Class248 field691;
    Class248 field692;
    Class248 field693;
    Class248 field694;
    Class248 field695;

    @Class1
    public void method2416(Class137 a2) {
        if (((Boolean)this.field676.method507()).booleanValue()) {
            a2.method10();
        }
    }

    @Class1
    public void method2417(Class99 a2) {
        if (((Boolean)this.field659.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2418() {
        Class6454.method24594();
    }

    @Class1
    public void method2419(Class172 a2) {
        if (((Boolean)this.field672.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2420() {
        Class4146.method20697();
    }

    private static void method2421(boolean bl2) {
        Class1108.method12918(bl2);
    }

    @Class1
    public void method2422(Class83 a2) {
        if (!((Boolean)Class310.method2491(this.field680)).booleanValue()) {
            Class310.method2506();
            return;
        }
        a2.method10();
    }

    @Class1
    public void method2423(Class26 a2) {
        if (((Boolean)this.field666.method507()).booleanValue()) {
            if (!((au)a2.method49()).hookWasShotByEntity()) {
                a2.method10();
            }
        }
    }

    public static Class248 method2424(Class310 class310) {
        return class310.field678;
    }

    private static void method2425() {
        Class6454.method24594();
    }

    @Class1
    public void method2426(Class102 a2) {
        if (((Boolean)this.field684.method507()).booleanValue()) {
            a2.method10();
        }
    }

    @Class1
    public void method2427(Class101 a2) {
        if (((Boolean)this.field679.method507()).booleanValue()) {
            int n2 = 15971;
            Class5659.method22184();
            return;
        }
        int n3 = 15972;
        Class1807.method15744();
    }

    private static void method2428(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2429() {
        Class5836.method22897();
    }

    public Class310() {
        super("NoRender", "Prevents certain game elements from rendering", Class556.field2759);
        this.field668 = this.method450(new Class253("CastShadow", "Make a layer of shadow under the texture", (boolean)field661[0], this::method1269));
        this.field682 = this.method450(new Class253("SidesOfItems", "Make the texture 3D", (boolean)field661[0], this::method1278));
        this.field675 = this.method450(new Class253("Ticks", "Entity ticks", (boolean)field661[0], this::method2431));
        this.field685 = this.method450(new Class253("Age", "Increase age", (boolean)field661[0], this::method2494));
        this.field664 = this.method450(new Class253("NoHurtCam", "Prevents the hurt camera shake effect from rendering", (boolean)field661[1]));
        this.field684 = this.method450(new Class253("Armor", "Prevents armor pieces from rendering", (boolean)field661[0]));
        this.field678 = this.method450(new Class253("ArmorTrim", "Prevents armor pieces from rendering", (boolean)field661[0]));
        this.field679 = this.method450(new Class253("ArmorGlint", "Prevents armor pieces from rendering", (boolean)field661[0]));
        this.field692 = this.method450(new Class253("Overlay-Fire", "Prevents the fire Hud overlay from rendering", (boolean)field661[1]));
        this.field689 = this.method450(new Class253("Overlay-Portal", "Prevents the portal Hud overlay from rendering", (boolean)field661[1]));
        this.field687 = this.method450(new Class253("Overlay-Water", "Prevents the water Hud overlay from rendering", (boolean)field661[1]));
        this.field677 = this.method450(new Class253("Overlay-Block", "Prevents the block Hud overlay from rendering", (boolean)field661[1]));
        this.field671 = this.method450(new Class253("Overlay-Spyglass", "Prevents the spyglass Hud overlay from rendering", (boolean)field661[0]));
        this.field670 = this.method450(new Class253("Overlay-Pumpkin", "Prevents the pumpkin Hud overlay from rendering", (boolean)field661[1]));
        this.field694 = this.method450(new Class253("Overlay-BossBar", "Prevents the boss bar Hud overlay from rendering", (boolean)field661[1]));
        this.field683 = this.method450(new Class253("Nausea", "Prevents nausea effect from rendering (includes portal effect)", (boolean)field661[0]));
        this.field680 = this.method450(new Class253("Blindness", "Prevents blindness effect from rendering", (boolean)field661[0]));
        this.field686 = this.method450(new Class253("Frostbite", "Prevents frostbite effect from rendering", (boolean)field661[0]));
        this.field688 = this.method450(new Class253("Skylight", "Prevents skylight from rendering", (boolean)field661[1]));
        this.field662 = this.method450(new Class253("WitherSkulls", "Prevents flying wither skulls from rendering", (boolean)field661[0]));
        this.field667 = this.method450(new Class253("ItemFrames", "Prevents items on item frames from rendering", (boolean)field661[0]));
        this.field659 = this.method450(new Class253("Tridents", "Prevents tridents from rendering", (boolean)field661[0]));
        this.field691 = this.method450(new Class253("Entities", "Prevents entities from rendering", (boolean)field661[0]));
        this.field663 = this.method450(new Class258("EntityList", "The render entity list", new class_1299[(int)field661[0]]));
        this.field681 = this.method450(new Class253("TileEntities", "Prevents special tile entity properties from rendering (i.e. enchantment table books or cutting table saws)", (boolean)field661[0]));
        this.field673 = this.method450(new Class253("SignText", "Prevents the text on signs from rendering", (boolean)field661[0]));
        this.field676 = this.method450(new Class253("FireEntities", "Prevents fire from rendering on entities", (boolean)field661[0]));
        this.field666 = this.method450(new Class253("Fireworks", "Prevents firework entities from rendering", (boolean)field661[1]));
        this.field674 = this.method450(new Class253("Totems", "Prevents totem pop overlay from rendering", (boolean)field661[0]));
        this.field665 = this.method450(new Class253("Bob", "Prevents items from bobbing when walking", (boolean)field661[0]));
        this.field660 = this.method450(new Class253("WorldBorder", "Prevents world border from rendering", (boolean)field661[0]));
        this.field695 = this.method450(new Class260("Fog", "Prevents fog from rendering in the world", Class545.field2700, Class545.values()));
        this.field672 = this.method450(new Class253("GuiToast", "Prevents advancements from rendering", (boolean)field661[1]));
        this.field693 = this.method450(new Class253("Scoreboard", "Disable rendering of the scoreboard", (boolean)field661[0]));
        this.field669 = this.method450(new Class253("TerrainScreen", "Prevents downloading terrain screen from rendering", (boolean)field661[0]));
        INSTANCE = this;
    }

    private static void method2430() {
        Class298.method1924();
    }

    private Boolean method2431() {
        return (Class310.method2495(this).method507() == Class540.field2677 ? (int)field661[1] : (int)field661[0]) != 0;
    }

    @Class1
    public void method2432(Class234 a2) {
        if (((Boolean)this.field694.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2433(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method2434(Class248 class248) {
        return class248.method507();
    }

    private static Object method2435(Class248 class248) {
        return class248.method507();
    }

    private static int method2436(int n2, int n3, Class691 class691, Class1621 class1621) {
        return Class3952.method19438(n2, n3, class691, class1621);
    }

    private static void method2437() {
        Class1807.method15744();
    }

    private static int method2438(int n2, int n3, Class559 class559, Class1789 class1789) {
        return Class3952.method19442(n2, n3, class559, class1789);
    }

    @Class1
    public void method2439(Class236 a2) {
        if (((Boolean)this.field687.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2440() {
        Class5836.method22885();
    }

    @Class1
    public void method2441(Class38 a2) {
        if (((Boolean)Class310.method2470(this.field666)).booleanValue()) {
            a2.method10();
        }
    }

    private static boolean method2442(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method2443() {
        Class4146.method20694();
    }

    private static void method2444(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public boolean method2445(class_1297 a2) {
        return (((Boolean)this.field691.method507()).booleanValue() && ((List)this.field663.method507()).contains(a2.method_5864()) ? (int)field661[1] : (int)field661[0]) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2446(Class232 a2) {
        int n2 = (Boolean)Class310.method2476(this.field671) != false ? 15664 : 15665;
        block4: while (true) {
            switch (n2) {
                case 15665: {
                    n2 = 15663;
                    continue block4;
                }
                case 15664: {
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    @Class1
    public void method2447(Class24 a2) {
        if (((Boolean)this.field674.method507()).booleanValue() && a2.method48() == Class310.method2484()) {
            a2.method10();
        }
    }

    @Class1
    public void method2448(Class173 a2) {
        if (((Boolean)this.field662.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private Boolean method1269() {
        return (Class310.method2462(this).method507() == Class310.method2472() ? (int)field661[1] : (int)field661[0]) != 0;
    }

    @Class1
    public void method2449(Class96 a2) {
        if (((Boolean)Class310.method2487(Class310.method2467(this))).booleanValue()) {
            a2.method10();
        }
    }

    private static Object method2450(Class248 class248) {
        return class248.method507();
    }

    private static float method2451(Class155 class155) {
        return class155.method308();
    }

    private static void method2452(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method2453(int n2, int n3, Class169 class169, Class29 class29) {
        return Class3952.method19432(n2, n3, class169, class29);
    }

    private static void method2454(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method2455() {
        Class298.method1924();
    }

    @Class1
    public void method2456(Class163 a2) {
        if (((Boolean)this.field681.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private Boolean method1278() {
        return (this.field690.method507() == Class540.field2677 ? (int)field661[1] : (int)field661[0]) != 0;
    }

    private static Object method2457(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2458(Class116 a2) {
        if (((Boolean)Class310.method2435(this.field667)).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2459(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Class540[] method2460() {
        return Class540.values();
    }

    @Class1
    public void method2461(Class63 b2) {
        if (b2.method128() != Class543.field2690) {
            return;
        }
        if (((Boolean)Class310.method2515(this.field665)).booleanValue()) {
            Class310.field290.field_1724.field_5973 = 4.0f;
        }
        if (this.field690.method507() == Class540.field2676) {
            for (class_1297 a2 : Lists.newArrayList((Iterable)Class310.field290.field_1687.method_18112())) {
                if (!(a2 instanceof class_1542)) continue;
                Class310.field290.field_1687.method_2945(a2.method_5628(), class_1297.class_5529.field_26999);
            }
        }
        if (((Boolean)this.field669.method507()).booleanValue() && Class310.field290.field_1755 instanceof class_434 && !Class310.method2498(Class403.method6250())) {
            Class310.field290.field_1755 = null;
        }
    }

    public static Class248 method2462(Class310 class310) {
        return class310.field690;
    }

    @Class1
    public void method2463(Class92 a2) {
        if (this.method2445(a2.method181())) {
            a2.method10();
        }
    }

    private static class_1297 method2464(Class199 class199) {
        return class199.method375();
    }

    private static Object method2465(Class248 class248) {
        return class248.method507();
    }

    private static void method2466() {
        Class4146.method20694();
    }

    public static Class248 method2467(Class310 class310) {
        return class310.field664;
    }

    private static void method2468(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Class1
    public void method2469(Class239 a2) {
        if (((Boolean)this.field692.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static Object method2470(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2471(Class9 a2) {
        if (((Boolean)this.field660.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public static Class540 method2472() {
        return Class540.field2677;
    }

    @Class1
    public void method2473(Class174 a2) {
        if (((Boolean)this.field688.method507()).booleanValue()) {
            a2.method10();
        }
    }

    @Class1
    public void method2474(Class111 a2) {
        if (this.field690.method507() == Class540.field2673) {
            a2.method10();
        }
    }

    static {
        field661 = new long[2];
        Class310.method2489(7873973689308312179L);
    }

    private static void method2475(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method2476(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2477(Class145 a2) {
        if (((Boolean)this.field693.method507()).booleanValue()) {
            a2.method10();
        }
    }

    @Class1
    public void method2478(Class88 a2) {
        if (((Boolean)this.field683.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2479(Class155 class155, float f2) {
        class155.method309(f2);
    }

    private static int method2480(int n2, int n3, Class361 class361, Class113 class113) {
        return Class3952.method19458(n2, n3, class361, class113);
    }

    public static Class310 method2481() {
        return INSTANCE;
    }

    private static void method2482() {
        Class1503.method14420();
    }

    @Class1
    public void method2483(Class238 a2) {
        if (!((Boolean)this.field670.method507()).booleanValue()) {
            Class6454.method24594();
            return;
        }
        a2.method10();
    }

    public static class_1792 method2484() {
        return class_1802.field_8288;
    }

    @Class1
    public void method2485(Class185 a2) {
        if (((Boolean)Class310.method2513(this.field673)).booleanValue()) {
            a2.method10();
        }
    }

    private static boolean method2486(int n2) {
        return Class4196.method20803(n2);
    }

    private static Object method2487(Class248 class248) {
        return class248.method507();
    }

    private static int method2488(int n2, int n3, Class807 class807, Class176 class176) {
        return Class3952.method19461(n2, n3, class807, class176);
    }

    private static void method2489(long l2) {
        Class310.method2511(l2);
    }

    private static int method2490(int n2, int n3, Class714 class714, Class210 class210) {
        return Class3952.method19439(n2, n3, class714, class210);
    }

    private static Object method2491(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2492(Class231 a2) {
        if (((Boolean)this.field689.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2493() {
        Class4146.method20697();
    }

    private Boolean method2494() {
        if (Class310.method2457(this.field690) == Class540.field2677) {
            int n2 = (int)field661[1];
            Class4146.method20697();
            return null;
        }
        return (boolean)field661[0];
    }

    public static Class248 method2495(Class310 class310) {
        return class310.field690;
    }

    private static void method2496() {
        Class3979.method19561();
    }

    private static void method2497() {
        Class1503.method14420();
    }

    private static boolean method2498(Class403 class403) {
        return class403.method6231();
    }

    @Class1
    public void method2499(Class235 a2) {
        if (((Boolean)this.field686.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2500(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method2501(Class310 class310, class_1297 class_12972) {
        return class310.method2445(class_12972);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2502(Class199 a) {
        block9: {
            block10: {
                block8: {
                    block7: {
                        if (a.method375() instanceof class_1685) {
                            v0 = 27806;
                            while (true) {
                                // Infinite loop
                            }
                        }
                        v1 = 27807;
                        if (true) ** GOTO lbl10
                        do {
                            v1 = var2_2 = 27805;
lbl10:
                            // 2 sources

                            if (var2_2 == 27806) break block7;
                        } while (var2_2 == 27807);
                        break block8;
                    }
                    if (!((Boolean)this.field659.method507()).booleanValue()) break block8;
                    a.method10();
                    break block9;
                }
                if (!(a.method375() instanceof class_1542) || this.field690.method507() != Class540.field2673 && this.field690.method507() != Class540.field2676 && (!((Boolean)Class310.method2450(this.field675)).booleanValue() || this.field690.method507() != Class540.field2677)) break block10;
                a.method10();
                break block9;
            }
            if (!(Class310.method2464(a) instanceof class_1687)) ** GOTO lbl-1000
            if (((Boolean)Class310.method2434(this.field662)).booleanValue()) {
                a.method10();
            } else if (Class310.method2501(this, a.method375())) {
                a.method10();
            }
        }
        if (a.method11() && ((Boolean)this.field685.method507()).booleanValue()) {
            a.method375().field_6012 += (int)Class310.field661[1];
        }
    }

    public static Class248 method2503(Class310 class310) {
        return class310.field677;
    }

    @Class1
    public void method2504(Class103 a2) {
        if (((Boolean)Class310.method2424(this).method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static boolean method2505() {
        return Class3979.method19551();
    }

    private static void method2506() {
        Class1503.method14420();
    }

    private static void method2507(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=-2147483648)
    public void method2508(Class155 a2) {
        if (Class310.method2465(this.field695) == Class545.field2701 && Class310.field290.field_1724 != null && Class310.field290.field_1724.method_5777(class_3486.field_15518)) {
            a2.method10();
            a2.method305(a2.method308() * 4.0f);
            Class310.method2479(a2, Class310.method2451(a2) * 4.25f);
            return;
        }
        if (this.field695.method507() != Class545.field2699) {
            int n2 = 61382;
            Class3979.method19561();
            return;
        }
        int n3 = 61381;
        block4: while (true) {
            switch (n3) {
                case 61382: {
                    n3 = 61380;
                    continue block4;
                }
                case 61381: {
                    a2.method10();
                    a2.method305(a2.method308() * Class1599.field5987);
                    a2.method309(a2.method308() * 4.25f);
                    return;
                }
            }
            break;
        }
    }

    @Class1
    public void method2509(Class240 a2) {
        if (((Boolean)Class310.method2503(this).method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method2510(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2511(long l2) {
        Class310.field661[0] = l2 ^ 0x6D45F95A31FE7273L;
        Class310.field661[1] = l2 ^ 0x6D45F95A31FE7272L;
    }

    private static void method2512(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method2513(Class248 class248) {
        return class248.method507();
    }

    private static int method2514(int n2, int n3, Class330 class330, Class1659 class1659) {
        return Class3952.method19435(n2, n3, class330, class1659);
    }

    private static Object method2515(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

