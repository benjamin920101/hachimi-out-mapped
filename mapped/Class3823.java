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

@HACHIMI_CLIENT(mv=100, d1={"\u0383\u0381\u0381\u0384\u0383\u0387\u038f\u0385", "\u99df\u99db\u99df\u99da\u99d2\u99db\u99df\u99d2", "\u7e88\u7e8f\u7e89\u7e8c\u7e8a\u7e8b\u7e8e\u7e8d", "\u9cd7\u9cda\u9cdb\u9cde\u9cdf\u9cd6\u9cde", "\u936c\u9368\u936a\u9368\u936f\u936b\u9360\u9361", "\u623b\u623b\u623b\u623a\u623b\u6239\u623d\u623a", "\u5fee\u5fe7\u5fe6\u5fef\u5feb\u5fee\u5fee\u5fed", "\u3dd9\u3dd6\u3dd9\u3dd9\u3ddd\u3dd9\u3dd6", "\u5eb5\u5eb4\u5eb4\u5eb3\u5eb8\u5eb7\u5eb9", "\u6345\u6346\u6342\u6343\u6348\u6341\u6344", "\u33bd\u33bb\u33ba\u33bd\u33bf\u33b9\u33bd\u33b8", "\u4c04\u4c04\u4c06\u4c07\u4c05\u4c09\u4c04\u4c06", "\u574f\u574b\u574f\u574b\u5749\u574b\u574f\u574a", "\u6af3\u6aff\u6af0\u6af3\u6af3\u6afe\u6af1\u6af6", "\u5f63\u5f61\u5f61\u5f67\u5f62\u5f67\u5f61\u5f61", "\ud64b\ud649\ud649\ud644\ud648\ud648\ud645\ud64e"}, d2={"\u0424\u041c\u2479\u044b\u0449\u045f\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c\u045e\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c", "\u0131\u010e\u216c\u015e\u015c\u014a\u012e\u0108\u0103\u0114\u0103\u014d\u010e\u0103\u010c\u0105\u014d\u0131\u0116\u0110\u010b\u010c\u0105\u0159\u014b\u012e\u0108\u0103\u0114\u0103\u014d\u010e\u0103\u010c\u0105\u014d\u0131\u0116\u0110\u010b\u010c\u0105\u0159", "\u0498\u04c7\u04c8\u04cd\u04ca\u04cd\u04d0\u049a\u0498\u049a\u048c\u048d\u04f2", "\u03e5\u03b0\u03b7\u03b0\u03ad\u03e7\u03e5\u03e7\u03f1\u03f0\u038f", "\u00bf\u00bd\u00ac\u009b\u00b4\u00b9\u00ab\u00ab\u00e4\u00e6\u00f0\u00f1\u0094\u00b2\u00b9\u00ae\u00b9\u00f7\u00b4\u00b9\u00b6\u00bf\u00f7\u009b\u00b4\u00b9\u00ab\u00ab\u00e3", "\u040c\u0405\u0417\u040c\u0427\u040b\u0400\u0401\u0458\u045a\u044c\u044d\u042d", "\u0280\u0294\u0290\u0284\u0289\u0296\u02d9\u02db\u02cd\u02a9\u028f\u0284\u0293\u0284\u02ca\u0289\u0284\u028b\u0282\u02ca\u02aa\u0287\u028f\u0280\u0286\u0291\u02de\u02cc\u02bf", "\u0521\u052e\u052d\u052c\u0527\u057e\u057c\u056a\u056b\u050e\u0528\u0523\u0534\u0523\u056d\u052e\u0523\u052c\u0525\u056d\u050d\u0520\u0528\u0527\u0521\u0536\u0579", "\u038a\u0391\u03ad\u038a\u038c\u0397\u0390\u0399\u03c2\u03c0\u03d6\u03d7\u03b2\u0394\u039f\u0388\u039f\u03d1\u0392\u039f\u0390\u0399\u03d1\u03ad\u038a\u038c\u0397\u0390\u0399\u03c5", "\u01f8\u01f9\u01e2\u01ff\u01f0\u01ef\u01aa\u01a8\u01be\u01bf\u01c0", "\u0377\u0376\u036d\u0370\u037f\u0360\u0358\u0375\u0375\u0325\u0327\u0331\u0330\u034f", "\u02cb\u02dd\u02d5\u02c8\u0280\u0282\u0294\u0295\u02ea", "\u05fb\u05ed\u05e5\u05f8\u05b0\u05b2\u05a4\u05c6\u05a5\u05da", "\u0730\u0726\u072e\u0733\u0777\u077b\u0779\u076f\u070d\u076e\u0711", "\u0343\u0355\u035d\u0340\u0308\u030a\u031c\u037e\u037d\u031d\u0362", "\u033a\u0335\u0332\u033d\u0330\u0335\u0326\u0339\u0360\u0362\u0374\u0375\u030a"})
public final class Class3823 {
    public static float field8652 = Float.intBitsToFloat(1045390228);
    public static float field8653 = Float.intBitsToFloat(1062637936);
    public static int field8654 = 107896379;
    public static double field8655;
    public static double field8656;

    static {
        field8656 = Double.longBitsToDouble(4597242654071282596L);
        aD\u200e = "Place a block at targets head";
        field8655 = Double.longBitsToDouble(4602354078803040300L);
        aT\u200e = "texelSize";
    }

    private static String LlRWkPd11vtJLFQb(String a2, int b2) {
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
    private static CallSite pSEty0ArDMIpd2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3823.LlRWkPd11vtJLFQb(k2, -856168564));
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
                int a2 = Integer.parseInt(Class3823.LlRWkPd11vtJLFQb(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3823.LlRWkPd11vtJLFQb(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 48081 : 48082;
        block7: while (true) {
            switch (n3) {
                case 48082: {
                    n3 = 48080;
                    continue block7;
                }
                case 48081: {
                    throw new Exception("Can't find method in " + Class3823.LlRWkPd11vtJLFQb(k2, -856168564) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

