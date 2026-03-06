/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1044;
import mapped.Class106;
import mapped.Class107;
import mapped.Class1108;
import mapped.Class1198;
import mapped.Class12;
import mapped.Class125;
import mapped.Class1254;
import mapped.Class127;
import mapped.Class129;
import mapped.Class13;
import mapped.Class1320;
import mapped.Class1327;
import mapped.Class1371;
import mapped.Class1384;
import mapped.Class139;
import mapped.Class1394;
import mapped.Class140;
import mapped.Class144;
import mapped.Class1440;
import mapped.Class1450;
import mapped.Class1467;
import mapped.Class1468;
import mapped.Class15;
import mapped.Class152;
import mapped.Class1533;
import mapped.Class1561;
import mapped.Class159;
import mapped.Class1613;
import mapped.Class1615;
import mapped.Class1621;
import mapped.Class165;
import mapped.Class169;
import mapped.Class1695;
import mapped.Class171;
import mapped.Class1736;
import mapped.Class1742;
import mapped.Class1745;
import mapped.Class1789;
import mapped.Class1792;
import mapped.Class180;
import mapped.Class1804;
import mapped.Class1806;
import mapped.Class188;
import mapped.Class190;
import mapped.Class191;
import mapped.Class192;
import mapped.Class21;
import mapped.Class22;
import mapped.Class220;
import mapped.Class227;
import mapped.Class2297;
import mapped.Class236;
import mapped.Class238;
import mapped.Class25;
import mapped.Class260;
import mapped.Class272;
import mapped.Class273;
import mapped.Class276;
import mapped.Class28;
import mapped.Strafe;
import mapped.BetterHotbar;
import mapped.Ambience;
import mapped.Chams;
import mapped.NoSoundLag;
import mapped.Criticals;
import mapped.AutoLog;
import mapped.AutoWalk;
import mapped.Tooltips;
import mapped.Class3225;
import mapped.AutoMount;
import mapped.Class3272;
import mapped.XRay;
import mapped.Class3293;
import mapped.Class3317;
import mapped.Class3377;
import mapped.Class3392;
import mapped.Class34;
import mapped.Class3426;
import mapped.Class3546;
import mapped.FastFall;
import mapped.FakeLatency;
import mapped.Class3630;
import mapped.Class3684;
import mapped.StorageESP;
import mapped.TickShift;
import mapped.Skybox;
import mapped.Class3730;
import mapped.Blink;
import mapped.Parkour;
import mapped.NoJumpDelay;
import mapped.Class3815;
import mapped.Class3816;
import mapped.Class3817;
import mapped.Notification;
import mapped.Class3850;
import mapped.FastPlace;
import mapped.Class3872;
import mapped.Class3904;
import mapped.NoGlitch;
import mapped.Crasher;
import mapped.Trajectories;
import mapped.Class3977;
import mapped.Class3978;
import mapped.Class3979;
import mapped.Class3990;
import mapped.Class3992;
import mapped.GodMode;
import mapped.Class4032;
import mapped.EntityControl;
import mapped.Class4074;
import mapped.Class41;
import mapped.Class4196;
import mapped.Nuker;
import mapped.PistonCrystal;
import mapped.Class4225;
import mapped.Class4244;
import mapped.AntiRegear;
import mapped.AntiAFK;
import mapped.AutoXP;
import mapped.AntiAliasing;
import mapped.Class451;
import mapped.Baritone;
import mapped.Server;
import mapped.Class4602;
import mapped.Class478;
import mapped.Class48;
import mapped.Class480;
import mapped.Class49;
import mapped.Class4971;
import mapped.Class51;
import mapped.Class52;
import mapped.Class523;
import mapped.Class526;
import mapped.Class54;
import mapped.Class5457;
import mapped.Class5467;
import mapped.Class549;
import mapped.Class550;
import mapped.Class551;
import mapped.Class5512;
import mapped.Class5643;
import mapped.Class5648;
import mapped.Class5649;
import mapped.Class5669;
import mapped.Class5688;
import mapped.Class57;
import mapped.Class570;
import mapped.Class576;
import mapped.Class578;
import mapped.Class5944;
import mapped.Class597;
import mapped.Class605;
import mapped.Class606;
import mapped.Class6060;
import mapped.Class61;
import mapped.Class6127;
import mapped.Class613;
import mapped.Class6134;
import mapped.Class614;
import mapped.Class621;
import mapped.Class6228;
import mapped.Class623;
import mapped.Class6252;
import mapped.Class6283;
import mapped.Class63;
import mapped.Class630;
import mapped.Class6315;
import mapped.Class6398;
import mapped.Class64;
import mapped.Class67;
import mapped.Class684;
import mapped.Class689;
import mapped.Class692;
import mapped.Class699;
import mapped.Class729;
import mapped.Class752;
import mapped.Class760;
import mapped.Class77;
import mapped.Class778;
import mapped.Class79;
import mapped.Class8;
import mapped.Class829;
import mapped.Class85;
import mapped.Class854;
import mapped.Class89;
import mapped.Class906;
import mapped.Class909;
import mapped.Class91;
import mapped.Class925;
import mapped.Class926;
import mapped.Class942;
import mapped.Class947;
import mapped.Class95;

