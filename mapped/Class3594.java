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

@HACHIMI_CLIENT(mv=100, d1={"\u09b4\u09b6\u09b7\u09b5\u09b4\u09b6\u09b7\u09b7", "\u57ec\u57ea\u57eb\u57ef\u57ef\u57ed\u57ed\u57ee", "\u0012\u0017\u001e\u0010\u001e\u0010\u0016\u001f", "\ude78\ude7f\ude78\ude7b\ude79\ude7a\ude73\ude79", "\u1e04\u1e01\u1e06\u1e03\u1e05\u1e0c\u1e02\u1e05", "\uac24\uac25\uac21\uac28\uac28\uac22\uac25\uac24", "\u5798\u579b\u579b\u5790\u5798\u5798\u5791\u579a", "\u9adc\u9ade\u9ad6\u9adf\u9add\u9ad9\u9ada\u9ad7", "\udaf2\udafc\udafd\udaf2\udaf7\udaf0\udaf1\udaf7", "\udf54\udf51\udf54\udf51\udf52\udf51\udf55\udf5f", "\u53cf\u53c7\u53c6\u53c8\u53c6\u53c6\u53cd", "\ua702\ua70d\ua705\ua706\ua70c\ua70d\ua706\ua700", "\u53bf\u53b4\u53ba\u53b4\u53b4\u53b5\u53b5\u53b4", "\ud75f\ud758\ud758\ud75f\ud75f\ud757\ud757\ud758"}, d2={"\u06fd\u06a2\u06ad\u06a8\u06af\u06a8\u06b5\u06ff\u06fd\u06ff\u06e9\u06e8\u0697", "j?8?\"hjh~\u007f\u0000", "\u06bb\u06b9\u06a8\u069f\u06b0\u06bd\u06af\u06af\u06e0\u06e2\u06f4\u06f5\u0690\u06b6\u06bd\u06aa\u06bd\u06f3\u06b0\u06bd\u06b2\u06bb\u06f3\u069f\u06b0\u06bd\u06af\u06af\u06e7", "\u0120\u0129\u013b\u0120\u010b\u0127\u012c\u012d\u0174\u0176\u0160\u0161\u0101", "\u01e3\u01f7\u01f3\u01e7\u01ea\u01f5\u01ba\u01b8\u01ae\u01ca\u01ec\u01e7\u01f0\u01e7\u01a9\u01ea\u01e7\u01e8\u01e1\u01a9\u01c9\u01e4\u01ec\u01e3\u01e5\u01f2\u01bd\u01af\u01dc", "UZYXS\n\b\u001e\u001fz\\W@W\u0019ZWXQ\u0019yT\\SUB\r", "\u0456\u044d\u0471\u0456\u0450\u044b\u044c\u0445\u041e\u041c\u040a\u040b\u046e\u0448\u0443\u0454\u0443\u040d\u044e\u0443\u044c\u0445\u040d\u0471\u0456\u0450\u044b\u044c\u0445\u0419", "! ;&)6sqgf\u0019", "\u056e\u056f\u0574\u0569\u0566\u0579\u0541\u056c\u056c\u053c\u053e\u0528\u0529\u0556", "\u03cd\u03db\u03d3\u03ce\u0386\u0384\u0392\u0393\u03ec", "\u06b7\u06a1\u06a9\u06b4\u06fc\u06fe\u06e8\u068a\u06e9\u0696", "\u0090\u0086\u008e\u0093\u00d7\u00db\u00d9\u00cf\u00ad\u00ce\u00b1", "\u0553\u0545\u054d\u0550\u0518\u051a\u050c\u056e\u056d\u050d\u0572", "\u0679\u0676\u0671\u067e\u0673\u0676\u0665\u067a\u0623\u0621\u0637\u0636\u0649"})
public final class Class3594 {
    public static float field8006;
    public static float field8007 = 0.3588264f;
    public static float field8008;
    public static int field8009 = -1987353475;
    public static double field8010;
    public static double field8011;
    public static double field8012;

    static {
        field8010 = Double.longBitsToDouble(4605707460445518096L);
        field8008 = Float.intBitsToFloat(1051782902);
        field8006 = Float.intBitsToFloat(1059653786);
        field8011 = Double.longBitsToDouble(4603441598737785444L);
        field8012 = Double.longBitsToDouble(4604667722441393496L);
    }

    private static String lNdVtJNcAhs6cjFJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite blV8yfEuxbSg6g(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3594.lNdVtJNcAhs6cjFJ(k2, 350224686));
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
                int a2 = Integer.parseInt(Class3594.lNdVtJNcAhs6cjFJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3594.lNdVtJNcAhs6cjFJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3594.lNdVtJNcAhs6cjFJ(k2, 350224686) + " " + l2 + " " + m2);
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

