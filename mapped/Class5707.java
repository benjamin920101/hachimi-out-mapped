/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u55fc\u55fe\u55f6\u55fe\u55f9\u55fd\u55fb\u55f7", "\ua2dd\ua2da\ua2d3\ua2db\ua2d9\ua2d8\ua2da\ua2dd", "\u266d\u2661\u266b\u266c\u2669\u2660\u2661\u266e", "\u798e\u7989\u798f\u798a\u798b\u7989\u7989\u798d", "\ua387\ua380\ua382\ua389\ua384\ua387\ua380\ua384", "\u091d\u091a\u091d\u0918\u091e\u091e\u0915\u0919", "\u6986\u6980\u6983\u6980\u6987\u6986\u6985\u6981", "\u4742\u4742\u474f\u474f\u4745\u4740\u4741\u4746", "\u749a\u7499\u749c\u749c\u749e\u749b\u749d\u749e", "\u0283\u0282\u028f\u0281\u0287\u028e\u0286\u0283", "\u4cd8\u4cdf\u4cdf\u4cdf\u4cd8\u4cdd\u4cd8\u4cdc", "\u0889\u0882\u088b\u0889\u0882\u0882\u0888", "\u5752\u5753\u5750\u5759\u5752\u5750\u5755\u5758", "\u1b8d\u1b8e\u1b8d\u1b80\u1b8e\u1b8a\u1b8c\u1b8e"}, d2={"\u0435\u046a\u0465\u0460\u0467\u0460\u047d\u0437\u0435\u0437\u0421\u0420\u045f", "\u051c\u0549\u054e\u0549\u0554\u051e\u051c\u051e\u0508\u0509\u0576", "\u024d\u024f\u025e\u0269\u0246\u024b\u0259\u0259\u0216\u0214\u0202\u0203\u0266\u0240\u024b\u025c\u024b\u0205\u0246\u024b\u0244\u024d\u0205\u0269\u0246\u024b\u0259\u0259\u0211", "\u00a4\u00ad\u00bf\u00a4\u008f\u00a3\u00a8\u00a9\u00f0\u00f2\u00e4\u00e5\u0085", "\u05dc\u05c8\u05cc\u05d8\u05d5\u05ca\u0585\u0587\u0591\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05f6\u05db\u05d3\u05dc\u05da\u05cd\u0582\u0590\u05e3", "\u049d\u0492\u0491\u0490\u049b\u04c2\u04c0\u04d6\u04d7\u04b2\u0494\u049f\u0488\u049f\u04d1\u0492\u049f\u0490\u0499\u04d1\u04b1\u049c\u0494\u049b\u049d\u048a\u04c5", "\u05b6\u05ad\u0591\u05b6\u05b0\u05ab\u05ac\u05a5\u05fe\u05fc\u05ea\u05eb\u058e\u05a8\u05a3\u05b4\u05a3\u05ed\u05ae\u05a3\u05ac\u05a5\u05ed\u0591\u05b6\u05b0\u05ab\u05ac\u05a5\u05f9", "\u0151\u0150\u014b\u0156\u0159\u0146\u0103\u0101\u0117\u0116\u0169", "\u07e2\u07e3\u07f8\u07e5\u07ea\u07f5\u07cd\u07e0\u07e0\u07b0\u07b2\u07a4\u07a5\u07da", "\u063f\u0629\u0621\u063c\u0674\u0676\u0660\u0661\u061e", "\u01b9\u01af\u01a7\u01ba\u01f2\u01f0\u01e6\u0184\u01e7\u0198", "\u0392\u0384\u038c\u0391\u03d5\u03d9\u03db\u03cd\u03af\u03cc\u03b3", "\u0399\u038f\u0387\u039a\u03d2\u03d0\u03c6\u03a4\u03a7\u03c7\u03b8", "\u01b6\u01b9\u01be\u01b1\u01bc\u01b9\u01aa\u01b5\u01ec\u01ee\u01f8\u01f9\u0186"})
public final class Class5707 {
    public static float field10991;
    public static float field10992;
    public static float field10993;

    /*
     * Enabled aggressive block sorting
     */
    private static String ibjo14BbJSLAjbpA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 6776 : 6777;
            block5: while (true) {
                switch (n2) {
                    case 6777: {
                        n2 = 6775;
                        continue block5;
                    }
                    case 6776: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        field10992 = Float.intBitsToFloat(1054726334);
        field10991 = Float.intBitsToFloat(1064264877);
        field10993 = Float.intBitsToFloat(1045220557);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite f1Y2SBzpqVGzeX(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block18: {
            o = Class.forName(Class5707.ibjo14BbJSLAjbpA(k, 142473938));
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
                    v0 = 40357;
                    ** GOTO lbl19
                }
                v0 = 40358;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 40356;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 40358: {
                            continue block11;
                        }
                        case 40357: {
                            try {
                                a = Integer.parseInt(Class5707.ibjo14BbJSLAjbpA(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl34
                            }
                            if (e % 59557 == m.intValue()) {
                                c = Class5707.ibjo14BbJSLAjbpA(r[f], l);
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
            if (!s.isEmpty()) break block18;
            v1 = 6086;
            ** GOTO lbl44
        }
        v1 = 6087;
        if (true) ** GOTO lbl44
        block12: while (true) {
            v1 = 6085;
lbl44:
            // 3 sources

            switch (v1) {
                case 6087: {
                    continue block12;
                }
                case 6086: {
                    throw new Exception("Can't find method in " + Class5707.ibjo14BbJSLAjbpA(k, 142473938) + " " + l + " " + m);
                }
            }
            break;
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

