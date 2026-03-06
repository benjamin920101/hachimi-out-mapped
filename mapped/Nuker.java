/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffectUtil
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import mapped.Class1;
import mapped.Class1011;
import mapped.Class1017;
import mapped.Class1108;
import mapped.Class1254;
import mapped.Class1308;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1621;
import mapped.Class1668;
import mapped.Class169;
import mapped.Class1693;
import mapped.Class1745;
import mapped.Class1764;
import mapped.Class18;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class268;
import mapped.NoRotate;
import mapped.Ambience;
import mapped.Chams;
import mapped.Swing;
import mapped.AntiCrawl;
import mapped.Class3448;
import mapped.AutoTool;
import mapped.SafeWalk;
import mapped.Blink;
import mapped.Class3835;
import mapped.Class3850;
import mapped.Class3915;
import mapped.Class3932;
import mapped.Class3979;
import mapped.Class4022;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class44;
import mapped.Colors;
import mapped.Class529;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5637;
import mapped.Class5659;
import mapped.Class5670;
import mapped.Class5687;
import mapped.Class5723;
import mapped.Class583;
import mapped.Class5836;
import mapped.Class589;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class601;
import mapped.Class6023;
import mapped.Class6094;
import mapped.Class6175;
import mapped.Class624;
import mapped.Class628;
import mapped.Class6283;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6403;
import mapped.Class6454;
import mapped.Class656;
import mapped.Class703;
import mapped.Class706;
import mapped.Class752;
import mapped.Class896;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Nuker
extends Class414 {
    Class248 field1761;
    private Class1017 field1762;
    private boolean field1763;
    Class248 field1764;
    Class248 field1765;
    private boolean field1766;
    Class248 field1767;
    Class248 field1768;
    private Class656 field1769;
    Class248 field1770;
    Class248 field1771;
    private final Queue field1772;
    Class248 field1773;
    Class248 field1774;
    Class248 field1775;
    Class248 field1776;
    private boolean field1777;
    private static long[] field1778 = new long[13];
    Class248 field1779;
    Class248 field1780;
    Class248 field1781;
    Class248 field1782;
    Class248 field1783;
    Class248 field1784;
    private Class656 field1785;
    Class248 field1786;
    private Class1017 field1787;
    Class248 field1788;
    Class248 field1789;
    Class248 field1790;
    private final Queue field1791 = new LinkedList();
    private int field1792;

    private static double method7715(Class6283 class6283) {
        return class6283.method24281();
    }

    private static int method7716(int n2, int n3, Ambience class290, Class752 class752) {
        return Class1254.method13523(n2, n3, class290, class752);
    }

    public static Queue method7717(Nuker class420) {
        return class420.field1791;
    }

    private Boolean method7718() {
        return (Nuker.method7829(this).method507() != Class601.field2921 ? (int)field1778[0] : (int)field1778[1]) != 0;
    }

    private static boolean method7719(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method7720(Class3850 class3850, int n2) {
        class3850.method18871(n2);
    }

    private static Object method7721(Class248 class248) {
        return class248.method507();
    }

    public static class_2846.class_2847 method7722() {
        return class_2846.class_2847.field_12968;
    }

    private static void method7723() {
        Class1807.method15744();
    }

    private boolean method7724(class_2248 a2) {
        int n2;
        if (Class5595.method21937(a2)) {
            return (int)field1778[1] != 0;
        }
        int n3 = ((Class583)((Object)this.field1783.method507())).ordinal() ^ 0x1B8F2176;
        if (n3 != 462365044) {
            if (n3 == 462365046) {
                n2 = ((Class257)this.field1774).method600(a2) ? 1 : 0;
            } else {
                if (n3 != 462365047) {
                    throw new MatchException(null, null);
                }
                n2 = !((Class257)this.field1765).method600(a2) ? (int)field1778[0] : (int)field1778[1];
            }
        } else {
            n2 = (int)field1778[0];
        }
        return n2 != 0;
    }

    private static void method7725() {
        Chams.method1924();
    }

    public static class_2846.class_2847 method7726() {
        return class_2846.class_2847.field_12973;
    }

    private static void method7727(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method7728(Class3850 class3850, int n2) {
        class3850.method18887(n2);
    }

    public static class_2846.class_2847 method7729() {
        return class_2846.class_2847.field_12973;
    }

    private static void method7730() {
        Class1745.method15538();
    }

    private static void method7731() {
        Class5659.method22184();
    }

    private static Class1017 method7732(Nuker class420) {
        return Nuker.method7929(class420);
    }

    private static void method7733(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method7734() {
        Class6009.method23561();
    }

    private static void method7735(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    @Override
    public void method1279() {
        this.field1772.clear();
        this.field1762 = null;
        if (this.field1787 != null) {
            this.method7823(this.field1787);
            this.field1787 = null;
        }
        Nuker.method7895(this, new Class656(Class1017.method12839(), new Class6283((boolean)field1778[0], 200.0f)));
        this.field1785 = new Class656(Class1017.method12839(), new Class6283((boolean)field1778[0], 200.0f));
        this.field1792 = (int)field1778[1];
        this.field1766 = (int)field1778[1];
        if (this.field1777) {
            Nuker.method7816().method18916();
            this.field1777 = (int)field1778[1];
        }
    }

    public static Class248 method7736(Nuker class420) {
        return class420.field1775;
    }

    private static void method7737(long l2) {
        Nuker.field1778[7] = l2 ^ 0x2ACE2872BAB7CCB4L;
        Nuker.field1778[12] = l2 ^ 0xD531D78D45483331L;
        Nuker.field1778[10] = l2 ^ 0x2ACE2872BAB7CCD5L;
        Nuker.field1778[2] = l2 ^ 0x2ACE2872BAB7CCA5L;
        Nuker.field1778[9] = l2 ^ 0x2ACE2872BAB7CCAFL;
        Nuker.field1778[8] = l2 ^ 0xD531D78D4548334EL;
        Nuker.field1778[3] = l2 ^ 0x2ACE2872BAB7CF59L;
        Nuker.field1778[6] = l2 ^ 0x2ACE2872BAB7CC8DL;
        Nuker.field1778[4] = l2 ^ 0x2ACE2872BAB7CC4BL;
        Nuker.field1778[0] = l2 ^ 0x2ACE2872BAB7CCB0L;
        Nuker.field1778[1] = l2 ^ 0x2ACE2872BAB7CCB1L;
        Nuker.field1778[5] = l2 ^ 0x2ACE2872BAB7CCB3L;
        Nuker.field1778[11] = l2 ^ 0x2ACE2872BAB7CC11L;
    }

    public static Class1017 method7738(Nuker class420) {
        return class420.field1787;
    }

    private static boolean method7739(Nuker class420, class_2680 class_26802) {
        return class420.method7921(class_26802);
    }

    private static void method7740() {
        Class1503.method14420();
    }

    private static void method7741() {
        Chams.method1924();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method7742(class_2338 a2) {
        int n2;
        block5: {
            int n3 = this.field1787 != null ? 16086 : 16087;
            block4: while (true) {
                switch (n3) {
                    case 16087: {
                        n3 = 16085;
                        continue block4;
                    }
                    case 16086: {
                        if (this.field1787.method12828().equals((Object)a2)) break block4;
                    }
                    default: {
                        if (this.field1762 == null || !this.field1762.method12828().equals((Object)a2)) break block5;
                    }
                }
                break;
            }
            n2 = (int)field1778[0];
            return n2 != 0;
        }
        n2 = (int)field1778[1];
        return n2 != 0;
    }

    private static Object method7743(Class248 class248) {
        return class248.method507();
    }

    private static void method7744() {
        Class4146.method20694();
    }

    private static void method7745() {
        Class6009.method23560();
    }

    private static class_2680 method7746(Class1017 class1017) {
        return class1017.method12829();
    }

    private static Class5496 method7747() {
        return Nuker.method7796();
    }

    public static Class1017 method7748(Nuker class420) {
        return class420.field1787;
    }

    private static void method7749() {
        Class3979.method19561();
    }

    private static void method7750() {
        Class4146.method20697();
    }

    private static void method7751(float f2) {
        Class5836.method22907(f2);
    }

    private static int method7752(int n2, int n3, Class3448 class3448, Class1621 class1621) {
        return Class1254.method13519(n2, n3, class3448, class1621);
    }

    private List method7753(class_243 f2) {
        ArrayList<class_2338> g2 = new ArrayList<class_2338>();
        double h2 = Math.ceil(((Float)Nuker.method7786(this.field1770)).floatValue());
        for (double e2 = -h2; e2 <= h2; e2 += 1.0) {
            double d2;
            double d3 = d2 = (Boolean)Nuker.method7780(this).method507() != false ? 0.0 : -h2;
            while (d2 <= h2) {
                for (double c2 = -h2; c2 <= h2; c2 += 1.0) {
                    class_2382 a2 = new class_2382((int)(f2.method_10216() + e2), (int)(f2.method_10214() + d2), (int)(f2.method_10215() + c2));
                    class_2338 b2 = new class_2338(a2);
                    g2.add(b2);
                }
                d2 += 1.0;
            }
        }
        return g2;
    }

    private static int method7754(class_2680 class_26802) {
        return AutoTool.method3840(class_26802);
    }

    public static class_746 method7755(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Class1
    public void method7756(Class18 a2) {
        if (Nuker.method7795(field290).method_7337()) return;
        if (Nuker.field290.field_1724.method_7325()) {
            int n2 = 18133;
            Class6009.method23560();
            return;
        }
        int n3 = 18134;
        block4: while (true) {
            switch (n3) {
                case 18134: {
                    n3 = 18132;
                    continue block4;
                }
                case 18133: {
                    return;
                }
            }
            break;
        }
        a2.method10();
        if (a2.method33().method_26204().method_36555() == -1.0f) return;
        if (!this.method7921(Nuker.method7861(a2))) return;
        if (Nuker.method7768(this).contains(a2.method34())) {
            return;
        }
        double b2 = Nuker.field290.field_1724.method_33571().method_1025(a2.method34().method_46558());
        if (b2 > ((Class252)this.field1770).method564()) return;
        this.field1791.add(a2.method34());
    }

    public static Class656 method7757(Nuker class420) {
        return class420.field1785;
    }

    private static Class656 method7758(Nuker class420) {
        return Nuker.method7925(class420);
    }

    private static class_2680 method7759(Class1017 class1017) {
        return class1017.method12829();
    }

    private static void method7760(Class3850 class3850, int n2) {
        class3850.method18931(n2);
    }

    private static class_2596 method7761(Class1017 a2, int b2) {
        return new class_2846(Nuker.method7894(), a2.method12828(), a2.method12835(), b2);
    }

    private static double method7762(Class252 class252) {
        return class252.method564();
    }

    private static void method7763(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method7764(String string, class_243 class_2432, int n2) {
        Class6454.method24598(string, class_2432, n2);
    }

    public static Queue method7765(Nuker class420) {
        return class420.field1772;
    }

    public static Class248 method7766(Nuker class420) {
        return class420.field1761;
    }

    private static Object method7767(Class248 class248) {
        return class248.method507();
    }

    public static Queue method7768(Nuker class420) {
        return class420.field1791;
    }

    private static void method7769() {
        Class6009.method23560();
    }

    private static class_2338 method7770(Class1017 class1017) {
        return class1017.method12828();
    }

    public static class_2350 method7771() {
        return class_2350.field_11036;
    }

    private static boolean method7772(Nuker class420, class_2680 class_26802) {
        return class420.method7921(class_26802);
    }

    private static void method7773(float f2) {
        Class5836.method22907(f2);
    }

    public static class_2846.class_2847 method7774() {
        return class_2846.class_2847.field_12971;
    }

    public static void method7775(Nuker class420, int n2) {
        class420.field1792 = n2;
    }

    private static void method7776(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_2350 method7777() {
        return class_2350.field_11036;
    }

    private static boolean method7778() {
        return Blink.method4987();
    }

    public static Class1017 method7779(Nuker class420) {
        return class420.field1762;
    }

    public static Class248 method7780(Nuker class420) {
        return class420.field1782;
    }

    private static Object method7781(Class248 class248) {
        return class248.method507();
    }

    private static float method7782(Class1017 class1017) {
        return class1017.method12831();
    }

    public static Class1017 method7783(Nuker class420) {
        return class420.field1762;
    }

    private static void method7784(boolean bl2) {
        Class6009.method23559(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method7785(class_4587 c2, float d2, Class656 e2, boolean f2) {
        float f3;
        class_243 p2;
        class_238 o2;
        int l2;
        int k2;
        Class1017 g2;
        block12: {
            float q2;
            block11: {
                g2 = e2.method11469();
                Class6283 h2 = e2.method11470();
                int i2 = (int)(40.0 * h2.method24281());
                int j2 = (int)(100.0 * h2.method24281());
                if (((Boolean)this.field1781.method507()).booleanValue()) {
                    int a2 = !this.method7921(g2.method12829()) ? ((Class251)Nuker.method7736(this)).method548(i2) : Class4045.method20101(Math.min(g2.method12831(), 1.0f), ((Class251)this.field1775).method541(i2), ((Class251)Nuker.method7876(this)).method541(i2)).getRGB();
                    int b2 = !this.method7921(g2.method12829()) ? Nuker.method7886((Class251)this.field1775, j2) : Class4045.method20101(Math.min(g2.method12831(), 1.0f), ((Class251)this.field1775).method541(j2), ((Class251)this.field1771).method541(j2)).getRGB();
                } else {
                    k2 = !(g2.method12831() >= 0.95f) && this.method7921(Nuker.method7759(g2)) ? ((Class251)this.field1771).method548(i2) : ((Class251)this.field1775).method548(i2);
                    l2 = g2.method12831() >= 0.95f || !this.method7921(g2.method12829()) ? ((Class251)this.field1775).method548(j2) : ((Class251)this.field1771).method548(j2);
                }
                class_2338 m2 = g2.method12828();
                class_265 n2 = class_259.method_1077();
                if (!f2 || Nuker.method7782(g2) < ((Float)Nuker.method7924(this).method507()).floatValue()) {
                    n2 = Nuker.method7887(g2).method_26218((class_1922)Nuker.method7871(field290), m2);
                    n2 = n2.method_1110() ? class_259.method_1077() : n2;
                }
                o2 = n2.method_1107();
                p2 = o2.method_996(m2).method_1005();
                float f4 = q2 = f2 ? ((Float)this.field1788.method507()).floatValue() : 1.0f;
                if (f2) {
                    int n3 = 41124;
                    Class4036.method20085(0.6874767f, 0.6625165f, 0.7221039f, Class1693.field6277, 0.02465713f, Class5687.field10928);
                    return;
                }
                int n4 = 41125;
                block4: while (true) {
                    switch (n4) {
                        case 41125: {
                            n4 = 41123;
                            continue block4;
                        }
                        case 41124: {
                            if (g2.method12831() >= ((Float)this.field1788.method507()).floatValue()) break block4;
                        }
                        default: {
                            if (!this.method7921(g2.method12829())) {
                                break block4;
                            }
                            break block11;
                        }
                    }
                    break;
                }
                f3 = 1.0f;
                break block12;
            }
            f3 = class_3532.method_15363((float)((g2.method12831() + (g2.method12831() - g2.method12840()) * d2) / q2), (float)0.0f, (float)1.0f);
        }
        float r2 = f3;
        double s2 = (o2.field_1320 - Nuker.method7805(o2)) / 2.0;
        double t2 = (o2.field_1325 - o2.field_1322) / 2.0;
        double u2 = (o2.field_1324 - Nuker.method7809(o2)) / 2.0;
        class_238 v2 = new class_238(p2, p2).method_1009(s2 * (double)r2, t2 * (double)r2, u2 * (double)r2);
        Nuker.method7735(c2, v2, k2);
        Class6454.method24605(c2, v2, 1.5f, l2);
        if (!((Boolean)Nuker.method7781(this.field1779)).booleanValue()) {
            return;
        }
        Nuker.method7764(String.valueOf(g2.method12826()), p2, (int)field1778[8]);
    }

    private static Object method7786(Class248 class248) {
        return class248.method507();
    }

    private static void method7787(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7788(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private Boolean method1278() {
        return (Boolean)this.field1790.method507();
    }

    private static void method7789() {
        Class1503.method14420();
    }

    private static float method7790() {
        return Class6322.method24336();
    }

    private static void method7791(float f2) {
        Class5836.method22907(f2);
    }

    public static Class1017 method7792(Nuker class420) {
        return class420.field1787;
    }

    static {
        Nuker.method7737(3084447268019358897L);
    }

    private static boolean method7793(Nuker class420, class_2680 class_26802) {
        return class420.method7921(class_26802);
    }

    private static void method7794(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public static class_746 method7795(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class5496 method7796() {
        return Class5723.field11048;
    }

    private static void method7797() {
        Class6454.method24594();
    }

    private static Class1017 method7798(Nuker class420) {
        return Nuker.method7932(class420);
    }

    private static void method7799() {
        Class1807.method15744();
    }

    private static void method7800(float f2) {
        Class5836.method22907(f2);
    }

    private static void method7801() {
        Class5659.method22184();
    }

    private void method7802(int a2) {
        switch (((Class601)((Object)Nuker.method7904(this.field1786))).ordinal()) {
            case 0: {
                Nuker.method7760(Class5723.field11058, a2);
                break;
            }
            case 1: {
                Nuker.method7728(Class5723.field11058, a2);
                break;
            }
            case 2: {
                Nuker.method7720(Class5723.field11058, a2);
            }
        }
    }

    private static void method7803() {
        Class1745.method15538();
    }

    private float method7804(class_2680 d2) {
        class_1799 a2;
        int b2;
        int e2 = Nuker.method7754(d2);
        float f2 = Nuker.field290.field_1724.method_31548().method_5438(e2).method_7924(d2);
        if (f2 > 1.0f && (b2 = Nuker.method7817(a2 = Nuker.field290.field_1724.method_31548().method_5438(e2), class_1893.field_9131)) > 0) {
            if (!a2.method_7960()) {
                f2 += (float)(b2 * b2 + (int)field1778[0]);
            }
        }
        if (class_1292.method_5576((class_1309)Nuker.field290.field_1724)) {
            f2 *= 1.0f + (float)(class_1292.method_5575((class_1309)Nuker.field290.field_1724) + (int)field1778[0]) * 0.2f;
        }
        if (Nuker.field290.field_1724.method_6059(Nuker.method7863())) {
            float f3;
            switch (Nuker.method7896(field290).method_6112(class_1294.field_5901).method_5578()) {
                case 0: {
                    f3 = Class4022.field9268;
                    break;
                }
                case 1: {
                    float f4 = 0.09f;
                    return Class5659.method22208();
                }
                case 2: {
                    f3 = 0.0027f;
                    break;
                }
                default: {
                    f3 = 8.1E-4f;
                }
            }
            float c2 = f3;
            f2 *= c2;
        }
        if (!Nuker.field290.field_1724.method_24828()) {
            f2 /= Class896.field3849;
        }
        return f2;
    }

    public static double method7805(class_238 class_2383) {
        return class_2383.field_1323;
    }

    private static void method7806() {
        Class6009.method23560();
    }

    private static void method7807(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method7808(int n2, int n3, Class529 class529, Class624 class624) {
        return Class1254.method13441(n2, n3, class529, class624);
    }

    public static double method7809(class_238 class_2383) {
        return class_2383.field_1321;
    }

    public static Class1017 method7810(Nuker class420) {
        return class420.field1762;
    }

    private static void method7811(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method7812() {
        Class1745.method15538();
    }

    private static void method7813(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static void method7814(Nuker class420, boolean bl2) {
        class420.field1763 = bl2;
    }

    private static class_2350 method7815(Class1017 class1017) {
        return class1017.method12835();
    }

    public static Class3850 method7816() {
        return Class5723.field11058;
    }

    private static int method7817(class_1799 class_17992, class_5321 class_53212) {
        return Class1308.method13621(class_17992, class_53212);
    }

    private static class_2338 method7818(Class1017 class1017) {
        return class1017.method12828();
    }

    private static boolean method7819(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    /*
     * Unable to fully structure code
     */
    public Class1017 method7820() {
        block24: {
            block21: {
                block26: {
                    block20: {
                        block25: {
                            block22: {
                                block23: {
                                    if (this.field1767.method507() != Class589.field2876) break block22;
                                    f = this.method7753(Nuker.field290.field_1724.method_19538());
                                    g = null;
                                    h = (int)Nuker.field1778[12];
                                    i = 1.7976931348623157E308;
                                    block8: for (class_2338 e : f) {
                                        a = Nuker.field290.field_1687.method_8320(e);
                                        if (!this.method7921(a)) continue;
                                        if (this.method7742(e)) {
                                            v0 = 47473;
                                            Nuker.method7908(0.6804122f, Class3932.field8956, 0.20028251f, 0.2623765f, 0.34263593f, 0.8034843f);
                                            return null;
                                        }
                                        v1 = 47474;
                                        if (true) ** GOTO lbl17
                                        block9: while (true) {
                                            v1 = 47472;
lbl17:
                                            // 2 sources

                                            switch (v1) {
                                                case 47474: {
                                                    continue block9;
                                                }
                                                case 47473: {
                                                    continue block8;
                                                }
                                            }
                                            break;
                                        }
                                        b = Nuker.field290.field_1724.method_33571().method_1025(e.method_46558());
                                        if (b > Nuker.method7928((Class252)this.field1770)) continue;
                                        c = e.method_10264();
                                        d = Nuker.field290.field_1724.method_33571().method_1025(e.method_46558());
                                        if (c <= h) {
                                            if (c != h || !(d < i)) continue;
                                        }
                                        g = e;
                                        h = c;
                                        i = d;
                                    }
                                    if (g == null) break block23;
                                    v2 = 10445;
                                    ** GOTO lbl40
                                }
                                v2 = 10446;
                                if (true) ** GOTO lbl40
                                block10: while (true) {
                                    v2 = 10444;
lbl40:
                                    // 3 sources

                                    switch (v2) {
                                        case 10446: {
                                            continue block10;
                                        }
                                        case 10445: {
                                            return new Class1017(g, (Boolean)Nuker.method7743(this.field1773) != false ? Class5723.field11051.method12799(g, (boolean)Nuker.field1778[1]) : Nuker.method7837());
                                        }
                                    }
                                    break;
                                }
                                break block24;
                            }
                            if (this.field1791.isEmpty()) {
                                return null;
                            }
                            if (Nuker.method7798(this) == null) break block25;
                            v3 = 62666;
                            if (true) ** GOTO lbl58
                        }
                        v4 = 62667;
                        Class1668.method15147(1898233575, 1360966063, -22279366, 2085649694);
                        return null;
                        do {
                            v3 = var14_13 = 62665;
lbl58:
                            // 2 sources

                            if (var14_13 == 62666) break block20;
                        } while (var14_13 == 62667);
                        break block21;
                    }
                    if (this.field1787 == null) break block26;
                    v5 = 60013;
                    ** GOTO lbl70
                }
                v5 = 60014;
                if (true) ** GOTO lbl70
                while (true) {
                    v5 = var15_14 = 60012;
lbl70:
                    // 3 sources

                    if (var15_14 == 60013) break;
                    if (var15_14 == 60014) {
                        continue;
                    }
                    break block21;
                    break;
                }
                return null;
            }
            j = new LinkedList<E>(this.field1791);
            k = (class_2338)j.poll();
            if (this.field1787 != null && Nuker.method7828(this).method12828().equals((Object)k)) {
                k = (class_2338)this.field1791.poll();
            }
            if (k != null) {
                v6 = v7;
                v8 = v7;
                v9 = k;
                if (((Boolean)this.field1773.method507()).booleanValue()) {
                    v10 = 28982;
                    Class3979.method19561();
                    return null;
                }
                v11 = 28983;
                Nuker.method7791(0.3066277f);
                return null;
            }
        }
        return null;
    }

    private void method7821(Class1017 a2) {
        Class5723.field11048.method21341((class_2596)new class_2846(Nuker.method7824(), a2.method12828(), Nuker.method7815(a2)));
        Nuker.method7853().method21341((class_2596)new class_2846(class_2846.class_2847.field_12971, Nuker.method7818(a2), a2.method12835()));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method7822(Class63 h2) {
        Class1017 f2;
        int n2;
        if (Nuker.field290.field_1724.method_7337()) return;
        if (Nuker.field290.field_1724.method_7325()) return;
        if (h2.method128() != Class543.field2690) {
            return;
        }
        if (this.method7911()) {
            if (Nuker.method7931(this)) {
                this.field1763 = (int)field1778[1];
            }
            if (this.field1766) {
                this.field1766 = (int)field1778[1];
            }
        }
        this.field1792 -= (int)field1778[0];
        if (this.field1762 != null && this.field1762.method12826() > (Integer)Nuker.method7926(this.field1780)) {
            this.field1769.field3181.method24284((boolean)field1778[1]);
            if (this.field1777) {
                Class5723.field11058.method18916();
                this.field1777 = (int)field1778[1];
            }
            this.field1791.remove(Nuker.method7891(this).method12828());
            this.field1762 = null;
            if (!this.method7911()) {
                this.field1766 = (int)field1778[0];
            }
        }
        if (this.field1762 != null) {
            float a2 = this.method7905(Nuker.method7855(this).method12829(), (class_1922)Nuker.field290.field_1687, this.field1762.method12828());
            this.field1762.method12832(a2);
            int b2 = this.field1762.method12824();
            float c2 = this.field1762.method12831() + ((Boolean)this.field1768.method507() != false ? a2 : 0.0f);
            if (c2 >= 1.0f && this.method7921(this.field1762.method12829()) && b2 != (int)field1778[8]) {
                if (this.method6626()) {
                    Class1503.method14420();
                    return;
                }
                this.field1762.method12827();
                Class5723.field11058.method18887(b2);
                this.field1777 = (int)field1778[0];
            }
        }
        if (this.field1777) {
            int n3 = Nuker.method7810(this) != null ? 2738 : 2739;
            while (true) {
                int n4;
                if ((n4 = n3) == 2738) {
                    Class6009.method23560();
                    return;
                }
                if (n4 != 2739) break;
                n3 = 2737;
            }
            Class5723.field11058.method18916();
            this.field1777 = (int)field1778[1];
            this.field1769.field3181.method24284((boolean)field1778[1]);
            if (this.field1762 != null) {
                Nuker.method7717(this).remove(Nuker.method7914(this).method12828());
            }
            this.field1762 = null;
            if (!this.method7911()) {
                Nuker.method7884(this, (boolean)field1778[0]);
            }
        }
        if (Nuker.method7912(this) != null) {
            double d2 = Nuker.field290.field_1724.method_33571().method_1025(Nuker.method7839(this.field1787).method_46558());
            int n5 = !(d2 > Nuker.method7762((Class252)this.field1770)) ? 12142 : 12143;
            block5: while (true) {
                switch (n5) {
                    case 12143: {
                        n5 = 12141;
                        continue block5;
                    }
                    case 12142: {
                        if (this.field1787.method12826() <= (Integer)this.field1780.method507()) break block5;
                    }
                    default: {
                        this.method7823(this.field1787);
                        this.field1785.field3181.method24284((boolean)field1778[1]);
                        this.field1791.remove(Nuker.method7770(Nuker.method7879(this)));
                        this.field1787 = null;
                    }
                }
                break;
            }
        }
        if (this.field1787 != null) {
            float e2 = this.method7905(this.field1787.method12829(), (class_1922)Nuker.field290.field_1687, Nuker.method7792(this).method12828());
            this.field1787.method12832(e2);
            if (this.field1787.method12831() >= ((Float)Nuker.method7835(this.field1788)).floatValue()) {
                if (this.method7921(Nuker.method7746(Nuker.method7899(this)))) {
                    if (!this.method6626() || ((Boolean)this.field1536.method507()).booleanValue() || Nuker.method7885(this.field1786) == Class601.field2921) {
                        this.method7878(Nuker.method7846(this));
                        Nuker.method7732(this).method12827();
                    }
                } else {
                    this.method7823(Nuker.method7862(this));
                    Nuker.method7757((Nuker)this).field3181.method24284((boolean)field1778[1]);
                    this.field1791.remove(this.field1787.method12828());
                    this.field1787 = null;
                }
            }
        }
        int n6 = !this.field1772.isEmpty() ? 15328 : 15329;
        while ((n2 = n6) != 15328) {
            if (n2 != 15329) {
                Class6009.method23559(true);
                return;
            }
            n6 = 15327;
        }
        if (this.field1792 <= 0 && (f2 = (Class1017)this.field1772.poll()) != null) {
            this.method7897(f2);
            Nuker.method7775(this, (int)field1778[7]);
        }
        if (!this.field1772.isEmpty()) {
            return;
        }
        Class1017 g2 = this.method7820();
        if (g2 == null) return;
        if (this.field1762 != null || !((Boolean)this.field1790.method507()).booleanValue()) {
            if (!this.method7911()) return;
        }
        this.method7868(g2);
    }

    public void method7823(Class1017 a2) {
        Class5723.field11048.method21341((class_2596)new class_2846(Nuker.method7918(), a2.method12828(), a2.method12835()));
    }

    public static class_2846.class_2847 method7824() {
        return class_2846.class_2847.field_12973;
    }

    private static void method7825() {
        Class5836.method22885();
    }

    private static boolean method7826(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static Class248 method7827(Nuker class420) {
        return class420.field1790;
    }

    public static Class1017 method7828(Nuker class420) {
        return class420.field1787;
    }

    public static Class248 method7829(Nuker class420) {
        return class420.field1786;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Class1
    public void method7830(Class59 b2) {
        int n2;
        if (Nuker.field290.field_1724.method_7337()) return;
        int n3 = Nuker.field290.field_1724.method_7325() ? 63264 : 63265;
        block4: while (true) {
            switch (n3) {
                case 63265: {
                    n3 = 63263;
                    continue block4;
                }
                case 63264: {
                    return;
                }
            }
            break;
        }
        Class6009.method23560();
        for (class_2338 a2 : this.field1791) {
            Class6454.method24642(b2.method125(), a2, 2.0f, Colors.method10620().method10615((int)field1778[11]));
        }
        if (this.field1785 != null && Nuker.method7715(Nuker.method7851(this.field1785)) > (double)0.01f) {
            this.method7785(b2.method125(), b2.method124(), this.field1785, (boolean)field1778[0]);
        }
        int n4 = n2 = this.field1769 != null ? 4363 : 4364;
        if (n2 != 4363) {
            if (n2 == 4364) {
                Class5836.method22890();
                return;
            }
        } else if (this.field1769.method11470().method24281() > Class6175.field12534) {
            this.method7785(Nuker.method7903(b2), b2.method124(), Nuker.method7758(this), (boolean)field1778[1]);
        }
        Class6009.method23561();
    }

    private static Object method7831(Class248 class248) {
        return class248.method507();
    }

    private static void method7832(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method7833() {
        return Class1807.method15742();
    }

    private static class_2338 method7834(Class1017 class1017) {
        return class1017.method12828();
    }

    private static Object method7835(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method7836(Nuker class420) {
        return class420.field1788;
    }

    private static class_2350 method7837() {
        return Nuker.method7777();
    }

    private static void method7838() {
        Class5659.method22184();
    }

    private static class_2338 method7839(Class1017 class1017) {
        return class1017.method12828();
    }

    private boolean method7840(class_2680 b2) {
        if (b2.method_29291()) {
            int a2 = AutoTool.method3840(b2);
            return Nuker.field290.field_1724.method_31548().method_5438(a2).method_7951(b2);
        }
        return (int)field1778[0] != 0;
    }

    private static Object method7841(Class248 class248) {
        return class248.method507();
    }

    private static void method7842() {
        Class5836.method22897();
    }

    @Class1
    public void method7843(Class131 a2) {
        if (a2.method251() instanceof class_2868 && ((Boolean)Nuker.method7865(this).method507()).booleanValue()) {
            this.field1787.method12830(0.0f, 0.0f);
        }
    }

    private static int method7844(int n2, int n3, Class628 class628, Class3835 class3835) {
        return Class1254.method13404(n2, n3, class628, class3835);
    }

    private static void method7845() {
        Class5836.method22897();
    }

    private static Class1017 method7846(Nuker class420) {
        return Nuker.method7748(class420);
    }

    private static class_2338 method7847(Class1017 class1017) {
        return class1017.method12828();
    }

    private static void method7848(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method7849() {
        return Class3979.method19544();
    }

    private static void method7850(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Class6283 method7851(Class656 class656) {
        return class656.method11470();
    }

    private static void method7852(float f2) {
        Class5836.method22907(f2);
    }

    public static Class5496 method7853() {
        return Class5723.field11048;
    }

    private static void method7854() {
        Class5659.method22184();
    }

    public static Class1017 method7855(Nuker class420) {
        return class420.field1762;
    }

    private static int method7856(int n2, int n3, Class268 class268, Class169 class169) {
        return Class1254.method13539(n2, n3, class268, class169);
    }

    private Boolean method7857() {
        return (Boolean)Nuker.method7721(Nuker.method7922(this));
    }

    private static void method7858(float f2) {
        Class5836.method22907(f2);
    }

    private static Class1017 method7859(Nuker class420) {
        return Nuker.method7738(class420);
    }

    private static void method7860(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_2680 method7861(Class18 class18) {
        return class18.method33();
    }

    public static Class1017 method7862(Nuker class420) {
        return class420.field1787;
    }

    public static class_6880 method7863() {
        return class_1294.field_5901;
    }

    private static void method7864() {
        Class1745.method15538();
    }

    private static Class248 method7865(Nuker class420) {
        return Nuker.method7766(class420);
    }

    private static float method7866(float f2, float f3, float f4) {
        return Class6023.method23744(f2, f3, f4);
    }

    private static void method7867(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method7868(Class1017 a2) {
        if (!Nuker.method7739(this, a2.method12829())) return;
        if (this.method7742(a2.method12828())) {
            return;
        }
        int n2 = (Boolean)Nuker.method7767(Nuker.method7827(this)) == false ? 24239 : 24240;
        block8: while (true) {
            switch (n2) {
                case 24240: {
                    n2 = 24238;
                    continue block8;
                }
                case 24239: {
                    this.field1787 = a2;
                    Nuker.method7765(this).offer(a2);
                    return;
                }
            }
            break;
        }
        if (this.field1763) {
            if (!this.method7911()) return;
        }
        if (this.field1766) {
            return;
        }
        int b2 = (int)field1778[1];
        if (!this.method7911() && !this.field1763) {
            if (this.field1762 == null) {
                this.field1762 = this.field1787.method12834();
                this.field1769 = new Class656(this.field1762, new Class6283((boolean)field1778[0], ((Integer)this.field1784.method507()).intValue()));
            } else {
                b2 = (int)field1778[0];
            }
        }
        this.field1787 = a2;
        this.field1772.offer(a2);
        int n3 = b2 != 0 ? 44081 : 44082;
        block9: while (true) {
            switch (n3) {
                case 44082: {
                    n3 = 44080;
                    continue block9;
                }
                case 44081: {
                    Nuker.method7814(this, (boolean)field1778[0]);
                    return;
                }
            }
            break;
        }
    }

    @Class1
    public void method7869(Class133 b2) {
        class_2626 a2;
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2626 && !Nuker.method7793(this, (a2 = (class_2626)class_25962).method_11308()) && Nuker.method7779(this) != null && this.field1762.method12828().equals((Object)a2.method_11309())) {
            this.field1769.field3181.method24284((boolean)field1778[1]);
            if (this.field1777) {
                Nuker.method7910().method18916();
                this.field1777 = (int)field1778[1];
            }
            this.field1762 = null;
            if (!this.method7911()) {
                int n2 = (int)field1778[0];
                Class1108.method12918(false);
                return;
            }
            this.field1766 = (int)field1778[1];
        }
    }

    private static void method7870() {
        Class5659.method22184();
    }

    public static class_638 method7871(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method7872(float f2) {
        Class5836.method22907(f2);
    }

    private void method7873(int a2) {
        switch (((Class601)((Object)this.field1786.method507())).ordinal()) {
            case 1: {
                Class5723.field11058.method18916();
                break;
            }
            case 2: {
                Class5723.field11058.method18871(a2);
            }
        }
    }

    private static void method7874() {
        Class3979.method19561();
    }

    private static int method7875(int n2, int n3, Class3915 class3915, SafeWalk class366) {
        return Class1254.method13533(n2, n3, class3915, class366);
    }

    public static Class248 method7876(Nuker class420) {
        return class420.field1771;
    }

    private static void method7877() {
        Class5836.method22890();
    }

    public void method7878(Class1017 b2) {
        int d2;
        if (((Boolean)this.field1764.method507()).booleanValue()) {
            float[] a2 = Class1503.method14416(Nuker.method7755(field290).method_33571(), b2.method12828().method_46558());
            if (((Boolean)Nuker.method7841(this.field1789)).booleanValue()) {
                Class1503.method14417(a2[(int)field1778[1]], a2[(int)field1778[0]]);
            } else {
                this.method6465(a2[(int)field1778[1]], a2[(int)field1778[0]]);
            }
        }
        int c2 = b2.method12824();
        int n2 = c2 != (int)field1778[8] && c2 != Class5723.field11058.method18969() ? (int)field1778[0] : (d2 = (int)field1778[1]);
        if (d2 != 0) {
            this.method7802(c2);
        }
        this.method7821(b2);
        if (d2 != 0) {
            this.method7873(c2);
        }
        if (((Boolean)this.field1764.method507()).booleanValue()) {
            Class1503.method14420();
        }
    }

    public static Class1017 method7879(Nuker class420) {
        return class420.field1787;
    }

    private static void method7880() {
        Class3979.method19561();
    }

    private static void method7881(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static float method7882() {
        return Class5659.method22223();
    }

    private static void method7883(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static void method7884(Nuker class420, boolean bl2) {
        class420.field1766 = bl2;
    }

    private static Object method7885(Class248 class248) {
        return class248.method507();
    }

    private static int method7886(Class251 class251, int n2) {
        return class251.method548(n2);
    }

    private static class_2680 method7887(Class1017 class1017) {
        return class1017.method12829();
    }

    private static void method7888() {
        Class1503.method14420();
    }

    private static boolean method7889() {
        return Class1807.method15753();
    }

    private static void method7890() {
        Class5836.method22890();
    }

    public static Class1017 method7891(Nuker class420) {
        return class420.field1762;
    }

    private static void method7892() {
        Class1503.method14420();
    }

    private static int method7893(int n2, int n3, NoRotate class286, AntiCrawl class319) {
        return Class1254.method13430(n2, n3, class286, class319);
    }

    public static class_2846.class_2847 method7894() {
        return class_2846.class_2847.field_12971;
    }

    public static void method7895(Nuker class420, Class656 class656) {
        class420.field1769 = class656;
    }

    public static class_746 method7896(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public void method7897(Class1017 a2) {
        if (((Boolean)Nuker.method7831(this.field1790)).booleanValue()) {
            if (((Boolean)this.field1776.method507()).booleanValue()) {
                Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, a2.method12828(), a2.method12835()));
                Nuker.method7881(Class5723.field11048, (class_2596)new class_2846(class_2846.class_2847.field_12968, a2.method12828(), a2.method12835()));
                Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12971, Nuker.method7847(a2), a2.method12835()));
                Class5723.field11048.method21341((class_2596)new class_2846(Nuker.method7729(), a2.method12828(), a2.method12835()));
                Class5723.field11048.method21341((class_2596)new class_2879(Nuker.method7930()));
                Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
                Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
                Class3979.method19561();
                return;
            }
            Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, a2.method12828(), a2.method12835()));
            Class5723.field11048.method21341((class_2596)new class_2846(Nuker.method7722(), a2.method12828(), a2.method12835()));
            Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, a2.method12828(), a2.method12835()));
            Class5723.field11048.method21341((class_2596)new class_2846(Nuker.method7726(), a2.method12828(), a2.method12835()));
            Nuker.method7747().method21341((class_2596)new class_2846(class_2846.class_2847.field_12968, a2.method12828(), a2.method12835()));
            Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, Nuker.method7834(a2), a2.method12835()));
            Class5723.field11048.method21341((class_2596)new class_2879(class_1268.field_5808));
        } else {
            Nuker.method7794(Class5723.field11048, (class_2596)new class_2846(class_2846.class_2847.field_12968, a2.method12828(), a2.method12835()));
            if (!((Boolean)this.field1789.method507()).booleanValue()) {
                Class5723.field11048.method21353(arg_0 -> Nuker.method7761(a2, arg_0));
                Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12973, a2.method12828(), Nuker.method7919(a2)));
            }
        }
        this.field1785 = new Class656(a2, new Class6283((boolean)field1778[0], ((Integer)this.field1784.method507()).intValue()));
    }

    public static class_1268 method7898() {
        return class_1268.field_5808;
    }

    public static Class1017 method7899(Nuker class420) {
        return class420.field1787;
    }

    private static void method7900(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method7901() {
        Class5836.method22890();
    }

    public static Class1011 method7902() {
        return Class5723.field11051;
    }

    private static class_4587 method7903(Class59 class59) {
        return class59.method125();
    }

    private static Object method7904(Class248 class248) {
        return class248.method507();
    }

    public float method7905(class_2680 b2, class_1922 c2, class_2338 d2) {
        if (this.field1786.method507() == Class601.field2921) {
            return b2.method_26165((class_1657)Nuker.field290.field_1724, (class_1922)Nuker.field290.field_1687, d2);
        }
        float e2 = b2.method_26214(c2, d2);
        if (e2 == Class6403.field13278) {
            return 0.0f;
        }
        int a2 = this.method7840(b2) ? (int)field1778[9] : (int)field1778[10];
        return this.method7804(b2) / e2 / (float)a2;
    }

    private static void method7906() {
        Class5836.method22885();
    }

    private static int method7907(int n2, int n3, Class44 class44, Class5670 class5670) {
        return Class1254.method13496(n2, n3, class44, class5670);
    }

    private static void method7908(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Class1017 method7909() {
        return Class1017.method12839();
    }

    public static Class3850 method7910() {
        return Class5723.field11058;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method7911() {
        if (this.field1787 == null) ** GOTO lbl14
        if (this.field1787.method12831() >= ((Float)Nuker.method7836(this).method507()).floatValue()) {
            v0 = 28284;
            return Class5659.method22194();
        }
        v1 = 28285;
        if (true) ** GOTO lbl9
        block4: while (true) {
            v1 = 28283;
lbl9:
            // 2 sources

            switch (v1) {
                case 28285: {
                    continue block4;
                }
                case 28284: {
                    if (Nuker.method7772(this, Nuker.method7859(this).method12829())) ** GOTO lbl16
lbl14:
                    // 2 sources

                    v2 = (int)Nuker.field1778[0];
                    break block4;
                }
lbl16:
                // 2 sources

                default: {
                    v2 = (int)Nuker.field1778[1];
                }
            }
            break;
        }
        return (boolean)v2;
    }

    public static Class1017 method7912(Nuker class420) {
        return class420.field1787;
    }

    private static void method7913(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Class1017 method7914(Nuker class420) {
        return Nuker.method7783(class420);
    }

    private static void method7915() {
        Class1745.method15538();
    }

    private static void method7916() {
        Class1745.method15538();
    }

    private static void method7917() {
        Class4146.method20697();
    }

    private static class_2846.class_2847 method7918() {
        return Nuker.method7774();
    }

    private static class_2350 method7919(Class1017 class1017) {
        return class1017.method12835();
    }

    private static int method7920(int n2, int n3, Class706 class706, Class1764 class1764) {
        return Class1254.method13505(n2, n3, class706, class1764);
    }

    public boolean method7921(class_2680 a2) {
        return (!a2.method_26215() && a2.method_26227().method_15769() ? (int)field1778[0] : (int)field1778[1]) != 0;
    }

    public static Class248 method7922(Nuker class420) {
        return class420.field1789;
    }

    private static void method7923(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method7924(Nuker class420) {
        return class420.field1788;
    }

    public static Class656 method7925(Nuker class420) {
        return class420.field1769;
    }

    private static Object method7926(Class248 class248) {
        return class248.method507();
    }

    public Nuker() {
        super("Nuker", "Clears nearby blocks", Class556.field2754);
        this.field1772 = new ArrayDeque();
        this.field1783 = this.method450(new Class260("Selection", "The selection of blocks to use for scaffold", Class583.field2845, Class583.values()));
        class_2248[] class_2248Array = new class_2248[(int)field1778[5]];
        class_2248Array[(int)Nuker.field1778[1]] = class_2246.field_10540;
        class_2248Array[(int)Nuker.field1778[0]] = class_2246.field_22423;
        this.field1774 = this.method450(new Class257("Whitelist", "Valid block whitelist", class_2248Array));
        this.field1765 = this.method450(new Class257("Blacklist", "Valid block blacklist", new class_2248[(int)field1778[1]]));
        this.field1767 = this.method450(new Class260("Mode", "The nuker selection mode", Class589.field2876, Class589.values()));
        this.field1782 = this.method450(new Class253("Flatten", "Only clears above the player y-level", (boolean)field1778[1], this::method1269));
        this.field1773 = this.method450(new Class253("StrictDirection", "Only mines on visible faces", (boolean)field1778[1]));
        this.field1770 = this.method450(new Class252("Range", "The range to mine blocks", Float.valueOf(0.0f), Float.valueOf(Class6094.field12286), Float.valueOf(Class5637.field10783)));
        this.field1790 = this.method450(new Class253("DoubleBreak", "Allows you to mine two blocks at once", (boolean)field1778[1]));
        this.field1780 = this.method450(new Class252("MiningTicks", "The max number of ticks to hold a pickaxe for the packet mine", (Number)((int)field1778[7]), (Number)((int)field1778[2]), (Number)((int)field1778[6]), this::method1278));
        this.field1788 = this.method450(new Class252("Speed", "The speed to mine blocks", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(1.0f)));
        this.field1786 = this.method450(new Class260("AutoSwap", "Swaps to the best tool once the mining is complete", Class601.field2922, Class601.values()));
        this.field1768 = this.method450(new Class253("SwapBefore", "Swaps before mining", (boolean)field1778[1], this::method7718));
        this.field1764 = this.method450(new Class253("Rotate", "Rotates when mining the block", (boolean)field1778[0]));
        this.field1761 = this.method450(new Class253("SwitchReset", "Resets mining after switching items", (boolean)field1778[1]));
        this.field1789 = this.method450(new Class253("Grim", "Uses grim block breaking speeds", (boolean)field1778[1]));
        this.field1776 = this.method450(new Class253("GrimV3", "Allows mining on new grim servers", (boolean)field1778[1], this::method7857));
        this.field1771 = this.method450(new Class251("MineColor", "The mine render color", Color.RED, (boolean)field1778[1], (boolean)field1778[1]));
        this.field1775 = this.method450(new Class251("DoneColor", "The done render color", Color.GREEN, (boolean)field1778[1], (boolean)field1778[1]));
        this.field1779 = this.method450(new Class253("Debug-Ticks", "Shows the mining ticks", (boolean)field1778[1]));
        this.field1784 = this.method450(new Class252("Fade-Time", "Time to fade", (int)field1778[1], (int)field1778[4], (int)field1778[3]));
        this.field1781 = this.method450(new Class253("SmoothColor", "Interpolates from start to done color", (boolean)field1778[1]));
        this.field1769 = new Class656(Nuker.method7909(), new Class6283((boolean)field1778[0], 200.0f));
        this.field1785 = new Class656(Class1017.method12839(), new Class6283((boolean)field1778[0], 200.0f));
    }

    private static int method7927(int n2, int n3, Class703 class703, Swing class309) {
        return Class1254.method13460(n2, n3, class703, class309);
    }

    private Boolean method1269() {
        return (this.field1767.method507() == Class589.field2876 ? (int)field1778[0] : (int)field1778[1]) != 0;
    }

    private static double method7928(Class252 class252) {
        return class252.method564();
    }

    public static Class1017 method7929(Nuker class420) {
        return class420.field1787;
    }

    private static class_1268 method7930() {
        return Nuker.method7898();
    }

    public static boolean method7931(Nuker class420) {
        return class420.field1763;
    }

    public static Class1017 method7932(Nuker class420) {
        return class420.field1762;
    }

    private static void method7933() {
        Class6454.method24594();
    }

    private static void method7934(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static float method7935() {
        return Class6322.method24337();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

