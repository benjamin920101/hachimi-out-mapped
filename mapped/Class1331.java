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
@HACHIMI_CLIENT(mv=100, d1={"\u79aa\u79aa\u79ae\u79a3\u79ae\u79aa\u79a3\u79a2", "\udd16\udd1b\udd1b\udd10\udd1a\udd10\udd14\udd13", "\u4b16\u4b13\u4b19\u4b11\u4b18\u4b13\u4b11", "\ub108\ub10e\ub10c\ub10e\ub108\ub10e\ub10b\ub10b", "\u8e67\u8e67\u8e67\u8e66\u8e61\u8e67\u8e67\u8e6a", "\u6267\u6264\u6261\u6265\u6263\u6264\u6266\u6263", "\ua9e3\ua9e3\ua9e5\ua9e6\ua9e7\ua9e3\ua9e6\ua9e6", "\u63f3\u63f4\u63f6\u63f2\u63f1\u63f5\u63f3\u63f1", "\ud656\ud652\ud65c\ud65c\ud657\ud653\ud65c\ud651", "\u59f2\u59f7\u59f3\u59f1\u59f0\u59f0\u59f1\u59f5", "\u45eb\u45ea\u45e9\u45e4\u45e8\u45e4\u45eb\u45eb", "\ucd71\ucd7e\ucd77\ucd76\ucd71\ucd77\ucd71", "\ucb56\ucb51\ucb58\ucb51\ucb52\ucb56\ucb57\ucb53", "\ud0dc\ud0de\ud0d9\ud0dd\ud0d8\ud0dd\ud0d1\ud0d0", "\udf62\udf62\udf65\udf62\udf61\udf60\udf60\udf66", "\ua053\ua053\ua050\ua050\ua051\ua055\ua056\ua056", "\u7229\u722b\u7228\u7229\u722d\u722a\u722d\u7222"}, d2={"Za{\u203b\t\u000b\u001dy_TCT\u001aYT[R\u001afAG\\[R\u000e\u001cy_TCT\u001aYT[R\u001afAG\\[R\u000e", "\u02db\u02e0\u02fb\u22ba\u0288\u028a\u029c\u02f8\u02de\u02d5\u02c2\u02d5\u029b\u02d8\u02d5\u02da\u02d3\u029b\u02e7\u02c0\u02c6\u02dd\u02da\u02d3\u028f\u029d\u02f8\u02de\u02d5\u02c2\u02d5\u029b\u02d8\u02d5\u02da\u02d3\u029b\u02e7\u02c0\u02c6\u02dd\u02da\u02d3\u028f", "\u016e\u0155\u0151\u210f\u013d\u013f\u0129\u014d\u016b\u0160\u0177\u0160\u012e\u016d\u0160\u016f\u0166\u012e\u0152\u0175\u0173\u0168\u016f\u0166\u013a\u0128\u014d\u016b\u0160\u0177\u0160\u012e\u016d\u0160\u016f\u0166\u012e\u0152\u0175\u0173\u0168\u016f\u0166\u013a", "\u02d4\u028b\u0284\u0281\u0286\u0281\u029c\u02d6\u02d4\u02d6\u02c0\u02c1\u02be", "\u07d6\u0783\u0784\u0783\u079e\u07d4\u07d6\u07d4\u07c2\u07c3\u07bc", "\u03b2\u03b0\u03a1\u0396\u03b9\u03b4\u03a6\u03a6\u03e9\u03eb\u03fd\u03fc\u0399\u03bf\u03b4\u03a3\u03b4\u03fa\u03b9\u03b4\u03bb\u03b2\u03fa\u0396\u03b9\u03b4\u03a6\u03a6\u03ee", "\u0432\u043b\u0429\u0432\u0419\u0435\u043e\u043f\u0466\u0464\u0472\u0473\u0413", "\u04bf\u04ab\u04af\u04bb\u04b6\u04a9\u04e6\u04e4\u04f2\u0496\u04b0\u04bb\u04ac\u04bb\u04f5\u04b6\u04bb\u04b4\u04bd\u04f5\u0495\u04b8\u04b0\u04bf\u04b9\u04ae\u04e1\u04f3\u0480", "\u02c0\u02cf\u02cc\u02cd\u02c6\u029f\u029d\u028b\u028a\u02ef\u02c9\u02c2\u02d5\u02c2\u028c\u02cf\u02c2\u02cd\u02c4\u028c\u02ec\u02c1\u02c9\u02c6\u02c0\u02d7\u0298", "\u0341\u035a\u0366\u0341\u0347\u035c\u035b\u0352\u0309\u030b\u031d\u031c\u0379\u035f\u0354\u0343\u0354\u031a\u0359\u0354\u035b\u0352\u031a\u0366\u0341\u0347\u035c\u035b\u0352\u030e", "\u040a\u040b\u0410\u040d\u0402\u041d\u0458\u045a\u044c\u044d\u0432", "\u0660\u0661\u067a\u0667\u0668\u0677\u064f\u0662\u0662\u0632\u0630\u0626\u0627\u0658", "\u0609\u061f\u0617\u060a\u0642\u0640\u0656\u0657\u0628", "\u0550\u0546\u054e\u0553\u051b\u0519\u050f\u056d\u050e\u0571", "\u0170\u0166\u016e\u0173\u0137\u013b\u0139\u012f\u014d\u012e\u0151", "\u034d\u035b\u0353\u034e\u0306\u0304\u0312\u0370\u0373\u0313\u036c", "\u054c\u0543\u0544\u054b\u0546\u0543\u0550\u054f\u0516\u0514\u0502\u0503\u057c"})
public final class Class1331 {
    public static float field5149;
    public static double field5150 = 0.588545130847273;
    public static double field5151;
    public static double field5152 = 0.7159436840701816;

    private static String cdaSnhfpn4LTbNw0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 2QaLci2lilLTkG(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block17: {
            o = Class.forName(Class1331.cdaSnhfpn4LTbNw0(k, -359832898));
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
                    v0 = 56755;
                    ** GOTO lbl19
                }
                v0 = 56756;
                if (true) ** GOTO lbl19
                block11: while (true) {
                    v0 = 56754;
lbl19:
                    // 3 sources

                    switch (v0) {
                        case 56756: {
                            continue block11;
                        }
                        case 56755: {
                            try {
                                a = Integer.parseInt(Class1331.cdaSnhfpn4LTbNw0(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                ** GOTO lbl34
                            }
                            if (e % 59557 == m.intValue()) {
                                c = Class1331.cdaSnhfpn4LTbNw0(r[f], l);
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
                throw new Exception("Can't find method in " + Class1331.cdaSnhfpn4LTbNw0(k, -359832898) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block17;
            v1 = 23439;
            ** GOTO lbl47
        }
        v1 = 23440;
        if (true) ** GOTO lbl47
        block12: while (true) {
            v1 = 23438;
lbl47:
            // 3 sources

            switch (v1) {
                case 23440: {
                    continue block12;
                }
                case 23439: {
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

    static {
        b\u200e = "SwapAction";
        field5149 = Float.intBitsToFloat(1148846080);
        field5151 = Double.longBitsToDouble(4602619778746681490L);
        bi\u200e = "The color of the shader";
        bx\u200e = "Replace block exploit allow you place block at air";
    }
}

