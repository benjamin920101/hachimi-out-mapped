/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.text.Text
 *  net.minecraft.client.render.BufferRenderer
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.gui.widget.PressableWidget
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.text.MutableText
 *  net.minecraft.client.gui.screen.narration.NarrationMessageBuilder
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.BuiltBuffer
 *  org.joml.Matrix4f
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import mapped.Class1104;
import mapped.Class1367;
import mapped.Class1391;
import mapped.Class1444;
import mapped.Class3224;
import mapped.Class3580;
import mapped.Class3868;
import mapped.Class4036;
import mapped.Class404;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class5510;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6283;
import mapped.Class6435;
import mapped.Class6454;
import mapped.Class708;
import mapped.Class926;
import net.minecraft.text.Text;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.MutableText;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3992
extends class_4264 {
    protected final String field9125;
    protected static final Class3868 field9126;
    protected final Class3868 field9127;
    protected final Class1104 field9128;
    Class6283 field9129;
    private final Color field9130 = new Color((int)field9132[0], (int)field9132[0], (int)field9132[0], (int)field9132[3]);
    private final Color field9131 = new Color((int)field9132[1], (int)field9132[1], (int)field9132[1], (int)field9132[2]);
    private static long[] field9132;
    public static boolean $skidonion$890408486;

    protected static void method19597(class_332 b2, class_327 c2, class_2561 d2, String e2, int f2, int g2, int h2, int i2, int j2, int k2) {
        int l2 = Class3992.method19613(d2.getString());
        int m2 = h2 + j2;
        int n2 = (m2 - (int)field9132[5]) / (int)field9132[4] + (int)field9132[6];
        int o2 = f2 - l2 / (int)field9132[4];
        if (e2 != null) {
            int a2 = (int)Class3992.method19602().method14084(e2);
            Class5836.field11396.method14035(b2.method_51448(), e2, (double)o2 - (double)a2 * 1.5, (double)n2 + 0.5, k2);
        }
        Class3992.method19609(b2, d2.getString(), o2, n2, k2);
    }

    private static void method19598(Class3992 class3992, class_332 class_3322, class_327 class_3272, int n2) {
        class3992.method_48589(class_3322, class_3272, n2);
    }

    private static void method19599(long l2) {
        Class3992.field9132[10] = l2 ^ 0x276F1801EB8335E3L;
        Class3992.field9132[1] = l2 ^ 0x276F1801EB833504L;
        Class3992.field9132[0] = l2 ^ 0x276F1801EB8335FBL;
        Class3992.field9132[5] = l2 ^ 0x276F1801EB8335F2L;
        Class3992.field9132[2] = l2 ^ 0x276F1801EB8335ABL;
        Class3992.field9132[11] = l2 ^ 0x276F1801EB7CCA04L;
        Class3992.field9132[6] = l2 ^ 0x276F1801EB8335FAL;
        Class3992.field9132[4] = l2 ^ 0x276F1801EB8335F9L;
        Class3992.field9132[9] = l2 ^ 0x276F1801EB23955BL;
        Class3992.field9132[8] = l2 ^ 0x276F1801EB8335FFL;
        Class3992.field9132[3] = l2 ^ 0x276F1801EB833583L;
        Class3992.field9132[7] = l2 ^ 0x276F1801EB8335F8L;
    }

    public native void method_47399(class_6382 var1);

    static {
        ___.___(7, Class3992.class);
        ____.___7_40(Class3992.class);
    }

    private static void method19600() {
        Class6009.method23561();
    }

    public static Class1104 method19601(Class3992 class3992) {
        return class3992.field9128;
    }

    protected class_5250 method_25360() {
        return this.field9127.createNarrationMessage(this::method19606);
    }

    public static Class1391 method19602() {
        return Class5836.field11396;
    }

    protected Class3992(int a2, int b2, int c2, int d2, class_2561 e2, Class1104 f2, Class3868 g2, String h2) {
        super(a2, b2, c2, d2, e2);
        this.field9129 = new Class6283(150.0f);
        this.field9128 = f2;
        this.field9127 = g2;
        this.field9125 = h2;
    }

    private static int method19603(int n2, int n3, Class404 class404, Class708 class708) {
        return Class1367.method13951(n2, n3, class404, class708);
    }

    public static void method19604(Matrix4f k2, float l2, float m2, float n2, float o2, double p2, double q2, double r2, double s2, double t2, double u2) {
        class_287 v2 = class_289.method_1348().method_60827(Class3992.method19616(), class_290.field_1576);
        double[][] dArrayArray = new double[(int)field9132[8]][];
        double[] dArray = new double[(int)field9132[7]];
        dArray[(int)Class3992.field9132[0]] = r2 - t2;
        dArray[(int)Class3992.field9132[6]] = s2 - t2;
        dArray[(int)Class3992.field9132[4]] = t2;
        dArrayArray[(int)Class3992.field9132[0]] = dArray;
        double[] dArray2 = new double[(int)field9132[7]];
        dArray2[(int)Class3992.field9132[0]] = r2 - t2;
        dArray2[(int)Class3992.field9132[6]] = q2 + t2;
        dArray2[(int)Class3992.field9132[4]] = t2;
        dArrayArray[(int)Class3992.field9132[6]] = dArray2;
        double[] dArray3 = new double[(int)field9132[7]];
        dArray3[(int)Class3992.field9132[0]] = p2 + t2;
        dArray3[(int)Class3992.field9132[6]] = q2 + t2;
        dArray3[(int)Class3992.field9132[4]] = t2;
        dArrayArray[(int)Class3992.field9132[4]] = dArray3;
        double[] dArray4 = new double[(int)field9132[7]];
        dArray4[(int)Class3992.field9132[0]] = p2 + t2;
        dArray4[(int)Class3992.field9132[6]] = s2 - t2;
        dArray4[(int)Class3992.field9132[4]] = t2;
        dArrayArray[(int)Class3992.field9132[7]] = dArray4;
        double[][] w2 = dArrayArray;
        for (int j2 = (int)field9132[0]; j2 < (int)field9132[8]; ++j2) {
            double[] e2 = w2[j2];
            double f2 = e2[(int)field9132[4]];
            for (double d2 = (double)j2 * 90.0; d2 < 90.0 + (double)j2 * 90.0; d2 += 90.0 / u2) {
                float a2 = (float)Math.toRadians(d2);
                float b2 = (float)(Math.sin(a2) * f2);
                float c2 = (float)(Math.cos(a2) * f2);
                v2.method_22918(k2, (float)e2[(int)field9132[0]] + b2, (float)e2[(int)field9132[6]] + c2, 0.0f).method_22915(l2, m2, n2, o2);
            }
            float g2 = (float)Math.toRadians(90.0 + (double)j2 * Class3580.field7965);
            float h2 = (float)(Math.sin(g2) * f2);
            float i2 = (float)(Math.cos(g2) * f2);
            v2.method_22918(k2, (float)e2[(int)field9132[0]] + h2, (float)e2[(int)field9132[6]] + i2, 0.0f).method_22915(l2, m2, n2, o2);
        }
        class_286.method_43433((class_9801)v2.method_60800());
    }

    public void method_25306() {
        Class3992.method19618(this).onPress(this);
    }

    public static void method19605(class_4587 a2, float b2, float c2, float d2, float e2, float f2, Color g2) {
        Class3992.method19611(a2, g2, b2, c2, d2 + b2, e2 + c2, f2, 4.0);
    }

    private class_5250 method19606() {
        return super.method_25360();
    }

    public static Class6283 method19607(Class3992 class3992) {
        return class3992.field9129;
    }

    protected void method_49604(class_332 a2, class_327 b2, int c2, int d2) {
        int e2 = this.method_46426() + c2;
        int f2 = this.method_46426() + this.method_25368() - c2;
        Class3992.method19610(a2, b2, this.method_25369(), this.field9125, e2, this.method_46427(), f2, this.method_46427() + this.method_25364(), d2);
    }

    private static void method19608() {
        Class4146.method20697();
    }

    private static void method19609(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static void method19610(class_332 class_3322, class_327 class_3272, class_2561 class_25612, String string, int n2, int n3, int n4, int n5, int n6) {
        Class3992.method19617(class_3322, class_3272, class_25612, string, n2, n3, n4, n5, n6);
    }

    private static void method19611(class_4587 class_45872, Color color, double d2, double d3, double d4, double d5, double d6, double d7) {
        Class3992.method19619(class_45872, color, d2, d3, d4, d5, d6, d7);
    }

    protected void method_48579(class_332 a2, int b2, int c2, float d2) {
        Class3992.method19614(Class3992.method19607(this), this.method_25367());
        class_310 e2 = class_310.method_1551();
        RenderSystem.enableBlend();
        RenderSystem.enableDepthTest();
        Color f2 = Class4045.method20089(this.field9130, this.field9131, this.field9129.method24292() * this.field9129.method24292());
        Class3992.method19605(a2.method_51448(), this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), 4.0f, f2);
        Class4036.method20085(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), 40.0f, 4.0f);
        if (!this.field_22763) {
            Class5836.method22890();
            return;
        }
        int g2 = (int)field9132[11];
        Class3992.method19598(this, a2, e2.field_1772, g2 | class_3532.method_15386((float)(this.field_22765 * 255.0f)) << (int)field9132[10]);
    }

    private static void method19612() {
        Class5836.method22897();
    }

    private static int method19613(String string) {
        return Class6454.method24719(string);
    }

    private static void method19614(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    public void method_48589(class_332 a2, class_327 b2, int c2) {
        this.method_49604(a2, b2, (int)field9132[4], c2);
    }

    private static int method19615(int n2, int n3, Class926 class926, Class6435 class6435) {
        return Class1367.method13957(n2, n3, class926, class6435);
    }

    public static class_293.class_5596 method19616() {
        return class_293.class_5596.field_27381;
    }

    protected static void method19617(class_332 a2, class_327 b2, class_2561 c2, String d2, int e2, int f2, int g2, int h2, int i2) {
        Class3992.method19597(a2, b2, c2, d2, (e2 + g2) / (int)field9132[4], e2, f2, g2, h2, i2);
    }

    private static Class1104 method19618(Class3992 class3992) {
        return Class3992.method19601(class3992);
    }

    public static void method19619(class_4587 a2, Color b2, double c2, double d2, double e2, double f2, double g2, double h2) {
        RenderSystem.setShader(class_757::method_34540);
        Class3992.method19604(a2.method_23760().method_23761(), (float)b2.getRed() / 255.0f, (float)b2.getGreen() / 255.0f, (float)b2.getBlue() / Class5510.field10380, (float)b2.getAlpha() / Class1444.field5500, c2, d2, e2, f2, g2, h2);
    }

    public static Class3224 method19620(class_2561 a2, Class1104 b2) {
        return new Class3224(a2, b2);
    }

    private static native Object 1(char var0);
}

