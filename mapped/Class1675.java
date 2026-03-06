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

@HACHIMI_CLIENT(mv=100, d1={"\ua3ae\ua3ae\ua3ab\ua3ad\ua3ae\ua3aa\ua3ad", "\uabbf\uabb3\uabba\uabbd\uabbe\uabb2\uabbc\uabba", "\ue4e8\ue4e7\ue4ef\ue4ea\ue4ea\ue4e9\ue4ef\ue4ee", "\u18ac\u18a9\u18a5\u18a4\u18a8\u18a8\u18a8\u18ac", "\u2dff\u2dfc\u2dfb\u2dfd\u2dfa\u2dfc\u2dfe\u2df8", "\u8e6e\u8e69\u8e69\u8e63\u8e69\u8e63\u8e69\u8e62", "\u834b\u8349\u834f\u834e\u834e\u8349\u8349\u8348", "\ubc28\ubc2f\ubc2f\ubc2d\ubc28\ubc29\ubc2c\ubc2b", "\u4c55\u4c51\u4c52\u4c56\u4c57\u4c50\u4c5d\u4c54", "\u8a27\u8a23\u8a22\u8a26\u8a27\u8a26\u8a23\u8a20", "\ud28a\ud28f\ud281\ud28a\ud28e\ud28e\ud28a\ud288", "\u2b42\u2b43\u2b49\u2b45\u2b43\u2b40\u2b43\u2b44", "\ub047\ub044\ub046\ub040\ub044\ub041\ub043\ub045", "\u8298\u829a\u829d\u829f\u829c\u8299\u829b\u829c", "\ud378\ud37b\ud37b\ud379\ud37d\ud378\ud37c\ud372", "\u15c3\u15c1\u15ce\u15c5\u15c3\u15c2\u15c0\u15cf", "\ua720\ua72d\ua72d\ua727\ua720\ua720\ua726\ua727", "\u40f7\u40f5\u40f3\u40f0\u40f8\u40f1\u40f3\u40f2"}, d2={"\u0557\u0544\u0560\u2538\u050a\u0508\u051e\u057a\u055c\u0557\u0540\u0557\u0519\u055a\u0557\u0558\u0551\u0519\u0565\u0542\u0544\u055f\u0558\u0551\u050d\u051f\u057a\u055c\u0557\u0540\u0557\u0519\u055a\u0557\u0558\u0551\u0519\u0565\u0542\u0544\u055f\u0558\u0551\u050d", "\u05f3\u05e0\u05c5\u259c\u05ae\u05ac\u05ba\u05de\u05f8\u05f3\u05e4\u05f3\u05bd\u05fe\u05f3\u05fc\u05f5\u05bd\u05c1\u05e6\u05e0\u05fb\u05fc\u05f5\u05a9\u05bb\u05de\u05f8\u05f3\u05e4\u05f3\u05bd\u05fe\u05f3\u05fc\u05f5\u05bd\u05c1\u05e6\u05e0\u05fb\u05fc\u05f5\u05a9", "\u0108\u011b\u0131\u2167\u0155\u0157\u0141\u0125\u0103\u0108\u011f\u0108\u0146\u0105\u0108\u0107\u010e\u0146\u013a\u011d\u011b\u0100\u0107\u010e\u0152\u0140\u0125\u0103\u0108\u011f\u0108\u0146\u0105\u0108\u0107\u010e\u0146\u013a\u011d\u011b\u0100\u0107\u010e\u0152", "\u07d1\u07c2\u07e9\u27be\u078c\u078e\u0798\u07fc\u07da\u07d1\u07c6\u07d1\u079f\u07dc\u07d1\u07de\u07d7\u079f\u07e3\u07c4\u07c2\u07d9\u07de\u07d7\u078b\u0799\u07fc\u07da\u07d1\u07c6\u07d1\u079f\u07dc\u07d1\u07de\u07d7\u079f\u07e3\u07c4\u07c2\u07d9\u07de\u07d7\u078b", "\u0520\u057f\u0570\u0575\u0572\u0575\u0568\u0522\u0520\u0522\u0534\u0535\u054a", "\u0179\u012c\u012b\u012c\u0131\u017b\u0179\u017b\u016d\u016c\u0113", "\u0261\u0263\u0272\u0245\u026a\u0267\u0275\u0275\u023a\u0238\u022e\u022f\u024a\u026c\u0267\u0270\u0267\u0229\u026a\u0267\u0268\u0261\u0229\u0245\u026a\u0267\u0275\u0275\u023d", "\u0209\u0200\u0212\u0209\u0222\u020e\u0205\u0204\u025d\u025f\u0249\u0248\u0228", "\u00dd\u00c9\u00cd\u00d9\u00d4\u00cb\u0084\u0086\u0090\u00f4\u00d2\u00d9\u00ce\u00d9\u0097\u00d4\u00d9\u00d6\u00df\u0097\u00f7\u00da\u00d2\u00dd\u00db\u00cc\u0083\u0091\u00e2", "nabch13%$Agl{l\"alcj\"Boghny6", "\u06c8\u06d3\u06ef\u06c8\u06ce\u06d5\u06d2\u06db\u0680\u0682\u0694\u0695\u06f0\u06d6\u06dd\u06ca\u06dd\u0693\u06d0\u06dd\u06d2\u06db\u0693\u06ef\u06c8\u06ce\u06d5\u06d2\u06db\u0687", "\u077a\u077b\u0760\u077d\u0772\u076d\u0728\u072a\u073c\u073d\u0742", "\u0520\u0521\u053a\u0527\u0528\u0537\u050f\u0522\u0522\u0572\u0570\u0566\u0567\u0518", "\u0716\u0700\u0708\u0715\u075d\u075f\u0749\u0748\u0737", "9/':rpf\u0004g\u0018", "\u010a\u011c\u0114\u0109\u014d\u0141\u0143\u0155\u0137\u0154\u012b", "\u00ac\u00ba\u00b2\u00af\u00e7\u00e5\u00f3\u0091\u0092\u00f2\u008d", "\u033a\u0335\u0332\u033d\u0330\u0335\u0326\u0339\u0360\u0362\u0374\u0375\u030a"})
public final class Class1675 {
    public static double field6210;
    public static float field6211;

    private static String j7DqTnAVb9gBlqHR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        u\u200e = "ClickGui";
        field6211 = Float.intBitsToFloat(1053619084);
        K\u200e = "BOX";
        field6210 = Double.longBitsToDouble(4606345647611531654L);
        aZ\u200e = "ExtrapolationTicks";
        bh\u200e = "The number of blocks to place per tick";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite O5qviylheNQkLT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1675.j7DqTnAVb9gBlqHR(k2, -990886197));
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
                int a2 = Integer.parseInt(Class1675.j7DqTnAVb9gBlqHR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1675.j7DqTnAVb9gBlqHR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1675.j7DqTnAVb9gBlqHR(k2, -990886197) + " " + l2 + " " + m2);
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

