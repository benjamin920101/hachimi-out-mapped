/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Direction
 */
package mapped;

import net.minecraft.util.math.Direction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class4152 {
    static final int[] field9655;
    private static long[] field9656;

    private static void method20715(long l2) {
        Class4152.field9656[2] = l2 ^ 0x72160F9C493918F3L;
        Class4152.field9656[1] = l2 ^ 0x72160F9C493918F5L;
        Class4152.field9656[0] = l2 ^ 0x72160F9C493918F0L;
        Class4152.field9656[3] = l2 ^ 0x72160F9C493918F2L;
    }

    static {
        field9656 = new long[4];
        Class4152.method20715(8220775333729212657L);
        field9655 = new int[class_2350.values().length];
        try {
            Class4152.field9655[class_2350.field_11035.ordinal()] = (int)field9656[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class4152.field9655[class_2350.field_11039.ordinal()] = (int)field9656[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class4152.field9655[class_2350.field_11043.ordinal()] = (int)field9656[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class4152.field9655[class_2350.field_11034.ordinal()] = (int)field9656[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        throw null;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

