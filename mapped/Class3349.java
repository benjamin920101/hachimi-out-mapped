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

@HACHIMI_CLIENT(mv=100, d1={"\u4a2b\u4a2f\u4a2f\u4a2b\u4a2e\u4a2d\u4a28\u4a26", "\uace7\uace7\uace4\uace1\uace8\uace9\uace4\uace2", "\ucdf7\ucdf0\ucdf0\ucdf3\ucdf0\ucdf6\ucdf1", "\u5b04\u5b02\u5b05\u5b03\u5b03\u5b0b\u5b00\u5b0b", "\u4742\u4740\u4748\u4746\u4743\u4742\u4743\u4748", "\u45f4\u45fe\u45f4\u45ff\u45f2\u45f7\u45f3\u45f7", "\u7429\u7420\u742f\u742d\u7421\u7420\u742f", "\u5b61\u5b6a\u5b67\u5b67\u5b64\u5b65\u5b67\u5b65", "\ud3d0\ud3dd\ud3dc\ud3d0\ud3d7\ud3dc\ud3dd\ud3d2", "\u13d8\u13d4\u13dc\u13dc\u13d4\u13dc\u13d8\u13de", "\u332e\u332a\u332c\u332a\u332b\u332b\u3328\u332e", "\u8447\u8444\u8444\u8443\u8441\u8442\u8447\u8444", "\ub547\ub547\ub541\ub545\ub546\ub54b\ub542\ub541", "\u8beb\u8bea\u8bef\u8bee\u8be0\u8be0\u8bea\u8be9", "\ud2ff\ud2fe\ud2fa\ud2ff\ud2f8\ud2f6\ud2f6\ud2fa", "\ud154\ud15c\ud155\ud150\ud157\ud157\ud15d\ud15d", "\uac31\uac33\uac3c\uac34\uac30\uac36\uac3c\uac33"}, d2={"\u022c\u0210\u023b\u2251\u0263\u0261\u0277\u0213\u0235\u023e\u0229\u023e\u0270\u0233\u023e\u0231\u0238\u0270\u020c\u022b\u022d\u0236\u0231\u0238\u0264\u0276\u0213\u0235\u023e\u0229\u023e\u0270\u0233\u023e\u0231\u0238\u0270\u020c\u022b\u022d\u0236\u0231\u0238\u0264", "\u0316\u032a\u0300\u236b\u0359\u035b\u034d\u0329\u030f\u0304\u0313\u0304\u034a\u0309\u0304\u030b\u0302\u034a\u0336\u0311\u0317\u030c\u030b\u0302\u035e\u034c\u0329\u030f\u0304\u0313\u0304\u034a\u0309\u0304\u030b\u0302\u034a\u0336\u0311\u0317\u030c\u030b\u0302\u035e", "\u03d3\u03ef\u03c6\u23ae\u039c\u039e\u0388\u03ec\u03ca\u03c1\u03d6\u03c1\u038f\u03cc\u03c1\u03ce\u03c7\u038f\u03f3\u03d4\u03d2\u03c9\u03ce\u03c7\u039b\u0389\u03ec\u03ca\u03c1\u03d6\u03c1\u038f\u03cc\u03c1\u03ce\u03c7\u038f\u03f3\u03d4\u03d2\u03c9\u03ce\u03c7\u039b", "\u05dc\u0583\u058c\u0589\u058e\u0589\u0594\u05de\u05dc\u05de\u05c8\u05c9\u05b6", "\u034e\u031b\u031c\u031b\u0306\u034c\u034e\u034c\u035a\u035b\u0324", "\u029e\u029c\u028d\u02ba\u0295\u0298\u028a\u028a\u02c5\u02c7\u02d1\u02d0\u02b5\u0293\u0298\u028f\u0298\u02d6\u0295\u0298\u0297\u029e\u02d6\u02ba\u0295\u0298\u028a\u028a\u02c2", "\u035c\u0355\u0347\u035c\u0377\u035b\u0350\u0351\u0308\u030a\u031c\u031d\u037d", "\u00e2\u00f6\u00f2\u00e6\u00eb\u00f4\u00bb\u00b9\u00af\u00cb\u00ed\u00e6\u00f1\u00e6\u00a8\u00eb\u00e6\u00e9\u00e0\u00a8\u00c8\u00e5\u00ed\u00e2\u00e4\u00f3\u00bc\u00ae\u00dd", "\u0676\u0679\u067a\u067b\u0670\u0629\u062b\u063d\u063c\u0659\u067f\u0674\u0663\u0674\u063a\u0679\u0674\u067b\u0672\u063a\u065a\u0677\u067f\u0670\u0676\u0661\u062e", "\u068e\u0695\u06a9\u068e\u0688\u0693\u0694\u069d\u06c6\u06c4\u06d2\u06d3\u06b6\u0690\u069b\u068c\u069b\u06d5\u0696\u069b\u0694\u069d\u06d5\u06a9\u068e\u0688\u0693\u0694\u069d\u06c1", "\u0194\u0195\u018e\u0193\u019c\u0183\u01c6\u01c4\u01d2\u01d3\u01ac", "\u06dc\u06dd\u06c6\u06db\u06d4\u06cb\u06f3\u06de\u06de\u068e\u068c\u069a\u069b\u06e4", "\u02f5\u02e3\u02eb\u02f6\u02be\u02bc\u02aa\u02ab\u02d4", "\u0782\u0794\u079c\u0781\u07c9\u07cb\u07dd\u07bf\u07dc\u07a3", "\u024e\u0258\u0250\u024d\u0209\u0205\u0207\u0211\u0273\u0210\u026f", "\u00a5\u00b3\u00bb\u00a6\u00ee\u00ec\u00fa\u0098\u009b\u00fb\u0084", "\u075f\u0750\u0757\u0758\u0755\u0750\u0743\u075c\u0705\u0707\u0711\u0710\u076f"})
public final class Class3349 {
    public static float field7244;
    public static float field7245;
    public static float field7246;
    public static int field7247 = -1460423764;
    public static float field7248 = 0.33133167f;

    /*
     * WARNING - void declaration
     */
    private static CallSite j6BJLy9yaX4JaS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3349.PwFvKBONwn5NoK2b(k2, -257427327));
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
                int a2 = Integer.parseInt(Class3349.PwFvKBONwn5NoK2b(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3349.PwFvKBONwn5NoK2b(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3349.PwFvKBONwn5NoK2b(k2, -257427327) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String PwFvKBONwn5NoK2b(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        a\u200e = "kit";
        l\u200e = "CollideSkip";
        N\u200e = ", ";
        field7245 = Float.intBitsToFloat(0x40E00000);
        field7246 = Float.intBitsToFloat(0x40900000);
        field7244 = Float.intBitsToFloat(1052577158);
    }
}

