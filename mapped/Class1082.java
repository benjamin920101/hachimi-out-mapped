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

@HACHIMI_CLIENT(mv=100, d1={"\udbf7\udbfd\udbfd\udbfd\udbf4\udbfd\udbf1\udbfc", "\u7c73\u7c72\u7c71\u7c73\u7c73\u7c70\u7c73\u7c71", "\u2cde\u2cdd\u2cd9\u2cdd\u2cdd\u2cdf\u2cdf", "\u4189\u4183\u4188\u418c\u418e\u4182\u4182\u4183", "\uc270\uc272\uc273\uc274\uc27b\uc27a\uc271\uc27b", "\ubc7f\ubc7b\ubc75\ubc74\ubc7a\ubc7c\ubc7d\ubc7f", "\u7eae\u7ea9\u7ead\u7ead\u7eac\u7eaf\u7ea0\u7ea1", "\u1973\u1975\u1970\u1975\u1975\u197b\u197b\u1974", "\u1914\u1912\u1919\u1914\u1915\u1913\u1916", "\u3273\u327e\u3271\u3275\u3270\u3276\u3271\u3274", "\u4963\u4961\u4963\u4964\u4965\u4967\u4965\u4960", "\ue579\ue57f\ue578\ue57c\ue576\ue579\ue57f", "\ud520\ud520\ud524\ud520\ud523\ud527\ud523", "\u525d\u525c\u5256\u525f\u525c\u525b\u5259\u525f", "\u98c8\u98c9\u98cb\u98c9\u98ca\u98c9\u98cc\u98c9", "\u50a9\u50a2\u50aa\u50af\u50af\u50ab\u50ab\u50a3"}, d2={"\u0165\u014f\u0172\u2108\u013a\u0138\u012e\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0155\u0172\u0174\u016f\u0168\u0161\u013d\u012f\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0155\u0172\u0174\u016f\u0168\u0161\u013d", "\u025a\u0270\u024c\u2237\u0205\u0207\u0211\u0275\u0253\u0258\u024f\u0258\u0216\u0255\u0258\u0257\u025e\u0216\u026a\u024d\u024b\u0250\u0257\u025e\u0202\u0210\u0275\u0253\u0258\u024f\u0258\u0216\u0255\u0258\u0257\u025e\u0216\u026a\u024d\u024b\u0250\u0257\u025e\u0202", "\u07cd\u0792\u079d\u0798\u079f\u0798\u0785\u07cf\u07cd\u07cf\u07d9\u07d8\u07a7", "\u06a4\u06f1\u06f6\u06f1\u06ec\u06a6\u06a4\u06a6\u06b0\u06b1\u06ce", "\u009c\u009e\u008f\u00b8\u0097\u009a\u0088\u0088\u00c7\u00c5\u00d3\u00d2\u00b7\u0091\u009a\u008d\u009a\u00d4\u0097\u009a\u0095\u009c\u00d4\u00b8\u0097\u009a\u0088\u0088\u00c0", "\u038e\u0387\u0395\u038e\u03a5\u0389\u0382\u0383\u03da\u03d8\u03ce\u03cf\u03af", "\u013d\u0129\u012d\u0139\u0134\u012b\u0164\u0166\u0170\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u0117\u013a\u0132\u013d\u013b\u012c\u0163\u0171\u0102", "\u03a9\u03a6\u03a5\u03a4\u03af\u03f6\u03f4\u03e2\u03e3\u0386\u03a0\u03ab\u03bc\u03ab\u03e5\u03a6\u03ab\u03a4\u03ad\u03e5\u0385\u03a8\u03a0\u03af\u03a9\u03be\u03f1", "\u06f1\u06ea\u06d6\u06f1\u06f7\u06ec\u06eb\u06e2\u06b9\u06bb\u06ad\u06ac\u06c9\u06ef\u06e4\u06f3\u06e4\u06aa\u06e9\u06e4\u06eb\u06e2\u06aa\u06d6\u06f1\u06f7\u06ec\u06eb\u06e2\u06be", "\u0289\u0288\u0293\u028e\u0281\u029e\u02db\u02d9\u02cf\u02ce\u02b1", "\u02ab\u02aa\u02b1\u02ac\u02a3\u02bc\u0284\u02a9\u02a9\u02f9\u02fb\u02ed\u02ec\u0293", "\u050e\u0518\u0510\u050d\u0545\u0547\u0551\u0550\u052f", "\u056b\u057d\u0575\u0568\u0520\u0522\u0534\u0556\u0535\u054a", "\u0223\u0235\u023d\u0220\u0264\u0268\u026a\u027c\u021e\u027d\u0202", "\u0567\u0571\u0579\u0564\u052c\u052e\u0538\u055a\u0559\u0539\u0546", "\u0560\u056f\u0568\u0567\u056a\u056f\u057c\u0563\u053a\u0538\u052e\u052f\u0550"})
public final class Class1082 {
    public static float field4397 = 0.66541123f;
    public static float field4398;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite MCidapyIGQh2b4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1082.QnJyJl2lnr7OLdGd(k2, -1834487342));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1082.QnJyJl2lnr7OLdGd(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1082.QnJyJl2lnr7OLdGd(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1082.QnJyJl2lnr7OLdGd(k2, -1834487342) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 23554 : 23555;
        block7: while (true) {
            switch (n3) {
                case 23555: {
                    n3 = 23553;
                    continue block7;
                }
                case 23554: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String QnJyJl2lnr7OLdGd(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        c\u200e = "PositionAdjust";
        field4398 = Float.intBitsToFloat(1065263903);
        Q\u200e = "Fade-Time";
    }
}

