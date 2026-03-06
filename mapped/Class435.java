/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_2189
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2358
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class1215;
import mapped.Class127;
import mapped.Class1425;
import mapped.Class1503;
import mapped.Class1561;
import mapped.Class1668;
import mapped.Class1742;
import mapped.Class1745;
import mapped.Class1799;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class298;
import mapped.Class303;
import mapped.Class3348;
import mapped.Class341;
import mapped.Class3493;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class425;
import mapped.Class447;
import mapped.Class468;
import mapped.Class525;
import mapped.Class543;
import mapped.Class5449;
import mapped.Class5512;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class615;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class803;
import mapped.Class85;
import mapped.Class92;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_2189;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2358;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class435
extends Class414 {
    class_2338 field2104;
    Class248 field2105;
    private static long[] field2106 = new long[11];
    Class248 field2107;
    private final List field2108;
    Class248 field2109;
    Class248 field2110;
    private final List field2111 = new ArrayList();
    Class248 field2112;
    Class248 field2113;
    Class248 field2114;
    private class_1297 field2115;
    private static Class435 INSTANCE;
    Class248 field2116;
    Class248 field2117;
    Class248 field2118;
    Class248 field2119;

    private static Object method9194(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9195(Class425 class425, class_2338 class_23382, int n2) {
        return class425.method8517(class_23382, n2);
    }

    public static class_746 method9196(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private boolean method9197(class_1297 b2) {
        if (b2 instanceof class_1657) {
            class_1657 a2 = (class_1657)b2;
            if (b2.equals((Object)Class435.field290.field_1724) || b2.equals((Object)Class435.field290.field_1719)) {
                return (int)field2106[0] != 0;
            }
            if (a2.method_29504() || !b2.method_5805()) {
                return (int)field2106[0] != 0;
            }
            if ((double)Class435.field290.field_1724.method_5739((class_1297)a2) > (Double)this.field2119.method507()) {
                return (int)field2106[0] != 0;
            }
            if (a2.method_7337()) {
                return (int)field2106[0] != 0;
            }
            return (!Class5723.field11045.method21261(a2) ? (int)field2106[1] : (int)field2106[0]) != 0;
        }
        return (int)field2106[0] != 0;
    }

    private static void method9198() {
        Class6009.method23561();
    }

    private static Object method9199(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean method9200(class_2338 a, boolean b) {
        c = Class435.field290.field_1687.method_8320(a.method_10074()).method_26204();
        d = Class435.field290.field_1687.method_8320(a).method_26204();
        v0 = c != class_2246.field_9987 ? 19757 : 19758;
        block8: while (true) {
            switch (v0) {
                case 19758: {
                    v0 = 19756;
                    continue block8;
                }
                case 19757: {
                    if (c != class_2246.field_10540) break block8;
                }
                default: {
                    if (!(Class435.field290.field_1724.method_33571().method_1022(a.method_46558()) <= (Double)this.field2117.method507()) || !(d instanceof class_2189) && !(d instanceof class_2358) && !this.method9216(d) || this.method9244(new class_238((double)a.method_10263(), (double)a.method_10264(), (double)a.method_10260(), (double)(a.method_10263() + (int)Class435.field2106[1]), (double)(a.method_10264() + (int)Class435.field2106[2]), (double)(a.method_10260() + (int)Class435.field2106[1])))) break block8;
                    if (!b) ** GOTO lbl-1000
                    if (!Class5659.method22125((class_1657)Class435.method9196(Class435.field290), a, (boolean)Class435.field2106[1], (boolean)Class435.field2106[1], (boolean)Class435.field2106[1], (boolean)Class435.field2106[1])) ** GOTO lbl17
                    v1 = 46102;
                    ** GOTO lbl21
lbl17:
                    // 1 sources

                    v1 = 46103;
                    if (true) ** GOTO lbl21
                    do {
                        v1 = var5_5 = 46101;
lbl21:
                        // 3 sources

                        if (var5_5 != 46102) continue;
                        if (!this.method9259()) ** GOTO lbl28
                        ** GOTO lbl26
                    } while (var5_5 == 46103);
                    ** GOTO lbl-1000
lbl26:
                    // 1 sources

                    v2 = 26353;
                    ** GOTO lbl29
lbl28:
                    // 1 sources

                    v2 = 26354;
lbl29:
                    // 2 sources

                    block10: while (true) {
                        switch (v2) {
                            case 26354: {
                                v2 = 26352;
                                continue block10;
                            }
                            case 26353: lbl-1000:
                            // 3 sources

                            {
                                v3 = (int)Class435.field2106[1];
                                return (boolean)v3;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
        v3 = (int)Class435.field2106[0];
        return (boolean)v3;
    }

    private static boolean method9201() {
        return Class5659.method22111();
    }

    public static class_638 method9202(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method9203(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static List method9204(class_243 a2) {
        return Class435.method9236(new class_238(a2.method_10216() - 0.25, a2.method_10214() + 1.5, a2.method_10215() - Class1425.field5463, a2.method_10216() + 0.25, a2.method_10214() + 1.5, a2.method_10215() + Class3348.field7241));
    }

    public static Class435 method9205() {
        return Class435.method9207();
    }

    private static void method9206() {
        Class298.method1924();
    }

    public static Class435 method9207() {
        return INSTANCE;
    }

    private static Class248 method9208(Class435 class435) {
        return Class435.method9270(class435);
    }

    private static Object method9209(Class248 class248) {
        return class248.method507();
    }

    private static boolean method9210(Class425 class425, class_2338 class_23382, int n2) {
        return class425.method8537(class_23382, n2);
    }

    private static void method9211() {
        Class5836.method22897();
    }

    private static boolean method9212(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static int method9213(int n2, int n3, Class303 class303, Class1 class1) {
        return Class468.method10667(n2, n3, class303, class1);
    }

    private static boolean method9214() {
        return Class3979.method19551();
    }

    private static void method9215() {
        Class5836.method22897();
    }

    public boolean method9216(class_2248 a2) {
        if (!(a2 instanceof class_2189)) {
            return Class435.method9230();
        }
        return (int)field2106[0] != 0;
    }

    private static void method9217(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9218() {
        Class5836.method22890();
    }

    private double method9219(class_2338 a2) {
        return a2.method_19770((class_2374)Class435.field290.field_1724.method_19538());
    }

    private static boolean method9220(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method9221(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method9222(int n2, int n3, Class85 class85, Class1561 class1561) {
        return Class468.method10648(n2, n3, class85, class1561);
    }

    public static Class248 method9223(Class435 class435) {
        return class435.field2110;
    }

    private static void method9224(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method9225(int n2, int n3, Class127 class127, Class341 class341) {
        return Class468.method10666(n2, n3, class127, class341);
    }

    public static Class5512 method9226(Class425 class425) {
        return class425.field1893;
    }

    public static void method9227(Class435 class435, class_1297 class_12972) {
        class435.field2115 = class_12972;
    }

    private static boolean method9228(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static List method9229(Class435 class435) {
        return class435.field2111;
    }

    private static boolean method9230() {
        return Class3979.method19551();
    }

    public static Class248 method9231(Class435 class435) {
        return class435.field2113;
    }

    private static void method9232(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9233(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method9234() {
        Class1807.method15744();
    }

    public class_1297 method9235() {
        return Class435.method9268(this);
    }

    private static List method9236(class_238 class_2383) {
        return Class5449.method21083(class_2383);
    }

    private static void method9237(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_1297 method9238(Class435 class435) {
        return class435.field2115;
    }

    private static void method9239() {
        Class4146.method20694();
    }

    private static boolean method9240() {
        return Class5659.method22111();
    }

    private static int method9241(int n2, int n3, Class1742 class1742, Class6283 class6283) {
        return Class468.method10669(n2, n3, class1742, class6283);
    }

    private static List method9242(class_243 a2) {
        return List.of(new class_2338.class_2339(a2.method_10216() + 0.25, a2.method_10214(), a2.method_10215() + 0.25), new class_2338.class_2339(a2.method_10216() - 0.25, a2.method_10214(), a2.method_10215() - 0.25), new class_2338.class_2339(a2.method_10216() + Class1799.field6726, a2.method_10214(), a2.method_10215() - 0.25), new class_2338.class_2339(a2.method_10216() - 0.25, a2.method_10214(), a2.method_10215() + 0.25));
    }

    private static void method9243(long l2) {
        Class435.field2106[5] = l2 ^ 0x1B3E8C3777A101A0L;
        Class435.field2106[7] = l2 ^ 0x1B3E8C3777A101ADL;
        Class435.field2106[1] = l2 ^ 0x1B3E8C3777A101A4L;
        Class435.field2106[8] = l2 ^ 0x1B3E8C3777A101A1L;
        Class435.field2106[3] = l2 ^ 0x1B3E8C3777A101A6L;
        Class435.field2106[4] = l2 ^ 0x1B3E8C3777A101A2L;
        Class435.field2106[6] = l2 ^ 0x1B3E8C3777A101AFL;
        Class435.field2106[10] = l2 ^ 0x1B3E8C3777A101A3L;
        Class435.field2106[9] = l2 ^ 0x1B3E8C3777A101ACL;
        Class435.field2106[0] = l2 ^ 0x1B3E8C3777A101A5L;
        Class435.field2106[2] = l2 ^ 0x1B3E8C3777A101A7L;
    }

    private boolean method9244(class_238 a2) {
        return Class1158.method13141(a2, Class435::method9269);
    }

    private static boolean method9245() {
        return Class1807.method15742();
    }

    private static Class525[] method9246() {
        return Class525.values();
    }

    public static Class5512 method9247(Class425 class425) {
        return class425.field1893;
    }

    @Override
    public String method1248() {
        if (this.field2115 != null) {
            return Class435.method9238(this).method_5477().getString();
        }
        return super.method1248();
    }

    public static void method9248(Class435 class435, class_2338 class_23382) {
        class435.field2104 = class_23382;
    }

    private static void method9249() {
        Class5836.method22890();
    }

    private static Object method9250(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method9251(Class435 class435) {
        return class435.field2109;
    }

    static {
        Class435.method9243(1963160657438245285L);
    }

    private static boolean method9252() {
        return Class447.method10322();
    }

    private static void method9253(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method9254(int n2, int n3, Class543 class543, Class92 class92) {
        return Class468.method10647(n2, n3, class543, class92);
    }

    private static boolean method9255(Class425 class425, class_2338 class_23382, int n2) {
        return class425.method8537(class_23382, n2);
    }

    private static boolean method9256(double d2) {
        return Class5659.method22193(d2);
    }

    private static class_638 method9257(class_310 class_3102) {
        return Class435.method9202(class_3102);
    }

    private static void method9258() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9259() {
        int n2;
        class_2338 a2 = Class5659.method22153((class_1657)Class435.field290.field_1724, (boolean)field2106[0]);
        if (Class5595.method21942(a2)) {
            return (int)field2106[1] != 0;
        }
        if (Class5595.method21932(a2) && !Class5723.field11054.method22514(a2)) {
            n2 = (int)field2106[1];
            return n2 != 0;
        }
        n2 = (int)field2106[0];
        return n2 != 0;
    }

    private static void method9260() {
        Class1745.method15538();
    }

    private static Class248 method9261(Class435 class435) {
        return Class435.method9223(class435);
    }

    public static List method9262(Class435 class435) {
        return class435.field2111;
    }

    private static void method9263(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method9264() {
        return Class1807.method15769();
    }

    public static Class248 method9265(Class435 class435) {
        return class435.field2107;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method9266(Class210 h) {
        block45: {
            block43: {
                block44: {
                    if (Class376.method4987()) {
                        return;
                    }
                    i = Class425.method8407();
                    Class3493.method17601(this.field2108, (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method9197(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)((Class435)this), (Class525)Class435.method9231(this).method507(), (int)Class435.field2106[1]);
                    if (this.field2108.isEmpty()) {
                        Class435.method9227(this, null);
                        return;
                    }
                    this.field2115 = (class_1297)this.field2108.getFirst();
                    if (!((Boolean)this.field2114.method507()).booleanValue()) break block43;
                    if (i.field1918 == null) break block44;
                    v0 = 3181;
                    ** GOTO lbl18
                }
                v0 = 3182;
                if (true) ** GOTO lbl18
                block20: while (true) {
                    v0 = 3180;
lbl18:
                    // 3 sources

                    switch (v0) {
                        case 3182: {
                            continue block20;
                        }
                        case 3181: {
                            if (Class435.method9247(i) == null) break block20;
                            if (i.field1918.field10395.equals((Object)Class435.method9226((Class425)i).field10395)) ** GOTO lbl26
                            v1 = 9656;
                            ** GOTO lbl30
lbl26:
                            // 1 sources

                            v1 = 9657;
                            if (true) ** GOTO lbl30
                            do {
                                v1 = var3_3 = 9655;
lbl30:
                                // 3 sources

                                if (var3_3 == 9656) ** GOTO lbl33
                            } while (var3_3 == 9657);
                            break block20;
lbl33:
                            // 1 sources

                            if (Class435.method9271(Class435.field290).method_22347(i.field1893.field10395)) ** GOTO lbl36
                            v2 = 34477;
                            ** GOTO lbl40
lbl36:
                            // 1 sources

                            v2 = 34478;
                            if (true) ** GOTO lbl40
                            do {
                                v2 = var4_4 = 34476;
lbl40:
                                // 3 sources

                                if (var4_4 == 34477) ** GOTO lbl43
                            } while (var4_4 == 34478);
                            break block20;
lbl43:
                            // 1 sources

                            return;
                        }
                    }
                    break;
                }
            }
            if (!((Boolean)this.field1536.method507()).booleanValue() && Class435.field290.field_1724.method_6115()) {
                return;
            }
            if (((Boolean)Class435.method9194(this.field2112)).booleanValue()) {
                for (class_2338 a : Class435.method9242(this.field2115.method_19538())) {
                    if (!this.method9216(Class435.field290.field_1687.method_8320(a).method_26204()) || !Class435.method9210(i, a, (Integer)Class435.method9251(this).method507())) continue;
                    return;
                }
            }
            if (((Boolean)Class435.method9265(this).method507()).booleanValue()) {
                for (Object b : Class435.method9204(this.field2115.method_19538())) {
                    if (!this.method9216(Class435.method9257(Class435.field290).method_8320((class_2338)b).method_26204()) || !Class435.method9255(i, (class_2338)b, (Integer)this.field2109.method507())) continue;
                    return;
                }
            }
            if (!((Boolean)this.field2118.method507()).booleanValue()) break block45;
            v3 = 30487;
            if (true) ** GOTO lbl64
        }
        v4 = 30488;
        Class5836.method22897();
        return;
        block25: while (true) {
            v3 = 30486;
lbl64:
            // 2 sources

            switch (v3) {
                case 30488: {
                    continue block25;
                }
                case 30487: {
                    if (this.field2115.method_24828()) {
                        Class435.method9249();
                        return;
                    }
                    if (this.field2115.field_6036 != this.field2115.method_23318()) break block25;
                    if (!Class5595.method21939(this.field2115.method_24515())) {
                        return;
                    }
                    this.field2111.clear();
                    f = Class5659.method22141(this.field2115.method_19538());
                    b = f.iterator();
                    while (true) {
                        v5 = b.hasNext() ? 16394 : (var7_7 = 16395);
                        if (var7_7 != 16394) {
                            if (var7_7 != 16395) break;
                            Class6009.method23560();
                            return;
                        }
                        e = (class_2338)b.next();
                        var9_9 = Class5449.field10187;
                        var10_10 = var9_9.length;
                        var11_11 = (int)Class435.field2106[0];
                        block27: while (true) {
                            if (var11_11 >= var10_10) ** GOTO lbl91
                            v6 = 57198;
                            ** GOTO lbl95
lbl91:
                            // 1 sources

                            v6 = 57199;
                            if (true) ** GOTO lbl95
                            block28: while (true) {
                                v6 = 57197;
lbl95:
                                // 3 sources

                                switch (v6) {
                                    case 57199: {
                                        continue block28;
                                    }
                                    case 57198: {
                                        d = var9_9[var11_11];
                                        c = e.method_10093(d);
                                        if (f.contains(c)) ** GOTO lbl-1000
                                        if (!this.method9200(c, (boolean)Class435.field2106[1])) ** GOTO lbl105
                                        v7 = 8055;
                                        ** GOTO lbl109
lbl105:
                                        // 1 sources

                                        v7 = 8056;
                                        if (true) ** GOTO lbl109
                                        block29: while (true) {
                                            v7 = 8054;
lbl109:
                                            // 3 sources

                                            switch (v7) {
                                                case 8056: {
                                                    continue block29;
                                                }
                                                case 8055: {
                                                    this.field2111.add(c);
                                                    break block29;
                                                }
                                                default: lbl-1000:
                                                // 2 sources

                                                {
                                                    if (!this.field2111.isEmpty() || f.contains(c)) break block29;
                                                    if (!this.method9200(c, (boolean)Class435.field2106[0])) {
                                                        Class6322.method24332(0.5230954f, 0.5780253f);
                                                        return;
                                                    }
                                                    Class435.method9262(this).add(c);
                                                }
                                            }
                                            break;
                                        }
                                        ++var11_11;
                                        continue block27;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    if (Class435.method9229(this).isEmpty()) {
                        return;
                    }
                    if (this.field2104 != null && this.field2111.contains(this.field2104)) {
                        Class435.method9195(i, this.field2104, (Integer)this.field2109.method507());
                        Class435.method9248(this, null);
                        return;
                    }
                    if (i.field1918 == null) ** GOTO lbl136
                    v8 = 12154;
                    ** GOTO lbl140
lbl136:
                    // 1 sources

                    v8 = 12155;
                    if (true) ** GOTO lbl140
                    block30: while (true) {
                        v8 = 12153;
lbl140:
                        // 3 sources

                        switch (v8) {
                            case 12155: {
                                continue block30;
                            }
                            case 12154: {
                                if (!this.field2111.contains(i.field1918.field10395)) break block30;
                                return;
                            }
                        }
                        break;
                    }
                    this.field2111.sort(Comparator.comparingDouble((ToDoubleFunction<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method9219(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)D)((Class435)this)));
                    g = (class_2338)this.field2111.getFirst();
                    if (this.field2111.size() >= (int)Class435.field2106[2] && i.field1893 == null) {
                        i.method8517((class_2338)this.field2111.get((int)Class435.field2106[1]), (Integer)this.field2109.method507());
                        this.field2104 = g;
                        return;
                    }
                    i.method8517(g, (Integer)this.field2109.method507());
                }
            }
            break;
        }
    }

    public Class435() {
        super("AutoMine", "Auto mine target blocks", Class556.field2758);
        this.field2108 = new ArrayList();
        this.field2105 = this.method450(new Class260("Selection", "How to use the blocks setting", Class615.field2994, Class615.values()));
        class_2248[] class_2248Array = new class_2248[(int)field2106[9]];
        class_2248Array[(int)Class435.field2106[0]] = class_2246.field_10540;
        class_2248Array[(int)Class435.field2106[1]] = class_2246.field_22423;
        class_2248Array[(int)Class435.field2106[2]] = class_2246.field_22109;
        class_2248Array[(int)Class435.field2106[3]] = class_2246.field_22108;
        class_2248Array[(int)Class435.field2106[8]] = class_2246.field_23152;
        class_2248Array[(int)Class435.field2106[5]] = class_2246.field_10535;
        class_2248Array[(int)Class435.field2106[10]] = class_2246.field_10485;
        class_2248Array[(int)Class435.field2106[4]] = class_2246.field_10443;
        class_2248Array[(int)Class435.field2106[7]] = class_2246.field_10327;
        this.field2110 = this.method450(new Class257("Whitelist", "Valid block whitelist", class_2248Array));
        class_2248[] class_2248Array2 = new class_2248[(int)field2106[1]];
        class_2248Array2[(int)Class435.field2106[0]] = class_2246.field_10343;
        this.field2116 = this.method450(new Class257("Blacklist", "Valid block blacklist", class_2248Array2));
        this.field2119 = this.method450(new Class252("TargetRange", "The maximum range the entity can be to attack it", 0.0, 5.0, 8.0));
        this.field2117 = this.method450(new Class252("MineRange", "The maximum range the block can be to break it", 0.0, 4.0, 6.0));
        this.field2113 = this.method450(new Class260("Sort", "How to filter targets within range", Class525.field2605, Class435.method9246()));
        this.field2114 = this.method450(new Class253("Wait", "Waiting for mining to finish", (boolean)field2106[0]));
        this.field2112 = this.method450(new Class253("Burrow", "Auto mine enemy's burrow", (boolean)field2106[1]));
        this.field2107 = this.method450(new Class253("Face", "Auto mine enemy's face", (boolean)field2106[0]));
        this.field2118 = this.method450(new Class253("Surround", "Auto mine enemy's surround", (boolean)field2106[1]));
        this.field2109 = this.method450(new Class252("Priority", "Priority of mining", (int)field2106[0], (int)field2106[5], (int)field2106[6]));
        this.field2104 = null;
        INSTANCE = this;
    }

    private static Object method9267(Class248 class248) {
        return class248.method507();
    }

    public static class_1297 method9268(Class435 class435) {
        return class435.field2115;
    }

    private static boolean method9269(class_1297 a2) {
        if (a2.method_7325()) {
            return Class5659.method22193(0.9597963730176847);
        }
        if (!(a2 instanceof class_1542) && !(a2 instanceof class_1511)) {
            int n2 = (int)field2106[1];
            return Class435.method9256(0.5971396529011599);
        }
        return (int)field2106[0] != 0;
    }

    public static Class248 method9270(Class435 class435) {
        return class435.field2105;
    }

    @Override
    public void method1279() {
        this.field2115 = null;
        this.field2111.clear();
        this.field2108.clear();
    }

    public static class_638 method9271(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

