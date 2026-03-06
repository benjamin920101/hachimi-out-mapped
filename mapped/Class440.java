/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1738
 *  net.minecraft.class_1740
 *  net.minecraft.class_1770
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 *  net.minecraft.class_7204
 *  net.minecraft.class_746
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import mapped.Class1108;
import mapped.Class1283;
import mapped.Class1503;
import mapped.Class1533;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class244;
import mapped.Class246;
import mapped.Class248;
import mapped.Class253;
import mapped.Class259;
import mapped.Class260;
import mapped.Class282;
import mapped.Class298;
import mapped.Class3285;
import mapped.Class365;
import mapped.Class3812;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4075;
import mapped.Class411;
import mapped.Class476;
import mapped.Class480;
import mapped.Class540;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5944;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class634;
import mapped.Class6454;
import mapped.Class68;
import mapped.Class829;
import mapped.Class976;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1738;
import net.minecraft.class_1740;
import net.minecraft.class_1770;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_7204;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class440
extends Class411 {
    Class248 field2194 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
    Class248 field2195;
    private static long[] field2196 = new long[10];
    Class248 field2197;
    Class248 field2198;
    Class248 field2199;
    Class248 field2200;
    Class248 field2201;
    Class248 field2202 = this.method450(new Class260("Swing", "Swing side for interact block", Class480.field2509, Class480.values()));

    private static void method9476(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object method9477(Class248 class248) {
        return class248.method507();
    }

    private static void method9478() {
        Class5836.method22890();
    }

    private static void method9479(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    private static void method9480(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private int method9481() {
        int d2 = (int)field2196[1];
        for (int c2 = (int)field2196[0]; c2 < (int)field2196[8]; ++c2) {
            class_1738 a2;
            class_1799 b2 = Class440.field290.field_1724.method_31548().method_5438(c2);
            class_1792 class_17922 = b2.method_7909();
            if (!(class_17922 instanceof class_1738) || (a2 = (class_1738)class_17922).method_7685() != class_1304.field_6174) continue;
            if (a2.method_7686() == class_1740.field_21977) {
                if (Class440.method9487(Class440.method9508(this)) == Class476.field2488) {
                    d2 = c2;
                    break;
                }
            }
            if (a2.method_7686() == class_1740.field_7889 && Class440.method9486(this).method507() == Class476.field2490) {
                d2 = c2;
                break;
            }
            d2 = c2;
        }
        return d2;
    }

    private static int method9482(int n2, int n3, Class68 class68, Class540 class540) {
        return Class1533.method14509(n2, n3, class68, class540);
    }

    private static class_2596 method9483(float a2, float b2, int c2) {
        return new class_2886(Class440.method9526(), c2, a2, b2);
    }

    private static Object method9484(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     */
    public void method9485() {
        block8: {
            if (!this.method1265()) break block8;
            if (Class440.method9489((Class246)this.field2199.method507())) {
                if (((Class246)this.field2198.method507()).method500() == ((Class246)Class440.method9521(this.field2199)).method500()) {
                    return;
                }
            }
            a = Class440.method9498(new Class3812(class_1802.field_8639, (Class607)this.field2194.method507()));
            if (!Class440.field290.field_1724.method_6128()) ** GOTO lbl-1000
            if (!a.method18523()) {
                v0 = 40392;
                Class6009.method23561();
                return;
            }
            v1 = 40393;
            if (true) ** GOTO lbl15
            block4: while (true) {
                v1 = 40391;
lbl15:
                // 2 sources

                switch (v1) {
                    case 40393: {
                        continue block4;
                    }
                    case 40392: lbl-1000:
                    // 2 sources

                    {
                        ((Class246)this.field2198.method507()).method497();
                        return;
                    }
                }
                break;
            }
            b = Class440.method9494(Class5723.field11058);
            Class440.method9479(a, b);
            Class440.method9500().method21353((class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method9510(int ), (I)Lnet/minecraft/class_2596;)());
            ((Class480)Class440.method9542(this).method507()).method10782(class_1268.field_5808);
            a.method18534(b);
        }
    }

    public static Class248 method9486(Class440 class440) {
        return class440.field2195;
    }

    private static Object method9487(Class248 class248) {
        return class248.method507();
    }

    private static void method9488() {
        Class5659.method22184();
    }

    public static boolean method9489(Class246 class246) {
        return class246.field295;
    }

    public static Class3850 method9490() {
        return Class5723.field11058;
    }

    private static void method9491() {
        Class298.method1924();
    }

    public static class_1268 method9492() {
        return class_1268.field_5808;
    }

    private static class_746 method9493(class_310 class_3102) {
        return Class440.method9516(class_3102);
    }

    private static int method9494(Class3850 class3850) {
        return class3850.method18969();
    }

    private static void method9495(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    private static void method9496(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9497() {
        Class6454.method24594();
    }

    private static Class3812 method9498(Class3812 class3812) {
        return class3812.method18502();
    }

    private static void method9499() {
        Class6009.method23560();
    }

    public static Class5496 method9500() {
        return Class5723.field11048;
    }

    private static int method9501(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    public void method9502() {
        if (this.method1265()) {
            Class3812 a2;
            if (((Class246)this.field2199.method507()).field295) {
                if (Class440.method9509((Class246)this.field2201.method507()) == ((Class246)this.field2199.method507()).method500()) {
                    return;
                }
            }
            if (((Class246)Class440.method9538((Class248)Class440.method9511((Class440)this))).field295) {
                if (((Class246)this.field2201.method507()).method500() != ((Class246)Class440.method9477(this.field2198)).method500()) {
                    Class5836.method22897();
                    return;
                }
                return;
            }
            if (((Class246)Class440.method9484(this.field2201)).method500() == ((Class246)this.field2198.method507()).method500() && Class440.field290.field_1724.method_6128() && (a2 = Class440.method9515(new Class3812(class_1802.field_8639, (Class607)((Object)this.field2194.method507())))).method18523()) {
                return;
            }
            Class3812 b2 = new Class3812(class_1802.field_8634, (Class607)((Object)Class440.method9513(this.field2194))).method18502();
            if (!b2.method18523()) {
                return;
            }
            float c2 = Class440.method9493(field290).method_36454();
            float d2 = Class440.field290.field_1724.method_36455();
            int e2 = Class5723.field11058.method18969();
            Class440.method9476(c2, d2);
            b2.method18531(e2);
            Class5723.field11048.method21353(arg_0 -> Class440.method9483(c2, d2, arg_0));
            ((Class480)((Object)this.field2202.method507())).method10782(class_1268.field_5808);
            b2.method18534(e2);
            Class1503.method14420();
        }
    }

    public static Class3850 method9503() {
        return Class5723.field11058;
    }

    private static int method9504(Class440 class440) {
        return class440.method9481();
    }

    public void method9505() {
        if (this.method1265()) {
            class_1297 class_12972;
            class_239 c2;
            double b2 = Class440.field290.field_1724.method_55755();
            class_239 class_2392 = c2 = Class365.method4718().method1265() ? Class976.method12718(b2, Class440.method9529(Class440.method9534()), Class365.method4718().method4735()) : Class976.method12730(b2);
            if (c2 != null && c2.method_17783() == class_239.class_240.field_1331 && (class_12972 = ((class_3966)c2).method_17782()) instanceof class_1657) {
                class_1657 a2 = (class_1657)class_12972;
                if (Class5723.field11045.method21243(a2.method_5477())) {
                    Class5723.field11045.method21236(a2.method_5477());
                } else {
                    Class5723.field11045.method21239(a2.method_5477());
                }
            } else {
                ((Class246)this.field2199.method507()).method497();
            }
        }
    }

    private static void method9506() {
        Class6454.method24594();
    }

    private static void method9507(long l2) {
        Class440.field2196[2] = l2 ^ 0xD355DA342097B8E7L;
        Class440.field2196[8] = l2 ^ 0xD355DA342097B8C1L;
        Class440.field2196[7] = l2 ^ 0xD355DA342097B8E3L;
        Class440.field2196[0] = l2 ^ 0xD355DA342097B8E5L;
        Class440.field2196[3] = l2 ^ 0xD355DA342097B8E6L;
        Class440.field2196[6] = l2 ^ 0xD355DA342097B8ECL;
        Class440.field2196[9] = l2 ^ 0xD355DA342097B8C8L;
        Class440.field2196[1] = l2 ^ 0x2CAA25CBDF68471AL;
        Class440.field2196[4] = l2 ^ 0xD355DA342097B8E1L;
        Class440.field2196[5] = l2 ^ 0xD355DA342097B8E4L;
    }

    private static Class248 method9508(Class440 class440) {
        return Class440.method9531(class440);
    }

    private static int method9509(Class246 class246) {
        return class246.method500();
    }

    private static class_2596 method9510(int a2) {
        return new class_2886(Class440.method9530(), a2, Class440.field290.field_1724.method_36454(), Class440.field290.field_1724.method_36455());
    }

    public static Class248 method9511(Class440 class440) {
        return class440.field2198;
    }

    private static class_2596 method9512(int a2) {
        return new class_2886(class_1268.field_5808, a2, Class440.field290.field_1724.method_36454(), Class440.field290.field_1724.method_36455());
    }

    private static Object method9513(Class248 class248) {
        return class248.method507();
    }

    private static void method9514(float f2) {
        Class5836.method22907(f2);
    }

    private static Class3812 method9515(Class3812 class3812) {
        return class3812.method18502();
    }

    public static class_746 method9516(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method9517(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method9518(int n2) {
        return Class4045.method20103(n2);
    }

    private static class_2596 method9519(int a2) {
        return new class_2886(class_1268.field_5808, a2, Class440.field290.field_1724.method_36454(), Class440.field290.field_1724.method_36455());
    }

    private static int method9520(int n2, int n3, Class282 class282, Class829 class829) {
        return Class1533.method14486(n2, n3, class282, class829);
    }

    private static Object method9521(Class248 class248) {
        return class248.method507();
    }

    private static void method9522(Class3850 class3850, int n2) {
        class3850.method18887(n2);
    }

    private static class_1792 method9523() {
        return Class440.method9527();
    }

    private static void method9524() {
        Class1807.method15744();
    }

    private int method9525() {
        int c2 = (int)field2196[1];
        for (int b2 = (int)field2196[0]; b2 < (int)field2196[8]; ++b2) {
            class_1799 a2 = Class440.field290.field_1724.method_31548().method_5438(b2);
            if (!(a2.method_7909() instanceof class_1770)) continue;
            c2 = b2;
            break;
        }
        return c2;
    }

    private static class_1268 method9526() {
        return Class440.method9492();
    }

    public static class_1792 method9527() {
        return class_1802.field_8639;
    }

    private static void method9528() {
        Class6454.method24594();
    }

    private static class_243 method9529(Class365 class365) {
        return class365.method4722();
    }

    static {
        Class440.method9507(-3218426441266382619L);
    }

    public static class_1268 method9530() {
        return class_1268.field_5808;
    }

    public static Class248 method9531(Class440 class440) {
        return class440.field2195;
    }

    public Class440() {
        super("ClickTweaks", "Adds an additional bind on the button", Class556.field2754);
        this.field2199 = this.method450(new Class259("Friend", "Friends players when click", new Class246(this.method472() + "-friend", (int)field2196[1], this::method9505)));
        this.field2198 = this.method450(new Class259("Firework", "Uses firework to boost elytra when click", new Class246(this.method472() + "-firework", (int)field2196[1], this::method9485)));
        this.field2197 = this.method450(new Class259("ChestSwap", "Swaps chestplate when click", new Class246(this.method472() + "-chestswap", (int)field2196[1], this::method9535)));
        this.field2195 = this.method450(new Class260("Priority", "The chestplate material to prioritize", Class476.field2488, Class476.values()));
        this.field2200 = this.method450(new Class253("AutoFirework", "Automatically fireworks when swapping to an elytra", (boolean)field2196[0]));
        this.field2201 = this.method450(new Class259("Pearl", "Throws a pearl when click", new Class246(this.method472() + "-pearl", (int)field2196[1], this::method9502)));
        Class246[] class246Array = new Class246[(int)field2196[4]];
        class246Array[(int)Class440.field2196[0]] = (Class246)this.field2199.method507();
        class246Array[(int)Class440.field2196[5]] = (Class246)Class440.method9540(this.field2198);
        class246Array[(int)Class440.field2196[2]] = (Class246)this.field2201.method507();
        class246Array[(int)Class440.field2196[3]] = (Class246)this.field2197.method507();
        Class5723.field11059.method24181(class246Array);
    }

    private static void method9532(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9533() {
        Class6009.method23561();
    }

    private static Class365 method9534() {
        return Class365.method4718();
    }

    public void method9535() {
        if (this.method1265()) {
            class_1738 f2;
            class_1799 h2 = Class440.field290.field_1724.method_31548().method_7372((int)field2196[2]);
            class_1792 class_17922 = h2.method_7909();
            if (class_17922 instanceof class_1738 && (f2 = (class_1738)class_17922).method_7685() == class_1304.field_6174) {
                int e2 = this.method9525();
                if (e2 != (int)field2196[1]) {
                    if (e2 < (int)field2196[6]) {
                        Class1668.method15147(-86647810, 925525418, 22690254, 1667488745);
                        return;
                    }
                    Class440.method9490().method18923(e2);
                    Class5723.field11058.method18923((int)field2196[7]);
                    Class5723.field11058.method18923(e2 < (int)field2196[6] ? e2 + (int)field2196[8] : e2);
                    if (((Boolean)this.field2200.method507()).booleanValue() && !Class440.field290.field_1724.method_24828()) {
                        Class5723.field11048.method21341((class_2596)new class_2848((class_1297)Class440.field290.field_1724, class_2848.class_2849.field_12982));
                        Class440.field290.field_1724.method_23669();
                        int d2 = (int)field2196[1];
                        int b2 = (int)field2196[0];
                        if (b2 < (int)field2196[9]) {
                            class_1799 a2 = Class440.field290.field_1724.method_31548().method_5438(b2);
                            if (a2.method_7909() == Class440.method9523()) {
                                d2 = b2;
                            } else {
                                ++b2;
                                Class5836.method22890();
                                return;
                            }
                        }
                        if (d2 != (int)field2196[1]) {
                            Class3979.method19561();
                            return;
                        }
                        return;
                    }
                }
            } else {
                int g2 = Class440.method9504(this);
                if (g2 == (int)field2196[1]) {
                    Class6454.method24636(0.6311204970962606, Class1283.field5002, Class4075.field9426, 0.7661416214357633);
                    return;
                }
                if (g2 >= (int)field2196[6]) {
                    while (true) {
                        // Infinite loop
                    }
                }
                Class5723.field11058.method18923(g2 + (int)field2196[8]);
                Class5723.field11058.method18923((int)field2196[7]);
                Class5723.field11058.method18923(g2 < (int)field2196[6] ? g2 + (int)field2196[8] : g2);
            }
        }
    }

    private static void method9536(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9537(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    private static Object method9538(Class248 class248) {
        return class248.method507();
    }

    private static int method9539(Class3850 class3850) {
        return class3850.method18969();
    }

    private static Object method9540(Class248 class248) {
        return class248.method507();
    }

    private static void method9541() {
        Class6454.method24594();
    }

    public static Class248 method9542(Class440 class440) {
        return class440.field2202;
    }

    private static int method9543(int n2, int n3, Class634 class634, Class3285 class3285) {
        return Class1533.method14475(n2, n3, class634, class3285);
    }

    private static int method9544(int n2, int n3, Class5944 class5944, Class244 class244) {
        return Class1533.method14502(n2, n3, class5944, class244);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

