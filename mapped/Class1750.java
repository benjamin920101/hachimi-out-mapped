/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class127;
import mapped.Class161;
import mapped.Class265;
import mapped.PacketCanceler;
import mapped.Timer;
import mapped.ESP;
import mapped.Scaffold;
import mapped.Class525;
import mapped.Class574;
import mapped.Class6074;
import mapped.Class926;
import mapped.Class94;

public class Class1750 {
    public static int method15693(int n2, int n3, ESP class360, Class525 class525) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x9AE23EC8) & ~n4);
    }

    public static int method15694(int n2, int n3, PacketCanceler class294, Class127 class127) {
        return 616339853 + (n2 & 0xDB436672);
    }

    public static int method15695(int n2, int n3, Class161 class161, Class6074 class6074) {
        int n4 = n3;
        return n4 + ((n2 ^ 0) & ~n4);
    }

    public static int method15696(int n2, int n3, Class94 class94, Class926 class926) {
        int n4 = n3;
        return n4 + ((n2 ^ 0xA470F024) & ~n4);
    }

    public static int method15697(int n2, int n3, Scaffold class431, Timer class335) {
        int n4 = n2 ^ 0xB88E1540;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }

    public static int method15698(int n2, int n3, Class265 class265, Class574 class574) {
        int n4 = n2 ^ 0x5997D8E7;
        int n5 = n3;
        return (n4 | n5) & (~n5 | ~n4);
    }
}

