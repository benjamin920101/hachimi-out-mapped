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

@HACHIMI_CLIENT(mv=100, d1={"\u57e1\u57e6\u57e3\u57e6\u57e4\u57e7\u57e4", "\u0a72\u0a74\u0a71\u0a7c\u0a71\u0a73\u0a7c", "\u1220\u122a\u122a\u1225\u1224\u1220\u1224\u1227", "\ua66b\ua669\ua662\ua66f\ua663\ua662\ua66b\ua66a", "\u0272\u0278\u0277\u0271\u0274\u0278\u0279\u0273", "\u22e0\u22ea\u22e2\u22e2\u22e2\u22e5\u22e2\u22e6", "\u9177\u9172\u9171\u9170\u9171\u9172\u9176\u917d", "\u7112\u7112\u7115\u7114\u711f\u7114\u7117\u7111", "\u7b90\u7b9b\u7b9a\u7b94\u7b9b\u7b95\u7b92\u7b95", "\ue15d\ue15f\ue15b\ue153\ue15a\ue15f\ue153\ue159", "\u843d\u8436\u8433\u8435\u8431\u8435", "\ub4b6\ub4b8\ub4b5\ub4b9\ub4b6\ub4b3\ub4b1\ub4b5", "\u280a\u280c\u2809\u280b\u2800\u2801\u2808\u280a", "\u81eb\u81ef\u81ec\u81ea\u81ef\u81e8\u81e9\u81ef", "\u4f32\u4f34\u4f36\u4f30\u4f31\u4f32\u4f31\u4f34"}, d2={"\u0420\u0415\u040f\u2448\u047a\u0478\u046e\u040a\u042c\u0427\u0430\u0427\u0469\u042a\u0427\u0428\u0421\u0469\u0415\u0432\u0434\u042f\u0428\u0421\u047d\u046f\u040a\u042c\u0427\u0430\u0427\u0469\u042a\u0427\u0428\u0421\u0469\u0415\u0432\u0434\u042f\u0428\u0421\u047d", "\u0306\u0359\u0356\u0353\u0354\u0353\u034e\u0304\u0306\u0304\u0312\u0313\u036c", "\u0715\u0740\u0747\u0740\u075d\u0717\u0715\u0717\u0701\u0700\u077f", "\u02dd\u02df\u02ce\u02f9\u02d6\u02db\u02c9\u02c9\u0286\u0284\u0292\u0293\u02f6\u02d0\u02db\u02cc\u02db\u0295\u02d6\u02db\u02d4\u02dd\u0295\u02f9\u02d6\u02db\u02c9\u02c9\u0281", "\u01ae\u01a7\u01b5\u01ae\u0185\u01a9\u01a2\u01a3\u01fa\u01f8\u01ee\u01ef\u018f", "\u02b1\u02a5\u02a1\u02b5\u02b8\u02a7\u02e8\u02ea\u02fc\u0298\u02be\u02b5\u02a2\u02b5\u02fb\u02b8\u02b5\u02ba\u02b3\u02fb\u029b\u02b6\u02be\u02b1\u02b7\u02a0\u02ef\u02fd\u028e", "\u05b6\u05b9\u05ba\u05bb\u05b0\u05e9\u05eb\u05fd\u05fc\u0599\u05bf\u05b4\u05a3\u05b4\u05fa\u05b9\u05b4\u05bb\u05b2\u05fa\u059a\u05b7\u05bf\u05b0\u05b6\u05a1\u05ee", "\u04dd\u04c6\u04fa\u04dd\u04db\u04c0\u04c7\u04ce\u0495\u0497\u0481\u0480\u04e5\u04c3\u04c8\u04df\u04c8\u0486\u04c5\u04c8\u04c7\u04ce\u0486\u04fa\u04dd\u04db\u04c0\u04c7\u04ce\u0492", "\u050a\u050b\u0510\u050d\u0502\u051d\u0558\u055a\u054c\u054d\u0532", "\u02d2\u02d3\u02c8\u02d5\u02da\u02c5\u02fd\u02d0\u02d0\u0280\u0282\u0294\u0295\u02ea", "\u07e4\u07f2\u07fa\u07e7\u07af\u07ad\u07bb\u07ba\u07c5", "\u071a\u070c\u0704\u0719\u0751\u0753\u0745\u0727\u0744\u073b", "\u037b\u036d\u0365\u0378\u033c\u0330\u0332\u0324\u0346\u0325\u035a", "\u07a5\u07b3\u07bb\u07a6\u07ee\u07ec\u07fa\u0798\u079b\u07fb\u0784", "\u00c3\u00cc\u00cb\u00c4\u00c9\u00cc\u00df\u00c0\u0099\u009b\u008d\u008c\u00f3"})
public final class Class1060 {
    public static float field4341 = 0.8923134f;

    /*
     * WARNING - void declaration
     */
    private static CallSite GA8OIko7HBlbGx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1060.DYWqjkQrzUtR82LU(k2, -2140293124));
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
                int a2 = Integer.parseInt(Class1060.DYWqjkQrzUtR82LU(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1060.DYWqjkQrzUtR82LU(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1060.DYWqjkQrzUtR82LU(k2, -2140293124) + " " + l2 + " " + m2);
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
        aD\u200e = "Delay";
    }

    private static String DYWqjkQrzUtR82LU(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

