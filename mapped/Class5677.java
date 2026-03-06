/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1011;
import mapped.Class118;
import mapped.Class240;
import mapped.AutoArmor;
import mapped.Class29;
import mapped.FireworkBoost;
import mapped.AntiHunger;
import mapped.Particles;
import mapped.Class487;
import mapped.Class5450;
import mapped.Class626;
import mapped.Class69;

public class Class5677 {
    public static int method22365(int n2, int n3, Class1011 class1011, FireworkBoost class299) {
        int n4 = n2 ^ 0x92555E2A;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method22366(int n2, int n3, Class626 class626, AutoArmor class279) {
        int n4 = n2 ^ 0xC76436CE;
        return (n3 | ~n4) - ~n4;
    }

    public static int method22367(int n2, int n3, Class5450 class5450, Class487 class487) {
        return n2 ^ 0xFF3BF7FF ^ n3;
    }

    public static int method22368(int n2, int n3, Class29 class29, AntiHunger class326) {
        int n4 = n2;
        return (0x2C82976B | ~n4) - ~n4;
    }

    public static int method22369(int n2, int n3, Class118 class118, Particles class388) {
        int n4 = n2;
        return (0x4E6A73B | ~n4) - ~n4;
    }

    public static int method22370(int n2, int n3, Class240 class240, Class69 class69) {
        int n4 = n2 ^ 0x85000780;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

