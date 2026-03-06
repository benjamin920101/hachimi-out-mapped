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

@HACHIMI_CLIENT(mv=100, d1={"\u93de\u93d9\u93d8\u93da\u93d4\u93db\u93dc\u93db", "\u88bd\u88bf\u88bd\u88ba\u88bc\u88ba\u88bc", "\u3346\u3340\u3341\u3346\u3344\u3342\u3341\u334a", "\u0f2a\u0f2d\u0f28\u0f2d\u0f2a\u0f2d\u0f20", "\u2268\u2262\u226d\u226b\u226f\u2268\u226c\u2262", "\u762f\u762d\u762d\u762d\u7624\u7625\u7625\u762c", "\u281e\u2815\u2815\u281c\u281b\u2814\u2815\u2814", "\u1adb\u1adf\u1ad2\u1ade\u1ad3\u1ada\u1adf\u1ad8", "\u564c\u564f\u564f\u5648\u564a\u5646\u5649\u5649", "\u4226\u422a\u422b\u4224\u4222\u4224\u4223\u4223", "\u605e\u6053\u6058\u605d\u6052\u6059\u6058\u605b", "\u7276\u7277\u7279\u7272\u7274\u7272\u7272\u7278", "\ucc4c\ucc45\ucc48\ucc4c\ucc48\ucc4d\ucc4c\ucc44", "\ub3e0\ub3e3\ub3eb\ub3e2\ub3e2\ub3ea\ub3e4", "\u945b\u9456\u9459\u945e\u945f\u9458\u945a\u945d", "\ubcc2\ubcc4\ubcc6\ubcc0\ubcc3\ubcc0\ubcc3", "\ue40a\ue40b\ue40e\ue406\ue40d\ue40b\ue40c\ue40c"}, d2={"\u01dd\u01f9\u01c7\u21bf\u018d\u018f\u0199\u01fd\u01db\u01d0\u01c7\u01d0\u019e\u01dd\u01d0\u01df\u01d6\u019e\u01e2\u01c5\u01c3\u01d8\u01df\u01d6\u018a\u0198\u01fd\u01db\u01d0\u01c7\u01d0\u019e\u01dd\u01d0\u01df\u01d6\u019e\u01e2\u01c5\u01c3\u01d8\u01df\u01d6\u018a", "\u0791\u07b5\u078a\u27f3\u07c1\u07c3\u07d5\u07b1\u0797\u079c\u078b\u079c\u07d2\u0791\u079c\u0793\u079a\u07d2\u07ae\u0789\u078f\u0794\u0793\u079a\u07c6\u07d4\u07b1\u0797\u079c\u078b\u079c\u07d2\u0791\u079c\u0793\u079a\u07d2\u07ae\u0789\u078f\u0794\u0793\u079a\u07c6", "\u04f7\u04d3\u04e3\u2495\u04a7\u04a5\u04b3\u04d7\u04f1\u04fa\u04ed\u04fa\u04b4\u04f7\u04fa\u04f5\u04fc\u04b4\u04c8\u04ef\u04e9\u04f2\u04f5\u04fc\u04a0\u04b2\u04d7\u04f1\u04fa\u04ed\u04fa\u04b4\u04f7\u04fa\u04f5\u04fc\u04b4\u04c8\u04ef\u04e9\u04f2\u04f5\u04fc\u04a0", "\u07b9\u07e6\u07e9\u07ec\u07eb\u07ec\u07f1\u07bb\u07b9\u07bb\u07ad\u07ac\u07d3", "\u0541\u0514\u0513\u0514\u0509\u0543\u0541\u0543\u0555\u0554\u052b", "\u0236\u0234\u0225\u0212\u023d\u0230\u0222\u0222\u026d\u026f\u0279\u0278\u021d\u023b\u0230\u0227\u0230\u027e\u023d\u0230\u023f\u0236\u027e\u0212\u023d\u0230\u0222\u0222\u026a", "\u01a0\u01a9\u01bb\u01a0\u018b\u01a7\u01ac\u01ad\u01f4\u01f6\u01e0\u01e1\u0181", "\u0684\u0690\u0694\u0680\u068d\u0692\u06dd\u06df\u06c9\u06ad\u068b\u0680\u0697\u0680\u06ce\u068d\u0680\u068f\u0686\u06ce\u06ae\u0683\u068b\u0684\u0682\u0695\u06da\u06c8\u06bb", "\u0674\u067b\u0678\u0679\u0672\u062b\u0629\u063f\u063e\u065b\u067d\u0676\u0661\u0676\u0638\u067b\u0676\u0679\u0670\u0638\u0658\u0675\u067d\u0672\u0674\u0663\u062c", "\u06b2\u06a9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fa\u06f8\u06ee\u06ef\u068a\u06ac\u06a7\u06b0\u06a7\u06e9\u06aa\u06a7\u06a8\u06a1\u06e9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fd", "\u051e\u051f\u0504\u0519\u0516\u0509\u054c\u054e\u0558\u0559\u0526", "\u07d9\u07d8\u07c3\u07de\u07d1\u07ce\u07f6\u07db\u07db\u078b\u0789\u079f\u079e\u07e1", "\u051c\u050a\u0502\u051f\u0557\u0555\u0543\u0542\u053d", "\u065e\u0648\u0640\u065d\u0615\u0617\u0601\u0663\u0600\u067f", "\u0268\u027e\u0276\u026b\u022f\u0223\u0221\u0237\u0255\u0236\u0249", "\u0304\u0312\u031a\u0307\u034f\u034d\u035b\u0339\u033a\u035a\u0325", "\u07f5\u07fa\u07fd\u07f2\u07ff\u07fa\u07e9\u07f6\u07af\u07ad\u07bb\u07ba\u07c5"})
public final class Class5469 {
    public static double field10250;

    static {
        p\u200e = "Renders the Minecraft potion Hud";
        field10250 = Double.longBitsToDouble(4593160766506770072L);
        bq\u200e = "Accounts for motion when calculating ender pearl positions";
        by\u200e = "Allows attacking while mining blocks";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite a4HBrtNRnEpa50(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5469.YytfDjIsGDR6dV5z(k2, 756336840));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block2: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5469.YytfDjIsGDR6dV5z(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 26982 : 26983;
            while (true) {
                int n4;
                if ((n4 = n3) == 26982) {
                    String c2 = Class5469.YytfDjIsGDR6dV5z(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break block2;
                }
                if (n4 != 26983) continue block2;
                n3 = 26981;
            }
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class5469.YytfDjIsGDR6dV5z(k2, 756336840) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String YytfDjIsGDR6dV5z(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

