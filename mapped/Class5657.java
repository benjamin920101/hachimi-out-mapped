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

@HACHIMI_CLIENT(mv=100, d1={"\u0329\u0328\u0328\u0327\u0322\u0324\u0326", "\u52e4\u52e7\u52eb\u52e7\u52e2\u52ea\u52e2\u52e3", "\u6f51\u6f52\u6f53\u6f52\u6f56\u6f55\u6f5b\u6f5b", "\u9b57\u9b59\u9b5e\u9b5a\u9b56\u9b56\u9b56", "\u9164\u9167\u9161\u9167\u9160\u9165\u9163\u9164", "\ub7b5\ub7b4\ub7bd\ub7b0\ub7b1\ub7bd\ub7b5\ub7b5", "\u9ad7\u9ad9\u9ad2\u9ad4\u9ad0\u9ad4\u9ad3\u9ad9", "\udafd\udaf3\udaf3\udaff\udaff\udaf8\udaff\udafd", "\ud0e9\ud0eb\ud0eb\ud0e6\ud0eb\ud0ee\ud0eb\ud0ea", "\u8177\u8172\u8176\u8177\u8177\u8170\u8171\u8173", "\ubc23\ubc22\ubc21\ubc25\ubc22\ubc24\ubc24\ubc23", "\u3190\u3197\u3190\u3192\u3197\u3191\u3193\u3195", "\uaa3c\uaa31\uaa30\uaa3d\uaa3c\uaa3d\uaa39\uaa3b", "\u37ad\u37a5\u37aa\u37ac\u37a4\u37a8\u37a4\u37a5", "\ub444\ub443\ub447\ub440\ub441\ub444\ub447\ub443", "\ud879\ud870\ud87c\ud87a\ud878\ud87f\ud870", "\u3dcd\u3dc3\u3dc8\u3dc3\u3dcc\u3dc8\u3dcb\u3dc8", "\uc412\uc415\uc412\uc410\uc41e\uc413\uc41f\uc41e", "\u3614\u3614\u3616\u3612\u361f\u361f\u3613\u3614"}, d2={"\u00e7\u00fd\u00f0\u2099\u00ab\u00a9\u00bf\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac\u00be\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac", "\u0652\u0648\u064a\u262c\u061e\u061c\u060a\u066e\u0648\u0643\u0654\u0643\u060d\u064e\u0643\u064c\u0645\u060d\u0671\u0656\u0650\u064b\u064c\u0645\u0619\u060b\u066e\u0648\u0643\u0654\u0643\u060d\u064e\u0643\u064c\u0645\u060d\u0671\u0656\u0650\u064b\u064c\u0645\u0619", "\u03bb\u03a1\u03a2\u23c5\u03f7\u03f5\u03e3\u0387\u03a1\u03aa\u03bd\u03aa\u03e4\u03a7\u03aa\u03a5\u03ac\u03e4\u0398\u03bf\u03b9\u03a2\u03a5\u03ac\u03f0\u03e2\u0387\u03a1\u03aa\u03bd\u03aa\u03e4\u03a7\u03aa\u03a5\u03ac\u03e4\u0398\u03bf\u03b9\u03a2\u03a5\u03ac\u03f0", "\u00d0\u00ca\u00ca\u20ae\u009c\u009e\u0088\u00ec\u00ca\u00c1\u00d6\u00c1\u008f\u00cc\u00c1\u00ce\u00c7\u008f\u00f3\u00d4\u00d2\u00c9\u00ce\u00c7\u009b\u0089\u00ec\u00ca\u00c1\u00d6\u00c1\u008f\u00cc\u00c1\u00ce\u00c7\u008f\u00f3\u00d4\u00d2\u00c9\u00ce\u00c7\u009b", "\u04da\u04c0\u04c1\u24a4\u0496\u0494\u0482\u04e6\u04c0\u04cb\u04dc\u04cb\u0485\u04c6\u04cb\u04c4\u04cd\u0485\u04f9\u04de\u04d8\u04c3\u04c4\u04cd\u0491\u0483\u04e6\u04c0\u04cb\u04dc\u04cb\u0485\u04c6\u04cb\u04c4\u04cd\u0485\u04f9\u04de\u04d8\u04c3\u04c4\u04cd\u0491", "\u0237\u0268\u0267\u0262\u0265\u0262\u027f\u0235\u0237\u0235\u0223\u0222\u025d", "\u067c\u0629\u062e\u0629\u0634\u067e\u067c\u067e\u0668\u0669\u0616", "\u0017\u0015\u00043\u001c\u0011\u0003\u0003LNXY<\u001a\u0011\u0006\u0011_\u001c\u0011\u001e\u0017_3\u001c\u0011\u0003\u0003K", "^WE^uYRS\n\b\u001e\u001f\u007f", "\u0789\u079d\u0799\u078d\u0780\u079f\u07d0\u07d2\u07c4\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07a3\u078e\u0786\u0789\u078f\u0798\u07d7\u07c5\u07b6", "\u04f6\u04f9\u04fa\u04fb\u04f0\u04a9\u04ab\u04bd\u04bc\u04d9\u04ff\u04f4\u04e3\u04f4\u04ba\u04f9\u04f4\u04fb\u04f2\u04ba\u04da\u04f7\u04ff\u04f0\u04f6\u04e1\u04ae", "\u0001\u001a&\u0001\u0007\u001c\u001b\u0012IK]\\9\u001f\u0014\u0003\u0014Z\u0019\u0014\u001b\u0012Z&\u0001\u0007\u001c\u001b\u0012N", "\u044e\u044f\u0454\u0449\u0446\u0459\u041c\u041e\u0408\u0409\u0476", "\u03b8\u03b9\u03a2\u03bf\u03b0\u03af\u0397\u03ba\u03ba\u03ea\u03e8\u03fe\u03ff\u0380", "\u045f\u0449\u0441\u045c\u0414\u0416\u0400\u0401\u047e", "\u01ce\u01d8\u01d0\u01cd\u0185\u0187\u0191\u01f3\u0190\u01ef", "\u010f\u0119\u0111\u010c\u0148\u0144\u0146\u0150\u0132\u0151\u012e", "\u056e\u0578\u0570\u056d\u0525\u0527\u0531\u0553\u0550\u0530\u054f", "\u064d\u0642\u0645\u064a\u0647\u0642\u0651\u064e\u0617\u0615\u0603\u0602\u067d"})
public final class Class5657 {
    public static float field10843;
    public static float field10844;
    public static double field10845;
    public static double field10846;
    public static float field10847;

    private static String STeTKgSvqivOnGul(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10844 = Float.intBitsToFloat(1052680400);
        f\u200e = "The render color for monsters";
        field10845 = Double.longBitsToDouble(4597967403936040136L);
        field10847 = Float.intBitsToFloat(1052457472);
        field10846 = Double.longBitsToDouble(4604778081679763770L);
        ab\u200e = "playtimeSeconds";
        ay\u200e = "steam";
        aR\u200e = "MAINHAND";
        field10843 = Float.intBitsToFloat(1054714682);
        ch\u200e = "AutoWalk";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite wptqCOktjnAjn9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5657.STeTKgSvqivOnGul(k2, 1784216226));
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
                int a2 = Integer.parseInt(Class5657.STeTKgSvqivOnGul(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5657.STeTKgSvqivOnGul(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 44118 : 44119;
        block7: while (true) {
            switch (n3) {
                case 44119: {
                    n3 = 44117;
                    continue block7;
                }
                case 44118: {
                    throw new Exception("Can't find method in " + Class5657.STeTKgSvqivOnGul(k2, 1784216226) + " " + l2 + " " + m2);
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

