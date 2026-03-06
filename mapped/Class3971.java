/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u6172\u617e\u6172\u6172\u6172\u6171\u6172\u6175", "\uc14d\uc141\uc14e\uc149\uc14e\uc14c\uc140\uc141", "\udf85\udf85\udf84\udf8f\udf86\udf86\udf81\udf80", "\u77c4\u77c6\u77cf\u77ce\u77c4\u77c0\u77c7\u77c1", "\u9b64\u9b63\u9b68\u9b63\u9b67\u9b62\u9b66\u9b66", "\ude05\ude04\ude04\ude03\ude02\ude04\ude02\ude01", "\u5481\u5483\u5483\u548d\u5485\u548d\u5483\u5480", "\ud14f\ud14f\ud14d\ud14c\ud140\ud14f\ud141\ud149", "\u9866\u9862\u9862\u986f\u9864\u9864\u9860\u9861", "\u2163\u2162\u2167\u2164\u2163\u2167\u2164\u2169", "\u34fa\u34fd\u34fc\u34fc\u34fc\u34fb\u34fd\u34f9", "\ua38a\ua388\ua380\ua380\ua38e\ua380\ua38e\ua38a", "\u8a40\u8a43\u8a45\u8a47\u8a42\u8a46\u8a42", "\u3044\u3043\u3046\u3044\u304f\u3042\u3041\u304f", "\ucb06\ucb06\ucb00\ucb03\ucb02\ucb08\ucb06", "\u8cf4\u8cf1\u8cf7\u8cf2\u8cf5\u8cf9\u8cf3\u8cf2"}, d2={"\u07af\u07a9\u07ae\u27c2\u07f0\u07f2\u07e4\u0780\u07a6\u07ad\u07ba\u07ad\u07e3\u07a0\u07ad\u07a2\u07ab\u07e3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f7\u07e5\u0780\u07a6\u07ad\u07ba\u07ad\u07e3\u07a0\u07ad\u07a2\u07ab\u07e3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f7", "\u04e6\u04e0\u04e6\u248b\u04b9\u04bb\u04ad\u04c9\u04ef\u04e4\u04f3\u04e4\u04aa\u04e9\u04e4\u04eb\u04e2\u04aa\u04d6\u04f1\u04f7\u04ec\u04eb\u04e2\u04be\u04ac\u04c9\u04ef\u04e4\u04f3\u04e4\u04aa\u04e9\u04e4\u04eb\u04e2\u04aa\u04d6\u04f1\u04f7\u04ec\u04eb\u04e2\u04be", "\u04d5\u048a\u0485\u0480\u0487\u0480\u049d\u04d7\u04d5\u04d7\u04c1\u04c0\u04bf", "\"wpwj \" 67H", "=?.\u00196;))fdrs\u00160;,;u6;4=u\u00196;))a", "\u04cc\u04c5\u04d7\u04cc\u04e7\u04cb\u04c0\u04c1\u0498\u049a\u048c\u048d\u04ed", "\u008c\u0098\u009c\u0088\u0085\u009a\u00d5\u00d7\u00c1\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00a6\u008b\u0083\u008c\u008a\u009d\u00d2\u00c0\u00b3", "\u07a1\u07ae\u07ad\u07ac\u07a7\u07fe\u07fc\u07ea\u07eb\u078e\u07a8\u07a3\u07b4\u07a3\u07ed\u07ae\u07a3\u07ac\u07a5\u07ed\u078d\u07a0\u07a8\u07a7\u07a1\u07b6\u07f9", "{`\\{}fah31'&Cenyn cnah \\{}fah4", "\u0550\u0551\u054a\u0557\u0558\u0547\u0502\u0500\u0516\u0517\u0568", "\u0535\u0534\u052f\u0532\u053d\u0522\u051a\u0537\u0537\u0567\u0565\u0573\u0572\u050d", "\u07c0\u07d6\u07de\u07c3\u078b\u0789\u079f\u079e\u07e1", "\u0705\u0713\u071b\u0706\u074e\u074c\u075a\u0738\u075b\u0724", "\u0176\u0160\u0168\u0175\u0131\u013d\u013f\u0129\u014b\u0128\u0157", "\u02c7\u02d1\u02d9\u02c4\u028c\u028e\u0298\u02fa\u02f9\u0299\u02e6", "\u07e8\u07e7\u07e0\u07ef\u07e2\u07e7\u07f4\u07eb\u07b2\u07b0\u07a6\u07a7\u07d8"})
public final class Class3971 {
    public static float field9044;
    public static float field9045;
    public static float field9046;
    public static float field9047;
    public static double field9048;
    public static int field9049 = 0;
    public static float field9050;

    private static String DBDbWbnEaiotDeEA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        Z\u200e = "Grim hitbox check is fucking bad";
        field9047 = Float.intBitsToFloat(1062898130);
        field9046 = Float.intBitsToFloat(1063492857);
        field9045 = Float.intBitsToFloat(1054846360);
        field9048 = Double.longBitsToDouble(4604889623871364738L);
        field9050 = Float.intBitsToFloat(1040164544);
        field9044 = Float.intBitsToFloat(1062115013);
        bK\u200e = "WhileMining";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite NHiKiLVeaJlC6S(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block7: {
                block8: {
                    o = Class.forName(Class3971.DBDbWbnEaiotDeEA(k, -1197173103));
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
                            a = Integer.parseInt(Class3971.DBDbWbnEaiotDeEA(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            continue;
                        }
                        if (e % 59557 != m.intValue()) continue;
                        c = Class3971.DBDbWbnEaiotDeEA(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                    if (!s.isEmpty()) break block8;
                    v0 = 5654;
                    ** GOTO lbl29
                }
                v0 = 5655;
                if (true) ** GOTO lbl29
                do {
                    v0 = var17_20 = 5653;
lbl29:
                    // 3 sources

                    if (var17_20 == 5654) break block7;
                } while (var17_20 == 5655);
                break block9;
            }
            throw new Exception("Can't find method in " + Class3971.DBDbWbnEaiotDeEA(k, -1197173103) + " " + l + " " + m);
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

