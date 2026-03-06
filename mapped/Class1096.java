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

@HACHIMI_CLIENT(mv=100, d1={"\u1ac3\u1ac8\u1ac8\u1ac9\u1ac7\u1ac6\u1ac1\u1ac7", "\ud444\ud441\ud449\ud448\ud442\ud445\ud441\ud442", "\u9b2e\u9b22\u9b29\u9b22\u9b23\u9b22\u9b29\u9b29", "\ud426\ud424\ud425\ud427\ud426\ud42c\ud426\ud426", "\u6ffd\u6ffa\u6ff9\u6ffb\u6ffe\u6ffd\u6ffb\u6ffd", "\u8ac5\u8aca\u8ace\u8acd\u8ac4\u8acd\u8ace", "\u332f\u3329\u332c\u332f\u332e\u332a\u332c\u332c", "\u6ed7\u6ed5\u6ed5\u6ed3\u6ed2\u6ed2\u6edd\u6edd", "\ud4e0\ud4e3\ud4e1\ud4e0\ud4e1\ud4ec\ud4e3\ud4e1", "\uc095\uc099\uc099\uc096\uc093\uc096\uc095\uc094", "\u0f31\u0f39\u0f35\u0f39\u0f38\u0f30\u0f39\u0f33", "\u7e95\u7e92\u7e95\u7e93\u7e96\u7e97\u7e92\u7e93", "\u5723\u5724\u5722\u5722\u5725\u5721\u5720\u5725", "\u2d1e\u2d1d\u2d1a\u2d19\u2d1f\u2d14\u2d1a\u2d1a", "\u3898\u389d\u389c\u3899\u389b\u389b\u389c", "\u5749\u574f\u5746\u574b\u5746\u574d\u574e\u574f"}, d2={"\u06c7\u06eb\u06c8\u26ae\u069c\u069e\u0688\u06ec\u06ca\u06c1\u06d6\u06c1\u068f\u06cc\u06c1\u06ce\u06c7\u068f\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069b\u0689\u06ec\u06ca\u06c1\u06d6\u06c1\u068f\u06cc\u06c1\u06ce\u06c7\u068f\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069b", "\u038c\u03a0\u0382\u23e5\u03d7\u03d5\u03c3\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03b8\u039f\u0399\u0382\u0385\u038c\u03d0\u03c2\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03b8\u039f\u0399\u0382\u0385\u038c\u03d0", "\u04f5\u04aa\u04a5\u04a0\u04a7\u04a0\u04bd\u04f7\u04f5\u04f7\u04e1\u04e0\u049f", "\u07f9\u07ac\u07ab\u07ac\u07b1\u07fb\u07f9\u07fb\u07ed\u07ec\u0793", "\u0143\u0141\u0150\u0167\u0148\u0145\u0157\u0157\u0118\u011a\u010c\u010d\u0168\u014e\u0145\u0152\u0145\u010b\u0148\u0145\u014a\u0143\u010b\u0167\u0148\u0145\u0157\u0157\u011f", "CJXChDON\u0017\u0015\u0003\u0002b", "\u00c1\u00d5\u00d1\u00c5\u00c8\u00d7\u0098\u009a\u008c\u00e8\u00ce\u00c5\u00d2\u00c5\u008b\u00c8\u00c5\u00ca\u00c3\u008b\u00eb\u00c6\u00ce\u00c1\u00c7\u00d0\u009f\u008d\u00fe", "\u07f8\u07f7\u07f4\u07f5\u07fe\u07a7\u07a5\u07b3\u07b2\u07d7\u07f1\u07fa\u07ed\u07fa\u07b4\u07f7\u07fa\u07f5\u07fc\u07b4\u07d4\u07f9\u07f1\u07fe\u07f8\u07ef\u07a0", "\u01b9\u01a2\u019e\u01b9\u01bf\u01a4\u01a3\u01aa\u01f1\u01f3\u01e5\u01e4\u0181\u01a7\u01ac\u01bb\u01ac\u01e2\u01a1\u01ac\u01a3\u01aa\u01e2\u019e\u01b9\u01bf\u01a4\u01a3\u01aa\u01f6", "\u07cf\u07ce\u07d5\u07c8\u07c7\u07d8\u079d\u079f\u0789\u0788\u07f7", "\u062b\u062a\u0631\u062c\u0623\u063c\u0604\u0629\u0629\u0679\u067b\u066d\u066c\u0613", "\u048c\u049a\u0492\u048f\u04c7\u04c5\u04d3\u04d2\u04ad", "K]UH\u0000\u0002\u0014v\u0015j", "\u0772\u0764\u076c\u0771\u0735\u0739\u073b\u072d\u074f\u072c\u0753", "\u0473\u0465\u046d\u0470\u0438\u043a\u042c\u044e\u044d\u042d\u0452", "\u04e0\u04ef\u04e8\u04e7\u04ea\u04ef\u04fc\u04e3\u04ba\u04b8\u04ae\u04af\u04d0"})
public final class Class1096 {
    public static int field4441 = 1;
    public static float field4442 = 0.30382276f;
    public static float field4443;

    private static String PG3m4nr1lJPWsqqN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite OA2OOMc1bLjmYe(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1096.PG3m4nr1lJPWsqqN(k2, 1264448374));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1096.PG3m4nr1lJPWsqqN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1096.PG3m4nr1lJPWsqqN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1096.PG3m4nr1lJPWsqqN(k2, 1264448374) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        V\u200e = "add";
        bD\u200e = "LongJump";
        field4443 = Float.intBitsToFloat(1065304295);
    }
}

