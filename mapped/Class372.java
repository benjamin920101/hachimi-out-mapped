/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.ComponentType
 *  net.minecraft.component.DataComponentTypes
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class924;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class372
extends Class278 {
    private static Class372 INSTANCE;
    private static long[] field1219;
    Class248 field1220;
    Class924 field1221;
    Class248 field1222 = this.method450(new Class253("EatDesync", "Spam send use packet", (boolean)field1219[2]));
    Class248 field1223 = this.method450(new Class252("Delay", "The delay of packet", (int)field1219[1], (int)field1219[0], (int)field1219[3]));

    public static class_746 method4866(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_2596 method4867(int a2) {
        return new class_2886(Class372.method4873(), a2, Class372.field290.field_1724.method_36454(), Class372.field290.field_1724.method_36455());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4868(Class210 b2) {
        if (!((Boolean)this.field1222.method507()).booleanValue()) {
            return;
        }
        if (!Class372.method4870(this.field1221, (Number)this.field1223.method507())) return;
        if (Class372.field290.field_1724.method_6115() && Class372.field290.field_1724.method_6030().method_7909().method_57347().method_57832(class_9334.field_50075)) {
            Class5723.field11048.method21353(Class372::method4872);
            this.field1221.method12593();
            return;
        }
        if (!Class372.field290.field_1690.field_1904.method_1434()) return;
        class_1799 a2 = Class5723.field11058.method18908();
        if (!a2.method_7909().method_57347().method_57832(Class372.method4879())) {
            if (!Class372.field290.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075)) return;
            Class5723.field11048.method21353(Class372::method4878);
            this.field1221.method12593();
            return;
        }
        Class5723.field11048.method21353(Class372::method4867);
        Class372.method4869(this).method12593();
    }

    public static Class924 method4869(Class372 class372) {
        return class372.field1221;
    }

    static {
        field1219 = new long[4];
        Class372.method4877(-5762998369703325913L);
    }

    public Class372() {
        super("PacketEat", "Send eat packet", Class556.field2754);
        this.field1220 = this.method450(new Class253("SilentEat", "Cancel the RELEASE_USE_ITEM Packet", (boolean)field1219[1]));
        this.field1221 = new Class924();
        INSTANCE = this;
    }

    private static boolean method4870(Class924 class924, Number number) {
        return class924.method12595(number);
    }

    @Class1
    public void method4871(Class131 b2) {
        class_2846 a2;
        class_2596 class_25962;
        if (((Boolean)this.field1220.method507()).booleanValue() && (class_25962 = b2.method251()) instanceof class_2846 && (a2 = (class_2846)class_25962).method_12363() == class_2846.class_2847.field_12974 && Class372.method4875(field290).method_6030().method_7909().method_57347().method_57832(class_9334.field_50075)) {
            b2.method10();
        }
    }

    private static class_2596 method4872(int a2) {
        return new class_2886(Class372.field290.field_1724.method_6058(), a2, Class372.field290.field_1724.method_36454(), Class372.method4866(field290).method_36455());
    }

    public static class_1268 method4873() {
        return class_1268.field_5808;
    }

    public static Class372 method4874() {
        return INSTANCE;
    }

    public static class_746 method4875(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public boolean method4876() {
        return (Boolean)this.field1222.method507();
    }

    private static void method4877(long l2) {
        Class372.field1219[0] = l2 ^ 0xB005B78434AD8F24L;
        Class372.field1219[3] = l2 ^ 0xB005B78434AD8F2DL;
        Class372.field1219[1] = l2 ^ 0xB005B78434AD8F27L;
        Class372.field1219[2] = l2 ^ 0xB005B78434AD8F26L;
    }

    private static class_2596 method4878(int a2) {
        return new class_2886(class_1268.field_5810, a2, Class372.field290.field_1724.method_36454(), Class372.field290.field_1724.method_36455());
    }

    public static class_9331 method4879() {
        return class_9334.field_50075;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

