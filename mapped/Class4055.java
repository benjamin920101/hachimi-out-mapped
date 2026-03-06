/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u5028\u502a\u502b\u502d\u502f\u502d\u5025\u502a", "\u823e\u823e\u823d\u823d\u8230\u823c\u823d\u823f", "\u3fde\u3fd8\u3fdb\u3fd2\u3fd8\u3fdd\u3fdb\u3fd2", "\ub1ba\ub1bd\ub1bb\ub1bd\ub1bf\ub1b9\ub1bf\ub1bb", "\u2695\u2691\u2694\u2691\u2699\u2697\u2695\u2698", "\ua09f\ua092\ua09b\ua09a\ua093\ua098\ua09a\ua09f", "\u5ef2\u5ef3\u5ef1\u5ef1\u5ef7\u5ef2\u5ef7\u5ef7", "\u1e1c\u1e1f\u1e1e\u1e1d\u1e1f\u1e1d\u1e1a\u1e19", "\u21bb\u21bd\u21ba\u21bb\u21b6\u21bf", "\uc8b6\uc8b6\uc8b2\uc8b1\uc8b9\uc8b1\uc8b5\uc8b5", "\uc595\uc592\uc594\uc591\uc595\uc594\uc595\uc593", "\u9876\u9871\u9875\u987b\u9874\u9870\u9875\u9874", "\u7a00\u7a03\u7a0c\u7a01\u7a01\u7a01\u7a01\u7a01", "\ue4dc\ue4dc\ue4d5\ue4d8\ue4dd\ue4d5\ue4d4\ue4dc", "\uc100\uc100\uc103\uc100\uc105\uc109\uc102", "\u91b7\u91b9\u91b4\u91b3\u91b6\u91b6\u91b8\u91b8", "\u115e\u115e\u115f\u115f\u1154\u115f\u115f\u1159", "\uc3bd\uc3b9\uc3b0\uc3bf\uc3bc\uc3be\uc3b8\uc3bf", "\u385e\u3859\u3859\u3859\u3851\u3851\u385a\u385a"}, d2={"\u03b0\u038b\u039f\u23dc\u03ee\u03ec\u03fa\u039e\u03b8\u03b3\u03a4\u03b3\u03fd\u03be\u03b3\u03bc\u03b5\u03fd\u0381\u03a6\u03a0\u03bb\u03bc\u03b5\u03e9\u03fb\u039e\u03b8\u03b3\u03a4\u03b3\u03fd\u03be\u03b3\u03bc\u03b5\u03fd\u0381\u03a6\u03a0\u03bb\u03bc\u03b5\u03e9", "\u0081\u00ba\u00ad\u20ed\u00df\u00dd\u00cb\u00af\u0089\u0082\u0095\u0082\u00cc\u008f\u0082\u008d\u0084\u00cc\u00b0\u0097\u0091\u008a\u008d\u0084\u00d8\u00ca\u00af\u0089\u0082\u0095\u0082\u00cc\u008f\u0082\u008d\u0084\u00cc\u00b0\u0097\u0091\u008a\u008d\u0084\u00d8", "\u0362\u0359\u034f\u230e\u033c\u033e\u0328\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0353\u0374\u0372\u0369\u036e\u0367\u033b\u0329\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0353\u0374\u0372\u0369\u036e\u0367\u033b", "\u048d\u04b6\u04bf\u24e1\u04d3\u04d1\u04c7\u04a3\u0485\u048e\u0499\u048e\u04c0\u0483\u048e\u0481\u0488\u04c0\u04bc\u049b\u049d\u0486\u0481\u0488\u04d4\u04c6\u04a3\u0485\u048e\u0499\u048e\u04c0\u0483\u048e\u0481\u0488\u04c0\u04bc\u049b\u049d\u0486\u0481\u0488\u04d4", "\u020b\u0230\u0238\u2267\u0255\u0257\u0241\u0225\u0203\u0208\u021f\u0208\u0246\u0205\u0208\u0207\u020e\u0246\u023a\u021d\u021b\u0200\u0207\u020e\u0252\u0240\u0225\u0203\u0208\u021f\u0208\u0246\u0205\u0208\u0207\u020e\u0246\u023a\u021d\u021b\u0200\u0207\u020e\u0252", "\u04d9\u0486\u0489\u048c\u048b\u048c\u0491\u04db\u04d9\u04db\u04cd\u04cc\u04b3", "\u01b0\u01e5\u01e2\u01e5\u01f8\u01b2\u01b0\u01b2\u01a4\u01a5\u01da", "\u06fd\u06ff\u06ee\u06d9\u06f6\u06fb\u06e9\u06e9\u06a6\u06a4\u06b2\u06b3\u06d6\u06f0\u06fb\u06ec\u06fb\u06b5\u06f6\u06fb\u06f4\u06fd\u06b5\u06d9\u06f6\u06fb\u06e9\u06e9\u06a1", "\u072e\u0727\u0735\u072e\u0705\u0729\u0722\u0723\u077a\u0778\u076e\u076f\u070f", "\u041a\u040e\u040a\u041e\u0413\u040c\u0443\u0441\u0457\u0433\u0415\u041e\u0409\u041e\u0450\u0413\u041e\u0411\u0418\u0450\u0430\u041d\u0415\u041a\u041c\u040b\u0444\u0456\u0425", "\u0185\u018a\u0189\u0188\u0183\u01da\u01d8\u01ce\u01cf\u01aa\u018c\u0187\u0190\u0187\u01c9\u018a\u0187\u0188\u0181\u01c9\u01a9\u0184\u018c\u0183\u0185\u0192\u01dd", "\u076b\u0770\u074c\u076b\u076d\u0776\u0771\u0778\u0723\u0721\u0737\u0736\u0753\u0775\u077e\u0769\u077e\u0730\u0773\u077e\u0771\u0778\u0730\u074c\u076b\u076d\u0776\u0771\u0778\u0724", "\u04d5\u04d4\u04cf\u04d2\u04dd\u04c2\u0487\u0485\u0493\u0492\u04ed", "\u053b\u053a\u0521\u053c\u0533\u052c\u0514\u0539\u0539\u0569\u056b\u057d\u057c\u0503", "\u055c\u054a\u0542\u055f\u0517\u0515\u0503\u0502\u057d", "\u0720\u0736\u073e\u0723\u076b\u0769\u077f\u071d\u077e\u0701", "\u0285\u0293\u029b\u0286\u02c2\u02ce\u02cc\u02da\u02b8\u02db\u02a4", "\u0102\u0114\u011c\u0101\u0149\u014b\u015d\u013f\u013c\u015c\u0123", "\u07ef\u07e0\u07e7\u07e8\u07e5\u07e0\u07f3\u07ec\u07b5\u07b7\u07a1\u07a0\u07df"})
public final class Class4055 {
    public static float field9357;
    public static float field9358;

