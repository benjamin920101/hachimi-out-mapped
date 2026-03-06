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

@HACHIMI_CLIENT(mv=100, d1={"\u1c09\u1c04\u1c0a\u1c04\u1c0b\u1c05\u1c05\u1c0c", "\u3321\u3321\u3326\u332c\u3325\u332d\u3323\u3326", "\u1391\u1394\u1392\u1390\u1391\u1391\u139d\u1393", "\ucdd3\ucdd3\ucdd9\ucdd3\ucddb\ucddd\ucddc", "\uc430\uc435\uc43b\uc430\uc432\uc436\uc435", "\uda7c\uda71\uda71\uda78\uda7d\uda78\uda70\uda71", "\u206d\u206d\u206b\u206e\u206d\u2062\u2062\u206d", "\udc3e\udc3c\udc3f\udc3b\udc3d\udc3a\udc3b\udc38", "\u6e58\u6e53\u6e5a\u6e59\u6e58\u6e5f\u6e58\u6e5f", "\u6c81\u6c85\u6c83\u6c83\u6c84\u6c82\u6c81\u6c80", "\ua224\ua228\ua222\ua226\ua227\ua222\ua223", "\u9c28\u9c29\u9c2c\u9c2c\u9c29\u9c28\u9c25\u9c25", "\u75bc\u75be\u75bf\u75b8\u75be\u75bd\u75b8\u75be", "\u5475\u5471\u5475\u5473\u5478\u5473\u5477\u5473", "\u5463\u5464\u5466\u5467\u546d\u5466\u546d\u5465"}, d2={"\u06d2\u06e0\u06c5\u26b8\u068a\u0688\u069e\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d\u069f\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d", "\u0213\u024c\u0243\u0246\u0241\u0246\u025b\u0211\u0213\u0211\u0207\u0206\u0279", "\u0363\u0336\u0331\u0336\u032b\u0361\u0363\u0361\u0377\u0376\u0309", "\u0775\u0777\u0766\u0751\u077e\u0773\u0761\u0761\u072e\u072c\u073a\u073b\u075e\u0778\u0773\u0764\u0773\u073d\u077e\u0773\u077c\u0775\u073d\u0751\u077e\u0773\u0761\u0761\u0729", "\u0166\u016f\u017d\u0166\u014d\u0161\u016a\u016b\u0132\u0130\u0126\u0127\u0147", "\u0014\u0000\u0004\u0010\u001d\u0002MOY=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^>\u0013\u001b\u0014\u0012\u0005JX+", "\u0617\u0618\u061b\u061a\u0611\u0648\u064a\u065c\u065d\u0638\u061e\u0615\u0602\u0615\u065b\u0618\u0615\u061a\u0613\u065b\u063b\u0616\u061e\u0611\u0617\u0600\u064f", "\u02e3\u02f8\u02c4\u02e3\u02e5\u02fe\u02f9\u02f0\u02ab\u02a9\u02bf\u02be\u02db\u02fd\u02f6\u02e1\u02f6\u02b8\u02fb\u02f6\u02f9\u02f0\u02b8\u02c4\u02e3\u02e5\u02fe\u02f9\u02f0\u02ac", "\u031d\u031c\u0307\u031a\u0315\u030a\u034f\u034d\u035b\u035a\u0325", "qpkvyf^ss#!76I", "\u0137\u0121\u0129\u0134\u017c\u017e\u0168\u0169\u0116", "\u05ec\u05fa\u05f2\u05ef\u05a7\u05a5\u05b3\u05d1\u05b2\u05cd", "\u0339\u032f\u0327\u033a\u037e\u0372\u0370\u0366\u0304\u0367\u0318", "\u06e5\u06f3\u06fb\u06e6\u06ae\u06ac\u06ba\u06d8\u06db\u06bb\u06c4", "\u06c8\u06c7\u06c0\u06cf\u06c2\u06c7\u06d4\u06cb\u0692\u0690\u0686\u0687\u06f8"})
public final class Class3464 {
    public static float field7585 = Float.intBitsToFloat(1056736438);
    public static int field7586 = 844625113;

    static {
        aU\u200e = "Pearl";
    }

    private static String VAASJ3xwVbMQcBc9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite JLgeAEXEIVtjii(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3464.VAASJ3xwVbMQcBc9(k2, 1621389762));
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
                int a2 = Integer.parseInt(Class3464.VAASJ3xwVbMQcBc9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3464.VAASJ3xwVbMQcBc9(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3464.VAASJ3xwVbMQcBc9(k2, 1621389762) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

