/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u898f\u898f\u8989\u898a\u898e\u898b\u898f\u898e", "\u3b8c\u3b88\u3b88\u3b8f\u3b88\u3b89\u3b8f\u3b8f", "\u8f7a\u8f7e\u8f79\u8f7a\u8f7a\u8f7e\u8f7c\u8f7e", "\u17ae\u17ac\u17a9\u17a2\u17a2\u17a3\u17ac\u17ac", "\u0791\u0797\u0796\u0790\u0791\u079d\u0795\u0790", "\u6bdd\u6bd6\u6bd9\u6bd7\u6bd7\u6bdc\u6bdd\u6bd9", "\ubf03\ubf02\ubf01\ubf08\ubf06\ubf04\ubf01\ubf05", "\u1b69\u1b63\u1b6e\u1b63\u1b69\u1b68\u1b63\u1b69", "\uc44e\uc44c\uc44a\uc44d\uc44a\uc44f\uc44c\uc44a", "\u4ccc\u4cce\u4ccc\u4cc9\u4cc3\u4cca\u4ccf\u4ccb", "\u117d\u117c\u1178\u117f\u1177\u117e\u117e\u1178", "\u37fb\u37fb\u37fe\u37fd\u37fc\u37ff\u37ff\u37fb", "\u54db\u54d3\u54d2\u54df\u54de\u54d8\u54db\u54d3", "\u6585\u658e\u658f\u6581\u6580\u6585\u6587\u6580", "\u30f9\u30f7\u30fc\u30fd\u30fb\u30fc\u30f8\u30fb"}, d2={"\u0421\u0415\u0406\u245d\u046f\u046d\u047b\u041f\u0439\u0432\u0425\u0432\u047c\u043f\u0432\u043d\u0434\u047c\u0400\u0427\u0421\u043a\u043d\u0434\u0468\u047a\u041f\u0439\u0432\u0425\u0432\u047c\u043f\u0432\u043d\u0434\u047c\u0400\u0427\u0421\u043a\u043d\u0434\u0468", "\u0482\u04dd\u04d2\u04d7\u04d0\u04d7\u04ca\u0480\u0482\u0480\u0496\u0497\u04e8", "\u00c0\u0095\u0092\u0095\u0088\u00c2\u00c0\u00c2\u00d4\u00d5\u00aa", "\u0401\u0403\u0412\u0425\u040a\u0407\u0415\u0415\u045a\u0458\u044e\u044f\u042a\u040c\u0407\u0410\u0407\u0449\u040a\u0407\u0408\u0401\u0449\u0425\u040a\u0407\u0415\u0415\u045d", "\u04af\u04a6\u04b4\u04af\u0484\u04a8\u04a3\u04a2\u04fb\u04f9\u04ef\u04ee\u048e", "\u00ce\u00da\u00de\u00ca\u00c7\u00d8\u0097\u0095\u0083\u00e7\u00c1\u00ca\u00dd\u00ca\u0084\u00c7\u00ca\u00c5\u00cc\u0084\u00e4\u00c9\u00c1\u00ce\u00c8\u00df\u0090\u0082\u00f1", "\u0664\u066b\u0668\u0669\u0662\u063b\u0639\u062f\u062e\u064b\u066d\u0666\u0671\u0666\u0628\u066b\u0666\u0669\u0660\u0628\u0648\u0665\u066d\u0662\u0664\u0673\u063c", "\u0465\u047e\u0442\u0465\u0463\u0478\u047f\u0476\u042d\u042f\u0439\u0438\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0442\u0465\u0463\u0478\u047f\u0476\u042a", "\u0144\u0145\u015e\u0143\u014c\u0153\u0116\u0114\u0102\u0103\u017c", "\u0516\u0517\u050c\u0511\u051e\u0501\u0539\u0514\u0514\u0544\u0546\u0550\u0551\u052e", "\u06a4\u06b2\u06ba\u06a7\u06ef\u06ed\u06fb\u06fa\u0685", "\u012c\u013a\u0132\u012f\u0167\u0165\u0173\u0111\u0172\u010d", "\u01ee\u01f8\u01f0\u01ed\u01a9\u01a5\u01a7\u01b1\u01d3\u01b0\u01cf", "\u039e\u0388\u0380\u039d\u03d5\u03d7\u03c1\u03a3\u03a0\u03c0\u03bf", "\u07b5\u07ba\u07bd\u07b2\u07bf\u07ba\u07a9\u07b6\u07ef\u07ed\u07fb\u07fa\u0785"})
public final class Class1446 {
    public static float field5503 = Float.intBitsToFloat(1132396544);

    /*
     * Unable to fully structure code
     */
    private static CallSite wjbKLHAIKISWE9(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1446.g76zUo72OcywCLIn(k, -1649781039));
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
                v0 = 22785;
                ** GOTO lbl19
            }
            v0 = 22786;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 22784;
lbl19:
                // 3 sources

                switch (v0) {
                    case 22786: {
                        continue block7;
                    }
                    case 22785: {
                        try {
                            a = Integer.parseInt(Class1446.g76zUo72OcywCLIn(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1446.g76zUo72OcywCLIn(r[f], l);
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
            throw new Exception("Can't find method in " + Class1446.g76zUo72OcywCLIn(k, -1649781039) + " " + l + " " + m);
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
        aT\u200e = "Selection";
    }

    private static String g76zUo72OcywCLIn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

