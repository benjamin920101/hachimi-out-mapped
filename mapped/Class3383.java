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

@HACHIMI_CLIENT(mv=100, d1={"\u837b\u837a\u837a\u837e\u8370\u8370\u837c\u837a", "\u31cd\u31cc\u31cf\u31c2\u31cb\u31c3\u31cc\u31cd", "\uc12c\uc12f\uc12b\uc127\uc12c\uc12f\uc129\uc129", "\u052c\u0521\u052a\u052f\u052e\u0528\u052f\u052c", "\ub960\ub963\ub96c\ub96d\ub966\ub96c\ub966\ub962", "\u84c5\u84c1\u84cf\u84c7\u84c4\u84c4\u84cf\u84c6", "\u7de2\u7de8\u7de3\u7de9\u7ded\u7ded\u7de3", "\u882f\u882d\u882b\u882b\u882a\u882c\u8826\u882b", "\u9dc9\u9dca\u9dcf\u9dcb\u9dc4\u9dcc\u9dc9\u9dcb", "\uc7a2\uc7a5\uc7ae\uc7a5\uc7a6\uc7a6\uc7a6", "\u029e\u0295\u029f\u029c\u029e\u029b\u029e\u0294", "\u15fb\u15f6\u15f8\u15f6\u15fa\u15fd\u15fc\u15fa", "\ua38a\ua38d\ua38e\ua382\ua383\ua38c\ua38d\ua38a", "\u74b6\u74b7\u74b8\u74bd\u74bd\u74b6\u74b6", "\u0de9\u0dea\u0de7\u0de9\u0de8\u0de7", "\uc89b\uc89c\uc89d\uc89b\uc89c\uc890\uc89f\uc899"}, d2={"\u0434\u0401\u0424\u245d\u046f\u046d\u047b\u041f\u0439\u0432\u0425\u0432\u047c\u043f\u0432\u043d\u0434\u047c\u0400\u0427\u0421\u043a\u043d\u0434\u0468\u047a\u041f\u0439\u0432\u0425\u0432\u047c\u043f\u0432\u043d\u0434\u047c\u0400\u0427\u0421\u043a\u043d\u0434\u0468", "\u064e\u067b\u0651\u2627\u0615\u0617\u0601\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u067a\u065d\u065b\u0640\u0647\u064e\u0612\u0600\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u067a\u065d\u065b\u0640\u0647\u064e\u0612", "\u0316\u0349\u0346\u0343\u0344\u0343\u035e\u0314\u0316\u0314\u0302\u0303\u037c", "\u0088\u00dd\u00da\u00dd\u00c0\u008a\u0088\u008a\u009c\u009d\u00e2", "\u06c8\u06ca\u06db\u06ec\u06c3\u06ce\u06dc\u06dc\u0693\u0691\u0687\u0686\u06e3\u06c5\u06ce\u06d9\u06ce\u0680\u06c3\u06ce\u06c1\u06c8\u0680\u06ec\u06c3\u06ce\u06dc\u06dc\u0694", "\u0673\u067a\u0668\u0673\u0658\u0674\u067f\u067e\u0627\u0625\u0633\u0632\u0652", "\u05c3\u05d7\u05d3\u05c7\u05ca\u05d5\u059a\u0598\u058e\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05e9\u05c4\u05cc\u05c3\u05c5\u05d2\u059d\u058f\u05fc", "\u0252\u025d\u025e\u025f\u0254\u020d\u020f\u0219\u0218\u027d\u025b\u0250\u0247\u0250\u021e\u025d\u0250\u025f\u0256\u021e\u027e\u0253\u025b\u0254\u0252\u0245\u020a", "\u0372\u0369\u0355\u0372\u0374\u036f\u0368\u0361\u033a\u0338\u032e\u032f\u034a\u036c\u0367\u0370\u0367\u0329\u036a\u0367\u0368\u0361\u0329\u0355\u0372\u0374\u036f\u0368\u0361\u033d", "\u0679\u0678\u0663\u067e\u0671\u066e\u062b\u0629\u063f\u063e\u0641", "\u03a2\u03a3\u03b8\u03a5\u03aa\u03b5\u038d\u03a0\u03a0\u03f0\u03f2\u03e4\u03e5\u039a", "\u0176\u0160\u0168\u0175\u013d\u013f\u0129\u0128\u0157", "\u05d2\u05c4\u05cc\u05d1\u0599\u059b\u058d\u05ef\u058c\u05f3", "\u03c0\u03d6\u03de\u03c3\u0387\u038b\u0389\u039f\u03fd\u039e\u03e1", "\u029b\u028d\u0285\u0298\u02d0\u02d2\u02c4\u02a6\u02a5\u02c5\u02ba", "\u077c\u0773\u0774\u077b\u0776\u0773\u0760\u077f\u0726\u0724\u0732\u0733\u074c"})
public final class Class3383 {
    public static float field7352 = Float.intBitsToFloat(1062392377);
    public static float field7353 = Float.intBitsToFloat(1032702848);
    public static double field7354;
    public static float field7355;
    public static float field7356 = 0.92863476f;

    static {
        bp\u200e = "-";
        field7355 = Float.intBitsToFloat(1063193929);
        field7354 = Double.longBitsToDouble(4600878542645237912L);
        bN\u200e = "";
    }

    private static String gg2tVlmg6n9UoT66(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ljZd15pFjbOkB8(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3383.gg2tVlmg6n9UoT66(k2, -1714299049));
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
                int a2 = Integer.parseInt(Class3383.gg2tVlmg6n9UoT66(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3383.gg2tVlmg6n9UoT66(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3383.gg2tVlmg6n9UoT66(k2, -1714299049) + " " + l2 + " " + m2);
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

