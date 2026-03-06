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
@HACHIMI_CLIENT(mv=100, d1={"\u0abb\u0abb\u0aba\u0abd\u0abb\u0ab8\u0ab9\u0abc", "\u2725\u272d\u272e\u272e\u272e\u272f\u272f", "\ud26f\ud26a\ud26a\ud26f\ud263\ud26a\ud263\ud26a", "\ue78a\ue780\ue789\ue789\ue780\ue78c\ue780\ue780", "\u3c73\u3c74\u3c75\u3c75\u3c70\u3c74\u3c75\u3c73", "\udd6e\udd6c\udd6f\udd6d\udd62\udd6d\udd6a\udd6e", "\u983c\u983d\u9831\u983a\u9838\u983a\u983f\u9838", "\u7769\u776b\u776a\u776f\u7763\u776d\u776f\u776b", "\u9942\u9944\u994c\u9940\u9942\u994d\u994c\u9945", "\u0185\u0182\u0184\u0182\u0187\u0187\u0181\u0181", "\ud517\ud516\ud511\ud513\ud515\ud511\ud513\ud513", "\u98e5\u98e0\u98e1\u98e2\u98e6\u98e5\u98e5\u98e7", "\u6140\u6144\u6145\u6144\u6147\u6143\u6141\u6144", "\ue82f\ue82b\ue82c\ue82a\ue82a\ue82d\ue82c", "\u150d\u150c\u150f\u1501\u150f\u1500\u150f\u150a", "\u86c6\u86c7\u86c6\u86c3\u86c4\u86cb\u86ca\u86c2"}, d2={"\u010e\u0101\u011a\u2167\u0155\u0157\u0141\u0125\u0103\u0108\u011f\u0108\u0146\u0105\u0108\u0107\u010e\u0146\u013a\u011d\u011b\u0100\u0107\u010e\u0152\u0140\u0125\u0103\u0108\u011f\u0108\u0146\u0105\u0108\u0107\u010e\u0146\u013a\u011d\u011b\u0100\u0107\u010e\u0152", "\u03a3\u03ac\u03b0\u23ca\u03f8\u03fa\u03ec\u0388\u03ae\u03a5\u03b2\u03a5\u03eb\u03a8\u03a5\u03aa\u03a3\u03eb\u0397\u03b0\u03b6\u03ad\u03aa\u03a3\u03ff\u03ed\u0388\u03ae\u03a5\u03b2\u03a5\u03eb\u03a8\u03a5\u03aa\u03a3\u03eb\u0397\u03b0\u03b6\u03ad\u03aa\u03a3\u03ff", "\u01e9\u01b6\u01b9\u01bc\u01bb\u01bc\u01a1\u01eb\u01e9\u01eb\u01fd\u01fc\u0183", "\u0312\u0347\u0340\u0347\u035a\u0310\u0312\u0310\u0306\u0307\u0378", "\u0018\u001a\u000b<\u0013\u001e\f\fCAWV3\u0015\u001e\t\u001eP\u0013\u001e\u0011\u0018P<\u0013\u001e\f\fD", "\u0536\u053f\u052d\u0536\u051d\u0531\u053a\u053b\u0562\u0560\u0576\u0577\u0517", "\u03e2\u03f6\u03f2\u03e6\u03eb\u03f4\u03bb\u03b9\u03af\u03cb\u03ed\u03e6\u03f1\u03e6\u03a8\u03eb\u03e6\u03e9\u03e0\u03a8\u03c8\u03e5\u03ed\u03e2\u03e4\u03f3\u03bc\u03ae\u03dd", "\u00fa\u00f5\u00f6\u00f7\u00fc\u00a5\u00a7\u00b1\u00b0\u00d5\u00f3\u00f8\u00ef\u00f8\u00b6\u00f5\u00f8\u00f7\u00fe\u00b6\u00d6\u00fb\u00f3\u00fc\u00fa\u00ed\u00a2", "\u01ad\u01b6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e5\u01e7\u01f1\u01f0\u0195\u01b3\u01b8\u01af\u01b8\u01f6\u01b5\u01b8\u01b7\u01be\u01f6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e2", "\u058e\u058f\u0594\u0589\u0586\u0599\u05dc\u05de\u05c8\u05c9\u05b6", "\u0213\u0212\u0209\u0214\u021b\u0204\u023c\u0211\u0211\u0241\u0243\u0255\u0254\u022b", "\u013b\u012d\u0125\u0138\u0170\u0172\u0164\u0165\u011a", "\u00e8\u00fe\u00f6\u00eb\u00a3\u00a1\u00b7\u00d5\u00b6\u00c9", "\u044f\u0459\u0451\u044c\u0408\u0404\u0406\u0410\u0472\u0411\u046e", "\u00a6\u00b0\u00b8\u00a5\u00ed\u00ef\u00f9\u009b\u0098\u00f8\u0087", "\u03f4\u03fb\u03fc\u03f3\u03fe\u03fb\u03e8\u03f7\u03ae\u03ac\u03ba\u03bb\u03c4"})
public final class Class3998 {
    public static float field9159;
    public static double field9160;
    public static int field9161 = 733483423;
    public static int field9162 = 47304;
    public static double field9163;
    public static float field9164;

    private static String 1iBLi4HDyttVOL9l(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9160 = Double.longBitsToDouble(4581894672509032160L);
        field9164 = Float.intBitsToFloat(1047506292);
        P\u200e = "QUINT_OUT";
        field9163 = Double.longBitsToDouble(4599127166409924634L);
        aF\u200e = "Allow you to mine without delay";
        field9159 = Float.intBitsToFloat(1046140896);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite bn1GrivicQG9QS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3998.1iBLi4HDyttVOL9l(k2, 1365932740));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block2: for (int f2 = 0; f2 < q2.length; ++f2) {
            int n3;
            void e2;
            try {
                int a2 = Integer.parseInt(Class3998.1iBLi4HDyttVOL9l(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n4 = e2 % 59557 != m2.intValue() ? 57446 : 57445;
            while ((n3 = n4) != 57445) {
                if (n3 != 57446) continue block2;
                n4 = 57444;
            }
            String c2 = Class3998.1iBLi4HDyttVOL9l(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3998.1iBLi4HDyttVOL9l(k2, 1365932740) + " " + l2 + " " + m2);
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

