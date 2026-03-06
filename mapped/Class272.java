/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.MathHelper
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.awt.Color;
import mapped.Class1108;
import mapped.Class248;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.BetterHotbar;
import mapped.Class3263;
import mapped.ClickGui;
import mapped.Class3792;
import mapped.Class3979;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class586;
import mapped.Class6009;
import mapped.Class6096;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class272
extends Class268 {
    private static long[] field368;
    public static boolean $skidonion$998554226;

    private static int method942(int n2, int n3, Class586 class586, Class3263 class3263) {
        return Class3792.method18361(n2, n3, class586, class3263);
    }

    @Override
    public void method825(class_332 a2, float b2, float c2, float d2, float e2, float f2) {
        this.method753(Class6454.method24637() + ClickGui.method2989().method2999());
        this.field340 = b2;
        this.field337 = c2;
        Class6283 g2 = this.field354.method516();
        boolean h2 = this.method740(d2, e2);
        if (h2 != this.field345.method24288()) {
            this.field345.method24284(h2);
        }
        int i2 = (int)(45.0 * class_3532.method_15350((double)this.field345.method24281(), (double)0.0, (double)1.0));
        this.method742(a2, g2.method24281() > Class6096.field12294 ? Class272.method952(ClickGui.method2989(), (int)field368[2] + i2, (float)g2.method24281()) : new Color((int)field368[1], (int)field368[1], (int)field368[1], i2).getRGB());
        int j2 = (int)field368[0];
        this.method771(a2, this.field354.method512(), b2 + 2.0f, c2 + ClickGui.method2989().method3018() * 1.0f, j2);
    }

    private static void method943(boolean bl2) {
        Class1108.method12918(bl2);
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    static {
        ___.___(25, Class272.class);
        ____.___25_60(Class272.class);
    }

    private static void method944() {
        Class4146.method20694();
    }

    private static void method945() {
        Class3979.method19561();
    }

    private static ClickGui method946() {
        return ClickGui.method2989();
    }

    private static void method947(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method948(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method949() {
        Class4146.method20694();
    }

    private static int method950(int n2, int n3, BetterHotbar class283, Class414 class414) {
        return Class3792.method18362(n2, n3, class283, class414);
    }

    public Class272(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
        c2.method516().method24284((Boolean)Class272.method955(c2));
    }

    private static void method951(long l2) {
        Class272.field368[0] = l2 ^ 0xC9BEB36F7FEEB957L;
        Class272.field368[3] = l2 ^ 0x36414C90801146A8L;
        Class272.field368[2] = l2 ^ 0x36414C90801146CCL;
        Class272.field368[1] = l2 ^ 0x36414C9080114657L;
        Class272.field368[4] = l2 ^ 0x36414C90801146A9L;
    }

    private static int method952(ClickGui class333, int n2, float f2) {
        return class333.method3028(n2, f2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void method649(double b2, double c2, int d2) {
        int n2 = this.method744(b2, c2) ? 43751 : 43752;
        int n3 = n2;
        if (n3 != 43751) {
            if (n3 == 43752) return;
            return;
        } else {
            if (d2 != 0) return;
            boolean a2 = (Boolean)this.field354.method507();
            if (!a2) {
                int n4 = (int)field368[4];
                while (true) {
                    // Infinite loop
                }
            }
            this.field354.method505((boolean)field368[3]);
            if (!Class272.method946().method3011()) return;
            Class5723.field11041.method22448(Class5693.field10948);
        }
    }

    private static void method953() {
        Class6009.method23561();
    }

    @Override
    public native void method646(int var1, int var2, int var3);

    private static void method954() {
        Class6009.method23561();
    }

    private static Object method955(Class248 class248) {
        return class248.method507();
    }

    @Override
    public native void method727(char var1, int var2);

    private static native Object 1(char var0);
}

