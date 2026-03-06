/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1391;
import mapped.Class151;
import mapped.Class1577;
import mapped.Class1665;
import mapped.Class183;
import mapped.Class194;
import mapped.Class3741;
import mapped.Class537;
import mapped.Class584;
import mapped.Class599;
import mapped.Class854;
import mapped.Class947;

public class Class1036 {
    public static int method12846(int n2, int n3, Class599 class599, Class854 class854) {
        int n4 = n2 ^ 0xEFFE97F5;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method12847(int n2, int n3, Class3741 class3741, Class1665 class1665) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x3F375EC8) & ~n4);
    }

    public static int method12848(int n2, int n3, Class194 class194, Class151 class151) {
        int n4 = n2;
        return (0x233A7AC5 | ~n4) - ~n4;
    }

    public static int method12849(int n2, int n3, Class537 class537, Class1391 class1391) {
        int n4 = n2 ^ 0xDFCFFFB6;
        return (n3 | ~n4) - ~n4;
    }

    public static int method12850(int n2, int n3, Class584 class584, Class947 class947) {
        return n2 ^ 0xFBD27FD0 ^ n3;
    }

    public static int method12851(int n2, int n3, Class183 class183, Class1577 class1577) {
        int n4 = n2;
        return (0x147F68EB | ~n4) - ~n4;
    }
}

