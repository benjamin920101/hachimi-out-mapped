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

@HACHIMI_CLIENT(mv=100, d1={"\u4134\u4130\u4132\u4131\u4137\u4136\u4131\u4135", "\u8dde\u8ddb\u8ddc\u8ddc\u8ddc\u8ddc\u8ddd\u8dd9", "\u81ae\u81ab\u81a2\u81ae\u81a8\u81ab\u81a3\u81a8", "\ucc04\ucc02\ucc00\ucc09\ucc09\ucc05\ucc01\ucc04", "\ua317\ua313\ua317\ua317\ua31a\ua317\ua314\ua315", "\u86e9\u86ed\u86e2\u86ef\u86e9\u86e8\u86eb\u86ed", "\u97e1\u97e1\u97ee\u97e7\u97e4\u97ee\u97e6", "\u9691\u9696\u9693\u9695\u9697\u9691\u9697\u9698", "\u8888\u8889\u8888\u8885\u8884\u888f\u888c\u888a", "\u28be\u28bb\u28bb\u28b7\u28bd\u28b8\u28bc\u28bb", "\u1d9c\u1d99\u1d90\u1d9b\u1d91\u1d91\u1d9b\u1d91", "\u3422\u3422\u3425\u3426\u3425\u3422\u3424\u3426", "\u1021\u1020\u1026\u102b\u102b\u1025\u102b\u1024", "\u51d0\u51d0\u51d0\u51d6\u51d7\u51d5\u51d3", "\ue61e\ue61b\ue61d\ue61e\ue61c\ue61e\ue618\ue61e", "\u337c\u3378\u337b\u337c\u337a\u337d\u337b\u337a", "\u0c0d\u0c09\u0c0a\u0c0f\u0c09\u0c0f\u0c0f\u0c0f", "\u1876\u1872\u1870\u1874\u1874\u1875\u1876\u1870"}, d2={"\u028e\u028e\u02b1\u22f0\u02c2\u02c0\u02d6\u02b2\u0294\u029f\u0288\u029f\u02d1\u0292\u029f\u0290\u0299\u02d1\u02ad\u028a\u028c\u0297\u0290\u0299\u02c5\u02d7\u02b2\u0294\u029f\u0288\u029f\u02d1\u0292\u029f\u0290\u0299\u02d1\u02ad\u028a\u028c\u0297\u0290\u0299\u02c5", "\u0271\u0271\u0251\u220f\u023d\u023f\u0229\u024d\u026b\u0260\u0277\u0260\u022e\u026d\u0260\u026f\u0266\u022e\u0252\u0275\u0273\u0268\u026f\u0266\u023a\u0228\u024d\u026b\u0260\u0277\u0260\u022e\u026d\u0260\u026f\u0266\u022e\u0252\u0275\u0273\u0268\u026f\u0266\u023a", "\u06bd\u06bd\u069c\u26c3\u06f1\u06f3\u06e5\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6\u06e4\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6", "\u01aa\u01aa\u0188\u21d4\u01e6\u01e4\u01f2\u0196\u01b0\u01bb\u01ac\u01bb\u01f5\u01b6\u01bb\u01b4\u01bd\u01f5\u0189\u01ae\u01a8\u01b3\u01b4\u01bd\u01e1\u01f3\u0196\u01b0\u01bb\u01ac\u01bb\u01f5\u01b6\u01bb\u01b4\u01bd\u01f5\u0189\u01ae\u01a8\u01b3\u01b4\u01bd\u01e1", "\u05b0\u05ef\u05e0\u05e5\u05e2\u05e5\u05f8\u05b2\u05b0\u05b2\u05a4\u05a5\u05da", "\u0249\u021c\u021b\u021c\u0201\u024b\u0249\u024b\u025d\u025c\u0223", "\u0445\u0447\u0456\u0461\u044e\u0443\u0451\u0451\u041e\u041c\u040a\u040b\u046e\u0448\u0443\u0454\u0443\u040d\u044e\u0443\u044c\u0445\u040d\u0461\u044e\u0443\u0451\u0451\u0419", "\u05e3\u05ea\u05f8\u05e3\u05c8\u05e4\u05ef\u05ee\u05b7\u05b5\u05a3\u05a2\u05c2", "\u06c2\u06d6\u06d2\u06c6\u06cb\u06d4\u069b\u0699\u068f\u06eb\u06cd\u06c6\u06d1\u06c6\u0688\u06cb\u06c6\u06c9\u06c0\u0688\u06e8\u06c5\u06cd\u06c2\u06c4\u06d3\u069c\u068e\u06fd", "\u009b\u0094\u0097\u0096\u009d\u00c4\u00c6\u00d0\u00d1\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00b7\u009a\u0092\u009d\u009b\u008c\u00c3", "\u0736\u072d\u0711\u0736\u0730\u072b\u072c\u0725\u077e\u077c\u076a\u076b\u070e\u0728\u0723\u0734\u0723\u076d\u072e\u0723\u072c\u0725\u076d\u0711\u0736\u0730\u072b\u072c\u0725\u0779", "\u06bf\u06be\u06a5\u06b8\u06b7\u06a8\u06ed\u06ef\u06f9\u06f8\u0687", "\u0442\u0443\u0458\u0445\u044a\u0455\u046d\u0440\u0440\u0410\u0412\u0404\u0405\u047a", "\u05e1\u05f7\u05ff\u05e2\u05aa\u05a8\u05be\u05bf\u05c0", "\u020a\u021c\u0214\u0209\u0241\u0243\u0255\u0237\u0254\u022b", "\u048f\u0499\u0491\u048c\u04c8\u04c4\u04c6\u04d0\u04b2\u04d1\u04ae", "\u03ea\u03fc\u03f4\u03e9\u03a1\u03a3\u03b5\u03d7\u03d4\u03b4\u03cb", "\u07f4\u07fb\u07fc\u07f3\u07fe\u07fb\u07e8\u07f7\u07ae\u07ac\u07ba\u07bb\u07c4"})
public final class Class3777 {
    public static int field8558 = 1708527851;
    public static double field8559;
    public static double field8560;
    public static double field8561 = 0.4806385538377963;
    public static double field8562;
    public static float field8563;

    static {
        r\u200e = "Displays the player's armor";
        N\u200e = "save";
        Z\u200e = "Delay, in ticks, between placements";
        field8560 = Double.longBitsToDouble(4601026994364229856L);
        aE\u200e = "Prevents frostbite effect from rendering";
        field8563 = Float.intBitsToFloat(1061339974);
        field8559 = Double.longBitsToDouble(4603946848076155708L);
        field8562 = Double.longBitsToDouble(4606742145890709316L);
    }

    private static String aEYVCSI4fI4FGOvx(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite S1HjqG6wyP7oFf(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3777.aEYVCSI4fI4FGOvx(k2, -1008210107));
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
                int a2 = Integer.parseInt(Class3777.aEYVCSI4fI4FGOvx(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3777.aEYVCSI4fI4FGOvx(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3777.aEYVCSI4fI4FGOvx(k2, -1008210107) + " " + l2 + " " + m2);
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

