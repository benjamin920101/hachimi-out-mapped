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
@HACHIMI_CLIENT(mv=100, d1={"\u0a0d\u0a0b\u0a0a\u0a0c\u0a03\u0a0c\u0a0d", "\ue894\ue898\ue893\ue890\ue890\ue897\ue892\ue892", "\u38c1\u38c1\u38c7\u38c4\u38c7\u38c3\u38c0\u38c5", "\u1674\u1677\u167f\u1674\u1674\u1670\u1671\u167e", "\u7bd7\u7bd1\u7bd5\u7bd3\u7bd4\u7bd7\u7bd0\u7bd2", "\ue014\ue017\ue010\ue013\ue010\ue015\ue011\ue014", "\ud8b7\ud8bd\ud8b0\ud8b7\ud8b6\ud8b3\ud8b2\ud8b0", "\u47a7\u47a0\u47a6\u47a4\u47a0\u47a4\u47a0\u47a6", "\ub14c\ub14b\ub141\ub141\ub140\ub14c\ub141\ub140", "\u4835\u4838\u4839\u4832\u4830\u4833\u4830\u4835", "\u2188\u218c\u218e\u218f\u218b\u2183\u218e\u2188", "\u1adb\u1adb\u1ad9\u1adb\u1adc\u1adc\u1ada\u1ad8", "\u3c74\u3c74\u3c73\u3c70\u3c71\u3c74\u3c7b\u3c74", "\uc36f\uc367\uc36e\uc367\uc365\uc367\uc365", "\uc579\uc579\uc57f\uc57f\uc578\uc572\uc578\uc572", "\u9421\u9423\u9427\u942d\u9425\u9426\u942d\u942d"}, d2={"\u0794\u07be\u079e\u27f6\u07c4\u07c6\u07d0\u07b4\u0792\u0799\u078e\u0799\u07d7\u0794\u0799\u0796\u079f\u07d7\u07ab\u078c\u078a\u0791\u0796\u079f\u07c3\u07d1\u07b4\u0792\u0799\u078e\u0799\u07d7\u0794\u0799\u0796\u079f\u07d7\u07ab\u078c\u078a\u0791\u0796\u079f\u07c3", "\u034b\u0361\u0340\u2329\u031b\u0319\u030f\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c\u030e\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c", "\u0462\u043d\u0432\u0437\u0430\u0437\u042a\u0460\u0462\u0460\u0476\u0477\u0408", "\u06e0\u06b5\u06b2\u06b5\u06a8\u06e2\u06e0\u06e2\u06f4\u06f5\u068a", "\u0762\u0760\u0771\u0746\u0769\u0764\u0776\u0776\u0739\u073b\u072d\u072c\u0749\u076f\u0764\u0773\u0764\u072a\u0769\u0764\u076b\u0762\u072a\u0746\u0769\u0764\u0776\u0776\u073e", "\u0661\u0668\u067a\u0661\u064a\u0666\u066d\u066c\u0635\u0637\u0621\u0620\u0640", "WCGS^A\u000e\f\u001a~XSDS\u001d^S\\U\u001d}PXWQF\t\u001bh", "\u01c0\u01cf\u01cc\u01cd\u01c6\u019f\u019d\u018b\u018a\u01ef\u01c9\u01c2\u01d5\u01c2\u018c\u01cf\u01c2\u01cd\u01c4\u018c\u01ec\u01c1\u01c9\u01c6\u01c0\u01d7\u0198", "\u0387\u039c\u03a0\u0387\u0381\u039a\u039d\u0394\u03cf\u03cd\u03db\u03da\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8", "\u0448\u0449\u0452\u044f\u0440\u045f\u041a\u0418\u040e\u040f\u0470", "\u010f\u010e\u0115\u0108\u0107\u0118\u0120\u010d\u010d\u015d\u015f\u0149\u0148\u0137", "\u0314\u0302\u030a\u0317\u035f\u035d\u034b\u034a\u0335", "\u0605\u0613\u061b\u0606\u064e\u064c\u065a\u0638\u065b\u0624", "\u0550\u0546\u054e\u0553\u0517\u051b\u0519\u050f\u056d\u050e\u0571", "\u03d9\u03cf\u03c7\u03da\u0392\u0390\u0386\u03e4\u03e7\u0387\u03f8", "\u0210\u021f\u0218\u0217\u021a\u021f\u020c\u0213\u024a\u0248\u025e\u025f\u0220"})
public final class Class3573 {
    public static double field7944;
    public static float field7945;
    public static float field7946;

    private static String ovFIiijDXPY4ottY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 1GLKJFOejWn7RN(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3573.ovFIiijDXPY4ottY(k, -1800792413));
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
                v0 = 63634;
                ** GOTO lbl19
            }
            v0 = 63635;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 63633;
lbl19:
                // 3 sources

                switch (v0) {
                    case 63635: {
                        continue block7;
                    }
                    case 63634: {
                        try {
                            a = Integer.parseInt(Class3573.ovFIiijDXPY4ottY(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class3573.ovFIiijDXPY4ottY(r[f], l);
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
            throw new Exception("Can't find method in " + Class3573.ovFIiijDXPY4ottY(k, -1800792413) + " " + l + " " + m);
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
        f\u200e = "Self";
        ax\u200e = "Selection";
        field7946 = Float.intBitsToFloat(1060677490);
        field7944 = Double.longBitsToDouble(4600919662852563358L);
        field7945 = Float.intBitsToFloat(1058678964);
    }
}

