/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ud769\ud76f\ud76f\ud765\ud76c\ud76d\ud769\ud76b", "\uaf6c\uaf66\uaf69\uaf6b\uaf6f\uaf6d\uaf68\uaf66", "\u914e\u914b\u914a\u9140\u9149\u9148", "\u4a5b\u4a58\u4a5a\u4a59\u4a57\u4a5e\u4a57\u4a5e", "\u8273\u8278\u827c\u827a\u8278\u8278\u827e", "\u1421\u1428\u1423\u1428\u1420\u1427", "\u8548\u854f\u854f\u854f\u854e\u854d\u854d\u854d", "\u1199\u119d\u1190\u119c\u119e\u119e\u1190\u119a", "\u58ca\u58cb\u58cb\u58cd\u58ca\u58c8\u58c8\u58cd", "\u60cf\u60cf\u60cb\u60cf\u60c7\u60cd\u60cd\u60cf", "\u8434\u8431\u8436\u8430\u8434\u8435\u8437\u8438", "\u2096\u2095\u2096\u2097\u2097\u209d\u2092\u2095", "\u0669\u066c\u066b\u066f\u066b\u066e\u066b\u066e", "\ub1e9\ub1ef\ub1e9\ub1ea\ub1e9\ub1e8\ub1ed\ub1ee", "\u16b6\u16bc\u16b6\u16ba\u16bf\u16b7\u16b9", "\u9c2c\u9c28\u9c29\u9c2b\u9c29\u9c2e\u9c2c\u9c2a", "\ub6a3\ub6a6\ub6a7\ub6a9\ub6a3\ub6a4\ub6a0\ub6a5", "\u642f\u642c\u6423\u642c\u6428\u642b\u642b\u6422", "\u9d69\u9d6b\u9d6f\u9d69\u9d6b\u9d6f\u9d69\u9d6d"}, d2={"X^Z\u2033\u0001\u0003\u0015qW\\K\\\u0012Q\\SZ\u0012nIOTSZ\u0006\u0014qW\\K\\\u0012Q\\SZ\u0012nIOTSZ\u0006", "\u0595\u0593\u0598\u25fe\u05cc\u05ce\u05d8\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05a3\u0584\u0582\u0599\u059e\u0597\u05cb\u05d9\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05a3\u0584\u0582\u0599\u059e\u0597\u05cb", "\u07bf\u07b9\u07b3\u27d4\u07e6\u07e4\u07f2\u0796\u07b0\u07bb\u07ac\u07bb\u07f5\u07b6\u07bb\u07b4\u07bd\u07f5\u0789\u07ae\u07a8\u07b3\u07b4\u07bd\u07e1\u07f3\u0796\u07b0\u07bb\u07ac\u07bb\u07f5\u07b6\u07bb\u07b4\u07bd\u07f5\u0789\u07ae\u07a8\u07b3\u07b4\u07bd\u07e1", "\u0433\u0435\u043c\u2458\u046a\u0468\u047e\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d\u047f\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d", "\u0453\u0455\u045d\u2438\u040a\u0408\u041e\u047a\u045c\u0457\u0440\u0457\u0419\u045a\u0457\u0458\u0451\u0419\u0465\u0442\u0444\u045f\u0458\u0451\u040d\u041f\u047a\u045c\u0457\u0440\u0457\u0419\u045a\u0457\u0458\u0451\u0419\u0465\u0442\u0444\u045f\u0458\u0451\u040d", "\u001cCLINIT\u001e\u001c\u001e\b\tv", "\u0109\u015c\u015b\u015c\u0141\u010b\u0109\u010b\u011d\u011c\u0163", "\u026c\u026e\u027f\u0248\u0267\u026a\u0278\u0278\u0237\u0235\u0223\u0222\u0247\u0261\u026a\u027d\u026a\u0224\u0267\u026a\u0265\u026c\u0224\u0248\u0267\u026a\u0278\u0278\u0230", "\u0523\u052a\u0538\u0523\u0508\u0524\u052f\u052e\u0577\u0575\u0563\u0562\u0502", "\u0435\u0421\u0425\u0431\u043c\u0423\u046c\u046e\u0478\u041c\u043a\u0431\u0426\u0431\u047f\u043c\u0431\u043e\u0437\u047f\u041f\u0432\u043a\u0435\u0433\u0424\u046b\u0479\u040a", "\u0186\u0189\u018a\u018b\u0180\u01d9\u01db\u01cd\u01cc\u01a9\u018f\u0184\u0193\u0184\u01ca\u0189\u0184\u018b\u0182\u01ca\u01aa\u0187\u018f\u0180\u0186\u0191\u01de", "\u01c4\u01df\u01e3\u01c4\u01c2\u01d9\u01de\u01d7\u018c\u018e\u0198\u0199\u01fc\u01da\u01d1\u01c6\u01d1\u019f\u01dc\u01d1\u01de\u01d7\u019f\u01e3\u01c4\u01c2\u01d9\u01de\u01d7\u018b", "\u07a4\u07a5\u07be\u07a3\u07ac\u07b3\u07f6\u07f4\u07e2\u07e3\u079c", "\u0191\u0190\u018b\u0196\u0199\u0186\u01be\u0193\u0193\u01c3\u01c1\u01d7\u01d6\u01a9", "\u0764\u0772\u077a\u0767\u072f\u072d\u073b\u073a\u0745", "SEMP\u0018\u001a\fn\rr", "\u03e9\u03ff\u03f7\u03ea\u03ae\u03a2\u03a0\u03b6\u03d4\u03b7\u03c8", "\u0335\u0323\u032b\u0336\u037e\u037c\u036a\u0308\u030b\u036b\u0314", "\u04f0\u04ff\u04f8\u04f7\u04fa\u04ff\u04ec\u04f3\u04aa\u04a8\u04be\u04bf\u04c0"})
public final class Class1751 {
    public static int field6570 = 51008895;
    public static float field6571;
    public static double field6572;
    public static float field6573;
    public static double field6574;

    /*
     * Unable to fully structure code
     */
    private static CallSite odt0ZzTlOqk4Qv(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1751.rBssEnDTt0JeZ7hA(k, 1476862851));
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
                v0 = 20387;
                ** GOTO lbl19
            }
            v0 = 20388;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 20386;
lbl19:
                // 3 sources

                switch (v0) {
                    case 20388: {
                        continue block7;
                    }
                    case 20387: {
                        try {
                            a = Integer.parseInt(Class1751.rBssEnDTt0JeZ7hA(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1751.rBssEnDTt0JeZ7hA(r[f], l);
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
            throw new Exception("Can't find method in " + Class1751.rBssEnDTt0JeZ7hA(k, 1476862851) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String rBssEnDTt0JeZ7hA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6574 = Double.longBitsToDouble(4599319540845127572L);
        field6573 = Float.intBitsToFloat(1064313491);
        M\u200e = "yaw";
        field6571 = Float.intBitsToFloat(1047066328);
        ai\u200e = "Delay";
        ak\u200e = "Box rendering mode";
        field6572 = Double.longBitsToDouble(4587366580439587226L);
        bt\u200e = "radius";
        bH\u200e = "Places blocks only after the server confirms";
    }
}

