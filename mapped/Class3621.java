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

@HACHIMI_CLIENT(mv=100, d1={"\ud73d\ud73d\ud73e\ud731\ud73b\ud73a\ud73c\ud73f", "\u91af\u91ae\u91a3\u91a8\u91ad\u91ad\u91ab\u91a3", "\ud6e5\ud6e9\ud6e8\ud6ef\ud6e8\ud6e9\ud6ef", "\ucf62\ucf61\ucf68\ucf61\ucf62\ucf64\ucf68\ucf68", "\uba62\uba65\uba64\uba67\uba68\uba65\uba63\uba65", "\ub9d2\ub9d2\ub9d5\ub9d3\ub9d1\ub9df\ub9df\ub9de", "\u7757\u7751\u7755\u7754\u775d\u7752\u7757\u7753", "\u7be5\u7beb\u7beb\u7bea\u7be9\u7bea\u7be9", "\u9bcc\u9bca\u9bc9\u9bcd\u9bcc\u9bcf\u9bcc\u9bc0", "\u1867\u1867\u1860\u1866\u1861\u1864\u1863", "\u824a\u824f\u8247\u824e\u824f\u8247\u8249\u8249", "\u9ca7\u9ca2\u9ca2\u9ca4\u9ca5\u9cab\u9ca4\u9ca0", "\u88cd\u88c9\u88ce\u88cf\u88c7\u88c7\u88c8\u88c9", "\ud492\ud495\ud498\ud494\ud495\ud499\ud492\ud494", "\u3b31\u3b3d\u3b32\u3b3c\u3b37\u3b37\u3b3c\u3b37", "\u2bd2\u2bd2\u2bd2\u2bd0\u2bd0\u2bde\u2bd5\u2bd7", "\ubcfb\ubcfc\ubcfd\ubcf7\ubcf6\ubcf7\ubcfd\ubcf9"}, d2={"\u05a6\u05a9\u0584\u25c4\u05f6\u05f4\u05e2\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f1\u05e3\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f1", "\u03f7\u03f8\u03d4\u2395\u03a7\u03a5\u03b3\u03d7\u03f1\u03fa\u03ed\u03fa\u03b4\u03f7\u03fa\u03f5\u03fc\u03b4\u03c8\u03ef\u03e9\u03f2\u03f5\u03fc\u03a0\u03b2\u03d7\u03f1\u03fa\u03ed\u03fa\u03b4\u03f7\u03fa\u03f5\u03fc\u03b4\u03c8\u03ef\u03e9\u03f2\u03f5\u03fc\u03a0", "\u06c6\u06c9\u06fa\u26a4\u0696\u0694\u0682\u06e6\u06c0\u06cb\u06dc\u06cb\u0685\u06c6\u06cb\u06c4\u06cd\u0685\u06f9\u06de\u06d8\u06c3\u06c4\u06cd\u0691\u0683\u06e6\u06c0\u06cb\u06dc\u06cb\u0685\u06c6\u06cb\u06c4\u06cd\u0685\u06f9\u06de\u06d8\u06c3\u06c4\u06cd\u0691", "\u04ec\u04b3\u04bc\u04b9\u04be\u04b9\u04a4\u04ee\u04ec\u04ee\u04f8\u04f9\u0486", "2g`gz020&'X", "\u04ce\u04cc\u04dd\u04ea\u04c5\u04c8\u04da\u04da\u0495\u0497\u0481\u0480\u04e5\u04c3\u04c8\u04df\u04c8\u0486\u04c5\u04c8\u04c7\u04ce\u0486\u04ea\u04c5\u04c8\u04da\u04da\u0492", "\u01f0\u01f9\u01eb\u01f0\u01db\u01f7\u01fc\u01fd\u01a4\u01a6\u01b0\u01b1\u01d1", "\u0769\u077d\u0779\u076d\u0760\u077f\u0730\u0732\u0724\u0740\u0766\u076d\u077a\u076d\u0723\u0760\u076d\u0762\u076b\u0723\u0743\u076e\u0766\u0769\u076f\u0778\u0737\u0725\u0756", "\u03f0\u03ff\u03fc\u03fd\u03f6\u03af\u03ad\u03bb\u03ba\u03df\u03f9\u03f2\u03e5\u03f2\u03bc\u03ff\u03f2\u03fd\u03f4\u03bc\u03dc\u03f1\u03f9\u03f6\u03f0\u03e7\u03a8", "\u074b\u0750\u076c\u074b\u074d\u0756\u0751\u0758\u0703\u0701\u0717\u0716\u0773\u0755\u075e\u0749\u075e\u0710\u0753\u075e\u0751\u0758\u0710\u076c\u074b\u074d\u0756\u0751\u0758\u0704", "\u0286\u0287\u029c\u0281\u028e\u0291\u02d4\u02d6\u02c0\u02c1\u02be", "\u0656\u0657\u064c\u0651\u065e\u0641\u0679\u0654\u0654\u0604\u0606\u0610\u0611\u066e", "\u0123\u0135\u013d\u0120\u0168\u016a\u017c\u017d\u0102", "\u0336\u0320\u0328\u0335\u037d\u037f\u0369\u030b\u0368\u0317", "\u0708\u071e\u0716\u070b\u074f\u0743\u0741\u0757\u0735\u0756\u0729", "\u04cc\u04da\u04d2\u04cf\u0487\u0485\u0493\u04f1\u04f2\u0492\u04ed", "\u01cb\u01c4\u01c3\u01cc\u01c1\u01c4\u01d7\u01c8\u0191\u0193\u0185\u0184\u01fb"})
public final class Class3621 {
    public static double field8080;
    public static float field8081;
    public static double field8082;
    public static double field8083;
    public static double field8084;
    public static long field8085 = 5081727186108331257L;
    public static double field8086 = 0.3101065869217662;
    public static double field8087;

    /*
     * WARNING - void declaration
     */
    private static CallSite gOKk8ywBbdzmro(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3621.FvNtgoRqhXdU2a2a(k2, -24797400));
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
                int a2 = Integer.parseInt(Class3621.FvNtgoRqhXdU2a2a(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3621.FvNtgoRqhXdU2a2a(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3621.FvNtgoRqhXdU2a2a(k2, -24797400) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String FvNtgoRqhXdU2a2a(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        k\u200e = "NetherCoords";
        U\u200e = "Death Count";
        field8081 = Float.intBitsToFloat(998633088);
        field8083 = Double.longBitsToDouble(4585985375848415152L);
        field8082 = Double.longBitsToDouble(4606578475009656634L);
        field8084 = Double.longBitsToDouble(4604284568615434432L);
        bp\u200e = "samples";
        field8087 = Double.longBitsToDouble(4606648740281692542L);
        field8080 = Double.longBitsToDouble(4603296424964329879L);
    }
}

