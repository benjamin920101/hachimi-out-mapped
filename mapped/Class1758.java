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

@HACHIMI_CLIENT(mv=100, d1={"\ua545\ua541\ua545\ua54e\ua542\ua543\ua54f\ua541", "\ua49f\ua499\ua49e\ua49f\ua49b\ua497\ua49e\ua49d", "\ubf01\ubf05\ubf08\ubf09\ubf01\ubf01\ubf00\ubf06", "\ud82a\ud82d\ud821\ud828\ud82b\ud828\ud82d\ud820", "\uc1ac\uc1a6\uc1ad\uc1ac\uc1a7\uc1af\uc1a8\uc1ac", "\u17f0\u17f7\u17f0\u17f4\u17f3\u17f7\u17f4\u17f1", "\u78ab\u78ab\u78a9\u78a4\u78ab\u78a9\u78a5\u78a4", "\u0ae9\u0ae7\u0aec\u0aee\u0aeb\u0ae9\u0ae9\u0aed", "\u2d24\u2d23\u2d21\u2d21\u2d25\u2d26\u2d28\u2d29", "\u2938\u293a\u2932\u2932\u2939\u293d\u293a\u293d", "\u22fd\u22f8\u22fa\u22ff\u22f6\u22f6\u22f9", "\uaf38\uaf3e\uaf39\uaf3a\uaf34\uaf39\uaf3d\uaf3c", "\u6b15\u6b15\u6b15\u6b13\u6b15\u6b16\u6b1e\u6b15", "\u4669\u466a\u466a\u4669\u466e\u466d\u4669\u4662", "\u1433\u1437\u1434\u1436\u1436\u1434\u1437\u1433", "\udafa\udafb\udaf3\udaf2\udafe\udaf8\udaf3\udafe"}, d2={"\u048d\u04b4\u04a6\u24f2\u04c0\u04c2\u04d4\u04b0\u0496\u049d\u048a\u049d\u04d3\u0490\u049d\u0492\u049b\u04d3\u04af\u0488\u048e\u0495\u0492\u049b\u04c7\u04d5\u04b0\u0496\u049d\u048a\u049d\u04d3\u0490\u049d\u0492\u049b\u04d3\u04af\u0488\u048e\u0495\u0492\u049b\u04c7", "\u0179\u0141\u0169\u2106\u0134\u0136\u0120\u0144\u0162\u0169\u017e\u0169\u0127\u0164\u0169\u0166\u016f\u0127\u015b\u017c\u017a\u0161\u0166\u016f\u0133\u0121\u0144\u0162\u0169\u017e\u0169\u0127\u0164\u0169\u0166\u016f\u0127\u015b\u017c\u017a\u0161\u0166\u016f\u0133", "\u0577\u0528\u0527\u0522\u0525\u0522\u053f\u0575\u0577\u0575\u0563\u0562\u051d", "\u0590\u05c5\u05c2\u05c5\u05d8\u0592\u0590\u0592\u0584\u0585\u05fa", "\u03fa\u03f8\u03e9\u03de\u03f1\u03fc\u03ee\u03ee\u03a1\u03a3\u03b5\u03b4\u03d1\u03f7\u03fc\u03eb\u03fc\u03b2\u03f1\u03fc\u03f3\u03fa\u03b2\u03de\u03f1\u03fc\u03ee\u03ee\u03a6", "\u042f\u0426\u0434\u042f\u0404\u0428\u0423\u0422\u047b\u0479\u046f\u046e\u040e", "\u01ef\u01fb\u01ff\u01eb\u01e6\u01f9\u01b6\u01b4\u01a2\u01c6\u01e0\u01eb\u01fc\u01eb\u01a5\u01e6\u01eb\u01e4\u01ed\u01a5\u01c5\u01e8\u01e0\u01ef\u01e9\u01fe\u01b1\u01a3\u01d0", "\u03cd\u03c2\u03c1\u03c0\u03cb\u0392\u0390\u0386\u0387\u03e2\u03c4\u03cf\u03d8\u03cf\u0381\u03c2\u03cf\u03c0\u03c9\u0381\u03e1\u03cc\u03c4\u03cb\u03cd\u03da\u0395", "\u054c\u0557\u056b\u054c\u054a\u0551\u0556\u055f\u0504\u0506\u0510\u0511\u0574\u0552\u0559\u054e\u0559\u0517\u0554\u0559\u0556\u055f\u0517\u056b\u054c\u054a\u0551\u0556\u055f\u0503", "\u05d0\u05d1\u05ca\u05d7\u05d8\u05c7\u0582\u0580\u0596\u0597\u05e8", "\u0652\u0653\u0648\u0655\u065a\u0645\u067d\u0650\u0650\u0600\u0602\u0614\u0615\u066a", "\u0129\u013f\u0137\u012a\u0162\u0160\u0176\u0177\u0108", "\u0244\u0252\u025a\u0247\u020f\u020d\u021b\u0279\u021a\u0265", "\u0529\u053f\u0537\u052a\u056e\u0562\u0560\u0576\u0514\u0577\u0508", "\u05c3\u05d5\u05dd\u05c0\u0588\u058a\u059c\u05fe\u05fd\u059d\u05e2", "\u03c3\u03cc\u03cb\u03c4\u03c9\u03cc\u03df\u03c0\u0399\u039b\u038d\u038c\u03f3"})
public final class Class1758 {
    public static long field6590 = 0xFFFFFFFFL;
    public static int field6591 = -1585145487;
    public static float field6592;
    public static float field6593;
    public static double field6594;

    /*
     * WARNING - void declaration
     */
    private static CallSite ZCsmrsHQUdG8wH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1758.Obm8zT02y4GNDb2H(k2, 938525617));
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
                int a2 = Integer.parseInt(Class1758.Obm8zT02y4GNDb2H(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1758.Obm8zT02y4GNDb2H(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1758.Obm8zT02y4GNDb2H(k2, 938525617) + " " + l2 + " " + m2);
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
        n\u200e = "luck";
        field6592 = Float.intBitsToFloat(1092616192);
        field6594 = Double.longBitsToDouble(4603579539312869376L);
        field6593 = Float.intBitsToFloat(1059705262);
        bF\u200e = "Modifies attacks to always land critical hits";
    }

    private static String Obm8zT02y4GNDb2H(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

