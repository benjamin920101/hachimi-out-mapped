/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u3e8b\u3e85\u3e8b\u3e8f\u3e88\u3e8a\u3e8f\u3e88", "\u2c39\u2c34\u2c39\u2c36\u2c35\u2c36\u2c32", "\u86ab\u86a7\u86aa\u86a2\u86a6\u86a7\u86a6", "\ub0c3\ub0c4\ub0c0\ub0c5\ub0c2\ub0c3\ub0c4\ub0c3", "\u2a56\u2a51\u2a52\u2a55\u2a52\u2a57\u2a54\u2a53", "\udf02\udf03\udf01\udf07\udf01\udf06\udf06\udf05", "\uc6a8\uc6a2\uc6a5\uc6a0\uc6a6\uc6a3\uc6a4", "\u19e4\u19e5\u19e1\u19e7\u19e6\u19e5\u19e6\u19e6", "\u05e8\u05ef\u05ea\u05e3\u05ec\u05e9\u05ea\u05ec", "\u3c73\u3c77\u3c77\u3c71\u3c72\u3c7e\u3c7f\u3c75", "\uad22\uad22\uad21\uad26\uad27\uad2e\uad2e\uad25", "\u5cf9\u5cfe\u5cff\u5cfe\u5cff\u5cfe\u5cfd\u5cf8", "\u9dfc\u9dfb\u9dfd\u9dfb\u9dfc\u9dff\u9dfe\u9dfd", "\u2884\u2880\u2889\u2883\u2884\u2881\u2881\u2886"}, d2={"\u03cb\u0394\u039b\u039e\u0399\u039e\u0383\u03c9\u03cb\u03c9\u03df\u03de\u03a1", "\u00d0\u0085\u0082\u0085\u0098\u00d2\u00d0\u00d2\u00c4\u00c5\u00ba", "\u046e\u046c\u047d\u044a\u0465\u0468\u047a\u047a\u0435\u0437\u0421\u0420\u0445\u0463\u0468\u047f\u0468\u0426\u0465\u0468\u0467\u046e\u0426\u044a\u0465\u0468\u047a\u047a\u0432", "\u01d5\u01dc\u01ce\u01d5\u01fe\u01d2\u01d9\u01d8\u0181\u0183\u0195\u0194\u01f4", "\u07e3\u07f7\u07f3\u07e7\u07ea\u07f5\u07ba\u07b8\u07ae\u07ca\u07ec\u07e7\u07f0\u07e7\u07a9\u07ea\u07e7\u07e8\u07e1\u07a9\u07c9\u07e4\u07ec\u07e3\u07e5\u07f2\u07bd\u07af\u07dc", "\u03da\u03d5\u03d6\u03d7\u03dc\u0385\u0387\u0391\u0390\u03f5\u03d3\u03d8\u03cf\u03d8\u0396\u03d5\u03d8\u03d7\u03de\u0396\u03f6\u03db\u03d3\u03dc\u03da\u03cd\u0382", "\u0562\u0579\u0545\u0562\u0564\u057f\u0578\u0571\u052a\u0528\u053e\u053f\u055a\u057c\u0577\u0560\u0577\u0539\u057a\u0577\u0578\u0571\u0539\u0545\u0562\u0564\u057f\u0578\u0571\u052d", "\u030c\u030d\u0316\u030b\u0304\u031b\u035e\u035c\u034a\u034b\u0334", "\u05aa\u05ab\u05b0\u05ad\u05a2\u05bd\u0585\u05a8\u05a8\u05f8\u05fa\u05ec\u05ed\u0592", "\u0104\u0112\u011a\u0107\u014f\u014d\u015b\u015a\u0125", "\u02ba\u02ac\u02a4\u02b9\u02f1\u02f3\u02e5\u0287\u02e4\u029b", "\u06ca\u06dc\u06d4\u06c9\u068d\u0681\u0683\u0695\u06f7\u0694\u06eb", "\u0473\u0465\u046d\u0470\u0438\u043a\u042c\u044e\u044d\u042d\u0452", "\u02bb\u02b4\u02b3\u02bc\u02b1\u02b4\u02a7\u02b8\u02e1\u02e3\u02f5\u02f4\u028b"})
public final class Class5561 {
    public static int field10534 = 39850;
    public static double field10535 = Double.longBitsToDouble(4600933028878273646L);
    public static int field10536 = 233634426;

    /*
     * Enabled aggressive block sorting
     */
    private static String gTGftZYVJgNwNvGb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 8474 : 8473;
            block5: while (true) {
                switch (n2) {
                    case 8474: {
                        n2 = 8472;
                        continue block5;
                    }
                    case 8473: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite LHbiNvnJreiT26(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5561.gTGftZYVJgNwNvGb(k, 1373190228));
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
                v0 = 12746;
                ** GOTO lbl19
            }
            v0 = 12747;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 12745;
lbl19:
                // 3 sources

                switch (v0) {
                    case 12747: {
                        continue block7;
                    }
                    case 12746: {
                        try {
                            a = Integer.parseInt(Class5561.gTGftZYVJgNwNvGb(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5561.gTGftZYVJgNwNvGb(r[f], l);
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
            throw new Exception("Can't find method in " + Class5561.gTGftZYVJgNwNvGb(k, 1373190228) + " " + l + " " + m);
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

