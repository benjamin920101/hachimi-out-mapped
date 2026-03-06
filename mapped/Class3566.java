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
@HACHIMI_CLIENT(mv=100, d1={"\ua517\ua51b\ua51a\ua51b\ua515\ua512\ua517\ua51b", "\uaa79\uaa72\uaa79\uaa73\uaa7d\uaa7b\uaa73\uaa79", "\u9f36\u9f35\u9f33\u9f32\u9f34\u9f31\u9f37", "\ud369\ud36b\ud368\ud36d\ud365\ud368\ud36b\ud364", "\ub372\ub379\ub377\ub378\ub379\ub372\ub379\ub373", "\u70f7\u70f3\u70f0\u70fd\u70f4\u70f6\u70f6\u70f5", "\uc3e8\uc3ed\uc3ee\uc3ee\uc3ef\uc3e6\uc3e7\uc3ef", "\u2ef4\u2eff\u2ef6\u2ef7\u2ef0\u2ef4\u2ef5\u2ef5", "\u0892\u0893\u0890\u0895\u0896\u0892\u0891\u089a", "\u5981\u5984\u598c\u5980\u5984\u5985\u598c\u5986", "\uc6dd\uc6dc\uc6d8\uc6dc\uc6d9\uc6da\uc6df", "\uc423\uc426\uc423\uc423\uc425\uc424\uc426\uc423", "\u8903\u8907\u8907\u890f\u8902\u8903\u890e\u890f", "\u9c98\u9c9f\u9c9e\u9c9b\u9c94\u9c98\u9c95\u9c9c", "\u0aff\u0afd\u0afd\u0afd\u0af9\u0afa\u0aff\u0af8"}, d2={"\u0190\u0191\u0196\u21f9\u01cb\u01c9\u01df\u01bb\u019d\u0196\u0181\u0196\u01d8\u019b\u0196\u0199\u0190\u01d8\u01a4\u0183\u0185\u019e\u0199\u0190\u01cc\u01de\u01bb\u019d\u0196\u0181\u0196\u01d8\u019b\u0196\u0199\u0190\u01d8\u01a4\u0183\u0185\u019e\u0199\u0190\u01cc", "\u0426\u0479\u0476\u0473\u0474\u0473\u046e\u0424\u0426\u0424\u0432\u0433\u044c", "\u05f3\u05a6\u05a1\u05a6\u05bb\u05f1\u05f3\u05f1\u05e7\u05e6\u0599", "\u0138\u013a\u012b\u011c\u0133\u013e\u012c\u012c\u0163\u0161\u0177\u0176\u0113\u0135\u013e\u0129\u013e\u0170\u0133\u013e\u0131\u0138\u0170\u011c\u0133\u013e\u012c\u012c\u0164", "\u0779\u0770\u0762\u0779\u0752\u077e\u0775\u0774\u072d\u072f\u0739\u0738\u0758", "\u022b\u023f\u023b\u022f\u0222\u023d\u0272\u0270\u0266\u0202\u0224\u022f\u0238\u022f\u0261\u0222\u022f\u0220\u0229\u0261\u0201\u022c\u0224\u022b\u022d\u023a\u0275\u0267\u0214", "\u03b9\u03b6\u03b5\u03b4\u03bf\u03e6\u03e4\u03f2\u03f3\u0396\u03b0\u03bb\u03ac\u03bb\u03f5\u03b6\u03bb\u03b4\u03bd\u03f5\u0395\u03b8\u03b0\u03bf\u03b9\u03ae\u03e1", "\u0609\u0612\u062e\u0609\u060f\u0614\u0613\u061a\u0641\u0643\u0655\u0654\u0631\u0617\u061c\u060b\u061c\u0652\u0611\u061c\u0613\u061a\u0652\u062e\u0609\u060f\u0614\u0613\u061a\u0646", "\u0321\u0320\u033b\u0326\u0329\u0336\u0373\u0371\u0367\u0366\u0319", "\u01bd\u01bc\u01a7\u01ba\u01b5\u01aa\u0192\u01bf\u01bf\u01ef\u01ed\u01fb\u01fa\u0185", "\u04dc\u04ca\u04c2\u04df\u0497\u0495\u0483\u0482\u04fd", "\u0304\u0312\u031a\u0307\u034f\u034d\u035b\u0339\u035a\u0325", "\u0608\u061e\u0616\u060b\u064f\u0643\u0641\u0657\u0635\u0656\u0629", "\u0154\u0142\u014a\u0157\u011f\u011d\u010b\u0169\u016a\u010a\u0175", "\u031b\u0314\u0313\u031c\u0311\u0314\u0307\u0318\u0341\u0343\u0355\u0354\u032b"})
public final class Class3566 {
    public static double field7923;
    public static float field7924;
    public static float field7925;

    static {
        field7924 = Float.intBitsToFloat(1058450613);
        field7923 = Double.longBitsToDouble(4598240425961243924L);
        field7925 = Float.intBitsToFloat(1060564737);
        aI\u200e = "Hachimi has not loaded any config!";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite YswUPaQfYiyOlz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3566.9JiBnOTa2DKYrPOK(k2, -1197692399));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3566.9JiBnOTa2DKYrPOK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3566.9JiBnOTa2DKYrPOK(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 3475 : 3476;
        block7: while (true) {
            switch (n3) {
                case 3476: {
                    n3 = 3474;
                    continue block7;
                }
                case 3475: {
                    throw new Exception("Can't find method in " + Class3566.9JiBnOTa2DKYrPOK(k2, -1197692399) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 9JiBnOTa2DKYrPOK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

