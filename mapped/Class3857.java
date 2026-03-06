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
@HACHIMI_CLIENT(mv=100, d1={"\u2b34\u2b37\u2b37\u2b37\u2b35\u2b34\u2b3c\u2b3d", "\u0d5e\u0d5d\u0d54\u0d5c\u0d5e\u0d58\u0d5f\u0d5d", "\ue64b\ue64f\ue648\ue64c\ue64b\ue640\ue641\ue64f", "\u89d6\u89d6\u89d3\u89dd\u89d0\u89d5\u89d5\u89d3", "\ub523\ub526\ub522\ub526\ub520\ub520\ub526\ub52b", "\ua02b\ua021\ua021\ua023\ua02a\ua025\ua022", "\u0fee\u0fef\u0fed\u0feb\u0fe8\u0fe7\u0fe9\u0fe8", "\u4666\u466a\u4664\u4663\u4664\u4667\u4663\u4666", "\ucedf\uced2\ucedf\uced9\ucedd\uced3\ucede\ucede", "\u4b74\u4b7e\u4b76\u4b71\u4b76\u4b70\u4b77\u4b71", "\ubec0\ubec7\ubec1\ubec7\ubec8\ubec6\ubec0\ubec5", "\ue486\ue482\ue484\ue481\ue483\ue480\ue487\ue487", "\u7abf\u7aba\u7abe\u7abc\u7ab9\u7abc\u7ab8\u7ab7", "\u67fa\u67ff\u67f8\u67fe\u67fe\u67fb\u67fb", "\ud32e\ud32c\ud324\ud32c\ud32a\ud32d\ud329\ud32d", "\u97f0\u97f7\u97f1\u97f1\u97f2\u97ff\u97f6"}, d2={"\u0302\u0339\u0316\u2362\u0350\u0352\u0344\u0320\u0306\u030d\u031a\u030d\u0343\u0300\u030d\u0302\u030b\u0343\u033f\u0318\u031e\u0305\u0302\u030b\u0357\u0345\u0320\u0306\u030d\u031a\u030d\u0343\u0300\u030d\u0302\u030b\u0343\u033f\u0318\u031e\u0305\u0302\u030b\u0357", "\u03c4\u03ff\u03eb\u23a4\u0396\u0394\u0382\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391\u0383\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391", "\u07ad\u07f2\u07fd\u07f8\u07ff\u07f8\u07e5\u07af\u07ad\u07af\u07b9\u07b8\u07c7", "\u0438\u046d\u046a\u046d\u0470\u043a\u0438\u043a\u042c\u042d\u0452", "\u0144\u0146\u0157\u0160\u014f\u0142\u0150\u0150\u011f\u011d\u010b\u010a\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0160\u014f\u0142\u0150\u0150\u0118", "\u05e0\u05e9\u05fb\u05e0\u05cb\u05e7\u05ec\u05ed\u05b4\u05b6\u05a0\u05a1\u05c1", "\u03b0\u03a4\u03a0\u03b4\u03b9\u03a6\u03e9\u03eb\u03fd\u0399\u03bf\u03b4\u03a3\u03b4\u03fa\u03b9\u03b4\u03bb\u03b2\u03fa\u039a\u03b7\u03bf\u03b0\u03b6\u03a1\u03ee\u03fc\u038f", "\u009a\u0095\u0096\u0097\u009c\u00c5\u00c7\u00d1\u00d0\u00b5\u0093\u0098\u008f\u0098\u00d6\u0095\u0098\u0097\u009e\u00d6\u00b6\u009b\u0093\u009c\u009a\u008d\u00c2", "\u0703\u0718\u0724\u0703\u0705\u071e\u0719\u0710\u074b\u0749\u075f\u075e\u073b\u071d\u0716\u0701\u0716\u0758\u071b\u0716\u0719\u0710\u0758\u0724\u0703\u0705\u071e\u0719\u0710\u074c", "\u0638\u0639\u0622\u063f\u0630\u062f\u066a\u0668\u067e\u067f\u0600", "\u07da\u07db\u07c0\u07dd\u07d2\u07cd\u07f5\u07d8\u07d8\u0788\u078a\u079c\u079d\u07e2", "\u00dc\u00ca\u00c2\u00df\u0097\u0095\u0083\u0082\u00fd", "\u0172\u0164\u016c\u0171\u0139\u013b\u012d\u014f\u012c\u0153", "\u06fd\u06eb\u06e3\u06fe\u06ba\u06b6\u06b4\u06a2\u06c0\u06a3\u06dc", "\u06f5\u06e3\u06eb\u06f6\u06be\u06bc\u06aa\u06c8\u06cb\u06ab\u06d4", "\u0374\u037b\u037c\u0373\u037e\u037b\u0368\u0377\u032e\u032c\u033a\u033b\u0344"})
public final class Class3857 {
    public static float field8752;
    public static float field8753 = 0.80117136f;
    public static double field8754;
    public static double field8755;
    public static float field8756;

    private static String tfLZq4sN4hvNGiou(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 4vZd7q4XoP6VXg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3857.tfLZq4sN4hvNGiou(k2, 1209940969));
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
                int a2 = Integer.parseInt(Class3857.tfLZq4sN4hvNGiou(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3857.tfLZq4sN4hvNGiou(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3857.tfLZq4sN4hvNGiou(k2, 1209940969) + " " + l2 + " " + m2);
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
        field8755 = Double.longBitsToDouble(4606366758798852335L);
        field8752 = Float.intBitsToFloat(1064606367);
        field8754 = Double.longBitsToDouble(-4655461006934278144L);
        field8756 = Float.intBitsToFloat(1053803688);
        as\u200e = "Grim";
        ba\u200e = "Mode";
    }
}

