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

@HACHIMI_CLIENT(mv=100, d1={"\u2212\u2217\u2214\u2212\u221a\u2210\u2212\u221b", "\uc2ab\uc2a9\uc2a9\uc2a7\uc2ad\uc2a6\uc2aa\uc2ab", "\u6b02\u6b05\u6b00\u6b01\u6b07\u6b0c\u6b06\u6b06", "\u8f69\u8f6b\u8f6a\u8f6a\u8f6c\u8f69\u8f69\u8f62", "\u604a\u604f\u604e\u604d\u6041\u6049\u604c\u604c", "\u6b09\u6b0e\u6b0b\u6b0f\u6b09\u6b0c\u6b0b\u6b0b", "\ud638\ud639\ud636\ud63b\ud637\ud63c", "\u6b95\u6b92\u6b94\u6b93\u6b97\u6b97\u6b91\u6b92", "\u300f\u300c\u3003\u3008\u300d\u300d\u300a\u3003", "\u3325\u3322\u3327\u3320\u332a\u3327\u3324\u3320", "\uaf64\uaf66\uaf66\uaf63\uaf60\uaf66\uaf65\uaf6e", "\u8209\u820c\u820d\u8207\u820d\u8207\u8208\u8208", "\u6284\u6280\u6287\u6287\u6287\u6284\u6285\u6280", "\u6baf\u6bac\u6bae\u6ba4\u6bae\u6ba9\u6bac\u6ba8", "\u2509\u250a\u2507\u250d\u250f\u250f\u250d\u250f", "\uc330\uc336\uc337\uc330\uc338\uc333\uc332\uc337", "\uaf2d\uaf2e\uaf26\uaf27\uaf2b\uaf2d\uaf2b\uaf28"}, d2={"KDQ\u2029\u001b\u0019\u000fkMFQF\bKFI@\btSUNI@\u001c\u000ekMFQF\bKFI@\btSUNI@\u001c", "\u0463\u046c\u0478\u2401\u0433\u0431\u0427\u0443\u0465\u046e\u0479\u046e\u0420\u0463\u046e\u0461\u0468\u0420\u045c\u047b\u047d\u0466\u0461\u0468\u0434\u0426\u0443\u0465\u046e\u0479\u046e\u0420\u0463\u046e\u0461\u0468\u0420\u045c\u047b\u047d\u0466\u0461\u0468\u0434", "\u0134\u013b\u0120\u2156\u0164\u0166\u0170\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u010b\u012c\u012a\u0131\u0136\u013f\u0163\u0171\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u010b\u012c\u012a\u0131\u0136\u013f\u0163", "\u0532\u056d\u0562\u0567\u0560\u0567\u057a\u0530\u0532\u0530\u0526\u0527\u0558", "\u06a6\u06f3\u06f4\u06f3\u06ee\u06a4\u06a6\u06a4\u06b2\u06b3\u06cc", "\u056f\u056d\u057c\u054b\u0564\u0569\u057b\u057b\u0534\u0536\u0520\u0521\u0544\u0562\u0569\u057e\u0569\u0527\u0564\u0569\u0566\u056f\u0527\u054b\u0564\u0569\u057b\u057b\u0533", "\u0300\u0309\u031b\u0300\u032b\u0307\u030c\u030d\u0354\u0356\u0340\u0341\u0321", "\u0323\u0337\u0333\u0327\u032a\u0335\u037a\u0378\u036e\u030a\u032c\u0327\u0330\u0327\u0369\u032a\u0327\u0328\u0321\u0369\u0309\u0324\u032c\u0323\u0325\u0332\u037d\u036f\u031c", "\u01d5\u01da\u01d9\u01d8\u01d3\u018a\u0188\u019e\u019f\u01fa\u01dc\u01d7\u01c0\u01d7\u0199\u01da\u01d7\u01d8\u01d1\u0199\u01f9\u01d4\u01dc\u01d3\u01d5\u01c2\u018d", "\u02b7\u02ac\u0290\u02b7\u02b1\u02aa\u02ad\u02a4\u02ff\u02fd\u02eb\u02ea\u028f\u02a9\u02a2\u02b5\u02a2\u02ec\u02af\u02a2\u02ad\u02a4\u02ec\u0290\u02b7\u02b1\u02aa\u02ad\u02a4\u02f8", "\u0616\u0617\u060c\u0611\u061e\u0601\u0644\u0646\u0650\u0651\u062e", "\u0116\u0117\u010c\u0111\u011e\u0101\u0139\u0114\u0114\u0144\u0146\u0150\u0151\u012e", "\u05e3\u05f5\u05fd\u05e0\u05a8\u05aa\u05bc\u05bd\u05c2", "\u04d6\u04c0\u04c8\u04d5\u049d\u049f\u0489\u04eb\u0488\u04f7", "\u0707\u0711\u0719\u0704\u0740\u074c\u074e\u0758\u073a\u0759\u0726", "\u0283\u0295\u029d\u0280\u02c8\u02ca\u02dc\u02be\u02bd\u02dd\u02a2", "\u00f9\u00f6\u00f1\u00fe\u00f3\u00f6\u00e5\u00fa\u00a3\u00a1\u00b7\u00b6\u00c9"})
public final class Class1534 {
    public static double field5776 = Double.longBitsToDouble(4602678819172646912L);
    public static double field5777;
    public static int field5778 = 1;
    public static float field5779;

    private static String h6MAexCpVabWN1kF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5779 = Float.intBitsToFloat(1041822464);
        field5777 = Double.longBitsToDouble(4606640043534822113L);
        U\u200e = "ELASTIC_IN";
        bg\u200e = "Percent";
        bE\u200e = "IgnoreTamed";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite qiNN7QaQl5Ws76(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1534.h6MAexCpVabWN1kF(k2, 1754478141));
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
                int a2 = Integer.parseInt(Class1534.h6MAexCpVabWN1kF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1534.h6MAexCpVabWN1kF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1534.h6MAexCpVabWN1kF(k2, 1754478141) + " " + l2 + " " + m2);
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

