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
@HACHIMI_CLIENT(mv=100, d1={"\u709d\u709f\u709f\u709d\u709c\u709c\u7099\u7099", "\u81d8\u81d5\u81d5\u81da\u81d8\u81d8\u81da\u81da", "\u1c69\u1c69\u1c65\u1c63\u1c62\u1c66\u1c67", "\ue529\ue527\ue52c\ue52e\ue52f\ue526\ue528\ue528", "\u99e6\u99e5\u99eb\u99ea\u99e0\u99e5\u99e4\u99e1", "\uc1d1\uc1d7\uc1d0\uc1de\uc1d0\uc1d0\uc1d0\uc1de", "\u273b\u2739\u2733\u273e\u273c\u2739\u2739\u2738", "\u1023\u1027\u1022\u1023\u1020\u1026\u1025\u102a", "\u62c9\u62c7\u62c8\u62c2\u62c4\u62c0", "\uc9cd\uc9cf\uc9cd\uc9c9\uc9c8\uc9ce\uc9c8\uc9c4", "\u02e9\u02ec\u02ee\u02ea\u02ea\u02e4\u02e8\u02ec", "\u7fb4\u7fb6\u7fb0\u7fb1\u7fb7\u7fb2\u7fba\u7fba", "\u85fe\u85fb\u85f0\u85ff\u85f1\u85fb\u85fd\u85fa", "\u4c70\u4c75\u4c72\u4c72\u4c72\u4c73\u4c75\u4c76", "\u7fe4\u7fe7\u7fe7\u7fe3\u7fe7\u7fe8\u7fe7\u7fe7"}, d2={"\u0373\u0341\u0377\u2318\u032a\u0328\u033e\u035a\u037c\u0377\u0360\u0377\u0339\u037a\u0377\u0378\u0371\u0339\u0345\u0362\u0364\u037f\u0378\u0371\u032d\u033f\u035a\u037c\u0377\u0360\u0377\u0339\u037a\u0377\u0378\u0371\u0339\u0345\u0362\u0364\u037f\u0378\u0371\u032d", "\u0786\u07d9\u07d6\u07d3\u07d4\u07d3\u07ce\u0784\u0786\u0784\u0792\u0793\u07ec", "\u03c4\u0391\u0396\u0391\u038c\u03c6\u03c4\u03c6\u03d0\u03d1\u03ae", "\u016f\u016d\u017c\u014b\u0164\u0169\u017b\u017b\u0134\u0136\u0120\u0121\u0144\u0162\u0169\u017e\u0169\u0127\u0164\u0169\u0166\u016f\u0127\u014b\u0164\u0169\u017b\u017b\u0133", "\u00c4\u00cd\u00df\u00c4\u00ef\u00c3\u00c8\u00c9\u0090\u0092\u0084\u0085\u00e5", "\u03ae\u03ba\u03be\u03aa\u03a7\u03b8\u03f7\u03f5\u03e3\u0387\u03a1\u03aa\u03bd\u03aa\u03e4\u03a7\u03aa\u03a5\u03ac\u03e4\u0384\u03a9\u03a1\u03ae\u03a8\u03bf\u03f0\u03e2\u0391", "\u03ff\u03f0\u03f3\u03f2\u03f9\u03a0\u03a2\u03b4\u03b5\u03d0\u03f6\u03fd\u03ea\u03fd\u03b3\u03f0\u03fd\u03f2\u03fb\u03b3\u03d3\u03fe\u03f6\u03f9\u03ff\u03e8\u03a7", "\u063a\u0621\u061d\u063a\u063c\u0627\u0620\u0629\u0672\u0670\u0666\u0667\u0602\u0624\u062f\u0638\u062f\u0661\u0622\u062f\u0620\u0629\u0661\u061d\u063a\u063c\u0627\u0620\u0629\u0675", "\u0687\u0686\u069d\u0680\u068f\u0690\u06d5\u06d7\u06c1\u06c0\u06bf", "\u0453\u0452\u0449\u0454\u045b\u0444\u047c\u0451\u0451\u0401\u0403\u0415\u0414\u046b", "\u0698\u068e\u0686\u069b\u06d3\u06d1\u06c7\u06c6\u06b9", "\u048d\u049b\u0493\u048e\u04c6\u04c4\u04d2\u04b0\u04d3\u04ac", "\u0007\u0011\u0019\u0004@LNX:Y&", "\u00e4\u00f2\u00fa\u00e7\u00af\u00ad\u00bb\u00d9\u00da\u00ba\u00c5", "\u03aa\u03a5\u03a2\u03ad\u03a0\u03a5\u03b6\u03a9\u03f0\u03f2\u03e4\u03e5\u039a"})
public final class Class5575 {
    public static int field10582 = 400325017;
    public static float field10583 = Float.intBitsToFloat(0x43340000);
    public static float field10584 = 0.089151025f;
    public static float field10585 = Float.intBitsToFloat(1064251095);

    private static String 0JTMKjnUyJCDl7kq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bl\u200e = "The color for rendering new chunks";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite hFI5EeicW6myyf(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5575.0JTMKjnUyJCDl7kq(k, -1534142892));
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
                v0 = 44420;
                ** GOTO lbl19
            }
            v0 = 44421;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 44419;
lbl19:
                // 3 sources

                switch (v0) {
                    case 44421: {
                        continue block7;
                    }
                    case 44420: {
                        try {
                            a = Integer.parseInt(Class5575.0JTMKjnUyJCDl7kq(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5575.0JTMKjnUyJCDl7kq(r[f], l);
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
            throw new Exception("Can't find method in " + Class5575.0JTMKjnUyJCDl7kq(k, -1534142892) + " " + l + " " + m);
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

