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

@HACHIMI_CLIENT(mv=100, d1={"\u6594\u6598\u6590\u6597\u6597\u6590\u6590\u6599", "\ue67f\ue67c\ue67d\ue67f\ue67e\ue67d\ue67f\ue67c", "\ue45c\ue45b\ue45b\ue45a\ue456\ue456\ue459\ue45a", "\u1a54\u1a53\u1a59\u1a58\u1a52\u1a52\u1a57\u1a58", "\u9622\u962b\u9629\u9622\u962b\u962d\u9622", "\u65d1\u65d4\u65de\u65de\u65d7\u65d4\u65d7\u65d2", "\ue704\ue704\ue704\ue703\ue70f\ue705\ue701", "\u87b3\u87b6\u87b4\u87b5\u87b0\u87b0\u87b0\u87b3", "\u2734\u2733\u2734\u2730\u2731\u2731\u2730", "\u2690\u2696\u2696\u2693\u2696\u269b\u2695\u2690", "\u79a3\u79a3\u79a0\u79a0\u79a5\u79aa\u79a1\u79aa", "\u4928\u492b\u492e\u492d\u492d\u492d\u4925\u492f", "\ud249\ud24e\ud242\ud24b\ud24a\ud24d\ud249\ud24a", "\u2249\u2248\u224c\u2241\u2248\u2240\u224d\u224e"}, d2={"\u033d\u0362\u036d\u0368\u036f\u0368\u0375\u033f\u033d\u033f\u0329\u0328\u0357", "\u04c9\u049c\u049b\u049c\u0481\u04cb\u04c9\u04cb\u04dd\u04dc\u04a3", "\u0216\u0214\u0205\u0232\u021d\u0210\u0202\u0202\u024d\u024f\u0259\u0258\u023d\u021b\u0210\u0207\u0210\u025e\u021d\u0210\u021f\u0216\u025e\u0232\u021d\u0210\u0202\u0202\u024a", "\u075a\u0753\u0741\u075a\u0771\u075d\u0756\u0757\u070e\u070c\u071a\u071b\u077b", "\u032a\u033e\u033a\u032e\u0323\u033c\u0373\u0371\u0367\u0303\u0325\u032e\u0339\u032e\u0360\u0323\u032e\u0321\u0328\u0360\u0300\u032d\u0325\u032a\u032c\u033b\u0374\u0366\u0315", "\u0797\u0798\u079b\u079a\u0791\u07c8\u07ca\u07dc\u07dd\u07b8\u079e\u0795\u0782\u0795\u07db\u0798\u0795\u079a\u0793\u07db\u07bb\u0796\u079e\u0791\u0797\u0780\u07cf", "\u0628\u0633\u060f\u0628\u062e\u0635\u0632\u063b\u0660\u0662\u0674\u0675\u0610\u0636\u063d\u062a\u063d\u0673\u0630\u063d\u0632\u063b\u0673\u060f\u0628\u062e\u0635\u0632\u063b\u0667", "\u0746\u0747\u075c\u0741\u074e\u0751\u0714\u0716\u0700\u0701\u077e", "\u0138\u0139\u0122\u013f\u0130\u012f\u0117\u013a\u013a\u016a\u0168\u017e\u017f\u0100", "\u07b4\u07a2\u07aa\u07b7\u07ff\u07fd\u07eb\u07ea\u0795", "\u048f\u0499\u0491\u048c\u04c4\u04c6\u04d0\u04b2\u04d1\u04ae", "\u0123\u0135\u013d\u0120\u0164\u0168\u016a\u017c\u011e\u017d\u0102", "\u00c4\u00d2\u00da\u00c7\u008f\u008d\u009b\u00f9\u00fa\u009a\u00e5", "\u0327\u0328\u032f\u0320\u032d\u0328\u033b\u0324\u037d\u037f\u0369\u0368\u0317"})
public final class Class2512 {
    public static float field6802 = 0.7303917f;
    public static double field6803 = Double.longBitsToDouble(4602294361411628996L);

    private static String D9n2q2WGN7w76gDQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite j4LInjOktpviNA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2512.D9n2q2WGN7w76gDQ(k2, -1251241498));
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
                int a2 = Integer.parseInt(Class2512.D9n2q2WGN7w76gDQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2512.D9n2q2WGN7w76gDQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2512.D9n2q2WGN7w76gDQ(k2, -1251241498) + " " + l2 + " " + m2);
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

