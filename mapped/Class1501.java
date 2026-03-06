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

@HACHIMI_CLIENT(mv=100, d1={"\u6d01\u6d06\u6d02\u6d08\u6d07\u6d00\u6d01\u6d03", "\u3d7b\u3d7f\u3d7a\u3d75\u3d75\u3d7a\u3d7a\u3d7c", "\u81a7\u81a7\u81a1\u81a4\u81a0\u81a6\u81a4\u81a2", "\ua205\ua20f\ua20f\ua201\ua200\ua206\ua206\ua202", "\u8222\u822e\u8222\u822e\u8227\u8224\u8227\u8224", "\u1248\u124e\u124b\u1243\u1248\u1243\u124b\u124f", "\u09f5\u09f5\u09f6\u09f8\u09f8\u09f2\u09f9\u09f1", "\uc7e4\uc7e1\uc7ed\uc7ed\uc7e5\uc7ed\uc7e0\uc7e5", "\u20d9\u20da\u20d2\u20d9\u20de\u20df\u20db\u20d8", "\ud558\ud55e\ud558\ud55c\ud55a\ud55f\ud55e\ud559", "\u4baa\u4bad\u4ba8\u4bad\u4ba8\u4bac\u4baf\u4bab", "\u9882\u9887\u9881\u9886\u9880\u9881\u9886\u9885", "\u2840\u2845\u2846\u2846\u2847\u284c\u2844\u2844", "\ua4a1\ua4a5\ua4aa\ua4a4\ua4a2\ua4aa\ua4a0\ua4a7"}, d2={"\u03b2\u03ed\u03e2\u03e7\u03e0\u03e7\u03fa\u03b0\u03b2\u03b0\u03a6\u03a7\u03d8", "\u0254\u0201\u0206\u0201\u021c\u0256\u0254\u0256\u0240\u0241\u023e", "\u063e\u063c\u062d\u061a\u0635\u0638\u062a\u062a\u0665\u0667\u0671\u0670\u0615\u0633\u0638\u062f\u0638\u0676\u0635\u0638\u0637\u063e\u0676\u061a\u0635\u0638\u062a\u062a\u0662", "\u050d\u0504\u0516\u050d\u0526\u050a\u0501\u0500\u0559\u055b\u054d\u054c\u052c", "\u0535\u0521\u0525\u0531\u053c\u0523\u056c\u056e\u0578\u051c\u053a\u0531\u0526\u0531\u057f\u053c\u0531\u053e\u0537\u057f\u051f\u0532\u053a\u0535\u0533\u0524\u056b\u0579\u050a", "\u02c8\u02c7\u02c4\u02c5\u02ce\u0297\u0295\u0283\u0282\u02e7\u02c1\u02ca\u02dd\u02ca\u0284\u02c7\u02ca\u02c5\u02cc\u0284\u02e4\u02c9\u02c1\u02ce\u02c8\u02df\u0290", "\u01df\u01c4\u01f8\u01df\u01d9\u01c2\u01c5\u01cc\u0197\u0195\u0183\u0182\u01e7\u01c1\u01ca\u01dd\u01ca\u0184\u01c7\u01ca\u01c5\u01cc\u0184\u01f8\u01df\u01d9\u01c2\u01c5\u01cc\u0190", "\u02b8\u02b9\u02a2\u02bf\u02b0\u02af\u02ea\u02e8\u02fe\u02ff\u0280", "\u0780\u0781\u079a\u0787\u0788\u0797\u07af\u0782\u0782\u07d2\u07d0\u07c6\u07c7\u07b8", "\u06fd\u06eb\u06e3\u06fe\u06b6\u06b4\u06a2\u06a3\u06dc", "\u057f\u0569\u0561\u057c\u0534\u0536\u0520\u0542\u0521\u055e", "\u022c\u023a\u0232\u022f\u026b\u0267\u0265\u0273\u0211\u0272\u020d", "\u03fa\u03ec\u03e4\u03f9\u03b1\u03b3\u03a5\u03c7\u03c4\u03a4\u03db", "\u013e\u0131\u0136\u0139\u0134\u0131\u0122\u013d\u0164\u0166\u0170\u0171\u010e"})
public final class Class1501 {
    public static float field5663;
    public static float field5664;
    public static double field5665;
    public static double field5666;

    private static String tSDjYpDTB1mVKLUu(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5665 = Double.longBitsToDouble(4605518386248960549L);
        field5666 = Double.longBitsToDouble(4606785750093923098L);
        field5664 = Float.intBitsToFloat(1061499874);
        field5663 = Float.intBitsToFloat(1057061298);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite EoLIxctzNbWnlR(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1501.tSDjYpDTB1mVKLUu(k2, 1833492453));
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
                int a2 = Integer.parseInt(Class1501.tSDjYpDTB1mVKLUu(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1501.tSDjYpDTB1mVKLUu(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 47755 : 47756;
        block7: while (true) {
            switch (n3) {
                case 47756: {
                    n3 = 47754;
                    continue block7;
                }
                case 47755: {
                    throw new Exception("Can't find method in " + Class1501.tSDjYpDTB1mVKLUu(k2, 1833492453) + " " + l2 + " " + m2);
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
}

