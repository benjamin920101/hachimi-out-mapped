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
@HACHIMI_CLIENT(mv=100, d1={"\u6c68\u6c69\u6c6c\u6c68\u6c69\u6c6b\u6c67\u6c6b", "\ue4f8\ue4fc\ue4fa\ue4ff\ue4fa\ue4f9\ue4fb\ue4fd", "\uba0a\uba02\uba0e\uba08\uba0f\uba02\uba02", "\u13cf\u13ca\u13cf\u13c8\u13c8\u13c0\u13c1\u13c0", "\uc1dc\uc1df\uc1da\uc1dd\uc1de\uc1d8\uc1de\uc1d7", "\u5309\u5304\u5303\u5301\u5303\u5300\u5302", "\u469b\u469f\u4699\u469c\u469a\u4696\u4699\u4696", "\u4e1e\u4e13\u4e1d\u4e19\u4e1f\u4e1b\u4e12\u4e12", "\u8e3b\u8e38\u8e39\u8e37\u8e3e\u8e36\u8e39\u8e38", "\u483e\u483a\u4839\u483f\u483d\u483f\u4839\u483c", "\u0ef8\u0ef0\u0ef0\u0efc\u0efc\u0efa\u0ef1\u0ef9", "\u6684\u6689\u6684\u6686\u6681\u6689\u6683\u6681", "\u3528\u3528\u352d\u3528\u3529\u352f\u352f\u352f", "\ua638\ua631\ua63b\ua630\ua63b\ua638\ua63c", "\u83ad\u83aa\u83a7\u83a7\u83ad\u83a8\u83ab\u83ad"}, d2={"\u033a\u0300\u030f\u2358\u036a\u0368\u037e\u031a\u033c\u0337\u0320\u0337\u0379\u033a\u0337\u0338\u0331\u0379\u0305\u0322\u0324\u033f\u0338\u0331\u036d\u037f\u031a\u033c\u0337\u0320\u0337\u0379\u033a\u0337\u0338\u0331\u0379\u0305\u0322\u0324\u033f\u0338\u0331\u036d", "\u0407\u0458\u0457\u0452\u0455\u0452\u044f\u0405\u0407\u0405\u0413\u0412\u046d", "\u06c5\u0690\u0697\u0690\u068d\u06c7\u06c5\u06c7\u06d1\u06d0\u06af", "\u01a0\u01a2\u01b3\u0184\u01ab\u01a6\u01b4\u01b4\u01fb\u01f9\u01ef\u01ee\u018b\u01ad\u01a6\u01b1\u01a6\u01e8\u01ab\u01a6\u01a9\u01a0\u01e8\u0184\u01ab\u01a6\u01b4\u01b4\u01fc", "\u0146\u014f\u015d\u0146\u016d\u0141\u014a\u014b\u0112\u0110\u0106\u0107\u0167", "znj~sl#!7Su~i~0s~qx0P}uz|k$6E", "\u04cd\u04c2\u04c1\u04c0\u04cb\u0492\u0490\u0486\u0487\u04e2\u04c4\u04cf\u04d8\u04cf\u0481\u04c2\u04cf\u04c0\u04c9\u0481\u04e1\u04cc\u04c4\u04cb\u04cd\u04da\u0495", "\u0676\u066d\u0651\u0676\u0670\u066b\u066c\u0665\u063e\u063c\u062a\u062b\u064e\u0668\u0663\u0674\u0663\u062d\u066e\u0663\u066c\u0665\u062d\u0651\u0676\u0670\u066b\u066c\u0665\u0639", "\u00c9\u00c8\u00d3\u00ce\u00c1\u00de\u009b\u0099\u008f\u008e\u00f1", "\u049c\u049d\u0486\u049b\u0494\u048b\u04b3\u049e\u049e\u04ce\u04cc\u04da\u04db\u04a4", "\u03b4\u03a2\u03aa\u03b7\u03ff\u03fd\u03eb\u03ea\u0395", "\u07c3\u07d5\u07dd\u07c0\u0788\u078a\u079c\u07fe\u079d\u07e2", "\u0771\u0767\u076f\u0772\u0736\u073a\u0738\u072e\u074c\u072f\u0750", "\u0151\u0147\u014f\u0152\u011a\u0118\u010e\u016c\u016f\u010f\u0170", "\u07ee\u07e1\u07e6\u07e9\u07e4\u07e1\u07f2\u07ed\u07b4\u07b6\u07a0\u07a1\u07de"})
public final class Class4069 {
    public static int field9406 = 1012239620;
    public static int field9407 = 1;
    public static double field9408 = Double.longBitsToDouble(-4633428116958115554L);

    static {
        br\u200e = "PhasedOnly";
    }

    private static String yJbJND9DTJYq93Je(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 6O0W7VkGj3Y6el(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4069.yJbJND9DTJYq93Je(k2, -952095011));
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
                int a2 = Integer.parseInt(Class4069.yJbJND9DTJYq93Je(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4069.yJbJND9DTJYq93Je(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4069.yJbJND9DTJYq93Je(k2, -952095011) + " " + l2 + " " + m2);
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

