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

@HACHIMI_CLIENT(mv=100, d1={"AMME@@AL", "\u79b4\u79b3\u79b1\u79b7\u79bb\u79bb\u79b2\u79b3", "\u66a1\u66a1\u66ab\u66aa\u66a7\u66a1\u66a6", "\u1adb\u1ada\u1adc\u1adc\u1add\u1adf\u1ad3\u1ad9", "\ub0fc\ub0f5\ub0f5\ub0fb\ub0f8\ub0ff\ub0fa\ub0fe", "\ub035\ub032\ub037\ub037\ub037\ub030\ub030\ub030", "\u7c40\u7c47\u7c45\u7c41\u7c45\u7c45\u7c46\u7c4c", "\u9848\u984e\u984a\u984a\u9843\u984a\u984b\u9843", "\u542a\u5421\u5428\u542a\u542d\u542f\u5420\u542f", "\u6779\u677a\u677c\u677a\u6775\u6779\u6774\u677d", "\u6468\u6465\u6464\u646d\u6469\u646f\u6468\u6468", "\u21dc\u21d8\u21d7\u21d7\u21d9\u21d6\u21dc\u21d6", "\u582a\u5823\u582a\u5829\u582c\u5823\u5823\u5828", "\ub8fd\ub8fb\ub8ff\ub8f0\ub8f9\ub8f8\ub8f8\ub8fe"}, d2={"\u03d1\u038e\u0381\u0384\u0383\u0384\u0399\u03d3\u03d1\u03d3\u03c5\u03c4\u03bb", "\u0081\u00d4\u00d3\u00d4\u00c9\u0083\u0081\u0083\u0095\u0094\u00eb", "\u027a\u0278\u0269\u025e\u0271\u027c\u026e\u026e\u0221\u0223\u0235\u0234\u0251\u0277\u027c\u026b\u027c\u0232\u0271\u027c\u0273\u027a\u0232\u025e\u0271\u027c\u026e\u026e\u0226", "\u05de\u05d7\u05c5\u05de\u05f5\u05d9\u05d2\u05d3\u058a\u0588\u059e\u059f\u05ff", "\u0392\u0386\u0382\u0396\u039b\u0384\u03cb\u03c9\u03df\u03bb\u039d\u0396\u0381\u0396\u03d8\u039b\u0396\u0399\u0390\u03d8\u03b8\u0395\u039d\u0392\u0394\u0383\u03cc\u03de\u03ad", "\u018f\u0180\u0183\u0182\u0189\u01d0\u01d2\u01c4\u01c5\u01a0\u0186\u018d\u019a\u018d\u01c3\u0180\u018d\u0182\u018b\u01c3\u01a3\u018e\u0186\u0189\u018f\u0198\u01d7", "\u0429\u0432\u040e\u0429\u042f\u0434\u0433\u043a\u0461\u0463\u0475\u0474\u0411\u0437\u043c\u042b\u043c\u0472\u0431\u043c\u0433\u043a\u0472\u040e\u0429\u042f\u0434\u0433\u043a\u0466", "\u07ad\u07ac\u07b7\u07aa\u07a5\u07ba\u07ff\u07fd\u07eb\u07ea\u0795", "\u040b\u040a\u0411\u040c\u0403\u041c\u0424\u0409\u0409\u0459\u045b\u044d\u044c\u0433", "\u036f\u0379\u0371\u036c\u0324\u0326\u0330\u0331\u034e", "\u0751\u0747\u074f\u0752\u071a\u0718\u070e\u076c\u070f\u0770", "\u03c5\u03d3\u03db\u03c6\u0382\u038e\u038c\u039a\u03f8\u039b\u03e4", "\u02c2\u02d4\u02dc\u02c1\u0289\u028b\u029d\u02ff\u02fc\u029c\u02e3", "\u03c4\u03cb\u03cc\u03c3\u03ce\u03cb\u03d8\u03c7\u039e\u039c\u038a\u038b\u03f4"})
public final class Class3456 {
    public static double field7558;
    public static float field7559;
    public static float field7560;
    public static double field7561;

    private static String jhWv5JkAb7lXr9XS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7559 = Float.intBitsToFloat(1050679738);
        field7558 = Double.longBitsToDouble(4600619581879230768L);
        field7561 = Double.longBitsToDouble(4603273306804447082L);
        field7560 = Float.intBitsToFloat(1054538592);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite sGalGOeIt9C9wt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3456.jhWv5JkAb7lXr9XS(k2, 634307133));
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
                int a2 = Integer.parseInt(Class3456.jhWv5JkAb7lXr9XS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3456.jhWv5JkAb7lXr9XS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3456.jhWv5JkAb7lXr9XS(k2, 634307133) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

