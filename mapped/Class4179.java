/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u7f44\u7f42\u7f44\u7f4a\u7f47\u7f45\u7f44", "\u8789\u8789\u878e\u878c\u8780\u878b\u878d\u8781", "\u8fee\u8fed\u8fe0\u8fe0\u8fe8\u8fe1\u8fec", "\uce12\uce11\uce12\uce16\uce16\uce13\uce1e\uce1f", "\u4f31\u4f39\u4f38\u4f35\u4f36\u4f30\u4f35", "\u1423\u1427\u1424\u1421\u1426\u1422\u1422", "\u8141\u814a\u8147\u8142\u8144\u814b\u8144\u8142", "\ud398\ud39e\ud399\ud39c\ud39a\ud39f\ud39b\ud39c", "\u2b9f\u2b9c\u2b99\u2b9c\u2b98\u2b9f\u2b9a\u2b98", "\u2b09\u2b02\u2b02\u2b0d\u2b03\u2b09\u2b08\u2b03", "\u0ad1\u0ad3\u0ad3\u0ad6\u0ad0\u0adc\u0ad7\u0ad5", "\u3ba4\u3ba1\u3ba5\u3ba2\u3ba6\u3ba4\u3ba7\u3ba7", "\udc23\udc2a\udc27\udc23\udc2b\udc22\udc22\udc2a", "\u0424\u042b\u0422\u042b\u0424\u0427\u0426", "\u957a\u9579\u9570\u957a\u957a\u957e\u9570"}, d2={"\u063f\u060c\u060a\u2656\u0664\u0666\u0670\u0614\u0632\u0639\u062e\u0639\u0677\u0634\u0639\u0636\u063f\u0677\u060b\u062c\u062a\u0631\u0636\u063f\u0663\u0671\u0614\u0632\u0639\u062e\u0639\u0677\u0634\u0639\u0636\u063f\u0677\u060b\u062c\u062a\u0631\u0636\u063f\u0663", "\u018e\u01d1\u01de\u01db\u01dc\u01db\u01c6\u018c\u018e\u018c\u019a\u019b\u01e4", "\u0520\u0575\u0572\u0575\u0568\u0522\u0520\u0522\u0534\u0535\u054a", "RPAvYTFF\t\u000b\u001d\u001cy_TCT\u001aYT[R\u001avYTFF\u000e", "\u014e\u0147\u0155\u014e\u0165\u0149\u0142\u0143\u011a\u0118\u010e\u010f\u016f", "\u04a2\u04b6\u04b2\u04a6\u04ab\u04b4\u04fb\u04f9\u04ef\u048b\u04ad\u04a6\u04b1\u04a6\u04e8\u04ab\u04a6\u04a9\u04a0\u04e8\u0488\u04a5\u04ad\u04a2\u04a4\u04b3\u04fc\u04ee\u049d", "\u04fb\u04f4\u04f7\u04f6\u04fd\u04a4\u04a6\u04b0\u04b1\u04d4\u04f2\u04f9\u04ee\u04f9\u04b7\u04f4\u04f9\u04f6\u04ff\u04b7\u04d7\u04fa\u04f2\u04fd\u04fb\u04ec\u04a3", "\u032d\u0336\u030a\u032d\u032b\u0330\u0337\u033e\u0365\u0367\u0371\u0370\u0315\u0333\u0338\u032f\u0338\u0376\u0335\u0338\u0337\u033e\u0376\u030a\u032d\u032b\u0330\u0337\u033e\u0362", "\u05fe\u05ff\u05e4\u05f9\u05f6\u05e9\u05ac\u05ae\u05b8\u05b9\u05c6", "\u01d6\u01d7\u01cc\u01d1\u01de\u01c1\u01f9\u01d4\u01d4\u0184\u0186\u0190\u0191\u01ee", "\u0202\u0214\u021c\u0201\u0249\u024b\u025d\u025c\u0223", "&08%moy\u001bx\u0007", "\u0687\u0691\u0699\u0684\u06c0\u06cc\u06ce\u06d8\u06ba\u06d9\u06a6", "\u05ee\u05f8\u05f0\u05ed\u05a5\u05a7\u05b1\u05d3\u05d0\u05b0\u05cf", "\u06b8\u06b7\u06b0\u06bf\u06b2\u06b7\u06a4\u06bb\u06e2\u06e0\u06f6\u06f7\u0688"})
public final class Class4179 {
    public static double field9746;
    public static int field9747 = 0;
    public static int field9748 = 656265991;
    public static int field9749 = 984858079;

    /*
     * Unable to fully structure code
     */
    private static CallSite YYrjOj0z43hbfh(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class4179.XtD1MHOsb2R3oVOC(k, -967916371));
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
                                a = Integer.parseInt(Class4179.XtD1MHOsb2R3oVOC(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class4179.XtD1MHOsb2R3oVOC(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class4179.XtD1MHOsb2R3oVOC(k, -967916371) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 19601;
                        ** GOTO lbl32
                    }
                    v0 = 19602;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 19600;
lbl32:
                        // 3 sources

                        if (var17_20 == 19601) break block6;
                    } while (var17_20 == 19602);
                    break block8;
                }
                g = h.findVirtual(o, s, u);
                break block9;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String XtD1MHOsb2R3oVOC(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aW\u200e = "Snap back to bypass the grim check";
        field9746 = Double.longBitsToDouble(-4633526625599513961L);
    }
}

