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

@HACHIMI_CLIENT(mv=100, d1={"\uacaf\uaca3\uacae\uaca2\uaca8\uacaa\uacad\uaca8", "\u00e0\u00e7\u00e5\u00e2\u00e3\u00ee\u00e3", "\ue2e1\ue2e6\ue2e6\ue2e7\ue2eb\ue2e7\ue2e5\ue2e0", "\u6960\u6966\u696d\u6965\u6963\u696c\u6966\u6963", "\ub4e6\ub4ec\ub4e1\ub4e2\ub4e6\ub4e5\ub4e7\ub4e2", "\u80fc\u80fc\u80f1\u80f0\u80fe\u80fd\u80fa\u80fc", "\u8e4c\u8e41\u8e4b\u8e4b\u8e4a\u8e4f\u8e4f\u8e4b", "\uadb3\uadb6\uadb0\uadb6\uadbe\uadb5\uadb7\uadb3", "\u8626\u8626\u8625\u8626\u862d\u862d\u8623\u8625", "\u9a39\u9a39\u9a3e\u9a3b\u9a38\u9a38\u9a3f\u9a36", "\ubdc3\ubdc1\ubdc7\ubdc0\ubdc5\ubdc1\ubdcf\ubdc5", "\ub8e5\ub8e3\ub8eb\ub8e6\ub8e3\ub8e7\ub8e6", "\u1a05\u1a03\u1a05\u1a01\u1a0d\u1a05\u1a06\u1a00", "\u6c2d\u6c2d\u6c20\u6c21\u6c2a\u6c29\u6c2b\u6c20", "\u359a\u3597\u359f\u359a\u3596\u359c\u3598\u3599", "\u6b94\u6b9f\u6b94\u6b97\u6b96\u6b92\u6b9e\u6b9e", "\u3379\u337f\u3378\u337e\u337b\u3375\u337e\u337c", "\u3590\u3595\u3596\u359b\u3592\u3594\u3591\u359a"}, d2={"\u0440\u0465\u046a\u2423\u0411\u0413\u0405\u0461\u0447\u044c\u045b\u044c\u0402\u0441\u044c\u0443\u044a\u0402\u047e\u0459\u045f\u0444\u0443\u044a\u0416\u0404\u0461\u0447\u044c\u045b\u044c\u0402\u0441\u044c\u0443\u044a\u0402\u047e\u0459\u045f\u0444\u0443\u044a\u0416", "\u044d\u0468\u0468\u242e\u041c\u041e\u0408\u046c\u044a\u0441\u0456\u0441\u040f\u044c\u0441\u044e\u0447\u040f\u0473\u0454\u0452\u0449\u044e\u0447\u041b\u0409\u046c\u044a\u0441\u0456\u0441\u040f\u044c\u0441\u044e\u0447\u040f\u0473\u0454\u0452\u0449\u044e\u0447\u041b", "\u01b3\u0196\u0197\u21d0\u01e2\u01e0\u01f6\u0192\u01b4\u01bf\u01a8\u01bf\u01f1\u01b2\u01bf\u01b0\u01b9\u01f1\u018d\u01aa\u01ac\u01b7\u01b0\u01b9\u01e5\u01f7\u0192\u01b4\u01bf\u01a8\u01bf\u01f1\u01b2\u01bf\u01b0\u01b9\u01f1\u018d\u01aa\u01ac\u01b7\u01b0\u01b9\u01e5", "\u062b\u060e\u060c\u2648\u067a\u0678\u066e\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d\u066f\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d", "\u047f\u0420\u042f\u042a\u042d\u042a\u0437\u047d\u047f\u047d\u046b\u046a\u0415", "\u0127\u0172\u0175\u0172\u016f\u0125\u0127\u0125\u0133\u0132\u014d", "\u0172\u0170\u0161\u0156\u0179\u0174\u0166\u0166\u0129\u012b\u013d\u013c\u0159\u017f\u0174\u0163\u0174\u013a\u0179\u0174\u017b\u0172\u013a\u0156\u0179\u0174\u0166\u0166\u012e", "\u00fe\u00f7\u00e5\u00fe\u00d5\u00f9\u00f2\u00f3\u00aa\u00a8\u00be\u00bf\u00df", "\u02a2\u02b6\u02b2\u02a6\u02ab\u02b4\u02fb\u02f9\u02ef\u028b\u02ad\u02a6\u02b1\u02a6\u02e8\u02ab\u02a6\u02a9\u02a0\u02e8\u0288\u02a5\u02ad\u02a2\u02a4\u02b3\u02fc\u02ee\u029d", "\u0701\u070e\u070d\u070c\u0707\u075e\u075c\u074a\u074b\u072e\u0708\u0703\u0714\u0703\u074d\u070e\u0703\u070c\u0705\u074d\u072d\u0700\u0708\u0707\u0701\u0716\u0759", "\u05fa\u05e1\u05dd\u05fa\u05fc\u05e7\u05e0\u05e9\u05b2\u05b0\u05a6\u05a7\u05c2\u05e4\u05ef\u05f8\u05ef\u05a1\u05e2\u05ef\u05e0\u05e9\u05a1\u05dd\u05fa\u05fc\u05e7\u05e0\u05e9\u05b5", "\u072a\u072b\u0730\u072d\u0722\u073d\u0778\u077a\u076c\u076d\u0712", "\u071b\u071a\u0701\u071c\u0713\u070c\u0734\u0719\u0719\u0749\u074b\u075d\u075c\u0723", "\u00b1\u00a7\u00af\u00b2\u00fa\u00f8\u00ee\u00ef\u0090", "\u05b6\u05a0\u05a8\u05b5\u05fd\u05ff\u05e9\u058b\u05e8\u0597", "\u04bf\u04a9\u04a1\u04bc\u04f8\u04f4\u04f6\u04e0\u0482\u04e1\u049e", "\u06af\u06b9\u06b1\u06ac\u06e4\u06e6\u06f0\u0692\u0691\u06f1\u068e", "\u05c2\u05cd\u05ca\u05c5\u05c8\u05cd\u05de\u05c1\u0598\u059a\u058c\u058d\u05f2"})
public final class Class3374 {
    public static float field7327;
    public static float field7328;
    public static float field7329;
    public static float field7330;
    public static double field7331;
    public static double field7332;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite t22Yahw7aSVKlm(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        Class<?> o2 = Class.forName(Class3374.HFQefWWjoHCogCrt(k2, 2027160691));
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
                int a2 = Integer.parseInt(Class3374.HFQefWWjoHCogCrt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3374.HFQefWWjoHCogCrt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3374.HFQefWWjoHCogCrt(k2, 2027160691) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 42442 : 42443;
        while (true) {
            MethodHandle v2;
            int n4;
            if ((n4 = n3) == 42442) {
                MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            if (n4 != 42443) {
                v2 = h2.findStatic(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            n3 = 42441;
        }
    }

    private static String HFQefWWjoHCogCrt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7330 = Float.intBitsToFloat(1048576000);
        field7329 = Float.intBitsToFloat(1032494776);
        ae\u200e = "The delay between reconnects to a server";
        af\u200e = "Peek";
        ai\u200e = "Ping";
        aj\u200e = "Mark points for your friends";
        field7327 = Float.intBitsToFloat(1032712544);
        field7331 = Double.longBitsToDouble(4604098456751636342L);
        field7332 = Double.longBitsToDouble(4600582933978061231L);
        field7328 = Float.intBitsToFloat(1059644674);
    }
}

