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

@HACHIMI_CLIENT(mv=100, d1={"\u743f\u743f\u7438\u7439\u743f\u743f\u7438\u7438", "\ue0d4\ue0d2\ue0d2\ue0d7\ue0d0\ue0d5\ue0de\ue0d1", "\u1a90\u1a91\u1a93\u1a93\u1a96\u1a9b\u1a91\u1a96", "\u8d61\u8d6b\u8d66\u8d62\u8d61\u8d61\u8d67\u8d67", "\u6ce3\u6ce7\u6ce6\u6ce1\u6ce6\u6ce4", "\u68a0\u68a1\u68ac\u68ac\u68a2\u68ad\u68ad\u68a1", "\u6c55\u6c55\u6c56\u6c54\u6c54\u6c51\u6c54\u6c53", "\ucb87\ucb87\ucb86\ucb87\ucb86\ucb80\ucb85\ucb8e", "\u0406\u0402\u0401\u0401\u0409\u0400\u0402\u0403", "\ucc6b\ucc6a\ucc6a\ucc6b\ucc65\ucc6b\ucc6f\ucc6b", "\ub343\ub344\ub347\ub346\ub347\ub346\ub344\ub344", "\u6a89\u6a87\u6a8e\u6a89\u6a8f\u6a8a\u6a8c\u6a8a", "\u0f28\u0f24\u0f2b\u0f2a\u0f24\u0f24\u0f25\u0f2e", "\u3eb8\u3eb8\u3eb7\u3ebb\u3eb6\u3ebe\u3eb6\u3ebc", "\u9a47\u9a47\u9a41\u9a43\u9a44\u9a45\u9a47\u9a45", "\u6362\u6367\u6365\u6362\u636e\u6360\u6365", "\u714a\u7146\u714e\u7149\u7146\u714e\u714a\u7149"}, d2={"\u030a\u0302\u032e\u2374\u0346\u0344\u0352\u0336\u0310\u031b\u030c\u031b\u0355\u0316\u031b\u0314\u031d\u0355\u0329\u030e\u0308\u0313\u0314\u031d\u0341\u0353\u0336\u0310\u031b\u030c\u031b\u0355\u0316\u031b\u0314\u031d\u0355\u0329\u030e\u0308\u0313\u0314\u031d\u0341", "\u0203\u020b\u0226\u227d\u024f\u024d\u025b\u023f\u0219\u0212\u0205\u0212\u025c\u021f\u0212\u021d\u0214\u025c\u0220\u0207\u0201\u021a\u021d\u0214\u0248\u025a\u023f\u0219\u0212\u0205\u0212\u025c\u021f\u0212\u021d\u0214\u025c\u0220\u0207\u0201\u021a\u021d\u0214\u0248", "\u025f\u0257\u0279\u2221\u0213\u0211\u0207\u0263\u0245\u024e\u0259\u024e\u0200\u0243\u024e\u0241\u0248\u0200\u027c\u025b\u025d\u0246\u0241\u0248\u0214\u0206\u0263\u0245\u024e\u0259\u024e\u0200\u0243\u024e\u0241\u0248\u0200\u027c\u025b\u025d\u0246\u0241\u0248\u0214", "\u0409\u0456\u0459\u045c\u045b\u045c\u0441\u040b\u0409\u040b\u041d\u041c\u0463", "\u03f5\u03a0\u03a7\u03a0\u03bd\u03f7\u03f5\u03f7\u03e1\u03e0\u039f", "\u07ba\u07b8\u07a9\u079e\u07b1\u07bc\u07ae\u07ae\u07e1\u07e3\u07f5\u07f4\u0791\u07b7\u07bc\u07ab\u07bc\u07f2\u07b1\u07bc\u07b3\u07ba\u07f2\u079e\u07b1\u07bc\u07ae\u07ae\u07e6", "\u06a1\u06a8\u06ba\u06a1\u068a\u06a6\u06ad\u06ac\u06f5\u06f7\u06e1\u06e0\u0680", "\u02cd\u02d9\u02dd\u02c9\u02c4\u02db\u0294\u0296\u0280\u02e4\u02c2\u02c9\u02de\u02c9\u0287\u02c4\u02c9\u02c6\u02cf\u0287\u02e7\u02ca\u02c2\u02cd\u02cb\u02dc\u0293\u0281\u02f2", "\u0780\u078f\u078c\u078d\u0786\u07df\u07dd\u07cb\u07ca\u07af\u0789\u0782\u0795\u0782\u07cc\u078f\u0782\u078d\u0784\u07cc\u07ac\u0781\u0789\u0786\u0780\u0797\u07d8", "\u0473\u0468\u0454\u0473\u0475\u046e\u0469\u0460\u043b\u0439\u042f\u042e\u044b\u046d\u0466\u0471\u0466\u0428\u046b\u0466\u0469\u0460\u0428\u0454\u0473\u0475\u046e\u0469\u0460\u043c", "\u0549\u0548\u0553\u054e\u0541\u055e\u051b\u0519\u050f\u050e\u0571", "\u0368\u0369\u0372\u036f\u0360\u037f\u0347\u036a\u036a\u033a\u0338\u032e\u032f\u0350", "\u0282\u0294\u029c\u0281\u02c9\u02cb\u02dd\u02dc\u02a3", "\f\u001a\u0012\u000fGES1R-", "\u0545\u0553\u055b\u0546\u0502\u050e\u050c\u051a\u0578\u051b\u0564", "\u06c6\u06d0\u06d8\u06c5\u068d\u068f\u0699\u06fb\u06f8\u0698\u06e7", "\u03b1\u03be\u03b9\u03b6\u03bb\u03be\u03ad\u03b2\u03eb\u03e9\u03ff\u03fe\u0381"})
public final class Class3470 {
    public static double field7598 = 0.9274410179896965;
    public static int field7599 = 957763888;

    private static String wfbawAUiYRcLj3bF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        b\u200e = "The exploit mode to use when crashing";
        aH\u200e = "VelocitySync";
        bD\u200e = "If target's health lower than this";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite jai7uaeMWMQjcD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3470.wfbawAUiYRcLj3bF(k2, 33609513));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 54484 : 54483;
        block6: while (true) {
            switch (n3) {
                case 54484: {
                    n3 = 54482;
                    continue block6;
                }
                case 54483: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3470.wfbawAUiYRcLj3bF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3470.wfbawAUiYRcLj3bF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3470.wfbawAUiYRcLj3bF(k2, 33609513) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

