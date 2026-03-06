/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class10;
import mapped.Class1011;
import mapped.Class103;
import mapped.Class1041;
import mapped.Class109;
import mapped.Class1097;
import mapped.Class11;
import mapped.Class110;
import mapped.Class118;
import mapped.Class1198;
import mapped.Class120;
import mapped.Class121;
import mapped.Class1254;
import mapped.Class130;
import mapped.Class1338;
import mapped.Class1345;
import mapped.Class136;
import mapped.Class1394;
import mapped.Class144;
import mapped.Class1447;
import mapped.Class1448;
import mapped.Class1467;
import mapped.Class147;
import mapped.Class1485;
import mapped.Class151;
import mapped.Class1530;
import mapped.Class1533;
import mapped.Class1561;
import mapped.Class1567;
import mapped.Class1600;
import mapped.Class1660;
import mapped.Class1694;
import mapped.Class1706;
import mapped.Class1742;
import mapped.Class176;
import mapped.Class1763;
import mapped.Class1804;
import mapped.Class201;
import mapped.Class202;
import mapped.Class206;
import mapped.Class209;
import mapped.Class214;
import mapped.Class215;
import mapped.Class227;
import mapped.Class231;
import mapped.Class236;
import mapped.Class242;
import mapped.Class260;
import mapped.Class269;
import mapped.Class271;
import mapped.Class278;
import mapped.Class28;
import mapped.BetterHotbar;
import mapped.NoRotate;
import mapped.Nametags;
import mapped.EntitySpeed;
import mapped.FastProjectile;
import mapped.Class3;
import mapped.NoSoundLag;
import mapped.AutoLog;
import mapped.Class3225;
import mapped.Class3234;
import mapped.TextRadar;
import mapped.Class3259;
import mapped.Class3261;
import mapped.Class3283;
import mapped.Tracers;
import mapped.PacketLogger;
import mapped.Class3455;
import mapped.Class3535;
import mapped.AnvilRename;
import mapped.Class3586;
import mapped.Class3592;
import mapped.Class3614;
import mapped.Class3628;
import mapped.Class3630;
import mapped.Class3647;
import mapped.Class3684;
import mapped.TickShift;
import mapped.PredictPath;
import mapped.Class3797;
import mapped.Class3814;
import mapped.Class3845;
import mapped.XCarry;
import mapped.Class3879;
import mapped.Class3904;
import mapped.Class3907;
import mapped.Class3919;
import mapped.Crasher;
import mapped.Class3933;
import mapped.Class3935;
import mapped.Class3937;
import mapped.Trajectories;
import mapped.FastSwim;
import mapped.MainHand;
import mapped.Class4045;
import mapped.Breadcrumbs;
import mapped.EntityControl;
import mapped.Class4087;
import mapped.Class4110;
import mapped.Class4122;
import mapped.Class414;
import mapped.Class4146;
import mapped.Follower;
import mapped.Class4244;
import mapped.Class4257;
import mapped.Class4258;
import mapped.Class427;
import mapped.Blocker;
import mapped.AntiAliasing;
import mapped.Server;
import mapped.Kit;
import mapped.Class461;
import mapped.Class468;
import mapped.Class475;
import mapped.Class526;
import mapped.Class53;
import mapped.Class54;
import mapped.Class545;
import mapped.Class5450;
import mapped.Class547;
import mapped.Class5477;
import mapped.Class549;
import mapped.Class5490;
import mapped.Class5504;
import mapped.Class5628;
import mapped.Class5668;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class581;
import mapped.Class5837;
import mapped.Class585;
import mapped.Class5852;
import mapped.Class5887;
import mapped.Class59;
import mapped.Class5931;
import mapped.Class601;
import mapped.Class606;
import mapped.Class607;
import mapped.Class6074;
import mapped.Class6090;
import mapped.Class610;
import mapped.Class6188;
import mapped.Class619;
import mapped.Class6228;
import mapped.Class623;
import mapped.Class624;
import mapped.Class6253;
import mapped.Class6274;
import mapped.Class6286;
import mapped.Class632;
import mapped.Class6404;
import mapped.Class668;
import mapped.Class68;
import mapped.Class685;
import mapped.Class687;
import mapped.Class689;
import mapped.Class695;
import mapped.Class698;
import mapped.Class710;
import mapped.Class75;
import mapped.Class789;
import mapped.Class798;
import mapped.Class89;
import mapped.Class90;
import mapped.Class909;
import mapped.Class92;
import mapped.Class937;
import mapped.Class942;
import mapped.Class97;

