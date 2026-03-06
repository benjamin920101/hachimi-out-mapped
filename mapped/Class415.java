/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ProjectileEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1225;
import mapped.Class130;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class279;
import mapped.Class286;
import mapped.Class298;
import mapped.Class3442;
import mapped.Class3812;
import mapped.Class3979;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class5429;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6102;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class697;
import mapped.Class773;
import mapped.Class894;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class415
extends Class414 {
    Class248 field1538;
    Class248 field1539 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating ender pearl positions", (int)field1544[4], (int)field1544[5], (int)field1544[8]));
    Class248 field1540 = this.method450(new Class252("MinExtrapolationTicks", "Min motion predict ticks", (int)field1544[4], (int)field1544[3], (int)field1544[5]));
    Class248 field1541;
    Class248 field1542;
    private final Class925 field1543;
    private static long[] field1544 = new long[9];
    Class248 field1545 = this.method450(new Class252("Delay", "Delay between placements (ms)", (int)field1544[4], (int)field1544[6], (int)field1544[2]));
    Class248 field1546;
    Class248 field1547;
    Class248 field1548;
    Class248 field1549;
    private final Map field1550;
    Class248 field1551;
    Class248 field1552 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field1544[0], (int)field1544[0], (int)field1544[1]));
    Class248 field1553;
    Class248 field1554;
    Class248 field1555 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class415.method6636()));

    private static void method6629(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6630() {
        Class4146.method20697();
    }

    private static boolean method6631(Class3442 class3442, double d2, boolean bl2, boolean bl3, double d3) {
        return class3442.method17369(d2, bl2, bl3, d3);
    }

    public static Class248 method6632(Class415 class415) {
        return class415.field1539;
    }

    private static void method6633() {
        Class5836.method22897();
    }

    private static Class5478 method6634() {
        return Class415.method6663();
    }

    private static boolean method6635(Class5478 class5478, class_1657 class_16572) {
        return class5478.method21261(class_16572);
    }

    private static Class607[] method6636() {
        return Class607.values();
    }

    private static void method6637(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static boolean method6638(Class3442 class3442) {
        return class3442.field7527;
    }

    private static Object method6639(Class248 class248) {
        return class248.method507();
    }

    private static void method6640(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6641() {
        Class5836.method22890();
    }

    private static void method6642() {
        Class3979.method19561();
    }

    public static class_1792 method6643() {
        return class_1802.field_8281;
    }

    static {
        Class415.method6676(2640297053292214378L);
    }

    private static boolean method6644(Class3812 class3812) {
        return class3812.method18523();
    }

    public static Class248 method6645(Class415 class415) {
        return class415.field1541;
    }

    private static void method6646() {
        Class5659.method22184();
    }

    public Class415() {
        super("PearlBlocker", "Block enemy's ender pearl", Class556.field2758);
        this.field1548 = this.method450(new Class253("Rotate", "Rotates to block before placing", (boolean)field1544[4]));
        this.field1547 = this.method450(new Class252("PearlRange", "Valid ender pearl distance", 0.0, 4.5, 6.0));
        this.field1551 = this.method450(new Class252("IgnoreRange", "Ignore ender pearl distance", 0.0, 0.0, 6.0));
        this.field1538 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, Class5429.field10116, 6.0));
        this.field1542 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field1544[0]));
        this.field1553 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, Class6102.field12304, 6.0));
        this.field1541 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1544[4]));
        this.field1549 = this.method450(new Class252("Support", "The maximum number of blocks for helper can place", (int)field1544[4], (int)field1544[7], (int)field1544[1]));
        this.field1546 = this.method450(new Class253("Multi", "Allow multiple assignblocks", (boolean)field1544[0], this::method1269));
        this.field1554 = this.method450(new Class253("IgnoreFriends", "Ignore friend's ender pearl", (boolean)field1544[0]));
        this.field1550 = new HashMap();
        this.field1543 = new Class926();
    }

    private static void method6647() {
        Class298.method1924();
    }

    private static void method6648() {
        Class3979.method19561();
    }

    private static void method6649() {
        Class4146.method20694();
    }

    private static void method6650() {
        Class6009.method23560();
    }

    private static void method6651() {
        Class4146.method20694();
    }

    private static class_2338 method6652(Class653 class653) {
        return class653.method11461();
    }

    private static void method6653() {
        Class5836.method22885();
    }

    private static void method6654(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6655() {
        Class6009.method23560();
    }

    private static void method6656() {
        Class4146.method20697();
    }

    private static void method6657(float f2) {
        Class5836.method22907(f2);
    }

    private static void method6658(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method6659(Class415 class415) {
        return class415.field1541;
    }

    private static Object method6660(Class248 class248) {
        return class248.method507();
    }

    private static void method6661(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method6662(Map.Entry a2) {
        return (!((class_1684)a2.getKey()).method_5805() ? (int)field1544[0] : (int)field1544[4]) != 0;
    }

    public static Class5478 method6663() {
        return Class5723.field11045;
    }

    private static Object method6664(Class248 class248) {
        return class248.method507();
    }

    private static void method6665() {
        Class1503.method14420();
    }

    private static Map method6666(Class415 class415) {
        return Class415.method6689(class415);
    }

    private static int method6667(int n2, int n3, Class130 class130, Class286 class286) {
        return Class894.method12548(n2, n3, class130, class286);
    }

    private static void method6668() {
        Class4146.method20697();
    }

    private static Class248 method6669(Class415 class415) {
        return Class415.method6729(class415);
    }

    private static boolean method6670(class_2338 class_23382) {
        return Class1215.method13257(class_23382);
    }

    public static Class248 method6671(Class415 class415) {
        return class415.field1541;
    }

    public static class_746 method6672(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6673() {
        Class4146.method20697();
    }

    private static void method6674() {
        Class6009.method23561();
    }

    private static Class248 method6675(Class415 class415) {
        return Class415.method6683(class415);
    }

    private static void method6676(long l2) {
        Class415.field1544[6] = l2 ^ 0x24A4382E5AFE3856L;
        Class415.field1544[3] = l2 ^ 0x24A4382E5AFE386EL;
        Class415.field1544[5] = l2 ^ 0x24A4382E5AFE387EL;
        Class415.field1544[2] = l2 ^ 0x24A4382E5AFE3B82L;
        Class415.field1544[1] = l2 ^ 0x24A4382E5AFE3862L;
        Class415.field1544[8] = l2 ^ 0x24A4382E5AFE399EL;
        Class415.field1544[0] = l2 ^ 0x24A4382E5AFE386BL;
        Class415.field1544[4] = l2 ^ 0x24A4382E5AFE386AL;
        Class415.field1544[7] = l2 ^ 0x24A4382E5AFE3868L;
    }

    private static void method6677() {
        Class1745.method15538();
    }

    private static void method6678() {
        Class1503.method14420();
    }

    private static Object method6679(Class248 class248) {
        return class248.method507();
    }

    private static void method6680() {
        Class1745.method15538();
    }

    private static void method6681() {
        Class4146.method20697();
    }

    public static Class248 method6682(Class415 class415) {
        return class415.field1548;
    }

    public static Class248 method6683(Class415 class415) {
        return class415.field1555;
    }

    private static Class248 method6684(Class415 class415) {
        return Class415.method6711(class415);
    }

    private static Object method6685(Class248 class248) {
        return class248.method507();
    }

    private static void method6686() {
        Class5836.method22897();
    }

    private static void method6687() {
        Class5836.method22897();
    }

    private static void method6688() {
        Class5836.method22890();
    }

    public static Map method6689(Class415 class415) {
        return class415.field1550;
    }

    private static void method6690(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private Boolean method1269() {
        if ((Integer)this.field1549.method507() > 0) {
            int n2 = (int)field1544[0];
            Class5836.method22890();
            return null;
        }
        return (boolean)field1544[4];
    }

    public static Class248 method6691(Class415 class415) {
        return class415.field1551;
    }

    private static void method6692() {
        Class6009.method23560();
    }

    private static void method6693() {
        Class1503.method14420();
    }

    public static Class248 method6694(Class415 class415) {
        return class415.field1542;
    }

    private static void method6695() {
        Class6009.method23560();
    }

    private static Object method6696(Class248 class248) {
        return class248.method507();
    }

    private static Object method6697(Class248 class248) {
        return class248.method507();
    }

    private static void method6698() {
        Class298.method1924();
    }

    private static class_2338 method6699(Class653 class653) {
        return class653.method11461();
    }

    private static Object method6700(Class248 class248) {
        return class248.method507();
    }

    private static void method6701() {
        Class1745.method15538();
    }

    public static Class248 method6702(Class415 class415) {
        return class415.field1552;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method6703(Class210 y) {
        if (!((Boolean)this.field1536.method507()).booleanValue() && this.method6626()) {
            return;
        }
        if (!this.field1543.method12595((Number)this.field1545.method507())) {
            return;
        }
        this.field1550.entrySet().removeIf((Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method6662(java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)());
        z = (int)Class415.field1544[4];
        A = Class415.method6672(Class415.field290).method_33571();
        block8: for (class_1297 x : Class415.field290.field_1687.method_18112()) {
            block38: {
                block35: {
                    if (z > (Integer)this.field1552.method507()) {
                        return;
                    }
                    if (!(x instanceof class_1684) || !((q = (w = (class_1684)x).method_24921()) instanceof class_1657) || (r = (class_1657)q) == Class415.field290.field_1724) continue;
                    if (!((Boolean)Class415.method6707(this).method507()).booleanValue()) break block35;
                    v0 = 49298;
                    ** GOTO lbl21
                }
                v0 = 49299;
                if (true) ** GOTO lbl21
                block9: while (true) {
                    v0 = 49297;
lbl21:
                    // 3 sources

                    switch (v0) {
                        case 49299: {
                            continue block9;
                        }
                        case 49298: {
                            if (!Class415.method6635(Class415.method6634(), r)) break block9;
                            continue block8;
                        }
                    }
                    break;
                }
                s = null;
                t = null;
                u = null;
                v = new Class773((class_1676)x);
                if (!this.field1550.containsKey(w)) {
                    Class1807.method15744();
                    return;
                }
                block10: for (g = ((Integer)Class415.method6726(this).method507()).intValue(); g < (Integer)this.field1539.method507(); ++g) {
                    block37: {
                        block32: {
                            block36: {
                                e = v.method12121();
                                if (e != null) {
                                    if (!(((class_2338)Class415.method6666(this).get(w)).method_46558().method_1022(e.method_17784()) < 1.0)) break;
                                    s = class_2338.field_10980;
                                    break;
                                }
                                f = new class_2338.class_2339(v.field_6014, v.field_6036, v.field_5969);
                                if (!((class_2338)this.field1550.get(w)).equals((Object)f)) continue;
                                c = new Class3442((class_2338)f, class_1802.field_8281, (boolean)((Boolean)Class415.method6671(this).method507()), (Class607)this.field1555.method507());
                                d = c.method17405((Double)this.field1538.method507(), (Boolean)Class415.method6721(this.field1542));
                                if (d) {
                                    s = f;
                                    t = c;
                                    u = null;
                                    continue;
                                }
                                if (s != null && u == null) continue;
                                if (!c.field7531) break block36;
                                v1 = 31420;
                                ** GOTO lbl58
                            }
                            v1 = 31421;
                            if (true) ** GOTO lbl58
                            do {
                                v1 = var18_20 = 31419;
lbl58:
                                // 3 sources

                                if (var18_20 == 31420) break block32;
                            } while (var18_20 == 31421);
                            ** GOTO lbl-1000
                        }
                        if (c.field7521 && (c.field7527 || c.field7526) && c.field7516.method18523()) {
                            v2 = (int)Class415.field1544[0];
                        } else lbl-1000:
                        // 2 sources

                        {
                            v2 = b = (int)Class415.field1544[4];
                        }
                        if (b == 0) continue;
                        a = Class1745.method15597((class_2338)f, (Double)this.field1538.method507(), (Integer)this.field1549.method507());
                        if (a.isEmpty()) break block37;
                        v3 = 2731;
                        ** GOTO lbl76
                    }
                    v3 = 2732;
                    if (true) ** GOTO lbl76
                    while (true) {
                        v3 = var21_24 = 2730;
lbl76:
                        // 3 sources

                        if (var21_24 == 2731) break;
                        if (var21_24 != 2732) continue block10;
                    }
                    if (!Class1215.method13257(((Class653)a.getLast()).method11461())) continue;
                    s = f;
                    t = c;
                    u = a;
                }
                if (s != null) break block38;
                for (o = ((Integer)this.field1540.method507()).intValue(); o < (Integer)Class415.method6679(Class415.method6730(this)); ++o) {
                    block34: {
                        block41: {
                            block40: {
                                block33: {
                                    block39: {
                                        l = v.method12121();
                                        if (l != null) {
                                            if (!(l.method_17784().method_1022(A) <= (Double)Class415.method6691(this).method507())) break;
                                            s = null;
                                            t = null;
                                            u = null;
                                            break;
                                        }
                                        m = new class_243(v.field_6014, v.field_6036, v.field_5969);
                                        if (m.method_1022(A) > (Double)Class415.method6725(this).method507()) continue;
                                        n = new class_2338.class_2339(m.field_1352, m.field_1351, m.field_1350);
                                        if (s != null && !(A.method_1022(n.method_46558()) < A.method_1022(s.method_46558()))) continue;
                                        j = new Class3442((class_2338)n, Class415.method6643(), (boolean)((Boolean)Class415.method6645(this).method507()), (Class607)this.field1555.method507());
                                        k = j.method17405((Double)Class415.method6704(this).method507(), (Boolean)Class415.method6700(this.field1542));
                                        if (k) {
                                            s = n;
                                            t = j;
                                            u = null;
                                            continue;
                                        }
                                        if (s != null && u == null) continue;
                                        if (!j.field7531) ** GOTO lbl-1000
                                        if (!j.field7521) break block39;
                                        v4 = 20266;
                                        ** GOTO lbl114
                                    }
                                    v4 = 20267;
                                    if (true) ** GOTO lbl114
                                    do {
                                        v4 = var22_25 = 20265;
lbl114:
                                        // 3 sources

                                        if (var22_25 == 20266) break block33;
                                    } while (var22_25 == 20267);
                                    ** GOTO lbl-1000
                                }
                                if (!Class415.method6638(j) && !j.field7526) ** GOTO lbl-1000
                                if (!Class415.method6644(j.field7516)) break block40;
                                v5 = 24983;
                                ** GOTO lbl127
                            }
                            v5 = 24984;
                            if (true) ** GOTO lbl127
                            block15: while (true) {
                                v5 = 24982;
lbl127:
                                // 3 sources

                                switch (v5) {
                                    case 24984: {
                                        continue block15;
                                    }
                                    case 24983: {
                                        v6 = (int)Class415.field1544[0];
                                        break block15;
                                    }
                                    default: lbl-1000:
                                    // 4 sources

                                    {
                                        v6 = i = (int)Class415.field1544[4];
                                    }
                                }
                                break;
                            }
                            if (i == 0) continue;
                            h = Class1745.method15597((class_2338)n, (Double)Class415.method6713(this).method507(), (Integer)Class415.method6696(this.field1549));
                            if (h.isEmpty()) break block41;
                            v7 = 17030;
                            if (true) ** GOTO lbl146
                        }
                        v8 = 17031;
                        Class6454.method24636(Class1225.field4808, 0.5401402534090117, 0.8758585972869919, 0.7587323288230872);
                        return;
                        do {
                            v7 = var24_27 = 17029;
lbl146:
                            // 2 sources

                            if (var24_27 == 17030) break block34;
                        } while (var24_27 == 17031);
                        continue;
                    }
                    if (!Class415.method6670(((Class653)h.getLast()).method11461())) continue;
                    s = n;
                    t = j;
                    u = h;
                }
            }
            if (s == null || t == null) continue;
            this.field1550.put(w, s);
            this.field1543.method12593();
            if (u == null) {
                t.method17483((Boolean)this.field1548.method507(), (Boolean)this.field1542.method507(), (Double)Class415.method6639(this.field1553));
                ++z;
                continue;
            }
            if (((Boolean)Class415.method6669(this).method507()).booleanValue()) {
                for (Class653 p : u) {
                    Class415.method6718(new Class3442(Class415.method6652(p), class_1802.field_8281, (boolean)((Boolean)Class415.method6708(this).method507()), (Class607)Class415.method6675(this).method507()), (Double)this.field1538.method507(), (Boolean)this.field1548.method507(), (Boolean)Class415.method6712(this.field1542), (Double)Class415.method6664(this.field1553));
                    if (++z <= (Integer)Class415.method6722(this.field1552)) continue;
                    return;
                }
            } else {
                new Class3442(Class415.method6699((Class653)u.getFirst()), class_1802.field_8281, (boolean)((Boolean)Class415.method6659(this).method507()), (Class607)this.field1555.method507()).method17369((Double)this.field1538.method507(), (Boolean)Class415.method6697(Class415.method6682(this)), (Boolean)Class415.method6694(this).method507(), (Double)Class415.method6685(this.field1553));
                if (++z > (Integer)this.field1552.method507()) {
                    return;
                }
            }
            Class415.method6631(t, (Double)Class415.method6684(this).method507(), (Boolean)Class415.method6660(this.field1548), (Boolean)this.field1542.method507(), (Double)this.field1553.method507());
            if (++z <= (Integer)Class415.method6702(this).method507()) continue;
            return;
        }
    }

    public static Class248 method6704(Class415 class415) {
        return class415.field1538;
    }

    private static void method6705() {
        Class6454.method24594();
    }

    private static void method6706(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method6707(Class415 class415) {
        return class415.field1554;
    }

    public static Class248 method6708(Class415 class415) {
        return class415.field1541;
    }

    private static void method6709(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6710() {
        Class5836.method22885();
    }

    public static Class248 method6711(Class415 class415) {
        return class415.field1538;
    }

    private static Object method6712(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6713(Class415 class415) {
        return class415.field1538;
    }

    @Override
    protected void method1279() {
        this.field1550.clear();
    }

    private static void method6714() {
        Class5836.method22885();
    }

    private static int method6715(int n2, int n3, Class697 class697, Class279 class279) {
        return Class894.method12549(n2, n3, class697, class279);
    }

    private static void method6716() {
        Class5836.method22890();
    }

    private static void method6717() {
        Class3979.method19561();
    }

    private static boolean method6718(Class3442 class3442, double d2, boolean bl2, boolean bl3, double d3) {
        return class3442.method17369(d2, bl2, bl3, d3);
    }

    private static void method6719() {
        Class4146.method20694();
    }

    private static void method6720(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method6721(Class248 class248) {
        return class248.method507();
    }

    private static Object method6722(Class248 class248) {
        return class248.method507();
    }

    private static void method6723(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6724(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method6725(Class415 class415) {
        return class415.field1547;
    }

    public static Class248 method6726(Class415 class415) {
        return class415.field1540;
    }

    private static void method6727() {
        Class1807.method15744();
    }

    private static void method6728() {
        Class6454.method24594();
    }

    public static Class248 method6729(Class415 class415) {
        return class415.field1546;
    }

    private static Class248 method6730(Class415 class415) {
        return Class415.method6632(class415);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

