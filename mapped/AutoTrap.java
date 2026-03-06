/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class133;
import mapped.Class1377;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class263;
import mapped.Chams;
import mapped.Class3442;
import mapped.Class3715;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class414;
import mapped.Class4155;
import mapped.Class4196;
import mapped.Velocity;
import mapped.Colors;
import mapped.Class5449;
import mapped.Class556;
import mapped.Class5618;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5905;
import mapped.Class597;
import mapped.Class5997;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6161;
import mapped.Class6162;
import mapped.Class62;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class702;
import mapped.Class803;
import mapped.Class854;
import mapped.Class926;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class AutoTrap
extends Class414 {
    Class248 field1618;
    int field1619;
    Class248 field1620;
    Class248 field1621;
    Class248 field1622;
    Class248 field1623;
    private int field1624;
    private static final Set field1625;
    private static long[] field1626;
    Class248 field1627;
    private int field1628;
    private static final List field1629;
    Class248 field1630;
    private static final Set field1631;
    Class248 field1632;
    private static final Set field1633;
    private static AutoTrap INSTANCE;
    Class248 field1634;
    Class248 field1635;
    private static final Set field1636;
    Class248 field1637;
    Class248 field1638;
    Class248 field1639;
    Class248 field1640;
    Class248 field1641;
    Class248 field1642;
    Class248 field1643;
    Class248 field1644;
    Class248 field1645;
    Class248 field1536 = this.method450(new Class253("Multitask", "Allows placing while eating", (boolean)field1626[0]));
    Class248 field1646;
    Class248 field1647;

    private Boolean method6970() {
        return ((Integer)AutoTrap.method7028(this).method507() > 0 ? (int)field1626[0] : (int)field1626[1]) != 0;
    }

    public static Class248 method6971(AutoTrap class418) {
        return class418.field1645;
    }

    public static Class248 method6972(AutoTrap class418) {
        return class418.field1643;
    }

    private void method6973() {
        if (field1629.isEmpty()) {
            return;
        }
        if (((Boolean)this.field1638.method507()).booleanValue()) {
            for (List a2 : AutoTrap.method7061()) {
                field1625.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
            }
        } else {
            Optional<List> b2 = field1629.stream().min(Comparator.comparingInt(List::size));
            b2.ifPresent(AutoTrap::method7059);
        }
    }

    public static void method6974(AutoTrap class418, int n2) {
        class418.field1624 = n2;
    }

    private static void method6975(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method6976() {
        return Class4196.method20801();
    }

    private static Object method6977(Class248 class248) {
        return class248.method507();
    }

    private static Object method6978(Class248 class248) {
        return class248.method507();
    }

    private void method6979(class_238 g2, class_1657 h2) {
        AutoTrap.method7036(this);
        List i2 = AutoTrap.method7034(h2.method_19538());
        for (class_2338 f2 : i2) {
            int n2;
            int n3;
            class_2350[] class_2350Array;
            block13: {
                block12: {
                    if (((Boolean)this.field1646.method507()).booleanValue() && !h2.method_20448()) break block12;
                    if (!((Boolean)this.field1632.method507()).booleanValue()) break block13;
                    if (!h2.method_20448()) break block13;
                }
                class_2338 a2 = new class_2338.class_2339((double)f2.method_10263(), g2.method_17940() + (double)f2.method_10264(), (double)f2.method_10260()).method_10084();
                AutoTrap.method7001(this, a2, field1631);
                if (((Boolean)this.field1621.method507()).booleanValue()) {
                    AutoTrap.method7054(this, a2.method_10084(), field1631);
                }
                if (this.method7038()) {
                    this.method7033(a2);
                }
            }
            if (((Boolean)this.field1634.method507()).booleanValue() && !i2.contains(f2.method_10074())) {
                AutoTrap.method6985(this, f2.method_10074(), AutoTrap.method7005());
            }
            if (((Boolean)this.field1639.method507()).booleanValue()) {
                class_2350Array = Class5449.field10187;
                n3 = class_2350Array.length;
                for (n2 = (int)field1626[1]; n2 < n3; ++n2) {
                    class_2350 c2 = class_2350Array[n2];
                    class_2338 b2 = f2.method_10093(c2);
                    if (i2.contains(b2)) continue;
                    this.method7013(b2, field1636);
                }
            }
            if (!((Boolean)this.field1642.method507()).booleanValue()) continue;
            class_2350Array = Class5449.field10187;
            n3 = class_2350Array.length;
            for (n2 = (int)field1626[1]; n2 < n3; ++n2) {
                class_2350 e2 = class_2350Array[n2];
                class_2338 d2 = f2.method_10093(e2);
                if (i2.contains(d2)) continue;
                AutoTrap.method6999(this, d2.method_10084(), AutoTrap.method7035());
            }
        }
        this.method6973();
        if (this.field1628 > 0) {
            int n4 = this.field1628 - (int)field1626[0];
            while (true) {
                // Infinite loop
            }
        }
        this.field1628 = (Integer)AutoTrap.method7018(this).method507();
    }

    private static void method6980(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6981(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    static {
        field1626 = new long[7];
        AutoTrap.method7046(3173559586295040475L);
        field1629 = new ArrayList();
        field1625 = new LinkedHashSet();
        field1636 = new LinkedHashSet();
        field1631 = new LinkedHashSet();
        field1633 = new LinkedHashSet();
    }

    public static class_638 method6982(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method6983(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6984(AutoTrap class418) {
        return class418.field1641;
    }

    private static void method6985(AutoTrap class418, class_2338 class_23382, Set set) {
        class418.method7013(class_23382, set);
    }

    private static boolean method6986(class_1297 a2) {
        if (a2 instanceof class_1511 && Class5905.method23257((class_1297)AutoTrap.field290.field_1724, a2.method_19538(), (boolean)field1626[1]) < (double)Class5659.method22223()) {
            int n2 = (int)field1626[0];
            return Class5836.method22894();
        }
        return (int)field1626[1] != 0;
    }

    private static boolean method6987() {
        return Class5659.method22194();
    }

    private static void method6988() {
        Class1503.method14420();
    }

    public static class_638 method6989(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method6990(int n2, int n3, Colors class457, Class62 class62) {
        return Class854.method12475(n2, n3, class457, class62);
    }

    public static int method6991(AutoTrap class418) {
        return class418.field1628;
    }

    private static boolean method6992() {
        return Replenish.method6431();
    }

    public static class_746 method6993(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6994(AutoTrap class418, class_2596 class_25962) {
        class418.method7020(class_25962);
    }

    private static int method6995(int n2, int n3, Class5997 class5997, Class263 class263) {
        return Class854.method12495(n2, n3, class5997, class263);
    }

    private static boolean method6996() {
        return Velocity.method10252();
    }

    private static boolean method6997() {
        return Class1807.method15753();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method6998() {
        int n2;
        if (field1625.isEmpty() && field1636.isEmpty() && field1633.isEmpty() && field1631.isEmpty()) {
            n2 = (int)field1626[1];
            return n2 != 0;
        }
        n2 = (int)field1626[0];
        return n2 != 0;
    }

    private static void method6999(AutoTrap class418, class_2338 class_23382, Set set) {
        class418.method7013(class_23382, set);
    }

    private static int method7000(int n2, int n3, Class702 class702, Class597 class597) {
        return Class854.method12487(n2, n3, class702, class597);
    }

    private static void method7001(AutoTrap class418, class_2338 class_23382, Set set) {
        class418.method7013(class_23382, set);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method7002(class_2338 e2, boolean f2) {
        int d2;
        boolean bl2;
        Class6161 h2;
        block8: {
            Class3442 g2;
            block6: {
                int n2;
                block7: {
                    block5: {
                        g2 = new Class3442(e2, (List)AutoTrap.method6983(this.field1630), (boolean)((Boolean)this.field1644.method507()), (Class607)((Object)this.field1637.method507()));
                        h2 = AutoTrap.method7045(Class5723.field11054, e2);
                        if (!((Boolean)AutoTrap.method6971(this).method507()).booleanValue() || h2 == null) break block5;
                        if (AutoTrap.method7004(AutoTrap.method7040(h2), (Double)this.field1622.method507() * Class5618.field10723)) break block6;
                        n2 = !h2.field12483 ? 5122 : 5123;
                        break block7;
                    }
                    if (f2) break block6;
                    bl2 = g2.method17369((Double)this.field1627.method507(), (Boolean)AutoTrap.method6984(this).method507(), (Boolean)this.field1647.method507(), (Double)AutoTrap.method6978(this.field1640));
                    break block8;
                }
                while (true) {
                    int n3;
                    if ((n3 = n2) == 5122) {
                        return Class5659.method22150(0.17579706562473096, 0.31576220665861876, 0.6461933047397511);
                    }
                    if (n3 != 5123) break;
                    n2 = 5121;
                }
            }
            bl2 = g2.method17378((Double)this.field1627.method507(), (Boolean)AutoTrap.method7047(this).method507(), (Boolean)this.field1647.method507(), (Double)this.field1640.method507());
        }
        boolean i2 = bl2;
        if ((Boolean)this.field1620.method507() == false) return i2;
        if (!Class5723.field11056.method14262()) {
            return AutoTrap.method6992();
        }
        int n4 = d2 = AutoTrap.field290.field_1687.method_8320(e2).method_45474() || h2 != null ? (int)field1626[0] : (int)field1626[1];
        if (d2 == 0) {
            return i2;
        }
        class_238 b2 = new class_238((double)(e2.method_10263() - (int)field1626[0]), (double)(e2.method_10264() - (int)field1626[0]), (double)(e2.method_10260() - (int)field1626[0]), (double)(e2.method_10263() + (int)field1626[0]), (double)(e2.method_10264() + (int)field1626[0]), (double)(e2.method_10260() + (int)field1626[0]));
        Predicate<class_1297> c2 = AutoTrap::method6986;
        Iterator iterator = AutoTrap.method6982(field290).method_8333(null, b2, c2).iterator();
        while (iterator.hasNext()) {
            class_1297 a2 = (class_1297)iterator.next();
            Class1745.method15567(a2, (Double)this.field1640.method507(), (Boolean)this.field1641.method507());
        }
        return i2;
    }

    private static boolean method7003() {
        return Class1807.method15769();
    }

    private static boolean method7004(Class926 class926, Number number) {
        return class926.method12595(number);
    }

    public static Set method7005() {
        return field1633;
    }

    private static boolean method7006() {
        return Blink.method4987();
    }

    public static Class248 method7007(AutoTrap class418) {
        return class418.field1623;
    }

    private boolean method7008(class_2338 a2) {
        if (this.field1619 >= (Integer)AutoTrap.method7027(this).method507()) {
            return (int)field1626[1] != 0;
        }
        if (this.method7002(a2, (boolean)field1626[1])) {
            this.field1619 += (int)field1626[0];
            return (int)field1626[0] != 0;
        }
        return (int)field1626[1] != 0;
    }

    private class_1657 method7009() {
        ArrayList a2 = Lists.newArrayList((Iterable)AutoTrap.field290.field_1687.method_18112());
        return a2.stream().filter(AutoTrap::method7055).filter(this::method7053).min(Comparator.comparingDouble(AutoTrap::method7037)).orElse(null);
    }

    private static void method7010() {
        Class6009.method23561();
    }

    public static List method7011() {
        return field1629;
    }

    private static boolean method7012(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private void method7013(class_2338 a2, Set b2) {
        b2.add(a2);
        if (this.method7038()) {
            this.method7033(a2);
        }
    }

    private static boolean method7014(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method7015() {
        Class5836.method22890();
    }

    private static void method7016(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method7017() {
        Class6009.method23561();
    }

    private static Class248 method7018(AutoTrap class418) {
        return AutoTrap.method7007(class418);
    }

    private static boolean method7019(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private void method7020(class_2596 d2) {
        if (d2 instanceof class_2626) {
            class_2626 c2 = (class_2626)d2;
            class_2680 a2 = c2.method_11308();
            class_2338 b2 = c2.method_11309();
            if (field1633.contains(b2) || field1636.contains(b2)) {
                if (a2.method_45474()) {
                    this.method7002(b2, (boolean)field1626[0]);
                }
            }
        }
    }

    private static void method7021() {
        Class5836.method22885();
    }

    private static Object method7022(Class248 class248) {
        return class248.method507();
    }

    private static boolean method7023(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method7024(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method7025(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7026() {
        Class5836.method22885();
    }

    private static Class248 method7027(AutoTrap class418) {
        return AutoTrap.method7043(class418);
    }

    private static Class248 method7028(AutoTrap class418) {
        return AutoTrap.method7056(class418);
    }

    private static boolean method7029(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public AutoTrap() {
        super("AutoTrap", "Fully traps enemies with blocks", Class556.field2758, (int)field1626[6]);
        this.field1618 = this.method450(new Class252("Delay", "Delay, in ticks, between placements", (int)field1626[1], (int)field1626[4], (int)field1626[5]));
        this.field1635 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field1626[0], (int)field1626[0], (int)field1626[3]));
        class_2248[] class_2248Array = new class_2248[(int)field1626[0]];
        class_2248Array[(int)AutoTrap.field1626[1]] = class_2246.field_10540;
        this.field1630 = this.method450(new Class257("Blocks", "What blocks to use for trap", class_2248Array));
        this.field1637 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1641 = this.method450(new Class253("Rotate", "Rotates to block before placing", (boolean)field1626[1]));
        this.field1627 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, 4.5, Class3715.field8363));
        this.field1647 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field1626[0]));
        this.field1640 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, 3.0, 6.0));
        this.field1645 = this.method450(new Class253("AssumeBreak", "Assuming it has been broken", (boolean)field1626[0]));
        this.field1622 = this.method450(new Class252("BreakTime", "Break time", (Number)0.0, (Number)0.7, (Number)2.0, this::method1269));
        this.field1644 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1626[1]));
        this.field1620 = this.method450(new Class253("Protect", "Attempts to break crystals around surround positions to prevent surround break", (boolean)field1626[0]));
        this.field1643 = this.method450(new Class252("Support", "The maximum number of blocks for helper can place", (int)field1626[1], (int)field1626[4], (int)field1626[3]));
        this.field1623 = this.method450(new Class252("CalcDelay", "Delay, in ticks, between support calculations", (Number)((int)field1626[1]), (Number)((int)field1626[2]), (Number)((int)field1626[5]), this::method1278));
        this.field1638 = this.method450(new Class253("Multi", "Allow multiple assignblocks", (boolean)field1626[0], this::method6970));
        this.field1646 = this.method450(new Class253("StandHead", "Place a block at targets head", (boolean)field1626[0]));
        this.field1632 = this.method450(new Class253("CrawlHead", "Place a block at targets head", (boolean)field1626[0]));
        this.field1639 = this.method450(new Class253("Feet", "Place a block at targets feet", (boolean)field1626[0]));
        this.field1642 = this.method450(new Class253("Chest", "Place a block at targets chest", (boolean)field1626[0]));
        this.field1621 = this.method450(new Class253("AntiStep", "Prevents target from stepping out of the trap", (boolean)field1626[1]));
        this.field1634 = this.method450(new Class253("Floor", "Place a block at targets floor", (boolean)field1626[1]));
        INSTANCE = this;
    }

    public static Class248 method7030(AutoTrap class418) {
        return class418.field1641;
    }

    public static AutoTrap method7031() {
        return INSTANCE;
    }

    public static List method7032() {
        return field1629;
    }

    private void method7033(class_2338 a2) {
        class_2680 b2 = AutoTrap.field290.field_1687.method_8320(a2);
        if (b2.method_26204() == class_2246.field_9987) {
            return;
        }
        class_2350 c2 = Class1745.method15668(a2, (Double)this.field1627.method507());
        if (c2 != null) {
            return;
        }
        List d2 = Class1745.method15597(a2, (Double)this.field1627.method507(), (Integer)AutoTrap.method6972(this).method507());
        if (this.method7039(d2)) {
            AutoTrap.method7011().add(d2);
        }
    }

    @Override
    public void method1279() {
        AutoTrap.method6974(this, (int)field1626[1]);
    }

    private static List method7034(class_243 class_2432) {
        return Class5659.method22141(class_2432);
    }

    public static Set method7035() {
        return field1636;
    }

    private static void method7036(AutoTrap class418) {
        class418.method7050();
    }

    private static double method7037(class_1297 a2) {
        return AutoTrap.field290.field_1724.method_5858(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method7038() {
        int n2;
        if (this.field1628 <= 0 && (Integer)AutoTrap.method6977(this.field1643) > 0) {
            n2 = (int)field1626[0];
            return n2 != 0;
        }
        n2 = (int)field1626[1];
        return n2 != 0;
    }

    private boolean method7039(List a2) {
        return (!a2.isEmpty() && Class1215.method13257(((Class653)a2.getLast()).method11461()) ? (int)field1626[0] : (int)field1626[1]) != 0;
    }

    public static Class926 method7040(Class6161 class6161) {
        return class6161.field12485;
    }

    public static Class248 method7041(AutoTrap class418) {
        return class418.field1618;
    }

    private static class_638 method7042(class_310 class_3102) {
        return AutoTrap.method6989(class_3102);
    }

    public static Class248 method7043(AutoTrap class418) {
        return class418.field1635;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method7044(Class133 c2) {
        block10: {
            if (AutoTrap.field290.field_1724 == null) {
                int n2 = 19950;
                Class4036.method20085(0.9132981f, Class1377.field5316, Class6162.field12490, 0.86017543f, Class4155.field9662, 0.51324314f);
                return;
            }
            int n3 = 19949;
            block4: while (true) {
                switch (n3) {
                    case 19950: {
                        n3 = 19948;
                        continue block4;
                    }
                    case 19949: {
                        if (AutoTrap.method7042(field290) != null) break block4;
                    }
                    default: {
                        return;
                    }
                }
                break;
            }
            Object object = c2.method251();
            int n4 = object instanceof class_8042 ? 25699 : 25700;
            while (true) {
                int n5;
                if ((n5 = n4) == 25699) {
                    class_8042 b2 = (class_8042)object;
                    object = b2.method_48324().iterator();
                    break;
                }
                if (n5 == 25700) {
                    n4 = 25698;
                    continue;
                }
                break block10;
                break;
            }
            while (object.hasNext()) {
                class_2596 a2 = (class_2596)object.next();
                AutoTrap.method7063(this, a2);
            }
            return;
        }
        AutoTrap.method6994(this, c2.method251());
    }

    private static Class6161 method7045(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22525(class_23382);
    }

    private static void method7046(long l2) {
        AutoTrap.field1626[3] = l2 ^ 0x2C0ABFA126A6C9D3L;
        AutoTrap.field1626[5] = l2 ^ 0x2C0ABFA126A6C9CFL;
        AutoTrap.field1626[0] = l2 ^ 0x2C0ABFA126A6C9DAL;
        AutoTrap.field1626[4] = l2 ^ 0x2C0ABFA126A6C9D9L;
        AutoTrap.field1626[6] = l2 ^ 0x2C0ABFA126A6CA5FL;
        AutoTrap.field1626[1] = l2 ^ 0x2C0ABFA126A6C9DBL;
        AutoTrap.field1626[2] = l2 ^ 0x2C0ABFA126A6C9D8L;
    }

    private static Class248 method7047(AutoTrap class418) {
        return AutoTrap.method7030(class418);
    }

    private static boolean method7048(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static void method7049() {
        Chams.method1924();
    }

    private Boolean method1269() {
        return (Boolean)this.field1645.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method7050() {
        field1636.clear();
        field1625.clear();
        field1633.clear();
        field1631.clear();
        int n2 = AutoTrap.method6991(this) <= 0 ? 39054 : 39055;
        block4: while (true) {
            switch (n2) {
                case 39055: {
                    n2 = 39053;
                    continue block4;
                }
                case 39054: {
                    field1629.clear();
                    return;
                }
            }
            break;
        }
    }

    private static void method7051() {
        Class6009.method23561();
    }

    private static void method7052() {
        Chams.method1924();
    }

    private boolean method7053(class_1297 a2) {
        return (AutoTrap.field290.field_1724.method_5858(a2) <= ((Class252)this.field1627).method564() ? (int)field1626[0] : (int)field1626[1]) != 0;
    }

    private static void method7054(AutoTrap class418, class_2338 class_23382, Set set) {
        class418.method7013(class_23382, set);
    }

    /*
     * Unable to fully structure code
     */
    private static boolean method7055(class_1297 a) {
        block8: {
            block6: {
                block7: {
                    if (!(a instanceof class_1657) || !a.method_5805()) ** GOTO lbl-1000
                    if (AutoTrap.method6993(AutoTrap.field290) == a) break block7;
                    v0 = 11285;
                    ** GOTO lbl10
                }
                v0 = 11286;
                if (true) ** GOTO lbl10
                do {
                    v0 = var1_1 = 11284;
lbl10:
                    // 3 sources

                    if (var1_1 == 11285) break block6;
                } while (var1_1 == 11286);
                ** GOTO lbl-1000
            }
            if (Class5723.field11045.method21243(a.method_5477())) break block8;
            v1 = 50982;
            ** GOTO lbl22
        }
        v1 = 50983;
        if (true) ** GOTO lbl22
        block5: while (true) {
            v1 = 50981;
lbl22:
            // 3 sources

            switch (v1) {
                case 50983: {
                    continue block5;
                }
                case 50982: {
                    v2 = (int)AutoTrap.field1626[0];
                    break block5;
                }
                default: lbl-1000:
                // 3 sources

                {
                    v2 = (int)AutoTrap.field1626[1];
                }
            }
            break;
        }
        return (boolean)v2;
    }

    public static Class248 method7056(AutoTrap class418) {
        return class418.field1643;
    }

    private static boolean method7057() {
        return Class5659.method22194();
    }

    private static boolean method7058() {
        return Class3979.method19544();
    }

    private static void method7059(List a2) {
        field1625.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
    }

    private Boolean method1278() {
        return ((Integer)this.field1643.method507() > 0 ? (int)field1626[0] : (int)field1626[1]) != 0;
    }

    private static void method7060() {
        Class5836.method22890();
    }

    private static List method7061() {
        return AutoTrap.method7032();
    }

    private static void method7062() {
        Class3979.method19561();
    }

    private static void method7063(AutoTrap class418, class_2596 class_25962) {
        class418.method7020(class_25962);
    }

    private static void method7064(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method7065(Class210 a2) {
        if (AutoTrap.method7006()) {
            return;
        }
        if (!((Boolean)AutoTrap.method7022(this.field1536)).booleanValue() && AutoTrap.field290.field_1724.method_6115()) {
            return;
        }
        class_1657 b2 = this.method7009();
        if (b2 == null) {
            return;
        }
        this.method6979(b2.method_5829(), b2);
        int n2 = this.field1624 > 0 ? 55213 : 55214;
        block4: while (true) {
            switch (n2) {
                case 55214: {
                    n2 = 55212;
                    continue block4;
                }
                case 55213: {
                    this.field1624 -= (int)field1626[0];
                    return;
                }
            }
            break;
        }
        this.field1624 = (Integer)AutoTrap.method7041(this).method507();
        this.field1619 = (int)field1626[1];
        AutoTrap.method7066().removeIf(this::method7008);
        field1633.removeIf(this::method7008);
        field1636.removeIf(this::method7008);
        if (field1625.isEmpty()) return;
        field1625.removeIf(this::method7008);
        field1631.removeIf(this::method7008);
        field1633.removeIf(this::method7008);
        field1636.removeIf(this::method7008);
    }

    public static Set method7066() {
        return field1631;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

