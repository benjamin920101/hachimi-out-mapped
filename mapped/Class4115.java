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

@HACHIMI_CLIENT(mv=100, d1={"\u913a\u9139\u913a\u913a\u913a\u913b\u913e\u9138", "\u4395\u4397\u4399\u4390\u4396\u4397\u4391\u4396", "\u76ce\u76cd\u76c1\u76ce\u76c8\u76c8\u76cd\u76cd", "\u497e\u497e\u497d\u4978\u497a\u497f\u497b\u497f", "\ub5b2\ub5b5\ub5bb\ub5b7\ub5b2\ub5b6\ub5b7\ub5b2", "\u3da0\u3da0\u3da4\u3da5\u3da0\u3dac\u3dac\u3da5", "\u36c0\u36c3\u36c1\u36c5\u36ca\u36c3\u36c1\u36c0", "\u5b0f\u5b08\u5b0f\u5b0e\u5b0d\u5b09\u5b0a\u5b06", "\u5ac3\u5ac3\u5ac2\u5ac1\u5ac2\u5acd\u5ac0", "\u161f\u161e\u1618\u161b\u161f\u161d\u1618\u161b", "\u07a1\u07a8\u07a7\u07a6\u07a2\u07a3\u07a9\u07a1", "\ud6cf\ud6c4\ud6ce\ud6c8\ud6ca\ud6cd\ud6c5\ud6cc", "\u9f9d\u9f98\u9f97\u9f9f\u9f9a\u9f9f\u9f9e", "\ue181\ue183\ue189\ue183\ue184\ue185\ue185\ue187", "\ud7db\ud7d5\ud7d9\ud7d9\ud7da\ud7da\ud7d8"}, d2={"\u0395\u03b6\u03a9\u23f6\u03c4\u03c6\u03d0\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3\u03d1\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3", "\u04c6\u0499\u0496\u0493\u0494\u0493\u048e\u04c4\u04c6\u04c4\u04d2\u04d3\u04ac", "\u0129\u017c\u017b\u017c\u0161\u012b\u0129\u012b\u013d\u013c\u0143", "\u0608\u060a\u061b\u062c\u0603\u060e\u061c\u061c\u0653\u0651\u0647\u0646\u0623\u0605\u060e\u0619\u060e\u0640\u0603\u060e\u0601\u0608\u0640\u062c\u0603\u060e\u061c\u061c\u0654", "\u0179\u0170\u0162\u0179\u0152\u017e\u0175\u0174\u012d\u012f\u0139\u0138\u0158", "\u0697\u0683\u0687\u0693\u069e\u0681\u06ce\u06cc\u06da\u06be\u0698\u0693\u0684\u0693\u06dd\u069e\u0693\u069c\u0695\u06dd\u06bd\u0690\u0698\u0697\u0691\u0686\u06c9\u06db\u06a8", "\u0228\u0227\u0224\u0225\u022e\u0277\u0275\u0263\u0262\u0207\u0221\u022a\u023d\u022a\u0264\u0227\u022a\u0225\u022c\u0264\u0204\u0229\u0221\u022e\u0228\u023f\u0270", "\u04cf\u04d4\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0487\u0485\u0493\u0492\u04f7\u04d1\u04da\u04cd\u04da\u0494\u04d7\u04da\u04d5\u04dc\u0494\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0480", "\u0557\u0556\u054d\u0550\u055f\u0540\u0505\u0507\u0511\u0510\u056f", "\u057e\u057f\u0564\u0579\u0576\u0569\u0551\u057c\u057c\u052c\u052e\u0538\u0539\u0546", "\u0325\u0333\u033b\u0326\u036e\u036c\u037a\u037b\u0304", "\u05bc\u05aa\u05a2\u05bf\u05f7\u05f5\u05e3\u0581\u05e2\u059d", "\u06d6\u06c0\u06c8\u06d5\u0691\u069d\u069f\u0689\u06eb\u0688\u06f7", "\u0227\u0231\u0239\u0224\u026c\u026e\u0278\u021a\u0219\u0279\u0206", "\u0449\u0446\u0441\u044e\u0443\u0446\u0455\u044a\u0413\u0411\u0407\u0406\u0479"})
public final class Class4115 {
    public static float field9540 = Float.intBitsToFloat(1059908023);
    public static double field9541 = Double.longBitsToDouble(4596373779694328218L);
    public static int field9542 = 0;
    public static int field9543 = -852478715;

    static {
        bq\u200e = "Crit boat";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite HdAUg6kDBbZTs6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4115.fUixx9rviia9f9De(k2, -1469582051));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block2: for (int f2 = 0; f2 < q2.length; ++f2) {
            int n3;
            void e2;
            try {
                int a2 = Integer.parseInt(Class4115.fUixx9rviia9f9De(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n4 = e2 % 59557 != m2.intValue() ? 49967 : 49966;
            while ((n3 = n4) != 49966) {
                if (n3 != 49967) continue block2;
                n4 = 49965;
            }
            String c2 = Class4115.fUixx9rviia9f9De(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class4115.fUixx9rviia9f9De(k2, -1469582051) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String fUixx9rviia9f9De(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

