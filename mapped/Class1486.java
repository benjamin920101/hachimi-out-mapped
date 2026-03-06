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
@HACHIMI_CLIENT(mv=100, d1={"\u7a5f\u7a5e\u7a5e\u7a5c\u7a55\u7a5c\u7a5f\u7a55", "\u791c\u791b\u791d\u791a\u791c\u7919\u791a\u7919", "\ua334\ua334\ua331\ua33f\ua334\ua333\ua336\ua33e", "\u8c17\u8c19\u8c18\u8c15\u8c12\u8c12\u8c13\u8c13", "\ub1f8\ub1fd\ub1fc\ub1f3\ub1ff\ub1f2\ub1f9", "\u5525\u5522\u552b\u5527\u5522\u552a\u5527\u5526", "\u58a5\u58a7\u58a1\u58a5\u58ae\u58a3\u58a7\u58a6", "\uc736\uc73d\uc734\uc733\uc732\uc731\uc737\uc73c", "\u9445\u9443\u9443\u944c\u9441\u944d\u944d\u9444", "\u8d9b\u8d98\u8d96\u8d9b\u8d9d\u8d98\u8d9a\u8d96", "\u6a2c\u6a22\u6a23\u6a29\u6a2e\u6a2c\u6a2b\u6a2b", "\u8515\u8513\u8512\u8511\u8514\u8513\u851a\u8515", "\u200d\u2008\u200b\u2001\u2008\u200b\u200c\u2009", "\u9188\u9182\u9189\u918c\u918e\u9182\u918f", "\u6d52\u6d52\u6d52\u6d53\u6d56\u6d55\u6d53\u6d56", "\u4548\u454f\u454a\u454d\u454f\u4549\u454d\u454e", "\u5104\u5102\u5103\u5106\u5105\u5108\u5101\u5101", "\ub3ce\ub3ce\ub3ce\ub3ca\ub3cc\ub3c4\ub3cf\ub3cb"}, d2={"\u010b\u0113\u012a\u216e\u015c\u015e\u0148\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u0133\u0114\u0112\u0109\u010e\u0107\u015b\u0149\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u0133\u0114\u0112\u0109\u010e\u0107\u015b", "\u0546\u055e\u0566\u2523\u0511\u0513\u0505\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516\u0504\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516", "\u06e0\u06f8\u06c7\u2685\u06b7\u06b5\u06a3\u06c7\u06e1\u06ea\u06fd\u06ea\u06a4\u06e7\u06ea\u06e5\u06ec\u06a4\u06d8\u06ff\u06f9\u06e2\u06e5\u06ec\u06b0\u06a2\u06c7\u06e1\u06ea\u06fd\u06ea\u06a4\u06e7\u06ea\u06e5\u06ec\u06a4\u06d8\u06ff\u06f9\u06e2\u06e5\u06ec\u06b0", "\u02d5\u02cd\u02f3\u22b0\u0282\u0280\u0296\u02f2\u02d4\u02df\u02c8\u02df\u0291\u02d2\u02df\u02d0\u02d9\u0291\u02ed\u02ca\u02cc\u02d7\u02d0\u02d9\u0285\u0297\u02f2\u02d4\u02df\u02c8\u02df\u0291\u02d2\u02df\u02d0\u02d9\u0291\u02ed\u02ca\u02cc\u02d7\u02d0\u02d9\u0285", "\u0580\u05df\u05d0\u05d5\u05d2\u05d5\u05c8\u0582\u0580\u0582\u0594\u0595\u05ea", "\u0604\u0651\u0656\u0651\u064c\u0606\u0604\u0606\u0610\u0611\u066e", "\u037d\u037f\u036e\u0359\u0376\u037b\u0369\u0369\u0326\u0324\u0332\u0333\u0356\u0370\u037b\u036c\u037b\u0335\u0376\u037b\u0374\u037d\u0335\u0359\u0376\u037b\u0369\u0369\u0321", "\u023e\u0237\u0225\u023e\u0215\u0239\u0232\u0233\u026a\u0268\u027e\u027f\u021f", "\u01db\u01cf\u01cb\u01df\u01d2\u01cd\u0182\u0180\u0196\u01f2\u01d4\u01df\u01c8\u01df\u0191\u01d2\u01df\u01d0\u01d9\u0191\u01f1\u01dc\u01d4\u01db\u01dd\u01ca\u0185\u0197\u01e4", "\u01d5\u01da\u01d9\u01d8\u01d3\u018a\u0188\u019e\u019f\u01fa\u01dc\u01d7\u01c0\u01d7\u0199\u01da\u01d7\u01d8\u01d1\u0199\u01f9\u01d4\u01dc\u01d3\u01d5\u01c2\u018d", "\u0431\u042a\u0416\u0431\u0437\u042c\u042b\u0422\u0479\u047b\u046d\u046c\u0409\u042f\u0424\u0433\u0424\u046a\u0429\u0424\u042b\u0422\u046a\u0416\u0431\u0437\u042c\u042b\u0422\u047e", "\u0788\u0789\u0792\u078f\u0780\u079f\u07da\u07d8\u07ce\u07cf\u07b0", "\t\b\u0013\u000e\u0001\u001e&\u000b\u000b[YON1", "\u074d\u075b\u0753\u074e\u0706\u0704\u0712\u0713\u076c", "\u05aa\u05bc\u05b4\u05a9\u05e1\u05e3\u05f5\u0597\u05f4\u058b", "\u02d3\u02c5\u02cd\u02d0\u0294\u0298\u029a\u028c\u02ee\u028d\u02f2", "\u0209\u021f\u0217\u020a\u0242\u0240\u0256\u0234\u0237\u0257\u0228", "\u04cd\u04c2\u04c5\u04ca\u04c7\u04c2\u04d1\u04ce\u0497\u0495\u0483\u0482\u04fd"})
public final class Class1486 {
    public static double field5614 = 0.5423422375437952;
    public static float field5615 = 0.9718316f;
    public static double field5616;
    public static double field5617;
    public static double field5618 = 0.2900552465641488;
    public static double field5619;
    public static double field5620;
    public static float field5621;
    public static float field5622;

    private static String 7bVLYVXvcgDnF6Nc(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        O\u200e = "in places, number of blocks";
        field5622 = Float.intBitsToFloat(1059696008);
        field5621 = Float.intBitsToFloat(1055963224);
        aB\u200e = "DISCORD";
        aO\u200e = "Overlay-Portal";
        bc\u200e = "Void";
        field5616 = Double.longBitsToDouble(4604568500833849426L);
        field5620 = Double.longBitsToDouble(4604778322479517931L);
        field5617 = Double.longBitsToDouble(4595603308500410240L);
        field5619 = Double.longBitsToDouble(4598756859291128682L);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 7lIoVj8rwXkdyh(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1486.7bVLYVXvcgDnF6Nc(k, -1215887249));
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
                        v0 = 58783;
                        ** GOTO lbl19
                    }
                    v0 = 58784;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 58782;
lbl19:
                        // 3 sources

                        if (var14_15 == 58783) break block9;
                    } while (var14_15 == 58784);
                    break;
                }
                try {
                    a = Integer.parseInt(Class1486.7bVLYVXvcgDnF6Nc(q[f], m));
                }
                catch (NumberFormatException b) {
                    break block10;
                }
                if (e % 59557 == m.intValue()) {
                    c = Class1486.7bVLYVXvcgDnF6Nc(r[f], l);
                    d = c.split("<>");
                    s = d[0];
                    t = d[1];
                    break;
                }
            }
            ++f;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1486.7bVLYVXvcgDnF6Nc(k, -1215887249) + " " + l + " " + m);
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

