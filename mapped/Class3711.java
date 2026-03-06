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

@HACHIMI_CLIENT(mv=100, d1={"\u1c08\u1c09\u1c0e\u1c08\u1c06\u1c0a\u1c0f\u1c0c", "\u3a81\u3a81\u3a86\u3a80\u3a84\u3a87\u3a82\u3a81", "\u4533\u4538\u4533\u4537\u4532\u4533\u4537\u4532", "\u92d1\u92de\u92d1\u92d7\u92d7\u92d6\u92df\u92d4", "\ud7f2\ud7f9\ud7f3\ud7fd\ud7fe\ud7fc\ud7f3", "\ua1e8\ua1eb\ua1e8\ua1ee\ua1ee\ua1e2\ua1ef\ua1e3", "\u2f62\u2f6f\u2f63\u2f6e\u2f60\u2f67\u2f6e\u2f64", "\u94f1\u94f5\u94f1\u94f0\u94f6\u94f0\u94f0\u94f1", "\u3329\u3328\u332b\u332f\u332d\u3321\u3321\u3320", "\u247a\u247f\u2471\u2478\u247c\u247c\u2478\u247c", "\uaf6d\uaf6f\uaf6b\uaf68\uaf6d\uaf66\uaf6b\uaf69", "\u236c\u236f\u236d\u236b\u236d\u236d\u236b\u236c", "\u211b\u2115\u2119\u2114\u2114\u211d\u2119\u211e", "\u8f31\u8f39\u8f3e\u8f3f\u8f31\u8f38\u8f3b"}, d2={"\u0457\u0408\u0407\u0402\u0405\u0402\u041f\u0455\u0457\u0455\u0443\u0442\u043d", "\u0600\u0655\u0652\u0655\u0648\u0602\u0600\u0602\u0614\u0615\u066a", "\u06f4\u06f6\u06e7\u06d0\u06ff\u06f2\u06e0\u06e0\u06af\u06ad\u06bb\u06ba\u06df\u06f9\u06f2\u06e5\u06f2\u06bc\u06ff\u06f2\u06fd\u06f4\u06bc\u06d0\u06ff\u06f2\u06e0\u06e0\u06a8", "\u0575\u057c\u056e\u0575\u055e\u0572\u0579\u0578\u0521\u0523\u0535\u0534\u0554", "\u03a3\u03b7\u03b3\u03a7\u03aa\u03b5\u03fa\u03f8\u03ee\u038a\u03ac\u03a7\u03b0\u03a7\u03e9\u03aa\u03a7\u03a8\u03a1\u03e9\u0389\u03a4\u03ac\u03a3\u03a5\u03b2\u03fd\u03ef\u039c", "\u07e2\u07ed\u07ee\u07ef\u07e4\u07bd\u07bf\u07a9\u07a8\u07cd\u07eb\u07e0\u07f7\u07e0\u07ae\u07ed\u07e0\u07ef\u07e6\u07ae\u07ce\u07e3\u07eb\u07e4\u07e2\u07f5\u07ba", "\u05a9\u05b2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e1\u05e3\u05f5\u05f4\u0591\u05b7\u05bc\u05ab\u05bc\u05f2\u05b1\u05bc\u05b3\u05ba\u05f2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e6", "\u04b3\u04b2\u04a9\u04b4\u04bb\u04a4\u04e1\u04e3\u04f5\u04f4\u048b", "\u025b\u025a\u0241\u025c\u0253\u024c\u0274\u0259\u0259\u0209\u020b\u021d\u021c\u0263", "\u0698\u068e\u0686\u069b\u06d3\u06d1\u06c7\u06c6\u06b9", "\u0778\u076e\u0766\u077b\u0733\u0731\u0727\u0745\u0726\u0759", "\u0269\u027f\u0277\u026a\u022e\u0222\u0220\u0236\u0254\u0237\u0248", "\u0264\u0272\u027a\u0267\u022f\u022d\u023b\u0259\u025a\u023a\u0245", "\u06a5\u06aa\u06ad\u06a2\u06af\u06aa\u06b9\u06a6\u06ff\u06fd\u06eb\u06ea\u0695"})
public final class Class3711 {
    public static float field8351 = Float.intBitsToFloat(1057695225);
    public static float field8352 = Float.intBitsToFloat(1062721197);
    public static double field8353 = 0.6601771988327572;
    public static int field8354 = 41927309;

    /*
     * WARNING - void declaration
     */
    private static CallSite arWfjqUznI2m36(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3711.J1ZeDvLAsOqGangV(k2, 1361619793));
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
                int a2 = Integer.parseInt(Class3711.J1ZeDvLAsOqGangV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3711.J1ZeDvLAsOqGangV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3711.J1ZeDvLAsOqGangV(k2, 1361619793) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String J1ZeDvLAsOqGangV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

