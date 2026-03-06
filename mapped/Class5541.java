/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class102;
import mapped.Class105;
import mapped.Class108;
import mapped.Class109;
import mapped.Class116;
import mapped.Class12;
import mapped.Class123;
import mapped.Class1365;
import mapped.Class1383;
import mapped.Class1391;
import mapped.Class147;
import mapped.Class149;
import mapped.Class158;
import mapped.Class159;
import mapped.Class160;
import mapped.Class161;
import mapped.Class1660;
import mapped.Class172;
import mapped.Class176;
import mapped.Class1763;
import mapped.Class186;
import mapped.Class193;
import mapped.Class205;
import mapped.Class209;
import mapped.Class215;
import mapped.Class216;
import mapped.Class2298;
import mapped.Class230;
import mapped.Class232;
import mapped.Class238;
import mapped.Class248;
import mapped.Class25;
import mapped.Class251;
import mapped.Class26;
import mapped.Class269;
import mapped.Class270;
import mapped.Strafe;
import mapped.PacketFly;
import mapped.AutoWalk;
import mapped.Class32;
import mapped.AutoFish;
import mapped.Timer;
import mapped.Class3377;
import mapped.Class34;
import mapped.PacketLogger;
import mapped.AutoTool;
import mapped.BlockHighlight;
import mapped.Class3556;
import mapped.CombatHUD;
import mapped.BetterChat;
import mapped.PMSound;
import mapped.PhaseESP;
import mapped.Class3850;
import mapped.Trajectories;
import mapped.Class3980;
import mapped.FastSwim;
import mapped.Class4045;
import mapped.Spammer;
import mapped.Class4104;
import mapped.AutoCrystal;
import mapped.PistonKick;
import mapped.Follower;
import mapped.SpeedMine;
import mapped.Flatten;
import mapped.Aura;
import mapped.AutoAnchor;
import mapped.Server;
import mapped.Class478;
import mapped.Class545;
import mapped.Class5655;
import mapped.Class5693;
import mapped.Class583;
import mapped.Class599;
import mapped.Class600;
import mapped.Class604;
import mapped.Class607;
import mapped.Class609;
import mapped.Class6134;
import mapped.Class6316;
import mapped.Class65;
import mapped.Class689;
import mapped.Class697;
import mapped.Class703;
import mapped.Class707;
import mapped.Class713;
import mapped.Class760;
import mapped.Class803;
import mapped.Class82;
import mapped.Class86;
import mapped.Class925;
import mapped.Class926;
import mapped.Class99;

