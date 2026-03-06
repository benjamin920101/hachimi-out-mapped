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

@HACHIMI_CLIENT(mv=100, d1={"\u7de7\u7de9\u7de5\u7de3\u7de2\u7de8\u7de9", "\u9a9c\u9a98\u9a99\u9a9b\u9a99\u9a9a\u9a91\u9a9c", "\ucaa5\ucaa5\ucaa7\ucaa0\ucaa3\ucaa3\ucaa3\ucaa2", "\uae51\uae5a\uae5a\uae53\uae54\uae50\uae56\uae5b", "\u6e9f\u6e97\u6e97\u6e9c\u6e9e\u6e9d\u6e99\u6e9c", "\u30b7\u30b7\u30b6\u30b7\u30bb\u30bb\u30ba\u30b7", "\u58d8\u58d8\u58de\u58d8\u58dc\u58df\u58dc\u58d5", "\u518d\u518b\u518c\u518f\u5187\u518f\u518f\u518d", "\udd28\udd2e\udd2a\udd25\udd25\udd28\udd2d\udd2a", "\udd14\udd10\udd16\udd19\udd14\udd10\udd10", "\ue66b\ue66a\ue66c\ue66c\ue66a\ue66b\ue66b\ue66c", "\u6b0a\u6b0a\u6b09\u6b09\u6b0e\u6b0a\u6b0e\u6b0d", "\u7cc9\u7cc8\u7ccc\u7cc2\u7cce\u7cc9\u7cc8\u7cc3", "\u539f\u5392\u5393\u539a\u539a\u539b\u539c\u539a", "\uda34\uda3d\uda30\uda32\uda3d\uda35\uda31\uda35"}, d2={"\u017f\u014f\u0157\u2110\u0122\u0120\u0136\u0152\u0174\u017f\u0168\u017f\u0131\u0172\u017f\u0170\u0179\u0131\u014d\u016a\u016c\u0177\u0170\u0179\u0125\u0137\u0152\u0174\u017f\u0168\u017f\u0131\u0172\u017f\u0170\u0179\u0131\u014d\u016a\u016c\u0177\u0170\u0179\u0125", "\u03b5\u03ea\u03e5\u03e0\u03e7\u03e0\u03fd\u03b7\u03b5\u03b7\u03a1\u03a0\u03df", "\u05e7\u05b2\u05b5\u05b2\u05af\u05e5\u05e7\u05e5\u05f3\u05f2\u058d", "\u0771\u0773\u0762\u0755\u077a\u0777\u0765\u0765\u072a\u0728\u073e\u073f\u075a\u077c\u0777\u0760\u0777\u0739\u077a\u0777\u0778\u0771\u0739\u0755\u077a\u0777\u0765\u0765\u072d", "\u0384\u038d\u039f\u0384\u03af\u0383\u0388\u0389\u03d0\u03d2\u03c4\u03c5\u03a5", "\u0626\u0632\u0636\u0622\u062f\u0630\u067f\u067d\u066b\u060f\u0629\u0622\u0635\u0622\u066c\u062f\u0622\u062d\u0624\u066c\u060c\u0621\u0629\u0626\u0620\u0637\u0678\u066a\u0619", "\u07f0\u07ff\u07fc\u07fd\u07f6\u07af\u07ad\u07bb\u07ba\u07df\u07f9\u07f2\u07e5\u07f2\u07bc\u07ff\u07f2\u07fd\u07f4\u07bc\u07dc\u07f1\u07f9\u07f6\u07f0\u07e7\u07a8", "\u0559\u0542\u057e\u0559\u055f\u0544\u0543\u054a\u0511\u0513\u0505\u0504\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516", "\u06a8\u06a9\u06b2\u06af\u06a0\u06bf\u06fa\u06f8\u06ee\u06ef\u0690", "\u0467\u0466\u047d\u0460\u046f\u0470\u0448\u0465\u0465\u0435\u0437\u0421\u0420\u045f", "\u07ec\u07fa\u07f2\u07ef\u07a7\u07a5\u07b3\u07b2\u07cd", "\u0097\u0081\u0089\u0094\u00dc\u00de\u00c8\u00aa\u00c9\u00b6", "\u053a\u052c\u0524\u0539\u057d\u0571\u0573\u0565\u0507\u0564\u051b", "\u04bb\u04ad\u04a5\u04b8\u04f0\u04f2\u04e4\u0486\u0485\u04e5\u049a", "\u02a8\u02a7\u02a0\u02af\u02a2\u02a7\u02b4\u02ab\u02f2\u02f0\u02e6\u02e7\u0298"})
public final class Class1099 {
    public static float field4444;
    public static double field4445;
    public static int field4446 = 2;
    public static double field4447;
    public static int field4448 = 1926368729;
    public static float field4449;
    public static double field4450 = 0.9178698750993713;

    /*
     * WARNING - void declaration
     */
    private static CallSite sgvciToVVRuYIe(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1099.hNLntIjWlj7GnlVQ(k2, -649470606));
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
                int a2 = Integer.parseInt(Class1099.hNLntIjWlj7GnlVQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1099.hNLntIjWlj7GnlVQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1099.hNLntIjWlj7GnlVQ(k2, -649470606) + " " + l2 + " " + m2);
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
        C\u200e = "kde-open";
        field4444 = Float.intBitsToFloat(1058016566);
        field4447 = Double.longBitsToDouble(4598675823400782002L);
        field4449 = Float.intBitsToFloat(1062473811);
        field4445 = Double.longBitsToDouble(4587692588007253520L);
    }

    private static String hNLntIjWlj7GnlVQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

