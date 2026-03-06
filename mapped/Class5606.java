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

@HACHIMI_CLIENT(mv=100, d1={"\u1575\u1574\u1574\u1572\u1576\u1570\u157e\u1576", "\uc4ec\uc4eb\uc4e9\uc4eb\uc4e3\uc4ee\uc4ef\uc4ea", "\u726d\u7264\u7265\u726a\u7264\u7268\u726c\u726e", "\u1373\u1376\u1374\u1373\u1371\u1373\u1377\u1372", "\u0ec4\u0ecb\u0ec2\u0eca\u0ecb\u0ecb\u0ec6\u0ec4", "\u0ffa\u0fff\u0ff8\u0ff5\u0ffd\u0ff4\u0ffc\u0ffa", "\u862a\u862d\u862a\u8629\u862c\u8629\u862f\u8626", "\u5988\u5988\u5984\u5989\u598b\u5984\u5984\u598b", "\ub1a0\ub1a3\ub1ab\ub1a2\ub1a0\ub1aa\ub1a5\ub1a5", "\u056c\u0569\u056b\u0569\u056e\u0560\u056b\u0569", "\uce0f\uce09\uce0c\uce0e\uce0d\uce07\uce0a", "\ub22e\ub22d\ub22e\ub22f\ub22f\ub22c\ub228\ub22e", "\u77a5\u77a6\u77a2\u77a5\u77a2\u77a4\u77a1\u77a6", "\u3b9e\u3b9a\u3b9c\u3b9b\u3b99\u3b98\u3b98\u3b90"}, d2={"\u017d\u0122\u012d\u0128\u012f\u0128\u0135\u017f\u017d\u017f\u0169\u0168\u0117", "\u01fe\u01ab\u01ac\u01ab\u01b6\u01fc\u01fe\u01fc\u01ea\u01eb\u0194", "\u0325\u0327\u0336\u0301\u032e\u0323\u0331\u0331\u037e\u037c\u036a\u036b\u030e\u0328\u0323\u0334\u0323\u036d\u032e\u0323\u032c\u0325\u036d\u0301\u032e\u0323\u0331\u0331\u0379", "\u0207\u020e\u021c\u0207\u022c\u0200\u020b\u020a\u0253\u0251\u0247\u0246\u0226", "\u06fc\u06e8\u06ec\u06f8\u06f5\u06ea\u06a5\u06a7\u06b1\u06d5\u06f3\u06f8\u06ef\u06f8\u06b6\u06f5\u06f8\u06f7\u06fe\u06b6\u06d6\u06fb\u06f3\u06fc\u06fa\u06ed\u06a2\u06b0\u06c3", "\u05da\u05d5\u05d6\u05d7\u05dc\u0585\u0587\u0591\u0590\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05f6\u05db\u05d3\u05dc\u05da\u05cd\u0582", "\u06aa\u06b1\u068d\u06aa\u06ac\u06b7\u06b0\u06b9\u06e2\u06e0\u06f6\u06f7\u0692\u06b4\u06bf\u06a8\u06bf\u06f1\u06b2\u06bf\u06b0\u06b9\u06f1\u068d\u06aa\u06ac\u06b7\u06b0\u06b9\u06e5", "\u05ad\u05ac\u05b7\u05aa\u05a5\u05ba\u05ff\u05fd\u05eb\u05ea\u0595", "\u0691\u0690\u068b\u0696\u0699\u0686\u06be\u0693\u0693\u06c3\u06c1\u06d7\u06d6\u06a9", "\u019f\u0189\u0181\u019c\u01d4\u01d6\u01c0\u01c1\u01be", "\u0338\u032e\u0326\u033b\u0373\u0371\u0367\u0305\u0366\u0319", "\u03d8\u03ce\u03c6\u03db\u039f\u0393\u0391\u0387\u03e5\u0386\u03f9", "\u018b\u019d\u0195\u0188\u01c0\u01c2\u01d4\u01b6\u01b5\u01d5\u01aa", "LCDKFCPO\u0016\u0014\u0002\u0003|"})
public final class Class5606 {
    public static double field10692;
    public static double field10693;
    public static float field10694;

    static {
        field10694 = Float.intBitsToFloat(1058522639);
        field10693 = Double.longBitsToDouble(4604328594533392515L);
        field10692 = Double.longBitsToDouble(4601655985493551718L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite tseRYeYt79Vrkw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5606.N1o0dEl4Dq1WpzLm(k2, 2142987504));
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
                int a2 = Integer.parseInt(Class5606.N1o0dEl4Dq1WpzLm(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5606.N1o0dEl4Dq1WpzLm(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5606.N1o0dEl4Dq1WpzLm(k2, 2142987504) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String N1o0dEl4Dq1WpzLm(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 25105 : 25106;
            block5: while (true) {
                switch (n2) {
                    case 25106: {
                        n2 = 25104;
                        continue block5;
                    }
                    case 25105: {
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
}

