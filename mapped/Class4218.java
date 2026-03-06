/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_5253$class_5254
 *  net.minecraft.class_757
 *  net.minecraft.class_9801
 *  org.joml.Matrix3f
 *  org.joml.Matrix4d
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector4d
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class3979;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_5253;
import net.minecraft.class_757;
import net.minecraft.class_9801;
import org.joml.Matrix3f;
import org.joml.Matrix4d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4218 {
    private static long[] field9876 = new long[1];
    private int field9877;
    private Matrix3f field9878;
    private Matrix4d field9879;
    public class_287 field9880;
    private final class_293 field9881;
    private final class_293.class_5596 field9882;

    /*
     * Enabled aggressive block sorting
     */
    public Class4218 method20863(double a2, double b2, double c2, float d2, float e2) {
        int n2 = this.field9880 == null ? 62963 : 62964;
        block4: while (true) {
            switch (n2) {
                case 62964: {
                    n2 = 62962;
                    continue block4;
                }
                case 62963: {
                    return this;
                }
            }
            break;
        }
        Vector4d f2 = this.field9879.transform(new Vector4d(a2, b2, c2, 1.0));
        this.field9880.method_22912((float)f2.x(), (float)f2.y(), (float)f2.method_7448()).method_22913(d2, e2).method_1336(class_5253.class_5254.method_27765((int)this.field9877), class_5253.class_5254.method_27766((int)this.field9877), class_5253.class_5254.method_27767((int)this.field9877), class_5253.class_5254.method_27762((int)this.field9877));
        return this;
    }

    public static int method20864(Class4218 class4218) {
        return class4218.field9877;
    }

    public void method20865() {
        this.method20885();
    }

    public Class4218 method20866(double a2, double b2, double c2) {
        if (Class4218.method20887(this) == null) {
            return this;
        }
        Vector4d d2 = this.field9879.transform(new Vector4d(a2, b2, c2, 1.0));
        this.field9880.method_22912((float)d2.x(), (float)d2.y(), (float)d2.method_7448()).method_1336(class_5253.class_5254.method_27765((int)this.field9877), class_5253.class_5254.method_27766((int)this.field9877), class_5253.class_5254.method_27767((int)this.field9877), class_5253.class_5254.method_27762((int)this.field9877));
        return this;
    }

    private static void method20867() {
        Class5659.method22184();
    }

    private static void method20868() {
        Class6009.method23561();
    }

    public void method20869(class_4587 a2) {
        this.field9879 = Class4218.method20892(a2.method_23760().method_23761());
        this.field9878 = a2.method_23760().method_23762();
        class_243 b2 = class_310.method_1551().method_31975().field_4344.method_19326();
        this.field9879.translate(-b2.field_1352, -b2.field_1351, -b2.field_1350);
    }

    private static void method20870(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static int method20871(Class4218 class4218) {
        return class4218.field9877;
    }

    private static void method20872(float f2) {
        Class5836.method22907(f2);
    }

    static {
        Class4218.method20894(-1516893821715929595L);
    }

    private static int method20873(Class4218 class4218) {
        return Class4218.method20877(class4218);
    }

    private static void method20874(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method20875(Class4218 class4218) {
        return Class4218.method20889(class4218);
    }

    public static class_287 method20876(Class4218 class4218) {
        return class4218.field9880;
    }

    public static int method20877(Class4218 class4218) {
        return class4218.field9877;
    }

    private static void method20878() {
        Class5836.method22897();
    }

    public static class_293 method20879() {
        return class_290.field_1576;
    }

    public Class4218(class_293.class_5596 a2, class_293 b2) {
        this.field9882 = a2;
        this.field9881 = b2;
        this.field9877 = (int)field9876[0];
    }

    public static class_287 method20880(Class4218 class4218) {
        return class4218.field9880;
    }

    public void method20881(int a2) {
        this.field9877 = a2;
    }

    private static class_293 method20882() {
        return Class4218.method20879();
    }

    public Class4218 method20883(double a2, double b2, double c2, double d2, double e2, double f2) {
        if (this.field9880 == null) {
            return this;
        }
        float g2 = (float)(d2 - a2);
        float h2 = (float)(e2 - b2);
        float i2 = (float)(f2 - c2);
        float j2 = class_3532.method_15355((float)(g2 * g2 + h2 * h2 + i2 * i2));
        Vector3f k2 = this.field9878.transform(g2 /= j2, h2 /= j2, i2 /= j2, new Vector3f()).normalize();
        Vector4d l2 = this.field9879.transform(new Vector4d(a2, b2, c2, 1.0));
        this.field9880.method_22912((float)l2.x(), (float)l2.y(), (float)l2.method_7448()).method_22914(k2.x, k2.y, k2.z).method_1336(class_5253.class_5254.method_27765((int)Class4218.method20864(this)), class_5253.class_5254.method_27766((int)Class4218.method20875(this)), class_5253.class_5254.method_27767((int)Class4218.method20873(this)), class_5253.class_5254.method_27762((int)this.field9877));
        Vector4d m2 = this.field9879.transform(new Vector4d(d2, e2, f2, 1.0));
        Class4218.method20884(this).method_22912((float)m2.x(), (float)m2.y(), (float)m2.method_7448()).method_22914(k2.x, k2.y, k2.z).method_1336(class_5253.class_5254.method_27765((int)Class4218.method20888(this)), class_5253.class_5254.method_27766((int)this.field9877), class_5253.class_5254.method_27767((int)Class4218.method20871(this)), class_5253.class_5254.method_27762((int)this.field9877));
        return this;
    }

    private static class_287 method20884(Class4218 class4218) {
        return Class4218.method20880(class4218);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method20885() {
        if (this.field9880 == null) {
            return;
        }
        if (this.field9881 == class_290.field_29337) {
            RenderSystem.setShader(class_757::method_34535);
            Class5836.method22885();
            return;
        }
        int n2 = this.field9881 != Class4218.method20882() ? 59052 : 59051;
        block4: while (true) {
            switch (n2) {
                case 59052: {
                    n2 = 59050;
                    continue block4;
                }
                case 59051: {
                    RenderSystem.setShader(class_757::method_34540);
                    break block4;
                }
                default: {
                    if (this.field9881 != class_290.field_1585) {
                        Class5836.method22885();
                        return;
                    }
                    RenderSystem.setShader(class_757::method_34542);
                }
            }
            break;
        }
        class_9801 a2 = this.field9880.method_60794();
        if (a2 != null) {
            class_286.method_43433((class_9801)a2);
            this.field9880 = null;
        }
    }

    private static void method20886() {
        Class3979.method19561();
    }

    private static class_287 method20887(Class4218 class4218) {
        return Class4218.method20876(class4218);
    }

    public static int method20888(Class4218 class4218) {
        return class4218.field9877;
    }

    public static int method20889(Class4218 class4218) {
        return class4218.field9877;
    }

    private static void method20890() {
        Class5659.method22184();
    }

    public void method20891(class_4587 a2) {
        this.method20869(a2);
        this.field9880 = class_289.method_1348().method_60827(this.field9882, this.field9881);
    }

    private static Matrix4d method20892(Matrix4f matrix4f) {
        return Class6009.method23554(matrix4f);
    }

    private static void method20893() {
        Class5659.method22184();
    }

    private static void method20894(long l2) {
        Class4218.field9876[0] = l2 ^ 0x150D16E4DD5CD9FAL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

