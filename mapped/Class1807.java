/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1799
 *  net.minecraft.class_1893
 *  net.minecraft.class_241
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_5321
 *  net.minecraft.class_638
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1108;
import mapped.Class1308;
import mapped.Class1399;
import mapped.Class147;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class209;
import mapped.Class216;
import mapped.Class230;
import mapped.Class348;
import mapped.Class3974;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class419;
import mapped.Class423;
import mapped.Class447;
import mapped.Class545;
import mapped.Class5463;
import mapped.Class5541;
import mapped.Class5655;
import mapped.Class5659;
import mapped.Class5752;
import mapped.Class583;
import mapped.Class5834;
import mapped.Class5836;
import mapped.Class599;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class86;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5321;
import net.minecraft.class_638;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1807 {
    private static long[] field6744 = new long[2];

    /*
     * Enabled aggressive block sorting
     */
    public static float method15736(class_744 a2, float b2) {
        if (a2.field_3905 < 0.0f) {
            b2 += 180.0f;
        }
        float c2 = 1.0f;
        if (a2.field_3905 < 0.0f) {
            c2 = -0.5f;
        } else if (a2.field_3905 > 0.0f) {
            c2 = 0.5f;
        }
        float d2 = a2.field_3907;
        int n2 = d2 > 0.0f ? 64399 : 64400;
        block4: while (true) {
            switch (n2) {
                case 64400: {
                    n2 = 64398;
                    continue block4;
                }
                case 64399: {
                    b2 -= 90.0f * c2;
                    break block4;
                }
            }
            break;
        }
        if (d2 < 0.0f) {
            b2 += 90.0f * c2;
        }
        return b2;
    }

    private static class_746 method15737(class_310 class_3102) {
        return Class1807.method15772(class_3102);
    }

    private static void method15738() {
        Class4146.method20694();
    }

    private static void method15739(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method15740(int n2, int n3, Class209 class209, Class5655 class5655) {
        return Class5541.method21818(n2, n3, class209, class5655);
    }

    private static void method15741(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static boolean method15742() {
        return (Class1807.method15767().field_1690.field_1894.method_1434() || Class4122.field9561.field_1690.field_1881.method_1434() || Class1807.method15765().field_1690.field_1913.method_1434() || Class4122.field9561.field_1690.field_1849.method_1434() ? (int)field6744[0] : (int)field6744[1]) != 0;
    }

    private static void method15743(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static void method15744() {
        float a2 = class_3532.method_15363((float)(Class5752.field11136 + (float)Class1807.method15759(Class4122.field9561.field_1724.method_6118(class_1304.field_6166), Class1807.method15766()) * 0.15f), (float)0.0f, (float)1.0f);
        Class1807.method15770((class_310)Class4122.field9561).field_3913.field_3905 *= a2;
        Class4122.field9561.field_1724.field_3913.field_3907 *= a2;
    }

    public static class_744 method15745(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static int method15746(int n2, int n3, Class583 class583, Class599 class599) {
        return Class5541.method21775(n2, n3, class583, class599);
    }

    private static void method15747(long l2) {
        Class1807.field6744[1] = l2 ^ 0xA4177A7002C9AF53L;
        Class1807.field6744[0] = l2 ^ 0xA4177A7002C9AF52L;
    }

    private static void method15748() {
        Class1745.method15538();
    }

    public static class_746 method15749(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method15750(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method15751() {
        return Class447.method10252();
    }

    private static void method15752() {
        Class1807.method15744();
    }

    public static boolean method15753() {
        block4: {
            block3: {
                if (Class1807.method15750((class_310)Class4122.field9561).field_3913.field_3905 != 0.0f) break block3;
                if (Class1807.method15745((class_746)Class1807.method15775().field_1724).field_3907 == 0.0f) break block4;
            }
            int n2 = (int)field6744[0];
            while (true) {
                // Infinite loop
            }
        }
        return (int)field6744[1] != 0;
    }

    private static void method15754() {
        Class6009.method23560();
    }

    private static void method15755(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method15756(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method15757(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15758(float f2) {
        Class5836.method22907(f2);
    }

    private static int method15759(class_1799 class_17992, class_5321 class_53212) {
        return Class1308.method13621(class_17992, class_53212);
    }

    private static void method15760(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method15761() {
        Class5836.method22885();
    }

    public static class_310 method15762() {
        return Class4122.field9561;
    }

    public static class_638 method15763(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static class_746 method15764(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_310 method15765() {
        return Class1807.method15762();
    }

    public static class_5321 method15766() {
        return class_1893.field_38223;
    }

    public static class_310 method15767() {
        return Class4122.field9561;
    }

    private static boolean method15768() {
        return Class5836.method22894();
    }

    public static boolean method15769() {
        double c2;
        double b2;
        double a2 = Class4122.field9561.field_1724.method_23317() - Class1807.method15749((class_310)Class4122.field9561).field_3926;
        return (class_3532.method_41190((double)a2, (double)(b2 = Class4122.field9561.field_1724.method_23318() - Class4122.field9561.field_1724.field_3940), (double)(c2 = Class1807.method15737(Class4122.field9561).method_23321() - Class1807.method15764((class_310)Class4122.field9561).field_3924)) > class_3532.method_33723((double)Class5834.field11385) ? (int)field6744[0] : (int)field6744[1]) != 0;
    }

    public static class_746 method15770(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15771(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method15772(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method15773(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static class_241 method15774(double a2, double b2) {
        double c2 = 0.05;
        double d2 = a2;
        double e2 = b2;
        float f2 = -Class4122.field9561.field_1724.method_49476();
        if (!Class4122.field9561.field_1724.method_24828()) {
            f2 = -1.5f;
        }
        while (d2 != 0.0 && Class4122.field9561.field_1687.method_8587((class_1297)Class4122.field9561.field_1724, Class4122.field9561.field_1724.method_5829().method_989(d2, (double)f2, 0.0))) {
            if (d2 < 0.05 && d2 >= -0.05) {
                d2 = 0.0;
                continue;
            }
            if (!(d2 > 0.0)) {
                Class1503.method14417(0.87267613f, 0.5301857f);
                return null;
            }
            d2 -= Class1399.field5397;
        }
        block13: while (e2 != 0.0) {
            int n2 = Class4122.field9561.field_1687.method_8587((class_1297)Class1807.method15757(Class4122.field9561), Class4122.field9561.field_1724.method_5829().method_989(0.0, (double)f2, e2)) ? 14588 : 14589;
            block14: while (true) {
                switch (n2) {
                    case 14589: {
                        n2 = 14587;
                        continue block14;
                    }
                    case 14588: {
                        if (e2 < 0.05 && e2 >= Class5463.field10237) {
                            e2 = 0.0;
                            Class1807.method15755(0.06098720414781911, 0.8857626922357781, Class3974.field9059, 0.5765986087320818);
                            return null;
                        }
                        int n3 = !(e2 > 0.0) ? 26424 : 26423;
                        block15: while (true) {
                            switch (n3) {
                                case 26424: {
                                    n3 = 26422;
                                    continue block15;
                                }
                                case 26423: {
                                    e2 -= 0.05;
                                    continue block13;
                                }
                            }
                            break;
                        }
                        e2 += 0.05;
                        continue block13;
                    }
                }
                break;
            }
        }
        block16: while (d2 != 0.0) {
            if (e2 == 0.0) return new class_241((float)d2, (float)e2);
            if (Class1807.method15763(Class4122.field9561).method_8587((class_1297)Class4122.field9561.field_1724, Class4122.field9561.field_1724.method_5829().method_989(d2, (double)f2, e2))) {
                int n4 = 18977;
                Class1807.method15776();
                return null;
            }
            int n5 = 18978;
            block17: while (true) {
                switch (n5) {
                    case 18978: {
                        n5 = 18976;
                        continue block17;
                    }
                    case 18977: {
                        if (!(d2 < 0.05)) {
                            Class1807.method15784(0.5646890013009431, 0.646942554080267, 0.43137194144551805, 0.17520996437387693);
                            return null;
                        }
                        d2 = d2 >= -0.05 ? 0.0 : (d2 > 0.0 ? (d2 -= 0.05) : (d2 += 0.05));
                        if (e2 < 0.05 && e2 >= -0.05) {
                            while (true) {
                                // Infinite loop
                            }
                        }
                        if (e2 > 0.0) {
                            e2 -= 0.05;
                            continue block16;
                        }
                        e2 += 0.05;
                        continue block16;
                    }
                }
                break;
            }
        }
        return new class_241((float)d2, (float)e2);
    }

    public static class_310 method15775() {
        return Class4122.field9561;
    }

    private static void method15776() {
        Class6454.method24594();
    }

    private static boolean method15777() {
        return Class5659.method22111();
    }

    private static int method15778(int n2, int n3, Class419 class419, Class423 class423) {
        return Class5541.method21774(n2, n3, class419, class423);
    }

    private static float method15779() {
        return Class6322.method24324();
    }

    private static int method15780(int n2, int n3, Class86 class86, Class216 class216) {
        return Class5541.method21795(n2, n3, class86, class216);
    }

    static {
        Class1807.method15747(-6622690105523327149L);
    }

    private static int method15781(int n2, int n3, Class147 class147, Class348 class348) {
        return Class5541.method21807(n2, n3, class147, class348);
    }

    private static void method15782(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method15783() {
        Class5836.method22890();
    }

    private static void method15784(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method15785(int n2, int n3, Class230 class230, Class545 class545) {
        return Class5541.method21773(n2, n3, class230, class545);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

