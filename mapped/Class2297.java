/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_638
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class1215;
import mapped.Class1412;
import mapped.Class1503;
import mapped.Class162;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2298;
import mapped.Class237;
import mapped.Class3335;
import mapped.Class3979;
import mapped.Class4078;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6322;
import mapped.Class657;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class2297
extends Class2298 {
    private static long[] field6789 = new long[3];
    public static final Class2297 INSTANCE;

    private static boolean method15821() {
        return Class1807.method15753();
    }

    public static class_2350 method15822() {
        return class_2350.field_11036;
    }

    private static void method15823() {
        Class4146.method20697();
    }

    private static boolean method15824(int n2) {
        return Class4196.method20803(n2);
    }

    static {
        Class2297.method15842(8999199655874026983L);
        INSTANCE = new Class2297();
    }

    private static boolean method15825() {
        return Class5659.method22111();
    }

    private static void method15826() {
        Class1503.method14420();
    }

    private static class_2338 method15827(Class657 class657) {
        return class657.method11472();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean method15828(class_2338 a2, class_2350 b2, class_638 c2, class_1657 d2, Class657 e2) {
        int n2;
        class_2338 f2 = class_2338.method_49637((double)d2.method_23317(), (double)d2.method_23320(), (double)d2.method_23321());
        int n3 = this.method15857(a2, f2) ? 56738 : 56739;
        block4: while (true) {
            switch (n3) {
                case 56739: {
                    n3 = 56737;
                    continue block4;
                }
                case 56738: {
                    return (int)field6789[0] != 0;
                }
            }
            break;
        }
        class_2680 g2 = null;
        if (e2.method11472().equals((Object)a2)) {
            g2 = e2.method11471();
        }
        class_265 h2 = (g2 != null ? g2 : c2.method_8320(a2)).method_26218((class_1922)c2, a2);
        boolean bl2 = h2 == class_259.method_1077() ? (int)field6789[0] : (int)field6789[1];
        List j2 = this.method15853(a2, f2, bl2);
        if (!j2.contains(b2)) {
            return (int)field6789[1] != 0;
        }
        if (!this.method15830(a2, c2, j2, b2, bl2, e2)) {
            n2 = (int)field6789[0];
            return n2 != 0;
        }
        n2 = (int)field6789[1];
        return n2 != 0;
    }

    private static boolean method15829() {
        return Class1807.method15769();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method15830(class_2338 i2, class_638 j2, List k2, class_2350 l2, boolean m2, Class657 n2) {
        if (!m2) return Class5649.method22085(0.8195906364885458, 0.2233841427967117, 0.7295767759447936, Class4078.field9440, 0.7764267157826629, 0.5093634511675972);
        int n3 = 14956;
        block4: while (true) {
            switch (n3) {
                case 14957: {
                    n3 = 14955;
                    continue block4;
                }
                case 14956: {
                    int n4;
                    class_2680 c2;
                    class_2338 a2 = i2.method_10093(l2);
                    class_2680 b2 = null;
                    if (Class2297.method15827(n2).equals((Object)a2)) {
                        b2 = Class2297.method15844(n2);
                    }
                    class_2680 class_26802 = c2 = b2 != null ? b2 : j2.method_8320(a2);
                    if (c2.method_26218((class_1922)j2, a2) == class_259.method_1077() && !c2.method_26220((class_1922)j2, a2).method_1110()) {
                        n4 = (int)field6789[0];
                        return n4 != 0;
                    }
                    n4 = (int)field6789[1];
                    return n4 != 0;
                }
            }
            break;
        }
        Iterator iterator = k2.iterator();
        while (iterator.hasNext()) {
            class_2350 h2 = (class_2350)iterator.next();
            class_2338 d2 = i2.method_10093(h2);
            class_2680 e2 = null;
            if (Class2297.method15858(n2).equals((Object)d2)) {
                e2 = n2.method11471();
            }
            class_2680 f2 = e2 != null ? e2 : j2.method_8320(d2);
            int g2 = f2.method_26218((class_1922)j2, d2) == class_259.method_1077() ? (int)field6789[0] : (int)field6789[1];
            if (g2 == 0) return (int)field6789[1] != 0;
            if (!f2.method_26220((class_1922)j2, d2).method_1110()) return (int)field6789[1] != 0;
        }
        return (int)field6789[0] != 0;
    }

    private static void method15831(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method15832() {
        return Class3979.method19551();
    }

    private static void method15833(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private List method15834(int a2, int b2, int c2, boolean d2) {
        ArrayList<class_2350> e2 = new ArrayList<class_2350>((int)field6789[2]);
        if (!d2) {
            if (a2 == 0) {
                e2.add(class_2350.field_11034);
                e2.add(class_2350.field_11039);
            }
            if (c2 == 0) {
                e2.add(class_2350.field_11035);
                e2.add(class_2350.field_11043);
            }
        }
        if (b2 == 0) {
            e2.add(class_2350.field_11036);
            e2.add(class_2350.field_11033);
        } else {
            e2.add(b2 > 0 ? Class2297.method15822() : class_2350.field_11033);
        }
        if (a2 != 0) {
            e2.add(a2 > 0 ? class_2350.field_11034 : class_2350.field_11039);
        }
        if (c2 != 0) {
            if (c2 <= 0) {
                while (true) {
                    // Infinite loop
                }
            }
            e2.add(class_2350.field_11035);
        }
        return e2;
    }

    private static void method15835(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method15836(Class2297 class2297, class_2338 class_23382, class_638 class_6383, List list, class_2350 class_23502, boolean bl2) {
        return class2297.method15841(class_23382, class_6383, list, class_23502, bl2);
    }

    private static int method15837(int n2, int n3, Class237 class237, Class162 class162) {
        return Class1412.method14187(n2, n3, class237, class162);
    }

    private static boolean method15838(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method15839() {
        return Class1807.method15769();
    }

    private static int method15840(int n2, int n3, Class1158 class1158, Class5595 class5595) {
        return Class1412.method14165(n2, n3, class1158, class5595);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method15841(class_2338 g2, class_638 h2, List i2, class_2350 j2, boolean k2) {
        if (k2) {
            int n2;
            class_2338 a2 = g2.method_10093(j2);
            class_2680 b2 = h2.method_8320(a2);
            if (b2.method_26218((class_1922)h2, a2) == class_259.method_1077()) {
                int n3 = !b2.method_26220((class_1922)h2, a2).method_1110() ? 47615 : 47616;
                block4: while (true) {
                    switch (n3) {
                        case 47616: {
                            n3 = 47614;
                            continue block4;
                        }
                        case 47615: {
                            n2 = (int)field6789[0];
                            return n2 != 0;
                        }
                    }
                    break;
                }
            }
            n2 = (int)field6789[1];
            return n2 != 0;
        }
        Iterator iterator = i2.iterator();
        while (iterator.hasNext()) {
            int e2;
            class_2350 f2 = (class_2350)iterator.next();
            class_2338 c2 = g2.method_10093(f2);
            class_2680 d2 = h2.method_8320(c2);
            int n4 = e2 = d2.method_26218((class_1922)h2, c2) == class_259.method_1077() ? (int)field6789[0] : (int)field6789[1];
            if (e2 == 0) {
                return (int)field6789[1] != 0;
            }
            if (!d2.method_26220((class_1922)h2, c2).method_1110()) return (int)field6789[1] != 0;
        }
        return (int)field6789[0] != 0;
    }

    private static void method15842(long l2) {
        Class2297.field6789[1] = l2 ^ 0x7CE394683F305DE7L;
        Class2297.field6789[2] = l2 ^ 0x7CE394683F305DE1L;
        Class2297.field6789[0] = l2 ^ 0x7CE394683F305DE6L;
    }

    private static void method15843() {
        Class5836.method22885();
    }

    private static class_2680 method15844(Class657 class657) {
        return class657.method11471();
    }

    private static boolean method15845(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    @Override
    public boolean method15846(class_2338 a2, class_2350 b2, class_638 c2, class_1657 d2) {
        class_2338 e2 = class_2338.method_49637((double)d2.method_23317(), (double)d2.method_23320(), (double)d2.method_23321());
        if (this.method15857(a2, e2)) {
            return (int)field6789[0] != 0;
        }
        class_265 f2 = c2.method_8320(a2).method_26218((class_1922)c2, a2);
        int g2 = f2 == class_259.method_1077() ? (int)field6789[0] : (int)field6789[1];
        List h2 = this.method15853(a2, e2, g2 != 0);
        if (!h2.contains(b2)) {
            return (int)field6789[1] != 0;
        }
        return (!this.method15841(a2, c2, h2, b2, g2 != 0) ? (int)field6789[0] : (int)field6789[1]) != 0;
    }

    private static void method15847() {
        Class4146.method20697();
    }

    private static void method15848(float f2) {
        Class5836.method22907(f2);
    }

    private static void method15849(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method15850(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method15851() {
        Class1745.method15538();
    }

    private static void method15852() {
        Class5836.method22897();
    }

    private List method15853(class_2338 a2, class_2338 b2, boolean c2) {
        int d2 = b2.method_10263();
        int e2 = b2.method_10264();
        int f2 = b2.method_10260();
        int g2 = a2.method_10263();
        int h2 = a2.method_10264();
        int i2 = a2.method_10260();
        return this.method15834(d2 - g2, e2 - h2, f2 - i2, c2);
    }

    private static boolean method15854() {
        return Class1807.method15742();
    }

    private static void method15855() {
        Class4146.method20697();
    }

    private static boolean method15856(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method15857(class_2338 a2, class_2338 b2) {
        int n2;
        if (b2.method_10263() == a2.method_10263() && b2.method_10264() == a2.method_10264() && b2.method_10260() == a2.method_10260()) {
            n2 = (int)field6789[0];
            return n2 != 0;
        }
        n2 = (int)field6789[1];
        return n2 != 0;
    }

    private static class_2338 method15858(Class657 class657) {
        return class657.method11472();
    }

    @Override
    @Nullable
    public class_2350 method15859(class_2338 g2, class_1657 h2, class_638 i2) {
        class_2338 j2 = class_2338.method_49637((double)h2.method_23317(), (double)h2.method_23320(), (double)h2.method_23321());
        if (this.method15857(g2, j2)) {
            return class_2350.field_11033;
        }
        List f2 = this.method15853(g2, j2, (boolean)field6789[0]);
        if (Class1745.field6554) {
            class_2350 c2 = null;
            double d2 = Class3335.field7202;
            for (class_2350 b2 : f2) {
                double a2 = h2.method_33571().method_1022(g2.method_46558().method_43206(b2, 0.5));
                if (!(a2 < d2)) continue;
                if (Class2297.method15836(this, g2, i2, f2, b2, (boolean)field6789[0])) continue;
                d2 = a2;
                c2 = b2;
            }
            return c2;
        }
        for (class_2350 e2 : f2) {
            if (this.method15841(g2, i2, f2, e2, (boolean)field6789[0])) continue;
            return e2;
        }
        return null;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

