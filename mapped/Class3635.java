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
@HACHIMI_CLIENT(mv=100, d1={"\u2d16\u2d17\u2d12\u2d11\u2d14\u2d14\u2d16\u2d14", "\u75cf\u75c9\u75c3\u75ca\u75c9\u75c9\u75c8", "\u773c\u7739\u773e\u7737\u773e\u773a\u7738\u7737", "\ue0bb\ue0be\ue0b8\ue0ba\ue0b1\ue0b1\ue0b8\ue0b0", "\ub0f1\ub0fc\ub0f7\ub0fd\ub0fc\ub0f7\ub0f2", "\u3b8d\u3b87\u3b8e\u3b8c\u3b8b\u3b8f\u3b8c\u3b87", "\ue6d2\ue6d2\ue6d0\ue6d0\ue6d5\ue6d4\ue6de", "\u1f2a\u1f2d\u1f2d\u1f26\u1f26\u1f2f\u1f2e\u1f2c", "\ucb7d\ucb7a\ucb7e\ucb7e\ucb72\ucb7e\ucb7b\ucb7c", "\ua580\ua58c\ua586\ua586\ua580\ua584\ua587\ua587", "\u9529\u952b\u952b\u952f\u9522\u9528\u9529\u9528", "\u3243\u3245\u3246\u3242\u3242\u3244\u3245", "\uadb6\uadb3\uadbb\uadb3\uadb0\uadbb\uadba\uadbb", "\u5c69\u5c69\u5c69\u5c62\u5c6c\u5c62\u5c6d\u5c6a"}, d2={"\u0503\u055c\u0553\u0556\u0551\u0556\u054b\u0501\u0503\u0501\u0517\u0516\u0569", "`525(b`btu\n", "\u0636\u0634\u0625\u0612\u063d\u0630\u0622\u0622\u066d\u066f\u0679\u0678\u061d\u063b\u0630\u0627\u0630\u067e\u063d\u0630\u063f\u0636\u067e\u0612\u063d\u0630\u0622\u0622\u066a", "\u03f8\u03f1\u03e3\u03f8\u03d3\u03ff\u03f4\u03f5\u03ac\u03ae\u03b8\u03b9\u03d9", "\u0209\u021d\u0219\u020d\u0200\u021f\u0250\u0252\u0244\u0220\u0206\u020d\u021a\u020d\u0243\u0200\u020d\u0202\u020b\u0243\u0223\u020e\u0206\u0209\u020f\u0218\u0257\u0245\u0236", "\u01c0\u01cf\u01cc\u01cd\u01c6\u019f\u019d\u018b\u018a\u01ef\u01c9\u01c2\u01d5\u01c2\u018c\u01cf\u01c2\u01cd\u01c4\u018c\u01ec\u01c1\u01c9\u01c6\u01c0\u01d7\u0198", "\u00b1\u00aa\u0096\u00b1\u00b7\u00ac\u00ab\u00a2\u00f9\u00fb\u00ed\u00ec\u0089\u00af\u00a4\u00b3\u00a4\u00ea\u00a9\u00a4\u00ab\u00a2\u00ea\u0096\u00b1\u00b7\u00ac\u00ab\u00a2\u00fe", "\u07b0\u07b1\u07aa\u07b7\u07b8\u07a7\u07e2\u07e0\u07f6\u07f7\u0788", "\u03e8\u03e9\u03f2\u03ef\u03e0\u03ff\u03c7\u03ea\u03ea\u03ba\u03b8\u03ae\u03af\u03d0", "\u057a\u056c\u0564\u0579\u0531\u0533\u0525\u0524\u055b", "\u0685\u0693\u069b\u0686\u06ce\u06cc\u06da\u06b8\u06db\u06a4", "\u013c\u012a\u0122\u013f\u017b\u0177\u0175\u0163\u0101\u0162\u011d", "\u02ac\u02ba\u02b2\u02af\u02e7\u02e5\u02f3\u0291\u0292\u02f2\u028d", "\u0479\u0476\u0471\u047e\u0473\u0476\u0465\u047a\u0423\u0421\u0437\u0436\u0449"})
public final class Class3635 {
    public static int field8120 = 360080756;
    public static float field8121 = Float.intBitsToFloat(1059845455);
    public static double field8122;
    public static float field8123;

    static {
        field8123 = Float.intBitsToFloat(1049885012);
        field8122 = Double.longBitsToDouble(4598399514053183904L);
    }

    private static String 9QBIuqQlVooEHICb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite S0UqLBi9JkNiFB(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3635.9QBIuqQlVooEHICb(k, -2028926094));
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
                v0 = 42477;
                ** GOTO lbl19
            }
            v0 = 42478;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 42476;
lbl19:
                // 3 sources

                switch (v0) {
                    case 42478: {
                        continue block7;
                    }
                    case 42477: {
                        try {
                            a = Integer.parseInt(Class3635.9QBIuqQlVooEHICb(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3635.9QBIuqQlVooEHICb(r[f], l);
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
            throw new Exception("Can't find method in " + Class3635.9QBIuqQlVooEHICb(k, -2028926094) + " " + l + " " + m);
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

