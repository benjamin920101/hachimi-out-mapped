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

@HACHIMI_CLIENT(mv=100, d1={"\uc1ac\uc1a0\uc1ad\uc1a1\uc1ae\uc1ad\uc1ad\uc1ae", "\uc0de\uc0db\uc0dd\uc0d5\uc0dc\uc0de\uc0da\uc0d9", "\u6c98\u6c99\u6c9f\u6c9f\u6c99\u6c9b\u6c94\u6c9c", "\u777e\u7778\u7778\u777f\u777b\u7778\u777c\u777e", "\ua1e7\ua1e1\ua1ef\ua1e6\ua1ee\ua1e3\ua1e5\ua1e6", "\u364e\u3642\u3643\u364b\u364a\u3648\u364e\u3649", "\u813e\u813a\u8138\u813a\u813a\u813d\u813a\u8139", "\u2ad5\u2ade\u2ad7\u2ad0\u2ad3\u2ad0\u2ade\u2ade", "\u1419\u141f\u1419\u141f\u141f\u1413\u141d\u1419", "\u5589\u558b\u5582\u5583\u558d\u558b\u558a\u558a", "\u1b85\u1b81\u1b86\u1b87\u1b82\u1b8a\u1b87\u1b82", "\ub52c\ub52c\ub528\ub529\ub52d\ub525\ub52b\ub52b", "\u6341\u6342\u6341\u6342\u6340\u6345\u6340\u6340", "\u86fe\u86fe\u86fb\u86fc\u86fc\u86f8\u86fe\u86f9", "\u57e3\u57e2\u57ea\u57e2\u57e0\u57e0\u57eb\u57eb", "\u6147\u614f\u614f\u6141\u6140\u6143\u6142\u6143"}, d2={"\u07e8\u07eb\u07e5\u278a\u07b8\u07ba\u07ac\u07c8\u07ee\u07e5\u07f2\u07e5\u07ab\u07e8\u07e5\u07ea\u07e3\u07ab\u07d7\u07f0\u07f6\u07ed\u07ea\u07e3\u07bf\u07ad\u07c8\u07ee\u07e5\u07f2\u07e5\u07ab\u07e8\u07e5\u07ea\u07e3\u07ab\u07d7\u07f0\u07f6\u07ed\u07ea\u07e3\u07bf", "\u041d\u041e\u0413\u247f\u044d\u044f\u0459\u043d\u041b\u0410\u0407\u0410\u045e\u041d\u0410\u041f\u0416\u045e\u0422\u0405\u0403\u0418\u041f\u0416\u044a\u0458\u043d\u041b\u0410\u0407\u0410\u045e\u041d\u0410\u041f\u0416\u045e\u0422\u0405\u0403\u0418\u041f\u0416\u044a", "\u04aa\u04f5\u04fa\u04ff\u04f8\u04ff\u04e2\u04a8\u04aa\u04a8\u04be\u04bf\u04c0", "\u032a\u037f\u0378\u037f\u0362\u0328\u032a\u0328\u033e\u033f\u0340", "\u0171\u0173\u0162\u0155\u017a\u0177\u0165\u0165\u012a\u0128\u013e\u013f\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0155\u017a\u0177\u0165\u0165\u012d", "\u02bc\u02b5\u02a7\u02bc\u0297\u02bb\u02b0\u02b1\u02e8\u02ea\u02fc\u02fd\u029d", "\u075a\u074e\u074a\u075e\u0753\u074c\u0703\u0701\u0717\u0773\u0755\u075e\u0749\u075e\u0710\u0753\u075e\u0751\u0758\u0710\u0770\u075d\u0755\u075a\u075c\u074b\u0704\u0716\u0765", "\u050c\u0503\u0500\u0501\u050a\u0553\u0551\u0547\u0546\u0523\u0505\u050e\u0519\u050e\u0540\u0503\u050e\u0501\u0508\u0540\u0520\u050d\u0505\u050a\u050c\u051b\u0554", "\u0425\u043e\u0402\u0425\u0423\u0438\u043f\u0436\u046d\u046f\u0479\u0478\u041d\u043b\u0430\u0427\u0430\u047e\u043d\u0430\u043f\u0436\u047e\u0402\u0425\u0423\u0438\u043f\u0436\u046a", "\u00f2\u00f3\u00e8\u00f5\u00fa\u00e5\u00a0\u00a2\u00b4\u00b5\u00ca", "\u053c\u053d\u0526\u053b\u0534\u052b\u0513\u053e\u053e\u056e\u056c\u057a\u057b\u0504", "\u0337\u0321\u0329\u0334\u037c\u037e\u0368\u0369\u0316", "\u0715\u0703\u070b\u0716\u075e\u075c\u074a\u0728\u074b\u0734", "\u03d3\u03c5\u03cd\u03d0\u0394\u0398\u039a\u038c\u03ee\u038d\u03f2", "\u07d8\u07ce\u07c6\u07db\u0793\u0791\u0787\u07e5\u07e6\u0786\u07f9", "\u04c6\u04c9\u04ce\u04c1\u04cc\u04c9\u04da\u04c5\u049c\u049e\u0488\u0489\u04f6"})
public final class Class1250 {
    public static float field4895 = Float.intBitsToFloat(1001380992);
    public static double field4896 = 0.3207011721889148;
    public static double field4897 = 0.11446069160284222;
    public static double field4898;
    public static float field4899;

    /*
     * WARNING - void declaration
     */
    private static CallSite Qzj4wxviIT1ro1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1250.S2loRnt0QrYAd22i(k2, -2104799705));
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
                int a2 = Integer.parseInt(Class1250.S2loRnt0QrYAd22i(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1250.S2loRnt0QrYAd22i(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1250.S2loRnt0QrYAd22i(k2, -2104799705) + " " + l2 + " " + m2);
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
        aA\u200e = "Fixes jumping slowdown in Rage sprint";
        field4898 = Double.longBitsToDouble(4581908474616874688L);
        field4899 = Float.intBitsToFloat(1049907356);
        bv\u200e = "Time after waiting for the average break time before considering a crystal attack failed";
    }

    private static String S2loRnt0QrYAd22i(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

