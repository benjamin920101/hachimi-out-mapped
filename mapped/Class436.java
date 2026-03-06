/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_310
 *  net.minecraft.class_4969
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mapped.Class1;
import mapped.Class1019;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class1406;
import mapped.Class1503;
import mapped.Class1563;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class3225;
import mapped.Class3442;
import mapped.Class3630;
import mapped.Class3741;
import mapped.Class376;
import mapped.Class3812;
import mapped.Class3815;
import mapped.Class3976;
import mapped.Class3979;
import mapped.Class405;
import mapped.Class4056;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4218;
import mapped.Class447;
import mapped.Class5289;
import mapped.Class543;
import mapped.Class5506;
import mapped.Class556;
import mapped.Class5576;
import mapped.Class5659;
import mapped.Class570;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5737;
import mapped.Class5836;
import mapped.Class5905;
import mapped.Class6009;
import mapped.Class6051;
import mapped.Class607;
import mapped.Class625;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class649;
import mapped.Class692;
import mapped.Class702;
import mapped.Class803;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_310;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class436
extends Class414 {
    private final ExecutorService field2120;
    Class3812 field2121;
    private static Class436 INSTANCE;
    Class248 field2122;
    Class248 field2123;
    Class248 field2124;
    Class248 field2125;
    Class248 field2126;
    private final Class925 field2127;
    Class248 field2128;
    Class248 field2129;
    Class248 field2130;
    Class248 field2131;
    Class248 field2132;
    Class248 field2133;
    Class248 field2134;
    public double field2135;
    Class248 field2136;
    Class248 field2137;
    Class248 field2138;
    Class248 field2139;
    Class248 field2140;
    public final Class925 field2141 = new Class926();
    private Class649 field2142;
    Class248 field2143;
    Class248 field2144;
    public double field2145;
    Class248 field2146;
    Class248 field2147;
    Class248 field2148;
    Class248 field2149;
    Class3812 field2150;
    Class248 field2151;
    Class248 field2152;
    Class248 field2153;
    Class248 field2154;
    Class248 field2155;
    Class248 field2156;
    Class248 field2157;
    Class248 field2158;
    Class248 field2159;
    Class248 field2160;
    Class248 field2161;
    private static long[] field2162;
    Class248 field2163;
    Class248 field2164;
    Class248 field2165;
    public class_2338 field2166;

    private static void method9272(Class436 class436, double d2) {
        Class436.method9273(class436, d2);
    }

    public static void method9273(Class436 class436, double d2) {
        class436.field2135 = d2;
    }

    private Boolean method9274() {
        return (Boolean)this.field2161.method507();
    }

    private static void method9275(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_638 method9276(class_310 class_3102) {
        return class_3102.field_1687;
    }

    @Override
    public void method1279() {
        Class436.method9345(this).method12593();
        this.field2142 = null;
    }

    private Boolean method9277() {
        return (Boolean)Class436.method9368(Class436.method9392(this));
    }

    private static boolean method9278(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method9279() {
        return Class3979.method19544();
    }

    private static boolean method9280() {
        return Class5659.method22111();
    }

    private Boolean method9281() {
        return (Boolean)Class436.method9287(this.field2161);
    }

    private Class649 method9282() {
        Object m2 = null;
        Object n2 = null;
        double o2 = 0.0;
        double p2 = 0.0;
        int q2 = (int)field2162[1];
        int r2 = (int)field2162[1];
        Object s2 = null;
        for (class_2338 l2 : this.method9326(Class436.field290.field_1724.method_19538())) {
            Class3442 f2;
            class_2680 i2 = Class436.field290.field_1687.method_8320(l2);
            double j2 = Class436.method9297(field290).method_33571().method_1022(l2.method_46558());
            if (j2 > (Double)this.field2125.method507() + 0.5) continue;
            boolean k2 = i2.method_26204() instanceof class_4969;
            if (!i2.method_45474() && !k2 || !(f2 = new Class3442(l2, class_1802.field_23141, (boolean)((Boolean)Class436.method9353(this.field2155)), (Class607)((Object)this.field2126.method507()))).method17406((Double)Class436.method9321(this).method507(), (Boolean)this.field2139.method507()) && !k2) continue;
            double g2 = Class5905.method23237((class_1297)Class436.method9312(field290), l2.method_46558(), (Boolean)this.field2143.method507(), 10.0f, Set.of(l2), (Boolean)this.field2156.method507() != false ? (Integer)this.field2136.method507() : (int)field2162[1], (boolean)field2162[1]);
            boolean h2 = this.method9333(g2);
            if (h2) continue;
            Class1108.method12918(true);
            return null;
        }
        return null;
    }

    private static void method9283() {
        Class4146.method20697();
    }

    public static class_746 method9284(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9285() {
        Class5836.method22890();
    }

    public static Class3812 method9286(Class436 class436) {
        return class436.field2121;
    }

    private static Object method9287(Class248 class248) {
        return class248.method507();
    }

    private static int method9288(int n2, int n3, Class4218 class4218, Class405 class405) {
        return Class3225.method16341(n2, n3, class4218, class405);
    }

    private static Object method9289(Class248 class248) {
        return class248.method507();
    }

    @Override
    public String method1248() {
        if (this.field2142 != null) {
            return Class436.method9371(this.field2142).method_5477().getString();
        }
        return super.method1248();
    }

    private static Class248 method9290(Class436 class436) {
        return Class436.method9343(class436);
    }

    private static Object method9291(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method9292(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class5711 method9293() {
        return Class5723.field11054;
    }

    private void method9294() {
        this.field2142 = this.method9282();
    }

    private static void method9295() {
        Class5836.method22890();
    }

    private static void method9296() {
        Class1503.method14420();
    }

    public static class_746 method9297(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class649 method9298(Class436 class436) {
        return class436.field2142;
    }

    private Boolean method9299() {
        return (Boolean)Class436.method9291(this.field2161);
    }

    private static Object method9300(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9301(class_1799 a2) {
        return (a2.method_7909() != Class436.method9337() ? (int)field2162[2] : (int)field2162[1]) != 0;
    }

    private static void method9302() {
        Class5836.method22890();
    }

    private static boolean method9303(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static class_746 method9304(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method9305() {
        return (Boolean)this.field2161.method507();
    }

    private boolean method9306(Class3442 a2) {
        if (a2.method17378((Double)this.field2125.method507(), (Boolean)Class436.method9328(this).method507(), (Boolean)this.field2139.method507(), (Double)this.field2164.method507()) && this.field2142 != null) {
            this.field2166 = a2.field7518;
            this.field2135 = Class436.method9318(this.field2142);
            Class436.method9396(this, this.field2142.method11447());
            this.field2141.method12593();
            return (int)field2162[2] != 0;
        }
        return (int)field2162[1] != 0;
    }

    private boolean method9307(double a2, double b2) {
        return (a2 / b2 < (double)((Float)Class436.method9381(this).method507()).floatValue() ? (int)field2162[2] : (int)field2162[1]) != 0;
    }

    private Boolean method9308() {
        return (Boolean)this.field2161.method507();
    }

    public static void method9309(Class436 class436, Class3812 class3812) {
        class436.field2150 = class3812;
    }

    public static void method9310(Class436 class436, Class649 class649) {
        class436.field2142 = class649;
    }

    private Boolean method9311() {
        return (Boolean)this.field2161.method507();
    }

    public static class_746 method9312(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9313() {
        Class1745.method15538();
    }

    private static void method9314() {
        Class1745.method15538();
    }

    public class_2338 method9315() {
        if (this.field2142 == null) {
            return null;
        }
        return this.field2142.method11446();
    }

    private static boolean method9316(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method9317(int n2, int n3, Class3741 class3741, Class3976 class3976) {
        return Class3225.method16336(n2, n3, class3741, class3976);
    }

    private static double method9318(Class649 class649) {
        return class649.method11444();
    }

    private Boolean method9319() {
        return (Boolean)Class436.method9325(this.field2161);
    }

    private static int method9320(int n2, int n3, Class3630 class3630, Class447 class447) {
        return Class3225.method16338(n2, n3, class3630, class447);
    }

    public static Class248 method9321(Class436 class436) {
        return class436.field2125;
    }

    private static Object method9322(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     */
    private List method9323(double f, class_243 g) {
        h = new ArrayList<class_2338>();
        e = -f;
        block4: while (true) {
            block8: {
                if (!(e <= f)) break block8;
                v0 = 10305;
                if (true) ** GOTO lbl13
            }
            v1 = 10306;
            Class3979.method19561();
            return null;
            block5: while (true) {
                v0 = 10304;
lbl13:
                // 2 sources

                switch (v0) {
                    case 10306: {
                        continue block5;
                    }
                    case 10305: {
                        for (d = -f; d <= f; d += 1.0) {
                            for (c = -f; c <= f; c += 1.0) {
                                a = new class_2382((int)(g.method_10216() + e), (int)(g.method_10214() + d), (int)(g.method_10215() + c));
                                b = new class_2338(a);
                                h.add(b);
                            }
                        }
                        e += 1.0;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return h;
    }

    private Boolean method1278() {
        return (Boolean)Class436.method9385(this.field2161);
    }

    private static boolean method9324() {
        return Class1807.method15753();
    }

    private static Object method9325(Class248 class248) {
        return class248.method507();
    }

    private List method9326(class_243 a2) {
        double b2 = Math.ceil((Double)Class436.method9327(this.field2125) + 1.0);
        return this.method9323(b2, a2);
    }

    private static Object method9327(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method9328(Class436 class436) {
        return class436.field2158;
    }

    private static void method9329() {
        Class6009.method23561();
    }

    private static void method9330() {
        Class5836.method22885();
    }

    private Boolean method9331() {
        return (Boolean)this.field2161.method507();
    }

    private Boolean method1269() {
        return (Boolean)this.field2149.method507();
    }

    private static boolean method9332(Class436 class436, Class3442 class3442) {
        return class436.method9306(class3442);
    }

    private boolean method9333(double b2) {
        if (Class436.field290.field_1724.method_7337()) {
            return Class436.method9316(0.054891564189083475, Class6051.field12154, 0.6629418310172978);
        }
        float a2 = Class436.method9284(field290).method_6032() + Class436.field290.field_1724.method_6067();
        if (((Boolean)this.field2157.method507()).booleanValue()) {
            if (b2 >= (double)(a2 + Class1406.field5414)) {
                return (int)field2162[2] != 0;
            }
        }
        if (b2 > (double)((Float)this.field2140.method507()).floatValue()) {
            int n2 = (int)field2162[2];
            return Class1807.method15742();
        }
        return (int)field2162[1] != 0;
    }

    private static boolean method9334() {
        return Class376.method4987();
    }

    private static Class5711 method9335() {
        return Class436.method9377();
    }

    private static ExecutorService method9336(Class436 class436) {
        return Class436.method9380(class436);
    }

    public static class_1792 method9337() {
        return class_1802.field_8801;
    }

    public static Class436 method9338() {
        return INSTANCE;
    }

    public Class436() {
        super("AutoAnchor", "Automatically places and explodes respawn anchors", Class556.field2758, (int)field2162[3]);
        this.field2127 = new Class926();
        this.field2120 = Executors.newSingleThreadExecutor();
        this.field2152 = this.method450(new Class252("EnemyRange", "Range to search for potential enemies", Float.valueOf(1.0f), Float.valueOf(10.0f), Float.valueOf(13.0f)));
        this.field2158 = this.method450(new Class253("Rotate", "Rotate before exploding", (boolean)field2162[1]));
        this.field2155 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field2162[1]));
        this.field2126 = this.method450(new Class260("PlaceSwitch", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field2138 = this.method450(new Class260("ExplodeSwitch", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field2125 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, 4.5, 6.0));
        this.field2139 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field2162[2]));
        this.field2164 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, 3.0, Class5737.field11095));
        this.field2123 = this.method450(new Class253("Players", "Target players", (boolean)field2162[2]));
        this.field2137 = this.method450(new Class253("Monsters", "Target monsters", (boolean)field2162[1]));
        this.field2131 = this.method450(new Class253("Neutrals", "Target neutrals", (boolean)field2162[1]));
        this.field2134 = this.method450(new Class253("Animals", "Target animals", (boolean)field2162[1]));
        this.field2149 = this.method450(new Class253("Place", "Places anchors to damage enemies", (boolean)field2162[2]));
        this.field2147 = this.method450(new Class253("SpamPlace", "Immediately place the anchor after explosion", (boolean)field2162[2]));
        this.field2124 = this.method450(new Class253("DetectMining", "Disable the spam place on mined pos", (boolean)field2162[2]));
        this.field2153 = this.method450(new Class252("PlaceDelay", "Delay to place anchors", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(Class5506.field10359), (Number)Float.valueOf(1000.0f), this::method1269));
        this.field2144 = this.method450(new Class253("AssumeBestArmor", "Assumes Prot 0 armor is max armor", (boolean)field2162[1]));
        this.field2122 = this.method450(new Class252("MinDamage", "Minimum damage required to consider exploding anchors", Float.valueOf(1.0f), Float.valueOf(Class1563.field5862), Float.valueOf(10.0f)));
        this.field2140 = this.method450(new Class252("MaxLocalDamage", "The maximum player damage", Float.valueOf(4.0f), Float.valueOf(12.0f), Float.valueOf(20.0f)));
        this.field2159 = this.method450(new Class252("DamageRatio", "Max self damage ratio", Float.valueOf(Class1019.field4215), Float.valueOf(1.2f), Float.valueOf(2.0f)));
        this.field2146 = this.method450(new Class253("Asynchronous", "Performs calculations on separate threads", (boolean)field2162[2]));
        this.field2157 = this.method450(new Class253("Safety", "Accounts for total player safety when exploding anchors", (boolean)field2162[2]));
        this.field2143 = this.method450(new Class253("BlockDestruction", "Accounts for explosion block destruction when calculating damages", (boolean)field2162[1]));
        this.field2156 = this.method450(new Class253("SelfExtrapolate", "Accounts for motion when calculating self damage", (boolean)field2162[1]));
        this.field2136 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating enemy positions, not fully accurate.", (int)field2162[1], (int)field2162[1], (int)field2162[4]));
        this.field2161 = this.method450(new Class253("Render", "Renders where anchors will be placed", (boolean)field2162[2]));
        this.field2129 = this.method450(new Class260("BoxMode", "Box rendering mode", Class570.field2792, Class570.values(), this::method1278));
        this.field2133 = this.method450(new Class251("BoxColor", "The box color", new Color((int)field2162[5], (int)field2162[5], (int)field2162[5], (int)field2162[0]), this::method9331));
        this.field2160 = this.method450(new Class251("FillColor", "The fill color", new Color((int)field2162[5], (int)field2162[5], (int)field2162[5], (int)field2162[6]), this::method9305));
        this.field2130 = this.method450(new Class252("Width", "The line width of the highlight", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(5.0f), this::method9274));
        this.field2154 = this.method450(new Class253("Shrink", "Shrink", (boolean)field2162[1], this::method9277));
        this.field2148 = this.method450(new Class252("SliderSpeed", "Slider speed", (Number)0.1, (Number)Class5576.field10586, (Number)1.0, this::method9311));
        this.field2163 = this.method450(new Class252("StartFade", "Time of waiting for fade", (Number)0.1, (Number)0.2, (Number)1.0, this::method9281));
        this.field2128 = this.method450(new Class252("FadeSpeed", "Fade speed", (Number)0.1, (Number)Class5289.field10078, (Number)1.0, this::method9308));
        this.field2165 = this.method450(new Class253("RenderDamage", "Renders damage", (boolean)field2162[1], this::method9299));
        this.field2151 = this.method450(new Class253("TargetDamage", "Target's damage", (boolean)field2162[2], this::method9379));
        this.field2132 = this.method450(new Class253("SelfDamage", "My damage", (boolean)field2162[1], this::method9319));
        Class3815.INSTANCE.method18546(new Class4056());
        INSTANCE = this;
    }

    private static boolean method9339() {
        return Class376.method4987();
    }

    private static void method9340(long l2) {
        Class436.field2162[2] = l2 ^ 0xC58964E294DF2513L;
        Class436.field2162[1] = l2 ^ 0xC58964E294DF2512L;
        Class436.field2162[3] = l2 ^ 0xC58964E294DF27F6L;
        Class436.field2162[0] = l2 ^ 0xC58964E294DF2576L;
        Class436.field2162[5] = l2 ^ 0xC58964E294DF25EDL;
        Class436.field2162[6] = l2 ^ 0xC58964E294DF2554L;
        Class436.field2162[4] = l2 ^ 0xC58964E294DF2518L;
    }

    private static boolean method9341(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method9342() {
        Class6454.method24594();
    }

    public static Class248 method9343(Class436 class436) {
        return class436.field2138;
    }

    private static void method9344(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class925 method9345(Class436 class436) {
        return class436.field2127;
    }

    private static void method9346() {
        Class5836.method22885();
    }

    private void method9347(class_2338 a2, class_2350 b2) {
        Class1745.method15566(a2, b2, class_1268.field_5808, (boolean)field2162[2], (Boolean)this.field2158.method507());
    }

    private static void method9348(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method9349(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static void method9350(boolean bl2) {
        Class1108.method12918(bl2);
    }

    @Class1
    public void method9351(Class63 a2) {
        if (Class436.field290.field_1724 == null || Class436.method9292(field290) == null || Class436.field290.field_1724.method_7325() || a2.method128() != Class543.field2691) {
            return;
        }
        if (Class436.method9334()) {
            this.field2142 = null;
            return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && this.method6626()) {
            this.field2142 = null;
            return;
        }
        if (!Class436.field290.field_1724.method_5715()) {
            Class436.method9342();
            return;
        }
        this.field2142 = null;
    }

    public static class_1792 method9352() {
        return class_1802.field_23141;
    }

    private static Object method9353(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9354(class_1297 a2) {
        int n2;
        if (a2 instanceof class_1657 && (Boolean)this.field2123.method507() != false || Class1158.method13133(a2) && (Boolean)this.field2137.method507() != false || Class1158.method13121(a2) && (Boolean)Class436.method9390(this.field2131) != false || Class436.method9361(a2) && ((Boolean)this.field2134.method507()).booleanValue()) {
            n2 = (int)field2162[2];
            return n2 != 0;
        }
        n2 = (int)field2162[1];
        return n2 != 0;
    }

    private static void method9355() {
        Class6009.method23560();
    }

    private static boolean method9356(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    /*
     * Unable to fully structure code
     */
    private boolean method9357(class_2338 a) {
        block4: {
            block2: {
                block3: {
                    if (((Boolean)Class436.method9289(this.field2124)).booleanValue()) break block3;
                    v0 = 64282;
                    ** GOTO lbl9
                }
                v0 = 64283;
                if (true) ** GOTO lbl9
                do {
                    v0 = var2_2 = 64281;
lbl9:
                    // 3 sources

                    if (var2_2 == 64282) break block2;
                } while (var2_2 == 64283);
                break block4;
            }
            return (boolean)((int)Class436.field2162[1]);
        }
        if (Class436.method9335().method22504(a) && Class436.method9386(Class436.method9293(), a, 0.6f)) {
            v1 = (int)Class436.field2162[2];
            return Class447.method10322();
        }
        return (boolean)((int)Class436.field2162[1]);
    }

    private static void method9358(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static void method9359(Class436 class436, Class649 class649) {
        class436.field2142 = class649;
    }

    public static Class248 method9360(Class436 class436) {
        return class436.field2146;
    }

    private static boolean method9361(class_1297 class_12972) {
        return Class1158.method13110(class_12972);
    }

    private static void method9362(long l2) {
        Class436.method9340(l2);
    }

    private static void method9363() {
        Class4146.method20694();
    }

    private static void method9364(Class436 class436, Class649 class649) {
        Class436.method9310(class436, class649);
    }

    private static void method9365() {
        Class6454.method24594();
    }

    private static void method9366() {
        Class5836.method22885();
    }

    private static void method9367() {
        Class3979.method19561();
    }

    private static Object method9368(Class248 class248) {
        return class248.method507();
    }

    public static void method9369(Class436 class436, class_2338 class_23382) {
        class436.field2166 = class_23382;
    }

    private static int method9370(int n2, int n3, Class702 class702, Class1503 class1503) {
        return Class3225.method16334(n2, n3, class702, class1503);
    }

    private static class_1297 method9371(Class649 class649) {
        return class649.method11443();
    }

    static {
        field2162 = new long[7];
        Class436.method9362(-4212725052105349870L);
    }

    private static boolean method9372() {
        return Class5659.method22194();
    }

    public static Class3812 method9373(Class436 class436) {
        return class436.field2150;
    }

    private static void method9374() {
        Class5836.method22890();
    }

    private static void method9375(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method9376(int n2, int n3, Class625 class625, Class692 class692) {
        return Class3225.method16311(n2, n3, class625, class692);
    }

    public static Class5711 method9377() {
        return Class5723.field11054;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9378(Class210 b2) {
        int n2 = Class436.method9304(field290) != null ? 5571 : 5572;
        block8: while (true) {
            switch (n2) {
                case 5572: {
                    n2 = 5570;
                    continue block8;
                }
                case 5571: {
                    if (Class436.field290.field_1687 != null) break block8;
                }
                default: {
                    return;
                }
            }
            break;
        }
        Class3812 c2 = new Class3812(Class436.method9352(), (Class607)((Object)this.field2126.method507())).method18502();
        this.field2121 = new Class3812(class_1802.field_8801, (Class607)((Object)this.field2126.method507())).method18502();
        Class436.method9309(this, new Class3812(Class436::method9301, (Class607)((Object)Class436.method9290(this).method507())).method18502());
        if (!(c2.method18523() && Class436.method9387(this).method18523() && this.field2150.method18523())) {
            this.field2142 = null;
            return;
        }
        if (!Class376.method4987()) {
            int n3 = 10639;
            Class6322.method24332(0.073575854f, 0.44943023f);
            return;
        }
        int n4 = 10638;
        while (true) {
            int n5;
            if ((n5 = n4) == 10638) {
                Class436.method9364(this, null);
                return;
            }
            if (n5 != 10639) break;
            n4 = 10637;
        }
        if (!((Boolean)Class436.method9300(this.field1536)).booleanValue() && this.method6626()) {
            this.field2142 = null;
            return;
        }
        if (Class436.field290.field_1724.method_5715()) {
            this.field2142 = null;
            return;
        }
        if (!((Boolean)this.field2146.method507()).booleanValue()) {
            Class436.method9359(this, this.method9282());
        }
        if (!this.field2127.method12595((Number)this.field2153.method507())) {
            return;
        }
        this.field2127.method12593();
        if (this.field2142 == null) {
            return;
        }
        class_2338 d2 = Class436.method9298(this).method11446();
        class_2680 e2 = Class436.field290.field_1687.method_8320(d2);
        boolean f2 = this.field2142.method11445();
        Class3442 g2 = this.field2142.method11442();
        g2.field7515 = (int)field2162[2];
        int h2 = f2 && !this.method9357(d2) && (Boolean)this.field2147.method507() != false ? (int)field2162[2] : (int)field2162[1];
        class_2350 i2 = Class1745.method15561(d2, (Double)this.field2125.method507());
        if (i2 == null) {
            return;
        }
        int j2 = Class5723.field11058.method18969();
        if (!(e2.method_26204() instanceof class_4969)) {
            if (!this.method9306(g2)) return;
            this.method9389(d2, i2, this.field2121, j2);
            this.method9389(d2, i2, Class436.method9373(this), j2);
            if (h2 == 0) return;
            Class436.method9332(this, g2);
            return;
        }
        int a2 = (Integer)e2.method_11654((class_2769)class_4969.field_23153);
        int n6 = a2 < (int)field2162[2] ? 39522 : 39523;
        block10: while (true) {
            switch (n6) {
                case 39523: {
                    n6 = 39521;
                    continue block10;
                }
                case 39522: {
                    this.method9389(d2, i2, this.field2121, j2);
                    break block10;
                }
            }
            break;
        }
        this.method9389(d2, i2, this.field2150, j2);
        if (h2 == 0) return;
        this.method9306(g2);
    }

    private Boolean method9379() {
        return (Boolean)this.field2161.method507();
    }

    public static ExecutorService method9380(Class436 class436) {
        return class436.field2120;
    }

    public static Class248 method9381(Class436 class436) {
        return class436.field2159;
    }

    private static void method9382(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method9383() {
        Class6009.method23560();
    }

    private static void method9384() {
        Class6009.method23560();
    }

    private static Object method9385(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9386(Class5711 class5711, class_2338 class_23382, float f2) {
        return class5711.method22542(class_23382, f2);
    }

    private static Class3812 method9387(Class436 class436) {
        return Class436.method9286(class436);
    }

    private static void method9388() {
        Class1745.method15538();
    }

    private void method9389(class_2338 a2, class_2350 b2, Class3812 c2, int d2) {
        if (this.field2142 != null) {
            Class436.method9369(this, a2);
            Class436.method9272(this, this.field2142.method11444());
            this.field2145 = this.field2142.method11447();
            this.field2141.method12593();
            c2.method18531(d2);
            this.method9347(a2, b2);
            c2.method18534(d2);
        }
    }

    private static Object method9390(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9391() {
        return Class3979.method19544();
    }

    public static Class248 method9392(Class436 class436) {
        return class436.field2161;
    }

    public static Class248 method9393(Class436 class436) {
        return class436.field2144;
    }

    private static void method9394() {
        Class6009.method23560();
    }

    private static void method9395() {
        Class6454.method24594();
    }

    public static void method9396(Class436 class436, double d2) {
        class436.field2145 = d2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

