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

@HACHIMI_CLIENT(mv=100, d1={"\ua5d6\ua5d0\ua5d6\ua5db\ua5d7\ua5d1\ua5d2\ua5d3", "\udb29\udb2b\udb29\udb28\udb2a\udb2b\udb2b\udb2f", "\ub1a1\ub1a7\ub1ab\ub1a4\ub1a1\ub1aa\ub1a5", "\u3619\u3619\u3618\u361d\u361f\u3614\u3619\u3615", "\ud7e7\ud7ea\ud7e6\ud7ea\ud7e2\ud7e4\ud7e4\ud7e5", "\ucc82\ucc86\ucc85\ucc87\ucc84\ucc8f\ucc85\ucc8e", "\u6480\u6480\u6487\u648a\u6485\u648b\u6482\u6480", "\u35de\u35de\u35dc\u35d8\u35d5\u35d4\u35d5\u35d8", "\u3f4b\u3f48\u3f46\u3f4d\u3f4d\u3f48\u3f4d\u3f4c", "\ub6c5\ub6cf\ub6cf\ub6cb\ub6cb\ub6cf\ub6ca", "\u05ca\u05cc\u05cf\u05c8\u05c9\u05c6\u05c7\u05ce", "\ub9d1\ub9d0\ub9d3\ub9da\ub9d5\ub9d2\ub9d7\ub9d5", "\u99ff\u99f3\u99f3\u99fc\u99fd\u99fa\u99fa\u99fa", "\ue78f\ue789\ue78f\ue78d\ue78d\ue782", "\u61cf\u61c9\u61cd\u61cb\u61c3\u61c8\u61c8\u61c3", "\u1a62\u1a63\u1a61\u1a65\u1a67\u1a62\u1a66\u1a65", "\ua9bf\ua9bd\ua9ba\ua9bd\ua9b4\ua9bb\ua9b5\ua9b9", "\u5a3e\u5a39\u5a3a\u5a39\u5a39\u5a3a\u5a39\u5a30"}, d2={"\u06d3\u06c3\u06ca\u26bc\u068e\u068c\u069a\u06fe\u06d8\u06d3\u06c4\u06d3\u069d\u06de\u06d3\u06dc\u06d5\u069d\u06e1\u06c6\u06c0\u06db\u06dc\u06d5\u0689\u069b\u06fe\u06d8\u06d3\u06c4\u06d3\u069d\u06de\u06d3\u06dc\u06d5\u069d\u06e1\u06c6\u06c0\u06db\u06dc\u06d5\u0689", "\u0227\u0237\u023f\u2248\u027a\u0278\u026e\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0215\u0232\u0234\u022f\u0228\u0221\u027d\u026f\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0215\u0232\u0234\u022f\u0228\u0221\u027d", "\u0360\u0370\u037b\u230f\u033d\u033f\u0329\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0352\u0375\u0373\u0368\u036f\u0366\u033a\u0328\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0352\u0375\u0373\u0368\u036f\u0366\u033a", "\u024f\u025f\u026f\u2220\u0212\u0210\u0206\u0262\u0244\u024f\u0258\u024f\u0201\u0242\u024f\u0240\u0249\u0201\u027d\u025a\u025c\u0247\u0240\u0249\u0215\u0207\u0262\u0244\u024f\u0258\u024f\u0201\u0242\u024f\u0240\u0249\u0201\u027d\u025a\u025c\u0247\u0240\u0249\u0215", "\u0769\u0736\u0739\u073c\u073b\u073c\u0721\u076b\u0769\u076b\u077d\u077c\u0703", "\u01cf\u019a\u019d\u019a\u0187\u01cd\u01cf\u01cd\u01db\u01da\u01a5", "\u07a0\u07a2\u07b3\u0784\u07ab\u07a6\u07b4\u07b4\u07fb\u07f9\u07ef\u07ee\u078b\u07ad\u07a6\u07b1\u07a6\u07e8\u07ab\u07a6\u07a9\u07a0\u07e8\u0784\u07ab\u07a6\u07b4\u07b4\u07fc", "\u0208\u0201\u0213\u0208\u0223\u020f\u0204\u0205\u025c\u025e\u0248\u0249\u0229", "\u064c\u0658\u065c\u0648\u0645\u065a\u0615\u0617\u0601\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u0666\u064b\u0643\u064c\u064a\u065d\u0612\u0600\u0673", "\u047e\u0471\u0472\u0473\u0478\u0421\u0423\u0435\u0434\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u0452\u047f\u0477\u0478\u047e\u0469\u0426", "\u0204\u021f\u0223\u0204\u0202\u0219\u021e\u0217\u024c\u024e\u0258\u0259\u023c\u021a\u0211\u0206\u0211\u025f\u021c\u0211\u021e\u0217\u025f\u0223\u0204\u0202\u0219\u021e\u0217\u024b", "=<':5*om{z\u0005", "\u056b\u056a\u0571\u056c\u0563\u057c\u0544\u0569\u0569\u0539\u053b\u052d\u052c\u0553", "\u015f\u0149\u0141\u015c\u0114\u0116\u0100\u0101\u017e", "\u033f\u0329\u0321\u033c\u0374\u0376\u0360\u0302\u0361\u031e", "\u07ef\u07f9\u07f1\u07ec\u07a8\u07a4\u07a6\u07b0\u07d2\u07b1\u07ce", "\u0142\u0154\u015c\u0141\u0109\u010b\u011d\u017f\u017c\u011c\u0163", "\u0426\u0429\u042e\u0421\u042c\u0429\u043a\u0425\u047c\u047e\u0468\u0469\u0416"})
public final class Class1749 {
    public static float field6565;
    public static float field6566;
    public static float field6567;
    public static double field6568;
    public static long field6569 = 6950738620991849971L;

    private static String H2ZN6jlVBS937Ab7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite gbOgZ7BQiBFw3S(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1749.H2ZN6jlVBS937Ab7(k2, 1777446396));
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
                int a2 = Integer.parseInt(Class1749.H2ZN6jlVBS937Ab7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1749.H2ZN6jlVBS937Ab7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1749.H2ZN6jlVBS937Ab7(k2, 1777446396) + " " + l2 + " " + m2);
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
        field6568 = Double.longBitsToDouble(4604079266818780479L);
        field6567 = Float.intBitsToFloat(1057601654);
        W\u200e = "HoleFill";
        field6566 = Float.intBitsToFloat(1059991140);
        an\u200e = "ZERO";
        field6565 = Float.intBitsToFloat(1046706940);
        aC\u200e = "PauseInFluid";
        bA\u200e = "Works only when you are standing on blocks";
    }
}

