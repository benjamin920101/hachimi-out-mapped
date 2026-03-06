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
@HACHIMI_CLIENT(mv=100, d1={"\u805c\u8059\u805c\u805a\u805b\u8058\u805d", "\u685e\u685b\u685e\u6858\u6858\u685e\u6854\u685d", "\u487f\u487b\u487f\u487f\u487e\u4878\u4875\u4874", "\uc422\uc421\uc427\uc42c\uc420\uc426\uc426\uc421", "\u7d3f\u7d35\u7d3a\u7d3f\u7d3b\u7d38\u7d3d\u7d3b", "\u654b\u654f\u6549\u6540\u654d\u6549\u6548", "\u678c\u678e\u6782\u6788\u678e\u678f\u678d\u678a", "\u4f0f\u4f06\u4f05\u4f07\u4f07\u4f04\u4f06", "\u0266\u0262\u0261\u0260\u0262\u0264\u026a\u0261", "\u0bdc\u0bdf\u0bdd\u0bdf\u0bda\u0bd9\u0bd1\u0bdc", "\ud285\ud286\ud287\ud285\ud286\ud284\ud284\ud281", "\u51b8\u51bc\u51b5\u51bf\u51ba\u51b9\u51bf\u51b9", "\u997b\u997f\u9975\u997a\u997c\u9975\u9975\u997d", "\u8bd9\u8bda\u8bde\u8bda\u8bd3\u8bd2\u8bd2\u8bd2", "\u884b\u884b\u8849\u8848\u884a\u884b\u8845", "\u5cd4\u5cd2\u5cd1\u5cdf\u5cdf\u5cd2\u5cdf\u5cd2"}, d2={"\u0336\u0306\u0327\u234a\u0378\u037a\u036c\u0308\u032e\u0325\u0332\u0325\u036b\u0328\u0325\u032a\u0323\u036b\u0317\u0330\u0336\u032d\u032a\u0323\u037f\u036d\u0308\u032e\u0325\u0332\u0325\u036b\u0328\u0325\u032a\u0323\u036b\u0317\u0330\u0336\u032d\u032a\u0323\u037f", "\u0479\u0449\u046f\u2405\u0437\u0435\u0423\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430\u0422\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430", "\u04dd\u0482\u048d\u0488\u048f\u0488\u0495\u04df\u04dd\u04df\u04c9\u04c8\u04b7", "\u0532\u0567\u0560\u0567\u057a\u0530\u0532\u0530\u0526\u0527\u0558", "?=,\u001b49++dfpq\u001429.9w496?w\u001b49++c", "\u0011\u0018\n\u0011:\u0016\u001d\u001cEGQP0", ":.*>3,caw\u00135>)>p3>18p\u0010=5:<+dv\u0005", "\u06cd\u06c2\u06c1\u06c0\u06cb\u0692\u0690\u0686\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06e1\u06cc\u06c4\u06cb\u06cd\u06da\u0695", "\u064e\u0655\u0669\u064e\u0648\u0653\u0654\u065d\u0606\u0604\u0612\u0613\u0676\u0650\u065b\u064c\u065b\u0615\u0656\u065b\u0654\u065d\u0615\u0669\u064e\u0648\u0653\u0654\u065d\u0601", "\u039e\u039f\u0384\u0399\u0396\u0389\u03cc\u03ce\u03d8\u03d9\u03a6", "\u039b\u039a\u0381\u039c\u0393\u038c\u03b4\u0399\u0399\u03c9\u03cb\u03dd\u03dc\u03a3", "\u03cb\u03dd\u03d5\u03c8\u0380\u0382\u0394\u0395\u03ea", "\u0261\u0277\u027f\u0262\u022a\u0228\u023e\u025c\u023f\u0240", "\u043e\u0428\u0420\u043d\u0479\u0475\u0477\u0461\u0403\u0460\u041f", "\u0463\u0475\u047d\u0460\u0428\u042a\u043c\u045e\u045d\u043d\u0442", "\u06a2\u06ad\u06aa\u06a5\u06a8\u06ad\u06be\u06a1\u06f8\u06fa\u06ec\u06ed\u0692"})
public final class Class3513 {
    public static double field7744;
    public static int field7745 = 1219354925;
    public static double field7746 = 0.9078829871983173;
    public static float field7747;
    public static float field7748;
    public static double field7749;
    public static float field7750;

    /*
     * Unable to fully structure code
     */
    private static CallSite 7ikXgAJdwgfrdy(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3513.crtgb1kIqUgptnfJ(k, 2119045822));
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
                v0 = 11976;
                ** GOTO lbl19
            }
            v0 = 11977;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 11975;
lbl19:
                // 3 sources

                switch (v0) {
                    case 11977: {
                        continue block7;
                    }
                    case 11976: {
                        try {
                            a = Integer.parseInt(Class3513.crtgb1kIqUgptnfJ(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3513.crtgb1kIqUgptnfJ(r[f], l);
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
            throw new Exception("Can't find method in " + Class3513.crtgb1kIqUgptnfJ(k, 2119045822) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String crtgb1kIqUgptnfJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        a\u200e = "Indicator";
        field7749 = Double.longBitsToDouble(4605746641919640724L);
        G\u200e = "Blocks";
        field7744 = Double.longBitsToDouble(4602975692860427283L);
        field7747 = Float.intBitsToFloat(1047702204);
        field7748 = Float.intBitsToFloat(1054920378);
        field7750 = Float.intBitsToFloat(1055414362);
    }
}

