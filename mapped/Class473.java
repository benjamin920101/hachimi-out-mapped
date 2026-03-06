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

@HACHIMI_CLIENT(mv=100, d1={"\u7d8d\u7d8e\u7d8a\u7d8d\u7d8b\u7d81\u7d81\u7d8a", "\ud258\ud25b\ud25f\ud25a\ud257\ud258\ud259\ud25f", "\u0675\u0675\u0671\u0679\u0679\u0670\u0678", "\u2c8c\u2c87\u2c88\u2c8d\u2c8c\u2c8a\u2c8f\u2c8a", "\u14ae\u14aa\u14ad\u14af\u14aa\u14aa\u14a2\u14af", "\u2b85\u2b85\u2b86\u2b81\u2b81\u2b84\u2b8e\u2b82", "\u7249\u724a\u724f\u724f\u724a\u7246\u7246\u7247", "\ue3c3\ue3c5\ue3c8\ue3c5\ue3c2\ue3c1\ue3c0\ue3c9", "\ub744\ub74e\ub74d\ub74e\ub74d\ub74f", "\ua44e\ua449\ua444\ua444\ua445\ua444\ua448\ua44a", "\uc813\uc811\uc817\uc814\uc816\uc818\uc814\uc814", "\u7c84\u7c81\u7c87\u7c84\u7c84\u7c82\u7c86\u7c80", "\uabad\uaba9\uaba5\uabae\uaba8\uabad\uaba8", "\ucd2b\ucd2d\ucd28\ucd2b\ucd2f\ucd29\ucd2f\ucd2c"}, d2={"\u035c\u0303\u030c\u0309\u030e\u0309\u0314\u035e\u035c\u035e\u0348\u0349\u0336", "\u0001TSTI\u0003\u0001\u0003\u0015\u0014k", "\u02ff\u02fd\u02ec\u02db\u02f4\u02f9\u02eb\u02eb\u02a4\u02a6\u02b0\u02b1\u02d4\u02f2\u02f9\u02ee\u02f9\u02b7\u02f4\u02f9\u02f6\u02ff\u02b7\u02db\u02f4\u02f9\u02eb\u02eb\u02a3", "\u0015\u001c\u000e\u0015>\u0012\u0019\u0018ACUT4", "\u0153\u0147\u0143\u0157\u015a\u0145\u010a\u0108\u011e\u017a\u015c\u0157\u0140\u0157\u0119\u015a\u0157\u0158\u0151\u0119\u0179\u0154\u015c\u0153\u0155\u0142\u010d\u011f\u016c", "\u032d\u0322\u0321\u0320\u032b\u0372\u0370\u0366\u0367\u0302\u0324\u032f\u0338\u032f\u0361\u0322\u032f\u0320\u0329\u0361\u0301\u032c\u0324\u032b\u032d\u033a\u0375", "\u07e7\u07fc\u07c0\u07e7\u07e1\u07fa\u07fd\u07f4\u07af\u07ad\u07bb\u07ba\u07df\u07f9\u07f2\u07e5\u07f2\u07bc\u07ff\u07f2\u07fd\u07f4\u07bc\u07c0\u07e7\u07e1\u07fa\u07fd\u07f4\u07a8", "\u04d3\u04d2\u04c9\u04d4\u04db\u04c4\u0481\u0483\u0495\u0494\u04eb", "\u027c\u027d\u0266\u027b\u0274\u026b\u0253\u027e\u027e\u022e\u022c\u023a\u023b\u0244", "es{f.,:;D", "\u00bd\u00ab\u00a3\u00be\u00f6\u00f4\u00e2\u0080\u00e3\u009c", "\u0708\u071e\u0716\u070b\u074f\u0743\u0741\u0757\u0735\u0756\u0729", "\u0461\u0477\u047f\u0462\u042a\u0428\u043e\u045c\u045f\u043f\u0440", "\u00bd\u00b2\u00b5\u00ba\u00b7\u00b2\u00a1\u00be\u00e7\u00e5\u00f3\u00f2\u008d"})
public final class Class473 {
    public static double field2466 = Double.longBitsToDouble(4603915374783088110L);
    public static double field2467 = 0.8794783226527209;
    public static float field2468;
    public static double field2469;
    public static float field2470;
    public static double field2471;
    public static double field2472 = 0.39934633281268905;

    static {
        field2471 = Double.longBitsToDouble(4590433938818999040L);
        field2470 = Float.intBitsToFloat(1057244649);
        field2469 = Double.longBitsToDouble(4593130360405242056L);
        field2468 = Float.intBitsToFloat(1053337760);
    }

    private static String YugTUJ7wrWFI7Ibo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite dqOxGclDPtH99D(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class473.YugTUJ7wrWFI7Ibo(k2, 619444074));
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
                int a2 = Integer.parseInt(Class473.YugTUJ7wrWFI7Ibo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class473.YugTUJ7wrWFI7Ibo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class473.YugTUJ7wrWFI7Ibo(k2, 619444074) + " " + l2 + " " + m2);
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

