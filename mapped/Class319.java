/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.block.AirBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 */
package mapped;

import java.util.List;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1394;
import mapped.Class148;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class257;
import mapped.Class260;
import mapped.Class276;
import mapped.Class278;
import mapped.Class309;
import mapped.Class311;
import mapped.Class316;
import mapped.Class3531;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class409;
import mapped.Class4146;
import mapped.Class420;
import mapped.Class425;
import mapped.Class428;
import mapped.Class447;
import mapped.Class547;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class5711;
import mapped.Class5836;
import mapped.Class585;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class691;
import mapped.Class74;
import net.minecraft.entity.Entity;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class319
extends Class278 {
    Class248 field745;
    Class248 field746 = this.method450(new Class260("Selection", "How to use the blocks setting", Class547.field2710, Class319.method2665()));
    Class248 field747;
    Class248 field748;
    Class248 field749;
    private static long[] field750 = new long[6];

    private static int method2661(int n2, int n3, Class316 class316, Class1394 class1394) {
        return Class3531.method17734(n2, n3, class316, class1394);
    }

    private static void method2662() {
        Class1807.method15744();
    }

    private static void method2663(float f2) {
        Class5836.method22907(f2);
    }

    private static int method2664(int n2, int n3, Class309 class309, Class428 class428) {
        return Class3531.method17750(n2, n3, class309, class428);
    }

    private static Class547[] method2665() {
        return Class547.values();
    }

    private static Object method2666(Class248 class248) {
        return class248.method507();
    }

    private static void method2667() {
        Class4146.method20694();
    }

    private static void method2668() {
        Class5659.method22184();
    }

    private static void method2669(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static List method2670() {
        return Class5659.method22165();
    }

    private static boolean method2671(class_1297 class_12972, class_238 class_2383) {
        return Class1215.method13246(class_12972, class_2383);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method2672(class_2338 a2) {
        int n2;
        if (!Class319.method2671((class_1297)Class319.field290.field_1724, new class_238(a2))) {
            return (int)field750[4] != 0;
        }
        class_2248 b2 = Class319.field290.field_1687.method_8320(a2).method_26204();
        if (b2 instanceof class_2189) {
            return (int)field750[4] != 0;
        }
        int n3 = b2.method_9564().method_26227().method_15769() ? 37238 : 37237;
        block4: while (true) {
            switch (n3) {
                case 37238: {
                    n3 = 37236;
                    continue block4;
                }
                case 37237: {
                    return (int)field750[4] != 0;
                }
            }
            break;
        }
        if (Class319.method2666(this.field746) != Class547.field2707) {
            if (this.field746.method507() != Class547.field2706) return (int)field750[0] != 0;
            return ((List)this.field747.method507()).contains(b2);
        }
        if (((List)Class319.method2688(this.field745)).contains(b2)) {
            n2 = (int)field750[4];
            return n2 != 0;
        }
        n2 = (int)field750[0];
        return n2 != 0;
    }

    private static boolean method2673() {
        return Class447.method10252();
    }

    private static void method2674(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2675(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2676() {
        Class1503.method14420();
    }

    private static void method2677() {
        Class3979.method19561();
    }

    private static int method2678(int n2, int n3, Class409 class409, Class420 class420) {
        return Class3531.method17757(n2, n3, class409, class420);
    }

    private static void method2679(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method2680(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2681() {
        Class5659.method22184();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2682(Class210 e) {
        block5: {
            block6: {
                f = Class425.method8407();
                var3_3 = Class5659.method22137().iterator();
                if (!var3_3.hasNext()) break block5;
                d = (class_2338)var3_3.next();
                if (Class5595.method21942(d) && Class319.method2694((class_1297)Class319.field290.field_1724, new class_238(d))) {
                    return;
                }
                if (this.field748.method507() != Class319.method2689() && !Class319.field290.field_1724.method_20448() && Class319.method2703(this.field748) != Class585.field2854) break block6;
                block0: for (class_2338 a : Class5659.method22165()) {
                    block7: {
                        if (!this.method2672(a) || !Class319.field290.field_1687.method_22347(a.method_10074())) continue;
                        if (!f.method8537(a, (Integer)this.field749.method507())) break block7;
                        v0 = 36903;
                        ** GOTO lbl18
                    }
                    v0 = 36904;
                    if (true) ** GOTO lbl18
                    while (true) {
                        v0 = var7_7 = 36902;
lbl18:
                        // 3 sources

                        if (var7_7 == 36903) break;
                        if (var7_7 != 36904) continue block0;
                    }
                    return;
                }
            }
            if (Class319.method2695(Class319.method2701(this)) != Class585.field2857 && !Class319.field290.field_1724.method_20448()) {
                Class1668.method15147(-415398920, 985373715, 2097311684, 1788581164);
                return;
            }
            for (class_2338 b : Class5659.method22165()) {
                if (!this.method2672(b) || !f.method8537(b, (Integer)Class319.method2685(this.field749))) continue;
                return;
            }
            Class5836.method22907(0.9195969f);
            return;
        }
    }

    private static void method2683(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static int method2684(int n2, int n3, Class311 class311, Class691 class691) {
        return Class3531.method17751(n2, n3, class311, class691);
    }

    private static Object method2685(Class248 class248) {
        return class248.method507();
    }

    private static Object method2686(Class248 class248) {
        return class248.method507();
    }

    private static void method2687(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method2688(Class248 class248) {
        return class248.method507();
    }

    public static Class585 method2689() {
        return Class585.field2857;
    }

    private static int method2690(int n2, int n3, Class74 class74, Class148 class148) {
        return Class3531.method17752(n2, n3, class74, class148);
    }

    private static void method2691(float f2) {
        Class5836.method22907(f2);
    }

    private static int method2692(int n2, int n3, Class276 class276, Class6009 class6009) {
        return Class3531.method17735(n2, n3, class276, class6009);
    }

    private static void method2693() {
        Class5836.method22897();
    }

    private static boolean method2694(class_1297 class_12972, class_238 class_2383) {
        return Class1215.method13246(class_12972, class_2383);
    }

    private static Object method2695(Class248 class248) {
        return class248.method507();
    }

    static {
        Class319.method2704(-3434029600840107264L);
    }

    public Class319() {
        super("AntiCrawl", "Auto mine target blocks", Class556.field2758);
        class_2248[] class_2248Array = new class_2248[(int)field750[2]];
        class_2248Array[(int)Class319.field750[4]] = class_2246.field_10540;
        class_2248Array[(int)Class319.field750[0]] = class_2246.field_10443;
        class_2248Array[(int)Class319.field750[1]] = class_2246.field_22423;
        class_2248Array[(int)Class319.field750[3]] = class_2246.field_22108;
        this.field747 = this.method450(new Class257("Whitelist", "Valid block whitelist", class_2248Array));
        class_2248[] class_2248Array2 = new class_2248[(int)field750[0]];
        class_2248Array2[(int)Class319.field750[4]] = class_2246.field_10036;
        this.field745 = this.method450(new Class257("Blacklist", "Valid block blacklist", class_2248Array2));
        this.field748 = this.method450(new Class260("While", "Mining in some case", Class585.field2853, Class319.method2706()));
        this.field749 = this.method450(new Class252("Priority", "Priority of anti crawl mining", (int)field750[4], (int)field750[5], (int)field750[5]));
    }

    public static Class248 method2696(Class319 class319) {
        return class319.field748;
    }

    private static void method2697() {
        Class1807.method15744();
    }

    private static void method2698(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2699() {
        Class1503.method14420();
    }

    private static void method2700(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class248 method2701(Class319 class319) {
        return class319.field748;
    }

    private static boolean method2702(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22514(class_23382);
    }

    private static Object method2703(Class248 class248) {
        return class248.method507();
    }

    private static void method2704(long l2) {
        Class319.field750[0] = l2 ^ 0xD057E045B5BFBB01L;
        Class319.field750[5] = l2 ^ 0xD057E045B5BFBB0AL;
        Class319.field750[2] = l2 ^ 0xD057E045B5BFBB04L;
        Class319.field750[3] = l2 ^ 0xD057E045B5BFBB03L;
        Class319.field750[1] = l2 ^ 0xD057E045B5BFBB02L;
        Class319.field750[4] = l2 ^ 0xD057E045B5BFBB00L;
    }

    private static void method2705() {
        Class4146.method20697();
    }

    private static Class585[] method2706() {
        return Class585.values();
    }

    private static void method2707() {
        Class4146.method20694();
    }

    private static Class248 method2708(Class319 class319) {
        return Class319.method2696(class319);
    }

    private static boolean method2709() {
        return Class447.method10252();
    }

    private static void method2710(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

