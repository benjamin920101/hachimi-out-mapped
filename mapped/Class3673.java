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

@HACHIMI_CLIENT(mv=100, d1={"\ud9f1\ud9f0\ud9fa\ud9f0\ud9fb\ud9f2\ud9f3\ud9f7", "\u64cf\u64c3\u64c8\u64cb\u64c3\u64c3\u64c9", "\u021e\u0213\u021e\u021f\u021e\u021b\u0213\u021d", "\u1960\u1962\u1962\u1965\u1966\u1963\u1965\u1968", "\u3888\u3882\u388b\u3883\u3888\u3882\u388a\u388e", "\u51d3\u51d1\u51d2\u51d0\u51dc\u51d1\u51d7\u51d1", "\ua1ea\ua1ec\ua1eb\ua1ec\ua1e8\ua1ee\ua1e0\ua1e0", "\u5ad5\u5ad0\u5ad3\u5ada\u5ad7\u5ad2\u5ad0\u5ad3", "\u0350\u0357\u0357\u0356\u0350\u0355\u0353\u0354", "\u6bbb\u6bb0\u6bb9\u6bba\u6bb8\u6bbe\u6bb1\u6bb1", "\uc542\uc544\uc543\uc545\uc549\uc546\uc542\uc543", "\ubf39\ubf34\ubf3e\ubf3f\ubf38\ubf35\ubf3e", "\u5f40\u5f41\u5f49\u5f47\u5f42\u5f49\u5f41\u5f46", "\ue074\ue077\ue074\ue072\ue075\ue071\ue072", "\u688e\u6882\u688f\u688d\u688f\u688d\u6882\u688c", "\u18ea\u18ed\u18ee\u18e1\u18ee\u18ef\u18ed\u18e0", "\u2af8\u2afd\u2afd\u2afc\u2afe\u2aff\u2afb\u2afc", "\ubdc3\ubdc6\ubdc2\ubdc7\ubdc7\ubdc4\ubdc7\ubdc4"}, d2={"\u0511\u0530\u0532\u257b\u0549\u054b\u055d\u0539\u051f\u0514\u0503\u0514\u055a\u0519\u0514\u051b\u0512\u055a\u0526\u0501\u0507\u051c\u051b\u0512\u054e\u055c\u0539\u051f\u0514\u0503\u0514\u055a\u0519\u0514\u051b\u0512\u055a\u0526\u0501\u0507\u051c\u051b\u0512\u054e", "\u0489\u04a8\u04a5\u24e3\u04d1\u04d3\u04c5\u04a1\u0487\u048c\u049b\u048c\u04c2\u0481\u048c\u0483\u048a\u04c2\u04be\u0499\u049f\u0484\u0483\u048a\u04d6\u04c4\u04a1\u0487\u048c\u049b\u048c\u04c2\u0481\u048c\u0483\u048a\u04c2\u04be\u0499\u049f\u0484\u0483\u048a\u04d6", "\u0584\u05a5\u05a9\u25ee\u05dc\u05de\u05c8\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05b3\u0594\u0592\u0589\u058e\u0587\u05db\u05c9\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05b3\u0594\u0592\u0589\u058e\u0587\u05db", "\u06a5\u0684\u068b\u26cf\u06fd\u06ff\u06e9\u068d\u06ab\u06a0\u06b7\u06a0\u06ee\u06ad\u06a0\u06af\u06a6\u06ee\u0692\u06b5\u06b3\u06a8\u06af\u06a6\u06fa\u06e8\u068d\u06ab\u06a0\u06b7\u06a0\u06ee\u06ad\u06a0\u06af\u06a6\u06ee\u0692\u06b5\u06b3\u06a8\u06af\u06a6\u06fa", "\u07df\u0780\u078f\u078a\u078d\u078a\u0797\u07dd\u07df\u07dd\u07cb\u07ca\u07b5", "\u032d\u0378\u037f\u0378\u0365\u032f\u032d\u032f\u0339\u0338\u0347", "\u06b0\u06b2\u06a3\u0694\u06bb\u06b6\u06a4\u06a4\u06eb\u06e9\u06ff\u06fe\u069b\u06bd\u06b6\u06a1\u06b6\u06f8\u06bb\u06b6\u06b9\u06b0\u06f8\u0694\u06bb\u06b6\u06a4\u06a4\u06ec", "ahzaJfml57! @", "\u0625\u0631\u0635\u0621\u062c\u0633\u067c\u067e\u0668\u060c\u062a\u0621\u0636\u0621\u066f\u062c\u0621\u062e\u0627\u066f\u060f\u0622\u062a\u0625\u0623\u0634\u067b\u0669\u061a", "\u0292\u029d\u029e\u029f\u0294\u02cd\u02cf\u02d9\u02d8\u02bd\u029b\u0290\u0287\u0290\u02de\u029d\u0290\u029f\u0296\u02de\u02be\u0293\u029b\u0294\u0292\u0285\u02ca", "\u0632\u0629\u0615\u0632\u0634\u062f\u0628\u0621\u067a\u0678\u066e\u066f\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d", "\u0736\u0737\u072c\u0731\u073e\u0721\u0764\u0766\u0770\u0771\u070e", "ED_BMRjGG\u0017\u0015\u0003\u0002}", "\u0263\u0275\u027d\u0260\u0228\u022a\u023c\u023d\u0242", "\u0456\u0440\u0448\u0455\u041d\u041f\u0409\u046b\u0408\u0477", "\u0128\u013e\u0136\u012b\u016f\u0163\u0161\u0177\u0115\u0176\u0109", "\u0349\u035f\u0357\u034a\u0302\u0300\u0316\u0374\u0377\u0317\u0368", "\u076e\u0761\u0766\u0769\u0764\u0761\u0772\u076d\u0734\u0736\u0720\u0721\u075e"})
public final class Class3673 {
    public static double field8220 = Double.longBitsToDouble(4592386299140366672L);
    public static float field8221;
    public static float field8222 = 0.32149857f;

    private static String A9SnFtw2oxjNYdYI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite QCdYw22KDODdDg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3673.A9SnFtw2oxjNYdYI(k2, 1567269629));
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
                int a2 = Integer.parseInt(Class3673.A9SnFtw2oxjNYdYI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3673.A9SnFtw2oxjNYdYI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3673.A9SnFtw2oxjNYdYI(k2, 1567269629) + " " + l2 + " " + m2);
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
        ac\u200e = "IGNORE";
        bd\u200e = "Face";
        bi\u200e = "mixColor";
        bq\u200e = "None";
        field8221 = Float.intBitsToFloat(1044377868);
    }
}

