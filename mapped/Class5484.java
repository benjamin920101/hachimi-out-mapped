/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u9c42\u9c45\u9c44\u9c4e\u9c47\u9c41\u9c42\u9c4f", "\ud12e\ud12f\ud12a\ud122\ud12b\ud123\ud12f\ud12f", "\uad4b\uad4c\uad4e\uad49\uad4c\uad49\uad47\uad4c", "\ub2a9\ub2ad\ub2a6\ub2a6\ub2ad\ub2ae\ub2ad", "\u3a40\u3a40\u3a4c\u3a46\u3a4d\u3a4c\u3a4d\u3a4d", "\u9e17\u9e15\u9e15\u9e17\u9e13\u9e10\u9e13\u9e17", "\u1e54\u1e5c\u1e5d\u1e51\u1e55\u1e57\u1e53\u1e57", "\u77e0\u77e2\u77ec\u77e0\u77e6\u77e0\u77e3\u77ec", "\u9592\u9597\u9591\u9591\u9592\u9595\u9593", "\u1d91\u1d95\u1d94\u1d90\u1d93\u1d9d\u1d97\u1d93", "\u55ee\u55ef\u55ed\u55e9\u55ea\u55e8\u55e7\u55e8", "\u6f18\u6f14\u6f12\u6f15\u6f19\u6f18\u6f15", "\ua399\ua398\ua39e\ua39d\ua39d\ua392\ua39a\ua39f", "\ud911\ud917\ud919\ud912\ud912\ud916\ud918\ud914", "\u5527\u5522\u5520\u5523\u5524\u5522\u5522\u5520", "\u40a2\u40a3\u40a0\u40a4\u40aa\u40a7\u40a7\u40aa", "\u996e\u996a\u996f\u996b\u996f\u996e\u9965\u996b"}, d2={"\u0278\u0274\u0247\u2203\u0231\u0233\u0225\u0241\u0267\u026c\u027b\u026c\u0222\u0261\u026c\u0263\u026a\u0222\u025e\u0279\u027f\u0264\u0263\u026a\u0236\u0224\u0241\u0267\u026c\u027b\u026c\u0222\u0261\u026c\u0263\u026a\u0222\u025e\u0279\u027f\u0264\u0263\u026a\u0236", "\u027f\u0273\u0241\u2204\u0236\u0234\u0222\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231\u0223\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231", "\u0423\u042f\u041a\u2458\u046a\u0468\u047e\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d\u047f\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d", "D\u001b\u0014\u0011\u0016\u0011\fFDFPQ.", "\u02ab\u02fe\u02f9\u02fe\u02e3\u02a9\u02ab\u02a9\u02bf\u02be\u02c1", "\u04d3\u04d1\u04c0\u04f7\u04d8\u04d5\u04c7\u04c7\u0488\u048a\u049c\u049d\u04f8\u04de\u04d5\u04c2\u04d5\u049b\u04d8\u04d5\u04da\u04d3\u049b\u04f7\u04d8\u04d5\u04c7\u04c7\u048f", "\u0193\u019a\u0188\u0193\u01b8\u0194\u019f\u019e\u01c7\u01c5\u01d3\u01d2\u01b2", "-9=)$;tv`\u0004\")>)g$)&/g\u0007*\"-+<sa\u0012", "\u04cf\u04c0\u04c3\u04c2\u04c9\u0490\u0492\u0484\u0485\u04e0\u04c6\u04cd\u04da\u04cd\u0483\u04c0\u04cd\u04c2\u04cb\u0483\u04e3\u04ce\u04c6\u04c9\u04cf\u04d8\u0497", "\u07af\u07b4\u0788\u07af\u07a9\u07b2\u07b5\u07bc\u07e7\u07e5\u07f3\u07f2\u0797\u07b1\u07ba\u07ad\u07ba\u07f4\u07b7\u07ba\u07b5\u07bc\u07f4\u0788\u07af\u07a9\u07b2\u07b5\u07bc\u07e0", "\u07b5\u07b4\u07af\u07b2\u07bd\u07a2\u07e7\u07e5\u07f3\u07f2\u078d", "\u041b\u041a\u0401\u041c\u0413\u040c\u0434\u0419\u0419\u0449\u044b\u045d\u045c\u0423", "\u039a\u038c\u0384\u0399\u03d1\u03d3\u03c5\u03c4\u03bb", "\u0281\u0297\u029f\u0282\u02ca\u02c8\u02de\u02bc\u02df\u02a0", "\u0524\u0532\u053a\u0527\u0563\u056f\u056d\u057b\u0519\u057a\u0505", "\u0627\u0631\u0639\u0624\u066c\u066e\u0678\u061a\u0619\u0679\u0606", "\u0732\u073d\u073a\u0735\u0738\u073d\u072e\u0731\u0768\u076a\u077c\u077d\u0702"})
public final class Class5484 {
    public static float field10284 = Float.intBitsToFloat(1056727342);
    public static float field10285 = 0.38909507f;
    public static float field10286;
    public static int field10287 = 45145;
    public static int field10288 = 927514861;

    /*
     * WARNING - void declaration
     */
    private static CallSite 1qAjQTnboV7nyG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5484.fZ7bD7Aj1KXAwYDY(k2, -463774371));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5484.fZ7bD7Aj1KXAwYDY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5484.fZ7bD7Aj1KXAwYDY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5484.fZ7bD7Aj1KXAwYDY(k2, -463774371) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String fZ7bD7Aj1KXAwYDY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        ah\u200e = "Use the closest direction for block interaction";
        aD\u200e = "TWITTER";
        aS\u200e = "Prevents world border from rendering";
        field10286 = Float.intBitsToFloat(1024410576);
    }
}

