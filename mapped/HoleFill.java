/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.network.ClientPlayerEntity
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mapped.Class1;
import mapped.Class1086;
import mapped.Class1108;
import mapped.Class1440;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1678;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class229;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class265;
import mapped.Chams;
import mapped.Class3393;
import mapped.Class34;
import mapped.Class3466;
import mapped.Class3516;
import mapped.Blink;
import mapped.Class3905;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4213;
import mapped.Class428;
import mapped.Class4383;
import mapped.Velocity;
import mapped.Colors;
import mapped.Class4971;
import mapped.Class537;
import mapped.Class5494;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6098;
import mapped.Class611;
import mapped.Class6259;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6330;
import mapped.Class6454;
import mapped.Class95;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.ClientPlayerEntity;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

public class HoleFill
extends Class428 {
    Class248 field1958;
    private final Map field1959 = new HashMap();
    Class248 field1960 = this.method450(new Class253("Obsidian", "Fills obsidian holes", (boolean)field1974[0]));
    Class248 field1961 = this.method450(new Class253("Doubles", "Fills double holes", (boolean)field1974[1]));
    Class248 field1962;
    private List field1963;
    Class248 field1954;
    Class248 field1964;
    Class248 field1965;
    Class248 field1966 = this.method450(new Class252("PlaceRange", "The range to fill nearby holes", Float.valueOf(0.1f), Float.valueOf(4.0f), Float.valueOf(Class3516.field7758)));
    Class248 field1967;
    Class248 field1968 = this.method450(new Class253("Webs", "Fills holes with webs", (boolean)field1974[1]));
    private static HoleFill INSTANCE;
    Class248 field1969;
    Class248 field1970 = this.method450(new Class253("Auto", "Fills holes when enemies are within a certain range", (boolean)field1974[1]));
    private int field1971;
    Class248 field1972;
    Class248 field1973;
    private static long[] field1974;
    public static boolean $skidonion$890408773;

    private void method8607(class_2338 a2, int b2) {
        Class5723.field11051.method12784(a2, b2, (Boolean)this.field1952.method507(), (boolean)field1974[1], this::method8633);
    }

    private static boolean method8608(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method8609(long l2) {
        HoleFill.field1974[3] = l2 ^ 0x31D197FB11B407CAL;
        HoleFill.field1974[5] = l2 ^ 0x31D197FB11B40427L;
        HoleFill.field1974[2] = l2 ^ 0x31D197FB11B40735L;
        HoleFill.field1974[6] = l2 ^ 0xCE2E6804EE4BF830L;
        HoleFill.field1974[4] = l2 ^ 0x31D197FB11B407CDL;
        HoleFill.field1974[0] = l2 ^ 0x31D197FB11B407CEL;
        HoleFill.field1974[1] = l2 ^ 0x31D197FB11B407CFL;
    }

    private static void method8610(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method8611() {
        return Class1807.method15769();
    }

    private static void method8612(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static double method8613(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method8614() {
        Chams.method1924();
    }

    private static Object method8615(Class248 class248) {
        return class248.method507();
    }

    private static native boolean method8616(class_1297 var0);

    private static class_4587 method8617(Class59 class59) {
        return class59.method125();
    }

    private static int method8618(int n2, int n3, Class6098 class6098, Class611 class611) {
        return Class1440.method14243(n2, n3, class6098, class611);
    }

    public static class_746 method8619(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8620(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method8621() {
        return Class5836.method22894();
    }

    private static void method8622() {
        Class1807.method15744();
    }

    private static void method8623() {
        Class1807.method15744();
    }

    private static void method8624() {
        Class1503.method14420();
    }

    private static boolean method8625(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method8626(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    private static void method8627() {
        Class1807.method15744();
    }

    private static boolean method8628(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method8629(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Class248 method8630(HoleFill class429) {
        return HoleFill.method8642(class429);
    }

    private static void method8631(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method8632(Class6259 class6259) {
        return class6259.method24212();
    }

    private void method8633(boolean a2, float[] b2) {
        if (!((Boolean)this.field1954.method507()).booleanValue()) {
            Class5836.method22885();
            return;
        }
        if (a2) {
            HoleFill.method8612(b2[(int)field1974[1]], b2[(int)field1974[0]]);
        } else {
            Class1503.method14420();
        }
    }

    private static void method8634(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method8635() {
        Class5836.method22897();
    }

    static {
        ___.___(24, HoleFill.class);
        ____.___24_400(HoleFill.class);
    }

    private static void method8636() {
        Class5836.method22897();
    }

    private static Object method8637(Class248 class248) {
        return class248.method507();
    }

    private Boolean method1278() {
        return (Boolean)this.field1970.method507();
    }

    private static class_2338 method8638(Class6259 class6259) {
        return class6259.method24238();
    }

    private static void method8639() {
        Class5836.method22890();
    }

    private static Set method8640(Class4971 class4971) {
        return class4971.method20969();
    }

    public static class_2248 method8641() {
        return class_2246.field_10343;
    }

    public static Class248 method8642(HoleFill class429) {
        return class429.field1969;
    }

    private static Object method8643(Class248 class248) {
        return class248.method507();
    }

    private static void method8644() {
        Class6454.method24594();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method8645(Class210 e) {
        block32: {
            block26: {
                f = (int)HoleFill.field1974[1];
                if (Blink.method4987()) {
                    this.field1963.clear();
                    return;
                }
                if (!((Boolean)HoleFill.method8673(this.field1536)).booleanValue() && this.method6626()) {
                    this.field1963.clear();
                    return;
                }
                if (!((Boolean)HoleFill.method8643(HoleFill.method8653(this))).booleanValue()) break block26;
                v0 = 39572;
                ** GOTO lbl16
            }
            v0 = 39573;
            if (true) ** GOTO lbl16
            block8: while (true) {
                v0 = 39571;
lbl16:
                // 3 sources

                switch (v0) {
                    case 39573: {
                        continue block8;
                    }
                    case 39572: {
                        v1 = this.method8592(HoleFill.method8641());
                        break block8;
                    }
                    default: {
                        v1 = g = this.method8599();
                    }
                }
                break;
            }
            if (g == (int)HoleFill.field1974[6]) {
                this.field1963.clear();
                return;
            }
            if ((Integer)this.field1972.method507() > 0 && this.field1971 < (Integer)HoleFill.method8615(this.field1972)) {
                this.field1971 += (int)HoleFill.field1974[0];
                return;
            }
            h = new ArrayList<class_2338>();
            var5_5 = HoleFill.method8640(Class5723.field11042).iterator();
            block9: while (true) {
                block30: {
                    block25: {
                        block29: {
                            block24: {
                                block28: {
                                    block27: {
                                        if (!var5_5.hasNext()) break block27;
                                        v2 = 45491;
                                        ** GOTO lbl41
                                    }
                                    v2 = 45492;
                                    if (true) ** GOTO lbl41
                                    while (true) {
                                        v2 = var6_6 = 45490;
lbl41:
                                        // 3 sources

                                        if (var6_6 == 45491) break;
                                        if (var6_6 != 45492) break block9;
                                    }
                                    c = (Class6259)var5_5.next();
                                    if (c.method24233()) continue;
                                    if (!HoleFill.method8632(c)) break block28;
                                    v3 = 17493;
                                    ** GOTO lbl54
                                }
                                v3 = 17494;
                                if (true) ** GOTO lbl54
                                do {
                                    v3 = var8_8 = 17492;
lbl54:
                                    // 3 sources

                                    if (var8_8 == 17493) break block24;
                                } while (var8_8 == 17494);
                                break block29;
                            }
                            if (!((Boolean)this.field1961.method507()).booleanValue()) continue;
                        }
                        if (c.method24222() == Class537.field2659 && !((Boolean)this.field1960.method507()).booleanValue() || c.method24223((class_1297)HoleFill.field290.field_1724) > ((Class252)this.field1966).method564()) continue;
                        if (!HoleFill.field290.field_1687.method_8628(HoleFill.field1956, HoleFill.method8638(c), class_3726.method_16194())) {
                            Class6322.method24332(Class4213.field9862, 0.85810715f);
                            return;
                        }
                        if (!((Boolean)HoleFill.method8678(this.field1970)).booleanValue()) break block30;
                        var9_9 = HoleFill.field290.field_1687.method_18456().iterator();
lbl66:
                        // 2 sources

                        while (true) {
                            block31: {
                                if (!var9_9.hasNext()) continue block9;
                                b = (class_1657)var9_9.next();
                                if (b == HoleFill.field290.field_1724) continue;
                                if (Class5723.field11045.method21243(b.method_5477()) || (a = (double)HoleFill.field290.field_1724.method_5739((class_1297)b)) > (double)((Float)this.field1973.method507()).floatValue()) continue;
                                if (!(b.method_23318() >= c.method_10214())) break block25;
                                if (!(HoleFill.method8648(c, (class_1297)b) > ((Class252)HoleFill.method8630(this)).method564())) break block31;
                                v4 = 23797;
                                ** GOTO lbl80
                            }
                            v4 = 23798;
                            if (true) ** GOTO lbl80
                            break;
                        }
                        do {
                            v4 = 23796;
lbl80:
                            // 3 sources

                            if ((var13_12 = v4) != 23797) ** break;
                            ** continue;
                        } while (var13_12 == 23798);
                    }
                    h.add(c.method24238());
                    continue;
                }
                h.add(c.method24238());
            }
            this.field1963 = h;
            if (this.field1963.isEmpty()) {
                if (((Boolean)HoleFill.method8650(this.field1964)).booleanValue()) {
                    this.method1268();
                }
                return;
            }
            if (!((Boolean)this.field1958.method507()).booleanValue()) break block32;
            v5 = 62096;
            ** GOTO lbl104
        }
        v5 = 62097;
        if (true) ** GOTO lbl104
        block14: while (true) {
            v5 = 62095;
lbl104:
            // 3 sources

            switch (v5) {
                case 62097: {
                    continue block14;
                }
                case 62096: {
                    this.method8667(this.field1963);
                }
            }
            break;
        }
        while (f < (Integer)this.field1965.method507() && f < this.field1963.size()) {
            d = (class_2338)this.field1963.get(f);
            ++f;
            this.field1971 = (int)HoleFill.field1974[1];
            this.method8607(d, g);
        }
        if (((Boolean)HoleFill.method8637(this.field1954)).booleanValue()) {
            v6 = 23218;
            Class5659.method22184();
            return;
        }
        v7 = 23219;
        Class6454.method24636(0.05192523577911745, Class6330.field13029, 0.36144962596446006, Class3393.field7377);
    }

    private static int method8646(int n2, int n3, Class3466 class3466, Class265 class265) {
        return Class1440.method14211(n2, n3, class3466, class265);
    }

    private static Object method8647(Class248 class248) {
        return class248.method507();
    }

    private static double method8648(Class6259 class6259, class_1297 class_12972) {
        return class6259.method24223(class_12972);
    }

    @Class1
    public void method8649(Class59 h2) {
        if (((Boolean)HoleFill.method8647(this.field1967)).booleanValue()) {
            Class6009.method23560();
            for (Map.Entry e2 : this.field1959.entrySet()) {
                HoleFill.method8626((Class6283)e2.getValue(), (boolean)field1974[1]);
                int a2 = (int)(40.0 * HoleFill.method8613((Class6283)e2.getValue()));
                int b2 = (int)(Class4383.field10001 * ((Class6283)e2.getValue()).method24281());
                Color c2 = Colors.method10620().method10618(a2);
                Color d2 = Colors.method10620().method10618(b2);
                Class6454.method24734(HoleFill.method8617(h2), (class_2338)e2.getKey(), c2.getRGB());
                Class6454.method24642(h2.method125(), (class_2338)e2.getKey(), 1.5f, d2.getRGB());
            }
            Class6009.method23561();
            if (this.field1963.isEmpty()) {
                return;
            }
            for (class_2338 g2 : this.field1963) {
                Class6283 f2 = new Class6283((boolean)field1974[0], ((Integer)this.field1962.method507()).intValue());
                this.field1959.put(g2, f2);
            }
        }
        this.field1959.entrySet().removeIf(HoleFill::method8664);
    }

    private static Object method8650(Class248 class248) {
        return class248.method507();
    }

    private static void method8651(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method8652(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method8653(HoleFill class429) {
        return class429.field1968;
    }

    private static int method8654(int n2, int n3, Class34 class34, Class95 class95) {
        return Class1440.method14238(n2, n3, class34, class95);
    }

    private static boolean method8655() {
        return Class3979.method19539();
    }

    public static HoleFill method8656() {
        return INSTANCE;
    }

    public static HoleFill method8657() {
        return HoleFill.method8656();
    }

    private static void method8658() {
        Class5836.method22885();
    }

    private static void method8659(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8660() {
        Class1745.method15538();
    }

    private static void method8661(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private Boolean method1269() {
        return (Boolean)this.field1970.method507();
    }

    @Class1
    public void method8662(Class229 a2) {
        this.method1268();
    }

    private static void method8663() {
        Class4146.method20694();
    }

    private static boolean method8664(Map.Entry a2) {
        if (HoleFill.method8676((Class6283)a2.getValue()) == 0.0) {
            int n2 = (int)field1974[0];
            while (true) {
                // Infinite loop
            }
        }
        return (int)field1974[1] != 0;
    }

    private static boolean method8665() {
        return Velocity.method10252();
    }

    private static void method8666(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    @Override
    public void method1279() {
        this.field1959.clear();
        this.field1963.clear();
    }

    public void method8667(List c2) {
        Iterator iterator = c2.iterator();
        if (iterator.hasNext()) {
            class_2338 b2 = (class_2338)iterator.next();
            class_1297 a2 = HoleFill.field290.field_1687.method_8335(null, new class_238(b2)).stream().filter(HoleFill::method8616).findFirst().orElse(null);
            if (a2 == null) {
                Class6454.method24636(Class1086.field4410, 0.35856919577897084, 0.7659105459729633, 0.6778530231248059);
                return;
            }
            HoleFill.method8671(Class5723.field11048, (class_2596)class_2824.method_34206((class_1297)a2, (boolean)HoleFill.method8619(field290).method_5715()));
            Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
            return;
        }
    }

    private static void method8668() {
        Class1503.method14420();
    }

    private static void method8669() {
        Chams.method1924();
    }

    private static void method8670() {
        Class5836.method22897();
    }

    private static void method8671(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public boolean method8672() {
        return (!this.field1963.isEmpty() ? (int)field1974[0] : (int)field1974[1]) != 0;
    }

    public HoleFill() {
        super("HoleFill", "Fills in nearby holes with blocks", Class556.field2758);
        this.field1969 = this.method450(new Class252("TargetRange", "The range from the target to the hole", (Number)Float.valueOf(Class1678.field6218), (Number)Float.valueOf(3.0f), (Number)Float.valueOf(Class3905.field8893), this::method1269));
        this.field1973 = this.method450(new Class252("EnemyRange", "The maximum range of targets", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), (Number)Float.valueOf(Class5494.field10313), this::method1278));
        this.field1958 = this.method450(new Class253("Attack", "Attacks crystals in the way of hole fill", (boolean)field1974[0]));
        this.field1954 = this.method450(new Class253("Rotate", "Rotates to block before placing", (boolean)field1974[1]));
        this.field1965 = this.method450(new Class252("ShiftTicks", "The number of blocks to place per tick", (int)field1974[0], (int)field1974[4], (int)field1974[3]));
        this.field1972 = this.method450(new Class252("ShiftDelay", "The delay between each block placement interval", (int)field1974[1], (int)field1974[0], (int)field1974[3]));
        this.field1964 = this.method450(new Class253("AutoDisable", "Disables after filling all holes", (boolean)field1974[1]));
        this.field1967 = this.method450(new Class253("Render", "Renders where blocks are being filled", (boolean)field1974[1]));
        this.field1962 = this.method450(new Class252("Fade-Time", "Time to fade", (int)field1974[1], (int)field1974[2], (int)field1974[5]));
        this.field1963 = new ArrayList();
        INSTANCE = this;
    }

    private static Object method8673(Class248 class248) {
        return class248.method507();
    }

    private static boolean method8674(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method8675(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static double method8676(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method8677() {
        Class6009.method23560();
    }

    private static Object method8678(Class248 class248) {
        return class248.method507();
    }

    private static native Object I(char var0);
}

