/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ue591\ue591\ue590\ue591\ue592\ue59d\ue593\ue59d", "\u0707\u0702\u0700\u0708\u0700\u0709\u0700\u0709", "\u3e2e\u3e29\u3e28\u3e28\u3e2a\u3e2b\u3e2f\u3e25", "\ua6d8\ua6da\ua6dc\ua6de\ua6d3\ua6de\ua6df\ua6d8", "\u0ad6\u0ad2\u0ad1\u0ad0\u0ad0\u0ada\u0ad5\u0ad7", "\uccf5\uccfc\uccfd\uccfd\uccf5\uccf1\uccf0\uccf2", "\u7b4f\u7b49\u7b4c\u7b42\u7b48\u7b4e\u7b48\u7b4c", "\u1c02\u1c04\u1c00\u1c00\u1c08\u1c06\u1c08\u1c07", "\u5361\u536f\u536c\u536a\u536c\u5360", "\u85c0\u85c1\u85c1\u85c3\u85cc\u85c6\u85cc\u85c4", "\ud64d\ud64b\ud64e\ud64f\ud64a\ud646\ud648\ud647", "\u24e0\u24e1\u24e3\u24e7\u24e6\u24e4\u24ec\u24ed", "\u69c5\u69c4\u69c4\u69c2\u69c5\u69c4\u69c2", "\u0dfd\u0dfa\u0dff\u0dfb\u0df6\u0dfd\u0df6", "\ub6b8\ub6bf\ub6b7\ub6b6\ub6b8\ub6be\ub6bf\ub6ba"}, d2={"\u0364\u0359\u0359\u2306\u0334\u0336\u0320\u0344\u0362\u0369\u037e\u0369\u0327\u0364\u0369\u0366\u036f\u0327\u035b\u037c\u037a\u0361\u0366\u036f\u0333\u0321\u0344\u0362\u0369\u037e\u0369\u0327\u0364\u0369\u0366\u036f\u0327\u035b\u037c\u037a\u0361\u0366\u036f\u0333", "V\t\u0006\u0003\u0004\u0003\u001eTVTBC<", "W\u0002\u0005\u0002\u001fUWUCB=", "\u03c3\u03c1\u03d0\u03e7\u03c8\u03c5\u03d7\u03d7\u0398\u039a\u038c\u038d\u03e8\u03ce\u03c5\u03d2\u03c5\u038b\u03c8\u03c5\u03ca\u03c3\u038b\u03e7\u03c8\u03c5\u03d7\u03d7\u039f", "\u0628\u0621\u0633\u0628\u0603\u062f\u0624\u0625\u067c\u067e\u0668\u0669\u0609", "\u032b\u033f\u033b\u032f\u0322\u033d\u0372\u0370\u0366\u0302\u0324\u032f\u0338\u032f\u0361\u0322\u032f\u0320\u0329\u0361\u0301\u032c\u0324\u032b\u032d\u033a\u0375\u0367\u0314", "\u0743\u074c\u074f\u074e\u0745\u071c\u071e\u0708\u0709\u076c\u074a\u0741\u0756\u0741\u070f\u074c\u0741\u074e\u0747\u070f\u076f\u0742\u074a\u0745\u0743\u0754\u071b", "\u05ed\u05f6\u05ca\u05ed\u05eb\u05f0\u05f7\u05fe\u05a5\u05a7\u05b1\u05b0\u05d5\u05f3\u05f8\u05ef\u05f8\u05b6\u05f5\u05f8\u05f7\u05fe\u05b6\u05ca\u05ed\u05eb\u05f0\u05f7\u05fe\u05a2", "\u06b1\u06b0\u06ab\u06b6\u06b9\u06a6\u06e3\u06e1\u06f7\u06f6\u0689", "\u0494\u0495\u048e\u0493\u049c\u0483\u04bb\u0496\u0496\u04c6\u04c4\u04d2\u04d3\u04ac", "\u070c\u071a\u0712\u070f\u0747\u0745\u0753\u0752\u072d", "\u02de\u02c8\u02c0\u02dd\u0295\u0297\u0281\u02e3\u0280\u02ff", "\u07ae\u07b8\u07b0\u07ad\u07e9\u07e5\u07e7\u07f1\u0793\u07f0\u078f", "\u042b\u043d\u0435\u0428\u0460\u0462\u0474\u0416\u0415\u0475\u040a", "\u0016\u0019\u001e\u0011\u001c\u0019\n\u0015LNXY&"})
public final class Class4496 {
    public static float field10033 = 0.26447064f;

    private static String BrIGVDDkb25BTsY9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite jSNGyIb3A2J6bZ(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block13: {
            o = Class.forName(Class4496.BrIGVDDkb25BTsY9(k, 948457480));
            p = o.getAnnotation(HACHIMI_CLIENT.class);
            if (p.mv() < 100) {
                throw new Exception("Outdated metadata version");
            }
            q = p.d1();
            r = p.d2();
            s = "";
            t = "";
            for (f = 0; f < q.length; ++f) {
                block11: {
                    block12: {
                        try {
                            a = Integer.parseInt(Class4496.BrIGVDDkb25BTsY9(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            continue;
                        }
                        if (e % 59557 != m.intValue()) break block12;
                        v0 = 25635;
                        ** GOTO lbl23
                    }
                    v0 = 25636;
                    if (true) ** GOTO lbl23
                    do {
                        v0 = var16_19 = 25634;
lbl23:
                        // 3 sources

                        if (var16_19 == 25635) break block11;
                    } while (var16_19 == 25636);
                    continue;
                }
                c = Class4496.BrIGVDDkb25BTsY9(r[f], l);
                d = c.split("<>");
                s = d[0];
                t = d[1];
                break;
            }
            if (s.isEmpty()) {
                throw new Exception("Can't find method in " + Class4496.BrIGVDDkb25BTsY9(k, 948457480) + " " + l + " " + m);
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block13;
            v1 = 20035;
            ** GOTO lbl43
        }
        v1 = 20036;
        if (true) ** GOTO lbl43
        block8: while (true) {
            v1 = 20034;
lbl43:
            // 3 sources

            switch (v1) {
                case 20036: {
                    continue block8;
                }
                case 20035: {
                    g = h.findVirtual(o, s, u);
                    break block8;
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
        G\u200e = "TrueDurability";
    }
}

