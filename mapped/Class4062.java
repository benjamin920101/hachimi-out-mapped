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

@HACHIMI_CLIENT(mv=100, d1={"\ud997\ud997\ud994\ud993\ud994\ud992\ud995\ud992", "\u7c73\u7c71\u7c75\u7c71\u7c71\u7c74\u7c77", "\ud7f9\ud7fe\ud7fe\ud7f3\ud7f3\ud7f3\ud7fb", "\u804f\u804c\u8048\u8041\u8041\u804b\u804d\u804e", "\u909f\u9094\u9095\u9094\u909b\u909f\u909d\u9098", "\u72ac\u72af\u72a7\u72ad\u72af\u72ac\u72ae\u72ad", "\u779c\u779c\u779a\u779c\u7790\u7799\u7791\u779f", "\uc053\uc051\uc054\uc059\uc055\uc053\uc054\uc054", "\ua7ae\ua7a8\ua7a6\ua7ae\ua7af\ua7af\ua7ae\ua7ae", "\u12f1\u12f4\u12fb\u12f2\u12f4\u12fa\u12f1\u12f1", "\uc645\uc644\uc64b\uc64b\uc645\uc641\uc641\uc645", "\ua341\ua341\ua343\ua345\ua347\ua346\ua347\ua340", "\u80f8\u80f2\u80fd\u80f3\u80f3\u80fa\u80fa\u80fb", "\ue3dc\ue3d1\ue3d1\ue3d8\ue3df\ue3dd\ue3dd\ue3db", "\u7090\u7093\u7092\u709d\u7093\u7093\u7090\u709d", "\u169c\u1698\u1699\u169a\u1698\u169e\u1698\u169e", "\u8dad\u8dac\u8da1\u8da0\u8dac\u8da8\u8daa\u8da0"}, d2={"\u00c6\u00cc\u00c0\u20bb\u0089\u008b\u009d\u00f9\u00df\u00d4\u00c3\u00d4\u009a\u00d9\u00d4\u00db\u00d2\u009a\u00e6\u00c1\u00c7\u00dc\u00db\u00d2\u008e\u009c\u00f9\u00df\u00d4\u00c3\u00d4\u009a\u00d9\u00d4\u00db\u00d2\u009a\u00e6\u00c1\u00c7\u00dc\u00db\u00d2\u008e", "\u03bb\u03b1\u03be\u23c6\u03f4\u03f6\u03e0\u0384\u03a2\u03a9\u03be\u03a9\u03e7\u03a4\u03a9\u03a6\u03af\u03e7\u039b\u03bc\u03ba\u03a1\u03a6\u03af\u03f3\u03e1\u0384\u03a2\u03a9\u03be\u03a9\u03e7\u03a4\u03a9\u03a6\u03af\u03e7\u039b\u03bc\u03ba\u03a1\u03a6\u03af\u03f3", "\u02ad\u02a7\u02a9\u22d0\u02e2\u02e0\u02f6\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5\u02f7\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5", "\u0343\u031c\u0313\u0316\u0311\u0316\u030b\u0341\u0343\u0341\u0357\u0356\u0329", "\u0567\u0532\u0535\u0532\u052f\u0565\u0567\u0565\u0573\u0572\u050d", "\u0544\u0546\u0557\u0560\u054f\u0542\u0550\u0550\u051f\u051d\u050b\u050a\u056f\u0549\u0542\u0555\u0542\u050c\u054f\u0542\u054d\u0544\u050c\u0560\u054f\u0542\u0550\u0550\u0518", "\u055f\u0556\u0544\u055f\u0574\u0558\u0553\u0552\u050b\u0509\u051f\u051e\u057e", "\u06d7\u06c3\u06c7\u06d3\u06de\u06c1\u068e\u068c\u069a\u06fe\u06d8\u06d3\u06c4\u06d3\u069d\u06de\u06d3\u06dc\u06d5\u069d\u06fd\u06d0\u06d8\u06d7\u06d1\u06c6\u0689\u069b\u06e8", "\u0698\u0697\u0694\u0695\u069e\u06c7\u06c5\u06d3\u06d2\u06b7\u0691\u069a\u068d\u069a\u06d4\u0697\u069a\u0695\u069c\u06d4\u06b4\u0699\u0691\u069e\u0698\u068f\u06c0", "\u06fa\u06e1\u06dd\u06fa\u06fc\u06e7\u06e0\u06e9\u06b2\u06b0\u06a6\u06a7\u06c2\u06e4\u06ef\u06f8\u06ef\u06a1\u06e2\u06ef\u06e0\u06e9\u06a1\u06dd\u06fa\u06fc\u06e7\u06e0\u06e9\u06b5", "\u021e\u021f\u0204\u0219\u0216\u0209\u024c\u024e\u0258\u0259\u0226", "\u0297\u0296\u028d\u0290\u029f\u0280\u02b8\u0295\u0295\u02c5\u02c7\u02d1\u02d0\u02af", "\u02be\u02a8\u02a0\u02bd\u02f5\u02f7\u02e1\u02e0\u029f", "\u000e\u0018\u0010\rEGQ3P/", "\u030e\u0318\u0310\u030d\u0349\u0345\u0347\u0351\u0333\u0350\u032f", "\u05a4\u05b2\u05ba\u05a7\u05ef\u05ed\u05fb\u0599\u059a\u05fa\u0585", "\u046c\u0463\u0464\u046b\u0466\u0463\u0470\u046f\u0436\u0434\u0422\u0423\u045c"})
public final class Class4062 {
    public static int field9373 = 1;
    public static float field9374;

    private static String b2OzJQ7fpnoBAWyR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        h\u200e = "Ordering";
        A\u200e = "Gear";
        field9374 = Float.intBitsToFloat(1058282052);
        aH\u200e = "Range";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite HFMoEbNNRb2rEm(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4062.b2OzJQ7fpnoBAWyR(k2, -1964290931));
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
                int a2 = Integer.parseInt(Class4062.b2OzJQ7fpnoBAWyR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4062.b2OzJQ7fpnoBAWyR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4062.b2OzJQ7fpnoBAWyR(k2, -1964290931) + " " + l2 + " " + m2);
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

