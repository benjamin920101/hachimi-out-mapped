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

@HACHIMI_CLIENT(mv=100, d1={"\u0d56\u0d50\u0d52\u0d54\u0d54\u0d50\u0d52\u0d5d", "\u8b86\u8b84\u8b81\u8b87\u8b88\u8b86\u8b84\u8b89", "\u7908\u790d\u790b\u790d\u7908\u790b\u7909\u790b", "\u429a\u429d\u4299\u429c\u429d\u429a\u4299\u4293", "\udb76\udb78\udb78\udb74\udb74\udb74\udb76\udb73", "\u65a6\u65a1\u65a3\u65a2\u65aa\u65a1\u65a5\u65a7", "\ud8a4\ud8a4\ud8a4\ud8a8\ud8a4\ud8a9\ud8a6\ud8a2", "\u2d2e\u2d29\u2d2d\u2d2e\u2d25\u2d28\u2d2e", "\u0b34\u0b34\u0b39\u0b36\u0b38\u0b33\u0b35\u0b31", "\u6d71\u6d7d\u6d7d\u6d7f\u6d78\u6d71\u6d7e", "\uace6\uace7\uaceb\uace4\uace0\uace4\uacea\uaceb", "\ud620\ud624\ud621\ud627\ud622\ud620\ud627\ud624", "\u1192\u1195\u1196\u1193\u1197\u1193\u1195\u1195", "\u7171\u7176\u7177\u7176\u717a\u717b\u7170\u7177", "\u64b5\u64b3\u64b1\u64ba\u64b4\u64b7\u64b2\u64b6", "\u6c6e\u6c6b\u6c60\u6c6a\u6c6f\u6c60\u6c68", "\uc119\uc110\uc118\uc11b\uc11d\uc11e\uc11e\uc11a", "\ub1fe\ub1fa\ub1fe\ub1f9\ub1fc\ub1f9\ub1f5\ub1fa", "\u92d4\u92d6\u92d3\u92de\u92d2\u92d1\u92d1\u92d7"}, d2={"\u02dc\u02d7\u02f8\u22a1\u0293\u0291\u0287\u02e3\u02c5\u02ce\u02d9\u02ce\u0280\u02c3\u02ce\u02c1\u02c8\u0280\u02fc\u02db\u02dd\u02c6\u02c1\u02c8\u0294\u0286\u02e3\u02c5\u02ce\u02d9\u02ce\u0280\u02c3\u02ce\u02c1\u02c8\u0280\u02fc\u02db\u02dd\u02c6\u02c1\u02c8\u0294", "\u02c2\u02c9\u02e9\u22bf\u028d\u028f\u0299\u02fd\u02db\u02d0\u02c7\u02d0\u029e\u02dd\u02d0\u02df\u02d6\u029e\u02e2\u02c5\u02c3\u02d8\u02df\u02d6\u028a\u0298\u02fd\u02db\u02d0\u02c7\u02d0\u029e\u02dd\u02d0\u02df\u02d6\u029e\u02e2\u02c5\u02c3\u02d8\u02df\u02d6\u028a", "\u0470\u047b\u045a\u240d\u043f\u043d\u042b\u044f\u0469\u0462\u0475\u0462\u042c\u046f\u0462\u046d\u0464\u042c\u0450\u0477\u0471\u046a\u046d\u0464\u0438\u042a\u044f\u0469\u0462\u0475\u0462\u042c\u046f\u0462\u046d\u0464\u042c\u0450\u0477\u0471\u046a\u046d\u0464\u0438", "\u07e9\u07e2\u07c0\u2794\u07a6\u07a4\u07b2\u07d6\u07f0\u07fb\u07ec\u07fb\u07b5\u07f6\u07fb\u07f4\u07fd\u07b5\u07c9\u07ee\u07e8\u07f3\u07f4\u07fd\u07a1\u07b3\u07d6\u07f0\u07fb\u07ec\u07fb\u07b5\u07f6\u07fb\u07f4\u07fd\u07b5\u07c9\u07ee\u07e8\u07f3\u07f4\u07fd\u07a1", "\u0636\u063c\u0624\u264b\u0679\u067b\u066d\u0609\u062f\u0624\u0633\u0624\u066a\u0629\u0624\u062b\u0622\u066a\u0616\u0631\u0637\u062c\u062b\u0622\u067e\u066c\u0609\u062f\u0624\u0633\u0624\u066a\u0629\u0624\u062b\u0622\u066a\u0616\u0631\u0637\u062c\u062b\u0622\u067e", "\u076f\u0730\u073f\u073a\u073d\u073a\u0727\u076d\u076f\u076d\u077b\u077a\u0705", "\u0097\u00c2\u00c5\u00c2\u00df\u0095\u0097\u0095\u0083\u0082\u00fd", "\u079c\u079e\u078f\u07b8\u0797\u079a\u0788\u0788\u07c7\u07c5\u07d3\u07d2\u07b7\u0791\u079a\u078d\u079a\u07d4\u0797\u079a\u0795\u079c\u07d4\u07b8\u0797\u079a\u0788\u0788\u07c0", "\u030f\u0306\u0314\u030f\u0324\u0308\u0303\u0302\u035b\u0359\u034f\u034e\u032e", "\u04a0\u04b4\u04b0\u04a4\u04a9\u04b6\u04f9\u04fb\u04ed\u0489\u04af\u04a4\u04b3\u04a4\u04ea\u04a9\u04a4\u04ab\u04a2\u04ea\u048a\u04a7\u04af\u04a0\u04a6\u04b1\u04fe\u04ec\u049f", "\u0251\u025e\u025d\u025c\u0257\u020e\u020c\u021a\u021b\u027e\u0258\u0253\u0244\u0253\u021d\u025e\u0253\u025c\u0255\u021d\u027d\u0250\u0258\u0257\u0251\u0246\u0209", "\u01f0\u01eb\u01d7\u01f0\u01f6\u01ed\u01ea\u01e3\u01b8\u01ba\u01ac\u01ad\u01c8\u01ee\u01e5\u01f2\u01e5\u01ab\u01e8\u01e5\u01ea\u01e3\u01ab\u01d7\u01f0\u01f6\u01ed\u01ea\u01e3\u01bf", "\u07cb\u07ca\u07d1\u07cc\u07c3\u07dc\u0799\u079b\u078d\u078c\u07f3", "\u0279\u0278\u0263\u027e\u0271\u026e\u0256\u027b\u027b\u022b\u0229\u023f\u023e\u0241", "\u06d6\u06c0\u06c8\u06d5\u069d\u069f\u0689\u0688\u06f7", "\u0576\u0560\u0568\u0575\u053d\u053f\u0529\u054b\u0528\u0557", "\u067b\u066d\u0665\u0678\u063c\u0630\u0632\u0624\u0646\u0625\u065a", "\u0299\u028f\u0287\u029a\u02d2\u02d0\u02c6\u02a4\u02a7\u02c7\u02b8", "\u05fa\u05f5\u05f2\u05fd\u05f0\u05f5\u05e6\u05f9\u05a0\u05a2\u05b4\u05b5\u05ca"})
public final class Class1210 {
    public static float field4765;
    public static float field4766;
    public static float field4767;
    public static float field4768;
    public static int field4769 = 153471596;

    /*
     * WARNING - void declaration
     */
    private static CallSite It9bLrQNN2yrNx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1210.FvFiJV7nWeY2Tqfi(k2, -2039494211));
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
                int a2 = Integer.parseInt(Class1210.FvFiJV7nWeY2Tqfi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1210.FvFiJV7nWeY2Tqfi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1210.FvFiJV7nWeY2Tqfi(k2, -2039494211) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String FvFiJV7nWeY2Tqfi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        d\u200e = "_";
        field4765 = Float.intBitsToFloat(1053809386);
        D\u200e = "GrayText";
        G\u200e = ", ";
        field4768 = Float.intBitsToFloat(1060547880);
        aL\u200e = "No rotation when you freeze";
        field4766 = Float.intBitsToFloat(1062428701);
        field4767 = Float.intBitsToFloat(1042224704);
        ch\u200e = "Minimum time before considering a crystal break/place failed";
    }
}

