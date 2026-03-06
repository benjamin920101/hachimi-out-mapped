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

@HACHIMI_CLIENT(mv=100, d1={"\ud355\ud356\ud353\ud35d\ud35d\ud357\ud355\ud350", "\u5ad4\u5ad5\u5ad8\u5add\u5adc\u5ad5\u5adf", "\u5606\u560c\u5608\u560d\u560a\u560d\u5607", "\u76d0\u76da\u76d2\u76d0\u76d0\u76d0\u76d0\u76d6", "\ub387\ub388\ub389\ub385\ub387\ub389\ub381\ub384", "\u4c0e\u4c0e\u4c0d\u4c0a\u4c0e\u4c0b\u4c08\u4c0f", "\u3de8\u3dee\u3de5\u3de8\u3de8\u3dee\u3deb\u3de8", "\u89b5\u89b7\u89b0\u89b2\u89b3\u89b2\u89b0\u89b8", "\u38e6\u38e6\u38e6\u38e3\u38e3\u38e1\u38e3\u38ec", "\u15af\u15a5\u15a8\u15ae\u15ae\u15ae\u15ae\u15ab", "\ue692\ue697\ue695\ue697\ue691\ue697\ue693\ue696", "\u6ebf\u6ebc\u6ebd\u6eba\u6ebf\u6eb8\u6ebf\u6eb9", "\u68e1\u68e0\u68e2\u68e4\u68ea\u68e7\u68e2\u68e2", "\u6e05\u6e07\u6e06\u6e09\u6e01\u6e05\u6e04\u6e05"}, d2={"\u018f\u01d0\u01df\u01da\u01dd\u01da\u01c7\u018d\u018f\u018d\u019b\u019a\u01e5", "\u0642\u0617\u0610\u0617\u060a\u0640\u0642\u0640\u0656\u0657\u0628", "\u02d2\u02d0\u02c1\u02f6\u02d9\u02d4\u02c6\u02c6\u0289\u028b\u029d\u029c\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02f6\u02d9\u02d4\u02c6\u02c6\u028e", "\u009e\u0097\u0085\u009e\u00b5\u0099\u0092\u0093\u00ca\u00c8\u00de\u00df\u00bf", "\u0608\u061c\u0618\u060c\u0601\u061e\u0651\u0653\u0645\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u0622\u060f\u0607\u0608\u060e\u0619\u0656\u0644\u0637", "\u053f\u0530\u0533\u0532\u0539\u0560\u0562\u0574\u0575\u0510\u0536\u053d\u052a\u053d\u0573\u0530\u053d\u0532\u053b\u0573\u0513\u053e\u0536\u0539\u053f\u0528\u0567", "mvJmkpw~%'10Usxox6uxw~6Jmkpw~\"", "\u0650\u0651\u064a\u0657\u0658\u0647\u0602\u0600\u0616\u0617\u0668", "\u04c9\u04c8\u04d3\u04ce\u04c1\u04de\u04e6\u04cb\u04cb\u049b\u0499\u048f\u048e\u04f1", "\u06d3\u06c5\u06cd\u06d0\u0698\u069a\u068c\u068d\u06f2", "\u028f\u0299\u0291\u028c\u02c4\u02c6\u02d0\u02b2\u02d1\u02ae", "\u04ba\u04ac\u04a4\u04b9\u04fd\u04f1\u04f3\u04e5\u0487\u04e4\u049b", "\u05c8\u05de\u05d6\u05cb\u0583\u0581\u0597\u05f5\u05f6\u0596\u05e9", "\u0252\u025d\u025a\u0255\u0258\u025d\u024e\u0251\u0208\u020a\u021c\u021d\u0262"})
public final class Class1313 {
    public static float field5094 = 0.22490269f;
    public static int field5095 = -2042993890;
    public static double field5096;
    public static double field5097;
    public static float field5098;
    public static int field5099 = 853900301;

    static {
        field5098 = Float.intBitsToFloat(1053609165);
        field5096 = Double.longBitsToDouble(4604984743036531593L);
        field5097 = Double.longBitsToDouble(4606968155995011788L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite qdv4WsymlwNrAy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1313.NNzkPVPHeGixpM8W(k2, -189795087));
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
                int a2 = Integer.parseInt(Class1313.NNzkPVPHeGixpM8W(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1313.NNzkPVPHeGixpM8W(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1313.NNzkPVPHeGixpM8W(k2, -189795087) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NNzkPVPHeGixpM8W(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

