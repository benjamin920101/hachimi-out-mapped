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
@HACHIMI_CLIENT(mv=100, d1={"\u7fc1\u7fcc\u7fcd\u7fc7\u7fc0\u7fc2\u7fc6\u7fcd", "\u4efe\u4efa\u4efb\u4efa\u4efd\u4efe\u4efa\u4ef9", "\ud9cd\ud9ce\ud9ca\ud9c8\ud9cc\ud9c8", "\u45ff\u45fb\u45f2\u45f2\u45f8\u45fb\u45f3\u45f8", "\u18b4\u18b3\u18b6\u18b0\u18b1\u18b9\u18b9\u18b6", "\u8bd7\u8bd4\u8bd1\u8bd1\u8bdd\u8bd1", "\u9c54\u9c5f\u9c57\u9c56\u9c55\u9c5e\u9c53\u9c52", "\u5f2f\u5f25\u5f2a\u5f2e\u5f2d\u5f25\u5f2f\u5f2e", "\u8e4c\u8e4f\u8e4d\u8e42\u8e4d\u8e4e\u8e4a\u8e48", "\u0c71\u0c74\u0c71\u0c71\u0c7e\u0c72\u0c70\u0c71", "\uacf2\uacf0\uacf5\uacf2\uacf1\uacf6\uacf7\uacf5", "\u398f\u3980\u398b\u398b\u3989\u3989\u3988\u3988", "\ub229\ub22a\ub228\ub22b\ub22b\ub222\ub22b", "\u5de0\u5de7\u5de4\u5de7\u5de6\u5de5\u5def\u5de4", "\u2caa\u2cad\u2ca4\u2caf\u2cad\u2ca9\u2ca4\u2caa", "\u0f05\u0f07\u0f04\u0f01\u0f07\u0f05\u0f07\u0f0f"}, d2={"\u0182\u0189\u01a3\u21ff\u01cd\u01cf\u01d9\u01bd\u019b\u0190\u0187\u0190\u01de\u019d\u0190\u019f\u0196\u01de\u01a2\u0185\u0183\u0198\u019f\u0196\u01ca\u01d8\u01bd\u019b\u0190\u0187\u0190\u01de\u019d\u0190\u019f\u0196\u01de\u01a2\u0185\u0183\u0198\u019f\u0196\u01ca", "\u0492\u0499\u04b2\u24ef\u04dd\u04df\u04c9\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da\u04c8\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da", "\u071e\u0741\u074e\u074b\u074c\u074b\u0756\u071c\u071e\u071c\u070a\u070b\u0774", "\u06f4\u06a1\u06a6\u06a1\u06bc\u06f6\u06f4\u06f6\u06e0\u06e1\u069e", "\u04ff\u04fd\u04ec\u04db\u04f4\u04f9\u04eb\u04eb\u04a4\u04a6\u04b0\u04b1\u04d4\u04f2\u04f9\u04ee\u04f9\u04b7\u04f4\u04f9\u04f6\u04ff\u04b7\u04db\u04f4\u04f9\u04eb\u04eb\u04a3", "\u03d7\u03de\u03cc\u03d7\u03fc\u03d0\u03db\u03da\u0383\u0381\u0397\u0396\u03f6", "\u0725\u0731\u0735\u0721\u072c\u0733\u077c\u077e\u0768\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u070f\u0722\u072a\u0725\u0723\u0734\u077b\u0769\u071a", "\u0442\u044d\u044e\u044f\u0444\u041d\u041f\u0409\u0408\u046d\u044b\u0440\u0457\u0440\u040e\u044d\u0440\u044f\u0446\u040e\u046e\u0443\u044b\u0444\u0442\u0455\u041a", "\u0215\u020e\u0232\u0215\u0213\u0208\u020f\u0206\u025d\u025f\u0249\u0248\u022d\u020b\u0200\u0217\u0200\u024e\u020d\u0200\u020f\u0206\u024e\u0232\u0215\u0213\u0208\u020f\u0206\u025a", "\u0610\u0611\u060a\u0617\u0618\u0607\u0642\u0640\u0656\u0657\u0628", "\u0288\u0289\u0292\u028f\u0280\u029f\u02a7\u028a\u028a\u02da\u02d8\u02ce\u02cf\u02b0", "\u0697\u0681\u0689\u0694\u06dc\u06de\u06c8\u06c9\u06b6", "\u06d9\u06cf\u06c7\u06da\u0692\u0690\u0686\u06e4\u0687\u06f8", "\u0444\u0452\u045a\u0447\u0403\u040f\u040d\u041b\u0479\u041a\u0465", "\u07ef\u07f9\u07f1\u07ec\u07a4\u07a6\u07b0\u07d2\u07d1\u07b1\u07ce", "\u041a\u0415\u0412\u041d\u0410\u0415\u0406\u0419\u0440\u0442\u0454\u0455\u042a"})
public final class Class1161 {
    public static float field4631;
    public static float field4632 = 0.08698404f;
    public static double field4633;

    /*
     * Enabled aggressive block sorting
     */
    private static String 16qVutJ6mHGN4Y0v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 33088 : 33089;
            block5: while (true) {
                switch (n2) {
                    case 33089: {
                        n2 = 33087;
                        continue block5;
                    }
                    case 33088: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        e\u200e = "ItemsFill";
        n\u200e = "The speed for the rainbow color cycling";
        field4631 = Float.intBitsToFloat(1062425143);
        field4633 = Double.longBitsToDouble(4602416900863908132L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite XFLDMZZERxC96l(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1161.16qVutJ6mHGN4Y0v(k2, 1681441536));
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
                int a2 = Integer.parseInt(Class1161.16qVutJ6mHGN4Y0v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1161.16qVutJ6mHGN4Y0v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1161.16qVutJ6mHGN4Y0v(k2, 1681441536) + " " + l2 + " " + m2);
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

