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

@HACHIMI_CLIENT(mv=100, d1={"\u337b\u337e\u337e\u3375\u337c\u337a\u3375\u337c", "\u79d2\u79d5\u79d2\u79d7\u79d7\u79de\u79d5\u79d3", "\uca19\uca1b\uca17\uca1c\uca16\uca1e\uca1a", "\u03d7\u03de\u03d4\u03de\u03d2\u03df\u03df\u03d1", "\u9d87\u9d85\u9d8c\u9d81\u9d81\u9d8d\u9d8d\u9d85", "\u1d2b\u1d2c\u1d29\u1d24\u1d2e\u1d28\u1d25\u1d2b", "\u69f6\u69f4\u69f6\u69f5\u69f2\u69fc\u69fd\u69fd", "\u6ecf\u6ece\u6ec8\u6ecd\u6ec0\u6ec8\u6ecd\u6ec1", "\u3caf\u3caa\u3cae\u3cad\u3ca8\u3cac\u3ca9\u3caa", "\u32dd\u32df\u32db\u32d2\u32dd\u32d8\u32dd\u32dc", "\u17cf\u17c6\u17c1\u17c2\u17c3\u17c3\u17c3", "\u44ed\u44e3\u44ee\u44eb\u44e3\u44ea\u44ec\u44ec", "\u0eb0\u0eb2\u0ebd\u0ebd\u0eb0\u0eb5\u0ebc\u0ebd", "\u1b75\u1b77\u1b7e\u1b76\u1b73\u1b70\u1b7f", "\u1735\u1737\u1737\u1732\u1738\u1731\u1733\u1731"}, d2={"\u00cf\u00c7\u00c0\u20ab\u0099\u009b\u008d\u00e9\u00cf\u00c4\u00d3\u00c4\u008a\u00c9\u00c4\u00cb\u00c2\u008a\u00f6\u00d1\u00d7\u00cc\u00cb\u00c2\u009e\u008c\u00e9\u00cf\u00c4\u00d3\u00c4\u008a\u00c9\u00c4\u00cb\u00c2\u008a\u00f6\u00d1\u00d7\u00cc\u00cb\u00c2\u009e", "\u0431\u046e\u0461\u0464\u0463\u0464\u0479\u0433\u0431\u0433\u0425\u0424\u045b", "\u07b7\u07e2\u07e5\u07e2\u07ff\u07b5\u07b7\u07b5\u07a3\u07a2\u07dd", "\u03db\u03d9\u03c8\u03ff\u03d0\u03dd\u03cf\u03cf\u0380\u0382\u0394\u0395\u03f0\u03d6\u03dd\u03ca\u03dd\u0393\u03d0\u03dd\u03d2\u03db\u0393\u03ff\u03d0\u03dd\u03cf\u03cf\u0387", "\u05af\u05a6\u05b4\u05af\u0584\u05a8\u05a3\u05a2\u05fb\u05f9\u05ef\u05ee\u058e", "\u0233\u0227\u0223\u0237\u023a\u0225\u026a\u0268\u027e\u021a\u023c\u0237\u0220\u0237\u0279\u023a\u0237\u0238\u0231\u0279\u0219\u0234\u023c\u0233\u0235\u0222\u026d\u027f\u020c", "\u018b\u0184\u0187\u0186\u018d\u01d4\u01d6\u01c0\u01c1\u01a4\u0182\u0189\u019e\u0189\u01c7\u0184\u0189\u0186\u018f\u01c7\u01a7\u018a\u0182\u018d\u018b\u019c\u01d3", "\u076c\u0777\u074b\u076c\u076a\u0771\u0776\u077f\u0724\u0726\u0730\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u074b\u076c\u076a\u0771\u0776\u077f\u0723", "\u0339\u0338\u0323\u033e\u0331\u032e\u036b\u0369\u037f\u037e\u0301", "\u0241\u0240\u025b\u0246\u0249\u0256\u026e\u0243\u0243\u0213\u0211\u0207\u0206\u0279", "\u00e0\u00f6\u00fe\u00e3\u00ab\u00a9\u00bf\u00be\u00c1", "\u052b\u053d\u0535\u0528\u0560\u0562\u0574\u0516\u0575\u050a", "\u06d2\u06c4\u06cc\u06d1\u0695\u0699\u069b\u068d\u06ef\u068c\u06f3", "\u0781\u0797\u079f\u0782\u07ca\u07c8\u07de\u07bc\u07bf\u07df\u07a0", "\u07bb\u07b4\u07b3\u07bc\u07b1\u07b4\u07a7\u07b8\u07e1\u07e3\u07f5\u07f4\u078b"})
public final class Class460 {
    public static float field2423;
    public static float field2424;
    public static String field2425;
    public static double field2426;
    public static double field2427 = 0.2510153770721387;

    /*
     * WARNING - void declaration
     */
    private static CallSite I7aw4rj7idvWll(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class460.dPV7OKNe3oF2rq9S(k2, -1876094795));
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
                int a2 = Integer.parseInt(Class460.dPV7OKNe3oF2rq9S(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class460.dPV7OKNe3oF2rq9S(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class460.dPV7OKNe3oF2rq9S(k2, -1876094795) + " " + l2 + " " + m2);
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
        field2426 = Double.longBitsToDouble(4601225459133774516L);
        field2424 = Float.intBitsToFloat(1026240368);
        field2423 = Float.intBitsToFloat(1053380242);
        field2425 = "-Djavax.net.ssl.trustStorePassword";
    }

    private static String dPV7OKNe3oF2rq9S(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

