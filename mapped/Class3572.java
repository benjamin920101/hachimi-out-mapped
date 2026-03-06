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
@HACHIMI_CLIENT(mv=100, d1={"\u560e\u5608\u560a\u560c\u560e\u5607\u560c\u5608", "\u8529\u852e\u852f\u852c\u852f\u8524\u852d\u852f", "\u946f\u946d\u9463\u946f\u9462\u946c\u9463\u946a", "\u37da\u37d8\u37de\u37db\u37da\u37df\u37dd\u37d5", "\ua287\ua28b\ua285\ua286\ua284\ua285\ua28b", "\u7ab5\u7ab3\u7ab7\u7ab4\u7ab6\u7abc\u7abd\u7ab0", "\ua052\ua057\ua05f\ua053\ua054\ua056\ua05f\ua053", "\ub55a\ub559\ub557\ub55f\ub55b\ub55d\ub559\ub557", "\u640f\u640d\u640e\u6408\u6406\u6408\u640a\u640b", "\u5783\u5787\u5786\u5785\u5780\u5780\u5783", "\u2cea\u2ce8\u2ceb\u2ce7\u2cec\u2ce6\u2ce6\u2ced", "\u3157\u3156\u3154\u3153\u3157\u3157\u3153", "\u6e94\u6e90\u6e98\u6e92\u6e94\u6e98\u6e96\u6e95", "\ue821\ue826\ue826\ue827\ue825\ue827\ue820\ue820", "\u1cfb\u1cff\u1cf6\u1cfc\u1cff\u1cf7\u1cf8\u1cfa", "\ub740\ub743\ub748\ub746\ub747\ub744\ub749", "\u3e77\u3e76\u3e77\u3e71\u3e71\u3e77\u3e7d\u3e75"}, d2={"\u070f\u0718\u0725\u2760\u0752\u0750\u0746\u0722\u0704\u070f\u0718\u070f\u0741\u0702\u070f\u0700\u0709\u0741\u073d\u071a\u071c\u0707\u0700\u0709\u0755\u0747\u0722\u0704\u070f\u0718\u070f\u0741\u0702\u070f\u0700\u0709\u0741\u073d\u071a\u071c\u0707\u0700\u0709\u0755", "\u0772\u0765\u075f\u271d\u072f\u072d\u073b\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728\u073a\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728", "\u056e\u0579\u0542\u2501\u0533\u0531\u0527\u0543\u0565\u056e\u0579\u056e\u0520\u0563\u056e\u0561\u0568\u0520\u055c\u057b\u057d\u0566\u0561\u0568\u0534\u0526\u0543\u0565\u056e\u0579\u056e\u0520\u0563\u056e\u0561\u0568\u0520\u055c\u057b\u057d\u0566\u0561\u0568\u0534", "\u00a6\u00f9\u00f6\u00f3\u00f4\u00f3\u00ee\u00a4\u00a6\u00a4\u00b2\u00b3\u00cc", "\u06e0\u06b5\u06b2\u06b5\u06a8\u06e2\u06e0\u06e2\u06f4\u06f5\u068a", "\u07e0\u07e2\u07f3\u07c4\u07eb\u07e6\u07f4\u07f4\u07bb\u07b9\u07af\u07ae\u07cb\u07ed\u07e6\u07f1\u07e6\u07a8\u07eb\u07e6\u07e9\u07e0\u07a8\u07c4\u07eb\u07e6\u07f4\u07f4\u07bc", "\u05f1\u05f8\u05ea\u05f1\u05da\u05f6\u05fd\u05fc\u05a5\u05a7\u05b1\u05b0\u05d0", "\u011d\u0109\u010d\u0119\u0114\u010b\u0144\u0146\u0150\u0134\u0112\u0119\u010e\u0119\u0157\u0114\u0119\u0116\u011f\u0157\u0137\u011a\u0112\u011d\u011b\u010c\u0143\u0151\u0122", "\u0178\u0177\u0174\u0175\u017e\u0127\u0125\u0133\u0132\u0157\u0171\u017a\u016d\u017a\u0134\u0177\u017a\u0175\u017c\u0134\u0154\u0179\u0171\u017e\u0178\u016f\u0120", "\u0576\u056d\u0551\u0576\u0570\u056b\u056c\u0565\u053e\u053c\u052a\u052b\u054e\u0568\u0563\u0574\u0563\u052d\u056e\u0563\u056c\u0565\u052d\u0551\u0576\u0570\u056b\u056c\u0565\u0539", "\u075c\u075d\u0746\u075b\u0754\u074b\u070e\u070c\u071a\u071b\u0764", "\u0460\u0461\u047a\u0467\u0468\u0477\u044f\u0462\u0462\u0432\u0430\u0426\u0427\u0458", "\u0007\u0011\u0019\u0004LNXY&", "\u06c6\u06d0\u06d8\u06c5\u068d\u068f\u0699\u06fb\u0698\u06e7", "\u020d\u021b\u0213\u020e\u024a\u0246\u0244\u0252\u0230\u0253\u022c", "\u02e4\u02f2\u02fa\u02e7\u02af\u02ad\u02bb\u02d9\u02da\u02ba\u02c5", "2=:58=.1hj|}\u0002"})
public final class Class3572 {
    public static float field7941;
    public static double field7942;
    public static float field7943;

    static {
        aa\u200e = "Automatically replenishes the item in your main hand";
        field7942 = Double.longBitsToDouble(4604628699257483093L);
        field7943 = Float.intBitsToFloat(1058221088);
        bm\u200e = "Notify";
        field7941 = Float.intBitsToFloat(1062590683);
        bB\u200e = "SortPriority";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite m9o3lWS1jFe4g6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3572.88tdvE2vrqOjvwlL(k2, 1146361132));
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
                int a2 = Integer.parseInt(Class3572.88tdvE2vrqOjvwlL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3572.88tdvE2vrqOjvwlL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3572.88tdvE2vrqOjvwlL(k2, 1146361132) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 88tdvE2vrqOjvwlL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

