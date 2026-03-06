/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package mapped;

import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class244;
import mapped.Class277;
import mapped.Class278;
import mapped.Class323;
import mapped.Class339;
import mapped.Class3717;
import mapped.Class3817;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class489;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6148;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6336;
import mapped.Class6454;
import mapped.Class687;
import net.minecraft.class_332;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4210 {
    private final Class278 field9837;
    private double field9838;
    private long field9839;
    final Class339 field9840;
    private int field9841;
    private double field9842;
    private static long[] field9843 = new long[2];
    private double field9844;
    private boolean field9845;

    public void method20830(class_332 a2, long b2) {
        double c2 = Class4210.method20846(this.field9837.method1275());
        int d2 = Class4045.method20090(this.field9840.method3327(b2 - this.field9840.field896), (float)c2);
        Class4210.method20859(a2, Class4210.method20855(this.field9840, this.field9837), (float)Class244.field290.method_22683().method_4486() + (float)this.field9838, this.field9840.field935 ? this.field9840.field917 : Class4210.method20841(Class4210.method20834(this)), d2);
        if (Class4210.method20840(this.field9840)) {
            this.field9840.field917 += (float)Class6454.method24637();
            Class4036.method20085(Class3717.field8371, 0.4626621f, Class6148.field12446, 0.61872596f, 0.5118068f, 0.6459896f);
            return;
        }
        this.field9840.field902 -= (float)Class6454.method24637();
        this.field9840.field896 += field9843[1];
    }

    /*
     * Unable to fully structure code
     */
    public void method20831() {
        block6: {
            block5: {
                block3: {
                    block4: {
                        a = this.field9840.method3541(Class4210.method20844(this));
                        b = Class6454.method24719(a);
                        v0 = c = Class4210.method20852(this.field9837) != false && this.field9837.method1280() == false ? (int)Class4210.field9843[1] : (int)Class4210.field9843[0];
                        if (c != Class4210.method20835(this)) break block4;
                        v1 = 56466;
                        ** GOTO lbl12
                    }
                    v1 = 56467;
                    if (true) ** GOTO lbl12
                    do {
                        v1 = var4_4 = 56465;
lbl12:
                        // 3 sources

                        if (var4_4 == 56466) break block3;
                    } while (var4_4 == 56467);
                    break block5;
                }
                if (this.field9841 == b) break block6;
            }
            this.field9839 = System.currentTimeMillis();
            this.field9842 = c != 0 ? (double)((float)(-b) - 2.0f) : 2.0;
            this.field9845 = c;
            this.field9841 = b;
            this.field9844 = this.field9838;
        }
        d = Math.min((double)((float)(System.currentTimeMillis() - this.field9839) / (float)((Integer)this.field9840.field908.method507()).intValue()), 1.0);
        e = ((Class489)Class4210.method20845((Class4210)this).field931.method507()).method10803(d);
        Class4210.method20862(this, this.field9844 * (1.0 - e) + Class4210.method20842(this) * e);
    }

    private static void method20832() {
        Class1807.method15744();
    }

    private static void method20833(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class339 method20834(Class4210 class4210) {
        return class4210.field9840;
    }

    public static boolean method20835(Class4210 class4210) {
        return class4210.field9845;
    }

    public static Class278 method20836(Class4210 class4210) {
        return class4210.field9837;
    }

    private static void method20837() {
        Class6009.method23561();
    }

    private static void method20838() {
        Class5836.method22897();
    }

    private static int method20839(int n2, int n3, Class323 class323, Class1807 class1807) {
        return Class3817.method18719(n2, n3, class323, class1807);
    }

    private static boolean method20840(Class339 class339) {
        return Class4210.method20860(class339);
    }

    public static float method20841(Class339 class339) {
        return class339.field902;
    }

    private static double method20842(Class4210 class4210) {
        return Class4210.method20854(class4210);
    }

    private static void method20843() {
        Class1503.method14420();
    }

    private static Class278 method20844(Class4210 class4210) {
        return Class4210.method20836(class4210);
    }

    public static Class339 method20845(Class4210 class4210) {
        return class4210.field9840;
    }

    private static double method20846(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method20847() {
        Class1807.method15744();
    }

    private static void method20848() {
        Class5836.method22890();
    }

    private static void method20849() {
        Class4146.method20694();
    }

    private static void method20850(long l2) {
        Class4210.field9843[1] = l2 ^ 0x49588D920B3B0825L;
        Class4210.field9843[0] = l2 ^ 0x49588D920B3B0824L;
    }

    private static void method20851(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method20852(Class278 class278) {
        return class278.method1265();
    }

    private static void method20853() {
        Class6454.method24594();
    }

    public static double method20854(Class4210 class4210) {
        return class4210.field9842;
    }

    private static String method20855(Class339 class339, Class277 class277) {
        return class339.method3541(class277);
    }

    private static void method20856() {
        Class6009.method23561();
    }

    private static void method20857(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public Class4210(Class339 a2, Class278 b2) {
        this.field9840 = a2;
        this.field9837 = b2;
    }

    private static int method20858(int n2, int n3, Class687 class687, Class4045 class4045) {
        return Class3817.method18700(n2, n3, class687, class4045);
    }

    private static void method20859(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    static {
        Class4210.method20850(5285129821112436772L);
    }

    public static boolean method20860(Class339 class339) {
        return class339.field935;
    }

    private static int method20861(int n2, int n3, Class6336 class6336, Class278 class278) {
        return Class3817.method18698(n2, n3, class6336, class278);
    }

    public static void method20862(Class4210 class4210, double d2) {
        class4210.field9838 = d2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

