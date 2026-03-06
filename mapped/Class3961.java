/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u77d4\u77d4\u77d4\u77d3\u77d2\u77dd\u77d0\u77d7", "\u87e2\u87ee\u87ef\u87ef\u87e6\u87e0\u87e4\u87ee", "\u9f34\u9f33\u9f35\u9f37\u9f36\u9f38\u9f37\u9f31", "\ue686\ue682\ue688\ue683\ue682\ue681\ue683\ue684", "\u3074\u3074\u3072\u3076\u3073\u3072\u3070\u3073", "\u90ec\u90ec\u90e5\u90ef\u90e4\u90ee\u90ea\u90ec", "\ue372\ue374\ue377\ue37c\ue37d\ue370\ue376\ue375", "\u4919\u491e\u491e\u491b\u4912\u491a\u4919\u491c", "\u6c56\u6c51\u6c51\u6c51\u6c56\u6c53\u6c53\u6c51", "\u4a48\u4a4d\u4a43\u4a4f\u4a4b\u4a48\u4a43\u4a43", "\u0e0d\u0e0e\u0e0c\u0e0e\u0e0f\u0e0e\u0e0c\u0e0a", "\u273c\u2738\u2730\u2738\u273d\u273c\u273b", "\u55f3\u55f3\u55f2\u55f0\u55f7\u55f2\u55fe\u55f2", "\u5831\u5836\u583a\u583b\u583a\u5830\u583b\u5830"}, d2={"\u0133\u016c\u0163\u0166\u0161\u0166\u017b\u0131\u0133\u0131\u0127\u0126\u0159", "\u00f2\u00a7\u00a0\u00a7\u00ba\u00f0\u00f2\u00f0\u00e6\u00e7\u0098", "\u07d7\u07d5\u07c4\u07f3\u07dc\u07d1\u07c3\u07c3\u078c\u078e\u0798\u0799\u07fc\u07da\u07d1\u07c6\u07d1\u079f\u07dc\u07d1\u07de\u07d7\u079f\u07f3\u07dc\u07d1\u07c3\u07c3\u078b", "\u07bd\u07b4\u07a6\u07bd\u0796\u07ba\u07b1\u07b0\u07e9\u07eb\u07fd\u07fc\u079c", "\u0574\u0560\u0564\u0570\u057d\u0562\u052d\u052f\u0539\u055d\u057b\u0570\u0567\u0570\u053e\u057d\u0570\u057f\u0576\u053e\u055e\u0573\u057b\u0574\u0572\u0565\u052a\u0538\u054b", "\u0526\u0529\u052a\u052b\u0520\u0579\u057b\u056d\u056c\u0509\u052f\u0524\u0533\u0524\u056a\u0529\u0524\u052b\u0522\u056a\u050a\u0527\u052f\u0520\u0526\u0531\u057e", "\u038d\u0396\u03aa\u038d\u038b\u0390\u0397\u039e\u03c5\u03c7\u03d1\u03d0\u03b5\u0393\u0398\u038f\u0398\u03d6\u0395\u0398\u0397\u039e\u03d6\u03aa\u038d\u038b\u0390\u0397\u039e\u03c2", "\u0530\u0531\u052a\u0537\u0538\u0527\u0562\u0560\u0576\u0577\u0508", "\u0708\u0709\u0712\u070f\u0700\u071f\u0727\u070a\u070a\u075a\u0758\u074e\u074f\u0730", "\u0748\u075e\u0756\u074b\u0703\u0701\u0717\u0716\u0769", "\u0384\u0392\u039a\u0387\u03cf\u03cd\u03db\u03b9\u03da\u03a5", "\u0014\u0002\n\u0017S_]K)J5", "\u0363\u0375\u037d\u0360\u0328\u032a\u033c\u035e\u035d\u033d\u0342", "\u015e\u0151\u0156\u0159\u0154\u0151\u0142\u015d\u0104\u0106\u0110\u0111\u016e"})
public final class Class3961 {
    public static float field9017;
    public static double field9018;
    public static double field9019;
    public static float field9020;

    private static String DN8Y62NilWybM5Jw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9020 = Float.intBitsToFloat(1062663263);
        field9019 = Double.longBitsToDouble(4595210399725004264L);
        field9018 = Double.longBitsToDouble(4598986484770666330L);
        field9017 = Float.intBitsToFloat(1065072062);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite gXoyFA6Jlw1tvl(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block12: {
            block9: {
                block11: {
                    o = Class.forName(Class3961.DN8Y62NilWybM5Jw(k, 39356355));
                    p = o.getAnnotation(HACHIMI_CLIENT.class);
                    if (p.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    q = p.d1();
                    r = p.d2();
                    s = "";
                    t = "";
                    for (f = 0; f < q.length; ++f) {
                        block8: {
                            block10: {
                                try {
                                    a = Integer.parseInt(Class3961.DN8Y62NilWybM5Jw(q[f], m));
                                }
                                catch (NumberFormatException b) {
                                    continue;
                                }
                                if (e % 59557 != m.intValue()) break block10;
                                v0 = 50434;
                                ** GOTO lbl23
                            }
                            v0 = 50435;
                            if (true) ** GOTO lbl23
                            do {
                                v0 = var16_19 = 50433;
lbl23:
                                // 3 sources

                                if (var16_19 == 50434) break block8;
                            } while (var16_19 == 50435);
                            continue;
                        }
                        c = Class3961.DN8Y62NilWybM5Jw(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                    if (!s.isEmpty()) break block11;
                    v1 = 25098;
                    ** GOTO lbl40
                }
                v1 = 25099;
                if (true) ** GOTO lbl40
                do {
                    v1 = var18_21 = 25097;
lbl40:
                    // 3 sources

                    if (var18_21 == 25098) break block9;
                } while (var18_21 == 25099);
                break block12;
            }
            throw new Exception("Can't find method in " + Class3961.DN8Y62NilWybM5Jw(k, 39356355) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

