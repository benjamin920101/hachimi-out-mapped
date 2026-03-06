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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u25b4\u25b4\u25b0\u25b0\u25bf\u25b3\u25b5\u25b1", "\ubbb5\ubbb2\ubbb4\ubbb7\ubbba\ubbb3\ubbb6\ubbb6", "\ua9e0\ua9e2\ua9eb\ua9e7\ua9e5\ua9ea\ua9e2\ua9e0", "\u753f\u753d\u7539\u7538\u7535\u753d\u753c\u753b", "\ua4f3\ua4f3\ua4fc\ua4fd\ua4f1\ua4f7\ua4f1\ua4fc", "\u4f51\u4f57\u4f53\u4f56\u4f56\u4f56\u4f55\u4f52", "\uafe6\uafe3\uafe6\uafe5\uafe1\uafe8\uafe8\uafe4", "\uafc3\uafc1\uafc6\uafc3\uafc3\uafc3\uafc5\uafc0", "\ua759\ua757\ua758\ua75d\ua757\ua75a\ua75d", "\u5bc8\u5bc9\u5bca\u5bc8\u5bc8\u5bce\u5bcd\u5bcc", "\ubb71\ubb72\ubb74\ubb7e\ubb71\ubb72\ubb71", "\u0de4\u0de1\u0de7\u0de7\u0de2\u0dea\u0de7\u0de5", "\ubedc\ubed6\ubedd\ubedd\ubed6\ubeda\ubedb\ubedd", "\u3331\u3331\u3331\u333b\u3334\u3330\u3334\u3334"}, d2={"\u039d\u03c2\u03cd\u03c8\u03cf\u03c8\u03d5\u039f\u039d\u039f\u0389\u0388\u03f7", "\u0141\u0114\u0113\u0114\u0109\u0143\u0141\u0143\u0155\u0154\u012b", "\u042d\u042f\u043e\u0409\u0426\u042b\u0439\u0439\u0476\u0474\u0462\u0463\u0406\u0420\u042b\u043c\u042b\u0465\u0426\u042b\u0424\u042d\u0465\u0409\u0426\u042b\u0439\u0439\u0471", "\u0172\u017b\u0169\u0172\u0159\u0175\u017e\u017f\u0126\u0124\u0132\u0133\u0153", "\u0246\u0252\u0256\u0242\u024f\u0250\u021f\u021d\u020b\u026f\u0249\u0242\u0255\u0242\u020c\u024f\u0242\u024d\u0244\u020c\u026c\u0241\u0249\u0246\u0240\u0257\u0218\u020a\u0279", "4;892ki\u007f~\u001b=6!6x;690x\u00185=24#l", "D_cDBY^W\f\u000e\u0018\u0019|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b", "\u05f8\u05f9\u05e2\u05ff\u05f0\u05ef\u05aa\u05a8\u05be\u05bf\u05c0", "\u0376\u0377\u036c\u0371\u037e\u0361\u0359\u0374\u0374\u0324\u0326\u0330\u0331\u034e", "\u0514\u0502\u050a\u0517\u055f\u055d\u054b\u054a\u0535", "\u0450\u0446\u044e\u0453\u041b\u0419\u040f\u046d\u040e\u0471", "\u07bd\u07ab\u07a3\u07be\u07fa\u07f6\u07f4\u07e2\u0780\u07e3\u079c", "\u053a\u052c\u0524\u0539\u0571\u0573\u0565\u0507\u0504\u0564\u051b", "\u030c\u0303\u0304\u030b\u0306\u0303\u0310\u030f\u0356\u0354\u0342\u0343\u033c"})
public final class Class1323 {
    public static float field5124;
    public static float field5125 = 0.13007009f;
    public static double field5126;

    private static String jMvDBYdafqlnUROY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 0OBjf7cE2yNc2i(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1323.jMvDBYdafqlnUROY(k2, -48551598));
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
                int a2 = Integer.parseInt(Class1323.jMvDBYdafqlnUROY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1323.jMvDBYdafqlnUROY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1323.jMvDBYdafqlnUROY(k2, -48551598) + " " + l2 + " " + m2);
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
        field5126 = Double.longBitsToDouble(4601019373848234278L);
        field5124 = Float.intBitsToFloat(1062650206);
    }
}

