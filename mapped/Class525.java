/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.Comparator;
import mapped.Class1503;
import mapped.Class221;
import mapped.Class287;
import mapped.Class4045;
import mapped.Class4122;
import mapped.Class4222;
import mapped.Class5467;
import mapped.Class548;
import mapped.Class5550;
import mapped.Class5659;
import mapped.Class5843;
import mapped.Class701;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class525
extends Enum
implements Comparator {
    public static final /* enum */ Class525 field2598;
    public static final /* enum */ Class525 field2599;
    private static final Class525[] field2600;
    public static final /* enum */ Class525 field2601;
    public static final /* enum */ Class525 field2602;
    private static long[] field2603;
    private final Comparator field2604;
    public static final /* enum */ Class525 field2605;

    private static int method10879(int n2, int n3, Class548 class548, Class701 class701) {
        return Class5467.method21226(n2, n3, class548, class701);
    }

    private static Class525[] method10880() {
        Class525[] class525Array = new Class525[(int)field2603[6]];
        class525Array[(int)Class525.field2603[0]] = field2599;
        class525Array[(int)Class525.field2603[1]] = field2598;
        class525Array[(int)Class525.field2603[3]] = field2601;
        class525Array[(int)Class525.field2603[5]] = field2602;
        class525Array[(int)Class525.field2603[4]] = Class525.method10899();
        return class525Array;
    }

    private static int method10881(int n2) {
        return Class4045.method20095(n2);
    }

    private static float method10882(class_243 class_2432) {
        return Class1503.method14429(class_2432);
    }

    private static int method10883(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    public static Class525[] values() {
        return field2600;
    }

    private static int method10884(int n2) {
        return Class4045.method20105(n2);
    }

    private static int method10885(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method10886(int n2) {
        return Class287.method1495(n2);
    }

    public int method10887(class_1297 a2, class_1297 b2) {
        return this.field2604.compare(a2, b2);
    }

    public static class_746 method10888(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method10889(class_1297 a2, class_1297 b2) {
        return Class525.method10908(b2, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int method10890(class_1297 a2, class_1297 b2) {
        boolean c2 = a2 instanceof class_1309;
        boolean d2 = b2 instanceof class_1309;
        if (!c2) {
            return Class525.method10885(0.57349926f, Class4222.field9895);
        }
        int n2 = 52170;
        block8: while (true) {
            switch (n2) {
                case 52170: {
                    n2 = 52168;
                    continue block8;
                }
                case 52169: {
                    int n3 = d2 ? 47847 : 47846;
                    if (n3 == 47846) return (int)field2603[0];
                    return Class5659.method22205(0.96407276f, 0.5558237f);
                }
            }
            break;
        }
        if (c2) {
            if (!d2) return (int)field2603[1];
        }
        if (!c2) {
            return Class4045.method20105(1494097143);
        }
        int n4 = 26746;
        block9: while (true) {
            switch (n4) {
                case 26746: {
                    n4 = 26744;
                    continue block9;
                }
                case 26745: {
                    return (int)field2603[2];
                }
            }
            break;
        }
        return Float.compare(((class_1309)a2).method_6032(), ((class_1309)b2).method_6032());
    }

    public static Class525 method10891(String a2) {
        return Enum.valueOf(Class525.class, a2);
    }

    public static class_746 method10892(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static double method10893(class_1297 class_12972) {
        return Class5659.method22201(class_12972);
    }

    static {
        field2603 = new long[7];
        Class525.method10906(1025480248431835441L);
        field2599 = new Class525("LowestDistance", (int)field2603[0], Comparator.comparingDouble(Class5659::method22201));
        field2598 = new Class525("HighestDistance", (int)field2603[1], Class525::method10896);
        field2601 = new Class525("LowestHealth", (int)field2603[3], Class525::method10890);
        field2602 = new Class525("HighestHealth", (int)field2603[5], Class525::method10889);
        field2605 = new Class525("ClosestAngle", (int)field2603[4], Class525::method10904);
        field2600 = Class525.method10880();
    }

    private static int method10894() {
        return Class5659.method22101();
    }

    private static int method10895(int n2) {
        return Class4045.method20096(n2);
    }

    private static int method10896(class_1297 a2, class_1297 b2) {
        return Double.compare(Class525.method10912(b2), Class525.method10893(a2));
    }

    private static int method10897(int n2) {
        return Class287.method1495(n2);
    }

    private static int method10898() {
        return Class5550.method21885();
    }

    private static Class525 method10899() {
        return Class525.method10909();
    }

    private static int method10900(int n2) {
        return Class4045.method20096(n2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class525() {
        void a2;
        void var2_-1;
        void var1_-1;
        this.field2604 = a2;
    }

    private static int method10901(int n2) {
        return Class4045.method20096(n2);
    }

    private static class_746 method10902(class_310 class_3102) {
        return Class525.method10892(class_3102);
    }

    public static class_310 method10903() {
        return Class4122.field9561;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static int method10904(class_1297 a2, class_1297 b2) {
        boolean c2 = a2 instanceof class_1309;
        boolean d2 = b2 instanceof class_1309;
        if (!c2 && !d2) {
            return (int)field2603[0];
        }
        if (c2) {
            int n2;
            if (d2) {
                return Class4045.method20100(1605700149, 0.6070168f);
            }
            int n3 = 9381;
            boolean bl2 = true;
            do {
                if (!bl2 || (bl2 = false) || !true) {
                    n3 = n2 = 9380;
                }
                if (n2 != 9381) continue;
                return (int)field2603[1];
            } while (n2 == 9382);
        }
        if (!c2) {
            return (int)field2603[2];
        }
        double e2 = class_3532.method_15356((float)Class525.method10910(a2.method_33571()), (float)Class525.method10888(Class525.method10915()).method_36454());
        double f2 = class_3532.method_15356((float)Class1503.method14421(b2.method_33571()), (float)Class525.method10902(Class4122.field9561).method_36454());
        double g2 = Math.abs(Class525.method10882(a2.method_33571()) - Class4122.field9561.field_1724.method_36455());
        double h2 = Math.abs(Class1503.method14429(b2.method_33571()) - Class4122.field9561.field_1724.method_36455());
        return Double.compare(e2 * e2 + g2 * g2, f2 * f2 + h2 * h2);
    }

    private static int method10905(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static void method10906(long l2) {
        Class525.field2603[2] = l2 ^ 0xF1C4C325B40A86CEL;
        Class525.field2603[1] = l2 ^ 0xE3B3CDA4BF57930L;
        Class525.field2603[4] = l2 ^ 0xE3B3CDA4BF57935L;
        Class525.field2603[6] = l2 ^ 0xE3B3CDA4BF57934L;
        Class525.field2603[3] = l2 ^ 0xE3B3CDA4BF57933L;
        Class525.field2603[5] = l2 ^ 0xE3B3CDA4BF57932L;
        Class525.field2603[0] = l2 ^ 0xE3B3CDA4BF57931L;
    }

    private static int method10907(int n2, int n3, Class221 class221, Class5843 class5843) {
        return Class5467.method21212(n2, n3, class221, class5843);
    }

    private static int method10908(class_1297 class_12972, class_1297 class_12973) {
        return Class525.method10890(class_12972, class_12973);
    }

    public static Class525 method10909() {
        return field2605;
    }

    private static float method10910(class_243 class_2432) {
        return Class1503.method14421(class_2432);
    }

    private static int method10911(int n2) {
        return Class4045.method20103(n2);
    }

    private static double method10912(class_1297 class_12972) {
        return Class5659.method22201(class_12972);
    }

    public int compare(Object object, Object object2) {
        return this.method10887((class_1297)object, (class_1297)object2);
    }

    private static int method10913(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method10914() {
        return Class5550.method21885();
    }

    private static class_310 method10915() {
        return Class525.method10903();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

