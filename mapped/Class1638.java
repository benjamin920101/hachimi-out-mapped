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

@HACHIMI_CLIENT(mv=100, d1={"\u89e2\u89e0\u89e8\u89e8\u89e0\u89e2\u89e3\u89e0", "\u9002\u9006\u9002\u9006\u9008\u9000\u9004\u9003", "\u3002\u3005\u300f\u3006\u3003\u300e\u3003\u3007", "\u8884\u8881\u8887\u8885\u8885\u8882\u8885\u8885", "\u7c41\u7c4c\u7c44\u7c4d\u7c4d\u7c4d\u7c47\u7c41", "\u30d7\u30d5\u30d1\u30d7\u30d6\u30d0\u30d4\u30de", "\ub251\ub25b\ub251\ub252\ub255\ub252\ub251\ub25b", "\ud6c3\ud6c1\ud6c2\ud6c7\ud6c5\ud6c0\ud6c1", "\u5207\u5203\u5202\u5203\u5201\u520a\u5203\u5207", "\u9ab7\u9ab4\u9ab0\u9ab4\u9ab3\u9ab1\u9ab4\u9ab0", "\ucebc\ucebf\ucebd\ucebf\uceb1\ucebb\ucebd\uceb0", "\uba5c\uba5c\uba5d\uba57\uba5f\uba5a\uba5c\uba5c", "\u1b6b\u1b61\u1b6c\u1b6a\u1b6d\u1b61\u1b69\u1b6d", "\uc43e\uc43b\uc43c\uc439\uc430\uc430\uc43b\uc43a", "\udf9c\udf92\udf93\udf9a\udf9f\udf9b\udf9f\udf9a", "\u64f4\u64fc\u64f5\u64f7\u64f1\u64f1\u64fd\u64f5"}, d2={"\u0111\u0110\u0107\u217b\u0149\u014b\u015d\u0139\u011f\u0114\u0103\u0114\u015a\u0119\u0114\u011b\u0112\u015a\u0126\u0101\u0107\u011c\u011b\u0112\u014e\u015c\u0139\u011f\u0114\u0103\u0114\u015a\u0119\u0114\u011b\u0112\u015a\u0126\u0101\u0107\u011c\u011b\u0112\u014e", "\u07d8\u07d9\u07cf\u27b2\u0780\u0782\u0794\u07f0\u07d6\u07dd\u07ca\u07dd\u0793\u07d0\u07dd\u07d2\u07db\u0793\u07ef\u07c8\u07ce\u07d5\u07d2\u07db\u0787\u0795\u07f0\u07d6\u07dd\u07ca\u07dd\u0793\u07d0\u07dd\u07d2\u07db\u0793\u07ef\u07c8\u07ce\u07d5\u07d2\u07db\u0787", "\u0661\u063e\u0631\u0634\u0633\u0634\u0629\u0663\u0661\u0663\u0675\u0674\u060b", "\u00ed\u00b8\u00bf\u00b8\u00a5\u00ef\u00ed\u00ef\u00f9\u00f8\u0087", "\u0709\u070b\u071a\u072d\u0702\u070f\u071d\u071d\u0752\u0750\u0746\u0747\u0722\u0704\u070f\u0718\u070f\u0741\u0702\u070f\u0700\u0709\u0741\u072d\u0702\u070f\u071d\u071d\u0755", "\u0430\u0439\u042b\u0430\u041b\u0437\u043c\u043d\u0464\u0466\u0470\u0471\u0411", "\u032c\u0338\u033c\u0328\u0325\u033a\u0375\u0377\u0361\u0305\u0323\u0328\u033f\u0328\u0366\u0325\u0328\u0327\u032e\u0366\u0306\u032b\u0323\u032c\u032a\u033d\u0372\u0360\u0313", "\u02b5\u02ba\u02b9\u02b8\u02b3\u02ea\u02e8\u02fe\u02ff\u029a\u02bc\u02b7\u02a0\u02b7\u02f9\u02ba\u02b7\u02b8\u02b1\u02f9\u0299\u02b4\u02bc\u02b3\u02b5\u02a2\u02ed", "\u04bc\u04a7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f4\u04f6\u04e0\u04e1\u0484\u04a2\u04a9\u04be\u04a9\u04e7\u04a4\u04a9\u04a6\u04af\u04e7\u049b\u04bc\u04ba\u04a1\u04a6\u04af\u04f3", "\u00f5\u00f4\u00ef\u00f2\u00fd\u00e2\u00a7\u00a5\u00b3\u00b2\u00cd", "\u068e\u068f\u0694\u0689\u0686\u0699\u06a1\u068c\u068c\u06dc\u06de\u06c8\u06c9\u06b6", "\u030c\u031a\u0312\u030f\u0347\u0345\u0353\u0352\u032d", "\u02e4\u02f2\u02fa\u02e7\u02af\u02ad\u02bb\u02d9\u02ba\u02c5", "\u0233\u0225\u022d\u0230\u0274\u0278\u027a\u026c\u020e\u026d\u0212", "\u02ef\u02f9\u02f1\u02ec\u02a4\u02a6\u02b0\u02d2\u02d1\u02b1\u02ce", "\u02bd\u02b2\u02b5\u02ba\u02b7\u02b2\u02a1\u02be\u02e7\u02e5\u02f3\u02f2\u028d"})
public final class Class1638 {
    public static float field6091;
    public static double field6092;
    public static double field6093;
    public static float field6094;

    private static String IoyhQ1qianenP2fT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        w\u200e = "Better search";
        field6094 = Float.intBitsToFloat(1049125254);
        as\u200e = "Boost";
        field6091 = Float.intBitsToFloat(1064884925);
        field6092 = Double.longBitsToDouble(4601119173507080292L);
        field6093 = Double.longBitsToDouble(4603822904528539898L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite XCgUNHvcmSjtLg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1638.IoyhQ1qianenP2fT(k2, -1749229386));
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
                int a2 = Integer.parseInt(Class1638.IoyhQ1qianenP2fT(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1638.IoyhQ1qianenP2fT(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1638.IoyhQ1qianenP2fT(k2, -1749229386) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

