/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffectUtil
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.LadderBlock
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import mapped.Class1108;
import mapped.Class1182;
import mapped.Class1308;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2297;
import mapped.Class2298;
import mapped.Class244;
import mapped.Class246;
import mapped.Class248;
import mapped.Class29;
import mapped.Class319;
import mapped.Class3226;
import mapped.Class3336;
import mapped.Class3342;
import mapped.Class376;
import mapped.Class3871;
import mapped.Class3927;
import mapped.Class3979;
import mapped.Class404;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class425;
import mapped.Class436;
import mapped.Class447;
import mapped.Class449;
import mapped.Class480;
import mapped.Class5496;
import mapped.Class554;
import mapped.Class5550;
import mapped.Class5595;
import mapped.Class5628;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class580;
import mapped.Class5836;
import mapped.Class5890;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class607;
import mapped.Class609;
import mapped.Class610;
import mapped.Class6322;
import mapped.Class6396;
import mapped.Class6454;
import mapped.Class760;
import mapped.Class803;
import mapped.Class926;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.LadderBlock;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5512 {
    public double field10389;
    public int field10390;
    public int field10391;
    public int field10392;
    public double field10393;
    public boolean field10394;
    public class_2338 field10395;
    public int field10396;
    public class_1799 field10397;
    final Class425 field10398;
    public int field10399;
    public boolean field10400;
    public boolean field10401;
    private static long[] field10402 = new long[7];
    public class_2680 field10403;
    public int field10404;
    public double field10405;

    private static int method21488(int n2, int n3, Class3336 class3336, Class2298 class2298) {
        return Class5628.method21987(n2, n3, class3336, class2298);
    }

    private static Class248 method21489(Class425 class425) {
        return Class5512.method21593(class425);
    }

    private static class_1799 method21490(Class5512 class5512) {
        return Class5512.method21687(class5512);
    }

    private static boolean method21491() {
        return Class447.method10252();
    }

    private static void method21492() {
        Class3979.method19561();
    }

    public static boolean method21493(Class5512 class5512) {
        return class5512.field10400;
    }

    private class_2596 method21494(class_2350 a2, int b2) {
        if (((Class610)((Object)Class5512.method21633(Class5512.method21618((Class5512)this).field1884))).method11295()) {
            Class5512.method21545().field_1761.method_2899(this.field10395);
        }
        return new class_2846(class_2846.class_2847.field_12973, this.field10395, a2, b2);
    }

    private static float method21495() {
        return Class6322.method24327();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int method21496(class_2680 d2) {
        int e2 = (int)field10402[2];
        float f2 = 1.0f;
        int c2 = (int)field10402[1];
        while (c2 < (int)field10402[5]) {
            class_1799 a2 = Class244.field290.field_1724.method_31548().method_5438(c2);
            float b2 = Class5512.method21588(this, d2, a2);
            int n2 = b2 >= f2 ? 25427 : 25428;
            block5: while (true) {
                switch (n2) {
                    case 25428: {
                        n2 = 25426;
                        continue block5;
                    }
                    case 25427: {
                        this.field10397 = a2;
                        f2 = b2;
                        e2 = c2;
                        break block5;
                    }
                }
                break;
            }
            ++c2;
        }
        return e2;
    }

    public static class_1799 method21497(Class5512 class5512) {
        return class5512.field10397;
    }

    private static boolean method21498() {
        return Class5836.method22894();
    }

    private static boolean method21499(class_2680 class_26802) {
        return Class5595.method21931(class_26802);
    }

    private static int method21500(int n2, int n3, Class5496 class5496, Class29 class29) {
        return Class5628.method22039(n2, n3, class5496, class29);
    }

    public static Class425 method21501(Class5512 class5512) {
        return class5512.field10398;
    }

    private static int method21502(int n2) {
        return Class4045.method20096(n2);
    }

    private static Object method21503(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float method21504(class_2680 d2, boolean e2) {
        float f2;
        class_1799 a2;
        int b2;
        float f3 = this.field10397.method_7924(d2);
        if (f3 > 1.0f && (b2 = Class1308.method13621(a2 = Class5512.method21490(this), class_1893.field_9131)) > 0 && !a2.method_7960()) {
            f3 += (float)(b2 * b2 + (int)field10402[0]);
        }
        if (class_1292.method_5576((class_1309)Class244.field290.field_1724)) {
            f3 *= 1.0f + (float)(class_1292.method_5575((class_1309)Class244.field290.field_1724) + (int)field10402[0]) * 0.2f;
        }
        if (!Class244.field290.field_1724.method_6059(class_1294.field_5901)) {
            return Class6322.method24327();
        }
        switch (Class244.field290.field_1724.method_6112(class_1294.field_5901).method_5578()) {
            case 0: {
                return Class5512.method21581();
            }
            case 1: {
                f2 = 0.09f;
                break;
            }
            case 2: {
                f2 = 0.0027f;
                break;
            }
            default: {
                f2 = 8.1E-4f;
            }
        }
        float c2 = f2;
        f3 *= c2;
        if (!e2) return f3;
        if (Class244.field290.field_1724.method_5799()) {
            f3 /= 5.0f;
        }
        int n2 = (Boolean)Class5512.method21543(Class5512.method21639(this)).method507() != false ? 3833 : 3834;
        block9: while (true) {
            switch (n2) {
                case 3834: {
                    n2 = 3832;
                    continue block9;
                }
                case 3833: {
                    if (!Class5512.method21570(Class5512.method21538()).method_24828()) break block9;
                }
                default: {
                    if ((Boolean)Class5512.method21682(Class5512.method21592((Class5512)this).field1880) == false) return f3;
                    if (Class244.field290.field_1724.method_6128()) break block9;
                    return f3;
                }
            }
            break;
        }
        f3 /= 5.0f;
        return f3;
    }

    public static class_746 method21505(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method21506(Class248 class248) {
        return class248.method507();
    }

    private static void method21507(long l2) {
        Class5512.field10402[1] = l2 ^ 0x51787BB947EC41A1L;
        Class5512.field10402[2] = l2 ^ 0xAE878446B813BE5EL;
        Class5512.field10402[4] = l2 ^ 0x51787BB947EC41C5L;
        Class5512.field10402[5] = l2 ^ 0x51787BB947EC41A8L;
        Class5512.field10402[3] = l2 ^ 0x51787BB947EC41BFL;
        Class5512.field10402[0] = l2 ^ 0x51787BB947EC41A0L;
        Class5512.field10402[6] = l2 ^ 0x51787BB947EC4185L;
    }

    public static Class248 method21508(Class425 class425) {
        return class425.field1907;
    }

    public static void method21509(Class5512 class5512, class_1799 class_17992) {
        class5512.field10397 = class_17992;
    }

    public static class_2338 method21510(Class5512 class5512) {
        return class5512.field10395;
    }

    public static class_310 method21511() {
        return Class244.field290;
    }

    private static int method21512(Class5512 class5512) {
        return Class5512.method21520(class5512);
    }

    private static int method21513(Class5512 class5512, class_2680 class_26802) {
        return class5512.method21609(class_26802);
    }

    public static class_2338 method21514(Class5512 class5512) {
        return class5512.field10395;
    }

    public static class_310 method21515() {
        return Class244.field290;
    }

    private static void method21516() {
        Class4146.method20694();
    }

    public static void method21517(Class425 class425, Runnable runnable) {
        class425.field1902 = runnable;
    }

    private static boolean method21518() {
        return Class447.method10322();
    }

    private static class_2338 method21519(Class5512 class5512) {
        return Class5512.method21510(class5512);
    }

    public static int method21520(Class5512 class5512) {
        return class5512.field10396;
    }

    private static Object method21521(Class248 class248) {
        return class248.method507();
    }

    private static int method21522() {
        return Class6454.method24637();
    }

    private static void method21523(Class480 class480, class_1268 class_12682) {
        class480.method10782(class_12682);
    }

    public static Class425 method21524(Class5512 class5512) {
        return class5512.field10398;
    }

    private class_2596 method21525(class_2350 a2, int b2) {
        if (((Class610)((Object)this.field10398.field1884.method507())).method11295()) {
            Class5512.method21569(Class244.field290).method_2899(this.field10395);
        }
        return new class_2846(class_2846.class_2847.field_12973, this.field10395, a2, b2);
    }

    public Class5512(Class425 a2, class_2338 b2, int c2, double d2) {
        this.field10398 = a2;
        this.field10395 = b2;
        this.field10392 = c2;
        this.field10389 = d2;
    }

    private static int method21526(int n2, int n3, Class319 class319, Class609 class609) {
        return Class5628.method22016(n2, n3, class319, class609);
    }

    private static void method21527() {
        Class6009.method23560();
    }

    private static void method21528() {
        Class3979.method19561();
    }

    private static void method21529(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    private static void method21530() {
        Class3979.method19561();
    }

    private static void method21531() {
        Class1745.method15538();
    }

    public static void method21532(Class5512 class5512, int n2) {
        class5512.field10404 = n2;
    }

    private static class_310 method21533() {
        return Class5512.method21544();
    }

    public static class_2338 method21534(Class5512 class5512) {
        return class5512.field10395;
    }

    public static Class5512 method21535(Class425 class425) {
        return class425.field1893;
    }

    private static void method21536(Class480 class480, class_1268 class_12682) {
        class480.method10782(class_12682);
    }

    private static int method21537(int n2, int n3, Class449 class449, Class3871 class3871) {
        return Class5628.method21982(n2, n3, class449, class3871);
    }

    public static class_310 method21538() {
        return Class244.field290;
    }

    public static Class425 method21539(Class5512 class5512) {
        return class5512.field10398;
    }

    public static class_746 method21540(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class425 method21541(Class5512 class5512) {
        return class5512.field10398;
    }

    private static Object method21542(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method21543(Class425 class425) {
        return class425.field1908;
    }

    public static class_310 method21544() {
        return Class244.field290;
    }

    public static class_310 method21545() {
        return Class244.field290;
    }

    private static void method21546() {
        Class6009.method23561();
    }

    private class_2596 method21547(class_2350 a2, int b2) {
        if (((Class610)((Object)Class5512.method21503(this.field10398.field1884))).method11295()) {
            Class244.field290.field_1761.method_2899(this.field10395);
        }
        return new class_2846(Class5512.method21657(), this.field10395, a2, b2);
    }

    public static boolean method21548(Class5512 class5512) {
        return class5512.field10400;
    }

    public static class_310 method21549() {
        return Class244.field290;
    }

    /*
     * Unable to fully structure code
     */
    public void method21550() {
        block11: {
            block12: {
                this.field10403 = Class5512.method21690(Class244.field290).method_8320(this.field10395);
                a = Class1745.method15561(Class5512.method21534(this), (Double)this.field10398.field1898.method507());
                if (a == null) {
                    return;
                }
                if (!Class5512.method21619(this).method_26215()) {
                    Class4146.method20697();
                    return;
                }
                if (!((Boolean)Class5512.method21489(this.field10398).method507()).booleanValue()) {
                    return;
                }
                this.field10401 = (int)Class5512.field10402[0];
                if (Class5512.method21499(this.field10403)) {
                    return;
                }
                if (((Boolean)Class5512.method21612(this.field10398).method507()).booleanValue()) {
                    Class1503.method14412(Class5512.method21519(this), a);
                }
                if (this.field10398.field1896.method507() == Class554.field2742) {
                    Class5723.field11048.method21353((class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method21672(net.minecraft.util.math.Direction int ), (I)Lnet/minecraft/class_2596;)((Class5512)this, (class_2350)a));
                }
                Class5723.field11048.method21353((class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method21572(net.minecraft.util.math.Direction int ), (I)Lnet/minecraft/class_2596;)((Class5512)this, (class_2350)a));
                if (!((Boolean)Class5512.method21506(this.field10398.field1882)).booleanValue()) break block11;
                Class5512.method21666().method21353((class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method21579(net.minecraft.util.math.Direction int ), (I)Lnet/minecraft/class_2596;)((Class5512)this, (class_2350)a));
                Class5512.method21529(Class5723.field11048, (class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method21670(net.minecraft.util.math.Direction int ), (I)Lnet/minecraft/class_2596;)((Class5512)this, (class_2350)a));
                if (this.field10398.field1893 == null) ** GOTO lbl-1000
                if (!Class5512.method21535((Class425)this.field10398).field10394) break block12;
                v0 = 60779;
                ** GOTO lbl30
            }
            v0 = 60780;
            if (true) ** GOTO lbl30
            block4: while (true) {
                v0 = 60778;
lbl30:
                // 3 sources

                switch (v0) {
                    case 60780: {
                        continue block4;
                    }
                    case 60779: lbl-1000:
                    // 2 sources

                    {
                        this.field10398.field1893 = new Class5512(Class5512.method21622(this), this.field10395, this.field10392, 1.0);
                        this.field10398.field1893.field10400 = (int)Class5512.field10402[0];
                    }
                }
                break;
            }
        }
        Class5512.method21536((Class480)Class5512.method21557((Class5512)this).field1909.method507(), class_1268.field_5808);
        this.field10400 = (int)Class5512.field10402[0];
    }

    public static void method21551(Class5512 class5512, int n2) {
        class5512.field10404 = n2;
    }

    private static void method21552() {
        Class4146.method20697();
    }

    public static class_638 method21553(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class5496 method21554() {
        return Class5723.field11048;
    }

    private static void method21555() {
        Class4146.method20697();
    }

    public static class_638 method21556(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class425 method21557(Class5512 class5512) {
        return class5512.field10398;
    }

    public static Class5496 method21558() {
        return Class5723.field11048;
    }

    private static class_1799 method21559(Class425 class425) {
        return class425.method8356();
    }

    private static float method21560(float f2, float f3, float f4) {
        return Class803.method12252(f2, f3, f4);
    }

    public static class_1268 method21561() {
        return class_1268.field_5808;
    }

    public static int method21562(Class5512 class5512) {
        return class5512.field10390;
    }

    public static class_310 method21563() {
        return Class244.field290;
    }

    public static class_746 method21564(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class425 method21565(Class5512 class5512) {
        return Class5512.method21632(class5512);
    }

    public static boolean method21566(Class5512 class5512) {
        return class5512.field10394;
    }

    public static Class425 method21567(Class5512 class5512) {
        return class5512.field10398;
    }

    private static void method21568() {
        Class1807.method15744();
    }

    public static class_636 method21569(class_310 class_3102) {
        return class_3102.field_1761;
    }

    public static class_746 method21570(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class425 method21571(Class5512 class5512) {
        return class5512.field10398;
    }

    private class_2596 method21572(class_2350 a2, int b2) {
        return new class_2846(class_2846.class_2847.field_12968, this.field10395, a2, b2);
    }

    private static void method21573(Class5512 class5512, double d2) {
        Class5512.method21585(class5512, d2);
    }

    private static void method21574() {
        Class5836.method22897();
    }

    private static void method21575() {
        Class1745.method15538();
    }

    public static void method21576(Class5512 class5512, int n2) {
        class5512.field10391 = n2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method21577() {
        block20: {
            block19: {
                if (this.field10394) {
                    v0 = 3798;
                    return Class447.method10252();
                }
                v1 = 3799;
                if (true) ** GOTO lbl8
                while (true) {
                    v1 = var1_1 = 3797;
lbl8:
                    // 2 sources

                    if (var1_1 == 3798) break;
                    if (var1_1 == 3799) {
                        continue;
                    }
                    break block19;
                    break;
                }
                return (boolean)((int)Class5512.field10402[0]);
            }
            if (!(this.field10393 >= 1.0)) break block20;
            v2 = 31116;
            ** GOTO lbl22
        }
        v2 = 31117;
        if (true) ** GOTO lbl22
        block9: while (true) {
            v2 = 31115;
lbl22:
            // 3 sources

            switch (v2) {
                case 31117: {
                    continue block9;
                }
                case 31116: {
                    if (this.field10399 == (int)Class5512.field10402[2]) ** GOTO lbl-1000
                    if (!Class5512.method21571(this).method8356().equals(this.field10397)) ** GOTO lbl30
                    v3 = 16590;
                    ** GOTO lbl34
lbl30:
                    // 1 sources

                    v3 = 16591;
                    if (true) ** GOTO lbl34
                    block10: while (true) {
                        v3 = 16589;
lbl34:
                        // 3 sources

                        switch (v3) {
                            case 16591: {
                                continue block10;
                            }
                            case 16590: lbl-1000:
                            // 2 sources

                            {
                                this.field10396 += (int)Class5512.field10402[0];
                                if (Class5512.method21640(this) <= (Integer)Class5512.method21638(this.field10398).method507()) {
                                    return Class803.method12224(0.4482206731291063, 0.8499779663248302, 0.6131575830024367, 0.5224113480449375, 0.22474101371399202, Class3226.field6921);
                                }
                                return (boolean)((int)Class5512.field10402[0]);
                            }
                        }
                        break;
                    }
                    if (!((Boolean)this.field10398.field1901.method507()).booleanValue() || this.field10398.field1902 != null) break block9;
                    if (!((Boolean)this.field10398.field1889.method507()).booleanValue()) ** GOTO lbl47
                    if (Class5512.method21564(Class244.field290).method_24828()) {
                        return Class5649.method22085(0.5289781741039277, 0.8591342444355033, 0.8404886311195731, Class6396.field13246, 0.6598482726481876, Class3342.field7220);
                    }
                    if (!(Class244.field290.field_1687.method_8320(Class5512.method21563().field_1724.method_24515()).method_26204() instanceof class_2399)) ** GOTO lbl52
lbl47:
                    // 2 sources

                    if (!((Boolean)this.field10398.field1904.method507()).booleanValue()) ** GOTO lbl49
                    if (Class244.field290.field_1724.method_6128()) ** GOTO lbl52
lbl49:
                    // 2 sources

                    if (!((Boolean)this.field10398.field1915.method507()).booleanValue()) ** GOTO lbl51
                    if (Class244.field290.field_1724.method_52535()) ** GOTO lbl52
lbl51:
                    // 2 sources

                    if (!Class244.field290.field_1724.method_6115() && !Class376.method4987() && !Class5512.method21652((Class246)this.field10398.field1895.method507()) && !Class404.method6279().method6306()) ** GOTO lbl53
lbl52:
                    // 4 sources

                    return (boolean)((int)Class5512.field10402[1]);
lbl53:
                    // 1 sources

                    a = ((Class607)Class5512.method21595(this.field10398).method507()).method11279();
                    b = Class5723.field11058.method18969();
                    c = this.field10399;
                    a.method11126(c, b);
                    d = this.field10390;
                    this.field10398.field1902 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, method21636(int mapped.Class580 int int ), ()V)((Class5512)this, (int)d, (Class580)a, (int)c, (int)b);
                    this.field10398.field1922 = (int)Class5512.field10402[0];
                    this.field10396 += (int)Class5512.field10402[0];
                    return (boolean)(this.field10396 > (Integer)this.field10398.field1912.method507() ? (int)Class5512.field10402[0] : (int)Class5512.field10402[1]);
                }
            }
            break;
        }
        this.field10396 = (int)Class5512.field10402[1];
        return (boolean)((int)Class5512.field10402[1]);
    }

    private static float method21578() {
        return Class6322.method24324();
    }

    private class_2596 method21579(class_2350 a2, int b2) {
        return new class_2846(class_2846.class_2847.field_12973, this.field10395, a2, b2);
    }

    private static void method21580() {
        Class6454.method24594();
    }

    private static float method21581() {
        return Class6322.method24324();
    }

    public static class_746 method21582(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class425 method21583(Class5512 class5512) {
        return class5512.field10398;
    }

    private static class_310 method21584() {
        return Class5512.method21642();
    }

    public static void method21585(Class5512 class5512, double d2) {
        class5512.field10393 = d2;
    }

    private static Class425 method21586(Class5512 class5512) {
        return Class5512.method21541(class5512);
    }

    private static void method21587(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    private static float method21588(Class5512 class5512, class_2680 class_26802, class_1799 class_17992) {
        return class5512.method21641(class_26802, class_17992);
    }

    private static boolean method21589() {
        return Class376.method4987();
    }

    private static void method21590() {
        Class1503.method14420();
    }

    public static class_2338 method21591(Class5512 class5512) {
        return class5512.field10395;
    }

    private static Class425 method21592(Class5512 class5512) {
        return Class5512.method21615(class5512);
    }

    public static Class248 method21593(Class425 class425) {
        return class425.field1878;
    }

    private static void method21594(class_2338 class_23382, class_2350 class_23502) {
        Class1503.method14412(class_23382, class_23502);
    }

    public static Class248 method21595(Class425 class425) {
        return class425.field1903;
    }

    public static Class425 method21596(Class5512 class5512) {
        return class5512.field10398;
    }

    private static Object method21597(Class248 class248) {
        return class248.method507();
    }

    private static Object method21598(Class248 class248) {
        return class248.method507();
    }

    private static Object method21599(Class248 class248) {
        return class248.method507();
    }

    private static boolean method21600(Class425 class425) {
        return class425.method8432();
    }

    private static void method21601() {
        Class1807.method15744();
    }

    private static void method21602() {
        Class6009.method23560();
    }

    private static void method21603(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method21604() {
        Class4146.method20694();
    }

    public static class_746 method21605(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class425 method21606(Class5512 class5512) {
        return class5512.field10398;
    }

    public static void method21607(Class5512 class5512, class_1799 class_17992) {
        class5512.field10397 = class_17992;
    }

    private static Object method21608(Class248 class248) {
        return class248.method507();
    }

    public int method21609(class_2680 d2) {
        int e2 = (int)field10402[2];
        float f2 = 1.0f;
        for (class_1735 c2 : Class244.field290.field_1724.field_7512.field_7761) {
            class_1799 a2 = c2.method_7677();
            float b2 = this.method21641(d2, a2);
            if (!(b2 >= f2)) continue;
            Class5512.method21607(this, a2);
            f2 = b2;
            e2 = c2.field_7874;
        }
        return e2;
    }

    private static Class425 method21610(Class5512 class5512) {
        return Class5512.method21583(class5512);
    }

    private static int method21611(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static Class248 method21612(Class425 class425) {
        return class425.field1910;
    }

    private static Object method21613(Class248 class248) {
        return class248.method507();
    }

    private static Object method21614(Class248 class248) {
        return class248.method507();
    }

    public static Class425 method21615(Class5512 class5512) {
        return class5512.field10398;
    }

    private void method21616(int a2, Class580 b2, int c2, int d2) {
        block5: {
            block4: {
                if (Class5512.method21567((Class5512)this).field1918 == null || Class5512.method21589() || Class404.method6279().method6306() || ((Class246)this.field10398.field1895.method507()).field295 || Class244.field290.field_1687.method_22347(this.field10395) && this.field10404 >= (Integer)Class5512.method21508(this.field10398).method507()) break block4;
                if (!Class5595.method21942(this.field10395) && !Class5512.method21501((Class5512)this).field1920 && Class1745.method15561(Class5512.method21656(this), (Double)Class5512.method21686((Class5512)this).field1898.method507()) != null) break block5;
            }
            if (Class5512.method21606((Class5512)this).field1903.method507() != Class607.field2954 || a2 == Class5512.method21582((class_310)Class244.field290).field_7512.field_7763) {
                b2.method11125(c2, d2);
                Class5512.method21689(this.field10398, null);
            }
        }
    }

    private static void method21617() {
        Class5836.method22885();
    }

    public static Class425 method21618(Class5512 class5512) {
        return class5512.field10398;
    }

    public static class_2680 method21619(Class5512 class5512) {
        return class5512.field10403;
    }

    public static Class248 method21620(Class425 class425) {
        return class425.field1877;
    }

    public static boolean method21621(Class5512 class5512) {
        return class5512.field10394;
    }

    public static Class425 method21622(Class5512 class5512) {
        return class5512.field10398;
    }

    public static void method21623(Class425 class425, Runnable runnable) {
        class425.field1902 = runnable;
    }

    public static Class425 method21624(Class5512 class5512) {
        return class5512.field10398;
    }

    private static Object method21625(Class248 class248) {
        return class248.method507();
    }

    private static void method21626(Class5512 class5512) {
        class5512.method21550();
    }

    public static void method21627(Class425 class425, boolean bl2) {
        class425.field1920 = bl2;
    }

    private static void method21628() {
        Class1745.method15538();
    }

    static {
        Class5512.method21507(5870578149983273377L);
    }

    private static float method21629() {
        return Class6322.method24325();
    }

    public static void method21630(Class425 class425, boolean bl2) {
        class425.field1920 = bl2;
    }

    private static void method21631(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class425 method21632(Class5512 class5512) {
        return class5512.field10398;
    }

    private static Object method21633(Class248 class248) {
        return class248.method507();
    }

    public static void method21634(Class5512 class5512, int n2) {
        class5512.field10391 = n2;
    }

    public static class_2338 method21635(Class5512 class5512) {
        return class5512.field10395;
    }

    private void method21636(int a2, Class580 b2, int c2, int d2) {
        if (Class376.method4987() || this.field10398.field1920 || Class5512.method21621(this) || Class5512.method21646().method6306()) {
            if (Class5512.method21599(Class5512.method21651(this.field10398)) != Class607.field2954 || a2 == Class5512.method21605((class_310)Class244.field290).field_7512.field_7763) {
                b2.method11125(c2, d2);
                Class5512.method21623(this.field10398, null);
            }
        }
    }

    private static boolean method21637(Class5512 class5512) {
        return Class5512.method21566(class5512);
    }

    public static Class248 method21638(Class425 class425) {
        return class425.field1912;
    }

    public static Class425 method21639(Class5512 class5512) {
        return class5512.field10398;
    }

    public static int method21640(Class5512 class5512) {
        return class5512.field10396;
    }

    public float method21641(class_2680 c2, class_1799 d2) {
        if (!d2.method_7960()) {
            if (d2.method_7951(c2)) {
                int a2 = Class1308.method13621(d2, class_1893.field_9131);
                float b2 = d2.method_7924(c2);
                return (float)(b2 > 1.0f ? a2 : (int)field10402[1]) + b2;
            }
        }
        return 0.0f;
    }

    public static class_310 method21642() {
        return Class244.field290;
    }

    public int method21643(class_2680 d2) {
        int e2 = (int)field10402[2];
        float f2 = 1.0f;
        int c2 = (int)field10402[1];
        if (c2 < (int)field10402[6]) {
            class_1799 a2 = Class244.field290.field_1724.method_31548().method_5438(c2);
            float b2 = this.method21641(d2, a2);
            if (b2 >= f2) {
                Class5512.method21509(this, a2);
                f2 = b2;
                e2 = c2;
            }
            ++c2;
            return Class5550.method21885();
        }
        return e2;
    }

    public static class_636 method21644(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static boolean method21645() {
        return Class3979.method19551();
    }

    private static Class404 method21646() {
        return Class404.method6279();
    }

    private static void method21647() {
        Class6454.method24594();
    }

    public void method21648() {
        block20: {
            block21: {
                if (!Class5512.method21665(this).method8402(Class244.field290.field_1687.method_8320(Class5512.method21635(this)).method_26204())) {
                    return;
                }
                class_2350 e2 = Class1745.method15561(this.field10395, (Double)this.field10398.field1898.method507());
                if (e2 == null) {
                    return;
                }
                int f2 = this.field10399;
                if (f2 != (int)field10402[2]) {
                    if (Class5512.method21559(this.field10398).equals(this.field10397)) {
                        this.field10404 = (int)field10402[1];
                        if (((Boolean)Class5512.method21613(this.field10398.field1877)).booleanValue()) {
                            Class1503.method14412(this.field10395, e2);
                        }
                        this.field10396 = Class5512.method21512(this) + (int)field10402[0];
                        this.field10398.field1876 = System.currentTimeMillis();
                        Class5512.method21554().method21353(arg_0 -> this.method21547(e2, arg_0));
                        ((Class480)((Object)Class5512.method21542(Class5512.method21677(Class5512.method21624(this))))).method10782(class_1268.field_5808);
                        Class5512.method21688().method12593();
                        Class425.field1886.add(this.field10395);
                        if (!this.field10398.field1922 && this.field10398.field1902 != null) {
                            Class5512.method21539((Class5512)this).field1902.run();
                        }
                    } else {
                        if (this.field10398.field1902 != null) {
                            Class5512.method21630(Class5512.method21596(this), (boolean)field10402[0]);
                            Class5512.method21524((Class5512)this).field1902.run();
                            Class5512.method21627(this.field10398, (boolean)field10402[1]);
                        }
                        Class580 c2 = ((Class607)((Object)Class5512.method21597(Class5512.method21610((Class5512)this).field1903))).method11279();
                        int d2 = Class5723.field11058.method18969();
                        if (((Boolean)this.field10398.field1906.method507()).booleanValue()) {
                            if (!((Boolean)Class5512.method21598(this.field10398.field1897)).booleanValue()) {
                                boolean b2 = Class5512.method21683().method6306();
                                if (!b2) {
                                    c2.method11126(f2, d2);
                                    int a2 = Class5512.method21562(this);
                                    Class5512.method21551(this, (int)field10402[1]);
                                    this.field10398.field1902 = () -> this.method21616(a2, c2, f2, d2);
                                    this.field10398.field1922 = (int)field10402[1];
                                }
                                if (this.field10397 != null && this.field10397.equals(Class5512.method21659((Class5512)this).field1887)) {
                                    this.field10396 += (int)field10402[0];
                                    Class5512.method21565((Class5512)this).field1876 = System.currentTimeMillis();
                                    Class5512.method21587(Class5723.field11048, arg_0 -> this.method21664(e2, arg_0));
                                }
                            }
                        } else {
                            Class5512.method21532(this, (int)field10402[1]);
                            c2.method11126(f2, d2);
                            if (((Boolean)Class5512.method21620(this.field10398).method507()).booleanValue()) {
                                Class1503.method14412(this.field10395, e2);
                            }
                            this.field10396 += (int)field10402[0];
                            this.field10398.field1876 = System.currentTimeMillis();
                            Class5512.method21558().method21353(arg_0 -> this.method21525(e2, arg_0));
                            c2.method11125(f2, d2);
                            ((Class480)((Object)this.field10398.field1909.method507())).method10782(Class5512.method21561());
                            Class5512.method21667().method12593();
                            Class425.field1886.add(this.field10395);
                        }
                    }
                } else {
                    if (((Boolean)this.field10398.field1877.method507()).booleanValue()) {
                        Class5512.method21594(this.field10395, e2);
                    }
                    this.field10396 += (int)field10402[0];
                    this.field10398.field1876 = System.currentTimeMillis();
                    Class5723.field11048.method21353(arg_0 -> this.method21494(e2, arg_0));
                    Class5512.method21523((Class480)((Object)this.field10398.field1909.method507()), class_1268.field_5808);
                }
                if (this.field10396 <= (Integer)this.field10398.field1874.method507()) break block20;
                if (!((Boolean)Class5512.method21608(this.field10398.field1929)).booleanValue()) break block21;
                if (Class5512.method21637(this)) break block20;
            }
            this.field10400 = (int)field10402[1];
            Class5512.method21634(this, (int)field10402[1]);
            this.field10396 = (int)field10402[1];
            this.field10393 = 0.0;
        }
    }

    float method21649(class_2680 b2, class_1922 c2, class_2338 d2, boolean e2) {
        float f2 = b2.method_26214(c2, d2);
        if (f2 == -1.0f) {
            return 0.0f;
        }
        int a2 = this.method21650(b2) ? (int)field10402[3] : (int)field10402[4];
        return this.method21504(b2, e2) / f2 / (float)a2;
    }

    private boolean method21650(class_2680 a2) {
        if (a2.method_29291()) {
            return Class5512.method21497(this).method_7951(a2);
        }
        return (int)field10402[0] != 0;
    }

    public static Class248 method21651(Class425 class425) {
        return class425.field1903;
    }

    public static boolean method21652(Class246 class246) {
        return class246.field295;
    }

    private static void method21653(Class5512 class5512, int n2) {
        Class5512.method21576(class5512, n2);
    }

    private static boolean method21654(class_2338 class_23382) {
        return Class5595.method21942(class_23382);
    }

    private static int method21655() {
        return Class6454.method24637();
    }

    private static class_2338 method21656(Class5512 class5512) {
        return Class5512.method21514(class5512);
    }

    public static class_2846.class_2847 method21657() {
        return class_2846.class_2847.field_12973;
    }

    public static class_2338 method21658(Class5512 class5512) {
        return class5512.field10395;
    }

    public static Class425 method21659(Class5512 class5512) {
        return class5512.field10398;
    }

    private static int method21660(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method21661() {
        Class4146.method20694();
    }

    private static int method21662(int n2, int n3, Class760 class760, Class2297 class2297) {
        return Class5628.method22033(n2, n3, class760, class2297);
    }

    public static double method21663(Class5512 class5512) {
        return class5512.field10393;
    }

    private class_2596 method21664(class_2350 a2, int b2) {
        if (((Class610)((Object)this.field10398.field1884.method507())).method11295()) {
            Class5512.method21644(Class244.field290).method_2899(this.field10395);
        }
        return new class_2846(class_2846.class_2847.field_12973, Class5512.method21658(this), a2, b2);
    }

    public static Class425 method21665(Class5512 class5512) {
        return class5512.field10398;
    }

    public static Class5496 method21666() {
        return Class5723.field11048;
    }

    public static Class926 method21667() {
        return Class425.field1883;
    }

    public static class_2846.class_2847 method21668() {
        return class_2846.class_2847.field_12973;
    }

    public static class_310 method21669() {
        return Class244.field290;
    }

    private class_2596 method21670(class_2350 a2, int b2) {
        return new class_2846(Class5512.method21685(), this.field10395, a2, b2);
    }

    public static int method21671(Class5512 class5512) {
        return class5512.field10391;
    }

    private class_2596 method21672(class_2350 a2, int b2) {
        return new class_2846(Class5512.method21668(), this.field10395, a2, b2);
    }

    private static void method21673() {
        Class1745.method15538();
    }

    public static Class248 method21674(Class425 class425) {
        return class425.field1904;
    }

    /*
     * Unable to fully structure code
     */
    public void method21675() {
        block16: {
            block15: {
                v0 = this;
                Class5512.method21653(v0, Class5512.method21671(v0) + (int)Class5512.field10402[0]);
                this.field10405 = this.field10393;
                this.field10397 = null;
                this.field10403 = Class5512.method21553(Class244.field290).method_8320(this.field10395);
                if (!this.field10403.method_26215()) break block15;
                v1 = 37072;
                ** GOTO lbl14
            }
            v1 = 37073;
            if (true) ** GOTO lbl14
            block9: while (true) {
                v1 = 37071;
lbl14:
                // 3 sources

                switch (v1) {
                    case 37073: {
                        continue block9;
                    }
                    case 37072: {
                        this.field10396 = (int)Class5512.field10402[1];
                        if (this.field10401) break block9;
                        if (!((Boolean)Class5512.method21625(this.field10398.field1929)).booleanValue()) {
                            this.field10400 = (int)Class5512.field10402[1];
                            this.field10393 = 0.0;
                            this.field10405 = 0.0;
                            this.field10391 = (int)Class5512.field10402[1];
                        }
                        this.field10394 = (int)Class5512.field10402[0];
                    }
                }
                break;
            }
            break block16;
lbl27:
            // 1 sources

            while (true) {
                Class6454.method24636(Class1182.field4689, 0.005259515879448284, 0.24825331258086858, 0.48060011888451604);
                return;
            }
        }
        switch (Class3927.field8937[((Class607)Class5512.method21614(this.field10398.field1903)).ordinal()] ^ -630382735) {
            default: {
                ** continue;
            }
            case -630382736: {
                Class5512.method21661();
                return;
            }
            case -630382734: {
                break;
            }
            case -630382733: {
                this.field10399 = this.method21496(this.field10403);
                Class5836.method22907(Class5890.field11650);
                return;
            }
        }
        this.field10399 = Class5512.method21513(this, this.field10403);
        this.field10390 = Class5512.method21540((class_310)Class5512.method21549()).field_7512.field_7763;
        if (this.field10397 == null) {
            this.field10397 = this.field10398.method8356();
        }
        if (this.field10400 && !this.field10403.method_26215() && !Class5595.method21931(this.field10403)) {
            a = (double)this.method21649(this.field10403, (class_1922)Class5512.method21556(Class244.field290), this.field10395, (boolean)Class5512.field10402[0]) / this.field10389;
            this.field10393 += a;
            this.field10393 = Math.min(1.0, this.field10393);
            b = (double)this.method21649(this.field10403, (class_1922)Class5512.method21669().field_1687, this.field10395, (boolean)Class5512.field10402[1]) / this.field10389 * (double)this.field10391;
            if (b < Class5512.method21663(this) || this.field10401) {
                Class5512.method21573(this, b);
                this.field10401 = (int)Class5512.field10402[1];
            }
        }
    }

    private static void method21676() {
        Class5836.method22897();
    }

    public static Class248 method21677(Class425 class425) {
        return class425.field1909;
    }

    private static void method21678() {
        Class4146.method20694();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method21679() {
        block18: {
            int n2;
            block19: {
                block17: {
                    block16: {
                        block14: {
                            block15: {
                                block13: {
                                    if (Class376.method4987()) break block13;
                                    if (!((Boolean)Class5512.method21684(this.field10398.field1889)).booleanValue()) break block14;
                                    break block15;
                                }
                                if (this.field10400) {
                                    this.method21675();
                                }
                                return;
                            }
                            if (!Class5512.method21505(Class5512.method21533()).method_24828() && !(Class5512.method21515().field_1687.method_8320(Class5512.method21511().field_1724.method_24515()).method_26204() instanceof class_2399)) break block16;
                        }
                        if (((Boolean)Class5512.method21674(this.field10398).method507()).booleanValue() && Class244.field290.field_1724.method_6128()) {
                            Class1108.method12918(true);
                            return;
                        }
                        if (!((Boolean)Class5512.method21521(this.field10398.field1915) != false && Class244.field290.field_1724.method_52535() || (Boolean)Class425.method8451(this.field10398).method507() == false && this.field10398.method6626()) && !((Class246)Class5512.method21586((Class5512)this).field1895.method507()).field295) break block17;
                    }
                    if (Class5512.method21493(this)) break block18;
                    n2 = !Class5512.method21600(this.field10398) ? 57784 : 57785;
                    break block19;
                }
                if (!this.field10400 && !this.field10398.method8432()) {
                    Class5512.method21626(this);
                }
                if (this.field10400) {
                    this.method21675();
                }
                if (this.field10393 >= 1.0) {
                    if (Class5512.method21654(this.field10395)) {
                        Class5512.method21647();
                        return;
                    }
                    if (!Class5512.method21584().field_1687.method_22347(Class5512.method21591(this)) && (Class436.method9338().method9315() != null && !this.field10395.equals((Object)Class436.method9338().method9315()) || Class436.method9338().method9315() == null)) {
                        this.method21648();
                    }
                }
                this.field10404 += (int)field10402[0];
                return;
            }
            block4: while (true) {
                switch (n2) {
                    case 57785: {
                        n2 = 57783;
                        continue block4;
                    }
                    case 57784: {
                        if (((Boolean)this.field10398.field1873.method507()).booleanValue()) break block4;
                        this.method21550();
                        break block4;
                    }
                }
                break;
            }
        }
        if (Class5512.method21548(this)) {
            this.method21675();
        }
    }

    private static int method21680() {
        return Class5659.method22101();
    }

    private static float method21681(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    private static Object method21682(Class248 class248) {
        return class248.method507();
    }

    private static Class404 method21683() {
        return Class404.method6279();
    }

    private static Object method21684(Class248 class248) {
        return class248.method507();
    }

    public static class_2846.class_2847 method21685() {
        return class_2846.class_2847.field_12968;
    }

    public static Class425 method21686(Class5512 class5512) {
        return class5512.field10398;
    }

    public static class_1799 method21687(Class5512 class5512) {
        return class5512.field10397;
    }

    public static Class926 method21688() {
        return Class425.field1883;
    }

    private static void method21689(Class425 class425, Runnable runnable) {
        Class5512.method21517(class425, runnable);
    }

    public static class_638 method21690(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

