/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ud43a\ud438\ud43b\ud43f\ud432\ud433\ud43b", "\ub06c\ub06d\ub06c\ub06a\ub060\ub061\ub069\ub069", "\ub5ab\ub5a8\ub5af\ub5ac\ub5a9\ub5a6\ub5a9\ub5a7", "\ue813\ue81b\ue812\ue817\ue814\ue81b\ue811", "\u4c5a\u4c57\u4c59\u4c5a\u4c57\u4c58\u4c58\u4c5f", "\u5e8f\u5e8f\u5e88\u5e8a\u5e8f\u5e8d\u5e82", "\u7345\u7342\u734f\u7346\u7340\u7340\u7343\u7347", "\u6c04\u6c00\u6c06\u6c0e\u6c06\u6c05\u6c00\u6c06", "\u0c57\u0c50\u0c52\u0c52\u0c56\u0c5f\u0c56\u0c50", "\u4193\u4197\u4196\u4196\u4190\u4192\u4194\u4197", "\u8850\u8856\u8856\u8850\u885e\u8855\u8851\u8852", "\u2373\u2375\u2375\u2379\u2377\u2378\u2374\u2373", "\ubcc6\ubcc1\ubcc0\ubcc3\ubccf\ubcce", "\ud8db\ud8df\ud8de\ud8dd\ud8d8\ud8dd\ud8dc\ud8d8", "\u3395\u3393\u3396\u3395\u3394\u3391\u3395\u339e", "\ua94a\ua948\ua949\ua94f\ua94b\ua94e\ua94d\ua948", "\u563b\u563d\u563f\u563d\u563e\u563a\u563a\u563c", "\u14b8\u14bb\u14b6\u14bf\u14bb\u14b9\u14ba\u14b9"}, d2={"\u059b\u05b0\u05a5\u25f9\u05cb\u05c9\u05df\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc\u05de\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc", "\u06d2\u06f9\u06ed\u26b0\u0682\u0680\u0696\u06f2\u06d4\u06df\u06c8\u06df\u0691\u06d2\u06df\u06d0\u06d9\u0691\u06ed\u06ca\u06cc\u06d7\u06d0\u06d9\u0685\u0697\u06f2\u06d4\u06df\u06c8\u06df\u0691\u06d2\u06df\u06d0\u06d9\u0691\u06ed\u06ca\u06cc\u06d7\u06d0\u06d9\u0685", "\u017a\u0151\u0142\u2118\u012a\u0128\u013e\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0145\u0162\u0164\u017f\u0178\u0171\u012d\u013f\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0145\u0162\u0164\u017f\u0178\u0171\u012d", "\u0717\u073c\u072e\u2775\u0747\u0745\u0753\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0728\u070f\u0709\u0712\u0715\u071c\u0740\u0752\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0728\u070f\u0709\u0712\u0715\u071c\u0740", "\u0281\u02de\u02d1\u02d4\u02d3\u02d4\u02c9\u0283\u0281\u0283\u0295\u0294\u02eb", "\u037c\u0329\u032e\u0329\u0334\u037e\u037c\u037e\u0368\u0369\u0316", "\u0364\u0366\u0377\u0340\u036f\u0362\u0370\u0370\u033f\u033d\u032b\u032a\u034f\u0369\u0362\u0375\u0362\u032c\u036f\u0362\u036d\u0364\u032c\u0340\u036f\u0362\u0370\u0370\u0338", "QXJQzV]\\\u0005\u0007\u0011\u0010p", "\u00a0\u00b4\u00b0\u00a4\u00a9\u00b6\u00f9\u00fb\u00ed\u0089\u00af\u00a4\u00b3\u00a4\u00ea\u00a9\u00a4\u00ab\u00a2\u00ea\u008a\u00a7\u00af\u00a0\u00a6\u00b1\u00fe\u00ec\u009f", "\u05f3\u05fc\u05ff\u05fe\u05f5\u05ac\u05ae\u05b8\u05b9\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05df\u05f2\u05fa\u05f5\u05f3\u05e4\u05ab", "\u02f4\u02ef\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bc\u02be\u02a8\u02a9\u02cc\u02ea\u02e1\u02f6\u02e1\u02af\u02ec\u02e1\u02ee\u02e7\u02af\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bb", "\u0250\u0251\u024a\u0257\u0258\u0247\u0202\u0200\u0216\u0217\u0268", "\u038a\u038b\u0390\u038d\u0382\u039d\u03a5\u0388\u0388\u03d8\u03da\u03cc\u03cd\u03b2", "\u0482\u0494\u049c\u0481\u04c9\u04cb\u04dd\u04dc\u04a3", "QGOR\u001a\u0018\u000el\u000fp", "\u071d\u070b\u0703\u071e\u075a\u0756\u0754\u0742\u0720\u0743\u073c", "\u009b\u008d\u0085\u0098\u00d0\u00d2\u00c4\u00a6\u00a5\u00c5\u00ba", "\u037e\u0371\u0376\u0379\u0374\u0371\u0362\u037d\u0324\u0326\u0330\u0331\u034e"})
public final class Class1687 {
    public static float field6252;
    public static float field6253;
    public static float field6254;
    public static double field6255;
    public static double field6256;

    /*
     * Unable to fully structure code
     */
    private static CallSite eFSrMFOCrbjek2(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class1687.nPQwHDNqBTY4cLcM(k, 1864333997));
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
                                a = Integer.parseInt(Class1687.nPQwHDNqBTY4cLcM(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class1687.nPQwHDNqBTY4cLcM(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class1687.nPQwHDNqBTY4cLcM(k, 1864333997) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 64751;
                        ** GOTO lbl32
                    }
                    v0 = 64752;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 64750;
lbl32:
                        // 3 sources

                        if (var17_20 == 64751) break block6;
                    } while (var17_20 == 64752);
                    break block8;
                }
                g = h.findVirtual(o, s, u);
                break block9;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String nPQwHDNqBTY4cLcM(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        m\u200e = "Displays player equipped armor and durability";
        field6253 = Float.intBitsToFloat(1041394452);
        F\u200e = ", ";
        field6256 = Double.longBitsToDouble(4603178952005870026L);
        field6254 = Float.intBitsToFloat(1064943221);
        field6255 = Double.longBitsToDouble(4604110025060577989L);
        av\u200e = "Renders the trajectory path of projectiles";
        field6252 = Float.intBitsToFloat(1050441878);
        bi\u200e = "The distance of your entity reach";
    }
}

