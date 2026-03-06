/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_6880
 *  net.minecraft.class_742
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1009;
import mapped.Class1251;
import mapped.Class1668;
import mapped.Class233;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class274;
import mapped.Class278;
import mapped.Class323;
import mapped.Class3535;
import mapped.Class3979;
import mapped.Class458;
import mapped.Class556;
import mapped.Class5643;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6259;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.class_124;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_6880;
import net.minecraft.class_742;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class325
extends Class278 {
    private final Class248 field772;
    Class248 field773;
    private static Class325 INSTANCE;
    Class248 field774;
    Class248 field775;
    public final Class248 field776 = this.method450(new Class253("Red", "", (boolean)field781[1]));
    private final Class248 field777;
    private final Class248 field778 = this.method450(new Class253("Self", "", (boolean)field781[1]));
    private final Class248 field779;
    Class248 field780;
    private static long[] field781;
    private final Class248 field782 = this.method450(new Class253("Health", "", (boolean)field781[3]));

    public static class_124 method2791(class_1657 a2) {
        double b2 = a2.method_6032() + a2.method_6067();
        if (b2 > 18.0) {
            return class_124.field_1060;
        }
        if (b2 > 16.0) {
            return class_124.field_1077;
        }
        if (b2 > 12.0) {
            return class_124.field_1054;
        }
        if (b2 > 8.0) {
            return class_124.field_1065;
        }
        if (b2 > 4.0) {
            return class_124.field_1061;
        }
        return class_124.field_1079;
    }

    private static void method2792(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2793() {
        Class6454.method24594();
    }

    private static int method2794(int n2, int n3, Class323 class323, Class274 class274) {
        return Class3535.method17775(n2, n3, class323, class274);
    }

    private static int method2795(int n2, int n3, Class5643 class5643, Class1251 class1251) {
        return Class3535.method17783(n2, n3, class5643, class1251);
    }

    public static class_124 method2796() {
        return class_124.field_1078;
    }

    private static void method2797() {
        Class3979.method19561();
    }

    private static void method2798(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static double method2799(class_742 a2) {
        return Class325.field290.field_1724.method_5739((class_1297)a2);
    }

    private static void method2800(long l2) {
        Class325.field781[3] = l2 ^ 0x4FF207AFCD6F328EL;
        Class325.field781[1] = l2 ^ 0x4FF207AFCD6F328FL;
        Class325.field781[2] = l2 ^ 0x4FF207AFCD6F3167L;
        Class325.field781[8] = l2 ^ 0x4FF207AFCD6F328DL;
        Class325.field781[10] = l2 ^ 0x4FF207AFCD6F3285L;
        Class325.field781[0] = l2 ^ 0x4FF207AFCD6F3753L;
        Class325.field781[6] = l2 ^ 0x4FF207AFCD6F329BL;
        Class325.field781[5] = l2 ^ 0x4FF207AFCD6F32EBL;
        Class325.field781[7] = l2 ^ 0x4FF207AFCD6F3287L;
        Class325.field781[11] = l2 ^ 0x4FF207AFCD6F328BL;
        Class325.field781[9] = l2 ^ 0x4FF207AFCD6F3289L;
        Class325.field781[4] = l2 ^ 0x4FF207AFCD90CD70L;
    }

    private static void method2801() {
        Class6009.method23560();
    }

    public static class_124 method2802() {
        return class_124.field_1068;
    }

    private static Color method2803(Class458 class458) {
        return class458.method10630();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2804(Class233 g2) {
        int h2 = (Integer)this.field780.method507();
        int i2 = Class6454.method24637();
        ArrayList<class_742> j2 = new ArrayList<class_742>(Class325.field290.field_1687.method_18456());
        j2.sort(Comparator.comparingDouble(Class325::method2799));
        Iterator iterator = j2.iterator();
        while (iterator.hasNext()) {
            boolean d2;
            int a2;
            class_1657 class_16572 = (class_1657)iterator.next();
            if (((Boolean)this.field774.method507()).booleanValue() && Class5659.method22180((class_1309)class_16572)) continue;
            if (class_16572 == Class325.field290.field_1724 && !((Boolean)Class325.method2805(this.field778)).booleanValue()) {
                Class6454.method24636(0.5989633181437402, 0.3140710029600885, 0.9898780930631589, Class1009.field4180);
                return;
            }
            StringBuilder b2 = new StringBuilder();
            String c2 = " ";
            if (((Boolean)Class325.method2815(this).method507()).booleanValue()) {
                b2.append(Class325.method2791(class_16572));
                b2.append(field395.format(class_16572.method_6032() + class_16572.method_6067()));
                b2.append(c2);
            }
            b2.append(class_124.field_1070);
            b2.append(class_16572.method_5477().getString());
            int n2 = (Boolean)this.field779.method507() != false ? 54012 : 54013;
            block5: while (true) {
                switch (n2) {
                    case 54013: {
                        n2 = 54011;
                        continue block5;
                    }
                    case 54012: {
                        b2.append(c2);
                        b2.append(Class325.method2802());
                        b2.append(field395.format(Class325.field290.field_1724.method_5739((class_1297)class_16572)));
                        b2.append("m");
                        break block5;
                    }
                }
                break;
            }
            if (((Boolean)Class325.method2813(this).method507()).booleanValue()) {
                if (class_16572.method_6059(class_1294.field_5909)) {
                    b2.append(c2);
                    b2.append(class_124.field_1080);
                    b2.append("Lv.");
                    b2.append(class_16572.method_6112(class_1294.field_5909).method_5578() + (int)field781[3]);
                    b2.append(c2);
                    b2.append(class_16572.method_6112(class_1294.field_5909).method_5584() / (int)field781[6] + (int)field781[3]);
                    b2.append("s");
                }
                if (class_16572.method_6059(class_1294.field_5904)) {
                    Class5836.method22897();
                    return;
                }
                if (class_16572.method_6059(class_1294.field_5910)) {
                    b2.append(c2);
                    b2.append(Class325.method2808());
                    b2.append("Lv.");
                    b2.append(class_16572.method_6112(Class325.method2811()).method_5578() + (int)field781[3]);
                    b2.append(c2);
                    b2.append(class_16572.method_6112(class_1294.field_5910).method_5584() / (int)field781[6] + (int)field781[3]);
                    b2.append("s");
                }
                if (class_16572.method_6059(class_1294.field_5907)) {
                    b2.append(c2);
                    b2.append(Class325.method2796());
                    b2.append("Lv.");
                    b2.append(class_16572.method_6112(class_1294.field_5907).method_5578() + (int)field781[3]);
                    b2.append(c2);
                    b2.append(class_16572.method_6112(class_1294.field_5907).method_5584() / (int)field781[6] + (int)field781[3]);
                    b2.append("s");
                }
            }
            if (((Boolean)this.field772.method507()).booleanValue() && (a2 = Class5723.field11040.method11905((class_1297)class_16572)) > 0) {
                b2.append(c2);
                b2.append(this.method2807(a2));
                b2.append("-");
                b2.append(a2);
            }
            int e2 = (d2 = Class5723.field11045.method21261(class_16572)) ? Class325.method2803(Class458.method10623()).getRGB() : ((Color)this.field775.method507()).getRGB();
            Class6454.method24624(g2.method6(), b2.toString(), ((Integer)Class325.method2814(this).method507()).intValue(), h2, e2);
            h2 += i2;
        }
        return;
    }

    private static Object method2805(Class248 class248) {
        return class248.method507();
    }

    private static int method2806(int n2, int n3, Class6259 class6259, Class1668 class1668) {
        return Class3535.method17782(n2, n3, class6259, class1668);
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_124 method2807(int a2) {
        int n2 = (Boolean)Class325.INSTANCE.field776.method507() != false ? 64992 : 64993;
        block4: while (true) {
            switch (n2) {
                case 64993: {
                    n2 = 64991;
                    continue block4;
                }
                case 64992: {
                    return class_124.field_1061;
                }
            }
            break;
        }
        if (a2 > (int)field781[10]) {
            return class_124.field_1079;
        }
        if (a2 > (int)field781[7]) {
            return class_124.field_1061;
        }
        if (a2 > (int)field781[9]) return class_124.field_1065;
        if (a2 > (int)field781[11]) {
            return class_124.field_1054;
        }
        if (a2 <= (int)field781[8]) return class_124.field_1060;
        return class_124.field_1077;
    }

    public static class_124 method2808() {
        return class_124.field_1079;
    }

    private static void method2809() {
        Class5836.method22885();
    }

    public Class325() {
        super("TextRadar", "", Class556.field2757);
        this.field772 = this.method450(new Class253("Pops", "", (boolean)field781[3]));
        this.field779 = this.method450(new Class253("Distance", "", (boolean)field781[3]));
        this.field777 = this.method450(new Class253("Effects", "", (boolean)field781[3]));
        this.field773 = this.method450(new Class252("X", "", (int)field781[1], (int)field781[1], (int)field781[0]));
        this.field780 = this.method450(new Class252("Y", "", (int)field781[1], (int)field781[5], (int)field781[2]));
        this.field775 = this.method450(new Class251("Color", "The color for player", new Color((int)field781[4]), (boolean)field781[1], (boolean)field781[1]));
        this.field774 = this.method450(new Class253("IgnoreNakeds", "Ignore players with no items", (boolean)field781[1]));
        INSTANCE = this;
    }

    private static void method2810(long l2) {
        Class325.method2800(l2);
    }

    static {
        field781 = new long[12];
        Class325.method2810(5760675325007573647L);
    }

    public static class_6880 method2811() {
        return class_1294.field_5910;
    }

    private static void method2812() {
        Class5836.method22897();
    }

    public static Class248 method2813(Class325 class325) {
        return class325.field777;
    }

    public static Class248 method2814(Class325 class325) {
        return class325.field773;
    }

    public static Class248 method2815(Class325 class325) {
        return class325.field782;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

