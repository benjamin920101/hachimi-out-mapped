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

@HACHIMI_CLIENT(mv=100, d1={"\u00d9\u00da\u00dd\u00d8\u00d1\u00da\u00d1", "\u244f\u244e\u2449\u244c\u2447\u2448\u244e\u244c", "\u6591\u6592\u6596\u6591\u6595\u6593\u659a\u6595", "\u95fc\u95f7\u95fc\u95fc\u95fc\u95fa\u95ff\u95fd", "\u7b24\u7b27\u7b20\u7b22\u7b21\u7b29\u7b27\u7b27", "\ud682\ud688\ud689\ud682\ud688\ud681\ud682\ud686", "\u9eb6\u9ebd\u9eb2\u9eb0\u9eb7\u9eb3\u9eb6\u9eb4", "\u77aa\u77ab\u77a8\u77a8\u77a5\u77ad\u77a8\u77a8", "\ud931\ud932\ud93d\ud93d\ud936\ud934\ud930\ud93c", "\uda1b\uda16\uda1a\uda1b\uda18\uda18\uda1d\uda1d", "\ubd05\ubd01\ubd01\ubd06\ubd01\ubd06\ubd02\ubd06", "\u4ca2\u4ca1\u4ca4\u4ca2\u4ca0\u4ca6\u4caf", "\u3941\u3942\u3945\u394a\u3940\u3947\u3946\u3946", "\ua317\ua316\ua31a\ua311\ua316\ua310\ua312\ua310"}, d2={"[\u0004\u000b\u000e\t\u000e\u0013Y[YON1", "\u066d\u0638\u063f\u0638\u0625\u066f\u066d\u066f\u0679\u0678\u0607", "\u062f\u062d\u063c\u060b\u0624\u0629\u063b\u063b\u0674\u0676\u0660\u0661\u0604\u0622\u0629\u063e\u0629\u0667\u0624\u0629\u0626\u062f\u0667\u060b\u0624\u0629\u063b\u063b\u0673", "\u014d\u0144\u0156\u014d\u0166\u014a\u0141\u0140\u0119\u011b\u010d\u010c\u016c", "\u0619\u060d\u0609\u061d\u0610\u060f\u0640\u0642\u0654\u0630\u0616\u061d\u060a\u061d\u0653\u0610\u061d\u0612\u061b\u0653\u0633\u061e\u0616\u0619\u061f\u0608\u0647\u0655\u0626", "\u063d\u0632\u0631\u0630\u063b\u0662\u0660\u0676\u0677\u0612\u0634\u063f\u0628\u063f\u0671\u0632\u063f\u0630\u0639\u0671\u0611\u063c\u0634\u063b\u063d\u062a\u0665", "\u0005\u001e\"\u0005\u0003\u0018\u001f\u0016MOYX=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016J", "\u0411\u0410\u040b\u0416\u0419\u0406\u0443\u0441\u0457\u0456\u0429", "\u02e2\u02e3\u02f8\u02e5\u02ea\u02f5\u02cd\u02e0\u02e0\u02b0\u02b2\u02a4\u02a5\u02da", "\u0257\u0241\u0249\u0254\u021c\u021e\u0208\u0209\u0276", "\u06bf\u06a9\u06a1\u06bc\u06f4\u06f6\u06e0\u0682\u06e1\u069e", "\u06e2\u06f4\u06fc\u06e1\u06a5\u06a9\u06ab\u06bd\u06df\u06bc\u06c3", "\u0143\u0155\u015d\u0140\u0108\u010a\u011c\u017e\u017d\u011d\u0162", "\u05ec\u05e3\u05e4\u05eb\u05e6\u05e3\u05f0\u05ef\u05b6\u05b4\u05a2\u05a3\u05dc"})
public final class Class3967 {
    public static double field9039 = Double.longBitsToDouble(4606624627965349995L);
    public static float field9040;
    public static double field9041;

    /*
     * WARNING - void declaration
     */
    private static CallSite nQKqUxqCtFu3V5(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3967.tlPWwoPKJd13P11o(k2, -1549960645));
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
                int a2 = Integer.parseInt(Class3967.tlPWwoPKJd13P11o(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3967.tlPWwoPKJd13P11o(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3967.tlPWwoPKJd13P11o(k2, -1549960645) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String tlPWwoPKJd13P11o(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9041 = Double.longBitsToDouble(4603839394508778143L);
        field9040 = Float.intBitsToFloat(1063624381);
    }
}

