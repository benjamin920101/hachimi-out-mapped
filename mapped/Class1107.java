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

@HACHIMI_CLIENT(mv=100, d1={"\u8750\u875b\u8754\u875b\u8756\u8752\u8756\u8756", "\u9783\u9780\u9782\u978d\u978c\u9782\u9783\u9780", "\u4a03\u4a0a\u4a06\u4a00\u4a00\u4a03\u4a02\u4a05", "\u1e02\u1e03\u1e08\u1e03\u1e00\u1e05\u1e02\u1e08", "\u49e3\u49e7\u49e0\u49e2\u49e7\u49eb\u49e1\u49e1", "\ucc4e\ucc4b\ucc4e\ucc4d\ucc4b\ucc40\ucc4e", "\u343f\u343f\u343a\u3439\u3439\u343b\u343f\u343b", "\u6468\u6469\u646c\u646b\u646e\u646d\u646d\u646b", "\u1a92\u1a9b\u1a92\u1a94\u1a92\u1a94\u1a93\u1a97", "\u77e7\u77e1\u77e4\u77e1\u77e4\u77e5\u77ed\u77e6", "\u9300\u9309\u9304\u9304\u9308\u9308\u9301\u9309", "\u43f2\u43f2\u43f9\u43f4\u43f6\u43f7\u43f8\u43f9", "\u3b86\u3b87\u3b81\u3b81\u3b8a\u3b83\u3b87\u3b8b", "\u9daa\u9dab\u9daf\u9daf\u9da5\u9dab\u9da9\u9da4"}, d2={"N\u0011\u001e\u001b\u001c\u001b\u0006LNLZ[$", "u ' =wuwa`\u001f", "\u0483\u0481\u0490\u04a7\u0488\u0485\u0497\u0497\u04d8\u04da\u04cc\u04cd\u04a8\u048e\u0485\u0492\u0485\u04cb\u0488\u0485\u048a\u0483\u04cb\u04a7\u0488\u0485\u0497\u0497\u04df", "\u0279\u0270\u0262\u0279\u0252\u027e\u0275\u0274\u022d\u022f\u0239\u0238\u0258", "\u069a\u068e\u068a\u069e\u0693\u068c\u06c3\u06c1\u06d7\u06b3\u0695\u069e\u0689\u069e\u06d0\u0693\u069e\u0691\u0698\u06d0\u06b0\u069d\u0695\u069a\u069c\u068b\u06c4\u06d6\u06a5", "[TWV]\u0004\u0006\u0010\u0011tRYNY\u0017TYV_\u0017wZR][L\u0003", "\u0132\u0129\u0115\u0132\u0134\u012f\u0128\u0121\u017a\u0178\u016e\u016f\u010a\u012c\u0127\u0130\u0127\u0169\u012a\u0127\u0128\u0121\u0169\u0115\u0132\u0134\u012f\u0128\u0121\u017d", "\u069d\u069c\u0687\u069a\u0695\u068a\u06cf\u06cd\u06db\u06da\u06a5", "\u0564\u0565\u057e\u0563\u056c\u0573\u054b\u0566\u0566\u0536\u0534\u0522\u0523\u055c", "\u0650\u0646\u064e\u0653\u061b\u0619\u060f\u060e\u0671", "\u0592\u0584\u058c\u0591\u05d9\u05db\u05cd\u05af\u05cc\u05b3", "\u07d5\u07c3\u07cb\u07d6\u0792\u079e\u079c\u078a\u07e8\u078b\u07f4", "\u034c\u035a\u0352\u034f\u0307\u0305\u0313\u0371\u0372\u0312\u036d", "\u06a0\u06af\u06a8\u06a7\u06aa\u06af\u06bc\u06a3\u06fa\u06f8\u06ee\u06ef\u0690"})
public final class Class1107 {
    public static float field4471;
    public static float field4472;
    public static double field4473;
    public static float field4474;
    public static float field4475;

    /*
     * WARNING - void declaration
     */
    private static CallSite ldk5teBN31eCp8(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1107.NJorFUVyiijswez9(k2, -1358067531));
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
                int a2 = Integer.parseInt(Class1107.NJorFUVyiijswez9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1107.NJorFUVyiijswez9(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1107.NJorFUVyiijswez9(k2, -1358067531) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NJorFUVyiijswez9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4472 = Float.intBitsToFloat(1054724480);
        field4473 = Double.longBitsToDouble(4605359314524794158L);
        field4474 = Float.intBitsToFloat(1007410944);
        field4475 = Float.intBitsToFloat(1061140729);
        field4471 = Float.intBitsToFloat(1063539344);
    }
}

