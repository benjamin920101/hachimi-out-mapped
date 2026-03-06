/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1004;
import mapped.Class1011;
import mapped.Class170;
import mapped.Class220;
import mapped.Class250;
import mapped.PacketCanceler;
import mapped.Debug;
import mapped.PacketEat;
import mapped.ArmorAlert;
import mapped.NoMineAnimation;
import mapped.Phase;
import mapped.Socials;
import mapped.Class530;
import mapped.Class5473;
import mapped.Class5478;
import mapped.Class553;
import mapped.Class637;
import mapped.Class6435;

public class Class1737 {
    public static int method15509(int n2, int n3, Socials class458, Debug class300) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x87834597) & ~n4);
    }

    public static int method15510(int n2, int n3, Phase class445, Class6435 class6435) {
        int n4 = n2 ^ 0x1E380000;
        return (n3 | ~n4) - ~n4;
    }

    public static int method15511(int n2, int n3, PacketCanceler class294, NoMineAnimation class400) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xE0911405) & ~n4);
    }

    public static int method15512(int n2, int n3, PacketEat class372, Class220 class220) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x1AEE5D9) & ~n4);
    }

    public static int method15513(int n2, int n3, Class530 class530, ArmorAlert class398) {
        int n4 = n2 ^ 0xC7FDFF7F;
        return (n3 | ~n4) - ~n4;
    }

    public static int method15514(int n2, int n3, Class553 class553, Class5473 class5473) {
        int n4 = n2;
        return n4 & 0xD1076011 | 0x2EF89FEE & ~n4;
    }

    public static int method15515(int n2, int n3, Class5478 class5478, Class250 class250) {
        return 498513045 + (n2 & 0xE2494B6A);
    }

    public static int method15516(int n2, int n3, Class170 class170, Class1011 class1011) {
        return 234090722 + (n2 & 0xF20C0F1D);
    }

    public static int method15517(int n2, int n3, Class637 class637, Class1004 class1004) {
        return n2 ^ 0x168C84FB;
    }
}

