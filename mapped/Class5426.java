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

@HACHIMI_CLIENT(mv=100, d1={"\ua247\ua244\ua245\ua247\ua246\ua245\ua245\ua244", "\ucf73\ucf79\ucf73\ucf79\ucf72\ucf71\ucf76\ucf74", "\u5741\u5745\u5745\u5740\u5747\u5742\u5740\u5744", "\u42bf\u42bd\u42bf\u42bf\u42b7\u42bb\u42b9\u42b6", "\u24f5\u24f0\u24f3\u24fe\u24f7\u24f4\u24f0", "\ub61f\ub61b\ub61d\ub61b\ub61b\ub618\ub61d", "\u7c25\u7c20\u7c26\u7c24\u7c27\u7c25\u7c27\u7c25", "\u90fa\u90f0\u90ff\u90fe\u90f1\u90fb\u90fe", "\ue358\ue359\ue359\ue351\ue357\ue355\ue358", "\u8735\u8737\u8731\u873a\u8735\u8736\u8736", "\ub4dc\ub4da\ub4da\ub4dd\ub4d0\ub4d1\ub4db\ub4d1", "\ua7fa\ua7fa\ua7ff\ua7f1\ua7fb\ua7ff\ua7fa\ua7fe", "\u9603\u9607\u9602\u9605\u9600\u9607\u9602\u9603", "\u7444\u7445\u7444\u7443\u7441\u7446\u7442\u7442", "\u14fa\u14fc\u14f8\u14fd\u14fa\u14f8\u14fb\u14fe", "\u1dd3\u1dd1\u1dd4\u1dd6\u1dd4\u1dd0\u1dd2\u1dd1"}, d2={"\u043c\u041a\u0404\u245b\u0469\u046b\u047d\u0419\u043f\u0434\u0423\u0434\u047a\u0439\u0434\u043b\u0432\u047a\u0406\u0421\u0427\u043c\u043b\u0432\u046e\u047c\u0419\u043f\u0434\u0423\u0434\u047a\u0439\u0434\u043b\u0432\u047a\u0406\u0421\u0427\u043c\u043b\u0432\u046e", "\u0734\u0712\u070f\u2753\u0761\u0763\u0775\u0711\u0737\u073c\u072b\u073c\u0772\u0731\u073c\u0733\u073a\u0772\u070e\u0729\u072f\u0734\u0733\u073a\u0766\u0774\u0711\u0737\u073c\u072b\u073c\u0772\u0731\u073c\u0733\u073a\u0772\u070e\u0729\u072f\u0734\u0733\u073a\u0766", "\u01c0\u019f\u0190\u0195\u0192\u0195\u0188\u01c2\u01c0\u01c2\u01d4\u01d5\u01aa", "\u035d\u0308\u030f\u0308\u0315\u035f\u035d\u035f\u0349\u0348\u0337", "\u0297\u0295\u0284\u02b3\u029c\u0291\u0283\u0283\u02cc\u02ce\u02d8\u02d9\u02bc\u029a\u0291\u0286\u0291\u02df\u029c\u0291\u029e\u0297\u02df\u02b3\u029c\u0291\u0283\u0283\u02cb", "\u07c0\u07c9\u07db\u07c0\u07eb\u07c7\u07cc\u07cd\u0794\u0796\u0780\u0781\u07e1", "\u05cf\u05db\u05df\u05cb\u05c6\u05d9\u0596\u0594\u0582\u05e6\u05c0\u05cb\u05dc\u05cb\u0585\u05c6\u05cb\u05c4\u05cd\u0585\u05e5\u05c8\u05c0\u05cf\u05c9\u05de\u0591\u0583\u05f0", "\u05fa\u05f5\u05f6\u05f7\u05fc\u05a5\u05a7\u05b1\u05b0\u05d5\u05f3\u05f8\u05ef\u05f8\u05b6\u05f5\u05f8\u05f7\u05fe\u05b6\u05d6\u05fb\u05f3\u05fc\u05fa\u05ed\u05a2", "\u05b5\u05ae\u0592\u05b5\u05b3\u05a8\u05af\u05a6\u05fd\u05ff\u05e9\u05e8\u058d\u05ab\u05a0\u05b7\u05a0\u05ee\u05ad\u05a0\u05af\u05a6\u05ee\u0592\u05b5\u05b3\u05a8\u05af\u05a6\u05fa", "\u059d\u059c\u0587\u059a\u0595\u058a\u05cf\u05cd\u05db\u05da\u05a5", "\u039c\u039d\u0386\u039b\u0394\u038b\u03b3\u039e\u039e\u03ce\u03cc\u03da\u03db\u03a4", "\u05b7\u05a1\u05a9\u05b4\u05fc\u05fe\u05e8\u05e9\u0596", "\u056f\u0579\u0571\u056c\u0524\u0526\u0530\u0552\u0531\u054e", "\u01c8\u01de\u01d6\u01cb\u018f\u0183\u0181\u0197\u01f5\u0196\u01e9", "\u062d\u063b\u0633\u062e\u0666\u0664\u0672\u0610\u0613\u0673\u060c", "\u01b5\u01ba\u01bd\u01b2\u01bf\u01ba\u01a9\u01b6\u01ef\u01ed\u01fb\u01fa\u0185"})
public final class Class5426 {
    public static float field10098 = 0.30424267f;
    public static double field10099;
    public static double field10100;

    private static String i34n0160yDQlmAaJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite joiYSmb6OBGOky(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5426.i34n0160yDQlmAaJ(k2, 674412703));
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
                int a2 = Integer.parseInt(Class5426.i34n0160yDQlmAaJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5426.i34n0160yDQlmAaJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5426.i34n0160yDQlmAaJ(k2, 674412703) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        h\u200e = "AnimalsFill";
        M\u200e = "OTHER";
        field10100 = Double.longBitsToDouble(4602794625893409056L);
        field10099 = Double.longBitsToDouble(4587920848569012272L);
    }
}

