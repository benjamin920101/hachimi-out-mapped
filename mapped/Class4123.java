/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ue389\ue38c\ue383\ue388\ue38e\ue38a\ue382\ue38b", "\u6d41\u6d45\u6d43\u6d43\u6d44\u6d41\u6d46\u6d45", "\u7a2b\u7a2e\u7a28\u7a21\u7a20\u7a2b\u7a2d\u7a20", "\ud996\ud995\ud99c\ud996\ud994\ud997\ud991", "\ue1b4\ue1be\ue1b6\ue1b2\ue1bf\ue1b3\ue1b4\ue1b2", "\u19c8\u19cb\u19ca\u19cb\u19c7\u19c9\u19c7\u19c9", "\u22d7\u22d0\u22d3\u22d5\u22db\u22d5\u22d7\u22d1", "\u209a\u209f\u209b\u209c\u209d\u2098\u209a\u209b", "\ua1d5\ua1d4\ua1d1\ua1d1\ua1d9\ua1d1\ua1d9\ua1d6", "\ud00c\ud00b\ud009\ud003\ud00d\ud00a\ud00b\ud00c", "\u907a\u907c\u907b\u907a\u907b\u907d\u9073\u907f", "\u9992\u9996\u9994\u9995\u9991\u9990\u9994\u999a", "\ua280\ua28e\ua283\ua285\ua284\ua284\ua286\ua282", "\u09fe\u09fc\u09f8\u09fb\u09fa\u09fa\u09fc\u09f4", "\u4a9a\u4a9c\u4a90\u4a9a\u4a98\u4a90\u4a91\u4a9d", "\u91b8\u91bb\u91ba\u91bc\u91ba\u91b2\u91bd\u91b3"}, d2={"\u059c\u05b1\u0591\u25f1\u05c3\u05c1\u05d7\u05b3\u0595\u059e\u0589\u059e\u05d0\u0593\u059e\u0591\u0598\u05d0\u05ac\u058b\u058d\u0596\u0591\u0598\u05c4\u05d6\u05b3\u0595\u059e\u0589\u059e\u05d0\u0593\u059e\u0591\u0598\u05d0\u05ac\u058b\u058d\u0596\u0591\u0598\u05c4", "\u01ca\u01e7\u01c6\u21a7\u0195\u0197\u0181\u01e5\u01c3\u01c8\u01df\u01c8\u0186\u01c5\u01c8\u01c7\u01ce\u0186\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0192\u0180\u01e5\u01c3\u01c8\u01df\u01c8\u0186\u01c5\u01c8\u01c7\u01ce\u0186\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0192", "\u07cc\u0793\u079c\u0799\u079e\u0799\u0784\u07ce\u07cc\u07ce\u07d8\u07d9\u07a6", "\u04ba\u04ef\u04e8\u04ef\u04f2\u04b8\u04ba\u04b8\u04ae\u04af\u04d0", "\u05dc\u05de\u05cf\u05f8\u05d7\u05da\u05c8\u05c8\u0587\u0585\u0593\u0592\u05f7\u05d1\u05da\u05cd\u05da\u0594\u05d7\u05da\u05d5\u05dc\u0594\u05f8\u05d7\u05da\u05c8\u05c8\u0580", "\u06d8\u06d1\u06c3\u06d8\u06f3\u06df\u06d4\u06d5\u068c\u068e\u0698\u0699\u06f9", "\u05e7\u05f3\u05f7\u05e3\u05ee\u05f1\u05be\u05bc\u05aa\u05ce\u05e8\u05e3\u05f4\u05e3\u05ad\u05ee\u05e3\u05ec\u05e5\u05ad\u05cd\u05e0\u05e8\u05e7\u05e1\u05f6\u05b9\u05ab\u05d8", "\u07f5\u07fa\u07f9\u07f8\u07f3\u07aa\u07a8\u07be\u07bf\u07da\u07fc\u07f7\u07e0\u07f7\u07b9\u07fa\u07f7\u07f8\u07f1\u07b9\u07d9\u07f4\u07fc\u07f3\u07f5\u07e2\u07ad", "\u01dc\u01c7\u01fb\u01dc\u01da\u01c1\u01c6\u01cf\u0194\u0196\u0180\u0181\u01e4\u01c2\u01c9\u01de\u01c9\u0187\u01c4\u01c9\u01c6\u01cf\u0187\u01fb\u01dc\u01da\u01c1\u01c6\u01cf\u0193", "\u04a2\u04a3\u04b8\u04a5\u04aa\u04b5\u04f0\u04f2\u04e4\u04e5\u049a", "\u0409\u0408\u0413\u040e\u0401\u041e\u0426\u040b\u040b\u045b\u0459\u044f\u044e\u0431", "\u00fc\u00ea\u00e2\u00ff\u00b7\u00b5\u00a3\u00a2\u00dd", "\u065b\u064d\u0645\u0658\u0610\u0612\u0604\u0666\u0605\u067a", "\u0645\u0653\u065b\u0646\u0602\u060e\u060c\u061a\u0678\u061b\u0664", "gqyd,.8ZY9F", "\u0373\u037c\u037b\u0374\u0379\u037c\u036f\u0370\u0329\u032b\u033d\u033c\u0343"})
public final class Class4123 {
    public static long field9562 = 0xFFFFFFFFL;
    public static double field9563;
    public static double field9564;
    public static float field9565;

    static {
        field9564 = Double.longBitsToDouble(4592244536707217360L);
        field9565 = Float.intBitsToFloat(1062904813);
        field9563 = Double.longBitsToDouble(4595160829083487280L);
        aN\u200e = "Replace block exploit allow you place block at air";
        bG\u200e = "Lock";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite twRGNL478rLdLA(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4123.i7Wk48rYWAP3e6Ik(k, 2072215015));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        while (true) {
            block10: {
                block9: {
                    block11: {
                        if (f >= q.length) break block11;
                        v0 = 27850;
                        ** GOTO lbl19
                    }
                    v0 = 27851;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 27849;
lbl19:
                        // 3 sources

                        if (var14_15 == 27850) break block9;
                    } while (var14_15 == 27851);
                    break;
                }
                try {
                    a = Integer.parseInt(Class4123.i7Wk48rYWAP3e6Ik(q[f], m));
                }
                catch (NumberFormatException b) {
                    break block10;
                }
                if (e % 59557 == m.intValue()) {
                    c = Class4123.i7Wk48rYWAP3e6Ik(r[f], l);
                    d = c.split("<>");
                    s = d[0];
                    t = d[1];
                    break;
                }
            }
            ++f;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class4123.i7Wk48rYWAP3e6Ik(k, 2072215015) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String i7Wk48rYWAP3e6Ik(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

