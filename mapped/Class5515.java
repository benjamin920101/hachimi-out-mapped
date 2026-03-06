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

@HACHIMI_CLIENT(mv=100, d1={"\u78c5\u78c7\u78c7\u78c4\u78c2\u78c5\u78c0\u78c4", "\uc6bc\uc6b8\uc6b7\uc6bf\uc6b6\uc6b6\uc6b9\uc6b6", "\u1088\u1087\u1088\u1086\u108b\u1087\u1089\u1088", "\uabe2\uabe3\uabe7\uabe3\uabe5\uabea\uabe3\uabe6", "\u61fb\u61f3\u61f3\u61f6\u61f5\u61f5\u61f6", "\uba17\uba1a\uba15\uba16\uba1b\uba15\uba10\uba11", "\u74e7\u74e2\u74e5\u74e6\u74e5\u74e0\u74e1\u74e4", "\u4c96\u4c93\u4c95\u4c93\u4c93\u4c92\u4c95\u4c96", "\u61bc\u61b6\u61b6\u61bb\u61be\u61bb\u61b8\u61bc", "\u472e\u472f\u4725\u472a\u472c\u472d\u472d\u4724", "\ud7fc\ud7f9\ud7f9\ud7fb\ud7f5\ud7fd\ud7fe\ud7f4", "\u33e4\u33ef\u33e1\u33e7\u33e1\u33e5\u33e7\u33e0", "\uc729\uc72c\uc720\uc720\uc728\uc72e\uc72e\uc729", "\u2ad4\u2ad4\u2ad7\u2ad6\u2ad0\u2ad0\u2ad4\u2adf", "\u7d20\u7d21\u7d21\u7d28\u7d26\u7d20\u7d24\u7d21"}, d2={"\u0123\u0125\u0131\u214a\u0178\u017a\u016c\u0108\u012e\u0125\u0132\u0125\u016b\u0128\u0125\u012a\u0123\u016b\u0117\u0130\u0136\u012d\u012a\u0123\u017f\u016d\u0108\u012e\u0125\u0132\u0125\u016b\u0128\u0125\u012a\u0123\u016b\u0117\u0130\u0136\u012d\u012a\u0123\u017f", "\u016f\u0130\u013f\u013a\u013d\u013a\u0127\u016d\u016f\u016d\u017b\u017a\u0105", "\u065a\u060f\u0608\u060f\u0612\u0658\u065a\u0658\u064e\u064f\u0630", "\u02f6\u02f4\u02e5\u02d2\u02fd\u02f0\u02e2\u02e2\u02ad\u02af\u02b9\u02b8\u02dd\u02fb\u02f0\u02e7\u02f0\u02be\u02fd\u02f0\u02ff\u02f6\u02be\u02d2\u02fd\u02f0\u02e2\u02e2\u02aa", "\u04dc\u04d5\u04c7\u04dc\u04f7\u04db\u04d0\u04d1\u0488\u048a\u049c\u049d\u04fd", "\u05e8\u05fc\u05f8\u05ec\u05e1\u05fe\u05b1\u05b3\u05a5\u05c1\u05e7\u05ec\u05fb\u05ec\u05a2\u05e1\u05ec\u05e3\u05ea\u05a2\u05c2\u05ef\u05e7\u05e8\u05ee\u05f9\u05b6\u05a4\u05d7", "\u0112\u011d\u011e\u011f\u0114\u014d\u014f\u0159\u0158\u013d\u011b\u0110\u0107\u0110\u015e\u011d\u0110\u011f\u0116\u015e\u013e\u0113\u011b\u0114\u0112\u0105\u014a", "\u0357\u034c\u0370\u0357\u0351\u034a\u034d\u0344\u031f\u031d\u030b\u030a\u036f\u0349\u0342\u0355\u0342\u030c\u034f\u0342\u034d\u0344\u030c\u0370\u0357\u0351\u034a\u034d\u0344\u0318", "\u0782\u0783\u0798\u0785\u078a\u0795\u07d0\u07d2\u07c4\u07c5\u07ba", "\u04bc\u04bd\u04a6\u04bb\u04b4\u04ab\u0493\u04be\u04be\u04ee\u04ec\u04fa\u04fb\u0484", "\u0087\u0091\u0099\u0084\u00cc\u00ce\u00d8\u00d9\u00a6", "\u0293\u0285\u028d\u0290\u02d8\u02da\u02cc\u02ae\u02cd\u02b2", "\u0663\u0675\u067d\u0660\u0624\u0628\u062a\u063c\u065e\u063d\u0642", "\u04e0\u04f6\u04fe\u04e3\u04ab\u04a9\u04bf\u04dd\u04de\u04be\u04c1", "\u0559\u0556\u0551\u055e\u0553\u0556\u0545\u055a\u0503\u0501\u0517\u0516\u0569"})
public final class Class5515 {
    public static float field10414;
    public static float field10415;
    public static float field10416;

    /*
     * WARNING - void declaration
     */
    private static CallSite hBGDwdAuELSIVb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5515.QQTAveCeWDv4EYIN(k2, -322233120));
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
                int a2 = Integer.parseInt(Class5515.QQTAveCeWDv4EYIN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5515.QQTAveCeWDv4EYIN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5515.QQTAveCeWDv4EYIN(k2, -322233120) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String QQTAveCeWDv4EYIN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aa\u200e = "Automatically disconnects from server during combat";
        field10416 = Float.intBitsToFloat(1062145905);
        field10414 = Float.intBitsToFloat(1057091217);
        field10415 = Float.intBitsToFloat(1040374148);
    }
}

