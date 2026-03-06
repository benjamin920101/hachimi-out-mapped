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

@HACHIMI_CLIENT(mv=100, d1={"\uac3d\uac3f\uac3a\uac3d\uac3e\uac3b\uac36\uac3b", "\u0c82\u0c86\u0c85\u0c84\u0c85\u0c85\u0c82\u0c85", "\u5da7\u5daf\u5da3\u5da3\u5dae\u5da0\u5da3\u5da2", "\ub1f9\ub1f9\ub1fc\ub1f8\ub1fd\ub1fc\ub1f8\ub1f9", "\ubde5\ubdee\ubde3\ubdee\ubde7\ubdef\ubde1\ubde1", "\u970a\u970e\u970f\u970f\u9709\u970f\u970f\u9704", "\u39dc\u39dc\u39d9\u39d9\u39db\u39da\u39dc\u39d9", "\u88e2\u88e2\u88e3\u88ea\u88eb\u88ee\u88ef", "\ub421\ub42b\ub42a\ub420\ub422\ub421\ub427\ub427", "\ub005\ub008\ub000\ub005\ub003\ub006\ub002\ub002", "\u142f\u1423\u142a\u1423\u142d\u142c\u142d\u142b", "\u80c4\u80c1\u80c6\u80c7\u80c3\u80c3\u80cc\u80c6", "\u4aa8\u4aaa\u4aad\u4aaa\u4aa9\u4aaa\u4aad\u4aaa", "\u851a\u8518\u851f\u851c\u8511\u8511\u851c\u851f", "\ub397\ub393\ub392\ub391\ub394\ub39b\ub397\ub39b"}, d2={"\u0634\u063c\u060e\u264a\u0678\u067a\u066c\u0608\u062e\u0625\u0632\u0625\u066b\u0628\u0625\u062a\u0623\u066b\u0617\u0630\u0636\u062d\u062a\u0623\u067f\u066d\u0608\u062e\u0625\u0632\u0625\u066b\u0628\u0625\u062a\u0623\u066b\u0617\u0630\u0636\u062d\u062a\u0623\u067f", "\u05d0\u058f\u0580\u0585\u0582\u0585\u0598\u05d2\u05d0\u05d2\u05c4\u05c5\u05ba", "\u04e3\u04b6\u04b1\u04b6\u04ab\u04e1\u04e3\u04e1\u04f7\u04f6\u0489", "\u05a7\u05a5\u05b4\u0583\u05ac\u05a1\u05b3\u05b3\u05fc\u05fe\u05e8\u05e9\u058c\u05aa\u05a1\u05b6\u05a1\u05ef\u05ac\u05a1\u05ae\u05a7\u05ef\u0583\u05ac\u05a1\u05b3\u05b3\u05fb", "\u0726\u072f\u073d\u0726\u070d\u0721\u072a\u072b\u0772\u0770\u0766\u0767\u0707", "\u0475\u0461\u0465\u0471\u047c\u0463\u042c\u042e\u0438\u045c\u047a\u0471\u0466\u0471\u043f\u047c\u0471\u047e\u0477\u043f\u045f\u0472\u047a\u0475\u0473\u0464\u042b\u0439\u044a", "\u02a7\u02a8\u02ab\u02aa\u02a1\u02f8\u02fa\u02ec\u02ed\u0288\u02ae\u02a5\u02b2\u02a5\u02eb\u02a8\u02a5\u02aa\u02a3\u02eb\u028b\u02a6\u02ae\u02a1\u02a7\u02b0\u02ff", "\u0699\u0682\u06be\u0699\u069f\u0684\u0683\u068a\u06d1\u06d3\u06c5\u06c4\u06a1\u0687\u068c\u069b\u068c\u06c2\u0681\u068c\u0683\u068a\u06c2\u06be\u0699\u069f\u0684\u0683\u068a\u06d6", "\u061d\u061c\u0607\u061a\u0615\u060a\u064f\u064d\u065b\u065a\u0625", "\u04ec\u04ed\u04f6\u04eb\u04e4\u04fb\u04c3\u04ee\u04ee\u04be\u04bc\u04aa\u04ab\u04d4", "\u0524\u0532\u053a\u0527\u056f\u056d\u057b\u057a\u0505", "\u04fa\u04ec\u04e4\u04f9\u04b1\u04b3\u04a5\u04c7\u04a4\u04db", "\u043f\u0429\u0421\u043c\u0478\u0474\u0476\u0460\u0402\u0461\u041e", "\u05f9\u05ef\u05e7\u05fa\u05b2\u05b0\u05a6\u05c4\u05c7\u05a7\u05d8", "\u0712\u071d\u071a\u0715\u0718\u071d\u070e\u0711\u0748\u074a\u075c\u075d\u0722"})
public final class Class5618 {
    public static float field10720;
    public static double field10721;
    public static float field10722;
    public static double field10723;
    public static double field10724;
    public static double field10725;
    public static float field10726;
    public static float field10727;
    public static float field10728;

    static {
        field10728 = Float.intBitsToFloat(1027103840);
        field10724 = Double.longBitsToDouble(4597000613922596684L);
        field10725 = Double.longBitsToDouble(4589650981882002032L);
        field10721 = Double.longBitsToDouble(4602241100330922072L);
        ai\u200e = "AutoJump";
        field10720 = Float.intBitsToFloat(1059767453);
        field10723 = Double.longBitsToDouble(4652007308841189376L);
        field10722 = Float.intBitsToFloat(1058232532);
        field10726 = Float.intBitsToFloat(1061750386);
        field10727 = Float.intBitsToFloat(1058163252);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite uyOSevtiBCZTUo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5618.dDteVjye7WpNOq7n(k2, 630613051));
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
                int a2 = Integer.parseInt(Class5618.dDteVjye7WpNOq7n(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5618.dDteVjye7WpNOq7n(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5618.dDteVjye7WpNOq7n(k2, 630613051) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 23582 : 23583;
        block7: while (true) {
            switch (n3) {
                case 23583: {
                    n3 = 23581;
                    continue block7;
                }
                case 23582: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String dDteVjye7WpNOq7n(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

