/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.function.BooleanBiFunction
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.ShapeContext
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.util.List;
import java.util.function.Predicate;
import mapped.Class1215;
import mapped.Class1367;
import mapped.Class1447;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class206;
import mapped.Class298;
import mapped.Class33;
import mapped.Class331;
import mapped.Class3336;
import mapped.Class354;
import mapped.Class3571;
import mapped.Class3586;
import mapped.Class376;
import mapped.Class379;
import mapped.Class3812;
import mapped.Class3835;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class447;
import mapped.Class544;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5710;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5986;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class691;
import mapped.Class71;
import mapped.Class803;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.ShapeContext;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3442 {
    public boolean field7515;
    public Class3812 field7516;
    public class_1747 field7517;
    public class_2338 field7518;
    public class_1792 field7519;
    public class_2350 field7520;
    public boolean field7521;
    public boolean field7522;
    public class_2350 field7523;
    private static long[] field7524;
    public boolean field7525 = Class1745.field6542;
    public boolean field7526;
    public boolean field7527;
    public Class607 field7528;
    public List field7529;
    public Predicate field7530;
    public boolean field7531;
    public static boolean $skidonion$890408872;

    public static class_2338 method17357(Class3442 class3442) {
        return class3442.field7518;
    }

    private static native boolean method17358(class_1297 var0);

    public static Class3850 method17359() {
        return Class5723.field11058;
    }

    private static boolean method17360(class_1297 a2) {
        int n2;
        if (!a2.method_7325()) {
            if (a2 instanceof class_1511) {
                return Class447.method10252();
            }
            n2 = (int)field7524[0];
        } else {
            n2 = (int)field7524[1];
        }
        return n2 != 0;
    }

    private static void method17361() {
        Class3979.method19561();
    }

    public static void method17362(Class3442 class3442, boolean bl2) {
        class3442.field7526 = bl2;
    }

    private static int method17363(Class3850 class3850) {
        return class3850.method18969();
    }

    private static boolean method17364(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    List method17365(class_238 a2) {
        return Class4122.field9561.field_1687.method_8333(null, a2, Class3442::method17358);
    }

    private static boolean method17366(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method17367(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static Class1447 method17368() {
        return Class5723.field11056;
    }

    /*
     * Exception decompiling
     */
    public boolean method17369(double c, boolean d, boolean e, double f) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int method17370(int n2, int n3, Class5595 class5595, Class1367 class1367) {
        return Class5986.method23493(n2, n3, class5595, class1367);
    }

    private static boolean method17371(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    private static Class3812 method17372(Class3812 class3812) {
        return class3812.method18502();
    }

    void method17373(class_2338 a2) {
        if (!Class3442.method17463(Class3442.method17444(this).method_7711().method_9564(), a2)) {
            Class1745.field6543.add(a2);
        }
        if (!this.field7515) {
            Class331.method2909().method2916(a2);
        }
    }

    public Class3442(class_2338 a2, class_1792 b2, boolean c2, Class607 d2) {
        this.field7518 = a2;
        this.field7519 = b2;
        this.field7522 = c2;
        this.field7528 = d2;
    }

    private static class_310 method17374() {
        return Class3442.method17472();
    }

    private static boolean method17375(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static boolean method17376(Class3442 class3442) {
        return class3442.field7526;
    }

    private static boolean method17377(class_1297 class_12972, double d2, boolean bl2) {
        return Class1745.method15567(class_12972, d2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method17378(double c2, boolean d2, boolean e2, double f2) {
        class_265 a2;
        class_1297 b2;
        boolean g2 = this.method17406(c2, e2);
        if (!g2) {
            return (int)field7524[1] != 0;
        }
        if (!this.field7526 && (b2 = this.method17484((a2 = this.field7517.method_7711().method_9564().method_26194((class_1922)Class3442.method17491().field_1687, this.field7518, class_3726.method_16194())).method_1096((double)Class3442.method17433(this).method_10263(), (double)this.field7518.method_10264(), (double)this.field7518.method_10260()), (boolean)field7524[0])) != null) {
            int n2 = !e2 ? 11281 : 11280;
            block4: while (true) {
                switch (n2) {
                    case 11281: {
                        n2 = 11279;
                        continue block4;
                    }
                    case 11280: {
                        if (Class1745.method15567(b2, f2, d2)) break block4;
                    }
                    default: {
                        return (int)field7524[1] != 0;
                    }
                }
                break;
            }
        }
        int h2 = Class3442.method17359().method18969();
        this.field7516.method18531(h2);
        if (this.field7520 != null) {
            Class1745.method15625(this.field7518, Class3442.method17457(this), class_1268.field_5808, this.field7525, d2);
        } else if (this.field7523 != null) {
            Class1745.method15619(this.field7518, Class3442.method17431(this), class_1268.field_5808, this.field7525, d2);
        }
        this.field7516.method18534(h2);
        Class3442.method17391(this, this.field7518);
        return (int)field7524[0] != 0;
    }

    private static int method17379(int n2, int n3, Class33 class33, Class206 class206) {
        return Class5986.method23473(n2, n3, class33, class206);
    }

    public static void method17380(Class3442 class3442, class_1747 class_17472) {
        class3442.field7517 = class_17472;
    }

    private static boolean method17381() {
        return Class3979.method19543();
    }

    private static int method17382(int n2, int n3, Class3835 class3835, Class5710 class5710) {
        return Class5986.method23483(n2, n3, class3835, class5710);
    }

    private static void method17383() {
        Class1807.method15744();
    }

    private static void method17384() {
        Class6009.method23561();
    }

    private static boolean method17385(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method17386(int n2, int n3, Class544 class544, Class3586 class3586) {
        return Class5986.method23487(n2, n3, class544, class3586);
    }

    private static boolean method17387() {
        return Class5659.method22194();
    }

    private static boolean method17388() {
        return Class408.method6431();
    }

    public static class_2338 method17389(Class3442 class3442) {
        return class3442.field7518;
    }

    private static boolean method17390(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method17391(Class3442 class3442, class_2338 class_23382) {
        class3442.method17373(class_23382);
    }

    private static boolean method17392() {
        return Class1807.method15742();
    }

    private static void method17393() {
        Class4146.method20697();
    }

    private static boolean method17394() {
        return Class376.method4987();
    }

    private static boolean method17395(class_2338 class_23382, boolean bl2, class_2248 class_22482) {
        return Class1215.method13264(class_23382, bl2, class_22482);
    }

    private static boolean method17396() {
        return Class5836.method22894();
    }

    private static boolean method17397() {
        return Class1807.method15753();
    }

    private static boolean method17398() {
        return Class376.method4987();
    }

    private static boolean method17399() {
        return Class408.method6431();
    }

    private static boolean method17400() {
        return Class447.method10252();
    }

    private static boolean method17401(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method17402() {
        Class6009.method23560();
    }

    private static boolean method17403(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static class_2350 method17404(Class3442 class3442) {
        return class3442.field7523;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method17405(double f, boolean g) {
        block16: {
            block14: {
                block15: {
                    this.field7527 = g != false && Class3442.method17439().method14262() != false ? (int)Class3442.field7524[0] : (int)Class3442.field7524[1];
                    this.field7531 = Class3442.method17395(this.field7518, (boolean)Class3442.field7524[1], null);
                    this.field7520 = Class1745.method15668(this.field7518, f);
                    if (this.field7522) ** GOTO lbl-1000
                    if (Class379.method5038().method1265()) lbl-1000:
                    // 2 sources

                    {
                        v0 = Class1745.method15561(this.field7518, f);
                    } else {
                        v0 = this.field7523 = null;
                    }
                    if (this.field7530 == null) break block14;
                    this.field7516 = Class3442.method17372(new Class3812(this.field7530, this.field7528));
                    if (Class3442.method17482(this.field7516) == null) ** GOTO lbl-1000
                    var4_3 = this.field7516.field8630.method_7909();
                    if (!(var4_3 instanceof class_1747)) break block15;
                    v1 = 52132;
                    ** GOTO lbl21
                }
                v1 = 52133;
                if (true) ** GOTO lbl21
                block4: while (true) {
                    v1 = 52131;
lbl21:
                    // 3 sources

                    switch (v1) {
                        case 52133: {
                            continue block4;
                        }
                        case 52132: {
                            v2 = a = (class_1747)var4_3;
                            break block4;
                        }
                        default: lbl-1000:
                        // 2 sources

                        {
                            v2 = (class_1747)class_1802.field_8281;
                        }
                    }
                    break;
                }
                this.field7517 = v2;
                this.field7521 = Class3442.method17435(this, Class3442.method17423(this).method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[1]);
                this.field7526 = this.method17469(this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[0]);
                break block16;
            }
            if (this.field7529 != null) {
                for (class_2248 d : this.field7529) {
                    c = d.method_8389();
                    this.field7516 = new Class3812(c, Class3442.method17419(this)).method18502();
                    if (!Class3442.method17408(this.field7516)) continue;
                    this.field7517 = c instanceof class_1747 != false ? (b = (class_1747)c) : (class_1747)class_1802.field_8281;
                    this.field7521 = this.method17469(Class3442.method17446(this).method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[1]);
                    this.field7526 = this.method17469(this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[0]);
                    while (true) {
                        // Infinite loop
                    }
                }
                if (!Class3442.method17475(this).method18523()) {
                    Class3442.method17427(this, (class_1747)class_1802.field_8281);
                    this.field7521 = this.method17469(this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[1]);
                    this.field7526 = this.method17469(this.field7517.method_7711().method_9564(), Class3442.method17478(this), class_3726.method_16194(), (boolean)Class3442.field7524[0]);
                }
            } else {
                this.field7516 = new Class3812(this.field7519, this.field7528).method18502();
                var4_5 = Class3442.method17432(this);
                this.field7517 = var4_5 instanceof class_1747 ? (e = (class_1747)var4_5) : (class_1747)class_1802.field_8281;
                this.field7521 = Class3442.method17367(this, this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)Class3442.field7524[1]);
                this.field7526 = this.method17469(this.field7517.method_7711().method_9564(), Class3442.method17389(this), class_3726.method_16194(), (boolean)Class3442.field7524[0]);
            }
        }
        if (!this.field7531 || !this.field7521) ** GOTO lbl-1000
        if (!this.field7527 && !this.field7526 || !Class3442.method17417(this.field7516)) ** GOTO lbl-1000
        if (this.field7520 != null || this.field7523 != null) {
            v3 = (int)Class3442.field7524[0];
        } else lbl-1000:
        // 3 sources

        {
            v3 = (int)Class3442.field7524[1];
        }
        return (boolean)v3;
    }

    public boolean method17406(double e2, boolean f2) {
        this.field7527 = f2 && Class3442.method17441(Class3442.method17368()) ? (int)field7524[0] : (int)field7524[1];
        this.field7531 = (int)field7524[0];
        this.field7520 = Class3442.method17464(this.field7518, e2);
        class_2350 class_23502 = this.field7523 = this.field7522 || Class379.method5038().method1265() ? Class3442.method17447(Class3442.method17429(this), e2) : null;
        if (Class3442.method17490(this) != null) {
            class_1747 a2;
            this.field7516 = new Class3812(this.field7530, this.field7528).method18502();
            class_1792 class_17922 = this.field7519;
            this.field7517 = class_17922 instanceof class_1747 ? (a2 = (class_1747)class_17922) : (class_1747)class_1802.field_8281;
            this.field7521 = Class3442.method17403(this, Class3442.method17424(this).method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[1]);
            this.field7526 = Class3442.method17471(this, this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[0]);
        } else if (this.field7529 == null) {
            this.field7516 = new Class3812(this.field7519, this.field7528).method18502();
            this.field7517 = (class_1747)class_1802.field_8281;
            this.field7521 = this.method17469(this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[1]);
            this.field7526 = this.method17469(this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[0]);
        } else {
            for (class_2248 d2 : this.field7529) {
                class_1747 b2;
                class_1792 c2 = d2.method_8389();
                this.field7516 = new Class3812(c2, this.field7528).method18502();
                if (!Class3442.method17407(this.field7516)) continue;
                Class3442.method17380(this, c2 instanceof class_1747 ? (b2 = (class_1747)c2) : (class_1747)class_1802.field_8281);
                this.field7521 = Class3442.method17371(this, this.field7517.method_7711().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[1]);
                this.field7526 = Class3442.method17452(this, this.field7517.method_7711().method_9564(), Class3442.method17486(this), class_3726.method_16194(), (boolean)field7524[0]);
                break;
            }
            if (!Class3442.method17410(this.field7516)) {
                Class3442.method17445(this, Class3442.method17479(this, class_2246.field_10540.method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[1]));
                Class3442.method17362(this, Class3442.method17456(this, Class3442.method17467().method_9564(), this.field7518, class_3726.method_16194(), (boolean)field7524[0]));
            }
        }
        return (!(!this.field7521 || !this.field7527 && !this.field7526 || !Class3442.method17477(this.field7516) || this.field7520 == null && Class3442.method17404(this) == null) ? (int)field7524[0] : (int)field7524[1]) != 0;
    }

    private static boolean method17407(Class3812 class3812) {
        return class3812.method18523();
    }

    private static boolean method17408(Class3812 class3812) {
        return class3812.method18523();
    }

    private static boolean method17409() {
        return Class408.method6431();
    }

    private static boolean method17410(Class3812 class3812) {
        return class3812.method18523();
    }

    private static class_1297 method17411(Class3442 class3442, class_265 class_2652, boolean bl2) {
        return class3442.method17484(class_2652, bl2);
    }

    public Class3442(class_2338 a2, List b2, boolean c2, Class607 d2) {
        this.field7518 = a2;
        this.field7529 = b2;
        this.field7522 = c2;
        this.field7528 = d2;
    }

    private static int method17412(int n2, int n3, Class3336 class3336, Class354 class354) {
        return Class5986.method23514(n2, n3, class3336, class354);
    }

    private static boolean method17413(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method17414(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method17415() {
        return Class5659.method22194();
    }

    private static boolean method17416() {
        return Class3979.method19539();
    }

    private static boolean method17417(Class3812 class3812) {
        return class3812.method18523();
    }

    private static int method17418(int n2, int n3, Class691 class691, Class803 class803) {
        return Class5986.method23513(n2, n3, class691, class803);
    }

    public static Class607 method17419(Class3442 class3442) {
        return class3442.field7528;
    }

    private static int method17420(int n2, int n3, Class3571 class3571, Class71 class71) {
        return Class5986.method23479(n2, n3, class3571, class71);
    }

    private static boolean method17421() {
        return Class5659.method22111();
    }

    private static void method17422() {
        Class6009.method23561();
    }

    public static class_1747 method17423(Class3442 class3442) {
        return class3442.field7517;
    }

    public static class_1747 method17424(Class3442 class3442) {
        return class3442.field7517;
    }

    private static boolean method17425() {
        return Class376.method4987();
    }

    private static boolean method17426() {
        return Class1807.method15769();
    }

    private static void method17427(Class3442 class3442, class_1747 class_17472) {
        Class3442.method17487(class3442, class_17472);
    }

    private static void method17428(long l2) {
        Class3442.field7524[0] = l2 ^ 0x62A77A1F5D8C02A3L;
        Class3442.field7524[1] = l2 ^ 0x62A77A1F5D8C02A2L;
    }

    public static class_2338 method17429(Class3442 class3442) {
        return class3442.field7518;
    }

    private static void method17430(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    static {
        ___.___(32, Class3442.class);
        ____.___32_1010(Class3442.class);
    }

    public static class_2350 method17431(Class3442 class3442) {
        return class3442.field7523;
    }

    public static class_1792 method17432(Class3442 class3442) {
        return class3442.field7519;
    }

    private static class_2338 method17433(Class3442 class3442) {
        return Class3442.method17357(class3442);
    }

    private static void method17434(Class3812 class3812, int n2) {
        class3812.method18534(n2);
    }

    private static boolean method17435(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static class_2350 method17436(Class3442 class3442) {
        return class3442.field7520;
    }

    public static class_2350 method17437(Class3442 class3442) {
        return class3442.field7520;
    }

    private static boolean method17438() {
        return Class5836.method22894();
    }

    public static Class1447 method17439() {
        return Class5723.field11056;
    }

    public Class3442(class_2338 a2, Predicate b2, boolean c2, Class607 d2) {
        this.field7518 = a2;
        this.field7530 = b2;
        this.field7522 = c2;
        this.field7528 = d2;
    }

    private static boolean method17440() {
        return Class447.method10252();
    }

    private static boolean method17441(Class1447 class1447) {
        return class1447.method14262();
    }

    public static class_247 method17442() {
        return class_247.field_16896;
    }

    private static boolean method17443() {
        return Class408.method6431();
    }

    public static class_1747 method17444(Class3442 class3442) {
        return class3442.field7517;
    }

    public static void method17445(Class3442 class3442, boolean bl2) {
        class3442.field7521 = bl2;
    }

    public static class_1747 method17446(Class3442 class3442) {
        return class3442.field7517;
    }

    private static class_2350 method17447(class_2338 class_23382, double d2) {
        return Class1745.method15561(class_23382, d2);
    }

    private static boolean method17448(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method17449() {
        Class1745.method15538();
    }

    private static boolean method17450() {
        return Class5659.method22111();
    }

    public static class_2338 method17451(Class3442 class3442) {
        return class3442.field7518;
    }

    private static boolean method17452(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    private static boolean method17453() {
        return Class1807.method15753();
    }

    private static void method17454(class_2338 class_23382, class_2350 class_23502, class_1268 class_12682, boolean bl2, boolean bl3) {
        Class1745.method15625(class_23382, class_23502, class_12682, bl2, bl3);
    }

    List method17455(class_238 a2) {
        return Class4122.field9561.field_1687.method_8333(null, a2, Class3442::method17360);
    }

    private static boolean method17456(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static class_2350 method17457(Class3442 class3442) {
        return class3442.field7520;
    }

    private static boolean method17458() {
        return Class5836.method22894();
    }

    private static boolean method17459(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method17460() {
        return Class447.method10252();
    }

    private static class_310 method17461() {
        return Class3442.method17485();
    }

    private static boolean method17462(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method17463(class_2680 class_26802, class_2338 class_23382) {
        return Class1745.method15560(class_26802, class_23382);
    }

    private static class_2350 method17464(class_2338 class_23382, double d2) {
        return Class1745.method15606(class_23382, d2);
    }

    private static boolean method17465(int n2) {
        return Class4196.method20803(n2);
    }

    public static class_310 method17466() {
        return Class4122.field9561;
    }

    public static class_2248 method17467() {
        return class_2246.field_10540;
    }

    private static boolean method17468() {
        return Class3979.method19543();
    }

    boolean method17469(class_2680 a2, class_2338 b2, class_3726 c2, boolean d2) {
        if (d2 && Class1745.field6548) {
            return (int)field7524[0] != 0;
        }
        class_265 e2 = a2.method_26194((class_1922)Class3442.method17461().field_1687, b2, c2);
        return (e2.method_1110() || Class3442.method17411(this, e2.method_1096((double)b2.method_10263(), (double)b2.method_10264(), (double)b2.method_10260()), d2) == null ? (int)field7524[0] : (int)field7524[1]) != 0;
    }

    private static void method17470() {
        Class298.method1924();
    }

    private static boolean method17471(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static class_310 method17472() {
        return Class4122.field9561;
    }

    private static void method17473(Class3442 class3442, class_2338 class_23382) {
        class3442.method17373(class_23382);
    }

    private static List method17474(Class3442 class3442, class_238 class_2383) {
        return class3442.method17455(class_2383);
    }

    public static Class3812 method17475(Class3442 class3442) {
        return class3442.field7516;
    }

    private static boolean method17476() {
        return Class3979.method19544();
    }

    private static boolean method17477(Class3812 class3812) {
        return class3812.method18523();
    }

    public static class_2338 method17478(Class3442 class3442) {
        return class3442.field7518;
    }

    private static boolean method17479(Class3442 class3442, class_2680 class_26802, class_2338 class_23382, class_3726 class_37262, boolean bl2) {
        return class3442.method17469(class_26802, class_23382, class_37262, bl2);
    }

    public static class_2338 method17480(Class3442 class3442) {
        return class3442.field7518;
    }

    private static boolean method17481() {
        return Class1807.method15742();
    }

    public static class_1799 method17482(Class3812 class3812) {
        return class3812.field8630;
    }

    public void method17483(boolean c2, boolean d2, double e2) {
        if (Class3442.method17437(this) == null && this.field7523 == null || this.field7516 == null || !this.field7516.method18523()) {
            return;
        }
        if (!this.field7526) {
            class_265 a2 = this.field7517.method_7711().method_9564().method_26194((class_1922)Class3442.method17466().field_1687, this.field7518, class_3726.method_16194());
            class_1297 b2 = this.method17484(a2.method_1096((double)Class3442.method17480(this).method_10263(), (double)this.field7518.method_10264(), (double)this.field7518.method_10260()), (boolean)field7524[0]);
            if (!(b2 == null || d2 && Class3442.method17377(b2, e2, c2))) {
                return;
            }
        }
        int f2 = Class5723.field11058.method18969();
        Class3442.method17489(this.field7516, f2);
        if (this.field7520 != null) {
            Class1745.method15625(this.field7518, Class3442.method17436(this), class_1268.field_5808, this.field7525, c2);
            Class298.method1924();
            return;
        }
        if (this.field7523 != null) {
            Class1745.method15619(this.field7518, this.field7523, class_1268.field_5808, this.field7525, c2);
        }
        this.field7516.method18534(f2);
        this.method17373(this.field7518);
    }

    class_1297 method17484(class_265 b2, boolean c2) {
        if (b2.method_1110()) {
            return null;
        }
        List d2 = c2 ? this.method17365(b2.method_1107()) : Class3442.method17474(this, b2.method_1107());
        for (class_1297 a2 : d2) {
            if (a2.method_31481() || !a2.field_23807 || !class_259.method_1074((class_265)b2, (class_265)class_259.method_1078((class_238)a2.method_5829()), (class_247)Class3442.method17442())) continue;
            return a2;
        }
        return null;
    }

    public static class_310 method17485() {
        return Class4122.field9561;
    }

    private static class_2338 method17486(Class3442 class3442) {
        return Class3442.method17451(class3442);
    }

    public static void method17487(Class3442 class3442, class_1747 class_17472) {
        class3442.field7517 = class_17472;
    }

    private static boolean method17488(int n2) {
        return Class4196.method20803(n2);
    }

    private static void method17489(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    public static Predicate method17490(Class3442 class3442) {
        return class3442.field7530;
    }

    public static class_310 method17491() {
        return Class4122.field9561;
    }

    private static native Object 1(char var0);
}

