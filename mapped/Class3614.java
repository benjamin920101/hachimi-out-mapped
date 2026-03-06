/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1503;
import mapped.Class171;
import mapped.Class199;
import mapped.FastProjectile;
import mapped.AntiLevitation;
import mapped.BoatFly;
import mapped.LongJump;
import mapped.Class3978;
import mapped.Shaders;
import mapped.Replenish;
import mapped.Class4210;
import mapped.Blocker;
import mapped.Velocity;
import mapped.Class543;
import mapped.Class5628;
import mapped.Class5829;
import mapped.Class683;
import mapped.Class807;

public class Class3614 {
    public static int method17913(int n2, int n3, Shaders class402, Class171 class171) {
        int n4 = n2;
        return (n4 | 0x308497BD) & (0xCF7B6842 | ~n4);
    }

    public static int method17914(int n2, int n3, Class3978 class3978, AntiLevitation class308) {
        int n4 = n2 ^ 0x57078018;
        return (n3 | ~n4) - ~n4;
    }

    public static int method17915(int n2, int n3, Class4210 class4210, LongJump class383) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x7BD3DBEE) & ~n4);
    }

    public static int method17916(int n2, int n3, Class1503 class1503, Class5628 class5628) {
        int n4 = n2 ^ 0xD9DCB735;
        int n5 = n3;
        return n4 & ~n5 | n5 & ~n4;
    }

    public static int method17917(int n2, int n3, Class807 class807, Velocity class447) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xDFDBEAFF) & ~n4);
    }

    public static int method17918(int n2, int n3, Class543 class543, Class683 class683) {
        return n2 ^ 0x3F12A98A;
    }

    public static int method17919(int n2, int n3, Class199 class199, Replenish class408) {
        int n4 = n2;
        return (n4 | 0x2095DF89) & (0xDF6A2076 | ~n4);
    }

    public static int method17920(int n2, int n3, Blocker class433, BoatFly class328) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x71082) & ~n4);
    }

    public static int method17921(int n2, int n3, FastProjectile class291, Class5829 class5829) {
        return n2 ^ 0x4B179DC;
    }
}

