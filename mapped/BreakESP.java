/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import java.awt.Color;
import java.util.concurrent.ConcurrentHashMap;
import mapped.Class1;
import mapped.Class1227;
import mapped.Class1503;
import mapped.Class1562;
import mapped.Class1570;
import mapped.Class1668;
import mapped.Class1694;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3448;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Flatten;
import mapped.Class489;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5690;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6161;
import mapped.Class6207;
import mapped.Class6322;
import mapped.Class6380;
import mapped.Class6454;
import mapped.Class812;
import mapped.Class926;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BreakESP
extends Class278 {
    final Color field1269 = new Color((int)field1276[3], (int)field1276[4], (int)field1276[4]);
    final Color field1270;
    Class248 field1271;
    Class248 field1272;
    Class248 field1273;
    Class248 field1274;
    Class248 field1275;
    private static long[] field1276 = new long[10];
    Class248 field1277;
    Class248 field1278;
    Class248 field1279;
    final Color field1280 = new Color((int)field1276[0], (int)field1276[3], (int)field1276[6]);
    Class248 field1281;
    Class248 field1282;

    private static void method5056(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method5057(BreakESP class380) {
        return class380.field1275;
    }

    private static void method5058() {
        Class4146.method20697();
    }

    private static int method5059(int n2, int n3, Class1570 class1570, Flatten class426) {
        return Class1694.method15396(n2, n3, class1570, class426);
    }

    private static void method5060() {
        Class6009.method23560();
    }

    private static void method5061(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5062() {
        Class1807.method15744();
    }

    private static long method5063(Class926 class926) {
        return class926.method12592();
    }

    private static void method5064(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    static {
        BreakESP.method5093(7465060931866073292L);
    }

    private static Object method5065(Class248 class248) {
        return class248.method507();
    }

    private static void method5066() {
        Class6009.method23560();
    }

    public BreakESP() {
        super("BreakESP", "Highlights blocks that are being broken", Class556.field2759);
        this.field1270 = new Color((int)field1276[3], (int)field1276[5], (int)field1276[8]);
        this.field1275 = this.method450(new Class252("Range", "The range to render breaking blocks", Float.valueOf(Class1227.field4816), Float.valueOf(10.0f), Float.valueOf(50.0f)));
        this.field1278 = this.method450(new Class253("Progress", "", (boolean)field1276[2]));
        this.field1274 = this.method450(new Class253("Name", "", (boolean)field1276[2]));
        this.field1282 = this.method450(new Class251("Box", "", new Color((int)field1276[0], (int)field1276[0], (int)field1276[0], (int)field1276[1])));
        this.field1271 = this.method450(new Class251("Fill", "", new Color((int)field1276[0], (int)field1276[0], (int)field1276[0], (int)field1276[7])));
        this.field1277 = this.method450(new Class260("Easing", "", Class489.field2533, BreakESP.method5097()));
        this.field1273 = this.method450(new Class253("ExtraMine", "", (boolean)field1276[2]));
        this.field1279 = this.method450(new Class251("ExtraBox", "", new Color((int)field1276[0], (int)field1276[0], (int)field1276[0], (int)field1276[1])));
        this.field1281 = this.method450(new Class251("ExtraFill", "", new Color((int)field1276[0], (int)field1276[0], (int)field1276[0], (int)field1276[7])));
        this.field1272 = this.method450(new Class252("Width", "The line width of the highlight", Float.valueOf(Class6207.field12638), Float.valueOf(1.0f), Float.valueOf(Class6380.field13190)));
    }

    public static Class248 method5067(BreakESP class380) {
        return class380.field1278;
    }

    public static Color method5068(BreakESP class380) {
        return class380.field1269;
    }

    private static Object method5069(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method5070(BreakESP class380) {
        return class380.field1277;
    }

    private static void method5071() {
        Class5836.method22885();
    }

    private static void method5072() {
        Chams.method1924();
    }

    public static boolean method5073(Class6161 class6161) {
        return class6161.field12484;
    }

    private static void method5074() {
        Class1503.method14420();
    }

    private static Object method5075(Class248 class248) {
        return class248.method507();
    }

    private static void method5076(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method5077(float f2) {
        Class5836.method22907(f2);
    }

    private static double method5078(Class489 class489, double d2) {
        return class489.method10803(d2);
    }

    private static void method5079(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method5080(int n2, int n3, Class1562 class1562, Class3448 class3448) {
        return Class1694.method15368(n2, n3, class1562, class3448);
    }

    public static class_2338 method5081(Class6161 class6161) {
        return class6161.field12481;
    }

    public static double method5082(Class6161 class6161) {
        return class6161.field12482;
    }

    private static void method5083() {
        Class4146.method20697();
    }

    public static Class926 method5084(Class6161 class6161) {
        return class6161.field12485;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5085(Class59 j) {
        Class6009.method23560();
        block8: for (Class6161 d : BreakESP.method5098().field10997.values()) {
            block23: {
                block22: {
                    block17: {
                        block21: {
                            block19: {
                                block20: {
                                    block18: {
                                        a = d.method24094();
                                        if (a == null) continue;
                                        if (Class5659.method22191((double)d.field12481.method_10263() + Class812.field3591, (double)d.field12481.method_10264() + 0.5, (double)d.field12481.method_10260() + 0.5) > (double)((Float)BreakESP.method5057(this).method507()).floatValue()) {
                                            v0 = 9169;
                                            Class1668.method15147(2127953222, -779284540, 343246275, -1182763399);
                                            return;
                                        }
                                        v1 = 9170;
                                        if (true) ** GOTO lbl13
                                        block9: while (true) {
                                            v1 = 9168;
lbl13:
                                            // 2 sources

                                            switch (v1) {
                                                case 9170: {
                                                    continue block9;
                                                }
                                                case 9169: {
                                                    continue block8;
                                                }
                                            }
                                            break;
                                        }
                                        b = 0.5 * BreakESP.method5078((Class489)BreakESP.method5070(this).method507(), 1.0 - Math.min((double)d.field12485.method12592() / d.field12482, 1.0));
                                        c = new class_238(d.field12481).method_1002(b, b, b).method_1002(-b, -b, -b);
                                        Class6454.method24711(j.method125(), c, ((Color)this.field1271.method507()).getRGB());
                                        Class6454.method24605(j.method125(), c, ((Float)this.field1272.method507()).floatValue(), ((Color)this.field1282.method507()).getRGB());
                                        if (((Boolean)this.field1274.method507()).booleanValue()) {
                                            Class6454.method24598(a.method_7334().getName(), d.field12481.method_46558().method_1031(0.0, (Boolean)this.field1278.method507() != false ? 0.15 : 0.0, 0.0), (int)BreakESP.field1276[9]);
                                        }
                                        if (!((Boolean)BreakESP.method5067(this).method507()).booleanValue()) continue;
                                        if (!BreakESP.method5087(d)) break block18;
                                        v2 = "\u00a74Failed";
                                        break block19;
                                    }
                                    if (!d.field12483) break block20;
                                    v3 = 29958;
                                    ** GOTO lbl37
                                }
                                v3 = 29959;
                                if (true) ** GOTO lbl37
                                block10: while (true) {
                                    v3 = 29957;
lbl37:
                                    // 3 sources

                                    switch (v3) {
                                        case 29959: {
                                            continue block10;
                                        }
                                        case 29958: {
                                            v4 = "Broke";
                                            Class1668.method15147(-360248898, -1661311842, -791713407, -706964082);
                                            return;
                                        }
                                    }
                                    break;
                                }
                                v2 = BreakESP.field395.format(Math.min(1.0, (double)d.field12485.method12592() / d.field12482) * 100.0);
                            }
                            v5 = d.field12481.method_46558();
                            if (!((Boolean)this.field1274.method507()).booleanValue()) break block21;
                            v6 = 17611;
                            ** GOTO lbl55
                        }
                        v6 = 17612;
                        if (true) ** GOTO lbl55
                        do {
                            v6 = var8_7 = 17610;
lbl55:
                            // 3 sources

                            if (var8_7 == 17611) break block17;
                        } while (var8_7 == 17612);
                        break block22;
                    }
                    v7 = -0.15;
                    break block23;
                }
                v7 = 0.0;
            }
            Class6454.method24598(v2, v5.method_1031(0.0, v7, 0.0), BreakESP.method5088(d) != false ? (BreakESP.field290.field_1687.method_22347(d.field12481) != false ? this.field1280 : this.field1269).getRGB() : BreakESP.method5094(BreakESP.method5068(this), this.field1280, (double)d.field12485.method12592() / BreakESP.method5082(d)).getRGB());
        }
        if (((Boolean)this.field1273.method507()).booleanValue()) {
            for (Class6161 i : BreakESP.method5089(Class5723.field11054).values()) {
                e = i.method24094();
                if (e == null) continue;
                if (!(Class5659.method22191((double)i.field12481.method_10263() + 0.5, (double)i.field12481.method_10264() + Class5690.field10934, (double)i.field12481.method_10260() + 0.5) > (double)((Float)this.field1275.method507()).floatValue())) {
                    v8 = 24781;
                    Class3979.method19561();
                    return;
                }
                var9_8 = 24780;
            }
        }
        Class6009.method23561();
    }

    private static Object method5086(Class248 class248) {
        return class248.method507();
    }

    private static boolean method5087(Class6161 class6161) {
        return BreakESP.method5073(class6161);
    }

    public static boolean method5088(Class6161 class6161) {
        return class6161.field12483;
    }

    public static ConcurrentHashMap method5089(Class5711 class5711) {
        return class5711.field10999;
    }

    private static void method5090(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5091() {
        Class4146.method20697();
    }

    private static void method5092(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5093(long l2) {
        BreakESP.field1276[6] = l2 ^ 0x6799395DAE8618C0L;
        BreakESP.field1276[8] = l2 ^ 0x6799395DAE8618ACL;
        BreakESP.field1276[4] = l2 ^ 0x6799395DAE8618CAL;
        BreakESP.field1276[0] = l2 ^ 0x6799395DAE8618CCL;
        BreakESP.field1276[7] = l2 ^ 0x6799395DAE86188AL;
        BreakESP.field1276[5] = l2 ^ 0x6799395DAE86187FL;
        BreakESP.field1276[1] = l2 ^ 0x6799395DAE8618A8L;
        BreakESP.field1276[3] = l2 ^ 0x6799395DAE861833L;
        BreakESP.field1276[2] = l2 ^ 0x6799395DAE8618CDL;
        BreakESP.field1276[9] = l2 ^ 0x9866C6A25179E733L;
    }

    private static Color method5094(Color color, Color color2, double d2) {
        return Class4045.method20089(color, color2, d2);
    }

    private static void method5095(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5096() {
        Class5659.method22184();
    }

    private static Class489[] method5097() {
        return Class489.values();
    }

    public static Class5711 method5098() {
        return Class5723.field11054;
    }

    private static void method5099(String string, class_243 class_2432, int n2) {
        Class6454.method24598(string, class_2432, n2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

