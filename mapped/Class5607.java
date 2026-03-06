/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class110;
import mapped.Class130;
import mapped.Class263;
import mapped.AutoTunnel;
import mapped.Class3696;
import mapped.Class3845;
import mapped.Class3989;
import mapped.UnfocusedFPS;
import mapped.FakePlayer;
import mapped.Class614;
import mapped.Class6433;
import mapped.Class693;

public class Class5607 {
    public static int method21972(int n2, int n3, Class3989 class3989, UnfocusedFPS class401) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x9ABB0D0) & ~n4);
    }

    public static int method21973(int n2, int n3, Class693 class693, Class263 class263) {
        return n2 ^ 0x42101002 ^ n3;
    }

    public static int method21974(int n2, int n3, Class130 class130, Class3696 class3696) {
        return n2 ^ 0x1BE0A68A ^ n3;
    }

    public static int method21975(int n2, int n3, Class3845 class3845, Class6433 class6433) {
        return 780350229 + (n2 & 0xD17CCCEA);
    }

    public static int method21976(int n2, int n3, Class614 class614, FakePlayer class449) {
        int n4 = n2;
        return (n4 | 0x2577CD0D) & (0xDA8832F2 | ~n4);
    }

    public static int method21977(int n2, int n3, AutoTunnel class284, Class110 class110) {
        int n4 = n2 ^ 0xFBFEF7F7;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }
}

