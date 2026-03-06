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

@HACHIMI_CLIENT(mv=100, d1={"\u101a\u101a\u1018\u101c\u1018\u101a\u101a\u101e", "\u6c1a\u6c1f\u6c1b\u6c1e\u6c1c\u6c1b\u6c1d\u6c19", "\u3d21\u3d26\u3d22\u3d26\u3d25\u3d21\u3d22\u3d20", "\u4f58\u4f5e\u4f5f\u4f5c\u4f59\u4f54\u4f5c\u4f5e", "\u44b1\u44b6\u44b2\u44b4\u44be\u44be\u44b5\u44b3", "\ua6a7\ua6ac\ua6a4\ua6a3\ua6a3\ua6a5\ua6a4\ua6ad", "\u67fc\u67f8\u67ff\u67ff\u67fb\u67fd\u67f1\u67f1", "\ubcb3\ubcb6\ubcb0\ubcb8\ubcb0\ubcb2\ubcb4\ubcb1", "\ude5d\ude52\ude5d\ude5a\ude52\ude5e\ude5a\ude5e", "\u3e17\u3e10\u3e10\u3e14\u3e10\u3e17\u3e13\u3e10", "\u2842\u2846\u284e\u2846\u284f\u2846\u284f", "\u318c\u318c\u318e\u318a\u3186\u3186\u318c\u318a", "\u1b7b\u1b7b\u1b78\u1b7d\u1b7d\u1b7c\u1b7c\u1b76", "\u796e\u796d\u796f\u7968\u796a\u796e\u796f\u796d", "\ua583\ua587\ua587\ua583\ua588\ua583\ua584", "\u4791\u4794\u4790\u4796\u4796\u4793\u4793\u4791", "\u1e80\u1e86\u1e85\u1e82\u1e85\u1e84"}, d2={"\u03e0\u03e3\u03e6\u239b\u03a9\u03ab\u03bd\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03c6\u03e1\u03e7\u03fc\u03fb\u03f2\u03ae\u03bc\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03c6\u03e1\u03e7\u03fc\u03fb\u03f2\u03ae", "\u07a7\u07a4\u07a6\u27dc\u07ee\u07ec\u07fa\u079e\u07b8\u07b3\u07a4\u07b3\u07fd\u07be\u07b3\u07bc\u07b5\u07fd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07e9\u07fb\u079e\u07b8\u07b3\u07a4\u07b3\u07fd\u07be\u07b3\u07bc\u07b5\u07fd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07e9", "DGD\u203f\r\u000f\u0019}[PGP\u001e]P_V\u001ebECX_V\n\u0018}[PGP\u001e]P_V\u001ebECX_V\n", "\u01a7\u01f8\u01f7\u01f2\u01f5\u01f2\u01ef\u01a5\u01a7\u01a5\u01b3\u01b2\u01cd", "\u00d4\u0081\u0086\u0081\u009c\u00d6\u00d4\u00d6\u00c0\u00c1\u00be", "\u00c1\u00c3\u00d2\u00e5\u00ca\u00c7\u00d5\u00d5\u009a\u0098\u008e\u008f\u00ea\u00cc\u00c7\u00d0\u00c7\u0089\u00ca\u00c7\u00c8\u00c1\u0089\u00e5\u00ca\u00c7\u00d5\u00d5\u009d", "\u030a\u0303\u0311\u030a\u0321\u030d\u0306\u0307\u035e\u035c\u034a\u034b\u032b", "\u045c\u0448\u044c\u0458\u0455\u044a\u0405\u0407\u0411\u0475\u0453\u0458\u044f\u0458\u0416\u0455\u0458\u0457\u045e\u0416\u0476\u045b\u0453\u045c\u045a\u044d\u0402\u0410\u0463", "\u00fe\u00f1\u00f2\u00f3\u00f8\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00d2\u00ff\u00f7\u00f8\u00fe\u00e9\u00a6", "\u0436\u042d\u0411\u0436\u0430\u042b\u042c\u0425\u047e\u047c\u046a\u046b\u040e\u0428\u0423\u0434\u0423\u046d\u042e\u0423\u042c\u0425\u046d\u0411\u0436\u0430\u042b\u042c\u0425\u0479", "\u03df\u03de\u03c5\u03d8\u03d7\u03c8\u038d\u038f\u0399\u0398\u03e7", "\u018e\u018f\u0194\u0189\u0186\u0199\u01a1\u018c\u018c\u01dc\u01de\u01c8\u01c9\u01b6", "\u0766\u0770\u0778\u0765\u072d\u072f\u0739\u0738\u0747", "h~vk#!7U6I", "\u04a6\u04b0\u04b8\u04a5\u04e1\u04ed\u04ef\u04f9\u049b\u04f8\u0487", "\u0110\u0106\u010e\u0113\u015b\u0159\u014f\u012d\u012e\u014e\u0131", "\u078c\u0783\u0784\u078b\u0786\u0783\u0790\u078f\u07d6\u07d4\u07c2\u07c3\u07bc"})
public final class Class1363 {
    public static double field5251;
    public static float field5252 = 0.9780586f;
    public static double field5253;
    public static float field5254;
    public static String field5255;

    static {
        field5253 = Double.longBitsToDouble(4606315077695324866L);
        field5255 = "configs";
        aw\u200e = "Delay";
        field5254 = Float.intBitsToFloat(1053732314);
        field5251 = Double.longBitsToDouble(4597545308740515320L);
        bT\u200e = "BPT";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite I9YvDWSs4roNuG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1363.jnMLVawFlST8DSSH(k2, 159503603));
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
                int a2 = Integer.parseInt(Class1363.jnMLVawFlST8DSSH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1363.jnMLVawFlST8DSSH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1363.jnMLVawFlST8DSSH(k2, 159503603) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String jnMLVawFlST8DSSH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

