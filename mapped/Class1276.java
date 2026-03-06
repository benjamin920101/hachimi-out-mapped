/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u0cfc\u0cfc\u0cfc\u0cfb\u0cfa\u0cff\u0cf1\u0cfc", "\u7fbd\u7fba\u7fba\u7fb0\u7fb9\u7fb8\u7fbd\u7fbc", "\udb84\udb84\udb85\udb84\udb81\udb82\udb86\udb86", "\u15fb\u15f7\u15f6\u15f9\u15fe\u15fb\u15fc\u15f8", "\u1e48\u1e4a\u1e45\u1e49\u1e45\u1e4e\u1e49", "\u3137\u3132\u3133\u3131\u313d\u3136\u3135\u3133", "\uddc2\uddc1\uddc7\uddc7\uddc5\uddc6\uddcd\uddc6", "\u140c\u1405\u140f\u140f\u1404\u140b\u140f\u140e", "\uc75f\uc75b\uc75f\uc75f\uc75f\uc75b\uc75f\uc758", "\ub9af\ub9ad\ub9ac\ub9ae\ub9a7\ub9a8\ub9af\ub9ab", "\u97f7\u97fb\u97fb\u97f2\u97f5\u97f3\u97f0\u97f7", "\u8252\u825e\u825f\u825f\u825f\u8256\u8251\u825f", "\uac51\uac50\uac50\uac53\uac57\uac50\uac51", "\u9233\u9238\u9231\u9235\u9230\u9237\u9232\u9237", "\ue45e\ue458\ue45a\ue45e\ue45e\ue45c\ue45f\ue45d", "\u6088\u608a\u6083\u6082\u6082\u6082\u6088\u608c", "\u61ca\u61cc\u61ca\u61cd\u61cb\u61ca\u61c1\u61cb"}, d2={"\u032c\u0306\u032e\u234f\u037d\u037f\u0369\u030d\u032b\u0320\u0337\u0320\u036e\u032d\u0320\u032f\u0326\u036e\u0312\u0335\u0333\u0328\u032f\u0326\u037a\u0368\u030d\u032b\u0320\u0337\u0320\u036e\u032d\u0320\u032f\u0326\u036e\u0312\u0335\u0333\u0328\u032f\u0326\u037a", "\u05ac\u0586\u05b1\u25cf\u05fd\u05ff\u05e9\u058d\u05ab\u05a0\u05b7\u05a0\u05ee\u05ad\u05a0\u05af\u05a6\u05ee\u0592\u05b5\u05b3\u05a8\u05af\u05a6\u05fa\u05e8\u058d\u05ab\u05a0\u05b7\u05a0\u05ee\u05ad\u05a0\u05af\u05a6\u05ee\u0592\u05b5\u05b3\u05a8\u05af\u05a6\u05fa", "\u04e0\u04ca\u04fc\u2483\u04b1\u04b3\u04a5\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04de\u04f9\u04ff\u04e4\u04e3\u04ea\u04b6\u04a4\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04de\u04f9\u04ff\u04e4\u04e3\u04ea\u04b6", "\u0238\u0267\u0268\u026d\u026a\u026d\u0270\u023a\u0238\u023a\u022c\u022d\u0252", "\u0618\u064d\u064a\u064d\u0650\u061a\u0618\u061a\u060c\u060d\u0672", "\u024f\u024d\u025c\u026b\u0244\u0249\u025b\u025b\u0214\u0216\u0200\u0201\u0264\u0242\u0249\u025e\u0249\u0207\u0244\u0249\u0246\u024f\u0207\u026b\u0244\u0249\u025b\u025b\u0213", "\u03fc\u03f5\u03e7\u03fc\u03d7\u03fb\u03f0\u03f1\u03a8\u03aa\u03bc\u03bd\u03dd", "\u012d\u0139\u013d\u0129\u0124\u013b\u0174\u0176\u0160\u0104\u0122\u0129\u013e\u0129\u0167\u0124\u0129\u0126\u012f\u0167\u0107\u012a\u0122\u012d\u012b\u013c\u0173\u0161\u0112", "\u0470\u047f\u047c\u047d\u0476\u042f\u042d\u043b\u043a\u045f\u0479\u0472\u0465\u0472\u043c\u047f\u0472\u047d\u0474\u043c\u045c\u0471\u0479\u0476\u0470\u0467\u0428", "\u0214\u020f\u0233\u0214\u0212\u0209\u020e\u0207\u025c\u025e\u0248\u0249\u022c\u020a\u0201\u0216\u0201\u024f\u020c\u0201\u020e\u0207\u024f\u0233\u0214\u0212\u0209\u020e\u0207\u025b", "\u05c4\u05c5\u05de\u05c3\u05cc\u05d3\u0596\u0594\u0582\u0583\u05fc", "\u008a\u008b\u0090\u008d\u0082\u009d\u00a5\u0088\u0088\u00d8\u00da\u00cc\u00cd\u00b2", "\u038a\u039c\u0394\u0389\u03c1\u03c3\u03d5\u03d4\u03ab", "\u00b7\u00a1\u00a9\u00b4\u00fc\u00fe\u00e8\u008a\u00e9\u0096", "\u0127\u0131\u0139\u0124\u0160\u016c\u016e\u0178\u011a\u0179\u0106", "\u056c\u057a\u0572\u056f\u0527\u0525\u0533\u0551\u0552\u0532\u054d", "(' /\"'4+rpfg\u0018"})
public final class Class1276 {
    public static float field4981;
    public static float field4982;
    public static float field4983;
    public static String field4984;

    private static String SS8ldfj9kJARDFRn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite vt4Un2v1owytIh(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1276.SS8ldfj9kJARDFRn(k, -1410559494));
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
                v0 = 5896;
                ** GOTO lbl19
            }
            v0 = 5897;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 5895;
lbl19:
                // 3 sources

                switch (v0) {
                    case 5897: {
                        continue block7;
                    }
                    case 5896: {
                        try {
                            a = Integer.parseInt(Class1276.SS8ldfj9kJARDFRn(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1276.SS8ldfj9kJARDFRn(r[f], l);
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
            throw new Exception("Can't find method in " + Class1276.SS8ldfj9kJARDFRn(k, -1410559494) + " " + l + " " + m);
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
        field4983 = Float.intBitsToFloat(1061340509);
        ag\u200e = "";
        field4981 = Float.intBitsToFloat(1063641174);
        field4982 = Float.intBitsToFloat(1119092736);
        bm\u200e = "";
        field4984 = "-DproxyPort";
    }
}

