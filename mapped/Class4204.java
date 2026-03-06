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
@HACHIMI_CLIENT(mv=100, d1={"\u6316\u631d\u6316\u6317\u6315\u6310\u6316\u6317", "\uceec\ucee0\uceef\uceef\ucee8\uceee\ucee1", "\u9662\u9664\u9663\u9661\u9666\u9666\u9666\u9661", "\u0df8\u0df8\u0dff\u0dfc\u0dff\u0dfe\u0dfd\u0dfe", "\u1ed5\u1ed5\u1ed6\u1ed8\u1ed5\u1ed6\u1ed7\u1ed8", "\ua303\ua301\ua30e\ua307\ua304\ua306\ua301\ua304", "\u6a1c\u6a19\u6a1c\u6a1a\u6a19\u6a16\u6a1a\u6a1c", "\ubf3f\ubf3d\ubf39\ubf3e\ubf3b\ubf3f\ubf31\ubf39", "\u6853\u685e\u6851\u6854\u6850\u6850\u6857\u685f", "\u3690\u369f\u369f\u369b\u369b\u369b\u369e", "\ud937\ud937\ud933\ud935\ud93b\ud932\ud934\ud93b", "\ub577\ub576\ub572\ub574\ub576\ub574\ub572\ub573", "\uaf95\uaf96\uaf99\uaf91\uaf98\uaf97\uaf96\uaf94", "\u7728\u772b\u772b\u772b\u7724\u772f\u772d\u772d", "\u435b\u435f\u435a\u435f\u435a\u4357\u435b\u435d", "\u0c57\u0c5e\u0c54\u0c5e\u0c51\u0c57\u0c51\u0c55", "\ucd5d\ucd5c\ucd58\ucd5a\ucd5e\ucd5b\ucd5a\ucd5d"}, d2={"\u06da\u06c4\u06f4\u26a0\u0692\u0690\u0686\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u022f\u0230\u023a\u2255\u0267\u0265\u0273\u0217\u0231\u023a\u022d\u023a\u0274\u0237\u023a\u0235\u023c\u0274\u0208\u022f\u0229\u0232\u0235\u023c\u0260\u0272\u0217\u0231\u023a\u022d\u023a\u0274\u0237\u023a\u0235\u023c\u0274\u0208\u022f\u0229\u0232\u0235\u023c\u0260", "\u037a\u0365\u036c\u2300\u0332\u0330\u0326\u0342\u0364\u036f\u0378\u036f\u0321\u0362\u036f\u0360\u0369\u0321\u035d\u037a\u037c\u0367\u0360\u0369\u0335\u0327\u0342\u0364\u036f\u0378\u036f\u0321\u0362\u036f\u0360\u0369\u0321\u035d\u037a\u037c\u0367\u0360\u0369\u0335", "\u01bb\u01e4\u01eb\u01ee\u01e9\u01ee\u01f3\u01b9\u01bb\u01b9\u01af\u01ae\u01d1", "\u0528\u057d\u057a\u057d\u0560\u052a\u0528\u052a\u053c\u053d\u0542", "\u05c9\u05cb\u05da\u05ed\u05c2\u05cf\u05dd\u05dd\u0592\u0590\u0586\u0587\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05ed\u05c2\u05cf\u05dd\u05dd\u0595", "\u0281\u0288\u029a\u0281\u02aa\u0286\u028d\u028c\u02d5\u02d7\u02c1\u02c0\u02a0", "\u05fe\u05ea\u05ee\u05fa\u05f7\u05e8\u05a7\u05a5\u05b3\u05d7\u05f1\u05fa\u05ed\u05fa\u05b4\u05f7\u05fa\u05f5\u05fc\u05b4\u05d4\u05f9\u05f1\u05fe\u05f8\u05ef\u05a0\u05b2\u05c1", "\u051d\u0512\u0511\u0510\u051b\u0542\u0540\u0556\u0557\u0532\u0514\u051f\u0508\u051f\u0551\u0512\u051f\u0510\u0519\u0551\u0531\u051c\u0514\u051b\u051d\u050a\u0545", "\u040d\u0416\u042a\u040d\u040b\u0410\u0417\u041e\u0445\u0447\u0451\u0450\u0435\u0413\u0418\u040f\u0418\u0456\u0415\u0418\u0417\u041e\u0456\u042a\u040d\u040b\u0410\u0417\u041e\u0442", "\u0405\u0404\u041f\u0402\u040d\u0412\u0457\u0455\u0443\u0442\u043d", "\u0150\u0151\u014a\u0157\u0158\u0147\u017f\u0152\u0152\u0102\u0100\u0116\u0117\u0168", "\u018b\u019d\u0195\u0188\u01c0\u01c2\u01d4\u01d5\u01aa", "\u0281\u0297\u029f\u0282\u02ca\u02c8\u02de\u02bc\u02df\u02a0", "\u03b2\u03a4\u03ac\u03b1\u03f5\u03f9\u03fb\u03ed\u038f\u03ec\u0393", "\u00c9\u00df\u00d7\u00ca\u0082\u0080\u0096\u00f4\u00f7\u0097\u00e8", "\u0342\u034d\u034a\u0345\u0348\u034d\u035e\u0341\u0318\u031a\u030c\u030d\u0372"})
public final class Class4204 {
    public static int field9825 = -1293105741;
    public static double field9826;

    /*
     * WARNING - void declaration
     */
    private static CallSite c5jlvd0OwqgiQP(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4204.2N8JcL6r5iW1EMiX(k2, -1953746876));
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
                int a2 = Integer.parseInt(Class4204.2N8JcL6r5iW1EMiX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4204.2N8JcL6r5iW1EMiX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4204.2N8JcL6r5iW1EMiX(k2, -1953746876) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 2N8JcL6r5iW1EMiX(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        J\u200e = "Prevents vanilla flight detection";
        field9826 = Double.longBitsToDouble(4603902137173810050L);
        aF\u200e = "PEARL";
        aH\u200e = "MOVE";
    }
}

