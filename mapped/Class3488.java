/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u642f\u642d\u6428\u642e\u642a\u6428\u642c\u6428", "\u152c\u152b\u1528\u152f\u1529\u1529\u1529\u152b", "\u15a5\u15a2\u15a4\u15a6\u15a0\u15a5\u15a2\u15a5", "\u95be\u95b8\u95ba\u95b8\u95bf\u95b3\u95bc\u95bd", "\u8f1e\u8f12\u8f1d\u8f1e\u8f18\u8f19\u8f1b\u8f13", "\ue0bb\ue0bd\ue0bd\ue0bd\ue0bc\ue0b7\ue0bb\ue0bc", "\u9b71\u9b75\u9b7b\u9b73\u9b7a\u9b71\u9b75", "\u5693\u569b\u5697\u5697\u5694\u569a\u5695\u5696", "\uc152\uc152\uc15c\uc154\uc15c\uc154\uc15c", "\u4239\u423e\u4232\u4239\u423f\u4239\u423b\u4239", "\u7b4f\u7b4a\u7b4c\u7b4c\u7b48\u7b4c\u7b48\u7b4c", "\u19ad\u19a9\u19a5\u19ac\u19a4\u19ae\u19ab\u19a9", "\u12a5\u12a0\u12a3\u12a0\u12a9\u12a0\u12a8\u12a6", "\u4693\u4694\u4690\u4695\u4690\u4690\u4691\u469c", "\u6da0\u6da5\u6da2\u6da9\u6da0\u6da3\u6da9\u6da7"}, d2={"\u069f\u06b5\u06be\u26f2\u06c0\u06c2\u06d4\u06b0\u0696\u069d\u068a\u069d\u06d3\u0690\u069d\u0692\u069b\u06d3\u06af\u0688\u068e\u0695\u0692\u069b\u06c7\u06d5\u06b0\u0696\u069d\u068a\u069d\u06d3\u0690\u069d\u0692\u069b\u06d3\u06af\u0688\u068e\u0695\u0692\u069b\u06c7", "\u0614\u064b\u0644\u0641\u0646\u0641\u065c\u0616\u0614\u0616\u0600\u0601\u067e", "\u069e\u06cb\u06cc\u06cb\u06d6\u069c\u069e\u069c\u068a\u068b\u06f4", "\u0312\u0310\u0301\u0336\u0319\u0314\u0306\u0306\u0349\u034b\u035d\u035c\u0339\u031f\u0314\u0303\u0314\u035a\u0319\u0314\u031b\u0312\u035a\u0336\u0319\u0314\u0306\u0306\u034e", "\u00b4\u00bd\u00af\u00b4\u009f\u00b3\u00b8\u00b9\u00e0\u00e2\u00f4\u00f5\u0095", "\u00a5\u00b1\u00b5\u00a1\u00ac\u00b3\u00fc\u00fe\u00e8\u008c\u00aa\u00a1\u00b6\u00a1\u00ef\u00ac\u00a1\u00ae\u00a7\u00ef\u008f\u00a2\u00aa\u00a5\u00a3\u00b4\u00fb\u00e9\u009a", "\u0016\u0019\u001a\u001b\u0010IK]\\9\u001f\u0014\u0003\u0014Z\u0019\u0014\u001b\u0012Z:\u0017\u001f\u0010\u0016\u0001N", "\u069c\u0687\u06bb\u069c\u069a\u0681\u0686\u068f\u06d4\u06d6\u06c0\u06c1\u06a4\u0682\u0689\u069e\u0689\u06c7\u0684\u0689\u0686\u068f\u06c7\u06bb\u069c\u069a\u0681\u0686\u068f\u06d3", "\u0012\u0013\b\u0015\u001a\u0005@BTU*", "\u026c\u026d\u0276\u026b\u0264\u027b\u0243\u026e\u026e\u023e\u023c\u022a\u022b\u0254", "\u071a\u070c\u0704\u0719\u0751\u0753\u0745\u0744\u073b", "\u0607\u0611\u0619\u0604\u064c\u064e\u0658\u063a\u0659\u0626", "\u04a4\u04b2\u04ba\u04a7\u04e3\u04ef\u04ed\u04fb\u0499\u04fa\u0485", "\u0669\u067f\u0677\u066a\u0622\u0620\u0636\u0654\u0657\u0637\u0648", "\u038c\u0383\u0384\u038b\u0386\u0383\u0390\u038f\u03d6\u03d4\u03c2\u03c3\u03bc"})
public final class Class3488 {
    public static double field7672;
    public static float field7673;
    public static float field7674;

    private static String oAMnb2QgGNltANdk(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        v\u200e = "Bind";
        field7673 = Float.intBitsToFloat(1032519264);
        field7674 = Float.intBitsToFloat(1057966766);
        field7672 = Double.longBitsToDouble(4600993800305579620L);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite ACWpv8IPPla7AI(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3488.oAMnb2QgGNltANdk(k, 1923675112));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 26043;
                ** GOTO lbl19
            }
            v0 = 26044;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 26042;
lbl19:
                // 3 sources

                switch (v0) {
                    case 26044: {
                        continue block7;
                    }
                    case 26043: {
                        try {
                            a = Integer.parseInt(Class3488.oAMnb2QgGNltANdk(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3488.oAMnb2QgGNltANdk(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3488.oAMnb2QgGNltANdk(k, 1923675112) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

