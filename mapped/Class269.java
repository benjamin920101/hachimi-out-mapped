/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1450;
import mapped.Class1562;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2299;
import mapped.Class246;
import mapped.Class248;
import mapped.Class259;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.Class277;
import mapped.Class278;
import mapped.ClickGui;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5858;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class6286;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.client.gui.DrawContext;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class269
extends Class268 {
    private boolean field355;
    private static long[] field356;
    public static boolean $skidonion$998555077;

    private static Class277 method827(Class276 class276) {
        return class276.method1228();
    }

    private static void method828() {
        Class5836.method22885();
    }

    private static void method829(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method830(long l2) {
        Class269.field356[2] = l2 ^ 0xD22376D94457FC98L;
        Class269.field356[5] = l2 ^ 0x2DDC8926BBA80366L;
        Class269.field356[9] = l2 ^ 0x2DDC8926BBA80264L;
        Class269.field356[4] = l2 ^ 0x2DDC8926BBA80365L;
        Class269.field356[6] = l2 ^ 0x2DDC8926BBA8008FL;
        Class269.field356[7] = l2 ^ 0x2DDC8926BBA80262L;
        Class269.field356[1] = l2 ^ 0xD22376D94402A9CDL;
        Class269.field356[0] = l2 ^ 0x2DDC8926BBA80398L;
        Class269.field356[8] = l2 ^ 0x2DDC8926BBA80267L;
        Class269.field356[3] = l2 ^ 0x2DDC8926BBA80367L;
    }

    private static void method831() {
        Class1745.method15538();
    }

    private static void method832(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Override
    public void method646(int a2, int b2, int c2) {
        if (Class269.method845(this)) {
            if (a2 == (int)field356[8] || a2 == (int)field356[9] || a2 == (int)field356[7]) {
                ((Class259)this.field354).method628((int)field356[2]);
            } else {
                Class269.method857((Class259)this.field354, a2);
            }
            this.field355 = (int)field356[3];
        }
    }

    @Override
    public void method825(class_332 c2, float d2, float e2, float f2, float g2, float h2) {
        this.method753(Class269.method849() + ClickGui.method2989().method2999());
        this.field340 = d2;
        this.field337 = e2;
        Class246 i2 = (Class246)this.field354.method507();
        String j2 = this.field355 ? "..." : i2.method488();
        boolean k2 = this.method740(f2, g2);
        if (k2 != this.field345.method24288()) {
            int n2 = 55400;
            Class6009.method23559(true);
            return;
        }
        int n3 = 55401;
        Class6009.method23560();
    }

    private static void method833(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public boolean method834() {
        return this.field355;
    }

    @Override
    public native void method727(char var1, int var2);

    private static ClickGui method835() {
        return ClickGui.method2989();
    }

    private static int method836(int n2, int n3, Class6286 class6286, Class2299 class2299) {
        return Class1562.method14551(n2, n3, class6286, class2299);
    }

    public void method837(boolean a2) {
        this.field355 = a2;
    }

    private static boolean method838(ClickGui class333) {
        return class333.method3011();
    }

    public static boolean method839(Class269 class269) {
        return class269.field355;
    }

    private static void method840() {
        Class1745.method15538();
    }

    public static boolean method841(Class269 class269) {
        return class269.field355;
    }

    public Class269(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
    }

    public static float method842() {
        return 1.0f;
    }

    private static void method843(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    private static void method844() {
        Class4146.method20697();
    }

    private static boolean method845(Class269 class269) {
        return Class269.method841(class269);
    }

    private static void method846() {
        Class6009.method23560();
    }

    private static String method847(Class248 class248) {
        return class248.method512();
    }

    private static void method848() {
        Class1807.method15744();
    }

    @Override
    public void method649(double b2, double c2, int d2) {
        if (this.field355) {
            ((Class259)this.field354).method628((int)field356[6] + d2);
            this.field355 = (int)field356[3];
        } else if (this.method744(b2, c2)) {
            Class277 class277;
            if (Class269.method851(this)) {
                if (d2 == 0) {
                    this.field355 = (int)field356[3];
                }
            } else if (Class1450.field5515 && (class277 = this.field353.method1228()) instanceof Class278) {
                Class278 a2 = (Class278)class277;
                if (d2 == 0) {
                    a2.method1259().method505((!((Boolean)a2.method1259().method507()).booleanValue() ? (int)field356[5] : (int)field356[3]) != 0);
                }
            } else if (d2 == 0) {
                this.field355 = !Class269.method839(this) ? (int)field356[5] : (int)field356[3];
            } else {
                if (d2 != (int)field356[4]) {
                    Class269.method829(Class5858.field11566, 0.17552626f);
                    return;
                }
                if (!this.field355) {
                    ((Class259)this.field354).method628((int)field356[2]);
                }
            }
            if (Class269.method838(ClickGui.method2989())) {
                Class5723.field11041.method22448(Class5693.field10948);
            }
        }
    }

    private static int method849() {
        return Class6454.method24637();
    }

    private static void method850(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static boolean method851(Class269 class269) {
        return class269.field355;
    }

    private static Object method852(Class248 class248) {
        return class248.method507();
    }

    private static void method853() {
        Class1807.method15744();
    }

    private static void method854() {
        Class1745.method15538();
    }

    private static double method855(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method856() {
        Class1807.method15744();
    }

    private static void method857(Class259 class259, int n2) {
        class259.method628(n2);
    }

    private static void method858() {
        Class1807.method15744();
    }

    static {
        ___.___(17, Class269.class);
        ____.___17_570(Class269.class);
    }

    private static void method859() {
        Class6454.method24594();
    }

    private static void method860() {
        Class4146.method20697();
    }

    private static void method861() {
        Class5659.method22184();
    }

    public static float method862() {
        return 1.0f;
    }

    private static ClickGui method863() {
        return ClickGui.method2989();
    }

    private static void method864(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static native Object 1(char var0);
}

