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
@HACHIMI_CLIENT(mv=100, d1={"\u80b0\u80b5\u80b4\u80b1\u80b3\u80b3\u80b2\u80b2", "\u8ed7\u8ed7\u8ed7\u8edc\u8edc\u8ed1\u8ed4\u8ed4", "\u1337\u1339\u1332\u1336\u1337\u1332\u1331\u1330", "\u05ee\u05e3\u05ec\u05ed\u05e8\u05ea\u05e9\u05ec", "\u01c0\u01c5\u01c3\u01c2\u01c1\u01ce\u01c4\u01c7", "\u643a\u643b\u6437\u6438\u6438\u6439\u643e\u643d", "\ua58c\ua58e\ua58a\ua58d\ua580\ua58e\ua58d\ua58e", "\u00d5\u00d6\u00de\u00d0\u00d1\u00d0\u00d1\u00d3", "\uddcb\uddca\uddc7\uddca\uddc9\uddce\uddc9\uddcb", "\u95aa\u95af\u95a8\u95af\u95af\u95a9\u95af\u95ac", "\u274a\u2743\u2743\u2743\u2742\u274d\u274c\u274d", "\u9369\u9368\u9361\u936b\u936e\u936e\u936d\u9369", "\u8d22\u8d22\u8d20\u8d23\u8d2e\u8d25\u8d27", "\u5344\u5346\u5345\u5345\u534e\u5345\u5344\u5342", "\u8c01\u8c07\u8c0b\u8c02\u8c02\u8c05\u8c03\u8c00"}, d2={"\u01ac\u01ac\u0180\u21c8\u01fa\u01f8\u01ee\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd\u01ef\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd", "\u027b\u0224\u022b\u022e\u0229\u022e\u0233\u0279\u027b\u0279\u026f\u026e\u0211", "\u013b\u016e\u0169\u016e\u0173\u0139\u013b\u0139\u012f\u012e\u0151", "\u0151\u0153\u0142\u0175\u015a\u0157\u0145\u0145\u010a\u0108\u011e\u011f\u017a\u015c\u0157\u0140\u0157\u0119\u015a\u0157\u0158\u0151\u0119\u0175\u015a\u0157\u0145\u0145\u010d", "\u0092\u009b\u0089\u0092\u00b9\u0095\u009e\u009f\u00c6\u00c4\u00d2\u00d3\u00b3", "\u0432\u0426\u0422\u0436\u043b\u0424\u046b\u0469\u047f\u041b\u043d\u0436\u0421\u0436\u0478\u043b\u0436\u0439\u0430\u0478\u0418\u0435\u043d\u0432\u0434\u0423\u046c\u047e\u040d", "\u04f8\u04f7\u04f4\u04f5\u04fe\u04a7\u04a5\u04b3\u04b2\u04d7\u04f1\u04fa\u04ed\u04fa\u04b4\u04f7\u04fa\u04f5\u04fc\u04b4\u04d4\u04f9\u04f1\u04fe\u04f8\u04ef\u04a0", "\u0550\u054b\u0577\u0550\u0556\u054d\u054a\u0543\u0518\u051a\u050c\u050d\u0568\u054e\u0545\u0552\u0545\u050b\u0548\u0545\u054a\u0543\u050b\u0577\u0550\u0556\u054d\u054a\u0543\u051f", "\u069e\u069f\u0684\u0699\u0696\u0689\u06cc\u06ce\u06d8\u06d9\u06a6", "\u00f8\u00f9\u00e2\u00ff\u00f0\u00ef\u00d7\u00fa\u00fa\u00aa\u00a8\u00be\u00bf\u00c0", "\u0723\u0735\u073d\u0720\u0768\u076a\u077c\u077d\u0702", "\u0689\u069f\u0697\u068a\u06c2\u06c0\u06d6\u06b4\u06d7\u06a8", "\u05ac\u05ba\u05b2\u05af\u05eb\u05e7\u05e5\u05f3\u0591\u05f2\u058d", "\u02a6\u02b0\u02b8\u02a5\u02ed\u02ef\u02f9\u029b\u0298\u02f8\u0287", "\u01d3\u01dc\u01db\u01d4\u01d9\u01dc\u01cf\u01d0\u0189\u018b\u019d\u019c\u01e3"})
public final class Class1647 {
    public static double field6123 = 0.01600182725388155;
    public static float field6124;
    public static double field6125;
    public static int field6126 = -1247155179;

    static {
        t\u200e = "Cannot set event canceled";
        field6124 = Float.intBitsToFloat(1064668198);
        field6125 = Double.longBitsToDouble(4581011356036790624L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 5VLRT7i2rcW6ZT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1647.OWaDNWevSGJS47Gq(k2, 1687991280));
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
                int a2 = Integer.parseInt(Class1647.OWaDNWevSGJS47Gq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1647.OWaDNWevSGJS47Gq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1647.OWaDNWevSGJS47Gq(k2, 1687991280) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String OWaDNWevSGJS47Gq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

