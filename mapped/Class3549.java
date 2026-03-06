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

@HACHIMI_CLIENT(mv=100, d1={"\u27c8\u27cb\u27c1\u27c8\u27cd\u27c0\u27c1\u27c1", "\u2808\u2809\u2805\u2804\u2804\u280f\u280c\u2808", "\ucc06\ucc0a\ucc05\ucc04\ucc01\ucc0b\ucc03", "\u4c8e\u4c8d\u4c8a\u4c85\u4c84\u4c8f\u4c85\u4c8e", "\ue680\ue682\ue68b\ue683\ue681\ue68a\ue687\ue683", "\u409c\u409f\u4090\u409c\u4098\u4090\u409a\u409b", "\u1d5f\u1d53\u1d5f\u1d5a\u1d5e\u1d53\u1d5d\u1d59", "\u3825\u3827\u3824\u382e\u3825\u382e\u3820", "\u0a83\u0a8e\u0a86\u0a87\u0a87\u0a84\u0a80\u0a86", "\u7362\u7369\u7362\u7367\u7362\u7360\u7360\u7367", "\ubf9e\ubf90\ubf91\ubf90\ubf99\ubf99\ubf91", "\ua843\ua843\ua846\ua847\ua842\ua844\ua845\ua841", "\u4018\u4011\u401a\u4019\u4019\u401d\u401b\u401d", "\ua1ed\ua1e9\ua1eb\ua1ea\ua1e8\ua1e8\ua1e8\ua1e1", "\ud53c\ud538\ud539\ud53d\ud538\ud53e\ud539\ud536", "\u8339\u8332\u8339\u8332\u8332\u8338\u833f\u833e", "\u771e\u771d\u771a\u7718\u7718\u7719\u771b\u771a", "\u37b2\u37b6\u37b7\u37b0\u37ba\u37b7\u37b4\u37b7"}, d2={"\u067a\u067a\u064a\u2601\u0633\u0631\u0627\u0643\u0665\u066e\u0679\u066e\u0620\u0663\u066e\u0661\u0668\u0620\u065c\u067b\u067d\u0666\u0661\u0668\u0634\u0626\u0643\u0665\u066e\u0679\u066e\u0620\u0663\u066e\u0661\u0668\u0620\u065c\u067b\u067d\u0666\u0661\u0668\u0634", "\u019f\u019f\u01ac\u21e4\u01d6\u01d4\u01c2\u01a6\u0180\u018b\u019c\u018b\u01c5\u0186\u018b\u0184\u018d\u01c5\u01b9\u019e\u0198\u0183\u0184\u018d\u01d1\u01c3\u01a6\u0180\u018b\u019c\u018b\u01c5\u0186\u018b\u0184\u018d\u01c5\u01b9\u019e\u0198\u0183\u0184\u018d\u01d1", "\u035c\u035c\u036e\u2327\u0315\u0317\u0301\u0365\u0343\u0348\u035f\u0348\u0306\u0345\u0348\u0347\u034e\u0306\u037a\u035d\u035b\u0340\u0347\u034e\u0312\u0300\u0365\u0343\u0348\u035f\u0348\u0306\u0345\u0348\u0347\u034e\u0306\u037a\u035d\u035b\u0340\u0347\u034e\u0312", "\u0467\u0467\u045a\u241c\u042e\u042c\u043a\u045e\u0478\u0473\u0464\u0473\u043d\u047e\u0473\u047c\u0475\u043d\u0441\u0466\u0460\u047b\u047c\u0475\u0429\u043b\u045e\u0478\u0473\u0464\u0473\u043d\u047e\u0473\u047c\u0475\u043d\u0441\u0466\u0460\u047b\u047c\u0475\u0429", "\u02be\u02e1\u02ee\u02eb\u02ec\u02eb\u02f6\u02bc\u02be\u02bc\u02aa\u02ab\u02d4", "\u0464\u0431\u0436\u0431\u042c\u0466\u0464\u0466\u0470\u0471\u040e", "\u00c5\u00c7\u00d6\u00e1\u00ce\u00c3\u00d1\u00d1\u009e\u009c\u008a\u008b\u00ee\u00c8\u00c3\u00d4\u00c3\u008d\u00ce\u00c3\u00cc\u00c5\u008d\u00e1\u00ce\u00c3\u00d1\u00d1\u0099", "\u018c\u0185\u0197\u018c\u01a7\u018b\u0180\u0181\u01d8\u01da\u01cc\u01cd\u01ad", "\u01a8\u01bc\u01b8\u01ac\u01a1\u01be\u01f1\u01f3\u01e5\u0181\u01a7\u01ac\u01bb\u01ac\u01e2\u01a1\u01ac\u01a3\u01aa\u01e2\u0182\u01af\u01a7\u01a8\u01ae\u01b9\u01f6\u01e4\u0197", "\u076d\u0762\u0761\u0760\u076b\u0732\u0730\u0726\u0727\u0742\u0764\u076f\u0778\u076f\u0721\u0762\u076f\u0760\u0769\u0721\u0741\u076c\u0764\u076b\u076d\u077a\u0735", "\u033c\u0327\u031b\u033c\u033a\u0321\u0326\u032f\u0374\u0376\u0360\u0361\u0304\u0322\u0329\u033e\u0329\u0367\u0324\u0329\u0326\u032f\u0367\u031b\u033c\u033a\u0321\u0326\u032f\u0373", "\u061a\u061b\u0600\u061d\u0612\u060d\u0648\u064a\u065c\u065d\u0622", "\u0499\u0498\u0483\u049e\u0491\u048e\u04b6\u049b\u049b\u04cb\u04c9\u04df\u04de\u04a1", "\u00ee\u00f8\u00f0\u00ed\u00a5\u00a7\u00b1\u00b0\u00cf", "\u00e0\u00f6\u00fe\u00e3\u00ab\u00a9\u00bf\u00dd\u00be\u00c1", "\u0576\u0560\u0568\u0575\u0531\u053d\u053f\u0529\u054b\u0528\u0557", "\u014a\u015c\u0154\u0149\u0101\u0103\u0115\u0177\u0174\u0114\u016b", "\u0486\u0489\u048e\u0481\u048c\u0489\u049a\u0485\u04dc\u04de\u04c8\u04c9\u04b6"})
public final class Class3549 {
    public static float field7863;
    public static float field7864;

    static {
        R\u200e = "AssumeBreak";
        field7864 = Float.intBitsToFloat(1053154300);
        aY\u200e = "MiningTicks";
        bl\u200e = "Random";
        bA\u200e = "Place";
        field7863 = Float.intBitsToFloat(1051126066);
    }

    private static String urjjIBDWe7ivJBNi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite TDtFAugfBL1n4q(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3549.urjjIBDWe7ivJBNi(k2, 811757338));
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
                int a2 = Integer.parseInt(Class3549.urjjIBDWe7ivJBNi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3549.urjjIBDWe7ivJBNi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3549.urjjIBDWe7ivJBNi(k2, 811757338) + " " + l2 + " " + m2);
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

