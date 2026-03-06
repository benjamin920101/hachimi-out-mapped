/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ucc06\ucc05\ucc06\ucc02\ucc02\ucc02\ucc0a\ucc0b", "\ubf86\ubf8f\ubf8e\ubf82\ubf84\ubf83\ubf81", "\u3ebc\u3eb9\u3ebf\u3eb8\u3ebd\u3ebc\u3ebe\u3ebb", "\u21a8\u21ab\u21ad\u21a8\u21a3\u21a3", "\ud526\ud52a\ud522\ud52a\ud527\ud525\ud527\ud52b", "\ua658\ua652\ua65d\ua65f\ua653\ua65b\ua65b\ua653", "\ud683\ud680\ud680\ud682\ud686\ud687\ud68b\ud682", "\u2af0\u2af1\u2af6\u2af5\u2af4\u2af6\u2af2\u2af6", "\uc53b\uc53e\uc53a\uc536\uc537\uc537\uc53f", "\ua0ef\ua0ee\ua0ea\ua0ed\ua0e9\ua0ec\ua0e1\ua0ee", "\ud867\ud864\ud861\ud861\ud864\ud86b", "\ub49f\ub496\ub498\ub496\ub499\ub49b\ub497\ub49b", "\u1817\u1813\u1811\u1811\u181c\u1811\u181d\u181c", "\u4ecc\u4ec3\u4ec2\u4ec2\u4eca\u4ecf\u4ecd\u4ec3", "\u9880\u9880\u9881\u988d\u9883\u9883\u9883\u9885", "\ua85b\ua859\ua85c\ua858\ua858\ua85b\ua85b\ua85a", "\u3635\u3637\u363d\u3631\u3634\u3635\u3632\u3632", "\u94bd\u94b0\u94ba\u94ba\u94bd\u94ba\u94b9\u94bb", "\u15c6\u15c1\u15c3\u15c3\u15c2\u15c2\u15c3\u15c1"}, d2={"\u0312\u0308\u0329\u236c\u035e\u035c\u034a\u032e\u0308\u0303\u0314\u0303\u034d\u030e\u0303\u030c\u0305\u034d\u0331\u0316\u0310\u030b\u030c\u0305\u0359\u034b\u032e\u0308\u0303\u0314\u0303\u034d\u030e\u0303\u030c\u0305\u034d\u0331\u0316\u0310\u030b\u030c\u0305\u0359", "NTr\u2030\u0002\u0000\u0016rT_H_\u0011R_PY\u0011mJLWPY\u0005\u0017rT_H_\u0011R_PY\u0011mJLWPY\u0005", "\u0181\u019b\u01bc\u21ff\u01cd\u01cf\u01d9\u01bd\u019b\u0190\u0187\u0190\u01de\u019d\u0190\u019f\u0196\u01de\u01a2\u0185\u0183\u0198\u019f\u0196\u01ca\u01d8\u01bd\u019b\u0190\u0187\u0190\u01de\u019d\u0190\u019f\u0196\u01de\u01a2\u0185\u0183\u0198\u019f\u0196\u01ca", "\u07e4\u07fe\u07da\u279a\u07a8\u07aa\u07bc\u07d8\u07fe\u07f5\u07e2\u07f5\u07bb\u07f8\u07f5\u07fa\u07f3\u07bb\u07c7\u07e0\u07e6\u07fd\u07fa\u07f3\u07af\u07bd\u07d8\u07fe\u07f5\u07e2\u07f5\u07bb\u07f8\u07f5\u07fa\u07f3\u07bb\u07c7\u07e0\u07e6\u07fd\u07fa\u07f3\u07af", "e\u007fZ\u201b)+=Y\u007ftct:yt{r:Fag|{r.<Y\u007ftct:yt{r:Fag|{r.", "\u0572\u052d\u0522\u0527\u0520\u0527\u053a\u0570\u0572\u0570\u0566\u0567\u0518", "\u06c5\u0690\u0697\u0690\u068d\u06c7\u06c5\u06c7\u06d1\u06d0\u06af", "\u01ad\u01af\u01be\u0189\u01a6\u01ab\u01b9\u01b9\u01f6\u01f4\u01e2\u01e3\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0189\u01a6\u01ab\u01b9\u01b9\u01f1", "\u0233\u023a\u0228\u0233\u0218\u0234\u023f\u023e\u0267\u0265\u0273\u0272\u0212", "\u076e\u077a\u077e\u076a\u0767\u0778\u0737\u0735\u0723\u0747\u0761\u076a\u077d\u076a\u0724\u0767\u076a\u0765\u076c\u0724\u0744\u0769\u0761\u076e\u0768\u077f\u0730\u0722\u0751", "\u010c\u0103\u0100\u0101\u010a\u0153\u0151\u0147\u0146\u0123\u0105\u010e\u0119\u010e\u0140\u0103\u010e\u0101\u0108\u0140\u0120\u010d\u0105\u010a\u010c\u011b\u0154", "\u0730\u072b\u0717\u0730\u0736\u072d\u072a\u0723\u0778\u077a\u076c\u076d\u0708\u072e\u0725\u0732\u0725\u076b\u0728\u0725\u072a\u0723\u076b\u0717\u0730\u0736\u072d\u072a\u0723\u077f", "\u0388\u0389\u0392\u038f\u0380\u039f\u03da\u03d8\u03ce\u03cf\u03b0", "\u0370\u0371\u036a\u0377\u0378\u0367\u035f\u0372\u0372\u0322\u0320\u0336\u0337\u0348", "\u0430\u0426\u042e\u0433\u047b\u0479\u046f\u046e\u0411", "\u0644\u0652\u065a\u0647\u060f\u060d\u061b\u0679\u061a\u0665", "\u04bd\u04ab\u04a3\u04be\u04fa\u04f6\u04f4\u04e2\u0480\u04e3\u049c", "\u0500\u0516\u051e\u0503\u054b\u0549\u055f\u053d\u053e\u055e\u0521", "\u031f\u0310\u0317\u0318\u0315\u0310\u0303\u031c\u0345\u0347\u0351\u0350\u032f"})
public final class Class1649 {
    public static float field6130 = Float.intBitsToFloat(1048955432);

    /*
     * Unable to fully structure code
     */
    private static CallSite SAjiF9aLnTvFIa(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1649.bXDTURjT98itgJd6(k, -1144104931));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 23826;
                ** GOTO lbl19
            }
            v0 = 23827;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 23825;
lbl19:
                // 3 sources

                switch (v0) {
                    case 23827: {
                        continue block7;
                    }
                    case 23826: {
                        try {
                            a = Integer.parseInt(Class1649.bXDTURjT98itgJd6(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1649.bXDTURjT98itgJd6(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1649.bXDTURjT98itgJd6(k, -1144104931) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String bXDTURjT98itgJd6(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aW\u200e = "texelSize";
        aZ\u200e = "ShiftTicks";
        be\u200e = "Allow baritone to use waterbuckets when falling";
        bj\u200e = "ExplodeSwitch";
        bu\u200e = "Destroy";
    }
}

