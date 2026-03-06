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
@HACHIMI_CLIENT(mv=100, d1={"\ub2ec\ub2e3\ub2ea\ub2eb\ub2e8\ub2ed\ub2e3\ub2e8", "\u6858\u6853\u6859\u685b\u6859\u685c\u685d\u6853", "\ub09e\ub099\ub09e\ub097\ub09a\ub09e\ub098\ub097", "\u27fe\u27fe\u27fb\u27ff\u27fb\u27f3\u27fe\u27fe", "\u6bb8\u6bbf\u6bbf\u6bbe\u6bba\u6bbf\u6bbc\u6bbc", "\uae48\uae45\uae44\uae45\uae47\uae47\uae42", "\u4a6a\u4a64\u4a6e\u4a6f\u4a6a\u4a65", "\ucb6c\ucb64\ucb68\ucb65\ucb6b\ucb6a\ucb68\ucb6a", "\ua5fd\ua5fa\ua5fc\ua5fe\ua5f1\ua5ff\ua5f9\ua5f1", "\ud3ef\ud3e5\ud3e0\ud3e4\ud3e7\ud3ee\ud3e0", "\u4d20\u4d26\u4d22\u4d21\u4d25\u4d24\u4d21\u4d22", "\u1890\u1890\u1890\u1898\u189b\u1898\u189d", "\u5c5d\u5c58\u5c5d\u5c5e\u5c5c\u5c5a\u5c5b\u5c50", "\u1185\u1184\u118a\u1187\u1183\u1181\u118a", "\ua7d1\ua7d6\ua7d2\ua7d2\ua7d5\ua7d7\ua7d4\ua7d5", "\u6908\u6907\u6900\u6904\u6907\u6901\u6907"}, d2={"\u041e\u0438\u040c\u2473\u0441\u0443\u0455\u0431\u0417\u041c\u040b\u041c\u0452\u0411\u041c\u0413\u041a\u0452\u042e\u0409\u040f\u0414\u0413\u041a\u0446\u0454\u0431\u0417\u041c\u040b\u041c\u0452\u0411\u041c\u0413\u041a\u0452\u042e\u0409\u040f\u0414\u0413\u041a\u0446", "\u0395\u03b3\u0384\u23f8\u03ca\u03c8\u03de\u03ba\u039c\u0397\u0380\u0397\u03d9\u039a\u0397\u0398\u0391\u03d9\u03a5\u0382\u0384\u039f\u0398\u0391\u03cd\u03df\u03ba\u039c\u0397\u0380\u0397\u03d9\u039a\u0397\u0398\u0391\u03d9\u03a5\u0382\u0384\u039f\u0398\u0391\u03cd", "\u07af\u07f0\u07ff\u07fa\u07fd\u07fa\u07e7\u07ad\u07af\u07ad\u07bb\u07ba\u07c5", "j?8?\"hjh~\u007f\u0000", "\u012a\u0128\u0139\u010e\u0121\u012c\u013e\u013e\u0171\u0173\u0165\u0164\u0101\u0127\u012c\u013b\u012c\u0162\u0121\u012c\u0123\u012a\u0162\u010e\u0121\u012c\u013e\u013e\u0176", "\u0500\u0509\u051b\u0500\u052b\u0507\u050c\u050d\u0554\u0556\u0540\u0541\u0521", "\u0328\u033c\u0338\u032c\u0321\u033e\u0371\u0373\u0365\u0301\u0327\u032c\u033b\u032c\u0362\u0321\u032c\u0323\u032a\u0362\u0302\u032f\u0327\u0328\u032e\u0339\u0376\u0364\u0317", "\u0760\u076f\u076c\u076d\u0766\u073f\u073d\u072b\u072a\u074f\u0769\u0762\u0775\u0762\u072c\u076f\u0762\u076d\u0764\u072c\u074c\u0761\u0769\u0766\u0760\u0777\u0738", "\u04ce\u04d5\u04e9\u04ce\u04c8\u04d3\u04d4\u04dd\u0486\u0484\u0492\u0493\u04f6\u04d0\u04db\u04cc\u04db\u0495\u04d6\u04db\u04d4\u04dd\u0495\u04e9\u04ce\u04c8\u04d3\u04d4\u04dd\u0481", "#\"9$+4qsed\u001b", "\u03c2\u03c3\u03d8\u03c5\u03ca\u03d5\u03ed\u03c0\u03c0\u0390\u0392\u0384\u0385\u03fa", "\u03c0\u03d6\u03de\u03c3\u038b\u0389\u039f\u039e\u03e1", "\u0386\u0390\u0398\u0385\u03cd\u03cf\u03d9\u03bb\u03d8\u03a7", "\u06cf\u06d9\u06d1\u06cc\u0688\u0684\u0686\u0690\u06f2\u0691\u06ee", "\u0793\u0785\u078d\u0790\u07d8\u07da\u07cc\u07ae\u07ad\u07cd\u07b2", "\u05fb\u05f4\u05f3\u05fc\u05f1\u05f4\u05e7\u05f8\u05a1\u05a3\u05b5\u05b4\u05cb"})
public final class Class3418 {
    public static float field7444;
    public static float field7445;
    public static double field7446 = 0.7288694863187105;

    static {
        field7445 = Float.intBitsToFloat(1042955168);
        field7444 = Float.intBitsToFloat(1062763686);
        az\u200e = "accept";
        aB\u200e = "Overlay-Spyglass";
    }

    private static String 4kxaIIQhOZGiYQrL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite rYBqaMmolVbn8L(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3418.4kxaIIQhOZGiYQrL(k2, -1642810252));
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
                int a2 = Integer.parseInt(Class3418.4kxaIIQhOZGiYQrL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3418.4kxaIIQhOZGiYQrL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3418.4kxaIIQhOZGiYQrL(k2, -1642810252) + " " + l2 + " " + m2);
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

