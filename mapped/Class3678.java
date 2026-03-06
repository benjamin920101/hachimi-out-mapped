/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1383;
import mapped.Class1763;
import mapped.Class1790;
import mapped.Class235;
import mapped.Ambience;
import mapped.Class3879;
import mapped.Class4079;
import mapped.Class468;

public class Class3678 {
    public static int method18134(int n2, int n3, Class1790 class1790, Class468 class468) {
        int n4 = n2;
        return n4 & 0xDBA2A9E7 | 0x245D5618 & ~n4;
    }

    public static int method18135(int n2, int n3, Class1383 class1383, Ambience class290) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x3C385517) & ~n4);
    }

    public static int method18136(int n2, int n3, Class235 class235, Class3879 class3879) {
        return n2 ^ 0x54558E46 ^ n3;
    }

    public static int method18137(int n2, int n3, Class4079 class4079, Class1763 class1763) {
        int n4 = n2 ^ 0xA3DD156B;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

