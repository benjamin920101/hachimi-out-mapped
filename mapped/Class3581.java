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

@HACHIMI_CLIENT(mv=100, d1={"\u711f\u711f\u7115\u7114\u7115\u7115\u711b\u711c", "\u54b9\u54bb\u54bc\u54ba\u54b9\u54b1\u54be\u54bd", "\u1622\u1624\u1624\u162f\u1627\u1627\u1624\u1622", "\ua229\ua22e\ua228\ua22a\ua227\ua228\ua22b", "\u4224\u4224\u422f\u4222\u4220\u4225\u4220\u4225", "\u4c40\u4c4e\u4c4f\u4c4e\u4c40\u4c43\u4c4e\u4c46", "\u3527\u3521\u3528\u3525\u3521\u3522\u3528\u3527", "\u1c01\u1c07\u1c01\u1c04\u1c01\u1c05\u1c03\u1c0e", "\u5959\u5953\u595f\u595a\u5953\u595b\u5952\u595b", "\ud147\ud14b\ud141\ud14a\ud147\ud144\ud14b\ud14a", "\ud703\ud706\ud702\ud707\ud704\ud700\ud707\ud703", "\u4358\u435a\u435e\u435a\u435d\u435b\u4358\u435f", "\u49cd\u49cf\u49c2\u49c8\u49cc\u49cd\u49cd", "\u33e2\u33e0\u33e1\u33e1\u33e3\u33e3\u33e3\u33e0", "\ua73c\ua73c\ua73b\ua738\ua73b\ua73e\ua735\ua73d", "\ub03f\ub03c\ub03c\ub03c\ub03e\ub03e\ub03f\ub035", "\ue0b6\ue0b8\ue0b8\ue0b4\ue0b5\ue0b8\ue0b0\ue0b7", "\u2d05\u2d0b\u2d05\u2d0b\u2d03\u2d04\u2d0a\u2d01"}, d2={"\u0155\u0155\u0165\u213e\u010c\u010e\u0118\u017c\u015a\u0151\u0146\u0151\u011f\u015c\u0151\u015e\u0157\u011f\u0163\u0144\u0142\u0159\u015e\u0157\u010b\u0119\u017c\u015a\u0151\u0146\u0151\u011f\u015c\u0151\u015e\u0157\u011f\u0163\u0144\u0142\u0159\u015e\u0157\u010b", "\u0139\u0139\u010a\u2152\u0160\u0162\u0174\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167\u0175\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167", "\u0341\u0341\u0373\u232a\u0318\u031a\u030c\u0368\u034e\u0345\u0352\u0345\u030b\u0348\u0345\u034a\u0343\u030b\u0377\u0350\u0356\u034d\u034a\u0343\u031f\u030d\u0368\u034e\u0345\u0352\u0345\u030b\u0348\u0345\u034a\u0343\u030b\u0377\u0350\u0356\u034d\u034a\u0343\u031f", "\u0659\u0659\u0664\u2632\u0600\u0602\u0614\u0670\u0656\u065d\u064a\u065d\u0613\u0650\u065d\u0652\u065b\u0613\u066f\u0648\u064e\u0655\u0652\u065b\u0607\u0615\u0670\u0656\u065d\u064a\u065d\u0613\u0650\u065d\u0652\u065b\u0613\u066f\u0648\u064e\u0655\u0652\u065b\u0607", "\u053c\u0563\u056c\u0569\u056e\u0569\u0574\u053e\u053c\u053e\u0528\u0529\u0556", "\u0795\u07c0\u07c7\u07c0\u07dd\u0797\u0795\u0797\u0781\u0780\u07ff", "\u06de\u06dc\u06cd\u06fa\u06d5\u06d8\u06ca\u06ca\u0685\u0687\u0691\u0690\u06f5\u06d3\u06d8\u06cf\u06d8\u0696\u06d5\u06d8\u06d7\u06de\u0696\u06fa\u06d5\u06d8\u06ca\u06ca\u0682", "\u049a\u0493\u0481\u049a\u04b1\u049d\u0496\u0497\u04ce\u04cc\u04da\u04db\u04bb", "\u061c\u0608\u060c\u0618\u0615\u060a\u0645\u0647\u0651\u0635\u0613\u0618\u060f\u0618\u0656\u0615\u0618\u0617\u061e\u0656\u0636\u061b\u0613\u061c\u061a\u060d\u0642\u0650\u0623", "\u0775\u077a\u0779\u0778\u0773\u072a\u0728\u073e\u073f\u075a\u077c\u0777\u0760\u0777\u0739\u077a\u0777\u0778\u0771\u0739\u0759\u0774\u077c\u0773\u0775\u0762\u072d", "5.\u001253(/&}\u007fih\r+ 7 n- /&n\u001253(/&z", "\u046b\u046a\u0471\u046c\u0463\u047c\u0439\u043b\u042d\u042c\u0453", "\u03b4\u03b5\u03ae\u03b3\u03bc\u03a3\u039b\u03b6\u03b6\u03e6\u03e4\u03f2\u03f3\u038c", "\u02df\u02c9\u02c1\u02dc\u0294\u0296\u0280\u0281\u02fe", "\u0491\u0487\u048f\u0492\u04da\u04d8\u04ce\u04ac\u04cf\u04b0", "\u03c0\u03d6\u03de\u03c3\u0387\u038b\u0389\u039f\u03fd\u039e\u03e1", "\u0200\u0216\u021e\u0203\u024b\u0249\u025f\u023d\u023e\u025e\u0221", "\u0783\u078c\u078b\u0784\u0789\u078c\u079f\u0780\u07d9\u07db\u07cd\u07cc\u07b3"})
public final class Class3581 {
    static {
        ae\u200e = "Only applies velocity in walls while on ground";
        aB\u200e = "RIGHT";
        aQ\u200e = "Phase";
        aV\u200e = "Uses vanilla elytra boost";
    }

    private static String lCur32sflLqUBrjz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite lvJMVChFXV9igj(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3581.lCur32sflLqUBrjz(k2, -1383149794));
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
                int a2 = Integer.parseInt(Class3581.lCur32sflLqUBrjz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3581.lCur32sflLqUBrjz(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3581.lCur32sflLqUBrjz(k2, -1383149794) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 15098 : 15099;
        block7: while (true) {
            switch (n3) {
                case 15099: {
                    n3 = 15097;
                    continue block7;
                }
                case 15098: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

