/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u28f6\u28f7\u28f7\u28f3\u28f3\u28fb\u28fa\u28f0", "\u6cce\u6cce\u6ccf\u6ccc\u6cce\u6cce\u6ccd\u6cc4", "\u1f2b\u1f2a\u1f28\u1f26\u1f2f\u1f2c\u1f27\u1f2c", "\u4581\u4584\u4586\u4580\u4585\u4581\u4585\u4586", "\u8877\u8873\u8876\u8870\u887c\u8875\u8872\u887c", "\u77f3\u77f5\u77f7\u77f6\u77f2\u77f6\u77f3\u77f4", "\u2c52\u2c50\u2c52\u2c53\u2c54\u2c53\u2c55\u2c5e", "\u8909\u8904\u890c\u890b\u8904\u890b\u8908\u8905", "\u135a\u135c\u1354\u135b\u135e\u135e\u135e\u135a", "\u9e95\u9e92\u9e94\u9e93\u9e97\u9e94\u9e97\u9e97", "\ucff3\ucff4\ucff3\ucff0\ucff7\ucff5\ucff3\ucff3", "\u0f4c\u0f4a\u0f40\u0f40\u0f4d\u0f48\u0f48\u0f48", "\u29c2\u29c6\u29c0\u29c6\u29c5\u29c2\u29c1\u29c4", "\u8d3f\u8d38\u8d3d\u8d3a\u8d3e\u8d3e\u8d3a\u8d35", "\u3532\u353f\u3530\u3534\u3532\u3533\u3533\u3533", "\u5fcc\u5fc9\u5fcb\u5fc0\u5fc9\u5fcf\u5fce\u5fce"}, d2={"\u05e5\u05c5\u05c2\u259f\u05ad\u05af\u05b9\u05dd\u05fb\u05f0\u05e7\u05f0\u05be\u05fd\u05f0\u05ff\u05f6\u05be\u05c2\u05e5\u05e3\u05f8\u05ff\u05f6\u05aa\u05b8\u05dd\u05fb\u05f0\u05e7\u05f0\u05be\u05fd\u05f0\u05ff\u05f6\u05be\u05c2\u05e5\u05e3\u05f8\u05ff\u05f6\u05aa", "\u00cc\u00ec\u00ec\u20b6\u0084\u0086\u0090\u00f4\u00d2\u00d9\u00ce\u00d9\u0097\u00d4\u00d9\u00d6\u00df\u0097\u00eb\u00cc\u00ca\u00d1\u00d6\u00df\u0083\u0091\u00f4\u00d2\u00d9\u00ce\u00d9\u0097\u00d4\u00d9\u00d6\u00df\u0097\u00eb\u00cc\u00ca\u00d1\u00d6\u00df\u0083", "\u0794\u07cb\u07c4\u07c1\u07c6\u07c1\u07dc\u0796\u0794\u0796\u0780\u0781\u07fe", "\u032e\u037b\u037c\u037b\u0366\u032c\u032e\u032c\u033a\u033b\u0344", "\u02ca\u02c8\u02d9\u02ee\u02c1\u02cc\u02de\u02de\u0291\u0293\u0285\u0284\u02e1\u02c7\u02cc\u02db\u02cc\u0282\u02c1\u02cc\u02c3\u02ca\u0282\u02ee\u02c1\u02cc\u02de\u02de\u0296", "ZSAZq]VW\u000e\f\u001a\u001b{", "\u0221\u0235\u0231\u0225\u0228\u0237\u0278\u027a\u026c\u0208\u022e\u0225\u0232\u0225\u026b\u0228\u0225\u022a\u0223\u026b\u020b\u0226\u022e\u0221\u0227\u0230\u027f\u026d\u021e", "\u0217\u0218\u021b\u021a\u0211\u0248\u024a\u025c\u025d\u0238\u021e\u0215\u0202\u0215\u025b\u0218\u0215\u021a\u0213\u025b\u023b\u0216\u021e\u0211\u0217\u0200\u024f", "\u0293\u0288\u02b4\u0293\u0295\u028e\u0289\u0280\u02db\u02d9\u02cf\u02ce\u02ab\u028d\u0286\u0291\u0286\u02c8\u028b\u0286\u0289\u0280\u02c8\u02b4\u0293\u0295\u028e\u0289\u0280\u02dc", "\u00c4\u00c5\u00de\u00c3\u00cc\u00d3\u0096\u0094\u0082\u0083\u00fc", "\u0326\u0327\u033c\u0321\u032e\u0331\u0309\u0324\u0324\u0374\u0376\u0360\u0361\u031e", "\u03dd\u03cb\u03c3\u03de\u0396\u0394\u0382\u0383\u03fc", "\u0103\u0115\u011d\u0100\u0148\u014a\u015c\u013e\u015d\u0122", "\u06a2\u06b4\u06bc\u06a1\u06e5\u06e9\u06eb\u06fd\u069f\u06fc\u0683", "\u038e\u0398\u0390\u038d\u03c5\u03c7\u03d1\u03b3\u03b0\u03d0\u03af", "\u010a\u0105\u0102\u010d\u0100\u0105\u0116\u0109\u0150\u0152\u0144\u0145\u013a"})
public final class Class1541 {
    public static float field5786;
    public static double field5787 = 0.7447467853977131;
    public static String field5788;
    public static double field5789 = 0.3717872829370158;

    private static String BIGzuIirSfD2bdcy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite otkoFyCLRdjZ7U(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block7: {
                block8: {
                    o = Class.forName(Class1541.BIGzuIirSfD2bdcy(k, 1038964734));
                    p = o.getAnnotation(HACHIMI_CLIENT.class);
                    if (p.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    q = p.d1();
                    r = p.d2();
                    s = "";
                    t = "";
                    for (f = 0; f < q.length; ++f) {
                        try {
                            a = Integer.parseInt(Class1541.BIGzuIirSfD2bdcy(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            continue;
                        }
                        if (e % 59557 != m.intValue()) continue;
                        c = Class1541.BIGzuIirSfD2bdcy(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                    if (!s.isEmpty()) break block8;
                    v0 = 26218;
                    ** GOTO lbl29
                }
                v0 = 26219;
                if (true) ** GOTO lbl29
                do {
                    v0 = var17_20 = 26217;
lbl29:
                    // 3 sources

                    if (var17_20 == 26218) break block7;
                } while (var17_20 == 26219);
                break block9;
            }
            throw new Exception("Can't find method in " + Class1541.BIGzuIirSfD2bdcy(k, 1038964734) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        r\u200e = "LavaSpeed";
        field5788 = "tag";
        field5786 = Float.intBitsToFloat(1061208832);
    }
}

