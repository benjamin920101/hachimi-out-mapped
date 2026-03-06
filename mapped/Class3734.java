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

@HACHIMI_CLIENT(mv=100, d1={"\u5dc0\u5dcb\u5dc0\u5dc2\u5dca\u5dc1\u5dc3\u5dc1", "\u1b14\u1b1d\u1b17\u1b16\u1b14\u1b16\u1b1c\u1b14", "\u3851\u3855\u3850\u3855\u3856\u3855\u3856\u3853", "\u9b32\u9b3a\u9b3b\u9b32\u9b31\u9b35\u9b33\u9b34", "\ua2c2\ua2c3\ua2c2\ua2c9\ua2c0\ua2c0\ua2c7\ua2c5", "\ud0df\ud0d8\ud0da\ud0da\ud0d8\ud0da\ud0d2\ud0df", "\u968c\u9683\u968f\u968b\u968e\u968e\u968f", "\u1221\u122a\u1225\u1225\u1224\u1220\u1221\u1221", "\u9cba\u9cb3\u9cb9\u9cbd\u9cbf\u9cbe\u9cba\u9cbc", "\u46e7\u46e6\u46e1\u46eb\u46e2\u46e7\u46e6\u46e2", "\u6caf\u6ca4\u6caf\u6cac\u6cad\u6caa\u6cae\u6ca8", "\uc429\uc42f\uc428\uc42f\uc422\uc42f\uc42e\uc422", "\ud587\ud584\ud580\ud58c\ud58c\ud587\ud587\ud581", "\ub15d\ub15d\ub15d\ub154\ub15e\ub159\ub15b\ub155", "\ue084\ue086\ue08f\ue086\ue084\ue082\ue081\ue080"}, d2={"\u01d9\u01c6\u01c2\u21a7\u0195\u0197\u0181\u01e5\u01c3\u01c8\u01df\u01c8\u0186\u01c5\u01c8\u01c7\u01ce\u0186\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0192\u0180\u01e5\u01c3\u01c8\u01df\u01c8\u0186\u01c5\u01c8\u01c7\u01ce\u0186\u01fa\u01dd\u01db\u01c0\u01c7\u01ce\u0192", "\u038d\u03d2\u03dd\u03d8\u03df\u03d8\u03c5\u038f\u038d\u038f\u0399\u0398\u03e7", "\u026e\u023b\u023c\u023b\u0226\u026c\u026e\u026c\u027a\u027b\u0204", "\u042a\u0428\u0439\u040e\u0421\u042c\u043e\u043e\u0471\u0473\u0465\u0464\u0401\u0427\u042c\u043b\u042c\u0462\u0421\u042c\u0423\u042a\u0462\u040e\u0421\u042c\u043e\u043e\u0476", "\u00ca\u00c3\u00d1\u00ca\u00e1\u00cd\u00c6\u00c7\u009e\u009c\u008a\u008b\u00eb", "\u0144\u0150\u0154\u0140\u014d\u0152\u011d\u011f\u0109\u016d\u014b\u0140\u0157\u0140\u010e\u014d\u0140\u014f\u0146\u010e\u016e\u0143\u014b\u0144\u0142\u0155\u011a\u0108\u017b", "\u07f1\u07fe\u07fd\u07fc\u07f7\u07ae\u07ac\u07ba\u07bb\u07de\u07f8\u07f3\u07e4\u07f3\u07bd\u07fe\u07f3\u07fc\u07f5\u07bd\u07dd\u07f0\u07f8\u07f7\u07f1\u07e6\u07a9", "\u0776\u076d\u0751\u0776\u0770\u076b\u076c\u0765\u073e\u073c\u072a\u072b\u074e\u0768\u0763\u0774\u0763\u072d\u076e\u0763\u076c\u0765\u072d\u0751\u0776\u0770\u076b\u076c\u0765\u0739", "\u02b3\u02b2\u02a9\u02b4\u02bb\u02a4\u02e1\u02e3\u02f5\u02f4\u028b", "ONUHGX`MM\u001d\u001f\t\bw", "\u0776\u0760\u0768\u0775\u073d\u073f\u0729\u0728\u0757", "\u07ce\u07d8\u07d0\u07cd\u0785\u0787\u0791\u07f3\u0790\u07ef", "\u05fb\u05ed\u05e5\u05f8\u05bc\u05b0\u05b2\u05a4\u05c6\u05a5\u05da", "\u0547\u0551\u0559\u0544\u050c\u050e\u0518\u057a\u0579\u0519\u0566", "\u066d\u0662\u0665\u066a\u0667\u0662\u0671\u066e\u0637\u0635\u0623\u0622\u065d"})
public final class Class3734 {
    public static float field8429;
    public static float field8430;
    public static int field8431 = 1681668324;
    public static float field8432;
    public static int field8433 = 514166489;

    private static String nFV7dVj1RA4O78De(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8432 = Float.intBitsToFloat(1035668272);
        aD\u200e = "Render";
        field8430 = Float.intBitsToFloat(1057325602);
        field8429 = Float.intBitsToFloat(1069547520);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite w9ruy1hUWY2jI4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3734.nFV7dVj1RA4O78De(k2, 1504012311));
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
                int a2 = Integer.parseInt(Class3734.nFV7dVj1RA4O78De(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3734.nFV7dVj1RA4O78De(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3734.nFV7dVj1RA4O78De(k2, 1504012311) + " " + l2 + " " + m2);
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

