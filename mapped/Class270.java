/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Formatting
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.math.MathHelper
 *  org.apache.commons.lang3.ArrayUtils
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.awt.Color;
import mapped.Class1274;
import mapped.Class1503;
import mapped.Class1530;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class261;
import mapped.Class268;
import mapped.Class275;
import mapped.Class276;
import mapped.FastProjectile;
import mapped.ClickGui;
import mapped.Class3740;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class5183;
import mapped.Class5518;
import mapped.Class552;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class596;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class683;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.util.Formatting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.ArrayUtils;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class270
extends Class268 {
    private char[] field357;
    private boolean field358;
    private static long[] field359;
    private boolean field360;
    private final Class925 field361 = new Class926();
    public static boolean $skidonion$998553992;

    private static void method865() {
        Class5836.method22890();
    }

    private static String method866(Class248 class248) {
        return class248.method512();
    }

    private static int method867(int n2, int n3, Class596 class596, Class552 class552) {
        return Class1530.method14468(n2, n3, class596, class552);
    }

    public static void method868(Class270 class270, boolean bl2) {
        class270.field358 = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method649(double a2, double b2, int c2) {
        if (!this.method744(a2, b2)) {
            Class6009.method23560();
            return;
        }
        if (c2 != 0) return;
        if (this.field358) {
            this.field354.method505(new String(this.field357));
            this.field358 = (int)field359[2];
        } else {
            this.field358 = (int)field359[3];
        }
        int n2 = !ClickGui.method2989().method3011() ? 21910 : 21909;
        block4: while (true) {
            switch (n2) {
                case 21910: {
                    n2 = 21908;
                    continue block4;
                }
                case 21909: {
                    Class270.method878(Class5723.field11041, Class5693.field10948);
                    return;
                }
            }
            break;
        }
    }

    private static void method869(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static char[] method870(Class270 class270) {
        return class270.field357;
    }

    private static void method871() {
        Class1745.method15538();
    }

    private static void method872(long l2) {
        Class270.field359[3] = l2 ^ 0x4C403C336BC769AFL;
        Class270.field359[1] = l2 ^ 0xB3BFC3CC94389651L;
        Class270.field359[4] = l2 ^ 0x4C403C336BC76954L;
        Class270.field359[0] = l2 ^ 0x4C403C336BC76951L;
        Class270.field359[2] = l2 ^ 0x4C403C336BC769AEL;
    }

    public Class270(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
        this.field357 = ((String)c2.method507()).toCharArray();
    }

    @Override
    public void method825(class_332 a2, float b2, float c2, float d2, float e2, float f2) {
        this.method753(Class6454.method24637() + ClickGui.method2989().method2999());
        this.field340 = b2;
        this.field337 = c2;
        int g2 = (int)field359[1];
        boolean h2 = this.method740(d2, e2);
        if (h2 != Class270.method886(this.field345)) {
            this.field345.method24284(h2);
        }
        int i2 = (int)(Class3740.field8456 * class_3532.method_15350((double)this.field345.method24281(), (double)0.0, (double)1.0));
        this.method742(a2, new Color((int)field359[0], (int)field359[0], (int)field359[0], i2).getRGB());
        String j2 = this.field358 ? new String(Class270.method884(this)) + this.method876() : Class270.method866(this.field354) + String.valueOf(class_124.field_1080) + " " + new String(this.field357);
        this.method771(a2, j2, b2 + 2.0f, c2 + ClickGui.method2989().method3018() * 1.0f, g2);
    }

    private static int method873(int n2, int n3, Class275 class275, Class5183 class5183) {
        return Class1530.method14455(n2, n3, class275, class5183);
    }

    private static void method874(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method875(Class270 class270, char[] cArray) {
        class270.field357 = cArray;
    }

    @Override
    public void method646(int a2, int b2, int c2) {
        if (!this.field358) {
            Class1503.method14417(Class5518.field10424, Class1274.field4975);
            return;
        }
        switch (a2) {
            case 257: {
                this.field354.method505(new String(Class270.method870(this)));
                this.field358 = (int)field359[2];
                break;
            }
            case 259: {
                if (this.field357.length == 0) break;
                this.field357 = ArrayUtils.remove((char[])this.field357, (int)(this.field357.length - (int)field359[3]));
                break;
            }
            case 256: {
                this.field357 = ((String)this.field354.method507()).toCharArray();
                Class270.method868(this, (boolean)field359[2]);
            }
        }
    }

    public String method876() {
        if (this.field361.method12595((int)field359[4])) {
            this.field360 = !this.field360 ? (int)field359[3] : (int)field359[2];
            this.field361.method12593();
        }
        if (this.field360) {
            if (this.field358) {
                return "_";
            }
        }
        return "";
    }

    public void method877() {
        this.field358 = (int)field359[2];
    }

    static {
        ___.___(51, Class270.class);
        ____.___51_310(Class270.class);
    }

    private static void method878(Class5693 class5693, class_3414 class_34142) {
        class5693.method22448(class_34142);
    }

    private static void method879(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method880() {
        Class6009.method23561();
    }

    @Override
    public void method727(char a2, int b2) {
        if (this.field358) {
            Class270.method875(this, ArrayUtils.add((char[])this.field357, (char)a2));
        }
    }

    private static void method881(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public boolean method882() {
        return this.field358;
    }

    private static void method883(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static char[] method884(Class270 class270) {
        return class270.field357;
    }

    private static void method885() {
        Class3979.method19561();
    }

    private static boolean method886(Class6283 class6283) {
        return class6283.method24288();
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    private static void method887() {
        Class5659.method22184();
    }

    private static void method888(long l2) {
        Class270.method872(l2);
    }

    private static void method889() {
        Class5836.method22897();
    }

    private static int method890(int n2, int n3, FastProjectile class291, Class683 class683) {
        return Class1530.method14460(n2, n3, class291, class683);
    }

    private static void method891() {
        Class5836.method22890();
    }

    private static native Object 1(char var0);
}

