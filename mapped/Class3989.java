/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class107;
import mapped.Class15;
import mapped.Class309;
import mapped.Class352;
import mapped.Class3980;
import mapped.Class413;
import mapped.Class550;
import mapped.Class56;
import mapped.Class925;
import mapped.Class976;

public class Class3989 {
    public static int method19571(int n2, int n3, Class413 class413, Class925 class925) {
        return n2 ^ 0x3092E491;
    }

    public static int method19572(int n2, int n3, Class15 class15, Class309 class309) {
        return n2 ^ 0xEFFFFA6B ^ n3;
    }

    public static int method19573(int n2, int n3, Class107 class107, Class976 class976) {
        int n4 = n2 ^ 0xAB478E8C;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method19574(int n2, int n3, Class550 class550, Class56 class56) {
        int n4 = n2 ^ 0xFBCFFBBF;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method19575(int n2, int n3, Class352 class352, Class3980 class3980) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xFFEFBF7D) & ~n4);
    }
}

