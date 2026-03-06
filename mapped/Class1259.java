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

@HACHIMI_CLIENT(mv=100, d1={"\u57f4\u57f5\u57f5\u57f6\u57ff\u57f4\u57f3\u57f1", "\u16ef\u16ef\u16e8\u16eb\u16ef\u16eb\u16e2\u16e3", "\uc47e\uc47f\uc47b\uc47c\uc471\uc47e\uc47d\uc470", "\ub9af\ub9ae\ub9a5\ub9a4\ub9ae\ub9a9\ub9af\ub9ab", "\u437e\u437d\u437d\u437e\u437e\u4374\u4378\u437a", "\uc3a9\uc3af\uc3a9\uc3ac\uc3aa\uc3a8\uc3a5", "\u2abc\u2abc\u2ab1\u2abe\u2abc\u2aba\u2abc\u2abc", "\u92ad\u92a2\u92a2\u92ae\u92ac\u92af\u92af\u92a2", "\ub991\ub995\ub990\ub995\ub995\ub998\ub998\ub994", "\u64ad\u64aa\u64ac\u64af\u64a8\u64a0\u64ab\u64a9", "\u7a94\u7a90\u7a93\u7a95\u7a91\u7a94\u7a98\u7a91", "\u61b5\u61b7\u61bf\u61b2\u61b1\u61b3\u61b7\u61be", "\u20bf\u20b8\u20b6\u20b8\u20bc\u20b7\u20b8\u20bb", "\u6a3e\u6a3b\u6a3c\u6a3d\u6a3d\u6a3b\u6a3c\u6a31"}, d2={"\u034b\u0314\u031b\u031e\u0319\u031e\u0303\u0349\u034b\u0349\u035f\u035e\u0321", "\u07cf\u079a\u079d\u079a\u0787\u07cd\u07cf\u07cd\u07db\u07da\u07a5", "\u01ca\u01c8\u01d9\u01ee\u01c1\u01cc\u01de\u01de\u0191\u0193\u0185\u0184\u01e1\u01c7\u01cc\u01db\u01cc\u0182\u01c1\u01cc\u01c3\u01ca\u0182\u01ee\u01c1\u01cc\u01de\u01de\u0196", "\u070b\u0702\u0710\u070b\u0720\u070c\u0707\u0706\u075f\u075d\u074b\u074a\u072a", "pd`tyf)+=Y\u007ftct:yt{r:Zw\u007fpva.<O", "\u024e\u0241\u0242\u0243\u0248\u0211\u0213\u0205\u0204\u0261\u0247\u024c\u025b\u024c\u0202\u0241\u024c\u0243\u024a\u0202\u0262\u024f\u0247\u0248\u024e\u0259\u0216", "\u06ce\u06d5\u06e9\u06ce\u06c8\u06d3\u06d4\u06dd\u0686\u0684\u0692\u0693\u06f6\u06d0\u06db\u06cc\u06db\u0695\u06d6\u06db\u06d4\u06dd\u0695\u06e9\u06ce\u06c8\u06d3\u06d4\u06dd\u0681", "\u0266\u0267\u027c\u0261\u026e\u0271\u0234\u0236\u0220\u0221\u025e", "\u05a5\u05a4\u05bf\u05a2\u05ad\u05b2\u058a\u05a7\u05a7\u05f7\u05f5\u05e3\u05e2\u059d", "\u05bd\u05ab\u05a3\u05be\u05f6\u05f4\u05e2\u05e3\u059c", "\u06e5\u06f3\u06fb\u06e6\u06ae\u06ac\u06ba\u06d8\u06bb\u06c4", "\u0659\u064f\u0647\u065a\u061e\u0612\u0610\u0606\u0664\u0607\u0678", "\u0471\u0467\u046f\u0472\u043a\u0438\u042e\u044c\u044f\u042f\u0450", "\u0282\u028d\u028a\u0285\u0288\u028d\u029e\u0281\u02d8\u02da\u02cc\u02cd\u02b2"})
public final class Class1259 {
    public static int field4927 = 211684081;
    public static float field4928 = Float.intBitsToFloat(1040393940);
    public static double field4929 = Double.longBitsToDouble(4566305653670736384L);

    private static String TL2lWi2sOueTowdS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite MNjYVsvtSpbBJO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1259.TL2lWi2sOueTowdS(k2, -1238692019));
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
                int a2 = Integer.parseInt(Class1259.TL2lWi2sOueTowdS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1259.TL2lWi2sOueTowdS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1259.TL2lWi2sOueTowdS(k2, -1238692019) + " " + l2 + " " + m2);
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

