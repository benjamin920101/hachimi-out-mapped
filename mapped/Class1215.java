/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_1941
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_265
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3726
 *  net.minecraft.class_4076
 *  net.minecraft.class_5329
 *  net.minecraft.class_631
 *  net.minecraft.class_638
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.util.ArrayList;
import java.util.List;
import mapped.Class1807;
import mapped.Class298;
import mapped.Class376;
import mapped.Class4122;
import mapped.Class5659;
import mapped.Class6454;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_1941;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_265;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3726;
import net.minecraft.class_4076;
import net.minecraft.class_5329;
import net.minecraft.class_631;
import net.minecraft.class_638;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1215 {
    private static long[] field4781;
    public static boolean $skidonion$998554842;

    private static void method13242() {
        Class1807.method15744();
    }

    private static boolean method13243() {
        return Class5659.method22194();
    }

    public static class_638 method13244(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method13245(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static boolean method13246(class_1297 a2, class_238 b2) {
        class_5329 c2 = new class_5329((class_1941)Class4122.field9561.field_1687, a2, b2, (boolean)field4781[1], Class1215::method13268);
        do {
            if (c2.hasNext()) continue;
            return (int)field4781[1] != 0;
        } while (((class_265)c2.next()).method_1110());
        return (int)field4781[4] != 0;
    }

    private static boolean method13247(class_2338 class_23382, boolean bl2, class_2248 class_22482) {
        return Class1215.method13264(class_23382, bl2, class_22482);
    }

    private static void method13248(long l2) {
        Class1215.field4781[4] = l2 ^ 0x8CBEA10D0D9EEC08L;
        Class1215.field4781[2] = l2 ^ 0x73415EF2F26113F6L;
        Class1215.field4781[0] = l2 ^ 0x8CBEA10D0D9EEC19L;
        Class1215.field4781[1] = l2 ^ 0x8CBEA10D0D9EEC09L;
        Class1215.field4781[3] = l2 ^ 0x8CBEA10D0D9EEC0BL;
    }

    public static class_315 method13249(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public static boolean method13250(class_2338 a2, boolean b2) {
        return Class1215.method13247(a2, b2, class_2246.field_10540);
    }

    public static class_310 method13251() {
        return Class4122.field9561;
    }

    private static boolean method13252(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method13253() {
        Class1807.method15744();
    }

    public static List method13254() {
        ArrayList<class_2818> d2 = new ArrayList<class_2818>();
        int e2 = (Integer)Class1215.method13249(Class4122.field9561).method_42503().method_41753();
        for (int c2 = e2 - 1 ^ 0xFFFFFFFF; c2 <= e2; ++c2) {
            for (int b2 = e2 - 1 ^ 0xFFFFFFFF; b2 <= e2; ++b2) {
                class_2818 a2 = Class1215.method13262().field_1687.method_2935().method_21730((int)Class4122.field9561.field_1724.method_23317() / (int)field4781[0] + c2, (int)Class4122.field9561.field_1724.method_23321() / (int)field4781[0] + b2);
                if (a2 == null) continue;
                d2.add(a2);
            }
        }
        return d2;
    }

    public static class_310 method13255() {
        return Class4122.field9561;
    }

    private static class_310 method13256() {
        return Class1215.method13251();
    }

    public static boolean method13257(class_2338 a2) {
        return Class1215.method13250(a2, (boolean)field4781[4]);
    }

    public static boolean method13258(class_2338 a2) {
        return (Class1215.method13266(Class4122.field9561).method_22347(a2) && !Class1215.method13265(Class1215.method13256()).method_22347(a2.method_10069((int)field4781[1], (int)field4781[2], (int)field4781[1])) && Class1215.method13244(Class1215.method13259()).method_22347(a2.method_10069((int)field4781[1], (int)field4781[4], (int)field4781[1])) && Class4122.field9561.field_1687.method_22347(a2.method_10069((int)field4781[1], (int)field4781[3], (int)field4781[1])) ? (int)field4781[4] : (int)field4781[1]) != 0;
    }

    public static class_310 method13259() {
        return Class4122.field9561;
    }

    private static void method13260() {
        Class298.method1924();
    }

    public static boolean method13261(double a2, double b2) {
        class_631 c2 = Class4122.field9561.field_1687.method_2935();
        if (c2 != null) {
            return c2.method_12123(class_4076.method_32204((double)a2), class_4076.method_32204((double)b2));
        }
        return (int)field4781[1] != 0;
    }

    static {
        ___.___(22, Class1215.class);
        ____.___22_280(Class1215.class);
    }

    public static class_310 method13262() {
        return Class4122.field9561;
    }

    private static boolean method13263() {
        return Class376.method4987();
    }

    public static boolean method13264(class_2338 a2, boolean b2, class_2248 c2) {
        if (a2 == null) {
            return (int)field4781[1] != 0;
        }
        if (!class_1937.method_25953((class_2338)a2)) {
            return (int)field4781[1] != 0;
        }
        if (!Class1215.method13255().field_1687.method_8320(a2).method_45474()) {
            return (int)field4781[1] != 0;
        }
        if (b2 && !Class4122.field9561.field_1687.method_8628(c2.method_9564(), a2, class_3726.method_16194())) {
            while (true) {
                // Infinite loop
            }
        }
        return (int)field4781[4] != 0;
    }

    public static class_638 method13265(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static class_638 method13266(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static List method13267() {
        ArrayList b2 = new ArrayList();
        for (class_2818 a2 : Class1215.method13254()) {
            b2.addAll(a2.method_12214().values());
        }
        return b2;
    }

    private static native class_265 method13268(class_2338.class_2339 var0, class_265 var1);

    private static native Object 1(char var0);
}

