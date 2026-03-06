/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.PositionFlag
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.gui.screen.DeathScreen
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import mapped.Class1;
import mapped.Class1022;
import mapped.Class1051;
import mapped.Class1108;
import mapped.Class1155;
import mapped.Class1215;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1389;
import mapped.Class1503;
import mapped.Class1561;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class195;
import mapped.Class204;
import mapped.Class227;
import mapped.Class229;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class270;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3350;
import mapped.Class3430;
import mapped.Class3608;
import mapped.Class3865;
import mapped.Class3891;
import mapped.Class4036;
import mapped.Replenish;
import mapped.Class414;
import mapped.Class4143;
import mapped.Class4146;
import mapped.Class521;
import mapped.Class542;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class560;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5754;
import mapped.Class5836;
import mapped.Class5903;
import mapped.Class6009;
import mapped.Class608;
import mapped.Class6155;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6405;
import mapped.Class6454;
import mapped.Class65;
import mapped.Class654;
import mapped.Class694;
import mapped.Class71;
import mapped.Class803;
import net.hachimi.client.mixin.E;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PacketFly
extends Class278 {
    private static final double field599;
    Class248 field600;
    private final ConcurrentMap field601;
    Class248 field602;
    private boolean field603;
    Class248 field604;
    private int field605;
    private int field606;
    Class248 field607;
    public static PacketFly INSTANCE;
    Class248 field608;
    Class248 field609;
    Class248 field610;
    private static final float field611 = 0.0624f;
    Class248 field612;
    private final Set field613 = new HashSet();
    private int field614;
    Class248 field615;
    private boolean field616;
    Class248 field617;
    Class248 field618;
    private static long[] field619;

    private static float method2081() {
        return Class803.method12221();
    }

    private static void method2082(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static int method2083(PacketFly class305) {
        return class305.field614;
    }

    private static double method2084(Class654 class654) {
        return class654.method_10214();
    }

    public static class_746 method2085(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private float method2086() {
        float f2;
        switch (((Class608)((Object)this.field609.method507())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                f2 = 0.1899f;
                break;
            }
            case 1: {
                if (!PacketFly.method2095(this)) {
                    if (!PacketFly.method2091(this, (int)field619[5])) {
                        return Class6322.method24328();
                    }
                    PacketFly.method2136(this, (boolean)field619[1]);
                    f2 = Class6155.field12467;
                    break;
                }
                if (!this.method2209((int)field619[5])) {
                    return Class6322.method24337();
                }
                this.field603 = (int)field619[0];
                f2 = Class6405.field13284;
                break;
            }
            case 2: {
                if (!this.field603) {
                    if (this.method2209((int)field619[1])) {
                        PacketFly.method2168(this, (boolean)field619[1]);
                    }
                    f2 = 0.256f;
                    break;
                }
                if (this.method2209((int)field619[1])) {
                    this.field603 = (int)field619[0];
                }
                f2 = 0.1899f;
                break;
            }
            case 3: {
                f2 = Class3430.field7470;
            }
        }
        return f2;
    }

    private static void method2087() {
        Class4146.method20694();
    }

    private static boolean method2088(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public static class_315 method2089(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method2090() {
        Chams.method1924();
    }

    private static boolean method2091(PacketFly class305, int n2) {
        return class305.method2209(n2);
    }

    private static void method2092() {
        Class5836.method22885();
    }

    private static int method2093(PacketFly class305) {
        return PacketFly.method2147(class305);
    }

    private static void method2094() {
        Class5836.method22890();
    }

    public static boolean method2095(PacketFly class305) {
        return class305.field603;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2096(Class133 c2) {
        if (PacketFly.field290.field_1724 == null || PacketFly.method2170(field290) == null || field290.method_1542() || PacketFly.method2097(field290) instanceof class_434) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_2708) {
            class_2708 b2 = (class_2708)class_25962;
            Class654 a2 = (Class654)this.field601.remove(b2.method_11737());
            if (a2 != null && a2.method_10216() == b2.method_11734()) {
                int n2 = PacketFly.method2084(a2) == b2.method_11735() ? 42499 : 42500;
                block8: while (true) {
                    switch (n2) {
                        case 42500: {
                            n2 = 42498;
                            continue block8;
                        }
                        case 42499: {
                            if (a2.method_10215() != b2.method_11738()) break block8;
                            if (this.field602.method507() != Class542.field2687) {
                                while (true) {
                                    // Infinite loop
                                }
                            }
                            Class5723.field11048.method21341((class_2596)new class_2793(b2.method_11737()));
                            return;
                        }
                    }
                    break;
                }
            }
            if (((Boolean)this.field608.method507()).booleanValue() && a2 != null) {
                if (a2.method_10216() != b2.method_11734()) {
                    int n3 = 57446;
                    Class4146.method20697();
                    return;
                }
                int n4 = 57445;
                block10: while (true) {
                    switch (n4) {
                        case 57446: {
                            n4 = 57444;
                            continue block10;
                        }
                        case 57445: {
                            if (a2.method_10214() == b2.method_11735() && PacketFly.method2129(a2) == b2.method_11738()) break block10;
                        }
                        default: {
                            this.field616 = (int)field619[1];
                        }
                    }
                    break;
                }
            }
            b2.method_11733().remove(class_2709.field_12397);
            b2.method_11733().remove(class_2709.field_12401);
            ((E)b2).setYaw(PacketFly.method2180(field290).method_36454());
            ((E)b2).setPitch(PacketFly.field290.field_1724.method_36455());
            Class5723.field11048.method21341((class_2596)new class_2793(b2.method_11737()));
            this.field614 = b2.method_11737();
        }
    }

    public static class_437 method2097(class_310 class_3102) {
        return class_3102.field_1755;
    }

    public static class_304 method2098(class_315 class_3152) {
        return class_3152.field_1903;
    }

    public static void method2099(PacketFly class305, int n2) {
        class305.field614 = n2;
    }

    public static boolean method2100(PacketFly class305) {
        return class305.field616;
    }

    private static void method2101(float f2) {
        Class5836.method22907(f2);
    }

    public static Class542 method2102() {
        return Class542.field2687;
    }

    private static Object method2103(Class248 class248) {
        return class248.method507();
    }

    private static ConcurrentMap method2104(PacketFly class305) {
        return PacketFly.method2158(class305);
    }

    private static float method2105() {
        return Class6322.method24337();
    }

    private static class_746 method2106(class_310 class_3102) {
        return PacketFly.method2085(class_3102);
    }

    public static Class5496 method2107() {
        return Class5723.field11048;
    }

    public static class_746 method2108(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2109(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method2110() {
        Class5836.method22890();
    }

    private static void method2111() {
        Class5836.method22897();
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)this.field602.method507());
    }

    private static void method2112() {
        Class1503.method14420();
    }

    public static class_746 method2113(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2114() {
        Chams.method1924();
    }

    private static void method2115() {
        Class6454.method24594();
    }

    private static void method2116(long l2) {
        PacketFly.field619[2] = l2 ^ 0xC0974A92A1224B90L;
        PacketFly.field619[3] = l2 ^ 0xC0974A92A1224B80L;
        PacketFly.field619[5] = l2 ^ 0xC0974A92A1224B83L;
        PacketFly.field619[0] = l2 ^ 0xC0974A92A1224B84L;
        PacketFly.field619[1] = l2 ^ 0xC0974A92A1224B85L;
        PacketFly.field619[4] = l2 ^ 0xC0974A92A1224B8EL;
        PacketFly.field619[6] = l2 ^ 0xC0974A92A1224B9AL;
    }

    private static float method2117() {
        return Class6322.method24336();
    }

    public static Set method2118(PacketFly class305) {
        return class305.field613;
    }

    private static void method2119(PacketFly class305, class_243 class_2432) {
        class305.method2149(class_2432);
    }

    private static void method2120() {
        Class5836.method22890();
    }

    private static void method2121() {
        Class5659.method22184();
    }

    private static Class248 method2122(PacketFly class305) {
        return PacketFly.method2208(class305);
    }

    private static int method2123(int n2, int n3, Class227 class227, Class270 class270) {
        return Class3865.method19019(n2, n3, class227, class270);
    }

    public static double method2124(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static float method2125() {
        return Class6322.method24325();
    }

    private static double method2126(class_243 class_2432) {
        return PacketFly.method2178(class_2432);
    }

    private static void method2127(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method2128(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static double method2129(Class654 class654) {
        return class654.method_10215();
    }

    private static void method2130(float f2) {
        Class5836.method22907(f2);
    }

    public static double method2131() {
        return field599;
    }

    private static void method2132() {
        Class5836.method22890();
    }

    private static Class542 method2133() {
        return PacketFly.method2102();
    }

    @Class1
    public void method2134(Class63 a2) {
        if (a2.method128() != Class543.field2690) {
            return;
        }
        PacketFly.method2104(this).entrySet().removeIf(PacketFly::method2195);
    }

    public static class_744 method2135(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static void method2136(PacketFly class305, boolean bl2) {
        PacketFly.method2159(class305, bl2);
    }

    private static void method2137() {
        Class4146.method20697();
    }

    private static void method2138() {
        Class6009.method23560();
    }

    private static void method2139() {
        Class6454.method24594();
    }

    private static void method2140(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method2141(PacketFly class305, int n2) {
        return class305.method2204(n2);
    }

    public static void method2142(PacketFly class305, boolean bl2) {
        class305.field603 = bl2;
    }

    private static boolean method2143(PacketFly class305, int n2) {
        return class305.method2204(n2);
    }

    private static void method2144() {
        Class5836.method22885();
    }

    private static Class560[] method2145() {
        return Class560.values();
    }

    public static Class248 method2146(PacketFly class305) {
        return class305.field612;
    }

    public static int method2147(PacketFly class305) {
        return class305.field614;
    }

    static {
        field619 = new long[7];
        PacketFly.method2116(-4569101303315018876L);
        field599 = 1.0 / Math.sqrt(2.0);
    }

    public static void method2148(PacketFly class305, boolean bl2) {
        class305.field616 = bl2;
    }

    private void method2149(class_243 a2) {
        class_2828.class_2829 b2 = new class_2828.class_2829(a2.method_10216(), a2.method_10214(), a2.method_10215(), PacketFly.field290.field_1724.method_24828());
        Class5723.field11048.method21341((class_2596)b2);
        PacketFly.method2118(this).add(b2);
    }

    private static void method2150() {
        Class1745.method15538();
    }

    @Class1
    public void method2151(Class131 b2) {
        class_2828 a2;
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2828 && !this.field613.contains(a2 = (class_2828)class_25962)) {
            if (field290.method_1542()) {
                while (true) {
                    // Infinite loop
                }
            }
            b2.method10();
        }
    }

    private static int method2152(int n2, int n3, Class3891 class3891, Class414 class414) {
        return Class3865.method19015(n2, n3, class3891, class414);
    }

    private static void method2153(Class204 class204, double d2) {
        class204.method389(d2);
    }

    private static void method2154() {
        Chams.method1924();
    }

    @Class1
    public void method2155(Class204 a2) {
        if (PacketFly.field290.field_1724 == null) {
            return;
        }
        class_243 b2 = PacketFly.field290.field_1724.method_18798();
        PacketFly.method2162(a2, PacketFly.method2126(b2));
        a2.method391(b2.field_1351);
        PacketFly.method2153(a2, b2.field_1350);
        if (this.field612.method507() != Class521.field2576) {
            PacketFly.field290.field_1724.field_5960 = (int)field619[1];
        }
        a2.method10();
    }

    private static void method2156() {
        Chams.method1924();
    }

    private static void method2157() {
        Class5659.method22184();
    }

    public static ConcurrentMap method2158(PacketFly class305) {
        return class305.field601;
    }

    public static void method2159(PacketFly class305, boolean bl2) {
        class305.field603 = bl2;
    }

    private static void method2160() {
        Class6009.method23560();
    }

    private static void method2161(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method2162(Class204 class204, double d2) {
        class204.method386(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private class_241 method2163(float a2) {
        float d2;
        float c2;
        float b2;
        block10: {
            b2 = PacketFly.method2135((class_746)PacketFly.method2192((class_310)PacketFly.field290)).field_3905;
            c2 = PacketFly.method2108((class_310)PacketFly.field290).field_3913.field_3907;
            d2 = PacketFly.field290.field_1724.field_5982 + (PacketFly.field290.field_1724.method_36454() - PacketFly.method2106((class_310)PacketFly.field290).field_5982) * field290.method_60646().method_60637((boolean)field619[1]);
            if (b2 == 0.0f && c2 == 0.0f) {
                return class_241.field_1340;
            }
            if (b2 != 0.0f) {
                block9: {
                    int n2;
                    if (c2 >= 1.0f) {
                        if (b2 > 0.0f) {
                            float f2 = -45.0f;
                            Class4036.method20085(0.64043045f, 0.15526396f, Class3608.field8048, Class5903.field11683, 0.56636024f, 0.056724727f);
                            return null;
                        }
                        d2 += 45.0f;
                        c2 = 0.0f;
                    } else if (c2 <= -1.0f) {
                        d2 += b2 > 0.0f ? 45.0f : -45.0f;
                        c2 = 0.0f;
                    }
                    int n3 = b2 > 0.0f ? 62928 : 62929;
                    while ((n2 = n3) != 62928) {
                        if (n2 == 62929) {
                            n3 = 62927;
                            continue;
                        }
                        break block9;
                    }
                    b2 = 1.0f;
                    break block10;
                }
                if (b2 < 0.0f) {
                    b2 = -1.0f;
                }
            }
        }
        float e2 = (float)Math.cos(Math.toRadians(d2));
        float f3 = (float)(-Math.sin(Math.toRadians(d2)));
        return new class_241(b2 * a2 * f3 + c2 * a2 * e2, b2 * a2 * e2 - c2 * a2 * f3);
    }

    private static void method2164() {
        Class6009.method23560();
    }

    private static void method2165(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static class_243 method2166(Class560 class560, class_243 class_2432) {
        return class560.method11056(class_2432);
    }

    private static void method2167(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method2168(PacketFly class305, boolean bl2) {
        PacketFly.method2142(class305, bl2);
    }

    private static Object method2169(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method2170(class_310 class_3102) {
        return class_3102.field_1687;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method2171(Class65 j) {
        block50: {
            block52: {
                block56: {
                    block55: {
                        block42: {
                            block54: {
                                block53: {
                                    block51: {
                                        block45: {
                                            block49: {
                                                block46: {
                                                    block48: {
                                                        block41: {
                                                            block47: {
                                                                block43: {
                                                                    block44: {
                                                                        if (j.method128() != Class543.field2690) {
                                                                            return;
                                                                        }
                                                                        if (this.field602.method507() == Class542.field2687 || PacketFly.method2083(this) != 0) break block43;
                                                                        if (PacketFly.field290.method_1542()) break block44;
                                                                        v0 = 29367;
                                                                        ** GOTO lbl12
                                                                    }
                                                                    v0 = 29368;
                                                                    if (true) ** GOTO lbl12
                                                                    block16: while (true) {
                                                                        v0 = 29366;
lbl12:
                                                                        // 3 sources

                                                                        switch (v0) {
                                                                            case 29368: {
                                                                                continue block16;
                                                                            }
                                                                            case 29367: {
                                                                                if (PacketFly.method2143(this, (int)PacketFly.field619[3])) {
                                                                                    a = PacketFly.field290.field_1724.method_19538();
                                                                                    this.method2149(a);
                                                                                    if (this.field616 && ((Boolean)this.field608.method507()).booleanValue()) {
                                                                                        this.method2149(this.method2191(a));
                                                                                        this.field616 = (int)PacketFly.field619[0];
                                                                                    }
                                                                                    this.method2149(((Class560)PacketFly.method2174(this.field610)).method11056(a));
                                                                                    if (this.field602.method507() == PacketFly.method2133()) {
                                                                                        Class1503.method14417(0.36338806f, Class1155.field4618);
                                                                                        return;
                                                                                    }
                                                                                    this.field614 = PacketFly.method2093(this) + (int)PacketFly.field619[1];
                                                                                    PacketFly.method2181(this).put(this.field614, new Class654(a, System.currentTimeMillis()));
                                                                                    if (((Boolean)this.field615.method507()).booleanValue()) {
                                                                                        PacketFly.method2107().method21341((class_2596)new class_2793(this.field614));
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                k = this.method2189();
                                                                if (((Boolean)PacketFly.method2169(this.field604)).booleanValue()) ** GOTO lbl-1000
                                                                if (PacketFly.method2193(this).method507() == Class521.field2574 && k) lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    v1 = Class1389.field5357;
                                                                } else {
                                                                    v1 = PacketFly.method2205(this);
                                                                }
                                                                l = v1;
                                                                m = (int)PacketFly.field619[0];
                                                                if (!PacketFly.method2200(PacketFly.field290.field_1690).method_1434()) break block45;
                                                                if (!((Boolean)PacketFly.method2199(this.field617)).booleanValue()) {
                                                                    Class6009.method23560();
                                                                    return;
                                                                }
                                                                if (k) break block46;
                                                                if (!PacketFly.method2141(this, PacketFly.method2122(this).method507() == PacketFly.method2176() ? (int)PacketFly.field619[4] : (int)PacketFly.field619[2])) break block47;
                                                                v2 = 49942;
                                                                ** GOTO lbl54
                                                            }
                                                            v2 = 49943;
                                                            if (true) ** GOTO lbl54
                                                            do {
                                                                v2 = var5_6 = 49941;
lbl54:
                                                                // 3 sources

                                                                if (var5_6 == 49942) break block41;
                                                            } while (var5_6 == 49943);
                                                            ** GOTO lbl-1000
                                                        }
                                                        if (PacketFly.field290.field_1724.field_6250 == 0.0f) {
                                                            if (PacketFly.field290.field_1724.field_6212 != 0.0f) {
                                                                Class5659.method22184();
                                                                return;
                                                            }
                                                            v3 = (int)PacketFly.field619[1];
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            v3 = m = (int)PacketFly.field619[0];
                                                        }
                                                        if (m == 0) break block48;
                                                        v4 = 31146;
                                                        ** GOTO lbl73
                                                    }
                                                    v4 = 31147;
                                                    if (true) ** GOTO lbl73
                                                    block18: while (true) {
                                                        v4 = 31145;
lbl73:
                                                        // 3 sources

                                                        switch (v4) {
                                                            case 31147: {
                                                                continue block18;
                                                            }
                                                            case 31146: {
                                                                v5 = -0.032;
                                                                break block18;
                                                            }
                                                            default: {
                                                                v5 = 0.06239999830722809;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    b = v5;
                                                    break block49;
                                                }
                                                c = 0.06239999830722809;
                                            }
                                            if (((Boolean)this.field618.method507()).booleanValue() && (PacketFly.field290.field_1724.field_6250 != 0.0f || PacketFly.method2188((class_310)PacketFly.field290).field_6212 != 0.0f)) {
                                                l *= (float)PacketFly.field599;
                                                c *= PacketFly.field599;
                                            }
                                            break block50;
                                        }
                                        if (!PacketFly.method2089((class_310)PacketFly.field290).field_1832.method_1434()) break block51;
                                        d = Class1051.field4307;
                                        if (((Boolean)this.field618.method507()).booleanValue() && (PacketFly.method2113((class_310)PacketFly.field290).field_6250 != 0.0f || PacketFly.field290.field_1724.field_6212 != 0.0f)) {
                                            l *= (float)PacketFly.field599;
                                            d *= PacketFly.method2131();
                                            Class1108.method12918(true);
                                            return;
                                        }
                                        break block50;
                                    }
                                    if (k || !((Boolean)this.field617.method507()).booleanValue()) break block52;
                                    if (!PacketFly.method2184(this, (int)PacketFly.field619[3])) {
                                        Class5836.method22885();
                                        return;
                                    }
                                    if (PacketFly.field290.field_1724.field_6250 != 0.0f) ** GOTO lbl-1000
                                    if (PacketFly.field290.field_1724.field_6212 != 0.0f) break block53;
                                    v6 = 13483;
                                    ** GOTO lbl113
                                }
                                v6 = 13484;
                                if (true) ** GOTO lbl113
                                block19: while (true) {
                                    v6 = 13482;
lbl113:
                                    // 3 sources

                                    switch (v6) {
                                        case 13484: {
                                            continue block19;
                                        }
                                        case 13483: {
                                            v7 = (int)PacketFly.field619[1];
                                            break block19;
                                        }
                                        default: lbl-1000:
                                        // 2 sources

                                        {
                                            v7 = m = (int)PacketFly.field619[0];
                                        }
                                    }
                                    break;
                                }
                                if (m == 0) break block54;
                                v8 = 11692;
                                ** GOTO lbl129
                            }
                            v8 = 11693;
                            if (true) ** GOTO lbl129
                            do {
                                v8 = var8_8 = 11691;
lbl129:
                                // 3 sources

                                if (var8_8 == 11692) break block42;
                            } while (var8_8 == 11693);
                            break block55;
                        }
                        v9 = Class1022.field4225;
                        break block56;
                    }
                    v9 = 0.0;
                }
                e = v9;
                break block50;
            }
            n = 0.0;
        }
        if (this.field612.method507() == Class521.field2574) {
            if (k && n != 0.0) {
                n /= Class3350.field7252 + (double)((Float)PacketFly.method2198(this).method507()).floatValue();
            }
        }
        o = (int)PacketFly.field619[1];
        p = this.method2163(l);
        while (true) {
            block57: {
                block58: {
                    if (o > (PacketFly.method2103(this.field602) == Class542.field2685 ? ((Float)this.field600.method507()).intValue() : (int)PacketFly.field619[1])) break;
                    h = p.field_1343 * (float)o;
                    i = p.field_1342 * (float)o;
                    if (m == 0) {
                        n *= (double)o;
                    }
                    PacketFly.field290.field_1724.method_18800(h, n, i);
                    if (PacketFly.field290.method_1542()) break block57;
                    f = PacketFly.field290.field_1724.method_19538();
                    g = f.method_1031(h, n, i);
                    PacketFly.method2119(this, g);
                    if (PacketFly.method2100(this) && ((Boolean)this.field608.method507()).booleanValue()) {
                        this.method2149(this.method2191(g));
                        PacketFly.method2148(this, (boolean)PacketFly.field619[0]);
                    }
                    PacketFly.method2183(this, PacketFly.method2166((Class560)this.field610.method507(), g));
                    if (this.field602.method507() == Class542.field2687) break block58;
                    v10 = 47941;
                    ** GOTO lbl171
                }
                v10 = 47942;
                if (true) ** GOTO lbl171
                block22: while (true) {
                    v10 = 47940;
lbl171:
                    // 3 sources

                    switch (v10) {
                        case 47942: {
                            continue block22;
                        }
                        case 47941: {
                            this.field601.put(this.field614 += (int)PacketFly.field619[1], new Class654(g, System.currentTimeMillis()));
                            Class5723.field11048.method21341((class_2596)new class_2793(this.field614));
                        }
                    }
                    break;
                }
            }
            ++o;
        }
    }

    private static void method2172() {
        Class4146.method20697();
    }

    private static void method2173(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method2174(Class248 class248) {
        return class248.method507();
    }

    private static void method2175() {
        Class5836.method22890();
    }

    public static Class542 method2176() {
        return Class542.field2687;
    }

    private static float method2177() {
        return Class6322.method24324();
    }

    public static double method2178(class_243 class_2432) {
        return class_2432.field_1352;
    }

    @Class1
    public void method2179(Class71 a2) {
        if (a2.method147() instanceof class_418) {
            this.method1268();
        }
    }

    @Override
    public void method1279() {
        if (PacketFly.field290.field_1724 == null) {
            return;
        }
        this.field601.clear();
        PacketFly.method2202(this, (int)field619[0]);
        PacketFly.field290.field_1724.field_5960 = (int)field619[0];
    }

    public static class_746 method2180(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static ConcurrentMap method2181(PacketFly class305) {
        return class305.field601;
    }

    private static void method2182(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method2183(PacketFly class305, class_243 class_2432) {
        class305.method2149(class_2432);
    }

    private static boolean method2184(PacketFly class305, int n2) {
        return class305.method2204(n2);
    }

    private static float method2185() {
        return Class6322.method24324();
    }

    private static void method2186() {
        Class5836.method22890();
    }

    @Class1
    public void method2187(Class195 a2) {
        a2.method10();
    }

    public static class_746 method2188(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private boolean method2189() {
        return (!PacketFly.field290.field_1687.method_8587((class_1297)PacketFly.field290.field_1724, PacketFly.field290.field_1724.method_5829().method_1009(-0.0625, -0.0625, Class5754.field11148)) ? (int)field619[1] : (int)field619[0]) != 0;
    }

    private static void method2190() {
        Class5836.method22885();
    }

    private class_243 method2191(class_243 a2) {
        return new class_243(a2.field_1352, field289.nextDouble(278.0, 295.0) * (a2.field_1351 > Class4143.field9631 ? -1.0 : 1.0), PacketFly.method2124(a2));
    }

    public static class_746 method2192(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class248 method2193(PacketFly class305) {
        return PacketFly.method2146(class305);
    }

    @Class1
    public void method2194(Class229 a2) {
        this.method1268();
    }

    private static boolean method2195(Map.Entry a2) {
        Class654 b2 = (Class654)a2.getValue();
        long c2 = System.currentTimeMillis() - b2.method11464();
        return (c2 > TimeUnit.SECONDS.toMillis(field619[6]) ? (int)field619[1] : (int)field619[0]) != 0;
    }

    private static boolean method2196() {
        return Replenish.method6431();
    }

    private static void method2197() {
        Class5836.method22885();
    }

    private Boolean method1269() {
        return (this.field602.method507() == Class542.field2685 ? (int)field619[1] : (int)field619[0]) != 0;
    }

    public static Class248 method2198(PacketFly class305) {
        return class305.field607;
    }

    private static Object method2199(Class248 class248) {
        return class248.method507();
    }

    public PacketFly() {
        super("PacketFly", "Allows player to fly by abusing 1.9+ packet exploit", Class556.field2755);
        this.field601 = new ConcurrentHashMap();
        this.field602 = this.method450(new Class260("Mode", "The packetfly mode for spoofing packets", Class542.field2688, Class542.values()));
        this.field600 = this.method450(new Class252("Factor", "The tick factor when applying packets", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(10.0f), this::method1269));
        this.field607 = this.method450(new Class252("Reduction", "The reduction vertical factor", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(2.5f)));
        this.field612 = this.method450(new Class260("Phase", "The phase/noclip type for moving through blocks", Class521.field2574, Class521.values()));
        this.field610 = this.method450(new Class260("Type", "The out of bounds packet type", Class560.field2780, PacketFly.method2145()));
        this.field609 = this.method450(new Class260("Limit", "The horizontal speed limit", Class608.field2957, Class608.values()));
        this.field618 = this.method450(new Class253("Limit-Vertical", "Slows down when moving vertically", (boolean)field619[0]));
        this.field608 = this.method450(new Class253("Conceal", "Conceals the out of bounds packet", (boolean)field619[0]));
        this.field615 = this.method450(new Class253("LimitJitter", "Prevents the jitter when flying", (boolean)field619[1]));
        this.field604 = this.method450(new Class253("Conceal-Slow", "Slows down the speed to the concealed speed", (boolean)field619[0]));
        this.field617 = this.method450(new Class253("AntiKick", "Prevents the vanilla anticheat from kicking for flying", (boolean)field619[1]));
        INSTANCE = this;
    }

    private static class_304 method2200(class_315 class_3152) {
        return PacketFly.method2098(class_3152);
    }

    private static void method2201() {
        Class5836.method22885();
    }

    private static void method2202(PacketFly class305, int n2) {
        PacketFly.method2099(class305, n2);
    }

    public static PacketFly method2203() {
        return INSTANCE;
    }

    private boolean method2204(int a2) {
        if ((this.field605 += (int)field619[1]) >= a2) {
            this.field605 = (int)field619[0];
            return (int)field619[1] != 0;
        }
        return (int)field619[0] != 0;
    }

    private static float method2205(PacketFly class305) {
        return class305.method2086();
    }

    private static void method2206() {
        Class6009.method23561();
    }

    private static int method2207(int n2, int n3, Class1561 class1561, Class694 class694) {
        return Class3865.method19021(n2, n3, class1561, class694);
    }

    public static Class248 method2208(PacketFly class305) {
        return class305.field602;
    }

    private boolean method2209(int a2) {
        if ((this.field606 += (int)field619[1]) >= a2) {
            this.field606 = (int)field619[0];
            return (int)field619[1] != 0;
        }
        return (int)field619[0] != 0;
    }

    private static void method2210(float f2) {
        Class5836.method22907(f2);
    }

    private static void method2211() {
        Class6454.method24594();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

