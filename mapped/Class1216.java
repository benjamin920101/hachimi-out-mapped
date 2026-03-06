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
@HACHIMI_CLIENT(mv=100, d1={"\u5094\u5092\u5093\u5090\u5096\u5091\u5091\u5090", "\ua656\ua659\ua650\ua656\ua659\ua651\ua655\ua655", "\u7a1d\u7a1b\u7a1e\u7a1b\u7a1e\u7a19\u7a17\u7a1a", "\u51b0\u51bb\u51bc\u51bb\u51bb\u51b9\u51b1", "\uc4e3\uc4e6\uc4ed\uc4e6\uc4e0\uc4ec\uc4e6\uc4e3", "\u2bda\u2bda\u2bdf\u2bd6\u2bda\u2bd8\u2bda", "\ub76b\ub766\ub767\ub766\ub769\ub76e\ub76a\ub76d", "\u97b4\u97bc\u97b7\u97b4\u97b3\u97b4\u97b1\u97b6", "\u5063\u5069\u5066\u5062\u5065\u5069\u5066\u5065", "\ua2ec\ua2e5\ua2e5\ua2ea\ua2e4\ua2eb\ua2ed", "\u3f42\u3f41\u3f45\u3f45\u3f4a\u3f47\u3f43", "\u8177\u8177\u817b\u8178\u817a\u817c\u8176", "\u9662\u9666\u9664\u9668\u9661\u9667\u9668\u9668", "\u7207\u7205\u7205\u7207\u7208\u7208\u7201\u7206", "\u61a0\u61a2\u61a2\u61a4\u61a3\u61a2\u61a0", "\u1d0b\u1d0f\u1d01\u1d0f\u1d0e\u1d0f\u1d01\u1d01"}, d2={"\u0356\u036f\u0376\u232c\u031e\u031c\u030a\u036e\u0348\u0343\u0354\u0343\u030d\u034e\u0343\u034c\u0345\u030d\u0371\u0356\u0350\u034b\u034c\u0345\u0319\u030b\u036e\u0348\u0343\u0354\u0343\u030d\u034e\u0343\u034c\u0345\u030d\u0371\u0356\u0350\u034b\u034c\u0345\u0319", "\u077d\u0744\u075c\u2707\u0735\u0737\u0721\u0745\u0763\u0768\u077f\u0768\u0726\u0765\u0768\u0767\u076e\u0726\u075a\u077d\u077b\u0760\u0767\u076e\u0732\u0720\u0745\u0763\u0768\u077f\u0768\u0726\u0765\u0768\u0767\u076e\u0726\u075a\u077d\u077b\u0760\u0767\u076e\u0732", "2mbg`gz020&'X", "\u05f1\u05a4\u05a3\u05a4\u05b9\u05f3\u05f1\u05f3\u05e5\u05e4\u059b", "\u0202\u0200\u0211\u0226\u0209\u0204\u0216\u0216\u0259\u025b\u024d\u024c\u0229\u020f\u0204\u0213\u0204\u024a\u0209\u0204\u020b\u0202\u024a\u0226\u0209\u0204\u0216\u0216\u025e", "\u073e\u0737\u0725\u073e\u0715\u0739\u0732\u0733\u076a\u0768\u077e\u077f\u071f", "\u055a\u054e\u054a\u055e\u0553\u054c\u0503\u0501\u0517\u0573\u0555\u055e\u0549\u055e\u0510\u0553\u055e\u0551\u0558\u0510\u0570\u055d\u0555\u055a\u055c\u054b\u0504\u0516\u0565", "\u055e\u0551\u0552\u0553\u0558\u0501\u0503\u0515\u0514\u0571\u0557\u055c\u054b\u055c\u0512\u0551\u055c\u0553\u055a\u0512\u0572\u055f\u0557\u0558\u055e\u0549\u0506", "\u06ac\u06b7\u068b\u06ac\u06aa\u06b1\u06b6\u06bf\u06e4\u06e6\u06f0\u06f1\u0694\u06b2\u06b9\u06ae\u06b9\u06f7\u06b4\u06b9\u06b6\u06bf\u06f7\u068b\u06ac\u06aa\u06b1\u06b6\u06bf\u06e3", "\u0546\u0547\u055c\u0541\u054e\u0551\u0514\u0516\u0500\u0501\u057e", "\u0527\u0526\u053d\u0520\u052f\u0530\u0508\u0525\u0525\u0575\u0577\u0561\u0560\u051f", "\u04a2\u04b4\u04bc\u04a1\u04e9\u04eb\u04fd\u04fc\u0483", "\u07c7\u07d1\u07d9\u07c4\u078c\u078e\u0798\u07fa\u0799\u07e6", "\u0664\u0672\u067a\u0667\u0623\u062f\u062d\u063b\u0659\u063a\u0645", "\u0416\u0400\u0408\u0415\u045d\u045f\u0449\u042b\u0428\u0448\u0437", "\u0194\u019b\u019c\u0193\u019e\u019b\u0188\u0197\u01ce\u01cc\u01da\u01db\u01a4"})
public final class Class1216 {
    public static String field4782 = "ip";
    public static float field4783 = 0.99671626f;
    public static float field4784 = Float.intBitsToFloat(1064546825);
    public static float field4785 = Float.intBitsToFloat(1063329475);
    public static int field4786 = -1942150724;

    /*
     * WARNING - void declaration
     */
    private static CallSite 6qAbGCs9oN1yTa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1216.KYmTT7TaJPqZ8qjs(k2, 97144086));
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
                int a2 = Integer.parseInt(Class1216.KYmTT7TaJPqZ8qjs(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1216.KYmTT7TaJPqZ8qjs(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1216.KYmTT7TaJPqZ8qjs(k2, 97144086) + " " + l2 + " " + m2);
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
        bg\u200e = "Surround";
    }

    private static String KYmTT7TaJPqZ8qjs(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

