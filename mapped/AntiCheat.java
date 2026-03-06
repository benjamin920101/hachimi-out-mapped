/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Chams;
import mapped.Class3240;
import mapped.Class451;
import mapped.Class480;
import mapped.Class487;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5703;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class631;
import mapped.Class68;
import mapped.Class925;
import mapped.Class926;
import net.hachimi.client.mixin.bH;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.HitResult;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AntiCheat
extends Class451 {
    Class248 field2388;
    private static AntiCheat INSTANCE;
    private final Class925 field2389 = new Class926();
    Class248 field2390;
    Class248 field2391;
    private float field2392;
    Class248 field2393;
    Class248 field2394;
    Class248 field2395;
    Class248 field2396;
    Class248 field2397;
    Class248 field2398;
    Class248 field2399;
    Class248 field2400;
    Class248 field2401;
    Class248 field2402;
    private static long[] field2403;
    Class248 field2404 = this.method450(new Class260("Mode", "Applies anticheat optimizations", Class631.field3085, Class631.values()));
    Class248 field2405;

    public AntiCheat() {
        super("AntiCheat", "Settings for anticheat configs", Class556.field2757);
        this.field2390 = this.method450(new Class260("Placement", "Check if the direction can be clicked (used to bypass anti cheat)", Class487.field2524, Class487.values()));
        this.field2396 = this.method450(new Class260("EntitySwing", "Swing side for attack entity", Class480.field2509, Class480.values()));
        this.field2391 = this.method450(new Class260("PlaceSwing", "Swing side for block interaction", Class480.field2509, Class480.values()));
        this.field2397 = this.method450(new Class252("BreakDelay", "Delay for break crystal", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(20.0f)));
        this.field2401 = this.method450(new Class253("AttackPacket", "Use packet to attack entity", (boolean)field2403[1]));
        this.field2388 = this.method450(new Class253("InteractPacket", "Use packet to interact blocks (recommended enable, prevent ghost blocks)", (boolean)field2403[1]));
        this.field2399 = this.method450(new Class253("MultiPlace", "Allows placement on unconfirmed blocks", (boolean)field2403[1]));
        this.field2395 = this.method450(new Class253("MultiPoint", "Use the closest hit vector for block interaction", (boolean)field2403[1]));
        this.field2402 = this.method450(new Class253("ClosestDirection", "Use the closest direction for block interaction", (boolean)field2403[1]));
        this.field2393 = this.method450(new Class253("GrimAirplace", "Allow you air place on Grim AntiCheat (Version restrictions)", (boolean)field2403[0]));
        this.field2400 = this.method450(new Class253("SneakingSpoof", "When interact block is clickable send sneak packet", (boolean)field2403[0]));
        this.field2405 = this.method450(new Class253("Pick", "Use pick to swap item (SwapAction-Pick)", (boolean)field2403[1]));
        this.field2394 = this.method450(new Class252("Damage", "Multiplier for mining progress required", 0.0, 1.0, Class5703.field10980));
        this.field2398 = this.method450(new Class253("RaytraceFix", "Allows you to spoof your raytrace", (boolean)field2403[0], this::method10590));
        this.field2392 = Float.NaN;
        INSTANCE = this;
    }

    private static void method10556(long l2) {
        AntiCheat.field2403[0] = l2 ^ 0x7C55AA50F22E3EF5L;
        AntiCheat.field2403[1] = l2 ^ 0x7C55AA50F22E3EF4L;
        AntiCheat.field2403[2] = l2 ^ 0x7C55AA50F22E3E0FL;
    }

    private static void method10557() {
        Chams.method1924();
    }

    public Class480 method10558() {
        return (Class480)((Object)this.field2391.method507());
    }

    public boolean method10559() {
        return (this.field2404.method507() == Class631.field3084 ? (int)field2403[1] : (int)field2403[0]) != 0;
    }

    public Boolean method10560() {
        return (Boolean)AntiCheat.method10575(AntiCheat.method10578(this));
    }

    public static void method10561(AntiCheat class455, float f2) {
        class455.field2392 = f2;
    }

    static {
        field2403 = new long[3];
        AntiCheat.method10574(8959254298360692469L);
    }

    public static Class248 method10562(AntiCheat class455) {
        return class455.field2390;
    }

    public Boolean method10563() {
        return (Boolean)AntiCheat.method10585(this.field2401);
    }

    private static void method10564() {
        Class5836.method22890();
    }

    public static Class248 method10565(AntiCheat class455) {
        return class455.field2402;
    }

    private static Object method10566(Class248 class248) {
        return class248.method507();
    }

    private static Class248 method10567(AntiCheat class455) {
        return AntiCheat.method10562(class455);
    }

    public static Class248 method10568(AntiCheat class455) {
        return class455.field2394;
    }

    public Class487 method10569() {
        return (Class487)((Object)AntiCheat.method10567(this).method507());
    }

    private static boolean method10570() {
        return Class1807.method15753();
    }

    private static Class248 method10571(Class68 class68) {
        return class68.method140();
    }

    private static Object method10572(Class248 class248) {
        return class248.method507();
    }

    public Float method10573() {
        return (Float)this.field2397.method507();
    }

    private static void method10574(long l2) {
        AntiCheat.method10556(l2);
    }

    private static Object method10575(Class248 class248) {
        return class248.method507();
    }

    public Boolean method10576() {
        return (Boolean)AntiCheat.method10565(this).method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method10577(Class63 a2) {
        int n2 = a2.method128() == AntiCheat.method10592() ? 54548 : 54549;
        block4: while (true) {
            switch (n2) {
                case 54549: {
                    n2 = 54547;
                    continue block4;
                }
                case 54548: {
                    Class1745.method15538();
                    return;
                }
            }
            break;
        }
    }

    public static Class248 method10578(AntiCheat class455) {
        return class455.field2388;
    }

    public boolean method10579() {
        return (Boolean)this.field2400.method507();
    }

    private static void method10580() {
        Class1807.method15744();
    }

    public static AntiCheat method10581() {
        return INSTANCE;
    }

    @Class1
    public void method10582(Class68 a2) {
        if (a2.method128() == Class543.field2691) {
            if (AntiCheat.method10571(a2) == this.field2398 && !((Boolean)this.field2398.method507()).booleanValue()) {
                this.field2392 = Float.NaN;
            }
        }
    }

    private static Object method10583(Class248 class248) {
        return class248.method507();
    }

    public Class480 method10584() {
        return (Class480)((Object)this.field2396.method507());
    }

    private static Object method10585(Class248 class248) {
        return class248.method507();
    }

    public boolean method10586() {
        return (this.field2404.method507() == Class631.field3086 ? (int)field2403[1] : (int)field2403[0]) != 0;
    }

    public static class_746 method10587(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=10000)
    public void method10588(Class131 f2) {
        class_2828 e2;
        class_2596 class_25962;
        if (AntiCheat.field290.field_1724 == null || AntiCheat.field290.field_1687 == null) {
            return;
        }
        int n2 = !this.method10586() ? 29163 : 29162;
        block4: while (true) {
            switch (n2) {
                case 29163: {
                    n2 = 29161;
                    continue block4;
                }
                case 29162: {
                    if (!((Boolean)AntiCheat.method10593(this).method507()).booleanValue() || !((class_25962 = f2.method251()) instanceof class_2885)) break block4;
                    class_2885 d2 = (class_2885)class_25962;
                    if (!this.field2389.method12595((int)field2403[2])) break block4;
                    class_3965 a2 = d2.method_12543();
                    class_2338 b2 = a2.method_17777();
                    class_3965 c2 = AntiCheat.field290.field_1687.method_17742(new class_3959(AntiCheat.method10587(field290).method_33571(), b2.method_46558().method_43206(a2.method_17780(), 0.5), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)AntiCheat.field290.field_1724));
                    if (!AntiCheat.field290.field_1687.method_18026(AntiCheat.field290.field_1724.method_5829().method_1012(0.0, Class3240.field6950, 0.0))) {
                        Class1503.method14420();
                        return;
                    }
                    if (c2 == null || c2.method_17783() != class_239.class_240.field_1332 || c2.method_17777().equals((Object)b2)) break block4;
                    AntiCheat.method10561(this, -75.0f);
                    this.field2389.method12593();
                    break block4;
                }
            }
            break;
        }
        class_25962 = f2.method251();
        if (class_25962 instanceof class_2828 && (e2 = (class_2828)class_25962).method_36172()) {
            if (Float.isNaN(this.field2392)) {
                Class5659.method22184();
                return;
            }
            ((bH)e2).hookSetPitch(this.field2392);
            this.field2392 = Float.NaN;
        }
    }

    public Boolean method10589() {
        return (Boolean)AntiCheat.method10566(this.field2399);
    }

    private Boolean method10590() {
        return (AntiCheat.method10572(this.field2404) == Class631.field3086 ? (int)field2403[1] : (int)field2403[0]) != 0;
    }

    public boolean method10591() {
        return (Boolean)this.field2405.method507();
    }

    private static Class543 method10592() {
        return AntiCheat.method10596();
    }

    public static Class248 method10593(AntiCheat class455) {
        return class455.field2398;
    }

    public Boolean method10594() {
        return (Boolean)AntiCheat.method10583(this.field2395);
    }

    private static Class248 method10595(AntiCheat class455) {
        return AntiCheat.method10568(class455);
    }

    public static Class543 method10596() {
        return Class543.field2690;
    }

    public Double method10597() {
        return (Double)AntiCheat.method10595(this).method507();
    }

    public Boolean method10598() {
        return (Boolean)this.field2393.method507();
    }

    private static void method10599() {
        Class6009.method23560();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

