/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.util.Window
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.world.World
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.util.math.Direction$AxisDirection
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.enums.ChestType
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.StringHelper
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1049;
import mapped.Class1074;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1313;
import mapped.Class133;
import mapped.Class1352;
import mapped.Class136;
import mapped.Class1466;
import mapped.Class1503;
import mapped.Class1560;
import mapped.Class1591;
import mapped.Class1668;
import mapped.Class167;
import mapped.Class1677;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class182;
import mapped.Class213;
import mapped.Class214;
import mapped.Class215;
import mapped.Class218;
import mapped.Class221;
import mapped.Class229;
import mapped.Class233;
import mapped.Class239;
import mapped.Class241;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class270;
import mapped.Class277;
import mapped.Class278;
import mapped.NoRotate;
import mapped.Nametags;
import mapped.Font;
import mapped.Chams;
import mapped.Class3041;
import mapped.SkinBlink;
import mapped.Class3234;
import mapped.Class3252;
import mapped.Class3293;
import mapped.AutoFish;
import mapped.Class3310;
import mapped.Class3334;
import mapped.Class3340;
import mapped.Timer;
import mapped.Class3357;
import mapped.Class3377;
import mapped.Class3384;
import mapped.AutoReconnect;
import mapped.FastLatency;
import mapped.Class3511;
import mapped.Class3556;
import mapped.AnvilRename;
import mapped.Blink;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Shaders;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4078;
import mapped.Class4141;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class4210;
import mapped.Class4244;
import mapped.AntiAim;
import mapped.Velocity;
import mapped.Colors;
import mapped.Class478;
import mapped.Class479;
import mapped.Class489;
import mapped.Class49;
import mapped.Class520;
import mapped.Class541;
import mapped.Class5444;
import mapped.Class5496;
import mapped.Class550;
import mapped.Class551;
import mapped.Class555;
import mapped.Class5550;
import mapped.Class5553;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5694;
import mapped.Class5723;
import mapped.Class5760;
import mapped.Class5836;
import mapped.Class5882;
import mapped.Class6;
import mapped.Class6009;
import mapped.Class6085;
import mapped.Class618;
import mapped.Class6213;
import mapped.Class6216;
import mapped.Class6283;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6402;
import mapped.Class6454;
import mapped.Class669;
import mapped.Class681;
import mapped.Class70;
import mapped.Class71;
import mapped.Class730;
import mapped.Class807;
import mapped.Class84;
import mapped.Class858;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.client.util.Window;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemConvertible;
import net.minecraft.world.World;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.Direction;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.StringHelper;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HUD
extends Class278 {
    Class248 field889;
    Class248 field890;
    private final Map field891;
    Class248 field892;
    Class248 field893;
    private static long[] field894 = new long[66];
    private float field895;
    private long field896;
    private final DecimalFormat field897 = new DecimalFormat("0.0#");
    Class248 field898;
    Class248 field899;
    Class248 field900;
    private final Class925 field901;
    private float field902;
    Class248 field903;
    private final Class6283 field904 = new Class6283((boolean)field894[0], 200.0f, Class489.field2551);
    Class248 field905;
    Class248 field906;
    Class248 field907;
    Class248 field908;
    Class248 field909;
    Class248 field910;
    private float field911;
    Class248 field912;
    private static HUD INSTANCE;
    private static final class_2960 field913;
    Class248 field914;
    Class248 field915;
    Class248 field916;
    private float field917;
    Class248 field918;
    Class248 field919;
    Class248 field920;
    Class248 field921;
    Class248 field922;
    private final Class6283 field923;
    Class248 field924;
    Class248 field925;
    Class248 field926;
    Class248 field927;
    Class248 field928;
    Class248 field929;
    Class248 field930;
    Class248 field931;
    Class248 field932;
    Class248 field933;
    Class248 field934;
    private boolean field935;
    Class248 field936;
    Class248 field937;
    Class248 field938;
    private final Class3293 field939 = new Class3293();
    private final Map field940;

    private Boolean method3235() {
        return (Boolean)this.field910.method507();
    }

    public static long method3236(HUD class339) {
        return class339.field896;
    }

    public HUD() {
        super("HUD", "Displays the HUD (heads up display) screen.", Class556.field2757);
        this.field891 = new HashMap();
        this.field940 = new ConcurrentSkipListMap();
        this.field901 = new Class926();
        this.field923 = new Class6283((boolean)field894[0], 300.0f, Class489.field2543);
        this.field906 = this.method450(new Class253("Watermark", "Displays client name and version watermark", (boolean)field894[1]));
        this.field898 = this.method450(new Class253("Logo", "Replace watermark with logo", (boolean)field894[1], this.field906::method507));
        this.field928 = this.method450(new Class252("Scale", "", (Number)Float.valueOf(Class3310.field7128), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(3.0f), this::method1269));
        this.field920 = this.method450(new Class253("ServerStatus", "Displays warning for server connection status", (boolean)field894[1]));
        this.field900 = this.method450(new Class253("Direction", "Displays facing direction", (boolean)field894[1]));
        this.field919 = this.method450(new Class253("Rotation", "Displays player yaw and pitch", (boolean)field894[0], this::method1278));
        this.field890 = this.method450(new Class253("Armor", "Displays player equipped armor and durability", (boolean)field894[1]));
        this.field907 = this.method450(new Class253("ArmorDurability", "Displays player equipped armor durability", (boolean)field894[0], this::method3525));
        this.field932 = this.method450(new Class253("Totems", "Displays player totems", (boolean)field894[0]));
        this.field927 = this.method450(new Class260("PotionHud", "Renders the Minecraft potion Hud", Class520.field2571, HUD.method3465()));
        this.field918 = this.method450(new Class260("ItemName", "Renders the Minecraft item name display", Class520.field2571, Class520.values()));
        this.field933 = this.method450(new Class253("DynamicY", "", (boolean)field894[0], this::method3501));
        this.field930 = this.method450(new Class252("YOffset", "", (Number)((int)field894[4]), (Number)((int)field894[0]), (Number)((int)field894[6]), this::method3479));
        this.field909 = this.method450(new Class252("XOffset", "", (Number)((int)field894[4]), (Number)((int)field894[0]), (Number)((int)field894[6]), this::method3481));
        this.field899 = this.method450(new Class253("PotionEffects", "Displays active potion effects", (boolean)field894[1]));
        this.field937 = this.method450(new Class260("PotionColors", "Displays active potion colors", Class618.field3009, Class618.values(), this::method3549));
        this.field922 = this.method450(new Class253("Durability", "Displays the current held items durability", (boolean)field894[0]));
        this.field892 = this.method450(new Class253("Coords", "Displays world coordinates", (boolean)field894[1]));
        this.field903 = this.method450(new Class253("NetherCoords", "Displays nether coordinates", (boolean)field894[1], this::method3311));
        this.field914 = this.method450(new Class253("ServerBrand", "Displays the current server brand", (boolean)field894[0]));
        this.field921 = this.method450(new Class253("Chests", "Displays the amount of chests in your render distance", (boolean)field894[0]));
        this.field915 = this.method450(new Class260("Speed", "Displays the current movement speed of the player", Class550.field2725, Class550.values()));
        this.field889 = this.method450(new Class253("Ping", "Display server response time in ms", (boolean)field894[1]));
        this.field916 = this.method450(new Class253("TPS", "Displays server ticks per second", (boolean)field894[1]));
        this.field912 = this.method450(new Class253("Packets", "Displays outbound packets per second", (boolean)field894[0]));
        this.field905 = this.method450(new Class253("FPS", "Displays game FPS", (boolean)field894[1]));
        this.field910 = this.method450(new Class253("Arraylist", "Displays a list of all active modules", (boolean)field894[1]));
        this.field908 = this.method450(new Class252("Arraylist-Time", "Timer for the animation", (int)field894[0], (int)field894[3], (int)field894[7]));
        this.field931 = this.method450(new Class260("Arraylist-Easing", "Animation easing", Class489.field2551, Class489.values()));
        this.field925 = this.method450(new Class260("Ordering", "The ordering of the arraylist", Class555.field2748, Class555.values(), this::method3235));
        this.field893 = this.method450(new Class260("Rendering", "The rendering mode of the HUD", Class551.field2728, Class551.values()));
        this.field938 = this.method450(new Class260("Rainbow", "The rendering mode for rainbow", Class541.field2683, Class541.values()));
        this.field924 = this.method450(new Class251("GradientColor", "The color of the rainbow gradient", Color.WHITE, (boolean)field894[0], (boolean)field894[0], this::method3491));
        this.field936 = this.method450(new Class252("Rainbow-Speed", "The speed for the rainbow color cycling", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(50.0f), (Number)Float.valueOf(100.0f), this::method3492));
        this.field934 = this.method450(new Class252("Rainbow-Saturation", "The saturation of rainbow colors", (Number)((int)field894[0]), (Number)((int)field894[5]), (Number)((int)field894[2]), this::method3264));
        this.field926 = this.method450(new Class252("Rainbow-Brightness", "The brightness of rainbow colors", (Number)((int)field894[0]), (Number)((int)field894[2]), (Number)((int)field894[2]), this::method3256));
        this.field929 = this.method450(new Class252("Rainbow-Difference", "The difference offset for rainbow colors", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(Class4141.field9620), (Number)Float.valueOf(100.0f), this::method3430));
        INSTANCE = this;
        this.method1264();
    }

    public static Class248 method3237(HUD class339) {
        return class339.field890;
    }

    private static int method3238(int n2) {
        return Nametags.method1495(n2);
    }

    public static class_746 method3239(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3240(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3241() {
        Class5836.method22897();
    }

    private static int method3242(String string) {
        return Class6454.method24719(string);
    }

    public static long method3243(HUD class339) {
        return class339.field896;
    }

    public static Class248 method3244(HUD class339) {
        return class339.field915;
    }

    private static int method3245(int n2) {
        return Nametags.method1495(n2);
    }

    private static double method3246(Class6283 class6283) {
        return class6283.method24281();
    }

    private static List method3247() {
        return Class1215.method13267();
    }

    private static void method3248(float f2) {
        Class5836.method22907(f2);
    }

    public static Map method3249(HUD class339) {
        return class339.field891;
    }

    private static int method3250(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static void method3251() {
        Class5659.method22184();
    }

    private static Object method3252(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3253(Class241 e2) {
        if (this.field918.method507() != Class520.field2573) {
            e2.method10();
        }
        if (this.field918.method507() != Class520.field2569) {
            return;
        }
        class_1041 b2 = field290.method_22683();
        int c2 = b2.method_4486() / (int)field894[9] - HUD.field290.field_1772.method_1727(e2.method433().getString()) / (int)field894[9] + (Integer)this.field909.method507();
        int n2 = b2.method_4502();
        Objects.requireNonNull(HUD.field290.field_1772);
        int d2 = n2 - (int)field894[16] - (int)field894[23] - (Integer)HUD.method3530(this.field930);
        if (((Boolean)this.field933.method507()).booleanValue()) {
            int a2 = !HUD.field290.field_1724.method_31548().field_7548.isEmpty() ? (int)field894[1] : (int)field894[0];
            int n3 = HUD.field290.field_1724.method_6067() > 0.0f ? 58443 : 58444;
            block4: while (true) {
                switch (n3) {
                    case 58444: {
                        n3 = 58442;
                        continue block4;
                    }
                    case 58443: {
                        d2 -= 9;
                        break block4;
                    }
                }
                break;
            }
            if (a2 != 0) {
                d2 -= 9;
            }
        }
        e2.method428(c2);
        e2.method434(d2);
    }

    private static int method3254() {
        return Class6454.method24637();
    }

    private static Class248 method3255(HUD class339) {
        return HUD.method3552(class339);
    }

    private Boolean method3256() {
        if (this.field938.method507() != Class541.field2683 && HUD.method3497(this.field938) != HUD.method3434()) {
            int n2 = (int)field894[1];
            while (true) {
                // Infinite loop
            }
        }
        return (boolean)field894[0];
    }

    private static void method3257() {
        Class4146.method20694();
    }

    @Class1
    public void method3258(Class63 a2) {
        if (HUD.field290.field_1687 == null || field290.method_1493()) {
            this.field901.method12593();
        }
    }

    private static int method3259(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method3260(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static HUD method3261() {
        return INSTANCE;
    }

    private static int method3262(int n2, int n3, Class478 class478, AntiAim class439) {
        return Class3234.method16530(n2, n3, class478, class439);
    }

    public static Class925 method3263(HUD class339) {
        return class339.field901;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method3264() {
        int n2;
        if (HUD.method3255(this).method507() != Class541.field2683 && HUD.method3378(this).method507() != Class541.field2678) {
            n2 = (int)field894[1];
            return n2 != 0;
        }
        n2 = (int)field894[0];
        return n2 != 0;
    }

    public static float method3265(HUD class339) {
        return class339.field911;
    }

    private static Class520 method3266() {
        return HUD.method3301();
    }

    private static Object method3267(Class248 class248) {
        return class248.method507();
    }

    private static int method3268(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3269(Class5496 class5496) {
        return class5496.method21337();
    }

    public static class_746 method3270(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method3271(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static void method3272(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_634 method3273(class_746 class_7462) {
        return class_7462.field_3944;
    }

    private static void method3274() {
        Class1745.method15538();
    }

    private static void method3275(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method3276() {
        return Class3979.method19551();
    }

    private static void method3277(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static int method3278(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    public static long method3279(HUD class339) {
        return class339.field896;
    }

    private static void method3280() {
        Class5836.method22890();
    }

    public static long method3281(HUD class339) {
        return class339.field896;
    }

    public static void method3282(HUD class339, float f2) {
        class339.field895 = f2;
    }

    private static Class248 method3283(HUD class339) {
        return HUD.method3375(class339);
    }

    public static float method3284(HUD class339) {
        return class339.field917;
    }

    public static float method3285(HUD class339) {
        return class339.field902;
    }

    @Class1
    public void method3286(Class84 a2) {
        a2.method10();
        a2.method173((float)HUD.method3320(this.field904));
    }

    public int method3287(long a2) {
        float[] b2 = new float[(int)field894[12]];
        Color c2 = HUD.method3399(Colors.method10620());
        Color.RGBtoHSB(c2.getRed(), c2.getGreen(), c2.getBlue(), b2);
        float d2 = (float)(((double)System.currentTimeMillis() * (double)(((Float)this.field936.method507()).floatValue() / Class3334.field7196) + (double)(a2 * field894[65])) % (double)(Class3384.field7357 / (((Float)this.field929.method507()).floatValue() / 100.0f)) / (double)(30000.0f / (((Float)this.field929.method507()).floatValue() / 20.0f)));
        float e2 = b2[(int)field894[9]] * Math.abs(d2 % 1.0f - 0.55f) + Class1313.field5098;
        return Color.HSBtoRGB(b2[(int)field894[0]], b2[(int)field894[1]], e2);
    }

    private static int method3288(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static void method3289(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private void method3290(Class233 a2, Class278 b2, long c2) {
        block5: {
            block4: {
                if (b2.method1275().method24281() <= (double)0.01f) break block4;
                if (!b2.method1280()) break block5;
            }
            return;
        }
        Class4210 d2 = (Class4210)HUD.method3249(this).get(b2.method472());
        if (d2 != null) {
            HUD.method3453(d2, a2.method6(), c2);
        }
    }

    public static float method3291(HUD class339) {
        return class339.field917;
    }

    private static void method3292() {
        Class1807.method15744();
    }

    private static int method3293(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static int method3294(int n2) {
        return Class4045.method20103(n2);
    }

    private static double method3295(Class6283 class6283) {
        return class6283.method24281();
    }

    private static int method3296(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static void method3297(float f2) {
        Class5836.method22907(f2);
    }

    private static void method3298(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static int method3299(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method3300() {
        return Class6454.method24637();
    }

    public static Class520 method3301() {
        return Class520.field2569;
    }

    private static void method3302(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method3303(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3304() {
        Class6009.method23561();
    }

    private static long method3305(HUD class339) {
        return HUD.method3281(class339);
    }

    private String method3306(String a2) {
        if (!Integer.valueOf("ARRAYLIST_INFO".hashCode()).equals(a2.hashCode())) {
            return " \u00a77[\u00a7f" + a2 + "\u00a77]";
        }
        return "";
    }

    private static void method3307() {
        Class1745.method15538();
    }

    @Class1
    public void method3308(Class71 a2) {
        if (a2.method147() == null && this.field904.method24288()) {
            HUD.method3324(this.field904, (boolean)field894[0]);
        } else {
            int n2;
            int n3 = n2 = a2.method147() instanceof class_408 ? 65135 : 65136;
            if (n2 != 65135) {
                if (n2 == 65136) {
                    Class1503.method14417(0.26019573f, 0.16418755f);
                    return;
                }
            } else {
                this.field904.method24284((boolean)field894[1]);
            }
        }
    }

    private static int method3309() {
        return Class5550.method21885();
    }

    private static int method3310(HUD class339, long l2) {
        return class339.method3327(l2);
    }

    private Boolean method3311() {
        return (Boolean)HUD.method3500(this.field892);
    }

    public static Class3978 method3312() {
        return Class5723.field11047;
    }

    private static Object method3313(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method3314(HUD class339) {
        return class339.field898;
    }

    private static void method3315(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method3316() {
        Chams.method1924();
    }

    private static void method3317() {
        Class1503.method14420();
    }

    private static int method3318() {
        return Class5550.method21885();
    }

    private static void method3319(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static double method3320(Class6283 class6283) {
        return class6283.method24281();
    }

    private static Object method3321(Class248 class248) {
        return class248.method507();
    }

    public static class_5321 method3322() {
        return class_1937.field_25180;
    }

    private static void method3323(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method3324(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    private static void method3325() {
        Class4146.method20694();
    }

    private static Object method3326(Class248 class248) {
        return class248.method507();
    }

    private int method3327(long d2) {
        return switch (((Class541)((Object)HUD.method3363(this).method507())).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> Colors.method10620().method10621();
            case 3 -> HUD.method3447(this, field894[1]);
            case 2 -> this.method3536(d2);
            case 1 -> {
                float a = Math.max(Class6213.field12655 - ((Float)HUD.method3252(this.field936)).floatValue(), Class1560.field5852);
                float b = Math.max(100.0f - ((Float)this.field929.method507()).floatValue(), 0.1f);
                double c = Math.sin(Math.toRadians((double)((float)d2 * b) + (double)System.currentTimeMillis() / (double)a));
                c = Math.abs(c);
                yield Class4045.method20101((float)class_3532.method_15350((double)c, (double)0.0, (double)1.0), HUD.method3410(Colors.method10620()), (Color)this.field924.method507()).getRGB();
            }
        };
    }

    private static boolean method3328() {
        return Blink.method4987();
    }

    public static long method3329(HUD class339) {
        return class339.field896;
    }

    private static int method3330(int n2) {
        return Nametags.method1495(n2);
    }

    private static void method3331(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method3332(int n2, int n3, Class215 class215, Class3511 class3511) {
        return Class3234.method16386(n2, n3, class215, class3511);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1269() {
        int n2;
        if (((Boolean)this.field906.method507()).booleanValue() && ((Boolean)HUD.method3476(this.field898)).booleanValue()) {
            n2 = (int)field894[1];
            return n2 != 0;
        }
        n2 = (int)field894[0];
        return n2 != 0;
    }

    private static boolean method3333() {
        return Class3979.method19544();
    }

    private static boolean method3334(Class3978 class3978) {
        return class3978.method19514();
    }

    public static class_746 method3335(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method3336(Class479 a2, Class479 b2) {
        if (a2.method10778() == b2.method10778()) {
            int n2 = (int)field894[1];
            return Velocity.method10252();
        }
        return (int)field894[0] != 0;
    }

    public static Class551 method3337() {
        return Class551.field2728;
    }

    private static int method3338(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static void method3339() {
        Class6454.method24594();
    }

    private static int method3340(int n2) {
        return Class4045.method20095(n2);
    }

    public static float method3341(HUD class339) {
        return class339.field902;
    }

    public static class_746 method3342(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3343(long l2) {
        HUD.method3473(l2);
    }

    private static int method3344(int n2) {
        return Class4045.method20096(n2);
    }

    public static class_746 method3345(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method3346(Class248 class248) {
        return class248.method507();
    }

    private static int method3347(int n2, int n3, AnvilRename class358, Class70 class70) {
        return Class3234.method16593(n2, n3, class358, class70);
    }

    private static Object method3348(Class248 class248) {
        return class248.method507();
    }

    private static double method3349(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method3350() {
        Chams.method1924();
    }

    private static int method3351(String string) {
        return Class6454.method24719(string);
    }

    public static Class5496 method3352() {
        return Class5723.field11048;
    }

    private static int method3353(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static float method3354(Class3978 class3978) {
        return class3978.method19528();
    }

    private static void method3355(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static void method3356(HUD class339, long l2) {
        class339.field896 = l2;
    }

    private static void method3357() {
        Class6009.method23561();
    }

    private static void method3358() {
        Class6454.method24594();
    }

    private static long method3359(HUD class339) {
        return HUD.method3329(class339);
    }

    private static class_746 method3360(class_310 class_3102) {
        return HUD.method3239(class_3102);
    }

    private static void method3361() {
        Class6009.method23561();
    }

    private static int method3362() {
        return Class5550.method21885();
    }

    public static Class248 method3363(HUD class339) {
        return class339.field938;
    }

    private static float method3364(HUD class339) {
        return HUD.method3284(class339);
    }

    private static int method3365(int n2) {
        return Class4045.method20095(n2);
    }

    private static int method3366(int n2) {
        return Class4045.method20096(n2);
    }

    private static void method3367() {
        Class5836.method22885();
    }

    private static void method3368(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static int method3369(int n2, int n3, Class270 class270, Class5444 class5444) {
        return Class3234.method16570(n2, n3, class270, class5444);
    }

    private static void method3370(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method3371(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method3372() {
        Class1807.method15744();
    }

    public static class_638 method3373(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method3374(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method3375(HUD class339) {
        return class339.field910;
    }

    private static int method3376(int n2) {
        return Nametags.method1495(n2);
    }

    private static int method3377(int n2, int n3, Shaders class402, Class5693 class5693) {
        return Class3234.method16543(n2, n3, class402, class5693);
    }

    public static Class248 method3378(HUD class339) {
        return class339.field938;
    }

    private static int method3379(int n2) {
        return Nametags.method1495(n2);
    }

    private static int method3380(int n2, int n3, NoRotate class286, Class182 class182) {
        return Class3234.method16534(n2, n3, class286, class182);
    }

    public static Class489 method3381() {
        return Class489.field2548;
    }

    private static int method3382(int n2) {
        return Class4045.method20095(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3383(Class6 a2) {
        if (this.field927.method507() == Class520.field2571) {
            int n2 = 61220;
            Class1745.method15538();
            return;
        }
        int n3 = 61221;
        block4: while (true) {
            switch (n3) {
                case 61221: {
                    n3 = 61219;
                    continue block4;
                }
                case 61220: {
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static int method3384(int n2) {
        return Class4045.method20095(n2);
    }

    private static boolean method3385(Class278 class278) {
        return class278.method1280();
    }

    private static void method3386() {
        Class6454.method24594();
    }

    private static int method3387(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static int method3388(int n2, int n3, Class4244 class4244, Class239 class239) {
        return Class3234.method16455(n2, n3, class4244, class239);
    }

    private static int method3389(int n2, int n3, Class6402 class6402, Class167 class167) {
        return Class3234.method16443(n2, n3, class6402, class167);
    }

    private static int method3390(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3391() {
        return Class5550.method21885();
    }

    private static int method3392(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static void method3393(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3394() {
        Chams.method1924();
    }

    private static void method3395(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static void method3396() {
        Class6009.method23561();
    }

    private static int method3397(int n2, int n3, AutoFish class330, Class807 class807) {
        return Class3234.method16473(n2, n3, class330, class807);
    }

    private static int method3398() {
        return Class6454.method24637();
    }

    private static Color method3399(Colors class457) {
        return class457.method10614();
    }

    private static int method3400() {
        return Class6454.method24637();
    }

    private static int method3401() {
        return Class5659.method22101();
    }

    private static void method3402() {
        Class1745.method15538();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method3403(Class233 aL) {
        block89: {
            block90: {
                block87: {
                    block88: {
                        if (!HUD.method3495(this).isEmpty()) break block88;
                        v0 = 11826;
                        ** GOTO lbl9
                    }
                    v0 = 11827;
                    if (true) ** GOTO lbl9
                    while (true) {
                        v0 = var2_2 = 11825;
lbl9:
                        // 3 sources

                        if (var2_2 == 11826) break;
                        if (var2_2 == 11827) {
                            continue;
                        }
                        break block87;
                        break;
                    }
                    for (Class277 b : Class5723.field11055.method20679()) {
                        if (!(b instanceof Class278)) continue;
                        a = (Class278)b;
                        this.field891.put(HUD.method3472(b), new Class4210(this, a));
                        Class6454.method24594();
                        return;
                    }
                }
                aM = class_3532.method_15340((int)Math.round(240.0f / (float)HUD.field290.method_47599()), (int)((int)HUD.field894[1]), (int)((int)HUD.field894[11]));
                for (d = (int)HUD.field894[0]; d < aM; ++d) {
                    a = HUD.method3480(this).values().iterator();
                    if (!a.hasNext()) continue;
                    c = (Class4210)a.next();
                    c.method20831();
                    Class6009.method23560();
                    return;
                }
                this.field939.method16848();
                if (HUD.method3489(HUD.field290) == null) break block89;
                if (HUD.field290.field_1687 == null) break block90;
                v1 = 6429;
                if (true) ** GOTO lbl40
            }
            v2 = 6430;
            Class3979.method19561();
            return;
            block32: while (true) {
                v1 = 6428;
lbl40:
                // 2 sources

                switch (v1) {
                    case 6430: {
                        continue block32;
                    }
                    case 6429: {
                        for (Map.Entry<K, V> g : this.field940.entrySet()) {
                            e = (Class479)g.getKey();
                            f = (Class6283)g.getValue();
                            HUD.method3432(e);
                            if (HUD.field290.field_1724.method_6112(e.method10778()) != null || !(HUD.method3295(f) < 0.009999999776482582)) continue;
                            this.field940.remove(e);
                        }
                        if (HUD.field290.field_1690.field_1842) {
                            return;
                        }
                        aI = HUD.field290.method_22683();
                        if (((Boolean)HUD.method3516(this).method507()).booleanValue()) {
                            this.field923.method24284(this.field901.method12595((int)HUD.field894[14]));
                            v3 = new Object[(int)HUD.field894[1]];
                            v3[(int)HUD.field894[0]] = HUD.field395.format((double)this.field901.method12592() / 1000.0);
                            h = String.format("\u00a7fServer not responding \u00a77(\u00a7r%s.s\u00a77)", v3);
                            i = Class6454.method24719(h);
                            j = Class4045.method20101(class_3532.method_15363((float)(((float)HUD.method3263(this).method12592() - Class5553.field10511) / 5000.0f), (float)0.0f, (float)1.0f), Color.RED, Color.GREEN);
                            k = (int)(255.0 * this.field923.method24281());
                            HUD.method3277(aL.method6(), h, (float)aI.method_4486() / 2.0f - (float)i / 2.0f, 4.0f, Class4045.method20090(j.getRGB(), k));
                        }
                        this.field896 = HUD.field894[0];
                        this.field917 = this.field895 = 2.0f;
                        this.field911 = aI.method_4502() - Class6454.method24637();
                        HUD.method3515(this, HUD.method3265(this));
                        if (this.field893.method507() != HUD.method3337()) ** GOTO lbl71
                        v4 = 47135;
                        if (true) ** GOTO lbl76
lbl71:
                        // 1 sources

                        v5 = 47136;
                        Chams.method1924();
                        return;
                        block34: while (true) {
                            v4 = 47134;
lbl76:
                            // 2 sources

                            switch (v4) {
                                case 47136: {
                                    continue block34;
                                }
                                case 47135: {
                                    v6 = (int)HUD.field894[1];
                                    break block34;
                                }
                                default: {
                                    v6 = (int)HUD.field894[0];
                                }
                            }
                            break;
                        }
                        this.field935 = v6;
                        this.field911 -= (float)(Class1074.field4375 * this.field904.method24281());
                        v7 = this;
                        HUD.method3467(v7, v7.field902 - (float)(Class5882.field11629 * this.field904.method24281()));
                        if (HUD.method3456(this).method507() != Class520.field2569) {
                            HUD.method3429(Class1677.field6215, 0.36515862f);
                            return;
                        }
                        if (!HUD.method3342(HUD.field290).method_6026().isEmpty()) {
                            this.field917 = HUD.method3291(this) + 27.0f;
                        }
                        aJ = Class5723.field11055.method20679();
                        v8 = aJ.stream();
                        Objects.requireNonNull(Class278.class);
                        v9 = v8.filter((Predicate<Class277>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isInstance(java.lang.Object ), (Lmapped/Class277;)Z)(Class278.class));
                        Objects.requireNonNull(Class278.class);
                        aK = v9.map((Function<Class277, Class278>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, cast(java.lang.Object ), (Lmapped/Class277;)Lmapped/Class278;)(Class278.class)).filter((Predicate<Class278>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method3445(mapped.Class278 ), (Lmapped/Class278;)Z)()).count();
                        if (((Boolean)this.field906.method507()).booleanValue()) {
                            if (((Boolean)HUD.method3321(HUD.method3314(this))).booleanValue()) {
                                l = this.method3327(aK - this.field896);
                                v10 = l >> (int)HUD.field894[22];
                                v11 = l >> (int)HUD.field894[15];
                                RenderSystem.setShaderColor((float)((float)(((int)HUD.field894[10] | ~v10) - ~v10) / 255.0f), (float)((float)(((int)HUD.field894[10] | ~v11) - ~v11) / 255.0f), (float)((float)(l & (int)HUD.field894[10]) / 255.0f), (float)1.0f);
                                Class6009.method23560();
                                aL.method6().method_25290(HUD.field913, (int)HUD.field894[9], (int)this.field895, 0.0f, 0.0f, (int)(75.0f * ((Float)this.field928.method507()).floatValue()), (int)(27.0f * ((Float)this.field928.method507()).floatValue()), (int)(75.0f * ((Float)HUD.method3412(this.field928)).floatValue()), (int)(27.0f * ((Float)this.field928.method507()).floatValue()));
                                Class6009.method23561();
                                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                            } else {
                                v12 = new Object[(int)HUD.field894[9]];
                                v12[(int)HUD.field894[0]] = "Hachimi";
                                v12[(int)HUD.field894[1]] = "1.2.2.1";
                                Class6454.method24624(aL.method6(), String.format("%s \u00a7f%s", v12), 2.0f, this.field895, this.method3327(aK - this.field896));
                            }
                            v13 = this;
                            HUD.method3282(v13, v13.field895 + (float)HUD.method3443());
                        }
                        if (!((Boolean)HUD.method3313(HUD.method3283(this))).booleanValue()) ** GOTO lbl140
                        v14 = aJ.stream();
                        Objects.requireNonNull(Class278.class);
                        v15 = v14.filter((Predicate<Class277>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isInstance(java.lang.Object ), (Lmapped/Class277;)Z)(Class278.class));
                        Objects.requireNonNull(Class278.class);
                        m = v15.map((Function<Class277, Class278>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, cast(java.lang.Object ), (Lmapped/Class277;)Lmapped/Class278;)(Class278.class));
                        switch (((Class555)this.field925.method507()).ordinal() ^ 1531658350) {
                            default: {
                                ** GOTO lbl134
                            }
                            case 1531658350: {
                                ** GOTO lbl137
                            }
                            case 1531658351: {
                                break;
                            }
                        }
                        ** GOTO lbl135
lbl134:
                        // 1 sources

                        throw new MatchException(null, null);
lbl135:
                        // 1 sources

                        v16 = Class3556.method17828(m, (Function<Class278, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, method446(), (Lmapped/Class278;)Ljava/lang/String;)());
                        ** GOTO lbl138
lbl137:
                        // 1 sources

                        v16 = Class3556.method17828(m, (Function<Class278, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, method3417(mapped.Class278 ), (Lmapped/Class278;)Ljava/lang/Integer;)((HUD)this));
lbl138:
                        // 2 sources

                        m = v16;
                        m.forEach((Consumer<Class278>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method3446(mapped.Class233 long mapped.Class278 ), (Lmapped/Class278;)V)((HUD)this, (Class233)aL, (long)aK));
lbl140:
                        // 2 sources

                        if (((Boolean)this.field892.method507()).booleanValue()) {
                            n = HUD.method3532(HUD.field290).method_23317();
                            o = HUD.method3345(HUD.field290).method_23318();
                            p = HUD.method3270(HUD.field290).method_23321();
                            q = HUD.method3373(HUD.field290).method_27983() == HUD.method3322() ? (int)HUD.field894[1] : (int)HUD.field894[0];
                            v17 = new Object[(int)HUD.field894[21]];
                            v17[(int)HUD.field894[0]] = HUD.field395.format(n);
                            v17[(int)HUD.field894[1]] = HUD.field395.format(o);
                            v17[(int)HUD.field894[9]] = HUD.field395.format(p);
                            v17[(int)HUD.field894[12]] = q != 0 ? HUD.field395.format(n * 8.0) : HUD.field395.format(n / 8.0);
                            v17[(int)HUD.field894[17]] = q != 0 ? HUD.field395.format(p * Class3357.field7280) : HUD.field395.format(p / 8.0);
                            Class6454.method24624(aL.method6(), String.format("XYZ \u00a7f%s, %s, %s " + (((Boolean)this.field903.method507()).booleanValue() ? "\u00a77[\u00a7f%s, %s\u00a77]" : ""), v17), 2.0f, this.field911, this.method3327(HUD.method3243(this)));
                            this.field911 -= (float)Class6454.method24637();
                        }
                        if (((Boolean)this.field900.method507()).booleanValue()) {
                            r = HUD.field290.field_1724.method_5735();
                            s = Class5587.method21928(r);
                            t = Class5587.method21921(r.method_10166());
                            u = r.method_10171() == class_2350.class_2352.field_11056 ? (int)HUD.field894[1] : (int)HUD.field894[0];
                            v18 = new Object[(int)HUD.field894[1]];
                            v18[(int)HUD.field894[0]] = (int)class_3532.method_15393((float)Class5723.field11049.method12091());
                            v = String.format(", %s", v18);
                            v19 = new Object[(int)HUD.field894[17]];
                            v19[(int)HUD.field894[0]] = s;
                            v19[(int)HUD.field894[1]] = t;
                            if (u == 0) {
                                Class1108.method12918(false);
                                return;
                            }
                            v19[(int)HUD.field894[9]] = "+";
                            v19[(int)HUD.field894[12]] = ((Boolean)HUD.method3348(this.field919)).booleanValue() ? v : "";
                            Class6454.method24624(aL.method6(), String.format("%s \u00a77[\u00a7f%s%s%s\u00a77]", v19), 2.0f, this.field911, this.method3327(this.field896));
                        }
                        if (!((Boolean)HUD.method3267(this.field899)).booleanValue()) ** GOTO lbl241
                        for (Map.Entry<K, V> I : this.field940.entrySet()) {
                            y = (Class479)I.getKey();
                            z = (Class6283)I.getValue();
                            A = (class_1291)y.method10778().comp_349();
                            if (A == class_1294.field_5925.comp_349()) continue;
                            if (y.method10777() != (int)HUD.field894[8]) ** GOTO lbl179
                            v20 = 46174;
                            ** GOTO lbl183
lbl179:
                            // 1 sources

                            v20 = 46175;
                            if (true) ** GOTO lbl183
                            do {
                                v20 = var22_57 = 46173;
lbl183:
                                // 3 sources

                                if (var22_57 == 46174) ** GOTO lbl186
                            } while (var22_57 == 46175);
                            ** GOTO lbl188
lbl186:
                            // 1 sources

                            v21 = (int)HUD.field894[1];
                            ** GOTO lbl189
lbl188:
                            // 1 sources

                            v21 = B = (int)HUD.field894[0];
lbl189:
                            // 2 sources

                            if (y.method10774() + (int)HUD.field894[1] <= (int)HUD.field894[1]) ** GOTO lbl192
                            v22 = 47561;
                            ** GOTO lbl196
lbl192:
                            // 1 sources

                            v22 = 47562;
                            if (true) ** GOTO lbl196
                            block37: while (true) {
                                v22 = 47560;
lbl196:
                                // 3 sources

                                switch (v22) {
                                    case 47562: {
                                        continue block37;
                                    }
                                    case 47561: {
                                        if (B == 0) {
                                            v23 = (int)HUD.field894[1];
                                            break block37;
                                        }
                                    }
                                    default: {
                                        v23 = C = (int)HUD.field894[0];
                                    }
                                }
                                break;
                            }
                            if (B != 0) {
                                w = "Inf";
                            } else {
                                x = class_3532.method_15375((float)y.method10777());
                                D = class_3544.method_15439((int)x, (float)HUD.field290.field_1687.method_54719().method_54748());
                            }
                            v24 = new Object[(int)HUD.field894[12]];
                            v24[(int)HUD.field894[0]] = A.method_5560().getString();
                            v24[(int)HUD.field894[1]] = C != 0 ? y.method10774() + (int)HUD.field894[1] + " " : "";
                            v24[(int)HUD.field894[9]] = D;
                            E = String.format("%s %s\u00a7f%s", v24);
                            F = Class6454.method24719(E);
                            G = ((float)F + 1.0f) * (float)HUD.method3450(z);
                            switch (((Class618)this.field937.method507()).ordinal() ^ -885269647) {
                                default: {
                                    ** GOTO lbl229
                                }
                                case -885269648: {
                                    while (true) {
                                        // Infinite loop
                                    }
                                }
                                case -885269647: {
                                    ** GOTO lbl230
                                }
                                case -885269645: {
                                    break;
                                }
                            }
                            ** GOTO lbl232
lbl229:
                            // 1 sources

                            throw new MatchException(null, null);
lbl230:
                            // 1 sources

                            v25 = Class4045.method20093(A.method_5556(), (int)(255.0 * HUD.method3349(z)));
                            ** GOTO lbl233
lbl232:
                            // 1 sources

                            v25 = Class4045.method20093(this.method3327(this.field896), (int)(255.0 * HUD.method3246(z)));
lbl233:
                            // 2 sources

                            H = v25;
                            Class6454.method24624(aL.method6(), E, (float)aI.method_4486() - G, this.field935 != false ? this.field902 : this.field917, HUD.method3469(H, (float)HUD.method3422(z)));
                            if (this.field935) {
                                this.field902 -= (float)Class6454.method24637();
                            } else {
                                this.field917 += (float)Class6454.method24637();
                            }
                            this.field896 += HUD.field894[1];
                        }
lbl241:
                        // 2 sources

                        if (((Boolean)this.field914.method507()).booleanValue()) {
                            J = HUD.method3487(HUD.field290.field_1724).method_52790();
                            K = HUD.method3451(J);
                            HUD.method3298(aL.method6(), J, (float)(aI.method_4486() - K) - 1.0f, this.field935 != false ? HUD.method3285(this) : this.field917, this.method3327(HUD.method3236(this)));
                            if (this.field935) {
                                this.field902 -= (float)Class6454.method24637();
                            } else {
                                this.field917 = HUD.method3462(this) + (float)Class6454.method24637();
                            }
                            v26 = this;
                            HUD.method3356(v26, HUD.method3437(v26) + HUD.field894[1]);
                        }
                        if (this.field915.method507() != Class550.field2724) {
                            Q = HUD.field290.field_1724.method_23317() - HUD.field290.field_1724.field_6014;
                            R = HUD.field290.field_1724.method_23321() - HUD.field290.field_1724.field_5969;
                            v27 = HUD.method3408().method1265() ? Timer.method3077().method3075() : (S = 1.0f);
                            if (HUD.method3326(HUD.method3404(this)) == Class550.field2725) {
                                L = Math.sqrt(Q * Q + R * R) / Class3041.field6847;
                                M = Class1591.field5953;
                                N = L / M * (double)S;
                            } else {
                                O = Math.sqrt((Q *= Class858.field3728) * Q + (R *= 20.0) * R);
                                P = Math.abs(O) * (double)S;
                            }
                            v28 = new Object[(int)HUD.field894[9]];
                            v28[(int)HUD.field894[0]] = this.field897.format(P);
                            v28[(int)HUD.field894[1]] = this.field915.method507() == Class550.field2725 ? "km/h" : "b/s";
                            T = String.format("Speed \u00a7f%s%s", v28);
                            U = HUD.method3242(T);
                            Class6454.method24624(aL.method6(), T, (float)(aI.method_4486() - U) - 1.0f, this.field935 != false ? HUD.method3341(this) : this.field917, this.method3327(HUD.method3305(this)));
                            if (this.field935) {
                                this.field902 = HUD.method3520(this) - (float)Class6454.method24637();
                            } else {
                                this.field917 += (float)Class6454.method24637();
                            }
                            this.field896 = HUD.method3426(this) + HUD.field894[1];
                        }
                        if (((Boolean)this.field922.method507()).booleanValue() && HUD.field290.field_1724.method_6047().method_7963()) {
                            V = HUD.field290.field_1724.method_6047().method_7936();
                            W = HUD.field290.field_1724.method_6047().method_7919();
                            X = "Durability ";
                            Y = String.valueOf(V - W);
                            Z = Class6454.method24719(X);
                            aa = Class6454.method24719(Y);
                            ab = Class4045.method20104((float)(V - W) / (float)V * 120.0f, 100.0f, Class1049.field4294, 1.0f);
                            Class6454.method24624(aL.method6(), X, (float)(aI.method_4486() - Z - aa) - 1.0f, this.field935 ? this.field902 : this.field917, this.method3327(this.field896));
                            if (this.field935) {
                                v29 = HUD.method3474(this);
                                Class6009.method23559(false);
                                return;
                            }
                            HUD.method3435(aL.method6(), Y, (float)(aI.method_4486() - aa) - 1.0f, this.field917, ab.getRGB());
                            if (this.field935) {
                                this.field902 -= (float)Class6454.method24637();
                            } else {
                                this.field917 += (float)Class6454.method24637();
                            }
                            this.field896 = HUD.method3359(this) + HUD.field894[1];
                        }
                        if (((Boolean)this.field889.method507()).booleanValue()) {
                            ac = FastLatency.method3873().method1265() ? (int)FastLatency.method3873().method3880() : Class5723.field11048.method21368();
                            v30 = new Object[(int)HUD.field894[1]];
                            v30[(int)HUD.field894[0]] = ac;
                            ad = String.format("Ping \u00a7f%dms", v30);
                            ae = Class6454.method24719(ad);
                            if (HUD.method3561(this)) {
                                v31 = this.field902;
                                Class1668.method15147(-1822931673, -548841305, -1517335102, 188139577);
                                return;
                            }
                            HUD.method3444(aL.method6(), ad, (float)(aI.method_4486() - ae) - 1.0f, this.field917, this.method3327(this.field896));
                            if (HUD.method3507(this)) {
                                this.field902 -= (float)Class6454.method24637();
                            } else {
                                this.field917 = HUD.method3364(this) + (float)Class6454.method24637();
                            }
                            this.field896 += HUD.field894[1];
                        }
                        if (((Boolean)this.field912.method507()).booleanValue()) {
                            v32 = new Object[(int)HUD.field894[9]];
                            v32[(int)HUD.field894[0]] = Class5723.field11048.method21347();
                            v32[(int)HUD.field894[1]] = HUD.method3269(HUD.method3352());
                            af = String.format("Packets \u00a7f%s->%s", v32);
                            ag = HUD.method3548(af);
                            Class6454.method24624(aL.method6(), af, (float)(aI.method_4486() - ag) - 1.0f, this.field935 ? this.field902 : this.field917, HUD.method3310(this, this.field896));
                            if (!HUD.method3521(this)) {
                                Class5836.method22890();
                                return;
                            }
                            this.field902 -= (float)Class6454.method24637();
                            this.field896 += HUD.field894[1];
                        }
                        if (!((Boolean)this.field916.method507()).booleanValue()) ** GOTO lbl345
                        ah = HUD.method3312().method19525();
                        ai = HUD.method3354(Class5723.field11047);
                        v33 = new Object[(int)HUD.field894[9]];
                        v33[(int)HUD.field894[0]] = this.field897.format(ah) + (HUD.method3334(Class5723.field11047) != false ? "" : "*");
                        v33[(int)HUD.field894[1]] = this.field897.format(ai);
                        aj = String.format("TPS \u00a7f%s \u00a77[\u00a7f%s\u00a77]", v33);
                        ak = Class6454.method24719(aj);
                        v34 = aL.method6();
                        v35 = aj;
                        v36 = (float)(aI.method_4486() - ak) - 1.0f;
                        if (!this.field935) ** GOTO lbl334
                        v37 = 4570;
                        ** GOTO lbl338
lbl334:
                        // 1 sources

                        v37 = 4571;
                        if (true) ** GOTO lbl338
                        do {
                            v37 = var33_75 = 4569;
lbl338:
                            // 3 sources

                            if (var33_75 == 4570) ** GOTO lbl342
                        } while (var33_75 == 4571);
                        Class5836.method22885();
                        return;
lbl342:
                        // 1 sources

                        v38 = this.field902;
                        Class6322.method24332(0.18713069f, Class3340.field7215);
                        return;
lbl345:
                        // 1 sources

                        if (!((Boolean)this.field921.method507()).booleanValue()) ** GOTO lbl385
                        ao = (int)HUD.field894[0];
                        ap = (int)HUD.field894[0];
                        for (class_2586 an : HUD.method3247()) {
                            if (!(an instanceof class_2595) || !(am = an.method_11010()).method_28498((class_2769)class_2281.field_10770)) continue;
                            al = (class_2745)am.method_11654((class_2769)class_2281.field_10770);
                            if (al == class_2745.field_12569) {
                                ++ao;
                                Class6454.method24636(0.7403964163473432, 0.035343554289256174, 0.05203028868965509, Class669.field3223);
                                return;
                            }
                            ++ap;
                        }
                        v39 = new Object[(int)HUD.field894[1]];
                        v39[(int)HUD.field894[0]] = ao + ap / (int)HUD.field894[9];
                        aq = String.format("Chests \u00a7f%d", v39);
                        ar = HUD.method3542(aq);
                        v40 = aL.method6();
                        v41 = (float)(aI.method_4486() - ar) - 1.0f;
                        if (HUD.method3406(this)) {
                            v42 = 14830;
                            Class6009.method23561();
                            return;
                        }
                        v43 = 14831;
                        if (true) ** GOTO lbl371
                        block41: while (true) {
                            v43 = 14829;
lbl371:
                            // 2 sources

                            switch (v43) {
                                case 14831: {
                                    continue block41;
                                }
                                case 14830: {
                                    v44 = this.field902;
                                    break block41;
                                }
                                default: {
                                    v44 = this.field917;
                                }
                            }
                            break;
                        }
                        Class6454.method24624(v40, aq, v41, v44, this.method3327(this.field896));
                        if (this.field935) {
                            this.field902 -= (float)Class6454.method24637();
                        } else {
                            this.field917 += (float)Class6454.method24637();
                        }
                        this.field896 += HUD.field894[1];
lbl385:
                        // 2 sources

                        if (((Boolean)HUD.method3499(this.field905)).booleanValue()) {
                            v45 = new Object[(int)HUD.field894[1]];
                            v45[(int)HUD.field894[0]] = this.field939.method16841();
                            as = String.format("FPS \u00a7f%d", v45);
                            at = Class6454.method24719(as);
                            if (this.field935) {
                                v46 = this.field902;
                                Class5836.method22885();
                                return;
                            }
                            Class6454.method24624(aL.method6(), as, (float)(aI.method_4486() - at) - 1.0f, this.field917, this.method3327(this.field896));
                            this.field896 = HUD.method3279(this) + HUD.field894[1];
                        }
                        if (!((Boolean)HUD.method3512(this.field890)).booleanValue()) ** GOTO lbl433
                        aA = HUD.field290.field_1724.method_5854();
                        aB = aI.method_4486() / (int)HUD.field894[9] + (int)HUD.field894[19];
                        aC = aI.method_4502();
                        aD = HUD.field290.field_1724.method_5748();
                        aE = Math.min(HUD.field290.field_1724.method_5669(), aD);
                        if (HUD.field290.field_1724.method_5777(class_3486.field_15517) || aE < aD) {
                            aC -= 65;
                            Class4146.method20697();
                            return;
                        }
                        if (aA instanceof class_1309) {
                            au = (class_1309)aA;
                            aC -= (int)HUD.field894[13] + (int)Math.ceil((au.method_6063() - 1.0f) / 20.0f) * (int)HUD.field894[11];
                        } else {
                            aC = HUD.method3335(HUD.field290).method_7337() ? (aC -= 45) : (aC -= 55);
                        }
                        for (az = (int)HUD.field894[12]; az >= 0; --az) {
                            aw = (class_1799)HUD.method3360((class_310)HUD.field290).method_31548().field_7548.get(az);
                            ax = aw.method_7936();
                            ay = aw.method_7919();
                            aL.method6().method_51427(aw, aB, aC);
                            aL.method6().method_51431(HUD.method3449(HUD.field290), aw, aB, aC);
                            if (!((Boolean)this.field907.method507()).booleanValue()) ** GOTO lbl420
                            v47 = 44531;
                            ** GOTO lbl424
lbl420:
                            // 1 sources

                            v47 = 44532;
                            if (true) ** GOTO lbl424
                            block43: while (true) {
                                v47 = 44530;
lbl424:
                                // 3 sources

                                switch (v47) {
                                    case 44532: {
                                        continue block43;
                                    }
                                    case 44531: {
                                        if (aw.method_7960() || !aw.method_7963()) break block43;
                                        av = String.valueOf((int)Math.floor((float)(ax - ay) / (float)ax * 100.0f));
                                        Class6454.method24624(aL.method6(), av, (float)aB + 8.0f - (float)HUD.method3464(av) / 2.0f, (float)aC - 8.0f, Class4045.method20104((float)(ax - ay) / (float)ax * 120.0f, 100.0f, Class6085.field12265, 1.0f).getRGB());
                                    }
                                }
                                break;
                            }
                            aB += 20;
                        }
lbl433:
                        // 2 sources

                        if (!((Boolean)HUD.method3523(this).method507()).booleanValue() || HUD.field290.field_1724.method_7337() || HUD.field290.field_1724.method_7325()) break block32;
                        aF = aI.method_4486() / (int)HUD.field894[9] - (int)HUD.field894[15];
                        aG = aI.method_4502() - (int)HUD.field894[18];
                        aL.method6().method_51427(new class_1799((class_1935)class_1802.field_8288), aF, aG - (int)HUD.field894[1]);
                        aH = String.valueOf(Class4196.method20813(class_1802.field_8288));
                        aL.method6().method_51448().method_46416(0.0f, 0.0f, 200.0f);
                        HUD.method3395(aL.method6(), aH, aF + (int)HUD.field894[20] - HUD.method3514(aH), aG + (int)HUD.field894[16], (int)HUD.field894[8]);
                    }
                }
                break;
            }
        }
    }

    private static Class248 method3404(HUD class339) {
        return HUD.method3244(class339);
    }

    private static int method3405(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public static boolean method3406(HUD class339) {
        return class339.field935;
    }

    private static int method3407() {
        return Class6454.method24637();
    }

    private static Timer method3408() {
        return Timer.method3077();
    }

    private static void method3409() {
        Class5836.method22890();
    }

    private static Color method3410(Colors class457) {
        return class457.method10614();
    }

    private static void method3411(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method3412(Class248 class248) {
        return class248.method507();
    }

    private static int method3413(int n2) {
        return Nametags.method1495(n2);
    }

    private static void method3414(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3415() {
        Chams.method1924();
    }

    private static int method3416(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    static {
        HUD.method3343(-4158537517190399889L);
        field913 = class_2960.method_60655((String)"hachimi", (String)"textures/logo.png");
    }

    private Integer method3417(Class278 a2) {
        return ~(HUD.method3351(this.method3541(a2)) - 1);
    }

    private static int method3418(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static Object method3419(Class248 class248) {
        return class248.method507();
    }

    private static void method3420() {
        Class1503.method14420();
    }

    private static int method3421(int n2) {
        return Nametags.method1495(n2);
    }

    private static double method3422(Class6283 class6283) {
        return class6283.method24281();
    }

    private static int method3423() {
        return Class5550.method21885();
    }

    private static int method3424(int n2) {
        return Nametags.method1495(n2);
    }

    private static void method3425(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static long method3426(HUD class339) {
        return class339.field896;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int method3427(String a, class_1291 b) {
        block62: {
            var3_3 = a.replace("minecraft:", "");
            var4_4 = (int)HUD.field894[8];
            switch (var3_3.hashCode()) {
                case 109641799: {
                    if (Integer.valueOf("speed".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[0];
                    }
                    break;
                }
                case -1083012136: {
                    if (!Integer.valueOf("slowness".hashCode()).equals(var3_3.hashCode())) {
                        return Class4045.method20105(752947119);
                    }
                    v0 = 26026;
                    block37: while (true) {
                        switch (v0) {
                            case 26027: {
                                v0 = 26025;
                                continue block37;
                            }
                            case 26026: {
                                var4_4 = (int)HUD.field894[1];
                                ** break;
                            }
                            default: {
                                break block62;
                            }
                        }
                        break;
                    }
                }
                case 99050123: {
                    if (Integer.valueOf("haste".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[9];
                    }
                    break;
                }
                case 1254846936: {
                    if (Integer.valueOf("mining_fatigue".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[12];
                        return Class4045.method20096(825219114);
                    }
                    break;
                }
                case 1791316033: {
                    if (Integer.valueOf("strength".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[17];
                    }
                    break;
                }
                case -1130648966: {
                    if (Integer.valueOf("instant_health".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[21];
                    }
                    break;
                }
                case -230491182: {
                    if (Integer.valueOf("saturation".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[47];
                    }
                    break;
                }
                case -1248513139: {
                    if (Integer.valueOf("instant_damage".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[32];
                        return HUD.method3391();
                    }
                    break;
                }
                case -251715502: {
                    if (Integer.valueOf("jump_boost".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[15];
                    }
                    break;
                }
                case -1052579859: {
                    if (Integer.valueOf("nausea".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[16];
                    }
                    break;
                }
                case 1032770443: {
                    if (Integer.valueOf("regeneration".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[11];
                    }
                    break;
                }
                case 1863800889: {
                    if (Integer.valueOf("resistance".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[19];
                    }
                    break;
                }
                case 1623775714: {
                    if (Integer.valueOf("fire_resistance".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[30];
                    }
                    break;
                }
                case -84082086: {
                    if (Integer.valueOf("water_breathing".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[46];
                    }
                    break;
                }
                case -1781004809: {
                    if (Integer.valueOf("invisibility".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[38];
                    }
                    break;
                }
                case 151619372: {
                    if (Integer.valueOf("blindness".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[37];
                    }
                    break;
                }
                case 1749920239: {
                    if (Integer.valueOf("night_vision".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[22];
                        while (true) {
                            // Infinite loop
                        }
                    }
                    break;
                }
                case -1206104397: {
                    v1 = Integer.valueOf("hunger".hashCode()).equals(var3_3.hashCode()) != false ? 46409 : 46410;
                    block39: while (true) {
                        switch (v1) {
                            case 46410: {
                                v1 = 46408;
                                continue block39;
                            }
                            case 46409: {
                                var4_4 = (int)HUD.field894[20];
                                ** break;
                            }
                            default: {
                                break block62;
                            }
                        }
                        break;
                    }
                }
                case -736186929: {
                    if (!Integer.valueOf("weakness".hashCode()).equals(var3_3.hashCode())) ** break;
                    var4_4 = (int)HUD.field894[54];
                    break;
                }
                case -982749432: {
                    if (!Integer.valueOf("poison".hashCode()).equals(var3_3.hashCode())) {
                        return HUD.method3457(-205342506, Class6216.field12671);
                    }
                    var4_4 = (int)HUD.field894[44];
                    break;
                }
                case -787569677: {
                    if (Integer.valueOf("wither".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[39];
                    }
                    break;
                }
                case 845042688: {
                    if (!Integer.valueOf("health_boost".hashCode()).equals(var3_3.hashCode())) ** break;
                    var4_4 = (int)HUD.field894[26];
                    break;
                }
                case -1259714865: {
                    if (!Integer.valueOf("absorption".hashCode()).equals(var3_3.hashCode())) ** break;
                    var4_4 = (int)HUD.field894[57];
                    break;
                }
                case 121707317: {
                    if (!Integer.valueOf("glowing".hashCode()).equals(var3_3.hashCode())) ** break;
                    var4_4 = (int)HUD.field894[43];
                    break;
                }
                case -306977811: {
                    if (!Integer.valueOf("levitation".hashCode()).equals(var3_3.hashCode())) ** break;
                    var4_4 = (int)HUD.field894[42];
                    break;
                }
                case 3333041: {
                    if (!Integer.valueOf("luck".hashCode()).equals(var3_3.hashCode())) {
                        return Class6454.method24637();
                    }
                    var4_4 = (int)HUD.field894[27];
                    break;
                }
                case -840436278: {
                    if (Integer.valueOf("unluck".hashCode()).equals(var3_3.hashCode())) {
                        var4_4 = (int)HUD.field894[45];
                        ** break;
                    }
                    break;
                }
            }
        }
        v2 = var4_4;
        while (true) {
            // Infinite loop
        }
    }

    private static int method3428(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static void method3429(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method3430() {
        return (HUD.method3374(this.field938) != HUD.method3452() ? (int)field894[1] : (int)field894[0]) != 0;
    }

    private static int method3431(int n2) {
        return Class4045.method20105(n2);
    }

    private static void method3432(Class479 class479) {
        class479.method10775();
    }

    private static int method3433() {
        return Class5550.method21885();
    }

    public static Class541 method3434() {
        return Class541.field2678;
    }

    private static void method3435(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private Boolean method1278() {
        return (Boolean)HUD.method3419(this.field900);
    }

    private static int method3436(int n2) {
        return Nametags.method1495(n2);
    }

    public static long method3437(HUD class339) {
        return class339.field896;
    }

    private static void method3438(float f2) {
        Class5836.method22907(f2);
    }

    private static int method3439(int n2, int n3, Class4146 class4146, Font class296) {
        return Class3234.method16582(n2, n3, class4146, class296);
    }

    private static void method3440() {
        Class5659.method22184();
    }

    public static void method3441(HUD class339, long l2) {
        class339.field896 = l2;
    }

    private static void method3442() {
        Class6009.method23561();
    }

    private static int method3443() {
        return Class6454.method24637();
    }

    private static void method3444(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static boolean method3445(Class278 a2) {
        return (!HUD.method3385(a2) ? (int)field894[1] : (int)field894[0]) != 0;
    }

    private void method3446(Class233 a2, long b2, Class278 c2) {
        this.method3290(a2, c2, b2);
    }

    private static int method3447(HUD class339, long l2) {
        return class339.method3536(l2);
    }

    private static int method3448(int n2) {
        return Class4045.method20103(n2);
    }

    public static class_327 method3449(class_310 class_3102) {
        return class_3102.field_1772;
    }

    private static double method3450(Class6283 class6283) {
        return class6283.method24281();
    }

    private static int method3451(String string) {
        return Class6454.method24719(string);
    }

    public static Class541 method3452() {
        return Class541.field2683;
    }

    private static void method3453(Class4210 class4210, class_332 class_3322, long l2) {
        class4210.method20830(class_3322, l2);
    }

    private static void method3454(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method3455(int n2) {
        return Class4045.method20096(n2);
    }

    public static Class248 method3456(HUD class339) {
        return class339.field927;
    }

    private static int method3457(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static int method3458() {
        return Class6454.method24637();
    }

    private static int method3459(int n2) {
        return Nametags.method1495(n2);
    }

    private static void method3460() {
        Class5836.method22897();
    }

    private static int method3461(int n2) {
        return Class4045.method20103(n2);
    }

    public static float method3462(HUD class339) {
        return class339.field917;
    }

    private static int method3463(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method3464(String string) {
        return Class6454.method24719(string);
    }

    private static Class520[] method3465() {
        return Class520.values();
    }

    private static int method3466(int n2, int n3, Class1352 class1352, Class1352 class13522) {
        return Class3234.method16578(n2, n3, class1352, class13522);
    }

    public static void method3467(HUD class339, float f2) {
        class339.field902 = f2;
    }

    private static int method3468(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static int method3469(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static void method3470() {
        Class5836.method22890();
    }

    private static void method3471(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static String method3472(Class277 class277) {
        return class277.method472();
    }

    private static void method3473(long l2) {
        HUD.field894[35] = l2 ^ 0xC649E8293699C723L;
        HUD.field894[24] = l2 ^ 0xC649E829367B9C22L;
        HUD.field894[47] = l2 ^ 0xC649E82936BB3869L;
        HUD.field894[23] = l2 ^ 0xC649E82936BB3854L;
        HUD.field894[39] = l2 ^ 0xC649E82936BB387BL;
        HUD.field894[5] = l2 ^ 0xC649E82936BB384CL;
        HUD.field894[53] = l2 ^ 0xC649E8293662F82CL;
        HUD.field894[45] = l2 ^ 0xC649E82936BB3875L;
        HUD.field894[28] = l2 ^ 0xC649E82936C4BBFDL;
        HUD.field894[15] = l2 ^ 0xC649E82936BB3867L;
        HUD.field894[14] = l2 ^ 0xC649E82936BB3B87L;
        HUD.field894[50] = l2 ^ 0xC649E82936F5AB5EL;
        HUD.field894[42] = l2 ^ 0xC649E82936BB3877L;
        HUD.field894[19] = l2 ^ 0xC649E82936BB3864L;
        HUD.field894[32] = l2 ^ 0xC649E82936BB3868L;
        HUD.field894[40] = l2 ^ 0xC649E82936EE2525L;
        HUD.field894[65] = l2 ^ 0xC649E82936BB399BL;
        HUD.field894[60] = l2 ^ 0xC649E829362F980EL;
        HUD.field894[38] = l2 ^ 0xC649E82936BB3861L;
        HUD.field894[51] = l2 ^ 0xC649E829367664C4L;
        HUD.field894[58] = l2 ^ 0xC649E8293688A16FL;
        HUD.field894[7] = l2 ^ 0xC649E82936BB3931L;
        HUD.field894[11] = l2 ^ 0xC649E82936BB3865L;
        HUD.field894[56] = l2 ^ 0xC649E82936281C4CL;
        HUD.field894[21] = l2 ^ 0xC649E82936BB386AL;
        HUD.field894[17] = l2 ^ 0xC649E82936BB386BL;
        HUD.field894[41] = l2 ^ 0xC649E82936F37527L;
        HUD.field894[46] = l2 ^ 0xC649E82936BB3862L;
        HUD.field894[0] = l2 ^ 0xC649E82936BB386FL;
        HUD.field894[1] = l2 ^ 0xC649E82936BB386EL;
        HUD.field894[43] = l2 ^ 0xC649E82936BB3878L;
        HUD.field894[4] = l2 ^ 0x39B617D6C944C757L;
        HUD.field894[55] = l2 ^ 0xC649E82936227D55L;
        HUD.field894[26] = l2 ^ 0xC649E82936BB387AL;
        HUD.field894[48] = l2 ^ 0xC649E8293643454CL;
        HUD.field894[25] = l2 ^ 0xC649E8293675C790L;
        HUD.field894[8] = l2 ^ 0x39B617D6C944C790L;
        HUD.field894[20] = l2 ^ 0xC649E82936BB387EL;
        HUD.field894[54] = l2 ^ 0xC649E82936BB387DL;
        HUD.field894[29] = l2 ^ 0xC649E82936A4274CL;
        HUD.field894[63] = l2 ^ 0xC649E82936E154EEL;
        HUD.field894[9] = l2 ^ 0xC649E82936BB386DL;
        HUD.field894[49] = l2 ^ 0xC649E82936F17A78L;
        HUD.field894[34] = l2 ^ 0xC649E82936956AF6L;
        HUD.field894[59] = l2 ^ 0xC649E829369E6ACAL;
        HUD.field894[6] = l2 ^ 0xC649E82936BB38A7L;
        HUD.field894[33] = l2 ^ 0xC649E82936431C4CL;
        HUD.field894[37] = l2 ^ 0xC649E82936BB3860L;
        HUD.field894[64] = l2 ^ 0xC649E829368E1248L;
        HUD.field894[36] = l2 ^ 0xC649E82936A427CEL;
        HUD.field894[12] = l2 ^ 0xC649E82936BB386CL;
        HUD.field894[3] = l2 ^ 0xC649E82936BB3943L;
        HUD.field894[13] = l2 ^ 0xC649E82936BB3842L;
        HUD.field894[30] = l2 ^ 0xC649E82936BB3863L;
        HUD.field894[44] = l2 ^ 0xC649E82936BB387CL;
        HUD.field894[62] = l2 ^ 0xC649E82936C797A9L;
        HUD.field894[52] = l2 ^ 0xC649E82936E34E3CL;
        HUD.field894[2] = l2 ^ 0xC649E82936BB380BL;
        HUD.field894[10] = l2 ^ 0xC649E82936BB3890L;
        HUD.field894[18] = l2 ^ 0xC649E82936BB3858L;
        HUD.field894[31] = l2 ^ 0xC649E829365FA255L;
        HUD.field894[16] = l2 ^ 0xC649E82936BB3866L;
        HUD.field894[22] = l2 ^ 0xC649E82936BB387FL;
        HUD.field894[27] = l2 ^ 0xC649E82936BB3876L;
        HUD.field894[57] = l2 ^ 0xC649E82936BB3879L;
        HUD.field894[61] = l2 ^ 0xC649E82936F83266L;
    }

    public static float method3474(HUD class339) {
        return class339.field902;
    }

    private static int method3475() {
        return Class6454.method24637();
    }

    private static Object method3476(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method3477(HUD class339) {
        return class339.field938;
    }

    private static void method3478() {
        Class5836.method22885();
    }

    private Boolean method3479() {
        return (HUD.method3553(this).method507() == Class520.field2569 ? (int)field894[1] : (int)field894[0]) != 0;
    }

    public static Map method3480(HUD class339) {
        return class339.field891;
    }

    private Boolean method3481() {
        return (this.field918.method507() == Class520.field2569 ? (int)field894[1] : (int)field894[0]) != 0;
    }

    private static void method3482() {
        Class3979.method19561();
    }

    private static int method3483(int n2, int n3, Class213 class213, SkinBlink class312) {
        return Class3234.method16503(n2, n3, class213, class312);
    }

    private static void method3484() {
        Class1503.method14420();
    }

    public static Class248 method3485(HUD class339) {
        return class339.field934;
    }

    private static int method3486(int n2) {
        return Nametags.method1495(n2);
    }

    private static class_634 method3487(class_746 class_7462) {
        return HUD.method3273(class_7462);
    }

    private static Object method3488(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method3489(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method3490(HUD class339) {
        return class339.field899;
    }

    private Boolean method3491() {
        return (HUD.method3477(this).method507() == Class541.field2678 ? (int)field894[1] : (int)field894[0]) != 0;
    }

    private Boolean method3492() {
        if (this.field938.method507() != Class541.field2683) {
            int n2 = (int)field894[1];
            Class5659.method22184();
            return null;
        }
        return (boolean)field894[0];
    }

    private static int method3493(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3494(int n2) {
        return Class4045.method20096(n2);
    }

    public static Map method3495(HUD class339) {
        return class339.field891;
    }

    private static int method3496(int n2, int n3, Class5760 class5760, Class136 class136) {
        return Class3234.method16420(n2, n3, class5760, class136);
    }

    private static Object method3497(Class248 class248) {
        return class248.method507();
    }

    private static int method3498(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static Object method3499(Class248 class248) {
        return class248.method507();
    }

    private static Object method3500(Class248 class248) {
        return class248.method507();
    }

    private Boolean method3501() {
        return (this.field918.method507() == HUD.method3266() ? (int)field894[1] : (int)field894[0]) != 0;
    }

    private static class_6880 method3502(Class479 class479) {
        return class479.method10778();
    }

    private static int method3503(int n2, int n3, Class681 class681, Class5694 class5694) {
        return Class3234.method16389(n2, n3, class681, class5694);
    }

    private static int method3504(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3505(int n2, int n3, Class3377 class3377, Class551 class551) {
        return Class3234.method16643(n2, n3, class3377, class551);
    }

    private static void method3506() {
        Class5836.method22897();
    }

    public static boolean method3507(HUD class339) {
        return class339.field935;
    }

    @Class1
    public void method3508(Class221 a2) {
        if (a2.method412() == HUD.field290.field_1724) {
            this.field940.clear();
        }
    }

    private static void method3509(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static int method3510(int n2, int n3, Class278 class278, Class218 class218) {
        return Class3234.method16361(n2, n3, class278, class218);
    }

    private static void method3511() {
        Class6454.method24594();
    }

    private static Object method3512(Class248 class248) {
        return class248.method507();
    }

    private static void method3513(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    private static int method3514(String string) {
        return Class6454.method24719(string);
    }

    public static void method3515(HUD class339, float f2) {
        class339.field902 = f2;
    }

    public static Class248 method3516(HUD class339) {
        return class339.field920;
    }

    public static float method3517(HUD class339) {
        return class339.field917;
    }

    public static Map method3518(HUD class339) {
        return class339.field940;
    }

    private static int method3519(int n2) {
        return Nametags.method1495(n2);
    }

    public static float method3520(HUD class339) {
        return class339.field902;
    }

    public static boolean method3521(HUD class339) {
        return class339.field935;
    }

    private static class_6880 method3522(Class214 class214) {
        return class214.method401();
    }

    public static Class248 method3523(HUD class339) {
        return class339.field932;
    }

    private static int method3524(int n2) {
        return Class4045.method20096(n2);
    }

    private Boolean method3525() {
        return (Boolean)HUD.method3237(this).method507();
    }

    private static void method3526(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method3527() {
        return Class6454.method24637();
    }

    @Class1
    public void method3528(Class229 a2) {
        this.field940.clear();
    }

    private static void method3529(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method3530(Class248 class248) {
        return class248.method507();
    }

    private static void method3531(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static class_746 method3532(class_310 class_3102) {
        return HUD.method3240(class_3102);
    }

    private static int method3533() {
        return Class6454.method24637();
    }

    private static int method3534() {
        return Class5659.method22101();
    }

    private static void method3535() {
        Class4146.method20694();
    }

    private int method3536(long a2) {
        float b2 = (float)(((double)System.currentTimeMillis() * (double)(((Float)this.field936.method507()).floatValue() / Class4078.field9442) + (double)(a2 * field894[65])) % (double)(30000.0f / (((Float)this.field929.method507()).floatValue() / Class1466.field5557)) / (double)(30000.0f / (((Float)HUD.method3488(this.field929)).floatValue() / Class3252.field6984)));
        return Color.HSBtoRGB(b2, (float)((Integer)HUD.method3485(this).method507()).intValue() / 100.0f, (float)((Integer)this.field926.method507()).intValue() / Class730.field3340);
    }

    private static int method3537(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    @Class1
    public void method3538(Class214 b2) {
        for (Class479 a2 : this.field940.keySet()) {
            if (!a2.method10778().equals((Object)HUD.method3522(b2))) continue;
            HUD.method3513((Class6283)this.field940.get(a2), (boolean)field894[0]);
            break;
        }
    }

    private static int method3539(int n2) {
        return Class4045.method20105(n2);
    }

    private static void method3540() {
        Class5836.method22897();
    }

    private String method3541(Class277 a2) {
        return a2.method446() + this.method3306(a2.method1248());
    }

    private static int method3542(String string) {
        return Class6454.method24719(string);
    }

    private static void method3543() {
        Class1503.method14420();
    }

    @Class1
    public void method3544(Class133 a2) {
        this.field901.method12593();
    }

    private static int method3545(int n2, int n3, AutoReconnect class343, Class49 class49) {
        return Class3234.method16533(n2, n3, class343, class49);
    }

    @Class1
    public void method3546(Class213 b2) {
        class_1293 c2 = b2.method400();
        Class479 d2 = new Class479(c2.method_5579(), c2.method_5578(), c2.method_5584());
        if (HUD.method3518(this).keySet().removeIf(arg_0 -> HUD.method3336(d2, arg_0))) {
            this.field940.put(d2, new Class6283((boolean)field894[1], 250.0f, Class489.field2548));
        } else {
            Class6283 a2 = new Class6283((boolean)field894[0], 250.0f, HUD.method3381());
            a2.method24284((boolean)field894[1]);
            this.field940.put(d2, a2);
        }
    }

    public static Class248 method3547(HUD class339) {
        return class339.field918;
    }

    private static int method3548(String string) {
        return Class6454.method24719(string);
    }

    private Boolean method3549() {
        return (Boolean)HUD.method3346(HUD.method3490(this));
    }

    private static int method3550(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static void method3551(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method3552(HUD class339) {
        return class339.field938;
    }

    private static Class248 method3553(HUD class339) {
        return HUD.method3547(class339);
    }

    private static void method3554(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3555() {
        Class5836.method22885();
    }

    private static void method3556(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static int method3557(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3558(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method3559(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method3560() {
        Class1745.method15538();
    }

    public static boolean method3561(HUD class339) {
        return class339.field935;
    }

    private static int method3562(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method3563(int n2) {
        return Nametags.method1495(n2);
    }

    private static int method3564(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

