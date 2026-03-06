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
@HACHIMI_CLIENT(mv=100, d1={"\uc732\uc733\uc736\uc73d\uc734\uc73c\uc734\uc735", "\u23bd\u23bd\u23bb\u23bd\u23b7\u23b8\u23b7\u23bd", "\u17f2\u17fc\u17f5\u17f7\u17fd\u17f6\u17fd\u17f6", "\u27ea\u27e6\u27ed\u27e9\u27ee\u27ea\u27e7\u27ee", "\ub5f8\ub5fe\ub5fd\ub5fb\ub5ff\ub5fb\ub5f9", "\u62e1\u62e7\u62e3\u62e0\u62e1\u62e3\u62e5\u62e0", "\u55e2\u55e0\u55e7\u55e0\u55e7\u55e1\u55e7\u55e6", "\uada8\uadaf\uadab\uadab\uadad\uada3\uada9\uada3", "\u95f0\u95f7\u95f9\u95f8\u95f3\u95f8\u95f7\u95f9", "\u2174\u2173\u2171\u2177\u2170\u2170\u2170\u2176", "\u905e\u9052\u9055\u9052\u9053\u9056\u9055", "\u245f\u2458\u245f\u245b\u245f\u245b\u245d\u245f", "\u3d50\u3d50\u3d56\u3d56\u3d52\u3d5e\u3d51\u3d52", "\u03bd\u03bb\u03bb\u03b8\u03bf\u03b8\u03bd\u03b8", "\u16e2\u16e3\u16e3\u16e2\u16e3\u16ef\u16ed", "\u689e\u689c\u689e\u689e\u6893\u6893\u689e\u689c"}, d2={"\u06ca\u06f0\u06cd\u26b5\u0687\u0685\u0693\u06f7\u06d1\u06da\u06cd\u06da\u0694\u06d7\u06da\u06d5\u06dc\u0694\u06e8\u06cf\u06c9\u06d2\u06d5\u06dc\u0680\u0692\u06f7\u06d1\u06da\u06cd\u06da\u0694\u06d7\u06da\u06d5\u06dc\u0694\u06e8\u06cf\u06c9\u06d2\u06d5\u06dc\u0680", "\u01fe\u01c4\u01f8\u2181\u01b3\u01b1\u01a7\u01c3\u01e5\u01ee\u01f9\u01ee\u01a0\u01e3\u01ee\u01e1\u01e8\u01a0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b4\u01a6\u01c3\u01e5\u01ee\u01f9\u01ee\u01a0\u01e3\u01ee\u01e1\u01e8\u01a0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b4", "\u04fd\u04a2\u04ad\u04a8\u04af\u04a8\u04b5\u04ff\u04fd\u04ff\u04e9\u04e8\u0497", "\u011b\u014e\u0149\u014e\u0153\u0119\u011b\u0119\u010f\u010e\u0171", "\u060c\u060e\u061f\u0628\u0607\u060a\u0618\u0618\u0657\u0655\u0643\u0642\u0627\u0601\u060a\u061d\u060a\u0644\u0607\u060a\u0605\u060c\u0644\u0628\u0607\u060a\u0618\u0618\u0650", "\u05ee\u05e7\u05f5\u05ee\u05c5\u05e9\u05e2\u05e3\u05ba\u05b8\u05ae\u05af\u05cf", "\u043b\u042f\u042b\u043f\u0432\u042d\u0462\u0460\u0476\u0412\u0434\u043f\u0428\u043f\u0471\u0432\u043f\u0430\u0439\u0471\u0411\u043c\u0434\u043b\u043d\u042a\u0465\u0477\u0404", "\u00de\u00d1\u00d2\u00d3\u00d8\u0081\u0083\u0095\u0094\u00f1\u00d7\u00dc\u00cb\u00dc\u0092\u00d1\u00dc\u00d3\u00da\u0092\u00f2\u00df\u00d7\u00d8\u00de\u00c9\u0086", "\u000b\u0010,\u000b\r\u0016\u0011\u0018CAWV3\u0015\u001e\t\u001eP\u0013\u001e\u0011\u0018P,\u000b\r\u0016\u0011\u0018D", "\u074b\u074a\u0751\u074c\u0743\u075c\u0719\u071b\u070d\u070c\u0773", "\u0483\u0482\u0499\u0484\u048b\u0494\u04ac\u0481\u0481\u04d1\u04d3\u04c5\u04c4\u04bb", "\u0087\u0091\u0099\u0084\u00cc\u00ce\u00d8\u00d9\u00a6", "\u0394\u0382\u038a\u0397\u03df\u03dd\u03cb\u03a9\u03ca\u03b5", "\u00ef\u00f9\u00f1\u00ec\u00a8\u00a4\u00a6\u00b0\u00d2\u00b1\u00ce", "\u051f\u0509\u0501\u051c\u0554\u0556\u0540\u0522\u0521\u0541\u053e", "\u05e1\u05ee\u05e9\u05e6\u05eb\u05ee\u05fd\u05e2\u05bb\u05b9\u05af\u05ae\u05d1"})
public final class Class3974 {
    public static double field9058;
    public static double field9059;
    public static double field9060;
    public static float field9061;
    public static double field9062;

    private static String 5jVN8ArZMW1FADqO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9062 = Double.longBitsToDouble(4603936163463316185L);
        field9060 = Double.longBitsToDouble(4602953205356005189L);
        C\u200e = "False";
        field9059 = Double.longBitsToDouble(4605468524561908319L);
        bf\u200e = "Enabled";
        field9058 = Double.longBitsToDouble(4590699790897612440L);
        field9061 = Float.intBitsToFloat(1050241590);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite zSGIBw5sitoJeo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3974.5jVN8ArZMW1FADqO(k2, 1962610592));
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
                int a2 = Integer.parseInt(Class3974.5jVN8ArZMW1FADqO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3974.5jVN8ArZMW1FADqO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 20741 : 20742;
        block7: while (true) {
            switch (n3) {
                case 20742: {
                    n3 = 20740;
                    continue block7;
                }
                case 20741: {
                    throw new Exception("Can't find method in " + Class3974.5jVN8ArZMW1FADqO(k2, 1962610592) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

