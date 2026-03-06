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
@HACHIMI_CLIENT(mv=100, d1={"\u171d\u171e\u1719\u1718\u1710\u171e\u171a\u171a", "\ua082\ua084\ua086\ua081\ua082\ua08e\ua08f\ua080", "\u79b8\u79bf\u79b8\u79b2\u79b9\u79b8\u79b2\u79b8", "\ua91d\ua91f\ua91a\ua91e\ua911\ua91f\ua91c\ua918", "\u52b9\u52be\u52bd\u52bf\u52be\u52b9\u52bc", "\u7809\u780a\u780c\u780d\u7802\u780b\u7803\u780f", "\u8861\u886c\u8861\u8865\u8862\u8863\u8860\u8861", "\u18bf\u18b8\u18bd\u18b9\u18b0\u18bc\u18bd\u18b1", "\ub8ce\ub8c3\ub8cb\ub8c2\ub8cb\ub8c2\ub8cd\ub8c3", "\ue6b9\ue6bc\ue6bf\ue6b8\ue6bf\ue6bc\ue6bd\ue6b6", "\uca1c\uca1d\uca1f\uca1e\uca1b\uca1d\uca1d\uca19", "\u27b2\u27b0\u27b0\u27b4\u27b9\u27b5\u27b3\u27b5", "\u880f\u880c\u880b\u880c\u880a\u880b\u880f\u880d", "\u875a\u8759\u8759\u875f\u8758\u8753\u875e\u8759"}, d2={"\u076c\u0733\u073c\u0739\u073e\u0739\u0724\u076e\u076c\u076e\u0778\u0779\u0706", "\u0681\u06d4\u06d3\u06d4\u06c9\u0683\u0681\u0683\u0695\u0694\u06eb", "\u07d1\u07d3\u07c2\u07f5\u07da\u07d7\u07c5\u07c5\u078a\u0788\u079e\u079f\u07fa\u07dc\u07d7\u07c0\u07d7\u0799\u07da\u07d7\u07d8\u07d1\u0799\u07f5\u07da\u07d7\u07c5\u07c5\u078d", "\u0753\u075a\u0748\u0753\u0778\u0754\u075f\u075e\u0707\u0705\u0713\u0712\u0772", "\u03a6\u03b2\u03b6\u03a2\u03af\u03b0\u03ff\u03fd\u03eb\u038f\u03a9\u03a2\u03b5\u03a2\u03ec\u03af\u03a2\u03ad\u03a4\u03ec\u038c\u03a1\u03a9\u03a6\u03a0\u03b7\u03f8\u03ea\u0399", "\u01b0\u01bf\u01bc\u01bd\u01b6\u01ef\u01ed\u01fb\u01fa\u019f\u01b9\u01b2\u01a5\u01b2\u01fc\u01bf\u01b2\u01bd\u01b4\u01fc\u019c\u01b1\u01b9\u01b6\u01b0\u01a7\u01e8", "\u044c\u0457\u046b\u044c\u044a\u0451\u0456\u045f\u0404\u0406\u0410\u0411\u0474\u0452\u0459\u044e\u0459\u0417\u0454\u0459\u0456\u045f\u0417\u046b\u044c\u044a\u0451\u0456\u045f\u0403", "TUNS\\C\u0006\u0004\u0012\u0013l", "\u0587\u0586\u059d\u0580\u058f\u0590\u05a8\u0585\u0585\u05d5\u05d7\u05c1\u05c0\u05bf", "\u00cb\u00dd\u00d5\u00c8\u0080\u0082\u0094\u0095\u00ea", "\u0422\u0434\u043c\u0421\u0469\u046b\u047d\u041f\u047c\u0403", "\u0436\u0420\u0428\u0435\u0471\u047d\u047f\u0469\u040b\u0468\u0417", "\u01cd\u01db\u01d3\u01ce\u0186\u0184\u0192\u01f0\u01f3\u0193\u01ec", "\u01b0\u01bf\u01b8\u01b7\u01ba\u01bf\u01ac\u01b3\u01ea\u01e8\u01fe\u01ff\u0180"})
public final class Class3622 {
    public static double field8088 = Double.longBitsToDouble(4604476307670786999L);
    public static int field8089 = 1054802684;

    /*
     * WARNING - void declaration
     */
    private static CallSite qNizsNyoTA4KG9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3622.9dvaSTkl4nWL2seV(k2, -2104657905));
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
                int a2 = Integer.parseInt(Class3622.9dvaSTkl4nWL2seV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3622.9dvaSTkl4nWL2seV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3622.9dvaSTkl4nWL2seV(k2, -2104657905) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 9dvaSTkl4nWL2seV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 8600 : 8601;
            block5: while (true) {
                switch (n2) {
                    case 8601: {
                        n2 = 8599;
                        continue block5;
                    }
                    case 8600: {
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

