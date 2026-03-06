/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$OnGroundOnly
 *  net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.util.Identifier
 *  net.minecraft.network.packet.c2s.common.CommonPongC2SPacket
 */
package mapped;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1;
import mapped.Class131;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class229;
import mapped.Class231;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5710;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class662;
import mapped.Class752;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Identifier;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class342
extends Class278 {
    Class248 field963;
    Class248 field964;
    Class248 field965;
    Class248 field966;
    Class248 field967;
    Class248 field968;
    Class248 field969;
    Class248 field970;
    Class248 field971;
    Class248 field972;
    private static long[] field973 = new long[7];
    Class248 field974;
    private final List field975 = new CopyOnWriteArrayList();
    Class248 field976;
    Class248 field977;
    Class248 field978;
    Class248 field979;
    Class248 field980;
    Class248 field981;
    Class248 field982 = this.method450(new Class253("Log", "Adds packets to the logs", (boolean)field973[1]));
    Class248 field983;
    Class248 field984;
    Class248 field985;

    private static void method3737(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method3738(Class342 class342, class_2596 class_25962, String string, Object[] objectArray) {
        class342.method3746(class_25962, string, objectArray);
    }

    private static void method3739(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method3740() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3741(Class63 a2) {
        int n2 = a2.method128() == Class342.method3742() ? 46914 : 46915;
        block4: while (true) {
            switch (n2) {
                case 46915: {
                    n2 = 46913;
                    continue block4;
                }
                case 46914: {
                    Class342.method3750(this).removeIf(Class342::method3769);
                    return;
                }
            }
            break;
        }
    }

    public static Class543 method3742() {
        return Class543.field2690;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Class1
    public void method3743(Class131 x) {
        block53: {
            block52: {
                block48: {
                    block51: {
                        block50: {
                            block47: {
                                block49: {
                                    var2_2 = x.method251();
                                    if (!(var2_2 instanceof class_2828.class_2830)) break block49;
                                    b = (class_2828.class_2830)var2_2;
                                    if (((Boolean)this.field967.method507()).booleanValue()) {
                                        v0 = 26984;
                                        Class5836.method22897();
                                        return;
                                    }
                                    v1 = 26985;
                                    if (true) ** GOTO lbl12
                                    block8: while (true) {
                                        v1 = 26983;
lbl12:
                                        // 2 sources

                                        switch (v1) {
                                            case 26985: {
                                                continue block8;
                                            }
                                            case 26984: {
                                                a = new StringBuilder();
                                                a.append("PlayerMove Full - ");
                                                if (b.method_36171()) {
                                                    a.append("x: ").append(b.method_12269(0.0)).append(", y: ").append(b.method_12268(0.0)).append(", z: ").append(b.method_12274(0.0)).append(" ");
                                                }
                                                if (b.method_36172()) {
                                                    a.append("yaw: ").append(b.method_12271(0.0f)).append(", pitch: ").append(b.method_12270(0.0f)).append(" ");
                                                }
                                                a.append(" onground: ").append(b.method_12273());
                                                this.method3746((class_2596)b, a.toString(), new Object[(int)Class342.field973[1]]);
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (!((a = x.method251()) instanceof class_2828.class_2829)) break block50;
                                d = (class_2828.class_2829)a;
                                if (!((Boolean)this.field972.method507()).booleanValue()) break block50;
                                c = new StringBuilder();
                                c.append("PlayerMove PosGround - ");
                                if (d.method_36171()) {
                                    v2 = 45066;
                                    Class3979.method19561();
                                    return;
                                }
                                v3 = 45067;
                                if (true) ** GOTO lbl43
                                do {
                                    v3 = var4_4 = 45065;
lbl43:
                                    // 2 sources

                                    if (var4_4 == 45066) break block47;
                                } while (var4_4 == 45067);
                                Class6009.method23560();
                                return;
                            }
                            c.append("x: ").append(d.method_12269(0.0)).append(", y: ").append(d.method_12268(0.0)).append(", z: ").append(d.method_12274(0.0)).append(" ");
                            c.append(" onground: ").append(d.method_12273());
                            this.method3746((class_2596)d, c.toString(), new Object[(int)Class342.field973[1]]);
                        }
                        if ((c = x.method251()) instanceof class_2828.class_2831) {
                            f = (class_2828.class_2831)c;
                            if (((Boolean)Class342.method3754(this.field977)).booleanValue()) {
                                e = new StringBuilder();
                                e.append("PlayerMove LookGround - ");
                                if (f.method_36172()) {
                                    e.append("yaw: ").append(f.method_12271(0.0f)).append(", pitch: ").append(f.method_12270(0.0f)).append(" ");
                                }
                                e.append(" onground: ").append(f.method_12273());
                                this.method3746((class_2596)f, e.toString(), new Object[(int)Class342.field973[1]]);
                            }
                        }
                        if ((e = x.method251()) instanceof class_2828.class_5911) {
                            h = (class_2828.class_5911)e;
                            if (((Boolean)this.field974.method507()).booleanValue()) {
                                g /* !! */  = "PlayerMove Ground - onground: " + h.method_12273();
                                Class342.method3738(this, (class_2596)h, (String)g /* !! */ , new Object[(int)Class342.field973[1]]);
                            }
                        }
                        g /* !! */  = x.method251();
                        if (g /* !! */  instanceof class_2833) {
                            i = (class_2833)g /* !! */ ;
                            if (((Boolean)Class342.method3770(this).method507()).booleanValue()) {
                                v4 = new Object[(int)Class342.field973[5]];
                                v4[(int)Class342.field973[1]] = i.method_12279();
                                v4[(int)Class342.field973[0]] = i.method_12280();
                                v4[(int)Class342.field973[2]] = i.method_12276();
                                v4[(int)Class342.field973[3]] = Float.valueOf(i.method_12281());
                                v4[(int)Class342.field973[4]] = Float.valueOf(i.method_12277());
                                this.method3746((class_2596)i, "VehicleMove - x: %s, y: %s, z: %s, yaw: %s, pitch: %s", v4);
                            }
                        }
                        if ((g /* !! */  = x.method251()) instanceof class_2846) {
                            j = (class_2846)g /* !! */ ;
                            if (((Boolean)this.field969.method507()).booleanValue()) {
                                v5 = new Object[(int)Class342.field973[3]];
                                v5[(int)Class342.field973[1]] = j.method_12363().name();
                                v5[(int)Class342.field973[0]] = j.method_12360().name();
                                v5[(int)Class342.field973[2]] = j.method_12362().method_23854();
                                this.method3746((class_2596)j, "PlayerAction - action: %s, direction: %s, pos: %s", v5);
                            }
                        }
                        if ((g /* !! */  = x.method251()) instanceof class_2868) {
                            k = (class_2868)g /* !! */ ;
                            if (((Boolean)this.field979.method507()).booleanValue()) {
                                v6 = new Object[(int)Class342.field973[0]];
                                v6[(int)Class342.field973[1]] = k.method_12442();
                                this.method3746((class_2596)k, "UpdateSlot - slot: %d", v6);
                            }
                        }
                        if (!((g /* !! */  = x.method251()) instanceof class_2879)) break block51;
                        v7 = 2295;
                        ** GOTO lbl104
                    }
                    v7 = 2296;
                    if (true) ** GOTO lbl104
                    do {
                        v7 = var5_5 = 2294;
lbl104:
                        // 3 sources

                        if (var5_5 == 2295) break block48;
                    } while (var5_5 == 2296);
                    break block52;
                }
                l = (class_2879)g /* !! */ ;
                if (((Boolean)Class342.method3753(Class342.method3752(this))).booleanValue()) {
                    v8 = new Object[(int)Class342.field973[0]];
                    v8[(int)Class342.field973[1]] = l.method_12512().name();
                    this.method3746((class_2596)l, "HandSwing - hand: %s", v8);
                }
            }
            g /* !! */  = x.method251();
            if (g /* !! */  instanceof class_6374) {
                m = (class_6374)g /* !! */ ;
                if (((Boolean)Class342.method3747(this).method507()).booleanValue()) {
                    v9 = new Object[(int)Class342.field973[0]];
                    v9[(int)Class342.field973[1]] = m.method_36960();
                    this.method3746((class_2596)m, "Pong - %d", v9);
                }
            }
            g /* !! */  = x.method251();
            if (g /* !! */  instanceof class_2824) {
                n = (class_2824)g /* !! */ ;
                if (Class342.field290.field_1687 != null && ((Boolean)this.field970.method507()).booleanValue()) {
                    this.method3746((class_2596)n, "InteractEntity", new Object[(int)Class342.field973[1]]);
                }
            }
            if ((g /* !! */  = x.method251()) instanceof class_2885) {
                p = (class_2885)g /* !! */ ;
                if (((Boolean)Class342.method3763(this).method507()).booleanValue()) {
                    o = p.method_12543();
                    v10 = new Object[(int)Class342.field973[3]];
                    v10[(int)Class342.field973[1]] = o.method_17777().method_23854();
                    v10[(int)Class342.field973[0]] = o.method_17780().name();
                    v10[(int)Class342.field973[2]] = p.method_12546().name();
                    this.method3746((class_2596)p, "InteractBlock - pos: %s, dir: %s, hand: %s", v10);
                }
            }
            var2_2 = x.method251();
            if (var2_2 instanceof class_2886) {
                q = (class_2886)var2_2;
                if (((Boolean)Class342.method3757(this).method507()).booleanValue()) {
                    v11 = new Object[(int)Class342.field973[0]];
                    v11[(int)Class342.field973[1]] = q.method_12551().name();
                    this.method3746((class_2596)q, "InteractItem - hand: %s", v11);
                }
            }
            if ((var2_2 = x.method251()) instanceof class_2815) {
                r = (class_2815)var2_2;
                if (((Boolean)this.field978.method507()).booleanValue()) {
                    v12 = new Object[(int)Class342.field973[0]];
                    v12[(int)Class342.field973[1]] = r.method_36168();
                    this.method3746((class_2596)r, "CloseScreen - id: %s", v12);
                }
            }
            var2_2 = x.method251();
            if (var2_2 instanceof class_2848) {
                s = (class_2848)var2_2;
                if (((Boolean)this.field985.method507()).booleanValue()) {
                    v13 = new Object[(int)Class342.field973[0]];
                    v13[(int)Class342.field973[1]] = s.method_12365().name();
                    this.method3746((class_2596)s, "ClientCommand - mode: %s", v13);
                }
            }
            if ((var2_2 = x.method251()) instanceof class_2799) {
                t = (class_2799)var2_2;
                if (((Boolean)this.field963.method507()).booleanValue()) {
                    v14 = new Object[(int)Class342.field973[0]];
                    v14[(int)Class342.field973[1]] = t.method_12119().name();
                    this.method3746((class_2596)t, "ClientStatus - mode: %s", v14);
                }
            }
            var2_2 = x.method251();
            if (!(var2_2 instanceof class_2813)) {
                Class342.method3759();
                return;
            }
            u = (class_2813)var2_2;
            if (!((Boolean)this.field965.method507()).booleanValue()) break block53;
            v15 = 63045;
            ** GOTO lbl174
        }
        v15 = 63046;
        if (true) ** GOTO lbl174
        block11: while (true) {
            v15 = 63044;
lbl174:
            // 3 sources

            switch (v15) {
                case 63046: {
                    continue block11;
                }
                case 63045: {
                    v16 = new Object[(int)Class342.field973[4]];
                    v16[(int)Class342.field973[1]] = u.method_12195().name();
                    v16[(int)Class342.field973[0]] = u.method_12192();
                    v16[(int)Class342.field973[2]] = u.method_12193();
                    v16[(int)Class342.field973[3]] = u.method_12194();
                    this.method3746((class_2596)u, "ClickSlot - type: %s, slot: %s, button: %s, id: %s", v16);
                }
            }
            break;
        }
        var2_2 = x.method251();
        if (var2_2 instanceof class_2838) {
            v = (class_2838)var2_2;
            if (((Boolean)this.field983.method507()).booleanValue()) {
                v17 = new Object[(int)Class342.field973[0]];
                v17[(int)Class342.field973[1]] = v.method_12293();
                this.method3746((class_2596)v, "PickInventory - slot: %s", v17);
            }
        }
        var2_2 = x.method251();
        if (var2_2 instanceof class_2793) {
            w = (class_2793)var2_2;
            if (((Boolean)Class342.method3765(this).method507()).booleanValue()) {
                v18 = new Object[(int)Class342.field973[0]];
                v18[(int)Class342.field973[1]] = w.method_12086();
                this.method3746((class_2596)w, "TeleportConfirm - id: %s", v18);
            }
        }
    }

    private static void method3744() {
        Class4146.method20697();
    }

    private static void method3745() {
        Class5836.method22897();
    }

    private void method3746(class_2596 a2, String b2, Object ... c2) {
        String d2 = String.format(b2, c2);
        if (((Boolean)this.field982.method507()).booleanValue()) {
            Class3979.method19567(d2);
        }
        if (((Boolean)Class342.method3772(Class342.method3755(this))).booleanValue()) {
            this.method1250(d2);
        }
        this.field975.add(new Class662(a2, System.currentTimeMillis()));
    }

    public static Class248 method3747(Class342 class342) {
        return class342.field984;
    }

    private static void method3748() {
        Class1745.method15538();
    }

    private static void method3749(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static List method3750(Class342 class342) {
        return Class342.method3751(class342);
    }

    public static List method3751(Class342 class342) {
        return class342.field975;
    }

    public static Class248 method3752(Class342 class342) {
        return class342.field980;
    }

    @Override
    public void method1279() {
        Class3979.method19567("PacketLogger disabled ..");
    }

    private static Object method3753(Class248 class248) {
        return class248.method507();
    }

    private static Object method3754(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method3755(Class342 class342) {
        return class342.field981;
    }

    @Override
    public void method1274() {
        Class3979.method19567("PacketLogger enabled ..");
    }

    public Class342() {
        super("PacketLogger", "Logs client packets", Class556.field2756);
        this.field981 = this.method450(new Class253("LogChat", "Logs packets in the chats", (boolean)field973[1]));
        this.field966 = this.method450(new Class253("LogDisconnect", "Logs packets on client disconnect", (boolean)field973[0]));
        this.field967 = this.method450(new Class253("PlayerMoveFull", "Logs PlayerMoveC2SPacket", (boolean)field973[1]));
        this.field977 = this.method450(new Class253("PlayerMoveLook", "Logs PlayerMoveC2SPacket", (boolean)field973[1]));
        this.field972 = this.method450(new Class253("PlayerMovePosition", "Logs PlayerMoveC2SPacket", (boolean)field973[1]));
        this.field974 = this.method450(new Class253("PlayerMoveGround", "Logs PlayerMoveC2SPacket", (boolean)field973[1]));
        this.field964 = this.method450(new Class253("VehicleMove", "Logs VehicleMoveC2SPacket", (boolean)field973[1]));
        this.field969 = this.method450(new Class253("PlayerAction", "Logs PlayerActionC2SPacket", (boolean)field973[1]));
        this.field979 = this.method450(new Class253("UpdateSelectedSlot", "Logs UpdateSelectedSlotC2SPacket", (boolean)field973[1]));
        this.field965 = this.method450(new Class253("ClickSlot", "Logs ClickSlotC2SPacket", (boolean)field973[1]));
        this.field983 = this.method450(new Class253("PickInventory", "Logs PickFromInventoryC2SPacket", (boolean)field973[1]));
        this.field980 = this.method450(new Class253("HandSwing", "Logs HandSwingC2SPacket", (boolean)field973[1]));
        this.field970 = this.method450(new Class253("InteractEntity", "Logs PlayerInteractEntityC2SPacket", (boolean)field973[1]));
        this.field976 = this.method450(new Class253("InteractBlock", "Logs PlayerInteractBlockC2SPacket", (boolean)field973[1]));
        this.field971 = this.method450(new Class253("InteractItem", "Logs PlayerInteractItemC2SPacket", (boolean)field973[1]));
        this.field985 = this.method450(new Class253("ClientCommand", "Logs ClientCommandC2SPacket", (boolean)field973[1]));
        this.field963 = this.method450(new Class253("ClientStatus", "Logs ClientStatusC2SPacket", (boolean)field973[1]));
        this.field978 = this.method450(new Class253("CloseScreen", "Logs CloseHandledScreenC2SPacket", (boolean)field973[1]));
        this.field968 = this.method450(new Class253("TeleportConfirm", "Logs TeleportConfirmC2SPacket", (boolean)field973[1]));
        this.field984 = this.method450(new Class253("Pong", "Logs CommonPongC2SPacket", (boolean)field973[1]));
    }

    private static void method3756() {
        Class6009.method23561();
    }

    public static Class248 method3757(Class342 class342) {
        return class342.field971;
    }

    private static void method3758(String string) {
        Class3979.method19567(string);
    }

    private static void method3759() {
        Class1745.method15538();
    }

    private static void method3760(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3761(long l2) {
        Class342.field973[2] = l2 ^ 0x832536E69B98C291L;
        Class342.field973[0] = l2 ^ 0x832536E69B98C292L;
        Class342.field973[6] = l2 ^ 0x832536E69B98C92BL;
        Class342.field973[5] = l2 ^ 0x832536E69B98C296L;
        Class342.field973[3] = l2 ^ 0x832536E69B98C290L;
        Class342.field973[4] = l2 ^ 0x832536E69B98C297L;
        Class342.field973[1] = l2 ^ 0x832536E69B98C293L;
    }

    private static void method3762() {
        Class298.method1924();
    }

    public static Class248 method3763(Class342 class342) {
        return class342.field976;
    }

    private static class_2596 method3764(Class662 class662) {
        return class662.method11488();
    }

    public static Class248 method3765(Class342 class342) {
        return class342.field968;
    }

    static {
        Class342.method3761(-8996724316521839981L);
    }

    private static boolean method3766() {
        return Class4196.method20801();
    }

    private static void method3767(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method3768(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method3769(Class662 a2) {
        return (System.currentTimeMillis() - a2.method11487() > field973[6] ? (int)field973[0] : (int)field973[1]) != 0;
    }

    public static Class248 method3770(Class342 class342) {
        return class342.field964;
    }

    private static int method3771(int n2, int n3, Class231 class231, Class752 class752) {
        return Class5710.method22479(n2, n3, class231, class752);
    }

    private static Object method3772(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3773(Class229 f2) {
        if (((Boolean)this.field966.method507()).booleanValue()) {
            int n2 = 48765;
            while (true) {
                // Infinite loop
            }
        }
        int n3 = 48764;
        block5: while (true) {
            switch (n3) {
                case 48765: {
                    n3 = 48763;
                    continue block5;
                }
                case 48764: {
                    return;
                }
            }
            break;
        }
        HashMap<class_2960, Integer> g2 = new HashMap<class_2960, Integer>();
        for (Class662 c2 : this.field975) {
            class_2596 a2 = Class342.method3764(c2);
            class_2960 b2 = a2.method_55846().comp_2231();
            if (g2.containsKey(b2)) {
                g2.replace(b2, (Integer)g2.get(b2) + (int)field973[0]);
                continue;
            }
            g2.put(b2, (int)field973[0]);
        }
        ArrayList<CallSite> h2 = new ArrayList<CallSite>();
        Iterator iterator = g2.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class342.method3758(String.join((CharSequence)",", h2));
                return;
            }
            Map.Entry e2 = iterator.next();
            class_2960 d2 = (class_2960)e2.getKey();
            h2.add((CallSite)((Object)(d2.method_43903() + ": " + String.valueOf(e2.getValue()))));
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

