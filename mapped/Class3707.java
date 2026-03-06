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

@HACHIMI_CLIENT(mv=100, d1={"\u7a29\u7a29\u7a28\u7a2f\u7a23\u7a2d\u7a23", "\uc150\uc159\uc157\uc158\uc151\uc159\uc155\uc157", "\u3e71\u3e72\u3e7e\u3e73\u3e72\u3e72\u3e73\u3e75", "\u21e5\u21ef\u21ef\u21ee\u21e4\u21ef\u21e7\u21ef", "\ud05b\ud05b\ud05a\ud05d\ud05b\ud059\ud053\ud053", "\u01d3\u01dc\u01d0\u01d5\u01d6\u01d0\u01d5\u01d1", "\u8151\u8155\u815d\u8154\u8153\u8156\u8153\u8155", "\uc31d\uc313\uc31f\uc319\uc31a\uc318\uc312\uc312", "\ubc7b\ubc76\ubc7a\ubc76\ubc76\ubc79\ubc7c\ubc7e", "\u887e\u887d\u8870\u887c\u887d\u887b\u887f\u887b", "\u9563\u9567\u9565\u9566\u9562\u9565\u9563\u9563", "\u0d3f\u0d3c\u0d3a\u0d3a\u0d39\u0d32\u0d39\u0d3d", "\ud5d1\ud5d0\ud5d6\ud5d0\ud5d2\ud5d3\ud5de\ud5df", "\u4006\u4002\u4000\u400e\u400e\u4007\u4003\u4003"}, d2={"\u03d7\u0388\u0387\u0382\u0385\u0382\u039f\u03d5\u03d7\u03d5\u03c3\u03c2\u03bd", "\u0515\u0540\u0547\u0540\u055d\u0517\u0515\u0517\u0501\u0500\u057f", "\u05b0\u05b2\u05a3\u0594\u05bb\u05b6\u05a4\u05a4\u05eb\u05e9\u05ff\u05fe\u059b\u05bd\u05b6\u05a1\u05b6\u05f8\u05bb\u05b6\u05b9\u05b0\u05f8\u0594\u05bb\u05b6\u05a4\u05a4\u05ec", "\u00e1\u00e8\u00fa\u00e1\u00ca\u00e6\u00ed\u00ec\u00b5\u00b7\u00a1\u00a0\u00c0", "\u05f3\u05e7\u05e3\u05f7\u05fa\u05e5\u05aa\u05a8\u05be\u05da\u05fc\u05f7\u05e0\u05f7\u05b9\u05fa\u05f7\u05f8\u05f1\u05b9\u05d9\u05f4\u05fc\u05f3\u05f5\u05e2\u05ad\u05bf\u05cc", "\u06da\u06d5\u06d6\u06d7\u06dc\u0685\u0687\u0691\u0690\u06f5\u06d3\u06d8\u06cf\u06d8\u0696\u06d5\u06d8\u06d7\u06de\u0696\u06f6\u06db\u06d3\u06dc\u06da\u06cd\u0682", "\u06b1\u06aa\u0696\u06b1\u06b7\u06ac\u06ab\u06a2\u06f9\u06fb\u06ed\u06ec\u0689\u06af\u06a4\u06b3\u06a4\u06ea\u06a9\u06a4\u06ab\u06a2\u06ea\u0696\u06b1\u06b7\u06ac\u06ab\u06a2\u06fe", "\u07bd\u07bc\u07a7\u07ba\u07b5\u07aa\u07ef\u07ed\u07fb\u07fa\u0785", "\u0303\u0302\u0319\u0304\u030b\u0314\u032c\u0301\u0301\u0351\u0353\u0345\u0344\u033b", "\u063e\u0628\u0620\u063d\u0675\u0677\u0661\u0660\u061f", "\u046a\u047c\u0474\u0469\u0421\u0423\u0435\u0457\u0434\u044b", "\u04d6\u04c0\u04c8\u04d5\u0491\u049d\u049f\u0489\u04eb\u0488\u04f7", "\u0763\u0775\u077d\u0760\u0728\u072a\u073c\u075e\u075d\u073d\u0742", "\u0243\u024c\u024b\u0244\u0249\u024c\u025f\u0240\u0219\u021b\u020d\u020c\u0273"})
public final class Class3707 {
    public static float field8344 = Float.intBitsToFloat(1062117239);
    public static int field8345 = -1226888661;
    public static int field8346 = -1010308164;
    public static float field8347;
    public static double field8348;

    /*
     * Enabled aggressive block sorting
     */
    private static String bZwev7WdOR1oTmB1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block0: while (true) {
            int n2 = d2 < a2.length() ? 31536 : 31537;
            while (true) {
                int n3;
                if ((n3 = n2) == 31536) {
                    c2.append((char)(a2.charAt(d2) ^ b2));
                    ++d2;
                    continue block0;
                }
                if (n3 != 31537) {
                    return c2.toString();
                }
                n2 = 31535;
            }
            break;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite SvpmtiXBrl7lQ6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3707.bZwev7WdOR1oTmB1(k2, -1849288818));
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
                int a2 = Integer.parseInt(Class3707.bZwev7WdOR1oTmB1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3707.bZwev7WdOR1oTmB1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3707.bZwev7WdOR1oTmB1(k2, -1849288818) + " " + l2 + " " + m2);
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
        field8348 = Double.longBitsToDouble(4583286326417905184L);
        field8347 = Float.intBitsToFloat(1060028309);
    }
}

