/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.option.Perspective
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class135;
import mapped.Class17;
import mapped.Class1745;
import mapped.Class227;
import mapped.Class278;
import mapped.Class5506;
import mapped.Class556;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6454;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.option.Perspective;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FreeLook
extends Class278 {
    private float field428;
    private float field429;
    private class_5498 field430;

    public static void method1384(FreeLook class281, float f2) {
        class281.field428 = f2;
    }

    public static class_315 method1385(class_310 class_3102) {
        return class_3102.field_1690;
    }

    @Override
    public void method1279() {
        if (this.field430 != null) {
            FreeLook.field290.field_1690.method_31043(this.field430);
        }
    }

    private static void method1386(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static class_5498 method1387() {
        return FreeLook.method1392();
    }

    private static class_315 method1388(class_310 class_3102) {
        return FreeLook.method1385(class_3102);
    }

    @Class1
    public void method1389(Class135 a2) {
        if (FreeLook.field290.field_1690.method_31044() == class_5498.field_26664) {
            Class1745.method15538();
            return;
        }
        a2.method10();
        this.method1391(a2.method259(), a2.method258());
    }

    public static float method1390(FreeLook class281) {
        return class281.field428;
    }

    private void method1391(double a2, double b2) {
        float c2 = (float)b2 * 0.15f;
        float d2 = (float)a2 * 0.15f;
        FreeLook class281 = this;
        FreeLook.method1397(class281, FreeLook.method1393(class281) + c2);
        this.field428 += d2;
        this.field429 = class_3532.method_15363((float)this.field429, (float)Class5506.field10360, (float)90.0f);
    }

    public static class_5498 method1392() {
        return class_5498.field_26665;
    }

    public static float method1393(FreeLook class281) {
        return class281.field429;
    }

    public static void method1394(FreeLook class281, float f2) {
        class281.field429 = f2;
    }

    public static class_315 method1395(class_310 class_3102) {
        return class_3102.field_1690;
    }

    @Class1
    public void method1396(Class17 a2) {
        if (FreeLook.method1395(field290).method_31044() != class_5498.field_26664) {
            a2.method27(FreeLook.method1390(this));
            a2.method24(this.field429);
        }
    }

    public static void method1397(FreeLook class281, float f2) {
        class281.field429 = f2;
    }

    @Class1
    public void method1398(Class227 a2) {
        if (FreeLook.field290.field_1690.method_31044() != a2.method422() && a2.method422() != class_5498.field_26664) {
            FreeLook.method1400(this, FreeLook.field290.field_1724.method_36454());
            FreeLook.method1394(this, FreeLook.field290.field_1724.method_36455());
        }
    }

    @Class1
    public void method1399(Class63 a2) {
        if (this.field430 != null && this.field430 != FreeLook.method1387()) {
            FreeLook.field290.field_1690.method_31043(class_5498.field_26665);
        }
    }

    private static void method1400(FreeLook class281, float f2) {
        FreeLook.method1384(class281, f2);
    }

    private static void method1401(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method1402(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public FreeLook() {
        super("FreeLook", "Allows you to freely move the camera in third person", Class556.field2754);
    }

    @Override
    public void method1274() {
        this.field430 = FreeLook.method1388(field290).method_31044();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

