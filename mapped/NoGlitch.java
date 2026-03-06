/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.world.World
 *  net.minecraft.util.collection.DefaultedList
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class190;
import mapped.Class222;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3850;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NoGlitch
extends Class278 {
    Class248 field1350 = this.method450(new Class253("Totem", "Remove the totem when you are popping", (boolean)field1353[0]));
    Class248 field1351;
    Class248 field1352 = this.method450(new Class253("Place", "Places blocks only after the server confirms", (boolean)field1353[0]));
    private static long[] field1353 = new long[2];

    private static class_1799 method5551(Class3850 class3850) {
        return class3850.method18908();
    }

    private static class_1268 method5552(Class222 class222) {
        return class222.method413();
    }

    private static void method5553() {
        Chams.method1924();
    }

    private static void method5554() {
        Class1745.method15538();
    }

    private static class_746 method5555(class_310 class_3102) {
        return NoGlitch.method5570(class_3102);
    }

    private static void method5556() {
        Class5836.method22885();
    }

    private static void method5557() {
        Class4146.method20697();
    }

    private static void method5558(long l2) {
        NoGlitch.field1353[1] = l2 ^ 0x621633CB32866A54L;
        NoGlitch.field1353[0] = l2 ^ 0x621633CB32866A77L;
    }

    private static class_1268 method5559(Class222 class222) {
        return class222.method413();
    }

    public static class_2371 method5560(class_1661 class_16612) {
        return class_16612.field_7544;
    }

    public static class_1792 method5561() {
        return class_1802.field_8288;
    }

    @Class1
    public void method5562(Class190 a2) {
        if (((Boolean)NoGlitch.method5568(this.field1351)).booleanValue() && !field290.method_1542()) {
            a2.method10();
        }
    }

    public static Class3850 method5563() {
        return Class5723.field11058;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5564(Class133 c2) {
        if (NoGlitch.field290.field_1687 == null) {
            return;
        }
        if (!((Boolean)this.field1350.method507()).booleanValue()) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (!(class_25962 instanceof class_2663)) return;
        class_2663 b2 = (class_2663)class_25962;
        if (b2.method_11470() != (int)field1353[1]) return;
        class_1297 a2 = b2.method_11469((class_1937)NoGlitch.field290.field_1687);
        if (a2 == null) return;
        if (!a2.method_5805()) {
            int n2 = 39296;
            Class4146.method20697();
            return;
        }
        int n3 = 39295;
        block4: while (true) {
            switch (n3) {
                case 39296: {
                    n3 = 39294;
                    continue block4;
                }
                case 39295: {
                    if (a2 != NoGlitch.field290.field_1724) return;
                    if (NoGlitch.method5551(NoGlitch.method5563()).method_7909() == NoGlitch.method5561()) {
                        NoGlitch.field290.field_1724.method_31548().method_5441(Class5723.field11058.method18969());
                        return;
                    }
                    if (NoGlitch.field290.field_1724.method_6079().method_7909() != class_1802.field_8288) {
                        return;
                    }
                    NoGlitch.method5560(NoGlitch.method5555(field290).method_31548()).set((int)field1353[0], (Object)class_1799.field_8037);
                    return;
                }
            }
            break;
        }
    }

    private static void method5565(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public NoGlitch() {
        super("NoGlitch", "Prevents blocks from being glitched in the world", Class556.field2755);
        this.field1351 = this.method450(new Class253("Destroy", "Destroys blocks only after the server confirms", (boolean)field1353[0]));
    }

    private static class_2596 method5566(Class222 a2, int b2) {
        return new class_2885(NoGlitch.method5559(a2), a2.method415(), b2);
    }

    @Class1
    public void method5567(Class222 a2) {
        if (((Boolean)this.field1352.method507()).booleanValue()) {
            if (NoGlitch.field290.field_1724.method_5998(a2.method413()).method_7909() instanceof class_1747 && !field290.method_1542()) {
                a2.method10();
                Class5723.field11048.method21353(arg_0 -> NoGlitch.method5566(a2, arg_0));
                NoGlitch.field290.field_1724.method_6104(NoGlitch.method5552(a2));
            }
        }
    }

    private static Object method5568(Class248 class248) {
        return class248.method507();
    }

    static {
        NoGlitch.method5558(7067893613023619703L);
    }

    private static void method5569(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_746 method5570(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

