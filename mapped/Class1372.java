/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u0efa\u0ef8\u0efe\u0ef9\u0ef8\u0efd\u0ef8\u0efe", "\ue303\ue307\ue301\ue304\ue301\ue306\ue301\ue301", "\u2cbc\u2cbc\u2cba\u2cb8\u2cba\u2cbd\u2cb7\u2cbb", "\u4e3c\u4e38\u4e3a\u4e3b\u4e32\u4e32\u4e3b\u4e3f", "\u5080\u5088\u5088\u5080\u5083\u5087\u5088\u5084", "\u7c9d\u7c9d\u7c9b\u7c9b\u7c9a\u7c9b\u7c99\u7c9e", "\udef7\udef4\udef1\udef1\udef4\udef6\udef5\udef6", "\u3cf5\u3cf7\u3cf3\u3cf8\u3cf0\u3cf2\u3cf5\u3cf3", "\u3692\u3691\u3692\u3691\u3696\u3691\u369c", "\u0e38\u0e3c\u0e39\u0e3b\u0e3d\u0e35\u0e39\u0e38", "\ub14e\ub143\ub14e\ub143\ub142\ub142\ub14d\ub14d", "\ub150\ub15d\ub155\ub150\ub156\ub15c\ub156\ub154", "\u8a62\u8a60\u8a63\u8a65\u8a60\u8a67\u8a65\u8a60", "\u0cb5\u0cb2\u0cb4\u0cb3\u0cb7\u0cb1\u0cb6\u0cb6", "\uc2cd\uc2cb\uc2c8\uc2cc\uc2cf\uc2ce\uc2c8\uc2cb", "\u8787\u878f\u8787\u8783\u8784\u8783\u8785\u878f", "\u5c3c\u5c35\u5c39\u5c35\u5c3b\u5c3f\u5c3e\u5c38"}, d2={"\u0734\u0708\u0718\u2753\u0761\u0763\u0775\u0711\u0737\u073c\u072b\u073c\u0772\u0731\u073c\u0733\u073a\u0772\u070e\u0729\u072f\u0734\u0733\u073a\u0766\u0774\u0711\u0737\u073c\u072b\u073c\u0772\u0731\u073c\u0733\u073a\u0772\u070e\u0729\u072f\u0734\u0733\u073a\u0766", "\u0629\u0615\u0606\u264e\u067c\u067e\u0668\u060c\u062a\u0621\u0636\u0621\u066f\u062c\u0621\u062e\u0627\u066f\u0613\u0634\u0632\u0629\u062e\u0627\u067b\u0669\u060c\u062a\u0621\u0636\u0621\u066f\u062c\u0621\u062e\u0627\u066f\u0613\u0634\u0632\u0629\u062e\u0627\u067b", "\u01ca\u01f6\u01e4\u21ad\u019f\u019d\u018b\u01ef\u01c9\u01c2\u01d5\u01c2\u018c\u01cf\u01c2\u01cd\u01c4\u018c\u01f0\u01d7\u01d1\u01ca\u01cd\u01c4\u0198\u018a\u01ef\u01c9\u01c2\u01d5\u01c2\u018c\u01cf\u01c2\u01cd\u01c4\u018c\u01f0\u01d7\u01d1\u01ca\u01cd\u01c4\u0198", "\u0579\u0526\u0529\u052c\u052b\u052c\u0531\u057b\u0579\u057b\u056d\u056c\u0513", "\u063f\u066a\u066d\u066a\u0677\u063d\u063f\u063d\u062b\u062a\u0655", "\u057d\u057f\u056e\u0559\u0576\u057b\u0569\u0569\u0526\u0524\u0532\u0533\u0556\u0570\u057b\u056c\u057b\u0535\u0576\u057b\u0574\u057d\u0535\u0559\u0576\u057b\u0569\u0569\u0521", "\u0383\u038a\u0398\u0383\u03a8\u0384\u038f\u038e\u03d7\u03d5\u03c3\u03c2\u03a2", "\u04ee\u04fa\u04fe\u04ea\u04e7\u04f8\u04b7\u04b5\u04a3\u04c7\u04e1\u04ea\u04fd\u04ea\u04a4\u04e7\u04ea\u04e5\u04ec\u04a4\u04c4\u04e9\u04e1\u04ee\u04e8\u04ff\u04b0\u04a2\u04d1", "\u05cf\u05c0\u05c3\u05c2\u05c9\u0590\u0592\u0584\u0585\u05e0\u05c6\u05cd\u05da\u05cd\u0583\u05c0\u05cd\u05c2\u05cb\u0583\u05e3\u05ce\u05c6\u05c9\u05cf\u05d8\u0597", "_Dx_YBEL\u0017\u0015\u0003\u0002gAJ]J\u0004GJEL\u0004x_YBEL\u0010", "\u033f\u033e\u0325\u0338\u0337\u0328\u036d\u036f\u0379\u0378\u0307", "\u06e7\u06e6\u06fd\u06e0\u06ef\u06f0\u06c8\u06e5\u06e5\u06b5\u06b7\u06a1\u06a0\u06df", "\u0281\u0297\u029f\u0282\u02ca\u02c8\u02de\u02df\u02a0", "\u071f\u0709\u0701\u071c\u0754\u0756\u0740\u0722\u0741\u073e", "\u0314\u0302\u030a\u0317\u0353\u035f\u035d\u034b\u0329\u034a\u0335", "\u06e0\u06f6\u06fe\u06e3\u06ab\u06a9\u06bf\u06dd\u06de\u06be\u06c1", "<34;63 ?fdrs\f"})
public final class Class1372 {
    public static int field5283 = 415385143;
    public static int field5284 = 928532989;
    public static long field5285 = -1021332520038106849L;
    public static float field5286 = 0.5972788f;
    public static float field5287;
    public static float field5288 = 0.15611523f;
    public static double field5289;
    public static int field5290 = 144261678;

    private static String wRu3WLyoqhb76mSS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        w\u200e = "ROTATE";
        field5287 = Float.intBitsToFloat(1071225242);
        aV\u200e = "Sprinting mode. Rage allows for multi-directional sprinting.";
        field5289 = Double.longBitsToDouble(4598902921832024004L);
        bA\u200e = "mixFactor";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite nlTwc7499yvj0c(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1372.wRu3WLyoqhb76mSS(k, -1737698491));
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
                v0 = 62417;
                ** GOTO lbl19
            }
            v0 = 62418;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 62416;
lbl19:
                // 3 sources

                switch (v0) {
                    case 62418: {
                        continue block7;
                    }
                    case 62417: {
                        try {
                            a = Integer.parseInt(Class1372.wRu3WLyoqhb76mSS(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1372.wRu3WLyoqhb76mSS(r[f], l);
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
            throw new Exception("Can't find method in " + Class1372.wRu3WLyoqhb76mSS(k, -1737698491) + " " + l + " " + m);
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

