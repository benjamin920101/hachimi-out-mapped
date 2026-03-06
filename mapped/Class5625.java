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
@HACHIMI_CLIENT(mv=100, d1={"\u7388\u7388\u738d\u738a\u738d\u738f\u738a\u7389", "\u2902\u2906\u290e\u2906\u2901\u2906\u290f\u2903", "\u18a9\u18ab\u18ac\u18a3\u18aa\u18ac\u18a8\u18a8", "\ub747\ub74e\ub744\ub741\ub747\ub742\ub746\ub74e", "\u9fcd\u9fc0\u9fc0\u9fc0\u9fcb\u9fca\u9fce\u9fc0", "\udb50\udb56\udb52\udb50\udb56\udb51\udb50\udb55", "\u1edb\u1ed8\u1edb\u1edc\u1ed9\u1edb\u1edf\u1edf", "\u8406\u8401\u8400\u8405\u8400\u8400\u8400\u8406", "\u1298\u129b\u1295\u129f\u129f\u129c\u1298\u1294", "\uabb7\uabb4\uabb1\uabb7\uabb3\uabb4\uabbd\uabb6", "\udce5\udce6\udce0\udce0\udcee\udcee\udce5\udce4", "\ue3d9\ue3de\ue3d8\ue3dc\ue3db\ue3db\ue3dc\ue3d9", "\uac19\uac16\uac12\uac18\uac12\uac19\uac16", "\u5052\u5053\u5057\u5052\u5054\u5052\u5056\u5052", "\ub67f\ub670\ub67e\ub671\ub67e\ub670\ub678\ub67b", "\uc169\uc169\uc16b\uc165\uc168\uc164\uc169\uc16e", "\ubfe4\ubfe4\ubfe6\ubfe1\ubfe5\ubfef\ubfe7\ubfe4", "\u270b\u2709\u270b\u2709\u270b\u270a\u270f\u2708"}, d2={"\u00b1\u008e\u00a7\u20d3\u00e1\u00e3\u00f5\u0091\u00b7\u00bc\u00ab\u00bc\u00f2\u00b1\u00bc\u00b3\u00ba\u00f2\u008e\u00a9\u00af\u00b4\u00b3\u00ba\u00e6\u00f4\u0091\u00b7\u00bc\u00ab\u00bc\u00f2\u00b1\u00bc\u00b3\u00ba\u00f2\u008e\u00a9\u00af\u00b4\u00b3\u00ba\u00e6", "\u02b2\u028d\u029f\u22d0\u02e2\u02e0\u02f6\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5\u02f7\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5", "\u06ac\u0693\u0682\u26ce\u06fc\u06fe\u06e8\u068c\u06aa\u06a1\u06b6\u06a1\u06ef\u06ac\u06a1\u06ae\u06a7\u06ef\u0693\u06b4\u06b2\u06a9\u06ae\u06a7\u06fb\u06e9\u068c\u06aa\u06a1\u06b6\u06a1\u06ef\u06ac\u06a1\u06ae\u06a7\u06ef\u0693\u06b4\u06b2\u06a9\u06ae\u06a7\u06fb", "\u030c\u0333\u0323\u236e\u035c\u035e\u0348\u032c\u030a\u0301\u0316\u0301\u034f\u030c\u0301\u030e\u0307\u034f\u0333\u0314\u0312\u0309\u030e\u0307\u035b\u0349\u032c\u030a\u0301\u0316\u0301\u034f\u030c\u0301\u030e\u0307\u034f\u0333\u0314\u0312\u0309\u030e\u0307\u035b", "\u021b\u0244\u024b\u024e\u0249\u024e\u0253\u0219\u021b\u0219\u020f\u020e\u0271", "\u063f\u066a\u066d\u066a\u0677\u063d\u063f\u063d\u062b\u062a\u0655", "\u03e4\u03e6\u03f7\u03c0\u03ef\u03e2\u03f0\u03f0\u03bf\u03bd\u03ab\u03aa\u03cf\u03e9\u03e2\u03f5\u03e2\u03ac\u03ef\u03e2\u03ed\u03e4\u03ac\u03c0\u03ef\u03e2\u03f0\u03f0\u03b8", "\u0575\u057c\u056e\u0575\u055e\u0572\u0579\u0578\u0521\u0523\u0535\u0534\u0554", "QEAUXG\b\n\u001cx^UBU\u001bXUZS\u001b{V^QW@\u000f\u001dn", "\u0633\u063c\u063f\u063e\u0635\u066c\u066e\u0678\u0679\u061c\u063a\u0631\u0626\u0631\u067f\u063c\u0631\u063e\u0637\u067f\u061f\u0632\u063a\u0635\u0633\u0624\u066b", "\u053e\u0525\u0519\u053e\u0538\u0523\u0524\u052d\u0576\u0574\u0562\u0563\u0506\u0520\u052b\u053c\u052b\u0565\u0526\u052b\u0524\u052d\u0565\u0519\u053e\u0538\u0523\u0524\u052d\u0571", "\u0447\u0446\u045d\u0440\u044f\u0450\u0415\u0417\u0401\u0400\u047f", "\u07ee\u07ef\u07f4\u07e9\u07e6\u07f9\u07c1\u07ec\u07ec\u07bc\u07be\u07a8\u07a9\u07d6", "\f\u001a\u0012\u000fGESR-", "\u0146\u0150\u0158\u0145\u010d\u010f\u0119\u017b\u0118\u0167", "\u04fc\u04ea\u04e2\u04ff\u04bb\u04b7\u04b5\u04a3\u04c1\u04a2\u04dd", "\u034a\u035c\u0354\u0349\u0301\u0303\u0315\u0377\u0374\u0314\u036b", "jebm`evi02$%Z"})
public final class Class5625 {
    public static double field10750;
    public static float field10751;
    public static double field10752 = 0.05929156176130601;

