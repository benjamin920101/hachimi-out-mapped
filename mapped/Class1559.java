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

@HACHIMI_CLIENT(mv=100, d1={"\u96c5\u96c5\u96ce\u96c9\u96cd\u96cd\u96c8", "\u63d0\u63d1\u63de\u63d0\u63d6\u63df\u63df\u63d1", "\ue1d5\ue1de\ue1d1\ue1d0\ue1df\ue1de\ue1de\ue1d6", "\u6c32\u6c31\u6c32\u6c38\u6c39\u6c34\u6c39\u6c37", "\ue7ad\ue7ad\ue7af\ue7af\ue7ae\ue7ad\ue7a1\ue7ab", "\u4d31\u4d30\u4d31\u4d35\u4d30\u4d37\u4d33\u4d35", "\ue319\ue31d\ue31e\ue31e\ue319\ue31a\ue31a\ue31c", "\u35fa\u35fa\u35fa\u35fa\u35f0\u35fd\u35fa\u35f1", "\u4275\u4277\u4276\u4277\u4278\u4273\u4271\u4277", "\u025a\u0255\u025f\u0254\u0258\u0259\u025e\u0259", "\udf53\udf57\udf57\udf5c\udf51\udf57\udf50\udf51", "\u1e52\u1e55\u1e54\u1e55\u1e53\u1e56\u1e52\u1e55", "\udc6e\udc6e\udc6e\udc6d\udc68\udc6e\udc68\udc6e", "\u51ce\u51cc\u51c8\u51c8\u51c7\u51c9\u51ca\u51c7"}, d2={"\u033d\u0362\u036d\u0368\u036f\u0368\u0375\u033f\u033d\u033f\u0329\u0328\u0357", "\u0477\u0422\u0425\u0422\u043f\u0475\u0477\u0475\u0463\u0462\u041d", "\u0168\u016a\u017b\u014c\u0163\u016e\u017c\u017c\u0133\u0131\u0127\u0126\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u014c\u0163\u016e\u017c\u017c\u0134", "\u0183\u018a\u0198\u0183\u01a8\u0184\u018f\u018e\u01d7\u01d5\u01c3\u01c2\u01a2", "\u0595\u0581\u0585\u0591\u059c\u0583\u05cc\u05ce\u05d8\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05bf\u0592\u059a\u0595\u0593\u0584\u05cb\u05d9\u05aa", "\u06f8\u06f7\u06f4\u06f5\u06fe\u06a7\u06a5\u06b3\u06b2\u06d7\u06f1\u06fa\u06ed\u06fa\u06b4\u06f7\u06fa\u06f5\u06fc\u06b4\u06d4\u06f9\u06f1\u06fe\u06f8\u06ef\u06a0", "\u0276\u026d\u0251\u0276\u0270\u026b\u026c\u0265\u023e\u023c\u022a\u022b\u024e\u0268\u0263\u0274\u0263\u022d\u026e\u0263\u026c\u0265\u022d\u0251\u0276\u0270\u026b\u026c\u0265\u0239", "\u0610\u0611\u060a\u0617\u0618\u0607\u0642\u0640\u0656\u0657\u0628", "\u02f1\u02f0\u02eb\u02f6\u02f9\u02e6\u02de\u02f3\u02f3\u02a3\u02a1\u02b7\u02b6\u02c9", "\u0727\u0731\u0739\u0724\u076c\u076e\u0778\u0779\u0706", "\u023b\u022d\u0225\u0238\u0270\u0272\u0264\u0206\u0265\u021a", "\u0402\u0414\u041c\u0401\u0445\u0449\u044b\u045d\u043f\u045c\u0423", "\u01e4\u01f2\u01fa\u01e7\u01af\u01ad\u01bb\u01d9\u01da\u01ba\u01c5", "\u04cf\u04c0\u04c7\u04c8\u04c5\u04c0\u04d3\u04cc\u0495\u0497\u0481\u0480\u04ff"})
public final class Class1559 {
    public static double field5848;
    public static double field5849;
    public static int field5850 = 0;

    static {
        field5849 = Double.longBitsToDouble(4604249905570213423L);
        field5848 = Double.longBitsToDouble(4586531299106823408L);
    }

    private static String vtgZPBTcZUdoqdpX(String a2, int b2) {
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
    private static CallSite yVUIH9djAu4rQu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1559.vtgZPBTcZUdoqdpX(k2, 280718003));
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
                int a2 = Integer.parseInt(Class1559.vtgZPBTcZUdoqdpX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1559.vtgZPBTcZUdoqdpX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 36647 : 36648;
        block7: while (true) {
            switch (n3) {
                case 36648: {
                    n3 = 36646;
                    continue block7;
                }
                case 36647: {
                    throw new Exception("Can't find method in " + Class1559.vtgZPBTcZUdoqdpX(k2, 280718003) + " " + l2 + " " + m2);
                }
            }
            break;
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

