/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.item.PickaxeItem
 *  net.minecraft.item.SwordItem
 *  net.minecraft.item.TridentItem
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.MaceItem
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import mapped.Class1;
import mapped.Class1123;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class167;
import mapped.Class1681;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class201;
import mapped.Class228;
import mapped.Class246;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3454;
import mapped.Class3511;
import mapped.Class374;
import mapped.Blink;
import mapped.Class3814;
import mapped.Disabler;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class530;
import mapped.Class542;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5648;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5852;
import mapped.Class5905;
import mapped.Class6009;
import mapped.Class612;
import mapped.Class6127;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class694;
import mapped.Class773;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.util.hit.HitResult;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.MaceItem;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Offhand
extends Class278 {
    Class248 field1015;
    private long field1016;
    Class248 field1017;
    Class248 field1018;
    Class248 field1019;
    Class248 field1020;
    private boolean field1021;
    private static long[] field1022 = new long[9];
    private int field1023;
    private int field1024;
    private boolean field1025;
    Class248 field1026 = this.method450(new Class260("Item", "The item to wield in your offhand", Class612.field2977, Class612.values()));
    private boolean field1027;
    private class_1792 field1028;
    Class248 field1029;
    Class248 field1030 = this.method450(new Class252("Health", "The health required to fall below before swapping to a totem", Float.valueOf(0.0f), Float.valueOf(14.0f), Float.valueOf(36.0f)));
    private static Offhand INSTANCE;
    Class248 field1031 = this.method450(new Class253("SwordGap", "Equips a golden apple if holding down the item use button", (boolean)field1022[1]));
    Class248 field1032;
    Class248 field1033;
    Class248 field1034;
    private class_1792 field1035;
    Class248 field1036;

    private static void method3885() {
        Class5836.method22890();
    }

    private static void method3886() {
        Class4146.method20697();
    }

    private static int method3887(class_1792 class_17922) {
        return Class4196.method20813(class_17922);
    }

    private static class_746 method3888(class_310 class_3102) {
        return Offhand.method3899(class_3102);
    }

    private static void method3889(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method3890(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3891(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method3892(Class248 class248) {
        return class248.method507();
    }

    public static boolean method3893(Offhand class351) {
        return class351.field1025;
    }

    private static void method3894() {
        Class6009.method23560();
    }

    private static void method3895() {
        Class4146.method20694();
    }

    private static void method3896(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_239 method3897(class_310 class_3102) {
        return class_3102.field_1765;
    }

    private static void method3898(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    static {
        Offhand.method3919(-83979887782282276L);
    }

    public static class_746 method3899(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3900() {
        Class1503.method14420();
    }

    private void method3901() {
        if (this.method1265()) {
            Offhand.method3917(this, (!this.field1021 ? (int)field1022[1] : (int)field1022[0]) != 0);
        }
    }

    public Offhand() {
        super("Offhand", "Automatically replenishes the item in your offhand", Class556.field2758);
        this.field1015 = this.method450(new Class253("PickaxeGap", "Equips a golden apple if holding down the item use button", (boolean)field1022[0]));
        this.field1033 = this.method450(new Class253("TotemGap", "Equips a golden apple if holding down the item use button", (boolean)field1022[0]));
        this.field1032 = this.method450(new Class253("RightclickGap", "Equips a golden apple if holding down the item use button", (boolean)field1022[0]));
        this.field1020 = this.method450(new Class253("Crapple", "Uses a normal golden apple if Absorption is present", (boolean)field1022[1]));
        this.field1036 = this.method450(new Class253("Lethal", "Calculates lethal damage sources", (boolean)field1022[0]));
        this.field1019 = this.method450(new Class253("Fall", "Calculates fall damage sources", (boolean)field1022[0]));
        this.field1018 = this.method450(new Class253("Alternative", "Replaces totem using the swap packet", (boolean)field1022[0]));
        this.field1034 = this.method450(new Class253("Debug", "Debug on death", (boolean)field1022[0]));
        this.field1017 = this.method450(new Class259("Chorus", "Swaps chorus item when click", new Class246(this.method472() + "-chorusswap", (int)field1022[3], this::method3901)));
        this.field1029 = this.method450(new Class259("Shield", "Swaps shield item when click", new Class246(this.method472() + "-shieldswap", (int)field1022[3], this::method3921)));
        INSTANCE = this;
        Class246[] class246Array = new Class246[(int)field1022[2]];
        class246Array[(int)Offhand.field1022[0]] = (Class246)this.field1017.method507();
        class246Array[(int)Offhand.field1022[1]] = (Class246)this.field1029.method507();
        Class5723.field11059.method24181(class246Array);
    }

    private static void method3902() {
        Class4146.method20694();
    }

    public static class_636 method3903(class_310 class_3102) {
        return class_3102.field_1761;
    }

    public static class_638 method3904(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static void method3905(Offhand class351, class_1792 class_17922) {
        class351.field1035 = class_17922;
    }

    @Override
    public void method1279() {
        super.method1279();
        this.field1024 = (int)field1022[3];
        Offhand.method3905(this, null);
        this.field1028 = null;
    }

    public static Class248 method3906(Offhand class351) {
        return class351.field1033;
    }

    @Class1
    public void method3907(Class228 a2) {
        this.field1023 = Offhand.method3909(class_1802.field_8288);
    }

    private Set method3908() {
        LinkedHashSet<String> a2 = new LinkedHashSet<String>();
        if (Offhand.method3890((class_310)Offhand.field290).field_7512.field_7763 != 0) {
            a2.add("Current screen handler is not the player inventory");
        }
        if (!Offhand.field290.field_1724.field_7512.method_34255().method_7960()) {
            a2.add("Totem was not placed in offhand on time");
        }
        return a2;
    }

    private static int method3909(class_1792 class_17922) {
        return Class4196.method20813(class_17922);
    }

    private static void method3910() {
        Class3979.method19561();
    }

    private static void method3911() {
        Class3979.method19561();
    }

    private static void method3912(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class248 method3913(Offhand class351) {
        return class351.field1020;
    }

    private class_1792 method3914() {
        block2: {
            block3: {
                if (!((Boolean)Offhand.method3913(this).method507()).booleanValue() || !Class4196.method20811(class_1802.field_8463, (boolean)field1022[1])) break block2;
                if (Offhand.method3943(field290).method_6059(class_1294.field_5898)) break block3;
                if (Class4196.method20811(class_1802.field_8367, (boolean)field1022[1])) break block2;
            }
            return class_1802.field_8463;
        }
        return class_1802.field_8367;
    }

    private static void method3915() {
        Class4146.method20697();
    }

    private static int method3916(int n2, int n3, Class1123 class1123, Class530 class530) {
        return Class1681.method15323(n2, n3, class1123, class530);
    }

    private static void method3917(Offhand class351, boolean bl2) {
        Offhand.method3953(class351, bl2);
    }

    private static void method3918() {
        Class6009.method23561();
    }

    private static void method3919(long l2) {
        Offhand.field1022[0] = l2 ^ 0xFED5A4BCAC75BBDCL;
        Offhand.field1022[3] = l2 ^ 0x12A5B43538A4423L;
        Offhand.field1022[5] = l2 ^ 0xFED5A4BCAC75BBFFL;
        Offhand.field1022[4] = l2 ^ 0xFED5A4BCAC75BBF8L;
        Offhand.field1022[1] = l2 ^ 0xFED5A4BCAC75BBDDL;
        Offhand.field1022[6] = l2 ^ 0xFED5A4BCAC75BBD5L;
        Offhand.field1022[2] = l2 ^ 0xFED5A4BCAC75BBDEL;
        Offhand.field1022[8] = l2 ^ 0xFED5A4BCAC75BBF4L;
        Offhand.field1022[7] = l2 ^ 0xFED5A4BCAC75BBF1L;
    }

    private static void method3920() {
        Class5836.method22885();
    }

    private void method3921() {
        if (this.method1265()) {
            this.field1025 = !Offhand.method3965(this) ? (int)field1022[1] : (int)field1022[0];
        }
    }

    private static int method3922(int n2, int n3, Disabler class390, Class3511 class3511) {
        return Class1681.method15301(n2, n3, class390, class3511);
    }

    private static void method3923() {
        Class1807.method15744();
    }

    private static int method3924(int n2, int n3, Class3454 class3454, Class167 class167) {
        return Class1681.method15341(n2, n3, class3454, class167);
    }

    private static void method3925() {
        Class6009.method23560();
    }

    public static Class248 method3926(Offhand class351) {
        return class351.field1030;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method3927(Class133 e) {
        block9: {
            block8: {
                block10: {
                    if (Offhand.field290.field_1724 == null || Offhand.field290.field_1687 == null) {
                        return;
                    }
                    var2_2 = e.method251();
                    if (!(var2_2 instanceof class_2749)) {
                        Class5659.method22184();
                        return;
                    }
                    c = (class_2749)var2_2;
                    if (!(c.method_11833() <= 0.0f)) break block9;
                    if (!((Boolean)this.field1034.method507()).booleanValue()) break block10;
                    v0 = 41664;
                    ** GOTO lbl17
                }
                v0 = 41665;
                if (true) ** GOTO lbl17
                do {
                    v0 = var4_4 = 41663;
lbl17:
                    // 3 sources

                    if (var4_4 == 41664) break block8;
                } while (var4_4 == 41665);
                break block9;
            }
            if (this.field1023 <= 0) {
                return;
            }
            b = Offhand.method3961(this);
            if (b.isEmpty()) {
                a = System.currentTimeMillis() - Offhand.method3970(this);
                v1 = new Object[(int)Offhand.field1022[1]];
                v1[(int)Offhand.field1022[0]] = a;
                this.method1249("Failed to replace totem in %sms!", v1);
            } else {
                v2 = new Object[(int)Offhand.field1022[1]];
                v2[(int)Offhand.field1022[0]] = String.join((CharSequence)", ", b);
                this.method1249("Failed to replace totem! Possible reasons: %s", v2);
            }
        }
        if ((var2_2 = e.method251()) instanceof class_2653 && (d = (class_2653)var2_2).method_11450() == (int)Offhand.field1022[7] && this.field1028 == class_1802.field_8288) {
            if (Offhand.field290.field_1724.method_6079().method_7909() != Offhand.method3947() || !d.method_11449().method_7960()) {
                return;
            }
            this.field1016 = System.currentTimeMillis();
        }
    }

    public static void method3928(Offhand class351, boolean bl2) {
        class351.field1027 = bl2;
    }

    private static void method3929(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static int method3930(int n2, int n3, Class374 class374, Class3814 class3814) {
        return Class1681.method15306(n2, n3, class374, class3814);
    }

    public static class_315 method3931(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public static int method3932(Offhand class351) {
        return class351.field1024;
    }

    public static Offhand method3933() {
        return INSTANCE;
    }

    public static int method3934(Offhand class351) {
        return class351.field1024;
    }

    public static void method3935(Offhand class351, boolean bl2) {
        class351.field1027 = bl2;
    }

    private static boolean method3936(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method3937(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method3938(Offhand class351) {
        return class351.field1030;
    }

    public static boolean method3939(Offhand class351) {
        return class351.field1025;
    }

    private static void method3940(float f2) {
        Class5836.method22907(f2);
    }

    private static void method3941(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method3942(int n2, int n3, Class694 class694, Class773 class773) {
        return Class1681.method15303(n2, n3, class694, class773);
    }

    public static class_746 method3943(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3944(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3945(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static class_746 method3946(class_310 class_3102) {
        return Offhand.method3891(class_3102);
    }

    public static class_1792 method3947() {
        return class_1802.field_8288;
    }

    private static void method3948() {
        Class5836.method22885();
    }

    public static void method3949(Offhand class351, class_1792 class_17922) {
        class351.field1028 = class_17922;
    }

    public static class_746 method3950(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method3951(int n2, int n3, Class201 class201, Class542 class542) {
        return Class1681.method15300(n2, n3, class201, class542);
    }

    private static void method3952(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Override
    public String method1248() {
        if (Offhand.method3939(this)) {
            return "Shield," + Class4196.method20813(class_1802.field_8288);
        }
        if (this.field1021) {
            return "Chorus, " + Offhand.method3887(class_1802.field_8288);
        }
        return String.valueOf(Class4196.method20813(class_1802.field_8288));
    }

    public static void method3953(Offhand class351, boolean bl2) {
        class351.field1021 = bl2;
    }

    public static class_1792 method3954(Offhand class351) {
        return class351.field1028;
    }

    private static float method3955() {
        return Class5659.method22208();
    }

    public static class_746 method3956(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3957() {
        Class5836.method22890();
    }

    private static void method3958(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static long method3959(Offhand class351) {
        return class351.field1016;
    }

    private static Class248 method3960(Offhand class351) {
        return Offhand.method3938(class351);
    }

    private static Set method3961(Offhand class351) {
        return class351.method3908();
    }

    private boolean method3962(float d2) {
        ArrayList e2 = Lists.newArrayList((Iterable)Offhand.field290.field_1687.method_18112());
        for (class_1297 c2 : e2) {
            if (c2 == null || !c2.method_5805() || !(c2 instanceof class_1511)) continue;
            class_1511 a2 = (class_1511)c2;
            if (Offhand.field290.field_1724.method_5858(c2) > 144.0) {
                return Blink.method4987();
            }
            double b2 = Class5905.method23257((class_1297)Offhand.field290.field_1724, a2.method_19538(), (boolean)field1022[0]);
            if ((double)d2 - b2 > (double)((Float)Offhand.method3926(this).method507()).floatValue()) continue;
            return (int)field1022[1] != 0;
        }
        return (int)field1022[0] != 0;
    }

    private static void method3963(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method3964() {
        Class5836.method22897();
    }

    private static boolean method3965(Offhand class351) {
        return Offhand.method3893(class351);
    }

    private static class_239 method3966(class_310 class_3102) {
        return Offhand.method3897(class_3102);
    }

    private boolean method3967() {
        float a2 = Class5659.method22208();
        return (a2 <= ((Float)this.field1030.method507()).floatValue() || (Boolean)this.field1036.method507() != false && this.method3962(a2) || (float)Class5659.method22205(Offhand.method3888((class_310)Offhand.field290).field_6017, 1.0f) + 0.5f > Offhand.field290.field_1724.method_6032() && (Boolean)this.field1019.method507() != false ? (int)field1022[1] : (int)field1022[0]) != 0;
    }

    private static void method3968() {
        Class1503.method14420();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Class1(priority=0x7FFFFFFE)
    public void method3969(Class63 g) {
        block37: {
            block42: {
                block41: {
                    block39: {
                        block40: {
                            block38: {
                                if (Offhand.field290.field_1724 == null || g.method128() != Class543.field2690) {
                                    return;
                                }
                                Offhand.method3949(this, ((Class612)this.field1026.method507()).method11303());
                                if (this.field1021) break block38;
                                if (!this.field1025) break block39;
                                break block40;
                            }
                            if (Offhand.method3946(Offhand.field290).method_7357().method_7904(class_1802.field_8233)) {
                                this.field1021 = (int)Offhand.field1022[0];
                                this.method3969(g);
                                return;
                            }
                            this.field1028 = class_1802.field_8233;
                            break block37;
                        }
                        this.field1028 = class_1802.field_8255;
                        break block37;
                    }
                    if (!this.method3967()) break block41;
                    this.field1028 = class_1802.field_8288;
                    break block37;
                }
                c = Offhand.field290.field_1724.method_6047().method_7909();
                if (!Offhand.method3931((class_310)Offhand.field290).field_1904.method_1434()) break block37;
                if (!((Boolean)Offhand.method3892(this.field1031)).booleanValue()) ** GOTO lbl45
                if (c instanceof class_1829) break block42;
                if (!(c instanceof class_1835)) {
                    v0 = 22315;
                    Class1745.method15538();
                    return;
                }
                v1 = 22316;
                block12: while (true) {
                    switch (v1) {
                        case 22316: {
                            v1 = 22314;
                            continue block12;
                        }
                        case 22315: {
                            v2 = c instanceof class_9362 == false ? 23736 : 23737;
                            block13: while (true) {
                                switch (v2) {
                                    case 23737: {
                                        v2 = 23735;
                                        continue block13;
                                    }
                                    case 23736: {
                                        if (c instanceof class_1743) break block42;
lbl45:
                                        // 2 sources

                                        if (((Boolean)this.field1015.method507()).booleanValue() && c instanceof class_1810 || ((Boolean)Offhand.method3906(this).method507()).booleanValue() && c == class_1802.field_8288) break block12;
                                        if (!((Boolean)this.field1032.method507()).booleanValue()) break block37;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            if (Offhand.method3955() >= ((Float)Offhand.method3960(this).method507()).floatValue()) {
                var3_4 = Offhand.method3966(Offhand.field290);
                if (!(var3_4 instanceof class_3965)) {
                    this.field1028 = this.method3914();
                } else {
                    b = (class_3965)var3_4;
                    a = Offhand.method3904(Offhand.field290).method_8320(b.method_17777());
                    if (!Class5852.method22958(a)) {
                        this.field1028 = this.method3914();
                    }
                }
            }
        }
        if (Offhand.field290.field_1724.method_6079().method_7909() == this.field1028) {
            return;
        }
        h = (int)Offhand.field1022[5];
        if (this.field1024 != (int)Offhand.field1022[3] && this.field1035 != null && (e = Offhand.method3950(Offhand.field290).method_31548().method_5438(Offhand.method3934(this))).method_7909().equals(this.field1028) && this.field1035.equals(Offhand.field290.field_1724.method_6079().method_7909())) {
            d = Offhand.method3932(this);
            this.field1024 = (int)Offhand.field1022[3];
            this.field1035 = null;
            h = d;
        }
        block14: while (true) {
            v3 = h >= 0 ? 4238 : 4239;
            block15: while (true) {
                switch (v3) {
                    case 4239: {
                        v3 = 4237;
                        continue block15;
                    }
                    case 4238: {
                        if (Offhand.method3944(Offhand.field290).method_31548().method_5438(h).method_7909() == this.field1028) {
                            if (h < (int)Offhand.field1022[6]) {
                                this.field1035 = Offhand.method3954(this);
                                this.field1024 = h;
                            }
                            if (h < (int)Offhand.field1022[6]) {
                                v4 = h + (int)Offhand.field1022[4];
                                Offhand.method3894();
                                return;
                            }
                            f = h;
                            Offhand.method3928(this, (boolean)Offhand.field1022[1]);
                            if (((Boolean)this.field1018.method507()).booleanValue()) {
                                Offhand.field290.field_1761.method_2906((int)Offhand.field1022[0], f, (int)Offhand.field1022[8], class_1713.field_7791, (class_1657)Offhand.field290.field_1724);
                                this.field1027 = (int)Offhand.field1022[0];
                                return;
                            }
                            if (Offhand.field290.field_1724.field_7512.method_34255().method_7909() != this.field1028) {
                                Offhand.method3903(Offhand.field290).method_2906((int)Offhand.field1022[0], f, (int)Offhand.field1022[0], class_1713.field_7790, (class_1657)Offhand.field290.field_1724);
                            }
                            if (Offhand.method3956((class_310)Offhand.field290).field_7512.method_34255().method_7909() == this.field1028) {
                                Offhand.field290.field_1761.method_2906((int)Offhand.field1022[0], (int)Offhand.field1022[7], (int)Offhand.field1022[0], class_1713.field_7790, (class_1657)Offhand.field290.field_1724);
                                this.field1023 = Class4196.method20813(class_1802.field_8288) + (int)Offhand.field1022[1];
                            }
                            Offhand.method3935(this, (boolean)Offhand.field1022[0]);
                            if (!Offhand.field290.field_1724.field_7512.method_34255().method_7960()) {
                                if (Offhand.field290.field_1724.method_6079().method_7909() != this.field1028) {
                                    v5 = 9762;
                                    Class6009.method23559(false);
                                    return;
                                }
                                v6 = 9761;
                                while (true) {
                                    if ((var5_8 = v6) == 9761) {
                                        Offhand.field290.field_1761.method_2906((int)Offhand.field1022[0], f, (int)Offhand.field1022[0], class_1713.field_7790, (class_1657)Offhand.field290.field_1724);
                                        return;
                                    }
                                    if (var5_8 != 9762) break;
                                    v6 = 9760;
                                }
                            }
                        }
                        --h;
                        continue block14;
                    }
                }
                break;
            }
            break;
        }
    }

    private static long method3970(Offhand class351) {
        return Offhand.method3959(class351);
    }

    private static int method3971(int n2, int n3, Class6127 class6127, Class5648 class5648) {
        return Class1681.method15318(n2, n3, class6127, class5648);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

