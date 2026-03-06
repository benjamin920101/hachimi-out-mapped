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

@HACHIMI_CLIENT(mv=100, d1={"\u4752\u4753\u4755\u475d\u475c\u4751\u4753\u4756", "\u3e6d\u3e6f\u3e6a\u3e69\u3e68\u3e69\u3e6d\u3e6b", "\u0f8d\u0f87\u0f8a\u0f8d\u0f8e\u0f89\u0f88\u0f8a", "\u6f10\u6f16\u6f12\u6f11\u6f1e\u6f1e\u6f16\u6f1f", "\ud3ac\ud3ac\ud3aa\ud3ad\ud3aa\ud3ad\ud3af\ud3a6", "\uc83a\uc83f\uc838\uc83a\uc83b\uc83c\uc83d", "\u4e52\u4e50\u4e51\u4e57\u4e54\u4e51\u4e53\u4e5e", "\uaf2c\uaf27\uaf28\uaf2a\uaf29\uaf27\uaf27\uaf2e", "\ub186\ub181\ub18c\ub18d\ub187\ub186\ub187\ub184", "\ue80e\ue80e\ue80e\ue80c\ue80c\ue809\ue80f\ue80c", "\u4f74\u4f71\u4f77\u4f72\u4f75\u4f75\u4f7f\u4f77", "\u1616\u161e\u1616\u1615\u1614\u1613\u1611\u161f", "FJFFKBF", "\ub21b\ub21d\ub21c\ub214\ub215\ub21c\ub215\ub21e"}, d2={"\u0194\u01cb\u01c4\u01c1\u01c6\u01c1\u01dc\u0196\u0194\u0196\u0180\u0181\u01fe", "\u066a\u063f\u0638\u063f\u0622\u0668\u066a\u0668\u067e\u067f\u0600", "\u07e3\u07e1\u07f0\u07c7\u07e8\u07e5\u07f7\u07f7\u07b8\u07ba\u07ac\u07ad\u07c8\u07ee\u07e5\u07f2\u07e5\u07ab\u07e8\u07e5\u07ea\u07e3\u07ab\u07c7\u07e8\u07e5\u07f7\u07f7\u07bf", "\u0005\f\u001e\u0005.\u0002\t\bQSED$", "\u010c\u0118\u011c\u0108\u0105\u011a\u0155\u0157\u0141\u0125\u0103\u0108\u011f\u0108\u0146\u0105\u0108\u0107\u010e\u0146\u0126\u010b\u0103\u010c\u010a\u011d\u0152\u0140\u0133", "\u01ac\u01a3\u01a0\u01a1\u01aa\u01f3\u01f1\u01e7\u01e6\u0183\u01a5\u01ae\u01b9\u01ae\u01e0\u01a3\u01ae\u01a1\u01a8\u01e0\u0180\u01ad\u01a5\u01aa\u01ac\u01bb\u01f4", "\u05fd\u05e6\u05da\u05fd\u05fb\u05e0\u05e7\u05ee\u05b5\u05b7\u05a1\u05a0\u05c5\u05e3\u05e8\u05ff\u05e8\u05a6\u05e5\u05e8\u05e7\u05ee\u05a6\u05da\u05fd\u05fb\u05e0\u05e7\u05ee\u05b2", "-,7*%:\u007f}kj\u0015", "\u0695\u0694\u068f\u0692\u069d\u0682\u06ba\u0697\u0697\u06c7\u06c5\u06d3\u06d2\u06ad", "\u0604\u0612\u061a\u0607\u064f\u064d\u065b\u065a\u0625", "\u0223\u0235\u023d\u0220\u0268\u026a\u027c\u021e\u027d\u0202", "ES[F\u0002\u000e\f\u001ax\u001bd", "\u03ff\u03e9\u03e1\u03fc\u03b4\u03b6\u03a0\u03c2\u03c1\u03a1\u03de", "\u0264\u026b\u026c\u0263\u026e\u026b\u0278\u0267\u023e\u023c\u022a\u022b\u0254"})
public final class Class1102 {
    public static double field4456 = 0.9549721208493283;
    public static float field4457 = Float.intBitsToFloat(1059230940);
    public static float field4458 = 0.99133736f;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite VT0dO2KZLjOYKo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1102.AGOY0uynYl2ToOOa(k2, -1015788238));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 43465 : 43464;
        while (true) {
            int n4 = n3;
            if (n4 == 43464) throw new Exception("Outdated metadata version");
            if (n4 != 43465) break;
            n3 = 43463;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1102.AGOY0uynYl2ToOOa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1102.AGOY0uynYl2ToOOa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1102.AGOY0uynYl2ToOOa(k2, -1015788238) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String AGOY0uynYl2ToOOa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

