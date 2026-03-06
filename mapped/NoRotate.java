/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.PositionFlag
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class12;
import mapped.Class1226;
import mapped.Class13;
import mapped.Class210;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.ScreenKeeper;
import mapped.Class4036;
import mapped.Class4113;
import mapped.Class4146;
import mapped.AutoMine;
import mapped.Kit;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class760;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NoRotate
extends Class278 {
    float[] field457;
    private static long[] field458 = new long[4];
    Class248 field459 = this.method450(new Class253("ApplyRotate", "Apply server rotate silent", (boolean)field458[0]));

    public static class_746 method1475(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method1476(Class248 class248) {
        return class248.method507();
    }

    @Class1(priority=-99999)
    public void method1477(Class210 a2) {
        if (((Boolean)NoRotate.method1476(this.field459)).booleanValue() && this.field457 != null) {
            Class5723.field11049.method12006(new Class1226((int)field458[3], this.field457[(int)field458[0]], this.field457[(int)field458[2]]));
            this.field457 = null;
        }
    }

    public NoRotate() {
        super("NoRotate", "Prevents server from forcing rotations", Class556.field2754);
    }

    private static class_2709 method1478() {
        return NoRotate.method1492();
    }

    public static class_746 method1479(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method1480(int n2, int n3, Kit class454, ScreenKeeper class301) {
        return Class4113.method20551(n2, n3, class454, class301);
    }

    private static void method1481() {
        Class6009.method23560();
    }

    @Class1
    public void method1482(Class12 g2) {
        double k2;
        double l2;
        double m2;
        double n2;
        double o2;
        double p2;
        g2.method10();
        float h2 = NoRotate.method1487(Class5723.field11049);
        float i2 = NoRotate.method1483().method12021();
        class_2708 j2 = g2.method19();
        class_243 q2 = NoRotate.field290.field_1724.method_18798();
        boolean r2 = j2.method_11733().contains(class_2709.field_12400);
        boolean s2 = j2.method_11733().contains(class_2709.field_12398);
        boolean t2 = j2.method_11733().contains(class_2709.field_12403);
        if (r2) {
            double b2 = q2.method_10216();
            double a2 = NoRotate.field290.field_1724.method_23317() + j2.method_11734();
            NoRotate.field290.field_1724.field_6038 += j2.method_11734();
            NoRotate.method1490((class_310)NoRotate.field290).field_6014 += j2.method_11734();
        } else {
            p2 = 0.0;
            NoRotate.field290.field_1724.field_6038 = o2 = j2.method_11734();
            NoRotate.field290.field_1724.field_6014 = o2;
        }
        if (s2) {
            double d2 = q2.method_10214();
            double c2 = NoRotate.field290.field_1724.method_23318() + j2.method_11735();
            NoRotate.field290.field_1724.field_5971 += j2.method_11735();
            NoRotate.field290.field_1724.field_6036 += j2.method_11735();
        } else {
            n2 = 0.0;
            NoRotate.field290.field_1724.field_5971 = m2 = j2.method_11735();
            NoRotate.method1493((class_310)NoRotate.field290).field_6036 = m2;
        }
        if (t2) {
            double f2 = q2.method_10215();
            double e2 = NoRotate.field290.field_1724.method_23321() + j2.method_11738();
            NoRotate.method1486((class_310)NoRotate.field290).field_5989 += j2.method_11738();
            NoRotate.method1475((class_310)NoRotate.field290).field_5969 += j2.method_11738();
        } else {
            l2 = 0.0;
            NoRotate.field290.field_1724.field_5989 = k2 = j2.method_11738();
            NoRotate.field290.field_1724.field_5969 = k2;
        }
        float u2 = j2.method_11736();
        float v2 = j2.method_11739();
        i2 = j2.method_11733().contains(NoRotate.method1478()) ? (i2 += v2) : v2;
        h2 = j2.method_11733().contains(class_2709.field_12401) ? (h2 += u2) : u2;
        float[] fArray = new float[(int)field458[1]];
        fArray[(int)NoRotate.field458[0]] = h2;
        fArray[(int)NoRotate.field458[2]] = i2;
        this.field457 = fArray;
        NoRotate.field290.field_1724.method_5814(o2, m2, k2);
        NoRotate.field290.field_1724.method_18800(p2, n2, l2);
        NoRotate.field290.field_1724.field_3944.method_52787((class_2596)new class_2793(j2.method_11737()));
        NoRotate.method1489((class_310)NoRotate.field290).field_3944.method_52787((class_2596)new class_2828.class_2830(NoRotate.field290.field_1724.method_23317(), NoRotate.field290.field_1724.method_23318(), NoRotate.field290.field_1724.method_23321(), Float.isNaN(h2) ? NoRotate.field290.field_1724.method_36454() : h2, Float.isNaN(i2) ? NoRotate.field290.field_1724.method_36455() : i2, (boolean)field458[0]));
    }

    public static Class760 method1483() {
        return Class5723.field11049;
    }

    private static void method1484(long l2) {
        NoRotate.field458[2] = l2 ^ 0x2783C7B734684B7BL;
        NoRotate.field458[0] = l2 ^ 0x2783C7B734684B7AL;
        NoRotate.field458[1] = l2 ^ 0x2783C7B734684B78L;
        NoRotate.field458[3] = l2 ^ 0x2783C7B73469F428L;
    }

    private static int method1485(int n2, int n3, Class13 class13, AutoMine class435) {
        return Class4113.method20549(n2, n3, class13, class435);
    }

    public static class_746 method1486(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static float method1487(Class760 class760) {
        return class760.method12027();
    }

    private static void method1488() {
        Class6454.method24594();
    }

    public static class_746 method1489(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_746 method1490(class_310 class_3102) {
        return NoRotate.method1479(class_3102);
    }

    private static void method1491() {
        Class4146.method20694();
    }

    public static class_2709 method1492() {
        return class_2709.field_12397;
    }

    public static class_746 method1493(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1494(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    static {
        NoRotate.method1484(2847338979100478330L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

