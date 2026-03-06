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

@HACHIMI_CLIENT(mv=100, d1={"\u49f2\u49f4\u49f5\u49f7\u49f4\u49f4\u49f6\u49f6", "\u0ff8\u0fff\u0ffc\u0ffc\u0ffb\u0ff9\u0fff\u0ffd", "\u5618\u5618\u5614\u561a\u5614\u5618\u5614\u561d", "\uba4c\uba4b\uba4e\uba4c\uba4b\uba4c\uba4e\uba48", "\ud92e\ud92b\ud92a\ud92d\ud928\ud926\ud92c\ud92b", "\u4aa7\u4aa5\u4aac\u4aa6\u4aa6\u4aa1\u4aa7\u4aa4", "\udc90\udc98\udc96\udc90\udc91\udc93\udc98\udc90", "\uc211\uc213\uc210\uc214\uc217\uc214\uc21d\uc215", "\u4511\u4515\u4515\u4515\u4514\u451a\u4511\u4514", "\u73eb\u73e9\u73e1\u73ed\u73ea\u73ea\u73e8\u73e0", "\u4dc2\u4dc8\u4dc0\u4dc7\u4dc1\u4dc2\u4dc9\u4dc9", "\ud91d\ud91d\ud91c\ud916\ud91d\ud912", "\udfde\udfdf\udfdf\udfdf\udfdc\udfdc\udfdb\udfd9", "\u2384\u2381\u2383\u2384\u2381\u2386\u2389\u2384", "\u9b37\u9b30\u9b31\u9b32\u9b3b\u9b36\u9b33\u9b3b", "\u9eb4\u9ebb\u9eb0\u9eb6\u9eb7\u9eba\u9eb3\u9eb0"}, d2={"\u05fa\u05da\u05c0\u259a\u05a8\u05aa\u05bc\u05d8\u05fe\u05f5\u05e2\u05f5\u05bb\u05f8\u05f5\u05fa\u05f3\u05bb\u05c7\u05e0\u05e6\u05fd\u05fa\u05f3\u05af\u05bd\u05d8\u05fe\u05f5\u05e2\u05f5\u05bb\u05f8\u05f5\u05fa\u05f3\u05bb\u05c7\u05e0\u05e6\u05fd\u05fa\u05f3\u05af", "\u06df\u06ff\u06e4\u26bf\u068d\u068f\u0699\u06fd\u06db\u06d0\u06c7\u06d0\u069e\u06dd\u06d0\u06df\u06d6\u069e\u06e2\u06c5\u06c3\u06d8\u06df\u06d6\u068a\u0698\u06fd\u06db\u06d0\u06c7\u06d0\u069e\u06dd\u06d0\u06df\u06d6\u069e\u06e2\u06c5\u06c3\u06d8\u06df\u06d6\u068a", "\u0585\u05da\u05d5\u05d0\u05d7\u05d0\u05cd\u0587\u0585\u0587\u0591\u0590\u05ef", "\u027f\u022a\u022d\u022a\u0237\u027d\u027f\u027d\u026b\u026a\u0215", "\u018e\u018c\u019d\u01aa\u0185\u0188\u019a\u019a\u01d5\u01d7\u01c1\u01c0\u01a5\u0183\u0188\u019f\u0188\u01c6\u0185\u0188\u0187\u018e\u01c6\u01aa\u0185\u0188\u019a\u019a\u01d2", "\u07d7\u07de\u07cc\u07d7\u07fc\u07d0\u07db\u07da\u0783\u0781\u0797\u0796\u07f6", "\u06d0\u06c4\u06c0\u06d4\u06d9\u06c6\u0689\u068b\u069d\u06f9\u06df\u06d4\u06c3\u06d4\u069a\u06d9\u06d4\u06db\u06d2\u069a\u06fa\u06d7\u06df\u06d0\u06d6\u06c1\u068e\u069c\u06ef", "\u03aa\u03a5\u03a6\u03a7\u03ac\u03f5\u03f7\u03e1\u03e0\u0385\u03a3\u03a8\u03bf\u03a8\u03e6\u03a5\u03a8\u03a7\u03ae\u03e6\u0386\u03ab\u03a3\u03ac\u03aa\u03bd\u03f2", "\u0426\u043d\u0401\u0426\u0420\u043b\u043c\u0435\u046e\u046c\u047a\u047b\u041e\u0438\u0433\u0424\u0433\u047d\u043e\u0433\u043c\u0435\u047d\u0401\u0426\u0420\u043b\u043c\u0435\u0469", "SRIT[D\u0001\u0003\u0015\u0014k", "\u036d\u036c\u0377\u036a\u0365\u037a\u0342\u036f\u036f\u033f\u033d\u032b\u032a\u0355", "\u0422\u0434\u043c\u0421\u0469\u046b\u047d\u047c\u0403", "\u034f\u0359\u0351\u034c\u0304\u0306\u0310\u0372\u0311\u036e", "\u04e5\u04f3\u04fb\u04e6\u04a2\u04ae\u04ac\u04ba\u04d8\u04bb\u04c4", "\u0321\u0337\u033f\u0322\u036a\u0368\u037e\u031c\u031f\u037f\u0300", "\u029c\u0293\u0294\u029b\u0296\u0293\u0280\u029f\u02c6\u02c4\u02d2\u02d3\u02ac"})
public final class Class3409 {
    public static float field7425 = Float.intBitsToFloat(1059186608);
    public static double field7426 = Double.longBitsToDouble(4603793428987351321L);
    public static float field7427 = 0.7647101f;
    public static String field7428;

    private static String UkyVJH651yQA9fOX(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite dGViAWprZWQrQV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3409.UkyVJH651yQA9fOX(k2, -1168820072));
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
                int a2 = Integer.parseInt(Class3409.UkyVJH651yQA9fOX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3409.UkyVJH651yQA9fOX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3409.UkyVJH651yQA9fOX(k2, -1168820072) + " " + l2 + " " + m2);
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
        R\u200e = "First Seen";
        field7428 = "-Djavax.net.ssl.trustStore";
    }
}

