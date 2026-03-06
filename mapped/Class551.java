/*
 * Decompiled with CFR 0.152.
 */
package mapped;

public final class Class551
extends Enum {
    public static final /* enum */ Class551 field2728;
    public static final /* enum */ Class551 field2729;
    private static long[] field2730;
    private static final Class551[] field2731;

    public static Class551[] values() {
        return field2731;
    }

    private static void method11016(long l2) {
        Class551.field2730[1] = l2 ^ 0xADFB4D26C1984A31L;
        Class551.field2730[2] = l2 ^ 0xADFB4D26C1984A30L;
        Class551.field2730[0] = l2 ^ 0xADFB4D26C1984A33L;
    }

    static {
        field2730 = new long[3];
        Class551.method11016(-5910045257141564879L);
        field2728 = new Class551("UP", (int)field2730[1]);
        field2729 = new Class551("DOWN", (int)field2730[2]);
        field2731 = Class551.method11017();
    }

    private static Class551[] method11017() {
        Class551[] class551Array = new Class551[(int)field2730[0]];
        class551Array[(int)Class551.field2730[1]] = field2728;
        class551Array[(int)Class551.field2730[2]] = field2729;
        return class551Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class551() {
        void var2_-1;
        void var1_-1;
    }

    public static Class551 method11018(String a2) {
        return Enum.valueOf(Class551.class, a2);
    }
}

