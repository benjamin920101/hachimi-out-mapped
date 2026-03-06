/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class221;
import mapped.Class248;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class629;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GodMode
extends Class278 {
    private double field1455;
    private final Class925 field1456 = new Class926();
    private boolean field1457;
    private double field1458;
    private boolean field1459;
    Class248 field1460;
    private static GodMode INSTANCE;
    private static long[] field1461;
    Class248 field1462 = this.method450(new Class260("Mode", "The mode for the invulnerability exploit", Class629.field3075, GodMode.method6221()));
    private double field1463;

    private static Class629[] method6221() {
        return Class629.values();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6222(Class133 b2) {
        if (GodMode.field290.field_1724 == null) {
            return;
        }
        if (GodMode.method6229(GodMode.method6227(this)) != Class629.field3075) {
            Class5836.method22890();
            return;
        }
        if (GodMode.field290.field_1755 instanceof class_434) {
            GodMode.method6228(this, (boolean)field1461[0]);
            GodMode.field290.field_1755 = null;
            this.field1456.method12593();
        }
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2708) {
            class_2708 a2 = (class_2708)class_25962;
            if (!((Boolean)GodMode.method6239(this).method507()).booleanValue()) {
                int n2 = 61626;
                Class1668.method15147(-1164192461, 1065268407, 741676941, -1591843594);
                return;
            }
            int n3 = 61625;
            block4: while (true) {
                switch (n3) {
                    case 61626: {
                        n3 = 61624;
                        continue block4;
                    }
                    case 61625: {
                        if (GodMode.field290.field_1724.method_3144()) break block4;
                        this.field1458 = a2.method_11734();
                        this.field1463 = a2.method_11735();
                        this.field1455 = a2.method_11738();
                        GodMode.field290.field_1724.method_5814(a2.method_11734(), a2.method_11735(), a2.method_11738());
                        break block4;
                    }
                }
                break;
            }
            b2.method10();
        }
    }

    public static Class925 method6223(GodMode class403) {
        return class403.field1456;
    }

    private static void method6224() {
        Class5659.method22184();
    }

    private static void method6225() {
        Class5836.method22885();
    }

    private static void method6226() {
        Class3979.method19561();
    }

    public static Class248 method6227(GodMode class403) {
        return class403.field1462;
    }

    public static void method6228(GodMode class403, boolean bl2) {
        class403.field1457 = bl2;
    }

    private static Object method6229(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method6230(Class131 a2) {
        if (a2.method251() instanceof class_2793 && GodMode.method6238(GodMode.method6244(this)) == Class629.field3074 && this.field1459) {
            a2.method10();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method6231() {
        int n2;
        int n3 = this.method1265() ? 19298 : 19299;
        block4: while (true) {
            switch (n3) {
                case 19299: {
                    n3 = 19297;
                    continue block4;
                }
                case 19298: {
                    if (this.field1462.method507() != Class629.field3075) break block4;
                    n2 = (int)field1461[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1461[1];
        return n2 != 0;
    }

    private static void method6232(long l2) {
        GodMode.field1461[0] = l2 ^ 0xF1A0B9E653CF32D6L;
        GodMode.field1461[1] = l2 ^ 0xF1A0B9E653CF32D7L;
        GodMode.field1461[2] = l2 ^ 0xF1A0B9E653CF3B13L;
    }

    private static boolean method6233() {
        return Class5659.method22111();
    }

    public GodMode() {
        super("GodMode", "Makes the player invincible", Class556.field2755);
        this.field1460 = this.method450(new Class253("PositionAdjust", "Adjusts position to match server portal position", (boolean)field1461[0], this::method1269));
        INSTANCE = this;
    }

    private static void method6234() {
        Class4146.method20694();
    }

    @Class1
    public void method6235(Class221 a2) {
        if (a2.method412() == GodMode.method6242(field290)) {
            this.field1459 = (int)field1461[0];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6236(Class63 a2) {
        if (a2.method128() != Class543.field2690 || GodMode.method6237(this).method507() != Class629.field3075) return;
        int n2 = this.field1458 != 0.0 ? 26915 : 26916;
        block4: while (true) {
            switch (n2) {
                case 26916: {
                    n2 = 26914;
                    continue block4;
                }
                case 26915: {
                    if (this.field1463 == 0.0 || this.field1455 == 0.0 || !this.field1457) return;
                    GodMode.field290.field_1724.method_5814(this.field1458, this.field1463, this.field1455);
                    if (!GodMode.method6241(this).method12595((int)field1461[2])) return;
                    this.field1457 = (int)field1461[1];
                    return;
                }
            }
            break;
        }
    }

    private static Class248 method6237(GodMode class403) {
        return GodMode.method6243(class403);
    }

    private static Object method6238(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method6239(GodMode class403) {
        return class403.field1460;
    }

    private static void method6240(boolean bl2) {
        Class1108.method12918(bl2);
    }

    static {
        field1461 = new long[3];
        GodMode.method6232(-1035623515395509545L);
    }

    @Override
    public void method1274() {
        this.field1458 = 0.0;
        this.field1463 = 0.0;
        this.field1455 = 0.0;
    }

    private static Class925 method6241(GodMode class403) {
        return GodMode.method6223(class403);
    }

    public static class_746 method6242(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method6243(GodMode class403) {
        return class403.field1462;
    }

    public static Class248 method6244(GodMode class403) {
        return class403.field1462;
    }

    private static boolean method6245() {
        return Class1807.method15742();
    }

    private static void method6246() {
        Class4146.method20697();
    }

    private static void method6247() {
        Class5659.method22184();
    }

    private static void method6248() {
        Class5836.method22885();
    }

    private static void method6249(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private Boolean method1269() {
        return (this.field1462.method507() == Class629.field3075 ? (int)field1461[0] : (int)field1461[1]) != 0;
    }

    @Override
    public void method1279() {
        this.field1457 = (int)field1461[1];
        this.field1459 = (int)field1461[1];
    }

    public static GodMode method6250() {
        return INSTANCE;
    }

    private static void method6251(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method6252(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

