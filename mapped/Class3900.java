/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u651f\u651d\u651c\u651b\u651f\u6518\u651b\u6511", "\uaeed\uaeea\uaeea\uaee8\uaeee\uaee8\uaee9\uaeed", "\ue409\ue405\ue408\ue40e\ue40a\ue405\ue40f\ue40a", "\uc962\uc960\uc965\uc969\uc968\uc967\uc960\uc961", "\ubc80\ubc80\ubc8b\ubc80\ubc87\ubc8a\ubc8a", "\u84ca\u84c6\u84cc\u84ca\u84cd\u84c7\u84ce\u84c6", "\u2e6d\u2e6f\u2e6d\u2e62\u2e6b\u2e6c\u2e6d\u2e62", "\ue297\ue297\ue295\ue296\ue296\ue292\ue29e", "\u86f7\u86f0\u86fc\u86f5\u86f1\u86f3\u86fc\u86fc", "\u599c\u599c\u599f\u599d\u5990\u5998\u5990\u5998", "\u6768\u676f\u6769\u6766\u6769\u676e\u6769\u676f", "\u41ca\u41c9\u41cd\u41cf\u41c9\u41c2\u41cc\u41ce", "\u1b5d\u1b5b\u1b5a\u1b5a\u1b5d\u1b5a\u1b5d\u1b59", "\u9621\u9621\u9626\u9620\u9623\u9623\u9621\u962d", "\u33ae\u33ad\u33ac\u33a9\u33a4\u33ad\u33a8\u33a8"}, d2={"\u058c\u05a7\u0596\u25ee\u05dc\u05de\u05c8\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05b3\u0594\u0592\u0589\u058e\u0587\u05db\u05c9\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05b3\u0594\u0592\u0589\u058e\u0587\u05db", "\u0380\u03df\u03d0\u03d5\u03d2\u03d5\u03c8\u0382\u0380\u0382\u0394\u0395\u03ea", "\u02b3\u02e6\u02e1\u02e6\u02fb\u02b1\u02b3\u02b1\u02a7\u02a6\u02d9", "\u02cb\u02c9\u02d8\u02ef\u02c0\u02cd\u02df\u02df\u0290\u0292\u0284\u0285\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ef\u02c0\u02cd\u02df\u02df\u0297", "\u0415\u041c\u040e\u0415\u043e\u0412\u0419\u0418\u0441\u0443\u0455\u0454\u0434", "\u06de\u06ca\u06ce\u06da\u06d7\u06c8\u0687\u0685\u0693\u06f7\u06d1\u06da\u06cd\u06da\u0694\u06d7\u06da\u06d5\u06dc\u0694\u06f4\u06d9\u06d1\u06de\u06d8\u06cf\u0680\u0692\u06e1", "\u03db\u03d4\u03d7\u03d6\u03dd\u0384\u0386\u0390\u0391\u03f4\u03d2\u03d9\u03ce\u03d9\u0397\u03d4\u03d9\u03d6\u03df\u0397\u03f7\u03da\u03d2\u03dd\u03db\u03cc\u0383", "\u0662\u0679\u0645\u0662\u0664\u067f\u0678\u0671\u062a\u0628\u063e\u063f\u065a\u067c\u0677\u0660\u0677\u0639\u067a\u0677\u0678\u0671\u0639\u0645\u0662\u0664\u067f\u0678\u0671\u062d", "\u06e3\u06e2\u06f9\u06e4\u06eb\u06f4\u06b1\u06b3\u06a5\u06a4\u06db", "\u050d\u050c\u0517\u050a\u0505\u051a\u0522\u050f\u050f\u055f\u055d\u054b\u054a\u0535", "\u0137\u0121\u0129\u0134\u017c\u017e\u0168\u0169\u0116", "\u03da\u03cc\u03c4\u03d9\u0391\u0393\u0385\u03e7\u0384\u03fb", "\u01cb\u01dd\u01d5\u01c8\u018c\u0180\u0182\u0194\u01f6\u0195\u01ea", "\u0105\u0113\u011b\u0106\u014e\u014c\u015a\u0138\u013b\u015b\u0124", "\u04b1\u04be\u04b9\u04b6\u04bb\u04be\u04ad\u04b2\u04eb\u04e9\u04ff\u04fe\u0481"})
public final class Class3900 {
    public static int field8880 = 3;
    public static float field8881;
    public static float field8882;
    public static float field8883 = 0.29889458f;
    public static float field8884 = 0.6861309f;
    public static float field8885;

    private static String taoHyAvsSkruG8CO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8882 = Float.intBitsToFloat(1063011027);
        field8885 = Float.intBitsToFloat(1054105654);
        field8881 = Float.intBitsToFloat(1058706371);
        aD\u200e = "Hachimi";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite Fb96SoFOI2BNaT(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3900.taoHyAvsSkruG8CO(k, 747099926));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 60824;
                ** GOTO lbl19
            }
            v0 = 60825;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 60823;
lbl19:
                // 3 sources

                switch (v0) {
                    case 60825: {
                        continue block7;
                    }
                    case 60824: {
                        try {
                            a = Integer.parseInt(Class3900.taoHyAvsSkruG8CO(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3900.taoHyAvsSkruG8CO(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3900.taoHyAvsSkruG8CO(k, 747099926) + " " + l + " " + m);
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

