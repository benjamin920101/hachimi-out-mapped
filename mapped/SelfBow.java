/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.TippedArrowItem
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 */
package mapped;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class210;
import mapped.Step;
import mapped.Class3724;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class411;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5983;
import mapped.Class6009;
import mapped.Class6188;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class715;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TippedArrowItem;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SelfBow
extends Class411 {
    private final Set field1533 = new HashSet();
    private static SelfBow INSTANCE;
    private static long[] field1534;
    private int field1535;

    private static void method6571(long l2) {
        SelfBow.field1534[3] = l2 ^ 0x8135D0021A90857AL;
        SelfBow.field1534[5] = l2 ^ 0x7ECA2FFDE56F7A8CL;
        SelfBow.field1534[4] = l2 ^ 0x8135D0021A908557L;
        SelfBow.field1534[1] = l2 ^ 0x8135D0021A908573L;
        SelfBow.field1534[0] = l2 ^ 0x8135D0021A908780L;
        SelfBow.field1534[2] = l2 ^ 0x8135D0021A908572L;
    }

    public static class_1713 method6572() {
        return class_1713.field_7790;
    }

    private static void method6573() {
        Class5659.method22184();
    }

    private static int method6574(SelfBow class413) {
        return SelfBow.method6577(class413);
    }

    private static int method6575(int n2, int n3, Class715 class715, Step class338) {
        return Class5983.method23406(n2, n3, class715, class338);
    }

    public static SelfBow method6576() {
        return INSTANCE;
    }

    public SelfBow() {
        super("SelfBow", "Shoots player with beneficial tipped arrows", Class556.field2758, (int)field1534[0]);
        INSTANCE = this;
    }

    public static int method6577(SelfBow class413) {
        return class413.field1535;
    }

    private static void method6578(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6579() {
        Class1807.method15744();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6580(Class210 h2) {
        int i2 = (int)field1534[5];
        class_1293 j2 = null;
        for (int e2 = (int)field1534[1]; e2 < (int)field1534[4]; ++e2) {
            class_1799 d2 = SelfBow.field290.field_1724.method_31548().method_5438(e2);
            if (d2.method_7960()) continue;
            if (!(d2.method_7909() instanceof class_1833)) {
                Class5836.method22907(0.29288912f);
                return;
            }
            if (d2.method_57353().method_57832(class_9334.field_49651)) {
                List c2 = (List)((class_1844)d2.method_57353().method_57829(class_9334.field_49651)).method_57397();
                Iterator iterator = c2.iterator();
                if (!iterator.hasNext()) {
                    Class1668.method15147(-2005605449, -1207744929, 1550748250, 1328942420);
                    return;
                }
                class_1293 b2 = (class_1293)iterator.next();
                class_1291 a2 = (class_1291)b2.method_5579().comp_349();
                if (a2.method_5573() && !this.field1533.contains(b2)) {
                    i2 = e2;
                    j2 = b2;
                } else {
                    Class4146.method20697();
                    return;
                }
            }
            if (i2 != (int)field1534[5]) break;
        }
        int k2 = (int)field1534[5];
        for (int g2 = (int)field1534[1]; g2 < (int)field1534[3]; ++g2) {
            class_1799 f2 = SelfBow.method6584(field290).method_31548().method_5438(g2);
            if (f2.method_7960() || f2.method_7909() != class_1802.field_8102) continue;
            k2 = g2;
            break;
        }
        float l2 = class_1753.method_7722((int)SelfBow.method6574(this));
        if (SelfBow.field290.field_1724.method_6047().method_7909() != class_1802.field_8102 || k2 == (int)field1534[5] || i2 == (int)field1534[5]) {
            this.method1268();
            return;
        }
        this.method6465(SelfBow.field290.field_1724.method_36454(), -90.0f);
        if (i2 != (int)field1534[3]) {
            if (SelfBow.field290.field_1724.field_7512.method_34255().method_7909() != SelfBow.method6585()) {
                SelfBow.field290.field_1761.method_2906((int)field1534[1], i2 < (int)field1534[3] ? i2 + (int)field1534[4] : i2, (int)field1534[1], SelfBow.method6572(), (class_1657)SelfBow.field290.field_1724);
            }
            if (SelfBow.field290.field_1724.field_7512.method_34255().method_7909() == SelfBow.method6586()) {
                SelfBow.field290.field_1761.method_2906((int)field1534[1], (int)field1534[3], (int)field1534[1], SelfBow.method6595(), (class_1657)SelfBow.field290.field_1724);
            }
            if (!SelfBow.field290.field_1724.field_7512.method_34255().method_7960()) {
                SelfBow.field290.field_1761.method_2906((int)field1534[1], i2 < (int)field1534[3] ? i2 + (int)field1534[4] : i2, (int)field1534[1], SelfBow.method6606(), (class_1657)SelfBow.field290.field_1724);
            }
        }
        if (!(l2 >= 0.15f)) {
            SelfBow.field290.field_1690.field_1904.method_23481((boolean)field1534[2]);
            this.field1535 = SelfBow.method6596(this) + (int)field1534[2];
            return;
        }
        this.field1533.add(j2);
        SelfBow.field290.field_1690.field_1904.method_23481((boolean)field1534[1]);
        Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
        SelfBow.field290.field_1724.method_6075();
        this.field1535 = (int)field1534[1];
    }

    private static int method6581(int n2, int n3, Class6322 class6322, Class3724 class3724) {
        return Class5983.method23399(n2, n3, class6322, class3724);
    }

    private static void method6582(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    static {
        field1534 = new long[6];
        SelfBow.method6571(-9136167561596992141L);
    }

    private static void method6583(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method6584(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1792 method6585() {
        return class_1802.field_8087;
    }

    @Override
    public void method1279() {
        ((Class6188)SelfBow.method6602(SelfBow.field290.field_1690)).method24106();
        this.field1533.clear();
    }

    public static class_1792 method6586() {
        return class_1802.field_8087;
    }

    private static void method6587() {
        Class5836.method22897();
    }

    private static void method6588() {
        Class5659.method22184();
    }

    private static void method6589() {
        Class6454.method24594();
    }

    private static void method6590() {
        Class3979.method19561();
    }

    private static void method6591(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6592(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6593(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method6594() {
        Class5836.method22890();
    }

    public static class_1713 method6595() {
        return class_1713.field_7790;
    }

    public static int method6596(SelfBow class413) {
        return class413.field1535;
    }

    private static void method6597() {
        Class5836.method22885();
    }

    private static void method6598(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6599() {
        Class5836.method22890();
    }

    private static void method6600(float f2) {
        Class5836.method22907(f2);
    }

    private static void method6601() {
        Class5659.method22184();
    }

    public static class_304 method6602(class_315 class_3152) {
        return class_3152.field_1904;
    }

    private static void method6603() {
        Class3979.method19561();
    }

    private static void method6604() {
        Class1503.method14420();
    }

    private static void method6605() {
        Class4146.method20697();
    }

    public static class_1713 method6606() {
        return class_1713.field_7790;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

