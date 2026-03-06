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

@HACHIMI_CLIENT(mv=100, d1={"\u62e8\u62eb\u62ed\u62e5\u62e8\u62e8\u62e9\u62ee", "\u3440\u3447\u3440\u344d\u3444\u3444\u3447\u344c", "\u5066\u5063\u5060\u5067\u506c\u5065\u5065\u5063", "\u3dd7\u3ddd\u3dd3\u3dd0\u3dd4\u3dd7\u3dd2\u3dd7", "\u9d42\u9d43\u9d40\u9d40\u9d46\u9d4f\u9d41\u9d44", "\u637b\u6378\u637a\u637c\u637b\u6377\u637e\u637f", "\u0ec3\u0ec8\u0ec7\u0ec1\u0ec5\u0ec8\u0ec7\u0ec4", "\u7011\u7011\u701b\u7010\u701a\u7013\u7010\u701b", "\ue511\ue512\ue512\ue510\ue516\ue514\ue511\ue514", "\u1adf\u1adc\u1ada\u1adc\u1add\u1adb\u1ad8\u1ade", "\u08be\u08b3\u08b2\u08bb\u08bf\u08bb\u08bd\u08bb", "\u89cb\u89ce\u89ca\u89c6\u89ce\u89cf\u89ce\u89cb", "\uce2a\uce21\uce2b\uce21\uce21\uce2a\uce2c\uce2c", "\u2321\u2325\u2329\u2321\u2320\u2326\u2329\u2325"}, d2={"\u02da\u0285\u028a\u028f\u0288\u028f\u0292\u02d8\u02da\u02d8\u02ce\u02cf\u02b0", "\u04b0\u04e5\u04e2\u04e5\u04f8\u04b2\u04b0\u04b2\u04a4\u04a5\u04da", "\u059e\u059c\u058d\u05ba\u0595\u0598\u058a\u058a\u05c5\u05c7\u05d1\u05d0\u05b5\u0593\u0598\u058f\u0598\u05d6\u0595\u0598\u0597\u059e\u05d6\u05ba\u0595\u0598\u058a\u058a\u05c2", "\u02ce\u02c7\u02d5\u02ce\u02e5\u02c9\u02c2\u02c3\u029a\u0298\u028e\u028f\u02ef", "\u0636\u0622\u0626\u0632\u063f\u0620\u066f\u066d\u067b\u061f\u0639\u0632\u0625\u0632\u067c\u063f\u0632\u063d\u0634\u067c\u061c\u0631\u0639\u0636\u0630\u0627\u0668\u067a\u0609", "\u000e\u0001\u0002\u0003\bQSED!\u0007\f\u001b\fB\u0001\f\u0003\nB\"\u000f\u0007\b\u000e\u0019V", "\u0274\u026f\u0253\u0274\u0272\u0269\u026e\u0267\u023c\u023e\u0228\u0229\u024c\u026a\u0261\u0276\u0261\u022f\u026c\u0261\u026e\u0267\u022f\u0253\u0274\u0272\u0269\u026e\u0267\u023b", "\u04d5\u04d4\u04cf\u04d2\u04dd\u04c2\u0487\u0485\u0493\u0492\u04ed", "\u06a1\u06a0\u06bb\u06a6\u06a9\u06b6\u068e\u06a3\u06a3\u06f3\u06f1\u06e7\u06e6\u0699", "\u0746\u0750\u0758\u0745\u070d\u070f\u0719\u0718\u0767", "\u058e\u0598\u0590\u058d\u05c5\u05c7\u05d1\u05b3\u05d0\u05af", "\u0663\u0675\u067d\u0660\u0624\u0628\u062a\u063c\u065e\u063d\u0642", "\u01f9\u01ef\u01e7\u01fa\u01b2\u01b0\u01a6\u01c4\u01c7\u01a7\u01d8", "\u0675\u067a\u067d\u0672\u067f\u067a\u0669\u0676\u062f\u062d\u063b\u063a\u0645"})
public final class Class3308 {
    public static float field7123 = Float.intBitsToFloat(1056039780);
    public static float field7124 = Float.intBitsToFloat(1046389512);

    private static String Q2ByFWoiyCVzQGrO(String a2, int b2) {
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
    private static CallSite kZoNF5844N97kh(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3308.Q2ByFWoiyCVzQGrO(k2, 2073291811));
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
                int a2 = Integer.parseInt(Class3308.Q2ByFWoiyCVzQGrO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3308.Q2ByFWoiyCVzQGrO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3308.Q2ByFWoiyCVzQGrO(k2, 2073291811) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 24222 : 24223;
        block7: while (true) {
            switch (n3) {
                case 24223: {
                    n3 = 24221;
                    continue block7;
                }
                case 24222: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

