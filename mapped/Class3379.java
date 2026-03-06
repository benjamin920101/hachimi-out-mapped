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
@HACHIMI_CLIENT(mv=100, d1={"\u8348\u834a\u8343\u8342\u834d\u834d\u834e\u834f", "\u16a2\u16a1\u16a6\u16a8\u16a7\u16a6\u16a5\u16a7", "\ub0b3\ub0b6\ub0b7\ub0b5\ub0b7\ub0b3\ub0b7\ub0b0", "\u1fcd\u1fc8\u1fc7\u1fcd\u1fcd\u1fcb\u1fcd\u1fce", "\u94e2\u94ea\u94eb\u94e2\u94ed\u94ee\u94ee", "\ucb12\ucb19\ucb11\ucb17\ucb15\ucb13\ucb17\ucb13", "\u6076\u607d\u6076\u6073\u6077\u607c\u6076", "\u5325\u532a\u532b\u532b\u5322\u5325\u5321\u532b", "\u6808\u680b\u680d\u6805\u6809\u6804\u680e\u6804", "\u4367\u4362\u4363\u4364\u4366\u4360\u4360\u436a", "\u5f3b\u5f3a\u5f39\u5f3b\u5f39\u5f3c\u5f3f\u5f39", "\ud92b\ud92f\ud92f\ud928\ud92e\ud920\ud920\ud920", "\ue4ae\ue4a2\ue4a2\ue4a8\ue4ac\ue4a9\ue4a3", "\u59d0\u59db\u59d3\u59d0\u59d6\u59d0", "\ucb28\ucb2e\ucb2c\ucb2e\ucb2a\ucb2b\ucb28\ucb26"}, d2={"\u03e0\u03f3\u03fb\u2385\u03b7\u03b5\u03a3\u03c7\u03e1\u03ea\u03fd\u03ea\u03a4\u03e7\u03ea\u03e5\u03ec\u03a4\u03d8\u03ff\u03f9\u03e2\u03e5\u03ec\u03b0\u03a2\u03c7\u03e1\u03ea\u03fd\u03ea\u03a4\u03e7\u03ea\u03e5\u03ec\u03a4\u03d8\u03ff\u03f9\u03e2\u03e5\u03ec\u03b0", "\u0444\u041b\u0414\u0411\u0416\u0411\u040c\u0446\u0444\u0446\u0450\u0451\u042e", "\u07e1\u07b4\u07b3\u07b4\u07a9\u07e3\u07e1\u07e3\u07f5\u07f4\u078b", "\u00a6\u00a4\u00b5\u0082\u00ad\u00a0\u00b2\u00b2\u00fd\u00ff\u00e9\u00e8\u008d\u00ab\u00a0\u00b7\u00a0\u00ee\u00ad\u00a0\u00af\u00a6\u00ee\u0082\u00ad\u00a0\u00b2\u00b2\u00fa", "\u02a8\u02a1\u02b3\u02a8\u0283\u02af\u02a4\u02a5\u02fc\u02fe\u02e8\u02e9\u0289", "\u073c\u0728\u072c\u0738\u0735\u072a\u0765\u0767\u0771\u0715\u0733\u0738\u072f\u0738\u0776\u0735\u0738\u0737\u073e\u0776\u0716\u073b\u0733\u073c\u073a\u072d\u0762\u0770\u0703", "\u0165\u016a\u0169\u0168\u0163\u013a\u0138\u012e\u012f\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0149\u0164\u016c\u0163\u0165\u0172\u013d", "\u0686\u069d\u06a1\u0686\u0680\u069b\u069c\u0695\u06ce\u06cc\u06da\u06db\u06be\u0698\u0693\u0684\u0693\u06dd\u069e\u0693\u069c\u0695\u06dd\u06a1\u0686\u0680\u069b\u069c\u0695\u06c9", "\u06ae\u06af\u06b4\u06a9\u06a6\u06b9\u06fc\u06fe\u06e8\u06e9\u0696", "\u0516\u0517\u050c\u0511\u051e\u0501\u0539\u0514\u0514\u0544\u0546\u0550\u0551\u052e", "\u01a6\u01b0\u01b8\u01a5\u01ed\u01ef\u01f9\u01f8\u0187", "\u01b9\u01af\u01a7\u01ba\u01f2\u01f0\u01e6\u0184\u01e7\u0198", "\u0451\u0447\u044f\u0452\u0416\u041a\u0418\u040e\u046c\u040f\u0470", "\u0012\u0004\f\u0011Y[M/,L3", "\u05a5\u05aa\u05ad\u05a2\u05af\u05aa\u05b9\u05a6\u05ff\u05fd\u05eb\u05ea\u0595"})
public final class Class3379 {
    public static float field7341;
    public static float field7342;

    static {
        K\u200e = "StartDelay";
        field7341 = Float.intBitsToFloat(1059348587);
        field7342 = Float.intBitsToFloat(1048350192);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite eAVvoGe0ASWWMV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3379.3s4iDtzPkwQhnIyR(k2, -1992517006));
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
                int a2 = Integer.parseInt(Class3379.3s4iDtzPkwQhnIyR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3379.3s4iDtzPkwQhnIyR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3379.3s4iDtzPkwQhnIyR(k2, -1992517006) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 3s4iDtzPkwQhnIyR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

