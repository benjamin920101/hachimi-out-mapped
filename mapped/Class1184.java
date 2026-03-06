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

@HACHIMI_CLIENT(mv=100, d1={"\ud2e3\ud2e0\ud2e6\ud2e2\ud2e3\ud2e6\ud2e0\ud2e6", "\u76e0\u76e2\u76e1\u76e0\u76e2\u76e9\u76e5\u76e2", "\u870b\u870b\u8700\u870f\u870d\u8709\u870f\u870b", "\u3189\u3183\u3188\u318d\u318a\u3183\u318d\u3188", "\uc731\uc736\uc732\uc73d\uc73d\uc737\uc737\uc732", "\ud9a1\ud9a1\ud9aa\ud9a0\ud9a6\ud9a7\ud9a3\ud9a5", "\u667f\u6673\u6675\u6674\u6670\u6675\u6677", "\ud3dd\ud3df\ud3dc\ud3d9\ud3dc\ud3de\ud3d6\ud3dd", "\uc106\uc107\uc102\uc102\uc109\uc107\uc105\uc102", "\u0120\u0121\u0121\u0121\u0124\u0129\u0125\u0128", "\ucdb2\ucdb1\ucdb7\ucdb0\ucdb4\ucdb4\ucdb6\ucdb7", "\u261f\u261f\u261a\u261d\u261d\u2614\u2614\u261d", "\u8436\u8436\u8437\u8435\u8432\u8435\u8431\u8433", "\u4197\u4194\u4194\u4194\u4193\u419f\u419f\u4197", "\u2f53\u2f58\u2f59\u2f50\u2f52\u2f58\u2f54\u2f59", "\uca2a\uca21\uca2a\uca21\uca2c\uca2a\uca2a\uca2b"}, d2={"\u0285\u028a\u0281\u22e3\u02d1\u02d3\u02c5\u02a1\u0287\u028c\u029b\u028c\u02c2\u0281\u028c\u0283\u028a\u02c2\u02be\u0299\u029f\u0284\u0283\u028a\u02d6\u02c4\u02a1\u0287\u028c\u029b\u028c\u02c2\u0281\u028c\u0283\u028a\u02c2\u02be\u0299\u029f\u0284\u0283\u028a\u02d6", "\u053b\u0534\u053e\u255d\u056f\u056d\u057b\u051f\u0539\u0532\u0525\u0532\u057c\u053f\u0532\u053d\u0534\u057c\u0500\u0527\u0521\u053a\u053d\u0534\u0568\u057a\u051f\u0539\u0532\u0525\u0532\u057c\u053f\u0532\u053d\u0534\u057c\u0500\u0527\u0521\u053a\u053d\u0534\u0568", "\u0502\u055d\u0552\u0557\u0550\u0557\u054a\u0500\u0502\u0500\u0516\u0517\u0568", "\u07e3\u07b6\u07b1\u07b6\u07ab\u07e1\u07e3\u07e1\u07f7\u07f6\u0789", "\u00a7\u00a5\u00b4\u0083\u00ac\u00a1\u00b3\u00b3\u00fc\u00fe\u00e8\u00e9\u008c\u00aa\u00a1\u00b6\u00a1\u00ef\u00ac\u00a1\u00ae\u00a7\u00ef\u0083\u00ac\u00a1\u00b3\u00b3\u00fb", "\u01b2\u01bb\u01a9\u01b2\u0199\u01b5\u01be\u01bf\u01e6\u01e4\u01f2\u01f3\u0193", "\u0297\u0283\u0287\u0293\u029e\u0281\u02ce\u02cc\u02da\u02be\u0298\u0293\u0284\u0293\u02dd\u029e\u0293\u029c\u0295\u02dd\u02bd\u0290\u0298\u0297\u0291\u0286\u02c9\u02db\u02a8", "\u0337\u0338\u033b\u033a\u0331\u0368\u036a\u037c\u037d\u0318\u033e\u0335\u0322\u0335\u037b\u0338\u0335\u033a\u0333\u037b\u031b\u0336\u033e\u0331\u0337\u0320\u036f", "\u07b1\u07aa\u0796\u07b1\u07b7\u07ac\u07ab\u07a2\u07f9\u07fb\u07ed\u07ec\u0789\u07af\u07a4\u07b3\u07a4\u07ea\u07a9\u07a4\u07ab\u07a2\u07ea\u0796\u07b1\u07b7\u07ac\u07ab\u07a2\u07fe", "\u02e1\u02e0\u02fb\u02e6\u02e9\u02f6\u02b3\u02b1\u02a7\u02a6\u02d9", "\u0351\u0350\u034b\u0356\u0359\u0346\u037e\u0353\u0353\u0303\u0301\u0317\u0316\u0369", "\u0355\u0343\u034b\u0356\u031e\u031c\u030a\u030b\u0374", "\u01c7\u01d1\u01d9\u01c4\u018c\u018e\u0198\u01fa\u0199\u01e6", "\u03d2\u03c4\u03cc\u03d1\u0395\u0399\u039b\u038d\u03ef\u038c\u03f3", "\u0591\u0587\u058f\u0592\u05da\u05d8\u05ce\u05ac\u05af\u05cf\u05b0", "\u0656\u0659\u065e\u0651\u065c\u0659\u064a\u0655\u060c\u060e\u0618\u0619\u0666"})
public final class Class1184 {
    public static float field4695 = Float.intBitsToFloat(1060639409);
    public static double field4696 = Double.longBitsToDouble(0x4008000000000000L);

    static {
        ak\u200e = "Animation";
        bq\u200e = "Timer for the fade";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite BYe7J6k62qq1oI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1184.m1LhJtAl1isS2ivq(k2, -1237650725));
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
                int a2 = Integer.parseInt(Class1184.m1LhJtAl1isS2ivq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1184.m1LhJtAl1isS2ivq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1184.m1LhJtAl1isS2ivq(k2, -1237650725) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String m1LhJtAl1isS2ivq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

