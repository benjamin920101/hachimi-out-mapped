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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ud793\ud791\ud790\ud792\ud794\ud798\ud794\ud790", "\u6d7a\u6d73\u6d7a\u6d7f\u6d7d\u6d73\u6d72", "\u1cc5\u1cc3\u1cce\u1cc6\u1cc7\u1cc7\u1cc1\u1cc7", "\u19f7\u19f6\u19f0\u19f6\u19f1\u19f1\u19f2\u19f2", "\u7bab\u7ba6\u7bac\u7baf\u7ba6\u7ba6\u7bad\u7bab", "\u955b\u955d\u955e\u955d\u955b\u955b\u955b\u955c", "\u9812\u9814\u9810\u981e\u9817\u9811\u9810\u9814", "\u454b\u454c\u4549\u4545\u454e\u4544\u454f\u454f", "\u1053\u1056\u1057\u105b\u1057\u1054\u1057\u105b", "\u7428\u742d\u7423\u7428\u742e\u7422\u742f\u7422", "\u66e9\u66ea\u66e9\u66ee\u66ea\u66e2\u66ee\u66e9", "\u6a9b\u6a9e\u6a97\u6a9a\u6a96\u6a9b\u6a9a\u6a9b", "\u5d10\u5d15\u5d1d\u5d1d\u5d10\u5d10\u5d17\u5d16", "\u5216\u5215\u5217\u5212\u5210\u521c\u521d\u5210", "\u564d\u5643\u564f\u564e\u5648\u564a\u5648\u5649"}, d2={"\u0696\u0698\u0680\u0693\u06bf\u0682\u0696\u069c\u068b\u069c\u06ed\u06ef\u06f9\u069d\u06bb\u06b0\u06a7\u06b0\u06fe\u06bd\u06b0\u06bf\u06b6\u06fe\u0682\u06a5\u06a3\u06b8\u06bf\u06b6\u06ea\u06f8\u069d\u06bb\u06b0\u06a7\u06b0\u06fe\u06bd\u06b0\u06bf\u06b6\u06fe\u0682\u06a5\u06a3\u06b8\u06bf\u06b6\u06ea", "\u020e\u0251\u025e\u025b\u025c\u025b\u0246\u020c\u020e\u020c\u021a\u021b\u0264", "\u0226\u0273\u0274\u0273\u026e\u0224\u0226\u0224\u0232\u0233\u024c", "\u06b0\u06b2\u06a3\u0694\u06bb\u06b6\u06a4\u06a4\u06eb\u06e9\u06ff\u06fe\u069b\u06bd\u06b6\u06a1\u06b6\u06f8\u06bb\u06b6\u06b9\u06b0\u06f8\u0694\u06bb\u06b6\u06a4\u06a4\u06ec", "#*8#\b$/.wucb\u0002", "\u02ec\u02f8\u02fc\u02e8\u02e5\u02fa\u02b5\u02b7\u02a1\u02c5\u02e3\u02e8\u02ff\u02e8\u02a6\u02e5\u02e8\u02e7\u02ee\u02a6\u02c6\u02eb\u02e3\u02ec\u02ea\u02fd\u02b2\u02a0\u02d3", "\u0673\u067c\u067f\u067e\u0675\u062c\u062e\u0638\u0639\u065c\u067a\u0671\u0666\u0671\u063f\u067c\u0671\u067e\u0677\u063f\u065f\u0672\u067a\u0675\u0673\u0664\u062b", "\u0232\u0229\u0215\u0232\u0234\u022f\u0228\u0221\u027a\u0278\u026e\u026f\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0215\u0232\u0234\u022f\u0228\u0221\u027d", "\u0139\u0138\u0123\u013e\u0131\u012e\u016b\u0169\u017f\u017e\u0101", "\u053a\u053b\u0520\u053d\u0532\u052d\u0515\u0538\u0538\u0568\u056a\u057c\u057d\u0502", "\u0524\u0532\u053a\u0527\u056f\u056d\u057b\u057a\u0505", "\u0110\u0106\u010e\u0113\u015b\u0159\u014f\u012d\u014e\u0131", "\u01d6\u01c0\u01c8\u01d5\u0191\u019d\u019f\u0189\u01eb\u0188\u01f7", "\u0188\u019e\u0196\u018b\u01c3\u01c1\u01d7\u01b5\u01b6\u01d6\u01a9", "\u031d\u0312\u0315\u031a\u0317\u0312\u0301\u031e\u0347\u0345\u0353\u0352\u032d"})
public final class Class3583 {
    public static double field7974 = Double.longBitsToDouble(4609434218613702656L);

    /*
     * WARNING - void declaration
     */
    private static CallSite iNfZAJiKL0rXPG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3583.7EQsD91bPgAOeY9v(k2, 1886199388));
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
                int a2 = Integer.parseInt(Class3583.7EQsD91bPgAOeY9v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3583.7EQsD91bPgAOeY9v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3583.7EQsD91bPgAOeY9v(k2, 1886199388) + " " + l2 + " " + m2);
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
        bc\u200e = "My damage";
    }

    private static String 7EQsD91bPgAOeY9v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

