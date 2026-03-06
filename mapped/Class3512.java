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

@HACHIMI_CLIENT(mv=100, d1={"\udfbd\udfb1\udfb8\udfb8\udfb0\udfbe\udfbb\udfbd", "\u6fe0\u6fed\u6fe6\u6fe6\u6fe1\u6fec\u6fe6\u6fe7", "\u98dc\u98df\u98df\u98dc\u98dc\u98db\u98d8\u98d9", "\u0979\u0979\u0974\u097b\u097a\u0974\u097c\u097b", "\ubd19\ubd1b\ubd1e\ubd10\ubd1e\ubd11\ubd1f\ubd1f", "\uc70a\uc70a\uc705\uc70f\uc70f\uc709\uc70d\uc709", "\u35b2\u35b6\u35b5\u35b1\u35b6\u35b5\u35b6\u35b1", "\u85a8\u85a2\u85a9\u85a8\u85a9\u85ad\u85ad\u85ad", "\u7120\u7120\u7123\u7120\u7120\u7124\u712d\u7122", "\u22d7\u22d2\u22dc\u22d3\u22d0\u22d3\u22d5\u22d1", "\u1990\u1994\u1995\u1991\u1993\u199c\u1994\u1991", "\u9bfd\u9bf9\u9bf8\u9bf0\u9bf8\u9bfa\u9bfa\u9bf1", "\u6189\u618a\u618c\u618a\u6186\u618f\u618a\u618d", "\u611f\u6118\u6119\u6118\u6118\u611a\u611c\u611b", "\u3698\u369b\u3699\u3693\u369e\u3693\u369f\u369d", "\uab40\uab46\uab42\uab40\uab44\uab45\uab40\uab48", "\uad83\uad82\uad80\uad82\uad87\uad83\uad81"}, d2={"\u0308\u0339\u030d\u2367\u0355\u0357\u0341\u0325\u0303\u0308\u031f\u0308\u0346\u0305\u0308\u0307\u030e\u0346\u033a\u031d\u031b\u0300\u0307\u030e\u0352\u0340\u0325\u0303\u0308\u031f\u0308\u0346\u0305\u0308\u0307\u030e\u0346\u033a\u031d\u031b\u0300\u0307\u030e\u0352", "?\u000e;\u2050b`v\u00124?(?q2?09q\r*,709ew\u00124?(?q2?09q\r*,709e", "\u030a\u033b\u030d\u2365\u0357\u0355\u0343\u0327\u0301\u030a\u031d\u030a\u0344\u0307\u030a\u0305\u030c\u0344\u0338\u031f\u0319\u0302\u0305\u030c\u0350\u0342\u0327\u0301\u030a\u031d\u030a\u0344\u0307\u030a\u0305\u030c\u0344\u0338\u031f\u0319\u0302\u0305\u030c\u0350", "\u079b\u07c4\u07cb\u07ce\u07c9\u07ce\u07d3\u0799\u079b\u0799\u078f\u078e\u07f1", "\u05fb\u05ae\u05a9\u05ae\u05b3\u05f9\u05fb\u05f9\u05ef\u05ee\u0591", "\u05d5\u05d7\u05c6\u05f1\u05de\u05d3\u05c1\u05c1\u058e\u058c\u059a\u059b\u05fe\u05d8\u05d3\u05c4\u05d3\u059d\u05de\u05d3\u05dc\u05d5\u059d\u05f1\u05de\u05d3\u05c1\u05c1\u0589", "\u0343\u034a\u0358\u0343\u0368\u0344\u034f\u034e\u0317\u0315\u0303\u0302\u0362", "\u0193\u0187\u0183\u0197\u019a\u0185\u01ca\u01c8\u01de\u01ba\u019c\u0197\u0180\u0197\u01d9\u019a\u0197\u0198\u0191\u01d9\u01b9\u0194\u019c\u0193\u0195\u0182\u01cd\u01df\u01ac", "\u0330\u033f\u033c\u033d\u0336\u036f\u036d\u037b\u037a\u031f\u0339\u0332\u0325\u0332\u037c\u033f\u0332\u033d\u0334\u037c\u031c\u0331\u0339\u0336\u0330\u0327\u0368", "\u037b\u0360\u035c\u037b\u037d\u0366\u0361\u0368\u0333\u0331\u0327\u0326\u0343\u0365\u036e\u0379\u036e\u0320\u0363\u036e\u0361\u0368\u0320\u035c\u037b\u037d\u0366\u0361\u0368\u0334", "\u0546\u0547\u055c\u0541\u054e\u0551\u0514\u0516\u0500\u0501\u057e", "\u048c\u048d\u0496\u048b\u0484\u049b\u04a3\u048e\u048e\u04de\u04dc\u04ca\u04cb\u04b4", "\u014a\u015c\u0154\u0149\u0101\u0103\u0115\u0114\u016b", "\u066e\u0678\u0670\u066d\u0625\u0627\u0631\u0653\u0630\u064f", "\u078a\u079c\u0794\u0789\u07cd\u07c1\u07c3\u07d5\u07b7\u07d4\u07ab", "\u029a\u028c\u0284\u0299\u02d1\u02d3\u02c5\u02a7\u02a4\u02c4\u02bb", "\u04b6\u04b9\u04be\u04b1\u04bc\u04b9\u04aa\u04b5\u04ec\u04ee\u04f8\u04f9\u0486"})
public final class Class3512 {
    public static int field7737 = 463943320;
    public static double field7738 = Double.longBitsToDouble(4594223594070744656L);
    public static float field7739;
    public static double field7740;
    public static double field7741;
    public static float field7742 = 0.06965864f;
    public static float field7743;

    /*
     * WARNING - void declaration
     */
    private static CallSite t6BkgJDDrv6R1N(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3512.TiBVaMQtbMnkVaQg(k2, -201781757));
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
                int a2 = Integer.parseInt(Class3512.TiBVaMQtbMnkVaQg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3512.TiBVaMQtbMnkVaQg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3512.TiBVaMQtbMnkVaQg(k2, -201781757) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String TiBVaMQtbMnkVaQg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        B\u200e = "Displays item durability";
        field7741 = Double.longBitsToDouble(0x4030000000000000L);
        field7740 = Double.longBitsToDouble(4594859710714111940L);
        aD\u200e = "EndLine";
        field7743 = Float.intBitsToFloat(1061642342);
        field7739 = Float.intBitsToFloat(1048978754);
        bD\u200e = "Automatically disables when you are moving";
    }
}

