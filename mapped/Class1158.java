/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.LongBidirectionalIterator
 *  it.unimi.dsi.fastutil.longs.LongSortedSet
 *  net.minecraft.class_1296
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1421
 *  net.minecraft.class_1439
 *  net.minecraft.class_1477
 *  net.minecraft.class_1493
 *  net.minecraft.class_1560
 *  net.minecraft.class_1569
 *  net.minecraft.class_1590
 *  net.minecraft.class_1690
 *  net.minecraft.class_1694
 *  net.minecraft.class_1695
 *  net.minecraft.class_1696
 *  net.minecraft.class_238
 *  net.minecraft.class_310
 *  net.minecraft.class_4076
 *  net.minecraft.class_4466
 *  net.minecraft.class_5572
 *  net.minecraft.class_5573
 *  net.minecraft.class_5577
 *  net.minecraft.class_5578
 */
package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import mapped.Class1215;
import mapped.Class1807;
import mapped.Class201;
import mapped.Class3283;
import mapped.Class3364;
import mapped.Class3462;
import mapped.Class3641;
import mapped.Class3833;
import mapped.Class3979;
import mapped.Class408;
import mapped.Class4122;
import mapped.Class4196;
import mapped.Class4225;
import mapped.Class447;
import mapped.Class453;
import mapped.Class541;
import mapped.Class5613;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class5884;
import mapped.Class803;
import mapped.Class81;
import net.hachimi.client.mixin.aA;
import net.hachimi.client.mixin.aS;
import net.hachimi.client.mixin.bE;
import net.hachimi.client.mixin.bz;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1421;
import net.minecraft.class_1439;
import net.minecraft.class_1477;
import net.minecraft.class_1493;
import net.minecraft.class_1560;
import net.minecraft.class_1569;
import net.minecraft.class_1590;
import net.minecraft.class_1690;
import net.minecraft.class_1694;
import net.minecraft.class_1695;
import net.minecraft.class_1696;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_4076;
import net.minecraft.class_4466;
import net.minecraft.class_5572;
import net.minecraft.class_5573;
import net.minecraft.class_5577;
import net.minecraft.class_5578;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1158 {
    private static long[] field4625 = new long[3];

    public static class_310 method13108() {
        return Class4122.field9561;
    }

    private static boolean method13109(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method13110(class_1297 a2) {
        int n2;
        if (!(a2 instanceof class_1296 || a2 instanceof class_1421 || a2 instanceof class_1477)) {
            n2 = (int)field4625[1];
            return n2 != 0;
        }
        n2 = (int)field4625[0];
        return n2 != 0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static boolean method13111(class_1297 f2) {
        int n2;
        block7: {
            block6: {
                class_4466 e2;
                class_1439 d2;
                class_1493 c2;
                class_1590 b2;
                block5: {
                    int n3;
                    if (!(f2 instanceof class_1560)) break block5;
                    class_1560 a2 = (class_1560)f2;
                    if (!a2.method_6510()) return Class447.method10322();
                    int n4 = 51512;
                    boolean bl2 = true;
                    do {
                        if (!bl2 || (bl2 = false) || !true) {
                            n4 = n3 = 51511;
                        }
                        if (n3 == 51512) break block5;
                    } while (n3 == 51513);
                    break block6;
                }
                if (!(f2 instanceof class_1590 && !(b2 = (class_1590)f2).method_6510() || f2 instanceof class_1493 && !(c2 = (class_1493)f2).method_6510() || f2 instanceof class_1439 && !(d2 = (class_1439)f2).method_6510() || f2 instanceof class_4466 && !(e2 = (class_4466)f2).method_6510())) break block7;
            }
            n2 = (int)field4625[0];
            return n2 != 0;
        }
        n2 = (int)field4625[1];
        return n2 != 0;
    }

    private static void method13112(AtomicBoolean a2, Predicate b2, class_1297 c2) {
        if (!a2.get()) {
            if (b2.test(c2)) {
                a2.set((boolean)field4625[0]);
            }
        }
    }

    private static boolean method13113(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static boolean method13114(class_1297 a2) {
        return (a2 instanceof class_1690 || a2 instanceof class_1695 || a2 instanceof class_1696 || a2 instanceof class_1694 ? (int)field4625[0] : (int)field4625[1]) != 0;
    }

    private static boolean method13115(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static boolean method13116() {
        return Class1807.method15742();
    }

    static {
        Class1158.method13145(469854662390761202L);
    }

    private static boolean method13117(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method13118(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method13119(int n2, int n3, Class81 class81, Class453 class453) {
        return Class3283.method16807(n2, n3, class81, class453);
    }

    private static boolean method13120() {
        return Class1807.method15742();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method13121(class_1297 a2) {
        if (a2 instanceof class_1560) return (int)field4625[0] != 0;
        int n2 = !(a2 instanceof class_1590) ? 1431 : 1432;
        block4: while (true) {
            switch (n2) {
                case 1432: {
                    n2 = 1430;
                    continue block4;
                }
                case 1431: {
                    if (a2 instanceof class_1493) return Class408.method6431();
                    if (!(a2 instanceof class_1439)) return Class1158.method13132(1851071128);
                    return (int)field4625[0] != 0;
                }
            }
            break;
        }
        return (int)field4625[0] != 0;
    }

    private static boolean method13122(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method13123() {
        return Class3979.method19539();
    }

    private static int method13124(int n2, int n3, Class4225 class4225, Class541 class541) {
        return Class3283.method16801(n2, n3, class4225, class541);
    }

    private static boolean method13125() {
        return Class5659.method22194();
    }

    private static boolean method13126() {
        return Class447.method10252();
    }

    private static boolean method13127(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method13128(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method13129() {
        return Class5659.method22111();
    }

    private static boolean method13130(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method13131(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method13132(int n2) {
        return Class4196.method20803(n2);
    }

    public static boolean method13133(class_1297 a2) {
        return (a2 instanceof class_1569 && !Class1158.method13111(a2) ? (int)field4625[0] : (int)field4625[1]) != 0;
    }

    private static boolean method13134() {
        return Class1807.method15753();
    }

    public static float method13135(class_1297 b2) {
        if (b2 instanceof class_1309) {
            class_1309 a2 = (class_1309)b2;
            return a2.method_6032() + a2.method_6067();
        }
        return 0.0f;
    }

    private static boolean method13136() {
        return Class5836.method22894();
    }

    private static boolean method13137() {
        return Class4196.method20801();
    }

    private static int method13138(int n2, int n3, Class3833 class3833, Class5884 class5884) {
        return Class3283.method16780(n2, n3, class3833, class5884);
    }

    private static int method13139(int n2, int n3, Class3364 class3364, Class201 class201) {
        return Class3283.method16819(n2, n3, class3364, class201);
    }

    private static boolean method13140() {
        return Class3979.method19551();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method13141(class_238 t2, Predicate u2) {
        class_5577 v2 = ((aA)Class1158.method13108().field_1687).getEntityLookup();
        if (!(v2 instanceof class_5578)) {
            AtomicBoolean w2 = new AtomicBoolean((boolean)field4625[1]);
            v2.method_31807(t2, arg_0 -> Class1158.method13112(w2, u2, arg_0));
            return w2.get();
        }
        class_5578 s2 = (class_5578)v2;
        class_5573 j2 = ((aS)s2).getCache();
        LongSortedSet k2 = ((bz)j2).getTrackedPositions();
        Long2ObjectMap l2 = ((bz)j2).getTrackingSections();
        int m2 = class_4076.method_32204((double)(t2.field_1323 - Class5613.field10710));
        int n2 = class_4076.method_32204((double)(t2.field_1322 - 2.0));
        int o2 = class_4076.method_32204((double)(t2.field_1321 - Class3462.field7579));
        int p2 = class_4076.method_32204((double)(t2.field_1320 + Class3641.field8144));
        int q2 = class_4076.method_32204((double)(t2.field_1325 + 2.0));
        int r2 = class_4076.method_32204((double)(t2.field_1324 + 2.0));
        int i2 = m2;
        if (i2 > p2) {
            return (int)field4625[1] != 0;
        }
        long f2 = class_4076.method_18685((int)i2, (int)((int)field4625[1]), (int)((int)field4625[1]));
        long g2 = class_4076.method_18685((int)i2, (int)((int)field4625[2]), (int)((int)field4625[2]));
        LongBidirectionalIterator h2 = k2.subSet(f2, g2 + field4625[0]).iterator();
        block4: while (h2.hasNext()) {
            long c2 = h2.nextLong();
            int d2 = class_4076.method_18689((long)c2);
            int e2 = class_4076.method_18690((long)c2);
            if (d2 < n2) continue;
            if (d2 > q2) {
                return Class447.method10322();
            }
            int n3 = 26217;
            block5: while (true) {
                switch (n3) {
                    case 26218: {
                        n3 = 26216;
                        continue block5;
                    }
                    case 26217: {
                        if (e2 < o2) {
                            return Class1158.method13123();
                        }
                        if (e2 > r2) continue block4;
                        class_5572 b2 = (class_5572)l2.get(c2);
                        if (b2 == null) continue block4;
                        if (!b2.method_31768().method_31885()) {
                            while (true) {
                                // Infinite loop
                            }
                        }
                        for (class_1297 a2 : ((bE)b2).getCollection()) {
                            if (!a2.method_5829().method_994(t2) || !u2.test(a2)) continue;
                            return (int)field4625[0] != 0;
                        }
                        continue block4;
                    }
                }
                break;
            }
        }
        return Class1807.method15769();
    }

    private static boolean method13142() {
        return Class1807.method15769();
    }

    private static boolean method13143() {
        return Class1807.method15753();
    }

    private static boolean method13144(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method13145(long l2) {
        Class1158.field4625[1] = l2 ^ 0x685425377DCC6F2L;
        Class1158.field4625[2] = l2 ^ 0xF97ABDAC8823390DL;
        Class1158.field4625[0] = l2 ^ 0x685425377DCC6F3L;
    }

    private static boolean method13146() {
        return Class1807.method15769();
    }

    private static boolean method13147() {
        return Class1807.method15742();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

