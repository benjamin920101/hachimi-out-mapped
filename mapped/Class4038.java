/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u3877\u3873\u3871\u3879\u3872\u3873\u3878", "\ucc1f\ucc1d\ucc10\ucc1f\ucc10\ucc1a\ucc10\ucc1c", "\u0866\u0864\u0862\u0861\u086b\u0864\u086b\u0863", "\ua1f5\ua1f3\ua1f5\ua1ff\ua1f6\ua1f6\ua1f6\ua1f3", "\ud0e1\ud0e2\ud0e4\ud0e5\ud0e6\ud0e1\ud0ec\ud0e4", "\u7e2e\u7e2d\u7e20\u7e2c\u7e2a\u7e2f\u7e2e\u7e2d", "\u7fb4\u7fb4\u7fb1\u7fbf\u7fb5\u7fb4\u7fb2\u7fb5", "\u6d5d\u6d5f\u6d5a\u6d5f\u6d5a\u6d5b\u6d5b\u6d5d", "\u8b1e\u8b1b\u8b18\u8b1b\u8b1a\u8b1c\u8b18\u8b1e", "\u2279\u2272\u2278\u227a\u227e\u2278\u227c", "\u6399\u6393\u639b\u639c\u639d\u6393\u639d\u6399", "\u0c50\u0c55\u0c56\u0c57\u0c5d\u0c5d\u0c56\u0c5d", "\u725c\u725b\u7253\u725c\u7252\u725f\u725d\u725a", "\u95ab\u95ac\u95ab\u95aa\u95aa\u95ac\u95aa\u95a9", "\u9db6\u9dbd\u9db2\u9db0\u9db7\u9db6\u9db2\u9db0", "\u32b5\u32b6\u32b7\u32b7\u32b0\u32b7\u32b4\u32b9", "\uc839\uc83d\uc83f\uc83d\uc838\uc83b\uc838\uc83a"}, d2={"\u01df\u01fc\u01ff\u21ba\u0188\u018a\u019c\u01f8\u01de\u01d5\u01c2\u01d5\u019b\u01d8\u01d5\u01da\u01d3\u019b\u01e7\u01c0\u01c6\u01dd\u01da\u01d3\u018f\u019d\u01f8\u01de\u01d5\u01c2\u01d5\u019b\u01d8\u01d5\u01da\u01d3\u019b\u01e7\u01c0\u01c6\u01dd\u01da\u01d3\u018f", "\u0740\u0763\u0767\u2725\u0717\u0715\u0703\u0767\u0741\u074a\u075d\u074a\u0704\u0747\u074a\u0745\u074c\u0704\u0778\u075f\u0759\u0742\u0745\u074c\u0710\u0702\u0767\u0741\u074a\u075d\u074a\u0704\u0747\u074a\u0745\u074c\u0704\u0778\u075f\u0759\u0742\u0745\u074c\u0710", "\u008c\u00af\u00aa\u20e9\u00db\u00d9\u00cf\u00ab\u008d\u0086\u0091\u0086\u00c8\u008b\u0086\u0089\u0080\u00c8\u00b4\u0093\u0095\u008e\u0089\u0080\u00dc\u00ce\u00ab\u008d\u0086\u0091\u0086\u00c8\u008b\u0086\u0089\u0080\u00c8\u00b4\u0093\u0095\u008e\u0089\u0080\u00dc", "\u0143\u011c\u0113\u0116\u0111\u0116\u010b\u0141\u0143\u0141\u0157\u0156\u0129", "\u05ed\u05b8\u05bf\u05b8\u05a5\u05ef\u05ed\u05ef\u05f9\u05f8\u0587", "\u0168\u016a\u017b\u014c\u0163\u016e\u017c\u017c\u0133\u0131\u0127\u0126\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u014c\u0163\u016e\u017c\u017c\u0134", "\u05d4\u05dd\u05cf\u05d4\u05ff\u05d3\u05d8\u05d9\u0580\u0582\u0594\u0595\u05f5", "\u07cf\u07db\u07df\u07cb\u07c6\u07d9\u0796\u0794\u0782\u07e6\u07c0\u07cb\u07dc\u07cb\u0785\u07c6\u07cb\u07c4\u07cd\u0785\u07e5\u07c8\u07c0\u07cf\u07c9\u07de\u0791\u0783\u07f0", "\u04da\u04d5\u04d6\u04d7\u04dc\u0485\u0487\u0491\u0490\u04f5\u04d3\u04d8\u04cf\u04d8\u0496\u04d5\u04d8\u04d7\u04de\u0496\u04f6\u04db\u04d3\u04dc\u04da\u04cd\u0482", "\u0371\u036a\u0356\u0371\u0377\u036c\u036b\u0362\u0339\u033b\u032d\u032c\u0349\u036f\u0364\u0373\u0364\u032a\u0369\u0364\u036b\u0362\u032a\u0356\u0371\u0377\u036c\u036b\u0362\u033e", "\u049d\u049c\u0487\u049a\u0495\u048a\u04cf\u04cd\u04db\u04da\u04a5", "\u03eb\u03ea\u03f1\u03ec\u03e3\u03fc\u03c4\u03e9\u03e9\u03b9\u03bb\u03ad\u03ac\u03d3", "\u066f\u0679\u0671\u066c\u0624\u0626\u0630\u0631\u064e", "xnf{31'E&Y", "\u0148\u015e\u0156\u014b\u010f\u0103\u0101\u0117\u0175\u0116\u0169", "\u0663\u0675\u067d\u0660\u0628\u062a\u063c\u065e\u065d\u063d\u0642", "\u02cd\u02c2\u02c5\u02ca\u02c7\u02c2\u02d1\u02ce\u0297\u0295\u0283\u0282\u02fd"})
public final class Class4038 {
    public static float field9298;
    public static int field9299 = 2032932180;
    public static int field9300 = 1817009673;

    private static String Wd7VOlOOjOYe9HJe(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        R\u200e = "Face";
        field9298 = Float.intBitsToFloat(1057987803);
        aL\u200e = "Totems";
        bj\u200e = "radius";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite oyYq9oln2GBggU(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4038.Wd7VOlOOjOYe9HJe(k, 1057296140));
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
                v0 = 47988;
                ** GOTO lbl19
            }
            v0 = 47989;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 47987;
lbl19:
                // 3 sources

                switch (v0) {
                    case 47989: {
                        continue block7;
                    }
                    case 47988: {
                        try {
                            a = Integer.parseInt(Class4038.Wd7VOlOOjOYe9HJe(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class4038.Wd7VOlOOjOYe9HJe(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class4038.Wd7VOlOOjOYe9HJe(k, 1057296140) + " " + l + " " + m);
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

