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

@HACHIMI_CLIENT(mv=100, d1={"\u6532\u6534\u6531\u6534\u6536\u6534\u6534\u6531", "\u6af1\u6af3\u6af1\u6af1\u6afd\u6af7\u6afd\u6af0", "\u3551\u3557\u3557\u3550\u3551\u3553\u3550\u3554", "\ud5b2\ud5b6\ud5b7\ud5b1\ud5b3\ud5b0\ud5b5\ud5b6", "\ubed2\ubed2\ubed7\ubed5\ubed3\ubed5", "\ud7cc\ud7c0\ud7cc\ud7c9\ud7cd\ud7cd\ud7cf\ud7ca", "\ud6f1\ud6f3\ud6f3\ud6f4\ud6f1\ud6f6\ud6f7\ud6f7", "\u8573\u857b\u8573\u8578\u857d\u857f", "\u14fc\u14ff\u14f9\u14ff\u14fc\u14fc\u14fe\u14fc", "\ue458\ue45b\ue45e\ue458\ue453\ue45c\ue453", "\ua8f4\ua8f3\ua8f3\ua8f1\ua8f3\ua8f0\ua8f4", "\u58c1\u58c5\u58c1\u58c5\u58c0\u58c2\u58c4\u58c6", "\u2e7d\u2e7f\u2e77\u2e77\u2e7d\u2e77\u2e78\u2e7d", "\u85e0\u85ef\u85eb\u85eb\u85e0\u85ed\u85eb", "\u35ed\u35e8\u35e9\u35e8\u35ee\u35ea\u35eb\u35e7"}, d2={"\u07e7\u07e3\u07c1\u2799\u07ab\u07a9\u07bf\u07db\u07fd\u07f6\u07e1\u07f6\u07b8\u07fb\u07f6\u07f9\u07f0\u07b8\u07c4\u07e3\u07e5\u07fe\u07f9\u07f0\u07ac\u07be\u07db\u07fd\u07f6\u07e1\u07f6\u07b8\u07fb\u07f6\u07f9\u07f0\u07b8\u07c4\u07e3\u07e5\u07fe\u07f9\u07f0\u07ac", "\u05d0\u058f\u0580\u0585\u0582\u0585\u0598\u05d2\u05d0\u05d2\u05c4\u05c5\u05ba", "\u02cc\u0299\u029e\u0299\u0284\u02ce\u02cc\u02ce\u02d8\u02d9\u02a6", "\u04b0\u04b2\u04a3\u0494\u04bb\u04b6\u04a4\u04a4\u04eb\u04e9\u04ff\u04fe\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0494\u04bb\u04b6\u04a4\u04a4\u04ec", "\u052e\u0527\u0535\u052e\u0505\u0529\u0522\u0523\u057a\u0578\u056e\u056f\u050f", "\u0587\u0593\u0597\u0583\u058e\u0591\u05de\u05dc\u05ca\u05ae\u0588\u0583\u0594\u0583\u05cd\u058e\u0583\u058c\u0585\u05cd\u05ad\u0580\u0588\u0587\u0581\u0596\u05d9\u05cb\u05b8", "\u058a\u0585\u0586\u0587\u058c\u05d5\u05d7\u05c1\u05c0\u05a5\u0583\u0588\u059f\u0588\u05c6\u0585\u0588\u0587\u058e\u05c6\u05a6\u058b\u0583\u058c\u058a\u059d\u05d2", "\u07a4\u07bf\u0783\u07a4\u07a2\u07b9\u07be\u07b7\u07ec\u07ee\u07f8\u07f9\u079c\u07ba\u07b1\u07a6\u07b1\u07ff\u07bc\u07b1\u07be\u07b7\u07ff\u0783\u07a4\u07a2\u07b9\u07be\u07b7\u07eb", "\u0504\u0505\u051e\u0503\u050c\u0513\u0556\u0554\u0542\u0543\u053c", "\u051f\u051e\u0505\u0518\u0517\u0508\u0530\u051d\u051d\u054d\u054f\u0559\u0558\u0527", "\u0150\u0146\u014e\u0153\u011b\u0119\u010f\u010e\u0171", "\u0766\u0770\u0778\u0765\u072d\u072f\u0739\u075b\u0738\u0747", "\u03ac\u03ba\u03b2\u03af\u03eb\u03e7\u03e5\u03f3\u0391\u03f2\u038d", "\u0507\u0511\u0519\u0504\u054c\u054e\u0558\u053a\u0539\u0559\u0526", "\u03c4\u03cb\u03cc\u03c3\u03ce\u03cb\u03d8\u03c7\u039e\u039c\u038a\u038b\u03f4"})
public final class Class4133 {
    public static float field9595;
    public static double field9596;

    private static String r9hKaVJ7VO6iiLAK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite FcQtTlaaoxa6rq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4133.r9hKaVJ7VO6iiLAK(k2, -1738790120));
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
                int a2 = Integer.parseInt(Class4133.r9hKaVJ7VO6iiLAK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4133.r9hKaVJ7VO6iiLAK(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4133.r9hKaVJ7VO6iiLAK(k2, -1738790120) + " " + l2 + " " + m2);
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
        q\u200e = "AllowNoWater";
        field9595 = Float.intBitsToFloat(1061903821);
        field9596 = Double.longBitsToDouble(4595012047669872076L);
    }
}

