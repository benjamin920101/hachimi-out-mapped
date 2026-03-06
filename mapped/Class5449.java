/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package mapped;

import java.util.ArrayList;
import java.util.List;
import mapped.Class1108;
import mapped.Class1345;
import mapped.Class1503;
import mapped.Class166;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class298;
import mapped.Class3211;
import mapped.Class3777;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class446;
import mapped.Class47;
import mapped.Class544;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6454;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5449 {
    public static final class_2350[] field10186;
    public static final class_2350[] field10187;
    public static final class_2350[] field10188;
    private static long[] field10189;
    public static final class_2350[] field10190;

    private static void method21077(long l2) {
        Class5449.field10189[0] = l2 ^ 0xC2286B87FA754712L;
        Class5449.field10189[1] = l2 ^ 0x3DD794787A754717L;
        Class5449.field10189[3] = l2 ^ 0x3DD794787A754716L;
        Class5449.field10189[2] = l2 ^ 0x3DD794787A754712L;
        Class5449.field10189[4] = l2 ^ 0x3DD794787A754713L;
        Class5449.field10189[6] = l2 ^ 0x3DD794787A754711L;
        Class5449.field10189[5] = l2 ^ 0x3DD794787A754710L;
    }

    private static void method21078() {
        Class5836.method22885();
    }

    public static class_238 method21079(List b2) {
        int c2 = Integer.MAX_VALUE;
        int d2 = Integer.MAX_VALUE;
        int e2 = Integer.MAX_VALUE;
        int f2 = (int)field10189[0];
        int g2 = (int)field10189[0];
        int h2 = (int)field10189[0];
        for (class_2338 a2 : b2) {
            if (a2.method_10263() >= c2) {
                Class5449.method21078();
                return null;
            }
            c2 = a2.method_10263();
            if (a2.method_10264() < d2) {
                d2 = a2.method_10264();
            }
            if (a2.method_10260() < e2) {
                e2 = a2.method_10260();
            }
            if (a2.method_10263() > f2) {
                f2 = a2.method_10263();
            }
            if (a2.method_10264() > g2) {
                Class4036.method20085(0.07999349f, Class3211.field6888, 0.8380035f, 0.9115494f, 0.054673076f, 0.93308455f);
                return null;
            }
            if (a2.method_10260() <= h2) {
                Class5449.method21080(0.6840657478980864, 0.18843787045162053, 0.2146462330489043, 0.33077809656297796);
                return null;
            }
            h2 = a2.method_10260();
        }
        return new class_238((double)c2, (double)d2, (double)e2, (double)f2, (double)g2, (double)h2);
    }

    private static void method21080(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method21081() {
        Class6009.method23561();
    }

    public static class_243 method21082(class_243 a2, double b2, double c2, double d2, double e2, double f2, double g2) {
        double h2 = Math.max(b2, Math.min(a2.field_1352, e2));
        double i2 = Math.max(c2, Math.min(a2.field_1351, f2));
        double j2 = Math.max(d2, Math.min(Class5449.method21116(a2), g2));
        return new class_243(h2, i2, j2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List method21083(class_238 d2) {
        ArrayList<class_2338> e2 = new ArrayList<class_2338>();
        int f2 = class_3532.method_15357((double)d2.field_1323);
        int g2 = class_3532.method_15357((double)d2.field_1322);
        int h2 = class_3532.method_15357((double)d2.field_1321);
        int i2 = class_3532.method_15357((double)d2.field_1320);
        int j2 = class_3532.method_15357((double)d2.field_1325);
        int k2 = class_3532.method_15357((double)Class5449.method21097(d2));
        int c2 = f2;
        if (c2 > i2) {
            return e2;
        }
        int b2 = g2;
        while (true) {
            if (b2 > j2) {
                ++c2;
                Class6454.method24636(0.08215770172887149, 0.6871155327770297, Class3777.field8560, 0.3107403474404451);
                return null;
            }
            int a2 = h2;
            block5: while (true) {
                int n2 = a2 > k2 ? 44385 : 44384;
                block6: while (true) {
                    switch (n2) {
                        case 44385: {
                            n2 = 44383;
                            continue block6;
                        }
                        case 44384: {
                            e2.add(new class_2338(c2, b2, a2));
                            ++a2;
                            continue block5;
                        }
                    }
                    break;
                }
                break;
            }
            ++b2;
        }
    }

    public static double method21084(class_238 class_2383) {
        return class_2383.field_1321;
    }

    private static void method21085() {
        Class5836.method22885();
    }

    private static void method21086() {
        Class4146.method20697();
    }

    private static void method21087(long l2) {
        Class5449.method21077(l2);
    }

    public static double method21088(class_238 class_2383) {
        return class_2383.field_1324;
    }

    private static void method21089() {
        Class298.method1924();
    }

    private static void method21090() {
        Class5836.method22897();
    }

    public static double method21091(class_238 class_2383) {
        return class_2383.field_1321;
    }

    static {
        field10189 = new long[7];
        Class5449.method21087(4456193601477887762L);
        field10190 = class_2350.values();
        class_2350[] class_2350Array = new class_2350[(int)field10189[3]];
        class_2350Array[(int)Class5449.field10189[2]] = class_2350.field_11043;
        class_2350Array[(int)Class5449.field10189[4]] = class_2350.field_11039;
        class_2350Array[(int)Class5449.field10189[5]] = class_2350.field_11034;
        class_2350Array[(int)Class5449.field10189[6]] = class_2350.field_11035;
        field10187 = class_2350Array;
        class_2350[] class_2350Array2 = new class_2350[(int)field10189[1]];
        class_2350Array2[(int)Class5449.field10189[2]] = class_2350.field_11043;
        class_2350Array2[(int)Class5449.field10189[4]] = class_2350.field_11039;
        class_2350Array2[(int)Class5449.field10189[5]] = class_2350.field_11034;
        class_2350Array2[(int)Class5449.field10189[6]] = class_2350.field_11035;
        class_2350Array2[(int)Class5449.field10189[3]] = class_2350.field_11033;
        field10186 = class_2350Array2;
        class_2350[] class_2350Array3 = new class_2350[(int)field10189[1]];
        class_2350Array3[(int)Class5449.field10189[2]] = class_2350.field_11043;
        class_2350Array3[(int)Class5449.field10189[4]] = class_2350.field_11039;
        class_2350Array3[(int)Class5449.field10189[5]] = class_2350.field_11034;
        class_2350Array3[(int)Class5449.field10189[6]] = class_2350.field_11035;
        class_2350Array3[(int)Class5449.field10189[3]] = class_2350.field_11036;
        field10188 = class_2350Array3;
    }

    private static void method21092() {
        Class5836.method22885();
    }

    private static double method21093(class_238 class_2383) {
        return Class5449.method21088(class_2383);
    }

    private static void method21094(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static List method21095(class_238 d2) {
        ArrayList<class_2338> e2 = new ArrayList<class_2338>();
        int c2 = (int)Math.floor(d2.field_1323);
        if ((double)c2 < Math.ceil(d2.field_1320)) {
            int b2 = (int)Math.floor(d2.field_1322);
            while ((double)b2 < Math.ceil(Class5449.method21108(d2))) {
                int a2 = (int)Math.floor(d2.field_1321);
                while ((double)a2 < Math.ceil(Class5449.method21107(d2))) {
                    e2.add(new class_2338(c2, b2, a2));
                    ++a2;
                }
                ++b2;
            }
            ++c2;
            Class4146.method20697();
            return null;
        }
        return e2;
    }

    public static class_243 method21096(class_243 a2, class_238 b2) {
        return Class5449.method21082(a2, b2.field_1323, b2.field_1322, Class5449.method21091(b2), b2.field_1320, b2.field_1325, Class5449.method21093(b2));
    }

    public static double method21097(class_238 class_2383) {
        return class_2383.field_1324;
    }

    private static void method21098() {
        Class4146.method20694();
    }

    private static void method21099(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method21100(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method21101() {
        Class6009.method23561();
    }

    private static void method21102() {
        Class6009.method23561();
    }

    public static class_243 method21103(class_238 a2) {
        return Class5449.method21096(Class4122.field9561.field_1724.method_33571(), a2);
    }

    private static void method21104() {
        Class1807.method15744();
    }

    public static boolean method21105(class_238 a2, class_2338 b2) {
        return Class5449.method21109(a2, b2).stream().anyMatch(Class5595::method21942);
    }

    /*
     * Unable to fully structure code
     */
    public static class_2350 method21106(class_2338 b, class_1309 c) {
        block6: {
            block4: {
                block5: {
                    if (!(Math.abs(c.method_23317() - ((double)b.method_10263() + 0.5)) < 2.0)) break block5;
                    v0 = 25775;
                    ** GOTO lbl9
                }
                v0 = 25776;
                if (true) ** GOTO lbl9
                do {
                    v0 = var2_2 = 25774;
lbl9:
                    // 3 sources

                    if (var2_2 == 25775) break block4;
                } while (var2_2 == 25776);
                break block6;
            }
            if (Math.abs(c.method_23321() - ((double)b.method_10260() + 0.5)) < 2.0) {
                a = c.method_23318() + (double)c.method_18381(c.method_18376());
                if (a - (double)b.method_10264() > 2.0) {
                    return class_2350.field_11036;
                }
                if ((double)b.method_10264() - a > 0.0) {
                    return class_2350.field_11033;
                }
            }
        }
        return c.method_5735().method_10153();
    }

    public static double method21107(class_238 class_2383) {
        return class_2383.field_1324;
    }

    public static double method21108(class_238 class_2383) {
        return class_2383.field_1325;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List method21109(class_238 c2, class_2338 d2) {
        ArrayList<class_2338> e2 = new ArrayList<class_2338>();
        int b2 = (int)Math.floor(c2.field_1323);
        block4: while (true) {
            int n2 = (double)b2 < Math.ceil(c2.field_1320) ? 31074 : 31075;
            block5: while (true) {
                switch (n2) {
                    case 31075: {
                        n2 = 31073;
                        continue block5;
                    }
                    case 31074: {
                        int a2 = (int)Math.floor(Class5449.method21084(c2));
                        while ((double)a2 < Math.ceil(c2.field_1324)) {
                            e2.add(new class_2338(b2, d2.method_10264(), a2));
                            ++a2;
                        }
                        ++b2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return e2;
    }

    private static void method21110() {
        Class1503.method14420();
    }

    private static void method21111() {
        Class1745.method15538();
    }

    private static int method21112(int n2, int n3, Class544 class544, Class446 class446) {
        return Class1345.method13759(n2, n3, class544, class446);
    }

    private static void method21113() {
        Class6009.method23560();
    }

    private static void method21114(float f2) {
        Class5836.method22907(f2);
    }

    private static void method21115() {
        Class1807.method15744();
    }

    public static double method21116(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static int method21117(int n2, int n3, Class47 class47, Class166 class166) {
        return Class1345.method13751(n2, n3, class47, class166);
    }

    private static void method21118(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method21119(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method21120() {
        Class5836.method22890();
    }

    private static void method21121() {
        Class5659.method22184();
    }

    private static void method21122() {
        Class1807.method15744();
    }

    private static void method21123(float f2) {
        Class5836.method22907(f2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

