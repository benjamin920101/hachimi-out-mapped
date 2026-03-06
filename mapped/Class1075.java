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
@HACHIMI_CLIENT(mv=100, d1={"\ud9d6\ud9d5\ud9d0\ud9d4\ud9d6\ud9d3\ud9d1", "\uc8f6\uc8f1\uc8f4\uc8f6\uc8f5\uc8f3\uc8f3\uc8fa", "\u91f4\u91f9\u91f1\u91f5\u91f4\u91f9\u91f2\u91f0", "\u7271\u7277\u7270\u7271\u727b\u7276\u7273\u7274", "\u3a46\u3a4c\u3a47\u3a45\u3a46\u3a41\u3a42\u3a44", "\ub75c\ub75f\ub750\ub75b\ub75a\ub751\ub751\ub751", "\uac56\uac55\uac54\uac52\uac53\uac53\uac51\uac57", "\u25f1\u25ff\u25f2\u25ff\u25f0\u25f5\u25f1", "\ubb71\ubb74\ubb77\ubb77\ubb74\ubb71\ubb75\ubb7b", "\u2bdc\u2bd8\u2bd0\u2bde\u2bdf\u2bdb\u2bdc\u2bda", "\u461b\u461a\u4619\u461e\u461b\u4619\u4615\u4614", "\u312d\u312f\u312a\u312c\u312e\u3120\u312c\u312d", "\ucb0c\ucb0b\ucb08\ucb08\ucb0f\ucb0b\ucb0a\ucb0e", "\u139c\u139c\u139b\u139f\u1392\u139c\u139b", "\u1cee\u1cef\u1ceb\u1ce9\u1cee\u1cee\u1ce3\u1ced", "\u5087\u5082\u5082\u5087\u5080\u5085\u5083", "\ub258\ub253\ub25c\ub25e\ub25c\ub25c\ub259\ub25e"}, d2={"\u0756\u074a\u0755\u2728\u071a\u0718\u070e\u076a\u074c\u0747\u0750\u0747\u0709\u074a\u0747\u0748\u0741\u0709\u0775\u0752\u0754\u074f\u0748\u0741\u071d\u070f\u076a\u074c\u0747\u0750\u0747\u0709\u074a\u0747\u0748\u0741\u0709\u0775\u0752\u0754\u074f\u0748\u0741\u071d", "\u05e0\u05fc\u05e4\u259e\u05ac\u05ae\u05b8\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05c3\u05e4\u05e2\u05f9\u05fe\u05f7\u05ab\u05b9\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05c3\u05e4\u05e2\u05f9\u05fe\u05f7\u05ab", "\u042e\u0432\u042b\u2450\u0462\u0460\u0476\u0412\u0434\u043f\u0428\u043f\u0471\u0432\u043f\u0430\u0439\u0471\u040d\u042a\u042c\u0437\u0430\u0439\u0465\u0477\u0412\u0434\u043f\u0428\u043f\u0471\u0432\u043f\u0430\u0439\u0471\u040d\u042a\u042c\u0437\u0430\u0439\u0465", "\u077b\u0724\u072b\u072e\u0729\u072e\u0733\u0779\u077b\u0779\u076f\u076e\u0711", "\u068b\u06de\u06d9\u06de\u06c3\u0689\u068b\u0689\u069f\u069e\u06e1", "\u03ca\u03c8\u03d9\u03ee\u03c1\u03cc\u03de\u03de\u0391\u0393\u0385\u0384\u03e1\u03c7\u03cc\u03db\u03cc\u0382\u03c1\u03cc\u03c3\u03ca\u0382\u03ee\u03c1\u03cc\u03de\u03de\u0396", "\u076f\u0766\u0774\u076f\u0744\u0768\u0763\u0762\u073b\u0739\u072f\u072e\u074e", "\u06ba\u06ae\u06aa\u06be\u06b3\u06ac\u06e3\u06e1\u06f7\u0693\u06b5\u06be\u06a9\u06be\u06f0\u06b3\u06be\u06b1\u06b8\u06f0\u0690\u06bd\u06b5\u06ba\u06bc\u06ab\u06e4\u06f6\u0685", "\u06b7\u06b8\u06bb\u06ba\u06b1\u06e8\u06ea\u06fc\u06fd\u0698\u06be\u06b5\u06a2\u06b5\u06fb\u06b8\u06b5\u06ba\u06b3\u06fb\u069b\u06b6\u06be\u06b1\u06b7\u06a0\u06ef", "\u06b5\u06ae\u0692\u06b5\u06b3\u06a8\u06af\u06a6\u06fd\u06ff\u06e9\u06e8\u068d\u06ab\u06a0\u06b7\u06a0\u06ee\u06ad\u06a0\u06af\u06a6\u06ee\u0692\u06b5\u06b3\u06a8\u06af\u06a6\u06fa", "\u0636\u0637\u062c\u0631\u063e\u0621\u0664\u0666\u0670\u0671\u060e", "\u016d\u016c\u0177\u016a\u0165\u017a\u0142\u016f\u016f\u013f\u013d\u012b\u012a\u0155", "\u04ac\u04ba\u04b2\u04af\u04e7\u04e5\u04f3\u04f2\u048d", "\u01d2\u01c4\u01cc\u01d1\u0199\u019b\u018d\u01ef\u018c\u01f3", "\u0001\u0017\u001f\u0002FJH^<_ ", "\u01ef\u01f9\u01f1\u01ec\u01a4\u01a6\u01b0\u01d2\u01d1\u01b1\u01ce", "\u03a5\u03aa\u03ad\u03a2\u03af\u03aa\u03b9\u03a6\u03ff\u03fd\u03eb\u03ea\u0395"})
public final class Class1075 {
    public static double field4379;
    public static float field4380;
    public static int field4381 = 190257832;
    public static float field4382;

    /*
     * WARNING - void declaration
     */
    private static CallSite 7itPHRwjJYfGQq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1075.F1i1Y7eqyH2hDy70(k2, 516482589));
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
                int a2 = Integer.parseInt(Class1075.F1i1Y7eqyH2hDy70(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1075.F1i1Y7eqyH2hDy70(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1075.F1i1Y7eqyH2hDy70(k2, 516482589) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String F1i1Y7eqyH2hDy70(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4382 = Float.intBitsToFloat(1048808248);
        V\u200e = "Strict GrimV3 bypass for slowdown";
        field4380 = Float.intBitsToFloat(1052082068);
        aS\u200e = "StandHead";
        aZ\u200e = "Feet";
        field4379 = Double.longBitsToDouble(4595438638210901356L);
    }
}

