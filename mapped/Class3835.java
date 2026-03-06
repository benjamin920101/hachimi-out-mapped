/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class10;
import mapped.Class109;
import mapped.Class128;
import mapped.Class1561;
import mapped.Class1665;
import mapped.Class1764;
import mapped.Class209;
import mapped.Class3493;
import mapped.Class478;
import mapped.Class530;
import mapped.Class5628;
import mapped.Class630;
import mapped.Class716;
import mapped.Class79;

public class Class3835 {
    public static int method18779(int n2, int n3, Class1764 class1764, Class209 class209) {
        int n4 = n2 ^ 0x67890288;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method18780(int n2, int n3, Class1561 class1561, Class716 class716) {
        return n2 ^ 0x3BE2351F;
    }

    public static int method18781(int n2, int n3, Class478 class478, Class630 class630) {
        int n4 = n2;
        return (n4 | 0x3C68BAE7) & (0xC3974518 | ~n4);
    }

    public static int method18782(int n2, int n3, Class3493 class3493, Class530 class530) {
        int n4 = n2;
        return n4 & 0xF9CA4821 | 0x635B7DE & ~n4;
    }

    public static int method18783(int n2, int n3, Class109 class109, Class128 class128) {
        int n4 = n2;
        return n4 & 0xF0573999 | 0xFA8C666 & ~n4;
    }

    public static int method18784(int n2, int n3, Class5628 class5628, Class79 class79) {
        return 8636534 + (n2 & 0xFF7C3789);
    }

    public static int method18785(int n2, int n3, Class10 class10, Class1665 class1665) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xFFAFEB7D) & ~n4);
    }
}

