/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1738
 *  net.minecraft.class_1741
 *  net.minecraft.class_1799
 *  net.minecraft.class_1893
 *  net.minecraft.class_5321
 */
package mapped;

import mapped.Class248;
import mapped.Class279;
import mapped.Class4045;
import mapped.Class529;
import mapped.Class5659;
import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_5321;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class478
implements Comparable {
    private static long[] field2498 = new long[4];
    final Class279 field2499;
    private final class_1799 field2500;
    private final int field2501;
    private final int field2502;

    private static int method10759(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method10760(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public int method10761() {
        return this.field2502;
    }

    private static class_1799 method10762(Class478 class478) {
        return class478.method10773();
    }

    public int compareTo(Object object) {
        return this.method10771((Class478)object);
    }

    public static Class279 method10763(Class478 class478) {
        return class478.field2499;
    }

    private static Object method10764(Class248 class248) {
        return class248.method507();
    }

    static {
        Class478.method10768(3431018756098879080L);
    }

    public static Class279 method10765(Class478 class478) {
        return class478.field2499;
    }

    public static Class248 method10766(Class279 class279) {
        return class279.field410;
    }

    private static boolean method10767(Class279 class279, class_1799 class_17992, class_5321 class_53212) {
        return class279.method1302(class_17992, class_53212);
    }

    private static void method10768(long l2) {
        Class478.field2498[3] = l2 ^ 0x2F9D6D615EF9EE69L;
        Class478.field2498[2] = l2 ^ 0xD062929EA1061197L;
        Class478.field2498[0] = l2 ^ 0x2F9D6D615EF9EE6AL;
        Class478.field2498[1] = l2 ^ 0x2F9D6D615EF9EE68L;
    }

    private static class_5321 method10769(Class529 class529) {
        return class529.method10930();
    }

    public int method10770() {
        return this.field2501;
    }

    public int method10771(Class478 a2) {
        if (this.field2502 != a2.field2502) {
            return (int)field2498[1];
        }
        class_1799 b2 = Class478.method10762(a2);
        class_1738 c2 = (class_1738)this.field2500.method_7909();
        class_1738 d2 = (class_1738)b2.method_7909();
        int e2 = ((class_1741)c2.method_7686().comp_349()).method_48403(c2.method_48398()) - ((class_1741)d2.method_7686().comp_349()).method_48403(d2.method_48398());
        if (e2 != 0) {
            return e2;
        }
        class_5321 f2 = Class478.method10769((Class529)((Object)Class478.method10764(Class478.method10766(Class478.method10765(this)))));
        if (((Boolean)this.field2499.field404.method507()).booleanValue() && this.field2502 == (int)field2498[0] && this.field2499.method1302(this.field2500, class_1893.field_9107)) {
            return (int)field2498[2];
        }
        if (this.field2499.method1302(this.field2500, f2)) {
            if (Class478.method10767(this.field2499, b2, f2)) {
                int n2 = (int)field2498[1];
                return Class478.method10772(447498507, -1748445586);
            }
            return (int)field2498[2];
        }
        return Class478.method10763(this).method1302(b2, f2) ? (int)field2498[3] : (int)field2498[1];
    }

    private static int method10772(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    public class_1799 method10773() {
        return this.field2500;
    }

    public Class478(Class279 a2, int b2, int c2, class_1799 d2) {
        this.field2499 = a2;
        this.field2502 = b2;
        this.field2501 = c2;
        this.field2500 = d2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