public class Class4065 {
    public static int method20158(int n2, int n3, Class3234 class3234, Crasher class393) {
        return 511829749 + (n2 & 0xE17E190A);
    }

    public static int method20159(int n2, int n3, Class1394 class1394, Follower class423) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xB8010400) & ~n4);
    }

    public static int method20160(int n2, int n3, Class3225 class3225, Class3261 class3261) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xC4CC23D3) & ~n4);
    }

    public static int method20161(int n2, int n3, Tracers class334, Class5490 class5490) {
        return 263885283 + (n2 & 0xF0456E1C);
    }

    public static int method20162(int n2, int n3, Class1561 class1561, Class151 class151) {
        return 677686066 + (n2 & 0xD79B54CD);
    }

    public static int method20163(int n2, int n3, Class242 class242, Class54 class54) {
        int n4 = n2;
        return (n4 | 0x1B4FC8C) & (0xFE4B0373 | ~n4);
    }

    public static int method20164(int n2, int n3, Nametags class287, Server class453) {
        int n4 = n2 ^ 0xF75D75FA;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20165(int n2, int n3, Class1345 class1345, Class3614 class3614) {
        int n4 = n2;
        return (n4 | 0x65FEA38) & (0xF9A015C7 | ~n4);
    }

    public static int method20166(int n2, int n3, EntityControl class407, Class6074 class6074) {
        return 340436696 + (n2 & 0xEBB55927);
    }

    public static int method20167(int n2, int n3, Class909 class909, Class685 class685) {
        int n4 = n2 ^ 0x2B788EBC;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20168(int n2, int n3, Class271 class271, Class236 class236) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x88840820) & ~n4);
    }

    public static int method20169(int n2, int n3, Class5504 class5504, Class260 class260) {
        return 219908681 + (n2 & 0xF2E475B6);
    }

    public static int method20170(int n2, int n3, Class278 class278, Class206 class206) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xD442FC34) & ~n4);
    }

    public static int method20171(int n2, int n3, Class3919 class3919, Class121 class121) {
        int n4 = n2 ^ 0xB4A9845E;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20172(int n2, int n3, Class607 class607, Class10 class10) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xB349C2F7) & ~n4);
    }

    public static int method20173(int n2, int n3, Class1254 class1254, Class1485 class1485) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xF7F3FFFD) & ~n4);
    }

    public static int method20174(int n2, int n3, Class28 class28, Class468 class468) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7B430BF7) & ~n4);
    }

    public static int method20175(int n2, int n3, Class176 class176, Class3586 class3586) {
        int n4 = n2 ^ 0x753E5486;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20176(int n2, int n3, EntitySpeed class289, Class269 class269) {
        int n4 = n2;
        return (n4 | 0x638B41) & (0xFF9C74BE | ~n4);
    }

    public static int method20177(int n2, int n3, Class5628 class5628, NoRotate class286) {
        return 61827620 + (n2 & 0xFC5095DB);
    }

    public static int method20178(int n2, int n3, Class103 class103, Class3283 class3283) {
        int n4 = n2 ^ 0x32210000;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20179(int n2, int n3, Class201 class201, Class623 class623) {
        return 739051125 + (n2 & 0xD3F2F98A);
    }

    public static int method20180(int n2, int n3, Class3907 class3907, Class6404 class6404) {
        return 622104274 + (n2 & 0xDAEB712D);
    }

    public static int method20181(int n2, int n3, Class109 class109, Class4122 class4122) {
        return n2 ^ 0xA20704 ^ n3;
    }

    public static int method20182(int n2, int n3, Class668 class668, Blocker class433) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x62281804) & ~n4);
    }

    public static int method20183(int n2, int n3, Class1804 class1804, Class68 class68) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x812863BB) & ~n4);
    }

    public static int method20184(int n2, int n3, TickShift class371, Class3535 class3535) {
        int n4 = n2;
        return (0x2C316602 | ~n4) - ~n4;
    }

    public static int method20185(int n2, int n3, Class526 class526, Class1097 class1097) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7E7DFFFF) & ~n4);
    }

    public static int method20186(int n2, int n3, Class1338 class1338, NoSoundLag class303) {
        return 489716090 + (n2 & 0xE2CF8685);
    }

    public static int method20187(int n2, int n3, Class1448 class1448, Class585 class585) {
        return 552118782 + (n2 & 0xDF175601);
    }

    public static int method20188(int n2, int n3, Class28 class28, Class5450 class5450) {
        return n2 ^ 0x39C3BF99;
    }

    public static int method20189(int n2, int n3, Class4146 class4146, Class59 class59) {
        int n4 = n2 ^ 0xB549D800;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20190(int n2, int n3, Class4258 class4258, Class698 class698) {
        int n4 = n2 ^ 0xE3DDFE9F;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20191(int n2, int n3, Class1533 class1533, Class5837 class5837) {
        int n4 = n2;
        return (0x2EF42D4F | ~n4) - ~n4;
    }

    public static int method20192(int n2, int n3, BetterHotbar class283, Class3935 class3935) {
        int n4 = n2;
        return (0x20790AAC | ~n4) - ~n4;
    }

    public static int method20193(int n2, int n3, Class1530 class1530, Class214 class214) {
        return 507298984 + (n2 & 0xE1C33B57);
    }

    public static int method20194(int n2, int n3, Class3455 class3455, Class3592 class3592) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x6830324E) & ~n4);
    }

    public static int method20195(int n2, int n3, Class687 class687, Class1600 class1600) {
        int n4 = n2 ^ 0xDB5E6FB6;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20196(int n2, int n3, Class4045 class4045, Class1742 class1742) {
        return n2 ^ 0x1034 ^ n3;
    }

    public static int method20197(int n2, int n3, Class5723 class5723, Class3933 class3933) {
        return 48159537 + (n2 & 0xFD2124CE);
    }

    public static int method20198(int n2, int n3, Class3630 class3630, FastProjectile class291) {
        return n2 ^ 0x99334BC3 ^ n3;
    }

    public static int method20199(int n2, int n3, Class97 class97, Trajectories class397) {
        int n4 = n2;
        return n4 & 0xD9AC2190 | 0x2653DE6F & ~n4;
    }

    public static int method20200(int n2, int n3, Class5852 class5852, AutoLog class311) {
        return 2235535 + (n2 & 0xFFDDE370);
    }

    public static int method20201(int n2, int n3, Class606 class606, Class136 class136) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xC7CFFF6A) & ~n4);
    }

    public static int method20202(int n2, int n3, PredictPath class378, PacketLogger class342) {
        return 463914528 + (n2 & 0xE45939DF);
    }

    public static int method20203(int n2, int n3, Class110 class110, Class144 class144) {
        int n4 = n2;
        return (0x39223335 | ~n4) - ~n4;
    }

    public static int method20204(int n2, int n3, Class1041 class1041, Class3814 class3814) {
        return 704818338 + (n2 & 0xD5FD535D);
    }

    public static int method20205(int n2, int n3, Class92 class92, Class698 class698) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x1D0EF9AD) & ~n4);
    }

    public static int method20206(int n2, int n3, Class789 class789, Class242 class242) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x448112) & ~n4);
    }

    public static int method20207(int n2, int n3, Class6188 class6188, Class601 class601) {
        return 452256962 + (n2 & 0xE50B1B3D);
    }

    public static int method20208(int n2, int n3, Class1011 class1011, Class4122 class4122) {
        int n4 = n2 ^ 0xFFAFFFBF;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20209(int n2, int n3, Class120 class120, Class427 class427) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xCF3EF57F) & ~n4);
    }

    public static int method20210(int n2, int n3, Class695 class695, Class147 class147) {
        int n4 = n2;
        return (n4 | 0x3FECA12C) & (0xC0135ED3 | ~n4);
    }

    public static int method20211(int n2, int n3, Class90 class90, Class209 class209) {
        int n4 = n2 ^ 0x4899000;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20212(int n2, int n3, AnvilRename class358, Class6253 class6253) {
        int n4 = n2;
        return (0x14EBBA6F | ~n4) - ~n4;
    }

    public static int method20213(int n2, int n3, Class3 class3, Class6090 class6090) {
        return n2 ^ 0x5B509 ^ n3;
    }

    public static int method20214(int n2, int n3, Class1706 class1706, Class3630 class3630) {
        int n4 = n2 ^ 0x60987254;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20215(int n2, int n3, Class4257 class4257, Class6286 class6286) {
        int n4 = n2;
        return (n4 | 0x262B0E1A) & (0xD9D4F1E5 | ~n4);
    }

    public static int method20216(int n2, int n3, Class632 class632, Class545 class545) {
        return 429003973 + (n2 & 0xE66DEB3A);
    }

    public static int method20217(int n2, int n3, Class619 class619, FastSwim class399) {
        return 420653301 + (n2 & 0xE6ED570A);
    }

    public static int method20218(int n2, int n3, Class5887 class5887, AntiAliasing class448) {
        int n4 = n2 ^ 0x107B9AA0;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20219(int n2, int n3, Class1763 class1763, Class5711 class5711) {
        int n4 = n2;
        return (0x3788A9B2 | ~n4) - ~n4;
    }

    public static int method20220(int n2, int n3, Class5668 class5668, Class11 class11) {
        int n4 = n2;
        return n4 & 0xFA69ADB9 | 0x5965246 & ~n4;
    }

    public static int method20221(int n2, int n3, Class610 class610, Class90 class90) {
        return 493856323 + (n2 & 0xE29059BC);
    }

    public static int method20222(int n2, int n3, Class798 class798, Class6274 class6274) {
        return 220453686 + (n2 & 0xF2DC24C9);
    }

    public static int method20223(int n2, int n3, Class3937 class3937, Class4110 class4110) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x71444200) & ~n4);
    }

    public static int method20224(int n2, int n3, Class75 class75, Class1694 class1694) {
        int n4 = n2;
        return (0x1705EB5A | ~n4) - ~n4;
    }

    public static int method20225(int n2, int n3, Class3845 class3845, Class3647 class3647) {
        int n4 = n2 ^ 0x860620;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20226(int n2, int n3, Class624 class624, TextRadar class325) {
        int n4 = n2 ^ 0x7D698523;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20227(int n2, int n3, MainHand class404, Class130 class130) {
        return n2 ^ 0x2E1DE27D;
    }

    public static int method20228(int n2, int n3, Class3879 class3879, Kit class454) {
        int n4 = n2;
        return (0x1972DB46 | ~n4) - ~n4;
    }

    public static int method20229(int n2, int n3, Class3628 class3628, Class1567 class1567) {
        return 131189116 + (n2 & 0xF82E3683);
    }

    public static int method20230(int n2, int n3, Class710 class710, Class3647 class3647) {
        int n4 = n2;
        return (n4 | 0x2052CD03) & (0xDFAD32FC | ~n4);
    }

    public static int method20231(int n2, int n3, Class1467 class1467, Class3904 class3904) {
        return n2 ^ 0x1E96057D;
    }

    public static int method20232(int n2, int n3, Class215 class215, Class937 class937) {
        return n2 ^ 0x10218AE ^ n3;
    }

    public static int method20233(int n2, int n3, Class89 class89, Class689 class689) {
        return 418805687 + (n2 & 0xE7098848);
    }

    public static int method20234(int n2, int n3, Class581 class581, Class3797 class3797) {
        int n4 = n2 ^ 0xB5A281ED;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method20235(int n2, int n3, Class227 class227, Class53 class53) {
        int n4 = n2;
        return (n4 | 0x25C172DD) & (0xDA3E8D22 | ~n4);
    }

    public static int method20236(int n2, int n3, Class118 class118, XCarry class387) {
        int n4 = n2 ^ 0xEFBBFFAD;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method20237(int n2, int n3, Class3259 class3259, Class1660 class1660) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x2563F8D1) & ~n4);
    }

    public static int method20238(int n2, int n3, Class231 class231, Class5931 class5931) {
        int n4 = n2 ^ 0xB5F934DB;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20239(int n2, int n3, Class1198 class1198, Class202 class202) {
        return 955090566 + (n2 & 0xC7127979);
    }

    public static int method20240(int n2, int n3, Class547 class547, Class5477 class5477) {
        int n4 = n2 ^ 0x3E2FD5D1;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20241(int n2, int n3, Class6228 class6228, Breadcrumbs class405) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE25C68EC) & ~n4);
    }

    public static int method20242(int n2, int n3, Class475 class475, Class942 class942) {
        int n4 = n2;
        return (n4 | 0x2B11DFC0) & (0xD4EE203F | ~n4);
    }

    public static int method20243(int n2, int n3, Class3684 class3684, Class1447 class1447) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x788BFFC0) & ~n4);
    }

    public static int method20244(int n2, int n3, Class75 class75, Class4244 class4244) {
        int n4 = n2;
        return (n4 | 0x141CF8E3) & (0xEBE3071C | ~n4);
    }

    public static int method20245(int n2, int n3, Class461 class461, Class414 class414) {
        int n4 = n2;
        return (0x260357E | ~n4) - ~n4;
    }

    public static int method20246(int n2, int n3, Class4087 class4087, Class549 class549) {
        int n4 = n2 ^ 0x3080006A;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }
}

