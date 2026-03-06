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

@HACHIMI_CLIENT(mv=100, d1={"\u583d\u583a\u5839\u583f\u583c\u583a\u5838\u583e", "\u777e\u777c\u777c\u7778\u777e\u777c\u777e\u777e", "\u7bde\u7bde\u7bdf\u7bdb\u7bdd\u7bdd\u7bde\u7bd8", "\ue615\ue616\ue611\ue614\ue610\ue61b\ue610\ue613", "\ub044\ub041\ub043\ub040\ub046\ub043\ub046\ub04e", "\u3b7a\u3b7e\u3b7b\u3b7a\u3b71\u3b7a\u3b79\u3b7b", "\u59c4\u59cc\u59cc\u59c4\u59c0\u59c5\u59c3\u59c2", "\u88d9\u88db\u88d9\u88da\u88db\u88db\u88df\u88df", "\u9d92\u9d93\u9d94\u9d94\u9d99\u9d95\u9d96\u9d94", "\uc384\uc382\uc384\uc382\uc383\uc383\uc389\uc382", "\u4195\u4192\u4191\u4195\u4191\u4194\u4196\u4190", "\ub165\ub165\ub160\ub160\ub161\ub160\ub160\ub165", "\u5ab1\u5ab1\u5ab0\u5ab2\u5ab4\u5abd\u5ab5\u5abc", "\u84cd\u84ca\u84ca\u84c8\u84c8\u84cb\u84cb", "\ue213\ue213\ue216\ue211\ue213\ue212", "\u3786\u3786\u3787\u3787\u3787\u3786\u3785\u3783", "\u9742\u9743\u974f\u9743\u9741\u9744\u9744\u9747", "\u2acd\u2acd\u2ac0\u2ac9\u2acd\u2ac1\u2ac8\u2ac1", "\u9cc5\u9cc4\u9cc3\u9cc7\u9cc2\u9ccb\u9cc3\u9cc7"}, d2={"\u067f\u0649\u065e\u2605\u0637\u0635\u0623\u0647\u0661\u066a\u067d\u066a\u0624\u0667\u066a\u0665\u066c\u0624\u0658\u067f\u0679\u0662\u0665\u066c\u0630\u0622\u0647\u0661\u066a\u067d\u066a\u0624\u0667\u066a\u0665\u066c\u0624\u0658\u067f\u0679\u0662\u0665\u066c\u0630", "\u0209\u023f\u022b\u2273\u0241\u0243\u0255\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u022e\u0209\u020f\u0214\u0213\u021a\u0246\u0254\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u022e\u0209\u020f\u0214\u0213\u021a\u0246", "\u0711\u0727\u0732\u276b\u0759\u075b\u074d\u0729\u070f\u0704\u0713\u0704\u074a\u0709\u0704\u070b\u0702\u074a\u0736\u0711\u0717\u070c\u070b\u0702\u075e\u074c\u0729\u070f\u0704\u0713\u0704\u074a\u0709\u0704\u070b\u0702\u074a\u0736\u0711\u0717\u070c\u070b\u0702\u075e", "\u069e\u06a8\u06b2\u26e4\u06d6\u06d4\u06c2\u06a6\u0680\u068b\u069c\u068b\u06c5\u0686\u068b\u0684\u068d\u06c5\u06b9\u069e\u0698\u0683\u0684\u068d\u06d1\u06c3\u06a6\u0680\u068b\u069c\u068b\u06c5\u0686\u068b\u0684\u068d\u06c5\u06b9\u069e\u0698\u0683\u0684\u068d\u06d1", "\u04a7\u0491\u048a\u24dd\u04ef\u04ed\u04fb\u049f\u04b9\u04b2\u04a5\u04b2\u04fc\u04bf\u04b2\u04bd\u04b4\u04fc\u0480\u04a7\u04a1\u04ba\u04bd\u04b4\u04e8\u04fa\u049f\u04b9\u04b2\u04a5\u04b2\u04fc\u04bf\u04b2\u04bd\u04b4\u04fc\u0480\u04a7\u04a1\u04ba\u04bd\u04b4\u04e8", "\u0016IFCDC^\u0014\u0016\u0014\u0002\u0003|", "I\u001c\u001b\u001c\u0001KIK]\\#", "\u0707\u0705\u0714\u0723\u070c\u0701\u0713\u0713\u075c\u075e\u0748\u0749\u072c\u070a\u0701\u0716\u0701\u074f\u070c\u0701\u070e\u0707\u074f\u0723\u070c\u0701\u0713\u0713\u075b", "\u04f7\u04fe\u04ec\u04f7\u04dc\u04f0\u04fb\u04fa\u04a3\u04a1\u04b7\u04b6\u04d6", "\u05e1\u05f5\u05f1\u05e5\u05e8\u05f7\u05b8\u05ba\u05ac\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05cb\u05e6\u05ee\u05e1\u05e7\u05f0\u05bf\u05ad\u05de", "\u043b\u0434\u0437\u0436\u043d\u0464\u0466\u0470\u0471\u0414\u0432\u0439\u042e\u0439\u0477\u0434\u0439\u0436\u043f\u0477\u0417\u043a\u0432\u043d\u043b\u042c\u0463", "\u020a\u0211\u022d\u020a\u020c\u0217\u0210\u0219\u0242\u0240\u0256\u0257\u0232\u0214\u021f\u0208\u021f\u0251\u0212\u021f\u0210\u0219\u0251\u022d\u020a\u020c\u0217\u0210\u0219\u0245", "\u06b8\u06b9\u06a2\u06bf\u06b0\u06af\u06ea\u06e8\u06fe\u06ff\u0680", "\u04eb\u04ea\u04f1\u04ec\u04e3\u04fc\u04c4\u04e9\u04e9\u04b9\u04bb\u04ad\u04ac\u04d3", "\u0321\u0337\u033f\u0322\u036a\u0368\u037e\u037f\u0300", "\u0580\u0596\u059e\u0583\u05cb\u05c9\u05df\u05bd\u05de\u05a1", "\u0374\u0362\u036a\u0377\u0333\u033f\u033d\u032b\u0349\u032a\u0355", "\u0281\u0297\u029f\u0282\u02ca\u02c8\u02de\u02bc\u02bf\u02df\u02a0", "\u02e7\u02e8\u02ef\u02e0\u02ed\u02e8\u02fb\u02e4\u02bd\u02bf\u02a9\u02a8\u02d7"})
public final class Class1697 {
    public static float field6285;
    public static int field6286 = 737875628;
    public static float field6287 = 0.028283715f;
    public static float field6288;

    static {
        o\u200e = "Base speed for moving through lava";
        field6285 = Float.intBitsToFloat(1062018924);
        aH\u200e = "SkyColor";
        aJ\u200e = "EnderChests";
        aO\u200e = "SwitchReset";
        aP\u200e = "Time to fade";
        field6288 = Float.intBitsToFloat(1062691891);
    }

    private static String SnbvLLUg6IO1TAqM(String a2, int b2) {
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
    private static CallSite lLvq3ebFFn7rJi(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1697.SnbvLLUg6IO1TAqM(k2, 1172667548));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1697.SnbvLLUg6IO1TAqM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 34472 : 34471;
            block7: while (true) {
                switch (n3) {
                    case 34472: {
                        n3 = 34470;
                        continue block7;
                    }
                    case 34471: {
                        String c2 = Class1697.SnbvLLUg6IO1TAqM(r2[f2], l2);
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
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1697.SnbvLLUg6IO1TAqM(k2, 1172667548) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

