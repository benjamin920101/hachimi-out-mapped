/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class2299;
import mapped.Class25;
import mapped.Class29;
import mapped.XRay;
import mapped.ESP;
import mapped.Class4089;
import mapped.Follower;
import mapped.Scaffold;
import mapped.Kit;
import mapped.Class529;
import mapped.Class559;
import mapped.Class571;
import mapped.Class607;
import mapped.Class691;

public class Class4655 {
    public static int method20951(int n2, int n3, ESP class360, Follower class423) {
        int n4 = n2;
        return (n4 | 0x3F2CF2D5) & (0xC0D30D2A | ~n4);
    }

    public static int method20952(int n2, int n3, Class571 class571, Kit class454) {
        int n4 = n2;
        return n4 & 0xD2D09C08 | 0x2D2F63F7 & ~n4;
    }

    public static int method20953(int n2, int n3, Class4089 class4089, XRay class329) {
        int n4 = n3;
        return n4 + ((n2 ^ 0x81610050) & ~n4);
    }

    public static int method20954(int n2, int n3, Class29 class29, Class691 class691) {
        int n4 = n2 ^ 0xFFDFFF57;
        return (n3 | ~n4) - ~n4;
    }

    public static int method20955(int n2, int n3, Scaffold class431, Class529 class529) {
        return 259008475 + (n2 & 0xF08FD824);
    }

    public static int method20956(int n2, int n3, Class607 class607, Class25 class25) {
        return 452270101 + (n2 & 0xE50AE7EA);
    }

    public static int method20957(int n2, int n3, Class2299 class2299, Class559 class559) {
        int n4 = n2 ^ 0x5002010;
        return (n3 | ~n4) - ~n4;
    }
}

