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
@HACHIMI_CLIENT(mv=100, d1={"\u8317\u8317\u8310\u8317\u8310\u831a\u8314\u831a", "\ubd11\ubd15\ubd1a\ubd14\ubd15\ubd13\ubd13\ubd11", "\uba73\uba79\uba70\uba74\uba79\uba74\uba79\uba74", "\u8de9\u8dee\u8dea\u8dee\u8de9\u8ded\u8de8\u8deb", "\u1621\u1621\u1624\u1622\u1625\u1626\u1622\u1624", "\u2806\u2805\u280f\u2800\u2803\u2801\u2807\u2800", "\uabcc\uabc7\uabc9\uabc8\uabcc\uabc7\uabc9\uabcd", "\u7d76\u7d76\u7d72\u7d76\u7d76\u7d74\u7d7a\u7d7b", "\ucf4f\ucf41\ucf4e\ucf41\ucf48\ucf41\ucf40\ucf48", "\u5138\u5138\u513f\u5136\u5136\u513b\u5139\u5139", "\ue154\ue155\ue155\ue153\ue156\ue156\ue157\ue152", "\u2fa1\u2fab\u2fa2\u2faa\u2fa3\u2fa7\u2fa5\u2fa2", "\ue240\ue242\ue244\ue240\ue246\ue242\ue244\ue246", "\u308d\u3088\u3089\u308b\u3089\u3086\u308d\u3088"}, d2={"\u01b3\u01ec\u01e3\u01e6\u01e1\u01e6\u01fb\u01b1\u01b3\u01b1\u01a7\u01a6\u01d9", "\u0190\u01c5\u01c2\u01c5\u01d8\u0192\u0190\u0192\u0184\u0185\u01fa", "\u07f7\u07f5\u07e4\u07d3\u07fc\u07f1\u07e3\u07e3\u07ac\u07ae\u07b8\u07b9\u07dc\u07fa\u07f1\u07e6\u07f1\u07bf\u07fc\u07f1\u07fe\u07f7\u07bf\u07d3\u07fc\u07f1\u07e3\u07e3\u07ab", "\u016b\u0162\u0170\u016b\u0140\u016c\u0167\u0166\u013f\u013d\u012b\u012a\u014a", "\u064f\u065b\u065f\u064b\u0646\u0659\u0616\u0614\u0602\u0666\u0640\u064b\u065c\u064b\u0605\u0646\u064b\u0644\u064d\u0605\u0665\u0648\u0640\u064f\u0649\u065e\u0611\u0603\u0670", "\u06f9\u06f6\u06f5\u06f4\u06ff\u06a6\u06a4\u06b2\u06b3\u06d6\u06f0\u06fb\u06ec\u06fb\u06b5\u06f6\u06fb\u06f4\u06fd\u06b5\u06d5\u06f8\u06f0\u06ff\u06f9\u06ee\u06a1", "\u02f7\u02ec\u02d0\u02f7\u02f1\u02ea\u02ed\u02e4\u02bf\u02bd\u02ab\u02aa\u02cf\u02e9\u02e2\u02f5\u02e2\u02ac\u02ef\u02e2\u02ed\u02e4\u02ac\u02d0\u02f7\u02f1\u02ea\u02ed\u02e4\u02b8", "SRIT[D\u0001\u0003\u0015\u0014k", "\u0310\u0311\u030a\u0317\u0318\u0307\u033f\u0312\u0312\u0342\u0340\u0356\u0357\u0328", "\u0704\u0712\u071a\u0707\u074f\u074d\u075b\u075a\u0725", "\u0266\u0270\u0278\u0265\u022d\u022f\u0239\u025b\u0238\u0247", "\u0243\u0255\u025d\u0240\u0204\u0208\u020a\u021c\u027e\u021d\u0262", "\u06ff\u06e9\u06e1\u06fc\u06b4\u06b6\u06a0\u06c2\u06c1\u06a1\u06de", "\u069b\u0694\u0693\u069c\u0691\u0694\u0687\u0698\u06c1\u06c3\u06d5\u06d4\u06ab"})
public final class Class3482 {
    public static double field7645;
    public static int field7646 = 151184590;
    public static float field7647;
    public static double field7648;

    private static String JoPynZLd6QJyYTsj(String a2, int b2) {
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
    private static CallSite 0tUnL9Q5nSCNoA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3482.JoPynZLd6QJyYTsj(k2, 1027050124));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3482.JoPynZLd6QJyYTsj(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3482.JoPynZLd6QJyYTsj(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 49468 : 49467;
        block11: while (true) {
            switch (n3) {
                case 49468: {
                    n3 = 49466;
                    continue block11;
                }
                case 49467: {
                    throw new Exception("Can't find method in " + Class3482.JoPynZLd6QJyYTsj(k2, 1027050124) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 == 1 ? 44795 : 44796;
        block12: while (true) {
            switch (n4) {
                case 44796: {
                    n4 = 44794;
                    continue block12;
                }
                case 44795: {
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
        field7648 = Double.longBitsToDouble(4604959442023947331L);
        field7645 = Double.longBitsToDouble(4599559472986068190L);
        field7647 = Float.intBitsToFloat(1063221531);
    }
}

