/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.awt.Color;
import mapped.Class1446;
import mapped.Class4173;
import mapped.Class6009;
import mapped.Class6155;
import mapped.Class6207;
import mapped.Class6322;
import mapped.Class6420;
import mapped.Class803;
import mapped.Class921;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4045 {
    private static long[] field9325 = new long[7];

    public static Color method20088(Color a2, int b2) {
        b2 = Math.max(Math.min((int)field9325[1], b2), (int)field9325[4]);
        return new Color(a2.getRed(), a2.getGreen(), a2.getBlue(), b2);
    }

    public static Color method20089(Color a2, Color b2, double c2) {
        c2 = Math.min(Math.max(c2, 0.0), 1.0);
        int d2 = a2.getRed();
        int e2 = a2.getGreen();
        int f2 = a2.getBlue();
        int g2 = a2.getAlpha();
        int h2 = b2.getRed();
        int i2 = b2.getGreen();
        int j2 = b2.getBlue();
        int k2 = b2.getAlpha();
        return new Color(Math.min((int)((double)d2 + (double)(h2 - d2) * c2), (int)field9325[1]), Math.min((int)((double)e2 + (double)(i2 - e2) * c2), (int)field9325[1]), Math.min((int)((double)f2 + (double)(j2 - f2) * c2), (int)field9325[1]), Math.min((int)((double)g2 + (double)(k2 - g2) * c2), (int)field9325[1]));
    }

    public static int method20090(int a2, float b2) {
        if (b2 == 1.0f) {
            return a2;
        }
        float c2 = a2 >> (int)field9325[3] & (int)field9325[1];
        b2 = Math.max(0.0f, Math.min(1.0f, b2));
        int d2 = Math.max((int)field9325[5], (int)(c2 * b2));
        int n2 = a2;
        int n3 = ((int)field9325[6] | ~n2) - ~n2;
        return n3 + (d2 << (int)field9325[3] & ~n3);
    }

    private static void method20091(long l2) {
        Class4045.field9325[2] = l2 ^ 0x5749A847C9F9E474L;
        Class4045.field9325[3] = l2 ^ 0x5749A847C9F9E464L;
        Class4045.field9325[5] = l2 ^ 0x5749A847C9F9E476L;
        Class4045.field9325[4] = l2 ^ 0x5749A847C9F9E47CL;
        Class4045.field9325[0] = l2 ^ 0x5749A847C9F9E46CL;
        Class4045.field9325[6] = l2 ^ 0x5749A847C9061B83L;
        Class4045.field9325[1] = l2 ^ 0x5749A847C9F9E483L;
    }

    private static void method20092() {
        Class6009.method23561();
    }

    public static int method20093(int a2, int b2) {
        int c2 = (int)field9325[1] & a2 >> (int)field9325[0];
        int n2 = (int)field9325[1];
        int d2 = (a2 | ~n2) - ~n2;
        int e2 = (int)field9325[1] & a2 >> (int)field9325[2];
        int n3 = c2 << (int)field9325[0];
        return n3 + (b2 << (int)field9325[3] & ~n3) | e2 << (int)field9325[2] | d2;
    }

    private static float method20094() {
        return Class803.method12221();
    }

    public static int method20095(int a2) {
        return a2 >> (int)field9325[0] & (int)field9325[1];
    }

    public static int method20096(int a2) {
        return a2 >> (int)field9325[3] & (int)field9325[1];
    }

    private static float method20097(float a2, float b2, float c2) {
        if (c2 < 0.0f) {
            c2 += 1.0f;
        }
        if (c2 > 1.0f) {
            c2 -= 1.0f;
        }
        if (6.0f * c2 < 1.0f) {
            return a2 + (b2 - a2) * 6.0f * c2;
        }
        if (2.0f * c2 < 1.0f) {
            return b2;
        }
        if (3.0f * c2 < 2.0f) {
            return a2 + (b2 - a2) * 6.0f * (0.6666667f - c2);
        }
        return a2;
    }

    private static void method20098(long l2) {
        Class4045.method20091(l2);
    }

    private static float method20099() {
        return Class6322.method24337();
    }

    public static int method20100(int a2, float b2) {
        return Class4045.method20093(a2, (int)(Class6420.field13314 * b2));
    }

    public static Color method20101(float a2, Color b2, Color c2) {
        float d2 = (float)b2.getRed() / Class921.field3909;
        float e2 = (float)b2.getGreen() / 255.0f;
        float f2 = (float)b2.getBlue() / 255.0f;
        float g2 = (float)b2.getAlpha() / 255.0f;
        float h2 = (float)c2.getRed() / 255.0f;
        float i2 = (float)c2.getGreen() / 255.0f;
        float j2 = (float)c2.getBlue() / Class4173.field9725;
        float k2 = (float)c2.getAlpha() / Class1446.field5503;
        return new Color(d2 * a2 + h2 * (1.0f - a2), e2 * a2 + i2 * (1.0f - a2), f2 * a2 + j2 * (1.0f - a2), g2 * a2 + k2 * (1.0f - a2));
    }

    private static float method20102(float f2, float f3, float f4) {
        return Class803.method12252(f2, f3, f4);
    }

    static {
        Class4045.method20098(6289743380884350076L);
    }

    public static int method20103(int a2) {
        int n2 = a2 >> (int)field9325[2];
        return ((int)field9325[1] | ~n2) - ~n2;
    }

    /*
     * Unable to fully structure code
     */
    public static Color method20104(float a, float b, float c, float d) {
        block9: {
            block5: {
                block8: {
                    block7: {
                        block6: {
                            if (b < 0.0f) break block6;
                            if (!(b > 100.0f)) break block7;
                        }
                        throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
                    }
                    if (c < 0.0f || c > 100.0f) {
                        throw new IllegalArgumentException("Color parameter outside of expected range - Lightness");
                    }
                    if (d < 0.0f) break block5;
                    if (!(d > 1.0f)) break block8;
                    v0 = 50576;
                    ** GOTO lbl17
                }
                v0 = 50577;
                if (true) ** GOTO lbl17
                do {
                    v0 = var4_4 = 50575;
lbl17:
                    // 3 sources

                    if (var4_4 == 50576) break block5;
                } while (var4_4 == 50577);
                break block9;
            }
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        a %= 360.0f;
        e = (double)c < 0.5 ? c * (1.0f + b) : (c /= Class6155.field12472) + (b /= 100.0f) - b * c;
        b = 2.0f * c - e;
        c = Math.max(0.0f, Class4045.method20097(b, e, (a /= 360.0f) + Class6207.field12637));
        f = Math.max(0.0f, Class4045.method20097(b, e, a));
        b = Math.max(0.0f, Class4045.method20097(b, e, a - 0.33333334f));
        c = Math.min(c, 1.0f);
        f = Math.min(f, 1.0f);
        b = Math.min(b, 1.0f);
        return new Color(c, f, b, d);
    }

    public static int method20105(int a2) {
        int n2 = a2;
        return ((int)field9325[1] | ~n2) - ~n2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

