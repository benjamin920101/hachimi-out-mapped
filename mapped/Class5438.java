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
@HACHIMI_CLIENT(mv=100, d1={"\u42c4\u42c0\u42c0\u42c5\u42cf\u42c7\u42c4\u42c7", "\uba09\uba0e\uba0c\uba0f\uba0a\uba08\uba03\uba0b", "\u920d\u920e\u9208\u920c\u920a\u920f\u920d\u920f", "\u0bad\u0bae\u0baf\u0ba5\u0bac\u0ba4\u0bae\u0ba4", "\u7d33\u7d32\u7d3e\u7d3e\u7d32\u7d36\u7d36\u7d35", "\ua061\ua062\ua063\ua06d\ua06c\ua06c\ua062\ua061", "\u170a\u1703\u1704\u1707\u1700\u1706\u1705", "\u9c8c\u9c8e\u9c8f\u9c89\u9c8e\u9c8d\u9c87\u9c8c", "\u4e58\u4e5a\u4e58\u4e5b\u4e5b\u4e5f\u4e58\u4e5a", "\u7ca9\u7caf\u7ca2\u7ca3\u7cad\u7ca9\u7ca3\u7ca9", "\u4ffb\u4ff1\u4ff0\u4ff8\u4ffc\u4ffd\u4ff8\u4ff8", "\u120a\u1206\u1208\u120e\u120d\u120f\u1206\u120c", "\u198c\u198f\u198b\u1981\u198e\u1980\u198c\u1989", "\u3bd4\u3bd6\u3bd5\u3bd0\u3bdd\u3bd6\u3bd4\u3bd3", "\u73d4\u73de\u73d0\u73d7\u73d1\u73d6\u73d5\u73d6", "\u4a79\u4a7d\u4a79\u4a78\u4a75\u4a7f\u4a7f\u4a79"}, d2={"\u03c1\u03eb\u03c7\u23bf\u038d\u038f\u0399\u03fd\u03db\u03d0\u03c7\u03d0\u039e\u03dd\u03d0\u03df\u03d6\u039e\u03e2\u03c5\u03c3\u03d8\u03df\u03d6\u038a\u0398\u03fd\u03db\u03d0\u03c7\u03d0\u039e\u03dd\u03d0\u03df\u03d6\u039e\u03e2\u03c5\u03c3\u03d8\u03df\u03d6\u038a", "\u0484\u04ae\u0483\u24fa\u04c8\u04ca\u04dc\u04b8\u049e\u0495\u0482\u0495\u04db\u0498\u0495\u049a\u0493\u04db\u04a7\u0480\u0486\u049d\u049a\u0493\u04cf\u04dd\u04b8\u049e\u0495\u0482\u0495\u04db\u0498\u0495\u049a\u0493\u04db\u04a7\u0480\u0486\u049d\u049a\u0493\u04cf", "\u01cc\u0193\u019c\u0199\u019e\u0199\u0184\u01ce\u01cc\u01ce\u01d8\u01d9\u01a6", "\u0612\u0647\u0640\u0647\u065a\u0610\u0612\u0610\u0606\u0607\u0678", "\u05d8\u05da\u05cb\u05fc\u05d3\u05de\u05cc\u05cc\u0583\u0581\u0597\u0596\u05f3\u05d5\u05de\u05c9\u05de\u0590\u05d3\u05de\u05d1\u05d8\u0590\u05fc\u05d3\u05de\u05cc\u05cc\u0584", "\u0611\u0618\u060a\u0611\u063a\u0616\u061d\u061c\u0645\u0647\u0651\u0650\u0630", "\u0637\u0623\u0627\u0633\u063e\u0621\u066e\u066c\u067a\u061e\u0638\u0633\u0624\u0633\u067d\u063e\u0633\u063c\u0635\u067d\u061d\u0630\u0638\u0637\u0631\u0626\u0669\u067b\u0608", "\u030c\u0303\u0300\u0301\u030a\u0353\u0351\u0347\u0346\u0323\u0305\u030e\u0319\u030e\u0340\u0303\u030e\u0301\u0308\u0340\u0320\u030d\u0305\u030a\u030c\u031b\u0354", "\u04c8\u04d3\u04ef\u04c8\u04ce\u04d5\u04d2\u04db\u0480\u0482\u0494\u0495\u04f0\u04d6\u04dd\u04ca\u04dd\u0493\u04d0\u04dd\u04d2\u04db\u0493\u04ef\u04c8\u04ce\u04d5\u04d2\u04db\u0487", "\u0168\u0169\u0172\u016f\u0160\u017f\u013a\u0138\u012e\u012f\u0150", "\u07b9\u07b8\u07a3\u07be\u07b1\u07ae\u0796\u07bb\u07bb\u07eb\u07e9\u07ff\u07fe\u0781", "\u02ba\u02ac\u02a4\u02b9\u02f1\u02f3\u02e5\u02e4\u029b", "\u02a9\u02bf\u02b7\u02aa\u02e2\u02e0\u02f6\u0294\u02f7\u0288", "\u019a\u018c\u0184\u0199\u01dd\u01d1\u01d3\u01c5\u01a7\u01c4\u01bb", "\u03c4\u03d2\u03da\u03c7\u038f\u038d\u039b\u03f9\u03fa\u039a\u03e5", "\u079b\u0794\u0793\u079c\u0791\u0794\u0787\u0798\u07c1\u07c3\u07d5\u07d4\u07ab"})
public final class Class5438 {
    public static float field10152 = 0.516078f;
    public static double field10153;
    public static float field10154;

