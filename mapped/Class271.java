/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.math.MathHelper
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.util.Arrays;
import mapped.Class1108;
import mapped.Class113;
import mapped.Class13;
import mapped.Class132;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.Chams;
import mapped.AntiHunger;
import mapped.ClickGui;
import mapped.Class3843;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class475;
import mapped.Class489;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class6454;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.MathHelper;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class271
extends Class268 {
    private int field362;
    private final Class6283 field363 = new Class6283((boolean)field366[1], 200.0f, Class489.field2551);
    private boolean field364;
    private int field365;
    private static long[] field366;
    private float field367;
    public static boolean $skidonion$998554593;

    private static void method892(Class5693 class5693, class_3414 class_34142) {
        class5693.method22448(class_34142);
    }

    private static int method893(int n2, int n3, Class1807 class1807, AntiHunger class326) {
        return Class3843.method18814(n2, n3, class1807, class326);
    }

    public static float method894() {
        return 1.0f;
    }

    private static void method895() {
        Chams.method1924();
    }

    private static void method896() {
        Class1503.method14420();
    }

    public static boolean method897(Class271 class271) {
        return class271.field364;
    }

    private static int method898(int n2, int n3, Class113 class113, Class132 class132) {
        return Class3843.method18791(n2, n3, class113, class132);
    }

    private static void method899(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static double method900(Class6283 class6283) {
        return class6283.method24281();
    }

    public float method901() {
        return this.field367 * 1.0f;
    }

    @Override
    public native void method646(int var1, int var2, int var3);

    private static void method902() {
        Class4146.method20697();
    }

    private static double method903(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method904() {
        Class1745.method15538();
    }

    @Override
    public native void method727(char var1, int var2);

    public static float method905() {
        return 1.0f;
    }

    private static void method906(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static native String[] method907(int var0);

    public static float method908() {
        return 1.0f;
    }

    private static native String[] method909(int var0);

    private static void method910() {
        Class1745.method15538();
    }

    public float method911() {
        return (float)Class271.method903(this.field363);
    }

    public static Class6283 method912(Class271 class271) {
        return class271.field363;
    }

    private static void method913() {
        Class6009.method23560();
    }

    private static int method914(ClickGui class333, int n2) {
        return class333.method3021(n2);
    }

    public static int method915(Class271 class271) {
        return class271.field362;
    }

    private static ClickGui method916() {
        return ClickGui.method2989();
    }

    public static boolean method917(Class271 class271) {
        return class271.field364;
    }

    public static boolean method918(Class271 class271) {
        return class271.field364;
    }

    public static float method919() {
        return 1.0f;
    }

    private static int method920() {
        return Class6454.method24637();
    }

    private static void method921() {
        Class1807.method15744();
    }

    private static ClickGui method922() {
        return ClickGui.method2989();
    }

    private static void method923() {
        Class1745.method15538();
    }

    public static float method924() {
        return 1.0f;
    }

    private static void method925() {
        Class5836.method22890();
    }

    private static int method926() {
        return Class6454.method24637();
    }

    private static void method927(long l2) {
        Class271.field366[0] = l2 ^ 0x156D9E4521FE841EL;
        Class271.field366[3] = l2 ^ 0xEA9261BADE017BE0L;
        Class271.field366[4] = l2 ^ 0x156D9E4521ABD14BL;
        Class271.field366[1] = l2 ^ 0xEA9261BADE017BE1L;
        Class271.field366[2] = l2 ^ 0xEA9261BADE017B85L;
    }

    private static void method928() {
        Class5659.method22184();
    }

    private static int method929(int n2, int n3, Class475 class475, Class13 class13) {
        return Class3843.method18827(n2, n3, class475, class13);
    }

    private static int method930(ClickGui class333) {
        return class333.method2999();
    }

    private static boolean method931(ClickGui class333) {
        return class333.method3011();
    }

    private static void method932() {
        Class5836.method22897();
    }

    private static String method933(Enum enum_) {
        return Class5587.method21919(enum_);
    }

    private static float method934() {
        return Class271.method924();
    }

    public static class_3414 method935() {
        return Class5693.field10948;
    }

    private static void method936() {
        Class3979.method19561();
    }

    static {
        ___.___(13, Class271.class);
        ____.___13_770(Class271.class);
    }

    public static float method937() {
        return 1.0f;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void method825(class_332 d2, float e2, float f2, float g2, float h2, float i2) {
        int n2;
        if (Class271.method897(this) == this.field363.method24288()) {
            Class271.method936();
            return;
        }
        int n3 = 32031;
        boolean bl2 = true;
        do {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = n2 = 32030;
            }
            if (n2 != 32031) continue;
            this.field363.method24284(this.field364);
            break;
        } while (n2 == 32032);
        this.field367 = (float)this.field365 * ((float)Class6454.method24637() + 1.0f) + 3.0f;
        this.method753(Class271.method926() + Class271.method930(ClickGui.method2989()));
        this.field340 = e2;
        this.field337 = f2;
        String j2 = Class271.method933((Enum)this.field354.method507());
        boolean k2 = this.method740(g2, h2);
        int n4 = k2 == this.field345.method24288() ? 25394 : 25393;
        block9: while (true) {
            switch (n4) {
                case 25394: {
                    n4 = 25392;
                    continue block9;
                }
                case 25393: {
                    this.field345.method24284(k2);
                    break block9;
                }
            }
            break;
        }
        int l2 = (int)(45.0 * class_3532.method_15350((double)Class271.method900(this.field345), (double)0.0, (double)1.0));
        int m2 = Class271.method914(ClickGui.method2989(), (int)field366[2] + l2);
        this.method742(d2, m2);
        int n5 = (int)field366[0];
        this.method771(d2, this.field354.method512(), e2 + 2.0f, f2 + Class271.method916().method3018() * Class271.method905(), n5);
        float o2 = (float)Class6454.method24719(this.field354.method512()) * Class271.method934();
        int p2 = (int)field366[4];
        this.method771(d2, " " + j2, e2 + 2.0f + o2, f2 + ClickGui.method2989().method3018() * 1.0f, p2);
        if (Class271.method912(this).method24281() > (double)0.01f) {
            int n6 = 35892;
            Class3979.method19561();
            return;
        }
        int n7 = 35893;
        block10: while (true) {
            switch (n7) {
                case 35893: {
                    n7 = 35891;
                    continue block10;
                }
                case 35892: {
                    boolean b2 = Class271.method922().method2998();
                    if (b2) {
                        this.method737(this.field340, this.field337 + this.field339 * 1.0f, this.field340 + this.field341 * 1.0f, this.field337 + this.field339 * 1.0f + this.method901() * this.method911());
                    }
                    this.method763(d2, this.field340, this.field337 + this.field339 * Class271.method894(), 0.5, (double)(this.method901() * this.method911()) - 0.5, m2);
                    this.method763(d2, (double)(this.field340 + this.field341 * Class271.method937()) - 0.5, this.field337 + this.field339 * 1.0f, 0.5, (double)(this.method901() * this.method911()) - 0.5, m2);
                    this.method763(d2, (double)this.field340 + 0.5, (double)(this.field337 + this.field339 * 1.0f + this.method901() * this.method911()) - 1.0, 1.0f * (this.field341 - 1.0f), 0.5, m2);
                    int c2 = (int)field366[1];
                    Enum[] enumArray = (Enum[])((Enum)this.field354.method507()).getDeclaringClass().getEnumConstants();
                    int n8 = enumArray.length;
                    for (int i3 = (int)field366[1]; i3 < n8; ++c2, ++i3) {
                        Enum a2 = enumArray[i3];
                        if (c2 == this.field362) {
                            int n9 = n5;
                            Class271.method923();
                            return;
                        }
                        this.method771(d2, Class5587.method21926(a2.name()), e2 + ClickGui.method2989().method3018() * Class271.method908(), f2 + (this.field339 + 3.0f) * 1.0f + (float)(c2 * (Class6454.method24637() + (int)field366[3])) * 1.0f, p2);
                    }
                    this.field353.method1160(this.method901() * this.method911());
                    ((Class261)this.field344).method654(this.method901() * this.method911() * this.field353.method1176());
                    if (!b2) return;
                    this.method758();
                    return;
                }
            }
            break;
        }
    }

    private static void method938() {
        Class1503.method14420();
    }

    private static ClickGui method939() {
        return ClickGui.method2989();
    }

    private static int method940(Class271 class271) {
        return Class271.method915(class271);
    }

    private static void method941(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    public Class271(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
        this.field362 = (int)field366[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method649(double i2, double j2, int k2) {
        block20: {
            int n2;
            String[] stringArray;
            int h2;
            String[] g2;
            Enum f2;
            block21: {
                int n3;
                block19: {
                    if (this.method744(i2, j2)) break block19;
                    if (!Class271.method917(this)) return;
                    if (!this.method750(i2, j2, this.field340, this.field337 + this.field339 * Class271.method919(), this.field341 * 1.0f, this.method901() - 1.0f)) return;
                    if (k2 != 0) break block20;
                    f2 = (Enum)this.field354.method507();
                    g2 = (String[])Arrays.stream((Enum[])f2.getDeclaringClass().getEnumConstants()).map(Enum::name).toArray(Class271::method909);
                    h2 = (int)field366[1];
                    stringArray = g2;
                    n2 = stringArray.length;
                    break block21;
                }
                Enum b2 = (Enum)this.field354.method507();
                String[] c2 = (String[])Arrays.stream((Enum[])b2.getDeclaringClass().getEnumConstants()).map(Enum::name).toArray(Class271::method907);
                int d2 = (int)field366[1];
                Enum[] enumArray = (Enum[])b2.getDeclaringClass().getEnumConstants();
                int n4 = enumArray.length;
                int n5 = (int)field366[1];
                while (true) {
                    int n6;
                    if (n5 < n4) {
                        Enum a2 = enumArray[n5];
                        n6 = !b2.equals(a2) ? 36275 : 36274;
                    } else {
                        if (k2 == 0) {
                            if (this.field362 + (int)field366[3] <= c2.length - (int)field366[3]) {
                                Class1108.method12918(true);
                                return;
                            }
                            this.field362 = (int)field366[1];
                            this.field354.method505(Enum.valueOf(b2.getDeclaringClass(), c2[this.field362]));
                        } else if (k2 == (int)field366[3]) {
                            this.field365 = c2.length;
                            this.field364 = !Class271.method918(this) ? (int)field366[3] : (int)field366[1];
                            int n7 = this.field364 ? 1 : 0;
                        }
                        if (Class271.method939().method3011()) {
                            n3 = 29430;
                            break;
                        }
                        n3 = 29431;
                        break;
                    }
                    block9: while (true) {
                        switch (n6) {
                            case 36275: {
                                n6 = 36273;
                                continue block9;
                            }
                            case 36274: {
                                this.field362 = d2;
                                break block9;
                            }
                        }
                        break;
                    }
                    ++d2;
                    ++n5;
                }
                block10: while (true) {
                    switch (n3) {
                        case 29431: {
                            n3 = 29429;
                            continue block10;
                        }
                        case 29430: {
                            Class271.method892(Class5723.field11041, Class5693.field10948);
                            return;
                        }
                    }
                    break;
                }
                return;
            }
            for (int i3 = (int)field366[1]; i3 < n2; ++h2, ++i3) {
                String e2 = stringArray[i3];
                if (!this.method750(i2, j2, this.field340, this.field337 + this.field339 * 1.0f + (float)(h2 * (Class271.method920() + (int)field366[3])) * 1.0f, this.field341 * 1.0f, (float)(Class6454.method24637() + (int)field366[3]) * 1.0f)) continue;
                this.field362 = h2;
                Class3979.method19561();
                return;
            }
            this.field354.method505(Enum.valueOf(f2.getDeclaringClass(), g2[Class271.method940(this)]));
        }
        if (!Class271.method931(ClickGui.method2989())) return;
        Class5723.field11041.method22448(Class271.method935());
    }

    private static native Object 1(char var0);
}

