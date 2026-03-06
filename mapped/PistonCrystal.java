/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.FacingBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.PistonBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.piston.PistonBehavior
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import mapped.Class1;
import mapped.Class1012;
import mapped.Class1108;
import mapped.Class1184;
import mapped.Class12;
import mapped.Class1215;
import mapped.Class1366;
import mapped.Class1489;
import mapped.Class1503;
import mapped.Class159;
import mapped.Class1615;
import mapped.Class165;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class227;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Chams;
import mapped.AutoLog;
import mapped.Tooltips;
import mapped.Class3349;
import mapped.Class3392;
import mapped.Class3442;
import mapped.Class3493;
import mapped.Blink;
import mapped.Class3812;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class4022;
import mapped.Class4032;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class4124;
import mapped.Class414;
import mapped.Class4146;
import mapped.AutoCrystal;
import mapped.Class4196;
import mapped.Velocity;
import mapped.Class480;
import mapped.Class525;
import mapped.Class5449;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5905;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6315;
import mapped.Class664;
import mapped.Class67;
import mapped.Class678;
import mapped.Class8;
import mapped.Class803;
import mapped.Class829;
import mapped.Class85;
import mapped.Class924;
import mapped.Class926;
import mapped.Class927;
import mapped.Class942;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.FacingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PistonCrystal
extends Class414 {
    Class248 field1793;
    private static long[] field1794;
    Class248 field1795;
    Class248 field1796;
    Class248 field1797;
    private static final class_238 field1798;
    int[] field1799;
    private static final HashMap field1800;
    private final List field1801 = new ArrayList();
    Class248 field1802;
    Class248 field1803;
    Class248 field1804;
    Class248 field1805;
    class_2382[] field1806;
    int[] field1807;
    private class_1297 field1808;
    Class248 field1809;
    Class248 field1810;
    Class248 field1811;
    private static PistonCrystal INSTANCE;
    Class248 field1812;
    Class248 field1813;
    Class248 field1814;
    private final Class924 field1815 = new Class924();
    Class248 field1816;
    Class248 field1817;
    Class248 field1818;
    Class248 field1819 = this.method450(new Class252("MinDamage", "Minimum damage required to consider attacking or placing an end crystal", Float.valueOf(0.0f), Float.valueOf(Class3349.field7245), Float.valueOf(36.0f)));
    Class248 field1820;
    List field1821;
    Class248 field1822;
    public static boolean $skidonion$890409021;

    public static Class248 method7936(PistonCrystal class421) {
        return class421.field1814;
    }

    public static class_2350 method7937(Class3442 class3442) {
        return class3442.field7520;
    }

    private static boolean method7938(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public static class_2248 method7939() {
        return class_2246.field_10036;
    }

    private static void method7940(float f2) {
        Class5836.method22907(f2);
    }

    private static void method7941(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static HashMap method7942() {
        return field1800;
    }

    public static class_2350 method7943(Class3442 class3442) {
        return class3442.field7520;
    }

    private static void method7944(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class248 method7945(PistonCrystal class421) {
        return class421.field1802;
    }

    private static void method7946(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class248 method7947(PistonCrystal class421) {
        return class421.field1804;
    }

    private static Object method7948(Class248 class248) {
        return class248.method507();
    }

    private static int method7949(int n2, int n3, Class85 class85, Class3392 class3392) {
        return Class4124.method20638(n2, n3, class85, class3392);
    }

    private static HashMap method7950() {
        return PistonCrystal.method8021();
    }

    private static class_243 method7951(PistonCrystal class421, class_243 class_2432) {
        return class421.method7977(class_2432);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method7952(Class210 p) {
        block26: {
            block27: {
                if (!((Boolean)this.field1536.method507()).booleanValue() && this.method6626()) {
                    this.field1808 = null;
                    return;
                }
                if (!Blink.method4987()) break block27;
                v0 = 40613;
                ** GOTO lbl12
            }
            v0 = 40614;
            if (true) ** GOTO lbl12
            block4: while (true) {
                v0 = 40612;
lbl12:
                // 3 sources

                switch (v0) {
                    case 40614: {
                        continue block4;
                    }
                    case 40613: {
                        PistonCrystal.method8066(this, null);
                        return;
                    }
                }
                break;
            }
            PistonCrystal.method7954(this.field1801, (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method8014(net.minecraft.entity.Entity ), (Lnet/minecraft/class_1297;)Z)((PistonCrystal)this), (Class525)PistonCrystal.method8029(this).method507(), (int)PistonCrystal.field1794[1]);
            if (this.field1801.isEmpty()) {
                this.field1808 = null;
                return;
            }
            q = new Class3812(class_1802.field_8301, (Class607)this.field1804.method507()).method18502();
            if (!q.method18523()) {
                this.field1808 = null;
                return;
            }
            this.field1808 = (class_1297)this.field1801.getFirst();
            PistonCrystal.method8001(this).clear();
            for (class_2338 d : this.method8026(this.field1808.method_19538())) {
                block31: {
                    block24: {
                        block32: {
                            block30: {
                                block29: {
                                    block23: {
                                        block28: {
                                            if (PistonCrystal.field290.field_1724.method_33571().method_1022(this.method7977(d.method_61082())) > (Double)this.field1813.method507()) continue;
                                            v1 = PistonCrystal.field290.field_1724;
                                            v2 = d.method_61082();
                                            v3 = (Boolean)this.field1793.method507();
                                            if (!((Boolean)this.field1803.method507()).booleanValue()) break block28;
                                            v4 = 37632;
                                            ** GOTO lbl41
                                        }
                                        v4 = 37633;
                                        if (true) ** GOTO lbl41
                                        do {
                                            v4 = var5_5 = 37631;
lbl41:
                                            // 3 sources

                                            if (var5_5 == 37632) break block23;
                                        } while (var5_5 == 37633);
                                        break block29;
                                    }
                                    v5 = (Integer)this.field1817.method507();
                                    break block30;
                                }
                                v5 = (int)PistonCrystal.field1794[0];
                            }
                            if ((b = this.method7990(a = Class5905.method23285((class_1297)v1, v2, v3, v5, (boolean)PistonCrystal.field1794[0]))) || (c = Class5905.method23285(PistonCrystal.method7983(this), d.method_61082(), (Boolean)this.field1793.method507(), (Integer)this.field1817.method507(), (Boolean)this.field1820.method507())) < (double)((Float)this.field1819.method507()).floatValue()) continue;
                            if (!AutoCrystal.method7217().method1265()) break block31;
                            if (!PistonCrystal.method8007(this, d.method_10074())) break block32;
                            v6 = 26910;
                            ** GOTO lbl60
                        }
                        v6 = 26911;
                        if (true) ** GOTO lbl60
                        do {
                            v6 = var11_9 = 26909;
lbl60:
                            // 3 sources

                            if (var11_9 == 26910) break block24;
                        } while (var11_9 == 26911);
                        break block31;
                    }
                    return;
                }
                this.field1821.add(new Class664(d, c));
            }
            this.field1821.sort(Comparator.comparingDouble((ToDoubleFunction<Class664>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method11496(), (Lmapped/Class664;)D)()).reversed());
            var3_3 = this.field1821.iterator();
            while (true) {
                block25: {
                    block33: {
                        if (!var3_3.hasNext()) break block33;
                        v7 = 39454;
                        ** GOTO lbl80
                    }
                    v7 = 39455;
                    if (true) ** GOTO lbl80
                    do {
                        v7 = var12_10 = 39453;
lbl80:
                        // 3 sources

                        if (var12_10 == 39454) break block25;
                    } while (var12_10 == 39455);
                    break block26;
                }
                i = (Class664)var3_3.next();
                h = this.method8098(new class_238(PistonCrystal.method7996(i)));
                if (h == null || (f = this.method7990(e = Class5905.method23285((class_1297)PistonCrystal.field290.field_1724, h.method_19538(), (Boolean)PistonCrystal.method8041(PistonCrystal.method7956(this)), (Boolean)this.field1803.method507() != false ? (Integer)this.field1817.method507() : (int)PistonCrystal.field1794[0], (boolean)PistonCrystal.field1794[0]))) || (g = Class5905.method23285(this.field1808, h.method_19538(), (Boolean)this.field1793.method507(), (Integer)PistonCrystal.method7966(this.field1817), (Boolean)this.field1820.method507())) < (double)((Float)this.field1819.method507()).floatValue()) continue;
                if (this.method8065(h, (Double)this.field1813.method507(), (Boolean)this.field1796.method507())) break;
            }
            return;
        }
        if (PistonCrystal.method7979(this).method12595((Number)this.field1805.method507())) {
            var3_3 = this.field1821.iterator();
            if (var3_3.hasNext()) {
                o = (Class664)var3_3.next();
                var13_11 = Class5449.field10187;
                var19_16 = var13_11.length;
                var8_7 = (int)PistonCrystal.field1794[0];
                while (true) {
                    if (var8_7 >= var19_16) {
                        Class1668.method15147(-2017524012, 1165409207, -544826178, 998048431);
                        return;
                    }
                    n = var13_11[var8_7];
                    if (PistonCrystal.method8012(this, o.method11497().method_10074().method_10093(n))) {
                        var20_17 = this.field1806;
                        var21_18 = var20_17.length;
                        for (var22_19 = (int)PistonCrystal.field1794[0]; var22_19 < var21_18; ++var22_19) {
                            m = var20_17[var22_19];
                            var24_21 = this.field1807;
                            var25_22 = var24_21.length;
                            for (var26_23 = (int)PistonCrystal.field1794[0]; var26_23 < var25_22; ++var26_23) {
                                l = var24_21[var26_23];
                                var28_25 = this.field1799;
                                var29_26 = var28_25.length;
                                for (var30_27 = (int)PistonCrystal.field1794[0]; var30_27 < var29_26; ++var30_27) {
                                    k = var28_25[var30_27];
                                    if (k != (int)PistonCrystal.field1794[1]) {
                                        Class6009.method23559(true);
                                        return;
                                    }
                                    if (l == 0) continue;
                                    if (!this.method8011(o.method11497().method_10081(m).method_10079(n, k).method_10069(n.method_10165() * l, (int)PistonCrystal.field1794[0], n.method_10148() * l), n.method_10153(), (Boolean)this.field1818.method507())) {
                                        Class3979.method19561();
                                        return;
                                    }
                                    j = PistonCrystal.method8028().method18969();
                                    q.method18531(j);
                                    Class1745.method15651(o.method11497().method_10074().method_10093(n), (Boolean)this.field1796.method507());
                                    PistonCrystal.method8097(q, j);
                                    PistonCrystal.method7978(this).method12593();
                                    return;
                                }
                            }
                        }
                    }
                    ++var8_7;
                }
            }
        }
    }

    private static Object method7953(Class248 class248) {
        return class248.method507();
    }

    private static void method7954(List list, Predicate predicate, Class525 class525, int n2) {
        Class3493.method17601(list, predicate, class525, n2);
    }

    static {
        ___.___(14, PistonCrystal.class);
        ____.___14_220(PistonCrystal.class);
    }

    private static boolean method7955(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static Class248 method7956(PistonCrystal class421) {
        return class421.field1793;
    }

    private static void method7957() {
        Class6009.method23561();
    }

    private static int method7958(int n2, int n3, AutoLog class311, Tooltips class318) {
        return Class4124.method20650(n2, n3, class311, class318);
    }

    public static Class248 method7959(PistonCrystal class421) {
        return class421.field1816;
    }

    public static Class248 method7960(PistonCrystal class421) {
        return class421.field1802;
    }

    private static boolean method7961() {
        return Class5659.method22111();
    }

    private static boolean method7962(PistonCrystal class421, class_2338 class_23382) {
        return class421.method8061(class_23382);
    }

    private static boolean method7963(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static class_746 method7964(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method7965(int n2, int n3, Class829 class829, Class12 class12) {
        return Class4124.method20632(n2, n3, class829, class12);
    }

    private static Object method7966(Class248 class248) {
        return class248.method507();
    }

    private static Object method7967(Class248 class248) {
        return class248.method507();
    }

    private static class_2350 method7968(Class3442 class3442) {
        return PistonCrystal.method8015(class3442);
    }

    private boolean method7969(class_2338 b2) {
        CopyOnWriteArrayList c2 = new CopyOnWriteArrayList(PistonCrystal.method8045(field290).method_8335(null, new class_238(b2)));
        Iterator iterator = c2.iterator();
        if (iterator.hasNext()) {
            class_1297 a2 = (class_1297)iterator.next();
            if (!a2.method_5805()) {
                while (true) {
                    // Infinite loop
                }
            }
            return (int)field1794[0] != 0;
        }
        return (int)field1794[1] != 0;
    }

    private static void method7970(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method7971() {
        return Class1807.method15753();
    }

    public static List method7972(PistonCrystal class421) {
        return class421.field1801;
    }

    private static void method7973(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method7974() {
        return Class3979.method19539();
    }

    private static boolean method7975() {
        return Class5659.method22111();
    }

    private static boolean method7976() {
        return Class1807.method15753();
    }

    private class_243 method7977(class_243 a2) {
        class_238 b2 = PistonCrystal.method8080().method_997(a2);
        return Class5449.method21096(PistonCrystal.method7964(field290).method_33571(), b2);
    }

    public static Class924 method7978(PistonCrystal class421) {
        return class421.field1815;
    }

    public static Class924 method7979(PistonCrystal class421) {
        return class421.field1815;
    }

    private static boolean method7980() {
        return Velocity.method10252();
    }

    private static Object method7981(Class248 class248) {
        return class248.method507();
    }

    public static Class480 method7982() {
        return Class1745.field6556;
    }

    public static class_1297 method7983(PistonCrystal class421) {
        return class421.field1808;
    }

    private static class_2350 method7984(Class3442 class3442) {
        return PistonCrystal.method8088(class3442);
    }

    private static boolean method7985() {
        return Class5659.method22111();
    }

    private static boolean method7986() {
        return Class3979.method19543();
    }

    private static boolean method7987(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method7988() {
        Class5659.method22184();
    }

    List method7989(class_238 a2) {
        return PistonCrystal.field290.field_1687.method_8333(null, a2, PistonCrystal::method8076);
    }

    private boolean method7990(double b2) {
        if (!PistonCrystal.field290.field_1724.method_7337()) {
            float a2 = PistonCrystal.method8079(field290).method_6032() + PistonCrystal.method8042(field290).method_6067();
            if (((Boolean)this.field1812.method507()).booleanValue() && b2 >= (double)(a2 - 0.5f)) {
                return (int)field1794[1] != 0;
            }
            return (b2 > (double)((Float)PistonCrystal.method7981(this.field1809)).floatValue() ? (int)field1794[1] : (int)field1794[0]) != 0;
        }
        return (int)field1794[0] != 0;
    }

    public static Class248 method7991(PistonCrystal class421) {
        return class421.field1822;
    }

    private static Object method7992(Class248 class248) {
        return class248.method507();
    }

    public static class_2350 method7993(Class3442 class3442) {
        return class3442.field7520;
    }

    private static HashMap method7994() {
        return PistonCrystal.method7942();
    }

    private void method7995(class_2350 a2) {
        class_2350 b2 = a2.method_10153();
        if (b2 == class_2350.field_11034) {
            Class1503.method14417(Class678.field3260, 5.0f);
            Class1108.method12918(true);
            return;
        }
        if (b2 == class_2350.field_11039) {
            Class1503.method14417(90.0f, 5.0f);
        } else if (b2 == class_2350.field_11043) {
            Class1503.method14417(180.0f, 5.0f);
        } else if (b2 == PistonCrystal.method8072()) {
            Class1503.method14417(0.0f, 5.0f);
        }
    }

    private static class_2338 method7996(Class664 class664) {
        return class664.method11497();
    }

    private static void method7997(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method7998(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method7999() {
        return Class3979.method19543();
    }

    private static int method8000(int n2, int n3, Class1615 class1615, Class942 class942) {
        return Class4124.method20628(n2, n3, class1615, class942);
    }

    public static List method8001(PistonCrystal class421) {
        return class421.field1821;
    }

    private static boolean method8002() {
        return Class3979.method19543();
    }

    public static class_2248 method8003() {
        return class_2246.field_10540;
    }

    private static boolean method8004() {
        return Class3979.method19539();
    }

    private static Class480 method8005() {
        return PistonCrystal.method7982();
    }

    private static boolean method8006() {
        return Class5836.method22894();
    }

    private static boolean method8007(PistonCrystal class421, class_2338 class_23382) {
        return class421.method8092(class_23382);
    }

    @Override
    public String method1248() {
        if (this.field1808 != null) {
            return this.field1808.method_5477().getString();
        }
        return super.method1248();
    }

    private static void method8008(Class926 class926) {
        class926.method12593();
    }

    public static void method8009(PistonCrystal class421, class_1297 class_12972) {
        class421.field1808 = class_12972;
    }

    public static PistonCrystal method8010() {
        return INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method8011(class_2338 j2, class_2350 k2, boolean l2) {
        int q2;
        int p2;
        class_2680 n2;
        int n3;
        if (PistonCrystal.field290.field_1687.method_8320(j2.method_10093(k2)).method_26223() != class_3619.field_15971 && !PistonCrystal.method8073(field290).method_22347(j2.method_10093(k2))) {
            return (int)field1794[0] != 0;
        }
        int m2 = (int)field1794[0];
        class_2350[] class_2350Array = Class5449.field10190;
        int n4 = class_2350Array.length;
        for (n3 = (int)field1794[0]; n3 < n4; ++n3) {
            class_2248 a2;
            class_2350 b2 = class_2350Array[n3];
            if (b2 == k2 || (a2 = PistonCrystal.field290.field_1687.method_8320(j2.method_10093(b2)).method_26204()) != class_2246.field_10002 && a2 != class_2246.field_10523) continue;
            m2 = (int)field1794[1];
            break;
        }
        if ((n2 = PistonCrystal.field290.field_1687.method_8320(j2)).method_26204() instanceof class_2665) {
            Class3442 c2;
            if (m2 != 0) return (int)field1794[0] != 0;
            if (n2.method_11654((class_2769)class_2318.field_10927) != k2) {
                return (int)field1794[0] != 0;
            }
            int b2 = (int)field1794[0];
            class_2350[] class_2350Array2 = Class5449.field10190;
            n3 = class_2350Array2.length;
            if (b2 >= n3) return (int)field1794[0] != 0;
            class_2350 d2 = class_2350Array2[b2];
            if (d2 != k2 && (c2 = new Class3442(j2.method_10093(d2), class_1802.field_8793, (boolean)((Boolean)this.field1814.method507()), (Class607)((Object)this.field1804.method507()))).method17369((Double)PistonCrystal.method7945(this).method507(), (Boolean)PistonCrystal.method8085(this.field1796), l2, (Double)this.field1813.method507())) {
                return (int)field1794[1] != 0;
            }
            ++b2;
            return Class3979.method19543();
        }
        if (((Boolean)PistonCrystal.method7991(this).method507()).booleanValue()) {
            class_2350 e2 = Class5449.method21106(j2, (class_1309)PistonCrystal.field290.field_1724);
            if (e2 == class_2350.field_11036) return (int)field1794[0] != 0;
            if (e2 == class_2350.field_11033) {
                return (int)field1794[0] != 0;
            }
        }
        Class3442 o2 = new Class3442(j2, PistonCrystal::method8039, (boolean)((Boolean)this.field1814.method507()), (Class607)((Object)PistonCrystal.method7947(this).method507()));
        o2.method17405((Double)PistonCrystal.method8034(this).method507(), l2);
        int n5 = p2 = o2.field7531 && o2.field7521 && (l2 || PistonCrystal.method8053(o2)) && o2.field7516.method18523() ? (int)field1794[1] : (int)field1794[0];
        if (p2 == 0) {
            return (int)field1794[0] != 0;
        }
        int n6 = q2 = o2.field7523 != null || o2.field7520 != null ? (int)field1794[1] : (int)field1794[0];
        if (m2 != 0 && q2 != 0) {
            if (((Boolean)this.field1796.method507()).booleanValue()) {
                if (o2.field7520 != null) {
                    Class1503.method14412(j2.method_10093(o2.field7520), PistonCrystal.method7937(o2).method_10153());
                } else {
                    Class1503.method14412(j2, o2.field7523);
                }
            }
            PistonCrystal.method8082(this, k2);
            o2.method17369((Double)this.field1802.method507(), (boolean)field1794[0], l2, (Double)PistonCrystal.method7967(this.field1813));
            if ((Boolean)PistonCrystal.method8101(this.field1796) == false) return (int)field1794[1] != 0;
            if (PistonCrystal.method8058(o2) != null) {
                Class1503.method14412(j2.method_10093(PistonCrystal.method8017(o2)), o2.field7520.method_10153());
                return (int)field1794[1] != 0;
            }
            if (o2.field7523 == null) return (int)field1794[1] != 0;
            Class1503.method14412(j2, o2.field7523);
            return (int)field1794[1] != 0;
        }
        Class3442 r2 = null;
        class_2350[] c2 = Class5449.field10190;
        int n7 = c2.length;
        for (int i2 = (int)field1794[0]; i2 < n7; ++i2) {
            class_2350 h2 = c2[i2];
            if (h2 == k2) continue;
            Class3442 f2 = new Class3442(j2.method_10093(h2), PistonCrystal.method8051(), (boolean)((Boolean)PistonCrystal.method7936(this).method507()), (Class607)((Object)this.field1804.method507()));
            boolean g2 = f2.method17405((Double)this.field1802.method507(), l2);
            if (g2) {
                if (q2 == 0 && !Class1745.method15547(j2, h2)) continue;
                r2 = f2;
                break;
            }
            if (!PistonCrystal.method8102(f2) || !f2.field7521 || !l2 && !f2.field7526 || !PistonCrystal.method8018(f2).method18523() || !Class1745.method15547(f2.field7518, h2.method_10153()) || q2 == 0) continue;
            r2 = f2;
            break;
        }
        if (r2 == null) return (int)field1794[0] != 0;
        if (q2 == 0) {
            r2.method17369((Double)PistonCrystal.method8063(this.field1802), (Boolean)PistonCrystal.method7953(this.field1796), l2, (Double)this.field1813.method507());
            boolean i3 = o2.method17405((Double)PistonCrystal.method7960(this).method507(), l2);
            if (!i3) return (int)field1794[1] != 0;
            if (((Boolean)PistonCrystal.method7992(this.field1796)).booleanValue()) {
                if (o2.field7520 != null) {
                    Class1503.method14412(j2.method_10093(o2.field7520), PistonCrystal.method7943(o2).method_10153());
                } else if (o2.field7523 != null) {
                    PistonCrystal.method8083(j2, o2.field7523);
                }
            }
            this.method7995(k2);
            o2.method17483((boolean)field1794[0], l2, (Double)this.field1813.method507());
            if ((Boolean)this.field1796.method507() == false) return (int)field1794[1] != 0;
            if (PistonCrystal.method7984(o2) != null) {
                Class1503.method14412(j2.method_10093(o2.field7520), o2.field7520.method_10153());
                return (int)field1794[1] != 0;
            }
            if (o2.field7523 == null) return (int)field1794[1] != 0;
            PistonCrystal.method8040(j2, o2.field7523);
            return (int)field1794[1] != 0;
        }
        if (((Boolean)this.field1796.method507()).booleanValue()) {
            if (o2.field7520 != null) {
                PistonCrystal.method8054(j2.method_10093(o2.field7520), o2.field7520.method_10153());
            } else {
                Class1503.method14412(j2, o2.field7523);
            }
        }
        this.method7995(k2);
        o2.method17483((boolean)field1794[0], l2, (Double)PistonCrystal.method8027(PistonCrystal.method8024(this)));
        if (((Boolean)this.field1796.method507()).booleanValue()) {
            if (o2.field7520 != null) {
                Class1503.method14412(j2.method_10093(o2.field7520), PistonCrystal.method7968(o2).method_10153());
                return PistonCrystal.method7938(0.7320076826532381, 0.34948638191000514);
            }
            Class1503.method14412(j2, o2.field7523);
        }
        r2.method17369((Double)PistonCrystal.method7948(this.field1802), (Boolean)this.field1796.method507(), l2, (Double)this.field1813.method507());
        return (int)field1794[1] != 0;
    }

    private static boolean method8012(PistonCrystal class421, class_2338 class_23382) {
        return class421.method8092(class_23382);
    }

    private static boolean method8013() {
        return Class3979.method19543();
    }

    /*
     * Unable to fully structure code
     */
    private boolean method8014(class_1297 b) {
        block2: {
            block1: {
                block3: {
                    if (!(b instanceof class_1657)) break block2;
                    a = (class_1657)b;
                    if (b.equals((Object)PistonCrystal.field290.field_1724)) break block1;
                    if (!b.equals((Object)PistonCrystal.field290.field_1719)) break block3;
                    v0 = 29328;
                    ** GOTO lbl12
                }
                v0 = 29329;
                if (true) ** GOTO lbl12
                do {
                    v0 = var3_3 = 29327;
lbl12:
                    // 3 sources

                    if (var3_3 == 29328) break block1;
                } while (var3_3 == 29329);
                return Class5659.method22111();
            }
            return (boolean)((int)PistonCrystal.field1794[0]);
        }
        return (boolean)((int)PistonCrystal.field1794[0]);
    }

    public static class_2350 method8015(Class3442 class3442) {
        return class3442.field7520;
    }

    private static void method8016(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static class_2350 method8017(Class3442 class3442) {
        return PistonCrystal.method7993(class3442);
    }

    public static Class3812 method8018(Class3442 class3442) {
        return class3442.field7516;
    }

    private static boolean method8019() {
        return Velocity.method10322();
    }

    private boolean method8020(class_2338 a2) {
        if (!this.method8089(a2.method_10084().method_61082())) {
            return (int)field1794[0] != 0;
        }
        class_2350 b2 = Class1745.method15561(a2, (Double)this.field1802.method507());
        return (b2 != null ? (int)field1794[1] : (int)field1794[0]) != 0;
    }

    public static HashMap method8021() {
        return field1800;
    }

    private static boolean method8022(int n2) {
        return Class4196.method20803(n2);
    }

    public static HashMap method8023() {
        return field1800;
    }

    public static Class248 method8024(PistonCrystal class421) {
        return class421.field1813;
    }

    private static HashMap method8025() {
        return PistonCrystal.method8023();
    }

    private List method8026(class_243 a2) {
        return Class5449.method21083(new class_238(a2.method_10216() - 2.0, a2.method_10214() - 1.0, a2.method_10215() - Class1489.field5627, a2.method_10216() + Class927.field3925, a2.method_10214() + 3.0, a2.method_10215() + 2.0));
    }

    private static Object method8027(Class248 class248) {
        return class248.method507();
    }

    public static Class3850 method8028() {
        return Class5723.field11058;
    }

    public static Class248 method8029(PistonCrystal class421) {
        return class421.field1811;
    }

    private static Object method8030(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8031() {
        return Class3979.method19551();
    }

    private static void method8032() {
        Class5659.method22184();
    }

    private static boolean method8033() {
        return Class5659.method22194();
    }

    public static Class248 method8034(PistonCrystal class421) {
        return class421.field1802;
    }

    private static void method8035() {
        Class5836.method22890();
    }

    private static boolean method8036() {
        return Class3979.method19539();
    }

    private static void method8037(long l2) {
        PistonCrystal.field1794[4] = l2 ^ 0x2431A9136BE8A0B3L;
        PistonCrystal.field1794[6] = l2 ^ 0x2431A9136BE8A0A5L;
        PistonCrystal.field1794[3] = l2 ^ 0x2431A9136BE8A0B2L;
        PistonCrystal.field1794[0] = l2 ^ 0x2431A9136BE8A0B1L;
        PistonCrystal.field1794[1] = l2 ^ 0x2431A9136BE8A0B0L;
        PistonCrystal.field1794[2] = l2 ^ 0x2431A9136BE8A0BBL;
        PistonCrystal.field1794[5] = l2 ^ 0xDBCE56EC94175F4EL;
    }

    private static Class525[] method8038() {
        return Class525.values();
    }

    private static boolean method8039(class_1799 c2) {
        class_1747 b2;
        class_1792 a2 = c2.method_7909();
        return (a2 instanceof class_1747 && (b2 = (class_1747)a2).method_7711() instanceof class_2665 ? (int)field1794[1] : (int)field1794[0]) != 0;
    }

    private static void method8040(class_2338 class_23382, class_2350 class_23502) {
        Class1503.method14412(class_23382, class_23502);
    }

    private static Object method8041(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method8042(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method8043(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static class_2248 method8044() {
        return PistonCrystal.method8003();
    }

    public static class_638 method8045(class_310 class_3102) {
        return class_3102.field_1687;
    }

    @Class1
    public void method8046(Class165 a2) {
        if (!(PistonCrystal.method8090(a2) instanceof class_1511) || !((Boolean)this.field1810.method507()).booleanValue()) {
            return;
        }
        PistonCrystal.method7950().put(a2.method322(), a2.method322().method_24515());
    }

    private static void method8047(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method8048(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method8049() {
        return Replenish.method6431();
    }

    private static boolean method8050(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static class_1792 method8051() {
        return class_1802.field_8793;
    }

    private static boolean method8052() {
        return Class4196.method20801();
    }

    public static boolean method8053(Class3442 class3442) {
        return class3442.field7526;
    }

    private static void method8054(class_2338 class_23382, class_2350 class_23502) {
        Class1503.method14412(class_23382, class_23502);
    }

    private static int method8055(int n2, int n3, Class8 class8, Class227 class227) {
        return Class4124.method20626(n2, n3, class8, class227);
    }

    private static void method8056() {
        Class5659.method22184();
    }

    private static int method8057(int n2, int n3, Class67 class67, Class159 class159) {
        return Class4124.method20635(n2, n3, class67, class159);
    }

    public PistonCrystal() {
        super("PistonCrystal", "Using a piston to push the crystal to damage player", Class556.field2758);
        this.field1809 = this.method450(new Class252("MaxLocalDamage", "The maximum player damage", Float.valueOf(4.0f), Float.valueOf(12.0f), Float.valueOf(20.0f)));
        this.field1805 = this.method450(new Class252("Delay", "Delay between place", (int)field1794[0], (int)field1794[4], (int)field1794[6]));
        this.field1816 = this.method450(new Class252("AttackWait", "Delay attack", (int)field1794[0], (int)field1794[4], (int)field1794[6]));
        this.field1822 = this.method450(new Class253("1.12", "Use 1.12 placement", (boolean)field1794[0]));
        this.field1795 = this.method450(new Class252("TargetRange", "Range of target", Float.valueOf(0.0f), Float.valueOf(6.0f), Float.valueOf(12.0f)));
        this.field1811 = this.method450(new Class260("Sort", "How to filter targets within range", Class525.field2605, PistonCrystal.method8038()));
        this.field1797 = this.method450(new Class253("InAirTarget", "Regard people in the air as targets", (boolean)field1794[1]));
        this.field1796 = this.method450(new Class253("Rotate", "Rotate before placing and breaking", (boolean)field1794[1]));
        this.field1810 = this.method450(new Class253("Grim", "Grim hitbox check is fucking bad", (boolean)field1794[0]));
        this.field1818 = this.method450(new Class253("BreakCrystal", "Break crystal before place", (boolean)field1794[0]));
        this.field1802 = this.method450(new Class252("PlaceRange", "Interact block reach", 0.0, 4.5, 8.0));
        this.field1813 = this.method450(new Class252("BreakRange", "Break crystal reach", 0.0, Class1184.field4696, Class1366.field5267));
        this.field1804 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1814 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1794[0]));
        this.field1812 = this.method450(new Class253("Safety", "Accounts for total player safety when attacking and placing crystals", (boolean)field1794[1]));
        this.field1793 = this.method450(new Class253("BlockDestruction", "Accounts for explosion block destruction when calculating damages", (boolean)field1794[0]));
        this.field1803 = this.method450(new Class253("SelfExtrapolate", "Accounts for motion when calculating self damage", (boolean)field1794[0]));
        this.field1817 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating enemy positions, not fully accurate.", (int)field1794[0], (int)field1794[0], (int)field1794[2]));
        this.field1820 = this.method450(new Class253("AssumeBestArmor", "Assumes Prot 0 armor is max armor", (boolean)field1794[0]));
        class_2382[] class_2382Array = new class_2382[(int)field1794[4]];
        class_2382Array[(int)PistonCrystal.field1794[0]] = new class_2382((int)field1794[0], (int)field1794[0], (int)field1794[0]);
        class_2382Array[(int)PistonCrystal.field1794[1]] = new class_2382((int)field1794[0], (int)field1794[1], (int)field1794[0]);
        this.field1806 = class_2382Array;
        int[] nArray = new int[(int)field1794[3]];
        nArray[(int)PistonCrystal.field1794[0]] = (int)field1794[0];
        nArray[(int)PistonCrystal.field1794[1]] = (int)field1794[5];
        nArray[(int)PistonCrystal.field1794[4]] = (int)field1794[1];
        this.field1807 = nArray;
        int[] nArray2 = new int[(int)field1794[3]];
        nArray2[(int)PistonCrystal.field1794[0]] = (int)field1794[1];
        nArray2[(int)PistonCrystal.field1794[1]] = (int)field1794[4];
        nArray2[(int)PistonCrystal.field1794[4]] = (int)field1794[3];
        this.field1799 = nArray2;
        this.field1821 = new ArrayList();
        INSTANCE = this;
    }

    public static class_2350 method8058(Class3442 class3442) {
        return class3442.field7520;
    }

    private static void method8059() {
        Class6009.method23560();
    }

    private static void method8060(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public boolean method8061(class_2338 a2) {
        class_2338 b2 = a2.method_10084();
        class_2680 c2 = PistonCrystal.field290.field_1687.method_8320(b2);
        if (((Boolean)PistonCrystal.method8091(this).method507()).booleanValue()) {
            if (!PistonCrystal.field290.field_1687.method_22347(b2.method_10084())) {
                return (int)field1794[0] != 0;
            }
        }
        if (!PistonCrystal.field290.field_1687.method_22347(b2) && !c2.method_27852(PistonCrystal.method7939())) {
            return (int)field1794[0] != 0;
        }
        return (this.method7969(a2.method_10084()) && this.method7969(a2.method_10086((int)field1794[4])) ? (int)field1794[1] : (int)field1794[0]) != 0;
    }

    private static void method8062() {
        Class4146.method20694();
    }

    private static Object method8063(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8064() {
        return Class1807.method15742();
    }

    public boolean method8065(class_1297 b2, double c2, boolean d2) {
        class_238 e2 = b2.method_5829();
        if (PistonCrystal.method7994().containsKey(b2)) {
            e2 = field1798.method_997(((class_2338)field1800.get(b2)).method_61082());
        }
        class_243 f2 = Class5449.method21103(e2);
        if (PistonCrystal.field290.field_1724.method_33571().method_1022(f2) > c2) {
            return (int)field1794[0] != 0;
        }
        if (Class5723.field11056.method14262()) {
            return Class5659.method22188(0.06396763629206492, Class1012.field4187, 0.3745390995667688, 0.523838235220857);
        }
        return (int)field1794[1] != 0;
    }

    public static void method8066(PistonCrystal class421, class_1297 class_12972) {
        class421.field1808 = class_12972;
    }

    private static void method8067() {
        Class5836.method22890();
    }

    private static boolean method8068(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method8069(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method8070() {
        return Class5659.method22194();
    }

    private static boolean method8071() {
        return Class5836.method22894();
    }

    public static class_2350 method8072() {
        return class_2350.field_11035;
    }

    public static class_638 method8073(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method8074() {
        Class1503.method14420();
    }

    private static boolean method8075(int n2) {
        return Class4196.method20803(n2);
    }

    private static native boolean method8076(class_1297 var0);

    private static boolean method8077(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method8078() {
        Chams.method1924();
    }

    public static class_746 method8079(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_238 method8080() {
        return field1798;
    }

    private static int method8081(int n2, int n3, Class4032 class4032, Class6315 class6315) {
        return Class4124.method20580(n2, n3, class4032, class6315);
    }

    private static void method8082(PistonCrystal class421, class_2350 class_23502) {
        class421.method7995(class_23502);
    }

    private static void method8083(class_2338 class_23382, class_2350 class_23502) {
        Class1503.method14412(class_23382, class_23502);
    }

    private static boolean method8084(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static Object method8085(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8086() {
        return Velocity.method10252();
    }

    private static boolean method8087() {
        return Class3979.method19551();
    }

    public static class_2350 method8088(Class3442 class3442) {
        return class3442.field7520;
    }

    @Override
    public void method1279() {
        PistonCrystal.method8025().clear();
        PistonCrystal.method8009(this, null);
        PistonCrystal.method7972(this).clear();
    }

    private boolean method8089(class_243 a2) {
        class_243 b2 = PistonCrystal.method7951(this, a2);
        double c2 = PistonCrystal.field290.field_1724.method_33571().method_1022(b2);
        return (c2 <= (Double)PistonCrystal.method8030(this.field1813) ? (int)field1794[1] : (int)field1794[0]) != 0;
    }

    private static class_1297 method8090(Class165 class165) {
        return class165.method322();
    }

    public static Class248 method8091(PistonCrystal class421) {
        return class421.field1822;
    }

    public boolean method8092(class_2338 a2) {
        class_2680 b2 = PistonCrystal.field290.field_1687.method_8320(a2);
        if (!b2.method_27852(PistonCrystal.method8044()) && !b2.method_27852(class_2246.field_9987)) {
            return (int)field1794[0] != 0;
        }
        if (!PistonCrystal.method7962(this, a2)) {
            return Class5659.method22229(Class4022.field9264, 0.19412362489150592, 0.8329569580489534, 0.8897028429897001);
        }
        return (this.method8020(a2) ? (int)field1794[1] : (int)field1794[0]) != 0;
    }

    private static Class248 method8093(PistonCrystal class421) {
        return PistonCrystal.method7959(class421);
    }

    private static boolean method8094() {
        return Class3979.method19544();
    }

    private static boolean method8095() {
        return Class5659.method22111();
    }

    private static boolean method8096(Class5478 class5478, class_1657 class_16572) {
        return class5478.method21261(class_16572);
    }

    private static void method8097(Class3812 class3812, int n2) {
        class3812.method18534(n2);
    }

    class_1297 method8098(class_238 b2) {
        List c2 = this.method7989(b2);
        Iterator iterator = c2.iterator();
        if (iterator.hasNext()) {
            class_1297 a2 = (class_1297)iterator.next();
            if (!a2.method_31481() && a2.field_23807) {
                return a2;
            }
            Class5836.method22907(0.5518446f);
            return null;
        }
        return null;
    }

    private static void method8099() {
        Class5836.method22890();
    }

    private static void method8100() {
        Class4146.method20697();
    }

    private static Object method8101(Class248 class248) {
        return class248.method507();
    }

    public static boolean method8102(Class3442 class3442) {
        return class3442.field7531;
    }

    private static boolean method8103(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static native Object 1(char var0);
}

