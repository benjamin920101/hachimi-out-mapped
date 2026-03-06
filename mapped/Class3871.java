/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1394;
import mapped.Class1503;
import mapped.Class154;
import mapped.Class1662;
import mapped.Class250;
import mapped.AutoFish;
import mapped.CombatHUD;
import mapped.PistonCrystal;
import mapped.Class4244;
import mapped.Class521;
import mapped.Class5496;
import mapped.Class5643;
import mapped.Class5860;
import mapped.Class686;

public class Class3871 {
    public static int method19071(int n2, int n3, Class5496 class5496, CombatHUD class356) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x87C9ECFA) & ~n4);
    }

    public static int method19072(int n2, int n3, AutoFish class330, Class686 class686) {
        int n4 = n2 ^ 0x67A7CA3A;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method19073(int n2, int n3, Class5643 class5643, PistonCrystal class421) {
        int n4 = n2;
        return (0x8118E3B | ~n4) - ~n4;
    }

    public static int method19074(int n2, int n3, Class1662 class1662, Class250 class250) {
        int n4 = n2 ^ 0xFF0C7011;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method19075(int n2, int n3, Class1394 class1394, Class5860 class5860) {
        int n4 = n2 ^ 0x25B66060;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method19076(int n2, int n3, Class154 class154, Class1503 class1503) {
        int n4 = n2 ^ 0x5C741EEA;
        return (n3 | ~n4) - ~n4;
    }

    public static int method19077(int n2, int n3, Class521 class521, Class4244 class4244) {
        return n2 ^ 0x157A2846;
    }
}

