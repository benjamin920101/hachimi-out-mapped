/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.network.ClientPlayerEntity
 *  com.mojang.blaze3d.systems.VertexSorter
 *  org.joml.Matrix4f
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Chams;
import mapped.Freecam;
import mapped.Class3961;
import mapped.Class4146;
import mapped.Socials;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5768;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class598;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class6034;
import mapped.Class617;
import mapped.Class6322;
import mapped.Class6454;
import net.hachimi.client.mixin.ap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.ClientPlayerEntity;
import com.mojang.blaze3d.systems.VertexSorter;
import org.joml.Matrix4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Tracers
extends Class278 {
    Class248 field852 = this.method450(new Class260("Mode", "Render tracers to entities not visible on the screen", Class617.field3004, Class617.values()));
    Class248 field853;
    Class248 field854;
    Class248 field855;
    Class248 field856;
    Class248 field857;
    Class248 field858;
    Class248 field859;
    private static long[] field860 = new long[6];
    Class248 field861;
    Class248 field862;
    Class248 field863 = this.method450(new Class260("Target", "The body part of the entity to target", Class598.field2906, Class598.values()));
    Class248 field864;
    Class248 field865;
    Class248 field866;
    Class248 field867;
    Class248 field868;

    private static Object method3029(Class248 class248) {
        return class248.method507();
    }

    private static void method3030(long l2) {
        Tracers.method3055(l2);
    }

    private static void method3031(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method3032(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private Boolean method3033() {
        return (Boolean)this.field868.method507();
    }

    private static void method3034(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method3035(Tracers class334) {
        return class334.field862;
    }

    private static class_243 method3036(class_1297 class_12972, float f2) {
        return Class6023.method23746(class_12972, f2);
    }

    public static Class248 method3037(Tracers class334) {
        return class334.field854;
    }

    private Boolean method1269() {
        return (Boolean)this.field854.method507();
    }

    private Boolean method1278() {
        return (Boolean)Tracers.method3041(this.field854);
    }

    private static void method3038() {
        Class5836.method22885();
    }

    private static Object method3039(Class248 class248) {
        return class248.method507();
    }

    private static void method3040() {
        Class1503.method14420();
    }

    private static Object method3041(Class248 class248) {
        return class248.method507();
    }

    private Color method3042(class_1297 b2) {
        if (!b2.method_5767()) {
            Class1503.method14417(0.35341316f, 0.48980618f);
            return null;
        }
        if (((Boolean)Tracers.method3065(this).method507()).booleanValue()) {
            return (Color)Tracers.method3066(this.field853);
        }
        if (b2 instanceof class_1657) {
            class_1657 a2 = (class_1657)b2;
            if (((Boolean)Tracers.method3037(this).method507()).booleanValue()) {
                if (Tracers.method3070(Class5723.field11045, a2.method_5477())) {
                    return Socials.method10623().method10630();
                }
                return (Color)this.field855.method507();
            }
        }
        if (Class1158.method13133(b2) && ((Boolean)this.field866.method507()).booleanValue()) {
            return (Color)this.field861.method507();
        }
        if ((Class1158.method13110(b2) || Class1158.method13121(b2)) && ((Boolean)this.field867.method507()).booleanValue()) {
            return (Color)Tracers.method3057(this).method507();
        }
        if (Class1158.method13114(b2) && ((Boolean)this.field868.method507()).booleanValue()) {
            return (Color)Tracers.method3048(this).method507();
        }
        if (b2 instanceof class_1542) {
            if (((Boolean)Tracers.method3068(this).method507()).booleanValue()) {
                return (Color)this.field865.method507();
            }
        }
        return null;
    }

    public static Class248 method3043(Tracers class334) {
        return class334.field857;
    }

    private Boolean method3044() {
        return (Boolean)this.field862.method507();
    }

    private static void method3045(class_4587 class_45872, class_243 class_2432, class_243 class_2433, float f2, int n2) {
        Class6454.method24682(class_45872, class_2432, class_2433, f2, n2);
    }

    private static void method3046() {
        Chams.method1924();
    }

    public static boolean method3047(class_315 class_3152) {
        return class_3152.field_1842;
    }

    public static Class248 method3048(Tracers class334) {
        return class334.field856;
    }

    private Boolean method3049() {
        return (Boolean)this.field867.method507();
    }

    private static void method3050(float f2) {
        Class5836.method22907(f2);
    }

    private double method3051(class_1297 a2) {
        double d2;
        switch (((Class598)((Object)this.field863.method507())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                d2 = 0.0;
                break;
            }
            case 1: {
                double d3 = (double)a2.method_17682() / Class5768.field11194;
                return Class5659.method22191(Class3961.field9018, 0.08764200240852205, 0.5115252234755712);
            }
            case 2: {
                d2 = a2.method_18381(a2.method_18376());
            }
        }
        return d2;
    }

    public Tracers() {
        super("Tracers", "Draws a tracer to all entities in render distance", Class556.field2759);
        this.field857 = this.method450(new Class252("Width", "The line width of the tracer", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(Class6034.field12087)));
        this.field854 = this.method450(new Class253("Players", "Render tracers to player", (boolean)field860[4]));
        this.field855 = this.method450(new Class251("PlayersColor", "The render color for players", new Color((int)field860[5], (int)field860[3], (int)field860[3]), (boolean)field860[0], this::method1269));
        this.field859 = this.method450(new Class253("Friends", "Render tracers to players that are friended", (boolean)field860[0], this::method1278));
        this.field862 = this.method450(new Class253("Invisibles", "Render tracers to invisible entities", (boolean)field860[0]));
        this.field853 = this.method450(new Class251("InvisiblesColor", "The render color for invisibles", new Color((int)field860[5], (int)field860[2], (int)field860[0]), (boolean)field860[0], this::method3044));
        this.field866 = this.method450(new Class253("Monsters", "Render tracers to monsters", (boolean)field860[0]));
        this.field861 = this.method450(new Class251("MonstersColor", "The render color for monsters", new Color((int)field860[5], (int)field860[3], (int)field860[3]), (boolean)field860[0], this::method3062));
        this.field867 = this.method450(new Class253("Animals", "Render tracers to animals", (boolean)field860[0]));
        this.field864 = this.method450(new Class251("AnimalsColor", "The render color for animals", new Color((int)field860[0], (int)field860[5], (int)field860[0]), (boolean)field860[0], this::method3049));
        this.field868 = this.method450(new Class253("Vehicles", "Render tracers to vehicles", (boolean)field860[0]));
        this.field856 = this.method450(new Class251("VehiclesColor", "The render color for vehicles", new Color((int)field860[5], (int)field860[2], (int)field860[0]), (boolean)field860[0], this::method3033));
        this.field858 = this.method450(new Class253("Items", "Render tracers to items", (boolean)field860[0]));
        this.field865 = this.method450(new Class251("ItemsColor", "The render color for items", new Color((int)field860[1], (int)field860[1], (int)field860[1]), (boolean)field860[0], this::method3073));
    }

    private static void method3052() {
        Class1745.method15538();
    }

    private static void method3053() {
        Class1807.method15744();
    }

    public static class_746 method3054(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3055(long l2) {
        Tracers.field860[0] = l2 ^ 0xB8D1F8A5612B2FE2L;
        Tracers.field860[4] = l2 ^ 0xB8D1F8A5612B2FE3L;
        Tracers.field860[2] = l2 ^ 0xB8D1F8A5612B2F86L;
        Tracers.field860[5] = l2 ^ 0xB8D1F8A5612B2F2AL;
        Tracers.field860[3] = l2 ^ 0xB8D1F8A5612B2FDEL;
        Tracers.field860[1] = l2 ^ 0xB8D1F8A5612B2F1DL;
    }

    public static double method3056(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static Class248 method3057(Tracers class334) {
        return class334.field864;
    }

    private static void method3058() {
        Class1745.method15538();
    }

    private static void method3059() {
        Class4146.method20697();
    }

    private static void method3060() {
        Class5659.method22184();
    }

    private static Freecam method3061() {
        return Freecam.method4718();
    }

    private Boolean method3062() {
        return (Boolean)this.field866.method507();
    }

    static {
        Tracers.method3030(-5129045111414771742L);
    }

    private static void method3063() {
        Class6009.method23561();
    }

    private static double method3064(class_243 class_2432) {
        return Tracers.method3056(class_2432);
    }

    private static Class248 method3065(Tracers class334) {
        return Tracers.method3035(class334);
    }

    private static Object method3066(Class248 class248) {
        return class248.method507();
    }

    private static float method3067(Class59 class59) {
        return class59.method124();
    }

    public static Class248 method3068(Tracers class334) {
        return class334.field858;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method3069(Class59 l2) {
        void m2;
        if (Tracers.method3054(field290) == null) return;
        if (field290.method_1560() == null) return;
        class_1297 class_12972 = field290.method_1560();
        int n2 = class_12972 instanceof class_1657 ? 56759 : 56760;
        int n3 = n2;
        if (n3 != 56759) {
            if (n3 != 56760) return;
            return;
        }
        class_1657 a2 = (class_1657)class_12972;
        if (Tracers.method3047(Tracers.field290.field_1690)) {
            return;
        }
        class_4587 n4 = new class_4587();
        double o2 = ((Integer)Tracers.field290.field_1690.method_41808().method_41753()).intValue();
        n4.method_34425(Tracers.field290.field_1773.method_22973(o2));
        Matrix4f p2 = RenderSystem.getProjectionMatrix();
        RenderSystem.setProjectionMatrix((Matrix4f)n4.method_23760().method_23761(), (class_8251)class_8251.field_43360);
        Class6009.method23560();
        class_243 q2 = Tracers.method3036((class_1297)m2, l2.method124());
        class_4184 r2 = Tracers.field290.field_1773.method_19418();
        double s2 = class_3532.method_16439((float)l2.method124(), (float)((ap)r2).getLastCameraY(), (float)((ap)r2).getCameraY());
        double t2 = m2.method_23317() - q2.method_10216();
        double u2 = m2.method_23318() - q2.method_10214() + s2;
        double v2 = m2.method_23321() - q2.method_10215();
        float w2 = m2.method_36455();
        float x2 = m2.method_36454();
        if (Tracers.method3061().method1265()) {
            class_243 b2 = Freecam.method4718().method4722();
            class_243 c2 = Class6023.method23730(b2, Freecam.method4718().method4719(), l2.method124());
            float[] d2 = Freecam.method4718().method4735();
            t2 = Tracers.method3064(b2) - c2.field_1352;
            u2 = b2.field_1351 - c2.field_1351;
            v2 = b2.field_1350 - c2.field_1350;
            x2 = d2[(int)field860[0]];
            w2 = d2[(int)field860[4]];
        }
        class_243 y2 = new class_243(0.0, 0.0, 1.0).method_1037(-((float)Math.toRadians(w2))).method_1024(-((float)Math.toRadians(x2))).method_1019(new class_243(t2, u2, v2));
        Iterator iterator = Tracers.field290.field_1687.method_18112().iterator();
        while (true) {
            Color j2;
            int i2;
            if (!iterator.hasNext()) {
                Class5836.method22885();
                return;
            }
            class_1297 k2 = (class_1297)iterator.next();
            switch (((Class617)((Object)this.field852.method507())).ordinal()) {
                default: {
                    throw new MatchException(null, null);
                }
                case 2: {
                    int n5 = (int)field860[4];
                    break;
                }
                case 0: {
                    int n5 = Class6454.method24660(k2.method_5829());
                    break;
                }
                case 1: {
                    if (!Class6454.method24660(k2.method_5829())) {
                        int n6 = (int)field860[4];
                        Class1745.method15538();
                        return;
                    }
                    int n5 = i2 = (int)field860[0];
                }
            }
            if (k2 == null || !k2.method_5805() || k2 == Tracers.field290.field_1724) continue;
            if (i2 == 0 || k2 instanceof class_1657 && Class5723.field11045.method21243(k2.method_5476()) && !((Boolean)Tracers.method3029(this.field859)).booleanValue() || (j2 = this.method3042(k2)) == null) continue;
            class_243 e2 = Tracers.method3072(k2, Tracers.method3067(l2));
            double f2 = k2.method_23317() - e2.method_10216();
            double g2 = k2.method_23318() - e2.method_10214();
            double h2 = k2.method_23321() - e2.method_10215();
            Tracers.method3045(l2.method125(), y2, new class_243(f2, g2, h2).method_1031(0.0, this.method3051(k2), 0.0), ((Float)Tracers.method3039(Tracers.method3043(this))).floatValue(), j2.getRGB());
        }
    }

    private static boolean method3070(Class5478 class5478, class_2561 class_25612) {
        return class5478.method21243(class_25612);
    }

    private static void method3071(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static class_243 method3072(class_1297 class_12972, float f2) {
        return Class6023.method23746(class_12972, f2);
    }

    private Boolean method3073() {
        return (Boolean)this.field858.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

