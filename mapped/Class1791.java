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

@HACHIMI_CLIENT(mv=100, d1={"\ua31a\ua31d\ua31d\ua31b\ua31a\ua319\ua31e\ua31c", "\u9870\u9875\u9870\u987d\u9874\u9872\u9871\u9876", "\u904c\u904d\u9048\u904e\u904a\u9048\u904f\u904e", "\ua173\ua173\ua172\ua174\ua17f\ua174\ua17f\ua170", "\ucbc4\ucbc0\ucbc7\ucbc5\ucbc7\ucbc0\ucbc3", "\u858c\u858c\u858d\u8589\u8588\u858f\u858b\u858a", "\u8ee7\u8ee2\u8ee5\u8ee5\u8ee6\u8ee4\u8ee2\u8ee0", "\u631a\u631a\u631e\u631e\u631a\u6319\u631e\u6319", "\u1d7b\u1d77\u1d79\u1d79\u1d7a\u1d7a\u1d78\u1d7d", "\u8eed\u8eeb\u8eec\u8eed\u8eec\u8eef\u8eed\u8eeb", "\ubc2b\ubc2d\ubc20\ubc2c\ubc29\ubc21\ubc28\ubc21", "\u9f9b\u9f9f\u9f99\u9f9d\u9f9d\u9f9a", "\u84b8\u84bc\u84bc\u84b4\u84be\u84be\u84b4\u84bb", "\u442a\u442b\u442b\u4429\u4428\u442b\u442a\u442a"}, d2={"\u039f\u03c0\u03cf\u03ca\u03cd\u03ca\u03d7\u039d\u039f\u039d\u038b\u038a\u03f5", "\u0153\u0106\u0101\u0106\u011b\u0151\u0153\u0151\u0147\u0146\u0139", "\u0363\u0361\u0370\u0347\u0368\u0365\u0377\u0377\u0338\u033a\u032c\u032d\u0348\u036e\u0365\u0372\u0365\u032b\u0368\u0365\u036a\u0363\u032b\u0347\u0368\u0365\u0377\u0377\u033f", "\u06cd\u06c4\u06d6\u06cd\u06e6\u06ca\u06c1\u06c0\u0699\u069b\u068d\u068c\u06ec", "\u0737\u0723\u0727\u0733\u073e\u0721\u076e\u076c\u077a\u071e\u0738\u0733\u0724\u0733\u077d\u073e\u0733\u073c\u0735\u077d\u071d\u0730\u0738\u0737\u0731\u0726\u0769\u077b\u0708", "\u03f5\u03fa\u03f9\u03f8\u03f3\u03aa\u03a8\u03be\u03bf\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03d9\u03f4\u03fc\u03f3\u03f5\u03e2\u03ad", "\u04ca\u04d1\u04ed\u04ca\u04cc\u04d7\u04d0\u04d9\u0482\u0480\u0496\u0497\u04f2\u04d4\u04df\u04c8\u04df\u0491\u04d2\u04df\u04d0\u04d9\u0491\u04ed\u04ca\u04cc\u04d7\u04d0\u04d9\u0485", "\u01d1\u01d0\u01cb\u01d6\u01d9\u01c6\u0183\u0181\u0197\u0196\u01e9", "\u04b1\u04b0\u04ab\u04b6\u04b9\u04a6\u049e\u04b3\u04b3\u04e3\u04e1\u04f7\u04f6\u0489", "\u0532\u0524\u052c\u0531\u0579\u057b\u056d\u056c\u0513", "\u03bc\u03aa\u03a2\u03bf\u03f7\u03f5\u03e3\u0381\u03e2\u039d", "\u013e\u0128\u0120\u013d\u0179\u0175\u0177\u0161\u0103\u0160\u011f", "\u06a2\u06b4\u06bc\u06a1\u06e9\u06eb\u06fd\u069f\u069c\u06fc\u0683", "\u012f\u0120\u0127\u0128\u0125\u0120\u0133\u012c\u0175\u0177\u0161\u0160\u011f"})
public final class Class1791 {
    public static double field6695 = Double.longBitsToDouble(4599714301342793238L);
    public static double field6696 = Double.longBitsToDouble(4598980999644956870L);

    /*
     * WARNING - void declaration
     */
    private static CallSite BjS7rM1l4avOPo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1791.BOwt0bSIJbe9FrGB(k2, 380522302));
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
                int a2 = Integer.parseInt(Class1791.BOwt0bSIJbe9FrGB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1791.BOwt0bSIJbe9FrGB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1791.BOwt0bSIJbe9FrGB(k2, 380522302) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String BOwt0bSIJbe9FrGB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