    /*
     * Unable to fully structure code
     */
    private static CallSite 5M0vlG42Sw1FSD(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block20: {
            block19: {
                o = Class.forName(Class5438.lJXNyDrhCgVaZNat(k, 1354650271));
                p = o.getAnnotation(HACHIMI_CLIENT.class);
                if (p.mv() < 100) {
                    throw new Exception("Outdated metadata version");
                }
                q = p.d1();
                r = p.d2();
                s = "";
                t = "";
                f = 0;
                while (true) {
                    block17: {
                        block16: {
                            block18: {
                                if (f >= q.length) break block18;
                                v0 = 32596;
                                ** GOTO lbl19
                            }
                            v0 = 32597;
                            if (true) ** GOTO lbl19
                            do {
                                v0 = var14_15 = 32595;
lbl19:
                                // 3 sources

                                if (var14_15 == 32596) break block16;
                            } while (var14_15 == 32597);
                            break;
                        }
                        try {
                            a = Integer.parseInt(Class5438.lJXNyDrhCgVaZNat(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            break block17;
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5438.lJXNyDrhCgVaZNat(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                    }
                    ++f;
                }
                if (!s.isEmpty()) break block19;
                v1 = 49030;
                ** GOTO lbl45
            }
            v1 = 49031;
            if (true) ** GOTO lbl45
            block12: while (true) {
                v1 = 49029;
lbl45:
                // 3 sources

                switch (v1) {
                    case 49031: {
                        continue block12;
                    }
                    case 49030: {
                        throw new Exception("Can't find method in " + Class5438.lJXNyDrhCgVaZNat(k, 1354650271) + " " + l + " " + m);
                    }
                }
                break;
            }
            u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
            if (n != 1) break block20;
            v2 = 43936;
            ** GOTO lbl59
        }
        v2 = 43937;
        if (true) ** GOTO lbl59
        block13: while (true) {
            v2 = 43935;
lbl59:
            // 3 sources

            switch (v2) {
                case 43937: {
                    continue block13;
                }
                case 43936: {
                    g = h.findVirtual(o, s, u);
                    break block13;
                }
                default: {
                    v = h.findStatic(o, s, u);
                }
            }
            break;
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field10154 = Float.intBitsToFloat(1055581194);
        aB\u200e = "Prevents certain game elements from rendering";
        field10153 = Double.longBitsToDouble(4602957003907035578L);
        bn\u200e = "/";
    }

    private static String lJXNyDrhCgVaZNat(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

