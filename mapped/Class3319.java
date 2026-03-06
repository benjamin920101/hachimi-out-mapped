/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u2d41\u2d47\u2d43\u2d47\u2d42\u2d40\u2d44\u2d46", "\u2b7e\u2b7d\u2b7f\u2b78\u2b7a\u2b7c\u2b7d\u2b79", "\u213f\u2133\u213b\u213e\u2132\u213f\u213f\u2133", "\u6555\u6551\u6551\u6558\u6555\u6554\u6551\u6555", "\u37cb\u37cc\u37c9\u37ce\u37cf\u37cf\u37ca\u37c6", "\ucde3\ucde5\ucde8\ucde5\ucde4\ucde3\ucde7", "\ud570\ud572\ud576\ud577\ud57e\ud57e\ud577\ud570", "\uc844\uc841\uc845\uc840\uc842\uc849\uc848\uc844", "fj`fckk", "\ucd02\ucd00\ucd05\ucd0a\ucd02\ucd03\ucd0b\ucd07", "\u5120\u5124\u5124\u5127\u5124\u5120\u5122\u5121", "\u4266\u4262\u426d\u4267\u4262\u4263\u4260\u4260", "\u8b66\u8b64\u8b65\u8b60\u8b6a\u8b61\u8b67\u8b66", "\u15a9\u15af\u15ae\u15af\u15a8\u15ab\u15aa\u15ae"}, d2={"\u01b4\u01eb\u01e4\u01e1\u01e6\u01e1\u01fc\u01b6\u01b4\u01b6\u01a0\u01a1\u01de", "\u0778\u072d\u072a\u072d\u0730\u077a\u0778\u077a\u076c\u076d\u0712", "\u03e5\u03e7\u03f6\u03c1\u03ee\u03e3\u03f1\u03f1\u03be\u03bc\u03aa\u03ab\u03ce\u03e8\u03e3\u03f4\u03e3\u03ad\u03ee\u03e3\u03ec\u03e5\u03ad\u03c1\u03ee\u03e3\u03f1\u03f1\u03b9", "\u0423\u042a\u0438\u0423\u0408\u0424\u042f\u042e\u0477\u0475\u0463\u0462\u0402", "\u0317\u0303\u0307\u0313\u031e\u0301\u034e\u034c\u035a\u033e\u0318\u0313\u0304\u0313\u035d\u031e\u0313\u031c\u0315\u035d\u033d\u0310\u0318\u0317\u0311\u0306\u0349\u035b\u0328", "\u01e5\u01ea\u01e9\u01e8\u01e3\u01ba\u01b8\u01ae\u01af\u01ca\u01ec\u01e7\u01f0\u01e7\u01a9\u01ea\u01e7\u01e8\u01e1\u01a9\u01c9\u01e4\u01ec\u01e3\u01e5\u01f2\u01bd", "\u0291\u028a\u02b6\u0291\u0297\u028c\u028b\u0282\u02d9\u02db\u02cd\u02cc\u02a9\u028f\u0284\u0293\u0284\u02ca\u0289\u0284\u028b\u0282\u02ca\u02b6\u0291\u0297\u028c\u028b\u0282\u02de", "\u06ce\u06cf\u06d4\u06c9\u06c6\u06d9\u069c\u069e\u0688\u0689\u06f6", "\u0256\u0257\u024c\u0251\u025e\u0241\u0279\u0254\u0254\u0204\u0206\u0210\u0211\u026e", "\u06a4\u06b2\u06ba\u06a7\u06ef\u06ed\u06fb\u06fa\u0685", "\u01d7\u01c1\u01c9\u01d4\u019c\u019e\u0188\u01ea\u0189\u01f6", "\u0480\u0496\u049e\u0483\u04c7\u04cb\u04c9\u04df\u04bd\u04de\u04a1", "\u04ac\u04ba\u04b2\u04af\u04e7\u04e5\u04f3\u0491\u0492\u04f2\u048d", "\u0476\u0479\u047e\u0471\u047c\u0479\u046a\u0475\u042c\u042e\u0438\u0439\u0446"})
public final class Class3319 {
    public static float field7150 = Float.intBitsToFloat(1061166106);

    private static String 17Krqt1DthKNnSW1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 7cj9bcxRd2ij2Q(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3319.17Krqt1DthKNnSW1(k, -619118247));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        for (f = 0; f < q.length; ++f) {
            block8: {
                block9: {
                    try {
                        a = Integer.parseInt(Class3319.17Krqt1DthKNnSW1(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 65222;
                    ** GOTO lbl23
                }
                v0 = 65223;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 65221;
lbl23:
                    // 3 sources

                    if (var16_19 == 65222) break block8;
                } while (var16_19 == 65223);
                continue;
            }
            c = Class3319.17Krqt1DthKNnSW1(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3319.17Krqt1DthKNnSW1(k, -619118247) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

