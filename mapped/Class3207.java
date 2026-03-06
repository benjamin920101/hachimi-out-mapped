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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u39d6\u39d5\u39d5\u39d1\u39d3\u39d1\u39d1\u39d1", "\u3e9b\u3e99\u3e9d\u3e90\u3e99\u3e9a\u3e9d\u3e98", "\u6b8e\u6b8d\u6b8c\u6b8b\u6b8e\u6b89\u6b8f\u6b8e", "\ua183\ua185\ua188\ua188\ua184\ua186\ua186\ua187", "\u4e4e\u4e49\u4e4d\u4e49\u4e4f\u4e4d\u4e48\u4e4a", "\uc4e4\uc4e2\uc4e0\uc4ef\uc4e3\uc4e2\uc4ee\uc4e6", "\u2af3\u2af2\u2af5\u2afe\u2af0\u2af2\u2aff\u2af7", "\ub029\ub022\ub02f\ub02d\ub02d\ub029\ub02f\ub02a", "\u2b36\u2b33\u2b36\u2b31\u2b35\u2b32\u2b3d\u2b36", "\u02a4\u02a1\u02a9\u02a1\u02a3\u02a6\u02a6\u02a9", "\u6841\u6845\u6848\u6840\u6849\u6843\u6844\u6841", "\ub11b\ub118\ub11e\ub11c\ub114\ub115\ub11f\ub114", "\ubc80\ubc80\ubc87\ubc83\ubc8b\ubc83\ubc87", "\u05d9\u05d9\u05dd\u05db\u05da\u05dd\u05dd\u05dc", "\u3388\u338b\u338d\u3384\u338e\u3388\u338b", "\u0965\u0960\u0960\u0965\u0961\u0965\u096c\u0966"}, d2={"\u0366\u037e\u0356\u2319\u032b\u0329\u033f\u035b\u037d\u0376\u0361\u0376\u0338\u037b\u0376\u0379\u0370\u0338\u0344\u0363\u0365\u037e\u0379\u0370\u032c\u033e\u035b\u037d\u0376\u0361\u0376\u0338\u037b\u0376\u0379\u0370\u0338\u0344\u0363\u0365\u037e\u0379\u0370\u032c", "\u02e8\u02f0\u02db\u2297\u02a5\u02a7\u02b1\u02d5\u02f3\u02f8\u02ef\u02f8\u02b6\u02f5\u02f8\u02f7\u02fe\u02b6\u02ca\u02ed\u02eb\u02f0\u02f7\u02fe\u02a2\u02b0\u02d5\u02f3\u02f8\u02ef\u02f8\u02b6\u02f5\u02f8\u02f7\u02fe\u02b6\u02ca\u02ed\u02eb\u02f0\u02f7\u02fe\u02a2", "\u05c7\u0598\u0597\u0592\u0595\u0592\u058f\u05c5\u05c7\u05c5\u05d3\u05d2\u05ad", "\u0568\u053d\u053a\u053d\u0520\u056a\u0568\u056a\u057c\u057d\u0502", "\u046f\u046d\u047c\u044b\u0464\u0469\u047b\u047b\u0434\u0436\u0420\u0421\u0444\u0462\u0469\u047e\u0469\u0427\u0464\u0469\u0466\u046f\u0427\u044b\u0464\u0469\u047b\u047b\u0433", "\u076c\u0765\u0777\u076c\u0747\u076b\u0760\u0761\u0738\u073a\u072c\u072d\u074d", "\u06a0\u06b4\u06b0\u06a4\u06a9\u06b6\u06f9\u06fb\u06ed\u0689\u06af\u06a4\u06b3\u06a4\u06ea\u06a9\u06a4\u06ab\u06a2\u06ea\u068a\u06a7\u06af\u06a0\u06a6\u06b1\u06fe\u06ec\u069f", "\u0312\u031d\u031e\u031f\u0314\u034d\u034f\u0359\u0358\u033d\u031b\u0310\u0307\u0310\u035e\u031d\u0310\u031f\u0316\u035e\u033e\u0313\u031b\u0314\u0312\u0305\u034a", "\u010b\u0110\u012c\u010b\u010d\u0116\u0111\u0118\u0143\u0141\u0157\u0156\u0133\u0115\u011e\u0109\u011e\u0150\u0113\u011e\u0111\u0118\u0150\u012c\u010b\u010d\u0116\u0111\u0118\u0144", "\u00eb\u00ea\u00f1\u00ec\u00e3\u00fc\u00b9\u00bb\u00ad\u00ac\u00d3", "\u05ea\u05eb\u05f0\u05ed\u05e2\u05fd\u05c5\u05e8\u05e8\u05b8\u05ba\u05ac\u05ad\u05d2", "\u062a\u063c\u0634\u0629\u0661\u0663\u0675\u0674\u060b", "\u0612\u0604\u060c\u0611\u0659\u065b\u064d\u062f\u064c\u0633", "\u07bb\u07ad\u07a5\u07b8\u07fc\u07f0\u07f2\u07e4\u0786\u07e5\u079a", "\u0577\u0561\u0569\u0574\u053c\u053e\u0528\u054a\u0549\u0529\u0556", "\u021b\u0214\u0213\u021c\u0211\u0214\u0207\u0218\u0241\u0243\u0255\u0254\u022b"})
public final class Class3207 {
    public static int field6879 = 105923764;
    public static int field6880 = 1065550159;
    public static double field6881;
    public static float field6882;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 1jFe7CUCnOiaI9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3207.tlbMPU3comeUB7N7(k2, 1917481971));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3207.tlbMPU3comeUB7N7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 40180 : 40179;
            block7: while (true) {
                switch (n3) {
                    case 40180: {
                        n3 = 40178;
                        continue block7;
                    }
                    case 40179: {
                        String c2 = Class3207.tlbMPU3comeUB7N7(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3207.tlbMPU3comeUB7N7(k2, 1917481971) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        d\u200e = "Scaffolding";
        field6881 = Double.longBitsToDouble(4593887158966767240L);
        field6882 = Float.intBitsToFloat(1042142008);
        bf\u200e = "Renders where scaffold is placing blocks";
    }

    private static String tlbMPU3comeUB7N7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

