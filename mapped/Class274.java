/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.MathHelper
 *  org.apache.commons.lang3.ArrayUtils
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.math.BigDecimal;
import java.math.RoundingMode;
import mapped.Class1450;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class20;
import mapped.Class248;
import mapped.Class252;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.Class298;
import mapped.Class333;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class50;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5717;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5931;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class83;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.ArrayUtils;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class274
extends Class268 {
    private boolean field379;
    private boolean field380;
    private final Class925 field381 = new Class926();
    private final int field382;
    private char[] field383;
    private static long[] field384;
    public static boolean $skidonion$998553626;

    public boolean method1074() {
        return this.field380;
    }

    private static void method1075() {
        Class5659.method22184();
    }

    private static Object method1076(Class248 class248) {
        return class248.method507();
    }

    private static void method1077(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static float method1078() {
        return 1.0f;
    }

    static {
        ___.___(47, Class274.class);
        ____.___47_80(Class274.class);
    }

    private static void method1079() {
        Class5836.method22897();
    }

    private static void method1080() {
        Class5836.method22897();
    }

    private static int method1081(int n2, int n3, Class83 class83, Class50 class50) {
        return Class5931.method23304(n2, n3, class83, class50);
    }

    public static void method1082(Class274 class274, boolean bl2) {
        class274.field380 = bl2;
    }

    private static void method1083(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1084() {
        Class5836.method22897();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void method646(int b, int c, int d) {
        block21: {
            if (!this.field380) break block21;
            switch (b) {
                case 257: {
                    a = new String(Class274.method1108(this));
                    try {
                        if (this.field354.method507() instanceof Integer) {
                            ((Class252)this.field354).method575(Integer.parseInt(a));
                        } else if (this.field354.method507() instanceof Float) {
                            Class274.method1148((Class252)this.field354, Float.valueOf(Float.parseFloat(a)));
                        } else if (this.field354.method507() instanceof Double) {
                            ((Class252)this.field354).method575(Double.parseDouble(a));
                        }
                    }
                    catch (NumberFormatException var5_5) {
                        // empty catch block
                    }
                    if (!(this.field354.method507() instanceof Integer)) ** GOTO lbl20
                    v0 = 11442;
                    ** GOTO lbl24
lbl20:
                    // 1 sources

                    v0 = 11443;
                    if (true) ** GOTO lbl24
                    block11: while (true) {
                        v0 = 11441;
lbl24:
                        // 3 sources

                        switch (v0) {
                            case 11443: {
                                continue block11;
                            }
                            case 11442: {
                                this.field383 = String.valueOf(((Number)this.field354.method507()).intValue()).toCharArray();
                                break block11;
                            }
                            default: {
                                if (this.field354.method507() instanceof Float) {
                                    this.field383 = String.valueOf(((Number)this.field354.method507()).floatValue()).toCharArray();
                                    break block11;
                                }
                                if (!(this.field354.method507() instanceof Double)) break block11;
                                this.field383 = String.valueOf(((Number)this.field354.method507()).doubleValue()).toCharArray();
                            }
                        }
                        break;
                    }
                    this.field380 = (int)Class274.field384[4];
                    break;
                }
                case 259: {
                    if (this.field383.length == 0) break;
                    this.field383 = ArrayUtils.remove((char[])this.field383, (int)(this.field383.length - (int)Class274.field384[3]));
                    break;
                }
                case 256: {
                    if (!(this.field354.method507() instanceof Integer)) ** GOTO lbl46
                    this.field383 = String.valueOf(((Number)Class274.method1095(this.field354)).intValue()).toCharArray();
                    ** GOTO lbl61
lbl46:
                    // 1 sources

                    if (!(this.field354.method507() instanceof Float)) ** GOTO lbl49
                    v1 = 56757;
                    ** GOTO lbl53
lbl49:
                    // 1 sources

                    v1 = 56758;
                    if (true) ** GOTO lbl53
                    while (true) {
                        v1 = var6_6 = 56756;
lbl53:
                        // 3 sources

                        if (var6_6 == 56757) break;
                        if (var6_6 == 56758) {
                            continue;
                        }
                        ** GOTO lbl59
                        break;
                    }
                    this.field383 = String.valueOf(((Number)this.field354.method507()).floatValue()).toCharArray();
                    ** GOTO lbl61
lbl59:
                    // 1 sources

                    if (this.field354.method507() instanceof Double) {
                        this.field383 = String.valueOf(((Number)this.field354.method507()).doubleValue()).toCharArray();
                    }
lbl61:
                    // 5 sources

                    this.field380 = (int)Class274.field384[4];
                }
            }
        }
    }

    private static int method1085(Class333 class333) {
        return class333.method2999();
    }

    private static void method1086() {
        Class4146.method20697();
    }

    private static void method1087(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1088(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static float method1089() {
        return 1.0f;
    }

    public Class274(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
        this.field382 = ((Class252)c2).method577();
        if (c2.method507() instanceof Integer) {
            this.field383 = String.valueOf(((Number)c2.method507()).intValue()).toCharArray();
        } else if (Class274.method1120(c2) instanceof Float) {
            this.field383 = String.valueOf(((Number)c2.method507()).floatValue()).toCharArray();
        } else if (c2.method507() instanceof Double) {
            this.field383 = String.valueOf(((Number)c2.method507()).doubleValue()).toCharArray();
        }
    }

    private static void method1090() {
        Class298.method1924();
    }

    public static boolean method1091() {
        return Class1450.field5522;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void method649(double b, double c, int d) {
        block14: {
            if (!this.method744(b, c)) break block14;
            v0 = 33871;
            ** GOTO lbl9
        }
        v0 = 33872;
        if (true) ** GOTO lbl9
        block6: while (true) {
            v0 = 33870;
lbl9:
            // 3 sources

            switch (v0) {
                case 33872: {
                    continue block6;
                }
                case 33871: {
                    if (d == (int)Class274.field384[3]) {
                        if (Class274.method1122(this)) {
                            a = new String(this.field383);
                            try {
                                if (this.field354.method507() instanceof Integer) {
                                    ((Class252)this.field354).method575(Integer.parseInt(a));
                                } else if (Class274.method1098(this.field354) instanceof Float) {
                                    ((Class252)this.field354).method575(Float.valueOf(Float.parseFloat(a)));
                                } else if (Class274.method1116(this.field354) instanceof Double) {
                                    Class274.method1119((Class252)this.field354, Double.parseDouble(a));
                                }
                            }
                            catch (NumberFormatException var7_5) {
                                // empty catch block
                            }
                            Class274.method1135(this, (boolean)Class274.field384[4]);
                            Class274.method1109();
                            return;
                        }
                        this.field380 = (int)Class274.field384[3];
                    }
                    if (!Class333.method2989().method3011()) break block6;
                    Class5723.field11041.method22448(Class5693.field10948);
                    break block6;
                }
                default: {
                    Class274.method1082(this, (boolean)Class274.field384[4]);
                }
            }
            break;
        }
    }

    private static Object method1092(Class248 class248) {
        return class248.method507();
    }

    private static void method1093() {
        Class4146.method20697();
    }

    private static void method1094() {
        Class5659.method22184();
    }

    private static Object method1095(Class248 class248) {
        return class248.method507();
    }

    private static void method1096() {
        Class5836.method22885();
    }

    private static void method1097(long l2) {
        Class274.field384[6] = l2 ^ 0x25B1ACABE2ABF92AL;
        Class274.field384[4] = l2 ^ 0x25B1ACABE2ABF9D0L;
        Class274.field384[5] = l2 ^ 0x25B1ACABE2ABF9FEL;
        Class274.field384[1] = l2 ^ 0x25B1ACABE2ABF9B4L;
        Class274.field384[0] = l2 ^ 0xDA4E53541D54062FL;
        Class274.field384[2] = l2 ^ 0xDA4E53541D01537AL;
        Class274.field384[3] = l2 ^ 0x25B1ACABE2ABF9D1L;
    }

    private static Object method1098(Class248 class248) {
        return class248.method507();
    }

    public static boolean method1099(Class274 class274) {
        return class274.field380;
    }

    public static void method1100(Class274 class274, boolean bl2) {
        class274.field380 = bl2;
    }

    private static void method1101() {
        Class5836.method22897();
    }

    @Override
    public void method727(char a2, int b2) {
        if (this.field380 && (Character.isDigit(a2) || a2 == (int)field384[5])) {
            this.field383 = ArrayUtils.add((char[])this.field383, (char)a2);
        }
    }

    public static void method1102(Class274 class274, boolean bl2) {
        class274.field380 = bl2;
    }

    private static void method1103(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1104() {
        Class5836.method22890();
    }

    private static Object method1105(Class248 class248) {
        return class248.method507();
    }

    private static void method1106(Class252 class252, Number number) {
        class252.method575(number);
    }

    private static void method1107(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static char[] method1108(Class274 class274) {
        return class274.field383;
    }

    private static void method1109() {
        Class5659.method22184();
    }

    private static void method1110() {
        Class1807.method15744();
    }

    private static void method1111(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static boolean method1112(Class274 class274) {
        return class274.field379;
    }

    public static boolean method1113(Class274 class274) {
        return class274.field380;
    }

    private static int method1114(Class333 class333, int n2) {
        return class333.method3021(n2);
    }

    private static void method1115() {
        Class5836.method22885();
    }

    private static Object method1116(Class248 class248) {
        return class248.method507();
    }

    public static void method1117(Class274 class274, char[] cArray) {
        class274.field383 = cArray;
    }

    private static void method1118() {
        Class5659.method22184();
    }

    private static void method1119(Class252 class252, Number number) {
        class252.method575(number);
    }

    private static Object method1120(Class248 class248) {
        return class248.method507();
    }

    private static void method1121(long l2) {
        Class274.method1097(l2);
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    private static boolean method1122(Class274 class274) {
        return Class274.method1113(class274);
    }

    private static void method1123(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1124(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1125() {
        Class1503.method14420();
    }

    private static void method1126(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1127() {
        Class1807.method15744();
    }

    public static boolean method1128(Class274 class274) {
        return class274.field380;
    }

    private static void method1129() {
        Class5836.method22885();
    }

    public static float method1130() {
        return 1.0f;
    }

    private static void method1131(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method1132() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String method1133() {
        if (this.field381.method12595((int)field384[6])) {
            this.field379 = !this.field379 ? (int)field384[3] : (int)field384[4];
            this.field381.method12593();
        }
        if (Class274.method1112(this)) {
            int n2 = Class274.method1099(this) ? 26480 : 26481;
            block4: while (true) {
                switch (n2) {
                    case 26481: {
                        n2 = 26479;
                        continue block4;
                    }
                    case 26480: {
                        return "_";
                    }
                }
                break;
            }
        }
        return "";
    }

    private static void method1134(Class274 class274, char[] cArray) {
        Class274.method1117(class274, cArray);
    }

    private static void method1135(Class274 class274, boolean bl2) {
        Class274.method1102(class274, bl2);
    }

    public static int method1136(Class274 class274) {
        return class274.field382;
    }

    private static void method1137() {
        Class6009.method23561();
    }

    private static float method1138() {
        return Class274.method1078();
    }

    public void method1139() {
        Class274.method1100(this, (boolean)field384[4]);
    }

    private static void method1140() {
        Class4146.method20697();
    }

    public static void method1141(Class274 class274, char[] cArray) {
        class274.field383 = cArray;
    }

    private static void method1142() {
        Class5836.method22890();
    }

    private static void method1143() {
        Class1503.method14420();
    }

    private static int method1144(int n2, int n3, Class5717 class5717, Class20 class20) {
        return Class5931.method23346(n2, n3, class5717, class20);
    }

    public static float method1145() {
        return 1.0f;
    }

    public static void method1146(Class274 class274, char[] cArray) {
        class274.field383 = cArray;
    }

    private static void method1147(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method1148(Class252 class252, Number number) {
        class252.method575(number);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method825(class_332 n2, float o2, float p2, float q2, float r2, float s2) {
        Number w2;
        Number v2;
        int u2;
        block18: {
            block20: {
                float i2;
                block22: {
                    block21: {
                        block19: {
                            this.method753(Class6454.method24637() + Class274.method1085(Class333.method2989()));
                            this.field340 = o2;
                            this.field337 = p2;
                            boolean t2 = this.method740(q2, r2);
                            if (t2 != this.field345.method24288()) {
                                this.field345.method24284(t2);
                            }
                            u2 = (int)(45.0 * class_3532.method_15350((double)this.field345.method24281(), (double)0.0, (double)1.0));
                            v2 = ((Class252)this.field354).method569();
                            w2 = ((Class252)this.field354).method567();
                            if (!this.method740(q2, r2) || !Class274.method1091()) break block18;
                            i2 = (q2 - o2) / (this.field341 * Class274.method1130());
                            if (!(this.field354.method507() instanceof Integer)) break block19;
                            float a2 = v2.floatValue() + i2 * (float)(w2.intValue() - v2.intValue());
                            int b2 = (int)class_3532.method_15363((float)a2, (float)v2.intValue(), (float)w2.intValue());
                            Class274.method1106((Class252)this.field354, b2);
                            break block20;
                        }
                        if (this.field354.method507() instanceof Float) break block21;
                        if (!(Class274.method1092(this.field354) instanceof Double)) break block20;
                        break block22;
                    }
                    float c2 = v2.floatValue() + i2 * (w2.floatValue() - v2.floatValue());
                    float d2 = class_3532.method_15363((float)c2, (float)v2.floatValue(), (float)w2.floatValue());
                    BigDecimal e2 = new BigDecimal(d2);
                    d2 = e2.setScale(this.field382, RoundingMode.HALF_UP).floatValue();
                    ((Class252)this.field354).method575(Float.valueOf(d2));
                    break block20;
                }
                double f2 = v2.doubleValue() + (double)i2 * (w2.doubleValue() - v2.doubleValue());
                double g2 = class_3532.method_15350((double)f2, (double)v2.doubleValue(), (double)w2.doubleValue());
                BigDecimal h2 = new BigDecimal(g2);
                g2 = h2.setScale(Class274.method1136(this), RoundingMode.HALF_UP).doubleValue();
                ((Class252)this.field354).method575(g2);
            }
            float j2 = class_3532.method_15386((float)(this.field340 + Class274.method1089()));
            float k2 = class_3532.method_15375((float)(this.field340 + this.field341 * 1.0f - Class274.method1149()));
            if (q2 < j2) {
                while (true) {
                    // Infinite loop
                }
            }
            if (q2 >= k2) {
                this.field354.method505(w2);
            }
        }
        if (!this.field380) {
            if (this.field354.method507() instanceof Integer) {
                Class274.method1134(this, String.valueOf(((Number)Class274.method1076(this.field354)).intValue()).toCharArray());
            } else {
                int n3 = !(Class274.method1105(this.field354) instanceof Float) ? 29814 : 29813;
                block9: while (true) {
                    switch (n3) {
                        case 29814: {
                            n3 = 29812;
                            continue block9;
                        }
                        case 29813: {
                            Class274.method1146(this, String.valueOf(((Number)this.field354.method507()).floatValue()).toCharArray());
                            break block9;
                        }
                        default: {
                            if (!(this.field354.method507() instanceof Double)) break block9;
                            Class274.method1141(this, String.valueOf(((Number)this.field354.method507()).doubleValue()).toCharArray());
                        }
                    }
                    break;
                }
            }
            float l2 = (((Number)this.field354.method507()).floatValue() - v2.floatValue()) / (w2.floatValue() - v2.floatValue());
            this.method763(n2, o2, p2, l2 * this.field341 * 1.0f, this.field339 * 1.0f, Class274.method1114(Class333.method2989(), (int)field384[1] + u2));
        }
        int x2 = (int)field384[0];
        if (!this.field380) {
            Class274.method1104();
            return;
        }
        this.method771(n2, new String(this.field383) + this.method1133(), o2 + 2.0f, p2 + Class333.method2989().method3018() * Class274.method1138(), x2);
        float y2 = (float)Class6454.method24719(this.field354.method512()) * 1.0f;
        int n4 = Class274.method1128(this) ? 17977 : 17976;
        block10: while (true) {
            switch (n4) {
                case 17977: {
                    n4 = 17975;
                    continue block10;
                }
                case 17976: {
                    int m2 = (int)field384[2];
                    this.method771(n2, " " + String.valueOf(this.field354.method507()), o2 + 2.0f + y2, p2 + Class333.method2989().method3018() * 1.0f, m2);
                    return;
                }
            }
            break;
        }
    }

    private static float method1149() {
        return Class274.method1145();
    }

    private static native Object 1(char var0);
}

