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
@HACHIMI_CLIENT(mv=100, d1={"\u745e\u7453\u745d\u745f\u7453\u7452\u7453\u745d", "\u85d3\u85d2\u85d0\u85d5\u85d3\u85d2\u85d9\u85d8", "\ubef9\ubeff\ubeff\ubefb\ubefc\ubefd\ubefe\ubefd", "\uc0e2\uc0ef\uc0ef\uc0ee\uc0e6\uc0e1\uc0ef\uc0e4", "\udab0\udab2\udab4\udab7\udab7\udabd\udab0\udab0", "\u6bac\u6ba8\u6bab\u6bae\u6baf\u6bae\u6ba3\u6bad", "\u8a3a\u8a3d\u8a3e\u8a39\u8a35\u8a35\u8a3f\u8a3a", "\u7a07\u7a0f\u7a07\u7a02\u7a0f\u7a06\u7a0e\u7a05", "\ub436\ub437\ub43c\ub432\ub43c\ub43c\ub43c\ub430", "\u00a8\u00a5\u00a0\u00a1\u00a0\u00a4\u00a0", "\u73b0\u73b3\u73b2\u73b5\u73b1\u73b2\u73b5\u73b1", "\u48a5\u48ae\u48a3\u48a3\u48a7\u48af\u48a0\u48a7", "\u2c18\u2c1d\u2c1e\u2c16\u2c1c\u2c1f\u2c19\u2c1d", "\u08fb\u08f1\u08f1\u08fe\u08fc\u08f1\u08f1\u08fd", "\ue1cc\ue1cb\ue1ce\ue1cf\ue1cc\ue1cc\ue1cd\ue1c9"}, d2={"\u0607\u063c\u060b\u2663\u0651\u0653\u0645\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u063e\u0619\u061f\u0604\u0603\u060a\u0656\u0644\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u063e\u0619\u061f\u0604\u0603\u060a\u0656", "\u03be\u03e1\u03ee\u03eb\u03ec\u03eb\u03f6\u03bc\u03be\u03bc\u03aa\u03ab\u03d4", "\u0142\u0117\u0110\u0117\u010a\u0140\u0142\u0140\u0156\u0157\u0128", "\u024d\u024f\u025e\u0269\u0246\u024b\u0259\u0259\u0216\u0214\u0202\u0203\u0266\u0240\u024b\u025c\u024b\u0205\u0246\u024b\u0244\u024d\u0205\u0269\u0246\u024b\u0259\u0259\u0211", "\u06ff\u06f6\u06e4\u06ff\u06d4\u06f8\u06f3\u06f2\u06ab\u06a9\u06bf\u06be\u06de", "\u0581\u0595\u0591\u0585\u0588\u0597\u05d8\u05da\u05cc\u05a8\u058e\u0585\u0592\u0585\u05cb\u0588\u0585\u058a\u0583\u05cb\u05ab\u0586\u058e\u0581\u0587\u0590\u05df\u05cd\u05be", "\u0737\u0738\u073b\u073a\u0731\u0768\u076a\u077c\u077d\u0718\u073e\u0735\u0722\u0735\u077b\u0738\u0735\u073a\u0733\u077b\u071b\u0736\u073e\u0731\u0737\u0720\u076f", "\u012d\u0136\u010a\u012d\u012b\u0130\u0137\u013e\u0165\u0167\u0171\u0170\u0115\u0133\u0138\u012f\u0138\u0176\u0135\u0138\u0137\u013e\u0176\u010a\u012d\u012b\u0130\u0137\u013e\u0162", "\u023c\u023d\u0226\u023b\u0234\u022b\u026e\u026c\u027a\u027b\u0204", "\u03a2\u03a3\u03b8\u03a5\u03aa\u03b5\u038d\u03a0\u03a0\u03f0\u03f2\u03e4\u03e5\u039a", "\u069d\u068b\u0683\u069e\u06d6\u06d4\u06c2\u06c3\u06bc", "\u0654\u0642\u064a\u0657\u061f\u061d\u060b\u0669\u060a\u0675", "\u05c7\u05d1\u05d9\u05c4\u0580\u058c\u058e\u0598\u05fa\u0599\u05e6", "\u05ca\u05dc\u05d4\u05c9\u0581\u0583\u0595\u05f7\u05f4\u0594\u05eb", "\u076e\u0761\u0766\u0769\u0764\u0761\u0772\u076d\u0734\u0736\u0720\u0721\u075e"})
public final class Class3230 {
    public static float field6930;
    public static int field6931 = 0;
    public static double field6932;
    public static float field6933;

    /*
     * WARNING - void declaration
     */
    private static CallSite 9ilckwA7zg9rGJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3230.yVX9W51ddRNtn2Ib(k2, 1847190200));
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
                int a2 = Integer.parseInt(Class3230.yVX9W51ddRNtn2Ib(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3230.yVX9W51ddRNtn2Ib(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3230.yVX9W51ddRNtn2Ib(k2, 1847190200) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String yVX9W51ddRNtn2Ib(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6933 = Float.intBitsToFloat(1060333520);
        field6932 = Double.longBitsToDouble(4594596036522228484L);
        bQ\u200e = "FillColor";
        field6930 = Float.intBitsToFloat(1057667850);
    }
}

