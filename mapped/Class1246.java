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

@HACHIMI_CLIENT(mv=100, d1={"\u2e70\u2e73\u2e73\u2e73\u2e72\u2e71\u2e71\u2e7c", "\u9bf5\u9bf5\u9bf3\u9bf2\u9bf0\u9bf0\u9bf7\u9bf6", "\u5e72\u5e74\u5e72\u5e74\u5e7e\u5e71\u5e77\u5e7e", "\u7df6\u7df6\u7dfd\u7df4\u7df6\u7df4\u7dfc\u7df0", "\u4b1d\u4b16\u4b1c\u4b1b\u4b1a\u4b16\u4b1a\u4b1e", "\udfbe\udfb2\udfbf\udfb2\udfbe\udfba\udfba\udfb8", "\u579b\u579f\u5797\u5798\u5797\u579a\u579b\u5796", "\u822a\u8225\u8228\u822b\u822a\u822b\u822b\u822c", "\u22b1\u22bb\u22b1\u22ba\u22bb\u22b7\u22b2\u22b3", "\u8b3d\u8b3c\u8b38\u8b34\u8b3c\u8b3a\u8b39", "\uacfe\uacfa\uacfd\uacf3\uacfb\uacfa\uacfe\uacff", "\ud1cd\ud1cb\ud1ca\ud1c6\ud1ce\ud1cd\ud1cb\ud1cc", "\ue6f4\ue6fb\ue6fb\ue6f3\ue6fb\ue6f6\ue6f1\ue6f7", "\u97b1\u97b0\u97b6\u97b1\u97b5\u97b5\u97bb\u97b6", "\uaba8\uaba7\uabae\uabaf\uabae\uaba7\uabaa\uabae", "\u791a\u791e\u7919\u7918\u791c\u7910\u7918\u791d"}, d2={"\u02ab\u02ae\u02ab\u22c7\u02f5\u02f7\u02e1\u0285\u02a3\u02a8\u02bf\u02a8\u02e6\u02a5\u02a8\u02a7\u02ae\u02e6\u029a\u02bd\u02bb\u02a0\u02a7\u02ae\u02f2\u02e0\u0285\u02a3\u02a8\u02bf\u02a8\u02e6\u02a5\u02a8\u02a7\u02ae\u02e6\u029a\u02bd\u02bb\u02a0\u02a7\u02ae\u02f2", "\u03f4\u03f1\u03f5\u2398\u03aa\u03a8\u03be\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad\u03bf\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad", "\u037c\u0323\u032c\u0329\u032e\u0329\u0334\u037e\u037c\u037e\u0368\u0369\u0316", "\u05fd\u05a8\u05af\u05a8\u05b5\u05ff\u05fd\u05ff\u05e9\u05e8\u0597", "\u0333\u0331\u0320\u0317\u0338\u0335\u0327\u0327\u0368\u036a\u037c\u037d\u0318\u033e\u0335\u0322\u0335\u037b\u0338\u0335\u033a\u0333\u037b\u0317\u0338\u0335\u0327\u0327\u036f", "\u06c3\u06ca\u06d8\u06c3\u06e8\u06c4\u06cf\u06ce\u0697\u0695\u0683\u0682\u06e2", "\u02f4\u02e0\u02e4\u02f0\u02fd\u02e2\u02ad\u02af\u02b9\u02dd\u02fb\u02f0\u02e7\u02f0\u02be\u02fd\u02f0\u02ff\u02f6\u02be\u02de\u02f3\u02fb\u02f4\u02f2\u02e5\u02aa\u02b8\u02cb", "\u0273\u027c\u027f\u027e\u0275\u022c\u022e\u0238\u0239\u025c\u027a\u0271\u0266\u0271\u023f\u027c\u0271\u027e\u0277\u023f\u025f\u0272\u027a\u0275\u0273\u0264\u022b", "\u07bd\u07a6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f5\u07f7\u07e1\u07e0\u0785\u07a3\u07a8\u07bf\u07a8\u07e6\u07a5\u07a8\u07a7\u07ae\u07e6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f2", "\u0391\u0390\u038b\u0396\u0399\u0386\u03c3\u03c1\u03d7\u03d6\u03a9", "\u0578\u0579\u0562\u057f\u0570\u056f\u0557\u057a\u057a\u052a\u0528\u053e\u053f\u0540", "\u0774\u0762\u076a\u0777\u073f\u073d\u072b\u072a\u0755", "\u066f\u0679\u0671\u066c\u0624\u0626\u0630\u0652\u0631\u064e", "\u0017\u0001\t\u0014P\\^H*I6", "\u0268\u027e\u0276\u026b\u0223\u0221\u0237\u0255\u0256\u0236\u0249", "\u0444\u044b\u044c\u0443\u044e\u044b\u0458\u0447\u041e\u041c\u040a\u040b\u0474"})
public final class Class1246 {
    public static double field4886;
    public static double field4887;
    public static double field4888;
    public static float field4889;

    static {
        field4889 = Float.intBitsToFloat(1055684286);
        z\u200e = "Displays the player's held items";
        field4886 = Double.longBitsToDouble(4593717086634743064L);
        O\u200e = "\"";
        field4888 = Double.longBitsToDouble(4594903675346358084L);
        field4887 = Double.longBitsToDouble(4601981498708090010L);
    }

    private static String BObCd8Dwbrt1efgU(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jI8ftaoDL7YbJ3(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1246.BObCd8Dwbrt1efgU(k2, -1906950825));
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
                int a2 = Integer.parseInt(Class1246.BObCd8Dwbrt1efgU(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1246.BObCd8Dwbrt1efgU(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1246.BObCd8Dwbrt1efgU(k2, -1906950825) + " " + l2 + " " + m2);
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

