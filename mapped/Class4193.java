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

@HACHIMI_CLIENT(mv=100, d1={"\u2827\u2824\u2823\u2823\u2823\u2824\u2820\u2821", "\ue0e5\ue0e2\ue0e0\ue0e7\ue0e5\ue0e0\ue0e1", "\u9f24\u9f22\u9f25\u9f24\u9f21\u9f21\u9f22\u9f25", "\ue371\ue375\ue379\ue370\ue370\ue373\ue373\ue378", "\u1c12\u1c17\u1c12\u1c16\u1c16\u1c12\u1c13\u1c14", "\u23d0\u23d8\u23d1\u23d1\u23d6\u23d9\u23d7\u23d9", "\ua973\ua970\ua974\ua976\ua973\ua973\ua97e\ua973", "\u53c0\u53c4\u53c9\u53c1\u53c5\u53c1\u53c8\u53c5", "\uae74\uae70\uae74\uae77\uae70\uae75\uae70\uae75", "\u603c\u603f\u603c\u603f\u603c\u603e\u603a\u603a", "\u75da\u75db\u75dd\u75d7\u75d9\u75d9\u75de\u75d7", "\uc6e3\uc6ee\uc6ee\uc6ef\uc6e5\uc6e4\uc6e7\uc6ee", "\u5676\u5675\u5670\u5677\u5672\u5675\u567a\u5671", "\udf8f\udf8b\udf8f\udf85\udf85\udf89\udf8d\udf89", "\ub112\ub115\ub111\ub111\ub114\ub112\ub117\ub116"}, d2={"\u057d\u057e\u056b\u2503\u0531\u0533\u0525\u0541\u0567\u056c\u057b\u056c\u0522\u0561\u056c\u0563\u056a\u0522\u055e\u0579\u057f\u0564\u0563\u056a\u0536\u0524\u0541\u0567\u056c\u057b\u056c\u0522\u0561\u056c\u0563\u056a\u0522\u055e\u0579\u057f\u0564\u0563\u056a\u0536", "\u04d6\u0489\u0486\u0483\u0484\u0483\u049e\u04d4\u04d6\u04d4\u04c2\u04c3\u04bc", "\u0700\u0755\u0752\u0755\u0748\u0702\u0700\u0702\u0714\u0715\u076a", "\u03f2\u03f0\u03e1\u03d6\u03f9\u03f4\u03e6\u03e6\u03a9\u03ab\u03bd\u03bc\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03d6\u03f9\u03f4\u03e6\u03e6\u03ae", "\u04b3\u04ba\u04a8\u04b3\u0498\u04b4\u04bf\u04be\u04e7\u04e5\u04f3\u04f2\u0492", "\u06c1\u06d5\u06d1\u06c5\u06c8\u06d7\u0698\u069a\u068c\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06eb\u06c6\u06ce\u06c1\u06c7\u06d0\u069f\u068d\u06fe", "\u02c0\u02cf\u02cc\u02cd\u02c6\u029f\u029d\u028b\u028a\u02ef\u02c9\u02c2\u02d5\u02c2\u028c\u02cf\u02c2\u02cd\u02c4\u028c\u02ec\u02c1\u02c9\u02c6\u02c0\u02d7\u0298", "_Dx_YBEL\u0017\u0015\u0003\u0002gAJ]J\u0004GJEL\u0004x_YBEL\u0010", "\u0319\u0318\u0303\u031e\u0311\u030e\u034b\u0349\u035f\u035e\u0321", "\u0123\u0122\u0139\u0124\u012b\u0134\u010c\u0121\u0121\u0171\u0173\u0165\u0164\u011b", "\u0408\u041e\u0416\u040b\u0443\u0441\u0457\u0456\u0429", "\u0532\u0524\u052c\u0531\u0579\u057b\u056d\u050f\u056c\u0513", "\u0533\u0525\u052d\u0530\u0574\u0578\u057a\u056c\u050e\u056d\u0512", "\u00ec\u00fa\u00f2\u00ef\u00a7\u00a5\u00b3\u00d1\u00d2\u00b2\u00cd", "\u05d0\u05df\u05d8\u05d7\u05da\u05df\u05cc\u05d3\u058a\u0588\u059e\u059f\u05e0"})
public final class Class4193 {
    public static float field9792;
    public static float field9793;
    public static double field9794;
    public static double field9795;
    public static double field9796;
    public static double field9797;
    public static double field9798;

    /*
     * WARNING - void declaration
     */
    private static CallSite qIvgpbLwNpaAVr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4193.qrZTxmtBcvrNDSay(k2, -1790428234));
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
                int a2 = Integer.parseInt(Class4193.qrZTxmtBcvrNDSay(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4193.qrZTxmtBcvrNDSay(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4193.qrZTxmtBcvrNDSay(k2, -1790428234) + " " + l2 + " " + m2);
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
        field9798 = Double.longBitsToDouble(4606895268594759728L);
        C\u200e = "AutoTool";
        field9797 = Double.longBitsToDouble(4602078532124150208L);
        field9792 = Float.intBitsToFloat(1064073910);
        field9796 = Double.longBitsToDouble(4585525474702526864L);
        field9794 = Double.longBitsToDouble(4604031149907678378L);
        field9793 = Float.intBitsToFloat(1058878804);
        field9795 = Double.longBitsToDouble(4602856850411098256L);
    }

    /*
     * Unable to fully structure code
     */
    private static String qrZTxmtBcvrNDSay(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 16760;
                    ** GOTO lbl12
                }
                v0 = 16761;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 16759;
lbl12:
                    // 3 sources

                    if (var4_4 == 16760) break block2;
                } while (var4_4 == 16761);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }
}

