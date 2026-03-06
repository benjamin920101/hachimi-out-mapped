/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Box
 *  net.minecraft.client.util.math.MatrixStack
 */
package mapped;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1531;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class218;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class28;
import mapped.Class3792;
import mapped.Class3807;
import mapped.Class4971;
import mapped.Class537;
import mapped.Class5550;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6257;
import mapped.Class6259;
import mapped.Class6283;
import mapped.Class6454;
import mapped.Class839;
import mapped.Class966;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.client.util.math.MatrixStack;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class315
extends Class278 {
    Class248 field714;
    Class248 field715;
    private static Class315 INSTANCE;
    private static long[] field716;
    Class248 field717;
    Class248 field718;
    Class248 field719;
    Class248 field720;
    Class248 field721;
    Class248 field722;
    private final Map field723 = new HashMap();
    Class248 field724;
    Class248 field725;
    Class248 field726;
    Class248 field727;
    Class248 field728;
    Class248 field729;
    Class248 field730;

    private static Class248 method2566(Class315 class315) {
        return Class315.method2601(class315);
    }

    private static Object method2567(Class248 class248) {
        return class248.method507();
    }

    private Color method2568(Class537 a2) {
        return switch (Class966.field4034[a2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> (Color)this.field727.method507();
            case 2 -> (Color)this.field729.method507();
            case 3 -> (Color)this.field728.method507();
            case 4 -> (Color)this.field726.method507();
        };
    }

    private static void method2569() {
        Class5836.method22885();
    }

    private static int method2570() {
        return Class5550.method21885();
    }

    private static void method2571(long l2) {
        Class315.field716[3] = l2 ^ 0x4C543109AC1BCCD7L;
        Class315.field716[2] = l2 ^ 0x4C543109AC1BCC87L;
        Class315.field716[5] = l2 ^ 0x4C543109AC1BCDABL;
        Class315.field716[1] = l2 ^ 0x4C543109AC1BCC78L;
        Class315.field716[6] = l2 ^ 0x4C543109AC1BCC86L;
        Class315.field716[0] = l2 ^ 0x4C543109AC1BCC0BL;
        Class315.field716[4] = l2 ^ 0x4C543109AC1BCF6FL;
    }

    private static boolean method2572(Class6259 a2, Class6259 b2) {
        block5: {
            block4: {
                if (b2.method24224() != a2.method24224()) break block4;
                if (Class315.method2600(b2) != a2.method24243()) break block4;
                if (b2.method24233() != Class315.method2596(a2)) break block4;
                if (b2.method24240() == a2.method24240()) break block5;
            }
            return (int)field716[2] != 0;
        }
        if (a2.method24222() != b2.method24222()) {
            return (int)field716[2] != 0;
        }
        return a2.equals(b2);
    }

    public static Class248 method2573(Class315 class315) {
        return class315.field724;
    }

    public static Class315 method2574() {
        return INSTANCE;
    }

    private Boolean method2575() {
        return (Boolean)this.field714.method507();
    }

    private static void method2576(class_4587 class_45872, class_238 class_2383, float f2, int n2) {
        Class6454.method24668(class_45872, class_2383, f2, n2);
    }

    private static void method2577() {
        Class1807.method15744();
    }

    private static int method2578(Class251 class251, int n2) {
        return class251.method548(n2);
    }

    private static void method2579(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Set method2580(Class4971 class4971) {
        return class4971.method20969();
    }

    public static Class248 method2581(Class315 class315) {
        return class315.field719;
    }

    private static Object method2582(Class248 class248) {
        return class248.method507();
    }

    private static Object method2583(Class248 class248) {
        return class248.method507();
    }

    static {
        field716 = new long[7];
        Class315.method2571(5500074962538187911L);
    }

    private static void method2584(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object method2585(Class248 class248) {
        return class248.method507();
    }

    public static Class315 method2586() {
        return Class315.method2574();
    }

    private static int method2587(int n2, int n3, Class28 class28, Class218 class218) {
        return Class3807.method18484(n2, n3, class28, class218);
    }

    private static void method2588(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2589() {
        Class6454.method24594();
    }

    private static int method2590(Class251 class251, int n2) {
        return class251.method548(n2);
    }

    private static void method2591() {
        Class6009.method23561();
    }

    private static boolean method2592() {
        return Class1807.method15753();
    }

    public double method2593() {
        return ((Float)this.field715.method507()).floatValue();
    }

    public Class315() {
        super("HoleESP", "Displays nearby blast resistant holes", Class556.field2759);
        this.field715 = this.method450(new Class252("Range", "Range to display holes", Float.valueOf(3.0f), Float.valueOf(5.0f), Float.valueOf(25.0f)));
        this.field719 = this.method450(new Class253("Outline", "Renders an outline around the hole", (boolean)field716[6]));
        this.field725 = this.method450(new Class253("Cross", "Renders a cross on the floor of the hole", (boolean)field716[2]));
        this.field724 = this.method450(new Class252("Size", "Render height of holes", Float.valueOf(-1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)));
        this.field718 = this.method450(new Class253("IgnoreSelf", "Ignores the hole the player is standing in", (boolean)field716[2]));
        this.field730 = this.method450(new Class253("Obsidian", "Displays obsidian holes", (boolean)field716[6]));
        this.field717 = this.method450(new Class253("Obsidian-Bedrock", "Displays mixed obsidian and bedrock holes", (boolean)field716[6]));
        this.field721 = this.method450(new Class253("Double", "Displays double holes where the player can stand in the middle of two blocks to block explosion damage", (boolean)field716[2]));
        this.field722 = this.method450(new Class253("Quad", "Displays quad holes where the player can stand in the middle of four blocks to block explosion damage", (boolean)field716[2]));
        this.field714 = this.method450(new Class253("Void", "Displays void holes in the world", (boolean)field716[2]));
        this.field727 = this.method450(new Class251("ObsidianColor", "The color for rendering obsidian holes", new Color((int)field716[1], (int)field716[2], (int)field716[2], (int)field716[3]), this::method1269));
        this.field729 = this.method450(new Class251("Obsidian-BedrockColor", "The color for rendering mixed holes", new Color((int)field716[1], (int)field716[1], (int)field716[2], (int)field716[3]), this::method1278));
        this.field728 = this.method450(new Class251("BedrockColor", "The color for rendering bedrock holes", new Color((int)field716[2], (int)field716[1], (int)field716[2], (int)field716[3])));
        this.field726 = this.method450(new Class251("VoidColor", "The color for rendering bedrock holes", new Color((int)field716[1], (int)field716[2], (int)field716[2], (int)field716[0]), this::method2575));
        this.field720 = this.method450(new Class252("Fade-Time", "Timer for the fade", (int)field716[2], (int)field716[5], (int)field716[4]));
        INSTANCE = this;
    }

    private static Class248 method2594(Class315 class315) {
        return Class315.method2581(class315);
    }

    private static boolean method2595(Class315 class315, Set set, Class6259 class6259) {
        return class315.method2604(set, class6259);
    }

    private static boolean method2596(Class6259 class6259) {
        return class6259.method24233();
    }

    private static Class537 method2597(Class6259 class6259) {
        return class6259.method24222();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Class1
    public void method2598(Class59 i) {
        if (Class315.field290.field_1724 == null) {
            return;
        }
        for (Class6259 b : Class315.method2580(Class5723.field11042)) {
            if (Class315.method2595(this, this.field723.keySet(), b)) continue;
            a = new Class6283((boolean)Class315.field716[2], ((Integer)this.field720.method507()).intValue());
            this.field723.put(b, a);
        }
        Class6009.method23560();
        for (Map.Entry h : this.field723.entrySet()) {
            block10: {
                block8: {
                    block11: {
                        block9: {
                            c = (Class6259)h.getKey();
                            d = c.method24223((class_1297)Class315.field290.field_1724);
                            if (!(d > ((Class252)this.field715).method564())) break block9;
                            ((Class6283)h.getValue()).method24284((boolean)Class315.field716[2]);
                            break block10;
                        }
                        if (!((Boolean)this.field718.method507()).booleanValue()) break block8;
                        if (!Class315.field290.field_1724.method_5829().method_994(c.method24228(Class839.field3675))) break block11;
                        v0 = 20888;
                        ** GOTO lbl26
                    }
                    v0 = 20889;
                    if (true) ** GOTO lbl26
                    while (true) {
                        v0 = var7_6 = 20887;
lbl26:
                        // 3 sources

                        if (var7_6 == 20888) break;
                        if (var7_6 == 20889) {
                            continue;
                        }
                        break block8;
                        break;
                    }
                    ((Class6283)h.getValue()).method24284((boolean)Class315.field716[2]);
                    break block10;
                }
                if ((c.method24224() || c.method24243()) && !((Boolean)this.field721.method507()).booleanValue()) ** GOTO lbl-1000
                if (c.method24233() && !((Boolean)Class315.method2583(Class315.method2602(this))).booleanValue()) {
                    Class1108.method12918(false);
                    return;
                }
                if (Class315.method2597(c) == Class537.field2656 && !((Boolean)this.field714.method507()).booleanValue()) ** GOTO lbl-1000
                if (c.method24222() == Class537.field2659 && !((Boolean)Class315.method2566(this).method507()).booleanValue() || c.method24222() == Class537.field2660 && !((Boolean)this.field717.method507()).booleanValue()) lbl-1000:
                // 3 sources

                {
                    ((Class6283)h.getValue()).method24284((boolean)Class315.field716[2]);
                } else {
                    ((Class6283)h.getValue()).method24284(this.method2604(Class5723.field11042.method20969(), c));
                }
            }
            if (((Class6283)h.getValue()).method24281() < 0.009999999776482582) continue;
            e = this.method2568(c.method24222());
            f = (int)((double)e.getAlpha() * ((Class6283)h.getValue()).method24281());
            g = (int)(Class1531.field5771 * Class315.method2605((Class6283)h.getValue()));
            this.method2608(i.method125(), c, this.method2603(c.method24222(), f), this.method2603(c.method24222(), g));
        }
        Class315.method2591();
    }

    private static void method2599() {
        Class5836.method22885();
    }

    private static boolean method2600(Class6259 class6259) {
        return class6259.method24243();
    }

    private Boolean method1278() {
        return (Boolean)Class315.method2582(this.field717);
    }

    public static Class248 method2601(Class315 class315) {
        return class315.field730;
    }

    public static Class248 method2602(Class315 class315) {
        return class315.field722;
    }

    private int method2603(Class537 a2, int b2) {
        return switch (Class966.field4034[a2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> ((Class251)this.field727).method548(b2);
            case 2 -> ((Class251)this.field729).method548(b2);
            case 3 -> Class315.method2578((Class251)this.field728, b2);
            case 4 -> Class315.method2590((Class251)this.field726, b2);
        };
    }

    private boolean method2604(Set a2, Class6259 b2) {
        return a2.stream().anyMatch(arg_0 -> Class315.method2572(b2, arg_0));
    }

    private Boolean method1269() {
        return (Boolean)this.field730.method507();
    }

    private static double method2605(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method2606(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    @Override
    public void method1279() {
        this.field723.clear();
    }

    private static void method2607(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private void method2608(class_4587 a2, Class6259 b2, int c2, int d2) {
        class_238 e2 = b2.method24228(((Float)Class315.method2567(Class315.method2573(this))).floatValue());
        Class6454.method24621(a2, e2, c2);
        if (((Boolean)Class315.method2585(Class315.method2594(this))).booleanValue()) {
            Class6454.method24605(a2, e2, 1.5f, d2);
        }
        if (((Boolean)this.field725.method507()).booleanValue()) {
            Class315.method2576(a2, e2, 2.0f, d2);
        }
    }

    private static int method2609(int n2, int n3, Class6257 class6257, Class3792 class3792) {
        return Class3807.method18492(n2, n3, class6257, class3792);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

