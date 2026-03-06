/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class260;
import mapped.Class278;
import mapped.Class280;
import mapped.Class305;
import mapped.Class3635;
import mapped.Class3689;
import mapped.Class475;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5880;
import mapped.Class6023;
import mapped.Class63;
import net.hachimi.client.mixin.bH;
import net.minecraft.world.World;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class336
extends Class278 {
    Class248 field874 = this.method450(new Class260("Mode", "The mode to prevent fall damage", Class475.field2487, Class336.method3096()));
    private double field875;
    private static long[] field876 = new long[2];

    private static double method3091(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)this.field874.method507());
    }

    @Class1
    public void method3092(Class63 a2) {
        if (a2.method128() != Class336.method3103() || !this.method3113()) {
            return;
        }
        if (this.field874.method507() == Class475.field2482) {
            if (Class336.field290.field_1687.method_27983() == class_1937.field_25180) {
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(Class336.field290.field_1724.method_23317(), 0.0, Class336.field290.field_1724.method_23321(), (boolean)field876[0]));
            } else {
                Class336.method3116(Class5723.field11048, (class_2596)new class_2828.class_2829(0.0, 64.0, 0.0, (boolean)field876[0]));
            }
            Class336.field290.field_1724.method_38785();
        } else if (Class336.method3117(this).method507() == Class475.field2485) {
            Class5723.field11048.method21341((class_2596)new class_2828.class_2830(Class336.field290.field_1724.method_23317(), Class336.field290.field_1724.method_23318() + 1.0E-9, Class336.method3109(field290).method_23321(), Class336.method3105(field290).method_36454(), Class336.field290.field_1724.method_36455(), (boolean)field876[1]));
            Class336.field290.field_1724.method_38785();
        }
    }

    public Class336() {
        super("NoFall", "Prevents all fall damage", Class556.field2752);
    }

    private static Class248 method3093(Class336 class336) {
        return Class336.method3110(class336);
    }

    public static class_746 method3094(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public double method3095() {
        int c2 = (int)Math.round(Class336.field290.field_1724.method_23318());
        if (c2 > 0) {
            return Class5659.method22181(0.2367940881087608, 0.8543638460047444, Class5880.field11627, Class3635.field8122, 0.9973868349352502, 0.3089315206604457);
        }
        int n2 = 20310;
        int n3 = n2;
        if (n3 == 20309) return Class336.method3091(0.7789209246206323, 0.182440870147778, 0.4709768262616122);
        if (n3 == 20310) return 0.0;
        return 0.0;
    }

    private static Class475[] method3096() {
        return Class475.values();
    }

    public static Class475 method3097() {
        return Class475.field2481;
    }

    @Class1
    public void method3098(Class131 c2) {
        if (Class336.field290.field_1724 == null || !Class336.method3115(this)) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_2828) {
            class_2828 b2 = (class_2828)class_25962;
            if (this.field874.method507() == Class336.method3097()) {
                ((bH)b2).hookSetOnGround((boolean)field876[0]);
            } else if (Class336.method3114(Class336.method3093(this)) == Class475.field2487) {
                double a2 = b2.method_12268(Class336.field290.field_1724.method_23318());
                ((bH)b2).hookSetY(a2 + (double)0.1f);
            } else if (this.field874.method507() == Class475.field2486 && this.method3099() && Class336.field290.field_1724.field_6017 >= 3.0f) {
                Class5723.field11052.method14002(0.0);
                ((bH)b2).hookSetY(Class336.method3108(this));
                Class336.field290.field_1724.field_6017 = 0.0f;
            }
        }
    }

    public boolean method3099() {
        Class336.method3107(this, this.method3095() - Class3689.field8283);
        return (Class336.method3094(field290).method_23318() - this.field875 < 3.0 ? (int)field876[0] : (int)field876[1]) != 0;
    }

    private static boolean method3100() {
        return Class1807.method15769();
    }

    private static double method3101(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5659.method22181(d2, d3, d4, d5, d6, d7);
    }

    private static void method3102(long l2) {
        Class336.field876[0] = l2 ^ 0xFB574AF48F4E3380L;
        Class336.field876[1] = l2 ^ 0xFB574AF48F4E3381L;
    }

    public static Class543 method3103() {
        return Class543.field2690;
    }

    private static boolean method3104(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static class_746 method3105(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method3106(class_238 class_2383) {
        return class_2383.field_1323;
    }

    public static void method3107(Class336 class336, double d2) {
        class336.field875 = d2;
    }

    public static double method3108(Class336 class336) {
        return class336.field875;
    }

    public static class_746 method3109(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method3110(Class336 class336) {
        return class336.field874;
    }

    private static Class305 method3111() {
        return Class305.method2203();
    }

    static {
        Class336.method3102(-335717232979070079L);
    }

    private static double method3112(class_238 class_2383) {
        return Class336.method3106(class_2383);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method3113() {
        int n2;
        if (!(!(Class336.field290.field_1724.field_6017 > (float)Class336.field290.field_1724.method_5850()) || Class336.field290.field_1724.method_24828() || Class336.field290.field_1724.method_6128() || Class280.method1355().method1265() || Class336.method3111().method1265())) {
            n2 = (int)field876[0];
            return n2 != 0;
        }
        n2 = (int)field876[1];
        return n2 != 0;
    }

    private static Object method3114(Class248 class248) {
        return class248.method507();
    }

    private static boolean method3115(Class336 class336) {
        return class336.method3113();
    }

    private static void method3116(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static Class248 method3117(Class336 class336) {
        return class336.field874;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

