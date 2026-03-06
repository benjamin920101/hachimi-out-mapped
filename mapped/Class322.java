/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerAbilities
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class119;
import mapped.Class131;
import mapped.Class1329;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class175;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class303;
import mapped.Class3812;
import mapped.Class3833;
import mapped.Class4132;
import mapped.Class4146;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class559;
import mapped.Class5628;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5868;
import mapped.Class6009;
import mapped.Class606;
import mapped.Class607;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class72;
import mapped.Class926;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class322
extends Class278 {
    private final Class248 field754;
    Class248 field755;
    public static Class322 INSTANCE;
    private final Class248 field756;
    boolean field757;
    Class248 field758;
    private final Class248 field759 = this.method450(new Class260("Mode", "Mode", Class559.field2770, Class559.values()));
    Class926 field760;
    private static long[] field761;
    private final Class248 field762;

    private static void method2714(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=100)
    public void method2715(Class131 f2) {
        block17: {
            int n2;
            block18: {
                block16: {
                    if (Class322.method2736(field290) == null) return;
                    int n3 = Class322.field290.field_1687 != null ? 19517 : 19518;
                    block8: while (true) {
                        switch (n3) {
                            case 19518: {
                                n3 = 19516;
                                continue block8;
                            }
                            case 19517: {
                                if (!this.field757) break block8;
                            }
                            default: {
                                return;
                            }
                        }
                        break;
                    }
                    if (!this.field760.method12595(Float.valueOf(((Float)this.field758.method507()).floatValue() * 1000.0f))) {
                        return;
                    }
                    if (this.field759.method507() != Class559.field2770) break block16;
                    if (Class322.field290.field_1724.method_6047().method_7909() != Class322.method2724()) {
                        return;
                    }
                    class_2596 class_25962 = f2.method251();
                    if (!(class_25962 instanceof Class3833)) return;
                    Class3833 b2 = (Class3833)class_25962;
                    if (b2.method18777() != Class606.field2947) return;
                    if (((Boolean)this.field756.method507()).booleanValue() && !Class322.field290.field_1724.method_24828() && !Class322.method2718(Class322.field290.field_1724.method_31549())) {
                        return;
                    }
                    if (Class322.field290.field_1724.method_5771()) return;
                    if (Class322.field290.field_1724.method_5869()) return;
                    if (!((Boolean)this.field754.method507()).booleanValue()) break block17;
                    n2 = b2.method18778() instanceof class_1511 ? 10711 : 10712;
                    break block18;
                }
                if (Class322.method2745(this.field759) != Class559.field2769) return;
                class_2596 a2 = f2.method251();
                if (!(a2 instanceof Class3833)) return;
                Class3833 e2 = (Class3833)a2;
                if (e2.method18777() != Class606.field2947) return;
                if (((Boolean)this.field754.method507()).booleanValue() && e2.method18778() instanceof class_1511) {
                    return;
                }
                Class3812 d2 = new Class3812(class_1802.field_49814, (Class607)((Object)this.field755.method507())).method18502();
                if (!Class322.method2732(d2)) return;
                int c2 = Class5723.field11058.method18969();
                Class322.method2721(this, (boolean)field761[0]);
                d2.method18531(c2);
                Class322.method2743(Class322.method2727(), f2.method251());
                d2.method18534(c2);
                this.field757 = (int)field761[1];
                this.field760.method12593();
                f2.method10();
                return;
            }
            block9: while (true) {
                switch (n2) {
                    case 10712: {
                        n2 = 10710;
                        continue block9;
                    }
                    case 10711: {
                        return;
                    }
                }
                break;
            }
        }
        int a2 = (int)field761[1];
        while (true) {
            if (a2 >= (int)field761[2]) {
                Class322.method2722(this, ((Float)Class322.method2717(this).method507()).floatValue());
                this.method2742(0.0);
                this.field760.method12593();
                return;
            }
            this.method2742(0.0);
            ++a2;
        }
    }

    private static void method2716() {
        Class5659.method22184();
    }

    public static Class248 method2717(Class322 class322) {
        return class322.field762;
    }

    public static boolean method2718(class_1656 class_16562) {
        return class_16562.field_7479;
    }

    public static Class248 method2719(Class322 class322) {
        return class322.field759;
    }

    public static Class559 method2720() {
        return Class559.field2770;
    }

    public static void method2721(Class322 class322, boolean bl2) {
        class322.field757 = bl2;
    }

    private static void method2722(Class322 class322, double d2) {
        class322.method2742(d2);
    }

    public static class_746 method2723(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1792 method2724() {
        return class_1802.field_49814;
    }

    private static int method2725(int n2, int n3, Class72 class72, Class4132 class4132) {
        return Class5868.method23149(n2, n3, class72, class4132);
    }

    private static void method2726(long l2) {
        Class322.field761[0] = l2 ^ 0xED976F17AA718571L;
        Class322.field761[2] = l2 ^ 0xED976F17AA718574L;
        Class322.field761[1] = l2 ^ 0xED976F17AA718570L;
    }

    public static Class5496 method2727() {
        return Class5723.field11048;
    }

    private static void method2728(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method2729(int n2, int n3, Class175 class175, Class119 class119) {
        return Class5868.method23154(n2, n3, class175, class119);
    }

    public Class322() {
        super("MaceSpoof", "", Class556.field2755);
        this.field754 = this.method450(new Class253("IgnoreCrystal", "Ignore hit crystal", (boolean)field761[0], this::method1269));
        this.field756 = this.method450(new Class253("GroundOnly", "Only works when you are landing", (boolean)field761[0], this::method1278));
        this.field762 = this.method450(new Class252("Height", "Spoof height", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(Class1329.field5142), (Number)Float.valueOf(2000.0f), this::method2731));
        this.field755 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class322.method2753(), this::method2746));
        this.field758 = this.method450(new Class252("Delay", "Delay triggered twice", Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(100.0f)));
        this.field760 = new Class926();
        this.field757 = (int)field761[1];
        INSTANCE = this;
    }

    private static void method2730(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private Boolean method2731() {
        if (Class322.method2734(Class322.method2747(this)) == Class322.method2720()) {
            int n2 = (int)field761[0];
            Class6454.method24594();
            return null;
        }
        return (boolean)field761[1];
    }

    private static boolean method2732(Class3812 class3812) {
        return class3812.method18523();
    }

    public static Class248 method2733(Class322 class322) {
        return class322.field759;
    }

    private static Object method2734(Class248 class248) {
        return class248.method507();
    }

    public static Class559 method2735() {
        return Class559.field2770;
    }

    public static class_746 method2736(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2737(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method2738(Class322 class322) {
        return class322.field759;
    }

    static {
        field761 = new long[3];
        Class322.method2726(-1326469417802824336L);
    }

    private static void method2739() {
        Class298.method1924();
    }

    private static void method2740() {
        Class5836.method22897();
    }

    private Boolean method1278() {
        return (this.field759.method507() == Class322.method2751() ? (int)field761[0] : (int)field761[1]) != 0;
    }

    public static Class559 method2741() {
        return Class559.field2769;
    }

    private void method2742(double a2) {
        Class322.field290.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(Class322.field290.field_1724.method_23317(), Class322.field290.field_1724.method_23318() + a2, Class322.method2723(field290).method_23321(), (boolean)field761[1]));
    }

    private static void method2743(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method2744() {
        Class5836.method22890();
    }

    private static Object method2745(Class248 class248) {
        return class248.method507();
    }

    private Boolean method2746() {
        return (Class322.method2719(this).method507() == Class559.field2769 ? (int)field761[0] : (int)field761[1]) != 0;
    }

    private static Class248 method2747(Class322 class322) {
        return Class322.method2733(class322);
    }

    private static int method2748(int n2, int n3, Class303 class303, Class5628 class5628) {
        return Class5868.method23146(n2, n3, class303, class5628);
    }

    private static void method2749(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method2750(float f2) {
        Class5836.method22907(f2);
    }

    private static Class559 method2751() {
        return Class322.method2735();
    }

    private static void method2752() {
        Class4146.method20694();
    }

    private static Class607[] method2753() {
        return Class607.values();
    }

    private static void method2754() {
        Class6454.method24594();
    }

    private Boolean method1269() {
        return (Class322.method2738(this).method507() == Class322.method2741() ? (int)field761[0] : (int)field761[1]) != 0;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

