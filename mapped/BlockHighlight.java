/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.world.ClientWorld
 */
package mapped;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import mapped.Class1;
import mapped.Class150;
import mapped.Class1503;
import mapped.Class1638;
import mapped.Class164;
import mapped.Class1783;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3263;
import mapped.Class3666;
import mapped.Class4036;
import mapped.Class4045;
import mapped.AutoTrap;
import mapped.Class4259;
import mapped.Class556;
import mapped.Class570;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6454;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BlockHighlight
extends Class278 {
    Class248 field1000;
    private static long[] field1001 = new long[6];
    private final Map field1002 = new HashMap();
    Class248 field1003;
    Class248 field1004;
    Class248 field1005;
    Class248 field1006;
    Class248 field1007;
    private double field1008;
    Class248 field1009;

    private static Object method3842(Class248 class248) {
        return class248.method507();
    }

    private static Object method3843(Class248 class248) {
        return class248.method507();
    }

    private static int method3844(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static Object method3845(Class248 class248) {
        return class248.method507();
    }

    private static Object method3846(Class248 class248) {
        return class248.method507();
    }

    public static Map method3847(BlockHighlight class348) {
        return class348.field1002;
    }

    private static Object method3848(Class248 class248) {
        return class248.method507();
    }

    private static void method3849(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class248 method3850(BlockHighlight class348) {
        return class348.field1000;
    }

    private static void method3851() {
        Class1503.method14420();
    }

    private static int method3852(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static int method3853(int n2, int n3, Class3263 class3263, Class164 class164) {
        return Class4259.method20948(n2, n3, class3263, class164);
    }

    public static Class248 method3854(BlockHighlight class348) {
        return class348.field1004;
    }

    public static class_239 method3855(class_310 class_3102) {
        return class_3102.field_1765;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method3856(Class59 m2) {
        if (BlockHighlight.field290.field_1687 == null) {
            return;
        }
        int n2 = 16025;
        Class4036.method20085(0.39446837f, Class1638.field6094, 0.64255095f, 8.072853E-4f, 0.76407963f, 0.75772804f);
    }

    private static void method3857() {
        Class1503.method14420();
    }

    private static void method3858(long l2) {
        BlockHighlight.field1001[0] = l2 ^ 0x6DC8B4D8D87782B7L;
        BlockHighlight.field1001[4] = l2 ^ 0x6DC8B4D8D87781A0L;
        BlockHighlight.field1001[5] = l2 ^ 0x6DC8B4D8D8778249L;
        BlockHighlight.field1001[2] = l2 ^ 0x6DC8B4D8D8778248L;
        BlockHighlight.field1001[3] = l2 ^ 0x6DC8B4D8D8778274L;
        BlockHighlight.field1001[1] = l2 ^ 0x6DC8B4D8D8778280L;
    }

    @Class1
    public void method3859(Class150 a2) {
        a2.method10();
    }

    private static void method3860() {
        Class6454.method24594();
    }

    public static int[] method3861() {
        return Class1783.field6680;
    }

    private static Object method3862(Class248 class248) {
        return class248.method507();
    }

    private static int method3863(int n2, int n3, Class3666 class3666, AutoTrap class418) {
        return Class4259.method20949(n2, n3, class3666, class418);
    }

    private static Object method3864(Class248 class248) {
        return class248.method507();
    }

    private static void method3865() {
        Class6009.method23560();
    }

    private static Map method3866(BlockHighlight class348) {
        return BlockHighlight.method3870(class348);
    }

    private void method3867(class_4587 a2, class_238 b2, int c2, int d2) {
        switch (BlockHighlight.method3861()[((Class570)((Object)BlockHighlight.method3862(BlockHighlight.method3850(this)))).ordinal()]) {
            case 1: {
                Class6454.method24621(a2, b2, c2);
                Class6454.method24605(a2, b2, ((Float)this.field1005.method507()).floatValue(), d2);
                break;
            }
            case 2: {
                Class6454.method24605(a2, b2, ((Float)this.field1005.method507()).floatValue(), d2);
                break;
            }
            case 3: {
                Class6454.method24621(a2, b2, c2);
            }
        }
    }

    @Override
    public String method1248() {
        class_3965 a2;
        if (BlockHighlight.method3869(field290) == null) {
            return super.method1248();
        }
        class_239 class_2392 = BlockHighlight.field290.field_1765;
        if (class_2392 instanceof class_3965 && BlockHighlight.field290.field_1687.method_8320((a2 = (class_3965)class_2392).method_17777()).method_26215()) {
            return super.method1248();
        }
        DecimalFormat b2 = new DecimalFormat("0.0");
        return b2.format(this.field1008);
    }

    public BlockHighlight() {
        super("BlockHighlight", "Highlights the block the player is facing", Class556.field2759);
        this.field1000 = this.method450(new Class260("BoxMode", "Box rendering mode", Class570.field2791, Class570.values()));
        this.field1006 = this.method450(new Class253("Debug-Entities", "Highlights entity bounding boxes for debug purposes", (boolean)field1001[2]));
        this.field1005 = this.method450(new Class252("Width", "The line width of the highlight", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(5.0f)));
        this.field1009 = this.method450(new Class251("SideColor", "The color of the sides", new Color((int)field1001[0], (int)field1001[2], (int)field1001[2], (int)field1001[3])));
        this.field1007 = this.method450(new Class251("LineColor", "The color of the lines", new Color((int)field1001[0], (int)field1001[2], (int)field1001[2], (int)field1001[0])));
        this.field1003 = this.method450(new Class253("Fade", "Fades the block highlight", (boolean)field1001[2]));
        this.field1004 = this.method450(new Class252("Fade-Time", "Timer for the fade", (int)field1001[2], (int)field1001[1], (int)field1001[4]));
    }

    @Override
    public void method1279() {
        this.field1002.clear();
    }

    private static class_239 method3868(class_310 class_3102) {
        return BlockHighlight.method3855(class_3102);
    }

    public static class_638 method3869(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Map method3870(BlockHighlight class348) {
        return class348.field1002;
    }

    static {
        BlockHighlight.method3858(7910771588913922632L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

