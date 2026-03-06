/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3978;
import mapped.Class3979;
import mapped.SelfBow;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class63;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoRelease
extends Class278 {
    Class248 field595 = this.method450(new Class253("Crossbow", "Automatically releases crossbow when fully charged", (boolean)field598[0]));
    Class248 field596 = this.method450(new Class252("Ticks", "Ticks before releasing the bow charge", (int)field598[1], (int)field598[3], (int)field598[2]));
    Class248 field597 = this.method450(new Class253("TPS-Sync", "Sync bow release to server ticks", (boolean)field598[0]));
    private static long[] field598 = new long[4];

    public static class_1268 method2065() {
        return class_1268.field_5808;
    }

    private static void method2066(long l2) {
        AutoRelease.field598[3] = l2 ^ 0x3E9FA643B6EAF4C5L;
        AutoRelease.field598[2] = l2 ^ 0x3E9FA643B6EAF4D4L;
        AutoRelease.field598[0] = l2 ^ 0x3E9FA643B6EAF4C0L;
        AutoRelease.field598[1] = l2 ^ 0x3E9FA643B6EAF4C3L;
    }

    public static class_746 method2067(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2068(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method2069() {
        Chams.method1924();
    }

    private static void method2070(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static Class3978 method2071() {
        return AutoRelease.method2079();
    }

    public static class_746 method2072(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2073() {
        Chams.method1924();
    }

    private static void method2074(long l2) {
        AutoRelease.method2066(l2);
    }

    private static float method2075(Class3978 class3978) {
        return class3978.method19528();
    }

    public static class_1792 method2076() {
        return class_1802.field_8102;
    }

    private static void method2077() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2078(Class63 c2) {
        int n2;
        if (SelfBow.method6576().method1265()) {
            return;
        }
        if (c2.method128() != Class543.field2691) {
            return;
        }
        class_1799 b2 = AutoRelease.field290.field_1724.method_6047();
        if (b2.method_7909() != AutoRelease.method2076()) {
            n2 = ((Boolean)this.field595.method507()).booleanValue() ? 48167 : 48168;
        } else {
            int n3 = ((Boolean)this.field597.method507()).booleanValue() ? 60155 : 60156;
            block8: while (true) {
                switch (n3) {
                    case 60156: {
                        n3 = 60154;
                        continue block8;
                    }
                    case 60155: {
                        float f2 = 20.0f - AutoRelease.method2075(AutoRelease.method2071());
                        Class3979.method19561();
                        return;
                    }
                }
                break;
            }
            float a2 = 0.0f;
            if (!((float)AutoRelease.field290.field_1724.method_6048() + a2 >= (float)((Integer)this.field596.method507()).intValue())) return;
            AutoRelease.method2068(Class5723.field11048, (class_2596)new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
            AutoRelease.field290.field_1724.method_6075();
            return;
        }
        block9: while (true) {
            switch (n2) {
                case 48168: {
                    n2 = 48166;
                    continue block9;
                }
                case 48167: {
                    if (b2.method_7909() != class_1802.field_8399) return;
                    if (!((float)AutoRelease.field290.field_1724.method_6048() / (float)class_1764.method_7775((class_1799)AutoRelease.field290.field_1724.method_6047(), (class_1309)AutoRelease.method2072(field290)) > 1.0f)) return;
                    AutoRelease.method2070(AutoRelease.method2080(), (class_2596)new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
                    AutoRelease.field290.field_1724.method_6075();
                    AutoRelease.field290.field_1761.method_2919((class_1657)AutoRelease.method2067(field290), AutoRelease.method2065());
                    return;
                }
            }
            break;
        }
    }

    public AutoRelease() {
        super("AutoRelease", "Automatically releases a charged bow", Class556.field2758);
    }

    public static Class3978 method2079() {
        return Class5723.field11047;
    }

    public static Class5496 method2080() {
        return Class5723.field11048;
    }

    static {
        AutoRelease.method2074(4512508161410397376L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

