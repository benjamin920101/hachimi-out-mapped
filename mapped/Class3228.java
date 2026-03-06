/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ud426\ud425\ud426\ud428\ud426\ud421\ud420\ud422", "\u137d\u137c\u1376\u137d\u1371\u137d\u1376", "\u64f0\u64fd\u64f6\u64f5\u64fd\u64fc\u64f3\u64fc", "\ua654\ua65e\ua653\ua651\ua65e\ua654\ua654\ua654", "\u5509\u550e\u550b\u550d\u5509\u550d\u550f\u550e", "\u30a3\u30a5\u30a5\u30a1\u30a0\u30ad\u30ac\u30a6", "\u1122\u1121\u1124\u1125\u1125\u1126\u1121\u1123", "\u3b3d\u3b37\u3b38\u3b3c\u3b37\u3b3a\u3b3a", "\u22d7\u22d2\u22db\u22d1\u22d2\u22d3\u22d4\u22d7", "\uc3db\uc3dc\uc3df\uc3d2\uc3db\uc3d3\uc3d9", "\ud2e4\ud2e9\ud2ed\ud2e9\ud2e9\ud2ee\ud2ed", "\u43d2\u43d5\u43d1\u43d5\u43d4\u43d4\u43d4\u43d6", "\ua47d\ua47a\ua479\ua47d\ua47b\ua47b\ua478\ua478", "\u2fdb\u2fde\u2fdf\u2fdb\u2fde\u2fdb\u2fd6", "\ucded\ucde1\ucde1\ucdeb\ucde0\ucde1\ucde1\ucde9", "\ub806\ub806\ub80b\ub806\ub801\ub803\ub805\ub807", "\u61cf\u61c8\u61cb\u61c8\u61ca\u61c4\u61cd\u61c9"}, d2={"\u04b0\u04ac\u0499\u24d0\u04e2\u04e0\u04f6\u0492\u04b4\u04bf\u04a8\u04bf\u04f1\u04b2\u04bf\u04b0\u04b9\u04f1\u048d\u04aa\u04ac\u04b7\u04b0\u04b9\u04e5\u04f7\u0492\u04b4\u04bf\u04a8\u04bf\u04f1\u04b2\u04bf\u04b0\u04b9\u04f1\u048d\u04aa\u04ac\u04b7\u04b0\u04b9\u04e5", "\u0092\u008e\u00b4\u20f2\u00c0\u00c2\u00d4\u00b0\u0096\u009d\u008a\u009d\u00d3\u0090\u009d\u0092\u009b\u00d3\u00af\u0088\u008e\u0095\u0092\u009b\u00c7\u00d5\u00b0\u0096\u009d\u008a\u009d\u00d3\u0090\u009d\u0092\u009b\u00d3\u00af\u0088\u008e\u0095\u0092\u009b\u00c7", "\u05f8\u05e4\u05df\u2598\u05aa\u05a8\u05be\u05da\u05fc\u05f7\u05e0\u05f7\u05b9\u05fa\u05f7\u05f8\u05f1\u05b9\u05c5\u05e2\u05e4\u05ff\u05f8\u05f1\u05ad\u05bf\u05da\u05fc\u05f7\u05e0\u05f7\u05b9\u05fa\u05f7\u05f8\u05f1\u05b9\u05c5\u05e2\u05e4\u05ff\u05f8\u05f1\u05ad", "\u014e\u0111\u011e\u011b\u011c\u011b\u0106\u014c\u014e\u014c\u015a\u015b\u0124", "\u059d\u05c8\u05cf\u05c8\u05d5\u059f\u059d\u059f\u0589\u0588\u05f7", "\u00fa\u00f8\u00e9\u00de\u00f1\u00fc\u00ee\u00ee\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00de\u00f1\u00fc\u00ee\u00ee\u00a6", "\u01f2\u01fb\u01e9\u01f2\u01d9\u01f5\u01fe\u01ff\u01a6\u01a4\u01b2\u01b3\u01d3", "\u0340\u0354\u0350\u0344\u0349\u0356\u0319\u031b\u030d\u0369\u034f\u0344\u0353\u0344\u030a\u0349\u0344\u034b\u0342\u030a\u036a\u0347\u034f\u0340\u0346\u0351\u031e\u030c\u037f", "\u0218\u0217\u0214\u0215\u021e\u0247\u0245\u0253\u0252\u0237\u0211\u021a\u020d\u021a\u0254\u0217\u021a\u0215\u021c\u0254\u0234\u0219\u0211\u021e\u0218\u020f\u0240", "\u075d\u0746\u077a\u075d\u075b\u0740\u0747\u074e\u0715\u0717\u0701\u0700\u0765\u0743\u0748\u075f\u0748\u0706\u0745\u0748\u0747\u074e\u0706\u077a\u075d\u075b\u0740\u0747\u074e\u0712", "\u0365\u0364\u037f\u0362\u036d\u0372\u0337\u0335\u0323\u0322\u035d", "\u0197\u0196\u018d\u0190\u019f\u0180\u01b8\u0195\u0195\u01c5\u01c7\u01d1\u01d0\u01af", "\u03bc\u03aa\u03a2\u03bf\u03f7\u03f5\u03e3\u03e2\u039d", "\u0507\u0511\u0519\u0504\u054c\u054e\u0558\u053a\u0559\u0526", "\u026a\u027c\u0274\u0269\u022d\u0221\u0223\u0235\u0257\u0234\u024b", "\u05b8\u05ae\u05a6\u05bb\u05f3\u05f1\u05e7\u0585\u0586\u05e6\u0599", "\u03b1\u03be\u03b9\u03b6\u03bb\u03be\u03ad\u03b2\u03eb\u03e9\u03ff\u03fe\u0381"})
public final class Class3228 {
    public static int field6928 = 12069615;
    public static double field6929;

    static {
        a\u200e = "STATIC_HUE";
        c\u200e = "Ignore";
        field6929 = Double.longBitsToDouble(4594000916397416280L);
        D\u200e = "There are no entities in the list!";
    }

    private static String gCoaWgDXV1D5vMhC(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite sjVA9mOLoeLSNW(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class3228.gCoaWgDXV1D5vMhC(k, -1971426060));
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
                                a = Integer.parseInt(Class3228.gCoaWgDXV1D5vMhC(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class3228.gCoaWgDXV1D5vMhC(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class3228.gCoaWgDXV1D5vMhC(k, -1971426060) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 4105;
                        ** GOTO lbl32
                    }
                    v0 = 4106;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 4104;
lbl32:
                        // 3 sources

                        if (var17_20 == 4105) break block6;
                    } while (var17_20 == 4106);
                    break block8;
                }
                g = h.findVirtual(o, s, u);
                break block9;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

