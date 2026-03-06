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

@HACHIMI_CLIENT(mv=100, d1={"\u10b1\u10b4\u10bd\u10bc\u10b1\u10b4\u10b6\u10b4", "\uc121\uc126\uc123\uc121\uc120\uc124\uc120\uc126", "\u71de\u71d9\u71db\u71d3\u71da\u71d2\u71d3\u71da", "\u50fb\u50f1\u50fe\u50f0\u50fd\u50f8\u50fe", "\u3a5d\u3a56\u3a57\u3a5e\u3a5b\u3a58\u3a59\u3a57", "\ue69c\ue699\ue695\ue695\ue695\ue69a\ue699\ue69b", "\u9b3e\u9b38\u9b3b\u9b3e\u9b3c\u9b3e\u9b32\u9b33", "\u96b6\u96b4\u96b2\u96b0\u96b1\u96b6\u96b1\u96b0", "HEMKEOMM", "\ud822\ud823\ud822\ud82b\ud823\ud823\ud823\ud826", "\u3df7\u3df4\u3dfe\u3df4\u3df6\u3df3\u3df0\u3dff", "\u3533\u3538\u3538\u3534\u3534\u3537\u3533\u3532", "\u0d61\u0d68\u0d65\u0d62\u0d65\u0d66\u0d63\u0d65", "\u9acf\u9aca\u9acb\u9ac1\u9ac0\u9acb\u9ac9\u9ace", "\u7147\u714b\u7147\u7149\u714e\u714b\u7146", "\u122a\u122e\u1228\u1226\u122c\u122e\u1228\u1227", "\u9459\u9456\u945e\u9457\u945c\u9459\u9458\u9459"}, d2={"\u032e\u0326\u030f\u2350\u0362\u0360\u0376\u0312\u0334\u033f\u0328\u033f\u0371\u0332\u033f\u0330\u0339\u0371\u030d\u032a\u032c\u0337\u0330\u0339\u0365\u0377\u0312\u0334\u033f\u0328\u033f\u0371\u0332\u033f\u0330\u0339\u0371\u030d\u032a\u032c\u0337\u0330\u0339\u0365", "\u07fa\u07f2\u07d8\u2784\u07b6\u07b4\u07a2\u07c6\u07e0\u07eb\u07fc\u07eb\u07a5\u07e6\u07eb\u07e4\u07ed\u07a5\u07d9\u07fe\u07f8\u07e3\u07e4\u07ed\u07b1\u07a3\u07c6\u07e0\u07eb\u07fc\u07eb\u07a5\u07e6\u07eb\u07e4\u07ed\u07a5\u07d9\u07fe\u07f8\u07e3\u07e4\u07ed\u07b1", "\u04fc\u04f4\u04df\u2482\u04b0\u04b2\u04a4\u04c0\u04e6\u04ed\u04fa\u04ed\u04a3\u04e0\u04ed\u04e2\u04eb\u04a3\u04df\u04f8\u04fe\u04e5\u04e2\u04eb\u04b7\u04a5\u04c0\u04e6\u04ed\u04fa\u04ed\u04a3\u04e0\u04ed\u04e2\u04eb\u04a3\u04df\u04f8\u04fe\u04e5\u04e2\u04eb\u04b7", "\u0540\u051f\u0510\u0515\u0512\u0515\u0508\u0542\u0540\u0542\u0554\u0555\u052a", "\u0470\u0425\u0422\u0425\u0438\u0472\u0470\u0472\u0464\u0465\u041a", "\u02d6\u02d4\u02c5\u02f2\u02dd\u02d0\u02c2\u02c2\u028d\u028f\u0299\u0298\u02fd\u02db\u02d0\u02c7\u02d0\u029e\u02dd\u02d0\u02df\u02d6\u029e\u02f2\u02dd\u02d0\u02c2\u02c2\u028a", "\u0642\u064b\u0659\u0642\u0669\u0645\u064e\u064f\u0616\u0614\u0602\u0603\u0663", "\u03ff\u03eb\u03ef\u03fb\u03f6\u03e9\u03a6\u03a4\u03b2\u03d6\u03f0\u03fb\u03ec\u03fb\u03b5\u03f6\u03fb\u03f4\u03fd\u03b5\u03d5\u03f8\u03f0\u03ff\u03f9\u03ee\u03a1\u03b3\u03c0", "\u059c\u0593\u0590\u0591\u059a\u05c3\u05c1\u05d7\u05d6\u05b3\u0595\u059e\u0589\u059e\u05d0\u0593\u059e\u0591\u0598\u05d0\u05b0\u059d\u0595\u059a\u059c\u058b\u05c4", "\u06fc\u06e7\u06db\u06fc\u06fa\u06e1\u06e6\u06ef\u06b4\u06b6\u06a0\u06a1\u06c4\u06e2\u06e9\u06fe\u06e9\u06a7\u06e4\u06e9\u06e6\u06ef\u06a7\u06db\u06fc\u06fa\u06e1\u06e6\u06ef\u06b3", "\f\r\u0016\u000b\u0004\u001b^\\JK4", "\u0312\u0313\u0308\u0315\u031a\u0305\u033d\u0310\u0310\u0340\u0342\u0354\u0355\u032a", "\u061a\u060c\u0604\u0619\u0651\u0653\u0645\u0644\u063b", "\u048d\u049b\u0493\u048e\u04c6\u04c4\u04d2\u04b0\u04d3\u04ac", "\u0226\u0230\u0238\u0225\u0261\u026d\u026f\u0279\u021b\u0278\u0207", "\u0505\u0513\u051b\u0506\u054e\u054c\u055a\u0538\u053b\u055b\u0524", "\u04b7\u04b8\u04bf\u04b0\u04bd\u04b8\u04ab\u04b4\u04ed\u04ef\u04f9\u04f8\u0487"})
public final class Class4214 {
    public static int field9863 = 188157923;
    public static float field9864;
    public static float field9865;
    public static double field9866;

    static {
        a\u200e = "Pause all modules";
        g\u200e = "OFF";
        h\u200e = "DIAMOND";
        field9865 = Float.intBitsToFloat(1054683276);
        field9864 = Float.intBitsToFloat(1046301540);
        field9866 = Double.longBitsToDouble(4598930963868473402L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite N2Kd7dAwySk7Z4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4214.zvAaOHXMX2GHnYW2(k2, -1259409615));
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
                int a2 = Integer.parseInt(Class4214.zvAaOHXMX2GHnYW2(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4214.zvAaOHXMX2GHnYW2(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4214.zvAaOHXMX2GHnYW2(k2, -1259409615) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String zvAaOHXMX2GHnYW2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

