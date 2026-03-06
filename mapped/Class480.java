/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 */
package mapped;

import mapped.Class481;
import mapped.Class482;
import mapped.Class483;
import mapped.Class484;
import net.minecraft.util.Hand;

public abstract sealed class Class480
extends Enum
permits Class483, Class482, Class481, Class484 {
    public static final /* enum */ Class480 field2506;
    public static final /* enum */ Class480 field2507;
    private static long[] field2508;
    public static final /* enum */ Class480 field2509;
    private static final Class480[] field2510;
    public static final /* enum */ Class480 field2511;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class480() {
        void var2_-1;
        void var1_-1;
    }

    public static Class480 method10781(String a2) {
        return Enum.valueOf(Class480.class, a2);
    }

    static {
        field2508 = new long[5];
        Class480.method10784(-4144545871767655307L);
        field2509 = new Class483();
        field2511 = new Class482();
        field2507 = new Class481();
        field2506 = new Class484();
        field2510 = Class480.method10783();
    }

    public abstract void method10782(class_1268 var1);

    private static Class480[] method10783() {
        Class480[] class480Array = new Class480[(int)field2508[4]];
        class480Array[(int)Class480.field2508[1]] = field2509;
        class480Array[(int)Class480.field2508[2]] = field2511;
        class480Array[(int)Class480.field2508[3]] = field2507;
        class480Array[(int)Class480.field2508[0]] = field2506;
        return class480Array;
    }

    private static void method10784(long l2) {
        Class480.field2508[2] = l2 ^ 0xC67B9D7D05FA2C74L;
        Class480.field2508[0] = l2 ^ 0xC67B9D7D05FA2C76L;
        Class480.field2508[3] = l2 ^ 0xC67B9D7D05FA2C77L;
        Class480.field2508[4] = l2 ^ 0xC67B9D7D05FA2C71L;
        Class480.field2508[1] = l2 ^ 0xC67B9D7D05FA2C75L;
    }

    public static Class480[] values() {
        return field2510;
    }
}

