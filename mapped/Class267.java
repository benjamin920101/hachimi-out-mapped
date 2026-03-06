/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.sound.SoundEvent
 *  org.apache.commons.lang3.ArrayUtils
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1372;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class262;
import mapped.Class266;
import mapped.Class298;
import mapped.Class333;
import mapped.Class4146;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.sound.SoundEvent;
import org.apache.commons.lang3.ArrayUtils;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

public class Class267
extends Class266 {
    private static long[] field346;
    private boolean field347;
    private boolean field348;
    private char[] field349;
    public static String field350;
    private boolean field351;
    private final Class925 field352 = new Class926();
    public static boolean $skidonion$998553758;

    public Class267(Class262 a2, float b2, float c2) {
        super(a2, b2, c2, 95.0f, 13.0f);
        this.field349 = "".toCharArray();
    }

    private static void method794() {
        Class1503.method14420();
    }

    private static void method795() {
        Class298.method1924();
    }

    public boolean method796() {
        return Class267.method800(this);
    }

    private static void method797(Class5693 class5693, class_3414 class_34142) {
        class5693.method22448(class_34142);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method649(double a2, double b2, int c2) {
        if (this.method744(a2, b2)) {
            if (c2 != 0) {
                return;
            }
            if (!this.field351) {
                Class5836.method22897();
                return;
            }
        } else {
            if (!Class333.method2989().method3019()) {
                this.field351 = (int)field346[3];
                field350 = null;
                this.field349 = "".toCharArray();
                return;
            }
            this.field347 = (int)field346[4];
            return;
        }
        int n2 = 4449;
        block4: while (true) {
            switch (n2) {
                case 4450: {
                    n2 = 4448;
                    continue block4;
                }
                case 4449: {
                    if (this.field347) break block4;
                }
                default: {
                    this.field351 = !this.field351 ? (int)field346[4] : (int)field346[3];
                    int n3 = this.field351 ? 1 : 0;
                    if (this.field351) break block4;
                    field350 = null;
                    this.field349 = "".toCharArray();
                }
            }
            break;
        }
        this.field347 = (int)field346[3];
        if (!Class333.method2989().method3011()) return;
        Class267.method797(Class5723.field11041, Class267.method811());
    }

    @Override
    public void method727(char a2, int b2) {
        if (this.field351 && !Class267.method813(this)) {
            this.field349 = ArrayUtils.add((char[])this.field349, (char)a2);
            field350 = new String(this.field349);
        }
    }

    static {
        ___.___(45, Class267.class);
        ____.___45_70(Class267.class);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method798(class_332 a2, float b2, float c2, float d2, float e2, float f2) {
        Object object;
        this.method753(Class6454.method24637() + (int)field346[0]);
        this.field340 = b2;
        this.field337 = c2;
        int g2 = Class267.method807().method2990((int)field346[1]);
        this.method742(a2, g2);
        this.method763(a2, b2 + 1.0f, c2, 0.5, this.method778(), Class333.method2989().method2997(1.7f));
        this.method763(a2, b2 + this.method788() - 1.5f, c2, 0.5, this.method778(), Class333.method2989().method2997(Class1372.field5287));
        this.method763(a2, b2 + 1.0f, c2 - 0.5f, this.method788() - 2.0f, 0.5, Class333.method2989().method2997(1.7f));
        this.method763(a2, b2 + 1.0f, c2 + this.method778(), this.method788() - 2.0f, 0.5, Class333.method2989().method2997(1.7f));
        int h2 = (int)field346[2];
        if (!Class267.method820(this)) {
            int n2 = 54343;
            while (true) {
                // Infinite loop
            }
        }
        int n3 = 54342;
        block5: while (true) {
            switch (n3) {
                case 54343: {
                    n3 = 54341;
                    continue block5;
                }
                case 54342: {
                    object = new String(Class267.method804(this)) + this.method819();
                    break block5;
                }
                default: {
                    object = "Search...";
                }
            }
            break;
        }
        String i2 = object;
        this.method771(a2, i2, b2 + 5.0f, c2 + 3.5f, h2);
    }

    private static void method799() {
        Class5836.method22897();
    }

    public static boolean method800(Class267 class267) {
        return class267.field351;
    }

    private static String sFSVAQWxgWDGSSzK(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x38D815AB));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite X1xeyoaUeyYvle1V(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class267.sFSVAQWxgWDGSSzK(string7), Class267.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class267.sFSVAQWxgWDGSSzK(string5)), Class267.sFSVAQWxgWDGSSzK(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class267.sFSVAQWxgWDGSSzK(string5)), Class267.sFSVAQWxgWDGSSzK(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static class_3414 method801() {
        return Class5693.field10948;
    }

    private static void method802() {
        Class4146.method20697();
    }

    private static void method803() {
        Class4146.method20694();
    }

    public static char[] method804(Class267 class267) {
        return class267.field349;
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    private static void method805(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method806(String string) {
        field350 = string;
    }

    private static Class333 method807() {
        return Class333.method2989();
    }

    @Override
    public void method646(int a2, int b2, int c2) {
        if (this.field351) {
            switch (a2) {
                case 256: 
                case 257: {
                    this.field351 = (int)field346[3];
                    Class267.method806(null);
                    this.field349 = "".toCharArray();
                    break;
                }
                case 259: {
                    if (this.field349.length == 0 || this.field347) break;
                    this.field349 = ArrayUtils.remove((char[])this.field349, (int)(this.field349.length - (int)field346[4]));
                    field350 = new String(this.field349);
                    break;
                }
                case 32: {
                    if (!Class267.method818().method3019()) {
                        this.field351 = (int)field346[3];
                        field350 = null;
                        Class267.method814(this, "".toCharArray());
                        break;
                    }
                    this.field347 = (int)field346[4];
                }
            }
        }
    }

    private static void method808() {
        Class298.method1924();
    }

    @Override
    protected void method742(class_332 a2, int b2) {
        this.method763(a2, this.field340 + 1.0f, this.field337, this.field341 * 1.0f - 1.0f, this.field339 * Class267.method824(), b2);
    }

    private static void method809() {
        Class298.method1924();
    }

    private static void method810() {
        Class1807.method15744();
    }

    private static class_3414 method811() {
        return Class267.method801();
    }

    private static Class925 method812(Class267 class267) {
        return Class267.method822(class267);
    }

    public static boolean method813(Class267 class267) {
        return class267.field347;
    }

    public static void method814(Class267 class267, char[] cArray) {
        class267.field349 = cArray;
    }

    private static boolean method815(Class267 class267) {
        return Class267.method816(class267);
    }

    public static boolean method816(Class267 class267) {
        return class267.field351;
    }

    private static void method817() {
        Class4146.method20697();
    }

    private static Class333 method818() {
        return Class333.method2989();
    }

    public String method819() {
        if (this.field352.method12595((int)field346[5])) {
            this.field348 = !this.field348 ? (int)field346[4] : (int)field346[3];
            Class267.method812(this).method12593();
        }
        if (this.field348 && Class267.method815(this) && !this.field347) {
            return "_";
        }
        return "";
    }

    public static boolean method820(Class267 class267) {
        return class267.field351;
    }

    @Override
    public void method707(class_332 a2, float b2, float c2, float d2) {
        this.method798(a2, this.field340, this.field337, b2, c2, d2);
    }

    private static void method821() {
        Class5836.method22885();
    }

    public static Class925 method822(Class267 class267) {
        return class267.field352;
    }

    private static void method823(long l2) {
        Class267.field346[0] = l2 ^ 0x4EABFB3127A96527L;
        Class267.field346[5] = l2 ^ 0x4EABFB3127A965D9L;
        Class267.field346[4] = l2 ^ 0x4EABFB3127A96522L;
        Class267.field346[3] = l2 ^ 0x4EABFB3127A96523L;
        Class267.field346[1] = l2 ^ 0x4EABFB3114A96523L;
        Class267.field346[2] = l2 ^ 0xB15404CED8569ADCL;
    }

    public static float method824() {
        return 1.0f;
    }

    private static native Object I(char var0);
}

