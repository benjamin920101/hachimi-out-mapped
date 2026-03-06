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
@HACHIMI_CLIENT(mv=100, d1={"\u7de7\u7dea\u7de3\u7de7\u7deb\u7dea\u7de6\u7de0", "\u1e75\u1e77\u1e70\u1e7f\u1e74\u1e76\u1e71\u1e72", "\u0eed\u0ee8\u0eed\u0ee7\u0eed\u0eef\u0eed\u0eed", "\uca2d\uca22\uca2b\uca2b\uca2c\uca22\uca2f", "\u78b7\u78ba\u78b3\u78b7\u78ba\u78b6\u78ba\u78b0", "\u183f\u183d\u183e\u1831\u1830\u1831\u1839", "\ue58f\ue58e\ue58e\ue58e\ue58a\ue586\ue58d\ue58d", "\u273c\u2738\u273f\u273d\u273a\u273c\u273c", "\u8863\u8866\u886e\u8865\u8861\u8866\u8864\u8865", "\u0a3e\u0a39\u0a38\u0a35\u0a3e\u0a35\u0a3a\u0a34", "\u9a87\u9a8c\u9a87\u9a8d\u9a80\u9a87\u9a85\u9a86", "\u1524\u1522\u1526\u1520\u1520\u1522\u1524\u1520", "\ue1b8\ue1bd\ue1bd\ue1b8\ue1b9\ue1b0\ue1be\ue1bd", "\u88b7\u88bd\u88b2\u88b1\u88b3\u88b5\u88b4", "\u2189\u2185\u218a\u2184\u2188\u218b\u2189\u218c", "\u5f85\u5f81\u5f84\u5f80\u5f8b\u5f83\u5f81\u5f83", "\u749d\u7499\u7495\u749f\u749d\u7499\u7494\u749b", "\uc2ea\uc2ec\uc2ea\uc2e9\uc2ee\uc2ef\uc2eb\uc2ec", "\u3743\u374f\u3745\u374f\u3744\u3743\u3744\u3741"}, d2={"\u066c\u0646\u064c\u2601\u0633\u0631\u0627\u0643\u0665\u066e\u0679\u066e\u0620\u0663\u066e\u0661\u0668\u0620\u065c\u067b\u067d\u0666\u0661\u0668\u0634\u0626\u0643\u0665\u066e\u0679\u066e\u0620\u0663\u066e\u0661\u0668\u0620\u065c\u067b\u067d\u0666\u0661\u0668\u0634", "\u0147\u016d\u0160\u212a\u0118\u011a\u010c\u0168\u014e\u0145\u0152\u0145\u010b\u0148\u0145\u014a\u0143\u010b\u0177\u0150\u0156\u014d\u014a\u0143\u011f\u010d\u0168\u014e\u0145\u0152\u0145\u010b\u0148\u0145\u014a\u0143\u010b\u0177\u0150\u0156\u014d\u014a\u0143\u011f", "\u032d\u0307\u030b\u2340\u0372\u0370\u0366\u0302\u0324\u032f\u0338\u032f\u0361\u0322\u032f\u0320\u0329\u0361\u031d\u033a\u033c\u0327\u0320\u0329\u0375\u0367\u0302\u0324\u032f\u0338\u032f\u0361\u0322\u032f\u0320\u0329\u0361\u031d\u033a\u033c\u0327\u0320\u0329\u0375", "\u0254\u027e\u0271\u2239\u020b\u0209\u021f\u027b\u025d\u0256\u0241\u0256\u0218\u025b\u0256\u0259\u0250\u0218\u0264\u0243\u0245\u025e\u0259\u0250\u020c\u021e\u027b\u025d\u0256\u0241\u0256\u0218\u025b\u0256\u0259\u0250\u0218\u0264\u0243\u0245\u025e\u0259\u0250\u020c", "\u06ae\u0684\u068a\u26c3\u06f1\u06f3\u06e5\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6\u06e4\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6", "B\u001d\u0012\u0017\u0010\u0017\n@B@VW(", "\u0550\u0505\u0502\u0505\u0518\u0552\u0550\u0552\u0544\u0545\u053a", "\u0150\u0152\u0143\u0174\u015b\u0156\u0144\u0144\u010b\u0109\u011f\u011e\u017b\u015d\u0156\u0141\u0156\u0118\u015b\u0156\u0159\u0150\u0118\u0174\u015b\u0156\u0144\u0144\u010c", "\u03a8\u03a1\u03b3\u03a8\u0383\u03af\u03a4\u03a5\u03fc\u03fe\u03e8\u03e9\u0389", "\u01f6\u01e2\u01e6\u01f2\u01ff\u01e0\u01af\u01ad\u01bb\u01df\u01f9\u01f2\u01e5\u01f2\u01bc\u01ff\u01f2\u01fd\u01f4\u01bc\u01dc\u01f1\u01f9\u01f6\u01f0\u01e7\u01a8\u01ba\u01c9", "\u0368\u0367\u0364\u0365\u036e\u0337\u0335\u0323\u0322\u0347\u0361\u036a\u037d\u036a\u0324\u0367\u036a\u0365\u036c\u0324\u0344\u0369\u0361\u036e\u0368\u037f\u0330", "\u0408\u0413\u042f\u0408\u040e\u0415\u0412\u041b\u0440\u0442\u0454\u0455\u0430\u0416\u041d\u040a\u041d\u0453\u0410\u041d\u0412\u041b\u0453\u042f\u0408\u040e\u0415\u0412\u041b\u0447", "\u030f\u030e\u0315\u0308\u0307\u0318\u035d\u035f\u0349\u0348\u0337", "\u0270\u0271\u026a\u0277\u0278\u0267\u025f\u0272\u0272\u0222\u0220\u0236\u0237\u0248", "I_WJ\u0002\u0000\u0016\u0017h", "\u0301\u0317\u031f\u0302\u034a\u0348\u035e\u033c\u035f\u0320", "\u047c\u046a\u0462\u047f\u043b\u0437\u0435\u0423\u0441\u0422\u045d", "\u074a\u075c\u0754\u0749\u0701\u0703\u0715\u0777\u0774\u0714\u076b", "\u0318\u0317\u0310\u031f\u0312\u0317\u0304\u031b\u0342\u0340\u0356\u0357\u0328"})
public final class Class1690 {
    public static int field6267 = 1818078201;
    public static int field6268 = 1975970491;

    private static String 8XTRdsSnFUAn4I22(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        Z\u200e = "GroundOnly";
        ai\u200e = "How much vertical knock-back to take";
        ax\u200e = "";
        aD\u200e = "Selection";
        aK\u200e = "Disabler";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite UvOhb83r9aR4uw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1690.8XTRdsSnFUAn4I22(k2, -1931489706));
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
                int a2 = Integer.parseInt(Class1690.8XTRdsSnFUAn4I22(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1690.8XTRdsSnFUAn4I22(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1690.8XTRdsSnFUAn4I22(k2, -1931489706) + " " + l2 + " " + m2);
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

