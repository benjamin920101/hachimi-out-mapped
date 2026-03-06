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
@HACHIMI_CLIENT(mv=100, d1={"\u9398\u9399\u939f\u939e\u9399\u939b\u939a\u9398", "\uddc7\uddcb\uddc0\uddca\uddc1\uddc3", "\u7366\u7365\u7363\u7360\u7361\u736e\u7363\u7367", "\u78d8\u78d3\u78de\u78d3\u78d8\u78de\u78dd", "\u7ce2\u7ce2\u7ce3\u7ce1\u7ce4\u7ce3\u7ce1\u7ce3", "\u443c\u443f\u443b\u4435\u443c\u443c\u4435", "\ub78c\ub781\ub780\ub781\ub78e\ub78a\ub78c\ub789", "\u68c5\u68c5\u68c9\u68c6\u68c2\u68c3\u68c9\u68c7", "\u1c70\u1c7d\u1c7c\u1c73\u1c7d\u1c73\u1c73\u1c72", "\u35c7\u35c7\u35cd\u35c7\u35c1\u35c4\u35c1\u35c1", "\u34b4\u34b0\u34b0\u34b5\u34b3\u34b2\u34b4\u34b3", "\u60a6\u60a5\u60a2\u60a3\u60a9\u60a6\u60a3\u60a5", "\u13ce\u13c5\u13cd\u13ce\u13c4\u13c8\u13c4\u13c5", "\u3088\u308b\u308b\u308b\u308b\u308d\u3085\u308c", "\uc5aa\uc5a8\uc5a9\uc5ae\uc5a0\uc5ae\uc5a1\uc5ab", "\ubc4c\ubc4e\ubc49\ubc4c\ubc43\ubc42\ubc4b\ubc4a", "\ub1aa\ub1ac\ub1ad\ub1a7\ub1a6\ub1ab\ub1ad\ub1a6"}, d2={"\u0413\u043e\u041e\u2479\u044b\u0449\u045f\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c\u045e\u043b\u041d\u0416\u0401\u0416\u0458\u041b\u0416\u0419\u0410\u0458\u0424\u0403\u0405\u041e\u0419\u0410\u044c", "\u0697\u06ba\u0699\u26fd\u06cf\u06cd\u06db\u06bf\u0699\u0692\u0685\u0692\u06dc\u069f\u0692\u069d\u0694\u06dc\u06a0\u0687\u0681\u069a\u069d\u0694\u06c8\u06da\u06bf\u0699\u0692\u0685\u0692\u06dc\u069f\u0692\u069d\u0694\u06dc\u06a0\u0687\u0681\u069a\u069d\u0694\u06c8", "\u01a1\u018c\u01ae\u21cb\u01f9\u01fb\u01ed\u0189\u01af\u01a4\u01b3\u01a4\u01ea\u01a9\u01a4\u01ab\u01a2\u01ea\u0196\u01b1\u01b7\u01ac\u01ab\u01a2\u01fe\u01ec\u0189\u01af\u01a4\u01b3\u01a4\u01ea\u01a9\u01a4\u01ab\u01a2\u01ea\u0196\u01b1\u01b7\u01ac\u01ab\u01a2\u01fe", "\u053e\u0561\u056e\u056b\u056c\u056b\u0576\u053c\u053e\u053c\u052a\u052b\u0554", "\u0243\u0216\u0211\u0216\u020b\u0241\u0243\u0241\u0257\u0256\u0229", "\u00c8\u00ca\u00db\u00ec\u00c3\u00ce\u00dc\u00dc\u0093\u0091\u0087\u0086\u00e3\u00c5\u00ce\u00d9\u00ce\u0080\u00c3\u00ce\u00c1\u00c8\u0080\u00ec\u00c3\u00ce\u00dc\u00dc\u0094", "\u065a\u0653\u0641\u065a\u0671\u065d\u0656\u0657\u060e\u060c\u061a\u061b\u067b", "\u04d5\u04c1\u04c5\u04d1\u04dc\u04c3\u048c\u048e\u0498\u04fc\u04da\u04d1\u04c6\u04d1\u049f\u04dc\u04d1\u04de\u04d7\u049f\u04ff\u04d2\u04da\u04d5\u04d3\u04c4\u048b\u0499\u04ea", "\u0517\u0518\u051b\u051a\u0511\u0548\u054a\u055c\u055d\u0538\u051e\u0515\u0502\u0515\u055b\u0518\u0515\u051a\u0513\u055b\u053b\u0516\u051e\u0511\u0517\u0500\u054f", "\u0226\u023d\u0201\u0226\u0220\u023b\u023c\u0235\u026e\u026c\u027a\u027b\u021e\u0238\u0233\u0224\u0233\u027d\u023e\u0233\u023c\u0235\u027d\u0201\u0226\u0220\u023b\u023c\u0235\u0269", "\u071f\u071e\u0705\u0718\u0717\u0708\u074d\u074f\u0759\u0758\u0727", "\u021d\u021c\u0207\u021a\u0215\u020a\u0232\u021f\u021f\u024f\u024d\u025b\u025a\u0225", "\u06bd\u06ab\u06a3\u06be\u06f6\u06f4\u06e2\u06e3\u069c", "\u0265\u0273\u027b\u0266\u022e\u022c\u023a\u0258\u023b\u0244", "\u070d\u071b\u0713\u070e\u074a\u0746\u0744\u0752\u0730\u0753\u072c", "\u0704\u0712\u071a\u0707\u074f\u074d\u075b\u0739\u073a\u075a\u0725", "\u0762\u076d\u076a\u0765\u0768\u076d\u077e\u0761\u0738\u073a\u072c\u072d\u0752"})
public final class Class1154 {
    public static double field4611;
    public static float field4612;
    public static float field4613;
    public static float field4614;
    public static float field4615;

    /*
     * WARNING - void declaration
     */
    private static CallSite Dgi9XOqqDnNcZg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1154.5VJVZobP7M6RKJDG(k2, -1642244722));
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
                int a2 = Integer.parseInt(Class1154.5VJVZobP7M6RKJDG(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1154.5VJVZobP7M6RKJDG(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1154.5VJVZobP7M6RKJDG(k2, -1642244722) + " " + l2 + " " + m2);
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
        a\u200e = "Automatically jumps at the edge of blocks";
        Y\u200e = "Vertical";
        field4615 = Float.intBitsToFloat(1049499594);
        field4611 = Double.longBitsToDouble(4603540871157739017L);
        aq\u200e = "Animates the chat";
        field4613 = Float.intBitsToFloat(1049331584);
        field4614 = Float.intBitsToFloat(1062773418);
        field4612 = Float.intBitsToFloat(1035546624);
    }

    private static String 5VJVZobP7M6RKJDG(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

