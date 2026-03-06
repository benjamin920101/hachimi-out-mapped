/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class4036;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class291
extends Class278 {
    Class248 field501;
    Class248 field502;
    private final Class925 field503 = new Class926();
    private static long[] field504 = new long[3];
    Class248 field505 = this.method450(new Class252("Charge", "Time to charge after applying fast projectiles", Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(5.0f)));
    Class248 field506;
    Class248 field507;
    Class248 field508 = this.method450(new Class253("Arrow", "Applies to arrows shot from a bow", (boolean)field504[1]));

    private static void method1684(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method1685(Class291 class291) {
        return class291.field501;
    }

    private static void method1686() {
        Class5659.method22184();
    }

    private void method1687() {
        double b2 = Class291.field290.field_1724.method_23317();
        double c2 = Class291.field290.field_1724.method_23318();
        double d2 = Class291.field290.field_1724.method_23321();
        Class5723.field11048.method21341((class_2596)new class_2848((class_1297)Class291.field290.field_1724, class_2848.class_2849.field_12981));
        for (int a2 = (int)field504[0]; a2 < (int)field504[2]; ++a2) {
            Class291.method1702().method21341((class_2596)new class_2828.class_2829(b2, c2 - 1.0E-10, d2, (boolean)field504[1]));
            Class291.method1703().method21341((class_2596)new class_2828.class_2829(b2, c2 + 1.0E-10, d2, (boolean)field504[0]));
        }
    }

    private static void method1688(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    @Override
    public String method1248() {
        if (this.field503.method12595(Float.valueOf(((Float)this.field505.method507()).floatValue() * 1000.0f))) {
            return "Charged";
        }
        return field395.format((2000.0f - (float)this.field503.method12592()) / 1000.0f) + "s";
    }

    private static void method1689() {
        Class1503.method14420();
    }

    public static class_1792 method1690() {
        return class_1802.field_8634;
    }

    private static Class925 method1691(Class291 class291) {
        return Class291.method1699(class291);
    }

    private static void method1692(long l2) {
        Class291.field504[1] = l2 ^ 0x5342D8129650FCAEL;
        Class291.field504[2] = l2 ^ 0x5342D8129650FCCBL;
        Class291.field504[0] = l2 ^ 0x5342D8129650FCAFL;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1693(Class131 e2) {
        int n2;
        class_2596 a2;
        block15: {
            block13: {
                int n3;
                block14: {
                    block12: {
                        if (Class291.field290.field_1724 == null) {
                            return;
                        }
                        if (!this.field503.method12595(Float.valueOf(((Float)this.field505.method507()).floatValue() * 1000.0f))) {
                            return;
                        }
                        class_2596 class_25962 = e2.method251();
                        if (!(class_25962 instanceof class_2886)) break block12;
                        class_2886 b2 = (class_2886)class_25962;
                        a2 = Class291.field290.field_1724.method_5998(b2.method_12551());
                        if ((a2.method_7909() == class_1802.field_8436 || a2.method_7909() == class_1802.field_8150) && ((Boolean)Class291.method1685(this).method507()).booleanValue()) break block13;
                        n3 = a2.method_7909() != Class291.method1690() ? 37664 : 37663;
                        break block14;
                    }
                    a2 = e2.method251();
                    n2 = a2 instanceof class_2846 ? 65281 : 65282;
                    break block15;
                }
                block8: while (true) {
                    switch (n3) {
                        case 37664: {
                            n3 = 37662;
                            continue block8;
                        }
                        case 37663: {
                            if (((Boolean)this.field502.method507()).booleanValue()) break block8;
                        }
                        default: {
                            if (a2.method_7909() == class_1802.field_8543 && ((Boolean)this.field507.method507()).booleanValue()) break block8;
                            if (a2.method_7909() != class_1802.field_8803) return;
                            if ((Boolean)Class291.method1697(this).method507() == false) return;
                            break block8;
                        }
                    }
                    break;
                }
            }
            Class291.method1691(this).method12593();
            this.method1687();
            return;
        }
        block9: while (true) {
            switch (n2) {
                case 65282: {
                    n2 = 65280;
                    continue block9;
                }
                case 65281: {
                    class_2846 d2 = (class_2846)a2;
                    if (d2.method_12363() != class_2846.class_2847.field_12974) return;
                    class_1799 c2 = Class291.field290.field_1724.method_6047();
                    if (c2.method_7909() != class_1802.field_8102) return;
                    if ((Boolean)this.field508.method507() == false) return;
                    this.field503.method12593();
                    this.method1687();
                    return;
                }
            }
            break;
        }
    }

    private static void method1694(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class5496 method1695() {
        return Class5723.field11048;
    }

    private static void method1696() {
        Class5659.method22184();
    }

    public static Class248 method1697(Class291 class291) {
        return class291.field506;
    }

    private static void method1698(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class925 method1699(Class291 class291) {
        return class291.field503;
    }

    private static void method1700(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public Class291() {
        super("FastProjectile", "Allows projectiles to travel at absurd speeds", Class556.field2755);
        this.field501 = this.method450(new Class253("Potion", "Applies to splash/lingering potions", (boolean)field504[0]));
        this.field502 = this.method450(new Class253("EnderPearl", "Applies to ender pearls", (boolean)field504[0]));
        this.field507 = this.method450(new Class253("Snowball", "Applies to snowball", (boolean)field504[0]));
        this.field506 = this.method450(new Class253("Egg", "Applies to eggs", (boolean)field504[0]));
    }

    static {
        Class291.method1701(5999595227953822895L);
    }

    private static void method1701(long l2) {
        Class291.method1692(l2);
    }

    private static Class5496 method1702() {
        return Class291.method1695();
    }

    public static Class5496 method1703() {
        return Class5723.field11048;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

