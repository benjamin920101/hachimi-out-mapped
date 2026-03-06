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

@HACHIMI_CLIENT(mv=100, d1={"\u9bc3\u9bc5\u9bc3\u9bc3\u9bc3\u9bc1\u9bc0", "\u451e\u4514\u451c\u451c\u4515\u4518\u4515\u4514", "\ua607\ua600\ua600\ua602\ua602\ua600\ua60d\ua600", "\uaffa\uaffa\uaffc\uafff\uaff8\uaffd\uaffa\uaffc", "\u9c0d\u9c0c\u9c0a\u9c0f\u9c0b\u9c01\u9c0e\u9c09", "\u6dd5\u6dd5\u6dd4\u6dd1\u6dd6\u6dd1\u6dd3\u6dd8", "\ua651\ua651\ua65e\ua65f\ua653\ua651\ua651\ua650", "\uc31d\uc319\uc319\uc31a\uc31b\uc318\uc31d", "\ud51d\ud51e\ud51e\ud516\ud518\ud51c\ud51e\ud51f", "\u48fe\u48f8\u48f4\u48f9\u48ff\u48f5\u48fc\u48f9", "\u4883\u488e\u4885\u488e\u4882\u4882\u4881\u4882", "\uc1c2\uc1c8\uc1c9\uc1c3\uc1c4\uc1c7\uc1c9\uc1c3", "\u11ab\u11a9\u11ab\u11ae\u11ad\u11ac\u11aa", "\u70c5\u70c7\u70c3\u70c5\u70c4\u70c0\u70c5\u70c4"}, d2={"\u0419\u0446\u0449\u044c\u044b\u044c\u0451\u041b\u0419\u041b\u040d\u040c\u0473", "\u0622\u0677\u0670\u0677\u066a\u0620\u0622\u0620\u0636\u0637\u0648", "\u0698\u069a\u068b\u06bc\u0693\u069e\u068c\u068c\u06c3\u06c1\u06d7\u06d6\u06b3\u0695\u069e\u0689\u069e\u06d0\u0693\u069e\u0691\u0698\u06d0\u06bc\u0693\u069e\u068c\u068c\u06c4", "\u0763\u076a\u0778\u0763\u0748\u0764\u076f\u076e\u0737\u0735\u0723\u0722\u0742", "\u0258\u024c\u0248\u025c\u0251\u024e\u0201\u0203\u0215\u0271\u0257\u025c\u024b\u025c\u0212\u0251\u025c\u0253\u025a\u0212\u0272\u025f\u0257\u0258\u025e\u0249\u0206\u0214\u0267", "\u05f9\u05f6\u05f5\u05f4\u05ff\u05a6\u05a4\u05b2\u05b3\u05d6\u05f0\u05fb\u05ec\u05fb\u05b5\u05f6\u05fb\u05f4\u05fd\u05b5\u05d5\u05f8\u05f0\u05ff\u05f9\u05ee\u05a1", "D_cDBY^W\f\u000e\u0018\u0019|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b", "\u0521\u0520\u053b\u0526\u0529\u0536\u0573\u0571\u0567\u0566\u0519", "\u0629\u0628\u0633\u062e\u0621\u063e\u0606\u062b\u062b\u067b\u0679\u066f\u066e\u0611", "\u062a\u063c\u0634\u0629\u0661\u0663\u0675\u0674\u060b", "\u033e\u0328\u0320\u033d\u0375\u0377\u0361\u0303\u0360\u031f", "\u0120\u0136\u013e\u0123\u0167\u016b\u0169\u017f\u011d\u017e\u0101", "\u00be\u00a8\u00a0\u00bd\u00f5\u00f7\u00e1\u0083\u0080\u00e0\u009f", "-\"%*'\"1.wucb\u001d"})
public final class Class1159 {
    public static float field4626 = 0.002505064f;
    public static float field4627;
    public static double field4628;
    public static float field4629 = 0.60403425f;

    static {
        field4628 = Double.longBitsToDouble(4587868172487949632L);
        field4627 = Float.intBitsToFloat(1018650592);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite JN6htBJntGDKqd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1159.OYmNrwA3LaSMFPh9(k2, -1575104892));
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
                int a2 = Integer.parseInt(Class1159.OYmNrwA3LaSMFPh9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1159.OYmNrwA3LaSMFPh9(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1159.OYmNrwA3LaSMFPh9(k2, -1575104892) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String OYmNrwA3LaSMFPh9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

