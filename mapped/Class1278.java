/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class110;
import mapped.Class112;
import mapped.Class122;
import mapped.Class127;
import mapped.Class1338;
import mapped.Class1352;
import mapped.Class14;
import mapped.Class140;
import mapped.Class157;
import mapped.Class1610;
import mapped.Class179;
import mapped.Class183;
import mapped.Class194;
import mapped.Class206;
import mapped.Class219;
import mapped.Class2298;
import mapped.Class230;
import mapped.Class237;
import mapped.Class243;
import mapped.Class246;
import mapped.Class247;
import mapped.Class271;
import mapped.BetterHotbar;
import mapped.Crosshair;
import mapped.MaceSpoof;
import mapped.TextRadar;
import mapped.AntiHunger;
import mapped.Freecam;
import mapped.TickShift;
import mapped.AirPlace;
import mapped.Class3880;
import mapped.Class39;
import mapped.PhantomView;
import mapped.Class40;
import mapped.MultiTask;
import mapped.InventoryTweaks;
import mapped.Sprint;
import mapped.Class489;
import mapped.Class525;
import mapped.Class5444;
import mapped.Class5540;
import mapped.Class5649;
import mapped.Class576;
import mapped.Class5760;
import mapped.Class5790;
import mapped.Class5843;
import mapped.Class586;
import mapped.Class6060;
import mapped.Class616;
import mapped.Class628;
import mapped.Class65;
import mapped.Class682;
import mapped.Class688;
import mapped.Class699;
import mapped.Class702;
import mapped.Class704;
import mapped.Class707;
import mapped.Class712;

public class Class1278 {
    public static int method13577(int n2, int n3, Class5760 class5760, Class1338 class1338) {
        int n4 = n2 ^ 0xF37CB847;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method13578(int n2, int n3, Class616 class616, MultiTask class410) {
        return n2 ^ 0x1521B2F7;
    }

    public static int method13579(int n2, int n3, Class2298 class2298, Class699 class699) {
        int n4 = n2;
        return (0x34BEBB6 | ~n4) - ~n4;
    }

    public static int method13580(int n2, int n3, TickShift class371, Crosshair class285) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE9C20104) & ~n4);
    }

    public static int method13581(int n2, int n3, Freecam class365, Class586 class586) {
        int n4 = n2 ^ 0x57BFFFFF;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method13582(int n2, int n3, Class3880 class3880, Class707 class707) {
        int n4 = n2;
        return (0x1A40593C | ~n4) - ~n4;
    }

    public static int method13583(int n2, int n3, Class14 class14, Class112 class112) {
        return 1023347102 + (n2 & 0xC300F661);
    }

    public static int method13584(int n2, int n3, Class5444 class5444, Class1352 class1352) {
        int n4 = n2;
        return (0x39DD3F64 | ~n4) - ~n4;
    }

    public static int method13585(int n2, int n3, Class247 class247, Class65 class65) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE84B49E7) & ~n4);
    }

    public static int method13586(int n2, int n3, Class712 class712, Class157 class157) {
        int n4 = n2 ^ 0x5A92C4BA;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method13587(int n2, int n3, AntiHunger class326, Class127 class127) {
        return 394456468 + (n2 & 0xE87D126B);
    }

    public static int method13588(int n2, int n3, Class183 class183, Class237 class237) {
        return n2 ^ 0xA9F7FDBA ^ n3;
    }

    public static int method13589(int n2, int n3, Class525 class525, AirPlace class379) {
        return n2 ^ 0xFE93FEFF ^ n3;
    }

    public static int method13590(int n2, int n3, Class271 class271, InventoryTweaks class438) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7DFFFFFE) & ~n4);
    }

    public static int method13591(int n2, int n3, Class702 class702, Class243 class243) {
        return 235593092 + (n2 & 0xF1F5227B);
    }

    public static int method13592(int n2, int n3, Class237 class237, Class576 class576) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xC6678) & ~n4);
    }

    public static int method13593(int n2, int n3, Class140 class140, Class5790 class5790) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x76AF5EF3) & ~n4);
    }

    public static int method13594(int n2, int n3, Class194 class194, Class40 class40) {
        return n2 ^ 0x3865AC65;
    }

    public static int method13595(int n2, int n3, Class6060 class6060, Class5540 class5540) {
        int n4 = n2;
        return n4 & 0xFF02A1F0 | 0xFD5E0F & ~n4;
    }

    public static int method13596(int n2, int n3, PhantomView class396, Class5843 class5843) {
        return 269323477 + (n2 & 0xEFF2732A);
    }

    public static int method13597(int n2, int n3, Class179 class179, Class122 class122) {
        int n4 = n2;
        return n4 & 0xE23400CE | 0x1DCBFF31 & ~n4;
    }

    public static int method13598(int n2, int n3, Class682 class682, Sprint class442) {
        int n4 = n2 ^ 0xE5C7FE7B;
        return (n3 | ~n4) - ~n4;
    }

    public static int method13599(int n2, int n3, Class110 class110, Class219 class219) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xD524B2B8) & ~n4);
    }

    public static int method13600(int n2, int n3, Class704 class704, Class230 class230) {
        int n4 = n2;
        return n4 & 0xDB6F2032 | 0x2490DFCD & ~n4;
    }

    public static int method13601(int n2, int n3, Class1610 class1610, BetterHotbar class283) {
        int n4 = n2 ^ 0x4B52C058;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method13602(int n2, int n3, Class688 class688, Class489 class489) {
        return 10441923 + (n2 & 0xFF60AB3C);
    }

    public static int method13603(int n2, int n3, Class246 class246, Class5843 class5843) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x91814800) & ~n4);
    }

    public static int method13604(int n2, int n3, Class628 class628, Class5649 class5649) {
        int n4 = n2;
        return (0x26210137 | ~n4) - ~n4;
    }

    public static int method13605(int n2, int n3, Class206 class206, Class39 class39) {
        return n2 ^ 0x2F623CDA;
    }

    public static int method13606(int n2, int n3, TextRadar class325, MaceSpoof class322) {
        int n4 = n2;
        return n4 & 0xE5E928B8 | 0x1A16D747 & ~n4;
    }
}

