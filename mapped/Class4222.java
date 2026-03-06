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

@HACHIMI_CLIENT(mv=100, d1={"\udb08\udb0e\udb08\udb0c\udb08\udb0f\udb09\udb0f", "\u5d1a\u5d1a\u5d18\u5d10\u5d1e\u5d19\u5d10\u5d11", "\u8ca5\u8ca8\u8ca3\u8ca4\u8ca2\u8ca2\u8ca8\u8ca7", "\u0cef\u0ce1\u0cec\u0ceb\u0cea\u0ced\u0ced", "\u4488\u4481\u448f\u448a\u4481\u448f\u4489", "\u0569\u0569\u0564\u056a\u0569\u0564\u056f\u0564", "\u7419\u741c\u741e\u741f\u741a\u741e\u7415\u741d", "\ubd8e\ubd89\ubd89\ubd8e\ubd8e\ubd8f\ubd8f", "\u3fd8\u3fdb\u3fd6\u3fd6\u3fd8\u3fda\u3fde\u3fd6", "\u1873\u1873\u1877\u1872\u1876\u1879\u1877\u1878", "\u8274\u8270\u8277\u8274\u827a\u8273\u827b\u8274", "\ud58b\ud588\ud58d\ud58e\ud58a\ud589\ud58f\ud58f", "\ub178\ub178\ub17c\ub17f\ub17d\ub17c\ub17f\ub179", "\ubdbf\ubdbe\ubdb5\ubdb4\ubdbf\ubdb9\ubdb8\ubdb9", "\u15ae\u15a8\u15ae\u15a1\u15ac\u15a9\u15a9\u15a9"}, d2={"\u053a\u050f\u0500\u2545\u0577\u0575\u0563\u0507\u0521\u052a\u053d\u052a\u0564\u0527\u052a\u0525\u052c\u0564\u0518\u053f\u0539\u0522\u0525\u052c\u0570\u0562\u0507\u0521\u052a\u053d\u052a\u0564\u0527\u052a\u0525\u052c\u0564\u0518\u053f\u0539\u0522\u0525\u052c\u0570", "\u02c3\u029c\u0293\u0296\u0291\u0296\u028b\u02c1\u02c3\u02c1\u02d7\u02d6\u02a9", "\u0236\u0263\u0264\u0263\u027e\u0234\u0236\u0234\u0222\u0223\u025c", "\u00b3\u00b1\u00a0\u0097\u00b8\u00b5\u00a7\u00a7\u00e8\u00ea\u00fc\u00fd\u0098\u00be\u00b5\u00a2\u00b5\u00fb\u00b8\u00b5\u00ba\u00b3\u00fb\u0097\u00b8\u00b5\u00a7\u00a7\u00ef", "\u06a1\u06a8\u06ba\u06a1\u068a\u06a6\u06ad\u06ac\u06f5\u06f7\u06e1\u06e0\u0680", "\u0162\u0176\u0172\u0166\u016b\u0174\u013b\u0139\u012f\u014b\u016d\u0166\u0171\u0166\u0128\u016b\u0166\u0169\u0160\u0128\u0148\u0165\u016d\u0162\u0164\u0173\u013c\u012e\u015d", "\u0395\u039a\u0399\u0398\u0393\u03ca\u03c8\u03de\u03df\u03ba\u039c\u0397\u0380\u0397\u03d9\u039a\u0397\u0398\u0391\u03d9\u03b9\u0394\u039c\u0393\u0395\u0382\u03cd", "\u00c6\u00dd\u00e1\u00c6\u00c0\u00db\u00dc\u00d5\u008e\u008c\u009a\u009b\u00fe\u00d8\u00d3\u00c4\u00d3\u009d\u00de\u00d3\u00dc\u00d5\u009d\u00e1\u00c6\u00c0\u00db\u00dc\u00d5\u0089", "\u0513\u0512\u0509\u0514\u051b\u0504\u0541\u0543\u0555\u0554\u052b", "\u02b3\u02b2\u02a9\u02b4\u02bb\u02a4\u029c\u02b1\u02b1\u02e1\u02e3\u02f5\u02f4\u028b", "1'/2zxno\u0010", "\u0430\u0426\u042e\u0433\u047b\u0479\u046f\u040d\u046e\u0411", "\u05e6\u05f0\u05f8\u05e5\u05a1\u05ad\u05af\u05b9\u05db\u05b8\u05c7", "\u0090\u0086\u008e\u0093\u00db\u00d9\u00cf\u00ad\u00ae\u00ce\u00b1", "\u0177\u0178\u017f\u0170\u017d\u0178\u016b\u0174\u012d\u012f\u0139\u0138\u0147"})
public final class Class4222 {
    public static float field9892 = 0.53658f;
    public static double field9893 = 0.30914213610303953;
    public static float field9894;
    public static float field9895;

    private static String ktFRot9AIDuRQLah(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jFO4lSFlq9LeHw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4222.ktFRot9AIDuRQLah(k2, 1548930076));
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
                int a2 = Integer.parseInt(Class4222.ktFRot9AIDuRQLah(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4222.ktFRot9AIDuRQLah(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4222.ktFRot9AIDuRQLah(k2, 1548930076) + " " + l2 + " " + m2);
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
        field9895 = Float.intBitsToFloat(1060203418);
        field9894 = Float.intBitsToFloat(1053261866);
        at\u200e = "Passes obstacles and resets fly using Baritone";
    }
}

