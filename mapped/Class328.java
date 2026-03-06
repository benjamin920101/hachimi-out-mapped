/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.LlamaEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.AbstractBlock$AbstractBlockState
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class109;
import mapped.Class11;
import mapped.Class131;
import mapped.Class1442;
import mapped.Class1503;
import mapped.Class1635;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class2298;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3347;
import mapped.Class376;
import mapped.Class3850;
import mapped.Class390;
import mapped.Class3920;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class575;
import mapped.Class5835;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6078;
import mapped.Class62;
import mapped.Class6322;
import mapped.Class6373;
import mapped.Class6454;
import mapped.Class803;
import net.hachimi.client.mixin.bH;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class328
extends Class278 {
    private int field788;
    Class248 field789;
    Class248 field790;
    private boolean field791;
    Class248 field792 = this.method450(new Class252("Speed", "The horizontal flight speed", Float.valueOf(0.1f), Float.valueOf(2.5f), Float.valueOf(Class5835.field11390)));
    private static long[] field793 = new long[3];
    private double field794;
    Class248 field795;
    Class248 field796;
    private boolean field797;
    Class248 field798;
    Class248 field799;
    private double field800;

    private boolean method2835(class_2833 a2, class_1297 b2) {
        double c2 = class_3532.method_15350((double)a2.method_12280(), (double)-2.0E7, (double)2.0E7);
        double d2 = c2 - this.field800;
        if (d2 >= Class6373.field13176) {
            while (true) {
                // Infinite loop
            }
        }
        return (int)field793[0] != 0;
    }

    private static boolean method2836(Class390 class390) {
        return class390.method5533();
    }

    private static void method2837() {
        Class5836.method22890();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2838(Class62 b) {
        block14: {
            block18: {
                block17: {
                    block13: {
                        block16: {
                            block12: {
                                block15: {
                                    if (Class328.method2862(Class328.field290).method_5854() == null || Class328.method2836(Class390.method5496())) {
                                        return;
                                    }
                                    c = Class328.field290.field_1724.method_5854();
                                    if (!((Boolean)this.field798.method507()).booleanValue()) {
                                        Class5836.method22885();
                                        return;
                                    }
                                    if (!Class1807.method15742() || c.field_5976) {
                                        this.field794 = 0.0;
                                    }
                                    v0 = this;
                                    Class328.method2839(v0, Class328.method2842(v0) + (double)((Float)this.field796.method507()).floatValue());
                                    if (this.field794 > (double)((Float)this.field795.method507()).floatValue()) {
                                        this.field794 = ((Float)Class328.method2860(Class328.method2847(this))).floatValue();
                                    }
                                    c.method_36456(Class328.field290.field_1724.method_36454());
                                    if (c instanceof class_1501) {
                                        a = (class_1501)c;
                                        a.field_6241 = Class328.field290.field_1724.method_36454();
                                    }
                                    d = (int)Class328.field793[0];
                                    if (!Class328.method2870(this)) break block14;
                                    this.field788 += (int)Class328.field793[1];
                                    if (this.field788 < (int)Class328.field793[2]) break block15;
                                    v1 = 15149;
                                    ** GOTO lbl28
                                }
                                v1 = 15150;
                                if (true) ** GOTO lbl28
                                do {
                                    v1 = var4_5 = 15148;
lbl28:
                                    // 3 sources

                                    if (var4_5 == 15149) break block12;
                                } while (var4_5 == 15150);
                                break block14;
                            }
                            if (Class328.method2873(Class328.method2863(this)) != Class575.field2814) break block16;
                            v2 = 37525;
                            ** GOTO lbl40
                        }
                        v2 = 37526;
                        if (true) ** GOTO lbl40
                        do {
                            v2 = var5_6 = 37524;
lbl40:
                            // 3 sources

                            if (var5_6 == 37525) break block13;
                        } while (var5_6 == 37526);
                        break block17;
                    }
                    Class328.method2875(this, (boolean)Class328.field793[1]);
                    break block18;
                }
                if (this.field789.method507() == Class328.method2867()) {
                    c.method_5814(c.method_23317(), c.method_23318() - 0.0313, c.method_23321());
                }
            }
            this.field788 = (int)Class328.field793[0];
            this.field797 = (int)Class328.field793[0];
            d = (int)Class328.field793[1];
        }
        c.method_18800(c.method_18798().field_1352, 0.0, c.method_18798().field_1350);
        if (Class328.field290.field_1690.field_1903.method_1434() && d == 0) {
            c.method_18800(c.method_18798().field_1352, (double)((Float)this.field790.method507()).floatValue(), c.method_18798().field_1350);
        } else if (Class328.field290.field_1690.field_1832.method_1434()) {
            c.method_18800(Class328.method2888(c.method_18798()), (double)(-((Float)Class328.method2871(this).method507()).floatValue()), c.method_18798().field_1350);
        }
        this.field794 = Math.max(this.field794, 0.2872999906539917);
        e = Class328.method2850(Class328.field290.field_1724.field_3913);
        f = Class328.field290.field_1724.field_3913.field_3907;
        g = Class328.method2884(Class328.field290).method_36454();
        if (e == 0.0f && f == 0.0f) {
            return;
        }
        h = Math.cos(Math.toRadians(g + 90.0f));
        i = Math.sin(Math.toRadians(g + Class6078.field12232));
        c.method_18800((double)e * this.field794 * h + (double)f * this.field794 * i, c.method_18798().field_1351, (double)e * Class328.method2885(this) * i - (double)f * this.field794 * h);
        b.method10();
    }

    public static void method2839(Class328 class328, double d2) {
        class328.field794 = d2;
    }

    public static class_746 method2840(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2841() {
        Class5836.method22897();
    }

    public static double method2842(Class328 class328) {
        return class328.field794;
    }

    private static void method2843(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method2844() {
        return Class1807.method15753();
    }

    private static void method2845() {
        Class6454.method24594();
    }

    private static void method2846() {
        Class5836.method22897();
    }

    private static Class248 method2847(Class328 class328) {
        return Class328.method2879(class328);
    }

    private static boolean method2848(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method2849() {
        Class298.method1924();
    }

    public static float method2850(class_744 class_7442) {
        return class_7442.field_3905;
    }

    public static double method2851(class_243 class_2432) {
        return class_2432.field_1352;
    }

    private static void method2852() {
        Class4146.method20694();
    }

    public static Class248 method2853(Class328 class328) {
        return class328.field798;
    }

    private static void method2854(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_2848.class_2849 method2855() {
        return class_2848.class_2849.field_12979;
    }

    private static class_746 method2856(class_310 class_3102) {
        return Class328.method2840(class_3102);
    }

    private static boolean method2857(Class328 class328, class_2833 class_28332, class_1297 class_12972) {
        return class328.method2835(class_28332, class_12972);
    }

    private static boolean method2858() {
        return Class5836.method22894();
    }

    private static void method2859(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public Class328() {
        super("BoatFly", "Allows you fly with entities", Class556.field2752);
        this.field790 = this.method450(new Class252("VerticalSpeed", "The vertical flight speed", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(5.0f)));
        this.field799 = this.method450(new Class253("Remount", "Automatically remounts", (boolean)field793[0]));
        this.field789 = this.method450(new Class260("AntiKick", "Prevents vanilla flight detection", Class575.field2816, Class575.values()));
        this.field798 = this.method450(new Class253("Accelerate", "Accelerate as you fly", (boolean)field793[0]));
        this.field796 = this.method450(new Class252("AccelerateSpeed", "Speed to accelerate as", (Number)Float.valueOf(0.01f), (Number)Float.valueOf(0.2f), (Number)Float.valueOf(1.0f), this::method1269));
        this.field795 = this.method450(new Class252("MaxSpeed", "Max speed to accelerate to", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(5.0f), (Number)Float.valueOf(10.0f), this::method1278));
    }

    private static Object method2860(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2861(Class131 d2) {
        if (Class328.field290.field_1724 == null || Class328.field290.field_1724.method_5854() == null) {
            return;
        }
        class_1297 e2 = Class328.method2856(field290).method_5854();
        class_2596 class_25962 = d2.method251();
        if (class_25962 instanceof class_2833) {
            class_2833 b2 = (class_2833)class_25962;
            int n2 = this.field789.method507() != Class575.field2812 ? 42313 : 42314;
            block4: while (true) {
                switch (n2) {
                    case 42314: {
                        n2 = 42312;
                        continue block4;
                    }
                    case 42313: {
                        double a2 = b2.method_12280();
                        if (!this.field791) {
                            this.field797 = Class328.method2857(this, b2, e2);
                            this.field800 = a2;
                            break block4;
                        }
                        ((bH)b2).hookSetY(Class328.method2890(this) - 0.04);
                        this.field791 = (int)field793[0];
                        break block4;
                    }
                }
                break;
            }
        }
        if ((class_25962 = d2.method251()) instanceof class_2848) {
            class_2848 c2 = (class_2848)class_25962;
            if (c2.method_12365() != Class328.method2855()) {
                Class328.method2886(1393832549, -1722093955, -1963766163, 2138821733);
                return;
            }
            if (Class328.method2889(field290).method_5854() != null && !Class328.field290.field_1724.method_5854().method_24828()) {
                d2.method10();
            }
        }
    }

    public static class_746 method2862(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method2863(Class328 class328) {
        return class328.field789;
    }

    private static void method2864() {
        Class4146.method20694();
    }

    private static int method2865(int n2, int n3, Class1442 class1442, Class575 class575) {
        return Class1635.method14784(n2, n3, class1442, class575);
    }

    @Class1
    public void method2866(Class109 a2) {
        if (Class328.field290.field_1724.method_5854() != null) {
            int n2 = 6656;
            Class5836.method22890();
            return;
        }
        int n3 = 6657;
        Class5836.method22890();
    }

    public static Class575 method2867() {
        return Class575.field2816;
    }

    private static void method2868(long l2) {
        Class328.field793[0] = l2 ^ 0x477324952AAA2FD3L;
        Class328.field793[2] = l2 ^ 0x477324952AAA2FC7L;
        Class328.field793[1] = l2 ^ 0x477324952AAA2FD2L;
    }

    private static void method2869() {
        Class4146.method20694();
    }

    public static boolean method2870(Class328 class328) {
        return class328.field797;
    }

    static {
        Class328.method2868(5148499022099132371L);
    }

    public static Class248 method2871(Class328 class328) {
        return class328.field790;
    }

    @Class1
    public void method2872(Class11 a2) {
        if (Class328.field290.field_1690.field_1832.method_1434()) {
            a2.method10();
        }
    }

    private static Object method2873(Class248 class248) {
        return class248.method507();
    }

    private boolean method2874(class_1297 a2) {
        return a2.method_37908().method_29546(a2.method_5829().method_1014(Class3920.field8915).method_1012(0.0, Class3347.field7239, 0.0)).allMatch(class_4970.class_4971::method_26215);
    }

    public static void method2875(Class328 class328, boolean bl2) {
        class328.field791 = bl2;
    }

    private Boolean method1278() {
        return (Boolean)this.field798.method507();
    }

    private static boolean method2876() {
        return Class3979.method19544();
    }

    private static boolean method2877() {
        return Class376.method4987();
    }

    private static int method2878(int n2, int n3, Class2298 class2298, Class3850 class3850) {
        return Class1635.method14837(n2, n3, class2298, class3850);
    }

    public static Class248 method2879(Class328 class328) {
        return class328.field795;
    }

    private static void method2880(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method2881(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method2882() {
        return Class408.method6431();
    }

    private static void method2883() {
        Class5836.method22890();
    }

    private static class_746 method2884(class_310 class_3102) {
        return Class328.method2891(class_3102);
    }

    @Override
    public void method1274() {
        this.field794 = 0.0;
    }

    @Override
    public void method1279() {
        this.field791 = (int)field793[0];
    }

    public static double method2885(Class328 class328) {
        return class328.field794;
    }

    private static void method2886(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2887(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private Boolean method1269() {
        return (Boolean)Class328.method2892(this).method507();
    }

    private static double method2888(class_243 class_2432) {
        return Class328.method2851(class_2432);
    }

    public static class_746 method2889(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method2890(Class328 class328) {
        return class328.field800;
    }

    public static class_746 method2891(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class248 method2892(Class328 class328) {
        return Class328.method2853(class328);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

