/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u5cfd\u5cf5\u5cf8\u5cff\u5cf5\u5cff\u5cff\u5cf4", "\u32fe\u32f7\u32f1\u32f4\u32f5\u32f6\u32f1", "\ua5da\ua5df\ua5d7\ua5d9\ua5de\ua5d8\ua5de\ua5d8", "\u0615\u0610\u0611\u0614\u0611\u0617\u0615\u0614", "\u578c\u5782\u578b\u578b\u5783\u578f\u578c", "\u1fec\u1fe8\u1fea\u1fe9\u1fe9\u1fec\u1fec", "\u7818\u781e\u7818\u781a\u781f\u7818\u781d\u7815", "\u69f2\u69f0\u69f6\u69f0\u69f2\u69f0\u69f5\u69ff", "\udf92\udf94\udf90\udf9b\udf9b\udf90\udf90\udf9b", "\u1915\u1915\u1916\u1913\u1912\u1916\u1917\u1910", "\u7be8\u7bee\u7be8\u7bed\u7beb\u7bee\u7bea\u7bef", "\u922b\u922b\u922c\u922a\u9228\u9229\u922a\u922b", "\u73b6\u73b6\u73bb\u73b4\u73b1\u73b6\u73b7", "\uddd8\uddda\uddd5\uddde\uddd4\udddd\udddb\udddd", "\u8ddc\u8ddb\u8ddb\u8ddb\u8ddc\u8dda\u8dde\u8ddf"}, d2={"\u01e2\u01ce\u01cf\u2183\u01b1\u01b3\u01a5\u01c1\u01e7\u01ec\u01fb\u01ec\u01a2\u01e1\u01ec\u01e3\u01ea\u01a2\u01de\u01f9\u01ff\u01e4\u01e3\u01ea\u01b6\u01a4\u01c1\u01e7\u01ec\u01fb\u01ec\u01a2\u01e1\u01ec\u01e3\u01ea\u01a2\u01de\u01f9\u01ff\u01e4\u01e3\u01ea\u01b6", "\u0425\u047a\u0475\u0470\u0477\u0470\u046d\u0427\u0425\u0427\u0431\u0430\u044f", "\u0632\u0667\u0660\u0667\u067a\u0630\u0632\u0630\u0626\u0627\u0658", "\u038c\u038e\u039f\u03a8\u0387\u038a\u0398\u0398\u03d7\u03d5\u03c3\u03c2\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03a8\u0387\u038a\u0398\u0398\u03d0", "\u0199\u0190\u0182\u0199\u01b2\u019e\u0195\u0194\u01cd\u01cf\u01d9\u01d8\u01b8", "\u06d8\u06cc\u06c8\u06dc\u06d1\u06ce\u0681\u0683\u0695\u06f1\u06d7\u06dc\u06cb\u06dc\u0692\u06d1\u06dc\u06d3\u06da\u0692\u06f2\u06df\u06d7\u06d8\u06de\u06c9\u0686\u0694\u06e7", "\u0734\u073b\u0738\u0739\u0732\u076b\u0769\u077f\u077e\u071b\u073d\u0736\u0721\u0736\u0778\u073b\u0736\u0739\u0730\u0778\u0718\u0735\u073d\u0732\u0734\u0723\u076c", "\u0793\u0788\u07b4\u0793\u0795\u078e\u0789\u0780\u07db\u07d9\u07cf\u07ce\u07ab\u078d\u0786\u0791\u0786\u07c8\u078b\u0786\u0789\u0780\u07c8\u07b4\u0793\u0795\u078e\u0789\u0780\u07dc", "*+0-\"=xzlm\u0012", "\u0526\u0527\u053c\u0521\u052e\u0531\u0509\u0524\u0524\u0574\u0576\u0560\u0561\u051e", "+=5(`btu\n", "\u0012\u0004\f\u0011Y[M/L3", "\u071d\u070b\u0703\u071e\u075a\u0756\u0754\u0742\u0720\u0743\u073c", "\u016b\u017d\u0175\u0168\u0120\u0122\u0134\u0156\u0155\u0135\u014a", "\u042c\u0423\u0424\u042b\u0426\u0423\u0430\u042f\u0476\u0474\u0462\u0463\u041c"})
public final class Class4155 {
    public static double field9660;
    public static float field9661;
    public static float field9662;
    public static double field9663 = 0.56452059095256;
    public static float field9664;

    private static String ArxJtiuNFy8SMgLT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite DGjMehgqo3627c(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block14: {
            block13: {
                block10: {
                    block12: {
                        block11: {
                            o = Class.forName(Class4155.ArxJtiuNFy8SMgLT(k, 1121732934));
                            p = o.getAnnotation(HACHIMI_CLIENT.class);
                            if (p.mv() >= 100) break block11;
                            v0 = 62756;
                            ** GOTO lbl11
                        }
                        v0 = 62757;
                        if (true) ** GOTO lbl11
                        block6: while (true) {
                            v0 = 62755;
lbl11:
                            // 3 sources

                            switch (v0) {
                                case 62757: {
                                    continue block6;
                                }
                                case 62756: {
                                    throw new Exception("Outdated metadata version");
                                }
                            }
                            break;
                        }
                        q = p.d1();
                        r = p.d2();
                        s = "";
                        t = "";
                        for (f = 0; f < q.length; ++f) {
                            try {
                                a = Integer.parseInt(Class4155.ArxJtiuNFy8SMgLT(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class4155.ArxJtiuNFy8SMgLT(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class4155.ArxJtiuNFy8SMgLT(k, 1121732934) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block12;
                        v1 = 44385;
                        ** GOTO lbl43
                    }
                    v1 = 44386;
                    if (true) ** GOTO lbl43
                    do {
                        v1 = var17_20 = 44384;
lbl43:
                        // 3 sources

                        if (var17_20 == 44385) break block10;
                    } while (var17_20 == 44386);
                    break block13;
                }
                g = h.findVirtual(o, s, u);
                break block14;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field9661 = Float.intBitsToFloat(1062317393);
        G\u200e = "Replace block exploit allow you place block at air";
        field9664 = Float.intBitsToFloat(1063243649);
        field9662 = Float.intBitsToFloat(1059032110);
        field9660 = Double.longBitsToDouble(4603352285826492467L);
    }
}

