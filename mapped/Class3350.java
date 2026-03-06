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
@HACHIMI_CLIENT(mv=100, d1={"\u82de\u82d7\u82df\u82d1\u82d6\u82d0\u82d2", "\u7919\u791b\u791c\u791f\u7915\u791c\u791e\u7914", "\u27da\u27de\u27db\u27db\u27dc\u27dc\u27d9\u27d8", "\u4bfd\u4bfa\u4bfd\u4bfc\u4bfa\u4bfc\u4bfd\u4bf6", "\uaf84\uaf83\uaf82\uaf80\uaf82\uaf87\uaf8b", "\uacd5\uacd6\uacd0\uacd6\uacda\uacd4\uacd1", "\u5c98\u5c9b\u5c96\u5c9d\u5c9a\u5c9c\u5c9f\u5c9f", "\u2bfa\u2bf9\u2bfd\u2bf8\u2bfc\u2bf9\u2bf2\u2bfe", "\u45e3\u45e3\u45e0\u45e3\u45e2\u45e6\u45ef\u45e1", "\uc050\uc057\uc056\uc053\uc050\uc05f\uc053\uc053", "\u074b\u074b\u074b\u074e\u074f\u074b\u074a\u0748", "\u8b5b\u8b58\u8b5a\u8b5b\u8b59\u8b58\u8b50\u8b5f", "\u2100\u2100\u210b\u2100\u2105\u210b\u2104\u2106", "\ua70a\ua70b\ua70a\ua709\ua708\ua70c\ua700\ua709", "\uc373\uc373\uc371\uc376\uc373\uc376\uc377\uc376", "\u662b\u662f\u662f\u6626\u662b\u6628\u662e\u662b"}, d2={"\u020c\u020d\u2265\u0257\u0255\u0243\u0227\u0201\u020a\u021d\u020a\u0244\u0207\u020a\u0205\u020c\u0244\u0238\u021f\u0219\u0202\u0205\u020c\u0250\u0242\u0227\u0201\u020a\u021d\u020a\u0244\u0207\u020a\u0205\u020c\u0244\u0238\u021f\u0219\u0202\u0205\u020c\u0250", "\u0394\u0394\u23fd\u03cf\u03cd\u03db\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8\u03da\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8", "\u0513\u054c\u0543\u0546\u0541\u0546\u055b\u0511\u0513\u0511\u0507\u0506\u0579", "\u0721\u0774\u0773\u0774\u0769\u0723\u0721\u0723\u0735\u0734\u074b", "\u03ad\u03af\u03be\u0389\u03a6\u03ab\u03b9\u03b9\u03f6\u03f4\u03e2\u03e3\u0386\u03a0\u03ab\u03bc\u03ab\u03e5\u03a6\u03ab\u03a4\u03ad\u03e5\u0389\u03a6\u03ab\u03b9\u03b9\u03f1", "\u0105\u010c\u011e\u0105\u012e\u0102\u0109\u0108\u0151\u0153\u0145\u0144\u0124", "\u06c1\u06d5\u06d1\u06c5\u06c8\u06d7\u0698\u069a\u068c\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06eb\u06c6\u06ce\u06c1\u06c7\u06d0\u069f\u068d\u06fe", "\u0300\u030f\u030c\u030d\u0306\u035f\u035d\u034b\u034a\u032f\u0309\u0302\u0315\u0302\u034c\u030f\u0302\u030d\u0304\u034c\u032c\u0301\u0309\u0306\u0300\u0317\u0358", "\u0403\u0418\u0424\u0403\u0405\u041e\u0419\u0410\u044b\u0449\u045f\u045e\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c", "\u0588\u0589\u0592\u058f\u0580\u059f\u05da\u05d8\u05ce\u05cf\u05b0", "\u062a\u062b\u0630\u062d\u0622\u063d\u0605\u0628\u0628\u0678\u067a\u066c\u066d\u0612", "\u0475\u0463\u046b\u0476\u043e\u043c\u042a\u042b\u0454", "\u0152\u0144\u014c\u0151\u0119\u011b\u010d\u016f\u010c\u0173", "\u0384\u0392\u039a\u0387\u03c3\u03cf\u03cd\u03db\u03b9\u03da\u03a5", "\u02bc\u02aa\u02a2\u02bf\u02f7\u02f5\u02e3\u0281\u0282\u02e2\u029d", "\u0141\u014e\u0149\u0146\u014b\u014e\u015d\u0142\u011b\u0119\u010f\u010e\u0171"})
public final class Class3350 {
    public static double field7249;
    public static float field7250;
    public static float field7251;
    public static double field7252;
    public static float field7253;
    public static int field7254 = 259543893;
    public static int field7255 = 1733344832;
    public static int field7256 = 0;

    static {
        field7253 = Float.intBitsToFloat(1050640720);
        x\u200e = "Prevents player from walking into sweet berry bushes";
        field7252 = Double.longBitsToDouble(0x4004000000000000L);
        ac\u200e = "Shows the contents of held shulkers";
        field7250 = Float.intBitsToFloat(1062455795);
        field7251 = Float.intBitsToFloat(1051214326);
        field7249 = Double.longBitsToDouble(4592561928834688880L);
    }

    private static String 9gXiwcSqiCXJry17(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite gbnJaj8OBifrdg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3350.9gXiwcSqiCXJry17(k2, 449400852));
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
                int a2 = Integer.parseInt(Class3350.9gXiwcSqiCXJry17(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3350.9gXiwcSqiCXJry17(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3350.9gXiwcSqiCXJry17(k2, 449400852) + " " + l2 + " " + m2);
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

