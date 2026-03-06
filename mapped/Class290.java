/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_761
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class126;
import mapped.Class127;
import mapped.Class128;
import mapped.Class248;
import mapped.Class251;
import mapped.Class253;
import mapped.Class278;
import mapped.Class543;
import mapped.Class556;
import mapped.Class68;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_761;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class290
extends Class278 {
    Class248 field494;
    private static Class290 INSTANCE;
    Class248 field495;
    Class248 field496 = this.method450(new Class253("Grass", "Colors the grass", (boolean)field499[1]));
    Class248 field497;
    Class248 field498 = this.method450(new Class251("GrassColor", "The color of the grass", Color.RED, (boolean)field499[1], (boolean)field499[0], this::method1269));
    private static long[] field499;
    Class248 field500;

    @Override
    public void method1274() {
        if (Class290.field290.field_1687 == null) {
            return;
        }
        Class290.field290.field_1769.method_3279();
    }

    private static void method1673(long l2) {
        Class290.field499[1] = l2 ^ 0xE0B9698C97A85E09L;
        Class290.field499[0] = l2 ^ 0xE0B9698C97A85E08L;
    }

    @Class1
    public void method1674(Class68 a2) {
        if (Class290.field290.field_1687 != null && a2.method140().method502() == this) {
            if (a2.method128() == Class543.field2691) {
                Class290.method1682(field290).method_3279();
            }
        }
    }

    @Override
    public void method1279() {
        if (Class290.method1677(field290) == null) {
            return;
        }
        Class290.field290.field_1769.method_3279();
    }

    public Class290() {
        super("Ambience", "Changes rendering of world", Class556.field2759);
        this.field494 = this.method450(new Class253("Foliage", "Colors the foliage", (boolean)field499[1]));
        this.field500 = this.method450(new Class251("FoliageColor", "The color of the foliage", Color.RED, (boolean)field499[1], (boolean)field499[0], this::method1278));
        this.field497 = this.method450(new Class253("Water", "Colors the water", (boolean)field499[1]));
        this.field495 = this.method450(new Class251("WaterColor", "The color of the water", Color.RED, (boolean)field499[1], (boolean)field499[0], this::method1679));
        INSTANCE = this;
    }

    private static Object method1675(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method1676(Class126 a2) {
        if (((Boolean)this.field496.method507()).booleanValue()) {
            a2.method10();
            a2.method235((Color)this.field498.method507());
        }
    }

    public static class_638 method1677(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method1678(long l2) {
        Class290.method1673(l2);
    }

    private Boolean method1679() {
        return (Boolean)this.field497.method507();
    }

    @Class1
    public void method1680(Class127 a2) {
        if (((Boolean)this.field494.method507()).booleanValue()) {
            a2.method10();
            a2.method235((Color)this.field500.method507());
        }
    }

    @Class1
    public void method1681(Class128 a2) {
        if (((Boolean)Class290.method1675(this.field497)).booleanValue()) {
            a2.method10();
            a2.method235((Color)this.field495.method507());
        }
    }

    private Boolean method1278() {
        return (Boolean)this.field494.method507();
    }

    public static class_761 method1682(class_310 class_3102) {
        return class_3102.field_1769;
    }

    public static Class290 method1683() {
        return INSTANCE;
    }

    static {
        field499 = new long[2];
        Class290.method1678(-2253654085961490935L);
    }

    private Boolean method1269() {
        return (Boolean)this.field496.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

