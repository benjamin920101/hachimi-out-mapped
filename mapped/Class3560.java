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
@HACHIMI_CLIENT(mv=100, d1={"\u3400\u3401\u3407\u3402\u3401\u3400\u3404\u3402", "\ubd6e\ubd6a\ubd63\ubd6b\ubd68\ubd6e\ubd6b\ubd63", "\uacbd\uacba\uacb4\uacb5\uacb4\uacb4\uacbc\uacbf", "\u3eab\u3eaf\u3ea8\u3eae\u3ea8\u3eac\u3eaf\u3ea0", "\u18ef\u18e9\u18ed\u18ef\u18e2\u18ea\u18ec\u18ee", "\ub80c\ub809\ub80c\ub80f\ub80e\ub80a\ub809\ub802", "\u289e\u2896\u2896\u289f\u289d\u289b\u289a\u289c", "\u283f\u283e\u283a\u283d\u283c\u2839\u283c\u2837", "\uc666\uc662\uc663\uc665\uc666\uc66c\uc664", "\ua756\ua752\ua753\ua759\ua759\ua750\ua752\ua757", "\u55d2\u55d6\u55d6\u55df\u55d6\u55d3\u55d2\u55d3", "\ue858\ue85e\ue85f\ue85b\ue85c\ue85e\ue85c", "\uccf6\uccf5\uccf3\uccf8\uccf6\uccf4\uccf4\uccf5", "\u12a3\u12ae\u12a2\u12a5\u12a6\u12a7\u12a1\u12a3", "\uce05\uce08\uce07\uce01\uce05\uce03\uce01\uce08", "\ud5dd\ud5de\ud5d5\ud5dd\ud5d5\ud5dc\ud5db\ud5da", "\u79e2\u79e3\u79ee\u79e3\u79e5\u79e0\u79e3\u79e2"}, d2={"\u012c\u0106\u012b\u2146\u0174\u0176\u0160\u0104\u0122\u0129\u013e\u0129\u0167\u0124\u0129\u0126\u012f\u0167\u011b\u013c\u013a\u0121\u0126\u012f\u0173\u0161\u0104\u0122\u0129\u013e\u0129\u0167\u0124\u0129\u0126\u012f\u0167\u011b\u013c\u013a\u0121\u0126\u012f\u0173", "\u047b\u0451\u047b\u2411\u0423\u0421\u0437\u0453\u0475\u047e\u0469\u047e\u0430\u0473\u047e\u0471\u0478\u0430\u044c\u046b\u046d\u0476\u0471\u0478\u0424\u0436\u0453\u0475\u047e\u0469\u047e\u0430\u0473\u047e\u0471\u0478\u0430\u044c\u046b\u046d\u0476\u0471\u0478\u0424", "\u02d2\u02f8\u02d3\u22b8\u028a\u0288\u029e\u02fa\u02dc\u02d7\u02c0\u02d7\u0299\u02da\u02d7\u02d8\u02d1\u0299\u02e5\u02c2\u02c4\u02df\u02d8\u02d1\u028d\u029f\u02fa\u02dc\u02d7\u02c0\u02d7\u0299\u02da\u02d7\u02d8\u02d1\u0299\u02e5\u02c2\u02c4\u02df\u02d8\u02d1\u028d", "\u016b\u0134\u013b\u013e\u0139\u013e\u0123\u0169\u016b\u0169\u017f\u017e\u0101", "\u066f\u063a\u063d\u063a\u0627\u066d\u066f\u066d\u067b\u067a\u0605", "\u0147\u0145\u0154\u0163\u014c\u0141\u0153\u0153\u011c\u011e\u0108\u0109\u016c\u014a\u0141\u0156\u0141\u010f\u014c\u0141\u014e\u0147\u010f\u0163\u014c\u0141\u0153\u0153\u011b", "\u0713\u071a\u0708\u0713\u0738\u0714\u071f\u071e\u0747\u0745\u0753\u0752\u0732", "\u0729\u073d\u0739\u072d\u0720\u073f\u0770\u0772\u0764\u0700\u0726\u072d\u073a\u072d\u0763\u0720\u072d\u0722\u072b\u0763\u0703\u072e\u0726\u0729\u072f\u0738\u0777\u0765\u0716", "\u0195\u019a\u0199\u0198\u0193\u01ca\u01c8\u01de\u01df\u01ba\u019c\u0197\u0180\u0197\u01d9\u019a\u0197\u0198\u0191\u01d9\u01b9\u0194\u019c\u0193\u0195\u0182\u01cd", "\u01ee\u01f5\u01c9\u01ee\u01e8\u01f3\u01f4\u01fd\u01a6\u01a4\u01b2\u01b3\u01d6\u01f0\u01fb\u01ec\u01fb\u01b5\u01f6\u01fb\u01f4\u01fd\u01b5\u01c9\u01ee\u01e8\u01f3\u01f4\u01fd\u01a1", "\u0319\u0318\u0303\u031e\u0311\u030e\u034b\u0349\u035f\u035e\u0321", "\u013c\u013d\u0126\u013b\u0134\u012b\u0113\u013e\u013e\u016e\u016c\u017a\u017b\u0104", "\u0232\u0224\u022c\u0231\u0279\u027b\u026d\u026c\u0213", "\u0685\u0693\u069b\u0686\u06ce\u06cc\u06da\u06b8\u06db\u06a4", "\u019c\u018a\u0182\u019f\u01db\u01d7\u01d5\u01c3\u01a1\u01c2\u01bd", "\u0439\u042f\u0427\u043a\u0472\u0470\u0466\u0404\u0407\u0467\u0418", "\u00c3\u00cc\u00cb\u00c4\u00c9\u00cc\u00df\u00c0\u0099\u009b\u008d\u008c\u00f3"})
public final class Class3560 {
    public static float field7901 = Float.intBitsToFloat(1049937372);
    public static double field7902;
    public static double field7903;
    public static double field7904;

    static {
        N\u200e = "Charged";
        W\u200e = "0.0";
        field7903 = Double.longBitsToDouble(4596373779694328218L);
        field7904 = Double.longBitsToDouble(4592831538313431152L);
        bR\u200e = "TPSSync";
        field7902 = Double.longBitsToDouble(-4629159984981585428L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite oXgybr0NWalgSd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3560.2BAgOLVfU4nQ3IBh(k2, -42407368));
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
                int a2 = Integer.parseInt(Class3560.2BAgOLVfU4nQ3IBh(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3560.2BAgOLVfU4nQ3IBh(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3560.2BAgOLVfU4nQ3IBh(k2, -42407368) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 2BAgOLVfU4nQ3IBh(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

