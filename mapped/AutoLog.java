/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Items
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.network.encryption.NetworkEncryptionUtils$SecureRandomUtil
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.message.LastSeenMessageList$Acknowledgment
 */
package mapped;

import java.time.Instant;
import java.util.BitSet;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class117;
import mapped.Class124;
import mapped.Class1468;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3531;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4153;
import mapped.Class4196;
import mapped.AutoAnchor;
import mapped.Class543;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5578;
import mapped.Class5723;
import mapped.Class5796;
import mapped.Class5836;
import mapped.Class5959;
import mapped.Class5997;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6417;
import mapped.Class685;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.encryption.NetworkEncryptionUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.message.LastSeenMessageList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoLog
extends Class278 {
    private static long[] field696 = new long[4];
    Class248 field697;
    Class248 field698;
    Class248 field699;
    Class248 field700;
    Class248 field701;
    Class248 field702;
    Class248 field703;
    private final Class925 field704 = new Class926();
    Class248 field705;
    Class248 field706;

    public static Class248 method2516(AutoLog class311) {
        return class311.field701;
    }

    private static void method2517(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method2518(class_742 a2) {
        int n2;
        int n3 = a2 != AutoLog.field290.field_1724 ? 58510 : 58511;
        block4: while (true) {
            switch (n3) {
                case 58511: {
                    n3 = 58509;
                    continue block4;
                }
                case 58510: {
                    if (AutoLog.method2530().method21243(a2.method_5477()) || a2 instanceof Class1468) break block4;
                    n2 = (int)field696[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field696[1];
        return n2 != 0;
    }

    private static Class248 method2519(AutoLog class311) {
        return AutoLog.method2539(class311);
    }

    public static class_746 method2520(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2521(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method2522(int n2, int n3, Class124 class124, Class5997 class5997) {
        return Class5959.method23380(n2, n3, class124, class5997);
    }

    private static void method2523(long l2) {
        AutoLog.field696[2] = l2 ^ 0x2781C885FB16091BL;
        AutoLog.field696[1] = l2 ^ 0x2781C885FB16091EL;
        AutoLog.field696[3] = l2 ^ 0x2781C885FB16091CL;
        AutoLog.field696[0] = l2 ^ 0x2781C885FB16091FL;
    }

    private Boolean method1269() {
        return (Boolean)this.field706.method507();
    }

    private static void method2524() {
        Class5836.method22885();
    }

    private static void method2525(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private boolean method2526(class_742 a2) {
        return this.method2518(a2);
    }

    public AutoLog() {
        super("AutoLog", "Automatically disconnects from server during combat", Class556.field2758);
        this.field702 = this.method450(new Class252("Health", "Disconnects when player reaches this health", Float.valueOf(0.1f), Float.valueOf(Class4153.field9658), Float.valueOf(Class5578.field10597)));
        this.field703 = this.method450(new Class253("HealthTotems", "Totem check for health config", (boolean)field696[0]));
        this.field699 = this.method450(new Class253("OnRender", "Disconnects when a player enters render distance", (boolean)field696[1]));
        this.field705 = this.method450(new Class253("NoTotems", "Disconnects when player has no totems in the inventory", (boolean)field696[1]));
        this.field697 = this.method450(new Class252("Totems", "The number of totems before disconnecting", (int)field696[1], (int)field696[0], (int)field696[2]));
        this.field706 = this.method450(new Class253("SpawnInvincibility", "Accounts for spawn invincibility for logout", (boolean)field696[1]));
        this.field701 = this.method450(new Class252("InvincibilityTime", "The spawn invincibility time ", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.9f), (Number)Float.valueOf(Class5796.field11273), this::method1269));
        this.field700 = this.method450(new Class253("IllegalDisconnect", "Disconnects from the server using invalid packets", (boolean)field696[1]));
        this.field698 = this.method450(new Class253("AutoDisable", "Automatically disables", (boolean)field696[0]));
    }

    private static int method2527(int n2, int n3, Class6417 class6417, AutoAnchor class436) {
        return Class5959.method23366(n2, n3, class6417, class436);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2528(Class63 b2) {
        int e2;
        if (b2.method128() != AutoLog.method2531()) {
            return;
        }
        if (((Boolean)this.field706.method507()).booleanValue() && !this.field704.method12595(Float.valueOf(((Float)AutoLog.method2516(this).method507()).floatValue() * 1000.0f))) {
            return;
        }
        if (((Boolean)this.field699.method507()).booleanValue()) {
            class_742 a2 = AutoLog.field290.field_1687.method_18456().stream().filter(this::method2526).findFirst().orElse(null);
            int n2 = a2 != null ? 5204 : 5205;
            while (true) {
                int n3;
                if ((n3 = n2) == 5204) {
                    Object[] objectArray = new Object[(int)field696[0]];
                    objectArray[(int)AutoLog.field696[1]] = a2.method_5477().getString();
                    this.method2537("[AutoLog] %s came into render distance.", objectArray);
                    return;
                }
                if (n3 != 5205) break;
                n2 = 5203;
            }
        }
        float c2 = AutoLog.method2520(field290).method_6032() + AutoLog.field290.field_1724.method_6067();
        int d2 = Class4196.method20813(class_1802.field_8288);
        int n4 = e2 = d2 > (Integer)this.field697.method507() ? (int)field696[1] : (int)field696[0];
        if (c2 <= ((Float)this.field702.method507()).floatValue()) {
            if (!((Boolean)this.field703.method507()).booleanValue()) {
                Object[] objectArray = new Object[(int)field696[0]];
                objectArray[(int)AutoLog.field696[1]] = (int)c2;
                AutoLog.method2529(this, "[AutoLog] logged out with %d hearts remaining.", objectArray);
                return;
            }
            if (e2 != 0) {
                Object[] objectArray = new Object[(int)field696[3]];
                objectArray[(int)AutoLog.field696[1]] = d2;
                objectArray[(int)AutoLog.field696[0]] = (int)c2;
                this.method2537("[AutoLog] logged out with %d totems and %d hearts remaining.", objectArray);
                return;
            }
        }
        if (e2 != 0) {
            if ((Boolean)this.field705.method507() == false) return;
            Object[] objectArray = new Object[(int)field696[0]];
            objectArray[(int)AutoLog.field696[1]] = d2;
            this.method2537("[AutoLog] logged out with %d totems remaining.", objectArray);
            return;
        }
        AutoLog.method2541();
    }

    private static void method2529(AutoLog class311, String string, Object[] objectArray) {
        class311.method2537(string, objectArray);
    }

    public static Class5478 method2530() {
        return Class5723.field11045;
    }

    public static Class543 method2531() {
        return Class543.field2690;
    }

    private static int method2532(int n2, int n3, Class3531 class3531, Class685 class685) {
        return Class5959.method23383(n2, n3, class3531, class685);
    }

    private static void method2533() {
        Chams.method1924();
    }

    private static void method2534(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2535() {
        Class3979.method19561();
    }

    private static void method2536(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method2537(String a2, Object ... b2) {
        int n2 = (Boolean)this.field700.method507() != false ? 17248 : 17249;
        block8: while (true) {
            switch (n2) {
                case 17249: {
                    n2 = 17247;
                    continue block8;
                }
                case 17248: {
                    Class5723.field11048.method21341((class_2596)new class_2797("\u00a7", Instant.now(), class_3515.class_7426.method_43531(), null, new class_7635.class_7636((int)field696[0], new BitSet((int)field696[3]))));
                    if (!((Boolean)this.field698.method507()).booleanValue()) {
                        return;
                    }
                    this.method1268();
                    return;
                }
            }
            break;
        }
        int n3 = field290.method_1562() == null ? 29583 : 29584;
        while (true) {
            int n4;
            if ((n4 = n3) == 29583) {
                AutoLog.field290.field_1687.method_8525();
                if ((Boolean)AutoLog.method2519(this).method507() == false) return;
                this.method1268();
                return;
            }
            if (n4 != 29584) break;
            n3 = 29582;
        }
        a2 = String.format(a2, b2);
        field290.method_1562().method_48296().method_10747(class_2561.method_30163((String)a2));
        int n5 = (Boolean)this.field698.method507() != false ? 8861 : 8862;
        block10: while (true) {
            switch (n5) {
                case 8862: {
                    n5 = 8860;
                    continue block10;
                }
                case 8861: {
                    this.method1268();
                    return;
                }
            }
            break;
        }
    }

    private static void method2538() {
        Class3979.method19561();
    }

    static {
        AutoLog.method2523(2846776917243595038L);
    }

    public static Class248 method2539(AutoLog class311) {
        return class311.field698;
    }

    private static void method2540() {
        Class6009.method23561();
    }

    private static void method2541() {
        Class1807.method15744();
    }

    @Class1
    public void method2542(Class117 a2) {
        this.field704.method12593();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

