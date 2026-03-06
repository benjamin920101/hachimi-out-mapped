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

@HACHIMI_CLIENT(mv=100, d1={"\u63ee\u63eb\u63e9\u63e8\u63e9\u63ea\u63e7\u63e6", "\u0642\u0641\u064e\u064e\u0640\u0640\u0647\u0643", "\u180a\u180d\u180e\u1809\u180d\u180f\u1809\u1808", "\u2cc6\u2cc5\u2cc2\u2cc0\u2ccf\u2cc7\u2cc4\u2ccf", "\u4e6d\u4e6a\u4e6e\u4e69\u4e68\u4e6f\u4e6a", "\uaf71\uaf70\uaf71\uaf7d\uaf73\uaf7d\uaf73\uaf75", "\u13fa\u13fe\u13fe\u13ff\u13f2\u13ff\u13ff\u13ff", "\ue223\ue22e\ue22f\ue223\ue220\ue222\ue224\ue226", "\u0f02\u0f0e\u0f00\u0f04\u0f0e\u0f02\u0f01\u0f01", "\u4620\u4626\u4629\u4629\u4624\u4621\u4622\u4626", "\u9288\u928e\u9288\u9288\u9288\u928b\u9287\u928c", "\ua7c5\ua7c2\ua7c3\ua7c9\ua7c3\ua7c5\ua7c9\ua7c5", "\u88ba\u88b6\u88b8\u88b8\u88bf\u88b9\u88bc\u88bf", "\u256c\u2568\u256c\u2564\u256b\u256b\u256d\u256d", "\u6c50\u6c51\u6c53\u6c51\u6c50\u6c5f\u6c57", "\u540f\u5400\u540b\u5401\u540f\u540a\u540c\u540b", "\u3dc2\u3dc0\u3dcc\u3dc5\u3dc7\u3dcc\u3dc3\u3dc2", "\u0350\u0350\u0355\u0352\u0351\u0355\u0350\u035e", "\u38e5\u38e2\u38e7\u38ed\u38e6\u38e3\u38e6\u38e7"}, d2={"\u02f8\u02ff\u02d4\u2295\u02a7\u02a5\u02b3\u02d7\u02f1\u02fa\u02ed\u02fa\u02b4\u02f7\u02fa\u02f5\u02fc\u02b4\u02c8\u02ef\u02e9\u02f2\u02f5\u02fc\u02a0\u02b2\u02d7\u02f1\u02fa\u02ed\u02fa\u02b4\u02f7\u02fa\u02f5\u02fc\u02b4\u02c8\u02ef\u02e9\u02f2\u02f5\u02fc\u02a0", "\u0754\u0753\u0767\u2739\u070b\u0709\u071f\u077b\u075d\u0756\u0741\u0756\u0718\u075b\u0756\u0759\u0750\u0718\u0764\u0743\u0745\u075e\u0759\u0750\u070c\u071e\u077b\u075d\u0756\u0741\u0756\u0718\u075b\u0756\u0759\u0750\u0718\u0764\u0743\u0745\u075e\u0759\u0750\u070c", "y~K\u2014&$2Vp{l{5v{t}5Inhst}!3Vp{l{5v{t}5Inhst}!", "\u009e\u0099\u00af\u20f3\u00c1\u00c3\u00d5\u00b1\u0097\u009c\u008b\u009c\u00d2\u0091\u009c\u0093\u009a\u00d2\u00ae\u0089\u008f\u0094\u0093\u009a\u00c6\u00d4\u00b1\u0097\u009c\u008b\u009c\u00d2\u0091\u009c\u0093\u009a\u00d2\u00ae\u0089\u008f\u0094\u0093\u009a\u00c6", "\u0792\u0795\u07a2\u27ff\u07cd\u07cf\u07d9\u07bd\u079b\u0790\u0787\u0790\u07de\u079d\u0790\u079f\u0796\u07de\u07a2\u0785\u0783\u0798\u079f\u0796\u07ca\u07d8\u07bd\u079b\u0790\u0787\u0790\u07de\u079d\u0790\u079f\u0796\u07de\u07a2\u0785\u0783\u0798\u079f\u0796\u07ca", "\u021f\u0240\u024f\u024a\u024d\u024a\u0257\u021d\u021f\u021d\u020b\u020a\u0275", "\u04f7\u04a2\u04a5\u04a2\u04bf\u04f5\u04f7\u04f5\u04e3\u04e2\u049d", "\u0016\u0014\u00052\u001d\u0010\u0002\u0002MOYX=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^2\u001d\u0010\u0002\u0002J", "\u06de\u06d7\u06c5\u06de\u06f5\u06d9\u06d2\u06d3\u068a\u0688\u069e\u069f\u06ff", "\u0150\u0144\u0140\u0154\u0159\u0146\u0109\u010b\u011d\u0179\u015f\u0154\u0143\u0154\u011a\u0159\u0154\u015b\u0152\u011a\u017a\u0157\u015f\u0150\u0156\u0141\u010e\u011c\u016f", "\u009d\u0092\u0091\u0090\u009b\u00c2\u00c0\u00d6\u00d7\u00b2\u0094\u009f\u0088\u009f\u00d1\u0092\u009f\u0090\u0099\u00d1\u00b1\u009c\u0094\u009b\u009d\u008a\u00c5", "\u064c\u0657\u066b\u064c\u064a\u0651\u0656\u065f\u0604\u0606\u0610\u0611\u0674\u0652\u0659\u064e\u0659\u0617\u0654\u0659\u0656\u065f\u0617\u066b\u064c\u064a\u0651\u0656\u065f\u0603", "\u05ec\u05ed\u05f6\u05eb\u05e4\u05fb\u05be\u05bc\u05aa\u05ab\u05d4", "\u06a9\u06a8\u06b3\u06ae\u06a1\u06be\u0686\u06ab\u06ab\u06fb\u06f9\u06ef\u06ee\u0691", "\u0113\u0105\u010d\u0110\u0158\u015a\u014c\u014d\u0132", "\u01e2\u01f4\u01fc\u01e1\u01a9\u01ab\u01bd\u01df\u01bc\u01c3", "\u0653\u0645\u064d\u0650\u0614\u0618\u061a\u060c\u066e\u060d\u0672", ":,$9qse\u0007\u0004d\u001b", "\u0463\u046c\u046b\u0464\u0469\u046c\u047f\u0460\u0439\u043b\u042d\u042c\u0453"})
public final class Class3803 {
    public static int field8609 = 0;
    public static double field8610 = 0.5812129954539845;

    /*
     * WARNING - void declaration
     */
    private static CallSite NuQckPfKwAaJSd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3803.Q92dywPGHpkTVaOB(k2, 1060720654));
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
                int a2 = Integer.parseInt(Class3803.Q92dywPGHpkTVaOB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3803.Q92dywPGHpkTVaOB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3803.Q92dywPGHpkTVaOB(k2, 1060720654) + " " + l2 + " " + m2);
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
        i\u200e = "The rendering mode of the HUD";
        A\u200e = "xdg-open";
        G\u200e = "Keybinds a module";
        V\u200e = "Range of target";
        aK\u200e = "StandHead";
    }

    private static String Q92dywPGHpkTVaOB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

