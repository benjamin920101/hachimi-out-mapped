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

@HACHIMI_CLIENT(mv=100, d1={"\u227c\u227e\u2279\u2278\u227d\u2270\u2271\u227c", "\ue8af\ue8ac\ue8aa\ue8ad\ue8ae\ue8ae\ue8a4\ue8a5", "\uba62\uba63\uba66\uba66\uba63\uba6d\uba6d\uba62", "\u85f6\u85f5\u85f2\u85f3\u85f0\u85f3\u85f0\u85f2", "\u9662\u966b\u9662\u9667\u9660\u966b\u9662\u9662", "\ua7cb\ua7c2\ua7ce\ua7ce\ua7cc\ua7cb\ua7cb\ua7cf", "\uc3b7\uc3b6\uc3b4\uc3b7\uc3b3\uc3b2", "\u9aac\u9aac\u9aaa\u9aa8\u9aa2\u9aad\u9aa9\u9aae", "\ubc83\ubc85\ubc89\ubc83\ubc85\ubc81\ubc80\ubc86", "\u5e3c\u5e3e\u5e3e\u5e3c\u5e3e\u5e3d\u5e3e\u5e32", "\u7632\u7639\u763c\u7632\u763b\u7633\u7632", "\u3a62\u3a63\u3a64\u3a62\u3a60\u3a68\u3a62\u3a69", "\u7638\u7636\u763e\u763a\u763a\u763d\u763f\u7638", "\u98de\u98da\u98d8\u98df\u98dd\u98d9\u98db\u98dd"}, d2={"\u057d\u0522\u052d\u0528\u052f\u0528\u0535\u057f\u057d\u057f\u0569\u0568\u0517", "\u039f\u03ca\u03cd\u03ca\u03d7\u039d\u039f\u039d\u038b\u038a\u03f5", "\u02b6\u02b4\u02a5\u0292\u02bd\u02b0\u02a2\u02a2\u02ed\u02ef\u02f9\u02f8\u029d\u02bb\u02b0\u02a7\u02b0\u02fe\u02bd\u02b0\u02bf\u02b6\u02fe\u0292\u02bd\u02b0\u02a2\u02a2\u02ea", "\u0352\u035b\u0349\u0352\u0379\u0355\u035e\u035f\u0306\u0304\u0312\u0313\u0373", "RFBV[D\u000b\t\u001f{]VAV\u0018[VYP\u0018xU]RTC\f\u001em", "\\SPQZ\u0003\u0001\u0017\u0016sU^I^\u0010S^QX\u0010p]UZ\\K\u0004", "\u0106\u011d\u0121\u0106\u0100\u011b\u011c\u0115\u014e\u014c\u015a\u015b\u013e\u0118\u0113\u0104\u0113\u015d\u011e\u0113\u011c\u0115\u015d\u0121\u0106\u0100\u011b\u011c\u0115\u0149", "bcxeju02$%Z", "\u0487\u0486\u049d\u0480\u048f\u0490\u04a8\u0485\u0485\u04d5\u04d7\u04c1\u04c0\u04bf", "\u02eb\u02fd\u02f5\u02e8\u02a0\u02a2\u02b4\u02b5\u02ca", "\u040f\u0419\u0411\u040c\u0444\u0446\u0450\u0432\u0451\u042e", "\u0308\u031e\u0316\u030b\u034f\u0343\u0341\u0357\u0335\u0356\u0329", "\u03ad\u03bb\u03b3\u03ae\u03e6\u03e4\u03f2\u0390\u0393\u03f3\u038c", "\u0679\u0676\u0671\u067e\u0673\u0676\u0665\u067a\u0623\u0621\u0637\u0636\u0649"})
public final class Class1633 {
    public static long field6077 = 0xFFFFFFFFL;
    public static int field6078 = -1396690515;
    public static float field6079 = Float.intBitsToFloat(1062498051);
    public static int field6080 = 2137779036;

    /*
     * WARNING - void declaration
     */
    private static CallSite cItjWqtoSFisiy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1633.GblM642Q9JLIbqWy(k2, -672966735));
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
                int a2 = Integer.parseInt(Class1633.GblM642Q9JLIbqWy(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1633.GblM642Q9JLIbqWy(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1633.GblM642Q9JLIbqWy(k2, -672966735) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String GblM642Q9JLIbqWy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

