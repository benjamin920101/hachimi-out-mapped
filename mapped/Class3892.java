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

@HACHIMI_CLIENT(mv=100, d1={"\u01cc\u01cd\u01cd\u01c3\u01cc\u01c3\u01c6", "\udfaa\udfa0\udfa9\udfa9\udfae\udfac\udfa8\udfa0", "\u9a4e\u9a4d\u9a4e\u9a4d\u9a46\u9a49\u9a4d\u9a4d", "\ue2b9\ue2b9\ue2bc\ue2b1\ue2ba\ue2b1\ue2bb\ue2be", "\uc1e3\uc1e5\uc1e4\uc1ee\uc1e3\uc1e1\uc1e2\uc1e7", "\u8a91\u8a94\u8a91\u8a9d\u8a92\u8a94\u8a93\u8a90", "\u54a5\u54a4\u54ae\u54af\u54a1\u54a7\u54a7\u54ae", "\udf27\udf2b\udf27\udf22\udf24\udf20\udf2a\udf22", "\u015b\u0153\u015a\u015f\u0152\u015c\u015a\u0158", "\u4734\u4737\u4734\u473b\u4736\u4736\u473a", "\u7112\u7117\u711a\u7112\u711b\u7111\u7112\u7110", "\ud63c\ud634\ud63d\ud630\ud63d\ud63c\ud637", "\u93df\u93d8\u93d6\u93dd\u93dc\u93d7\u93da\u93da", "\u089b\u0890\u089d\u0891\u089b\u0890\u089a\u089b", "\u19fd\u19f5\u19fd\u19f4\u19ff\u19f5\u19f9\u19f4", "\ubeef\ubeea\ubeef\ubee6\ubee8\ubee9\ubeed", "\u9ac7\u9aca\u9ac6\u9ac2\u9ac7\u9ac7\u9ac0\u9ac4"}, d2={"\u0594\u0584\u05bf\u25ff\u05cd\u05cf\u05d9\u05bd\u059b\u0590\u0587\u0590\u05de\u059d\u0590\u059f\u0596\u05de\u05a2\u0585\u0583\u0598\u059f\u0596\u05ca\u05d8\u05bd\u059b\u0590\u0587\u0590\u05de\u059d\u0590\u059f\u0596\u05de\u05a2\u0585\u0583\u0598\u059f\u0596\u05ca", "\u046e\u047e\u0444\u2405\u0437\u0435\u0423\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430\u0422\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430", "\u0232\u0222\u0207\u2259\u026b\u0269\u027f\u021b\u023d\u0236\u0221\u0236\u0278\u023b\u0236\u0239\u0230\u0278\u0204\u0223\u0225\u023e\u0239\u0230\u026c\u027e\u021b\u023d\u0236\u0221\u0236\u0278\u023b\u0236\u0239\u0230\u0278\u0204\u0223\u0225\u023e\u0239\u0230\u026c", "\u03b9\u03e6\u03e9\u03ec\u03eb\u03ec\u03f1\u03bb\u03b9\u03bb\u03ad\u03ac\u03d3", "\u00cf\u009a\u009d\u009a\u0087\u00cd\u00cf\u00cd\u00db\u00da\u00a5", "\u025f\u025d\u024c\u027b\u0254\u0259\u024b\u024b\u0204\u0206\u0210\u0211\u0274\u0252\u0259\u024e\u0259\u0217\u0254\u0259\u0256\u025f\u0217\u027b\u0254\u0259\u024b\u024b\u0203", "\u0440\u0449\u045b\u0440\u046b\u0447\u044c\u044d\u0414\u0416\u0400\u0401\u0461", "\u032f\u033b\u033f\u032b\u0326\u0339\u0376\u0374\u0362\u0306\u0320\u032b\u033c\u032b\u0365\u0326\u032b\u0324\u032d\u0365\u0305\u0328\u0320\u032f\u0329\u033e\u0371\u0363\u0310", "\u049e\u0491\u0492\u0493\u0498\u04c1\u04c3\u04d5\u04d4\u04b1\u0497\u049c\u048b\u049c\u04d2\u0491\u049c\u0493\u049a\u04d2\u04b2\u049f\u0497\u0498\u049e\u0489\u04c6", "\u017b\u0160\u015c\u017b\u017d\u0166\u0161\u0168\u0133\u0131\u0127\u0126\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u015c\u017b\u017d\u0166\u0161\u0168\u0134", "\u03fd\u03fc\u03e7\u03fa\u03f5\u03ea\u03af\u03ad\u03bb\u03ba\u03c5", "\u03ec\u03ed\u03f6\u03eb\u03e4\u03fb\u03c3\u03ee\u03ee\u03be\u03bc\u03aa\u03ab\u03d4", "\u00d7\u00c1\u00c9\u00d4\u009c\u009e\u0088\u0089\u00f6", "\u0246\u0250\u0258\u0245\u020d\u020f\u0219\u027b\u0218\u0267", "\u020e\u0218\u0210\u020d\u0249\u0245\u0247\u0251\u0233\u0250\u022f", "\u0503\u0515\u051d\u0500\u0548\u054a\u055c\u053e\u053d\u055d\u0522", "\u0632\u063d\u063a\u0635\u0638\u063d\u062e\u0631\u0668\u066a\u067c\u067d\u0602"})
public final class Class3892 {
    public static double field8854;
    public static double field8855 = 0.8492255340258366;
    public static long field8856 = 6194445758099578081L;
    public static double field8857;
    public static int field8858 = 1047206191;

    static {
        u\u200e = "Vertical";
        M\u200e = "unix";
        field8854 = Double.longBitsToDouble(4604159377814578733L);
        field8857 = Double.longBitsToDouble(4604213686613669019L);
        bS\u200e = "Move faster";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite rN0hoNboVrywYW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3892.YqN8XSiBtFv64Aya(k2, -623927118));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block8: {
                void e2;
                int n3 = f2 < q2.length ? 36508 : 36509;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 36508) {
                        try {
                            int a2 = Integer.parseInt(Class3892.YqN8XSiBtFv64Aya(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block8;
                        }
                    }
                    if (n4 != 36509) break block2;
                    n3 = 36507;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3892.YqN8XSiBtFv64Aya(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3892.YqN8XSiBtFv64Aya(k2, -623927118) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String YqN8XSiBtFv64Aya(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

