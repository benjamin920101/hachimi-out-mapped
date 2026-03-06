/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1011;
import mapped.Class107;
import mapped.Class11;
import mapped.Class116;
import mapped.Class1278;
import mapped.Class1279;
import mapped.Class135;
import mapped.Class1357;
import mapped.Class1387;
import mapped.Class1459;
import mapped.Class1482;
import mapped.Class1544;
import mapped.Class1565;
import mapped.Class1669;
import mapped.Class170;
import mapped.Class175;
import mapped.Class176;
import mapped.Class203;
import mapped.Class206;
import mapped.Class214;
import mapped.Class222;
import mapped.Class232;
import mapped.Class233;
import mapped.Class237;
import mapped.Class239;
import mapped.Class249;
import mapped.Class270;
import mapped.Class273;
import mapped.NoRotate;
import mapped.EntitySpeed;
import mapped.Reach;
import mapped.Class3;
import mapped.PacketFly;
import mapped.NoRender;
import mapped.AutoLog;
import mapped.Class3248;
import mapped.TextRadar;
import mapped.Class3257;
import mapped.Class3285;
import mapped.Class3323;
import mapped.Class34;
import mapped.NoSlow;
import mapped.PacketLogger;
import mapped.AutoReconnect;
import mapped.Class3432;
import mapped.Class3448;
import mapped.Class3466;
import mapped.BlockHighlight;
import mapped.Class3493;
import mapped.Class3495;
import mapped.Class3510;
import mapped.Class3511;
import mapped.Animations;
import mapped.Class3592;
import mapped.Class3612;
import mapped.NoInteract;
import mapped.TickShift;
import mapped.Class3793;
import mapped.Class3796;
import mapped.PhaseESP;
import mapped.Class3878;
import mapped.Class3891;
import mapped.Class3913;
import mapped.Class3916;
import mapped.Class3989;
import mapped.Class4;
import mapped.UnfocusedFPS;
import mapped.Class4011;
import mapped.Class4028;
import mapped.EntityControl;
import mapped.PearlBlocker;
import mapped.Class4156;
import mapped.PistonKick;
import mapped.Flatten;
import mapped.AutoCrawlTrap;
import mapped.AntiRegear;
import mapped.ElytraFly;
import mapped.AntiCheat;
import mapped.Rotations;
import mapped.Class474;
import mapped.Class486;
import mapped.Class534;
import mapped.Class536;
import mapped.Class539;
import mapped.Class544;
import mapped.Class5460;
import mapped.Class550;
import mapped.Class553;
import mapped.Class5534;
import mapped.Class5541;
import mapped.Class5628;
import mapped.Class5648;
import mapped.Class5659;
import mapped.Class5828;
import mapped.Class587;
import mapped.Class5961;
import mapped.Class5983;
import mapped.Class601;
import mapped.Class6017;
import mapped.Class607;
import mapped.Class608;
import mapped.Class610;
import mapped.Class6103;
import mapped.Class619;
import mapped.Class6252;
import mapped.Class634;
import mapped.Class637;
import mapped.Class66;
import mapped.Class668;
import mapped.Class681;
import mapped.Class691;
import mapped.Class692;
import mapped.Class709;
import mapped.Class710;
import mapped.Class778;
import mapped.Class79;
import mapped.Class804;
import mapped.Class894;
import mapped.Class899;
import mapped.Class93;
import mapped.Class932;
import mapped.Class947;
import mapped.Class949;
import mapped.Class976;
import mapped.Class99;

public class Class3753 {
    public static int method18233(int n2, int n3, Class3448 class3448, Class3466 class3466) {
        int n4 = n2;
        return n4 & 0xEFFC113D | 0x1003EEC2 & ~n4;
    }

    public static int method18234(int n2, int n3, Class899 class899, Class3323 class3323) {
        int n4 = n2;
        return (0x33E1016E | ~n4) - ~n4;
    }

