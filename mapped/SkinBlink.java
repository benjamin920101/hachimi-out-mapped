/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerModelPart
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 */
package mapped;

import java.util.Set;
import mapped.Class1;
import mapped.Class1038;
import mapped.Class1503;
import mapped.Class1772;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class4036;
import mapped.Class543;
import mapped.Class556;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class925;
import mapped.Class926;
import net.hachimi.client.mixin.d;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SkinBlink
extends Class278 {
    Class248 field707;
    private static long[] field708 = new long[2];
    Class248 field709;
    private Set field710;
    private final Class925 field711 = new Class926();

    private static void method2543(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    static {
        SkinBlink.method2544(763678513555988045L);
    }

    @Override
    public void method1279() {
        if (this.field710 == null || SkinBlink.method2550(field290) == null) {
            return;
        }
        class_1664[] class_1664Array = class_1664.values();
        int n2 = class_1664Array.length;
        for (int i2 = (int)field708[0]; i2 < n2; ++i2) {
            class_1664 a2 = class_1664Array[i2];
            SkinBlink.field290.field_1690.method_1631(a2, this.field710.contains(a2));
        }
    }

    private static void method2544(long l2) {
        SkinBlink.method2547(l2);
    }

    public SkinBlink() {
        super("SkinBlink", "Toggles the skin model rendering", Class556.field2756);
        this.field709 = this.method450(new Class252("Speed", "The speed to toggle the player model parts", Float.valueOf(0.0f), Float.valueOf(0.1f), Float.valueOf(Class1772.field6640)));
        this.field707 = this.method450(new Class253("Random", "Randomizes the toggling of each skin model part", (boolean)field708[0]));
    }

    private static void method2545() {
        Class1807.method15744();
    }

    @Override
    public void method1274() {
        if (SkinBlink.field290.field_1690 == null) {
            return;
        }
        SkinBlink.method2551(this, ((d)SkinBlink.field290.field_1690).getPlayerModelParts());
    }

    private static void method2546(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method2547(long l2) {
        SkinBlink.field708[1] = l2 ^ 0xA99218FDB1A5E4CL;
        SkinBlink.field708[0] = l2 ^ 0xA99218FDB1A5E4DL;
    }

    public static Class925 method2548(SkinBlink class312) {
        return class312.field711;
    }

    public static void method2549(SkinBlink class312, Set set) {
        class312.field710 = set;
    }

    public static class_315 method2550(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method2551(SkinBlink class312, Set set) {
        SkinBlink.method2549(class312, set);
    }

    @Class1
    public void method2552(Class63 c2) {
        if (c2.method128() == Class543.field2691) {
            if (!SkinBlink.method2548(this).method12595(Float.valueOf(((Float)this.field709.method507()).floatValue() * Class1038.field4266))) {
                SkinBlink.method2553(0.5469768f, 0.5654698f);
                return;
            }
            Set b2 = ((d)SkinBlink.field290.field_1690).getPlayerModelParts();
            class_1664[] class_1664Array = class_1664.values();
            int n2 = class_1664Array.length;
            for (int i2 = (int)field708[0]; i2 < n2; ++i2) {
                class_1664 a2 = class_1664Array[i2];
                SkinBlink.field290.field_1690.method_1631(a2, (((Boolean)this.field707.method507()).booleanValue() ? (Math.random() < 0.5 ? (int)field708[1] : (int)field708[0]) : (!b2.contains(a2) ? (int)field708[1] : (int)field708[0])) != 0);
            }
            this.field711.method12593();
        }
    }

    private static void method2553(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

