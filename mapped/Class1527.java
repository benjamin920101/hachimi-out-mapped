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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ua41c\ua419\ua41e\ua411\ua41d\ua41c\ua411\ua410", "\u7469\u746a\u7468\u7464\u7465\u7464\u746e\u7468", "\ud5eb\ud5ef\ud5ea\ud5e9\ud5e0\ud5eb\ud5e9\ud5ea", "\u584f\u5841\u5849\u5840\u584f\u584a\u5849\u5849", "\u6207\u6203\u6205\u620c\u620c\u6203\u6204\u620c", "\u7fe0\u7fe0\u7fe1\u7fe5\u7fe6\u7fe5\u7fe6", "\u7391\u7391\u7392\u7390\u7393\u739c\u7394\u7397", "\udb63\udb66\udb63\udb65\udb63\udb63\udb67\udb67", "\ua55d\ua55f\ua55e\ua550\ua55d\ua55c\ua550\ua559", "\u09a3\u09a8\u09a8\u09a9\u09a3\u09a1\u09a6\u09a9", "\u3055\u3057\u3051\u3054\u3057\u3050\u305a\u3053", "\ub0ab\ub0ad\ub0ac\ub0ab\ub0aa\ub0a8\ub0aa\ub0af", "\ubeb5\ubebd\ubebc\ubebc\ubeb5\ubeb6\ubeb1\ubeb7", "\u1492\u1496\u1494\u149b\u1494\u149b\u149b\u149b", "\uc59d\uc599\uc59a\uc598\uc598\uc598\uc59a\uc59a", "\u14b0\u14b5\u14b6\u14b0\u14b4\u14b9\u14b3\u14b9"}, d2={"\u03a8\u0385\u0395\u23c1\u03f3\u03f1\u03e7\u0383\u03a5\u03ae\u03b9\u03ae\u03e0\u03a3\u03ae\u03a1\u03a8\u03e0\u039c\u03bb\u03bd\u03a6\u03a1\u03a8\u03f4\u03e6\u0383\u03a5\u03ae\u03b9\u03ae\u03e0\u03a3\u03ae\u03a1\u03a8\u03e0\u039c\u03bb\u03bd\u03a6\u03a1\u03a8\u03f4", "\u0766\u074a\u0760\u270f\u073d\u073f\u0729\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a\u0728\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a", "\u0442\u041d\u0412\u0417\u0410\u0417\u040a\u0440\u0442\u0440\u0456\u0457\u0428", "\u0634\u0661\u0666\u0661\u067c\u0636\u0634\u0636\u0620\u0621\u065e", "\u038a\u0388\u0399\u03ae\u0381\u038c\u039e\u039e\u03d1\u03d3\u03c5\u03c4\u03a1\u0387\u038c\u039b\u038c\u03c2\u0381\u038c\u0383\u038a\u03c2\u03ae\u0381\u038c\u039e\u039e\u03d6", "\u011f\u0116\u0104\u011f\u0134\u0118\u0113\u0112\u014b\u0149\u015f\u015e\u013e", "\u02cb\u02df\u02db\u02cf\u02c2\u02dd\u0292\u0290\u0286\u02e2\u02c4\u02cf\u02d8\u02cf\u0281\u02c2\u02cf\u02c0\u02c9\u0281\u02e1\u02cc\u02c4\u02cb\u02cd\u02da\u0295\u0287\u02f4", "\u0350\u035f\u035c\u035d\u0356\u030f\u030d\u031b\u031a\u037f\u0359\u0352\u0345\u0352\u031c\u035f\u0352\u035d\u0354\u031c\u037c\u0351\u0359\u0356\u0350\u0347\u0308", "\u0757\u074c\u0770\u0757\u0751\u074a\u074d\u0744\u071f\u071d\u070b\u070a\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718", "\u03de\u03df\u03c4\u03d9\u03d6\u03c9\u038c\u038e\u0398\u0399\u03e6", "\u0546\u0547\u055c\u0541\u054e\u0551\u0569\u0544\u0544\u0514\u0516\u0500\u0501\u057e", "\u0178\u016e\u0166\u017b\u0133\u0131\u0127\u0126\u0159", "\u00cb\u00dd\u00d5\u00c8\u0080\u0082\u0094\u00f6\u0095\u00ea", "\u06bc\u06aa\u06a2\u06bf\u06fb\u06f7\u06f5\u06e3\u0681\u06e2\u069d", "\u03ec\u03fa\u03f2\u03ef\u03a7\u03a5\u03b3\u03d1\u03d2\u03b2\u03cd", "\u03b6\u03b9\u03be\u03b1\u03bc\u03b9\u03aa\u03b5\u03ec\u03ee\u03f8\u03f9\u0386"})
public final class Class1527 {
    public static float field5756;
    public static double field5757;
    public static float field5758 = 0.32919687f;
    public static double field5759 = 0.5118181444681311;

    static {
        ag\u200e = "Delay";
        field5757 = Double.longBitsToDouble(4605724689802395081L);
        field5756 = Float.intBitsToFloat(1132462080);
        bt\u200e = "BreakESP";
    }

    private static String ZlrrzBd07BbJ422r(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 0TWgs7tWXdeK0i(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1527.ZlrrzBd07BbJ422r(k2, -1520393378));
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
                int a2 = Integer.parseInt(Class1527.ZlrrzBd07BbJ422r(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1527.ZlrrzBd07BbJ422r(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1527.ZlrrzBd07BbJ422r(k2, -1520393378) + " " + l2 + " " + m2);
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

