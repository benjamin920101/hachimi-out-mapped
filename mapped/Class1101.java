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

@HACHIMI_CLIENT(mv=100, d1={"\u45c9\u45cc\u45cd\u45ca\u45c8\u45c5\u45cd\u45cc", "\ubc62\ubc68\ubc67\ubc64\ubc62\ubc67\ubc60\ubc65", "\u1230\u1236\u1233\u1232\u1232\u1231\u1237\u123c", "\ua5b6\ua5b7\ua5b6\ua5b3\ua5b9\ua5b5\ua5b6\ua5b3", "\u6b8f\u6b8c\u6b89\u6b8e\u6b8d\u6b89\u6b83\u6b8b", "\u4e77\u4e7c\u4e72\u4e7c\u4e7d\u4e70\u4e76\u4e72", "\udd1e\udd1c\udd1b\udd1f\udd19\udd1d\udd19\udd1c", "\ucbd4\ucbd2\ucbd1\ucbd1\ucbd7\ucbd1\ucbd5", "\u6091\u6095\u6094\u6095\u6096\u609b\u6090\u6091", "\u8180\u8180\u818e\u8180\u818b\u818b\u8181", "\uc25a\uc25b\uc250\uc25b\uc25c\uc25b\uc25a\uc25a", "\u7803\u780c\u7807\u7806\u7803\u7807\u780d", "\u16e5\u16ef\u16e6\u16e1\u16e3\u16e4\u16e5\u16ee", "\ue72d\ue72d\ue721\ue72d\ue72f\ue729\ue72b\ue72c", "\u3f13\u3f19\u3f10\u3f12\u3f15\u3f19\u3f19\u3f15", "\u8857\u885d\u8855\u8852\u8857\u885c\u8852\u8851", "\uceee\uceed\uceeb\ucee0\uceee\ucee1\ucee0\ucee9"}, d2={"\u05fb\u05e3\u05e2\u2594\u05a6\u05a4\u05b2\u05d6\u05f0\u05fb\u05ec\u05fb\u05b5\u05f6\u05fb\u05f4\u05fd\u05b5\u05c9\u05ee\u05e8\u05f3\u05f4\u05fd\u05a1\u05b3\u05d6\u05f0\u05fb\u05ec\u05fb\u05b5\u05f6\u05fb\u05f4\u05fd\u05b5\u05c9\u05ee\u05e8\u05f3\u05f4\u05fd\u05a1", "\u0725\u073d\u073d\u274a\u0778\u077a\u076c\u0708\u072e\u0725\u0732\u0725\u076b\u0728\u0725\u072a\u0723\u076b\u0717\u0730\u0736\u072d\u072a\u0723\u077f\u076d\u0708\u072e\u0725\u0732\u0725\u076b\u0728\u0725\u072a\u0723\u076b\u0717\u0730\u0736\u072d\u072a\u0723\u077f", "\u0518\u0500\u0503\u2577\u0545\u0547\u0551\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u052a\u050d\u050b\u0510\u0517\u051e\u0542\u0550\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u052a\u050d\u050b\u0510\u0517\u051e\u0542", "\u02e7\u02b8\u02b7\u02b2\u02b5\u02b2\u02af\u02e5\u02e7\u02e5\u02f3\u02f2\u028d", "\u03b7\u03e2\u03e5\u03e2\u03ff\u03b5\u03b7\u03b5\u03a3\u03a2\u03dd", "\u0145\u0147\u0156\u0161\u014e\u0143\u0151\u0151\u011e\u011c\u010a\u010b\u016e\u0148\u0143\u0154\u0143\u010d\u014e\u0143\u014c\u0145\u010d\u0161\u014e\u0143\u0151\u0151\u0119", "\u0461\u0468\u047a\u0461\u044a\u0466\u046d\u046c\u0435\u0437\u0421\u0420\u0440", "o{\u007fkfy64\"F`k|k%fkdm%Eh`oi~1#P", "\u01c9\u01c6\u01c5\u01c4\u01cf\u0196\u0194\u0182\u0183\u01e6\u01c0\u01cb\u01dc\u01cb\u0185\u01c6\u01cb\u01c4\u01cd\u0185\u01e5\u01c8\u01c0\u01cf\u01c9\u01de\u0191", "\u0114\u010f\u0133\u0114\u0112\u0109\u010e\u0107\u015c\u015e\u0148\u0149\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u0133\u0114\u0112\u0109\u010e\u0107\u015b", "\u030d\u030c\u0317\u030a\u0305\u031a\u035f\u035d\u034b\u034a\u0335", "\u0142\u0143\u0158\u0145\u014a\u0155\u016d\u0140\u0140\u0110\u0112\u0104\u0105\u017a", "\u0131\u0127\u012f\u0132\u017a\u0178\u016e\u016f\u0110", "\u0712\u0704\u070c\u0711\u0759\u075b\u074d\u072f\u074c\u0733", "\u058a\u059c\u0594\u0589\u05cd\u05c1\u05c3\u05d5\u05b7\u05d4\u05ab", "\u0207\u0211\u0219\u0204\u024c\u024e\u0258\u023a\u0239\u0259\u0226", "\u06c8\u06c7\u06c0\u06cf\u06c2\u06c7\u06d4\u06cb\u0692\u0690\u0686\u0687\u06f8"})
public final class Class1101 {
    public static double field4453;
    public static double field4454;
    public static float field4455;

    private static String q2NiLLln5GHwy94w(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite VYVx4Pr0K1NvIO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1101.q2NiLLln5GHwy94w(k2, 484209668));
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
                int a2 = Integer.parseInt(Class1101.q2NiLLln5GHwy94w(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1101.q2NiLLln5GHwy94w(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1101.q2NiLLln5GHwy94w(k2, 484209668) + " " + l2 + " " + m2);
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
        c\u200e = "Adjusts position to match server portal position";
        k\u200e = "";
        az\u200e = "Slot to use for mainhand totem";
        field4454 = Double.longBitsToDouble(4603907305838708028L);
        field4455 = Float.intBitsToFloat(1062395013);
        field4453 = Double.longBitsToDouble(4604213228651210219L);
    }
}

