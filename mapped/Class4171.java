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

@HACHIMI_CLIENT(mv=100, d1={"\u4a40\u4a46\u4a41\u4a46\u4a41\u4a40\u4a42\u4a43", "\u3a77\u3a7c\u3a73\u3a76\u3a72\u3a7d\u3a72\u3a72", "\u2267\u226d\u2263\u2262\u2260\u2267\u2260", "\uc4b9\uc4bf\uc4be\uc4bf\uc4b1\uc4b9\uc4b0\uc4bc", "\u63b8\u63bb\u63b8\u63b2\u63bd\u63b9\u63b9\u63bb", "\u9a3e\u9a3e\u9a3a\u9a3b\u9a3d\u9a3c\u9a35\u9a3a", "\u1314\u1318\u131e\u1319\u131d\u131f\u1314", "\u3fe5\u3feb\u3fe6\u3fe3\u3fe5\u3feb\u3feb\u3fea", "\ucb49\ucb4f\ucb4d\ucb47\ucb4d\ucb49\ucb49", "\ucabb\ucab6\ucab8\ucabd\ucabd\ucabc\ucab6\ucabc", "\u2211\u2219\u2210\u2216\u2216\u2219\u2217\u2216", "\u15da\u15d8\u15d5\u15de\u15de\u15db\u15d8\u15de", "\u4176\u4170\u4171\u4175\u4173\u4175\u4175\u4176", "\uce52\uce55\uce53\uce58\uce59\uce50\uce51\uce59"}, d2={"\u0675\u062a\u0625\u0620\u0627\u0620\u063d\u0677\u0675\u0677\u0661\u0660\u061f", "\u06a6\u06f3\u06f4\u06f3\u06ee\u06a4\u06a6\u06a4\u06b2\u06b3\u06cc", "\u0596\u0594\u0585\u05b2\u059d\u0590\u0582\u0582\u05cd\u05cf\u05d9\u05d8\u05bd\u059b\u0590\u0587\u0590\u05de\u059d\u0590\u059f\u0596\u05de\u05b2\u059d\u0590\u0582\u0582\u05ca", "\u040a\u0403\u0411\u040a\u0421\u040d\u0406\u0407\u045e\u045c\u044a\u044b\u042b", "\u02e2\u02f6\u02f2\u02e6\u02eb\u02f4\u02bb\u02b9\u02af\u02cb\u02ed\u02e6\u02f1\u02e6\u02a8\u02eb\u02e6\u02e9\u02e0\u02a8\u02c8\u02e5\u02ed\u02e2\u02e4\u02f3\u02bc\u02ae\u02dd", "\u064d\u0642\u0641\u0640\u064b\u0612\u0610\u0606\u0607\u0662\u0644\u064f\u0658\u064f\u0601\u0642\u064f\u0640\u0649\u0601\u0661\u064c\u0644\u064b\u064d\u065a\u0615", "@[g@F]ZS\b\n\u001c\u001dx^UBU\u001bXUZS\u001bg@F]ZS\u000f", "\u068f\u068e\u0695\u0688\u0687\u0698\u06dd\u06df\u06c9\u06c8\u06b7", "\u0169\u0168\u0173\u016e\u0161\u017e\u0146\u016b\u016b\u013b\u0139\u012f\u012e\u0151", "\u0393\u0385\u038d\u0390\u03d8\u03da\u03cc\u03cd\u03b2", "\u0207\u0211\u0219\u0204\u024c\u024e\u0258\u023a\u0259\u0226", "\u057c\u056a\u0562\u057f\u053b\u0537\u0535\u0523\u0541\u0522\u055d", "\u03dd\u03cb\u03c3\u03de\u0396\u0394\u0382\u03e0\u03e3\u0383\u03fc", "\u0379\u0376\u0371\u037e\u0373\u0376\u0365\u037a\u0323\u0321\u0337\u0336\u0349"})
public final class Class4171 {
    public static double field9717;
    public static long field9718 = -4873538341605576263L;
    public static double field9719;
    public static double field9720;

    private static String la4IfA9w0E8PPBet(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite qyhq1BKMRrN8JB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4171.la4IfA9w0E8PPBet(k2, 912569509));
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
                int a2 = Integer.parseInt(Class4171.la4IfA9w0E8PPBet(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4171.la4IfA9w0E8PPBet(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4171.la4IfA9w0E8PPBet(k2, 912569509) + " " + l2 + " " + m2);
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
        field9720 = Double.longBitsToDouble(4601722501121784518L);
        field9717 = Double.longBitsToDouble(4601424244729432652L);
        field9719 = Double.longBitsToDouble(4601078238624787600L);
    }
}

