/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import mapped.Class1;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class246;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class260;
import mapped.BetterChat;
import mapped.Blink;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class4045;
import mapped.Class411;
import mapped.Class4146;
import mapped.Velocity;
import mapped.Class480;
import mapped.Class5550;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6154;
import mapped.Class6433;
import mapped.Class6454;
import mapped.Class747;
import mapped.Class803;
import mapped.Class926;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoPotion
extends Class411 {
    Class926 field2203;
    Class248 field2204;
    Class248 field2205;
    Class248 field2206 = this.method450(new Class252("Delay", "Interval between throwing potions", Float.valueOf(0.0f), Float.valueOf(2.0f), Float.valueOf(10.0f)));
    Class248 field2207;
    Class248 field2208;
    public static AutoPotion INSTANCE;
    Class248 field2209;
    Class248 field2210;
    Class248 field2211 = this.method450(new Class253("SwapAlternative", "Uses inventory swap for swapping to potions", (boolean)field2212[3]));
    private static long[] field2212;
    Class248 field2213;

    private static void method9545(long l2) {
        AutoPotion.field2212[6] = l2 ^ 0x9D059EF2D81D2C51L;
        AutoPotion.field2212[7] = l2 ^ 0x9D059EF2D81D2C75L;
        AutoPotion.field2212[0] = l2 ^ 0x9D059EF2D81D2C58L;
        AutoPotion.field2212[5] = l2 ^ 0x9D059EF2D81D2FDCL;
        AutoPotion.field2212[3] = l2 ^ 0x9D059EF2D81D2C59L;
        AutoPotion.field2212[8] = l2 ^ 0x9D059EF2D81D2C7CL;
        AutoPotion.field2212[1] = l2 ^ 0x62FA610D27E2D3A7L;
        AutoPotion.field2212[4] = l2 ^ 0x9D059EF2D81D2C5BL;
        AutoPotion.field2212[2] = l2 ^ 0x9D059EF2D81D2C5AL;
    }

    public AutoPotion() {
        super("AutoPotion", "Automatically throws pot silently.", Class556.field2758, (int)field2212[5]);
        this.field2207 = this.method450(new Class253("Always", "Always inventory swap", (boolean)field2212[0], this.field2211::method507));
        this.field2213 = this.method450(new Class260("Swing", "Swing side for throw", Class480.field2509, Class480.values()));
        this.field2208 = this.method450(new Class253("Speed", "Throw out the Speed potion", (boolean)field2212[0]));
        this.field2209 = this.method450(new Class253("Resistance", "Throw out the Resistance potion", (boolean)field2212[0]));
        this.field2204 = this.method450(new Class253("Strength", "Throw out the Strength potion", (boolean)field2212[0]));
        this.field2210 = this.method450(new Class253("MultiTask", "Allows throwing while using items", (boolean)field2212[3]));
        this.field2205 = this.method450(new Class253("GroundOnly", "Only throw potions while on ground", (boolean)field2212[0]));
        this.field2203 = new Class926();
        INSTANCE = this;
        Class248 a2 = this.method450(new Class259("ResistanceKey", "Press to throw out the Resistance potion", new Class246(this.method472() + "-resistance", (int)field2212[1], this::method9593)));
        Class248 b2 = this.method450(new Class259("StrengthKey", "Press to throw out the Strength potion", new Class246(this.method472() + "-strength", (int)field2212[1], this::method9565)));
        Class248 c2 = this.method450(new Class259("SpeedKey", "Press to throw out the Speed potion", new Class246(this.method472() + "-speed", (int)field2212[1], this::method9548)));
        Class246[] class246Array = new Class246[(int)field2212[4]];
        class246Array[(int)AutoPotion.field2212[0]] = (Class246)c2.method507();
        class246Array[(int)AutoPotion.field2212[3]] = (Class246)b2.method507();
        class246Array[(int)AutoPotion.field2212[2]] = (Class246)a2.method507();
        Class5723.field11059.method24181(class246Array);
    }

    private static void method9546() {
        Class6009.method23560();
    }

    private static boolean method9547() {
        return Class5659.method22111();
    }

    private void method9548() {
        this.method9561(class_1294.field_5904);
    }

    public static class_746 method9549(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method9550() {
        return Class5659.method22194();
    }

    private static Object method9551(Class248 class248) {
        return class248.method507();
    }

    private static int method9552(AutoPotion class441, class_6880 class_68802) {
        return class441.method9587(class_68802);
    }

    static {
        field2212 = new long[9];
        AutoPotion.method9545(-7132119669026247592L);
    }

    private static int method9553() {
        return Class5550.method21885();
    }

    private static void method9554() {
        Class4146.method20694();
    }

    private static int method9555(int n2, int n3, Class6154 class6154, BetterChat class362) {
        return Class6433.method24534(n2, n3, class6154, class362);
    }

    private static boolean method9556(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static Class248 method9557(AutoPotion class441) {
        return class441.field2211;
    }

    private static void method9558() {
        Class5836.method22890();
    }

    private static void method9559(Class926 class926) {
        class926.method12593();
    }

    public static class_6880 method9560() {
        return class_1294.field_5910;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method9561(class_6880 c) {
        block15: {
            block18: {
                block17: {
                    block16: {
                        if (!((Boolean)AutoPotion.method9585(this).method507()).booleanValue()) {
                            if (AutoPotion.field290.field_1724.method_6115()) {
                                return (boolean)((int)AutoPotion.field2212[0]);
                            }
                        }
                        d = AutoPotion.method9552(this, c);
                        if (d == (int)AutoPotion.field2212[1]) break block15;
                        a = Class5723.field11058.method18969();
                        b = AutoPotion.method9577(AutoPotion.field290).method_36454();
                        if (!((Boolean)AutoPotion.method9581(this).method507()).booleanValue() || !((Boolean)AutoPotion.method9551(this.field2207)).booleanValue()) break block16;
                        Class5723.field11058.method18951(d, Class5723.field11058.method18969());
                        break block17;
                    }
                    if (d < (int)AutoPotion.field2212[6]) {
                        AutoPotion.method9589().method18887(d);
                        return Class3979.method19551();
                    }
                    if (((Boolean)this.field2211.method507()).booleanValue()) {
                        v0 = 13837;
                        return Class3979.method19551();
                    }
                    v1 = 13838;
                    if (true) ** GOTO lbl22
                    block8: while (true) {
                        v1 = 13836;
lbl22:
                        // 2 sources

                        switch (v1) {
                            case 13838: {
                                continue block8;
                            }
                            case 13837: {
                                Class5723.field11058.method18951(d, AutoPotion.method9576().method18969());
                            }
                        }
                        break;
                    }
                }
                Class1503.method14417(b, 90.0f);
                Class5723.field11048.method21353((class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, method9590(float int ), (I)Lnet/minecraft/class_2596;)((float)b));
                ((Class480)AutoPotion.method9580(this.field2213)).method10782(class_1268.field_5808);
                if (!((Boolean)this.field2211.method507()).booleanValue()) ** GOTO lbl-1000
                if (!((Boolean)this.field2207.method507()).booleanValue()) break block18;
                v2 = 64556;
                ** GOTO lbl40
            }
            v2 = 64557;
            if (true) ** GOTO lbl40
            block9: while (true) {
                v2 = 64555;
lbl40:
                // 3 sources

                switch (v2) {
                    case 64557: {
                        continue block9;
                    }
                    case 64556: {
                        AutoPotion.method9562(AutoPotion.method9569(), d, Class5723.field11058.method18969());
                        break block9;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (d < (int)AutoPotion.field2212[6]) {
                            AutoPotion.method9563().method18987(a);
                            break block9;
                        }
                        if (!((Boolean)this.field2211.method507()).booleanValue()) break block9;
                        Class5723.field11058.method18951(d, Class5723.field11058.method18969());
                    }
                }
                break;
            }
            AutoPotion.method9568();
            return (boolean)((int)AutoPotion.field2212[3]);
        }
        return (boolean)((int)AutoPotion.field2212[0]);
    }

    private static void method9562(Class3850 class3850, int n2, int n3) {
        class3850.method18951(n2, n3);
    }

    public static Class3850 method9563() {
        return Class5723.field11058;
    }

    private static void method9564() {
        Class6454.method24594();
    }

    private void method9565() {
        this.method9561(AutoPotion.method9560());
    }

    public static Class248 method9566(AutoPotion class441) {
        return class441.field2206;
    }

    public static Class248 method9567(AutoPotion class441) {
        return class441.field2210;
    }

    private static void method9568() {
        Class1503.method14420();
    }

    public static Class3850 method9569() {
        return Class5723.field11058;
    }

    public static class_746 method9570(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1792 method9571() {
        return class_1802.field_8436;
    }

    private static boolean method9572() {
        return Class1807.method15742();
    }

    private static int method9573(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method9574() {
        return Class6454.method24637();
    }

    private static boolean method9575() {
        return Class3979.method19551();
    }

    public static Class3850 method9576() {
        return Class5723.field11058;
    }

    public static class_746 method9577(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class248 method9578(AutoPotion class441) {
        return AutoPotion.method9566(class441);
    }

    private static Object method9579(Class248 class248) {
        return class248.method507();
    }

    private static Object method9580(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method9581(AutoPotion class441) {
        return AutoPotion.method9557(class441);
    }

    private static boolean method9582(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static int method9583(int n2) {
        return Class4045.method20095(n2);
    }

    public static Class248 method9584(AutoPotion class441) {
        return class441.field2211;
    }

    public static Class248 method9585(AutoPotion class441) {
        return class441.field2210;
    }

    private static int method9586() {
        return Class5550.method21885();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int method9587(class_6880 e2) {
        int d2 = (int)field2212[0];
        block4: while (true) {
            if (((Boolean)AutoPotion.method9584(this).method507()).booleanValue()) {
                int n2 = (int)field2212[7];
                return Class4045.method20096(1642479266);
            }
            int n3 = d2 < (int)field2212[6] ? 28915 : 28916;
            block5: while (true) {
                switch (n3) {
                    case 28916: {
                        n3 = 28914;
                        continue block5;
                    }
                    case 28915: {
                        class_1799 b2 = AutoPotion.field290.field_1724.method_31548().method_5438(d2);
                        if (b2.method_7909() == AutoPotion.method9571()) {
                            class_1844 c2 = (class_1844)b2.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
                            for (class_1293 a2 : c2.method_57397()) {
                                int n4;
                                if (a2.method_5579() != e2) continue;
                                if (d2 < (int)field2212[6]) {
                                    n4 = d2 + (int)field2212[8];
                                    return n4;
                                }
                                n4 = d2;
                                return n4;
                            }
                        }
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return (int)field2212[1];
    }

    private static boolean method9588() {
        return Class3979.method19539();
    }

    public static Class3850 method9589() {
        return Class5723.field11058;
    }

    private static class_2596 method9590(float a2, int b2) {
        return new class_2886(class_1268.field_5808, b2, a2, 90.0f);
    }

    @Class1
    public void method9591(Class210 a2) {
        block14: {
            block13: {
                if (!this.field2203.method12595(Float.valueOf(((Float)AutoPotion.method9578(this).method507()).floatValue() * 1000.0f))) {
                    return;
                }
                if (!((Boolean)AutoPotion.method9567(this).method507()).booleanValue() && AutoPotion.field290.field_1724.method_6115()) {
                    return;
                }
                if (Blink.method4987()) {
                    return;
                }
                if (!((Boolean)this.field2205.method507()).booleanValue() || AutoPotion.field290.field_1724.method_24828()) break block13;
                if (!Class5659.method22193(1.0) || !Velocity.method10292((class_1297)AutoPotion.method9549(field290), new class_238(AutoPotion.method9570(field290).method_24515().method_10074()))) break block14;
            }
            if (((Boolean)this.field2209.method507()).booleanValue() && (!AutoPotion.field290.field_1724.method_6059(class_1294.field_5907) || AutoPotion.field290.field_1724.method_6112(class_1294.field_5907).method_5578() < (int)field2212[3])) {
                if (!this.method9561(class_1294.field_5907)) {
                    Class6454.method24636(0.10121254405067359, 0.07974829666330774, Class747.field3383, 0.1040188173982769);
                    return;
                }
                AutoPotion.method9559(this.field2203);
                return;
            }
            if (((Boolean)AutoPotion.method9579(this.field2208)).booleanValue()) {
                if (!AutoPotion.field290.field_1724.method_6059(class_1294.field_5904)) {
                    if (this.method9561(class_1294.field_5904)) {
                        this.field2203.method12593();
                        return;
                    }
                }
            }
            if (((Boolean)this.field2204.method507()).booleanValue() && !AutoPotion.field290.field_1724.method_6059(class_1294.field_5910)) {
                if (this.method9561(class_1294.field_5910)) {
                    this.field2203.method12593();
                }
            }
        }
    }

    private static void method9592() {
        Class6009.method23560();
    }

    private void method9593() {
        this.method9561(class_1294.field_5907);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

