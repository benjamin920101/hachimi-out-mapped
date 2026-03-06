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
@HACHIMI_CLIENT(mv=100, d1={"\u2e88\u2e8a\u2e85\u2e85\u2e84\u2e84\u2e89", "\u931f\u931a\u9311\u9311\u931b\u931e\u931e\u931e", "\ubd86\ubd85\ubd83\ubd8e\ubd82\ubd8e\ubd8f\ubd87", "\u0758\u075a\u075f\u075e\u075b\u075c\u075a\u0755", "\u4059\u405c\u4059\u4052\u4058\u405e\u4052\u405c", "\u547e\u547e\u547f\u547c\u5476\u5479\u547d\u5477", "\u0fe2\u0fee\u0fe7\u0fe5\u0fe2\u0fe7\u0fe3\u0fe5", "\uce76\uce7b\uce77\uce72\uce7b\uce75\uce75\uce70", "\u66bd\u66bc\u66b9\u66bb\u66bd\u66be\u66bf\u66bc", "\u5bb3\u5bb5\u5bb5\u5bb5\u5bb3\u5bb6\u5bb3\u5bb0", "\u81a7\u81a4\u81af\u81a3\u81a1\u81a6\u81a2\u81a5", "\ue52a\ue529\ue52f\ue52f\ue52d\ue52e\ue52b\ue52c", "\u0bd8\u0bdb\u0bdd\u0bdd\u0bd9\u0bde\u0bd6\u0bdd", "\u351e\u351e\u351b\u351b\u3517\u351a\u351a\u3516", "\u490c\u490e\u490b\u4908\u490b\u4907\u490f\u490b"}, d2={"\u06ef\u06c2\u06fd\u268b\u06b9\u06bb\u06ad\u06c9\u06ef\u06e4\u06f3\u06e4\u06aa\u06e9\u06e4\u06eb\u06e2\u06aa\u06d6\u06f1\u06f7\u06ec\u06eb\u06e2\u06be\u06ac\u06c9\u06ef\u06e4\u06f3\u06e4\u06aa\u06e9\u06e4\u06eb\u06e2\u06aa\u06d6\u06f1\u06f7\u06ec\u06eb\u06e2\u06be", "\u04c9\u0496\u0499\u049c\u049b\u049c\u0481\u04cb\u04c9\u04cb\u04dd\u04dc\u04a3", "\u02be\u02eb\u02ec\u02eb\u02f6\u02bc\u02be\u02bc\u02aa\u02ab\u02d4", "\u064f\u064d\u065c\u066b\u0644\u0649\u065b\u065b\u0614\u0616\u0600\u0601\u0664\u0642\u0649\u065e\u0649\u0607\u0644\u0649\u0646\u064f\u0607\u066b\u0644\u0649\u065b\u065b\u0613", "\u03a3\u03aa\u03b8\u03a3\u0388\u03a4\u03af\u03ae\u03f7\u03f5\u03e3\u03e2\u0382", "\u01e7\u01f3\u01f7\u01e3\u01ee\u01f1\u01be\u01bc\u01aa\u01ce\u01e8\u01e3\u01f4\u01e3\u01ad\u01ee\u01e3\u01ec\u01e5\u01ad\u01cd\u01e0\u01e8\u01e7\u01e1\u01f6\u01b9\u01ab\u01d8", "\u01d0\u01df\u01dc\u01dd\u01d6\u018f\u018d\u019b\u019a\u01ff\u01d9\u01d2\u01c5\u01d2\u019c\u01df\u01d2\u01dd\u01d4\u019c\u01fc\u01d1\u01d9\u01d6\u01d0\u01c7\u0188", "\u017c\u0167\u015b\u017c\u017a\u0161\u0166\u016f\u0134\u0136\u0120\u0121\u0144\u0162\u0169\u017e\u0169\u0127\u0164\u0169\u0166\u016f\u0127\u015b\u017c\u017a\u0161\u0166\u016f\u0133", "\u04ae\u04af\u04b4\u04a9\u04a6\u04b9\u04fc\u04fe\u04e8\u04e9\u0496", "\u0138\u0139\u0122\u013f\u0130\u012f\u0117\u013a\u013a\u016a\u0168\u017e\u017f\u0100", "\u015e\u0148\u0140\u015d\u0115\u0117\u0101\u0100\u017f", "\u05d8\u05ce\u05c6\u05db\u0593\u0591\u0587\u05e5\u0586\u05f9", "\u077e\u0768\u0760\u077d\u0739\u0735\u0737\u0721\u0743\u0720\u075f", "\u01cc\u01da\u01d2\u01cf\u0187\u0185\u0193\u01f1\u01f2\u0192\u01ed", "\u0632\u063d\u063a\u0635\u0638\u063d\u062e\u0631\u0668\u066a\u067c\u067d\u0602"})
public final class Class3939 {
    public static double field8969 = Double.longBitsToDouble(4605759930314863701L);

    static {
        cc\u200e = "Render tracers to vehicles";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 7LCyvBYgjJyyZ9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3939.neBNJ7a9Ju7qWK4Y(k2, 1753608855));
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
                int a2 = Integer.parseInt(Class3939.neBNJ7a9Ju7qWK4Y(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3939.neBNJ7a9Ju7qWK4Y(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3939.neBNJ7a9Ju7qWK4Y(k2, 1753608855) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String neBNJ7a9Ju7qWK4Y(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

