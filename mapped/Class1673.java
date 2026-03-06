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

@HACHIMI_CLIENT(mv=100, d1={"\u38c2\u38c3\u38cf\u38c5\u38c5\u38c6\u38c4\u38cf", "\ubebe\ubeb9\ubebc\ubebc\ubebf\ubebd\ubeba\ubebf", "\u3924\u3929\u3923\u3928\u3927\u3923\u3926\u3921", "\u6d5c\u6d56\u6d5e\u6d59\u6d57\u6d5d\u6d58\u6d5f", "\ub9aa\ub9ad\ub9ac\ub9a5\ub9af\ub9a8\ub9a8\ub9ad", "\ue4e5\ue4e1\ue4e0\ue4e3\ue4e9\ue4e3\ue4e6\ue4e8", "\u2ed0\u2edd\u2ed1\u2ed4\u2ed7\u2edc\u2ed3\u2ed5", "\u9706\u9709\u9707\u970d\u970b\u9707\u9709", "\u3428\u3425\u342f\u342e\u342a\u3429\u342f\u342a", "\u9869\u986e\u986a\u9867\u986a\u9867\u986d\u9869", "\ud24d\ud24c\ud24f\ud24a\ud249\ud243\ud24e\ud24b", "\ub982\ub985\ub98f\ub98f\ub982\ub982\ub98e", "\u1b70\u1b75\u1b78\u1b74\u1b78\u1b71\u1b73", "\u6577\u6570\u6574\u6577\u6573\u6574\u6575\u6572", "\u5c74\u5c75\u5c75\u5c77\u5c76\u5c72\u5c76\u5c7f", "\u03dd\u03d8\u03db\u03d8\u03d7\u03de\u03de\u03da"}, d2={"\u0209\u0238\u0225\u2272\u0240\u0242\u0254\u0230\u0216\u021d\u020a\u021d\u0253\u0210\u021d\u0212\u021b\u0253\u022f\u0208\u020e\u0215\u0212\u021b\u0247\u0255\u0230\u0216\u021d\u020a\u021d\u0253\u0210\u021d\u0212\u021b\u0253\u022f\u0208\u020e\u0215\u0212\u021b\u0247", "\u02e3\u02d2\u02cc\u2298\u02aa\u02a8\u02be\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad\u02bf\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad", "\u0185\u01da\u01d5\u01d0\u01d7\u01d0\u01cd\u0187\u0185\u0187\u0191\u0190\u01ef", "\u074a\u071f\u0718\u071f\u0702\u0748\u074a\u0748\u075e\u075f\u0720", "\u05ec\u05ee\u05ff\u05c8\u05e7\u05ea\u05f8\u05f8\u05b7\u05b5\u05a3\u05a2\u05c7\u05e1\u05ea\u05fd\u05ea\u05a4\u05e7\u05ea\u05e5\u05ec\u05a4\u05c8\u05e7\u05ea\u05f8\u05f8\u05b0", "\u069f\u0696\u0684\u069f\u06b4\u0698\u0693\u0692\u06cb\u06c9\u06df\u06de\u06be", "\u04b2\u04a6\u04a2\u04b6\u04bb\u04a4\u04eb\u04e9\u04ff\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0498\u04b5\u04bd\u04b2\u04b4\u04a3\u04ec\u04fe\u048d", "\u03f9\u03f6\u03f5\u03f4\u03ff\u03a6\u03a4\u03b2\u03b3\u03d6\u03f0\u03fb\u03ec\u03fb\u03b5\u03f6\u03fb\u03f4\u03fd\u03b5\u03d5\u03f8\u03f0\u03ff\u03f9\u03ee\u03a1", "\u0304\u031f\u0323\u0304\u0302\u0319\u031e\u0317\u034c\u034e\u0358\u0359\u033c\u031a\u0311\u0306\u0311\u035f\u031c\u0311\u031e\u0317\u035f\u0323\u0304\u0302\u0319\u031e\u0317\u034b", "\u0453\u0452\u0449\u0454\u045b\u0444\u0401\u0403\u0415\u0414\u046b", "\u076c\u076d\u0776\u076b\u0764\u077b\u0743\u076e\u076e\u073e\u073c\u072a\u072b\u0754", "\u01af\u01b9\u01b1\u01ac\u01e4\u01e6\u01f0\u01f1\u018e", "\u04c8\u04de\u04d6\u04cb\u0483\u0481\u0497\u04f5\u0496\u04e9", "\u07b0\u07a6\u07ae\u07b3\u07f7\u07fb\u07f9\u07ef\u078d\u07ee\u0791", "\u038d\u039b\u0393\u038e\u03c6\u03c4\u03d2\u03b0\u03b3\u03d3\u03ac", "\u07fd\u07f2\u07f5\u07fa\u07f7\u07f2\u07e1\u07fe\u07a7\u07a5\u07b3\u07b2\u07cd"})
public final class Class1673 {
    public static double field6202;
    public static double field6203;
    public static long field6204 = 5668905969345488227L;
    public static double field6205;
    public static float field6206;
    public static float field6207;

    private static String NedbzXRJb85t0etu(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6205 = Double.longBitsToDouble(4596922139335128508L);
        y\u200e = "Descriptions";
        field6202 = Double.longBitsToDouble(4602607479449089710L);
        field6203 = Double.longBitsToDouble(4606218576582270592L);
        ac\u200e = "Save your kit";
        field6206 = Float.intBitsToFloat(1055227926);
        field6207 = Float.intBitsToFloat(1064357642);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite AiOAyut2DzWnyB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1673.NedbzXRJb85t0etu(k2, 1192978405));
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
                int a2 = Integer.parseInt(Class1673.NedbzXRJb85t0etu(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1673.NedbzXRJb85t0etu(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1673.NedbzXRJb85t0etu(k2, 1192978405) + " " + l2 + " " + m2);
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

