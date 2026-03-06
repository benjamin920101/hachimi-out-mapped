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

@HACHIMI_CLIENT(mv=100, d1={"\u908e\u9088\u908f\u9080\u908d\u9089\u9080\u9080", "\ub0a2\ub0a0\ub0a3\ub0ac\ub0a7\ub0a2\ub0a2\ub0a7", "\ua209\ua20c\ua208\ua20d\ua204\ua20b\ua20b", "\u272d\u2729\u2723\u272f\u2729\u272d\u272f\u272d", "\ua903\ua902\ua904\ua903\ua901\ua905\ua900\ua903", "\u7b9d\u7b9f\u7b9d\u7b98\u7b93\u7b9a\u7b9e", "\u24a0\u24a6\u24a6\u24a7\u24a1\u24a6\u24a3\u24a3", "\uc612\uc615\uc618\uc619\uc618\uc614\uc615\uc618", "\u2f68\u2f68\u2f6c\u2f6c\u2f67\u2f6b\u2f6d", "\u899b\u899c\u899d\u899f\u899c\u899b\u899c\u899e", "\u2ad4\u2ad1\u2ad0\u2ad4\u2ad2\u2ad7\u2ad3\u2ad0", "\u7055\u705f\u705f\u705f\u7057\u7053\u7054\u7057", "\uc14f\uc14e\uc145\uc14a\uc14f\uc14e\uc14e\uc14e", "\uc726\uc726\uc72a\uc721\uc725\uc72a\uc720\uc724", "\u1492\u1494\u1494\u1497\u1491\u1499\u1490\u1491", "\ubff1\ubffa\ubffb\ubffb\ubff4\ubff2\ubff7\ubffb", "\u0119\u011c\u0114\u011f\u0115\u0119\u011f\u0114", "\u7ea4\u7ea5\u7eaf\u7ea3\u7eaf\u7ea4\u7ea6\u7ea3"}, d2={"\u0752\u0761\u0760\u2739\u070b\u0709\u071f\u077b\u075d\u0756\u0741\u0756\u0718\u075b\u0756\u0759\u0750\u0718\u0764\u0743\u0745\u075e\u0759\u0750\u070c\u071e\u077b\u075d\u0756\u0741\u0756\u0718\u075b\u0756\u0759\u0750\u0718\u0764\u0743\u0745\u075e\u0759\u0750\u070c", "\u0326\u0315\u031b\u234d\u037f\u037d\u036b\u030f\u0329\u0322\u0335\u0322\u036c\u032f\u0322\u032d\u0324\u036c\u0310\u0337\u0331\u032a\u032d\u0324\u0378\u036a\u030f\u0329\u0322\u0335\u0322\u036c\u032f\u0322\u032d\u0324\u036c\u0310\u0337\u0331\u032a\u032d\u0324\u0378", "\u03c5\u03f6\u03f9\u23ae\u039c\u039e\u0388\u03ec\u03ca\u03c1\u03d6\u03c1\u038f\u03cc\u03c1\u03ce\u03c7\u038f\u03f3\u03d4\u03d2\u03c9\u03ce\u03c7\u039b\u0389\u03ec\u03ca\u03c1\u03d6\u03c1\u038f\u03cc\u03c1\u03ce\u03c7\u038f\u03f3\u03d4\u03d2\u03c9\u03ce\u03c7\u039b", "\u04c2\u04f1\u04fd\u24a9\u049b\u0499\u048f\u04eb\u04cd\u04c6\u04d1\u04c6\u0488\u04cb\u04c6\u04c9\u04c0\u0488\u04f4\u04d3\u04d5\u04ce\u04c9\u04c0\u049c\u048e\u04eb\u04cd\u04c6\u04d1\u04c6\u0488\u04cb\u04c6\u04c9\u04c0\u0488\u04f4\u04d3\u04d5\u04ce\u04c9\u04c0\u049c", "\u05a2\u05fd\u05f2\u05f7\u05f0\u05f7\u05ea\u05a0\u05a2\u05a0\u05b6\u05b7\u05c8", "\u052e\u057b\u057c\u057b\u0566\u052c\u052e\u052c\u053a\u053b\u0544", "\u0715\u0717\u0706\u0731\u071e\u0713\u0701\u0701\u074e\u074c\u075a\u075b\u073e\u0718\u0713\u0704\u0713\u075d\u071e\u0713\u071c\u0715\u075d\u0731\u071e\u0713\u0701\u0701\u0749", "\u06c7\u06ce\u06dc\u06c7\u06ec\u06c0\u06cb\u06ca\u0693\u0691\u0687\u0686\u06e6", "\u0456\u0442\u0446\u0452\u045f\u0440\u040f\u040d\u041b\u047f\u0459\u0452\u0445\u0452\u041c\u045f\u0452\u045d\u0454\u041c\u047c\u0451\u0459\u0456\u0450\u0447\u0408\u041a\u0469", "\u070e\u0701\u0702\u0703\u0708\u0751\u0753\u0745\u0744\u0721\u0707\u070c\u071b\u070c\u0742\u0701\u070c\u0703\u070a\u0742\u0722\u070f\u0707\u0708\u070e\u0719\u0756", "\u0726\u073d\u0701\u0726\u0720\u073b\u073c\u0735\u076e\u076c\u077a\u077b\u071e\u0738\u0733\u0724\u0733\u077d\u073e\u0733\u073c\u0735\u077d\u0701\u0726\u0720\u073b\u073c\u0735\u0769", "\u07db\u07da\u07c1\u07dc\u07d3\u07cc\u0789\u078b\u079d\u079c\u07e3", "\u00fb\u00fa\u00e1\u00fc\u00f3\u00ec\u00d4\u00f9\u00f9\u00a9\u00ab\u00bd\u00bc\u00c3", "\u017d\u016b\u0163\u017e\u0136\u0134\u0122\u0123\u015c", "\u0635\u0623\u062b\u0636\u067e\u067c\u066a\u0608\u066b\u0614", "\u0247\u0251\u0259\u0244\u0200\u020c\u020e\u0218\u027a\u0219\u0266", "\u072c\u073a\u0732\u072f\u0767\u0765\u0773\u0711\u0712\u0772\u070d", "\u053f\u0530\u0537\u0538\u0535\u0530\u0523\u053c\u0565\u0567\u0571\u0570\u050f"})
public final class Class1364 {
    public static double field5256;
    public static float field5257;
    public static long field5258 = -5268153222291437642L;
    public static int field5259 = 216491069;
    public static float field5260;
    public static double field5261;
    public static float field5262 = 0.9838649f;
    public static double field5263;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite VIXOa5Tn8jB9nI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1364.lkLsJjdk3ry9U9SW(k2, 262157098));
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
                int a2 = Integer.parseInt(Class1364.lkLsJjdk3ry9U9SW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1364.lkLsJjdk3ry9U9SW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 28696 : 28697;
        block7: while (true) {
            switch (n3) {
                case 28697: {
                    n3 = 28695;
                    continue block7;
                }
                case 28696: {
                    throw new Exception("Can't find method in " + Class1364.lkLsJjdk3ry9U9SW(k2, 262157098) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        e\u200e = "";
        field5256 = Double.longBitsToDouble(0x4070000000000000L);
        field5257 = Float.intBitsToFloat(1060634200);
        bd\u200e = "Number of ticks to shift ahead";
        field5260 = Float.intBitsToFloat(1064143389);
        field5261 = Double.longBitsToDouble(4586572305470074368L);
        bM\u200e = "GRAY";
        bS\u200e = "XP";
        field5263 = Double.longBitsToDouble(4602362087194630916L);
    }

    private static String lkLsJjdk3ry9U9SW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

