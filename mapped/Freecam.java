/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.input.KeyboardInput
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1;
import mapped.Class1226;
import mapped.Class135;
import mapped.Class14;
import mapped.Class1503;
import mapped.Class17;
import mapped.Class181;
import mapped.Class1815;
import mapped.Class221;
import mapped.Class229;
import mapped.Class246;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class260;
import mapped.Class278;
import mapped.Class28;
import mapped.Ambience;
import mapped.Class30;
import mapped.Class3425;
import mapped.Class3586;
import mapped.Class36;
import mapped.AutoTrap;
import mapped.Class44;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class571;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class760;
import mapped.Class803;
import mapped.Class976;
import mapped.Class98;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Freecam
extends Class278 {
    public float field1180;
    public boolean field1181 = (int)field1189[0];
    public float field1182;
    Class248 field1183;
    Class248 field1184;
    public class_243 field1185;
    Class248 field1186 = this.method450(new Class252("Speed", "The move speed of the camera", Float.valueOf(Class1815.field6761), Float.valueOf(4.0f), Float.valueOf(10.0f)));
    Class248 field1187 = this.method450(new Class259("ControlKey", "", new Class246(this.method472() + "-control", (int)field1189[1], Freecam::method4732)));
    private static Freecam INSTANCE;
    Class248 field1188;
    private static long[] field1189;
    public class_243 field1190;
    public static boolean $skidonion$890408592;

    private static int method4696(int n2, int n3, AutoTrap class418, Ambience class290) {
        return Class3425.method17257(n2, n3, class418, class290);
    }

    private static float method4697(Class44 class44) {
        return class44.method90();
    }

    /*
     * Enabled aggressive block sorting
     */
    public class_241 method4698(float a2, float b2, float c2) {
        if (b2 == 0.0f && c2 == 0.0f) {
            return class_241.field_1340;
        }
        int n2 = b2 != 0.0f ? 46815 : 46816;
        block4: while (true) {
            switch (n2) {
                case 46816: {
                    n2 = 46814;
                    continue block4;
                }
                case 46815: {
                    if (c2 == 0.0f) return new class_241((float)((double)(b2 * a2) * -Math.sin(Math.toRadians(this.field1180)) + (double)(c2 * a2) * Math.cos(Math.toRadians(Freecam.method4715(this)))), (float)((double)(b2 * a2) * Math.cos(Math.toRadians(this.field1180)) - (double)(c2 * a2) * -Math.sin(Math.toRadians(this.field1180))));
                    b2 *= (float)Math.sin(0.7853981633974483);
                    c2 *= (float)Math.cos(0.7853981633974483);
                    return new class_241((float)((double)(b2 * a2) * -Math.sin(Math.toRadians(this.field1180)) + (double)(c2 * a2) * Math.cos(Math.toRadians(Freecam.method4715(this)))), (float)((double)(b2 * a2) * Math.cos(Math.toRadians(this.field1180)) - (double)(c2 * a2) * -Math.sin(Math.toRadians(this.field1180))));
                }
            }
            break;
        }
        return new class_241((float)((double)(b2 * a2) * -Math.sin(Math.toRadians(this.field1180)) + (double)(c2 * a2) * Math.cos(Math.toRadians(Freecam.method4715(this)))), (float)((double)(b2 * a2) * Math.cos(Math.toRadians(this.field1180)) - (double)(c2 * a2) * -Math.sin(Math.toRadians(this.field1180))));
    }

    private static float method4699() {
        return Class6322.method24337();
    }

    public static class_746 method4700(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method4701(Class14 a2) {
        if (a2.method23() != Freecam.method4743(field290)) {
            return;
        }
        if (!this.field1181 && this.field1188.method507() == Class571.field2796) {
            a2.method20(this.field1185);
        }
    }

    private static float method4702() {
        return Class5659.method22208();
    }

    @Class1
    public void method4703(Class63 e2) {
        if (e2.method128() != Class543.field2690) {
            return;
        }
        if (!this.field1181 && ((Boolean)this.field1184.method507()).booleanValue()) {
            float[] fArray = new float[(int)field1189[3]];
            fArray[(int)Freecam.field1189[0]] = this.field1180;
            fArray[(int)Freecam.field1189[2]] = this.field1182;
            float[] b2 = fArray;
            class_243 c2 = Freecam.method4746(this);
            class_239 d2 = Class976.method12737(Freecam.field290.field_1724.method_55754(), c2, b2);
            if (d2.method_17783() == class_239.class_240.field_1332) {
                float[] a2 = Class1503.method14416(Freecam.field290.field_1724.method_33571(), d2.method_17784());
                Freecam.method4742(Class5723.field11049, new Class1226((int)field1189[2], a2[(int)field1189[0]], a2[(int)field1189[2]]));
            }
        }
    }

    public Freecam() {
        super("Freecam", "Allows you to control the camera separately from the player", Class556.field2754);
        this.field1183 = this.method450(new Class253("ToggleControl", "Allows toggling control key instead of holding", (boolean)field1189[0]));
        this.field1188 = this.method450(new Class260("Interact", "The interaction type of the camera", Class571.field2796, Class571.values()));
        this.field1184 = this.method450(new Class253("Rotate", "Rotate to the point of interaction", (boolean)field1189[0]));
        INSTANCE = this;
    }

    @Class1
    public void method4704(Class44 a2) {
        a2.method89(this.field1181 ? this.field1185 : this.field1190.method_35590(this.field1185, (double)Freecam.method4697(a2)));
    }

    private static void method4705(Freecam class365, float f2) {
        Freecam.method4741(class365, f2);
    }

    public static class_746 method4706(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4707() {
        Class6009.method23560();
    }

    private static void method4708() {
        Class6454.method24594();
    }

    @Class1
    public void method4709(Class17 a2) {
        a2.method31(new class_241(this.field1180, this.field1182));
    }

    public static void method4710(Freecam class365, float f2) {
        class365.field1182 = f2;
    }

    @Class1
    public void method4711(Class28 a2) {
        if (a2.method53() != Freecam.field290.field_1724) {
            return;
        }
        if (!this.field1181 && this.field1188.method507() == Freecam.method4725()) {
            a2.method54(Class1503.method14432(this.field1182, this.field1180));
        }
    }

    private static float method4712() {
        return Class6322.method24328();
    }

    private static void method4713(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method4714(Freecam class365, boolean bl2) {
        class365.field1181 = bl2;
    }

    public static float method4715(Freecam class365) {
        return class365.field1180;
    }

    public static class_757 method4716(class_310 class_3102) {
        return class_3102.field_1773;
    }

    @Override
    protected void method1279() {
        if (Freecam.method4700(field290) == null) {
            return;
        }
        Freecam.method4736((class_310)Freecam.field290).field_3913 = new class_743(Freecam.field290.field_1690);
    }

    @Class1
    public void method4717(Class36 a2) {
        if (a2.method70() != (int)field1189[3]) {
            if (a2.method68() == Freecam.method4754((Class246)this.field1187.method507())) {
                if (!((Boolean)this.field1183.method507()).booleanValue()) {
                    Freecam.method4714(this, (a2.method70() == (int)field1189[2] ? (int)field1189[2] : (int)field1189[0]) != 0);
                } else if (a2.method70() == (int)field1189[2]) {
                    this.field1181 = !Freecam.method4728(this) ? (int)field1189[2] : (int)field1189[0];
                }
            }
        }
    }

    public static Freecam method4718() {
        return INSTANCE;
    }

    public class_243 method4719() {
        return Freecam.method4731(this);
    }

    public static void method4720(Freecam class365, boolean bl2) {
        class365.field1181 = bl2;
    }

    public static class_243 method4721(Freecam class365) {
        return class365.field1185;
    }

    public class_243 method4722() {
        return Freecam.method4721(this);
    }

    public static float method4723(Freecam class365) {
        return class365.field1180;
    }

    @Class1
    public void method4724(Class181 a2) {
        a2.method10();
    }

    public static Class571 method4725() {
        return Class571.field2796;
    }

    @Class1
    public void method4726(Class221 a2) {
        if (a2.method412() == Freecam.method4738(field290)) {
            this.method1268();
        }
    }

    private static float method4727() {
        return Class6322.method24324();
    }

    public static boolean method4728(Freecam class365) {
        return class365.field1181;
    }

    public static class_243 method4729(Freecam class365) {
        return class365.field1185;
    }

    static {
        ___.___(52, Freecam.class);
        ____.___52_430(Freecam.class);
    }

    public static class_243 method4730(Freecam class365) {
        return class365.field1185;
    }

    private static class_243 method4731(Freecam class365) {
        return Freecam.method4748(class365);
    }

    private static native void method4732();

    /*
     * Enabled aggressive block sorting
     */
    public float method4733(boolean a2, boolean b2) {
        if (a2 == b2) {
            return 0.0f;
        }
        if (a2) return Freecam.method4750();
        int n2 = 34751;
        block4: while (true) {
            switch (n2) {
                case 34751: {
                    n2 = 34749;
                    continue block4;
                }
                case 34750: {
                    return 1.0f;
                }
            }
            break;
        }
        return -1.0f;
    }

    private static void method4734(long l2) {
        Freecam.field1189[3] = l2 ^ 0xAF3C359EAD47E297L;
        Freecam.field1189[2] = l2 ^ 0xAF3C359EAD47E294L;
        Freecam.field1189[0] = l2 ^ 0xAF3C359EAD47E295L;
        Freecam.field1189[1] = l2 ^ 0xAF3C359EAD47E3C3L;
    }

    public float[] method4735() {
        float[] fArray = new float[(int)field1189[3]];
        fArray[(int)Freecam.field1189[0]] = Freecam.method4723(this);
        fArray[(int)Freecam.field1189[2]] = this.field1182;
        return fArray;
    }

    public static class_746 method4736(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static float method4737(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    public static class_746 method4738(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_757 method4739(class_310 class_3102) {
        return Freecam.method4716(class_3102);
    }

    @Class1
    public void method4740(Class229 a2) {
        this.method1268();
    }

    public static void method4741(Freecam class365, float f2) {
        class365.field1180 = f2;
    }

    private static void method4742(Class760 class760, Class1226 class1226) {
        class760.method12006(class1226);
    }

    public static class_746 method4743(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method4744(Class98 a2) {
        a2.method10();
    }

    @Class1
    public void method4745(Class135 a2) {
        if (!this.field1181) {
            a2.method10();
            this.method4751(a2.method259(), a2.method258());
        }
    }

    private static class_243 method4746(Freecam class365) {
        return Freecam.method4730(class365);
    }

    public static float method4747(Freecam class365) {
        return class365.field1182;
    }

    public static class_243 method4748(Freecam class365) {
        return class365.field1190;
    }

    @Class1
    public void method4749(Class30 a2) {
        if (this.field1181) {
            a2.method10();
        }
    }

    private static float method4750() {
        return Class803.method12221();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void method1274() {
        int n2 = Freecam.method4706(field290) == null ? 24834 : 24835;
        block4: while (true) {
            switch (n2) {
                case 24835: {
                    n2 = 24833;
                    continue block4;
                }
                case 24834: {
                    return;
                }
            }
            break;
        }
        Freecam.method4720(this, (boolean)field1189[0]);
        this.field1185 = Freecam.method4739(field290).method_19418().method_19326();
        this.field1190 = Freecam.method4729(this);
        Freecam.method4705(this, Freecam.field290.field_1724.method_36454());
        this.field1182 = Freecam.field290.field_1724.method_36455();
        Freecam.field290.field_1724.field_3913 = new Class3586(this, Freecam.field290.field_1690);
    }

    public void method4751(double a2, double b2) {
        float c2 = (float)b2 * 0.15f;
        float d2 = (float)a2 * Class1815.field6759;
        Freecam class365 = this;
        Freecam.method4710(class365, Freecam.method4747(class365) + c2);
        this.field1180 += d2;
        this.field1182 = class_3532.method_15363((float)this.field1182, (float)-90.0f, (float)90.0f);
    }

    private static float method4752() {
        return Class803.method12221();
    }

    private static void method4753() {
        Class1503.method14420();
    }

    private static int method4754(Class246 class246) {
        return class246.method500();
    }

    private static native Object 1(char var0);
}

