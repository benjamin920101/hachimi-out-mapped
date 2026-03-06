/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ue1f8\ue1fa\ue1fa\ue1f5\ue1fc\ue1f5\ue1ff\ue1f9", "\ub35b\ub354\ub35a\ub354\ub351\ub352", "\u5d15\u5d12\u5d13\u5d11\u5d14\u5d18\u5d18\u5d16", "\u6be9\u6be3\u6be3\u6bed\u6be8\u6bef\u6bec", "\u19fd\u19fc\u19fb\u19fd\u19fc\u19fc\u19f3\u19fe", "\udea7\udea7\udea2\udea1\udead\udea4\udeac\udead", "\u52f2\u52ff\u52fe\u52f7\u52f6\u52fe\u52f2\u52f4", "\u3446\u3445\u3446\u3440\u3442\u3445\u344b\u344a", "\u49a2\u49a5\u49a2\u49a9\u49a2\u49a3\u49a3\u49a3", "\u79d1\u79d7\u79da\u79da\u79d6\u79d7\u79d3\u79d4", "\u4ff7\u4ff5\u4ff6\u4ff6\u4ffc\u4ff6\u4ffc\u4ffc", "\u7b20\u7b25\u7b21\u7b23\u7b21\u7b23\u7b26\u7b26", "\u555c\u5551\u555c\u5551\u555d\u555c\u5558", "\ua1dc\ua1dd\ua1dd\ua1d9\ua1da\ua1dd\ua1df\ua1d4", "\ud3fb\ud3fc\ud3fb\ud3fe\ud3fe\ud3f8\ud3fe\ud3f6", "\u2c9b\u2c99\u2c97\u2c97\u2c9d\u2c98\u2c96\u2c97", "\u2152\u2153\u2154\u2157\u2154\u2155\u2157\u2155", "\u4e91\u4e93\u4e92\u4e95\u4e95\u4e9e\u4e96"}, d2={"\u0711\u071e\u0711\u2777\u0745\u0747\u0751\u0735\u0713\u0718\u070f\u0718\u0756\u0715\u0718\u0717\u071e\u0756\u072a\u070d\u070b\u0710\u0717\u071e\u0742\u0750\u0735\u0713\u0718\u070f\u0718\u0756\u0715\u0718\u0717\u071e\u0756\u072a\u070d\u070b\u0710\u0717\u071e\u0742", "\u01e0\u01ef\u01e1\u2186\u01b4\u01b6\u01a0\u01c4\u01e2\u01e9\u01fe\u01e9\u01a7\u01e4\u01e9\u01e6\u01ef\u01a7\u01db\u01fc\u01fa\u01e1\u01e6\u01ef\u01b3\u01a1\u01c4\u01e2\u01e9\u01fe\u01e9\u01a7\u01e4\u01e9\u01e6\u01ef\u01a7\u01db\u01fc\u01fa\u01e1\u01e6\u01ef\u01b3", "\u0163\u016c\u0161\u2105\u0137\u0135\u0123\u0147\u0161\u016a\u017d\u016a\u0124\u0167\u016a\u0165\u016c\u0124\u0158\u017f\u0179\u0162\u0165\u016c\u0130\u0122\u0147\u0161\u016a\u017d\u016a\u0124\u0167\u016a\u0165\u016c\u0124\u0158\u017f\u0179\u0162\u0165\u016c\u0130", "\u0152\u015d\u0151\u2134\u0106\u0104\u0112\u0176\u0150\u015b\u014c\u015b\u0115\u0156\u015b\u0154\u015d\u0115\u0169\u014e\u0148\u0153\u0154\u015d\u0101\u0113\u0176\u0150\u015b\u014c\u015b\u0115\u0156\u015b\u0154\u015d\u0115\u0169\u014e\u0148\u0153\u0154\u015d\u0101", "\u0581\u05de\u05d1\u05d4\u05d3\u05d4\u05c9\u0583\u0581\u0583\u0595\u0594\u05eb", "\u06e3\u06b6\u06b1\u06b6\u06ab\u06e1\u06e3\u06e1\u06f7\u06f6\u0689", "\u02af\u02ad\u02bc\u028b\u02a4\u02a9\u02bb\u02bb\u02f4\u02f6\u02e0\u02e1\u0284\u02a2\u02a9\u02be\u02a9\u02e7\u02a4\u02a9\u02a6\u02af\u02e7\u028b\u02a4\u02a9\u02bb\u02bb\u02f3", "\u0313\u031a\u0308\u0313\u0338\u0314\u031f\u031e\u0347\u0345\u0353\u0352\u0332", "\u07ff\u07eb\u07ef\u07fb\u07f6\u07e9\u07a6\u07a4\u07b2\u07d6\u07f0\u07fb\u07ec\u07fb\u07b5\u07f6\u07fb\u07f4\u07fd\u07b5\u07d5\u07f8\u07f0\u07ff\u07f9\u07ee\u07a1\u07b3\u07c0", "\u016e\u0161\u0162\u0163\u0168\u0131\u0133\u0125\u0124\u0141\u0167\u016c\u017b\u016c\u0122\u0161\u016c\u0163\u016a\u0122\u0142\u016f\u0167\u0168\u016e\u0179\u0136", "\u0399\u0382\u03be\u0399\u039f\u0384\u0383\u038a\u03d1\u03d3\u03c5\u03c4\u03a1\u0387\u038c\u039b\u038c\u03c2\u0381\u038c\u0383\u038a\u03c2\u03be\u0399\u039f\u0384\u0383\u038a\u03d6", "\u063e\u063f\u0624\u0639\u0636\u0629\u066c\u066e\u0678\u0679\u0606", "\u055c\u055d\u0546\u055b\u0554\u054b\u0573\u055e\u055e\u050e\u050c\u051a\u051b\u0564", "\u010b\u011d\u0115\u0108\u0140\u0142\u0154\u0155\u012a", "\u0251\u0247\u024f\u0252\u021a\u0218\u020e\u026c\u020f\u0270", "\u030d\u031b\u0313\u030e\u034a\u0346\u0344\u0352\u0330\u0353\u032c", "\u070a\u071c\u0714\u0709\u0741\u0743\u0755\u0737\u0734\u0754\u072b", "\u0663\u066c\u066b\u0664\u0669\u066c\u067f\u0660\u0639\u063b\u062d\u062c\u0653"})
public final class Class5488 {
    public static double field10293 = Double.longBitsToDouble(4607134834640241116L);
    public static double field10294;

    /*
     * Unable to fully structure code
     */
    private static CallSite tvHXlvZlIcAaJE(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5488.wTq264pLSbJ69iVl(k, -1467560114));
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
                        a = Integer.parseInt(Class5488.wTq264pLSbJ69iVl(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 1098;
                    ** GOTO lbl23
                }
                v0 = 1099;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 1097;
lbl23:
                    // 3 sources

                    if (var16_19 == 1098) break block8;
                } while (var16_19 == 1099);
                continue;
            }
            c = Class5488.wTq264pLSbJ69iVl(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class5488.wTq264pLSbJ69iVl(k, -1467560114) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String wTq264pLSbJ69iVl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        U\u200e = "dimension";
        aC\u200e = "The fog start distance";
        aO\u200e = "SwapAction";
        field10294 = Double.longBitsToDouble(4596967134284921996L);
        bJ\u200e = "Prevents block break particles from rendering";
    }
}

