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
@HACHIMI_CLIENT(mv=100, d1={"\u2a1c\u2a1f\u2a19\u2a1a\u2a18\u2a1b\u2a1f\u2a11", "\u1d01\u1d00\u1d02\u1d05\u1d01\u1d02\u1d07\u1d06", "\uc31e\uc31f\uc318\uc31b\uc31d\uc318\uc312\uc31b", "\u4bea\u4be6\u4bed\u4bee\u4be6\u4bef\u4be7\u4bee", "\ua3c6\ua3cd\ua3c1\ua3c0\ua3c3\ua3c7\ua3c6\ua3cd", "\u13c1\u13c8\u13c2\u13c8\u13c9\u13c1\u13c0\u13c3", "\u8e68\u8e69\u8e6b\u8e6d\u8e6a\u8e6a\u8e6a\u8e6f", "\u26f4\u26f3\u26f7\u26f6\u26f1\u26fe\u26f0\u26f3", "\uad01\uad04\uad06\uad01\uad01\uad04\uad04\uad07", "\u90cc\u90cf\u90ca\u90ce\u90cd\u90c0\u90c9\u90cb", "\u8a87\u8a85\u8a80\u8a81\u8a88\u8a88", "\u593e\u593b\u5933\u593f\u593a\u5933\u5938\u5938", "\u3155\u3158\u3155\u3155\u3155\u315b\u315c", "\u9592\u9590\u9594\u9593\u9592\u9593\u9592\u9594", "\u6379\u637e\u637f\u637a\u6372", "\u38fe\u38f1\u38f6\u38ff\u38fe\u38f3\u38f0", "\u7e66\u7e62\u7e61\u7e6c\u7e66\u7e63\u7e6c\u7e61"}, d2={"\u01d0\u01f7\u01d4\u21b4\u0186\u0184\u0192\u01f6\u01d0\u01db\u01cc\u01db\u0195\u01d6\u01db\u01d4\u01dd\u0195\u01e9\u01ce\u01c8\u01d3\u01d4\u01dd\u0181\u0193\u01f6\u01d0\u01db\u01cc\u01db\u0195\u01d6\u01db\u01d4\u01dd\u0195\u01e9\u01ce\u01c8\u01d3\u01d4\u01dd\u0181", "\u0514\u0533\u0511\u2570\u0542\u0540\u0556\u0532\u0514\u051f\u0508\u051f\u0551\u0512\u051f\u0510\u0519\u0551\u052d\u050a\u050c\u0517\u0510\u0519\u0545\u0557\u0532\u0514\u051f\u0508\u051f\u0551\u0512\u051f\u0510\u0519\u0551\u052d\u050a\u050c\u0517\u0510\u0519\u0545", "\u02cf\u02e8\u02d5\u22ab\u0299\u029b\u028d\u02e9\u02cf\u02c4\u02d3\u02c4\u028a\u02c9\u02c4\u02cb\u02c2\u028a\u02f6\u02d1\u02d7\u02cc\u02cb\u02c2\u029e\u028c\u02e9\u02cf\u02c4\u02d3\u02c4\u028a\u02c9\u02c4\u02cb\u02c2\u028a\u02f6\u02d1\u02d7\u02cc\u02cb\u02c2\u029e", "\u01a9\u01f6\u01f9\u01fc\u01fb\u01fc\u01e1\u01ab\u01a9\u01ab\u01bd\u01bc\u01c3", "\u05b8\u05ed\u05ea\u05ed\u05f0\u05ba\u05b8\u05ba\u05ac\u05ad\u05d2", "\u02ce\u02cc\u02dd\u02ea\u02c5\u02c8\u02da\u02da\u0295\u0297\u0281\u0280\u02e5\u02c3\u02c8\u02df\u02c8\u0286\u02c5\u02c8\u02c7\u02ce\u0286\u02ea\u02c5\u02c8\u02da\u02da\u0292", "\u06d0\u06d9\u06cb\u06d0\u06fb\u06d7\u06dc\u06dd\u0684\u0686\u0690\u0691\u06f1", "\u05ea\u05fe\u05fa\u05ee\u05e3\u05fc\u05b3\u05b1\u05a7\u05c3\u05e5\u05ee\u05f9\u05ee\u05a0\u05e3\u05ee\u05e1\u05e8\u05a0\u05c0\u05ed\u05e5\u05ea\u05ec\u05fb\u05b4\u05a6\u05d5", "\u015d\u0152\u0151\u0150\u015b\u0102\u0100\u0116\u0117\u0172\u0154\u015f\u0148\u015f\u0111\u0152\u015f\u0150\u0159\u0111\u0171\u015c\u0154\u015b\u015d\u014a\u0105", "\u02b1\u02aa\u0296\u02b1\u02b7\u02ac\u02ab\u02a2\u02f9\u02fb\u02ed\u02ec\u0289\u02af\u02a4\u02b3\u02a4\u02ea\u02a9\u02a4\u02ab\u02a2\u02ea\u0296\u02b1\u02b7\u02ac\u02ab\u02a2\u02fe", "\u0116\u0117\u010c\u0111\u011e\u0101\u0144\u0146\u0150\u0151\u012e", "\u074d\u074c\u0757\u074a\u0745\u075a\u0762\u074f\u074f\u071f\u071d\u070b\u070a\u0775", "\u0126\u0130\u0138\u0125\u016d\u016f\u0179\u0178\u0107", "\u0515\u0503\u050b\u0516\u055e\u055c\u054a\u0528\u054b\u0534", "\u01bd\u01ab\u01a3\u01be\u01fa\u01f6\u01f4\u01e2\u0180\u01e3\u019c", "\u00df\u00c9\u00c1\u00dc\u0094\u0096\u0080\u00e2\u00e1\u0081\u00fe", "\u076e\u0761\u0766\u0769\u0764\u0761\u0772\u076d\u0734\u0736\u0720\u0721\u075e"})
public final class Class3610 {
    public static int field8053 = -653551278;

    private static String 8yrQVwqDl5TAI9nH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        C\u200e = "OBSIDIAN_BEDROCK";
        T\u200e = "Grim";
        bO\u200e = "";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite YvljitcGwML974(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3610.8yrQVwqDl5TAI9nH(k2, 425893204));
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
                int a2 = Integer.parseInt(Class3610.8yrQVwqDl5TAI9nH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3610.8yrQVwqDl5TAI9nH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3610.8yrQVwqDl5TAI9nH(k2, 425893204) + " " + l2 + " " + m2);
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

