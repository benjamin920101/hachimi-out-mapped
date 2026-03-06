/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u07f2\u07f2\u07f5\u07f7\u07f4\u07f5\u07ff\u07fe", "\u88f8\u88fe\u88fc\u88fa\u88f9\u88ff\u88fa\u88f7", "\ub093\ub094\ub096\ub09a\ub090\ub09b\ub097\ub092", "\uc848\uc84a\uc844\uc84a\uc84f\uc84d\uc84e\uc84a", "\uae73\uae76\uae74\uae72\uae70\uae75\uae76\uae76", "\u2b17\u2b14\u2b11\u2b13\u2b16\u2b14\u2b15", "\u8e69\u8e69\u8e63\u8e68\u8e6e\u8e69\u8e6d\u8e6f", "\u4b71\u4b72\u4b76\u4b74\u4b7b\u4b7a\u4b73\u4b72", "\u6bbb\u6bb8\u6bb9\u6bbc\u6bbb\u6bb9\u6bb7\u6bb6", "\u5c05\u5c06\u5c02\u5c0f\u5c04\u5c05\u5c03\u5c06", "\ub5ff\ub5ff\ub5f9\ub5f8\ub5fc\ub5f3\ub5f8\ub5f8", "\u4c22\u4c21\u4c26\u4c25\u4c25\u4c26\u4c20\u4c24", "\u189a\u189e\u1898\u1894\u189d\u189a\u189c\u1895", "\u0452\u0456\u0455\u0450\u0453\u0459\u0458\u0455", "\u9e79\u9e79\u9e7c\u9e7f\u9e7d\u9e7c\u9e7e\u9e7c"}, d2={"\u074d\u076b\u076d\u272a\u0718\u071a\u070c\u0768\u074e\u0745\u0752\u0745\u070b\u0748\u0745\u074a\u0743\u070b\u0777\u0750\u0756\u074d\u074a\u0743\u071f\u070d\u0768\u074e\u0745\u0752\u0745\u070b\u0748\u0745\u074a\u0743\u070b\u0777\u0750\u0756\u074d\u074a\u0743\u071f", "\u0283\u02dc\u02d3\u02d6\u02d1\u02d6\u02cb\u0281\u0283\u0281\u0297\u0296\u02e9", "$qvql&$&01N", "\u06b5\u06b7\u06a6\u0691\u06be\u06b3\u06a1\u06a1\u06ee\u06ec\u06fa\u06fb\u069e\u06b8\u06b3\u06a4\u06b3\u06fd\u06be\u06b3\u06bc\u06b5\u06fd\u0691\u06be\u06b3\u06a1\u06a1\u06e9", "\u0099\u0090\u0082\u0099\u00b2\u009e\u0095\u0094\u00cd\u00cf\u00d9\u00d8\u00b8", "\u037a\u036e\u036a\u037e\u0373\u036c\u0323\u0321\u0337\u0353\u0375\u037e\u0369\u037e\u0330\u0373\u037e\u0371\u0378\u0330\u0350\u037d\u0375\u037a\u037c\u036b\u0324\u0336\u0345", "\u00f8\u00f7\u00f4\u00f5\u00fe\u00a7\u00a5\u00b3\u00b2\u00d7\u00f1\u00fa\u00ed\u00fa\u00b4\u00f7\u00fa\u00f5\u00fc\u00b4\u00d4\u00f9\u00f1\u00fe\u00f8\u00ef\u00a0", "\u016c\u0177\u014b\u016c\u016a\u0171\u0176\u017f\u0124\u0126\u0130\u0131\u0154\u0172\u0179\u016e\u0179\u0137\u0174\u0179\u0176\u017f\u0137\u014b\u016c\u016a\u0171\u0176\u017f\u0123", "\u03b0\u03b1\u03aa\u03b7\u03b8\u03a7\u03e2\u03e0\u03f6\u03f7\u0388", "\u00ce\u00cf\u00d4\u00c9\u00c6\u00d9\u00e1\u00cc\u00cc\u009c\u009e\u0088\u0089\u00f6", "\u016c\u017a\u0172\u016f\u0127\u0125\u0133\u0132\u014d", "\u010f\u0119\u0111\u010c\u0144\u0146\u0150\u0132\u0151\u012e", "\u06ef\u06f9\u06f1\u06ec\u06a8\u06a4\u06a6\u06b0\u06d2\u06b1\u06ce", "\u0695\u0683\u068b\u0696\u06de\u06dc\u06ca\u06a8\u06ab\u06cb\u06b4", "\u0697\u0698\u069f\u0690\u069d\u0698\u068b\u0694\u06cd\u06cf\u06d9\u06d8\u06a7"})
public final class Class3294 {
    /*
     * Unable to fully structure code
     */
    private static CallSite Mzg5FiY4Q0BwMY(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3294.npieATvwlRzqWfAJ(k, 1206245586));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        while (true) {
            block10: {
                block9: {
                    block11: {
                        if (f >= q.length) break block11;
                        v0 = 21787;
                        ** GOTO lbl19
                    }
                    v0 = 21788;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 21786;
lbl19:
                        // 3 sources

                        if (var14_15 == 21787) break block9;
                    } while (var14_15 == 21788);
                    break;
                }
                try {
                    a = Integer.parseInt(Class3294.npieATvwlRzqWfAJ(q[f], m));
                }
                catch (NumberFormatException b) {
                    break block10;
                }
                if (e % 59557 == m.intValue()) {
                    c = Class3294.npieATvwlRzqWfAJ(r[f], l);
                    d = c.split("<>");
                    s = d[0];
                    t = d[1];
                    break;
                }
            }
            ++f;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3294.npieATvwlRzqWfAJ(k, 1206245586) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        ae\u200e = "minecraft";
    }

    private static String npieATvwlRzqWfAJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

