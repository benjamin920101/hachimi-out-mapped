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

@HACHIMI_CLIENT(mv=100, d1={"\ub295\ub293\ub290\ub295\ub291\ub294\ub295\ub298", "\u26de\u26df\u26d3\u26d2\u26dd\u26d3\u26dc\u26dc", "\u3b7e\u3b72\u3b73\u3b7b\u3b7b\u3b7e\u3b7d\u3b7f", "\u94ff\u94fe\u94fd\u94fd\u94fa\u94f3\u94fd\u94f9", "\u0bee\u0bee\u0be8\u0bef\u0be9\u0be2\u0be2\u0bef", "\u0aac\u0aad\u0aa0\u0aa8\u0aad\u0aab\u0aaf\u0aae", "\u75b1\u75b5\u75bf\u75b4\u75b2\u75b0\u75b5", "\u682d\u682a\u682e\u6827\u682d\u682c\u682b\u6826", "\ud846\ud846\ud842\ud845\ud840\ud844\ud844\ud84d", "\ub68b\ub68c\ub68b\ub689\ub68c\ub687\ub68c\ub689", "\u2ffd\u2ffc\u2ffc\u2ff7\u2ffc\u2fff\u2ffd\u2ffc", "\u7c59\u7c5d\u7c59\u7c5d\u7c51\u7c5b\u7c5a\u7c5e", "\u5c4a\u5c4b\u5c4e\u5c48\u5c40\u5c4a\u5c4c\u5c4c", "\u84d7\u84d5\u84d4\u84da\u84d7\u84d3\u84db\u84d6", "\u43c6\u43c2\u43c4\u43c4\u43c1\u43c7\u43c1\u43cb", "\u850c\u850e\u850b\u850d\u850c\u8503\u8503\u850f"}, d2={"\u0341\u036f\u0341\u232d\u031f\u031d\u030b\u036f\u0349\u0342\u0355\u0342\u030c\u034f\u0342\u034d\u0344\u030c\u0370\u0357\u0351\u034a\u034d\u0344\u0318\u030a\u036f\u0349\u0342\u0355\u0342\u030c\u034f\u0342\u034d\u0344\u030c\u0370\u0357\u0351\u034a\u034d\u0344\u0318", "\u01f2\u01dc\u01f3\u219e\u01ac\u01ae\u01b8\u01dc\u01fa\u01f1\u01e6\u01f1\u01bf\u01fc\u01f1\u01fe\u01f7\u01bf\u01c3\u01e4\u01e2\u01f9\u01fe\u01f7\u01ab\u01b9\u01dc\u01fa\u01f1\u01e6\u01f1\u01bf\u01fc\u01f1\u01fe\u01f7\u01bf\u01c3\u01e4\u01e2\u01f9\u01fe\u01f7\u01ab", "\u07c7\u0798\u0797\u0792\u0795\u0792\u078f\u07c5\u07c7\u07c5\u07d3\u07d2\u07ad", "\u0149\u011c\u011b\u011c\u0101\u014b\u0149\u014b\u015d\u015c\u0123", "\u02e6\u02e4\u02f5\u02c2\u02ed\u02e0\u02f2\u02f2\u02bd\u02bf\u02a9\u02a8\u02cd\u02eb\u02e0\u02f7\u02e0\u02ae\u02ed\u02e0\u02ef\u02e6\u02ae\u02c2\u02ed\u02e0\u02f2\u02f2\u02ba", "\u0190\u0199\u018b\u0190\u01bb\u0197\u019c\u019d\u01c4\u01c6\u01d0\u01d1\u01b1", "\u02fc\u02e8\u02ec\u02f8\u02f5\u02ea\u02a5\u02a7\u02b1\u02d5\u02f3\u02f8\u02ef\u02f8\u02b6\u02f5\u02f8\u02f7\u02fe\u02b6\u02d6\u02fb\u02f3\u02fc\u02fa\u02ed\u02a2\u02b0\u02c3", "\u0274\u027b\u0278\u0279\u0272\u022b\u0229\u023f\u023e\u025b\u027d\u0276\u0261\u0276\u0238\u027b\u0276\u0279\u0270\u0238\u0258\u0275\u027d\u0272\u0274\u0263\u022c", "\u0105\u011e\u0122\u0105\u0103\u0118\u011f\u0116\u014d\u014f\u0159\u0158\u013d\u011b\u0110\u0107\u0110\u015e\u011d\u0110\u011f\u0116\u015e\u0122\u0105\u0103\u0118\u011f\u0116\u014a", "\u008f\u008e\u0095\u0088\u0087\u0098\u00dd\u00df\u00c9\u00c8\u00b7", "\u060b\u060a\u0611\u060c\u0603\u061c\u0624\u0609\u0609\u0659\u065b\u064d\u064c\u0633", "\u0589\u059f\u0597\u058a\u05c2\u05c0\u05d6\u05d7\u05a8", "\u010a\u011c\u0114\u0109\u0141\u0143\u0155\u0137\u0154\u012b", "\u0638\u062e\u0626\u063b\u067f\u0673\u0671\u0667\u0605\u0666\u0619", "\u07da\u07cc\u07c4\u07d9\u0791\u0793\u0785\u07e7\u07e4\u0784\u07fb", "\u0152\u015d\u015a\u0155\u0158\u015d\u014e\u0151\u0108\u010a\u011c\u011d\u0162"})
public final class Class3362 {
    public static double field7291;
    public static double field7292 = 0.14552432369636903;
    public static float field7293;

    static {
        field7293 = Float.intBitsToFloat(0x41100000);
        field7291 = Double.longBitsToDouble(4607130122063990729L);
        J\u200e = " ";
        by\u200e = "StrafeBoost";
    }

    private static String Vw9byaXuUrLua0rA(String a2, int b2) {
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
    private static CallSite AAhTpTWoFw4Dw0(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3362.Vw9byaXuUrLua0rA(k2, -1265542250));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3362.Vw9byaXuUrLua0rA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3362.Vw9byaXuUrLua0rA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3362.Vw9byaXuUrLua0rA(k2, -1265542250) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 11603 : 11602;
        block7: while (true) {
            switch (n3) {
                case 11603: {
                    n3 = 11601;
                    continue block7;
                }
                case 11602: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

