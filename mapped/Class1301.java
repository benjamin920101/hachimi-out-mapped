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

@HACHIMI_CLIENT(mv=100, d1={"\u8cb5\u8cb6\u8cb7\u8cb1\u8cb7\u8cbe\u8cb7\u8cb0", "\u11f4\u11f3\u11fe\u11f3\u11f4\u11f4\u11fe\u11fe", "\u674d\u6749\u674d\u674e\u6747\u674f\u6749\u6748", "\u9c8b\u9c8a\u9c8e\u9c89\u9c8f\u9c8f\u9c81\u9c81", "\u5154\u5155\u5157\u5157\u515a\u5156\u5155\u5150", "\u36e4\u36e0\u36ee\u36e7\u36e2\u36e0\u36ee\u36ee", "\u9b0b\u9b0f\u9b0f\u9b0c\u9b0a\u9b0f\u9b09\u9b04", "\ud580\ud582\ud58a\ud58b\ud58b\ud584\ud587\ud584", "\u319c\u3194\u319f\u3199\u3194\u319b\u319f\u3195", "\u49df\u49d3\u49dc\u49d2\u49dd\u49da\u49db\u49dd", "\u16bc\u16bc\u16b9\u16b9\u16bd\u16ba\u16bc\u16ba", "\u723a\u7239\u723d\u723f\u7239\u723a\u723b\u7238", "\ud060\ud06d\ud063\ud06c\ud067\ud060\ud066\ud063", "\u9533\u9530\u9533\u9538\u9538\u9538\u9538\u9535", "\u96f4\u96f7\u96ff\u96f3\u96f3\u96f3\u96f1\u96f2", "\u6d74\u6d70\u6d75\u6d79\u6d74\u6d73\u6d70\u6d76", "\ue503\ue504\ue507\ue507\ue509\ue500\ue509\ue502"}, d2={"\u0445\u047c\u0476\u242a\u0418\u041a\u040c\u0468\u044e\u0445\u0452\u0445\u040b\u0448\u0445\u044a\u0443\u040b\u0477\u0450\u0456\u044d\u044a\u0443\u041f\u040d\u0468\u044e\u0445\u0452\u0445\u040b\u0448\u0445\u044a\u0443\u040b\u0477\u0450\u0456\u044d\u044a\u0443\u041f", "-\u0014\u001f\u2042prd\u0000&-:-c -\"+c\u001f8>%\"+we\u0000&-:-c -\"+c\u001f8>%\"+w", "\u0162\u015b\u0157\u210d\u013f\u013d\u012b\u014f\u0169\u0162\u0175\u0162\u012c\u016f\u0162\u016d\u0164\u012c\u0150\u0177\u0171\u016a\u016d\u0164\u0138\u012a\u014f\u0169\u0162\u0175\u0162\u012c\u016f\u0162\u016d\u0164\u012c\u0150\u0177\u0171\u016a\u016d\u0164\u0138", "\u01fd\u01a2\u01ad\u01a8\u01af\u01a8\u01b5\u01ff\u01fd\u01ff\u01e9\u01e8\u0197", "\u00c3\u0096\u0091\u0096\u008b\u00c1\u00c3\u00c1\u00d7\u00d6\u00a9", "\u0131\u0133\u0122\u0115\u013a\u0137\u0125\u0125\u016a\u0168\u017e\u017f\u011a\u013c\u0137\u0120\u0137\u0179\u013a\u0137\u0138\u0131\u0179\u0115\u013a\u0137\u0125\u0125\u016d", "\u0429\u0420\u0432\u0429\u0402\u042e\u0425\u0424\u047d\u047f\u0469\u0468\u0408", "\u0350\u0344\u0340\u0354\u0359\u0346\u0309\u030b\u031d\u0379\u035f\u0354\u0343\u0354\u031a\u0359\u0354\u035b\u0352\u031a\u037a\u0357\u035f\u0350\u0356\u0341\u030e\u031c\u036f", "\u0295\u029a\u0299\u0298\u0293\u02ca\u02c8\u02de\u02df\u02ba\u029c\u0297\u0280\u0297\u02d9\u029a\u0297\u0298\u0291\u02d9\u02b9\u0294\u029c\u0293\u0295\u0282\u02cd", "\u04fd\u04e6\u04da\u04fd\u04fb\u04e0\u04e7\u04ee\u04b5\u04b7\u04a1\u04a0\u04c5\u04e3\u04e8\u04ff\u04e8\u04a6\u04e5\u04e8\u04e7\u04ee\u04a6\u04da\u04fd\u04fb\u04e0\u04e7\u04ee\u04b2", "\u0089\u0088\u0093\u008e\u0081\u009e\u00db\u00d9\u00cf\u00ce\u00b1", "\u031a\u031b\u0300\u031d\u0312\u030d\u0335\u0318\u0318\u0348\u034a\u035c\u035d\u0322", "\u04af\u04b9\u04b1\u04ac\u04e4\u04e6\u04f0\u04f1\u048e", "\u05f4\u05e2\u05ea\u05f7\u05bf\u05bd\u05ab\u05c9\u05aa\u05d5", "\u0274\u0262\u026a\u0277\u0233\u023f\u023d\u022b\u0249\u022a\u0255", "J\\TI\u0001\u0003\u0015wt\u0014k", "\u053f\u0530\u0537\u0538\u0535\u0530\u0523\u053c\u0565\u0567\u0571\u0570\u050f"})
public final class Class1301 {
    public static double field5058 = 0.5419619370530259;
    public static int field5059 = 146929028;
    public static double field5060 = Double.longBitsToDouble(4602615544441213060L);
    public static String field5061;

    /*
     * WARNING - void declaration
     */
    private static CallSite LadoJII6KAZ2lW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1301.bnz4ayqNHYvQTNs1(k2, 928294602));
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
                int a2 = Integer.parseInt(Class1301.bnz4ayqNHYvQTNs1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1301.bnz4ayqNHYvQTNs1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1301.bnz4ayqNHYvQTNs1(k2, 928294602) + " " + l2 + " " + m2);
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
        aW\u200e = "glow";
        bp\u200e = "Will try and use an axe to break target shields";
        field5061 = "Initializing BreakManager ...";
    }

    private static String bnz4ayqNHYvQTNs1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

