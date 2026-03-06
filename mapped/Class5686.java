/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap
 *  net.minecraft.class_1011
 *  net.minecraft.class_1011$class_1012
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  org.lwjgl.system.MemoryUtil
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.nio.IntBuffer;
import java.util.ArrayList;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class3730;
import mapped.Class3979;
import mapped.Class408;
import mapped.Class4122;
import mapped.Class5649;
import mapped.Class5836;
import mapped.Class5938;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class663;
import mapped.Class76;
import net.hachimi.client.mixin.ar;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.system.MemoryUtil;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5686 {
    private int field10915;
    private final char field10916;
    private static long[] field10917 = new long[7];
    private final int field10918;
    private final char field10919;
    private final Font field10920;
    private final Char2ObjectArrayMap field10921 = new Char2ObjectArrayMap();
    private final boolean field10922;
    private int field10923;
    private boolean field10924;
    private final boolean field10925;
    private final class_2960 field10926;

    private static void method22377() {
        Class1503.method14420();
    }

    private static void method22378() {
        Class5836.method22897();
    }

    public static int method22379(Class5686 class5686) {
        return class5686.field10918;
    }

    private static void method22380(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method22381() {
        Class6009.method23561();
    }

    private static void method22382() {
        Class3979.method19561();
    }

    public class_2960 method22383() {
        return this.field10926;
    }

    public int method22384() {
        return this.field10915;
    }

    public static char method22385(Class5686 class5686) {
        return class5686.field10916;
    }

    public static Object method22386() {
        return RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
    }

    private static int method22387(int n2, int n3, Class76 class76, Class5938 class5938) {
        return Class3730.method18205(n2, n3, class76, class5938);
    }

    public void method22388() {
        Class4122.field9561.method_1531().method_4615(this.field10926);
        this.field10921.clear();
        Class5686.method22416(this, (boolean)field10917[0]);
    }

    private static void method22389(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Unable to fully structure code
     */
    public void method22390() {
        if (this.field10924) {
            return;
        }
        g = new ArrayList<Class663>();
        h = this.field10919 - Class5686.method22385(this) - (int)Class5686.field10917[1];
        i = (int)(Math.ceil(Math.sqrt(h)) * 1.5);
        j = (int)Class5686.field10917[0];
        k = (int)Class5686.field10917[0];
        l = (int)Class5686.field10917[0];
        m = (int)Class5686.field10917[0];
        n = (int)Class5686.field10917[0];
        o = (int)Class5686.field10917[0];
        p = (int)Class5686.field10917[0];
        q = new FontRenderContext(new AffineTransform(), this.field10922, this.field10925);
        while (j <= h) {
            block8: {
                block7: {
                    a = (char)(this.field10916 + j);
                    b = this.field10920.getStringBounds(String.valueOf(a), q);
                    c = (int)Math.ceil(b.getWidth());
                    d = (int)Math.ceil(b.getHeight());
                    ++j;
                    l = Math.max(l, n + c);
                    m = Math.max(m, o + d);
                    if (k >= i) {
                        v0 = 26656;
                        Class5836.method22897();
                        return;
                    }
                    v1 = 26657;
                    if (true) ** GOTO lbl30
                    do {
                        v1 = var16_19 = 26655;
lbl30:
                        // 2 sources

                        if (var16_19 == 26656) break block7;
                    } while (var16_19 == 26657);
                    break block8;
                }
                n = (int)Class5686.field10917[0];
                o += p + this.field10918;
                k = (int)Class5686.field10917[0];
                p = (int)Class5686.field10917[0];
            }
            p = Math.max(p, d);
            g.add(new Class663(n, o, c, d, a, this));
            n += c + this.field10918;
            ++k;
        }
        r = new BufferedImage(Math.max(l + this.field10918, (int)Class5686.field10917[1]), Math.max(m + Class5686.method22379(this), (int)Class5686.field10917[1]), (int)Class5686.field10917[3]);
        this.field10923 = r.getWidth();
        this.field10915 = r.getHeight();
        s = r.createGraphics();
        s.setColor(new Color((int)Class5686.field10917[2], (int)Class5686.field10917[2], (int)Class5686.field10917[2], (int)Class5686.field10917[0]));
        s.fillRect((int)Class5686.field10917[0], (int)Class5686.field10917[0], Class5686.method22399(this), this.field10915);
        s.setColor(Color.WHITE);
        if (this.field10925) {
            v2 = Class5686.method22413();
            Class1745.method15538();
            return;
        }
        s.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, Class5686.method22408());
        if (!this.field10922) {
            Class6009.method23561();
            return;
        }
        s.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        s.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, Class5686.method22411(this) != false ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        for (Class663 f : g) {
            s.setFont(this.field10920);
            e = s.getFontMetrics();
            s.drawString(String.valueOf(f.method11493()), f.method11494(), f.method11489() + e.getAscent());
            this.field10921.put(f.method11493(), (Object)f);
        }
        this.method22405(this.field10926, r);
        this.field10924 = (int)Class5686.field10917[1];
    }

    public static class_310 method22391() {
        return Class4122.field9561;
    }

    public boolean method22392(char a2) {
        if (a2 >= Class5686.method22395(this) && a2 < this.field10919) {
            int n2 = (int)field10917[1];
            return Class408.method6431();
        }
        return (int)field10917[0] != 0;
    }

    private static void method22393(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method22394(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static char method22395(Class5686 class5686) {
        return class5686.field10916;
    }

    private static boolean method22396() {
        return Class408.method6431();
    }

    private static void method22397(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method22398() {
        return Class5836.method22894();
    }

    public static int method22399(Class5686 class5686) {
        return class5686.field10923;
    }

    private static void method22400(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method22401() {
        Class6454.method24594();
    }

    private static void method22402(class_2960 a2, class_1043 b2) {
        Class5686.method22409().method_1531().method_4616(a2, (class_1044)b2);
    }

    private static void method22403(float f2) {
        Class5836.method22907(f2);
    }

    static {
        Class5686.method22410(-1827159954253642673L);
    }

    public Class663 method22404(char a2) {
        if (this.field10924) {
            Class5836.method22897();
            return null;
        }
        this.method22390();
        return (Class663)this.field10921.get(a2);
    }

    public void method22405(class_2960 t2, BufferedImage u2) {
        try {
            Object[] objectArray;
            ColorModel n2;
            WritableRaster m2;
            IntBuffer l2;
            class_1011 j2;
            int i2;
            int h2;
            block18: {
                int p2;
                block14: {
                    int o2;
                    block17: {
                        block16: {
                            block15: {
                                h2 = u2.getWidth();
                                i2 = u2.getHeight();
                                j2 = new class_1011(class_1011.class_1012.field_4997, h2, i2, (boolean)field10917[0]);
                                long k2 = ((ar)j2).hookGetPointer();
                                l2 = MemoryUtil.memIntBuffer((long)k2, (int)(j2.method_4307() * j2.method_4323()));
                                m2 = u2.getRaster();
                                n2 = u2.getColorModel();
                                o2 = m2.getNumBands();
                                p2 = m2.getDataBuffer().getDataType();
                                switch (p2 ^ 0xE0FF2272) {
                                    default: {
                                        break block14;
                                    }
                                    case -520150416: {
                                        break block14;
                                    }
                                    case -520150415: {
                                        Class1668.method15147(266039686, 738672500, -1548960757, 543638840);
                                        return;
                                    }
                                    case -520150414: {
                                        break;
                                    }
                                    case -520150413: {
                                        break block15;
                                    }
                                    case -520150410: {
                                        break block16;
                                    }
                                    case -520150409: {
                                        break block17;
                                    }
                                }
                                objectArray = new byte[o2];
                                break block18;
                            }
                            objectArray = new short[o2];
                            break block18;
                        }
                        objectArray = new float[o2];
                        break block18;
                    }
                    objectArray = new double[o2];
                    break block18;
                }
                throw new IllegalArgumentException("Unknown data buffer type: " + p2);
            }
            Object[] q2 = objectArray;
            for (int g2 = (int)field10917[0]; g2 < i2; ++g2) {
                for (int f2 = (int)field10917[0]; f2 < h2; ++f2) {
                    m2.getDataElements(f2, g2, q2);
                    int a2 = n2.getAlpha(q2);
                    int b2 = n2.getRed(q2);
                    int c2 = n2.getGreen(q2);
                    int d2 = n2.getBlue(q2);
                    int e2 = a2 << (int)field10917[5] | d2 << (int)field10917[6] | c2 << (int)field10917[4] | b2;
                    l2.put(e2);
                }
            }
            class_1043 r2 = new class_1043(j2);
            r2.method_4524();
            r2.method_4527((boolean)field10917[1], (boolean)field10917[1]);
            if (RenderSystem.isOnRenderThread()) {
                Class4122.field9561.method_1531().method_4616(t2, (class_1044)r2);
            } else {
                RenderSystem.recordRenderCall(() -> Class5686.method22402(t2, r2));
            }
        }
        catch (Throwable s2) {
            s2.printStackTrace();
        }
    }

    private static void method22406(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public Class5686(char a2, char b2, Font c2, class_2960 d2, int e2, boolean f2, boolean g2) {
        this.field10916 = a2;
        this.field10919 = b2;
        this.field10920 = c2;
        this.field10926 = d2;
        this.field10918 = e2;
        this.field10922 = f2;
        this.field10925 = g2;
    }

    private static boolean method22407(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static Object method22408() {
        return Class5686.method22386();
    }

    private static class_310 method22409() {
        return Class5686.method22391();
    }

    private static void method22410(long l2) {
        Class5686.field10917[5] = l2 ^ 0xE6A49FB3CAE48457L;
        Class5686.field10917[1] = l2 ^ 0xE6A49FB3CAE4844EL;
        Class5686.field10917[0] = l2 ^ 0xE6A49FB3CAE4844FL;
        Class5686.field10917[6] = l2 ^ 0xE6A49FB3CAE4845FL;
        Class5686.field10917[2] = l2 ^ 0xE6A49FB3CAE484B0L;
        Class5686.field10917[3] = l2 ^ 0xE6A49FB3CAE4844DL;
        Class5686.field10917[4] = l2 ^ 0xE6A49FB3CAE48447L;
    }

    public static boolean method22411(Class5686 class5686) {
        return class5686.field10922;
    }

    private static void method22412() {
        Class1503.method14420();
    }

    public static Object method22413() {
        return RenderingHints.VALUE_FRACTIONALMETRICS_ON;
    }

    public static Object method22414() {
        return RenderingHints.VALUE_ANTIALIAS_OFF;
    }

    private static void method22415(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static void method22416(Class5686 class5686, boolean bl2) {
        class5686.field10924 = bl2;
    }

    public int method22417() {
        return this.field10923;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