public class Class5541 {
    public static int method21773(int n2, int n3, Class230 class230, Class545 class545) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x95BAB5DC) & ~n4);
    }

    public static int method21774(int n2, int n3, AutoCrystal class419, Follower class423) {
        return n2 ^ 0x3DF9B519;
    }

    public static int method21775(int n2, int n3, Class583 class583, Class599 class599) {
        int n4 = n2;
        return (0x200F202B | ~n4) - ~n4;
    }

    public static int method21776(int n2, int n3, Class161 class161, Class215 class215) {
        int n4 = n2 ^ 0x3801509;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method21777(int n2, int n3, Class160 class160, Class925 class925) {
        int n4 = n2 ^ 0x91224404;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21778(int n2, int n3, Class4104 class4104, Class193 class193) {
        int n4 = n2 ^ 0xFFF7B7FF;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21779(int n2, int n3, Class176 class176, Class248 class248) {
        int n4 = n2 ^ 0x96F5F5D7;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21780(int n2, int n3, Class803 class803, Flatten class426) {
        int n4 = n2 ^ 0x5A00CA20;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21781(int n2, int n3, Class4045 class4045, Class102 class102) {
        return n2 ^ 0xC0A146C;
    }

    public static int method21782(int n2, int n3, Class34 class34, Class607 class607) {
        int n4 = n2;
        return n4 & 0xE8AEE11B | 0x17511EE4 & ~n4;
    }

    public static int method21783(int n2, int n3, Class5655 class5655, Class926 class926) {
        return n2 | 0x2F7BB291;
    }

    public static int method21784(int n2, int n3, Class65 class65, Class99 class99) {
        int n4 = n2 ^ 0x5D8C2EA4;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21785(int n2, int n3, Class600 class600, Class82 class82) {
        int n4 = n2;
        return (0x1B62F15B | ~n4) - ~n4;
    }

    public static int method21786(int n2, int n3, Class1383 class1383, Timer class335) {
        return n2 ^ 0x85385A45 ^ n3;
    }

    public static int method21787(int n2, int n3, Trajectories class397, Class5693 class5693) {
        int n4 = n2 ^ 0xC799FF26;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method21788(int n2, int n3, Class1660 class1660, AutoFish class330) {
        return n2 ^ 0x3D32F536;
    }

    public static int method21789(int n2, int n3, Class251 class251, Class3556 class3556) {
        int n4 = n2 ^ 0xFFFFFBAB;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method21790(int n2, int n3, Class703 class703, Class3377 class3377) {
        int n4 = n2;
        return (0x3ECE3F72 | ~n4) - ~n4;
    }

    public static int method21791(int n2, int n3, BetterChat class362, Class760 class760) {
        int n4 = n2;
        return (0x268843F2 | ~n4) - ~n4;
    }

    public static int method21792(int n2, int n3, Class270 class270, Class707 class707) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xDD7DFFC4) & ~n4);
    }

    public static int method21793(int n2, int n3, Class707 class707, Class697 class697) {
        int n4 = n2;
        return (0x3CCD9210 | ~n4) - ~n4;
    }

    public static int method21794(int n2, int n3, Class238 class238, Class583 class583) {
        return n2 ^ 0x2E9FF4AC;
    }

    public static int method21795(int n2, int n3, Class86 class86, Class216 class216) {
        int n4 = n3;
        return n4 + ((n2 ^ 0) & ~n4);
    }

    public static int method21796(int n2, int n3, Class149 class149, Class269 class269) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE3E1665B) & ~n4);
    }

    public static int method21797(int n2, int n3, Class116 class116, CombatHUD class356) {
        return n2 ^ 0x158321A0;
    }

    public static int method21798(int n2, int n3, Class604 class604, Class6134 class6134) {
        int n4 = n2 ^ 0xE7FDFFF7;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method21799(int n2, int n3, SpeedMine class425, PacketFly class305) {
        int n4 = n2 ^ 0xAF9EDA9C;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21800(int n2, int n3, PacketLogger class342, Strafe class282) {
        int n4 = n2 ^ 0x514B24B5;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method21801(int n2, int n3, Class707 class707, Class12 class12) {
        return 480663476 + (n2 & 0xE359A84B);
    }

    public static int method21802(int n2, int n3, AutoWalk class313, PMSound class370) {
        int n4 = n2;
        return (n4 | 0x81F3524) & (0xF7E0CADB | ~n4);
    }

    public static int method21803(int n2, int n3, Server class453, PistonKick class422) {
        int n4 = n2;
        return (0x3352F94E | ~n4) - ~n4;
    }

    public static int method21804(int n2, int n3, Class123 class123, Class478 class478) {
        int n4 = n2;
        return (0x4E8F8C7 | ~n4) - ~n4;
    }

    public static int method21805(int n2, int n3, Class205 class205, Class609 class609) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xF9D33F7B) & ~n4);
    }

    public static int method21806(int n2, int n3, Class105 class105, Class25 class25) {
        return n2 ^ 0xFF7E90FD ^ n3;
    }

    public static int method21807(int n2, int n3, Class147 class147, BlockHighlight class348) {
        int n4 = n2 ^ 0x9881D9C8;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21808(int n2, int n3, FastSwim class399, Class65 class65) {
        int n4 = n2;
        return (0x2CE16955 | ~n4) - ~n4;
    }

    public static int method21809(int n2, int n3, Class3980 class3980, AutoAnchor class436) {
        int n4 = n2;
        return (n4 | 0x37FEFD02) & (0xC80102FD | ~n4);
    }

    public static int method21810(int n2, int n3, Class26 class26, Class159 class159) {
        int n4 = n2 ^ 0x42588E70;
        return (n3 | ~n4) - ~n4;
    }

    public static int method21811(int n2, int n3, Class713 class713, Class186 class186) {
        int n4 = n2;
        return (0xE5A996D | ~n4) - ~n4;
    }

    public static int method21812(int n2, int n3, Class1391 class1391, Class82 class82) {
        int n4 = n2 ^ 0x55130E30;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method21813(int n2, int n3, Class172 class172, Class3850 class3850) {
        return 448872544 + (n2 & 0xE53EBF9F);
    }

    public static int method21814(int n2, int n3, PhaseESP class384, Class2298 class2298) {
        return 214744415 + (n2 & 0xF33342A0);
    }

    public static int method21815(int n2, int n3, Class1365 class1365, Class108 class108) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x5E7465A0) & ~n4);
    }

    public static int method21816(int n2, int n3, Class32 class32, Class6316 class6316) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xD537D9E2) & ~n4);
    }

    public static int method21817(int n2, int n3, Class158 class158, Class1763 class1763) {
        int n4 = n2;
        return (0x3F502723 | ~n4) - ~n4;
    }

    public static int method21818(int n2, int n3, Class209 class209, Class5655 class5655) {
        return 170422024 + (n2 & 0xF5D790F7);
    }

    public static int method21819(int n2, int n3, Spammer class406, Class109 class109) {
        int n4 = n2;
        return (0x37062FF6 | ~n4) - ~n4;
    }

    public static int method21820(int n2, int n3, Class689 class689, AutoTool class347) {
        int n4 = n2 ^ 0x30E47596;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method21821(int n2, int n3, Aura class434, Class232 class232) {
        int n4 = n2;
        return (0x2CE1400C | ~n4) - ~n4;
    }
}

