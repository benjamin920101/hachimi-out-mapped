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

@HACHIMI_CLIENT(mv=100, d1={"\ua1f0\ua1f4\ua1fa\ua1f2\ua1fa\ua1f5\ua1f5\ua1f0", "\u26cf\u26ca\u26ca\u26c8\u26c0\u26c9\u26cf\u26c1", "\u82a6\u82a4\u82aa\u82a1\u82a1\u82ab\u82a0\u82a2", "\u9451\u9457\u9456\u9456\u9456\u9458\u9455\u9456", "\u478f\u478b\u478f\u478f\u478e\u4789\u4789\u4788", "\u5903\u5906\u5901\u5906\u5903\u590e\u5902\u5903", "\u11d9\u11d9\u11d8\u11d2\u11d3\u11db\u11da\u11d2", "\u68d1\u68d4\u68da\u68d1\u68d1\u68d2\u68d5\u68d4", "\u6c40\u6c46\u6c47\u6c44\u6c47\u6c44\u6c43\u6c43", "\u0ca3\u0ca5\u0ca2\u0ca0\u0ca1\u0ca4\u0ca0\u0ca3", "\u388c\u388b\u388a\u388a\u388b\u388d\u3888\u388b", "\ucfaf\ucfa2\ucfa9\ucfaa\ucfab\ucfad\ucfaf", "\u1d53\u1d57\u1d51\u1d5d\u1d57\u1d5d\u1d54\u1d5d", "\ub6df\ub6d3\ub6db\ub6d8\ub6dd\ub6d9\ub6dd\ub6da", "\u4645\u464a\u4642\u4643\u4647\u4642\u4646\u4646"}, d2={"\u02f5\u229d\u02af\u02ad\u02bb\u02df\u02f9\u02f2\u02e5\u02f2\u02bc\u02ff\u02f2\u02fd\u02f4\u02bc\u02c0\u02e7\u02e1\u02fa\u02fd\u02f4\u02a8\u02ba\u02df\u02f9\u02f2\u02e5\u02f2\u02bc\u02ff\u02f2\u02fd\u02f4\u02bc\u02c0\u02e7\u02e1\u02fa\u02fd\u02f4\u02a8", "\u04f3\u04ac\u04a3\u04a6\u04a1\u04a6\u04bb\u04f1\u04f3\u04f1\u04e7\u04e6\u0499", "\u00d9\u008c\u008b\u008c\u0091\u00db\u00d9\u00db\u00cd\u00cc\u00b3", "\u00d8\u00da\u00cb\u00fc\u00d3\u00de\u00cc\u00cc\u0083\u0081\u0097\u0096\u00f3\u00d5\u00de\u00c9\u00de\u0090\u00d3\u00de\u00d1\u00d8\u0090\u00fc\u00d3\u00de\u00cc\u00cc\u0084", "r{irYu~\u007f&$23S", "\u0601\u0615\u0611\u0605\u0608\u0617\u0658\u065a\u064c\u0628\u060e\u0605\u0612\u0605\u064b\u0608\u0605\u060a\u0603\u064b\u062b\u0606\u060e\u0601\u0607\u0610\u065f\u064d\u063e", "\u017c\u0173\u0170\u0171\u017a\u0123\u0121\u0137\u0136\u0153\u0175\u017e\u0169\u017e\u0130\u0173\u017e\u0171\u0178\u0130\u0150\u017d\u0175\u017a\u017c\u016b\u0124", "\u0084\u009f\u00a3\u0084\u0082\u0099\u009e\u0097\u00cc\u00ce\u00d8\u00d9\u00bc\u009a\u0091\u0086\u0091\u00df\u009c\u0091\u009e\u0097\u00df\u00a3\u0084\u0082\u0099\u009e\u0097\u00cb", "\u04cb\u04ca\u04d1\u04cc\u04c3\u04dc\u0499\u049b\u048d\u048c\u04f3", "\u049d\u049c\u0487\u049a\u0495\u048a\u04b2\u049f\u049f\u04cf\u04cd\u04db\u04da\u04a5", "\u059c\u058a\u0582\u059f\u05d7\u05d5\u05c3\u05c2\u05bd", "\u066c\u067a\u0672\u066f\u0627\u0625\u0633\u0651\u0632\u064d", "\u06d5\u06c3\u06cb\u06d6\u0692\u069e\u069c\u068a\u06e8\u068b\u06f4", "\u00a9\u00bf\u00b7\u00aa\u00e2\u00e0\u00f6\u0094\u0097\u00f7\u0088", "\u05a4\u05ab\u05ac\u05a3\u05ae\u05ab\u05b8\u05a7\u05fe\u05fc\u05ea\u05eb\u0594"})
public final class Class3447 {
    private static String Nf6J60W2ONJl6GTP(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Fy1RwLbhjol7Ku(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3447.Nf6J60W2ONJl6GTP(k2, -653133832));
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
                int a2 = Integer.parseInt(Class3447.Nf6J60W2ONJl6GTP(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3447.Nf6J60W2ONJl6GTP(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3447.Nf6J60W2ONJl6GTP(k2, -653133832) + " " + l2 + " " + m2);
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
        ar\u200e = "Rotates to block before placing";
    }
}

