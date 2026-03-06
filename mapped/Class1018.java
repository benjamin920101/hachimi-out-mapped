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
@HACHIMI_CLIENT(mv=100, d1={"\u7584\u7583\u7586\u7584\u758b\u7586\u7584", "\ud2e5\ud2e3\ud2ef\ud2ef\ud2ee\ud2e5\ud2e3\ud2e3", "\u153c\u1531\u1538\u1530\u1538\u153b\u153d\u153a", "\u9c4a\u9c4e\u9c4c\u9c4f\u9c49\u9c40\u9c4f\u9c4e", "\u4d7c\u4d7f\u4d79\u4d7c\u4d7d\u4d7f\u4d77\u4d76", "\uc3f3\uc3f5\uc3f1\uc3f7\uc3f6\uc3ff\uc3f1\uc3f3", "\u74b5\u74b2\u74b1\u74b9\u74b8\u74b4\u74b2\u74b7", "\ubb4c\ubb4f\ubb49\ubb42\ubb48\ubb4a\ubb48\ubb49", "\ua3c6\ua3c4\ua3ca\ua3c0\ua3c2\ua3c0\ua3c4\ua3c6", "\uafde\uafd0\uafd8\uafdd\uafd1\uafd9\uafda\uafde", "\ucdfc\ucdfb\ucdfc\ucdf1\ucdf8\ucdf0\ucdfc\ucdfc", "\u100a\u1009\u100d\u100e\u100b\u100f\u1000\u100e", "\u355d\u355e\u3558\u355a\u355d\u355c\u3554\u3555", "\u8efd\u8ef7\u8efe\u8efa\u8ef8\u8efd\u8ef7\u8efd"}, d2={"\u0448\u0417\u0418\u041d\u041a\u041d\u0400\u044a\u0448\u044a\u045c\u045d\u0422", "\u0225\u0270\u0277\u0270\u026d\u0227\u0225\u0227\u0231\u0230\u024f", "\u0260\u0262\u0273\u0244\u026b\u0266\u0274\u0274\u023b\u0239\u022f\u022e\u024b\u026d\u0266\u0271\u0266\u0228\u026b\u0266\u0269\u0260\u0228\u0244\u026b\u0266\u0274\u0274\u023c", "\u04a6\u04af\u04bd\u04a6\u048d\u04a1\u04aa\u04ab\u04f2\u04f0\u04e6\u04e7\u0487", "\u0097\u0083\u0087\u0093\u009e\u0081\u00ce\u00cc\u00da\u00be\u0098\u0093\u0084\u0093\u00dd\u009e\u0093\u009c\u0095\u00dd\u00bd\u0090\u0098\u0097\u0091\u0086\u00c9\u00db\u00a8", "\u0648\u0647\u0644\u0645\u064e\u0617\u0615\u0603\u0602\u0667\u0641\u064a\u065d\u064a\u0604\u0647\u064a\u0645\u064c\u0604\u0664\u0649\u0641\u064e\u0648\u065f\u0610", "(3\u000f(.52;`btu\u00106=*=s0=2;s\u000f(.52;g", "\u0010\u0011\n\u0017\u0018\u0007B@VW(", "\u0596\u0597\u058c\u0591\u059e\u0581\u05b9\u0594\u0594\u05c4\u05c6\u05d0\u05d1\u05ae", "\u07a5\u07b3\u07bb\u07a6\u07ee\u07ec\u07fa\u07fb\u0784", "\u001c\n\u0002\u001fWUC!B=", "\u0133\u0125\u012d\u0130\u0174\u0178\u017a\u016c\u010e\u016d\u0112", "DRZG\u000f\r\u001byz\u001ae", "\u073b\u0734\u0733\u073c\u0731\u0734\u0727\u0738\u0761\u0763\u0775\u0774\u070b"})
public final class Class1018 {
    public static float field4207;
    public static float field4208;
    public static int field4209 = 797793356;
    public static double field4210;
    public static float field4211;
    public static float field4212;

    static {
        field4212 = Float.intBitsToFloat(1132396544);
        field4207 = Float.intBitsToFloat(1040417140);
        field4211 = Float.intBitsToFloat(1043210880);
        field4208 = Float.intBitsToFloat(1036934400);
        field4210 = Double.longBitsToDouble(4604748398331489508L);
    }

    private static String ZlRXS61HdQr1NhGV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 8aVqTERv8g4Ont(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        block9: {
            block7: {
                block8: {
                    o = Class.forName(Class1018.ZlRXS61HdQr1NhGV(k, -2142267336));
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
                            a = Integer.parseInt(Class1018.ZlRXS61HdQr1NhGV(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            continue;
                        }
                        if (e % 59557 != m.intValue()) continue;
                        c = Class1018.ZlRXS61HdQr1NhGV(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break;
                    }
                    if (!s.isEmpty()) break block8;
                    v0 = 28975;
                    ** GOTO lbl29
                }
                v0 = 28976;
                if (true) ** GOTO lbl29
                do {
                    v0 = var17_20 = 28974;
lbl29:
                    // 3 sources

                    if (var17_20 == 28975) break block7;
                } while (var17_20 == 28976);
                break block9;
            }
            throw new Exception("Can't find method in " + Class1018.ZlRXS61HdQr1NhGV(k, -2142267336) + " " + l + " " + m);
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

