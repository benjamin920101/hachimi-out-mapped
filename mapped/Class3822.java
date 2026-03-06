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

@HACHIMI_CLIENT(mv=100, d1={"\ua2fb\ua2f1\ua2fa\ua2fb\ua2f8\ua2f9\ua2ff\ua2f0", "\u3685\u3688\u368e\u3688\u368c\u368d\u3684", "\u77d4\u77d6\u77d2\u77d4\u77d6\u77d9\u77d2\u77d0", "\u49fd\u49ff\u49fb\u49fc\u49fa\u49fb\u49fa\u49f9", "\u03eb\u03ec\u03e9\u03eb\u03ee\u03e5\u03ec\u03ee", "\u3dd7\u3dd6\u3dd3\u3dd9\u3dd1\u3dd3\u3dd6", "\ua14b\ua14b\ua14a\ua149\ua14c\ua14d\ua140\ua14d", "\u5a85\u5a8c\u5a82\u5a84\u5a81\u5a84\u5a84\u5a80", "\u8ce1\u8ce3\u8ce7\u8ce9\u8ce3\u8ce7\u8ce1\u8ce5", "\udde8\uddef\uddef\udded\udde1\uddea\uddeb", "\u5715\u571e\u5717\u571f\u5711\u5716\u5715\u5710", "\ucead\uceaa\uceab\ucea8\ucea2\ucea9\uceae\ucea2", "\u0309\u030a\u0305\u030f\u030b\u030f\u030e\u030c", "\u38ef\u38ef\u38e3\u38eb\u38ea\u38ef\u38ea\u38e2", "\ua244\ua241\ua244\ua240\ua243\ua240\ua24c\ua24d", "\ue549\ue549\ue54b\ue548\ue54f\ue54f\ue548"}, d2={"\u0797\u07b2\u078c\u27f0\u07c2\u07c0\u07d6\u07b2\u0794\u079f\u0788\u079f\u07d1\u0792\u079f\u0790\u0799\u07d1\u07ad\u078a\u078c\u0797\u0790\u0799\u07c5\u07d7\u07b2\u0794\u079f\u0788\u079f\u07d1\u0792\u079f\u0790\u0799\u07d1\u07ad\u078a\u078c\u0797\u0790\u0799\u07c5", "\u010b\u012e\u0111\u216c\u015e\u015c\u014a\u012e\u0108\u0103\u0114\u0103\u014d\u010e\u0103\u010c\u0105\u014d\u0131\u0116\u0110\u010b\u010c\u0105\u0159\u014b\u012e\u0108\u0103\u0114\u0103\u014d\u010e\u0103\u010c\u0105\u014d\u0131\u0116\u0110\u010b\u010c\u0105\u0159", "\u0563\u053c\u0533\u0536\u0531\u0536\u052b\u0561\u0563\u0561\u0577\u0576\u0509", "\u0565\u0530\u0537\u0530\u052d\u0567\u0565\u0567\u0571\u0570\u050f", "\u00dc\u00de\u00cf\u00f8\u00d7\u00da\u00c8\u00c8\u0087\u0085\u0093\u0092\u00f7\u00d1\u00da\u00cd\u00da\u0094\u00d7\u00da\u00d5\u00dc\u0094\u00f8\u00d7\u00da\u00c8\u00c8\u0080", "\u01d2\u01db\u01c9\u01d2\u01f9\u01d5\u01de\u01df\u0186\u0184\u0192\u0193\u01f3", "\u040a\u041e\u041a\u040e\u0403\u041c\u0453\u0451\u0447\u0423\u0405\u040e\u0419\u040e\u0440\u0403\u040e\u0401\u0408\u0440\u0420\u040d\u0405\u040a\u040c\u041b\u0454\u0446\u0435", "\u02d1\u02de\u02dd\u02dc\u02d7\u028e\u028c\u029a\u029b\u02fe\u02d8\u02d3\u02c4\u02d3\u029d\u02de\u02d3\u02dc\u02d5\u029d\u02fd\u02d0\u02d8\u02d7\u02d1\u02c6\u0289", "\u00eb\u00f0\u00cc\u00eb\u00ed\u00f6\u00f1\u00f8\u00a3\u00a1\u00b7\u00b6\u00d3\u00f5\u00fe\u00e9\u00fe\u00b0\u00f3\u00fe\u00f1\u00f8\u00b0\u00cc\u00eb\u00ed\u00f6\u00f1\u00f8\u00a4", "\u05c8\u05c9\u05d2\u05cf\u05c0\u05df\u059a\u0598\u058e\u058f\u05f0", "\u01f6\u01f7\u01ec\u01f1\u01fe\u01e1\u01d9\u01f4\u01f4\u01a4\u01a6\u01b0\u01b1\u01ce", "\u00e9\u00ff\u00f7\u00ea\u00a2\u00a0\u00b6\u00b7\u00c8", "\u02cf\u02d9\u02d1\u02cc\u0284\u0286\u0290\u02f2\u0291\u02ee", "\u047d\u046b\u0463\u047e\u043a\u0436\u0434\u0422\u0440\u0423\u045c", "RDLQ\u0019\u001b\rol\fs", "\u05fb\u05f4\u05f3\u05fc\u05f1\u05f4\u05e7\u05f8\u05a1\u05a3\u05b5\u05b4\u05cb"})
public final class Class3822 {
    public static float field8646 = 0.9171101f;
    public static float field8647;
    public static double field8648;
    public static int field8649 = 955121811;
    public static float field8650;
    public static double field8651;

    /*
     * WARNING - void declaration
     */
    private static CallSite tDCdkNaDbjj99i(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3822.qsyDhaodHjHirzeq(k2, -606640905));
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
                int a2 = Integer.parseInt(Class3822.qsyDhaodHjHirzeq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3822.qsyDhaodHjHirzeq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3822.qsyDhaodHjHirzeq(k2, -606640905) + " " + l2 + " " + m2);
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
        field8651 = Double.longBitsToDouble(4603400562693751089L);
        field8650 = Float.intBitsToFloat(1050546004);
        field8648 = Double.longBitsToDouble(4606747944779140022L);
        field8647 = Float.intBitsToFloat(1036079488);
        aq\u200e = "help";
        aA\u200e = "AirPlace";
    }

    private static String qsyDhaodHjHirzeq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

