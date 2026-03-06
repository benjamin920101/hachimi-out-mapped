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

@HACHIMI_CLIENT(mv=100, d1={"\u3209\u3202\u320e\u3202\u320c\u320c\u3202\u320a", "\uc3da\uc3db\uc3d8\uc3d7\uc3dc\uc3df\uc3db\uc3dd", "\u30d0\u30d2\u30db\u30d5\u30d2\u30d2\u30db", "\u2666\u266b\u2667\u2661\u2662\u2666\u2663", "\u47f1\u47f6\u47f4\u47fa\u47f0\u47f1\u47f1", "\u7cff\u7cfc\u7cfd\u7cfc\u7cf4\u7cfe\u7cff\u7cff", "\u7fb5\u7fb5\u7fb7\u7fb7\u7fb7\u7fb9\u7fb9\u7fb2", "\udf12\udf11\udf14\udf14\udf10\udf14\udf11\udf16", "\udd8b\udd8d\udd88\udd88\udd8c\udd88\udd8b", "\u4228\u4228\u422f\u4228\u4223\u422e\u422c\u4222", "\u74b4\u74b0\u74b7\u74b1\u74bb\u74b4", "\u29a3\u29a5\u29a1\u29a5\u29a7\u29a6\u29a0\u29a6", "\uc3b6\uc3ba\uc3b5\uc3b6\uc3b3\uc3b4\uc3b5", "\u59db\u59dd\u59d9\u59db\u59dd\u59dd\u59d1\u59d1", "\u515e\u515a\u515c\u5157\u5159\u515a\u515a\u515c", "\u3807\u3805\u3803\u380d\u3805\u3803\u3803\u380d", "\ub2fa\ub2fe\ub2ff\ub2f7\ub2fe\ub2fd\ub2ff", "\u06f7\u06fa\u06f9\u06ff\u06fd\u06fe\u06fb", "\u9a54\u9a56\u9a59\u9a51\u9a58\u9a59\u9a50\u9a50", "\u8b7d\u8b77\u8b7e\u8b7a\u8b7b\u8b7a\u8b77\u8b79"}, d2={"\u0152\u0169\u0148\u2132\u0100\u0102\u0114\u0170\u0156\u015d\u014a\u015d\u0113\u0150\u015d\u0152\u015b\u0113\u016f\u0148\u014e\u0155\u0152\u015b\u0107\u0115\u0170\u0156\u015d\u014a\u015d\u0113\u0150\u015d\u0152\u015b\u0113\u016f\u0148\u014e\u0155\u0152\u015b\u0107", "\u0187\u01bc\u019c\u21e7\u01d5\u01d7\u01c1\u01a5\u0183\u0188\u019f\u0188\u01c6\u0185\u0188\u0187\u018e\u01c6\u01ba\u019d\u019b\u0180\u0187\u018e\u01d2\u01c0\u01a5\u0183\u0188\u019f\u0188\u01c6\u0185\u0188\u0187\u018e\u01c6\u01ba\u019d\u019b\u0180\u0187\u018e\u01d2", "\u015c\u0167\u0144\u213c\u010e\u010c\u011a\u017e\u0158\u0153\u0144\u0153\u011d\u015e\u0153\u015c\u0155\u011d\u0161\u0146\u0140\u015b\u015c\u0155\u0109\u011b\u017e\u0158\u0153\u0144\u0153\u011d\u015e\u0153\u015c\u0155\u011d\u0161\u0146\u0140\u015b\u015c\u0155\u0109", "\u07af\u0794\u07b6\u27cf\u07fd\u07ff\u07e9\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa", "\u0696\u06ad\u0680\u26f6\u06c4\u06c6\u06d0\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06ab\u068c\u068a\u0691\u0696\u069f\u06c3\u06d1\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06ab\u068c\u068a\u0691\u0696\u069f\u06c3", "\u037e\u0345\u0369\u231e\u032c\u032e\u0338\u035c\u037a\u0371\u0366\u0371\u033f\u037c\u0371\u037e\u0377\u033f\u0343\u0364\u0362\u0379\u037e\u0377\u032b\u0339\u035c\u037a\u0371\u0366\u0371\u033f\u037c\u0371\u037e\u0377\u033f\u0343\u0364\u0362\u0379\u037e\u0377\u032b", "\u06b4\u06eb\u06e4\u06e1\u06e6\u06e1\u06fc\u06b6\u06b4\u06b6\u06a0\u06a1\u06de", "\u050d\u0558\u055f\u0558\u0545\u050f\u050d\u050f\u0519\u0518\u0567", "\u023f\u023d\u022c\u021b\u0234\u0239\u022b\u022b\u0264\u0266\u0270\u0271\u0214\u0232\u0239\u022e\u0239\u0277\u0234\u0239\u0236\u023f\u0277\u021b\u0234\u0239\u022b\u022b\u0263", "\u059f\u0596\u0584\u059f\u05b4\u0598\u0593\u0592\u05cb\u05c9\u05df\u05de\u05be", "\u0724\u0730\u0734\u0720\u072d\u0732\u077d\u077f\u0769\u070d\u072b\u0720\u0737\u0720\u076e\u072d\u0720\u072f\u0726\u076e\u070e\u0723\u072b\u0724\u0722\u0735\u077a\u0768\u071b", "\u02e0\u02ef\u02ec\u02ed\u02e6\u02bf\u02bd\u02ab\u02aa\u02cf\u02e9\u02e2\u02f5\u02e2\u02ac\u02ef\u02e2\u02ed\u02e4\u02ac\u02cc\u02e1\u02e9\u02e6\u02e0\u02f7\u02b8", "\u07b3\u07a8\u0794\u07b3\u07b5\u07ae\u07a9\u07a0\u07fb\u07f9\u07ef\u07ee\u078b\u07ad\u07a6\u07b1\u07a6\u07e8\u07ab\u07a6\u07a9\u07a0\u07e8\u0794\u07b3\u07b5\u07ae\u07a9\u07a0\u07fc", "\u05d1\u05d0\u05cb\u05d6\u05d9\u05c6\u0583\u0581\u0597\u0596\u05e9", ";:!<3,\u001499ik}|\u0003", "\u044f\u0459\u0451\u044c\u0404\u0406\u0410\u0411\u046e", "\u010a\u011c\u0114\u0109\u0141\u0143\u0155\u0137\u0154\u012b", "\u06a3\u06b5\u06bd\u06a0\u06e4\u06e8\u06ea\u06fc\u069e\u06fd\u0682", "\u00ab\u00bd\u00b5\u00a8\u00e0\u00e2\u00f4\u0096\u0095\u00f5\u008a", "\u0294\u029b\u029c\u0293\u029e\u029b\u0288\u0297\u02ce\u02cc\u02da\u02db\u02a4"})
public final class Class1506 {
    public static double field5676;
    public static double field5677;
    public static String field5678;
    public static double field5679;

