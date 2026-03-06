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

@HACHIMI_CLIENT(mv=100, d1={"\u8cd3\u8cd9\u8cd8\u8cdc\u8cd3\u8cdc\u8cdc", "\u9dd1\u9dd0\u9dd5\u9dd2\u9dd8\u9dd8\u9dd5", "\u14c6\u14c1\u14c4\u14c3\u14c1\u14c9\u14c5\u14c8", "\u0511\u0516\u0510\u0516\u0512\u0511\u051d\u0511", "\ub4f9\ub4f7\ub4ff\ub4ff\ub4ff\ub4f7\ub4fd\ub4fb", "\u25c2\u25c6\u25c4\u25c7\u25c6\u25c0\u25cf\u25c5", "\ub6a7\ub6a2\ub6a3\ub6a2\ub6a7\ub6a6\ub6a0\ub6a5", "\u019e\u0199\u0199\u019f\u019d\u0193\u0198\u0198", "\u014a\u0149\u0148\u014a\u014b\u0147\u0146\u014c", "\u9f9a\u9f9a\u9f9a\u9f99\u9f9e\u9f9a\u9f9e\u9f9e", "\ub63a\ub634\ub639\ub63f\ub63b\ub63d\ub639\ub638", "\ue5e1\ue5eb\ue5e8\ue5e1\ue5e8\ue5ec\ue5e9", "\u59a9\u59ae\u59a2\u59a8\u59ab\u59a9\u59a8\u59af", "\u4747\u4746\u4741\u4745\u474e\u4743\u4743\u4742", "\uc267\uc261\uc267\uc26d\uc26c\uc261\uc261\uc26d"}, d2={"\u01be\u01b2\u01b1\u21d3\u01e1\u01e3\u01f5\u0191\u01b7\u01bc\u01ab\u01bc\u01f2\u01b1\u01bc\u01b3\u01ba\u01f2\u018e\u01a9\u01af\u01b4\u01b3\u01ba\u01e6\u01f4\u0191\u01b7\u01bc\u01ab\u01bc\u01f2\u01b1\u01bc\u01b3\u01ba\u01f2\u018e\u01a9\u01af\u01b4\u01b3\u01ba\u01e6", "\u0289\u02d6\u02d9\u02dc\u02db\u02dc\u02c1\u028b\u0289\u028b\u029d\u029c\u02e3", "\u02c0\u0295\u0292\u0295\u0288\u02c2\u02c0\u02c2\u02d4\u02d5\u02aa", "\u05be\u05bc\u05ad\u059a\u05b5\u05b8\u05aa\u05aa\u05e5\u05e7\u05f1\u05f0\u0595\u05b3\u05b8\u05af\u05b8\u05f6\u05b5\u05b8\u05b7\u05be\u05f6\u059a\u05b5\u05b8\u05aa\u05aa\u05e2", "\u0350\u0359\u034b\u0350\u037b\u0357\u035c\u035d\u0304\u0306\u0310\u0311\u0371", "\u0129\u013d\u0139\u012d\u0120\u013f\u0170\u0172\u0164\u0100\u0126\u012d\u013a\u012d\u0163\u0120\u012d\u0122\u012b\u0163\u0103\u012e\u0126\u0129\u012f\u0138\u0177\u0165\u0116", "\u0469\u0466\u0465\u0464\u046f\u0436\u0434\u0422\u0423\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0445\u0468\u0460\u046f\u0469\u047e\u0431", "\u0317\u030c\u0330\u0317\u0311\u030a\u030d\u0304\u035f\u035d\u034b\u034a\u032f\u0309\u0302\u0315\u0302\u034c\u030f\u0302\u030d\u0304\u034c\u0330\u0317\u0311\u030a\u030d\u0304\u0358", "\u02ca\u02cb\u02d0\u02cd\u02c2\u02dd\u0298\u029a\u028c\u028d\u02f2", "\u0626\u0627\u063c\u0621\u062e\u0631\u0609\u0624\u0624\u0674\u0676\u0660\u0661\u061e", "\u0271\u0267\u026f\u0272\u023a\u0238\u022e\u022f\u0250", "\u00df\u00c9\u00c1\u00dc\u0094\u0096\u0080\u00e2\u0081\u00fe", "\u03ba\u03ac\u03a4\u03b9\u03fd\u03f1\u03f3\u03e5\u0387\u03e4\u039b", "\u01bf\u01a9\u01a1\u01bc\u01f4\u01f6\u01e0\u0182\u0181\u01e1\u019e", "\u0239\u0236\u0231\u023e\u0233\u0236\u0225\u023a\u0263\u0261\u0277\u0276\u0209"})
public final class Class1134 {
    public static float field4552 = 0.6337614f;
    public static double field4553 = Double.longBitsToDouble(4605466555699259517L);
    public static float field4554 = 0.30735534f;

    static {
        N\u200e = "Prevents items from slowing down player";
    }

    private static String bX9drLqr967GKaSu(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wKFLeVpmtbJeFT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1134.bX9drLqr967GKaSu(k2, -1102844619));
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
                int a2 = Integer.parseInt(Class1134.bX9drLqr967GKaSu(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1134.bX9drLqr967GKaSu(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1134.bX9drLqr967GKaSu(k2, -1102844619) + " " + l2 + " " + m2);
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

