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
@HACHIMI_CLIENT(mv=100, d1={"\u6f45\u6f46\u6f47\u6f46\u6f42\u6f4e\u6f47\u6f4f", "\u3502\u3502\u3506\u3500\u3505\u3504\u3504\u3500", "\u05e8\u05ef\u05e8\u05ea\u05ec\u05e7\u05e7\u05e9", "\u1ab8\u1ab7\u1abe\u1ab7\u1abc\u1ab7\u1abf\u1ab6", "\ud4d7\ud4d2\ud4d2\ud4da\ud4d0\ud4d1\ud4d5\ud4da", "\ub4f9\ub4fd\ub4fc\ub4ff\ub4f9\ub4fd\ub4fc\ub4fb", "\ue662\ue665\ue663\ue666\ue661\ue665\ue664\ue665", "\uc819\uc819\uc81e\uc818\uc81d\uc81a\uc811\uc810", "\u8628\u862e\u8629\u8626\u862c\u862a\u8629\u862a", "\u90fc\u90ff\u90fe\u90fa\u90fb\u90f9\u90f8\u90ff", "\uc9eb\uc9e6\uc9ee\uc9e8\uc9ee\uc9ef\uc9e7\uc9e8", "\u5285\u528c\u5285\u528c\u5282\u5284\u5281\u5283", "\u1e8d\u1e8e\u1e81\u1e8a\u1e8b\u1e88\u1e8a\u1e8f", "\u12de\u12dc\u12d3\u12d3\u12df\u12d9\u12db\u12df", "\u7eb6\u7eb0\u7eb0\u7eba\u7eb6\u7eb7\u7eb6\u7eba"}, d2={"]NY\u2038\n\b\u001ez\\W@W\u0019ZWXQ\u0019eBD_XQ\r\u001fz\\W@W\u0019ZWXQ\u0019eBD_XQ\r", "\u0481\u04de\u04d1\u04d4\u04d3\u04d4\u04c9\u0483\u0481\u0483\u0495\u0494\u04eb", "\u0129\u017c\u017b\u017c\u0161\u012b\u0129\u012b\u013d\u013c\u0143", "\u0280\u0282\u0293\u02a4\u028b\u0286\u0294\u0294\u02db\u02d9\u02cf\u02ce\u02ab\u028d\u0286\u0291\u0286\u02c8\u028b\u0286\u0289\u0280\u02c8\u02a4\u028b\u0286\u0294\u0294\u02dc", "\u0690\u0699\u068b\u0690\u06bb\u0697\u069c\u069d\u06c4\u06c6\u06d0\u06d1\u06b1", "\u02e3\u02f7\u02f3\u02e7\u02ea\u02f5\u02ba\u02b8\u02ae\u02ca\u02ec\u02e7\u02f0\u02e7\u02a9\u02ea\u02e7\u02e8\u02e1\u02a9\u02c9\u02e4\u02ec\u02e3\u02e5\u02f2\u02bd\u02af\u02dc", "\u0117\u0118\u011b\u011a\u0111\u0148\u014a\u015c\u015d\u0138\u011e\u0115\u0102\u0115\u015b\u0118\u0115\u011a\u0113\u015b\u013b\u0116\u011e\u0111\u0117\u0100\u014f", "\u068a\u0691\u06ad\u068a\u068c\u0697\u0690\u0699\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06ad\u068a\u068c\u0697\u0690\u0699\u06c5", "\u0671\u0670\u066b\u0676\u0679\u0666\u0623\u0621\u0637\u0636\u0649", "\u04a4\u04a5\u04be\u04a3\u04ac\u04b3\u048b\u04a6\u04a6\u04f6\u04f4\u04e2\u04e3\u049c", "\u0686\u0690\u0698\u0685\u06cd\u06cf\u06d9\u06d8\u06a7", "\u062b\u063d\u0635\u0628\u0660\u0662\u0674\u0616\u0675\u060a", "\u05fe\u05e8\u05e0\u05fd\u05b9\u05b5\u05b7\u05a1\u05c3\u05a0\u05df", "\u071e\u0708\u0700\u071d\u0755\u0757\u0741\u0723\u0720\u0740\u073f", "\u0169\u0166\u0161\u016e\u0163\u0166\u0175\u016a\u0133\u0131\u0127\u0126\u0159"})
public final class Class1628 {
    public static float field6064 = Float.intBitsToFloat(1108082688);
    public static float field6065 = Float.intBitsToFloat(1059468749);
    public static float field6066;
    public static float field6067;

    /*
     * WARNING - void declaration
     */
    private static CallSite 1L1fBa7HdXNCdh(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1628.ubwxGkINplmwVuWS(k2, 429483963));
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
                int a2 = Integer.parseInt(Class1628.ubwxGkINplmwVuWS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1628.ubwxGkINplmwVuWS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1628.ubwxGkINplmwVuWS(k2, 429483963) + " " + l2 + " " + m2);
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
        aS\u200e = "Projectiles";
        field6066 = Float.intBitsToFloat(1048836644);
        field6067 = Float.intBitsToFloat(1061951436);
    }

    private static String ubwxGkINplmwVuWS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

