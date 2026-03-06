/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.EndCrystalItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.world.World
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.common.collect.Lists;
import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import mapped.Class1;
import mapped.Class1004;
import mapped.Class1034;
import mapped.Class1108;
import mapped.Class1149;
import mapped.Class1150;
import mapped.Class1153;
import mapped.Class1158;
import mapped.Class1182;
import mapped.Class1197;
import mapped.Class12;
import mapped.Class1215;
import mapped.Class1251;
import mapped.Class1282;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1423;
import mapped.Class1503;
import mapped.Class1512;
import mapped.Class1574;
import mapped.Class1576;
import mapped.Class1668;
import mapped.Class1691;
import mapped.Class1719;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2034;
import mapped.Class205;
import mapped.Class209;
import mapped.Class210;
import mapped.Class229;
import mapped.Class2297;
import mapped.Class240;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class29;
import mapped.AntiWeakness;
import mapped.Chams;
import mapped.Class3286;
import mapped.XRay;
import mapped.Class3293;
import mapped.Class3336;
import mapped.Class3339;
import mapped.HUD;
import mapped.PacketLogger;
import mapped.Class3442;
import mapped.FastLatency;
import mapped.ESP;
import mapped.Class3602;
import mapped.Class3647;
import mapped.Class3685;
import mapped.Blink;
import mapped.Class3797;
import mapped.Class3806;
import mapped.Class3812;
import mapped.Class3815;
import mapped.Class3850;
import mapped.Class3895;
import mapped.Class3935;
import mapped.Class3937;
import mapped.Class3977;
import mapped.Class3979;
import mapped.Class4002;
import mapped.Class4011;
import mapped.Class4012;
import mapped.Class4036;
import mapped.MainHand;
import mapped.Class4045;
import mapped.Class4056;
import mapped.Spammer;
import mapped.Replenish;
import mapped.Class4110;
import mapped.Class4119;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4196;
import mapped.PistonCrystal;
import mapped.Class4218;
import mapped.SpeedMine;
import mapped.AutoCrawlTrap;
import mapped.Phase;
import mapped.AutoXP;
import mapped.Velocity;
import mapped.Class480;
import mapped.Class523;
import mapped.Class533;
import mapped.Class536;
import mapped.Class543;
import mapped.Class5449;
import mapped.Class5457;
import mapped.Class5460;
import mapped.Class5512;
import mapped.Class555;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5624;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5660;
import mapped.Class5688;
import mapped.Class5691;
import mapped.Class570;
import mapped.Class5717;
import mapped.Class572;
import mapped.Class5722;
import mapped.Class5723;
import mapped.Class5814;
import mapped.Class5836;
import mapped.Class584;
import mapped.Class5852;
import mapped.Class5905;
import mapped.Class5931;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class604;
import mapped.Class6046;
import mapped.Class6053;
import mapped.Class6066;
import mapped.Class607;
import mapped.Class613;
import mapped.Class6154;
import mapped.Class619;
import mapped.Class6251;
import mapped.Class626;
import mapped.Class627;
import mapped.Class6282;
import mapped.Class6283;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class637;
import mapped.Class6454;
import mapped.Class677;
import mapped.Class693;
import mapped.Class702;
import mapped.Class704;
import mapped.Class709;
import mapped.Class727;
import mapped.Class747;
import mapped.Class76;
import mapped.Class760;
import mapped.Class77;
import mapped.Class778;
import mapped.Class803;
import mapped.Class821;
import mapped.Class924;
import mapped.Class925;
import mapped.Class926;
import mapped.Class956;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoCrystal
extends Class414 {
    Class248 field1648;
    Class248 field1649;
    Class248 field1650;
    Class248 field1651;
    Class248 field1652;
    Class248 field1653;
    Class248 field1654;
    Class248 field1655;
    private static long[] field1656;
    Class248 field1657;
    Class248 field1658;
    private boolean field1659;
    Class248 field1660;
    private final ExecutorService field1661;
    Class248 field1662;
    Class248 field1663;
    Class3812 field1664 = null;
    Class248 field1665;
    Class248 field1666;
    Class248 field1667;
    Class248 field1668;
    Class248 field1669;
    Class248 field1670;
    Class248 field1671;
    private class_243 field1672;
    Class248 field1673;
    Class248 field1674;
    Class248 field1675;
    Class248 field1676;
    Class248 field1677;
    private final Class925 field1678;
    Class248 field1679;
    Class248 field1680;
    Class248 field1681;
    Class248 field1682;
    Class248 field1683;
    Class248 field1684;
    Class248 field1685;
    Class248 field1686;
    Class248 field1687;
    Class248 field1688;
    private final Deque field1689;
    Class248 field1690;
    Class248 field1691;
    Class248 field1692;
    Class248 field1693;
    private final Map field1694;
    Class248 field1695;
    Class248 field1696;
    Class248 field1697;
    Class248 field1698;
    Class248 field1699;
    private final Map field1700;
    private static final class_238 field1701;
    Class248 field1702;
    Class248 field1703;
    Class248 field1704;
    Class248 field1705;
    private static AutoCrystal INSTANCE;
    public class_2338 field1706;
    Class248 field1707;
    Class248 field1708;
    Class248 field1709;
    Class248 field1710;
    Class248 field1711;
    Class248 field1712;
    Class248 field1713;
    private final Class925 field1714;
    Class248 field1715;
    Class248 field1716;
    private Class5457 field1717;
    Class248 field1718;
    public double field1719;
    private Class5457 field1720;
    Class248 field1721;
    Class248 field1722;
    Class248 field1723;
    Class248 field1724;
    Class248 field1725;
    Class248 field1726;
    private final Class3293 field1727;
    private final Class926 field1728;
    Class248 field1729;
    Class248 field1730;
    Class248 field1731;
    Class248 field1732;
    Class248 field1733;
    Class248 field1734;
    Class248 field1735;
    Class248 field1736;
    Class248 field1737;
    Class248 field1738;
    Class248 field1739;
    public double field1740;
    Class248 field1741;
    Class248 field1742;
    Class248 field1743;
    Class248 field1744;
    Class248 field1745;
    private boolean field1746;
    Class248 field1747;
    Class248 field1748;
    Class248 field1749;
    public final Map field1750;
    private final Map field1751;
    Class248 field1752;
    Class248 field1753;
    Class248 field1754;
    Class248 field1755;
    Class248 field1756;
    Class248 field1757;
    private final Class925 field1758;
    Class248 field1759;
    public final Class925 field1760 = new Class926();
    public static boolean $skidonion$890408832;

    private static void method7067() {
        Class1503.method14420();
    }

    private static class_1268 method7068(AutoCrystal class419) {
        return class419.method7635();
    }

    private static boolean method7069() {
        return Class4196.method20801();
    }

    private Boolean method7070() {
        return (this.field1686.method507() != AutoCrystal.method7373() && AutoCrystal.method7573(this).method507() != Class572.field2800 && AutoCrystal.method7286((Class523)((Object)this.field1653.method507())) ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static int method7071(int n2, int n3, Class3937 class3937, Class709 class709) {
        return Class4011.method19977(n2, n3, class3937, class709);
    }

    private static class_1268 method7072(AutoCrystal class419) {
        return class419.method7635();
    }

    private Boolean method7073() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static void method7074() {
        Class4146.method20694();
    }

    public static Class248 method7075(AutoCrystal class419) {
        return class419.field1650;
    }

    private static class_638 method7076(class_310 class_3102) {
        return AutoCrystal.method7470(class_3102);
    }

    private Boolean method7077() {
        return ((Class523)((Object)this.field1653.method507())).method10869();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method7078(Class76 l) {
        block17: {
            block16: {
                var2_2 = l.method152();
                if (!(var2_2 instanceof class_1511)) {
                    return;
                }
                a = (class_1511)var2_2;
                n = m.method_19538();
                o = class_2338.method_49638((class_2374)n.method_1031(0.0, -1.0, 0.0));
                p = (Long)this.field1700.remove(o);
                this.field1659 = p != null ? (int)AutoCrystal.field1656[7] : (int)AutoCrystal.field1656[2];
                v0 = (int)this.field1659;
                if (this.field1659) {
                    this.field1727.method16848();
                }
                if (!AutoCrystal.method7132(this.field1728, (Number)this.field1724.method507())) {
                    return;
                }
                if (!((Boolean)AutoCrystal.method7428(AutoCrystal.method7214(this))).booleanValue()) {
                    return;
                }
                if (!this.field1659 || this.method7274() == null) break block16;
                b = AutoCrystal.method7072(this);
                AutoCrystal.method7151(this, (class_1511)m, b);
                this.field1728.method12593();
                if (AutoCrystal.method7396(this).method507() != Class604.field2940) {
                    Class6009.method23559(false);
                    return;
                }
                this.method7620(b);
                break block17;
            }
            if (!((Boolean)this.field1684.method507()).booleanValue()) break block17;
            if (!this.method7102(n)) {
                return;
            }
            if (!((Boolean)AutoCrystal.method7114(AutoCrystal.method7625(this))).booleanValue()) {
                AutoCrystal.method7334();
                return;
            }
            k = this.method7549((class_1297)AutoCrystal.field290.field_1724, n, (Boolean)this.field1741.method507(), (Integer)this.field1748.method507(), (boolean)AutoCrystal.field1656[2]);
            if (this.method7224(k)) {
                return;
            }
            block4: for (class_1297 j : AutoCrystal.field290.field_1687.method_18112()) {
                block20: {
                    block15: {
                        block19: {
                            block18: {
                                if (j == null || !j.method_5805() || j == AutoCrystal.method7678(AutoCrystal.field290)) continue;
                                if (!this.method7356(j)) break block18;
                                v1 = 59848;
                                ** GOTO lbl45
                            }
                            v1 = 59849;
                            if (true) ** GOTO lbl45
                            block5: while (true) {
                                v1 = 59847;
lbl45:
                                // 3 sources

                                switch (v1) {
                                    default: {
                                        continue block4;
                                    }
                                    case 59849: {
                                        continue block5;
                                    }
                                    case 59848: 
                                }
                                break;
                            }
                            if (Class5723.field11045.method21243(j.method_5477())) continue;
                            if (!(j instanceof class_1309)) break block19;
                            v2 = 27870;
                            ** GOTO lbl60
                        }
                        v2 = 27871;
                        if (true) ** GOTO lbl60
                        do {
                            v2 = var11_10 = 27869;
lbl60:
                            // 3 sources

                            if (var11_10 == 27870) break block15;
                        } while (var11_10 == 27871);
                        break block20;
                    }
                    c = (class_1309)j;
                    if (((Boolean)this.field1668.method507()).booleanValue() && AutoCrystal.method7103(c)) continue;
                }
                if ((f = n.method_1025(j.method_19538())) > 144.0) continue;
                g = AutoCrystal.method7430(AutoCrystal.field290).method_5858(j);
                if (g > (double)(((Float)this.field1649.method507()).floatValue() * ((Float)this.field1649.method507()).floatValue())) continue;
                h = this.method7549(j, n, (Boolean)AutoCrystal.method7432(this).method507(), (Integer)this.field1748.method507(), (Boolean)this.field1726.method507());
                i = new Class5457(m, j, h, k, m.method_24515().method_10074(), (boolean)AutoCrystal.field1656[2], null);
                this.field1659 = h > (double)((Float)this.field1702.method507()).floatValue() || this.field1717 != null && h >= AutoCrystal.method7158(this).method21140() && (Boolean)AutoCrystal.method7420(this.field1709) != false || j instanceof class_1309 != false && this.method7280(i, d = (class_1309)j) != false ? (int)AutoCrystal.field1656[7] : (int)AutoCrystal.field1656[2];
                v3 = (int)this.field1659;
                if (!this.field1659) continue;
                e = this.method7635();
                this.method7374((class_1511)m, e);
                this.field1728.method12593();
                if (this.field1688.method507() != AutoCrystal.method7223()) break;
                this.method7620(e);
                break;
            }
        }
    }

    private static int method7079(int n2, int n3, XRay class329, Class5852 class5852) {
        return Class4011.method19668(n2, n3, class329, class5852);
    }

    private static void method7080() {
        Class5836.method22897();
    }

    private static class_746 method7081(class_310 class_3102) {
        return AutoCrystal.method7517(class_3102);
    }

    public static Class248 method7082(AutoCrystal class419) {
        return class419.field1686;
    }

    private static void method7083() {
        Class1745.method15538();
    }

    public static Class248 method7084(AutoCrystal class419) {
        return class419.field1653;
    }

    /*
     * Unable to fully structure code
     */
    private boolean method7085(class_2338 e) {
        f = new CopyOnWriteArrayList<E>(AutoCrystal.field290.field_1687.method_8335(null, new class_238(e)));
        for (class_1297 d : f) {
            block4: {
                block3: {
                    block5: {
                        if (!d.method_5805() || d instanceof class_1542 && ((Boolean)this.field1712.method507()).booleanValue() && d.field_6012 <= (int)AutoCrystal.field1656[4]) continue;
                        if (!(d instanceof class_1511)) break block4;
                        c = (class_1511)d;
                        a = (Integer)this.field1694.get(c.method_5628());
                        b = this.method7549((class_1297)AutoCrystal.field290.field_1724, c.method_19538(), (Boolean)this.field1741.method507(), ((Boolean)this.field1671.method507()).booleanValue() ? (Integer)this.field1748.method507() : (int)AutoCrystal.field1656[2], (boolean)AutoCrystal.field1656[2]);
                        if (!((Boolean)this.field1670.method507()).booleanValue()) break block3;
                        if (this.method7224(b)) break block5;
                        v0 = 38249;
                        ** GOTO lbl17
                    }
                    v0 = 38250;
                    if (true) ** GOTO lbl17
                    do {
                        v0 = var9_8 = 38248;
lbl17:
                        // 3 sources

                        if (var9_8 == 38249) break block3;
                    } while (var9_8 == 38250);
                    break block4;
                }
                if (!this.method7266(c)) {
                    return Class5659.method22229(0.7482894964422575, 0.8264178932616331, 0.45611773265344246, 0.9776158878976878);
                }
                if (a == null || (float)a.intValue() <= ((Float)this.field1687.method507()).floatValue() * 10.0f) continue;
            }
            return (boolean)((int)AutoCrystal.field1656[2]);
        }
        return (boolean)((int)AutoCrystal.field1656[7]);
    }

    private static int method7086(int n2, int n3, Class240 class240, Class4056 class4056) {
        return Class4011.method19782(n2, n3, class240, class4056);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method7087() {
        int n2;
        if (((Class613)((Object)this.field1732.method507())).method11316() && ((Class523)((Object)this.field1653.method507())).method10861()) {
            n2 = (int)field1656[7];
            return n2 != 0;
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static int method7088(int n2, int n3, AutoCrawlTrap class430, Class702 class702) {
        return Class4011.method19802(n2, n3, class430, class702);
    }

    private static Object method7089(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method7090(Class229 a2) {
        this.method1279();
    }

    private static void method7091() {
        Class1745.method15538();
    }

    private static int method7092(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private Boolean method7093() {
        if (((Class613)((Object)AutoCrystal.method7450(this.field1732))).method11313() && ((Class523)((Object)this.field1653.method507())).method10861()) {
            int n2 = (int)field1656[7];
            Class1745.method15538();
            return null;
        }
        return (boolean)field1656[2];
    }

    private static Class248 method7094(AutoCrystal class419) {
        return AutoCrystal.method7082(class419);
    }

    private static boolean method7095() {
        return Class3979.method19544();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private Boolean method7096() {
        int n2;
        if (!((Class613)((Object)this.field1732.method507())).method11316()) return (boolean)field1656[2];
        if (!((Class523)((Object)this.field1653.method507())).method10861()) {
            int n3 = 48683;
            Class1503.method14417(0.82862777f, 0.3086568f);
            return null;
        }
        int n4 = 48682;
        boolean bl2 = true;
        do {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = n2 = 48681;
            }
            if (n2 != 48682) continue;
            int n5 = (int)field1656[7];
            Class1668.method15147(-126359775, 818898373, -1574207498, -799947423);
            return null;
        } while (n2 == 48683);
        return (boolean)field1656[2];
    }

    private boolean method7097(double d2, class_1309 e2) {
        class_1657 c2;
        float b2;
        if (e2 instanceof class_1657 && (b2 = Class1158.method13135((class_1297)(c2 = (class_1657)e2))) <= 2.0f) {
            long a2;
            if ((double)b2 - d2 < 0.5 && (a2 = AutoCrystal.method7308(Class5723.field11040, (class_1297)c2)) != field1656[13]) {
                return (System.currentTimeMillis() - a2 <= field1656[16] ? (int)field1656[7] : (int)field1656[2]) != 0;
            }
        }
        return (int)field1656[2] != 0;
    }

    private static void method7098() {
        Class5836.method22897();
    }

    private static boolean method7099() {
        return Class3979.method19543();
    }

    private static Object method7100(Class248 class248) {
        return class248.method507();
    }

    private static Object method7101(Class248 class248) {
        return class248.method507();
    }

    private boolean method7102(class_243 a2) {
        class_243 b2 = AutoCrystal.method7179(this, a2);
        double c2 = AutoCrystal.method7550(this).method_1022(b2);
        if (Class5659.method22115(b2)) {
            return (c2 <= (double)((Float)this.field1665.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
        }
        return (c2 <= (double)((Float)this.field1735.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static boolean method7103(class_1309 class_13092) {
        return Class5659.method22180(class_13092);
    }

    public static class_746 method7104(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class627[] method7105() {
        return Class627.values();
    }

    private static Object method7106(Class248 class248) {
        return class248.method507();
    }

    private Boolean method7107() {
        return ((Class523)((Object)AutoCrystal.method7497(AutoCrystal.method7343(this)))).method10869();
    }

    private static void method7108() {
        Class6009.method23561();
    }

    private static boolean method7109() {
        return Velocity.method10322();
    }

    private static boolean method7110(Class5457 class5457) {
        return class5457.method21142();
    }

    public static Map method7111(AutoCrystal class419) {
        return class419.field1700;
    }

    public static Class248 method7112(AutoCrystal class419) {
        return class419.field1650;
    }

    public static class_746 method7113(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method7114(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7115(Class523 class523) {
        return class523.method10868();
    }

    private Boolean method7116() {
        return ((Class523)((Object)this.field1653.method507())).method10861();
    }

    private static boolean method7117(Class523 class523) {
        return class523.method10868();
    }

    private static Object method7118(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7119(Class523 class523) {
        return class523.method10861();
    }

    private static void method7120() {
        Class4146.method20697();
    }

    private static void method7121(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static class_1511 method7122(AutoCrystal class419, class_2338 class_23382) {
        return class419.method7412(class_23382);
    }

    private Boolean method7123() {
        return ((Class523)((Object)AutoCrystal.method7451(this.field1653))).method10861();
    }

    private static boolean method7124(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private Boolean method7125() {
        return ((Class523)((Object)AutoCrystal.method7417(this).method507())).method10868();
    }

    public boolean method7126() {
        if (AutoCrystal.method7570(this) != null) {
            int n2 = (int)field1656[7];
            return Class1215.method13261(0.9738537257265935, Class821.field3612);
        }
        return (int)field1656[2] != 0;
    }

    private static void method7127(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private Boolean method7128() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static void method7129() {
        Class6009.method23561();
    }

    private Boolean method7130() {
        return AutoCrystal.method7182((Class523)((Object)AutoCrystal.method7084(this).method507()));
    }

    private class_243 method7131(class_2338 a2, class_2350 b2) {
        if (b2 == null) {
            return null;
        }
        return Class1745.method15658(a2, b2);
    }

    private static boolean method7132(Class926 class926, Number number) {
        return class926.method12595(number);
    }

    private Boolean method1278() {
        return ((Class523)((Object)AutoCrystal.method7220(this.field1653))).method10849();
    }

    private static class_2596 method7133(class_1268 a2, class_3965 b2, int c2) {
        return new class_2885(a2, b2, c2);
    }

    private static void method7134(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method7135() {
        Class6454.method24594();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method7136(Class210 o) {
        block43: {
            block38: {
                block44: {
                    block42: {
                        block41: {
                            block40: {
                                block39: {
                                    if (AutoCrystal.method7363(AutoCrystal.field290) == null || AutoCrystal.field290.field_1687 == null || AutoCrystal.method7538(AutoCrystal.field290).method_7325()) {
                                        return;
                                    }
                                    this.field1664 = new Class3812(class_1802.field_8301, (Class607)AutoCrystal.method7709(this.field1739)).method18502();
                                    this.field1706 = null;
                                    p = Lists.newArrayList((Iterable)AutoCrystal.field290.field_1687.method_18112());
                                    AutoCrystal.method7631(this, this.method7689(p));
                                    if (((Boolean)this.field1690.method507()).booleanValue()) break block39;
                                    if (!((Boolean)this.field1657.method507()).booleanValue()) ** GOTO lbl-1000
                                    if (!this.method7328()) ** GOTO lbl-1000
                                    if (AntiWeakness.INSTANCE.method1857()) {
                                        this.field1720 = this.method7445(this.method7619(this.method7302()), p);
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        this.field1720 = null;
                                    }
                                }
                                q = this.field1720;
                                if (this.field1717 != null) break block40;
                                v0 = 38854;
                                ** GOTO lbl24
                            }
                            v0 = 38855;
                            if (true) ** GOTO lbl24
                            block8: while (true) {
                                v0 = 38853;
lbl24:
                                // 3 sources

                                switch (v0) {
                                    case 38855: {
                                        continue block8;
                                    }
                                    case 38854: {
                                        if (q == null) break block8;
                                        if (AutoCrystal.method7110(q)) {
                                            if (!((Boolean)this.field1682.method507()).booleanValue()) break block8;
                                        }
                                        if ((b = this.method7412(q.method21136().method_10084())) == null) {
                                            b = this.method7412(q.method21136().method_10086((int)AutoCrystal.field1656[14]));
                                        }
                                        if (b == null || b.method_24515().equals((Object)q.method21136().method_10084())) break block8;
                                        a = this.method7549((class_1297)AutoCrystal.field290.field_1724, b.method_19538(), (Boolean)this.field1741.method507(), (Boolean)AutoCrystal.method7290(this).method507() != false ? (Integer)this.field1748.method507() : (int)AutoCrystal.field1656[2], (boolean)AutoCrystal.field1656[2]);
                                        if (((Boolean)AutoCrystal.method7500(this).method507()).booleanValue() && AutoCrystal.method7425(this, a)) break block8;
                                        this.field1717 = new Class5457(b, q.method21137(), q.method21140(), a, b.method_24515().method_10074(), (boolean)AutoCrystal.field1656[2], null);
                                    }
                                }
                                break;
                            }
                            if (((Boolean)this.field1711.method507()).booleanValue() && AutoCrystal.method7702(this) != null && AutoCrystal.method7675(this).containsKey(((class_1511)this.field1717.method21141()).method_5628())) {
                                if ((double)((Float)AutoCrystal.method7524(this.field1679)).floatValue() > 0.0) {
                                    c = Class4119.field9553 / Math.max(1.0f, (float)((Integer)AutoCrystal.method7336(this.field1729)).intValue());
                                    d = ((Float)this.field1679.method507()).floatValue() * c;
                                } else {
                                    e = ((Float)AutoCrystal.method7583(this.field1730)).floatValue();
                                }
                                AutoCrystal.method7379(this.field1728, Float.valueOf(e + 100.0f));
                                this.field1751.remove(((class_1511)this.field1717.method21141()).method_5628());
                            }
                            r = this.method7458();
                            if (((Boolean)AutoCrystal.method7395(AutoCrystal.method7456(this))).booleanValue()) {
                                r = Math.max(((Float)AutoCrystal.method7477(this).method507()).floatValue() * 50.0f, (float)this.method7641() + ((Float)this.field1648.method507()).floatValue() * 50.0f);
                            }
                            if (this.field1717 == null) ** GOTO lbl-1000
                            if (!((double)((Float)this.field1679.method507()).floatValue() <= 0.0)) break block41;
                            v1 = 14883;
                            ** GOTO lbl58
                        }
                        v1 = 14884;
                        if (true) ** GOTO lbl58
                        block9: while (true) {
                            v1 = 14882;
lbl58:
                            // 3 sources

                            switch (v1) {
                                case 14884: {
                                    continue block9;
                                }
                                case 14883: {
                                    if (this.field1728.method12595(Float.valueOf(r))) {
                                        v2 = (int)AutoCrystal.field1656[7];
                                        break block9;
                                    }
                                }
                                default: lbl-1000:
                                // 2 sources

                                {
                                    v2 = (int)(this.field1659 = (int)AutoCrystal.field1656[2]);
                                }
                            }
                            break;
                        }
                        if (this.field1717 != null && ((Class584)AutoCrystal.method7118(AutoCrystal.method7094(this))).method11161()) {
                            AutoCrystal.method7605(this, this.method7488(((class_1511)this.field1717.method21141()).method_5829()) != null ? AutoCrystal.method7149(this, ((class_1511)this.field1717.method21141()).method_5829()) : ((class_1511)this.field1717.field10213).method_19538().method_1031(0.0, 0.5, 0.0));
                        } else if (q != null && ((Class584)this.field1686.method507()).method11167()) {
                            f = Class1745.method15561((class_2338)q.method21141(), ((Float)this.field1692.method507()).floatValue());
                            v3 = this.field1672 = this.method7131(AutoCrystal.method7679(q), f) != null ? this.method7131(AutoCrystal.method7708(q), f) : q.method21136().method_46558();
                        }
                        if (AutoCrystal.method7673(this)) {
                            return;
                        }
                        if (!((Class584)AutoCrystal.method7652(this.field1686)).method11164()) break block42;
                        if (this.field1672 == null || q != null && !this.method7328()) break block42;
                        n = Class1503.method14416(this.method7302(), this.field1672);
                        if (AutoCrystal.method7263(AutoCrystal.method7682(this)) == AutoCrystal.method7215()) ** GOTO lbl-1000
                        if (this.field1654.method507() == Class572.field2798) {
                            ** if (!this.field1659) goto lbl-1000
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 2 sources

                        {
                            if ((k = Math.abs(j = (i = AutoCrystal.method7346().method12035()) - n[(int)AutoCrystal.field1656[2]])) > Class677.field3256) {
                                j += j > 0.0f ? -360.0f : 360.0f;
                            }
                            if (!(j > 0.0f)) {
                                Class1668.method15147(1743904390, -1843825213, 726325685, 587399380);
                                return;
                            }
                            l = (int)AutoCrystal.field1656[13];
                            m = l * (Integer)AutoCrystal.method7681(AutoCrystal.method7712(this));
                            if (k > (float)((Integer)this.field1743.method507()).intValue()) {
                                while (true) {
                                    // Infinite loop
                                }
                            }
                            h = n[(int)AutoCrystal.field1656[2]];
                            this.field1746 = (int)AutoCrystal.field1656[7];
                            this.field1672 = null;
                            n[(int)AutoCrystal.field1656[2]] = h;
                            ** GOTO lbl100
                        }
lbl-1000:
                        // 2 sources

                        {
                            this.field1746 = (int)AutoCrystal.field1656[7];
                            this.field1672 = null;
                        }
lbl100:
                        // 2 sources

                        this.method6465(n[(int)AutoCrystal.field1656[2]], n[(int)AutoCrystal.field1656[7]]);
                    }
                    if ((this.method6469() || !this.field1746) && ((Class584)this.field1686.method507()).method11164()) {
                        return;
                    }
                    s = this.method7635();
                    if (this.field1717 != null) {
                        AutoCrystal.method7572(this, AutoCrystal.method7414(this).method21136());
                        this.field1719 = AutoCrystal.method7690(this).method21140();
                        this.field1740 = this.field1717.method21138();
                        if (this.field1659) {
                            AutoCrystal.method7341(this, (class_1511)AutoCrystal.method7457(this.field1717), s);
                            this.field1728.method12593();
                        }
                    }
                    t = this.field1678.method12595((Number)this.field1699.method507());
                    if (q == null || !t) break block43;
                    if (AutoCrystal.method7665(this, (class_2338)q.method21141())) break block44;
                    v4 = 51878;
                    ** GOTO lbl122
                }
                v4 = 51879;
                if (true) ** GOTO lbl122
                while (true) {
                    v4 = var14_19 = 51877;
lbl122:
                    // 3 sources

                    if (var14_19 == 51878) break;
                    if (var14_19 == 51879) {
                        continue;
                    }
                    break block38;
                    break;
                }
                if (q.method21139() != null && this.field1758.method12595((Number)AutoCrystal.method7630(this.field1733))) {
                    q.method21139().method17483((Boolean)this.field1721.method507(), (boolean)AutoCrystal.field1656[2], Class5660.field10857);
                    this.field1758.method12593();
                } else {
                    return;
                }
            }
            this.field1706 = (class_2338)q.method21141();
            this.field1719 = q.method21140();
            AutoCrystal.method7515(this, q.method21138());
            this.method7666((class_2338)q.method21141(), s);
            this.field1678.method12593();
        }
    }

    private static void method7137() {
        Class1807.method15744();
    }

    private Boolean method7138() {
        return ((Class523)((Object)AutoCrystal.method7180(this.field1653))).method10863();
    }

    private static void method7139() {
        Chams.method1924();
    }

    public static class_3419 method7140() {
        return class_3419.field_15245;
    }

    private static Object method7141(Class248 class248) {
        return class248.method507();
    }

    private static void method7142() {
        Class5659.method22184();
    }

    private static void method7143(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static double method7144(class_1297 class_12972, class_243 class_2432, boolean bl2, Set set, int n2, boolean bl3) {
        return Class5905.method23249(class_12972, class_2432, bl2, set, n2, bl3);
    }

    private static void method7145() {
        Class5836.method22897();
    }

    private static boolean method7146(Class523 class523) {
        return class523.method10863();
    }

    public static Map method7147(AutoCrystal class419) {
        return class419.field1751;
    }

    private static class_243 method7148(AutoCrystal class419, class_2338 class_23382, class_2350 class_23502) {
        return class419.method7131(class_23382, class_23502);
    }

    private static class_243 method7149(AutoCrystal class419, class_238 class_2383) {
        return class419.method7488(class_2383);
    }

    private static void method7150() {
        Class6009.method23561();
    }

    private static void method7151(AutoCrystal class419, class_1511 class_15112, class_1268 class_12682) {
        class419.method7374(class_15112, class_12682);
    }

    private static void method7152() {
        Chams.method1924();
    }

    public static Class248 method7153(AutoCrystal class419) {
        return class419.field1737;
    }

    private static void method7154() {
        Class5836.method22885();
    }

    private boolean method7155(Class637 a2) {
        if (a2 == Class637.field3112) {
            return (int)field1656[2] != 0;
        }
        return (a2 == Class637.field3111 || !MainHand.method6279().method6306() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static int method7156(Class3812 class3812) {
        return class3812.method18530();
    }

    private Boolean method7157() {
        return ((Class523)((Object)this.field1653.method507())).method10861();
    }

    public static Class5457 method7158(AutoCrystal class419) {
        return class419.field1717;
    }

    private static Object method7159(Class248 class248) {
        return class248.method507();
    }

    private static Class637[] method7160() {
        return Class637.values();
    }

    private static void method7161() {
        Class1745.method15538();
    }

    private String method7162() {
        class_1297 a2 = this.method7274();
        if (a2 == null) {
            return super.method1248();
        }
        StringBuilder b2 = new StringBuilder();
        int c2 = (int)field1656[2];
        if (((Boolean)this.field1662.method507()).booleanValue()) {
            b2.append(a2.method_5477().getString());
            c2 = (int)field1656[7];
        }
        if (((Boolean)this.field1744.method507()).booleanValue()) {
            if (c2 != 0) {
                b2.append(", ");
            }
            b2.append(Class1004.method12743(this.field1719, (int)field1656[7]));
            c2 = (int)field1656[7];
        }
        if (((Boolean)this.field1742.method507()).booleanValue()) {
            if (c2 != 0) {
                b2.append(", ");
            }
            b2.append(AutoCrystal.method7322(this).method12595(Float.valueOf(((Float)AutoCrystal.method7616(this).method507()).floatValue() + 2000.0f)) ? Integer.valueOf((int)field1656[2]) : this.method7641() + ((Boolean)this.field1738.method507() != false ? "ms" : ""));
            c2 = (int)field1656[7];
        }
        if (((Boolean)AutoCrystal.method7575(this).method507()).booleanValue()) {
            if (c2 != 0) {
                b2.append(", ");
            }
            b2.append(this.field1727.method16841());
        }
        return !b2.isEmpty() ? b2.toString() : super.method1248();
    }

    private static boolean method7163(class_1297 class_12972) {
        return Class1158.method13133(class_12972);
    }

    private static void method7164() {
        Class5659.method22184();
    }

    private static void method7165() {
        Class1807.method15744();
    }

    private Boolean method7166() {
        return ((Class523)((Object)AutoCrystal.method7464(this).method507())).method10863();
    }

    private static double method7167(float f2, float f3) {
        return Class1503.method14426(f2, f3);
    }

    private static boolean method7168(Class613 class613) {
        return class613.method11313();
    }

    public static Class248 method7169(AutoCrystal class419) {
        return class419.field1686;
    }

    private static boolean method7170() {
        return Class5659.method22194();
    }

    private static void method7171(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7172() {
        Class5836.method22897();
    }

    public static AutoCrystal method7173() {
        return INSTANCE;
    }

    private static void method7174(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7175(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method7176() {
        Class5836.method22897();
    }

    private static void method7177() {
        Class6454.method24594();
    }

    private static boolean method7178() {
        return Class5836.method22894();
    }

    private static class_243 method7179(AutoCrystal class419, class_243 class_2432) {
        return class419.method7297(class_2432);
    }

    public AutoCrystal() {
        super("AutoCrystal", "Attacks entities with end crystals", Class556.field2758, (int)field1656[5]);
        this.field1750 = new HashMap();
        this.field1728 = new Class926();
        this.field1678 = new Class926();
        this.field1714 = new Class926();
        this.field1758 = new Class924();
        this.field1689 = new Class533((int)field1656[6]);
        this.field1751 = Collections.synchronizedMap(new ConcurrentHashMap());
        this.field1700 = Collections.synchronizedMap(new ConcurrentHashMap());
        this.field1727 = new Class3293();
        this.field1694 = new HashMap();
        this.field1661 = Executors.newSingleThreadExecutor();
        this.field1653 = this.method450(new Class260("Page", "The pages", Class523.field2590, Class523.values()));
        this.field1657 = this.method450(new Class253("Place", "Places crystals to damage enemies. Place settings will only function if this setting is enabled", (boolean)field1656[7], this::method1269));
        this.field1699 = this.method450(new Class252("PlaceDelay", "Delay to place crystals", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), (Number)Float.valueOf(1000.0f), this::method1278));
        this.field1692 = this.method450(new Class252("PlaceRange", "Range to place crystals", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(Class956.field4005), this::method7659));
        this.field1652 = this.method450(new Class252("PlaceWallRange", "Range to place crystals through walls", (Number)Float.valueOf(Class4119.field9551), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(6.0f), this::method7366));
        this.field1685 = this.method450(new Class260("Swap", "Swaps to an end crystal before placing if the player is not holding one", Class637.field3112, AutoCrystal.method7160(), this::method7189));
        this.field1739 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values(), this::method7645));
        this.field1752 = this.method450(new Class260("Placements", "Version standard for placing end crystals", Class627.field3065, AutoCrystal.method7105(), this::method7287));
        this.field1688 = this.method450(new Class260("Sequential", "Places a crystal after spawn", Class604.field2939, Class604.values(), this::method7643));
        this.field1725 = this.method450(new Class253("ForcePlace", "Allow min damage", (boolean)field1656[2], this::method7128));
        this.field1650 = this.method450(new Class252("MinHealth", "If target's health lower than this", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(Class1691.field6269), this::method7330));
        this.field1745 = this.method450(new Class252("ForceDamage", "Turned to this", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), (Number)Float.valueOf(36.0f), this::method7492));
        this.field1676 = this.method450(new Class260("PlaceSwing", "Swing side for place crystal", Class480.field2509, Class480.values(), this::method7696));
        this.field1716 = this.method450(new Class253("Instant", "Instantly attacks crystals when they spawn", (boolean)field1656[2], this::method7125));
        this.field1724 = this.method450(new Class252("InstantDelay", "Delay to break crystals", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(50.0f), (Number)Float.valueOf(1000.0f), this::method7438));
        this.field1711 = this.method450(new Class253("Inhibit", "Prevents excessive attacks", (boolean)field1656[7], this::method7611));
        this.field1730 = this.method450(new Class252("BreakDelay", "Delay to break crystals", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(50.0f), (Number)Float.valueOf(1000.0f), this::method7202));
        this.field1679 = this.method450(new Class252("AttackDelay", "Added delays", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(5.0f), this::method7360));
        this.field1729 = this.method450(new Class252("AttackFactor", "Factor of attack delay", (Number)((int)field1656[2]), (Number)((int)field1656[2]), (Number)((int)field1656[10]), this::method7410));
        this.field1687 = this.method450(new Class252("AttackLimit", "The number of attacks before considering a crystal unbreakable", (Number)Float.valueOf(0.5f), (Number)Float.valueOf(Class1512.field5705), (Number)Float.valueOf(20.0f), this::method7327));
        this.field1722 = this.method450(new Class253("Timeout", "Uses attack latency to calculate break delays", (boolean)field1656[2], this::method7606));
        this.field1648 = this.method450(new Class252("BreakTimeout", "Time after waiting for the average break time before considering a crystal attack failed", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(3.0f), (Number)Float.valueOf(Class3685.field8264), this::method7230));
        this.field1667 = this.method450(new Class252("MinTimeout", "Minimum time before considering a crystal break/place failed", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(5.0f), (Number)Float.valueOf(20.0f), this::method7431));
        this.field1718 = this.method450(new Class252("TicksExisted", "Minimum ticks alive to consider crystals for attack", (Number)((int)field1656[2]), (Number)((int)field1656[2]), (Number)((int)field1656[4]), this::method7416));
        this.field1665 = this.method450(new Class252("BreakRange", "Range to break crystals", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(6.0f), this::method7527));
        this.field1735 = this.method450(new Class252("BreakWallRange", "Range to break crystals through walls", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(Class3895.field8866), (Number)Float.valueOf(6.0f), this::method7402));
        this.field1666 = this.method450(new Class260("BreakSwing", "Swing side for attack crystal", Class480.field2509, Class480.values(), this::method7338));
        this.field1686 = this.method450(new Class260("Rotate", "Rotate before placing and breaking", Class584.field2846, Class584.values(), this::method7532));
        this.field1654 = this.method450(new Class260("YawStep", "Rotates yaw over multiple ticks to prevent certain rotation flags in NCP", Class572.field2800, Class572.values(), this::method7465));
        this.field1743 = this.method450(new Class252("YawStep-Limit", "Maximum yaw rotation in degrees for one tick", (Number)((int)field1656[7]), (Number)((int)field1656[0]), (Number)((int)field1656[0]), Class619.field3016, this::method7070));
        this.field1723 = this.method450(new Class253("WhileUsing", "Allows actions while using items", (boolean)field1656[2], this::method7587));
        this.field1715 = this.method450(new Class253("WhileMining", "Allows attacking while mining blocks", (boolean)field1656[7], this::method7184));
        this.field1757 = this.method450(new Class252("SwapPenalty", "Delay for attacking after swapping items which prevents NCP flags", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), this::method7077));
        this.field1677 = this.method450(new Class260("ShieldMode", "How to consider shields", Class536.field2653, Class536.values(), this::method7436));
        this.field1695 = this.method450(new Class253("AntiSurround", "Places on mining blocks that when broken, can be placed on to damage enemies. Instantly destroys items spawned from breaking block and allows faster placing", (boolean)field1656[2], this::method7700));
        this.field1749 = this.method450(new Class253("PrePlacement", "Places on surrounding blocks to block place", (boolean)field1656[2], this::method7698));
        this.field1681 = this.method450(new Class253("CevBomber", "Places on mining blocks", (boolean)field1656[2], this::method7107));
        this.field1713 = this.method450(new Class252("CevDamage", "Minimum damage", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(8.0f), (Number)Float.valueOf(10.0f), this::method7201));
        this.field1658 = this.method450(new Class252("MiningProgress", "The progress of mining", (Number)0.0, (Number)80.0, (Number)100.0, this::method7254));
        this.field1682 = this.method450(new Class253("ResetCrystal", "Attack blocker crystal", (boolean)field1656[2], this::method7406));
        this.field1704 = this.method450(new Class253("ArmorBreaker", "Attempts to break enemy armor with crystals", (boolean)field1656[7], this::method7496));
        this.field1708 = this.method450(new Class252("ArmorScale", "Armor damage scale before attempting to break enemy armor with crystals", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class6282.field12869), (Number)Float.valueOf(Class5814.field11331), Class619.field3012, this::method7381));
        this.field1690 = this.method450(new Class253("Asynchronous", "Performs calculations on separate threads", (boolean)field1656[7], this::method7288));
        this.field1649 = this.method450(new Class252("EnemyRange", "Range to search for potential enemies", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(10.0f), (Number)Float.valueOf(13.0f), this::method7444));
        this.field1668 = this.method450(new Class253("IgnoreNakeds", "Ignore players with no items", (boolean)field1656[2], this::method7578));
        this.field1660 = this.method450(new Class252("MinDamage", "Minimum damage required to consider attacking or placing an end crystal", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(Class1182.field4691), this::method7567));
        this.field1675 = this.method450(new Class252("MaxLocalDamage", "The maximum player damage", (Number)Float.valueOf(4.0f), (Number)Float.valueOf(12.0f), (Number)Float.valueOf(Class747.field3381), this::method7443));
        this.field1736 = this.method450(new Class252("DamageRatio", "Max self damage ratio", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(1.2f), (Number)Float.valueOf(2.0f), this::method7231));
        this.field1684 = this.method450(new Class253("Instant-Calc", "Calculates a crystal when it spawns and attacks if it meets MINIMUM requirements, this will result in non-ideal crystal attacks", (boolean)field1656[2], this::method7199));
        this.field1702 = this.method450(new Class252("InstantDamage", "Minimum damage to attack crystals instantly", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class4012.field9216), (Number)Float.valueOf(10.0f), this::method7130));
        this.field1709 = this.method450(new Class253("InstantMax", "Attacks crystals instantly if they exceed the previous max attack damage (Note: This is still not a perfect check because the next tick could have better damages)", (boolean)field1656[7], this::method7307));
        this.field1712 = this.method450(new Class253("IgnoreItem", "Attempts to replace crystals in surrounds", (boolean)field1656[2], this::method7073));
        this.field1726 = this.method450(new Class253("AssumeBestArmor", "Assumes Prot 0 armor is max armor", (boolean)field1656[2], this::method7467));
        this.field1674 = this.method450(new Class252("LethalMultiplier", "If we can kill an enemy with this many crystals, disregard damage values", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.5f), (Number)Float.valueOf(4.0f), this::method7601));
        this.field1651 = this.method450(new Class253("Lethal-Totem", "Predicts totems and places crystals to instantly double pop and kill the target", (boolean)field1656[2], this::method7192));
        this.field1697 = this.method450(new Class253("Lethal-DamageTick", "Places lethal crystals only on ticks where they damage entities", (boolean)field1656[2], this::method7676));
        this.field1670 = this.method450(new Class253("Safety", "Accounts for total player safety when attacking and placing crystals", (boolean)field1656[7], this::method7633));
        this.field1683 = this.method450(new Class253("SafetyOverride", "Overrides the safety checks if the crystal will kill an enemy", (boolean)field1656[2], this::method7440));
        this.field1741 = this.method450(new Class253("BlockDestruction", "Accounts for explosion block destruction when calculating damages", (boolean)field1656[2], this::method7181));
        this.field1671 = this.method450(new Class253("SelfExtrapolate", "Accounts for motion when calculating self damage", (boolean)field1656[2], this::method7208));
        this.field1748 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating enemy positions, not fully accurate", (Number)((int)field1656[2]), (Number)((int)field1656[2]), (Number)((int)field1656[4]), this::method7423));
        this.field1705 = this.method450(new Class253("Players", "Target players", (boolean)field1656[7], this::method7138));
        this.field1655 = this.method450(new Class253("Monsters", "Target monsters", (boolean)field1656[2], this::method7592));
        this.field1680 = this.method450(new Class253("Neutrals", "Target neutrals", (boolean)field1656[2], this::method7166));
        this.field1753 = this.method450(new Class253("Animals", "Target animals", (boolean)field1656[2], this::method7325));
        this.field1669 = this.method450(new Class253("Shulkers", "Target shulker boxes", (boolean)field1656[2], this::method7516));
        this.field1747 = this.method450(new Class253("Support", "Auto place of crystal base(obsidian)", (boolean)field1656[2], this::method7569));
        this.field1721 = this.method450(new Class253("Base-Rotate", "Place block with rotation", (boolean)field1656[2], this::method7318));
        this.field1707 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1656[2], this::method7593));
        this.field1733 = this.method450(new Class252("Base-Delay", "Delay to place base", (Number)((int)field1656[7]), (Number)((int)field1656[12]), (Number)((int)field1656[6]), this::method7375));
        this.field1759 = this.method450(new Class252("MaxOverride", "Base can be placed when the crystal damage is below the set value", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(6.0f), (Number)Float.valueOf(36.0f), this::method7339));
        this.field1755 = this.method450(new Class260("Base-SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values(), this::method7561));
        this.field1732 = this.method450(new Class260("Render", "Renders the current placement", Class613.field2984, Class613.values(), this::method7157));
        this.field1693 = this.method450(new Class260("BoxMode", "Box rendering mode", Class570.field2792, Class570.values(), this::method7453));
        this.field1734 = this.method450(new Class251("BoxColor", "The box color", new Color((int)field1656[1], (int)field1656[1], (int)field1656[1], (int)field1656[3]), this::method7262));
        this.field1756 = this.method450(new Class251("FillColor", "The fill color", new Color((int)field1656[1], (int)field1656[1], (int)field1656[1], (int)field1656[8]), this::method7576));
        this.field1731 = this.method450(new Class252("Width", "The line width of the highlight", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(5.0f), this::method7093));
        this.field1696 = this.method450(new Class253("Shrink", "Shrink", (boolean)field1656[2], this::method7096));
        this.field1663 = this.method450(new Class252("SliderSpeed", "Slider speed", (Number)0.1, (Number)Class1282.field4999, (Number)1.0, this::method7200));
        this.field1703 = this.method450(new Class252("StartFade", "Time of waiting for fade", (Number)Class3339.field7210, (Number)0.2, (Number)1.0, this::method7203));
        this.field1754 = this.method450(new Class252("FadeSpeed", "Fade speed", (Number)0.1, (Number)0.3, (Number)1.0, this::method7087));
        this.field1698 = this.method450(new Class252("Fade-Time", "Timer for the fade", (Number)((int)field1656[2]), (Number)((int)field1656[9]), (Number)((int)field1656[11]), this::method7446));
        this.field1737 = this.method450(new Class253("RenderDamage", "Renders damage", (boolean)field1656[2], this::method7256));
        this.field1691 = this.method450(new Class253("TargetDamage", "Target's damage", (boolean)field1656[7], this::method7261));
        this.field1673 = this.method450(new Class253("SelfDamage", "My damage", (boolean)field1656[2], this::method7519));
        this.field1662 = this.method450(new Class253("TargetName", "Displayed content", (boolean)field1656[7], this::method7116));
        this.field1744 = this.method450(new Class253("Damage", "Displayed content", (boolean)field1656[7], this::method7123));
        this.field1742 = this.method450(new Class253("BreakMs", "Displayed content", (boolean)field1656[2], this::method7614));
        this.field1738 = this.method450(new Class253("Suffix", "Adds \"ms\"", (boolean)field1656[7], this::method7426));
        this.field1710 = this.method450(new Class253("CPS", "crystal per second", (boolean)field1656[2], this::method7295));
        this.method447(this.field1536);
        Class3815.INSTANCE.method18546(new Class5460());
        INSTANCE = this;
    }

    private static Object method7180(Class248 class248) {
        return class248.method507();
    }

    private Boolean method7181() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static boolean method7182(Class523 class523) {
        return class523.method10863();
    }

    public boolean method7183(class_2338 a2) {
        return (this.method7226(a2) && this.method7314(a2) ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private Boolean method7184() {
        return ((Class523)((Object)this.field1653.method507())).method10869();
    }

    public static Class248 method7185(AutoCrystal class419) {
        return class419.field1688;
    }

    private static boolean method7186(AutoCrystal class419, class_2338 class_23382) {
        return class419.method7183(class_23382);
    }

    private static void method7187() {
        Class5836.method22897();
    }

    private static class_746 method7188(class_310 class_3102) {
        return AutoCrystal.method7113(class_3102);
    }

    private Boolean method7189() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static void method7190(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method7191() {
        Class1745.method15538();
    }

    private Boolean method7192() {
        return AutoCrystal.method7534((Class523)((Object)AutoCrystal.method7427(this.field1653)));
    }

    private static int method7193(int n2, int n3, Class3935 class3935, Class1251 class1251) {
        return Class4011.method19963(n2, n3, class3935, class1251);
    }

    private static class_1268 method7194(AutoCrystal class419) {
        return class419.method7635();
    }

    private static boolean method7195(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static Class248 method7196(AutoCrystal class419) {
        return class419.field1752;
    }

    private static void method7197() {
        Chams.method1924();
    }

    private static void method7198() {
        Class1745.method15538();
    }

    private Boolean method7199() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private Boolean method7200() {
        return (((Class613)((Object)this.field1732.method507())).method11316() && ((Class523)((Object)this.field1653.method507())).method10861() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private Boolean method7201() {
        return ((Class523)((Object)AutoCrystal.method7471(this).method507())).method10869();
    }

    private Boolean method7202() {
        return AutoCrystal.method7468((Class523)((Object)this.field1653.method507()));
    }

    private Boolean method7203() {
        int n2;
        if (((Class613)((Object)this.field1732.method507())).method11316()) {
            if (!AutoCrystal.method7119((Class523)((Object)this.field1653.method507()))) {
                Class5836.method22885();
                return null;
            }
            n2 = (int)field1656[7];
        } else {
            n2 = (int)field1656[2];
        }
        return n2 != 0;
    }

    public static Class248 method7204(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7205() {
        Class5836.method22897();
    }

    public static Class248 method7206(AutoCrystal class419) {
        return class419.field1741;
    }

    private static void method7207() {
        Class6009.method23560();
    }

    private Boolean method7208() {
        return AutoCrystal.method7482((Class523)((Object)this.field1653.method507()));
    }

    public static Class248 method7209(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7210() {
        Class5659.method22184();
    }

    private static int method7211(int n2, int n3, Phase class445, Class704 class704) {
        return Class4011.method19759(n2, n3, class445, class704);
    }

    private static class_243 method7212(AutoCrystal class419, class_2338 class_23382) {
        return class419.method7667(class_23382);
    }

    public static class_746 method7213(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method7214(AutoCrystal class419) {
        return class419.field1716;
    }

    public static Class572 method7215() {
        return Class572.field2797;
    }

    private boolean method7216(Class5457 b2) {
        double c2 = ((Float)this.field1660.method507()).floatValue();
        class_1297 class_12972 = b2.method21137();
        if (class_12972 instanceof class_1309) {
            class_1309 a2 = (class_1309)class_12972;
            c2 = this.method7250(a2);
            if (!this.method7280(b2, a2)) {
                return Velocity.method10322();
            }
            c2 = Class5691.field10939;
        }
        return (b2.method21140() < c2 ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    public static AutoCrystal method7217() {
        return AutoCrystal.method7173();
    }

    private Boolean method1269() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static Object method7218(Class248 class248) {
        return class248.method507();
    }

    private static void method7219(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method7220(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7221(AutoCrystal class419, Class5457 class5457) {
        return class419.method7216(class5457);
    }

    private static boolean method7222() {
        return Class3979.method19543();
    }

    public static Class604 method7223() {
        return Class604.field2940;
    }

    private boolean method7224(double b2) {
        if (!AutoCrystal.method7104(field290).method_7337()) {
            float a2 = AutoCrystal.field290.field_1724.method_6032() + AutoCrystal.field290.field_1724.method_6067();
            if (((Boolean)this.field1670.method507()).booleanValue() && b2 >= (double)(a2 - Class2034.field6782)) {
                return (int)field1656[7] != 0;
            }
            return (b2 > (double)((Float)AutoCrystal.method7545(AutoCrystal.method7598(this))).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
        }
        return (int)field1656[2] != 0;
    }

    private static boolean method7225() {
        return Class1807.method15769();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public boolean method7226(class_2338 a2) {
        int n2;
        class_2338 b2 = a2.method_10084();
        class_2680 c2 = AutoCrystal.field290.field_1687.method_8320(b2);
        if (AutoCrystal.method7196(this).method507() == Class627.field3066) {
            if (!AutoCrystal.field290.field_1687.method_22347(b2.method_10084())) return (int)field1656[2] != 0;
        }
        class_1511 d2 = this.method7412(b2);
        if (!AutoCrystal.method7623(field290).method_22347(b2)) {
            if (!c2.method_27852(class_2246.field_10036)) {
                return (int)field1656[2] != 0;
            }
            if (c2.method_27852(AutoCrystal.method7337())) {
                if (d2 == null) return (int)field1656[2] != 0;
            }
            if (d2 != null && !d2.method_24515().equals((Object)b2)) {
                return (int)field1656[2] != 0;
            }
        }
        int n3 = this.method7085(a2.method_10084()) ? 53520 : 53521;
        block8: while (true) {
            switch (n3) {
                case 53521: {
                    n3 = 53519;
                    continue block8;
                }
                case 53520: {
                    if (this.method7085(a2.method_10086((int)field1656[14]))) {
                        return Class3979.method19551();
                    }
                    int n4 = 57975;
                    block9: while (true) {
                        switch (n4) {
                            case 57975: {
                                n4 = 57973;
                                continue block9;
                            }
                            case 57974: {
                                n2 = (int)field1656[7];
                                return n2 != 0;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static void method7227() {
        Class1807.method15744();
    }

    private static void method7228(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Unable to fully structure code
     */
    private boolean method7229() {
        block9: {
            block5: {
                block8: {
                    block7: {
                        block4: {
                            block6: {
                                if (((Boolean)AutoCrystal.method7434(this.field1723)).booleanValue()) break block6;
                                v0 = 29600;
                                ** GOTO lbl9
                            }
                            v0 = 29601;
                            if (true) ** GOTO lbl9
                            do {
                                v0 = var1_1 = 29599;
lbl9:
                                // 3 sources

                                if (var1_1 == 29600) break block4;
                            } while (var1_1 == 29601);
                            break block7;
                        }
                        if (this.method6626()) ** GOTO lbl-1000
                    }
                    if (((Boolean)this.field1715.method507()).booleanValue()) break block8;
                    v1 = 30322;
                    ** GOTO lbl23
                }
                v1 = 30323;
                if (true) ** GOTO lbl23
                do {
                    v1 = var2_2 = 30321;
lbl23:
                    // 3 sources

                    if (var2_2 == 30322) break block5;
                } while (var2_2 == 30323);
                break block9;
            }
            if (AutoCrystal.field290.field_1761.method_2923()) ** GOTO lbl-1000
        }
        if (Blink.method4987()) lbl-1000:
        // 3 sources

        {
            v2 = (int)AutoCrystal.field1656[7];
        } else {
            v2 = (int)AutoCrystal.field1656[2];
        }
        return (boolean)v2;
    }

    private Boolean method7230() {
        if (((Boolean)this.field1722.method507()).booleanValue() && AutoCrystal.method7117((Class523)((Object)this.field1653.method507()))) {
            int n2 = (int)field1656[7];
            Class4036.method20085(0.9145912f, Class3602.field8039, 0.819055f, 0.42342234f, Class6251.field12784, 0.89575046f);
            return null;
        }
        return (boolean)field1656[2];
    }

    private Boolean method7231() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static boolean method7232(int n2) {
        return Class4196.method20803(n2);
    }

    public static Map method7233(AutoCrystal class419) {
        return class419.field1694;
    }

    private static void method7234() {
        Class1807.method15744();
    }

    private static void method7235() {
        Class3979.method19561();
    }

    private static void method7236() {
        Class1503.method14420();
    }

    private static class_638 method7237(class_310 class_3102) {
        return AutoCrystal.method7398(class_3102);
    }

    private static void method7238(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method7239() {
        Class1807.method15744();
    }

    private static int method7240(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    public static Class5457 method7241(AutoCrystal class419) {
        return class419.field1717;
    }

    private static void method7242(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private boolean method7243(Class607 a2) {
        return (a2 == Class607.field2954 || a2 == Class607.field2955 ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static void method7244() {
        Class1807.method15744();
    }

    public static Class248 method7245(AutoCrystal class419) {
        return class419.field1704;
    }

    private static int method7246(int n2, int n3, ESP class360, Class778 class778) {
        return Class4011.method19874(n2, n3, class360, class778);
    }

    @Class1
    public void method7247(Class63 a2) {
        if (AutoCrystal.method7270(field290) == null || AutoCrystal.field290.field_1687 == null || AutoCrystal.field290.field_1724.method_7325() || a2.method128() != Class543.field2691) {
            return;
        }
        if (((Boolean)this.field1690.method507()).booleanValue()) {
            this.field1661.submit(this::method7514);
        }
    }

    private static void method7248() {
        Chams.method1924();
    }

    private static double method7249(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double method7250(class_1309 e2) {
        if (((Boolean)this.field1725.method507()).booleanValue() && Class1158.method13135((class_1297)e2) <= ((Float)AutoCrystal.method7075(this).method507()).floatValue() && !PistonCrystal.method8010().method1265()) {
            return ((Float)this.field1745.method507()).floatValue();
        }
        if (!((Boolean)AutoCrystal.method7245(this).method507()).booleanValue()) {
            return ((Float)AutoCrystal.method7556(AutoCrystal.method7301(this))).floatValue();
        }
        Iterator iterator = e2.method_5661().iterator();
        while (iterator.hasNext()) {
            class_1799 d2 = (class_1799)iterator.next();
            int a2 = d2.method_7919();
            int b2 = d2.method_7936();
            float c2 = (float)(b2 - a2) / (float)b2 * 100.0f;
            int n2 = c2 < ((Float)this.field1708.method507()).floatValue() ? 35724 : 35725;
            block5: while (true) {
                switch (n2) {
                    case 35725: {
                        n2 = 35723;
                        continue block5;
                    }
                    case 35724: {
                        return 1.5;
                    }
                }
                break;
            }
        }
        return ((Float)AutoCrystal.method7556(AutoCrystal.method7301(this))).floatValue();
    }

    public static double method7251(class_238 class_2383) {
        return class_2383.field_1321;
    }

    public static Class248 method7252(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7253(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private Boolean method7254() {
        return ((Class523)((Object)AutoCrystal.method7599(this).method507())).method10869();
    }

    private static int method7255(AutoCrystal class419) {
        return class419.method7641();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method7256() {
        int n2;
        int n3 = !((Class613)((Object)this.field1732.method507())).method11313() ? 25548 : 25547;
        block4: while (true) {
            switch (n3) {
                case 25548: {
                    n3 = 25546;
                    continue block4;
                }
                case 25547: {
                    if (!((Class523)((Object)this.field1653.method507())).method10861()) break block4;
                    n2 = (int)field1656[7];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static Object method7257(Class248 class248) {
        return class248.method507();
    }

    private static Object method7258(Class248 class248) {
        return class248.method507();
    }

    private static class_243 method7259(AutoCrystal class419, class_2338 class_23382, class_2350 class_23502) {
        return class419.method7131(class_23382, class_23502);
    }

    public static void method7260(AutoCrystal class419, Class5457 class5457) {
        class419.field1720 = class5457;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method7261() {
        int n2;
        if (((Class613)((Object)this.field1732.method507())).method11313()) {
            int n3 = (Boolean)this.field1737.method507() != false ? 6202 : 6203;
            block4: while (true) {
                switch (n3) {
                    case 6203: {
                        n3 = 6201;
                        continue block4;
                    }
                    case 6202: {
                        if (!AutoCrystal.method7596((Class523)((Object)this.field1653.method507()))) break block4;
                        n2 = (int)field1656[7];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private Boolean method7262() {
        return (((Class613)((Object)AutoCrystal.method7424(this).method507())).method11313() && ((Class523)((Object)this.field1653.method507())).method10861() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static Object method7263(Class248 class248) {
        return class248.method507();
    }

    private static Object method7264(Class248 class248) {
        return class248.method507();
    }

    public static Class5457 method7265(AutoCrystal class419) {
        return class419.field1720;
    }

    private boolean method7266(class_1511 a2) {
        class_243 b2 = this.method7488(a2.method_5829());
        double c2 = this.method7302().method_1022(b2);
        if (Class5659.method22162((class_1297)a2)) {
            return (c2 <= (double)((Float)this.field1665.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
        }
        return (c2 <= (double)((Float)this.field1735.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    public static Class248 method7267(AutoCrystal class419) {
        return class419.field1685;
    }

    private static void method7268() {
        Class1503.method14420();
    }

    private static Object method7269(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method7270(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method7271() {
        Class6009.method23560();
    }

    private boolean method7272(boolean e2, double f2, class_1309 g2) {
        if (((Boolean)this.field1725.method507()).booleanValue() && !(Class1158.method13135((class_1297)g2) > ((Float)AutoCrystal.method7112(this).method507()).floatValue()) && !PistonCrystal.method8010().method1265()) {
            return Class5659.method22150(Class6046.field12146, 0.9929090609938385, 0.8693026958005858);
        }
        return (int)field1656[2] != 0;
    }

    private static void method7273(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public class_1297 method7274() {
        Class5457 a2 = this.field1720;
        if (this.field1717 != null) {
            return this.field1717.method21137();
        }
        if (a2 != null) {
            return a2.method21137();
        }
        return null;
    }

    private static Class248 method7275(AutoCrystal class419) {
        return AutoCrystal.method7521(class419);
    }

    public static Class248 method7276(AutoCrystal class419) {
        return class419.field1653;
    }

    private static boolean method7277() {
        return Velocity.method10322();
    }

    private static void method7278(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method7279() {
        Class1807.method15744();
    }

    private boolean method7280(Class5457 a2, class_1309 b2) {
        return this.method7316(a2.method21140(), b2);
    }

    private static int method7281(int n2, int n3, Class3336 class3336, Class6066 class6066) {
        return Class4011.method19671(n2, n3, class3336, class6066);
    }

    private static boolean method7282(Class613 class613) {
        return class613.method11313();
    }

    private static void method7283() {
        Class5836.method22890();
    }

    private static void method7284() {
        Class1807.method15744();
    }

    public static Map method7285(AutoCrystal class419) {
        return class419.field1751;
    }

    private static boolean method7286(Class523 class523) {
        return class523.method10875();
    }

    private Boolean method7287() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private Boolean method7288() {
        return AutoCrystal.method7146((Class523)((Object)this.field1653.method507()));
    }

    private static boolean method7289() {
        return Blink.method4987();
    }

    public static Class248 method7290(AutoCrystal class419) {
        return class419.field1671;
    }

    private static void method7291() {
        Class6454.method24594();
    }

    private static boolean method7292(class_1297 class_12972) {
        return Class1158.method13110(class_12972);
    }

    private static void method7293(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method7294(int n2, int n3, Class4110 class4110, AutoXP class446) {
        return Class4011.method19935(n2, n3, class4110, class446);
    }

    private Boolean method7295() {
        return AutoCrystal.method7703((Class523)((Object)this.field1653.method507()));
    }

    private static int method7296(int n2, int n3, Class5688 class5688, Class4218 class4218) {
        return Class4011.method19728(n2, n3, class5688, class4218);
    }

    public class_243 method7297(class_243 a2) {
        class_238 b2 = field1701.method_997(a2);
        return Class5449.method21096(this.method7302(), b2);
    }

    private static int method7298(int n2, int n3, Class2297 class2297, Class5931 class5931) {
        return Class4011.method19913(n2, n3, class2297, class5931);
    }

    private static void method7299() {
        Class6454.method24594();
    }

    private static boolean method7300() {
        return Class4196.method20801();
    }

    public static Class248 method7301(AutoCrystal class419) {
        return class419.field1660;
    }

    private class_243 method7302() {
        return AutoCrystal.field290.field_1724.method_33571();
    }

    private static void method7303() {
        Class4146.method20697();
    }

    private static double method7304(double d2, double d3, double d4) {
        return Class5659.method22110(d2, d3, d4);
    }

    private static boolean method7305(AutoCrystal class419, double d2) {
        return class419.method7224(d2);
    }

    @Override
    public void method1279() {
        AutoCrystal.method7602(this, null);
        this.field1717 = null;
        AutoCrystal.method7607(this, null);
        this.field1672 = null;
        this.field1664 = null;
        this.field1751.clear();
        this.field1694.clear();
        this.field1700.clear();
        AutoCrystal.method7359(this).clear();
        this.field1750.clear();
    }

    private boolean method7306(double a2, double b2, boolean c2) {
        if (!c2) {
            if (!((Boolean)this.field1683.method507()).booleanValue()) {
                return Replenish.method6431();
            }
            return (int)field1656[2] != 0;
        }
        return (a2 / b2 < (double)((Float)this.field1736.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private Boolean method7307() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static long method7308(Class727 class727, class_1297 class_12972) {
        return class727.method11909(class_12972);
    }

    private static void method7309() {
        Class4146.method20697();
    }

    private static Class248 method7310(AutoCrystal class419) {
        return AutoCrystal.method7169(class419);
    }

    private static boolean method7311() {
        return Velocity.method10322();
    }

    private List method7312(double f2, class_243 g2) {
        ArrayList<class_2338> h2 = new ArrayList<class_2338>();
        double e2 = -f2;
        if (e2 <= f2) {
            double d2 = -f2;
            if (!(d2 <= f2)) {
                Class6009.method23561();
                return null;
            }
            double c2 = -f2;
            while (true) {
                if (!(c2 <= f2)) {
                    AutoCrystal.method7647();
                    return null;
                }
                class_2382 a2 = new class_2382((int)(g2.method_10216() + e2), (int)(g2.method_10214() + d2), (int)(g2.method_10215() + c2));
                class_2338 b2 = new class_2338(a2);
                h2.add(b2);
                c2 += 1.0;
            }
        }
        return h2;
    }

    private static void method7313(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    private boolean method7314(class_2338 a2) {
        if (!this.method7102(a2.method_10084().method_61082())) {
            return (int)field1656[2] != 0;
        }
        class_2350 b2 = Class1745.method15561(a2, ((Float)this.field1692.method507()).floatValue());
        if (b2 == null) {
            return (int)field1656[2] != 0;
        }
        class_243 c2 = Class1745.method15658(a2, b2);
        double d2 = this.method7302().method_1022(c2);
        if (Class5659.method22115(c2)) {
            return (d2 <= (double)((Float)this.field1692.method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
        }
        return (d2 <= (double)((Float)AutoCrystal.method7403(this).method507()).floatValue() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static boolean method7315(double d2) {
        return Class5659.method22193(d2);
    }

    private boolean method7316(double c2, class_1309 d2) {
        if (((Boolean)this.field1697.method507()).booleanValue()) {
            if (AutoCrystal.method7377(this.field1728, (int)field1656[16])) {
                return (int)field1656[7] != 0;
            }
        }
        if (((Boolean)this.field1651.method507()).booleanValue() && AutoCrystal.method7455(this, c2, d2)) {
            return (int)field1656[7] != 0;
        }
        float e2 = d2.method_6032() + d2.method_6067();
        if (c2 * (double)(1.0f + ((Float)this.field1674.method507()).floatValue()) >= (double)(e2 + Class4002.field9183)) {
            return (int)field1656[7] != 0;
        }
        if (((Boolean)AutoCrystal.method7594(this).method507()).booleanValue()) {
            if (d2 instanceof class_1657) {
                for (class_2338 b2 : this.method7312(3.0, d2.method_19538())) {
                    class_2680 a2 = AutoCrystal.field290.field_1687.method_8320(b2);
                    if (!(a2.method_26204() instanceof class_2480)) continue;
                    return (int)field1656[7] != 0;
                }
            }
        }
        return (int)field1656[2] != 0;
    }

    private static void method7317() {
        Class1503.method14420();
    }

    private Boolean method7318() {
        return ((Class523)((Object)this.field1653.method507())).method10850();
    }

    private static double method7319(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5659.method22181(d2, d3, d4, d5, d6, d7);
    }

    private static void method7320() {
        Class1503.method14420();
    }

    public static Class248 method7321(AutoCrystal class419) {
        return class419.field1653;
    }

    public static Class926 method7322(AutoCrystal class419) {
        return class419.field1728;
    }

    private static boolean method7323() {
        return Class5659.method22111();
    }

    private static void method7324() {
        Class5659.method22184();
    }

    private Boolean method7325() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static void method7326() {
        Class5836.method22897();
    }

    private Boolean method7327() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method7328() {
        int n2;
        if (!this.method7229() && this.method7155((Class637)((Object)AutoCrystal.method7267(this).method507()))) {
            int n3 = this.field1664 != null ? 19296 : 19297;
            block4: while (true) {
                switch (n3) {
                    case 19297: {
                        n3 = 19295;
                        continue block4;
                    }
                    case 19296: {
                        if (!this.field1664.method18523()) break block4;
                        return (int)field1656[7] != 0;
                    }
                }
                break;
            }
        }
        if (AutoCrystal.method7068(this) != null) {
            n2 = (int)field1656[7];
            return n2 != 0;
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static void method7329() {
        Class5836.method22897();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method7330() {
        int n2;
        if (((Boolean)AutoCrystal.method7609(this.field1725)).booleanValue() && ((Class523)((Object)AutoCrystal.method7389(this.field1653))).method10849()) {
            n2 = (int)field1656[7];
            return n2 != 0;
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static void method7331(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7332(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method7333(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method7334() {
        Class5836.method22890();
    }

    public static class_746 method7335(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method7336(Class248 class248) {
        return class248.method507();
    }

    public static class_2248 method7337() {
        return class_2246.field_10036;
    }

    private Boolean method7338() {
        return AutoCrystal.method7115((Class523)((Object)this.field1653.method507()));
    }

    private Boolean method7339() {
        return ((Class523)((Object)this.field1653.method507())).method10850();
    }

    public static class_1268 method7340() {
        return class_1268.field_5810;
    }

    private static void method7341(AutoCrystal class419, class_1511 class_15112, class_1268 class_12682) {
        class419.method7677(class_15112, class_12682);
    }

    private static void method7342() {
        Class5836.method22890();
    }

    private static Class248 method7343(AutoCrystal class419) {
        return AutoCrystal.method7209(class419);
    }

    private static boolean method7344() {
        return Class5836.method22894();
    }

    private static boolean method7345() {
        return Replenish.method6431();
    }

    public static Class760 method7346() {
        return Class5723.field11049;
    }

    private void method7347(class_2596 j2) {
        class_2767 f2;
        Object object;
        if (j2 instanceof class_2664) {
            class_2664 c2 = (class_2664)j2;
            object = Lists.newArrayList((Iterable)AutoCrystal.method7475(field290).method_18112()).iterator();
            while (object.hasNext()) {
                class_1297 b2 = (class_1297)object.next();
                if (!(b2 instanceof class_1511)) continue;
                if (!(b2.method_5649(c2.method_11475(), c2.method_11477(), c2.method_11478()) < Class1149.field4602)) continue;
                field290.method_40000(() -> AutoCrystal.method7656(b2));
                AutoCrystal.method7699(this).remove(b2.method_5628());
                Long a2 = (Long)this.field1751.remove(b2.method_5628());
                if (a2 == null) continue;
                this.field1689.add(System.currentTimeMillis() - a2);
            }
        }
        if (j2 instanceof class_2767 && (f2 = (class_2767)j2).method_11894().comp_349() == class_3417.field_15152.comp_349() && f2.method_11888() == AutoCrystal.method7140() && (object = Lists.newArrayList((Iterable)AutoCrystal.method7237(field290).method_18112()).iterator()).hasNext()) {
            class_1297 e2 = (class_1297)object.next();
            if (!(e2 instanceof class_1511)) {
                Class4146.method20694();
                return;
            }
            int n2 = 47446;
            Class4146.method20697();
            return;
        }
        if (j2 instanceof class_2716) {
            class_2716 i2 = (class_2716)j2;
            object = i2.method_36548().iterator();
            while (true) {
                if (!object.hasNext()) {
                    Class1668.method15147(76734279, 232279471, -915892987, 1243604088);
                    return;
                }
                int h2 = (Integer)object.next();
                this.field1694.remove(h2);
                Long g2 = (Long)this.field1751.remove(h2);
                if (g2 == null) continue;
                this.field1689.add(System.currentTimeMillis() - g2);
            }
        }
    }

    private static FastLatency method7348() {
        return FastLatency.method3873();
    }

    private static boolean method7349() {
        return Class5836.method22894();
    }

    private static Object method7350(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method7351(Class205 b2) {
        if (AutoCrystal.field290.field_1724 == null) {
            return;
        }
        class_1268 c2 = this.method7635();
        if ((double)((Float)AutoCrystal.method7671(this.field1679)).floatValue() > 0.0) {
            float a2 = 50.0f / Math.max(1.0f, (float)((Integer)this.field1729.method507()).intValue());
            if (this.field1717 != null && this.field1728.method12595(Float.valueOf(((Float)this.field1679.method507()).floatValue() * a2))) {
                this.method7677((class_1511)this.field1717.method21141(), c2);
                this.field1728.method12593();
            }
        }
    }

    private static void method7352() {
        Class5836.method22890();
    }

    private static void method7353() {
        Class4146.method20697();
    }

    public static Class248 method7354(AutoCrystal class419) {
        return class419.field1653;
    }

    public static class_746 method7355(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Unable to fully structure code
     */
    private boolean method7356(class_1297 a) {
        block10: {
            block7: {
                block8: {
                    block9: {
                        if (a instanceof class_1657 && ((Boolean)this.field1705.method507()).booleanValue()) break block8;
                        if (!AutoCrystal.method7163(a)) break block9;
                        if (((Boolean)this.field1655.method507()).booleanValue()) break block8;
                    }
                    if (!Class1158.method13121(a)) {
                        return Class1807.method15769();
                    }
                    v0 = 37184;
                    if (true) ** GOTO lbl11
                    block4: while (true) {
                        v0 = 37183;
lbl11:
                        // 2 sources

                        switch (v0) {
                            case 37185: {
                                continue block4;
                            }
                            case 37184: {
                                if (((Boolean)this.field1680.method507()).booleanValue()) break block4;
                            }
                            default: {
                                if (AutoCrystal.method7292(a) && ((Boolean)this.field1753.method507()).booleanValue()) {
                                    break block4;
                                }
                                break block7;
                            }
                        }
                        break;
                    }
                }
                v1 = (int)AutoCrystal.field1656[7];
                break block10;
            }
            v1 = (int)AutoCrystal.field1656[2];
        }
        return (boolean)v1;
    }

    private static void method7357() {
        Class4146.method20697();
    }

    private static void method7358() {
        Class5836.method22890();
    }

    public static Deque method7359(AutoCrystal class419) {
        return class419.field1689;
    }

    private Boolean method7360() {
        return ((Class523)((Object)AutoCrystal.method7252(this).method507())).method10868();
    }

    private static void method7361() {
        Class6009.method23560();
    }

    private static double method7362(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    public static class_746 method7363(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static double method7364(Class5457 a2) {
        return AutoCrystal.method7668(field290).method_5707(a2.method21136().method_46558());
    }

    private static boolean method7365() {
        return Velocity.method10322();
    }

    private Boolean method7366() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static boolean method7367() {
        return Class3979.method19543();
    }

    private static void method7368(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method7369(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static SpeedMine method7370() {
        return SpeedMine.method8407();
    }

    private static void method7371() {
        Class5836.method22897();
    }

    private static void method7372() {
        Class5836.method22890();
    }

    public static Class584 method7373() {
        return Class584.field2851;
    }

    private void method7374(class_1511 a2, class_1268 b2) {
        this.method7590(a2.method_5628(), b2);
    }

    private Boolean method7375() {
        return AutoCrystal.method7441((Class523)((Object)this.field1653.method507()));
    }

    private static void method7376() {
        Class5836.method22890();
    }

    private static boolean method7377(Class926 class926, Number number) {
        return class926.method12595(number);
    }

    private static boolean method7378() {
        return Class3979.method19551();
    }

    private static void method7379(Class926 class926, Number number) {
        class926.method12599(number);
    }

    private static void method7380() {
        Class1807.method15744();
    }

    private Boolean method7381() {
        return ((Boolean)this.field1704.method507() != false && ((Class523)((Object)AutoCrystal.method7269(this.field1653))).method10869() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static boolean method7382(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method7383() {
        Class5659.method22184();
    }

    private static boolean method7384(Class523 class523) {
        return class523.method10863();
    }

    private static double method7385(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    public static Class248 method7386(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7387() {
        Class6009.method23560();
    }

    private static void method7388(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object method7389(Class248 class248) {
        return class248.method507();
    }

    private static void method7390(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method7391() {
        Class4146.method20697();
    }

    private static void method7392() {
        Class6454.method24594();
    }

    private static int method7393(int n2, int n3, Class1745 class1745, Class693 class693) {
        return Class4011.method19718(n2, n3, class1745, class693);
    }

    private static void method7394(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method7395(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7396(AutoCrystal class419) {
        return class419.field1688;
    }

    private static void method7397(float f2) {
        Class5836.method22907(f2);
    }

    public static class_638 method7398(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method7399() {
        Class1503.method14420();
    }

    private static int method7400(int n2, int n3, Class3797 class3797, Class29 class29) {
        return Class4011.method19958(n2, n3, class3797, class29);
    }

    private static void method7401() {
        Class3979.method19561();
    }

    private Boolean method7402() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    public static Class248 method7403(AutoCrystal class419) {
        return class419.field1652;
    }

    private static boolean method7404(AntiWeakness class297) {
        return class297.method1857();
    }

    private static void method7405() {
        Chams.method1924();
    }

    private Boolean method7406() {
        return ((Class523)((Object)this.field1653.method507())).method10869();
    }

    private static Object method7407(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7408(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7409() {
        Class4146.method20697();
    }

    private Boolean method7410() {
        return ((double)((Float)this.field1679.method507()).floatValue() > 0.0 && ((Class523)((Object)AutoCrystal.method7486(AutoCrystal.method7321(this)))).method10868() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static Object method7411(Class248 class248) {
        return class248.method507();
    }

    private class_1511 method7412(class_2338 a2) {
        return AutoCrystal.field290.field_1687.method_8335(null, new class_238(a2)).stream().filter(AutoCrystal::method7688).min(Comparator.comparingDouble(AutoCrystal::method7536)).orElse(null);
    }

    private static boolean method7413(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static Class5457 method7414(AutoCrystal class419) {
        return class419.field1717;
    }

    private static void method7415() {
        Class6009.method23561();
    }

    private Boolean method7416() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    private static Class248 method7417(AutoCrystal class419) {
        return AutoCrystal.method7204(class419);
    }

    private static void method7418() {
        Class4146.method20697();
    }

    private static void method7419() {
        Class1807.method15744();
    }

    private static Object method7420(Class248 class248) {
        return class248.method507();
    }

    private static void method7421() {
        Class4146.method20694();
    }

    private static void method7422() {
        Chams.method1924();
    }

    private Boolean method7423() {
        return AutoCrystal.method7429((Class523)((Object)AutoCrystal.method7354(this).method507()));
    }

    public static Class248 method7424(AutoCrystal class419) {
        return class419.field1732;
    }

    private static boolean method7425(AutoCrystal class419, double d2) {
        return class419.method7224(d2);
    }

    private Boolean method7426() {
        return ((Class523)((Object)this.field1653.method507())).method10861();
    }

    private static Object method7427(Class248 class248) {
        return class248.method507();
    }

    private static Object method7428(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7429(Class523 class523) {
        return class523.method10863();
    }

    public static class_746 method7430(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method7431() {
        return (((Boolean)this.field1722.method507()).booleanValue() && ((Class523)((Object)this.field1653.method507())).method10868() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    public static Class248 method7432(AutoCrystal class419) {
        return class419.field1741;
    }

    private static int method7433(int n2, int n3, HUD class339, Class5717 class5717) {
        return Class4011.method19947(n2, n3, class339, class5717);
    }

    private static Object method7434(Class248 class248) {
        return class248.method507();
    }

    private static void method7435() {
        Class5659.method22184();
    }

    private Boolean method7436() {
        return ((Class523)((Object)AutoCrystal.method7525(this.field1653))).method10869();
    }

    private static Object method7437(Class248 class248) {
        return class248.method507();
    }

    private Boolean method7438() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    private static void method7439() {
        Class3979.method19561();
    }

    private Boolean method7440() {
        return AutoCrystal.method7586((Class523)((Object)AutoCrystal.method7408(this).method507()));
    }

    private static boolean method7441(Class523 class523) {
        return class523.method10850();
    }

    private static void method7442(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private Boolean method7443() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private Boolean method7444() {
        return AutoCrystal.method7566((Class523)((Object)this.field1653.method507()));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Class5457 method7445(List E, List F) {
        if (E.isEmpty() != false) return null;
        if (F.isEmpty()) {
            return null;
        }
        G = new ArrayList<Class5457>();
        H = null;
        var5_5 = E.iterator();
        block24: while (true) {
            block56: {
                block57: {
                    block55: {
                        if (!var5_5.hasNext()) break block55;
                        D = (class_2338)var5_5.next();
                        if (!AutoCrystal.method7186(this, D)) continue;
                        y = this.method7546(D);
                        z = (int)AutoCrystal.field1656[2];
                        A = null;
                        if (y) break block56;
                        if (!((Boolean)this.field1747.method507()).booleanValue()) continue;
                        v0 = this.field1758.method12595((Number)AutoCrystal.method7100(this.field1733)) ? 41861 : 41862;
                        break block57;
                    }
                    if (H != null && !this.method7216(H)) {
                        Class3979.method19561();
                        return null;
                    }
                    if ((Boolean)AutoCrystal.method7089(this.field1695) == false) return null;
                    return G.stream().filter((Predicate<Class5457>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method21142(), (Lmapped/Class5457;)Z)()).min(Comparator.comparingDouble((ToDoubleFunction<Class5457>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method7364(mapped.Class5457 ), (Lmapped/Class5457;)D)())).orElse(null);
                }
                block25: while (true) {
                    switch (v0) {
                        default: {
                            continue block24;
                        }
                        case 41862: {
                            v0 = 41860;
                            continue block25;
                        }
                        case 41861: 
                    }
                    break;
                }
                if (H != null && AutoCrystal.method7618(H) == null && !(AutoCrystal.method7649(H) <= (double)((Float)AutoCrystal.method7411(this.field1759)).floatValue()) || !(A = new Class3442(D, class_1802.field_8281, (boolean)((Boolean)this.field1707.method507()), (Class607)AutoCrystal.method7577(this).method507())).method17405(((Float)this.field1692.method507()).floatValue(), (boolean)AutoCrystal.field1656[2])) continue;
                z = (int)AutoCrystal.field1656[7];
            }
            v1 = AutoCrystal.method7081(AutoCrystal.field290);
            v2 = (Boolean)AutoCrystal.method7206(this).method507();
            v3 = (Boolean)this.field1671.method507() != false ? 38848 : 38849;
            block26: while (true) {
                switch (v3) {
                    case 38849: {
                        v3 = 38847;
                        continue block26;
                    }
                    case 38848: {
                        v4 = (Integer)this.field1748.method507();
                        break block26;
                    }
                    default: {
                        v4 = (int)AutoCrystal.field1656[2];
                    }
                }
                break;
            }
            B = AutoCrystal.method7544(this, (class_1297)v1, D, v2, v4, (boolean)AutoCrystal.field1656[2]);
            C = AutoCrystal.method7305(this, B);
            if (C && !((Boolean)AutoCrystal.method7493(this).method507()).booleanValue()) continue;
            var13_12 = F.iterator();
            block27: while (true) {
                block59: {
                    block51: {
                        block52: {
                            block58: {
                                if (var13_12.hasNext()) ** break;
                                continue block24;
                                x = (class_1297)var13_12.next();
                                if (x == null || !x.method_5805() || x == AutoCrystal.field290.field_1724 || !this.method7356(x) || Class5723.field11045.method21243(x.method_5477())) continue;
                                if (x instanceof class_1309) {
                                    a = (class_1309)x;
                                    if (!((Boolean)AutoCrystal.method7350(this.field1668)).booleanValue()) {
                                        Class4036.method20085(0.8682174f, 0.35163152f, 0.9605299f, 0.39607352f, Class5722.field11038, Class3286.field7066);
                                        return null;
                                    }
                                    if (Class5659.method22180(a)) continue;
                                }
                                if ((t = D.method_19770((class_2374)x.method_19538())) > 144.0) continue;
                                u = AutoCrystal.field290.field_1724.method_5858(x);
                                v5 = u > (double)(((Float)AutoCrystal.method7478(this).method507()).floatValue() * ((Float)this.field1649.method507()).floatValue()) ? 9955 : 9956;
                                block28: while (true) {
                                    switch (v5) {
                                        case 9956: {
                                            v5 = 9954;
                                            continue block28;
                                        }
                                        case 9955: {
                                            continue block27;
                                        }
                                    }
                                    break;
                                }
                                v = (int)AutoCrystal.field1656[2];
                                if (!((Boolean)this.field1749.method507()).booleanValue() || !(x instanceof class_1657) || AutoCrystal.method7448((c = (class_1657)x).method_24515())) break block51;
                                b = Class5659.method22125(c, D.method_10084(), (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[2], (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[2]);
                                if (!b) break block58;
                                v6 = 40406;
                                ** GOTO lbl85
                            }
                            v6 = 40407;
                            if (true) ** GOTO lbl85
                            do {
                                v6 = var23_22 = 40405;
lbl85:
                                // 3 sources

                                if (var23_22 != 40406) continue;
                                if (this.method7412(D.method_10084()) != null) break block51;
                                break block52;
                            } while (var23_22 == 40407);
                            break block51;
                        }
                        v = (int)AutoCrystal.field1656[7];
                    }
                    if (!((Boolean)AutoCrystal.method7697(this.field1695)).booleanValue() || !(x instanceof class_1657) || Class5595.method21942((n = (class_1657)x).method_24515())) break block59;
                    l = new HashSet<class_2338>();
                    m = AutoCrystal.method7370().method8460();
                    if (SpeedMine.method8407().method1265() && m != null) {
                        l.add(m);
                    }
                    block30: for (class_2338 k : l) {
                        block53: {
                            block54: {
                                block60: {
                                    j = AutoCrystal.method7642(n, k, (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[7]);
                                    if (!D.equals((Object)k)) break block53;
                                    if (!j) break block60;
                                    v7 = 43908;
                                    ** GOTO lbl110
                                }
                                v7 = 43909;
                                if (true) ** GOTO lbl110
                                do {
                                    v7 = var28_28 = 43907;
lbl110:
                                    // 3 sources

                                    if (var28_28 != 43908) continue;
                                    if (!((Boolean)this.field1681.method507()).booleanValue()) break block53;
                                    break block54;
                                } while (var28_28 == 43909);
                                break block53;
                            }
                            d = AutoCrystal.method7144((class_1297)n, this.method7667(k), (Boolean)this.field1741.method507(), Set.of(k), (Integer)AutoCrystal.method7101(this.field1748), (Boolean)this.field1726.method507());
                            if (d >= (double)((Float)AutoCrystal.method7159(this.field1713)).floatValue() && this.method7412(k.method_10084()) == null && AutoCrystal.method7510(SpeedMine.method8407().field1918) >= (Double)this.field1658.method507() / 100.0) {
                                this.method7481(n, k);
                                break;
                            }
                        }
                        if (!Class5659.method22125(n, k, (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[2], (boolean)AutoCrystal.field1656[7], (boolean)AutoCrystal.field1656[2])) continue;
                        var31_30 = Class5449.field10190;
                        var32_31 = var31_30.length;
                        block32: for (var33_32 = (int)AutoCrystal.field1656[2]; var33_32 < var32_31; ++var33_32) {
                            i = var31_30[var33_32];
                            g = k.method_10093(i);
                            if (!D.equals((Object)g.method_10074())) {
                                Chams.method1924();
                                return null;
                            }
                            v8 = SpeedMine.method8407().field1918.field10393 >= (Double)this.field1658.method507() / 100.0 ? 12546 : 12547;
                            block33: while (true) {
                                switch (v8) {
                                    case 12547: {
                                        v8 = 12545;
                                        continue block33;
                                    }
                                    case 12546: {
                                        if (AutoCrystal.method7122(this, D.method_10084()) != null) break block33;
                                        v = (int)AutoCrystal.field1656[7];
                                        continue block30;
                                    }
                                }
                                break;
                            }
                            h = k.method_10074();
                            var37_36 = Class5449.field10187;
                            var38_37 = var37_36.length;
                            block34: for (var39_38 = (int)AutoCrystal.field1656[2]; var39_38 < var38_37; ++var39_38) {
                                f = var37_36[var39_38];
                                e = h.method_10093(f);
                                v9 = D.equals((Object)e.method_10074()) != false ? 55597 : 55598;
                                while ((var42_41 = v9) != 55597) {
                                    if (var42_41 != 55598) continue block34;
                                    v9 = 55596;
                                }
                                if (!(SpeedMine.method8407().field1918.field10393 >= (Double)AutoCrystal.method7437(this.field1658) / 100.0)) {
                                    Class4146.method20694();
                                    return null;
                                }
                                if (AutoCrystal.method7603(this, D.method_10084()) != null) continue;
                                v = (int)AutoCrystal.field1656[7];
                                continue block32;
                            }
                        }
                    }
                }
                if (x instanceof class_1657 && this.method7529(p = (class_1657)x, (o = D.method_10084()).method_61082())) continue;
                w = this.method7584(x, D, (Boolean)this.field1741.method507(), (Integer)this.field1748.method507(), (Boolean)AutoCrystal.method7141(this.field1726));
                if (x instanceof class_1309) {
                    r = (class_1309)x;
                    q = this.method7272(C, w, r);
                    if (v == 0 && this.method7306(w, B, q) || q) continue;
                }
                if (z != 0) {
                    if (H != null && !(w > H.method21140())) continue;
                    H = new Class5457(D, x, w, B, D, (boolean)v, A);
                    continue;
                }
                s = new Class5457(D, x, w, B, D, (boolean)v, null);
                G.add(s);
                if (H != null) {
                    if (w > H.method21140()) {
                        v10 = 26134;
                        AutoCrystal.method7644();
                        return null;
                    }
                    v11 = 26133;
                    block36: while (true) {
                        switch (v11) {
                            case 26134: {
                                v11 = 26132;
                                continue block36;
                            }
                            case 26133: {
                                if (H.method21139() == null) continue block27;
                                if (!(w > (double)((Float)this.field1759.method507()).floatValue())) {
                                    Class1503.method14420();
                                    return null;
                                }
                                v12 = 45519;
                                block37: while (true) {
                                    switch (v12) {
                                        case 45520: {
                                            v12 = 45518;
                                            continue block37;
                                        }
                                        ** case 45519:
                                        default: {
                                            continue block27;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
lbl198:
                // 4 sources

                H = s;
            }
            break;
        }
    }

    private Boolean method7446() {
        return (((Class613)((Object)this.field1732.method507())).method11306() && ((Class523)((Object)this.field1653.method507())).method10861() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static void method7447() {
        Class6009.method23561();
    }

    private static boolean method7448(class_2338 class_23382) {
        return Class5595.method21942(class_23382);
    }

    private static void method7449() {
        Class4146.method20697();
    }

    @Override
    public String method1248() {
        return this.method7162();
    }

    private static Object method7450(Class248 class248) {
        return class248.method507();
    }

    private static Object method7451(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method7452(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method7453() {
        return (((Class613)((Object)this.field1732.method507())).method11313() && ((Class523)((Object)this.field1653.method507())).method10861() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static void method7454(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method7455(AutoCrystal class419, double d2, class_1309 class_13092) {
        return class419.method7097(d2, class_13092);
    }

    public static Class248 method7456(AutoCrystal class419) {
        return class419.field1722;
    }

    private static Object method7457(Class5457 class5457) {
        return class5457.method21141();
    }

    public float method7458() {
        return ((Float)AutoCrystal.method7711(this.field1730)).floatValue();
    }

    public static Class248 method7459(AutoCrystal class419) {
        return class419.field1657;
    }

    private static int method7460(int n2, int n3, Class209 class209, Class3647 class3647) {
        return Class4011.method19799(n2, n3, class209, class3647);
    }

    private static void method7461() {
        Class5836.method22885();
    }

    private static int method7462(int n2, int n3, Class3977 class3977, Class1153 class1153) {
        return Class4011.method19821(n2, n3, class3977, class1153);
    }

    private static void method7463(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method7464(AutoCrystal class419) {
        return class419.field1653;
    }

    private Boolean method7465() {
        return (this.field1686.method507() != Class584.field2851 && ((Class523)((Object)this.field1653.method507())).method10875() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static boolean method7466(int n2) {
        return Class4196.method20803(n2);
    }

    private Boolean method7467() {
        return AutoCrystal.method7518((Class523)((Object)this.field1653.method507()));
    }

    private static boolean method7468(Class523 class523) {
        return class523.method10868();
    }

    public static class_1297.class_5529 method7469() {
        return class_1297.class_5529.field_26999;
    }

    public static class_638 method7470(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class248 method7471(AutoCrystal class419) {
        return class419.field1653;
    }

    private static void method7472(class_1297 a2) {
        AutoCrystal.field290.field_1687.method_2945(a2.method_5628(), AutoCrystal.method7469());
    }

    private static void method7473() {
        Class6009.method23560();
    }

    private static Class248 method7474(AutoCrystal class419) {
        return AutoCrystal.method7153(class419);
    }

    public static class_638 method7475(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method7476(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7477(AutoCrystal class419) {
        return class419.field1667;
    }

    private static Class248 method7478(AutoCrystal class419) {
        return AutoCrystal.method7692(class419);
    }

    private static Object method7479(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method7480(Class131 a2) {
        if (AutoCrystal.method7188(field290) == null) {
            return;
        }
        if (a2.method251() instanceof class_2868) {
            this.field1714.method12593();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void method7481(class_1657 a, class_2338 b) {
        block6: {
            block5: {
                block4: {
                    if (a == null || a.method_29504() || !this.method7314(b)) break block4;
                    if (this.method7546(b)) break block5;
                }
                return;
            }
            c = Class5905.method23249((class_1297)AutoCrystal.field290.field_1724, AutoCrystal.method7212(this, b), (Boolean)this.field1741.method507(), Set.of(b), ((Boolean)this.field1671.method507()).booleanValue() ? (Integer)this.field1748.method507() : (int)AutoCrystal.field1656[2], (boolean)AutoCrystal.field1656[2]);
            if (!this.method7224(c)) break block6;
            v0 = 52277;
            ** GOTO lbl15
        }
        v0 = 52278;
        if (true) ** GOTO lbl15
        do {
            v0 = var5_4 = 52276;
lbl15:
            // 3 sources

            if (var5_4 != 52277) continue;
            Class6322.method24332(0.43909764f, 0.8630867f);
            return;
        } while (var5_4 == 52278);
        d = AutoCrystal.method7194(this);
        e = Class1745.method15561(b, ((Float)this.field1692.method507()).floatValue());
        f = this.method7131(b, e) != null ? AutoCrystal.method7148(this, b, e) : b.method_46558();
        g = Class1503.method14416(this.method7302(), f);
        this.method6465(g[(int)AutoCrystal.field1656[2]], g[(int)AutoCrystal.field1656[7]]);
        AutoCrystal.method7651(this, b, d, (boolean)AutoCrystal.field1656[7]);
        this.field1750.put(b, new Class6283((boolean)AutoCrystal.field1656[7], ((Integer)AutoCrystal.method7552(this.field1698)).intValue()));
        this.field1706 = b;
    }

    private static boolean method7482(Class523 class523) {
        return class523.method10863();
    }

    private static boolean method7483(Class523 class523) {
        return class523.method10875();
    }

    private static void method7484() {
        Class4146.method20694();
    }

    private static void method7485() {
        Class1503.method14420();
    }

    private static Object method7486(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method7487(AutoCrystal class419) {
        return AutoCrystal.method7276(class419);
    }

    public class_243 method7488(class_238 a2) {
        class_243 b2 = Class5449.method21103(new class_238(a2.field_1323 + Class5624.field10747, a2.field_1322, AutoCrystal.method7251(a2) + 0.5, a2.field_1320 - 0.5, a2.field_1322, a2.field_1324 - Class1574.field5879));
        double c2 = this.method7302().method_1022(b2);
        if (c2 <= (double)((Float)this.field1665.method507()).floatValue()) {
            return b2;
        }
        return Class5449.method21103(a2);
    }

    private static boolean method7489(AutoCrystal class419, Class607 class607) {
        return class419.method7243(class607);
    }

    private static boolean method7490() {
        return Class3979.method19544();
    }

    private static void method7491() {
        Class5836.method22897();
    }

    private Boolean method7492() {
        return ((Boolean)this.field1725.method507() != false && AutoCrystal.method7495((Class523)((Object)AutoCrystal.method7386(this).method507())) ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    public static Class248 method7493(AutoCrystal class419) {
        return class419.field1683;
    }

    private static void method7494() {
        Class4146.method20694();
    }

    private static boolean method7495(Class523 class523) {
        return class523.method10849();
    }

    private Boolean method7496() {
        return ((Class523)((Object)AutoCrystal.method7218(this.field1653))).method10869();
    }

    private static Object method7497(Class248 class248) {
        return class248.method507();
    }

    private static void method7498() {
        Class5659.method22184();
    }

    private static boolean method7499(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static Class248 method7500(AutoCrystal class419) {
        return class419.field1670;
    }

    private static boolean method7501(Class523 class523) {
        return class523.method10849();
    }

    private static void method7502(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7503(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7504(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7505() {
        Class5836.method22890();
    }

    private static void method7506() {
        Class5836.method22885();
    }

    public static AntiWeakness method7507() {
        return AntiWeakness.INSTANCE;
    }

    private static int method7508(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method7509(long l2) {
        AutoCrystal.field1656[14] = l2 ^ 0xC5BB0B4BF2A339B8L;
        AutoCrystal.field1656[7] = l2 ^ 0xC5BB0B4BF2A339BBL;
        AutoCrystal.field1656[0] = l2 ^ 0xC5BB0B4BF2A3390EL;
        AutoCrystal.field1656[2] = l2 ^ 0xC5BB0B4BF2A339BAL;
        AutoCrystal.field1656[5] = l2 ^ 0xC5BB0B4BF2A33B54L;
        AutoCrystal.field1656[9] = l2 ^ 0xC5BB0B4BF2A33940L;
        AutoCrystal.field1656[12] = l2 ^ 0xC5BB0B4BF2A339BEL;
        AutoCrystal.field1656[16] = l2 ^ 0xC5BB0B4BF2A3384EL;
        AutoCrystal.field1656[10] = l2 ^ 0xC5BB0B4BF2A339B9L;
        AutoCrystal.field1656[11] = l2 ^ 0xC5BB0B4BF2A33A52L;
        AutoCrystal.field1656[13] = l2 ^ 0x3A44F4B40D5CC645L;
        AutoCrystal.field1656[4] = l2 ^ 0xC5BB0B4BF2A339B0L;
        AutoCrystal.field1656[6] = l2 ^ 0xC5BB0B4BF2A339AEL;
        AutoCrystal.field1656[1] = l2 ^ 0xC5BB0B4BF2A33945L;
        AutoCrystal.field1656[8] = l2 ^ 0xC5BB0B4BF2A339FCL;
        AutoCrystal.field1656[3] = l2 ^ 0xC5BB0B4BF2A339DEL;
        AutoCrystal.field1656[15] = l2 ^ 0xC5BB0B4BF2A33988L;
    }

    public static double method7510(Class5512 class5512) {
        return class5512.field10393;
    }

    private static void method7511() {
        Class5836.method22890();
    }

    private static void method7512() {
        Class4146.method20697();
    }

    private static void method7513(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void method7514() {
        block5: {
            ArrayList a2;
            block4: {
                int n2;
                a2 = Lists.newArrayList((Iterable)AutoCrystal.field290.field_1687.method_18112());
                if (((Boolean)AutoCrystal.method7612(AutoCrystal.method7459(this))).booleanValue()) {
                    int n3 = 31902;
                    Class6009.method23560();
                    return;
                }
                int n4 = 31903;
                boolean bl2 = true;
                do {
                    if (!bl2 || (bl2 = false) || !true) {
                        n4 = n2 = 31901;
                    }
                    if (n2 == 31902) break block4;
                } while (n2 == 31903);
                break block5;
            }
            if (this.method7328() && AutoCrystal.method7404(AntiWeakness.INSTANCE)) {
                this.field1720 = this.method7445(this.method7619(this.method7302()), a2);
                return;
            }
        }
        AutoCrystal.method7260(this, null);
    }

    private static void method7515(AutoCrystal class419, double d2) {
        AutoCrystal.method7658(class419, d2);
    }

    private Boolean method7516() {
        return ((Class523)((Object)AutoCrystal.method7257(this.field1653))).method10863();
    }

    public static class_746 method7517(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method7518(Class523 class523) {
        return class523.method10863();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method7519() {
        int n2;
        if (AutoCrystal.method7168((Class613)((Object)this.field1732.method507())) && ((Boolean)AutoCrystal.method7474(this).method507()).booleanValue()) {
            int n3 = ((Class523)((Object)this.field1653.method507())).method10861() ? 42905 : 42906;
            block4: while (true) {
                switch (n3) {
                    case 42906: {
                        n3 = 42904;
                        continue block4;
                    }
                    case 42905: {
                        n2 = (int)field1656[7];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field1656[2];
        return n2 != 0;
    }

    private static void method7520() {
        Class5836.method22890();
    }

    public static Class248 method7521(AutoCrystal class419) {
        return class419.field1748;
    }

    private static void method7522() {
        Class1503.method14420();
    }

    private static void method7523(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object method7524(Class248 class248) {
        return class248.method507();
    }

    private static Object method7525(Class248 class248) {
        return class248.method507();
    }

    private static class_2350 method7526(class_2338 class_23382, double d2) {
        return Class1745.method15561(class_23382, d2);
    }

    private Boolean method7527() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    private static void method7528() {
        Class6009.method23561();
    }

    private boolean method7529(class_1657 a2, class_243 b2) {
        if (this.field1677.method507() == Class536.field2653) {
            return (int)field1656[2] != 0;
        }
        return a2.method_6061(AutoCrystal.field290.field_1687.method_48963().method_48808(b2));
    }

    private static void method7530(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method7531(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private Boolean method7532() {
        return AutoCrystal.method7483((Class523)((Object)this.field1653.method507()));
    }

    public static Class248 method7533(AutoCrystal class419) {
        return class419.field1755;
    }

    private static boolean method7534(Class523 class523) {
        return class523.method10863();
    }

    private static void method7535() {
        Class6009.method23561();
    }

    private static double method7536(class_1297 a2) {
        return AutoCrystal.method7452(field290).method_5739(a2);
    }

    private static boolean method7537() {
        return Class3979.method19544();
    }

    public static class_746 method7538(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Map method7539(AutoCrystal class419) {
        return AutoCrystal.method7285(class419);
    }

    private static void method7540(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method7541(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7542() {
        Class1745.method15538();
    }

    private static void method7543() {
        Class5836.method22890();
    }

    private static double method7544(AutoCrystal class419, class_1297 class_12972, class_2338 class_23382, boolean bl2, int n2, boolean bl3) {
        return class419.method7584(class_12972, class_23382, bl2, n2, bl3);
    }

    private static Object method7545(Class248 class248) {
        return class248.method507();
    }

    public boolean method7546(class_2338 a2) {
        class_2680 b2 = AutoCrystal.method7076(field290).method_8320(a2);
        return (b2.method_27852(AutoCrystal.method7621()) || b2.method_27852(class_2246.field_9987) ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static int method7547(Class3850 class3850) {
        return class3850.method18969();
    }

    private static void method7548() {
        Class5836.method22890();
    }

    private double method7549(class_1297 a2, class_243 b2, boolean c2, int d2, boolean e2) {
        return Class5905.method23285(a2, b2, c2, d2, e2);
    }

    private static class_243 method7550(AutoCrystal class419) {
        return class419.method7302();
    }

    public static Class248 method7551(AutoCrystal class419) {
        return class419.field1649;
    }

    private static Object method7552(Class248 class248) {
        return class248.method507();
    }

    private static void method7553(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method7554() {
        Class1807.method15744();
    }

    private static void method7555() {
        Class5659.method22184();
    }

    private static Object method7556(Class248 class248) {
        return class248.method507();
    }

    private static void method7557(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method7558(Class248 class248) {
        return class248.method507();
    }

    public static class_1268 method7559() {
        return class_1268.field_5808;
    }

    private static int method7560(int n2, int n3, Class555 class555, Class1423 class1423) {
        return Class4011.method19707(n2, n3, class555, class1423);
    }

    private Boolean method7561() {
        return ((Class523)((Object)this.field1653.method507())).method10850();
    }

    public static class_746 method7562(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Map method7563(AutoCrystal class419) {
        return class419.field1700;
    }

    public boolean method7564() {
        return (AutoCrystal.method7265(this) != null && this.method7328() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static void method7565() {
        Chams.method1924();
    }

    private static boolean method7566(Class523 class523) {
        return class523.method10863();
    }

    private Boolean method7567() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static Object method7568(Class248 class248) {
        return class248.method507();
    }

    private Boolean method7569() {
        return ((Class523)((Object)this.field1653.method507())).method10850();
    }

    public static Class5457 method7570(AutoCrystal class419) {
        return class419.field1717;
    }

    public static class_638 method7571(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static void method7572(AutoCrystal class419, class_2338 class_23382) {
        class419.field1706 = class_23382;
    }

    public static Class248 method7573(AutoCrystal class419) {
        return class419.field1654;
    }

    private static void method7574(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method7575(AutoCrystal class419) {
        return class419.field1710;
    }

    private Boolean method7576() {
        return (AutoCrystal.method7282((Class613)((Object)this.field1732.method507())) && ((Class523)((Object)this.field1653.method507())).method10861() ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    private static Class248 method7577(AutoCrystal class419) {
        return AutoCrystal.method7533(class419);
    }

    private Boolean method7578() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static boolean method7579() {
        return Class1807.method15742();
    }

    private static void method7580() {
        Class1807.method15744();
    }

    private static void method7581() {
        Class6009.method23561();
    }

    private void method7582(class_3965 a2, class_1268 b2) {
        if (b2 == null) {
            return;
        }
        this.field1760.method12593();
        Class5723.field11048.method21353(arg_0 -> AutoCrystal.method7133(b2, a2, arg_0));
        ((Class480)((Object)this.field1676.method507())).method10782(b2);
    }

    private static Object method7583(Class248 class248) {
        return class248.method507();
    }

    private double method7584(class_1297 a2, class_2338 b2, boolean c2, int d2, boolean e2) {
        return Class5905.method23239(a2, this.method7667(b2), c2, d2, e2, b2);
    }

    private static boolean method7585(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method7586(Class523 class523) {
        return class523.method10863();
    }

    private Boolean method7587() {
        return ((Class523)((Object)this.field1653.method507())).method10869();
    }

    private static void method7588() {
        Class1745.method15538();
    }

    public static Map method7589(AutoCrystal class419) {
        return class419.field1694;
    }

    private void method7590(int a2, class_1268 b2) {
        this.field1760.method12593();
        if (b2 != null) {
            class_1268 class_12682 = b2;
            Class5836.method22907(0.75099105f);
            return;
        }
        b2 = class_1268.field_5808;
        class_1511 c2 = new class_1511((class_1937)AutoCrystal.field290.field_1687, 0.0, 0.0, 0.0);
        c2.method_5838(a2);
        class_2824 d2 = class_2824.method_34206((class_1297)c2, (boolean)AutoCrystal.method7615(field290).method_5715());
        Class5723.field11048.method21341((class_2596)d2);
        ((Class480)((Object)this.field1666.method507())).method10782(b2);
        AutoCrystal.method7539(this).put(a2, System.currentTimeMillis());
        Integer e2 = (Integer)AutoCrystal.method7589(this).get(a2);
        if (e2 != null) {
            this.field1694.replace(a2, e2 + (int)field1656[7]);
        } else {
            this.field1694.put(a2, (int)field1656[7]);
        }
        Class5723.field11056.field5507.method12593();
        Class1745.field6548 = (int)field1656[7];
    }

    private static void method7591(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method7592() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private Boolean method7593() {
        return ((Class523)((Object)this.field1653.method507())).method10850();
    }

    public static Class248 method7594(AutoCrystal class419) {
        return class419.field1669;
    }

    private static void method7595() {
        Class1745.method15538();
    }

    private static boolean method7596(Class523 class523) {
        return class523.method10861();
    }

    private static void method7597() {
        Class1745.method15538();
    }

    public static Class248 method7598(AutoCrystal class419) {
        return class419.field1675;
    }

    public static Class248 method7599(AutoCrystal class419) {
        return class419.field1653;
    }

    private static boolean method7600() {
        return Class5659.method22194();
    }

    private Boolean method7601() {
        return ((Class523)((Object)AutoCrystal.method7487(this).method507())).method10863();
    }

    public static void method7602(AutoCrystal class419, class_2338 class_23382) {
        class419.field1706 = class_23382;
    }

    private static class_1511 method7603(AutoCrystal class419, class_2338 class_23382) {
        return class419.method7412(class_23382);
    }

    private static void method7604(float f2) {
        Class5836.method22907(f2);
    }

    public static void method7605(AutoCrystal class419, class_243 class_2432) {
        class419.field1672 = class_2432;
    }

    private Boolean method7606() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    public static void method7607(AutoCrystal class419, Class5457 class5457) {
        class419.field1720 = class5457;
    }

    private static void method7608(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method7609(Class248 class248) {
        return class248.method507();
    }

    @Class1(priority=0x7FFFFFFF)
    public void method7610(Class133 c2) {
        if (AutoCrystal.field290.field_1724 == null || AutoCrystal.method7571(field290) == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (!(class_25962 instanceof class_8042)) {
            Class6009.method23559(false);
            return;
        }
        class_8042 b2 = (class_8042)class_25962;
        for (class_2596 a2 : b2.method_48324()) {
            this.method7347(a2);
        }
    }

    private Boolean method7611() {
        return ((Class523)((Object)this.field1653.method507())).method10868();
    }

    private static Object method7612(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7613(int n2) {
        return Class4196.method20803(n2);
    }

    private Boolean method7614() {
        return ((Class523)((Object)this.field1653.method507())).method10861();
    }

    public static class_746 method7615(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method7616(AutoCrystal class419) {
        return class419.field1730;
    }

    private static void method7617(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Class3442 method7618(Class5457 class5457) {
        return class5457.method21139();
    }

    private List method7619(class_243 a2) {
        double b2 = Math.ceil(((Float)this.field1692.method507()).floatValue() + 1.0f);
        return this.method7312(b2, a2);
    }

    private void method7620(class_1268 a2) {
        int c2;
        Class5457 b2 = this.field1720;
        if (b2 == null) {
            return;
        }
        if (b2.method21139() != null) {
            return;
        }
        int n2 = c2 = AutoCrystal.method7348().method1265() ? (int)FastLatency.method3873().method3880() : Class5723.field11048.method21368();
        if (!Class5723.field11048.method21346() || c2 >= (int)field1656[15]) {
            this.method7666(b2.method21136(), a2);
        }
    }

    public static class_2248 method7621() {
        return class_2246.field_10540;
    }

    private static boolean method7622() {
        return Class3979.method19543();
    }

    public static class_638 method7623(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method7624() {
        Class5836.method22897();
    }

    public static Class248 method7625(AutoCrystal class419) {
        return class419.field1671;
    }

    private static void method7626() {
        Class4146.method20694();
    }

    private static void method7627(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7628() {
        Class1745.method15538();
    }

    public static AntiWeakness method7629() {
        return AntiWeakness.INSTANCE;
    }

    private static Object method7630(Class248 class248) {
        return class248.method507();
    }

    public static void method7631(AutoCrystal class419, Class5457 class5457) {
        class419.field1717 = class5457;
    }

    private static void method7632() {
        Class4146.method20694();
    }

    private Boolean method7633() {
        return ((Class523)((Object)this.field1653.method507())).method10863();
    }

    private static int method7634(int n2, int n3, Class1719 class1719, Class77 class77) {
        return Class4011.method20003(n2, n3, class1719, class77);
    }

    /*
     * Enabled aggressive block sorting
     */
    private class_1268 method7635() {
        class_1799 a2 = AutoCrystal.field290.field_1724.method_6079();
        class_1799 b2 = AutoCrystal.field290.field_1724.method_6047();
        if (a2.method_7909() instanceof class_1774) {
            return class_1268.field_5810;
        }
        if (b2.method_7909() instanceof class_1774) {
            int n2 = 37311;
            AutoCrystal.method7632();
            return null;
        }
        int n3 = 37312;
        block4: while (true) {
            switch (n3) {
                case 37312: {
                    n3 = 37310;
                    continue block4;
                }
                case 37311: {
                    return class_1268.field_5808;
                }
            }
            break;
        }
        return null;
    }

    private static void method7636() {
        Class4146.method20697();
    }

    private static void method7637() {
        Class3979.method19561();
    }

    private static int method7638(int n2, int n3, Class12 class12, Class1034 class1034) {
        return Class4011.method19721(n2, n3, class12, class1034);
    }

    private static void method7639() {
        Chams.method1924();
    }

    private static class_1268 method7640() {
        return AutoCrystal.method7340();
    }

    public int method7641() {
        if (this.field1689.isEmpty()) {
            return (int)field1656[2];
        }
        float b2 = 0.0f;
        ArrayList c2 = Lists.newArrayList((Iterable)this.field1689);
        if (!c2.isEmpty()) {
            Iterator iterator = c2.iterator();
            while (iterator.hasNext()) {
                float a2 = ((Long)iterator.next()).longValue();
                b2 += a2;
            }
            b2 /= (float)c2.size();
        }
        return (int)b2;
    }

    private static boolean method7642(class_1657 class_16572, class_2338 class_23382, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        return Class5659.method22125(class_16572, class_23382, bl2, bl3, bl4, bl5);
    }

    private Boolean method7643() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static void method7644() {
        Class6009.method23561();
    }

    private Boolean method7645() {
        return (AutoCrystal.method7646(this).method507() != Class637.field3112 && AutoCrystal.method7501((Class523)((Object)this.field1653.method507())) ? (int)field1656[7] : (int)field1656[2]) != 0;
    }

    public static Class248 method7646(AutoCrystal class419) {
        return class419.field1685;
    }

    private static void method7647() {
        Class4146.method20697();
    }

    private boolean method7648(class_1268 a2) {
        if (!this.field1714.method12595(Float.valueOf(((Float)this.field1757.method507()).floatValue() * 25.0f))) {
            return (int)field1656[7] != 0;
        }
        if (a2 == class_1268.field_5808) {
            return this.method7229();
        }
        return (int)field1656[2] != 0;
    }

    private static double method7649(Class5457 class5457) {
        return class5457.method21140();
    }

    private static void method7650() {
        Class5836.method22897();
    }

    private static void method7651(AutoCrystal class419, class_2338 class_23382, class_1268 class_12682, boolean bl2) {
        class419.method7669(class_23382, class_12682, bl2);
    }

    private static Object method7652(Class248 class248) {
        return class248.method507();
    }

    private static int method7653(int n2, int n3, Class6154 class6154, Class6053 class6053) {
        return Class4011.method19943(n2, n3, class6154, class6053);
    }

    private static void method7654() {
        Class6009.method23561();
    }

    private static int method7655(int n2) {
        return Class4045.method20105(n2);
    }

    private static void method7656(class_1297 a2) {
        AutoCrystal.field290.field_1687.method_2945(a2.method_5628(), class_1297.class_5529.field_26999);
    }

    private static boolean method7657(int n2) {
        return Class4196.method20803(n2);
    }

    public static void method7658(AutoCrystal class419, double d2) {
        class419.field1740 = d2;
    }

    private Boolean method7659() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static void method7660(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method7661(int n2, int n3, Class709 class709, PacketLogger class342) {
        return Class4011.method19644(n2, n3, class709, class342);
    }

    private static void method7662(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method7663() {
        Class6009.method23560();
    }

    private static int method7664(int n2, int n3, Class1150 class1150, Class760 class760) {
        return Class4011.method19896(n2, n3, class1150, class760);
    }

    private static boolean method7665(AutoCrystal class419, class_2338 class_23382) {
        return class419.method7546(class_23382);
    }

    private void method7666(class_2338 a2, class_1268 b2) {
        if ((this.method6469() || !this.field1746) && ((Class584)((Object)AutoCrystal.method7310(this).method507())).method11164()) {
            return;
        }
        if (!AutoCrystal.method7629().method1857()) {
            return;
        }
        this.method7669(a2, b2, (boolean)field1656[7]);
    }

    private class_243 method7667(class_2338 a2) {
        return a2.method_10084().method_61082();
    }

    static {
        ___.___(1, AutoCrystal.class);
        ____.___1_8480(AutoCrystal.class);
    }

    public static class_746 method7668(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public void method7669(class_2338 b2, class_1268 c2, boolean d2) {
        class_2350 e2;
        if (d2) {
            if (this.method7229()) {
                return;
            }
        }
        if ((e2 = AutoCrystal.method7526(b2, ((Float)this.field1692.method507()).floatValue())) == null) {
            return;
        }
        class_243 f2 = this.method7131(b2, e2) != null ? AutoCrystal.method7259(this, b2, e2) : b2.method_46558();
        class_3965 g2 = new class_3965(f2, e2, b2, (boolean)field1656[2]);
        if (this.method7155((Class637)((Object)this.field1685.method507())) && c2 != AutoCrystal.method7640() && this.method7635() == null || AutoCrystal.method7489(this, (Class607)((Object)this.field1739.method507()))) {
            int a2 = AutoCrystal.method7547(Class5723.field11058);
            AutoCrystal.method7313(this.field1664, a2);
            if (this.field1685.method507() != Class637.field3113) {
                Class5659.method22184();
                return;
            }
            if (this.field1739.method507() == Class607.field2953) {
                AutoCrystal.method7213((class_310)AutoCrystal.field290).method_31548().field_7545 = AutoCrystal.method7156(this.field1664);
            }
            this.method7582(g2, AutoCrystal.method7559());
            AutoCrystal.method7111(this).put(b2, System.currentTimeMillis());
            if (this.field1685.method507() == Class637.field3111) {
                this.field1664.method18534(a2);
            }
        } else if (this.method7635() != null) {
            this.method7582(g2, c2);
            AutoCrystal.method7563(this).put(b2, System.currentTimeMillis());
        }
    }

    private static void method7670() {
        Class4146.method20697();
    }

    private static Object method7671(Class248 class248) {
        return class248.method507();
    }

    private static void method7672() {
        Class1745.method15538();
    }

    private static boolean method7673(AutoCrystal class419) {
        return class419.method7229();
    }

    private static void method7674() {
        Class1745.method15538();
    }

    public static Map method7675(AutoCrystal class419) {
        return class419.field1751;
    }

    private Boolean method7676() {
        return AutoCrystal.method7384((Class523)((Object)this.field1653.method507()));
    }

    public void method7677(class_1511 a2, class_1268 b2) {
        if (this.method7648(b2)) {
            return;
        }
        if (AutoCrystal.method7507().method1857()) {
            this.method7374(a2, b2);
            if (AutoCrystal.method7185(this).method507() == Class604.field2942) {
                this.method7620(b2);
            }
        }
    }

    private static class_746 method7678(class_310 class_3102) {
        return AutoCrystal.method7355(class_3102);
    }

    private static class_2338 method7679(Class5457 class5457) {
        return class5457.method21136();
    }

    private static void method7680(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method7681(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7682(AutoCrystal class419) {
        return class419.field1654;
    }

    private static void method7683() {
        Class4146.method20694();
    }

    private static int method7684(int n2, int n3, Class626 class626, Class1197 class1197) {
        return Class4011.method19968(n2, n3, class626, class1197);
    }

    private static boolean method7685() {
        return Velocity.method10252();
    }

    private static boolean method7686() {
        return Class1807.method15769();
    }

    private static boolean method7687(double d2) {
        return Class5659.method22193(d2);
    }

    private static native boolean method7688(class_1297 var0);

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private Class5457 method7689(List p2) {
        boolean n2;
        double m2;
        class_1511 j2;
        class_1297 o2;
        if (p2.isEmpty()) {
            return null;
        }
        Class5457 q2 = null;
        Iterator iterator = p2.iterator();
        block8: while (true) {
            int l2;
            block25: {
                int n3;
                if (!iterator.hasNext()) {
                    return null;
                }
                o2 = (class_1297)iterator.next();
                if (o2 instanceof class_1511) {
                    int n4 = 53697;
                    while (true) {
                        // Infinite loop
                    }
                }
                int n5 = 53698;
                boolean bl2 = true;
                do {
                    if (!bl2 || (bl2 = false) || !true) {
                        n5 = n3 = 53696;
                    }
                    if (n3 != 53697) continue;
                    j2 = (class_1511)o2;
                    if (!o2.method_5805()) {
                        continue block8;
                    }
                    break block25;
                } while (n3 == 53698);
                Class6454.method24636(0.788150732427028, Class1576.field5887, 0.25693788363393455, 0.9018931000616023);
                return null;
            }
            Long k2 = (Long)this.field1751.get(o2.method_5628());
            if (k2 == null) {
                int n6 = 964;
                Class6454.method24594();
                return null;
            }
            int n7 = 963;
            block11: while (true) {
                switch (n7) {
                    case 964: {
                        n7 = 962;
                        continue block11;
                    }
                    case 963: {
                        if (k2 >= (long)AutoCrystal.method7255(this)) {
                            AutoCrystal.method7654();
                            return null;
                        }
                        int n8 = (int)field1656[7];
                        break block11;
                    }
                    default: {
                        int n8 = l2 = (int)field1656[2];
                    }
                }
                break;
            }
            if (j2.field_6012 < (Integer)AutoCrystal.method7258(this.field1718) || l2 != 0 && ((Boolean)this.field1711.method507()).booleanValue() || !this.method7266(j2)) continue;
            m2 = this.method7549((class_1297)AutoCrystal.field290.field_1724, o2.method_19538(), (Boolean)AutoCrystal.method7407(this.field1741), (Boolean)this.field1671.method507() != false ? (Integer)AutoCrystal.method7264(AutoCrystal.method7275(this)) : (int)field1656[2], (boolean)field1656[2]);
            n2 = this.method7224(m2);
            if (!n2) {
                Class5836.method22890();
                return null;
            }
            if (((Boolean)AutoCrystal.method7106(this.field1683)).booleanValue()) break;
        }
        Iterator iterator2 = p2.iterator();
        block12: while (true) {
            class_1309 d2;
            boolean c2;
            class_1657 b2;
            double f2;
            double e2;
            if (!iterator2.hasNext()) {
                Class6009.method23561();
                return null;
            }
            class_1297 i2 = (class_1297)iterator2.next();
            int n9 = i2 != null ? 65295 : 65296;
            block13: while (true) {
                switch (n9) {
                    default: {
                        continue block12;
                    }
                    case 65296: {
                        n9 = 65294;
                        continue block13;
                    }
                    case 65295: 
                }
                break;
            }
            if (!i2.method_5805() || i2 == AutoCrystal.method7335(field290) || !this.method7356(i2) || Class5723.field11045.method21243(i2.method_5477())) continue;
            if (i2 instanceof class_1309) {
                class_1309 a2 = (class_1309)i2;
                if (((Boolean)this.field1668.method507()).booleanValue() && Class5659.method22180(a2)) continue;
            }
            if ((e2 = o2.method_5858(i2)) > 144.0 || (f2 = AutoCrystal.method7562(field290).method_5858(i2)) > (double)(((Float)this.field1649.method507()).floatValue() * ((Float)AutoCrystal.method7551(this).method507()).floatValue())) continue;
            if (i2 instanceof class_1657 && this.method7529(b2 = (class_1657)i2, o2.method_19538())) {
                AutoCrystal.method7511();
                return null;
            }
            double g2 = this.method7549(i2, o2.method_19538(), (Boolean)AutoCrystal.method7479(this.field1741), (Integer)AutoCrystal.method7558(this.field1748), (Boolean)this.field1726.method507());
            if (i2 instanceof class_1309 && (this.method7306(g2, m2, c2 = this.method7272(n2, g2, d2 = (class_1309)i2)) || c2)) continue;
            Class5457 h2 = new Class5457(j2, i2, g2, m2, j2.method_24515().method_10074(), (boolean)field1656[2], null);
            if (q2 != null && !(g2 > q2.method21140())) continue;
            q2 = h2;
        }
    }

    private static Class5457 method7690(AutoCrystal class419) {
        return AutoCrystal.method7241(class419);
    }

    private static void method7691() {
        Class1503.method14420();
    }

    public static Class248 method7692(AutoCrystal class419) {
        return class419.field1649;
    }

    private static void method7693() {
        Class5836.method22890();
    }

    private static void method7694(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7695(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private Boolean method7696() {
        return ((Class523)((Object)this.field1653.method507())).method10849();
    }

    private static Object method7697(Class248 class248) {
        return class248.method507();
    }

    private Boolean method7698() {
        return ((Class523)((Object)this.field1653.method507())).method10869();
    }

    private static Map method7699(AutoCrystal class419) {
        return AutoCrystal.method7233(class419);
    }

    private Boolean method7700() {
        return ((Class523)((Object)AutoCrystal.method7476(this.field1653))).method10869();
    }

    private static void method7701() {
        Class6009.method23561();
    }

    public static Class5457 method7702(AutoCrystal class419) {
        return class419.field1717;
    }

    private static boolean method7703(Class523 class523) {
        return class523.method10861();
    }

    private static void method7704(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method7705() {
        Class5836.method22885();
    }

    private static int method7706(int n2, int n3, Spammer class406, Class3806 class3806) {
        return Class4011.method19653(n2, n3, class406, class3806);
    }

    private static boolean method7707(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static class_2338 method7708(Class5457 class5457) {
        return class5457.method21136();
    }

    private static Object method7709(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7710() {
        return Class5659.method22111();
    }

    private static Object method7711(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7712(AutoCrystal class419) {
        return class419.field1743;
    }

    private static boolean method7713(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static void method7714() {
        Class5836.method22897();
    }

    private static native Object 1(char var0);
}

