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

@HACHIMI_CLIENT(mv=100, d1={"\u7135\u7135\u7137\u7131\u7134\u7137\u7132\u7133", "\ubc0f\ubc04\ubc0d\ubc0c\ubc09\ubc0d\ubc0d\ubc0d", "\u52c4\u52cd\u52cc\u52c3\u52c5\u52c6\u52c3\u52c6", "\uc1d9\uc1de\uc1d7\uc1de\uc1df\uc1dd\uc1da\uc1d9", "\u37c5\u37c5\u37c4\u37c0\u37c2\u37c3\u37c3\u37c0", "\u79cb\u79cb\u79c9\u79cf\u79cd\u79c8\u79cb", "\u428d\u4289\u4289\u4289\u4288\u428c\u428c\u428a", "\ua730\ua734\ua735\ua730\ua734\ua735\ua737", "\u176e\u176b\u176b\u1768\u1768\u1763\u176e\u1762", "\u00e9\u00ed\u00e8\u00e9\u00eb\u00e8\u00ea\u00e4", "\uddfe\uddfc\uddff\uddfb\uddfd\uddfe\uddff\uddf0", "\ua1d9\ua1df\ua1df\ua1d3\ua1dc\ua1d3\ua1dd\ua1d3", "\u4004\u4002\u4002\u4000\u4006\u400e\u4001\u400f", "\u9134\u9138\u9130\u9139\u9139\u9136\u9131\u9139"}, d2={"\u02e0\u02bf\u02b0\u02b5\u02b2\u02b5\u02a8\u02e2\u02e0\u02e2\u02f4\u02f5\u028a", "\u06ad\u06f8\u06ff\u06f8\u06e5\u06af\u06ad\u06af\u06b9\u06b8\u06c7", "\u0539\u053b\u052a\u051d\u0532\u053f\u052d\u052d\u0562\u0560\u0576\u0577\u0512\u0534\u053f\u0528\u053f\u0571\u0532\u053f\u0530\u0539\u0571\u051d\u0532\u053f\u052d\u052d\u0565", "'.<'\f +*sqgf\u0006", "\u0186\u0192\u0196\u0182\u018f\u0190\u01df\u01dd\u01cb\u01af\u0189\u0182\u0195\u0182\u01cc\u018f\u0182\u018d\u0184\u01cc\u01ac\u0181\u0189\u0186\u0180\u0197\u01d8\u01ca\u01b9", "\u062a\u0625\u0626\u0627\u062c\u0675\u0677\u0661\u0660\u0605\u0623\u0628\u063f\u0628\u0666\u0625\u0628\u0627\u062e\u0666\u0606\u062b\u0623\u062c\u062a\u063d\u0672", "\u07b5\u07ae\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fd\u07ff\u07e9\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa", "'&= /0uwa`\u001f", "\u0687\u0686\u069d\u0680\u068f\u0690\u06a8\u0685\u0685\u06d5\u06d7\u06c1\u06c0\u06bf", "\u0507\u0511\u0519\u0504\u054c\u054e\u0558\u0559\u0526", "\u03f1\u03e7\u03ef\u03f2\u03ba\u03b8\u03ae\u03cc\u03af\u03d0", "\u078e\u0798\u0790\u078d\u07c9\u07c5\u07c7\u07d1\u07b3\u07d0\u07af", "\u01df\u01c9\u01c1\u01dc\u0194\u0196\u0180\u01e2\u01e1\u0181\u01fe", "\u027d\u0272\u0275\u027a\u0277\u0272\u0261\u027e\u0227\u0225\u0233\u0232\u024d"})
public final class Class4027 {
    public static float field9272 = Float.intBitsToFloat(1059686410);
    public static int field9273 = 781767007;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite QgBwquGCR4bSJi(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4027.JwjhLAVxl5V0PDMx(k2, -1035459025));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4027.JwjhLAVxl5V0PDMx(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4027.JwjhLAVxl5V0PDMx(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4027.JwjhLAVxl5V0PDMx(k2, -1035459025) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 32198 : 32197;
        block7: while (true) {
            switch (n3) {
                case 32198: {
                    n3 = 32196;
                    continue block7;
                }
                case 32197: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String JwjhLAVxl5V0PDMx(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

