/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_437
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class257;
import mapped.Class261;
import mapped.Class268;
import mapped.Class276;
import mapped.Class333;
import mapped.Class3454;
import mapped.Class369;
import mapped.Class4146;
import mapped.Class5649;
import mapped.Class5693;
import mapped.Class572;
import mapped.Class5723;
import mapped.Class6283;
import mapped.Class6454;
import mapped.Class803;
import mapped.Class804;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_437;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class275
extends Class268 {
    private static long[] field385;
    public static boolean $skidonion$998554155;

    private static int method1150(int n2, int n3, Class369 class369, Class572 class572) {
        return Class3454.method17581(n2, n3, class369, class572);
    }

    @Override
    public native void method727(char var1, int var2);

    private static boolean method1151(Class6283 class6283) {
        return class6283.method24288();
    }

    private static boolean method1152(Class333 class333) {
        return class333.method3011();
    }

    @Override
    public native void method722(double var1, double var3, int var5);

    @Override
    public void method649(double a2, double b2, int c2) {
        if (this.method744(a2, b2)) {
            if (c2 != 0) {
                Class1807.method15744();
                return;
            }
            if (Class275.method1152(Class275.method1155())) {
                Class5723.field11041.method22448(Class5693.field10948);
            }
            Class803[] class803Array = new Class803[(int)field385[2]];
            class803Array[(int)Class275.field385[3]] = new Class804((List)this.field354.method507(), this.field354 instanceof Class257);
            field338.method_1507((class_437)new Class5649(class803Array));
        }
    }

    @Override
    public native void method646(int var1, int var2, int var3);

    private static void method1153(long l2) {
        Class275.field385[0] = l2 ^ 0x75D44E15E54963E8L;
        Class275.field385[1] = l2 ^ 0x8A2BB1EA1AB69C73L;
        Class275.field385[3] = l2 ^ 0x75D44E15E549638CL;
        Class275.field385[2] = l2 ^ 0x75D44E15E549638DL;
    }

    private static String t57xDBNzp2iGFNFa(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xCBC89A3D));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Class333 method1154() {
        return Class333.method2989();
    }

    private static Class333 method1155() {
        return Class333.method2989();
    }

    @Override
    public void method825(class_332 a2, float b2, float c2, float d2, float e2, float f2) {
        this.method753(Class6454.method24637() + Class333.method2989().method2999());
        this.field340 = b2;
        this.field337 = c2;
        boolean g2 = this.method740(d2, e2);
        if (g2 != Class275.method1151(this.field345)) {
            this.field345.method24284(g2);
        }
        int h2 = (int)(45.0 * class_3532.method_15350((double)this.field345.method24281(), (double)0.0, (double)1.0));
        this.method742(a2, Class275.method1154().method3028((int)field385[0] + h2, 1.0f));
        int i2 = (int)field385[1];
        this.method771(a2, this.field354.method512() + " [Edit]", b2 + 2.0f, c2 + Class333.method2989().method3018() * Class275.method1157(), i2);
    }

    public static CallSite yORKgIIQkddspOJ1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class275.t57xDBNzp2iGFNFa(string7), Class275.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class275.t57xDBNzp2iGFNFa(string5)), Class275.t57xDBNzp2iGFNFa(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class275.t57xDBNzp2iGFNFa(string5)), Class275.t57xDBNzp2iGFNFa(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method1156() {
        Class4146.method20694();
    }

    public Class275(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, b2, c2, d2, e2);
    }

    public static float method1157() {
        return 1.0f;
    }

    static {
        ___.___(16, Class275.class);
        ____.___16_190(Class275.class);
    }

    private static native Object 1(char var0);
}

