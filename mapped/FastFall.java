/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Box
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class10;
import mapped.Class1044;
import mapped.Class1108;
import mapped.Class1151;
import mapped.Class1387;
import mapped.Class1447;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class204;
import mapped.Class217;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Flight;
import mapped.Chams;
import mapped.PacketFly;
import mapped.Speed;
import mapped.LongJump;
import mapped.Class3979;
import mapped.Class4146;
import mapped.AutoAnchor;
import mapped.Class5130;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5714;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class623;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class804;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FastFall
extends Class278 {
    private boolean field1068;
    Class248 field1069;
    Class248 field1070;
    private static long[] field1071 = new long[5];
    private int field1072;
    private boolean field1073;
    Class248 field1074;
    private final Class925 field1075 = new Class926();
    Class248 field1076;

    private static void method4317() {
        Class5836.method22885();
    }

    private static void method4318(FastFall class355, int n2) {
        FastFall.method4321(class355, n2);
    }

    @Class1
    public void method4319(Class217 b2) {
        block8: {
            block10: {
                block9: {
                    if (this.field1074.method507() != Class623.field3044) break block8;
                    if (FastFall.field290.field_1724.method_3144() || FastFall.field290.field_1724.method_6128() || FastFall.method4334(field290).method_21754() || FastFall.method4361(field290).method_5771() || FastFall.field290.field_1724.method_5799() || FastFall.field290.field_1724.field_3913.field_3904 || FastFall.method4336((class_310)FastFall.field290).field_3913.field_3903) break block9;
                    if (Class5723.field11056.method14268(field1071[4])) break block10;
                }
                return;
            }
            if (!FastFall.method4339().method14268(field1071[4])) {
                Class5836.method22885();
                return;
            }
            if (this.field1075.method12595((int)field1071[4])) {
                if (!Speed.method4109().method1265()) {
                    if (!LongJump.method5143().method1265()) {
                        if (!Flight.method1355().method1265() && !PacketFly.method2203().method1265()) {
                            Class5836.method22897();
                            return;
                        }
                    }
                }
            }
            return;
        }
    }

    private Boolean method1278() {
        if (this.field1074.method507() == Class623.field3044) {
            int n2 = (int)field1071[1];
            Class3979.method19561();
            return null;
        }
        return (boolean)field1071[0];
    }

    public static Class248 method4320(FastFall class355) {
        return class355.field1074;
    }

    public static void method4321(FastFall class355, int n2) {
        class355.field1072 = n2;
    }

    private static int method4322(int n2, int n3, Class804 class804, Class10 class10) {
        return Class1044.method12861(n2, n3, class804, class10);
    }

    private static void method4323(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method4324(FastFall class355, int n2) {
        class355.field1072 = n2;
    }

    public static class_746 method4325(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Override
    public void method1279() {
        FastFall.method4347(this, (boolean)field1071[0]);
        FastFall.method4318(this, (int)field1071[0]);
    }

    private Boolean method1269() {
        return (FastFall.method4320(this).method507() == Class623.field3045 ? (int)field1071[1] : (int)field1071[0]) != 0;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method4326(Class63 b) {
        block13: {
            block17: {
                block16: {
                    block15: {
                        block12: {
                            block14: {
                                if (b.method128() != Class543.field2690) break block13;
                                this.field1073 = FastFall.field290.field_1724.method_24828();
                                if (this.field1074.method507() != Class623.field3045) break block13;
                                if (FastFall.field290.field_1724.method_3144() || FastFall.field290.field_1724.method_6128()) ** GOTO lbl-1000
                                if (FastFall.field290.field_1724.method_21754()) break block14;
                                v0 = 62513;
                                ** GOTO lbl13
                            }
                            v0 = 62514;
                            if (true) ** GOTO lbl13
                            do {
                                v0 = var2_2 = 62512;
lbl13:
                                // 3 sources

                                if (var2_2 == 62513) break block12;
                            } while (var2_2 == 62514);
                            ** GOTO lbl-1000
                        }
                        if (FastFall.method4346(FastFall.field290).method_5771() || FastFall.field290.field_1724.method_5799()) ** GOTO lbl-1000
                        if (FastFall.field290.field_1724.field_3913.field_3904) break block15;
                        v1 = 4389;
                        ** GOTO lbl26
                    }
                    v1 = 4390;
                    if (true) ** GOTO lbl26
                    block5: while (true) {
                        v1 = 4388;
lbl26:
                        // 3 sources

                        switch (v1) {
                            case 4390: {
                                continue block5;
                            }
                            case 4389: {
                                if (FastFall.method4340(FastFall.field290.field_1724.field_3913)) ** GOTO lbl33
                                v2 = 61344;
                                ** GOTO lbl37
lbl33:
                                // 1 sources

                                v2 = 61345;
                                if (true) ** GOTO lbl37
                                do {
                                    v2 = var3_3 = 61343;
lbl37:
                                    // 3 sources

                                    if (var3_3 == 61344) ** GOTO lbl40
                                } while (var3_3 == 61345);
                                ** GOTO lbl41
lbl40:
                                // 1 sources

                                if (Class5723.field11056.method14268(FastFall.field1071[4])) break block5;
                            }
lbl41:
                            // 3 sources

                            default: lbl-1000:
                            // 4 sources

                            {
                                return;
                            }
                        }
                        break;
                    }
                    if (Speed.method4109().method1265()) break block16;
                    if (FastFall.method4356().method1265()) break block16;
                    if (Flight.method1355().method1265()) {
                        Class5836.method22897();
                        return;
                    }
                    if (!PacketFly.method2203().method1265()) break block17;
                }
                return;
            }
            a = this.method4354();
            if (a > Class1151.field4606 && a <= (double)((Float)this.field1070.method507()).floatValue() && FastFall.method4330(FastFall.field290).method_24828()) {
                Class5723.field11052.method14005(FastFall.method4325((class_310)FastFall.field290).method_18798().field_1352 * 0.05, FastFall.field290.field_1724.method_18798().field_1350 * 0.05);
                Class5723.field11052.method14002((Boolean)this.field1076.method507() != false ? FastFall.method4337((class_310)FastFall.field290).method_18798().field_1351 - 0.6200000047683716 : -3.0);
            }
        }
    }

    public static class_746 method4327(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4328() {
        Class5836.method22890();
    }

    public static Class248 method4329(FastFall class355) {
        return class355.field1069;
    }

    public static class_746 method4330(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4331(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method4332(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method4333(FastFall class355, int n2) {
        class355.field1072 = n2;
    }

    public static class_746 method4334(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public FastFall() {
        super("FastFall", "Falls down blocks faster", Class556.field2752);
        this.field1070 = this.method450(new Class252("Height", "The maximum fall height", Float.valueOf(1.0f), Float.valueOf(3.0f), Float.valueOf(10.0f)));
        this.field1074 = this.method450(new Class260("Mode", "The mode for falling down blocks", Class623.field3045, Class623.values()));
        this.field1076 = this.method450(new Class253("Accelerate", "Accels the fall speed", (boolean)field1071[0], this::method1269));
        this.field1069 = this.method450(new Class252("ShiftTicks", "Number of ticks to shift ahead", (Number)((int)field1071[1]), (Number)((int)field1071[2]), (Number)((int)field1071[3]), this::method1278));
    }

    private static void method4335() {
        Class1503.method14420();
    }

    public static class_746 method4336(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method4337(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4338(Class204 class204, double d2) {
        class204.method389(d2);
    }

    public static Class1447 method4339() {
        return Class5723.field11056;
    }

    public static boolean method4340(class_744 class_7442) {
        return class_7442.field_3903;
    }

    private static void method4341() {
        Chams.method1924();
    }

    static {
        FastFall.method4344(-5222446475159178398L);
    }

    private static Object method4342(Class248 class248) {
        return class248.method507();
    }

    private static void method4343() {
        Chams.method1924();
    }

    private static void method4344(long l2) {
        FastFall.field1071[2] = l2 ^ 0xB7862499BDA57361L;
        FastFall.field1071[0] = l2 ^ 0xB7862499BDA57362L;
        FastFall.field1071[4] = l2 ^ 0xB7862499BDA5708AL;
        FastFall.field1071[1] = l2 ^ 0xB7862499BDA57363L;
        FastFall.field1071[3] = l2 ^ 0xB7862499BDA57367L;
    }

    private static void method4345(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_746 method4346(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method4347(FastFall class355, boolean bl2) {
        class355.field1068 = bl2;
    }

    private static Object method4348(Class248 class248) {
        return class248.method507();
    }

    private static void method4349(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method4350(FastFall class355) {
        return class355.field1074;
    }

    public static Class1387 method4351() {
        return Class5723.field11052;
    }

    private static void method4352(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method4353(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private double method4354() {
        class_238 b2 = FastFall.field290.field_1724.method_5829();
        for (double a2 = 0.0; a2 < (double)((Float)this.field1070.method507()).floatValue() + Class5714.field11013; a2 += 0.01) {
            if (FastFall.field290.field_1687.method_8587((class_1297)FastFall.field290.field_1724, b2.method_989(0.0, -a2, 0.0))) continue;
            return a2;
        }
        return Class5130.field10067;
    }

    private static int method4355(int n2, int n3, AutoAnchor class436, Class1745 class1745) {
        return Class1044.method12878(n2, n3, class436, class1745);
    }

    private static LongJump method4356() {
        return LongJump.method5143();
    }

    @Class1
    public void method4357(Class204 a2) {
        block7: {
            block6: {
                if (Flight.method1355().method1265()) break block6;
                if (!PacketFly.method2203().method1265()) break block7;
            }
            return;
        }
        if (!this.field1068) {
            Class4146.method20697();
            return;
        }
        if (FastFall.method4350(this).method507() == Class623.field3044) {
            a2.method386(0.0);
            FastFall.method4338(a2, 0.0);
            Class5723.field11052.method14005(0.0, 0.0);
            FastFall class355 = this;
            FastFall.method4333(class355, class355.field1072 + (int)field1071[1]);
            if (this.field1072 > (Integer)FastFall.method4329(this).method507()) {
                this.field1068 = (int)field1071[0];
                this.field1072 = (int)field1071[0];
            }
        }
    }

    private static void method4358() {
        Class1745.method15538();
    }

    private static void method4359() {
        Class1745.method15538();
    }

    private static void method4360(float f2) {
        Class5836.method22907(f2);
    }

    public static class_746 method4361(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

