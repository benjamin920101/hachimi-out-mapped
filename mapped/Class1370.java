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

@HACHIMI_CLIENT(mv=100, d1={"\ud083\ud089\ud083\ud086\ud081\ud080\ud084\ud084", "\u8c4f\u8c4f\u8c4c\u8c4d\u8c48\u8c49\u8c4c\u8c4b", "\ud3ee\ud3e8\ud3e8\ud3e2\ud3ea\ud3eb\ud3ee\ud3ed", "\u9da3\u9da6\u9da2\u9da5\u9da7\u9da5\u9da6", "\u20b8\u20b8\u20b9\u20b9\u20bf\u20b9\u20bd\u20bf", "\u4d02\u4d04\u4d05\u4d00\u4d02\u4d01\u4d0f\u4d05", "\ua1d7\ua1d0\ua1d4\ua1d2\ua1d6\ua1df\ua1d3\ua1d6", "\u9eb9\u9ebf\u9eb5\u9ebb\u9ebf\u9ebd\u9eba\u9ebf", "\u18a8\u18a2\u18a8\u18aa\u18a8\u18a2\u18aa\u18a2", "\u1889\u188c\u188c\u1885\u188d\u188e\u188c", "\u8633\u8630\u8634\u8636\u8635\u8634\u8634\u8635", "\udad9\udadb\udad3\udadd\udad2\udadf\udad3\udade", "\u20e2\u20e6\u20e0\u20e6\u20e0\u20e8\u20e7\u20e8", "\u741a\u7411\u741f\u741c\u7410\u741e\u741f\u7411", "\ua39f\ua39b\ua39f\ua398\ua398\ua39f\ua398", "\u3e83\u3e80\u3e81\u3e85\u3e8f\u3e80\u3e8f", "\u515d\u5151\u515d\u515d\u5150\u515c\u5151", "\u10fa\u10f5\u10f7\u10fb\u10f3\u10f4\u10fb"}, d2={"\u046d\u0470\u046e\u240c\u043e\u043c\u042a\u044e\u0468\u0463\u0474\u0463\u042d\u046e\u0463\u046c\u0465\u042d\u0451\u0476\u0470\u046b\u046c\u0465\u0439\u042b\u044e\u0468\u0463\u0474\u0463\u042d\u046e\u0463\u046c\u0465\u042d\u0451\u0476\u0470\u046b\u046c\u0465\u0439", "\u04d7\u04ca\u04d5\u24b6\u0484\u0486\u0490\u04f4\u04d2\u04d9\u04ce\u04d9\u0497\u04d4\u04d9\u04d6\u04df\u0497\u04eb\u04cc\u04ca\u04d1\u04d6\u04df\u0483\u0491\u04f4\u04d2\u04d9\u04ce\u04d9\u0497\u04d4\u04d9\u04d6\u04df\u0497\u04eb\u04cc\u04ca\u04d1\u04d6\u04df\u0483", "\u023e\u0223\u023f\u225f\u026d\u026f\u0279\u021d\u023b\u0230\u0227\u0230\u027e\u023d\u0230\u023f\u0236\u027e\u0202\u0225\u0223\u0238\u023f\u0236\u026a\u0278\u021d\u023b\u0230\u0227\u0230\u027e\u023d\u0230\u023f\u0236\u027e\u0202\u0225\u0223\u0238\u023f\u0236\u026a", "\u03ad\u03b0\u03ad\u23cc\u03fe\u03fc\u03ea\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9\u03eb\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9", "\u0729\u0776\u0779\u077c\u077b\u077c\u0761\u072b\u0729\u072b\u073d\u073c\u0743", "\u0255\u0200\u0207\u0200\u021d\u0257\u0255\u0257\u0241\u0240\u023f", "\u057e\u057c\u056d\u055a\u0575\u0578\u056a\u056a\u0525\u0527\u0531\u0530\u0555\u0573\u0578\u056f\u0578\u0536\u0575\u0578\u0577\u057e\u0536\u055a\u0575\u0578\u056a\u056a\u0522", "\u038c\u0385\u0397\u038c\u03a7\u038b\u0380\u0381\u03d8\u03da\u03cc\u03cd\u03ad", "\u0621\u0635\u0631\u0625\u0628\u0637\u0678\u067a\u066c\u0608\u062e\u0625\u0632\u0625\u066b\u0628\u0625\u062a\u0623\u066b\u060b\u0626\u062e\u0621\u0627\u0630\u067f\u066d\u061e", "\u04ee\u04e1\u04e2\u04e3\u04e8\u04b1\u04b3\u04a5\u04a4\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04c2\u04ef\u04e7\u04e8\u04ee\u04f9\u04b6", "\u00c4\u00df\u00e3\u00c4\u00c2\u00d9\u00de\u00d7\u008c\u008e\u0098\u0099\u00fc\u00da\u00d1\u00c6\u00d1\u009f\u00dc\u00d1\u00de\u00d7\u009f\u00e3\u00c4\u00c2\u00d9\u00de\u00d7\u008b", "\u06d3\u06d2\u06c9\u06d4\u06db\u06c4\u0681\u0683\u0695\u0694\u06eb", "\u0088\u0089\u0092\u008f\u0080\u009f\u00a7\u008a\u008a\u00da\u00d8\u00ce\u00cf\u00b0", "\u02b5\u02a3\u02ab\u02b6\u02fe\u02fc\u02ea\u02eb\u0294", "\u056d\u057b\u0573\u056e\u0526\u0524\u0532\u0550\u0533\u054c", "\u0163\u0175\u017d\u0160\u0124\u0128\u012a\u013c\u015e\u013d\u0142", "\u0169\u017f\u0177\u016a\u0122\u0120\u0136\u0154\u0157\u0137\u0148", "\u0729\u0726\u0721\u072e\u0723\u0726\u0735\u072a\u0773\u0771\u0767\u0766\u0719"})
public final class Class1370 {
    public static float field5278 = Float.intBitsToFloat(1061623666);
    public static double field5279 = 0.612305270646732;
    public static double field5280;
    public static float field5281 = 0.16421026f;
    public static double field5282;

    private static String JVzBr07kSbprgGn4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        m\u200e = "";
        field5280 = Double.longBitsToDouble(4605152634689011392L);
        field5282 = Double.longBitsToDouble(4598208119064268102L);
        bb\u200e = "EnderChests";
        bB\u200e = "Instantly attacks crystals when they spawn";
        bL\u200e = "Transactions";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite fwnNTzUboXCW5a(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1370.JVzBr07kSbprgGn4(k2, 1205657713));
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
                int a2 = Integer.parseInt(Class1370.JVzBr07kSbprgGn4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1370.JVzBr07kSbprgGn4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1370.JVzBr07kSbprgGn4(k2, 1205657713) + " " + l2 + " " + m2);
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

