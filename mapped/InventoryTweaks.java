/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 */
package mapped;

import mapped.Class1;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class411;
import mapped.Class51;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class924;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class InventoryTweaks
extends Class411 {
    private final Class924 field2178 = new Class924();
    Class248 field2179;
    private static InventoryTweaks INSTANCE;
    Class248 field2180;
    private static long[] field2181;
    Class248 field2182 = this.method450(new Class253("FastDrop", "Drops items from the hotbar faster", (boolean)field2181[1]));

    public static class_2350 method9445() {
        return class_2350.field_11033;
    }

    @Class1
    public void method9446(Class51 a2) {
        if (((Boolean)InventoryTweaks.method9457(this.field2180)).booleanValue()) {
            a2.method10();
        }
    }

    public static Class543 method9447() {
        return Class543.field2690;
    }

    private static void method9448(long l2) {
        InventoryTweaks.field2181[1] = l2 ^ 0x740AC6C00108F49DL;
        InventoryTweaks.field2181[0] = l2 ^ 0x740AC6C00108F489L;
        InventoryTweaks.field2181[2] = l2 ^ 0x740AC6C00108F49CL;
    }

    private Boolean method1269() {
        return (Boolean)this.field2182.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9449(Class63 a2) {
        if (a2.method128() != InventoryTweaks.method9447()) return;
        int n2 = (Boolean)InventoryTweaks.method9456(InventoryTweaks.method9454(this)) == false ? 47722 : 47721;
        block4: while (true) {
            switch (n2) {
                case 47722: {
                    n2 = 47720;
                    continue block4;
                }
                case 47721: {
                    if (!InventoryTweaks.field290.field_1690.field_1869.method_1434()) return;
                    if (!InventoryTweaks.method9452(this.field2178, (Number)this.field2179.method507())) {
                        return;
                    }
                    Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12975, class_2338.field_10980, InventoryTweaks.method9445()));
                    InventoryTweaks.method9451(this.field2178);
                    return;
                }
            }
            break;
        }
    }

    private static void method9450() {
        Class6009.method23561();
    }

    public InventoryTweaks() {
        super("InventoryTweaks", "Makes your inventory better", Class556.field2754);
        this.field2179 = this.method450(new Class252("FastDropDelay", "The delay for dropping items", (Number)((int)field2181[1]), (Number)((int)field2181[1]), (Number)((int)field2181[0]), this::method1269));
        this.field2180 = this.method450(new Class253("DragItemMove", "Allows you to hold down shift and drag move items.", (boolean)field2181[2]));
        INSTANCE = this;
    }

    private static void method9451(Class924 class924) {
        class924.method12593();
    }

    private static boolean method9452(Class924 class924, Number number) {
        return class924.method12595(number);
    }

    private static void method9453(long l2) {
        InventoryTweaks.method9448(l2);
    }

    static {
        field2181 = new long[3];
        InventoryTweaks.method9453(8361714186120131741L);
    }

    public static Class248 method9454(InventoryTweaks class438) {
        return class438.field2182;
    }

    public static InventoryTweaks method9455() {
        return INSTANCE;
    }

    private static Object method9456(Class248 class248) {
        return class248.method507();
    }

    private static Object method9457(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

