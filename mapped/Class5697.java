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

@HACHIMI_CLIENT(mv=100, d1={"\u53a9\u53a3\u53af\u53ac\u53ad\u53a8\u53af\u53aa", "\u16e5\u16e0\u16ef\u16e5\u16e7\u16e7\u16ee\u16e0", "\u8b18\u8b19\u8b11\u8b1e\u8b1d\u8b10\u8b10\u8b10", "\uc6f9\uc6f8\uc6f3\uc6f8\uc6fc\uc6f9\uc6ff\uc6fe", "\u2534\u2534\u253f\u2535\u253e\u253f\u2534\u2535", "\u2914\u291e\u2910\u2913\u2911\u2912\u2913\u2917", "\u5463\u5464\u5461\u5466\u5463\u5463\u5463", "\ub9b0\ub9b6\ub9b2\ub9b5\ub9bd\ub9b6\ub9b0\ub9b5", "\u51fb\u51f8\u51fb\u51fd\u51fa\u51ff\u51fc\u51fc", "\u4952\u4955\u4950\u4952\u4954\u4952\u4955", "\ue825\ue829\ue822\ue821\ue821\ue824\ue826\ue828", "\ud2b0\ud2b1\ud2bd\ud2b5\ud2b6\ud2b3\ud2bc\ud2b6", "\u55ba\u55ba\u55ba\u55bd\u55bd\u55b8\u55bd", "\ue2aa\ue2a7\ue2ab\ue2ad\ue2ac\ue2a7\ue2a8\ue2aa", "\ud3ea\ud3ec\ud3e2\ud3e3\ud3eb\ud3e3\ud3e2\ud3e9"}, d2={"\u0653\u0640\u0677\u262f\u061d\u061f\u0609\u066d\u064b\u0640\u0657\u0640\u060e\u064d\u0640\u064f\u0646\u060e\u0672\u0655\u0653\u0648\u064f\u0646\u061a\u0608\u066d\u064b\u0640\u0657\u0640\u060e\u064d\u0640\u064f\u0646\u060e\u0672\u0655\u0653\u0648\u064f\u0646\u061a", "\u059b\u05c4\u05cb\u05ce\u05c9\u05ce\u05d3\u0599\u059b\u0599\u058f\u058e\u05f1", "\u0189\u01dc\u01db\u01dc\u01c1\u018b\u0189\u018b\u019d\u019c\u01e3", "\u05da\u05d8\u05c9\u05fe\u05d1\u05dc\u05ce\u05ce\u0581\u0583\u0595\u0594\u05f1\u05d7\u05dc\u05cb\u05dc\u0592\u05d1\u05dc\u05d3\u05da\u0592\u05fe\u05d1\u05dc\u05ce\u05ce\u0586", "\u039e\u0397\u0385\u039e\u03b5\u0399\u0392\u0393\u03ca\u03c8\u03de\u03df\u03bf", "\u05fc\u05e8\u05ec\u05f8\u05f5\u05ea\u05a5\u05a7\u05b1\u05d5\u05f3\u05f8\u05ef\u05f8\u05b6\u05f5\u05f8\u05f7\u05fe\u05b6\u05d6\u05fb\u05f3\u05fc\u05fa\u05ed\u05a2\u05b0\u05c3", "\u024b\u0244\u0247\u0246\u024d\u0214\u0216\u0200\u0201\u0264\u0242\u0249\u025e\u0249\u0207\u0244\u0249\u0246\u024f\u0207\u0267\u024a\u0242\u024d\u024b\u025c\u0213", "\u071f\u0704\u0738\u071f\u0719\u0702\u0705\u070c\u0757\u0755\u0743\u0742\u0727\u0701\u070a\u071d\u070a\u0744\u0707\u070a\u0705\u070c\u0744\u0738\u071f\u0719\u0702\u0705\u070c\u0750", "\u0197\u0196\u018d\u0190\u019f\u0180\u01c5\u01c7\u01d1\u01d0\u01af", "\u05b6\u05b7\u05ac\u05b1\u05be\u05a1\u0599\u05b4\u05b4\u05e4\u05e6\u05f0\u05f1\u058e", "\u0783\u0795\u079d\u0780\u07c8\u07ca\u07dc\u07dd\u07a2", "\u023a\u022c\u0224\u0239\u0271\u0273\u0265\u0207\u0264\u021b", "\u05c9\u05df\u05d7\u05ca\u058e\u0582\u0580\u0596\u05f4\u0597\u05e8", "\u023e\u0228\u0220\u023d\u0275\u0277\u0261\u0203\u0200\u0260\u021f", "\u03d7\u03d8\u03df\u03d0\u03dd\u03d8\u03cb\u03d4\u038d\u038f\u0399\u0398\u03e7"})
public final class Class5697 {
    public static double field10956 = Double.longBitsToDouble(4597812242431888544L);

    private static String yaYLadQpdwOYNLX7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aF\u200e = "Grim";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite JbFxvJLWG9S1xH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5697.yaYLadQpdwOYNLX7(k2, -1914422502));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5697.yaYLadQpdwOYNLX7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5697.yaYLadQpdwOYNLX7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 51136 : 51137;
        block7: while (true) {
            switch (n3) {
                case 51137: {
                    n3 = 51135;
                    continue block7;
                }
                case 51136: {
                    throw new Exception("Can't find method in " + Class5697.yaYLadQpdwOYNLX7(k2, -1914422502) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

