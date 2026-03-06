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

@HACHIMI_CLIENT(mv=100, d1={"\u4adb\u4ad2\u4ad8\u4ade\u4ad9\u4adc\u4ad8\u4ada", "\u13b8\u13bd\u13bb\u13bc\u13b8\u13b3\u13b3\u13be", "\u7b46\u7b4c\u7b44\u7b45\u7b45\u7b4c\u7b4c\u7b42", "\uccc2\uccc1\uccc1\uccc2\uccc1\uccc5\uccc2\ucccc", "\ub41f\ub41f\ub412\ub41e\ub419\ub41a\ub41b\ub41a", "\u930b\u930c\u9309\u930c\u930c\u930b\u930e\u9306", "\u9995\u9992\u9996\u999d\u999c\u9997\u999d\u9997", "\udbd9\udbdc\udbd6\udbd9\udbdf\udbd6\udbd9\udbdb", "\u7aa1\u7aa1\u7aa5\u7aa3\u7aa0\u7aa7\u7aab\u7aa1", "\ue009\ue003\ue00a\ue00d\ue003\ue008\ue00b\ue00c", "\u4cfc\u4cfa\u4cfd\u4cfc\u4cfb\u4cfb\u4cfd\u4cfc", "\u227a\u227b\u2278\u227c\u2277\u227a\u227a\u227a", "\u8eaa\u8ea3\u8eab\u8eaa\u8ea2\u8ea5\u8ea0", "\ubcd6\ubcd4\ubcda\ubcd2\ubcd2\ubcd7\ubcdb\ubcdb", "\u5fd4\u5fd4\u5fd0\u5fd9\u5fd6\u5fd7\u5fd2\u5fd4", "\u613a\u6134\u613a\u6135\u6138\u613c\u613a\u6139"}, d2={"\u03cb\u03c5\u03df\u23a1\u0393\u0391\u0387\u03e3\u03c5\u03ce\u03d9\u03ce\u0380\u03c3\u03ce\u03c1\u03c8\u0380\u03fc\u03db\u03dd\u03c6\u03c1\u03c8\u0394\u0386\u03e3\u03c5\u03ce\u03d9\u03ce\u0380\u03c3\u03ce\u03c1\u03c8\u0380\u03fc\u03db\u03dd\u03c6\u03c1\u03c8\u0394", "\u0413\u041d\u0406\u2479\u044b\u0449\u045f\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c\u045e\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c", "\u04f4\u04ab\u04a4\u04a1\u04a6\u04a1\u04bc\u04f6\u04f4\u04f6\u04e0\u04e1\u049e", "\u030e\u035b\u035c\u035b\u0346\u030c\u030e\u030c\u031a\u031b\u0364", "\u04a5\u04a7\u04b6\u0481\u04ae\u04a3\u04b1\u04b1\u04fe\u04fc\u04ea\u04eb\u048e\u04a8\u04a3\u04b4\u04a3\u04ed\u04ae\u04a3\u04ac\u04a5\u04ed\u0481\u04ae\u04a3\u04b1\u04b1\u04f9", "\u0461\u0468\u047a\u0461\u044a\u0466\u046d\u046c\u0435\u0437\u0421\u0420\u0440", "\u0388\u039c\u0398\u038c\u0381\u039e\u03d1\u03d3\u03c5\u03a1\u0387\u038c\u039b\u038c\u03c2\u0381\u038c\u0383\u038a\u03c2\u03a2\u038f\u0387\u0388\u038e\u0399\u03d6\u03c4\u03b7", "\u0571\u057e\u057d\u057c\u0577\u052e\u052c\u053a\u053b\u055e\u0578\u0573\u0564\u0573\u053d\u057e\u0573\u057c\u0575\u053d\u055d\u0570\u0578\u0577\u0571\u0566\u0529", "\u073f\u0724\u0718\u073f\u0739\u0722\u0725\u072c\u0777\u0775\u0763\u0762\u0707\u0721\u072a\u073d\u072a\u0764\u0727\u072a\u0725\u072c\u0764\u0718\u073f\u0739\u0722\u0725\u072c\u0770", "\u039e\u039f\u0384\u0399\u0396\u0389\u03cc\u03ce\u03d8\u03d9\u03a6", "\u0514\u0515\u050e\u0513\u051c\u0503\u053b\u0516\u0516\u0546\u0544\u0552\u0553\u052c", "\u07a7\u07b1\u07b9\u07a4\u07ec\u07ee\u07f8\u07f9\u0786", "\u0486\u0490\u0498\u0485\u04cd\u04cf\u04d9\u04bb\u04d8\u04a7", "V@HU\u0011\u001d\u001f\tk\bw", "\u0783\u0795\u079d\u0780\u07c8\u07ca\u07dc\u07be\u07bd\u07dd\u07a2", "\u04bf\u04b0\u04b7\u04b8\u04b5\u04b0\u04a3\u04bc\u04e5\u04e7\u04f1\u04f0\u048f"})
public final class Class3993 {
    public static float field9133 = Float.intBitsToFloat(1059568578);
    public static float field9134;
    public static int field9135 = 0;
    public static int field9136 = 505682914;

    /*
     * WARNING - void declaration
     */
    private static CallSite dxN0i4cY2ltnNL(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3993.NPQRO9zxd5VJtQJF(k2, 1697305800));
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
                int a2 = Integer.parseInt(Class3993.NPQRO9zxd5VJtQJF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3993.NPQRO9zxd5VJtQJF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3993.NPQRO9zxd5VJtQJF(k2, 1697305800) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NPQRO9zxd5VJtQJF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aN\u200e = "Trap your head when you standing";
        field9134 = Float.intBitsToFloat(1054126742);
        bD\u200e = "";
    }
}

