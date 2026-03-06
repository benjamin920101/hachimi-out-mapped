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

@HACHIMI_CLIENT(mv=100, d1={"\u9c16\u9c12\u9c10\u9c1c\u9c17\u9c16\u9c1c\u9c14", "\uc3ad\uc3a9\uc3a7\uc3aa\uc3af\uc3a8\uc3ad\uc3a6", "\u3482\u3484\u3484\u3485\u348f\u3482\u3486\u3481", "\u0649\u064d\u0647\u064c\u064b\u064d\u0646\u0647", "\u616b\u6163\u6163\u616a\u6169\u616a\u6169", "\u60da\u60dc\u60d4\u60d5\u60de\u60dc\u60da\u60da", "\u01db\u01de\u01d7\u01d9\u01d6\u01df\u01d9\u01d9", "\u5d5e\u5d5e\u5d5b\u5d5f\u5d58\u5d5c\u5d59\u5d58", "\ue782\ue783\ue786\ue787\ue782\ue780\ue787\ue784", "\u2969\u2969\u296b\u2962\u2969\u2962\u2969\u296f", "\ub41b\ub41d\ub41b\ub413\ub412\ub41f\ub419\ub412", "\u982f\u9828\u9823\u9822\u982f\u982b\u982b\u982b", "\u4832\u4837\u4831\u4836\u4831\u4836\u4836\u483b", "\u67de\u67df\u67d2\u67d8\u67d3\u67da\u67de\u67dc", "\u55de\u55d5\u55df\u55de\u55d8\u55dc\u55d8\u55dc", "\u822c\u8227\u822b\u8229\u822d\u822b\u8226\u822c", "\uaf00\uaf01\uaf0f\uaf0f\uaf0f\uaf05\uaf0f\uaf07"}, d2={"\u06f9\u06ea\u06dd\u2687\u06b5\u06b7\u06a1\u06c5\u06e3\u06e8\u06ff\u06e8\u06a6\u06e5\u06e8\u06e7\u06ee\u06a6\u06da\u06fd\u06fb\u06e0\u06e7\u06ee\u06b2\u06a0\u06c5\u06e3\u06e8\u06ff\u06e8\u06a6\u06e5\u06e8\u06e7\u06ee\u06a6\u06da\u06fd\u06fb\u06e0\u06e7\u06ee\u06b2", "\u0182\u0191\u01a7\u21fc\u01ce\u01cc\u01da\u01be\u0198\u0193\u0184\u0193\u01dd\u019e\u0193\u019c\u0195\u01dd\u01a1\u0186\u0180\u019b\u019c\u0195\u01c9\u01db\u01be\u0198\u0193\u0184\u0193\u01dd\u019e\u0193\u019c\u0195\u01dd\u01a1\u0186\u0180\u019b\u019c\u0195\u01c9", "\u0703\u0710\u0725\u277d\u074f\u074d\u075b\u073f\u0719\u0712\u0705\u0712\u075c\u071f\u0712\u071d\u0714\u075c\u0720\u0707\u0701\u071a\u071d\u0714\u0748\u075a\u073f\u0719\u0712\u0705\u0712\u075c\u071f\u0712\u071d\u0714\u075c\u0720\u0707\u0701\u071a\u071d\u0714\u0748", "\u0301\u035e\u0351\u0354\u0353\u0354\u0349\u0303\u0301\u0303\u0315\u0314\u036b", "\u04ac\u04f9\u04fe\u04f9\u04e4\u04ae\u04ac\u04ae\u04b8\u04b9\u04c6", "\u042d\u042f\u043e\u0409\u0426\u042b\u0439\u0439\u0476\u0474\u0462\u0463\u0406\u0420\u042b\u043c\u042b\u0465\u0426\u042b\u0424\u042d\u0465\u0409\u0426\u042b\u0439\u0439\u0471", "\r\u0004\u0016\r&\n\u0001\u0000Y[ML,", "\u008d\u0099\u009d\u0089\u0084\u009b\u00d4\u00d6\u00c0\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00a7\u008a\u0082\u008d\u008b\u009c\u00d3\u00c1\u00b2", "\u013b\u0134\u0137\u0136\u013d\u0164\u0166\u0170\u0171\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u0117\u013a\u0132\u013d\u013b\u012c\u0163", "\u01e9\u01f2\u01ce\u01e9\u01ef\u01f4\u01f3\u01fa\u01a1\u01a3\u01b5\u01b4\u01d1\u01f7\u01fc\u01eb\u01fc\u01b2\u01f1\u01fc\u01f3\u01fa\u01b2\u01ce\u01e9\u01ef\u01f4\u01f3\u01fa\u01a6", "\u0581\u0580\u059b\u0586\u0589\u0596\u05d3\u05d1\u05c7\u05c6\u05b9", "\u0011\u0010\u000b\u0016\u0019\u0006>\u0013\u0013CAWV)", "~h`}57! _", "\u010e\u0118\u0110\u010d\u0145\u0147\u0151\u0133\u0150\u012f", "\u01cd\u01db\u01d3\u01ce\u018a\u0186\u0184\u0192\u01f0\u0193\u01ec", "\u0088\u009e\u0096\u008b\u00c3\u00c1\u00d7\u00b5\u00b6\u00d6\u00a9", "2=:58=.1hj|}\u0002"})
public final class Class5523 {
    public static double field10438 = 0.14854172001619537;
    public static float field10439 = Float.intBitsToFloat(1045623424);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite gcVmWpJlgCbTCc(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5523.e86E9xG1pZgtfGBn(k2, -1642031693));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5523.e86E9xG1pZgtfGBn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5523.e86E9xG1pZgtfGBn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 46353 : 46352;
        block7: while (true) {
            switch (n3) {
                case 46353: {
                    n3 = 46351;
                    continue block7;
                }
                case 46352: {
                    throw new Exception("Can't find method in " + Class5523.e86E9xG1pZgtfGBn(k2, -1642031693) + " " + l2 + " " + m2);
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

    static {
        aP\u200e = "EntityControl";
        bj\u200e = "Throw out the Speed potion";
        bk\u200e = "Logout when you arrive at destination";
    }

    private static String e86E9xG1pZgtfGBn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

