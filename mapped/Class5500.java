/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u134f\u134e\u134a\u1349\u134d\u134a\u1340\u134c", "\u1d5f\u1d54\u1d5d\u1d54\u1d5f\u1d59\u1d5a\u1d55", "\u208f\u2088\u208e\u208f\u2081\u2080\u2081\u208f", "\ua2c2\ua2c8\ua2c2\ua2c1\ua2c2\ua2c1\ua2c7\ua2c3", "\ucae9\ucaee\ucaeb\ucae9\ucaea\ucaeb\ucae8\ucaea", "\u55ee\u55ef\u55ef\u55e8\u55e9\u55ef\u55e8\u55ec", "\u0cef\u0ce0\u0ce2\u0cef\u0ce6\u0ce1\u0ce1", "\u37c9\u37cc\u37cf\u37cd\u37ca\u37c9\u37cb\u37ce", "\uca16\uca16\uca14\uca15\uca17\uca17\uca19\uca19", "\u2a39\u2a3d\u2a3d\u2a3d\u2a3c\u2a3a\u2a3b\u2a3c", "\u5493\u5496\u5490\u5496\u5496\u5492\u5490\u5496", "\u36b9\u36b7\u36ba\u36bf\u36bb\u36ba\u36be\u36b8", "\u4650\u4653\u4651\u4650\u4650\u4651\u4654\u4652", "\u12d2\u12d3\u12df\u12d4\u12d5\u12d4\u12de\u12d3", "\u7c8b\u7c89\u7c8e\u7c86\u7c89\u7c8b\u7c8a\u7c8e", "\u0087\u0082\u0084\u008d\u0085\u0083\u0086\u0086"}, d2={"\u0730\u0719\u071d\u2752\u0760\u0762\u0774\u0710\u0736\u073d\u072a\u073d\u0773\u0730\u073d\u0732\u073b\u0773\u070f\u0728\u072e\u0735\u0732\u073b\u0767\u0775\u0710\u0736\u073d\u072a\u073d\u0773\u0730\u073d\u0732\u073b\u0773\u070f\u0728\u072e\u0735\u0732\u073b\u0767", "\u07c3\u07ea\u07ed\u27a1\u0793\u0791\u0787\u07e3\u07c5\u07ce\u07d9\u07ce\u0780\u07c3\u07ce\u07c1\u07c8\u0780\u07fc\u07db\u07dd\u07c6\u07c1\u07c8\u0794\u0786\u07e3\u07c5\u07ce\u07d9\u07ce\u0780\u07c3\u07ce\u07c1\u07c8\u0780\u07fc\u07db\u07dd\u07c6\u07c1\u07c8\u0794", "\u026a\u0235\u023a\u023f\u0238\u023f\u0222\u0268\u026a\u0268\u027e\u027f\u0200", "\u060a\u065f\u0658\u065f\u0642\u0608\u060a\u0608\u061e\u061f\u0660", "\u0480\u0482\u0493\u04a4\u048b\u0486\u0494\u0494\u04db\u04d9\u04cf\u04ce\u04ab\u048d\u0486\u0491\u0486\u04c8\u048b\u0486\u0489\u0480\u04c8\u04a4\u048b\u0486\u0494\u0494\u04dc", "\u038a\u0383\u0391\u038a\u03a1\u038d\u0386\u0387\u03de\u03dc\u03ca\u03cb\u03ab", "\u045e\u044a\u044e\u045a\u0457\u0448\u0407\u0405\u0413\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0474\u0459\u0451\u045e\u0458\u044f\u0400\u0412\u0461", "\u0346\u0349\u034a\u034b\u0340\u0319\u031b\u030d\u030c\u0369\u034f\u0344\u0353\u0344\u030a\u0349\u0344\u034b\u0342\u030a\u036a\u0347\u034f\u0340\u0346\u0351\u031e", "\u00d3\u00c8\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009b\u0099\u008f\u008e\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009c", "\u028a\u028b\u0290\u028d\u0282\u029d\u02d8\u02da\u02cc\u02cd\u02b2", "\u043f\u043e\u0425\u0438\u0437\u0428\u0410\u043d\u043d\u046d\u046f\u0479\u0478\u0407", "\u03bd\u03ab\u03a3\u03be\u03f6\u03f4\u03e2\u03e3\u039c", "\u01dd\u01cb\u01c3\u01de\u0196\u0194\u0182\u01e0\u0183\u01fc", "\u04a2\u04b4\u04bc\u04a1\u04e5\u04e9\u04eb\u04fd\u049f\u04fc\u0483", "\u04de\u04c8\u04c0\u04dd\u0495\u0497\u0481\u04e3\u04e0\u0480\u04ff", "\u068f\u0680\u0687\u0688\u0685\u0680\u0693\u068c\u06d5\u06d7\u06c1\u06c0\u06bf"})
public final class Class5500 {
    public static double field10341;
    public static float field10342;
    public static float field10343;
    public static float field10344;

    static {
        ad\u200e = "BreakCrystal";
        field10342 = Float.intBitsToFloat(1061246356);
        field10341 = Double.longBitsToDouble(4603094828032754520L);
        field10344 = Float.intBitsToFloat(1044553764);
        aY\u200e = "Delay, in ticks, between placements";
        field10343 = Float.intBitsToFloat(1058943975);
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite f9HEsFYbrFv7wg(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5500.bJV45n2keggVOBoc(k, 663012330));
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
                v0 = 51257;
                ** GOTO lbl19
            }
            v0 = 51258;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 51256;
lbl19:
                // 3 sources

                switch (v0) {
                    case 51258: {
                        continue block7;
                    }
                    case 51257: {
                        try {
                            a = Integer.parseInt(Class5500.bJV45n2keggVOBoc(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class5500.bJV45n2keggVOBoc(r[f], l);
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
            throw new Exception("Can't find method in " + Class5500.bJV45n2keggVOBoc(k, 663012330) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String bJV45n2keggVOBoc(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

