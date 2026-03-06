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

@HACHIMI_CLIENT(mv=100, d1={"\u4637\u4634\u4632\u4630\u4633\u4635\u4635\u463f", "\u2a1a\u2a1e\u2a1a\u2a1f\u2a1d\u2a1c\u2a1a\u2a11", "\u41a5\u41aa\u41a7\u41a5\u41a3\u41a1\u41a7\u41aa", "\u372d\u372c\u3725\u372d\u372f\u372c\u372f\u3725", "\u2c42\u2c47\u2c4e\u2c41\u2c4f\u2c4f\u2c43\u2c45", "\ud96a\ud968\ud96a\ud96c\ud96d\ud96c\ud96e\ud96b", "\ub6b6\ub6b2\ub6b5\ub6b0\ub6b6\ub6b3\ub6b7\ub6b1", "\u56d5\u56dd\u56dd\u56d3\u56d7\u56dc\u56d7\u56dd", "\u1f9c\u1f98\u1f9e\u1f9d\u1f9a\u1f9b\u1f9f\u1f97", "\u1b06\u1b03\u1b0b\u1b05\u1b0b\u1b05\u1b07\u1b02", "\u7d53\u7d54\u7d56\u7d52\u7d56\u7d54\u7d50\u7d56", "\u7988\u798d\u7985\u7989\u7985\u798e\u7985\u798e", "\ub778\ub77f\ub775\ub778\ub779\ub774\ub779", "\u2f3e\u2f3c\u2f3c\u2f3a\u2f3d\u2f37\u2f3e\u2f3a", "\ua5a2\ua5a6\ua5a6\ua5a5\ua5a0\ua5a8\ua5a7\ua5a7", "\u1bc4\u1bc1\u1bc6\u1bc1\u1bc7\u1bc1\u1bc7\u1bcb"}, d2={"\u0104\u0126\u012f\u2163\u0151\u0153\u0145\u0121\u0107\u010c\u011b\u010c\u0142\u0101\u010c\u0103\u010a\u0142\u013e\u0119\u011f\u0104\u0103\u010a\u0156\u0144\u0121\u0107\u010c\u011b\u010c\u0142\u0101\u010c\u0103\u010a\u0142\u013e\u0119\u011f\u0104\u0103\u010a\u0156", "\u0430\u0412\u041a\u2457\u0465\u0467\u0471\u0415\u0433\u0438\u042f\u0438\u0476\u0435\u0438\u0437\u043e\u0476\u040a\u042d\u042b\u0430\u0437\u043e\u0462\u0470\u0415\u0433\u0438\u042f\u0438\u0476\u0435\u0438\u0437\u043e\u0476\u040a\u042d\u042b\u0430\u0437\u043e\u0462", "\u00b1\u00ee\u00e1\u00e4\u00e3\u00e4\u00f9\u00b3\u00b1\u00b3\u00a5\u00a4\u00db", "{.).3y{yon\u0011", "\u0223\u0221\u0230\u0207\u0228\u0225\u0237\u0237\u0278\u027a\u026c\u026d\u0208\u022e\u0225\u0232\u0225\u026b\u0228\u0225\u022a\u0223\u026b\u0207\u0228\u0225\u0237\u0237\u027f", "\u06a3\u06aa\u06b8\u06a3\u0688\u06a4\u06af\u06ae\u06f7\u06f5\u06e3\u06e2\u0682", "\u0627\u0633\u0637\u0623\u062e\u0631\u067e\u067c\u066a\u060e\u0628\u0623\u0634\u0623\u066d\u062e\u0623\u062c\u0625\u066d\u060d\u0620\u0628\u0627\u0621\u0636\u0679\u066b\u0618", "\u00dd\u00d2\u00d1\u00d0\u00db\u0082\u0080\u0096\u0097\u00f2\u00d4\u00df\u00c8\u00df\u0091\u00d2\u00df\u00d0\u00d9\u0091\u00f1\u00dc\u00d4\u00db\u00dd\u00ca\u0085", "\u01f0\u01eb\u01d7\u01f0\u01f6\u01ed\u01ea\u01e3\u01b8\u01ba\u01ac\u01ad\u01c8\u01ee\u01e5\u01f2\u01e5\u01ab\u01e8\u01e5\u01ea\u01e3\u01ab\u01d7\u01f0\u01f6\u01ed\u01ea\u01e3\u01bf", "\u0219\u0218\u0203\u021e\u0211\u020e\u024b\u0249\u025f\u025e\u0221", "\u01b8\u01b9\u01a2\u01bf\u01b0\u01af\u0197\u01ba\u01ba\u01ea\u01e8\u01fe\u01ff\u0180", "\u02ef\u02f9\u02f1\u02ec\u02a4\u02a6\u02b0\u02b1\u02ce", "\u076d\u077b\u0773\u076e\u0726\u0724\u0732\u0750\u0733\u074c", "\u0438\u042e\u0426\u043b\u047f\u0473\u0471\u0467\u0405\u0466\u0419", "\u071f\u0709\u0701\u071c\u0754\u0756\u0740\u0722\u0721\u0741\u073e", "\u0360\u036f\u0368\u0367\u036a\u036f\u037c\u0363\u033a\u0338\u032e\u032f\u0350"})
public final class Class1309 {
    public static float field5080 = Float.intBitsToFloat(1058394200);
    public static float field5081 = Float.intBitsToFloat(1058294148);

    private static String L9dXXW6w1iwg3qN4(String a2, int b2) {
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
    private static CallSite e2NtdZaHVTSVQP(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1309.L9dXXW6w1iwg3qN4(k2, -84675244));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1309.L9dXXW6w1iwg3qN4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1309.L9dXXW6w1iwg3qN4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1309.L9dXXW6w1iwg3qN4(k2, -84675244) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 27040 : 27041;
        block7: while (true) {
            switch (n3) {
                case 27041: {
                    n3 = 27039;
                    continue block7;
                }
                case 27040: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        v\u200e = "Displays the player's gamemode";
        ao\u200e = "Bounce";
    }
}

