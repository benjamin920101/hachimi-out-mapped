/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.MathHelper
 */
package mapped;

import mapped.Class1145;
import mapped.Class1588;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class298;
import mapped.Class4122;
import mapped.Class4265;
import mapped.Class456;
import mapped.Class5672;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class6216;
import mapped.Class632;
import mapped.Class760;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1503 {
    private static long[] field5673 = new long[3];

    public static void method14412(class_2338 a2, class_2350 b2) {
        Class1503.method14418(Class1745.method15658(a2, b2));
    }

    private static void method14413(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static double method14414(float a2, float b2) {
        return ((double)(a2 - b2) % Class4265.field9960 + 270.0) % 180.0 - 90.0;
    }

    public static double method14415(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static float[] method14416(class_243 a2, class_243 b2) {
        double c2 = b2.field_1352 - a2.field_1352;
        double d2 = b2.field_1351 - a2.field_1351;
        double e2 = b2.field_1350 - a2.field_1350;
        double f2 = Math.sqrt(c2 * c2 + e2 * e2);
        float g2 = (float)Math.toDegrees(Math.atan2(e2, c2)) - 90.0f;
        float h2 = (float)(-Math.toDegrees(Math.atan2(d2, f2)));
        float i2 = class_3532.method_15393((float)(g2 - Class4122.field9561.field_1724.method_36454())) + Class4122.field9561.field_1724.method_36454();
        float[] fArray = new float[(int)field5673[2]];
        fArray[(int)Class1503.field5673[1]] = i2;
        fArray[(int)Class1503.field5673[0]] = class_3532.method_15393((float)h2);
        return fArray;
    }

    public static void method14417(float a2, float b2) {
        Class5723.field11049.method12005(a2, b2);
    }

    public static void method14418(class_243 a2) {
        float[] b2 = Class1503.method14431(a2);
        Class1503.method14417(b2[(int)field5673[1]], b2[(int)field5673[0]]);
    }

    private static void method14419(long l2) {
        Class1503.field5673[0] = l2 ^ 0xE56916607F99AFCDL;
        Class1503.field5673[2] = l2 ^ 0xE56916607F99AFCEL;
        Class1503.field5673[1] = l2 ^ 0xE56916607F99AFCCL;
    }

    public static void method14420() {
        if (Class456.method10602().method10610() != Class632.field3088) {
            Class1807.method15744();
            return;
        }
        Class1503.method14427(Class5723.field11049);
    }

    static {
        Class1503.method14419(-1915975562755985460L);
    }

    public static float method14421(class_243 a2) {
        class_243 b2 = Class4122.field9561.field_1724.method_33571();
        double c2 = Class1503.method14423(a2) - Class1503.method14422(b2);
        double d2 = Class1503.method14424(a2) - b2.field_1350;
        float e2 = (float)Math.toDegrees(Math.atan2(d2, c2)) - 90.0f;
        return class_3532.method_15393((float)e2);
    }

    public static double method14422(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static double method14423(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public static double method14424(class_243 class_2432) {
        return class_2432.field_1350;
    }

    public static double method14425(class_243 class_2432) {
        return class_2432.field_1350;
    }

    public static double method14426(float a2, float b2) {
        return ((double)(a2 - b2) % 360.0 + 540.0) % 360.0 - Class6216.field12667;
    }

    private static void method14427(Class760 class760) {
        class760.method12049();
    }

    private static void method14428() {
        Class298.method1924();
    }

    public static float method14429(class_243 a2) {
        class_243 b2 = Class4122.field9561.field_1724.method_33571();
        double c2 = a2.field_1352 - Class1503.method14415(b2);
        double d2 = a2.field_1351 - b2.field_1351;
        double e2 = a2.field_1350 - Class1503.method14425(b2);
        double f2 = Math.sqrt(c2 * c2 + e2 * e2);
        float g2 = (float)(-Math.toDegrees(Math.atan2(d2, f2)));
        return class_3532.method_15393((float)g2);
    }

    public static float[] method14430(float[] a2, float[] b2, float c2) {
        float d2 = (1.0f - class_3532.method_15363((float)(c2 / 100.0f), (float)Class1145.field4592, (float)Class5672.field10880)) * 10.0f;
        float[] e2 = new float[(int)field5673[2]];
        e2[(int)Class1503.field5673[1]] = b2[(int)field5673[1]] + (float)(-Class1503.method14426(b2[(int)field5673[1]], a2[(int)field5673[1]]) / (double)d2);
        e2[(int)Class1503.field5673[0]] = b2[(int)field5673[0]] + -(b2[(int)field5673[0]] - a2[(int)field5673[0]]) / d2;
        e2[(int)Class1503.field5673[0]] = class_3532.method_15363((float)e2[(int)field5673[0]], (float)-90.0f, (float)Class1588.field5936);
        return e2;
    }

    public static float[] method14431(class_243 a2) {
        return Class1503.method14416(Class4122.field9561.field_1724.method_33571(), a2);
    }

    public static class_243 method14432(float a2, float b2) {
        float c2 = a2 * ((float)Math.PI / 180);
        float d2 = -b2 * ((float)Math.PI / 180);
        float e2 = class_3532.method_15362((float)d2);
        float f2 = class_3532.method_15374((float)d2);
        float g2 = class_3532.method_15362((float)c2);
        float h2 = class_3532.method_15374((float)c2);
        return new class_243((double)(f2 * g2), (double)(-h2), (double)(e2 * g2));
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

