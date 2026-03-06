/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_329
 *  net.minecraft.class_746
 *  net.minecraft.class_7591
 */
package mapped;

import mapped.Class1763;
import mapped.Class1807;
import mapped.Class3432;
import mapped.Class382;
import mapped.Class4074;
import mapped.Class4087;
import mapped.Class4122;
import mapped.Class457;
import mapped.Class5836;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_746;
import net.minecraft.class_7591;

public class Class1365 {
    public static final String field5264 = "\u00a7s[Hachimi] \u00a7r";
    private static long[] field5265 = new long[1];

    private static int method13918(int n2, int n3, Class3432 class3432, Class4074 class4074) {
        return Class4087.method20363(n2, n3, class3432, class4074);
    }

    public static void method13919(String a2) {
        Class1365.method13948(a2, (int)field5265[0]);
    }

    public static class_746 method13920(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static void method13921(class_1657 b2, String c2) {
        if (Class4122.field9561.field_1724 != null) {
            String a2 = "/msg " + b2.method_5477().getString() + " ";
            Class1365.method13920((class_310)Class4122.field9561).field_3944.method_45729(a2 + c2);
        }
    }

    public static class_746 method13922(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method13923(float f2) {
        Class5836.method22907(f2);
    }

    private static class_329 method13924(class_310 class_3102) {
        return Class1365.method13937(class_3102);
    }

    public static class_329 method13925(class_310 class_3102) {
        return class_3102.field_1705;
    }

    public static void method13926(String a2) {
        if (Class1365.method13928(Class4122.field9561) != null) {
            Class1365.method13922((class_310)Class4122.field9561).field_3944.method_45730(a2);
        }
    }

    public static class_746 method13927(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method13928(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method13929(String string, int n2) {
        Class1365.method13931(string, n2);
    }

    public static void method13930(String a2) {
        if (Class4122.field9561.field_1724 != null) {
            Class1365.method13939((class_310)Class4122.field9561).field_3944.method_45729(a2);
        }
    }

    static {
        Class1365.method13945(9118426492071100789L);
    }

    public static void method13931(String b2, int c2) {
        Class1365.method13942(Class382.INSTANCE, b2, c2);
        if (Class1365.method13940(Class1365.method13935())) {
            class_7591 a2 = new class_7591(Class457.method10620().method10621().intValue(), null, (class_2561)class_2561.method_43473(), "Hachimi");
            ((Class1763)Class1365.method13925(Class4122.field9561).method_1743()).method15699(class_2561.method_30163((String)b2), a2, c2);
        }
    }

    public static void method13932(class_1657 a2, String b2, Object ... c2) {
        Class1365.method13921(a2, String.format(b2, c2));
    }

    private static void method13933() {
        Class5836.method22885();
    }

    private static void method13934(String string) {
        Class1365.method13919(string);
    }

    public static Class382 method13935() {
        return Class382.INSTANCE;
    }

    public static void method13936(String a2) {
        Class1365.method13929(a2, (int)field5265[0]);
    }

    public static class_329 method13937(class_310 class_3102) {
        return class_3102.field_1705;
    }

    private static Class457 method13938() {
        return Class457.method10620();
    }

    private static class_746 method13939(class_310 class_3102) {
        return Class1365.method13927(class_3102);
    }

    private static boolean method13940(Class382 class382) {
        return class382.method5105();
    }

    public static void method13941(String a2, Object ... b2) {
        Class1365.method13919(String.format(a2, b2));
    }

    private static void method13942(Class382 class382, String string, int n2) {
        class382.method5103(string, n2);
    }

    private static void method13943() {
        Class1807.method15744();
    }

    public static void method13944(String a2, Object ... b2) {
        Class1365.method13941(String.valueOf(class_124.field_1061) + a2, b2);
    }

    private static void method13945(long l2) {
        Class1365.field5265[0] = l2 ^ 0x7E8B28954268C175L;
    }

    public static void method13946(String a2) {
        Class1365.method13934(String.valueOf(class_124.field_1061) + a2);
    }

    public static void method13947(String a2, Object ... b2) {
        Class1365.method13936(String.format(a2, b2));
    }

    public static void method13948(String b2, int c2) {
        Class1365.method13949().method5103(b2, c2);
        if (Class382.INSTANCE.method5105()) {
            class_7591 a2 = new class_7591(Class1365.method13938().method10621().intValue(), null, (class_2561)class_2561.method_43473(), "Hachimi");
            ((Class1763)Class1365.method13924(Class4122.field9561).method_1743()).method15699(class_2561.method_30163((String)("\u00a7s[Hachimi] \u00a7r" + b2)), a2, c2);
        }
    }

    public static Class382 method13949() {
        return Class382.INSTANCE;
    }
}

