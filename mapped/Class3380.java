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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ua4d3\ua4d5\ua4d4\ua4d7\ua4d8\ua4d6\ua4d2\ua4d3", "\ua988\ua98b\ua98d\ua987\ua98a\ua98d\ua98c", "\u8571\u857f\u8571\u8573\u8574\u8570\u857f\u8574", "\ua969\ua96a\ua969\ua96c\ua96f\ua96f\ua965\ua96e", "\u441d\u441d\u441c\u4414\u4411\u4416\u441d", "\uabc3\uabcf\uabc1\uabc1\uabcf\uabc0\uabcf\uabc5", "\u7dad\u7daf\u7daa\u7daa\u7dae\u7daf\u7da3\u7dac", "\u720e\u720d\u720a\u7208\u7204\u7208\u720f\u7209", "\ud562\ud564\ud563\ud566\ud568\ud568\ud568", "\u932b\u932b\u932a\u932f\u9328\u932c\u932e\u932a", "\u69c6\u69c2\u69c2\u69c1\u69c0\u69c4\u69c8", "\u86ba\u86be\u86bc\u86bd\u86bb\u86ba\u86bc\u86bf", "\uad05\uad07\uad06\uad02\uad06\uad01\uad03\uad04", "\ud509\ud509\ud509\ud50f\ud509\ud508\ud508\ud509", "\u8f5a\u8f5d\u8f5c\u8f5a\u8f59\u8f5d\u8f5c\u8f5e", "\u5f20\u5f2b\u5f21\u5f20\u5f24\u5f21\u5f2a\u5f20"}, d2={"\u06c8\u06e5\u06da\u26a0\u0692\u0690\u0686\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u0568\u0545\u057b\u2500\u0532\u0530\u0526\u0542\u0564\u056f\u0578\u056f\u0521\u0562\u056f\u0560\u0569\u0521\u055d\u057a\u057c\u0567\u0560\u0569\u0535\u0527\u0542\u0564\u056f\u0578\u056f\u0521\u0562\u056f\u0560\u0569\u0521\u055d\u057a\u057c\u0567\u0560\u0569\u0535", "\u0090\u00cf\u00c0\u00c5\u00c2\u00c5\u00d8\u0092\u0090\u0092\u0084\u0085\u00fa", "\u0317\u0342\u0345\u0342\u035f\u0315\u0317\u0315\u0303\u0302\u037d", "\u022e\u022c\u023d\u020a\u0225\u0228\u023a\u023a\u0275\u0277\u0261\u0260\u0205\u0223\u0228\u023f\u0228\u0266\u0225\u0228\u0227\u022e\u0266\u020a\u0225\u0228\u023a\u023a\u0272", "\u014f\u0146\u0154\u014f\u0164\u0148\u0143\u0142\u011b\u0119\u010f\u010e\u016e", "\u03b2\u03a6\u03a2\u03b6\u03bb\u03a4\u03eb\u03e9\u03ff\u039b\u03bd\u03b6\u03a1\u03b6\u03f8\u03bb\u03b6\u03b9\u03b0\u03f8\u0398\u03b5\u03bd\u03b2\u03b4\u03a3\u03ec\u03fe\u038d", "\u05dc\u05d3\u05d0\u05d1\u05da\u0583\u0581\u0597\u0596\u05f3\u05d5\u05de\u05c9\u05de\u0590\u05d3\u05de\u05d1\u05d8\u0590\u05f0\u05dd\u05d5\u05da\u05dc\u05cb\u0584", "\u0362\u0379\u0345\u0362\u0364\u037f\u0378\u0371\u032a\u0328\u033e\u033f\u035a\u037c\u0377\u0360\u0377\u0339\u037a\u0377\u0378\u0371\u0339\u0345\u0362\u0364\u037f\u0378\u0371\u032d", "\u012e\u012f\u0134\u0129\u0126\u0139\u017c\u017e\u0168\u0169\u0116", "\u045b\u045a\u0441\u045c\u0453\u044c\u0474\u0459\u0459\u0409\u040b\u041d\u041c\u0463", "\u0769\u077f\u0777\u076a\u0722\u0720\u0736\u0737\u0748", "\u07a6\u07b0\u07b8\u07a5\u07ed\u07ef\u07f9\u079b\u07f8\u0787", "\u07fd\u07eb\u07e3\u07fe\u07ba\u07b6\u07b4\u07a2\u07c0\u07a3\u07dc", "\u046d\u047b\u0473\u046e\u0426\u0424\u0432\u0450\u0453\u0433\u044c", "\u0225\u022a\u022d\u0222\u022f\u022a\u0239\u0226\u027f\u027d\u026b\u026a\u0215"})
public final class Class3380 {
    public static int field7343 = 2;
    public static double field7344;
    public static float field7345;

    private static String 1yAouDrvYHQitDNd(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite rO0VF0F9SvnqEO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3380.1yAouDrvYHQitDNd(k2, -1942730485));
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
                int a2 = Integer.parseInt(Class3380.1yAouDrvYHQitDNd(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3380.1yAouDrvYHQitDNd(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3380.1yAouDrvYHQitDNd(k2, -1942730485) + " " + l2 + " " + m2);
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
        field7345 = Float.intBitsToFloat(1057329063);
        bd\u200e = "Fill";
        field7344 = Double.longBitsToDouble(4587451233364059104L);
        bs\u200e = "\u00a7s";
    }
}

