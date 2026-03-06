/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class129;
import mapped.Class1503;
import mapped.Class177;
import mapped.Class1777;
import mapped.Class1807;
import mapped.Class181;
import mapped.Class248;
import mapped.Class252;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3316;
import mapped.Class3317;
import mapped.Class3815;
import mapped.Class382;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class5556;
import mapped.Class556;
import mapped.Class5651;
import mapped.Class57;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class614;
import mapped.Class6454;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class299
extends Class278 {
    private static Class299 INSTANCE;
    Class248 field578;
    Class248 field579 = this.method450(new Class260("Mode", "mode", Class614.field2988, Class614.values()));
    Class248 field580;
    Class248 field581;
    Class248 field582 = this.method450(new Class252("MaxSpeed", "The initial speed of the rocket", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(Class3316.field7142), (Number)Float.valueOf(Class1777.field6657), this::method1269));
    private static long[] field583;

    private class_243 method2008() {
        Class57 a2 = new Class57((class_1309)Class299.field290.field_1724, Class299.method2025(field290).method_36454(), Class299.field290.field_1724.method_36455());
        Class3815.INSTANCE.method18539(a2);
        if (a2.method11()) {
            return Class299.method2032(a2);
        }
        return Class299.field290.field_1724.method_5720();
    }

    private static Class299 method2009() {
        return Class299.method2021();
    }

    static {
        field583 = new long[2];
        Class299.method2033(8599846697402258100L);
    }

    private static void method2010(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method2011(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method2012() {
        Class1503.method14420();
    }

    private static void method2013() {
        Class6009.method23561();
    }

    public static Class614 method2014() {
        return Class614.field2991;
    }

    private static Object method2015(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method2016(Class299 class299) {
        return class299.field580;
    }

    private static void method2017() {
        Class5836.method22885();
    }

    private static void method2018(Class129 class129, double d2, double d3, double d4) {
        class129.method245(d2, d3, d4);
    }

    private static int method2019(int n2, int n3, Class1807 class1807, Class177 class177) {
        return Class5556.method21892(n2, n3, class1807, class177);
    }

    public static Class248 method2020(Class299 class299) {
        return class299.field579;
    }

    public static Class299 method2021() {
        return INSTANCE;
    }

    private static Object method2022(Class248 class248) {
        return class248.method507();
    }

    private static int method2023(int n2, int n3, Class4146 class4146, Class181 class181) {
        return Class5556.method21900(n2, n3, class4146, class181);
    }

    private static void method2024() {
        Class5836.method22897();
    }

    public static class_746 method2025(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method2026() {
        return (Class299.method2027(this.field579) == Class614.field2988 ? (int)field583[0] : (int)field583[1]) != 0;
    }

    private static Object method2027(Class248 class248) {
        return class248.method507();
    }

    private Boolean method2028() {
        return (Class299.method2022(this.field579) == Class614.field2988 ? (int)field583[0] : (int)field583[1]) != 0;
    }

    private static void method2029() {
        Class3979.method19561();
    }

    @Class1
    public void method2030(Class129 j2) {
        j2.method10();
        switch (((Class614)((Object)this.field579.method507())).ordinal()) {
            case 0: {
                class_243 a2 = this.method2008();
                double b2 = ((Float)this.field578.method507()).floatValue();
                double c2 = ((Float)this.field581.method507()).floatValue();
                double d2 = ((Float)Class299.method2016(this).method507()).floatValue();
                class_243 e2 = Class299.field290.field_1724.method_18798();
                Class299.method2034(j2, a2.field_1352 * d2 + (a2.field_1352 * b2 - e2.field_1352) * c2, a2.field_1351 * d2 + (a2.field_1351 * b2 - e2.field_1351) * c2, a2.field_1350 * d2 + (a2.field_1350 * b2 - e2.field_1350) * c2);
                break;
            }
            case 1: {
                class_243 f2 = Class299.method2035(this);
                double g2 = ((Float)this.field582.method507()).floatValue();
                class_243 h2 = f2.method_1021(g2);
                class_243 i2 = Class299.method2040(field290).method_18798();
                Class299.method2018(j2, h2.field_1352 - i2.field_1352, h2.field_1351 - i2.field_1351, h2.field_1350 - i2.field_1350);
            }
        }
    }

    private static int method2031(int n2, int n3, Class382 class382, Class3317 class3317) {
        return Class5556.method21894(n2, n3, class382, class3317);
    }

    private static class_243 method2032(Class57 class57) {
        return class57.method109();
    }

    private static void method2033(long l2) {
        Class299.field583[1] = l2 ^ 0x7758CB01E17A52B4L;
        Class299.field583[0] = l2 ^ 0x7758CB01E17A52B5L;
    }

    public Class299() {
        super("FireworkBoost", "Allows you to change the acceleration of your firework", Class556.field2752);
        this.field578 = this.method450(new Class252("Speed", "offset * baseSpeed + (offset * speed - velocity) * factor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(Class5651.field10825), (Number)Float.valueOf(5.0f), this::method1278));
        this.field580 = this.method450(new Class252("BaseSpeed", "offset * baseSpeed + (offset * speed - velocity) * factor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(5.0f), this::method2026));
        this.field581 = this.method450(new Class252("Factor", "offset * baseSpeed + (offset * speed - velocity) * factor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.5f), (Number)Float.valueOf(5.0f), this::method2028));
        INSTANCE = this;
    }

    private static void method2034(Class129 class129, double d2, double d3, double d4) {
        class129.method245(d2, d3, d4);
    }

    private static class_243 method2035(Class299 class299) {
        return class299.method2008();
    }

    private Boolean method1269() {
        return (Class299.method2015(this.field579) == Class299.method2014() ? (int)field583[0] : (int)field583[1]) != 0;
    }

    public static Class299 method2036() {
        return Class299.method2009();
    }

    private static void method2037() {
        Class5836.method22897();
    }

    private static void method2038(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method2039(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method2040(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method1278() {
        if (Class299.method2020(this).method507() == Class614.field2988) {
            Class299.method2012();
            return null;
        }
        return (boolean)field583[1];
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

