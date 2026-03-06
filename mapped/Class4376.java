/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ue332\ue33c\ue331\ue330\ue33c\ue332\ue332\ue332", "\u7b77\u7b77\u7b72\u7b7d\u7b77\u7b76\u7b76\u7b74", "\u63ac\u63ae\u63a9\u63ab\u63a8\u63ac\u63ad\u63af", "\u5023\u5029\u5028\u5022\u5028\u502c\u5028", "\uc1b5\uc1b2\uc1b0\uc1ba\uc1b0\uc1b1\uc1b7\uc1ba", "\u33fe\u33f8\u33fb\u33ff\u33f5\u33fe\u33f9\u33fa", "\u79b9\u79ba\u79bb\u79bd\u79be\u79b5", "\u665f\u665a\u665c\u6658\u665e\u665d\u665a\u665b", "\u8586\u8587\u8582\u8582\u8582\u858a\u858b\u8580", "\u4c4a\u4c48\u4c41\u4c4b\u4c4a\u4c49\u4c48\u4c4c", "\u365e\u365c\u3656\u365c\u365a", "\ue0d1\ue0d1\ue0dd\ue0d1\ue0d1\ue0d1\ue0d6\ue0d2", "\uc517\uc517\uc515\uc516\uc510\uc511\uc512\uc515", "\ua5e0\ua5e1\ua5eb\ua5e6\ua5eb\ua5e0\ua5e6\ua5eb", "\u595e\u5952\u595e\u5959\u595b\u5958\u5958\u595f", "\u1448\u144c\u144c\u1444\u144b\u144d\u144c\u1449", "\u9d1d\u9d1e\u9d1c\u9d19\u9d1e\u9d18\u9d1f\u9d1b"}, d2={"\u078c\u07b3\u0797\u27ee\u07dc\u07de\u07c8\u07ac\u078a\u0781\u0796\u0781\u07cf\u078c\u0781\u078e\u0787\u07cf\u07b3\u0794\u0792\u0789\u078e\u0787\u07db\u07c9\u07ac\u078a\u0781\u0796\u0781\u07cf\u078c\u0781\u078e\u0787\u07cf\u07b3\u0794\u0792\u0789\u078e\u0787\u07db", "\u0428\u0417\u043c\u244a\u0478\u047a\u046c\u0408\u042e\u0425\u0432\u0425\u046b\u0428\u0425\u042a\u0423\u046b\u0417\u0430\u0436\u042d\u042a\u0423\u047f\u046d\u0408\u042e\u0425\u0432\u0425\u046b\u0428\u0425\u042a\u0423\u046b\u0417\u0430\u0436\u042d\u042a\u0423\u047f", "\u0615\u062a\u0600\u2677\u0645\u0647\u0651\u0635\u0613\u0618\u060f\u0618\u0656\u0615\u0618\u0617\u061e\u0656\u062a\u060d\u060b\u0610\u0617\u061e\u0642\u0650\u0635\u0613\u0618\u060f\u0618\u0656\u0615\u0618\u0617\u061e\u0656\u062a\u060d\u060b\u0610\u0617\u061e\u0642", "\u0757\u0708\u0707\u0702\u0705\u0702\u071f\u0755\u0757\u0755\u0743\u0742\u073d", "\u0717\u0742\u0745\u0742\u075f\u0715\u0717\u0715\u0703\u0702\u077d", "\u069f\u069d\u068c\u06bb\u0694\u0699\u068b\u068b\u06c4\u06c6\u06d0\u06d1\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06bb\u0694\u0699\u068b\u068b\u06c3", "\u06e7\u06ee\u06fc\u06e7\u06cc\u06e0\u06eb\u06ea\u06b3\u06b1\u06a7\u06a6\u06c6", "\u06c1\u06d5\u06d1\u06c5\u06c8\u06d7\u0698\u069a\u068c\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06eb\u06c6\u06ce\u06c1\u06c7\u06d0\u069f\u068d\u06fe", "\u05a8\u05a7\u05a4\u05a5\u05ae\u05f7\u05f5\u05e3\u05e2\u0587\u05a1\u05aa\u05bd\u05aa\u05e4\u05a7\u05aa\u05a5\u05ac\u05e4\u0584\u05a9\u05a1\u05ae\u05a8\u05bf\u05f0", "\u044a\u0451\u046d\u044a\u044c\u0457\u0450\u0459\u0402\u0400\u0416\u0417\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405", "\u055f\u055e\u0545\u0558\u0557\u0548\u050d\u050f\u0519\u0518\u0567", "\u07b3\u07b2\u07a9\u07b4\u07bb\u07a4\u079c\u07b1\u07b1\u07e1\u07e3\u07f5\u07f4\u078b", "\u042a\u043c\u0434\u0429\u0461\u0463\u0475\u0474\u040b", "\u0016\u0000\b\u0015]_I+H7", "\u04e5\u04f3\u04fb\u04e6\u04a2\u04ae\u04ac\u04ba\u04d8\u04bb\u04c4", "\u0101\u0117\u011f\u0102\u014a\u0148\u015e\u013c\u013f\u015f\u0120", "\u0196\u0199\u019e\u0191\u019c\u0199\u018a\u0195\u01cc\u01ce\u01d8\u01d9\u01a6"})
public final class Class4376 {
    public static int field9975 = 313362256;
    public static String field9976;
    public static double field9977;
    public static int field9978 = -71246914;
    public static float field9979 = 0.68281716f;

    /*
     * Unable to fully structure code
     */
    private static CallSite hdE1wOrqF26DI7(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4376.aYJ1OaDbvuR2JWsR(k, -1652090785));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 22623;
                ** GOTO lbl19
            }
            v0 = 22624;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 22622;
lbl19:
                // 3 sources

                switch (v0) {
                    case 22624: {
                        continue block7;
                    }
                    case 22623: {
                        try {
                            a = Integer.parseInt(Class4376.aYJ1OaDbvuR2JWsR(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class4376.aYJ1OaDbvuR2JWsR(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class4376.aYJ1OaDbvuR2JWsR(k, -1652090785) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String aYJ1OaDbvuR2JWsR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        d\u200e = "OFF";
        f\u200e = "The ESP render range";
        field9977 = Double.longBitsToDouble(4605484386011512028L);
        field9976 = "textures/background.png";
    }
}

