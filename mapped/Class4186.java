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

@HACHIMI_CLIENT(mv=100, d1={"\ub280\ub281\ub280\ub282\ub284\ub28f\ub282\ub283", "\ue874\ue87e\ue877\ue871\ue87e\ue875\ue87e\ue87f", "\u030d\u0306\u030d\u030b\u030c\u030c\u030e\u0307", "\u953d\u9534\u9537\u9535\u9536\u9531\u9531", "\u5969\u5965\u5965\u596d\u596d\u596d\u596b\u596d", "\u5a95\u5a92\u5a91\u5a97\u5a94\u5a94\u5a9a\u5a9a", "\u6c2c\u6c2f\u6c28\u6c2e\u6c29\u6c2b\u6c29\u6c2a", "\u1c50\u1c59\u1c55\u1c50\u1c51\u1c52\u1c56\u1c59", "\ua991\ua993\ua995\ua99b\ua990\ua995\ua996", "\ud8b6\ud8b7\ud8bb\ud8b7\ud8b4\ud8bb\ud8b5\ud8b4", "\ubc42\ubc41\ubc46\ubc45\ubc4e\ubc41\ubc47\ubc4f", "\u40ce\u40cd\u40c8\u40c0\u40cb\u40cc\u40cd", "\u7dd9\u7ddc\u7ddd\u7ddb\u7ddc\u7dda\u7dd9\u7ddd", "\u38eb\u38e8\u38ea\u38e0\u38ec\u38ec\u38e8\u38ef", "\u42ef\u42ee\u42ec\u42e8\u42ee\u42e7\u42ec\u42ec", "\u5cbf\u5cba\u5cb7\u5cbf\u5cbc\u5cb7\u5cba\u5cba"}, d2={"\u0250\u0267\u0249\u222e\u021c\u021e\u0208\u026c\u024a\u0241\u0256\u0241\u020f\u024c\u0241\u024e\u0247\u020f\u0273\u0254\u0252\u0249\u024e\u0247\u021b\u0209\u026c\u024a\u0241\u0256\u0241\u020f\u024c\u0241\u024e\u0247\u020f\u0273\u0254\u0252\u0249\u024e\u0247\u021b", "\u017e\u0149\u0164\u2100\u0132\u0130\u0126\u0142\u0164\u016f\u0178\u016f\u0121\u0162\u016f\u0160\u0169\u0121\u015d\u017a\u017c\u0167\u0160\u0169\u0135\u0127\u0142\u0164\u016f\u0178\u016f\u0121\u0162\u016f\u0160\u0169\u0121\u015d\u017a\u017c\u0167\u0160\u0169\u0135", "\u0548\u0517\u0518\u051d\u051a\u051d\u0500\u054a\u0548\u054a\u055c\u055d\u0522", "\u02ba\u02ef\u02e8\u02ef\u02f2\u02b8\u02ba\u02b8\u02ae\u02af\u02d0", "\u06c6\u06c4\u06d5\u06e2\u06cd\u06c0\u06d2\u06d2\u069d\u069f\u0689\u0688\u06ed\u06cb\u06c0\u06d7\u06c0\u068e\u06cd\u06c0\u06cf\u06c6\u068e\u06e2\u06cd\u06c0\u06d2\u06d2\u069a", "\u00bb\u00b2\u00a0\u00bb\u0090\u00bc\u00b7\u00b6\u00ef\u00ed\u00fb\u00fa\u009a", "\u05b9\u05ad\u05a9\u05bd\u05b0\u05af\u05e0\u05e2\u05f4\u0590\u05b6\u05bd\u05aa\u05bd\u05f3\u05b0\u05bd\u05b2\u05bb\u05f3\u0593\u05be\u05b6\u05b9\u05bf\u05a8\u05e7\u05f5\u0586", "\u037d\u0372\u0371\u0370\u037b\u0322\u0320\u0336\u0337\u0352\u0374\u037f\u0368\u037f\u0331\u0372\u037f\u0370\u0379\u0331\u0351\u037c\u0374\u037b\u037d\u036a\u0325", "\u0156\u014d\u0171\u0156\u0150\u014b\u014c\u0145\u011e\u011c\u010a\u010b\u016e\u0148\u0143\u0154\u0143\u010d\u014e\u0143\u014c\u0145\u010d\u0171\u0156\u0150\u014b\u014c\u0145\u0119", "\u07c7\u07c6\u07dd\u07c0\u07cf\u07d0\u0795\u0797\u0781\u0780\u07ff", "\u079f\u079e\u0785\u0798\u0797\u0788\u07b0\u079d\u079d\u07cd\u07cf\u07d9\u07d8\u07a7", "\u01a1\u01b7\u01bf\u01a2\u01ea\u01e8\u01fe\u01ff\u0180", "\u0666\u0670\u0678\u0665\u062d\u062f\u0639\u065b\u0638\u0647", "\u0596\u0580\u0588\u0595\u05d1\u05dd\u05df\u05c9\u05ab\u05c8\u05b7", "\u022d\u023b\u0233\u022e\u0266\u0264\u0272\u0210\u0213\u0273\u020c", "\u0728\u0727\u0720\u072f\u0722\u0727\u0734\u072b\u0772\u0770\u0766\u0767\u0718"})
public final class Class4186 {
    public static float field9776 = Float.intBitsToFloat(1056607676);
    public static float field9777 = 0.11193323f;
    public static double field9778 = Double.longBitsToDouble(4605664922767353491L);

    /*
     * WARNING - void declaration
     */
    private static CallSite DSLNPyWAL0b6iF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4186.qLx9q5eSfCLLOWlN(k2, -1114447995));
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
                int a2 = Integer.parseInt(Class4186.qLx9q5eSfCLLOWlN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4186.qLx9q5eSfCLLOWlN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4186.qLx9q5eSfCLLOWlN(k2, -1114447995) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String qLx9q5eSfCLLOWlN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bu\u200e = "BPT";
        cr\u200e = "Opens the client configurations folder";
    }
}

