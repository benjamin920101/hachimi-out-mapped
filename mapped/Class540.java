/*
 * Decompiled with CFR 0.152.
 */
package mapped;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class540
extends Enum {
    private static final Class540[] field2672;
    public static final /* enum */ Class540 field2673;
    private static long[] field2674;
    public static final /* enum */ Class540 field2675;
    public static final /* enum */ Class540 field2676;
    public static final /* enum */ Class540 field2677;

    private static void method10968(long l2) {
        Class540.field2674[4] = l2 ^ 0x3B96524DAD26289DL;
        Class540.field2674[1] = l2 ^ 0x3B96524DAD26289EL;
        Class540.field2674[2] = l2 ^ 0x3B96524DAD26289CL;
        Class540.field2674[0] = l2 ^ 0x3B96524DAD26289FL;
        Class540.field2674[3] = l2 ^ 0x3B96524DAD262898L;
    }

    private static Class540[] method10969() {
        Class540[] class540Array = new Class540[(int)field2674[3]];
        class540Array[(int)Class540.field2674[2]] = field2677;
        class540Array[(int)Class540.field2674[4]] = field2673;
        class540Array[(int)Class540.field2674[1]] = field2676;
        class540Array[(int)Class540.field2674[0]] = Class540.method10971();
        return class540Array;
    }

    public static Class540 method10970(String a2) {
        return Enum.valueOf(Class540.class, a2);
    }

    public static Class540 method10971() {
        return field2675;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class540() {
        void var2_-1;
        void var1_-1;
    }

    public static Class540[] values() {
        return field2672;
    }

    static {
        field2674 = new long[5];
        Class540.method10968(4293709788315265180L);
        field2677 = new Class540("FAST", (int)field2674[2]);
        field2673 = new Class540("HIDE", (int)field2674[4]);
        field2676 = new Class540("REMOVE", (int)field2674[1]);
        field2675 = new Class540("OFF", (int)field2674[0]);
        field2672 = Class540.method10969();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

