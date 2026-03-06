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

@HACHIMI_CLIENT(mv=100, d1={"\ubb8e\ubb88\ubb8e\ubb8b\ubb88\ubb8e\ubb8b\ubb8f", "\u81a9\u81a6\u81af\u81af\u81af\u81ae\u81a7\u81a6", "\u6e97\u6e97\u6e9b\u6e9d\u6e98\u6e98\u6e9e", "\u8fc5\u8fc6\u8fce\u8fc4\u8fc1\u8fce\u8fc4\u8fc5", "\uc140\uc144\uc145\uc141\uc14a\uc14a\uc14a\uc143", "\ud1ea\ud1ec\ud1e6\ud1ea\ud1ed\ud1e7\ud1ee\ud1ed", "\u36df\u36db\u36d9\u36dc\u36df\u36de\u36d2\u36da", "\u5e0a\u5e0c\u5e09\u5e02\u5e0e\u5e0d\u5e0e\u5e08", "\u6be2\u6be9\u6be3\u6be8\u6be9\u6be2\u6be0\u6be1", "\u1a82\u1a85\u1a80\u1a87\u1a87\u1a86\u1a87\u1a80", "\u15f9\u15f9\u15fb\u15fa\u15f9\u15fc\u15f8\u15fe", "\u12fe\u12fc\u12fe\u12f4\u12fc\u12fe\u12f8\u12ff", "\u2074\u2071\u2075\u2072\u2072\u207f\u2074\u2073", "\ua42f\ua42c\ua428\ua42b\ua429\ua42a\ua42f\ua425", "\u67e5\u67ed\u67ed\u67e5\u67ee\u67ed"}, d2={"\u0119\u0122\u013a\u2179\u014b\u0149\u015f\u013b\u011d\u0116\u0101\u0116\u0158\u011b\u0116\u0119\u0110\u0158\u0124\u0103\u0105\u011e\u0119\u0110\u014c\u015e\u013b\u011d\u0116\u0101\u0116\u0158\u011b\u0116\u0119\u0110\u0158\u0124\u0103\u0105\u011e\u0119\u0110\u014c", "\u03cc\u0393\u039c\u0399\u039e\u0399\u0384\u03ce\u03cc\u03ce\u03d8\u03d9\u03a6", "\u022e\u027b\u027c\u027b\u0266\u022c\u022e\u022c\u023a\u023b\u0244", "\u01b3\u01b1\u01a0\u0197\u01b8\u01b5\u01a7\u01a7\u01e8\u01ea\u01fc\u01fd\u0198\u01be\u01b5\u01a2\u01b5\u01fb\u01b8\u01b5\u01ba\u01b3\u01fb\u0197\u01b8\u01b5\u01a7\u01a7\u01ef", "\u0282\u028b\u0299\u0282\u02a9\u0285\u028e\u028f\u02d6\u02d4\u02c2\u02c3\u02a3", "\u07d0\u07c4\u07c0\u07d4\u07d9\u07c6\u0789\u078b\u079d\u07f9\u07df\u07d4\u07c3\u07d4\u079a\u07d9\u07d4\u07db\u07d2\u079a\u07fa\u07d7\u07df\u07d0\u07d6\u07c1\u078e\u079c\u07ef", "\u07aa\u07a5\u07a6\u07a7\u07ac\u07f5\u07f7\u07e1\u07e0\u0785\u07a3\u07a8\u07bf\u07a8\u07e6\u07a5\u07a8\u07a7\u07ae\u07e6\u0786\u07ab\u07a3\u07ac\u07aa\u07bd\u07f2", "\u0118\u0103\u013f\u0118\u011e\u0105\u0102\u010b\u0150\u0152\u0144\u0145\u0120\u0106\u010d\u011a\u010d\u0143\u0100\u010d\u0102\u010b\u0143\u013f\u0118\u011e\u0105\u0102\u010b\u0157", "\u06c2\u06c3\u06d8\u06c5\u06ca\u06d5\u0690\u0692\u0684\u0685\u06fa", "\u0495\u0494\u048f\u0492\u049d\u0482\u04ba\u0497\u0497\u04c7\u04c5\u04d3\u04d2\u04ad", "\u0082\u0094\u009c\u0081\u00c9\u00cb\u00dd\u00dc\u00a3", "\u0332\u0324\u032c\u0331\u0379\u037b\u036d\u030f\u036c\u0313", "\u0014\u0002\n\u0017S_]K)J5", "\u0771\u0767\u076f\u0772\u073a\u0738\u072e\u074c\u074f\u072f\u0750", "\u0708\u0707\u0700\u070f\u0702\u0707\u0714\u070b\u0752\u0750\u0746\u0747\u0738"})
public final class Class3869 {
    public static float field8792;
    public static float field8793;
    public static double field8794;

    /*
     * WARNING - void declaration
     */
    private static CallSite FEhzIrTGOUdoor(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3869.owBc9KdlMpini1rA(k2, 644983796));
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
                int a2 = Integer.parseInt(Class3869.owBc9KdlMpini1rA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3869.owBc9KdlMpini1rA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3869.owBc9KdlMpini1rA(k2, 644983796) + " " + l2 + " " + m2);
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
        field8794 = Double.longBitsToDouble(4605762908066986695L);
        field8793 = Float.intBitsToFloat(1061965209);
        bq\u200e = "FillColor";
        field8792 = Float.intBitsToFloat(1054828744);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String owBc9KdlMpini1rA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 29845 : 29846;
            block5: while (true) {
                switch (n2) {
                    case 29846: {
                        n2 = 29844;
                        continue block5;
                    }
                    case 29845: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

