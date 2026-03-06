/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Chams;
import mapped.Class4122;

public class Class5643 {
    private static final String field10808 = "0123456789abcdef";
    private static long[] field10809 = new long[1];

    private static void method22063(long l2) {
        Class5643.field10809[0] = l2 ^ 0x131A84956A62CAC3L;
    }

    public static String method22064(int c2) {
        StringBuilder d2 = new StringBuilder(c2);
        int b2 = (int)field10809[0];
        while (true) {
            if (b2 >= c2) {
                Chams.method1924();
                return null;
            }
            int a2 = Class4122.field9560.nextInt("0123456789abcdef".length());
            d2.append("0123456789abcdef".charAt(a2));
            ++b2;
        }
    }

    static {
        Class5643.method22063(1376558413384960707L);
    }
}

