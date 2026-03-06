/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1011;
import mapped.Class1308;
import mapped.Class137;
import mapped.Class1621;
import mapped.Class3466;
import mapped.Class379;
import mapped.Class399;
import mapped.Class4057;
import mapped.Class4218;
import mapped.Class5490;
import mapped.Class555;
import mapped.Class5670;
import mapped.Class579;
import mapped.Class688;

public class Class4131 {
    public static int method20658(int n2, int n3, Class5670 class5670, Class1308 class1308) {
        int n4 = n2;
        return n4 & 0xD9F975AF | 0x26068A50 & ~n4;
    }

    public static int method20659(int n2, int n3, Class4057 class4057, Class3466 class3466) {
        return n2 ^ 0x21F14801;
    }

    public static int method20660(int n2, int n3, Class555 class555, Class5490 class5490) {
        int n4 = n2 ^ 0x12E5CEE8;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20661(int n2, int n3, Class579 class579, Class399 class399) {
        int n4 = n2 ^ 0x190AC072;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20662(int n2, int n3, Class1621 class1621, Class4218 class4218) {
        int n4 = n2 ^ 0xFFF75FE2;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20663(int n2, int n3, Class137 class137, Class688 class688) {
        int n4 = n2;
        return (0xB0354EA | ~n4) - ~n4;
    }

    public static int method20664(int n2, int n3, Class1011 class1011, Class379 class379) {
        int n4 = n2 ^ 0x80000;
        return (n3 | ~n4) - ~n4;
    }
}

