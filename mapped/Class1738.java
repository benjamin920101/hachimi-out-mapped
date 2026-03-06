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

@HACHIMI_CLIENT(mv=100, d1={"\uc99a\uc99c\uc99e\uc998\uc999\uc99b\uc998\uc99a", "\u5df8\u5dfb\u5dfb\u5dfa\u5dfd\u5dfb\u5df2\u5df2", "\u7ccc\u7ccf\u7ccc\u7ccd\u7ccd\u7cc9\u7ccb", "\u6e23\u6e24\u6e22\u6e2f\u6e21\u6e2e\u6e2f\u6e2f", "\u5c06\u5c02\u5c03\u5c03\u5c07\u5c00\u5c0a\u5c06", "\uc220\uc222\uc221\uc224\uc22e\uc223\uc22e\uc22e", "\u0a44\u0a45\u0a49\u0a44\u0a45\u0a47\u0a46\u0a41", "\uc5c0\uc5c0\uc5c7\uc5cc\uc5cc\uc5c7\uc5c4", "\u53a2\u53a2\u53a3\u53af\u53a9\u53a3\u53af", "\ud442\ud443\ud44d\ud440\ud44d\ud447\ud442\ud44c", "\ua4ac\ua4aa\ua4a4\ua4ab\ua4a5\ua4aa\ua4a4\ua4a5", "\ua781\ua784\ua782\ua787\ua782\ua780\ua785\ua785", "\uc39d\uc39a\uc393\uc39a\uc39b\uc39c\uc39b\uc39b", "\u8643\u8646\u8648\u8647\u8647\u8647\u8644\u8641", "\u1bde\u1bdc\u1bd9\u1bdd\u1bd8\u1bd8\u1bdb\u1bdb"}, d2={"\u06aa\u06b7\u06b5\u26c3\u06f1\u06f3\u06e5\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6\u06e4\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6", "\u013c\u0163\u016c\u0169\u016e\u0169\u0174\u013e\u013c\u013e\u0128\u0129\u0156", "\u04e4\u04b1\u04b6\u04b1\u04ac\u04e6\u04e4\u04e6\u04f0\u04f1\u048e", "\u012f\u012d\u013c\u010b\u0124\u0129\u013b\u013b\u0174\u0176\u0160\u0161\u0104\u0122\u0129\u013e\u0129\u0167\u0124\u0129\u0126\u012f\u0167\u010b\u0124\u0129\u013b\u013b\u0173", "\u02d7\u02de\u02cc\u02d7\u02fc\u02d0\u02db\u02da\u0283\u0281\u0297\u0296\u02f6", "\u0335\u0321\u0325\u0331\u033c\u0323\u036c\u036e\u0378\u031c\u033a\u0331\u0326\u0331\u037f\u033c\u0331\u033e\u0337\u037f\u031f\u0332\u033a\u0335\u0333\u0324\u036b\u0379\u030a", "\u07fd\u07f2\u07f1\u07f0\u07fb\u07a2\u07a0\u07b6\u07b7\u07d2\u07f4\u07ff\u07e8\u07ff\u07b1\u07f2\u07ff\u07f0\u07f9\u07b1\u07d1\u07fc\u07f4\u07fb\u07fd\u07ea\u07a5", "\u064b\u0650\u066c\u064b\u064d\u0656\u0651\u0658\u0603\u0601\u0617\u0616\u0673\u0655\u065e\u0649\u065e\u0610\u0653\u065e\u0651\u0658\u0610\u066c\u064b\u064d\u0656\u0651\u0658\u0604", "\u06a8\u06a9\u06b2\u06af\u06a0\u06bf\u06fa\u06f8\u06ee\u06ef\u0690", "\u077a\u077b\u0760\u077d\u0772\u076d\u0755\u0778\u0778\u0728\u072a\u073c\u073d\u0742", "\u047c\u046a\u0462\u047f\u0437\u0435\u0423\u0422\u045d", "\u025f\u0249\u0241\u025c\u0214\u0216\u0200\u0262\u0201\u027e", "\u0677\u0661\u0669\u0674\u0630\u063c\u063e\u0628\u064a\u0629\u0656", "\u0589\u059f\u0597\u058a\u05c2\u05c0\u05d6\u05b4\u05b7\u05d7\u05a8", "\u0307\u0308\u030f\u0300\u030d\u0308\u031b\u0304\u035d\u035f\u0349\u0348\u0337"})
public final class Class1738 {
    public static double field6524;
    public static float field6525 = 0.7752337f;

    private static String G67nPWirXj39BlSY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        p\u200e = "Manage the items according to the kit";
        field6524 = Double.longBitsToDouble(4604303386014654560L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ULeIDzcfvLfmXC(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1738.G67nPWirXj39BlSY(k2, -508887610));
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
                int a2 = Integer.parseInt(Class1738.G67nPWirXj39BlSY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1738.G67nPWirXj39BlSY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1738.G67nPWirXj39BlSY(k2, -508887610) + " " + l2 + " " + m2);
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

