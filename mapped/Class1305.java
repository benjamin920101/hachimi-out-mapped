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
@HACHIMI_CLIENT(mv=100, d1={"\ue2d6\ue2d7\ue2d2\ue2d3\ue2d7\ue2d6\ue2d6\ue2de", "\ub830\ub837\ub830\ub83b\ub83b\ub830\ub835\ub836", "\ue291\ue290\ue295\ue294\ue29f\ue294\ue296\ue29e", "\u6d7b\u6d7c\u6d7a\u6d7d\u6d76\u6d7f\u6d7a\u6d7c", "\u2733\u2731\u2736\u2736\u2730\u2736\u2735\u273f", "\udd89\udd8d\udd8e\udd8e\udd82\udd8d\udd89\udd83", "\u6ab2\u6ab9\u6ab9\u6ab2\u6ab4\u6ab8\u6ab7\u6ab8", "\u3bb4\u3bb1\u3bb4\u3bb0\u3bb8\u3bb4\u3bb7\u3bb8", "\u1ea1\u1ea6\u1ea0\u1ea0\u1ea1\u1eac\u1ea5", "\u3992\u3993\u3990\u3996\u3993\u3993\u3991\u3991", "\u298a\u298b\u2989\u298e\u298f\u298f\u2983\u298c", "\ub8ca\ub8c9\ub8c9\ub8c9\ub8cd\ub8cc\ub8cb\ub8cd", "\u30bd\u30bb\u30b6\u30be\u30b8\u30bf\u30b6\u30b9", "\u2a1e\u2a1c\u2a18\u2a1b\u2a1c\u2a1d\u2a1e\u2a1f", "\uc03d\uc038\uc03f\uc03a\uc03e\uc039\uc03e\uc036", "\u1125\u1125\u1124\u1126\u1126\u1120\u1125\u1123", "\uda98\uda9a\uda9f\uda9e\uda9d\uda9a\uda9d\uda9c"}, d2={"\u02f2\u02df\u02e3\u2298\u02aa\u02a8\u02be\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad\u02bf\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad", "\u0751\u077c\u0743\u273b\u0709\u070b\u071d\u0779\u075f\u0754\u0743\u0754\u071a\u0759\u0754\u075b\u0752\u071a\u0766\u0741\u0747\u075c\u075b\u0752\u070e\u071c\u0779\u075f\u0754\u0743\u0754\u071a\u0759\u0754\u075b\u0752\u071a\u0766\u0741\u0747\u075c\u075b\u0752\u070e", "\u00a2\u008f\u00b1\u20c8\u00fa\u00f8\u00ee\u008a\u00ac\u00a7\u00b0\u00a7\u00e9\u00aa\u00a7\u00a8\u00a1\u00e9\u0095\u00b2\u00b4\u00af\u00a8\u00a1\u00fd\u00ef\u008a\u00ac\u00a7\u00b0\u00a7\u00e9\u00aa\u00a7\u00a8\u00a1\u00e9\u0095\u00b2\u00b4\u00af\u00a8\u00a1\u00fd", "\u066c\u0633\u063c\u0639\u063e\u0639\u0624\u066e\u066c\u066e\u0678\u0679\u0606", "\u0412\u0447\u0440\u0447\u045a\u0410\u0412\u0410\u0406\u0407\u0478", "\u02e1\u02e3\u02f2\u02c5\u02ea\u02e7\u02f5\u02f5\u02ba\u02b8\u02ae\u02af\u02ca\u02ec\u02e7\u02f0\u02e7\u02a9\u02ea\u02e7\u02e8\u02e1\u02a9\u02c5\u02ea\u02e7\u02f5\u02f5\u02bd", "\u0555\u055c\u054e\u0555\u057e\u0552\u0559\u0558\u0501\u0503\u0515\u0514\u0574", "\u0247\u0253\u0257\u0243\u024e\u0251\u021e\u021c\u020a\u026e\u0248\u0243\u0254\u0243\u020d\u024e\u0243\u024c\u0245\u020d\u026d\u0240\u0248\u0247\u0241\u0256\u0219\u020b\u0278", "\u0193\u019c\u019f\u019e\u0195\u01cc\u01ce\u01d8\u01d9\u01bc\u019a\u0191\u0186\u0191\u01df\u019c\u0191\u019e\u0197\u01df\u01bf\u0192\u019a\u0195\u0193\u0184\u01cb", "\u039c\u0387\u03bb\u039c\u039a\u0381\u0386\u038f\u03d4\u03d6\u03c0\u03c1\u03a4\u0382\u0389\u039e\u0389\u03c7\u0384\u0389\u0386\u038f\u03c7\u03bb\u039c\u039a\u0381\u0386\u038f\u03d3", "\u0266\u0267\u027c\u0261\u026e\u0271\u0234\u0236\u0220\u0221\u025e", "\u04cf\u04ce\u04d5\u04c8\u04c7\u04d8\u04e0\u04cd\u04cd\u049d\u049f\u0489\u0488\u04f7", "\u06fb\u06ed\u06e5\u06f8\u06b0\u06b2\u06a4\u06a5\u06da", "\u01d1\u01c7\u01cf\u01d2\u019a\u0198\u018e\u01ec\u018f\u01f0", "\u059d\u058b\u0583\u059e\u05da\u05d6\u05d4\u05c2\u05a0\u05c3\u05bc", "\u02b7\u02a1\u02a9\u02b4\u02fc\u02fe\u02e8\u028a\u0289\u02e9\u0296", "\u04b9\u04b6\u04b1\u04be\u04b3\u04b6\u04a5\u04ba\u04e3\u04e1\u04f7\u04f6\u0489"})
public final class Class1305 {
    public static double field5068 = 0.401801739652895;
    public static float field5069;
    public static double field5070;

    private static String aEnVZwGNnWMpIAVW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 0g4FSeAODiwOY4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1305.aEnVZwGNnWMpIAVW(k2, -2057458809));
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
                int a2 = Integer.parseInt(Class1305.aEnVZwGNnWMpIAVW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1305.aEnVZwGNnWMpIAVW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 16945 : 16946;
        block11: while (true) {
            switch (n3) {
                case 16946: {
                    n3 = 16944;
                    continue block11;
                }
                case 16945: {
                    throw new Exception("Can't find method in " + Class1305.aEnVZwGNnWMpIAVW(k2, -2057458809) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 != 1 ? 3527 : 3526;
        block12: while (true) {
            switch (n4) {
                case 3527: {
                    n4 = 3525;
                    continue block12;
                }
                case 3526: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        m\u200e = "night_vision";
        field5069 = Float.intBitsToFloat(1100480512);
        aI\u200e = "Removes sprint reset when attacking";
        field5070 = Double.longBitsToDouble(4603528105980918783L);
        bj\u200e = "DEFAULT";
    }
}

