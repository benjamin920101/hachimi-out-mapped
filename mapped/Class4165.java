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

@HACHIMI_CLIENT(mv=100, d1={"\u8a45\u8a46\u8a46\u8a43\u8a44\u8a47\u8a41\u8a42", "\u3ba8\u3baf\u3baa\u3ba2\u3ba2\u3bad\u3baf\u3baf", "\ua447\ua443\ua44d\ua446\ua444\ua447\ua441\ua446", "\u99cc\u99c3\u99cd\u99c8\u99cb\u99cb\u99ca\u99c2", "\ua484\ua483\ua483\ua480\ua48d\ua480\ua483\ua48d", "\udaf2\udaf7\udaf5\udaf7\udaf1\udaf3\udaf3\udaf4", "\u2621\u2620\u2625\u2625\u2621\u2623\u2623\u2623", "\u2f2f\u2f2f\u2f29\u2f2b\u2f28\u2f28\u2f2e\u2f28", "\udf75\udf79\udf74\udf79\udf75\udf70\udf73\udf78", "\ua425\ua427\ua422\ua42c\ua424\ua421\ua421\ua423", "\u48c5\u48c6\u48c5\u48c5\u48c5\u48c7\u48cf\u48c7", "\ud2c6\ud2c2\ud2cf\ud2c4\ud2c1\ud2c1\ud2c6\ud2c5", "\u67a0\u67a5\u67a2\u67a3\u67a1\u67a0\u67a8\u67a2", "\ue45b\ue453\ue45d\ue45d\ue45b\ue452\ue45e\ue45b", "\u154e\u154c\u154c\u154c\u154e\u1549\u154f\u1548", "\ube84\ube81\ube85\ube88\ube82\ube84\ube88\ube87", "\ud9bb\ud9b6\ud9b2\ud9b4\ud9b3\ud9b1\ud9b3"}, d2={"\u06a3\u0686\u0685\u26c7\u06f5\u06f7\u06e1\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2\u06e0\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2", "cFD\u200757!Ech\u007fh&ehgn&Z}{`gn2 Ech\u007fh&ehgn&Z}{`gn2", "\u0743\u0766\u0767\u2727\u0715\u0717\u0701\u0765\u0743\u0748\u075f\u0748\u0706\u0745\u0748\u0747\u074e\u0706\u077a\u075d\u075b\u0740\u0747\u074e\u0712\u0700\u0765\u0743\u0748\u075f\u0748\u0706\u0745\u0748\u0747\u074e\u0706\u077a\u075d\u075b\u0740\u0747\u074e\u0712", "\u025d\u0202\u020d\u0208\u020f\u0208\u0215\u025f\u025d\u025f\u0249\u0248\u0237", "\u01fc\u01a9\u01ae\u01a9\u01b4\u01fe\u01fc\u01fe\u01e8\u01e9\u0196", "\u02ea\u02e8\u02f9\u02ce\u02e1\u02ec\u02fe\u02fe\u02b1\u02b3\u02a5\u02a4\u02c1\u02e7\u02ec\u02fb\u02ec\u02a2\u02e1\u02ec\u02e3\u02ea\u02a2\u02ce\u02e1\u02ec\u02fe\u02fe\u02b6", "\u015c\u0155\u0147\u015c\u0177\u015b\u0150\u0151\u0108\u010a\u011c\u011d\u017d", "\u0700\u0714\u0710\u0704\u0709\u0716\u0759\u075b\u074d\u0729\u070f\u0704\u0713\u0704\u074a\u0709\u0704\u070b\u0702\u074a\u072a\u0707\u070f\u0700\u0706\u0711\u075e\u074c\u073f", "\u047d\u0472\u0471\u0470\u047b\u0422\u0420\u0436\u0437\u0452\u0474\u047f\u0468\u047f\u0431\u0472\u047f\u0470\u0479\u0431\u0451\u047c\u0474\u047b\u047d\u046a\u0425", "\u03de\u03c5\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0396\u0394\u0382\u0383\u03e6\u03c0\u03cb\u03dc\u03cb\u0385\u03c6\u03cb\u03c4\u03cd\u0385\u03f9\u03de\u03d8\u03c3\u03c4\u03cd\u0391", "\u009d\u009c\u0087\u009a\u0095\u008a\u00cf\u00cd\u00db\u00da\u00a5", "\u0429\u0428\u0433\u042e\u0421\u043e\u0406\u042b\u042b\u047b\u0479\u046f\u046e\u0411", "\u0275\u0263\u026b\u0276\u023e\u023c\u022a\u022b\u0254", "\u00ad\u00bb\u00b3\u00ae\u00e6\u00e4\u00f2\u0090\u00f3\u008c", "\u077b\u076d\u0765\u0778\u073c\u0730\u0732\u0724\u0746\u0725\u075a", "\u06af\u06b9\u06b1\u06ac\u06e4\u06e6\u06f0\u0692\u0691\u06f1\u068e", "\u00ae\u00a1\u00a6\u00a9\u00a4\u00a1\u00b2\u00ad\u00f4\u00f6\u00e0\u00e1\u009e"})
public final class Class4165 {
    public static float field9698;
    public static double field9699;
    public static float field9700;
    public static double field9701 = 0.5311118895958574;
    public static float field9702;
    public static double field9703;

    static {
        b\u200e = "create";
        field9702 = Float.intBitsToFloat(1043199908);
        field9700 = Float.intBitsToFloat(1061849356);
        field9703 = Double.longBitsToDouble(4600973665630143972L);
        aJ\u200e = "Allows you to steer entities without a saddle";
        field9699 = Double.longBitsToDouble(4551510721646314285L);
        field9698 = Float.intBitsToFloat(1062003779);
        bO\u200e = "Failed to open client folder!";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String pNcgwnSnWAUwV2Nb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 54597 : 54598;
            block5: while (true) {
                switch (n2) {
                    case 54598: {
                        n2 = 54596;
                        continue block5;
                    }
                    case 54597: {
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
    private static CallSite eDJjvA5aAGjJ6q(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4165.pNcgwnSnWAUwV2Nb(k2, -1750164940));
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
                int a2 = Integer.parseInt(Class4165.pNcgwnSnWAUwV2Nb(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4165.pNcgwnSnWAUwV2Nb(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4165.pNcgwnSnWAUwV2Nb(k2, -1750164940) + " " + l2 + " " + m2);
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

