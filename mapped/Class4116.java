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

@HACHIMI_CLIENT(mv=100, d1={"\uc2d1\uc2d7\uc2d4\uc2d4\uc2d0\uc2d5\uc2d3\uc2d2", "\u4013\u4013\u4018\u4015\u4014\u4019\u4017\u4013", "\u27ed\u27eb\u27ed\u27e2\u27e3\u27ec\u27e3\u27ed", "\u59fb\u59ff\u59ff\u59f6\u59fc\u59fa\u59fb\u59fd", "\ud749\ud74c\ud74c\ud74e\ud74f\ud741\ud74d\ud74c", "\ua1f5\ua1f6\ua1f2\ua1f1\ua1f3\ua1f6\ua1f2\ua1f7", "\ud1a2\ud1a1\ud1a2\ud1a1\ud1a9\ud1a7\ud1a1\ud1a4", "\ua05b\ua058\ua05d\ua05b\ua05c\ua05a\ua05c\ua050", "\uccaf\uccad\uccaa\uccac\ucca5\uccab\uccab\uccad", "\ue2eb\ue2e1\ue2e8\ue2e8\ue2e0\ue2eb\ue2ed\ue2e8", "\u51de\u51db\u51d9\u51dc\u51dd\u51de\u51dd\u51dd", "\u916b\u916c\u916f\u916d\u916f\u916f\u9168\u916f", "\ub994\ub996\ub991\ub990\ub995\ub995\ub99e\ub993", "\u98d0\u98d1\u98db\u98d6\u98d6\u98d3\u98d7\u98d5", "\u3093\u3090\u3096\u3098\u3094\u3093\u3090\u3093", "\uc03a\uc03a\uc03c\uc03f\uc034\uc03f\uc03e\uc03c", "\ud6dc\ud6da\ud6dd\ud6d7\ud6df\ud6d7"}, d2={"\u05e0\u05ec\u05d3\u258d\u05bf\u05bd\u05ab\u05cf\u05e9\u05e2\u05f5\u05e2\u05ac\u05ef\u05e2\u05ed\u05e4\u05ac\u05d0\u05f7\u05f1\u05ea\u05ed\u05e4\u05b8\u05aa\u05cf\u05e9\u05e2\u05f5\u05e2\u05ac\u05ef\u05e2\u05ed\u05e4\u05ac\u05d0\u05f7\u05f1\u05ea\u05ed\u05e4\u05b8", "\u075c\u0750\u076e\u2731\u0703\u0701\u0717\u0773\u0755\u075e\u0749\u075e\u0710\u0753\u075e\u0751\u0758\u0710\u076c\u074b\u074d\u0756\u0751\u0758\u0704\u0716\u0773\u0755\u075e\u0749\u075e\u0710\u0753\u075e\u0751\u0758\u0710\u076c\u074b\u074d\u0756\u0751\u0758\u0704", "\u0556\u055a\u0567\u253b\u0509\u050b\u051d\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e\u051c\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e", "\u02fd\u02a2\u02ad\u02a8\u02af\u02a8\u02b5\u02ff\u02fd\u02ff\u02e9\u02e8\u0297", "\u01e1\u01b4\u01b3\u01b4\u01a9\u01e3\u01e1\u01e3\u01f5\u01f4\u018b", "\u059f\u059d\u058c\u05bb\u0594\u0599\u058b\u058b\u05c4\u05c6\u05d0\u05d1\u05b4\u0592\u0599\u058e\u0599\u05d7\u0594\u0599\u0596\u059f\u05d7\u05bb\u0594\u0599\u058b\u058b\u05c3", "\u046d\u0464\u0476\u046d\u0446\u046a\u0461\u0460\u0439\u043b\u042d\u042c\u044c", "\u03f4\u03e0\u03e4\u03f0\u03fd\u03e2\u03ad\u03af\u03b9\u03dd\u03fb\u03f0\u03e7\u03f0\u03be\u03fd\u03f0\u03ff\u03f6\u03be\u03de\u03f3\u03fb\u03f4\u03f2\u03e5\u03aa\u03b8\u03cb", "\u0277\u0278\u027b\u027a\u0271\u0228\u022a\u023c\u023d\u0258\u027e\u0275\u0262\u0275\u023b\u0278\u0275\u027a\u0273\u023b\u025b\u0276\u027e\u0271\u0277\u0260\u022f", "\u0131\u012a\u0116\u0131\u0137\u012c\u012b\u0122\u0179\u017b\u016d\u016c\u0109\u012f\u0124\u0133\u0124\u016a\u0129\u0124\u012b\u0122\u016a\u0116\u0131\u0137\u012c\u012b\u0122\u017e", "\u00da\u00db\u00c0\u00dd\u00d2\u00cd\u0088\u008a\u009c\u009d\u00e2", "\u05c9\u05c8\u05d3\u05ce\u05c1\u05de\u05e6\u05cb\u05cb\u059b\u0599\u058f\u058e\u05f1", "\u03ac\u03ba\u03b2\u03af\u03e7\u03e5\u03f3\u03f2\u038d", "\u0361\u0377\u037f\u0362\u032a\u0328\u033e\u035c\u033f\u0340", "\u03ce\u03d8\u03d0\u03cd\u0389\u0385\u0387\u0391\u03f3\u0390\u03ef", "\u065f\u0649\u0641\u065c\u0614\u0616\u0600\u0662\u0661\u0601\u067e", "\u03b7\u03b8\u03bf\u03b0\u03bd\u03b8\u03ab\u03b4\u03ed\u03ef\u03f9\u03f8\u0387"})
public final class Class4116 {
    public static double field9544;
    public static float field9545 = 0.9503217f;
    public static float field9546;
    public static float field9547;

    static {
        c\u200e = "Mining in some case";
        field9546 = Float.intBitsToFloat(1054648144);
        field9544 = Double.longBitsToDouble(4601563559814850792L);
        by\u200e = "Items";
        bA\u200e = "The render color for players";
        field9547 = Float.intBitsToFloat(1052624384);
    }

    private static String tBBOxrviqGFRmPYa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite BPNAUNBRjrl3wo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4116.tBBOxrviqGFRmPYa(k2, 1079797936));
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
                int a2 = Integer.parseInt(Class4116.tBBOxrviqGFRmPYa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4116.tBBOxrviqGFRmPYa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4116.tBBOxrviqGFRmPYa(k2, 1079797936) + " " + l2 + " " + m2);
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

