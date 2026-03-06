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

@HACHIMI_CLIENT(mv=100, d1={"\ub5e0\ub5e7\ub5e2\ub5e1\ub5e4\ub5e7\ub5e1\ub5e7", "\ua4e4\ua4e1\ua4e3\ua4e1\ua4e5\ua4e1\ua4e9\ua4e3", "\u4e7d\u4e78\u4e79\u4e7e\u4e7f\u4e78\u4e7b\u4e7c", "\u8b7c\u8b7f\u8b79\u8b79\u8b7d\u8b77\u8b78\u8b79", "\ub326\ub320\ub324\ub325\ub325\ub321\ub326\ub324", "\u7d25\u7d22\u7d26\u7d25\u7d2f\u7d26\u7d20\u7d2f", "\u25a1\u25ab\u25aa\u25a7\u25a1\u25a0\u25a7\u25a3", "\u85d4\u85d1\u85d5\u85d4\u85d5\u85d5\u85d0\u85d1", "\u96f7\u96f1\u96f2\u96f1\u96f7\u96f2\u96fc\u96f6", "\uc115\uc117\uc114\uc112\uc11f\uc114\uc11f\uc113", "\u7e58\u7e5d\u7e58\u7e5e\u7e53\u7e53\u7e5b\u7e5b", "\u40ef\u40e0\u40e1\u40e8\u40ee\u40ed\u40e9\u40ec", "\u9024\u9025\u9023\u902c\u9022\u9020\u902d\u902d", "\u3078\u307e\u3076\u307d\u307b", "\u4016\u4015\u4013\u4015\u4010\u4014\u4014\u4015"}, d2={"\u0300\u0314\u0304\u237e\u034c\u034e\u0358\u033c\u031a\u0311\u0306\u0311\u035f\u031c\u0311\u031e\u0317\u035f\u0323\u0304\u0302\u0319\u031e\u0317\u034b\u0359\u033c\u031a\u0311\u0306\u0311\u035f\u031c\u0311\u031e\u0317\u035f\u0323\u0304\u0302\u0319\u031e\u0317\u034b", "\u012a\u0175\u017a\u017f\u0178\u017f\u0162\u0128\u012a\u0128\u013e\u013f\u0140", "\u03e9\u03bc\u03bb\u03bc\u03a1\u03eb\u03e9\u03eb\u03fd\u03fc\u0383", "\u0270\u0272\u0263\u0254\u027b\u0276\u0264\u0264\u022b\u0229\u023f\u023e\u025b\u027d\u0276\u0261\u0276\u0238\u027b\u0276\u0279\u0270\u0238\u0254\u027b\u0276\u0264\u0264\u022c", "\u0706\u070f\u071d\u0706\u072d\u0701\u070a\u070b\u0752\u0750\u0746\u0747\u0727", "\u057d\u0569\u056d\u0579\u0574\u056b\u0524\u0526\u0530\u0554\u0572\u0579\u056e\u0579\u0537\u0574\u0579\u0576\u057f\u0537\u0557\u057a\u0572\u057d\u057b\u056c\u0523\u0531\u0542", "\u0298\u0297\u0294\u0295\u029e\u02c7\u02c5\u02d3\u02d2\u02b7\u0291\u029a\u028d\u029a\u02d4\u0297\u029a\u0295\u029c\u02d4\u02b4\u0299\u0291\u029e\u0298\u028f\u02c0", "\u0694\u068f\u06b3\u0694\u0692\u0689\u068e\u0687\u06dc\u06de\u06c8\u06c9\u06ac\u068a\u0681\u0696\u0681\u06cf\u068c\u0681\u068e\u0687\u06cf\u06b3\u0694\u0692\u0689\u068e\u0687\u06db", "\u01ea\u01eb\u01f0\u01ed\u01e2\u01fd\u01b8\u01ba\u01ac\u01ad\u01d2", "\u056d\u056c\u0577\u056a\u0565\u057a\u0542\u056f\u056f\u053f\u053d\u052b\u052a\u0555", "\u02e6\u02f0\u02f8\u02e5\u02ad\u02af\u02b9\u02b8\u02c7", "\u00fa\u00ec\u00e4\u00f9\u00b1\u00b3\u00a5\u00c7\u00a4\u00db", "\u02b2\u02a4\u02ac\u02b1\u02f5\u02f9\u02fb\u02ed\u028f\u02ec\u0293", "\u05b7\u05a1\u05a9\u05b4\u05fc\u05fe\u05e8\u058a\u0589\u05e9\u0596", "\u04b5\u04ba\u04bd\u04b2\u04bf\u04ba\u04a9\u04b6\u04ef\u04ed\u04fb\u04fa\u0485"})
public final class Class1333 {
    public static float field5154 = Float.intBitsToFloat(1065290592);
    public static double field5155 = 0.2957534597564212;
    public static double field5156 = Double.longBitsToDouble(4606676537151171575L);

    private static String QGWYfBGoYW7lzQI6(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite NguitgAgL24OvQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1333.QGWYfBGoYW7lzQI6(k2, -1863835369));
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
                int a2 = Integer.parseInt(Class1333.QGWYfBGoYW7lzQI6(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1333.QGWYfBGoYW7lzQI6(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1333.QGWYfBGoYW7lzQI6(k2, -1863835369) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 3045 : 3046;
        block7: while (true) {
            switch (n3) {
                case 3046: {
                    n3 = 3044;
                    continue block7;
                }
                case 3045: {
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
        aI\u200e = "FILL";
    }
}

