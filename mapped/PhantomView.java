/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 */
package mapped;

import mapped.Class1;
import mapped.Class1437;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3511;
import mapped.Class3535;
import mapped.Class3546;
import mapped.Class3833;
import mapped.Class44;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6023;
import mapped.Class6454;
import mapped.Class72;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PhantomView
extends Class278 {
    double field1373;
    double field1374;
    private static PhantomView INSTANCE;
    Class248 field1375;
    Class248 field1376;
    double field1377;
    double field1378;
    double field1379;
    Class248 field1380;
    double field1381;
    Class248 field1382 = this.method450(new Class252("Distance", "The third-person camera clip distance", Float.valueOf(1.0f), Float.valueOf(3.5f), Float.valueOf(20.0f)));
    private static long[] field1383;

    private static Object method5732(Class248 class248) {
        return class248.method507();
    }

    private static void method5733() {
        Class5836.method22890();
    }

    public PhantomView() {
        super("PhantomView", "Clips your third-person camera through blocks", Class556.field2759);
        this.field1376 = this.method450(new Class253("Dynamic", "Make your camera move smoothly", (boolean)field1383[0]));
        this.field1380 = this.method450(new Class252("Speed", "Motion speed", Float.valueOf(0.0f), Float.valueOf(0.81f), Float.valueOf(1.0f)));
        this.field1375 = this.method450(new Class252("ThirdSpeed", "Motion speed for third-person", Float.valueOf(0.0f), Float.valueOf(0.4f), Float.valueOf(1.0f)));
        INSTANCE = this;
    }

    @Override
    public void method1274() {
        if (PhantomView.field290.field_1724 == null) {
            return;
        }
        this.field1373 = PhantomView.field290.field_1724.method_23317();
        this.field1381 = PhantomView.field290.field_1724.method_23320();
        this.field1379 = PhantomView.field290.field_1724.method_23321();
        PhantomView.method5746(this, this.field1373);
        this.field1377 = this.field1381;
        PhantomView.method5748(this, this.field1379);
    }

    public double method5734() {
        return Class6023.method23738(this.field1378, this.field1379, field290.method_60646().method_60637((boolean)field1383[1]));
    }

    private static int method5735(int n2, int n3, Class3546 class3546, Class3833 class3833) {
        return Class1437.method14200(n2, n3, class3546, class3833);
    }

    @Class1
    public void method5736(Class72 a2) {
        a2.method10();
        PhantomView.method5744(a2, ((Float)PhantomView.method5732(this.field1382)).floatValue());
    }

    public static double method5737(double a2, double b2, double c2) {
        if (c2 >= 1.0) {
            return b2;
        }
        if (c2 == 0.0) {
            return a2;
        }
        int d2 = b2 > a2 ? (int)field1383[1] : (int)field1383[0];
        double e2 = Math.max(b2, a2) - Math.min(b2, a2);
        double f2 = e2 * c2;
        return a2 + (d2 != 0 ? f2 : -f2);
    }

    private static int method5738(int n2, int n3, Class3535 class3535, Class3511 class3511) {
        return Class1437.method14199(n2, n3, class3535, class3511);
    }

    public static class_315 method5739(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public static double method5740(PhantomView class396) {
        return class396.field1379;
    }

    public double method5741() {
        return Class6023.method23738(PhantomView.method5752(this), PhantomView.method5762(this), field290.method_60646().method_60637((boolean)field1383[1]));
    }

    public static Class248 method5742(PhantomView class396) {
        return class396.field1376;
    }

    private static Object method5743(Class248 class248) {
        return class248.method507();
    }

    private static void method5744(Class72 class72, float f2) {
        class72.method148(f2);
    }

    private static double method5745(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    public static void method5746(PhantomView class396, double d2) {
        class396.field1374 = d2;
    }

    private static void method5747() {
        Class6454.method24594();
    }

    public static void method5748(PhantomView class396, double d2) {
        class396.field1378 = d2;
    }

    @Class1
    public void method5749(Class210 a2) {
        if (!((Boolean)PhantomView.method5751(PhantomView.method5742(this))).booleanValue()) {
            return;
        }
        this.field1374 = this.field1373;
        this.field1377 = this.field1381;
        PhantomView.method5754(this, PhantomView.method5740(this));
        double b2 = (PhantomView.method5759(field290).method_31044().method_31034() ? (Float)this.field1380.method507() : (Float)this.field1375.method507()).floatValue();
        this.field1373 = PhantomView.method5737(this.field1373, PhantomView.field290.field_1724.method_23317(), b2);
        this.field1381 = PhantomView.method5737(this.field1381, PhantomView.field290.field_1724.method_23320(), b2);
        this.field1379 = PhantomView.method5737(this.field1379, PhantomView.field290.field_1724.method_23321(), b2);
    }

    public static PhantomView method5750() {
        return INSTANCE;
    }

    private static Object method5751(Class248 class248) {
        return class248.method507();
    }

    public static double method5752(PhantomView class396) {
        return class396.field1374;
    }

    public double method5753() {
        return PhantomView.method5745(this.field1377, this.field1381, field290.method_60646().method_60637((boolean)field1383[1]));
    }

    static {
        field1383 = new long[2];
        PhantomView.method5755(6245001628648447190L);
    }

    public static void method5754(PhantomView class396, double d2) {
        class396.field1378 = d2;
    }

    private static void method5755(long l2) {
        PhantomView.field1383[1] = l2 ^ 0x56AAB3E4D1539CD7L;
        PhantomView.field1383[0] = l2 ^ 0x56AAB3E4D1539CD6L;
    }

    private static void method5756(Class44 class44, class_243 class_2432) {
        class44.method89(class_2432);
    }

    private static double method5757(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    @Class1
    public void method5758(Class44 a2) {
        if (!((Boolean)this.field1376.method507()).booleanValue()) {
            return;
        }
        double b2 = (PhantomView.method5739(field290).method_31044().method_31034() ? (Float)PhantomView.method5743(this.field1380) : (Float)this.field1375.method507()).floatValue();
        if (b2 == 1.0) {
            return;
        }
        PhantomView.method5756(a2, new class_243(this.method5741(), this.method5753(), this.method5734()));
    }

    public static class_315 method5759(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static double method5760(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    private static void method5761(float f2) {
        Class5836.method22907(f2);
    }

    public static double method5762(PhantomView class396) {
        return class396.field1373;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

