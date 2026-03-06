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
@HACHIMI_CLIENT(mv=100, d1={"\u31aa\u31ac\u31a4\u31ae\u31ab\u31ac", "\u68a5\u68a4\u68a5\u68a2\u68a3\u68a7\u68a7\u68a2", "\udbe0\udbed\udbe0\udbef\udbea\udbef", "\ua77c\ua77b\ua772\ua77c\ua778\ua773\ua773\ua778", "\u68fa\u68fd\u68f8\u68f6\u68fb\u68fc\u68fc\u68fc", "\u066b\u0666\u0667\u0668\u066d\u066e\u0668\u066e", "\u22a0\u22a8\u22a6\u22a3\u22a3\u22a3\u22a0\u22a7", "\ub77d\ub77a\ub778\ub779\ub77f\ub77f\ub77a\ub77b", "\u2241\u2247\u2247\u2246\u2241\u2242\u2246\u2241", "\u5736\u5734\u5735\u5735\u5736\u5737\u5733\u573b", "\ua583\ua587\ua588\ua580\ua581\ua585\ua585\ua584", "\u56a3\u56a4\u56a3\u56a2\u56a6\u56a9\u56a9\u56a2", "\u14ce\u14c3\u14cf\u14c2\u14cb\u14c8\u14cf\u14ce", "\u779c\u7794\u7795\u7795\u7796\u7792\u7792", "\uccf8\uccfa\uccfc\uccff\uccf3\uccfb\uccfe\uccf2", "\u8856\u8853\u8850\u8853\u8852\u8853\u8851\u8850", "\u93cd\u93c9\u93c8\u93ca\u93c3\u93ca\u93ca", "\u4d94\u4d91\u4d99\u4d94\u4d98\u4d90\u4d90\u4d90"}, d2={"\u07fd\u07d4\u07fd\u279c\u07ae\u07ac\u07ba\u07de\u07f8\u07f3\u07e4\u07f3\u07bd\u07fe\u07f3\u07fc\u07f5\u07bd\u07c1\u07e6\u07e0\u07fb\u07fc\u07f5\u07a9\u07bb\u07de\u07f8\u07f3\u07e4\u07f3\u07bd\u07fe\u07f3\u07fc\u07f5\u07bd\u07c1\u07e6\u07e0\u07fb\u07fc\u07f5\u07a9", "\u0359\u0370\u0346\u2338\u030a\u0308\u031e\u037a\u035c\u0357\u0340\u0357\u0319\u035a\u0357\u0358\u0351\u0319\u0365\u0342\u0344\u035f\u0358\u0351\u030d\u031f\u037a\u035c\u0357\u0340\u0357\u0319\u035a\u0357\u0358\u0351\u0319\u0365\u0342\u0344\u035f\u0358\u0351\u030d", "\u011a\u0133\u0104\u217b\u0149\u014b\u015d\u0139\u011f\u0114\u0103\u0114\u015a\u0119\u0114\u011b\u0112\u015a\u0126\u0101\u0107\u011c\u011b\u0112\u014e\u015c\u0139\u011f\u0114\u0103\u0114\u015a\u0119\u0114\u011b\u0112\u015a\u0126\u0101\u0107\u011c\u011b\u0112\u014e", "\u0617\u063e\u060a\u2676\u0644\u0646\u0650\u0634\u0612\u0619\u060e\u0619\u0657\u0614\u0619\u0616\u061f\u0657\u062b\u060c\u060a\u0611\u0616\u061f\u0643\u0651\u0634\u0612\u0619\u060e\u0619\u0657\u0614\u0619\u0616\u061f\u0657\u062b\u060c\u060a\u0611\u0616\u061f\u0643", "\u0515\u054a\u0545\u0540\u0547\u0540\u055d\u0517\u0515\u0517\u0501\u0500\u057f", "\u058f\u05da\u05dd\u05da\u05c7\u058d\u058f\u058d\u059b\u059a\u05e5", "\u0100\u0102\u0113\u0124\u010b\u0106\u0114\u0114\u015b\u0159\u014f\u014e\u012b\u010d\u0106\u0111\u0106\u0148\u010b\u0106\u0109\u0100\u0148\u0124\u010b\u0106\u0114\u0114\u015c", "\u00de\u00d7\u00c5\u00de\u00f5\u00d9\u00d2\u00d3\u008a\u0088\u009e\u009f\u00ff", "\u0272\u0266\u0262\u0276\u027b\u0264\u022b\u0229\u023f\u025b\u027d\u0276\u0261\u0276\u0238\u027b\u0276\u0279\u0270\u0238\u0258\u0275\u027d\u0272\u0274\u0263\u022c\u023e\u024d", "\u0554\u055b\u0558\u0559\u0552\u050b\u0509\u051f\u051e\u057b\u055d\u0556\u0541\u0556\u0518\u055b\u0556\u0559\u0550\u0518\u0578\u0555\u055d\u0552\u0554\u0543\u050c", "~eY~xcdm64\"#F`k|k%fkdm%Y~xcdm1", "\u0112\u0113\u0108\u0115\u011a\u0105\u0140\u0142\u0154\u0155\u012a", "\u0482\u0483\u0498\u0485\u048a\u0495\u04ad\u0480\u0480\u04d0\u04d2\u04c4\u04c5\u04ba", "\u0273\u0265\u026d\u0270\u0238\u023a\u022c\u022d\u0252", "\u02f1\u02e7\u02ef\u02f2\u02ba\u02b8\u02ae\u02cc\u02af\u02d0", "\u06f7\u06e1\u06e9\u06f4\u06b0\u06bc\u06be\u06a8\u06ca\u06a9\u06d6", "\u042b\u043d\u0435\u0428\u0460\u0462\u0474\u0416\u0415\u0475\u040a", "\u0585\u058a\u058d\u0582\u058f\u058a\u0599\u0586\u05df\u05dd\u05cb\u05ca\u05b5"})
public final class Class4114 {
    public static double field9539 = Double.longBitsToDouble(4606624598172096351L);

    static {
        aA\u200e = "Removes sprint acceleration";
        aP\u200e = "Pitch";
        bi\u200e = "glowRadius";
        bu\u200e = "Packet";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1UR4v7AQDQRUFT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4114.pSvqScjmdEvnSWoL(k2, -1303431093));
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
                int a2 = Integer.parseInt(Class4114.pSvqScjmdEvnSWoL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4114.pSvqScjmdEvnSWoL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4114.pSvqScjmdEvnSWoL(k2, -1303431093) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String pSvqScjmdEvnSWoL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

