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

@HACHIMI_CLIENT(mv=100, d1={"\u9572\u9571\u9577\u9575\u9576\u9572\u957c\u9570", "\uadb9\uadbf\uadb8\uadbf\uadbf\uadbf\uadba\uadbe", "\uc447\uc442\uc442\uc441\uc441\uc447\uc44c\uc44d", "\u9ca3\u9ca5\u9ca7\u9ca6\u9ca3\u9ca5\u9ca1\u9ca5", "\u0e11\u0e13\u0e12\u0e11\u0e10\u0e13\u0e1d\u0e12", "\ua00c\ua00a\ua000\ua00d\ua009\ua008\ua009\ua00b", "\u1a4b\u1a48\u1a4d\u1a4d\u1a41\u1a4d\u1a49\u1a4f", "\ud016\ud017\ud013\ud010\ud012\ud010\ud011\ud015", "\u5f59\u5f58\u5f59\u5f5c\u5f59\u5f52\u5f5d\u5f5d", "\u5c40\u5c43\u5c47\u5c4a\u5c41\u5c41\u5c42\u5c42", "\ue43f\ue43e\ue43a\ue43d\ue43c\ue43f\ue43d\ue43d", "\ubb5b\ubb55\ubb5d\ubb5b\ubb5f\ubb5d\ubb5a\ubb58", "\u5f8c\u5f8f\u5f8e\u5f81\u5f8b\u5f8a\u5f8b\u5f8f", "\u6131\u613e\u6137\u6132\u6136\u6133\u6137\u6135", "\ua676\ua674\ua676\ua677\ua676\ua677\ua67c\ua673", "\u9136\u9135\u913a\u9134\u9133\u9131\u913b\u9131"}, d2={"\u0210\u023d\u0219\u227a\u0248\u024a\u025c\u0238\u021e\u0215\u0202\u0215\u025b\u0218\u0215\u021a\u0213\u025b\u0227\u0200\u0206\u021d\u021a\u0213\u024f\u025d\u0238\u021e\u0215\u0202\u0215\u025b\u0218\u0215\u021a\u0213\u025b\u0227\u0200\u0206\u021d\u021a\u0213\u024f", "\u02cc\u02e1\u02c6\u22a6\u0294\u0296\u0280\u02e4\u02c2\u02c9\u02de\u02c9\u0287\u02c4\u02c9\u02c6\u02cf\u0287\u02fb\u02dc\u02da\u02c1\u02c6\u02cf\u0293\u0281\u02e4\u02c2\u02c9\u02de\u02c9\u0287\u02c4\u02c9\u02c6\u02cf\u0287\u02fb\u02dc\u02da\u02c1\u02c6\u02cf\u0293", "\u0359\u0306\u0309\u030c\u030b\u030c\u0311\u035b\u0359\u035b\u034d\u034c\u0333", "\u008d\u00d8\u00df\u00d8\u00c5\u008f\u008d\u008f\u0099\u0098\u00e7", "\u0124\u0126\u0137\u0100\u012f\u0122\u0130\u0130\u017f\u017d\u016b\u016a\u010f\u0129\u0122\u0135\u0122\u016c\u012f\u0122\u012d\u0124\u016c\u0100\u012f\u0122\u0130\u0130\u0178", "\u017b\u0172\u0160\u017b\u0150\u017c\u0177\u0176\u012f\u012d\u013b\u013a\u015a", "\u070e\u071a\u071e\u070a\u0707\u0718\u0757\u0755\u0743\u0727\u0701\u070a\u071d\u070a\u0744\u0707\u070a\u0705\u070c\u0744\u0724\u0709\u0701\u070e\u0708\u071f\u0750\u0742\u0731", "\u023d\u0232\u0231\u0230\u023b\u0262\u0260\u0276\u0277\u0212\u0234\u023f\u0228\u023f\u0271\u0232\u023f\u0230\u0239\u0271\u0211\u023c\u0234\u023b\u023d\u022a\u0265", "\u0459\u0442\u047e\u0459\u045f\u0444\u0443\u044a\u0411\u0413\u0405\u0404\u0461\u0447\u044c\u045b\u044c\u0402\u0441\u044c\u0443\u044a\u0402\u047e\u0459\u045f\u0444\u0443\u044a\u0416", "\u075d\u075c\u0747\u075a\u0755\u074a\u070f\u070d\u071b\u071a\u0765", "\u0655\u0654\u064f\u0652\u065d\u0642\u067a\u0657\u0657\u0607\u0605\u0613\u0612\u066d", "\u04a7\u04b1\u04b9\u04a4\u04ec\u04ee\u04f8\u04f9\u0486", "\u05a4\u05b2\u05ba\u05a7\u05ef\u05ed\u05fb\u0599\u05fa\u0585", "\u07bd\u07ab\u07a3\u07be\u07fa\u07f6\u07f4\u07e2\u0780\u07e3\u079c", "\u06cf\u06d9\u06d1\u06cc\u0684\u0686\u0690\u06f2\u06f1\u0691\u06ee", "\u01eb\u01e4\u01e3\u01ec\u01e1\u01e4\u01f7\u01e8\u01b1\u01b3\u01a5\u01a4\u01db"})
public final class Class5526 {
    public static double field10448;
    public static double field10449 = 0.5;
    public static double field10450;
    public static int field10451 = 1;
    public static float field10452 = 0.70291865f;

    static {
        field10450 = Double.longBitsToDouble(0x4000000000000000L);
        y\u200e = "The packetfly mode for spoofing packets";
        af\u200e = "x";
        field10448 = Double.longBitsToDouble(4604530411009092622L);
    }

    private static String JVTRrzXNr6w6oIFi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wvbeGaD9mStUJn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5526.JVTRrzXNr6w6oIFi(k2, 417818948));
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
                int a2 = Integer.parseInt(Class5526.JVTRrzXNr6w6oIFi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5526.JVTRrzXNr6w6oIFi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5526.JVTRrzXNr6w6oIFi(k2, 417818948) + " " + l2 + " " + m2);
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

