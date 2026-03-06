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

@HACHIMI_CLIENT(mv=100, d1={"\u03ec\u03ec\u03ef\u03e8\u03ea\u03ef\u03eb\u03ef", "\u60c7\u60ce\u60c2\u60c4\u60c1\u60cf\u60c5\u60c3", "\ua8ec\ua8e9\ua8e2\ua8e8\ua8e2\ua8ed\ua8ed\ua8e9", "\u7c06\u7c0d\u7c0d\u7c06\u7c0d\u7c00\u7c05\u7c04", "\u5d46\u5d46\u5d44\u5d44\u5d44\u5d40\u5d41\u5d43", "\u1819\u1819\u181b\u1812\u181c\u1812\u181d", "\uc13d\uc138\uc13a\uc13d\uc136\uc139\uc13a\uc137", "\u1fac\u1fa2\u1faf\u1fad\u1fab\u1fae\u1faf", "\ua2a8\ua2a2\ua2a3\ua2a3\ua2ae\ua2a9\ua2ad\ua2ab", "\ue897\ue895\ue899\ue894\ue896\ue894\ue897\ue898", "\u27a1\u27a2\u27a1\u27a0\u27a6\u27a4\u27a6\u27a1", "\u2b43\u2b4f\u2b4d\u2b43\u2b49\u2b49\u2b4e", "\u8981\u8989\u8980\u8983\u8983\u8989\u8983\u8981", "\ua5bc\ua5b9\ua5b8\ua5b7\ua5b6\ua5bf\ua5ba\ua5bd", "\u1131\u1136\u1135\u1132\u1137\u1137\u1131\u1133"}, d2={"\u06aa\u068d\u069f\u26c8\u06fa\u06f8\u06ee\u068a\u06ac\u06a7\u06b0\u06a7\u06e9\u06aa\u06a7\u06a8\u06a1\u06e9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fd\u06ef\u068a\u06ac\u06a7\u06b0\u06a7\u06e9\u06aa\u06a7\u06a8\u06a1\u06e9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fd", "\u035a\u0305\u030a\u030f\u0308\u030f\u0312\u0358\u035a\u0358\u034e\u034f\u0330", "\u0210\u0245\u0242\u0245\u0258\u0212\u0210\u0212\u0204\u0205\u027a", "\u052d\u052f\u053e\u0509\u0526\u052b\u0539\u0539\u0576\u0574\u0562\u0563\u0506\u0520\u052b\u053c\u052b\u0565\u0526\u052b\u0524\u052d\u0565\u0509\u0526\u052b\u0539\u0539\u0571", "\u0428\u0421\u0433\u0428\u0403\u042f\u0424\u0425\u047c\u047e\u0468\u0469\u0409", "/;?+&9vtb\u0006 +<+e&+$-e\u0005( /)>qc\u0010", "\u0653\u065c\u065f\u065e\u0655\u060c\u060e\u0618\u0619\u067c\u065a\u0651\u0646\u0651\u061f\u065c\u0651\u065e\u0657\u061f\u067f\u0652\u065a\u0655\u0653\u0644\u060b", "\u025b\u0240\u027c\u025b\u025d\u0246\u0241\u0248\u0213\u0211\u0207\u0206\u0263\u0245\u024e\u0259\u024e\u0200\u0243\u024e\u0241\u0248\u0200\u027c\u025b\u025d\u0246\u0241\u0248\u0214", "\u0583\u0582\u0599\u0584\u058b\u0594\u05d1\u05d3\u05c5\u05c4\u05bb", "\u021e\u021f\u0204\u0219\u0216\u0209\u0231\u021c\u021c\u024c\u024e\u0258\u0259\u0226", "\u01ce\u01d8\u01d0\u01cd\u0185\u0187\u0191\u0190\u01ef", "\u0398\u038e\u0386\u039b\u03d3\u03d1\u03c7\u03a5\u03c6\u03b9", "\u07e3\u07f5\u07fd\u07e0\u07a4\u07a8\u07aa\u07bc\u07de\u07bd\u07c2", "\u05e3\u05f5\u05fd\u05e0\u05a8\u05aa\u05bc\u05de\u05dd\u05bd\u05c2", "\u046c\u0463\u0464\u046b\u0466\u0463\u0470\u046f\u0436\u0434\u0422\u0423\u045c"})
public final class Class1810 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite wiTSbGkW4pJCe1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1810.hUBuGQ0qvn57eTSZ(k2, 656088566));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 3208 : 3209;
        while (true) {
            int n4 = n3;
            if (n4 == 3208) throw new Exception("Outdated metadata version");
            if (n4 != 3209) break;
            n3 = 3207;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block11: while (true) {
            block17: {
                void e2;
                int n5 = f2 < q2.length ? 25498 : 25499;
                while (true) {
                    int n6;
                    if ((n6 = n5) == 25498) {
                        try {
                            int a2 = Integer.parseInt(Class1810.hUBuGQ0qvn57eTSZ(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block17;
                        }
                    }
                    if (n6 != 25499) break block11;
                    n5 = 25497;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class1810.hUBuGQ0qvn57eTSZ(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        int n7 = s2.isEmpty() ? 47201 : 47202;
        block13: while (true) {
            switch (n7) {
                case 47202: {
                    n7 = 47200;
                    continue block13;
                }
                case 47201: {
                    throw new Exception("Can't find method in " + Class1810.hUBuGQ0qvn57eTSZ(k2, 656088566) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n8 = n2 == 1 ? 6104 : 6105;
        block14: while (true) {
            switch (n8) {
                case 6105: {
                    n8 = 6103;
                    continue block14;
                }
                case 6104: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        aD\u200e = "LCONTROL";
    }

    private static String hUBuGQ0qvn57eTSZ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

