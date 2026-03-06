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

@HACHIMI_CLIENT(mv=100, d1={"\u8693\u8696\u8694\u8691\u8690\u8697\u8695\u869e", "\u8cc3\u8cc7\u8cc0\u8cc2\u8cc0\u8cc9\u8cc7\u8cc7", "\ub193\ub193\ub194\ub197\ub19b\ub192\ub19a\ub19b", "\u3b67\u3b66\u3b65\u3b68\u3b62\u3b63\u3b67\u3b67", "\u80b7\u80b4\u80b2\u80be\u80b6\u80b5\u80b7\u80b3", "\uce15\uce12\uce13\uce15\uce13\uce17\uce12\uce10", "\ub1ed\ub1e9\ub1e0\ub1e8\ub1e8\ub1ed\ub1ee\ub1e9", "\u756f\u7565\u756a\u756e\u756b\u7568\u756c\u7564", "\u8aa9\u8aab\u8aa8\u8aa8\u8aac\u8aa6\u8aab\u8aa9", "\u9420\u9426\u9424\u9425\u9426\u9427\u9427\u9422", "\u014a\u014e\u014c\u0141\u0149\u0141\u014d\u014d", "\u57d8\u57da\u57da\u57d8\u57dd\u57df\u57d6\u57da", "\u4744\u4749\u4746\u4741\u4745\u4741\u4749", "\ucdf8\ucdfb\ucdfa\ucdfa\ucdf8\ucdfc\ucdf9\ucdfc"}, d2={"\u0660\u063f\u0630\u0635\u0632\u0635\u0628\u0662\u0660\u0662\u0674\u0675\u060a", "\u0303\u0356\u0351\u0356\u034b\u0301\u0303\u0301\u0317\u0316\u0369", "\u01cc\u01ce\u01df\u01e8\u01c7\u01ca\u01d8\u01d8\u0197\u0195\u0183\u0182\u01e7\u01c1\u01ca\u01dd\u01ca\u0184\u01c7\u01ca\u01c5\u01cc\u0184\u01e8\u01c7\u01ca\u01d8\u01d8\u0190", "\u04b6\u04bf\u04ad\u04b6\u049d\u04b1\u04ba\u04bb\u04e2\u04e0\u04f6\u04f7\u0497", "\u051d\u0509\u050d\u0519\u0514\u050b\u0544\u0546\u0550\u0534\u0512\u0519\u050e\u0519\u0557\u0514\u0519\u0516\u051f\u0557\u0537\u051a\u0512\u051d\u051b\u050c\u0543\u0551\u0522", "\u07a2\u07ad\u07ae\u07af\u07a4\u07fd\u07ff\u07e9\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u078e\u07a3\u07ab\u07a4\u07a2\u07b5\u07fa", "\u0469\u0472\u044e\u0469\u046f\u0474\u0473\u047a\u0421\u0423\u0435\u0434\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u044e\u0469\u046f\u0474\u0473\u047a\u0426", "\u07b6\u07b7\u07ac\u07b1\u07be\u07a1\u07e4\u07e6\u07f0\u07f1\u078e", "\u03c4\u03c5\u03de\u03c3\u03cc\u03d3\u03eb\u03c6\u03c6\u0396\u0394\u0382\u0383\u03fc", "\u0313\u0305\u030d\u0310\u0358\u035a\u034c\u034d\u0332", "\u02f1\u02e7\u02ef\u02f2\u02ba\u02b8\u02ae\u02cc\u02af\u02d0", "\u053c\u052a\u0522\u053f\u057b\u0577\u0575\u0563\u0501\u0562\u051d", "\u0345\u0353\u035b\u0346\u030e\u030c\u031a\u0378\u037b\u031b\u0364", "\u05a3\u05ac\u05ab\u05a4\u05a9\u05ac\u05bf\u05a0\u05f9\u05fb\u05ed\u05ec\u0593"})
public final class Class5558 {
    public static double field10527;
    public static int field10528 = 394587042;
    public static double field10529;
    public static double field10530;
    public static float field10531;

    /*
     * WARNING - void declaration
     */
    private static CallSite hlW3O3YyPz1wgb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5558.oIY4DazicjGjTO8D(k2, -1355637510));
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
                int a2 = Integer.parseInt(Class5558.oIY4DazicjGjTO8D(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5558.oIY4DazicjGjTO8D(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5558.oIY4DazicjGjTO8D(k2, -1355637510) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field10529 = Double.longBitsToDouble(4603007146501549173L);
        field10531 = Float.intBitsToFloat(1056780218);
        field10527 = Double.longBitsToDouble(4604175570059510657L);
        field10530 = Double.longBitsToDouble(4606047429788771988L);
    }

    private static String oIY4DazicjGjTO8D(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

