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
@HACHIMI_CLIENT(mv=100, d1={"\ua32c\ua329\ua324\ua32e\ua32c\ua32d\ua32d\ua32a", "\uc691\uc692\uc69c\uc692\uc69c\uc696\uc697\uc694", "\u7147\u714e\u714d\u7147\u7147\u714f\u7148", "\u37f0\u37f0\u37f7\u37f6\u37f0\u37f2\u37fc\u37f0", "\ua16c\ua16a\ua163\ua16a\ua162\ua16f\ua16c\ua16a", "\ucee4\ucee0\ucee3\ucee6\ucee0\ucee8\ucee7\ucee4", "\u5c61\u5c60\u5c67\u5c61\u5c6a\u5c66\u5c60\u5c65", "\u0b08\u0b0d\u0b08\u0b08\u0b0e\u0b01\u0b01\u0b0b", "\u669e\u6694\u669c\u669d\u6694\u669c\u669b\u6698", "\u40ac\u40a9\u40ad\u40aa\u40af\u40af\u40ae\u40ad", "\u8d07\u8d02\u8d02\u8d04\u8d06\u8d02\u8d00\u8d04", "\u62dd\u62df\u62dc\u62dd\u62d8\u62dc\u62d3\u62d9", "\u182b\u182c\u182d\u1829\u182d\u182c\u182c", "\uc497\uc495\uc497\uc493\uc494\uc49e\uc49e\uc494", "\u5024\u5022\u5026\u5022\u502e\u5026\u5024\u5024", "\u4b3f\u4b3b\u4b3b\u4b32\u4b3e\u4b38\u4b3b"}, d2={"\u06ed\u06d8\u06ce\u2691\u06a3\u06a1\u06b7\u06d3\u06f5\u06fe\u06e9\u06fe\u06b0\u06f3\u06fe\u06f1\u06f8\u06b0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a4\u06b6\u06d3\u06f5\u06fe\u06e9\u06fe\u06b0\u06f3\u06fe\u06f1\u06f8\u06b0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a4", "\u014f\u017a\u016f\u2133\u0101\u0103\u0115\u0171\u0157\u015c\u014b\u015c\u0112\u0151\u015c\u0153\u015a\u0112\u016e\u0149\u014f\u0154\u0153\u015a\u0106\u0114\u0171\u0157\u015c\u014b\u015c\u0112\u0151\u015c\u0153\u015a\u0112\u016e\u0149\u014f\u0154\u0153\u015a\u0106", "\u052e\u0571\u057e\u057b\u057c\u057b\u0566\u052c\u052e\u052c\u053a\u053b\u0544", "\u03d5\u0380\u0387\u0380\u039d\u03d7\u03d5\u03d7\u03c1\u03c0\u03bf", "\u045c\u045e\u044f\u0478\u0457\u045a\u0448\u0448\u0407\u0405\u0413\u0412\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0478\u0457\u045a\u0448\u0448\u0400", "\u0168\u0161\u0173\u0168\u0143\u016f\u0164\u0165\u013c\u013e\u0128\u0129\u0149", "\u018b\u019f\u019b\u018f\u0182\u019d\u01d2\u01d0\u01c6\u01a2\u0184\u018f\u0198\u018f\u01c1\u0182\u018f\u0180\u0189\u01c1\u01a1\u018c\u0184\u018b\u018d\u019a\u01d5\u01c7\u01b4", "\u076b\u0764\u0767\u0766\u076d\u0734\u0736\u0720\u0721\u0744\u0762\u0769\u077e\u0769\u0727\u0764\u0769\u0766\u076f\u0727\u0747\u076a\u0762\u076d\u076b\u077c\u0733", "\u0740\u075b\u0767\u0740\u0746\u075d\u075a\u0753\u0708\u070a\u071c\u071d\u0778\u075e\u0755\u0742\u0755\u071b\u0758\u0755\u075a\u0753\u071b\u0767\u0740\u0746\u075d\u075a\u0753\u070f", "\u0786\u0787\u079c\u0781\u078e\u0791\u07d4\u07d6\u07c0\u07c1\u07be", "\u038c\u038d\u0396\u038b\u0384\u039b\u03a3\u038e\u038e\u03de\u03dc\u03ca\u03cb\u03b4", "\u0301\u0317\u031f\u0302\u034a\u0348\u035e\u035f\u0320", "\u001b\r\u0005\u0018PRD&E:", "\u061e\u0608\u0600\u061d\u0659\u0655\u0657\u0641\u0623\u0640\u063f", "\u051a\u050c\u0504\u0519\u0551\u0553\u0545\u0527\u0524\u0544\u053b", "\u0784\u078b\u078c\u0783\u078e\u078b\u0798\u0787\u07de\u07dc\u07ca\u07cb\u07b4"})
public final class Class3515 {
    public static double field7753 = Double.longBitsToDouble(4601184042216941908L);
    public static float field7754;
    public static float field7755;

    private static String It0QgnQqKxGyajSq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 7M41hmD17WKzSJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3515.It0QgnQqKxGyajSq(k2, -1228717518));
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
                int a2 = Integer.parseInt(Class3515.It0QgnQqKxGyajSq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3515.It0QgnQqKxGyajSq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3515.It0QgnQqKxGyajSq(k2, -1228717518) + " " + l2 + " " + m2);
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
        c\u200e = "RotateX";
        G\u200e = "setting";
        field7754 = Float.intBitsToFloat(1044308088);
        field7755 = Float.intBitsToFloat(1064925907);
    }
}

