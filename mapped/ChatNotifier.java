/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket$Entry
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket$Action
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket
 */
package mapped;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1150;
import mapped.Class117;
import mapped.Class133;
import mapped.Class1365;
import mapped.Class1447;
import mapped.Class1468;
import mapped.Class1503;
import mapped.Class165;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class22;
import mapped.Class221;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3332;
import mapped.Blink;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class4146;
import mapped.Baritone;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class727;
import mapped.Class78;
import mapped.Class799;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ChatNotifier
extends Class278 {
    private static long[] field2340 = new long[7];
    Class248 field2341;
    Class248 field2342;
    Class248 field2343;
    Class248 field2344;
    Class248 field2345;
    Class248 field2346;
    Class248 field2347;
    Class248 field2348 = this.method450(new Class253("TotemPop", "Notifies in chat when a player pops a totem", (boolean)field2340[1]));

    private static void method10361() {
        Class1503.method14420();
    }

    private static void method10362(float f2) {
        Class5836.method22907(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method10363(boolean a2, String b2, class_1657 c2) {
        String string;
        int n2 = a2 ? 35723 : 35724;
        block4: while (true) {
            switch (n2) {
                case 35724: {
                    n2 = 35722;
                    continue block4;
                }
                case 35723: {
                    string = "\u00a7g";
                    break block4;
                }
                default: {
                    string = "\u00a77";
                }
            }
            break;
        }
        ChatNotifier.method10367("\u00a7s[VisualRange] " + string + b2 + "\u00a7f entered your visual range", c2.hashCode() + this.hashCode() + (int)field2340[6]);
    }

    private static class_1297 method10364(Class165 class165) {
        return class165.method322();
    }

    private static void method10365(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method10366(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method10367(String string, int n2) {
        Class1365.method13931(string, n2);
    }

    @Class1
    public void method10368(Class78 b2) {
        class_1297 class_12972;
        if (((Boolean)this.field2347.method507()).booleanValue() && (class_12972 = b2.method159()) instanceof class_1657) {
            class_1657 a2 = (class_1657)class_12972;
            if (!(b2.method159() instanceof Class1468)) {
                Class5836.method22890();
                return;
            }
        }
    }

    private static void method10369() {
        Class4146.method20697();
    }

    private static void method10370(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10371(Class221 a2) {
        String string;
        if (!((Boolean)this.field2348.method507()).booleanValue()) {
            return;
        }
        int b2 = ChatNotifier.method10413(Class5723.field11040, (class_1297)a2.method412());
        if (b2 == 0) {
            return;
        }
        String c2 = a2.method412().method_5477().getString();
        boolean d2 = ChatNotifier.method10388(Class5723.field11045, c2);
        if ((!d2 || ((Boolean)this.field2343.method507()).booleanValue()) && a2.method412() != ChatNotifier.field290.field_1724) {
            if (!d2) {
                Class4146.method20694();
                return;
            }
        } else {
            return;
        }
        int n2 = 33381;
        block4: while (true) {
            switch (n2) {
                case 33382: {
                    n2 = 33380;
                    continue block4;
                }
                case 33381: {
                    string = "\u00a7g";
                    break block4;
                }
                default: {
                    string = "\u00a77";
                }
            }
            break;
        }
        Class1365.method13948(string + c2 + "\u00a7f died after popping \u00a7s" + b2 + "\u00a7f totems", a2.method412().hashCode() + this.hashCode() + (int)field2340[1]);
    }

    public static Class248 method10372(ChatNotifier class450) {
        return class450.field2346;
    }

    private static void method10373() {
        Class1807.method15744();
    }

    private void method10374(boolean a2, String b2, class_1657 c2) {
        Class1365.method13931("\u00a7s[VisualRange] " + (a2 ? "\u00a7g" : "\u00a7c") + b2 + "\u00a7f left your visual range", c2.hashCode() + this.hashCode() + (int)field2340[6]);
    }

    public static class_746 method10375(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10376() {
        Class5836.method22890();
    }

    private static boolean method10377(Class1447 class1447) {
        return class1447.method14267();
    }

    private static int method10378(int n2, int n3, Replenish class408, Blink class376) {
        return Class799.method12197(n2, n3, class408, class376);
    }

    private static Object method10379(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method10380(Class22 e2) {
        if (((Boolean)ChatNotifier.method10372(this).method507()).booleanValue()) {
            class_1657 c2;
            class_1297 d2;
            if (((Boolean)ChatNotifier.method10397(this).method507()).booleanValue() && (d2 = ChatNotifier.field290.field_1687.method_8469(e2.method46().method_11820())) instanceof class_1657 && ((Class1150)(c2 = (class_1657)d2)).method12984()) {
                if (Class5659.method22180((class_1309)c2)) {
                    ChatNotifier.method10361();
                    return;
                }
                String a2 = c2.method_5477().getString();
                boolean b2 = Class5723.field11045.method21233(a2);
                field290.method_40000(() -> this.method10363(b2, a2, c2));
                if (((Boolean)ChatNotifier.method10411(this.field2342)).booleanValue()) {
                    Class5723.field11041.method22448(Class5693.field10946);
                }
                ((Class1150)c2).method12985((boolean)field2340[0]);
            }
        }
    }

    private static void method10381(long l2) {
        ChatNotifier.field2340[1] = l2 ^ 0x4770568DFB949B9AL;
        ChatNotifier.field2340[5] = l2 ^ 0x4770568DFB949BFDL;
        ChatNotifier.field2340[3] = l2 ^ 0x4770568DFB949B99L;
        ChatNotifier.field2340[6] = l2 ^ 0x4770568DFB949B98L;
        ChatNotifier.field2340[0] = l2 ^ 0x4770568DFB949B9BL;
        ChatNotifier.field2340[2] = l2 ^ 0x4770568DFB949B8FL;
        ChatNotifier.field2340[4] = l2 ^ 0x4770568DFB949BB8L;
    }

    private static Object method10382(Class248 class248) {
        return class248.method507();
    }

    private static void method10383() {
        Class1807.method15744();
    }

    static {
        ChatNotifier.method10381(5147709541895674779L);
    }

    private static void method10384(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method10385() {
        Class1807.method15744();
    }

    public static class_746 method10386(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method10387(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method10388(Class5478 class5478, String string) {
        return class5478.method21233(string);
    }

    private static void method10389() {
        Class5836.method22885();
    }

    private void method10390(boolean a2, String b2, class_1657 c2) {
        Class1365.method13931("\u00a7s[VisualRange] " + (a2 ? "\u00a7g" : "\u00a77") + b2 + "\u00a7f entered your visual range", c2.hashCode() + this.hashCode() + (int)field2340[6]);
    }

    private static Object method10391(Class248 class248) {
        return class248.method507();
    }

    private static void method10392(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method10393(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Class1
    public void method10394(Class133 m2) {
        List l2;
        Object object;
        class_2596 a2;
        if (ChatNotifier.method10398(field290) == null) return;
        if (ChatNotifier.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = m2.method251();
        if (class_25962 instanceof class_2663) {
            class_2663 e2 = (class_2663)class_25962;
            int n2 = e2.method_11470() == (int)field2340[4] ? 2644 : 2645;
            block14: while (true) {
                switch (n2) {
                    case 2645: {
                        n2 = 2643;
                        continue block14;
                    }
                    case 2644: {
                        if (!((Boolean)this.field2348.method507()).booleanValue()) break block14;
                        a2 = e2.method_11469((class_1937)ChatNotifier.field290.field_1687);
                        if (!(a2 instanceof class_1309)) {
                            return;
                        }
                        Class1668.method15147(-2108206008, 187225332, -980169124, -607994645);
                        return;
                    }
                }
                break;
            }
        }
        if ((a2 = m2.method251()) instanceof class_2703) {
            class_2703 f2 = (class_2703)a2;
            int n3 = (Boolean)ChatNotifier.method10391(this.field2345) != false ? 6213 : 6214;
            block15: while (true) {
                switch (n3) {
                    case 6214: {
                        n3 = 6212;
                        continue block15;
                    }
                    case 6213: {
                        int n4 = f2.method_46327().contains(ChatNotifier.method10410()) ? 28645 : 28646;
                        block16: while (true) {
                            switch (n4) {
                                case 28646: {
                                    n4 = 28644;
                                    continue block16;
                                }
                                case 28645: {
                                    if (ChatNotifier.method10386((class_310)ChatNotifier.field290).field_6012 >= (int)field2340[2]) break block16;
                                }
                                default: {
                                    return;
                                }
                            }
                            break;
                        }
                        f2.method_46329().stream().filter(ChatNotifier::method10409).filter(ChatNotifier::method10401).forEach(this::method10417);
                        break block15;
                    }
                }
                break;
            }
        }
        if (!((object = m2.method251()) instanceof class_7828)) return;
        class_7828 class_78282 = (class_7828)object;
        try {
            List c2;
            l2 = c2 = class_78282.comp_1105();
            if ((Boolean)this.field2341.method507() == false) return;
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if (field290.method_1562() == null) {
            return;
        }
        object = l2.iterator();
        while (true) {
            if (!object.hasNext()) {
                Class4146.method20694();
                return;
            }
            UUID k2 = (UUID)object.next();
            String j2 = null;
            for (class_640 h2 : new ArrayList(field290.method_1562().method_2880())) {
                GameProfile g2;
                if (h2 == null || !(g2 = h2.method_2966()).getId().equals(k2)) continue;
                j2 = g2.getName();
            }
            if (j2 == null) continue;
            boolean i2 = Class5723.field11045.method21233(j2);
            if (!((Boolean)this.field2343.method507()).booleanValue()) {
                if (i2) {
                    return;
                }
                Class5836.method22885();
                return;
            }
            Class1365.method13948((i2 ? "\u00a7g" : "\u00a77") + j2 + "\u00a7f has left the server", j2.hashCode() + this.hashCode() + (int)field2340[3]);
        }
    }

    private static void method10395() {
        Class4146.method20694();
    }

    @Class1
    public void method10396(Class117 a2) {
        if (((Boolean)ChatNotifier.method10402(this.field2344)).booleanValue() && !field290.method_1542() && ChatNotifier.method10377(Class5723.field11056)) {
            Class1365.method13948("This server is running GrimAC", (int)field2340[5]);
        }
    }

    public static Class248 method10397(ChatNotifier class450) {
        return class450.field2347;
    }

    public static class_746 method10398(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public ChatNotifier() {
        super("ChatNotifier", "Notifies in chat", Class556.field2756);
        this.field2347 = this.method450(new Class253("VisualRange", "Notifies in chat when player enters visual range", (boolean)field2340[0]));
        this.field2342 = this.method450(new Class253("Sounds", "Plays sound when player enters visual range", (boolean)field2340[1]));
        this.field2346 = this.method450(new Class253("IgnoreNakeds", "Ignore players with no items", (boolean)field2340[0]));
        this.field2345 = this.method450(new Class253("Join", "Notifies in chat when a player joins", (boolean)field2340[0]));
        this.field2341 = this.method450(new Class253("Leave", "Notifies in chat when a player leaves", (boolean)field2340[0]));
        this.field2343 = this.method450(new Class253("Friends", "Notifies for friends", (boolean)field2340[0]));
        this.field2344 = this.method450(new Class253("Grim", "Notifies you if the server you join is running Grim", (boolean)field2340[0]));
    }

    private static void method10399(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method10400(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method10401(class_2703.class_2705 a2) {
        int n2;
        if ((a2.comp_1107().getName() == null || a2.comp_1107().getName().isEmpty()) && a2.comp_1107().getId() == null) {
            n2 = (int)field2340[0];
            return n2 != 0;
        }
        n2 = (int)field2340[1];
        return n2 != 0;
    }

    private static Object method10402(Class248 class248) {
        return class248.method507();
    }

    private static void method10403() {
        Class5659.method22184();
    }

    /*
     * WARNING - void declaration
     */
    @Class1
    public void method10404(Class165 b2) {
        boolean e2;
        String d2;
        block13: {
            block12: {
                block11: {
                    block10: {
                        block9: {
                            class_1297 class_12972;
                            if (!((Boolean)this.field2347.method507()).booleanValue() || !((class_12972 = b2.method322()) instanceof class_1657)) break block9;
                            class_1657 a2 = (class_1657)class_12972;
                            if (!(b2.method322() instanceof Class1468)) break block10;
                        }
                        return;
                    }
                    d2 = ChatNotifier.method10364(b2).method_5477().getString();
                    e2 = Class5723.field11045.method21233(d2);
                    if (!e2) break block11;
                    if (!((Boolean)ChatNotifier.method10379(this.field2343)).booleanValue()) break block12;
                }
                if (b2.method322() != ChatNotifier.field290.field_1724) break block13;
            }
            return;
        }
        if (((Boolean)ChatNotifier.method10405(this.field2346)).booleanValue()) {
            ((Class1150)b2.method322()).method12985((boolean)field2340[1]);
        } else {
            void c2;
            field290.method_40000(() -> this.method10390(e2, d2, (class_1657)c2));
            if (((Boolean)ChatNotifier.method10382(this.field2342)).booleanValue()) {
                Class5723.field11041.method22448(Class5693.field10946);
            }
        }
    }

    private static Object method10405(Class248 class248) {
        return class248.method507();
    }

    private static int method10406(int n2, int n3, Class3332 class3332, Baritone class452) {
        return Class799.method12205(n2, n3, class3332, class452);
    }

    private static boolean method10407(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static class_2703.class_5893 method10408() {
        return class_2703.class_5893.field_29136;
    }

    private static boolean method10409(class_2703.class_2705 a2) {
        return (a2 != null && a2.comp_1107() != null ? (int)field2340[1] : (int)field2340[0]) != 0;
    }

    private static class_2703.class_5893 method10410() {
        return ChatNotifier.method10408();
    }

    private static Object method10411(Class248 class248) {
        return class248.method507();
    }

    private static void method10412() {
        Class5836.method22890();
    }

    private static int method10413(Class727 class727, class_1297 class_12972) {
        return class727.method11905(class_12972);
    }

    private static class_1297 method10414(Class78 class78) {
        return class78.method159();
    }

    private static void method10415(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method10416(Class248 class248) {
        return class248.method507();
    }

    private void method10417(class_2703.class_2705 b2) {
        String c2 = b2.comp_1107().getName();
        if (c2 != null) {
            boolean a2 = Class5723.field11045.method21233(c2);
            if (!((Boolean)ChatNotifier.method10416(this.field2343)).booleanValue()) {
                if (a2) {
                    return;
                }
            }
            Class1365.method13948((a2 ? "\u00a7g" : "\u00a77") + c2 + "\u00a7f has joined the server", c2.hashCode() + this.hashCode() + (int)field2340[3]);
        }
    }

    private static void method10418(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

