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

@HACHIMI_CLIENT(mv=100, d1={"\u4755\u4754\u4752\u4753\u475c\u475d\u4753\u475d", "\u498e\u4984\u4988\u498d\u4988\u498c\u498b\u4985", "\u5a59\u5a5f\u5a59\u5a5e\u5a5a\u5a5e\u5a5e\u5a5d", "\u32e2\u32e5\u32e8\u32e0\u32e2\u32e5\u32e0\u32e0", "\u4675\u467d\u4677\u4673\u4670\u4674\u4675\u4677", "\u81f7\u81f4\u81f1\u81f2\u81f6\u81f2\u81f1\u81f4", "\u5ba8\u5ba9\u5ba3\u5ba8\u5ba2\u5ba8\u5bae\u5ba3", "\ud804\ud804\ud809\ud800\ud801\ud807\ud806\ud805", "\u2305\u2305\u2300\u2305\u2306\u230f\u2306", "\ub8ae\ub8aa\ub8ad\ub8ae\ub8af\ub8ac\ub8a8\ub8a5", "\u6c6f\u6c68\u6c68\u6c6c\u6c65\u6c6c\u6c6e\u6c6a", "\ub74b\ub74b\ub74b\ub748\ub749\ub74b\ub746\ub748", "\u5bf9\u5bfe\u5bfc\u5bf8\u5bf5\u5bf9\u5bf5", "\uc570\uc57f\uc57a\uc570\uc578\uc571\uc57b", "\u5698\u569f\u5692\u5693\u5699\u569a\u569f\u569d", "\uc34d\uc341\uc34f\uc34d\uc341\uc34c\uc34c\uc34a"}, d2={"\u047f\u047c\u0449\u2404\u0436\u0434\u0422\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0459\u047e\u0478\u0463\u0464\u046d\u0431\u0423\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0459\u047e\u0478\u0463\u0464\u046d\u0431", "\u05f1\u05f2\u05c0\u258a\u05b8\u05ba\u05ac\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05bf\u05ad\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05bf", "\u0182\u01dd\u01d2\u01d7\u01d0\u01d7\u01ca\u0180\u0182\u0180\u0196\u0197\u01e8", "\u0369\u033c\u033b\u033c\u0321\u036b\u0369\u036b\u037d\u037c\u0303", "\u0321\u0323\u0332\u0305\u032a\u0327\u0335\u0335\u037a\u0378\u036e\u036f\u030a\u032c\u0327\u0330\u0327\u0369\u032a\u0327\u0328\u0321\u0369\u0305\u032a\u0327\u0335\u0335\u037d", "\u021d\u0214\u0206\u021d\u0236\u021a\u0211\u0210\u0249\u024b\u025d\u025c\u023c", "\u0514\u0500\u0504\u0510\u051d\u0502\u054d\u054f\u0559\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u053e\u0513\u051b\u0514\u0512\u0505\u054a\u0558\u052b", "\u06cc\u06c3\u06c0\u06c1\u06ca\u0693\u0691\u0687\u0686\u06e3\u06c5\u06ce\u06d9\u06ce\u0680\u06c3\u06ce\u06c1\u06c8\u0680\u06e0\u06cd\u06c5\u06ca\u06cc\u06db\u0694", "\u076c\u0777\u074b\u076c\u076a\u0771\u0776\u077f\u0724\u0726\u0730\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u074b\u076c\u076a\u0771\u0776\u077f\u0723", "\u0614\u0615\u060e\u0613\u061c\u0603\u0646\u0644\u0652\u0653\u062c", "\u009c\u009d\u0086\u009b\u0094\u008b\u00b3\u009e\u009e\u00ce\u00cc\u00da\u00db\u00a4", "\u0560\u0576\u057e\u0563\u052b\u0529\u053f\u053e\u0541", "\u042d\u043b\u0433\u042e\u0466\u0464\u0472\u0410\u0473\u040c", "\u06ad\u06bb\u06b3\u06ae\u06ea\u06e6\u06e4\u06f2\u0690\u06f3\u068c", "\u0466\u0470\u0478\u0465\u042d\u042f\u0439\u045b\u0458\u0438\u0447", "\u0353\u035c\u035b\u0354\u0359\u035c\u034f\u0350\u0309\u030b\u031d\u031c\u0363"})
public final class Class3587 {
    public static int field7979 = 2024708655;
    public static float field7980 = Float.intBitsToFloat(1042390132);
    public static float field7981 = Float.intBitsToFloat(1132396544);
    public static int field7982 = 710083483;

    /*
     * Enabled aggressive block sorting
     */
    private static String ydFfJ8CWRxeqtGQr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 27961 : 27962;
            block5: while (true) {
                switch (n2) {
                    case 27962: {
                        n2 = 27960;
                        continue block5;
                    }
                    case 27961: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        ax\u200e = "command";
        aV\u200e = "The mode for the rotation pitch spin";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jtrKZa68sxWgxA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3587.ydFfJ8CWRxeqtGQr(k2, 340330547));
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
                int a2 = Integer.parseInt(Class3587.ydFfJ8CWRxeqtGQr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3587.ydFfJ8CWRxeqtGQr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3587.ydFfJ8CWRxeqtGQr(k2, 340330547) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

