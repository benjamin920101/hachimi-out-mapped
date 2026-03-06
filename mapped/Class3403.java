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

@HACHIMI_CLIENT(mv=100, d1={"\u85c6\u85c3\u85c6\u85c5\u85c1\u85c0\u85c5\u85c3", "\u89a1\u89ad\u89a0\u89ac\u89a6\u89a6\u89ad", "\ua24f\ua24d\ua24e\ua24a\ua24e\ua24d\ua240", "\ua74c\ua748\ua74f\ua747\ua748\ua74c\ua74c\ua74c", "\u5564\u5561\u5560\u5561\u5568\u5563\u5566\u5569", "\u11ea\u11ed\u11e8\u11eb\u11e7\u11e6\u11eb\u11eb", "\uc327\uc323\uc325\uc323\uc320\uc326\uc32f\uc327", "\uae6c\uae68\uae6c\uae6a\uae6f\uae6c\uae6c\uae68", "\ubbb6\ubbb0\ubbba\ubbb4\ubbbb\ubbb6\ubbba\ubbb7", "\uac13\uac18\uac17\uac15\uac16\uac11\uac11\uac14", "\u60a5\u60a1\u60a6\u60a6\u60a0\u60a6\u60a3\u60a9", "\ubecc\ubecb\ubec8\ubecd\ubec9\ubece\ubec2\ubecc", "\u33eb\u33e9\u33ee\u33e0\u33e1\u33ef\u33ef\u33ef", "\u042f\u0427\u042a\u0429\u0428\u042f\u0427\u042d", "\udf30\udf3c\udf30\udf36\udf37\udf36\udf33", "\u1fda\u1fdd\u1fd9\u1fdd\u1fdc\u1fd9\u1fd8\u1fd9", "\u416b\u416b\u416c\u416f\u4168\u416d\u416d\u416e"}, d2={"\u0476\u0460\u0477\u2414\u0426\u0424\u0432\u0456\u0470\u047b\u046c\u047b\u0435\u0476\u047b\u0474\u047d\u0435\u0449\u046e\u0468\u0473\u0474\u047d\u0421\u0433\u0456\u0470\u047b\u046c\u047b\u0435\u0476\u047b\u0474\u047d\u0435\u0449\u046e\u0468\u0473\u0474\u047d\u0421", "\u06dc\u06ca\u06de\u26be\u068c\u068e\u0698\u06fc\u06da\u06d1\u06c6\u06d1\u069f\u06dc\u06d1\u06de\u06d7\u069f\u06e3\u06c4\u06c2\u06d9\u06de\u06d7\u068b\u0699\u06fc\u06da\u06d1\u06c6\u06d1\u069f\u06dc\u06d1\u06de\u06d7\u069f\u06e3\u06c4\u06c2\u06d9\u06de\u06d7\u068b", "\u0652\u0644\u0651\u2630\u0602\u0600\u0616\u0672\u0654\u065f\u0648\u065f\u0611\u0652\u065f\u0650\u0659\u0611\u066d\u064a\u064c\u0657\u0650\u0659\u0605\u0617\u0672\u0654\u065f\u0648\u065f\u0611\u0652\u065f\u0650\u0659\u0611\u066d\u064a\u064c\u0657\u0650\u0659\u0605", "\u0345\u031a\u0315\u0310\u0317\u0310\u030d\u0347\u0345\u0347\u0351\u0350\u032f", "\u00ca\u009f\u0098\u009f\u0082\u00c8\u00ca\u00c8\u00de\u00df\u00a0", "\u07cd\u07cf\u07de\u07e9\u07c6\u07cb\u07d9\u07d9\u0796\u0794\u0782\u0783\u07e6\u07c0\u07cb\u07dc\u07cb\u0785\u07c6\u07cb\u07c4\u07cd\u0785\u07e9\u07c6\u07cb\u07d9\u07d9\u0791", "\u01fd\u01f4\u01e6\u01fd\u01d6\u01fa\u01f1\u01f0\u01a9\u01ab\u01bd\u01bc\u01dc", "\u06af\u06bb\u06bf\u06ab\u06a6\u06b9\u06f6\u06f4\u06e2\u0686\u06a0\u06ab\u06bc\u06ab\u06e5\u06a6\u06ab\u06a4\u06ad\u06e5\u0685\u06a8\u06a0\u06af\u06a9\u06be\u06f1\u06e3\u0690", "\u0647\u0648\u064b\u064a\u0641\u0618\u061a\u060c\u060d\u0668\u064e\u0645\u0652\u0645\u060b\u0648\u0645\u064a\u0643\u060b\u066b\u0646\u064e\u0641\u0647\u0650\u061f", "\u0698\u0683\u06bf\u0698\u069e\u0685\u0682\u068b\u06d0\u06d2\u06c4\u06c5\u06a0\u0686\u068d\u069a\u068d\u06c3\u0680\u068d\u0682\u068b\u06c3\u06bf\u0698\u069e\u0685\u0682\u068b\u06d7", "\u0207\u0206\u021d\u0200\u020f\u0210\u0255\u0257\u0241\u0240\u023f", "\u06b1\u06b0\u06ab\u06b6\u06b9\u06a6\u069e\u06b3\u06b3\u06e3\u06e1\u06f7\u06f6\u0689", "\u05d9\u05cf\u05c7\u05da\u0592\u0590\u0586\u0587\u05f8", "\u06ce\u06d8\u06d0\u06cd\u0685\u0687\u0691\u06f3\u0690\u06ef", "\u0117\u0101\u0109\u0114\u0150\u015c\u015e\u0148\u012a\u0149\u0136", "\u01ec\u01fa\u01f2\u01ef\u01a7\u01a5\u01b3\u01d1\u01d2\u01b2\u01cd", "\u009c\u0093\u0094\u009b\u0096\u0093\u0080\u009f\u00c6\u00c4\u00d2\u00d3\u00ac"})
public final class Class3403 {
    public static float field7412 = 0.10050273f;
    public static float field7413;
    public static int field7414 = 428293596;
    public static int field7415 = 49437983;
    public static double field7416;

    private static String Q6322muS7kYDNEgt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        ab\u200e = "Mend item in your hand";
        field7416 = Double.longBitsToDouble(4594419462783676864L);
        at\u200e = "assets";
        field7413 = Float.intBitsToFloat(1052834838);
        bF\u200e = "ExtrapolationTicks";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite WG77ipqnfuwMH8(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3403.Q6322muS7kYDNEgt(k2, -1019197762));
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
                int a2 = Integer.parseInt(Class3403.Q6322muS7kYDNEgt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3403.Q6322muS7kYDNEgt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3403.Q6322muS7kYDNEgt(k2, -1019197762) + " " + l2 + " " + m2);
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

