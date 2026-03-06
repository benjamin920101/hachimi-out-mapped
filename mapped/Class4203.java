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
@HACHIMI_CLIENT(mv=100, d1={"\u8109\u8105\u8108\u810b\u810c\u8105\u810b\u810c", "\u74a3\u74a7\u74a3\u74aa\u74a5\u74a4\u74a5", "\u91d2\u91dd\u91d1\u91d0\u91d4\u91d7\u91d2\u91d3", "\u1c4d\u1c49\u1c4c\u1c43\u1c4b\u1c48\u1c4d\u1c42", "\u736d\u736d\u736d\u736b\u736b\u736d\u7366\u7369", "\u5411\u5417\u541a\u5413\u5417\u5410\u541b\u5417", "\u7f64\u7f61\u7f64\u7f61\u7f6b\u7f66\u7f65\u7f62", "\u3076\u3076\u3074\u3075\u3076\u3077\u3072", "\u335a\u3357\u3356\u335e\u335a\u335f\u335b\u335f", "\u9e91\u9e96\u9e9f\u9e91\u9e97\u9e90\u9e9f\u9e96", "\u83c7\u83c1\u83c0\u83c2\u83ca\u83c1\u83c7\u83ca", "\u7260\u726a\u7263\u726a\u726b\u7265\u7266\u726a", "\uadcf\uadcd\uadc8\uadcb\uadcf\uadc9\uadc3", "\ue37d\ue37c\ue37d\ue37d\ue379\ue37f\ue378\ue370", "\ucd56\ucd53\ucd50\ucd50\ucd54\ucd53\ucd52\ucd55", "hncnhokn"}, d2={"\u05f6\u05da\u05db\u259d\u05af\u05ad\u05bb\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8\u05ba\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8", "\u0521\u050d\u050d\u254a\u0578\u057a\u056c\u0508\u052e\u0525\u0532\u0525\u056b\u0528\u0525\u052a\u0523\u056b\u0517\u0530\u0536\u052d\u052a\u0523\u057f\u056d\u0508\u052e\u0525\u0532\u0525\u056b\u0528\u0525\u052a\u0523\u056b\u0517\u0530\u0536\u052d\u052a\u0523\u057f", "\u0443\u041c\u0413\u0416\u0411\u0416\u040b\u0441\u0443\u0441\u0457\u0456\u0429", "\u076c\u0739\u073e\u0739\u0724\u076e\u076c\u076e\u0778\u0779\u0706", "\u01bb\u01b9\u01a8\u019f\u01b0\u01bd\u01af\u01af\u01e0\u01e2\u01f4\u01f5\u0190\u01b6\u01bd\u01aa\u01bd\u01f3\u01b0\u01bd\u01b2\u01bb\u01f3\u019f\u01b0\u01bd\u01af\u01af\u01e7", "\u06ba\u06b3\u06a1\u06ba\u0691\u06bd\u06b6\u06b7\u06ee\u06ec\u06fa\u06fb\u069b", "\u04aa\u04be\u04ba\u04ae\u04a3\u04bc\u04f3\u04f1\u04e7\u0483\u04a5\u04ae\u04b9\u04ae\u04e0\u04a3\u04ae\u04a1\u04a8\u04e0\u0480\u04ad\u04a5\u04aa\u04ac\u04bb\u04f4\u04e6\u0495", "jefgl57! Ech\u007fh&ehgn&Fkclj}2", "\u0638\u0623\u061f\u0638\u063e\u0625\u0622\u062b\u0670\u0672\u0664\u0665\u0600\u0626\u062d\u063a\u062d\u0663\u0620\u062d\u0622\u062b\u0663\u061f\u0638\u063e\u0625\u0622\u062b\u0677", "\u0185\u0184\u019f\u0182\u018d\u0192\u01d7\u01d5\u01c3\u01c2\u01bd", "\u033b\u033a\u0321\u033c\u0333\u032c\u0314\u0339\u0339\u0369\u036b\u037d\u037c\u0303", "\u02c7\u02d1\u02d9\u02c4\u028c\u028e\u0298\u0299\u02e6", "\u0359\u034f\u0347\u035a\u0312\u0310\u0306\u0364\u0307\u0378", "\u02a1\u02b7\u02bf\u02a2\u02e6\u02ea\u02e8\u02fe\u029c\u02ff\u0280", "\u0744\u0752\u075a\u0747\u070f\u070d\u071b\u0779\u077a\u071a\u0765", "\u02f2\u02fd\u02fa\u02f5\u02f8\u02fd\u02ee\u02f1\u02a8\u02aa\u02bc\u02bd\u02c2"})
public final class Class4203 {
    public static float field9823;
    public static float field9824;

    private static String IyY5vppJMqwAAkrV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 7TeykGjEk18lOa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4203.IyY5vppJMqwAAkrV(k2, -1757203488));
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
                int a2 = Integer.parseInt(Class4203.IyY5vppJMqwAAkrV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4203.IyY5vppJMqwAAkrV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4203.IyY5vppJMqwAAkrV(k2, -1757203488) + " " + l2 + " " + m2);
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
        field9824 = Float.intBitsToFloat(1059276497);
        aG\u200e = "Fixes movement on Grim when applying mouse sensitivity";
        bg\u200e = "RotateHold";
        field9823 = Float.intBitsToFloat(1021609120);
    }
}

