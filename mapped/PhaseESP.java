/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class1010;
import mapped.Class1108;
import mapped.Class1468;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1761;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.AntiLevitation;
import mapped.Class3291;
import mapped.Class3408;
import mapped.Class3821;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class5813;
import mapped.Class5836;
import mapped.Class586;
import mapped.Class59;
import mapped.Class60;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PhaseESP
extends Class278 {
    Class248 field1300;
    Class248 field1301;
    Class248 field1302 = this.method450(new Class253("Line", "Renders line phase blocks", (boolean)field1307[1]));
    Class248 field1303;
    Class248 field1304;
    Class248 field1305;
    Class248 field1306;
    private static long[] field1307 = new long[3];

    public static Class248 method5257(PhaseESP class384) {
        return class384.field1305;
    }

    public static Class248 method5258(PhaseESP class384) {
        return class384.field1300;
    }

    public static Class248 method5259(PhaseESP class384) {
        return class384.field1300;
    }

    private static class_4587 method5260(Class59 class59) {
        return class59.method125();
    }

    private static void method5261(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5262() {
        Class1745.method15538();
    }

    private static Class248 method5263(PhaseESP class384) {
        return PhaseESP.method5324(class384);
    }

    private static void method5264() {
        Class6454.method24594();
    }

    private static void method5265(long l2) {
        PhaseESP.method5286(l2);
    }

    public PhaseESP() {
        super("PhaseESP", "Displays safe phase blocks", Class556.field2759);
        this.field1300 = this.method450(new Class252("Width", "The line width of the render", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(5.0f)));
        this.field1306 = this.method450(new Class253("Diagonal", "Renders safe diagonal phase blocks", (boolean)field1307[1]));
        this.field1303 = this.method450(new Class253("Safe", "Highlights safe phase blocks", (boolean)field1307[0]));
        this.field1304 = this.method450(new Class251("UnsafeColor", "The color for rendering unsafe phase blocks", new Color((int)field1307[2], (int)field1307[0], (int)field1307[0]), (boolean)field1307[1], (boolean)field1307[0]));
        this.field1301 = this.method450(new Class251("ObsidianColor", "The color for rendering obsidian phase blocks", new Color((int)field1307[2], (int)field1307[2], (int)field1307[0]), (boolean)field1307[1], (boolean)field1307[0], this::method1269));
        this.field1305 = this.method450(new Class251("BedrockColor", "The color for rendering bedrock phase blocks", new Color((int)field1307[0], (int)field1307[2], (int)field1307[0]), (boolean)field1307[1], (boolean)field1307[0], this::method1278));
    }

    public static class_638 method5266(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method5267(Class248 class248) {
        return class248.method507();
    }

    private static void method5268() {
        Class4146.method20697();
    }

    private static void method5269() {
        Chams.method1924();
    }

    private static void method5270() {
        Class6009.method23560();
    }

    private static void method5271() {
        Class1745.method15538();
    }

    private static Class248 method5272(PhaseESP class384) {
        return PhaseESP.method5279(class384);
    }

    private static void method5273() {
        Class1807.method15744();
    }

    private static void method5274() {
        Class1745.method15538();
    }

    public static Class248 method5275(PhaseESP class384) {
        return class384.field1304;
    }

    private static void method5276() {
        Class4146.method20694();
    }

    private static int method5277(int n2, int n3, Class60 class60, Class3408 class3408) {
        return Class3821.method18773(n2, n3, class60, class3408);
    }

    private static void method5278(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    public static Class248 method5279(PhaseESP class384) {
        return class384.field1306;
    }

    private static int method5280(int n2, int n3, Class1468 class1468, Class3291 class3291) {
        return Class3821.method18741(n2, n3, class1468, class3291);
    }

    public static class_746 method5281(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5282() {
        Class1807.method15744();
    }

    private static Class248 method5283(PhaseESP class384) {
        return PhaseESP.method5306(class384);
    }

    public static class_2350 method5284() {
        return class_2350.field_11034;
    }

    private Boolean method1278() {
        return (Boolean)this.field1303.method507();
    }

    public static Class248 method5285(PhaseESP class384) {
        return class384.field1300;
    }

    private static void method5286(long l2) {
        PhaseESP.field1307[1] = l2 ^ 0x32A6D7759D5270FAL;
        PhaseESP.field1307[0] = l2 ^ 0x32A6D7759D5270FBL;
        PhaseESP.field1307[2] = l2 ^ 0x32A6D7759D527004L;
    }

    private static Color method5287(PhaseESP class384, class_2338 class_23382) {
        return class384.method5321(class_23382);
    }

    private static void method5288(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method5289(int n2, int n3, Class586 class586, AntiLevitation class308) {
        return Class3821.method18743(n2, n3, class586, class308);
    }

    private static void method5290() {
        Class6009.method23560();
    }

    private static void method5291(class_4587 class_45872, double d2, double d3, double d4, double d5, double d6, double d7, float f2, int n2) {
        Class6454.method24627(class_45872, d2, d3, d4, d5, d6, d7, f2, n2);
    }

    private static Class248 method5292(PhaseESP class384) {
        return PhaseESP.method5259(class384);
    }

    private static Color method5293(PhaseESP class384, class_2338 class_23382) {
        return class384.method5321(class_23382);
    }

    public static class_2350 method5294() {
        return class_2350.field_11039;
    }

    private static Color method5295(PhaseESP class384, class_2338 class_23382) {
        return class384.method5321(class_23382);
    }

    private static void method5296(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method5297(PhaseESP class384) {
        return class384.field1302;
    }

    private static void method5298() {
        Class3979.method19561();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5299(Class59 t) {
        block29: {
            block31: {
                block30: {
                    if (PhaseESP.field290.field_1724 == null || PhaseESP.field290.field_1687 == null || !PhaseESP.field290.field_1724.method_24828()) {
                        return;
                    }
                    Class6009.method23560();
                    u = PhaseESP.method5281(PhaseESP.field290).method_24515();
                    v = PhaseESP.field290.field_1724.method_19538();
                    w = v.method_10216() - (double)u.method_10263();
                    x = v.method_10215() - (double)u.method_10260();
                    var8_6 = class_2350.values();
                    var9_7 = var8_6.length;
                    block12: for (var10_8 = (int)PhaseESP.field1307[0]; var10_8 < var9_7; ++var10_8) {
                        block28: {
                            g = var8_6[var10_8];
                            if (!g.method_10166().method_10179()) continue;
                            a = u.method_10093(g);
                            if (!PhaseESP.field290.field_1687.method_8320(a).method_45474()) break block28;
                            v0 = 60558;
                            ** GOTO lbl22
                        }
                        v0 = 60559;
                        if (true) ** GOTO lbl22
                        do {
                            v0 = var13_11 = 60557;
lbl22:
                            // 3 sources

                            if (var13_11 == 60558) continue block12;
                        } while (var13_11 == 60559);
                        Class4146.method20694();
                        return;
                    }
                    if (!((Boolean)PhaseESP.method5272(this).method507()).booleanValue()) break block29;
                    l = u.method_10263();
                    m = u.method_10264();
                    n = u.method_10260();
                    o = u.method_10093(PhaseESP.method5294()).method_10093(class_2350.field_11043);
                    p = PhaseESP.method5295(this, o);
                    if (p != null && w <= 0.35 && x <= Class1010.field4184) {
                        if (!((Boolean)this.field1302.method507()).booleanValue()) {
                            h = new class_238((double)o.method_10263(), (double)o.method_10264(), (double)o.method_10260(), (double)(o.method_10263() + (int)PhaseESP.field1307[1]), (double)o.method_10264() + 0.01, (double)(o.method_10260() + (int)PhaseESP.field1307[1]));
                            PhaseESP.method5278(t.method125(), h, p.getRGB());
                            Class6454.method24605(t.method125(), h, ((Float)PhaseESP.method5307(this).method507()).floatValue(), p.getRGB());
                            while (true) {
                                // Infinite loop
                            }
                        }
                        Class6454.method24627(t.method125(), l, m, n, l, m + 1.0, n, ((Float)PhaseESP.method5310(this).method507()).floatValue(), p.getRGB());
                    }
                    if ((q = this.method5321(o = u.method_10093(class_2350.field_11039).method_10093(class_2350.field_11035))) == null || !(w <= Class1761.field6605)) break block30;
                    if (x >= 0.65) {
                        v1 = 61501;
                        PhaseESP.method5276();
                        return;
                    }
                    v2 = 61502;
                    if (true) ** GOTO lbl50
                    block15: while (true) {
                        v2 = 61500;
lbl50:
                        // 2 sources

                        switch (v2) {
                            case 61502: {
                                continue block15;
                            }
                            case 61501: {
                                if (!((Boolean)this.field1302.method507()).booleanValue()) {
                                    i = new class_238((double)o.method_10263(), (double)o.method_10264(), (double)o.method_10260(), (double)(o.method_10263() + (int)PhaseESP.field1307[1]), (double)o.method_10264() + 0.01, (double)(o.method_10260() + (int)PhaseESP.field1307[1]));
                                    Class6454.method24621(t.method125(), i, q.getRGB());
                                    Class6454.method24605(t.method125(), i, ((Float)this.field1300.method507()).floatValue(), q.getRGB());
                                    break block15;
                                }
                                Class6454.method24627(t.method125(), l, m, n + 1.0, l, m + 1.0, n + 1.0, ((Float)PhaseESP.method5258(this).method507()).floatValue(), q.getRGB());
                            }
                        }
                        break;
                    }
                }
                if ((r = PhaseESP.method5287(this, o = u.method_10093(PhaseESP.method5284()).method_10093(class_2350.field_11043))) != null) {
                    v3 = 3887;
                    Class5659.method22184();
                    return;
                }
                v4 = 3888;
                if (true) ** GOTO lbl69
                block16: while (true) {
                    v4 = 3886;
lbl69:
                    // 2 sources

                    switch (v4) {
                        case 3888: {
                            continue block16;
                        }
                        case 3887: {
                            if (!(w >= 0.65) || !(x <= 0.35)) break block16;
                            if (!((Boolean)this.field1302.method507()).booleanValue()) {
                                Class5836.method22890();
                                return;
                            }
                            while (true) {
                                // Infinite loop
                            }
                        }
                    }
                    break;
                }
                o = u.method_10093(class_2350.field_11034).method_10093(class_2350.field_11035);
                s = PhaseESP.method5293(this, o);
                if (s == null) break block29;
                if (!(w >= 0.65)) break block31;
                v5 = 51786;
                ** GOTO lbl91
            }
            v5 = 51787;
            if (true) ** GOTO lbl91
            block18: while (true) {
                v5 = 51785;
lbl91:
                // 3 sources

                switch (v5) {
                    case 51787: {
                        continue block18;
                    }
                    case 51786: {
                        if (!(x >= Class5813.field11326)) break block18;
                        if (((Boolean)this.field1302.method507()).booleanValue()) ** GOTO lbl99
                        v6 = 37623;
                        if (true) ** GOTO lbl104
lbl99:
                        // 1 sources

                        v7 = 37624;
                        Class1807.method15744();
                        return;
                        while (true) {
                            v6 = var35_21 = 37622;
lbl104:
                            // 2 sources

                            if (var35_21 == 37623) break;
                            if (var35_21 == 37624) {
                                continue;
                            }
                            ** GOTO lbl112
                            break;
                        }
                        k = new class_238((double)o.method_10263(), (double)o.method_10264(), (double)o.method_10260(), (double)(o.method_10263() + (int)PhaseESP.field1307[1]), (double)o.method_10264() + 0.01, (double)(o.method_10260() + (int)PhaseESP.field1307[1]));
                        Class6454.method24621(t.method125(), k, s.getRGB());
                        Class6454.method24605(t.method125(), k, ((Float)PhaseESP.method5285(this).method507()).floatValue(), s.getRGB());
                        break block18;
lbl112:
                        // 1 sources

                        Class6454.method24627(PhaseESP.method5260(t), l + 1.0, m, n + 1.0, l + 1.0, m + 1.0, n + 1.0, ((Float)PhaseESP.method5312(this.field1300)).floatValue(), s.getRGB());
                    }
                }
                break;
            }
        }
        Class6009.method23561();
    }

    private static void method5300(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5301() {
        Class1745.method15538();
    }

    private static void method5302(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    private static Object method5303(Class248 class248) {
        return class248.method507();
    }

    private static void method5304() {
        Class3979.method19561();
    }

    public static Class248 method5305(PhaseESP class384) {
        return class384.field1300;
    }

    public static Class248 method5306(PhaseESP class384) {
        return class384.field1300;
    }

    public static Class248 method5307(PhaseESP class384) {
        return class384.field1300;
    }

    static {
        PhaseESP.method5265(3649841448180936955L);
    }

    private static void method5308() {
        Class5836.method22885();
    }

    private static void method5309(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method5310(PhaseESP class384) {
        return class384.field1300;
    }

    private static void method5311() {
        Class5659.method22184();
    }

    private static Object method5312(Class248 class248) {
        return class248.method507();
    }

    private static void method5313(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    private static void method5314(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5315() {
        Class5836.method22885();
    }

    private static void method5316(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method1269() {
        return (Boolean)this.field1303.method507();
    }

    private static void method5317() {
        Class1503.method14420();
    }

    private static void method5318() {
        Class5659.method22184();
    }

    private static void method5319(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    private static void method5320() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color method5321(class_2338 a2) {
        class_2680 b2 = PhaseESP.method5266(field290).method_8320(a2);
        if (b2.method_26215()) {
            return null;
        }
        class_2680 c2 = PhaseESP.field290.field_1687.method_8320(a2.method_10074());
        Color d2 = null;
        int n2 = c2.method_45474() ? 51607 : 51608;
        block4: while (true) {
            switch (n2) {
                case 51608: {
                    n2 = 51606;
                    continue block4;
                }
                case 51607: {
                    return (Color)PhaseESP.method5275(this).method507();
                }
            }
            break;
        }
        if ((Boolean)PhaseESP.method5303(PhaseESP.method5263(this)) == false) return d2;
        if (!Class5595.method21937(c2.method_26204())) return (Color)this.field1301.method507();
        return (Color)PhaseESP.method5257(this).method507();
    }

    private static class_4587 method5322(Class59 class59) {
        return class59.method125();
    }

    private static void method5323(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method5324(PhaseESP class384) {
        return class384.field1303;
    }

    private static void method5325() {
        Class4146.method20694();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

