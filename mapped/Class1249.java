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
class Class1249 {
    static final int[] field4893;
    private static long[] field4894;

    static {
        field4894 = new long[4];
        Class1249.method13323(-6296662350895759875L);
        field4893 = new int[class_2350.values().length];
        try {
            Class1249.field4893[class_2350.field_11039.ordinal()] = (int)field4894[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class1249.field4893[class_2350.field_11034.ordinal()] = (int)field4894[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class1249.field4893[class_2350.field_11043.ordinal()] = (int)field4894[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            try {
                Class1249.field4893[class_2350.field_11035.ordinal()] = (int)field4894[1];
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                // empty catch block
            }
            return;
        }
        throw null;
    }

    private static void method13323(long l2) {
        Class1249.field4894[0] = l2 ^ 0xA89DC2F3F8483DFEL;
        Class1249.field4894[3] = l2 ^ 0xA89DC2F3F8483DFFL;
        Class1249.field4894[2] = l2 ^ 0xA89DC2F3F8483DFCL;
        Class1249.field4894[1] = l2 ^ 0xA89DC2F3F8483DF9L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

