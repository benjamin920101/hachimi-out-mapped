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
@HACHIMI_CLIENT(mv=100, d1={"\ue414\ue416\ue414\ue413\ue415\ue41c\ue411\ue410", "\ube0d\ube0e\ube0e\ube06\ube0e\ube0b\ube0c\ube07", "\u552d\u552c\u552f\u552e\u5529\u552d\u5528\u5525", "\u8a1d\u8a10\u8a1c\u8a18\u8a19\u8a1a\u8a1a\u8a10", "\ue3a2\ue3a1\ue3a5\ue3a1\ue3a0\ue3a4\ue3a2\ue3a5", "\ud367\ud360\ud363\ud362\ud364\ud36b\ud363\ud364", "\ue5b0\ue5b8\ue5b2\ue5b4\ue5b4\ue5b3\ue5b3\ue5b0", "\ucede\uceda\ucedd\uced9\uced2\uced8\uced8\uced8", "\ue570\ue577\ue576\ue570\ue57b\ue57b\ue575\ue570", "\ua505\ua502\ua506\ua509\ua500\ua506\ua507\ua506", "\u426b\u426f\u4260\u426b\u426d\u426e\u426f\u4261", "\u0e0c\u0e0d\u0e0b\u0e0d\u0e09\u0e0a\u0e04\u0e0c", "\u3e1e\u3e19\u3e1a\u3e1c\u3e18\u3e1d\u3e18\u3e10", "\u179f\u1791\u1797\u1795\u179e\u1792\u1793"}, d2={"t+$!&!<vtv`a\u001e", " uruh\" \"45J", "\u04d5\u04d7\u04c6\u04f1\u04de\u04d3\u04c1\u04c1\u048e\u048c\u049a\u049b\u04fe\u04d8\u04d3\u04c4\u04d3\u049d\u04de\u04d3\u04dc\u04d5\u049d\u04f1\u04de\u04d3\u04c1\u04c1\u0489", "\u0425\u042c\u043e\u0425\u040e\u0422\u0429\u0428\u0471\u0473\u0465\u0464\u0404", "\u03cc\u03d8\u03dc\u03c8\u03c5\u03da\u0395\u0397\u0381\u03e5\u03c3\u03c8\u03df\u03c8\u0386\u03c5\u03c8\u03c7\u03ce\u0386\u03e6\u03cb\u03c3\u03cc\u03ca\u03dd\u0392\u0380\u03f3", "\u0188\u0187\u0184\u0185\u018e\u01d7\u01d5\u01c3\u01c2\u01a7\u0181\u018a\u019d\u018a\u01c4\u0187\u018a\u0185\u018c\u01c4\u01a4\u0189\u0181\u018e\u0188\u019f\u01d0", "\u046d\u0476\u044a\u046d\u046b\u0470\u0477\u047e\u0425\u0427\u0431\u0430\u0455\u0473\u0478\u046f\u0478\u0436\u0475\u0478\u0477\u047e\u0436\u044a\u046d\u046b\u0470\u0477\u047e\u0422", "\u038e\u038f\u0394\u0389\u0386\u0399\u03dc\u03de\u03c8\u03c9\u03b6", "\u0188\u0189\u0192\u018f\u0180\u019f\u01a7\u018a\u018a\u01da\u01d8\u01ce\u01cf\u01b0", "\u00a9\u00bf\u00b7\u00aa\u00e2\u00e0\u00f6\u00f7\u0088", "\u026f\u0279\u0271\u026c\u0224\u0226\u0230\u0252\u0231\u024e", "\u0706\u0710\u0718\u0705\u0741\u074d\u074f\u0759\u073b\u0758\u0727", "\u06f4\u06e2\u06ea\u06f7\u06bf\u06bd\u06ab\u06c9\u06ca\u06aa\u06d5", "\u0195\u019a\u019d\u0192\u019f\u019a\u0189\u0196\u01cf\u01cd\u01db\u01da\u01a5"})
public final class Class1181 {
    public static float field4687 = Float.intBitsToFloat(0x42200000);

    private static String 9TgEDHRVpbJjaif7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite Qf9wgwOQUBZeop(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1181.9TgEDHRVpbJjaif7(k, -113641139));
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
                        a = Integer.parseInt(Class1181.9TgEDHRVpbJjaif7(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 31182;
                    ** GOTO lbl23
                }
                v0 = 31183;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 31181;
lbl23:
                    // 3 sources

                    if (var16_19 == 31182) break block8;
                } while (var16_19 == 31183);
                continue;
            }
            c = Class1181.9TgEDHRVpbJjaif7(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1181.9TgEDHRVpbJjaif7(k, -113641139) + " " + l + " " + m);
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

