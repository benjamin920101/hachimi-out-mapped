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

@HACHIMI_CLIENT(mv=100, d1={"\u308e\u3080\u308e\u308a\u308a\u3089\u308b\u308e", "\ub23d\ub238\ub23b\ub23b\ub23e\ub237\ub23f\ub23c", "\ub68c\ub689\ub68b\ub684\ub68a\ub685\ub68d\ub68e", "\u25d7\u25d0\u25d0\u25d4\u25d8\u25d7\u25d2\u25d8", "\u5199\u5192\u519b\u5193\u519f\u519c\u5199\u5198", "\uafd8\uafd8\uafd7\uafd8\uafdb\uafdb\uafd6", "\uc775\uc772\uc774\uc776\uc771\uc771\uc776\uc778", "\ua217\ua214\ua217\ua211\ua216\ua21d\ua215\ua214", "\u4179\u417c\u417a\u417f\u417b\u417b\u4177\u417e", "\uac32\uac31\uac32\uac35\uac32\uac36\uac3d\uac37", "\u8e9e\u8e99\u8e9f\u8e98\u8e94\u8e9e\u8e98\u8e95", "\u2e04\u2e00\u2e0e\u2e03\u2e0e\u2e01\u2e03\u2e07", "\u1ec0\u1ec5\u1ec6\u1ec6\u1ec5\u1ec7\u1ec2\u1ecc", "\ub402\ub402\ub40b\ub400\ub40b\ub407\ub402\ub404", "\u9c9a\u9c9f\u9c9b\u9c92\u9c92\u9c9a\u9c93", "\uc2ff\uc2f8\uc2fb\uc2f8\uc2f4\uc2fe\uc2fa\uc2f4"}, d2={"\u0398\u039d\u0389\u23e6\u03d4\u03d6\u03c0\u03a4\u0382\u0389\u039e\u0389\u03c7\u0384\u0389\u0386\u038f\u03c7\u03bb\u039c\u039a\u0381\u0386\u038f\u03d3\u03c1\u03a4\u0382\u0389\u039e\u0389\u03c7\u0384\u0389\u0386\u038f\u03c7\u03bb\u039c\u039a\u0381\u0386\u038f\u03d3", "\u023d\u0238\u022f\u2243\u0271\u0273\u0265\u0201\u0227\u022c\u023b\u022c\u0262\u0221\u022c\u0223\u022a\u0262\u021e\u0239\u023f\u0224\u0223\u022a\u0276\u0264\u0201\u0227\u022c\u023b\u022c\u0262\u0221\u022c\u0223\u022a\u0262\u021e\u0239\u023f\u0224\u0223\u022a\u0276", "\u01f5\u01aa\u01a5\u01a0\u01a7\u01a0\u01bd\u01f7\u01f5\u01f7\u01e1\u01e0\u019f", "\u0569\u053c\u053b\u053c\u0521\u056b\u0569\u056b\u057d\u057c\u0503", "\u06d8\u06da\u06cb\u06fc\u06d3\u06de\u06cc\u06cc\u0683\u0681\u0697\u0696\u06f3\u06d5\u06de\u06c9\u06de\u0690\u06d3\u06de\u06d1\u06d8\u0690\u06fc\u06d3\u06de\u06cc\u06cc\u0684", "\u0346\u034f\u035d\u0346\u036d\u0341\u034a\u034b\u0312\u0310\u0306\u0307\u0367", "\u0431\u0425\u0421\u0435\u0438\u0427\u0468\u046a\u047c\u0418\u043e\u0435\u0422\u0435\u047b\u0438\u0435\u043a\u0433\u047b\u041b\u0436\u043e\u0431\u0437\u0420\u046f\u047d\u040e", "\u04cf\u04c0\u04c3\u04c2\u04c9\u0490\u0492\u0484\u0485\u04e0\u04c6\u04cd\u04da\u04cd\u0483\u04c0\u04cd\u04c2\u04cb\u0483\u04e3\u04ce\u04c6\u04c9\u04cf\u04d8\u0497", "\u00da\u00c1\u00fd\u00da\u00dc\u00c7\u00c0\u00c9\u0092\u0090\u0086\u0087\u00e2\u00c4\u00cf\u00d8\u00cf\u0081\u00c2\u00cf\u00c0\u00c9\u0081\u00fd\u00da\u00dc\u00c7\u00c0\u00c9\u0095", "}|gzuj/-;:E", "\u041a\u041b\u0400\u041d\u0412\u040d\u0435\u0418\u0418\u0448\u044a\u045c\u045d\u0422", "\u071f\u0709\u0701\u071c\u0754\u0756\u0740\u0741\u073e", "\u04eb\u04fd\u04f5\u04e8\u04a0\u04a2\u04b4\u04d6\u04b5\u04ca", "\u05e6\u05f0\u05f8\u05e5\u05a1\u05ad\u05af\u05b9\u05db\u05b8\u05c7", "\u0411\u0407\u040f\u0412\u045a\u0458\u044e\u042c\u042f\u044f\u0430", "\u0150\u015f\u0158\u0157\u015a\u015f\u014c\u0153\u010a\u0108\u011e\u011f\u0160"})
public final class Class3962 {
    public static double field9021;
    public static float field9022 = 0.75121623f;
    public static float field9023 = 0.65710306f;
    public static double field9024;
    public static float field9025;

    /*
     * WARNING - void declaration
     */
    private static CallSite nLEq05WqVLw5EU(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3962.iFagn2AGXTTcTrwN(k2, -763450468));
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
                int a2 = Integer.parseInt(Class3962.iFagn2AGXTTcTrwN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3962.iFagn2AGXTTcTrwN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3962.iFagn2AGXTTcTrwN(k2, -763450468) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String iFagn2AGXTTcTrwN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        S\u200e = "\u00a77";
        field9021 = Double.longBitsToDouble(4597077148908124644L);
        az\u200e = "";
        field9025 = Float.intBitsToFloat(1062632342);
        field9024 = Double.longBitsToDouble(4602214081453858876L);
    }
}

