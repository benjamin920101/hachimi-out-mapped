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

@HACHIMI_CLIENT(mv=100, d1={"\uc9af\uc9ab\uc9a8\uc9ab\uc9ab\uc9aa\uc9ad\uc9a9", "\u75d4\u75d5\u75d0\u75d5\u75d5\u75d2\u75d6\u75d8", "\u1bca\u1bce\u1bcb\u1bca\u1bc9\u1bcb\u1bc1\u1bcf", "\ua6bb\ua6b8\ua6ba\ua6bb\ua6b9\ua6bf\ua6b3\ua6bb", "\uc692\uc69f\uc69f\uc699\uc69a\uc69f", "\u3dc3\u3dcf\u3dc1\u3dc3\u3dc7\u3dc3\u3dc5\u3dc5", "\u2be3\u2be6\u2beb\u2be4\u2be2\u2be2\u2be0\u2be7", "\u2761\u2763\u2765\u2762\u2765\u2764\u276b\u276a", "\u5dec\u5ded\u5dec\u5de9\u5de5\u5dea\u5dec\u5de4", "\u4f60\u4f67\u4f63\u4f62\u4f60\u4f6e\u4f67", "\ud67c\ud673\ud67e\ud673\ud672\ud679\ud678\ud67a", "\ud4dd\ud4de\ud4d2\ud4d9\ud4df\ud4de\ud4df\ud4d2", "\u0774\u0770\u0770\u077b\u077a\u0776\u077a\u0772", "\ue4cd\ue4cf\ue4c7\ue4c6\ue4cf\ue4cf\ue4c9\ue4ca", "\ub6ca\ub6ca\ub6c5\ub6ce\ub6c5\ub6cf\ub6c9\ub6c9"}, d2={"\u06ea\u06cf\u06c7\u268e\u06bc\u06be\u06a8\u06cc\u06ea\u06e1\u06f6\u06e1\u06af\u06ec\u06e1\u06ee\u06e7\u06af\u06d3\u06f4\u06f2\u06e9\u06ee\u06e7\u06bb\u06a9\u06cc\u06ea\u06e1\u06f6\u06e1\u06af\u06ec\u06e1\u06ee\u06e7\u06af\u06d3\u06f4\u06f2\u06e9\u06ee\u06e7\u06bb", "\u06ed\u06b2\u06bd\u06b8\u06bf\u06b8\u06a5\u06ef\u06ed\u06ef\u06f9\u06f8\u0687", "\u01ce\u019b\u019c\u019b\u0186\u01cc\u01ce\u01cc\u01da\u01db\u01a4", "\u02a8\u02aa\u02bb\u028c\u02a3\u02ae\u02bc\u02bc\u02f3\u02f1\u02e7\u02e6\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u028c\u02a3\u02ae\u02bc\u02bc\u02f4", "\u07cf\u07c6\u07d4\u07cf\u07e4\u07c8\u07c3\u07c2\u079b\u0799\u078f\u078e\u07ee", "\u049b\u048f\u048b\u049f\u0492\u048d\u04c2\u04c0\u04d6\u04b2\u0494\u049f\u0488\u049f\u04d1\u0492\u049f\u0490\u0499\u04d1\u04b1\u049c\u0494\u049b\u049d\u048a\u04c5\u04d7\u04a4", "\u0704\u070b\u0708\u0709\u0702\u075b\u0759\u074f\u074e\u072b\u070d\u0706\u0711\u0706\u0748\u070b\u0706\u0709\u0700\u0748\u0728\u0705\u070d\u0702\u0704\u0713\u075c", "\u07b8\u07a3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f0\u07f2\u07e4\u07e5\u0780\u07a6\u07ad\u07ba\u07ad\u07e3\u07a0\u07ad\u07a2\u07ab\u07e3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f7", "\u0793\u0792\u0789\u0794\u079b\u0784\u07c1\u07c3\u07d5\u07d4\u07ab", "\u0154\u0155\u014e\u0153\u015c\u0143\u017b\u0156\u0156\u0106\u0104\u0112\u0113\u016c", "\\JB_\u0017\u0015\u0003\u0002}", "\u03f4\u03e2\u03ea\u03f7\u03bf\u03bd\u03ab\u03c9\u03aa\u03d5", "\u00a9\u00bf\u00b7\u00aa\u00ee\u00e2\u00e0\u00f6\u0094\u00f7\u0088", ".80-egq\u0013\u0010p\u000f", "\u0657\u0658\u065f\u0650\u065d\u0658\u064b\u0654\u060d\u060f\u0619\u0618\u0667"})
public final class Class1321 {
    public static double field5117;
    public static double field5118;
    public static float field5119;

    private static String NB7wRZpJH4aTBwOA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite R9WruCGUiYYONJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1321.NB7wRZpJH4aTBwOA(k2, -334496992));
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
                int a2 = Integer.parseInt(Class1321.NB7wRZpJH4aTBwOA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1321.NB7wRZpJH4aTBwOA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1321.NB7wRZpJH4aTBwOA(k2, -334496992) + " " + l2 + " " + m2);
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
        ap\u200e = "Entities";
        field5119 = Float.intBitsToFloat(1053932926);
        field5117 = Double.longBitsToDouble(4616752568008179712L);
        field5118 = Double.longBitsToDouble(4586054988926599120L);
    }
}

