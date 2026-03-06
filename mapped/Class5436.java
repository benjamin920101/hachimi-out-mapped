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

@HACHIMI_CLIENT(mv=100, d1={"\ue603\ue602\ue601\ue605\ue607\ue607\ue603\ue607", "\u606a\u606c\u6065\u6069\u606d\u6068\u606b\u6065", "\u0b66\u0b6a\u0b6a\u0b64\u0b67\u0b65\u0b60", "\u266d\u2669\u266b\u2668\u266c\u266f\u266c", "\u0886\u0881\u0881\u0880\u0880\u0884\u0882\u0885", "\u5f89\u5f8b\u5f8c\u5f8e\u5f8b\u5f88\u5f8f\u5f88", "\u0574\u057d\u0571\u0572\u0573\u0574\u0573", "\ud215\ud214\ud211\ud214\ud21f\ud214\ud210\ud216", "\u4e34\u4e3a\u4e32\u4e31\u4e36\u4e32\u4e34\u4e36", "\u9fab\u9fa7\u9fae\u9fa8\u9faf\u9fa6\u9faa\u9fa7", "\u9d80\u9d80\u9d87\u9d86\u9d82\u9d8b\u9d87\u9d8b", "\ua672\ua676\ua672\ua67d\ua672\ua671\ua676\ua67c", "\uc158\uc156\uc15b\uc157\uc157\uc158\uc15c\uc15b", "\u735b\u7357\u7356\u735d\u735a\u7357\u735b\u7357", "\u08df\u08de\u08da\u08dc\u08da\u08d9\u08d8\u08df", "\ub6d8\ub6d8\ub6da\ub6dd\ub6db\ub6de\ub6da\ub6d2", "\ubd9a\ubd9a\ubd9f\ubd98\ubd96\ubd9d\ubd9d\ubd98"}, d2={"\u07a4\u07a7\u079e\u27df\u07ed\u07ef\u07f9\u079d\u07bb\u07b0\u07a7\u07b0\u07fe\u07bd\u07b0\u07bf\u07b6\u07fe\u0782\u07a5\u07a3\u07b8\u07bf\u07b6\u07ea\u07f8\u079d\u07bb\u07b0\u07a7\u07b0\u07fe\u07bd\u07b0\u07bf\u07b6\u07fe\u0782\u07a5\u07a3\u07b8\u07bf\u07b6\u07ea", "\u0351\u0352\u0374\u232a\u0318\u031a\u030c\u0368\u034e\u0345\u0352\u0345\u030b\u0348\u0345\u034a\u0343\u030b\u0377\u0350\u0356\u034d\u034a\u0343\u031f\u030d\u0368\u034e\u0345\u0352\u0345\u030b\u0348\u0345\u034a\u0343\u030b\u0377\u0350\u0356\u034d\u034a\u0343\u031f", "\u04a6\u04a5\u0482\u24dd\u04ef\u04ed\u04fb\u049f\u04b9\u04b2\u04a5\u04b2\u04fc\u04bf\u04b2\u04bd\u04b4\u04fc\u0480\u04a7\u04a1\u04ba\u04bd\u04b4\u04e8\u04fa\u049f\u04b9\u04b2\u04a5\u04b2\u04fc\u04bf\u04b2\u04bd\u04b4\u04fc\u0480\u04a7\u04a1\u04ba\u04bd\u04b4\u04e8", "\u0268\u0237\u0238\u023d\u023a\u023d\u0220\u026a\u0268\u026a\u027c\u027d\u0202", "\u037a\u032f\u0328\u032f\u0332\u0378\u037a\u0378\u036e\u036f\u0310", "\u0710\u0712\u0703\u0734\u071b\u0716\u0704\u0704\u074b\u0749\u075f\u075e\u073b\u071d\u0716\u0701\u0716\u0758\u071b\u0716\u0719\u0710\u0758\u0734\u071b\u0716\u0704\u0704\u074c", "\u0296\u029f\u028d\u0296\u02bd\u0291\u029a\u029b\u02c2\u02c0\u02d6\u02d7\u02b7", "\u0737\u0723\u0727\u0733\u073e\u0721\u076e\u076c\u077a\u071e\u0738\u0733\u0724\u0733\u077d\u073e\u0733\u073c\u0735\u077d\u071d\u0730\u0738\u0737\u0731\u0726\u0769\u077b\u0708", "\u0280\u028f\u028c\u028d\u0286\u02df\u02dd\u02cb\u02ca\u02af\u0289\u0282\u0295\u0282\u02cc\u028f\u0282\u028d\u0284\u02cc\u02ac\u0281\u0289\u0286\u0280\u0297\u02d8", "\u0782\u0799\u07a5\u0782\u0784\u079f\u0798\u0791\u07ca\u07c8\u07de\u07df\u07ba\u079c\u0797\u0780\u0797\u07d9\u079a\u0797\u0798\u0791\u07d9\u07a5\u0782\u0784\u079f\u0798\u0791\u07cd", "\u0511\u0510\u050b\u0516\u0519\u0506\u0543\u0541\u0557\u0556\u0529", "\u027c\u027d\u0266\u027b\u0274\u026b\u0253\u027e\u027e\u022e\u022c\u023a\u023b\u0244", "\u0736\u0720\u0728\u0735\u077d\u077f\u0769\u0768\u0717", "\u047c\u046a\u0462\u047f\u0437\u0435\u0423\u0441\u0422\u045d", "\u07e3\u07f5\u07fd\u07e0\u07a4\u07a8\u07aa\u07bc\u07de\u07bd\u07c2", "\u00d0\u00c6\u00ce\u00d3\u009b\u0099\u008f\u00ed\u00ee\u008e\u00f1", "\u02ce\u02c1\u02c6\u02c9\u02c4\u02c1\u02d2\u02cd\u0294\u0296\u0280\u0281\u02fe"})
public final class Class5436 {
    public static int field10143 = 92961519;
    public static double field10144 = 0.026280704620761375;
    public static float field10145 = Float.intBitsToFloat(1062072562);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite ojo0N4HLU21umn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5436.ggj1U31bWoh4Poca(k2, 884321005));
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
                int a2 = Integer.parseInt(Class5436.ggj1U31bWoh4Poca(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5436.ggj1U31bWoh4Poca(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 20361 : 20360;
        block7: while (true) {
            switch (n3) {
                case 20361: {
                    n3 = 20359;
                    continue block7;
                }
                case 20360: {
                    throw new Exception("Can't find method in " + Class5436.ggj1U31bWoh4Poca(k2, 884321005) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String ggj1U31bWoh4Poca(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bo\u200e = "Normal";
        bD\u200e = "Attempts to replace crystals in surrounds";
        bF\u200e = "GApple";
    }
}

