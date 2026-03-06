/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1303
 *  net.minecraft.class_1309
 *  net.minecraft.class_1533
 *  net.minecraft.class_1534
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1667
 *  net.minecraft.class_1683
 *  net.minecraft.class_1795
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2824
 *  net.minecraft.class_310
 *  net.minecraft.class_3736
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1153;
import mapped.Class119;
import mapped.Class1215;
import mapped.Class1249;
import mapped.Class1503;
import mapped.Class1534;
import mapped.Class165;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class2298;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class298;
import mapped.Class331;
import mapped.Class3493;
import mapped.Class372;
import mapped.Class376;
import mapped.Class378;
import mapped.Class3812;
import mapped.Class3979;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class419;
import mapped.Class457;
import mapped.Class521;
import mapped.Class525;
import mapped.Class537;
import mapped.Class5449;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5852;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6187;
import mapped.Class6322;
import mapped.Class6386;
import mapped.Class6454;
import mapped.Class803;
import mapped.Class91;
import mapped.Class926;
import mapped.Class969;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1309;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1667;
import net.minecraft.class_1683;
import net.minecraft.class_1795;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2824;
import net.minecraft.class_310;
import net.minecraft.class_3736;
import net.minecraft.class_638;
import net.minecraft.class_746;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class417
extends Class414 {
    Class248 field1595;
    Class248 field1596;
    Class248 field1597;
    Class248 field1598;
    Class248 field1599;
    Class248 field1600;
    Class248 field1601;
    private final List field1602 = new ArrayList();
    Class248 field1603;
    private static long[] field1604;
    Class248 field1605;
    Class248 field1606;
    Class926 field1607;
    Class248 field1608;
    Class248 field1609;
    Class248 field1610;
    Class248 field1611;
    Class248 field1612;
    Class248 field1613;
    Class248 field1614;
    Class248 field1615;
    Class248 field1616;
    Class248 field1617 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
    public static boolean $skidonion$998554990;

    private static boolean method6859(Class2298 class2298, class_2338 class_23382, class_2350 class_23502) {
        return class2298.method15862(class_23382, class_23502);
    }

    private static boolean method6860() {
        return Class5659.method22194();
    }

    public Class417() {
        super("AntiPhase", "", Class556.field2758);
        this.field1596 = this.method450(new Class260("SortPriority", "How to filter targets within range", Class525.field2605, Class525.values()));
        this.field1608 = this.method450(new Class252("MaxTargets", "How many entities to target at once", (int)field1604[0], (int)field1604[0], (int)field1604[1]));
        this.field1603 = this.method450(new Class252("TargetRange", "", Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(7.0f)));
        this.field1612 = this.method450(new Class252("PlaceRange", "Interact block reach", 0.0, 4.5, 8.0));
        this.field1605 = this.method450(new Class252("EntityRange", "Interact entity reach", 0.0, 3.0, 8.0));
        this.field1613 = this.method450(new Class253("Ladder", "", (boolean)field1604[0]));
        this.field1610 = this.method450(new Class253("OnlyHard", "", (boolean)field1604[0], this.field1613::method507));
        this.field1611 = this.method450(new Class253("ItemFrame", "", (boolean)field1604[0]));
        this.field1606 = this.method450(new Class253("Fill", "", (boolean)field1604[2], this.field1611::method507));
        this.field1614 = this.method450(new Class253("Always", "", (boolean)field1604[2], this.field1611::method507));
        this.field1616 = this.method450(new Class253("Paint", "", (boolean)field1604[0]));
        this.field1601 = this.method450(new Class253("Scaffolding", "", (boolean)field1604[0]));
        this.field1615 = this.method450(new Class253("Fire", "", (boolean)field1604[0]));
        this.field1599 = this.method450(new Class253("DetectMining", "", (boolean)field1604[0], this.field1615::method507));
        this.field1595 = this.method450(new Class253("Rotate", "", (boolean)field1604[0]));
        this.field1598 = this.method450(new Class253("CollideSkip", "", (boolean)field1604[0]));
        this.field1600 = this.method450(new Class253("CrawlingSkip", "", (boolean)field1604[0]));
        this.field1597 = this.method450(new Class253("InAirSkip", "", (boolean)field1604[2]));
        this.field1609 = this.method450(new Class252("Delay", "", (int)field1604[2], (int)field1604[4], (int)field1604[3]));
        this.field1607 = new Class926();
    }

    private static Class3812 method6861(Class3812 class3812) {
        return class3812.method18502();
    }

    private static int method6862(int n2, int n3, Class457 class457, Class378 class378) {
        return Class1153.method13080(n2, n3, class457, class378);
    }

    private static void method6863(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method6864() {
        Class1745.method15538();
    }

    private static void method6865() {
        Class5659.method22184();
    }

    private static int method6866(int n2, int n3, Class419 class419, Class119 class119) {
        return Class1153.method13075(n2, n3, class419, class119);
    }

    public static Class2298 method6867() {
        return Class1745.field6547;
    }

    private static boolean method6868() {
        return Class1807.method15753();
    }

    @Override
    public void method1279() {
        this.field1602.clear();
    }

    private static void method6869(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6870(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_638 method6871(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static boolean method6872(class_2680 class_26802, class_2338 class_23382) {
        return Class5852.method22974(class_26802, class_23382);
    }

    public static Class248 method6873(Class417 class417) {
        return class417.field1606;
    }

    /*
     * Unable to fully structure code
     */
    private class_2350 method6874(class_243 g) {
        h = new class_2338.class_2339(g.method_10216(), g.method_10214(), g.method_10215());
        i = h.method_61082();
        j = 0.4f;
        k = Class6386.field13207;
        l = null;
        var8_7 = class_2350.values();
        var9_8 = var8_7.length;
        block8: for (var10_9 = (int)Class417.field1604[2]; var10_9 < var9_8; ++var10_9) {
            block15: {
                f = var8_7[var10_9];
                if (f == class_2350.field_11036 || f == class_2350.field_11033) continue;
                b = h.method_10093(f);
                if (Class1745.field6547.method15862(b, f.method_10153())) break block15;
                v0 = 62474;
                ** GOTO lbl20
            }
            v0 = 62475;
            if (true) ** GOTO lbl20
            block9: while (true) {
                v0 = 62473;
lbl20:
                // 3 sources

                switch (v0) {
                    case 62475: {
                        continue block9;
                    }
                    case 62474: {
                        continue block8;
                    }
                    default: {
                        if (((Boolean)this.field1610.method507()).booleanValue()) {
                            if (!Class5595.method21932(b)) {
                                continue block8;
                            }
                        } else {
                            a = Class417.field290.field_1687.method_8320(b);
                            if (a.method_45474()) continue block8;
                            if (Class5852.method22974(a, b)) {
                                if (!Class417.field290.field_1724.method_5715()) continue block8;
                            }
                        }
                        if ((c = Class417.method6929(f, (class_2338)h)) != null) ** GOTO lbl37
                        v1 = 10697;
                        ** GOTO lbl41
lbl37:
                        // 1 sources

                        v1 = 10698;
                        if (true) ** GOTO lbl41
                        block10: while (true) {
                            v1 = 10696;
lbl41:
                            // 3 sources

                            switch (v1) {
                                case 10698: {
                                    continue block10;
                                }
                                case 10697: {
                                    continue block8;
                                }
                            }
                            break;
                        }
                        if (Class417.method6950(c) || !((e = (d = i.method_1031((double)((float)f.method_10148() * j), 0.0, (double)((float)f.method_10165() * j))).method_1022(g)) < k)) continue block8;
                        k = e;
                        l = f;
                    }
                }
                break;
            }
        }
        return l;
    }

    public static Class248 method6875(Class417 class417) {
        return class417.field1617;
    }

    private static void method6876(Class926 class926) {
        class926.method12593();
    }

    private static void method6877(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682, boolean bl2, boolean bl3) {
        Class1745.method15566(class_23382, class_23502, class_12682, bl2, bl3);
    }

    public static Class248 method6878(Class417 class417) {
        return class417.field1598;
    }

    public static int[] method6879() {
        return Class1249.field4893;
    }

    private static int method6880(int n2, int n3, Class3979 class3979, Class372 class372) {
        return Class1153.method13004(n2, n3, class3979, class372);
    }

    private class_1533 method6881(class_238 b2) {
        List c2 = Class417.field290.field_1687.method_8333(null, b2, Class417::method6966);
        for (class_1297 a2 : c2) {
            if (a2.method_31481() || a2.method_58149() != class_2350.field_11036) continue;
            return (class_1533)a2;
        }
        return null;
    }

    private static void method6882() {
        Class5836.method22885();
    }

    private static void method6883() {
        Class6009.method23561();
    }

    public static class_2350 method6884() {
        return class_2350.field_11036;
    }

    public static Class248 method6885(Class417 class417) {
        return class417.field1612;
    }

    private static void method6886(long l2) {
        Class417.field1604[2] = l2 ^ 0xE61047099DD2E9B0L;
        Class417.field1604[3] = l2 ^ 0xE61047099DD2EE60L;
        Class417.field1604[4] = l2 ^ 0xE61047099DD2E9D4L;
        Class417.field1604[0] = l2 ^ 0xE61047099DD2E9B1L;
        Class417.field1604[1] = l2 ^ 0xE61047099DD2E9BAL;
    }

    private static void method6887(class_2338 class_23382, class_1268 class_12682, boolean bl2, boolean bl3) {
        Class1745.method15637(class_23382, class_12682, bl2, bl3);
    }

    public static class_1297 method6888(class_310 class_3102) {
        return class_3102.field_1719;
    }

    private static int method6889(int n2, int n3, Class537 class537, Class91 class91) {
        return Class1153.method13043(n2, n3, class537, class91);
    }

    private static void method6890(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_2350 method6891() {
        return class_2350.field_11036;
    }

    private static void method6892() {
        Class6009.method23560();
    }

    /*
     * Enabled aggressive block sorting
     */
    private class_2350 method6893(class_2338 b2) {
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        int n3 = (int)field1604[2];
        while (n3 < n2) {
            class_2350 a2 = class_2350Array[n3];
            if (a2 != class_2350.field_11036) {
                int n4 = 18855;
                Class4146.method20694();
                return null;
            }
            int n5 = 18854;
            block5: while (true) {
                switch (n5) {
                    case 18855: {
                        n5 = 18853;
                        continue block5;
                    }
                    case 18854: {
                        break block5;
                    }
                    default: {
                        if (Class417.method6924(Class1745.field6547, b2, a2)) return a2;
                        break block5;
                    }
                }
                break;
            }
            ++n3;
        }
        return null;
    }

    private static void method6894() {
        Class3979.method19561();
    }

    private static Object method6895(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method6896(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6897() {
        Class5836.method22897();
    }

    private static void method6898() {
        Class5836.method22885();
    }

    private static boolean method6899() {
        return Class5836.method22894();
    }

    public static class_746 method6900(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method6901(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static int method6902(int n2, int n3, Class521 class521, Class165 class165) {
        return Class1153.method13039(n2, n3, class521, class165);
    }

    private static native boolean method6903(class_1297 var0);

    private static boolean method6904(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    static {
        ___.___(8, Class417.class);
        ____.___8_710(Class417.class);
    }

    public static Class926 method6905(Class417 class417) {
        return class417.field1607;
    }

    private static void method6906() {
        Class5836.method22890();
    }

    private static Object method6907(Class248 class248) {
        return class248.method507();
    }

    private static void method6908() {
        Class1745.method15538();
    }

    private static void method6909() {
        Class4146.method20697();
    }

    private static void method6910() {
        Class5836.method22890();
    }

    private static void method6911(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6912() {
        Class1745.method15538();
    }

    private static void method6913(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6914() {
        Class1745.method15538();
    }

    private static void method6915() {
        Class1503.method14420();
    }

    private static Object method6916(Class248 class248) {
        return class248.method507();
    }

    private static void method6917(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6918() {
        Class1807.method15744();
    }

    private static boolean method6919(class_1297 a2) {
        return (!a2.method_7325() ? (int)field1604[0] : (int)field1604[2]) != 0;
    }

    private static void method6920() {
        Class5836.method22885();
    }

    private static void method6921(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_1534 method6922(Class417 class417, class_238 class_2383) {
        return class417.method6952(class_2383);
    }

    private static void method6923(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method6924(Class2298 class2298, class_2338 class_23382, class_2350 class_23502) {
        return class2298.method15862(class_23382, class_23502);
    }

    private static void method6925() {
        Class5836.method22885();
    }

    private static void method6926(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682, boolean bl2, boolean bl3) {
        Class1745.method15566(class_23382, class_23502, class_12682, bl2, bl3);
    }

    private static boolean method6927(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static Object method6928(Class248 class248) {
        return class248.method507();
    }

    private static class_238 method6929(class_2350 a2, class_2338 b2) {
        Object c2 = null;
        double d2 = 0.1875;
        double e2 = (double)a2.method_10148() * 0.5 + (double)b2.method_10263() + Class1534.field5776;
        double f2 = b2.method_10264();
        double g2 = (double)a2.method_10165() * 0.5 + (double)b2.method_10260() + 0.5;
        int n2 = Class417.method6879()[a2.ordinal()];
        Class417.method6909();
        return null;
    }

    public static Class5478 method6930() {
        return Class5723.field11045;
    }

    private static void method6931() {
        Class6009.method23561();
    }

    private class_2350 method6932(class_2338 a2) {
        if (Class417.method6867().method15862(a2, class_2350.field_11036)) {
            return class_2350.field_11036;
        }
        return null;
    }

    private static void method6933(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method6934(Class248 class248) {
        return class248.method507();
    }

    private static class_2350 method6935(Class417 class417, class_2338 class_23382) {
        return class417.method6893(class_23382);
    }

    private static void method6936() {
        Class1807.method15744();
    }

    private static boolean method6937() {
        return Class1807.method15753();
    }

    private static void method6938() {
        Class1807.method15744();
    }

    public static Class248 method6939(Class417 class417) {
        return class417.field1601;
    }

    private static void method6940() {
        Class298.method1924();
    }

    private static void method6941(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6942(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_638 method6943(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method6944(Class248 class248) {
        return class248.method507();
    }

    private static void method6945(long l2) {
        Class417.method6886(l2);
    }

    private static Object method6946(Class248 class248) {
        return class248.method507();
    }

    private static void method6947() {
        Class5659.method22184();
    }

    private static void method6948() {
        Class4146.method20697();
    }

    private static void method6949() {
        Class5836.method22897();
    }

    public static boolean method6950(class_238 b2) {
        Iterator iterator = Class417.field290.field_1687.method_8333(null, b2, Class417::method6919).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return Class3979.method19551();
            }
            class_1297 a2 = (class_1297)iterator.next();
            if (!a2.method_5805() || a2 instanceof class_1542 || a2 instanceof class_1303 || a2 instanceof class_1683 || a2 instanceof class_1667) continue;
            if (a2 instanceof class_1533) {
                return Class5659.method22111();
            }
            if (b2.method_994(a2.method_5829())) break;
        }
        return (int)field1604[0] != 0;
    }

    private static void method6951(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private class_1534 method6952(class_238 b2) {
        List c2 = Class417.field290.field_1687.method_8333(null, b2, Class417::method6903);
        Iterator iterator = c2.iterator();
        while (iterator.hasNext()) {
            class_1297 a2 = (class_1297)iterator.next();
            if (a2.method_31481()) continue;
            if (a2.method_58149() == Class417.method6884()) {
                int n2 = 25621;
                Class6322.method24332(0.5758331f, 0.7239414f);
                return null;
            }
            int n3 = 25622;
            block5: while (true) {
                switch (n3) {
                    case 25622: {
                        n3 = 25620;
                        continue block5;
                    }
                    case 25621: {
                        return (class_1534)a2;
                    }
                }
                break;
            }
        }
        return null;
    }

    private static void method6953(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    private static void method6954(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method6955(class_1297 c2) {
        int n2;
        if (c2.equals((Object)Class417.method6896(field290))) {
            return (int)field1604[2] != 0;
        }
        if (c2.equals((Object)Class417.method6888(field290))) return (int)field1604[2] != 0;
        if (c2 instanceof class_1309) {
            class_1309 a2 = (class_1309)c2;
            if (a2.method_29504()) return (int)field1604[2] != 0;
        }
        int n3 = !c2.method_5805() ? 28108 : 28109;
        block8: while (true) {
            switch (n3) {
                case 28109: {
                    n3 = 28107;
                    continue block8;
                }
                case 28108: {
                    return (int)field1604[2] != 0;
                }
            }
            break;
        }
        int n4 = !(Class417.field290.field_1724.method_33571().method_1022(c2.method_19538()) > (double)((Float)this.field1603.method507()).floatValue()) ? 45088 : 45087;
        if (n4 == 45087) return (int)field1604[2] != 0;
        if (n4 == 45088) return Class5836.method22894();
        if (!(c2 instanceof class_1657)) return (int)field1604[2] != 0;
        class_1657 b2 = (class_1657)c2;
        if (b2.method_7337()) {
            return (int)field1604[2] != 0;
        }
        int n5 = Class417.method6930().method21261(b2) ? 33024 : 33023;
        block9: while (true) {
            switch (n5) {
                case 33024: {
                    n5 = 33022;
                    continue block9;
                }
                case 33023: {
                    n2 = (int)field1604[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1604[2];
        return n2 != 0;
    }

    private static void method6956() {
        Class298.method1924();
    }

    private static void method6957(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method6958(Class210 H) {
        if (!((Boolean)this.field1536.method507()).booleanValue() && Class417.field290.field_1724.method_6115()) {
            return;
        }
        if (Class376.method4987()) {
            return;
        }
        this.field1602.clear();
        Class3493.method17601(this.field1602, (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method6955(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)((Class417)this), (Class525)this.field1596.method507(), (Integer)this.field1608.method507());
        block12: for (class_1297 G : this.field1602) {
            block40: {
                block41: {
                    block37: {
                        block38: {
                            block39: {
                                block36: {
                                    block35: {
                                        block34: {
                                            if (((Boolean)this.field1600.method507()).booleanValue() && G.method_20448()) continue;
                                            if (!((Boolean)this.field1597.method507()).booleanValue()) break block35;
                                            if (!G.method_24828()) {
                                                v0 = 54061;
                                                Class6454.method24636(0.18688316004211059, Class6187.field12564, 0.7792716501168668, 0.6477969373132759);
                                                return;
                                            }
                                            v1 = 54062;
                                            if (true) ** GOTO lbl18
                                            do {
                                                v1 = var4_4 = 54060;
lbl18:
                                                // 2 sources

                                                if (var4_4 == 54061) break block34;
                                            } while (var4_4 == 54062);
                                            break block35;
                                        }
                                        while (true) {
                                            // Infinite loop
                                        }
                                    }
                                    if (!((Boolean)Class417.method6878(this).method507()).booleanValue()) break block36;
                                    v2 = 35503;
                                    ** GOTO lbl34
                                }
                                v2 = 35504;
                                if (true) ** GOTO lbl34
                                block15: while (true) {
                                    v2 = 35502;
lbl34:
                                    // 3 sources

                                    switch (v2) {
                                        case 35504: {
                                            continue block15;
                                        }
                                        case 35503: {
                                            if (!Class1215.method13246(G, G.method_5829())) break block15;
                                            continue block12;
                                        }
                                    }
                                    break;
                                }
                                if (!this.field1607.method12595((Number)this.field1609.method507())) continue;
                                if (((Boolean)Class417.method6939(this).method507()).booleanValue() && Class417.method6871(Class417.field290).method_8320(G.method_24515()).method_45474() && (g = new Class3812(class_1802.field_16482, (Class607)this.field1617.method507()).method18502()).method18523()) {
                                    d = G.method_24515();
                                    e = null;
                                    f = Class1745.method15668(d, 6.0);
                                    if (f != null || (e = Class417.method6935(this, d.method_10074())) != null && Class417.field290.field_1687.method_8320(d.method_10074()).method_26204() instanceof class_3736 && !Class417.field290.field_1724.method_5715() || Class417.field290.field_1724.method_5715() && (e = this.method6932(d.method_10074())) != null && Class417.field290.field_1687.method_8320(d.method_10074()).method_26204() instanceof class_3736) {
                                        b = f != null ? d.method_10093(f).method_46558().method_1031((double)f.method_10153().method_10163().method_10263() * 0.5, (double)f.method_10153().method_10163().method_10264() * 0.5, (double)f.method_10153().method_10163().method_10260() * 0.5) : d.method_10074().method_46558().method_1031((double)e.method_10163().method_10263() * 0.5, (double)e.method_10163().method_10264() * 0.5, (double)e.method_10163().method_10260() * 0.5);
                                        c = Class417.field290.field_1724.method_33571().method_1022(b);
                                        if (c <= (Double)this.field1612.method507()) {
                                            a = Class5723.field11058.method18969();
                                            g.method18531(a);
                                            if (Class417.field290.field_1687.method_8320(d.method_10074()).method_26204() instanceof class_3736 && e != null) {
                                                Class1745.method15566(d.method_10074(), e, class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)this.field1595.method507());
                                            } else {
                                                Class417.method6887(d, class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)Class417.method6895(Class417.method6961(this)));
                                            }
                                            g.method18534(a);
                                            this.field1607.method12593();
                                        }
                                    }
                                }
                                if (!((Boolean)this.field1611.method507()).booleanValue() || !Class417.field290.field_1687.method_22347(G.method_24515())) break block37;
                                p = this.method6881(new class_238(G.method_24515()));
                                if (!((Boolean)Class417.method6959(this).method507()).booleanValue() && p != null || !(l = Class417.method6861(new Class3812((Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method6968(net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)(), (Class607)Class417.method6907(this.field1617)))).method18523()) break block38;
                                j = G.method_24515().method_10074();
                                k = Class417.field290.field_1724.method_33571().method_1022(j.method_61082().method_1031(0.0, 1.0, 0.0));
                                if (!(k <= (Double)this.field1612.method507())) break block38;
                                i = Class417.method6969(Class417.field290).method_8320(j);
                                if (!Class1745.field6547.method15862(j, Class417.method6891())) break block38;
                                if (i.method_45474()) break block39;
                                v3 = 59815;
                                ** GOTO lbl73
                            }
                            v3 = 59816;
                            if (true) ** GOTO lbl73
                            block16: while (true) {
                                v3 = 59814;
lbl73:
                                // 3 sources

                                switch (v3) {
                                    case 59816: {
                                        continue block16;
                                    }
                                    case 59815: {
                                        if (Class417.method6872(i, j) && !Class417.field290.field_1724.method_5715()) break block16;
                                        h = Class5723.field11058.method18969();
                                        l.method18531(h);
                                        Class417.method6877(j, class_2350.field_11036, class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)this.field1595.method507());
                                        l.method18534(h);
                                        this.field1607.method12593();
                                    }
                                }
                                break;
                            }
                        }
                        if (((Boolean)Class417.method6873(this).method507()).booleanValue()) {
                            if (p != null && p.method_6940().method_7960()) {
                                o = Class5449.method21096(Class417.field290.field_1724.method_33571(), p.method_5829());
                                if (Class417.method6900(Class417.field290).method_33571().method_1022(o) <= (Double)this.field1605.method507() && (n = new Class3812(class_1802.field_8281, (Class607)Class417.method6946(Class417.method6875(this))).method18502()).method18523()) {
                                    m = Class5723.field11058.method18969();
                                    n.method18531(m);
                                    if (((Boolean)this.field1595.method507()).booleanValue()) {
                                        Class1503.method14418(o);
                                    }
                                    Class417.field290.method_1562().method_52787((class_2596)class_2824.method_34207((class_1297)p, (boolean)Class417.field290.field_1724.method_5715(), (class_1268)class_1268.field_5808));
                                    n.method18534(m);
                                    if (((Boolean)Class417.method6928(this.field1595)).booleanValue()) {
                                        Class1503.method14420();
                                    }
                                    this.field1607.method12593();
                                }
                            }
                        }
                    }
                    if (((Boolean)Class417.method6967(this.field1616)).booleanValue()) {
                        if (Class417.field290.field_1687.method_22347(G.method_24515()) && (v = Class417.method6922(this, new class_238(G.method_24515()))) == null && (u = new Class3812(class_1802.field_8892, (Class607)this.field1617.method507()).method18502()).method18523() && (t = this.method6874(G.method_19538())) != null) {
                            r = G.method_24515().method_10093(t);
                            s = Class417.field290.field_1724.method_33571().method_1022(r.method_46558().method_1031((double)t.method_10153().method_10163().method_10263() * 0.5, (double)t.method_10153().method_10163().method_10264() * 0.5, (double)t.method_10153().method_10163().method_10260() * 0.5));
                            if (s <= (Double)Class417.method6885(this).method507()) {
                                q = Class5723.field11058.method18969();
                                u.method18531(q);
                                Class1745.method15566(r, t.method_10153(), class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)this.field1595.method507());
                                u.method18534(q);
                                Class417.method6876(this.field1607);
                            }
                        }
                    }
                    if (!((Boolean)this.field1615.method507()).booleanValue()) break block40;
                    if (!Class417.field290.field_1687.method_22347(G.method_24515())) break block40;
                    if (!((Boolean)this.field1599.method507()).booleanValue()) ** GOTO lbl-1000
                    if (Class5723.field11054.method22504(G.method_24515())) break block41;
                    v4 = 23303;
                    ** GOTO lbl119
                }
                v4 = 23304;
                if (true) ** GOTO lbl119
                block17: while (true) {
                    v4 = 23302;
lbl119:
                    // 3 sources

                    switch (v4) {
                        case 23304: {
                            continue block17;
                        }
                        case 23303: lbl-1000:
                        // 2 sources

                        {
                            if (!(A = new Class3812(class_1802.field_8884, (Class607)Class417.method6944(this.field1617)).method18502()).method18523()) break block17;
                            y = G.method_24515().method_10074();
                            z = Class417.field290.field_1724.method_33571().method_1022(y.method_61082().method_1031(0.0, 1.0, 0.0));
                            if (!(z <= (Double)Class417.method6916(this.field1612))) break block17;
                            x = Class417.method6943(Class417.field290).method_8320(y);
                            if (!Class417.method6859(Class1745.field6547, y, class_2350.field_11036) || x.method_45474() || Class5852.method22974(x, y) && !Class417.field290.field_1724.method_5715()) break block17;
                            w = Class5723.field11058.method18969();
                            A.method18531(w);
                            Class417.method6926(y, class_2350.field_11036, class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)this.field1595.method507());
                            A.method18534(w);
                            this.field1607.method12593();
                        }
                    }
                    break;
                }
            }
            if (!((Boolean)this.field1613.method507()).booleanValue() || !(F = new Class3812(class_1802.field_8121, (Class607)Class417.method6934(this.field1617)).method18502()).method18523() || !Class417.field290.field_1687.method_8320(G.method_24515()).method_45474() || (E = this.method6874(G.method_19538())) == null) continue;
            C = G.method_24515().method_10093(E);
            D = Class417.field290.field_1724.method_33571().method_1022(C.method_46558().method_1031((double)E.method_10153().method_10163().method_10263() * 0.5, (double)E.method_10153().method_10163().method_10264() * 0.5, (double)E.method_10153().method_10163().method_10260() * Class969.field4051));
            if (!(D <= (Double)this.field1612.method507())) continue;
            Class1745.field6543.add(G.method_24515());
            Class331.method2909().method2916(G.method_24515());
            B = Class5723.field11058.method18969();
            Class417.method6953(F, B);
            Class1745.method15566(C, E.method_10153(), class_1268.field_5808, (boolean)Class417.field1604[0], (Boolean)this.field1595.method507());
            F.method18534(B);
            Class417.method6905(this).method12593();
        }
    }

    public static Class248 method6959(Class417 class417) {
        return class417.field1614;
    }

    private static void method6960(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method6961(Class417 class417) {
        return class417.field1595;
    }

    private static boolean method6962(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method6963() {
        Class1745.method15538();
    }

    private static void method6964(float f2) {
        Class5836.method22907(f2);
    }

    private static void method6965() {
        Class1807.method15744();
    }

    private static native boolean method6966(class_1297 var0);

    private static Object method6967(Class248 class248) {
        return class248.method507();
    }

    private static boolean method6968(class_1799 a2) {
        return a2.method_7909() instanceof class_1795;
    }

    public static class_638 method6969(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static native Object 1(char var0);
}

