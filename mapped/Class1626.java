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

@HACHIMI_CLIENT(mv=100, d1={"\uc1e6\uc1ea\uc1e5\uc1e5\uc1e5\uc1e2\uc1e4\uc1e5", "\u1594\u1592\u1596\u1596\u1591\u1596\u1597\u1595", "\u9c8f\u9c8d\u9c84\u9c88\u9c8f\u9c89\u9c8a\u9c8e", "\u691c\u691e\u6910\u691e\u691c\u6911\u6911\u691b", "\u5648\u564a\u5648\u564d\u564b\u564f\u564b\u5642", "\u44df\u44d4\u44d8\u44d5\u44dd\u44d8\u44da\u44da", "\ue1ea\ue1ec\ue1e6\ue1e8\ue1ed\ue1e8\ue1e7", "\u7827\u7823\u782f\u782f\u7824\u7826\u7827\u782e", "\ua3a6\ua3a5\ua3a6\ua3a4\ua3aa\ua3a5\ua3a5", "\u7182\u7188\u7186\u7187\u7186\u7180\u7182\u7181", "\u3776\u3773\u3778\u3776\u3777\u3774\u3773", "\uc110\uc114\uc113\uc117\uc110\uc11d\uc115\uc112", "\u9dd0\u9dd1\u9dd1\u9dd5\u9dd4\u9dd8\u9dd8\u9dd2", "\u75c7\u75c2\u75c1\u75cd\u75c0\u75cc\u75c2\u75c1"}, d2={"\u04aa\u04f5\u04fa\u04ff\u04f8\u04ff\u04e2\u04a8\u04aa\u04a8\u04be\u04bf\u04c0", "\u01a2\u01f7\u01f0\u01f7\u01ea\u01a0\u01a2\u01a0\u01b6\u01b7\u01c8", "\u06b3\u06b1\u06a0\u0697\u06b8\u06b5\u06a7\u06a7\u06e8\u06ea\u06fc\u06fd\u0698\u06be\u06b5\u06a2\u06b5\u06fb\u06b8\u06b5\u06ba\u06b3\u06fb\u0697\u06b8\u06b5\u06a7\u06a7\u06ef", "\u0311\u0318\u030a\u0311\u033a\u0316\u031d\u031c\u0345\u0347\u0351\u0350\u0330", "\u060c\u0618\u061c\u0608\u0605\u061a\u0655\u0657\u0641\u0625\u0603\u0608\u061f\u0608\u0646\u0605\u0608\u0607\u060e\u0646\u0626\u060b\u0603\u060c\u060a\u061d\u0652\u0640\u0633", "\u0234\u023b\u0238\u0239\u0232\u026b\u0269\u027f\u027e\u021b\u023d\u0236\u0221\u0236\u0278\u023b\u0236\u0239\u0230\u0278\u0218\u0235\u023d\u0232\u0234\u0223\u026c", "\u0705\u071e\u0722\u0705\u0703\u0718\u071f\u0716\u074d\u074f\u0759\u0758\u073d\u071b\u0710\u0707\u0710\u075e\u071d\u0710\u071f\u0716\u075e\u0722\u0705\u0703\u0718\u071f\u0716\u074a", "\u01ad\u01ac\u01b7\u01aa\u01a5\u01ba\u01ff\u01fd\u01eb\u01ea\u0195", "\u0102\u0103\u0118\u0105\u010a\u0115\u012d\u0100\u0100\u0150\u0152\u0144\u0145\u013a", "\u05de\u05c8\u05c0\u05dd\u0595\u0597\u0581\u0580\u05ff", "\u0232\u0224\u022c\u0231\u0279\u027b\u026d\u020f\u026c\u0213", "\f\u001a\u0012\u000fKGES1R-", "\u04f1\u04e7\u04ef\u04f2\u04ba\u04b8\u04ae\u04cc\u04cf\u04af\u04d0", "\r\u0002\u0005\n\u0007\u0002\u0011\u000eWUCB="})
public final class Class1626 {
    public static double field6056;
    public static double field6057;

    private static String lGjgwVTvaY6W7JHA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6057 = Double.longBitsToDouble(4604012518029558735L);
        field6056 = Double.longBitsToDouble(4605849680925691399L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite RqdFYVmWRhWVyi(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1626.lGjgwVTvaY6W7JHA(k2, -182674323));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 48598 : 48599;
        block6: while (true) {
            switch (n3) {
                case 48599: {
                    n3 = 48597;
                    continue block6;
                }
                case 48598: {
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
                int a2 = Integer.parseInt(Class1626.lGjgwVTvaY6W7JHA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1626.lGjgwVTvaY6W7JHA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1626.lGjgwVTvaY6W7JHA(k2, -182674323) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

