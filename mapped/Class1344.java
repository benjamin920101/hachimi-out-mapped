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

@HACHIMI_CLIENT(mv=100, d1={"\ub2f6\ub2f4\ub2f7\ub2f0\ub2f6\ub2f3\ub2f6\ub2f6", "PQRW^PTP", "\ua94c\ua94e\ua94e\ua94b\ua94a\ua94b\ua94a\ua94c", "\uc563\uc560\uc564\uc563\uc565\uc562\uc566\uc563", "\ue198\ue194\ue199\ue197\ue199\ue199\ue190", "\ud9bc\ud9ba\ud9bb\ud9b7\ud9bd\ud9bf\ud9b9\ud9b6", "\ua9bb\ua9b7\ua9ba\ua9bc\ua9bf\ua9b9\ua9bd\ua9bb", "\u85d8\u85dc\u85d0\u85da\u85df\u85d9\u85d9\u85d9", "\u846c\u846a\u846b\u8469\u846f\u846d\u8469\u846e", "\u1b4d\u1b47\u1b4c\u1b4a\u1b49\u1b4e\u1b48\u1b4e", "\u717a\u7177\u7179\u7176\u717d\u7179\u717a\u717d", "\u6c20\u6c27\u6c24\u6c2c\u6c2c\u6c23\u6c25\u6c24", "\u2788\u278c\u2789\u278a\u278c\u278d\u2782", "\u84d8\u84db\u84d8\u84d8\u84dd\u84d8\u84dc\u84dc", "\ud3f1\ud3fd\ud3f1\ud3f2\ud3f1\ud3f5\ud3f0\ud3f1"}, d2={"\u00b7\u0095\u00a2\u20df\u00ed\u00ef\u00f9\u009d\u00bb\u00b0\u00a7\u00b0\u00fe\u00bd\u00b0\u00bf\u00b6\u00fe\u0082\u00a5\u00a3\u00b8\u00bf\u00b6\u00ea\u00f8\u009d\u00bb\u00b0\u00a7\u00b0\u00fe\u00bd\u00b0\u00bf\u00b6\u00fe\u0082\u00a5\u00a3\u00b8\u00bf\u00b6\u00ea", "\u008b\u00d4\u00db\u00de\u00d9\u00de\u00c3\u0089\u008b\u0089\u009f\u009e\u00e1", "`525(b`btu\n", "\u00c2\u00c0\u00d1\u00e6\u00c9\u00c4\u00d6\u00d6\u0099\u009b\u008d\u008c\u00e9\u00cf\u00c4\u00d3\u00c4\u008a\u00c9\u00c4\u00cb\u00c2\u008a\u00e6\u00c9\u00c4\u00d6\u00d6\u009e", "\u043b\u0432\u0420\u043b\u0410\u043c\u0437\u0436\u046f\u046d\u047b\u047a\u041a", "\u00d9\u00cd\u00c9\u00dd\u00d0\u00cf\u0080\u0082\u0094\u00f0\u00d6\u00dd\u00ca\u00dd\u0093\u00d0\u00dd\u00d2\u00db\u0093\u00f3\u00de\u00d6\u00d9\u00df\u00c8\u0087\u0095\u00e6", "\u0306\u0309\u030a\u030b\u0300\u0359\u035b\u034d\u034c\u0329\u030f\u0304\u0313\u0304\u034a\u0309\u0304\u030b\u0302\u034a\u032a\u0307\u030f\u0300\u0306\u0311\u035e", "\u0421\u043a\u0406\u0421\u0427\u043c\u043b\u0432\u0469\u046b\u047d\u047c\u0419\u043f\u0434\u0423\u0434\u047a\u0439\u0434\u043b\u0432\u047a\u0406\u0421\u0427\u043c\u043b\u0432\u046e", "\u0712\u0713\u0708\u0715\u071a\u0705\u0740\u0742\u0754\u0755\u072a", "\u075d\u075c\u0747\u075a\u0755\u074a\u0772\u075f\u075f\u070f\u070d\u071b\u071a\u0765", "\u0414\u0402\u040a\u0417\u045f\u045d\u044b\u044a\u0435", "\u05d0\u05c6\u05ce\u05d3\u059b\u0599\u058f\u05ed\u058e\u05f1", "\u001d\u000b\u0003\u001eZVTB C<", "\u0583\u0595\u059d\u0580\u05c8\u05ca\u05dc\u05be\u05bd\u05dd\u05a2", "\u0517\u0518\u051f\u0510\u051d\u0518\u050b\u0514\u054d\u054f\u0559\u0558\u0527"})
public final class Class1344 {
    public static double field5199 = 0.8949435241556423;
    public static double field5200 = Double.longBitsToDouble(0x4010000000000000L);
    public static String field5201;
    public static float field5202;
    public static int field5203 = -1643064054;
    public static float field5204;

    private static String BFOTwhv9FogEOxDK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite HahbfCvKxoIqUJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1344.BFOTwhv9FogEOxDK(k2, -1524052341));
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
                int a2 = Integer.parseInt(Class1344.BFOTwhv9FogEOxDK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1344.BFOTwhv9FogEOxDK(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1344.BFOTwhv9FogEOxDK(k2, -1524052341) + " " + l2 + " " + m2);
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
        field5204 = Float.intBitsToFloat(1061357111);
        field5202 = Float.intBitsToFloat(1064279262);
        field5201 = "hachimi";
    }
}

