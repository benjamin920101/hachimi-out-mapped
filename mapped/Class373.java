/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket
 *  net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.world.biome.BiomeParticleConfig
 *  net.minecraft.client.world.ClientWorld
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class133;
import mapped.Class1527;
import mapped.Class155;
import mapped.Class1745;
import mapped.Class1768;
import mapped.Class200;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3411;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class46;
import mapped.Class47;
import mapped.Class48;
import mapped.Class534;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class63;
import mapped.Class6454;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.biome.BiomeParticleConfig;
import net.minecraft.client.world.ClientWorld;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class373
extends Class278 {
    Class248 field1224;
    Class248 field1225;
    Class248 field1226;
    Class248 field1227;
    Class248 field1228;
    Class248 field1229;
    Class248 field1230 = this.method450(new Class260("Weather", "The world weather", Class534.field2636, Class534.values()));
    private static long[] field1231 = new long[5];
    Class248 field1232;
    private Class534 field1233;
    Class248 field1234;
    Class248 field1235;
    Class248 field1236;

    @Override
    public void method1274() {
        if (Class373.field290.field_1687 != null) {
            this.field1233 = Class373.method4907(field290).method_8546() ? Class373.method4919() : (Class373.field290.field_1687.method_8419() ? Class373.method4917() : Class534.field2636);
            this.method4899((Class534)((Object)Class373.method4920(this.field1230)));
        }
    }

    @Override
    public void method1279() {
        if (Class373.field290.field_1687 != null && Class373.method4904(this) != null) {
            this.method4899(this.field1233);
        }
    }

    public static Class534 method4880() {
        return Class534.field2636;
    }

    public static Class248 method4881(Class373 class373) {
        return class373.field1236;
    }

    public static Class248 method4882(Class373 class373) {
        return class373.field1230;
    }

    private static Class248 method4883(Class373 class373) {
        return Class373.method4882(class373);
    }

    private static void method4884() {
        Class298.method1924();
    }

    private static void method4885() {
        Class4146.method20697();
    }

    @Class1
    public void method4886(Class63 a2) {
        if (a2.method128() == Class543.field2691) {
            this.method4899((Class534)((Object)this.field1230.method507()));
            if (((Boolean)this.field1227.method507()).booleanValue()) {
                Class373.field290.field_1687.method_8435((long)((Integer)this.field1225.method507()).intValue());
            }
        }
    }

    public static class_638 method4887(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private Boolean method1269() {
        return (Boolean)Class373.method4892(Class373.method4890(this));
    }

    private static void method4888() {
        Class298.method1924();
    }

    @Class1
    public void method4889(Class155 a2) {
        if (((Boolean)Class373.method4905(this).method507()).booleanValue()) {
            a2.method10();
            a2.method305(((Float)this.field1234.method507()).floatValue());
            a2.method309(((Float)Class373.method4910(this).method507()).floatValue());
        }
    }

    public static Class248 method4890(Class373 class373) {
        return class373.field1232;
    }

    private static void method4891(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method4892(Class248 class248) {
        return class248.method507();
    }

    private static void method4893(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public Class373() {
        super("Skybox", "Changes the rendering of the world skybox", Class556.field2759);
        this.field1227 = this.method450(new Class253("WorldTime", "Custom the world time", (boolean)field1231[0]));
        this.field1225 = this.method450(new Class252("Time", "The world time of day", (Number)((int)field1231[0]), (Number)((int)field1231[3]), (Number)((int)field1231[4]), this.field1227::method507));
        this.field1232 = this.method450(new Class253("Sky", "Changes the world skybox color", (boolean)field1231[1]));
        this.field1228 = this.method450(new Class251("SkyColor", "The color for the world skybox", new Color((int)field1231[2], (int)field1231[0], (int)field1231[0]), (boolean)field1231[0], (boolean)field1231[1], this::method1269));
        this.field1236 = this.method450(new Class253("Cloud", "Changes the world cloud color", (boolean)field1231[0]));
        this.field1224 = this.method450(new Class251("CloudColor", "The color for the world clouds", new Color((int)field1231[2], (int)field1231[0], (int)field1231[0]), (boolean)field1231[0], (boolean)field1231[1], this::method1278));
        this.field1229 = this.method450(new Class253("Fog", "Changes the world fog color", (boolean)field1231[0]));
        this.field1234 = this.method450(new Class252("FogStart", "The fog start distance", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(Class1527.field5756), this::method4906));
        this.field1235 = this.method450(new Class252("FogEnd", "The fog start distance", (Number)Float.valueOf(10.0f), (Number)Float.valueOf(64.0f), (Number)Float.valueOf(Class1768.field6624), this::method4921));
        this.field1226 = this.method450(new Class251("FogColor", "The color for the world fog", new Color((int)field1231[2], (int)field1231[0], (int)field1231[0]), (boolean)field1231[1], (boolean)field1231[1], this::method4900));
    }

    private static void method4894() {
        Class1745.method15538();
    }

    private static Class248 method4895(Class373 class373) {
        return Class373.method4881(class373);
    }

    private static Object method4896(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4897(Class373 class373) {
        return class373.field1229;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4898(Class133 b2) {
        class_2596 class_25962;
        if (b2.method251() instanceof class_2761 && ((Boolean)Class373.method4912(this.field1227)).booleanValue()) {
            b2.method10();
        }
        int n2 = !((class_25962 = b2.method251()) instanceof class_2668) ? 15501 : 15500;
        block4: while (true) {
            switch (n2) {
                case 15501: {
                    n2 = 15499;
                    continue block4;
                }
                case 15500: {
                    class_2668 a2 = (class_2668)class_25962;
                    if (Class373.method4883(this).method507() == Class373.method4916()) return;
                    if (a2.method_11491() != class_2668.field_25646 && a2.method_11491() != class_2668.field_25652) {
                        if (a2.method_11491() == class_2668.field_25647) {
                            this.field1233 = Class373.method4880();
                            b2.method10();
                            Class1745.method15538();
                            return;
                        }
                    } else {
                        this.field1233 = Class534.field2642;
                        b2.method10();
                        return;
                    }
                    if (a2.method_11491() != class_2668.field_25653) {
                        return;
                    }
                    this.field1233 = Class534.field2637;
                    b2.method10();
                    return;
                }
            }
            break;
        }
    }

    private void method4899(Class534 a2) {
        switch (a2.ordinal()) {
            case 0: 
            case 3: {
                Class373.field290.field_1687.method_28104().method_157((boolean)field1231[0]);
                Class373.field290.field_1687.method_8519(0.0f);
                Class373.field290.field_1687.method_8496(0.0f);
                break;
            }
            case 1: {
                Class373.method4914(field290).method_28104().method_157((boolean)field1231[1]);
                Class373.field290.field_1687.method_8519(1.0f);
                Class373.field290.field_1687.method_8496(0.0f);
                break;
            }
            case 2: {
                Class373.field290.field_1687.method_28104().method_157((boolean)field1231[1]);
                Class373.field290.field_1687.method_8519(2.0f);
                Class373.method4887(field290).method_8496(1.0f);
            }
        }
    }

    private Boolean method4900() {
        return (Boolean)this.field1229.method507();
    }

    private static Object method4901(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method4902(Class47 a2) {
        if (((Boolean)this.field1232.method507()).booleanValue()) {
            a2.method10();
            a2.method96((Color)this.field1228.method507());
        }
    }

    public static Class248 method4903(Class373 class373) {
        return class373.field1226;
    }

    public static Class534 method4904(Class373 class373) {
        return class373.field1233;
    }

    public static Class248 method4905(Class373 class373) {
        return class373.field1229;
    }

    private Boolean method4906() {
        return (Boolean)Class373.method4896(Class373.method4897(this));
    }

    public static class_638 method4907(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Object method4908(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method4909(Class48 a2) {
        if (((Boolean)Class373.method4895(this).method507()).booleanValue()) {
            a2.method10();
            a2.method96((Color)this.field1224.method507());
        }
    }

    public static Class248 method4910(Class373 class373) {
        return class373.field1235;
    }

    public static Class248 method4911(Class373 class373) {
        return class373.field1229;
    }

    private static Object method4912(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method4913(Class200 a2) {
        if (Class373.method4908(this.field1230) == Class534.field2640) {
            a2.method10();
            a2.method377(new class_4761((class_2394)class_2398.field_23956, Class3411.field7429));
        }
    }

    public static class_638 method4914(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Class248 method4915(Class373 class373) {
        return class373.field1236;
    }

    public static Class534 method4916() {
        return Class534.field2641;
    }

    public static Class534 method4917() {
        return Class534.field2642;
    }

    @Class1
    public void method4918(Class46 a2) {
        if (((Boolean)Class373.method4901(Class373.method4911(this))).booleanValue()) {
            a2.method10();
            a2.method96((Color)Class373.method4903(this).method507());
        }
    }

    public static Class534 method4919() {
        return Class534.field2637;
    }

    private static Object method4920(Class248 class248) {
        return class248.method507();
    }

    private Boolean method4921() {
        return (Boolean)this.field1229.method507();
    }

    static {
        Class373.method4923(-2224621070924405250L);
    }

    private Boolean method1278() {
        return (Boolean)Class373.method4915(this).method507();
    }

    private static void method4922() {
        Class6454.method24594();
    }

    private static void method4923(long l2) {
        Class373.field1231[3] = l2 ^ 0xE1208EEC2BB3B28EL;
        Class373.field1231[0] = l2 ^ 0xE1208EEC2BB3A5FEL;
        Class373.field1231[2] = l2 ^ 0xE1208EEC2BB3A501L;
        Class373.field1231[4] = l2 ^ 0xE1208EEC2BB3F83EL;
        Class373.field1231[1] = l2 ^ 0xE1208EEC2BB3A5FFL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

