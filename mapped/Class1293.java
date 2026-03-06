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

@HACHIMI_CLIENT(mv=100, d1={"\ub20c\ub203\ub208\ub20f\ub20a\ub202\ub20c\ub20a", "\uc485\uc483\uc48e\uc483\uc482\uc486\uc48f\uc482", "\u8642\u8645\u8646\u8642\u864f\u864f\u8645", "\u30fd\u30f7\u30fe\u30fc\u30fc\u30fd\u30fc\u30f7", "\udbca\udbc6\udbc6\udbc7\udbcd\udbce\udbcb\udbc6", "\u212b\u212f\u212a\u212b\u2129\u212d\u2121\u212f", "\u27bc\u27ba\u27b8\u27bf\u27b9\u27bd\u27b3", "\u81e7\u81e0\u81e3\u81e7\u81e0\u81e0\u81e4\u81e9", "\u63da\u63da\u63dc\u63d9\u63d1\u63d8\u63d8\u63d0", "\u4561\u4565\u4566\u4565\u456b\u4562\u456b\u456b", "\u980f\u9808\u9808\u980a\u980e\u9805\u980d\u9804", "\ubf2c\ubf2e\ubf2c\ubf2b\ubf28\ubf2d\ubf2b\ubf2f", "\uc6ab\uc6a8\uc6a9\uc6aa\uc6a7\uc6af\uc6af\uc6ae", "\u5f4b\u5f4a\u5f4f\u5f4d\u5f49\u5f4a\u5f49\u5f4c"}, d2={"\u0360\u033f\u0330\u0335\u0332\u0335\u0328\u0362\u0360\u0362\u0374\u0375\u030a", "\u0381\u03d4\u03d3\u03d4\u03c9\u0383\u0381\u0383\u0395\u0394\u03eb", "\u00c9\u00cb\u00da\u00ed\u00c2\u00cf\u00dd\u00dd\u0092\u0090\u0086\u0087\u00e2\u00c4\u00cf\u00d8\u00cf\u0081\u00c2\u00cf\u00c0\u00c9\u0081\u00ed\u00c2\u00cf\u00dd\u00dd\u0095", "\u0645\u064c\u065e\u0645\u066e\u0642\u0649\u0648\u0611\u0613\u0605\u0604\u0664", "\u07d4\u07c0\u07c4\u07d0\u07dd\u07c2\u078d\u078f\u0799\u07fd\u07db\u07d0\u07c7\u07d0\u079e\u07dd\u07d0\u07df\u07d6\u079e\u07fe\u07d3\u07db\u07d4\u07d2\u07c5\u078a\u0798\u07eb", "\u04d4\u04db\u04d8\u04d9\u04d2\u048b\u0489\u049f\u049e\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04f8\u04d5\u04dd\u04d2\u04d4\u04c3\u048c", "\u05a9\u05b2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e1\u05e3\u05f5\u05f4\u0591\u05b7\u05bc\u05ab\u05bc\u05f2\u05b1\u05bc\u05b3\u05ba\u05f2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e6", "\u0658\u0659\u0642\u065f\u0650\u064f\u060a\u0608\u061e\u061f\u0660", "\u026c\u026d\u0276\u026b\u0264\u027b\u0243\u026e\u026e\u023e\u023c\u022a\u022b\u0254", "\u02df\u02c9\u02c1\u02dc\u0294\u0296\u0280\u0281\u02fe", "\u00cc\u00da\u00d2\u00cf\u0087\u0085\u0093\u00f1\u0092\u00ed", "\u0292\u0284\u028c\u0291\u02d5\u02d9\u02db\u02cd\u02af\u02cc\u02b3", "\u0254\u0242\u024a\u0257\u021f\u021d\u020b\u0269\u026a\u020a\u0275", "\u06d9\u06d6\u06d1\u06de\u06d3\u06d6\u06c5\u06da\u0683\u0681\u0697\u0696\u06e9"})
public final class Class1293 {
    public static int field5028 = 1802848858;
    public static double field5029 = Double.longBitsToDouble(4607146232244252766L);

    /*
     * WARNING - void declaration
     */
    private static CallSite qLdyGjcnZietd7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1293.JrooS6EyeBBHdFk4(k2, 1187777009));
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
                int a2 = Integer.parseInt(Class1293.JrooS6EyeBBHdFk4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1293.JrooS6EyeBBHdFk4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1293.JrooS6EyeBBHdFk4(k2, 1187777009) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String JrooS6EyeBBHdFk4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

