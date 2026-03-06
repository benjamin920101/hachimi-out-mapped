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

@HACHIMI_CLIENT(mv=100, d1={"\u05c7\u05c9\u05c4\u05c4\u05c0\u05c7\u05c3\u05c9", "\u4155\u4153\u4154\u4153\u4156\u4150\u4151\u4151", "\u612e\u612d\u612b\u612c\u612f\u612a\u612c\u6124", "\u1ea2\u1ea5\u1ea0\u1ea6\u1ea5\u1ead\u1ead", "\ub773\ub777\ub771\ub776\ub779\ub777\ub775", "\u7f3b\u7f3e\u7f3f\u7f3c\u7f3e\u7f3e\u7f39\u7f3a", "\u46ef\u46ea\u46e4\u46e4\u46ef\u46e5\u46ee\u46ef", "\ud36e\ud368\ud36d\ud36e\ud368\ud36f\ud368", "\u3b90\u3b94\u3b91\u3b99\u3b92\u3b90\u3b99\u3b97", "\u0e89\u0e8c\u0e86\u0e89\u0e88\u0e86\u0e86\u0e8c", "\ud6aa\ud6a0\ud6ad\ud6ac\ud6a9\ud6a9\ud6ad", "\udb49\udb4d\udb48\udb48\udb49\udb44\udb49\udb44", "\ud571\ud577\ud578\ud571\ud577\ud574\ud575", "\u7653\u7657\u7653\u7651\u7652\u7659\u7658\u7656", "\u9f56\u9f56\u9f55\u9f5e\u9f50\u9f57\u9f5f\u9f57", "\u673b\u6738\u673a\u673a\u673a\u673e\u673d\u6734"}, d2={"\u01b0\u01ad\u018f\u21ce\u01fc\u01fe\u01e8\u018c\u01aa\u01a1\u01b6\u01a1\u01ef\u01ac\u01a1\u01ae\u01a7\u01ef\u0193\u01b4\u01b2\u01a9\u01ae\u01a7\u01fb\u01e9\u018c\u01aa\u01a1\u01b6\u01a1\u01ef\u01ac\u01a1\u01ae\u01a7\u01ef\u0193\u01b4\u01b2\u01a9\u01ae\u01a7\u01fb", "\u01e7\u01fa\u01c7\u2199\u01ab\u01a9\u01bf\u01db\u01fd\u01f6\u01e1\u01f6\u01b8\u01fb\u01f6\u01f9\u01f0\u01b8\u01c4\u01e3\u01e5\u01fe\u01f9\u01f0\u01ac\u01be\u01db\u01fd\u01f6\u01e1\u01f6\u01b8\u01fb\u01f6\u01f9\u01f0\u01b8\u01c4\u01e3\u01e5\u01fe\u01f9\u01f0\u01ac", "\u040f\u0450\u045f\u045a\u045d\u045a\u0447\u040d\u040f\u040d\u041b\u041a\u0465", "\u0402\u0457\u0450\u0457\u044a\u0400\u0402\u0400\u0416\u0417\u0468", "\u0456\u0454\u0445\u0472\u045d\u0450\u0442\u0442\u040d\u040f\u0419\u0418\u047d\u045b\u0450\u0447\u0450\u041e\u045d\u0450\u045f\u0456\u041e\u0472\u045d\u0450\u0442\u0442\u040a", "\u018d\u0184\u0196\u018d\u01a6\u018a\u0181\u0180\u01d9\u01db\u01cd\u01cc\u01ac", "\u00bf\u00ab\u00af\u00bb\u00b6\u00a9\u00e6\u00e4\u00f2\u0096\u00b0\u00bb\u00ac\u00bb\u00f5\u00b6\u00bb\u00b4\u00bd\u00f5\u0095\u00b8\u00b0\u00bf\u00b9\u00ae\u00e1\u00f3\u0080", "\u0611\u061e\u061d\u061c\u0617\u064e\u064c\u065a\u065b\u063e\u0618\u0613\u0604\u0613\u065d\u061e\u0613\u061c\u0615\u065d\u063d\u0610\u0618\u0617\u0611\u0606\u0649", "\u0019\u0002>\u0019\u001f\u0004\u0003\nQSED!\u0007\f\u001b\fB\u0001\f\u0003\nB>\u0019\u001f\u0004\u0003\nV", "\u0633\u0632\u0629\u0634\u063b\u0624\u0661\u0663\u0675\u0674\u060b", "\u013e\u013f\u0124\u0139\u0136\u0129\u0111\u013c\u013c\u016c\u016e\u0178\u0179\u0106", "\u03de\u03c8\u03c0\u03dd\u0395\u0397\u0381\u0380\u03ff", "\u0105\u0113\u011b\u0106\u014e\u014c\u015a\u0138\u015b\u0124", "\u0001\u0017\u001f\u0002FJH^<_ ", "\u01f5\u01e3\u01eb\u01f6\u01be\u01bc\u01aa\u01c8\u01cb\u01ab\u01d4", "\u0569\u0566\u0561\u056e\u0563\u0566\u0575\u056a\u0533\u0531\u0527\u0526\u0559"})
public final class Class3747 {
    public static double field8478;
    public static int field8479 = -1166183408;
    public static double field8480;

    static {
        F\u200e = "Module must be a toggleable module!";
        field8478 = Double.longBitsToDouble(4590443620312192144L);
        aU\u200e = "Hands";
        field8480 = Double.longBitsToDouble(4604722565851251397L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite gb6a7Yh4ikdbWw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3747.AIqy914Upzap1MVx(k2, 441816767));
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
                int a2 = Integer.parseInt(Class3747.AIqy914Upzap1MVx(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3747.AIqy914Upzap1MVx(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3747.AIqy914Upzap1MVx(k2, 441816767) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String AIqy914Upzap1MVx(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

