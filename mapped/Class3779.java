/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u9666\u9664\u9668\u9669\u9666\u9660\u9665\u9663", "\uc633\uc635\uc633\uc635\uc634\uc63e\uc63e\uc636", "\u287a\u287f\u287f\u287b\u2874\u2875\u287a\u2878", "\ubb9a\ubb9b\ubb9e\ubb93\ubb92\ubb9d\ubb98\ubb99", "\uaef1\uaef7\uaef2\uaef3\uaef6\uaef4\uaef5\uaef4", "\u0584\u0581\u0581\u0584\u0581\u0587\u0580\u0580", "\ud6e4\ud6e1\ud6e5\ud6e6\ud6e6\ud6e2\ud6e2\ud6e1", "\u678a\u6781\u678b\u6789\u678b\u678c\u6780\u6789", "\ubade\ubadf\ubadd\ubad0\ubadd\ubadc\ubad0\ubade", "\u977f\u977d\u9772\u977d\u9772\u977d\u977f\u977c", "\u57e5\u57e3\u57e3\u57e8\u57e5\u57e5\u57e5\u57e2", "\u1152\u1154\u1154\u1157\u1153\u115d\u1154\u115c", "\u681e\u6819\u6814\u681f\u681a\u681d\u681a\u681c", "\u6c9a\u6c94\u6c9d\u6c9c\u6c9d\u6c98\u6c9b\u6c9d", "\ud614\ud615\ud611\ud613\ud619\ud614\ud616\ud615", "\u4344\u4347\u4349\u4346\u4340\u4346\u4344\u4349", "\u24f6\u24fb\u24f5\u24f4\u24f0\u24f3\u24f6\u24f5", "\u92ad\u92aa\u92a9\u92ab\u92a7\u92ac\u92a8\u92ab"}, d2={"\u038d\u03bd\u039d\u23f6\u03c4\u03c6\u03d0\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3\u03d1\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3", "\u0312\u0322\u0301\u2369\u035b\u0359\u034f\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c\u034e\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c", "\u0646\u0676\u0654\u263d\u060f\u060d\u061b\u067f\u0659\u0652\u0645\u0652\u061c\u065f\u0652\u065d\u0654\u061c\u0660\u0647\u0641\u065a\u065d\u0654\u0608\u061a\u067f\u0659\u0652\u0645\u0652\u061c\u065f\u0652\u065d\u0654\u061c\u0660\u0647\u0641\u065a\u065d\u0654\u0608", "\u0556\u0566\u054b\u252d\u051f\u051d\u050b\u056f\u0549\u0542\u0555\u0542\u050c\u054f\u0542\u054d\u0544\u050c\u0570\u0557\u0551\u054a\u054d\u0544\u0518\u050a\u056f\u0549\u0542\u0555\u0542\u050c\u054f\u0542\u054d\u0544\u050c\u0570\u0557\u0551\u054a\u054d\u0544\u0518", "\u0648\u0617\u0618\u061d\u061a\u061d\u0600\u064a\u0648\u064a\u065c\u065d\u0622", "\u0765\u0730\u0737\u0730\u072d\u0767\u0765\u0767\u0771\u0770\u070f", "\u06f7\u06f5\u06e4\u06d3\u06fc\u06f1\u06e3\u06e3\u06ac\u06ae\u06b8\u06b9\u06dc\u06fa\u06f1\u06e6\u06f1\u06bf\u06fc\u06f1\u06fe\u06f7\u06bf\u06d3\u06fc\u06f1\u06e3\u06e3\u06ab", "\u038c\u0385\u0397\u038c\u03a7\u038b\u0380\u0381\u03d8\u03da\u03cc\u03cd\u03ad", "\u01b1\u01a5\u01a1\u01b5\u01b8\u01a7\u01e8\u01ea\u01fc\u0198\u01be\u01b5\u01a2\u01b5\u01fb\u01b8\u01b5\u01ba\u01b3\u01fb\u019b\u01b6\u01be\u01b1\u01b7\u01a0\u01ef\u01fd\u018e", "\u0152\u015d\u015e\u015f\u0154\u010d\u010f\u0119\u0118\u017d\u015b\u0150\u0147\u0150\u011e\u015d\u0150\u015f\u0156\u011e\u017e\u0153\u015b\u0154\u0152\u0145\u010a", "\u042f\u0434\u0408\u042f\u0429\u0432\u0435\u043c\u0467\u0465\u0473\u0472\u0417\u0431\u043a\u042d\u043a\u0474\u0437\u043a\u0435\u043c\u0474\u0408\u042f\u0429\u0432\u0435\u043c\u0460", "\u0464\u0465\u047e\u0463\u046c\u0473\u0436\u0434\u0422\u0423\u045c", "\u0121\u0120\u013b\u0126\u0129\u0136\u010e\u0123\u0123\u0173\u0171\u0167\u0166\u0119", "QGOR\u001a\u0018\u000e\u000fp", "\u044f\u0459\u0451\u044c\u0404\u0406\u0410\u0472\u0411\u046e", "\u0163\u0175\u017d\u0160\u0124\u0128\u012a\u013c\u015e\u013d\u0142", "\u0724\u0732\u073a\u0727\u076f\u076d\u077b\u0719\u071a\u077a\u0705", "\u024a\u0245\u0242\u024d\u0240\u0245\u0256\u0249\u0210\u0212\u0204\u0205\u027a"})
public final class Class3779 {
    public static double field8567;

    static {
        D\u200e = "\u00a7cdisabled\u00a7f";
        ab\u200e = "Explosion";
        bn\u200e = "";
        bK\u200e = "Easing";
        field8567 = Double.longBitsToDouble(4605664250702649549L);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite FAKllMbEn9VoG1(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3779.SZeL5vNJoh18jbas(k, -546578452));
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
                        v0 = 28273;
                        ** GOTO lbl19
                    }
                    v0 = 28274;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 28272;
lbl19:
                        // 3 sources

                        if (var14_15 == 28273) break block13;
                    } while (var14_15 == 28274);
                    break;
                }
                try {
                    a = Integer.parseInt(Class3779.SZeL5vNJoh18jbas(q[f], m));
                }
                catch (NumberFormatException b) {
                    ** GOTO lbl-1000
                }
                if (e % 59557 != m.intValue()) break block15;
                v1 = 41156;
                ** GOTO lbl36
            }
            v1 = 41157;
            if (true) ** GOTO lbl36
            block8: while (true) {
                v1 = 41155;
lbl36:
                // 3 sources

                switch (v1) {
                    case 41157: {
                        continue block8;
                    }
                    case 41156: {
                        c = Class3779.SZeL5vNJoh18jbas(r[f], l);
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
            throw new Exception("Can't find method in " + Class3779.SZeL5vNJoh18jbas(k, -546578452) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String SZeL5vNJoh18jbas(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

