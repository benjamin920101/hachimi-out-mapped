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

@HACHIMI_CLIENT(mv=100, d1={"\u0551\u0557\u0554\u0553\u0554\u0556\u0554\u0556", "\u858d\u858c\u8583\u8585\u8580\u8584", "\u2c42\u2c45\u2c47\u2c44\u2c47\u2c49\u2c42", "\u9b65\u9b61\u9b67\u9b62\u9b65\u9b61\u9b61\u9b61", "\ud2b5\ud2b7\ud2b6\ud2be\ud2b5\ud2b6\ud2bf\ud2b7", "\u4c79\u4c7f\u4c79\u4c7f\u4c79\u4c71\u4c7c\u4c7c", "\u7931\u7937\u7931\u7938\u7933\u7933\u7939\u7932", "\ue445\ue445\ue447\ue447\ue444\ue440\ue444\ue447", "\ua350\ua356\ua357\ua354\ua35b\ua351\ua357\ua351", "\u0457\u0452\u0450\u0450\u0450\u0455\u045b\u0452", "\u57da\u57db\u57d7\u57d4\u57d2\u57d6\u57da", "\u8c2a\u8c28\u8c26\u8c2f\u8c2d\u8c2f\u8c28", "\uc650\uc651\uc65e\uc656\uc651\uc655\uc657", "\u2d10\u2d12\u2d15\u2d13\u2d12\u2d14\u2d13\u2d16", "\ud8cc\ud8cf\ud8cb\ud8ce\ud8ce\ud8ca\ud8cc\ud8ca", "\u3bf0\u3bf1\u3bf0\u3bf5\u3bfc\u3bfc\u3bf0\u3bf3"}, d2={"\u05bc\u059e\u05ae\u25d5\u05e7\u05e5\u05f3\u0597\u05b1\u05ba\u05ad\u05ba\u05f4\u05b7\u05ba\u05b5\u05bc\u05f4\u0588\u05af\u05a9\u05b2\u05b5\u05bc\u05e0\u05f2\u0597\u05b1\u05ba\u05ad\u05ba\u05f4\u05b7\u05ba\u05b5\u05bc\u05f4\u0588\u05af\u05a9\u05b2\u05b5\u05bc\u05e0", "\u0640\u0662\u0651\u2629\u061b\u0619\u060f\u066b\u064d\u0646\u0651\u0646\u0608\u064b\u0646\u0649\u0640\u0608\u0674\u0653\u0655\u064e\u0649\u0640\u061c\u060e\u066b\u064d\u0646\u0651\u0646\u0608\u064b\u0646\u0649\u0640\u0608\u0674\u0653\u0655\u064e\u0649\u0640\u061c", "0o`ebex202$%Z", "\u037e\u032b\u032c\u032b\u0336\u037c\u037e\u037c\u036a\u036b\u0314", "\u04b0\u04b2\u04a3\u0494\u04bb\u04b6\u04a4\u04a4\u04eb\u04e9\u04ff\u04fe\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0494\u04bb\u04b6\u04a4\u04a4\u04ec", "\u0225\u022c\u023e\u0225\u020e\u0222\u0229\u0228\u0271\u0273\u0265\u0264\u0204", "\u033a\u032e\u032a\u033e\u0333\u032c\u0363\u0361\u0377\u0313\u0335\u033e\u0329\u033e\u0370\u0333\u033e\u0331\u0338\u0370\u0310\u033d\u0335\u033a\u033c\u032b\u0364\u0376\u0305", "\u04e5\u04ea\u04e9\u04e8\u04e3\u04ba\u04b8\u04ae\u04af\u04ca\u04ec\u04e7\u04f0\u04e7\u04a9\u04ea\u04e7\u04e8\u04e1\u04a9\u04c9\u04e4\u04ec\u04e3\u04e5\u04f2\u04bd", "\u0512\u0509\u0535\u0512\u0514\u050f\u0508\u0501\u055a\u0558\u054e\u054f\u052a\u050c\u0507\u0510\u0507\u0549\u050a\u0507\u0508\u0501\u0549\u0535\u0512\u0514\u050f\u0508\u0501\u055d", "\u01a4\u01a5\u01be\u01a3\u01ac\u01b3\u01f6\u01f4\u01e2\u01e3\u019c", "\u02f4\u02f5\u02ee\u02f3\u02fc\u02e3\u02db\u02f6\u02f6\u02a6\u02a4\u02b2\u02b3\u02cc", "\u0159\u014f\u0147\u015a\u0112\u0110\u0106\u0107\u0178", "\u02b1\u02a7\u02af\u02b2\u02fa\u02f8\u02ee\u028c\u02ef\u0290", "\u06ec\u06fa\u06f2\u06ef\u06ab\u06a7\u06a5\u06b3\u06d1\u06b2\u06cd", "\u07e1\u07f7\u07ff\u07e2\u07aa\u07a8\u07be\u07dc\u07df\u07bf\u07c0", "\u0653\u065c\u065b\u0654\u0659\u065c\u064f\u0650\u0609\u060b\u061d\u061c\u0663"})
public final class Class5024 {
    public static int field10052 = -879309927;
    public static double field10053;
    public static double field10054;
    public static long field10055 = -1866655124536755780L;
    public static double field10056;
    public static float field10057;
    public static double field10058;
    public static float field10059 = 0.7954392f;

    static {
        field10056 = Double.longBitsToDouble(4604655041870383586L);
        field10057 = Float.intBitsToFloat(1064804162);
        field10053 = Double.longBitsToDouble(4585086173992951696L);
        field10054 = Double.longBitsToDouble(4604745637817278307L);
        bd\u200e = "SwapAction";
        field10058 = Double.longBitsToDouble(4591303385105562704L);
        by\u200e = "RIGID";
    }

    private static String vflIUg1JzodBV3wi(String a2, int b2) {
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
    private static CallSite VNqlQj4Ibtz6Z1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5024.vflIUg1JzodBV3wi(k2, 1721711425));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5024.vflIUg1JzodBV3wi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 34998 : 34999;
            block7: while (true) {
                switch (n3) {
                    case 34999: {
                        n3 = 34997;
                        continue block7;
                    }
                    case 34998: {
                        String c2 = Class5024.vflIUg1JzodBV3wi(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5024.vflIUg1JzodBV3wi(k2, 1721711425) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

