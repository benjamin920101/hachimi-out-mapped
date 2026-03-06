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
@HACHIMI_CLIENT(mv=100, d1={"\u8a1f\u8a1e\u8a14\u8a1c\u8a1a\u8a1a\u8a1e\u8a1d", "\u10f8\u10fa\u10f9\u10fd\u10fe\u10fb\u10f1\u10f9", "\u7224\u7221\u7225\u7224\u722e\u722f\u7221\u7224", "\u37c9\u37cb\u37cc\u37c9\u37c3\u37ca\u37c3\u37cd", "\uc75e\uc75f\uc75c\uc75b\uc75c\uc758\uc753", "\u44ca\u44c2\u44cc\u44c2\u44cb\u44ce\u44c3\u44c8", "\u7d28\u7d25\u7d2f\u7d28\u7d29\u7d2e\u7d2e\u7d28", "\u7aa1\u7aac\u7aa7\u7aad\u7aa3\u7aa6\u7aa0\u7aa4", "\u4e7e\u4e7b\u4e7f\u4e79\u4e7b\u4e78\u4e7d\u4e7b", "\u537a\u5379\u5377\u5378\u537a\u5379\u537f\u537f", "\u44e6\u44e3\u44ee\u44e1\u44e1\u44e3\u44e4\u44e7", "\ue82e\ue822\ue82e\ue82f\ue828\ue829", "\ue407\ue402\ue403\ue405\ue406\ue401\ue401\ue405", "\u2aa6\u2aa5\u2aa2\u2aa0\u2aa0\u2aa3\u2aa4\u2aa7", "\u7520\u7528\u7521\u7523\u7529\u7527\u7524\u7523", "\u1e7b\u1e7a\u1e7f\u1e7d\u1e7c\u1e79\u1e7e", "\u4903\u4903\u4902\u490b\u4904\u4901\u4906\u4902"}, d2={"\u010a\u012f\u011b\u2165\u0157\u0155\u0143\u0127\u0101\u010a\u011d\u010a\u0144\u0107\u010a\u0105\u010c\u0144\u0138\u011f\u0119\u0102\u0105\u010c\u0150\u0142\u0127\u0101\u010a\u011d\u010a\u0144\u0107\u010a\u0105\u010c\u0144\u0138\u011f\u0119\u0102\u0105\u010c\u0150", "\u0788\u07ad\u0798\u27e7\u07d5\u07d7\u07c1\u07a5\u0783\u0788\u079f\u0788\u07c6\u0785\u0788\u0787\u078e\u07c6\u07ba\u079d\u079b\u0780\u0787\u078e\u07d2\u07c0\u07a5\u0783\u0788\u079f\u0788\u07c6\u0785\u0788\u0787\u078e\u07c6\u07ba\u079d\u079b\u0780\u0787\u078e\u07d2", "\u05af\u058a\u05bc\u25c0\u05f2\u05f0\u05e6\u0582\u05a4\u05af\u05b8\u05af\u05e1\u05a2\u05af\u05a0\u05a9\u05e1\u059d\u05ba\u05bc\u05a7\u05a0\u05a9\u05f5\u05e7\u0582\u05a4\u05af\u05b8\u05af\u05e1\u05a2\u05af\u05a0\u05a9\u05e1\u059d\u05ba\u05bc\u05a7\u05a0\u05a9\u05f5", "\u0385\u03da\u03d5\u03d0\u03d7\u03d0\u03cd\u0387\u0385\u0387\u0391\u0390\u03ef", "\u05a5\u05f0\u05f7\u05f0\u05ed\u05a7\u05a5\u05a7\u05b1\u05b0\u05cf", "\u0087\u0085\u0094\u00a3\u008c\u0081\u0093\u0093\u00dc\u00de\u00c8\u00c9\u00ac\u008a\u0081\u0096\u0081\u00cf\u008c\u0081\u008e\u0087\u00cf\u00a3\u008c\u0081\u0093\u0093\u00db", "\u06ca\u06c3\u06d1\u06ca\u06e1\u06cd\u06c6\u06c7\u069e\u069c\u068a\u068b\u06eb", "\u0112\u0106\u0102\u0116\u011b\u0104\u014b\u0149\u015f\u013b\u011d\u0116\u0101\u0116\u0158\u011b\u0116\u0119\u0110\u0158\u0138\u0115\u011d\u0112\u0114\u0103\u014c\u015e\u012d", "\u04fb\u04f4\u04f7\u04f6\u04fd\u04a4\u04a6\u04b0\u04b1\u04d4\u04f2\u04f9\u04ee\u04f9\u04b7\u04f4\u04f9\u04f6\u04ff\u04b7\u04d7\u04fa\u04f2\u04fd\u04fb\u04ec\u04a3", "\u0553\u0548\u0574\u0553\u0555\u054e\u0549\u0540\u051b\u0519\u050f\u050e\u056b\u054d\u0546\u0551\u0546\u0508\u054b\u0546\u0549\u0540\u0508\u0574\u0553\u0555\u054e\u0549\u0540\u051c", "\u022d\u022c\u0237\u022a\u0225\u023a\u027f\u027d\u026b\u026a\u0215", "\u061b\u061a\u0601\u061c\u0613\u060c\u0634\u0619\u0619\u0649\u064b\u065d\u065c\u0623", "\u0332\u0324\u032c\u0331\u0379\u037b\u036d\u036c\u0313", "\u07b3\u07a5\u07ad\u07b0\u07f8\u07fa\u07ec\u078e\u07ed\u0792", "\u0304\u0312\u031a\u0307\u0343\u034f\u034d\u035b\u0339\u035a\u0325", "\u046d\u047b\u0473\u046e\u0426\u0424\u0432\u0450\u0453\u0433\u044c", "\u03fe\u03f1\u03f6\u03f9\u03f4\u03f1\u03e2\u03fd\u03a4\u03a6\u03b0\u03b1\u03ce"})
public final class Class3645 {
    public static float field8153;
    public static double field8154;
    public static float field8155;
    public static double field8156;

