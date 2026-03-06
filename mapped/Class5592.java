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
@HACHIMI_CLIENT(mv=100, d1={"\ub98d\ub98c\ub98d\ub98c\ub98a\ub989\ub981\ub981", "\ud06a\ud067\ud06d\ud06e\ud068\ud067\ud066\ud06f", "\ucaf2\ucafd\ucaf3\ucafd\ucaf7\ucaf5\ucaf1\ucaf1", "\u33d7\u33d3\u33d7\u33d1\u33d2\u33d2\u33da\u33d5", "\udf32\udf3b\udf36\udf32\udf3a\udf34\udf35\udf32", "\u2219\u221f\u221d\u2217\u221f\u221b\u221c\u221a", "\u0aaf\u0aa9\u0aac\u0aab\u0aae\u0aab\u0aa3\u0aaf", "\u1160\u1165\u116b\u1162\u1163\u1165\u1165\u1162", "\u7f10\u7f11\u7f1d\u7f11\u7f14\u7f1d\u7f1d\u7f11", "\u9d9d\u9d9d\u9d97\u9d9c\u9d96\u9d9c\u9d97\u9d97", "\u73aa\u73af\u73ad\u73a8\u73a1\u73a0\u73ab\u73a9", "\ubaab\ubaa8\ubaa7\ubaa6\ubaaa\ubaac\ubaa8\ubaa8", "\uc519\uc518\uc51e\uc51a\uc511\uc51c\uc519", "\u95fe\u95fc\u95ff\u95f8\u95fd\u95f8\u95f8", "\u58af\u58af\u58a6\u58a9\u58aa\u58ab\u58ac\u58a7", "\u353d\u353e\u3537\u353c\u353d\u3538\u3538\u353b", "\u6603\u6602\u6606\u6606\u660a\u6604\u6601\u6605"}, d2={"\u00c6\u00c1\u00fb\u20bc\u008e\u008c\u009a\u00fe\u00d8\u00d3\u00c4\u00d3\u009d\u00de\u00d3\u00dc\u00d5\u009d\u00e1\u00c6\u00c0\u00db\u00dc\u00d5\u0089\u009b\u00fe\u00d8\u00d3\u00c4\u00d3\u009d\u00de\u00d3\u00dc\u00d5\u009d\u00e1\u00c6\u00c0\u00db\u00dc\u00d5\u0089", "\u070d\u070a\u0733\u2777\u0745\u0747\u0751\u0735\u0713\u0718\u070f\u0718\u0756\u0715\u0718\u0717\u071e\u0756\u072a\u070d\u070b\u0710\u0717\u071e\u0742\u0750\u0735\u0713\u0718\u070f\u0718\u0756\u0715\u0718\u0717\u071e\u0756\u072a\u070d\u070b\u0710\u0717\u071e\u0742", "\u06e7\u06e0\u06d8\u269d\u06af\u06ad\u06bb\u06df\u06f9\u06f2\u06e5\u06f2\u06bc\u06ff\u06f2\u06fd\u06f4\u06bc\u06c0\u06e7\u06e1\u06fa\u06fd\u06f4\u06a8\u06ba\u06df\u06f9\u06f2\u06e5\u06f2\u06bc\u06ff\u06f2\u06fd\u06f4\u06bc\u06c0\u06e7\u06e1\u06fa\u06fd\u06f4\u06a8", "\u021f\u0240\u024f\u024a\u024d\u024a\u0257\u021d\u021f\u021d\u020b\u020a\u0275", "\u03b2\u03e7\u03e0\u03e7\u03fa\u03b0\u03b2\u03b0\u03a6\u03a7\u03d8", "\u02c3\u02c1\u02d0\u02e7\u02c8\u02c5\u02d7\u02d7\u0298\u029a\u028c\u028d\u02e8\u02ce\u02c5\u02d2\u02c5\u028b\u02c8\u02c5\u02ca\u02c3\u028b\u02e7\u02c8\u02c5\u02d7\u02d7\u029f", "\u07e7\u07ee\u07fc\u07e7\u07cc\u07e0\u07eb\u07ea\u07b3\u07b1\u07a7\u07a6\u07c6", "\u04b5\u04a1\u04a5\u04b1\u04bc\u04a3\u04ec\u04ee\u04f8\u049c\u04ba\u04b1\u04a6\u04b1\u04ff\u04bc\u04b1\u04be\u04b7\u04ff\u049f\u04b2\u04ba\u04b5\u04b3\u04a4\u04eb\u04f9\u048a", "\u06bc\u06b3\u06b0\u06b1\u06ba\u06e3\u06e1\u06f7\u06f6\u0693\u06b5\u06be\u06a9\u06be\u06f0\u06b3\u06be\u06b1\u06b8\u06f0\u0690\u06bd\u06b5\u06ba\u06bc\u06ab\u06e4", "\u06c2\u06d9\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068a\u0688\u069e\u069f\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d", "\u01e1\u01e0\u01fb\u01e6\u01e9\u01f6\u01b3\u01b1\u01a7\u01a6\u01d9", "/.5('8\u0000--}\u007fih\u0017", "\u0638\u062e\u0626\u063b\u0673\u0671\u0667\u0666\u0619", "\u01af\u01b9\u01b1\u01ac\u01e4\u01e6\u01f0\u0192\u01f1\u018e", "\u05ea\u05fc\u05f4\u05e9\u05ad\u05a1\u05a3\u05b5\u05d7\u05b4\u05cb", "\u05c8\u05de\u05d6\u05cb\u0583\u0581\u0597\u05f5\u05f6\u0596\u05e9", "\u0720\u072f\u0728\u0727\u072a\u072f\u073c\u0723\u077a\u0778\u076e\u076f\u0710"})
public final class Class5592 {
    public static float field10636 = 0.50224876f;
    public static double field10637;
    public static float field10638;
    public static float field10639;

    private static String 4T1RJOY9D4D5O6Q7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10638 = Float.intBitsToFloat(1063768926);
        O\u200e = ":";
        field10637 = Double.longBitsToDouble(4604454680925783671L);
        field10639 = Float.intBitsToFloat(1059554366);
        aS\u200e = "Break crystals when placing blocks";
        bs\u200e = "Asynchronous";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite uTb79PuI7oEJ5d(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5592.4T1RJOY9D4D5O6Q7(k2, -925075415));
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
                int a2 = Integer.parseInt(Class5592.4T1RJOY9D4D5O6Q7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5592.4T1RJOY9D4D5O6Q7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5592.4T1RJOY9D4D5O6Q7(k2, -925075415) + " " + l2 + " " + m2);
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

