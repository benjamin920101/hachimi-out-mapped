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

@HACHIMI_CLIENT(mv=100, d1={"\u6f7e\u6f7c\u6f7d\u6f79\u6f73\u6f79\u6f7c", "\ubc47\ubc46\ubc46\ubc43\ubc45\ubc4e\ubc44\ubc44", "\u4ac1\u4ac1\u4ac3\u4acd\u4ac3\u4acc\u4ac6\u4acc", "\u5535\u5536\u5530\u5531\u5537\u5537\u5530\u5535", "\u7383\u7382\u7384\u7385\u7386\u7389\u7384", "\ue2eb\ue2e8\ue2ef\ue2e0\ue2e1\ue2ec\ue2e0\ue2ec", "\u6a34\u6a33\u6a34\u6a33\u6a32\u6a35\u6a3d\u6a3d", "\udf44\udf47\udf42\udf41\udf41\udf4a\udf4a\udf4b", "\u7c10\u7c11\u7c17\u7c12\u7c13\u7c18\u7c13\u7c12", "\uaeed\uaeef\uaee1\uaeeb\uaeec\uaee9\uaeee\uaeec", "\u48b3\u48bd\u48b2\u48b1\u48b2\u48b6\u48b1\u48b6", "\u8494\u8492\u8492\u8493\u8494\u8495\u8494\u849e", "\u86f5\u86fb\u86fa\u86fd\u86ff\u86fa\u86f9", "\uaf4e\uaf4c\uaf49\uaf4a\uaf42\uaf4b\uaf4b", "\u97af\u97ab\u97aa\u97a0\u97ad\u97a0\u97a1\u97a1", "\u5e11\u5e1a\u5e11\u5e13\u5e14\u5e13\u5e11\u5e1a", "\u5e4e\u5e4e\u5e4a\u5e43\u5e4c\u5e49\u5e4c\u5e4c", "\u0b6e\u0b68\u0b62\u0b62\u0b69\u0b63\u0b6e\u0b6c", "\u18a1\u18a1\u18a0\u18a1\u18ab\u18a2\u18ab\u18a4"}, d2={"\u0683\u0683\u069c\u26e3\u06d1\u06d3\u06c5\u06a1\u0687\u068c\u069b\u068c\u06c2\u0681\u068c\u0683\u068a\u06c2\u06be\u0699\u069f\u0684\u0683\u068a\u06d6\u06c4\u06a1\u0687\u068c\u069b\u068c\u06c2\u0681\u068c\u0683\u068a\u06c2\u06be\u0699\u069f\u0684\u0683\u068a\u06d6", "\u00f5\u00f5\u00e9\u2095\u00a7\u00a5\u00b3\u00d7\u00f1\u00fa\u00ed\u00fa\u00b4\u00f7\u00fa\u00f5\u00fc\u00b4\u00c8\u00ef\u00e9\u00f2\u00f5\u00fc\u00a0\u00b2\u00d7\u00f1\u00fa\u00ed\u00fa\u00b4\u00f7\u00fa\u00f5\u00fc\u00b4\u00c8\u00ef\u00e9\u00f2\u00f5\u00fc\u00a0", "\u01a8\u01a8\u01b5\u21c8\u01fa\u01f8\u01ee\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd\u01ef\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd", "\u046f\u046f\u0475\u240f\u043d\u043f\u0429\u044d\u046b\u0460\u0477\u0460\u042e\u046d\u0460\u046f\u0466\u042e\u0452\u0475\u0473\u0468\u046f\u0466\u043a\u0428\u044d\u046b\u0460\u0477\u0460\u042e\u046d\u0460\u046f\u0466\u042e\u0452\u0475\u0473\u0468\u046f\u0466\u043a", "\u0538\u0538\u0523\u2558\u056a\u0568\u057e\u051a\u053c\u0537\u0520\u0537\u0579\u053a\u0537\u0538\u0531\u0579\u0505\u0522\u0524\u053f\u0538\u0531\u056d\u057f\u051a\u053c\u0537\u0520\u0537\u0579\u053a\u0537\u0538\u0531\u0579\u0505\u0522\u0524\u053f\u0538\u0531\u056d", "\u06c7\u0698\u0697\u0692\u0695\u0692\u068f\u06c5\u06c7\u06c5\u06d3\u06d2\u06ad", "\u03b8\u03ed\u03ea\u03ed\u03f0\u03ba\u03b8\u03ba\u03ac\u03ad\u03d2", "\u0418\u041a\u040b\u043c\u0413\u041e\u040c\u040c\u0443\u0441\u0457\u0456\u0433\u0415\u041e\u0409\u041e\u0450\u0413\u041e\u0411\u0418\u0450\u043c\u0413\u041e\u040c\u040c\u0444", "\u05c5\u05cc\u05de\u05c5\u05ee\u05c2\u05c9\u05c8\u0591\u0593\u0585\u0584\u05e4", "\u04e9\u04fd\u04f9\u04ed\u04e0\u04ff\u04b0\u04b2\u04a4\u04c0\u04e6\u04ed\u04fa\u04ed\u04a3\u04e0\u04ed\u04e2\u04eb\u04a3\u04c3\u04ee\u04e6\u04e9\u04ef\u04f8\u04b7\u04a5\u04d6", "\u05a1\u05ae\u05ad\u05ac\u05a7\u05fe\u05fc\u05ea\u05eb\u058e\u05a8\u05a3\u05b4\u05a3\u05ed\u05ae\u05a3\u05ac\u05a5\u05ed\u058d\u05a0\u05a8\u05a7\u05a1\u05b6\u05f9", "\u050c\u0517\u052b\u050c\u050a\u0511\u0516\u051f\u0544\u0546\u0550\u0551\u0534\u0512\u0519\u050e\u0519\u0557\u0514\u0519\u0516\u051f\u0557\u052b\u050c\u050a\u0511\u0516\u051f\u0543", "\u0280\u0281\u029a\u0287\u0288\u0297\u02d2\u02d0\u02c6\u02c7\u02b8", "\u03a3\u03a2\u03b9\u03a4\u03ab\u03b4\u038c\u03a1\u03a1\u03f1\u03f3\u03e5\u03e4\u039b", "\u05ae\u05b8\u05b0\u05ad\u05e5\u05e7\u05f1\u05f0\u058f", "\u06fd\u06eb\u06e3\u06fe\u06b6\u06b4\u06a2\u06c0\u06a3\u06dc", "\u0085\u0093\u009b\u0086\u00c2\u00ce\u00cc\u00da\u00b8\u00db\u00a4", "\u02ca\u02dc\u02d4\u02c9\u0281\u0283\u0295\u02f7\u02f4\u0294\u02eb", "\u0513\u051c\u051b\u0514\u0519\u051c\u050f\u0510\u0549\u054b\u055d\u055c\u0523"})
public final class Class1726 {
    public static float field6377;
    public static float field6378 = 0.25677657f;

    private static String S7jvSEfv0dpyanlt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aq\u200e = "Horse";
        field6377 = Float.intBitsToFloat(1050409712);
        aI\u200e = "ExtraTab";
        be\u200e = "Allow you to mine down";
        bq\u200e = "Automatically disables when you jumping";
        bs\u200e = "LogOnArrival";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite LJDhEgcWz4jxDV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1726.S7jvSEfv0dpyanlt(k2, -393050560));
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
                int a2 = Integer.parseInt(Class1726.S7jvSEfv0dpyanlt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1726.S7jvSEfv0dpyanlt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1726.S7jvSEfv0dpyanlt(k2, -393050560) + " " + l2 + " " + m2);
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

