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

@HACHIMI_CLIENT(mv=100, d1={"\u1fc0\u1fc0\u1fc3\u1fc5\u1fc5\u1fc5\u1fc3\u1fc7", "\u1696\u169c\u1696\u1693\u1690\u1690\u169c", "\ucc2e\ucc2e\ucc29\ucc2b\ucc29\ucc2b\ucc28\ucc28", "\u0b33\u0b36\u0b37\u0b30\u0b37\u0b36\u0b30\u0b30", "\uc5f0\uc5f6\uc5fa\uc5f3\uc5f0\uc5fa\uc5f7\uc5f2", "\ue0c3\ue0c2\ue0c4\ue0c3\ue0c2\ue0c2\ue0c0\ue0c6", "\u7774\u7771\u7773\u7772\u7773\u7771\u777b\u7771", "\ud6cc\ud6cd\ud6cd\ud6cd\ud6ce\ud6cd\ud6c0\ud6c8", "\u8b07\u8b01\u8b0a\u8b02\u8b05\u8b05\u8b04\u8b06", "\u70e7\u70e3\u70ec\u70e1\u70ed\u70e3\u70e1\u70ec", "\u01c4\u01c0\u01c2\u01c5\u01c2\u01ce\u01c3", "\u5a20\u5a22\u5a20\u5a23\u5a23\u5a21\u5a26\u5a24", "\u7d2d\u7d26\u7d2b\u7d28\u7d2b\u7d2a\u7d2e\u7d27", "\udc4c\udc41\udc49\udc4f\udc4d\udc40\udc4c\udc40", "\ubfca\ubfcb\ubfcc\ubfcf\ubfca\ubfca\ubfc8\ubfc7"}, d2={"\u053c\u052c\u0510\u2553\u0561\u0563\u0575\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u050e\u0529\u052f\u0534\u0533\u053a\u0566\u0574\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u050e\u0529\u052f\u0534\u0533\u053a\u0566", "\u04ae\u04f1\u04fe\u04fb\u04fc\u04fb\u04e6\u04ac\u04ae\u04ac\u04ba\u04bb\u04c4", "\u039a\u03cf\u03c8\u03cf\u03d2\u0398\u039a\u0398\u038e\u038f\u03f0", "\u05f7\u05f5\u05e4\u05d3\u05fc\u05f1\u05e3\u05e3\u05ac\u05ae\u05b8\u05b9\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05d3\u05fc\u05f1\u05e3\u05e3\u05ab", "\u0635\u063c\u062e\u0635\u061e\u0632\u0639\u0638\u0661\u0663\u0675\u0674\u0614", "\u051a\u050e\u050a\u051e\u0513\u050c\u0543\u0541\u0557\u0533\u0515\u051e\u0509\u051e\u0550\u0513\u051e\u0511\u0518\u0550\u0530\u051d\u0515\u051a\u051c\u050b\u0544\u0556\u0525", "\u0626\u0629\u062a\u062b\u0620\u0679\u067b\u066d\u066c\u0609\u062f\u0624\u0633\u0624\u066a\u0629\u0624\u062b\u0622\u066a\u060a\u0627\u062f\u0620\u0626\u0631\u067e", "\u0191\u018a\u01b6\u0191\u0197\u018c\u018b\u0182\u01d9\u01db\u01cd\u01cc\u01a9\u018f\u0184\u0193\u0184\u01ca\u0189\u0184\u018b\u0182\u01ca\u01b6\u0191\u0197\u018c\u018b\u0182\u01de", "xyb\u007fpo*(>?@", "\u06eb\u06ea\u06f1\u06ec\u06e3\u06fc\u06c4\u06e9\u06e9\u06b9\u06bb\u06ad\u06ac\u06d3", "\u0372\u0364\u036c\u0371\u0339\u033b\u032d\u032c\u0353", "\u05f5\u05e3\u05eb\u05f6\u05be\u05bc\u05aa\u05c8\u05ab\u05d4", "\u0336\u0320\u0328\u0335\u0371\u037d\u037f\u0369\u030b\u0368\u0317", "\u01cd\u01db\u01d3\u01ce\u0186\u0184\u0192\u01f0\u01f3\u0193\u01ec", "\u0670\u067f\u0678\u0677\u067a\u067f\u066c\u0673\u062a\u0628\u063e\u063f\u0640"})
public final class Class3415 {
    public static double field7434;
    public static double field7435;
    public static int field7436 = -1040552298;

    /*
     * Enabled aggressive block sorting
     */
    private static String i4we2w43fwNO9qDI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block0: while (true) {
            int n2 = d2 >= a2.length() ? 16503 : 16502;
            while (true) {
                int n3;
                if ((n3 = n2) == 16502) {
                    c2.append((char)(a2.charAt(d2) ^ b2));
                    ++d2;
                    continue block0;
                }
                if (n3 != 16503) {
                    return c2.toString();
                }
                n2 = 16501;
            }
            break;
        }
    }

    static {
        n\u200e = "Factor";
        field7434 = Double.longBitsToDouble(4604730354240000622L);
        field7435 = Double.longBitsToDouble(4588807732320345784L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite lynhrMiip8V0Qy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3415.i4we2w43fwNO9qDI(k2, 652106809));
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
                int a2 = Integer.parseInt(Class3415.i4we2w43fwNO9qDI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3415.i4we2w43fwNO9qDI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3415.i4we2w43fwNO9qDI(k2, 652106809) + " " + l2 + " " + m2);
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

