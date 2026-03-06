/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.InventoryS2CPacket
 */
package mapped;

import mapped.Class1;
import mapped.Class133;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class556;
import net.hachimi.client.mixin.an;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class InventorySync
extends Class278 {
    private static long[] field751 = new long[5];
    Class248 field752 = this.method450(new Class253("Debug", "Send a chat message when the container is desynced", (boolean)field751[0]));

    @Class1
    public void method2711(Class133 d2) {
        if (InventorySync.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = d2.method251();
        if (!(class_25962 instanceof class_2649)) {
            Class3979.method19561();
            return;
        }
        class_2649 c2 = (class_2649)class_25962;
        class_1703 b2 = InventorySync.field290.field_1724.field_7512;
        if (b2.field_7763 == c2.method_11440()) {
            int a2 = c2.method_37438();
            if (a2 > 0 && a2 < b2.method_37421()) {
                if (((Boolean)this.field752.method507()).booleanValue()) {
                    Class1807.method15744();
                    return;
                }
                ((an)b2).hookSetRevision(b2.method_37422());
            }
        }
    }

    static {
        InventorySync.method2712(2044720187828057681L);
    }

    private static void method2712(long l2) {
        InventorySync.field751[4] = l2 ^ 0x1C604E2D6C8FB652L;
        InventorySync.field751[0] = l2 ^ 0x1C604E2D6C8FB651L;
        InventorySync.field751[3] = l2 ^ 0x1C604E2D6C8FB650L;
        InventorySync.field751[2] = l2 ^ 0x1C604E2D6C8FB655L;
        InventorySync.field751[1] = l2 ^ 0x1C604E2D6C8FB653L;
    }

    public InventorySync() {
        super("InventorySync", "Automatically re-syncs your inventory", Class556.field2755);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

