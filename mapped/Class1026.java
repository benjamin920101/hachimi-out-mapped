/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u813f\u813f\u813d\u813d\u8134\u8138\u813a\u813d", "\uc22b\uc228\uc229\uc22d\uc22d\uc223\uc222\uc223", "\u6e49\u6e46\u6e43\u6e42\u6e44\u6e48\u6e44", "\u7953\u7952\u7955\u7954\u7959\u7951\u7959\u7954", "\u04ec\u04e8\u04ed\u04e8\u04e8\u04e8\u04e8\u04e8", "\u9bed\u9bef\u9be0\u9bee\u9be9\u9be1\u9be8\u9bea", "\u9976\u9971\u9970\u9972\u9975\u9976\u9970\u9970", "\uadca\uadcb\uadce\uadcd\uadcd\uadcd\uadc6\uadc6", "\u3910\u3916\u3915\u3911\u391a\u3914\u3912\u3910", "\u35e1\u35e0\u35e5\u35e1\u35e6\u35e1\u35ee", "\u9768\u976c\u9763\u976f\u9762\u976f\u976b\u976a", "\u58b1\u58bc\u58b7\u58b6\u58bc\u58bd\u58b2\u58b7", "\u4658\u4651\u4656\u4651\u4657\u4659\u4650", "\u1959\u1958\u1952\u1958\u1958\u195e\u195b\u1959", "\u4f5e\u4f54\u4f55\u4f5d\u4f59\u4f59\u4f5d\u4f54"}, d2={"\u00c7\u00ef\u00c3\u20a5\u0097\u0095\u0083\u00e7\u00c1\u00ca\u00dd\u00ca\u0084\u00c7\u00ca\u00c5\u00cc\u0084\u00f8\u00df\u00d9\u00c2\u00c5\u00cc\u0090\u0082\u00e7\u00c1\u00ca\u00dd\u00ca\u0084\u00c7\u00ca\u00c5\u00cc\u0084\u00f8\u00df\u00d9\u00c2\u00c5\u00cc\u0090", "\u017d\u0122\u012d\u0128\u012f\u0128\u0135\u017f\u017d\u017f\u0169\u0168\u0117", "\u0545\u0510\u0517\u0510\u050d\u0547\u0545\u0547\u0551\u0550\u052f", "\u034d\u034f\u035e\u0369\u0346\u034b\u0359\u0359\u0316\u0314\u0302\u0303\u0366\u0340\u034b\u035c\u034b\u0305\u0346\u034b\u0344\u034d\u0305\u0369\u0346\u034b\u0359\u0359\u0311", "\u07cf\u07c6\u07d4\u07cf\u07e4\u07c8\u07c3\u07c2\u079b\u0799\u078f\u078e\u07ee", "\u070f\u071b\u071f\u070b\u0706\u0719\u0756\u0754\u0742\u0726\u0700\u070b\u071c\u070b\u0745\u0706\u070b\u0704\u070d\u0745\u0725\u0708\u0700\u070f\u0709\u071e\u0751\u0743\u0730", "\u03f5\u03fa\u03f9\u03f8\u03f3\u03aa\u03a8\u03be\u03bf\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03d9\u03f4\u03fc\u03f3\u03f5\u03e2\u03ad", "\u067d\u0666\u065a\u067d\u067b\u0660\u0667\u066e\u0635\u0637\u0621\u0620\u0645\u0663\u0668\u067f\u0668\u0626\u0665\u0668\u0667\u066e\u0626\u065a\u067d\u067b\u0660\u0667\u066e\u0632", "\u013d\u013c\u0127\u013a\u0135\u012a\u016f\u016d\u017b\u017a\u0105", "\u07d8\u07d9\u07c2\u07df\u07d0\u07cf\u07f7\u07da\u07da\u078a\u0788\u079e\u079f\u07e0", "\u01b4\u01a2\u01aa\u01b7\u01ff\u01fd\u01eb\u01ea\u0195", "\u02a6\u02b0\u02b8\u02a5\u02ed\u02ef\u02f9\u029b\u02f8\u0287", "\u0384\u0392\u039a\u0387\u03c3\u03cf\u03cd\u03db\u03b9\u03da\u03a5", "\u0766\u0770\u0778\u0765\u072d\u072f\u0739\u075b\u0758\u0738\u0747", "\u027e\u0271\u0276\u0279\u0274\u0271\u0262\u027d\u0224\u0226\u0230\u0231\u024e"})
public final class Class1026 {
    public static int field4230 = -936781505;
    public static float field4231;
    public static int field4232 = -964733409;
    public static float field4233;
    public static float field4234;

    private static String ZLJEIY3E2Jp2QyBY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite S0vbDep4vwTVGm(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1026.ZLJEIY3E2Jp2QyBY(k, 1410114056));
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
                        a = Integer.parseInt(Class1026.ZLJEIY3E2Jp2QyBY(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 15778;
                    ** GOTO lbl23
                }
                v0 = 15779;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 15777;
lbl23:
                    // 3 sources

                    if (var16_19 == 15778) break block8;
                } while (var16_19 == 15779);
                continue;
            }
            c = Class1026.ZLJEIY3E2Jp2QyBY(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1026.ZLJEIY3E2Jp2QyBY(k, 1410114056) + " " + l + " " + m);
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
        e\u200e = "VehiclesFill";
        field4231 = Float.intBitsToFloat(1063543691);
        field4233 = Float.intBitsToFloat(1059538071);
        field4234 = Float.intBitsToFloat(1050918904);
    }
}

