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

@HACHIMI_CLIENT(mv=100, d1={"\u6a01\u6a04\u6a06\u6a03\u6a04\u6a07\u6a03\u6a01", "\u2798\u2797\u279e\u2797\u2798\u279c\u2799\u2796", "\u6ba9\u6ba3\u6ba3\u6ba9\u6baa\u6bad\u6ba9\u6bac", "\u01c5\u01c5\u01cc\u01c9\u01c4\u01c9\u01c8", "\u2845\u2841\u284f\u2842\u284e\u2847\u2840\u2841", "\uafb8\uafbc\uafbb\uafb3\uafba\uafbe\uafbc\uafbb", "\ue3c9\ue3cd\ue3cf\ue3cf\ue3c9\ue3ca\ue3ca\ue3cf", "\u69f9\u69fb\u69f3\u69fc\u69f9\u69fb\u69f8\u69f8", "\u21c9\u21cc\u21cc\u21cf\u21ca\u21c9\u21c4\u21cc", "\ue743\ue744\ue746\ue740\ue742\ue743\ue740\ue748", "\u1c65\u1c61\u1c65\u1c63\u1c62\u1c65\u1c66\u1c6b", "\ua3c8\ua3cc\ua3cd\ua3c7\ua3c6\ua3cf\ua3c8\ua3cf", "\u98eb\u98e4\u98ed\u98eb\u98e8\u98eb\u98e4\u98eb", "\u7ec3\u7ec3\u7ec5\u7ec6\u7ec7\u7ec5\u7ecf\u7ece", "\u5965\u5964\u5967\u5965\u5962\u5964\u5963\u5966"}, d2={"\u04c6\u04e8\u04ec\u24aa\u0498\u049a\u048c\u04e8\u04ce\u04c5\u04d2\u04c5\u048b\u04c8\u04c5\u04ca\u04c3\u048b\u04f7\u04d0\u04d6\u04cd\u04ca\u04c3\u049f\u048d\u04e8\u04ce\u04c5\u04d2\u04c5\u048b\u04c8\u04c5\u04ca\u04c3\u048b\u04f7\u04d0\u04d6\u04cd\u04ca\u04c3\u049f", "\u01ef\u01b0\u01bf\u01ba\u01bd\u01ba\u01a7\u01ed\u01ef\u01ed\u01fb\u01fa\u0185", "\u0249\u021c\u021b\u021c\u0201\u024b\u0249\u024b\u025d\u025c\u0223", "\u04b3\u04b1\u04a0\u0497\u04b8\u04b5\u04a7\u04a7\u04e8\u04ea\u04fc\u04fd\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0497\u04b8\u04b5\u04a7\u04a7\u04ef", "\u07f1\u07f8\u07ea\u07f1\u07da\u07f6\u07fd\u07fc\u07a5\u07a7\u07b1\u07b0\u07d0", "\u0684\u0690\u0694\u0680\u068d\u0692\u06dd\u06df\u06c9\u06ad\u068b\u0680\u0697\u0680\u06ce\u068d\u0680\u068f\u0686\u06ce\u06ae\u0683\u068b\u0684\u0682\u0695\u06da\u06c8\u06bb", "\u00c8\u00c7\u00c4\u00c5\u00ce\u0097\u0095\u0083\u0082\u00e7\u00c1\u00ca\u00dd\u00ca\u0084\u00c7\u00ca\u00c5\u00cc\u0084\u00e4\u00c9\u00c1\u00ce\u00c8\u00df\u0090", "\u0111\u010a\u0136\u0111\u0117\u010c\u010b\u0102\u0159\u015b\u014d\u014c\u0129\u010f\u0104\u0113\u0104\u014a\u0109\u0104\u010b\u0102\u014a\u0136\u0111\u0117\u010c\u010b\u0102\u015e", "\u0528\u0529\u0532\u052f\u0520\u053f\u057a\u0578\u056e\u056f\u0510", "\u047e\u047f\u0464\u0479\u0476\u0469\u0451\u047c\u047c\u042c\u042e\u0438\u0439\u0446", "\u06b1\u06a7\u06af\u06b2\u06fa\u06f8\u06ee\u06ef\u0690", "\u06cf\u06d9\u06d1\u06cc\u0684\u0686\u0690\u06f2\u0691\u06ee", "\u0372\u0364\u036c\u0371\u0335\u0339\u033b\u032d\u034f\u032c\u0353", "\u0662\u0674\u067c\u0661\u0629\u062b\u063d\u065f\u065c\u063c\u0643", "\u0304\u030b\u030c\u0303\u030e\u030b\u0318\u0307\u035e\u035c\u034a\u034b\u0334"})
public final class Class3348 {
    public static float field7240;
    public static double field7241;
    public static float field7242;
    public static double field7243 = 0.23966246453554008;

    static {
        T\u200e = "Color";
        field7240 = Float.intBitsToFloat(1120403456);
        field7242 = Float.intBitsToFloat(1055648350);
        field7241 = Double.longBitsToDouble(4598175219545276416L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite LO6GLE7xGTjnn4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3348.BG155M2LFo2Enuai(k2, 49489343));
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
                int a2 = Integer.parseInt(Class3348.BG155M2LFo2Enuai(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3348.BG155M2LFo2Enuai(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3348.BG155M2LFo2Enuai(k2, 49489343) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String BG155M2LFo2Enuai(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

