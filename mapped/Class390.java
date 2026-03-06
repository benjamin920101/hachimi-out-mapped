/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1671
 *  net.minecraft.class_1713
 *  net.minecraft.class_1770
 *  net.minecraft.class_1781
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1835
 *  net.minecraft.class_1893
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2813
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2879
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 */
package mapped;

import java.util.Iterator;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class129;
import mapped.Class1308;
import mapped.Class131;
import mapped.Class1387;
import mapped.Class146;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3684;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class40;
import mapped.Class4074;
import mapped.Class408;
import mapped.Class41;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class447;
import mapped.Class453;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class569;
import mapped.Class5723;
import mapped.Class58;
import mapped.Class5830;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class75;
import mapped.Class925;
import mapped.Class926;
import net.hachimi.client.mixin.au;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1671;
import net.minecraft.class_1713;
import net.minecraft.class_1770;
import net.minecraft.class_1781;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1835;
import net.minecraft.class_1893;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2879;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_636;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class390
extends Class278 {
    int field1342;
    Class248 field1343;
    private final Class925 field1344 = new Class926();
    Class248 field1345;
    private static long[] field1346 = new long[10];
    private static Class390 INSTANCE;
    Class248 field1347;
    Class248 field1348 = this.method450(new Class260("Mode", "The mode for disabling anticheat checks", Class569.field2785, Class569.values()));
    Class248 field1349;

    private static Object method5445(Class248 class248) {
        return class248.method507();
    }

    private static class_746 method5446(class_310 class_3102) {
        return Class390.method5471(class_3102);
    }

    private static void method5447() {
        Class5836.method22885();
    }

    private static void method5448() {
        Class1807.method15744();
    }

    private static class_746 method5449(class_310 class_3102) {
        return Class390.method5513(class_3102);
    }

    private static void method5450() {
        Class1745.method15538();
    }

    @Class1
    public void method5451(Class63 h2) {
        if (h2.method128() != Class543.field2690) {
            return;
        }
        if (this.field1348.method507() == Class569.field2785) {
            if (Class390.field290.field_1724.method_6115()) {
                return;
            }
            int c2 = (int)field1346[7];
            for (int b2 = (int)field1346[0]; b2 < (int)field1346[8]; ++b2) {
                class_1799 a2 = Class390.method5492(field290).method_31548().method_5438(b2);
                if (a2.method_7960()) continue;
                if (!(a2.method_7909() instanceof class_1835)) {
                    Class390.method5472();
                    return;
                }
                if (Class1308.method13621(a2, class_1893.field_9104) <= 0) continue;
                c2 = b2;
                break;
            }
            if (c2 == (int)field1346[7]) {
                return;
            }
            Class5723.field11058.method18887(c2);
            Class5723.field11048.method21353(Class390::method5491);
            Class5723.field11048.method21341((class_2596)new class_2846(Class390.method5504(), class_2338.field_10980, class_2350.field_11033));
            Class5723.field11058.method18916();
        } else if (this.field1348.method507() == Class390.method5452()) {
            int f2 = (int)field1346[7];
            int g2 = (int)field1346[7];
            for (int e2 = (int)field1346[0]; e2 < (int)field1346[6]; ++e2) {
                class_1799 d2 = Class390.field290.field_1724.method_31548().method_5438(e2);
                if (d2.method_7909() instanceof class_1781 && e2 < (int)field1346[8]) {
                    g2 = e2;
                }
                if (!(d2.method_7909() instanceof class_1770)) continue;
                f2 = e2;
            }
            if (!this.method5456()) {
                if (!Class390.field290.field_1724.method_52535() && g2 != (int)field1346[7]) {
                    if (Class390.method5510(field290).method_24828()) {
                        Class390.field290.field_1724.method_6043();
                        Class6454.method24594();
                        return;
                    }
                    Class390.method5482(Class390.method5490(), -0.05);
                    if (this.field1344.method12595((int)field1346[9])) {
                        if (Class390.field290.field_1724.method_24828()) {
                            Class1503.method14420();
                            return;
                        }
                        if (Class390.field290.field_1724.method_18798().field_1351 < 0.0) {
                            if (Class390.field290.field_1724.method_6118(class_1304.field_6174).method_7909() != class_1802.field_8833 && f2 != (int)field1346[7]) {
                                if (f2 >= (int)field1346[8]) {
                                    Class4146.method20697();
                                    return;
                                }
                                Class390.field290.field_1761.method_2906((int)field1346[0], f2 + (int)field1346[6], (int)field1346[0], class_1713.field_7790, (class_1657)Class390.field290.field_1724);
                                Class390.field290.field_1761.method_2906((int)field1346[0], (int)field1346[5], (int)field1346[0], class_1713.field_7790, (class_1657)Class390.field290.field_1724);
                                Class390.method5475(field290).method_2906((int)field1346[0], f2 < (int)field1346[8] ? f2 + (int)field1346[6] : f2, (int)field1346[0], Class390.method5524(), (class_1657)Class390.field290.field_1724);
                            }
                            Class5723.field11048.method21341((class_2596)new class_2848((class_1297)Class390.method5522(field290), class_2848.class_2849.field_12982));
                            Class5723.field11058.method18887(g2);
                            Class5723.field11048.method21353(Class390::method5468);
                            Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
                            Class390.method5542(Class5723.field11058);
                            this.field1344.method12593();
                            if (Class390.field290.field_1724.method_6118(class_1304.field_6174).method_7909() == class_1802.field_8833) {
                                if (f2 == (int)field1346[7]) {
                                    Class6009.method23559(false);
                                    return;
                                }
                                Class390.field290.field_1761.method_2906((int)field1346[0], (int)field1346[5], (int)field1346[0], class_1713.field_7790, (class_1657)Class390.field290.field_1724);
                                Class390.field290.field_1761.method_2906((int)field1346[0], f2 < (int)field1346[8] ? f2 + (int)field1346[6] : f2, (int)field1346[0], class_1713.field_7790, (class_1657)Class390.field290.field_1724);
                                Class390.field290.field_1761.method_2906((int)field1346[0], (int)field1346[5], (int)field1346[0], class_1713.field_7790, (class_1657)Class390.method5501(field290));
                            }
                        }
                    }
                }
            }
        }
    }

    public static Class569 method5452() {
        return Class569.field2787;
    }

    public static Class569 method5453() {
        return Class569.field2784;
    }

    private static void method5454(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method5455(Class390 class390) {
        return class390.field1348;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method5456() {
        Iterator iterator = Class390.field290.field_1687.method_18112().iterator();
        block4: while (iterator.hasNext()) {
            class_1297 b2 = (class_1297)iterator.next();
            if (!(b2 instanceof class_1671)) continue;
            class_1671 a2 = (class_1671)b2;
            int n2 = ((au)a2).hookWasShotByEntity() ? 55018 : 55019;
            block5: while (true) {
                switch (n2) {
                    case 55019: {
                        n2 = 55017;
                        continue block5;
                    }
                    case 55018: {
                        if (((au)a2).hookGetShooter() != Class390.field290.field_1724) continue block4;
                        return (int)field1346[1] != 0;
                    }
                }
                break;
            }
        }
        return (int)field1346[0] != 0;
    }

    private static Object method5457(Class248 class248) {
        return class248.method507();
    }

    public boolean method5458() {
        return (this.method1265() && this.field1348.method507() == Class569.field2787 ? (int)field1346[1] : (int)field1346[0]) != 0;
    }

    public static class_746 method5459(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5460(long l2) {
        Class390.field1346[4] = l2 ^ 0x82A605D7AE210372L;
        Class390.field1346[6] = l2 ^ 0x82A605D7AE210342L;
        Class390.field1346[5] = l2 ^ 0x82A605D7AE210360L;
        Class390.field1346[9] = l2 ^ 0x82A605D7AE2105C2L;
        Class390.field1346[3] = l2 ^ 0x82A605D7AE210354L;
        Class390.field1346[7] = l2 ^ 0x7D59FA2851DEFC99L;
        Class390.field1346[1] = l2 ^ 0x82A605D7AE210367L;
        Class390.field1346[2] = l2 ^ 0x82A605D7AE210375L;
        Class390.field1346[8] = l2 ^ 0x82A605D7AE21036FL;
        Class390.field1346[0] = l2 ^ 0x82A605D7AE210366L;
    }

    private static class_746 method5461(class_310 class_3102) {
        return Class390.method5537(class_3102);
    }

    private static boolean method5462(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method5463(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class569 method5464() {
        return Class569.field2784;
    }

    private static boolean method5465() {
        return Class5659.method22194();
    }

    public static float method5466(class_746 class_7462) {
        return class_7462.field_3941;
    }

    private static void method5467() {
        Class1745.method15538();
    }

    private static class_2596 method5468(int a2) {
        return new class_2886(class_1268.field_5808, a2, Class390.method5485(field290).method_36454(), Class390.method5459(field290).method_36455());
    }

    private static boolean method5469(Class390 class390) {
        return class390.method5458();
    }

    private static int method5470(int n2, int n3, Class453 class453, Class3684 class3684) {
        return Class4074.method20301(n2, n3, class453, class3684);
    }

    public static class_746 method5471(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5472() {
        Class298.method1924();
    }

    private static boolean method5473() {
        return Class5836.method22894();
    }

    public static class_746 method5474(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public Class390() {
        super("Disabler", "Disables anticheat checks", Class556.field2755);
        this.field1343 = this.method450(new Class253("MultiActionsC", "Bypass the Sprinting clickslot check", (boolean)field1346[0], this::method1269));
        this.field1345 = this.method450(new Class253("OnlyPhased", "Only works in walls", (boolean)field1346[0], this::method1278));
        this.field1349 = this.method450(new Class253("GrimV3", "", (boolean)field1346[0], this::method5528));
        this.field1347 = this.method450(new Class253("Limit", "", (boolean)field1346[1], this::method5493));
        INSTANCE = this;
    }

    public static class_636 method5475(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method5476(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method5477(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method5478(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static double method5479(Class58 class58) {
        return class58.method122();
    }

    private static void method5480() {
        Class5659.method22184();
    }

    private static void method5481() {
        Class5659.method22184();
    }

    private static void method5482(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static void method5483() {
        Class6009.method23560();
    }

    public static void method5484(Class390 class390, int n2) {
        class390.field1342 = n2;
    }

    private static class_746 method5485(class_310 class_3102) {
        return Class390.method5495(class_3102);
    }

    @Class1
    public void method5486(Class129 a2) {
        if (this.field1348.method507() == Class569.field2787) {
            a2.method10();
            a2.method239(0.0);
            a2.method242(0.0);
            a2.method247(0.0);
        }
    }

    @Class1
    public void method5487(Class75 a2) {
        if (this.method5518()) {
            a2.method10();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method5488() {
        if (this.method5458()) {
            int n2 = this.method5456() ? 11469 : 11470;
            block4: while (true) {
                switch (n2) {
                    case 11470: {
                        n2 = 11468;
                        continue block4;
                    }
                    case 11469: {
                        int n3 = (int)field1346[1];
                        return Class390.method5523(0.6762907939507258, 0.9638254910339843);
                    }
                }
                break;
            }
        }
        return (int)field1346[0] != 0;
    }

    public static class_746 method5489(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class1387 method5490() {
        return Class390.method5520();
    }

    private static class_2596 method5491(int a2) {
        return new class_2886(class_1268.field_5808, a2, Class390.field290.field_1724.method_36454(), Class390.method5461(field290).method_36455());
    }

    public static class_746 method5492(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method5493() {
        int n2;
        if (Class390.method5457(this.field1348) == Class569.field2784) {
            if (!((Boolean)this.field1349.method507()).booleanValue()) {
                Class1503.method14417(0.5889835f, 0.69722074f);
                return null;
            }
            n2 = (int)field1346[1];
        } else {
            n2 = (int)field1346[0];
        }
        return n2 != 0;
    }

    public static Class248 method5494(Class390 class390) {
        return class390.field1349;
    }

    private Boolean method1278() {
        return (this.field1348.method507() == Class390.method5516() ? (int)field1346[1] : (int)field1346[0]) != 0;
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)this.field1348.method507());
    }

    public static class_746 method5495(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class390 method5496() {
        return INSTANCE;
    }

    public static class_746 method5497(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5498() {
        Class6454.method24594();
    }

    private static void method5499(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method5500() {
        Class5836.method22897();
    }

    public static class_746 method5501(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method5502(int n2, int n3, Class146 class146, Class40 class40) {
        return Class4074.method20300(n2, n3, class146, class40);
    }

    private static boolean method5503() {
        return Class408.method6431();
    }

    public static class_2846.class_2847 method5504() {
        return class_2846.class_2847.field_12974;
    }

    private static void method5505(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5506() {
        Class1745.method15538();
    }

    @Class1
    public void method5507(Class41 a2) {
        if (((Class569)((Object)this.field1348.method507())).equals((Object)Class390.method5508())) {
            a2.method10();
        }
    }

    public static Class569 method5508() {
        return Class569.field2785;
    }

    private static Class5496 method5509() {
        return Class390.method5543();
    }

    public static class_746 method5510(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5511() {
        Class6454.method24594();
    }

    public static class_746 method5512(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5513(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5514() {
        Class3979.method19561();
    }

    private static boolean method5515() {
        return Class447.method10252();
    }

    private static Class569 method5516() {
        return Class390.method5550();
    }

    private static void method5517() {
        Class5836.method22897();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method5518() {
        int n2;
        if (!Class390.field290.field_1724.method_6128() && this.field1348.method507() == Class569.field2786) {
            n2 = (int)field1346[1];
            return n2 != 0;
        }
        n2 = (int)field1346[0];
        return n2 != 0;
    }

    public static class_746 method5519(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class1387 method5520() {
        return Class5723.field11052;
    }

    public static void method5521(Class390 class390, int n2) {
        class390.field1342 = n2;
    }

    public static class_746 method5522(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method5523(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public static class_1713 method5524() {
        return class_1713.field_7790;
    }

    private static boolean method5525(int n2) {
        return Class4196.method20803(n2);
    }

    @Class1
    public void method5526(Class131 b2) {
        class_2596 class_25962 = b2.method251();
        if (!(class_25962 instanceof class_2813)) {
            Class5836.method22885();
            return;
        }
        class_2813 a2 = (class_2813)class_25962;
        if (this.field1348.method507() == Class390.method5464()) {
            if (((Boolean)Class390.method5445(this.field1343)).booleanValue()) {
                if (Class390.field290.field_1724.method_5624()) {
                    b2.method10();
                    Class390.method5499(Class5723.field11048, (class_2596)new class_2828.class_2830(Class390.field290.field_1724.method_23317(), Class390.field290.field_1724.method_23318(), Class390.field290.field_1724.method_23321(), Class390.field290.field_1724.field_3941, Class390.method5449((class_310)Class390.field290).field_3925, Class390.method5497(field290).method_24828()));
                    Class390.method5509().method21341((class_2596)new class_2848((class_1297)Class390.method5446(field290), class_2848.class_2849.field_12985));
                    Class5723.field11048.method21342((class_2596)a2);
                    Class5723.field11048.method21341((class_2596)new class_2828.class_2830(Class390.field290.field_1724.method_23317(), Class390.field290.field_1724.method_23318(), Class390.field290.field_1724.method_23321(), Class390.method5466(Class390.method5519(field290)), Class390.field290.field_1724.field_3925, Class390.field290.field_1724.method_24828()));
                    Class5723.field11048.method21341((class_2596)new class_2848((class_1297)Class390.field290.field_1724, class_2848.class_2849.field_12981));
                }
            }
        }
    }

    private static boolean method5527() {
        return Class408.method6431();
    }

    private Boolean method5528() {
        return (Class390.method5455(this).method507() == Class569.field2784 ? (int)field1346[1] : (int)field1346[0]) != 0;
    }

    private static void method5529(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Class1(priority=-1000)
    public void method5530(Class58 i2) {
        block8: {
            int n2;
            block9: {
                int h2;
                int g2;
                int f2;
                block7: {
                    int n3;
                    if (Class390.method5512((class_310)Class390.field290).field_3923 >= (int)field1346[2]) {
                        Class390.method5521(this, (int)field1346[0]);
                    }
                    Class390 class390 = this;
                    Class390.method5484(class390, Class390.method5546(class390) + (int)field1346[1]);
                    if (this.field1348.method507() != Class390.method5453()) return;
                    if (((Boolean)this.field1345.method507()).booleanValue() && !Class390.method5515()) {
                        return;
                    }
                    double a2 = i2.method115() - Class390.field290.field_1724.field_3926;
                    double b2 = i2.method119() - Class390.field290.field_1724.field_3940;
                    double c2 = Class390.method5479(i2) - Class390.method5489((class_310)Class390.field290).field_3924;
                    double d2 = i2.method114() - Class390.method5474((class_310)Class390.field290).field_3941;
                    double e2 = i2.method120() - Class390.field290.field_1724.field_3925;
                    int n4 = f2 = class_3532.method_41190((double)a2, (double)b2, (double)c2) > class_3532.method_33723((double)2.0E-4) ? (int)field1346[1] : (int)field1346[0];
                    if (f2 != 0) {
                        int n5 = 32897;
                        Class6009.method23559(true);
                        return;
                    }
                    int n6 = 32898;
                    boolean bl2 = true;
                    do {
                        if (!bl2 || (bl2 = false) || !true) {
                            n6 = n3 = 32896;
                        }
                        if (n3 != 32897) continue;
                        this.field1342 = (int)field1346[0];
                        break;
                    } while (n3 == 32898);
                    g2 = d2 != 0.0 || e2 != 0.0 ? (int)field1346[1] : (int)field1346[0];
                    int n7 = h2 = Class390.field290.field_1724.field_3923 < (int)field1346[2] ? (int)field1346[0] : (int)field1346[1];
                    if (!((Boolean)Class390.method5494(this).method507()).booleanValue()) break block7;
                    if (g2 == 0) return;
                    if (f2 != 0) return;
                    Class390.field290.field_1724.field_3923 = (int)field1346[3];
                    Class390.method5531(Class390.field290.field_1724, Class5830.field11369);
                    if (this.field1342 >= (int)field1346[4] || h2 != 0) break block8;
                    n2 = !((Boolean)this.field1347.method507()).booleanValue() ? 65421 : 65422;
                    break block9;
                }
                if (f2 != 0 || h2 == 0) {
                    if (g2 == 0) return;
                }
                Class390.method5545(Class390.field290.field_1724, (int)field1346[3]);
                Class390.field290.field_1724.field_3941 = 999.0f;
                return;
            }
            int n8 = n2;
            if (n8 != 65421) {
                if (n8 == 65422) return;
                return;
            }
        }
        Class390.field290.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(i2.method115(), Class390.method5534(i2), i2.method122(), i2.method123()));
        this.field1342 = (int)field1346[0];
    }

    public static void method5531(class_746 class_7462, float f2) {
        class_7462.field_3941 = f2;
    }

    private static void method5532() {
        Class4146.method20694();
    }

    public boolean method5533() {
        return (Class390.method5469(this) && !this.method5456() ? (int)field1346[1] : (int)field1346[0]) != 0;
    }

    private static double method5534(Class58 class58) {
        return class58.method119();
    }

    private static void method5535() {
        Class6009.method23560();
    }

    private static void method5536(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_746 method5537(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5538() {
        Class5836.method22885();
    }

    private static void method5539(boolean bl2) {
        Class6009.method23559(bl2);
    }

    static {
        Class390.method5460(-9032525578747444378L);
    }

    private static boolean method5540() {
        return Class4196.method20801();
    }

    private static void method5541() {
        Class1745.method15538();
    }

    private static void method5542(Class3850 class3850) {
        class3850.method18916();
    }

    public static Class5496 method5543() {
        return Class5723.field11048;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1269() {
        int n2;
        int n3 = this.field1348.method507() == Class569.field2784 ? 49436 : 49437;
        block4: while (true) {
            switch (n3) {
                case 49437: {
                    n3 = 49435;
                    continue block4;
                }
                case 49436: {
                    n2 = (int)field1346[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1346[0];
        return n2 != 0;
    }

    private static void method5544(float f2) {
        Class5836.method22907(f2);
    }

    public static void method5545(class_746 class_7462, int n2) {
        class_7462.field_3923 = n2;
    }

    public static int method5546(Class390 class390) {
        return class390.field1342;
    }

    private static void method5547() {
        Class6009.method23561();
    }

    private static void method5548(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5549() {
        Class1745.method15538();
    }

    public static Class569 method5550() {
        return Class569.field2784;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

