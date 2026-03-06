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

@HACHIMI_CLIENT(mv=100, d1={"\u8757\u875c\u8758\u8758\u875e\u875e\u875b", "\u1d45\u1d46\u1d41\u1d43\u1d40\u1d44\u1d42\u1d43", "\u10f7\u10f1\u10f1\u10f3\u10f4\u10f4\u10fe\u10f6", "\ud12a\ud128\ud122\ud128\ud12b\ud128\ud12a\ud129", "\udc84\udc87\udc80\udc81\udc89\udc84\udc82", "\u9f49\u9f4e\u9f43\u9f43\u9f43\u9f4e\u9f4d\u9f4e", "\u93ca\u93c0\u93c1\u93c1\u93c8\u93cc\u93c8\u93cd", "\u2985\u2980\u2984\u2980\u2985\u2985\u2985\u2986", "\u6a20\u6a27\u6a20\u6a2a\u6a27\u6a26\u6a2a", "\u4712\u4710\u471f\u4712\u471f\u4717\u4715\u4716", "\u1a28\u1a29\u1a2a\u1a2e\u1a2b\u1a2f\u1a28\u1a2a", "\u94a7\u94a3\u94a9\u94a6\u94a1\u94a7\u94a7\u94a9", "\uccfe\uccfa\uccf3\uccfa\uccf2\uccff\uccf8\uccf2", "\udff3\udff6\udffc\udff3\udff4\udffc\udff1\udff3", "\u8849\u884d\u884e\u8848\u8848\u884d\u884e\u884d"}, d2={"\u0435\u0425\u043f\u245e\u046c\u046e\u0478\u041c\u043a\u0431\u0426\u0431\u047f\u043c\u0431\u043e\u0437\u047f\u0403\u0424\u0422\u0439\u043e\u0437\u046b\u0479\u041c\u043a\u0431\u0426\u0431\u047f\u043c\u0431\u043e\u0437\u047f\u0403\u0424\u0422\u0439\u043e\u0437\u046b", "\u0455\u040a\u0405\u0400\u0407\u0400\u041d\u0457\u0455\u0457\u0441\u0440\u043f", "`525(b`btu\n", "\u03e9\u03eb\u03fa\u03cd\u03e2\u03ef\u03fd\u03fd\u03b2\u03b0\u03a6\u03a7\u03c2\u03e4\u03ef\u03f8\u03ef\u03a1\u03e2\u03ef\u03e0\u03e9\u03a1\u03cd\u03e2\u03ef\u03fd\u03fd\u03b5", "*#1*\u0001-&'~|jk\u000b", "\u0394\u0380\u0384\u0390\u039d\u0382\u03cd\u03cf\u03d9\u03bd\u039b\u0390\u0387\u0390\u03de\u039d\u0390\u039f\u0396\u03de\u03be\u0393\u039b\u0394\u0392\u0385\u03ca\u03d8\u03ab", "\u05c5\u05ca\u05c9\u05c8\u05c3\u059a\u0598\u058e\u058f\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05e9\u05c4\u05cc\u05c3\u05c5\u05d2\u059d", "\u0792\u0789\u07b5\u0792\u0794\u078f\u0788\u0781\u07da\u07d8\u07ce\u07cf\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07b5\u0792\u0794\u078f\u0788\u0781\u07dd", "\u0006\u0007\u001c\u0001\u000e\u0011TV@A>", "\u07bc\u07bd\u07a6\u07bb\u07b4\u07ab\u0793\u07be\u07be\u07ee\u07ec\u07fa\u07fb\u0784", "\u07c6\u07d0\u07d8\u07c5\u078d\u078f\u0799\u0798\u07e7", "\u0651\u0647\u064f\u0652\u061a\u0618\u060e\u066c\u060f\u0670", "\u0135\u0123\u012b\u0136\u0172\u017e\u017c\u016a\u0108\u016b\u0114", "\u045a\u044c\u0444\u0459\u0411\u0413\u0405\u0467\u0464\u0404\u047b", "\u01f8\u01f7\u01f0\u01ff\u01f2\u01f7\u01e4\u01fb\u01a2\u01a0\u01b6\u01b7\u01c8"})
public final class Class1591 {
    public static double field5948;
    public static float field5949 = 0.4796492f;
    public static float field5950;
    public static double field5951;
    public static double field5952;
    public static double field5953;

    /*
     * WARNING - void declaration
     */
    private static CallSite i3KdCTaz9Fo2Iz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1591.ILO8M28JLIwKtDDg(k2, -457906099));
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
                int a2 = Integer.parseInt(Class1591.ILO8M28JLIwKtDDg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1591.ILO8M28JLIwKtDDg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1591.ILO8M28JLIwKtDDg(k2, -457906099) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String ILO8M28JLIwKtDDg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5953 = Double.longBitsToDouble(4534316178428997170L);
        field5948 = Double.longBitsToDouble(4600930462024081050L);
        field5950 = Float.intBitsToFloat(1059825817);
        field5951 = Double.longBitsToDouble(4605390794470378648L);
        field5952 = Double.longBitsToDouble(9221120237041090560L);
        aT\u200e = "Allows you to freely move the camera in third person";
    }
}

