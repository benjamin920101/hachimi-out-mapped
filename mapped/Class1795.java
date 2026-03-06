/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u682f\u682c\u682d\u6828\u682e\u6823\u682b\u682e", "\u7a27\u7a26\u7a20\u7a20\u7a23\u7a27\u7a23\u7a2d", "\ua2fc\ua2fa\ua2f4\ua2fd\ua2f5\ua2fa\ua2fa\ua2fa", "\u8f3a\u8f3b\u8f37\u8f37\u8f37\u8f39\u8f3d\u8f3f", "\u4af5\u4af6\u4af3\u4af6\u4af6\u4af0\u4afb\u4af0", "\u1b7e\u1b79\u1b71\u1b7c\u1b7e\u1b7a\u1b7e\u1b7c", "\ucf3f\ucf38\ucf38\ucf3f\ucf3e\ucf3a\ucf3b", "\u0bf7\u0bfe\u0bf4\u0bfe\u0bf1\u0bf6\u0bf7\u0bf5", "\u3e9e\u3e9a\u3e9f\u3e9a\u3e98\u3e9c\u3e98\u3e9f", "\ud10d\ud108\ud10f\ud10b\ud100\ud100\ud10d", "\ud9ec\ud9ec\ud9ef\ud9e8\ud9eb\ud9e9\ud9e2\ud9e8", "\u59d0\u59d7\u59d4\u59d3\u59d1\u59d3\u59d8\u59d9", "\uc0bd\uc0b6\uc0ba\uc0b7\uc0b6\uc0ba\uc0b9\uc0b8", "\u27ef\u27e0\u27e5\u27e7\u27e7\u27e6"}, d2={"\u077d\u0722\u072d\u0728\u072f\u0728\u0735\u077f\u077d\u077f\u0769\u0768\u0717", "\u0610\u0645\u0642\u0645\u0658\u0612\u0610\u0612\u0604\u0605\u067a", "\u070c\u070e\u071f\u0728\u0707\u070a\u0718\u0718\u0757\u0755\u0743\u0742\u0727\u0701\u070a\u071d\u070a\u0744\u0707\u070a\u0705\u070c\u0744\u0728\u0707\u070a\u0718\u0718\u0750", "\u0494\u049d\u048f\u0494\u04bf\u0493\u0498\u0499\u04c0\u04c2\u04d4\u04d5\u04b5", "\u0123\u0137\u0133\u0127\u012a\u0135\u017a\u0178\u016e\u010a\u012c\u0127\u0130\u0127\u0169\u012a\u0127\u0128\u0121\u0169\u0109\u0124\u012c\u0123\u0125\u0132\u017d\u016f\u011c", "\u0695\u069a\u0699\u0698\u0693\u06ca\u06c8\u06de\u06df\u06ba\u069c\u0697\u0680\u0697\u06d9\u069a\u0697\u0698\u0691\u06d9\u06b9\u0694\u069c\u0693\u0695\u0682\u06cd", "\u03ed\u03f6\u03ca\u03ed\u03eb\u03f0\u03f7\u03fe\u03a5\u03a7\u03b1\u03b0\u03d5\u03f3\u03f8\u03ef\u03f8\u03b6\u03f5\u03f8\u03f7\u03fe\u03b6\u03ca\u03ed\u03eb\u03f0\u03f7\u03fe\u03a2", "\u0492\u0493\u0488\u0495\u049a\u0485\u04c0\u04c2\u04d4\u04d5\u04aa", "\u066f\u066e\u0675\u0668\u0667\u0678\u0640\u066d\u066d\u063d\u063f\u0629\u0628\u0657", "\u0198\u018e\u0186\u019b\u01d3\u01d1\u01c7\u01c6\u01b9", "\u06f4\u06e2\u06ea\u06f7\u06bf\u06bd\u06ab\u06c9\u06aa\u06d5", "\u041b\u040d\u0405\u0418\u045c\u0450\u0452\u0444\u0426\u0445\u043a", "\u0622\u0634\u063c\u0621\u0669\u066b\u067d\u061f\u061c\u067c\u0603", "\u0246\u0249\u024e\u0241\u024c\u0249\u025a\u0245\u021c\u021e\u0208\u0209\u0276"})
public final class Class1795 {
    public static double field6708 = Double.longBitsToDouble(4586548874239648288L);
    public static int field6709 = 4;

    /*
     * Unable to fully structure code
     */
    private static CallSite QadqT7d1g3llPq(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1795.gF6SXCrF7TVubRXb(k, 1412947882));
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
                v0 = 5212;
                ** GOTO lbl19
            }
            v0 = 5213;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 5211;
lbl19:
                // 3 sources

                switch (v0) {
                    case 5213: {
                        continue block7;
                    }
                    case 5212: {
                        try {
                            a = Integer.parseInt(Class1795.gF6SXCrF7TVubRXb(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1795.gF6SXCrF7TVubRXb(r[f], l);
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
            throw new Exception("Can't find method in " + Class1795.gF6SXCrF7TVubRXb(k, 1412947882) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String gF6SXCrF7TVubRXb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

