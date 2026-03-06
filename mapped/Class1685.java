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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u15cb\u15c7\u15c7\u15c6\u15cc\u15cf\u15ca", "\u8665\u8665\u8667\u8667\u8663\u8667\u8667\u8661", "\u5031\u5034\u5034\u5030\u503e\u503e\u5035", "\u141f\u141d\u141e\u141b\u1412\u141b\u141b\u141a", "\u3687\u3685\u3684\u3681\u3681\u3687\u3682\u3684", "\u4ad0\u4ad8\u4ad2\u4ad6\u4ad4\u4ad0\u4ad8\u4ad5", "\ub45b\ub45d\ub45a\ub454\ub459\ub45e\ub45f\ub454", "\u4256\u4254\u4251\u4254\u4250\u4252\u4254\u4250", "\u4290\u429c\u429d\u429f\u4298\u4291\u429c", "\u50e8\u50e8\u50ea\u50ed\u50eb\u50e9\u50e4\u50eb", "\ucefb\ucef1\ucefb\ucef8\ucef8\ucef1\ucef1\ucef1", "\u4122\u4126\u4123\u4124\u4120\u4128\u4125\u4120", "\ud2ae\ud2ac\ud2a9\ud2ab\ud2ae\ud2a8\ud2ac", "\ubd09\ubd02\ubd0e\ubd09\ubd02\ubd0a\ubd0e\ubd03", "\u9be3\u9be7\u9be0\u9be9\u9be4\u9be5\u9be0\u9be3", "\u5720\u5726\u5725\u5726\u5723\u5725\u5728\u5721"}, d2={"\u009c\u0097\u00b9\u20f1\u00c3\u00c1\u00d7\u00b3\u0095\u009e\u0089\u009e\u00d0\u0093\u009e\u0091\u0098\u00d0\u00ac\u008b\u008d\u0096\u0091\u0098\u00c4\u00d6\u00b3\u0095\u009e\u0089\u009e\u00d0\u0093\u009e\u0091\u0098\u00d0\u00ac\u008b\u008d\u0096\u0091\u0098\u00c4", "\u01b1\u01ba\u0195\u21dc\u01ee\u01ec\u01fa\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9\u01fb\u019e\u01b8\u01b3\u01a4\u01b3\u01fd\u01be\u01b3\u01bc\u01b5\u01fd\u0181\u01a6\u01a0\u01bb\u01bc\u01b5\u01e9", "\u0465\u043a\u0435\u0430\u0437\u0430\u042d\u0467\u0465\u0467\u0471\u0470\u040f", "\u00eb\u00be\u00b9\u00be\u00a3\u00e9\u00eb\u00e9\u00ff\u00fe\u0081", "\u0356\u0354\u0345\u0372\u035d\u0350\u0342\u0342\u030d\u030f\u0319\u0318\u037d\u035b\u0350\u0347\u0350\u031e\u035d\u0350\u035f\u0356\u031e\u0372\u035d\u0350\u0342\u0342\u030a", "\u06a4\u06ad\u06bf\u06a4\u068f\u06a3\u06a8\u06a9\u06f0\u06f2\u06e4\u06e5\u0685", "1%!58'hj|\u0018>5\"5{85:3{\u001b6>17 o}\u000e", "\u0312\u031d\u031e\u031f\u0314\u034d\u034f\u0359\u0358\u033d\u031b\u0310\u0307\u0310\u035e\u031d\u0310\u031f\u0316\u035e\u033e\u0313\u031b\u0314\u0312\u0305\u034a", "\u07dc\u07c7\u07fb\u07dc\u07da\u07c1\u07c6\u07cf\u0794\u0796\u0780\u0781\u07e4\u07c2\u07c9\u07de\u07c9\u0787\u07c4\u07c9\u07c6\u07cf\u0787\u07fb\u07dc\u07da\u07c1\u07c6\u07cf\u0793", "\u04ff\u04fe\u04e5\u04f8\u04f7\u04e8\u04ad\u04af\u04b9\u04b8\u04c7", "\u02c9\u02c8\u02d3\u02ce\u02c1\u02de\u02e6\u02cb\u02cb\u029b\u0299\u028f\u028e\u02f1", "\u0425\u0433\u043b\u0426\u046e\u046c\u047a\u047b\u0404", "\u0773\u0765\u076d\u0770\u0738\u073a\u072c\u074e\u072d\u0752", "\u01ab\u01bd\u01b5\u01a8\u01ec\u01e0\u01e2\u01f4\u0196\u01f5\u018a", "\u0774\u0762\u076a\u0777\u073f\u073d\u072b\u0749\u074a\u072a\u0755", "\u0588\u0587\u0580\u058f\u0582\u0587\u0594\u058b\u05d2\u05d0\u05c6\u05c7\u05b8"})
public final class Class1685 {
    public static double field6247;

    /*
     * WARNING - void declaration
     */
    private static CallSite 4fep75BrFdIeLW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1685.TNiiFgnwXi6ZtMBB(k2, 486848658));
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
                int a2 = Integer.parseInt(Class1685.TNiiFgnwXi6ZtMBB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1685.TNiiFgnwXi6ZtMBB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1685.TNiiFgnwXi6ZtMBB(k2, 486848658) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String TNiiFgnwXi6ZtMBB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        d\u200e = "The render color for players";
        q\u200e = "Scale of text";
        field6247 = Double.longBitsToDouble(0x4020000000000000L);
    }
}

