/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_124
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_5253$class_5254
 *  net.minecraft.class_8251
 *  org.joml.Matrix4f
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class117;
import mapped.Class1215;
import mapped.Class146;
import mapped.Class166;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1764;
import mapped.Class19;
import mapped.Class228;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class278;
import mapped.Class359;
import mapped.Class3630;
import mapped.Class365;
import mapped.Class388;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4218;
import mapped.Class430;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5643;
import mapped.Class5659;
import mapped.Class5692;
import mapped.Class581;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class63;
import mapped.Class635;
import mapped.Class6404;
import mapped.Class6454;
import mapped.Class68;
import mapped.Class91;
import mapped.Class93;
import net.hachimi.client.mixin.ap;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_5253;
import net.minecraft.class_8251;
import org.joml.Matrix4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class332
extends Class278 {
    private boolean field825;
    private final ExecutorService field826;
    Class248 field827;
    Class248 field828;
    Class248 field829;
    private static long[] field830 = new long[31];
    private final Map field831 = new ConcurrentHashMap();
    Class248 field832;
    Class248 field833;
    Class248 field834;

    private static Class543 method2922() {
        return Class332.method2950();
    }

    private static int method2923(int n2, int n3, Class581 class581, Class635 class635) {
        return Class3630.method17967(n2, n3, class581, class635);
    }

    public static Map method2924(Class332 class332) {
        return class332.field831;
    }

    private static void method2925() {
        Class6454.method24594();
    }

    static {
        Class332.method2936(-5014239389776523022L);
    }

    private static void method2926() {
        Class6009.method23560();
    }

    private static class_2680 method2927(Class166 class166) {
        return class166.method324();
    }

    private static void method2928() {
        Class5836.method22890();
    }

    private static void method2929() {
        Class5836.method22890();
    }

    private static void method2930(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2931(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Override
    public void method1279() {
        this.field831.clear();
    }

    public Class332() {
        super("Search", "Highlights specified blocks in the world", Class556.field2759);
        this.field826 = Executors.newSingleThreadExecutor();
        class_2248[] class_2248Array = new class_2248[(int)field830[1]];
        class_2248Array[(int)Class332.field830[18]] = class_2246.field_10316;
        class_2248Array[(int)Class332.field830[0]] = class_2246.field_10027;
        class_2248Array[(int)Class332.field830[23]] = class_2246.field_10443;
        class_2248Array[(int)Class332.field830[15]] = class_2246.field_10034;
        class_2248Array[(int)Class332.field830[2]] = class_2246.field_10380;
        class_2248Array[(int)Class332.field830[24]] = class_2246.field_10200;
        class_2248Array[(int)Class332.field830[8]] = class_2246.field_10228;
        class_2248Array[(int)Class332.field830[22]] = class_2246.field_10603;
        class_2248Array[(int)Class332.field830[25]] = class_2246.field_10371;
        class_2248Array[(int)Class332.field830[6]] = class_2246.field_10605;
        class_2248Array[(int)Class332.field830[7]] = class_2246.field_10203;
        class_2248Array[(int)Class332.field830[17]] = class_2246.field_10055;
        class_2248Array[(int)Class332.field830[9]] = class_2246.field_10532;
        class_2248Array[(int)Class332.field830[3]] = class_2246.field_10373;
        class_2248Array[(int)Class332.field830[4]] = class_2246.field_10140;
        class_2248Array[(int)Class332.field830[21]] = class_2246.field_10320;
        class_2248Array[(int)Class332.field830[19]] = class_2246.field_10275;
        class_2248Array[(int)Class332.field830[20]] = class_2246.field_10063;
        class_2248Array[(int)Class332.field830[12]] = class_2246.field_10407;
        class_2248Array[(int)Class332.field830[16]] = class_2246.field_10051;
        class_2248Array[(int)Class332.field830[11]] = class_2246.field_10268;
        class_2248Array[(int)Class332.field830[14]] = class_2246.field_10068;
        class_2248Array[(int)Class332.field830[5]] = class_2246.field_10199;
        class_2248Array[(int)Class332.field830[13]] = class_2246.field_10600;
        class_2248Array[(int)Class332.field830[26]] = class_2246.field_10260;
        class_2248Array[(int)Class332.field830[10]] = class_2246.field_10398;
        this.field833 = this.method450(new Class257("Blocks", "Valid search blocks", class_2248Array));
        this.field832 = this.method450(new Class253("Tracers", "Draws tracers to highlighted blocks", (boolean)field830[18]));
        this.field834 = this.method450(new Class252("Width", "The line width of the tracer", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(5.0f), this::method1269));
        this.field828 = this.method450(new Class253("Fill", "Fills the render", (boolean)field830[0]));
        this.field827 = this.method450(new Class253("SoftReload", "Reloads without clearing the renders", (boolean)field830[18]));
        this.field829 = this.method450(new Class253("Asynchronous", "Performs calculations on separate threads", (boolean)field830[0]));
    }

    private int method2932(class_2338 a2, class_2680 b2, int c2) {
        int d2 = b2.method_26205((class_1922)Class332.field290.field_1687, (class_2338)a2).field_16011;
        class_2248 e2 = b2.method_26204();
        if (e2 == class_2246.field_10316) {
            d2 = (int)field830[30];
        }
        int f2 = class_5253.class_5254.method_27765((int)d2);
        int g2 = class_5253.class_5254.method_27766((int)d2);
        int h2 = class_5253.class_5254.method_27767((int)d2);
        return new Color(f2, g2, h2, c2).getRGB();
    }

    private static void method2933(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method2934(int n2, int n3, Class359 class359, Class93 class93) {
        return Class3630.method17936(n2, n3, class359, class93);
    }

    private static void method2935(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private Boolean method1269() {
        return (Boolean)Class332.method2943(this).method507();
    }

    private static void method2936(long l2) {
        Class332.field830[24] = l2 ^ 0xBA69D7D7719950F7L;
        Class332.field830[1] = l2 ^ 0xBA69D7D7719950E8L;
        Class332.field830[28] = l2 ^ 0xBA69D7D77199500DL;
        Class332.field830[15] = l2 ^ 0xBA69D7D7719950F1L;
        Class332.field830[12] = l2 ^ 0xBA69D7D7719950E0L;
        Class332.field830[10] = l2 ^ 0xBA69D7D7719950EBL;
        Class332.field830[11] = l2 ^ 0xBA69D7D7719950E6L;
        Class332.field830[23] = l2 ^ 0xBA69D7D7719950F0L;
        Class332.field830[6] = l2 ^ 0xBA69D7D7719950FBL;
        Class332.field830[13] = l2 ^ 0xBA69D7D7719950E5L;
        Class332.field830[3] = l2 ^ 0xBA69D7D7719950FFL;
        Class332.field830[19] = l2 ^ 0xBA69D7D7719950E2L;
        Class332.field830[25] = l2 ^ 0xBA69D7D7719950FAL;
        Class332.field830[27] = l2 ^ 0xBA69D7D771995063L;
        Class332.field830[7] = l2 ^ 0xBA69D7D7719950F8L;
        Class332.field830[30] = l2 ^ 0x459628288E0A570DL;
        Class332.field830[20] = l2 ^ 0xBA69D7D7719950E3L;
        Class332.field830[17] = l2 ^ 0xBA69D7D7719950F9L;
        Class332.field830[18] = l2 ^ 0xBA69D7D7719950F2L;
        Class332.field830[21] = l2 ^ 0xBA69D7D7719950FDL;
        Class332.field830[5] = l2 ^ 0xBA69D7D7719950E4L;
        Class332.field830[0] = l2 ^ 0xBA69D7D7719950F3L;
        Class332.field830[8] = l2 ^ 0xBA69D7D7719950F4L;
        Class332.field830[14] = l2 ^ 0xBA69D7D7719950E7L;
        Class332.field830[26] = l2 ^ 0xBA69D7D7719950EAL;
        Class332.field830[29] = l2 ^ 0xBA69D7D7719950DAL;
        Class332.field830[4] = l2 ^ 0xBA69D7D7719950FCL;
        Class332.field830[2] = l2 ^ 0xBA69D7D7719950F6L;
        Class332.field830[22] = l2 ^ 0xBA69D7D7719950F5L;
        Class332.field830[16] = l2 ^ 0xBA69D7D7719950E1L;
        Class332.field830[9] = l2 ^ 0xBA69D7D7719950FEL;
    }

    @Class1
    public void method2937(Class68 a2) {
        if (a2.method140() == this.field833 && a2.method128() == Class332.method2945()) {
            this.method1268();
            this.method1264();
        }
    }

    private void method2938() {
        Class332.method2961(this);
    }

    private static int method2939(Class332 class332, class_2338 class_23382, class_2680 class_26802, int n2) {
        return class332.method2932(class_23382, class_26802, n2);
    }

    public static Class248 method2940(Class332 class332) {
        return class332.field828;
    }

    private static void method2941() {
        Class3979.method19561();
    }

    @Class1
    public void method2942(Class166 a2) {
        class_2680 b2 = Class332.method2927(a2);
        if (!b2.method_26215()) {
            if (this.method2944(b2) && !Class332.method2924(this).containsKey(a2.method323())) {
                this.field831.put(a2.method323(), b2);
            }
        }
    }

    public static Class248 method2943(Class332 class332) {
        return class332.field832;
    }

    private boolean method2944(class_2680 a2) {
        return Class332.method2979((Class257)this.field833, a2.method_26204());
    }

    public static Class543 method2945() {
        return Class543.field2691;
    }

    private static void method2946(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method2947(Class146 class146, class_2338 class_23382) {
        return class146.method282(class_23382);
    }

    /*
     * WARNING - void declaration
     */
    @Class1
    public void method2948(Class59 x2) {
        class_1297 class_12972 = field290.method_1560();
        if (!(class_12972 instanceof class_1657)) {
            return;
        }
        class_1657 a2 = (class_1657)class_12972;
        if (((Boolean)Class332.method2973(this).method507()).booleanValue()) {
            void y2;
            class_4587 g2 = new class_4587();
            double h2 = ((Integer)Class332.field290.field_1690.method_41808().method_41753()).intValue();
            g2.method_34425(Class332.field290.field_1773.method_22973(h2));
            Matrix4f i2 = RenderSystem.getProjectionMatrix();
            RenderSystem.setProjectionMatrix((Matrix4f)g2.method_23760().method_23761(), (class_8251)class_8251.field_43360);
            Class332.method2926();
            class_243 j2 = Class6023.method23746((class_1297)y2, x2.method124());
            class_4184 k2 = Class332.field290.field_1773.method_19418();
            double l2 = class_3532.method_16439((float)x2.method124(), (float)((ap)k2).getLastCameraY(), (float)((ap)k2).getCameraY());
            double m2 = y2.method_23317() - j2.method_10216();
            double n2 = y2.method_23318() - j2.method_10214() + l2;
            double o2 = y2.method_23321() - j2.method_10215();
            float p2 = y2.method_36455();
            float q2 = y2.method_36454();
            if (Class365.method4718().method1265()) {
                class_243 b2 = Class365.method4718().method4722();
                class_243 c2 = Class6023.method23730(b2, Class365.method4718().method4719(), Class332.method2975(x2));
                float[] d2 = Class365.method4718().method4735();
                m2 = b2.field_1352 - c2.field_1352;
                n2 = b2.field_1351 - c2.field_1351;
                o2 = b2.field_1350 - c2.field_1350;
                q2 = d2[(int)field830[18]];
                p2 = d2[(int)field830[0]];
            }
            class_243 r2 = new class_243(0.0, 0.0, 1.0).method_1037(-((float)Math.toRadians(p2))).method_1024(-((float)Math.toRadians(q2))).method_1019(new class_243(m2, n2, o2));
            for (Map.Entry f2 : this.field831.entrySet()) {
                class_2338 e2 = (class_2338)f2.getKey();
                Class332.method2951(x2.method125(), r2, e2.method_46558(), ((Float)this.field834.method507()).floatValue(), this.method2932(e2, (class_2680)f2.getValue(), (int)field830[28]));
            }
            Class6009.method23561();
            RenderSystem.setProjectionMatrix((Matrix4f)i2, (class_8251)class_8251.field_43360);
        }
        Class6009.method23560();
        for (Map.Entry entry : this.field831.entrySet()) {
            class_2338 s2 = (class_2338)entry.getKey();
            class_265 t2 = ((class_2680)entry.getValue()).method_26218((class_1922)Class332.field290.field_1687, s2);
            if (t2.method_1110()) continue;
            Class6009.method23560();
            return;
        }
        Class6009.method23561();
    }

    @Class1
    public void method2949(Class19 a2) {
        if (Class332.method2981(this, a2.method38())) {
            if (!this.field831.containsKey(a2.method37())) {
                this.field831.put(a2.method37(), a2.method38());
            }
        } else {
            this.field831.remove(a2.method37());
        }
    }

    public static Class543 method2950() {
        return Class543.field2691;
    }

    private static void method2951(class_4587 class_45872, class_243 class_2432, class_243 class_2433, float f2, int n2) {
        Class6454.method24682(class_45872, class_2432, class_2433, f2, n2);
    }

    private static int method2952(int n2, int n3, Class5643 class5643, Class1764 class1764) {
        return Class3630.method17968(n2, n3, class5643, class1764);
    }

    @Class1
    public void method2953(Class63 a2) {
        if (Class332.field290.field_1724 == null || Class332.field290.field_1687 == null || Class332.field290.field_1724.method_7325() || a2.method128() != Class332.method2922()) {
            return;
        }
        if (((Boolean)Class332.method2972(this.field829)).booleanValue()) {
            this.field826.submit(this::method2938);
        }
    }

    private static boolean method2954(Class332 class332, class_2680 class_26802) {
        return class332.method2944(class_26802);
    }

    private static void method2955() {
        Class5659.method22184();
    }

    private static List method2956() {
        return Class1215.method13254();
    }

    private static void method2957() {
        Class5836.method22897();
    }

    private static int method2958(int n2, int n3, Class388 class388, Class91 class91) {
        return Class3630.method17959(n2, n3, class388, class91);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method2959() {
        Iterator iterator = Class332.method2956().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class1108.method12918((Boolean)this.field827.method507());
                if (this.field825) {
                    return;
                }
                this.method1250(String.valueOf(class_124.field_1061) + "This module may cause lag when loading new chunks");
                this.field825 = (int)field830[0];
                return;
            }
            class_2818 h2 = (class_2818)iterator.next();
            int f2 = h2.method_12004().method_8326();
            int g2 = h2.method_12004().method_8328();
            int e2 = h2.method_31607();
            block5: while (true) {
                int n2 = e2 < h2.method_31605() ? 23259 : 23260;
                block6: while (true) {
                    switch (n2) {
                        case 23260: {
                            n2 = 23258;
                            continue block6;
                        }
                        case 23259: {
                            int d2 = f2;
                            block7: while (true) {
                                if (d2 >= f2 + (int)field830[19]) {
                                    ++e2;
                                    continue block5;
                                }
                                int c2 = g2;
                                while (true) {
                                    int n3;
                                    if (c2 >= g2 + (int)field830[19]) {
                                        Class332.method2970();
                                        return;
                                    }
                                    int n4 = 26557;
                                    while ((n3 = n4) != 26557) {
                                        if (n3 != 26558) {
                                            ++d2;
                                            continue block7;
                                        }
                                        n4 = 26556;
                                    }
                                    class_2338 a2 = new class_2338(d2, e2, c2);
                                    class_2680 b2 = h2.method_8320(a2);
                                    if (!b2.method_26215() && Class332.method2954(this, b2) && !this.field831.containsKey(a2)) {
                                        this.field831.put(a2, b2);
                                    }
                                    ++c2;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            }
        }
    }

    private static void method2960(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2961(Class332 class332) {
        class332.method2959();
    }

    public static double method2962(class_238 class_2383) {
        return class_2383.field_1323;
    }

    @Class1
    public void method2963(Class228 a2) {
        this.field831.clear();
    }

    private static void method2964(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    @Class1
    public void method2965(Class146 a2) {
        this.field831.entrySet().removeIf(arg_0 -> Class332.method2967(a2, arg_0));
    }

    private static void method2966(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method2967(Class146 a2, Map.Entry b2) {
        return Class332.method2947(a2, (class_2338)b2.getKey());
    }

    private static int method2968(int n2, int n3, Class430 class430, Class5692 class5692) {
        return Class3630.method17949(n2, n3, class430, class5692);
    }

    private static int method2969(int n2, int n3, Class6404 class6404, Class4218 class4218) {
        return Class3630.method17969(n2, n3, class6404, class4218);
    }

    private static void method2970() {
        Class5836.method22897();
    }

    @Class1
    public void method2971(Class117 a2) {
        this.field831.clear();
    }

    private static Object method2972(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method2973(Class332 class332) {
        return class332.field832;
    }

    private static class_4587 method2974(Class59 class59) {
        return class59.method125();
    }

    private static float method2975(Class59 class59) {
        return class59.method124();
    }

    private static void method2976() {
        Class4146.method20697();
    }

    private static void method2977() {
        Class6009.method23560();
    }

    private static void method2978() {
        Class5836.method22885();
    }

    private static boolean method2979(Class257 class257, Object object) {
        return class257.method600(object);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void method1274() {
        if (Class332.field290.field_1687 == null) return;
        if (field290.method_1562() == null) {
            int n2 = 47184;
            Class6009.method23561();
            return;
        }
        int n3 = 47185;
        block4: while (true) {
            switch (n3) {
                case 47185: {
                    n3 = 47183;
                    continue block4;
                }
                case 47184: {
                    return;
                }
            }
            break;
        }
        if ((Boolean)this.field829.method507() != false) return;
        this.method2959();
    }

    private static void method2980() {
        Class6009.method23561();
    }

    private static boolean method2981(Class332 class332, class_2680 class_26802) {
        return class332.method2944(class_26802);
    }

    private static void method2982() {
        Class5659.method22184();
    }

    private static void method2983() {
        Class1745.method15538();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

