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

@HACHIMI_CLIENT(mv=100, d1={"\u6e34\u6e31\u6e33\u6e37\u6e35\u6e39\u6e33", "\ud910\ud916\ud915\ud912\ud912\ud912\ud912\ud915", "\u25b6\u25ba\u25bb\u25b3\u25b7\u25bb\u25b0\u25b2", "\u72c4\u72c6\u72c5\u72c5\u72ce\u72c5\u72c0\u72c1", "\u3522\u3526\u3522\u3522\u3523\u3521\u3521\u3526", "\u0f19\u0f1b\u0f1d\u0f1e\u0f1d\u0f1d\u0f1c\u0f19", "\u70f8\u70ff\u70fc\u70f9\u70fa\u70f9\u70f6\u70f9", "\u6954\u6950\u6954\u6957\u695e\u6951\u6951\u6952", "\u7be1\u7bef\u7bef\u7be7\u7be0\u7be2\u7bef", "\uabf7\uabf2\uabf7\uabf5\uabf1\uabfe\uabf3", "\u1809\u180b\u180e\u180b\u1806\u180f\u1806\u1809", "\ub043\ub04e\ub045\ub04e\ub04f\ub04f\ub046\ub043", "\uad3b\uad30\uad31\uad3b\uad3b\uad3e\uad30\uad3e", "\u245b\u245d\u2458\u2458\u245b\u2458\u2453\u245f", "\ubd23\ubd21\ubd26\ubd27\ubd23\ubd21\ubd26\ubd27", "\u467d\u4670\u4679\u467a\u467a\u467d\u4679\u467d", "\ud7be\ud7bf\ud7b9\ud7be\ud7bc\ud7ba\ud7bf\ud7b4"}, d2={"\u0131\u013a\u0128\u215c\u016e\u016c\u017a\u011e\u0138\u0133\u0124\u0133\u017d\u013e\u0133\u013c\u0135\u017d\u0101\u0126\u0120\u013b\u013c\u0135\u0169\u017b\u011e\u0138\u0133\u0124\u0133\u017d\u013e\u0133\u013c\u0135\u017d\u0101\u0126\u0120\u013b\u013c\u0135\u0169", "\u0590\u059b\u05b2\u25fd\u05cf\u05cd\u05db\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05a0\u0587\u0581\u059a\u059d\u0594\u05c8\u05da\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05a0\u0587\u0581\u059a\u059d\u0594\u05c8", "\u0569\u0562\u0548\u2504\u0536\u0534\u0522\u0546\u0560\u056b\u057c\u056b\u0525\u0566\u056b\u0564\u056d\u0525\u0559\u057e\u0578\u0563\u0564\u056d\u0531\u0523\u0546\u0560\u056b\u057c\u056b\u0525\u0566\u056b\u0564\u056d\u0525\u0559\u057e\u0578\u0563\u0564\u056d\u0531", "\u00cb\u0094\u009b\u009e\u0099\u009e\u0083\u00c9\u00cb\u00c9\u00df\u00de\u00a1", "\u0365\u0330\u0337\u0330\u032d\u0367\u0365\u0367\u0371\u0370\u030f", "\u03b1\u03b3\u03a2\u0395\u03ba\u03b7\u03a5\u03a5\u03ea\u03e8\u03fe\u03ff\u039a\u03bc\u03b7\u03a0\u03b7\u03f9\u03ba\u03b7\u03b8\u03b1\u03f9\u0395\u03ba\u03b7\u03a5\u03a5\u03ed", "\u008c\u0085\u0097\u008c\u00a7\u008b\u0080\u0081\u00d8\u00da\u00cc\u00cd\u00ad", "\u0265\u0271\u0275\u0261\u026c\u0273\u023c\u023e\u0228\u024c\u026a\u0261\u0276\u0261\u022f\u026c\u0261\u026e\u0267\u022f\u024f\u0262\u026a\u0265\u0263\u0274\u023b\u0229\u025a", "\u00bf\u00b0\u00b3\u00b2\u00b9\u00e0\u00e2\u00f4\u00f5\u0090\u00b6\u00bd\u00aa\u00bd\u00f3\u00b0\u00bd\u00b2\u00bb\u00f3\u0093\u00be\u00b6\u00b9\u00bf\u00a8\u00e7", "\u0597\u058c\u05b0\u0597\u0591\u058a\u058d\u0584\u05df\u05dd\u05cb\u05ca\u05af\u0589\u0582\u0595\u0582\u05cc\u058f\u0582\u058d\u0584\u05cc\u05b0\u0597\u0591\u058a\u058d\u0584\u05d8", "\u0212\u0213\u0208\u0215\u021a\u0205\u0240\u0242\u0254\u0255\u022a", "\u06a3\u06a2\u06b9\u06a4\u06ab\u06b4\u068c\u06a1\u06a1\u06f1\u06f3\u06e5\u06e4\u069b", "\u0135\u0123\u012b\u0136\u017e\u017c\u016a\u016b\u0114", "\u0505\u0513\u051b\u0506\u054e\u054c\u055a\u0538\u055b\u0524", "\u076a\u077c\u0774\u0769\u072d\u0721\u0723\u0735\u0757\u0734\u074b", "\u07d9\u07cf\u07c7\u07da\u0792\u0790\u0786\u07e4\u07e7\u0787\u07f8", "\u0292\u029d\u029a\u0295\u0298\u029d\u028e\u0291\u02c8\u02ca\u02dc\u02dd\u02a2"})
public final class Class5514 {
    public static int field10408 = -1638972429;
    public static int field10409 = 1885260660;
    public static double field10410;
    public static int field10411 = 830299501;
    public static float field10412;
    public static double field10413 = 0.009543706228442472;

    /*
     * WARNING - void declaration
     */
    private static CallSite YdDnqYvvubHsTb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5514.i2tn48uS9LdBO1gv(k2, -1111341076));
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
                int a2 = Integer.parseInt(Class5514.i2tn48uS9LdBO1gv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5514.i2tn48uS9LdBO1gv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5514.i2tn48uS9LdBO1gv(k2, -1111341076) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String i2tn48uS9LdBO1gv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 55347 : 55346;
            block5: while (true) {
                switch (n2) {
                    case 55347: {
                        n2 = 55345;
                        continue block5;
                    }
                    case 55346: {
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

    static {
        l\u200e = "Chests \u00a7f%d";
        y\u200e = "EntitySpeed";
        field10410 = Double.longBitsToDouble(4600563447348412574L);
        aj\u200e = "%s/%s";
        field10412 = Float.intBitsToFloat(1052564074);
    }
}

