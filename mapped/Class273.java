/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.MathHelper
 *  org.apache.commons.lang3.ArrayUtils
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import mapped.Class1;
import mapped.Class1004;
import mapped.Class1007;
import mapped.Class105;
import mapped.Class1083;
import mapped.Class1108;
import mapped.Class1153;
import mapped.Class1215;
import mapped.Class1221;
import mapped.Class1305;
import mapped.Class133;
import mapped.Class1450;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class171;
import mapped.Class1745;
import mapped.Class1779;
import mapped.Class1807;
import mapped.Class224;
import mapped.Class248;
import mapped.Class251;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.Class3;
import mapped.Class3306;
import mapped.Class333;
import mapped.Class3717;
import mapped.Class3815;
import mapped.Class3979;
import mapped.Class4002;
import mapped.Class4036;
import mapped.Class4054;
import mapped.Class408;
import mapped.Class4135;
import mapped.Class4146;
import mapped.Class4265;
import mapped.Class4387;
import mapped.Class439;
import mapped.Class447;
import mapped.Class457;
import mapped.Class489;
import mapped.Class540;
import mapped.Class543;
import mapped.Class5598;
import mapped.Class5624;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5787;
import mapped.Class5836;
import mapped.Class5943;
import mapped.Class6009;
import mapped.Class6166;
import mapped.Class6283;
import mapped.Class6286;
import mapped.Class6322;
import mapped.Class6358;
import mapped.Class6454;
import mapped.Class665;
import mapped.Class68;
import mapped.Class685;
import mapped.Class87;
import mapped.Class920;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.ArrayUtils;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class273
extends Class268 {
    private boolean field369;
    private boolean field370;
    private final Class6283 field371;
    private final class_2960 field372 = class_2960.method_60655((String)"hachimi", (String)"textures/sync_clickgui.png");
    private float[] field373;
    private final Class925 field374;
    private boolean field375;
    private boolean field376;
    private static long[] field377;
    private char[] field378;
    public static boolean $skidonion$890408582;

    public static float method956() {
        return 1.0f;
    }

    public static float method957() {
        return 1.0f;
    }

    private static float method958() {
        return Class273.method1043();
    }

    private static boolean method959() {
        return Class408.method6431();
    }

    private static void method960() {
        Class5659.method22184();
    }

    public static float method961() {
        return 1.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method727(char a2, int b2) {
        if (!this.field376) {
            int n2 = 3944;
            Class273.method1033();
            return;
        }
        int n3 = 3943;
        block4: while (true) {
            switch (n3) {
                case 3944: {
                    n3 = 3942;
                    continue block4;
                }
                case 3943: {
                    if (this.field378.length >= (int)field377[10]) {
                        return;
                    }
                    if (!this.method1027(a2)) return;
                    Class273.method996(this, ArrayUtils.add((char[])this.field378, (char)a2));
                    return;
                }
            }
            break;
        }
    }

    public static float method962() {
        return 1.0f;
    }

    public static float method963() {
        return 1.0f;
    }

    public static float method964() {
        return 1.0f;
    }

    public static void method965(Class273 class273, char[] cArray) {
        class273.field378 = cArray;
    }

    private static void method966(long l2) {
        Class273.method1030(l2);
    }

    private static void method967() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method825(class_332 x2, float y2, float z2, float A2, float B2, float C2) {
        double u2;
        this.method753(Class6454.method24637() + Class333.method2989().method2999());
        this.field340 = y2;
        this.field337 = z2;
        int D2 = Class273.method988((Class251)this.field354);
        boolean E2 = this.method740(A2, B2);
        if (E2 != this.field345.method24288()) {
            this.field345.method24284(E2);
        }
        int F2 = (int)(45.0 * class_3532.method_15350((double)this.field345.method24281(), (double)0.0, (double)1.0));
        this.method742(x2, new Color((int)field377[6], (int)field377[6], (int)field377[6], F2).getRGB());
        int G2 = Class273.method1062(Class273.method1008(), D2);
        this.method763(x2, y2 + this.field341 * 1.0f - 11.0f, z2, 10.0, 10.0, G2);
        int H2 = (int)field377[5];
        this.method771(x2, this.field354.method512(), y2 + 2.0f, z2 + Class333.method2989().method3018() * 1.0f, H2);
        if (!(this.field371.method24281() > (double)0.01f)) {
            this.method1009();
            return;
        }
        Class251 p2 = (Class251)this.field354;
        if (p2.method553()) {
            Color a2 = Class457.method10620().method10614();
            float[] b2 = Color.RGBtoHSB(a2.getRed(), a2.getGreen(), a2.getBlue(), null);
            float[] fArray = new float[(int)field377[1]];
            fArray[(int)Class273.field377[0]] = b2[(int)field377[0]];
            fArray[(int)Class273.field377[4]] = b2[(int)field377[4]];
            fArray[(int)Class273.field377[2]] = 1.0f - b2[(int)field377[2]];
            fArray[(int)Class273.field377[3]] = this.field373[(int)field377[3]];
            this.field373 = fArray;
        }
        if (Class1450.field5522) {
            if (this.method750(A2, B2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 2.0f, this.field341 * 1.0f - 1.0f, this.field341 * Class273.method973())) {
                int n2 = !Class273.method1061(p2) ? 5088 : 5089;
                block4: while (true) {
                    switch (n2) {
                        case 5089: {
                            n2 = 5087;
                            continue block4;
                        }
                        case 5088: {
                            float c2 = this.field340 + 1.0f;
                            float d2 = this.field340 + this.field341 * 1.0f - Class273.method982();
                            float e2 = this.field337 + this.field339 * 1.0f + 2.0f * Class273.method1025();
                            float f2 = this.field337 + this.field339 * 1.0f + 2.0f + this.field341 * Class273.method1010();
                            float g2 = d2 - c2;
                            this.field373[(int)Class273.field377[4]] = class_3532.method_15363((float)((A2 - c2) / g2), (float)0.001f, (float)Class3306.field7117);
                            float h2 = f2 - e2;
                            this.field373[(int)Class273.field377[2]] = class_3532.method_15363((float)((B2 - e2) / h2), (float)0.001f, (float)0.999f);
                            break block4;
                        }
                    }
                    break;
                }
            }
            if (this.method750(A2, B2, this.field340 + Class273.method983(), this.field337 + this.field339 * 1.0f + Class333.method2989().method3018() * 1.0f + this.field341 * 1.0f, this.field341 * 1.0f - 2.0f, 8.0) && !p2.method553()) {
                this.field373[(int)Class273.field377[0]] = class_3532.method_15363((float)((A2 - (this.field340 + 1.0f)) / (this.field341 * 1.0f - 1.0f)), (float)0.001f, (float)0.999f);
            }
            if (p2.method556() && this.method750(A2, B2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 15.0f + this.field341 * Class273.method962(), this.field341 * 1.0f - 2.0f, Class4002.field9182 * Class273.method1022())) {
                this.field373[(int)Class273.field377[3]] = class_3532.method_15363((float)((A2 - (this.field340 + 1.0f)) / (this.field341 * 1.0f - Class273.method964())), (float)0.001f, (float)0.999f);
            }
            Color i2 = Color.getHSBColor(this.field373[(int)field377[0]], Class273.method1038(this)[(int)field377[4]], 1.0f - this.field373[(int)field377[2]]);
            i2 = new Color((float)i2.getRed() / 255.0f, (float)i2.getGreen() / 255.0f, (float)i2.getBlue() / 255.0f, class_3532.method_15363((float)this.field373[(int)field377[3]], (float)0.0f, (float)1.0f));
            this.field370 = (int)field377[4];
            p2.method505(i2);
            Class273.method1026(this, (boolean)field377[0]);
        }
        float[] q2 = this.field373;
        int r2 = Color.HSBtoRGB(q2[(int)field377[0]], 1.0f, 1.0f);
        boolean s2 = Class333.method2989().method2998();
        if (s2) {
            this.method737(this.field340, this.field337 + this.field339 * 1.0f, this.field340 + this.field341 * 1.0f, this.field337 + this.field339 * 1.0f + this.method1067() * this.method1064());
        }
        float k2 = 0.0f;
        while (true) {
            if (!(k2 < this.field341 * 1.0f - 2.0f)) {
                this.method763(x2, this.field340 + 1.0f + (this.field341 * 1.0f - 2.0f) * q2[(int)field377[0]], this.field337 + this.field339 * 1.0f + Class333.method2989().method3018() * 1.0f + this.field341 * 1.0f, 1.0, Class5598.field10655 * 1.0f, (int)field377[5]);
                this.method738(x2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 2.0f, this.field340 + this.field341 * 1.0f - 1.0f, this.field337 + this.field339 * 1.0f + 2.0f + this.field341 * Class273.method1004(), (int)field377[5], r2, (boolean)field377[4]);
                this.method738(x2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 2.0f, this.field340 + this.field341 * 1.0f - Class273.method1056(), this.field337 + this.field339 * Class273.method963() + 2.0f + this.field341 * Class273.method961(), (int)field377[0], (int)field377[8], (boolean)field377[0]);
                this.method763(x2, this.field340 + this.field341 * 1.0f * q2[(int)field377[4]], this.field337 + this.field339 * 1.0f + 1.0f + this.field341 * Class273.method977() * q2[(int)field377[2]], 2.0, 2.0, (int)field377[5]);
                if (p2.method556()) break;
                Class1745.method15538();
                return;
            }
            float j2 = k2 / (this.field341 * Class273.method1021() - 2.0f);
            this.method763(x2, this.field340 + 1.0f + k2, this.field337 + this.field339 * 1.0f + Class273.method1003(Class333.method2989()) * 1.0f + this.field341 * Class273.method980(), 1.0, Class4054.field9355 * 1.0f, Color.getHSBColor(j2, 1.0f, 1.0f).getRGB());
            k2 += 1.0f;
        }
        int o2 = (int)field377[0];
        float n3 = 0.0f;
        if (0.0 < (double)(this.field341 * 1.0f) - Class1007.field4170 * 1.0) {
            float l2 = this.field340 + 1.0f + n3;
            double m2 = 4.0;
            if ((double)l2 + m2 > (double)(this.field341 * 1.0f) - Class6358.field13123 * 1.0) {
                m2 = (double)(this.field341 * 1.0f) - Class4387.field10017 * 1.0 - 0.0;
            }
            this.method763(x2, l2, this.field337 + this.field339 * Class273.method1065() + 15.0f + this.field341 * Class273.method1050(), m2, 4.0, o2 != 0 ? (int)field377[5] : (int)field377[9]);
            if (o2 != 0) {
                int n4 = (int)field377[9];
                Class6454.method24594();
                return;
            }
            this.method763(x2, l2, this.field337 + this.field339 * 1.0f + Class1305.field5069 * 1.0f + this.field341 * 1.0f, m2, Class4387.field10016 * Class273.method972(), (int)field377[5]);
            o2 = o2 == 0 ? (int)field377[4] : (int)field377[0];
            n3 = 4.0f;
            while (true) {
                // Infinite loop
            }
        }
        this.method770(x2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 15.0f + this.field341 * 1.0f, (double)(this.field341 * 1.0f) - 2.0, 8.0, (int)field377[0], r2);
        this.method763(x2, this.field340 + 1.0f + (this.field341 * 1.0f - 2.0f) * q2[(int)field377[3]], this.field337 + this.field339 * 1.0f + 15.0f + this.field341 * Class273.method1069(), 1.0, 8.0, (int)field377[5]);
        String t2 = this.field376 ? new String(this.field378) + this.method1012() : new String(this.field378);
        this.method771(x2, "#" + t2, this.field340 + Class1083.field4399 * Class273.method1016(), this.field337 + this.field339 * Class273.method1036() + (Class273.method978(p2) ? 28.0f * Class273.method1035() : 18.0f) + this.field341 * 1.0f, H2);
        this.method763(x2, this.field340 + 1.0f, this.field337 + this.field339 * Class273.method1019() + (!p2.method556() ? 14.0f : 26.0f) + this.field341 * 1.0f, this.field341 * 1.0f - 17.0f, 12.0, (int)field377[7]);
        double d3 = u2 = Integer.valueOf("Global".toUpperCase().hashCode()).equals(this.field354.method512().toUpperCase().hashCode()) ? 1.0 : Class273.method1049(p2.method516());
        if (u2 > Class5624.field10749) {
            this.method763(x2, this.field340 + 1.0f + this.field341 * 1.0f - 15.0f, this.field337 + this.field339 * 1.0f + (p2.method556() ? 26.0f : 14.0f) + this.field341 * 1.0f, 13.0f * Class273.method1051(), 12.0, Class273.method1055(Class333.method2989(), (float)u2));
        }
        float v2 = this.field340 + 1.0f + this.field341 * 1.0f - 14.0f;
        float w2 = this.field337 + this.field339 * 1.0f + (p2.method556() ? 27.0f : 15.0f) + this.field341 * 1.0f;
        RenderSystem.setShaderTexture((int)((int)field377[0]), (class_2960)this.field372);
        this.method741(x2, v2, w2, 0.0f, 0.0f, 11.0f, 10.0f * Class273.method956(), Class665.field3208 * 1.0f, Class3717.field8374 * Class273.method994());
        this.field353.method1160((float)((double)Class273.method1031(this) * Class273.method1044(this).method24281()));
        ((Class261)this.field344).method654((float)((double)this.method1067() * this.field371.method24281() * (double)Class273.method1034(this.field353)));
        if (!s2) {
            return;
        }
        this.method758();
    }

    public static float method968() {
        return 1.0f;
    }

    private static boolean method969(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method970(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method971() {
        Class1503.method14420();
    }

    public static float method972() {
        return 1.0f;
    }

    public static float method973() {
        return 1.0f;
    }

    private static float[] method974(Class251 class251) {
        return class251.method535();
    }

    private static void method975(float f2) {
        Class5836.method22907(f2);
    }

    private static void method976() {
        Class1807.method15744();
    }

    public static float method977() {
        return 1.0f;
    }

    private static boolean method978(Class251 class251) {
        return class251.method556();
    }

    private static void method979(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static float method980() {
        return 1.0f;
    }

    private static void method981(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static float method982() {
        return 1.0f;
    }

    public static float method983() {
        return 1.0f;
    }

    public static void method984(Class273 class273, char[] cArray) {
        class273.field378 = cArray;
    }

    private static void method985() {
        Class6454.method24594();
    }

    private static void method986() {
        Class1807.method15744();
    }

    private static void method987(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method988(Class251 class251) {
        return class251.method542();
    }

    public static float method989() {
        return 1.0f;
    }

    private static int method990(int n2, int n3, Class3 class3, Class1004 class1004) {
        return Class5787.method22731(n2, n3, class3, class1004);
    }

    private static int method991(int n2, int n3, Class1153 class1153, Class685 class685) {
        return Class5787.method22701(n2, n3, class1153, class685);
    }

    private static int method992(Class251 class251) {
        return class251.method542();
    }

    public static void method993(Class273 class273, boolean bl2) {
        class273.field370 = bl2;
    }

    public static float method994() {
        return 1.0f;
    }

    public static float method995() {
        return 1.0f;
    }

    private static void method996(Class273 class273, char[] cArray) {
        Class273.method984(class273, cArray);
    }

    private static int method997(int n2, int n3, Class439 class439, Class540 class540) {
        return Class5787.method22735(n2, n3, class439, class540);
    }

    private static boolean method998(Class251 class251) {
        return class251.method556();
    }

    private static void method999() {
        Class1503.method14420();
    }

    private static int method1000(Class251 class251) {
        return class251.method542();
    }

    public static char[] method1001(Class273 class273) {
        return class273.field378;
    }

    private static void method1002() {
        Class3979.method19561();
    }

    private static float method1003(Class333 class333) {
        return class333.method3018();
    }

    public static float method1004() {
        return 1.0f;
    }

    private static void method1005() {
        Class5836.method22885();
    }

    private static Class5693 method1006() {
        return Class273.method1046();
    }

    private static void method1007(Class273 class273) {
        class273.method1009();
    }

    private static Class333 method1008() {
        return Class333.method2989();
    }

    public void method1009() {
        this.field376 = (int)field377[0];
    }

    private static float method1010() {
        return Class273.method1032();
    }

    private static void method1011(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public String method1012() {
        if (this.field374.method12595((int)field377[17])) {
            this.field369 = !this.field369 ? (int)field377[4] : (int)field377[0];
            Class273.method1060(this).method12593();
        }
        if (Class273.method1018(this)) {
            if (!this.field376) {
                Class6454.method24594();
                return null;
            }
            return "_";
        }
        return "";
    }

    private static void method1013() {
        Class5659.method22184();
    }

    public static char[] method1014(Class273 class273) {
        return class273.field378;
    }

    private static void method1015(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static float method1016() {
        return 1.0f;
    }

    private static char[] method1017(Class273 class273) {
        return Class273.method1001(class273);
    }

    public static boolean method1018(Class273 class273) {
        return class273.field369;
    }

    public static float method1019() {
        return 1.0f;
    }

    private static boolean method1020() {
        return Class408.method6431();
    }

    public static float method1021() {
        return 1.0f;
    }

    public static float method1022() {
        return 1.0f;
    }

    private static void method1023() {
        Class4146.method20697();
    }

    public static float method1024() {
        return 1.0f;
    }

    public static float method1025() {
        return 1.0f;
    }

    private static void method1026(Class273 class273, boolean bl2) {
        Class273.method993(class273, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method1027(char a2) {
        int n2;
        if (a2 >= (int)field377[14] && a2 <= (int)field377[11] || a2 >= (int)field377[12] && a2 <= (int)field377[15] || a2 >= (int)field377[13] && a2 <= (int)field377[16]) {
            n2 = (int)field377[4];
            return n2 != 0;
        }
        n2 = (int)field377[0];
        return n2 != 0;
    }

    private static void method1028() {
        Class5836.method22885();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1029(Class68 b2) {
        int n2 = b2.method140() == this.method826() ? 3761 : 3762;
        block4: while (true) {
            switch (n2) {
                case 3762: {
                    n2 = 3760;
                    continue block4;
                }
                case 3761: {
                    if (b2.method128() != Class543.field2691) return;
                    if (!this.field370) {
                        float[] a2 = Class273.method974((Class251)this.field354);
                        float[] fArray = new float[(int)field377[1]];
                        fArray[(int)Class273.field377[0]] = a2[(int)field377[0]];
                        fArray[(int)Class273.field377[4]] = a2[(int)field377[4]];
                        fArray[(int)Class273.field377[2]] = 1.0f - a2[(int)field377[2]];
                        fArray[(int)Class273.field377[3]] = a2[(int)field377[3]];
                        this.field373 = fArray;
                    }
                    this.field378 = Integer.toHexString(((Class251)this.field354).method542()).toCharArray();
                    return;
                }
            }
            break;
        }
    }

    private static void method1030(long l2) {
        Class273.field377[3] = l2 ^ 0x4685E3F29D2AB4DAL;
        Class273.field377[15] = l2 ^ 0x4685E3F29D2AB49FL;
        Class273.field377[13] = l2 ^ 0x4685E3F29D2AB4B8L;
        Class273.field377[5] = l2 ^ 0xB97A1C0D62D54B26L;
        Class273.field377[16] = l2 ^ 0x4685E3F29D2AB4BFL;
        Class273.field377[14] = l2 ^ 0x4685E3F29D2AB4E9L;
        Class273.field377[0] = l2 ^ 0x4685E3F29D2AB4D9L;
        Class273.field377[17] = l2 ^ 0x4685E3F29D2AB423L;
        Class273.field377[6] = l2 ^ 0x4685E3F29D2AB426L;
        Class273.field377[9] = l2 ^ 0xB97A1C0D62BA2449L;
        Class273.field377[12] = l2 ^ 0x4685E3F29D2AB498L;
        Class273.field377[10] = l2 ^ 0x4685E3F29D2AB4D1L;
        Class273.field377[2] = l2 ^ 0x4685E3F29D2AB4DBL;
        Class273.field377[1] = l2 ^ 0x4685E3F29D2AB4DDL;
        Class273.field377[11] = l2 ^ 0x4685E3F29D2AB4E0L;
        Class273.field377[7] = l2 ^ 0x4685E3F2ADBA2449L;
        Class273.field377[4] = l2 ^ 0x4685E3F29D2AB4D8L;
        Class273.field377[8] = l2 ^ 0xB97A1C0D622AB4D9L;
    }

    private static float method1031(Class273 class273) {
        return class273.method1067();
    }

    public static float method1032() {
        return 1.0f;
    }

    private static void method1033() {
        Class1807.method15744();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void method646(int c, int d, int e) {
        block12: {
            if (!this.field376) break block12;
            v0 = 60745;
            if (true) ** GOTO lbl10
        }
        v1 = 60746;
        Class1108.method12918(false);
        return;
        block10: while (true) {
            v0 = 60744;
lbl10:
            // 2 sources

            switch (v0) {
                case 60746: {
                    continue block10;
                }
                case 60745: {
                    b = (Class251)this.field354;
                    var5_5 = c;
                    if (var5_5 == 256) ** GOTO lbl45
                    if (var5_5 == 257) ** GOTO lbl21
                    if (var5_5 == 258) ** GOTO lbl47
                    if (var5_5 != 259) ** GOTO lbl47
                    ** GOTO lbl30
lbl21:
                    // 1 sources

                    try {
                        a = b.method551(new String(this.field378).trim());
                        this.field354.method505(a);
                    }
                    catch (NumberFormatException var6_7) {
                        // empty catch block
                    }
                    this.field378 = Integer.toHexString(Class273.method992(b)).toCharArray();
                    this.field376 = (int)Class273.field377[0];
                    ** break;
lbl30:
                    // 1 sources

                    if (Class273.method1017(this).length == 0) ** GOTO lbl33
                    v2 = 56545;
                    ** GOTO lbl37
lbl33:
                    // 1 sources

                    v2 = 56546;
                    if (true) ** GOTO lbl37
                    block11: while (true) {
                        v2 = 56544;
lbl37:
                        // 3 sources

                        switch (v2) {
                            case 56546: {
                                continue block11;
                            }
                            case 56545: {
                                Class273.method965(this, ArrayUtils.remove((char[])this.field378, (int)(Class273.method1014(this).length - (int)Class273.field377[4])));
                                ** break;
                            }
                            default: {
                                return;
                            }
                        }
                        break;
                    }
lbl45:
                    // 1 sources

                    this.field378 = Integer.toHexString(Class273.method1000(b)).toCharArray();
                    Class273.method1040(this, (boolean)Class273.field377[0]);
                }
            }
            break;
        }
lbl47:
        // 6 sources

    }

    private static float method1034(Class276 class276) {
        return class276.method1176();
    }

    public static float method1035() {
        return 1.0f;
    }

    public static float method1036() {
        return 1.0f;
    }

    public boolean method1037() {
        return this.field376;
    }

    public static float[] method1038(Class273 class273) {
        return class273.field373;
    }

    private static void method1039() {
        Class5836.method22897();
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    public static void method1040(Class273 class273, boolean bl2) {
        class273.field376 = bl2;
    }

    private static void method1041() {
        Class6009.method23561();
    }

    @Override
    public void method649(double d2, double e2, int f2) {
        Class251 g2 = (Class251)this.field354;
        boolean h2 = this.method750(d2, e2, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + (g2.method556() ? Class920.field3907 * 1.0f : 14.0f) + this.field341 * 1.0f, this.field341 * 1.0f - 17.0f, Class4265.field9961 * 1.0f);
        if (!h2) {
            Class273.method1007(this);
        }
        if (this.method744(d2, e2) && f2 == (int)field377[4]) {
            this.field375 = !this.field375 ? (int)field377[4] : (int)field377[0];
            this.field371.method24284(this.field375);
            if (Class333.method2989().method3011()) {
                Class5723.field11041.method22448(Class5693.field10948);
            }
        }
        if (f2 == 0) {
            if (h2) {
                if (!this.field376) {
                    Class273.method1005();
                    return;
                }
                try {
                    Color color = Class273.method1045(g2, new String(this.field378).trim());
                    this.field354.method505(color);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                this.field376 = (int)field377[0];
                if (Class333.method2989().method3011()) {
                    Class273.method1006().method22448(Class5693.field10948);
                }
            }
            if (!Integer.valueOf("Global".toUpperCase().hashCode()).equals(this.field354.method512().toUpperCase().hashCode()) && this.method750(d2, e2, this.field340 + Class273.method968() + this.field341 * 1.0f - 15.0f * Class273.method958(), this.field337 + this.field339 * 1.0f + (Class273.method998(g2) ? 26.0f : Class1221.field4791 * Class273.method995()) + this.field341 * 1.0f, Class5943.field11802 * Class273.method1024(), Class6166.field12500 * 1.0f)) {
                boolean bl2 = !g2.method553() ? (int)field377[4] : (int)field377[0];
                g2.method543(bl2);
                float[] c2 = ((Class251)this.field354).method535();
                float[] fArray = new float[(int)field377[1]];
                fArray[(int)Class273.field377[0]] = c2[(int)field377[0]];
                fArray[(int)Class273.field377[4]] = c2[(int)field377[4]];
                fArray[(int)Class273.field377[2]] = 1.0f - c2[(int)field377[2]];
                fArray[(int)Class273.field377[3]] = c2[(int)field377[3]];
                this.field373 = fArray;
                if (Class333.method2989().method3011()) {
                    Class5723.field11041.method22448(Class5693.field10948);
                }
            }
        }
    }

    private static void method1042() {
        Class5836.method22885();
    }

    public static float method1043() {
        return 1.0f;
    }

    public static Class6283 method1044(Class273 class273) {
        return class273.field371;
    }

    private static Color method1045(Class251 class251, String string) {
        return class251.method551(string);
    }

    public static Class5693 method1046() {
        return Class5723.field11041;
    }

    private static int method1047(int n2, int n3, Class171 class171, Class133 class133) {
        return Class5787.method22737(n2, n3, class171, class133);
    }

    private static void method1048(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static double method1049(Class6283 class6283) {
        return class6283.method24281();
    }

    private static float method1050() {
        return Class273.method1063();
    }

    public static float method1051() {
        return 1.0f;
    }

    private static void method1052() {
        Class3979.method19561();
    }

    private static void method1053() {
        Class3979.method19561();
    }

    private static void method1054(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method1055(Class333 class333, float f2) {
        return class333.method2997(f2);
    }

    public static float method1056() {
        return 1.0f;
    }

    private static boolean method1057() {
        return Class447.method10252();
    }

    public static Class925 method1058(Class273 class273) {
        return class273.field374;
    }

    private static void method1059(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Class925 method1060(Class273 class273) {
        return Class273.method1058(class273);
    }

    private static boolean method1061(Class251 class251) {
        return class251.method553();
    }

    private static int method1062(Class333 class333, int n2) {
        return class333.method2990(n2);
    }

    public static float method1063() {
        return 1.0f;
    }

    public float method1064() {
        return (float)this.field371.method24281();
    }

    private static float method1065() {
        return Class273.method989();
    }

    public Class273(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
        this.field371 = new Class6283((boolean)field377[0], Class1779.field6661, Class489.field2551);
        this.field374 = new Class926();
        Class251 f2 = (Class251)c2;
        float[] g2 = f2.method535();
        float[] fArray = new float[(int)field377[1]];
        fArray[(int)Class273.field377[0]] = g2[(int)field377[0]];
        fArray[(int)Class273.field377[4]] = g2[(int)field377[4]];
        fArray[(int)Class273.field377[2]] = 1.0f - g2[(int)field377[2]];
        fArray[(int)Class273.field377[3]] = g2[(int)field377[3]];
        this.field373 = fArray;
        this.field378 = Integer.toHexString(f2.method542()).toCharArray();
        Class3815.INSTANCE.method18546(this);
    }

    private static void method1066() {
        Class4146.method20694();
    }

    static {
        ___.___(40, Class273.class);
        ____.___40_1550(Class273.class);
    }

    public float method1067() {
        float a2 = Class4135.field9601 * 1.0f;
        if (((Class251)this.field354).method556()) {
            a2 += 10.0f;
        }
        return a2 + this.field341 * 1.0f;
    }

    private static int method1068(int n2, int n3, Class6286 class6286, Class87 class87) {
        return Class5787.method22706(n2, n3, class6286, class87);
    }

    private static float method1069() {
        return Class273.method957();
    }

    private static void method1070(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1071() {
        Class5836.method22890();
    }

    private static int method1072(int n2, int n3, Class105 class105, Class224 class224) {
        return Class5787.method22725(n2, n3, class105, class224);
    }

    private static void method1073() {
        Class4146.method20694();
    }

    private static native Object 1(char var0);
}

