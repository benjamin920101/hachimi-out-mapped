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

@HACHIMI_CLIENT(mv=100, d1={"\u5cf3\u5cf0\u5cf6\u5cf3\u5cf3\u5cf4\u5cf2\u5cf0", "\ue286\ue286\ue286\ue284\ue282\ue287\ue285\ue288", "\u22a3\u22a1\u22a8\u22a1\u22a2\u22a2\u22a8\u22a6", "\u0424\u0427\u0428\u0422\u0426\u0424\u0422\u0422", "\u827d\u8278\u8278\u8278\u8279\u827e\u827f\u827d", "\u1fbd\u1fbf\u1fbe\u1fbb\u1fb3\u1fb8\u1fbb\u1fbd", "\u3843\u3845\u3842\u3841\u3842\u3846\u3843\u3845", "\u6a93\u6a98\u6a99\u6a98\u6a95\u6a90\u6a91", "\u5724\u5722\u5725\u5724\u5725\u5729\u5728\u5726", "\uc2db\uc2d8\uc2da\uc2d8\uc2da\uc2d2\uc2df\uc2df", "\u0b13\u0b13\u0b1d\u0b1d\u0b10\u0b16\u0b13\u0b11", "\uad97\uad96\uad99\uad9f\uad9d\uad98\uad99", "\u8867\u8867\u8864\u886f\u8867\u8867\u8861\u8863", "\ub8f1\ub8f6\ub8f2\ub8fb\ub8f3\ub8f0\ub8f6\ub8f0", "\u1d91\u1d96\u1d91\u1d93\u1d9e\u1d97\u1d9f\u1d91", "\u0206\u0207\u020b\u0205\u020a\u0207\u0204\u0204", "\u6372\u6375\u6378\u6379\u6374\u6372\u6377\u6379"}, d2={"\u06e2\u06cd\u06cf\u268a\u06b8\u06ba\u06ac\u06c8\u06ee\u06e5\u06f2\u06e5\u06ab\u06e8\u06e5\u06ea\u06e3\u06ab\u06d7\u06f0\u06f6\u06ed\u06ea\u06e3\u06bf\u06ad\u06c8\u06ee\u06e5\u06f2\u06e5\u06ab\u06e8\u06e5\u06ea\u06e3\u06ab\u06d7\u06f0\u06f6\u06ed\u06ea\u06e3\u06bf", "\u0689\u06a6\u06a3\u26e1\u06d3\u06d1\u06c7\u06a3\u0685\u068e\u0699\u068e\u06c0\u0683\u068e\u0681\u0688\u06c0\u06bc\u069b\u069d\u0686\u0681\u0688\u06d4\u06c6\u06a3\u0685\u068e\u0699\u068e\u06c0\u0683\u068e\u0681\u0688\u06c0\u06bc\u069b\u069d\u0686\u0681\u0688\u06d4", "\u06ba\u0695\u0691\u26d2\u06e0\u06e2\u06f4\u0690\u06b6\u06bd\u06aa\u06bd\u06f3\u06b0\u06bd\u06b2\u06bb\u06f3\u068f\u06a8\u06ae\u06b5\u06b2\u06bb\u06e7\u06f5\u0690\u06b6\u06bd\u06aa\u06bd\u06f3\u06b0\u06bd\u06b2\u06bb\u06f3\u068f\u06a8\u06ae\u06b5\u06b2\u06bb\u06e7", "\u06bd\u06e2\u06ed\u06e8\u06ef\u06e8\u06f5\u06bf\u06bd\u06bf\u06a9\u06a8\u06d7", "\u0143\u0116\u0111\u0116\u010b\u0141\u0143\u0141\u0157\u0156\u0129", "\u07ca\u07c8\u07d9\u07ee\u07c1\u07cc\u07de\u07de\u0791\u0793\u0785\u0784\u07e1\u07c7\u07cc\u07db\u07cc\u0782\u07c1\u07cc\u07c3\u07ca\u0782\u07ee\u07c1\u07cc\u07de\u07de\u0796", "\u04c0\u04c9\u04db\u04c0\u04eb\u04c7\u04cc\u04cd\u0494\u0496\u0480\u0481\u04e1", "\u0225\u0231\u0235\u0221\u022c\u0233\u027c\u027e\u0268\u020c\u022a\u0221\u0236\u0221\u026f\u022c\u0221\u022e\u0227\u026f\u020f\u0222\u022a\u0225\u0223\u0234\u027b\u0269\u021a", "\u01de\u01d1\u01d2\u01d3\u01d8\u0181\u0183\u0195\u0194\u01f1\u01d7\u01dc\u01cb\u01dc\u0192\u01d1\u01dc\u01d3\u01da\u0192\u01f2\u01df\u01d7\u01d8\u01de\u01c9\u0186", "\u0605\u061e\u0622\u0605\u0603\u0618\u061f\u0616\u064d\u064f\u0659\u0658\u063d\u061b\u0610\u0607\u0610\u065e\u061d\u0610\u061f\u0616\u065e\u0622\u0605\u0603\u0618\u061f\u0616\u064a", "\u013a\u013b\u0120\u013d\u0132\u012d\u0168\u016a\u017c\u017d\u0102", "\u0191\u0190\u018b\u0196\u0199\u0186\u01be\u0193\u0193\u01c3\u01c1\u01d7\u01d6\u01a9", "\u0609\u061f\u0617\u060a\u0642\u0640\u0656\u0657\u0628", "\u016c\u017a\u0172\u016f\u0127\u0125\u0133\u0151\u0132\u014d", "\u0672\u0664\u066c\u0671\u0635\u0639\u063b\u062d\u064f\u062c\u0653", "\u0519\u050f\u0507\u051a\u0552\u0550\u0546\u0524\u0527\u0547\u0538", "\u0314\u031b\u031c\u0313\u031e\u031b\u0308\u0317\u034e\u034c\u035a\u035b\u0324"})
public final class Class3402 {
    public static float field7407;
    public static double field7408;
    public static float field7409;
    public static double field7410;
    public static double field7411;

    /*
     * WARNING - void declaration
     */
    private static CallSite LNu1BTnprEgNL1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3402.GoTway38o586661y(k2, -1244241815));
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
                int a2 = Integer.parseInt(Class3402.GoTway38o586661y(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3402.GoTway38o586661y(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3402.GoTway38o586661y(k2, -1244241815) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String GoTway38o586661y(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7411 = Double.longBitsToDouble(4604561232462534769L);
        O\u200e = "Rotate";
        field7407 = Float.intBitsToFloat(1060155639);
        field7409 = Float.intBitsToFloat(0x3F000000);
        ac\u200e = "ARRAYLIST_INFO";
        field7408 = Double.longBitsToDouble(4601616651677157058L);
        aN\u200e = "The chams render range";
        field7410 = Double.longBitsToDouble(0x4024000000000000L);
    }
}

