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

@HACHIMI_CLIENT(mv=100, d1={"\u6fbb\u6fba\u6fbc\u6fb8\u6fb3\u6fbd\u6fba\u6fba", "\u51c1\u51c1\u51c4\u51c6\u51cf\u51c6\u51c7", "\u4046\u4043\u4040\u404f\u4041\u4041\u4044\u404e", "\uc981\uc985\uc98f\uc985\uc983\uc980\uc986\uc980", "\u5b9e\u5b9f\u5b9c\u5b9b\u5b9e\u5b9c\u5b9e\u5b9b", "\u95cd\u95cc\u95c9\u95ce\u95ce\u95cd\u95cd", "\ua7c3\ua7c4\ua7c7\ua7c0\ua7c5\ua7c1\ua7c6\ua7c6", "\u9a4a\u9a4c\u9a4c\u9a48\u9a4b\u9a4a\u9a48\u9a4d", "\ud375\ud37a\ud370\ud372\ud37b\ud37b\ud374\ud377", "\u24ed\u24ea\u24ec\u24ea\u24eb\u24ef\u24e3\u24ec", "\ub745\ub741\ub746\ub744\ub745\ub74e\ub744\ub744", "\uc67a\uc67d\uc67e\uc678\uc67b\uc670\uc67a\uc67c", "\ucb19\ucb11\ucb12\ucb13\ucb17\ucb12\ucb18", "\ucb19\ucb1f\ucb1f\ucb1a\ucb1b\ucb13\ucb19\ucb1f", "\u4152\u4156\u4154\u4158\u4156\u4153\u4151\u4155", "\ua47e\ua475\ua47d\ua47e\ua474\ua479\ua47f\ua47a"}, d2={"\u0379\u0364\u0362\u2318\u032a\u0328\u033e\u035a\u037c\u0377\u0360\u0377\u0339\u037a\u0377\u0378\u0371\u0339\u0345\u0362\u0364\u037f\u0378\u0371\u032d\u033f\u035a\u037c\u0377\u0360\u0377\u0339\u037a\u0377\u0378\u0371\u0339\u0345\u0362\u0364\u037f\u0378\u0371\u032d", "\u072f\u0732\u0735\u274e\u077c\u077e\u0768\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u0713\u0734\u0732\u0729\u072e\u0727\u077b\u0769\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u0713\u0734\u0732\u0729\u072e\u0727\u077b", "\u0378\u0327\u0328\u032d\u032a\u032d\u0330\u037a\u0378\u037a\u036c\u036d\u0312", "\u0495\u04c0\u04c7\u04c0\u04dd\u0497\u0495\u0497\u0481\u0480\u04ff", "\u00b8\u00ba\u00ab\u009c\u00b3\u00be\u00ac\u00ac\u00e3\u00e1\u00f7\u00f6\u0093\u00b5\u00be\u00a9\u00be\u00f0\u00b3\u00be\u00b1\u00b8\u00f0\u009c\u00b3\u00be\u00ac\u00ac\u00e4", "\u00fe\u00f7\u00e5\u00fe\u00d5\u00f9\u00f2\u00f3\u00aa\u00a8\u00be\u00bf\u00df", "\u01c0\u01d4\u01d0\u01c4\u01c9\u01d6\u0199\u019b\u018d\u01e9\u01cf\u01c4\u01d3\u01c4\u018a\u01c9\u01c4\u01cb\u01c2\u018a\u01ea\u01c7\u01cf\u01c0\u01c6\u01d1\u019e\u018c\u01ff", "\u048a\u0485\u0486\u0487\u048c\u04d5\u04d7\u04c1\u04c0\u04a5\u0483\u0488\u049f\u0488\u04c6\u0485\u0488\u0487\u048e\u04c6\u04a6\u048b\u0483\u048c\u048a\u049d\u04d2", "\u017a\u0161\u015d\u017a\u017c\u0167\u0160\u0169\u0132\u0130\u0126\u0127\u0142\u0164\u016f\u0178\u016f\u0121\u0162\u016f\u0160\u0169\u0121\u015d\u017a\u017c\u0167\u0160\u0169\u0135", "\u02b7\u02b6\u02ad\u02b0\u02bf\u02a0\u02e5\u02e7\u02f1\u02f0\u028f", "\u04b9\u04b8\u04a3\u04be\u04b1\u04ae\u0496\u04bb\u04bb\u04eb\u04e9\u04ff\u04fe\u0481", "\u00d5\u00c3\u00cb\u00d6\u009e\u009c\u008a\u008b\u00f4", "\u02df\u02c9\u02c1\u02dc\u0294\u0296\u0280\u02e2\u0281\u02fe", "\u066a\u067c\u0674\u0669\u062d\u0621\u0623\u0635\u0657\u0634\u064b", "\u061f\u0609\u0601\u061c\u0654\u0656\u0640\u0622\u0621\u0641\u063e", "\u0554\u055b\u055c\u0553\u055e\u055b\u0548\u0557\u050e\u050c\u051a\u051b\u0564"})
public final class Class4247 {
    public static double field9919 = Double.longBitsToDouble(4602154587436007116L);
    public static float field9920 = Float.intBitsToFloat(1061072994);

    static {
        ac\u200e = "AttackPacket";
        bO\u200e = "Speed";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite pDfmtjWjrNyTu0(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4247.dqeJNQXLQy6ttG5T(k2, -2089488911));
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
                int a2 = Integer.parseInt(Class4247.dqeJNQXLQy6ttG5T(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4247.dqeJNQXLQy6ttG5T(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4247.dqeJNQXLQy6ttG5T(k2, -2089488911) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String dqeJNQXLQy6ttG5T(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

