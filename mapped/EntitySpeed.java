/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.text.DecimalFormat;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1283;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class63;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class EntitySpeed
extends Class278 {
    Class248 field489;
    private final Class925 field490 = new Class926();
    Class248 field491 = this.method450(new Class252("Speed", "The speed of the entity while moving", Float.valueOf(0.1f), Float.valueOf(0.5f), Float.valueOf(4.0f)));
    private static long[] field492 = new long[3];
    Class248 field493 = this.method450(new Class253("AntiStuck", "Prevents entities from getting stuck when moving up", (boolean)field492[0]));

    public static Class248 method1636(EntitySpeed class289) {
        return class289.field491;
    }

    private static void method1637() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1638(Class133 a2) {
        if (EntitySpeed.field290.field_1724 == null) return;
        if (!EntitySpeed.field290.field_1724.method_3144()) return;
        if (EntitySpeed.field290.field_1690.field_1832.method_1434()) return;
        if (EntitySpeed.field290.field_1724.method_49694() == null) {
            return;
        }
        if (!((Boolean)EntitySpeed.method1653(this).method507()).booleanValue()) {
            return;
        }
        if (a2.method251() instanceof class_2752) {
            a2.method10();
            return;
        }
        int n2 = a2.method251() instanceof class_2708 ? 39386 : 39387;
        block4: while (true) {
            switch (n2) {
                case 39387: {
                    n2 = 39385;
                    continue block4;
                }
                case 39386: {
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static void method1639() {
        Class5836.method22890();
    }

    public static class_744 method1640(class_746 class_7462) {
        return class_7462.field_3913;
    }

    private static void method1641(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Class925 method1642(EntitySpeed class289) {
        return EntitySpeed.method1671(class289);
    }

    @Override
    public String method1248() {
        DecimalFormat a2 = new DecimalFormat("0.0");
        return a2.format(EntitySpeed.method1636(this).method507());
    }

    private static Class925 method1643(EntitySpeed class289) {
        return EntitySpeed.method1655(class289);
    }

    public static Class925 method1644(EntitySpeed class289) {
        return class289.field490;
    }

    private static Object method1645(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1646(Class63 g2) {
        if (g2.method128() != Class543.field2690) {
            return;
        }
        if (!EntitySpeed.field290.field_1724.method_3144()) return;
        if (EntitySpeed.field290.field_1724.method_49694() != null) {
            int n2 = 996;
            while (true) {
                // Infinite loop
            }
        }
        int n3 = 997;
        block5: while (true) {
            switch (n3) {
                case 997: {
                    n3 = 995;
                    continue block5;
                }
                case 996: {
                    double a2 = Math.cos(Math.toRadians(EntitySpeed.field290.field_1724.method_36454() + 90.0f));
                    double b2 = Math.sin(Math.toRadians(EntitySpeed.field290.field_1724.method_36454() + 90.0f));
                    class_2338 c2 = class_2338.method_49637((double)(EntitySpeed.field290.field_1724.method_23317() + 2.0 * a2), (double)(EntitySpeed.field290.field_1724.method_23318() - 1.0), (double)(EntitySpeed.field290.field_1724.method_23321() + 2.0 * b2));
                    class_2338 d2 = class_2338.method_49637((double)(EntitySpeed.field290.field_1724.method_23317() + Class1283.field5007 * a2), (double)(EntitySpeed.field290.field_1724.method_23318() - 2.0), (double)(EntitySpeed.field290.field_1724.method_23321() + 2.0 * b2));
                    if (((Boolean)this.field493.method507()).booleanValue() && !EntitySpeed.field290.field_1724.method_49694().method_24828() && !EntitySpeed.field290.field_1687.method_8320(c2).method_51366() && !EntitySpeed.field290.field_1687.method_8320(d2).method_51366()) {
                        EntitySpeed.method1643(this).method12593();
                        return;
                    }
                    class_2338 e2 = class_2338.method_49637((double)(EntitySpeed.field290.field_1724.method_23317() + 2.0 * a2), (double)EntitySpeed.field290.field_1724.method_23318(), (double)(EntitySpeed.method1670(field290).method_23321() + 2.0 * b2));
                    if (((Boolean)EntitySpeed.method1645(this.field493)).booleanValue() && EntitySpeed.field290.field_1687.method_8320(e2).method_51366()) {
                        this.field490.method12593();
                        return;
                    }
                    class_2338 f2 = class_2338.method_49637((double)(EntitySpeed.field290.field_1724.method_23317() + a2), (double)(EntitySpeed.method1660(field290).method_23318() + 1.0), (double)(EntitySpeed.field290.field_1724.method_23321() + b2));
                    if (((Boolean)this.field493.method507()).booleanValue() && EntitySpeed.field290.field_1687.method_8320(f2).method_51366()) {
                        this.field490.method12593();
                        return;
                    }
                    if (EntitySpeed.method1650(EntitySpeed.method1668((class_310)EntitySpeed.field290).field_3913)) {
                        this.field490.method12593();
                    }
                    if (!EntitySpeed.method1642(this).method12595((int)field492[1]) && ((Boolean)EntitySpeed.method1649(this.field493)).booleanValue()) {
                        return;
                    }
                    if (!EntitySpeed.field290.field_1724.method_49694().method_5799() || EntitySpeed.method1669(EntitySpeed.method1659(EntitySpeed.field290.field_1724)) || !EntitySpeed.method1644(this).method12595((int)field492[2])) {
                        if (EntitySpeed.method1663(field290).method_49694().method_24828()) {
                            EntitySpeed.method1667(field290).method_49694().method_18800(EntitySpeed.field290.field_1724.method_18798().field_1352, 0.4, EntitySpeed.method1647(EntitySpeed.field290.field_1724.method_18798()));
                        }
                        EntitySpeed.field290.field_1724.method_49694().method_18800(EntitySpeed.method1666(EntitySpeed.field290.field_1724.method_18798()), -0.4, EntitySpeed.method1657((class_310)EntitySpeed.field290).method_18798().field_1350);
                    }
                    if (((Boolean)EntitySpeed.method1664(this.field489)).booleanValue()) {
                        EntitySpeed.method1651(Class5723.field11048, (class_2596)class_2824.method_34207((class_1297)EntitySpeed.field290.field_1724.method_49694(), (boolean)field492[0], (class_1268)class_1268.field_5808));
                    }
                    this.method1661(((Float)this.field491.method507()).floatValue(), a2, b2);
                    this.field490.method12593();
                    return;
                }
            }
            break;
        }
    }

    public static double method1647(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static void method1648(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method1649(Class248 class248) {
        return class248.method507();
    }

    public static boolean method1650(class_744 class_7442) {
        return class_7442.field_3904;
    }

    private static void method1651(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static class_746 method1652(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public EntitySpeed() {
        super("EntitySpeed", "Increases riding entity speeds", Class556.field2752);
        this.field489 = this.method450(new Class253("Strict", "The NCP-Updated bypass for speeding up entity movement", (boolean)field492[0]));
    }

    public static Class248 method1653(EntitySpeed class289) {
        return class289.field489;
    }

    private static void method1654(long l2) {
        EntitySpeed.field492[0] = l2 ^ 0x5D0EC62C9A26BE85L;
        EntitySpeed.field492[1] = l2 ^ 0x5D0EC62C9A269995L;
        EntitySpeed.field492[2] = l2 ^ 0x5D0EC62C9A26BD6DL;
    }

    public static Class925 method1655(EntitySpeed class289) {
        return class289.field490;
    }

    private static void method1656(long l2) {
        EntitySpeed.method1654(l2);
    }

    static {
        EntitySpeed.method1656(6705514790068338309L);
    }

    public static class_746 method1657(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method1658(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_744 method1659(class_746 class_7462) {
        return EntitySpeed.method1640(class_7462);
    }

    private static class_746 method1660(class_310 class_3102) {
        return EntitySpeed.method1652(class_3102);
    }

    private void method1661(float a2, double b2, double c2) {
        class_243 d2 = EntitySpeed.field290.field_1724.method_49694().method_18798();
        float e2 = EntitySpeed.field290.field_1724.field_3913.field_3905;
        float f2 = EntitySpeed.field290.field_1724.field_3913.field_3907;
        if (e2 == 0.0f && f2 == 0.0f) {
            EntitySpeed.field290.field_1724.method_49694().method_18800(0.0, d2.field_1351, 0.0);
            return;
        }
        EntitySpeed.field290.field_1724.method_49694().method_18800((double)(e2 * a2) * b2 + (double)(f2 * a2) * c2, d2.field_1351, (double)(e2 * a2) * c2 - (double)(f2 * a2) * b2);
    }

    private static void method1662(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_746 method1663(class_310 class_3102) {
        return EntitySpeed.method1658(class_3102);
    }

    private static Object method1664(Class248 class248) {
        return class248.method507();
    }

    private static void method1665() {
        Class5836.method22897();
    }

    public static double method1666(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static class_746 method1667(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_746 method1668(class_310 class_3102) {
        return EntitySpeed.method1672(class_3102);
    }

    public static boolean method1669(class_744 class_7442) {
        return class_7442.field_3904;
    }

    public static class_746 method1670(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class925 method1671(EntitySpeed class289) {
        return class289.field490;
    }

    public static class_746 method1672(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

