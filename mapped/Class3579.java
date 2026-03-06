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
@HACHIMI_CLIENT(mv=100, d1={"\uc5df\uc5df\uc5d8\uc5dd\uc5da\uc5db\uc5dc\uc5de", "\uac7b\uac78\uac79\uac7d\uac78\uac7e\uac7a\uac7f", "\u9fcf\u9fce\u9fcd\u9fca\u9fca\u9fcd\u9fcf\u9fc7", "\ud143\ud145\ud141\ud141\ud141\ud141\ud144\ud14c", "\u92cf\u92ce\u92ca\u92c9\u92c9\u92c9\u92cc\u92cd", "\u2ade\u2ad8\u2adf\u2add\u2ad1\u2ad9\u2ada\u2adc", "\u77a0\u77a5\u77a7\u77a2\u77aa\u77aa\u77a0\u77ab", "\ube73\ube71\ube70\ube75\ube71\ube79\ube77", "\u6178\u6176\u617e\u6177\u6176\u617b\u6178\u617f", "\uccf2\uccfc\uccf2\uccf2\uccfb\uccf3\uccfb", "\uabed\uabed\uabec\uabe8\uabeb\uabe8\uabe8", "\uc83b\uc83d\uc831\uc838\uc83c\uc83d\uc83a\uc83a", "\u9c1f\u9c14\u9c19\u9c1d\u9c1a\u9c1e\u9c14", "\u440d\u440a\u440a\u4408\u440c\u440d\u4409\u440d", "\u78cc\u78ce\u78c0\u78ce\u78c0\u78c0\u78ca\u78c9", "\u44d8\u44dc\u44df\u44de\u44db\u44db\u44db\u44d8", "\ucecb\ucec3\ucec4\ucec7\ucec3\ucecb\ucecb"}, d2={"\u0461\u0469\u045a\u241f\u042d\u042f\u0439\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0442\u0465\u0463\u0478\u047f\u0476\u042a\u0438\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0442\u0465\u0463\u0478\u047f\u0476\u042a", "\u0123\u012b\u011f\u215d\u016f\u016d\u017b\u011f\u0139\u0132\u0125\u0132\u017c\u013f\u0132\u013d\u0134\u017c\u0100\u0127\u0121\u013a\u013d\u0134\u0168\u017a\u011f\u0139\u0132\u0125\u0132\u017c\u013f\u0132\u013d\u0134\u017c\u0100\u0127\u0121\u013a\u013d\u0134\u0168", "\u0700\u0708\u073d\u277e\u074c\u074e\u0758\u073c\u071a\u0711\u0706\u0711\u075f\u071c\u0711\u071e\u0717\u075f\u0723\u0704\u0702\u0719\u071e\u0717\u074b\u0759\u073c\u071a\u0711\u0706\u0711\u075f\u071c\u0711\u071e\u0717\u075f\u0723\u0704\u0702\u0719\u071e\u0717\u074b", "\u0309\u0356\u0359\u035c\u035b\u035c\u0341\u030b\u0309\u030b\u031d\u031c\u0363", "\u00f9\u00ac\u00ab\u00ac\u00b1\u00fb\u00f9\u00fb\u00ed\u00ec\u0093", "rpaVytff)+=<Y\u007ftct:yt{r:Vytff.", "\u041f\u0416\u0404\u041f\u0434\u0418\u0413\u0412\u044b\u0449\u045f\u045e\u043e", "\u051f\u050b\u050f\u051b\u0516\u0509\u0546\u0544\u0552\u0536\u0510\u051b\u050c\u051b\u0555\u0516\u051b\u0514\u051d\u0555\u0535\u0518\u0510\u051f\u0519\u050e\u0541\u0553\u0520", "\u00d1\u00de\u00dd\u00dc\u00d7\u008e\u008c\u009a\u009b\u00fe\u00d8\u00d3\u00c4\u00d3\u009d\u00de\u00d3\u00dc\u00d5\u009d\u00fd\u00d0\u00d8\u00d7\u00d1\u00c6\u0089", "\u059b\u0580\u05bc\u059b\u059d\u0586\u0581\u0588\u05d3\u05d1\u05c7\u05c6\u05a3\u0585\u058e\u0599\u058e\u05c0\u0583\u058e\u0581\u0588\u05c0\u05bc\u059b\u059d\u0586\u0581\u0588\u05d4", "\u059a\u059b\u0580\u059d\u0592\u058d\u05c8\u05ca\u05dc\u05dd\u05a2", "\u0714\u0715\u070e\u0713\u071c\u0703\u073b\u0716\u0716\u0746\u0744\u0752\u0753\u072c", "\u07d2\u07c4\u07cc\u07d1\u0799\u079b\u078d\u078c\u07f3", "\u01d9\u01cf\u01c7\u01da\u0192\u0190\u0186\u01e4\u0187\u01f8", "\u007fia|846 B!^", "\u0117\u0101\u0109\u0114\u015c\u015e\u0148\u012a\u0129\u0149\u0136", "\u048b\u0484\u0483\u048c\u0481\u0484\u0497\u0488\u04d1\u04d3\u04c5\u04c4\u04bb"})
public final class Class3579 {
    public static float field7964 = 0.75829303f;

    private static String 2taaYmn4GBXCgDDQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite tQIOWlzdqOUiam(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3579.2taaYmn4GBXCgDDQ(k2, -713016017));
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
                int a2 = Integer.parseInt(Class3579.2taaYmn4GBXCgDDQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3579.2taaYmn4GBXCgDDQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3579.2taaYmn4GBXCgDDQ(k2, -713016017) + " " + l2 + " " + m2);
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
        aT\u200e = "Cancels all close window packets";
        bi\u200e = "glow";
        bP\u200e = "Spoofs packet delays to make it appear that you have a higher latency";
    }
}

