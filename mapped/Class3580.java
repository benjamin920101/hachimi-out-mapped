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
@HACHIMI_CLIENT(mv=100, d1={"\u7af1\u7af5\u7af0\u7af6\u7af5\u7af4\u7afd\u7afc", "\u456b\u456d\u4569\u4569\u456f\u456a\u4568\u456e", "\uc0d6\uc0d1\uc0d5\uc0d5\uc0d4\uc0d6\uc0d4\uc0d0", "\u365a\u365e\u365a\u365c\u3654\u365f\u365f\u3655", "\u9b5a\u9b58\u9b5d\u9b5a\u9b5f\u9b5b\u9b51\u9b5a", "\ude73\ude71\ude75\ude70\ude72\ude79\ude79\ude72", "\u9459\u945f\u9457\u945b\u945a\u9459\u9456\u9459", "\ub118\ub11a\ub119\ub119\ub115\ub11f\ub11b\ub11f", "\uc00f\uc001\uc00f\uc003\uc00e\uc000\uc005", "\ucc99\ucc9d\ucc9f\ucc95\ucc9c\ucc99\ucc9f\ucc9c", "\u3a7f\u3a7b\u3a7d\u3a7c\u3a73\u3a73\u3a7f\u3a7f", "\ub6c1\ub6c7\ub6c0\ub6c2\ub6c0\ub6c5\ub6c7\ub6c7", "\u1c35\u1c36\u1c37\u1c3d\u1c31\u1c34\u1c36\u1c3c", "\u9ec4\u9ec7\u9ec3\u9ec2\u9ec6\u9ec1\u9ec1\u9ec7", "\ud004\ud006\ud004\ud004\ud008\ud001\ud009\ud009"}, d2={"\u03c2\u03d4\u03d0\u23a8\u039a\u0398\u038e\u03ea\u03cc\u03c7\u03d0\u03c7\u0389\u03ca\u03c7\u03c8\u03c1\u0389\u03f5\u03d2\u03d4\u03cf\u03c8\u03c1\u039d\u038f\u03ea\u03cc\u03c7\u03d0\u03c7\u0389\u03ca\u03c7\u03c8\u03c1\u0389\u03f5\u03d2\u03d4\u03cf\u03c8\u03c1\u039d", "\u07ff\u07a0\u07af\u07aa\u07ad\u07aa\u07b7\u07fd\u07ff\u07fd\u07eb\u07ea\u0795", "\u018a\u01df\u01d8\u01df\u01c2\u0188\u018a\u0188\u019e\u019f\u01e0", "\u0644\u0646\u0657\u0660\u064f\u0642\u0650\u0650\u061f\u061d\u060b\u060a\u066f\u0649\u0642\u0655\u0642\u060c\u064f\u0642\u064d\u0644\u060c\u0660\u064f\u0642\u0650\u0650\u0618", "\u029c\u0295\u0287\u029c\u02b7\u029b\u0290\u0291\u02c8\u02ca\u02dc\u02dd\u02bd", "\u01af\u01bb\u01bf\u01ab\u01a6\u01b9\u01f6\u01f4\u01e2\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0185\u01a8\u01a0\u01af\u01a9\u01be\u01f1\u01e3\u0190", "\u02a3\u02ac\u02af\u02ae\u02a5\u02fc\u02fe\u02e8\u02e9\u028c\u02aa\u02a1\u02b6\u02a1\u02ef\u02ac\u02a1\u02ae\u02a7\u02ef\u028f\u02a2\u02aa\u02a5\u02a3\u02b4\u02fb", "\u02eb\u02f0\u02cc\u02eb\u02ed\u02f6\u02f1\u02f8\u02a3\u02a1\u02b7\u02b6\u02d3\u02f5\u02fe\u02e9\u02fe\u02b0\u02f3\u02fe\u02f1\u02f8\u02b0\u02cc\u02eb\u02ed\u02f6\u02f1\u02f8\u02a4", "\u0656\u0657\u064c\u0651\u065e\u0641\u0604\u0606\u0610\u0611\u066e", "\u02ab\u02aa\u02b1\u02ac\u02a3\u02bc\u0284\u02a9\u02a9\u02f9\u02fb\u02ed\u02ec\u0293", "\u070e\u0718\u0710\u070d\u0745\u0747\u0751\u0750\u072f", "\u0182\u0194\u019c\u0181\u01c9\u01cb\u01dd\u01bf\u01dc\u01a3", "\u01ef\u01f9\u01f1\u01ec\u01a8\u01a4\u01a6\u01b0\u01d2\u01b1\u01ce", "\u04d0\u04c6\u04ce\u04d3\u049b\u0499\u048f\u04ed\u04ee\u048e\u04f1", "\u00db\u00d4\u00d3\u00dc\u00d1\u00d4\u00c7\u00d8\u0081\u0083\u0095\u0094\u00eb"})
public final class Class3580 {
    public static double field7965;
    public static float field7966;
    public static float field7967;
    public static double field7968;

    private static String 9eSgjD85c4OglkvH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7966 = Float.intBitsToFloat(0x41400000);
        field7965 = Double.longBitsToDouble(4636033603912859648L);
        field7967 = Float.intBitsToFloat(1063812542);
        field7968 = Double.longBitsToDouble(4599135080543878560L);
        bp\u200e = "Automatically faces towards the target";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite orCial5y1wP7Wa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3580.9eSgjD85c4OglkvH(k2, -1470502203));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3580.9eSgjD85c4OglkvH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3580.9eSgjD85c4OglkvH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3580.9eSgjD85c4OglkvH(k2, -1470502203) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 24754 : 24755;
        block7: while (true) {
            switch (n3) {
                case 24755: {
                    n3 = 24753;
                    continue block7;
                }
                case 24754: {
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

