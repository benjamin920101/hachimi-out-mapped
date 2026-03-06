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

@HACHIMI_CLIENT(mv=100, d1={"\uc1a9\uc1a4\uc1ae\uc1aa\uc1a9\uc1a5\uc1af", "\u0248\u024d\u024e\u0248\u0248\u024b\u0248\u024b", "\u177b\u177c\u1776\u1777\u177c\u177b\u1776\u177c", "\u85b3\u85b1\u85b1\u85b4\u85b0\u85b7\u85bc\u85bd", "\u7410\u741a\u741b\u7414\u7410\u7410\u7415\u7417", "\u08d9\u08d8\u08db\u08dc\u08d9\u08da\u08dc\u08d8", "\ue4fc\ue4f8\ue4fa\ue4f0\ue4ff\ue4fe\ue4f9\ue4fa", "\u5ae1\u5aea\u5ae1\u5ae6\u5aea\u5aeb\u5aea", "\ub7c5\ub7cb\ub7c4\ub7ca\ub7c3\ub7c5\ub7c3", "\ub90c\ub909\ub90f\ub908\ub906\ub90b\ub90f\ub907", "\u0830\u0831\u0835\u0833\u0835\u0834\u0833\u0835", "\u3641\u3644\u3646\u3641\u364a\u3641\u3644\u3640", "\u7752\u7750\u7757\u775e\u7751\u7754\u7752\u7757", "\u5391\u5397\u5396\u5394\u5391\u539c\u5395\u5397", "\u5eea\u5eea\u5eea\u5eee\u5eef\u5eeb\u5ee9\u5ee8", "\u12e1\u12e1\u12e0\u12e7\u12e2\u12e6\u12e5"}, d2={"\u032e\u0338\u0305\u234e\u037c\u037e\u0368\u030c\u032a\u0321\u0336\u0321\u036f\u032c\u0321\u032e\u0327\u036f\u0313\u0334\u0332\u0329\u032e\u0327\u037b\u0369\u030c\u032a\u0321\u0336\u0321\u036f\u032c\u0321\u032e\u0327\u036f\u0313\u0334\u0332\u0329\u032e\u0327\u037b", "\u07f2\u07e4\u07da\u2792\u07a0\u07a2\u07b4\u07d0\u07f6\u07fd\u07ea\u07fd\u07b3\u07f0\u07fd\u07f2\u07fb\u07b3\u07cf\u07e8\u07ee\u07f5\u07f2\u07fb\u07a7\u07b5\u07d0\u07f6\u07fd\u07ea\u07fd\u07b3\u07f0\u07fd\u07f2\u07fb\u07b3\u07cf\u07e8\u07ee\u07f5\u07f2\u07fb\u07a7", "\u01e8\u01b7\u01b8\u01bd\u01ba\u01bd\u01a0\u01ea\u01e8\u01ea\u01fc\u01fd\u0182", "\u04ab\u04fe\u04f9\u04fe\u04e3\u04a9\u04ab\u04a9\u04bf\u04be\u04c1", "\u0777\u0775\u0764\u0753\u077c\u0771\u0763\u0763\u072c\u072e\u0738\u0739\u075c\u077a\u0771\u0766\u0771\u073f\u077c\u0771\u077e\u0777\u073f\u0753\u077c\u0771\u0763\u0763\u072b", "\u00e9\u00e0\u00f2\u00e9\u00c2\u00ee\u00e5\u00e4\u00bd\u00bf\u00a9\u00a8\u00c8", "\u0596\u0582\u0586\u0592\u059f\u0580\u05cf\u05cd\u05db\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05bc\u0591\u0599\u0596\u0590\u0587\u05c8\u05da\u05a9", "\u0640\u064f\u064c\u064d\u0646\u061f\u061d\u060b\u060a\u066f\u0649\u0642\u0655\u0642\u060c\u064f\u0642\u064d\u0644\u060c\u066c\u0641\u0649\u0646\u0640\u0657\u0618", "\u0464\u047f\u0443\u0464\u0462\u0479\u047e\u0477\u042c\u042e\u0438\u0439\u045c\u047a\u0471\u0466\u0471\u043f\u047c\u0471\u047e\u0477\u043f\u0443\u0464\u0462\u0479\u047e\u0477\u042b", "\u0763\u0762\u0779\u0764\u076b\u0774\u0731\u0733\u0725\u0724\u075b", "\u02e3\u02e2\u02f9\u02e4\u02eb\u02f4\u02cc\u02e1\u02e1\u02b1\u02b3\u02a5\u02a4\u02db", "\u0721\u0737\u073f\u0722\u076a\u0768\u077e\u077f\u0700", "\u05f8\u05ee\u05e6\u05fb\u05b3\u05b1\u05a7\u05c5\u05a6\u05d9", "7!)4p|~h\ni\u0016", "\u02a5\u02b3\u02bb\u02a6\u02ee\u02ec\u02fa\u0298\u029b\u02fb\u0284", "\u01d4\u01db\u01dc\u01d3\u01de\u01db\u01c8\u01d7\u018e\u018c\u019a\u019b\u01e4"})
public final class Class3398 {
    public static float field7391;
    public static int field7392 = 900892817;
    public static double field7393 = 0.49572377619250996;
    public static double field7394;
    public static float field7395;

    /*
     * WARNING - void declaration
     */
    private static CallSite DDKvvTi2It3Ujt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3398.HvOcJVvSFEPWJzN8(k2, 1238129155));
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
                int a2 = Integer.parseInt(Class3398.HvOcJVvSFEPWJzN8(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3398.HvOcJVvSFEPWJzN8(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3398.HvOcJVvSFEPWJzN8(k2, 1238129155) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String HvOcJVvSFEPWJzN8(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7395 = Float.intBitsToFloat(1062847887);
        Q\u200e = "Content-Type";
        field7394 = Double.longBitsToDouble(4603456453343707308L);
        field7391 = Float.intBitsToFloat(1092616192);
        aX\u200e = "The gradient factor";
    }
}

