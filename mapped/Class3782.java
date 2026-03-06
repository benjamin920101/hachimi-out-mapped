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

@HACHIMI_CLIENT(mv=100, d1={"\ua108\ua108\ua10f\ua10d\ua108\ua10f\ua10c", "\u009d\u009b\u0098\u0099\u009a\u0096\u009f\u0099", "\u2a29\u2a2e\u2a29\u2a28\u2a2c\u2a2c\u2a29\u2a28", "\u9949\u994a\u994f\u9948\u994a\u994a\u994c\u9946", "\u1e52\u1e51\u1e51\u1e51\u1e54\u1e52\u1e5f\u1e50", "\u9f2e\u9f2a\u9f28\u9f2e\u9f28\u9f28\u9f24\u9f2f", "\u81fa\u81fb\u81f1\u81f9\u81fd\u81fd\u81f0\u81f9", "\u6817\u6814\u6810\u6816\u681a\u6816\u6814\u6814", "\u98ff\u98ff\u98fa\u98f5\u98fc\u98fd", "\u1a0e\u1a0d\u1a08\u1a08\u1a0b\u1a0e\u1a0f\u1a0a", "\ua536\ua531\ua533\ua53a\ua536\ua533\ua535\ua532", "\uc629\uc626\uc62b\uc62c\uc628\uc626\uc62b", "\u0d8b\u0d89\u0d8b\u0d8a\u0d88\u0d86\u0d88\u0d86", "\u5c7f\u5c7c\u5c79\u5c7b\u5c7a\u5c7f\u5c7a\u5c75", "\ud9f3\ud9f7\ud9f4\ud9f8\ud9f2\ud9f7\ud9f8", "\u6498\u6499\u649f\u6498\u6494\u649a\u6498\u6495"}, d2={"\u0309\u0332\u0329\u2369\u035b\u0359\u034f\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c\u034e\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c", "\u0711\u072a\u0730\u2771\u0743\u0741\u0757\u0733\u0715\u071e\u0709\u071e\u0750\u0713\u071e\u0711\u0718\u0750\u072c\u070b\u070d\u0716\u0711\u0718\u0744\u0756\u0733\u0715\u071e\u0709\u071e\u0750\u0713\u071e\u0711\u0718\u0750\u072c\u070b\u070d\u0716\u0711\u0718\u0744", "n1>;<;&lnlz{\u0004", "\u05f9\u05ac\u05ab\u05ac\u05b1\u05fb\u05f9\u05fb\u05ed\u05ec\u0593", "\u0567\u0565\u0574\u0543\u056c\u0561\u0573\u0573\u053c\u053e\u0528\u0529\u054c\u056a\u0561\u0576\u0561\u052f\u056c\u0561\u056e\u0567\u052f\u0543\u056c\u0561\u0573\u0573\u053b", "\u0379\u0370\u0362\u0379\u0352\u037e\u0375\u0374\u032d\u032f\u0339\u0338\u0358", "\u0644\u0650\u0654\u0640\u064d\u0652\u061d\u061f\u0609\u066d\u064b\u0640\u0657\u0640\u060e\u064d\u0640\u064f\u0646\u060e\u066e\u0643\u064b\u0644\u0642\u0655\u061a\u0608\u067b", "\u0633\u063c\u063f\u063e\u0635\u066c\u066e\u0678\u0679\u061c\u063a\u0631\u0626\u0631\u067f\u063c\u0631\u063e\u0637\u067f\u061f\u0632\u063a\u0635\u0633\u0624\u066b", "\u02d7\u02cc\u02f0\u02d7\u02d1\u02ca\u02cd\u02c4\u029f\u029d\u028b\u028a\u02ef\u02c9\u02c2\u02d5\u02c2\u028c\u02cf\u02c2\u02cd\u02c4\u028c\u02f0\u02d7\u02d1\u02ca\u02cd\u02c4\u0298", "\u027a\u027b\u0260\u027d\u0272\u026d\u0228\u022a\u023c\u023d\u0242", "\u060a\u060b\u0610\u060d\u0602\u061d\u0625\u0608\u0608\u0658\u065a\u064c\u064d\u0632", "\u04b1\u04a7\u04af\u04b2\u04fa\u04f8\u04ee\u04ef\u0490", "\u01a7\u01b1\u01b9\u01a4\u01ec\u01ee\u01f8\u019a\u01f9\u0186", "\u0554\u0542\u054a\u0557\u0513\u051f\u051d\u050b\u0569\u050a\u0575", "\u061b\u060d\u0605\u0618\u0650\u0652\u0644\u0626\u0625\u0645\u063a", "\u0623\u062c\u062b\u0624\u0629\u062c\u063f\u0620\u0679\u067b\u066d\u066c\u0613"})
public final class Class3782 {
    public static double field8572 = 0.8127692130351926;
    public static double field8573 = Double.longBitsToDouble(4606227022446477643L);
    public static float field8574 = Float.intBitsToFloat(1050100152);
    public static float field8575;
    public static float field8576;
    public static int field8577 = 562807685;

    static {
        field8576 = Float.intBitsToFloat(1051600514);
        bG\u200e = "Target neutrals";
        field8575 = Float.intBitsToFloat(1061659801);
        bP\u200e = "\u00a7b";
    }

    private static String LkvD7EV7wcwBVGMS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite xsga6DbtiVlyyl(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3782.LkvD7EV7wcwBVGMS(k2, 1207755452));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 11421 : 11420;
        block6: while (true) {
            switch (n3) {
                case 11421: {
                    n3 = 11419;
                    continue block6;
                }
                case 11420: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3782.LkvD7EV7wcwBVGMS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3782.LkvD7EV7wcwBVGMS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3782.LkvD7EV7wcwBVGMS(k2, 1207755452) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

