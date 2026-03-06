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

@HACHIMI_CLIENT(mv=100, d1={"\ua230\ua23e\ua232\ua231\ua234\ua232\ua231\ua237", "\u9359\u9352\u935b\u935f\u935a\u9352\u9352\u9353", "\u3f5b\u3f51\u3f5a\u3f5e\u3f5c\u3f5a\u3f51\u3f5d", "\u5ca1\u5caa\u5ca7\u5ca7\u5ca5\u5ca2\u5ca5\u5ca5", "\ud6b4\ud6b6\ud6b2\ud6b7\ud6b6\ud6b7\ud6b6\ud6b2", "\udaa0\udaa3\udaa7\udaa2\udaa2\udaa2\udaa3\udaa0", "\u34b4\u34b5\u34b7\u34b2\u34b2\u34b6\u34b6\u34b4", "\u92b1\u92b0\u92b5\u92b6\u92b0\u92bf\u92b7\u92b0", "\uc74c\uc74b\uc749\uc743\uc74e\uc74d\uc74d\uc74c", "\u2353\u2355\u2356\u2358\u2353\u2356\u2359\u2359", "\u4e07\u4e07\u4e0a\u4e00\u4e06\u4e0b\u4e00\u4e05", "\u2fa0\u2fae\u2fa6\u2fa4\u2fa0\u2fa4\u2fa1\u2fa0", "\ub30d\ub30a\ub30d\ub306\ub307\ub30f\ub30a\ub30a", "\u7a0d\u7a0b\u7a0a\u7a0f\u7a0d\u7a0a\u7a0c\u7a0e"}, d2={"\u0765\u073a\u0735\u0730\u0737\u0730\u072d\u0767\u0765\u0767\u0771\u0770\u070f", "\u0192\u01c7\u01c0\u01c7\u01da\u0190\u0192\u0190\u0186\u0187\u01f8", "\u027f\u027d\u026c\u025b\u0274\u0279\u026b\u026b\u0224\u0226\u0230\u0231\u0254\u0272\u0279\u026e\u0279\u0237\u0274\u0279\u0276\u027f\u0237\u025b\u0274\u0279\u026b\u026b\u0223", "\u00e7\u00ee\u00fc\u00e7\u00cc\u00e0\u00eb\u00ea\u00b3\u00b1\u00a7\u00a6\u00c6", "\u00a0\u00b4\u00b0\u00a4\u00a9\u00b6\u00f9\u00fb\u00ed\u0089\u00af\u00a4\u00b3\u00a4\u00ea\u00a9\u00a4\u00ab\u00a2\u00ea\u008a\u00a7\u00af\u00a0\u00a6\u00b1\u00fe\u00ec\u009f", "\u016e\u0161\u0162\u0163\u0168\u0131\u0133\u0125\u0124\u0141\u0167\u016c\u017b\u016c\u0122\u0161\u016c\u0163\u016a\u0122\u0142\u016f\u0167\u0168\u016e\u0179\u0136", "\u0147\u015c\u0160\u0147\u0141\u015a\u015d\u0154\u010f\u010d\u011b\u011a\u017f\u0159\u0152\u0145\u0152\u011c\u015f\u0152\u015d\u0154\u011c\u0160\u0147\u0141\u015a\u015d\u0154\u0108", "\u0310\u0311\u030a\u0317\u0318\u0307\u0342\u0340\u0356\u0357\u0328", "\u05a7\u05a6\u05bd\u05a0\u05af\u05b0\u0588\u05a5\u05a5\u05f5\u05f7\u05e1\u05e0\u059f", "yogz20&'X", "\u044f\u0459\u0451\u044c\u0404\u0406\u0410\u0472\u0411\u046e", "\u0155\u0143\u014b\u0156\u0112\u011e\u011c\u010a\u0168\u010b\u0174", "\u063b\u062d\u0625\u0638\u0670\u0672\u0664\u0606\u0605\u0665\u061a", "\u0779\u0776\u0771\u077e\u0773\u0776\u0765\u077a\u0723\u0721\u0737\u0736\u0749"})
public final class Class1568 {
    public static float field5874 = Float.intBitsToFloat(-1069547520);

    /*
     * WARNING - void declaration
     */
    private static CallSite yI4Fe6Q7KSSlav(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1568.xvFBob97x4J56jYw(k2, -1209835435));
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
                int a2 = Integer.parseInt(Class1568.xvFBob97x4J56jYw(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1568.xvFBob97x4J56jYw(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1568.xvFBob97x4J56jYw(k2, -1209835435) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String xvFBob97x4J56jYw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

