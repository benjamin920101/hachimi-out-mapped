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
@HACHIMI_CLIENT(mv=100, d1={"\u7be7\u7bef\u7be6\u7bee\u7bef\u7bef\u7be2\u7be4", "\u58a3\u58a6\u58ac\u58ac\u58a2\u58a7\u58a4", "\u7dbc\u7db9\u7dbf\u7dbb\u7db3\u7db3\u7dba\u7dba", "\ue423\ue422\ue429\ue423\ue423\ue428\ue424\ue428", "\uc2db\uc2dc\uc2de\uc2df\uc2d6\uc2d9\uc2de\uc2db", "\u4d4e\u4d4d\u4d4b\u4d4e\u4d4f\u4d4c\u4d4e\u4d48", "\u1baf\u1bae\u1bab\u1bac\u1baf\u1ba4\u1baa\u1bad", "\ub95f\ub95f\ub95c\ub959\ub95e\ub95c\ub95c\ub95b", "\u08d5\u08d5\u08de\u08de\u08d6\u08d5\u08df\u08d6", "\u26f1\u26f1\u26f9\u26f2\u26f1\u26f3\u26f2\u26f0", "\u693e\u693c\u693c\u693f\u6934\u693c\u6938\u6938", "\ud60b\ud600\ud601\ud60c\ud60d\ud60d\ud60e\ud609", "\uc1ff\uc1fd\uc1f8\uc1f0\uc1fb\uc1fd\uc1f0\uc1f1", "\u360a\u3602\u360a\u3602\u360c\u360b\u360c"}, d2={"\u00f8\u00a7\u00a8\u00ad\u00aa\u00ad\u00b0\u00fa\u00f8\u00fa\u00ec\u00ed\u0092", "\u058e\u05db\u05dc\u05db\u05c6\u058c\u058e\u058c\u059a\u059b\u05e4", "\u0472\u0470\u0461\u0456\u0479\u0474\u0466\u0466\u0429\u042b\u043d\u043c\u0459\u047f\u0474\u0463\u0474\u043a\u0479\u0474\u047b\u0472\u043a\u0456\u0479\u0474\u0466\u0466\u042e", "\u067e\u0677\u0665\u067e\u0655\u0679\u0672\u0673\u062a\u0628\u063e\u063f\u065f", "\u03e3\u03f7\u03f3\u03e7\u03ea\u03f5\u03ba\u03b8\u03ae\u03ca\u03ec\u03e7\u03f0\u03e7\u03a9\u03ea\u03e7\u03e8\u03e1\u03a9\u03c9\u03e4\u03ec\u03e3\u03e5\u03f2\u03bd\u03af\u03dc", "\u0413\u041c\u041f\u041e\u0415\u044c\u044e\u0458\u0459\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u043f\u0412\u041a\u0415\u0413\u0404\u044b", "\u012f\u0134\u0108\u012f\u0129\u0132\u0135\u013c\u0167\u0165\u0173\u0172\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0108\u012f\u0129\u0132\u0135\u013c\u0160", "\u03ea\u03eb\u03f0\u03ed\u03e2\u03fd\u03b8\u03ba\u03ac\u03ad\u03d2", "\u040c\u040d\u0416\u040b\u0404\u041b\u0423\u040e\u040e\u045e\u045c\u044a\u044b\u0434", "\u017b\u016d\u0165\u0178\u0130\u0132\u0124\u0125\u015a", "NXPM\u0005\u0007\u0011s\u0010o", "\u00db\u00cd\u00c5\u00d8\u009c\u0090\u0092\u0084\u00e6\u0085\u00fa", "\u06b5\u06a3\u06ab\u06b6\u06fe\u06fc\u06ea\u0688\u068b\u06eb\u0694", "\u0784\u078b\u078c\u0783\u078e\u078b\u0798\u0787\u07de\u07dc\u07ca\u07cb\u07b4"})
public final class Class3928 {
    public static double field8939;
    public static double field8940;
    public static float field8941;
    public static float field8942;

    private static String 2Zv2UwNB2jIjLBLv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite JaeVYUQV8rogql(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3928.2Zv2UwNB2jIjLBLv(k, 1753101749));
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
                v0 = 39464;
                ** GOTO lbl19
            }
            v0 = 39465;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 39463;
lbl19:
                // 3 sources

                switch (v0) {
                    case 39465: {
                        continue block7;
                    }
                    case 39464: {
                        try {
                            a = Integer.parseInt(Class3928.2Zv2UwNB2jIjLBLv(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3928.2Zv2UwNB2jIjLBLv(r[f], l);
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
            throw new Exception("Can't find method in " + Class3928.2Zv2UwNB2jIjLBLv(k, 1753101749) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field8940 = Double.longBitsToDouble(4603660796996146193L);
        field8942 = Float.intBitsToFloat(1053012002);
        field8939 = Double.longBitsToDouble(4578523587807708160L);
        field8941 = Float.intBitsToFloat(1044547968);
    }
}

