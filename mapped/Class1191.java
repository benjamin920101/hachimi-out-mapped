/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u8b22\u8b2d\u8b20\u8b20\u8b26\u8b25\u8b22", "\u59cb\u59ca\u59c8\u59c7\u59c8\u59cd\u59c8\u59ca", "\u75a8\u75a9\u75a1\u75a9\u75a0\u75a0\u75ab\u75ab", "\u3765\u3762\u3766\u3760\u3765\u3766\u3767\u3767", "\u07db\u07de\u07dc\u07d8\u07de\u07da\u07dc\u07d0", "\ue5bd\ue5bb\ue5bf\ue5b7\ue5b9\ue5bd\ue5b7\ue5b8", "\u6d4e\u6d4f\u6d43\u6d43\u6d4b\u6d4b\u6d49\u6d4f", "\u7d36\u7d35\u7d37\u7d32\u7d33\u7d33\u7d37\u7d31", "\u890e\u890e\u8904\u890f\u890e\u890d\u890b\u890b", "\u5806\u5802\u5802\u5806\u5806\u580a\u580a\u5800", "\u37be\u37be\u37bc\u37bc\u37bf\u37bf\u37ba\u37bc", "\u34de\u34db\u34d9\u34dd\u34df\u34d5\u34da\u34db", "\u0e00\u0e02\u0e01\u0e03\u0e03\u0e06\u0e05\u0e04", "\u9e7e\u9e70\u9e7f\u9e78\u9e71\u9e7f\u9e7c\u9e79", "\u1c7a\u1c78\u1c7a\u1c7b\u1c72\u1c7c\u1c73\u1c78", "\u16cb\u16c0\u16cc\u16cd\u16cf\u16c8\u16cc\u16ca", "\u31f2\u31f4\u31f9\u31f7\u31f0\u31f4\u31f6"}, d2={"\u0518\u0530\u053a\u257d\u054f\u054d\u055b\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u0520\u0507\u0501\u051a\u051d\u0514\u0548\u055a\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u0520\u0507\u0501\u051a\u051d\u0514\u0548", "\u0326\u030e\u0307\u2343\u0371\u0373\u0365\u0301\u0327\u032c\u033b\u032c\u0362\u0321\u032c\u0323\u032a\u0362\u031e\u0339\u033f\u0324\u0323\u032a\u0376\u0364\u0301\u0327\u032c\u033b\u032c\u0362\u0321\u032c\u0323\u032a\u0362\u031e\u0339\u033f\u0324\u0323\u032a\u0376", "\u014c\u0164\u016c\u2129\u011b\u0119\u010f\u016b\u014d\u0146\u0151\u0146\u0108\u014b\u0146\u0149\u0140\u0108\u0174\u0153\u0155\u014e\u0149\u0140\u011c\u010e\u016b\u014d\u0146\u0151\u0146\u0108\u014b\u0146\u0149\u0140\u0108\u0174\u0153\u0155\u014e\u0149\u0140\u011c", "\u0131\u016e\u0161\u0164\u0163\u0164\u0179\u0133\u0131\u0133\u0125\u0124\u015b", "\u03f3\u03a6\u03a1\u03a6\u03bb\u03f1\u03f3\u03f1\u03e7\u03e6\u0399", "\u0719\u071b\u070a\u073d\u0712\u071f\u070d\u070d\u0742\u0740\u0756\u0757\u0732\u0714\u071f\u0708\u071f\u0751\u0712\u071f\u0710\u0719\u0751\u073d\u0712\u071f\u070d\u070d\u0745", "\u0163\u016a\u0178\u0163\u0148\u0164\u016f\u016e\u0137\u0135\u0123\u0122\u0142", "\u053e\u052a\u052e\u053a\u0537\u0528\u0567\u0565\u0573\u0517\u0531\u053a\u052d\u053a\u0574\u0537\u053a\u0535\u053c\u0574\u0514\u0539\u0531\u053e\u0538\u052f\u0560\u0572\u0501", "\u04ef\u04e0\u04e3\u04e2\u04e9\u04b0\u04b2\u04a4\u04a5\u04c0\u04e6\u04ed\u04fa\u04ed\u04a3\u04e0\u04ed\u04e2\u04eb\u04a3\u04c3\u04ee\u04e6\u04e9\u04ef\u04f8\u04b7", "\u03dc\u03c7\u03fb\u03dc\u03da\u03c1\u03c6\u03cf\u0394\u0396\u0380\u0381\u03e4\u03c2\u03c9\u03de\u03c9\u0387\u03c4\u03c9\u03c6\u03cf\u0387\u03fb\u03dc\u03da\u03c1\u03c6\u03cf\u0393", "LMVKD[\u001e\u001c\n\u000bt", "\u0157\u0156\u014d\u0150\u015f\u0140\u0178\u0155\u0155\u0105\u0107\u0111\u0110\u016f", "\u059f\u0589\u0581\u059c\u05d4\u05d6\u05c0\u05c1\u05be", "\u055c\u054a\u0542\u055f\u0517\u0515\u0503\u0561\u0502\u057d", "\u06dc\u06ca\u06c2\u06df\u069b\u0697\u0695\u0683\u06e1\u0682\u06fd", "\u024e\u0258\u0250\u024d\u0205\u0207\u0211\u0273\u0270\u0210\u026f", "\u06a1\u06ae\u06a9\u06a6\u06ab\u06ae\u06bd\u06a2\u06fb\u06f9\u06ef\u06ee\u0691"})
public final class Class1191 {
    public static float field4710 = Float.intBitsToFloat(1054942104);
    public static float field4711 = 0.44424564f;
    public static float field4712 = Float.intBitsToFloat(1049600094);
    public static double field4713;
    public static int field4714 = 120953886;
    public static float field4715;

    static {
        aO\u200e = "The render color for shulkers";
        bs\u200e = "player";
        field4713 = Double.longBitsToDouble(4603524262985641782L);
        bF\u200e = "Shift";
        field4715 = Float.intBitsToFloat(1057009687);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite GRwPOxoJXe3Aw9(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1191.yF7gDdndVybtLdo2(k, -376696450));
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
            block15: {
                block13: {
                    block14: {
                        if (f >= q.length) break block14;
                        v0 = 10847;
                        ** GOTO lbl19
                    }
                    v0 = 10848;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 10846;
lbl19:
                        // 3 sources

                        if (var14_15 == 10847) break block13;
                    } while (var14_15 == 10848);
                    break;
                }
                try {
                    a = Integer.parseInt(Class1191.yF7gDdndVybtLdo2(q[f], m));
                }
                catch (NumberFormatException b) {
                    ** GOTO lbl-1000
                }
                if (e % 59557 != m.intValue()) break block15;
                v1 = 55456;
                ** GOTO lbl36
            }
            v1 = 55457;
            if (true) ** GOTO lbl36
            block8: while (true) {
                v1 = 55455;
lbl36:
                // 3 sources

                switch (v1) {
                    case 55457: {
                        continue block8;
                    }
                    case 55456: {
                        c = Class1191.yF7gDdndVybtLdo2(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break block6;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1191.yF7gDdndVybtLdo2(k, -376696450) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String yF7gDdndVybtLdo2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