    /*
     * Unable to fully structure code
     */
    private static CallSite 5UbPF5O6de7tcQ(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block14: {
            block16: {
                o = Class.forName(Class5625.S9rIpbiOJLRVnQx1(k, -1822793905));
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
                    block15: {
                        if (f >= q.length) break block15;
                        v0 = 55068;
                        ** GOTO lbl19
                    }
                    v0 = 55069;
                    if (true) ** GOTO lbl19
                    block7: while (true) {
                        v0 = 55067;
lbl19:
                        // 3 sources

                        switch (v0) {
                            case 55069: {
                                continue block7;
                            }
                            case 55068: {
                                try {
                                    a = Integer.parseInt(Class5625.S9rIpbiOJLRVnQx1(q[f], m));
                                }
                                catch (NumberFormatException b) {
                                    ** GOTO lbl34
                                }
                                if (e % 59557 == m.intValue()) {
                                    c = Class5625.S9rIpbiOJLRVnQx1(r[f], l);
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
                if (!s.isEmpty()) break block16;
                v1 = 16005;
                ** GOTO lbl44
            }
            v1 = 16006;
            if (true) ** GOTO lbl44
            while (true) {
                v1 = var17_20 = 16004;
lbl44:
                // 3 sources

                if (var17_20 == 16005) break;
                if (var17_20 == 16006) {
                    continue;
                }
                break block14;
                break;
            }
            throw new Exception("Can't find method in " + Class5625.S9rIpbiOJLRVnQx1(k, -1822793905) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field10751 = Float.intBitsToFloat(1060287919);
        az\u200e = "Prevent move check";
        aP\u200e = "Prevents the pumpkin Hud overlay from rendering";
        bC\u200e = "BOUNCE";
        bJ\u200e = "Mobs";
        field10750 = Double.longBitsToDouble(4603433577203331694L);
    }

    private static String S9rIpbiOJLRVnQx1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

