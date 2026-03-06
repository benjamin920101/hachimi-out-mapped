/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2350
 */
package mapped;

import net.minecraft.class_2350;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class1414 {
    static final int[] field5435;
    private static long[] field5436;

    private static void method14189(long l2) {
        Class1414.field5436[2] = l2 ^ 0x93E99C508554EEE5L;
        Class1414.field5436[5] = l2 ^ 0x93E99C508554EEE3L;
        Class1414.field5436[0] = l2 ^ 0x93E99C508554EEE4L;
        Class1414.field5436[4] = l2 ^ 0x93E99C508554EEE0L;
        Class1414.field5436[1] = l2 ^ 0x93E99C508554EEE7L;
        Class1414.field5436[3] = l2 ^ 0x93E99C508554EEE2L;
    }

    static {
        field5436 = new long[6];
        Class1414.method14189(-7788522210912309530L);
        field5435 = new int[class_2350.values().length];
        try {
            Class1414.field5435[class_2350.field_11043.ordinal()] = (int)field5436[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            try {
                Class1414.field5435[class_2350.field_11035.ordinal()] = (int)field5436[0];
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                // empty catch block
            }
            try {
                Class1414.field5435[class_2350.field_11034.ordinal()] = (int)field5436[2];
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                // empty catch block
            }
            try {
                Class1414.field5435[class_2350.field_11039.ordinal()] = (int)field5436[3];
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                // empty catch block
            }
            try {
                Class1414.field5435[class_2350.field_11036.ordinal()] = (int)field5436[5];
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                try {
                    Class1414.field5435[class_2350.field_11033.ordinal()] = (int)field5436[4];
                }
                catch (NoSuchFieldError noSuchFieldError6) {
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

