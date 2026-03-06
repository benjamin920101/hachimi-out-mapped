/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class1004;
import mapped.Class1580;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class396;
import mapped.Class3979;
import mapped.Class4045;
import mapped.Class436;
import mapped.Class5659;
import mapped.Class570;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class889;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4056 {
    private static long[] field9359 = new long[2];
    public double field9360 = 0.0;
    public class_243 field9361;
    public class_243 field9362;

    public static Class248 method20106(Class436 class436) {
        return class436.field2165;
    }

    public static Class248 method20107(Class436 class436) {
        return class436.field2148;
    }

    private static Color method20108(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    private static Object method20109(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method20110(Class436 class436) {
        return class436.field2161;
    }

    private static void method20111() {
        Class5659.method22184();
    }

    private static void method20112(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method20113(Class4056 class4056, class_243 class_2432) {
        class4056.field9361 = class_2432;
    }

    private static Object method20114(Class248 class248) {
        return class248.method507();
    }

    private static void method20115() {
        Class5836.method22885();
    }

    private static void method20116() {
        Class3979.method19561();
    }

    public static class_243 method20117(Class4056 class4056) {
        return class4056.field9362;
    }

    private static void method20118() {
        Class1745.method15538();
    }

    public static Class248 method20119(Class436 class436) {
        return class436.field2129;
    }

    public static Class248 method20120(Class436 class436) {
        return class436.field2165;
    }

    private static void method20121(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method20122(Class248 class248) {
        return class248.method507();
    }

    private static void method20123() {
        Class6009.method23560();
    }

    private static Object method20124(Class248 class248) {
        return class248.method507();
    }

    private static void method20125(float f2) {
        Class5836.method22907(f2);
    }

    private static void method20126(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    private static void method20127(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method20128(Class248 class248) {
        return class248.method507();
    }

    private static void method20129(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method20130() {
        Class5836.method22890();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method20131(Class59 e2) {
        block29: {
            StringBuilder a2;
            Class436 f2;
            block28: {
                block31: {
                    double d2;
                    block32: {
                        block27: {
                            int n2;
                            block30: {
                                class_2338 b2;
                                f2 = Class436.method9338();
                                if (!((Boolean)Class4056.method20110(f2).method507()).booleanValue()) break block29;
                                Class6009.method23560();
                                a2 = new StringBuilder();
                                if (((Boolean)Class4056.method20122(Class4056.method20120(f2))).booleanValue()) {
                                    if (((Boolean)f2.field2151.method507()).booleanValue()) {
                                        int n3 = 39789;
                                        Class4056.method20130();
                                        return;
                                    }
                                    int n4 = 39790;
                                    block12: while (true) {
                                        switch (n4) {
                                            case 39790: {
                                                n4 = 39788;
                                                continue block12;
                                            }
                                            case 39789: {
                                                a2.append(Class1004.method12743(f2.field2135, (int)field9359[1]));
                                                break block12;
                                            }
                                        }
                                        break;
                                    }
                                    if (((Boolean)f2.field2151.method507()).booleanValue() && ((Boolean)f2.field2132.method507()).booleanValue()) {
                                        a2.append("/");
                                    }
                                    if (((Boolean)f2.field2132.method507()).booleanValue()) {
                                        a2.append(Class1004.method12743(f2.field2145, (int)field9359[1]));
                                    }
                                }
                                if ((b2 = f2.field2166) != null) {
                                    this.field9362 = b2.method_46558();
                                }
                                if (this.field9362 == null) {
                                    return;
                                }
                                if (!((Double)f2.field2128.method507() >= 1.0)) break block30;
                                this.field9360 = !f2.field2141.method12595((long)((Double)f2.field2163.method507() * 1000.0)) ? 0.5 : 0.0;
                                break block31;
                            }
                            int n5 = f2.field2141.method12595((long)((Double)Class4056.method20124(f2.field2163) * 1000.0)) ? 35288 : 35289;
                            while ((n2 = n5) != 35288) {
                                if (n2 == 35289) {
                                    n5 = 35287;
                                    continue;
                                }
                                break block27;
                            }
                            d2 = 0.0;
                            break block32;
                        }
                        d2 = 0.5;
                    }
                    this.field9360 = Class396.method5737(this.field9360, d2, (Double)f2.field2128.method507() / Class1580.field5899);
                }
                if (this.field9360 == 0.0) {
                    this.field9361 = null;
                    return;
                }
                int n6 = this.field9361 != null ? 3708 : 3709;
                block14: while (true) {
                    switch (n6) {
                        case 3709: {
                            n6 = 3707;
                            continue block14;
                        }
                        case 3708: {
                            if (!((Double)f2.field2148.method507() >= 1.0)) break block14;
                        }
                        default: {
                            Class4056.method20113(this, Class4056.method20117(this));
                            break block28;
                        }
                    }
                    break;
                }
                this.field9361 = new class_243(Class396.method5737(this.field9361.field_1352, this.field9362.field_1352, (Double)Class4056.method20114(f2.field2148) / 10.0), Class396.method5737(this.field9361.field_1351, this.field9362.field_1351, (Double)Class4056.method20107(f2).method507() / Class889.field3822), Class396.method5737(this.field9361.field_1350, this.field9362.field_1350, (Double)f2.field2148.method507() / 10.0));
            }
            class_238 c2 = new class_238(this.field9361, this.field9361);
            c2 = (Boolean)Class4056.method20109(f2.field2154) != false ? c2.method_1014(this.field9360) : c2.method_1014(0.5);
            class_4587 d3 = e2.method125();
            if (((Class570)((Object)f2.field2129.method507())).method11085()) {
                Class4056.method20126(d3, c2, Class4056.method20108((Color)f2.field2160.method507(), (int)((double)((Color)f2.field2160.method507()).getAlpha() * this.field9360 * 2.0)).getRGB());
            }
            if (((Class570)((Object)Class4056.method20128(Class4056.method20119(f2)))).method11087()) {
                Class6454.method24605(d3, c2, ((Float)f2.field2130.method507()).floatValue(), Class4045.method20088((Color)f2.field2133.method507(), (int)((double)((Color)f2.field2133.method507()).getAlpha() * this.field9360 * 2.0)).getRGB());
            }
            if (((Boolean)Class4056.method20106(f2).method507()).booleanValue() && this.field9361 != null) {
                int n7 = f2.field2141.method12595((long)((Double)f2.field2163.method507() * 1000.0)) ? 21878 : 21877;
                block15: while (true) {
                    switch (n7) {
                        case 21878: {
                            n7 = 21876;
                            continue block15;
                        }
                        case 21877: {
                            Class6454.method24598(a2.toString(), this.field9361, new Color((int)field9359[0], (int)field9359[0], (int)field9359[0], (int)(255.0 * this.field9360 * 2.0)).getRGB());
                            break block15;
                        }
                    }
                    break;
                }
            }
        }
        Class6009.method23561();
    }

    static {
        Class4056.method20132(-4001298516229146999L);
    }

    private static void method20132(long l2) {
        Class4056.field9359[0] = l2 ^ 0xC878883303DD3676L;
        Class4056.field9359[1] = l2 ^ 0xC878883303DD3688L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

