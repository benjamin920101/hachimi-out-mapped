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

@HACHIMI_CLIENT(mv=100, d1={"\u93e6\u93e5\u93ea\u93e2\u93e0\u93e7\u93e7\u93e4", "\ubdbd\ubdbe\ubdbf\ubdba\ubdbd\ubdbc\ubdbf\ubdbd", "\u0007\u0000\n\u0006\u0000\u0002\u0002\u0004", "\ue0d3\ue0d7\ue0d3\ue0d4\ue0d0\ue0d2\ue0d5\ue0d0", "\ua472\ua476\ua47a\ua473\ua476\ua470\ua470", "\ud60f\ud605\ud606\ud603\ud606\ud603\ud60f", "\u979a\u979b\u9794\u979d\u9798\u979a\u9795\u9798", "\u9739\u973e\u973a\u973f\u973e\u973b\u9736\u973a", "\u3b3d\u3b38\u3b3a\u3b3f\u3b3e\u3b3e\u3b38\u3b3e", "\u602d\u6029\u6028\u6029\u602a\u6029\u6029\u602e", "\u513c\u5131\u513c\u513f\u513c\u513b\u513e\u513f", "\u620c\u6200\u6209\u620d\u620f\u6208\u620a\u620b", "\u383f\u383d\u3839\u3839\u383f\u3839\u383d\u383d", "\u5b98\u5b9f\u5b9c\u5b9c\u5b9c\u5b9c\u5b98", "\u2148\u214a\u2145\u2144\u214a\u2144\u214a\u214a", "\u71fb\u71fc\u71fc\u71f8\u71f0\u71fc\u71fb\u71fc"}, d2={"\u04d2\u04e2\u249e\u04ac\u04ae\u04b8\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04c3\u04e4\u04e2\u04f9\u04fe\u04f7\u04ab\u04b9\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04c3\u04e4\u04e2\u04f9\u04fe\u04f7\u04ab", "\u073e\u070f\u2772\u0740\u0742\u0754\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747\u0755\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747", "\u02b7\u02e8\u02e7\u02e2\u02e5\u02e2\u02ff\u02b5\u02b7\u02b5\u02a3\u02a2\u02dd", "\u0726\u0773\u0774\u0773\u076e\u0724\u0726\u0724\u0732\u0733\u074c", "\u017b\u0179\u0168\u015f\u0170\u017d\u016f\u016f\u0120\u0122\u0134\u0135\u0150\u0176\u017d\u016a\u017d\u0133\u0170\u017d\u0172\u017b\u0133\u015f\u0170\u017d\u016f\u016f\u0127", "\u073b\u0732\u0720\u073b\u0710\u073c\u0737\u0736\u076f\u076d\u077b\u077a\u071a", "\u04c6\u04d2\u04d6\u04c2\u04cf\u04d0\u049f\u049d\u048b\u04ef\u04c9\u04c2\u04d5\u04c2\u048c\u04cf\u04c2\u04cd\u04c4\u048c\u04ec\u04c1\u04c9\u04c6\u04c0\u04d7\u0498\u048a\u04f9", "\u0580\u058f\u058c\u058d\u0586\u05df\u05dd\u05cb\u05ca\u05af\u0589\u0582\u0595\u0582\u05cc\u058f\u0582\u058d\u0584\u05cc\u05ac\u0581\u0589\u0586\u0580\u0597\u05d8", "\u0168\u0173\u014f\u0168\u016e\u0175\u0172\u017b\u0120\u0122\u0134\u0135\u0150\u0176\u017d\u016a\u017d\u0133\u0170\u017d\u0172\u017b\u0133\u014f\u0168\u016e\u0175\u0172\u017b\u0127", "\u001c\u001d\u0006\u001b\u0014\u000bNLZ[$", "\u067c\u067d\u0666\u067b\u0674\u066b\u0653\u067e\u067e\u062e\u062c\u063a\u063b\u0644", "\u00c4\u00d2\u00da\u00c7\u008f\u008d\u009b\u009a\u00e5", "\u04f8\u04ee\u04e6\u04fb\u04b3\u04b1\u04a7\u04c5\u04a6\u04d9", "\u009e\u0088\u0080\u009d\u00d9\u00d5\u00d7\u00c1\u00a3\u00c0\u00bf", "\u0283\u0295\u029d\u0280\u02c8\u02ca\u02dc\u02be\u02bd\u02dd\u02a2", "\u00c0\u00cf\u00c8\u00c7\u00ca\u00cf\u00dc\u00c3\u009a\u0098\u008e\u008f\u00f0"})
public final class Class1318 {
    public static float field5107 = Float.intBitsToFloat(1064842303);
    public static float field5108;
    public static double field5109;

    /*
     * WARNING - void declaration
     */
    private static CallSite wAb42BBcEqvIIw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1318.j34NiqeGeO2svibF(k2, 1365215063));
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
                int a2 = Integer.parseInt(Class1318.j34NiqeGeO2svibF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1318.j34NiqeGeO2svibF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1318.j34NiqeGeO2svibF(k2, 1365215063) + " " + l2 + " " + m2);
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
        r\u200e = "Displays a list of the item's enchantments";
        field5109 = Double.longBitsToDouble(4603884856100645788L);
        ag\u200e = "Trapped";
        field5108 = Float.intBitsToFloat(1059463287);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String j34NiqeGeO2svibF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block0: while (true) {
            int n2 = d2 >= a2.length() ? 38048 : 38047;
            while (true) {
                int n3;
                if ((n3 = n2) == 38047) {
                    c2.append((char)(a2.charAt(d2) ^ b2));
                    ++d2;
                    continue block0;
                }
                if (n3 != 38048) {
                    return c2.toString();
                }
                n2 = 38046;
            }
            break;
        }
    }
}

