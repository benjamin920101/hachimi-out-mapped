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

@HACHIMI_CLIENT(mv=100, d1={"\u486b\u486a\u486b\u486f\u486f\u4866\u4869\u486e", "\u1c37\u1c3c\u1c34\u1c36\u1c35\u1c30\u1c31\u1c33", "\u0811\u0813\u0813\u0814\u0811\u0814\u081a\u0811", "\ucf77\ucf76\ucf73\ucf72\ucf72\ucf72\ucf74\ucf72", "\ubf0b\ubf08\ubf09\ubf0d\ubf0d\ubf08\ubf0f\ubf09", "\u1007\u1002\u1002\u1006\u100b\u1003\u1000\u1007", "\ub23b\ub238\ub23a\ub234\ub23b\ub238\ub23d\ub234", "\u14b5\u14b8\u14b8\u14b0\u14b5\u14b1\u14b0\u14b4", "\ub483\ub483\ub489\ub484\ub487\ub484\ub489\ub489", "\u0df3\u0df3\u0df1\u0df1\u0df7\u0df2\u0df1\u0df2", "\u6b11\u6b11\u6b10\u6b14\u6b16\u6b15\u6b10\u6b16", "\u66a9\u66a5\u66ad\u66aa\u66aa\u66af\u66aa\u66a5", "\ud16c\ud16b\ud165\ud169\ud165\ud16b\ud16a\ud16c", "\u3a24\u3a24\u3a26\u3a21\u3a21\u3a27\u3a27\u3a21", "\ua80e\ua809\ua803\ua80a\ua80b\ua80e\ua80d\ua802", "\u33be\u33b1\u33bc\u33bd\u33be\u33be\u33bd\u33bc", "\u1907\u1903\u1905\u1901\u1907\u1900\u1901\u1906"}, d2={"\u034e\u037d\u0356\u2332\u0300\u0302\u0314\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u036f\u0348\u034e\u0355\u0352\u035b\u0307\u0315\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u036f\u0348\u034e\u0355\u0352\u035b\u0307", "\u07ce\u07fd\u07d7\u27b2\u0780\u0782\u0794\u07f0\u07d6\u07dd\u07ca\u07dd\u0793\u07d0\u07dd\u07d2\u07db\u0793\u07ef\u07c8\u07ce\u07d5\u07d2\u07db\u0787\u0795\u07f0\u07d6\u07dd\u07ca\u07dd\u0793\u07d0\u07dd\u07d2\u07db\u0793\u07ef\u07c8\u07ce\u07d5\u07d2\u07db\u0787", "\u05d5\u05e6\u05cb\u25a9\u059b\u0599\u058f\u05eb\u05cd\u05c6\u05d1\u05c6\u0588\u05cb\u05c6\u05c9\u05c0\u0588\u05f4\u05d3\u05d5\u05ce\u05c9\u05c0\u059c\u058e\u05eb\u05cd\u05c6\u05d1\u05c6\u0588\u05cb\u05c6\u05c9\u05c0\u0588\u05f4\u05d3\u05d5\u05ce\u05c9\u05c0\u059c", "\u00da\u0085\u008a\u008f\u0088\u008f\u0092\u00d8\u00da\u00d8\u00ce\u00cf\u00b0", "\u05be\u05eb\u05ec\u05eb\u05f6\u05bc\u05be\u05bc\u05aa\u05ab\u05d4", "\u03ef\u03ed\u03fc\u03cb\u03e4\u03e9\u03fb\u03fb\u03b4\u03b6\u03a0\u03a1\u03c4\u03e2\u03e9\u03fe\u03e9\u03a7\u03e4\u03e9\u03e6\u03ef\u03a7\u03cb\u03e4\u03e9\u03fb\u03fb\u03b3", "\u0665\u066c\u067e\u0665\u064e\u0662\u0669\u0668\u0631\u0633\u0625\u0624\u0644", "\u03f0\u03e4\u03e0\u03f4\u03f9\u03e6\u03a9\u03ab\u03bd\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03da\u03f7\u03ff\u03f0\u03f6\u03e1\u03ae\u03bc\u03cf", "\u064e\u0641\u0642\u0643\u0648\u0611\u0613\u0605\u0604\u0661\u0647\u064c\u065b\u064c\u0602\u0641\u064c\u0643\u064a\u0602\u0662\u064f\u0647\u0648\u064e\u0659\u0616", "\u044b\u0450\u046c\u044b\u044d\u0456\u0451\u0458\u0403\u0401\u0417\u0416\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404", "\u04f7\u04f6\u04ed\u04f0\u04ff\u04e0\u04a5\u04a7\u04b1\u04b0\u04cf", "\u00e4\u00e5\u00fe\u00e3\u00ec\u00f3\u00cb\u00e6\u00e6\u00b6\u00b4\u00a2\u00a3\u00dc", "\u060c\u061a\u0612\u060f\u0647\u0645\u0653\u0652\u062d", "\u046c\u047a\u0472\u046f\u0427\u0425\u0433\u0451\u0432\u044d", "\u0253\u0245\u024d\u0250\u0214\u0218\u021a\u020c\u026e\u020d\u0272", "\u00f3\u00e5\u00ed\u00f0\u00b8\u00ba\u00ac\u00ce\u00cd\u00ad\u00d2", "\u072b\u0724\u0723\u072c\u0721\u0724\u0737\u0728\u0771\u0773\u0765\u0764\u071b"})
public final class Class3422 {
    public static float field7454;
    public static double field7455;

    static {
        q\u200e = "nausea";
        field7455 = Double.longBitsToDouble(4600746397025287118L);
        ab\u200e = "NoFail";
        ah\u200e = "This server is running GrimAC";
        field7454 = Float.intBitsToFloat(1062970415);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Iz9w3Ty2anIvGD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3422.evFSqGAPDYVBSCPW(k2, 1883372234));
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
                int a2 = Integer.parseInt(Class3422.evFSqGAPDYVBSCPW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3422.evFSqGAPDYVBSCPW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3422.evFSqGAPDYVBSCPW(k2, 1883372234) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String evFSqGAPDYVBSCPW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

