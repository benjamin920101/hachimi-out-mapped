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

@HACHIMI_CLIENT(mv=100, d1={"\ub2d2\ub2d0\ub2d4\ub2d2\ub2dd\ub2d1\ub2d3\ub2d5", "\uaee7\uaee0\uaeed\uaee0\uaee1\uaee5\uaee1\uaeec", "\ue247\ue246\ue247\ue244\ue244\ue246\ue24c", "\u2a92\u2a91\u2a92\u2a93\u2a94\u2a95\u2a93\u2a97", "\u2da7\u2da0\u2da2\u2da3\u2da7\u2dac\u2da0\u2da6", "\u9430\u943a\u943b\u9430\u9431\u9432\u9431\u9437", "\u4b79\u4b7e\u4b7e\u4b7d\u4b7b\u4b78\u4b79\u4b7e", "\u3e5f\u3e5c\u3e58\u3e53\u3e5d\u3e59\u3e5e\u3e59", "\u0fb1\u0fb3\u0fbb\u0fb0\u0fb4\u0fb7\u0fb0\u0fb0", "\u9d11\u9d14\u9d12\u9d1d\u9d1c\u9d13\u9d1d\u9d13", "\u2ca2\u2ca3\u2ca2\u2ca9\u2ca8\u2ca1\u2ca9\u2ca5", "\u9693\u9691\u9693\u9699\u9696\u9698\u9695\u9690", "\ue0ae\ue0ab\ue0a3\ue0a2\ue0af\ue0ac\ue0a8\ue0ac", "\u718d\u718b\u7184\u718f\u718a\u718a\u7189\u7185"}, d2={"\u06ea\u06b5\u06ba\u06bf\u06b8\u06bf\u06a2\u06e8\u06ea\u06e8\u06fe\u06ff\u0680", "\u05d3\u0586\u0581\u0586\u059b\u05d1\u05d3\u05d1\u05c7\u05c6\u05b9", "\u02e5\u02e7\u02f6\u02c1\u02ee\u02e3\u02f1\u02f1\u02be\u02bc\u02aa\u02ab\u02ce\u02e8\u02e3\u02f4\u02e3\u02ad\u02ee\u02e3\u02ec\u02e5\u02ad\u02c1\u02ee\u02e3\u02f1\u02f1\u02b9", "\u0425\u042c\u043e\u0425\u040e\u0422\u0429\u0428\u0471\u0473\u0465\u0464\u0404", "\u05f1\u05e5\u05e1\u05f5\u05f8\u05e7\u05a8\u05aa\u05bc\u05d8\u05fe\u05f5\u05e2\u05f5\u05bb\u05f8\u05f5\u05fa\u05f3\u05bb\u05db\u05f6\u05fe\u05f1\u05f7\u05e0\u05af\u05bd\u05ce", "\u017f\u0170\u0173\u0172\u0179\u0120\u0122\u0134\u0135\u0150\u0176\u017d\u016a\u017d\u0133\u0170\u017d\u0172\u017b\u0133\u0153\u017e\u0176\u0179\u017f\u0168\u0127", "\u01e6\u01fd\u01c1\u01e6\u01e0\u01fb\u01fc\u01f5\u01ae\u01ac\u01ba\u01bb\u01de\u01f8\u01f3\u01e4\u01f3\u01bd\u01fe\u01f3\u01fc\u01f5\u01bd\u01c1\u01e6\u01e0\u01fb\u01fc\u01f5\u01a9", "\u0333\u0332\u0329\u0334\u033b\u0324\u0361\u0363\u0375\u0374\u030b", "\u0794\u0795\u078e\u0793\u079c\u0783\u07bb\u0796\u0796\u07c6\u07c4\u07d2\u07d3\u07ac", "\u0502\u0514\u051c\u0501\u0549\u054b\u055d\u055c\u0523", "\u018d\u019b\u0193\u018e\u01c6\u01c4\u01d2\u01b0\u01d3\u01ac", "\u06eb\u06fd\u06f5\u06e8\u06ac\u06a0\u06a2\u06b4\u06d6\u06b5\u06ca", "\u064f\u0659\u0651\u064c\u0604\u0606\u0610\u0672\u0671\u0611\u066e", "\u039b\u0394\u0393\u039c\u0391\u0394\u0387\u0398\u03c1\u03c3\u03d5\u03d4\u03ab"})
public final class Class5452 {
    public static int field10194 = -59838739;
    public static int field10195 = 61301124;
    public static float field10196 = 0.67988247f;
    public static double field10197 = 0.5173681798824854;
    public static float field10198;
    public static float field10199;
    public static float field10200;

    private static String VGJywobEiSCjcKuo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10200 = Float.intBitsToFloat(1060645266);
        field10198 = Float.intBitsToFloat(1055552896);
        field10199 = Float.intBitsToFloat(1052506310);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite nFW7jD0MTYyQEa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5452.VGJywobEiSCjcKuo(k2, 542040432));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 8947 : 8948;
        block6: while (true) {
            switch (n3) {
                case 8948: {
                    n3 = 8946;
                    continue block6;
                }
                case 8947: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5452.VGJywobEiSCjcKuo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5452.VGJywobEiSCjcKuo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5452.VGJywobEiSCjcKuo(k2, 542040432) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

