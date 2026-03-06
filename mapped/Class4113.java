/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class102;
import mapped.Class13;
import mapped.Class2299;
import mapped.Class246;
import mapped.FreeLook;
import mapped.FastProjectile;
import mapped.ScreenKeeper;
import mapped.TrueSight;
import mapped.NoHitDelay;
import mapped.Class3546;
import mapped.ChorusControl;
import mapped.Class4074;
import mapped.Class42;
import mapped.PistonKick;
import mapped.Flatten;
import mapped.AutoMine;
import mapped.Sprint;
import mapped.AntiAFK;
import mapped.Kit;
import mapped.Class534;
import mapped.Class546;
import mapped.Class5534;
import mapped.Class5692;
import mapped.Class572;

public class Class4113 {
    public static int method20541(int n2, int n3, PistonKick class422, Class534 class534) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xB5BF767D) & ~n4);
    }

    public static int method20542(int n2, int n3, Class2299 class2299, TrueSight class341) {
        return n2 ^ 0xD4AA8060 ^ n3;
    }

    public static int method20543(int n2, int n3, Class102 class102, FreeLook class281) {
        int n4 = n2;
        return (0x2CD1A5F7 | ~n4) - ~n4;
    }

    public static int method20544(int n2, int n3, Class5534 class5534, Flatten class426) {
        int n4 = n2 ^ 0x888002;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20545(int n2, int n3, Class246 class246, Sprint class442) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x4405) & ~n4);
    }

    public static int method20546(int n2, int n3, AntiAFK class443, Class4074 class4074) {
        return n2 ^ 0xFF9F8FEF ^ n3;
    }

    public static int method20547(int n2, int n3, Class5692 class5692, Class572 class572) {
        int n4 = n2 ^ 0x26D2E658;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20548(int n2, int n3, NoHitDelay class349, Class3546 class3546) {
        int n4 = n2;
        return (0x3445D2DB | ~n4) - ~n4;
    }

    public static int method20549(int n2, int n3, Class13 class13, AutoMine class435) {
        int n4 = n2 ^ 0xCE56A2C5;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20550(int n2, int n3, FastProjectile class291, ChorusControl class389) {
        return n2 ^ 0xFBB7EDF3 ^ n3;
    }

    public static int method20551(int n2, int n3, Kit class454, ScreenKeeper class301) {
        int n4 = n2;
        return (n4 | 0xE429FC1) & (0xF1BD603E | ~n4);
    }

    public static int method20552(int n2, int n3, Class546 class546, Class42 class42) {
        int n4 = n2 ^ 0xD0CC6DC8;
        return (n3 | ~n4) - ~n4;
    }
}

