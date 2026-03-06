/*
 * Decompiled with CFR 0.152.
 */
package mapped;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class545
extends Enum {
    private static final Class545[] field2698;
    public static final /* enum */ Class545 field2699;
    public static final /* enum */ Class545 field2700;
    public static final /* enum */ Class545 field2701;
    private static long[] field2702;

    static {
        field2702 = new long[4];
        Class545.method10989(-8683678189533856363L);
        field2699 = new Class545("CLEAR", (int)field2702[0]);
        field2701 = new Class545("LIQUID_VISION", (int)field2702[2]);
        field2700 = new Class545("OFF", (int)field2702[3]);
        field2698 = Class545.method10990();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class545() {
        void var2_-1;
        void var1_-1;
    }

    private static void method10989(long l2) {
        Class545.method10991(l2);
    }

    private static Class545[] method10990() {
        Class545[] class545Array = new Class545[(int)field2702[1]];
        class545Array[(int)Class545.field2702[0]] = field2699;
        class545Array[(int)Class545.field2702[2]] = field2701;
        class545Array[(int)Class545.field2702[3]] = field2700;
        return class545Array;
    }

    public static Class545[] values() {
        return field2698;
    }

    private static void method10991(long l2) {
        Class545.field2702[3] = l2 ^ 0x877D60B1D906FD97L;
        Class545.field2702[2] = l2 ^ 0x877D60B1D906FD94L;
        Class545.field2702[0] = l2 ^ 0x877D60B1D906FD95L;
        Class545.field2702[1] = l2 ^ 0x877D60B1D906FD96L;
    }

    public static Class545 method10992(String a2) {
        return Enum.valueOf(Class545.class, a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

