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
@HACHIMI_CLIENT(mv=100, d1={"\u4336\u433c\u433c\u4332\u433c\u433c\u4335\u4331", "\u4181\u4183\u4185\u4189\u4183\u4180", "\u4086\u4081\u4081\u4084\u4082\u408d\u4082\u4084", "\uac63\uac61\uac67\uac68\uac67\uac69\uac69\uac63", "\u245e\u245c\u2451\u245a\u245e\u245c\u245d\u2458", "\u55a4\u55a2\u55a9\u55a7\u55a0\u55a5\u55a2\u55a2", "\u7c6b\u7c6a\u7c6b\u7c6e\u7c6b\u7c6d\u7c68\u7c6c", "\u421d\u421e\u4215\u4218\u421c\u4214\u421c\u4215", "\u4f61\u4f61\u4f63\u4f69\u4f65\u4f66\u4f69\u4f61", "\u9292\u9291\u9296\u929e\u929e\u9290\u929e\u9293", "\u2de9\u2de1\u2def\u2dea\u2ded\u2de9\u2de8\u2deb", "\u58a9\u58a9\u58a5\u58a4\u58a9\u58ab\u58ad", "\u8931\u8932\u8935\u893d\u8930\u8934\u8935\u8932", "\u021a\u021d\u021d\u021c\u021a\u021c\u021f\u0214", "\u3b8e\u3b84\u3b88\u3b84\u3b8f\u3b89\u3b8f\u3b84", "\ud9ea\ud9e6\ud9e8\ud9eb\ud9ea\ud9ec\ud9e6\ud9e8"}, d2={"\u01ea\u01d6\u01f5\u2197\u01a5\u01a7\u01b1\u01d5\u01f3\u01f8\u01ef\u01f8\u01b6\u01f5\u01f8\u01f7\u01fe\u01b6\u01ca\u01ed\u01eb\u01f0\u01f7\u01fe\u01a2\u01b0\u01d5\u01f3\u01f8\u01ef\u01f8\u01b6\u01f5\u01f8\u01f7\u01fe\u01b6\u01ca\u01ed\u01eb\u01f0\u01f7\u01fe\u01a2", "\u011b\u0127\u0105\u2166\u0154\u0156\u0140\u0124\u0102\u0109\u011e\u0109\u0147\u0104\u0109\u0106\u010f\u0147\u013b\u011c\u011a\u0101\u0106\u010f\u0153\u0141\u0124\u0102\u0109\u011e\u0109\u0147\u0104\u0109\u0106\u010f\u0147\u013b\u011c\u011a\u0101\u0106\u010f\u0153", "\u00a9\u00f6\u00f9\u00fc\u00fb\u00fc\u00e1\u00ab\u00a9\u00ab\u00bd\u00bc\u00c3", "\u0493\u04c6\u04c1\u04c6\u04db\u0491\u0493\u0491\u0487\u0486\u04f9", "\u055b\u0559\u0548\u057f\u0550\u055d\u054f\u054f\u0500\u0502\u0514\u0515\u0570\u0556\u055d\u054a\u055d\u0513\u0550\u055d\u0552\u055b\u0513\u057f\u0550\u055d\u054f\u054f\u0507", "\u0185\u018c\u019e\u0185\u01ae\u0182\u0189\u0188\u01d1\u01d3\u01c5\u01c4\u01a4", "\u06a1\u06b5\u06b1\u06a5\u06a8\u06b7\u06f8\u06fa\u06ec\u0688\u06ae\u06a5\u06b2\u06a5\u06eb\u06a8\u06a5\u06aa\u06a3\u06eb\u068b\u06a6\u06ae\u06a1\u06a7\u06b0\u06ff\u06ed\u069e", "\u0718\u0717\u0714\u0715\u071e\u0747\u0745\u0753\u0752\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0734\u0719\u0711\u071e\u0718\u070f\u0740", "\u0547\u055c\u0560\u0547\u0541\u055a\u055d\u0554\u050f\u050d\u051b\u051a\u057f\u0559\u0552\u0545\u0552\u051c\u055f\u0552\u055d\u0554\u051c\u0560\u0547\u0541\u055a\u055d\u0554\u0508", "\u028d\u028c\u0297\u028a\u0285\u029a\u02df\u02dd\u02cb\u02ca\u02b5", "\u0293\u0292\u0289\u0294\u029b\u0284\u02bc\u0291\u0291\u02c1\u02c3\u02d5\u02d4\u02ab", "\u0631\u0627\u062f\u0632\u067a\u0678\u066e\u066f\u0610", "\u03f0\u03e6\u03ee\u03f3\u03bb\u03b9\u03af\u03cd\u03ae\u03d1", "\u044f\u0459\u0451\u044c\u0408\u0404\u0406\u0410\u0472\u0411\u046e", "\u07d2\u07c4\u07cc\u07d1\u0799\u079b\u078d\u07ef\u07ec\u078c\u07f3", "\u03da\u03d5\u03d2\u03dd\u03d0\u03d5\u03c6\u03d9\u0380\u0382\u0394\u0395\u03ea"})
public final class Class1131 {
    public static double field4541;
    public static int field4542 = 1275012023;
    public static double field4543;
    public static float field4544;
    public static int field4545 = -665171547;
    public static double field4546 = 0.353462435510317;

    /*
     * WARNING - void declaration
     */
    private static CallSite WWQtcnQIkLdoFN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1131.9XtXXBQ1sXC2J4wg(k2, 515931516));
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
                int a2 = Integer.parseInt(Class1131.9XtXXBQ1sXC2J4wg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1131.9XtXXBQ1sXC2J4wg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1131.9XtXXBQ1sXC2J4wg(k2, 515931516) + " " + l2 + " " + m2);
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
        w\u200e = "CleanerDelay";
        field4541 = Double.longBitsToDouble(4604028888911481089L);
        bz\u200e = "samples";
        field4543 = Double.longBitsToDouble(4597896536582591000L);
        field4544 = Float.intBitsToFloat(1054631622);
    }

    private static String 9XtXXBQ1sXC2J4wg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

