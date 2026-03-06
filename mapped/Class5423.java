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

@HACHIMI_CLIENT(mv=100, d1={"\u517b\u5177\u517c\u5177\u517e\u517f\u5176\u5176", "\u2c3f\u2c3a\u2c35\u2c3f\u2c39\u2c3e\u2c34\u2c3b", "\uc240\uc241\uc246\uc243\uc240\uc242\uc243\uc240", "\u9f66\u9f60\u9f65\u9f64\u9f65\u9f6c\u9f65\u9f62", "\ub2e8\ub2e0\ub2e8\ub2e9\ub2ed\ub2e9\ub2eb\ub2ec", "\u509b\u509b\u509b\u509b\u5099\u5094\u509e\u509b", "\u432b\u432b\u432a\u432e\u432b\u432f\u4327\u432c", "\ua42b\ua427\ua429\ua42f\ua426\ua42f\ua42c\ua426", "\uc8ba\uc8bd\uc8be\uc8bd\uc8ba\uc8bf\uc8bb\uc8b5", "\u6c78\u6c7d\u6c72\u6c7e\u6c7a\u6c72\u6c7e\u6c7b", "\u2171\u2170\u2174\u2176\u2177\u2175\u2177\u2172", "\u581b\u581c\u5819\u581c\u5810\u581f\u581a\u5811", "\udb1d\udb15\udb1b\udb1c\udb15\udb15\udb1d\udb14", "\uca67\uca69\uca61\uca63\uca63\uca61\uca66", "\u3316\u3319\u3314\u3315\u3316\u3315\u3315\u3310", "\u6cc1\u6cc5\u6ccf\u6cc1\u6cc7\u6cc2\u6cc4\u6cc7"}, d2={"\u0481\u04b8\u24c6\u04f4\u04f6\u04e0\u0484\u04a2\u04a9\u04be\u04a9\u04e7\u04a4\u04a9\u04a6\u04af\u04e7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f3\u04e1\u0484\u04a2\u04a9\u04be\u04a9\u04e7\u04a4\u04a9\u04a6\u04af\u04e7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f3", "\u00c0\u00f8\u2087\u00b5\u00b7\u00a1\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2\u00a0\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2", "\u02d1\u028e\u0281\u0284\u0283\u0284\u0299\u02d3\u02d1\u02d3\u02c5\u02c4\u02bb", "\u0139\u016c\u016b\u016c\u0171\u013b\u0139\u013b\u012d\u012c\u0153", "\u07d0\u07d2\u07c3\u07f4\u07db\u07d6\u07c4\u07c4\u078b\u0789\u079f\u079e\u07fb\u07dd\u07d6\u07c1\u07d6\u0798\u07db\u07d6\u07d9\u07d0\u0798\u07f4\u07db\u07d6\u07c4\u07c4\u078c", "\u01f4\u01fd\u01ef\u01f4\u01df\u01f3\u01f8\u01f9\u01a0\u01a2\u01b4\u01b5\u01d5", "\u019b\u018f\u018b\u019f\u0192\u018d\u01c2\u01c0\u01d6\u01b2\u0194\u019f\u0188\u019f\u01d1\u0192\u019f\u0190\u0199\u01d1\u01b1\u019c\u0194\u019b\u019d\u018a\u01c5\u01d7\u01a4", "\u025a\u0255\u0256\u0257\u025c\u0205\u0207\u0211\u0210\u0275\u0253\u0258\u024f\u0258\u0216\u0255\u0258\u0257\u025e\u0216\u0276\u025b\u0253\u025c\u025a\u024d\u0202", "\u053b\u0520\u051c\u053b\u053d\u0526\u0521\u0528\u0573\u0571\u0567\u0566\u0503\u0525\u052e\u0539\u052e\u0560\u0523\u052e\u0521\u0528\u0560\u051c\u053b\u053d\u0526\u0521\u0528\u0574", "\u03e9\u03e8\u03f3\u03ee\u03e1\u03fe\u03bb\u03b9\u03af\u03ae\u03d1", "()2/ ?\u0007**zxno\u0010", "\u03ea\u03fc\u03f4\u03e9\u03a1\u03a3\u03b5\u03b4\u03cb", "\u01d3\u01c5\u01cd\u01d0\u0198\u019a\u018c\u01ee\u018d\u01f2", "\u0750\u0746\u074e\u0753\u0717\u071b\u0719\u070f\u076d\u070e\u0771", "\u0382\u0394\u039c\u0381\u03c9\u03cb\u03dd\u03bf\u03bc\u03dc\u03a3", "\u037c\u0373\u0374\u037b\u0376\u0373\u0360\u037f\u0326\u0324\u0332\u0333\u034c"})
public final class Class5423 {
    public static double field10087 = 0.4666389297044101;
    public static float field10088;
    public static float field10089;
    public static float field10090 = 0.48602426f;

    /*
     * WARNING - void declaration
     */
    private static CallSite MSkiAG1yu5Aw6V(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5423.s4Rqv3Knd9dwTbcw(k2, 526610368));
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
                int a2 = Integer.parseInt(Class5423.s4Rqv3Knd9dwTbcw(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5423.s4Rqv3Knd9dwTbcw(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5423.s4Rqv3Knd9dwTbcw(k2, 526610368) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String s4Rqv3Knd9dwTbcw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        ao\u200e = "The pitch angle of bounce";
        field10089 = Float.intBitsToFloat(1063366076);
        field10088 = Float.intBitsToFloat(1050637100);
        by\u200e = " ";
    }
}