    static {
        G\u200e = "Horizontally clips the player";
        field5678 = "configs";
        field5676 = Double.longBitsToDouble(4600255399191498664L);
        aN\u200e = "Prevents firework entities from rendering";
        bf\u200e = "MineColor";
        field5677 = Double.longBitsToDouble(4603028281631401963L);
        bs\u200e = "Timing";
        field5679 = Double.longBitsToDouble(4585925428558828667L);
        ca\u200e = "Prevents rendering of portal particles";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String wnhGbNsdotYpXJxW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 62067 : 62068;
            block5: while (true) {
                switch (n2) {
                    case 62068: {
                        n2 = 62066;
                        continue block5;
                    }
                    case 62067: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite G7firSDm7njgo0(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1506.wnhGbNsdotYpXJxW(k2, 154721050));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block10: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1506.wnhGbNsdotYpXJxW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 7767 : 7768;
            block11: while (true) {
                switch (n3) {
                    case 7768: {
                        n3 = 7766;
                        continue block11;
                    }
                    case 7767: {
                        String c2 = Class1506.wnhGbNsdotYpXJxW(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block10;
                    }
                    default: {
                        continue block10;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1506.wnhGbNsdotYpXJxW(k2, 154721050) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 == 1 ? 48848 : 48849;
        block12: while (true) {
            switch (n4) {
                case 48849: {
                    n4 = 48847;
                    continue block12;
                }
                case 48848: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

