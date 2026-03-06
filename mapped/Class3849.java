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

@HACHIMI_CLIENT(mv=100, d1={"\u83b6\u83ba\u83ba\u83b7\u83bb\u83b3\u83b3\u83ba", "\uc686\uc68d\uc687\uc681\uc686\uc68d\uc685\uc686", "\u543d\u543d\u5439\u543d\u543e\u5439\u5436\u543e", "\u1daf\u1da9\u1da8\u1daf\u1da9\u1da8\u1dad\u1dae", "\u99bb\u99b9\u99bb\u99b8\u99be\u99bf\u99ba\u99b1", "\u0f48\u0f4b\u0f45\u0f48\u0f4b\u0f4f\u0f48\u0f45", "\ub766\ub765\ub763\ub760\ub76c\ub767\ub766\ub764", "\ub8b5\ub8b6\ub8b2\ub8b4\ub8b7\ub8b5\ub8b6\ub8be", "\u648c\u6483\u6482\u6482\u648c\u648b\u648e\u648d", "\uaf44\uaf42\uaf44\uaf47\uaf45\uaf41\uaf41\uaf44", "\u267b\u267b\u2679\u2678\u2678\u267a\u267a\u2678", "\u7e3b\u7e3d\u7e3b\u7e39\u7e3a\u7e3e\u7e3f\u7e3d", "\u87e6\u87ec\u87e0\u87e7\u87e4\u87e5\u87e3\u87e1", "\uc174\uc177\uc173\uc179\uc177\uc172\uc178\uc177", "\u6285\u6281\u628b\u6286\u6284\u628a\u6283\u6281", "\u2c72\u2c72\u2c71\u2c7f\u2c7e\u2c77\u2c7f\u2c7e"}, d2={"\u0722\u0708\u073a\u275c\u076e\u076c\u077a\u071e\u0738\u0733\u0724\u0733\u077d\u073e\u0733\u073c\u0735\u077d\u0701\u0726\u0720\u073b\u073c\u0735\u0769\u077b\u071e\u0738\u0733\u0724\u0733\u077d\u073e\u0733\u073c\u0735\u077d\u0701\u0726\u0720\u073b\u073c\u0735\u0769", "\u069b\u06b1\u0682\u26e5\u06d7\u06d5\u06c3\u06a7\u0681\u068a\u069d\u068a\u06c4\u0687\u068a\u0685\u068c\u06c4\u06b8\u069f\u0699\u0682\u0685\u068c\u06d0\u06c2\u06a7\u0681\u068a\u069d\u068a\u06c4\u0687\u068a\u0685\u068c\u06c4\u06b8\u069f\u0699\u0682\u0685\u068c\u06d0", "#|svqvk!#!76I", "\u03af\u03fa\u03fd\u03fa\u03e7\u03ad\u03af\u03ad\u03bb\u03ba\u03c5", "\u034b\u0349\u0358\u036f\u0340\u034d\u035f\u035f\u0310\u0312\u0304\u0305\u0360\u0346\u034d\u035a\u034d\u0303\u0340\u034d\u0342\u034b\u0303\u036f\u0340\u034d\u035f\u035f\u0317", "\u06c5\u06cc\u06de\u06c5\u06ee\u06c2\u06c9\u06c8\u0691\u0693\u0685\u0684\u06e4", "\u026e\u027a\u027e\u026a\u0267\u0278\u0237\u0235\u0223\u0247\u0261\u026a\u027d\u026a\u0224\u0267\u026a\u0265\u026c\u0224\u0244\u0269\u0261\u026e\u0268\u027f\u0230\u0222\u0251", "\u04d5\u04da\u04d9\u04d8\u04d3\u048a\u0488\u049e\u049f\u04fa\u04dc\u04d7\u04c0\u04d7\u0499\u04da\u04d7\u04d8\u04d1\u0499\u04f9\u04d4\u04dc\u04d3\u04d5\u04c2\u048d", "\u056c\u0577\u054b\u056c\u056a\u0571\u0576\u057f\u0524\u0526\u0530\u0531\u0554\u0572\u0579\u056e\u0579\u0537\u0574\u0579\u0576\u057f\u0537\u054b\u056c\u056a\u0571\u0576\u057f\u0523", "\u00d6\u00d7\u00cc\u00d1\u00de\u00c1\u0084\u0086\u0090\u0091\u00ee", "\u02d1\u02d0\u02cb\u02d6\u02d9\u02c6\u02fe\u02d3\u02d3\u0283\u0281\u0297\u0296\u02e9", "\u0557\u0541\u0549\u0554\u051c\u051e\u0508\u0509\u0576", "\u0241\u0257\u025f\u0242\u020a\u0208\u021e\u027c\u021f\u0260", "\u0432\u0424\u042c\u0431\u0475\u0479\u047b\u046d\u040f\u046c\u0413", "\u07ff\u07e9\u07e1\u07fc\u07b4\u07b6\u07a0\u07c2\u07c1\u07a1\u07de", "\u02ed\u02e2\u02e5\u02ea\u02e7\u02e2\u02f1\u02ee\u02b7\u02b5\u02a3\u02a2\u02dd"})
public final class Class3849 {
    public static double field8721 = Double.longBitsToDouble(4601592628976963518L);
    public static double field8722 = 0.860223919975597;
    public static int field8723 = 1082462502;

    /*
     * WARNING - void declaration
     */
    private static CallSite nPKajSsrNQwNtY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3849.n20e777LFarIZnjk(k2, 2027426932));
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
                int a2 = Integer.parseInt(Class3849.n20e777LFarIZnjk(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3849.n20e777LFarIZnjk(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3849.n20e777LFarIZnjk(k2, 2027426932) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String n20e777LFarIZnjk(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        J\u200e = "InAirTarget";
        bD\u200e = "baritone";
    }
}

