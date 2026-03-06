/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1034;
import mapped.Class1044;
import mapped.Class1278;
import mapped.Class3248;
import mapped.AntiHunger;
import mapped.Class3510;
import mapped.Class38;
import mapped.Class411;
import mapped.AntiAFK;
import mapped.Class598;
import mapped.Class605;
import mapped.Class6090;

public class Class5678 {
    public static int method22371(int n2, int n3, Class38 class38, Class1278 class1278) {
        int n4 = n2 ^ 0x204080;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method22372(int n2, int n3, Class6090 class6090, Class3510 class3510) {
        int n4 = n2;
        return n4 & 0xD8F38CCD | 0x270C7332 & ~n4;
    }

    public static int method22373(int n2, int n3, Class411 class411, Class3248 class3248) {
        return n2 ^ 0x25E9B4EF;
    }

    public static int method22374(int n2, int n3, Class598 class598, AntiAFK class443) {
        int n4 = n2 ^ 0x9859094D;
        return (n3 | ~n4) - ~n4;
    }

    public static int method22375(int n2, int n3, Class1044 class1044, Class1034 class1034) {
        int n4 = n2 ^ 0x3F7FFB5B;
        return (n3 | ~n4) - ~n4;
    }

    public static int method22376(int n2, int n3, Class605 class605, AntiHunger class326) {
        int n4 = n2 ^ 0xD5CE32F4;
        return (n3 | ~n4) - ~n4;
    }
}

