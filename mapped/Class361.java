/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1503;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3531;
import mapped.Class3659;
import mapped.Class3812;
import mapped.Class4146;
import mapped.Class480;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class597;
import mapped.Class6009;
import mapped.Class607;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class361
extends Class278 {
    Class248 field1160 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class361.method4622()));
    Class248 field1161 = this.method450(new Class253("Rotate", "Rotate before placing", (boolean)field1162[0]));
    private static long[] field1162 = new long[3];

    private static int method4621(int n2, int n3, Class597 class597, Class3531 class3531) {
        return Class3659.method17993(n2, n3, class597, class3531);
    }

    private static Class607[] method4622() {
        return Class607.values();
    }

    private static void method4623() {
        Class6009.method23560();
    }

    public static class_746 method4624(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Override
    protected void method1274() {
        Class3812 d2;
        if (Class361.field290.field_1724 != null && (d2 = new Class3812(class_1802.field_8281, (Class607)((Object)this.field1160.method507())).method18502()).method18523()) {
            int c2 = Class5723.field11058.method18969();
            if (((Boolean)Class361.method4633(this).method507()).booleanValue()) {
                Class1503.method14417(Class361.field290.field_1724.method_36454(), 90.0f);
            }
            d2.method18531(c2);
            for (int b2 = (int)field1162[2]; b2 < (int)field1162[1]; ++b2) {
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(Class361.method4626(field290).method_23317(), Class361.field290.field_1724.method_23318() + 0.41999998688698, Class361.field290.field_1724.method_23321(), (boolean)field1162[0]));
                Class5723.field11048.method21341((class_2596)new class_2828.class_2829(Class361.method4629(field290).method_23317(), Class361.field290.field_1724.method_23318() + 0.7531999805212, Class361.field290.field_1724.method_23321(), (boolean)field1162[0]));
                Class361.method4634(Class5723.field11048, (class_2596)new class_2828.class_2829(Class361.field290.field_1724.method_23317(), Class361.field290.field_1724.method_23318() + 1.0, Class361.field290.field_1724.method_23321(), (boolean)field1162[0]));
                Class361.method4624(field290).method_33574(Class361.field290.field_1724.method_19538().method_1031(0.0, 1.0, 0.0));
                class_2338 a2 = Class361.field290.field_1724.method_24515().method_10074();
                field290.method_1562().method_52787((class_2596)new class_2885(Class361.method4631(), new class_3965(a2.method_61082(), class_2350.field_11036, a2.method_10074(), (boolean)field1162[2]), (int)field1162[2]));
                Class361.method4628().method10782(class_1268.field_5808);
            }
            d2.method18534(c2);
            Class1503.method14420();
        }
        this.method1268();
    }

    private static void method4625() {
        Class6009.method23560();
    }

    public static class_746 method4626(class_310 class_3102) {
        return class_3102.field_1724;
    }

    static {
        Class361.method4632(515212000712245797L);
    }

    public static class_1268 method4627() {
        return class_1268.field_5808;
    }

    public static Class480 method4628() {
        return Class1745.field6549;
    }

    public static class_746 method4629(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4630() {
        Class4146.method20694();
    }

    private static class_1268 method4631() {
        return Class361.method4627();
    }

    private static void method4632(long l2) {
        Class361.field1162[2] = l2 ^ 0x7266695BE78C225L;
        Class361.field1162[0] = l2 ^ 0x7266695BE78C224L;
        Class361.field1162[1] = l2 ^ 0x7266695BE78C220L;
    }

    public static Class248 method4633(Class361 class361) {
        return class361.field1161;
    }

    private static void method4634(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    public Class361() {
        super("PenisBuilder", "Build a pillar in an instant", Class556.field2756);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

