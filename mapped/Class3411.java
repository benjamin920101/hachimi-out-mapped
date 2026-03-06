/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u4d6c\u4d65\u4d65\u4d6d\u4d61\u4d60\u4d6c", "\u2884\u2880\u2883\u2880\u288a\u2881\u2884\u288b", "\u45a9\u45ad\u45af\u45a8\u45a9\u45ad\u45ae\u45a8", "\u5ac7\u5ac4\u5ac4\u5ac5\u5ac3\u5ac1\u5ac3\u5ac6", "\u5462\u5465\u5461\u546f\u5463\u546f\u546e\u5463", "\u9b03\u9b03\u9b07\u9b0e\u9b0f\u9b01\u9b0e", "\u8009\u800a\u800b\u800a\u8005\u8009\u800f\u8004", "\u49d0\u49d7\u49d5\u49d4\u49d7\u49d4\u49d2\u49dd", "\uaa14\uaa1d\uaa10\uaa13\uaa10\uaa12\uaa1d\uaa11", "\u91b5\u91ba\u91b7\u91b6\u91bb\u91b5\u91b0", "\u7f75\u7f73\u7f73\u7f7b\u7f7a\u7f74\u7f73", "\uda3c\uda3d\uda3b\uda3d\uda3c\uda3f\uda3f\uda3d", "\ud9bc\ud9b9\ud9b8\ud9bd\ud9ba\ud9b8\ud9bb\ud9bf", "\ue1bc\ue1ba\ue1bd\ue1ba\ue1b9\ue1b0\ue1bf\ue1bf", "\u5410\u5418\u5415\u5412\u5416\u5410\u5410\u5418", "\u6aa8\u6aa9\u6aa3\u6aac\u6aa3\u6aa8\u6aaa\u6aae"}, d2={"\u02e7\u02de\u02d6\u2288\u02ba\u02b8\u02ae\u02ca\u02ec\u02e7\u02f0\u02e7\u02a9\u02ea\u02e7\u02e8\u02e1\u02a9\u02d5\u02f2\u02f4\u02ef\u02e8\u02e1\u02bd\u02af\u02ca\u02ec\u02e7\u02f0\u02e7\u02a9\u02ea\u02e7\u02e8\u02e1\u02a9\u02d5\u02f2\u02f4\u02ef\u02e8\u02e1\u02bd", "\u0678\u0641\u0648\u2617\u0625\u0627\u0631\u0655\u0673\u0678\u066f\u0678\u0636\u0675\u0678\u0677\u067e\u0636\u064a\u066d\u066b\u0670\u0677\u067e\u0622\u0630\u0655\u0673\u0678\u066f\u0678\u0636\u0675\u0678\u0677\u067e\u0636\u064a\u066d\u066b\u0670\u0677\u067e\u0622", "\u029d\u02c2\u02cd\u02c8\u02cf\u02c8\u02d5\u029f\u029d\u029f\u0289\u0288\u02f7", "\u0786\u07d3\u07d4\u07d3\u07ce\u0784\u0786\u0784\u0792\u0793\u07ec", "\u079e\u079c\u078d\u07ba\u0795\u0798\u078a\u078a\u07c5\u07c7\u07d1\u07d0\u07b5\u0793\u0798\u078f\u0798\u07d6\u0795\u0798\u0797\u079e\u07d6\u07ba\u0795\u0798\u078a\u078a\u07c2", "\\UG\\w[PQ\b\n\u001c\u001d}", "\u07d6\u07c2\u07c6\u07d2\u07df\u07c0\u078f\u078d\u079b\u07ff\u07d9\u07d2\u07c5\u07d2\u079c\u07df\u07d2\u07dd\u07d4\u079c\u07fc\u07d1\u07d9\u07d6\u07d0\u07c7\u0788\u079a\u07e9", "\u077b\u0774\u0777\u0776\u077d\u0724\u0726\u0730\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u0757\u077a\u0772\u077d\u077b\u076c\u0723", "\u07d3\u07c8\u07f4\u07d3\u07d5\u07ce\u07c9\u07c0\u079b\u0799\u078f\u078e\u07eb\u07cd\u07c6\u07d1\u07c6\u0788\u07cb\u07c6\u07c9\u07c0\u0788\u07f4\u07d3\u07d5\u07ce\u07c9\u07c0\u079c", "\u045c\u045d\u0446\u045b\u0454\u044b\u040e\u040c\u041a\u041b\u0464", "\u04ef\u04ee\u04f5\u04e8\u04e7\u04f8\u04c0\u04ed\u04ed\u04bd\u04bf\u04a9\u04a8\u04d7", "\u073d\u072b\u0723\u073e\u0776\u0774\u0762\u0763\u071c", "\u0156\u0140\u0148\u0155\u011d\u011f\u0109\u016b\u0108\u0177", "\u028e\u0298\u0290\u028d\u02c9\u02c5\u02c7\u02d1\u02b3\u02d0\u02af", "\u06c6\u06d0\u06d8\u06c5\u068d\u068f\u0699\u06fb\u06f8\u0698\u06e7", "\u02db\u02d4\u02d3\u02dc\u02d1\u02d4\u02c7\u02d8\u0281\u0283\u0295\u0294\u02eb"})
public final class Class3411 {
    public static float field7429;
    public static int field7430 = 534343500;
    public static int field7431 = 263104310;

    static {
        ap\u200e = "Expands the tab list size to allow for more players";
        field7429 = Float.intBitsToFloat(1039260395);
        bS\u200e = "ItemsColor";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite xO79QMnsSJpeYE(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block17: {
            o = Class.forName(Class3411.KQqDHaTRt11uJXLy(k, -1676936981));
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
                    v0 = 18374;
                    ** GOTO lbl19
                }
                v0 = 18375;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 18373;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 18375: {
                            continue block11;
                        }
                        case 18374: {
                            try {
                                a = Integer.parseInt(Class3411.KQqDHaTRt11uJXLy(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl34
                            }
                            if (e % 59557 == m.intValue()) {
                                c = Class3411.KQqDHaTRt11uJXLy(r[f], l);
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
                throw new Exception("Can't find method in " + Class3411.KQqDHaTRt11uJXLy(k, -1676936981) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block17;
            v1 = 61842;
            ** GOTO lbl47
        }
        v1 = 61843;
        if (true) ** GOTO lbl47
        block12: while (true) {
            v1 = 61841;
lbl47:
            // 3 sources

            switch (v1) {
                case 61843: {
                    continue block12;
                }
                case 61842: {
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

    private static String KQqDHaTRt11uJXLy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

