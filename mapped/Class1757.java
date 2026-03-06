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

@HACHIMI_CLIENT(mv=100, d1={"\ud0d5\ud0d8\ud0d2\ud0d4\ud0d0\ud0d6\ud0d6\ud0d1", "\u7936\u7932\u7937\u7936\u7930\u7934\u7930", "\u5e01\u5e02\u5e07\u5e0c\u5e04\u5e07\u5e05", "\u313b\u313c\u3130\u313e\u3130\u313d\u3139\u313c", "\ud4e6\ud4ec\ud4e7\ud4e1\ud4e7\ud4ec\ud4ec\ud4e4", "\ue3cf\ue3c0\ue3c8\ue3c8\ue3cf\ue3cf\ue3c8", "\u5647\u5647\u5645\u5640\u5643\u5640\u5641\u5647", "\ua763\ua761\ua760\ua76f\ua762\ua766\ua767\ua762", "\u2b00\u2b05\u2b05\u2b04\u2b01\u2b07\u2b0d\u2b04", "\ua185\ua186\ua18c\ua180\ua182\ua185\ua181\ua185", "\u971f\u9718\u971a\u971b\u971b\u9711\u971c\u9719", "\u61d2\u61d3\u61d6\u61d3\u61d4\u61d3\u61da\u61d2", "\u1f0c\u1f0f\u1f06\u1f0e\u1f0b\u1f06\u1f08\u1f0e", "\udd65\udd66\udd66\udd63\udd6a\udd6b\udd63\udd61", "\u613b\u6138\u613b\u613d\u613e\u613e\u613d\u613a", "\u0f73\u0f70\u0f74\u0f77\u0f72\u0f74\u0f72\u0f78", "\ub096\ub097\ub094\ub092\ub094\ub091\ub090\ub091", "\u90c9\u90c8\u90cd\u90cf\u90c0\u90cf\u90c8\u90c9", "\u5cb3\u5cb6\u5cb1\u5cb2\u5cb3\u5cb7\u5cb4\u5cb7"}, d2={"\u00b4\u00bc\u00b3\u20d9\u00eb\u00e9\u00ff\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0084\u00a3\u00a5\u00be\u00b9\u00b0\u00ec\u00fe\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0084\u00a3\u00a5\u00be\u00b9\u00b0\u00ec", "\u04e5\u04ed\u04e3\u2488\u04ba\u04b8\u04ae\u04ca\u04ec\u04e7\u04f0\u04e7\u04a9\u04ea\u04e7\u04e8\u04e1\u04a9\u04d5\u04f2\u04f4\u04ef\u04e8\u04e1\u04bd\u04af\u04ca\u04ec\u04e7\u04f0\u04e7\u04a9\u04ea\u04e7\u04e8\u04e1\u04a9\u04d5\u04f2\u04f4\u04ef\u04e8\u04e1\u04bd", "\u0248\u0240\u024d\u2225\u0217\u0215\u0203\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210\u0202\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210", "\u021e\u0216\u021a\u2273\u0241\u0243\u0255\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u022e\u0209\u020f\u0214\u0213\u021a\u0246\u0254\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u022e\u0209\u020f\u0214\u0213\u021a\u0246", "\u06aa\u06a2\u06a1\u26c7\u06f5\u06f7\u06e1\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2\u06e0\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2", "\u0558\u0507\u0508\u050d\u050a\u050d\u0510\u055a\u0558\u055a\u054c\u054d\u0532", "\u06f2\u06a7\u06a0\u06a7\u06ba\u06f0\u06f2\u06f0\u06e6\u06e7\u0698", "\u012d\u012f\u013e\u0109\u0126\u012b\u0139\u0139\u0176\u0174\u0162\u0163\u0106\u0120\u012b\u013c\u012b\u0165\u0126\u012b\u0124\u012d\u0165\u0109\u0126\u012b\u0139\u0139\u0171", "\u02be\u02b7\u02a5\u02be\u0295\u02b9\u02b2\u02b3\u02ea\u02e8\u02fe\u02ff\u029f", "\u0379\u036d\u0369\u037d\u0370\u036f\u0320\u0322\u0334\u0350\u0376\u037d\u036a\u037d\u0333\u0370\u037d\u0372\u037b\u0333\u0353\u037e\u0376\u0379\u037f\u0368\u0327\u0335\u0346", "\u0506\u0509\u050a\u050b\u0500\u0559\u055b\u054d\u054c\u0529\u050f\u0504\u0513\u0504\u054a\u0509\u0504\u050b\u0502\u054a\u052a\u0507\u050f\u0500\u0506\u0511\u055e", "\u0273\u0268\u0254\u0273\u0275\u026e\u0269\u0260\u023b\u0239\u022f\u022e\u024b\u026d\u0266\u0271\u0266\u0228\u026b\u0266\u0269\u0260\u0228\u0254\u0273\u0275\u026e\u0269\u0260\u023c", "\u0001\u0000\u001b\u0006\t\u0016SQGF9", "\u001d\u001c\u0007\u001a\u0015\n2\u001f\u001fOM[Z%", "\u06dc\u06ca\u06c2\u06df\u0697\u0695\u0683\u0682\u06fd", "\u07e4\u07f2\u07fa\u07e7\u07af\u07ad\u07bb\u07d9\u07ba\u07c5", "\u03e9\u03ff\u03f7\u03ea\u03ae\u03a2\u03a0\u03b6\u03d4\u03b7\u03c8", "\u0174\u0162\u016a\u0177\u013f\u013d\u012b\u0149\u014a\u012a\u0155", "\u06c7\u06c8\u06cf\u06c0\u06cd\u06c8\u06db\u06c4\u069d\u069f\u0689\u0688\u06f7"})
public final class Class1757 {
    public static String field6584;
    public static float field6585;
    public static int field6586 = -1591037174;
    public static long field6587 = 8490516020025189260L;
    public static double field6588;
    public static float field6589;

    private static String vTNxSjwwtdcIwR4i(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite yDeLjqnVGBwrKV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1757.vTNxSjwwtdcIwR4i(k2, -2021323854));
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
                int a2 = Integer.parseInt(Class1757.vTNxSjwwtdcIwR4i(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1757.vTNxSjwwtdcIwR4i(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1757.vTNxSjwwtdcIwR4i(k2, -2021323854) + " " + l2 + " " + m2);
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
        a\u200e = "PauseModules";
        i\u200e = "Rainbow-Difference";
        F\u200e = "Shield";
        field6589 = Float.intBitsToFloat(1063264799);
        field6588 = Double.longBitsToDouble(4604415114284630724L);
        field6585 = Float.intBitsToFloat(1017370378);
        field6584 = "Initializing LookupManager ...";
        bK\u200e = "\u00a79";
    }
}