    private static String 3sGeCclJhqJ1TLlo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite fYEcLGvtoqOPpH(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block17: {
            o = Class.forName(Class3645.3sGeCclJhqJ1TLlo(k, 1461223813));
            p = o.getAnnotation(HACHIMI_CLIENT.class);
            if (p.mv() >= 100) break block17;
            v0 = 22006;
            ** GOTO lbl11
        }
        v0 = 22007;
        if (true) ** GOTO lbl11
        block10: while (true) {
            v0 = 22005;
lbl11:
            // 3 sources

            switch (v0) {
                case 22007: {
                    continue block10;
                }
                case 22006: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block11: while (true) {
            block18: {
                if (f >= q.length) break block18;
                v1 = 53907;
                ** GOTO lbl30
            }
            v1 = 53908;
            if (true) ** GOTO lbl30
            block12: while (true) {
                v1 = 53906;
lbl30:
                // 3 sources

                switch (v1) {
                    case 53908: {
                        continue block12;
                    }
                    case 53907: {
                        try {
                            a = Integer.parseInt(Class3645.3sGeCclJhqJ1TLlo(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl45
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3645.3sGeCclJhqJ1TLlo(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block11;
                        }
lbl45:
                        // 3 sources

                        ++f;
                        continue block11;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3645.3sGeCclJhqJ1TLlo(k, 1461223813) + " " + l + " " + m);
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
        field8154 = Double.longBitsToDouble(4598490489329344736L);
        field8156 = Double.longBitsToDouble(4603671993166810453L);
        E\u200e = "Border";
        ax\u200e = "Freeze";
        field8155 = Float.intBitsToFloat(1048385792);
        field8153 = Float.intBitsToFloat(1057834148);
        bF\u200e = "Mode";
    }
}

