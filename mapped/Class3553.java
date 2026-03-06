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

@HACHIMI_CLIENT(mv=100, d1={"\ue7ed\ue7eb\ue7ec\ue7ef\ue7ef\ue7ed\ue7ec\ue7ed", "\u1259\u125b\u125b\u125c\u125d\u125c\u1250\u1258", "\u66ff\u66fc\u66f8\u66ff\u66fb\u66fe\u66f4\u66f9", "\ua74c\ua74d\ua74c\ua749\ua74e\ua74f\ua74e\ua746", "\u84c4\u84c5\u84c6\u84c7\u84c7\u84c8\u84c0\u84c7", "\u3186\u3180\u3182\u3181\u3183\u318c\u3187\u3180", "\ub4d1\ub4d5\ub4d4\ub4dd\ub4d2\ub4d2\ub4d7\ub4d2", "\ubd78\ubd7f\ubd7f\ubd74\ubd74\ubd7f\ubd7d", "\u1e2d\u1e28\u1e2e\u1e2f\u1e2f\u1e20\u1e2c", "\u9c13\u9c14\u9c12\u9c14\u9c12\u9c1a\u9c12\u9c11", "\u9b1f\u9b19\u9b1e\u9b1f\u9b1b\u9b15\u9b1d\u9b1d", "\u1452\u1458\u1458\u1451\u1459\u1455\u1451\u1456", "\u280b\u280f\u280d\u2809\u280f\u280f\u2804", "\u2de5\u2de1\u2de1\u2de7\u2de1\u2de1\u2de9\u2de1", "\uafee\uafe8\uafef\uafeb\uafe3\uafeb\uafe2\uafea", "\u11da\u11da\u11db\u11da\u11dd\u11de\u11da\u11d7"}, d2={"\u03ce\u03e2\u03fe\u23a4\u0396\u0394\u0382\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391\u0383\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391", "\u02f2\u02de\u02c3\u2298\u02aa\u02a8\u02be\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad\u02bf\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad", "\u0151\u010e\u0101\u0104\u0103\u0104\u0119\u0153\u0151\u0153\u0145\u0144\u013b", "\u054d\u0518\u051f\u0518\u0505\u054f\u054d\u054f\u0559\u0558\u0527", "\u0463\u0461\u0470\u0447\u0468\u0465\u0477\u0477\u0438\u043a\u042c\u042d\u0448\u046e\u0465\u0472\u0465\u042b\u0468\u0465\u046a\u0463\u042b\u0447\u0468\u0465\u0477\u0477\u043f", "\u0341\u0348\u035a\u0341\u036a\u0346\u034d\u034c\u0315\u0317\u0301\u0300\u0360", "\u030a\u031e\u031a\u030e\u0303\u031c\u0353\u0351\u0347\u0323\u0305\u030e\u0319\u030e\u0340\u0303\u030e\u0301\u0308\u0340\u0320\u030d\u0305\u030a\u030c\u031b\u0354\u0346\u0335", "\u037a\u0375\u0376\u0377\u037c\u0325\u0327\u0331\u0330\u0355\u0373\u0378\u036f\u0378\u0336\u0375\u0378\u0377\u037e\u0336\u0356\u037b\u0373\u037c\u037a\u036d\u0322", "\u0631\u062a\u0616\u0631\u0637\u062c\u062b\u0622\u0679\u067b\u066d\u066c\u0609\u062f\u0624\u0633\u0624\u066a\u0629\u0624\u062b\u0622\u066a\u0616\u0631\u0637\u062c\u062b\u0622\u067e", "\u077a\u077b\u0760\u077d\u0772\u076d\u0728\u072a\u073c\u073d\u0742", "\u06b7\u06b6\u06ad\u06b0\u06bf\u06a0\u0698\u06b5\u06b5\u06e5\u06e7\u06f1\u06f0\u068f", "\u06bb\u06ad\u06a5\u06b8\u06f0\u06f2\u06e4\u06e5\u069a", "\u0180\u0196\u019e\u0183\u01cb\u01c9\u01df\u01bd\u01de\u01a1", "\u026b\u027d\u0275\u0268\u022c\u0220\u0222\u0234\u0256\u0235\u024a", "\u01ee\u01f8\u01f0\u01ed\u01a5\u01a7\u01b1\u01d3\u01d0\u01b0\u01cf", "\u05d5\u05da\u05dd\u05d2\u05df\u05da\u05c9\u05d6\u058f\u058d\u059b\u059a\u05e5"})
public final class Class3553 {
    public static double field7879;
    public static int field7880 = 64373;
    public static float field7881;
    public static float field7882 = 0.316837f;
    public static double field7883;

    /*
     * WARNING - void declaration
     */
    private static CallSite cL4X9utvMSS2HY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3553.oZ1zWBYsYwF2DHsz(k2, -911778824));
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
                int a2 = Integer.parseInt(Class3553.oZ1zWBYsYwF2DHsz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3553.oZ1zWBYsYwF2DHsz(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3553.oZ1zWBYsYwF2DHsz(k2, -911778824) + " " + l2 + " " + m2);
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
        E\u200e = "Swaps chorus item when click";
        field7881 = Float.intBitsToFloat(1046035608);
        ax\u200e = "OFFHAND";
        field7883 = Double.longBitsToDouble(4626604192193052672L);
        field7879 = Double.longBitsToDouble(4598458376785676300L);
    }

    private static String oZ1zWBYsYwF2DHsz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

