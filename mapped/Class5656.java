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
@HACHIMI_CLIENT(mv=100, d1={"\ubb46\ubb41\ubb42\ubb41\ubb47\ubb44\ubb47", "\u4fb9\u4fb8\u4fb7\u4fba\u4fba\u4fb8\u4fb6\u4fbf", "\udfc1\udfc3\udfc5\udfc5\udfc7\udfc3\udfc6\udfc0", "\u6f74\u6f71\u6f71\u6f7b\u6f75\u6f73\u6f71\u6f72", "\u3a33\u3a37\u3a33\u3a36\u3a30\u3a31\u3a30\u3a3a", "\u322e\u3222\u3222\u3223\u322d\u322c\u3229\u322d", "\ub071\ub075\ub073\ub075\ub071\ub072\ub076\ub079", "\u7fef\u7fed\u7feb\u7fee\u7fe4\u7fe9\u7fe8\u7fe8", "\ud25a\ud25d\ud259\ud25e\ud258\ud258\ud25c\ud25a", "\u9925\u9925\u9920\u992f\u992e\u992e\u9921\u9922", "\u07b9\u07be\u07b5\u07be\u07b8\u07b5\u07b5\u07b8", "\udcab\udca9\udca9\udcac\udcad\udcaa\udcaa\udcae", "\u8b5e\u8b5f\u8b5b\u8b5d\u8b53\u8b52\u8b53\u8b5c", "\u542f\u542f\u542e\u5421\u542d\u5420\u542b\u542f", "\u2f8c\u2f8e\u2f8d\u2f8f\u2f8e\u2f8e\u2f8a", "\u6171\u6171\u6178\u6171\u6177\u6171\u6178\u6172", "\u9ee5\u9ee5\u9eea\u9ee1\u9ee2\u9ee4\u9eea", "\u5c30\u5c34\u5c36\u5c34\u5c34\u5c35\u5c3f\u5c33"}, d2={"\u044d\u045d\u0447\u2431\u0403\u0401\u0417\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404\u0416\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404", "\u054e\u055e\u0545\u2532\u0500\u0502\u0514\u0570\u0556\u055d\u054a\u055d\u0513\u0550\u055d\u0552\u055b\u0513\u056f\u0548\u054e\u0555\u0552\u055b\u0507\u0515\u0570\u0556\u055d\u054a\u055d\u0513\u0550\u055d\u0552\u055b\u0513\u056f\u0548\u054e\u0555\u0552\u055b\u0507", "\u0401\u0411\u0409\u247d\u044f\u044d\u045b\u043f\u0419\u0412\u0405\u0412\u045c\u041f\u0412\u041d\u0414\u045c\u0420\u0407\u0401\u041a\u041d\u0414\u0448\u045a\u043f\u0419\u0412\u0405\u0412\u045c\u041f\u0412\u041d\u0414\u045c\u0420\u0407\u0401\u041a\u041d\u0414\u0448", "\u034f\u035f\u037c\u2333\u0301\u0303\u0315\u0371\u0357\u035c\u034b\u035c\u0312\u0351\u035c\u0353\u035a\u0312\u036e\u0349\u034f\u0354\u0353\u035a\u0306\u0314\u0371\u0357\u035c\u034b\u035c\u0312\u0351\u035c\u0353\u035a\u0312\u036e\u0349\u034f\u0354\u0353\u035a\u0306", "\u0112\u014d\u0142\u0147\u0140\u0147\u015a\u0110\u0112\u0110\u0106\u0107\u0178", "\u06db\u068e\u0689\u068e\u0693\u06d9\u06db\u06d9\u06cf\u06ce\u06b1", "\u074c\u074e\u075f\u0768\u0747\u074a\u0758\u0758\u0717\u0715\u0703\u0702\u0767\u0741\u074a\u075d\u074a\u0704\u0747\u074a\u0745\u074c\u0704\u0768\u0747\u074a\u0758\u0758\u0710", "\u02ca\u02c3\u02d1\u02ca\u02e1\u02cd\u02c6\u02c7\u029e\u029c\u028a\u028b\u02eb", "\u0228\u023c\u0238\u022c\u0221\u023e\u0271\u0273\u0265\u0201\u0227\u022c\u023b\u022c\u0262\u0221\u022c\u0223\u022a\u0262\u0202\u022f\u0227\u0228\u022e\u0239\u0276\u0264\u0217", "\u0675\u067a\u0679\u0678\u0673\u062a\u0628\u063e\u063f\u065a\u067c\u0677\u0660\u0677\u0639\u067a\u0677\u0678\u0671\u0639\u0659\u0674\u067c\u0673\u0675\u0662\u062d", "\u00f6\u00ed\u00d1\u00f6\u00f0\u00eb\u00ec\u00e5\u00be\u00bc\u00aa\u00ab\u00ce\u00e8\u00e3\u00f4\u00e3\u00ad\u00ee\u00e3\u00ec\u00e5\u00ad\u00d1\u00f6\u00f0\u00eb\u00ec\u00e5\u00b9", "\u06e0\u06e1\u06fa\u06e7\u06e8\u06f7\u06b2\u06b0\u06a6\u06a7\u06d8", "\u0565\u0564\u057f\u0562\u056d\u0572\u054a\u0567\u0567\u0537\u0535\u0523\u0522\u055d", "\u0561\u0577\u057f\u0562\u052a\u0528\u053e\u053f\u0540", "\u03a7\u03b1\u03b9\u03a4\u03ec\u03ee\u03f8\u039a\u03f9\u0386", "\u03b3\u03a5\u03ad\u03b0\u03f4\u03f8\u03fa\u03ec\u038e\u03ed\u0392", "\u0658\u064e\u0646\u065b\u0613\u0611\u0607\u0665\u0666\u0606\u0679", "\u0605\u060a\u060d\u0602\u060f\u060a\u0619\u0606\u065f\u065d\u064b\u064a\u0635"})
public final class Class5656 {
    public static double field10837;
    public static double field10838;
    public static float field10839;
    public static double field10840;
    public static double field10841;
    public static double field10842;

    private static String 4Wl7oMVefl6ZmLcA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        p\u200e = "MSAA";
        field10842 = Double.longBitsToDouble(4600138843359556582L);
        field10838 = Double.longBitsToDouble(4598996108419321954L);
        R\u200e = "TimeOut";
        au\u200e = "LEFT";
        field10841 = Double.longBitsToDouble(4606211247557378203L);
        field10837 = Double.longBitsToDouble(4606400521283512561L);
        field10840 = Double.longBitsToDouble(4604851136427722647L);
        field10839 = Float.intBitsToFloat(1041446436);
        bn\u200e = "Fade-Time";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite kilSGf1PTDg3iz(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5656.4Wl7oMVefl6ZmLcA(k, 1718707100));
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
                v0 = 31673;
                ** GOTO lbl19
            }
            v0 = 31674;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 31672;
lbl19:
                // 3 sources

                switch (v0) {
                    case 31674: {
                        continue block7;
                    }
                    case 31673: {
                        try {
                            a = Integer.parseInt(Class5656.4Wl7oMVefl6ZmLcA(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5656.4Wl7oMVefl6ZmLcA(r[f], l);
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
            throw new Exception("Can't find method in " + Class5656.4Wl7oMVefl6ZmLcA(k, 1718707100) + " " + l + " " + m);
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

