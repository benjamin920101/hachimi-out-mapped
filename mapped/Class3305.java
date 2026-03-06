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
@HACHIMI_CLIENT(mv=100, d1={"\ubf6a\ubf6e\ubf6e\ubf6f\ubf6f\ubf69\ubf6d\ubf69", "\ua892\ua891\ua89d\ua890\ua890\ua890\ua896", "\ue296\ue29a\ue292\ue290\ue29b\ue296\ue295\ue290", "\u8495\u8497\u8493\u8498\u8497\u8493\u8494\u8493", "\uad84\uad8b\uad85\uad8a\uad87\uad85\uad83\uad81", "\u1ccb\u1cca\u1cce\u1cc6\u1ccb\u1ccf\u1cc9\u1cc6", "\ubb39\ubb38\ubb3e\ubb3e\ubb3c\ubb32\ubb33\ubb3a", "\uc932\uc93d\uc93d\uc933\uc935\uc937\uc933\uc93c", "\u7acc\u7acc\u7acb\u7ace\u7acd\u7acb\u7ac5", "\u9f36\u9f32\u9f3c\u9f30\u9f35\u9f37\u9f31\u9f3c", "\u862d\u8628\u862d\u862f\u862a\u8629\u862b\u862c", "\u715a\u7150\u715a\u7150\u715f\u715b\u7158\u7159", "\u995f\u995e\u9953\u9958\u9953\u995d\u995b\u9953", "\u983b\u9838\u983c\u983a\u9831\u9830\u9830\u9831", "\u9bc7\u9bc1\u9bcd\u9bc4\u9bc0\u9bc3\u9bc6\u9bc2", "\u57de\u57d9\u57d8\u57d1\u57d9\u57df\u57dc\u57d8"}, d2={"\u06e8\u06c5\u06f4\u268c\u06be\u06bc\u06aa\u06ce\u06e8\u06e3\u06f4\u06e3\u06ad\u06ee\u06e3\u06ec\u06e5\u06ad\u06d1\u06f6\u06f0\u06eb\u06ec\u06e5\u06b9\u06ab\u06ce\u06e8\u06e3\u06f4\u06e3\u06ad\u06ee\u06e3\u06ec\u06e5\u06ad\u06d1\u06f6\u06f0\u06eb\u06ec\u06e5\u06b9", "\u067e\u0653\u0663\u261a\u0628\u062a\u063c\u0658\u067e\u0675\u0662\u0675\u063b\u0678\u0675\u067a\u0673\u063b\u0647\u0660\u0666\u067d\u067a\u0673\u062f\u063d\u0658\u067e\u0675\u0662\u0675\u063b\u0678\u0675\u067a\u0673\u063b\u0647\u0660\u0666\u067d\u067a\u0673\u062f", "\u07e9\u07b6\u07b9\u07bc\u07bb\u07bc\u07a1\u07eb\u07e9\u07eb\u07fd\u07fc\u0783", "\u0293\u02c6\u02c1\u02c6\u02db\u0291\u0293\u0291\u0287\u0286\u02f9", "\u0254\u0256\u0247\u0270\u025f\u0252\u0240\u0240\u020f\u020d\u021b\u021a\u027f\u0259\u0252\u0245\u0252\u021c\u025f\u0252\u025d\u0254\u021c\u0270\u025f\u0252\u0240\u0240\u0208", "\u0759\u0750\u0742\u0759\u0772\u075e\u0755\u0754\u070d\u070f\u0719\u0718\u0778", "\u0517\u0503\u0507\u0513\u051e\u0501\u054e\u054c\u055a\u053e\u0518\u0513\u0504\u0513\u055d\u051e\u0513\u051c\u0515\u055d\u053d\u0510\u0518\u0517\u0511\u0506\u0549\u055b\u0528", "\u0253\u025c\u025f\u025e\u0255\u020c\u020e\u0218\u0219\u027c\u025a\u0251\u0246\u0251\u021f\u025c\u0251\u025e\u0257\u021f\u027f\u0252\u025a\u0255\u0253\u0244\u020b", "\u0368\u0373\u034f\u0368\u036e\u0375\u0372\u037b\u0320\u0322\u0334\u0335\u0350\u0376\u037d\u036a\u037d\u0333\u0370\u037d\u0372\u037b\u0333\u034f\u0368\u036e\u0375\u0372\u037b\u0327", "\u04a4\u04a5\u04be\u04a3\u04ac\u04b3\u04f6\u04f4\u04e2\u04e3\u049c", "\u0425\u0424\u043f\u0422\u042d\u0432\u040a\u0427\u0427\u0477\u0475\u0463\u0462\u041d", "\u03c9\u03df\u03d7\u03ca\u0382\u0380\u0396\u0397\u03e8", "\u022c\u023a\u0232\u022f\u0267\u0265\u0273\u0211\u0272\u020d", "\u0290\u0286\u028e\u0293\u02d7\u02db\u02d9\u02cf\u02ad\u02ce\u02b1", "\u0393\u0385\u038d\u0390\u03d8\u03da\u03cc\u03ae\u03ad\u03cd\u03b2", "\u04b5\u04ba\u04bd\u04b2\u04bf\u04ba\u04a9\u04b6\u04ef\u04ed\u04fb\u04fa\u0485"})
public final class Class3305 {
    public static double field7111;
    public static float field7112;
    public static float field7113;
    public static double field7114;
    public static double field7115;

    /*
     * WARNING - void declaration
     */
    private static CallSite AMymamyoyjT3Ap(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3305.6TtSBcB1sXtQHoaH(k2, -78204466));
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
                int a2 = Integer.parseInt(Class3305.6TtSBcB1sXtQHoaH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3305.6TtSBcB1sXtQHoaH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3305.6TtSBcB1sXtQHoaH(k2, -78204466) + " " + l2 + " " + m2);
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
        field7114 = Double.longBitsToDouble(4601237667291888353L);
        B\u200e = "_";
        M\u200e = "username";
        field7115 = Double.longBitsToDouble(4599090047886451696L);
        field7112 = Float.intBitsToFloat(1042772756);
        field7113 = Float.intBitsToFloat(1069547520);
        field7111 = Double.longBitsToDouble(4602983973115654783L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 6TtSBcB1sXtQHoaH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 35792 : 35791;
            block5: while (true) {
                switch (n2) {
                    case 35792: {
                        n2 = 35790;
                        continue block5;
                    }
                    case 35791: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

