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

@HACHIMI_CLIENT(mv=100, d1={"\u7104\u7105\u7100\u710f\u7102\u7104\u7104\u7104", "\u7dd9\u7ddc\u7dde\u7dd9\u7ddd\u7dd9\u7dda\u7dd6", "\ub0a3\ub0a7\ub0a8\ub0a7\ub0a5\ub0a8\ub0a7\ub0a4", "\ud0d5\ud0d5\ud0d2\ud0d0\ud0d3\ud0d2\ud0d5\ud0d4", "\u9bb9\u9bb9\u9bbb\u9bbf\u9bbe\u9bbf\u9bb9", "\u5811\u581f\u581f\u5816\u5817\u581e\u5817\u5815", "\ud641\ud644\ud642\ud643\ud645\ud641\ud641\ud642", "\ub635\ub632\ub636\ub631\ub630\ub639\ub636\ub635", "\ubc53\ubc57\ubc51\ubc52\ubc55\ubc51\ubc56\ubc50", "\ud310\ud314\ud312\ud310\ud312\ud31b\ud312\ud310", "\u51dc\u51db\u51df\u51d7\u51d8\u51da\u51d8\u51d6", "\u309d\u3091\u3090\u3098\u309f\u309e\u3090\u309c", "\u5176\u5177\u5173\u5170\u517d\u5175\u5171\u5174", "\ub270\ub276\ub272\ub271\ub277\ub274\ub273\ub27b", "\u386a\u3869\u386f\u386b\u386f\u386e\u386b\u386a", "\u2c59\u2c5e\u2c55\u2c59\u2c5b\u2c59\u2c58\u2c59", "\u3b69\u3b61\u3b6e\u3b68\u3b61\u3b6c\u3b6c\u3b6d", "\u5026\u5024\u502f\u5024\u5020\u5020\u5025\u5020"}, d2={"\u0447\u0444\u045c\u243b\u0409\u040b\u041d\u0479\u045f\u0454\u0443\u0454\u041a\u0459\u0454\u045b\u0452\u041a\u0466\u0441\u0447\u045c\u045b\u0452\u040e\u041c\u0479\u045f\u0454\u0443\u0454\u041a\u0459\u0454\u045b\u0452\u041a\u0466\u0441\u0447\u045c\u045b\u0452\u040e", "\u0191\u0192\u0189\u21ed\u01df\u01dd\u01cb\u01af\u0189\u0182\u0195\u0182\u01cc\u018f\u0182\u018d\u0184\u01cc\u01b0\u0197\u0191\u018a\u018d\u0184\u01d8\u01ca\u01af\u0189\u0182\u0195\u0182\u01cc\u018f\u0182\u018d\u0184\u01cc\u01b0\u0197\u0191\u018a\u018d\u0184\u01d8", "\u0347\u0344\u035e\u233b\u0309\u030b\u031d\u0379\u035f\u0354\u0343\u0354\u031a\u0359\u0354\u035b\u0352\u031a\u0366\u0341\u0347\u035c\u035b\u0352\u030e\u031c\u0379\u035f\u0354\u0343\u0354\u031a\u0359\u0354\u035b\u0352\u031a\u0366\u0341\u0347\u035c\u035b\u0352\u030e", "\u00d0\u00d3\u00ce\u20ac\u009e\u009c\u008a\u00ee\u00c8\u00c3\u00d4\u00c3\u008d\u00ce\u00c3\u00cc\u00c5\u008d\u00f1\u00d6\u00d0\u00cb\u00cc\u00c5\u0099\u008b\u00ee\u00c8\u00c3\u00d4\u00c3\u008d\u00ce\u00c3\u00cc\u00c5\u008d\u00f1\u00d6\u00d0\u00cb\u00cc\u00c5\u0099", "\u02c1\u029e\u0291\u0294\u0293\u0294\u0289\u02c3\u02c1\u02c3\u02d5\u02d4\u02ab", "\u0786\u07d3\u07d4\u07d3\u07ce\u0784\u0786\u0784\u0792\u0793\u07ec", "\u0455\u0457\u0446\u0471\u045e\u0453\u0441\u0441\u040e\u040c\u041a\u041b\u047e\u0458\u0453\u0444\u0453\u041d\u045e\u0453\u045c\u0455\u041d\u0471\u045e\u0453\u0441\u0441\u0409", "\u03d3\u03da\u03c8\u03d3\u03f8\u03d4\u03df\u03de\u0387\u0385\u0393\u0392\u03f2", "\u0538\u052c\u0528\u053c\u0531\u052e\u0561\u0563\u0575\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u0512\u053f\u0537\u0538\u053e\u0529\u0566\u0574\u0507", "\u0352\u035d\u035e\u035f\u0354\u030d\u030f\u0319\u0318\u037d\u035b\u0350\u0347\u0350\u031e\u035d\u0350\u035f\u0356\u031e\u037e\u0353\u035b\u0354\u0352\u0345\u030a", "\u0229\u0232\u020e\u0229\u022f\u0234\u0233\u023a\u0261\u0263\u0275\u0274\u0211\u0237\u023c\u022b\u023c\u0272\u0231\u023c\u0233\u023a\u0272\u020e\u0229\u022f\u0234\u0233\u023a\u0266", "/.5('8}\u007fih\u0017", "\u06f8\u06f9\u06e2\u06ff\u06f0\u06ef\u06d7\u06fa\u06fa\u06aa\u06a8\u06be\u06bf\u06c0", "\u07e5\u07f3\u07fb\u07e6\u07ae\u07ac\u07ba\u07bb\u07c4", "\u0762\u0774\u077c\u0761\u0729\u072b\u073d\u075f\u073c\u0743", "\u04d8\u04ce\u04c6\u04db\u049f\u0493\u0491\u0487\u04e5\u0486\u04f9", "\u071c\u070a\u0702\u071f\u0757\u0755\u0743\u0721\u0722\u0742\u073d", "LCDKFCPO\u0016\u0014\u0002\u0003|"})
public final class Class1248 {
    public static float field4890;
    public static float field4891;
    public static int field4892 = 2094269672;

    /*
     * WARNING - void declaration
     */
    private static CallSite qY5DSy3QzwAN1T(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1248.JAmO8Okbwc8x8TYZ(k2, 1511099401));
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
                int a2 = Integer.parseInt(Class1248.JAmO8Okbwc8x8TYZ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1248.JAmO8Okbwc8x8TYZ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1248.JAmO8Okbwc8x8TYZ(k2, 1511099401) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field4891 = Float.intBitsToFloat(1046485396);
        w\u200e = "Removes the pullback of the trident";
        field4890 = Float.intBitsToFloat(1059530038);
        aL\u200e = "AirPlace";
        bf\u200e = "Target monsters";
        bA\u200e = "\u00a74";
    }

    private static String JAmO8Okbwc8x8TYZ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

