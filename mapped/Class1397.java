/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u3e22\u3e26\u3e22\u3e22\u3e2d\u3e2c\u3e21\u3e22", "\ue7a3\ue7a2\ue7a4\ue7a4\ue7a2\ue7a6\ue7a0\ue7aa", "\u931f\u9311\u9318\u9318\u9318\u931a\u931b\u931d", "\u51b1\u51b2\u51b5\u51bc\u51b7\u51b5\u51b5\u51bd", "\u62dd\u62de\u62d8\u62d8\u62d0\u62d1\u62d8\u62d8", "\uce9a\uce9b\uce96\uce9f\uce9b\uce96\uce9f\uce97", "\u216e\u216d\u216f\u216b\u2162\u216b\u216a\u2163", "\u518e\u5185\u518e\u518c\u518b\u518d\u518a\u518b", "\uc107\uc105\uc107\uc106\uc10c\uc107\uc10d\uc101", "\u663c\u6636\u6638\u663f\u663d\u663a\u6636\u6638", "\u0a1d\u0a14\u0a1d\u0a1a\u0a1b\u0a18\u0a14\u0a15", "\u1d8d\u1d8d\u1d85\u1d84\u1d8b\u1d89\u1d8e", "\u2611\u2617\u2617\u2613\u2614\u2615\u2615\u2614", "\u5dcc\u5dcd\u5dc8\u5dca\u5dce\u5dc9\u5dcf\u5dce"}, d2={"\u016f\u0130\u013f\u013a\u013d\u013a\u0127\u016d\u016f\u016d\u017b\u017a\u0105", "\u0017BEB_\u0015\u0017\u0015\u0003\u0002}", "sq`Wxugg(*<=X~ubu;xuzs;Wxugg/", "\u014e\u0147\u0155\u014e\u0165\u0149\u0142\u0143\u011a\u0118\u010e\u010f\u016f", "\u016b\u017f\u017b\u016f\u0162\u017d\u0132\u0130\u0126\u0142\u0164\u016f\u0178\u016f\u0121\u0162\u016f\u0160\u0169\u0121\u0141\u016c\u0164\u016b\u016d\u017a\u0135\u0127\u0154", "\u0252\u025d\u025e\u025f\u0254\u020d\u020f\u0219\u0218\u027d\u025b\u0250\u0247\u0250\u021e\u025d\u0250\u025f\u0256\u021e\u027e\u0253\u025b\u0254\u0252\u0245\u020a", "\u0783\u0798\u07a4\u0783\u0785\u079e\u0799\u0790\u07cb\u07c9\u07df\u07de\u07bb\u079d\u0796\u0781\u0796\u07d8\u079b\u0796\u0799\u0790\u07d8\u07a4\u0783\u0785\u079e\u0799\u0790\u07cc", "\u0493\u0492\u0489\u0494\u049b\u0484\u04c1\u04c3\u04d5\u04d4\u04ab", "\u07ab\u07aa\u07b1\u07ac\u07a3\u07bc\u0784\u07a9\u07a9\u07f9\u07fb\u07ed\u07ec\u0793", "\u0163\u0175\u017d\u0160\u0128\u012a\u013c\u013d\u0142", "\u009b\u008d\u0085\u0098\u00d0\u00d2\u00c4\u00a6\u00c5\u00ba", "\u0169\u017f\u0177\u016a\u012e\u0122\u0120\u0136\u0154\u0137\u0148", "\u015d\u014b\u0143\u015e\u0116\u0114\u0102\u0160\u0163\u0103\u017c", "\u0645\u064a\u064d\u0642\u064f\u064a\u0659\u0646\u061f\u061d\u060b\u060a\u0675"})
public final class Class1397 {
    public static double field5382;
    public static float field5383;
    public static int field5384 = -33339809;
    public static double field5385;
    public static long field5386 = 8915752286026572493L;
    public static float field5387;

    /*
     * WARNING - void declaration
     */
    private static CallSite EQ9J0vfXFD3DgQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1397.l6ywvaW42neRoKSL(k2, -1206067159));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1397.l6ywvaW42neRoKSL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1397.l6ywvaW42neRoKSL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1397.l6ywvaW42neRoKSL(k2, -1206067159) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field5383 = Float.intBitsToFloat(1062538564);
        field5387 = Float.intBitsToFloat(1052679326);
        field5385 = Double.longBitsToDouble(4606152944197634480L);
        field5382 = Double.longBitsToDouble(4604930618986332160L);
    }

    private static String l6ywvaW42neRoKSL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

