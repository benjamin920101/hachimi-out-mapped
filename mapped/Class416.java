/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_2596
 *  net.minecraft.class_2604
 *  net.minecraft.class_2626
 *  net.minecraft.class_2664
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_5892
 *  net.minecraft.class_638
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 *  net.minecraft.class_8042
 */
package mapped;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class133;
import mapped.Class1443;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class223;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class305;
import mapped.Class3317;
import mapped.Class3442;
import mapped.Class3493;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class4034;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class432;
import mapped.Class447;
import mapped.Class456;
import mapped.Class533;
import mapped.Class5449;
import mapped.Class552;
import mapped.Class553;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class590;
import mapped.Class5905;
import mapped.Class5912;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class611;
import mapped.Class6161;
import mapped.Class624;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class67;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2626;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_5892;
import net.minecraft.class_638;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_8042;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class416
extends Class414 {
    private int field1556;
    Class248 field1557;
    Class248 field1558;
    Class248 field1559;
    Class248 field1560;
    Class248 field1561;
    Class248 field1562;
    Class248 field1563;
    Class248 field1564;
    Class248 field1565;
    Class248 field1566;
    Class248 field1567;
    Class248 field1568;
    Class248 field1569;
    private static Class416 INSTANCE;
    Class248 field1570;
    Class248 field1571;
    Class248 field1572;
    Class248 field1573;
    Class248 field1574;
    Class248 field1575;
    Class248 field1576;
    private static final List field1577;
    private static final Set field1578;
    Class248 field1579;
    Class248 field1580;
    Class248 field1581;
    Class248 field1582;
    Class248 field1583;
    Class248 field1584 = this.method450(new Class260("Timing", "Timing for replacing blocks", Class611.field2974, Class611.values()));
    private int field1585;
    Class248 field1586;
    Class248 field1587;
    Class248 field1588;
    private static final Set field1589;
    private static long[] field1590;
    private static final Set field1591;
    private int field1592;
    Class248 field1593;
    Class248 field1594;

    private boolean method6731(class_2338 a2) {
        if (!((Boolean)Class416.method6831(this.field1579)).booleanValue()) {
            return Class447.method10252();
        }
        if (!a2.equals((Object)Class5659.method22153((class_1657)Class416.field290.field_1724, (boolean)field1590[3]).method_10074()) || !Class416.method6850(Class5723.field11054, a2)) {
            return this.method6758(a2);
        }
        return (int)field1590[3] != 0;
    }

    private static void method6732(List a2) {
        field1578.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
    }

    private static void method6733() {
        Class6454.method24594();
    }

    private static void method6734(Class416 class416, class_2338 class_23382) {
        class416.method6783(class_23382);
    }

    private static void method6735(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6736() {
        Class4146.method20694();
    }

    public static class_638 method6737(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method6738() {
        Class6009.method23561();
    }

    private static void method6739() {
        Class1745.method15538();
    }

    private boolean method6740() {
        return (Class416.method6822(this) <= 0 && (Integer)this.field1567.method507() > 0 ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    public Class416() {
        super("Surround", "Surrounds you in blocks to prevent massive crystal damage", Class556.field2758, (int)field1590[5]);
        this.field1566 = this.method450(new Class253("Explosions", "Pre places before explosions", (boolean)field1590[3], this::method1269));
        this.field1582 = this.method450(new Class253("Spawn", "Pre places before end crystal spawn", (boolean)field1590[3], this::method1278));
        this.field1587 = this.method450(new Class253("Broke", "Pre places when block broke", (boolean)field1590[3], this::method6752));
        this.field1586 = this.method450(new Class253("Surround", "Surround your self", (boolean)field1590[1]));
        this.field1574 = this.method450(new Class253("StandHead", "Trap your head when you standing", (boolean)field1590[3]));
        this.field1563 = this.method450(new Class253("CrawlHead", "Trap your head when you crawling", (boolean)field1590[3]));
        this.field1579 = this.method450(new Class253("MineDownward", "Allow you to mine down", (boolean)field1590[3]));
        class_2248[] class_2248Array = new class_2248[(int)field1590[2]];
        class_2248Array[(int)Class416.field1590[3]] = class_2246.field_10540;
        class_2248Array[(int)Class416.field1590[1]] = class_2246.field_10443;
        this.field1594 = this.method450(new Class257("Blocks", "What blocks to use for surround", class_2248Array));
        this.field1575 = this.method450(new Class252("Delay", "Delay, in ticks, between placements", (int)field1590[3], (int)field1590[2], (int)field1590[4]));
        this.field1593 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field1590[1], (int)field1590[1], (int)field1590[0]));
        this.field1571 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1561 = this.method450(new Class260("Center", "Teleports you to the center of the block", Class624.field3047, Class624.values()));
        this.field1583 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field1590[1]));
        this.field1568 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, Class5912.field11712, Class4034.field9293));
        this.field1580 = this.method450(new Class253("Protect", "Attempts to break crystals around surround positions to prevent surround break", (boolean)field1590[1]));
        this.field1559 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field1590[1]));
        this.field1565 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, 3.0, 6.0));
        this.field1573 = this.method450(new Class253("AssumeBreak", "Assuming it has been broken", (boolean)field1590[1]));
        this.field1572 = this.method450(new Class252("BreakTime", "Break time", (Number)0.0, (Number)0.7, (Number)Class1443.field5496, this::method6799));
        this.field1588 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1590[3]));
        this.field1567 = this.method450(new Class252("Support", "The maximum number of blocks for helper can place", (int)field1590[3], (int)field1590[2], (int)field1590[0]));
        this.field1558 = this.method450(new Class252("CalcDelay", "Delay, in ticks, between support calculations", (Number)((int)field1590[3]), (Number)((int)field1590[6]), (Number)((int)field1590[4]), this::method6804));
        this.field1557 = this.method450(new Class253("Multi", "Allow multiple assignblocks", (boolean)field1590[1], this::method6844));
        this.field1562 = this.method450(new Class260("Extend", "Extends surround (Mining: if the block is being mined)", Class590.field2879, Class590.values()));
        this.field1569 = this.method450(new Class253("GroundOnly", "Works only when you are standing on blocks", (boolean)field1590[3]));
        this.field1581 = this.method450(new Class253("PauseOnFlying", "Pauses the current process while you are flying", (boolean)field1590[3]));
        this.field1570 = this.method450(new Class253("PauseInFluid", "Pauses the current process while you are swimming", (boolean)field1590[3]));
        this.field1560 = this.method450(new Class253("DisableOnYDiff", "Automatically disables when your y level changes", (boolean)field1590[3]));
        this.field1576 = this.method450(new Class253("DisableOnJump", "Automatically disables when you jumping", (boolean)field1590[1]));
        this.field1564 = this.method450(new Class253("DisableOnDeath", "Toggles off when you die", (boolean)field1590[1]));
        INSTANCE = this;
    }

    private static boolean method6741(Class416 class416, class_2338 class_23382, boolean bl2) {
        return class416.method6761(class_23382, bl2);
    }

    private static void method6742(long l2) {
        Class416.method6791(l2);
    }

    private static void method6743(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method6744(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method6745() {
        Class6454.method24594();
    }

    public static Set method6746() {
        return field1589;
    }

    public static class_746 method6747(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6748() {
        Class5836.method22885();
    }

    private static boolean method6749(class_1297 a2) {
        return (a2 instanceof class_1511 && Class5905.method23257((class_1297)Class416.method6786(field290), a2.method_19538(), (boolean)field1590[1]) < (double)Class5659.method22223() ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    private static void method6750(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method6751() {
        return Class5659.method22111();
    }

    private Boolean method6752() {
        if (Class416.method6794(this).method507() == Class611.field2975) {
            int n2 = (int)field1590[1];
            Class416.method6757();
            return null;
        }
        return (boolean)field1590[3];
    }

    private static void method6753() {
        Class6454.method24594();
    }

    private static void method6754() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method6755() {
        class_2338 d2;
        List e2;
        block11: {
            block12: {
                block10: {
                    Iterator iterator;
                    this.method6812();
                    if (((Boolean)Class416.method6780(Class416.method6811(this))).booleanValue() && !Class416.field290.field_1724.method_20448() || ((Boolean)this.field1563.method507()).booleanValue() && Class416.field290.field_1724.method_20448()) {
                        class_2338 a2 = new class_2338.class_2339(Class416.field290.field_1724.method_23317(), Class416.field290.field_1724.method_5829().method_17940() + Class416.field290.field_1724.method_23318(), Class416.field290.field_1724.method_23321()).method_10084();
                        field1589.add(a2);
                        if (this.method6740()) {
                            Class416.method6734(this, a2);
                        }
                    }
                    if (!(iterator = (e2 = Class5659.method22141(Class416.method6842(field290).method_19538())).iterator()).hasNext()) break block10;
                    d2 = (class_2338)iterator.next();
                    if (!((Boolean)Class416.method6803(this.field1586)).booleanValue()) break block11;
                    break block12;
                }
                this.method6840();
                this.field1585 = this.field1585 > 0 ? this.field1585 - (int)field1590[1] : (Integer)this.field1558.method507();
                return;
            }
            class_2350[] class_2350Array = Class5449.field10187;
            int n2 = class_2350Array.length;
            int n3 = (int)field1590[3];
            block4: while (true) {
                int n4 = n3 < n2 ? 31251 : 31252;
                block5: while (true) {
                    switch (n4) {
                        case 31252: {
                            n4 = 31250;
                            continue block5;
                        }
                        case 31251: {
                            class_2350 c2 = class_2350Array[n3];
                            class_2338 b2 = d2.method_10093(c2);
                            if (!e2.contains(b2)) {
                                this.method6835(b2, Class416.method6834(), (boolean)field1590[1]);
                            }
                            ++n3;
                            continue block4;
                        }
                    }
                    break;
                }
                break;
            }
        }
        if (!e2.contains(d2.method_10074())) {
            this.method6835(d2.method_10074(), Class416.method6805(), (boolean)field1590[3]);
        }
        Class4146.method20697();
    }

    private static void method6756() {
        Class3979.method19561();
    }

    private static void method6757() {
        Class5836.method22885();
    }

    private boolean method6758(class_2338 a2) {
        if (Class416.method6767(this) >= (Integer)Class416.method6785(this.field1593)) {
            return (int)field1590[3] != 0;
        }
        if (this.method6761(a2, (boolean)field1590[3])) {
            this.field1592 += (int)field1590[1];
            return (int)field1590[1] != 0;
        }
        return (int)field1590[3] != 0;
    }

    private static Object method6759(Class248 class248) {
        return class248.method507();
    }

    private static void method6760() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method6761(class_2338 e2, boolean f2) {
        boolean i2;
        Class3442 g2 = new Class3442(e2, (List)Class416.method6759(this.field1594), (boolean)((Boolean)this.field1588.method507()), (Class607)((Object)this.field1571.method507()));
        Class6161 h2 = Class5723.field11054.method22525(e2);
        boolean bl2 = i2 = (Boolean)this.field1573.method507() != false && h2 != null && (h2.field12485.method12595((Double)Class416.method6847(this).method507() * 1000.0) || h2.field12483) || f2 ? g2.method17378((Double)this.field1568.method507(), (Boolean)this.field1583.method507(), (Boolean)this.field1559.method507(), (Double)this.field1565.method507()) : g2.method17369((Double)Class416.method6851(this.field1568), (Boolean)this.field1583.method507(), (Boolean)Class416.method6764(this).method507(), (Double)Class416.method6854(this.field1565));
        if (!((Boolean)this.field1580.method507()).booleanValue()) {
            return i2;
        }
        int n2 = Class5723.field11056.method14262() ? 45037 : 45038;
        block4: while (true) {
            switch (n2) {
                case 45038: {
                    n2 = 45036;
                    continue block4;
                }
                case 45037: {
                    int d2 = Class416.field290.field_1687.method_8320(e2).method_45474() || h2 != null ? (int)field1590[1] : (int)field1590[3];
                    if (d2 == 0) return i2;
                    class_238 b2 = new class_238((double)(e2.method_10263() - (int)field1590[1]), (double)(e2.method_10264() - (int)field1590[1]), (double)(e2.method_10260() - (int)field1590[1]), (double)(e2.method_10263() + (int)field1590[1]), (double)(e2.method_10264() + (int)field1590[1]), (double)(e2.method_10260() + (int)field1590[1]));
                    Predicate<class_1297> c2 = Class416::method6749;
                    Iterator iterator = Class416.field290.field_1687.method_8333(null, b2, c2).iterator();
                    while (iterator.hasNext()) {
                        class_1297 a2 = (class_1297)iterator.next();
                        Class416.method6772(a2, (Double)this.field1565.method507(), (Boolean)this.field1583.method507());
                    }
                    return i2;
                }
            }
            break;
        }
        return i2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method6762(Class133 c2) {
        if (Class416.method6806(field290) == null) return;
        if (Class416.field290.field_1687 == null) {
            return;
        }
        Object object = c2.method251();
        if (object instanceof class_8042) {
            class_8042 b2 = (class_8042)object;
            object = b2.method_48324().iterator();
            while (true) {
                int n2 = object.hasNext() ? 18754 : 18755;
                int n3 = n2;
                if (n3 != 18754) {
                    if (n3 == 18755) return;
                    return;
                }
                class_2596 a2 = (class_2596)object.next();
                this.method6771(a2);
            }
        }
        this.method6771(c2.method251());
    }

    public static Class248 method6763(Class416 class416) {
        return class416.field1564;
    }

    public static Class248 method6764(Class416 class416) {
        return class416.field1559;
    }

    public static Class248 method6765(Class416 class416) {
        return class416.field1572;
    }

    private static void method6766() {
        Class4146.method20697();
    }

    public static int method6767(Class416 class416) {
        return class416.field1592;
    }

    public static Set method6768() {
        return field1589;
    }

    private static void method6769() {
        Class6454.method24594();
    }

    public static Class248 method6770(Class416 class416) {
        return class416.field1560;
    }

    private void method6771(class_2596 a2) {
        if (this.field1584.method507() != Class416.method6814()) {
            return;
        }
        field290.execute(() -> this.method6823(a2));
    }

    private static boolean method6772(class_1297 class_12972, double d2, boolean bl2) {
        return Class1745.method15567(class_12972, d2, bl2);
    }

    public static Class248 method6773(Class416 class416) {
        return class416.field1584;
    }

    private static void method6774() {
        Class5836.method22897();
    }

    private static void method6775(Class416 class416, class_2338 class_23382, Set set, boolean bl2) {
        class416.method6835(class_23382, set, bl2);
    }

    private static boolean method6776() {
        return Class5659.method22194();
    }

    public static Set method6777() {
        return field1589;
    }

    private static boolean method6778() {
        return Class5659.method22194();
    }

    public static Class416 method6779() {
        return INSTANCE;
    }

    private static Object method6780(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method6781(Class416 class416) {
        return Class416.method6855(class416);
    }

    @Override
    public void method1274() {
        if (Class416.method6849(this).method507() == Class624.field3049) {
            Class5659.method22184();
        }
        this.field1556 = (int)field1590[3];
        this.field1585 = (int)field1590[3];
    }

    public static Class611 method6782() {
        return Class611.field2975;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method6783(class_2338 a2) {
        class_2680 b2 = Class416.field290.field_1687.method_8320(a2);
        if (b2.method_26204() == class_2246.field_9987) {
            return;
        }
        class_2350 c2 = Class416.method6838(a2, (Double)this.field1568.method507());
        if (c2 != null) {
            return;
        }
        List d2 = Class1745.method15597(a2, (Double)this.field1568.method507(), (Integer)this.field1567.method507());
        int n2 = this.method6793(d2) ? 49911 : 49912;
        block4: while (true) {
            switch (n2) {
                case 49912: {
                    n2 = 49910;
                    continue block4;
                }
                case 49911: {
                    field1577.add(d2);
                    return;
                }
            }
            break;
        }
    }

    public static Set method6784() {
        return field1589;
    }

    private static Object method6785(Class248 class248) {
        return class248.method507();
    }

    private static class_746 method6786(class_310 class_3102) {
        return Class416.method6747(class_3102);
    }

    private static int method6787(int n2, int n3, Class223 class223, Class611 class611) {
        return Class3317.method16891(n2, n3, class223, class611);
    }

    private static Object method6788(Class248 class248) {
        return class248.method507();
    }

    private static List method6789() {
        return Class416.method6826();
    }

    private static Object method6790(Class248 class248) {
        return class248.method507();
    }

    private static void method6791(long l2) {
        Class416.field1590[6] = l2 ^ 0x83969D72151121EEL;
        Class416.field1590[0] = l2 ^ 0x83969D72151121E5L;
        Class416.field1590[3] = l2 ^ 0x83969D72151121EDL;
        Class416.field1590[2] = l2 ^ 0x83969D72151121EFL;
        Class416.field1590[4] = l2 ^ 0x83969D72151121F9L;
        Class416.field1590[1] = l2 ^ 0x83969D72151121ECL;
        Class416.field1590[5] = l2 ^ 0x83969D721511225BL;
    }

    public static int method6792(Class416 class416) {
        return class416.field1585;
    }

    private boolean method6793(List a2) {
        return (!a2.isEmpty() && Class1215.method13257(((Class653)a2.getLast()).method11461()) ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    public static Class248 method6794(Class416 class416) {
        return class416.field1584;
    }

    public static List method6795() {
        return field1577;
    }

    private static int method6796(int n2, int n3, Class6161 class6161, Class552 class552) {
        return Class3317.method16868(n2, n3, class6161, class552);
    }

    private static void method6797(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private Boolean method1269() {
        return (Class416.method6820(this).method507() == Class611.field2975 ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    private static int method6798(int n2, int n3, Class456 class456, Class553 class553) {
        return Class3317.method16852(n2, n3, class456, class553);
    }

    private Boolean method6799() {
        return (Boolean)this.field1573.method507();
    }

    private static void method6800(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method6801(Class416 class416) {
        return class416.field1579;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1278() {
        int n2 = Class416.method6788(Class416.method6833(this)) != Class416.method6782() ? 32567 : 32566;
        while (true) {
            int n3;
            int n4;
            if ((n4 = n2) == 32566) {
                n3 = (int)field1590[1];
                return n3 != 0;
            }
            if (n4 != 32567) {
                n3 = (int)field1590[3];
                return n3 != 0;
            }
            n2 = 32565;
        }
    }

    private static void method6802() {
        Class1503.method14420();
    }

    private static Object method6803(Class248 class248) {
        return class248.method507();
    }

    private Boolean method6804() {
        return ((Integer)this.field1567.method507() > 0 ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    public static Set method6805() {
        return field1591;
    }

    public static class_746 method6806(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method6807(Class248 class248) {
        return class248.method507();
    }

    private static Set method6808() {
        return Class416.method6843();
    }

    private static boolean method6809() {
        return Class447.method10322();
    }

    private static boolean method6810() {
        return Class408.method6431();
    }

    public static Class248 method6811(Class416 class416) {
        return class416.field1574;
    }

    private void method6812() {
        field1589.clear();
        field1578.clear();
        field1591.clear();
        if (this.field1585 <= 0) {
            Class416.method6789().clear();
        }
    }

    private static void method6813() {
        Class6009.method23560();
    }

    public static Class611 method6814() {
        return Class611.field2975;
    }

    public static class_746 method6815(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6816(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Class1
    private void method6817(Class133 c2) {
        if (Class416.field290.field_1724 == null || Class416.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_5892) {
            class_5892 b2 = (class_5892)class_25962;
            class_1297 a2 = Class416.method6737(field290).method_8469(b2.comp_2275());
            if (a2 == Class416.method6815(field290)) {
                if (((Boolean)Class416.method6763(this).method507()).booleanValue()) {
                    this.method1273();
                }
            }
        }
    }

    private static boolean method6818() {
        return Class376.method4987();
    }

    private static void method6819() {
        Class6009.method23561();
    }

    public static Class248 method6820(Class416 class416) {
        return class416.field1584;
    }

    private static void method6821() {
        Class5836.method22890();
    }

    private static int method6822(Class416 class416) {
        return Class416.method6792(class416);
    }

    private void method6823(class_2596 g2) {
        block8: {
            class_2604 f2;
            if (g2 instanceof class_2626) {
                class_2626 b2 = (class_2626)g2;
                if (((Boolean)this.field1587.method507()).booleanValue()) {
                    class_2338 a2 = b2.method_11309();
                    if (Class416.method6777().contains(a2)) {
                        if (b2.method_11308().method_45474()) {
                            Class416.method6741(this, a2, (boolean)field1590[1]);
                        }
                    }
                }
            }
            if (g2 instanceof class_2664) {
                class_2338 c2;
                class_2664 d2 = (class_2664)g2;
                if (((Boolean)this.field1566.method507()).booleanValue() && field1589.contains(c2 = class_2338.method_49637((double)d2.method_11475(), (double)d2.method_11477(), (double)d2.method_11478()))) {
                    this.method6758(c2);
                }
            }
            if (!(g2 instanceof class_2604) || !(f2 = (class_2604)g2).method_11169().equals(class_1299.field_6110)) break block8;
            if (((Boolean)this.field1582.method507()).booleanValue()) {
                class_2338 e2;
                Iterator iterator = field1589.iterator();
                while (!(!iterator.hasNext() || (e2 = (class_2338)iterator.next()).equals((Object)class_2338.method_49637((double)f2.method_11175(), (double)f2.method_11174(), (double)f2.method_11176())) && this.method6758(e2))) {
                }
            }
        }
    }

    private static int method6824(int n2, int n3, Class3493 class3493, Class67 class67) {
        return Class3317.method16878(n2, n3, class3493, class67);
    }

    private static void method6825() {
        Class6009.method23561();
    }

    public static List method6826() {
        return field1577;
    }

    private static void method6827(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method6828(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object method6829(Class248 class248) {
        return class248.method507();
    }

    private void method6830(class_2338 c2) {
        class_2350[] class_2350Array = Class5449.field10187;
        int n2 = class_2350Array.length;
        for (int i2 = (int)field1590[3]; i2 < n2; ++i2) {
            class_2350 b2 = class_2350Array[i2];
            class_2338 a2 = c2.method_10093(b2);
            Class416.method6775(this, a2, Class416.method6768(), (boolean)field1590[3]);
        }
        this.method6835(c2.method_10084(), field1589, (boolean)field1590[3]);
    }

    private static Object method6831(Class248 class248) {
        return class248.method507();
    }

    private static boolean method6832(Class416 class416) {
        return class416.method6740();
    }

    private static Class248 method6833(Class416 class416) {
        return Class416.method6773(class416);
    }

    private static Set method6834() {
        return Class416.method6746();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method6835(class_2338 a2, Set b2, boolean c2) {
        b2.add(a2);
        if (c2) {
            int n2 = this.field1562.method507() != Class590.field2883 ? 30554 : 30555;
            block4: while (true) {
                switch (n2) {
                    case 30555: {
                        n2 = 30553;
                        continue block4;
                    }
                    case 30554: {
                        if (!Class5723.field11054.method22504(a2) || this.field1562.method507() != Class590.field2882) break block4;
                    }
                    default: {
                        this.method6830(a2);
                    }
                }
                break;
            }
        }
        if (Class416.method6832(this)) {
            this.method6783(a2);
        }
    }

    private static boolean method6836() {
        return Class1807.method15753();
    }

    private static void method6837(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_2350 method6838(class_2338 class_23382, double d2) {
        return Class1745.method15668(class_23382, d2);
    }

    private static void method6839(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private void method6840() {
        if (field1577.isEmpty()) {
            return;
        }
        if (((Boolean)this.field1557.method507()).booleanValue()) {
            for (List a2 : field1577) {
                field1578.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
            }
        } else {
            Optional<List> b2 = Class416.method6795().stream().min(Comparator.comparingInt(List::size));
            b2.ifPresent(Class416::method6732);
        }
    }

    private static void method6841() {
        Class1807.method15744();
    }

    public static class_746 method6842(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Set method6843() {
        return field1589;
    }

    private Boolean method6844() {
        return ((Integer)this.field1567.method507() > 0 ? (int)field1590[1] : (int)field1590[3]) != 0;
    }

    private static int method6845(int n2, int n3, Class533 class533, Class305 class305) {
        return Class3317.method16880(n2, n3, class533, class305);
    }

    private static void method6846(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Class248 method6847(Class416 class416) {
        return Class416.method6765(class416);
    }

    private static void method6848(boolean bl2) {
        Class6009.method23559(bl2);
    }

    static {
        field1590 = new long[7];
        Class416.method6742(-8964804894929116691L);
        field1577 = new ArrayList();
        field1578 = new HashSet();
        field1589 = new HashSet();
        field1591 = new HashSet();
    }

    public static Class248 method6849(Class416 class416) {
        return class416.field1561;
    }

    private static boolean method6850(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22497(class_23382);
    }

    private static Object method6851(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    private void method6852(Class210 a2) {
        if (Class432.method8968().method1265()) {
            return;
        }
        this.method6755();
        if (((Boolean)Class416.method6770(this).method507()).booleanValue() && Class416.field290.field_1724.field_6036 < Class416.field290.field_1724.method_23318()) {
            this.method1273();
            return;
        }
        if (((Boolean)this.field1576.method507()).booleanValue() && Class416.method6853(Class416.field290.field_1724.field_3913)) {
            this.method1273();
            return;
        }
        if (this.field1556 > 0) {
            this.field1556 -= (int)field1590[1];
            return;
        }
        this.field1556 = (Integer)this.field1575.method507();
        if (((Boolean)Class416.method6790(this.field1569)).booleanValue()) {
            if (!Class416.field290.field_1724.method_24828()) {
                int n2 = 31564;
                Class5836.method22907(0.9324322f);
                return;
            }
            int n3 = 31565;
            block4: while (true) {
                switch (n3) {
                    case 31565: {
                        n3 = 31563;
                        continue block4;
                    }
                    case 31564: {
                        if (Class416.field290.field_1687.method_8320(Class416.field290.field_1724.method_24515()).method_26204() instanceof class_2399) break block4;
                        return;
                    }
                }
                break;
            }
        }
        if (((Boolean)this.field1581.method507()).booleanValue()) {
            if (Class416.field290.field_1724.method_6128()) return;
        }
        if (((Boolean)Class416.method6829(Class416.method6781(this))).booleanValue()) {
            if (Class416.field290.field_1724.method_52535()) return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && Class416.field290.field_1724.method_6115()) {
            return;
        }
        if (Class376.method4987()) {
            return;
        }
        if (this.field1561.method507() == Class624.field3051) {
            Class5659.method22184();
        }
        this.field1592 = (int)field1590[3];
        field1591.removeIf(this::method6856);
        Class416.method6808().removeIf(this::method6758);
        if (field1578.isEmpty()) {
            return;
        }
        field1578.removeIf(this::method6758);
        field1591.removeIf(this::method6731);
        Class416.method6784().removeIf(this::method6758);
    }

    public static boolean method6853(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private static Object method6854(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6855(Class416 class416) {
        return class416.field1570;
    }

    private boolean method6856(class_2338 a2) {
        if (!(((Boolean)Class416.method6807(Class416.method6801(this))).booleanValue() && a2.equals((Object)Class5659.method22153((class_1657)Class416.field290.field_1724, (boolean)field1590[3]).method_10074()) && Class5723.field11054.method22497(a2))) {
            return this.method6758(a2);
        }
        return (int)field1590[3] != 0;
    }

    private static void method6857() {
        Class6454.method24594();
    }

    private static void method6858() {
        Class1807.method15744();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

