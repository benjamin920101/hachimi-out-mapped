/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.LightningEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.particle.FireworksSparkParticle$Explosion
 *  net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket
 */
package mapped;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class116;
import mapped.Class133;
import mapped.Class1394;
import mapped.Class221;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.AutoFish;
import mapped.Class3979;
import mapped.Class4018;
import mapped.AntiAim;
import mapped.Colors;
import mapped.Class5535;
import mapped.Class556;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class752;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.particle.FireworksSparkParticle;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class KillEffects
extends Class278 {
    Class248 field509;
    Class248 field510;
    Class248 field511;
    Class248 field512;
    Class248 field513;
    private static long[] field514 = new long[6];
    Class248 field515;
    Class248 field516;
    Class248 field517;
    ConcurrentLinkedQueue field518;
    private final Map field519 = new HashMap();

    public static class_638 method1704(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static boolean method1705(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    private static void method1706() {
        Class6009.method23561();
    }

    private static Object method1707(Class248 class248) {
        return class248.method507();
    }

    private static void method1708(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method1709(int n2, int n3, AntiAim class439, Class116 class116) {
        return Class752.method11970(n2, n3, class439, class116);
    }

    private static int method1710(int n2, int n3, AutoFish class330, Class1394 class1394) {
        return Class752.method11968(n2, n3, class330, class1394);
    }

    @Class1
    public void method1711(Class133 c2) {
        if (KillEffects.field290.field_1687 == null || KillEffects.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_8143) {
            class_8143 b2 = (class_8143)class_25962;
            if (b2.comp_1269() != KillEffects.field290.field_1724.method_5628()) {
                Class5836.method22907(0.064590275f);
                return;
            }
            this.field519.entrySet().removeIf(KillEffects::method1735);
            class_1297 a2 = KillEffects.method1704(field290).method_8469(b2.comp_1267());
            if (a2 == null) {
                return;
            }
            this.field519.put(a2, System.currentTimeMillis());
        }
    }

    /*
     * Unable to fully structure code
     */
    private void method1712(double h, double i, double j, double k, int l) {
        for (g = -l; g <= l; ++g) {
            for (f = -l; f <= l; ++f) {
                block6: for (e = -l; e <= l; ++e) {
                    block8: {
                        a = (double)f + (KillEffects.field289.nextDouble() - KillEffects.field289.nextDouble()) * Class4018.field9236;
                        b = (double)g + (KillEffects.field289.nextDouble() - KillEffects.field289.nextDouble()) * 0.5;
                        c = (double)e + (KillEffects.field289.nextDouble() - KillEffects.field289.nextDouble()) * Class5535.field10466;
                        d = Math.sqrt(a * a + b * b + c * c) / k + KillEffects.field289.nextGaussian() * 0.05;
                        KillEffects.method1713(this, h, i, j, a / d, b / d, c / d);
                        if (g == -l) continue;
                        if (g == l) break block8;
                        v0 = 11906;
                        ** GOTO lbl18
                    }
                    v0 = 11907;
                    if (true) ** GOTO lbl18
                    block7: while (true) {
                        v0 = 11905;
lbl18:
                        // 3 sources

                        switch (v0) {
                            case 11907: {
                                continue block7;
                            }
                            case 11906: {
                                if (f == ~l + 1) continue block6;
                                if (f == l) continue block6;
                                e += l * (int)KillEffects.field514[4] - (int)KillEffects.field514[0];
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    private static void method1713(KillEffects class292, double d2, double d3, double d4, double d5, double d6, double d7) {
        class292.method1721(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method1714() {
        return Class3979.method19551();
    }

    private static void method1715(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Class1
    public void method1716(Class59 c2) {
        Iterator b2;
        if (((Boolean)KillEffects.method1720(this.field512)).booleanValue() && field288 && (b2 = this.field518.iterator()).hasNext()) {
            Class6009.method23560();
            while (b2.hasNext()) {
                Class1394 a2 = (Class1394)b2.next();
                a2.method14140(c2.method125());
                if (!a2.method14138()) continue;
                b2.remove();
            }
            KillEffects.method1706();
        }
    }

    public static Class248 method1717(KillEffects class292) {
        return class292.field511;
    }

    private static void method1718(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1719() {
        Class5659.method22184();
    }

    private static Object method1720(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method1721(double a2, double b2, double c2, double d2, double e2, double f2) {
        if (KillEffects.field290.field_1713 == null || KillEffects.field290.field_1687 == null) {
            return;
        }
        class_677.class_680 g2 = (class_677.class_680)KillEffects.field290.field_1713.method_3056((class_2394)class_2398.field_11248, a2, b2, c2, d2, e2, f2);
        int n2 = g2 == null ? 2438 : 2439;
        block4: while (true) {
            switch (n2) {
                case 2439: {
                    n2 = 2437;
                    continue block4;
                }
                case 2438: {
                    return;
                }
            }
            break;
        }
        g2.method_3027((boolean)field514[2]);
        g2.method_3026((boolean)field514[2]);
        g2.method_3093(KillEffects.method1727().method10621().intValue());
    }

    private boolean method1722(class_1297 a2) {
        Long b2 = (Long)this.field519.get(a2);
        return (b2 != null && System.currentTimeMillis() - b2 < field514[5] ? (int)field514[0] : (int)field514[2]) != 0;
    }

    private static class_1309 method1723(Class221 class221) {
        return class221.method412();
    }

    private static boolean method1724() {
        return Class5659.method22111();
    }

    private static void method1725() {
        Class5836.method22890();
    }

    /*
     * WARNING - void declaration
     */
    @Class1
    public void method1726(Class221 g2) {
        void h2;
        block9: {
            block8: {
                class_1309 class_13092;
                if (((Boolean)this.field516.method507()).booleanValue() && g2.method412() == KillEffects.field290.field_1724 || !((class_13092 = KillEffects.method1723(g2)) instanceof class_1657)) break block8;
                class_1657 a2 = (class_1657)class_13092;
                if (!((Boolean)this.field510.method507()).booleanValue() || this.method1722((class_1297)a2)) break block9;
            }
            return;
        }
        if (((Boolean)this.field511.method507()).booleanValue()) {
            int c2 = (int)field514[2];
            while (true) {
                if (c2 >= (Integer)this.field517.method507()) {
                    Class5836.method22890();
                    return;
                }
                class_1538 b2 = new class_1538(KillEffects.method1731(), (class_1937)KillEffects.field290.field_1687);
                b2.method_23327(h2.method_23317(), h2.method_23318(), h2.method_23321());
                KillEffects.field290.field_1687.method_53875((class_1297)b2);
                ++c2;
            }
        }
        if (((Boolean)KillEffects.method1733(this.field515)).booleanValue()) {
            this.method1712(h2.method_23317(), h2.method_23318(), h2.method_23321(), 0.5, (int)field514[3]);
        }
        if (((Boolean)KillEffects.method1728(this.field512)).booleanValue() && field288) {
            double d2 = h2.method_23317();
            double e2 = h2.method_23318();
            double f2 = h2.method_23321();
            this.field518.add(new Class1394(new class_243(d2, e2, f2), ((Color)this.field509.method507()).getRGB(), (long)(1000.0f * ((Float)KillEffects.method1736(this.field513)).floatValue())).method14141());
        }
    }

    private static Colors method1727() {
        return Colors.method10620();
    }

    private static Object method1728(Class248 class248) {
        return class248.method507();
    }

    private Boolean method1269() {
        return (Boolean)KillEffects.method1707(KillEffects.method1717(this));
    }

    private static void method1729(long l2) {
        KillEffects.method1732(l2);
    }

    private static Boolean method1278() {
        return field288;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method1730() {
        int n2;
        int n3 = (Boolean)this.field512.method507() != false ? 16298 : 16299;
        block4: while (true) {
            switch (n3) {
                case 16299: {
                    n3 = 16297;
                    continue block4;
                }
                case 16298: {
                    if (!field288) break block4;
                    n2 = (int)field514[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field514[2];
        return n2 != 0;
    }

    public static class_1299 method1731() {
        return class_1299.field_6112;
    }

    private static void method1732(long l2) {
        KillEffects.field514[3] = l2 ^ 0xE625A41FE9D4D060L;
        KillEffects.field514[2] = l2 ^ 0xE625A41FE9D4D064L;
        KillEffects.field514[0] = l2 ^ 0xE625A41FE9D4D065L;
        KillEffects.field514[1] = l2 ^ 0xE625A41FE9D4D061L;
        KillEffects.field514[4] = l2 ^ 0xE625A41FE9D4D066L;
        KillEffects.field514[5] = l2 ^ 0xE625A41FE9D4C3ECL;
    }

    public KillEffects() {
        super("KillEffects", "Adds effects to player deaths", Class556.field2759);
        this.field516 = this.method450(new Class253("IgnoreSelf", "Dont adds effects when you die", (boolean)field514[0]));
        this.field510 = this.method450(new Class253("OnlyAttacked", "Only adds effects to attacked player's death", (boolean)field514[0]));
        this.field515 = this.method450(new Class253("Firework", "Explodes a firework at the player's death", (boolean)field514[0]));
        this.field511 = this.method450(new Class253("Lightning", "Summon lightning at the player's death", (boolean)field514[0]));
        this.field517 = this.method450(new Class252("Strikes", "The number of lightning strikes", (Number)((int)field514[0]), (Number)((int)field514[0]), (Number)((int)field514[1]), this::method1269));
        this.field512 = this.method450(new Class253("Hive", "", (boolean)field514[0], KillEffects::method1278));
        this.field509 = this.method450(new Class251("HiveColor", "", Color.WHITE, (boolean)field514[0], (boolean)field514[2], this::method1737));
        this.field513 = this.method450(new Class252("HiveDuration", "The duration of the hive", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.7f), (Number)Float.valueOf(1.0f), this::method1730));
        this.field518 = new ConcurrentLinkedQueue();
    }

    private static Object method1733(Class248 class248) {
        return class248.method507();
    }

    static {
        KillEffects.method1729(-1862902413873852316L);
    }

    private static void method1734() {
        Class5836.method22885();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method1735(Map.Entry a2) {
        int n2;
        int n3 = System.currentTimeMillis() - (Long)a2.getValue() > field514[5] ? 22432 : 22433;
        block4: while (true) {
            switch (n3) {
                case 22433: {
                    n3 = 22431;
                    continue block4;
                }
                case 22432: {
                    n2 = (int)field514[0];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field514[2];
        return n2 != 0;
    }

    private static Object method1736(Class248 class248) {
        return class248.method507();
    }

    /*
     * Unable to fully structure code
     */
    private Boolean method1737() {
        block4: {
            block2: {
                block1: {
                    block3: {
                        if (!((Boolean)this.field512.method507()).booleanValue()) break block2;
                        if (!KillEffects.field288) break block3;
                        v0 = 2713;
                        ** GOTO lbl10
                    }
                    v0 = 2714;
                    if (true) ** GOTO lbl10
                    do {
                        v0 = var1_1 = 2712;
lbl10:
                        // 3 sources

                        if (var1_1 == 2713) break block1;
                    } while (var1_1 == 2714);
                    break block2;
                }
                v1 = (int)KillEffects.field514[0];
                break block4;
            }
            v1 = (int)KillEffects.field514[2];
        }
        return (boolean)v1;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

