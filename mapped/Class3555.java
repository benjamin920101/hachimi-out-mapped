/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ua8b9\ua8b9\ua8b0\ua8b1\ua8bc\ua8b1\ua8b0\ua8bf", "\u35fd\u35f7\u35f2\u35f0\u35f6\u35f5\u35f7", "\u710c\u7104\u710e\u7109\u7105\u710c\u710e", "\udf0b\udf0c\udf04\udf08\udf04\udf0b\udf08", "\u3ea7\u3eaa\u3ea0\u3ea4\u3ea0\u3ea5\u3ea4\u3ea6", "\u2899\u2892\u289a\u289c\u289d\u2899\u2899\u2899", "\uac5d\uac5a\uac5e\uac5e\uac58\uac59\uac5b\uac5f", "\ubab0\ubab7\ubab7\ubab1\ubabc\ubab1\ubab6", "\u8f82\u8f83\u8f84\u8f83\u8f85\u8f83\u8f86", "\u2f48\u2f47\u2f4a\u2f4b\u2f4b\u2f48\u2f4c\u2f4e", "\u0361\u0362\u0362\u0365\u0365\u0363\u0361\u0367", "\u8066\u8063\u8060\u8064\u8064\u8061\u8065\u8064", "\u8d15\u8d15\u8d10\u8d1b\u8d11\u8d15\u8d11\u8d1a", "\u1fd2\u1fd1\u1fd0\u1fd0\u1fd5\u1fd7\u1fd5\u1fd1", "\u0620\u062c\u0620\u0629\u062b\u062a\u0621", "\ub496\ub497\ub495\ub498\ub493\ub498\ub497\ub498", "\u9e25\u9e22\u9e22\u9e20\u9e22\u9e22\u9e27\u9e20"}, d2={"G^d\u2038\n\b\u001ez\\W@W\u0019ZWXQ\u0019eBD_XQ\r\u001fz\\W@W\u0019ZWXQ\u0019eBD_XQ\r", "\u0401\u0418\u0423\u247e\u044c\u044e\u0458\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u0423\u0404\u0402\u0419\u041e\u0417\u044b\u0459\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u0423\u0404\u0402\u0419\u041e\u0417\u044b", "\u039e\u0387\u03bb\u23e1\u03d3\u03d1\u03c7\u03a3\u0385\u038e\u0399\u038e\u03c0\u0383\u038e\u0381\u0388\u03c0\u03bc\u039b\u039d\u0386\u0381\u0388\u03d4\u03c6\u03a3\u0385\u038e\u0399\u038e\u03c0\u0383\u038e\u0381\u0388\u03c0\u03bc\u039b\u039d\u0386\u0381\u0388\u03d4", "\u0474\u042b\u0424\u0421\u0426\u0421\u043c\u0476\u0474\u0476\u0460\u0461\u041e", "\u0548\u051d\u051a\u051d\u0500\u054a\u0548\u054a\u055c\u055d\u0522", "\u026f\u026d\u027c\u024b\u0264\u0269\u027b\u027b\u0234\u0236\u0220\u0221\u0244\u0262\u0269\u027e\u0269\u0227\u0264\u0269\u0266\u026f\u0227\u024b\u0264\u0269\u027b\u027b\u0233", "\u046e\u0467\u0475\u046e\u0445\u0469\u0462\u0463\u043a\u0438\u042e\u042f\u044f", "\u068b\u069f\u069b\u068f\u0682\u069d\u06d2\u06d0\u06c6\u06a2\u0684\u068f\u0698\u068f\u06c1\u0682\u068f\u0680\u0689\u06c1\u06a1\u068c\u0684\u068b\u068d\u069a\u06d5\u06c7\u06b4", "\u07be\u07b1\u07b2\u07b3\u07b8\u07e1\u07e3\u07f5\u07f4\u0791\u07b7\u07bc\u07ab\u07bc\u07f2\u07b1\u07bc\u07b3\u07ba\u07f2\u0792\u07bf\u07b7\u07b8\u07be\u07a9\u07e6", "\u0305\u031e\u0322\u0305\u0303\u0318\u031f\u0316\u034d\u034f\u0359\u0358\u033d\u031b\u0310\u0307\u0310\u035e\u031d\u0310\u031f\u0316\u035e\u0322\u0305\u0303\u0318\u031f\u0316\u034a", "\u012d\u012c\u0137\u012a\u0125\u013a\u017f\u017d\u016b\u016a\u0115", "\u0413\u0412\u0409\u0414\u041b\u0404\u043c\u0411\u0411\u0441\u0443\u0455\u0454\u042b", "\u0240\u0256\u025e\u0243\u020b\u0209\u021f\u021e\u0261", "\u00e3\u00f5\u00fd\u00e0\u00a8\u00aa\u00bc\u00de\u00bd\u00c2", "\u02a9\u02bf\u02b7\u02aa\u02ee\u02e2\u02e0\u02f6\u0294\u02f7\u0288", "\u045d\u044b\u0443\u045e\u0416\u0414\u0402\u0460\u0463\u0403\u047c", "p\u007fxwz\u007fls*(>?@"})
public final class Class3555 {
    public static float field7889;
    public static int field7890 = -798423538;
    public static float field7891;

    private static String D7EabgEllWcriIQN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite D10XbMwJAMZuWw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class3555.D7EabgEllWcriIQN(k2, 567240828));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class3555.D7EabgEllWcriIQN(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class3555.D7EabgEllWcriIQN(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (!s2.isEmpty()) break block7;
                    n4 = 1791;
                    n3 = n4;
                    if (n3 == 1791) throw new Exception("Can't find method in " + Class3555.D7EabgEllWcriIQN(k2, 567240828) + " " + l2 + " " + m2);
                    if (n3 == 1792) break block8;
                    break block9;
                }
                n4 = 1792;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 1791) throw new Exception("Can't find method in " + Class3555.D7EabgEllWcriIQN(k2, 567240828) + " " + l2 + " " + m2);
                if (n3 != 1792) break block9;
            }
            do {
                n4 = 1790;
                n3 = n4;
                if (n3 == 1791) throw new Exception("Can't find method in " + Class3555.D7EabgEllWcriIQN(k2, 567240828) + " " + l2 + " " + m2);
            } while (n3 == 1792);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        U\u200e = "Length";
        at\u200e = "CrystalModel";
        aT\u200e = "Removes acceleration while in the air";
        field7891 = Float.intBitsToFloat(1063026195);
        field7889 = Float.intBitsToFloat(1045416624);
    }
}

