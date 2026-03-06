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
@HACHIMI_CLIENT(mv=100, d1={"\ud84c\ud84f\ud84f\ud84d\ud848\ud84d\ud849\ud844", "\ue445\ue443\ue440\ue441\ue444\ue446\ue443\ue442", "\u3e45\u3e44\u3e43\u3e45\u3e42\u3e47\u3e47\u3e44", "\u0729\u0720\u0727\u0720\u0720\u0720\u0729", "\u448d\u4484\u448d\u4484\u448e\u4488\u4484\u448d", "\u2f43\u2f46\u2f42\u2f42\u2f42\u2f48\u2f40\u2f40", "\ua8c0\ua8c7\ua8c7\ua8c2\ua8c1\ua8c2\ua8c1\ua8c7", "\uda6b\uda6f\uda61\uda61\uda6b\uda6f\uda68\uda6d", "\ud65f\ud65b\ud65f\ud65d\ud650\ud65b\ud650\ud65f", "\u7ff9\u7ff2\u7ffe\u7ffe\u7ff9\u7ffc\u7ff8", "\ue7e0\ue7e0\ue7e3\ue7e6\ue7e3\ue7e4\ue7ed\ue7ec", "\u3ebc\u3ebe\u3ebb\u3eb9\u3ebd\u3ebe\u3ebe\u3ebe", "\uaa69\uaa68\uaa6b\uaa69\uaa6d\uaa6e\uaa6c\uaa66", "\u6b22\u6b24\u6b20\u6b26\u6b22\u6b22\u6b2d"}, d2={"\u073d\u0762\u076d\u0768\u076f\u0768\u0775\u073f\u073d\u073f\u0729\u0728\u0757", "H\u001d\u001a\u001d\u0000JHJ\\]\"", "\u036a\u0368\u0379\u034e\u0361\u036c\u037e\u037e\u0331\u0333\u0325\u0324\u0341\u0367\u036c\u037b\u036c\u0322\u0361\u036c\u0363\u036a\u0322\u034e\u0361\u036c\u037e\u037e\u0336", "\u06b8\u06b1\u06a3\u06b8\u0693\u06bf\u06b4\u06b5\u06ec\u06ee\u06f8\u06f9\u0699", "\u02b6\u02a2\u02a6\u02b2\u02bf\u02a0\u02ef\u02ed\u02fb\u029f\u02b9\u02b2\u02a5\u02b2\u02fc\u02bf\u02b2\u02bd\u02b4\u02fc\u029c\u02b1\u02b9\u02b6\u02b0\u02a7\u02e8\u02fa\u0289", "\u078f\u0780\u0783\u0782\u0789\u07d0\u07d2\u07c4\u07c5\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07a3\u078e\u0786\u0789\u078f\u0798\u07d7", "\u07b0\u07ab\u0797\u07b0\u07b6\u07ad\u07aa\u07a3\u07f8\u07fa\u07ec\u07ed\u0788\u07ae\u07a5\u07b2\u07a5\u07eb\u07a8\u07a5\u07aa\u07a3\u07eb\u0797\u07b0\u07b6\u07ad\u07aa\u07a3\u07ff", "\u061d\u061c\u0607\u061a\u0615\u060a\u064f\u064d\u065b\u065a\u0625", "\u02ae\u02af\u02b4\u02a9\u02a6\u02b9\u0281\u02ac\u02ac\u02fc\u02fe\u02e8\u02e9\u0296", "\u05a6\u05b0\u05b8\u05a5\u05ed\u05ef\u05f9\u05f8\u0587", "\u04c7\u04d1\u04d9\u04c4\u048c\u048e\u0498\u04fa\u0499\u04e6", "\u04a6\u04b0\u04b8\u04a5\u04e1\u04ed\u04ef\u04f9\u049b\u04f8\u0487", "\u058a\u059c\u0594\u0589\u05c1\u05c3\u05d5\u05b7\u05b4\u05d4\u05ab", "\u0337\u0338\u033f\u0330\u033d\u0338\u032b\u0334\u036d\u036f\u0379\u0378\u0307"})
public final class Class4219 {
    public static double field9883 = Double.longBitsToDouble(4595641955645012488L);
    public static double field9884;
    public static double field9885 = 0.6661309168162203;
    public static double field9886;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite FDFvJtVHZJ6SRJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4219.2L4QBPTAetvNdqY0(k2, -1346128161));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4219.2L4QBPTAetvNdqY0(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 8094 : 8095;
            block7: while (true) {
                switch (n3) {
                    case 8095: {
                        n3 = 8093;
                        continue block7;
                    }
                    case 8094: {
                        String c2 = Class4219.2L4QBPTAetvNdqY0(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4219.2L4QBPTAetvNdqY0(k2, -1346128161) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field9886 = Double.longBitsToDouble(4598426931741288924L);
        field9884 = Double.longBitsToDouble(4605872344012999931L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 2L4QBPTAetvNdqY0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 10986 : 10985;
            block5: while (true) {
                switch (n2) {
                    case 10986: {
                        n2 = 10984;
                        continue block5;
                    }
                    case 10985: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

