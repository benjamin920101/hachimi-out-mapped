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

@HACHIMI_CLIENT(mv=100, d1={"\u0503\u0505\u0502\u050b\u0506\u0503\u050a\u050b", "\ub966\ub96c\ub966\ub968\ub966\ub96f\ub96b", "\u43ea\u43e8\u43e1\u43eb\u43e9\u43e1\u43e9\u43ee", "\ud6cd\ud6c8\ud6ca\ud6c8\ud6ca\ud6c9\ud6cc\ud6cd", "\u2574\u2577\u2573\u2575\u2577\u2573\u2575\u2571", "\uac83\uac82\uac81\uac83\uac87\uac82\uac86\uac82", "\u9d1c\u9d1e\u9d10\u9d1b\u9d10\u9d1f\u9d1a\u9d1e", "\u2822\u282f\u2822\u2822\u2824\u2823\u2821\u2824", "\uc95e\uc95e\uc95b\uc959\uc959\uc95d\uc95c\uc95f", "\ub6fb\ub6f9\ub6fd\ub6fc\ub6fc\ub6fd\ub6fc\ub6f8", "\u1aa7\u1aa5\u1aad\u1aa6\u1aad\u1aa7\u1aa1\u1aa2", "\u6d85\u6d80\u6d83\u6d85\u6d80\u6d83\u6d84\u6d81", "\u7ab4\u7ab0\u7ab4\u7ab0\u7ab7\u7ab5\u7ab4\u7abb", "\u6dc1\u6dc6\u6dc6\u6dc4\u6dc4\u6dc4\u6dcc\u6dc4", "\u4d10\u4d17\u4d11\u4d11\u4d11\u4d1d\u4d15\u4d11", "\u3e00\u3e06\u3e02\u3e0c\u3e00\u3e0d\u3e0c\u3e03"}, d2={"\u01f0\u01d3\u01c5\u2193\u01a1\u01a3\u01b5\u01d1\u01f7\u01fc\u01eb\u01fc\u01b2\u01f1\u01fc\u01f3\u01fa\u01b2\u01ce\u01e9\u01ef\u01f4\u01f3\u01fa\u01a6\u01b4\u01d1\u01f7\u01fc\u01eb\u01fc\u01b2\u01f1\u01fc\u01f3\u01fa\u01b2\u01ce\u01e9\u01ef\u01f4\u01f3\u01fa\u01a6", "\u0311\u0332\u0325\u2372\u0340\u0342\u0354\u0330\u0316\u031d\u030a\u031d\u0353\u0310\u031d\u0312\u031b\u0353\u032f\u0308\u030e\u0315\u0312\u031b\u0347\u0355\u0330\u0316\u031d\u030a\u031d\u0353\u0310\u031d\u0312\u031b\u0353\u032f\u0308\u030e\u0315\u0312\u031b\u0347", "\u04eb\u04b4\u04bb\u04be\u04b9\u04be\u04a3\u04e9\u04eb\u04e9\u04ff\u04fe\u0481", "_\n\r\n\u0017]_]KJ5", "\u060d\u060f\u061e\u0629\u0606\u060b\u0619\u0619\u0656\u0654\u0642\u0643\u0626\u0600\u060b\u061c\u060b\u0645\u0606\u060b\u0604\u060d\u0645\u0629\u0606\u060b\u0619\u0619\u0651", "\u04ec\u04e5\u04f7\u04ec\u04c7\u04eb\u04e0\u04e1\u04b8\u04ba\u04ac\u04ad\u04cd", "\u03c8\u03dc\u03d8\u03cc\u03c1\u03de\u0391\u0393\u0385\u03e1\u03c7\u03cc\u03db\u03cc\u0382\u03c1\u03cc\u03c3\u03ca\u0382\u03e2\u03cf\u03c7\u03c8\u03ce\u03d9\u0396\u0384\u03f7", "\u074e\u0741\u0742\u0743\u0748\u0711\u0713\u0705\u0704\u0761\u0747\u074c\u075b\u074c\u0702\u0741\u074c\u0743\u074a\u0702\u0762\u074f\u0747\u0748\u074e\u0759\u0716", "\u0162\u0179\u0145\u0162\u0164\u017f\u0178\u0171\u012a\u0128\u013e\u013f\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0145\u0162\u0164\u017f\u0178\u0171\u012d", "\u0663\u0662\u0679\u0664\u066b\u0674\u0631\u0633\u0625\u0624\u065b", "\u0417\u0416\u040d\u0410\u041f\u0400\u0438\u0415\u0415\u0445\u0447\u0451\u0450\u042f", "\u01e0\u01f6\u01fe\u01e3\u01ab\u01a9\u01bf\u01be\u01c1", "\u023f\u0229\u0221\u023c\u0274\u0276\u0260\u0202\u0261\u021e", "\u05a7\u05b1\u05b9\u05a4\u05e0\u05ec\u05ee\u05f8\u059a\u05f9\u0586", "\u061a\u060c\u0604\u0619\u0651\u0653\u0645\u0627\u0624\u0644\u063b", "\u0167\u0168\u016f\u0160\u016d\u0168\u017b\u0164\u013d\u013f\u0129\u0128\u0157"})
public final class Class3721 {
    public static float field8387 = 0.9805836f;
    public static double field8388;
    public static double field8389;
    public static float field8390;
    public static double field8391;
    public static float field8392;

    static {
        P\u200e = "";
        field8389 = Double.longBitsToDouble(4603284973420519615L);
        field8390 = Float.intBitsToFloat(1021837536);
        field8388 = Double.longBitsToDouble(4606320124817859798L);
        field8391 = Double.longBitsToDouble(4605604467446674406L);
        bf\u200e = "PlaceRange";
        field8392 = Float.intBitsToFloat(1062016817);
    }

    private static String qFyvFtNnvbme3iRB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite RDJnk1AXALRIXS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3721.qFyvFtNnvbme3iRB(k2, -1865197777));
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
                int a2 = Integer.parseInt(Class3721.qFyvFtNnvbme3iRB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3721.qFyvFtNnvbme3iRB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3721.qFyvFtNnvbme3iRB(k2, -1865197777) + " " + l2 + " " + m2);
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

