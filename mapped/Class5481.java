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

@HACHIMI_CLIENT(mv=100, d1={"\u603e\u603f\u603c\u603e\u603c\u603f\u603c\u603b", "\u101a\u1018\u101c\u101b\u1019\u1019\u101f\u1012", "\u329e\u329a\u329c\u329d\u3293\u329b\u329b\u329f", "\ub6c0\ub6cb\ub6c7\ub6ca\ub6c5\ub6c3\ub6c2\ub6c4", "\ub2a8\ub2af\ub2af\ub2a9\ub2ac\ub2ab\ub2ab\ub2a2", "\ub2cd\ub2c1\ub2c8\ub2c9\ub2c1\ub2ca\ub2c8\ub2cf", "\u20e1\u20e4\u20e7\u20e7\u20e8\u20e5\u20e3\u20e6", "\u1e81\u1e86\u1e86\u1e86\u1e84\u1e84\u1e83\u1e82", "\ua9f4\ua9f6\ua9f7\ua9f6\ua9f4\ua9f6\ua9f7\ua9f4", "\u2dca\u2dcc\u2dc8\u2dcc\u2dc9\u2dca\u2dc0\u2dc0", "\u72fc\u72f1\u72fb\u72fe\u72ff\u72f8\u72fa\u72f8", "\u80b3\u80b9\u80b3\u80b7\u80b3\u80b8\u80b0\u80b4", "\u0ede\u0edc\u0edb\u0edf\u0ed5\u0ed8\u0ed5\u0ed5", "\ud0a9\ud0af\ud0ae\ud0af\ud0ab\ud0a4\ud0ac\ud0a9", "\ud2bf\ud2bc\ud2ba\ud2bb\ud2b1\ud2ba\ud2bf\ud2b0", "\u33a1\u33a9\u33a7\u33a8\u33a6\u33a1\u33a2\u33a4", "\ue850\ue856\ue85e\ue850\ue851\ue857\ue85f\ue857"}, d2={"\u0400\u0403\u041f\u247c\u044e\u044c\u045a\u043e\u0418\u0413\u0404\u0413\u045d\u041e\u0413\u041c\u0415\u045d\u0421\u0406\u0400\u041b\u041c\u0415\u0449\u045b\u043e\u0418\u0413\u0404\u0413\u045d\u041e\u0413\u041c\u0415\u045d\u0421\u0406\u0400\u041b\u041c\u0415\u0449", "\u02b1\u02b2\u02ad\u22cd\u02ff\u02fd\u02eb\u028f\u02a9\u02a2\u02b5\u02a2\u02ec\u02af\u02a2\u02ad\u02a4\u02ec\u0290\u02b7\u02b1\u02aa\u02ad\u02a4\u02f8\u02ea\u028f\u02a9\u02a2\u02b5\u02a2\u02ec\u02af\u02a2\u02ad\u02a4\u02ec\u0290\u02b7\u02b1\u02aa\u02ad\u02a4\u02f8", "\u0311\u0312\u030c\u236d\u035f\u035d\u034b\u032f\u0309\u0302\u0315\u0302\u034c\u030f\u0302\u030d\u0304\u034c\u0330\u0317\u0311\u030a\u030d\u0304\u0358\u034a\u032f\u0309\u0302\u0315\u0302\u034c\u030f\u0302\u030d\u0304\u034c\u0330\u0317\u0311\u030a\u030d\u0304\u0358", "\u05a1\u05fe\u05f1\u05f4\u05f3\u05f4\u05e9\u05a3\u05a1\u05a3\u05b5\u05b4\u05cb", "\u042f\u047a\u047d\u047a\u0467\u042d\u042f\u042d\u043b\u043a\u0445", "\u00ff\u00fd\u00ec\u00db\u00f4\u00f9\u00eb\u00eb\u00a4\u00a6\u00b0\u00b1\u00d4\u00f2\u00f9\u00ee\u00f9\u00b7\u00f4\u00f9\u00f6\u00ff\u00b7\u00db\u00f4\u00f9\u00eb\u00eb\u00a3", "\u0729\u0720\u0732\u0729\u0702\u072e\u0725\u0724\u077d\u077f\u0769\u0768\u0708", "\u07d2\u07c6\u07c2\u07d6\u07db\u07c4\u078b\u0789\u079f\u07fb\u07dd\u07d6\u07c1\u07d6\u0798\u07db\u07d6\u07d9\u07d0\u0798\u07f8\u07d5\u07dd\u07d2\u07d4\u07c3\u078c\u079e\u07ed", "\u0451\u045e\u045d\u045c\u0457\u040e\u040c\u041a\u041b\u047e\u0458\u0453\u0444\u0453\u041d\u045e\u0453\u045c\u0455\u041d\u047d\u0450\u0458\u0457\u0451\u0446\u0409", "TOsTRING\u001c\u001e\b\tlJAVA\u000fLANG\u000fsTRING\u001b", "\u052f\u052e\u0535\u0528\u0527\u0538\u057d\u057f\u0569\u0568\u0517", "\u0380\u0381\u039a\u0387\u0388\u0397\u03af\u0382\u0382\u03d2\u03d0\u03c6\u03c7\u03b8", "\u01df\u01c9\u01c1\u01dc\u0194\u0196\u0180\u0181\u01fe", "/91,dfp\u0012q\u000e", "\u02dc\u02ca\u02c2\u02df\u029b\u0297\u0295\u0283\u02e1\u0282\u02fd", "\u02a8\u02be\u02b6\u02ab\u02e3\u02e1\u02f7\u0295\u0296\u02f6\u0289", "\u0710\u071f\u0718\u0717\u071a\u071f\u070c\u0713\u074a\u0748\u075e\u075f\u0720"})
public final class Class5481 {
    public static double field10275;
    public static float field10276;
    public static double field10277;
    public static float field10278;
    public static float field10279 = 0.48713732f;

    static {
        m\u200e = "speed";
        field10278 = Float.intBitsToFloat(1059189804);
        K\u200e = "list";
        field10277 = Double.longBitsToDouble(4606693218984141422L);
        field10276 = Float.intBitsToFloat(1064994675);
        bO\u200e = "Minimum ticks alive to consider crystals for attack";
        field10275 = Double.longBitsToDouble(4592966219772442816L);
    }

    private static String Enl2LnnqbNxJJgCJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite g1QqT8vFrHC4QG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5481.Enl2LnnqbNxJJgCJ(k2, -1743074994));
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
                int a2 = Integer.parseInt(Class5481.Enl2LnnqbNxJJgCJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5481.Enl2LnnqbNxJJgCJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5481.Enl2LnnqbNxJJgCJ(k2, -1743074994) + " " + l2 + " " + m2);
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

