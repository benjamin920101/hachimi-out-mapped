/*
 * Decompiled with CFR 0.152.
 */
package mapped;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class474
extends Enum {
    public static final /* enum */ Class474 field2473;
    public static final /* enum */ Class474 field2474;
    public static final /* enum */ Class474 field2475;
    public static final /* enum */ Class474 field2476;
    public static final /* enum */ Class474 field2477;
    public static final /* enum */ Class474 field2478;
    private static final Class474[] field2479;
    private static long[] field2480;

    public static Class474[] values() {
        return field2479;
    }

    private static Class474[] method10741() {
        Class474[] class474Array = new Class474[(int)field2480[0]];
        class474Array[(int)Class474.field2480[3]] = field2475;
        class474Array[(int)Class474.field2480[1]] = field2474;
        class474Array[(int)Class474.field2480[5]] = field2476;
        class474Array[(int)Class474.field2480[2]] = field2473;
        class474Array[(int)Class474.field2480[6]] = field2477;
        class474Array[(int)Class474.field2480[4]] = Class474.method10743();
        return class474Array;
    }

    private static void method10742(long l2) {
        Class474.field2480[3] = l2 ^ 0x89F6178DF0BC4F31L;
        Class474.field2480[4] = l2 ^ 0x89F6178DF0BC4F34L;
        Class474.field2480[2] = l2 ^ 0x89F6178DF0BC4F32L;
        Class474.field2480[6] = l2 ^ 0x89F6178DF0BC4F35L;
        Class474.field2480[5] = l2 ^ 0x89F6178DF0BC4F33L;
        Class474.field2480[0] = l2 ^ 0x89F6178DF0BC4F37L;
        Class474.field2480[1] = l2 ^ 0x89F6178DF0BC4F30L;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class474() {
        void var2_-1;
        void var1_-1;
    }

    public static Class474 method10743() {
        return field2478;
    }

    static {
        field2480 = new long[7];
        Class474.method10742(-8505584947845902543L);
        field2475 = new Class474("OFF", (int)field2480[3]);
        field2474 = new Class474("STATIC", (int)field2480[1]);
        field2476 = new Class474("ZERO", (int)field2480[5]);
        field2473 = new Class474("UP", (int)field2480[2]);
        field2477 = new Class474("DOWN", (int)field2480[6]);
        field2478 = new Class474("JITTER", (int)field2480[4]);
        field2479 = Class474.method10741();
    }

    public static Class474 method10744(String a2) {
        return Enum.valueOf(Class474.class, a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

