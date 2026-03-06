/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class136;
import mapped.Class1447;
import mapped.Class171;
import mapped.Class220;
import mapped.Class253;
import mapped.Class264;
import mapped.Font;
import mapped.ExtraTab;
import mapped.AntiHunger;
import mapped.Class3323;
import mapped.Class4074;
import mapped.PearlBlocker;
import mapped.AutoCrystal;
import mapped.AntiAFK;
import mapped.Class489;
import mapped.Class523;
import mapped.Class542;
import mapped.Class5534;
import mapped.Class5961;
import mapped.Class5984;
import mapped.Class710;
import mapped.Class88;

public class Class1123 {
    public static int method12973(int n2, int n3, Class710 class710, Class171 class171) {
        int n4 = n2 ^ 0x8ADB728B;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method12974(int n2, int n3, Class5961 class5961, Class5534 class5534) {
        int n4 = n2;
        return n4 & 0xEA6DED73 | 0x1592128C & ~n4;
    }

    public static int method12975(int n2, int n3, Class88 class88, AntiAFK class443) {
        return n2 ^ 0x22285AF5;
    }

    public static int method12976(int n2, int n3, Class4074 class4074, Class253 class253) {
        return 944780212 + (n2 & 0xC7AFCC4B);
    }

    public static int method12977(int n2, int n3, PearlBlocker class415, Class136 class136) {
        int n4 = n2 ^ 0x9983E77D;
        return (n3 | ~n4) - ~n4;
    }

    public static int method12978(int n2, int n3, Class542 class542, Font class296) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xF480C382) & ~n4);
    }

    public static int method12979(int n2, int n3, Class3323 class3323, Class264 class264) {
        return n2 ^ 0x389BE9ED;
    }

    public static int method12980(int n2, int n3, Class5984 class5984, ExtraTab class316) {
        int n4 = n2;
        return (n4 | 0xB960603) & (0xF469F9FC | ~n4);
    }

    public static int method12981(int n2, int n3, AntiHunger class326, Class1447 class1447) {
        return n2 ^ 0x136E8B43;
    }

    public static int method12982(int n2, int n3, Class489 class489, Class523 class523) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x85FA17CE) & ~n4);
    }

    public static int method12983(int n2, int n3, AutoCrystal class419, Class220 class220) {
        int n4 = n2 ^ 0xD5FFDFFF;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