public class Class4124 {
    public static int method20553(int n2, int n3, Class613 class613, Class1440 class1440) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7F384F88) & ~n4);
    }

    public static int method20554(int n2, int n3, Class6252 class6252, Class77 class77) {
        int n4 = n2 ^ 0xD0231DF2;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20555(int n2, int n3, Class5457 class5457, EntityControl class407) {
        int n4 = n2 ^ 0xEF7BD7DB;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20556(int n2, int n3, NoGlitch class391, Server class453) {
        int n4 = n2 ^ 0x301082D1;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20557(int n2, int n3, Class67 class67, Class3990 class3990) {
        int n4 = n2;
        return n4 & 0xC2A6873A | 0x3D5978C5 & ~n4;
    }

    public static int method20558(int n2, int n3, Class276 class276, Class692 class692) {
        int n4 = n2;
        return n4 & 0xD5D44C28 | 0x2A2BB3D7 & ~n4;
    }

    public static int method20559(int n2, int n3, Class1198 class1198, Class578 class578) {
        return n2 ^ 0x63750F5D ^ n3;
    }

    public static int method20560(int n2, int n3, Class3426 class3426, PistonCrystal class421) {
        int n4 = n2;
        return (0x1C4270E1 | ~n4) - ~n4;
    }

    public static int method20561(int n2, int n3, Class480 class480, Class5669 class5669) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE547ADFF) & ~n4);
    }

    public static int method20562(int n2, int n3, AntiAliasing class448, Class191 class191) {
        return 169528335 + (n2 & 0xF5E533F0);
    }

    public static int method20563(int n2, int n3, Class576 class576, Class614 class614) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x41220440) & ~n4);
    }

    public static int method20564(int n2, int n3, Class1467 class1467, Class3815 class3815) {
        int n4 = n2;
        return (0x2D71ECC4 | ~n4) - ~n4;
    }

    public static int method20565(int n2, int n3, Class3730 class3730, Class6127 class6127) {
        return 167405361 + (n2 & 0xF60598CE);
    }

    public static int method20566(int n2, int n3, Class91 class91, Class1044 class1044) {
        return 858776674 + (n2 & 0xCCD01B9D);
    }

    public static int method20567(int n2, int n3, Class1621 class1621, Class621 class621) {
        return 184619631 + (n2 & 0xF4FEED90);
    }

    public static int method20568(int n2, int n3, Crasher class393, Class4124 class4124) {
        int n4 = n2 ^ 0xFFF7B77B;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20569(int n2, int n3, Class3850 class3850, Class1394 class1394) {
        int n4 = n2;
        return n4 & 0xC35D50F1 | 0x3CA2AF0E & ~n4;
    }

    public static int method20570(int n2, int n3, Class3546 class3546, Class5467 class5467) {
        return 454434269 + (n2 & 0xE4E9E222);
    }

    public static int method20571(int n2, int n3, Class689 class689, Class570 class570) {
        int n4 = n2;
        return (0x1ADCB55F | ~n4) - ~n4;
    }

    public static int method20572(int n2, int n3, AutoMount class324, Class227 class227) {
        int n4 = n2 ^ 0x133DDA31;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20573(int n2, int n3, Class3872 class3872, Class4244 class4244) {
        return 133816188 + (n2 & 0xF8062083);
    }

    public static int method20574(int n2, int n3, FastFall class355, Class623 class623) {
        int n4 = n2 ^ 0x9ADD5A48;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20575(int n2, int n3, Class4074 class4074, Class1561 class1561) {
        return n2 ^ 0x10CA1813;
    }

    public static int method20576(int n2, int n3, Class606 class606, Class3317 class3317) {
        int n4 = n2;
        return (0x2BBB81BD | ~n4) - ~n4;
    }

    public static int method20577(int n2, int n3, Class144 class144, Class236 class236) {
        return n2 ^ 0xFC19EFEF ^ n3;
    }

    public static int method20578(int n2, int n3, Class5649 class5649, Class570 class570) {
        int n4 = n2 ^ 0x234260;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20579(int n2, int n3, Class6398 class6398, Class1371 class1371) {
        int n4 = n2;
        return n4 & 0xD32878D9 | 0x2CD78726 & ~n4;
    }

    public static int method20580(int n2, int n3, Class4032 class4032, Class6315 class6315) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x8410223) & ~n4);
    }

    public static int method20581(int n2, int n3, Class1792 class1792, Class1533 class1533) {
        int n4 = n2;
        return (0xD579642 | ~n4) - ~n4;
    }

    public static int method20582(int n2, int n3, Class180 class180, Class238 class238) {
        int n4 = n2 ^ 0x87B8C44C;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20583(int n2, int n3, Class1745 class1745, Class3990 class3990) {
        int n4 = n2;
        return (0x2328D7BC | ~n4) - ~n4;
    }

    public static int method20584(int n2, int n3, Class57 class57, Class1745 class1745) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x3507E0A8) & ~n4);
    }

    public static int method20585(int n2, int n3, Class925 class925, Nuker class420) {
        int n4 = n2 ^ 0x57542388;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20586(int n2, int n3, Class526 class526, Class1468 class1468) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x52BEF870) & ~n4);
    }

    public static int method20587(int n2, int n3, Class630 class630, Class1320 class1320) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE1386683) & ~n4);
    }

    public static int method20588(int n2, int n3, Class3684 class3684, Class63 class63) {
        int n4 = n2;
        return (n4 | 0xBD64B3) & (0xFF429B4C | ~n4);
    }

    public static int method20589(int n2, int n3, Class605 class605, Class1254 class1254) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xBDE957A9) & ~n4);
    }

    public static int method20590(int n2, int n3, Class3817 class3817, Class3630 class3630) {
        int n4 = n2 ^ 0xBACECF7F;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20591(int n2, int n3, Class64 class64, Class906 class906) {
        int n4 = n2;
        return n4 & 0xE0866015 | 0x1F799FEA & ~n4;
    }

    public static int method20592(int n2, int n3, BetterHotbar class283, Class169 class169) {
        int n4 = n2;
        return n4 & 0xCCA770CF | 0x33588F30 & ~n4;
    }

    public static int method20593(int n2, int n3, Class260 class260, Class5512 class5512) {
        return n2 ^ 0x2A720475;
    }

    public static int method20594(int n2, int n3, Class926 class926, Class551 class551) {
        int n4 = n2 ^ 0xCF89552F;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20595(int n2, int n3, GodMode class403, Class1384 class1384) {
        int n4 = n2 ^ 0x6CA5F360;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20596(int n2, int n3, Class3377 class3377, Class140 class140) {
        int n4 = n2 ^ 0x6E43D542;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20597(int n2, int n3, Class1621 class1621, StorageESP class369) {
        int n4 = n2 ^ 0xEBD2B639;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20598(int n2, int n3, Class3317 class3317, Class34 class34) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x6DA7191) & ~n4);
    }

    public static int method20599(int n2, int n3, Class1736 class1736, FastPlace class386) {
        int n4 = n2 ^ 0xB1E5568D;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20600(int n2, int n3, Class25 class25, Class4602 class4602) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xAFEA9A2A) & ~n4);
    }

    public static int method20601(int n2, int n3, Class6134 class6134, NoSoundLag class303) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xCBC6BCD7) & ~n4);
    }

    public static int method20602(int n2, int n3, Class48 class48, Parkour class377) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xAD726F5E) & ~n4);
    }

    public static int method20603(int n2, int n3, Chams class298, EntityControl class407) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x2281A011) & ~n4);
    }

    public static int method20604(int n2, int n3, Class3992 class3992, Class523 class523) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x51E714A4) & ~n4);
    }

    public static int method20605(int n2, int n3, AutoWalk class313, Class28 class28) {
        int n4 = n2;
        return n4 & 0xC3380CAA | 0x3CC7F355 & ~n4;
    }

    public static int method20606(int n2, int n3, Class606 class606, AutoXP class446) {
        int n4 = n2;
        return n4 & 0xCA1D4642 | 0x35E2B9BD & ~n4;
    }

    public static int method20607(int n2, int n3, Class107 class107, FastFall class355) {
        return n2 ^ 0x36441E23;
    }

    public static int method20608(int n2, int n3, Baritone class452, TickShift class371) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x73575FFB) & ~n4);
    }

    public static int method20609(int n2, int n3, Class5688 class5688, Class760 class760) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xD5F33E68) & ~n4);
    }

    public static int method20610(int n2, int n3, Skybox class373, Class4225 class4225) {
        return 1058022560 + (n2 & 0xC0EFDB5F);
    }

    public static int method20611(int n2, int n3, Class478 class478, Class1789 class1789) {
        return n2 ^ 0xFFDDB7FF ^ n3;
    }

    public static int method20612(int n2, int n3, Class2297 class2297, Class778 class778) {
        int n4 = n2 ^ 0x120C2E0F;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20613(int n2, int n3, Class550 class550, Class451 class451) {
        int n4 = n2;
        return (0x23309694 | ~n4) - ~n4;
    }

    public static int method20614(int n2, int n3, Class188 class188, Class89 class89) {
        int n4 = n2 ^ 0x11D8116;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20615(int n2, int n3, Class22 class22, Class61 class61) {
        int n4 = n2 ^ 0x12802C00;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20616(int n2, int n3, Class3978 class3978, Class129 class129) {
        int n4 = n2;
        return (0xDE69F4F | ~n4) - ~n4;
    }

    public static int method20617(int n2, int n3, NoJumpDelay class381, Class95 class95) {
        int n4 = n2;
        return (n4 | 0x15C14D3C) & (0xEA3EB2C3 | ~n4);
    }

    public static int method20618(int n2, int n3, Class5643 class5643, Class1394 class1394) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x1811E88) & ~n4);
    }

    public static int method20619(int n2, int n3, Class13 class13, Class272 class272) {
        int n4 = n2 ^ 0xFFFEFF77;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20620(int n2, int n3, Class125 class125, AntiRegear class437) {
        int n4 = n2;
        return (n4 | 0x8EB10C2) & (0xF714EF3D | ~n4);
    }

    public static int method20621(int n2, int n3, Class3850 class3850, FakeLatency class357) {
        int n4 = n2 ^ 0x5FD616F6;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20622(int n2, int n3, Class152 class152, Class5648 class5648) {
        return 636811 + (n2 & 0xFFF64874);
    }

    public static int method20623(int n2, int n3, Class4971 class4971, Class51 class51) {
        int n4 = n2;
        return (0x1D0AF56A | ~n4) - ~n4;
    }

    public static int method20624(int n2, int n3, AntiAFK class443, Class909 class909) {
        return n2 ^ 0x71E30F2;
    }

    public static int method20625(int n2, int n3, Class15 class15, Class684 class684) {
        int n4 = n2;
        return (0x3F59C1E3 | ~n4) - ~n4;
    }

    public static int method20626(int n2, int n3, Class8 class8, Class227 class227) {
        int n4 = n2 ^ 0xB28525C;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20627(int n2, int n3, Class1108 class1108, Class1327 class1327) {
        return 132118196 + (n2 & 0xF820094B);
    }

    public static int method20628(int n2, int n3, Class1615 class1615, Class942 class942) {
        return 576370473 + (n2 & 0xDDA548D6);
    }

    public static int method20629(int n2, int n3, Class597 class597, Class139 class139) {
        return n2 ^ 0xF31CD2DF ^ n3;
    }

    public static int method20630(int n2, int n3, Ambience class290, Class54 class54) {
        int n4 = n2;
        return (n4 | 0x1E97D7E7) & (0xE1682818 | ~n4);
    }

    public static int method20631(int n2, int n3, Class220 class220, Class6228 class6228) {
        int n4 = n2;
        return (n4 | 0x125D5FB8) & (0xEDA2A047 | ~n4);
    }

    public static int method20632(int n2, int n3, Class829 class829, Class12 class12) {
        int n4 = n2 ^ 0x3F6716FF;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20633(int n2, int n3, Class127 class127, Class854 class854) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xA6A4868) & ~n4);
    }

    public static int method20634(int n2, int n3, Class3272 class3272, Class1804 class1804) {
        return n2 ^ 0x20C80492 ^ n3;
    }

    public static int method20635(int n2, int n3, Class67 class67, Class159 class159) {
        int n4 = n2;
        return (0x1FBEB663 | ~n4) - ~n4;
    }

    public static int method20636(int n2, int n3, Class171 class171, Class21 class21) {
        int n4 = n2 ^ 0xFE797EF7;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20637(int n2, int n3, Strafe class282, Class549 class549) {
        int n4 = n2 ^ 0x56EFDF77;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20638(int n2, int n3, Class85 class85, Class3392 class3392) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x5260D5AE) & ~n4);
    }

    public static int method20639(int n2, int n3, Class41 class41, Class3225 class3225) {
        return n2 ^ 0x79CE1DF7 ^ n3;
    }

    public static int method20640(int n2, int n3, Class165 class165, Class106 class106) {
        int n4 = n2;
        return (n4 | 0x2CFBF688) & (0xD3040977 | ~n4);
    }

    public static int method20641(int n2, int n3, Class1742 class1742, Class190 class190) {
        int n4 = n2 ^ 0xD983C490;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20642(int n2, int n3, Class699 class699, Class3977 class3977) {
        int n4 = n2;
        return (0x37E577CC | ~n4) - ~n4;
    }

    public static int method20643(int n2, int n3, Class3816 class3816, XRay class329) {
        int n4 = n2 ^ 0x37984698;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20644(int n2, int n3, Criticals class307, Class3904 class3904) {
        int n4 = n2 ^ 0xCA5AC8B3;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20645(int n2, int n3, Class947 class947, Class192 class192) {
        int n4 = n2;
        return (n4 | 0x1059A548) & (0xEFA65AB7 | ~n4);
    }

    public static int method20646(int n2, int n3, Class6283 class6283, Class729 class729) {
        return n2 ^ 0x2F015C1C;
    }

    public static int method20647(int n2, int n3, Class3293 class3293, Class79 class79) {
        return 268630419 + (n2 & 0xEFFD066C);
    }

    public static int method20648(int n2, int n3, Class3979 class3979, Class49 class49) {
        int n4 = n2 ^ 0xFDF1DCFF;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20649(int n2, int n3, Class52 class52, Class1613 class1613) {
        int n4 = n2 ^ 0x9752BFCE;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20650(int n2, int n3, AutoLog class311, Tooltips class318) {
        return 193102784 + (n2 & 0xF47D7C3F);
    }

    public static int method20651(int n2, int n3, Class3815 class3815, Class5669 class5669) {
        int n4 = n2 ^ 0x7DEBA9DD;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20652(int n2, int n3, Class1695 class1695, Class1450 class1450) {
        return n2 ^ 0xDFF75EAE ^ n3;
    }

    public static int method20653(int n2, int n3, Class5944 class5944, Class752 class752) {
        int n4 = n2;
        return (0x13F6D7 | ~n4) - ~n4;
    }

    public static int method20654(int n2, int n3, Notification class382, Class550 class550) {
        int n4 = n2;
        return (n4 | 0x2EDA63A5) & (0xD1259C5A | ~n4);
    }

    public static int method20655(int n2, int n3, Class6060 class6060, Class4196 class4196) {
        int n4 = n2 ^ 0x22595914;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20656(int n2, int n3, Blink class376, Class273 class273) {
        return n2 ^ 0x7EFEBFF7 ^ n3;
    }

    public static int method20657(int n2, int n3, Trajectories class397, Class1806 class1806) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x254203D3) & ~n4);
    }
}

