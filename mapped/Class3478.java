/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u1584\u1581\u1583\u1581\u1587\u158b\u1585\u1586", "\u0323\u0329\u0320\u0327\u0320\u0321\u0327\u0326", "\u64e8\u64ef\u64eb\u64eb\u64e5\u64ee\u64ea", "\u7f47\u7f45\u7f47\u7f47\u7f47\u7f41\u7f40\u7f47", "\u69ee\u69eb\u69e0\u69ea\u69e9\u69ec\u69e8", "\u94fd\u94fa\u94fc\u94f6\u94fd\u94fd\u94f8\u94f7", "\u0d9f\u0d90\u0d9a\u0d9b\u0d9e\u0d91\u0d9d\u0d9c", "\u2e11\u2e16\u2e17\u2e17\u2e16\u2e1a\u2e15\u2e12", "\ub002\ub002\ub00b\ub000\ub004\ub000\ub00a\ub000", "\ue12c\ue12e\ue12d\ue128\ue128\ue12b\ue128\ue129", "\ud405\ud400\ud404\ud401\ud404\ud408\ud408\ud402", "\u69c4\u69c6\u69c3\u69c1\u69c0\u69c9\u69c5\u69c0", "\u0dd3\u0dd2\u0dd4\u0dd0\u0dd2\u0dd5\u0dd6\u0dd0", "\u9445\u9444\u9446\u9440\u9449\u9443\u9443\u9441", "\u40d3\u40da\u40d2\u40d2\u40d0\u40da\u40d0\u40d6", "\ude5c\ude58\ude5c\ude5f\ude5b\ude59\ude5e\ude5f"}, d2={"\u03ef\u03c1\u03e9\u2383\u03b1\u03b3\u03a5\u03c1\u03e7\u03ec\u03fb\u03ec\u03a2\u03e1\u03ec\u03e3\u03ea\u03a2\u03de\u03f9\u03ff\u03e4\u03e3\u03ea\u03b6\u03a4\u03c1\u03e7\u03ec\u03fb\u03ec\u03a2\u03e1\u03ec\u03e3\u03ea\u03a2\u03de\u03f9\u03ff\u03e4\u03e3\u03ea\u03b6", "\u05e0\u05ce\u05e7\u258c\u05be\u05bc\u05aa\u05ce\u05e8\u05e3\u05f4\u05e3\u05ad\u05ee\u05e3\u05ec\u05e5\u05ad\u05d1\u05f6\u05f0\u05eb\u05ec\u05e5\u05b9\u05ab\u05ce\u05e8\u05e3\u05f4\u05e3\u05ad\u05ee\u05e3\u05ec\u05e5\u05ad\u05d1\u05f6\u05f0\u05eb\u05ec\u05e5\u05b9", "\u053e\u0561\u056e\u056b\u056c\u056b\u0576\u053c\u053e\u053c\u052a\u052b\u0554", "\u030d\u0358\u035f\u0358\u0345\u030f\u030d\u030f\u0319\u0318\u0367", "\u0768\u076a\u077b\u074c\u0763\u076e\u077c\u077c\u0733\u0731\u0727\u0726\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u074c\u0763\u076e\u077c\u077c\u0734", "\u0370\u0379\u036b\u0370\u035b\u0377\u037c\u037d\u0324\u0326\u0330\u0331\u0351", "\u05e1\u05f5\u05f1\u05e5\u05e8\u05f7\u05b8\u05ba\u05ac\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05cb\u05e6\u05ee\u05e1\u05e7\u05f0\u05bf\u05ad\u05de", "\u0191\u019e\u019d\u019c\u0197\u01ce\u01cc\u01da\u01db\u01be\u0198\u0193\u0184\u0193\u01dd\u019e\u0193\u019c\u0195\u01dd\u01bd\u0190\u0198\u0197\u0191\u0186\u01c9", "\u04ac\u04b7\u048b\u04ac\u04aa\u04b1\u04b6\u04bf\u04e4\u04e6\u04f0\u04f1\u0494\u04b2\u04b9\u04ae\u04b9\u04f7\u04b4\u04b9\u04b6\u04bf\u04f7\u048b\u04ac\u04aa\u04b1\u04b6\u04bf\u04e3", "\u015d\u015c\u0147\u015a\u0155\u014a\u010f\u010d\u011b\u011a\u0165", "\u010d\u010c\u0117\u010a\u0105\u011a\u0122\u010f\u010f\u015f\u015d\u014b\u014a\u0135", "\u03d2\u03c4\u03cc\u03d1\u0399\u039b\u038d\u038c\u03f3", "\u040f\u0419\u0411\u040c\u0444\u0446\u0450\u0432\u0451\u042e", "\u063b\u062d\u0625\u0638\u067c\u0670\u0672\u0664\u0606\u0665\u061a", "\u0091\u0087\u008f\u0092\u00da\u00d8\u00ce\u00ac\u00af\u00cf\u00b0", "\u043b\u0434\u0433\u043c\u0431\u0434\u0427\u0438\u0461\u0463\u0475\u0474\u040b"})
public final class Class3478 {
    public static double field7627;
    public static float field7628;
    public static double field7629;
    public static float field7630;
    public static float field7631;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite hjdpnSdi4iYdb9(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3478.SbeIsEOlhZdQnVbv(k, -1418127650));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) throw new Exception("Outdated metadata version");
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block10: while (true) {
            v0 = f >= q.length ? 27758 : 27757;
            block11: while (true) {
                switch (v0) {
                    case 27758: {
                        v0 = 27756;
                        continue block11;
                    }
                    case 27757: {
                        try {
                            a = Integer.parseInt(Class3478.SbeIsEOlhZdQnVbv(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        v1 = e % 59557 != m.intValue() ? 10592 : 10591;
                        block12: while (true) {
                            switch (v1) {
                                case 10592: {
                                    v1 = 10590;
                                    continue block12;
                                }
                                case 10591: {
                                    c = Class3478.SbeIsEOlhZdQnVbv(r[f], l);
                                    d = c.split("<>");
                                    s = d[0];
                                    t = d[1];
                                    break block10;
                                }
                            }
                            break;
                        }
lbl34:
                        // 2 sources

                        ++f;
                        continue block10;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty() != false) throw new Exception("Can't find method in " + Class3478.SbeIsEOlhZdQnVbv(k, -1418127650) + " " + l + " " + m);
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n != 1) {
            v = h.findStatic(o, s, u);
            return new ConstantCallSite(v.asType(j));
        }
        g = h.findVirtual(o, s, u);
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field7629 = Double.longBitsToDouble(4605032335615115642L);
        j\u200e = "The rendering mode for rainbow";
        field7627 = Double.longBitsToDouble(4618441417868443648L);
        field7628 = Float.intBitsToFloat(1065303250);
        field7630 = Float.intBitsToFloat(1048726234);
        bw\u200e = "Allow baritone to place blocks";
        field7631 = Float.intBitsToFloat(1058596060);
    }

    private static String SbeIsEOlhZdQnVbv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

