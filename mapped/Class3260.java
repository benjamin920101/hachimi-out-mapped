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

@HACHIMI_CLIENT(mv=100, d1={"\u75e6\u75e0\u75e0\u75e6\u75e3\u75e6\u75e1\u75e6", "\u12ac\u12ac\u12af\u12ab\u12a7\u12a7\u12a9\u12ae", "\u0f9d\u0f9c\u0f9a\u0f91\u0f9f\u0f9d\u0f9d\u0f9a", "\u3444\u344e\u3446\u3446\u3443\u3444\u3444\u3446", "\u3c0e\u3c0d\u3c0b\u3c05\u3c0a\u3c0f\u3c0a\u3c0b", "\u24e6\u24e0\u24e3\u24e6\u24e1\u24e1\u24ec\u24e7", "\u03a1\u03a2\u03a1\u03a5\u03ad\u03a7\u03ad\u03ac", "\u2b68\u2b66\u2b6d\u2b6c\u2b6c\u2b67\u2b66\u2b6f", "\u7ab3\u7ab4\u7ab4\u7ab3\u7ab0\u7ab6\u7ab4\u7ab6", "\u78f8\u78fa\u78f4\u78f8\u78fe\u78fb\u78fe\u78fa", "\ud340\ud344\ud342\ud340\ud34f\ud34e\ud341\ud346", "\ube33\ube35\ube32\ube30\ube35\ube34\ube33\ube32", "\udc6a\udc6d\udc65\udc6f\udc6a\udc6d\udc6f\udc69", "\u31cb\u31cb\u31ce\u31c8\u31ca\u31c1\u31cc\u31c8", "\udb0a\udb0e\udb09\udb06\udb0d\udb0f\udb0b\udb09", "\u543a\u543d\u543e\u543c\u543c\u5437\u5436\u543b"}, d2={"\u07a3\u07a6\u07b0\u27c9\u07fb\u07f9\u07ef\u078b\u07ad\u07a6\u07b1\u07a6\u07e8\u07ab\u07a6\u07a9\u07a0\u07e8\u0794\u07b3\u07b5\u07ae\u07a9\u07a0\u07fc\u07ee\u078b\u07ad\u07a6\u07b1\u07a6\u07e8\u07ab\u07a6\u07a9\u07a0\u07e8\u0794\u07b3\u07b5\u07ae\u07a9\u07a0\u07fc", "\u0791\u0794\u078d\u27fb\u07c9\u07cb\u07dd\u07b9\u079f\u0794\u0783\u0794\u07da\u0799\u0794\u079b\u0792\u07da\u07a6\u0781\u0787\u079c\u079b\u0792\u07ce\u07dc\u07b9\u079f\u0794\u0783\u0794\u07da\u0799\u0794\u079b\u0792\u07da\u07a6\u0781\u0787\u079c\u079b\u0792\u07ce", "\u021c\u0243\u024c\u0249\u024e\u0249\u0254\u021e\u021c\u021e\u0208\u0209\u0276", "\u04da\u048f\u0488\u048f\u0492\u04d8\u04da\u04d8\u04ce\u04cf\u04b0", "\u0597\u0595\u0584\u05b3\u059c\u0591\u0583\u0583\u05cc\u05ce\u05d8\u05d9\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05b3\u059c\u0591\u0583\u0583\u05cb", "\u0713\u071a\u0708\u0713\u0738\u0714\u071f\u071e\u0747\u0745\u0753\u0752\u0732", "\u0431\u0425\u0421\u0435\u0438\u0427\u0468\u046a\u047c\u0418\u043e\u0435\u0422\u0435\u047b\u0438\u0435\u043a\u0433\u047b\u041b\u0436\u043e\u0431\u0437\u0420\u046f\u047d\u040e", "\u069d\u0692\u0691\u0690\u069b\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06b1\u069c\u0694\u069b\u069d\u068a\u06c5", "\u0387\u039c\u03a0\u0387\u0381\u039a\u039d\u0394\u03cf\u03cd\u03db\u03da\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8", "\u0769\u0768\u0773\u076e\u0761\u077e\u073b\u0739\u072f\u072e\u0751", "\u02ce\u02cf\u02d4\u02c9\u02c6\u02d9\u02e1\u02cc\u02cc\u029c\u029e\u0288\u0289\u02f6", "\u012d\u013b\u0133\u012e\u0166\u0164\u0172\u0173\u010c", "\u04ee\u04f8\u04f0\u04ed\u04a5\u04a7\u04b1\u04d3\u04b0\u04cf", "\u01cf\u01d9\u01d1\u01cc\u0188\u0184\u0186\u0190\u01f2\u0191\u01ee", "\u0350\u0346\u034e\u0353\u031b\u0319\u030f\u036d\u036e\u030e\u0371", "\u02f5\u02fa\u02fd\u02f2\u02ff\u02fa\u02e9\u02f6\u02af\u02ad\u02bb\u02ba\u02c5"})
public final class Class3260 {
    public static float field6997 = Float.intBitsToFloat(1058572717);
    public static double field6998;

    /*
     * Enabled aggressive block sorting
     */
    private static String zpSjdtPTqzT7jTel(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 11288 : 11289;
            block5: while (true) {
                switch (n2) {
                    case 11289: {
                        n2 = 11287;
                        continue block5;
                    }
                    case 11288: {
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

    /*
     * WARNING - void declaration
     */
    private static CallSite aNJ5aFjLAhvbgF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3260.zpSjdtPTqzT7jTel(k2, -1489802486));
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
                int a2 = Integer.parseInt(Class3260.zpSjdtPTqzT7jTel(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3260.zpSjdtPTqzT7jTel(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3260.zpSjdtPTqzT7jTel(k2, -1489802486) + " " + l2 + " " + m2);
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
        I\u200e = "username_history";
        field6998 = Double.longBitsToDouble(4603728959802110778L);
        bt\u200e = "Places on visible sides only";
    }
}

