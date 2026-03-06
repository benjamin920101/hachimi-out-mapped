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

@HACHIMI_CLIENT(mv=100, d1={"\u029e\u0298\u029c\u0293\u029b\u029d\u029e\u029f", "\ucab1\ucabd\ucab2\ucab3\ucabc\ucab1\ucab2\ucab4", "\u7797\u7795\u7795\u7797\u7797\u779e\u7792\u7797", "\u59e9\u59ef\u59ee\u59e8\u59ea\u59ea\u59e8\u59e8", "\u0e93\u0e92\u0e97\u0e96\u0e90\u0e90\u0e99\u0e94", "\u4288\u4288\u428c\u428d\u428a\u428e\u428c\u428d", "\u3e3b\u3e39\u3e3d\u3e36\u3e3e\u3e39\u3e38\u3e39", "\u68ee\u68e9\u68e8\u68ef\u68ea\u68ef\u68ee\u68ed", "\u0814\u0811\u0812\u0817\u0811\u0816\u081e", "\ud110\ud114\ud116\ud116\ud117\ud114\ud119\ud114", "\u2ec7\u2ec5\u2ec7\u2ec7\u2ec2\u2ec3\u2ec0\u2ec4", "\u1124\u1124\u1123\u1127\u1124\u1123\u1123\u1123", "\u4c69\u4c65\u4c65\u4c65\u4c6f\u4c68\u4c68\u4c6b", "\ua9dc\ua9d0\ua9d1\ua9db\ua9d1\ua9df\ua9d1\ua9db", "\u2ab0\u2ab4\u2ab7\u2abd\u2abc\u2ab1\u2ab3\u2ab7", "\ub097\ub096\ub092\ub091\ub09d\ub09c\ub095\ub092", "\ub43e\ub43f\ub43b\ub438\ub435\ub43b\ub43b\ub434"}, d2={"\u04d4\u04db\u04d9\u24bc\u048e\u048c\u049a\u04fe\u04d8\u04d3\u04c4\u04d3\u049d\u04de\u04d3\u04dc\u04d5\u049d\u04e1\u04c6\u04c0\u04db\u04dc\u04d5\u0489\u049b\u04fe\u04d8\u04d3\u04c4\u04d3\u049d\u04de\u04d3\u04dc\u04d5\u049d\u04e1\u04c6\u04c0\u04db\u04dc\u04d5\u0489", "\u000e\u0001\u0004\u2066TV@$\u0002\t\u001e\tG\u0004\t\u0006\u000fG;\u001c\u001a\u0001\u0006\u000fSA$\u0002\t\u001e\tG\u0004\t\u0006\u000fG;\u001c\u001a\u0001\u0006\u000fS", "\u06c4\u06cb\u06cf\u26ac\u069e\u069c\u068a\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699\u068b\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699", "\u07b1\u07ee\u07e1\u07e4\u07e3\u07e4\u07f9\u07b3\u07b1\u07b3\u07a5\u07a4\u07db", "\u0286\u02d3\u02d4\u02d3\u02ce\u0284\u0286\u0284\u0292\u0293\u02ec", "\u0768\u076a\u077b\u074c\u0763\u076e\u077c\u077c\u0733\u0731\u0727\u0726\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u074c\u0763\u076e\u077c\u077c\u0734", "\u07cb\u07c2\u07d0\u07cb\u07e0\u07cc\u07c7\u07c6\u079f\u079d\u078b\u078a\u07ea", "\u00b0\u00a4\u00a0\u00b4\u00b9\u00a6\u00e9\u00eb\u00fd\u0099\u00bf\u00b4\u00a3\u00b4\u00fa\u00b9\u00b4\u00bb\u00b2\u00fa\u009a\u00b7\u00bf\u00b0\u00b6\u00a1\u00ee\u00fc\u008f", "\u03ba\u03b5\u03b6\u03b7\u03bc\u03e5\u03e7\u03f1\u03f0\u0395\u03b3\u03b8\u03af\u03b8\u03f6\u03b5\u03b8\u03b7\u03be\u03f6\u0396\u03bb\u03b3\u03bc\u03ba\u03ad\u03e2", "\u0347\u035c\u0360\u0347\u0341\u035a\u035d\u0354\u030f\u030d\u031b\u031a\u037f\u0359\u0352\u0345\u0352\u031c\u035f\u0352\u035d\u0354\u031c\u0360\u0347\u0341\u035a\u035d\u0354\u0308", "\u03d4\u03d5\u03ce\u03d3\u03dc\u03c3\u0386\u0384\u0392\u0393\u03ec", "\u0442\u0443\u0458\u0445\u044a\u0455\u046d\u0440\u0440\u0410\u0412\u0404\u0405\u047a", "\u01b8\u01ae\u01a6\u01bb\u01f3\u01f1\u01e7\u01e6\u0199", "\u07e5\u07f3\u07fb\u07e6\u07ae\u07ac\u07ba\u07d8\u07bb\u07c4", "\u0746\u0750\u0758\u0745\u0701\u070d\u070f\u0719\u077b\u0718\u0767", "\u0570\u0566\u056e\u0573\u053b\u0539\u052f\u054d\u054e\u052e\u0551", "\u07f3\u07fc\u07fb\u07f4\u07f9\u07fc\u07ef\u07f0\u07a9\u07ab\u07bd\u07bc\u07c3"})
public final class Class1588 {
    public static float field5936;
    public static double field5937;
    public static long field5938 = 3332611896742630429L;

    /*
     * WARNING - void declaration
     */
    private static CallSite FIPanlgrwU6Ngf(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1588.s0NmgZmy2EKztDtB(k2, -1046370953));
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
                int a2 = Integer.parseInt(Class1588.s0NmgZmy2EKztDtB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1588.s0NmgZmy2EKztDtB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1588.s0NmgZmy2EKztDtB(k2, -1046370953) + " " + l2 + " " + m2);
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
        b\u200e = "Translation in x-direction";
        field5937 = Double.longBitsToDouble(4598327896070382870L);
        q\u200e = "fire_resistance";
        field5936 = Float.intBitsToFloat(1119092736);
        bK\u200e = "";
    }

    private static String s0NmgZmy2EKztDtB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

