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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u115b\u115c\u1155\u1155\u1159\u115c\u1155\u1159", "\u9529\u9528\u952d\u952b\u9529\u9528\u9524\u9529", "\u7956\u7955\u795c\u795c\u795c\u7950\u795d\u7951", "\u3c2f\u3c2b\u3c2d\u3c27\u3c2e", "\u391d\u391e\u391b\u391e\u391b\u3913\u391c\u3912", "\u30f0\u30f1\u30f8\u30f6\u30f1\u30f8\u30f7\u30f8", "\u04a1\u04a7\u04a5\u04a1\u04ad\u04a1\u04a4\u04a0", "\ub102\ub101\ub100\ub102\ub107\ub102\ub103\ub106", "\u7707\u770c\u7705\u7706\u7701\u7702\u7702\u7703", "\u0287\u0286\u028b\u0283\u0280\u0280\u0286\u0286", "\u33cd\u33c2\u33c9\u33cc\u33c3\u33cb\u33c2\u33c3", "\u5e45\u5e42\u5e42\u5e45\u5e45\u5e46\u5e46\u5e45", "\u4943\u4947\u4940\u4940\u4946\u4943\u4940\u4940", "\ud7b6\ud7b9\ud7b5\ud7b5\ud7b8\ud7b1\ud7b8\ud7b7", "\u4106\u4105\u4103\u410d\u410d\u4100\u4101\u410d", "\u41d9\u41d9\u41de\u41d2\u41dd\u41d3\u41da\u41d2", "\u7f80\u7f80\u7f84\u7f84\u7f86\u7f81\u7f87\u7f82"}, d2={"\u0154\u0178\u016a\u213e\u010c\u010e\u0118\u017c\u015a\u0151\u0146\u0151\u011f\u015c\u0151\u015e\u0157\u011f\u0163\u0144\u0142\u0159\u015e\u0157\u010b\u0119\u017c\u015a\u0151\u0146\u0151\u011f\u015c\u0151\u015e\u0157\u011f\u0163\u0144\u0142\u0159\u015e\u0157\u010b", "\u03b0\u039d\u03b5\u23da\u03e8\u03ea\u03fc\u0398\u03be\u03b5\u03a2\u03b5\u03fb\u03b8\u03b5\u03ba\u03b3\u03fb\u0387\u03a0\u03a6\u03bd\u03ba\u03b3\u03ef\u03fd\u0398\u03be\u03b5\u03a2\u03b5\u03fb\u03b8\u03b5\u03ba\u03b3\u03fb\u0387\u03a0\u03a6\u03bd\u03ba\u03b3\u03ef", "\u03a6\u038b\u03a0\u23cc\u03fe\u03fc\u03ea\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9\u03eb\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9", "%zupwpm'%'10O", "\u078f\u07da\u07dd\u07da\u07c7\u078d\u078f\u078d\u079b\u079a\u07e5", "\u04b0\u04b2\u04a3\u0494\u04bb\u04b6\u04a4\u04a4\u04eb\u04e9\u04ff\u04fe\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0494\u04bb\u04b6\u04a4\u04a4\u04ec", "\u0466\u046f\u047d\u0466\u044d\u0461\u046a\u046b\u0432\u0430\u0426\u0427\u0447", "\u0225\u0231\u0235\u0221\u022c\u0233\u027c\u027e\u0268\u020c\u022a\u0221\u0236\u0221\u026f\u022c\u0221\u022e\u0227\u026f\u020f\u0222\u022a\u0225\u0223\u0234\u027b\u0269\u021a", "\u065f\u0650\u0653\u0652\u0659\u0600\u0602\u0614\u0615\u0670\u0656\u065d\u064a\u065d\u0613\u0650\u065d\u0652\u065b\u0613\u0673\u065e\u0656\u0659\u065f\u0648\u0607", "\u03c5\u03de\u03e2\u03c5\u03c3\u03d8\u03df\u03d6\u038d\u038f\u0399\u0398\u03fd\u03db\u03d0\u03c7\u03d0\u039e\u03dd\u03d0\u03df\u03d6\u039e\u03e2\u03c5\u03c3\u03d8\u03df\u03d6\u038a", "\u01de\u01df\u01c4\u01d9\u01d6\u01c9\u018c\u018e\u0198\u0199\u01e6", "\u0176\u0177\u016c\u0171\u017e\u0161\u0159\u0174\u0174\u0124\u0126\u0130\u0131\u014e", "\u058e\u0598\u0590\u058d\u05c5\u05c7\u05d1\u05d0\u05af", "\u02a0\u02b6\u02be\u02a3\u02eb\u02e9\u02ff\u029d\u02fe\u0281", "\u0216\u0200\u0208\u0215\u0251\u025d\u025f\u0249\u022b\u0248\u0237", "\u0683\u0695\u069d\u0680\u06c8\u06ca\u06dc\u06be\u06bd\u06dd\u06a2", "uz}r\u007fziv/-;:E"})
public final class Class3825 {
    public static double field8659;
    public static float field8660;
    public static double field8661;
    public static float field8662;
    public static double field8663 = 0.6951784191429423;
    public static float field8664;

    static {
        l\u200e = "Displays the current server brand";
        field8660 = Float.intBitsToFloat(1063409311);
        D\u200e = "Selected";
        N\u200e = "VehicleMove - x: %s, y: %s, z: %s, yaw: %s, pitch: %s";
        field8664 = Float.intBitsToFloat(1063041635);
        field8659 = Double.longBitsToDouble(4600774774527383348L);
        field8661 = Double.longBitsToDouble(4606469642337100668L);
        field8662 = Float.intBitsToFloat(1059152640);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 8qtJoEOZ21DNaI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3825.r71qPCod2Uqr8AGQ(k2, 1563903983));
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
                int a2 = Integer.parseInt(Class3825.r71qPCod2Uqr8AGQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n4 = e2 % 59557 != m2.intValue() ? 564 : 563;
            while ((n3 = n4) != 563) {
                if (n3 != 564) continue block2;
                n4 = 562;
            }
            String c2 = Class3825.r71qPCod2Uqr8AGQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3825.r71qPCod2Uqr8AGQ(k2, 1563903983) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String r71qPCod2Uqr8AGQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

