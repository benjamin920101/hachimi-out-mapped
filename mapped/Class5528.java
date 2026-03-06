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

@HACHIMI_CLIENT(mv=100, d1={"\u6d91\u6d92\u6d94\u6d91\u6d92\u6d92\u6d9a", "\ua71e\ua71d\ua71a\ua71a\ua719\ua71f\ua71d\ua714", "\u6fb6\u6fb7\u6fb6\u6fb5\u6fbd\u6fb1\u6fb1\u6fb6", "\u8160\u816d\u8161\u816c\u8160\u8161\u8167\u8166", "\u818c\u8189\u818f\u818d\u818f\u8188\u818a\u8187", "\uabe9\uabe2\uabe7\uabe5\uabe3\uabe1\uabe9", "\u6095\u609d\u609b\u6099\u6094\u6099\u6099", "\u98ff\u98fc\u98fd\u98fd\u98f9\u98f8\u98fc\u98fd", "\u8d36\u8d31\u8d35\u8d32\u8d3d\u8d35\u8d31\u8d30", "\u1346\u1344\u1348\u1340\u1342\u1349\u1349\u1342", "\ucab9\ucaba\ucaba\ucab9\ucabb\ucaba\ucaba\ucaba", "\u56d2\u56d4\u56d9\u56d6\u56d4\u56d4\u56d4\u56d4", "\u39db\u39d7\u39d8\u39d7\u39de\u39d7\u39da\u39da", "\ub5b2\ub5b2\ub5b7\ub5b1\ub5b2\ub5bb\ub5b6\ub5b7", "\u9410\u9412\u9414\u941b\u9412\u941b\u9413\u9417"}, d2={"\u05b0\u0594\u05a5\u25d2\u05e0\u05e2\u05f4\u0590\u05b6\u05bd\u05aa\u05bd\u05f3\u05b0\u05bd\u05b2\u05bb\u05f3\u058f\u05a8\u05ae\u05b5\u05b2\u05bb\u05e7\u05f5\u0590\u05b6\u05bd\u05aa\u05bd\u05f3\u05b0\u05bd\u05b2\u05bb\u05f3\u058f\u05a8\u05ae\u05b5\u05b2\u05bb\u05e7", "&yvstsn$&$23L", "\u06bb\u06ee\u06e9\u06ee\u06f3\u06b9\u06bb\u06b9\u06af\u06ae\u06d1", "\u0487\u0485\u0494\u04a3\u048c\u0481\u0493\u0493\u04dc\u04de\u04c8\u04c9\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04a3\u048c\u0481\u0493\u0493\u04db", "\u0169\u0160\u0172\u0169\u0142\u016e\u0165\u0164\u013d\u013f\u0129\u0128\u0148", "\u0290\u0284\u0280\u0294\u0299\u0286\u02c9\u02cb\u02dd\u02b9\u029f\u0294\u0283\u0294\u02da\u0299\u0294\u029b\u0292\u02da\u02ba\u0297\u029f\u0290\u0296\u0281\u02ce\u02dc\u02af", "\u035b\u0354\u0357\u0356\u035d\u0304\u0306\u0310\u0311\u0374\u0352\u0359\u034e\u0359\u0317\u0354\u0359\u0356\u035f\u0317\u0377\u035a\u0352\u035d\u035b\u034c\u0303", "KPlKMVQX\u0003\u0001\u0017\u0016sU^I^\u0010S^QX\u0010lKMVQX\u0004", "\u0721\u0720\u073b\u0726\u0729\u0736\u0773\u0771\u0767\u0766\u0719", "\u0549\u0548\u0553\u054e\u0541\u055e\u0566\u054b\u054b\u051b\u0519\u050f\u050e\u0571", "\u06c7\u06d1\u06d9\u06c4\u068c\u068e\u0698\u0699\u06e6", "NXPM\u0005\u0007\u0011s\u0010o", "\u0011\u0007\u000f\u0012VZXN,O0", "\u0304\u0312\u031a\u0307\u034f\u034d\u035b\u0339\u033a\u035a\u0325", "\u0795\u079a\u079d\u0792\u079f\u079a\u0789\u0796\u07cf\u07cd\u07db\u07da\u07a5"})
public final class Class5528 {
    public static double field10453;
    public static double field10454;

    /*
     * WARNING - void declaration
     */
    private static CallSite PnGXYLLqPNfTTy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5528.wGwjS4nBI2taTwMM(k2, 1449615663));
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
                int a2 = Integer.parseInt(Class5528.wGwjS4nBI2taTwMM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5528.wGwjS4nBI2taTwMM(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5528.wGwjS4nBI2taTwMM(k2, 1449615663) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String wGwjS4nBI2taTwMM(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10454 = Double.longBitsToDouble(4606056844887881477L);
        field10453 = Double.longBitsToDouble(4601945252734037274L);
        bp\u200e = "5";
    }
}

