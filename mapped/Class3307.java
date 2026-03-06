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

@HACHIMI_CLIENT(mv=100, d1={"\u0cfd\u0cfe\u0cf9\u0cfd\u0cfa\u0cf8\u0cf7\u0cfe", "\u8302\u830a\u8307\u8307\u830a\u8302\u8305\u830a", "\u45e2\u45e8\u45eb\u45e3\u45ec\u45ec\u45ee", "\u34da\u34d1\u34dc\u34d1\u34dc\u34da\u34dd\u34d1", "\u3561\u3564\u3567\u356f\u3563\u3562\u3566\u356f", "\u2900\u2900\u2902\u2900\u2900\u290c\u2905\u2904", "\u5bba\u5bbc\u5bba\u5bb6\u5bb9\u5bbb\u5bb9\u5bb7", "\u95ea\u95e8\u95e9\u95ed\u95eb\u95eb\u95ea\u95ec", "\u1589\u1588\u1589\u1580\u1581\u1580\u1588\u158f", "\u301b\u301a\u301d\u3019\u3018\u301f\u3013\u301a", "\u7465\u7460\u7462\u7466\u7465\u7466\u7460\u7461", "\u92ff\u92f9\u92fb\u92fb\u92fd\u92fb\u92f4\u92fc", "\ude35\ude37\ude34\ude30\ude32\ude31\ude36\ude30", "\u2c9e\u2c9d\u2c99\u2c96\u2c98\u2c9f\u2c97\u2c9f", "\u3e62\u3e65\u3e63\u3e6f\u3e62\u3e61\u3e60\u3e61", "\u2642\u2643\u2640\u2646\u2641\u2647\u2643\u2640"}, d2={"\u0683\u06d0\u06e6\u06d5\u06dd\u06ff\u06f4\u06d3\u0681\u06d5\u068a\u0688\u069e\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d\u069f\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d", "\u012c\u010f\u0102\u012d\u0114\u010a\u0103\u012d\u0116\u016a\u0167\u0165\u0173\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0108\u012f\u0129\u0132\u0135\u013c\u0160\u0172\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0108\u012f\u0129\u0132\u0135\u013c\u0160", "\u00dc\u0083\u008c\u0089\u008e\u0089\u0094\u00de\u00dc\u00de\u00c8\u00c9\u00b6", "\u02ac\u02f9\u02fe\u02f9\u02e4\u02ae\u02ac\u02ae\u02b8\u02b9\u02c6", "\u029f\u029d\u028c\u02bb\u0294\u0299\u028b\u028b\u02c4\u02c6\u02d0\u02d1\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02bb\u0294\u0299\u028b\u028b\u02c3", "\u05dd\u05d4\u05c6\u05dd\u05f6\u05da\u05d1\u05d0\u0589\u058b\u059d\u059c\u05fc", "\u067f\u066b\u066f\u067b\u0676\u0669\u0626\u0624\u0632\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0655\u0678\u0670\u067f\u0679\u066e\u0621\u0633\u0640", "\u03b7\u03b8\u03bb\u03ba\u03b1\u03e8\u03ea\u03fc\u03fd\u0398\u03be\u03b5\u03a2\u03b5\u03fb\u03b8\u03b5\u03ba\u03b3\u03fb\u039b\u03b6\u03be\u03b1\u03b7\u03a0\u03ef", "\u06d5\u06ce\u06f2\u06d5\u06d3\u06c8\u06cf\u06c6\u069d\u069f\u0689\u0688\u06ed\u06cb\u06c0\u06d7\u06c0\u068e\u06cd\u06c0\u06cf\u06c6\u068e\u06f2\u06d5\u06d3\u06c8\u06cf\u06c6\u069a", "\u041b\u041a\u0401\u041c\u0413\u040c\u0449\u044b\u045d\u045c\u0423", "\u00cd\u00cc\u00d7\u00ca\u00c5\u00da\u00e2\u00cf\u00cf\u009f\u009d\u008b\u008a\u00f5", "\u0741\u0757\u075f\u0742\u070a\u0708\u071e\u071f\u0760", "\u012c\u013a\u0132\u012f\u0167\u0165\u0173\u0111\u0172\u010d", "\u00bd\u00ab\u00a3\u00be\u00fa\u00f6\u00f4\u00e2\u0080\u00e3\u009c", "3%-0xzl\u000e\rm\u0012", "\u0319\u0316\u0311\u031e\u0313\u0316\u0305\u031a\u0343\u0341\u0357\u0356\u0329"})
public final class Class3307 {
    public static double field7119 = 0.02530102139893342;
    public static float field7120;
    public static double field7121 = 0.060822699567730565;
    public static int field7122 = 5;

    /*
     * WARNING - void declaration
     */
    private static CallSite yOLDOQDQt2dr4V(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3307.DKeH83Y4BNQFndBF(k2, -852524748));
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
                int a2 = Integer.parseInt(Class3307.DKeH83Y4BNQFndBF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3307.DKeH83Y4BNQFndBF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3307.DKeH83Y4BNQFndBF(k2, -852524748) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String DKeH83Y4BNQFndBF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        f\u200e = "Rainbow";
        field7120 = Float.intBitsToFloat(1059609838);
        bq\u200e = "The selection of blocks to use for scaffold";
    }
}

