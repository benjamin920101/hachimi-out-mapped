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

@HACHIMI_CLIENT(mv=100, d1={"\u2fe6\u2fe4\u2fe0\u2fe1\u2fee\u2fee\u2fe6\u2fe3", "\u20ad\u20aa\u20ae\u20a9\u20aa\u20a7\u20ab\u20aa", "\ua5f2\ua5f0\ua5f1\ua5f4\ua5f3\ua5f7\ua5f2\ua5ff", "\ud801\ud804\ud800\ud804\ud804\ud802\ud802\ud800", "\u9af9\u9afa\u9afb\u9af5\u9afb\u9af8\u9af8\u9af5", "\ubb41\ubb44\ubb44\ubb43\ubb41\ubb4c\ubb42\ubb4c", "\ud53f\ud537\ud536\ud531\ud537\ud53f\ud53e", "\u6812\u6813\u6817\u6811\u6815\u6812\u6812\u6817", "\uc368\uc36d\uc368\uc36d\uc36e\uc36b\uc368", "\u6020\u602b\u6021\u6020\u6024\u6024\u6021\u602a", "\u7082\u708a\u7080\u7081\u7086\u7080\u7082\u708a", "\ue803\ue801\ue805\ue809\ue806\ue805\ue808\ue803", "\u79df\u79dd\u79d9\u79d8\u79df\u79da\u79de\u79de", "\ud4a4\ud4a3\ud4a6\ud4a5\ud4a6\ud4a7\ud4a5\ud4a0", "\u5ab4\u5ab2\u5ab3\u5ab6\u5ab8\u5ab1\u5ab9\u5ab5", "\u6ac5\u6ac1\u6ac6\u6ac3\u6ac1\u6ac5\u6ac4\u6ac1", "\u8af1\u8af2\u8af7\u8afa\u8afa\u8af0\u8af4\u8af1", "\ub563\ub56e\ub564\ub56f\ub565\ub567\ub560\ub56e"}, d2={"\u01fc\u01eb\u01d3\u2195\u01a7\u01a5\u01b3\u01d7\u01f1\u01fa\u01ed\u01fa\u01b4\u01f7\u01fa\u01f5\u01fc\u01b4\u01c8\u01ef\u01e9\u01f2\u01f5\u01fc\u01a0\u01b2\u01d7\u01f1\u01fa\u01ed\u01fa\u01b4\u01f7\u01fa\u01f5\u01fc\u01b4\u01c8\u01ef\u01e9\u01f2\u01f5\u01fc\u01a0", "\u02b0\u02a7\u029e\u22d9\u02eb\u02e9\u02ff\u029b\u02bd\u02b6\u02a1\u02b6\u02f8\u02bb\u02b6\u02b9\u02b0\u02f8\u0284\u02a3\u02a5\u02be\u02b9\u02b0\u02ec\u02fe\u029b\u02bd\u02b6\u02a1\u02b6\u02f8\u02bb\u02b6\u02b9\u02b0\u02f8\u0284\u02a3\u02a5\u02be\u02b9\u02b0\u02ec", "\u0367\u0370\u034a\u230e\u033c\u033e\u0328\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0353\u0374\u0372\u0369\u036e\u0367\u033b\u0329\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0353\u0374\u0372\u0369\u036e\u0367\u033b", "\u0698\u068f\u06b4\u26f1\u06c3\u06c1\u06d7\u06b3\u0695\u069e\u0689\u069e\u06d0\u0693\u069e\u0691\u0698\u06d0\u06ac\u068b\u068d\u0696\u0691\u0698\u06c4\u06d6\u06b3\u0695\u069e\u0689\u069e\u06d0\u0693\u069e\u0691\u0698\u06d0\u06ac\u068b\u068d\u0696\u0691\u0698\u06c4", "\u02f8\u02a7\u02a8\u02ad\u02aa\u02ad\u02b0\u02fa\u02f8\u02fa\u02ec\u02ed\u0292", "\u02c4\u0291\u0296\u0291\u028c\u02c6\u02c4\u02c6\u02d0\u02d1\u02ae", "\u06f6\u06f4\u06e5\u06d2\u06fd\u06f0\u06e2\u06e2\u06ad\u06af\u06b9\u06b8\u06dd\u06fb\u06f0\u06e7\u06f0\u06be\u06fd\u06f0\u06ff\u06f6\u06be\u06d2\u06fd\u06f0\u06e2\u06e2\u06aa", "\u02e7\u02ee\u02fc\u02e7\u02cc\u02e0\u02eb\u02ea\u02b3\u02b1\u02a7\u02a6\u02c6", "\u06c1\u06d5\u06d1\u06c5\u06c8\u06d7\u0698\u069a\u068c\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06eb\u06c6\u06ce\u06c1\u06c7\u06d0\u069f\u068d\u06fe", "\u0114\u011b\u0118\u0119\u0112\u014b\u0149\u015f\u015e\u013b\u011d\u0116\u0101\u0116\u0158\u011b\u0116\u0119\u0110\u0158\u0138\u0115\u011d\u0112\u0114\u0103\u014c", "\u03b1\u03aa\u0396\u03b1\u03b7\u03ac\u03ab\u03a2\u03f9\u03fb\u03ed\u03ec\u0389\u03af\u03a4\u03b3\u03a4\u03ea\u03a9\u03a4\u03ab\u03a2\u03ea\u0396\u03b1\u03b7\u03ac\u03ab\u03a2\u03fe", "\u0352\u0353\u0348\u0355\u035a\u0345\u0300\u0302\u0314\u0315\u036a", "\u0779\u0778\u0763\u077e\u0771\u076e\u0756\u077b\u077b\u072b\u0729\u073f\u073e\u0741", "\u05cf\u05d9\u05d1\u05cc\u0584\u0586\u0590\u0591\u05ee", "\u059e\u0588\u0580\u059d\u05d5\u05d7\u05c1\u05a3\u05c0\u05bf", "\u04b3\u04a5\u04ad\u04b0\u04f4\u04f8\u04fa\u04ec\u048e\u04ed\u0492", "\u0144\u0152\u015a\u0147\u010f\u010d\u011b\u0179\u017a\u011a\u0165", "\u00bb\u00b4\u00b3\u00bc\u00b1\u00b4\u00a7\u00b8\u00e1\u00e3\u00f5\u00f4\u008b"})
public final class Class5636 {
    public static double field10777;
    public static int field10778 = 497340256;
    public static int field10779 = 0;
    public static float field10780;
    public static float field10781;
    public static double field10782 = 0.2348132269430775;

    static {
        field10780 = Float.intBitsToFloat(1052500612);
        field10777 = Double.longBitsToDouble(4597461329065267728L);
        J\u200e = "PERCENT";
        P\u200e = "INSTANCE";
        aP\u200e = "Scaffolding";
        bk\u200e = "Highlights specified blocks in the world";
        field10781 = Float.intBitsToFloat(1060262631);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite HVTFlYZSTIn0do(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5636.I54n6SBC2bVX2Faa(k2, -370613615));
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
                int a2 = Integer.parseInt(Class5636.I54n6SBC2bVX2Faa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5636.I54n6SBC2bVX2Faa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5636.I54n6SBC2bVX2Faa(k2, -370613615) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String I54n6SBC2bVX2Faa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

