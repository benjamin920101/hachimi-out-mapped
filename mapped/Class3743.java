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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ubd8e\ubd89\ubd8a\ubd8c\ubd8d\ubd8a\ubd89\ubd8a", "\ub8fd\ub8fd\ub8fc\ub8fc\ub8f9\ub8fb\ub8f5\ub8fa", "\u95d4\u95d4\u95d5\u95d6\u95d0\u95d0\u95d3\u95d2", "\u94a7\u94a1\u94a6\u94a7\u94a7\u94a1\u94ae\u94a5", "\u61f3\u61f8\u61f3\u61f1\u61f6\u61f8\u61f4\u61f4", "\u6782\u6787\u6784\u6782\u6782\u6787\u6786\u6784", "\u11ef\u11ec\u11ed\u11e5\u11ea\u11ea\u11e8\u11ec", "\udabd\udab8\udabe\udab9\udabb\udab9\udab5", "\u9dd4\u9dd4\u9dd7\u9dd3\u9dd0\u9dd6\u9dd7", "\u56b9\u56b2\u56b8\u56b3\u56b8\u56bc\u56be\u56bd", "\uc353\uc359\uc351\uc355\uc350\uc359\uc351\uc356", "\u3fef\u3fe8\u3fe5\u3fed\u3fea\u3feb\u3fe9\u3fec", "\u133d\u133a\u133f\u133d\u133c\u133d\u1332\u1332", "\u4aea\u4ae9\u4aec\u4ae8\u4ae8\u4ae9\u4aea\u4aeb", "\u2a1a\u2a11\u2a18\u2a1f\u2a1c\u2a1e\u2a18\u2a10", "\ua183\ua188\ua182\ua187\ua186\ua189\ua188\ua186", "\ub50c\ub50b\ub50b\ub508\ub50f\ub50c\ub50b\ub50a", "\u7e32\u7e31\u7e32\u7e3b\u7e32\u7e3b\u7e3b\u7e34"}, d2={"\u00045\u0004\u2069[YO+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H4\u0013\u0015\u000e\t\u0000\\N+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H4\u0013\u0015\u000e\t\u0000\\", "\u0322\u0313\u0325\u234f\u037d\u037f\u0369\u030d\u032b\u0320\u0337\u0320\u036e\u032d\u0320\u032f\u0326\u036e\u0312\u0335\u0333\u0328\u032f\u0326\u037a\u0368\u030d\u032b\u0320\u0337\u0320\u036e\u032d\u0320\u032f\u0326\u036e\u0312\u0335\u0333\u0328\u032f\u0326\u037a", "\u06e7\u06d6\u06e1\u268a\u06b8\u06ba\u06ac\u06c8\u06ee\u06e5\u06f2\u06e5\u06ab\u06e8\u06e5\u06ea\u06e3\u06ab\u06d7\u06f0\u06f6\u06ed\u06ea\u06e3\u06bf\u06ad\u06c8\u06ee\u06e5\u06f2\u06e5\u06ab\u06e8\u06e5\u06ea\u06e3\u06ab\u06d7\u06f0\u06f6\u06ed\u06ea\u06e3\u06bf", "\u01f6\u01c7\u01f3\u219b\u01a9\u01ab\u01bd\u01d9\u01ff\u01f4\u01e3\u01f4\u01ba\u01f9\u01f4\u01fb\u01f2\u01ba\u01c6\u01e1\u01e7\u01fc\u01fb\u01f2\u01ae\u01bc\u01d9\u01ff\u01f4\u01e3\u01f4\u01ba\u01f9\u01f4\u01fb\u01f2\u01ba\u01c6\u01e1\u01e7\u01fc\u01fb\u01f2\u01ae", "\u0501\u055e\u0551\u0554\u0553\u0554\u0549\u0503\u0501\u0503\u0515\u0514\u056b", "\u02be\u02eb\u02ec\u02eb\u02f6\u02bc\u02be\u02bc\u02aa\u02ab\u02d4", "\u0586\u0584\u0595\u05a2\u058d\u0580\u0592\u0592\u05dd\u05df\u05c9\u05c8\u05ad\u058b\u0580\u0597\u0580\u05ce\u058d\u0580\u058f\u0586\u05ce\u05a2\u058d\u0580\u0592\u0592\u05da", "\u02f1\u02f8\u02ea\u02f1\u02da\u02f6\u02fd\u02fc\u02a5\u02a7\u02b1\u02b0\u02d0", "\u0350\u0344\u0340\u0354\u0359\u0346\u0309\u030b\u031d\u0379\u035f\u0354\u0343\u0354\u031a\u0359\u0354\u035b\u0352\u031a\u037a\u0357\u035f\u0350\u0356\u0341\u030e\u031c\u036f", "\u01b6\u01b9\u01ba\u01bb\u01b0\u01e9\u01eb\u01fd\u01fc\u0199\u01bf\u01b4\u01a3\u01b4\u01fa\u01b9\u01b4\u01bb\u01b2\u01fa\u019a\u01b7\u01bf\u01b0\u01b6\u01a1\u01ee", "\u06d4\u06cf\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069c\u069e\u0688\u0689\u06ec\u06ca\u06c1\u06d6\u06c1\u068f\u06cc\u06c1\u06ce\u06c7\u068f\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069b", "\u05f3\u05f2\u05e9\u05f4\u05fb\u05e4\u05a1\u05a3\u05b5\u05b4\u05cb", "\u0328\u0329\u0332\u032f\u0320\u033f\u0307\u032a\u032a\u037a\u0378\u036e\u036f\u0310", "\u00eb\u00fd\u00f5\u00e8\u00a0\u00a2\u00b4\u00b5\u00ca", "\u07b0\u07a6\u07ae\u07b3\u07fb\u07f9\u07ef\u078d\u07ee\u0791", "\u0475\u0463\u046b\u0476\u0432\u043e\u043c\u042a\u0448\u042b\u0454", "\u00ec\u00fa\u00f2\u00ef\u00a7\u00a5\u00b3\u00d1\u00d2\u00b2\u00cd", "\u00fb\u00f4\u00f3\u00fc\u00f1\u00f4\u00e7\u00f8\u00a1\u00a3\u00b5\u00b4\u00cb"})
public final class Class3743 {
    public static float field8463;
    public static float field8464;
    public static float field8465 = 0.93859535f;
    public static double field8466;
    public static long field8467 = 0xFFFFFFFFL;
    public static double field8468;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 1SVJBG11e5IJXv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3743.wATtBzO4qcaY2I9L(k2, 1597655666));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3743.wATtBzO4qcaY2I9L(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3743.wATtBzO4qcaY2I9L(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3743.wATtBzO4qcaY2I9L(k2, 1597655666) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 51875 : 51876;
        block7: while (true) {
            switch (n3) {
                case 51876: {
                    n3 = 51874;
                    continue block7;
                }
                case 51875: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        n\u200e = "Displays game FPS";
        M\u200e = "ClickSlot";
        field8468 = Double.longBitsToDouble(4597508303178984540L);
        O\u200e = "Adds a random suffix to end of messages to prevent kicks";
        field8466 = Double.longBitsToDouble(4604474679931934474L);
        af\u200e = "binds";
        field8463 = Float.intBitsToFloat(1093664768);
        field8464 = Float.intBitsToFloat(1054222036);
    }

    private static String wATtBzO4qcaY2I9L(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

