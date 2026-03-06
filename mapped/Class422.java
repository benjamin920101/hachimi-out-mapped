/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.FacingBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.text.Text
 *  net.minecraft.block.PistonBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.piston.PistonBehavior
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1103;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1275;
import mapped.Class1341;
import mapped.Class1503;
import mapped.Class1510;
import mapped.Class154;
import mapped.Class1612;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class23;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class2618;
import mapped.Class298;
import mapped.Class325;
import mapped.Class3442;
import mapped.Class3649;
import mapped.Class3657;
import mapped.Class3731;
import mapped.Class376;
import mapped.Class3812;
import mapped.Class3816;
import mapped.Class3979;
import mapped.Class4002;
import mapped.Class408;
import mapped.Class4095;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class425;
import mapped.Class5449;
import mapped.Class5478;
import mapped.Class5553;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5690;
import mapped.Class5723;
import mapped.Class578;
import mapped.Class5835;
import mapped.Class5836;
import mapped.Class5870;
import mapped.Class5899;
import mapped.Class5945;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6108;
import mapped.Class6199;
import mapped.Class624;
import mapped.Class6253;
import mapped.Class6306;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class745;
import mapped.Class803;
import mapped.Class924;
import mapped.Class936;
import mapped.Class949;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.AbstractClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class422
extends Class414 {
    Class924 field1823;
    Class248 field1824;
    Class248 field1825;
    Class248 field1826;
    Class248 field1827;
    private final class_243[] field1828;
    Class248 field1829;
    private static long[] field1830 = new long[6];
    Class248 field1831;
    Class248 field1832;
    Class248 field1833;
    Class248 field1834;
    Class248 field1835;
    Class248 field1836;
    Class248 field1837;
    Class248 field1838;

    private static boolean method8104() {
        return Class1807.method15769();
    }

    public static Class248 method8105(Class422 class422) {
        return class422.field1824;
    }

    private static void method8106(Class924 class924) {
        class924.method12593();
    }

    private static Object method8107(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8108(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method8109(Class3442 class3442, double d2, boolean bl2) {
        return class3442.method17405(d2, bl2);
    }

    private static int method8110(int n2, int n3, Class578 class578, Class425 class425) {
        return Class3816.method18646(n2, n3, class578, class425);
    }

    private static boolean method8111(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method8112(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method8113(Class422 class422) {
        return class422.field1827;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method8114(class_1799 c2) {
        int n2;
        class_1747 b2;
        class_1792 a2 = c2.method_7909();
        if (a2 instanceof class_1747 && (b2 = (class_1747)a2).method_7711() instanceof class_2665) {
            n2 = (int)field1830[0];
            return n2 != 0;
        }
        n2 = (int)field1830[4];
        return n2 != 0;
    }

    private static void method8115() {
        Class1745.method15538();
    }

    private static class_2350.class_2351 method8116() {
        return Class422.method8129();
    }

    public static Class248 method8117(Class422 class422) {
        return class422.field1829;
    }

    private static boolean method8118(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static void method8119() {
        Class6009.method23561();
    }

    private static boolean method8120(class_1297 class_12972, class_238 class_2383) {
        return Class1215.method13246(class_12972, class_2383);
    }

    public static class_638 method8121(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method8122() {
        Class5836.method22890();
    }

    public static class_2350 method8123(Class3442 class3442) {
        return class3442.field7520;
    }

    private static void method8124() {
        Class1807.method15744();
    }

    private static void method8125() {
        Class5659.method22184();
    }

    private static Object method8126(Class248 class248) {
        return class248.method507();
    }

    private static void method8127() {
        Class1503.method14420();
    }

    private static void method8128(class_2338 class_23382, class_2350 class_23502) {
        Class1503.method14412(class_23382, class_23502);
    }

    public static class_2350.class_2351 method8129() {
        return class_2350.class_2351.field_11051;
    }

    public static class_2350.class_2351 method8130() {
        return class_2350.class_2351.field_11048;
    }

    private static void method8131() {
        Class3979.method19561();
    }

    private static void method8132(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method8133(Class422 class422) {
        return class422.field1824;
    }

    private static void method8134() {
        Class6454.method24594();
    }

    private static Object method8135(Class248 class248) {
        return class248.method507();
    }

    private static Object method8136(Class248 class248) {
        return class248.method507();
    }

    private static void method8137(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method8138() {
        Class5836.method22897();
    }

    private static boolean method8139(Class924 class924, Number number) {
        return class924.method12595(number);
    }

    private static class_2350 method8140(Class3442 class3442) {
        return Class422.method8171(class3442);
    }

    private static Class3812 method8141(Class3442 class3442) {
        return Class422.method8205(class3442);
    }

    private static boolean method8142(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method8143() {
        return Class1807.method15742();
    }

    public static class_3619 method8144() {
        return class_3619.field_15971;
    }

    private static void method8145() {
        Class5659.method22184();
    }

    public static Class924 method8146(Class422 class422) {
        return class422.field1823;
    }

    public static class_2350 method8147(Class3442 class3442) {
        return class3442.field7523;
    }

    public static class_638 method8148(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method8149(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8150() {
        return Class5836.method22894();
    }

    public static Class924 method8151(Class422 class422) {
        return class422.field1823;
    }

    public static class_2350 method8152() {
        return class_2350.field_11035;
    }

    private void method8153(class_2350 a2) {
        class_2350 b2 = a2.method_10153();
        if (b2 == class_2350.field_11034) {
            Class1503.method14417(-90.0f, 5.0f);
        } else if (b2 == class_2350.field_11039) {
            Class1503.method14417(90.0f, 5.0f);
        } else if (b2 == class_2350.field_11043) {
            Class1503.method14417(Class5690.field10936, 5.0f);
        } else if (b2 == Class422.method8152()) {
            Class1503.method14417(0.0f, Class3649.field8165);
        }
    }

    private static void method8154() {
        Class6009.method23561();
    }

    private static void method8155() {
        Class3979.method19561();
    }

    private static void method8156() {
        Class4146.method20697();
    }

    public static Class248 method8157(Class422 class422) {
        return class422.field1836;
    }

    private static boolean method8158() {
        return Class4196.method20801();
    }

    private static void method8159() {
        Class6009.method23561();
    }

    private static boolean method8160(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method8161() {
        Class1745.method15538();
    }

    private static boolean method8162() {
        return Class1807.method15742();
    }

    private static int method8163(int n2, int n3, Class949 class949, Class154 class154) {
        return Class3816.method18690(n2, n3, class949, class154);
    }

    private static void method8164() {
        Class5836.method22885();
    }

    private static void method8165() {
        Class6009.method23561();
    }

    public static class_3619 method8166() {
        return class_3619.field_15971;
    }

    private static class_3619 method8167() {
        return Class422.method8144();
    }

    private static boolean method8168() {
        return Class408.method6431();
    }

    public static class_2350 method8169(Class3442 class3442) {
        return class3442.field7520;
    }

    public static class_638 method8170(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static class_2350 method8171(Class3442 class3442) {
        return class3442.field7520;
    }

    private static boolean method8172() {
        return Class3979.method19544();
    }

    private static void method8173() {
        Class1745.method15538();
    }

    public static class_2350 method8174(Class3442 class3442) {
        return class3442.field7520;
    }

    private static boolean method8175(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static Object method8176(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8177() {
        return Class376.method4987();
    }

    public static double method8178(class_243 class_2432) {
        return class_2432.field_1350;
    }

    public static Class248 method8179(Class422 class422) {
        return class422.field1831;
    }

    private static void method8180(long l2) {
        Class422.field1830[2] = l2 ^ 0xFD684E4A62BE6F18L;
        Class422.field1830[3] = l2 ^ 0xFD684E4A62BE6F08L;
        Class422.field1830[0] = l2 ^ 0xFD684E4A62BE6F0DL;
        Class422.field1830[5] = l2 ^ 0xFD684E4A62BE6F0FL;
        Class422.field1830[1] = l2 ^ 0xFD684E4A62BE6F0EL;
        Class422.field1830[4] = l2 ^ 0xFD684E4A62BE6F0CL;
    }

    private static void method8181() {
        Class5836.method22897();
    }

    public static class_2350 method8182(Class3442 class3442) {
        return class3442.field7523;
    }

    private static class_2350 method8183(Class3442 class3442) {
        return Class422.method8169(class3442);
    }

    private static void method8184(Class422 class422, class_2350 class_23502) {
        class422.method8153(class_23502);
    }

    private static boolean method8185() {
        return Class3979.method19551();
    }

    private static void method8186() {
        Class4146.method20697();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method8187(Class210 z) {
        block65: {
            if (!Class422.method8139(Class422.method8151(this), (Number)Class422.method8107(this.field1826))) {
                return;
            }
            if (!Class376.method4987()) break block65;
            v0 = 47652;
            ** GOTO lbl11
        }
        v0 = 47653;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v0 = 47651;
lbl11:
            // 3 sources

            switch (v0) {
                case 47653: {
                    continue block36;
                }
                case 47652: {
                    return;
                }
            }
            break;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && this.method6626()) {
            return;
        }
        block37: for (class_742 y : Class422.field290.field_1687.method_18456()) {
            block70: {
                block68: {
                    block69: {
                        block67: {
                            block66: {
                                if (y.method_31549().field_7477 || y == Class422.field290.field_1724) continue;
                                if (!y.method_5805() || Class422.method8207(Class5723.field11045, y.method_5477()) || y.method_5858((class_1297)Class422.field290.field_1724) > (double)(((Float)this.field1829.method507()).floatValue() * ((Float)Class422.method8117(this).method507()).floatValue())) continue;
                                if (!((Boolean)Class422.method8176(this.field1838)).booleanValue()) {
                                    if (!y.method_24828()) continue;
                                    Class6009.method23559(true);
                                    return;
                                }
                                if (!y.method_20448()) break block66;
                                v1 = 17530;
                                ** GOTO lbl33
                            }
                            v1 = 17531;
                            if (true) ** GOTO lbl33
                            block38: while (true) {
                                v1 = 17529;
lbl33:
                                // 3 sources

                                switch (v1) {
                                    case 17531: {
                                        continue block38;
                                    }
                                    case 17530: {
                                        continue block37;
                                    }
                                }
                                break;
                            }
                            x = Class1215.method13246((class_1297)y, y.method_5829().method_1011(Class2618.field6814));
                            if (!x) break block67;
                            v2 = 16135;
                            ** GOTO lbl47
                        }
                        v2 = 16136;
                        if (true) ** GOTO lbl47
                        block39: while (true) {
                            v2 = 16134;
lbl47:
                            // 3 sources

                            switch (v2) {
                                case 16136: {
                                    continue block39;
                                }
                                case 16135: {
                                    if (!((Boolean)this.field1833.method507()).booleanValue()) break block39;
                                    var5_5 = this.field1828;
                                    var6_6 = var5_5.length;
                                    for (var7_7 = (int)Class422.field1830[4]; var7_7 < var6_6; ++var7_7) {
                                        f = var5_5[var7_7];
                                        d = y.method_19538().method_1019(f);
                                        e = new class_2338.class_2339(d.field_1352, d.field_1351, d.field_1350);
                                        var11_11 = Class5449.field10187;
                                        var12_12 = var11_11.length;
                                        for (var13_13 = (int)Class422.field1830[4]; var13_13 < var12_12; ++var13_13) {
                                            c = var11_11[var13_13];
                                            v3 = a = c.method_10166() == class_2350.class_2351.field_11048 ? (double)e.method_10263() + Class1275.field4976 + (double)c.method_10148() * 0.8 : y.method_23317();
                                            if (c.method_10166() != class_2350.class_2351.field_11051) ** GOTO lbl66
                                            v4 = 17213;
                                            ** GOTO lbl70
lbl66:
                                            // 1 sources

                                            v4 = 17214;
                                            if (true) ** GOTO lbl70
                                            block42: while (true) {
                                                v4 = 17212;
lbl70:
                                                // 3 sources

                                                switch (v4) {
                                                    case 17214: {
                                                        continue block42;
                                                    }
                                                    case 17213: {
                                                        v5 = (double)e.method_10260() + Class5945.field11806 + (double)c.method_10165() * Class6199.field12608;
                                                        break block42;
                                                    }
                                                    default: {
                                                        v5 = b = y.method_23321();
                                                    }
                                                }
                                                break;
                                            }
                                            if (Class422.method8120((class_1297)Class422.field290.field_1724, new class_238(a - 0.3, y.method_23318(), b - 0.3, a + 0.3, y.method_23318() + Class5835.field11389, b + 0.3))) continue;
                                            if (this.method8219(e.method_10093(c.method_10153()), c, (Boolean)this.field1832.method507())) {
                                                this.field1823.method12593();
                                                return;
                                            }
                                            if (!Class422.method8193(this, e.method_10093(c.method_10153()).method_10084(), c, (Boolean)this.field1832.method507())) continue;
                                            Class422.method8106(Class422.method8216(this));
                                            return;
                                        }
                                    }
                                    break block39;
                                }
                            }
                            break;
                        }
                        if (!x || !((Boolean)this.field1833.method507()).booleanValue()) break block68;
                        if (!((Boolean)this.field1835.method507()).booleanValue()) break block69;
                        v6 = 30154;
                        ** GOTO lbl96
                    }
                    v6 = 30155;
                    if (true) ** GOTO lbl96
                    block43: while (true) {
                        v6 = 30153;
lbl96:
                        // 3 sources

                        switch (v6) {
                            case 30155: {
                                continue block43;
                            }
                            case 30154: {
                                var5_5 = this.field1828;
                                var6_6 = var5_5.length;
                                for (var7_7 = (int)Class422.field1830[4]; var7_7 < var6_6; ++var7_7) {
                                    q = var5_5[var7_7];
                                    o = y.method_19538().method_1019(q);
                                    p = new class_2338.class_2339(o.field_1352, o.field_1351, Class422.method8178(o));
                                    var11_11 = Class5449.field10187;
                                    var12_12 = var11_11.length;
                                    var13_13 = (int)Class422.field1830[4];
                                    if (var13_13 >= var12_12) continue;
                                    n = var11_11[var13_13];
                                    v7 = n.method_10166() == class_2350.class_2351.field_11048 ? (double)p.method_10263() + 0.5 + (double)n.method_10148() * 0.8 : (k = y.method_23317());
                                    if (n.method_10166() == class_2350.class_2351.field_11051) {
                                        v8 = (double)p.method_10260() + 0.5 + (double)n.method_10165() * Class3731.field8424;
                                        Class6454.method24636(0.25170704462237126, Class745.field3375, 0.5787085299577139, Class1341.field5183);
                                        return;
                                    }
                                    l = y.method_23321();
                                    m = new class_2338.class_2339(k, (double)p.method_10264(), l);
                                    if (!new class_238((class_2338)m).method_994(y.method_5829().method_1011(Class5553.field10510))) ** GOTO lbl177
                                    v9 = Class422.method8170(Class422.field290).method_8320((class_2338)m).method_26223() != class_3619.field_15971 ? 25889 : (var20_18 = 25890);
                                    if (var20_18 == 25889) ** GOTO lbl125
                                    if (var20_18 == 25890) {
                                        Class1108.method12918(false);
                                        return;
                                    }
                                    ** GOTO lbl-1000
lbl125:
                                    // 1 sources

                                    if (Class422.field290.field_1687.method_22347((class_2338)m) || Class422.method8148(Class422.field290).method_8320(m.method_10084()).method_26223() == Class422.method8166()) ** GOTO lbl-1000
                                    if (Class422.field290.field_1687.method_22347(m.method_10084())) ** GOTO lbl129
                                    v10 = 64593;
                                    ** GOTO lbl133
lbl129:
                                    // 1 sources

                                    v10 = 64594;
                                    if (true) ** GOTO lbl133
                                    block45: while (true) {
                                        v10 = 64592;
lbl133:
                                        // 3 sources

                                        switch (v10) {
                                            case 64594: {
                                                continue block45;
                                            }
                                            case 64593: {
                                                break block45;
                                            }
                                            default: lbl-1000:
                                            // 3 sources

                                            {
                                                j = (int)Class422.field1830[4];
                                                var22_20 = Class5449.field10187;
                                                var23_21 = var22_20.length;
                                                var24_22 = (int)Class422.field1830[4];
                                                block46: while (true) {
                                                    if (var24_22 >= var23_21) ** GOTO lbl147
                                                    v11 = 18422;
                                                    ** GOTO lbl151
lbl147:
                                                    // 1 sources

                                                    v11 = 18423;
                                                    if (true) ** GOTO lbl151
                                                    block47: while (true) {
                                                        v11 = 18421;
lbl151:
                                                        // 3 sources

                                                        switch (v11) {
                                                            case 18423: {
                                                                continue block47;
                                                            }
                                                            case 18422: {
                                                                i = var22_20[var24_22];
                                                                if (i != n.method_10153()) {
                                                                    if (i.method_10166() == class_2350.class_2351.field_11048) {
                                                                        v12 = (double)m.method_10263() + 0.5 + (double)i.method_10148() * Class4095.field9494;
                                                                        Class422.method8197(155032470, -703804282, 479160851, 2070605919);
                                                                        return;
                                                                    }
                                                                    g = k;
                                                                    v13 = h = i.method_10166() == class_2350.class_2351.field_11051 ? (double)m.method_10260() + Class1103.field4465 + (double)i.method_10165() * 0.8 : l;
                                                                    if (!Class1215.method13246((class_1297)Class422.field290.field_1724, new class_238(g - 0.3, y.method_23318(), h - 0.3, g + 0.3, y.method_23318() + Class6306.field12952, h + 0.3))) {
                                                                        j = (int)Class422.field1830[0];
                                                                        break block46;
                                                                    }
                                                                }
                                                                ++var24_22;
                                                                continue block46;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                if (j == 0) break block45;
                                                if (this.method8219(p.method_10093(n.method_10153()), n, (Boolean)this.field1832.method507())) {
                                                    this.field1823.method12593();
                                                    return;
                                                }
                                                if (!this.method8219(p.method_10093(n.method_10153()).method_10084(), n, (Boolean)Class422.method8149(this.field1832))) {
                                                    Class422.method8210();
                                                    return;
                                                }
                                                Class422.method8146(this).method12593();
                                                return;
                                            }
                                        }
                                        break;
                                    }
lbl177:
                                    // 3 sources

                                    ++var13_13;
                                    Class6009.method23561();
                                    return;
                                }
                                break block43;
                            }
                        }
                        break;
                    }
                }
                if (!x) break block70;
                v14 = 38974;
                ** GOTO lbl190
            }
            v14 = 38975;
            if (true) ** GOTO lbl190
            block48: while (true) {
                v14 = 38973;
lbl190:
                // 3 sources

                switch (v14) {
                    case 38975: {
                        continue block48;
                    }
                    case 38974: {
                        if (!((Boolean)this.field1825.method507()).booleanValue()) break block48;
                        var5_5 = this.field1828;
                        var6_6 = var5_5.length;
                        for (var7_7 = (int)Class422.field1830[4]; var7_7 < var6_6; ++var7_7) {
                            w = var5_5[var7_7];
                            u = y.method_19538().method_1019(w);
                            v = new class_2338.class_2339(u.field_1352, Class422.method8194(u), u.field_1350);
                            var11_11 = Class5449.field10187;
                            var12_12 = var11_11.length;
                            for (var13_13 = (int)Class422.field1830[4]; var13_13 < var12_12; ++var13_13) {
                                t = var11_11[var13_13];
                                if (t.method_10166() == Class422.method8130()) {
                                    v15 = 54724;
                                    Class1745.method15538();
                                    return;
                                }
                                v16 = 54725;
                                if (true) ** GOTO lbl213
                                block51: while (true) {
                                    v16 = 54723;
lbl213:
                                    // 2 sources

                                    switch (v16) {
                                        case 54725: {
                                            continue block51;
                                        }
                                        case 54724: {
                                            v17 = (double)v.method_10263() + 0.5 + (double)t.method_10148() * 0.8;
                                            break block51;
                                        }
                                        default: {
                                            v17 = r = y.method_23317();
                                        }
                                    }
                                    break;
                                }
                                v18 = t.method_10166() == Class422.method8116() ? (double)v.method_10260() + 0.5 + (double)t.method_10165() * 0.8 : (s = y.method_23321());
                                if (!new class_238((class_2338)new class_2338.class_2339(r, y.method_23318(), s)).method_994(y.method_5829().method_1011(0.07))) continue;
                                if (this.method8219(v.method_10093(t.method_10153()), t, (Boolean)this.field1832.method507())) {
                                    this.field1823.method12593();
                                    return;
                                }
                                if (!this.method8219(v.method_10093(t.method_10153()).method_10084(), t, (Boolean)this.field1832.method507())) continue;
                                this.field1823.method12593();
                                return;
                            }
                        }
                        break block48;
                    }
                }
                break;
            }
        }
    }

    public Class422() {
        super("PistonKick", "Use pistons to push enemies out of their comfort zone", Class556.field2758);
        class_243[] class_243Array = new class_243[(int)field1830[3]];
        class_243Array[(int)Class422.field1830[4]] = new class_243(0.3, 0.0, 0.3);
        class_243Array[(int)Class422.field1830[0]] = new class_243(0.3, 0.0, -0.3);
        class_243Array[(int)Class422.field1830[1]] = new class_243(-0.3, 0.0, 0.3);
        class_243Array[(int)Class422.field1830[5]] = new class_243(-0.3, 0.0, Class1510.field5696);
        this.field1828 = class_243Array;
        this.field1826 = this.method450(new Class252("Delay", "Delay between place", (int)field1830[4], (int)field1830[1], (int)field1830[2]));
        this.field1837 = this.method450(new Class253("1.12", "Use 1.12 placement", (boolean)field1830[4]));
        this.field1829 = this.method450(new Class252("TargetRange", "Range of target", Float.valueOf(0.0f), Float.valueOf(6.0f), Float.valueOf(12.0f)));
        this.field1838 = this.method450(new Class253("InAirTarget", "Regard people in the air as targets", (boolean)field1830[0]));
        this.field1824 = this.method450(new Class253("Rotate", "Rotate before placing and breaking", (boolean)field1830[0]));
        this.field1832 = this.method450(new Class253("BreakCrystal", "Break crystal before place", (boolean)field1830[4]));
        this.field1834 = this.method450(new Class252("PlaceRange", "Interact block reach", 0.0, 4.5, Class1612.field6027));
        this.field1836 = this.method450(new Class252("BreakRange", "Break crystal reach", 0.0, 3.0, 8.0));
        this.field1831 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1827 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1830[4]));
        this.field1833 = this.method450(new Class253("OutOfBlock", "Push the enemy out of the burrow", (boolean)field1830[0]));
        this.field1835 = this.method450(new Class253("Consecutive", "Allow multiple pushes", (boolean)field1830[0], this.field1833::method507));
        this.field1825 = this.method450(new Class253("Merge", "Push enemies from multiple squares into one square", (boolean)field1830[4]));
        this.field1823 = new Class924();
    }

    private static Object method8188(Class248 class248) {
        return class248.method507();
    }

    private static void method8189() {
        Class5659.method22184();
    }

    private static Object method8190(Class248 class248) {
        return class248.method507();
    }

    private static void method8191(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method8192(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method8193(Class422 class422, class_2338 class_23382, class_2350 class_23502, boolean bl2) {
        return class422.method8219(class_23382, class_23502, bl2);
    }

    public static double method8194(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method8195(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method8196(int n2, int n3, Class325 class325, Class23 class23) {
        return Class3816.method18654(n2, n3, class325, class23);
    }

    private static void method8197(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method8198(Class3442 class3442, double d2, boolean bl2, boolean bl3, double d3) {
        return class3442.method17369(d2, bl2, bl3, d3);
    }

    public static Class248 method8199(Class422 class422) {
        return class422.field1834;
    }

    private static void method8200(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method8201() {
        return Class1807.method15769();
    }

    private static boolean method8202() {
        return Class376.method4987();
    }

    public static Class248 method8203(Class422 class422) {
        return class422.field1824;
    }

    public static Class248 method8204(Class422 class422) {
        return class422.field1827;
    }

    public static Class3812 method8205(Class3442 class3442) {
        return class3442.field7516;
    }

    private static void method8206(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method8207(Class5478 class5478, class_2561 class_25612) {
        return class5478.method21243(class_25612);
    }

    private static void method8208(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method8209() {
        return Class5659.method22111();
    }

    private static void method8210() {
        Class6009.method23561();
    }

    private static boolean method8211() {
        return Class3979.method19543();
    }

    private static void method8212(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8213(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method8214() {
        Class3979.method19561();
    }

    private static void method8215() {
        Class298.method1924();
    }

    static {
        Class422.method8180(-186813303144681716L);
    }

    public static Class924 method8216(Class422 class422) {
        return class422.field1823;
    }

    private static boolean method8217(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static int method8218(int n2, int n3, Class624 class624, Class6253 class6253) {
        return Class3816.method18611(n2, n3, class624, class6253);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method8219(class_2338 j2, class_2350 k2, boolean l2) {
        Class3442 r2;
        Class3442 o2;
        block59: {
            int n2;
            block62: {
                int n3;
                block61: {
                    block60: {
                        block58: {
                            int n4;
                            class_2350[] c22;
                            int q2;
                            block56: {
                                block57: {
                                    class_2680 n5;
                                    int n6;
                                    block54: {
                                        block55: {
                                            int m2;
                                            block52: {
                                                block53: {
                                                    block51: {
                                                        if (Class422.field290.field_1687.method_8320(j2.method_10093(k2)).method_26223() != Class422.method8167() && !Class422.field290.field_1687.method_22347(j2.method_10093(k2))) {
                                                            return (int)field1830[4] != 0;
                                                        }
                                                        m2 = (int)field1830[4];
                                                        n6 = (int)field1830[4];
                                                        class_2350[] class_2350Array = Class5449.field10190;
                                                        int n7 = class_2350Array.length;
                                                        if (n6 < n7) {
                                                            class_2248 a2;
                                                            class_2350 b2 = class_2350Array[n6];
                                                            if (b2 != k2 && ((a2 = Class422.field290.field_1687.method_8320(j2.method_10093(b2)).method_26204()) == class_2246.field_10002 || a2 == class_2246.field_10523)) {
                                                                m2 = (int)field1830[0];
                                                                return Class803.method12224(Class5899.field11664, 0.15662258841167243, Class5870.field11600, 0.6263385210281347, 0.06906101522095631, 0.8149731304305968);
                                                            }
                                                            ++n6;
                                                            return Class422.method8202();
                                                        }
                                                        n5 = Class422.method8121(field290).method_8320(j2);
                                                        if (n5.method_26204() instanceof class_2665) break block51;
                                                        if (!((Boolean)Class422.method8190(this.field1837)).booleanValue()) break block52;
                                                        break block53;
                                                    }
                                                    if (m2 != 0) {
                                                        return (int)field1830[4] != 0;
                                                    }
                                                    break block54;
                                                }
                                                class_2350 e2 = Class5449.method21106(j2, (class_1309)Class422.field290.field_1724);
                                                if (e2 == class_2350.field_11036) return (int)field1830[4] != 0;
                                                if (e2 == class_2350.field_11033) {
                                                    return (int)field1830[4] != 0;
                                                }
                                            }
                                            o2 = new Class3442(j2, Class422::method8114, (boolean)((Boolean)Class422.method8204(this).method507()), (Class607)((Object)Class422.method8179(this).method507()));
                                            o2.method17405((Double)Class422.method8135(this.field1834), l2);
                                            int p2 = o2.field7531 && o2.field7521 && (l2 || o2.field7526) && o2.field7516.method18523() ? (int)field1830[0] : (int)field1830[4];
                                            if (p2 == 0) return (int)field1830[4] != 0;
                                            if (o2.field7523 != null || o2.field7520 != null) {
                                                int n8 = (int)field1830[0];
                                                return Class803.method12224(Class936.field3946, 0.7237323788308845, 0.9795957135738811, Class3657.field8181, Class6108.field12320, 0.30059292250692715);
                                            }
                                            q2 = (int)field1830[4];
                                            if (m2 != 0) break block55;
                                            r2 = null;
                                            c22 = Class5449.field10190;
                                            n4 = c22.length;
                                            break block56;
                                        }
                                        if (q2 == 0) {
                                            return Class1807.method15742();
                                        }
                                        break block57;
                                    }
                                    if (n5.method_11654((class_2769)class_2318.field_10927) != k2) return (int)field1830[4] != 0;
                                    class_2350[] class_2350Array = Class5449.field10190;
                                    n6 = class_2350Array.length;
                                    int b2 = (int)field1830[4];
                                    while (true) {
                                        int n9;
                                        if (b2 >= n6) {
                                            return (int)field1830[4] != 0;
                                        }
                                        class_2350 d2 = class_2350Array[b2];
                                        if (d2 != k2) return Class1807.method15769();
                                        int n10 = 4954;
                                        while ((n9 = n10) != 4954) {
                                            if (n9 == 4955) {
                                                n10 = 4953;
                                                continue;
                                            }
                                            Class3442 c22 = new Class3442(j2.method_10093(d2), class_1802.field_8793, (boolean)((Boolean)Class422.method8113(this).method507()), (Class607)((Object)this.field1831.method507()));
                                            if (!c22.method17369((Double)Class422.method8199(this).method507(), (Boolean)this.field1824.method507(), l2, (Double)Class422.method8157(this).method507())) break;
                                            return (int)field1830[0] != 0;
                                        }
                                        ++b2;
                                    }
                                }
                                if ((Boolean)Class422.method8188(Class422.method8133(this)) == false) return Class1807.method15769();
                                if (o2.field7520 == null) return Class1807.method15753();
                                int n11 = 53837;
                                block22: while (true) {
                                    switch (n11) {
                                        case 53838: {
                                            n11 = 53836;
                                            continue block22;
                                        }
                                        case 53837: {
                                            Class1503.method14412(j2.method_10093(o2.field7520), Class422.method8140(o2).method_10153());
                                            break block22;
                                        }
                                        default: {
                                            Class1503.method14412(j2, o2.field7523);
                                        }
                                    }
                                    break;
                                }
                                Class422.method8184(this, k2);
                                o2.method17369((Double)this.field1834.method507(), (boolean)field1830[4], l2, (Double)Class422.method8136(this.field1836));
                                if ((Boolean)this.field1824.method507() == false) return (int)field1830[0] != 0;
                                if (o2.field7520 != null) {
                                    Class422.method8128(j2.method_10093(o2.field7520), o2.field7520.method_10153());
                                    return (int)field1830[0] != 0;
                                }
                                int n12 = o2.field7523 != null ? 12223 : 12224;
                                block23: while (true) {
                                    switch (n12) {
                                        case 12224: {
                                            n12 = 12222;
                                            continue block23;
                                        }
                                        case 12223: {
                                            Class1503.method14412(j2, o2.field7523);
                                            return (int)field1830[0] != 0;
                                        }
                                    }
                                    break;
                                }
                                return (int)field1830[0] != 0;
                            }
                            block24: for (int i2 = (int)field1830[4]; i2 < n4; ++i2) {
                                class_2350 h2 = c22[i2];
                                if (h2 == k2) continue;
                                Class3442 f2 = new Class3442(j2.method_10093(h2), class_1802.field_8793, (boolean)((Boolean)this.field1827.method507()), (Class607)((Object)this.field1831.method507()));
                                boolean g2 = f2.method17405((Double)this.field1834.method507(), l2);
                                if (g2) {
                                    if (q2 == 0 && !Class1745.method15547(j2, h2)) continue;
                                    r2 = f2;
                                    break;
                                }
                                if (!f2.field7531 || !f2.field7521 || !l2 && !f2.field7526 || !Class422.method8141(f2).method18523()) continue;
                                if (Class1745.method15547(f2.field7518, h2.method_10153())) {
                                    return Class5659.method22229(0.3884033918044687, Class4002.field9181, 0.959179223026486, 0.02205583824664925);
                                }
                                int n13 = 49476;
                                block25: while (true) {
                                    switch (n13) {
                                        case 49476: {
                                            n13 = 49474;
                                            continue block25;
                                        }
                                        case 49475: {
                                            if (q2 != 0) {
                                                r2 = f2;
                                                break block24;
                                            }
                                        }
                                        default: {
                                            continue block24;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (r2 == null) return (int)field1830[4] != 0;
                            if (q2 == 0) break block58;
                            if (!((Boolean)Class422.method8126(this.field1824)).booleanValue()) break block59;
                            break block60;
                        }
                        r2.method17369((Double)this.field1834.method507(), (Boolean)Class422.method8203(this).method507(), l2, (Double)this.field1836.method507());
                        boolean i3 = Class422.method8109(o2, (Double)this.field1834.method507(), l2);
                        if (!i3) {
                            return (int)field1830[0] != 0;
                        }
                        if (((Boolean)this.field1824.method507()).booleanValue()) {
                            if (o2.field7520 != null) {
                                Class1503.method14412(j2.method_10093(o2.field7520), Class422.method8174(o2).method_10153());
                            } else if (o2.field7523 != null) {
                                Class1503.method14412(j2, o2.field7523);
                            }
                        }
                        this.method8153(k2);
                        o2.method17483((boolean)field1830[4], l2, (Double)this.field1836.method507());
                        if (!((Boolean)Class422.method8105(this).method507()).booleanValue()) {
                            return (int)field1830[0] != 0;
                        }
                        if (o2.field7520 != null) {
                            Class1503.method14412(j2.method_10093(Class422.method8123(o2)), o2.field7520.method_10153());
                            return Class408.method6431();
                        }
                        n3 = o2.field7523 != null ? 14393 : 14394;
                        break block61;
                    }
                    n2 = o2.field7520 != null ? 11866 : 11867;
                    break block62;
                }
                block26: while (true) {
                    switch (n3) {
                        case 14394: {
                            n3 = 14392;
                            continue block26;
                        }
                        case 14393: {
                            Class1503.method14412(j2, Class422.method8147(o2));
                            return (int)field1830[0] != 0;
                        }
                    }
                    break;
                }
                return (int)field1830[0] != 0;
            }
            block27: while (true) {
                switch (n2) {
                    case 11867: {
                        n2 = 11865;
                        continue block27;
                    }
                    case 11866: {
                        Class1503.method14412(j2.method_10093(o2.field7520), o2.field7520.method_10153());
                        break block27;
                    }
                    default: {
                        Class1503.method14412(j2, Class422.method8182(o2));
                    }
                }
                break;
            }
        }
        this.method8153(k2);
        o2.method17483((boolean)field1830[4], l2, (Double)this.field1836.method507());
        if (((Boolean)this.field1824.method507()).booleanValue()) {
            if (Class422.method8183(o2) != null) {
                Class1503.method14412(j2.method_10093(o2.field7520), o2.field7520.method_10153());
            } else {
                Class1503.method14412(j2, o2.field7523);
            }
        }
        Class422.method8198(r2, (Double)this.field1834.method507(), (Boolean)this.field1824.method507(), l2, (Double)this.field1836.method507());
        return (int)field1830[0] != 0;
    }

    private static void method8220() {
        Class4146.method20694();
    }

    private static void method8221(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

