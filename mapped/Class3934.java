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

@HACHIMI_CLIENT(mv=100, d1={"\u268e\u268a\u268d\u2689\u2689\u2688\u268f\u2685", "\ue78e\ue78d\ue788\ue788\ue78c\ue78e\ue784\ue78b", "\uc1de\uc1de\uc1d8\uc1d8\uc1df\uc1dc\uc1db\uc1da", "\ubed2\ubed2\ubed5\ubed2\ubed4\ubed7\ubed3", "\u5abc\u5aba\u5abb\u5ab8\u5abe\u5ab8\u5ab8\u5ab8", "\u7318\u7318\u731d\u731a\u7312\u731d\u7318\u731a", "\u7a93\u7a95\u7a96\u7a90\u7a90\u7a92\u7a91\u7a9a", "\ub883\ub88e\ub883\ub880\ub88e\ub882\ub88e\ub880", "\ubbd7\ubbd3\ubbd8\ubbd8\ubbd8\ubbd9\ubbd5\ubbd7", "\ub719\ub71c\ub71d\ub71f\ub71f\ub71c\ub71d\ub714", "\u9e32\u9e35\u9e3d\u9e33\u9e3d\u9e33\u9e37\u9e36", "\u711f\u7112\u711a\u7113\u711d\u711a\u711e\u711f", "\ubc53\ubc51\ubc50\ubc51\ubc57\ubc58\ubc56\ubc54", "\u8755\u8751\u8754\u8759\u8751\u8759\u8750\u8754"}, d2={"\u022b\u0274\u027b\u027e\u0279\u027e\u0263\u0229\u022b\u0229\u023f\u023e\u0241", "\u0561\u0534\u0533\u0534\u0529\u0563\u0561\u0563\u0575\u0574\u050b", "\u024f\u024d\u025c\u026b\u0244\u0249\u025b\u025b\u0214\u0216\u0200\u0201\u0264\u0242\u0249\u025e\u0249\u0207\u0244\u0249\u0246\u024f\u0207\u026b\u0244\u0249\u025b\u025b\u0213", "\u0189\u0180\u0192\u0189\u01a2\u018e\u0185\u0184\u01dd\u01df\u01c9\u01c8\u01a8", "\u0595\u0581\u0585\u0591\u059c\u0583\u05cc\u05ce\u05d8\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05bf\u0592\u059a\u0595\u0593\u0584\u05cb\u05d9\u05aa", "\u06fd\u06f2\u06f1\u06f0\u06fb\u06a2\u06a0\u06b6\u06b7\u06d2\u06f4\u06ff\u06e8\u06ff\u06b1\u06f2\u06ff\u06f0\u06f9\u06b1\u06d1\u06fc\u06f4\u06fb\u06fd\u06ea\u06a5", "\u0316\u030d\u0331\u0316\u0310\u030b\u030c\u0305\u035e\u035c\u034a\u034b\u032e\u0308\u0303\u0314\u0303\u034d\u030e\u0303\u030c\u0305\u034d\u0331\u0316\u0310\u030b\u030c\u0305\u0359", "\u0455\u0454\u044f\u0452\u045d\u0442\u0407\u0405\u0413\u0412\u046d", "\u07c2\u07c3\u07d8\u07c5\u07ca\u07d5\u07ed\u07c0\u07c0\u0790\u0792\u0784\u0785\u07fa", "\u05e1\u05f7\u05ff\u05e2\u05aa\u05a8\u05be\u05bf\u05c0", "\u06c2\u06d4\u06dc\u06c1\u0689\u068b\u069d\u06ff\u069c\u06e3", "\u011f\u0109\u0101\u011c\u0158\u0154\u0156\u0140\u0122\u0141\u013e", "\u0519\u050f\u0507\u051a\u0552\u0550\u0546\u0524\u0527\u0547\u0538", "\u03ff\u03f0\u03f7\u03f8\u03f5\u03f0\u03e3\u03fc\u03a5\u03a7\u03b1\u03b0\u03cf"})
public final class Class3934 {
    public static double field8957;
    public static float field8958;
    public static float field8959;
    public static double field8960;
    public static double field8961;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite UlNvavoc1bDGGd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3934.PIhOmNuK7bCrxgJ0(k2, 616741357));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 57532 : 57533;
        block6: while (true) {
            switch (n3) {
                case 57533: {
                    n3 = 57531;
                    continue block6;
                }
                case 57532: {
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
                int a2 = Integer.parseInt(Class3934.PIhOmNuK7bCrxgJ0(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3934.PIhOmNuK7bCrxgJ0(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3934.PIhOmNuK7bCrxgJ0(k2, 616741357) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String PIhOmNuK7bCrxgJ0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8959 = Float.intBitsToFloat(1064388047);
        field8961 = Double.longBitsToDouble(4591757230345956544L);
        field8960 = Double.longBitsToDouble(4604601150631405726L);
        field8958 = Float.intBitsToFloat(1059809670);
        field8957 = Double.longBitsToDouble(4602018533356789752L);
    }
}

