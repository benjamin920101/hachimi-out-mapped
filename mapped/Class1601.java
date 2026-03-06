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

@HACHIMI_CLIENT(mv=100, d1={"\u423e\u4238\u4232\u423c\u423e\u423e\u423f\u4232", "\udbd7\udbda\udbd8\udbd8\udbdd\udbde\udbd6", "\ub1d5\ub1d5\ub1d6\ub1d5\ub1d0\ub1d5\ub1d5", "\u63c6\u63c7\u63c4\u63cf\u63cf\u63c2\u63c7\u63ce", "\u4c70\u4c7a\u4c71\u4c7f\u4c71\u4c7d\u4c79", "\u7ce4\u7ce9\u7ce2\u7ce8\u7ce6\u7ce9\u7ce0\u7ce2", "\ub094\ub096\ub096\ub094\ub094\ub09e\ub090\ub090", "\u317d\u317e\u317b\u317e\u317b\u3176\u317e\u3178", "\ub623\ub623\ub621\ub626\ub620\ub623\ub620\ub620", "\uc5fd\uc5fc\uc5f6\uc5fc\uc5fd\uc5f6\uc5f6\uc5f9", "\ubbdb\ubbd7\ubbd7\ubbd7\ubbdb\ubbd7\ubbda\ubbde", "\u213f\u2130\u2131\u2139\u2130\u213b\u213f\u2138", "\u6f6a\u6f67\u6f6e\u6f6a\u6f69\u6f6e\u6f6b\u6f6c", "\ud1f4\ud1f5\ud1f3\ud1f3\ud1f6\ud1fa\ud1fa\ud1f2", "\ue2da\ue2da\ue2d8\ue2dc\ue2d8\ue2d2\ue2d9\ue2da", "\ub919\ub917\ub918\ub918\ub919\ub91e\ub917\ub91a", "\u2b0c\u2b08\u2b0d\u2b0f\u2b0b\u2b09\u2b06", "\u766c\u766e\u766f\u7668\u766c\u7664\u7668\u7668", "\u5250\u5251\u525b\u5254\u5251\u5252\u5252\u5256"}, d2={"\u027d\u0279\u0251\u2210\u0222\u0220\u0236\u0252\u0274\u027f\u0268\u027f\u0231\u0272\u027f\u0270\u0279\u0231\u024d\u026a\u026c\u0277\u0270\u0279\u0225\u0237\u0252\u0274\u027f\u0268\u027f\u0231\u0272\u027f\u0270\u0279\u0231\u024d\u026a\u026c\u0277\u0270\u0279\u0225", "\u069b\u069f\u06a8\u26f6\u06c4\u06c6\u06d0\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06ab\u068c\u068a\u0691\u0696\u069f\u06c3\u06d1\u06b4\u0692\u0699\u068e\u0699\u06d7\u0694\u0699\u0696\u069f\u06d7\u06ab\u068c\u068a\u0691\u0696\u069f\u06c3", "\u05da\u05de\u05e8\u25b7\u0585\u0587\u0591\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05ea\u05cd\u05cb\u05d0\u05d7\u05de\u0582\u0590\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05ea\u05cd\u05cb\u05d0\u05d7\u05de\u0582", "\u07d4\u07d0\u07e5\u27b9\u078b\u0789\u079f\u07fb\u07dd\u07d6\u07c1\u07d6\u0798\u07db\u07d6\u07d9\u07d0\u0798\u07e4\u07c3\u07c5\u07de\u07d9\u07d0\u078c\u079e\u07fb\u07dd\u07d6\u07c1\u07d6\u0798\u07db\u07d6\u07d9\u07d0\u0798\u07e4\u07c3\u07c5\u07de\u07d9\u07d0\u078c", "\u0525\u0521\u0515\u2548\u057a\u0578\u056e\u050a\u052c\u0527\u0530\u0527\u0569\u052a\u0527\u0528\u0521\u0569\u0515\u0532\u0534\u052f\u0528\u0521\u057d\u056f\u050a\u052c\u0527\u0530\u0527\u0569\u052a\u0527\u0528\u0521\u0569\u0515\u0532\u0534\u052f\u0528\u0521\u057d", "\u02ec\u02b3\u02bc\u02b9\u02be\u02b9\u02a4\u02ee\u02ec\u02ee\u02f8\u02f9\u0286", "\u03d7\u0382\u0385\u0382\u039f\u03d5\u03d7\u03d5\u03c3\u03c2\u03bd", "\u020d\u020f\u021e\u0229\u0206\u020b\u0219\u0219\u0256\u0254\u0242\u0243\u0226\u0200\u020b\u021c\u020b\u0245\u0206\u020b\u0204\u020d\u0245\u0229\u0206\u020b\u0219\u0219\u0251", "\u069e\u0697\u0685\u069e\u06b5\u0699\u0692\u0693\u06ca\u06c8\u06de\u06df\u06bf", "\u010b\u011f\u011b\u010f\u0102\u011d\u0152\u0150\u0146\u0122\u0104\u010f\u0118\u010f\u0141\u0102\u010f\u0100\u0109\u0141\u0121\u010c\u0104\u010b\u010d\u011a\u0155\u0147\u0134", "\u014b\u0144\u0147\u0146\u014d\u0114\u0116\u0100\u0101\u0164\u0142\u0149\u015e\u0149\u0107\u0144\u0149\u0146\u014f\u0107\u0167\u014a\u0142\u014d\u014b\u015c\u0113", "\u02cc\u02d7\u02eb\u02cc\u02ca\u02d1\u02d6\u02df\u0284\u0286\u0290\u0291\u02f4\u02d2\u02d9\u02ce\u02d9\u0297\u02d4\u02d9\u02d6\u02df\u0297\u02eb\u02cc\u02ca\u02d1\u02d6\u02df\u0283", "\u04ab\u04aa\u04b1\u04ac\u04a3\u04bc\u04f9\u04fb\u04ed\u04ec\u0493", "\u02ac\u02ad\u02b6\u02ab\u02a4\u02bb\u0283\u02ae\u02ae\u02fe\u02fc\u02ea\u02eb\u0294", "\u0167\u0171\u0179\u0164\u012c\u012e\u0138\u0139\u0146", "\u0128\u013e\u0136\u012b\u0163\u0161\u0177\u0115\u0176\u0109", "\u042c\u043a\u0432\u042f\u046b\u0467\u0465\u0473\u0411\u0472\u040d", "<*\"?wuc\u0001\u0002b\u001d", "870?27$;b`vw\b"})
public final class Class1601 {
    public static float field5990;

    private static String WiJGptjo1nzooEnJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        G\u200e = "Grim 2.3.67 bypass";
        ab\u200e = "LagLimit";
        field5990 = Float.intBitsToFloat(0x40800000);
        aA\u200e = "Factor";
        aS\u200e = "Only jump when you are trapped (to prevent jumping out of the block)";
        be\u200e = "Target shulker boxes";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite YGDw9rzbvGQU6Y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1601.WiJGptjo1nzooEnJ(k2, 499689027));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1601.WiJGptjo1nzooEnJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1601.WiJGptjo1nzooEnJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 64388 : 64389;
        block7: while (true) {
            switch (n3) {
                case 64389: {
                    n3 = 64387;
                    continue block7;
                }
                case 64388: {
                    throw new Exception("Can't find method in " + Class1601.WiJGptjo1nzooEnJ(k2, 499689027) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

