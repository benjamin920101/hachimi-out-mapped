/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1041
 *  net.minecraft.class_1058
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_5253$class_5254
 *  net.minecraft.class_757
 *  net.minecraft.class_8030
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.BiConsumer;
import mapped.Class1450;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class264;
import mapped.Class298;
import mapped.Class3587;
import mapped.Class5473;
import mapped.Class5685;
import mapped.Class5899;
import mapped.Class6454;
import net.minecraft.class_1041;
import net.minecraft.class_1058;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_5253;
import net.minecraft.class_757;
import net.minecraft.class_8030;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

public abstract class Class263
implements Class264 {
    protected float field337;
    public static class_310 field338;
    protected float field339;
    protected float field340;
    protected float field341;
    private static long[] field342;

    private static class_8030 method734(Class5473 class5473, class_8030 class_80302) {
        return class5473.method21231(class_80302);
    }

    private static class_8030 method735(Class5473 class5473) {
        return class5473.method21229();
    }

    public static class_293.class_5596 method736() {
        return class_293.class_5596.field_27382;
    }

    public void method737(double a2, double b2, double c2, double d2) {
        a2 = Math.floor(a2);
        b2 = Math.floor(b2);
        c2 = Math.ceil(c2);
        d2 = Math.ceil(d2);
        Class263.method789(this, Class263.method734(Class1450.field5520, new class_8030((int)a2, (int)b2, (int)(c2 - a2), (int)(d2 - b2))));
    }

    protected void method738(class_332 a2, float b2, float c2, float d2, float e2, int f2, int g2, boolean h2) {
        int n2 = f2 >> (int)field342[4];
        float i2 = (float)(((int)field342[1] | ~n2) - ~n2) / 255.0f;
        int n3 = f2 >> (int)field342[3];
        float j2 = (float)(((int)field342[1] | ~n3) - ~n3) / 255.0f;
        int n4 = f2 >> (int)field342[2];
        float k2 = (float)(((int)field342[1] | ~n4) - ~n4) / Class3587.field7981;
        float l2 = (float)(f2 & (int)field342[1]) / Class5685.field10913;
        float m2 = (float)(g2 >> (int)field342[4] & (int)field342[1]) / 255.0f;
        float n5 = (float)(g2 >> (int)field342[3] & (int)field342[1]) / 255.0f;
        int n6 = g2 >> (int)field342[2];
        float o2 = (float)(((int)field342[1] | ~n6) - ~n6) / 255.0f;
        float p2 = (float)(g2 & (int)field342[1]) / 255.0f;
        class_287 q2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, Class263.method752());
        Matrix4f r2 = a2.method_51448().method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.setShader(class_757::method_34540);
        if (h2) {
            q2.method_22918(r2, b2, c2, 0.0f).method_22915(j2, k2, l2, i2);
            q2.method_22918(r2, b2, e2, 0.0f).method_22915(j2, k2, l2, i2);
            q2.method_22918(r2, d2, e2, 0.0f).method_22915(n5, o2, p2, m2);
            q2.method_22918(r2, d2, c2, 0.0f).method_22915(n5, o2, p2, m2);
        } else {
            q2.method_22918(r2, d2, c2, 0.0f).method_22915(j2, k2, l2, i2);
            q2.method_22918(r2, b2, c2, 0.0f).method_22915(j2, k2, l2, i2);
            q2.method_22918(r2, b2, e2, 0.0f).method_22915(n5, o2, p2, m2);
            q2.method_22918(r2, d2, e2, 0.0f).method_22915(n5, o2, p2, m2);
        }
        class_286.method_43433((class_9801)q2.method_60800());
        RenderSystem.disableBlend();
    }

    private static boolean method739(Class263 class263, float f2, float f3) {
        return class263.method740(f2, f3);
    }

    public boolean method740(float a2, float b2) {
        return Class263.method757(this, a2, b2, this.field340, this.field337, this.field341 * 1.0f, this.field339 * 1.0f);
    }

    public void method741(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2) {
        this.method767(a2, b2, c2, f2, g2, d2, e2, f2, g2, h2, i2);
    }

    protected void method742(class_332 a2, int b2) {
        this.method763(a2, Class263.method766(this), this.field337, this.field341 * 1.0f, this.field339 * Class263.method775(), b2);
    }

    public void method743(class_332 c2, double d2, double e2, double f2, double g2, double h2, int i2) {
        float j2 = (float)class_5253.class_5254.method_27762((int)i2) / 255.0f;
        float k2 = (float)class_5253.class_5254.method_27765((int)i2) / 255.0f;
        float l2 = (float)class_5253.class_5254.method_27766((int)i2) / 255.0f;
        float m2 = (float)class_5253.class_5254.method_27767((int)i2) / 255.0f;
        if (j2 <= 0.01f) {
            return;
        }
        f2 += d2;
        g2 += e2;
        Matrix4f n2 = c2.method_51448().method_23760().method_23761();
        if (d2 < f2) {
            double a2 = d2;
            d2 = f2;
            f2 = a2;
        }
        if (e2 < g2) {
            double b2 = e2;
            e2 = g2;
            g2 = b2;
        }
        RenderSystem.enableBlend();
        if (RenderSystem.getShader() != class_757.method_34540()) {
            RenderSystem.setShader(class_757::method_34540);
        }
        class_287 o2 = class_289.method_1348().method_60827(Class263.method736(), class_290.field_1576);
        o2.method_22918(n2, (float)d2, (float)e2, (float)h2).method_22915(k2, l2, m2, j2);
        o2.method_22918(n2, (float)d2, (float)g2, (float)h2).method_22915(k2, l2, m2, j2);
        o2.method_22918(n2, (float)f2, (float)g2, (float)h2).method_22915(k2, l2, m2, j2);
        o2.method_22918(n2, (float)f2, (float)e2, (float)h2).method_22915(k2, l2, m2, j2);
        class_286.method_43433((class_9801)o2.method_60800());
        RenderSystem.disableBlend();
    }

    public boolean method744(double a2, double b2) {
        return Class263.method739(this, (float)a2, (float)b2);
    }

    public void method745(Matrix4f a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2) {
        RenderSystem.setShader(class_757::method_34542);
        class_287 k2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        k2.method_22918(a2, b2, d2, f2).method_22913(g2, i2);
        k2.method_22918(a2, b2, e2, f2).method_22913(g2, j2);
        k2.method_22918(a2, c2, e2, f2).method_22913(h2, j2);
        k2.method_22918(a2, c2, d2, f2).method_22913(h2, i2);
        class_286.method_43433((class_9801)k2.method_60800());
    }

    protected void method746(Matrix4f c2, class_287 d2, double e2, double f2, double g2, double h2, double i2, int j2, int k2) {
        g2 += e2;
        h2 += f2;
        if (e2 < g2) {
            double a2 = e2;
            e2 = g2;
            g2 = a2;
        }
        if (f2 < h2) {
            double b2 = f2;
            f2 = h2;
            h2 = b2;
        }
        float l2 = (float)class_5253.class_5254.method_27762((int)j2) / 255.0f;
        float m2 = (float)class_5253.class_5254.method_27765((int)j2) / 255.0f;
        float n2 = (float)class_5253.class_5254.method_27766((int)j2) / 255.0f;
        float o2 = (float)class_5253.class_5254.method_27767((int)j2) / 255.0f;
        float p2 = (float)class_5253.class_5254.method_27762((int)k2) / Class5899.field11663;
        float q2 = (float)class_5253.class_5254.method_27765((int)k2) / 255.0f;
        float r2 = (float)class_5253.class_5254.method_27766((int)k2) / 255.0f;
        float s2 = (float)class_5253.class_5254.method_27767((int)k2) / 255.0f;
        d2.method_22918(c2, (float)e2, (float)f2, (float)i2).method_22915(q2, r2, s2, p2);
        d2.method_22918(c2, (float)e2, (float)h2, (float)i2).method_22915(q2, r2, s2, p2);
        d2.method_22918(c2, (float)g2, (float)h2, (float)i2).method_22915(m2, n2, o2, l2);
        d2.method_22918(c2, (float)g2, (float)f2, (float)i2).method_22915(m2, n2, o2, l2);
    }

    protected void method747(class_332 a2, int b2, int c2) {
        this.method770(a2, this.field340, Class263.method785(this), this.field341 * 1.0f, this.field339 * Class263.method765(), b2, c2);
    }

    public void method748(class_332 a2, int b2, int c2, int d2, int e2, int f2, class_1058 g2, float h2, float i2, float j2, float k2) {
        this.method779(a2.method_51448().method_23760().method_23761(), b2, b2 + e2, c2, c2 + f2, d2, g2.method_4594(), g2.method_4577(), g2.method_4593(), g2.method_4575(), h2, i2, j2, k2);
    }

    protected void method749(class_332 b2, double c2, double d2, double e2, int f2) {
        if (e2 < d2) {
            double a2 = d2;
            d2 = e2;
            e2 = a2;
        }
        this.method763(b2, c2, d2 + 1.0, c2 + 1.0, d2 + e2, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method750(double a2, double b2, double c2, double d2, double e2, double f2) {
        int n2;
        if (a2 >= c2 && a2 <= c2 + e2 && b2 >= d2 && b2 <= d2 + f2) {
            n2 = (int)field342[5];
            return n2 != 0;
        }
        n2 = (int)field342[0];
        return n2 != 0;
    }

    private static void method751() {
        Class1745.method15538();
    }

    public static class_293 method752() {
        return class_290.field_1576;
    }

    public void method753(float a2) {
        this.field339 = a2;
    }

    public void method754(float a2) {
        this.field341 = a2;
    }

    public void method755(class_332 a2, int b2, int c2, int d2, int e2, int f2, class_1058 g2) {
        this.method745(a2.method_51448().method_23760().method_23761(), b2, b2 + e2, c2, c2 + f2, d2, g2.method_4594(), g2.method_4577(), g2.method_4593(), g2.method_4575());
    }

    private static void method756() {
        Class1807.method15744();
    }

    private static boolean method757(Class263 class263, double d2, double d3, double d4, double d5, double d6, double d7) {
        return class263.method750(d2, d3, d4, d5, d6, d7);
    }

    public void method758() {
        this.method787(Class263.method735(Class1450.field5520));
    }

    public void method759(float a2, float b2) {
        this.field340 = a2;
        this.field337 = b2;
    }

    private static void method760() {
        Class298.method1924();
    }

    public void method761(int a2, int b2, BiConsumer c2) {
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        c2.accept(a2 + (int)field342[5], b2);
        c2.accept(a2 - (int)field342[5], b2);
        c2.accept(a2, b2 + (int)field342[5]);
        c2.accept(a2, b2 - (int)field342[5]);
        RenderSystem.defaultBlendFunc();
        c2.accept(a2, b2);
    }

    public float method762() {
        return this.field337;
    }

    public void method763(class_332 a2, double b2, double c2, double d2, double e2, int f2) {
        this.method743(a2, b2, c2, d2, e2, 0.0, f2);
    }

    public void method764(class_332 a2, double b2, double c2, double d2, double e2, int f2) {
        this.method763(a2, b2, c2, b2 + d2, c2 + 1.0, f2);
        this.method763(a2, b2, c2 + e2 - 1.0, b2 + d2, c2 + e2, f2);
        this.method763(a2, b2, c2 + 1.0, b2 + 1.0, c2 + e2 - 1.0, f2);
        this.method763(a2, b2 + d2 - 1.0, c2 + 1.0, b2 + d2, c2 + e2 - 1.0, f2);
    }

    public static float method765() {
        return 1.0f;
    }

    public static float method766(Class263 class263) {
        return class263.field340;
    }

    public void method767(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2, float k2) {
        this.method774(a2, b2, b2 + d2, c2, c2 + e2, 0.0f, h2, i2, f2, g2, j2, k2);
    }

    public void method768(class_332 a2, int b2, int c2, int d2, float e2, float f2, int g2, int h2, int i2, int j2) {
        Class263.method786(this, a2, b2, b2 + g2, c2, c2 + h2, d2, g2, h2, e2, f2, i2, j2);
    }

    private static void method769(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    protected void method770(class_332 a2, double b2, double c2, double d2, double e2, int f2, int g2) {
        this.method780(a2, b2, c2, d2, e2, f2, g2, (int)field342[0]);
    }

    protected void method771(class_332 a2, String b2, float c2, float d2, int e2) {
        a2.method_51448().method_22905(1.0f, 1.0f, 0.0f);
        float f2 = 1.0f;
        Class263.method769(a2, b2, c2 * f2, d2 * f2, e2);
        a2.method_51448().method_22905(f2, f2, 0.0f);
    }

    static {
        field342 = new long[7];
        Class263.method790(7941977889344719204L);
    }

    public void method772(float a2, float b2) {
        this.method754(a2);
        this.method753(b2);
    }

    private static void method773(Class263 class263, class_332 class_3322, int n2, int n3, int n4, float f2, float f3, int n5, int n6, int n7, int n8) {
        class263.method768(class_3322, n2, n3, n4, f2, f3, n5, n6, n7, n8);
    }

    private void method774(class_332 a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2, float k2, float l2) {
        this.method745(a2.method_51448().method_23760().method_23761(), b2, c2, d2, e2, f2, (i2 + 0.0f) / k2, (i2 + g2) / k2, (j2 + 0.0f) / l2, (j2 + h2) / l2);
    }

    public static float method775() {
        return 1.0f;
    }

    private static class_310 method776() {
        return Class263.method777();
    }

    public static class_310 method777() {
        return field338;
    }

    public float method778() {
        return this.field339 * 1.0f;
    }

    public void method779(Matrix4f a2, float b2, float c2, float d2, float e2, float f2, float g2, float h2, float i2, float j2, float k2, float l2, float m2, float n2) {
        RenderSystem.setShader(class_757::method_34543);
        RenderSystem.enableBlend();
        class_287 o2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        o2.method_22918(a2, b2, d2, f2).method_22915(k2, l2, m2, n2).method_22913(g2, i2);
        o2.method_22918(a2, b2, e2, f2).method_22915(k2, l2, m2, n2).method_22913(g2, j2);
        o2.method_22918(a2, c2, e2, f2).method_22915(k2, l2, m2, n2).method_22913(h2, j2);
        o2.method_22918(a2, c2, d2, f2).method_22915(k2, l2, m2, n2).method_22913(h2, i2);
        class_286.method_43433((class_9801)o2.method_60800());
        RenderSystem.disableBlend();
    }

    protected void method780(class_332 a2, double b2, double c2, double d2, double e2, int f2, int g2, int h2) {
        RenderSystem.enableBlend();
        RenderSystem.setShader(class_757::method_34540);
        class_289 i2 = class_289.method_1348();
        class_287 j2 = i2.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        this.method746(a2.method_51448().method_23760().method_23761(), j2, b2, c2, d2, e2, h2, f2, g2);
        class_286.method_43433((class_9801)j2.method_60800());
        RenderSystem.disableBlend();
    }

    public void method781(class_332 a2, int b2, int c2, int d2, int e2, int f2, int g2) {
        Class263.method773(this, a2, b2, c2, (int)field342[0], d2, e2, f2, g2, (int)field342[6], (int)field342[6]);
    }

    public float method782() {
        return this.field340;
    }

    protected void method783(class_332 b2, double c2, double d2, double e2, int f2) {
        if (d2 < c2) {
            double a2 = c2;
            c2 = d2;
            d2 = a2;
        }
        this.method763(b2, c2, e2, c2 + d2 + 1.0, e2 + 1.0, f2);
    }

    private static void method784(long l2) {
        Class263.field342[4] = l2 ^ 0x6E3792CFDC66097CL;
        Class263.field342[0] = l2 ^ 0x6E3792CFDC660964L;
        Class263.field342[5] = l2 ^ 0x6E3792CFDC660965L;
        Class263.field342[6] = l2 ^ 0x6E3792CFDC660864L;
        Class263.field342[3] = l2 ^ 0x6E3792CFDC660974L;
        Class263.field342[1] = l2 ^ 0x6E3792CFDC66099BL;
        Class263.field342[2] = l2 ^ 0x6E3792CFDC66096CL;
    }

    private static float method785(Class263 class263) {
        return Class263.method791(class263);
    }

    private static void method786(Class263 class263, class_332 class_3322, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        class263.method774(class_3322, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    private void method787(class_8030 h2) {
        if (h2 != null) {
            class_1041 a2 = Class263.method776().method_22683();
            int b2 = a2.method_4506();
            double c2 = a2.method_4495();
            double d2 = (double)h2.method_49620() * c2;
            double e2 = (double)b2 - (double)h2.method_49619() * c2;
            double f2 = (double)h2.comp_1196() * c2;
            double g2 = (double)h2.comp_1197() * c2;
            RenderSystem.enableScissor((int)((int)d2), (int)((int)e2), (int)Math.max((int)field342[0], (int)f2), (int)Math.max((int)field342[0], (int)g2));
            Class1668.method15147(1518252632, -585229243, -97800784, -1745686460);
            return;
        }
        RenderSystem.disableScissor();
    }

    public float method788() {
        return this.field341 * 1.0f;
    }

    @Override
    public abstract void method707(class_332 var1, float var2, float var3, float var4);

    private static void method789(Class263 class263, class_8030 class_80302) {
        class263.method787(class_80302);
    }

    private static void method790(long l2) {
        Class263.method784(l2);
    }

    public static float method791(Class263 class263) {
        return class263.field337;
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

