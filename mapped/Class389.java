/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1757
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2602
 *  net.minecraft.class_2708
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2828$class_5911
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class204;
import mapped.Class246;
import mapped.Class248;
import mapped.Class259;
import mapped.Class278;
import mapped.Class457;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6454;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1757;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2602;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class389
extends Class278 {
    private static long[] field1338;
    class_2708 field1339 = null;
    boolean field1340;
    Class248 field1341 = this.method450(new Class259("Confirm", "Confirm the teleport", new Class246(this.method472() + "-confirm", (int)field1338[0], Class389::method5443)));
    public static boolean $skidonion$998554178;

    private static void method5422() {
        Class5836.method22885();
    }

    private static void method5423(float f2) {
        Class5836.method22907(f2);
    }

    private static void method5424(long l2) {
        Class389.method5437(l2);
    }

    public static class_2708 method5425(Class389 class389) {
        return class389.field1339;
    }

    public static class_746 method5426(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public Class389() {
        super("ChorusControl", "Allows player to control chorus teleports", Class556.field2755);
        this.field1340 = (int)field1338[1];
        Class5723.field11059.method24187((Class246)Class389.method5441(this.field1341));
    }

    private static class_746 method5427(class_310 class_3102) {
        return Class389.method5426(class_3102);
    }

    @Class1
    public void method5428(Class63 b2) {
        class_1799 a2;
        if (b2.method128() != Class543.field2690) {
            return;
        }
        if (!this.field1340 && Class389.field290.field_1724.method_6115() && (a2 = Class389.field290.field_1724.method_5998(Class389.field290.field_1724.method_6058())).method_7909() instanceof class_1757 && a2.method_7935((class_1309)Class389.method5427(field290)) - Class389.field290.field_1724.method_6048() <= (int)field1338[2]) {
            this.field1340 = (int)field1338[2];
        }
        if (((Class246)this.field1341.method507()).field295 && this.field1339 != null) {
            this.field1339.method_11740((class_2602)field290.method_1562());
            Class389.method5436(this, null);
        }
    }

    private static void method5429() {
        Class1503.method14420();
    }

    static {
        ___.___(20, Class389.class);
        ____.___20_120(Class389.class);
    }

    @Class1
    public void method5430(Class59 c2) {
        if (Class389.method5425(this) != null) {
            class_243 a2 = new class_243(this.field1339.method_11734(), this.field1339.method_11735(), Class389.method5431(this).method_11738());
            class_238 b2 = class_1657.field_18135.method_30757(a2);
            Class6009.method23560();
            Class389.method5435(c2.method125(), b2, Class457.method10620().method10615((int)field1338[3]));
            Class6454.method24605(Class389.method5439(c2), b2, 1.0f, Class457.method10620().method10615((int)field1338[4]));
            Class6009.method23561();
        }
    }

    public static class_2708 method5431(Class389 class389) {
        return class389.field1339;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1(priority=999999)
    public void method5432(Class204 a2) {
        int n2 = this.field1339 != null ? 38712 : 38713;
        block4: while (true) {
            switch (n2) {
                case 38713: {
                    n2 = 38711;
                    continue block4;
                }
                case 38712: {
                    Class389.method5442(a2, 0.0);
                    a2.method391(0.0);
                    a2.method389(0.0);
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    @Class1
    public void method5433(Class131 a2) {
        block2: {
            block3: {
                if (this.field1339 == null) break block2;
                if (a2.method251() instanceof class_2828 || a2.method251() instanceof class_2828.class_2830 || a2.method251() instanceof class_2828.class_2831 || a2.method251() instanceof class_2828.class_5911) break block3;
                if (!(a2.method251() instanceof class_2828.class_2829)) break block2;
            }
            a2.method10();
        }
    }

    @Class1
    public void method5434(Class133 b2) {
        class_2596 class_25962 = b2.method251();
        if (!(class_25962 instanceof class_2708)) {
            Class5836.method22897();
            return;
        }
        class_2708 a2 = (class_2708)class_25962;
        if (this.field1340) {
            this.field1339 = a2;
            b2.method10();
        }
    }

    private static void method5435(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    public static void method5436(Class389 class389, class_2708 class_27082) {
        class389.field1339 = class_27082;
    }

    private static void method5437(long l2) {
        Class389.field1338[0] = l2 ^ 0xDF9A3C0D01713A8EL;
        Class389.field1338[1] = l2 ^ 0x2065C3F2FE8EC571L;
        Class389.field1338[3] = l2 ^ 0x2065C3F2FE8EC54DL;
        Class389.field1338[2] = l2 ^ 0x2065C3F2FE8EC570L;
        Class389.field1338[4] = l2 ^ 0x2065C3F2FE8EC515L;
    }

    private static void method5438() {
        Class1807.method15744();
    }

    private static class_4587 method5439(Class59 class59) {
        return class59.method125();
    }

    private static void method5440() {
        Class6454.method24594();
    }

    private static Object method5441(Class248 class248) {
        return class248.method507();
    }

    private static void method5442(Class204 class204, double d2) {
        class204.method386(d2);
    }

    @Override
    public void method1279() {
        if (this.field1339 != null) {
            this.field1339.method_11740((class_2602)Class389.field290.field_1724.field_3944);
            this.field1339 = null;
        }
    }

    private static native void method5443();

    private static void method5444(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static native Object 1(char var0);
}

