/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1471;
import mapped.Class1534;
import mapped.Class490;
import mapped.Class491;
import mapped.Class492;
import mapped.Class493;
import mapped.Class494;
import mapped.Class495;
import mapped.Class496;
import mapped.Class497;
import mapped.Class498;
import mapped.Class499;
import mapped.Class500;
import mapped.Class501;
import mapped.Class502;
import mapped.Class503;
import mapped.Class504;
import mapped.Class505;
import mapped.Class506;
import mapped.Class507;
import mapped.Class508;
import mapped.Class509;
import mapped.Class510;
import mapped.Class511;
import mapped.Class512;
import mapped.Class513;
import mapped.Class514;
import mapped.Class515;
import mapped.Class516;
import mapped.Class517;
import mapped.Class518;
import mapped.Class5659;

public abstract sealed class Class489
extends Enum
permits Class506, Class491, Class490, Class512, Class494, Class510, Class511, Class499, Class492, Class509, Class493, Class505, Class501, Class513, Class517, Class514, Class497, Class508, Class504, Class507, Class500, Class516, Class502, Class498, Class515, Class495, Class496, Class503, Class518 {
    public static final /* enum */ Class489 field2533;
    public static final /* enum */ Class489 field2534;
    public static final /* enum */ Class489 field2535;
    public static final /* enum */ Class489 field2536;
    public static final /* enum */ Class489 field2537;
    private static final Class489[] field2538;
    public static final /* enum */ Class489 field2539;
    public static final /* enum */ Class489 field2540;
    public static final /* enum */ Class489 field2541;
    public static final /* enum */ Class489 field2542;
    public static final /* enum */ Class489 field2543;
    public static final /* enum */ Class489 field2544;
    public static final /* enum */ Class489 field2545;
    public static final /* enum */ Class489 field2546;
    public static final /* enum */ Class489 field2547;
    public static final /* enum */ Class489 field2548;
    public static final /* enum */ Class489 field2549;
    public static final /* enum */ Class489 field2550;
    public static final /* enum */ Class489 field2551;
    public static final /* enum */ Class489 field2552;
    public static final /* enum */ Class489 field2553;
    public static final /* enum */ Class489 field2554;
    public static final /* enum */ Class489 field2555;
    public static final /* enum */ Class489 field2556;
    public static final /* enum */ Class489 field2557;
    public static final /* enum */ Class489 field2558;
    private static long[] field2559;
    public static final /* enum */ Class489 field2560;
    public static final /* enum */ Class489 field2561;
    public static final /* enum */ Class489 field2562;
    public static final /* enum */ Class489 field2563;

    public abstract double method10803(double var1);

    static {
        field2559 = new long[30];
        Class489.method10813(2229096627474089084L);
        field2543 = new Class506();
        field2563 = new Class491();
        field2537 = new Class490();
        field2548 = new Class512();
        field2536 = new Class494();
        field2551 = new Class510();
        field2533 = new Class511();
        field2545 = new Class499();
        field2547 = new Class492();
        field2549 = new Class509();
        field2546 = new Class493();
        field2557 = new Class505();
        field2535 = new Class501();
        field2542 = new Class513();
        field2555 = new Class517();
        field2560 = new Class514();
        field2554 = new Class497();
        field2558 = new Class508();
        field2544 = new Class504();
        field2534 = new Class507();
        field2541 = new Class500();
        field2562 = new Class516();
        field2552 = new Class502();
        field2553 = new Class498();
        field2550 = new Class515();
        field2556 = new Class495();
        field2561 = new Class496();
        field2540 = new Class503();
        field2539 = new Class518();
        field2538 = Class489.method10807();
    }

    private static double method10804(double a2) {
        double b2 = 7.5625;
        double c2 = Class1471.field5576;
        if (a2 < 1.0 / c2) {
            return b2 * a2 * a2;
        }
        if (!(a2 < 2.0 / c2)) {
            return Class5659.method22181(0.43609687107327855, Class1534.field5777, 0.23438366111453024, 0.30873800984646194, 0.0738201504061946, 0.22215717121071854);
        }
        return b2 * (a2 -= 1.5 / c2) * a2 + 0.75;
    }

    public static Class489 method10805(String a2) {
        return Enum.valueOf(Class489.class, a2);
    }

    public static Class489 method10806() {
        return field2548;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class489() {
        void var2_-1;
        void var1_-1;
    }

    private static Class489[] method10807() {
        Class489[] class489Array = new Class489[(int)field2559[22]];
        class489Array[(int)Class489.field2559[4]] = field2543;
        class489Array[(int)Class489.field2559[11]] = Class489.method10808();
        class489Array[(int)Class489.field2559[8]] = field2537;
        class489Array[(int)Class489.field2559[26]] = Class489.method10806();
        class489Array[(int)Class489.field2559[15]] = field2536;
        class489Array[(int)Class489.field2559[23]] = field2551;
        class489Array[(int)Class489.field2559[13]] = field2533;
        class489Array[(int)Class489.field2559[21]] = field2545;
        class489Array[(int)Class489.field2559[18]] = field2547;
        class489Array[(int)Class489.field2559[12]] = field2549;
        class489Array[(int)Class489.field2559[7]] = field2546;
        class489Array[(int)Class489.field2559[20]] = field2557;
        class489Array[(int)Class489.field2559[25]] = field2535;
        class489Array[(int)Class489.field2559[6]] = field2542;
        class489Array[(int)Class489.field2559[3]] = field2555;
        class489Array[(int)Class489.field2559[5]] = field2560;
        class489Array[(int)Class489.field2559[16]] = field2554;
        class489Array[(int)Class489.field2559[24]] = Class489.method10810();
        class489Array[(int)Class489.field2559[0]] = field2544;
        class489Array[(int)Class489.field2559[28]] = field2534;
        class489Array[(int)Class489.field2559[29]] = field2541;
        class489Array[(int)Class489.field2559[1]] = field2562;
        class489Array[(int)Class489.field2559[14]] = field2552;
        class489Array[(int)Class489.field2559[2]] = field2553;
        class489Array[(int)Class489.field2559[19]] = field2550;
        class489Array[(int)Class489.field2559[17]] = Class489.method10809();
        class489Array[(int)Class489.field2559[9]] = field2561;
        class489Array[(int)Class489.field2559[10]] = field2540;
        class489Array[(int)Class489.field2559[27]] = Class489.method10811();
        return class489Array;
    }

    public static Class489 method10808() {
        return field2563;
    }

    public static Class489 method10809() {
        return field2556;
    }

    private static Class489 method10810() {
        return Class489.method10812();
    }

    public static Class489 method10811() {
        return field2539;
    }

    public static Class489 method10812() {
        return field2558;
    }

    private static void method10813(long l2) {
        Class489.field2559[28] = l2 ^ 0x1EEF57928A9D446FL;
        Class489.field2559[27] = l2 ^ 0x1EEF57928A9D4460L;
        Class489.field2559[10] = l2 ^ 0x1EEF57928A9D4467L;
        Class489.field2559[1] = l2 ^ 0x1EEF57928A9D4469L;
        Class489.field2559[3] = l2 ^ 0x1EEF57928A9D4472L;
        Class489.field2559[21] = l2 ^ 0x1EEF57928A9D447BL;
        Class489.field2559[0] = l2 ^ 0x1EEF57928A9D446EL;
        Class489.field2559[18] = l2 ^ 0x1EEF57928A9D4474L;
        Class489.field2559[16] = l2 ^ 0x1EEF57928A9D446CL;
        Class489.field2559[17] = l2 ^ 0x1EEF57928A9D4465L;
        Class489.field2559[12] = l2 ^ 0x1EEF57928A9D4475L;
        Class489.field2559[13] = l2 ^ 0x1EEF57928A9D447AL;
        Class489.field2559[20] = l2 ^ 0x1EEF57928A9D4477L;
        Class489.field2559[8] = l2 ^ 0x1EEF57928A9D447EL;
        Class489.field2559[6] = l2 ^ 0x1EEF57928A9D4471L;
        Class489.field2559[15] = l2 ^ 0x1EEF57928A9D4478L;
        Class489.field2559[11] = l2 ^ 0x1EEF57928A9D447DL;
        Class489.field2559[25] = l2 ^ 0x1EEF57928A9D4470L;
        Class489.field2559[2] = l2 ^ 0x1EEF57928A9D446BL;
        Class489.field2559[5] = l2 ^ 0x1EEF57928A9D4473L;
        Class489.field2559[24] = l2 ^ 0x1EEF57928A9D446DL;
        Class489.field2559[22] = l2 ^ 0x1EEF57928A9D4461L;
        Class489.field2559[14] = l2 ^ 0x1EEF57928A9D446AL;
        Class489.field2559[23] = l2 ^ 0x1EEF57928A9D4479L;
        Class489.field2559[4] = l2 ^ 0x1EEF57928A9D447CL;
        Class489.field2559[29] = l2 ^ 0x1EEF57928A9D4468L;
        Class489.field2559[9] = l2 ^ 0x1EEF57928A9D4466L;
        Class489.field2559[26] = l2 ^ 0x1EEF57928A9D447FL;
        Class489.field2559[19] = l2 ^ 0x1EEF57928A9D4464L;
        Class489.field2559[7] = l2 ^ 0x1EEF57928A9D4476L;
    }

    public static Class489[] values() {
        return field2538;
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

