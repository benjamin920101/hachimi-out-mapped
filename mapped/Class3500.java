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

@HACHIMI_CLIENT(mv=100, d1={"\u1ad3\u1adc\u1ad7\u1ad4\u1ad7\u1ad4\u1ad4\u1adc", "\u1483\u1487\u1484\u148d\u1487\u148d\u1485\u148c", "\u5b37\u5b37\u5b34\u5b36\u5b33\u5b35\u5b33\u5b35", "\u3d6e\u3d6e\u3d6d\u3d65\u3d6f\u3d6d\u3d6b", "\uaecf\uaecf\uaece\uaec2\uaec8\uaecf\uaec8\uaeca", "\u6e33\u6e38\u6e31\u6e34\u6e34\u6e36\u6e34\u6e30", "\u4c2d\u4c29\u4c21\u4c2d\u4c2b\u4c29\u4c20\u4c2c", "\u0ec7\u0ec6\u0ec7\u0ec3\u0ec0\u0ec0\u0ec7", "\u0756\u0757\u075e\u0751\u0757\u0754\u075f\u0754", "\u844a\u844c\u844a\u8448\u844a\u8449\u8449\u844d", "\u7da5\u7da4\u7daf\u7da0\u7da1\u7da7\u7da1\u7da7", "\ubb35\ubb32\ubb31\ubb31\ubb3d\ubb35\ubb31", "\u274f\u274f\u274a\u274c\u274c\u274e\u2749\u274a", "\u9e1b\u9e1f\u9e10\u9e1d\u9e11\u9e19\u9e10\u9e1b", "\uc388\uc38b\uc38c\uc38c\uc38e\uc389\uc38e\uc38c", "\ucd40\ucd45\ucd42\ucd44\ucd47\ucd44\ucd42\ucd40", "\u2876\u287d\u2870\u287d\u2875\u2874\u2876\u2877"}, d2={"\u0161\u0167\u0175\u211f\u012d\u012f\u0139\u015d\u017b\u0170\u0167\u0170\u013e\u017d\u0170\u017f\u0176\u013e\u0142\u0165\u0163\u0178\u017f\u0176\u012a\u0138\u015d\u017b\u0170\u0167\u0170\u013e\u017d\u0170\u017f\u0176\u013e\u0142\u0165\u0163\u0178\u017f\u0176\u012a", "\u02e6\u02e0\u02f3\u2298\u02aa\u02a8\u02be\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad\u02bf\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02c5\u02e2\u02e4\u02ff\u02f8\u02f1\u02ad", "\u0015\u0013\u0003\u206bY[M)\u000f\u0004\u0013\u0004J\t\u0004\u000b\u0002J6\u0011\u0017\f\u000b\u0002^L)\u000f\u0004\u0013\u0004J\t\u0004\u000b\u0002J6\u0011\u0017\f\u000b\u0002^", "\u008a\u00d5\u00da\u00df\u00d8\u00df\u00c2\u0088\u008a\u0088\u009e\u009f\u00e0", "\u0488\u04dd\u04da\u04dd\u04c0\u048a\u0488\u048a\u049c\u049d\u04e2", "\u014b\u0149\u0158\u016f\u0140\u014d\u015f\u015f\u0110\u0112\u0104\u0105\u0160\u0146\u014d\u015a\u014d\u0103\u0140\u014d\u0142\u014b\u0103\u016f\u0140\u014d\u015f\u015f\u0117", "\u057e\u0577\u0565\u057e\u0555\u0579\u0572\u0573\u052a\u0528\u053e\u053f\u055f", "\u00e5\u00f1\u00f5\u00e1\u00ec\u00f3\u00bc\u00be\u00a8\u00cc\u00ea\u00e1\u00f6\u00e1\u00af\u00ec\u00e1\u00ee\u00e7\u00af\u00cf\u00e2\u00ea\u00e5\u00e3\u00f4\u00bb\u00a9\u00da", "\u0263\u026c\u026f\u026e\u0265\u023c\u023e\u0228\u0229\u024c\u026a\u0261\u0276\u0261\u022f\u026c\u0261\u026e\u0267\u022f\u024f\u0262\u026a\u0265\u0263\u0274\u023b", "\u00fb\u00e0\u00dc\u00fb\u00fd\u00e6\u00e1\u00e8\u00b3\u00b1\u00a7\u00a6\u00c3\u00e5\u00ee\u00f9\u00ee\u00a0\u00e3\u00ee\u00e1\u00e8\u00a0\u00dc\u00fb\u00fd\u00e6\u00e1\u00e8\u00b4", "\u00e6\u00e7\u00fc\u00e1\u00ee\u00f1\u00b4\u00b6\u00a0\u00a1\u00de", "\u015c\u015d\u0146\u015b\u0154\u014b\u0173\u015e\u015e\u010e\u010c\u011a\u011b\u0164", "\u02b4\u02a2\u02aa\u02b7\u02ff\u02fd\u02eb\u02ea\u0295", "\u06e6\u06f0\u06f8\u06e5\u06ad\u06af\u06b9\u06db\u06b8\u06c7", "\u0678\u066e\u0666\u067b\u063f\u0633\u0631\u0627\u0645\u0626\u0659", "\u060b\u061d\u0615\u0608\u0640\u0642\u0654\u0636\u0635\u0655\u062a", "\u0259\u0256\u0251\u025e\u0253\u0256\u0245\u025a\u0203\u0201\u0217\u0216\u0269"})
public final class Class3500 {
    public static float field7702 = Float.intBitsToFloat(1052454106);
    public static float field7703 = 0.7549126f;
    public static double field7704;
    public static float field7705;
    public static double field7706;

    static {
        U\u200e = "Rotate before placing and breaking";
        as\u200e = "Calculates fall damage sources";
        field7704 = Double.longBitsToDouble(4596136048266393508L);
        field7706 = Double.longBitsToDouble(4605230174819857741L);
        field7705 = Float.intBitsToFloat(1059986865);
        bf\u200e = "Faster outline calculations";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite D3D03KeB5asGqu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3500.aXJqil1kdM77R7gL(k2, 849842204));
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
                int a2 = Integer.parseInt(Class3500.aXJqil1kdM77R7gL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3500.aXJqil1kdM77R7gL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3500.aXJqil1kdM77R7gL(k2, 849842204) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String aXJqil1kdM77R7gL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 49279 : 49278;
            block5: while (true) {
                switch (n2) {
                    case 49279: {
                        n2 = 49277;
                        continue block5;
                    }
                    case 49278: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

