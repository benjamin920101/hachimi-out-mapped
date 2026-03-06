/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u5caa\u5ca0\u5caa\u5caa\u5ca0\u5ca0\u5cab", "\u0b3e\u0b39\u0b38\u0b36\u0b38\u0b36\u0b3f\u0b3a", "\u159c\u159a\u1594\u1594\u159c\u159a\u159b\u159e", "\u847d\u8473\u8474\u8475\u8475\u8473\u847c", "\ud455\ud456\ud456\ud457\ud457\ud453\ud452\ud453", "\u3a42\u3a47\u3a46\u3a41\u3a46\u3a4e\u3a41\u3a46", "\ud9a1\ud9a9\ud9a1\ud9a7\ud9a3\ud9a4\ud9a9\ud9a3", "\u0c13\u0c14\u0c10\u0c13\u0c17\u0c12\u0c1f\u0c1e", "\u76df\u76df\u76d8\u76d8\u76dd\u76d5\u76de\u76dd", "\ubac7\ubac4\ubac2\ubac8\ubac4\ubac6\ubac1", "\u754c\u754a\u7546\u754b\u754d\u7546\u754a\u754f", "\u04c6\u04c3\u04c1\u04c3\u04c1\u04c6\u04c8\u04c4", "\ua56b\ua56d\ua569\ua560\ua568\ua561\ua56d\ua560", "\uae76\uae72\uae76\uae75\uae72\uae77\uae72\uae75", "\ud33c\ud336\ud336\ud33c\ud33e\ud33e\ud338\ud33f", "\u1920\u1927\u1925\u1925\u1925\u1920\u1925\u1928", "\u2539\u253c\u253e\u253c\u2536\u2536\u253f\u2538"}, d2={"\u03c1\u03c2\u03fe\u23bd\u038f\u038d\u039b\u03ff\u03d9\u03d2\u03c5\u03d2\u039c\u03df\u03d2\u03dd\u03d4\u039c\u03e0\u03c7\u03c1\u03da\u03dd\u03d4\u0388\u039a\u03ff\u03d9\u03d2\u03c5\u03d2\u039c\u03df\u03d2\u03dd\u03d4\u039c\u03e0\u03c7\u03c1\u03da\u03dd\u03d4\u0388", "\u03fd\u03fe\u03c1\u2381\u03b3\u03b1\u03a7\u03c3\u03e5\u03ee\u03f9\u03ee\u03a0\u03e3\u03ee\u03e1\u03e8\u03a0\u03dc\u03fb\u03fd\u03e6\u03e1\u03e8\u03b4\u03a6\u03c3\u03e5\u03ee\u03f9\u03ee\u03a0\u03e3\u03ee\u03e1\u03e8\u03a0\u03dc\u03fb\u03fd\u03e6\u03e1\u03e8\u03b4", "\u040b\u0408\u0436\u2477\u0445\u0447\u0451\u0435\u0413\u0418\u040f\u0418\u0456\u0415\u0418\u0417\u041e\u0456\u042a\u040d\u040b\u0410\u0417\u041e\u0442\u0450\u0435\u0413\u0418\u040f\u0418\u0456\u0415\u0418\u0417\u041e\u0456\u042a\u040d\u040b\u0410\u0417\u041e\u0442", "\u0791\u07ce\u07c1\u07c4\u07c3\u07c4\u07d9\u0793\u0791\u0793\u0785\u0784\u07fb", "\u00f3\u00a6\u00a1\u00a6\u00bb\u00f1\u00f3\u00f1\u00e7\u00e6\u0099", "\u0320\u0322\u0333\u0304\u032b\u0326\u0334\u0334\u037b\u0379\u036f\u036e\u030b\u032d\u0326\u0331\u0326\u0368\u032b\u0326\u0329\u0320\u0368\u0304\u032b\u0326\u0334\u0334\u037c", "\u0281\u0288\u029a\u0281\u02aa\u0286\u028d\u028c\u02d5\u02d7\u02c1\u02c0\u02a0", "\u073c\u0728\u072c\u0738\u0735\u072a\u0765\u0767\u0771\u0715\u0733\u0738\u072f\u0738\u0776\u0735\u0738\u0737\u073e\u0776\u0716\u073b\u0733\u073c\u073a\u072d\u0762\u0770\u0703", "\u01a2\u01ad\u01ae\u01af\u01a4\u01fd\u01ff\u01e9\u01e8\u018d\u01ab\u01a0\u01b7\u01a0\u01ee\u01ad\u01a0\u01af\u01a6\u01ee\u018e\u01a3\u01ab\u01a4\u01a2\u01b5\u01fa", "\u03b1\u03aa\u0396\u03b1\u03b7\u03ac\u03ab\u03a2\u03f9\u03fb\u03ed\u03ec\u0389\u03af\u03a4\u03b3\u03a4\u03ea\u03a9\u03a4\u03ab\u03a2\u03ea\u0396\u03b1\u03b7\u03ac\u03ab\u03a2\u03fe", "\u0319\u0318\u0303\u031e\u0311\u030e\u034b\u0349\u035f\u035e\u0321", "\u06e3\u06e2\u06f9\u06e4\u06eb\u06f4\u06cc\u06e1\u06e1\u06b1\u06b3\u06a5\u06a4\u06db", "\u019d\u018b\u0183\u019e\u01d6\u01d4\u01c2\u01c3\u01bc", "\u0011\u0007\u000f\u0012ZXN,O0", "\u04b9\u04af\u04a7\u04ba\u04fe\u04f2\u04f0\u04e6\u0484\u04e7\u0498", "\u06b1\u06a7\u06af\u06b2\u06fa\u06f8\u06ee\u068c\u068f\u06ef\u0690", "\u022a\u0225\u0222\u022d\u0220\u0225\u0236\u0229\u0270\u0272\u0264\u0265\u021a"})
public final class Class1708 {
    public static int field6325 = 8450430;
    public static double field6326;
    public static double field6327;
    public static float field6328;

    private static String QGOWcjtNPNPLLSIS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6327 = Double.longBitsToDouble(4607249972794427965L);
        field6328 = Float.intBitsToFloat(1052515522);
        field6326 = Double.longBitsToDouble(4594138404296844360L);
        bh\u200e = "server";
        bk\u200e = "The render color for monsters";
        bw\u200e = "Shows activated spawners";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite va3DNzyMU1QKw4(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1708.QGOWcjtNPNPLLSIS(k, 1758463822));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        for (f = 0; f < q.length; ++f) {
            block8: {
                block9: {
                    try {
                        a = Integer.parseInt(Class1708.QGOWcjtNPNPLLSIS(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 56849;
                    ** GOTO lbl23
                }
                v0 = 56850;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 56848;
lbl23:
                    // 3 sources

                    if (var16_19 == 56849) break block8;
                } while (var16_19 == 56850);
                continue;
            }
            c = Class1708.QGOWcjtNPNPLLSIS(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1708.QGOWcjtNPNPLLSIS(k, 1758463822) + " " + l + " " + m);
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

