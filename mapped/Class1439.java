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

@HACHIMI_CLIENT(mv=100, d1={"\ue2dd\ue2dd\ue2d6\ue2dd\ue2d8\ue2d6\ue2d7\ue2dc", "\u2b59\u2b5f\u2b58\u2b5e\u2b53\u2b5d\u2b5d", "\u8a0b\u8a01\u8a00\u8a0b\u8a09\u8a0c\u8a0a\u8a09", "\u6e1e\u6e18\u6e1b\u6e1c\u6e1c\u6e18\u6e1d", "\u29bd\u29bc\u29b7\u29ba\u29bb\u29b8\u29bb\u29b7", "\u137f\u1376\u1371\u1373\u1375\u1373\u1373", "\udeed\udee7\udeea\udee7\udeeb\udee7\udeea\udee7", "\u8e82\u8e82\u8e84\u8e83\u8e8a\u8e84\u8e83\u8e80", "\uc029\uc025\uc029\uc02b\uc024\uc02d\uc02f\uc02f", "\u29d1\u29d3\u29d5\u29d4\u29d4\u29d3\u29d3\u29d1", "\u882f\u8829\u8823\u8823\u8829\u882e\u8822\u882e", "\u6b8e\u6b82\u6b8d\u6b8f\u6b8f\u6b8a\u6b88\u6b8d", "\ud8e5\ud8e2\ud8e5\ud8e8\ud8e4\ud8e7\ud8e7\ud8e8", "\uc563\uc567\uc569\uc562\uc568\uc567\uc566\uc564", "\u188a\u188d\u188b\u1888\u1889\u188f\u188a\u188d"}, d2={"\u0253\u024c\u0274\u2233\u0201\u0203\u0215\u0271\u0257\u025c\u024b\u025c\u0212\u0251\u025c\u0253\u025a\u0212\u026e\u0249\u024f\u0254\u0253\u025a\u0206\u0214\u0271\u0257\u025c\u024b\u025c\u0212\u0251\u025c\u0253\u025a\u0212\u026e\u0249\u024f\u0254\u0253\u025a\u0206", "\u03cb\u0394\u039b\u039e\u0399\u039e\u0383\u03c9\u03cb\u03c9\u03df\u03de\u03a1", "\u06fb\u06ae\u06a9\u06ae\u06b3\u06f9\u06fb\u06f9\u06ef\u06ee\u0691", "\u029b\u0299\u0288\u02bf\u0290\u029d\u028f\u028f\u02c0\u02c2\u02d4\u02d5\u02b0\u0296\u029d\u028a\u029d\u02d3\u0290\u029d\u0292\u029b\u02d3\u02bf\u0290\u029d\u028f\u028f\u02c7", "\u04a1\u04a8\u04ba\u04a1\u048a\u04a6\u04ad\u04ac\u04f5\u04f7\u04e1\u04e0\u0480", "\u04af\u04bb\u04bf\u04ab\u04a6\u04b9\u04f6\u04f4\u04e2\u0486\u04a0\u04ab\u04bc\u04ab\u04e5\u04a6\u04ab\u04a4\u04ad\u04e5\u0485\u04a8\u04a0\u04af\u04a9\u04be\u04f1\u04e3\u0490", "\u02ce\u02c1\u02c2\u02c3\u02c8\u0291\u0293\u0285\u0284\u02e1\u02c7\u02cc\u02db\u02cc\u0282\u02c1\u02cc\u02c3\u02ca\u0282\u02e2\u02cf\u02c7\u02c8\u02ce\u02d9\u0296", "\u017e\u0165\u0159\u017e\u0178\u0163\u0164\u016d\u0136\u0134\u0122\u0123\u0146\u0160\u016b\u017c\u016b\u0125\u0166\u016b\u0164\u016d\u0125\u0159\u017e\u0178\u0163\u0164\u016d\u0131", "\u047c\u047d\u0466\u047b\u0474\u046b\u042e\u042c\u043a\u043b\u0444", "\u0197\u0196\u018d\u0190\u019f\u0180\u01b8\u0195\u0195\u01c5\u01c7\u01d1\u01d0\u01af", "\u067f\u0669\u0661\u067c\u0634\u0636\u0620\u0621\u065e", "\u0319\u030f\u0307\u031a\u0352\u0350\u0346\u0324\u0347\u0338", "\u01a2\u01b4\u01bc\u01a1\u01e5\u01e9\u01eb\u01fd\u019f\u01fc\u0183", "\u014a\u015c\u0154\u0149\u0101\u0103\u0115\u0177\u0174\u0114\u016b", "\u07de\u07d1\u07d6\u07d9\u07d4\u07d1\u07c2\u07dd\u0784\u0786\u0790\u0791\u07ee"})
public final class Class1439 {
    public static float field5491;
    public static int field5492 = 1023023948;

    private static String Tiwc3vhLlO2GVbcv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wevfmaEqnTxuAA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1439.Tiwc3vhLlO2GVbcv(k2, 1936224748));
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
                int a2 = Integer.parseInt(Class1439.Tiwc3vhLlO2GVbcv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1439.Tiwc3vhLlO2GVbcv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1439.Tiwc3vhLlO2GVbcv(k2, 1936224748) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        H\u200e = "Placeholder";
        field5491 = Float.intBitsToFloat(1060021962);
    }
}

