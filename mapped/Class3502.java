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
@HACHIMI_CLIENT(mv=100, d1={"\u4365\u4361\u4363\u4362\u4365\u4363\u4364\u4361", "\u7823\u7823\u7828\u7825\u7829\u7821\u7821\u7822", "\ud72e\ud720\ud721\ud728\ud72a\ud721\ud72d\ud72e", "\u6492\u649d\u6493\u6494\u6493\u6490\u6491\u6490", "\ue657\ue65b\ue655\ue651\ue657\ue652\ue65b\ue650", "\u5a9f\u5a93\u5a92\u5a9a\u5a92\u5a9e\u5a9b\u5a93", "\u37be\u37b3\u37be\u37be\u37bc\u37bf\u37b8\u37b2", "\u50e5\u50e0\u50e3\u50e0\u50e1\u50e3\u50e0\u50e5", "\u6905\u6905\u6909\u6900\u6902\u6906\u6908\u6902", "\u2dde\u2dde\u2dd0\u2dd1\u2ddc\u2dda\u2dde\u2ddb", "\u4c01\u4c0f\u4c01\u4c0f\u4c02\u4c01\u4c01", "\uc505\uc503\uc503\uc501\uc50f\uc50f\uc502\uc500", "\ucae7\ucae2\ucae6\ucae2\ucae1\ucaee\ucae4\ucae7", "\ua05a\ua05d\ua058\ua058\ua05b\ua058\ua058\ua05a", "\u0bb0\u0bbb\u0bb5\u0bb0\u0bb3\u0bba\u0bba\u0bbb", "\uc30d\uc308\uc309\uc307\uc308\uc308\uc30b\uc30f"}, d2={"\u05d9\u05f5\u05c7\u25bc\u058e\u058c\u059a\u05fe\u05d8\u05d3\u05c4\u05d3\u059d\u05de\u05d3\u05dc\u05d5\u059d\u05e1\u05c6\u05c0\u05db\u05dc\u05d5\u0589\u059b\u05fe\u05d8\u05d3\u05c4\u05d3\u059d\u05de\u05d3\u05dc\u05d5\u059d\u05e1\u05c6\u05c0\u05db\u05dc\u05d5\u0589", "\u01b9\u0195\u01a4\u21dc\u01ee\u01ec\u01fa\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9\u01fb\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9", "\u0435\u046a\u0465\u0460\u0467\u0460\u047d\u0437\u0435\u0437\u0421\u0420\u045f", "\u00a5\u00f0\u00f7\u00f0\u00ed\u00a7\u00a5\u00a7\u00b1\u00b0\u00cf", "\u07a8\u07aa\u07bb\u078c\u07a3\u07ae\u07bc\u07bc\u07f3\u07f1\u07e7\u07e6\u0783\u07a5\u07ae\u07b9\u07ae\u07e0\u07a3\u07ae\u07a1\u07a8\u07e0\u078c\u07a3\u07ae\u07bc\u07bc\u07f4", "\u0175\u017c\u016e\u0175\u015e\u0172\u0179\u0178\u0121\u0123\u0135\u0134\u0154", "\u0393\u0387\u0383\u0397\u039a\u0385\u03ca\u03c8\u03de\u03ba\u039c\u0397\u0380\u0397\u03d9\u039a\u0397\u0398\u0391\u03d9\u03b9\u0394\u039c\u0393\u0395\u0382\u03cd\u03df\u03ac", "\u054b\u0544\u0547\u0546\u054d\u0514\u0516\u0500\u0501\u0564\u0542\u0549\u055e\u0549\u0507\u0544\u0549\u0546\u054f\u0507\u0567\u054a\u0542\u054d\u054b\u055c\u0513", "\u0459\u0442\u047e\u0459\u045f\u0444\u0443\u044a\u0411\u0413\u0405\u0404\u0461\u0447\u044c\u045b\u044c\u0402\u0441\u044c\u0443\u044a\u0402\u047e\u0459\u045f\u0444\u0443\u044a\u0416", "\u0778\u0779\u0762\u077f\u0770\u076f\u072a\u0728\u073e\u073f\u0740", "\u0343\u0342\u0359\u0344\u034b\u0354\u036c\u0341\u0341\u0311\u0313\u0305\u0304\u037b", "h~vk#!76I", "\u07d7\u07c1\u07c9\u07d4\u079c\u079e\u0788\u07ea\u0789\u07f6", "\u05d2\u05c4\u05cc\u05d1\u0595\u0599\u059b\u058d\u05ef\u058c\u05f3", "\u07f6\u07e0\u07e8\u07f5\u07bd\u07bf\u07a9\u07cb\u07c8\u07a8\u07d7", "\u07df\u07d0\u07d7\u07d8\u07d5\u07d0\u07c3\u07dc\u0785\u0787\u0791\u0790\u07ef"})
public final class Class3502 {
    public static String field7711;
    public static int field7712 = 519662408;
    public static int field7713 = 1;
    public static float field7714;

    /*
     * Unable to fully structure code
     */
    private static CallSite 02Yb33A4SZbWkv(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block17: {
            o = Class.forName(Class3502.V6FAodKiavQRldi1(k, 2043807918));
            p = o.getAnnotation(HACHIMI_CLIENT.class);
            if (p.mv() < 100) {
                throw new Exception("Outdated metadata version");
            }
            q = p.d1();
            r = p.d2();
            s = "";
            t = "";
            f = 0;
            block10: while (true) {
                block16: {
                    if (f >= q.length) break block16;
                    v0 = 3436;
                    ** GOTO lbl19
                }
                v0 = 3437;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 3435;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 3437: {
                            continue block11;
                        }
                        case 3436: {
                            try {
                                a = Integer.parseInt(Class3502.V6FAodKiavQRldi1(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl34
                            }
                            if (e % 59557 == m.intValue()) {
                                c = Class3502.V6FAodKiavQRldi1(r[f], l);
                                d = c.split("<>");
                                s = d[0];
                                t = d[1];
                                break block10;
                            }
lbl34:
                            // 3 sources

                            ++f;
                            continue block10;
                        }
                    }
                    break;
                }
                break;
            }
            if (s.isEmpty()) {
                throw new Exception("Can't find method in " + Class3502.V6FAodKiavQRldi1(k, 2043807918) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block17;
            v1 = 24400;
            ** GOTO lbl47
        }
        v1 = 24401;
        if (true) ** GOTO lbl47
        block12: while (true) {
            v1 = 24399;
lbl47:
            // 3 sources

            switch (v1) {
                case 24401: {
                    continue block12;
                }
                case 24400: {
                    g = h.findVirtual(o, s, u);
                    break block12;
                }
                default: {
                    v = h.findStatic(o, s, u);
                }
            }
            break;
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        af\u200e = "SlimeBlock";
        field7711 = "Initializing ModuleManager ...";
        field7714 = Float.intBitsToFloat(1062972624);
    }

    private static String V6FAodKiavQRldi1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

