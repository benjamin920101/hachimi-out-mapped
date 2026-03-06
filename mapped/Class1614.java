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
@HACHIMI_CLIENT(mv=100, d1={"\ud19c\ud19a\ud19e\ud198\ud19d\ud19c\ud19a\ud199", "\u10b2\u10b8\u10b2\u10b0\u10b0\u10b9\u10b5\u10b4", "\u6dd4\u6dd1\u6dd5\u6dd4\u6ddf\u6dd0\u6dde\u6dd6", "\u0fb8\u0fbc\u0fb6\u0fb7\u0fb8\u0fbf\u0fb9\u0fba", "\u5313\u5312\u5316\u531f\u531f\u5316\u5312\u5314", "\u8d92\u8d93\u8d96\u8d95\u8d96\u8d95\u8d91", "\ud4e5\ud4ee\ud4e4\ud4e5\ud4e6\ud4e3\ud4e4\ud4e5", "\u98b9\u98bf\u98bd\u98ba\u98be\u98be\u98b7\u98bd", "\ue011\ue016\ue014\ue012\ue013\ue013\ue011\ue01c", "\u0592\u059a\u0590\u0596\u0594\u0597\u0595\u059b", "\u106a\u1064\u1065\u106d\u106d\u106a\u106f\u106b", "\ubf13\ubf12\ubf17\ubf14\ubf15\ubf17\ubf12\ubf11", "\u21a7\u21a5\u21a2\u21a5\u21a6\u21a1\u21a4\u21a3", "\u11c4\u11c1\u11c7\u11c7\u11c3\u11cb\u11c3\u11c1", "\u63ca\u63ca\u63cc\u63c9\u63c8\u63ca\u63ca\u63c7", "\ud7c5\ud7c5\ud7c6\ud7c8\ud7c1\ud7c5\ud7c1\ud7c8"}, d2={"\u0118\u010e\u0136\u217a\u0148\u014a\u015c\u0138\u011e\u0115\u0102\u0115\u015b\u0118\u0115\u011a\u0113\u015b\u0127\u0100\u0106\u011d\u011a\u0113\u014f\u015d\u0138\u011e\u0115\u0102\u0115\u015b\u0118\u0115\u011a\u0113\u015b\u0127\u0100\u0106\u011d\u011a\u0113\u014f", "\u0780\u0796\u07af\u27e2\u07d0\u07d2\u07c4\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07bf\u0798\u079e\u0785\u0782\u078b\u07d7\u07c5\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07bf\u0798\u079e\u0785\u0782\u078b\u07d7", "\u0242\u021d\u0212\u0217\u0210\u0217\u020a\u0240\u0242\u0240\u0256\u0257\u0228", "\u03ba\u03ef\u03e8\u03ef\u03f2\u03b8\u03ba\u03b8\u03ae\u03af\u03d0", "\u01a7\u01a5\u01b4\u0183\u01ac\u01a1\u01b3\u01b3\u01fc\u01fe\u01e8\u01e9\u018c\u01aa\u01a1\u01b6\u01a1\u01ef\u01ac\u01a1\u01ae\u01a7\u01ef\u0183\u01ac\u01a1\u01b3\u01b3\u01fb", "\u04cd\u04c4\u04d6\u04cd\u04e6\u04ca\u04c1\u04c0\u0499\u049b\u048d\u048c\u04ec", "\u0544\u0550\u0554\u0540\u054d\u0552\u051d\u051f\u0509\u056d\u054b\u0540\u0557\u0540\u050e\u054d\u0540\u054f\u0546\u050e\u056e\u0543\u054b\u0544\u0542\u0555\u051a\u0508\u057b", "wx{zq(*<=X~ubu;xuzs;[v~qw`/", "\u02c2\u02d9\u02e5\u02c2\u02c4\u02df\u02d8\u02d1\u028a\u0288\u029e\u029f\u02fa\u02dc\u02d7\u02c0\u02d7\u0299\u02da\u02d7\u02d8\u02d1\u0299\u02e5\u02c2\u02c4\u02df\u02d8\u02d1\u028d", "\u0142\u0143\u0158\u0145\u014a\u0155\u0110\u0112\u0104\u0105\u017a", "\u06d3\u06d2\u06c9\u06d4\u06db\u06c4\u06fc\u06d1\u06d1\u0681\u0683\u0695\u0694\u06eb", "\u07fd\u07eb\u07e3\u07fe\u07b6\u07b4\u07a2\u07a3\u07dc", "\u06c0\u06d6\u06de\u06c3\u068b\u0689\u069f\u06fd\u069e\u06e1", "\u04fd\u04eb\u04e3\u04fe\u04ba\u04b6\u04b4\u04a2\u04c0\u04a3\u04dc", "\u0735\u0723\u072b\u0736\u077e\u077c\u076a\u0708\u070b\u076b\u0714", "\u037f\u0370\u0377\u0378\u0375\u0370\u0363\u037c\u0325\u0327\u0331\u0330\u034f"})
public final class Class1614 {
    public static double field6028;
    public static int field6029 = 1370919263;
    public static double field6030;
    public static double field6031;
    public static double field6032;
    public static float field6033;

    static {
        field6033 = Float.intBitsToFloat(1057050231);
        field6028 = Double.longBitsToDouble(4601381741811628466L);
        at\u200e = "Make a layer of shadow under the texture";
        au\u200e = "m";
        field6032 = Double.longBitsToDouble(4600336169810826306L);
        field6030 = Double.longBitsToDouble(4598830703213195012L);
        field6031 = Double.longBitsToDouble(4602841771968044147L);
    }

    private static String 9uuO2rl6B2mYRben(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite o4nrRFGJZuB6ov(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class1614.9uuO2rl6B2mYRben(k, 1859447645));
                        p = o.getAnnotation(HACHIMI_CLIENT.class);
                        if (p.mv() < 100) {
                            throw new Exception("Outdated metadata version");
                        }
                        q = p.d1();
                        r = p.d2();
                        s = "";
                        t = "";
                        for (f = 0; f < q.length; ++f) {
                            try {
                                a = Integer.parseInt(Class1614.9uuO2rl6B2mYRben(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class1614.9uuO2rl6B2mYRben(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class1614.9uuO2rl6B2mYRben(k, 1859447645) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 8080;
                        ** GOTO lbl32
                    }
                    v0 = 8081;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 8079;
lbl32:
                        // 3 sources

                        if (var17_20 == 8080) break block6;
                    } while (var17_20 == 8081);
                    break block8;
                }
                g = h.findVirtual(o, s, u);
                break block9;
            }
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

