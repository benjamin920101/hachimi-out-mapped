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
 *  net.minecraft.class_243
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mapped.Class1;
import mapped.Class104;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class133;
import mapped.Class1447;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class244;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class285;
import mapped.Class298;
import mapped.Class3221;
import mapped.Class3224;
import mapped.Class3442;
import mapped.Class3740;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4157;
import mapped.Class4196;
import mapped.Class434;
import mapped.Class447;
import mapped.Class4655;
import mapped.Class5449;
import mapped.Class5473;
import mapped.Class549;
import mapped.Class5541;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5837;
import mapped.Class5905;
import mapped.Class599;
import mapped.Class6009;
import mapped.Class605;
import mapped.Class607;
import mapped.Class6161;
import mapped.Class6286;
import mapped.Class6315;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class803;
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
import net.minecraft.class_243;
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
public class Class432
extends Class414 {
    private int field2009;
    Class248 field2010;
    Class248 field2011;
    private int field2012;
    private static final Set field2013;
    Class248 field2014;
    Class248 field2015;
    Class248 field2016;
    Class248 field2017;
    Class248 field2018;
    Class248 field2019;
    Class248 field2020;
    Class248 field2021;
    private static final List field2022;
    Class248 field2023;
    Class248 field2024;
    Class248 field2025;
    Class248 field2026;
    Class248 field2027;
    Class248 field2028;
    private static Class432 INSTANCE;
    Class248 field2029;
    Class248 field2030;
    Class248 field2031;
    Class248 field2032;
    private static final Set field2033;
    Class248 field2034;
    Class248 field2035;
    Class248 field2036 = this.method450(new Class260("Timing", "Timing for replacing blocks", Class605.field2944, Class432.method8950()));
    Class248 field2037;
    private int field2038;
    Class248 field2039;
    private static long[] field2040;
    Class248 field2041;
    Class248 field2042;
    Class248 field2043;
    Class248 field2044;
    Class248 field2045;
    Class248 field2046;
    Class248 field2047 = this.method450(new Class253("Explosions", "Pre places before explosions", (boolean)field2040[0], this::method1269));
    private static final Set field2048;
    Class248 field2049;

    private static void method8851(float f2) {
        Class5836.method22907(f2);
    }

    private static class_2350 method8852(class_2338 class_23382, double d2) {
        return Class1745.method15668(class_23382, d2);
    }

    private static void method8853() {
        Class1807.method15744();
    }

    private static void method8854(long l2) {
        Class432.method8866(l2);
    }

    private static boolean method8855() {
        return Class1807.method15769();
    }

    private static class_746 method8856(class_310 class_3102) {
        return Class432.method8903(class_3102);
    }

    private static void method8857(Class432 class432) {
        class432.method8992();
    }

    private Boolean method1278() {
        return (this.field2036.method507() == Class605.field2945 ? (int)field2040[4] : (int)field2040[0]) != 0;
    }

    public static class_1299 method8858() {
        return class_1299.field_6110;
    }

    private static void method8859() {
        Class1745.method15538();
    }

    private static Object method8860(Class248 class248) {
        return class248.method507();
    }

    @Class1
    private void method8861(Class133 c2) {
        if (Class432.field290.field_1724 == null || Class432.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_5892) {
            class_5892 b2 = (class_5892)class_25962;
            class_1297 a2 = Class432.method8919(field290).method_8469(b2.comp_2275());
            if (a2 == Class432.field290.field_1724 && ((Boolean)this.field2018.method507()).booleanValue()) {
                this.method1273();
            }
        }
    }

    public static List method8862() {
        return field2022;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean method8863(class_2338 e2, boolean f2) {
        boolean i2;
        Class6161 h2;
        block10: {
            int n2;
            Class3442 g2 = new Class3442(e2, (List)Class432.method8953(this.field2042), (boolean)((Boolean)this.field2010.method507()), (Class607)((Object)this.field2023.method507()));
            h2 = Class432.method8913(Class432.method8916(), e2);
            if (((Boolean)Class432.method8889(this.field2043)).booleanValue() && h2 != null && (h2.field12485.method12595((Double)this.field2016.method507() * 1000.0) || h2.field12483) || f2) {
                boolean bl2 = g2.method17378((Double)this.field2034.method507(), (Boolean)this.field2027.method507(), (Boolean)this.field2041.method507(), (Double)this.field2031.method507());
                return Class1215.method13261(0.5195869081269773, 0.5536651233890861);
            }
            i2 = g2.method17369((Double)this.field2034.method507(), (Boolean)this.field2027.method507(), (Boolean)Class432.method8989(this).method507(), (Double)this.field2031.method507());
            if ((Boolean)this.field2011.method507() == false) return Class447.method10252();
            int n3 = 61874;
            boolean bl3 = true;
            do {
                if (!bl3 || (bl3 = false) || !true) {
                    n3 = n2 = 61873;
                }
                if (n2 == 61874) break block10;
            } while (n2 == 61875);
            return i2;
        }
        int n4 = Class432.method8956().method14262() ? 27584 : 27585;
        block5: while (true) {
            switch (n4) {
                case 27585: {
                    n4 = 27583;
                    continue block5;
                }
                case 27584: {
                    int d2 = Class432.field290.field_1687.method_8320(e2).method_45474() || h2 != null ? (int)field2040[4] : (int)field2040[0];
                    if (d2 == 0) return i2;
                    class_238 b2 = new class_238((double)(e2.method_10263() - (int)field2040[4]), (double)(e2.method_10264() - (int)field2040[4]), (double)(e2.method_10260() - (int)field2040[4]), (double)(e2.method_10263() + (int)field2040[4]), (double)(e2.method_10264() + (int)field2040[4]), (double)(e2.method_10260() + (int)field2040[4]));
                    Predicate<class_1297> c2 = Class432::method8957;
                    Iterator iterator = Class432.field290.field_1687.method_8333(null, b2, c2).iterator();
                    while (iterator.hasNext()) {
                        class_1297 a2 = (class_1297)iterator.next();
                        Class1745.method15567(a2, (Double)this.field2031.method507(), (Boolean)this.field2027.method507());
                    }
                    return i2;
                }
            }
            break;
        }
        return i2;
    }

    private static int method8864(int n2, int n3, Class104 class104, Class5837 class5837) {
        return Class4157.method20776(n2, n3, class104, class5837);
    }

    private static void method8865() {
        Class4146.method20697();
    }

    private static void method8866(long l2) {
        Class432.field2040[3] = l2 ^ 0x89B25F01118AC2D6L;
        Class432.field2040[2] = l2 ^ 0x89B25F01118AC2DCL;
        Class432.field2040[4] = l2 ^ 0x89B25F01118AC2D5L;
        Class432.field2040[5] = l2 ^ 0x89B25F01118AC2C0L;
        Class432.field2040[0] = l2 ^ 0x89B25F01118AC2D4L;
        Class432.field2040[6] = l2 ^ 0x89B25F01118AC2D7L;
        Class432.field2040[1] = l2 ^ 0x89B25F01118AC162L;
    }

    public static void method8867(Class432 class432, int n2) {
        class432.field2012 = n2;
    }

    public static Class248 method8868(Class432 class432) {
        return class432.field2034;
    }

    private boolean method8869() {
        if (this.field2012 > 0) {
            return Class432.method8959();
        }
        if ((Integer)Class432.method8896(this.field2046) > 0) {
            int n2 = (int)field2040[4];
            return Class4196.method20801();
        }
        return (int)field2040[0] != 0;
    }

    private static boolean method8870(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22497(class_23382);
    }

    private void method8871(class_2338 a2, Set b2, boolean c2, boolean d2) {
        block6: {
            block5: {
                b2.add(a2);
                if (!c2) {
                    Class4146.method20697();
                    return;
                }
                if (this.field2032.method507() == Class432.method8893()) break block5;
                if (!Class5723.field11054.method22504(a2) || Class432.method8954(this).method507() != Class549.field2720) break block6;
            }
            this.method8931(a2);
        }
        if (this.method8869()) {
            Class432.method8906(this, a2);
        }
    }

    private static void method8872() {
        Class6009.method23561();
    }

    private static boolean method8873(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static Set method8874() {
        return field2048;
    }

    private static void method8875() {
        Class3979.method19561();
    }

    private static void method8876() {
        Class5836.method22890();
    }

    private static boolean method8877(int n2) {
        return Class4196.method20803(n2);
    }

    private Boolean method8878() {
        return (Boolean)Class432.method8920(this.field2043);
    }

    public static Class248 method8879(Class432 class432) {
        return class432.field2026;
    }

    private static boolean method8880() {
        return Class447.method10322();
    }

    private static boolean method8881() {
        return Class5836.method22894();
    }

    private static Set method8882() {
        return Class432.method8939();
    }

    private static void method8883() {
        Class5836.method22885();
    }

    public static Class599 method8884() {
        return Class599.field2912;
    }

    public static class_746 method8885(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_2338 method8886(class_1657 class_16572, boolean bl2) {
        return Class5659.method22153(class_16572, bl2);
    }

    private static void method8887(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method8888(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    @Override
    public void method1274() {
        if (this.field2019.method507() == Class432.method8884()) {
            Class432.method8895();
        }
        this.field2009 = (int)field2040[0];
        this.field2012 = (int)field2040[0];
    }

    private static Object method8889(Class248 class248) {
        return class248.method507();
    }

    private static void method8890() {
        Class6009.method23561();
    }

    private static void method8891() {
        Class1503.method14420();
    }

    private void method8892(class_2338 a2) {
        class_2680 b2 = Class432.field290.field_1687.method_8320(a2);
        if (b2.method_26204() == class_2246.field_9987) {
            return;
        }
        class_2350 c2 = Class432.method8852(a2, (Double)Class432.method8860(Class432.method8868(this)));
        if (c2 != null) {
            return;
        }
        List d2 = Class1745.method15597(a2, (Double)Class432.method8909(this).method507(), (Integer)Class432.method8908(this.field2046));
        if (this.method8943(d2)) {
            Class432.method8862().add(d2);
        }
    }

    public static Class549 method8893() {
        return Class549.field2721;
    }

    public static Class248 method8894(Class432 class432) {
        return class432.field2047;
    }

    private static void method8895() {
        Class5659.method22184();
    }

    private static Object method8896(Class248 class248) {
        return class248.method507();
    }

    private static void method8897() {
        Class5836.method22890();
    }

    private static int method8898(int n2, int n3, Class3224 class3224, Class5473 class5473) {
        return Class4157.method20741(n2, n3, class3224, class5473);
    }

    private static void method8899() {
        Class1807.method15744();
    }

    private static boolean method8900(class_744 class_7442) {
        return Class432.method8933(class_7442);
    }

    private static void method8901(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    private void method8902(Class210 a2) {
        this.method8978();
        if (((Boolean)this.field2017.method507()).booleanValue() && Class432.method8856((class_310)Class432.field290).field_6036 < Class432.field290.field_1724.method_23318()) {
            this.method1273();
            return;
        }
        if (((Boolean)this.field2029.method507()).booleanValue() && Class432.method8900(Class432.method8905(Class432.method8945(field290)))) {
            this.method1273();
            return;
        }
        if (this.field2009 > 0) {
            this.field2009 -= (int)field2040[4];
            return;
        }
        this.field2009 = (Integer)this.field2015.method507();
        if (((Boolean)this.field2035.method507()).booleanValue() && !Class432.field290.field_1724.method_24828()) {
            if (!(Class432.method8942(field290).method_8320(Class432.field290.field_1724.method_24515()).method_26204() instanceof class_2399)) {
                return;
            }
            Class1503.method14420();
            return;
        }
        if (((Boolean)this.field2037.method507()).booleanValue()) {
            int n2 = Class432.field290.field_1724.method_6128() ? 56018 : 56019;
            block4: while (true) {
                switch (n2) {
                    case 56019: {
                        n2 = 56017;
                        continue block4;
                    }
                    case 56018: {
                        return;
                    }
                }
                break;
            }
        }
        if (((Boolean)Class432.method8934(this.field2039)).booleanValue() && Class432.field290.field_1724.method_52535()) {
            return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && Class432.method8990(field290).method_6115()) {
            return;
        }
        if (Class376.method4987()) {
            return;
        }
        if (this.field2019.method507() == Class599.field2911) {
            Class5659.method22184();
        }
        this.field2038 = (int)field2040[0];
        field2033.removeIf(this::method8976);
        field2048.removeIf(this::method8915);
        if (field2013.isEmpty()) return;
        field2013.removeIf(this::method8915);
        field2033.removeIf(this::method8977);
        field2048.removeIf(this::method8915);
    }

    public static class_746 method8903(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8904() {
        Class1807.method15744();
    }

    public static class_744 method8905(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static void method8906(Class432 class432, class_2338 class_23382) {
        class432.method8892(class_23382);
    }

    private static boolean method8907(Class432 class432) {
        return class432.method8869();
    }

    private static Object method8908(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method8909(Class432 class432) {
        return class432.field2034;
    }

    private static void method8910() {
        Class5836.method22890();
    }

    private static List method8911() {
        return Class432.method8927();
    }

    private static void method8912(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Class6161 method8913(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22525(class_23382);
    }

    private static boolean method8914() {
        return Class447.method10252();
    }

    private boolean method8915(class_2338 a2) {
        if (this.field2038 >= (Integer)this.field2020.method507()) {
            return (int)field2040[0] != 0;
        }
        if (this.method8863(a2, (boolean)field2040[0])) {
            this.field2038 = Class432.method8960(this) + (int)field2040[4];
            return (int)field2040[4] != 0;
        }
        return (int)field2040[0] != 0;
    }

    public static Class5711 method8916() {
        return Class5723.field11054;
    }

    private static Class248 method8917(Class432 class432) {
        return Class432.method8926(class432);
    }

    private static void method8918(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_638 method8919(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method8920(Class248 class248) {
        return class248.method507();
    }

    private static void method8921() {
        Class1745.method15538();
    }

    public static class_638 method8922(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method8923() {
        Class1807.method15744();
    }

    private static Class248 method8924(Class432 class432) {
        return Class432.method8965(class432);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method8925(Class133 c2) {
        if (Class432.field290.field_1724 == null) return;
        if (Class432.method8922(field290) == null) {
            return;
        }
        Object object = c2.method251();
        if (!(object instanceof class_8042)) {
            int n2 = 64446;
            Class1745.method15538();
            return;
        }
        int n3 = 64445;
        block8: while (true) {
            switch (n3) {
                case 64446: {
                    n3 = 64444;
                    continue block8;
                }
                case 64445: {
                    class_8042 b2 = (class_8042)object;
                    object = b2.method_48324().iterator();
                    int n4 = !object.hasNext() ? 32702 : 32701;
                    block9: while (true) {
                        switch (n4) {
                            case 32702: {
                                n4 = 32700;
                                continue block9;
                            }
                            case 32701: {
                                class_2596 a2 = (class_2596)object.next();
                                Class432.method8964(this, a2);
                                Class298.method1924();
                                return;
                            }
                        }
                        break;
                    }
                    return;
                }
            }
            break;
        }
        this.method8974(c2.method251());
    }

    public static Class248 method8926(Class432 class432) {
        return class432.field2030;
    }

    public static List method8927() {
        return field2022;
    }

    private static void method8928(List a2) {
        field2013.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
    }

    private static void method8929() {
        Class1745.method15538();
    }

    private static boolean method8930() {
        return Class3979.method19539();
    }

    private void method8931(class_2338 c2) {
        int n2 = (int)field2040[0];
        class_2350[] class_2350Array = Class5449.field10187;
        int n3 = class_2350Array.length;
        if (n2 < n3) {
            class_2350 b2 = class_2350Array[n2];
            class_2338 a2 = c2.method_10093(b2);
            this.method8871(a2, field2048, (boolean)field2040[0], (boolean)field2040[0]);
            ++n2;
            Class4146.method20694();
            return;
        }
        Class432.method8973(this, c2.method_10084(), field2048, (boolean)field2040[0], (boolean)field2040[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method8932() {
        int n2;
        int n3 = (Integer)this.field2046.method507() > 0 ? 40369 : 40370;
        block4: while (true) {
            switch (n3) {
                case 40370: {
                    n3 = 40368;
                    continue block4;
                }
                case 40369: {
                    n2 = (int)field2040[4];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2040[0];
        return n2 != 0;
    }

    public static boolean method8933(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private static Object method8934(Class248 class248) {
        return class248.method507();
    }

    private static double method8935(class_1297 class_12972, class_243 class_2432, boolean bl2) {
        return Class5905.method23257(class_12972, class_2432, bl2);
    }

    private static void method8936(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method8937() {
        return Class1807.method15753();
    }

    private static void method8938() {
        Class3979.method19561();
    }

    public static Set method8939() {
        return field2013;
    }

    private void method8940(class_2596 g2) {
        class_2604 f2;
        if (g2 instanceof class_2626) {
            class_2626 b2 = (class_2626)g2;
            if (((Boolean)Class432.method8985(this.field2045)).booleanValue()) {
                class_2338 a2 = b2.method_11309();
                if (Class432.method8874().contains(a2) && b2.method_11308().method_45474()) {
                    this.method8863(a2, (boolean)field2040[4]);
                }
            }
        }
        if (g2 instanceof class_2664) {
            class_2664 d2 = (class_2664)g2;
            if (((Boolean)Class432.method8894(this).method507()).booleanValue()) {
                class_2338 c2 = class_2338.method_49637((double)d2.method_11475(), (double)d2.method_11477(), (double)d2.method_11478());
                if (!field2048.contains(c2)) {
                    while (true) {
                        // Infinite loop
                    }
                }
                this.method8915(c2);
            }
        }
        if (g2 instanceof class_2604 && (f2 = (class_2604)g2).method_11169().equals(Class432.method8858())) {
            Iterator iterator;
            if (((Boolean)Class432.method8924(this).method507()).booleanValue() && (iterator = field2048.iterator()).hasNext()) {
                class_2338 e2 = (class_2338)iterator.next();
                if (!e2.equals((Object)class_2338.method_49637((double)f2.method_11175(), (double)f2.method_11174(), (double)f2.method_11176()))) {
                    Class5836.method22890();
                    return;
                }
                if (!this.method8915(e2)) {
                    Class5836.method22897();
                    return;
                }
            }
        }
    }

    private static Object method8941(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method8942(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private boolean method8943(List a2) {
        return (!a2.isEmpty() && Class1215.method13257(((Class653)a2.getLast()).method11461()) ? (int)field2040[4] : (int)field2040[0]) != 0;
    }

    private static void method8944() {
        Class5836.method22885();
    }

    public static class_746 method8945(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_2350[] method8946() {
        return Class5449.field10187;
    }

    static {
        field2040 = new long[7];
        Class432.method8854(-8524646686465015084L);
        field2022 = new ArrayList();
        field2013 = new LinkedHashSet();
        field2048 = new LinkedHashSet();
        field2033 = new LinkedHashSet();
    }

    private Boolean method8947() {
        if (this.field2036.method507() == Class605.field2945) {
            int n2 = (int)field2040[4];
            Class3979.method19561();
            return null;
        }
        return (boolean)field2040[0];
    }

    private static void method8948(float f2) {
        Class5836.method22907(f2);
    }

    private static void method8949() {
        Class1503.method14420();
    }

    private static Class605[] method8950() {
        return Class605.values();
    }

    private static void method8951(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method8952(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method8953(Class248 class248) {
        return class248.method507();
    }

    public Class432() {
        super("SelfTrap", "Surrounds you in blocks to prevent massive crystal damage", Class556.field2758, (int)field2040[1]);
        this.field2025 = this.method450(new Class253("Spawn", "Pre places before end crystal spawn", (boolean)field2040[0], this::method1278));
        this.field2045 = this.method450(new Class253("Broke", "Pre places when block broke", (boolean)field2040[0], this::method8947));
        this.field2024 = this.method450(new Class253("Surround", "Surround your self", (boolean)field2040[4]));
        this.field2030 = this.method450(new Class253("Trap", "Trap your self", (boolean)field2040[0]));
        this.field2014 = this.method450(new Class253("StandHead", "Trap your head when you standing", (boolean)field2040[0]));
        this.field2049 = this.method450(new Class253("CrawlHead", "Trap your head when you crawling", (boolean)field2040[0]));
        this.field2044 = this.method450(new Class253("MineDownward", "Allow you to mine down", (boolean)field2040[0]));
        class_2248[] class_2248Array = new class_2248[(int)field2040[3]];
        class_2248Array[(int)Class432.field2040[0]] = class_2246.field_10540;
        class_2248Array[(int)Class432.field2040[4]] = class_2246.field_10443;
        this.field2042 = this.method450(new Class257("Blocks", "What blocks to use for surround", class_2248Array));
        this.field2015 = this.method450(new Class252("Delay", "Delay, in ticks, between placements", (int)field2040[0], (int)field2040[3], (int)field2040[5]));
        this.field2020 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field2040[4], (int)field2040[4], (int)field2040[2]));
        this.field2023 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field2019 = this.method450(new Class260("Center", "Teleports you to the center of the block", Class599.field2912, Class599.values()));
        this.field2027 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field2040[4]));
        this.field2034 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, 4.5, 6.0));
        this.field2011 = this.method450(new Class253("Protect", "Attempts to break crystals around surround positions to prevent surround break", (boolean)field2040[4]));
        this.field2041 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field2040[4]));
        this.field2031 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, 3.0, 6.0));
        this.field2043 = this.method450(new Class253("AssumeBreak", "Assuming it has been broken", (boolean)field2040[4]));
        this.field2016 = this.method450(new Class252("BreakTime", "Break time", (Number)0.0, (Number)0.7, (Number)Class3740.field8452, this::method8878));
        this.field2010 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field2040[0]));
        this.field2046 = this.method450(new Class252("Support", "The maximum number of blocks for helper can place", (int)field2040[0], (int)field2040[3], (int)field2040[2]));
        this.field2026 = this.method450(new Class252("CalcDelay", "Delay, in ticks, between support calculations", (Number)((int)field2040[0]), (Number)((int)field2040[6]), (Number)((int)field2040[5]), this::method8932));
        this.field2028 = this.method450(new Class253("Multi", "Allow multiple assignblocks", (boolean)field2040[0], this::method8975));
        this.field2032 = this.method450(new Class260("Extend", "Extends surround (Mining: if the block is being mined)", Class549.field2718, Class549.values()));
        this.field2021 = this.method450(new Class260("TrapExtend", "Extends trap (Mining: if the block is being mined)", Class549.field2718, Class549.values()));
        this.field2035 = this.method450(new Class253("GroundOnly", "Works only when you are standing on blocks", (boolean)field2040[0]));
        this.field2037 = this.method450(new Class253("PauseOnFlying", "Pauses the current process while you are flying", (boolean)field2040[0]));
        this.field2039 = this.method450(new Class253("PauseInFluid", "Pauses the current process while you are swimming", (boolean)field2040[0]));
        this.field2017 = this.method450(new Class253("DisableOnYDiff", "Automatically disables when your y level changes", (boolean)field2040[0]));
        this.field2029 = this.method450(new Class253("DisableOnJump", "Automatically disables when you jumping", (boolean)field2040[4]));
        this.field2018 = this.method450(new Class253("DisableOnDeath", "Toggles off when you die", (boolean)field2040[4]));
        INSTANCE = this;
    }

    public static Class248 method8954(Class432 class432) {
        return class432.field2032;
    }

    private static int method8955(int n2, int n3, Class244 class244, Class6286 class6286) {
        return Class4157.method20775(n2, n3, class244, class6286);
    }

    public static Class1447 method8956() {
        return Class5723.field11056;
    }

    private static boolean method8957(class_1297 a2) {
        return (a2 instanceof class_1511 && Class432.method8935((class_1297)Class432.field290.field_1724, a2.method_19538(), (boolean)field2040[4]) < (double)Class5659.method22223() ? (int)field2040[4] : (int)field2040[0]) != 0;
    }

    private static void method8958() {
        Class1745.method15538();
    }

    private static boolean method8959() {
        return Class447.method10252();
    }

    public static int method8960(Class432 class432) {
        return class432.field2038;
    }

    private static int method8961(int n2, int n3, Class3221 class3221, Class285 class285) {
        return Class4157.method20765(n2, n3, class3221, class285);
    }

    private static void method8962() {
        Class1503.method14420();
    }

    private static boolean method8963() {
        return Class3979.method19551();
    }

    private static void method8964(Class432 class432, class_2596 class_25962) {
        class432.method8974(class_25962);
    }

    public static Class248 method8965(Class432 class432) {
        return class432.field2025;
    }

    private static boolean method8966() {
        return Class3979.method19543();
    }

    private static void method8967() {
        Class4146.method20694();
    }

    public static Class432 method8968() {
        return INSTANCE;
    }

    private static void method8969(Class432 class432) {
        class432.method8983();
    }

    private static int method8970(int n2, int n3, Class4655 class4655, Class5541 class5541) {
        return Class4157.method20756(n2, n3, class4655, class5541);
    }

    private static void method8971() {
        Class298.method1924();
    }

    private static void method8972() {
        Class298.method1924();
    }

    private static void method8973(Class432 class432, class_2338 class_23382, Set set, boolean bl2, boolean bl3) {
        class432.method8871(class_23382, set, bl2, bl3);
    }

    private void method8974(class_2596 a2) {
        if (this.field2036.method507() != Class605.field2945) {
            return;
        }
        field290.execute(() -> this.method8940(a2));
    }

    private Boolean method8975() {
        return ((Integer)this.field2046.method507() > 0 ? (int)field2040[4] : (int)field2040[0]) != 0;
    }

    private boolean method8976(class_2338 a2) {
        if (!(((Boolean)this.field2044.method507()).booleanValue() && a2.equals((Object)Class432.method8886((class_1657)Class432.field290.field_1724, (boolean)field2040[0]).method_10074()) && Class5723.field11054.method22497(a2))) {
            return this.method8915(a2);
        }
        return (int)field2040[0] != 0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private boolean method8977(class_2338 a2) {
        int n2;
        int n3;
        if ((Boolean)this.field2044.method507() == false) return this.method8915(a2);
        if (!a2.equals((Object)Class5659.method22153((class_1657)Class432.method8885(field290), (boolean)field2040[0]).method_10074())) return this.method8915(a2);
        if (!Class432.method8870(Class5723.field11054, a2)) {
            n3 = 58472;
            n2 = n3;
            if (n2 == 58472) return this.method8915(a2);
            if (n2 != 58473) {
                return (int)field2040[0] != 0;
            }
        } else {
            n3 = 58473;
            if (true) {
                n2 = n3;
                if (n2 == 58472) return this.method8915(a2);
                if (n2 != 58473) return (int)field2040[0] != 0;
            }
        }
        do {
            n3 = 58471;
            n2 = n3;
            if (n2 == 58472) return this.method8915(a2);
        } while (n2 == 58473);
        return (int)field2040[0] != 0;
    }

    private void method8978() {
        int n2;
        int n3;
        class_2350[] class_2350Array;
        block12: {
            block11: {
                block10: {
                    Class432.method8857(this);
                    if (!((Boolean)this.field2014.method507()).booleanValue()) break block10;
                    if (!Class432.field290.field_1724.method_20448()) break block11;
                }
                if (!((Boolean)this.field2049.method507()).booleanValue()) break block12;
                if (!Class432.field290.field_1724.method_20448()) break block12;
            }
            class_2338 a2 = new class_2338.class_2339(Class432.field290.field_1724.method_23317(), Class432.field290.field_1724.method_5829().method_17940() + Class432.field290.field_1724.method_23318(), Class432.field290.field_1724.method_23321()).method_10084();
            field2048.add(a2);
            if (Class432.method8907(this)) {
                this.method8892(a2);
            }
        }
        List h2 = Class5659.method22141(Class432.field290.field_1724.method_19538());
        for (class_2338 d2 : h2) {
            if (((Boolean)this.field2024.method507()).booleanValue()) {
                class_2350Array = Class5449.field10187;
                n3 = class_2350Array.length;
                for (n2 = (int)field2040[0]; n2 < n3; ++n2) {
                    class_2350 c2 = class_2350Array[n2];
                    class_2338 b2 = d2.method_10093(c2);
                    if (h2.contains(b2)) continue;
                    this.method8871(b2, field2048, (boolean)field2040[4], (boolean)field2040[0]);
                }
            }
            if (h2.contains(d2.method_10074())) continue;
            this.method8871(d2.method_10074(), field2033, (boolean)field2040[0], (boolean)field2040[0]);
        }
        if (((Boolean)Class432.method8917(this).method507()).booleanValue()) {
            for (class_2338 g2 : h2) {
                class_2350Array = Class432.method8946();
                n3 = class_2350Array.length;
                for (n2 = (int)field2040[0]; n2 < n3; ++n2) {
                    class_2350 f2 = class_2350Array[n2];
                    class_2338 e2 = g2.method_10093(f2);
                    if (h2.contains(e2)) continue;
                    this.method8871(e2.method_10084(), field2048, (boolean)field2040[0], (boolean)field2040[4]);
                }
            }
        }
        Class432.method8969(this);
        Class432.method8867(this, this.field2012 > 0 ? this.field2012 - (int)field2040[4] : (Integer)Class432.method8879(this).method507());
    }

    private static void method8979() {
        Class5659.method22184();
    }

    private static void method8980() {
        Class6454.method24594();
    }

    private static void method8981() {
        Class1807.method15744();
    }

    private static void method8982(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method8983() {
        int n2 = Class432.method8911().isEmpty() ? 41236 : 41237;
        block4: while (true) {
            switch (n2) {
                case 41237: {
                    n2 = 41235;
                    continue block4;
                }
                case 41236: {
                    return;
                }
            }
            break;
        }
        if (!((Boolean)this.field2028.method507()).booleanValue()) {
            Optional<List> b2 = field2022.stream().min(Comparator.comparingInt(List::size));
            b2.ifPresent(Class432::method8928);
            return;
        }
        Iterator iterator = field2022.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class5836.method22885();
                return;
            }
            List a2 = (List)iterator.next();
            Class432.method8882().addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
        }
    }

    private static void method8984(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method8985(Class248 class248) {
        return class248.method507();
    }

    private static void method8986() {
        Class1745.method15538();
    }

    private static int method8987(int n2, int n3, Class434 class434, Class6315 class6315) {
        return Class4157.method20797(n2, n3, class434, class6315);
    }

    private static void method8988(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method8989(Class432 class432) {
        return class432.field2041;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1269() {
        int n2;
        if (this.field2036.method507() != Class605.field2945) {
            int n3 = 4524;
            Class432.method8853();
            return null;
        }
        int n4 = 4523;
        block4: while (true) {
            switch (n4) {
                case 4524: {
                    n4 = 4522;
                    continue block4;
                }
                case 4523: {
                    n2 = (int)field2040[4];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2040[0];
        return n2 != 0;
    }

    public static class_746 method8990(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8991(float f2) {
        Class5836.method22907(f2);
    }

    private void method8992() {
        field2048.clear();
        field2013.clear();
        field2033.clear();
        if (this.field2012 <= 0) {
            field2022.clear();
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

