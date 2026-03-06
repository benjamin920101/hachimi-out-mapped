/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_746
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class1450;
import mapped.Class1462;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class210;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class27;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class406;
import mapped.Class4110;
import mapped.Class457;
import mapped.Class489;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5762;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class6454;
import mapped.Class68;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class333
extends Class278 {
    public static float field835;
    public Class248 field836;
    Class248 field837;
    public static Class1450 field838;
    private final Class6283 field839 = new Class6283((boolean)field849[2], 300.0f, Class489.field2551);
    Class248 field840;
    private static Class333 INSTANCE;
    Class248 field841;
    Class248 field842;
    Class248 field843;
    public Class248 field844;
    Class248 field845;
    Class248 field846;
    public Class248 field847;
    public static int field848;
    private static long[] field849;
    Class248 field850;
    Class248 field851 = this.method450(new Class253("Blur", "Adds a blur background to the panels", (boolean)field849[2]));

    private static int method2984(int n2, int n3, Class27 class27, Class406 class406) {
        return Class4110.method20538(n2, n3, class27, class406);
    }

    public float method2985() {
        return (float)this.field839.method24281();
    }

    private static Object method2986(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2987(Class68 a2) {
        if (a2.method128() == Class543.field2691 && a2.method140() == this.field845) {
            if (Class333.field290.field_1687 == null) {
                d\u200e = ((Float)this.field845.method507()).floatValue();
            }
        }
    }

    @Override
    public void method1274() {
        if (Class333.field290.field_1724 == null || Class333.field290.field_1687 == null) {
            this.method1273();
            return;
        }
        field848 = (Integer)this.field850.method507() + (int)field849[5];
        field835 = 2.5f + (float)((Integer)this.field850.method507()).intValue() / 2.0f;
        this.field839.method24284((boolean)field849[3]);
        this.field839.method24280();
        field290.method_1507(this.method3020());
    }

    static {
        field849 = new long[12];
        Class333.method3023(-2237513891722289416L);
    }

    private static void method2988() {
        Class6454.method24594();
    }

    public static Class333 method2989() {
        return INSTANCE;
    }

    public int method2990(int a2) {
        float b2 = this.method2996();
        if (b2 == 1.0f) {
            return a2;
        }
        float c2 = a2 >> (int)field849[9] & (int)field849[10];
        b2 = Math.max(0.0f, Math.min(1.0f, b2));
        int d2 = Math.max((int)field849[2], (int)(c2 * b2));
        int n2 = a2;
        return d2 << (int)field849[9] | ((int)field849[11] | ~n2) - ~n2;
    }

    public int method2991() {
        return Class333.method3007().method10618((int)(100.0 * Class333.method3022(this.field839))).getRGB();
    }

    private static void method2992(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static int method2993() {
        return field848;
    }

    public boolean method2994() {
        return (Boolean)this.field846.method507();
    }

    private static double method2995(Class6283 class6283) {
        return class6283.method24281();
    }

    public float method2996() {
        return (float)Class333.method2995(Class333.method3025(this));
    }

    public int method2997(float a2) {
        return Class457.method10620().method10618((int)((double)(100.0f * a2) * this.field839.method24281())).getRGB();
    }

    public Class333() {
        super("ClickGui", "Opens the clickgui screen", Class556.field2757, (int)field849[7]);
        this.field845 = this.method450(new Class252("Scale", "The gui scale", Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(Class5762.field11167)));
        this.field850 = this.method450(new Class252("Height", "The button height", (int)field849[2], (int)field849[5], (int)field849[4]));
        this.field843 = this.method450(new Class252("ScrollSpeed", "The speed of GUI scrolling", (int)field849[1], (int)field849[8], (int)field849[0]));
        this.field842 = this.method450(new Class253("Sounds", "Click sounds", (boolean)field849[3]));
        this.field847 = this.method450(new Class253("Gear", "Draw the gear", (boolean)field849[2]));
        this.field844 = this.method450(new Class253("GrayText", "Gray text for disabled module", (boolean)field849[2]));
        this.field836 = this.method450(new Class253("ButtonShadow", "Shadow of buttons", (boolean)field849[2]));
        this.field840 = this.method450(new Class251("BackGround", "The background color", new Color((int)field849[2], (int)field849[2], (int)field849[2], (int)field849[6]), (boolean)field849[3], (boolean)field849[3]));
        this.field837 = this.method450(new Class253("Descriptions", "Shows feature descriptions", (boolean)field849[3]));
        this.field841 = this.method450(new Class253("BetterSearch", "Better search", (boolean)field849[3]));
        this.field846 = this.method450(new Class253("GlslMenu", "Enable glsl menu", (boolean)field849[3]));
        INSTANCE = this;
    }

    public boolean method2998() {
        return (Class333.method2989().method2985() == 1.0f ? (int)field849[3] : (int)field849[2]) != 0;
    }

    public int method2999() {
        return Class333.method2993();
    }

    @Class1
    public void method3000(Class210 a2) {
        if (!(Class333.field290.field_1755 instanceof Class1450)) {
            this.method1268();
        }
    }

    public static class_746 method3001(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3002() {
        Class5836.method22885();
    }

    public boolean method3003() {
        return (Boolean)Class333.method3024(this).method507();
    }

    public Color method3004() {
        return (Color)this.field840.method507();
    }

    public boolean method3005() {
        return (Boolean)this.field851.method507();
    }

    private static void method3006() {
        if (Class333.field290.field_1755 instanceof Class1450) {
            Class333.field290.field_1724.method_3137();
        }
    }

    private static Class457 method3007() {
        return Class457.method10620();
    }

    public static Class1462 method3008() {
        return Class3979.field9083;
    }

    private static void method3009() {
        Class6454.method24594();
    }

    public static Class1450 method3010() {
        return field838;
    }

    public boolean method3011() {
        return (Boolean)this.field842.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1279() {
        int n2 = Class333.method3001(field290) != null ? 34374 : 34375;
        block4: while (true) {
            switch (n2) {
                case 34375: {
                    n2 = 34373;
                    continue block4;
                }
                case 34374: {
                    if (Class333.field290.field_1687 != null) break block4;
                }
                default: {
                    return;
                }
            }
            break;
        }
        if (Class333.method3010() != null) {
            Class333.method3008().method14372();
        }
        field290.execute(Class333::method3006);
        this.field839.method24284((boolean)field849[2]);
    }

    private static void method3012() {
        Class1503.method14420();
    }

    private static void method3013(float f2) {
        Class5836.method22907(f2);
    }

    private static int method3014(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method3015() {
        Class6009.method23561();
    }

    public static void method3016(float f2) {
        d\u200e = f2;
    }

    public int method3017() {
        return (Integer)this.field843.method507();
    }

    public float method3018() {
        return field835;
    }

    public boolean method3019() {
        return (Boolean)Class333.method2986(this.field841);
    }

    public class_437 method3020() {
        Class1450.field5521 = (int)field849[2];
        Class1450.field5522 = (int)field849[2];
        Class1450.field5517 = (int)field849[2];
        Class1450.field5526 = (int)field849[2];
        if (field838 == null) {
            Class333.method3016(((Float)this.field845.method507()).floatValue());
            field838 = new Class1450(this);
            Class3979.field9083.method14361();
        }
        if (Class333.method3027() != ((Float)this.field845.method507()).floatValue()) {
            d\u200e = ((Float)this.field845.method507()).floatValue();
            field838 = new Class1450(this);
        }
        return field838;
    }

    public int method3021(int a2) {
        return Class457.method10620().method10618((int)((double)a2 * this.field839.method24281())).getRGB();
    }

    private static double method3022(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method3023(long l2) {
        Class333.field849[2] = l2 ^ 0xE0F2C0F867E41EF8L;
        Class333.field849[11] = l2 ^ 0xE0F2C0F8671BE107L;
        Class333.field849[10] = l2 ^ 0xE0F2C0F867E41E07L;
        Class333.field849[9] = l2 ^ 0xE0F2C0F867E41EE0L;
        Class333.field849[5] = l2 ^ 0xE0F2C0F867E41EFAL;
        Class333.field849[7] = l2 ^ 0xE0F2C0F867E41FA0L;
        Class333.field849[8] = l2 ^ 0xE0F2C0F867E41EE6L;
        Class333.field849[4] = l2 ^ 0xE0F2C0F867E41EFCL;
        Class333.field849[3] = l2 ^ 0xE0F2C0F867E41EF9L;
        Class333.field849[0] = l2 ^ 0xE0F2C0F867E41E9CL;
        Class333.field849[6] = l2 ^ 0xE0F2C0F867E41EC4L;
        Class333.field849[1] = l2 ^ 0xE0F2C0F867E41EFDL;
    }

    public static Class248 method3024(Class333 class333) {
        return class333.field837;
    }

    public static Class6283 method3025(Class333 class333) {
        return class333.field839;
    }

    private static void method3026(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static float method3027() {
        return 1.0f;
    }

    public int method3028(int a2, float b2) {
        return Class457.method10620().method10618((int)((double)((float)a2 * b2) * this.field839.method24281())).getRGB();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

