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
@HACHIMI_CLIENT(mv=100, d1={"\ud935\ud934\ud934\ud934\ud932\ud93b\ud935\ud937", "\udc81\udc80\udc89\udc85\udc85\udc84\udc82\udc87", "\u055c\u0556\u0558\u055e\u055f\u055c\u0558", "\u1426\u1421\u1424\u1425\u1424\u1420\u1421\u1426", "\u3516\u3517\u3513\u3510\u3512\u351b\u3513\u3511", "\u2abb\u2abe\u2abc\u2ab1\u2abc\u2abe\u2ab1\u2ab9", "\u75b2\u75ba\u75ba\u75b1\u75b1\u75b2\u75b1\u75b2", "\uc4eb\uc4e8\uc4ea\uc4ee\uc4e8\uc4ec\uc4ed\uc4e7", "\u4c13\u4c15\u4c17\u4c10\u4c1b\u4c10\u4c16\u4c1a", "\u6468\u646d\u6469\u646f\u646a\u6465\u646e\u646d", "\ue7ee\ue7ec\ue7e3\ue7e9\ue7ea\ue7ed\ue7eb\ue7e9", "\u954b\u954d\u954e\u954b\u954a\u954f\u9548\u954f", "\u7604\u7606\u7607\u7600\u7604\u760c\u7604\u7600", "\u2860\u2868\u2860\u2867\u2860\u2865\u2864", "\u3cc6\u3cc7\u3ccc\u3cc0\u3cc5\u3cc3\u3cc7\u3cc3", "\u09b9\u09b3\u09bc\u09ba\u09bd\u09b2\u09be\u09bd"}, d2={"\u0135\u0129\u0114\u2153\u0161\u0163\u0175\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u010e\u0129\u012f\u0134\u0133\u013a\u0166\u0174\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u010e\u0129\u012f\u0134\u0133\u013a\u0166", "\u062b\u0637\u0609\u264d\u067f\u067d\u066b\u060f\u0629\u0622\u0635\u0622\u066c\u062f\u0622\u062d\u0624\u066c\u0610\u0637\u0631\u062a\u062d\u0624\u0678\u066a\u060f\u0629\u0622\u0635\u0622\u066c\u062f\u0622\u062d\u0624\u066c\u0610\u0637\u0631\u062a\u062d\u0624\u0678", "\u07ce\u0791\u079e\u079b\u079c\u079b\u0786\u07cc\u07ce\u07cc\u07da\u07db\u07a4", "\u044e\u041b\u041c\u041b\u0406\u044c\u044e\u044c\u045a\u045b\u0424", "\u0467\u0465\u0474\u0443\u046c\u0461\u0473\u0473\u043c\u043e\u0428\u0429\u044c\u046a\u0461\u0476\u0461\u042f\u046c\u0461\u046e\u0467\u042f\u0443\u046c\u0461\u0473\u0473\u043b", "\u009c\u0095\u0087\u009c\u00b7\u009b\u0090\u0091\u00c8\u00ca\u00dc\u00dd\u00bd", "\u039e\u038a\u038e\u039a\u0397\u0388\u03c7\u03c5\u03d3\u03b7\u0391\u039a\u038d\u039a\u03d4\u0397\u039a\u0395\u039c\u03d4\u03b4\u0399\u0391\u039e\u0398\u038f\u03c0\u03d2\u03a1", "\u0601\u060e\u060d\u060c\u0607\u065e\u065c\u064a\u064b\u062e\u0608\u0603\u0614\u0603\u064d\u060e\u0603\u060c\u0605\u064d\u062d\u0600\u0608\u0607\u0601\u0616\u0659", "\u0146\u015d\u0161\u0146\u0140\u015b\u015c\u0155\u010e\u010c\u011a\u011b\u017e\u0158\u0153\u0144\u0153\u011d\u015e\u0153\u015c\u0155\u011d\u0161\u0146\u0140\u015b\u015c\u0155\u0109", "\u0014\u0015\u000e\u0013\u001c\u0003FDRS,", "\u05da\u05db\u05c0\u05dd\u05d2\u05cd\u05f5\u05d8\u05d8\u0588\u058a\u059c\u059d\u05e2", "\u058d\u059b\u0593\u058e\u05c6\u05c4\u05d2\u05d3\u05ac", "\u0314\u0302\u030a\u0317\u035f\u035d\u034b\u0329\u034a\u0335", "\u042b\u043d\u0435\u0428\u046c\u0460\u0462\u0474\u0416\u0475\u040a", "\u01d1\u01c7\u01cf\u01d2\u019a\u0198\u018e\u01ec\u01ef\u018f\u01f0", "\u0692\u069d\u069a\u0695\u0698\u069d\u068e\u0691\u06c8\u06ca\u06dc\u06dd\u06a2"})
public final class Class1631 {
    public static float field6074;
    public static int field6075 = -821225202;
    public static double field6076;

    /*
     * Unable to fully structure code
     */
    private static CallSite Z7x52RcGA9kD1Z(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1631.5XCuQwIMpsHpV3gJ(k, -1118633346));
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
                v0 = 14040;
                ** GOTO lbl19
            }
            v0 = 14041;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 14039;
lbl19:
                // 3 sources

                switch (v0) {
                    case 14041: {
                        continue block7;
                    }
                    case 14040: {
                        try {
                            a = Integer.parseInt(Class1631.5XCuQwIMpsHpV3gJ(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl43
                        }
                        if (e % 59557 != m.intValue()) ** GOTO lbl31
                        v1 = 22292;
                        ** GOTO lbl35
lbl31:
                        // 1 sources

                        v1 = 22293;
                        if (true) ** GOTO lbl35
                        do {
                            v1 = var16_19 = 22291;
lbl35:
                            // 3 sources

                            if (var16_19 == 22292) ** GOTO lbl38
                        } while (var16_19 == 22293);
                        ** GOTO lbl43
lbl38:
                        // 1 sources

                        c = Class1631.5XCuQwIMpsHpV3gJ(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break block6;
lbl43:
                        // 2 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1631.5XCuQwIMpsHpV3gJ(k, -1118633346) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String 5XCuQwIMpsHpV3gJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        k\u200e = "slowness";
        F\u200e = "Automatically re-syncs your inventory";
        field6076 = Double.longBitsToDouble(4604244661714231951L);
        field6074 = Float.intBitsToFloat(1049740018);
    }
}

