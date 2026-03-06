/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u66bd\u66bb\u66b1\u66b0\u66bc\u66b0\u66b1\u66b8", "\u8183\u8185\u8185\u8188\u8188\u8187\u8182\u8189", "\uab38\uab3e\uab3c\uab3b\uab35\uab3b\uab3e\uab3e", "\u06f7\u06f7\u06f0\u06f5\u06f7\u06f6\u06f4\u06fd", "\u7dd1\u7dd2\u7dd4\u7dd5\u7dd1\u7ddc\u7dd4\u7ddc", "\u4247\u4241\u4247\u4241\u4242\u4246\u424a\u4246", "\u5892\u5893\u5897\u5897\u5896\u5892\u5895\u5895", "\ud593\ud594\ud597\ud592\ud593\ud59f\ud593\ud59e", "\u603b\u603f\u6036\u603b\u603f\u603d\u603a\u603f", "\ua533\ua536\ua532\ua534\ua531\ua532\ua530\ua53e", "\u0690\u0692\u0692\u0692\u0694\u069c\u069c\u0694", "\uae09\uae0a\uae07\uae0a\uae0a\uae0f\uae06\uae0d", "\uc79c\uc799\uc79b\uc79a\uc79c\uc799\uc799\uc79b", "\u02f8\u02f8\u02fd\u02fe\u02fc\u02fe\u02f5\u02f8", "\ua26e\ua26a\ua26d\ua268\ua26f\ua26d\ua26e", "\u17e1\u17e7\u17ed\u17ed\u17e2\u17e4\u17e1\u17e4", "\ua175\ua172\ua170\ua171\ua17e\ua17e\ua176\ua176", "\u1c0b\u1c0d\u1c0e\u1c00\u1c09\u1c00\u1c0e\u1c0f", "\u2fd9\u2fde\u2fdb\u2fd8\u2fda\u2fdf\u2fd6\u2fda"}, d2={"\u04af\u049b\u04a0\u24c6\u04f4\u04f6\u04e0\u0484\u04a2\u04a9\u04be\u04a9\u04e7\u04a4\u04a9\u04a6\u04af\u04e7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f3\u04e1\u0484\u04a2\u04a9\u04be\u04a9\u04e7\u04a4\u04a9\u04a6\u04af\u04e7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f3", "\u074e\u077a\u0740\u2727\u0715\u0717\u0701\u0765\u0743\u0748\u075f\u0748\u0706\u0745\u0748\u0747\u074e\u0706\u077a\u075d\u075b\u0740\u0747\u074e\u0712\u0700\u0765\u0743\u0748\u075f\u0748\u0706\u0745\u0748\u0747\u074e\u0706\u077a\u075d\u075b\u0740\u0747\u074e\u0712", "\u00f4\u00c0\u00f9\u209d\u00af\u00ad\u00bb\u00df\u00f9\u00f2\u00e5\u00f2\u00bc\u00ff\u00f2\u00fd\u00f4\u00bc\u00c0\u00e7\u00e1\u00fa\u00fd\u00f4\u00a8\u00ba\u00df\u00f9\u00f2\u00e5\u00f2\u00bc\u00ff\u00f2\u00fd\u00f4\u00bc\u00c0\u00e7\u00e1\u00fa\u00fd\u00f4\u00a8", "\u00cd\u00f9\u00c1\u20a4\u0096\u0094\u0082\u00e6\u00c0\u00cb\u00dc\u00cb\u0085\u00c6\u00cb\u00c4\u00cd\u0085\u00f9\u00de\u00d8\u00c3\u00c4\u00cd\u0091\u0083\u00e6\u00c0\u00cb\u00dc\u00cb\u0085\u00c6\u00cb\u00c4\u00cd\u0085\u00f9\u00de\u00d8\u00c3\u00c4\u00cd\u0091", "\u0594\u05a0\u059f\u25fd\u05cf\u05cd\u05db\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05a0\u0587\u0581\u059a\u059d\u0594\u05c8\u05da\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05a0\u0587\u0581\u059a\u059d\u0594\u05c8", "\u0457\u0408\u0407\u0402\u0405\u0402\u041f\u0455\u0457\u0455\u0443\u0442\u043d", "\u039d\u03c8\u03cf\u03c8\u03d5\u039f\u039d\u039f\u0389\u0388\u03f7", "\u0200\u0202\u0213\u0224\u020b\u0206\u0214\u0214\u025b\u0259\u024f\u024e\u022b\u020d\u0206\u0211\u0206\u0248\u020b\u0206\u0209\u0200\u0248\u0224\u020b\u0206\u0214\u0214\u025c", "\u0179\u0170\u0162\u0179\u0152\u017e\u0175\u0174\u012d\u012f\u0139\u0138\u0158", "\u01c9\u01dd\u01d9\u01cd\u01c0\u01df\u0190\u0192\u0184\u01e0\u01c6\u01cd\u01da\u01cd\u0183\u01c0\u01cd\u01c2\u01cb\u0183\u01e3\u01ce\u01c6\u01c9\u01cf\u01d8\u0197\u0185\u01f6", "\u04eb\u04e4\u04e7\u04e6\u04ed\u04b4\u04b6\u04a0\u04a1\u04c4\u04e2\u04e9\u04fe\u04e9\u04a7\u04e4\u04e9\u04e6\u04ef\u04a7\u04c7\u04ea\u04e2\u04ed\u04eb\u04fc\u04b3", "\u01f2\u01e9\u01d5\u01f2\u01f4\u01ef\u01e8\u01e1\u01ba\u01b8\u01ae\u01af\u01ca\u01ec\u01e7\u01f0\u01e7\u01a9\u01ea\u01e7\u01e8\u01e1\u01a9\u01d5\u01f2\u01f4\u01ef\u01e8\u01e1\u01bd", "\u055f\u055e\u0545\u0558\u0557\u0548\u050d\u050f\u0519\u0518\u0567", "\u0116\u0117\u010c\u0111\u011e\u0101\u0139\u0114\u0114\u0144\u0146\u0150\u0151\u012e", "\u0522\u0534\u053c\u0521\u0569\u056b\u057d\u057c\u0503", "\u00c2\u00d4\u00dc\u00c1\u0089\u008b\u009d\u00ff\u009c\u00e3", "\u026e\u0278\u0270\u026d\u0229\u0225\u0227\u0231\u0253\u0230\u024f", "\u0609\u061f\u0617\u060a\u0642\u0640\u0656\u0634\u0637\u0657\u0628", "\u0332\u033d\u033a\u0335\u0338\u033d\u032e\u0331\u0368\u036a\u037c\u037d\u0302"})
public final class Class1212 {
    public static double field4776 = Double.longBitsToDouble(4597892040390613008L);

    static {
        Y\u200e = "1.2.2.1";
        aD\u200e = "MOUSE1";
        bd\u200e = "The minimum percent of total stack before replenishing";
        bs\u200e = "No player name history!";
        bT\u200e = "The number of ticks to boost strafe";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite Bg6de4Ypwe6LoO(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1212.ewtIF6iEDYA7odj0(k, -94961238));
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
                v0 = 65454;
                ** GOTO lbl19
            }
            v0 = 65455;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 65453;
lbl19:
                // 3 sources

                switch (v0) {
                    case 65455: {
                        continue block7;
                    }
                    case 65454: {
                        try {
                            a = Integer.parseInt(Class1212.ewtIF6iEDYA7odj0(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1212.ewtIF6iEDYA7odj0(r[f], l);
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
            throw new Exception("Can't find method in " + Class1212.ewtIF6iEDYA7odj0(k, -94961238) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String ewtIF6iEDYA7odj0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

