/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2351
 */
package mapped;

import net.minecraft.class_2350;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class3431 {
    static final int[] field7475;
    private static long[] field7476;
    static final int[] field7477;

    static {
        field7476 = new long[6];
        Class3431.method17302(7133267559184037566L);
        field7477 = new int[class_2350.class_2351.values().length];
        try {
            Class3431.field7477[class_2350.class_2351.field_11048.ordinal()] = (int)field7476[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3431.field7477[class_2350.class_2351.field_11052.ordinal()] = (int)field7476[4];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3431.field7477[class_2350.class_2351.field_11051.ordinal()] = (int)field7476[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        field7475 = new int[class_2350.values().length];
        try {
            Class3431.field7475[class_2350.field_11036.ordinal()] = (int)field7476[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3431.field7475[class_2350.field_11033.ordinal()] = (int)field7476[4];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3431.field7475[class_2350.field_11043.ordinal()] = (int)field7476[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3431.field7475[class_2350.field_11035.ordinal()] = (int)field7476[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            try {
                Class3431.field7475[class_2350.field_11034.ordinal()] = (int)field7476[0];
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                // empty catch block
            }
            try {
                Class3431.field7475[class_2350.field_11039.ordinal()] = (int)field7476[5];
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                // empty catch block
            }
            return;
        }
        throw null;
    }

    private static void method17302(long l2) {
        Class3431.field7476[1] = l2 ^ 0x62FE750D28FB76BFL;
        Class3431.field7476[0] = l2 ^ 0x62FE750D28FB76BBL;
        Class3431.field7476[5] = l2 ^ 0x62FE750D28FB76B8L;
        Class3431.field7476[3] = l2 ^ 0x62FE750D28FB76BDL;
        Class3431.field7476[2] = l2 ^ 0x62FE750D28FB76BAL;
        Class3431.field7476[4] = l2 ^ 0x62FE750D28FB76BCL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

