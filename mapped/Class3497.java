/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_276
 *  net.minecraft.class_310
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.opengl.GL30
 */
package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import mapped.Class1503;
import mapped.Class5836;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL30;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3497
extends class_276 {
    private static long[] field7688 = new long[14];
    private int field7689;
    public static final int field7690;
    private final int field7691;
    private int field7692;
    private static final Map INSTANCES;

    public void method_1231(int a2, int b2, boolean c2) {
        RenderSystem.assertOnRenderThreadOrInit();
        this.field_1480 = a2;
        this.field_1477 = b2;
        this.field_1482 = a2;
        this.field_1481 = b2;
        this.field_1476 = GlStateManager.glGenFramebuffers();
        GlStateManager._glBindFramebuffer((int)((int)field7688[7]), (int)this.field_1476);
        this.field7692 = GlStateManager.glGenRenderbuffers();
        GlStateManager._glBindRenderbuffer((int)((int)field7688[6]), (int)this.field7692);
        GL30.glRenderbufferStorageMultisample((int)((int)field7688[6]), (int)Class3497.method17711(this), (int)((int)field7688[11]), (int)a2, (int)b2);
        GlStateManager._glBindRenderbuffer((int)((int)field7688[6]), (int)((int)field7688[1]));
        Class3497.method17717(this, GlStateManager.glGenRenderbuffers());
        GlStateManager._glBindRenderbuffer((int)((int)field7688[6]), (int)this.field7689);
        GL30.glRenderbufferStorageMultisample((int)((int)field7688[6]), (int)Class3497.method17715(this), (int)((int)field7688[10]), (int)a2, (int)b2);
        GlStateManager._glBindRenderbuffer((int)((int)field7688[6]), (int)((int)field7688[1]));
        GL30.glFramebufferRenderbuffer((int)((int)field7688[7]), (int)((int)field7688[8]), (int)((int)field7688[6]), (int)this.field7692);
        GL30.glFramebufferRenderbuffer((int)((int)field7688[7]), (int)((int)field7688[9]), (int)((int)field7688[6]), (int)this.field7689);
        this.field_1475 = class_310.method_1551().method_1522().method_30277();
        this.field_1474 = class_310.method_1551().method_1522().method_30278();
        this.method_1239();
        this.method_1230(c2);
        this.method_1242();
    }

    public static int method17707() {
        return field7690;
    }

    private static int method17708(class_276 class_2762) {
        return Class3497.method17719(class_2762);
    }

    public static void method17709(int a2, @NotNull class_276 b2, @NotNull Runnable c2) {
        RenderSystem.assertOnRenderThreadOrInit();
        Class3497 d2 = Class3497.method17712(a2);
        Class3497.method17720(d2, b2.field_1482, b2.field_1481, (boolean)field7688[1]);
        GlStateManager._glBindFramebuffer((int)((int)field7688[4]), (int)Class3497.method17708(b2));
        GlStateManager._glBindFramebuffer((int)((int)field7688[2]), (int)d2.field_1476);
        GlStateManager._glBlitFrameBuffer((int)((int)field7688[1]), (int)((int)field7688[1]), (int)d2.field_1482, (int)d2.field_1481, (int)((int)field7688[1]), (int)((int)field7688[1]), (int)d2.field_1482, (int)d2.field_1481, (int)((int)field7688[3]), (int)((int)field7688[5]));
        d2.method_1235((boolean)field7688[0]);
        c2.run();
        d2.method_1240();
        GlStateManager._glBindFramebuffer((int)((int)field7688[4]), (int)d2.field_1476);
        GlStateManager._glBindFramebuffer((int)((int)field7688[2]), (int)b2.field_1476);
        GlStateManager._glBlitFrameBuffer((int)((int)field7688[1]), (int)((int)field7688[1]), (int)d2.field_1482, (int)d2.field_1481, (int)((int)field7688[1]), (int)((int)field7688[1]), (int)d2.field_1482, (int)d2.field_1481, (int)((int)field7688[3]), (int)((int)field7688[5]));
        d2.method_1230((boolean)field7688[1]);
        b2.method_1235((boolean)field7688[1]);
    }

    private static Class3497 method17710(int a2, Integer b2) {
        return new Class3497(a2);
    }

    public static int method17711(Class3497 class3497) {
        return class3497.field7691;
    }

    public static Class3497 method17712(int a2) {
        return INSTANCES.computeIfAbsent(a2, arg_0 -> Class3497.method17710(a2, arg_0));
    }

    static {
        Class3497.method17718(7255223425887498149L);
        field7690 = GL30.glGetInteger((int)((int)field7688[13]));
        INSTANCES = new HashMap();
    }

    private static void method17713(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method17714() {
        return Class3497.method17707();
    }

    public static int method17715(Class3497 class3497) {
        return class3497.field7691;
    }

    public void method_1234(int a2, int b2, boolean c2) {
        block3: {
            block2: {
                if (this.field_1482 != a2) break block2;
                if (this.field_1481 == b2) break block3;
            }
            super.method_1234(a2, b2, c2);
        }
    }

    private static void method17716(int n2, class_276 class_2762, Runnable runnable) {
        Class3497.method17709(n2, class_2762, runnable);
    }

    public static void method17717(Class3497 class3497, int n2) {
        class3497.field7689 = n2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void method_1238() {
        block6: {
            block5: {
                int n2;
                RenderSystem.assertOnRenderThreadOrInit();
                this.method_1242();
                this.method_1240();
                if (this.field_1476 > (int)field7688[12]) {
                    int n3 = 4914;
                    Class5836.method22897();
                    return;
                }
                int n4 = 4915;
                boolean bl2 = true;
                do {
                    if (!bl2 || (bl2 = false) || !true) {
                        n4 = n2 = 4913;
                    }
                    if (n2 == 4914) break block5;
                } while (n2 == 4915);
                break block6;
            }
            GlStateManager._glBindFramebuffer((int)((int)field7688[7]), (int)((int)field7688[1]));
            GlStateManager._glDeleteFramebuffers((int)this.field_1476);
            this.field_1476 = (int)field7688[12];
        }
        if (this.field7692 > (int)field7688[12]) {
            GlStateManager._glDeleteRenderbuffers((int)this.field7692);
            this.field7692 = (int)field7688[12];
        }
        if (this.field7689 > (int)field7688[12]) {
            GlStateManager._glDeleteRenderbuffers((int)this.field7689);
            this.field7689 = (int)field7688[12];
        }
        this.field_1475 = (int)field7688[12];
        this.field_1474 = (int)field7688[12];
        this.field_1482 = (int)field7688[12];
        this.field_1481 = (int)field7688[12];
    }

    private static void method17718(long l2) {
        Class3497.field7688[7] = l2 ^ 0x64AFBB441A1D62E5L;
        Class3497.field7688[11] = l2 ^ 0x64AFBB441A1D6FFDL;
        Class3497.field7688[0] = l2 ^ 0x64AFBB441A1DEFA4L;
        Class3497.field7688[1] = l2 ^ 0x64AFBB441A1DEFA5L;
        Class3497.field7688[10] = l2 ^ 0x64AFBB441A1DF6A7L;
        Class3497.field7688[5] = l2 ^ 0x64AFBB441A1DC9A4L;
        Class3497.field7688[2] = l2 ^ 0x64AFBB441A1D630CL;
        Class3497.field7688[4] = l2 ^ 0x64AFBB441A1D630DL;
        Class3497.field7688[12] = l2 ^ 0x9B5044BBE5E2105AL;
        Class3497.field7688[9] = l2 ^ 0x64AFBB441A1D62A5L;
        Class3497.field7688[3] = l2 ^ 0x64AFBB441A1DAFA5L;
        Class3497.field7688[8] = l2 ^ 0x64AFBB441A1D6345L;
        Class3497.field7688[6] = l2 ^ 0x64AFBB441A1D62E4L;
        Class3497.field7688[13] = l2 ^ 0x64AFBB441A1D62F2L;
    }

    public static int method17719(class_276 class_2762) {
        return class_2762.field_1476;
    }

    public Class3497(int a2) {
        super((boolean)field7688[0]);
        this.field7691 = a2;
        this.method_1236(1.0f, 1.0f, 1.0f, 0.0f);
    }

    private static void method17720(Class3497 class3497, int n2, int n3, boolean bl2) {
        class3497.method_1234(n2, n3, bl2);
    }

    public static void method17721(int a2, Runnable b2) {
        Class3497.method17716(Math.min(a2, Class3497.method17714()), class_310.method_1551().method_1522(), b2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

