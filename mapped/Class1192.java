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

@HACHIMI_CLIENT(mv=100, d1={"\u2661\u2666\u2667\u2664\u2664\u266c\u2661\u266c", "\u5c9e\u5c93\u5c99\u5c9c\u5c9b\u5c9f\u5c9d\u5c92", "\u0250\u0255\u025c\u0257\u0254\u025d\u0251\u025d", "\ua2de\ua2d4\ua2d4\ua2d9\ua2d9\ua2d5\ua2d4\ua2d4", "\u9ea3\u9ea3\u9ea9\u9ea4\u9ea1\u9ea8\u9ea3\u9ea5", "\u72bc\u72b2\u72bb\u72ba\u72b8\u72b3\u72bd\u72b9", "\ua45b\ua45e\ua45a\ua45b\ua45b\ua45e", "\ue441\ue447\ue447\ue442\ue445\ue44d\ue44d\ue44d", "\u7d30\u7d34\u7d37\u7d31\u7d36\u7d34\u7d3d\u7d37", "\u9867\u9863\u9863\u9865\u9862\u9861\u986a\u986a", "\u2c9b\u2c9a\u2c9d\u2c98\u2c9e\u2c9a\u2c9a\u2c9d", "\uaf25\uaf20\uaf23\uaf21\uaf21\uaf27\uaf2d\uaf2d", "\u594c\u594e\u5949\u594e\u594e\u594e\u594c\u594c", "\u68a7\u68a6\u68a9\u68a1\u68a3\u68a7\u68a2\u68a4"}, d2={"\u014f\u0110\u011f\u011a\u011d\u011a\u0107\u014d\u014f\u014d\u015b\u015a\u0125", "r' ':prpfg\u0018", "DFW`OBPP\u001f\u001d\u000b\noIBUB\fOBMD\f`OBPP\u0018", "\u06b5\u06bc\u06ae\u06b5\u069e\u06b2\u06b9\u06b8\u06e1\u06e3\u06f5\u06f4\u0694", "\u0300\u0314\u0310\u0304\u0309\u0316\u0359\u035b\u034d\u0329\u030f\u0304\u0313\u0304\u034a\u0309\u0304\u030b\u0302\u034a\u032a\u0307\u030f\u0300\u0306\u0311\u035e\u034c\u033f", "\u05fd\u05f2\u05f1\u05f0\u05fb\u05a2\u05a0\u05b6\u05b7\u05d2\u05f4\u05ff\u05e8\u05ff\u05b1\u05f2\u05ff\u05f0\u05f9\u05b1\u05d1\u05fc\u05f4\u05fb\u05fd\u05ea\u05a5", "\u02cf\u02d4\u02e8\u02cf\u02c9\u02d2\u02d5\u02dc\u0287\u0285\u0293\u0292\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02e8\u02cf\u02c9\u02d2\u02d5\u02dc\u0280", "\u06dd\u06dc\u06c7\u06da\u06d5\u06ca\u068f\u068d\u069b\u069a\u06e5", "\u02b7\u02b6\u02ad\u02b0\u02bf\u02a0\u0298\u02b5\u02b5\u02e5\u02e7\u02f1\u02f0\u028f", "\u0749\u075f\u0757\u074a\u0702\u0700\u0716\u0717\u0768", "\u05f5\u05e3\u05eb\u05f6\u05be\u05bc\u05aa\u05c8\u05ab\u05d4", "\u0465\u0473\u047b\u0466\u0422\u042e\u042c\u043a\u0458\u043b\u0444", "\u0146\u0150\u0158\u0145\u010d\u010f\u0119\u017b\u0178\u0118\u0167", "\u0593\u059c\u059b\u0594\u0599\u059c\u058f\u0590\u05c9\u05cb\u05dd\u05dc\u05a3"})
public final class Class1192 {
    public static float field4716 = Float.intBitsToFloat(1057772849);
    public static double field4717;
    public static double field4718;

    /*
     * WARNING - void declaration
     */
    private static CallSite i19ITjSCaP0gPr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1192.wlSvLg9DeFayHasQ(k2, -934565541));
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
                int a2 = Integer.parseInt(Class1192.wlSvLg9DeFayHasQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1192.wlSvLg9DeFayHasQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1192.wlSvLg9DeFayHasQ(k2, -934565541) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String wlSvLg9DeFayHasQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4718 = Double.longBitsToDouble(4595447504436421256L);
        field4717 = Double.longBitsToDouble(4598469762637347368L);
    }
}

