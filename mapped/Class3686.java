/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ua724\ua720\ua722\ua72e\ua720\ua726\ua72e\ua724", "\u6cb1\u6cb1\u6cb1\u6cb6\u6cb4\u6cb9\u6cb3\u6cb5", "\u24d6\u24d3\u24d4\u24d7\u24d4\u24d6\u24d5\u24d0", "\u5a58\u5a58\u5a51\u5a5e\u5a5d\u5a50\u5a51\u5a51", "\u0744\u0748\u0740\u0746\u0744\u0744\u0740\u0743", "\ua272\ua273\ua278\ua270\ua274\ua277\ua277\ua279", "\u0b11\u0b17\u0b12\u0b1b\u0b11\u0b1a\u0b1a\u0b10", "\u912b\u912c\u9129\u912f\u912f\u912d\u912c\u912e", "\u5d35\u5d30\u5d33\u5d37\u5d30\u5d37\u5d3d\u5d35", "\ue33b\ue33d\ue33f\ue33a\ue332\ue339\ue338\ue339", "\u1b36\u1b37\u1b30\u1b31\u1b31\u1b3b\u1b3a\u1b3a", "\u3230\u3236\u3234\u3239\u3233\u3230\u3230\u3237", "\u76da\u76d1\u76d1\u76d9\u76db\u76d9\u76dd\u76d1", "\u487b\u487a\u487d\u4871\u487a\u4870\u487f\u487a", "\u73bf\u73b0\u73b1\u73b1\u73b0\u73b0\u73ba\u73b1", "\u5f84\u5f86\u5f80\u5f86\u5f82\u5f80\u5f85\u5f87"}, d2={"\u0477\u0476\u044d\u240a\u0438\u043a\u042c\u0448\u046e\u0465\u0472\u0465\u042b\u0468\u0465\u046a\u0463\u042b\u0457\u0470\u0476\u046d\u046a\u0463\u043f\u042d\u0448\u046e\u0465\u0472\u0465\u042b\u0468\u0465\u046a\u0463\u042b\u0457\u0470\u0476\u046d\u046a\u0463\u043f", "\u02c6\u02c7\u02ff\u22bb\u0289\u028b\u029d\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02e6\u02c1\u02c7\u02dc\u02db\u02d2\u028e\u029c\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02e6\u02c1\u02c7\u02dc\u02db\u02d2\u028e", "\u0383\u03dc\u03d3\u03d6\u03d1\u03d6\u03cb\u0381\u0383\u0381\u0397\u0396\u03e9", "\u0643\u0616\u0611\u0616\u060b\u0641\u0643\u0641\u0657\u0656\u0629", "\u0238\u023a\u022b\u021c\u0233\u023e\u022c\u022c\u0263\u0261\u0277\u0276\u0213\u0235\u023e\u0229\u023e\u0270\u0233\u023e\u0231\u0238\u0270\u021c\u0233\u023e\u022c\u022c\u0264", "\u0408\u0401\u0413\u0408\u0423\u040f\u0404\u0405\u045c\u045e\u0448\u0449\u0429", "\u029d\u0289\u028d\u0299\u0294\u028b\u02c4\u02c6\u02d0\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02b7\u029a\u0292\u029d\u029b\u028c\u02c3\u02d1\u02a2", "\u0336\u0339\u033a\u033b\u0330\u0369\u036b\u037d\u037c\u0319\u033f\u0334\u0323\u0334\u037a\u0339\u0334\u033b\u0332\u037a\u031a\u0337\u033f\u0330\u0336\u0321\u036e", "\u02d8\u02c3\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0290\u0292\u0284\u0285\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0297", "\u0184\u0185\u019e\u0183\u018c\u0193\u01d6\u01d4\u01c2\u01c3\u01bc", "\u0342\u0343\u0358\u0345\u034a\u0355\u036d\u0340\u0340\u0310\u0312\u0304\u0305\u037a", "\u0197\u0181\u0189\u0194\u01dc\u01de\u01c8\u01c9\u01b6", "\u07ac\u07ba\u07b2\u07af\u07e7\u07e5\u07f3\u0791\u07f2\u078d", "\u03e0\u03f6\u03fe\u03e3\u03a7\u03ab\u03a9\u03bf\u03dd\u03be\u03c1", "\u008a\u009c\u0094\u0089\u00c1\u00c3\u00d5\u00b7\u00b4\u00d4\u00ab", "\u063c\u0633\u0634\u063b\u0636\u0633\u0620\u063f\u0666\u0664\u0672\u0673\u060c"})
public final class Class3686 {
    public static float field8267;

    static {
        p\u200e = "";
        field8267 = Float.intBitsToFloat(1050057582);
        bu\u200e = "Hidden";
    }

    private static String zD7231OWIy1RQDqH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite FubEFpEVAgOGJd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3686.zD7231OWIy1RQDqH(k2, 1597520809));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3686.zD7231OWIy1RQDqH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3686.zD7231OWIy1RQDqH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3686.zD7231OWIy1RQDqH(k2, 1597520809) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

