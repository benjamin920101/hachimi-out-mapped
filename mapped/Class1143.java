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
@HACHIMI_CLIENT(mv=100, d1={"\ucf4e\ucf4a\ucf48\ucf48\ucf4a\ucf4d\ucf42\ucf49", "\uc2bd\uc2be\uc2b8\uc2bd\uc2b7\uc2ba\uc2ba\uc2ba", "\u278a\u278c\u2781\u278e\u278c\u278d\u278d\u2789", "\u4e02\u4e0f\u4e01\u4e05\u4e03\u4e06\u4e06\u4e06", "\u6eaa\u6eac\u6eab\u6eab\u6eaa\u6ea8\u6ea9\u6eaa", "\u80b2\u80b6\u80b4\u80b4\u80b2\u80b9\u80b1\u80b6", "\ua606\ua600\ua602\ua601\ua602\ua600\ua601\ua603", "\u3f8e\u3f8e\u3f88\u3f8a\u3f8d\u3f8c\u3f8a\u3f82", "\ua72f\ua72e\ua72a\ua729\ua72b\ua729\ua72b\ua72a", "\ud6ad\ud6af\ud6a3\ud6ac\ud6ab\ud6a2\ud6ae", "\u7012\u7015\u7014\u7013\u7010\u7012\u7017\u7017", "\ub494\ub499\ub498\ub499\ub494\ub497\ub491", "\u6ae3\u6ae3\u6ae1\u6ae4\u6ae2\u6ae2\u6ae3\u6ae3", "\u2a28\u2a2c\u2a2e\u2a2a\u2a2a\u2a21\u2a2b\u2a2c"}, d2={"\u04fb\u04a4\u04ab\u04ae\u04a9\u04ae\u04b3\u04f9\u04fb\u04f9\u04ef\u04ee\u0491", "\u0226\u0273\u0274\u0273\u026e\u0224\u0226\u0224\u0232\u0233\u024c", "\u078b\u0789\u0798\u07af\u0780\u078d\u079f\u079f\u07d0\u07d2\u07c4\u07c5\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07af\u0780\u078d\u079f\u079f\u07d7", "\u0672\u067b\u0669\u0672\u0659\u0675\u067e\u067f\u0626\u0624\u0632\u0633\u0653", "\u06f1\u06e5\u06e1\u06f5\u06f8\u06e7\u06a8\u06aa\u06bc\u06d8\u06fe\u06f5\u06e2\u06f5\u06bb\u06f8\u06f5\u06fa\u06f3\u06bb\u06db\u06f6\u06fe\u06f1\u06f7\u06e0\u06af\u06bd\u06ce", "\u0273\u027c\u027f\u027e\u0275\u022c\u022e\u0238\u0239\u025c\u027a\u0271\u0266\u0271\u023f\u027c\u0271\u027e\u0277\u023f\u025f\u0272\u027a\u0275\u0273\u0264\u022b", "\u07a3\u07b8\u0784\u07a3\u07a5\u07be\u07b9\u07b0\u07eb\u07e9\u07ff\u07fe\u079b\u07bd\u07b6\u07a1\u07b6\u07f8\u07bb\u07b6\u07b9\u07b0\u07f8\u0784\u07a3\u07a5\u07be\u07b9\u07b0\u07ec", "\u05f1\u05f0\u05eb\u05f6\u05f9\u05e6\u05a3\u05a1\u05b7\u05b6\u05c9", "\u06ec\u06ed\u06f6\u06eb\u06e4\u06fb\u06c3\u06ee\u06ee\u06be\u06bc\u06aa\u06ab\u06d4", "\u0119\u010f\u0107\u011a\u0152\u0150\u0146\u0147\u0138", "\u069e\u0688\u0680\u069d\u06d5\u06d7\u06c1\u06a3\u06c0\u06bf", "\u01a6\u01b0\u01b8\u01a5\u01e1\u01ed\u01ef\u01f9\u019b\u01f8\u0187", "\u04c9\u04df\u04d7\u04ca\u0482\u0480\u0496\u04f4\u04f7\u0497\u04e8", "\u0426\u0429\u042e\u0421\u042c\u0429\u043a\u0425\u047c\u047e\u0468\u0469\u0416"})
public final class Class1143 {
    public static float field4578;
    public static float field4579;
    public static float field4580 = 0.60623443f;

    static {
        field4579 = Float.intBitsToFloat(0x40C00000);
        field4578 = Float.intBitsToFloat(1042933872);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 9aOXJeeaUcaSd2(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block7: {
                block8: {
                    o = Class.forName(Class1143.hm3nsDd7wIPicSYd(k, 1169915840));
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
                            a = Integer.parseInt(Class1143.hm3nsDd7wIPicSYd(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            continue;
                        }
                        if (e % 59557 != m.intValue()) continue;
                        c = Class1143.hm3nsDd7wIPicSYd(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                    if (!s.isEmpty()) break block8;
                    v0 = 33879;
                    ** GOTO lbl29
                }
                v0 = 33880;
                if (true) ** GOTO lbl29
                do {
                    v0 = var17_20 = 33878;
lbl29:
                    // 3 sources

                    if (var17_20 == 33879) break block7;
                } while (var17_20 == 33880);
                break block9;
            }
            throw new Exception("Can't find method in " + Class1143.hm3nsDd7wIPicSYd(k, 1169915840) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String hm3nsDd7wIPicSYd(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

