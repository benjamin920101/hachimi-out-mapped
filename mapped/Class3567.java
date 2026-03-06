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

@HACHIMI_CLIENT(mv=100, d1={"\u69b6\u69be\u69b2\u69b1\u69b6\u69b0\u69b6\u69b6", "\u553c\u553f\u553c\u553c\u553c\u5535\u5539\u5539", "\u2102\u2101\u2106\u210c\u2106\u210d\u2103\u2106", "\ub3ec\ub3e8\ub3ee\ub3ef\ub3ec\ub3e6\ub3e7\ub3e6", "\u1c9a\u1c98\u1c95\u1c9e\u1c98\u1c98\u1c9b\u1c9c", "\ua583\ua584\ua583\ua58d\ua586\ua58c\ua584\ua583", "\ud2f7\ud2f4\ud2fc\ud2f4\ud2f4\ud2f6\ud2f2\ud2f3", "\u5977\u597d\u597c\u5973\u5972\u5970\u5970\u5970", "\u037e\u0372\u0379\u037c\u037b\u037b\u0378\u037c", "\ub89b\ub89b\ub89a\ub898\ub89c\ub89c\ub89c\ub89a", "\ucd39\ucd3d\ucd3b\ucd39\ucd37\ucd3d\ucd3c\ucd3e", "\u2a8c\u2a80\u2a80\u2a8b\u2a8c\u2a8b\u2a8e\u2a80", "\u071e\u0718\u071d\u071e\u071e\u0718\u071e\u071d", "\u2f65\u2f62\u2f62\u2f62\u2f64\u2f66\u2f6a\u2f64", "\u8e5d\u8e58\u8e59\u8e5e\u8e5e\u8e5c\u8e5a\u8e5b", "\u02ac\u02ab\u02ae\u02ac\u02a9\u02ae\u02a3\u02aa"}, d2={"\u059d\u05b8\u05b8\u25f9\u05cb\u05c9\u05df\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc\u05de\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc", "\u04fa\u04df\u04c0\u249e\u04ac\u04ae\u04b8\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04c3\u04e4\u04e2\u04f9\u04fe\u04f7\u04ab\u04b9\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04c3\u04e4\u04e2\u04f9\u04fe\u04f7\u04ab", "\u0777\u0728\u0727\u0722\u0725\u0722\u073f\u0775\u0777\u0775\u0763\u0762\u071d", "\u00b0\u00e5\u00e2\u00e5\u00f8\u00b2\u00b0\u00b2\u00a4\u00a5\u00da", "\u0753\u0751\u0740\u0777\u0758\u0755\u0747\u0747\u0708\u070a\u071c\u071d\u0778\u075e\u0755\u0742\u0755\u071b\u0758\u0755\u075a\u0753\u071b\u0777\u0758\u0755\u0747\u0747\u070f", "\u0666\u066f\u067d\u0666\u064d\u0661\u066a\u066b\u0632\u0630\u0626\u0627\u0647", "\u02f5\u02e1\u02e5\u02f1\u02fc\u02e3\u02ac\u02ae\u02b8\u02dc\u02fa\u02f1\u02e6\u02f1\u02bf\u02fc\u02f1\u02fe\u02f7\u02bf\u02df\u02f2\u02fa\u02f5\u02f3\u02e4\u02ab\u02b9\u02ca", "\u05a9\u05a6\u05a5\u05a4\u05af\u05f6\u05f4\u05e2\u05e3\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0585\u05a8\u05a0\u05af\u05a9\u05be\u05f1", "\u01dd\u01c6\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0195\u0197\u0181\u0180\u01e5\u01c3\u01c8\u01df\u01c8\u0186\u01c5\u01c8\u01c7\u01ce\u0186\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0192", "\u0501\u0500\u051b\u0506\u0509\u0516\u0553\u0551\u0547\u0546\u0539", "\u047b\u047a\u0461\u047c\u0473\u046c\u0454\u0479\u0479\u0429\u042b\u043d\u043c\u0443", "\u06a9\u06bf\u06b7\u06aa\u06e2\u06e0\u06f6\u06f7\u0688", "\"4<!ik}\u001f|\u0003", "\u032f\u0339\u0331\u032c\u0368\u0364\u0366\u0370\u0312\u0371\u030e", "\u01fc\u01ea\u01e2\u01ff\u01b7\u01b5\u01a3\u01c1\u01c2\u01a2\u01dd", "\u0115\u011a\u011d\u0112\u011f\u011a\u0109\u0116\u014f\u014d\u015b\u015a\u0125"})
public final class Class3567 {
    public static float field7926;

    private static String QU5fQqhPzOA8gy5Q(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite jrlypbih6dQMVJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3567.QU5fQqhPzOA8gy5Q(k2, -1534473257));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block6: while (true) {
            block13: {
                void e2;
                int n3 = f2 < q2.length ? 7803 : 7804;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 7803) {
                        try {
                            int a2 = Integer.parseInt(Class3567.QU5fQqhPzOA8gy5Q(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block13;
                        }
                    }
                    if (n4 != 7804) break block6;
                    n3 = 7802;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3567.QU5fQqhPzOA8gy5Q(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        int n5 = s2.isEmpty() ? 49473 : 49474;
        block8: while (true) {
            switch (n5) {
                case 49474: {
                    n5 = 49472;
                    continue block8;
                }
                case 49473: {
                    throw new Exception("Can't find method in " + Class3567.QU5fQqhPzOA8gy5Q(k2, -1534473257) + " " + l2 + " " + m2);
                }
            }
            break;
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
        l\u200e = "";
        u\u200e = "Changes the client text to custom font rendering";
        field7926 = Float.intBitsToFloat(1055714208);
    }
}

