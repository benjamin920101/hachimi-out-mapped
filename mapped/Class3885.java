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
@HACHIMI_CLIENT(mv=100, d1={"\u8b73\u8b70\u8b71\u8b74\u8b71\u8b7b\u8b76\u8b7b", "\ub1d0\ub1d4\ub1d6\ub1dd\ub1d6\ub1d3\ub1d2\ub1d0", "\u4255\u4255\u425f\u4256\u4252\u425f\u4255\u4257", "\u990d\u990d\u990e\u990b\u990f\u9903\u9908\u9902", "\ube03\ube01\ube01\ube09\ube06\ube09\ube09\ube09", "\u7875\u7870\u7879\u7872\u7878\u7876\u7878\u7878", "\u88c9\u88ca\u88c2\u88ce\u88c9\u88cb\u88cf\u88c8", "\u0b33\u0b33\u0b34\u0b31\u0b34\u0b32\u0b39\u0b33", "\u77ac\u77ab\u77a1\u77ac\u77ae\u77af\u77ae\u77af", "\ua15f\ua159\ua150\ua15f\ua151\ua158\ua15a\ua15b", "\ua5ae\ua5a8\ua5af\ua5a8\ua5aa\ua5a8\ua5af\ua5ae", "\u86aa\u86a8\u86a8\u86ab\u86aa\u86ab\u86a8\u86a8", "\u93fe\u93ff\u93f4\u93fc\u93fd\u93fc\u93fb\u93f5", "\ua407\ua400\ua407\ua406\ua40a\ua403\ua40b\ua40b"}, d2={"\u0601\u065e\u0651\u0654\u0653\u0654\u0649\u0603\u0601\u0603\u0615\u0614\u066b", "\u02ae\u02fb\u02fc\u02fb\u02e6\u02ac\u02ae\u02ac\u02ba\u02bb\u02c4", "\u00c0\u00c2\u00d3\u00e4\u00cb\u00c6\u00d4\u00d4\u009b\u0099\u008f\u008e\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00e4\u00cb\u00c6\u00d4\u00d4\u009c", "\u0637\u063e\u062c\u0637\u061c\u0630\u063b\u063a\u0663\u0661\u0677\u0676\u0616", "\u00f1\u00e5\u00e1\u00f5\u00f8\u00e7\u00a8\u00aa\u00bc\u00d8\u00fe\u00f5\u00e2\u00f5\u00bb\u00f8\u00f5\u00fa\u00f3\u00bb\u00db\u00f6\u00fe\u00f1\u00f7\u00e0\u00af\u00bd\u00ce", "\u00bf\u00b0\u00b3\u00b2\u00b9\u00e0\u00e2\u00f4\u00f5\u0090\u00b6\u00bd\u00aa\u00bd\u00f3\u00b0\u00bd\u00b2\u00bb\u00f3\u0093\u00be\u00b6\u00b9\u00bf\u00a8\u00e7", "\u0204\u021f\u0223\u0204\u0202\u0219\u021e\u0217\u024c\u024e\u0258\u0259\u023c\u021a\u0211\u0206\u0211\u025f\u021c\u0211\u021e\u0217\u025f\u0223\u0204\u0202\u0219\u021e\u0217\u024b", "\u04a7\u04a6\u04bd\u04a0\u04af\u04b0\u04f5\u04f7\u04e1\u04e0\u049f", "\u0644\u0645\u065e\u0643\u064c\u0653\u066b\u0646\u0646\u0616\u0614\u0602\u0603\u067c", "\u01d7\u01c1\u01c9\u01d4\u019c\u019e\u0188\u0189\u01f6", "\u02f0\u02e6\u02ee\u02f3\u02bb\u02b9\u02af\u02cd\u02ae\u02d1", "\u051c\u050a\u0502\u051f\u055b\u0557\u0555\u0543\u0521\u0542\u053d", "\u000e\u0018\u0010\rEGQ30P/", "\u07f1\u07fe\u07f9\u07f6\u07fb\u07fe\u07ed\u07f2\u07ab\u07a9\u07bf\u07be\u07c1"})
public final class Class3885 {
    public static float field8837 = Float.intBitsToFloat(1049187742);

    /*
     * Unable to fully structure code
     */
    private static CallSite ou9HJ7SrwRcjME(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3885.4BfTG3oNcosVndXq(k, -2060495896));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        for (f = 0; f < q.length; ++f) {
            block8: {
                block9: {
                    try {
                        a = Integer.parseInt(Class3885.4BfTG3oNcosVndXq(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 36558;
                    ** GOTO lbl23
                }
                v0 = 36559;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 36557;
lbl23:
                    // 3 sources

                    if (var16_19 == 36558) break block8;
                } while (var16_19 == 36559);
                continue;
            }
            c = Class3885.4BfTG3oNcosVndXq(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3885.4BfTG3oNcosVndXq(k, -2060495896) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String 4BfTG3oNcosVndXq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

