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
@HACHIMI_CLIENT(mv=100, d1={"\ub934\ub935\ub931\ub933\ub93c\ub93d\ub931\ub935", "\uba98\uba9b\uba9c\uba98\uba9d\uba99\uba95\uba9e", "\u22cb\u22c8\u22c0\u22cd\u22c1\u22cc\u22cf\u22c0", "\u6b21\u6b25\u6b2c\u6b20\u6b26\u6b24\u6b24\u6b26", "\u3b33\u3b35\u3b34\u3b34\u3b33\u3b34\u3b39\u3b38", "\u2c5c\u2c5b\u2c5e\u2c5d\u2c5e\u2c5b\u2c53\u2c5e", "\u11ea\u11ef\u11e8\u11ec\u11eb\u11ec\u11ec\u11ee", "\u273b\u2738\u2736\u273a\u273c\u273c\u2737\u273b", "\u71ae\u71aa\u71a8\u71a0\u71af\u71ac\u71af\u71ac", "\u3909\u390f\u390a\u390b\u3909\u3909\u390c\u3905", "\u7c00\u7c05\u7c05\u7c06\u7c0a\u7c00\u7c06\u7c03", "\u1bd5\u1bd7\u1bd4\u1bd3\u1bd0\u1bd0\u1bd4\u1bd5", "\uaec0\uaec7\uaec5\uaec4\uaece\uaecf\uaec2\uaec5", "\u67d1\u67dd\u67d5\u67dd\u67dc\u67d5\u67dc\u67d3", "\ud8ce\ud8cb\ud8c9\ud8cb\ud8ca\ud8c1\ud8cc", "\u4ad7\u4ad3\u4ad3\u4ad5\u4ad6\u4ad2\u4ad7", "\u79b8\u79be\u79b3\u79b3\u79bf\u79bf\u79b9\u79b2", "\ubc56\ubc51\ubc51\ubc54\ubc57\ubc53\ubc54\ubc5d"}, d2={"\u03b3\u03bd\u0399\u23db\u03e9\u03eb\u03fd\u0399\u03bf\u03b4\u03a3\u03b4\u03fa\u03b9\u03b4\u03bb\u03b2\u03fa\u0386\u03a1\u03a7\u03bc\u03bb\u03b2\u03ee\u03fc\u0399\u03bf\u03b4\u03a3\u03b4\u03fa\u03b9\u03b4\u03bb\u03b2\u03fa\u0386\u03a1\u03a7\u03bc\u03bb\u03b2\u03ee", "\u04db\u04d5\u04f0\u24b3\u0481\u0483\u0495\u04f1\u04d7\u04dc\u04cb\u04dc\u0492\u04d1\u04dc\u04d3\u04da\u0492\u04ee\u04c9\u04cf\u04d4\u04d3\u04da\u0486\u0494\u04f1\u04d7\u04dc\u04cb\u04dc\u0492\u04d1\u04dc\u04d3\u04da\u0492\u04ee\u04c9\u04cf\u04d4\u04d3\u04da\u0486", "\u0775\u077b\u075d\u271d\u072f\u072d\u073b\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728\u073a\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728", "\u04ca\u04c4\u04e3\u24a2\u0490\u0492\u0484\u04e0\u04c6\u04cd\u04da\u04cd\u0483\u04c0\u04cd\u04c2\u04cb\u0483\u04ff\u04d8\u04de\u04c5\u04c2\u04cb\u0497\u0485\u04e0\u04c6\u04cd\u04da\u04cd\u0483\u04c0\u04cd\u04c2\u04cb\u0483\u04ff\u04d8\u04de\u04c5\u04c2\u04cb\u0497", "\u04ba\u04e5\u04ea\u04ef\u04e8\u04ef\u04f2\u04b8\u04ba\u04b8\u04ae\u04af\u04d0", "\u061d\u0648\u064f\u0648\u0655\u061f\u061d\u061f\u0609\u0608\u0677", "\u0317\u0315\u0304\u0333\u031c\u0311\u0303\u0303\u034c\u034e\u0358\u0359\u033c\u031a\u0311\u0306\u0311\u035f\u031c\u0311\u031e\u0317\u035f\u0333\u031c\u0311\u0303\u0303\u034b", "\u023d\u0234\u0226\u023d\u0216\u023a\u0231\u0230\u0269\u026b\u027d\u027c\u021c", "\u0415\u0401\u0405\u0411\u041c\u0403\u044c\u044e\u0458\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u043f\u0412\u041a\u0415\u0413\u0404\u044b\u0459\u042a", "\u01e2\u01ed\u01ee\u01ef\u01e4\u01bd\u01bf\u01a9\u01a8\u01cd\u01eb\u01e0\u01f7\u01e0\u01ae\u01ed\u01e0\u01ef\u01e6\u01ae\u01ce\u01e3\u01eb\u01e4\u01e2\u01f5\u01ba", "\u0567\u057c\u0540\u0567\u0561\u057a\u057d\u0574\u052f\u052d\u053b\u053a\u055f\u0579\u0572\u0565\u0572\u053c\u057f\u0572\u057d\u0574\u053c\u0540\u0567\u0561\u057a\u057d\u0574\u0528", "\u0403\u0402\u0419\u0404\u040b\u0414\u0451\u0453\u0445\u0444\u043b", "\u050b\u050a\u0511\u050c\u0503\u051c\u0524\u0509\u0509\u0559\u055b\u054d\u054c\u0533", "\u0701\u0717\u071f\u0702\u074a\u0748\u075e\u075f\u0720", "\u03b8\u03ae\u03a6\u03bb\u03f3\u03f1\u03e7\u0385\u03e6\u0399", "\u02c0\u02d6\u02de\u02c3\u0287\u028b\u0289\u029f\u02fd\u029e\u02e1", "\u02d0\u02c6\u02ce\u02d3\u029b\u0299\u028f\u02ed\u02ee\u028e\u02f1", "\u0531\u053e\u0539\u0536\u053b\u053e\u052d\u0532\u056b\u0569\u057f\u057e\u0501"})
public final class Class5581 {
    public static float field10601;
    public static float field10602;
    public static double field10603;
    public static double field10604;

    static {
        field10603 = Double.longBitsToDouble(4592496468708485296L);
        field10601 = Float.intBitsToFloat(1044988136);
        Q\u200e = "add/del";
        at\u200e = "";
        field10604 = Double.longBitsToDouble(4595155657717260572L);
        bw\u200e = "selectServer.defaultName";
        field10602 = Float.intBitsToFloat(1054882322);
        bQ\u200e = "Target players";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite ATQdV2UJ4IVakw(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5581.4AjalAlnF4Y4WtDn(k, 877301445));
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
                v0 = 25222;
                ** GOTO lbl19
            }
            v0 = 25223;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 25221;
lbl19:
                // 3 sources

                switch (v0) {
                    case 25223: {
                        continue block7;
                    }
                    case 25222: {
                        try {
                            a = Integer.parseInt(Class5581.4AjalAlnF4Y4WtDn(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5581.4AjalAlnF4Y4WtDn(r[f], l);
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
            throw new Exception("Can't find method in " + Class5581.4AjalAlnF4Y4WtDn(k, 877301445) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String 4AjalAlnF4Y4WtDn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

