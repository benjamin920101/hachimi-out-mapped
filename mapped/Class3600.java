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

@HACHIMI_CLIENT(mv=100, d1={"\u1f55\u1f50\u1f57\u1f53\u1f50\u1f54\u1f50", "\ua08c\ua085\ua088\ua08b\ua08e\ua08e\ua08a\ua08b", "\u1dc3\u1dcf\u1dc4\u1dc7\u1dcf\u1dc4\u1dce\u1dcf", "\u61aa\u61a9\u61ab\u61aa\u61ae\u61a9\u61a4", "\u0d1b\u0d12\u0d17\u0d14\u0d12\u0d10\u0d14", "\udfb6\udfb7\udfb0\udfb2\udfb0\udfb6\udfb1\udfb6", "\ucb82\ucb83\ucb84\ucb83\ucb83\ucb8f\ucb87\ucb85", "\ub7be\ub7b4\ub7bf\ub7b5\ub7ba\ub7bd\ub7be\ub7bc", "\u936a\u936e\u936f\u936d\u936a\u9369\u936e", "\u1bf5\u1bf7\u1bf4\u1bf3\u1bf4\u1bf4\u1bf0", "\u9813\u9814\u9813\u9818\u9810\u9810\u9810\u9812", "\ua771\ua772\ua77a\ua77b\ua771\ua771\ua776\ua776", "\ud25c\ud258\ud25a\ud25a\ud25b\ud25d\ud25d\ud25b", "\u057e\u0571\u057d\u057e\u057b\u0571\u057a\u0570", "\ubbe7\ubbe5\ubbe3\ubbe6\ubbe1\ubbef\ubbe0\ubbee"}, d2={"\u07b6\u0781\u07a5\u27c8\u07fa\u07f8\u07ee\u078a\u07ac\u07a7\u07b0\u07a7\u07e9\u07aa\u07a7\u07a8\u07a1\u07e9\u0795\u07b2\u07b4\u07af\u07a8\u07a1\u07fd\u07ef\u078a\u07ac\u07a7\u07b0\u07a7\u07e9\u07aa\u07a7\u07a8\u07a1\u07e9\u0795\u07b2\u07b4\u07af\u07a8\u07a1\u07fd", "\u0155\u010a\u0105\u0100\u0107\u0100\u011d\u0157\u0155\u0157\u0141\u0140\u013f", "\u05d6\u0583\u0584\u0583\u059e\u05d4\u05d6\u05d4\u05c2\u05c3\u05bc", "\u051c\u051e\u050f\u0538\u0517\u051a\u0508\u0508\u0547\u0545\u0553\u0552\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0538\u0517\u051a\u0508\u0508\u0540", "\u0223\u022a\u0238\u0223\u0208\u0224\u022f\u022e\u0277\u0275\u0263\u0262\u0202", "\u0127\u0133\u0137\u0123\u012e\u0131\u017e\u017c\u016a\u010e\u0128\u0123\u0134\u0123\u016d\u012e\u0123\u012c\u0125\u016d\u010d\u0120\u0128\u0127\u0121\u0136\u0179\u016b\u0118", "\u020a\u0205\u0206\u0207\u020c\u0255\u0257\u0241\u0240\u0225\u0203\u0208\u021f\u0208\u0246\u0205\u0208\u0207\u020e\u0246\u0226\u020b\u0203\u020c\u020a\u021d\u0252", "\u0330\u032b\u0317\u0330\u0336\u032d\u032a\u0323\u0378\u037a\u036c\u036d\u0308\u032e\u0325\u0332\u0325\u036b\u0328\u0325\u032a\u0323\u036b\u0317\u0330\u0336\u032d\u032a\u0323\u037f", "\u01ff\u01fe\u01e5\u01f8\u01f7\u01e8\u01ad\u01af\u01b9\u01b8\u01c7", "\u0657\u0656\u064d\u0650\u065f\u0640\u0678\u0655\u0655\u0605\u0607\u0611\u0610\u066f", "\u0464\u0472\u047a\u0467\u042f\u042d\u043b\u043a\u0445", "\u0663\u0675\u067d\u0660\u0628\u062a\u063c\u065e\u063d\u0642", "\u024f\u0259\u0251\u024c\u0208\u0204\u0206\u0210\u0272\u0211\u026e", "\u012b\u013d\u0135\u0128\u0160\u0162\u0174\u0116\u0115\u0175\u010a", "\u0328\u0327\u0320\u032f\u0322\u0327\u0334\u032b\u0372\u0370\u0366\u0367\u0318"})
public final class Class3600 {
    public static float field8029;
    public static float field8030;
    public static float field8031 = 0.06855643f;
    public static float field8032;

    private static String IrNtnpDziyBGP4le(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite pCa9ZPPtNvrU6O(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3600.IrNtnpDziyBGP4le(k2, -722342409));
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
                int a2 = Integer.parseInt(Class3600.IrNtnpDziyBGP4le(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3600.IrNtnpDziyBGP4le(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3600.IrNtnpDziyBGP4le(k2, -722342409) + " " + l2 + " " + m2);
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
        field8032 = Float.intBitsToFloat(1062855936);
        P\u200e = "Could not save file for waypoints.json!";
        field8030 = Float.intBitsToFloat(1064927866);
        field8029 = Float.intBitsToFloat(0x40200000);
    }
}

