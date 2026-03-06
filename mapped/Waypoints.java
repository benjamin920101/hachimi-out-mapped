/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket$Entry
 *  net.minecraft.network.packet.s2c.play.PlayerListS2CPacket$Action
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.EntityDimensions
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mapped.Class1;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class221;
import mapped.Class228;
import mapped.Class229;
import mapped.Class243;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class32;
import mapped.Class3935;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4070;
import mapped.Class4146;
import mapped.Blocker;
import mapped.AntiRegear;
import mapped.Colors;
import mapped.Class527;
import mapped.Class543;
import mapped.Class5478;
import mapped.Class5550;
import mapped.Class556;
import mapped.Class560;
import mapped.Class5723;
import mapped.Class574;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class629;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class996;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Waypoints
extends Class278 {
    private final Map field539;
    private static Waypoints INSTANCE;
    Class248 field540;
    Class248 field541;
    private final Map field542 = Maps.newConcurrentMap();
    private static long[] field543;
    Class248 field544;
    Class248 field545;

    private static void method1778() {
        Class1745.method15538();
    }

    private static void method1779(long l2) {
        Waypoints.field543[4] = l2 ^ 0xB34F2863ECBB551CL;
        Waypoints.field543[1] = l2 ^ 0xB34F2863ECBB551EL;
        Waypoints.field543[5] = l2 ^ 0xB34F2863ECBB55E1L;
        Waypoints.field543[3] = l2 ^ 0xB34F2863ECBB551DL;
        Waypoints.field543[2] = l2 ^ 0x4CB0D79C1344AAE1L;
        Waypoints.field543[0] = l2 ^ 0xB34F2863ECBB551FL;
    }

    private static void method1780() {
        Class6009.method23561();
    }

    private static void method1781(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method1782() {
        Class3979.method19561();
    }

    private static void method1783(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Map method1784(Waypoints class295) {
        return class295.field539;
    }

    private static void method1785() {
        Class4146.method20694();
    }

    @Class1
    public void method1786(Class133 c2) {
        if (Waypoints.method1788(field290) == null || !((Boolean)this.field545.method507()).booleanValue()) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_8042) {
            class_8042 b2 = (class_8042)class_25962;
            for (class_2596 a2 : b2.method_48324()) {
                this.method1825(a2);
            }
        } else {
            this.method1825(c2.method251());
        }
    }

    private static void method1787(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_746 method1788(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1789(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method1790() {
        Class5836.method22890();
    }

    private static void method1791(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    static {
        field543 = new long[6];
        Waypoints.method1779(-5526153808121735906L);
    }

    private static void method1792() {
        Class5836.method22885();
    }

    private static void method1793(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Map method1794(Waypoints class295) {
        return class295.field542;
    }

    private static void method1795() {
        Chams.method1924();
    }

    @Override
    public void method1279() {
        Waypoints.method1820().method20247();
        Waypoints.method1810(this).clear();
        this.field539.clear();
    }

    private static void method1796() {
        Class4146.method20694();
    }

    @Class1
    public void method1797(Class228 a2) {
        this.method1279();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1798(Class59 d) {
        if (Waypoints.field290.field_1724 == null || Waypoints.field290.field_1687 == null) {
            return;
        }
        Class6009.method23560();
        block0: for (Class243 a : Class5723.field11046.method20254()) {
            v0 = a.method445();
            v1 = Waypoints.field290.method_1542() ? "Singleplayer" : Class5723.field11048.method21362();
            if (!Integer.valueOf(v1.toUpperCase().hashCode()).equals(v0.toUpperCase().hashCode())) continue;
            if (Class5550.method21885() != a.method437()) {
                v2 = 37146;
                Class4146.method20697();
                return;
            }
            v3 = 37147;
            if (true) ** GOTO lbl16
            do {
                v3 = 37145;
lbl16:
                // 2 sources

                if ((var4_4 = v3) == 37146) continue block0;
            } while (var4_4 == 37147);
            this.method1826(d.method125(), a.method443(), a.method446());
        }
        if (((Boolean)this.field545.method507()).booleanValue()) {
            for (UUID c : this.field539.keySet()) {
                b = (class_1657)this.field539.get(c);
                if (b == null) continue;
                this.method1808(d.method125(), b.method_19538(), b.method_5477().getString() + "'s Logout", b.method_20448());
            }
        }
        Class6009.method23561();
    }

    private static void method1799(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Waypoints method1800() {
        return INSTANCE;
    }

    @Class1
    public void method1801(Class229 a2) {
        this.method1279();
    }

    public static class_746 method1802(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1803() {
        Class1807.method15744();
    }

    public static class_746 method1804(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1805() {
        Class6454.method24594();
    }

    @Class1
    public void method1806(Class63 b2) {
        if (b2.method128() != Class543.field2691) {
            return;
        }
        for (class_1657 a2 : Waypoints.field290.field_1687.method_18456()) {
            if (a2 == null || a2.equals((Object)Waypoints.field290.field_1724)) continue;
            this.field542.put(a2.method_7334().getId(), a2);
        }
    }

    private static int method1807(int n2, int n3, Blocker class433, Class629 class629) {
        return Class3935.method19386(n2, n3, class433, class629);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method1808(class_4587 a2, class_243 b2, String c2, boolean d2) {
        String string;
        String string2;
        int n2 = d2 ? 4245 : 4246;
        block4: while (true) {
            switch (n2) {
                case 4246: {
                    n2 = 4244;
                    continue block4;
                }
                case 4245: {
                    class_238 class_2383 = class_4048.method_18384((float)0.6f, (float)0.6f).method_55685(0.4f).method_30757(b2);
                    while (true) {
                        // Infinite loop
                    }
                }
            }
            break;
        }
        class_238 e2 = class_4048.method_18385((float)Class996.field4142, (float)2.2f).method_30757(b2);
        double f2 = (e2.field_1320 - e2.field_1323) / 2.0;
        Class6454.method24605(a2, e2, 1.5f, Colors.method10620().method10615((int)field543[5]));
        int g2 = (int)Math.sqrt(Waypoints.field290.field_1724.method_5707(b2));
        if (((Boolean)this.field540.method507()).booleanValue()) {
            Object[] objectArray = new Object[(int)field543[3]];
            objectArray[(int)Waypoints.field543[1]] = field395.format(b2.method_10216());
            objectArray[(int)Waypoints.field543[0]] = field395.format(b2.method_10214());
            objectArray[(int)Waypoints.field543[4]] = field395.format(b2.method_10215());
            string2 = String.format(" XYZ %s %s %s", objectArray);
        } else {
            string2 = "";
        }
        if (((Boolean)this.field541.method507()).booleanValue()) {
            Object[] objectArray = new Object[(int)field543[0]];
            objectArray[(int)Waypoints.field543[1]] = g2;
            string = String.format(" %sm", objectArray);
        } else {
            string = "";
        }
        String h2 = "\u00a77" + c2 + string2 + string;
        Class6454.method24616(h2, e2.field_1323 + f2, Waypoints.method1822(e2) + 0.4, e2.field_1321 + f2, (int)field543[2]);
    }

    @Class1
    public void method1809(Class221 b2) {
        if (b2.method412() instanceof class_746 && ((Boolean)this.field544.method507()).booleanValue()) {
            String a2 = field290.method_1542() ? "Singleplayer" : Class5723.field11048.method21362();
            Class5723.field11046.method20252("Last Death");
            Waypoints.method1834(Class5723.field11046, new Class243("Last Death", a2, Class5550.method21885(), Waypoints.field290.field_1724.method_23317(), Waypoints.method1802(field290).method_23318(), Waypoints.method1804(field290).method_23321()));
        }
    }

    public static Map method1810(Waypoints class295) {
        return class295.field542;
    }

    private static void method1811() {
        Chams.method1924();
    }

    private static void method1812(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1813(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1814(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1815() {
        Class6009.method23561();
    }

    public Waypoints() {
        super("Waypoints", "Renders a waypoint at marked locations", Class556.field2759);
        this.field539 = Maps.newConcurrentMap();
        this.field545 = this.method450(new Class253("LogoutPoints", "Marks the position of player logouts", (boolean)field543[1]));
        this.field544 = this.method450(new Class253("DeathPoints", "Marks the position of player deaths", (boolean)field543[1]));
        this.field540 = this.method450(new Class253("Coords", "Shows the coordinates of the waypoint", (boolean)field543[0]));
        this.field541 = this.method450(new Class253("Distance", "Shows the distance to the waypoint", (boolean)field543[0]));
        INSTANCE = this;
    }

    private static void method1816(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method1817(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1818() {
        Class4146.method20697();
    }

    private static int method1819(int n2, int n3, Class32 class32, AntiRegear class437) {
        return Class3935.method19367(n2, n3, class32, class437);
    }

    public static Class4070 method1820() {
        return Class5723.field11046;
    }

    private static void method1821() {
        Class5836.method22885();
    }

    public static double method1822(class_238 class_2383) {
        return class_2383.field_1325;
    }

    private static void method1823() {
        Class1807.method15744();
    }

    private static void method1824(float f2) {
        Class5836.method22907(f2);
    }

    public void method1825(class_2596 h2) {
        class_2703 c2;
        if (h2 instanceof class_2703 && (c2 = (class_2703)h2).method_46327().contains(class_2703.class_5893.field_29136)) {
            for (class_2703.class_2705 b2 : c2.method_46330()) {
                for (UUID a2 : this.field539.keySet()) {
                    if (!a2.equals(b2.comp_1107().getId())) {
                        Waypoints.method1815();
                        return;
                    }
                    this.field539.remove(a2);
                }
            }
            this.field542.clear();
            while (true) {
                // Infinite loop
            }
        }
        if (h2 instanceof class_7828) {
            block11: {
                Object object;
                class_7828 class_78282 = (class_7828)h2;
                try {
                    object = class_78282.comp_1105();
                    List g2 = object;
                    object = g2.iterator();
                    if (!object.hasNext()) break block11;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                UUID f2 = (UUID)object.next();
                Iterator iterator = Waypoints.method1794(this).keySet().iterator();
                if (iterator.hasNext()) {
                    UUID e2 = (UUID)iterator.next();
                    if (!e2.equals(f2)) {
                        Class6009.method23561();
                        return;
                    }
                    class_1657 d2 = (class_1657)this.field542.get(e2);
                    if (!Waypoints.method1784(this).containsKey(e2)) {
                        this.field539.put(e2, d2);
                    }
                    Class5836.method22907(0.4716165f);
                    return;
                }
                Waypoints.method1818();
                return;
            }
            this.field542.clear();
        }
    }

    private void method1826(class_4587 a2, class_243 b2, String c2) {
        this.method1808(a2, b2, c2, (boolean)field543[1]);
    }

    private static int method1827(int n2, int n3, Class560 class560, Class5478 class5478) {
        return Class3935.method19379(n2, n3, class560, class5478);
    }

    private static void method1828() {
        Class6454.method24594();
    }

    private static void method1829() {
        Class5836.method22885();
    }

    private static int method1830(int n2, int n3, Class527 class527, Class574 class574) {
        return Class3935.method19371(n2, n3, class527, class574);
    }

    private static void method1831() {
        Class6009.method23560();
    }

    private static void method1832(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1833() {
        Class5836.method22885();
    }

    private static void method1834(Class4070 class4070, Class243 class243) {
        class4070.method20253(class243);
    }

    private static void method1835(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

