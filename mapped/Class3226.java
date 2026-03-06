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

@HACHIMI_CLIENT(mv=100, d1={"\u6d8b\u6d8e\u6d8e\u6d81\u6d88\u6d8f\u6d8c\u6d88", "\ua08f\ua08d\ua08a\ua082\ua08c\ua083\ua089\ua089", "\ue3d9\ue3d9\ue3dc\ue3d1\ue3db\ue3da\ue3d0\ue3d0", "\u9dc2\u9dc5\u9dc2\u9dc1\u9dc3\u9dcb\u9dc1\u9dc6", "\u5ad4\u5ad7\u5ad7\u5ade\u5ade\u5ad2\u5ad2\u5ad1", "\ua0d4\ua0de\ua0df\ua0d5\ua0d2\ua0d5\ua0d1\ua0d0", "\ud8df\ud8da\ud8d4\ud8df\ud8d5\ud8df\ud8dd\ud8d4", "\ub0d2\ub0d3\ub0d7\ub0d4\ub0d8\ub0d9\ub0d6\ub0d6", "\ud77c\ud778\ud779\ud776\ud77a\ud77e\ud77b\ud77c", "\u3ac1\u3ac4\u3ac0\u3aca\u3ac7\u3ac1\u3ac2\u3ac1", "\uba46\uba40\uba45\uba43\uba42\uba47\uba41\uba4c", "\u9b9f\u9b9d\u9b9d\u9b9e\u9b94\u9b9a\u9b9c\u9b9a", "\uc15e\uc158\uc15d\uc15b\uc154\uc15d\uc15e\uc15e", "\uc4f3\uc4f6\uc4f6\uc4f7\uc4fe\uc4f0\uc4ff\uc4f1", "\uc03d\uc03f\uc03f\uc039\uc039\uc03e\uc03e"}, d2={"\u0365\u034c\u036f\u231b\u0329\u032b\u033d\u0359\u037f\u0374\u0363\u0374\u033a\u0379\u0374\u037b\u0372\u033a\u0346\u0361\u0367\u037c\u037b\u0372\u032e\u033c\u0359\u037f\u0374\u0363\u0374\u033a\u0379\u0374\u037b\u0372\u033a\u0346\u0361\u0367\u037c\u037b\u0372\u032e", "a>1434)cacut\u000b", "\u020e\u025b\u025c\u025b\u0246\u020c\u020e\u020c\u021a\u021b\u0264", "\u035d\u035f\u034e\u0379\u0356\u035b\u0349\u0349\u0306\u0304\u0312\u0313\u0376\u0350\u035b\u034c\u035b\u0315\u0356\u035b\u0354\u035d\u0315\u0379\u0356\u035b\u0349\u0349\u0301", "\u0000\t\u001b\u0000+\u0007\f\rTV@A!", "\u0096\u0082\u0086\u0092\u009f\u0080\u00cf\u00cd\u00db\u00bf\u0099\u0092\u0085\u0092\u00dc\u009f\u0092\u009d\u0094\u00dc\u00bc\u0091\u0099\u0096\u0090\u0087\u00c8\u00da\u00a9", "\u0138\u0137\u0134\u0135\u013e\u0167\u0165\u0173\u0172\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0114\u0139\u0131\u013e\u0138\u012f\u0160", "\u0012\t5\u0012\u0014\u000f\b\u0001ZXNO*\f\u0007\u0010\u0007I\n\u0007\b\u0001I5\u0012\u0014\u000f\b\u0001]", "\u064c\u064d\u0656\u064b\u0644\u065b\u061e\u061c\u060a\u060b\u0674", "\u03d7\u03d6\u03cd\u03d0\u03df\u03c0\u03f8\u03d5\u03d5\u0385\u0387\u0391\u0390\u03ef", "\u04f0\u04e6\u04ee\u04f3\u04bb\u04b9\u04af\u04ae\u04d1", "j|ti!#5W4K", "\u0683\u0695\u069d\u0680\u06c4\u06c8\u06ca\u06dc\u06be\u06dd\u06a2", "UCKV\u001e\u001c\nhk\u000bt", "\u01f2\u01fd\u01fa\u01f5\u01f8\u01fd\u01ee\u01f1\u01a8\u01aa\u01bc\u01bd\u01c2"})
public final class Class3226 {
    public static double field6920;
    public static double field6921;
    public static float field6922;
    public static int field6923 = -1041140114;
    public static double field6924;

    private static String lbDnJVAivrMgJcRH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite aJ9tXFWIrnIDeq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3226.lbDnJVAivrMgJcRH(k2, -738489237));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 48711 : 48710;
        while (true) {
            int n4 = n3;
            if (n4 == 48710) throw new Exception("Outdated metadata version");
            if (n4 != 48711) break;
            n3 = 48709;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block7: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3226.lbDnJVAivrMgJcRH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n5 = e2 % 59557 == m2.intValue() ? 47988 : 47989;
            block8: while (true) {
                switch (n5) {
                    case 47989: {
                        n5 = 47987;
                        continue block8;
                    }
                    case 47988: {
                        String c2 = Class3226.lbDnJVAivrMgJcRH(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block7;
                    }
                    default: {
                        continue block7;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3226.lbDnJVAivrMgJcRH(k2, -738489237) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field6921 = Double.longBitsToDouble(4603678619961794490L);
        field6924 = Double.longBitsToDouble(4593649142342018880L);
        field6920 = Double.longBitsToDouble(4588159417462038272L);
        field6922 = Float.intBitsToFloat(1064024037);
        bM\u200e = "AutoCrystal";
    }
}

