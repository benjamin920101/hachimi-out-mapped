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
@HACHIMI_CLIENT(mv=100, d1={"\u6176\u6177\u6170\u6171\u6176\u6175\u6177\u6176", "\u3fab\u3faa\u3fa9\u3faf\u3fad\u3fa1\u3fad\u3fa9", "\ub712\ub711\ub713\ub713\ub710\ub714\ub711\ub711", "\u1841\u1846\u1840\u1842\u1847\u1840\u1848\u1849", "\udf66\udf62\udf61\udf64\udf64\udf60\udf6c\udf64", "\u12af\u12a8\u12aa\u12a0\u12aa\u12a8\u12aa\u12a8", "\u49fa\u49fb\u49fc\u49f4\u49fc\u49fc\u49fb\u49f8", "\u5f02\u5f04\u5f01\u5f0a\u5f06\u5f0a\u5f03\u5f02", "\u4726\u4724\u4725\u4725\u4722\u4726\u4721\u472b", "\u19ea\u19ec\u19ee\u19ee\u19eb\u19ea\u19e9\u19ec", "\u77c7\u77ce\u77cc\u77cd\u77c6\u77cc\u77cb", "\u6b1e\u6b1d\u6b1e\u6b1f\u6b1c\u6b1b\u6b19\u6b13", "\u6086\u6080\u608b\u6082\u6087\u6085\u608b\u6086", "\u255a\u2553\u2558\u255e\u2558\u255a\u2558\u255e", "\u50a7\u50ad\u50a6\u50a6\u50af\u50a9\u50ad"}, d2={"\u065f\u0665\u0656\u2620\u0612\u0610\u0606\u0662\u0644\u064f\u0658\u064f\u0601\u0642\u064f\u0640\u0649\u0601\u067d\u065a\u065c\u0647\u0640\u0649\u0615\u0607\u0662\u0644\u064f\u0658\u064f\u0601\u0642\u064f\u0640\u0649\u0601\u067d\u065a\u065c\u0647\u0640\u0649\u0615", "\"}rwpwj \" 67H", "\u0739\u076c\u076b\u076c\u0771\u073b\u0739\u073b\u072d\u072c\u0753", "\u0723\u0721\u0730\u0707\u0728\u0725\u0737\u0737\u0778\u077a\u076c\u076d\u0708\u072e\u0725\u0732\u0725\u076b\u0728\u0725\u072a\u0723\u076b\u0707\u0728\u0725\u0737\u0737\u077f", "\u0133\u013a\u0128\u0133\u0118\u0134\u013f\u013e\u0167\u0165\u0173\u0172\u0112", "\u05d9\u05cd\u05c9\u05dd\u05d0\u05cf\u0580\u0582\u0594\u05f0\u05d6\u05dd\u05ca\u05dd\u0593\u05d0\u05dd\u05d2\u05db\u0593\u05f3\u05de\u05d6\u05d9\u05df\u05c8\u0587\u0595\u05e6", "\u03a0\u03af\u03ac\u03ad\u03a6\u03ff\u03fd\u03eb\u03ea\u038f\u03a9\u03a2\u03b5\u03a2\u03ec\u03af\u03a2\u03ad\u03a4\u03ec\u038c\u03a1\u03a9\u03a6\u03a0\u03b7\u03f8", "\u05e6\u05fd\u05c1\u05e6\u05e0\u05fb\u05fc\u05f5\u05ae\u05ac\u05ba\u05bb\u05de\u05f8\u05f3\u05e4\u05f3\u05bd\u05fe\u05f3\u05fc\u05f5\u05bd\u05c1\u05e6\u05e0\u05fb\u05fc\u05f5\u05a9", "\u0084\u0085\u009e\u0083\u008c\u0093\u00d6\u00d4\u00c2\u00c3\u00bc", "\u0311\u0310\u030b\u0316\u0319\u0306\u033e\u0313\u0313\u0343\u0341\u0357\u0356\u0329", "\u00b9\u00af\u00a7\u00ba\u00f2\u00f0\u00e6\u00e7\u0098", "\u0018\u000e\u0006\u001bSQG%F9", "\u00c6\u00d0\u00d8\u00c5\u0081\u008d\u008f\u0099\u00fb\u0098\u00e7", "\u04fa\u04ec\u04e4\u04f9\u04b1\u04b3\u04a5\u04c7\u04c4\u04a4\u04db", "jebm`evi02$%Z"})
public final class Class4135 {
    public static float field9597 = 0.9732734f;
    public static float field9598;
    public static int field9599 = 481511916;
    public static float field9600;
    public static float field9601;

    private static String 69EGkewj7sVs4CqE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9601 = Float.intBitsToFloat(1105723392);
        H\u200e = "Join Count";
        field9600 = Float.intBitsToFloat(1055807576);
        field9598 = Float.intBitsToFloat(1061668065);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ceqedGlJ4iGdGK(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4135.69EGkewj7sVs4CqE(k2, -1735549253));
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
                int a2 = Integer.parseInt(Class4135.69EGkewj7sVs4CqE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4135.69EGkewj7sVs4CqE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4135.69EGkewj7sVs4CqE(k2, -1735549253) + " " + l2 + " " + m2);
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

