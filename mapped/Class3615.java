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
@HACHIMI_CLIENT(mv=100, d1={"\u9cf2\u9cf4\u9cf5\u9cfd\u9cf6\u9cf3\u9cf4\u9cf6", "\u054a\u054f\u0548\u054e\u0545\u054a\u054c\u0545", "\ua8b8\ua8ba\ua8b9\ua8b9\ua8bb\ua8bd\ua8ba\ua8b9", "\uafde\uafd8\uafdb\uafde\uafdb\uafdc\uafdd\uafde", "\u83b9\u83ba\u83ba\u83b4\u83b5\u83be\u83b4\u83bc", "\ua70d\ua70e\ua700\ua70b\ua70f\ua70f\ua70a\ua70e", "\u91d5\u91d3\u91d7\u91d1\u91d3\u91df\u91de\u91d6", "\ub7a6\ub7a1\ub7a5\ub7a6\ub7a9\ub7a3\ub7a7\ub7a3", "\ud647\ud640\ud64c\ud64d\ud641\ud643\ud640\ud641", "\u7300\u7300\u7303\u7300\u7300\u7302\u7306\u7304", "\u1ac2\u1ac6\u1ac0\u1ac9\u1ac2\u1ac8\u1ac6\u1ac2", "\u611e\u611d\u6119\u6114\u6118\u6119\u611d\u611c", "\u9e8a\u9e8f\u9e82\u9e89\u9e82\u9e83\u9e83\u9e8e", "\u54ad\u54af\u54a7\u54aa\u54aa\u54ac\u54af\u54aa", "\u970e\u970b\u9709\u970e\u9701\u9709\u970b\u970a"}, d2={"\u03c9\u03f8\u03ff\u23a4\u0396\u0394\u0382\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391\u0383\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391", "\u07da\u0785\u078a\u078f\u0788\u078f\u0792\u07d8\u07da\u07d8\u07ce\u07cf\u07b0", "\u0590\u05c5\u05c2\u05c5\u05d8\u0592\u0590\u0592\u0584\u0585\u05fa", "\u00c9\u00cb\u00da\u00ed\u00c2\u00cf\u00dd\u00dd\u0092\u0090\u0086\u0087\u00e2\u00c4\u00cf\u00d8\u00cf\u0081\u00c2\u00cf\u00c0\u00c9\u0081\u00ed\u00c2\u00cf\u00dd\u00dd\u0095", "\u0092\u009b\u0089\u0092\u00b9\u0095\u009e\u009f\u00c6\u00c4\u00d2\u00d3\u00b3", "\u02e1\u02f5\u02f1\u02e5\u02e8\u02f7\u02b8\u02ba\u02ac\u02c8\u02ee\u02e5\u02f2\u02e5\u02ab\u02e8\u02e5\u02ea\u02e3\u02ab\u02cb\u02e6\u02ee\u02e1\u02e7\u02f0\u02bf\u02ad\u02de", "\u0469\u0466\u0465\u0464\u046f\u0436\u0434\u0422\u0423\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0445\u0468\u0460\u046f\u0469\u047e\u0431", "\u0374\u036f\u0353\u0374\u0372\u0369\u036e\u0367\u033c\u033e\u0328\u0329\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0353\u0374\u0372\u0369\u036e\u0367\u033b", "\u0389\u0388\u0393\u038e\u0381\u039e\u03db\u03d9\u03cf\u03ce\u03b1", "\u0413\u0412\u0409\u0414\u041b\u0404\u043c\u0411\u0411\u0441\u0443\u0455\u0454\u042b", "\u03c0\u03d6\u03de\u03c3\u038b\u0389\u039f\u039e\u03e1", "\u008d\u009b\u0093\u008e\u00c6\u00c4\u00d2\u00b0\u00d3\u00ac", "\u06fa\u06ec\u06e4\u06f9\u06bd\u06b1\u06b3\u06a5\u06c7\u06a4\u06db", "\u0627\u0631\u0639\u0624\u066c\u066e\u0678\u061a\u0619\u0679\u0606", "\u06bb\u06b4\u06b3\u06bc\u06b1\u06b4\u06a7\u06b8\u06e1\u06e3\u06f5\u06f4\u068b"})
public final class Class3615 {
    public static int field8065 = -1533380519;
    public static float field8066 = Float.intBitsToFloat(1062410920);
    public static float field8067;

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 8NDeSfrdFDPpz6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block8: {
            int n3;
            int n4;
            block7: {
                block6: {
                    o2 = Class.forName(Class3615.FabQWTrDLNq2TJor(k2, 99152523));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) throw new Exception("Outdated metadata version");
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class3615.FabQWTrDLNq2TJor(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class3615.FabQWTrDLNq2TJor(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (!s2.isEmpty()) break block6;
                    n4 = 45368;
                    n3 = n4;
                    if (n3 == 45368) throw new Exception("Can't find method in " + Class3615.FabQWTrDLNq2TJor(k2, 99152523) + " " + l2 + " " + m2);
                    if (n3 == 45369) break block7;
                    break block8;
                }
                n4 = 45369;
                if (!true) break block7;
                n3 = n4;
                if (n3 == 45368) throw new Exception("Can't find method in " + Class3615.FabQWTrDLNq2TJor(k2, 99152523) + " " + l2 + " " + m2);
                if (n3 != 45369) break block8;
            }
            do {
                n4 = 45367;
                n3 = n4;
                if (n3 == 45368) throw new Exception("Can't find method in " + Class3615.FabQWTrDLNq2TJor(k2, 99152523) + " " + l2 + " " + m2);
            } while (n3 == 45369);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        bl\u200e = "Uses strick liquid checks";
        field8067 = Float.intBitsToFloat(1062450045);
    }

    private static String FabQWTrDLNq2TJor(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

