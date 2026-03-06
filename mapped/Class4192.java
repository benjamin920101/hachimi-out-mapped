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

@HACHIMI_CLIENT(mv=100, d1={"\u95b6\u95bb\u95bb\u95bb\u95b3\u95b6\u95ba\u95b2", "\u12a0\u12a6\u12a3\u12a0\u12a7\u12a1\u12a1\u12ab", "\u106c\u1066\u106a\u106f\u106c\u1066\u1069\u1067", "\uc044\uc043\uc04e\uc043\uc04e\uc041\uc040\uc044", "\ub78e\ub78c\ub78a\ub78e\ub788\ub78a", "\u70a9\u70af\u70af\u70a5\u70ad\u70a5\u70ac\u70ac", "\u772a\u772b\u7724\u772c\u772a\u772f\u7729\u7724", "\ua8fb\ua8f4\ua8fc\ua8f5\ua8f5\ua8f5\ua8f4\ua8fd", "\u7240\u7244\u724e\u7246\u7244\u7245\u724e\u7246", "\u0dee\u0de4\u0dee\u0de5\u0def\u0ded\u0dee\u0def", "\u3e7c\u3e72\u3e7e\u3e7e\u3e7c\u3e73\u3e79\u3e73", "\uca55\uca50\uca53\uca51\uca57\uca59\uca51\uca56", "\u6333\u6339\u6330\u6339\u6334\u6337\u6333\u6336", "\u86df\u86dd\u86df\u86da\u86dd\u86d9\u86de\u86de", "\ub4df\ub4dc\ub4d8\ub4d2\ub4df\ub4da\ub4d8\ub4db", "\ubf57\ubf52\ubf53\ubf51\ubf54\ubf56\ubf51\ubf53"}, d2={"\u0379\u035e\u0356\u231f\u032d\u032f\u0339\u035d\u037b\u0370\u0367\u0370\u033e\u037d\u0370\u037f\u0376\u033e\u0342\u0365\u0363\u0378\u037f\u0376\u032a\u0338\u035d\u037b\u0370\u0367\u0370\u033e\u037d\u0370\u037f\u0376\u033e\u0342\u0365\u0363\u0378\u037f\u0376\u032a", "\u03c9\u03ee\u03e9\u23af\u039d\u039f\u0389\u03ed\u03cb\u03c0\u03d7\u03c0\u038e\u03cd\u03c0\u03cf\u03c6\u038e\u03f2\u03d5\u03d3\u03c8\u03cf\u03c6\u039a\u0388\u03ed\u03cb\u03c0\u03d7\u03c0\u038e\u03cd\u03c0\u03cf\u03c6\u038e\u03f2\u03d5\u03d3\u03c8\u03cf\u03c6\u039a", "\u0640\u061f\u0610\u0615\u0612\u0615\u0608\u0642\u0640\u0642\u0654\u0655\u062a", "\u03a7\u03f2\u03f5\u03f2\u03ef\u03a5\u03a7\u03a5\u03b3\u03b2\u03cd", "\u028d\u028f\u029e\u02a9\u0286\u028b\u0299\u0299\u02d6\u02d4\u02c2\u02c3\u02a6\u0280\u028b\u029c\u028b\u02c5\u0286\u028b\u0284\u028d\u02c5\u02a9\u0286\u028b\u0299\u0299\u02d1", "\u036f\u0366\u0374\u036f\u0344\u0368\u0363\u0362\u033b\u0339\u032f\u032e\u034e", "\u051e\u050a\u050e\u051a\u0517\u0508\u0547\u0545\u0553\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0534\u0519\u0511\u051e\u0518\u050f\u0540\u0552\u0521", "\u062e\u0621\u0622\u0623\u0628\u0671\u0673\u0665\u0664\u0601\u0627\u062c\u063b\u062c\u0662\u0621\u062c\u0623\u062a\u0662\u0602\u062f\u0627\u0628\u062e\u0639\u0676", "\u0566\u057d\u0541\u0566\u0560\u057b\u057c\u0575\u052e\u052c\u053a\u053b\u055e\u0578\u0573\u0564\u0573\u053d\u057e\u0573\u057c\u0575\u053d\u0541\u0566\u0560\u057b\u057c\u0575\u0529", "\u04d3\u04d2\u04c9\u04d4\u04db\u04c4\u0481\u0483\u0495\u0494\u04eb", "\u029c\u029d\u0286\u029b\u0294\u028b\u02b3\u029e\u029e\u02ce\u02cc\u02da\u02db\u02a4", "\u029c\u028a\u0282\u029f\u02d7\u02d5\u02c3\u02c2\u02bd", "\u0255\u0243\u024b\u0256\u021e\u021c\u020a\u0268\u020b\u0274", "\u04ee\u04f8\u04f0\u04ed\u04a9\u04a5\u04a7\u04b1\u04d3\u04b0\u04cf", "\u019f\u0189\u0181\u019c\u01d4\u01d6\u01c0\u01a2\u01a1\u01c1\u01be", "\u0364\u036b\u036c\u0363\u036e\u036b\u0378\u0367\u033e\u033c\u032a\u032b\u0354"})
public final class Class4192 {
    public static int field9786 = -422344319;
    public static float field9787;
    public static double field9788;
    public static float field9789;
    public static float field9790;
    public static int field9791 = -131170302;

    static {
        field9788 = Double.longBitsToDouble(4606051439014911359L);
        field9789 = Float.intBitsToFloat(1051501752);
        field9790 = Float.intBitsToFloat(1048934180);
        bc\u200e = "Fixes movement on Grim when rotating";
        bf\u200e = "The world time of day";
        field9787 = Float.intBitsToFloat(1027548256);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite LMFVQbG5LS91sv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4192.f9gvlofyIfVEOaiK(k2, -482586228));
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
                int a2 = Integer.parseInt(Class4192.f9gvlofyIfVEOaiK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4192.f9gvlofyIfVEOaiK(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4192.f9gvlofyIfVEOaiK(k2, -482586228) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 53236 : 53237;
        block7: while (true) {
            switch (n3) {
                case 53237: {
                    n3 = 53235;
                    continue block7;
                }
                case 53236: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String f9gvlofyIfVEOaiK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

