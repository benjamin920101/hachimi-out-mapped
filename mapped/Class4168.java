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

@HACHIMI_CLIENT(mv=100, d1={"\u50c5\u50c1\u50c4\u50c6\u50cd\u50c4\u50cc\u50cc", "\u9a24\u9a29\u9a27\u9a26\u9a29\u9a25\u9a23\u9a25", "\ube44\ube47\ube40\ube49\ube48\ube47\ube48\ube42", "\u6a36\u6a31\u6a35\u6a36\u6a35\u6a3b\u6a3b", "\u4440\u4440\u4449\u4447\u4448\u4442\u4447\u4445", "\u5e18\u5e1c\u5e19\u5e17\u5e19\u5e1f\u5e16\u5e16", "\u73a0\u73a3\u73a7\u73a3\u73a0\u73a5\u73a6\u73a4", "\ubfb4\ubfb3\ubfb1\ubfb5\ubfb3\ubfb3\ubfb9\ubfb7", "\u55b9\u55b9\u55bf\u55bd\u55bc\u55be\u55ba\u55bd", "\ub911\ub919\ub915\ub913\ub912\ub911\ub916", "\u0b6a\u0b6f\u0b6f\u0b6b\u0b68\u0b69\u0b67\u0b69", "\u66fb\u66fb\u66f0\u66fd\u66fc\u66fe\u66f0\u66f0", "\ud803\ud80e\ud80f\ud807\ud80f\ud805\ud800", "\uc116\uc110\uc110\uc11e\uc110\uc113\uc114\uc114", "\u94e8\u94e6\u94e1\u94e4\u94e3\u94e0\u94e4", "\u4f66\u4f67\u4f61\u4f62\u4f6d\u4f6d\u4f62\u4f61"}, d2={"\u012c\u013a\u0110\u214c\u017e\u017c\u016a\u010e\u0128\u0123\u0134\u0123\u016d\u012e\u0123\u012c\u0125\u016d\u0111\u0136\u0130\u012b\u012c\u0125\u0179\u016b\u010e\u0128\u0123\u0134\u0123\u016d\u012e\u0123\u012c\u0125\u016d\u0111\u0136\u0130\u012b\u012c\u0125\u0179", "\u05e6\u05f0\u05db\u2586\u05b4\u05b6\u05a0\u05c4\u05e2\u05e9\u05fe\u05e9\u05a7\u05e4\u05e9\u05e6\u05ef\u05a7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b3\u05a1\u05c4\u05e2\u05e9\u05fe\u05e9\u05a7\u05e4\u05e9\u05e6\u05ef\u05a7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b3", "\u0478\u0427\u0428\u042d\u042a\u042d\u0430\u047a\u0478\u047a\u046c\u046d\u0412", "\u0292\u02c7\u02c0\u02c7\u02da\u0290\u0292\u0290\u0286\u0287\u02f8", "\u0320\u0322\u0333\u0304\u032b\u0326\u0334\u0334\u037b\u0379\u036f\u036e\u030b\u032d\u0326\u0331\u0326\u0368\u032b\u0326\u0329\u0320\u0368\u0304\u032b\u0326\u0334\u0334\u037c", "\u0365\u036c\u037e\u0365\u034e\u0362\u0369\u0368\u0331\u0333\u0325\u0324\u0344", "\u07ec\u07f8\u07fc\u07e8\u07e5\u07fa\u07b5\u07b7\u07a1\u07c5\u07e3\u07e8\u07ff\u07e8\u07a6\u07e5\u07e8\u07e7\u07ee\u07a6\u07c6\u07eb\u07e3\u07ec\u07ea\u07fd\u07b2\u07a0\u07d3", "\u0718\u0717\u0714\u0715\u071e\u0747\u0745\u0753\u0752\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0734\u0719\u0711\u071e\u0718\u070f\u0740", "\u009f\u0084\u00b8\u009f\u0099\u0082\u0085\u008c\u00d7\u00d5\u00c3\u00c2\u00a7\u0081\u008a\u009d\u008a\u00c4\u0087\u008a\u0085\u008c\u00c4\u00b8\u009f\u0099\u0082\u0085\u008c\u00d0", "\u07b5\u07b4\u07af\u07b2\u07bd\u07a2\u07e7\u07e5\u07f3\u07f2\u078d", "\u063e\u063f\u0624\u0639\u0636\u0629\u0611\u063c\u063c\u066c\u066e\u0678\u0679\u0606", "\u0465\u0473\u047b\u0466\u042e\u042c\u043a\u043b\u0444", "\u0385\u0393\u039b\u0386\u03ce\u03cc\u03da\u03b8\u03db\u03a4", "\u05c6\u05d0\u05d8\u05c5\u0581\u058d\u058f\u0599\u05fb\u0598\u05e7", "\u02d5\u02c3\u02cb\u02d6\u029e\u029c\u028a\u02e8\u02eb\u028b\u02f4", "\u02ea\u02e5\u02e2\u02ed\u02e0\u02e5\u02f6\u02e9\u02b0\u02b2\u02a4\u02a5\u02da"})
public final class Class4168 {
    public static int field9708 = 94058046;
    public static double field9709;
    public static float field9710;
    public static float field9711;
    public static float field9712;
    public static double field9713 = 0.31412150359084545;

    static {
        h\u200e = "CURRENT";
        field9709 = Double.longBitsToDouble(4606931244395006616L);
        field9712 = Float.intBitsToFloat(1063354761);
        field9710 = Float.intBitsToFloat(1057828601);
        aA\u200e = "Disables anticheat checks";
        field9711 = Float.intBitsToFloat(1058130659);
    }

    private static String PGGcI7O9CbLCAPUq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite uOAZHd5ZnHqvqQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4168.PGGcI7O9CbLCAPUq(k2, 1762637881));
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
                int a2 = Integer.parseInt(Class4168.PGGcI7O9CbLCAPUq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4168.PGGcI7O9CbLCAPUq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4168.PGGcI7O9CbLCAPUq(k2, 1762637881) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

