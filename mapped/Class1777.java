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

@HACHIMI_CLIENT(mv=100, d1={"\u527e\u5275\u5273\u527f\u5276\u5272\u5274", "\u59cb\u59c5\u59c5\u59ca\u59cd\u59c4\u59cf\u59c4", "\u4356\u4350\u4358\u4352\u4354\u4359\u4354\u4355", "\uac53\uac52\uac58\uac53\uac57\uac55\uac59\uac57", "\u04f2\u04f3\u04f0\u04f7\u04f0\u04f8\u04f8\u04f6", "\uaa89\uaa82\uaa83\uaa83\uaa80\uaa83\uaa81", "\u08d8\u08db\u08dd\u08dd\u08dd\u08d4\u08db\u08dd", "\ue2b2\ue2b5\ue2b0\ue2b3\ue2b5\ue2b1\ue2b7\ue2b2", "\u35dc\u35dc\u35d9\u35dd\u35dd\u35dd\u35df\u35d0", "\u0360\u0365\u0361\u0365\u0362\u0363\u0365", "\u4e75\u4e72\u4e73\u4e75\u4e76\u4e7a\u4e75\u4e73", "\u5900\u590d\u590e\u590e\u590b\u5900", "\u6978\u6974\u6979\u697c\u697a\u697f\u6979\u6978", "\ue46d\ue46a\ue46d\ue46f\ue46c\ue46f\ue468", "\ud9fd\ud9f9\ud9f8\ud9f4\ud9fd\ud9fc\ud9fd\ud9f5"}, d2={"\u02d9\u02e2\u02d0\u22bb\u0289\u028b\u029d\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02e6\u02c1\u02c7\u02dc\u02db\u02d2\u028e\u029c\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02e6\u02c1\u02c7\u02dc\u02db\u02d2\u028e", "\u0317\u0348\u0347\u0342\u0345\u0342\u035f\u0315\u0317\u0315\u0303\u0302\u037d", "\u009b\u00ce\u00c9\u00ce\u00d3\u0099\u009b\u0099\u008f\u008e\u00f1", "\u06cc\u06ce\u06df\u06e8\u06c7\u06ca\u06d8\u06d8\u0697\u0695\u0683\u0682\u06e7\u06c1\u06ca\u06dd\u06ca\u0684\u06c7\u06ca\u06c5\u06cc\u0684\u06e8\u06c7\u06ca\u06d8\u06d8\u0690", "\u031a\u0313\u0301\u031a\u0331\u031d\u0316\u0317\u034e\u034c\u035a\u035b\u033b", "\u02f4\u02e0\u02e4\u02f0\u02fd\u02e2\u02ad\u02af\u02b9\u02dd\u02fb\u02f0\u02e7\u02f0\u02be\u02fd\u02f0\u02ff\u02f6\u02be\u02de\u02f3\u02fb\u02f4\u02f2\u02e5\u02aa\u02b8\u02cb", "\u0130\u013f\u013c\u013d\u0136\u016f\u016d\u017b\u017a\u011f\u0139\u0132\u0125\u0132\u017c\u013f\u0132\u013d\u0134\u017c\u011c\u0131\u0139\u0136\u0130\u0127\u0168", "\u00f0\u00eb\u00d7\u00f0\u00f6\u00ed\u00ea\u00e3\u00b8\u00ba\u00ac\u00ad\u00c8\u00ee\u00e5\u00f2\u00e5\u00ab\u00e8\u00e5\u00ea\u00e3\u00ab\u00d7\u00f0\u00f6\u00ed\u00ea\u00e3\u00bf", "\u0171\u0170\u016b\u0176\u0179\u0166\u0123\u0121\u0137\u0136\u0149", "\u0208\u0209\u0212\u020f\u0200\u021f\u0227\u020a\u020a\u025a\u0258\u024e\u024f\u0230", "\u02fb\u02ed\u02e5\u02f8\u02b0\u02b2\u02a4\u02a5\u02da", "\u04f6\u04e0\u04e8\u04f5\u04bd\u04bf\u04a9\u04cb\u04a8\u04d7", "\u04a4\u04b2\u04ba\u04a7\u04e3\u04ef\u04ed\u04fb\u0499\u04fa\u0485", "\u0443\u0455\u045d\u0440\u0408\u040a\u041c\u047e\u047d\u041d\u0462", "\u042e\u0421\u0426\u0429\u0424\u0421\u0432\u042d\u0474\u0476\u0460\u0461\u041e"})
public final class Class1777 {
    public static double field6656;
    public static float field6657;

    static {
        M\u200e = "value";
        field6657 = Float.intBitsToFloat(1092616192);
        field6656 = Double.longBitsToDouble(4681608360884174848L);
    }

    private static String seqWdMSYFir6lJyb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Wati4luSqqe5BE(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1777.seqWdMSYFir6lJyb(k2, -60454265));
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
                int a2 = Integer.parseInt(Class1777.seqWdMSYFir6lJyb(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1777.seqWdMSYFir6lJyb(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1777.seqWdMSYFir6lJyb(k2, -60454265) + " " + l2 + " " + m2);
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

