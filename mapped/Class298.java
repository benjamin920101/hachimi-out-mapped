/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1477
 *  net.minecraft.class_1493
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3887
 *  net.minecraft.class_4050
 *  net.minecraft.class_4587
 *  net.minecraft.class_583
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_8080
 *  net.minecraft.class_922
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class133;
import mapped.Class1467;
import mapped.Class1503;
import mapped.Class156;
import mapped.Class1567;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class20;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class310;
import mapped.Class3272;
import mapped.Class3310;
import mapped.Class3582;
import mapped.Class365;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class402;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class5548;
import mapped.Class556;
import mapped.Class56;
import mapped.Class5659;
import mapped.Class58;
import mapped.Class5820;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class5902;
import mapped.Class60;
import mapped.Class6001;
import mapped.Class6009;
import mapped.Class625;
import mapped.Class628;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class80;
import mapped.Class803;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1477;
import net.minecraft.class_1493;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3887;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_583;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_8080;
import net.minecraft.class_922;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class298
extends Class278 {
    private static Class298 INSTANCE;
    Class248 field559;
    Class248 field560;
    Class248 field561;
    Class248 field562;
    Class248 field563;
    private final Map field564 = new ConcurrentHashMap();
    Class248 field565;
    private static long[] field566;
    Class248 field567;
    Class248 field568;
    Class248 field569;
    Class248 field570;
    Class248 field571;
    Class248 field572;
    Class248 field573;
    Class248 field574;
    Class248 field575;
    Class248 field576;
    Class248 field577;

    public static Class625 method1883() {
        return Class625.field3052;
    }

    private static boolean method1884(class_1297 class_12972) {
        return Class1158.method13121(class_12972);
    }

    private static void method1885() {
        Class298.method1924();
    }

    public static Class248 method1886(Class298 class298) {
        return class298.field573;
    }

    private static void method1887() {
        Class5836.method22897();
    }

    private static void method1888(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Class365 method1889() {
        return Class365.method4718();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=0x7FFFFFFF)
    public void method1890(Class59 l2) {
        if (((Boolean)this.field570.method507()).booleanValue()) {
            Class298.method1924();
        } else {
            Class6009.method23560();
        }
        RenderSystem.disableDepthTest();
        for (Map.Entry e2 : new HashSet(this.field564.entrySet())) {
            ((Class6283)e2.getValue()).method24284((boolean)field566[3]);
            int a2 = (int)((double)((Color)this.field561.method507()).getAlpha() * ((Class6283)e2.getValue()).method24281());
            int b2 = (int)((double)((Color)this.field563.method507()).getAlpha() * ((Class6283)e2.getValue()).method24281());
            int c2 = Class4045.method20093(((Color)this.field561.method507()).getRGB(), a2);
            int d2 = Class298.method1912(((Color)this.field563.method507()).getRGB(), b2);
            Class1567.method14628(l2.method125(), (class_742)e2.getKey(), ((Class1467)((Object)e2.getKey())).method14388(), Class298.method1998(l2), c2, d2, ((Float)Class298.method2000(Class298.method1956(this))).floatValue(), (this.field562.method507() != Class625.field3054 ? (int)field566[4] : (int)field566[3]) != 0, (boolean)field566[4], (boolean)field566[3]);
        }
        this.field564.entrySet().removeIf(Class298::method2002);
        Class6009.method23561();
        if (Class298.method1960(this.field562) == Class625.field3052) {
            return;
        }
        if (Class402.method6202().method1265() && !((Boolean)Class402.method6202().field1424.method507()).booleanValue()) {
            return;
        }
        if (((Boolean)this.field570.method507()).booleanValue()) {
            Class298.method1924();
        } else {
            Class6009.method23560();
        }
        if (!((Boolean)this.field573.method507()).booleanValue()) {
            RenderSystem.enableDepthTest();
        }
        Iterator iterator = Class298.field290.field_1687.method_18112().iterator();
        while (true) {
            class_1297 k2;
            block21: {
                if (!iterator.hasNext()) {
                    Class298.method2003();
                    if ((Boolean)this.field573.method507() != false) return;
                    RenderSystem.depthMask((boolean)field566[4]);
                    return;
                }
                k2 = (class_1297)iterator.next();
                if (Class310.method2481().method1265() && Class310.method2481().method2445(k2)) {
                    Class1108.method12918(true);
                    return;
                }
                double g2 = Math.abs(Class298.field290.field_1773.method_19418().method_19326().field_1352 - k2.method_23317());
                double h2 = Math.abs(Class298.field290.field_1773.method_19418().method_19326().field_1350 - k2.method_23321());
                double i2 = ((Integer)Class298.field290.field_1690.method_42503().method_41753() + (int)field566[4]) * (int)field566[8];
                class_243 j2 = Class365.method4718().method1265() ? Class298.method1982(Class298.method1943()) : Class298.method1958(field290).method_19538();
                if (j2.method_1025(k2.method_19538()) > Class298.method1929((Class252)this.field559) || g2 > i2 || h2 > i2 || !Class298.method1964(k2.method_5829())) continue;
                int n2 = k2 instanceof class_1309 ? 3952 : 3953;
                while (true) {
                    int n3;
                    if ((n3 = n2) == 3952) {
                        class_1309 f2 = (class_1309)k2;
                        if (!this.method1944(f2)) {
                            break;
                        }
                        break block21;
                    }
                    if (n3 != 3953) break;
                    n2 = 3951;
                }
                if (!(k2 instanceof class_1511) || !((Boolean)Class298.method1983(this).method507()).booleanValue()) continue;
            }
            if (((Boolean)Class298.method2007(this.field573)).booleanValue()) {
                while (true) {
                    // Infinite loop
                }
            }
            int n4 = 41473;
            block8: while (true) {
                switch (n4) {
                    case 41474: {
                        n4 = 41472;
                        continue block8;
                    }
                    case 41473: {
                        RenderSystem.depthMask((boolean)field566[3]);
                        break block8;
                    }
                }
                break;
            }
            this.method1999(l2.method125(), k2, l2.method124());
        }
    }

    public static class_1309 method1891(Class56 class56) {
        return class56.field76;
    }

    public static Class248 method1892(Class298 class298) {
        return class298.field570;
    }

    private Boolean method1893() {
        return (((Boolean)Class298.method1886(this).method507()).booleanValue() && Class298.method1984(Class298.method1957(this)) != Class625.field3052 ? (int)field566[4] : (int)field566[3]) != 0;
    }

    private static void method1894() {
        Class6454.method24594();
    }

    private static void method1895() {
        Class5836.method22890();
    }

    public static class_1309 method1896(Class56 class56) {
        return class56.field76;
    }

    private static void method1897(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1898() {
        Class1745.method15538();
    }

    private static void method1899(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1900(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static float method1901() {
        return Class6322.method24328();
    }

    private static void method1902() {
        Class4146.method20694();
    }

    @Class1
    public void method1903(Class156 a2) {
        if (Class298.method1923(this).method507() == Class298.method1927() && Class298.method1942(this, a2.method310())) {
            a2.method10();
        }
    }

    private static boolean method1904(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method1905() {
        Class4146.method20694();
    }

    private static float method1906(Class56 class56) {
        return Class298.method1947(class56);
    }

    private static void method1907(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method1908(Class298 class298, class_1309 class_13092) {
        return class298.method1944(class_13092);
    }

    private static void method1909() {
        Class6009.method23561();
    }

    private static void method1910() {
        Class1503.method14420();
    }

    public boolean method1911() {
        if (this.field562.method507() != Class625.field3052) {
            return Class5836.method22894();
        }
        return (int)field566[4] != 0;
    }

    private static int method1912(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static Class298 method1913() {
        return INSTANCE;
    }

    public static class_1309 method1914(Class56 class56) {
        return class56.field76;
    }

    public static Class625 method1915() {
        return Class625.field3052;
    }

    private static Object method1916(Class248 class248) {
        return class248.method507();
    }

    static {
        field566 = new long[11];
        Class298.method2001(-6388171171131631102L);
    }

    private static boolean method1917() {
        return Class1807.method15769();
    }

    private static float method1918(float f2, float f3, float f4) {
        return Class803.method12252(f2, f3, f4);
    }

    private static void method1919() {
        Class5836.method22890();
    }

    private static void method1920(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1921(Class298 class298, class_4587 class_45872, class_1297 class_12972, float f2, int n2, int n3) {
        class298.method1990(class_45872, class_12972, f2, n2, n3);
    }

    private static void method1922() {
        Class6009.method23561();
    }

    public static Class248 method1923(Class298 class298) {
        return class298.field562;
    }

    public static void method1924() {
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((int)((int)field566[7]), (int)((int)field566[6]));
        RenderSystem.disableDepthTest();
        Class6009.method23559((boolean)field566[4]);
    }

    public static class_1309 method1925(Class56 class56) {
        return class56.field76;
    }

    public static Class248 method1926(Class298 class298) {
        return class298.field571;
    }

    private static Class625 method1927() {
        return Class298.method1883();
    }

    private static void method1928() {
        Class6009.method23560();
    }

    private static double method1929(Class252 class252) {
        return class252.method564();
    }

    private static class_1309 method1930(Class56 class56) {
        return Class298.method1925(class56);
    }

    private static Object method1931(Class248 class248) {
        return class248.method507();
    }

    @Override
    public void method1279() {
        this.field564.clear();
    }

    private static class_8080 method1932(class_1309 class_13092) {
        return Class298.method1988(class_13092);
    }

    private static void method1933(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1934() {
        Class5836.method22885();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1935(Class60 c2) {
        if (Class298.method1978(this.field562) != Class625.field3052) {
            int n2 = 3186;
            Class6009.method23561();
            return;
        }
        int n3 = 3185;
        block4: while (true) {
            switch (n3) {
                case 3186: {
                    n3 = 3184;
                    continue block4;
                }
                case 3185: {
                    return;
                }
            }
            break;
        }
        if (Class402.method6202().method1265() && !((Boolean)Class402.method6202().field1424.method507()).booleanValue()) {
            return;
        }
        if (((Boolean)Class298.method1916(Class298.method1892(this))).booleanValue()) {
            Class298.method1924();
            Class6009.method23559(false);
            return;
        }
        Class6009.method23560();
        if (((Boolean)Class298.method1969(this).method507()).booleanValue()) {
            int a2 = ((Color)Class298.method1996(this.field571)).getRGB();
            int b2 = Class4045.method20093(a2, (int)field566[9]);
            Class1567.method14605(c2.method125(), c2.method124(), b2, a2, ((Float)Class298.method1931(this.field567)).floatValue(), (this.field562.method507() == Class298.method1971() ? (int)field566[3] : (int)field566[4]) != 0, (this.field562.method507() != Class625.field3057 ? (int)field566[4] : (int)field566[3]) != 0, (boolean)field566[3]);
        }
        Class6009.method23561();
    }

    private static void method1936() {
        Class5659.method22184();
    }

    public static Class248 method1937(Class298 class298) {
        return class298.field562;
    }

    private static void method1938() {
        Class5836.method22890();
    }

    public static class_746 method1939(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method1940(class_1297 class_12972) {
        return Class1158.method13133(class_12972);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1941(Class20 a2) {
        if (this.field562.method507() == Class625.field3052) {
            return;
        }
        int n2 = (Boolean)this.field577.method507() != false ? 63774 : 63775;
        block4: while (true) {
            switch (n2) {
                case 63775: {
                    n2 = 63773;
                    continue block4;
                }
                case 63774: {
                    if ((Boolean)Class298.method1987(this.field572) != false) return;
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static boolean method1942(Class298 class298, class_1309 class_13092) {
        return class298.method1944(class_13092);
    }

    private Boolean method1269() {
        if (Class298.method1948(this.field562) == Class625.field3054) {
            Class1668.method15147(842444756, 1319315403, 510012282, -1588222339);
            return null;
        }
        return (boolean)field566[4];
    }

    private static Class365 method1943() {
        return Class365.method4718();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method1944(class_1309 a2) {
        int n2;
        if (a2 instanceof class_1657) {
            int n3;
            if (a2 != Class298.method1939(field290)) return (Boolean)Class298.method1962(this).method507();
            if (((Boolean)this.field576.method507()).booleanValue() && (!Class298.field290.field_1690.method_31044().method_31034() || Class298.method1889().method1265())) {
                n3 = (int)field566[4];
                return n3 != 0;
            }
            n3 = (int)field566[3];
            return n3 != 0;
        }
        if (Class298.method1940((class_1297)a2) && ((Boolean)this.field565.method507()).booleanValue() || (Class298.method1884((class_1297)a2) || Class1158.method13110((class_1297)a2)) && ((Boolean)this.field569.method507()).booleanValue()) {
            n2 = (int)field566[4];
            return n2 != 0;
        }
        n2 = (int)field566[3];
        return n2 != 0;
    }

    private static class_1309 method1945(Class56 class56) {
        return Class298.method1976(class56);
    }

    private static void method1946() {
        Class3979.method19561();
    }

    public static float method1947(Class56 class56) {
        return class56.field78;
    }

    private static Object method1948(Class248 class248) {
        return class248.method507();
    }

    public Class625 method1949() {
        return (Class625)((Object)this.field562.method507());
    }

    private static void method1950() {
        Class298.method1924();
    }

    public static class_4587 method1951(Class56 class56) {
        return class56.field77;
    }

    private static void method1952() {
        Class4146.method20694();
    }

    public static Class625 method1953() {
        return Class625.field3054;
    }

    private float method1954(class_1309 b2, float c2) {
        if (b2 instanceof class_1477) {
            return class_3532.method_16439((float)c2, (float)((class_1477)b2).field_6900, (float)((class_1477)b2).field_6904);
        }
        if (b2 instanceof class_1493) {
            class_1493 a2 = (class_1493)b2;
            float f2 = a2.method_6714();
            return Class298.method1901();
        }
        return (float)b2.field_6012 + c2;
    }

    private static void method1955() {
        Class6454.method24594();
    }

    public static Class248 method1956(Class298 class298) {
        return class298.field567;
    }

    public static Class248 method1957(Class298 class298) {
        return class298.field562;
    }

    public static class_746 method1958(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method1959(int n2, int n3, Class628 class628, Class376 class376) {
        return Class5548.method21824(n2, n3, class628, class376);
    }

    private static Object method1960(Class248 class248) {
        return class248.method507();
    }

    public static class_1309 method1961(Class56 class56) {
        return class56.field76;
    }

    public static Class248 method1962(Class298 class298) {
        return class298.field574;
    }

    private static void method1963() {
        Class6009.method23560();
    }

    private static boolean method1964(class_238 class_2383) {
        return Class6454.method24660(class_2383);
    }

    private static void method1965() {
        Class6454.method24594();
    }

    private static void method1966() {
        Class1503.method14420();
    }

    private static void method1967(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method1968(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1969(Class298 class298) {
        return class298.field577;
    }

    private static void method1970(float f2) {
        Class5836.method22907(f2);
    }

    private static Class625 method1971() {
        return Class298.method1953();
    }

    private static void method1972() {
        Class6454.method24594();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1973(Class56 f) {
        block24: {
            block26: {
                block17: {
                    block25: {
                        block21: {
                            block23: {
                                block16: {
                                    block22: {
                                        block20: {
                                            block18: {
                                                block19: {
                                                    if (this.field562.method507() == Class625.field3052) {
                                                        return;
                                                    }
                                                    if (Class298.field290.field_1724 == null) break block18;
                                                    if (!((Boolean)this.field572.method507()).booleanValue()) break block19;
                                                    if (((Boolean)this.field573.method507()).booleanValue()) break block18;
                                                }
                                                if (Class298.method1908(this, f.field76) && !(Class298.field290.field_1724.method_5858((class_1297)Class298.method1961(f)) > ((Class252)this.field559).method564())) break block20;
                                            }
                                            return;
                                        }
                                        f.method10();
                                        f.field77.method_22903();
                                        f.field75.field_3447 = f.field76.method_6055(f.field78);
                                        f.field75.field_3449 = Class298.method1930(f).method_5765();
                                        Class298.method1992((Class56)f).field_3448 = f.field76.method_6109();
                                        h = class_3532.method_17821((float)f.field78, (float)f.field76.field_6220, (float)f.field76.field_6283);
                                        i = class_3532.method_17821((float)Class298.method1991(f), (float)f.field76.field_6259, (float)Class298.method1896((Class56)f).field_6241);
                                        j = i - h;
                                        if (!f.field76.method_5765() || !((var5_5 = f.field76.method_5854()) instanceof class_1309)) break block21;
                                        b = (class_1309)var5_5;
                                        h = class_3532.method_17821((float)Class298.method1906(f), (float)b.field_6220, (float)b.field_6283);
                                        j = i - h;
                                        a = class_3532.method_15393((float)j);
                                        if (!(a < -85.0f)) break block22;
                                        v0 = 22277;
                                        ** GOTO lbl32
                                    }
                                    v0 = 22278;
                                    if (true) ** GOTO lbl32
                                    do {
                                        v0 = var7_10 = 22276;
lbl32:
                                        // 3 sources

                                        if (var7_10 == 22277) break block16;
                                    } while (var7_10 == 22278);
                                    break block23;
                                }
                                a = -85.0f;
                            }
                            if (a >= 85.0f) {
                                a = Class3582.field7970;
                            }
                            h = i - a;
                            if (a * a > Class5820.field11352) {
                                h += a * 0.2f;
                            }
                            j = i - h;
                        }
                        k = class_3532.method_16439((float)f.field78, (float)f.field76.field_6004, (float)Class298.method1945(f).method_36455());
                        if (class_922.method_38563((class_1309)f.field76)) {
                            k *= -1.0f;
                            j *= -1.0f;
                        }
                        if (Class298.method1914(f).method_41328(class_4050.field_18078)) {
                            d = f.field76.method_18401();
                            if (d != null) {
                                c = f.field76.method_18381(class_4050.field_18076) - 0.1f;
                                f.field77.method_46416((float)(~(d.method_10148() - 1)) * c, 0.0f, (float)(-d.method_10165()) * c);
                            }
                        }
                        l = this.method1954(f.field76, f.field78);
                        if (f.field76 instanceof class_1657) {
                            Class1567.method14579((class_742)Class298.method1891(f), f.field77, l, h, f.field78);
                        } else {
                            Class1567.method14747(f.field76, Class298.method1951(f), l, h, f.field78);
                        }
                        f.field77.method_22905(-1.0f, Class3310.field7126, 1.0f);
                        f.field77.method_22905(0.9375f, Class6001.field11970, 0.9375f);
                        f.field77.method_46416(0.0f, -1.501f, 0.0f);
                        g = 0.0f;
                        m = 0.0f;
                        if (f.field76.method_5765()) break block24;
                        if (!f.field76.method_5805()) break block24;
                        g = f.field76.field_42108.method_48570(f.field78);
                        m = Class298.method1932(f.field76).method_48572(f.field78);
                        if (!f.field76.method_6109()) break block25;
                        v1 = 32864;
                        ** GOTO lbl76
                    }
                    v1 = 32865;
                    if (true) ** GOTO lbl76
                    do {
                        v1 = var11_14 = 32863;
lbl76:
                        // 3 sources

                        if (var11_14 == 32864) break block17;
                    } while (var11_14 == 32865);
                    break block26;
                }
                m *= 3.0f;
            }
            if (g > 1.0f) {
                g = 1.0f;
            }
        }
        f.field75.method_2816((class_1297)f.field76, m, g, f.field78);
        f.field75.method_2819((class_1297)f.field76, m, g, l, j, k);
        if (!f.field76.method_7325()) {
            for (E e : f.field81) {
                ((class_3887)e).method_4199(f.field77, f.field82, f.field73, (class_1297)Class298.method1977(f), m, g, f.field78, l, j, k);
            }
        }
        f.field77.method_22909();
    }

    private static boolean method1974() {
        return Class1807.method15753();
    }

    private static Class625 method1975() {
        return Class298.method2005();
    }

    public static class_1309 method1976(Class56 class56) {
        return class56.field76;
    }

    public static class_1309 method1977(Class56 class56) {
        return class56.field76;
    }

    private static Object method1978(Class248 class248) {
        return class248.method507();
    }

    private static void method1979(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1980() {
        Class1807.method15744();
    }

    private static boolean method1981(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static class_243 method1982(Class365 class365) {
        return class365.method4722();
    }

    public static Class248 method1983(Class298 class298) {
        return class298.field568;
    }

    private static Object method1984(Class248 class248) {
        return class248.method507();
    }

    private static void method1985(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1986(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method1987(Class248 class248) {
        return class248.method507();
    }

    public static class_8080 method1988(class_1309 class_13092) {
        return class_13092.field_42108;
    }

    private static int method1989(int n2, int n3, Class3272 class3272, Class58 class58) {
        return Class5548.method21835(n2, n3, class3272, class58);
    }

    public void method1990(class_4587 a2, class_1297 b2, float c2, int d2, int e2) {
        Class1567.method14659(a2, b2, c2, d2, e2, ((Float)this.field567.method507()).floatValue(), (this.field562.method507() != Class625.field3054 ? (int)field566[4] : (int)field566[3]) != 0, (this.field562.method507() != Class625.field3057 ? (int)field566[4] : (int)field566[3]) != 0, (boolean)field566[3]);
    }

    public static float method1991(Class56 class56) {
        return class56.field78;
    }

    private Boolean method1278() {
        return (Class298.method1937(this).method507() != Class298.method1975() ? (int)field566[4] : (int)field566[3]) != 0;
    }

    public static class_583 method1992(Class56 class56) {
        return class56.field75;
    }

    private static void method1993() {
        Class1503.method14420();
    }

    private static double method1994(Class6283 class6283) {
        return class6283.method24281();
    }

    @Class1
    public void method1995(Class80 a2) {
        if (this.field562.method507() == Class298.method1915()) {
            return;
        }
        if (!(Class298.field290.field_1724 == null || ((Boolean)this.field572.method507()).booleanValue() && ((Boolean)Class298.method1968(this.field573)).booleanValue())) {
            if (((Boolean)this.field568.method507()).booleanValue() && Class298.field290.field_1724.method_5858((class_1297)a2.field115) <= ((Class252)this.field559).method564()) {
                a2.method10();
            }
        }
    }

    private static Object method1996(Class248 class248) {
        return class248.method507();
    }

    public Class298() {
        super("Chams", "Renders entity models through walls", Class556.field2759);
        this.field559 = this.method450(new Class252("Range", "The chams render range", Float.valueOf(Class5902.field11678), Float.valueOf(50.0f), Float.valueOf(200.0f)));
        this.field562 = this.method450(new Class260("Mode", "The rendering mode for the chams", Class625.field3054, Class625.values()));
        this.field567 = this.method450(new Class252("Width", "The line width of the render", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.5f), (Number)Float.valueOf(5.0f), this::method1269));
        this.field573 = this.method450(new Class253("ThroughWalls", "Renders chams through walls", (boolean)field566[4], this::method1278));
        this.field572 = this.method450(new Class253("Texture", "Renders the entity model texture", (boolean)field566[3], this::method1893));
        this.field574 = this.method450(new Class253("Players", "Render chams on other players", (boolean)field566[4]));
        this.field576 = this.method450(new Class253("Self", "Render chams on the player", (boolean)field566[4]));
        this.field577 = this.method450(new Class253("Hands", "Render chams on first-person hands", (boolean)field566[4]));
        this.field565 = this.method450(new Class253("Monsters", "Render chams on monsters", (boolean)field566[4]));
        this.field569 = this.method450(new Class253("Animals", "Render chams on animals", (boolean)field566[4]));
        this.field568 = this.method450(new Class253("Crystals", "Render chams on crystals", (boolean)field566[4]));
        this.field575 = this.method450(new Class253("Pops", "Render chams on totem pops", (boolean)field566[3]));
        this.field570 = this.method450(new Class253("Shine", "Adds a shine effect to the chams", (boolean)field566[3]));
        this.field560 = this.method450(new Class252("Fade-Time", "Timer for the fade", (int)field566[3], (int)field566[2], (int)field566[0]));
        this.field571 = this.method450(new Class251("Color", "The color of the chams", new Color((int)field566[1], (int)field566[3], (int)field566[3], (int)field566[5])));
        this.field561 = this.method450(new Class251("SideColor", "The color of the chams", new Color((int)field566[1], (int)field566[3], (int)field566[3], (int)field566[5])));
        this.field563 = this.method450(new Class251("LineColor", "The color of the chams", new Color((int)field566[1], (int)field566[3], (int)field566[3], (int)field566[1])));
        INSTANCE = this;
    }

    private static void method1997(float f2) {
        Class5836.method22907(f2);
    }

    private static float method1998(Class59 class59) {
        return class59.method124();
    }

    public void method1999(class_4587 a2, class_1297 b2, float c2) {
        int d2 = ((Color)Class298.method1926(this).method507()).getRGB();
        int e2 = Class4045.method20093(d2, (int)field566[9]);
        Class298.method1921(this, a2, b2, c2, d2, e2);
    }

    private static Object method2000(Class248 class248) {
        return class248.method507();
    }

    private static void method2001(long l2) {
        Class298.field566[8] = l2 ^ 0xA758A82A744EDA12L;
        Class298.field566[9] = l2 ^ 0xA758A82A744EDA93L;
        Class298.field566[0] = l2 ^ 0xA758A82A744ED1BAL;
        Class298.field566[5] = l2 ^ 0xA758A82A744EDA3EL;
        Class298.field566[6] = l2 ^ 0xA758A82A744E5A06L;
        Class298.field566[3] = l2 ^ 0xA758A82A744EDA02L;
        Class298.field566[7] = l2 ^ 0xA758A82A744ED900L;
        Class298.field566[4] = l2 ^ 0xA758A82A744EDA03L;
        Class298.field566[10] = l2 ^ 0xA758A82A744EDA21L;
        Class298.field566[1] = l2 ^ 0xA758A82A744EDAFDL;
        Class298.field566[2] = l2 ^ 0xA758A82A744ED9EAL;
    }

    private static boolean method2002(Map.Entry a2) {
        return (Class298.method1994((Class6283)a2.getValue()) == 0.0 ? (int)field566[4] : (int)field566[3]) != 0;
    }

    private static void method2003() {
        Class6009.method23561();
    }

    /*
     * WARNING - void declaration
     */
    @Class1
    public void method2004(Class133 f2) {
        class_2663 e2;
        if (Class298.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = f2.method251();
        if (class_25962 instanceof class_2663 && (e2 = (class_2663)class_25962).method_11470() == (int)field566[10] && ((Boolean)this.field575.method507()).booleanValue()) {
            void c2;
            class_1297 b2 = e2.method_11469((class_1937)Class298.field290.field_1687);
            if (b2 == Class298.field290.field_1724 || !(b2 instanceof class_1657)) {
                return;
            }
            class_1657 a2 = (class_1657)b2;
            Class6283 d2 = new Class6283((boolean)field566[4], ((Integer)this.field560.method507()).intValue());
            this.field564.put(new Class1467((class_1657)c2, field290.method_60646().method_60637((boolean)field566[4])), d2);
        }
    }

    public static Class625 method2005() {
        return Class625.field3052;
    }

    private static void method2006(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method2007(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

