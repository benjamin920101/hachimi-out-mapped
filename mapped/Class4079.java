/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1017;
import mapped.Class121;
import mapped.Class1278;
import mapped.Class134;
import mapped.Class1367;
import mapped.Class165;
import mapped.Class1661;
import mapped.Class178;
import mapped.Class181;
import mapped.Class1822;
import mapped.Class190;
import mapped.Class214;
import mapped.Class244;
import mapped.Class262;
import mapped.Class276;
import mapped.KillEffects;
import mapped.Reach;
import mapped.Class3;
import mapped.Criticals;
import mapped.MaceSpoof;
import mapped.Class3285;
import mapped.AnvilRename;
import mapped.BetterChat;
import mapped.Class4026;
import mapped.EntityControl;
import mapped.Surround;
import mapped.AutoTrap;
import mapped.Class4257;
import mapped.Aura;
import mapped.AntiAFK;
import mapped.FakePlayer;
import mapped.ChatNotifier;
import mapped.Rotations;
import mapped.Class519;
import mapped.Class533;
import mapped.Class5460;
import mapped.Class547;
import mapped.Class5473;
import mapped.Class5984;
import mapped.Class61;
import mapped.Class6253;
import mapped.Class6404;
import mapped.Class716;
import mapped.Class78;
import mapped.Class905;
import mapped.Class976;

public class Class4079 {
    public static int method20323(int n2, int n3, Class6253 class6253, Class6404 class6404) {
        int n4 = n2 ^ 0x40A433A0;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20324(int n2, int n3, ChatNotifier class450, Class533 class533) {
        int n4 = n2 ^ 0x658C9017;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20325(int n2, int n3, Criticals class307, FakePlayer class449) {
        int n4 = n2 ^ 0xCFFF6CF7;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20326(int n2, int n3, Class1661 class1661, Class134 class134) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xEFF1FCF5) & ~n4);
    }

    public static int method20327(int n2, int n3, Class5984 class5984, Class905 class905) {
        int n4 = n2;
        return n4 & 0xCB394693 | 0x34C6B96C & ~n4;
    }

    public static int method20328(int n2, int n3, Class1278 class1278, Class214 class214) {
        int n4 = n2 ^ 0xB2276F60;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20329(int n2, int n3, Class244 class244, MaceSpoof class322) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x4218A0AD) & ~n4);
    }

    public static int method20330(int n2, int n3, Class1367 class1367, Class121 class121) {
        return 156118508 + (n2 & 0xF6B1D213);
    }

    public static int method20331(int n2, int n3, Class78 class78, Class5460 class5460) {
        int n4 = n2 ^ 0xEA2FDA43;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20332(int n2, int n3, KillEffects class292, Class547 class547) {
        return n2 ^ 0x20200063 ^ n3;
    }

    public static int method20333(int n2, int n3, Class4026 class4026, Surround class416) {
        int n4 = n2;
        return n4 & 0xC7C7AF01 | 0x383850FE & ~n4;
    }

    public static int method20334(int n2, int n3, Class262 class262, Class5473 class5473) {
        return n2 ^ 0xA804D9E0 ^ n3;
    }

    public static int method20335(int n2, int n3, Class519 class519, AutoTrap class418) {
        int n4 = n2;
        return (0x39CAC28D | ~n4) - ~n4;
    }

    public static int method20336(int n2, int n3, Class61 class61, Reach class293) {
        int n4 = n2;
        return n4 & 0xC15A8F81 | 0x3EA5707E & ~n4;
    }

    public static int method20337(int n2, int n3, Class3285 class3285, Class178 class178) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xDCEA3200) & ~n4);
    }

    public static int method20338(int n2, int n3, Class165 class165, Class716 class716) {
        int n4 = n2;
        return (0x1580EA0 | ~n4) - ~n4;
    }

    public static int method20339(int n2, int n3, Class976 class976, Class190 class190) {
        int n4 = n2 ^ 0x20AC0188;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20340(int n2, int n3, EntityControl class407, Class1017 class1017) {
        int n4 = n2 ^ 0xB0A4AAEC;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20341(int n2, int n3, Aura class434, Class276 class276) {
        int n4 = n2;
        return (0x5A99C88 | ~n4) - ~n4;
    }

    public static int method20342(int n2, int n3, BetterChat class362, AntiAFK class443) {
        return 180599376 + (n2 & 0xF53C45AF);
    }

    public static int method20343(int n2, int n3, Class4257 class4257, Class1822 class1822) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x89D553CA) & ~n4);
    }

    public static int method20344(int n2, int n3, Rotations class456, AnvilRename class358) {
        int n4 = n2 ^ 0x44C10A8;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20345(int n2, int n3, Class3 class3, Class181 class181) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x36F2FFBA) & ~n4);
    }
}

