/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.SequencedPacketCreator
 *  net.minecraft.client.network.ClientPlayerEntity
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.awt.Color;
import java.util.List;
import mapped.Class1;
import mapped.Class105;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class125;
import mapped.Class13;
import mapped.Class131;
import mapped.Class149;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1685;
import mapped.Class1745;
import mapped.Class1766;
import mapped.Class18;
import mapped.Class1807;
import mapped.Class196;
import mapped.Class210;
import mapped.Class241;
import mapped.Class242;
import mapped.Class246;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class259;
import mapped.Class260;
import mapped.Class268;
import mapped.Chams;
import mapped.Class30;
import mapped.Class3332;
import mapped.Class3442;
import mapped.AutoEat;
import mapped.NoJumpDelay;
import mapped.Class3815;
import mapped.Class3850;
import mapped.FastPlace;
import mapped.Disabler;
import mapped.NoGlitch;
import mapped.Class3979;
import mapped.Class3980;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Replenish;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4181;
import mapped.Class4196;
import mapped.Follower;
import mapped.Class480;
import mapped.Class489;
import mapped.Class539;
import mapped.Class5496;
import mapped.Class5512;
import mapped.Class553;
import mapped.Class554;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class570;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class588;
import mapped.Class59;
import mapped.Class590;
import mapped.Class5984;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class610;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class68;
import mapped.Class692;
import mapped.Class694;
import mapped.Class873;
import mapped.Class926;
import net.hachimi.client.mixin.bt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.network.ClientPlayerEntity;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpeedMine
extends Class414 {
    Class248 field1872;
    Class248 field1873;
    Class248 field1874;
    private static long[] field1875;
    private long field1876;
    Class248 field1877;
    Class248 field1878;
    Class248 field1879;
    Class248 field1880;
    Class248 field1881;
    Class248 field1882;
    public static Class926 field1883;
    Class248 field1884;
    Class248 field1885;
    public static List field1886;
    public class_1799 field1887;
    Class248 field1888;
    Class248 field1889;
    Class248 field1890;
    Class248 field1891;
    Class248 field1892;
    public Class5512 field1893;
    Class248 field1894;
    Class248 field1895;
    Class248 field1896;
    Class248 field1897;
    Class248 field1898;
    Class248 field1899;
    Class248 field1900;
    Class248 field1901;
    public Runnable field1902;
    Class248 field1903;
    Class248 field1904;
    Class248 field1905;
    Class248 field1906;
    Class248 field1907;
    Class248 field1908;
    private static SpeedMine INSTANCE;
    Class248 field1909;
    Class248 field1910;
    Class248 field1911;
    Class248 field1912;
    Class248 field1913;
    Class248 field1914;
    Class248 field1915;
    Class248 field1916;
    Class248 field1917;
    public Class5512 field1918;
    Class248 field1919;
    public boolean field1920 = (int)field1875[2];
    Class248 field1921;
    public boolean field1922 = (int)field1875[2];
    Class248 field1923;
    Class248 field1924;
    Class248 field1925;
    Class248 field1926;
    Class248 field1927;
    Class248 field1928;
    Class248 field1929;
    public static boolean $skidonion$890408483;

    private static boolean method8310() {
        return Class1807.method15742();
    }

    private static void method8311(SpeedMine class425, Class5512 class5512) {
        SpeedMine.method8390(class425, class5512);
    }

    public static Class539 method8312() {
        return Class539.field2670;
    }

    public static void method8313(SpeedMine class425, boolean bl2) {
        class425.field1920 = bl2;
    }

    private static boolean method8314(SpeedMine class425) {
        return SpeedMine.method8534(class425);
    }

    private static void method8315() {
        Class6009.method23561();
    }

    private static void method8316() {
        Chams.method1924();
    }

    private static void method8317(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8318() {
        Class6009.method23561();
    }

    private Boolean method8319() {
        return (this.field1917.method507() == SpeedMine.method8507() && !((Boolean)this.field1897.method507()).booleanValue() && ((Boolean)this.field1906.method507()).booleanValue() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8320() {
        Class6009.method23561();
    }

    private static void method8321() {
        Class3979.method19561();
    }

    private static Object method8322(Class248 class248) {
        return class248.method507();
    }

    private Boolean method8323() {
        if (this.field1917.method507() != Class539.field2670) {
            while (true) {
                // Infinite loop
            }
        }
        return (boolean)field1875[1];
    }

    private Boolean method8324() {
        return (SpeedMine.method8333(this.field1917) == SpeedMine.method8457() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8325(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method8326(SpeedMine class425) {
        return class425.field1917;
    }

    static {
        ___.___(35, SpeedMine.class);
        ____.___35_250(SpeedMine.class);
    }

    private static void method8327() {
        Class3979.method19561();
    }

    private static int method8328(int n2, int n3, Disabler class390, Class3815 class3815) {
        return Class3332.method17051(n2, n3, class390, class3815);
    }

    public static Class248 method8329(SpeedMine class425) {
        return class425.field1917;
    }

    public static Class5512 method8330(SpeedMine class425) {
        return class425.field1893;
    }

    private static void method8331() {
        Class5836.method22890();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void method1279() {
        field1886.clear();
        if (SpeedMine.method8506(field290) != null) {
            int n2 = 38660;
            while (true) {
                // Infinite loop
            }
        }
        int n3 = 38661;
        block5: while (true) {
            switch (n3) {
                case 38661: {
                    n3 = 38659;
                    continue block5;
                }
                case 38660: {
                    if (this.field1902 == null) break block5;
                    this.field1920 = (int)field1875[1];
                    this.field1902.run();
                    break block5;
                }
            }
            break;
        }
        this.field1918 = null;
        this.field1902 = null;
        SpeedMine.method8311(this, null);
        this.field1920 = (int)field1875[2];
        this.field1922 = (int)field1875[2];
    }

    private static void method8332() {
        Chams.method1924();
    }

    private static Object method8333(Class248 class248) {
        return class248.method507();
    }

    private static class_2596 method8334(class_2338 a2, class_2350 b2, int c2) {
        return new class_2846(class_2846.class_2847.field_12973, a2, b2, c2);
    }

    private static int method8335(int n2, int n3, Class692 class692, NoJumpDelay class381) {
        return Class3332.method17128(n2, n3, class692, class381);
    }

    private static void method8336() {
        Class6009.method23561();
    }

    private Boolean method8337() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8338(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method8339() {
        Class5836.method22885();
    }

    private static void method8340(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class554 method8341() {
        return Class554.field2742;
    }

    public static Class539 method8342() {
        return Class539.field2670;
    }

    private static void method8343(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_2596 method8344(class_2846 a2, int b2) {
        return new class_2846(class_2846.class_2847.field_12973, a2.method_12362(), a2.method_12360(), b2);
    }

    private static Object method8345(Class248 class248) {
        return class248.method507();
    }

    private static void method8346() {
        Chams.method1924();
    }

    public static Class539 method8347() {
        return Class539.field2670;
    }

    private Boolean method8348() {
        if (this.field1917.method507() != Class539.field2670) {
            Class6454.method24594();
            return null;
        }
        return (boolean)field1875[1];
    }

    public static Class248 method8349(SpeedMine class425) {
        return class425.field1917;
    }

    private static Object method8350(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method8351(Class105 a2) {
        if (((Boolean)this.field1872.method507()).booleanValue() && SpeedMine.method8482(this.field1917) == Class539.field2669) {
            a2.method10();
        }
    }

    private Boolean method8352() {
        return (this.field1917.method507() == SpeedMine.method8312() && (Boolean)this.field1925.method507() != false ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8353() {
        Class4146.method20694();
    }

    private static Object method8354(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method8355() {
        int n2;
        int n3 = SpeedMine.method8485(this.field1917) == Class539.field2670 ? 59618 : 59619;
        block4: while (true) {
            switch (n3) {
                case 59619: {
                    n3 = 59617;
                    continue block4;
                }
                case 59618: {
                    n2 = (int)field1875[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1875[2];
        return n2 != 0;
    }

    public class_1799 method8356() {
        return Class5723.field11058.method18908();
    }

    private Boolean method8357() {
        return (this.field1917.method507() == SpeedMine.method8443() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static void method8358(SpeedMine class425, Runnable runnable) {
        class425.field1902 = runnable;
    }

    public static class_2338 method8359(Class5512 class5512) {
        return class5512.field10395;
    }

    private Boolean method8360() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8361() {
        Class6454.method24594();
    }

    private static void method8362() {
        Class5836.method22897();
    }

    private static void method8363(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8364() {
        Class1807.method15744();
    }

    private static void method8365(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8366() {
        Class4146.method20694();
    }

    private static boolean method8367(SpeedMine class425, class_2248 class_22482) {
        return class425.method8402(class_22482);
    }

    private static Object method8368(Class248 class248) {
        return class248.method507();
    }

    @Class1(priority=100)
    private void method8369(Class210 c2) {
        if (SpeedMine.method8473(field290) == null || SpeedMine.field290.field_1687 == null) {
            SpeedMine.method8433(this, null);
            this.field1893 = null;
            this.field1918 = null;
            return;
        }
        if (SpeedMine.method8375((Class246)SpeedMine.method8471(this.field1905)) && this.field1918 != null) {
            class_2338 a2 = this.field1918.field10395;
            new Class3442(a2, class_1802.field_8466, (boolean)field1875[2], (Class607)((Object)this.field1924.method507())).method17369((Double)this.field1894.method507(), (Boolean)this.field1892.method507(), (boolean)field1875[2], 0.0);
        }
        switch (((Class539)((Object)this.field1917.method507())).ordinal()) {
            case 1: {
                if (this.field1902 != null) {
                    this.field1902.run();
                }
                if (this.field1918 != null) {
                    this.field1918.method21679();
                }
                if (this.field1893 == null) break;
                SpeedMine.method8330(this).method21675();
                if (!SpeedMine.method8396(this.field1893)) break;
                this.field1893 = null;
                if (!SpeedMine.method8314(this)) break;
                if (this.field1902 == null) break;
                this.field1920 = (int)field1875[1];
                SpeedMine.method8493(this).run();
                this.field1920 = (int)field1875[2];
                break;
            }
            case 0: {
                bt b2 = (bt)SpeedMine.field290.field_1761;
                if (!(b2.hookGetCurrentBreakingProgress() >= ((Float)this.field1891.method507()).floatValue())) break;
                b2.hookSetCurrentBreakingProgress(1.0f);
            }
        }
        this.field1887 = SpeedMine.method8475(Class5723.field11058);
    }

    private Boolean method8370() {
        return (SpeedMine.method8504(this.field1917) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8371() {
        return (SpeedMine.method8417(SpeedMine.method8496(this)) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method1278() {
        return (this.field1917.method507() == Class539.field2669 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static class_636 method8372(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private Boolean method8373() {
        if (this.field1917.method507() != Class539.field2670) {
            Class1503.method14420();
            return null;
        }
        return (boolean)field1875[1];
    }

    private static void method8374(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static boolean method8375(Class246 class246) {
        return class246.field295;
    }

    private static void method8376() {
        Class4146.method20697();
    }

    private static void method8377(float f2) {
        Class5836.method22907(f2);
    }

    private Boolean method8378() {
        if (this.field1917.method507() != Class539.field2670) {
            SpeedMine.method8320();
            return null;
        }
        return (boolean)field1875[1];
    }

    private static void method8379(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8380(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static long method8381(SpeedMine class425) {
        return class425.field1876;
    }

    private static Object method8382(Class248 class248) {
        return class248.method507();
    }

    private static Object method8383(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method8384(SpeedMine class425) {
        return class425.field1917;
    }

    private static Class248 method8385(SpeedMine class425) {
        return SpeedMine.method8538(class425);
    }

    private Boolean method8386() {
        return (SpeedMine.method8326(this).method507() == SpeedMine.method8505() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static boolean method8387() {
        return Replenish.method6431();
    }

    private static void method8388() {
        Chams.method1924();
    }

    @Class1
    public void method8389(Class149 a2) {
        if (((Boolean)this.field1900.method507()).booleanValue() && this.field1917.method507() == Class539.field2669) {
            a2.method10();
        }
    }

    public static void method8390(SpeedMine class425, Class5512 class5512) {
        class425.field1893 = class5512;
    }

    private Boolean method8391() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8392() {
        if (SpeedMine.method8329(this).method507() == SpeedMine.method8490()) {
            int n2 = (int)field1875[1];
            while (true) {
                // Infinite loop
            }
        }
        return (boolean)field1875[2];
    }

    private static boolean method8393(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static Class554[] method8394() {
        return Class554.values();
    }

    private static void method8395(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method8396(Class5512 class5512) {
        return class5512.method21577();
    }

    private static Color method8397(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    public static Class554 method8398() {
        return Class554.field2743;
    }

    /*
     * WARNING - void declaration
     */
    private void method8399(Class59 i2, Class489 j2, Class5512 k2) {
        void m2;
        double l2 = j2.method10803(class_3532.method_15350((double)(k2.field10405 + (k2.field10393 - k2.field10405) * (double)i2.method124()), (double)0.0, (double)1.0));
        Class6009.method23560();
        if (!((Boolean)SpeedMine.method8497(this).method507()).booleanValue()) {
            Class6009.method23559(true);
            return;
        }
        class_265 g2 = SpeedMine.field290.field_1687.method_8320(k2.field10395).method_26218((class_1922)SpeedMine.field290.field_1687, SpeedMine.method8498(k2));
        if (g2.method_1110()) {
            class_238 a2 = new class_238(SpeedMine.method8359(k2));
            Class1745.method15538();
            return;
        }
        class_238 b2 = (Boolean)this.field1914.method507() != false ? g2.method_1107().method_996(SpeedMine.method8442(k2)) : new class_238(k2.field10395);
        class_243 c2 = b2.method_1005();
        double d2 = b2.method_17939() / 2.0 * l2;
        double e2 = b2.method_17940() / 2.0 * l2;
        double f2 = b2.method_17941() / 2.0 * l2;
        class_238 h2 = new class_238(c2.method_1023(d2, e2, f2), c2.method_1031(d2, e2, f2));
        Color n2 = SpeedMine.method8397((Color)SpeedMine.method8487(this.field1921), ((Color)this.field1921.method507()).getAlpha());
        Color o2 = Class4045.method20088((Color)this.field1885.method507(), ((Color)this.field1885.method507()).getAlpha());
        Color p2 = Class4045.method20089(n2, o2, l2);
        Color q2 = Class4045.method20088((Color)SpeedMine.method8418(this.field1911), ((Color)this.field1911.method507()).getAlpha());
        Color r2 = Class4045.method20088((Color)SpeedMine.method8494(this).method507(), ((Color)SpeedMine.method8519(this).method507()).getAlpha());
        Color s2 = Class4045.method20089(q2, r2, l2);
        if (((Class570)((Object)this.field1927.method507())).method11085()) {
            Class6454.method24621(i2.method125(), (class_238)m2, p2.getRGB());
        }
        if (((Class570)((Object)SpeedMine.method8416(this).method507())).method11087()) {
            Class6454.method24605(i2.method125(), (class_238)m2, 1.0f, s2.getRGB());
        }
        Class6009.method23561();
    }

    private static int method8400(int n2, int n3, Class3980 class3980, AutoEat class364) {
        return Class3332.method17048(n2, n3, class3980, class364);
    }

    public static Class248 method8401(SpeedMine class425) {
        return class425.field1917;
    }

    public boolean method8402(class_2248 a2) {
        if (this.field1919.method507() == SpeedMine.method8488()) {
            return (!((List)this.field1890.method507()).contains(a2) ? (int)field1875[1] : (int)field1875[2]) != 0;
        }
        if (this.field1919.method507() == Class588.field2874) {
            return ((List)this.field1913.method507()).contains(a2);
        }
        return (int)field1875[1] != 0;
    }

    private Boolean method8403() {
        if (this.field1917.method507() == Class539.field2670) {
            int n2 = 32807;
            Class6322.method24332(Class1766.field6615, 0.10805172f);
            return null;
        }
        int n3 = 32808;
        Class5836.method22890();
        return null;
    }

    private static boolean method8404(int n2) {
        return Class4196.method20803(n2);
    }

    private static class_2338 method8405(Class18 class18) {
        return class18.method34();
    }

    /*
     * Unable to fully structure code
     */
    private Boolean method8406() {
        block4: {
            block3: {
                block1: {
                    block2: {
                        if (SpeedMine.method8541(this).method507() != Class539.field2670) break block2;
                        v0 = 18334;
                        ** GOTO lbl9
                    }
                    v0 = 18335;
                    if (true) ** GOTO lbl9
                    do {
                        v0 = var1_1 = 18333;
lbl9:
                        // 3 sources

                        if (var1_1 == 18334) break block1;
                    } while (var1_1 == 18335);
                    break block3;
                }
                v1 = (int)SpeedMine.field1875[1];
                break block4;
            }
            v1 = (int)SpeedMine.field1875[2];
        }
        return (boolean)v1;
    }

    public static SpeedMine method8407() {
        return INSTANCE;
    }

    private static int method8408(int n2, int n3, Class873 class873, Class68 class68) {
        return Class3332.method17090(n2, n3, class873, class68);
    }

    private Boolean method8409() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8410(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method8411() {
        Class5836.method22897();
    }

    private static void method8412(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method8413(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Override
    public String method1248() {
        if (SpeedMine.method8478(this) != null) {
            return (int)(this.field1918.field10393 * Class4181.field9751) + "%";
        }
        return super.method1248();
    }

    public static Class539 method8414() {
        return Class539.field2670;
    }

    private static void method8415(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method8416(SpeedMine class425) {
        return class425.field1927;
    }

    private static Object method8417(Class248 class248) {
        return class248.method507();
    }

    private static Object method8418(Class248 class248) {
        return class248.method507();
    }

    private static Class539 method8419() {
        return SpeedMine.method8450();
    }

    private static void method8420(long l2) {
        SpeedMine.field1875[2] = l2 ^ 0xBDC5E624BE389DD2L;
        SpeedMine.field1875[5] = l2 ^ 0xBDC5E624BE389DEEL;
        SpeedMine.field1875[9] = l2 ^ 0xBDC5E624BE389DD0L;
        SpeedMine.field1875[4] = l2 ^ 0xBDC5E624BE389DD8L;
        SpeedMine.field1875[7] = l2 ^ 0xBDC5E624BE389DD1L;
        SpeedMine.field1875[1] = l2 ^ 0xBDC5E624BE389DD3L;
        SpeedMine.field1875[6] = l2 ^ 0xBDC5E624BE389D2DL;
        SpeedMine.field1875[12] = l2 ^ 0xBDC5E624BE389CCAL;
        SpeedMine.field1875[8] = l2 ^ 0xBDC5E624BE389D82L;
        SpeedMine.field1875[3] = l2 ^ 0x423A19DB41C7622DL;
        SpeedMine.field1875[10] = l2 ^ 0xBDC5E624BE389DDAL;
        SpeedMine.field1875[11] = l2 ^ 0xBDC5E624BE389DAFL;
        SpeedMine.field1875[0] = l2 ^ 0xBDC5E624BE38BADDL;
    }

    public static Runnable method8421(SpeedMine class425) {
        return class425.field1902;
    }

    private Boolean method8422() {
        return (SpeedMine.method8384(this).method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static Class554 method8423() {
        return Class554.field2742;
    }

    private static void method8424() {
        Class1807.method15744();
    }

    public static class_638 method8425(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static void method8426(SpeedMine class425, boolean bl2) {
        class425.field1920 = bl2;
    }

    @Class1
    public void method8427(Class59 a2) {
        if (!((Boolean)this.field1925.method507()).booleanValue()) {
            return;
        }
        Class489 b2 = (Class489)((Object)this.field1923.method507());
        if (this.field1918 != null) {
            this.method8399(a2, b2, this.field1918);
        }
        if (this.field1893 != null) {
            if (this.field1893.field10394) {
                Class1745.method15538();
                return;
            }
            if (this.field1918 != null && this.field1918.field10395.equals((Object)this.field1893.field10395)) {
                return;
            }
            this.method8399(a2, b2, this.field1893);
        }
    }

    public void method8428() {
        if (this.method1265()) {
            if (this.field1902 != null && !SpeedMine.method8521(this)) {
                this.field1920 = (int)field1875[1];
                this.field1902.run();
                SpeedMine.method8313(this, (boolean)field1875[2]);
            }
            this.field1918 = null;
        }
    }

    private Boolean method8429() {
        if (this.field1917.method507() != SpeedMine.method8419()) {
            Class1503.method14420();
            return null;
        }
        return (boolean)field1875[1];
    }

    private static boolean method8430(class_2338 a2) {
        return SpeedMine.method8425(field290).method_22347(a2);
    }

    private static void method8431() {
        Class6009.method23561();
    }

    private Boolean method1269() {
        return (this.field1917.method507() == Class539.field2669 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean method8432() {
        int n2;
        int n3;
        if (System.currentTimeMillis() - SpeedMine.method8381(this) > field1875[12]) {
            n3 = (int)field1875[2];
            return n3 != 0;
        }
        if (this.field1896.method507() != SpeedMine.method8398()) {
            return Class5836.method22894();
        }
        int n4 = 64741;
        boolean bl2 = true;
        do {
            if (!bl2 || (bl2 = false) || !true) {
                n4 = n2 = 64740;
            }
            if (n2 != 64741) continue;
            n3 = (int)field1875[1];
            return n3 != 0;
        } while (n2 == 64742);
        return Class4196.method20801();
    }

    private static void method8433(SpeedMine class425, Runnable runnable) {
        SpeedMine.method8358(class425, runnable);
    }

    private static void method8434(float f2) {
        Class5836.method22907(f2);
    }

    private Boolean method8435() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static int method8436(int n2, int n3, Class242 class242, Class590 class590) {
        return Class3332.method17045(n2, n3, class242, class590);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method8437() {
        int n2;
        if (SpeedMine.method8464(this.field1917) == SpeedMine.method8342() && ((Boolean)SpeedMine.method8539(this).method507()).booleanValue()) {
            n2 = (int)field1875[1];
            return n2 != 0;
        }
        n2 = (int)field1875[2];
        return n2 != 0;
    }

    private static void method8438() {
        Class5659.method22184();
    }

    /*
     * Unable to fully structure code
     */
    private Boolean method8439() {
        block2: {
            block3: {
                if (this.field1917.method507() != Class539.field2670) break block3;
                v0 = 40524;
                ** GOTO lbl9
            }
            v0 = 40525;
            if (true) ** GOTO lbl9
            do {
                v0 = var1_1 = 40523;
lbl9:
                // 3 sources

                if (var1_1 == 40524) break block2;
            } while (var1_1 == 40525);
            while (true) {
                // Infinite loop
            }
        }
        return (boolean)SpeedMine.field1875[1];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method8440(Class63 a2) {
        int n2 = field1886.isEmpty() ? 3829 : 3830;
        block4: while (true) {
            switch (n2) {
                case 3830: {
                    n2 = 3828;
                    continue block4;
                }
                case 3829: {
                    return;
                }
            }
            break;
        }
        if (field1883.method12595((int)field1875[11])) {
            SpeedMine.method8518().clear();
            return;
        }
        field1886.removeIf(SpeedMine::method8430);
    }

    private static void method8441(Class5496 class5496, class_7204 class_72042) {
        class5496.method21353(class_72042);
    }

    public static class_2338 method8442(Class5512 class5512) {
        return class5512.field10395;
    }

    private static Class539 method8443() {
        return SpeedMine.method8563();
    }

    private Boolean method8444() {
        return (SpeedMine.method8383(this.field1917) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8445() {
        return (this.field1917.method507() == SpeedMine.method8469() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public SpeedMine() {
        super("SpeedMine", "Allows you to quickly mine blocks", Class556.field2754, (int)field1875[0]);
        this.field1917 = this.method450(new Class260("Mode", "Mode", Class539.field2670, Class539.values()));
        this.field1891 = this.method450(new Class252("Speed", "Multiplier for mining progress required", Float.valueOf(0.0f), Float.valueOf(0.99f), Float.valueOf(2.0f)));
        this.field1900 = this.method450(new Class253("NoDelay", "Allow you to mine without delay", (boolean)field1875[2], this::method1269));
        this.field1872 = this.method450(new Class253("NoReset", "Switch items during mining will not reset the progress", (boolean)field1875[2], this::method1278));
        this.field1928 = this.method450(new Class253("NoAbort", "Never cancel mining", (boolean)field1875[2], this::method8480));
        this.field1898 = this.method450(new Class252("Range", "Interact reach", (Number)0.0, (Number)5.0, (Number)6.0, this::method8348));
        this.field1909 = this.method450(new Class260("Swing", "Swing side for interact block", Class480.field2509, Class480.values(), this::method8360));
        this.field1899 = this.method450(new Class252("Priority", "Priority of your mining", (Number)((int)field1875[2]), (Number)((int)field1875[10]), (Number)((int)field1875[4]), this::method8555));
        this.field1919 = this.method450(new Class260("Selection", "How to use the blocks setting", Class588.field2870, Class588.values(), this::method8483));
        class_2248[] class_2248Array = new class_2248[(int)field1875[9]];
        class_2248Array[(int)SpeedMine.field1875[2]] = class_2246.field_10540;
        class_2248Array[(int)SpeedMine.field1875[1]] = class_2246.field_10443;
        this.field1913 = this.method450(new Class257("Whitelist", "Valid block whitelist", this::method8392, class_2248Array));
        class_2248[] class_2248Array2 = new class_2248[(int)field1875[1]];
        class_2248Array2[(int)SpeedMine.field1875[2]] = class_2246.field_10036;
        this.field1890 = this.method450(new Class257("Blacklist", "Valid block blacklist", this::method8422, class_2248Array2));
        this.field1903 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values(), this::method8386));
        this.field1906 = this.method450(new Class253("Hold", "Applicable to 1.21+ server", (boolean)field1875[2], this::method8550));
        this.field1897 = this.method450(new Class253("Manual", "Manual switch tool", (boolean)field1875[2], this::method8437));
        this.field1907 = this.method450(new Class252("HoldTicks", "The max number of ticks to hold a pickaxe for the packet mine", (Number)((int)field1875[2]), (Number)((int)field1875[9]), (Number)((int)field1875[5]), this::method8319));
        this.field1929 = this.method450(new Class253("InstantMine", "Vanilla exploit allows you to rebreak broken block", (boolean)field1875[2], this::method8445));
        this.field1874 = this.method450(new Class252("RetryTicks", "The max number of ticks to hold a pickaxe for the instant mine", (Number)((int)field1875[2]), (Number)((int)field1875[4]), (Number)((int)field1875[5]), this::method8409));
        this.field1882 = this.method450(new Class253("DoubleBreak", "Vanilla exploit allows you to have two mining progressions", (boolean)field1875[1], this::method8403));
        this.field1912 = this.method450(new Class252("MiningTicks", "The max number of ticks to hold a pickaxe for the packet mine", (Number)((int)field1875[2]), (Number)((int)field1875[4]), (Number)((int)field1875[5]), this::method8323));
        this.field1901 = this.method450(new Class253("AutoSwitch", "Allow extra mine auto switch", (boolean)field1875[1], this::method8370));
        this.field1910 = this.method450(new Class253("StartRotate", "Automatically faces towards the block when start mining", (boolean)field1875[1], this::method8406));
        this.field1877 = this.method450(new Class253("EndRotate", "Automatically faces towards the block when end mining", (boolean)field1875[2], this::method8373));
        this.field1878 = this.method450(new Class253("MineAir", "Allow mine air", (boolean)field1875[1], this::method8449));
        this.field1908 = this.method450(new Class253("CheckGround", "Does mining calculation detect on ground", (boolean)field1875[2], this::method8378));
        this.field1880 = this.method450(new Class253("CheckFly", "Does mining calculation detect flying", (boolean)field1875[1], this::method8549));
        this.field1896 = this.method450(new Class260("Grim", "Bypasses Grim's fastbreak check", Class554.field2744, SpeedMine.method8394(), this::method8355));
        this.field1884 = this.method450(new Class260("Desync", "Break block desync server", Class610.field2971, Class610.values(), this::method8439));
        this.field1888 = this.method450(new Class253("NoCollision", "Assume block has broken", (boolean)field1875[2], this::method8535));
        this.field1926 = this.method450(new Class253("IgnoreBroken", "When blocks broke will not become crosshairtarget", (boolean)field1875[2], this::method8337));
        this.field1873 = this.method450(new Class253("StrictCheck", "Prohibit sending packets during the pause period", (boolean)field1875[2], this::method8435));
        this.field1889 = this.method450(new Class253("OnlyOnGround", "Works only when you are standing on blocks", (boolean)field1875[2], this::method8458));
        this.field1904 = this.method450(new Class253("PauseOnFlying", "Pauses the current process while you are flying", (boolean)field1875[2], this::method8429));
        this.field1915 = this.method450(new Class253("PauseInFluid", "Pauses the current process while you are swimming", (boolean)field1875[2], this::method8444));
        this.field1895 = this.method450(new Class259("Pause", "Pause the mining", new Class246(this.method472() + "-pause", (int)field1875[3], SpeedMine::method8551), this::method8499));
        this.field1916 = this.method450(new Class259("Cancel", "Cancel mine", new Class246(this.method472() + "-cancel", (int)field1875[3], this::method8428), this::method8391));
        this.field1905 = this.method450(new Class259("EnderChest", "Place ender chest on mine", new Class246(this.method472() + "-enderchest", (int)field1875[3], SpeedMine::method8525), this::method8324));
        this.field1894 = this.method450(new Class252("PlaceRange", "Interact block reach", (Number)0.0, (Number)4.5, (Number)Class1685.field6247, this::method8532));
        this.field1892 = this.method450(new Class253("PlaceRotate", "Look at placement", (boolean)field1875[1], this::method8371));
        this.field1924 = this.method450(new Class260("PlaceSwap", "Decide which swap mode to use", Class607.field2953, Class607.values(), this::method8357));
        this.field1925 = this.method450(new Class253("Render", "Renders a block overlay where the block will be breaked", (boolean)field1875[1], this::method8554));
        this.field1927 = this.method450(new Class260("BoxMode", "Box rendering mode", Class570.field2792, Class570.values(), this::method8562));
        this.field1921 = this.method450(new Class251("StartSide", "The side color", new Color((int)field1875[6], (int)field1875[2], (int)field1875[2], (int)field1875[8]), (boolean)field1875[1], (boolean)field1875[2], this::method8454));
        this.field1885 = this.method450(new Class251("EndSide", "The side color", new Color((int)field1875[2], (int)field1875[6], (int)field1875[2], (int)field1875[8]), (boolean)field1875[1], (boolean)field1875[2], this::method8536));
        this.field1911 = this.method450(new Class251("StartLine", "The line color", new Color((int)field1875[6], (int)field1875[2], (int)field1875[2], (int)field1875[8]), (boolean)field1875[1], (boolean)field1875[2], this::method8558));
        this.field1881 = this.method450(new Class251("EndLine", "The line color", new Color((int)field1875[2], (int)field1875[6], (int)field1875[2], (int)field1875[8]), (boolean)field1875[1], (boolean)field1875[2], this::method8556));
        this.field1923 = this.method450(new Class260("Easing", "Which type of curve animation to implement", Class489.field2558, Class489.values(), this::method8352));
        this.field1914 = this.method450(new Class253("BlockOutline", "Draw the outline of the block", (boolean)field1875[1], this::method8479));
        this.field1879 = this.method450(new Class253("BoxAnimation", "Renders a block overlay with animation", (boolean)field1875[1], this::method8495));
        INSTANCE = this;
        Class246[] class246Array = new Class246[(int)field1875[7]];
        class246Array[(int)SpeedMine.field1875[2]] = (Class246)SpeedMine.method8368(this.field1895);
        class246Array[(int)SpeedMine.field1875[1]] = (Class246)this.field1916.method507();
        class246Array[(int)SpeedMine.field1875[9]] = (Class246)this.field1905.method507();
        Class5723.field11059.method24181(class246Array);
    }

    private static int method8446(int n2, int n3, Class30 class30, NoGlitch class391) {
        return Class3332.method17100(n2, n3, class30, class391);
    }

    private static void method8447() {
        Class3979.method19561();
    }

    private static void method8448(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private Boolean method8449() {
        return (SpeedMine.method8522(SpeedMine.method8385(this)) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static Class539 method8450() {
        return Class539.field2670;
    }

    static Class248 method8451(SpeedMine a2) {
        return a2.field1536;
    }

    public static Class5512 method8452(SpeedMine class425) {
        return class425.field1918;
    }

    private static void method8453(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method8454() {
        int n2;
        int n3 = this.field1917.method507() == Class539.field2670 ? 26220 : 26221;
        block4: while (true) {
            switch (n3) {
                case 26221: {
                    n3 = 26219;
                    continue block4;
                }
                case 26220: {
                    if (!((Boolean)this.field1925.method507()).booleanValue()) break block4;
                    n2 = (int)field1875[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1875[2];
        return n2 != 0;
    }

    private static int method8455(int n2, int n3, Class5984 class5984, Class268 class268) {
        return Class3332.method17030(n2, n3, class5984, class268);
    }

    private static boolean method8456(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static Class539 method8457() {
        return SpeedMine.method8347();
    }

    private Boolean method8458() {
        return (SpeedMine.method8511(this).method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static Object method8459(Class248 class248) {
        return class248.method507();
    }

    public class_2338 method8460() {
        if (this.field1918 != null) {
            return this.field1918.field10395;
        }
        return null;
    }

    private static boolean method8461() {
        return Replenish.method6431();
    }

    private static void method8462() {
        Chams.method1924();
    }

    private static void method8463() {
        Class5836.method22890();
    }

    private static Object method8464(Class248 class248) {
        return class248.method507();
    }

    private static void method8465() {
        Class6009.method23560();
    }

    private static void method8466() {
        Class4146.method20694();
    }

    private static void method8467() {
        Class6009.method23560();
    }

    private static boolean method8468(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public static Class539 method8469() {
        return Class539.field2670;
    }

    @Class1
    private void method8470(Class131 b2) {
        class_2846 a2;
        if (this.field1896.method507() != SpeedMine.method8423() || this.field1917.method507() != Class539.field2669) {
            return;
        }
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2846 && (a2 = (class_2846)class_25962).method_12363() == SpeedMine.method8484()) {
            Class5723.field11048.method21353(arg_0 -> SpeedMine.method8344(a2, arg_0));
        }
    }

    private static Object method8471(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method8472(SpeedMine class425) {
        return class425.field1896;
    }

    public static class_746 method8473(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8474(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static class_1799 method8475(Class3850 class3850) {
        return class3850.method18908();
    }

    private static void method8476() {
        Class4146.method20697();
    }

    private static int method8477(int n2, int n3, Class694 class694, Class13 class13) {
        return Class3332.method17069(n2, n3, class694, class13);
    }

    public static Class5512 method8478(SpeedMine class425) {
        return class425.field1918;
    }

    private Boolean method8479() {
        return (this.field1917.method507() == Class539.field2670 && ((Boolean)this.field1925.method507()).booleanValue() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8480() {
        return (SpeedMine.method8560(this).method507() == Class539.field2669 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static void method8481() {
        Class5836.method22890();
    }

    private static Object method8482(Class248 class248) {
        return class248.method507();
    }

    private Boolean method8483() {
        return (SpeedMine.method8531(this).method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static class_2846.class_2847 method8484() {
        return class_2846.class_2847.field_12968;
    }

    private static Object method8485(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method8486(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method8487(Class248 class248) {
        return class248.method507();
    }

    public static Class588 method8488() {
        return Class588.field2872;
    }

    private static int method8489(int n2, int n3, Class553 class553, FastPlace class386) {
        return Class3332.method17031(n2, n3, class553, class386);
    }

    private static Class539 method8490() {
        return SpeedMine.method8414();
    }

    private static void method8491() {
        Class1745.method15538();
    }

    private static void method8492() {
        Class6454.method24594();
    }

    public static Runnable method8493(SpeedMine class425) {
        return class425.field1902;
    }

    public static Class248 method8494(SpeedMine class425) {
        return class425.field1881;
    }

    private Boolean method8495() {
        return (SpeedMine.method8349(this).method507() == Class539.field2670 && ((Boolean)this.field1925.method507()).booleanValue() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static Class248 method8496(SpeedMine class425) {
        return SpeedMine.method8557(class425);
    }

    public static Class248 method8497(SpeedMine class425) {
        return class425.field1879;
    }

    public static class_2338 method8498(Class5512 class5512) {
        return class5512.field10395;
    }

    private Boolean method8499() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public boolean method8500() {
        return (this.field1902 != null ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static boolean method8501() {
        return Class3979.method19539();
    }

    private static Class5512 method8502(SpeedMine class425) {
        return SpeedMine.method8452(class425);
    }

    private static void method8503(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method8504(Class248 class248) {
        return class248.method507();
    }

    private static Class539 method8505() {
        return SpeedMine.method8530();
    }

    public static class_746 method8506(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class539 method8507() {
        return Class539.field2670;
    }

    public boolean method8508() {
        return (Boolean)this.field1888.method507();
    }

    public boolean method8509() {
        if (this.method1265()) {
            if (((Boolean)this.field1926.method507()).booleanValue()) {
                int n2 = (int)field1875[1];
                return SpeedMine.method8523(0.8810246614039517, 0.0846154903757188);
            }
        }
        return (int)field1875[2] != 0;
    }

    private static void method8510() {
        Chams.method1924();
    }

    private static Class248 method8511(SpeedMine class425) {
        return SpeedMine.method8526(class425);
    }

    private static void method8512() {
        Class1807.method15744();
    }

    public static Class248 method8513(SpeedMine class425) {
        return class425.field1925;
    }

    @Class1
    public void method8514(Class196 a2) {
        if (((Boolean)SpeedMine.method8354(this.field1928)).booleanValue() && !SpeedMine.method8547(SpeedMine.field290.field_1690).method_1434() && this.field1917.method507() == Class539.field2669) {
            a2.method10();
        }
    }

    private static void method8515() {
        Class1807.method15744();
    }

    private static void method8516() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method8517(class_2338 b2, int c2) {
        if (Class5595.method21942(b2)) {
            return (int)field1875[2] != 0;
        }
        if (!SpeedMine.method8367(this, SpeedMine.method8486(field290).method_8320(b2).method_26204())) {
            return (int)field1875[2] != 0;
        }
        if (this.field1917.method507() != Class539.field2670 || !this.method1265()) {
            class_2350 a2 = SpeedMine.method8548(b2);
            SpeedMine.method8372(field290).method_2910(b2, a2 == null ? class_2350.field_11036 : a2);
            if (SpeedMine.method8472(this).method507() == SpeedMine.method8341()) {
                SpeedMine.method8441(Class5723.field11048, arg_0 -> SpeedMine.method8334(b2, a2, arg_0));
            }
            Class5723.field11048.method21353(arg_0 -> SpeedMine.method8527(b2, a2, arg_0));
            return (int)field1875[1] != 0;
        }
        if (SpeedMine.method8502(this) != null && this.field1918.field10395.equals((Object)b2)) {
            return (int)field1875[1] != 0;
        }
        if (this.field1918 != null && (this.field1918.field10395.equals((Object)b2) || !this.field1918.field10394 && this.field1918.field10392 > c2)) {
            if (!(SpeedMine.field290.field_1724.method_33571().method_1022(Class1745.method15658(this.field1918.field10395, Class1745.method15618(this.field1918.field10395))) > (Double)this.field1898.method507())) return Class5659.method22229(0.360287439593865, 0.3302245623401594, 0.7397458860076591, 0.5699646573707813);
        }
        if (SpeedMine.method8421(this) != null) {
            int n2 = this.field1922 ? 18796 : 18795;
            block4: while (true) {
                switch (n2) {
                    case 18796: {
                        n2 = 18794;
                        continue block4;
                    }
                    case 18795: {
                        SpeedMine.method8426(this, (boolean)field1875[1]);
                        this.field1902.run();
                        this.field1920 = (int)field1875[2];
                        break block4;
                    }
                }
                break;
            }
        }
        this.field1918 = new Class5512(this, b2, c2, ((Float)SpeedMine.method8350(this.field1891)).floatValue());
        if (this.field1893 == null) {
            this.field1918.method21679();
            if (this.field1893 == null) return (int)field1875[1] != 0;
            this.field1893.method21675();
            if (!this.field1893.method21577()) return (int)field1875[1] != 0;
            this.field1893 = null;
            if (!SpeedMine.method8543(this)) return (int)field1875[1] != 0;
            if (this.field1902 == null) return (int)field1875[1] != 0;
            this.field1920 = (int)field1875[1];
            this.field1902.run();
            this.field1920 = (int)field1875[2];
            return (int)field1875[1] != 0;
        }
        this.field1918.method21679();
        return (int)field1875[1] != 0;
    }

    public static List method8518() {
        return field1886;
    }

    public static Class248 method8519(SpeedMine class425) {
        return class425.field1881;
    }

    private static boolean method8520() {
        return Class5836.method22894();
    }

    public static boolean method8521(SpeedMine class425) {
        return class425.field1922;
    }

    private static Object method8522(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8523(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static int method8524(int n2, int n3, Class241 class241, Class125 class125) {
        return Class3332.method17097(n2, n3, class241, class125);
    }

    private static native void method8525();

    public static Class248 method8526(SpeedMine class425) {
        return class425.field1917;
    }

    private static class_2596 method8527(class_2338 a2, class_2350 b2, int c2) {
        return new class_2846(class_2846.class_2847.field_12968, a2, b2, c2);
    }

    private static Object method8528(Class248 class248) {
        return class248.method507();
    }

    private static void method8529() {
        Class6009.method23561();
    }

    public static Class539 method8530() {
        return Class539.field2670;
    }

    public static Class248 method8531(SpeedMine class425) {
        return class425.field1917;
    }

    private Boolean method8532() {
        return (SpeedMine.method8401(this).method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static Class248 method8533(SpeedMine class425) {
        return class425.field1882;
    }

    public static boolean method8534(SpeedMine class425) {
        return class425.field1922;
    }

    private Boolean method8535() {
        return (SpeedMine.method8528(this.field1917) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8536() {
        return (this.field1917.method507() == Class539.field2670 && (Boolean)SpeedMine.method8513(this).method507() != false ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public boolean method8537(class_2338 a2, int b2) {
        if (this.field1893 != null && ((Boolean)SpeedMine.method8533(this).method507()).booleanValue()) {
            if (this.field1893.field10395.equals((Object)a2)) {
                return (int)field1875[2] != 0;
            }
        }
        return this.method8517(a2, b2);
    }

    public static Class248 method8538(SpeedMine class425) {
        return class425.field1917;
    }

    public static Class248 method8539(SpeedMine class425) {
        return class425.field1906;
    }

    private static void method8540() {
        Class5659.method22184();
    }

    public static Class248 method8541(SpeedMine class425) {
        return class425.field1917;
    }

    public static Class539 method8542() {
        return Class539.field2670;
    }

    public static boolean method8543(SpeedMine class425) {
        return class425.field1922;
    }

    private static void method8544() {
        Class5659.method22184();
    }

    @Class1
    public void method8545(Class18 a2) {
        if (this.field1917.method507() != Class539.field2670) {
            return;
        }
        this.method8517(SpeedMine.method8405(a2), (Integer)SpeedMine.method8382(this.field1899));
        a2.method10();
    }

    private static boolean method8546(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    public static class_304 method8547(class_315 class_3152) {
        return class_3152.field_1904;
    }

    private static class_2350 method8548(class_2338 class_23382) {
        return Class1745.method15618(class_23382);
    }

    private Boolean method8549() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8550() {
        return (this.field1917.method507() == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private static native void method8551();

    private static void method8552(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method8553() {
        Chams.method1924();
    }

    private Boolean method8554() {
        return (SpeedMine.method8459(this.field1917) == Class539.field2670 ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    private Boolean method8555() {
        return (this.field1917.method507() == SpeedMine.method8542() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method8556() {
        int n2;
        int n3 = SpeedMine.method8345(this.field1917) != Class539.field2670 ? 4969 : 4968;
        block4: while (true) {
            switch (n3) {
                case 4969: {
                    n3 = 4967;
                    continue block4;
                }
                case 4968: {
                    if (!((Boolean)this.field1925.method507()).booleanValue()) break block4;
                    n2 = (int)field1875[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field1875[2];
        return n2 != 0;
    }

    public static Class248 method8557(SpeedMine class425) {
        return class425.field1917;
    }

    private Boolean method8558() {
        int n2;
        if (this.field1917.method507() == Class539.field2670) {
            if (!((Boolean)this.field1925.method507()).booleanValue()) {
                Class5836.method22890();
                return null;
            }
            n2 = (int)field1875[1];
        } else {
            n2 = (int)field1875[2];
        }
        return n2 != 0;
    }

    private static void method8559() {
        Class4146.method20697();
    }

    public static Class248 method8560(SpeedMine class425) {
        return class425.field1917;
    }

    private static int method8561(int n2, int n3, Class6322 class6322, Follower class423) {
        return Class3332.method17134(n2, n3, class6322, class423);
    }

    private Boolean method8562() {
        return (SpeedMine.method8322(this.field1917) == Class539.field2670 && ((Boolean)this.field1925.method507()).booleanValue() ? (int)field1875[1] : (int)field1875[2]) != 0;
    }

    public static Class539 method8563() {
        return Class539.field2670;
    }

    private static native Object 1(char var0);
}

