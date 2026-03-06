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

@HACHIMI_CLIENT(mv=100, d1={"\u8c45\u8c42\u8c44\u8c44\u8c46\u8c41\u8c41\u8c42", "\u70d3\u70d5\u70dd\u70d6\u70d3\u70d0\u70dc\u70dd", "\u2f3f\u2f36\u2f3a\u2f3f\u2f3b\u2f3f\u2f3b\u2f37", "\ubdfe\ubdfe\ubdf9\ubdff\ubdfd\ubdf9\ubdfb\ubdf6", "\u3d16\u3d17\u3d17\u3d15\u3d14\u3d15\u3d17\u3d17", "\u815c\u8150\u815a\u815c\u8158\u8150\u8159\u8158", "\u8ed0\u8ed3\u8ed6\u8ed1\u8eda\u8ed4\u8ed5\u8ed0", "\u5625\u562f\u5620\u5624\u5621\u5622\u5622\u5625", "\u5019\u501d\u501d\u5018\u501c\u501b\u5019", "\ua223\ua220\ua226\ua226\ua228\ua226\ua228\ua225", "\ue4ae\ue4ab\ue4aa\ue4a5\ue4ae\ue4a5\ue4ab\ue4ae", "\ud938\ud93b\ud93b\ud93e\ud936\ud939\ud93e\ud937", "\ud830\ud837\ud836\ud838\ud831\ud839\ud830\ud835", "\ub181\ub181\ub182\ub18b\ub18b\ub184\ub180\ub187"}, d2={"\u040b\u0454\u045b\u045e\u0459\u045e\u0443\u0409\u040b\u0409\u041f\u041e\u0461", "\u01d4\u0181\u0186\u0181\u019c\u01d6\u01d4\u01d6\u01c0\u01c1\u01be", "\u07e6\u07e4\u07f5\u07c2\u07ed\u07e0\u07f2\u07f2\u07bd\u07bf\u07a9\u07a8\u07cd\u07eb\u07e0\u07f7\u07e0\u07ae\u07ed\u07e0\u07ef\u07e6\u07ae\u07c2\u07ed\u07e0\u07f2\u07f2\u07ba", "\u017d\u0174\u0166\u017d\u0156\u017a\u0171\u0170\u0129\u012b\u013d\u013c\u015c", "\u00a5\u00b1\u00b5\u00a1\u00ac\u00b3\u00fc\u00fe\u00e8\u008c\u00aa\u00a1\u00b6\u00a1\u00ef\u00ac\u00a1\u00ae\u00a7\u00ef\u008f\u00a2\u00aa\u00a5\u00a3\u00b4\u00fb\u00e9\u009a", "\u01ea\u01e5\u01e6\u01e7\u01ec\u01b5\u01b7\u01a1\u01a0\u01c5\u01e3\u01e8\u01ff\u01e8\u01a6\u01e5\u01e8\u01e7\u01ee\u01a6\u01c6\u01eb\u01e3\u01ec\u01ea\u01fd\u01b2", "\u0751\u074a\u0776\u0751\u0757\u074c\u074b\u0742\u0719\u071b\u070d\u070c\u0769\u074f\u0744\u0753\u0744\u070a\u0749\u0744\u074b\u0742\u070a\u0776\u0751\u0757\u074c\u074b\u0742\u071e", "\u025d\u025c\u0247\u025a\u0255\u024a\u020f\u020d\u021b\u021a\u0265", "\u05f5\u05f4\u05ef\u05f2\u05fd\u05e2\u05da\u05f7\u05f7\u05a7\u05a5\u05b3\u05b2\u05cd", "\u04bc\u04aa\u04a2\u04bf\u04f7\u04f5\u04e3\u04e2\u049d", "\u03bd\u03ab\u03a3\u03be\u03f6\u03f4\u03e2\u0380\u03e3\u039c", "\u0303\u0315\u031d\u0300\u0344\u0348\u034a\u035c\u033e\u035d\u0322", "\u0224\u0232\u023a\u0227\u026f\u026d\u027b\u0219\u021a\u027a\u0205", "\u02eb\u02e4\u02e3\u02ec\u02e1\u02e4\u02f7\u02e8\u02b1\u02b3\u02a5\u02a4\u02db"})
public final class Class5630 {
    public static double field10768;
    public static float field10769;
    public static int field10770 = 103799;
    public static double field10771;
    public static double field10772 = 0.12567014024962997;
    public static double field10773;
    public static int field10774 = 204118099;

    static {
        field10769 = Float.intBitsToFloat(1061711303);
        field10768 = Double.longBitsToDouble(4569063951553953530L);
        field10771 = Double.longBitsToDouble(4605407364661845858L);
        field10773 = Double.longBitsToDouble(4597778902778067812L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String aIbuGjdZ7BBtFpBa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 57882 : 57881;
            block5: while (true) {
                switch (n2) {
                    case 57882: {
                        n2 = 57880;
                        continue block5;
                    }
                    case 57881: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite NB1RECWfNAFlj5(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5630.aIbuGjdZ7BBtFpBa(k2, -595725167));
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
                int a2 = Integer.parseInt(Class5630.aIbuGjdZ7BBtFpBa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5630.aIbuGjdZ7BBtFpBa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5630.aIbuGjdZ7BBtFpBa(k2, -595725167) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

