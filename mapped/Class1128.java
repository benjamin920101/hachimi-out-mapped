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

@HACHIMI_CLIENT(mv=100, d1={"\u4597\u4591\u4593\u4592\u4591\u4591\u4597\u4592", "\u8b88\u8b8d\u8b8e\u8b85\u8b88\u8b8b\u8b8c", "\u601a\u601d\u6017\u601f\u6016\u601f\u601d\u601f", "\u6b71\u6b77\u6b77\u6b70\u6b76\u6b76\u6b72\u6b71", "\u24cd\u24ce\u24cf\u24cf\u24cb\u24cb\u24ca\u24cb", "\u2e1f\u2e14\u2e1b\u2e14\u2e1f\u2e18\u2e1e\u2e1b", "\uc464\uc464\uc467\uc465\uc467\uc466\uc460\uc465", "\ud3ab\ud3af\ud3ae\ud3ad\ud3aa\ud3a7\ud3a8\ud3a8", "\ub88a\ub88f\ub889\ub887\ub888\ub889\ub88b\ub88f", "\u0e19\u0e1d\u0e1e\u0e1a\u0e1f\u0e1e\u0e18\u0e18", "\u985e\u985b\u9851\u985c\u985b\u985e\u985f\u985f", "\uad0b\uad0d\uad0e\uad09\uad0e\uad03\uad03\uad0a", "\u22d5\u22df\u22d2\u22de\u22d1\u22d5\u22de\u22d2", "\uc2f5\uc2f1\uc2f8\uc2f0\uc2f4\uc2f8\uc2f8\uc2f9", "\uc6a6\uc6a3\uc6a3\uc6a0\uc6a0\uc6ac\uc6a0\uc6a5", "\u6e72\u6e7f\u6e7f\u6e75\u6e70\u6e7f\u6e7f\u6e70"}, d2={"\u0252\u0275\u025c\u223e\u020c\u020e\u0218\u027c\u025a\u0251\u0246\u0251\u021f\u025c\u0251\u025e\u0257\u021f\u0263\u0244\u0242\u0259\u025e\u0257\u020b\u0219\u027c\u025a\u0251\u0246\u0251\u021f\u025c\u0251\u025e\u0257\u021f\u0263\u0244\u0242\u0259\u025e\u0257\u020b", "\u008e\u00a9\u0081\u20e2\u00d0\u00d2\u00c4\u00a0\u0086\u008d\u009a\u008d\u00c3\u0080\u008d\u0082\u008b\u00c3\u00bf\u0098\u009e\u0085\u0082\u008b\u00d7\u00c5\u00a0\u0086\u008d\u009a\u008d\u00c3\u0080\u008d\u0082\u008b\u00c3\u00bf\u0098\u009e\u0085\u0082\u008b\u00d7", "\u02ef\u02b0\u02bf\u02ba\u02bd\u02ba\u02a7\u02ed\u02ef\u02ed\u02fb\u02fa\u0285", "\u049a\u04cf\u04c8\u04cf\u04d2\u0498\u049a\u0498\u048e\u048f\u04f0", "\u022d\u022f\u023e\u0209\u0226\u022b\u0239\u0239\u0276\u0274\u0262\u0263\u0206\u0220\u022b\u023c\u022b\u0265\u0226\u022b\u0224\u022d\u0265\u0209\u0226\u022b\u0239\u0239\u0271", "\u0500\u0509\u051b\u0500\u052b\u0507\u050c\u050d\u0554\u0556\u0540\u0541\u0521", "\u0122\u0136\u0132\u0126\u012b\u0134\u017b\u0179\u016f\u010b\u012d\u0126\u0131\u0126\u0168\u012b\u0126\u0129\u0120\u0168\u0108\u0125\u012d\u0122\u0124\u0133\u017c\u016e\u011d", "\u00a7\u00a8\u00ab\u00aa\u00a1\u00f8\u00fa\u00ec\u00ed\u0088\u00ae\u00a5\u00b2\u00a5\u00eb\u00a8\u00a5\u00aa\u00a3\u00eb\u008b\u00a6\u00ae\u00a1\u00a7\u00b0\u00ff", "\u06be\u06a5\u0699\u06be\u06b8\u06a3\u06a4\u06ad\u06f6\u06f4\u06e2\u06e3\u0686\u06a0\u06ab\u06bc\u06ab\u06e5\u06a6\u06ab\u06a4\u06ad\u06e5\u0699\u06be\u06b8\u06a3\u06a4\u06ad\u06f1", "\u0356\u0357\u034c\u0351\u035e\u0341\u0304\u0306\u0310\u0311\u036e", "\u04a2\u04a3\u04b8\u04a5\u04aa\u04b5\u048d\u04a0\u04a0\u04f0\u04f2\u04e4\u04e5\u049a", "\u0474\u0462\u046a\u0477\u043f\u043d\u042b\u042a\u0455", "\u0596\u0580\u0588\u0595\u05dd\u05df\u05c9\u05ab\u05c8\u05b7", "\u0586\u0590\u0598\u0585\u05c1\u05cd\u05cf\u05d9\u05bb\u05d8\u05a7", "\u01c1\u01d7\u01df\u01c2\u018a\u0188\u019e\u01fc\u01ff\u019f\u01e0", "\u0122\u012d\u012a\u0125\u0128\u012d\u013e\u0121\u0178\u017a\u016c\u016d\u0112"})
public final class Class1128 {
    public static double field4531;
    public static float field4532;
    public static float field4533;

    static {
        field4533 = Float.intBitsToFloat(1055019154);
        field4532 = Float.intBitsToFloat(1058272840);
        ad\u200e = "EncryptKey";
        field4531 = Double.longBitsToDouble(4603229044528357311L);
        bk\u200e = "Glow";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite iPenBvwJ3vpPBg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1128.rAhcAJwTGWBZqq4E(k2, -1395255315));
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
                int a2 = Integer.parseInt(Class1128.rAhcAJwTGWBZqq4E(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1128.rAhcAJwTGWBZqq4E(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1128.rAhcAJwTGWBZqq4E(k2, -1395255315) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String rAhcAJwTGWBZqq4E(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

