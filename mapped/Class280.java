/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1656
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4970$class_4971
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class131;
import mapped.Class1387;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1792;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class303;
import mapped.Class3540;
import mapped.Class3821;
import mapped.Class3834;
import mapped.Class390;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class477;
import mapped.Class4971;
import mapped.Class519;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5707;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class587;
import mapped.Class5910;
import mapped.Class6009;
import mapped.Class6286;
import mapped.Class6322;
import mapped.Class633;
import mapped.Class6454;
import mapped.Class668;
import mapped.Class941;
import net.hachimi.client.mixin.bH;
import net.minecraft.class_1297;
import net.minecraft.class_1656;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4970;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class280
extends Class278 {
    Class248 field415;
    private boolean field416;
    Class248 field417;
    Class248 field418 = this.method450(new Class260("Mode", "The mode for vanilla flight", Class633.field3094, Class633.values()));
    Class248 field419;
    private int field420;
    Class248 field421;
    Class248 field422;
    private double field423;
    private static long[] field424 = new long[3];
    private boolean field425;
    private double field426;
    Class248 field427;
    private static Class280 INSTANCE;

    private boolean method1315(class_1297 a2) {
        return a2.method_37908().method_29546(a2.method_5829().method_1014(Class5910.field11708).method_1012(0.0, -0.55, 0.0)).allMatch(class_4970.class_4971::method_26215);
    }

    private static void method1316(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method1317(Class248 class248) {
        return class248.method507();
    }

    private static void method1318() {
        Class5836.method22897();
    }

    private static void method1319() {
        Class5836.method22897();
    }

    private static void method1320() {
        Class6454.method24594();
    }

    private static void method1321() {
        Class4146.method20697();
    }

    public static class_746 method1322(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1323(Class210 f2) {
        block24: {
            int n2;
            if (!((Boolean)Class280.method1381(this.field415)).booleanValue()) {
                this.field423 = ((Float)this.field417.method507()).floatValue();
            } else {
                int n3 = !Class1807.method15742() ? 10825 : 10824;
                block4: while (true) {
                    switch (n3) {
                        case 10825: {
                            n3 = 10823;
                            continue block4;
                        }
                        case 10824: {
                            if (!Class280.method1359((class_310)Class280.field290).field_5976) break block4;
                        }
                        default: {
                            this.field423 = 0.0;
                        }
                    }
                    break;
                }
                this.field423 = Class280.method1350(this) + (double)((Float)this.field419.method507()).floatValue();
                if (Class280.method1349(this) > (double)((Float)this.field427.method507()).floatValue()) {
                    this.field423 = ((Float)Class280.method1332(this).method507()).floatValue();
                    Class1807.method15744();
                    return;
                }
            }
            if (Class280.method1333(Class280.method1346())) {
                if (this.field418.method507() != Class633.field3093) {
                    return;
                }
                this.method1368();
                return;
            }
            if (!((Class633)((Object)this.field418.method507())).equals((Object)Class633.field3093)) {
                this.method1368();
            } else {
                this.method1340();
                Class280.field290.field_1724.method_31549().method_7248((float)(this.field423 * (double)0.05f));
            }
            int g2 = (int)field424[0];
            if (this.field425) {
                this.field420 += (int)field424[2];
                if (this.field420 >= (int)field424[1]) {
                    if (this.field421.method507() == Class519.field2566) {
                        this.field416 = (int)field424[2];
                    } else if (Class280.method1343(this.field421) == Class519.field2568) {
                        Class280.field290.field_1724.method_5814(Class280.field290.field_1724.method_23317(), Class280.field290.field_1724.method_23318() - 0.0313, Class280.field290.field_1724.method_23321());
                        if (Class280.method1372(this.field418) == Class633.field3093) {
                            this.method1368();
                            Class280.method1367(Class5723.field11052, 0.0);
                            g2 = (int)field424[2];
                        }
                    }
                    this.field420 = (int)field424[0];
                    this.field425 = (int)field424[0];
                }
            }
            if (this.field418.method507() != Class633.field3094) return;
            Class5723.field11052.method14002(0.0);
            if (!Class280.field290.field_1690.field_1903.method_1434()) {
                int n4 = 6961;
                Class6009.method23559(true);
                return;
            }
            int n5 = 6960;
            while ((n2 = n5) != 6960) {
                if (n2 == 6961) {
                    n5 = 6959;
                    continue;
                }
                break block24;
            }
            if (g2 == 0) {
                Class5723.field11052.method14002(((Float)this.field422.method507()).floatValue());
                Class1668.method15147(566256715, 1934332031, -646950797, -186404251);
                return;
            }
        }
        if (Class280.field290.field_1690.field_1832.method_1434()) {
            Class5723.field11052.method14002(-((Float)this.field422.method507()).floatValue());
        }
        this.field423 = Math.max(this.field423, (double)0.2873f);
        float a2 = Class280.method1371(Class280.field290.field_1724.field_3913);
        float b2 = Class280.field290.field_1724.field_3913.field_3907;
        float c2 = Class280.field290.field_1724.method_36454();
        if (a2 == 0.0f && b2 == 0.0f) {
            Class5723.field11052.method14005(0.0, 0.0);
            return;
        }
        double d2 = Math.cos(Math.toRadians(c2 + 90.0f));
        double e2 = Math.sin(Math.toRadians(c2 + 90.0f));
        Class280.method1374(Class5723.field11052, (double)a2 * this.field423 * d2 + (double)b2 * this.field423 * e2, (double)a2 * Class280.method1339(this) * e2 - (double)b2 * this.field423 * d2);
    }

    private static void method1324(long l2) {
        Class280.method1370(l2);
    }

    private static int method1325(int n2, int n3, Class303 class303, Class941 class941) {
        return Class668.method11534(n2, n3, class303, class941);
    }

    @Class1
    public void method1326(Class131 d2) {
        if (Class280.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = d2.method251();
        if (class_25962 instanceof class_2828) {
            class_2828 c2 = (class_2828)class_25962;
            if (this.field421.method507() != Class519.field2564) {
                double b2 = c2.method_12268(Double.NaN);
                if (!Double.isNaN(b2)) {
                    if (this.field416) {
                        ((bH)c2).hookSetY(this.field426 - 0.04);
                        this.field416 = (int)field424[0];
                        return;
                    }
                    this.field425 = this.method1338(c2);
                    Class280.method1335(this, b2);
                    return;
                }
                if (this.field416) {
                    class_2828.class_2830 a2 = c2.method_36172() ? new class_2828.class_2830(Class280.field290.field_1724.method_23317(), Class280.field290.field_1724.method_23318() - 0.04, Class280.field290.field_1724.method_23321(), Class280.field290.field_1724.method_36454(), Class280.field290.field_1724.method_36455(), c2.method_12273()) : new class_2828.class_2829(Class280.method1357(field290).method_23317(), Class280.field290.field_1724.method_23318() - 0.04, Class280.method1380(field290).method_23321(), c2.method_12273());
                    d2.method10();
                    Class280.method1348(Class5723.field11048, (class_2596)a2);
                    Class280.method1329(this, (boolean)field424[0]);
                }
            }
        }
    }

    static {
        Class280.method1324(-6916547495688292192L);
    }

    private Boolean method1269() {
        return (Boolean)this.field415.method507();
    }

    private static void method1327(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1328(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method1329(Class280 class280, boolean bl2) {
        class280.field416 = bl2;
    }

    private static void method1330(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1331() {
        Class5836.method22890();
    }

    public static Class248 method1332(Class280 class280) {
        return class280.field427;
    }

    private static boolean method1333(Class390 class390) {
        return class390.method5533();
    }

    private static void method1334() {
        Class6009.method23560();
    }

    public static void method1335(Class280 class280, double d2) {
        class280.field426 = d2;
    }

    public static class_746 method1336(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method1337(class_1656 class_16562, boolean bl2) {
        class_16562.field_7479 = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method1338(class_2828 a2) {
        int n2;
        double b2 = class_3532.method_15350((double)a2.method_12268(Class280.field290.field_1724.method_23318()), (double)-2.0E7, (double)2.0E7);
        double c2 = b2 - this.field426;
        if (c2 >= -0.03125 && !Class280.field290.field_1724.field_36331) {
            int n3 = this.method1315((class_1297)Class280.method1336(field290)) ? 37120 : 37121;
            block4: while (true) {
                switch (n3) {
                    case 37121: {
                        n3 = 37119;
                        continue block4;
                    }
                    case 37120: {
                        n2 = (int)field424[2];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field424[0];
        return n2 != 0;
    }

    public static double method1339(Class280 class280) {
        return class280.field423;
    }

    private void method1340() {
        Class280.field290.field_1724.method_31549().field_7478 = (int)field424[2];
        Class280.method1362(Class280.field290.field_1724.method_31549(), (boolean)field424[2]);
    }

    private Boolean method1278() {
        return (Boolean)this.field415.method507();
    }

    private static void method1341() {
        Class5659.method22184();
    }

    private static void method1342() {
        Class6009.method23561();
    }

    private static Object method1343(Class248 class248) {
        return class248.method507();
    }

    private static void method1344() {
        Class5836.method22890();
    }

    private static void method1345(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Class390 method1346() {
        return Class390.method5496();
    }

    private static void method1347(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1348(Class5496 class5496, class_2596 class_25962) {
        class5496.method21342(class_25962);
    }

    public Class280() {
        super("Flight", "Allows the player to fly in survival", Class556.field2752);
        this.field417 = this.method450(new Class252("Speed", "The horizontal flight speed", Float.valueOf(0.1f), Float.valueOf(2.5f), Float.valueOf(10.0f)));
        this.field422 = this.method450(new Class252("VerticalSpeed", "The vertical flight speed", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(5.0f)));
        this.field421 = this.method450(new Class260("AntiKick", "Prevents vanilla flight detection", Class519.field2568, Class519.values()));
        this.field415 = this.method450(new Class253("Accelerate", "Accelerate as you fly", (boolean)field424[0]));
        this.field419 = this.method450(new Class252("AccelerateSpeed", "Speed to accelerate as", (Number)Float.valueOf(0.01f), (Number)Float.valueOf(Class5707.field10993), (Number)Float.valueOf(1.0f), this::method1269));
        this.field427 = this.method450(new Class252("MaxSpeed", "Max speed to acceleratee to", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class3834.field8692), (Number)Float.valueOf(10.0f), this::method1278));
        INSTANCE = this;
    }

    public static double method1349(Class280 class280) {
        return class280.field423;
    }

    public static double method1350(Class280 class280) {
        return class280.field423;
    }

    private static void method1351() {
        Class6009.method23560();
    }

    public static Class280 method1352() {
        return INSTANCE;
    }

    public static void method1353(class_1656 class_16562, boolean bl2) {
        class_16562.field_7479 = bl2;
    }

    private static void method1354(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class280 method1355() {
        return Class280.method1352();
    }

    private static void method1356() {
        Class3979.method19561();
    }

    public static class_746 method1357(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1358() {
        Class4146.method20697();
    }

    public static class_746 method1359(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1360() {
        Class4146.method20694();
    }

    private static void method1361() {
        Class6454.method24594();
    }

    @Override
    public void method1279() {
        if (this.field418.method507() == Class633.field3093) {
            this.method1368();
        }
        this.field416 = (int)field424[0];
    }

    private static void method1362(class_1656 class_16562, boolean bl2) {
        Class280.method1337(class_16562, bl2);
    }

    private static void method1363() {
        Class5836.method22890();
    }

    private static Object method1364(Class248 class248) {
        return class248.method507();
    }

    private static void method1365() {
        Class3979.method19561();
    }

    private static void method1366(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1367(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method1368() {
        int n2 = !Class280.field290.field_1724.method_7337() ? 20093 : 20094;
        block4: while (true) {
            switch (n2) {
                case 20094: {
                    n2 = 20092;
                    continue block4;
                }
                case 20093: {
                    Class280.field290.field_1724.method_31549().field_7478 = (int)field424[0];
                    break block4;
                }
            }
            break;
        }
        Class280.method1353(Class280.field290.field_1724.method_31549(), (boolean)field424[0]);
        Class280.field290.field_1724.method_31549().method_7248(Class3540.field7837);
    }

    private static void method1369(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1370(long l2) {
        Class280.field424[0] = l2 ^ 0xA0037CB2B761B8A0L;
        Class280.field424[2] = l2 ^ 0xA0037CB2B761B8A1L;
        Class280.field424[1] = l2 ^ 0xA0037CB2B761B8B4L;
    }

    public static float method1371(class_744 class_7442) {
        return class_7442.field_3905;
    }

    private static Object method1372(Class248 class248) {
        return class248.method507();
    }

    private static void method1373() {
        Class1807.method15744();
    }

    @Override
    public void method1274() {
        if (Class280.method1364(this.field418) == Class633.field3093) {
            this.method1340();
        }
        this.field423 = 0.0;
    }

    private static void method1374(Class1387 class1387, double d2, double d3) {
        class1387.method14005(d2, d3);
    }

    private static int method1375(int n2, int n3, Class6286 class6286, Class3821 class3821) {
        return Class668.method11518(n2, n3, class6286, class3821);
    }

    private static int method1376(int n2, int n3, Class587 class587, Class477 class477) {
        return Class668.method11523(n2, n3, class587, class477);
    }

    private static void method1377() {
        Class298.method1924();
    }

    public static Class248 method1378(Class280 class280) {
        return class280.field418;
    }

    private static void method1379(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static class_746 method1380(class_310 class_3102) {
        return Class280.method1322(class_3102);
    }

    private static Object method1381(Class248 class248) {
        return class248.method507();
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)Class280.method1317(Class280.method1378(this)));
    }

    private static boolean method1382(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method1383(int n2, int n3, Class4971 class4971, Class1792 class1792) {
        return Class668.method11517(n2, n3, class4971, class1792);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

