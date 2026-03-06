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

@HACHIMI_CLIENT(mv=100, d1={"\u8048\u8040\u804b\u8048\u8049\u804b\u804d\u804a", "\u2d3d\u2d3f\u2d3c\u2d3f\u2d32\u2d32\u2d32\u2d3b", "\u1abf\u1abd\u1ab9\u1ab0\u1ab9\u1ab8\u1abb\u1abc", "\udadf\udada\udad2\udad9\udadf\udadd\udada\udadf", "\udeb0\udeb1\udeb8\udeb4\udeb4\udeb9\udeb8\udeb3", "\u7ea2\u7ea5\u7eaa\u7ea7\u7ea5\u7ea6\u7eaa\u7ea2", "\uba91\uba92\uba90\uba97\uba94\uba90\uba9a", "\u7e83\u7e80\u7e85\u7e83\u7e8a\u7e82\u7e85\u7e87", "\u4ed1\u4ed2\u4ed0\u4ed1\u4ed3\u4ed3\u4edd\u4ed6", "\udc2e\udc2b\udc2f\udc24\udc2a\udc2b\udc24", "\uc70b\uc70c\uc70d\uc70b\uc70b\uc70b\uc701\uc70a", "\u247c\u247a\u247b\u247d\u247c\u247b\u2479\u247d", "\u71ef\u71ec\u71ed\u71e2\u71ec\u71e3\u71ec\u71ed", "\ud2d4\ud2d5\ud2d6\ud2d2\ud2d4\ud2df\ud2df\ud2d4", "\u3fcb\u3fcb\u3fcd\u3fcf\u3fc8\u3fc9\u3fc8\u3fc8"}, d2={"\u06af\u06a3\u068a\u26d4\u06e6\u06e4\u06f2\u0696\u06b0\u06bb\u06ac\u06bb\u06f5\u06b6\u06bb\u06b4\u06bd\u06f5\u0689\u06ae\u06a8\u06b3\u06b4\u06bd\u06e1\u06f3\u0696\u06b0\u06bb\u06ac\u06bb\u06f5\u06b6\u06bb\u06b4\u06bd\u06f5\u0689\u06ae\u06a8\u06b3\u06b4\u06bd\u06e1", "\u07f5\u07aa\u07a5\u07a0\u07a7\u07a0\u07bd\u07f7\u07f5\u07f7\u07e1\u07e0\u079f", "\u0516\u0543\u0544\u0543\u055e\u0514\u0516\u0514\u0502\u0503\u057c", "\u07dc\u07de\u07cf\u07f8\u07d7\u07da\u07c8\u07c8\u0787\u0785\u0793\u0792\u07f7\u07d1\u07da\u07cd\u07da\u0794\u07d7\u07da\u07d5\u07dc\u0794\u07f8\u07d7\u07da\u07c8\u07c8\u0780", "\u0384\u038d\u039f\u0384\u03af\u0383\u0388\u0389\u03d0\u03d2\u03c4\u03c5\u03a5", "\u0511\u0505\u0501\u0515\u0518\u0507\u0548\u054a\u055c\u0538\u051e\u0515\u0502\u0515\u055b\u0518\u0515\u051a\u0513\u055b\u053b\u0516\u051e\u0511\u0517\u0500\u054f\u055d\u052e", "\u0220\u022f\u022c\u022d\u0226\u027f\u027d\u026b\u026a\u020f\u0229\u0222\u0235\u0222\u026c\u022f\u0222\u022d\u0224\u026c\u020c\u0221\u0229\u0226\u0220\u0237\u0278", "\u078a\u0791\u07ad\u078a\u078c\u0797\u0790\u0799\u07c2\u07c0\u07d6\u07d7\u07b2\u0794\u079f\u0788\u079f\u07d1\u0792\u079f\u0790\u0799\u07d1\u07ad\u078a\u078c\u0797\u0790\u0799\u07c5", "\u035b\u035a\u0341\u035c\u0353\u034c\u0309\u030b\u031d\u031c\u0363", "\u06d4\u06d5\u06ce\u06d3\u06dc\u06c3\u06fb\u06d6\u06d6\u0686\u0684\u0692\u0693\u06ec", "#5= hj|}\u0002", "\u01c0\u01d6\u01de\u01c3\u018b\u0189\u019f\u01fd\u019e\u01e1", "\u0725\u0733\u073b\u0726\u0762\u076e\u076c\u077a\u0718\u077b\u0704", "\u01f9\u01ef\u01e7\u01fa\u01b2\u01b0\u01a6\u01c4\u01c7\u01a7\u01d8", "\u063e\u0631\u0636\u0639\u0634\u0631\u0622\u063d\u0664\u0666\u0670\u0671\u060e"})
public final class Class3959 {
    public static float field9013 = Float.intBitsToFloat(1063241393);

    private static String lu9k1usrsOWae4T4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite OdJJ7QCXGkVv0W(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3959.lu9k1usrsOWae4T4(k2, -409587387));
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
                int a2 = Integer.parseInt(Class3959.lu9k1usrsOWae4T4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3959.lu9k1usrsOWae4T4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3959.lu9k1usrsOWae4T4(k2, -409587387) + " " + l2 + " " + m2);
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
        Z\u200e = "\u00a7f, ";
    }
}

