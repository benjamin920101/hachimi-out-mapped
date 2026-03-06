/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1313
 *  net.minecraft.class_1531
 *  net.minecraft.class_241
 *  net.minecraft.class_2708
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_638
 *  net.minecraft.class_6880
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import java.util.Iterator;
import mapped.Class1;
import mapped.Class1004;
import mapped.Class108;
import mapped.Class1108;
import mapped.Class1137;
import mapped.Class1169;
import mapped.Class119;
import mapped.Class1205;
import mapped.Class1221;
import mapped.Class133;
import mapped.Class1387;
import mapped.Class1397;
import mapped.Class1405;
import mapped.Class1447;
import mapped.Class145;
import mapped.Class1468;
import mapped.Class1474;
import mapped.Class1503;
import mapped.Class1506;
import mapped.Class1566;
import mapped.Class1615;
import mapped.Class1668;
import mapped.Class1682;
import mapped.Class1739;
import mapped.Class1745;
import mapped.Class1788;
import mapped.Class1807;
import mapped.Class202;
import mapped.Class204;
import mapped.Class219;
import mapped.Class2191;
import mapped.Class222;
import mapped.Class227;
import mapped.Class231;
import mapped.Class246;
import mapped.Class248;
import mapped.Class25;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class280;
import mapped.Class298;
import mapped.Class301;
import mapped.Class3218;
import mapped.Class3257;
import mapped.Class3264;
import mapped.Class3314;
import mapped.Class335;
import mapped.Class3355;
import mapped.Class3393;
import mapped.Class3501;
import mapped.Class3586;
import mapped.Class365;
import mapped.Class3684;
import mapped.Class3688;
import mapped.Class37;
import mapped.Class3722;
import mapped.Class3737;
import mapped.Class3753;
import mapped.Class376;
import mapped.Class3786;
import mapped.Class383;
import mapped.Class3880;
import mapped.Class390;
import mapped.Class3979;
import mapped.Class4026;
import mapped.Class4036;
import mapped.Class4142;
import mapped.Class4146;
import mapped.Class425;
import mapped.Class4258;
import mapped.Class447;
import mapped.Class474;
import mapped.Class543;
import mapped.Class5441;
import mapped.Class5487;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5790;
import mapped.Class5836;
import mapped.Class5852;
import mapped.Class5887;
import mapped.Class5952;
import mapped.Class6009;
import mapped.Class6116;
import mapped.Class6124;
import mapped.Class620;
import mapped.Class623;
import mapped.Class6239;
import mapped.Class6259;
import mapped.Class626;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6409;
import mapped.Class6445;
import mapped.Class6454;
import mapped.Class68;
import mapped.Class724;
import mapped.Class914;
import mapped.Class926;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1531;
import net.minecraft.class_241;
import net.minecraft.class_2708;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class352
extends Class278 {
    private static final float field1037 = 159.077f;
    private boolean field1038;
    Class248 field1039;
    Class248 field1040;
    Class248 field1041;
    private boolean field1042;
    Class248 field1043 = this.method450(new Class260("Mode", "Speed mode", Class620.field3023, Class620.values()));
    Class248 field1044;
    private double field1045;
    private static Class352 INSTANCE;
    private static long[] field1046;
    private int field1047;
    Class248 field1048;
    private int field1049;
    Class248 field1050;
    private double field1051;
    private double field1052;
    private int field1053;
    private int field1054;
    Class248 field1055;

    private static void method3972() {
        Class1807.method15744();
    }

    public static boolean method3973(Class365 class365) {
        return class365.field1181;
    }

    public static int method3974(Class352 class352) {
        return class352.field1047;
    }

    private static void method3975(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method3976() {
        Class4146.method20697();
    }

    private static void method3977() {
        Class6009.method23560();
    }

    private static void method3978(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method3979(Class352 class352, double d2) {
        class352.field1051 = d2;
    }

    /*
     * Unable to fully structure code
     */
    public class_241 method3980(float a) {
        block3: {
            block2: {
                block4: {
                    b = Class352.method4269(Class352.field290.field_1724.field_3913);
                    c = Class352.field290.field_1724.field_3913.field_3907;
                    if (b != 0.0f) break block3;
                    if (c != 0.0f) break block4;
                    v0 = 25785;
                    ** GOTO lbl12
                }
                v0 = 25786;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 25784;
lbl12:
                    // 3 sources

                    if (var4_4 == 25785) break block2;
                } while (var4_4 == 25786);
                break block3;
            }
            return class_241.field_1340;
        }
        if (b != 0.0f && c != 0.0f) {
            b *= (float)Math.sin(0.7853981633974483);
            c *= (float)Math.cos(Class3393.field7380);
        }
        return new class_241((float)((double)(b * a) * -Math.sin(Math.toRadians(Class352.method4184(Class352.field290).method_36454())) + (double)(c * a) * Math.cos(Math.toRadians(Class352.field290.field_1724.method_36454()))), (float)((double)(b * a) * Math.cos(Math.toRadians(Class352.field290.field_1724.method_36454())) - (double)(c * a) * -Math.sin(Math.toRadians(Class352.method4228(Class352.field290).method_36454()))));
    }

    private static void method3981() {
        Class1807.method15744();
    }

    public static double method3982(Class352 class352) {
        return class352.field1052;
    }

    private static void method3983(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method3984(Class352 class352) {
        return class352.field1043;
    }

    public static double method3985(Class352 class352) {
        return class352.field1052;
    }

    public static double method3986(Class352 class352) {
        return class352.field1052;
    }

    private static void method3987() {
        Class1807.method15744();
    }

    private static int method3988(int n2, int n3, Class25 class25, Class3257 class3257) {
        return Class3218.method16051(n2, n3, class25, class3257);
    }

    private static void method3989() {
        Class3979.method19561();
    }

    public boolean method3990(class_1297 a2) {
        if (a2 != null && a2 != Class352.field290.field_1724 && a2 instanceof class_1309 && !(a2 instanceof Class1468) && !(a2 instanceof class_1531)) {
            int n2 = (int)field1046[5];
            return Class3979.method19544();
        }
        return (int)field1046[1] != 0;
    }

    private static void method3991(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method3992() {
        Class5836.method22885();
    }

    private static void method3993(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method3994() {
        Class5836.method22885();
    }

    private static void method3995() {
        Class1807.method15744();
    }

    public static void method3996(Class352 class352, int n2) {
        class352.field1047 = n2;
    }

    private static double method3997(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static int method3998(int n2, int n3, Class202 class202, Class37 class37) {
        return Class3218.method16035(n2, n3, class202, class37);
    }

    private static int method3999(int n2, int n3, Class1405 class1405, Class3684 class3684) {
        return Class3218.method16201(n2, n3, class1405, class3684);
    }

    private static boolean method4000(Class352 class352) {
        return Class352.method4148(class352);
    }

    public static int method4001(Class352 class352) {
        return class352.field1047;
    }

    public static Class620 method4002() {
        return Class620.field3020;
    }

    public static float method4003(class_241 class_2412) {
        return class_2412.field_1342;
    }

    public static Class248 method4004(Class352 class352) {
        return class352.field1039;
    }

    public static Class1387 method4005() {
        return Class5723.field11052;
    }

    private static void method4006() {
        Class1503.method14420();
    }

    private static void method4007() {
        Class6454.method24594();
    }

    private static Class335 method4008() {
        return Class335.method3077();
    }

    private static void method4009() {
        Class4146.method20697();
    }

    private static void method4010() {
        Class6009.method23561();
    }

    private static void method4011(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static int method4012(int n2, int n3, Class5441 class5441, Class219 class219) {
        return Class3218.method16122(n2, n3, class5441, class219);
    }

    private static void method4013(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public void method4014() {
        Class352.method4062(this, (int)field1046[2]);
        this.field1054 = (int)field1046[1];
        Class352.method4206(this, (int)field1046[1]);
        Class352.method4043(this, 0.0);
        Class352.method4057(this, 0.0);
        this.field1038 = (int)field1046[1];
    }

    private static void method4015(float f2) {
        Class5836.method22907(f2);
    }

    private static void method4016() {
        Class4146.method20694();
    }

    private static void method4017(Class335 class335, float f2) {
        class335.method3084(f2);
    }

    public static class_638 method4018(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method4019() {
        Class298.method1924();
    }

    private static void method4020(long l2) {
        Class352.method4124(l2);
    }

    private static void method4021(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Class352 method4022() {
        return Class352.method4182();
    }

    private static void method4023(Class204 class204, double d2) {
        class204.method386(d2);
    }

    private static void method4024() {
        Class3979.method19561();
    }

    private static void method4025(Class352 class352, int n2) {
        Class352.method4118(class352, n2);
    }

    private static void method4026(float f2) {
        Class5836.method22907(f2);
    }

    public static double method4027(Class352 class352) {
        return class352.field1052;
    }

    private static int method4028(int n2, int n3, Class5595 class5595, Class4258 class4258) {
        return Class3218.method16103(n2, n3, class5595, class4258);
    }

    private static void method4029(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4030() {
        Class6454.method24594();
    }

    private static void method4031() {
        Class1503.method14420();
    }

    private static void method4032() {
        Class5659.method22184();
    }

    private static boolean method4033() {
        return Class1807.method15742();
    }

    private static double method4034(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static void method4035() {
        Class5659.method22184();
    }

    private static void method4036() {
        Class5659.method22184();
    }

    public static void method4037(Class352 class352, double d2) {
        class352.field1045 = d2;
    }

    private static void method4038() {
        Class3979.method19561();
    }

    private static float method4039(class_241 class_2412) {
        return Class352.method4258(class_2412);
    }

    @Override
    public void method1279() {
        this.method4014();
        if (Class352.method4185().method1265()) {
            Class335.method3077().method3074();
            if (!this.field1042) {
                Class335.method3077().method1268();
            }
        }
    }

    private static class_746 method4040(class_310 class_3102) {
        return Class352.method4227(class_3102);
    }

    private static void method4041() {
        Class298.method1924();
    }

    private static double method4042(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    public static void method4043(Class352 class352, double d2) {
        class352.field1051 = d2;
    }

    public static Class248 method4044(Class352 class352) {
        return class352.field1039;
    }

    private static void method4045(Class204 class204, double d2) {
        class204.method391(d2);
    }

    private static int method4046(int n2, int n3, Class227 class227, Class3722 class3722) {
        return Class3218.method16031(n2, n3, class227, class3722);
    }

    private static boolean method4047(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method4048() {
        Class5836.method22890();
    }

    private static void method4049() {
        Class6454.method24594();
    }

    private static void method4050() {
        Class1503.method14420();
    }

    private static void method4051() {
        Class6009.method23560();
    }

    private static void method4052(Class335 class335, float f2) {
        class335.method3084(f2);
    }

    public static class_746 method4053(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method4054(Class352 class352, boolean bl2) {
        class352.field1042 = bl2;
    }

    private static double method4055(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    public static Class248 method4056(Class352 class352) {
        return class352.field1043;
    }

    public static void method4057(Class352 class352, double d2) {
        class352.field1052 = d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method4058() {
        int n2;
        if (this.method1265() && ((Boolean)Class352.method4044(this).method507()).booleanValue()) {
            n2 = (int)field1046[5];
            return n2 != 0;
        }
        n2 = (int)field1046[1];
        return n2 != 0;
    }

    public static boolean method4059(Class352 class352) {
        return class352.field1038;
    }

    private static double method4060(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static void method4061() {
        Class1807.method15744();
    }

    public static void method4062(Class352 class352, int n2) {
        class352.field1047 = n2;
    }

    public static Class620 method4063() {
        return Class620.field3019;
    }

    private static void method4064() {
        Class5659.method22184();
    }

    public static boolean method4065(Class352 class352) {
        return class352.field1038;
    }

    private static boolean method4066() {
        return Class1807.method15742();
    }

    private static void method4067(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method4068() {
        return Class1807.method15742();
    }

    private static void method4069(Class204 class204, double d2) {
        class204.method391(d2);
    }

    public static class_746 method4070(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4071() {
        Class298.method1924();
    }

    private static void method4072(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4073(Class68 a2) {
        int n2;
        if (a2.method140() != this.field1039) return;
        if (a2.method128() != Class543.field2691) return;
        int n3 = n2 = Class352.method4106(this) ? 61418 : 61419;
        if (n2 != 61418) {
            if (n2 != 61419) {
                Class352.method3993(0.67662066f, Class914.field3881);
                return;
            }
            Class6322.method24332(0.73115426f, 0.24310559f);
            return;
        }
        if (((Boolean)Class352.method4194(Class352.method4004(this))).booleanValue()) {
            this.field1042 = Class335.method3077().method1265();
            if (this.field1042) return;
            Class335.method3077().method1264();
            return;
        }
        if (!Class335.method3077().method1265()) {
            int n4 = 35113;
            Class352.method4147();
            return;
        }
        int n5 = 35112;
        block4: while (true) {
            switch (n5) {
                case 35113: {
                    n5 = 35111;
                    continue block4;
                }
                case 35112: {
                    Class352.method4008().method3074();
                    if (this.field1042) {
                        return;
                    }
                    Class335.method3077().method1268();
                    return;
                }
            }
            break;
        }
    }

    public static Class248 method4074(Class352 class352) {
        return class352.field1043;
    }

    private static void method4075(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    public static class_1313 method4076() {
        return class_1313.field_6308;
    }

    private static void method4077(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4078(Class352 class352, double d2) {
        Class352.method3979(class352, d2);
    }

    private static double method4079(Class352 class352) {
        return Class352.method3982(class352);
    }

    private static Object method4080(Class248 class248) {
        return class248.method507();
    }

    public static int method4081(Class352 class352) {
        return class352.field1047;
    }

    private static int method4082(int n2, int n3, Class447 class447, Class3586 class3586) {
        return Class3218.method16098(n2, n3, class447, class3586);
    }

    private static float method4083(class_241 class_2412) {
        return Class352.method4202(class_2412);
    }

    public static Class1387 method4084() {
        return Class5723.field11052;
    }

    private static Class335 method4085() {
        return Class335.method3077();
    }

    private static void method4086() {
        Class1745.method15538();
    }

    private static void method4087() {
        Class1745.method15538();
    }

    private static void method4088() {
        Class1807.method15744();
    }

    private static int method4089(int n2, int n3, Class5887 class5887, Class301 class301) {
        return Class3218.method16193(n2, n3, class5887, class301);
    }

    private static boolean method4090() {
        return Class1807.method15742();
    }

    private static class_746 method4091(class_310 class_3102) {
        return Class352.method4138(class_3102);
    }

    private static void method4092() {
        Class4146.method20694();
    }

    public static float method4093(class_744 class_7442) {
        return class_7442.field_3907;
    }

    private static void method4094(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method4095(Class352 class352) {
        return class352.method4174();
    }

    private static void method4096() {
        Class5836.method22897();
    }

    private static void method4097(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4098(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    @Class1
    public void method4099(Class63 h2) {
        if (h2.method128() == Class543.field2690) {
            this.field1049 = Class352.method4154(this) + (int)field1046[5];
            if (this.field1049 > (Integer)Class352.method4144(this.field1040)) {
                Class352.method4116(this, 0.0);
            }
            double f2 = Class352.method4257(field290).method_23317() - Class352.field290.field_1724.field_6014;
            double g2 = Class352.field290.field_1724.method_23321() - Class352.field290.field_1724.field_5969;
            this.field1052 = Math.sqrt(f2 * f2 + g2 * g2);
            if (this.field1043.method507() == Class620.field3022 && Class352.method4066()) {
                int e2 = (int)field1046[1];
                Iterator iterator = Class352.field290.field_1687.method_18112().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        Class6454.method24594();
                        return;
                    }
                    class_1297 a2 = (class_1297)iterator.next();
                    if (!this.method3990(a2)) continue;
                    if (!(class_3532.method_15355((float)((float)Class352.field290.field_1724.method_5858(a2))) <= ((Float)this.field1041.method507()).floatValue())) continue;
                    ++e2;
                }
            }
        }
    }

    @Override
    public String method1248() {
        if (this.field1043.method507() == Class620.field3022) {
            return "Grim";
        }
        return Class5587.method21919((Enum)this.field1043.method507());
    }

    private static Object method4100(Class248 class248) {
        return class248.method507();
    }

    private static void method4101(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method4102() {
        Class298.method1924();
    }

    private static int method4103(int n2, int n3, Class231 class231, Class3786 class3786) {
        return Class3218.method16055(n2, n3, class231, class3786);
    }

    public void method4104() {
        Class352 class352 = this;
        if (Class352.method4000(this)) {
            Class6454.method24636(0.5194890322138348, 0.4262970171127638, 0.44440719331752054, Class1474.field5586);
            return;
        }
        int n2 = (int)field1046[5];
        Class1745.method15538();
    }

    private static void method4105() {
        Class5836.method22885();
    }

    private static boolean method4106(Class352 class352) {
        return class352.method4174();
    }

    public static void method4107(Class352 class352, double d2) {
        class352.field1051 = d2;
    }

    private static void method4108() {
        Class1745.method15538();
    }

    public static Class352 method4109() {
        return Class352.method4022();
    }

    private static boolean method4110() {
        return Class447.method10252();
    }

    private static void method4111() {
        Class6009.method23561();
    }

    private static float method4112(class_241 class_2412) {
        return Class352.method4003(class_2412);
    }

    private static void method4113(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static boolean method4114(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static class_638 method4115(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method4116(Class352 class352, double d2) {
        Class352.method4037(class352, d2);
    }

    public static float method4117(class_241 class_2412) {
        return class_2412.field_1342;
    }

    public static void method4118(Class352 class352, int n2) {
        class352.field1047 = n2;
    }

    private static Object method4119(Class248 class248) {
        return class248.method507();
    }

    private static void method4120(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Opcode count of 13500 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     * Unable to fully structure code
     */
    @Class1
    public void method4121(Class204 C) {
        block102: {
            block133: {
                block130: {
                    block132: {
                        block131: {
                            block124: {
                                block129: {
                                    block126: {
                                        block128: {
                                            block127: {
                                                block125: {
                                                    block117: {
                                                        block119: {
                                                            block121: {
                                                                block123: {
                                                                    block101: {
                                                                        block122: {
                                                                            block120: {
                                                                                block118: {
                                                                                    block116: {
                                                                                        block114: {
                                                                                            block115: {
                                                                                                block107: {
                                                                                                    block110: {
                                                                                                        block113: {
                                                                                                            block112: {
                                                                                                                block111: {
                                                                                                                    block109: {
                                                                                                                        block100: {
                                                                                                                            block108: {
                                                                                                                                block106: {
                                                                                                                                    block104: {
                                                                                                                                        block105: {
                                                                                                                                            block99: {
                                                                                                                                                block103: {
                                                                                                                                                    if (Class352.field290.field_1724 == null || Class352.field290.field_1687 == null) break block102;
                                                                                                                                                    if (C.method384() != Class352.method4219()) break block103;
                                                                                                                                                    v0 = 45825;
                                                                                                                                                    ** GOTO lbl10
                                                                                                                                                }
                                                                                                                                                v0 = 45826;
                                                                                                                                                if (true) ** GOTO lbl10
                                                                                                                                                do {
                                                                                                                                                    v0 = var2_2 = 45824;
lbl10:
                                                                                                                                                    // 3 sources

                                                                                                                                                    if (var2_2 == 45825) break block99;
                                                                                                                                                } while (var2_2 == 45826);
                                                                                                                                                break block102;
                                                                                                                                            }
                                                                                                                                            if (!Class1807.method15742()) break block104;
                                                                                                                                            if (Class280.method1355().method1265()) {
                                                                                                                                                Class4146.method20694();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (Class383.method5143().method1265() || Class390.method5496().method5533()) break block104;
                                                                                                                                            if (!Class352.method4135().method1265()) break block105;
                                                                                                                                            if (!Class352.method4123(Class365.method4718())) break block104;
                                                                                                                                        }
                                                                                                                                        if (Class352.field290.field_1724.method_31549().field_7479 || Class352.field290.field_1724.method_3144()) break block104;
                                                                                                                                        if (Class352.field290.field_1724.method_6128() || Class352.field290.field_1724.method_21754() || Class352.field290.field_1724.field_6017 > 2.0f) break block104;
                                                                                                                                        if (!Class352.field290.field_1724.method_5771() && !Class352.method4134(Class352.field290).method_5799() || ((Boolean)this.field1050.method507()).booleanValue()) break block106;
                                                                                                                                    }
                                                                                                                                    this.method4014();
                                                                                                                                    Class352.method4241(Class335.method3077(), 1.0f);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                C.method10();
                                                                                                                                y = 1.0;
                                                                                                                                z = 1.0;
                                                                                                                                if (Class352.field290.field_1724.method_6059(class_1294.field_5904)) {
                                                                                                                                    a = Class352.field290.field_1724.method_6112(class_1294.field_5904).method_5578();
                                                                                                                                    y = 1.0 + 0.2 * (a + 1.0);
                                                                                                                                }
                                                                                                                                if (Class352.field290.field_1724.method_6059(class_1294.field_5909)) {
                                                                                                                                    b = Class352.field290.field_1724.method_6112(class_1294.field_5909).method_5578();
                                                                                                                                    z = 1.0 + 0.2 * (b + 1.0);
                                                                                                                                }
                                                                                                                                A = 0.2872999906539917 * y / z;
                                                                                                                                B = 0.0f;
                                                                                                                                if (Class352.field290.field_1724.method_6059(Class352.method4250())) {
                                                                                                                                    B += (float)(Class352.field290.field_1724.method_6112(class_1294.field_5913).method_5578() + (int)Class352.field1046[5]) * 0.1f;
                                                                                                                                }
                                                                                                                                if (Class352.method4157(this.field1043) != Class620.field3023 && this.field1043.method507() != Class620.field3024) break block107;
                                                                                                                                if (!Class5723.field11056.method14268(Class352.field1046[8])) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                if (!((Boolean)this.field1039.method507()).booleanValue()) {
                                                                                                                                    Class1108.method12918(true);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                Class335.method3077().method3084(1.0888f);
                                                                                                                                if (this.field1047 != (int)Class352.field1046[5]) break block108;
                                                                                                                                v1 = 16829;
                                                                                                                                ** GOTO lbl58
                                                                                                                            }
                                                                                                                            v1 = 16830;
                                                                                                                            if (true) ** GOTO lbl58
                                                                                                                            do {
                                                                                                                                v1 = var10_7 = 16828;
lbl58:
                                                                                                                                // 3 sources

                                                                                                                                if (var10_7 == 16829) break block100;
                                                                                                                            } while (var10_7 == 16830);
                                                                                                                            break block109;
                                                                                                                        }
                                                                                                                        Class352.method4078(this, 1.350000023841858 * A - Class6124.field12383);
                                                                                                                        break block110;
                                                                                                                    }
                                                                                                                    if (this.field1047 == (int)Class352.field1046[7]) {
                                                                                                                        if (Class352.method4224(Class352.method4251(Class352.field290.field_1724)) || !Class352.field290.field_1724.method_24828()) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (Class352.method4248(this).method507() == Class620.field3024) {
                                                                                                                            v2 = 0.4f;
                                                                                                                            Class6009.method23561();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        c = 0.39999995f + B;
                                                                                                                        C.method391(c);
                                                                                                                        Class5723.field11052.method14002(c);
                                                                                                                        this.field1051 *= this.field1043.method507() == Class620.field3024 ? Class6445.field13383 : (Class352.method4065(this) ? 1.6835 : Class3355.field7267);
                                                                                                                        Class352.method3976();
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    if (this.field1047 != (int)Class352.field1046[6]) break block111;
                                                                                                                    d = Class6116.field12358 * (this.field1052 - A);
                                                                                                                    this.field1051 = Class352.method3985(this) - d;
                                                                                                                    if (Class352.method4059(this)) {
                                                                                                                        Class298.method1924();
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    this.field1038 = (int)Class352.field1046[5];
                                                                                                                    break block110;
                                                                                                                }
                                                                                                                if (!Class352.field290.field_1687.method_8587((class_1297)Class352.field290.field_1724, Class352.method4040(Class352.field290).method_5829().method_989(0.0, Class352.field290.field_1724.method_18798().method_10214(), 0.0))) break block112;
                                                                                                                if (!Class352.field290.field_1724.field_5992) break block113;
                                                                                                            }
                                                                                                            if (Class352.method3974(this) > 0) {
                                                                                                                this.field1047 = Class352.method4068() != false ? (int)Class352.field1046[5] : (int)Class352.field1046[1];
                                                                                                            }
                                                                                                        }
                                                                                                        this.field1051 = this.field1052 - this.field1052 / Class3264.field7005;
                                                                                                    }
                                                                                                    this.field1051 = Math.max(this.field1051, A);
                                                                                                    if (((Boolean)Class352.method4155(this.field1044)).booleanValue()) {
                                                                                                        this.field1051 += this.field1045;
                                                                                                    }
                                                                                                    e = this.method4197((float)this.field1051);
                                                                                                    C.method386(e.field_1343);
                                                                                                    C.method389(Class352.method4083(e));
                                                                                                    this.field1047 += (int)Class352.field1046[5];
                                                                                                    break block102;
                                                                                                }
                                                                                                if (this.field1043.method507() != Class620.field3017) break block114;
                                                                                                if (!Class352.method4129(Class5723.field11056, Class352.field1046[8])) {
                                                                                                    return;
                                                                                                }
                                                                                                if (((Boolean)Class352.method4204(this).method507()).booleanValue()) {
                                                                                                    if (((Boolean)this.field1055.method507()).booleanValue()) {
                                                                                                        this.field1053 += (int)Class352.field1046[5];
                                                                                                        if (this.field1053 > (int)Class352.field1046[0]) {
                                                                                                            this.field1053 = (int)Class352.field1046[1];
                                                                                                        }
                                                                                                        f = 1.0f + (float)this.field1053 / 100.0f;
                                                                                                        Class352.method4052(Class352.method4253(), Math.max(1.0f, f));
                                                                                                    } else {
                                                                                                        Class335.method3077().method3084(1.0888f);
                                                                                                    }
                                                                                                }
                                                                                                if (this.field1047 == (int)Class352.field1046[5]) {
                                                                                                    this.field1051 = Class1137.field4560 * A - Class1169.field4657;
                                                                                                } else if (this.field1047 == (int)Class352.field1046[7]) {
                                                                                                    if (Class352.field290.field_1724.field_3913.field_3904 || !Class352.field290.field_1724.method_24828()) {
                                                                                                        return;
                                                                                                    }
                                                                                                    g = 0.39999995f + B;
                                                                                                    C.method391(g);
                                                                                                    Class352.method4113(Class352.method4205(), g);
                                                                                                    v3 = this;
                                                                                                    Class352.method4107(v3, v3.field1051 * 2.149);
                                                                                                } else {
                                                                                                    if (this.field1047 != (int)Class352.field1046[6]) {
                                                                                                        Class5836.method22907(0.52116394f);
                                                                                                        return;
                                                                                                    }
                                                                                                    h = 0.66 * (Class352.method4079(this) - A);
                                                                                                    this.field1051 = this.field1052 - h;
                                                                                                }
                                                                                                this.field1054 += (int)Class352.field1046[5];
                                                                                                this.field1051 = Math.max(this.field1051, A);
                                                                                                if (!((Boolean)this.field1039.method507()).booleanValue()) {
                                                                                                    Class5836.method22890();
                                                                                                    return;
                                                                                                }
                                                                                                Class352.method4195(Class335.method3077(), Class6239.field12739);
                                                                                                i = 0.465 * y / z;
                                                                                                j = 0.44 * y / z;
                                                                                                this.field1051 = Math.min(this.field1051, this.field1054 > (int)Class352.field1046[11] ? i : j);
                                                                                                if (!((Boolean)this.field1044.method507()).booleanValue()) break block115;
                                                                                                v4 = 22103;
                                                                                                ** GOTO lbl150
                                                                                            }
                                                                                            v4 = 22104;
                                                                                            if (true) ** GOTO lbl150
                                                                                            block22: while (true) {
                                                                                                v4 = 22102;
lbl150:
                                                                                                // 3 sources

                                                                                                switch (v4) {
                                                                                                    case 22104: {
                                                                                                        continue block22;
                                                                                                    }
                                                                                                    case 22103: {
                                                                                                        this.field1051 += this.field1045;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            if (this.field1054 > (int)Class352.field1046[10]) {
                                                                                                this.field1054 = (int)Class352.field1046[1];
                                                                                            }
                                                                                            k = this.method4197((float)this.field1051);
                                                                                            C.method386(k.field_1343);
                                                                                            C.method389(Class352.method4112(k));
                                                                                            this.field1047 += (int)Class352.field1046[5];
                                                                                            break block102;
                                                                                        }
                                                                                        if (this.field1043.method507() != Class620.field3025) break block116;
                                                                                        if (!Class352.method4254().method14268(Class352.field1046[8])) {
                                                                                            return;
                                                                                        }
                                                                                        if (((Boolean)this.field1039.method507()).booleanValue()) {
                                                                                            Class352.method4017(Class352.method4085(), 1.0888f);
                                                                                        }
                                                                                        if (Class1004.method12743(Class352.field290.field_1724.method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) == Class1004.method12743(0.4, (int)Class352.field1046[6])) {
                                                                                            Class5723.field11052.method14002(0.31 + (double)B);
                                                                                            C.method391(0.31 + (double)B);
                                                                                        } else if (Class352.method4176(Class352.field290.field_1724.method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) == Class352.method4238(Class1739.field6526, (int)Class352.field1046[6])) {
                                                                                            Class5723.field11052.method14002(0.04 + (double)B);
                                                                                            C.method391(0.04 + (double)B);
                                                                                        } else {
                                                                                            if (Class352.method4262(Class352.field290.field_1724.method_23318() - (double)((int)Class352.method4146(Class352.field290).method_23318()), (int)Class352.field1046[6]) != Class1004.method12743(0.75, (int)Class352.field1046[6])) {
                                                                                                Class6009.method23561();
                                                                                                return;
                                                                                            }
                                                                                            Class352.method4210(Class5723.field11052, -0.2 - (double)B);
                                                                                            C.method391(-0.2 - (double)B);
                                                                                        }
                                                                                        if (this.field1047 == (int)Class352.field1046[5]) {
                                                                                            Class352.method4255(this, 1.350000023841858 * A - Class3737.field8446);
                                                                                        } else {
                                                                                            if (this.field1047 == (int)Class352.field1046[7]) {
                                                                                                l = (Class352.method4249(this) ? 0.2 : 0.3999) + (double)B;
                                                                                                Class5723.field11052.method14002(l);
                                                                                                C.method391(l);
                                                                                                if (!Class352.method4133(this)) {
                                                                                                    Class4146.method20697();
                                                                                                    return;
                                                                                                }
                                                                                                this.field1051 *= 1.5685;
                                                                                                Class298.method1924();
                                                                                                return;
                                                                                            }
                                                                                            if (this.field1047 == (int)Class352.field1046[6]) {
                                                                                                m = 0.66 * (this.field1052 - A);
                                                                                                this.field1051 = this.field1052 - m;
                                                                                                if (!this.field1038) {
                                                                                                    v5 = (int)Class352.field1046[5];
                                                                                                    while (true) {
                                                                                                        // Infinite loop
                                                                                                    }
                                                                                                }
                                                                                                this.field1038 = (int)Class352.field1046[1];
                                                                                                Class5836.method22885();
                                                                                                return;
                                                                                            }
                                                                                            if (Class352.field290.field_1724.method_24828()) {
                                                                                                if (Class352.method4187(this) > 0) {
                                                                                                    if (Class1807.method15742()) {
                                                                                                        v6 = (int)Class352.field1046[5];
                                                                                                        Class1668.method15147(1150127530, 2035807151, 581085414, 111134607);
                                                                                                        return;
                                                                                                    }
                                                                                                    Class352.method4025(this, (int)Class352.field1046[1]);
                                                                                                }
                                                                                            }
                                                                                            this.field1051 = Class352.method4027(this) - this.field1052 / 159.07699584960938;
                                                                                        }
                                                                                        this.field1051 = Math.max(Class352.method4221(this), A);
                                                                                        n = this.method3980((float)this.field1051);
                                                                                        Class352.method4199(C, n.field_1343);
                                                                                        C.method389(n.field_1342);
                                                                                        this.field1047 += (int)Class352.field1046[5];
                                                                                        break block102;
                                                                                    }
                                                                                    if (this.field1043.method507() != Class620.field3021) break block117;
                                                                                    if (!Class5723.field11056.method14268(Class352.field1046[8])) {
                                                                                        this.field1047 = (int)Class352.field1046[5];
                                                                                        return;
                                                                                    }
                                                                                    if (this.field1047 == (int)Class352.field1046[5] && Class352.field290.field_1724.field_5992 && Class1807.method15742()) {
                                                                                        this.field1051 = 1.25 * A - 0.009999999776482582;
                                                                                        Class352.method3989();
                                                                                        return;
                                                                                    }
                                                                                    if (Class352.method4223(this) != (int)Class352.field1046[7]) {
                                                                                        Class352.method4108();
                                                                                        return;
                                                                                    }
                                                                                    if (!Class352.field290.field_1724.field_5992) break block118;
                                                                                    if (!Class1807.method15742()) break block118;
                                                                                    if (this.method4156()) {
                                                                                        v7 = Class2191.field6784;
                                                                                        while (true) {
                                                                                            // Infinite loop
                                                                                        }
                                                                                    }
                                                                                    o = Class724.field3331 + B;
                                                                                    C.method391(o);
                                                                                    Class352.method4075(Class352.method4153(), o);
                                                                                    this.field1051 = Class352.method4207(this) * 2.149;
                                                                                    break block119;
                                                                                }
                                                                                if (this.field1047 != (int)Class352.field1046[6]) break block120;
                                                                                p = 0.66 * (this.field1052 - A);
                                                                                this.field1051 = this.field1052 - p;
                                                                                break block119;
                                                                            }
                                                                            if (!Class352.field290.field_1724.method_24828() || this.field1047 <= 0) break block121;
                                                                            if (!(1.35 * A - 0.01 > this.field1051)) break block122;
                                                                            this.field1047 = (int)Class352.field1046[1];
                                                                            break block121;
                                                                        }
                                                                        if (Class352.method4090()) {
                                                                            v8 = 6484;
                                                                            Class352.method4029(Class1788.field6692, Class3314.field7139, 0.5749417f, 0.88129526f, 0.51761955f, 0.9135386f);
                                                                            return;
                                                                        }
                                                                        v9 = 6485;
                                                                        if (true) ** GOTO lbl262
                                                                        do {
                                                                            v9 = var18_28 = 6483;
lbl262:
                                                                            // 2 sources

                                                                            if (var18_28 == 6484) break block101;
                                                                        } while (var18_28 == 6485);
                                                                        break block123;
                                                                    }
                                                                    v10 = (int)Class352.field1046[5];
                                                                    Class4146.method20697();
                                                                    return;
                                                                }
                                                                Class352.method3996(this, (int)Class352.field1046[1]);
                                                            }
                                                            this.field1051 = this.field1052 - this.field1052 / 159.07699584960938;
                                                        }
                                                        this.field1051 = Math.max(this.field1051, A);
                                                        if (Class352.method4001(this) > 0) {
                                                            q = this.method4197((float)this.field1051);
                                                            C.method386(Class352.method4264(q));
                                                            C.method389(q.field_1342);
                                                        }
                                                        v11 = this;
                                                        Class352.method4217(v11, v11.field1047 + (int)Class352.field1046[5]);
                                                        break block102;
                                                    }
                                                    if (Class352.method4056(this).method507() != Class352.method4200()) break block124;
                                                    if (!Class5723.field11056.method14268(Class352.field1046[8])) {
                                                        this.field1047 = (int)Class352.field1046[5];
                                                        return;
                                                    }
                                                    if (Class1004.method12743(Class352.method4053(Class352.field290).method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) != Class352.method4042(0.4, (int)Class352.field1046[6])) break block125;
                                                    Class5723.field11052.method14002(Class1221.field4798 + (double)B);
                                                    C.method391(0.31 + (double)B);
                                                    break block126;
                                                }
                                                if (Class1004.method12743(Class352.field290.field_1724.method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) != Class352.method4055(0.71, (int)Class352.field1046[6])) break block127;
                                                Class352.method4005().method14002(0.04 + (double)B);
                                                C.method391(Class1506.field5679 + (double)B);
                                                break block126;
                                            }
                                            if (Class1004.method12743(Class352.field290.field_1724.method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) != Class1004.method12743(Class1397.field5382, (int)Class352.field1046[6])) break block128;
                                            v12 = 7080;
                                            ** GOTO lbl305
                                        }
                                        v12 = 7081;
                                        if (true) ** GOTO lbl305
                                        block26: while (true) {
                                            v12 = 7079;
lbl305:
                                            // 3 sources

                                            switch (v12) {
                                                case 7081: {
                                                    continue block26;
                                                }
                                                case 7080: {
                                                    Class352.method4084().method14002(-0.2 - (double)B);
                                                    Class352.method4069(C, -0.2 - (double)B);
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    if (!Class352.field290.field_1687.method_8587(null, Class352.field290.field_1724.method_5829().method_989(0.0, Class3501.field7709, 0.0)) && Class1004.method12743(Class352.field290.field_1724.method_23318() - (double)((int)Class352.method4161(Class352.field290).method_23318()), (int)Class352.field1046[6]) == Class1004.method12743(0.55, (int)Class352.field1046[6])) {
                                        Class5723.field11052.method14002(-0.14 + (double)B);
                                        Class352.method4045(C, -0.14 + (double)B);
                                    }
                                    if (this.field1047 != (int)Class352.field1046[5] || !Class352.field290.field_1724.field_5992) ** GOTO lbl329
                                    if (Class352.method4158((class_310)Class352.field290).field_6250 != 0.0f) break block129;
                                    v13 = 64265;
                                    ** GOTO lbl324
                                }
                                v13 = 64266;
                                if (true) ** GOTO lbl324
                                block27: while (true) {
                                    v13 = 64264;
lbl324:
                                    // 3 sources

                                    switch (v13) {
                                        case 64266: {
                                            continue block27;
                                        }
                                        case 64265: {
                                            if (Class352.field290.field_1724.field_6212 != 0.0f) ** GOTO lbl352
lbl329:
                                            // 2 sources

                                            if (this.field1047 != (int)Class352.field1046[7]) ** GOTO lbl-1000
                                            if (Class352.field290.field_1724.field_5992) {
                                                if (Class352.method4070((class_310)Class352.field290).field_6250 == 0.0f) {
                                                    if (Class352.field290.field_1724.field_6212 != 0.0f) {
                                                        Class6322.method24332(Class1566.field5866, 0.33236247f);
                                                        return;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 4 sources

                                            {
                                                if (this.field1047 == (int)Class352.field1046[6]) {
                                                    r = 0.66 * (Class352.method3986(this) - A);
                                                    this.field1051 = this.field1052 - r;
                                                    break block27;
                                                }
                                                if (Class352.field290.field_1724.method_24828() && this.field1047 > 0) {
                                                    this.field1047 = 1.35 * A - 0.01 > this.field1051 ? (int)Class352.field1046[1] : (Class352.method4162() != false ? (int)Class352.field1046[5] : (int)Class352.field1046[1]);
                                                }
                                                this.field1051 = this.field1052 - this.field1052 / 159.07699584960938;
                                                break block27;
                                            }
                                            if (!this.method4156()) {
                                                Class6009.method23561();
                                                return;
                                            }
                                            s = 0.2 + (double)B;
                                            Class352.method4072(Class5723.field11052, s);
                                            Class352.method4260(C, s);
                                            this.field1051 *= 2.149;
                                            break block27;
                                        }
lbl352:
                                        // 2 sources

                                        default: {
                                            this.field1051 = 2.0 * A - 0.01;
                                        }
                                    }
                                    break;
                                }
                                if (this.field1047 > (int)Class352.field1046[9]) {
                                    Class352.method4169(this, A);
                                }
                                this.field1051 = Math.max(this.field1051, A);
                                t = this.method4197((float)this.field1051);
                                Class352.method4231(C, Class352.method4198(t));
                                C.method389(t.field_1342);
                                this.field1047 += (int)Class352.field1046[5];
                                break block102;
                            }
                            if (Class352.method4132(this.field1043) != Class352.method4002()) break block130;
                            if (Class352.method4181().method14268(Class352.field1046[8])) break block131;
                            v14 = 36501;
                            ** GOTO lbl372
                        }
                        v14 = 36502;
                        if (true) ** GOTO lbl372
                        block28: while (true) {
                            v14 = 36500;
lbl372:
                            // 3 sources

                            switch (v14) {
                                case 36502: {
                                    continue block28;
                                }
                                case 36501: {
                                    Class352.method4208(this, (int)Class352.field1046[2]);
                                    return;
                                }
                            }
                            break;
                        }
                        if (Class352.method4060(Class352.field290.field_1724.method_23318() - (double)((int)Class352.field290.field_1724.method_23318()), (int)Class352.field1046[6]) == Class1004.method12743(0.138, (int)Class352.field1046[6])) {
                            Class352.method4266(Class352.method4163(), Class352.method4259((class_310)Class352.field290).method_18798().field_1351 - (0.08 + (double)B));
                            C.method391(C.method381() - (0.0931 + (double)B));
                            Class5723.field11053.method12400(Class352.field290.field_1724.method_23318() - (0.0931 + (double)B));
                        }
                        if (this.field1047 != (int)Class352.field1046[7]) break block132;
                        if (Class352.method4216((class_310)Class352.field290).field_6250 != 0.0f) ** GOTO lbl395
                        if (Class352.field290.field_1724.field_6212 != 0.0f) ** GOTO lbl395
                    }
                    if (this.field1047 == (int)Class352.field1046[6]) {
                        u = Class1205.field4752 * (this.field1052 - A);
                        this.field1051 = Class352.method4211(this) - u;
                    } else {
                        if (Class352.field290.field_1724.method_24828()) {
                            this.field1047 = (int)Class352.field1046[5];
                        }
                        this.field1051 = this.field1052 - this.field1052 / 159.07699584960938;
                        Class352.method3994();
                        return;
lbl395:
                        // 2 sources

                        v = (this.method4156() != false ? 0.2 : 0.4) + (double)B;
                        Class5723.field11052.method14002(v);
                        C.method391(v);
                        this.field1051 *= 2.149;
                    }
                    this.field1051 = Math.max(this.field1051, A);
                    w = this.method4197((float)this.field1051);
                    C.method386(Class352.method4201(w));
                    C.method389(w.field_1342);
                    this.field1047 += (int)Class352.field1046[5];
                    break block102;
                }
                if (Class352.method4074(this).method507() != Class352.method4063()) break block133;
                v15 = 13753;
                ** GOTO lbl414
            }
            v15 = 13754;
            if (true) ** GOTO lbl414
            block29: while (true) {
                v15 = 13752;
lbl414:
                // 3 sources

                switch (v15) {
                    case 13754: {
                        continue block29;
                    }
                    case 13753: {
                        x = Class352.method4246(this, ((Float)this.field1048.method507()).floatValue() / 10.0f);
                        Class352.method4023(C, Class352.method4039(x));
                        C.method389(x.field_1342);
                    }
                }
                break;
            }
        }
    }

    private static void method4122(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method4123(Class365 class365) {
        return Class352.method3973(class365);
    }

    private static void method4124(long l2) {
        Class352.field1046[10] = l2 ^ 0xF794B0FCAF7704CAL;
        Class352.field1046[6] = l2 ^ 0xF794B0FCAF7704FBL;
        Class352.field1046[11] = l2 ^ 0xF794B0FCAF7704E1L;
        Class352.field1046[1] = l2 ^ 0xF794B0FCAF7704F8L;
        Class352.field1046[4] = l2 ^ 0xF794B0FCAF7704D0L;
        Class352.field1046[8] = l2 ^ 0xF794B0FCAF77049CL;
        Class352.field1046[7] = l2 ^ 0xF794B0FCAF7704FAL;
        Class352.field1046[2] = l2 ^ 0xF794B0FCAF7704FCL;
        Class352.field1046[0] = l2 ^ 0xF794B0FCAF7704F2L;
        Class352.field1046[9] = l2 ^ 0xF794B0FCAF7704F0L;
        Class352.field1046[5] = l2 ^ 0xF794B0FCAF7704F9L;
        Class352.field1046[3] = l2 ^ 0xF794B0FCAF7704ECL;
    }

    private static void method4125(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_744 method4126(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static int method4127(int n2, int n3, Class5487 class5487, Class626 class626) {
        return Class3218.method16134(n2, n3, class5487, class626);
    }

    private static void method4128() {
        Class6009.method23560();
    }

    private static boolean method4129(Class1447 class1447, long l2) {
        return class1447.method14268(l2);
    }

    private static void method4130(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static double method4131(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static Object method4132(Class248 class248) {
        return class248.method507();
    }

    public static boolean method4133(Class352 class352) {
        return class352.field1038;
    }

    public static class_746 method4134(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class365 method4135() {
        return Class365.method4718();
    }

    public static class_746 method4136(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method4137(int n2, int n3, Class222 class222, Class119 class119) {
        return Class3218.method16217(n2, n3, class222, class119);
    }

    public static class_746 method4138(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4139() {
        Class1745.method15538();
    }

    private static void method4140() {
        Class298.method1924();
    }

    private static void method4141(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method4142() {
        Class6454.method24594();
    }

    private static void method4143() {
        Class6454.method24594();
    }

    private static Object method4144(Class248 class248) {
        return class248.method507();
    }

    private static int method4145(int n2, int n3, Class145 class145, Class246 class246) {
        return Class3218.method16110(n2, n3, class145, class246);
    }

    public static class_746 method4146(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4147() {
        Class3979.method19561();
    }

    public static boolean method4148(Class352 class352) {
        return class352.field1042;
    }

    private static void method4149(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method4150() {
        Class6009.method23561();
    }

    private static void method4151() {
        Class5836.method22890();
    }

    private static void method4152() {
        Class5836.method22890();
    }

    public static Class1387 method4153() {
        return Class5723.field11052;
    }

    public static int method4154(Class352 class352) {
        return class352.field1049;
    }

    private static Object method4155(Class248 class248) {
        return class248.method507();
    }

    public boolean method4156() {
        return (!Class352.field290.field_1687.method_8587((class_1297)Class352.field290.field_1724, Class352.field290.field_1724.method_5829().method_989(0.0, 0.21, 0.0)) ? (int)field1046[5] : (int)field1046[1]) != 0;
    }

    private static Object method4157(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method4158(class_310 class_3102) {
        return class_3102.field_1724;
    }

    static {
        field1046 = new long[12];
        Class352.method4020(-606665450466114312L);
    }

    private static void method4159(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static class_746 method4160(class_310 class_3102) {
        return Class352.method4186(class_3102);
    }

    public static class_746 method4161(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method4162() {
        return Class1807.method15742();
    }

    public static Class1387 method4163() {
        return Class5723.field11052;
    }

    private static void method4164() {
        Class1503.method14420();
    }

    private static void method4165() {
        Class6009.method23561();
    }

    private static void method4166() {
        Class4146.method20697();
    }

    private static void method4167(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4168() {
        Class298.method1924();
    }

    public Class352() {
        super("Speed", "Move faster", Class556.field2752);
        this.field1041 = this.method450(new Class252("CollisionDistance", "The distance to apply collision speed", (Number)Float.valueOf(Class1682.field6232), (Number)Float.valueOf(1.5f), (Number)Float.valueOf(2.0f), this::method1269));
        this.field1048 = this.method450(new Class252("Speed", "The speed for alternative modes", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(50.0f), this::method1278));
        this.field1039 = this.method450(new Class253("UseTimer", "Uses timer to increase acceleration", (boolean)field1046[1], this::method4174));
        this.field1055 = this.method450(new Class253("Fast", "Fast timer speed", (boolean)field1046[1], this::method4237));
        this.field1044 = this.method450(new Class253("StrafeBoost", "Uses explosion velocity to boost Strafe", (boolean)field1046[1], this::method4174));
        this.field1040 = this.method450(new Class252("BoostTicks", "The number of ticks to boost strafe", (Number)((int)field1046[0]), (Number)((int)field1046[3]), (Number)((int)field1046[4]), this::method4189));
        this.field1050 = this.method450(new Class253("SpeedInWater", "Applies speed even in water and lava", (boolean)field1046[1]));
        this.field1047 = (int)field1046[2];
        INSTANCE = this;
    }

    public static void method4169(Class352 class352, double d2) {
        class352.field1051 = d2;
    }

    private static boolean method4170() {
        return Class376.method4987();
    }

    private static float method4171(class_744 class_7442) {
        return Class352.method4093(class_7442);
    }

    private static void method4172() {
        Class6009.method23560();
    }

    private static void method4173() {
        Class1503.method14420();
    }

    private Boolean method1269() {
        return (this.field1043.method507() == Class620.field3022 ? (int)field1046[5] : (int)field1046[1]) != 0;
    }

    public boolean method4174() {
        return (Class352.method4080(Class352.method3984(this)) != Class620.field3022 && Class352.method4119(this.field1043) != Class620.field3019 ? (int)field1046[5] : (int)field1046[1]) != 0;
    }

    private static int method4175(int n2, int n3, Class108 class108, Class6409 class6409) {
        return Class3218.method16123(n2, n3, class108, class6409);
    }

    private static double method4176(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static void method4177() {
        Class6454.method24594();
    }

    private static void method4178(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_241 method4179() {
        return class_241.field_1340;
    }

    private static int method4180(int n2, int n3, Class6259 class6259, Class474 class474) {
        return Class3218.method16095(n2, n3, class6259, class474);
    }

    private Boolean method1278() {
        return (this.field1043.method507() == Class620.field3019 ? (int)field1046[5] : (int)field1046[1]) != 0;
    }

    public static Class1447 method4181() {
        return Class5723.field11056;
    }

    public static Class352 method4182() {
        return INSTANCE;
    }

    private static void method4183(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_746 method4184(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class335 method4185() {
        return Class335.method3077();
    }

    public static class_746 method4186(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static int method4187(Class352 class352) {
        return class352.field1047;
    }

    private static void method4188(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private Boolean method4189() {
        return (Class352.method4095(this) && ((Boolean)this.field1044.method507()).booleanValue() ? (int)field1046[5] : (int)field1046[1]) != 0;
    }

    private static void method4190(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method4191(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4192(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method4193() {
        Class5836.method22885();
    }

    private static Object method4194(Class248 class248) {
        return class248.method507();
    }

    private static void method4195(Class335 class335, float f2) {
        class335.method3084(f2);
    }

    private static void method4196() {
        Class5659.method22184();
    }

    /*
     * Unable to fully structure code
     */
    public class_241 method4197(float a) {
        block12: {
            b = Class352.field290.field_1724.field_3913.field_3905;
            c = Class352.method4171(Class352.method4126(Class352.field290.field_1724));
            d = Class352.field290.field_1724.field_5982 + (Class352.field290.field_1724.method_36454() - Class352.field290.field_1724.field_5982) * Class352.field290.method_60646().method_60637((boolean)Class352.field1046[5]);
            if (b == 0.0f && c == 0.0f) {
                return Class352.method4179();
            }
            if (b == 0.0f) break block12;
            v0 = 5515;
            ** GOTO lbl14
        }
        v0 = 5516;
        if (true) ** GOTO lbl14
        block4: while (true) {
            v0 = 5514;
lbl14:
            // 3 sources

            switch (v0) {
                case 5516: {
                    continue block4;
                }
                case 5515: {
                    if (c >= 1.0f) {
                        if (b > 0.0f) {
                            v1 = -45.0f;
                            while (true) {
                                // Infinite loop
                            }
                        }
                        d += 45.0f;
                        c = 0.0f;
                    } else if (c <= Class5952.field11830) {
                        d += b > 0.0f ? Class3688.field8277 : Class4142.field9623;
                        c = 0.0f;
                    }
                    if (b > 0.0f) {
                        b = 1.0f;
                        break block4;
                    }
                    if (!(b < 0.0f)) break block4;
                    b = -1.0f;
                }
            }
            break;
        }
        e = (float)Math.cos(Math.toRadians(d));
        f = (float)(-Math.sin(Math.toRadians(d)));
        return new class_241(b * a * f + c * a * e, b * a * e - c * a * f);
    }

    public static float method4198(class_241 class_2412) {
        return class_2412.field_1343;
    }

    private static void method4199(Class204 class204, double d2) {
        class204.method386(d2);
    }

    public static Class620 method4200() {
        return Class620.field3027;
    }

    public static float method4201(class_241 class_2412) {
        return class_2412.field_1343;
    }

    public static float method4202(class_241 class_2412) {
        return class_2412.field_1342;
    }

    private static void method4203() {
        Class6454.method24594();
    }

    public static Class248 method4204(Class352 class352) {
        return class352.field1039;
    }

    public static Class1387 method4205() {
        return Class5723.field11052;
    }

    public static void method4206(Class352 class352, int n2) {
        class352.field1053 = n2;
    }

    public static double method4207(Class352 class352) {
        return class352.field1051;
    }

    private static void method4208(Class352 class352, int n2) {
        Class352.method4252(class352, n2);
    }

    private static void method4209(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4210(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    public static double method4211(Class352 class352) {
        return class352.field1052;
    }

    private static void method4212() {
        Class6009.method23561();
    }

    private static void method4213() {
        Class3979.method19561();
    }

    private static void method4214(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4215() {
        Class298.method1924();
    }

    public static class_746 method4216(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method4217(Class352 class352, int n2) {
        class352.field1047 = n2;
    }

    private static void method4218() {
        Class5836.method22885();
    }

    private static class_1313 method4219() {
        return Class352.method4076();
    }

    private static boolean method4220() {
        return Class5659.method22194();
    }

    public static double method4221(Class352 class352) {
        return class352.field1051;
    }

    private static void method4222() {
        Class6009.method23560();
    }

    public static int method4223(Class352 class352) {
        return class352.field1047;
    }

    public static boolean method4224(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private static void method4225(Class352 class352, boolean bl2) {
        Class352.method4054(class352, bl2);
    }

    private static void method4226() {
        Class5836.method22885();
    }

    public static class_746 method4227(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method4228(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method4229(int n2, int n3, Class5852 class5852, Class3753 class3753) {
        return Class3218.method16093(n2, n3, class5852, class3753);
    }

    private static void method4230(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method4231(Class204 class204, double d2) {
        class204.method386(d2);
    }

    @Class1
    public void method4232(Class133 a2) {
        if (Class352.field290.field_1724 == null || Class352.method4242(field290) == null) {
            return;
        }
        if (a2.method251() instanceof class_2708) {
            this.method4014();
        }
    }

    private static void method4233() {
        Class1503.method14420();
    }

    private static int method4234(int n2, int n3, Class1615 class1615, Class5790 class5790) {
        return Class3218.method16082(n2, n3, class1615, class5790);
    }

    private static void method4235(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4236() {
        Class1807.method15744();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method4237() {
        int n2;
        if (this.field1043.method507() == Class620.field3017) {
            int n3 = (Boolean)Class352.method4100(this.field1039) != false ? 64485 : 64486;
            block4: while (true) {
                switch (n3) {
                    case 64486: {
                        n3 = 64484;
                        continue block4;
                    }
                    case 64485: {
                        n2 = (int)field1046[5];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field1046[1];
        return n2 != 0;
    }

    private static double method4238(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    private static class_746 method4239(class_310 class_3102) {
        return Class352.method4136(class_3102);
    }

    private static void method4240(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method4241(Class335 class335, float f2) {
        class335.method3084(f2);
    }

    private static class_638 method4242(class_310 class_3102) {
        return Class352.method4018(class_3102);
    }

    private static void method4243(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1274() {
        Class352.method4225(this, Class335.method3077().method1265());
        if (!((Boolean)this.field1039.method507()).booleanValue() || this.field1042) return;
        int n2 = this.method4174() ? 32527 : 32528;
        block4: while (true) {
            switch (n2) {
                case 32528: {
                    n2 = 32526;
                    continue block4;
                }
                case 32527: {
                    Class335.method3077().method1264();
                    return;
                }
            }
            break;
        }
    }

    private static int method4244(int n2, int n3, Class4026 class4026, Class4258 class4258) {
        return Class3218.method16058(n2, n3, class4026, class4258);
    }

    private static void method4245() {
        Class5836.method22885();
    }

    private static class_241 method4246(Class352 class352, float f2) {
        return class352.method4197(f2);
    }

    private static void method4247(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method4248(Class352 class352) {
        return class352.field1043;
    }

    private static boolean method4249(Class352 class352) {
        return class352.method4156();
    }

    public static class_6880 method4250() {
        return class_1294.field_5913;
    }

    public static class_744 method4251(class_746 class_7462) {
        return class_7462.field_3913;
    }

    public static void method4252(Class352 class352, int n2) {
        class352.field1047 = n2;
    }

    private static Class335 method4253() {
        return Class335.method3077();
    }

    private static Class1447 method4254() {
        return Class352.method4263();
    }

    public static void method4255(Class352 class352, double d2) {
        class352.field1051 = d2;
    }

    private static int method4256(int n2, int n3, Class425 class425, Class926 class926) {
        return Class3218.method16226(n2, n3, class425, class926);
    }

    public static class_746 method4257(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static float method4258(class_241 class_2412) {
        return class_2412.field_1343;
    }

    public static class_746 method4259(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4260(Class204 class204, double d2) {
        class204.method391(d2);
    }

    private static void method4261(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static double method4262(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    public static Class1447 method4263() {
        return Class5723.field11056;
    }

    public static float method4264(class_241 class_2412) {
        return class_2412.field_1343;
    }

    private static int method4265(int n2, int n3, Class623 class623, Class3880 class3880) {
        return Class3218.method16248(n2, n3, class623, class3880);
    }

    private static void method4266(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static void method4267(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method4268() {
        Class4146.method20694();
    }

    public static float method4269(class_744 class_7442) {
        return class_7442.field_3905;
    }

    private static void method4270(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4271() {
        Class1503.method14420();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

