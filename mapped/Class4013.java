/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u9096\u9098\u909b\u909b\u9097\u909c\u909f", "\u6105\u6106\u6107\u610e\u6104\u610f\u6105", "\ua195\ua194\ua19b\ua192\ua194\ua191\ua197\ua196", "\ua66f\ua669\ua66b\ua66c\ua66d\ua66e\ua668\ua66b", "\u8479\u847d\u8478\u8474\u847f\u847c\u8475\u847b", "\u1889\u188c\u188f\u188e\u1888\u1889\u188b\u188e", "\u0829\u0820\u082d\u082a\u082c\u082a\u0821\u0821", "\u679d\u679a\u6799\u679e\u679f\u6794\u679e\u6795", "\u7174\u7171\u7171\u7171\u7174\u7172\u717c\u7174", "\u09a6\u09a6\u09a2\u09ab\u09a4\u09a4\u09aa", "\u17f9\u17f4\u17ff\u17fd\u17fd\u17fc\u17fa\u17f8", "\ucb00\ucb04\ucb00\ucb05\ucb0c\ucb07\ucb03\ucb0c", "\u7e15\u7e15\u7e19\u7e16\u7e19\u7e16\u7e10\u7e11", "\ud185\ud18b\ud185\ud185\ud180\ud180\ud187\ud184", "\u23b9\u23bf\u23be\u23b8\u23b9\u23bc\u23bf\u23b5"}, d2={"\u03da\u03d9\u03ee\u23a6\u0394\u0396\u0380\u03e4\u03c2\u03c9\u03de\u03c9\u0387\u03c4\u03c9\u03c6\u03cf\u0387\u03fb\u03dc\u03da\u03c1\u03c6\u03cf\u0393\u0381\u03e4\u03c2\u03c9\u03de\u03c9\u0387\u03c4\u03c9\u03c6\u03cf\u0387\u03fb\u03dc\u03da\u03c1\u03c6\u03cf\u0393", "\u05e0\u05bf\u05b0\u05b5\u05b2\u05b5\u05a8\u05e2\u05e0\u05e2\u05f4\u05f5\u058a", "\u0727\u0772\u0775\u0772\u076f\u0725\u0727\u0725\u0733\u0732\u074d", "\u05da\u05d8\u05c9\u05fe\u05d1\u05dc\u05ce\u05ce\u0581\u0583\u0595\u0594\u05f1\u05d7\u05dc\u05cb\u05dc\u0592\u05d1\u05dc\u05d3\u05da\u0592\u05fe\u05d1\u05dc\u05ce\u05ce\u0586", "\u00fe\u00f7\u00e5\u00fe\u00d5\u00f9\u00f2\u00f3\u00aa\u00a8\u00be\u00bf\u00df", "\u0188\u019c\u0198\u018c\u0181\u019e\u01d1\u01d3\u01c5\u01a1\u0187\u018c\u019b\u018c\u01c2\u0181\u018c\u0183\u018a\u01c2\u01a2\u018f\u0187\u0188\u018e\u0199\u01d6\u01c4\u01b7", "\u0540\u054f\u054c\u054d\u0546\u051f\u051d\u050b\u050a\u056f\u0549\u0542\u0555\u0542\u050c\u054f\u0542\u054d\u0544\u050c\u056c\u0541\u0549\u0546\u0540\u0557\u0518", "\u041e\u0405\u0439\u041e\u0418\u0403\u0404\u040d\u0456\u0454\u0442\u0443\u0426\u0400\u040b\u041c\u040b\u0445\u0406\u040b\u0404\u040d\u0445\u0439\u041e\u0418\u0403\u0404\u040d\u0451", "\u0139\u0138\u0123\u013e\u0131\u012e\u016b\u0169\u017f\u017e\u0101", "\u047d\u047c\u0467\u047a\u0475\u046a\u0452\u047f\u047f\u042f\u042d\u043b\u043a\u0445", "\u03c7\u03d1\u03d9\u03c4\u038c\u038e\u0398\u0399\u03e6", "\u05cd\u05db\u05d3\u05ce\u0586\u0584\u0592\u05f0\u0593\u05ec", "\u02b9\u02af\u02a7\u02ba\u02fe\u02f2\u02f0\u02e6\u0284\u02e7\u0298", "\u00a4\u00b2\u00ba\u00a7\u00ef\u00ed\u00fb\u0099\u009a\u00fa\u0085", "\u07e5\u07ea\u07ed\u07e2\u07ef\u07ea\u07f9\u07e6\u07bf\u07bd\u07ab\u07aa\u07d5"})
public final class Class4013 {
    public static float field9221 = 0.45893425f;
    public static double field9222;
    public static float field9223 = 0.07634449f;

    /*
     * Unable to fully structure code
     */
    private static CallSite 7eeme4OtrA1Ne3(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block18: {
            o = Class.forName(Class4013.9sGSfnyxVu8NNbtV(k, 1991210122));
            p = o.getAnnotation(HACHIMI_CLIENT.class);
            if (p.mv() < 100) {
                throw new Exception("Outdated metadata version");
            }
            q = p.d1();
            r = p.d2();
            s = "";
            t = "";
            f = 0;
            block10: while (true) {
                block17: {
                    if (f >= q.length) break block17;
                    v0 = 64806;
                    ** GOTO lbl19
                }
                v0 = 64807;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 64805;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 64807: {
                            continue block11;
                        }
                        case 64806: {
                            try {
                                a = Integer.parseInt(Class4013.9sGSfnyxVu8NNbtV(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl44
                            }
                            if (e % 59557 != m.intValue()) ** GOTO lbl31
                            v1 = 10228;
                            ** GOTO lbl35
lbl31:
                            // 1 sources

                            v1 = 10229;
                            if (true) ** GOTO lbl35
                            while (true) {
                                v1 = var16_19 = 10227;
lbl35:
                                // 3 sources

                                if (var16_19 == 10228) break;
                                if (var16_19 == 10229) {
                                    continue;
                                }
                                ** GOTO lbl44
                                break;
                            }
                            c = Class4013.9sGSfnyxVu8NNbtV(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block10;
lbl44:
                            // 2 sources

                            ++f;
                            continue block10;
                        }
                    }
                    break;
                }
                break;
            }
            if (s.isEmpty()) {
                throw new Exception("Can't find method in " + Class4013.9sGSfnyxVu8NNbtV(k, 1991210122) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block18;
            v2 = 15558;
            ** GOTO lbl57
        }
        v2 = 15559;
        if (true) ** GOTO lbl57
        block13: while (true) {
            v2 = 15557;
lbl57:
            // 3 sources

            switch (v2) {
                case 15559: {
                    continue block13;
                }
                case 15558: {
                    g = h.findVirtual(o, s, u);
                    break block13;
                }
                default: {
                    v = h.findStatic(o, s, u);
                }
            }
            break;
        }
        return new ConstantCallSite(v.asType(j));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 9sGSfnyxVu8NNbtV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block0: while (true) {
            int n2 = d2 >= a2.length() ? 57543 : 57542;
            while (true) {
                int n3;
                if ((n3 = n2) == 57542) {
                    c2.append((char)(a2.charAt(d2) ^ b2));
                    ++d2;
                    continue block0;
                }
                if (n3 != 57543) {
                    return c2.toString();
                }
                n2 = 57541;
            }
            break;
        }
    }

    static {
        aO\u200e = "HIDE";
        field9222 = Double.longBitsToDouble(4600920913428929126L);
    }
}

