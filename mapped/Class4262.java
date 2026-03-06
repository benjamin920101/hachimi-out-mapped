/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\uc3c3\uc3ce\uc3cd\uc3cd\uc3c3\uc3c9\uc3c9", "\ue593\ue597\ue595\ue59f\ue590\ue59f\ue594\ue592", "\u20a1\u20a7\u20ab\u20aa\u20a2\u20a5\u20a4\u20a4", "\u34f2\u34f2\u34f3\u34f4\u34f7\u34f3\u34f7\u34f9", "\u80d2\u80d7\u80d0\u80d6\u80d5\u80d1\u80de\u80d2", "\ua5d7\ua5d1\ua5d1\ua5dd\ua5d3\ua5dd\ua5dd\ua5d3", "\u677d\u6773\u677f\u677e\u677c\u677f\u6778\u677d", "\u6d21\u6d26\u6d22\u6d20\u6d20\u6d2d\u6d23", "\u8796\u879d\u8799\u8799\u879f\u8798\u879f", "\u3ad3\u3ad7\u3ad4\u3ad5\u3ad2\u3ad6\u3adf\u3ade", "\u0efc\u0ef6\u0ef8\u0ef7\u0ef8\u0ef7\u0ef9\u0ef8", "\u19c2\u19c1\u19c5\u19cf\u19cf\u19c7\u19c6\u19c5", "\uccbb\uccbc\uccbd\uccb8\uccb8", "\u65c5\u65c0\u65ce\u65cf\u65c7\u65ce\u65ce\u65c3", "\u0b8d\u0b88\u0b8a\u0b8a\u0b8c\u0b8c\u0b8c\u0b80", "\u937b\u9377\u937f\u937b\u937f\u9379\u937a\u937c"}, d2={"\u0737\u070a\u2751\u0763\u0761\u0777\u0713\u0735\u073e\u0729\u073e\u0770\u0733\u073e\u0731\u0738\u0770\u070c\u072b\u072d\u0736\u0731\u0738\u0764\u0776\u0713\u0735\u073e\u0729\u073e\u0770\u0733\u073e\u0731\u0738\u0770\u070c\u072b\u072d\u0736\u0731\u0738\u0764", "\u06c6\u06f8\u26a0\u0692\u0690\u0686\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u0616\u0649\u0646\u0643\u0644\u0643\u065e\u0614\u0616\u0614\u0602\u0603\u067c", "\u01b1\u01e4\u01e3\u01e4\u01f9\u01b3\u01b1\u01b3\u01a5\u01a4\u01db", "\u075f\u075d\u074c\u077b\u0754\u0759\u074b\u074b\u0704\u0706\u0710\u0711\u0774\u0752\u0759\u074e\u0759\u0717\u0754\u0759\u0756\u075f\u0717\u077b\u0754\u0759\u074b\u074b\u0703", "\u016c\u0165\u0177\u016c\u0147\u016b\u0160\u0161\u0138\u013a\u012c\u012d\u014d", "\u0279\u026d\u0269\u027d\u0270\u026f\u0220\u0222\u0234\u0250\u0276\u027d\u026a\u027d\u0233\u0270\u027d\u0272\u027b\u0233\u0253\u027e\u0276\u0279\u027f\u0268\u0227\u0235\u0246", "\u01b5\u01ba\u01b9\u01b8\u01b3\u01ea\u01e8\u01fe\u01ff\u019a\u01bc\u01b7\u01a0\u01b7\u01f9\u01ba\u01b7\u01b8\u01b1\u01f9\u0199\u01b4\u01bc\u01b3\u01b5\u01a2\u01ed", "\u05e8\u05f3\u05cf\u05e8\u05ee\u05f5\u05f2\u05fb\u05a0\u05a2\u05b4\u05b5\u05d0\u05f6\u05fd\u05ea\u05fd\u05b3\u05f0\u05fd\u05f2\u05fb\u05b3\u05cf\u05e8\u05ee\u05f5\u05f2\u05fb\u05a7", "\u0727\u0726\u073d\u0720\u072f\u0730\u0775\u0777\u0761\u0760\u071f", "\u0262\u0263\u0278\u0265\u026a\u0275\u024d\u0260\u0260\u0230\u0232\u0224\u0225\u025a", "\u05e6\u05f0\u05f8\u05e5\u05ad\u05af\u05b9\u05b8\u05c7", "\u0662\u0674\u067c\u0661\u0629\u062b\u063d\u065f\u063c\u0643", "\u0593\u0585\u058d\u0590\u05d4\u05d8\u05da\u05cc\u05ae\u05cd\u05b2", "\u06a7\u06b1\u06b9\u06a4\u06ec\u06ee\u06f8\u069a\u0699\u06f9\u0686", "\u044e\u0441\u0446\u0449\u0444\u0441\u0452\u044d\u0414\u0416\u0400\u0401\u047e"})
public final class Class4262 {
    public static double field9949;
    public static double field9950 = 0.16097309879555066;
    public static double field9951;

    /*
     * Unable to fully structure code
     */
    private static CallSite tFogNNlMct5ioW(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block17: {
            o = Class.forName(Class4262.fXzJ3sOOCUfHEe4h(k, 1333150764));
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
                block16: {
                    if (f >= q.length) break block16;
                    v0 = 47997;
                    ** GOTO lbl19
                }
                v0 = 47998;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 47996;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 47998: {
                            continue block11;
                        }
                        case 47997: {
                            try {
                                a = Integer.parseInt(Class4262.fXzJ3sOOCUfHEe4h(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl34
                            }
                            if (e % 59557 == m.intValue()) {
                                c = Class4262.fXzJ3sOOCUfHEe4h(r[f], l);
                                d = c.split("<>");
                                s = d[0];
                                t = d[1];
                                break block10;
                            }
lbl34:
                            // 3 sources

                            ++f;
                            continue block10;
                        }
                    }
                    break;
                }
                break;
            }
            if (s.isEmpty()) {
                throw new Exception("Can't find method in " + Class4262.fXzJ3sOOCUfHEe4h(k, 1333150764) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block17;
            v1 = 5598;
            ** GOTO lbl47
        }
        v1 = 5599;
        if (true) ** GOTO lbl47
        block12: while (true) {
            v1 = 5597;
lbl47:
            // 3 sources

            switch (v1) {
                case 5599: {
                    continue block12;
                }
                case 5598: {
                    g = h.findVirtual(o, s, u);
                    break block12;
                }
                default: {
                    v = h.findStatic(o, s, u);
                }
            }
            break;
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String fXzJ3sOOCUfHEe4h(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        n\u200e = "";
        W\u200e = "Render";
        field9949 = Double.longBitsToDouble(4602424005209642248L);
        field9951 = Double.longBitsToDouble(4599530012492851848L);
    }
}

