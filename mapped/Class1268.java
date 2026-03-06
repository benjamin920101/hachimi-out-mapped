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

@HACHIMI_CLIENT(mv=100, d1={"\u9451\u9451\u9457\u9454\u9452\u945c\u945c\u9450", "\ubb26\ubb26\ubb20\ubb22\ubb2d\ubb21\ubb2d\ubb21", "\u215d\u215d\u215e\u2158\u215c\u2158\u2157\u215d", "\u728d\u7286\u728b\u728a\u728f\u728a\u728c\u728c", "\u1a72\u1a75\u1a74\u1a79\u1a77\u1a71\u1a71\u1a76", "\u0899\u089f\u089a\u0891\u089b\u089e\u0891", "\ud9e8\ud9ea\ud9ea\ud9ee\ud9e5\ud9ef\ud9e8\ud9ea", "\uae42\uae4d\uae4c\uae40\uae41\uae40\uae42\uae40", "\ua8f7\ua8fb\ua8f7\ua8f6\ua8f2\ua8f4\ua8f6\ua8f7", "\u7aa7\u7aa5\u7aa0\u7aa4\u7aa7\u7aa4\u7aa7\u7aa7", "\ub12a\ub12d\ub12f\ub126\ub127\ub12e\ub129\ub12e", "\u2f24\u2f22\u2f27\u2f2d\u2f26\u2f20\u2f2d\u2f26", "\u1e14\u1e1e\u1e11\u1e10\u1e15\u1e11\u1e1f\u1e16", "\u94bb\u94bf\u94bf\u94b9\u94bf\u94bc\u94bc\u94ba", "\u9d04\u9d06\u9d06\u9d03\u9d00\u9d04\u9d01", "\udfbe\udfbd\udfbe\udfbc\udfbe\udfbf\udfb3\udfb2"}, d2={"\u01a7\u019e\u019b\u21dc\u01ee\u01ec\u01fa\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9\u01fb\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9", "\u0141\u0178\u017e\u213a\u0108\u010a\u011c\u0178\u015e\u0155\u0142\u0155\u011b\u0158\u0155\u015a\u0153\u011b\u0167\u0140\u0146\u015d\u015a\u0153\u010f\u011d\u0178\u015e\u0155\u0142\u0155\u011b\u0158\u0155\u015a\u0153\u011b\u0167\u0140\u0146\u015d\u015a\u0153\u010f", "\u0587\u05d8\u05d7\u05d2\u05d5\u05d2\u05cf\u0585\u0587\u0585\u0593\u0592\u05ed", "\u02e8\u02bd\u02ba\u02bd\u02a0\u02ea\u02e8\u02ea\u02fc\u02fd\u0282", "\u019b\u0199\u0188\u01bf\u0190\u019d\u018f\u018f\u01c0\u01c2\u01d4\u01d5\u01b0\u0196\u019d\u018a\u019d\u01d3\u0190\u019d\u0192\u019b\u01d3\u01bf\u0190\u019d\u018f\u018f\u01c7", "\u07eb\u07e2\u07f0\u07eb\u07c0\u07ec\u07e7\u07e6\u07bf\u07bd\u07ab\u07aa\u07ca", "\u03b2\u03a6\u03a2\u03b6\u03bb\u03a4\u03eb\u03e9\u03ff\u039b\u03bd\u03b6\u03a1\u03b6\u03f8\u03bb\u03b6\u03b9\u03b0\u03f8\u0398\u03b5\u03bd\u03b2\u03b4\u03a3\u03ec\u03fe\u038d", "\u0001\u000e\r\f\u0007^\\JK.\b\u0003\u0014\u0003M\u000e\u0003\f\u0005M-\u0000\b\u0007\u0001\u0016Y", "\u008c\u0097\u00ab\u008c\u008a\u0091\u0096\u009f\u00c4\u00c6\u00d0\u00d1\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00ab\u008c\u008a\u0091\u0096\u009f\u00c3", "\u047b\u047a\u0461\u047c\u0473\u046c\u0429\u042b\u043d\u043c\u0443", "\u0599\u0598\u0583\u059e\u0591\u058e\u05b6\u059b\u059b\u05cb\u05c9\u05df\u05de\u05a1", "\u02c2\u02d4\u02dc\u02c1\u0289\u028b\u029d\u029c\u02e3", "\u036e\u0378\u0370\u036d\u0325\u0327\u0331\u0353\u0330\u034f", "\u00ad\u00bb\u00b3\u00ae\u00ea\u00e6\u00e4\u00f2\u0090\u00f3\u008c", "\u0415\u0403\u040b\u0416\u045e\u045c\u044a\u0428\u042b\u044b\u0434", "\u05ee\u05e1\u05e6\u05e9\u05e4\u05e1\u05f2\u05ed\u05b4\u05b6\u05a0\u05a1\u05de"})
public final class Class1268 {
    public static double field4957;
    public static double field4958;
    public static float field4959;
    public static int field4960 = -726160338;

    private static String Jabe4IKWcD9QlJaX(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite k0N8ON4IfjakVW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1268.Jabe4IKWcD9QlJaX(k2, -613702707));
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
                int a2 = Integer.parseInt(Class1268.Jabe4IKWcD9QlJaX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1268.Jabe4IKWcD9QlJaX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1268.Jabe4IKWcD9QlJaX(k2, -613702707) + " " + l2 + " " + m2);
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
        d\u200e = "Y";
        m\u200e = "NoServerCrash";
        field4957 = Double.longBitsToDouble(4601898615876135826L);
        field4958 = Double.longBitsToDouble(4601237667291888353L);
        field4959 = Float.intBitsToFloat(1060790578);
    }
}

