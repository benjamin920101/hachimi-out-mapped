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

@HACHIMI_CLIENT(mv=100, d1={"\u20be\u20bc\u20bb\u20be\u20be\u20bc\u20bd\u20bd", "\u5ca5\u5ca1\u5caf\u5caf\u5ca4\u5cae\u5ca6\u5ca7", "\u988c\u988d\u9885\u988c\u9885\u9884\u988c\u9885", "\u6a70\u6a73\u6a77\u6a74\u6a72\u6a73\u6a79\u6a74", "\u9dfc\u9dfa\u9dfe\u9df8\u9df6\u9dff\u9dfd\u9df6", "\u7968\u796b\u796e\u796c\u796f\u7969\u796e\u7969", "\u03da\u03d7\u03db\u03db\u03dc\u03da\u03dd\u03de", "\u29f9\u29fd\u29ff\u29f9\u29f6\u29ff\u29f6\u29f8", "\uc243\uc242\uc244\uc246\uc244\uc246\uc247\uc244", "\uc5de\uc5d9\uc5d9\uc5d8\uc5dd\uc5dc\uc5da\uc5d8", "\u7276\u7270\u7273\u7270\u7277\u727a\u727b\u7272", "\ua4b3\ua4b6\ua4b5\ua4b0\ua4b6\ua4b1\ua4b7\ua4b6", "\u78ae\u78a8\u78ac\u78a5\u78ad\u78a5\u78ac\u78a8", "\u0583\u0583\u0585\u0581\u0586\u0583\u058a\u0585"}, d2={"`?0525(b`btu\n", "\u00fb\u00ae\u00a9\u00ae\u00b3\u00f9\u00fb\u00f9\u00ef\u00ee\u0091", ";9(\u001f0=//`btu\u00106=*=s0=2;s\u001f0=//g", "\u04e2\u04eb\u04f9\u04e2\u04c9\u04e5\u04ee\u04ef\u04b6\u04b4\u04a2\u04a3\u04c3", "\u00cb\u00df\u00db\u00cf\u00c2\u00dd\u0092\u0090\u0086\u00e2\u00c4\u00cf\u00d8\u00cf\u0081\u00c2\u00cf\u00c0\u00c9\u0081\u00e1\u00cc\u00c4\u00cb\u00cd\u00da\u0095\u0087\u00f4", "\u0759\u0756\u0755\u0754\u075f\u0706\u0704\u0712\u0713\u0776\u0750\u075b\u074c\u075b\u0715\u0756\u075b\u0754\u075d\u0715\u0775\u0758\u0750\u075f\u0759\u074e\u0701", "\u06da\u06c1\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0692\u0690\u0686\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u03ed\u03ec\u03f7\u03ea\u03e5\u03fa\u03bf\u03bd\u03ab\u03aa\u03d5", "\u02ae\u02af\u02b4\u02a9\u02a6\u02b9\u0281\u02ac\u02ac\u02fc\u02fe\u02e8\u02e9\u0296", "\u0349\u035f\u0357\u034a\u0302\u0300\u0316\u0317\u0368", "\u0278\u026e\u0266\u027b\u0233\u0231\u0227\u0245\u0226\u0259", "\u0171\u0167\u016f\u0172\u0136\u013a\u0138\u012e\u014c\u012f\u0150", "\u067d\u066b\u0663\u067e\u0636\u0634\u0622\u0640\u0643\u0623\u065c", "\u0533\u053c\u053b\u0534\u0539\u053c\u052f\u0530\u0569\u056b\u057d\u057c\u0503"})
public final class Class3991 {
    public static float field9120;
    public static float field9121;
    public static float field9122 = 0.017272472f;
    public static int field9123 = 1401462345;
    public static float field9124;

    private static String jK90DvsIE1gduA2S(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite blfB19KzpIo2yQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3991.jK90DvsIE1gduA2S(k2, 1286254795));
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
                int a2 = Integer.parseInt(Class3991.jK90DvsIE1gduA2S(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3991.jK90DvsIE1gduA2S(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3991.jK90DvsIE1gduA2S(k2, 1286254795) + " " + l2 + " " + m2);
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
        field9124 = Float.intBitsToFloat(1011849792);
        field9121 = Float.intBitsToFloat(1033158016);
        field9120 = Float.intBitsToFloat(1022355072);
    }
}

