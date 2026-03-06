/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1733
 *  net.minecraft.class_1735
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package mapped;

import java.util.HashMap;
import mapped.Class1;
import mapped.Class1503;
import mapped.Class153;
import mapped.Class1665;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1763;
import mapped.Class248;
import mapped.Class249;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class279;
import mapped.Class287;
import mapped.Class3221;
import mapped.Class3439;
import mapped.Class3442;
import mapped.Class363;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class454;
import mapped.Class543;
import mapped.Class5550;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6181;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6430;
import mapped.Class6454;
import mapped.Class925;
import mapped.Class926;
import mapped.Class942;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1733;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class344
extends Class278 {
    int[] field988;
    private static long[] field989 = new long[13];
    Class248 field990;
    private final Class925 field991 = new Class926();
    Class248 field992;
    Class248 field993 = this.method450(new Class253("KitMode", "Stealing items according to the kit", (boolean)field989[0]));
    Class248 field994;

    private static int method3776(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method3777() {
        Class6009.method23561();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method3778(Class63 r) {
        block19: {
            block20: {
                if (r.method128() != Class543.field2690) {
                    return;
                }
                if (!this.field991.method12595(Float.valueOf(((Float)this.field992.method507()).floatValue() * 1000.0f))) break block19;
                q = this.method3809(Class344.field290.field_1724.field_7512);
                if (!((Boolean)Class344.method3822(this).method507()).booleanValue()) break block20;
                l = new HashMap<Class942, Integer>();
                for (g = (int)Class344.field989[0]; g < q; ++g) {
                    block17: {
                        block21: {
                            f = Class344.field290.field_1724.field_7512.method_7611(g);
                            if (!f.method_7681()) continue;
                            e = Class454.method10551(f.method_7677());
                            if (e == null) continue;
                            if (l.containsKey(e)) break block21;
                            v0 = 5661;
                            ** GOTO lbl20
                        }
                        v0 = 5662;
                        if (true) ** GOTO lbl20
                        do {
                            v0 = var7_11 = 5660;
lbl20:
                            // 3 sources

                            if (var7_11 == 5661) break block17;
                        } while (var7_11 == 5662);
                        continue;
                    }
                    d = (int)Class344.field989[0];
                    for (Class942 a : Class454.field2383.values()) {
                        block18: {
                            block22: {
                                if (!a.equals(e)) break block22;
                                v1 = 18963;
                                ** GOTO lbl34
                            }
                            v1 = 18964;
                            if (true) ** GOTO lbl34
                            do {
                                v1 = var11_18 = 18962;
lbl34:
                                // 3 sources

                                if (var11_18 == 18963) break block18;
                            } while (var11_18 == 18964);
                            continue;
                        }
                        d += f.method_7677().method_7914();
                    }
                    c = (int)Class344.field989[0];
                    if (c < (int)Class344.field989[10]) {
                        b = Class344.method3780(Class344.field290).method_31548().method_5438(c);
                        if (b.method_7909() == f.method_7677().method_7909()) {
                            d -= b.method_7947();
                        }
                        ++c;
                        Class1745.method15538();
                        return;
                    }
                    l.put(e, d);
                }
                m = (int)Class344.field989[0];
                for (k = (int)Class344.field989[0]; k < q; ++k) {
                    if (m >= (Integer)Class344.method3823(this.field990)) {
                        return;
                    }
                    j = Class344.field290.field_1724.field_7512.method_7611(k);
                    if (!j.method_7681() || (i = Class454.method10551(j.method_7677())) == null || (h = l.getOrDefault(i, (int)Class344.field989[0]).intValue()) <= 0) continue;
                    h -= this.method3804(Class344.field290.field_1724.field_7512.field_7763, j, h, Class344.field290.field_1724.field_7512.method_7602().size(), j.method_7677());
                    l.put(i, h);
                }
                break block19;
            }
            p = (int)Class344.field989[0];
            o = (int)Class344.field989[0];
            while (true) {
                block23: {
                    if (o >= q) {
                        Class4036.method20085(0.173486f, 0.8605442f, 0.10136902f, 0.08303934f, 0.68455327f, 0.106717825f);
                        return;
                    }
                    if (p < (Integer)this.field990.method507()) break block23;
                    v2 = 16251;
                    ** GOTO lbl77
                }
                v2 = 16252;
                if (true) ** GOTO lbl77
                block10: while (true) {
                    v2 = 16250;
lbl77:
                    // 3 sources

                    switch (v2) {
                        case 16252: {
                            continue block10;
                        }
                        case 16251: {
                            return;
                        }
                    }
                    break;
                }
                n = Class344.field290.field_1724.field_7512.method_7611(o);
                if (n.method_7681() && this.method3786(n.method_7677().method_7909())) {
                    this.method3793(Class344.method3811((class_310)Class344.field290).field_7512.field_7763, n);
                    Class344.method3807(this).method12593();
                    ++p;
                }
                ++o;
            }
        }
    }

    private static int method3779(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    public static class_746 method3780(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3781(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method3782(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method3783() {
        Class3979.method19561();
    }

    private static void method3784() {
        Class1503.method14420();
    }

    private static void method3785() {
        Class1745.method15538();
    }

    private boolean method3786(class_1792 a2) {
        return ((Class249)Class344.method3825(this)).method522(a2);
    }

    private static void method3787() {
        Class6009.method23560();
    }

    private static void method3788() {
        Class3979.method19561();
    }

    public static class_746 method3789(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1713 method3790() {
        return class_1713.field_7794;
    }

    private static int method3791(int n2) {
        return Class287.method1495(n2);
    }

    private static int method3792() {
        return Class5659.method22101();
    }

    private void method3793(int a2, class_1735 b2) {
        Class344.field290.field_1761.method_2906(a2, b2.field_7874, (int)field989[0], Class344.method3790(), (class_1657)Class344.field290.field_1724);
    }

    private static int method3794(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3795(int n2, int n3, Class6181 class6181, Class3442 class3442) {
        return Class3439.method17323(n2, n3, class6181, class3442);
    }

    private static int method3796(int n2) {
        return Class4045.method20105(n2);
    }

    private static void method3797() {
        Class1745.method15538();
    }

    public static Class248 method3798(Class344 class344) {
        return class344.field994;
    }

    private static void method3799() {
        Class5836.method22897();
    }

    private static int method3800(int n2, int n3, Class1763 class1763, Class363 class363) {
        return Class3439.method17316(n2, n3, class1763, class363);
    }

    private static void method3801() {
        Class6454.method24594();
    }

    private static int method3802(int n2) {
        return Class4045.method20096(n2);
    }

    private static void method3803() {
        Class4146.method20697();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int method3804(int g2, class_1735 h2, int i2, int j2, class_1799 k2) {
        int m2;
        int l2 = k2.method_7914();
        int n2 = m2 = k2.method_7947();
        int o2 = (int)field989[12];
        int p2 = (int)field989[0];
        int f2 = (int)field989[0];
        int n3 = f2 < this.field988.length ? 2267 : 2268;
        block12: while (true) {
            switch (n3) {
                case 2268: {
                    n3 = 2266;
                    continue block12;
                }
                case 2267: {
                    int c2 = this.field988[f2];
                    int d2 = this.field988[f2 + (int)field989[1]];
                    if (c2 <= d2) return Class4045.method20093(497489068, 650311768);
                    return Class5550.method21885();
                }
            }
            break;
        }
        int n4 = p2 != 0 ? 29731 : 29732;
        block13: while (true) {
            switch (n4) {
                case 29732: {
                    n4 = 29730;
                    continue block13;
                }
                case 29731: {
                    Class344.field290.field_1761.method_2906(g2, h2.field_7874, (int)field989[0], class_1713.field_7794, (class_1657)Class344.field290.field_1724);
                    if (i2 >= l2) return m2;
                    if (l2 == (int)field989[1]) return m2;
                    int n5 = n2 > 0 ? 49972 : 49973;
                    block14: while (true) {
                        switch (n5) {
                            case 49973: {
                                n5 = 49971;
                                continue block14;
                            }
                            case 49972: {
                                if (m2 <= i2) return m2;
                                if (o2 == (int)field989[12]) {
                                    return m2;
                                }
                                Class344.field290.field_1761.method_2906(g2, j2 - (int)field989[11] + (o2 >= (int)field989[4] ? o2 - (int)field989[4] : o2 + (int)field989[7]), (int)field989[0], class_1713.field_7794, (class_1657)Class344.field290.field_1724);
                                return m2;
                            }
                        }
                        break;
                    }
                    return m2;
                }
            }
            break;
        }
        return (int)field989[0];
    }

    private static int method3805(int n2) {
        return Class4045.method20096(n2);
    }

    private static void method3806(long l2) {
        Class344.field989[7] = l2 ^ 0x4A6BB0EECC755B3DL;
        Class344.field989[9] = l2 ^ 0x4A6BB0EECC755B24L;
        Class344.field989[12] = l2 ^ 0xB5944F11338AA4D9L;
        Class344.field989[1] = l2 ^ 0x4A6BB0EECC755B27L;
        Class344.field989[0] = l2 ^ 0x4A6BB0EECC755B26L;
        Class344.field989[3] = l2 ^ 0x4A6BB0EECC755B2EL;
        Class344.field989[10] = l2 ^ 0x4A6BB0EECC755B0FL;
        Class344.field989[6] = l2 ^ 0x4A6BB0EECC755B05L;
        Class344.field989[2] = l2 ^ 0x4A6BB0EECC755B23L;
        Class344.field989[8] = l2 ^ 0x4A6BB0EECC755B25L;
        Class344.field989[5] = l2 ^ 0x4A6BB0EECC755B22L;
        Class344.field989[11] = l2 ^ 0x4A6BB0EECC755B02L;
        Class344.field989[4] = l2 ^ 0x4A6BB0EECC755B2FL;
    }

    public static Class925 method3807(Class344 class344) {
        return class344.field991;
    }

    private static int method3808(int n2, int n3, Class1665 class1665, Class153 class153) {
        return Class3439.method17341(n2, n3, class1665, class153);
    }

    private int method3809(class_1703 b2) {
        if (b2 instanceof class_1707) {
            class_1707 a2 = (class_1707)b2;
            return a2.method_7629().method_5439();
        }
        if (!(b2 instanceof class_1733)) {
            return Class5659.method22205(0.32406723f, 0.66159004f);
        }
        return (int)field989[7];
    }

    private static void method3810(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method3811(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3812() {
        Class5836.method22885();
    }

    private static int method3813(int n2) {
        return Class4045.method20105(n2);
    }

    static {
        Class344.method3806(5362574320993655590L);
    }

    private static int method3814(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public Class344() {
        super("ChestStealer", "Steals items from chests", Class556.field2756);
        class_1792[] class_1792Array = new class_1792[(int)field989[1]];
        class_1792Array[(int)Class344.field989[0]] = class_1802.field_8545;
        this.field994 = this.method450(new Class249("Items", "Items to steal", class_1792Array));
        this.field992 = this.method450(new Class252("Delay", "The item steal delay", Float.valueOf(0.0f), Float.valueOf(Class6430.field13351), Float.valueOf(2.0f)));
        this.field990 = this.method450(new Class252("Shift", "The item steal shift", (int)field989[1], (int)field989[2], (int)field989[7]));
        int[] nArray = new int[(int)field989[5]];
        nArray[(int)Class344.field989[0]] = (int)field989[3];
        nArray[(int)Class344.field989[1]] = (int)field989[0];
        nArray[(int)Class344.field989[9]] = (int)field989[6];
        nArray[(int)Class344.field989[8]] = (int)field989[4];
        this.field988 = nArray;
    }

    private static int method3815(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static int method3816() {
        return Class6454.method24637();
    }

    private static void method3817(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3818(float f2) {
        Class5836.method22907(f2);
    }

    private static int method3819(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method3820(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method3821(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method3822(Class344 class344) {
        return class344.field993;
    }

    private static Object method3823(Class248 class248) {
        return class248.method507();
    }

    private static void method3824() {
        Class1745.method15538();
    }

    private static Class248 method3825(Class344 class344) {
        return Class344.method3798(class344);
    }

    private static void method3826() {
        Class6009.method23561();
    }

    private static int method3827(int n2, int n3, Class279 class279, Class3221 class3221) {
        return Class3439.method17318(n2, n3, class279, class3221);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

