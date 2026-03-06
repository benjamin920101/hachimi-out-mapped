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

@HACHIMI_CLIENT(mv=100, d1={"\ub79c\ub790\ub79e\ub79b\ub79a\ub798\ub79a\ub798", "\ucfa7\ucfac\ucfa0\ucfa4\ucfa3\ucfac\ucfa0\ucfac", "\u39e2\u39e9\u39e1\u39e3\u39e8\u39e1\u39e7\u39e3", "\ucc66\ucc60\ucc66\ucc63\ucc65\ucc62", "\u3b76\u3b75\u3b74\u3b70\u3b78\u3b77\u3b75\u3b74", "\u0ae8\u0aeb\u0ae5\u0aef\u0aed\u0aec\u0ae8\u0ae4", "\u0394\u0394\u0397\u0390\u0394\u0392\u039b\u039b", "\u6cff\u6cfe\u6cf9\u6cf8\u6cf9\u6cf5\u6cfb\u6cf8", "\u4715\u4715\u4713\u4713\u4714\u4710\u4715\u4714", "\u134f\u134e\u1345\u1348\u134c\u134c\u134c\u1345", "\ub93c\ub931\ub93d\ub93b\ub931\ub93a\ub93b\ub93d", "\u5d6f\u5d6e\u5d6d\u5d6c\u5d6f\u5d64\u5d6d\u5d6e", "\uca91\uca90\uca93\uca96\uca91\uca96\uca94\uca96", "\u6388\u6383\u6382\u638c\u638e\u6383\u638b\u6382", "\u18b8\u18b8\u18bd\u18bd\u18b8\u18bb\u18bb\u18bc"}, d2={"\u06db\u06c9\u06f6\u26be\u068c\u068e\u0698\u06fc\u06da\u06d1\u06c6\u06d1\u069f\u06dc\u06d1\u06de\u06d7\u069f\u06e3\u06c4\u06c2\u06d9\u06de\u06d7\u068b\u0699\u06fc\u06da\u06d1\u06c6\u06d1\u069f\u06dc\u06d1\u06de\u06d7\u069f\u06e3\u06c4\u06c2\u06d9\u06de\u06d7\u068b", "\u00ef\u00b0\u00bf\u00ba\u00bd\u00ba\u00a7\u00ed\u00ef\u00ed\u00fb\u00fa\u0085", "\u04b9\u04ec\u04eb\u04ec\u04f1\u04bb\u04b9\u04bb\u04ad\u04ac\u04d3", "?=,\u001b49++dfpq\u001429.9w496?w\u001b49++c", "\u038c\u0385\u0397\u038c\u03a7\u038b\u0380\u0381\u03d8\u03da\u03cc\u03cd\u03ad", "\u0743\u0757\u0753\u0747\u074a\u0755\u071a\u0718\u070e\u076a\u074c\u0747\u0750\u0747\u0709\u074a\u0747\u0748\u0741\u0709\u0769\u0744\u074c\u0743\u0745\u0752\u071d\u070f\u077c", "\u077b\u0774\u0777\u0776\u077d\u0724\u0726\u0730\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u0757\u077a\u0772\u077d\u077b\u076c\u0723", "\u0284\u029f\u02a3\u0284\u0282\u0299\u029e\u0297\u02cc\u02ce\u02d8\u02d9\u02bc\u029a\u0291\u0286\u0291\u02df\u029c\u0291\u029e\u0297\u02df\u02a3\u0284\u0282\u0299\u029e\u0297\u02cb", "\u00d1\u00d0\u00cb\u00d6\u00d9\u00c6\u0083\u0081\u0097\u0096\u00e9", "\u012b\u012a\u0131\u012c\u0123\u013c\u0104\u0129\u0129\u0179\u017b\u016d\u016c\u0113", "\u02e8\u02fe\u02f6\u02eb\u02a3\u02a1\u02b7\u02b6\u02c9", "\u0189\u019f\u0197\u018a\u01c2\u01c0\u01d6\u01b4\u01d7\u01a8", "\u00e8\u00fe\u00f6\u00eb\u00af\u00a3\u00a1\u00b7\u00d5\u00b6\u00c9", "\u0542\u0554\u055c\u0541\u0509\u050b\u051d\u057f\u057c\u051c\u0563", "\u0430\u043f\u0438\u0437\u043a\u043f\u042c\u0433\u046a\u0468\u047e\u047f\u0400"})
public final class Class3522 {
    public static double field7784 = 0.45414597310267524;
    public static float field7785 = Float.intBitsToFloat(1058342237);

    static {
        bD\u200e = "Target animals";
    }

    private static String TQsJvp4Tb1nuYT99(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite w6yqXGSFujlmPu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3522.TQsJvp4Tb1nuYT99(k2, 866637596));
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
                int a2 = Integer.parseInt(Class3522.TQsJvp4Tb1nuYT99(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3522.TQsJvp4Tb1nuYT99(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3522.TQsJvp4Tb1nuYT99(k2, 866637596) + " " + l2 + " " + m2);
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

