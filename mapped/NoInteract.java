/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class136;
import mapped.Class222;
import mapped.Class248;
import mapped.Class253;
import mapped.Class257;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6454;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NoInteract
extends Class278 {
    Class248 field1195 = this.method450(new Class257("Blacklist", "Valid block blacklist", new class_2248[(int)field1197[1]]));
    private static NoInteract INSTANCE;
    Class248 field1196 = this.method450(new Class253("Border", "Prevents interacting with the world border", (boolean)field1197[0]));
    private static long[] field1197;

    private static class_3965 method4786(Class222 class222) {
        return class222.method415();
    }

    public NoInteract() {
        super("NoInteract", "Prevents player from interacting with certain objects", Class556.field2754);
        INSTANCE = this;
    }

    private static class_638 method4787(class_310 class_3102) {
        return NoInteract.method4794(class_3102);
    }

    private static void method4788(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Class1
    public void method4789(Class136 a2) {
        if (!((Boolean)NoInteract.method4793(this).method507()).booleanValue()) {
            NoInteract.method4792();
            return;
        }
        if (NoInteract.field290.field_1724.method_6047().method_7909() instanceof class_1747) {
            return;
        }
        a2.method10();
    }

    private static void method4790() {
        Class5836.method22890();
    }

    private static void method4791() {
        Class3979.method19561();
    }

    private static void method4792() {
        Class6454.method24594();
    }

    public static Class248 method4793(NoInteract class367) {
        return class367.field1196;
    }

    public static class_638 method4794(class_310 class_3102) {
        return class_3102.field_1687;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4795(Class131 d2) {
        if (NoInteract.method4797(field290) == null || NoInteract.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = d2.method251();
        if (!(class_25962 instanceof class_2885)) return;
        class_2885 c2 = (class_2885)class_25962;
        class_2338 a2 = c2.method_12543().method_17777();
        class_2680 b2 = NoInteract.method4787(field290).method_8320(a2);
        int n2 = !((Class257)this.field1195).method600(b2.method_26204()) ? 39321 : 39320;
        block4: while (true) {
            switch (n2) {
                case 39321: {
                    n2 = 39319;
                    continue block4;
                }
                case 39320: {
                    d2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static void method4796(long l2) {
        NoInteract.field1197[1] = l2 ^ 0x34BB78EF2B520016L;
        NoInteract.field1197[0] = l2 ^ 0x34BB78EF2B520017L;
    }

    public static class_746 method4797(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method4798(NoInteract class367) {
        return class367.field1195;
    }

    @Class1
    public void method4799(Class222 a2) {
        class_2338 b2 = NoInteract.method4786(a2).method_17777();
        class_2680 c2 = NoInteract.field290.field_1687.method_8320(b2);
        if (((Class257)NoInteract.method4798(this)).method600(c2.method_26204())) {
            a2.method10();
        }
    }

    static {
        field1197 = new long[2];
        NoInteract.method4796(3799763679236456470L);
    }

    public static NoInteract method4800() {
        return INSTANCE;
    }

    private static void method4801() {
        Class6009.method23560();
    }

    private static void method4802() {
        Class4146.method20697();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

