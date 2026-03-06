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

@HACHIMI_CLIENT(mv=100, d1={"\u852f\u852d\u852b\u852d\u8524\u8528\u852c\u852c", "\u1b01\u1b00\u1b01\u1b0a\u1b00\u1b04\u1b06\u1b03", "\u2963\u2965\u2967\u2967\u2967\u2962\u2965\u296d", "\uc3c2\uc3c1\uc3ca\uc3c4\uc3c7\uc3c3\uc3c0\uc3c1", "\ue391\ue394\ue394\ue390\ue397\ue393\ue395\ue392", "\u9a1f\u9a1e\u9a1a\u9a19\u9a1f\u9a1a\u9a1a\u9a1d", "\u79fe\u79f4\u79fa\u79f8\u79f8\u79fa\u79fd\u79fd", "\ua555\ua551\ua556\ua550\ua558\ua556\ua557\ua559", "\u2c90\u2c94\u2c94\u2c94\u2c93\u2c96\u2c95\u2c96", "\u309f\u3094\u309c\u309a\u3095\u309f\u3094\u309f", "\u0ff2\u0ff0\u0ff5\u0fff\u0ffe\u0fff\u0ff2\u0ff7", "\ua7a5\ua7a0\ua7ab\ua7ab\ua7ab\ua7a3\ua7a3\ua7a0", "\u5229\u522d\u522d\u5228\u522a\u522f\u5223\u5223", "\u817b\u8179\u8170\u817b\u817e\u817d\u817b\u817c", "\u0ea3\u0ea1\u0ea5\u0ea4\u0ea3\u0ea1\u0eab\u0ea5"}, d2={"\u0142\u0173\u0144\u212d\u011f\u011d\u010b\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118\u010a\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118", "\u028c\u02d3\u02dc\u02d9\u02de\u02d9\u02c4\u028e\u028c\u028e\u0298\u0299\u02e6", "\u0473\u0426\u0421\u0426\u043b\u0471\u0473\u0471\u0467\u0466\u0419", "\u013e\u013c\u012d\u011a\u0135\u0138\u012a\u012a\u0165\u0167\u0171\u0170\u0115\u0133\u0138\u012f\u0138\u0176\u0135\u0138\u0137\u013e\u0176\u011a\u0135\u0138\u012a\u012a\u0162", "\u06f1\u06f8\u06ea\u06f1\u06da\u06f6\u06fd\u06fc\u06a5\u06a7\u06b1\u06b0\u06d0", "\u0535\u0521\u0525\u0531\u053c\u0523\u056c\u056e\u0578\u051c\u053a\u0531\u0526\u0531\u057f\u053c\u0531\u053e\u0537\u057f\u051f\u0532\u053a\u0535\u0533\u0524\u056b\u0579\u050a", "\u07a2\u07ad\u07ae\u07af\u07a4\u07fd\u07ff\u07e9\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u078e\u07a3\u07ab\u07a4\u07a2\u07b5\u07fa", "\u036a\u0371\u034d\u036a\u036c\u0377\u0370\u0379\u0322\u0320\u0336\u0337\u0352\u0374\u037f\u0368\u037f\u0331\u0372\u037f\u0370\u0379\u0331\u034d\u036a\u036c\u0377\u0370\u0379\u0325", "\u047a\u047b\u0460\u047d\u0472\u046d\u0428\u042a\u043c\u043d\u0442", "\u03ba\u03bb\u03a0\u03bd\u03b2\u03ad\u0395\u03b8\u03b8\u03e8\u03ea\u03fc\u03fd\u0382", "\u0148\u015e\u0156\u014b\u0103\u0101\u0117\u0116\u0169", "\u066f\u0679\u0671\u066c\u0624\u0626\u0630\u0652\u0631\u064e", "\u06cf\u06d9\u06d1\u06cc\u0688\u0684\u0686\u0690\u06f2\u0691\u06ee", "\u07e9\u07ff\u07f7\u07ea\u07a2\u07a0\u07b6\u07d4\u07d7\u07b7\u07c8", "\u0019\u0016\u0011\u001e\u0013\u0016\u0005\u001aCAWV)"})
public final class Class1460 {
    public static float field5542;

    private static String bNrMNG6JTmOsu7Yv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite etYFOGkwlaQI1y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        HACHIMI_CLIENT p2;
        Class<?> o2;
        block11: {
            int n3;
            int n4;
            block10: {
                block9: {
                    o2 = Class.forName(Class1460.bNrMNG6JTmOsu7Yv(k2, -1675005949));
                    p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) break block9;
                    n4 = 10566;
                    n3 = n4;
                    if (n3 == 10565) throw new Exception("Outdated metadata version");
                    if (n3 == 10566) break block10;
                    break block11;
                }
                n4 = 10565;
                if (!true) break block10;
                n3 = n4;
                if (n3 == 10565) throw new Exception("Outdated metadata version");
                if (n3 != 10566) break block11;
            }
            do {
                n4 = 10564;
                n3 = n4;
                if (n3 == 10565) throw new Exception("Outdated metadata version");
            } while (n3 == 10566);
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1460.bNrMNG6JTmOsu7Yv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1460.bNrMNG6JTmOsu7Yv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1460.bNrMNG6JTmOsu7Yv(k2, -1675005949) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n5 = n2 == 1 ? 24659 : 24660;
        while (true) {
            MethodHandle v2;
            int n6;
            if ((n6 = n5) == 24659) {
                MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            if (n6 != 24660) {
                v2 = h2.findStatic(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            n5 = 24658;
        }
    }

    static {
        T\u200e = "Renders safe diagonal phase blocks";
        field5542 = Float.intBitsToFloat(1060969415);
    }
}

