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
@HACHIMI_CLIENT(mv=100, d1={"\u06bf\u06b9\u06bc\u06b8\u06b8\u06bc\u06b1\u06bc", "\u2b3b\u2b3c\u2b3f\u2b3b\u2b3a\u2b3f\u2b3c\u2b3f", "\ub064\ub062\ub064\ub067\ub062\ub066\ub062", "\u7186\u7189\u7189\u7187\u7182\u7187\u7183", "\u1c95\u1c96\u1c97\u1c94\u1c97\u1c9e\u1c92\u1c91", "\uc908\uc901\uc901\uc90e\uc908\uc90c\uc90b\uc90c", "\u2cd0\u2cde\u2cd4\u2cd6\u2cd2\u2cd4\u2cd3\u2cdf", "\u0949\u0948\u094e\u094e\u094d\u094d\u0949", "\ua52d\ua528\ua524\ua52b\ua52d\ua525\ua52a\ua52d", "\u6905\u6902\u6900\u6902\u6902\u6903\u690b\u6907", "\u0c29\u0c2e\u0c2b\u0c2f\u0c26\u0c2b\u0c27\u0c2e", "\u4149\u414e\u4144\u414b\u4144\u4145\u414e\u414c", "\u8dce\u8dc8\u8dcc\u8dce\u8dcd\u8dcc\u8dcd\u8dca", "\u7812\u7817\u7811\u7810\u7818\u7811\u7817", "\u62ed\u62ef\u62e7\u62ea\u62e9\u62e6\u62e8\u62ec", "\uac2b\uac2e\uac2f\uac2e\uac21\uac2c\uac29\uac2c", "\uc3f1\uc3f8\uc3fc\uc3fb\uc3fa\uc3fa\uc3ff"}, d2={"\u0342\u035f\u0364\u232b\u0319\u031b\u030d\u0369\u034f\u0344\u0353\u0344\u030a\u0349\u0344\u034b\u0342\u030a\u0376\u0351\u0357\u034c\u034b\u0342\u031e\u030c\u0369\u034f\u0344\u0353\u0344\u030a\u0349\u0344\u034b\u0342\u030a\u0376\u0351\u0357\u034c\u034b\u0342\u031e", "\u01c1\u01dc\u01e4\u21a8\u019a\u0198\u018e\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d\u018f\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d", "\u0774\u0769\u0750\u271d\u072f\u072d\u073b\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728\u073a\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728", "\u07b0\u07ef\u07e0\u07e5\u07e2\u07e5\u07f8\u07b2\u07b0\u07b2\u07a4\u07a5\u07da", "\u0795\u07c0\u07c7\u07c0\u07dd\u0797\u0795\u0797\u0781\u0780\u07ff", "\u06ac\u06ae\u06bf\u0688\u06a7\u06aa\u06b8\u06b8\u06f7\u06f5\u06e3\u06e2\u0687\u06a1\u06aa\u06bd\u06aa\u06e4\u06a7\u06aa\u06a5\u06ac\u06e4\u0688\u06a7\u06aa\u06b8\u06b8\u06f0", "\u01f8\u01f1\u01e3\u01f8\u01d3\u01ff\u01f4\u01f5\u01ac\u01ae\u01b8\u01b9\u01d9", "\u0084\u0090\u0094\u0080\u008d\u0092\u00dd\u00df\u00c9\u00ad\u008b\u0080\u0097\u0080\u00ce\u008d\u0080\u008f\u0086\u00ce\u00ae\u0083\u008b\u0084\u0082\u0095\u00da\u00c8\u00bb", "\u0666\u0669\u066a\u066b\u0660\u0639\u063b\u062d\u062c\u0649\u066f\u0664\u0673\u0664\u062a\u0669\u0664\u066b\u0662\u062a\u064a\u0667\u066f\u0660\u0666\u0671\u063e", "\u0236\u022d\u0211\u0236\u0230\u022b\u022c\u0225\u027e\u027c\u026a\u026b\u020e\u0228\u0223\u0234\u0223\u026d\u022e\u0223\u022c\u0225\u026d\u0211\u0236\u0230\u022b\u022c\u0225\u0279", "\u0124\u0125\u013e\u0123\u012c\u0133\u0176\u0174\u0162\u0163\u011c", "\u0163\u0162\u0179\u0164\u016b\u0174\u014c\u0161\u0161\u0131\u0133\u0125\u0124\u015b", "\u053a\u052c\u0524\u0539\u0571\u0573\u0565\u0564\u051b", "\u058a\u059c\u0594\u0589\u05c1\u05c3\u05d5\u05b7\u05d4\u05ab", "\u0487\u0491\u0499\u0484\u04c0\u04cc\u04ce\u04d8\u04ba\u04d9\u04a6", "\u0157\u0141\u0149\u0154\u011c\u011e\u0108\u016a\u0169\u0109\u0176", "\u04c0\u04cf\u04c8\u04c7\u04ca\u04cf\u04dc\u04c3\u049a\u0498\u048e\u048f\u04f0"})
public final class Class1280 {
    public static int field4985 = 1946162360;
    public static double field4986;
    public static float field4987 = 0.75954753f;
    public static float field4988;
    public static double field4989;
    public static float field4990 = 0.9483022f;

    static {
        s\u200e = "EntityStep";
        field4989 = Double.longBitsToDouble(4605897200706693226L);
        field4988 = Float.intBitsToFloat(1032909240);
        field4986 = Double.longBitsToDouble(4606716574175852827L);
        bf\u200e = "color";
        bv\u200e = "Places blocks at the players feet";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wrF7wYeeIx7LoQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1280.24lvkCEpqr47Li9x(k2, 1835300291));
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
                int a2 = Integer.parseInt(Class1280.24lvkCEpqr47Li9x(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1280.24lvkCEpqr47Li9x(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1280.24lvkCEpqr47Li9x(k2, 1835300291) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 24lvkCEpqr47Li9x(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

