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
@HACHIMI_CLIENT(mv=100, d1={"\u14a7\u14a7\u14a1\u14a4\u14a2\u14a8\u14a6\u14a9", "\u0c2d\u0c2a\u0c21\u0c2c\u0c21\u0c2a\u0c2e\u0c21", "\ua342\ua345\ua340\ua341\ua349\ua345\ua345\ua344", "\u45c6\u45c0\u45c5\u45c5\u45ce\u45cf\u45cf\u45c3", "\u2612\u2616\u2614\u2616\u2611\u2611\u261e", "\ubdf1\ubdf3\ubdf4\ubdf0\ubdf0\ubdf2\ubdf6\ubdfd", "\u459b\u459e\u459c\u459c\u4592\u4592\u459f\u459c", "\u931d\u9311\u931b\u9318\u9310\u931b\u9311\u931f", "\u7b44\u7b43\u7b43\u7b42\u7b49\u7b45\u7b43\u7b49", "\uaf8f\uaf8f\uaf8e\uaf8c\uaf8a\uaf8e\uaf8f", "\u22a9\u22ac\u22ac\u22a3\u22af\u22a3\u22ad\u22aa", "\u4272\u4270\u4272\u4272\u427a\u4276\u4273\u4270", "\u110f\u1103\u110b\u110d\u110d\u1102\u110a\u110b", "\u7173\u7171\u7175\u7170\u7175\u7173\u7172\u7176", "\uca90\uca92\uca94\uca90\uca95\uca92\uca9a\uca9a", "\u6a0e\u6a00\u6a00\u6a09\u6a0d\u6a0d\u6a0a\u6a0f", "\u8a7d\u8a7f\u8a7b\u8a73\u8a7b\u8a7b\u8a79"}, d2={"\u01dd\u01e5\u01d1\u21bb\u0189\u018b\u019d\u01f9\u01df\u01d4\u01c3\u01d4\u019a\u01d9\u01d4\u01db\u01d2\u019a\u01e6\u01c1\u01c7\u01dc\u01db\u01d2\u018e\u019c\u01f9\u01df\u01d4\u01c3\u01d4\u019a\u01d9\u01d4\u01db\u01d2\u019a\u01e6\u01c1\u01c7\u01dc\u01db\u01d2\u018e", "\u0467\u045f\u046a\u2401\u0433\u0431\u0427\u0443\u0465\u046e\u0479\u046e\u0420\u0463\u046e\u0461\u0468\u0420\u045c\u047b\u047d\u0466\u0461\u0468\u0434\u0426\u0443\u0465\u046e\u0479\u046e\u0420\u0463\u046e\u0461\u0468\u0420\u045c\u047b\u047d\u0466\u0461\u0468\u0434", "\u01ce\u01f6\u01c0\u21a8\u019a\u0198\u018e\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d\u018f\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d", "\u0693\u06cc\u06c3\u06c6\u06c1\u06c6\u06db\u0691\u0693\u0691\u0687\u0686\u06f9", "\u0647\u0612\u0615\u0612\u060f\u0645\u0647\u0645\u0653\u0652\u062d", "\u03ea\u03e8\u03f9\u03ce\u03e1\u03ec\u03fe\u03fe\u03b1\u03b3\u03a5\u03a4\u03c1\u03e7\u03ec\u03fb\u03ec\u03a2\u03e1\u03ec\u03e3\u03ea\u03a2\u03ce\u03e1\u03ec\u03fe\u03fe\u03b6", "\u03a5\u03ac\u03be\u03a5\u038e\u03a2\u03a9\u03a8\u03f1\u03f3\u03e5\u03e4\u0384", "\u05e1\u05f5\u05f1\u05e5\u05e8\u05f7\u05b8\u05ba\u05ac\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05cb\u05e6\u05ee\u05e1\u05e7\u05f0\u05bf\u05ad\u05de", "\\SPQZ\u0003\u0001\u0017\u0016sU^I^\u0010S^QX\u0010p]UZ\\K\u0004", "\u04e9\u04f2\u04ce\u04e9\u04ef\u04f4\u04f3\u04fa\u04a1\u04a3\u04b5\u04b4\u04d1\u04f7\u04fc\u04eb\u04fc\u04b2\u04f1\u04fc\u04f3\u04fa\u04b2\u04ce\u04e9\u04ef\u04f4\u04f3\u04fa\u04a6", "\u0455\u0454\u044f\u0452\u045d\u0442\u0407\u0405\u0413\u0412\u046d", "\u04a6\u04a7\u04bc\u04a1\u04ae\u04b1\u0489\u04a4\u04a4\u04f4\u04f6\u04e0\u04e1\u049e", "\u07f0\u07e6\u07ee\u07f3\u07bb\u07b9\u07af\u07ae\u07d1", "\u00df\u00c9\u00c1\u00dc\u0094\u0096\u0080\u00e2\u0081\u00fe", "\u0114\u0102\u010a\u0117\u0153\u015f\u015d\u014b\u0129\u014a\u0135", "\u0376\u0360\u0368\u0375\u033d\u033f\u0329\u034b\u0348\u0328\u0357", "\u0113\u011c\u011b\u0114\u0119\u011c\u010f\u0110\u0149\u014b\u015d\u015c\u0123"})
public final class Class3563 {
    public static float field7911;
    public static double field7912;
    public static float field7913;
    public static double field7914;
    public static float field7915;

    static {
        field7912 = Double.longBitsToDouble(4604416493889176112L);
        field7913 = Float.intBitsToFloat(-1069547520);
        field7911 = Float.intBitsToFloat(1059769676);
        ad\u200e = "Modifies the swinging hand";
        field7914 = Double.longBitsToDouble(4602687627090181091L);
        field7915 = Float.intBitsToFloat(1059566669);
        bA\u200e = "Time of waiting for fade";
        bP\u200e = "Range to break crystals through walls";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite hJB9vFvqzBwllA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3563.6oInm0o7AFUwWI04(k2, -2139601323));
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
                int a2 = Integer.parseInt(Class3563.6oInm0o7AFUwWI04(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3563.6oInm0o7AFUwWI04(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3563.6oInm0o7AFUwWI04(k2, -2139601323) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 6oInm0o7AFUwWI04(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