    public static int method18235(int n2, int n3, Class5983 class5983, Class5541 class5541) {
        int n4 = n2 ^ 0xE17FDFFD;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18236(int n2, int n3, Class3891 class3891, Class3257 class3257) {
        int n4 = n2 ^ 0xC93DA89C;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18237(int n2, int n3, Class607 class607, NoSlow class340) {
        int n4 = n2 ^ 0xFCFFF7FF;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18238(int n2, int n3, Class4 class4, Class222 class222) {
        int n4 = n2 ^ 0x6FE60640;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method18239(int n2, int n3, Class1279 class1279, Class486 class486) {
        int n4 = n2;
        return (0x3CBC041A | ~n4) - ~n4;
    }

    public static int method18240(int n2, int n3, Class5828 class5828, Class534 class534) {
        int n4 = n2;
        return (0x2C16C0A6 | ~n4) - ~n4;
    }

    public static int method18241(int n2, int n3, EntitySpeed class289, Class237 class237) {
        int n4 = n2;
        return (0x2BEA1A84 | ~n4) - ~n4;
    }

    public static int method18242(int n2, int n3, Class3511 class3511, Class5628 class5628) {
        int n4 = n2;
        return (0x3B50B5E0 | ~n4) - ~n4;
    }

    public static int method18243(int n2, int n3, Class976 class976, Class947 class947) {
        int n4 = n2 ^ 0x4440088;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method18244(int n2, int n3, Class5534 class5534, Class1459 class1459) {
        int n4 = n2 ^ 0x5EE7CBB4;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18245(int n2, int n3, PacketLogger class342, Class203 class203) {
        return 450407216 + (n2 & 0xE52754CF);
    }

    public static int method18246(int n2, int n3, EntityControl class407, Class601 class601) {
        return 99388100 + (n2 & 0xFA13753B);
    }

    public static int method18247(int n2, int n3, Class3510 class3510, Class1565 class1565) {
        int n4 = n2;
        return (0x22B1AB5B | ~n4) - ~n4;
    }

    public static int method18248(int n2, int n3, Class214 class214, Class270 class270) {
        int n4 = n2 ^ 0x51992769;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18249(int n2, int n3, Class587 class587, Class608 class608) {
        return 792607655 + (n2 & 0xD0C1C458);
    }

    public static int method18250(int n2, int n3, NoRotate class286, Class681 class681) {
        int n4 = n2;
        return (n4 | 0x3C9CCD70) & (0xC363328F | ~n4);
    }

    public static int method18251(int n2, int n3, Class206 class206, Class99 class99) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x14390488) & ~n4);
    }

    public static int method18252(int n2, int n3, Class249 class249, Class619 class619) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x42100) & ~n4);
    }

    public static int method18253(int n2, int n3, NoInteract class367, Class6103 class6103) {
        int n4 = n2;
        return n4 & 0xFB79C42F | 0x4863BD0 & ~n4;
    }

    public static int method18254(int n2, int n3, NoRender class310, PacketFly class305) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x44A6FFB7) & ~n4);
    }

    public static int method18255(int n2, int n3, Class4028 class4028, Flatten class426) {
        return n2 ^ 0x8025400 ^ n3;
    }

    public static int method18256(int n2, int n3, Class3432 class3432, Class66 class66) {
        return 24998065 + (n2 & 0xFE828F4E);
    }

    public static int method18257(int n2, int n3, Class1011 class1011, BlockHighlight class348) {
        return 186367676 + (n2 & 0xF4E44143);
    }

    public static int method18258(int n2, int n3, Class6017 class6017, Class932 class932) {
        return 457021141 + (n2 & 0xE4C2692A);
    }

    public static int method18259(int n2, int n3, Class550 class550, Class3493 class3493) {
        int n4 = n2;
        return (0x80EF5C3 | ~n4) - ~n4;
    }

    public static int method18260(int n2, int n3, Class3 class3, Class691 class691) {
        int n4 = n2;
        return (n4 | 0x711EB3B) & (0xF8EE14C4 | ~n4);
    }

    public static int method18261(int n2, int n3, Rotations class456, Class1482 class1482) {
        return 391747229 + (n2 & 0xE8A66962);
    }

    public static int method18262(int n2, int n3, Class3916 class3916, Class5961 class5961) {
        int n4 = n2 ^ 0xB63BD616;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18263(int n2, int n3, Class544 class544, Class1387 class1387) {
        return n2 ^ 0xC00 ^ n3;
    }

    public static int method18264(int n2, int n3, Reach class293, Class637 class637) {
        int n4 = n2;
        return (0x2B5EB32E | ~n4) - ~n4;
    }

    public static int method18265(int n2, int n3, UnfocusedFPS class401, Class710 class710) {
        int n4 = n2;
        return (n4 | 0x371D568C) & (0xC8E2A973 | ~n4);
    }

    public static int method18266(int n2, int n3, Class1357 class1357, Class232 class232) {
        return 1025895420 + (n2 & 0xC2DA1403);
    }

    public static int method18267(int n2, int n3, UnfocusedFPS class401, Class3796 class3796) {
        return 833226371 + (n2 & 0xCE55F97C);
    }

    public static int method18268(int n2, int n3, Class5659 class5659, Class692 class692) {
        int n4 = n2 ^ 0xB624B971;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18269(int n2, int n3, AntiRegear class437, Class3495 class3495) {
        return n2 ^ 0x1020 ^ n3;
    }

    public static int method18270(int n2, int n3, Class135 class135, Class3248 class3248) {
        return n2 ^ 0x7E97FDFB ^ n3;
    }

    public static int method18271(int n2, int n3, Class93 class93, Class634 class634) {
        return 996637289 + (n2 & 0xC4988596);
    }

    public static int method18272(int n2, int n3, AutoLog class311, Class536 class536) {
        return 662708041 + (n2 & 0xD87FE0B6);
    }

    public static int method18273(int n2, int n3, Class778 class778, Class4011 class4011) {
        int n4 = n2 ^ 0x6F5B2CED;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18274(int n2, int n3, Class3612 class3612, Class553 class553) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xFFDFFD7F) & ~n4);
    }

    public static int method18275(int n2, int n3, Class804 class804, Class3592 class3592) {
        int n4 = n2 ^ 0x4485C280;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method18276(int n2, int n3, PhaseESP class384, Class107 class107) {
        int n4 = n2;
        return (n4 | 0xAB42B3F) & (0xF54BD4C0 | ~n4);
    }

    public static int method18277(int n2, int n3, Class116 class116, Class34 class34) {
        int n4 = n2;
        return (0x33EA4810 | ~n4) - ~n4;
    }

    public static int method18278(int n2, int n3, Class3285 class3285, Class3878 class3878) {
        return 975820452 + (n2 & 0xC5D6295B);
    }

    public static int method18279(int n2, int n3, Class1278 class1278, Class170 class170) {
        int n4 = n2 ^ 0x51A1490;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18280(int n2, int n3, Class947 class947, TextRadar class325) {
        return 385690539 + (n2 & 0xE902D454);
    }

    public static int method18281(int n2, int n3, Class175 class175, Class233 class233) {
        int n4 = n2;
        return (n4 | 0xF8D707A) & (0xF0728F85 | ~n4);
    }

    public static int method18282(int n2, int n3, Class1669 class1669, Class634 class634) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x39876763) & ~n4);
    }

    public static int method18283(int n2, int n3, Class3323 class3323, Class692 class692) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xD8205421) & ~n4);
    }

    public static int method18284(int n2, int n3, Class894 class894, Class11 class11) {
        int n4 = n2 ^ 0x3F09FCB6;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18285(int n2, int n3, Class273 class273, AutoCrawlTrap class430) {
        int n4 = n2 ^ 0xA8E0C881;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18286(int n2, int n3, Class539 class539, TickShift class371) {
        int n4 = n2 ^ 0x535564E0;
        return (n3 | ~n4) - ~n4;
    }

    public static int method18287(int n2, int n3, Class709 class709, Class5460 class5460) {
        return 721113078 + (n2 & 0xD504B009);
    }

    public static int method18288(int n2, int n3, AntiCheat class455, Class607 class607) {
        int n4 = n2 ^ 0xB68E6618;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method18289(int n2, int n3, Class3989 class3989, Animations class353) {
        return n2 ^ 0x12B22E6E;
    }

    public static int method18290(int n2, int n3, Class949 class949, Class79 class79) {
        return n2 ^ 0xBD736F8B ^ n3;
    }

    public static int method18291(int n2, int n3, AutoReconnect class343, Class474 class474) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xB284AF80) & ~n4);
    }

    public static int method18292(int n2, int n3, PistonKick class422, PearlBlocker class415) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7FF7F7BF) & ~n4);
    }

    public static int method18293(int n2, int n3, Class4156 class4156, Class6252 class6252) {
        int n4 = n2;
        return n4 & 0xCE8A404E | 0x3175BFB1 & ~n4;
    }

    public static int method18294(int n2, int n3, Class176 class176, Class3323 class3323) {
        int n4 = n2;
        return n4 & 0xE6574290 | 0x19A8BD6F & ~n4;
    }

    public static int method18295(int n2, int n3, Class239 class239, Class610 class610) {
        return 311411989 + (n2 & 0xED703AEA);
    }

    public static int method18296(int n2, int n3, ElytraFly class444, Class1544 class1544) {
        return n2 ^ 0x841200C3 ^ n3;
    }

    public static int method18297(int n2, int n3, Class3793 class3793, Class5648 class5648) {
        int n4 = n2;
        return (0x16414CDB | ~n4) - ~n4;
    }

    public static int method18298(int n2, int n3, Class668 class668, Class3913 class3913) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xEB2FE71D) & ~n4);
    }
}

