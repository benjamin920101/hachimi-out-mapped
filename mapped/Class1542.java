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
@HACHIMI_CLIENT(mv=100, d1={"\u64bf\u64b8\u64b8\u64ba\u64b8\u64bb\u64b4\u64b9", "\u46c5\u46c2\u46c5\u46c4\u46c4\u46cf\u46cf\u46ce", "\uabad\uaba8\uaba8\uaba9\uabaf\uabaa\uaba6\uaba7", "\u292b\u292f\u292f\u292a\u292b\u292c\u2929\u2929", "\uceab\ucea6\uceac\ucea9\uceaa\ucea9\ucea6", "\u10bf\u10b2\u10bb\u10b3\u10bb\u10be\u10b8\u10b9", "\ube51\ube5d\ube55\ube5c\ube5c\ube5c\ube50\ube55", "\u1c86\u1c8c\u1c81\u1c8d\u1c80\u1c83\u1c84\u1c8c", "\u7d31\u7d3a\u7d32\u7d30\u7d3b\u7d31\u7d34\u7d3a", "\u119f\u1191\u119e\u119a\u119a\u119b\u1190\u1190", "\u9153\u9158\u9155\u9154\u9159\u9152\u9156\u9154", "\u0ac2\u0ac9\u0ac1\u0ac8\u0ac5\u0ac7\u0ac3\u0ac0", "\u2bf0\u2bf6\u2bfc\u2bf3\u2bfc\u2bfd\u2bf1\u2bf2", "\u999e\u999c\u9994\u999d\u999f\u999e\u999e\u999b", "\u78b6\u78b3\u78bd\u78b6\u78b2\u78b5\u78b2\u78bc"}, d2={"\u06c6\u06df\u06f3\u26b9\u068b\u0689\u069f\u06fb\u06dd\u06d6\u06c1\u06d6\u0698\u06db\u06d6\u06d9\u06d0\u0698\u06e4\u06c3\u06c5\u06de\u06d9\u06d0\u068c\u069e\u06fb\u06dd\u06d6\u06c1\u06d6\u0698\u06db\u06d6\u06d9\u06d0\u0698\u06e4\u06c3\u06c5\u06de\u06d9\u06d0\u068c", "\u0313\u034c\u0343\u0346\u0341\u0346\u035b\u0311\u0313\u0311\u0307\u0306\u0379", "\u05d1\u0584\u0583\u0584\u0599\u05d3\u05d1\u05d3\u05c5\u05c4\u05bb", "\u029d\u029f\u028e\u02b9\u0296\u029b\u0289\u0289\u02c6\u02c4\u02d2\u02d3\u02b6\u0290\u029b\u028c\u029b\u02d5\u0296\u029b\u0294\u029d\u02d5\u02b9\u0296\u029b\u0289\u0289\u02c1", "\u01c7\u01ce\u01dc\u01c7\u01ec\u01c0\u01cb\u01ca\u0193\u0191\u0187\u0186\u01e6", "\u0288\u029c\u0298\u028c\u0281\u029e\u02d1\u02d3\u02c5\u02a1\u0287\u028c\u029b\u028c\u02c2\u0281\u028c\u0283\u028a\u02c2\u02a2\u028f\u0287\u0288\u028e\u0299\u02d6\u02c4\u02b7", "\u05fd\u05f2\u05f1\u05f0\u05fb\u05a2\u05a0\u05b6\u05b7\u05d2\u05f4\u05ff\u05e8\u05ff\u05b1\u05f2\u05ff\u05f0\u05f9\u05b1\u05d1\u05fc\u05f4\u05fb\u05fd\u05ea\u05a5", "\u026c\u0277\u024b\u026c\u026a\u0271\u0276\u027f\u0224\u0226\u0230\u0231\u0254\u0272\u0279\u026e\u0279\u0237\u0274\u0279\u0276\u027f\u0237\u024b\u026c\u026a\u0271\u0276\u027f\u0223", "\u0676\u0677\u066c\u0671\u067e\u0661\u0624\u0626\u0630\u0631\u064e", "\u0666\u0667\u067c\u0661\u066e\u0671\u0649\u0664\u0664\u0634\u0636\u0620\u0621\u065e", "\u06f8\u06ee\u06e6\u06fb\u06b3\u06b1\u06a7\u06a6\u06d9", "\u06af\u06b9\u06b1\u06ac\u06e4\u06e6\u06f0\u0692\u06f1\u068e", "\u014e\u0158\u0150\u014d\u0109\u0105\u0107\u0111\u0173\u0110\u016f", "\u0496\u0480\u0488\u0495\u04dd\u04df\u04c9\u04ab\u04a8\u04c8\u04b7", "\u0330\u033f\u0338\u0337\u033a\u033f\u032c\u0333\u036a\u0368\u037e\u037f\u0300"})
public final class Class1542 {
    public static int field5790 = 0;
    public static int field5791 = 346470;
    public static float field5792 = 0.35828966f;
    public static float field5793 = 0.12176865f;

    static {
        aF\u200e = "Nbt";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 7FSug664X2wSjE(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1542.W29UWbegCrwMXR2Y(k2, -1591916999));
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
                int a2 = Integer.parseInt(Class1542.W29UWbegCrwMXR2Y(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1542.W29UWbegCrwMXR2Y(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1542.W29UWbegCrwMXR2Y(k2, -1591916999) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String W29UWbegCrwMXR2Y(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

