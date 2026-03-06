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

@HACHIMI_CLIENT(mv=100, d1={"\ua0f9\ua0f5\ua0fb\ua0fd\ua0fb\ua0fe\ua0fb\ua0f4", "\ub265\ub260\ub266\ub266\ub264\ub266\ub265\ub26c", "\ua9c0\ua9cf\ua9c0\ua9c0\ua9c3\ua9c0\ua9c2\ua9c5", "\u519a\u519d\u519b\u5191\u519a\u5199\u5190\u519e", "\u179b\u179e\u179f\u179b\u179f\u1797\u179c\u1799", "\ub563\ub566\ub562\ub569\ub562\ub561\ub569\ub561", "\u8166\u8161\u8160\u8168\u8160\u8163\u8164\u8160", "\udf8e\udf8f\udf82\udf89\udf8c\udf8a\udf8c", "\u0452\u0452\u0455\u0457\u0457\u0453\u0455\u0452", "\ud322\ud325\ud327\ud327\ud32c\ud325\ud32c\ud32d", "\u7849\u784e\u784a\u784d\u7845\u784a\u784b\u7849", "\u2b88\u2b8f\u2b8b\u2b8e\u2b82\u2b8f\u2b8f", "\udf0a\udf00\udf0a\udf0f\udf0d\udf0e\udf0f\udf0c", "\ucb2f\ucb24\ucb2d\ucb2f\ucb2f\ucb28", "\u2f07\u2f00\u2f06\u2f00\u2f00\u2f00\u2f06\u2f00", "\ud4e7\ud4e5\ud4e3\ud4e4\ud4e7\ud4e8\ud4e3\ud4e6", "\u6875\u6871\u6877\u687f\u6876\u6874\u6870\u6874"}, d2={"\u0620\u060e\u0612\u264f\u067d\u067f\u0669\u060d\u062b\u0620\u0637\u0620\u066e\u062d\u0620\u062f\u0626\u066e\u0612\u0635\u0633\u0628\u062f\u0626\u067a\u0668\u060d\u062b\u0620\u0637\u0620\u066e\u062d\u0620\u062f\u0626\u066e\u0612\u0635\u0633\u0628\u062f\u0626\u067a", "\u0790\u07be\u07a5\u27ff\u07cd\u07cf\u07d9\u07bd\u079b\u0790\u0787\u0790\u07de\u079d\u0790\u079f\u0796\u07de\u07a2\u0785\u0783\u0798\u079f\u0796\u07ca\u07d8\u07bd\u079b\u0790\u0787\u0790\u07de\u079d\u0790\u079f\u0796\u07de\u07a2\u0785\u0783\u0798\u079f\u0796\u07ca", "\u0569\u0547\u055d\u2506\u0534\u0536\u0520\u0544\u0562\u0569\u057e\u0569\u0527\u0564\u0569\u0566\u056f\u0527\u055b\u057c\u057a\u0561\u0566\u056f\u0533\u0521\u0544\u0562\u0569\u057e\u0569\u0527\u0564\u0569\u0566\u056f\u0527\u055b\u057c\u057a\u0561\u0566\u056f\u0533", "\u00ca\u0095\u009a\u009f\u0098\u009f\u0082\u00c8\u00ca\u00c8\u00de\u00df\u00a0", "\u00c9\u009c\u009b\u009c\u0081\u00cb\u00c9\u00cb\u00dd\u00dc\u00a3", "\u04d7\u04d5\u04c4\u04f3\u04dc\u04d1\u04c3\u04c3\u048c\u048e\u0498\u0499\u04fc\u04da\u04d1\u04c6\u04d1\u049f\u04dc\u04d1\u04de\u04d7\u049f\u04f3\u04dc\u04d1\u04c3\u04c3\u048b", "\u07db\u07d2\u07c0\u07db\u07f0\u07dc\u07d7\u07d6\u078f\u078d\u079b\u079a\u07fa", "\u05b7\u05a3\u05a7\u05b3\u05be\u05a1\u05ee\u05ec\u05fa\u059e\u05b8\u05b3\u05a4\u05b3\u05fd\u05be\u05b3\u05bc\u05b5\u05fd\u059d\u05b0\u05b8\u05b7\u05b1\u05a6\u05e9\u05fb\u0588", "\u05b3\u05bc\u05bf\u05be\u05b5\u05ec\u05ee\u05f8\u05f9\u059c\u05ba\u05b1\u05a6\u05b1\u05ff\u05bc\u05b1\u05be\u05b7\u05ff\u059f\u05b2\u05ba\u05b5\u05b3\u05a4\u05eb", "\u0369\u0372\u034e\u0369\u036f\u0374\u0373\u037a\u0321\u0323\u0335\u0334\u0351\u0377\u037c\u036b\u037c\u0332\u0371\u037c\u0373\u037a\u0332\u034e\u0369\u036f\u0374\u0373\u037a\u0326", "\u012f\u012e\u0135\u0128\u0127\u0138\u017d\u017f\u0169\u0168\u0117", "\u0681\u0680\u069b\u0686\u0689\u0696\u06ae\u0683\u0683\u06d3\u06d1\u06c7\u06c6\u06b9", "\u075b\u074d\u0745\u0758\u0710\u0712\u0704\u0705\u077a", "\u0308\u031e\u0316\u030b\u0343\u0341\u0357\u0335\u0356\u0329", "\u0765\u0773\u077b\u0766\u0722\u072e\u072c\u073a\u0758\u073b\u0744", "\u078c\u079a\u0792\u078f\u07c7\u07c5\u07d3\u07b1\u07b2\u07d2\u07ad", "\u0599\u0596\u0591\u059e\u0593\u0596\u0585\u059a\u05c3\u05c1\u05d7\u05d6\u05a9"})
public final class Class1574 {
    public static double field5879;
    public static int field5880 = 612935688;
    public static int field5881 = -968341706;

    private static String bJfRo7vkDNSIe4dV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        r\u200e = "UseTimer";
        aq\u200e = "Pitch";
        aQ\u200e = "Performs calculations on separate threads";
        field5879 = Double.longBitsToDouble(4602678819172646912L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite EnigNetgGnTOoy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1574.bJfRo7vkDNSIe4dV(k2, -1798000332));
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
                int a2 = Integer.parseInt(Class1574.bJfRo7vkDNSIe4dV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1574.bJfRo7vkDNSIe4dV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1574.bJfRo7vkDNSIe4dV(k2, -1798000332) + " " + l2 + " " + m2);
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

