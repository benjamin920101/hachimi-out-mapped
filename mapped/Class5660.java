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
@HACHIMI_CLIENT(mv=100, d1={"\u5adc\u5ade\u5adb\u5add\u5ad0\u5ade\u5ad9\u5ad0", "\uccf6\uccf0\uccf6\uccf0\uccf7\uccf5\uccf3\uccf6", "\ua2ca\ua2c2\ua2c8\ua2c8\ua2c3\ua2ca\ua2c2\ua2ca", "\u351b\u351b\u3516\u3519\u3516\u351e\u3516\u351e", "\ud9da\ud9dc\ud9d9\ud9da\ud9d8\ud9df\ud9d6\ud9de", "\ubfbb\ubfb8\ubfbd\ubfbb\ubfb0\ubfb0\ubfb0\ubfbf", "\ud0bf\ud0b4\ud0bf\ud0b4\ud0b8\ud0b5\ud0ba\ud0bb", "\ucd15\ucd10\ucd14\ucd13\ucd1f\ucd15\ucd1e", "\u4d70\u4d70\u4d72\u4d78\u4d74\u4d70\u4d77\u4d75", "\ue3ae\ue3a5\ue3a4\ue3a9\ue3a5\ue3a4\ue3a4\ue3ad", "\u7764\u7763\u7766\u7768\u7769\u7761\u7765\u7766", "\u0ec7\u0ec7\u0ec3\u0ec8\u0ec1\u0ec6\u0ec7\u0ec7", "\ue000\ue004\ue006\ue004\ue00b\ue000\ue003\ue006", "\ude34\ude35\ude36\ude32\ude31\ude30\ude34\ude38"}, d2={"\u038d\u03d2\u03dd\u03d8\u03df\u03d8\u03c5\u038f\u038d\u038f\u0399\u0398\u03e7", "\u0274\u0221\u0226\u0221\u023c\u0276\u0274\u0276\u0260\u0261\u021e", "\u01af\u01ad\u01bc\u018b\u01a4\u01a9\u01bb\u01bb\u01f4\u01f6\u01e0\u01e1\u0184\u01a2\u01a9\u01be\u01a9\u01e7\u01a4\u01a9\u01a6\u01af\u01e7\u018b\u01a4\u01a9\u01bb\u01bb\u01f3", "\u05ea\u05e3\u05f1\u05ea\u05c1\u05ed\u05e6\u05e7\u05be\u05bc\u05aa\u05ab\u05cb", "\u0129\u013d\u0139\u012d\u0120\u013f\u0170\u0172\u0164\u0100\u0126\u012d\u013a\u012d\u0163\u0120\u012d\u0122\u012b\u0163\u0103\u012e\u0126\u0129\u012f\u0138\u0177\u0165\u0116", "\u0478\u0477\u0474\u0475\u047e\u0427\u0425\u0433\u0432\u0457\u0471\u047a\u046d\u047a\u0434\u0477\u047a\u0475\u047c\u0434\u0454\u0479\u0471\u047e\u0478\u046f\u0420", "\u0189\u0192\u01ae\u0189\u018f\u0194\u0193\u019a\u01c1\u01c3\u01d5\u01d4\u01b1\u0197\u019c\u018b\u019c\u01d2\u0191\u019c\u0193\u019a\u01d2\u01ae\u0189\u018f\u0194\u0193\u019a\u01c6", "\u054b\u054a\u0551\u054c\u0543\u055c\u0519\u051b\u050d\u050c\u0573", "YXC^QNv[[\u000b\t\u001f\u001ea", "\u031a\u030c\u0304\u0319\u0351\u0353\u0345\u0344\u033b", "\u02f4\u02e2\u02ea\u02f7\u02bf\u02bd\u02ab\u02c9\u02aa\u02d5", "\u03f8\u03ee\u03e6\u03fb\u03bf\u03b3\u03b1\u03a7\u03c5\u03a6\u03d9", "\u0744\u0752\u075a\u0747\u070f\u070d\u071b\u0779\u077a\u071a\u0765", "\u0373\u037c\u037b\u0374\u0379\u037c\u036f\u0370\u0329\u032b\u033d\u033c\u0343"})
public final class Class5660 {
    public static int field10853 = -356259378;
    public static float field10854 = 0.09781802f;
    public static float field10855 = Float.intBitsToFloat(1050866072);
    public static double field10856 = Double.longBitsToDouble(4605430007332575923L);
    public static double field10857 = Double.longBitsToDouble(0x4008000000000000L);

    private static String 0OQt84iH0KnnQcJL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite XPrVBYmmGhSHYG(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        o = Class.forName(Class5660.0OQt84iH0KnnQcJL(k, -1091243839));
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
                                a = Integer.parseInt(Class5660.0OQt84iH0KnnQcJL(q[f], m));
                            }
                            catch (NumberFormatException b) {
                                continue;
                            }
                            if (e % 59557 != m.intValue()) continue;
                            c = Class5660.0OQt84iH0KnnQcJL(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break;
                        }
                        if (s.isEmpty()) {
                            throw new Exception("Can't find method in " + Class5660.0OQt84iH0KnnQcJL(k, -1091243839) + " " + l + " " + m);
                        }
                        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
                        if (n != 1) break block7;
                        v0 = 39416;
                        ** GOTO lbl32
                    }
                    v0 = 39417;
                    if (true) ** GOTO lbl32
                    do {
                        v0 = var17_20 = 39415;
lbl32:
                        // 3 sources

                        if (var17_20 == 39416) break block6;
                    } while (var17_20 == 39417);
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

