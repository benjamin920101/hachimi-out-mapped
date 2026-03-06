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
@HACHIMI_CLIENT(mv=100, d1={"\u3d8b\u3d8c\u3d89\u3d8c\u3d89\u3d81\u3d8e\u3d89", "\u14c9\u14cd\u14c8\u14cf\u14cb\u14ca\u14c0\u14c1", "\u3f93\u3f96\u3f94\u3f99\u3f92\u3f96\u3f95", "\ub1b5\ub1b6\ub1be\ub1b1\ub1b5\ub1b3\ub1b5\ub1b4", "\uc5cb\uc5cc\uc5cb\uc5c9\uc5c8\uc5c8\uc5cb\uc5cf", "\uacea\uacec\uace8\uacef\uace9\uacec\uace9\uacec", "\ud63b\ud63f\ud63c\ud63a\ud63f\ud63a\ud639\ud635", "\u825b\u825a\u825d\u8250\u8251\u8251\u825d\u825a", "\ub544\ub547\ub545\ub541\ub543\ub543\ub547\ub547", "\u6dd6\u6ddd\u6dd2\u6dd6\u6dd3\u6ddd\u6dd2\u6dd5", "\u66ed\u66e3\u66e3\u66e7\u66e5\u66ec\u66e5", "\u7114\u7112\u7112\u7114\u7112\u7116\u711c\u7111", "\ub11e\ub11d\ub116\ub119\ub11f\ub11a\ub119", "\u7069\u706d\u706a\u706a\u706f\u706c\u7069\u7062", "\u1f34\u1f31\u1f35\u1f32\u1f32\u1f30\u1f36\u1f33", "\u261c\u261c\u261b\u2615\u261f\u2614\u2619\u2618"}, d2={"\u05c8\u05f5\u05fd\u25aa\u0598\u059a\u058c\u05e8\u05ce\u05c5\u05d2\u05c5\u058b\u05c8\u05c5\u05ca\u05c3\u058b\u05f7\u05d0\u05d6\u05cd\u05ca\u05c3\u059f\u058d\u05e8\u05ce\u05c5\u05d2\u05c5\u058b\u05c8\u05c5\u05ca\u05c3\u058b\u05f7\u05d0\u05d6\u05cd\u05ca\u05c3\u059f", "\u0223\u021e\u0215\u2241\u0273\u0271\u0267\u0203\u0225\u022e\u0239\u022e\u0260\u0223\u022e\u0221\u0228\u0260\u021c\u023b\u023d\u0226\u0221\u0228\u0274\u0266\u0203\u0225\u022e\u0239\u022e\u0260\u0223\u022e\u0221\u0228\u0260\u021c\u023b\u023d\u0226\u0221\u0228\u0274", "\u0421\u047e\u0471\u0474\u0473\u0474\u0469\u0423\u0421\u0423\u0435\u0434\u044b", "\u053e\u056b\u056c\u056b\u0576\u053c\u053e\u053c\u052a\u052b\u0554", "\u07e8\u07ea\u07fb\u07cc\u07e3\u07ee\u07fc\u07fc\u07b3\u07b1\u07a7\u07a6\u07c3\u07e5\u07ee\u07f9\u07ee\u07a0\u07e3\u07ee\u07e1\u07e8\u07a0\u07cc\u07e3\u07ee\u07fc\u07fc\u07b4", "\u00b9\u00b0\u00a2\u00b9\u0092\u00be\u00b5\u00b4\u00ed\u00ef\u00f9\u00f8\u0098", "\u0587\u0593\u0597\u0583\u058e\u0591\u05de\u05dc\u05ca\u05ae\u0588\u0583\u0594\u0583\u05cd\u058e\u0583\u058c\u0585\u05cd\u05ad\u0580\u0588\u0587\u0581\u0596\u05d9\u05cb\u05b8", "\u05da\u05d5\u05d6\u05d7\u05dc\u0585\u0587\u0591\u0590\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05f6\u05db\u05d3\u05dc\u05da\u05cd\u0582", "\u018c\u0197\u01ab\u018c\u018a\u0191\u0196\u019f\u01c4\u01c6\u01d0\u01d1\u01b4\u0192\u0199\u018e\u0199\u01d7\u0194\u0199\u0196\u019f\u01d7\u01ab\u018c\u018a\u0191\u0196\u019f\u01c3", "\u07ec\u07ed\u07f6\u07eb\u07e4\u07fb\u07be\u07bc\u07aa\u07ab\u07d4", "\u0397\u0396\u038d\u0390\u039f\u0380\u03b8\u0395\u0395\u03c5\u03c7\u03d1\u03d0\u03af", "\u069a\u068c\u0684\u0699\u06d1\u06d3\u06c5\u06c4\u06bb", "\u024c\u025a\u0252\u024f\u0207\u0205\u0213\u0271\u0212\u026d", "\u0782\u0794\u079c\u0781\u07c5\u07c9\u07cb\u07dd\u07bf\u07dc\u07a3", "\u036e\u0378\u0370\u036d\u0325\u0327\u0331\u0353\u0350\u0330\u034f", "\u03ad\u03a2\u03a5\u03aa\u03a7\u03a2\u03b1\u03ae\u03f7\u03f5\u03e3\u03e2\u039d"})
public final class Class1755 {
    static {
        ar\u200e = "Displays command functionality";
        aP\u200e = "HoppersColor";
    }

    private static String 74oSaFOaKjOUt4FG(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite DINDYfI3MF1tff(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1755.74oSaFOaKjOUt4FG(k2, 234080264));
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
                int a2 = Integer.parseInt(Class1755.74oSaFOaKjOUt4FG(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1755.74oSaFOaKjOUt4FG(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1755.74oSaFOaKjOUt4FG(k2, 234080264) + " " + l2 + " " + m2);
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

