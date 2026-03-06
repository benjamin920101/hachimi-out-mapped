/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.particle.ParticleType
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.particle.SimpleParticleType
 *  net.minecraft.util.math.MathHelper
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1802;
import mapped.Class1807;
import mapped.Class183;
import mapped.Class244;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3870;
import mapped.Class39;
import mapped.Class3970;
import mapped.Class3979;
import mapped.Class4147;
import mapped.Class4172;
import mapped.Class488;
import mapped.Class53;
import mapped.Class54;
import mapped.Class55;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5760;
import mapped.Class5794;
import mapped.Class5836;
import mapped.Class6143;
import mapped.Class6322;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Particles
extends Class278 {
    Class248 field1323;
    Class248 field1324;
    Class248 field1325;
    Class248 field1326;
    Class248 field1327;
    Class248 field1328;
    private static long[] field1329 = new long[9];
    Class248 field1330;
    Class248 field1331;
    Class248 field1332;
    Class248 field1333;
    Class248 field1334;
    Class248 field1335;
    Class248 field1336;
    Class248 field1337 = this.method450(new Class260("Totem", "Modify totem particle rendering", Class488.field2530, Particles.method5398()));

    private static void method5390() {
        Class1807.method15744();
    }

    private static void method5391(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5392() {
        Class5836.method22897();
    }

    public static Class248 method5393(Particles class388) {
        return class388.field1337;
    }

    private static void method5394(Class39 class39, int n2) {
        class39.method72(n2);
    }

    public Particles() {
        super("Particles", "Change the rendering of particles", Class556.field2759);
        this.field1330 = this.method450(new Class251("TotemColor", "Color of the totem particles", new Color((int)field1329[6], (int)field1329[2], (int)field1329[0]), (boolean)field1329[0], (boolean)field1329[0], this::method1269));
        this.field1335 = this.method450(new Class252("TotemParticles", "Max totem particles", (Number)((int)field1329[7]), (Number)((int)field1329[1]), (Number)((int)field1329[1]), this::method1278));
        this.field1334 = this.method450(new Class252("TotemParticleTicks", "Max totem particle ticks", (Number)((int)field1329[4]), (Number)((int)field1329[5]), (Number)((int)field1329[5]), this::method5416));
        this.field1324 = this.method450(new Class253("Explosions", "Prevents explosion particles from rendering", (boolean)field1329[3]));
        this.field1323 = this.method450(new Class253("Firework", "Prevents rendering of firework particles", (boolean)field1329[0]));
        this.field1333 = this.method450(new Class253("Effects", "Prevents rendering of potion effect particles", (boolean)field1329[3]));
        this.field1327 = this.method450(new Class253("Items", "Prevents rendering of eating particles", (boolean)field1329[0]));
        this.field1328 = this.method450(new Class253("BottleSplash", "Prevents rendering of bottle splash particles", (boolean)field1329[3]));
        this.field1331 = this.method450(new Class253("Portal", "Prevents rendering of portal particles", (boolean)field1329[3]));
        this.field1332 = this.method450(new Class253("Block", "Prevents block particles from rendering", (boolean)field1329[0]));
        this.field1336 = this.method450(new Class253("BlockBreak", "Prevents block break particles from rendering", (boolean)field1329[0]));
        this.field1326 = this.method450(new Class253("Campfires", "Prevents campfire particles from rendering", (boolean)field1329[0]));
        this.field1325 = this.method450(new Class253("CryingObsidian", "Prevents obsidian tear particles from rendering", (boolean)field1329[0]));
    }

    public static Class248 method5395(Particles class388) {
        return class388.field1337;
    }

    private static void method5396() {
        Chams.method1924();
    }

    private static void method5397(float f2) {
        Class5836.method22907(f2);
    }

    private static Class488[] method5398() {
        return Class488.values();
    }

    public static Class248 method5399(Particles class388) {
        return class388.field1335;
    }

    private static Class248 method5400(Particles class388) {
        return Particles.method5412(class388);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5401(Class54 a2) {
        block10: {
            block9: {
                if (((Boolean)this.field1333.method507()).booleanValue() && a2.method107() == class_2398.field_11226 || ((Boolean)this.field1324.method507()).booleanValue() && (Particles.method5410(a2) == class_2398.field_11236 || a2.method107() == class_2398.field_11221) || ((Boolean)this.field1323.method507()).booleanValue() && a2.method107() == class_2398.field_11248 || ((Boolean)this.field1327.method507()).booleanValue() && a2.method107() == class_2398.field_11218 || ((Boolean)this.field1328.method507()).booleanValue() && (a2.method107() == Particles.method5421() || a2.method107() == class_2398.field_11213)) break block9;
                if (((Boolean)this.field1331.method507()).booleanValue()) {
                    int n2;
                    if (a2.method107() != class_2398.field_11214) {
                        int n3 = 9061;
                        Class3979.method19561();
                        return;
                    }
                    int n4 = 9062;
                    while ((n2 = n4) != 9061) {
                        if (n2 == 9062) {
                            n4 = 9060;
                            continue;
                        }
                        break block9;
                    }
                }
                if (!((Boolean)this.field1332.method507() != false && a2.method107() == class_2398.field_11217 || (Boolean)this.field1326.method507() != false && Particles.method5414(a2) == class_2398.field_17430) && (!((Boolean)this.field1325.method507()).booleanValue() || a2.method107() != Particles.method5418() && Particles.method5413(a2) != class_2398.field_22446 && a2.method107() != class_2398.field_22448)) break block10;
            }
            a2.method10();
        }
    }

    private static void method5402(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method5403() {
        Chams.method1924();
    }

    static {
        Particles.method5404(3832612892629948888L);
    }

    private static void method5404(long l2) {
        Particles.field1329[1] = l2 ^ 0x35302D1EAACA59C8L;
        Particles.field1329[4] = l2 ^ 0x35302D1EAACA59DDL;
        Particles.field1329[7] = l2 ^ 0x35302D1EAACA59DBL;
        Particles.field1329[2] = l2 ^ 0x35302D1EAACA59A0L;
        Particles.field1329[0] = l2 ^ 0x35302D1EAACA59D8L;
        Particles.field1329[8] = l2 ^ 0x35302D1EAACA59DCL;
        Particles.field1329[5] = l2 ^ 0x35302D1EAACA59C6L;
        Particles.field1329[3] = l2 ^ 0x35302D1EAACA59D9L;
        Particles.field1329[6] = l2 ^ 0x35302D1EAACA59C1L;
    }

    private Boolean method1269() {
        return (Particles.method5393(this).method507() == Class488.field2532 ? (int)field1329[3] : (int)field1329[0]) != 0;
    }

    private static void method5405() {
        Class5659.method22184();
    }

    private Boolean method1278() {
        return (this.field1337.method507() != Class488.field2529 ? (int)field1329[3] : (int)field1329[0]) != 0;
    }

    private static int method5406(int n2, int n3, Class244 class244, Class5760 class5760) {
        return Class3970.method19486(n2, n3, class244, class5760);
    }

    private static Object method5407(Class248 class248) {
        return class248.method507();
    }

    private static void method5408(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5409() {
        Class1807.method15744();
    }

    private static class_2396 method5410(Class54 class54) {
        return class54.method107();
    }

    @Class1
    public void method5411(Class39 a2) {
        if (this.field1337.method507() != Class488.field2529) {
            if (a2.method76() == class_2398.field_11220) {
                a2.method10();
                Particles.method5394(a2, (Integer)Particles.method5399(this).method507());
                a2.method74((Integer)this.field1334.method507());
            }
        }
    }

    public static Class248 method5412(Particles class388) {
        return class388.field1337;
    }

    private static class_2396 method5413(Class54 class54) {
        return class54.method107();
    }

    private static class_2396 method5414(Class54 class54) {
        return class54.method107();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5415(Class53 h2) {
        if (Particles.method5407(Particles.method5400(this)) != Class488.field2532) return;
        h2.method10();
        Color d2 = (Color)this.field1330.method507();
        float e2 = (float)d2.getRed() / 255.0f;
        float f2 = (float)d2.getGreen() / 255.0f;
        float g2 = (float)d2.getBlue() / 255.0f;
        int n2 = field289.nextInt((int)field1329[8]) == 0 ? 29516 : 29517;
        block4: while (true) {
            switch (n2) {
                case 29517: {
                    n2 = 29515;
                    continue block4;
                }
                case 29516: {
                    float a2 = (float)d2.getRed() * Class1802.field6733 / Class3870.field8796;
                    float b2 = (float)d2.getGreen() * Class4147.field9642 / Class6143.field12432;
                    float c2 = (float)d2.getBlue() * Class4172.field9722 / 255.0f;
                    h2.method106(new Color(class_3532.method_15363((float)a2, (float)0.0f, (float)1.0f), class_3532.method_15363((float)b2, (float)0.0f, (float)1.0f), class_3532.method_15363((float)c2, (float)0.0f, (float)1.0f)));
                    return;
                }
            }
            break;
        }
        h2.method106(new Color(class_3532.method_15363((float)(e2 + field289.nextFloat() * 0.1f), (float)0.0f, (float)1.0f), class_3532.method_15363((float)(f2 + field289.nextFloat() * Class5794.field11264), (float)0.0f, (float)1.0f), class_3532.method_15363((float)(g2 + field289.nextFloat() * 0.1f), (float)0.0f, (float)1.0f)));
    }

    private Boolean method5416() {
        if (Particles.method5395(this).method507() != Class488.field2529) {
            int n2 = (int)field1329[3];
            Chams.method1924();
            return null;
        }
        return (boolean)field1329[0];
    }

    private static void method5417() {
        Class5836.method22897();
    }

    public static class_2400 method5418() {
        return class_2398.field_22447;
    }

    @Class1
    public void method5419(Class55 a2) {
        if (this.field1337.method507() == Class488.field2529 && a2.method107() == class_2398.field_11220) {
            a2.method10();
        }
    }

    @Class1
    public void method5420(Class183 a2) {
        if (((Boolean)this.field1336.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public static class_2400 method5421() {
        return class_2398.field_11245;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

