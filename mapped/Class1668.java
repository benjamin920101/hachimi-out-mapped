/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.SharedConstants
 *  net.minecraft.util.Util
 *  net.minecraft.text.Text
 *  net.minecraft.client.render.BufferRenderer
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.widget.ClickableWidget
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.widget.ButtonWidget
 *  net.minecraft.client.gui.screen.option.OptionsScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen
 *  net.minecraft.client.gui.screen.world.SelectWorldScreen
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.BuiltBuffer
 *  org.joml.Matrix4f
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Iterator;
import mapped.Class1108;
import mapped.Class1746;
import mapped.Class1790;
import mapped.Class1807;
import mapped.Class1813;
import mapped.Class191;
import mapped.Class3224;
import mapped.ClickGui;
import mapped.Class3497;
import mapped.Class3740;
import mapped.Class3793;
import mapped.PhantomView;
import mapped.Class3979;
import mapped.Class3992;
import mapped.Class4122;
import mapped.Class4255;
import mapped.Colors;
import mapped.Class489;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5792;
import mapped.Class5822;
import mapped.Class5836;
import mapped.Class6235;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6336;
import mapped.Class6454;
import mapped.Class79;
import mapped.Class925;
import net.hachimi.client.api.render.satin.ManagedShaderEffect;
import net.minecraft.SharedConstants;
import net.minecraft.util.Util;
import net.minecraft.text.Text;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1668
extends class_437 {
    private static long[] field6179;
    private static final class_2960 field6180;
    private static final double field6181;
    private static final class_2960 field6182;
    private static double field6183;
    private long field6184;
    private static final Class925 field6185;
    public static boolean field6186;
    private static double field6187;
    private boolean field6188;
    private static final class_2960 field6189;
    private static final class_2960 field6190;
    private static final Class6283 field6191;
    public static boolean $skidonion$998554508;

    private static void method15124(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Class1668.method15136(class_3322, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    private static void method15125() {
        Class1807.method15744();
    }

    private static Class3992 method15126(Class3224 class3224) {
        return class3224.method16278();
    }

    public static void method15127(Class1668 class1668, boolean bl2) {
        class1668.field6188 = bl2;
    }

    public native void method_25420(class_332 var1, int var2, int var3, float var4);

    private static void method15128(String string) {
        Class3979.method19554(string);
    }

    /*
     * WARNING - void declaration
     */
    public static void method15129(class_332 h2, float i2, float j2) {
        double k2 = i2 / j2;
        if (!(k2 < 1.7777777777777777)) {
            Class1108.method12918(true);
            return;
        }
        float a2 = (float)((double)j2 * Class5792.field11254);
        float b2 = 50.0f + (a2 - i2);
        float c2 = 50.0f;
        if (ClickGui.method2989().method2994()) {
            ManagedShaderEffect g2 = Class5723.field11044.getMenuShaderEffect();
            g2.setUniformValue("resolution", Class4122.field9561.method_22683().method_4486(), Class1668.method15138().method_22683().method_4502());
            g2.setUniformValue("time", (float)field6185.method12592() / 1000.0f);
            g2.setUniformValue("mouse", (float)field6183, (float)(1.0 - field6187));
            g2.render(Class4122.field9561.method_60646().method_60637((boolean)field6179[1]));
        } else {
            void m2;
            void l2;
            RenderSystem.setShaderTexture((int)((int)field6179[2]), (class_2960)field6180);
            Class3497.method17721((int)field6179[0], () -> Class1668.method15152(h2, (float)l2, (float)m2, i2, j2));
        }
    }

    public static long method15130(Class1668 class1668) {
        return class1668.field6184;
    }

    private static void method15131() {
        Class3979.method19561();
    }

    private static void method15132(class_437 class_4372) {
        Class1790.method15701(class_4372);
    }

    static {
        ___.___(21, Class1668.class);
        ____.___21_140(Class1668.class);
    }

    private static Class3224 method15133(Class3224 class3224, String string) {
        return class3224.method16279(string);
    }

    public boolean method_25422() {
        return (int)field6179[2] != 0;
    }

    private void method15134(class_4185 a2) {
        field6186 = (int)field6179[1];
        this.field_22787.method_1507((class_437)new class_442());
        field6186 = (int)field6179[2];
    }

    private void method15135(Class3992 a2) {
        this.field_22787.method_1507((class_437)new class_500((class_437)this));
    }

    public static void method15136(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2) {
        Class1668.method15162(a2, b2, c2, f2, g2, d2, e2, f2, g2, h2, i2);
    }

    private static void method15137(Class1668 class1668, boolean bl2) {
        Class1668.method15127(class1668, bl2);
    }

    private static class_310 method15138() {
        return Class1668.method15154();
    }

    private static Class3992 method15139(Class3224 class3224) {
        return class3224.method16278();
    }

    public static void method15140(double d2) {
        field6187 = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void method_25426() {
        class_2561 b2 = class_2561.method_30163((String)"default menu".toLowerCase());
        int c2 = Class6454.method24719(b2.getString());
        int d2 = this.field_22789 - c2 - (int)field6179[4];
        int e2 = (int)field6179[11];
        int f2 = this.field_22789 / (int)field6179[8] - e2 / (int)field6179[8];
        int g2 = this.field_22790 / (int)field6179[8] - (int)field6179[6] + (int)field6179[13];
        int h2 = Class3979.method19551();
        int n2 = h2 != 0 ? 25113 : 25114;
        block6: while (true) {
            switch (n2) {
                case 25114: {
                    n2 = 25112;
                    continue block6;
                }
                case 25113: {
                    try {
                        Class.forName("ru.vidtu.ias.screen.AccountScreen");
                        g2 -= 12;
                    }
                    catch (Exception a2) {
                        Class1668.method15128("Not found IAS");
                        h2 = (int)field6179[2];
                    }
                    break block6;
                }
            }
            break;
        }
        this.method_37063((class_364)Class1668.method15155(Class1668.method15133(Class3992.method19620(class_2561.method_30163((String)"singleplayer"), this::method15149), "5").method16284(f2, g2, e2, (int)field6179[5])));
        this.method_37063((class_364)Class1668.method15158(Class3992.method19620((class_2561)class_2561.method_43471((String)"multiplayer"), this::method15135).method16279("4"), f2, g2 + (int)field6179[9], e2, (int)field6179[5]).method16278());
        this.method_37063((class_364)Class3992.method19620(class_2561.method_30163((String)"options"), this::method15170).method16279("7").method16284(f2, g2 + (int)field6179[7], (int)field6179[10], (int)field6179[5]).method16278());
        this.method_37063((class_364)Class1668.method15139(Class3992.method19620(class_2561.method_30163((String)"exit"), this::method15146).method16279("X").method16284(f2 + (int)field6179[12], g2 + (int)field6179[7], (int)field6179[10], (int)field6179[5])));
        if (h2 != 0) {
            this.method_37063((class_364)Class1668.method15126(Class1668.method15160(Class3992.method19620(class_2561.method_30163((String)"altmanager"), this::method15145).method16279("c"), f2, g2 + (int)field6179[6], e2, (int)field6179[5])));
        }
        this.method_37063((class_364)new Class6336(d2, (int)field6179[4], c2, (int)field6179[3], b2, this::method15134));
    }

    private static void method15141() {
        Class5659.method22184();
    }

    private static void method15142(long l2) {
        Class1668.field6179[16] = l2 ^ 0xFDCF046E482298A5L;
        Class1668.field6179[15] = l2 ^ 0xFDCF046E482298A4L;
        Class1668.field6179[10] = l2 ^ 0xFDCF046E482298C9L;
        Class1668.field6179[7] = l2 ^ 0xFDCF046E482298E3L;
        Class1668.field6179[1] = l2 ^ 0xFDCF046E482298AAL;
        Class1668.field6179[2] = l2 ^ 0xFDCF046E482298ABL;
        Class1668.field6179[14] = l2 ^ 0x230FB91B42298ABL;
        Class1668.field6179[18] = l2 ^ 0xFDCF046E482298CFL;
        Class1668.field6179[19] = l2 ^ 0xFDCF046E48229899L;
        Class1668.field6179[5] = l2 ^ 0xFDCF046E482298BFL;
        Class1668.field6179[13] = l2 ^ 0xFDCF046E482298B5L;
        Class1668.field6179[12] = l2 ^ 0xFDCF046E482298CDL;
        Class1668.field6179[17] = l2 ^ 0xFDCF046E48DD6754L;
        Class1668.field6179[9] = l2 ^ 0xFDCF046E482298B3L;
        Class1668.field6179[4] = l2 ^ 0xFDCF046E482298A3L;
        Class1668.field6179[0] = l2 ^ 0xFDCF046E482298BBL;
        Class1668.field6179[8] = l2 ^ 0xFDCF046E482298A9L;
        Class1668.field6179[11] = l2 ^ 0xFDCF046E48229863L;
        Class1668.field6179[6] = l2 ^ 0xFDCF046E4822989BL;
        Class1668.field6179[3] = l2 ^ 0xFDCF046E482298A1L;
    }

    private static void method15143(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2, float k2) {
        Class1668.method15156(a2, b2, b2 + d2, c2, c2 + e2, 0.0f, h2, i2, f2, g2, j2, k2);
    }

    public static double method15144() {
        return field6187;
    }

    private void method15145(Class3992 a2) {
        Class1668.method15132(this);
    }

    private void method15146(Class3992 a2) {
        this.field_22787.method_1592();
    }

    public static void method15147(int b2, int c2, int d2, int e2) {
        if (b2 != 0 || c2 != 0) {
            double a2 = ClickGui.method2989().method2994() ? 0.01 : 0.04;
            field6183 = PhantomView.method5737(field6183, (double)b2 / (double)d2, a2);
            Class1668.method15164(PhantomView.method5737(Class1668.method15157(), (float)c2 / (float)e2, a2));
            field6183 = Math.min(field6183, 1.0);
            Class1668.method15140(Math.min(Class1668.method15144(), 1.0));
            field6183 = Math.max(field6183, 0.0);
            field6187 = Math.max(field6187, 0.0);
        }
    }

    private static void method15148() {
        Class6454.method24594();
    }

    private void method15149(Class3992 a2) {
        this.field_22787.method_1507((class_437)new class_526((class_437)this));
    }

    private static void method15150(Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        Class1668.method15161(matrix4f, f2, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    private static int method15151(int n2, int n3, Class191 class191, Class79 class79) {
        return Class3793.method18379(n2, n3, class191, class79);
    }

    private static void method15152(class_332 a2, float b2, float c2, float d2, float e2) {
        Class1668.method15124(a2, (float)((double)(-b2) * Class1668.method15171()), (float)((double)(-c2) * field6187), 0.0f, 0.0f, d2 + b2, e2 + c2, d2 + b2, e2 + c2);
    }

    private static void method15153(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_310 method15154() {
        return Class4122.field9561;
    }

    public Class1668(boolean a2) {
        super(class_2561.method_30163((String)"HachimiTitleScreen"));
        this.field6188 = a2;
    }

    private static Class3992 method15155(Class3224 class3224) {
        return class3224.method16278();
    }

    private static void method15156(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2, float k2, float l2) {
        Class1668.method15150(a2.method_51448().method_23760().method_23761(), b2, c2, d2, e2, f2, (i2 + 0.0f) / k2, (i2 + g2) / k2, (j2 + 0.0f) / l2, (j2 + h2) / l2);
    }

    public static double method15157() {
        return field6187;
    }

    public boolean method_25402(double a2, double b2, int c2) {
        return super.method_25402(a2, b2, c2);
    }

    private static Class3224 method15158(Class3224 class3224, int n2, int n3, int n4, int n5) {
        return class3224.method16284(n2, n3, n4, n5);
    }

    public static void method15159(Class1668 class1668, long l2) {
        class1668.field6184 = l2;
    }

    private static Class3224 method15160(Class3224 class3224, int n2, int n3, int n4, int n5) {
        return class3224.method16284(n2, n3, n4, n5);
    }

    private static void method15161(Matrix4f a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2) {
        RenderSystem.setShader(class_757::method_34542);
        class_287 k2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        k2.method_22918(a2, b2, d2, f2).method_22913(g2, i2);
        k2.method_22918(a2, b2, e2, f2).method_22913(g2, j2);
        k2.method_22918(a2, c2, e2, f2).method_22913(h2, j2);
        k2.method_22918(a2, c2, d2, f2).method_22913(h2, i2);
        class_286.method_43433((class_9801)k2.method_60800());
    }

    private static void method15162(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        Class1668.method15143(class_3322, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    protected void method_57728(class_332 a2, float b2) {
        Class1668.method15169(a2, this.field_22789, this.field_22790);
    }

    private void method15163(float c2) {
        Iterator iterator = this.method_25396().iterator();
        if (iterator.hasNext()) {
            class_364 b2 = (class_364)iterator.next();
            if (b2 instanceof class_339) {
                class_339 a2 = (class_339)b2;
                a2.method_25350(c2);
            }
            Class1668.method15168();
            return;
        }
    }

    public static void method15164(double d2) {
        field6187 = d2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void method15165(class_332 b, int c, int d) {
        block7: {
            if (c < this.field_22789 - (int)Class1668.field6179[18]) ** GOTO lbl-1000
            if (d < this.field_22790 - (int)Class1668.field6179[18]) break block7;
            v0 = 47723;
            ** GOTO lbl10
        }
        v0 = 47724;
        if (true) ** GOTO lbl10
        block4: while (true) {
            v0 = 47722;
lbl10:
            // 3 sources

            switch (v0) {
                case 47724: {
                    continue block4;
                }
                case 47723: {
                    v1 = (int)Class1668.field6179[1];
                    break block4;
                }
                default: lbl-1000:
                // 2 sources

                {
                    v1 = (int)Class1668.field6179[2];
                }
            }
            break;
        }
        e = v1;
        Class1668.field6191.method24284(e);
        f = 0.0;
        if (e) {
            RenderSystem.setShaderTexture((int)((int)Class1668.field6179[2]), (class_2960)Class1668.field6189);
            a = Class489.field2551.method10803(Class1668.field6191.method24292());
            f = 15.0 * (1.0 - Math.abs(a - Class1813.field6753) * 2.0);
        } else {
            RenderSystem.setShaderTexture((int)((int)Class1668.field6179[2]), (class_2960)Class1668.field6190);
        }
        Class1668.method15136(b, this.field_22789 - (int)Class1668.field6179[19], (int)((double)(this.field_22790 - (int)Class1668.field6179[19]) - f), 0.0f, 0.0f, 50.0f, 50.0f, Class3740.field8459, 50.0f);
    }

    public void method_25394(class_332 d2, int e2, int f2, float g2) {
        int i2;
        Class1668.method15147(e2, f2, this.field_22789, this.field_22790);
        if (this.field6184 == field6179[2]) {
            if (this.field6188) {
                Class1668.method15159(this, class_156.method_658());
            }
        }
        float h2 = 1.0f;
        if (this.field6188) {
            float a2 = (float)(class_156.method_658() - Class1668.method15130(this)) / 2000.0f;
            if (a2 > 1.0f) {
                Class1668.method15137(this, (boolean)field6179[2]);
            } else {
                a2 = class_3532.method_15363((float)a2, (float)0.0f, (float)1.0f);
                h2 = class_3532.method_37958((float)a2, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
            }
            this.method15163(h2);
        }
        this.method_57728(d2, g2);
        int n2 = i2 = class_3532.method_15386((float)(h2 * 255.0f)) << (int)field6179[9];
        if (((int)field6179[14] | ~n2) - ~n2 != 0) {
            super.method_25394(d2, e2, f2, g2);
            String b2 = ("Minecraft " + class_155.method_16673().method_48019()).toLowerCase();
            int c2 = Class6454.method24637();
            int n3 = i2;
            Class6454.method24624(d2, b2, Class4255.field9939, this.field_22790 - c2 - (int)field6179[15], n3 + ((int)field6179[17] & ~n3));
            Object[] objectArray = new Object[(int)field6179[8]];
            objectArray[(int)Class1668.field6179[2]] = "Hachimi";
            objectArray[(int)Class1668.field6179[1]] = "1.2.2.1";
            Class6454.method24624(d2, String.format("%s %s", objectArray).toLowerCase(), 16.0f, this.field_22790 - c2 * (int)field6179[8] - (int)field6179[0], (int)field6179[17] | i2);
        }
        int j2 = this.field_22790 / (int)field6179[8] - (int)field6179[6] - (int)field6179[13];
        RenderSystem.enableBlend();
        Color k2 = Colors.method10620().method10614();
        d2.method_51422((float)k2.getRed() / 255.0f, (float)k2.getGreen() / 255.0f, (float)k2.getBlue() / 255.0f, h2);
        RenderSystem.setShaderTexture((int)((int)field6179[2]), (class_2960)field6182);
        Class1668.method15136(d2, (int)((double)this.field_22789 / Class6235.field12723 - Class1746.field6558), j2 - (int)field6179[16], 0.0f, 0.0f, 150.0f, Class5822.field11356, 150.0f, 54.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)h2);
        this.method15165(d2, e2, f2);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
    }

    private static void method15166(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_315 method15167(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method15168() {
        Class5836.method22890();
    }

    public boolean method_25421() {
        return (int)field6179[2] != 0;
    }

    private static void method15169(class_332 class_3322, float f2, float f3) {
        Class1668.method15129(class_3322, f2, f3);
    }

    private void method15170(Class3992 a2) {
        this.field_22787.method_1507((class_437)new class_429((class_437)this, Class1668.method15167(this.field_22787)));
    }

    public static double method15171() {
        return field6183;
    }

    private static native Object 1(char var0);
}

