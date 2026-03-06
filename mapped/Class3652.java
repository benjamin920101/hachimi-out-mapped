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
@HACHIMI_CLIENT(mv=100, d1={"\ue0a6\ue0a2\ue0a6\ue0ac\ue0ac\ue0a2\ue0a6\ue0a7", "\u6a91\u6a91\u6a94\u6a94\u6a9b\u6a93\u6a94\u6a90", "\u2d96\u2d96\u2d95\u2d93\u2d96\u2d98\u2d94\u2d99", "\u437e\u4373\u437e\u4378\u4373\u437a\u4378", "\u8bbc\u8bbd\u8bb6\u8bb8\u8bbf\u8bb8\u8bbb\u8bb7", "\u10a1\u10a2\u10a6\u10a6\u10a2\u10a4\u10a1\u10a6", "\ue568\ue568\ue56c\ue56c\ue568\ue56b\ue56a\ue56b", "\u7a49\u7a4e\u7a4a\u7a46\u7a49\u7a4c\u7a46\u7a47", "\u69dd\u69d9\u69df\u69df\u69df\u69de\u69da\u69d9", "\u8e98\u8e92\u8e9c\u8e9d\u8e9a\u8e9b\u8e9f\u8e99", "\ua401\ua404\ua400\ua406\ua403\ua406\ua401\ua40c", "\ub7aa\ub7ab\ub7a4\ub7ae\ub7ae\ub7a4\ub7ab\ub7ac", "\ud662\ud663\ud660\ud666\ud66b\ud661\ud661\ud66b", "\u1a81\u1a85\u1a80\u1a83\u1a80\u1a84\u1a80\u1a81", "\u755f\u755e\u7557\u7553\u7557\u7553\u755f"}, d2={"\u03bd\u0386\u0395\u23df\u03ed\u03ef\u03f9\u039d\u03bb\u03b0\u03a7\u03b0\u03fe\u03bd\u03b0\u03bf\u03b6\u03fe\u0382\u03a5\u03a3\u03b8\u03bf\u03b6\u03ea\u03f8\u039d\u03bb\u03b0\u03a7\u03b0\u03fe\u03bd\u03b0\u03bf\u03b6\u03fe\u0382\u03a5\u03a3\u03b8\u03bf\u03b6\u03ea", "\u068c\u06d3\u06dc\u06d9\u06de\u06d9\u06c4\u068e\u068c\u068e\u0698\u0699\u06e6", "\u06b5\u06e0\u06e7\u06e0\u06fd\u06b7\u06b5\u06b7\u06a1\u06a0\u06df", "\u0152\u0150\u0141\u0176\u0159\u0154\u0146\u0146\u0109\u010b\u011d\u011c\u0179\u015f\u0154\u0143\u0154\u011a\u0159\u0154\u015b\u0152\u011a\u0176\u0159\u0154\u0146\u0146\u010e", "\u05ee\u05e7\u05f5\u05ee\u05c5\u05e9\u05e2\u05e3\u05ba\u05b8\u05ae\u05af\u05cf", "\u0633\u0627\u0623\u0637\u063a\u0625\u066a\u0668\u067e\u061a\u063c\u0637\u0620\u0637\u0679\u063a\u0637\u0638\u0631\u0679\u0619\u0634\u063c\u0633\u0635\u0622\u066d\u067f\u060c", "\u02b5\u02ba\u02b9\u02b8\u02b3\u02ea\u02e8\u02fe\u02ff\u029a\u02bc\u02b7\u02a0\u02b7\u02f9\u02ba\u02b7\u02b8\u02b1\u02f9\u0299\u02b4\u02bc\u02b3\u02b5\u02a2\u02ed", "\u0722\u0739\u0705\u0722\u0724\u073f\u0738\u0731\u076a\u0768\u077e\u077f\u071a\u073c\u0737\u0720\u0737\u0779\u073a\u0737\u0738\u0731\u0779\u0705\u0722\u0724\u073f\u0738\u0731\u076d", "\u0189\u0188\u0193\u018e\u0181\u019e\u01db\u01d9\u01cf\u01ce\u01b1", "\u057a\u057b\u0560\u057d\u0572\u056d\u0555\u0578\u0578\u0528\u052a\u053c\u053d\u0542", "\u07ad\u07bb\u07b3\u07ae\u07e6\u07e4\u07f2\u07f3\u078c", "\u0440\u0456\u045e\u0443\u040b\u0409\u041f\u047d\u041e\u0461", "\u0405\u0413\u041b\u0406\u0442\u044e\u044c\u045a\u0438\u045b\u0424", "UCKV\u001e\u001c\nhk\u000bt", "\u079c\u0793\u0794\u079b\u0796\u0793\u0780\u079f\u07c6\u07c4\u07d2\u07d3\u07ac"})
public final class Class3652 {
    public static double field8173;
    public static double field8174;
    public static float field8175;
    public static double field8176;
    public static float field8177;
    public static float field8178;

    static {
        field8177 = Float.intBitsToFloat(1053236304);
        field8175 = Float.intBitsToFloat(1061864757);
        field8176 = Double.longBitsToDouble(4606258530699398497L);
        field8173 = Double.longBitsToDouble(4604802135435614032L);
        field8178 = Float.intBitsToFloat(1058183754);
        field8174 = Double.longBitsToDouble(4588937562204549712L);
        bl\u200e = "The outline pixel quality";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite yn6wDI4pJb1Svt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3652.11y4TZdtSBtzSoVI(k2, 2050973453));
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
                int a2 = Integer.parseInt(Class3652.11y4TZdtSBtzSoVI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3652.11y4TZdtSBtzSoVI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3652.11y4TZdtSBtzSoVI(k2, 2050973453) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 11y4TZdtSBtzSoVI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

