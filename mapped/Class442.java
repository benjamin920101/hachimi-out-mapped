/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3532
 *  net.minecraft.class_6880
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class1451;
import mapped.Class151;
import mapped.Class164;
import mapped.Class1807;
import mapped.Class201;
import mapped.Class210;
import mapped.Class248;
import mapped.Class253;
import mapped.Class255;
import mapped.Class260;
import mapped.Class315;
import mapped.Class3546;
import mapped.Class3795;
import mapped.Class3957;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class411;
import mapped.Class548;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5629;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6023;
import mapped.Class615;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class803;
import mapped.Class91;
import net.minecraft.class_1294;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class442
extends Class411 {
    private static Class442 INSTANCE;
    private static long[] field2214;
    Class248 field2215;
    Class248 field2216;
    Class248 field2217 = this.method450(new Class260("Mode", "Sprinting mode. Rage allows for multi-directional sprinting.", Class548.field2713, Class548.values()));
    Class248 field2218;

    private static float method9594() {
        return Class6322.method24328();
    }

    public static class_744 method9595(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static boolean method9596() {
        return Class5659.method22111();
    }

    public static Class248 method9597(Class442 class442) {
        return class442.field2217;
    }

    static {
        field2214 = new long[3];
        Class442.method9632(5765716148219280120L);
    }

    private static float method9598() {
        return Class6322.method24328();
    }

    public static class_744 method9599(class_746 class_7462) {
        return class_7462.field_3913;
    }

    public static class_746 method9600(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static float method9601() {
        return Class803.method12221();
    }

    private static boolean method9602() {
        return Class5836.method22894();
    }

    public Class442() {
        super("Sprint", "Automatically sprints", Class556.field2752, (int)field2214[1]);
        this.field2216 = this.method450(new Class253("JumpFix", "Fixes jumping slowdown in Rage sprint", (boolean)field2214[0], this::method1269));
        this.field2218 = this.method450(new Class253("WebFix", "Stop sprinting when you in web", (boolean)field2214[0]));
        this.field2215 = this.method450(new Class253("KeepSprint", "Removes sprint reset when attacking", (boolean)field2214[0]));
        INSTANCE = this;
    }

    private static float method9603() {
        return Class5659.method22208();
    }

    @Class1
    public void method9604(Class201 a2) {
        if (((Boolean)this.field2215.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static class_744 method9605(class_746 class_7462) {
        return Class442.method9599(class_7462);
    }

    public static class_746 method9606(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method9607(Class248 class248) {
        return class248.method507();
    }

    private static float method9608() {
        return Class6322.method24337();
    }

    public static Class248 method9609(Class442 class442) {
        return class442.field2218;
    }

    @Class1
    public void method9610(Class164 b2) {
        if (this.method9618()) {
            float a2 = this.method9636(Class442.field290.field_1724.method_36454());
            if (this.method9631(a2)) {
                return;
            }
            b2.method10();
        }
    }

    private static void method9611() {
        Class6454.method24594();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1269() {
        int n2;
        if (this.field2217.method507() != Class548.field2714 && Class442.method9641(this).method507() != Class548.field2715) {
            n2 = (int)field2214[2];
            return n2 != 0;
        }
        n2 = (int)field2214[0];
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9612(Class151 d2) {
        if (((Boolean)Class442.method9617(this.field2216)).booleanValue()) {
            int n2 = this.field2217.method507() != Class548.field2714 ? 4490 : 4491;
            block8: while (true) {
                switch (n2) {
                    case 4491: {
                        n2 = 4489;
                        continue block8;
                    }
                    case 4490: {
                        if (this.field2217.method507() != Class442.method9635()) break block8;
                    }
                    default: {
                        float a2 = d2.method294();
                        float b2 = Math.signum(Class442.method9645(Class442.method9595(Class442.field290.field_1724)));
                        float c2 = 90.0f * Math.signum(Class442.method9605((class_746)Class442.method9606((class_310)Class442.field290)).field_3907);
                        if (b2 != 0.0f) {
                            c2 *= b2 * 0.5f;
                        }
                        a2 -= c2;
                        if (b2 < 0.0f) {
                            int n3 = 56816;
                            Class6322.method24332(0.87022936f, 0.109933674f);
                            return;
                        }
                        int n4 = 56817;
                        block9: while (true) {
                            switch (n4) {
                                case 56817: {
                                    n4 = 56815;
                                    continue block9;
                                }
                                case 56816: {
                                    a2 -= 180.0f;
                                    break block9;
                                }
                            }
                            break;
                        }
                        d2.method10();
                        d2.method295(a2);
                    }
                }
                break;
            }
        }
    }

    @Class1
    public void method9613(Class91 b2) {
        if (this.method9618()) {
            float a2 = this.method9636(Class442.field290.field_1724.method_36454());
            if (this.method9631(a2)) {
                return;
            }
            Class442.method9622(field290).method_5728((boolean)field2214[0]);
        }
    }

    public static Class442 method9614() {
        return INSTANCE;
    }

    private static class_6880 method9615() {
        return Class442.method9649();
    }

    public static class_746 method9616(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method9617(Class248 class248) {
        return class248.method507();
    }

    private boolean method9618() {
        if (this.field2217.method507() == Class548.field2711) {
            return (int)field2214[2] != 0;
        }
        if (((Boolean)Class442.method9607(Class442.method9609(this))).booleanValue()) {
            if (Class5659.method22193(0.3)) {
                return (int)field2214[2] != 0;
            }
        }
        if (Class1807.method15753() && !Class442.field290.field_1724.method_5715() && !Class442.field290.field_1724.method_3144()) {
            if (!Class442.method9627(field290).method_6128()) {
                return Class3979.method19543();
            }
        }
        return (int)field2214[2] != 0;
    }

    private static int method9619(int n2, int n3, Class3957 class3957, Class315 class315) {
        return Class3546.method17825(n2, n3, class3957, class315);
    }

    private static float method9620() {
        return Class6322.method24324();
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)this.field2217.method507());
    }

    public static class_304 method9621(class_315 class_3152) {
        return class_3152.field_1894;
    }

    public static class_746 method9622(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class548 method9623() {
        return Class548.field2713;
    }

    private static boolean method9624() {
        return Class3979.method19539();
    }

    @Class1
    public void method9625(Class210 a2) {
        if (this.method9618()) {
            if (this.field2217.method507() == Class548.field2715) {
                Class4036.method20085(0.78145534f, 0.31108612f, 0.73594993f, Class5629.field10763, 0.11649984f, 0.65320885f);
                return;
            }
            if (Class442.method9597(this).method507() == Class548.field2712) {
                this.method6465(this.method9636(Class442.method9600(field290).method_36454()), Class442.field290.field_1724.method_36455());
            }
        }
    }

    private static class_746 method9626(class_310 class_3102) {
        return Class442.method9616(class_3102);
    }

    public static class_746 method9627(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method9628() {
        return Class3979.method19551();
    }

    private static float method9629() {
        return Class6322.method24325();
    }

    public static class_746 method9630(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private boolean method9631(float a2) {
        if (this.field2217.method507() == Class548.field2715) {
            return (class_3532.method_15356((float)a2, (float)Class5723.field11049.method12027()) > 0.0f ? (int)field2214[0] : (int)field2214[2]) != 0;
        }
        if (this.field2217.method507() == Class548.field2712 || Class442.method9642(this).method507() == Class442.method9623()) {
            return (Class442.field290.field_1724.field_3913.field_3905 <= 1.0E-5f || Class442.field290.field_1724.field_5976 && !Class442.field290.field_1724.field_34927 ? (int)field2214[0] : (int)field2214[2]) != 0;
        }
        return (int)field2214[2] != 0;
    }

    private static void method9632(long l2) {
        Class442.field2214[2] = l2 ^ 0x5003F049EA57FAF8L;
        Class442.field2214[1] = l2 ^ 0x5003F049EA57FA96L;
        Class442.field2214[0] = l2 ^ 0x5003F049EA57FAF9L;
    }

    private static void method9633(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method9634(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class548 method9635() {
        return Class548.field2715;
    }

    /*
     * Unable to fully structure code
     */
    public float method9636(float a) {
        block17: {
            block20: {
                block18: {
                    block16: {
                        block19: {
                            b = Class442.method9621(Class442.field290.field_1690).method_1434();
                            c = Class442.field290.field_1690.field_1881.method_1434();
                            d = Class442.field290.field_1690.field_1913.method_1434();
                            e = Class442.field290.field_1690.field_1849.method_1434();
                            if (!b) break block18;
                            if (c) break block19;
                            v0 = 40702;
                            ** GOTO lbl14
                        }
                        v0 = 40703;
                        if (true) ** GOTO lbl14
                        do {
                            v0 = var6_6 = 40701;
lbl14:
                            // 3 sources

                            if (var6_6 == 40702) break block16;
                        } while (var6_6 == 40703);
                        break block18;
                    }
                    if (d) {
                        v1 = 63180;
                        return Class5659.method22208();
                    }
                    v2 = 63181;
                    if (true) ** GOTO lbl25
                    block5: while (true) {
                        v2 = 63179;
lbl25:
                        // 2 sources

                        switch (v2) {
                            case 63181: {
                                continue block5;
                            }
                            case 63180: {
                                if (!e) {
                                    a -= 45.0f;
                                    break block5;
                                }
                            }
                            default: {
                                if (e) {
                                    if (d) break block5;
                                    a += 45.0f;
                                    break block5;
                                }
                                break block17;
                            }
                        }
                        break;
                    }
                    break block17;
                }
                if (!c || b) break block20;
                a += 180.0f;
                if (d && !e) {
                    a += 45.0f;
                } else if (e) {
                    if (d) {
                        return Class6023.method23744(Class1451.field5529, 0.7745353f, 0.334251f);
                    }
                    a -= 45.0f;
                }
                break block17;
            }
            if (!d) ** GOTO lbl-1000
            if (!e) {
                a -= 90.0f;
            } else if (e && !d) {
                a += Class3795.field8592;
            }
        }
        return class_3532.method_15393((float)a);
    }

    private static boolean method9637() {
        return Class1807.method15769();
    }

    private static float method9638() {
        return Class6322.method24325();
    }

    private static float method9639() {
        return Class6322.method24325();
    }

    private static float method9640() {
        return Class5659.method22208();
    }

    public static Class248 method9641(Class442 class442) {
        return class442.field2217;
    }

    public static Class248 method9642(Class442 class442) {
        return class442.field2217;
    }

    private static int method9643(int n2, int n3, Class615 class615, Class255 class255) {
        return Class3546.method17807(n2, n3, class615, class255);
    }

    private static float method9644() {
        return Class5659.method22208();
    }

    public static float method9645(class_744 class_7442) {
        return class_7442.field_3905;
    }

    private static float method9646() {
        return Class6322.method24337();
    }

    private static boolean method9647() {
        return Class5659.method22111();
    }

    private static float method9648(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    public static class_6880 method9649() {
        return class_1294.field_5919;
    }

    private static boolean method9650(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

