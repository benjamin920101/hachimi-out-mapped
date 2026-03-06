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

@HACHIMI_CLIENT(mv=100, d1={"\u076b\u0760\u0760\u076f\u076f\u076f", "\u251f\u2518\u2517\u2516\u251d\u251c\u2518\u251d", "\u3f4c\u3f4b\u3f49\u3f49\u3f40\u3f4c\u3f48\u3f49", "\ua29c\ua295\ua29e\ua295\ua298\ua29f\ua29d\ua29c", "\u9e63\u9e62\u9e64\u9e66\u9e63\u9e64\u9e65\u9e64", "\u823e\u8230\u8230\u823f\u8236\u8233\u8237", "\u263e\u263d\u263f\u263e\u2638\u263e\u263e\u263c", "\u8cc6\u8cc7\u8cc2\u8cc2\u8cc0\u8ccb\u8cc0\u8cca", "\ubef1\ubef5\ubef3\ubef4\ubef3\ubef7\ubefc", "\u5b30\u5b36\u5b34\u5b3f\u5b32\u5b3f\u5b3e\u5b30", "\u3fa2\u3fa7\u3fa4\u3fa3\u3fa5\u3fa6\u3fa0\u3fa5", "\u1fe7\u1fe2\u1fe5\u1fe2\u1fe6\u1feb\u1fe3", "\u9ee1\u9ee9\u9ee1\u9ee9\u9ee1\u9eef\u9ee9", "\u83b2\u83b2\u83b5\u83b2\u83b2\u83b6\u83b1\u83be", "\ubf87\ubf83\ubf83\ubf83\ubf87\ubf84\ubf89\ubf80", "\u3fb7\u3fb7\u3fb2\u3fb1\u3fb2\u3fb0\u3fb8\u3fb9"}, d2={"\u0473\u0478\u044c\u2417\u0425\u0427\u0431\u0455\u0473\u0478\u046f\u0478\u0436\u0475\u0478\u0477\u047e\u0436\u044a\u046d\u046b\u0470\u0477\u047e\u0422\u0430\u0455\u0473\u0478\u046f\u0478\u0436\u0475\u0478\u0477\u047e\u0436\u044a\u046d\u046b\u0470\u0477\u047e\u0422", "\u0675\u067e\u0649\u2611\u0623\u0621\u0637\u0653\u0675\u067e\u0669\u067e\u0630\u0673\u067e\u0671\u0678\u0630\u064c\u066b\u066d\u0676\u0671\u0678\u0624\u0636\u0653\u0675\u067e\u0669\u067e\u0630\u0673\u067e\u0671\u0678\u0630\u064c\u066b\u066d\u0676\u0671\u0678\u0624", "\u00ab\u00f4\u00fb\u00fe\u00f9\u00fe\u00e3\u00a9\u00ab\u00a9\u00bf\u00be\u00c1", "\u0371\u0324\u0323\u0324\u0339\u0373\u0371\u0373\u0365\u0364\u031b", "\u03e2\u03e0\u03f1\u03c6\u03e9\u03e4\u03f6\u03f6\u03b9\u03bb\u03ad\u03ac\u03c9\u03ef\u03e4\u03f3\u03e4\u03aa\u03e9\u03e4\u03eb\u03e2\u03aa\u03c6\u03e9\u03e4\u03f6\u03f6\u03be", "\u058e\u0587\u0595\u058e\u05a5\u0589\u0582\u0583\u05da\u05d8\u05ce\u05cf\u05af", "\u06ec\u06f8\u06fc\u06e8\u06e5\u06fa\u06b5\u06b7\u06a1\u06c5\u06e3\u06e8\u06ff\u06e8\u06a6\u06e5\u06e8\u06e7\u06ee\u06a6\u06c6\u06eb\u06e3\u06ec\u06ea\u06fd\u06b2\u06a0\u06d3", "\u046b\u0464\u0467\u0466\u046d\u0434\u0436\u0420\u0421\u0444\u0462\u0469\u047e\u0469\u0427\u0464\u0469\u0466\u046f\u0427\u0447\u046a\u0462\u046d\u046b\u047c\u0433", "\u020a\u0211\u022d\u020a\u020c\u0217\u0210\u0219\u0242\u0240\u0256\u0257\u0232\u0214\u021f\u0208\u021f\u0251\u0212\u021f\u0210\u0219\u0251\u022d\u020a\u020c\u0217\u0210\u0219\u0245", "\u05b0\u05b1\u05aa\u05b7\u05b8\u05a7\u05e2\u05e0\u05f6\u05f7\u0588", "\u0416\u0417\u040c\u0411\u041e\u0401\u0439\u0414\u0414\u0444\u0446\u0450\u0451\u042e", "\u07dd\u07cb\u07c3\u07de\u0796\u0794\u0782\u0783\u07fc", "\u07c5\u07d3\u07db\u07c6\u078e\u078c\u079a\u07f8\u079b\u07e4", "\u026d\u027b\u0273\u026e\u022a\u0226\u0224\u0232\u0250\u0233\u024c", "\u0388\u039e\u0396\u038b\u03c3\u03c1\u03d7\u03b5\u03b6\u03d6\u03a9", "\u0365\u036a\u036d\u0362\u036f\u036a\u0379\u0366\u033f\u033d\u032b\u032a\u0355"})
public final class Class1270 {
    public static int field4964 = 1;
    public static float field4965;
    public static float field4966;
    public static float field4967;
    public static float field4968 = 0.7348869f;

    /*
     * WARNING - void declaration
     */
    private static CallSite MXyxVrDmviR9ST(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1270.JUwokNVAHlkp4Wfn(k2, 1029409313));
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
                int a2 = Integer.parseInt(Class1270.JUwokNVAHlkp4Wfn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1270.JUwokNVAHlkp4Wfn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1270.JUwokNVAHlkp4Wfn(k2, 1029409313) + " " + l2 + " " + m2);
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
        field4966 = Float.intBitsToFloat(1057919749);
        field4965 = Float.intBitsToFloat(1059564036);
        field4967 = Float.intBitsToFloat(1063930107);
        be\u200e = "Place";
        bo\u200e = "Only attempts criticals when phased";
    }

    private static String JUwokNVAHlkp4Wfn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

