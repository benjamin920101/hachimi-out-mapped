/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import net.hachimi.client.mixin.bH;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class326
extends Class278 {
    Class248 field783 = this.method450(new Class253("Sprint", "Spoofs the sprint state to prevent the server from knowing when the player sprints", (boolean)field785[0]));
    Class248 field784 = this.method450(new Class253("Ground", "Spoofs the ground state to prevent the server from knowing when the player jumps", (boolean)field785[0]));
    private static long[] field785 = new long[2];

    static {
        Class326.method2819(-8057559171137731796L);
    }

    public Class326() {
        super("AntiHunger", "Prevents hunger loss", Class556.field2755);
    }

    public static Class248 method2816(Class326 class326) {
        return class326.field784;
    }

    public static class_2848.class_2849 method2817() {
        return class_2848.class_2849.field_12981;
    }

    private static void method2818(long l2) {
        Class326.field785[1] = l2 ^ 0x902DCC9FE7A5032CL;
        Class326.field785[0] = l2 ^ 0x902DCC9FE7A5032DL;
    }

    private static void method2819(long l2) {
        Class326.method2818(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2820(Class131 c2) {
        if (Class326.field290.field_1724 == null) return;
        if (Class326.field290.field_1687 == null) return;
        if (Class326.field290.field_1724.method_6128()) return;
        if (Class326.field290.field_1724.method_3144()) return;
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_2828) {
            class_2828 a2 = (class_2828)class_25962;
            if (((Boolean)Class326.method2816(this).method507()).booleanValue() && !a2.method_12273() && Class326.field290.field_1724.field_6017 <= 3.0f) {
                ((bH)a2).hookSetOnGround((!Class326.field290.field_1724.method_3144() ? (int)field785[0] : (int)field785[1]) != 0);
                return;
            }
        }
        if (!((class_25962 = c2.method251()) instanceof class_2848)) return;
        class_2848 b2 = (class_2848)class_25962;
        if ((Boolean)this.field783.method507() == false) return;
        if (b2.method_12365() != Class326.method2817()) {
            if (b2.method_12365() != class_2848.class_2849.field_12985) return;
        }
        c2.method10();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

