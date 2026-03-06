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

@HACHIMI_CLIENT(mv=100, d1={"\ub85a\ub85f\ub85b\ub859\ub85f\ub85b\ub850", "\ud822\ud821\ud828\ud825\ud823\ud821\ud827\ud824", "\ubc39\ubc39\ubc3f\ubc34\ubc35\ubc34\ubc34\ubc3f", "\u988b\u988b\u988a\u9889\u988f\u9884\u9889\u988c", "\u87c5\u87c7\u87c4\u87c5\u87cc\u87c6\u87c7\u87c4", "\u3c7b\u3c70\u3c71\u3c7c\u3c7a\u3c7d\u3c70\u3c79", "\ucaae\ucaa5\ucaae\ucaa5\ucaa8\ucaaf\ucaa9\ucaa9", "\u8846\u8841\u884b\u8843\u8841\u8847\u8840\u8840", "\ucfae\ucfaa\ucfa3\ucfaa\ucfa3\ucfa8\ucfae\ucfa2", "\u3b6b\u3b6e\u3b6a\u3b6b\u3b6b\u3b6a\u3b62\u3b63", "\u1451\u1452\u1453\u1452\u145f\u1454\u1451\u1451", "\u6177\u6170\u6171\u6175\u6177\u6177\u6172\u6173", "\u7bfd\u7bf9\u7bfc\u7bfa\u7bfa\u7bf7\u7bf7\u7bf6", "\u105b\u105f\u105a\u1050\u105e\u1050\u1050\u105a", "\u47ad\u47a8\u47ac\u47a6\u47a6\u47ab\u47aa\u47a9", "\u7c21\u7c26\u7c2f\u7c22\u7c26\u7c2e\u7c24\u7c24", "\u422f\u4220\u4228\u422f\u422b\u422c\u4220\u4221"}, d2={"\u06c3\u06dd\u06c3\u26bd\u068f\u068d\u069b\u06ff\u06d9\u06d2\u06c5\u06d2\u069c\u06df\u06d2\u06dd\u06d4\u069c\u06e0\u06c7\u06c1\u06da\u06dd\u06d4\u0688\u069a\u06ff\u06d9\u06d2\u06c5\u06d2\u069c\u06df\u06d2\u06dd\u06d4\u069c\u06e0\u06c7\u06c1\u06da\u06dd\u06d4\u0688", "\u029c\u0282\u029d\u22e2\u02d0\u02d2\u02c4\u02a0\u0286\u028d\u029a\u028d\u02c3\u0280\u028d\u0282\u028b\u02c3\u02bf\u0298\u029e\u0285\u0282\u028b\u02d7\u02c5\u02a0\u0286\u028d\u029a\u028d\u02c3\u0280\u028d\u0282\u028b\u02c3\u02bf\u0298\u029e\u0285\u0282\u028b\u02d7", "OQM\u2031\u0003\u0001\u0017sU^I^\u0010S^QX\u0010lKMVQX\u0004\u0016sU^I^\u0010S^QX\u0010lKMVQX\u0004", "\u04db\u0484\u048b\u048e\u0489\u048e\u0493\u04d9\u04db\u04d9\u04cf\u04ce\u04b1", "\u06fd\u06a8\u06af\u06a8\u06b5\u06ff\u06fd\u06ff\u06e9\u06e8\u0697", "\u0322\u0320\u0331\u0306\u0329\u0324\u0336\u0336\u0379\u037b\u036d\u036c\u0309\u032f\u0324\u0333\u0324\u036a\u0329\u0324\u032b\u0322\u036a\u0306\u0329\u0324\u0336\u0336\u037e", "\u0254\u025d\u024f\u0254\u027f\u0253\u0258\u0259\u0200\u0202\u0214\u0215\u0275", "\u046a\u047e\u047a\u046e\u0463\u047c\u0433\u0431\u0427\u0443\u0465\u046e\u0479\u046e\u0420\u0463\u046e\u0461\u0468\u0420\u0440\u046d\u0465\u046a\u046c\u047b\u0434\u0426\u0455", "\u00d4\u00db\u00d8\u00d9\u00d2\u008b\u0089\u009f\u009e\u00fb\u00dd\u00d6\u00c1\u00d6\u0098\u00db\u00d6\u00d9\u00d0\u0098\u00f8\u00d5\u00dd\u00d2\u00d4\u00c3\u008c", "\u022a\u0231\u020d\u022a\u022c\u0237\u0230\u0239\u0262\u0260\u0276\u0277\u0212\u0234\u023f\u0228\u023f\u0271\u0232\u023f\u0230\u0239\u0271\u020d\u022a\u022c\u0237\u0230\u0239\u0265", "\u02d9\u02d8\u02c3\u02de\u02d1\u02ce\u028b\u0289\u029f\u029e\u02e1", "\u07e5\u07e4\u07ff\u07e2\u07ed\u07f2\u07ca\u07e7\u07e7\u07b7\u07b5\u07a3\u07a2\u07dd", "es{f.,:;D", "\u02cd\u02db\u02d3\u02ce\u0286\u0284\u0292\u02f0\u0293\u02ec", "\u067c\u066a\u0662\u067f\u063b\u0637\u0635\u0623\u0641\u0622\u065d", "\u037b\u036d\u0365\u0378\u0330\u0332\u0324\u0346\u0345\u0325\u035a", "KDCLADWH\u0011\u0013\u0005\u0004{"})
public final class Class4256 {
    public static int field9940 = 0;
    public static int field9941 = 505272772;
    public static double field9942;

    private static String JdVKWa1hl1BdFFAR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        D\u200e = "GREATEST";
        bw\u200e = "MineDownward";
        field9942 = Double.longBitsToDouble(4601373303476444898L);
        bK\u200e = "Only attempts criticals when standing";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite nV2bDdndfWO491(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4256.JdVKWa1hl1BdFFAR(k2, 264433609));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4256.JdVKWa1hl1BdFFAR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 59978 : 59977;
            block7: while (true) {
                switch (n3) {
                    case 59978: {
                        n3 = 59976;
                        continue block7;
                    }
                    case 59977: {
                        String c2 = Class4256.JdVKWa1hl1BdFFAR(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class4256.JdVKWa1hl1BdFFAR(k2, 264433609) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

