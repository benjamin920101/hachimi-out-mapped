/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.util.Arm
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.MovementType
 *  net.minecraft.entity.Flutterer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.entity.attribute.EntityAttributes
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1344;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3292;
import mapped.Class3402;
import mapped.AutoTool;
import mapped.BreakESP;
import mapped.Class3906;
import mapped.Class4016;
import mapped.Class4036;
import mapped.Class4081;
import mapped.Class4146;
import mapped.Class4217;
import mapped.Class5630;
import mapped.Class5659;
import mapped.Class5702;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class630;
import mapped.Class6301;
import mapped.Class6322;
import mapped.Class6386;
import mapped.Class6435;
import mapped.Class6454;
import mapped.Class698;
import mapped.Class729;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Arm;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.Flutterer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.attribute.EntityAttributes;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5183
extends class_1309 {
    class_1309 field10068;
    private static long[] field10069;
    public boolean field10070 = (int)field10069[2];
    public static boolean $skidonion$998554154;

    public static double method21004(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method21005() {
        Class4146.method20694();
    }

    public static double method21006(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method21007() {
        Class5836.method22885();
    }

    private static void method21008(long l2) {
        Class5183.field10069[2] = l2 ^ 0xB45D36A30D4A31B0L;
        Class5183.field10069[0] = l2 ^ 0xB45D36A352D92C51L;
        Class5183.field10069[1] = l2 ^ 0xB45D36A30D4A31D4L;
        Class5183.field10069[3] = l2 ^ 0xB45D36A30D4A31B1L;
    }

    private static void method21009(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method21010(int n2, int n3, AutoTool class347, Class6023 class6023) {
        return Class729.method11949(n2, n3, class347, class6023);
    }

    public static double method21011(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static float method21012() {
        return Class6322.method24337();
    }

    public static class_1309 method21013(Class5183 class5183) {
        return class5183.field10068;
    }

    private static class_2248 method21014() {
        return Class5183.method21045();
    }

    private static void method21015() {
        Class5659.method22184();
    }

    private static float method21016() {
        return Class6322.method24325();
    }

    private static void method21017() {
        Class1745.method15538();
    }

    public static class_1309 method21018(Class5183 class5183) {
        return class5183.field10068;
    }

    /*
     * Unable to fully structure code
     */
    public void method21019(class_243 A) {
        block53: {
            block58: {
                block55: {
                    block56: {
                        block46: {
                            block57: {
                                block54: {
                                    block51: {
                                        block52: {
                                            block45: {
                                                block50: {
                                                    block49: {
                                                        block44: {
                                                            block48: {
                                                                block47: {
                                                                    if (!this.field10068.method_5681()) break block47;
                                                                    b = Class5183.method21037(Class5183.method21047(this).method_5720());
                                                                    v0 = b < -0.2 ? 0.085 : (c = 0.06);
                                                                    if (b <= 0.0) ** GOTO lbl-1000
                                                                    if (!this.field_6282) {
                                                                        v1 = 18547;
                                                                        Class6454.method24594();
                                                                        return;
                                                                    }
                                                                    v2 = 18548;
                                                                    if (true) ** GOTO lbl13
                                                                    block16: while (true) {
                                                                        v2 = 18546;
lbl13:
                                                                        // 2 sources

                                                                        switch (v2) {
                                                                            case 18548: {
                                                                                continue block16;
                                                                            }
                                                                            case 18547: {
                                                                                if (this.method_37908().method_8320(class_2338.method_49637((double)this.method_23317(), (double)(this.method_23318() + 1.0 - 0.1), (double)this.method_23321())).method_26227().method_15769()) break block16;
                                                                            }
                                                                            default: lbl-1000:
                                                                            // 2 sources

                                                                            {
                                                                                a = this.method_18798();
                                                                                this.method_18799(a.method_1031(0.0, (b - a.field_1351) * c, 0.0));
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                B = this.field10068.method_56989();
                                                                if (!(this.method_18798().field_1351 <= 0.0)) break block48;
                                                                v3 = 50818;
                                                                ** GOTO lbl31
                                                            }
                                                            v3 = 50819;
                                                            if (true) ** GOTO lbl31
                                                            do {
                                                                v3 = var7_8 = 50817;
lbl31:
                                                                // 3 sources

                                                                if (var7_8 == 50818) break block44;
                                                            } while (var7_8 == 50819);
                                                            break block49;
                                                        }
                                                        v4 = (int)Class5183.field10069[3];
                                                        break block50;
                                                    }
                                                    v4 = C = (int)Class5183.field10069[2];
                                                }
                                                if (C == 0) {
                                                    Class4146.method20694();
                                                    return;
                                                }
                                                v5 = 35159;
                                                if (true) ** GOTO lbl47
                                                while (true) {
                                                    v5 = var9_10 = 35158;
lbl47:
                                                    // 2 sources

                                                    if (var9_10 == 35159) break;
                                                    if (var9_10 == 35160) {
                                                        continue;
                                                    }
                                                    break block45;
                                                    break;
                                                }
                                                if (Class5183.method21062(this).method_6059(class_1294.field_5906)) {
                                                    B = Math.min(B, 0.01);
                                                }
                                            }
                                            D = this.method_37908().method_8316(this.method_24515());
                                            if (!this.field10068.method_5799() || !this.method_29920()) break block51;
                                            if (this.field10068.method_26319(D)) break block51;
                                            i = this.method_23318();
                                            h = this.field10068.method_5624() ? 0.9f : this.method_6120();
                                            d = Class6301.field12935;
                                            e = (float)this.field10068.method_45325(class_5134.field_51578);
                                            if (this.method_24828()) {
                                                while (true) {
                                                    // Infinite loop
                                                }
                                            }
                                            if (!((e *= Class3402.field7409) > 0.0f)) break block52;
                                            v6 = 57765;
                                            ** GOTO lbl73
                                        }
                                        v6 = 57766;
                                        if (true) ** GOTO lbl73
                                        block20: while (true) {
                                            v6 = 57764;
lbl73:
                                            // 3 sources

                                            switch (v6) {
                                                case 57766: {
                                                    continue block20;
                                                }
                                                case 57765: {
                                                    h += (0.54600006f - h) * e;
                                                    d += (Class5183.method21050(this).method_6029() - d) * e;
                                                }
                                            }
                                            break;
                                        }
                                        if (this.field10068.method_6059(class_1294.field_5900)) {
                                            h = 0.96f;
                                        }
                                        this.method_5724(d, A);
                                        this.method_5784(class_1313.field_6308, this.method_18798());
                                        f = this.method_18798();
                                        if (this.field_5976 && this.method_6101()) {
                                            f = new class_243(f.field_1352, Class3906.field8896, f.field_1350);
                                        }
                                        this.method_18799(f.method_18805((double)h, 0.800000011920929, (double)h));
                                        g = this.method_26317(B, (boolean)C, this.method_18798());
                                        this.method_18799(g);
                                        if (!this.field_5976) break block53;
                                        if (!this.method_5654(g.field_1352, Class5183.method21006(g) + 0.6000000238418579 - this.method_23318() + i, g.field_1350)) {
                                            Class6009.method23559(true);
                                            return;
                                        }
                                        v7 = 25617;
                                        if (true) ** GOTO lbl97
                                        block21: while (true) {
                                            v7 = 25616;
lbl97:
                                            // 2 sources

                                            switch (v7) {
                                                case 25618: {
                                                    continue block21;
                                                }
                                                case 25617: {
                                                    this.method_18800(g.field_1352, Class4016.field9232, g.field_1350);
                                                }
                                            }
                                            break;
                                        }
                                        break block53;
                                    }
                                    if (!Class5183.method21018(this).method_5771() || !this.method_29920()) break block54;
                                    if (Class5183.method21031(this).method_26319(D)) {
                                        Class4146.method20697();
                                        return;
                                    }
                                    l = this.method_23318();
                                    this.method_5724(0.02f, A);
                                    this.method_5784(Class5183.method21029(), this.method_18798());
                                    if (this.field10068.method_5861(class_3486.field_15518) <= this.field10068.method_29241()) {
                                        this.method_18799(this.method_18798().method_18805(0.5, 0.800000011920929, 0.5));
                                        j = this.method_26317(B, (boolean)C, this.method_18798());
                                        this.method_18799(j);
                                    } else {
                                        this.method_18799(this.method_18798().method_1021(0.5));
                                    }
                                    if (B != 0.0) {
                                        this.method_18799(this.method_18798().method_1031(0.0, -B / Class1344.field5200, 0.0));
                                    }
                                    k = this.method_18798();
                                    if (this.field_5976 && this.method_5654(k.field_1352, Class5183.method21024(k) + 0.6000000238418579 - this.method_23318() + l, k.field_1350)) {
                                        this.method_18800(k.field_1352, 0.30000001192092896, Class5183.method21052(k));
                                    }
                                    break block53;
                                }
                                if (!this.field10068.method_6128()) break block55;
                                o = this.method_18798();
                                p = this.field10068.method_5720();
                                u = this.method_36455() * 0.017453292f;
                                q = Math.sqrt(p.field_1352 * p.field_1352 + Class5183.method21021(p) * p.field_1350);
                                r = o.method_37267();
                                s = p.method_1033();
                                t = Math.cos(u);
                                t = t * t * Math.min(1.0, s / 0.4);
                                o = this.method_18798().method_1031(0.0, B * (Class4217.field9873 + t * 0.75), 0.0);
                                if (Class5183.method21046(o) < 0.0 && q > 0.0) {
                                    m = o.field_1351 * -0.1 * t;
                                    o = o.method_1031(p.field_1352 * m / q, m, p.field_1350 * m / q);
                                }
                                if (!(u < 0.0f)) break block56;
                                if (!(q > 0.0)) break block57;
                                v8 = 39097;
                                if (true) ** GOTO lbl147
                            }
                            v9 = 39098;
                            Class1668.method15147(-267799787, 1216575653, -1874844160, -615670002);
                            return;
                            do {
                                v8 = var27_29 = 39096;
lbl147:
                                // 2 sources

                                if (var27_29 == 39097) break block46;
                            } while (var27_29 == 39098);
                            break block56;
                        }
                        n = r * (double)(-class_3532.method_15374((float)u)) * 0.04;
                        o = o.method_1031(-p.field_1352 * n / q, n * 3.2, -Class5183.method21011(p) * n / q);
                    }
                    if (q > 0.0) {
                        o = o.method_1031((Class5183.method21027(p) / q * r - o.field_1352) * 0.1, 0.0, (p.field_1350 / q * r - Class5183.method21020(o)) * 0.1);
                    }
                    this.method_18799(o.method_18805(Class3292.field7083, 0.9800000190734863, Class6386.field13209));
                    this.method_5784(class_1313.field_6308, this.method_18798());
                    Class4146.method20697();
                    return;
                }
                v = this.method_23314();
                w = this.method_37908().method_8320(v).method_26204().method_9499();
                if (!this.method_24828()) {
                    Class5836.method22897();
                    return;
                }
                z = !this.field10070 ? w * 0.91f : 0.91f;
                x = this.method_26318(A, w);
                y = x.field_1351;
                if (!this.field10068.method_6059(class_1294.field_5902)) break block58;
                v10 = 3218;
                ** GOTO lbl177
            }
            v10 = 3219;
            if (true) ** GOTO lbl177
            block23: while (true) {
                v10 = 3217;
lbl177:
                // 3 sources

                switch (v10) {
                    case 3219: {
                        continue block23;
                    }
                    case 3218: {
                        y += (Class5702.field10977 * (double)(this.field10068.method_6112(class_1294.field_5902).method_5578() + (int)Class5183.field10069[3]) - x.field_1351) * 0.2;
                        break block23;
                    }
                    default: {
                        if (!this.method_37908().method_22340(v)) {
                            if (this.method_23318() > (double)this.method_37908().method_31607()) {
                                y = -0.1;
                                break block23;
                            }
                            y = 0.0;
                            break block23;
                        }
                        y -= B;
                    }
                }
                break;
            }
            if (Class5183.method21063(this).method_35053()) {
                this.method_18800(x.field_1352, y, x.field_1350);
            } else {
                this.method_18800(x.field_1352 * (double)z, this instanceof class_1432 != false ? y * (double)z : y * 0.9800000190734863, x.field_1350 * (double)z);
            }
        }
    }

    public static double method21020(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static double method21021(class_243 class_2432) {
        return Class5183.method21060(class_2432);
    }

    private static void method21022() {
        Class6009.method23560();
    }

    private static void method21023(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static double method21024(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static int method21025(int n2, int n3, Class4081 class4081, Class6435 class6435) {
        return Class729.method11925(n2, n3, class4081, class6435);
    }

    private static void method21026() {
        Class4146.method20694();
    }

    public Class5183(class_1309 a2) {
        super(class_1299.field_6097, (class_1937)class_310.method_1551().field_1687);
        this.method_5719((class_1297)a2);
        this.field_5982 = this.method_36454();
        this.field_6004 = this.method_36455();
        this.field_6259 = this.field_6241 = a2.field_6241;
        this.field_6220 = this.field_6283 = a2.field_6283;
        this.field_5957 = a2.method_5799();
        this.field_42108.field_42111 = a2.field_42108.method_48569();
        this.field_42108.method_48567(a2.field_42108.method_48566());
        this.method_6125(a2.method_6029());
        this.method_24830(a2.method_24828());
        this.method_6127().method_26846(a2.method_6127());
        this.method_5660(a2.method_5715());
        this.method_5796(a2.method_5681());
        this.method_5728(a2.method_5624());
        this.method_18380(a2.method_18376());
        this.method_6033(a2.method_6032());
        this.method_6073(a2.method_6067());
        this.method_5838((int)field10069[0]);
        this.field_6012 = (int)field10069[1];
        this.field10068 = a2;
    }

    static {
        ___.___(18, Class5183.class);
        ____.___18_300(Class5183.class);
    }

    public static double method21027(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method21028(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_1313 method21029() {
        return class_1313.field_6308;
    }

    private static void method21030() {
        Class5836.method22890();
    }

    public static class_1309 method21031(Class5183 class5183) {
        return class5183.field10068;
    }

    private static void method21032(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method21033() {
        Class5659.method22184();
    }

    private static void method21034(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method21035(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public void method21036() {
        this.field_6039 = this.field_5973;
        this.field_6004 = this.method_36455();
        this.field_5982 = this.method_36454();
        this.method_5876();
        this.method_5790();
        this.field_6210 = (int)field10069[2];
        if (this.field_6265 > 0) {
            this.method_52539(this.field_6265, this.field_45123);
            this.field_6265 -= (int)field10069[3];
        }
        class_243 a2 = this.method_18798();
        double b2 = a2.field_1352;
        double c2 = a2.field_1351;
        double d2 = a2.field_1350;
        if (Math.abs(Class5183.method21004(a2)) < 0.003) {
            b2 = 0.0;
        }
        if (Math.abs(Class5183.method21042(a2)) < 0.003) {
            c2 = 0.0;
        }
        if (Math.abs(a2.field_1350) < Class5630.field10768) {
            d2 = 0.0;
        }
        this.method_18800(b2, c2, d2);
        this.field_6212 *= 0.98f;
        this.field_6250 *= 0.98f;
        class_243 e2 = new class_243((double)this.field_6212, (double)this.field_6227, (double)this.field_6250);
        this.method21019(e2);
    }

    public static double method21037(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static int method21038(int n2, int n3, Class278 class278, Class630 class630) {
        return Class729.method11940(n2, n3, class278, class630);
    }

    public boolean method_29504() {
        return (int)field10069[2] != 0;
    }

    private static void method21039() {
        Class6454.method24594();
    }

    public native class_1799 method_6118(class_1304 var1);

    private static void method21040(float f2) {
        Class5836.method22907(f2);
    }

    public native void method_5673(class_1304 var1, class_1799 var2);

    public native class_1306 method_6068();

    private static void method21041(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static double method21042(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method21043() {
        Class5836.method22890();
    }

    private static void method21044(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_2248 method21045() {
        return class_2246.field_10382;
    }

    public static double method21046(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static class_1309 method21047(Class5183 class5183) {
        return Class5183.method21049(class5183);
    }

    private static void method21048(float f2) {
        Class5836.method22907(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected float method_23326() {
        float f2;
        class_2680 a2 = this.method_37908().method_8320(this.method_24515());
        float b2 = a2.method_26204().method_23349();
        int n2 = !a2.method_27852(Class5183.method21014()) ? 37019 : 37020;
        while (true) {
            int n3;
            if ((n3 = n2) == 37019) {
                if (a2.method_27852(class_2246.field_10422)) return b2;
                if ((double)b2 == 1.0) break;
                f2 = b2;
                return f2;
            }
            if (n3 != 37020) return b2;
            n2 = 37018;
        }
        f2 = this.method_37908().method_8320(this.method_23314()).method_26204().method_23349();
        return f2;
    }

    public static class_1309 method21049(Class5183 class5183) {
        return class5183.field10068;
    }

    public static class_1309 method21050(Class5183 class5183) {
        return class5183.field10068;
    }

    public native Iterable method_5661();

    private static void method21051() {
        Class5659.method22184();
    }

    public static double method21052(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static void method21053() {
        Class5836.method22897();
    }

    private static void method21054(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method21055(int n2, int n3, BreakESP class380, Class698 class698) {
        return Class729.method11929(n2, n3, class380, class698);
    }

    private static float method21056() {
        return Class6322.method24328();
    }

    public void method21057(class_241 a2) {
        this.field_6250 = a2.field_1343;
        this.field_6212 = a2.field_1342;
    }

    private static void method21058() {
        Class4146.method20694();
    }

    private static void method21059(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static double method21060(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static void method21061() {
        Chams.method1924();
    }

    private static class_1309 method21062(Class5183 class5183) {
        return Class5183.method21013(class5183);
    }

    public static class_1309 method21063(Class5183 class5183) {
        return class5183.field10068;
    }

    private static native Object 1(char var0);
}

