/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 */
package mapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1108;
import mapped.Class134;
import mapped.Class1357;
import mapped.Class141;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class216;
import mapped.Class296;
import mapped.Class298;
import mapped.Class3933;
import mapped.Class4146;
import mapped.Class5183;
import mapped.Class5473;
import mapped.Class5693;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6253;
import mapped.Class660;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class469 {
    private static long[] field2451 = new long[2];
    public static List field2452;

    public static List method10712() {
        return field2452;
    }

    private static void method10713() {
        Class5836.method22897();
    }

    private static void method10714() {
        Class4146.method20697();
    }

    public static class_243 method10715() {
        return class_243.field_1353;
    }

    public static List method10716() {
        return field2452;
    }

    private static void method10717(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static class_243 method10718(class_1297 a2, int b2) {
        return Class469.method10724(a2, b2, null);
    }

    private static int method10719(int n2, int n3, Class6253 class6253, Class5473 class5473) {
        return Class1357.method13912(n2, n3, class6253, class5473);
    }

    private static void method10720(long l2) {
        Class469.field2451[0] = l2 ^ 0xB57503E14DB2DE5AL;
        Class469.field2451[1] = l2 ^ 0xB57503E14DB2DE5BL;
    }

    private static void method10721(float f2) {
        Class5836.method22907(f2);
    }

    private static void method10722() {
        Class5836.method22890();
    }

    private static void method10723() {
        Class298.method1924();
    }

    /*
     * Unable to fully structure code
     */
    public static class_243 method10724(class_1297 o, int p, List q) {
        try {
            block25: {
                if (p <= 0) break block25;
                v0 = 35843;
                ** GOTO lbl10
            }
            v0 = 35844;
            if (true) ** GOTO lbl10
            block14: while (true) {
                v0 = 35842;
lbl10:
                // 3 sources

                switch (v0) {
                    case 35844: {
                        continue block14;
                    }
                    case 35843: {
                        if (!(o instanceof class_1309)) ** break;
                        m = (class_1309)o;
                        c = 0.0;
                        for (Class660 a : Class469.method10716()) {
                            if (!a.method11480().equals((Object)o) || a.method11482() != p) continue;
                            if (!a.method11481().equals((Object)o.method_19538())) ** GOTO lbl22
                            v1 = 4638;
                            ** GOTO lbl26
lbl22:
                            // 1 sources

                            v1 = 4639;
                            if (true) ** GOTO lbl26
                            block16: while (true) {
                                v1 = 4637;
lbl26:
                                // 3 sources

                                switch (v1) {
                                    case 4639: {
                                        continue block16;
                                    }
                                    case 4638: {
                                        return a.method11479();
                                    }
                                }
                                break;
                            }
                        }
                        d = o.method_23317() - o.field_6014;
                        e = o.method_23318() - o.field_6036;
                        f = o.method_23321() - o.field_5969;
                        if (d == 0.0) {
                            if (e == 0.0 && f == 0.0) {
                                return Class469.method10715();
                            }
                        }
                        g = Math.sqrt(d * d + f * f);
                        h = new Class5183(m);
                        if (o.method_24828()) ** GOTO lbl-1000
                        if (e >= 1.0) lbl-1000:
                        // 2 sources

                        {
                            h.method_5814(o.method_23317(), o.method_23318(), o.method_23321());
                            h.method_18800(d, 0.0, f);
                        } else {
                            h.method_5814(o.field_6014, Class469.method10725(o), o.field_5969);
                            h.method_18800(d, e, f);
                        }
                        Class469.method10733(h, (boolean)Class469.field2451[1]);
                        b = (int)Class469.field2451[0];
                        if (b < p + (int)Class469.field2451[1]) {
                            h.method21036();
                            if (q != null) {
                                q.add(h.method_19538());
                            }
                            ++b;
                            while (true) {
                                // Infinite loop
                            }
                        }
                        i = h.method_23317() - o.method_23317();
                        j = h.method_23318() - o.method_23318();
                        k = h.method_23321() - o.method_23321();
                        if (e != 0.0) ** GOTO lbl64
                        v2 = 5684;
                        ** GOTO lbl68
lbl64:
                        // 1 sources

                        v2 = 5685;
                        if (true) ** GOTO lbl68
                        block18: while (true) {
                            v2 = 5683;
lbl68:
                            // 3 sources

                            switch (v2) {
                                case 5685: {
                                    continue block18;
                                }
                                case 5684: {
                                    if (o.method_24828()) break block18;
                                    v3 = 0.0;
                                    Class469.method10732();
                                    return null;
                                }
                            }
                            break;
                        }
                        l = new class_243(i, j, k);
                        Class469.method10712().add(new Class660(o, p, o.method_19538(), l, g));
                        return l;
                    }
                }
                break;
            }
        }
        catch (Exception n) {
            n.printStackTrace();
            return class_243.field_1353;
        }
        Class5836.method22907(0.37148803f);
        return null;
    }

    public static double method10725(class_1297 class_12972) {
        return class_12972.field_6036;
    }

    private static void method10726() {
        Class4146.method20697();
    }

    private static void method10727() {
        Class1503.method14420();
    }

    private static void method10728() {
        Class4146.method20694();
    }

    private static int method10729(int n2, int n3, Class3933 class3933, Class216 class216) {
        return Class1357.method13907(n2, n3, class3933, class216);
    }

    private static int method10730(int n2, int n3, Class5693 class5693, Class134 class134) {
        return Class1357.method13915(n2, n3, class5693, class134);
    }

    private static void method10731() {
        Class4146.method20697();
    }

    private static void method10732() {
        Class6009.method23560();
    }

    public static void method10733(Class5183 class5183, boolean bl2) {
        class5183.field10070 = bl2;
    }

    private static void method10734() {
        Class1807.method15744();
    }

    static {
        Class469.method10720(-5371382714363355558L);
        field2452 = new CopyOnWriteArrayList();
    }

    private static void method10735(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method10736() {
        Class1807.method15744();
    }

    private static void method10737() {
        Class1807.method15744();
    }

    private static void method10738() {
        Class4146.method20697();
    }

    private static int method10739(int n2, int n3, Class296 class296, Class141 class141) {
        return Class1357.method13890(n2, n3, class296, class141);
    }

    private static void method10740(float f2) {
        Class5836.method22907(f2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

