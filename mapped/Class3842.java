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

@HACHIMI_CLIENT(mv=100, d1={"\u69c4\u69c6\u69c5\u69ce\u69c3\u69c2\u69c2\u69c5", "\u1274\u1275\u127c\u1273\u1276\u1274\u1273\u1270", "\u30e1\u30e8\u30e2\u30e9\u30e6\u30e4\u30e9\u30e5", "\ub7aa\ub7af\ub7a8\ub7a7\ub7a6\ub7aa\ub7a8\ub7ae", "\uae9d\uae9a\uae9c\uae96\uae97\uae97\uae97\uae9d", "\ub5f3\ub5f3\ub5f3\ub5f8\ub5ff\ub5ff\ub5fd", "\u9119\u911c\u911d\u911a\u911b\u9119\u9113", "\u3e74\u3e71\u3e70\u3e7a\u3e7b\u3e7a\u3e72", "\u1c29\u1c2a\u1c2e\u1c2b\u1c2c\u1c29\u1c2c\u1c29", "\uc857\uc85f\uc857\uc856\uc85f\uc853\uc852\uc854", "\ub03a\ub03a\ub033\ub032\ub03d\ub032\ub03a\ub03b", "\u189a\u1890\u1898\u189d\u189c\u1891\u1899", "\u8625\u8626\u8626\u8627\u8624\u8623\u8621\u8620", "\ud6e9\ud6ec\ud6e8\ud6eb\ud6eb\ud6ef\ud6ee\ud6e9", "\ubdb2\ubdb3\ubdb0\ubdb9\ubdb7\ubdb0\ubdb7\ubdb1"}, d2={"\u0434\u0413\u0424\u2452\u0460\u0462\u0474\u0410\u0436\u043d\u042a\u043d\u0473\u0430\u043d\u0432\u043b\u0473\u040f\u0428\u042e\u0435\u0432\u043b\u0467\u0475\u0410\u0436\u043d\u042a\u043d\u0473\u0430\u043d\u0432\u043b\u0473\u040f\u0428\u042e\u0435\u0432\u043b\u0467", "\u07a8\u07f7\u07f8\u07fd\u07fa\u07fd\u07e0\u07aa\u07a8\u07aa\u07bc\u07bd\u07c2", "\u0170\u0125\u0122\u0125\u0138\u0172\u0170\u0172\u0164\u0165\u011a", "\u00af\u00ad\u00bc\u008b\u00a4\u00a9\u00bb\u00bb\u00f4\u00f6\u00e0\u00e1\u0084\u00a2\u00a9\u00be\u00a9\u00e7\u00a4\u00a9\u00a6\u00af\u00e7\u008b\u00a4\u00a9\u00bb\u00bb\u00f3", "\u0155\u015c\u014e\u0155\u017e\u0152\u0159\u0158\u0101\u0103\u0115\u0114\u0174", "\u06de\u06ca\u06ce\u06da\u06d7\u06c8\u0687\u0685\u0693\u06f7\u06d1\u06da\u06cd\u06da\u0694\u06d7\u06da\u06d5\u06dc\u0694\u06f4\u06d9\u06d1\u06de\u06d8\u06cf\u0680\u0692\u06e1", "\u028b\u0284\u0287\u0286\u028d\u02d4\u02d6\u02c0\u02c1\u02a4\u0282\u0289\u029e\u0289\u02c7\u0284\u0289\u0286\u028f\u02c7\u02a7\u028a\u0282\u028d\u028b\u029c\u02d3", "\u01be\u01a5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f6\u01f4\u01e2\u01e3\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f1", "\u0125\u0124\u013f\u0122\u012d\u0132\u0177\u0175\u0163\u0162\u011d", "\u025e\u025f\u0244\u0259\u0256\u0249\u0271\u025c\u025c\u020c\u020e\u0218\u0219\u0266", "\u01e3\u01f5\u01fd\u01e0\u01a8\u01aa\u01bc\u01bd\u01c2", "\u0663\u0675\u067d\u0660\u0628\u062a\u063c\u065e\u063d\u0642", "\u039c\u038a\u0382\u039f\u03db\u03d7\u03d5\u03c3\u03a1\u03c2\u03bd", "\u06f1\u06e7\u06ef\u06f2\u06ba\u06b8\u06ae\u06cc\u06cf\u06af\u06d0", "\u0282\u028d\u028a\u0285\u0288\u028d\u029e\u0281\u02d8\u02da\u02cc\u02cd\u02b2"})
public final class Class3842 {
    public static float field8713 = 0.9322737f;
    public static float field8714 = Float.intBitsToFloat(1060291575);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite eYWvNKioYB0Lo1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3842.bBJGVmGSnMOUZyuB(k2, -1054828901));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 16799 : 16798;
        block6: while (true) {
            switch (n3) {
                case 16799: {
                    n3 = 16797;
                    continue block6;
                }
                case 16798: {
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
                int a2 = Integer.parseInt(Class3842.bBJGVmGSnMOUZyuB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3842.bBJGVmGSnMOUZyuB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3842.bBJGVmGSnMOUZyuB(k2, -1054828901) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        bz\u200e = "MinDamage";
    }

    private static String bBJGVmGSnMOUZyuB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

