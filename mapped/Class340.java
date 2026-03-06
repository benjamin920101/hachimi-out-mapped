/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2560
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2886
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675
 *  net.minecraft.class_3830
 *  net.minecraft.class_408
 *  net.minecraft.class_418
 *  net.minecraft.class_498
 *  net.minecraft.class_5134
 *  net.minecraft.class_7204
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 *  net.minecraft.class_9334
 */
package mapped;

import mapped.Class1;
import mapped.Class104;
import mapped.Class1092;
import mapped.Class115;
import mapped.Class1150;
import mapped.Class1198;
import mapped.Class1215;
import mapped.Class131;
import mapped.Class142;
import mapped.Class1503;
import mapped.Class159;
import mapped.Class1668;
import mapped.Class173;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class25;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class31;
import mapped.Class3436;
import mapped.Class3495;
import mapped.Class354;
import mapped.Class3655;
import mapped.Class3671;
import mapped.Class372;
import mapped.Class376;
import mapped.Class3850;
import mapped.Class386;
import mapped.Class390;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class4146;
import mapped.Class447;
import mapped.Class479;
import mapped.Class49;
import mapped.Class50;
import mapped.Class54;
import mapped.Class543;
import mapped.Class5479;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5669;
import mapped.Class5723;
import mapped.Class58;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class65;
import mapped.Class69;
import mapped.Class70;
import mapped.Class803;
import mapped.Class829;
import mapped.Class924;
import net.hachimi.client.mixin.by;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2560;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2886;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3830;
import net.minecraft.class_408;
import net.minecraft.class_418;
import net.minecraft.class_498;
import net.minecraft.class_5134;
import net.minecraft.class_7204;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class340
extends Class278 {
    Class248 field941;
    Class248 field942;
    Class248 field943;
    private int field944;
    public static Class340 INSTANCE;
    private boolean field945;
    Class248 field946;
    Class248 field947;
    Class248 field948 = this.method450(new Class253("Strict", "Strict NCP bypass for ground slowdowns", (boolean)field957[1]));
    Class248 field949;
    Class248 field950;
    Class248 field951;
    Class248 field952;
    Class248 field953;
    Class248 field954;
    Class248 field955;
    Class248 field956;
    private static long[] field957;
    Class248 field958;
    Class248 field959;
    Class248 field960 = this.method450(new Class253("AirStrict", "Strict NCP bypass for air slowdowns", (boolean)field957[1]));

    public static Class248 method3565(Class340 class340) {
        return class340.field960;
    }

    private static Class248 method3566(Class340 class340) {
        return Class340.method3673(class340);
    }

    private static void method3567(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method3568(Class340 class340) {
        return class340.field942;
    }

    public static class_304 method3569(class_315 class_3152) {
        return class_3152.field_1849;
    }

    private static void method3570() {
        Class5836.method22885();
    }

    private static void method3571(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method3572(double d2) {
        return Class5659.method22193(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method3573(class_1799 a2) {
        int n2;
        int n3 = a2.method_57353().method_57832(class_9334.field_50075) ? 39582 : 39581;
        block4: while (true) {
            switch (n3) {
                case 39582: {
                    n3 = 39580;
                    continue block4;
                }
                case 39581: {
                    if (a2.method_7909() == class_1802.field_8102 || a2.method_7909() == class_1802.field_8399 || a2.method_7909() == class_1802.field_8255) break block4;
                    n2 = (int)field957[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field957[1];
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method3574() {
        int n2;
        if (!(Class340.field290.field_1755 == null || Class340.field290.field_1755 instanceof class_408 || Class340.field290.field_1755 instanceof class_498 || Class340.field290.field_1755 instanceof class_418)) {
            n2 = (int)field957[0];
            return n2 != 0;
        }
        n2 = (int)field957[1];
        return n2 != 0;
    }

    public static class_746 method3575(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3576(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3577(Class159 class159, float f2) {
        class159.method316(f2);
    }

    public Class340() {
        super("NoSlow", "Prevents items from slowing down player", Class556.field2752);
        this.field952 = this.method450(new Class253("Grim", "Strict Grim bypass for slowdown", (boolean)field957[1]));
        this.field942 = this.method450(new Class253("2.3.67", "Grim 2.3.67 bypass", (boolean)field957[0], this.field952::method507));
        this.field953 = this.method450(new Class253("GrimV3", "Strict GrimV3 bypass for slowdown", (boolean)field957[1]));
        this.field958 = this.method450(new Class253("InventoryMove", "Allows the player to move while in inventories or screens", (boolean)field957[0]));
        this.field954 = this.method450(new Class253("ArrowMove", "Allows the player to look while in inventories or screens by using the arrow keys", (boolean)field957[1]));
        this.field955 = this.method450(new Class253("Items", "Removes the slowdown effect caused by using items", (boolean)field957[0]));
        this.field950 = this.method450(new Class253("Sneak", "Removes sneak slowdown", (boolean)field957[1]));
        this.field941 = this.method450(new Class253("Crawl", "Removes crawl slowdown", (boolean)field957[1]));
        this.field949 = this.method450(new Class253("Shields", "Removes the slowdown effect caused by shields", (boolean)field957[0]));
        this.field946 = this.method450(new Class253("Webs", "Removes the slowdown caused when moving through webs", (boolean)field957[1]));
        this.field951 = this.method450(new Class253("BerryBush", "Removes the slowdown caused when moving through webs", (boolean)field957[1]));
        this.field959 = this.method450(new Class252("WebMultiplier", "Speed to fall through webs", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), this::method1269));
        this.field947 = this.method450(new Class253("SoulSand", "Removes the slowdown effect caused by walking over SoulSand blocks", (boolean)field957[1]));
        this.field943 = this.method450(new Class253("HoneyBlock", "Removes the slowdown effect caused by walking over Honey blocks", (boolean)field957[1]));
        this.field956 = this.method450(new Class253("SlimeBlock", "Removes the slowdown effect caused by walking over Slime blocks", (boolean)field957[1]));
        INSTANCE = this;
    }

    public static Class248 method3578(Class340 class340) {
        return class340.field952;
    }

    @Class1
    public void method3579(Class70 a2) {
        if (((Boolean)this.field960.method507()).booleanValue() && !this.field945 && this.method3629()) {
            this.field945 = (int)field957[0];
            Class5723.field11048.method21341((class_2596)new class_2848((class_1297)Class340.field290.field_1724, class_2848.class_2849.field_12979));
        }
    }

    private static void method3580(float f2) {
        Class5836.method22907(f2);
    }

    @Class1
    public void method3581(Class65 a2) {
        if (a2.method128() == Class543.field2690 && ((Boolean)Class340.method3622(this).method507()).booleanValue()) {
            if (Class340.method3718(field290).method_6115() && !Class340.method3576(field290).method_5715() && ((Boolean)this.field955.method507()).booleanValue()) {
                if (((Boolean)this.field942.method507()).booleanValue()) {
                    Class340.field290.field_1761.method_2906(Class340.field290.field_1724.field_7512.field_7763, (int)field957[0], (int)field957[1], class_1713.field_7790, (class_1657)Class340.field290.field_1724);
                }
                if (Class340.field290.field_1724.method_6058() == Class340.method3626() && Class340.method3699(this, Class340.method3652(Class340.method3598()))) {
                    Class340.method3713(Class5723.field11048, Class340::method3681);
                } else if (Class340.method3631(this, Class340.field290.field_1724.method_6079())) {
                    Class5723.field11048.method21353(Class340::method3710);
                }
            }
        }
    }

    private static void method3582() {
        Class1503.method14420();
    }

    private static boolean method3583() {
        return Class447.method10252();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3584(Class142 b2) {
        class_2248 c2 = b2.method276().method_26204();
        if (!(c2 instanceof class_2560) || !((Boolean)Class340.method3668(this).method507()).booleanValue()) {
            int n2;
            if (!(c2 instanceof class_3830)) return;
            int n3 = (Boolean)this.field951.method507() != false ? 16072 : 16073;
            while ((n2 = n3) != 16072) {
                if (n2 != 16073) {
                    Class1807.method15744();
                    return;
                }
                n3 = 16071;
            }
        } else {
            float a2 = ((Float)Class340.method3566(this).method507()).floatValue();
            if (((Float)this.field959.method507()).floatValue() == 1.0f) {
                a2 = 0.0f;
            }
            b2.method10();
            b2.method275(a2);
        }
    }

    public static class_746 method3585(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static float method3586(class_744 class_7442) {
        return class_7442.field_3905;
    }

    public static Class248 method3587(Class340 class340) {
        return class340.field952;
    }

    private static int method3588(int n2, int n3, Class54 class54, Class260 class260) {
        return Class3495.method17663(n2, n3, class54, class260);
    }

    public static Class829 method3589() {
        return Class5723.field11053;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method3590(Class31 a) {
        block4: {
            block7: {
                block6: {
                    block3: {
                        block5: {
                            if (!((Boolean)this.field952.method507()).booleanValue() || !((Boolean)this.field955.method507()).booleanValue()) break block4;
                            if (!((Boolean)this.field942.method507()).booleanValue() || Class340.field290.field_1724 == null) break block4;
                            if (this.field944 <= 0) break block5;
                            v0 = 2580;
                            ** GOTO lbl11
                        }
                        v0 = 2581;
                        if (true) ** GOTO lbl11
                        do {
                            v0 = var2_2 = 2579;
lbl11:
                            // 3 sources

                            if (var2_2 == 2580) break block3;
                        } while (var2_2 == 2581);
                        break block6;
                    }
                    Class340.method3614(Class340.field290, (int)Class340.field957[1]);
                    a.method10();
                    break block4;
                }
                if (!Class340.field290.field_1724.method_5998(a.field41).method_7909().method_57347().method_57832(class_9334.field_50075)) break block7;
                v1 = 54675;
                ** GOTO lbl27
            }
            v1 = 54676;
            if (true) ** GOTO lbl27
            while (true) {
                v1 = var3_3 = 54674;
lbl27:
                // 3 sources

                if (var3_3 == 54675) break;
                if (var3_3 == 54676) {
                    continue;
                }
                break block4;
                break;
            }
            Class340.field290.field_1761.method_2906(Class340.method3694((class_310)Class340.field290).field_7512.field_7763, (int)Class340.field957[0], (int)Class340.field957[1], Class340.method3691(), (class_1657)Class340.field290.field_1724);
        }
    }

    public static Class829 method3591() {
        return Class5723.field11053;
    }

    private static void method3592(class_744 class_7442, float f2) {
        Class340.method3688(class_7442, f2);
    }

    @Override
    public void method1279() {
        if (((Boolean)Class340.method3565(this).method507()).booleanValue() && this.field945) {
            Class340.method3659(Class5723.field11048, (class_2596)new class_2848((class_1297)Class340.method3639(field290), class_2848.class_2849.field_12984));
        }
        this.field945 = (int)field957[1];
        Class340.method3658(Class5723.field11047, 1.0f);
    }

    private static boolean method3593() {
        return Class447.method10322();
    }

    private static boolean method3594(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static void method3595() {
        Class4146.method20694();
    }

    public static class_2248 method3596() {
        return class_2246.field_10114;
    }

    public static class_746 method3597(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class3850 method3598() {
        return Class340.method3603();
    }

    public static class_746 method3599(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3600() {
        Class4146.method20697();
    }

    private static void method3601() {
        Class6454.method24594();
    }

    public static int method3602(Class340 class340) {
        return class340.field944;
    }

    public static Class3850 method3603() {
        return Class5723.field11058;
    }

    @Class1(priority=100)
    public void method3604(Class69 d2) {
        if (Class340.method3664(field290) != null && ((Boolean)this.field958.method507()).booleanValue() && Class340.method3611(this)) {
            if (d2.method128() == Class543.field2690) {
                class_304[] c2;
                long b2 = field290.method_22683().method_4490();
                class_304[] class_304Array = new class_304[(int)field957[6]];
                class_304Array[(int)Class340.field957[1]] = Class340.method3608((class_310)Class340.field290).field_1903;
                class_304Array[(int)Class340.field957[0]] = Class340.method3624(Class340.field290.field_1690);
                class_304Array[(int)Class340.field957[5]] = Class340.field290.field_1690.field_1881;
                class_304Array[(int)Class340.field957[2]] = Class340.method3569(Class340.field290.field_1690);
                class_304Array[(int)Class340.field957[4]] = Class340.method3621(Class340.field290.field_1690);
                class_304[] class_304Array2 = c2 = class_304Array;
                int n2 = class_304Array2.length;
                for (int i2 = (int)field957[1]; i2 < n2; ++i2) {
                    class_304 a2 = class_304Array2[i2];
                    a2.method_23481(class_3675.method_15987((long)b2, (int)((by)a2).getBoundKey().method_1444()));
                }
            }
        }
    }

    public static float method3605(class_744 class_7442) {
        return class_7442.field_3907;
    }

    private static int method3606(int n2, int n3, Class5669 class5669, Class1198 class1198) {
        return Class3495.method17632(n2, n3, class5669, class1198);
    }

    private static class_746 method3607(class_310 class_3102) {
        return Class340.method3597(class_3102);
    }

    private static class_315 method3608(class_310 class_3102) {
        return Class340.method3726(class_3102);
    }

    public static class_746 method3609(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3610(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static boolean method3611(Class340 class340) {
        return class340.method3574();
    }

    private static void method3612(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method3613(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method3614(class_310 class_3102, int n2) {
        Class340.method3656(class_3102, n2);
    }

    private static void method3615() {
        Class5836.method22885();
    }

    public static class_746 method3616(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_315 method3617(class_310 class_3102) {
        return Class340.method3670(class_3102);
    }

    private static Object method3618(Class248 class248) {
        return class248.method507();
    }

    private static int method3619(int n2, int n3, Class479 class479, Class251 class251) {
        return Class3495.method17645(n2, n3, class479, class251);
    }

    private static void method3620(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_304 method3621(class_315 class_3152) {
        return class_3152.field_1913;
    }

    public static Class248 method3622(Class340 class340) {
        return class340.field952;
    }

    private static Class248 method3623(Class340 class340) {
        return Class340.method3661(class340);
    }

    public static class_304 method3624(class_315 class_3152) {
        return class_3152.field_1894;
    }

    private static void method3625(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_1268 method3626() {
        return class_1268.field_5810;
    }

    private static void method3627() {
        Class5836.method22890();
    }

    private static void method3628(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method3629() {
        int n2;
        block6: {
            block7: {
                if (Class390.method5496().method5488()) return (int)field957[0] != 0;
                if (((Boolean)Class340.method3578(this).method507()).booleanValue() && ((Boolean)Class340.method3568(this).method507()).booleanValue() && Class340.field290.field_1724.method_6115() && Class340.field290.field_1724.method_6048() <= (int)field957[0]) {
                    if ((Boolean)Class340.method3618(this.field955) == false) return Class5659.method22194();
                    return (int)field957[1] != 0;
                }
                if (((Boolean)Class340.method3623(this).method507()).booleanValue() && !this.method3714()) {
                    return (int)field957[1] != 0;
                }
                if (Class340.field290.field_1724.method_3144() || Class340.method3607(field290).method_5715()) break block6;
                if (Class340.field290.field_1724.method_6115() && ((Boolean)Class340.method3650(this).method507()).booleanValue()) break block7;
                if (!Class340.method3609(field290).method_6039()) {
                    return Class340.method3635();
                }
                if (!((Boolean)Class340.method3685(this).method507()).booleanValue()) break block6;
                if ((Boolean)this.field953.method507() != false) return Class408.method6431();
                if (((Boolean)Class340.method3587(this).method507()).booleanValue()) break block6;
            }
            n2 = (int)field957[0];
            return n2 != 0;
        }
        n2 = (int)field957[1];
        return n2 != 0;
    }

    private static void method3630() {
        Class6454.method24594();
    }

    private static boolean method3631(Class340 class340, class_1799 class_17992) {
        return class340.method3573(class_17992);
    }

    private static Object method3632(Class248 class248) {
        return class248.method507();
    }

    private static void method3633() {
        Class6009.method23561();
    }

    private static int method3634(int n2, int n3, Class354 class354, Class50 class50) {
        return Class3495.method17673(n2, n3, class354, class50);
    }

    private static boolean method3635() {
        return Class3979.method19551();
    }

    private static boolean method3636(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method3637() {
        Class298.method1924();
    }

    public static class_746 method3638(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3639(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3640(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Class1
    public void method3641(Class25 a2) {
        if (((Boolean)this.field956.method507()).booleanValue()) {
            int n2 = 6934;
            Class6009.method23560();
            return;
        }
        int n3 = 6935;
        Class340.method3675();
    }

    private static void method3642(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method3643() {
        Class5659.method22184();
    }

    private static boolean method3644(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method3645(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static class_746 method3646(class_310 class_3102) {
        return class_3102.field_1724;
    }

    static {
        field957 = new long[10];
        Class340.method3721(-5213004647679476764L);
    }

    private static boolean method3647() {
        return Class1807.method15753();
    }

    private static boolean method3648() {
        return Class447.method10322();
    }

    private static void method3649(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method3650(Class340 class340) {
        return class340.field955;
    }

    public static class_746 method3651(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_1799 method3652(Class3850 class3850) {
        return class3850.method18908();
    }

    public static class_746 method3653(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3654() {
        Class1503.method14420();
    }

    private static void method3655() {
        Class1745.method15538();
    }

    public static void method3656(class_310 class_3102, int n2) {
        class_3102.field_1752 = n2;
    }

    private static class_746 method3657(class_310 class_3102) {
        return Class340.method3674(class_3102);
    }

    private static void method3658(Class3978 class3978, float f2) {
        class3978.method19512(f2);
    }

    private static void method3659(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static boolean method3660() {
        return Class447.method10322();
    }

    public static Class248 method3661(Class340 class340) {
        return class340.field953;
    }

    public static class_746 method3662(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Exception decompiling
     */
    @Class1
    public void method3663(Class131 b) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static class_746 method3664(class_310 class_3102) {
        return Class340.method3697(class_3102);
    }

    private static boolean method3665() {
        return Class376.method4987();
    }

    public static float method3666(class_744 class_7442) {
        return class_7442.field_3907;
    }

    private static void method3667() {
        Class3979.method19561();
    }

    public static Class248 method3668(Class340 class340) {
        return class340.field946;
    }

    private static int method3669(int n2, int n3, Class115 class115, Class386 class386) {
        return Class3495.method17661(n2, n3, class115, class386);
    }

    public static class_315 method3670(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static class_746 method3671(class_310 class_3102) {
        return Class340.method3638(class_3102);
    }

    private static void method3672(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class248 method3673(Class340 class340) {
        return class340.field959;
    }

    public static class_746 method3674(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3675() {
        Class4146.method20697();
    }

    public static class_746 method3676(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3677() {
        Class5836.method22885();
    }

    private static void method3678() {
        Class5836.method22885();
    }

    private static boolean method3679() {
        return Class1807.method15742();
    }

    public static class_1713 method3680() {
        return class_1713.field_7790;
    }

    private static class_2596 method3681(int a2) {
        return new class_2886(class_1268.field_5808, a2, Class340.field290.field_1724.method_36454(), Class340.field290.field_1724.method_36455());
    }

    private static void method3682() {
        Class4146.method20697();
    }

    private static int method3683(int n2, int n3, Class1150 class1150, Class58 class58) {
        return Class3495.method17628(n2, n3, class1150, class58);
    }

    @Class1
    public void method3684(Class49 b2) {
        block5: {
            block4: {
                if (((Boolean)Class340.method3724(this).method507()).booleanValue() && Class340.field290.field_1724.method_5715()) break block4;
                if (!((Boolean)this.field941.method507()).booleanValue()) break block5;
                if (!Class340.field290.field_1724.method_20448()) break block5;
            }
            float a2 = 1.0f / (float)Class340.field290.field_1724.method_45325(class_5134.field_51584);
            b2.field66.field_3905 *= a2;
            class_744 class_7442 = b2.field66;
            Class340.method3592(class_7442, Class340.method3666(class_7442) * a2);
        }
        if (this.method3629()) {
            b2.field66.field_3905 = Class340.method3586(b2.field66) * Class3671.field8213;
            class_744 class_7443 = b2.field66;
            Class340.method3705(class_7443, Class340.method3605(class_7443) * Class5479.field10269);
        }
    }

    private Boolean method1269() {
        return ((Boolean)Class340.method3695(this.field946) != false || (Boolean)this.field951.method507() != false ? (int)field957[0] : (int)field957[1]) != 0;
    }

    public static Class248 method3685(Class340 class340) {
        return class340.field949;
    }

    private static boolean method3686() {
        return Class408.method6431();
    }

    private static Object method3687(Class248 class248) {
        return class248.method507();
    }

    public static void method3688(class_744 class_7442, float f2) {
        class_7442.field_3907 = f2;
    }

    private static void method3689() {
        Class5836.method22885();
    }

    private static boolean method3690() {
        return Class1807.method15753();
    }

    private static class_1713 method3691() {
        return Class340.method3680();
    }

    private static void method3692() {
        Class6454.method24594();
    }

    private static Object method3693(Class248 class248) {
        return class248.method507();
    }

    private static class_746 method3694(class_310 class_3102) {
        return Class340.method3662(class_3102);
    }

    private static Object method3695(Class248 class248) {
        return class248.method507();
    }

    private static Object method3696(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method3697(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method3698(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method3699(Class340 class340, class_1799 class_17992) {
        return class340.method3573(class_17992);
    }

    @Class1
    public void method3700(Class159 a2) {
        if (a2.method314() == class_2246.field_10030 && ((Boolean)this.field956.method507()).booleanValue()) {
            a2.method10();
            Class340.method3577(a2, Class3436.field7490);
        }
    }

    private static void method3701(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method3702(Class248 class248) {
        return class248.method507();
    }

    private static boolean method3703() {
        return Class376.method4987();
    }

    private static class_746 method3704(class_310 class_3102) {
        return Class340.method3653(class_3102);
    }

    public static void method3705(class_744 class_7442, float f2) {
        class_7442.field_3907 = f2;
    }

    private static boolean method3706() {
        return Class376.method4987();
    }

    public static Class248 method3707(Class340 class340) {
        return class340.field958;
    }

    @Class1
    public void method3708(Class104 a2) {
        if (a2.method189() == Class340.method3596() && ((Boolean)this.field947.method507()).booleanValue() || a2.method189() == class_2246.field_21211 && ((Boolean)this.field943.method507()).booleanValue()) {
            a2.method10();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3709(Class63 f2) {
        int n2;
        float c2;
        float b2;
        long d2;
        block16: {
            block15: {
                class_304[] e2;
                if (f2.method128() != Class543.field2690) return;
                if (((Boolean)this.field955.method507()).booleanValue() && ((Boolean)Class340.method3693(this.field952)).booleanValue() && ((Boolean)this.field942.method507()).booleanValue()) {
                    this.field944 = Class340.method3602(this) - (int)field957[0];
                    if (Class340.method3599(field290).method_6115()) {
                        Class340.method3711(this, (int)field957[5]);
                    }
                }
                if (((Boolean)this.field960.method507()).booleanValue()) {
                    while (true) {
                        // Infinite loop
                    }
                }
                if ((Boolean)Class340.method3687(Class340.method3707(this)) == false) return;
                if (!this.method3574()) {
                    return;
                }
                d2 = field290.method_22683().method_4490();
                class_304[] class_304Array = new class_304[(int)field957[6]];
                class_304Array[(int)Class340.field957[1]] = Class340.method3617((class_310)Class340.field290).field_1903;
                class_304Array[(int)Class340.field957[0]] = Class340.field290.field_1690.field_1894;
                class_304Array[(int)Class340.field957[5]] = Class340.field290.field_1690.field_1881;
                class_304Array[(int)Class340.field957[2]] = Class340.field290.field_1690.field_1849;
                class_304Array[(int)Class340.field957[4]] = Class340.field290.field_1690.field_1913;
                class_304[] class_304Array2 = e2 = class_304Array;
                int n3 = class_304Array2.length;
                int n4 = (int)field957[1];
                while (true) {
                    if (n4 >= n3) {
                        if ((Boolean)this.field954.method507() == false) return;
                        b2 = Class340.method3671(field290).method_36454();
                        c2 = Class340.field290.field_1724.method_36455();
                        if (!class_3675.method_15987((long)d2, (int)((int)field957[9]))) {
                            break;
                        }
                        break block15;
                    }
                    class_304 a2 = class_304Array2[n4];
                    a2.method_23481(class_3675.method_15987((long)d2, (int)((by)a2).getBoundKey().method_1444()));
                    ++n4;
                }
                n2 = 33742;
                break block16;
            }
            n2 = 33741;
        }
        block6: while (true) {
            switch (n2) {
                case 33742: {
                    n2 = 33740;
                    continue block6;
                }
                case 33741: {
                    c2 -= 3.0f;
                    break block6;
                }
                default: {
                    if (class_3675.method_15987((long)d2, (int)((int)field957[3]))) {
                        c2 += 3.0f;
                        break block6;
                    }
                    if (class_3675.method_15987((long)d2, (int)((int)field957[7]))) {
                        b2 -= Class3655.field8180;
                        break block6;
                    }
                    if (!class_3675.method_15987((long)d2, (int)((int)field957[8]))) break block6;
                    b2 += Class1092.field4428;
                }
            }
            break;
        }
        Class340.field290.field_1724.method_36456(b2);
        Class340.method3676(field290).method_36457(class_3532.method_15363((float)c2, (float)-90.0f, (float)90.0f));
    }

    private static class_2596 method3710(int a2) {
        return new class_2886(class_1268.field_5810, a2, Class340.method3704(field290).method_36454(), Class340.field290.field_1724.method_36455());
    }

    public static void method3711(Class340 class340, int n2) {
        class340.field944 = n2;
    }

    public static Class340 method3712() {
        return INSTANCE;
    }

    private static void method3713(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    /*
     * Unable to fully structure code
     */
    private boolean method3714() {
        block9: {
            if (Class340.field290.field_1724.method_5715() || Class340.method3575(Class340.field290).method_20448() || Class340.method3657(Class340.field290).method_3144()) break block9;
            if (Class340.field290.field_1724.method_6014() >= (int)Class340.field957[6]) break block9;
            if (!Class372.method4874().method1265()) ** GOTO lbl17
            if (!Class372.method4874().method4876()) ** GOTO lbl17
        }
        if (Class340.field290.field_1724.method_6048() <= (int)Class340.field957[0]) {
            return Class3979.method19539();
        }
        v0 = 8565;
        if (true) ** GOTO lbl12
        block4: while (true) {
            v0 = 8564;
lbl12:
            // 2 sources

            switch (v0) {
                case 8566: {
                    continue block4;
                }
                case 8565: {
                    if (Class340.field290.field_1724.method_6048() % (int)Class340.field957[5] == 0) ** GOTO lbl19
lbl17:
                    // 3 sources

                    v1 = (int)Class340.field957[0];
                    break block4;
                }
lbl19:
                // 2 sources

                default: {
                    v1 = (int)Class340.field957[1];
                }
            }
            break;
        }
        return (boolean)v1;
    }

    private static void method3715(float f2) {
        Class5836.method22907(f2);
    }

    private static void method3716(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class248 method3717(Class340 class340) {
        return class340.field948;
    }

    public static class_746 method3718(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3719(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method3720(int n2, int n3, Class924 class924, Class173 class173) {
        return Class3495.method17620(n2, n3, class924, class173);
    }

    private static void method3721(long l2) {
        Class340.field957[7] = l2 ^ 0xB7A7AFE4829ABAE3L;
        Class340.field957[0] = l2 ^ 0xB7A7AFE4829ABBE5L;
        Class340.field957[2] = l2 ^ 0xB7A7AFE4829ABBE7L;
        Class340.field957[1] = l2 ^ 0xB7A7AFE4829ABBE4L;
        Class340.field957[9] = l2 ^ 0xB7A7AFE4829ABAEDL;
        Class340.field957[5] = l2 ^ 0xB7A7AFE4829ABBE6L;
        Class340.field957[3] = l2 ^ 0xB7A7AFE4829ABAECL;
        Class340.field957[4] = l2 ^ 0xB7A7AFE4829ABBE0L;
        Class340.field957[8] = l2 ^ 0xB7A7AFE4829ABAE2L;
        Class340.field957[6] = l2 ^ 0xB7A7AFE4829ABBE1L;
    }

    private static boolean method3722(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method3723(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method3724(Class340 class340) {
        return class340.field950;
    }

    private static void method3725() {
        Class6009.method23561();
    }

    public static class_315 method3726(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method3727() {
        Class6454.method24594();
    }

    @Class1
    public void method3728(Class65 c2) {
        block5: {
            block6: {
                if (c2.method128() != Class543.field2690) break block5;
                if (((Boolean)this.field952.method507()).booleanValue()) break block6;
                if (!((Boolean)Class340.method3702(this.field953)).booleanValue()) break block5;
            }
            if (((Boolean)this.field946.method507()).booleanValue()) {
                class_238 b2 = Class340.field290.field_1724.method_5829();
                for (class_2338 a2 : Class5659.method22136(b2)) {
                    Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, a2, class_2350.field_11033));
                }
            }
        }
    }

    private static void method3729() {
        Class5659.method22184();
    }

    private static void method3730(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

