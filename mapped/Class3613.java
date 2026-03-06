/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ua99f\ua99c\ua99e\ua99d\ua998\ua99f\ua995\ua99b", "\ue6aa\ue6ac\ue6ab\ue6a7\ue6ae\ue6a9\ue6a9\ue6a7", "\u640d\u6407\u6407\u640b\u640c\u6406\u6406", "\u0812\u0812\u081a\u0812\u0810\u0817\u081b\u0810", "\u6550\u655c\u6552\u655c\u6550\u6554\u6556\u6551", "\ucdcb\ucdcc\ucdcc\ucdc6\ucdca\ucdcc\ucdcc\ucdcd", "\ud744\ud747\ud743\ud74d\ud744\ud747\ud741\ud744", "\u7af9\u7aff\u7afd\u7af3\u7af3\u7afb\u7af8\u7af8", "\u8828\u8821\u882d\u882a\u882e\u8820\u882c\u882d", "\uaa87\uaa8d\uaa89\uaa8e\uaa88\uaa8b", "\ubec0\ubec0\ubec5\ubeca\ubecb\ubec6\ubecb\ubecb", "\ud7c0\ud7cd\ud7cf\ud7cc\ud7cb\ud7c0\ud7cc", "\ue4c6\ue4cd\ue4c0\ue4cc\ue4c4\ue4cc\ue4cc\ue4c7", "\uafe1\uafe5\uafe5\uafe5\uafe2\uafe2\uafe3\uafe5", "\u9180\u9186\u9180\u9189\u9188\u9186\u9180\u9182"}, d2={"\u0429\u0406\u041f\u2446\u0474\u0476\u0460\u0404\u0422\u0429\u043e\u0429\u0467\u0424\u0429\u0426\u042f\u0467\u041b\u043c\u043a\u0421\u0426\u042f\u0473\u0461\u0404\u0422\u0429\u043e\u0429\u0467\u0424\u0429\u0426\u042f\u0467\u041b\u043c\u043a\u0421\u0426\u042f\u0473", "\u0177\u0128\u0127\u0122\u0125\u0122\u013f\u0175\u0177\u0175\u0163\u0162\u011d", "\u011d\u0148\u014f\u0148\u0155\u011f\u011d\u011f\u0109\u0108\u0177", "\u06d3\u06d1\u06c0\u06f7\u06d8\u06d5\u06c7\u06c7\u0688\u068a\u069c\u069d\u06f8\u06de\u06d5\u06c2\u06d5\u069b\u06d8\u06d5\u06da\u06d3\u069b\u06f7\u06d8\u06d5\u06c7\u06c7\u068f", "\u043c\u0435\u0427\u043c\u0417\u043b\u0430\u0431\u0468\u046a\u047c\u047d\u041d", "\u022f\u023b\u023f\u022b\u0226\u0239\u0276\u0274\u0262\u0206\u0220\u022b\u023c\u022b\u0265\u0226\u022b\u0224\u022d\u0265\u0205\u0228\u0220\u022f\u0229\u023e\u0271\u0263\u0210", "\u0130\u013f\u013c\u013d\u0136\u016f\u016d\u017b\u017a\u011f\u0139\u0132\u0125\u0132\u017c\u013f\u0132\u013d\u0134\u017c\u011c\u0131\u0139\u0136\u0130\u0127\u0168", "|g[|zafo46 !Dbi~i'difo'[|zafo3", "\u04c8\u04c9\u04d2\u04cf\u04c0\u04df\u049a\u0498\u048e\u048f\u04f0", "`azghwObb20&'X", "\u0419\u040f\u0407\u041a\u0452\u0450\u0446\u0447\u0438", ",:2/ges\u0011r\r", "\u0461\u0477\u047f\u0462\u0426\u042a\u0428\u043e\u045c\u043f\u0440", "\u0427\u0431\u0439\u0424\u046c\u046e\u0478\u041a\u0419\u0479\u0406", "\u076d\u0762\u0765\u076a\u0767\u0762\u0771\u076e\u0737\u0735\u0723\u0722\u075d"})
public final class Class3613 {
    public static float field8059;
    public static float field8060;
    public static double field8061;
    public static float field8062;
    public static float field8063;
    public static int field8064 = -1800804566;

    static {
        field8062 = Float.intBitsToFloat(1064032711);
        R\u200e = "Use packet to attack entity";
        field8059 = Float.intBitsToFloat(1064977897);
        field8060 = Float.intBitsToFloat(1035929240);
        field8061 = Double.longBitsToDouble(4597515316935197480L);
        field8063 = Float.intBitsToFloat(1051646914);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String EBKtnegzQV8KIoet(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 62824 : 62825;
            block5: while (true) {
                switch (n2) {
                    case 62825: {
                        n2 = 62823;
                        continue block5;
                    }
                    case 62824: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite tSejBRcUiKN6VO(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class3613.EBKtnegzQV8KIoet(k, -115936087));
                        p = o.getAnnotation(HACHIMI_CLIENT.class);
                        if (p.mv() < 100) {
                            throw new Exception("Outdated metadata version");
                        }
                        q = p.d1();
                        r = p.d2();
                        s = "";
                        t = "";
                        for (f = 0; f < q.length; ++f) {
                            try {
                                a = Integer.parseInt(Class3613.EBKtnegzQV8KIoet(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class3613.EBKtnegzQV8KIoet(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class3613.EBKtnegzQV8KIoet(k, -115936087) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 5885;
                        ** GOTO lbl32
                    }
                    v0 = 5886;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 5884;
lbl32:
                        // 3 sources

                        if (var17_20 == 5885) break block6;
                    } while (var17_20 == 5886);
                    break block8;
                }
                g = h.findVirtual(o, s, u);
                break block9;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

