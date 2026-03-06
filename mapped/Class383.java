/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ElytraItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class112;
import mapped.Class1268;
import mapped.Class1276;
import mapped.Class1327;
import mapped.Class133;
import mapped.Class1387;
import mapped.Class148;
import mapped.Class15;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1714;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class204;
import mapped.Class24;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class280;
import mapped.Class286;
import mapped.Class298;
import mapped.Class305;
import mapped.Class309;
import mapped.Class3199;
import mapped.Class352;
import mapped.Class3672;
import mapped.Class3766;
import mapped.Class3850;
import mapped.Class390;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Class4115;
import mapped.Class4146;
import mapped.Class4182;
import mapped.Class419;
import mapped.Class455;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5670;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class602;
import mapped.Class6023;
import mapped.Class6161;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class65;
import mapped.Class686;
import mapped.Class851;
import mapped.Class881;
import mapped.Class91;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class383
extends Class278 {
    private double field1290;
    private int field1291;
    Class248 field1292 = this.method450(new Class260("Mode", "The mode for long jump", Class602.field2929, Class602.values()));
    Class248 field1293;
    Class248 field1294 = this.method450(new Class252("Boost", "The jump boost speed", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(Class1714.field6347), (Number)Float.valueOf(Class3199.field6851), this::method1269));
    private double field1295;
    private static long[] field1296 = new long[80];
    Class248 field1297;
    private int field1298;
    private static Class383 INSTANCE;
    private int field1299;

    private static void method5127(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5128() {
        Class1745.method15538();
    }

    private static void method5129(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5130(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static double method5131(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    private Boolean method1278() {
        return (Class383.method5147(this).method507() == Class602.field2926 ? (int)field1296[0] : (int)field1296[1]) != 0;
    }

    private static void method5132() {
        Class3979.method19561();
    }

    public static Class543 method5133() {
        return Class543.field2690;
    }

    public Class383() {
        super("LongJump", "Allows the player to jump farther", Class556.field2752);
        this.field1293 = this.method450(new Class253("VanillaBoost", "Uses vanilla elytra boost", (boolean)field1296[1], this::method1278));
        this.field1297 = this.method450(new Class253("AutoDisable", "Automatically disables when rubberband is detected", (boolean)field1296[0]));
        INSTANCE = this;
    }

    public static class_437 method5134(class_310 class_3102) {
        return class_3102.field_1755;
    }

    private static int method5135(int n2, int n3, Class112 class112, Class6161 class6161) {
        return Class1327.method13697(n2, n3, class112, class6161);
    }

    private double method5136(class_1657 c2, double d2) {
        ArrayList e2 = Lists.newArrayList((Iterable)Class383.method5215(field290).method_8600((class_1297)c2, c2.method_5829().method_1009(0.0, -d2, 0.0)));
        if (e2.isEmpty()) {
            return 0.0;
        }
        d2 = 0.0;
        for (class_265 b2 : e2) {
            class_238 a2 = b2.method_1107();
            if (a2.field_1325 <= d2) {
                return Class5659.method22110(0.7906655018558407, 0.4104972571704575, 0.36731075980224426);
            }
            d2 = a2.field_1325;
        }
        return c2.method_23318() - d2;
    }

    public static int method5137(Class383 class383) {
        return class383.field1298;
    }

    public static Class1387 method5138() {
        return Class5723.field11052;
    }

    private static void method5139(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    public static double method5140(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5141(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method5142(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class383 method5143() {
        return INSTANCE;
    }

    private static void method5144() {
        Class6009.method23560();
    }

    private static void method5145() {
        Class5836.method22890();
    }

    private static class_746 method5146(class_310 class_3102) {
        return Class383.method5210(class_3102);
    }

    private static Class248 method5147(Class383 class383) {
        return Class383.method5190(class383);
    }

    private static class_746 method5148(class_310 class_3102) {
        return Class383.method5151(class_3102);
    }

    private static Object method5149(Class248 class248) {
        return class248.method507();
    }

    public static double method5150(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static class_746 method5151(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5152(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method5153(int n2, int n3, Class309 class309, Class286 class286) {
        return Class1327.method13675(n2, n3, class309, class286);
    }

    public static int method5154(Class383 class383) {
        return class383.field1299;
    }

    static {
        Class383.method5256(-5890603842931273983L);
    }

    public static Class602 method5155() {
        return Class602.field2926;
    }

    public static class_746 method5156(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5157(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_746 method5158(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5159(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static void method5160(Class383 class383, int n2) {
        class383.field1298 = n2;
    }

    private static void method5161(long l2) {
        Class383.field1296[3] = l2 ^ 0xAE405F03BD87CF07L;
        Class383.field1296[17] = l2 ^ 0xAE405F03BD87CF04L;
        Class383.field1296[52] = l2 ^ 0xAE405F03BD87CF3EL;
        Class383.field1296[30] = l2 ^ 0xAE405F03BD87CF30L;
        Class383.field1296[74] = l2 ^ 0xAE405F03BD87CF17L;
        Class383.field1296[29] = l2 ^ 0xAE405F03BD87CF49L;
        Class383.field1296[48] = l2 ^ 0xAE405F03BD87CF32L;
        Class383.field1296[5] = l2 ^ 0xAE405F03BD87CF25L;
        Class383.field1296[78] = l2 ^ 0xAE405F03BD87CF21L;
        Class383.field1296[69] = l2 ^ 0xAE405F03BD87CF22L;
        Class383.field1296[70] = l2 ^ 0xAE405F03BD87CF23L;
        Class383.field1296[12] = l2 ^ 0xAE405F03BD87CF09L;
        Class383.field1296[6] = l2 ^ 0xAE405F03BD87CF03L;
        Class383.field1296[34] = l2 ^ 0xAE405F03BD87CF43L;
        Class383.field1296[14] = l2 ^ 0xAE405F03BD87CF2CL;
        Class383.field1296[24] = l2 ^ 0xAE405F03BD87CF33L;
        Class383.field1296[28] = l2 ^ 0xAE405F03BD87CF4CL;
        Class383.field1296[16] = l2 ^ 0xAE405F03BD87CF37L;
        Class383.field1296[19] = l2 ^ 0xAE405F03BD87CF4BL;
        Class383.field1296[23] = l2 ^ 0xAE405F03BD87CF20L;
        Class383.field1296[39] = l2 ^ 0xAE405F03BD87CF46L;
        Class383.field1296[8] = l2 ^ 0xAE405F03BD87CF10L;
        Class383.field1296[79] = l2 ^ 0xAE405F03BD87CF4DL;
        Class383.field1296[0] = l2 ^ 0xAE405F03BD87CF00L;
        Class383.field1296[25] = l2 ^ 0xAE405F03BD87CF3BL;
        Class383.field1296[63] = l2 ^ 0xAE405F03BD87CF24L;
        Class383.field1296[10] = l2 ^ 0xAE405F03BD87CF27L;
        Class383.field1296[32] = l2 ^ 0xAE405F03BD87CF3CL;
        Class383.field1296[58] = l2 ^ 0xAE405F03BD87CF0AL;
        Class383.field1296[38] = l2 ^ 0xAE405F03BD87CF36L;
        Class383.field1296[18] = l2 ^ 0xAE405F03BD87CF15L;
        Class383.field1296[37] = l2 ^ 0xAE405F03BD87CF13L;
        Class383.field1296[7] = l2 ^ 0xAE405F03BD87CF02L;
        Class383.field1296[75] = l2 ^ 0xAE405F03BD87CF3FL;
        Class383.field1296[60] = l2 ^ 0xAE405F03BD87CF1BL;
        Class383.field1296[76] = l2 ^ 0xAE405F03BD87CF0CL;
        Class383.field1296[31] = l2 ^ 0xAE405F03BD87CF19L;
        Class383.field1296[1] = l2 ^ 0xAE405F03BD87CF01L;
        Class383.field1296[4] = l2 ^ 0x51BFA0FC427830FEL;
        Class383.field1296[44] = l2 ^ 0xAE405F03BD87CF16L;
        Class383.field1296[36] = l2 ^ 0xAE405F03BD87CF0BL;
        Class383.field1296[68] = l2 ^ 0xAE405F03BD87CF1DL;
        Class383.field1296[11] = l2 ^ 0xAE405F03BD87CF48L;
        Class383.field1296[46] = l2 ^ 0xAE405F03BD87CF2FL;
        Class383.field1296[26] = l2 ^ 0xAE405F03BD87CF1FL;
        Class383.field1296[9] = l2 ^ 0xAE405F03BD87CF0EL;
        Class383.field1296[41] = l2 ^ 0xAE405F03BD87CF3DL;
        Class383.field1296[54] = l2 ^ 0xAE405F03BD87CF42L;
        Class383.field1296[72] = l2 ^ 0xAE405F03BD87CF41L;
        Class383.field1296[22] = l2 ^ 0xAE405F03BD87CF14L;
        Class383.field1296[59] = l2 ^ 0xAE405F03BD87CF12L;
        Class383.field1296[2] = l2 ^ 0xAE405F03BD87CF08L;
        Class383.field1296[61] = l2 ^ 0xAE405F03BD87CF35L;
        Class383.field1296[62] = l2 ^ 0xAE405F03BD87CF2AL;
        Class383.field1296[42] = l2 ^ 0xAE405F03BD87CF1AL;
        Class383.field1296[57] = l2 ^ 0xAE405F03BD87CF18L;
        Class383.field1296[33] = l2 ^ 0xAE405F03BD87CF1CL;
        Class383.field1296[43] = l2 ^ 0xAE405F03BD87CF45L;
        Class383.field1296[64] = l2 ^ 0xAE405F03BD87CF31L;
        Class383.field1296[65] = l2 ^ 0xAE405F03BD87CF44L;
        Class383.field1296[56] = l2 ^ 0xAE405F03BD87CF06L;
        Class383.field1296[21] = l2 ^ 0xAE405F03BD87CF47L;
        Class383.field1296[50] = l2 ^ 0xAE405F03BD87CF29L;
        Class383.field1296[40] = l2 ^ 0xAE405F03BD87CF39L;
        Class383.field1296[55] = l2 ^ 0xAE405F03BD87CF38L;
        Class383.field1296[47] = l2 ^ 0xAE405F03BD87CF0DL;
        Class383.field1296[66] = l2 ^ 0xAE405F03BD87CF26L;
        Class383.field1296[15] = l2 ^ 0xAE405F03BD87CF28L;
        Class383.field1296[49] = l2 ^ 0xAE405F03BD87CF0FL;
        Class383.field1296[27] = l2 ^ 0xAE405F03BD87CF2EL;
        Class383.field1296[20] = l2 ^ 0xAE405F03BD87CF2BL;
        Class383.field1296[67] = l2 ^ 0xAE405F03BD87CF2DL;
        Class383.field1296[71] = l2 ^ 0xAE405F03BD87CF3AL;
        Class383.field1296[73] = l2 ^ 0xAE405F03BD87CF11L;
        Class383.field1296[51] = l2 ^ 0xAE405F03BD87CF1EL;
        Class383.field1296[77] = l2 ^ 0xAE405F03BD87CF40L;
        Class383.field1296[13] = l2 ^ 0xAE405F03BD87CF4AL;
        Class383.field1296[53] = l2 ^ 0xAE405F03BD87CFB5L;
        Class383.field1296[35] = l2 ^ 0xAE405F03BD87CF05L;
        Class383.field1296[45] = l2 ^ 0xAE405F03BD87CF34L;
    }

    private static void method5162() {
        Class3979.method19561();
    }

    public static class_746 method5163(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5164() {
        Class1807.method15744();
    }

    public static class_746 method5165(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5166(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5167() {
        Class5836.method22885();
    }

    public static double method5168(class_243 class_2432) {
        return class_2432.field_1351;
    }

    @Override
    public void method1279() {
        this.field1299 = (int)field1296[1];
        this.field1295 = 0.0;
    }

    public static double method5169(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5170(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static void method5171() {
        Class5836.method22885();
    }

    private static void method5172() {
        Class5836.method22897();
    }

    private static void method5173(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    @Class1
    public void method5174(Class65 e2) {
        if (e2.method128() == Class383.method5133()) {
            while (true) {
                // Infinite loop
            }
        }
    }

    public static Class248 method5175(Class383 class383) {
        return class383.field1292;
    }

    private static void method5176(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static Class5496 method5177() {
        return Class5723.field11048;
    }

    public static class_746 method5178(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5179(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5180() {
        Class1807.method15744();
    }

    public static Class248 method5181(Class383 class383) {
        return class383.field1292;
    }

    private static Class1387 method5182() {
        return Class383.method5138();
    }

    public static Class3850 method5183() {
        return Class5723.field11058;
    }

    private static void method5184() {
        Class5836.method22885();
    }

    private static void method5185(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    @Override
    public void method1274() {
        Class383.method5230(this, (int)field1296[1]);
    }

    private static void method5186() {
        Class6009.method23560();
    }

    public static double method5187(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5188() {
        Class5836.method22897();
    }

    private Boolean method1269() {
        return (this.field1292.method507() == Class602.field2929 ? (int)field1296[0] : (int)field1296[1]) != 0;
    }

    public static int method5189(Class383 class383) {
        return class383.field1299;
    }

    public static Class248 method5190(Class383 class383) {
        return class383.field1292;
    }

    private static void method5191() {
        Class1745.method15538();
    }

    private static void method5192(Class204 class204, double d2) {
        class204.method391(d2);
    }

    private static void method5193() {
        Class1745.method15538();
    }

    public static float method5194(class_241 class_2412) {
        return class_2412.field_1343;
    }

    @Override
    public String method1248() {
        return Class5587.method21919((Enum)Class383.method5175(this).method507());
    }

    private static void method5195(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method5196(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method5197(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5198() {
        Class6009.method23561();
    }

    public static class_746 method5199(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method5200(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5201() {
        Class5659.method22184();
    }

    public static class_746 method5202(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static double method5203(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static int method5204(int n2, int n3, Class5670 class5670, Class455 class455) {
        return Class1327.method13657(n2, n3, class5670, class455);
    }

    public static class_746 method5205(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method5206(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class1387 method5207() {
        return Class5723.field11052;
    }

    public static Class1387 method5208() {
        return Class5723.field11052;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5209(Class133 a2) {
        if (Class383.field290.field_1724 == null || Class383.field290.field_1687 == null || Class383.method5134(field290) instanceof class_434) {
            return;
        }
        if (!(a2.method251() instanceof class_2708)) {
            int n2 = 41946;
            Class1807.method15744();
            return;
        }
        int n3 = 41945;
        block4: while (true) {
            switch (n3) {
                case 41946: {
                    n3 = 41944;
                    continue block4;
                }
                case 41945: {
                    if (!((Boolean)this.field1297.method507()).booleanValue()) return;
                    this.method1268();
                    return;
                }
            }
            break;
        }
    }

    public static class_746 method5210(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method5211(int n2, int n3, Class3766 class3766, Class686 class686) {
        return Class1327.method13692(n2, n3, class3766, class686);
    }

    private static void method5212() {
        Class5836.method22897();
    }

    private static void method5213(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static double method5214(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static class_638 method5215(class_310 class_3102) {
        return class_3102.field_1687;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5216(Class63 k2) {
        block16: {
            block17: {
                block15: {
                    if (Class383.field290.field_1724 == null || k2.method128() != Class543.field2690) break block15;
                    double l2 = Class383.field290.field_1724.method_23317() - Class383.field290.field_1724.field_6014;
                    double m2 = Class383.field290.field_1724.method_23321() - Class383.field290.field_1724.field_5969;
                    this.field1295 = Math.sqrt(l2 * l2 + m2 * m2);
                    if (this.field1292.method507() != Class383.method5155()) break block16;
                    break block17;
                }
                return;
            }
            class_238 h2 = Class383.field290.field_1724.method_5829();
            int i2 = (int)field1296[1];
            double a2 = 0.0;
            if (a2 < Class4182.field9757) {
                if (Class383.field290.field_1687.method_8587((class_1297)Class383.field290.field_1724, h2.method_989(0.0, 0.0, 0.0))) {
                    a2 = 0.01;
                    Class6454.method24594();
                    return;
                }
                i2 = (int)field1296[0];
            }
            int n2 = i2 == 0 ? 23555 : 23556;
            block4: while (true) {
                switch (n2) {
                    case 23556: {
                        n2 = 23554;
                        continue block4;
                    }
                    case 23555: {
                        return;
                    }
                }
                break;
            }
            int j2 = (int)field1296[4];
            for (int c2 = (int)field1296[1]; c2 < (int)field1296[5]; ++c2) {
                class_1799 b2 = Class383.field290.field_1724.method_31548().method_5438(c2);
                if (!(b2.method_7909() instanceof class_1770)) continue;
                j2 = c2;
                Class298.method1924();
                return;
            }
            if (j2 == (int)field1296[4]) {
                return;
            }
            if (Class383.field290.field_1724.method_24828()) {
                Class383.field290.field_1724.method_6043();
            } else if (Class383.field290.field_1724.method_18798().field_1351 < 0.0 && !Class383.field290.field_1724.method_6128()) {
                Class5723.field11058.method18914(j2 >= (int)field1296[2] ? j2 : j2 + (int)field1296[5], (int)field1296[1], class_1713.field_7790);
                Class5723.field11058.method18914((int)field1296[3], (int)field1296[1], class_1713.field_7790);
                Class5723.field11058.method18914(j2 < (int)field1296[2] ? j2 + (int)field1296[5] : j2, (int)field1296[1], Class383.method5240());
                Class383.method5177().method21341((class_2596)new class_2848((class_1297)Class383.field290.field_1724, class_2848.class_2849.field_12982));
                Class383.field290.field_1724.method_23669();
                Class5723.field11058.method18914((int)field1296[3], (int)field1296[1], class_1713.field_7790);
                Class383.method5183().method18914(j2 >= (int)field1296[2] ? j2 : j2 + (int)field1296[5], (int)field1296[1], class_1713.field_7790);
                Class5723.field11058.method18914((int)field1296[3], (int)field1296[1], class_1713.field_7790);
            }
            if (((Boolean)this.field1293.method507()).booleanValue()) {
                if (!Class383.field290.field_1724.method_6128() || Class383.field290.field_1724.method_5799() || Class383.method5197(field290).method_5771() || (float)Class383.field290.field_1724.method_7344().method_7586() <= Class851.field3713) {
                    return;
                }
                if (Class383.method5169(Class383.field290.field_1724.method_18798()) < 0.0) {
                    double d2 = (double)0.014f * Math.cos(Math.toRadians(Class383.field290.field_1724.method_36454() + Class1276.field4982));
                    double e2 = (double)0.014f * Math.sin(Math.toRadians(Class383.field290.field_1724.method_36454() + 90.0f));
                    class_243 f2 = new class_243(d2, 0.0, e2);
                    class_243 g2 = Class383.field290.field_1724.method_18798();
                    Class5723.field11052.method14005(Class383.method5249(g2) + f2.field_1352, g2.field_1350 + f2.field_1350);
                }
            }
        }
    }

    public static Class3978 method5217() {
        return Class5723.field11047;
    }

    private static void method5218() {
        Class4146.method20697();
    }

    private static void method5219(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static class_746 method5220(class_310 class_3102) {
        return Class383.method5142(class_3102);
    }

    public static double method5221(Class383 class383) {
        return class383.field1290;
    }

    public static double method5222(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static Class1387 method5223() {
        return Class5723.field11052;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Class1
    public void method5224(Class204 h2) {
        if (Class383.method5196(this.field1292) != Class602.field2929) return;
        if (Class383.method5163(field290) == null) return;
        if (Class383.field290.field_1687 == null) return;
        if (Class280.method1355().method1265()) return;
        if (!Class390.method5496().method5533()) {
            int n2 = 63667;
            Class1503.method14417(0.5061791f, Class3672.field8218);
            return;
        }
        int n3 = 63668;
        block4: while (true) {
            switch (n3) {
                case 63668: {
                    n3 = 63666;
                    continue block4;
                }
                case 63667: {
                    if (Class305.method2203().method1265()) return;
                    if (Class1807.method15742()) break block4;
                }
                default: {
                    return;
                }
            }
            break;
        }
        double d2 = 1.0;
        double e2 = 1.0;
        if (Class383.field290.field_1724.method_6059(class_1294.field_5904)) {
            double a2 = Class383.field290.field_1724.method_6112(Class383.method5227()).method_5578();
            d2 = 1.0 + 0.2 * (a2 + 1.0);
        }
        if (Class383.method5146(field290).method_6059(class_1294.field_5909)) {
            double b2 = Class383.field290.field_1724.method_6112(class_1294.field_5909).method_5578();
            e2 = 1.0 + Class4115.field9541 * (b2 + 1.0);
        }
        double f2 = (double)0.2873f * d2 / e2;
        if (this.field1299 == 0) {
            this.field1299 = (int)field1296[0];
            this.field1290 = (double)((Float)this.field1294.method507()).floatValue() * f2 - 0.01;
        } else if (Class383.method5154(this) == (int)field1296[0]) {
            this.field1299 = (int)field1296[6];
            Class383.method5231().method14002(Class1268.field4958);
            Class383.method5192(h2, Class881.field3798);
            this.field1290 *= 2.149;
        } else if (Class383.method5189(this) == (int)field1296[6]) {
            this.field1299 = (int)field1296[7];
            double c2 = 0.66 * (this.field1295 - f2);
            this.field1290 = this.field1295 - c2;
        } else {
            if (!Class383.field290.field_1687.method_8587((class_1297)Class383.field290.field_1724, Class383.field290.field_1724.method_5829().method_989(0.0, Class383.field290.field_1724.method_18798().method_10214(), 0.0)) || Class383.field290.field_1724.field_5992) {
                this.field1299 = (int)field1296[1];
            }
            this.field1290 = Class383.method5232(this) - this.field1295 / 159.0;
        }
        this.field1290 = Math.max(Class383.method5221(this), f2);
        h2.method10();
        class_241 g2 = Class352.method4109().method4197((float)this.field1290);
        h2.method386(Class383.method5194(g2));
        h2.method389(g2.field_1342);
    }

    public static Class602 method5225() {
        return Class602.field2926;
    }

    private static int method5226(int n2, int n3, Class419 class419, Class91 class91) {
        return Class1327.method13713(n2, n3, class419, class91);
    }

    public static class_6880 method5227() {
        return class_1294.field_5904;
    }

    public static double method5228(Class383 class383) {
        return class383.field1295;
    }

    public static double method5229(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static void method5230(Class383 class383, int n2) {
        class383.field1291 = n2;
    }

    public static Class1387 method5231() {
        return Class5723.field11052;
    }

    private static double method5232(Class383 class383) {
        return Class383.method5228(class383);
    }

    private static int method5233(int n2, int n3, Class24 class24, Class15 class15) {
        return Class1327.method13645(n2, n3, class24, class15);
    }

    public static double method5234(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static double method5235(class_243 class_2432) {
        return class_2432.field_1351;
    }

    public static class_746 method5236(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5237(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static void method5238() {
        Class4146.method20694();
    }

    private static void method5239() {
        Class1745.method15538();
    }

    public static class_1713 method5240() {
        return class_1713.field_7790;
    }

    public static double method5241(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5242(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_634 method5243(class_746 class_7462) {
        return class_7462.field_3944;
    }

    private static void method5244(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    public static int method5245(Class383 class383) {
        return class383.field1291;
    }

    private static void method5246(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static void method5247(Class383 class383, int n2) {
        class383.field1298 = n2;
    }

    private static void method5248(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static double method5249(class_243 class_2432) {
        return Class383.method5229(class_2432);
    }

    public static double method5250(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method5251() {
        Class4146.method20697();
    }

    public static class_746 method5252(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method5253(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5254(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5255(Class148 a2) {
        int n2 = Class383.method5149(this.field1292) == Class383.method5225() ? 41431 : 41432;
        block4: while (true) {
            switch (n2) {
                case 41432: {
                    n2 = 41430;
                    continue block4;
                }
                case 41431: {
                    if (a2.method292() != Class383.field290.field_1724) {
                        return;
                    }
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static void method5256(long l2) {
        Class383.method5161(l2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