    private static String tnqGIvDUgRwAr4pD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite qkFKNWt7GYGmEd(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4055.tnqGIvDUgRwAr4pD(k, -366926142));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block10: while (true) {
            v0 = f < q.length ? 864 : 865;
            block11: while (true) {
                switch (v0) {
                    case 865: {
                        v0 = 863;
                        continue block11;
                    }
                    case 864: {
                        try {
                            a = Integer.parseInt(Class4055.tnqGIvDUgRwAr4pD(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl35
                        }
                        v1 = e % 59557 != m.intValue() ? 30907 : 30906;
                        block12: while (true) {
                            switch (v1) {
                                case 30907: {
                                    v1 = 30905;
                                    continue block12;
                                }
                                case 30906: {
                                    c = Class4055.tnqGIvDUgRwAr4pD(r[f], l);
                                    d = c.split("<>");
                                    s = d[0];
                                    t = d[1];
                                    break block10;
                                }
                            }
                            break;
                        }
lbl35:
                        // 2 sources

                        ++f;
                        continue block10;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty() != false) throw new Exception("Can't find method in " + Class4055.tnqGIvDUgRwAr4pD(k, -366926142) + " " + l + " " + m);
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n != 1) {
            v = h.findStatic(o, s, u);
            return new ConstantCallSite(v.asType(j));
        }
        g = h.findVirtual(o, s, u);
        return new ConstantCallSite(v.asType(j));
    }

    static {
        f\u200e = "The render color for players";
        field9357 = Float.intBitsToFloat(1064710062);
        Y\u200e = "Kit";
        ad\u200e = "Always";
        field9358 = Float.intBitsToFloat(1052233478);
        aY\u200e = "Render shaders on crystals";
        bc\u200e = "Falls down blocks faster";
    }
}

