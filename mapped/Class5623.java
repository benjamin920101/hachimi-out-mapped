/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u567a\u5676\u5677\u5679\u5679\u5677\u567a\u5676", "\u6e09\u6e0e\u6e0f\u6e0e\u6e02\u6e0b\u6e0e\u6e03", "\ud5a5\ud5a2\ud5a2\ud5a5\ud5a5\ud5a1\ud5a6\ud5a6", "\u00ac\u00a0\u00a1\u00ad\u00ae\u00a8\u00a8\u00ae", "\u8a6c\u8a60\u8a6c\u8a6a\u8a6b\u8a61\u8a6f\u8a69", "\u3a6a\u3a6f\u3a6b\u3a6f\u3a6f\u3a6e\u3a69\u3a6a", "\u6324\u6324\u632c\u6326\u6323\u6322\u6323\u6320", "\uaed3\uaed3\uaed4\uaed0\uaed6\uaed5\uaed1\uaed6", "\ub26b\ub26b\ub267\ub266\ub26d\ub26f\ub267\ub26b", "\u57e7\u57e3\u57e7\u57e6\u57e7\u57e5\u57e5\u57e4", "\u5afc\u5aff\u5afa\u5af8\u5afd\u5af9\u5af8\u5af8", "\u56e8\u56ed\u56e9\u56ea\u56e6\u56ec\u56ec\u56e6", "\u1f12\u1f1c\u1f10\u1f17\u1f1c\u1f1d\u1f12\u1f11", "\ue375\ue37f\ue377\ue373\ue37e\ue37e\ue370\ue374"}, d2={"\u07a5\u07fa\u07f5\u07f0\u07f7\u07f0\u07ed\u07a7\u07a5\u07a7\u07b1\u07b0\u07cf", "\u0142\u0117\u0110\u0117\u010a\u0140\u0142\u0140\u0156\u0157\u0128", "\u06ba\u06b8\u06a9\u069e\u06b1\u06bc\u06ae\u06ae\u06e1\u06e3\u06f5\u06f4\u0691\u06b7\u06bc\u06ab\u06bc\u06f2\u06b1\u06bc\u06b3\u06ba\u06f2\u069e\u06b1\u06bc\u06ae\u06ae\u06e6", "\u03a6\u03af\u03bd\u03a6\u038d\u03a1\u03aa\u03ab\u03f2\u03f0\u03e6\u03e7\u0387", "\u061e\u060a\u060e\u061a\u0617\u0608\u0647\u0645\u0653\u0637\u0611\u061a\u060d\u061a\u0654\u0617\u061a\u0615\u061c\u0654\u0634\u0619\u0611\u061e\u0618\u060f\u0640\u0652\u0621", "\u041f\u0410\u0413\u0412\u0419\u0440\u0442\u0454\u0455\u0430\u0416\u041d\u040a\u041d\u0453\u0410\u041d\u0412\u041b\u0453\u0433\u041e\u0416\u0419\u041f\u0408\u0447", "\u06a8\u06b3\u068f\u06a8\u06ae\u06b5\u06b2\u06bb\u06e0\u06e2\u06f4\u06f5\u0690\u06b6\u06bd\u06aa\u06bd\u06f3\u06b0\u06bd\u06b2\u06bb\u06f3\u068f\u06a8\u06ae\u06b5\u06b2\u06bb\u06e7", "\u05a9\u05a8\u05b3\u05ae\u05a1\u05be\u05fb\u05f9\u05ef\u05ee\u0591", "\u00f0\u00f1\u00ea\u00f7\u00f8\u00e7\u00df\u00f2\u00f2\u00a2\u00a0\u00b6\u00b7\u00c8", "\u030f\u0319\u0311\u030c\u0344\u0346\u0350\u0351\u032e", "\u043b\u042d\u0425\u0438\u0470\u0472\u0464\u0406\u0465\u041a", "\u00e8\u00fe\u00f6\u00eb\u00af\u00a3\u00a1\u00b7\u00d5\u00b6\u00c9", "\u059b\u058d\u0585\u0598\u05d0\u05d2\u05c4\u05a6\u05a5\u05c5\u05ba", "\u0217\u0218\u021f\u0210\u021d\u0218\u020b\u0214\u024d\u024f\u0259\u0258\u0227"})
public final class Class5623 {
    public static float field10741;
    public static double field10742;
    public static int field10743 = 336465335;
    public static double field10744;
    public static float field10745;

    static {
        field10745 = Float.intBitsToFloat(1047522380);
        field10744 = Double.longBitsToDouble(4592873882040852904L);
        field10741 = Float.intBitsToFloat(1051430676);
        field10742 = Double.longBitsToDouble(4602687143487547446L);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite zJG5LiOxVs0WjF(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block16: {
            o = Class.forName(Class5623.tpJqA9dnt7w9ykN1(k, -1817409773));
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
                block14: {
                    block13: {
                        block15: {
                            if (f >= q.length) break block15;
                            v0 = 38344;
                            ** GOTO lbl19
                        }
                        v0 = 38345;
                        if (true) ** GOTO lbl19
                        do {
                            v0 = var14_15 = 38343;
lbl19:
                            // 3 sources

                            if (var14_15 == 38344) break block13;
                        } while (var14_15 == 38345);
                        break;
                    }
                    try {
                        a = Integer.parseInt(Class5623.tpJqA9dnt7w9ykN1(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        break block14;
                    }
                    if (e % 59557 == m.intValue()) {
                        c = Class5623.tpJqA9dnt7w9ykN1(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                }
                ++f;
            }
            if (!s.isEmpty()) break block16;
            v1 = 60071;
            ** GOTO lbl45
        }
        v1 = 60072;
        if (true) ** GOTO lbl45
        block8: while (true) {
            v1 = 60070;
lbl45:
            // 3 sources

            switch (v1) {
                case 60072: {
                    continue block8;
                }
                case 60071: {
                    throw new Exception("Can't find method in " + Class5623.tpJqA9dnt7w9ykN1(k, -1817409773) + " " + l + " " + m);
                }
            }
            break;
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String tpJqA9dnt7w9ykN1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

