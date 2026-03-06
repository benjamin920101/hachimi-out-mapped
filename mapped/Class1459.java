/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1226;
import mapped.Class171;
import mapped.Class458;
import mapped.Class5790;
import mapped.Class598;
import mapped.Class683;

public class Class1459 {
    public static int method14343(int n2, int n3, Class171 class171, Class458 class458) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xFB4AAF4E) & ~n4);
    }

    public static int method14344(int n2, int n3, Class598 class598, Class683 class683) {
        return n2 ^ 0x7608049D ^ n3;
    }

    public static int method14345(int n2, int n3, Class1226 class1226, Class5790 class5790) {
        int n4 = n2 ^ 0x14205E;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

