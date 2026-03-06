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
@HACHIMI_CLIENT(mv=100, d1={"\u9867\u9861\u9861\u9866\u9860\u9867\u9862\u986b", "\u3710\u371c\u3715\u371d\u3711\u3713\u3716\u371d", "\ud685\ud687\ud685\ud682\ud687\ud684\ud686\ud685", "\u8323\u8324\u8326\u8329\u8325\u8327\u8322\u8326", "\u1719\u1718\u171b\u1715\u171b\u171c\u1718\u171f", "\u9456\u9456\u9456\u9451\u9456\u9453\u9450\u945d", "\u8692\u8691\u8695\u8693\u8693\u869a\u869a\u8697", "\udb22\udb20\udb25\udb25\udb22\udb24\udb25", "\u13a3\u13a1\u13a3\u13a2\u13ae\u13a3\u13a0\u13a2", "\u051c\u0519\u051e\u0511\u0519\u051a\u051a\u0518", "\u8602\u8600\u8607\u860f\u8607\u8606\u8605\u8605", "\u9e1a\u9e1b\u9e1a\u9e16\u9e1c\u9e1a\u9e16\u9e1b", "\u99e3\u99ec\u99ec\u99e0\u99ec\u99e7\u99ec\u99ec", "\u999f\u9999\u999d\u9999\u999e\u999a\u999c\u9997", "\u07be\u07bd\u07b8\u07b9\u07b5\u07b4\u07b8", "\ud96f\ud96f\ud962\ud96b\ud969\ud96b\ud96d\ud96f"}, d2={"\u0210\u020e\u0231\u2271\u0243\u0241\u0257\u0233\u0215\u021e\u0209\u021e\u0250\u0213\u021e\u0211\u0218\u0250\u022c\u020b\u020d\u0216\u0211\u0218\u0244\u0256\u0233\u0215\u021e\u0209\u021e\u0250\u0213\u021e\u0211\u0218\u0250\u022c\u020b\u020d\u0216\u0211\u0218\u0244", "\u062d\u0633\u060d\u264c\u067e\u067c\u066a\u060e\u0628\u0623\u0634\u0623\u066d\u062e\u0623\u062c\u0625\u066d\u0611\u0636\u0630\u062b\u062c\u0625\u0679\u066b\u060e\u0628\u0623\u0634\u0623\u066d\u062e\u0623\u062c\u0625\u066d\u0611\u0636\u0630\u062b\u062c\u0625\u0679", "\u0637\u0668\u0667\u0662\u0665\u0662\u067f\u0635\u0637\u0635\u0623\u0622\u065d", "\u013f\u016a\u016d\u016a\u0177\u013d\u013f\u013d\u012b\u012a\u0155", "\u051e\u051c\u050d\u053a\u0515\u0518\u050a\u050a\u0545\u0547\u0551\u0550\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u053a\u0515\u0518\u050a\u050a\u0542", "\u0361\u0368\u037a\u0361\u034a\u0366\u036d\u036c\u0335\u0337\u0321\u0320\u0340", "\u02d5\u02c1\u02c5\u02d1\u02dc\u02c3\u028c\u028e\u0298\u02fc\u02da\u02d1\u02c6\u02d1\u029f\u02dc\u02d1\u02de\u02d7\u029f\u02ff\u02d2\u02da\u02d5\u02d3\u02c4\u028b\u0299\u02ea", "\u013e\u0131\u0132\u0133\u0138\u0161\u0163\u0175\u0174\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u0112\u013f\u0137\u0138\u013e\u0129\u0166", "\u00e6\u00fd\u00c1\u00e6\u00e0\u00fb\u00fc\u00f5\u00ae\u00ac\u00ba\u00bb\u00de\u00f8\u00f3\u00e4\u00f3\u00bd\u00fe\u00f3\u00fc\u00f5\u00bd\u00c1\u00e6\u00e0\u00fb\u00fc\u00f5\u00a9", "\u073d\u073c\u0727\u073a\u0735\u072a\u076f\u076d\u077b\u077a\u0705", "\"#8%*5\r  prde\u001a", "\u009a\u008c\u0084\u0099\u00d1\u00d3\u00c5\u00c4\u00bb", "\u009a\u008c\u0084\u0099\u00d1\u00d3\u00c5\u00a7\u00c4\u00bb", "\u03ab\u03bd\u03b5\u03a8\u03ec\u03e0\u03e2\u03f4\u0396\u03f5\u038a", "\u067f\u0669\u0661\u067c\u0634\u0636\u0620\u0642\u0641\u0621\u065e", "\u0240\u024f\u0248\u0247\u024a\u024f\u025c\u0243\u021a\u0218\u020e\u020f\u0270"})
public final class Class1766 {
    public static float field6615;
    public static int field6616 = 1;
    public static float field6617 = 0.50004244f;
    public static float field6618 = 0.47719806f;

    /*
     * WARNING - void declaration
     */
    private static CallSite 4W3w75YVAwaofn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1766.ljgvfcOkadqOq9Le(k2, 2109168995));
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
                int a2 = Integer.parseInt(Class1766.ljgvfcOkadqOq9Le(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1766.ljgvfcOkadqOq9Le(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1766.ljgvfcOkadqOq9Le(k2, 2109168995) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String ljgvfcOkadqOq9Le(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        l\u200e = "Displays client name and version watermark";
        Z\u200e = "Packets";
        field6615 = Float.intBitsToFloat(1053077736);
    }
}

