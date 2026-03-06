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
@HACHIMI_CLIENT(mv=100, d1={"\u96be\u96ba\u96be\u96b9\u96b9\u96bf\u96bd\u96be", "\ud870\ud876\ud877\ud873\ud87e\ud873", "\u2471\u247a\u2476\u2470\u2471\u2477\u2476\u2475", "\u15c1\u15c6\u15c3\u15c8\u15c3\u15c7\u15c9\u15c1", "\ub6d2\ub6dd\ub6d5\ub6dd\ub6d6\ub6d0\ub6dd\ub6d3", "\u443b\u4435\u4436\u4430\u4432\u4434\u4435", "\u6f38\u6f3b\u6f3e\u6f3b\u6f34\u6f3e\u6f38\u6f3c", "\u4d78\u4d79\u4d7e\u4d74\u4d78\u4d7e\u4d7e\u4d7d", "\u47d1\u47d6\u47d0\u47db\u47da\u47d5\u47db\u47d6", "\ucdff\ucdfa\ucdfa\ucdf9\ucdfb\ucdfb\ucdf8\ucdfc", "\u7bab\u7ba9\u7bac\u7bac\u7ba9\u7ba4\u7baa\u7baa", "\u2aa8\u2aae\u2aae\u2aaa\u2aaa\u2aad\u2aa8\u2aa8", "\ucac4\ucac9\ucac0\ucac0\ucac7\ucac8\ucac0\ucac6", "\u967a\u9678\u9679\u967b\u967b\u967e\u967c\u9679", "\ue16f\ue16a\ue16a\ue169\ue16e\ue16a\ue166\ue166", "\u547e\u547a\u547a\u547e\u547b\u547a\u547f"}, d2={"\u078f\u0798\u0795\u27f3\u07c1\u07c3\u07d5\u07b1\u0797\u079c\u078b\u079c\u07d2\u0791\u079c\u0793\u079a\u07d2\u07ae\u0789\u078f\u0794\u0793\u079a\u07c6\u07d4\u07b1\u0797\u079c\u078b\u079c\u07d2\u0791\u079c\u0793\u079a\u07d2\u07ae\u0789\u078f\u0794\u0793\u079a\u07c6", "\u0360\u0377\u037b\u231c\u032e\u032c\u033a\u035e\u0378\u0373\u0364\u0373\u033d\u037e\u0373\u037c\u0375\u033d\u0341\u0366\u0360\u037b\u037c\u0375\u0329\u033b\u035e\u0378\u0373\u0364\u0373\u033d\u037e\u0373\u037c\u0375\u033d\u0341\u0366\u0360\u037b\u037c\u0375\u0329", "\u04aa\u04f5\u04fa\u04ff\u04f8\u04ff\u04e2\u04a8\u04aa\u04a8\u04be\u04bf\u04c0", "\u0571\u0524\u0523\u0524\u0539\u0573\u0571\u0573\u0565\u0564\u051b", "\u041c\u041e\u040f\u0438\u0417\u041a\u0408\u0408\u0447\u0445\u0453\u0452\u0437\u0411\u041a\u040d\u041a\u0454\u0417\u041a\u0415\u041c\u0454\u0438\u0417\u041a\u0408\u0408\u0440", "\u05f8\u05f1\u05e3\u05f8\u05d3\u05ff\u05f4\u05f5\u05ac\u05ae\u05b8\u05b9\u05d9", "\u0182\u0196\u0192\u0186\u018b\u0194\u01db\u01d9\u01cf\u01ab\u018d\u0186\u0191\u0186\u01c8\u018b\u0186\u0189\u0180\u01c8\u01a8\u0185\u018d\u0182\u0184\u0193\u01dc\u01ce\u01bd", "\u03ad\u03a2\u03a1\u03a0\u03ab\u03f2\u03f0\u03e6\u03e7\u0382\u03a4\u03af\u03b8\u03af\u03e1\u03a2\u03af\u03a0\u03a9\u03e1\u0381\u03ac\u03a4\u03ab\u03ad\u03ba\u03f5", "\u0691\u068a\u06b6\u0691\u0697\u068c\u068b\u0682\u06d9\u06db\u06cd\u06cc\u06a9\u068f\u0684\u0693\u0684\u06ca\u0689\u0684\u068b\u0682\u06ca\u06b6\u0691\u0697\u068c\u068b\u0682\u06de", "\u0448\u0449\u0452\u044f\u0440\u045f\u041a\u0418\u040e\u040f\u0470", "\u04ec\u04ed\u04f6\u04eb\u04e4\u04fb\u04c3\u04ee\u04ee\u04be\u04bc\u04aa\u04ab\u04d4", "\u00a3\u00b5\u00bd\u00a0\u00e8\u00ea\u00fc\u00fd\u0082", "\u043f\u0429\u0421\u043c\u0474\u0476\u0460\u0402\u0461\u041e", "\u057e\u0568\u0560\u057d\u0539\u0535\u0537\u0521\u0543\u0520\u055f", "\u0455\u0443\u044b\u0456\u041e\u041c\u040a\u0468\u046b\u040b\u0474", "\u0130\u013f\u0138\u0137\u013a\u013f\u012c\u0133\u016a\u0168\u017e\u017f\u0100"})
public final class Class1244 {
    public static float field4874;
    public static float field4875;
    public static double field4876;
    public static long field4877 = 0xFFFFFFFFL;
    public static double field4878 = 0.8786430512576322;
    public static float field4879;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 7JK72x74eZSAlD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1244.ScOAVhSpVf7diEj4(k2, -2093263823));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 3504 : 3503;
        block6: while (true) {
            switch (n3) {
                case 3504: {
                    n3 = 3502;
                    continue block6;
                }
                case 3503: {
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
                int a2 = Integer.parseInt(Class1244.ScOAVhSpVf7diEj4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1244.ScOAVhSpVf7diEj4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1244.ScOAVhSpVf7diEj4(k2, -2093263823) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field4879 = Float.intBitsToFloat(1108606976);
        D\u200e = "The health required to fall below before swapping to a totem";
        field4874 = Float.intBitsToFloat(1059654921);
        field4876 = Double.longBitsToDouble(4603619952659094780L);
        field4875 = Float.intBitsToFloat(1063051810);
        bh\u200e = "RENDER_MAIN_HAND_ONLY";
    }

    private static String ScOAVhSpVf7diEj4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

