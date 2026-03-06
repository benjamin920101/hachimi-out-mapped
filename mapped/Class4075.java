/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u2ac8\u2ac8\u2acd\u2acb\u2acc\u2ac1\u2acd", "\u50ee\u50ef\u50ed\u50ed\u50e0\u50eb\u50eb\u50ec", "\u0d2e\u0d22\u0d2e\u0d2b\u0d2b\u0d2c\u0d22\u0d23", "\u942d\u9428\u942f\u9425\u942d\u942d\u9429\u942f", "\u1bcf\u1bcf\u1bcc\u1bc8\u1bcd\u1bca\u1bcd\u1bc7", "\u05c9\u05cc\u05c4\u05ca\u05cf\u05ce\u05cd\u05cc", "\ub875\ub87c\ub873\ub870\ub87c\ub874\ub873\ub874", "\u766b\u766b\u766d\u7667\u766e\u766e\u766a\u766b", "\ua2d9\ua2de\ua2dd\ua2d9\ua2d8\ua2dc\ua2d4\ua2df", "\u213f\u2135\u213d\u213a\u213b\u2139\u213d", "\uc629\uc629\uc623\uc629\uc622\uc62c\uc62e\uc62d", "\u5ca8\u5ca8\u5ca8\u5ca9\u5ca2\u5cae\u5cac\u5cad", "\u8f07\u8f02\u8f03\u8f09\u8f07\u8f00\u8f08\u8f00", "\u3811\u3816\u3811\u3816\u3814\u3811\u3817\u3813", "\u5d39\u5d3b\u5d38\u5d39\u5d3b\u5d3c\u5d32\u5d3c", "\u15a8\u15aa\u15aa\u15af\u15a4\u15aa\u15aa\u15af", "\uc41e\uc412\uc41f\uc418\uc413\uc41c\uc41b\uc41c", "\uc24c\uc24a\uc24a\uc24f\uc24e\uc242\uc24c"}, d2={"\u0085\u00ae\u00ad\u20e6\u00d4\u00d6\u00c0\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00bb\u009c\u009a\u0081\u0086\u008f\u00d3\u00c1\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00bb\u009c\u009a\u0081\u0086\u008f\u00d3", "\u05c9\u05e2\u05e2\u25aa\u0598\u059a\u058c\u05e8\u05ce\u05c5\u05d2\u05c5\u058b\u05c8\u05c5\u05ca\u05c3\u058b\u05f7\u05d0\u05d6\u05cd\u05ca\u05c3\u059f\u058d\u05e8\u05ce\u05c5\u05d2\u05c5\u058b\u05c8\u05c5\u05ca\u05c3\u058b\u05f7\u05d0\u05d6\u05cd\u05ca\u05c3\u059f", "\u0374\u035f\u035e\u2317\u0325\u0327\u0331\u0355\u0373\u0378\u036f\u0378\u0336\u0375\u0378\u0377\u037e\u0336\u034a\u036d\u036b\u0370\u0377\u037e\u0322\u0330\u0355\u0373\u0378\u036f\u0378\u0336\u0375\u0378\u0377\u037e\u0336\u034a\u036d\u036b\u0370\u0377\u037e\u0322", "\u0093\u00b8\u00b6\u20f0\u00c2\u00c0\u00d6\u00b2\u0094\u009f\u0088\u009f\u00d1\u0092\u009f\u0090\u0099\u00d1\u00ad\u008a\u008c\u0097\u0090\u0099\u00c5\u00d7\u00b2\u0094\u009f\u0088\u009f\u00d1\u0092\u009f\u0090\u0099\u00d1\u00ad\u008a\u008c\u0097\u0090\u0099\u00c5", "\u0357\u0308\u0307\u0302\u0305\u0302\u031f\u0355\u0357\u0355\u0343\u0342\u033d", "\u0778\u072d\u072a\u072d\u0730\u077a\u0778\u077a\u076c\u076d\u0712", "\u070e\u070c\u071d\u072a\u0705\u0708\u071a\u071a\u0755\u0757\u0741\u0740\u0725\u0703\u0708\u071f\u0708\u0746\u0705\u0708\u0707\u070e\u0746\u072a\u0705\u0708\u071a\u071a\u0752", "\u05a1\u05a8\u05ba\u05a1\u058a\u05a6\u05ad\u05ac\u05f5\u05f7\u05e1\u05e0\u0580", "\u069d\u0689\u068d\u0699\u0694\u068b\u06c4\u06c6\u06d0\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06b7\u069a\u0692\u069d\u069b\u068c\u06c3\u06d1\u06a2", "\u01d2\u01dd\u01de\u01df\u01d4\u018d\u018f\u0199\u0198\u01fd\u01db\u01d0\u01c7\u01d0\u019e\u01dd\u01d0\u01df\u01d6\u019e\u01fe\u01d3\u01db\u01d4\u01d2\u01c5\u018a", "\u03f2\u03e9\u03d5\u03f2\u03f4\u03ef\u03e8\u03e1\u03ba\u03b8\u03ae\u03af\u03ca\u03ec\u03e7\u03f0\u03e7\u03a9\u03ea\u03e7\u03e8\u03e1\u03a9\u03d5\u03f2\u03f4\u03ef\u03e8\u03e1\u03bd", "ONUHGX\u001d\u001f\t\bw", "\u04b6\u04b7\u04ac\u04b1\u04be\u04a1\u0499\u04b4\u04b4\u04e4\u04e6\u04f0\u04f1\u048e", "\u0270\u0266\u026e\u0273\u023b\u0239\u022f\u022e\u0251", "\u034e\u0358\u0350\u034d\u0305\u0307\u0311\u0373\u0310\u036f", "\u0742\u0754\u075c\u0741\u0705\u0709\u070b\u071d\u077f\u071c\u0763", "k}uh \"4VU5J", "\u032b\u0324\u0323\u032c\u0321\u0324\u0337\u0328\u0371\u0373\u0365\u0364\u031b"})
public final class Class4075 {
    public static double field9422;
    public static double field9423;
    public static double field9424;
    public static double field9425;
    public static double field9426;
    public static float field9427 = 0.5408388f;

    static {
        field9425 = Double.longBitsToDouble(4605775592848031457L);
        aa\u200e = "NoSlow";
        field9424 = Double.longBitsToDouble(4589028865188228544L);
        aR\u200e = "Prevents flying wither skulls from rendering";
        field9426 = Double.longBitsToDouble(4581545332557924096L);
        field9422 = Double.longBitsToDouble(4597323661435323252L);
        field9423 = Double.longBitsToDouble(4602541184739581562L);
        bV\u200e = "Minimum damage to attack crystals instantly";
        cd\u200e = "Render tracers to entities not visible on the screen";
    }

    private static String JwoCTqS2JvROeAaq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite BBLWOTLDXQtdTd(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4075.JwoCTqS2JvROeAaq(k, -1957704911));
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
                v0 = 46415;
                ** GOTO lbl19
            }
            v0 = 46416;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 46414;
lbl19:
                // 3 sources

                switch (v0) {
                    case 46416: {
                        continue block7;
                    }
                    case 46415: {
                        try {
                            a = Integer.parseInt(Class4075.JwoCTqS2JvROeAaq(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class4075.JwoCTqS2JvROeAaq(r[f], l);
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
            throw new Exception("Can't find method in " + Class4075.JwoCTqS2JvROeAaq(k, -1957704911) + " " + l + " " + m);
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

