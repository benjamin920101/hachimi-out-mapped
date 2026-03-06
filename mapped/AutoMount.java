/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.DonkeyEntity
 *  net.minecraft.entity.passive.HorseEntity
 *  net.minecraft.entity.passive.MuleEntity
 *  net.minecraft.entity.passive.LlamaEntity
 *  net.minecraft.entity.mob.SkeletonHorseEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class191;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Blink;
import mapped.Class3833;
import mapped.Class4014;
import mapped.Class4196;
import mapped.Class5448;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class606;
import mapped.Class6454;
import mapped.Class789;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.DonkeyEntity;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.passive.MuleEntity;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.entity.mob.SkeletonHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoMount
extends Class278 {
    Class248 field765;
    Class248 field766 = this.method450(new Class252("Range", "The range to mount entities", Float.valueOf(0.1f), Float.valueOf(4.0f), Float.valueOf(Class4014.field9226)));
    Class248 field767;
    Class248 field768 = this.method450(new Class253("ForceMount", "Forces the mounting without packets", (boolean)field769[1]));
    private static long[] field769 = new long[2];
    Class248 field770;
    Class248 field771 = this.method450(new Class253("Horse", "Mounts horses", (boolean)field769[0]));

    public static class_746 method2769(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2770(long l2) {
        AutoMount.field769[0] = l2 ^ 0x36EE7344D1D05B0FL;
        AutoMount.field769[1] = l2 ^ 0x36EE7344D1D05B0EL;
    }

    public static Class248 method2771(AutoMount class324) {
        return class324.field768;
    }

    static {
        AutoMount.method2770(3958227861920307982L);
    }

    private static boolean method2772() {
        return Class5659.method22194();
    }

    private static boolean method2773() {
        return Blink.method4987();
    }

    private static class_638 method2774(class_310 class_3102) {
        return AutoMount.method2785(class_3102);
    }

    @Class1
    public void method2775(Class131 b2) {
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof Class3833) {
            Class3833 a2 = (Class3833)class_25962;
            if (!((Boolean)AutoMount.method2784(AutoMount.method2771(this))).booleanValue()) {
                Class5836.method22885();
                return;
            }
            if (a2.method18777() == Class606.field2950 && this.method2778(a2.method18778())) {
                b2.method10();
            }
        }
    }

    @Class1
    public void method2776(Class210 c2) {
        if (AutoMount.method2769(field290).method_3144()) {
            return;
        }
        for (class_1297 b2 : AutoMount.method2774(field290).method_18112()) {
            double a2 = AutoMount.method2788(field290).method_33571().method_1022(b2.method_19538());
            if (a2 > (double)((Float)this.field766.method507()).floatValue()) continue;
            if (!this.method2778(b2)) continue;
            AutoMount.method2790(field290).method_2905((class_1657)AutoMount.field290.field_1724, b2, AutoMount.method2777());
            return;
        }
    }

    public static class_1268 method2777() {
        return class_1268.field_5808;
    }

    public AutoMount() {
        super("AutoMount", "Mounts nearby entities", Class556.field2756);
        this.field765 = this.method450(new Class253("Donkey", "Mounts donkeys", (boolean)field769[0]));
        this.field770 = this.method450(new Class253("Mule", "Mounts mules", (boolean)field769[0]));
        this.field767 = this.method450(new Class253("Llama", "Mounts llamas", (boolean)field769[1]));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method2778(class_1297 c2) {
        int n2;
        block3: {
            block2: {
                class_1498 a2;
                if (((Boolean)this.field771.method507()).booleanValue() && (c2 instanceof class_1498 && !(a2 = (class_1498)c2).method_6109() || c2 instanceof class_1506) || ((Boolean)AutoMount.method2782(this.field765)).booleanValue() && c2 instanceof class_1495 || ((Boolean)AutoMount.method2783(this).method507()).booleanValue() && c2 instanceof class_1500) break block2;
                if (!((Boolean)this.field767.method507()).booleanValue()) break block3;
                if (!(c2 instanceof class_1501)) return Class5659.method22229(0.8158634236465098, 0.3051092471981899, 0.9667684005400429, 0.71943947225823);
                class_1501 b2 = (class_1501)c2;
                if (b2.method_6109()) break block3;
            }
            n2 = (int)field769[0];
            return n2 != 0;
        }
        n2 = (int)field769[1];
        return n2 != 0;
    }

    private static void method2779() {
        Class1503.method14420();
    }

    private static boolean method2780() {
        return Class1807.method15742();
    }

    private static void method2781() {
        Class6454.method24594();
    }

    private static Object method2782(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method2783(AutoMount class324) {
        return class324.field770;
    }

    private static Object method2784(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method2785(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method2786(int n2, int n3, Class5448 class5448, Class191 class191) {
        return Class789.method12176(n2, n3, class5448, class191);
    }

    private static boolean method2787() {
        return Class4196.method20801();
    }

    public static class_746 method2788(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2789() {
        Class5836.method22885();
    }

    public static class_636 method2790(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

