/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.awt.Color;
import java.awt.Font;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import mapped.Class1018;
import mapped.Class1364;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class214;
import mapped.Class296;
import mapped.Class298;
import mapped.Class301;
import mapped.Class3209;
import mapped.Class359;
import mapped.Class3767;
import mapped.Class3936;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class409;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class447;
import mapped.Class457;
import mapped.Class458;
import mapped.Class5077;
import mapped.Class5550;
import mapped.Class5643;
import mapped.Class5659;
import mapped.Class5670;
import mapped.Class5686;
import mapped.Class5766;
import mapped.Class5799;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class615;
import mapped.Class624;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class651;
import mapped.Class663;
import mapped.Class892;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9801;
import org.joml.Matrix4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class1391
implements Closeable {
    private final ObjectList field5360 = new ObjectArrayList();
    private static final Pattern field5361;
    private final Map field5362;
    private final Char2ObjectArrayMap field5363 = new Char2ObjectArrayMap();
    private Font field5364;
    private static long[] field5365;
    private int field5366;
    private int field5367;
    private final float field5368;

    private static int method14010(int n2, int n3, Class409 class409, Class214 class214) {
        return Class5670.method22332(n2, n3, class409, class214);
    }

    private Class663 method14011(char a2) {
        return Class1391.method14105(this, a2);
    }

    private static void method14012(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method14013(int n2) {
        return Class4045.method20103(n2);
    }

    private int method14014(char a2) {
        int n2;
        switch (a2) {
            case '0': {
                n2 = Color.BLACK.getRGB();
                break;
            }
            case '1': {
                n2 = (int)field5365[25];
                break;
            }
            case '2': {
                n2 = (int)field5365[34];
                break;
            }
            case '3': {
                n2 = (int)field5365[23];
                break;
            }
            case '4': {
                int n3 = (int)field5365[20];
                return Class4045.method20095(-822380985);
            }
            case '5': {
                n2 = (int)field5365[22];
                break;
            }
            case '6': {
                int n4 = (int)field5365[24];
                return Class5659.method22101();
            }
            case '7': {
                int n5 = (int)field5365[29];
                while (true) {
                    // Infinite loop
                }
            }
            case '8': {
                n2 = (int)field5365[30];
                break;
            }
            case '9': {
                n2 = (int)field5365[26];
                break;
            }
            case 'a': {
                n2 = (int)field5365[28];
                break;
            }
            case 'b': {
                n2 = (int)field5365[27];
                break;
            }
            case 'c': {
                n2 = (int)field5365[31];
                break;
            }
            case 'd': {
                n2 = (int)field5365[33];
                break;
            }
            case 'e': {
                n2 = (int)field5365[32];
                break;
            }
            case 'f': {
                int n6 = (int)field5365[21];
                return Class5550.method21885();
            }
            case 's': {
                n2 = Class1391.method14087(Class457.method10620());
                break;
            }
            case 'g': {
                int n7 = Class458.method10623().method10627();
                return Class1391.method14090(1185897646);
            }
            default: {
                n2 = (int)field5365[21];
            }
        }
        return n2;
    }

    private static ObjectList method14015(class_2960 a2) {
        return new ObjectArrayList();
    }

    private static void method14016() {
        Class4146.method20697();
    }

    private static Class296 method14017() {
        return Class296.method1855();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void method14018(class_4587 B2, String C2, float D2, float E2, float F2, float G2, float H2, float I2, boolean J2) {
        int K2 = (int)Class1391.method14050().method_22683().method_4495();
        if (K2 != this.field5366) {
            this.close();
            this.method14044(Class1391.method14034(this), this.field5368);
        }
        float L2 = F2;
        float M2 = G2;
        float N2 = H2;
        B2.method_22903();
        B2.method_46416(D2, E2 -= 3.0f, 0.0f);
        B2.method_22905(1.0f / (float)this.field5367, 1.0f / (float)Class1391.method14078(this), 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.texParameter((int)((int)field5365[14]), (int)((int)field5365[6]), (int)((int)field5365[9]));
        RenderSystem.texParameter((int)((int)field5365[14]), (int)((int)field5365[13]), (int)((int)field5365[9]));
        RenderSystem.setShader(class_757::method_34543);
        class_289 O2 = class_289.method_1348();
        Matrix4f P2 = B2.method_23760().method_23761();
        char[] Q2 = C2.toCharArray();
        float R2 = 0.0f;
        float S2 = 0.0f;
        int T2 = (int)field5365[0];
        int U2 = (int)field5365[0];
        this.field5363.clear();
        float V2 = Class296.method1855().method1843();
        Map map = Class1391.method14060(this);
        synchronized (map) {
            for (int g2 = (int)field5365[0]; g2 < Q2.length; ++g2) {
                char e2;
                block19: {
                    block20: {
                        block17: {
                            block18: {
                                block16: {
                                    e2 = Q2[g2];
                                    if (T2 != 0) break block16;
                                    if (e2 == (int)field5365[7]) break block17;
                                    break block18;
                                }
                                T2 = (int)field5365[0];
                                if (e2 == (int)field5365[8]) {
                                    L2 = F2;
                                    M2 = G2;
                                    N2 = H2;
                                    continue;
                                }
                                int a2 = Class1391.method14037(this, e2);
                                int[] b2 = this.method14107(a2);
                                L2 = (float)b2[(int)field5365[0]] / Class1018.field4212;
                                M2 = (float)b2[(int)field5365[1]] / 255.0f;
                                N2 = (float)b2[(int)field5365[10]] / 255.0f;
                                continue;
                            }
                            if (e2 != (int)field5365[11]) break block19;
                            break block20;
                        }
                        T2 = (int)field5365[1];
                        continue;
                    }
                    S2 += this.method14024(C2.substring(U2, g2)) * (float)Class1391.method14085(this);
                    R2 = 0.0f;
                    U2 = g2 + (int)field5365[1];
                    continue;
                }
                Class663 f2 = (Class663)this.field5363.computeIfAbsent(e2, this::method14011);
                if (f2 == null) continue;
                if (f2.method11493() != (int)field5365[12]) {
                    class_2960 c2 = Class1391.method14101(f2).method22383();
                    Class651 d2 = new Class651(R2, S2, L2, M2, N2, f2);
                    this.field5362.computeIfAbsent(c2, Class1391::method14094).add((Object)d2);
                }
                R2 += (float)Class1391.method14031(f2);
            }
            Iterator iterator = this.field5362.keySet().iterator();
            block9: while (true) {
                int n2 = iterator.hasNext() ? 12628 : 12629;
                block10: while (true) {
                    switch (n2) {
                        case 12629: {
                            n2 = 12627;
                            continue block10;
                        }
                        case 12628: {
                            class_2960 A2 = (class_2960)iterator.next();
                            try {
                                RenderSystem.setShaderTexture((int)((int)field5365[0]), (class_2960)A2);
                            }
                            catch (Exception h2) {
                                continue block9;
                            }
                            class_287 x2 = O2.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                            List y2 = (List)this.field5362.get(A2);
                            for (Class651 w2 : y2) {
                                float j2 = w2.field3169;
                                float k2 = w2.field3165;
                                float l2 = w2.field3166;
                                float m2 = w2.field3168;
                                float n3 = w2.field3167;
                                Class663 o2 = w2.field3164;
                                Class5686 p2 = o2.method11495();
                                float q2 = o2.method11491();
                                float r2 = o2.method11492();
                                float s2 = (float)o2.method11494() / (float)p2.method22417();
                                float t2 = (float)o2.method11489() / (float)Class1391.method14102(p2);
                                float u2 = (float)(o2.method11494() + Class1391.method14058(o2)) / (float)p2.method22417();
                                float v2 = (float)(o2.method11489() + o2.method11492()) / (float)p2.method22384();
                                if (J2) {
                                    float i2 = Class296.method1855().method1836();
                                    x2.method_22918(P2, j2 + i2, k2 + r2 + i2, 0.0f).method_22915(l2 * V2, m2 * V2, n3 * V2, I2).method_22913(s2, v2);
                                    x2.method_22918(P2, j2 + q2 + i2, k2 + r2 + i2, 0.0f).method_22915(l2 * V2, m2 * V2, n3 * V2, I2).method_22913(u2, v2);
                                    x2.method_22918(P2, j2 + q2 + i2, k2 + i2, 0.0f).method_22915(l2 * V2, m2 * V2, n3 * V2, I2).method_22913(u2, t2);
                                    x2.method_22918(P2, j2 + i2, k2 + i2, 0.0f).method_22915(l2 * V2, m2 * V2, n3 * V2, I2).method_22913(s2, t2);
                                }
                                x2.method_22918(P2, j2 + 0.0f, k2 + r2, 0.0f).method_22915(l2, m2, n3, I2).method_22913(s2, v2);
                                x2.method_22918(P2, j2 + q2, k2 + r2, 0.0f).method_22915(l2, m2, n3, I2).method_22913(u2, v2);
                                x2.method_22918(P2, j2 + q2, k2 + 0.0f, 0.0f).method_22915(l2, m2, n3, I2).method_22913(u2, t2);
                                x2.method_22918(P2, j2 + 0.0f, k2 + 0.0f, 0.0f).method_22915(l2, m2, n3, I2).method_22913(s2, t2);
                            }
                            class_9801 z2 = x2.method_60794();
                            if (z2 == null) continue block9;
                            class_286.method_43433((class_9801)z2);
                            continue block9;
                        }
                    }
                    break;
                }
                break;
            }
            this.field5362.clear();
        }
        RenderSystem.disableBlend();
        B2.method_22909();
    }

    private static void method14019(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    static {
        field5365 = new long[35];
        Class1391.method14049(8447681907418968212L);
        field5361 = Pattern.compile("(?i)\\u00A7[0-9A-FK-OG]");
    }

    private static int method14020(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method14021() {
        Class6454.method24594();
    }

    private static int method14022() {
        return Class6454.method24637();
    }

    private static void method14023(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public float method14024(String e2) {
        char[] f2 = Class1391.method14065(e2).toCharArray();
        int n2 = f2.length != 0 ? 3066 : 3065;
        block4: while (true) {
            switch (n2) {
                case 3066: {
                    n2 = 3064;
                    continue block4;
                }
                case 3065: {
                    char[] cArray = new char[(int)field5365[1]];
                    cArray[(int)Class1391.field5365[0]] = (int)field5365[12];
                    f2 = cArray;
                    break block4;
                }
            }
            break;
        }
        float g2 = 0.0f;
        float h2 = 0.0f;
        char[] cArray = f2;
        int n3 = cArray.length;
        int n4 = (int)field5365[0];
        while (true) {
            block11: {
                float f3;
                block12: {
                    Class663 b2;
                    block9: {
                        block10: {
                            block8: {
                                if (n4 >= n3) {
                                    return g2 + h2;
                                }
                                char d2 = cArray[n4];
                                if (d2 == (int)field5365[11]) break block8;
                                b2 = (Class663)Class1391.method14030(this).computeIfAbsent(d2, this::method14099);
                                if (b2 != null) break block9;
                                break block10;
                            }
                            if (g2 == 0.0f) {
                                Class663 a2 = (Class663)this.field5363.computeIfAbsent((char)field5365[12], this::method14112);
                                g2 = (float)a2.method11492() / (float)this.field5367;
                            }
                            h2 += g2;
                            g2 = 0.0f;
                            break block11;
                        }
                        f3 = 0.0f;
                        break block12;
                    }
                    f3 = b2.method11492();
                }
                float c2 = f3;
                g2 = Math.max(c2 / (float)this.field5367, g2);
            }
            ++n4;
        }
    }

    private static void method14025(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method14026() {
        Class6009.method23561();
    }

    private static float method14027() {
        return Class6322.method24325();
    }

    private void method14028(class_4587 a2, String b2, double c2, double d2, int e2, boolean f2) {
        int n2 = e2 >> (int)field5365[3];
        float g2 = (float)(((int)field5365[2] | ~n2) - ~n2) / 255.0f;
        int n3 = e2 >> (int)field5365[4];
        float h2 = (float)(((int)field5365[2] | ~n3) - ~n3) / Class892.field3835;
        float i2 = (float)(e2 & (int)field5365[2]) / Class5077.field10063;
        int n4 = e2 >> (int)field5365[5];
        float j2 = (float)(((int)field5365[2] | ~n4) - ~n4) / 255.0f;
        this.method14018(a2, b2, (float)c2, (float)d2, g2, h2, i2, j2, f2);
    }

    private static int method14029(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    public static Char2ObjectArrayMap method14030(Class1391 class1391) {
        return class1391.field5363;
    }

    private static int method14031(Class663 class663) {
        return class663.method11491();
    }

    private static int method14032() {
        return Class5550.method21885();
    }

    private static int method14033(Class663 class663) {
        return class663.method11494();
    }

    public static Font method14034(Class1391 class1391) {
        return class1391.field5364;
    }

    public void method14035(class_4587 a2, String b2, double c2, double d2, int e2) {
        Class1391.method14115(this, a2, b2, c2, d2, e2, (boolean)field5365[0]);
    }

    private Class663 method14036(char a2) {
        return this.method14082(a2);
    }

    private static int method14037(Class1391 class1391, char c2) {
        return class1391.method14014(c2);
    }

    public void method14038(class_4587 a2, String b2, double c2, double d2, int e2) {
        Class1391.method14043(this, a2, b2, c2, d2, e2, (boolean)field5365[0]);
    }

    private static int method14039(int n2) {
        return Class4045.method20105(n2);
    }

    private static void method14040(float f2) {
        Class5836.method22907(f2);
    }

    private static void method14041() {
        Class5836.method22885();
    }

    private static Char2ObjectArrayMap method14042(Class1391 class1391) {
        return Class1391.method14093(class1391);
    }

    private static void method14043(Class1391 class1391, class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl2) {
        class1391.method14028(class_45872, string, d2, d3, n2, bl2);
    }

    private void method14044(Font a2, float b2) {
        this.field5367 = this.field5366 = (int)Class4122.field9561.method_22683().method_4495();
        this.field5364 = a2.deriveFont(b2 * (float)this.field5367);
    }

    private static int method14045(int n2) {
        return Class4045.method20096(n2);
    }

    private static int method14046() {
        return Class5550.method21885();
    }

    private static void method14047(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static float method14048() {
        return Class5659.method22223();
    }

    private static void method14049(long l2) {
        Class1391.field5365[17] = l2 ^ 0x753C31EFE333B194L;
        Class1391.field5365[3] = l2 ^ 0x753C31EFE333B084L;
        Class1391.field5365[22] = l2 ^ 0x8AC3CE101C99B03EL;
        Class1391.field5365[18] = l2 ^ 0x753C31EFE333B097L;
        Class1391.field5365[2] = l2 ^ 0x753C31EFE333B06BL;
        Class1391.field5365[31] = l2 ^ 0x8AC3CE101CCCE5C1L;
        Class1391.field5365[13] = l2 ^ 0x753C31EFE3339894L;
        Class1391.field5365[15] = l2 ^ 0x8AC3CE101C33B094L;
        Class1391.field5365[4] = l2 ^ 0x753C31EFE333B09CL;
        Class1391.field5365[8] = l2 ^ 0x753C31EFE333B0E6L;
        Class1391.field5365[16] = l2 ^ 0x753C31EFE333B091L;
        Class1391.field5365[26] = l2 ^ 0x8AC3CE101C66E56BL;
        Class1391.field5365[28] = l2 ^ 0x8AC3CE101C664FC1L;
        Class1391.field5365[0] = l2 ^ 0x753C31EFE333B094L;
        Class1391.field5365[30] = l2 ^ 0x8AC3CE101C66E5C1L;
        Class1391.field5365[7] = l2 ^ 0x753C31EFE333B033L;
        Class1391.field5365[33] = l2 ^ 0x8AC3CE101CCCE56BL;
        Class1391.field5365[10] = l2 ^ 0x753C31EFE333B096L;
        Class1391.field5365[21] = l2 ^ 0x8AC3CE101CCC4F6BL;
        Class1391.field5365[27] = l2 ^ 0x8AC3CE101C664F6BL;
        Class1391.field5365[20] = l2 ^ 0x8AC3CE101C99B094L;
        Class1391.field5365[19] = l2 ^ 0x753C31EFE333B090L;
        Class1391.field5365[5] = l2 ^ 0x753C31EFE333B08CL;
        Class1391.field5365[23] = l2 ^ 0x8AC3CE101C331A3EL;
        Class1391.field5365[24] = l2 ^ 0x8AC3CE101CCC1A94L;
        Class1391.field5365[32] = l2 ^ 0x8AC3CE101CCC4FC1L;
        Class1391.field5365[11] = l2 ^ 0x753C31EFE333B09EL;
        Class1391.field5365[34] = l2 ^ 0x8AC3CE101C331A94L;
        Class1391.field5365[29] = l2 ^ 0x8AC3CE101C991A3EL;
        Class1391.field5365[9] = l2 ^ 0x753C31EFE3339695L;
        Class1391.field5365[12] = l2 ^ 0x753C31EFE333B0B4L;
        Class1391.field5365[6] = l2 ^ 0x753C31EFE3339895L;
        Class1391.field5365[1] = l2 ^ 0x753C31EFE333B095L;
        Class1391.field5365[25] = l2 ^ 0x8AC3CE101C33B03EL;
        Class1391.field5365[14] = l2 ^ 0x753C31EFE333BD75L;
    }

    private static class_310 method14050() {
        return Class1391.method14074();
    }

    private static int method14051(int n2, int n3, Class3209 class3209, Class359 class359) {
        return Class5670.method22297(n2, n3, class3209, class359);
    }

    private static void method14052() {
        Class6454.method24594();
    }

    private static float method14053(Class296 class296) {
        return class296.method1836();
    }

    public Class1391(InputStream b2, float c2) {
        this.field5362 = new Object2ObjectOpenHashMap();
        try {
            this.field5364 = Font.createFont((int)field5365[0], b2);
        }
        catch (Throwable a2) {
            a2.printStackTrace();
            this.field5364 = new Font("Verdana", (int)field5365[0], Math.round(c2));
        }
        this.field5368 = c2;
        this.method14044(this.field5364, c2);
    }

    public void method14054(class_4587 a2, String b2, double c2, double d2, Color e2) {
        this.method14077(a2, b2, c2, d2, e2, (boolean)field5365[0]);
    }

    private static void method14055(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public float method14056() {
        return this.field5368;
    }

    private static void method14057() {
        Class5836.method22890();
    }

    private static int method14058(Class663 class663) {
        return class663.method11491();
    }

    private static void method14059() {
        Class5659.method22184();
    }

    public static Map method14060(Class1391 class1391) {
        return class1391.field5362;
    }

    public void method14061(class_4587 a2, String b2, double c2, double d2, int e2, boolean f2) {
        int n2 = e2 >> (int)field5365[3];
        float g2 = (float)(((int)field5365[2] | ~n2) - ~n2) / Class5799.field11285;
        int n3 = e2 >> (int)field5365[4];
        float h2 = (float)(((int)field5365[2] | ~n3) - ~n3) / 255.0f;
        float i2 = (float)(e2 & (int)field5365[2]) / 255.0f;
        int n4 = e2;
        float j2 = ((int)field5365[15] | ~n4) - ~n4 != (int)field5365[15] ? 1.0f : (float)(e2 >> (int)field5365[5] & (int)field5365[2]) / Class3936.field8962;
        this.method14018(a2, b2, (float)(c2 - (double)(this.method14084(b2) / 2.0f)), (float)d2, g2, h2, i2, j2, f2);
    }

    private static void method14062(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method14063() {
        return Class6454.method24637();
    }

    private static void method14064() {
        Class298.method1924();
    }

    private static String method14065(String string) {
        return Class1391.method14081(string);
    }

    private static int method14066(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static Char2ObjectArrayMap method14067(Class1391 class1391) {
        return class1391.field5363;
    }

    private static void method14068(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public void method14069(class_4587 a2, String b2, double c2, double d2, Color e2) {
        this.method14077(a2, b2, c2, d2, e2, (boolean)field5365[0]);
    }

    private static float method14070() {
        return Class6322.method24327();
    }

    private static float method14071(Class1391 class1391, String string) {
        return class1391.method14024(string);
    }

    private Class663 method14072(char a2) {
        return this.method14082(a2);
    }

    public static ObjectList method14073(Class1391 class1391) {
        return class1391.field5360;
    }

    public static class_310 method14074() {
        return Class4122.field9561;
    }

    private static float method14075(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    private static void method14076(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public void method14077(class_4587 a2, String b2, double c2, double d2, Color e2, boolean f2) {
        this.method14018(a2, b2, (float)c2, (float)d2, (float)e2.getRed() / 255.0f, (float)e2.getGreen() / 255.0f, (float)e2.getBlue() / 255.0f, e2.getAlpha(), f2);
    }

    public static int method14078(Class1391 class1391) {
        return class1391.field5367;
    }

    private static void method14079() {
        Class5836.method22890();
    }

    public void method14080(class_4587 a2, String b2, double c2, double d2, Color e2, boolean f2) {
        this.method14018(a2, b2, (float)(c2 - (double)(this.method14084(b2) / 2.0f)), (float)d2, (float)e2.getRed() / 255.0f, (float)e2.getGreen() / 255.0f, (float)e2.getBlue() / 255.0f, (float)e2.getAlpha() / 255.0f, f2);
    }

    public static String method14081(String a2) {
        return field5361.matcher(a2).replaceAll("");
    }

    /*
     * Enabled aggressive block sorting
     */
    private Class663 method14082(char b2) {
        ObjectListIterator objectListIterator = this.field5360.iterator();
        int n2 = !objectListIterator.hasNext() ? 59161 : 59160;
        block4: while (true) {
            switch (n2) {
                case 59161: {
                    n2 = 59159;
                    continue block4;
                }
                case 59160: {
                    Class5686 a2 = (Class5686)objectListIterator.next();
                    if (a2.method22392(b2)) {
                        return a2.method22404(b2);
                    }
                    Class298.method1924();
                    return null;
                }
            }
            break;
        }
        int c2 = (int)field5365[17] * (int)Math.floor((double)b2 / Class1364.field5256);
        Class5686 d2 = new Class5686((char)c2, (char)(c2 + (int)field5365[17]), this.field5364, Class1391.method14086(this), (int)field5365[16], Class296.method1855().method1837(), Class296.method1855().method1849());
        Class1391.method14073(this).add((Object)d2);
        return d2.method22404(b2);
    }

    private static int method14083(int n2) {
        return Class4045.method20103(n2);
    }

    public float method14084(String d2) {
        char[] e2 = Class1391.method14118(d2).toCharArray();
        float f2 = 0.0f;
        float g2 = 0.0f;
        char[] cArray = e2;
        int n2 = cArray.length;
        for (int i2 = (int)field5365[0]; i2 < n2; ++i2) {
            char c2 = cArray[i2];
            if (c2 == (int)field5365[11]) {
                g2 = Math.max(f2, g2);
                f2 = 0.0f;
                continue;
            }
            Class663 a2 = (Class663)this.field5363.computeIfAbsent(c2, this::method14036);
            float b2 = a2 == null ? 0.0f : (float)a2.method11491();
            f2 += b2 / (float)this.field5367;
        }
        return Math.max(f2, g2);
    }

    private static int method14085(Class1391 class1391) {
        return Class1391.method14096(class1391);
    }

    private static class_2960 method14086(Class1391 class1391) {
        return class1391.method14110();
    }

    private static Integer method14087(Class457 class457) {
        return class457.method10621();
    }

    private static void method14088() {
        Class4146.method20694();
    }

    private static int method14089(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static int method14090(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method14091(float f2) {
        Class5836.method22907(f2);
    }

    private static int method14092(int n2, int n3, Class624 class624, Class615 class615) {
        return Class5670.method22345(n2, n3, class624, class615);
    }

    public static Char2ObjectArrayMap method14093(Class1391 class1391) {
        return class1391.field5363;
    }

    private static ObjectList method14094(class_2960 a2) {
        return new ObjectArrayList();
    }

    private static void method14095() {
        Class5836.method22885();
    }

    public static int method14096(Class1391 class1391) {
        return class1391.field5367;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method14097(class_4587 B2, String C2, float D2, float E2, float F2, float G2, float H2, float I2) {
        int J2 = (int)Class4122.field9561.method_22683().method_4495();
        if (J2 != this.field5366) {
            this.close();
            this.method14044(this.field5364, this.field5368);
        }
        float K2 = F2;
        float L2 = G2;
        float M2 = H2;
        B2.method_22903();
        B2.method_46416(D2, E2 -= 3.0f, 0.0f);
        B2.method_22905(1.0f / (float)this.field5367, 1.0f / (float)this.field5367, 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.texParameter((int)((int)field5365[14]), (int)((int)field5365[6]), (int)((int)field5365[9]));
        RenderSystem.texParameter((int)((int)field5365[14]), (int)((int)field5365[13]), (int)((int)field5365[9]));
        RenderSystem.setShader(class_757::method_34543);
        class_289 N2 = class_289.method_1348();
        Matrix4f O2 = B2.method_23760().method_23761();
        char[] P2 = C2.toCharArray();
        float Q2 = 0.0f;
        float R2 = 0.0f;
        int S2 = (int)field5365[0];
        int T2 = (int)field5365[0];
        Class1391.method14042(this).clear();
        float U2 = Class1391.method14017().method1843();
        Map map = this.field5362;
        synchronized (map) {
            for (int g2 = (int)field5365[0]; g2 < P2.length; ++g2) {
                char e2 = P2[g2];
                if (S2 != 0) {
                    S2 = (int)field5365[0];
                    if (e2 == (int)field5365[8]) {
                        K2 = F2;
                        L2 = G2;
                        M2 = H2;
                        continue;
                    }
                    int a2 = this.method14014(e2);
                    int[] b2 = this.method14107(a2);
                    K2 = (float)b2[(int)field5365[0]] / 255.0f;
                    L2 = (float)b2[(int)field5365[1]] / Class5766.field11189;
                    M2 = (float)b2[(int)field5365[10]] / Class3767.field8533;
                    continue;
                }
                if (e2 == (int)field5365[7]) {
                    S2 = (int)field5365[1];
                    continue;
                }
                if (e2 == (int)field5365[11]) {
                    R2 += Class1391.method14071(this, C2.substring(T2, g2)) * (float)this.field5367;
                    Q2 = 0.0f;
                    T2 = g2 + (int)field5365[1];
                    Class1668.method15147(1438786063, -557834552, 1521561798, 486410191);
                    return;
                }
                Class663 f2 = (Class663)Class1391.method14067(this).computeIfAbsent(e2, this::method14072);
                if (f2 == null) continue;
                if (f2.method11493() != (int)field5365[12]) {
                    class_2960 c2 = f2.method11495().method22383();
                    Class651 d2 = new Class651(Q2, R2, K2, L2, M2, f2);
                    this.field5362.computeIfAbsent(c2, Class1391::method14015).add((Object)d2);
                }
                Q2 += (float)f2.method11491();
            }
            for (class_2960 A2 : Class1391.method14100(this).keySet()) {
                try {
                    RenderSystem.setShaderTexture((int)((int)field5365[0]), (class_2960)A2);
                }
                catch (Exception h2) {
                    continue;
                }
                class_287 x2 = N2.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                List y2 = (List)this.field5362.get(A2);
                for (Class651 w2 : y2) {
                    float i2 = w2.field3169;
                    float j2 = w2.field3165;
                    float k2 = w2.field3166;
                    float l2 = w2.field3168;
                    float m2 = w2.field3167;
                    Class663 n2 = w2.field3164;
                    Class5686 o2 = n2.method11495();
                    float p2 = n2.method11491();
                    float q2 = n2.method11492();
                    float r2 = (float)Class1391.method14033(n2) / (float)o2.method22417();
                    float s2 = (float)n2.method11489() / (float)Class1391.method14113(o2);
                    float t2 = (float)(n2.method11494() + n2.method11491()) / (float)o2.method22417();
                    float u2 = (float)(n2.method11489() + n2.method11492()) / (float)o2.method22384();
                    float v2 = Class1391.method14053(Class296.method1855());
                    x2.method_22918(O2, i2 + v2, j2 + q2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, u2);
                    x2.method_22918(O2, i2 + p2 + v2, j2 + q2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, u2);
                    x2.method_22918(O2, i2 + p2 + v2, j2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, s2);
                    x2.method_22918(O2, i2 + v2, j2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, s2);
                    x2.method_22918(O2, i2 - v2, j2 + q2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, u2);
                    x2.method_22918(O2, i2 + p2 - v2, j2 + q2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, u2);
                    x2.method_22918(O2, i2 + p2 - v2, j2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, s2);
                    x2.method_22918(O2, i2 - v2, j2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, s2);
                    x2.method_22918(O2, i2 - v2, j2 + q2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, u2);
                    x2.method_22918(O2, i2 + p2 - v2, j2 + q2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, u2);
                    x2.method_22918(O2, i2 + p2 - v2, j2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, s2);
                    x2.method_22918(O2, i2 - v2, j2 + v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, s2);
                    x2.method_22918(O2, i2 + v2, j2 + q2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, u2);
                    x2.method_22918(O2, i2 + p2 + v2, j2 + q2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, u2);
                    x2.method_22918(O2, i2 + p2 + v2, j2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(t2, s2);
                    x2.method_22918(O2, i2 + v2, j2 - v2, 0.0f).method_22915(k2 * U2, l2 * U2, m2 * U2, I2).method_22913(r2, s2);
                    x2.method_22918(O2, i2 + 0.0f, j2 + q2, 0.0f).method_22915(k2, l2, m2, I2).method_22913(r2, u2);
                    x2.method_22918(O2, i2 + p2, j2 + q2, 0.0f).method_22915(k2, l2, m2, I2).method_22913(t2, u2);
                    x2.method_22918(O2, i2 + p2, j2 + 0.0f, 0.0f).method_22915(k2, l2, m2, I2).method_22913(t2, s2);
                    x2.method_22918(O2, i2 + 0.0f, j2 + 0.0f, 0.0f).method_22915(k2, l2, m2, I2).method_22913(r2, s2);
                }
                class_9801 z2 = x2.method_60794();
                if (z2 == null) continue;
                class_286.method_43433((class_9801)z2);
            }
            this.field5362.clear();
        }
        RenderSystem.disableBlend();
        B2.method_22909();
    }

    private static void method14098() {
        Class1745.method15538();
    }

    private Class663 method14099(char a2) {
        return this.method14082(a2);
    }

    public static Map method14100(Class1391 class1391) {
        return class1391.field5362;
    }

    private static Class5686 method14101(Class663 class663) {
        return class663.method11495();
    }

    private static int method14102(Class5686 class5686) {
        return class5686.method22384();
    }

    private static void method14103() {
        Class5659.method22184();
    }

    private static int method14104(int n2, int n3, Class301 class301, Class447 class447) {
        return Class5670.method22296(n2, n3, class301, class447);
    }

    private static Class663 method14105(Class1391 class1391, char c2) {
        return class1391.method14082(c2);
    }

    private static void method14106() {
        Class1745.method15538();
    }

    public int[] method14107(int a2) {
        float b2 = a2 >> (int)field5365[3] & (int)field5365[2];
        int n2 = a2 >> (int)field5365[4];
        float c2 = ((int)field5365[2] | ~n2) - ~n2;
        int n3 = a2;
        float d2 = ((int)field5365[2] | ~n3) - ~n3;
        if ((a2 & (int)field5365[15]) != (int)field5365[15]) {
            float f2 = 255.0f;
            throw null;
        }
        float e2 = a2 >> (int)field5365[5] & (int)field5365[2];
        int[] nArray = new int[(int)field5365[19]];
        nArray[(int)Class1391.field5365[0]] = (int)b2;
        nArray[(int)Class1391.field5365[1]] = (int)c2;
        nArray[(int)Class1391.field5365[10]] = (int)d2;
        nArray[(int)Class1391.field5365[18]] = (int)e2;
        return nArray;
    }

    public void method14108(class_4587 a2, String b2, double c2, double d2, int e2) {
        this.method14028(a2, b2, c2, d2, e2, (boolean)field5365[1]);
    }

    private static float method14109() {
        return Class5659.method22208();
    }

    public class_2960 method14110() {
        return class_2960.method_60655((String)"hachimi", (String)("font/storage/" + Class5643.method22064((int)field5365[12])));
    }

    private static void method14111() {
        Class1503.method14420();
    }

    private Class663 method14112(char a2) {
        return this.method14082(a2);
    }

    @Override
    public void close() {
        try {
            for (Class5686 a2 : this.field5360) {
                a2.method22388();
            }
            this.field5360.clear();
            this.field5363.clear();
        }
        catch (Exception b2) {
            b2.printStackTrace();
        }
    }

    private static int method14113(Class5686 class5686) {
        return class5686.method22384();
    }

    private static float method14114() {
        return Class6322.method24337();
    }

    private static void method14115(Class1391 class1391, class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl2) {
        class1391.method14028(class_45872, string, d2, d3, n2, bl2);
    }

    private static int method14116() {
        return Class5659.method22101();
    }

    private static void method14117() {
        Class4146.method20697();
    }

    private static String method14118(String string) {
        return Class1391.method14081(string);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

