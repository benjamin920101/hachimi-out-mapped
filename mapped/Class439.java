/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1081;
import mapped.Class1108;
import mapped.Class1371;
import mapped.Class1668;
import mapped.Class1736;
import mapped.Class210;
import mapped.Class219;
import mapped.Class248;
import mapped.Class252;
import mapped.Class260;
import mapped.Class3462;
import mapped.Class3979;
import mapped.Class411;
import mapped.Class4146;
import mapped.Class474;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class587;
import mapped.Class6009;
import mapped.Class889;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class439
extends Class411 {
    Class248 field2183;
    private float field2184;
    Class248 field2185;
    private float field2186;
    private float field2187;
    Class248 field2188;
    Class248 field2189;
    Class248 field2190 = this.method450(new Class260("Yaw", "The mode for the rotation yaw spin ", Class587.field2864, Class587.values()));
    Class248 field2191;
    private static long[] field2192 = new long[3];
    private float field2193;

    public static class_304 method9458(class_315 class_3152) {
        return class_3152.field_1886;
    }

    private static void method9459() {
        Class5659.method22184();
    }

    public Class439() {
        super("AntiAim", "Makes it harder to accurately aim at the player", Class556.field2756, (int)field2192[1]);
        this.field2188 = this.method450(new Class260("Pitch", "The mode for the rotation pitch spin", Class474.field2477, Class474.values()));
        this.field2185 = this.method450(new Class252("YawAdd", "The yaw to add during each rotation", Float.valueOf(-180.0f), Float.valueOf(Class3462.field7581), Float.valueOf(Class889.field3821)));
        this.field2183 = this.method450(new Class252("CustomPitch", "The pitch to add during each rotation", Float.valueOf(-90.0f), Float.valueOf(20.0f), Float.valueOf(90.0f)));
        this.field2191 = this.method450(new Class252("SpinSpeed", "The yaw speed to rotate", Float.valueOf(1.0f), Float.valueOf(16.0f), Float.valueOf(40.0f)));
        this.field2189 = this.method450(new Class252("FlipTicks", "The number of ticks to wait between jitter", (int)field2192[0], (int)field2192[0], (int)field2192[2]));
    }

    private static Object method9460(Class248 class248) {
        return class248.method507();
    }

    @Override
    public void method1274() {
        if (Class439.field290.field_1724 == null) {
            return;
        }
        Class439.method9475(this, Class439.field290.field_1724.method_36454());
        this.field2193 = Class439.field290.field_1724.method_36455();
    }

    private static Object method9461(Class248 class248) {
        return class248.method507();
    }

    private static Object method9462(Class248 class248) {
        return class248.method507();
    }

    static {
        Class439.method9465(-5277338910894286607L);
    }

    private static int method9463(int n2, int n3, Class1736 class1736, Class219 class219) {
        return Class1371.method13972(n2, n3, class1736, class219);
    }

    private static void method9464() {
        Class5659.method22184();
    }

    private static void method9465(long l2) {
        Class439.field2192[0] = l2 ^ 0xB6C3203898CC98F3L;
        Class439.field2192[2] = l2 ^ 0xB6C3203898CC98E5L;
        Class439.field2192[1] = l2 ^ 0xB6C3203898CC98C3L;
    }

    @Class1
    public void method9466(Class210 c2) {
        float f2;
        float f3;
        if (Class439.method9458(Class439.field290.field_1690).method_1434() || Class439.field290.field_1690.field_1904.method_1434()) {
            return;
        }
        switch (((Class587)((Object)this.field2190.method507())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                f3 = Class439.field290.field_1724.method_36454();
                break;
            }
            case 1: {
                f3 = Class439.field290.field_1724.method_36454() + ((Float)this.field2185.method507()).floatValue();
                break;
            }
            case 2: {
                float f4 = this.field2187;
                Class5836.method22890();
                return;
            }
            case 3: {
                float a2 = this.field2184 + ((Float)this.field2191.method507()).floatValue();
                if (a2 > 360.0f) {
                    f3 = a2 - 360.0f;
                    break;
                }
                f3 = a2;
                break;
            }
            case 4: {
                f3 = Class439.method9470(field290).method_36454() + (Class439.field290.field_1724.field_6012 % (Integer)this.field2189.method507() == 0 ? ((Float)Class439.method9460(this.field2185)).floatValue() : -((Float)Class439.method9461(this.field2185)).floatValue());
            }
        }
        this.field2184 = f3;
        switch (((Class474)((Object)Class439.method9462(Class439.method9471(this)))).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                f2 = Class439.field290.field_1724.method_36455();
                break;
            }
            case 1: {
                f2 = ((Float)this.field2183.method507()).floatValue();
                break;
            }
            case 2: {
                f2 = this.field2193;
                break;
            }
            case 3: {
                f2 = -90.0f;
                break;
            }
            case 4: {
                float f5 = 90.0f;
                Class1108.method12918(true);
                return;
            }
            case 5: {
                float b2 = this.field2186 + 30.0f;
                if (b2 > 90.0f) {
                    f2 = -90.0f;
                    break;
                }
                if (b2 < -90.0f) {
                    f2 = Class1081.field4393;
                    break;
                }
                f2 = b2;
                break;
            }
        }
        Class439.method9472(this, f2);
        this.method6465(this.field2184, this.field2186);
    }

    private static void method9467(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method9468() {
        Class4146.method20697();
    }

    private static void method9469() {
        Class4146.method20697();
    }

    public static class_746 method9470(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method9471(Class439 class439) {
        return class439.field2188;
    }

    public static void method9472(Class439 class439, float f2) {
        class439.field2186 = f2;
    }

    private static void method9473(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method9474() {
        Class3979.method19561();
    }

    public static void method9475(Class439 class439, float f2) {
        class439.field2187 = f2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

