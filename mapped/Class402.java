/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.platform.TextureUtil
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.entity.EnderChestBlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.resource.Resource
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryStack
 */
package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Optional;
import mapped.Class1;
import mapped.Class1106;
import mapped.Class1108;
import mapped.Class111;
import mapped.Class1158;
import mapped.Class117;
import mapped.Class1211;
import mapped.Class1215;
import mapped.Class1450;
import mapped.Class1470;
import mapped.Class1503;
import mapped.Class1575;
import mapped.Class1642;
import mapped.Class1665;
import mapped.Class1668;
import mapped.Class168;
import mapped.Class1745;
import mapped.Class1757;
import mapped.Class1806;
import mapped.Class1807;
import mapped.Class215;
import mapped.Class223;
import mapped.Class2406;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class310;
import mapped.Class3323;
import mapped.Class3332;
import mapped.Class335;
import mapped.Class34;
import mapped.Class3479;
import mapped.Class3545;
import mapped.Class3644;
import mapped.Class365;
import mapped.Class366;
import mapped.Class3733;
import mapped.Class3794;
import mapped.Class386;
import mapped.Class3962;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class4146;
import mapped.Class4183;
import mapped.Class4196;
import mapped.Class439;
import mapped.Class447;
import mapped.Class458;
import mapped.Class478;
import mapped.Class521;
import mapped.Class5422;
import mapped.Class543;
import mapped.Class5459;
import mapped.Class547;
import mapped.Class556;
import mapped.Class56;
import mapped.Class5649;
import mapped.Class5658;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class577;
import mapped.Class5836;
import mapped.Class5927;
import mapped.Class60;
import mapped.Class6002;
import mapped.Class6009;
import mapped.Class6112;
import mapped.Class6178;
import mapped.Class62;
import mapped.Class625;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class68;
import mapped.Class72;
import mapped.Class773;
import mapped.Class80;
import mapped.Class81;
import mapped.Class926;
import mapped.Class98;
import net.hachimi.client.api.render.satin.ManagedShaderEffect;
import net.hachimi.client.api.render.shader.ShaderManager;
import net.hachimi.client.mixin.C;
import net.hachimi.client.mixin.k;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.Resource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class402
extends Class278 {
    Class248 field1404;
    Class248 field1405;
    Class248 field1406;
    Class248 field1407;
    Class926 field1408;
    private int field1409;
    Class248 field1410;
    Class248 field1411;
    private static Class402 INSTANCE;
    Class248 field1412;
    private float field1413;
    Class248 field1414;
    Class248 field1415;
    Class248 field1416;
    Class248 field1417;
    Class248 field1418;
    Class248 field1419;
    Class248 field1420;
    Class248 field1421;
    Class248 field1422;
    Class248 field1423;
    Class248 field1424;
    Class248 field1425;
    Class248 field1426;
    Class248 field1427;
    private static long[] field1428;
    Class248 field1429;
    Class248 field1430;
    Class248 field1431;
    Class248 field1432;
    Class248 field1433;
    Class248 field1434;
    Class248 field1435;
    Class248 field1436;
    Class248 field1437;
    Class248 field1438;
    Class248 field1439;
    Class248 field1440;
    Class248 field1441;
    private boolean field1442;
    Class248 field1443;
    Class248 field1444;
    Class248 field1445;
    Class248 field1446;
    Class248 field1447;
    Class248 field1448;
    Class248 field1449 = this.method450(new Class252("RenderDistance", "The shader render range", Float.valueOf(0.0f), Float.valueOf(Class3733.field8425), Float.valueOf(200.0f)));
    Class248 field1450;
    Class248 field1451;
    Class248 field1452;
    Class248 field1453;
    Class248 field1454;

    private static Class248 method5902(Class402 class402) {
        return Class402.method5937(class402);
    }

    private Boolean method5903() {
        return ((Boolean)this.field1435.method507() != false && this.field1440.method507() != Class402.method6028() ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static Object method5904(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method5905(Class402 class402) {
        return class402.field1418;
    }

    public static ShaderManager method5906() {
        return Class5723.field11044;
    }

    public static Class248 method5907(Class402 class402) {
        return class402.field1404;
    }

    private Boolean method1278() {
        return (Boolean)this.field1418.method507();
    }

    private static Class248 method5908(Class402 class402) {
        return Class402.method5961(class402);
    }

    private static int method5909(int n2, int n3, Class3794 class3794, Class3323 class3323) {
        return Class1642.method14981(n2, n3, class3794, class3323);
    }

    public static Class248 method5910(Class402 class402) {
        return class402.field1453;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method5911() {
        int n2;
        if (((Boolean)Class402.method5907(this).method507()).booleanValue()) {
            int n3 = this.field1440.method507() == Class402.method5967() ? 18373 : 18372;
            block4: while (true) {
                switch (n3) {
                    case 18373: {
                        n3 = 18371;
                        continue block4;
                    }
                    case 18372: {
                        n2 = (int)field1428[2];
                        return n2 != 0;
                    }
                }
                break;
            }
        }
        n2 = (int)field1428[1];
        return n2 != 0;
    }

    private void method5912(Class60 a2) {
        this.field1442 = (int)field1428[2];
        ((k)Class402.method6037(field290)).hookRenderHand(Class402.field290.field_1773.method_19418(), a2.method124(), a2.method125().method_23760().method_23761());
        this.field1442 = (int)field1428[1];
    }

    public static void method5913(Class402 class402, boolean bl2) {
        class402.field1442 = bl2;
    }

    private static void method5914(boolean bl2) {
        Class6009.method23559(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method5915() {
        int n2;
        if (Class402.method6093(this.field1440) != Class577.field2828) {
            int n3 = 57060;
            Class402.method5916();
            return null;
        }
        int n4 = 57059;
        block4: while (true) {
            switch (n4) {
                case 57060: {
                    n4 = 57058;
                    continue block4;
                }
                case 57059: {
                    n2 = (int)field1428[2];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1428[1];
        return n2 != 0;
    }

    private static void method5916() {
        Class4146.method20697();
    }

    private static Class248 method5917(Class402 class402) {
        return Class402.method6084(class402);
    }

    private static Object method5918(Class248 class248) {
        return class248.method507();
    }

    private static Object method5919(Class248 class248) {
        return class248.method507();
    }

    private static boolean method5920(double d2) {
        return Class5659.method22193(d2);
    }

    private static class_243 method5921(Class365 class365) {
        return class365.method4722();
    }

    private static Object method5922(Class248 class248) {
        return class248.method507();
    }

    private Boolean method5923() {
        return (Boolean)this.field1418.method507();
    }

    @Class1
    public void method5924(Class111 a2) {
        if (Class402.field290.field_1724 != null && !((Boolean)Class402.method5991(this.field1424)).booleanValue() && ((Boolean)Class402.method6170(this.field1450)).booleanValue() && !this.field1442 && Class402.field290.field_1724.method_5858((class_1297)Class402.method5973(a2)) <= Class402.method6132((Class252)this.field1449)) {
            a2.method10();
        }
    }

    private static void method5925(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private void method5926(Class60 a2) {
        this.field1442 = (int)field1428[2];
        ((k)Class402.field290.field_1773).hookRenderHand(Class402.method5949(field290).method_19418(), a2.method124(), a2.method125().method_23760().method_23761());
        Class402.method6175(this, (boolean)field1428[1]);
    }

    @Class1
    public void method5927(Class98 a2) {
        block3: {
            block2: {
                if (Class402.field290.field_1724 == null || ((Boolean)this.field1424.method507()).booleanValue() || !((Boolean)Class402.method6214(Class402.method6118(this))).booleanValue()) break block2;
                if (!this.field1442) break block3;
            }
            return;
        }
        a2.method10();
    }

    public static Class248 method5928(Class402 class402) {
        return class402.field1433;
    }

    public static double method5929(class_243 class_2432) {
        return class_2432.field_1352;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method5930(class_1297 a) {
        block9: {
            block8: {
                if (a instanceof class_1657 && ((Boolean)this.field1435.method507()).booleanValue()) {
                    return (boolean)((Boolean)this.field1420.method507() != false && (Class402.field290.field_1690.method_31044().method_31034() == false || Class365.method4718().method1265() != false) || a != Class402.field290.field_1724 ? (int)Class402.field1428[2] : (int)Class402.field1428[1]);
                }
                if (!Class402.method5939(a)) break block8;
                if (((Boolean)this.field1434.method507()).booleanValue()) ** GOTO lbl-1000
            }
            if (Class1158.method13110(a) && ((Boolean)Class402.method5952(this.field1406)).booleanValue() || a instanceof class_1511 && ((Boolean)this.field1437.method507()).booleanValue() || a instanceof class_1542 && ((Boolean)this.field1450.method507()).booleanValue()) ** GOTO lbl-1000
            if (!(a instanceof class_1683)) break block9;
            if (((Boolean)this.field1404.method507()).booleanValue()) ** GOTO lbl-1000
        }
        if (!(a instanceof class_1684)) ** GOTO lbl-1000
        if (((Boolean)this.field1404.method507()).booleanValue()) {
            v0 = 57658;
            while (true) {
                // Infinite loop
            }
        }
        v1 = 57659;
        if (true) ** GOTO lbl20
        block5: while (true) {
            v1 = 57657;
lbl20:
            // 2 sources

            switch (v1) {
                case 57659: {
                    continue block5;
                }
                case 57658: lbl-1000:
                // 4 sources

                {
                    v2 = (int)Class402.field1428[2];
                    break block5;
                }
                default: lbl-1000:
                // 2 sources

                {
                    v2 = (int)Class402.field1428[1];
                }
            }
            break;
        }
        return (boolean)v2;
    }

    private static boolean method5931() {
        return Class447.method10252();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private Boolean method5932() {
        int n2;
        if (((Boolean)this.field1421.method507()).booleanValue()) {
            int n3;
            if (((Boolean)this.field1418.method507()).booleanValue()) {
                int n4 = 36947;
                Class5836.method22890();
                return null;
            }
            int n5 = 36948;
            boolean bl2 = true;
            do {
                if (!bl2 || (bl2 = false) || !true) {
                    n5 = n3 = 36946;
                }
                if (n3 != 36947) continue;
                n2 = (int)field1428[2];
                return n2 != 0;
            } while (n3 == 36948);
        }
        n2 = (int)field1428[1];
        return n2 != 0;
    }

    private static void method5933(float f2) {
        Class5836.method22907(f2);
    }

    private Boolean method5934() {
        return ((Boolean)Class402.method6168(Class402.method6205(this)) != false && Class402.method6180(this).method507() != Class402.method6167() ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method5935() {
        Class5836.method22890();
    }

    private static void method5936() {
        Class5836.method22890();
    }

    public static Class248 method5937(Class402 class402) {
        return class402.field1446;
    }

    private static void method5938(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method5939(class_1297 class_12972) {
        return Class1158.method13133(class_12972);
    }

    private static Object method5940(Class248 class248) {
        return class248.method507();
    }

    private static Object method5941(Class248 class248) {
        return class248.method507();
    }

    private void method5942(Class60 a2) {
        this.field1442 = (int)field1428[2];
        ((k)Class402.field290.field_1773).hookRenderHand(Class402.field290.field_1773.method_19418(), a2.method124(), a2.method125().method_23760().method_23761());
        this.field1442 = (int)field1428[1];
    }

    private Boolean method5943() {
        return (this.field1440.method507() == Class577.field2822 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method5944(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method5945(Class402 class402) {
        return class402.field1440;
    }

    public static Class926 method5946(Class402 class402) {
        return class402.field1408;
    }

    private void method5947(Class215 a2) {
        Class402.method6091(this, Class402.method6023(a2), Class402.method6058(a2));
    }

    public static Class248 method5948(Class402 class402) {
        return class402.field1434;
    }

    public static class_757 method5949(class_310 class_3102) {
        return class_3102.field_1773;
    }

    public static Class248 method5950(Class402 class402) {
        return class402.field1426;
    }

    public static Class248 method5951(Class402 class402) {
        return class402.field1433;
    }

    private static Object method5952(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method5953(Class402 class402) {
        return Class402.method6035(class402);
    }

    public static class_757 method5954(class_310 class_3102) {
        return class_3102.field_1773;
    }

    /*
     * Unable to fully structure code
     */
    private void method5955(float x, class_4587 y) {
        y.method_22903();
        this.field1442 = (int)Class402.field1428[2];
        for (class_1297 o : Class402.field290.field_1687.method_18112()) {
            block7: {
                if (Class402.method5981().method1265() && Class402.method5985().method2445(o) || !Class6454.method24660(o.method_5829()) || !this.method5930(o)) continue;
                v0 = n = Class365.method4718().method1265() != false ? Class402.method5921(Class402.method5956()) : Class402.field290.field_1724.method_19538();
                if (n.method_1025(o.method_19538()) > ((Class252)this.field1449).method564()) {
                    Class5836.method22885();
                    return;
                }
                y.method_22903();
                if (!Class298.method1913().method1265()) ** GOTO lbl-1000
                if (Class402.method6070(Class298.method1913()) == Class625.field3052) ** GOTO lbl-1000
                if (!(o instanceof class_1309)) break block7;
                a = (class_1309)o;
                if (Class402.method6172(Class298.method1913(), a)) ** GOTO lbl-1000
            }
            if (o instanceof class_1511 && ((Boolean)Class298.method1913().field568.method507()).booleanValue()) lbl-1000:
            // 2 sources

            {
                Class402.method6176(Class298.method1913(), y, o, x);
            } else lbl-1000:
            // 3 sources

            {
                b = Class402.method6005().createVertexConsumers((class_4597)((C)Class402.field290.field_1769).hookGetBufferBuilders().method_23000(), this.method6013(o));
                c = Class402.field290.field_1773.method_19418().method_19326();
                d = class_3532.method_16436((double)x, (double)Class402.method6143(o), (double)o.method_23317());
                e = class_3532.method_16436((double)x, (double)o.field_5971, (double)o.method_23318());
                f = class_3532.method_16436((double)x, (double)o.field_5989, (double)o.method_23321());
                g = class_3532.method_16439((float)x, (float)o.field_5982, (float)o.method_36454());
                h = Class402.field290.method_1561().method_3953(o);
                i = Class402.field290.method_1561().method_23839(o, x);
                j = h.method_23169(o, x);
                k = d - c.field_1352 + Class402.method5929(j);
                l = e - c.field_1351 + j.field_1351;
                m = f - Class402.method6088(c) + Class402.method6147(j);
                y.method_22904(k, l, m);
                h.method_3936(o, g, x, y, b, i);
                y.method_22904(-j.method_10216(), -j.method_10214(), -j.method_10215());
            }
            y.method_22909();
        }
        if (((Boolean)this.field1436.method507()).booleanValue() || ((Boolean)this.field1439.method507()).booleanValue() || ((Boolean)this.field1432.method507()).booleanValue()) {
            for (class_2586 w : Class1215.method13267()) {
                if (!this.method5963(w)) continue;
                p = this.method6077(w);
                q = Class5723.field11044.createVertexConsumers((class_4597)Class402.field290.method_22940().method_23000(), p);
                r = Class402.field290.field_1773.method_19418().method_19326();
                s = r.method_10216();
                t = r.method_10214();
                u = r.method_10215();
                v = w.method_11016();
                y.method_22903();
                y.method_22904((double)v.method_10263() - s, (double)v.method_10264() - t, (double)v.method_10260() - u);
                Class402.field290.method_31975().method_3555(w, x, y, q);
                y.method_22909();
            }
        }
        if (Class3979.method19543()) {
            Class5723.field11044.getVertexConsumerProvider().method_23285();
        }
        Class402.method6165(this, (boolean)Class402.field1428[1]);
        y.method_22909();
    }

    private static Class365 method5956() {
        return Class365.method4718();
    }

    private static void method5957(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static int method5958(int n2, int n3, Class111 class111, Class1450 class1450) {
        return Class1642.method15001(n2, n3, class111, class1450);
    }

    public static Class248 method5959(Class402 class402) {
        return class402.field1411;
    }

    private Boolean method5960() {
        return (Class402.method6207(this).method507() == Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    public static Class248 method5961(Class402 class402) {
        return class402.field1437;
    }

    private static void method5962() {
        Class5836.method22890();
    }

    /*
     * Unable to fully structure code
     */
    private boolean method5963(class_2586 a) {
        block6: {
            block4: {
                block5: {
                    if (a instanceof class_2595 && ((Boolean)Class402.method5919(this.field1439)).booleanValue()) ** GOTO lbl-1000
                    if (!(a instanceof class_2611)) break block4;
                    if (((Boolean)this.field1436.method507()).booleanValue()) break block5;
                    v0 = 22558;
                    ** GOTO lbl11
                }
                v0 = 22559;
                if (true) ** GOTO lbl11
                do {
                    v0 = var2_2 = 22557;
lbl11:
                    // 3 sources

                    if (var2_2 == 22558) break block4;
                } while (var2_2 == 22559);
                ** GOTO lbl-1000
            }
            v1 = a instanceof class_2627 ? 4896 : (var3_3 = 4897);
            if (var3_3 == 4896) break block6;
            if (var3_3 == 4897) {
                return Class4196.method20801();
            }
            ** GOTO lbl-1000
        }
        if (((Boolean)Class402.method6191(this.field1432)).booleanValue()) lbl-1000:
        // 3 sources

        {
            v2 = (int)Class402.field1428[2];
        } else lbl-1000:
        // 2 sources

        {
            v2 = (int)Class402.field1428[1];
        }
        return (boolean)v2;
    }

    public static Class248 method5964(Class402 class402) {
        return class402.field1453;
    }

    public static Class248 method5965(Class402 class402) {
        return class402.field1437;
    }

    public static float method5966(Class402 class402) {
        return class402.field1413;
    }

    public static Class577 method5967() {
        return Class577.field2825;
    }

    private void method5968(Class60 a2) {
        Class402.method6218(this, (boolean)field1428[2]);
        ((k)Class402.method6071(field290)).hookRenderHand(Class402.field290.field_1773.method_19418(), a2.method124(), a2.method125().method_23760().method_23761());
        this.field1442 = (int)field1428[1];
    }

    private static void method5969(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private Boolean method5970() {
        return ((Boolean)Class402.method6106(this).method507() != false && (Boolean)this.field1418.method507() != false ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static Class248 method5971(Class402 class402) {
        return Class402.method6096(class402);
    }

    private void method5972(ManagedShaderEffect a2, float b2) {
        GlStateManager._activeTexture((int)((int)field1428[35]));
        GlStateManager._bindTexture((int)this.field1409);
        a2.setUniformValue("sobel", (int)field1428[1]);
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)this.field1453.method507());
        a2.setUniformValue("imageTexture", (int)field1428[2]);
        a2.setUniformValue("color", (float)((Color)this.field1433.method507()).getRed() / 255.0f, (float)((Color)Class402.method6020(this).method507()).getGreen() / 255.0f, (float)((Color)this.field1433.method507()).getBlue() / 255.0f, ((Float)this.field1410.method507()).floatValue());
        a2.setUniformValue("mixColor", (Boolean)this.field1411.method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("mixFactor", ((Float)Class402.method6196(this.field1448)).floatValue());
        a2.setUniformValue("fastOutline", (Boolean)this.field1421.method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", ((Boolean)this.field1418.method507()).booleanValue() ? b2 : 0.0f);
        a2.setUniformValue("glow", ((Boolean)this.field1422.method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
    }

    private static class_1542 method5973(Class111 class111) {
        return class111.method202();
    }

    public static Class248 method5974(Class402 class402) {
        return class402.field1421;
    }

    public static Class248 method5975(Class402 class402) {
        return class402.field1410;
    }

    static {
        field1428 = new long[36];
        Class402.method6160(1468489454000800921L);
    }

    private static void method5976() {
        Class5659.method22184();
    }

    private static void method5977() {
        Class1807.method15744();
    }

    public static Class248 method5978(Class402 class402) {
        return class402.field1430;
    }

    public static Class248 method5979(Class402 class402) {
        return class402.field1422;
    }

    private static void method5980() {
        Class6454.method24594();
    }

    private static Class310 method5981() {
        return Class310.method2481();
    }

    private static Class248 method5982(Class402 class402) {
        return Class402.method6018(class402);
    }

    public static Class248 method5983(Class402 class402) {
        return class402.field1451;
    }

    private static void method5984() {
        Class6454.method24594();
    }

    private static Class310 method5985() {
        return Class310.method2481();
    }

    private static int method5986(int n2, int n3, Class386 class386, Class547 class547) {
        return Class1642.method15010(n2, n3, class386, class547);
    }

    private static Class248 method5987(Class402 class402) {
        return Class402.method6138(class402);
    }

    private static boolean method5988() {
        return Class3979.method19539();
    }

    private static Object method5989(Class248 class248) {
        return class248.method507();
    }

    private static int method5990(int n2, int n3, Class439 class439, Class366 class366) {
        return Class1642.method14989(n2, n3, class439, class366);
    }

    private static Object method5991(Class248 class248) {
        return class248.method507();
    }

    private Boolean method5992() {
        return (this.field1440.method507() == Class577.field2823 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static boolean method5993() {
        return Class408.method6431();
    }

    private static long method5994(Class926 class926) {
        return class926.method12592();
    }

    private Boolean method5995() {
        return (this.field1440.method507() == Class577.field2829 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method5996(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5997() {
        Class1745.method15538();
    }

    public static Class248 method5998(Class402 class402) {
        return class402.field1452;
    }

    public static Class248 method5999(Class402 class402) {
        return class402.field1410;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void method6000() {
        try {
            ByteBuffer h2;
            IntBuffer f2;
            IntBuffer e2;
            MemoryStack i2;
            block11: {
                String[] k2;
                ByteBuffer j2 = null;
                String[] stringArray = new String[(int)field1428[9]];
                stringArray[(int)Class402.field1428[1]] = "png";
                stringArray[(int)Class402.field1428[2]] = "jpg";
                String[] stringArray2 = k2 = stringArray;
                int n2 = stringArray2.length;
                for (int i3 = (int)field1428[1]; i3 < n2; ++i3) {
                    String d2 = stringArray2[i3];
                    File c2 = Class3979.field9083.method14363().resolve("shader." + d2).toFile();
                    if (c2.exists()) {
                        FileInputStream a2 = new FileInputStream(c2);
                        j2 = TextureUtil.readResource((InputStream)a2);
                        Class5836.method22890();
                        return;
                    }
                    Optional b2 = field290.method_1478().method_14486(class_2960.method_60655((String)"hachimi", (String)("shaders/shader." + d2)));
                    if (b2.isEmpty() || ((class_3298)b2.get()).method_14482() == null) continue;
                    j2 = TextureUtil.readResource((InputStream)((class_3298)b2.get()).method_14482());
                    break;
                }
                if (j2 == null) {
                    return;
                }
                j2.rewind();
                i2 = MemoryStack.stackPush();
                try {
                    e2 = i2.mallocInt((int)field1428[2]);
                    f2 = i2.mallocInt((int)field1428[2]);
                    IntBuffer g2 = i2.mallocInt((int)field1428[2]);
                    STBImage.stbi_set_flip_vertically_on_load((boolean)field1428[2]);
                    h2 = STBImage.stbi_load_from_memory((ByteBuffer)j2, (IntBuffer)e2, (IntBuffer)f2, (IntBuffer)g2, (int)((int)field1428[23]));
                    if (h2 != null) break block11;
                    if (i2 == null) return;
                }
                catch (Throwable throwable) {
                    if (i2 == null) throw throwable;
                    try {
                        i2.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    Class298.method1924();
                    return;
                    throw throwable;
                }
                i2.close();
                return;
            }
            this.field1409 = GlStateManager._genTexture();
            GlStateManager._activeTexture((int)((int)field1428[27]));
            GlStateManager._bindTexture((int)this.field1409);
            GlStateManager._pixelStore((int)((int)field1428[24]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[30]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[26]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[17]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[34]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[29]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[31]), (int)((int)field1428[1]));
            GlStateManager._pixelStore((int)((int)field1428[33]), (int)((int)field1428[14]));
            GlStateManager._texParameter((int)((int)field1428[16]), (int)((int)field1428[32]), (int)((int)field1428[25]));
            GlStateManager._texParameter((int)((int)field1428[16]), (int)((int)field1428[21]), (int)((int)field1428[25]));
            GlStateManager._texParameter((int)((int)field1428[16]), (int)((int)field1428[22]), (int)((int)field1428[19]));
            GlStateManager._texParameter((int)((int)field1428[16]), (int)((int)field1428[18]), (int)((int)field1428[19]));
            h2.rewind();
            GL32C.glTexImage2D((int)((int)field1428[16]), (int)((int)field1428[1]), (int)((int)field1428[28]), (int)e2.get((int)field1428[1]), (int)f2.get((int)field1428[1]), (int)((int)field1428[1]), (int)((int)field1428[28]), (int)((int)field1428[20]), (ByteBuffer)h2);
            STBImage.stbi_image_free((ByteBuffer)h2);
            STBImage.stbi_set_flip_vertically_on_load((boolean)field1428[1]);
            if (i2 == null) return;
            i2.close();
            return;
        }
        catch (IOException l2) {
            l2.printStackTrace();
        }
    }

    private static void method6001() {
        Class5659.method22184();
    }

    private static int method6002(int n2, int n3, Class1665 class1665, Class81 class81) {
        return Class1642.method14889(n2, n3, class1665, class81);
    }

    private Boolean method6003() {
        return (((Boolean)Class402.method5948(this).method507()).booleanValue() && Class402.method6136(this).method507() != Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private Boolean method6004() {
        if (this.field1440.method507() == Class577.field2822) {
            int n2 = (int)field1428[2];
            Class402.method5977();
            return null;
        }
        return (boolean)field1428[1];
    }

    private static ShaderManager method6005() {
        return Class402.method6152();
    }

    private static void method6006() {
        Class5836.method22897();
    }

    private static void method6007(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Class1
    public void method6008(Class80 a2) {
        if (Class402.field290.field_1724 != null && !((Boolean)this.field1424.method507()).booleanValue() && ((Boolean)Class402.method5965(this).method507()).booleanValue() && !this.field1442 && Class402.field290.field_1724.method_5858((class_1297)Class402.method6186(a2)) <= ((Class252)this.field1449).method564()) {
            a2.method10();
        }
    }

    private static int method6009(int n2, int n3, Class478 class478, Class5659 class5659) {
        return Class1642.method14911(n2, n3, class478, class5659);
    }

    private static void method6010() {
        Class5836.method22897();
    }

    @Class1
    public void method6011(Class168 a2) {
        if (a2.method325() instanceof class_1657 && this.field1442) {
            a2.method10();
        }
    }

    private static void method6012(float f2) {
        Class5836.method22907(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color method6013(class_1297 b2) {
        if (!(b2 instanceof class_1657)) {
            if (Class1158.method13133(b2)) {
                return (Color)Class402.method5983(this).method507();
            }
            if (Class1158.method13121(b2)) return (Color)Class402.method6116(this.field1427);
            if (!Class402.method6151(b2)) {
                Class6009.method23560();
                return null;
            }
        } else {
            class_1657 a2 = (class_1657)b2;
            int n2 = b2 == Class402.field290.field_1724 ? 2892 : 2893;
            block8: while (true) {
                switch (n2) {
                    case 2893: {
                        n2 = 2891;
                        continue block8;
                    }
                    case 2892: {
                        return (Color)this.field1454.method507();
                    }
                }
                break;
            }
            if ((Boolean)this.field1423.method507() == false) return (Color)this.field1415.method507();
            if (!Class5723.field11045.method21243(a2.method_5477())) return (Color)this.field1415.method507();
            return Class402.method6031().method10630();
        }
        int n3 = 45891;
        block9: while (true) {
            switch (n3) {
                case 45892: {
                    n3 = 45890;
                    continue block9;
                }
                case 45891: {
                    return (Color)Class402.method6116(this.field1427);
                }
            }
            break;
        }
        if (b2 instanceof class_1511) {
            return (Color)this.field1405.method507();
        }
        if (b2 instanceof class_1542) {
            return (Color)this.field1445.method507();
        }
        if (b2 instanceof class_1683) {
            return (Color)this.field1417.method507();
        }
        if (b2 instanceof class_1684) return (Color)this.field1417.method507();
        return null;
    }

    public static Class248 method6014(Class402 class402) {
        return class402.field1410;
    }

    private static void method6015(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6016(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6017() {
        Class6009.method23561();
    }

    public static Class248 method6018(Class402 class402) {
        return class402.field1425;
    }

    private Boolean method6019() {
        return ((Boolean)this.field1432.method507() != false && this.field1440.method507() != Class402.method6210() ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    public static Class248 method6020(Class402 class402) {
        return class402.field1433;
    }

    private static void method6021(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6022() {
        Class4146.method20697();
    }

    private static float method6023(Class215 class215) {
        return class215.method405();
    }

    private static void method6024(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private void method6025(ManagedShaderEffect a2, float b2) {
        a2.setUniformValue("resolution", field290.method_22683().method_4486(), field290.method_22683().method_4502());
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("color", (float)((Color)this.field1433.method507()).getRed() / Class6178.field12548, (float)((Color)Class402.method5951(this).method507()).getGreen() / 255.0f, (float)((Color)this.field1433.method507()).getBlue() / 255.0f, ((Float)this.field1410.method507()).floatValue());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)Class402.method6123(this.field1453));
        a2.setUniformValue("time", this.field1413);
        a2.setUniformValue("fastOutline", ((Boolean)Class402.method6098(Class402.method6085(this))).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", (Boolean)Class402.method5941(this.field1418) != false ? b2 : 0.0f);
        if (((Boolean)this.field1422.method507()).booleanValue()) {
            int n2 = (int)field1428[2];
            Class402.method6220(0.18321103f, 0.78507125f, Class1575.field5885, Class1106.field4466, Class4183.field9759, Class1470.field5565);
            return;
        }
        a2.setUniformValue("glow", (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)Class402.method6083(this).method507()).floatValue());
        a2.setUniformValue("factor", ((Float)Class402.method6131(this).method507()).floatValue());
        a2.setUniformValue("saturation", ((Float)this.field1414.method507()).floatValue());
        a2.setUniformValue("brightness", ((Float)Class402.method6030(this.field1431)).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)this.field1408.method12592() / 5.0f * ((Float)this.field1430.method507()).floatValue();
    }

    private static void method6026(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method6027() {
        if (!((Boolean)this.field1406.method507()).booleanValue()) {
            int n2 = 41934;
            Class6454.method24594();
            return null;
        }
        int n3 = 41933;
        block4: while (true) {
            switch (n3) {
                case 41934: {
                    n3 = 41932;
                    continue block4;
                }
                case 41933: {
                    if (this.field1440.method507() != Class577.field2825) {
                        int n4 = 50967;
                        Class402.method6169();
                        return null;
                    }
                    int n5 = 50968;
                    Class402.method6115();
                    return null;
                }
            }
            break;
        }
        return (boolean)field1428[1];
    }

    public static Class577 method6028() {
        return Class577.field2825;
    }

    private void method6029(ManagedShaderEffect a2, float b2) {
        a2.setUniformValue("resolution", field290.method_22683().method_4486(), field290.method_22683().method_4502());
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("color", 1.0f, 1.0f, 1.0f, ((Float)Class402.method6094(this.field1410)).floatValue());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)this.field1453.method507());
        a2.setUniformValue("time", Class402.method5966(this));
        a2.setUniformValue("fastOutline", ((Boolean)this.field1421.method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", ((Boolean)Class402.method6149(this.field1418)).booleanValue() ? b2 : 0.0f);
        a2.setUniformValue("glow", (Boolean)Class402.method6051(this).method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.setUniformValue("factor", ((Float)this.field1429.method507()).floatValue());
        a2.setUniformValue("saturation", ((Float)Class402.method6163(this).method507()).floatValue());
        a2.setUniformValue("brightness", ((Float)this.field1431.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)this.field1408.method12592() / Class5422.field10086 * ((Float)Class402.method5978(this).method507()).floatValue();
    }

    private static Object method6030(Class248 class248) {
        return class248.method507();
    }

    public Class402() {
        super("Shaders", "Renders shaders over entities", Class556.field2759);
        this.field1424 = this.method450(new Class253("Texture", "Renders the entity model texture", (boolean)field1428[2]));
        this.field1418 = this.method450(new Class253("Outline", "Adds an outline around the shader", (boolean)field1428[2]));
        this.field1443 = this.method450(new Class252("Width", "The outline width", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(1.5f), (Number)Float.valueOf(10.0f), this::method1269));
        this.field1421 = this.method450(new Class253("FastOutline", "Faster outline calculations", (boolean)field1428[1], this::method1278));
        this.field1446 = this.method450(new Class252("Quality", "The outline pixel quality", (Number)((int)field1428[9]), (Number)((int)field1428[11]), (Number)((int)field1428[6]), this::method5932));
        this.field1453 = this.method450(new Class252("Steps", "The number of steps for finding edges", (Number)((int)field1428[9]), (Number)((int)field1428[14]), (Number)((int)field1428[6]), this::method6067));
        this.field1422 = this.method450(new Class253("Glow", "Glow outline", (boolean)field1428[1], this::method5923));
        this.field1447 = this.method450(new Class252("GlowFactor", "The glow radius", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class5927.field11763), this::method5970));
        this.field1440 = this.method450(new Class260("Fill", "The shader mode", Class577.field2826, Class577.values()));
        this.field1426 = this.method450(new Class251("GradientColor", "The gradient color of the shader", new Color(1.0f, 1.0f, 1.0f), (boolean)field1428[2], (boolean)field1428[1], this::method5943));
        this.field1438 = this.method450(new Class252("Factor", "The gradient factor", (Number)Float.valueOf(Class1211.field4772), (Number)Float.valueOf(Class3545.field7853), (Number)Float.valueOf(10.0f), this::method6209));
        this.field1452 = this.method450(new Class252("Speed", "The gradient speed factor", (Number)Float.valueOf(Class6112.field12344), (Number)Float.valueOf(1.5f), (Number)Float.valueOf(10.0f), this::method6004));
        this.field1441 = this.method450(new Class252("Flow", "The marble speed factor", (Number)Float.valueOf(0.001f), (Number)Float.valueOf(Class3644.field8151), (Number)Float.valueOf(0.01f), this::method5992));
        this.field1425 = this.method450(new Class253("Dots", "Hacker esp", (boolean)field1428[1], this::method5995));
        this.field1407 = this.method450(new Class252("DotRadius", "Width between the dots", (Number)((int)field1428[13]), (Number)((int)field1428[0]), (Number)((int)field1428[3]), this::method6215));
        this.field1411 = this.method450(new Class253("Mix", "Mixes the image with the shader colors", (boolean)field1428[2], this::method5915));
        this.field1448 = this.method450(new Class252("MixFactor", "The mix image factor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.5f), (Number)Float.valueOf(1.0f), this::method6092));
        this.field1430 = this.method450(new Class252("RainbowSpeed", "The rainbow speed", (Number)Float.valueOf(0.001f), (Number)Float.valueOf(0.005f), (Number)Float.valueOf(Class1757.field6585), this::method5960));
        this.field1429 = this.method450(new Class252("RainbowFactor", "Factor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(2.0f), (Number)Float.valueOf(5.0f), this::method6159));
        this.field1414 = this.method450(new Class252("RainbowSaturation", "Rainbow saturation", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), this::method6155));
        this.field1431 = this.method450(new Class252("RainbowBrightness", "Rainbow brightness", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), this::method6059));
        this.field1410 = this.method450(new Class252("Opacity", "The transparency of the fill", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.35f), (Number)Float.valueOf(1.0f), this::method6046));
        this.field1444 = this.method450(new Class253("Hands", "Render shaders on first-person hands", (boolean)field1428[2]));
        this.field1433 = this.method450(new Class251("HandsColor", "The color of the shader", new Color((int)field1428[1], (int)field1428[4], (int)field1428[8]), (boolean)field1428[1], this::method6032));
        this.field1420 = this.method450(new Class253("Self", "Render shaders on the player", (boolean)field1428[2]));
        this.field1454 = this.method450(new Class251("SelfColor", "The render color for self", new Color((int)field1428[5], (int)field1428[10], (int)field1428[10]), (boolean)field1428[1], this::method6204));
        this.field1435 = this.method450(new Class253("Players", "Render shaders on other players", (boolean)field1428[2]));
        this.field1423 = this.method450(new Class253("FriendsColor", "Render shaders on friends", (boolean)field1428[2]));
        this.field1415 = this.method450(new Class251("PlayersColor", "The render color for players", new Color((int)field1428[5], (int)field1428[10], (int)field1428[10]), (boolean)field1428[1], this::method5903));
        this.field1434 = this.method450(new Class253("Monsters", "Render shaders on monsters", (boolean)field1428[2]));
        this.field1451 = this.method450(new Class251("MonstersColor", "The render color for monsters", new Color((int)field1428[5], (int)field1428[10], (int)field1428[10]), (boolean)field1428[1], this::method6003));
        this.field1406 = this.method450(new Class253("Animals", "Render shaders on animals", (boolean)field1428[2]));
        this.field1427 = this.method450(new Class251("AnimalsColor", "The render color for animals", new Color((int)field1428[1], (int)field1428[5], (int)field1428[1]), (boolean)field1428[1], this::method6027));
        this.field1450 = this.method450(new Class253("Items", "Render shaders on items", (boolean)field1428[2]));
        this.field1445 = this.method450(new Class251("ItemsColor", "The render color for items", new Color((int)field1428[5], (int)field1428[4], (int)field1428[1]), (boolean)field1428[1], this::method6034));
        this.field1437 = this.method450(new Class253("Crystals", "Render shaders on crystals", (boolean)field1428[2]));
        this.field1405 = this.method450(new Class251("CrystalsColor", "The render color for end crystals", new Color((int)field1428[5], (int)field1428[4], (int)field1428[5]), (boolean)field1428[1], this::method6044));
        this.field1404 = this.method450(new Class253("Projectiles", "Render shaders on projectiles", (boolean)field1428[2]));
        this.field1417 = this.method450(new Class251("ProjectilesColor", "The render color for projectiles", new Color((int)field1428[5], (int)field1428[4], (int)field1428[5]), (boolean)field1428[1], this::method5911));
        this.field1439 = this.method450(new Class253("Chests", "Render chests through walls", (boolean)field1428[1]));
        this.field1416 = this.method450(new Class251("ChestsColor", "The render color for chests", new Color((int)field1428[5], (int)field1428[5], (int)field1428[7]), (boolean)field1428[1], (boolean)field1428[1], this::method5934));
        this.field1436 = this.method450(new Class253("EnderChests", "Render ender chests through walls", (boolean)field1428[1]));
        this.field1419 = this.method450(new Class251("EnderChestsColor", "The render color for ender chests", new Color((int)field1428[12], (int)field1428[1], (int)field1428[5]), (boolean)field1428[1], (boolean)field1428[1], this::method6148));
        this.field1432 = this.method450(new Class253("Shulkers", "Render shulkers through walls", (boolean)field1428[1]));
        this.field1412 = this.method450(new Class251("ShulkersColor", "The render color for shulkers", new Color((int)field1428[5], (int)field1428[1], (int)field1428[15]), (boolean)field1428[1], (boolean)field1428[1], this::method6019));
        this.field1408 = new Class926();
        INSTANCE = this;
    }

    private static Class458 method6031() {
        return Class458.method10623();
    }

    private Boolean method6032() {
        return (((Boolean)this.field1444.method507()).booleanValue() && this.field1440.method507() != Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6033() {
        Class5836.method22890();
    }

    private Boolean method6034() {
        return ((Boolean)this.field1450.method507() != false && this.field1440.method507() != Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    public static Class248 method6035(Class402 class402) {
        return class402.field1418;
    }

    private static void method6036() {
        Class1745.method15538();
    }

    public static class_757 method6037(class_310 class_3102) {
        return class_3102.field_1773;
    }

    private static void method6038(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static ShaderManager method6039() {
        return Class5723.field11044;
    }

    private static void method6040() {
        Class5836.method22897();
    }

    public static Class248 method6041(Class402 class402) {
        return class402.field1420;
    }

    private static void method6042() {
        Class5836.method22890();
    }

    private static Object method6043(Class248 class248) {
        return class248.method507();
    }

    private Boolean method6044() {
        return (((Boolean)Class402.method5908(this).method507()).booleanValue() && Class402.method5922(this.field1440) != Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6045() {
        Class1745.method15538();
    }

    private Boolean method6046() {
        return (this.field1440.method507() != Class577.field2826 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static Object method6047(Class248 class248) {
        return class248.method507();
    }

    private static void method6048() {
        Class1503.method14420();
    }

    public static Class248 method6049(Class402 class402) {
        return class402.field1440;
    }

    private static void method6050() {
        Class1503.method14420();
    }

    public static Class248 method6051(Class402 class402) {
        return class402.field1422;
    }

    private static void method6052() {
        Class6454.method24594();
    }

    public static Class248 method6053(Class402 class402) {
        return class402.field1421;
    }

    private void method6054(Class215 a2) {
        this.method5955(Class402.method6161(a2), a2.method402());
    }

    public static float method6055(Class402 class402) {
        return class402.field1413;
    }

    private static void method6056(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object method6057(Class248 class248) {
        return class248.method507();
    }

    private static class_4587 method6058(Class215 class215) {
        return class215.method402();
    }

    private Boolean method6059() {
        return (Class402.method6108(Class402.method6187(this)) == Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6060(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method6061() {
        Class6009.method23561();
    }

    public static Class248 method6062(Class402 class402) {
        return class402.field1449;
    }

    private static Class248 method6063(Class402 class402) {
        return Class402.method6200(class402);
    }

    public static Class248 method6064(Class402 class402) {
        return class402.field1422;
    }

    private static int method6065(int n2, int n3, Class773 class773, Class335 class335) {
        return Class1642.method14922(n2, n3, class773, class335);
    }

    private static Class926 method6066(Class402 class402) {
        return Class402.method5946(class402);
    }

    private Boolean method6067() {
        return ((Boolean)Class402.method5974(this).method507() != false && (Boolean)Class402.method5940(this.field1418) != false ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private void method6068(ManagedShaderEffect a2, float b2) {
        a2.setUniformValue("sobel", (int)field1428[1]);
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("color", (float)((Color)this.field1433.method507()).getRed() / 255.0f, (float)((Color)Class402.method6217(this).method507()).getGreen() / 255.0f, (float)((Color)this.field1433.method507()).getBlue() / 255.0f, ((Float)this.field1410.method507()).floatValue());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)Class402.method5917(this).method507());
        a2.setUniformValue("color1", (float)((Color)this.field1426.method507()).getRed() / 255.0f, (float)((Color)this.field1426.method507()).getGreen() / 255.0f, (float)((Color)this.field1426.method507()).getBlue() / 255.0f, (float)((Color)this.field1426.method507()).getAlpha() / 255.0f);
        a2.setUniformValue("factor", ((Float)this.field1438.method507()).floatValue() * Class2406.field6800);
        a2.setUniformValue("time", this.field1413);
        a2.setUniformValue("fastOutline", ((Boolean)this.field1421.method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", (Boolean)Class402.method6119(this.field1418) != false ? b2 : 0.0f);
        a2.setUniformValue("glow", ((Boolean)Class402.method5979(this).method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)Class402.method5994(this.field1408) / 5.0f * ((Float)this.field1452.method507()).floatValue();
    }

    private static void method6069() {
        Class6009.method23560();
    }

    private static Class625 method6070(Class298 class298) {
        return class298.method1949();
    }

    public static class_757 method6071(class_310 class_3102) {
        return class_3102.field_1773;
    }

    private static Object method6072(Class248 class248) {
        return class248.method507();
    }

    private void method6073(ManagedShaderEffect a2, float b2) {
        a2.setUniformValue("sobel", (int)field1428[1]);
        a2.setUniformValue("resolution", field290.method_22683().method_4486(), field290.method_22683().method_4502());
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("samples", (Integer)Class402.method5902(this).method507());
        a2.setUniformValue("steps", (Integer)Class402.method6072(this.field1453));
        a2.setUniformValue("color", (float)((Color)this.field1433.method507()).getRed() / Class3479.field7632, (float)((Color)this.field1433.method507()).getGreen() / 255.0f, (float)((Color)this.field1433.method507()).getBlue() / 255.0f, ((Float)this.field1410.method507()).floatValue());
        a2.setUniformValue("time", this.field1413);
        a2.setUniformValue("radius", (Boolean)Class402.method6090(this.field1418) != false ? b2 : 0.0f);
        a2.setUniformValue("glow", (Boolean)Class402.method6113(this.field1422) != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)this.field1408.method12592() / 5.0f * ((Float)Class402.method6195(this.field1441)).floatValue();
    }

    private static void method6074() {
        Class6009.method23560();
    }

    private static void method6075() {
        Class1807.method15744();
    }

    private static void method6076(long l2) {
        Class402.field1428[0] = l2 ^ 0x14611F60C6200491L;
        Class402.field1428[28] = l2 ^ 0x14611F60C6201D9EL;
        Class402.field1428[22] = l2 ^ 0x14611F60C6202C98L;
        Class402.field1428[31] = l2 ^ 0x14611F60C62084F4L;
        Class402.field1428[17] = l2 ^ 0x14611F60C62084F7L;
        Class402.field1428[21] = l2 ^ 0x14611F60C6202C9AL;
        Class402.field1428[23] = l2 ^ 0x14611F60C620049AL;
        Class402.field1428[3] = l2 ^ 0x14611F60C6200489L;
        Class402.field1428[7] = l2 ^ 0x14611F60C62004FCL;
        Class402.field1428[18] = l2 ^ 0x14611F60C6202C99L;
        Class402.field1428[1] = l2 ^ 0x14611F60C6200499L;
        Class402.field1428[29] = l2 ^ 0x14611F60C620086DL;
        Class402.field1428[30] = l2 ^ 0x14611F60C6200868L;
        Class402.field1428[35] = l2 ^ 0x14611F60C6208058L;
        Class402.field1428[32] = l2 ^ 0x14611F60C6202C9BL;
        Class402.field1428[11] = l2 ^ 0x14611F60C6200493L;
        Class402.field1428[19] = l2 ^ 0x14611F60C6202299L;
        Class402.field1428[24] = l2 ^ 0x14611F60C6200869L;
        Class402.field1428[4] = l2 ^ 0x14611F60C62004FDL;
        Class402.field1428[15] = l2 ^ 0x14611F60C62004F3L;
        Class402.field1428[20] = l2 ^ 0x14611F60C6201098L;
        Class402.field1428[33] = l2 ^ 0x14611F60C620086CL;
        Class402.field1428[13] = l2 ^ 0x14611F60C620049CL;
        Class402.field1428[2] = l2 ^ 0x14611F60C6200498L;
        Class402.field1428[12] = l2 ^ 0x14611F60C6200402L;
        Class402.field1428[6] = l2 ^ 0x14611F60C62004B9L;
        Class402.field1428[25] = l2 ^ 0x14611F60C6202D98L;
        Class402.field1428[5] = l2 ^ 0x14611F60C6200451L;
        Class402.field1428[26] = l2 ^ 0x14611F60C620086BL;
        Class402.field1428[8] = l2 ^ 0x14611F60C6200466L;
        Class402.field1428[10] = l2 ^ 0x14611F60C62004A5L;
        Class402.field1428[34] = l2 ^ 0x14611F60C620086AL;
        Class402.field1428[27] = l2 ^ 0x14611F60C6208059L;
        Class402.field1428[16] = l2 ^ 0x14611F60C6200978L;
        Class402.field1428[9] = l2 ^ 0x14611F60C620049BL;
        Class402.field1428[14] = l2 ^ 0x14611F60C620049DL;
    }

    public Color method6077(class_2586 a2) {
        if (!(a2 instanceof class_2595)) {
            Class6009.method23561();
            return null;
        }
        return (Color)this.field1416.method507();
    }

    @Class1
    public void method6078(Class68 a2) {
        if (Class402.field290.field_1724 == null) {
            return;
        }
        if (a2.method140() != this.field1440) {
            Class402.method6183(false);
            return;
        }
        if (this.field1440.method507() == Class577.field2828 && a2.method128() == Class402.method6112()) {
            this.method6000();
        }
    }

    private static void method6079() {
        Class4146.method20697();
    }

    private static int method6080(int n2, int n3, Class521 class521, Class3332 class3332) {
        return Class1642.method15019(n2, n3, class521, class3332);
    }

    private static boolean method6081(Class402 class402, class_1297 class_12972) {
        return class402.method5930(class_12972);
    }

    private static Object method6082(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6083(Class402 class402) {
        return class402.field1447;
    }

    public static Class248 method6084(Class402 class402) {
        return class402.field1453;
    }

    public static Class248 method6085(Class402 class402) {
        return class402.field1421;
    }

    private void method6086(Class215 a2) {
        this.method5955(a2.method405(), a2.method402());
    }

    public static Class248 method6087(Class402 class402) {
        return class402.field1449;
    }

    public static double method6088(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static void method6089() {
        Class1807.method15744();
    }

    private static Object method6090(Class248 class248) {
        return class248.method507();
    }

    private static void method6091(Class402 class402, float f2, class_4587 class_45872) {
        class402.method5955(f2, class_45872);
    }

    private Boolean method6092() {
        return (((Boolean)this.field1411.method507()).booleanValue() && Class402.method5918(this.field1440) == Class577.field2828 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static Object method6093(Class248 class248) {
        return class248.method507();
    }

    private static Object method6094(Class248 class248) {
        return class248.method507();
    }

    private static void method6095(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class248 method6096(Class402 class402) {
        return class402.field1440;
    }

    private static void method6097() {
        Class5836.method22885();
    }

    private static Object method6098(Class248 class248) {
        return class248.method507();
    }

    private void method6099(ManagedShaderEffect a2, float b2) {
        a2.setUniformValue("sobel", (int)field1428[2]);
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("color", 1.0f, 1.0f, 1.0f, ((Float)Class402.method6014(this).method507()).floatValue());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)Class402.method5904(Class402.method5910(this)));
        a2.setUniformValue("color1", (float)((Color)this.field1426.method507()).getRed() / 255.0f, (float)((Color)Class402.method6043(this.field1426)).getGreen() / Class6002.field11977, (float)((Color)this.field1426.method507()).getBlue() / 255.0f, (float)((Color)Class402.method5950(this).method507()).getAlpha() / 255.0f);
        a2.setUniformValue("factor", ((Float)this.field1438.method507()).floatValue() * Class5459.field10219);
        a2.setUniformValue("time", Class402.method6055(this));
        a2.setUniformValue("fastOutline", (Boolean)Class402.method6053(this).method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", ((Boolean)Class402.method5905(this).method507()).booleanValue() ? b2 : 0.0f);
        a2.setUniformValue("glow", (Boolean)this.field1422.method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)Class402.method6206(this.field1447)).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)Class402.method6066(this).method12592() / 5.0f * ((Float)Class402.method6134(Class402.method6177(this))).floatValue();
    }

    private void method6100(Class215 a2) {
        this.method5955(a2.method405(), a2.method402());
    }

    private static void method6101(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method6102(ManagedShaderEffect a2, float b2) {
        int n2;
        a2.setUniformValue("sobel", (int)field1428[2]);
        a2.setUniformValue("resolution", field290.method_22683().method_4486(), field290.method_22683().method_4502());
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)this.field1453.method507());
        a2.setUniformValue("color", 1.0f, 1.0f, 1.0f, ((Float)Class402.method5975(this).method507()).floatValue());
        a2.setUniformValue("time", this.field1413);
        a2.setUniformValue("fastOutline", (Boolean)this.field1421.method507() != false ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", (Boolean)Class402.method6063(this).method507() != false ? b2 : 0.0f);
        int n3 = (Boolean)Class402.method5989(this.field1422) != false ? 41899 : 41900;
        block4: while (true) {
            switch (n3) {
                case 41900: {
                    n3 = 41898;
                    continue block4;
                }
                case 41899: {
                    n2 = (int)field1428[2];
                    break block4;
                }
                default: {
                    n2 = (int)field1428[1];
                }
            }
            break;
        }
        a2.setUniformValue("glow", n2);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
        this.field1413 = (float)Class402.method6208(this).method12592() / 5.0f * ((Float)this.field1441.method507()).floatValue();
    }

    private static void method6103(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method6104(Class402 class402) {
        return class402.field1443;
    }

    private static Object method6105(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method6106(Class402 class402) {
        return Class402.method6064(class402);
    }

    private static void method6107(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method6108(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method6109(Class215 f2) {
        if (((Float)Class402.method6087(this).method507()).floatValue() <= 0.0f) {
            return;
        }
        float g2 = Math.max((Boolean)this.field1421.method507() != false ? 0.3f : 1.0f, ((Float)this.field1443.method507()).floatValue());
        switch (((Class577)((Object)this.field1440.method507())).ordinal()) {
            case 0: 
            case 5: {
                ManagedShaderEffect a2 = Class5723.field11044.getFilledShaderEffect();
                Class402.method5906().applyShader(a2, () -> this.method6188(a2, g2), () -> this.method6124(f2));
                break;
            }
            case 1: {
                ManagedShaderEffect b2 = Class5723.field11044.getGradientShaderEffect();
                Class5723.field11044.applyShader(b2, () -> this.method6099(b2, g2), () -> this.method6100(f2));
                break;
            }
            case 2: {
                ManagedShaderEffect c2 = Class5723.field11044.getGlowingShaderEffect();
                Class5723.field11044.applyShader(c2, () -> this.method6102(c2, g2), () -> this.method5947(f2));
                break;
            }
            case 4: {
                ManagedShaderEffect d2 = Class5723.field11044.getImageShaderEffect();
                Class402.method6184().applyShader(d2, () -> this.method6153(d2, g2), () -> this.method6054(f2));
                break;
            }
            case 3: {
                ManagedShaderEffect e2 = Class5723.field11044.getRainbowShaderEffect();
                Class5723.field11044.applyShader(e2, () -> this.method6029(e2, g2), () -> this.method6086(f2));
            }
        }
    }

    private static void method6110() {
        Class1745.method15538();
    }

    public static Class248 method6111(Class402 class402) {
        return class402.field1440;
    }

    public static Class543 method6112() {
        return Class543.field2691;
    }

    private static Object method6113(Class248 class248) {
        return class248.method507();
    }

    private static int method6114(int n2, int n3, Class62 class62, Class72 class72) {
        return Class1642.method14960(n2, n3, class62, class72);
    }

    private static void method6115() {
        Class5836.method22897();
    }

    private static Object method6116(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6117(Class402 class402) {
        return class402.field1421;
    }

    public static Class248 method6118(Class402 class402) {
        return class402.field1444;
    }

    private static Object method6119(Class248 class248) {
        return class248.method507();
    }

    private static void method6120(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6121(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method6122(Class248 class248) {
        return class248.method507();
    }

    private static Object method6123(Class248 class248) {
        return class248.method507();
    }

    private void method6124(Class215 a2) {
        this.method5955(a2.method405(), a2.method402());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6125(Class56 a2) {
        int n2 = Class402.field290.field_1724 != null ? 64397 : 64398;
        block4: while (true) {
            switch (n2) {
                case 64398: {
                    n2 = 64396;
                    continue block4;
                }
                case 64397: {
                    if (!((Boolean)this.field1424.method507()).booleanValue() && this.method5930((class_1297)a2.field76) && !this.field1442 && !(Class402.field290.field_1724.method_5858((class_1297)a2.field76) > ((Class252)Class402.method6062(this)).method564())) break block4;
                }
                default: {
                    return;
                }
            }
            break;
        }
        a2.method10();
    }

    public static Class248 method6126(Class402 class402) {
        return class402.field1440;
    }

    @Class1
    public void method6127(Class117 a2) {
        if (this.field1440.method507() == Class577.field2828) {
            this.method6000();
        }
    }

    private static void method6128() {
        Class5836.method22890();
    }

    private void method6129(Class60 a2) {
        this.field1442 = (int)field1428[2];
        ((k)Class402.method5954(field290)).hookRenderHand(Class402.field290.field_1773.method_19418(), a2.method124(), a2.method125().method_23760().method_23761());
        Class402.method5913(this, (boolean)field1428[1]);
    }

    public static Class248 method6130(Class402 class402) {
        return class402.field1444;
    }

    public static Class248 method6131(Class402 class402) {
        return class402.field1429;
    }

    private static double method6132(Class252 class252) {
        return class252.method564();
    }

    private static void method6133(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method6134(Class248 class248) {
        return class248.method507();
    }

    private static void method6135(float f2) {
        Class5836.method22907(f2);
    }

    private static Class248 method6136(Class402 class402) {
        return Class402.method6049(class402);
    }

    private static void method6137() {
        Class4146.method20697();
    }

    public static Class248 method6138(Class402 class402) {
        return class402.field1440;
    }

    public static Class248 method6139(Class402 class402) {
        return class402.field1410;
    }

    private static void method6140(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method6141(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6142() {
        Class5659.method22184();
    }

    public static double method6143(class_1297 class_12972) {
        return class_12972.field_6038;
    }

    public static Class577 method6144() {
        return Class577.field2829;
    }

    private static void method6145() {
        Class5836.method22885();
    }

    public static class_746 method6146(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method6147(class_243 class_2432) {
        return class_2432.field_1350;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method6148() {
        int n2;
        if (((Boolean)this.field1436.method507()).booleanValue() && this.field1440.method507() != Class577.field2825) {
            n2 = (int)field1428[2];
            return n2 != 0;
        }
        n2 = (int)field1428[1];
        return n2 != 0;
    }

    private static Object method6149(Class248 class248) {
        return class248.method507();
    }

    private static void method6150(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method6151(class_1297 class_12972) {
        return Class1158.method13110(class_12972);
    }

    public static ShaderManager method6152() {
        return Class5723.field11044;
    }

    private void method6153(ManagedShaderEffect a2, float b2) {
        GlStateManager._activeTexture((int)((int)field1428[35]));
        GlStateManager._bindTexture((int)this.field1409);
        a2.setUniformValue("sobel", (int)field1428[2]);
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)this.field1453.method507());
        a2.setUniformValue("imageTexture", (int)field1428[2]);
        a2.setUniformValue("color", 1.0f, 1.0f, 1.0f, ((Float)Class402.method5999(this).method507()).floatValue());
        a2.setUniformValue("mixColor", ((Boolean)Class402.method5959(this).method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("mixFactor", ((Float)this.field1448.method507()).floatValue());
        a2.setUniformValue("fastOutline", ((Boolean)this.field1421.method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("radius", (Boolean)Class402.method6057(this.field1418) != false ? b2 : 0.0f);
        a2.setUniformValue("glow", ((Boolean)this.field1422.method507()).booleanValue() ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method6154(ManagedShaderEffect a2, float b2) {
        int n2;
        a2.setUniformValue("sobel", (int)field1428[1]);
        a2.setUniformValue("texelSize", 1.0f / (float)field290.method_22683().method_4486(), 1.0f / (float)field290.method_22683().method_4502());
        a2.setUniformValue("color", (float)((Color)Class402.method5928(this).method507()).getRed() / 255.0f, (float)((Color)Class402.method6047(this.field1433)).getGreen() / 255.0f, (float)((Color)Class402.method6122(this.field1433)).getBlue() / 255.0f, Class402.method6181(this.field1440) == Class402.method6144() ? ((Float)Class402.method6139(this).method507()).floatValue() : 0.0f);
        a2.setUniformValue("samples", (Integer)this.field1446.method507());
        a2.setUniformValue("steps", (Integer)Class402.method5964(this).method507());
        a2.setUniformValue("dots", (Boolean)this.field1425.method507() != false && Class402.method6126(this).method507() != Class577.field2826 ? (int)field1428[2] : (int)field1428[1]);
        a2.setUniformValue("dotRadius", (Integer)Class402.method6193(this.field1407));
        a2.setUniformValue("fastOutline", (Boolean)Class402.method6117(this).method507() == false ? (int)field1428[1] : (int)field1428[2]);
        a2.setUniformValue("radius", (Boolean)this.field1418.method507() != false ? b2 : 0.0f);
        int n3 = (Boolean)this.field1422.method507() != false ? 30405 : 30406;
        block4: while (true) {
            switch (n3) {
                case 30406: {
                    n3 = 30404;
                    continue block4;
                }
                case 30405: {
                    n2 = (int)field1428[2];
                    break block4;
                }
                default: {
                    n2 = (int)field1428[1];
                }
            }
            break;
        }
        a2.setUniformValue("glow", n2);
        a2.setUniformValue("glowRadius", ((Float)this.field1447.method507()).floatValue());
        a2.render(field290.method_60646().method_60637((boolean)field1428[2]));
    }

    private Boolean method6155() {
        return (this.field1440.method507() == Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6156(float f2) {
        Class5836.method22907(f2);
    }

    private static void method6157() {
        Class6009.method23560();
    }

    private static boolean method6158() {
        return Class1807.method15769();
    }

    private Boolean method6159() {
        return (this.field1440.method507() == Class577.field2825 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6160(long l2) {
        Class402.method6076(l2);
    }

    private static float method6161(Class215 class215) {
        return class215.method405();
    }

    private static void method6162() {
        Class1503.method14420();
    }

    public static Class248 method6163(Class402 class402) {
        return class402.field1414;
    }

    private static void method6164() {
        Class1503.method14420();
    }

    public static void method6165(Class402 class402, boolean bl2) {
        class402.field1442 = bl2;
    }

    private static void method6166(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class577 method6167() {
        return Class577.field2825;
    }

    private static Object method6168(Class248 class248) {
        return class248.method507();
    }

    private static void method6169() {
        Class1745.method15538();
    }

    private static Object method6170(Class248 class248) {
        return class248.method507();
    }

    private static void method6171() {
        Class5836.method22885();
    }

    private static boolean method6172(Class298 class298, class_1309 class_13092) {
        return class298.method1944(class_13092);
    }

    private static void method6173() {
        Class1745.method15538();
    }

    private static void method6174() {
        Class5659.method22184();
    }

    public static void method6175(Class402 class402, boolean bl2) {
        class402.field1442 = bl2;
    }

    private static void method6176(Class298 class298, class_4587 class_45872, class_1297 class_12972, float f2) {
        class298.method1999(class_45872, class_12972, f2);
    }

    private static Class248 method6177(Class402 class402) {
        return Class402.method5998(class402);
    }

    private static void method6178() {
        Class5659.method22184();
    }

    private static boolean method6179(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static Class248 method6180(Class402 class402) {
        return class402.field1440;
    }

    private static Object method6181(Class248 class248) {
        return class248.method507();
    }

    private static void method6182(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private Boolean method1269() {
        return (Boolean)Class402.method5953(this).method507();
    }

    private static void method6183(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static ShaderManager method6184() {
        return Class5723.field11044;
    }

    public static Class248 method6185(Class402 class402) {
        return class402.field1440;
    }

    public static class_1511 method6186(Class80 class80) {
        return class80.field115;
    }

    public static Class248 method6187(Class402 class402) {
        return class402.field1440;
    }

    /*
     * Unable to fully structure code
     */
    private void method6188(ManagedShaderEffect a, float b) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        a.setUniformValue("sobel", (int)Class402.field1428[2]);
                        a.setUniformValue("texelSize", 1.0f / (float)Class402.field290.method_22683().method_4486(), 1.0f / (float)Class402.field290.method_22683().method_4502());
                        a.setUniformValue("color", 1.0f, 1.0f, 1.0f, this.field1440.method507() == Class577.field2829 ? ((Float)this.field1410.method507()).floatValue() : 0.0f);
                        a.setUniformValue("samples", (Integer)this.field1446.method507());
                        a.setUniformValue("steps", (Integer)this.field1453.method507());
                        if (!((Boolean)this.field1425.method507()).booleanValue()) ** GOTO lbl-1000
                        if (this.field1440.method507() != Class577.field2826) {
                            v0 = (int)Class402.field1428[2];
                        } else lbl-1000:
                        // 2 sources

                        {
                            v0 = (int)Class402.field1428[1];
                        }
                        a.setUniformValue("dots", v0);
                        a.setUniformValue("dotRadius", (Integer)this.field1407.method507());
                        if (!((Boolean)this.field1421.method507()).booleanValue()) break block6;
                        v1 = 26305;
                        ** GOTO lbl21
                    }
                    v1 = 26306;
                    if (true) ** GOTO lbl21
                    do {
                        v1 = var3_3 = 26304;
lbl21:
                        // 3 sources

                        if (var3_3 == 26305) break block5;
                    } while (var3_3 == 26306);
                    break block7;
                }
                v2 = (int)Class402.field1428[2];
                break block8;
            }
            v2 = (int)Class402.field1428[1];
        }
        a.setUniformValue("fastOutline", v2);
        a.setUniformValue("radius", (Boolean)this.field1418.method507() != false ? b : 0.0f);
        if (((Boolean)this.field1422.method507()).booleanValue()) {
            v3 = 24011;
            Class6009.method23560();
            return;
        }
        v4 = 24012;
        if (true) ** GOTO lbl40
        do {
            v4 = var4_4 = 24010;
lbl40:
            // 2 sources

            if (var4_4 != 24011) continue;
            Class402.method6015(0.5229745149526541, 0.9575680837639381, 0.6521869918026921, Class5658.field10850);
            return;
        } while (var4_4 == 24012);
        a.setUniformValue("glow", (int)Class402.field1428[1]);
        a.setUniformValue("glowRadius", ((Float)Class402.method6105(this.field1447)).floatValue());
        a.render(Class402.field290.method_60646().method_60637((boolean)Class402.field1428[2]));
    }

    @Override
    public void method1274() {
        if (this.field1440.method507() == Class577.field2828) {
            this.method6000();
        }
        this.field1442 = (int)field1428[1];
    }

    private static void method6189() {
        Class4146.method20694();
    }

    private static void method6190() {
        Class5836.method22890();
    }

    private static Object method6191(Class248 class248) {
        return class248.method507();
    }

    private static void method6192() {
        Class5659.method22184();
    }

    private static Object method6193(Class248 class248) {
        return class248.method507();
    }

    private static void method6194(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method6195(Class248 class248) {
        return class248.method507();
    }

    private static Object method6196(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method6197(Class223 a2) {
        if (Class402.method6212(field290) != null && Class402.method6081(this, a2.method416())) {
            if (Class402.field290.field_1724.method_5858(a2.method416()) > ((Class252)this.field1449).method564()) {
                return;
            }
            a2.method10();
        }
    }

    @Class1
    public void method6198(Class60 f2) {
        block9: {
            float g2;
            block12: {
                block13: {
                    block11: {
                        block10: {
                            if (!((Boolean)Class402.method6130(this).method507()).booleanValue()) {
                                return;
                            }
                            g2 = Math.max(((Boolean)this.field1421.method507()).booleanValue() ? 0.3f : 1.0f, ((Float)Class402.method6104(this).method507()).floatValue());
                            switch (((Class577)((Object)Class402.method5987(this).method507())).ordinal() ^ 0xAC07D910) {
                                default: {
                                    break block9;
                                }
                                case -1408771824: {
                                    break;
                                }
                                case -1408771823: {
                                    break block10;
                                }
                                case -1408771822: {
                                    break block11;
                                }
                                case -1408771821: {
                                    break block12;
                                }
                                case -1408771820: {
                                    break block13;
                                }
                                case -1408771819: {
                                    break;
                                }
                            }
                            ManagedShaderEffect a2 = Class5723.field11044.getFilledShaderEffect();
                            Class5723.field11044.applyShader(a2, () -> this.method6154(a2, g2), () -> this.method5926(f2));
                            break block9;
                        }
                        ManagedShaderEffect b2 = Class5723.field11044.getGradientShaderEffect();
                        Class5723.field11044.applyShader(b2, () -> this.method6068(b2, g2), () -> this.method5942(f2));
                        break block9;
                    }
                    ManagedShaderEffect c2 = Class5723.field11044.getGlowingShaderEffect();
                    Class402.method6039().applyShader(c2, () -> this.method6073(c2, g2), () -> this.method5968(f2));
                    Class6454.method24594();
                    return;
                }
                ManagedShaderEffect d2 = Class5723.field11044.getImageShaderEffect();
                Class5723.field11044.applyShader(d2, () -> this.method5972(d2, g2), () -> this.method6129(f2));
                break block9;
            }
            ManagedShaderEffect e2 = Class5723.field11044.getRainbowShaderEffect();
            Class5723.field11044.applyShader(e2, () -> this.method6025(e2, g2), () -> this.method5912(f2));
        }
    }

    private static void method6199(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class248 method6200(Class402 class402) {
        return class402.field1418;
    }

    public static Class248 method6201(Class402 class402) {
        return class402.field1433;
    }

    public static Class402 method6202() {
        return INSTANCE;
    }

    private static void method6203() {
        Class1807.method15744();
    }

    private Boolean method6204() {
        if (((Boolean)Class402.method6041(this).method507()).booleanValue() && Class402.method6082(Class402.method5945(this)) != Class577.field2825) {
            int n2 = (int)field1428[2];
            Class6322.method24332(0.51576716f, Class3962.field9025);
            return null;
        }
        return (boolean)field1428[1];
    }

    public static Class248 method6205(Class402 class402) {
        return class402.field1439;
    }

    private static Object method6206(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method6207(Class402 class402) {
        return Class402.method6185(class402);
    }

    public static Class926 method6208(Class402 class402) {
        return class402.field1408;
    }

    private Boolean method6209() {
        return (Class402.method6111(this).method507() == Class577.field2822 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    public static Class577 method6210() {
        return Class577.field2825;
    }

    private static int method6211(int n2, int n3, Class34 class34, Class1806 class1806) {
        return Class1642.method14849(n2, n3, class34, class1806);
    }

    private static class_746 method6212(class_310 class_3102) {
        return Class402.method6146(class_3102);
    }

    private static void method6213() {
        Class5836.method22897();
    }

    private static Object method6214(Class248 class248) {
        return class248.method507();
    }

    private Boolean method6215() {
        return ((Boolean)Class402.method5982(this).method507() != false && Class402.method5971(this).method507() == Class577.field2829 ? (int)field1428[2] : (int)field1428[1]) != 0;
    }

    private static void method6216() {
        Class5836.method22897();
    }

    private static Class248 method6217(Class402 class402) {
        return Class402.method6201(class402);
    }

    public static void method6218(Class402 class402, boolean bl2) {
        class402.field1442 = bl2;
    }

    private static void method6219() {
        Class298.method1924();
    }

    private static void method6220(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

