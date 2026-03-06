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
@HACHIMI_CLIENT(mv=100, d1={"\u4ead\u4ea9\u4ea0\u4ea0\u4eac\u4eaa\u4eaa\u4eae", "\u335d\u3353\u3359\u335e\u3358\u335e\u3359", "\u4b99\u4b9a\u4b9d\u4b98\u4b9f\u4b99\u4b98", "\uc7d3\uc7de\uc7d7\uc7d7\uc7df\uc7d4\uc7d2\uc7df", "\u2a7b\u2a74\u2a7d\u2a7e\u2a7a\u2a7e\u2a74\u2a7f", "\udc76\udc73\udc76\udc70\udc76\udc73\udc77\udc77", "\ue360\ue365\ue361\ue364\ue36d\ue36c\ue362\ue36c", "\ubf75\ubf7f\ubf74\ubf7e\ubf7f\ubf77\ubf7e\ubf7e", "\u116b\u116c\u116a\u1168\u116f\u1168\u116f\u116f", "\u6c01\u6c03\u6c05\u6c00\u6c06\u6c0c\u6c02\u6c07", "\u98a7\u98a6\u98a0\u98a3\u98a1\u98a0\u98a4\u98aa", "\u09dd\u09dd\u09dc\u09d6\u09da\u09d6\u09d8\u09da", "\u63b5\u63b6\u63bf\u63b5\u63b3\u63b3\u63b0\u63b7", "\u2d6f\u2d6d\u2d6a\u2d6e\u2d6a\u2d69\u2d69\u2d64", "\u6c56\u6c55\u6c59\u6c55\u6c57\u6c53\u6c54\u6c53", "\u31cc\u31c9\u31ca\u31c5\u31cf\u31c4\u31ce\u31ce", "\u15c9\u15c8\u15c3\u15c3\u15cc\u15c2\u15c3\u15cf"}, d2={"\u04f6\u04e7\u04f1\u2499\u04ab\u04a9\u04bf\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac\u04be\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac", "\u07a3\u07b2\u07a5\u27cc\u07fe\u07fc\u07ea\u078e\u07a8\u07a3\u07b4\u07a3\u07ed\u07ae\u07a3\u07ac\u07a5\u07ed\u0791\u07b6\u07b0\u07ab\u07ac\u07a5\u07f9\u07eb\u078e\u07a8\u07a3\u07b4\u07a3\u07ed\u07ae\u07a3\u07ac\u07a5\u07ed\u0791\u07b6\u07b0\u07ab\u07ac\u07a5\u07f9", "\u0125\u0134\u012c\u214a\u0178\u017a\u016c\u0108\u012e\u0125\u0132\u0125\u016b\u0128\u0125\u012a\u0123\u016b\u0117\u0130\u0136\u012d\u012a\u0123\u017f\u016d\u0108\u012e\u0125\u0132\u0125\u016b\u0128\u0125\u012a\u0123\u016b\u0117\u0130\u0136\u012d\u012a\u0123\u017f", "\u01c4\u019b\u0194\u0191\u0196\u0191\u018c\u01c6\u01c4\u01c6\u01d0\u01d1\u01ae", "\u0563\u0536\u0531\u0536\u052b\u0561\u0563\u0561\u0577\u0576\u0509", "\u0425\u0427\u0436\u0401\u042e\u0423\u0431\u0431\u047e\u047c\u046a\u046b\u040e\u0428\u0423\u0434\u0423\u046d\u042e\u0423\u042c\u0425\u046d\u0401\u042e\u0423\u0431\u0431\u0479", "\u06cf\u06c6\u06d4\u06cf\u06e4\u06c8\u06c3\u06c2\u069b\u0699\u068f\u068e\u06ee", "\u059a\u058e\u058a\u059e\u0593\u058c\u05c3\u05c1\u05d7\u05b3\u0595\u059e\u0589\u059e\u05d0\u0593\u059e\u0591\u0598\u05d0\u05b0\u059d\u0595\u059a\u059c\u058b\u05c4\u05d6\u05a5", "\u0725\u072a\u0729\u0728\u0723\u077a\u0778\u076e\u076f\u070a\u072c\u0727\u0730\u0727\u0769\u072a\u0727\u0728\u0721\u0769\u0709\u0724\u072c\u0723\u0725\u0732\u077d", "\u0731\u072a\u0716\u0731\u0737\u072c\u072b\u0722\u0779\u077b\u076d\u076c\u0709\u072f\u0724\u0733\u0724\u076a\u0729\u0724\u072b\u0722\u076a\u0716\u0731\u0737\u072c\u072b\u0722\u077e", "\u01ef\u01ee\u01f5\u01e8\u01e7\u01f8\u01bd\u01bf\u01a9\u01a8\u01d7", "\u060b\u060a\u0611\u060c\u0603\u061c\u0624\u0609\u0609\u0659\u065b\u064d\u064c\u0633", "\u044e\u0458\u0450\u044d\u0405\u0407\u0411\u0410\u046f", "\u05de\u05c8\u05c0\u05dd\u0595\u0597\u0581\u05e3\u0580\u05ff", "\u065f\u0649\u0641\u065c\u0618\u0614\u0616\u0600\u0662\u0601\u067e", "\u05f3\u05e5\u05ed\u05f0\u05b8\u05ba\u05ac\u05ce\u05cd\u05ad\u05d2", "\u064d\u0642\u0645\u064a\u0647\u0642\u0651\u064e\u0617\u0615\u0603\u0602\u067d"})
public final class Class1770 {
    public static float field6634;
    public static float field6635;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 1MAvQdOQgJ4m76(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1770.394x65FafgsIJX6v(k2, 1217931998));
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
                int a2 = Integer.parseInt(Class1770.394x65FafgsIJX6v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1770.394x65FafgsIJX6v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 11169 : 11168;
        block11: while (true) {
            switch (n3) {
                case 11169: {
                    n3 = 11167;
                    continue block11;
                }
                case 11168: {
                    throw new Exception("Can't find method in " + Class1770.394x65FafgsIJX6v(k2, 1217931998) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 == 1 ? 20587 : 20588;
        block12: while (true) {
            switch (n4) {
                case 20588: {
                    n4 = 20586;
                    continue block12;
                }
                case 20587: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 394x65FafgsIJX6v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        K\u200e = "Applies to splash/lingering potions";
        T\u200e = "Debug";
        W\u200e = "Automatically reconnects to a server immediately after disconnecting";
        field6635 = Float.intBitsToFloat(1048981790);
        field6634 = Float.intBitsToFloat(1044047008);
    }
}

