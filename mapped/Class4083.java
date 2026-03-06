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

@HACHIMI_CLIENT(mv=100, d1={"\udf6a\udf6f\udf6e\udf69\udf6e\udf6b\udf66", "\u6d1d\u6d1d\u6d12\u6d1c\u6d1b\u6d1b\u6d1a\u6d1e", "\u780a\u780a\u7809\u7801\u780d\u7800\u7808\u780b", "\uae56\uae5e\uae5a\uae59\uae57\uae58\uae59", "\u16de\u16dd\u16d9\u16d8\u16d9\u16de\u16de\u16dd", "\u5d63\u5d64\u5d65\u5d67\u5d6b\u5d66\u5d62\u5d65", "\u1ae9\u1aea\u1ae5\u1aee\u1aec\u1aec\u1ae9\u1ae5", "\u5624\u5624\u562d\u5625\u5628\u562d\u562a", "\ucabb\ucab6\ucabc\ucab7\ucab6\ucab8\ucabe\ucabe", "\u9970\u9971\u9979\u997f\u997c\u9971\u9970", "\u0da7\u0da6\u0da5\u0dab\u0da7\u0dab\u0da3\u0da6", "\ua4ff\ua4ff\ua4fc\ua4fd\ua4f6\ua4f7\ua4fe\ua4f8", "\ue0a2\ue0a1\ue0a2\ue0a2\ue0af\ue0a2\ue0a4", "\u8b48\u8b4b\u8b4c\u8b48\u8b4a\u8b4a\u8b4f", "\u9b25\u9b22\u9b25\u9b22\u9b22\u9b23\u9b27"}, d2={"\u0684\u06b4\u0696\u26eb\u06d9\u06db\u06cd\u06a9\u068f\u0684\u0693\u0684\u06ca\u0689\u0684\u068b\u0682\u06ca\u06b6\u0691\u0697\u068c\u068b\u0682\u06de\u06cc\u06a9\u068f\u0684\u0693\u0684\u06ca\u0689\u0684\u068b\u0682\u06ca\u06b6\u0691\u0697\u068c\u068b\u0682\u06de", "\u068c\u06d3\u06dc\u06d9\u06de\u06d9\u06c4\u068e\u068c\u068e\u0698\u0699\u06e6", "\u0456\u0403\u0404\u0403\u041e\u0454\u0456\u0454\u0442\u0443\u043c", "\u04eb\u04e9\u04f8\u04cf\u04e0\u04ed\u04ff\u04ff\u04b0\u04b2\u04a4\u04a5\u04c0\u04e6\u04ed\u04fa\u04ed\u04a3\u04e0\u04ed\u04e2\u04eb\u04a3\u04cf\u04e0\u04ed\u04ff\u04ff\u04b7", "\u04d1\u04d8\u04ca\u04d1\u04fa\u04d6\u04dd\u04dc\u0485\u0487\u0491\u0490\u04f0", "\u01b3\u01a7\u01a3\u01b7\u01ba\u01a5\u01ea\u01e8\u01fe\u019a\u01bc\u01b7\u01a0\u01b7\u01f9\u01ba\u01b7\u01b8\u01b1\u01f9\u0199\u01b4\u01bc\u01b3\u01b5\u01a2\u01ed\u01ff\u018c", "\u0174\u017b\u0178\u0179\u0172\u012b\u0129\u013f\u013e\u015b\u017d\u0176\u0161\u0176\u0138\u017b\u0176\u0179\u0170\u0138\u0158\u0175\u017d\u0172\u0174\u0163\u012c", "\u06b0\u06ab\u0697\u06b0\u06b6\u06ad\u06aa\u06a3\u06f8\u06fa\u06ec\u06ed\u0688\u06ae\u06a5\u06b2\u06a5\u06eb\u06a8\u06a5\u06aa\u06a3\u06eb\u0697\u06b0\u06b6\u06ad\u06aa\u06a3\u06ff", "\u03ef\u03ee\u03f5\u03e8\u03e7\u03f8\u03bd\u03bf\u03a9\u03a8\u03d7", "\u0127\u0126\u013d\u0120\u012f\u0130\u0108\u0125\u0125\u0175\u0177\u0161\u0160\u011f", "\u02a2\u02b4\u02bc\u02a1\u02e9\u02eb\u02fd\u02fc\u0283", "\u05f8\u05ee\u05e6\u05fb\u05b3\u05b1\u05a7\u05c5\u05a6\u05d9", "\u02ce\u02d8\u02d0\u02cd\u0289\u0285\u0287\u0291\u02f3\u0290\u02ef", "\u0490\u0486\u048e\u0493\u04db\u04d9\u04cf\u04ad\u04ae\u04ce\u04b1", "\u057a\u0575\u0572\u057d\u0570\u0575\u0566\u0579\u0520\u0522\u0534\u0535\u054a"})
public final class Class4083 {
    public static int field9454 = -2144853856;
    public static float field9455;
    public static double field9456;
    public static double field9457 = 0.9859642484660688;
    public static double field9458;
    public static double field9459 = 0.04014518871939765;
    public static float field9460;

    static {
        field9460 = Float.intBitsToFloat(1046023616);
        K\u200e = "Fills double holes";
        field9456 = Double.longBitsToDouble(4600772095263542716L);
        field9458 = Double.longBitsToDouble(4582981689848511072L);
        field9455 = Float.intBitsToFloat(1046493148);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite q7gSvYemCSle2o(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4083.eVf9jA71XKy6VvBO(k2, -1530938881));
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
                int a2 = Integer.parseInt(Class4083.eVf9jA71XKy6VvBO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4083.eVf9jA71XKy6VvBO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4083.eVf9jA71XKy6VvBO(k2, -1530938881) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String eVf9jA71XKy6VvBO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

