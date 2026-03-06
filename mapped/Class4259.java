/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class164;
import mapped.Class224;
import mapped.Class244;
import mapped.Class3263;
import mapped.Class341;
import mapped.Class3666;
import mapped.Class377;
import mapped.Class3989;
import mapped.Class418;
import mapped.Class5534;
import mapped.Class5692;
import mapped.Class767;

public class Class4259 {
    public static int method20945(int n2, int n3, Class244 class244, Class5692 class5692) {
        int n4 = n2 ^ 0x519E37E4;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20946(int n2, int n3, Class5534 class5534, Class224 class224) {
        return n2 ^ 0xECD7FB9B ^ n3;
    }

    public static int method20947(int n2, int n3, Class377 class377, Class341 class341) {
        int n4 = n2;
        return n4 & 0xF615756E | 0x9EA8A91 & ~n4;
    }

    public static int method20948(int n2, int n3, Class3263 class3263, Class164 class164) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE5EFA1CA) & ~n4);
    }

    public static int method20949(int n2, int n3, Class3666 class3666, Class418 class418) {
        return 49294135 + (n2 & 0xFD0FD4C8);
    }

    public static int method20950(int n2, int n3, Class767 class767, Class3989 class3989) {
        int n4 = n2 ^ 0x84B783E4;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

