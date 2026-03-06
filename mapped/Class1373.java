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

@HACHIMI_CLIENT(mv=100, d1={"\u22c2\u22c0\u22c6\u22cb\u22c4\u22ca\u22c7\u22c0", "\u3a1f\u3a10\u3a11\u3a19\u3a1a\u3a11", "\u7dab\u7da8\u7dad\u7dae\u7dab\u7daf\u7da8", "\u23a4\u23a7\u23a1\u23a2\u23a1\u23a2\u23a7\u23a3", "\u8205\u8205\u8205\u8204\u8204\u8205\u8202\u8207", "\u8540\u8548\u8547\u8543\u8549\u8545\u8540\u8545", "\ube57\ube56\ube54\ube52\ube50\ube5b\ube57\ube52", "\u32ac\u32ab\u32ad\u32ad\u32a9\u32af\u32ac\u32a9", "\u435c\u435f\u435e\u4359\u4358\u4358\u435b\u435d", "\u2a01\u2a0d\u2a03\u2a03\u2a0d\u2a0d\u2a02\u2a01", "\u9fa2\u9fa7\u9fa9\u9fa5\u9fa6\u9fa1\u9fa6\u9fa4", "\u497d\u4970\u4978\u4970\u497e\u4970\u497b\u497d", "\u4c7f\u4c78\u4c79\u4c7c\u4c7f\u4c7c\u4c7f\u4c79", "\u11d7\u11d3\u11d6\u11d2\u11d0\u11d0\u11d4\u11db", "\u1832\u1832\u183f\u1836\u1836\u1837\u1831\u1837", "\u201b\u2018\u2019\u201e\u2014\u201a\u201d"}, d2={"\u04f8\u04fc\u04d0\u2495\u04a7\u04a5\u04b3\u04d7\u04f1\u04fa\u04ed\u04fa\u04b4\u04f7\u04fa\u04f5\u04fc\u04b4\u04c8\u04ef\u04e9\u04f2\u04f5\u04fc\u04a0\u04b2\u04d7\u04f1\u04fa\u04ed\u04fa\u04b4\u04f7\u04fa\u04f5\u04fc\u04b4\u04c8\u04ef\u04e9\u04f2\u04f5\u04fc\u04a0", "\u07a2\u07a6\u078d\u27cf\u07fd\u07ff\u07e9\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa", "\u0739\u0766\u0769\u076c\u076b\u076c\u0771\u073b\u0739\u073b\u072d\u072c\u0753", "\u0534\u0561\u0566\u0561\u057c\u0536\u0534\u0536\u0520\u0521\u055e", "\u0264\u0266\u0277\u0240\u026f\u0262\u0270\u0270\u023f\u023d\u022b\u022a\u024f\u0269\u0262\u0275\u0262\u022c\u026f\u0262\u026d\u0264\u022c\u0240\u026f\u0262\u0270\u0270\u0238", "\u074a\u0743\u0751\u074a\u0761\u074d\u0746\u0747\u071e\u071c\u070a\u070b\u076b", "\u0316\u0302\u0306\u0312\u031f\u0300\u034f\u034d\u035b\u033f\u0319\u0312\u0305\u0312\u035c\u031f\u0312\u031d\u0314\u035c\u033c\u0311\u0319\u0316\u0310\u0307\u0348\u035a\u0329", "\u00b4\u00bb\u00b8\u00b9\u00b2\u00eb\u00e9\u00ff\u00fe\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0098\u00b5\u00bd\u00b2\u00b4\u00a3\u00ec", "\u00e9\u00f2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a6", "\u01e4\u01e5\u01fe\u01e3\u01ec\u01f3\u01b6\u01b4\u01a2\u01a3\u01dc", "\u057b\u057a\u0561\u057c\u0573\u056c\u0554\u0579\u0579\u0529\u052b\u053d\u053c\u0543", "\u05fd\u05eb\u05e3\u05fe\u05b6\u05b4\u05a2\u05a3\u05dc", "\u06ef\u06f9\u06f1\u06ec\u06a4\u06a6\u06b0\u06d2\u06b1\u06ce", "\u02f9\u02ef\u02e7\u02fa\u02be\u02b2\u02b0\u02a6\u02c4\u02a7\u02d8", "\u0553\u0545\u054d\u0550\u0518\u051a\u050c\u056e\u056d\u050d\u0572", "\u0329\u0326\u0321\u032e\u0323\u0326\u0335\u032a\u0373\u0371\u0367\u0366\u0319"})
public final class Class1373 {
    public static float field5291 = 0.2484349f;
    public static float field5292 = 0.9166932f;
    public static float field5293 = Float.intBitsToFloat(1059531510);
    public static float field5294;
    public static int field5295 = 1996460182;

    /*
     * WARNING - void declaration
     */
    private static CallSite tITT1rQWE3GPwG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1373.gWqAoFsn4BYiS0zL(k2, -1793544140));
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
                int a2 = Integer.parseInt(Class1373.gWqAoFsn4BYiS0zL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1373.gWqAoFsn4BYiS0zL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1373.gWqAoFsn4BYiS0zL(k2, -1793544140) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String gWqAoFsn4BYiS0zL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bw\u200e = "Delay";
        bx\u200e = "Multi";
        field5294 = Float.intBitsToFloat(1048606030);
    }
}

