/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Direction
 */
package mapped;

import mapped.Class124;
import mapped.Class225;
import mapped.Class235;
import mapped.Spammer;
import mapped.Class4074;
import mapped.Class42;
import mapped.Class554;
import mapped.Class626;
import mapped.Class6418;
import mapped.Class686;
import net.minecraft.util.math.Direction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class3368 {
    static final int[] field7304;
    static final int[] field7305;
    private static long[] field7306;

    static {
        field7306 = new long[6];
        Class3368.method17189(-4683532276171291885L);
        field7305 = new int[Class626.values().length];
        try {
            Class3368.field7305[Class626.field3061.ordinal()] = (int)field7306[3];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            try {
                Class3368.field7305[Class626.field3059.ordinal()] = (int)field7306[2];
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                // empty catch block
            }
            try {
                Class3368.field7305[Class626.field3062.ordinal()] = (int)field7306[1];
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                // empty catch block
            }
            field7304 = new int[class_2350.values().length];
            try {
                Class3368.field7304[class_2350.field_11036.ordinal()] = (int)field7306[3];
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                // empty catch block
            }
            try {
                Class3368.field7304[class_2350.field_11033.ordinal()] = (int)field7306[2];
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                // empty catch block
            }
            try {
                Class3368.field7304[class_2350.field_11043.ordinal()] = (int)field7306[1];
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                // empty catch block
            }
            try {
                Class3368.field7304[class_2350.field_11035.ordinal()] = (int)field7306[5];
            }
            catch (NoSuchFieldError noSuchFieldError7) {
                // empty catch block
            }
            try {
                Class3368.field7304[class_2350.field_11039.ordinal()] = (int)field7306[4];
            }
            catch (NoSuchFieldError noSuchFieldError8) {
                // empty catch block
            }
            try {
                Class3368.field7304[class_2350.field_11034.ordinal()] = (int)field7306[0];
            }
            catch (NoSuchFieldError noSuchFieldError9) {
                // empty catch block
            }
            return;
        }
        throw null;
    }

    private static void method17189(long l2) {
        Class3368.field7306[0] = l2 ^ 0xBF00C03590BBC315L;
        Class3368.field7306[5] = l2 ^ 0xBF00C03590BBC317L;
        Class3368.field7306[2] = l2 ^ 0xBF00C03590BBC311L;
        Class3368.field7306[4] = l2 ^ 0xBF00C03590BBC316L;
        Class3368.field7306[1] = l2 ^ 0xBF00C03590BBC310L;
        Class3368.field7306[3] = l2 ^ 0xBF00C03590BBC312L;
    }

    private static int method17190(int n2, int n3, Spammer class406, Class686 class686) {
        return Class6418.method24501(n2, n3, class406, class686);
    }

    private static int method17191(int n2, int n3, Class235 class235, Class42 class42) {
        return Class6418.method24498(n2, n3, class235, class42);
    }

    private static int method17192(int n2, int n3, Class4074 class4074, Class554 class554) {
        return Class6418.method24496(n2, n3, class4074, class554);
    }

    private static int method17193(int n2, int n3, Class124 class124, Class225 class225) {
        return Class6418.method24493(n2, n3, class124, class225);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

