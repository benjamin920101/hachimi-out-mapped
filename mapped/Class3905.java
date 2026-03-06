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

@HACHIMI_CLIENT(mv=100, d1={"\ude84\ude86\ude82\ude87\ude83\ude82\ude84\ude80", "\u1f66\u1f6b\u1f60\u1f62\u1f60\u1f63\u1f62\u1f62", "\u450c\u450c\u450f\u450e\u450d\u450c\u450f\u450a", "\u8ee8\u8ee0\u8ee1\u8ee7\u8ee1\u8ee9\u8ee8", "\u6c71\u6c75\u6c74\u6c73\u6c7c\u6c74\u6c76\u6c70", "\uad4e\uad4e\uad4e\uad49\uad45\uad4d\uad4b\uad4f", "\u180f\u1809\u180a\u180a\u180e\u180d\u180d\u180b", "\u2955\u2954\u2958\u2959\u2958\u2953\u2956", "\u31ed\u31e2\u31e3\u31eb\u31e2\u31e8\u31e9", "\u3873\u3874\u3870\u3879\u3871\u3874\u3879", "\u8603\u8608\u8605\u8604\u8604\u8604\u8600\u8600", "\u34c8\u34cd\u34cc\u34ce\u34cd\u34cb\u34ca\u34cd", "\u725b\u7258\u7259\u7258\u725b\u7257\u7256\u725a", "\u4e7a\u4e78\u4e7f\u4e79\u4e7f\u4e7f\u4e7a"}, d2={"\u07ad\u07f2\u07fd\u07f8\u07ff\u07f8\u07e5\u07af\u07ad\u07af\u07b9\u07b8\u07c7", "\u0795\u07c0\u07c7\u07c0\u07dd\u0797\u0795\u0797\u0781\u0780\u07ff", "\u039f\u039d\u038c\u03bb\u0394\u0399\u038b\u038b\u03c4\u03c6\u03d0\u03d1\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03bb\u0394\u0399\u038b\u038b\u03c3", "\u0546\u054f\u055d\u0546\u056d\u0541\u054a\u054b\u0512\u0510\u0506\u0507\u0567", "\u016d\u0179\u017d\u0169\u0164\u017b\u0134\u0136\u0120\u0144\u0162\u0169\u017e\u0169\u0127\u0164\u0169\u0166\u016f\u0127\u0147\u016a\u0162\u016d\u016b\u017c\u0133\u0121\u0152", "\u023a\u0235\u0236\u0237\u023c\u0265\u0267\u0271\u0270\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u0216\u023b\u0233\u023c\u023a\u022d\u0262", "\u02d1\u02ca\u02f6\u02d1\u02d7\u02cc\u02cb\u02c2\u0299\u029b\u028d\u028c\u02e9\u02cf\u02c4\u02d3\u02c4\u028a\u02c9\u02c4\u02cb\u02c2\u028a\u02f6\u02d1\u02d7\u02cc\u02cb\u02c2\u029e", "\u01ad\u01ac\u01b7\u01aa\u01a5\u01ba\u01ff\u01fd\u01eb\u01ea\u0195", "\u0195\u0194\u018f\u0192\u019d\u0182\u01ba\u0197\u0197\u01c7\u01c5\u01d3\u01d2\u01ad", "\u0002\u0014\u001c\u0001IK]\\#", "\u04bf\u04a9\u04a1\u04bc\u04f4\u04f6\u04e0\u0482\u04e1\u049e", "\u066b\u067d\u0675\u0668\u062c\u0620\u0622\u0634\u0656\u0635\u064a", "\u05aa\u05bc\u05b4\u05a9\u05e1\u05e3\u05f5\u0597\u0594\u05f4\u058b", "\u0714\u071b\u071c\u0713\u071e\u071b\u0708\u0717\u074e\u074c\u075a\u075b\u0724"})
public final class Class3905 {
    public static float field8891;
    public static double field8892;
    public static float field8893;

    static {
        field8893 = Float.intBitsToFloat(0x40A00000);
        field8892 = Double.longBitsToDouble(4603089055590254523L);
        field8891 = Float.intBitsToFloat(1041404512);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite mCTmhh7Ip4P89e(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3905.f2zyN3XpPwJbYMGX(k2, 584251509));
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
                int a2 = Integer.parseInt(Class3905.f2zyN3XpPwJbYMGX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3905.f2zyN3XpPwJbYMGX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3905.f2zyN3XpPwJbYMGX(k2, 584251509) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String f2zyN3XpPwJbYMGX(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

