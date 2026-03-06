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

@HACHIMI_CLIENT(mv=100, d1={"\u2b71\u2b74\u2b76\u2b7b\u2b76\u2b7a\u2b75\u2b75", "\u9c0e\u9c09\u9c04\u9c09\u9c0e\u9c0d\u9c0e", "\ua8fe\ua8fd\ua8fc\ua8f2\ua8f2\ua8f2\ua8fb\ua8fa", "\u8696\u8696\u8697\u869f\u869b\u8696\u8697", "\u0a42\u0a40\u0a41\u0a43\u0a42\u0a49\u0a43\u0a48", "\ua5d9\ua5d5\ua5dd\ua5da\ua5dd\ua5de\ua5da", "\u968e\u968c\u9689\u9688\u9688\u968e\u968b\u968b", "\ucd7d\ucd79\ucd75\ucd79\ucd78\ucd7e\ucd7b\ucd79", "\ub20e\ub208\ub208\ub209\ub201\ub20d\ub20a\ub20b", "\u75e7\u75e1\u75e3\u75e7\u75e7\u75e2\u75e2\u75e4", "\u835d\u835c\u8359\u835a\u8358\u8352\u8358\u8352", "\u88d2\u88d5\u88d2\u88d3\u88d4\u88d6\u88df\u88df", "\u714e\u714b\u7148\u7144\u7148\u7144\u714e\u7145", "\ue1af\ue1a3\ue1ae\ue1a2\ue1ad\ue1ac\ue1aa\ue1ab", "\u278b\u2789\u278b\u278a\u278c\u278c\u278d\u2788", "\u8d3e\u8d3a\u8d38\u8d3b\u8d3c\u8d31\u8d3c\u8d39"}, d2={"\u0658\u067f\u0652\u2639\u060b\u0609\u061f\u067b\u065d\u0656\u0641\u0656\u0618\u065b\u0656\u0659\u0650\u0618\u0664\u0643\u0645\u065e\u0659\u0650\u060c\u061e\u067b\u065d\u0656\u0641\u0656\u0618\u065b\u0656\u0659\u0650\u0618\u0664\u0643\u0645\u065e\u0659\u0650\u060c", "\u0351\u0376\u0358\u2330\u0302\u0300\u0316\u0372\u0354\u035f\u0348\u035f\u0311\u0352\u035f\u0350\u0359\u0311\u036d\u034a\u034c\u0357\u0350\u0359\u0305\u0317\u0372\u0354\u035f\u0348\u035f\u0311\u0352\u035f\u0350\u0359\u0311\u036d\u034a\u034c\u0357\u0350\u0359\u0305", "\u063c\u0663\u066c\u0669\u066e\u0669\u0674\u063e\u063c\u063e\u0628\u0629\u0656", "\u032c\u0379\u037e\u0379\u0364\u032e\u032c\u032e\u0338\u0339\u0346", "\u0327\u0325\u0334\u0303\u032c\u0321\u0333\u0333\u037c\u037e\u0368\u0369\u030c\u032a\u0321\u0336\u0321\u036f\u032c\u0321\u032e\u0327\u036f\u0303\u032c\u0321\u0333\u0333\u037b", "\u027a\u0273\u0261\u027a\u0251\u027d\u0276\u0277\u022e\u022c\u023a\u023b\u025b", "\u0487\u0493\u0497\u0483\u048e\u0491\u04de\u04dc\u04ca\u04ae\u0488\u0483\u0494\u0483\u04cd\u048e\u0483\u048c\u0485\u04cd\u04ad\u0480\u0488\u0487\u0481\u0496\u04d9\u04cb\u04b8", "^QRSX\u0001\u0003\u0015\u0014qW\\K\\\u0012Q\\SZ\u0012r_WX^I\u0006", "\u00b2\u00a9\u0095\u00b2\u00b4\u00af\u00a8\u00a1\u00fa\u00f8\u00ee\u00ef\u008a\u00ac\u00a7\u00b0\u00a7\u00e9\u00aa\u00a7\u00a8\u00a1\u00e9\u0095\u00b2\u00b4\u00af\u00a8\u00a1\u00fd", "\u06af\u06ae\u06b5\u06a8\u06a7\u06b8\u06fd\u06ff\u06e9\u06e8\u0697", "\u0308\u0309\u0312\u030f\u0300\u031f\u0327\u030a\u030a\u035a\u0358\u034e\u034f\u0330", "\u01c9\u01df\u01d7\u01ca\u0182\u0180\u0196\u0197\u01e8", "\u071c\u070a\u0702\u071f\u0757\u0755\u0743\u0721\u0742\u073d", "\u04e1\u04f7\u04ff\u04e2\u04a6\u04aa\u04a8\u04be\u04dc\u04bf\u04c0", "\u01d4\u01c2\u01ca\u01d7\u019f\u019d\u018b\u01e9\u01ea\u018a\u01f5", "\u0494\u049b\u049c\u0493\u049e\u049b\u0488\u0497\u04ce\u04cc\u04da\u04db\u04a4"})
public final class Class1053 {
    public static float field4317;
    public static double field4318 = 0.49049379339364274;
    public static float field4319;

    static {
        al\u200e = "Multi";
        field4317 = Float.intBitsToFloat(1060867069);
        field4319 = Float.intBitsToFloat(1033374800);
        bP\u200e = "MobAgeFilter";
    }

    private static String OCjCLrBKBydne01j(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite STaIRTuYtBAVgY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1053.OCjCLrBKBydne01j(k2, 723974989));
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
                int a2 = Integer.parseInt(Class1053.OCjCLrBKBydne01j(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1053.OCjCLrBKBydne01j(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1053.OCjCLrBKBydne01j(k2, 723974989) + " " + l2 + " " + m2);
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

