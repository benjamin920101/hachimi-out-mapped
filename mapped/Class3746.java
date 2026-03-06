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

@HACHIMI_CLIENT(mv=100, d1={"\u6c7e\u6c7a\u6c78\u6c79\u6c7d\u6c7f\u6c76", "\ub958\ub95e\ub95a\ub95e\ub951\ub95c\ub95c\ub95b", "\ue7a2\ue7a0\ue7a8\ue7a4\ue7a4\ue7a6\ue7a7\ue7a3", "\ub406\ub402\ub405\ub407\ub406\ub404\ub40d\ub40c", "\ubd6e\ubd6a\ubd6b\ubd63\ubd63\ubd63\ubd69\ubd6f", "\u6057\u6057\u605b\u6054\u6052\u6053\u605a\u6055", "\u378f\u3789\u3788\u3789\u378d\u378c\u378f", "\u6683\u6683\u6681\u6687\u6684\u6686\u668e\u668f", "\u09b4\u09b4\u09b7\u09b9\u09b9\u09b3\u09b3\u09b9", "\u116f\u1169\u116d\u116b\u1168\u1169\u116a\u116e", "\u4bae\u4baa\u4bad\u4ba9\u4baa\u4bae", "\u1786\u1781\u1783\u1789\u1782\u1782\u1783\u1784", "\u9e08\u9e0b\u9e0d\u9e0d\u9e02\u9e02\u9e0b\u9e0b", "\ub08f\ub088\ub08e\ub08d\ub08f\ub08b\ub080\ub08a", "\u5045\u504f\u504f\u5044\u5045\u5041\u504e\u504e", "\u7608\u760a\u760a\u7609\u760c\u760d\u760d\u760f", "\u7073\u7073\u7072\u7076\u7071\u7075\u7074\u7072"}, d2={"\u0721\u073a\u2745\u0777\u0775\u0763\u0707\u0721\u072a\u073d\u072a\u0764\u0727\u072a\u0725\u072c\u0764\u0718\u073f\u0739\u0722\u0725\u072c\u0770\u0762\u0707\u0721\u072a\u073d\u072a\u0764\u0727\u072a\u0725\u072c\u0764\u0718\u073f\u0739\u0722\u0725\u072c\u0770", "\u01ec\u01f4\u2188\u01ba\u01b8\u01ae\u01ca\u01ec\u01e7\u01f0\u01e7\u01a9\u01ea\u01e7\u01e8\u01e1\u01a9\u01d5\u01f2\u01f4\u01ef\u01e8\u01e1\u01bd\u01af\u01ca\u01ec\u01e7\u01f0\u01e7\u01a9\u01ea\u01e7\u01e8\u01e1\u01a9\u01d5\u01f2\u01f4\u01ef\u01e8\u01e1\u01bd", ")0\u204d\u007f}k\u000f)\"5\"l/\"-$l\u001071*-$xj\u000f)\"5\"l/\"-$l\u001071*-$x", "}\"-(/(5\u007f}\u007fih\u0017", "\u00db\u008e\u0089\u008e\u0093\u00d9\u00db\u00d9\u00cf\u00ce\u00b1", "\u0669\u066b\u067a\u064d\u0662\u066f\u067d\u067d\u0632\u0630\u0626\u0627\u0642\u0664\u066f\u0678\u066f\u0621\u0662\u066f\u0660\u0669\u0621\u064d\u0662\u066f\u067d\u067d\u0635", "\u03ae\u03a7\u03b5\u03ae\u0385\u03a9\u03a2\u03a3\u03fa\u03f8\u03ee\u03ef\u038f", "\u0292\u0286\u0282\u0296\u029b\u0284\u02cb\u02c9\u02df\u02bb\u029d\u0296\u0281\u0296\u02d8\u029b\u0296\u0299\u0290\u02d8\u02b8\u0295\u029d\u0292\u0294\u0283\u02cc\u02de\u02ad", "\u07f3\u07fc\u07ff\u07fe\u07f5\u07ac\u07ae\u07b8\u07b9\u07dc\u07fa\u07f1\u07e6\u07f1\u07bf\u07fc\u07f1\u07fe\u07f7\u07bf\u07df\u07f2\u07fa\u07f5\u07f3\u07e4\u07ab", "\u047c\u0467\u045b\u047c\u047a\u0461\u0466\u046f\u0434\u0436\u0420\u0421\u0444\u0462\u0469\u047e\u0469\u0427\u0464\u0469\u0466\u046f\u0427\u045b\u047c\u047a\u0461\u0466\u046f\u0433", "\u02fe\u02ff\u02e4\u02f9\u02f6\u02e9\u02ac\u02ae\u02b8\u02b9\u02c6", "\u0367\u0366\u037d\u0360\u036f\u0370\u0348\u0365\u0365\u0335\u0337\u0321\u0320\u035f", "\u04c1\u04d7\u04df\u04c2\u048a\u0488\u049e\u049f\u04e0", "\u03a8\u03be\u03b6\u03ab\u03e3\u03e1\u03f7\u0395\u03f6\u0389", "\u07ed\u07fb\u07f3\u07ee\u07aa\u07a6\u07a4\u07b2\u07d0\u07b3\u07cc", "\u05ad\u05bb\u05b3\u05ae\u05e6\u05e4\u05f2\u0590\u0593\u05f3\u058c", "\u0562\u056d\u056a\u0565\u0568\u056d\u057e\u0561\u0538\u053a\u052c\u052d\u0552"})
public final class Class3746 {
    public static float field8473;
    public static float field8474;
    public static float field8475;
    public static double field8476 = 0.07798909929268683;
    public static float field8477;

    static {
        g\u200e = "Spoof height";
        field8475 = Float.intBitsToFloat(1058222390);
        field8473 = Float.intBitsToFloat(1046836736);
        Z\u200e = "GET";
        field8477 = Float.intBitsToFloat(1064391384);
        ce\u200e = "Prevent weakness inability to attack";
        field8474 = Float.intBitsToFloat(1051371886);
    }

    private static String dGibOH1CvDk4gtl2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite PI1etM669H2Gna(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3746.dGibOH1CvDk4gtl2(k2, -427398550));
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
                int a2 = Integer.parseInt(Class3746.dGibOH1CvDk4gtl2(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3746.dGibOH1CvDk4gtl2(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3746.dGibOH1CvDk4gtl2(k2, -427398550) + " " + l2 + " " + m2);
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

