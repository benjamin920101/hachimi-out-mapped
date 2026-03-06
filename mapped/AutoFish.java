/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.projectile.FishingBobberEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.Screen
 */
package mapped;

import mapped.Class1;
import mapped.Class110;
import mapped.Class133;
import mapped.Class1505;
import mapped.Class204;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class63;
import mapped.Class873;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoFish
extends Class278 {
    Class248 field805;
    private static long[] field806 = new long[6];
    Class248 field807;
    Class248 field808 = this.method450(new Class253("OpenInventory", "Allows you to fish while in the inventory", (boolean)field806[3]));
    private int field809;
    private int field810;
    private boolean field811;

    private static void method2894(long l2) {
        AutoFish.field806[1] = l2 ^ 0x1BFF00BE6036E57CL;
        AutoFish.field806[4] = l2 ^ 0x1BFF00BE6036E561L;
        AutoFish.field806[3] = l2 ^ 0x1BFF00BE6036E564L;
        AutoFish.field806[5] = l2 ^ 0x1BFF00BE6036E565L;
        AutoFish.field806[0] = l2 ^ 0x1BFF00BE6036E56FL;
        AutoFish.field806[2] = l2 ^ 0x1BFF00BE6036E56AL;
    }

    private static class_437 method2895(class_310 class_3102) {
        return AutoFish.method2905(class_3102);
    }

    public static class_1792 method2896() {
        return class_1802.field_8378;
    }

    public AutoFish() {
        super("AutoFish", "Automatically casts and reels fishing rods", Class556.field2754);
        this.field807 = this.method450(new Class252("CastingDelay", "The delay between fishing rod casts", (int)field806[0], (int)field806[2], (int)field806[1]));
        this.field805 = this.method450(new Class252("MaxSoundDist", "The maximum distance from the splash sound", Float.valueOf(0.0f), Float.valueOf(2.0f), Float.valueOf(5.0f)));
    }

    private static int method2897(int n2, int n3, Class110 class110, Class204 class204) {
        return Class873.method12504(n2, n3, class110, class204);
    }

    private static class_1792 method2898() {
        return AutoFish.method2896();
    }

    @Class1
    public void method2899(Class63 b2) {
        if (b2.method128() != Class543.field2690) {
            return;
        }
        if (AutoFish.field290.field_1755 == null || AutoFish.method2895(field290) instanceof class_408 || ((Boolean)this.field808.method507()).booleanValue()) {
            if (AutoFish.field290.field_1724.method_6047().method_7909() != class_1802.field_8378) {
                return;
            }
            class_1536 a2 = AutoFish.field290.field_1724.field_7513;
            if ((a2 == null || a2.method_26957() != null) && this.field809 <= 0) {
                ((Class1505)field290).method14437();
                this.field809 = (Integer)this.field807.method507();
                return;
            }
            if (this.field811) {
                if (this.field810 <= 0) {
                    ((Class1505)field290).method14437();
                    this.field811 = (int)field806[5];
                    return;
                }
                this.field810 = AutoFish.method2900(this) - (int)field806[3];
            }
        }
        this.field809 -= (int)field806[3];
    }

    private static int method2900(AutoFish class330) {
        return AutoFish.method2902(class330);
    }

    private static void method2901() {
        Class5659.method22184();
    }

    public static int method2902(AutoFish class330) {
        return class330.field810;
    }

    @Class1
    public void method2903(Class133 d2) {
        class_2767 c2;
        if (AutoFish.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = d2.method251();
        if (class_25962 instanceof class_2767 && (c2 = (class_2767)class_25962).method_11894().comp_349() == class_3417.field_14660 && AutoFish.field290.field_1724.method_6047().method_7909() == AutoFish.method2898()) {
            class_1536 a2 = AutoFish.field290.field_1724.field_7513;
            if (a2 == null || a2.method_6947() != AutoFish.field290.field_1724) {
                return;
            }
            double b2 = a2.method_5649(c2.method_11890(), c2.method_11889(), c2.method_11893());
            if (b2 <= (double)((Float)this.field805.method507()).floatValue()) {
                this.field811 = (int)field806[3];
                this.field810 = (int)field806[4];
            }
        }
    }

    private static void method2904() {
        Class5836.method22890();
    }

    static {
        AutoFish.method2894(2017331975743268197L);
    }

    public static class_437 method2905(class_310 class_3102) {
        return class_3102.field_1755;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

