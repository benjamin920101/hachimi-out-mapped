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
@HACHIMI_CLIENT(mv=100, d1={"\ud380\ud387\ud380\ud38d\ud386\ud381\ud382\ud384", "\u80aa\u80aa\u80a8\u80a5\u80a4\u80a9\u80af\u80aa", "\ue4c6\ue4cc\ue4c6\ue4c3\ue4c3\ue4c7\ue4c6\ue4c6", "\u9cb6\u9cb2\u9cb5\u9cb1\u9cb5\u9cb3\u9cb5\u9cb7", "\u3ade\u3ad8\u3ad8\u3ad5\u3adf\u3adc\u3add\u3add", "\u2cab\u2ca9\u2ca8\u2ca8\u2cac\u2cab\u2ca7\u2ca6", "\u99b9\u99be\u99b3\u99b3\u99b3\u99b8\u99bc\u99bf", "\u773b\u7733\u773f\u773a\u773f\u773c\u773b\u7739", "\ud7c3\ud7cb\ud7c8\ud7ce\ud7c2\ud7c9\ud7c2", "\u23d8\u23db\u23da\u23df\u23de\u23db\u23d8\u23dc", "\ue61c\ue617\ue61e\ue61e\ue61a\ue617\ue61a\ue61f", "\u1b9d\u1b98\u1b9b\u1b9a\u1b93\u1b98\u1b93\u1b92", "\u0cf9\u0cfc\u0cff\u0cfe\u0cfb\u0cfa\u0cf7\u0cfa", "\u852f\u8529\u8524\u852f\u8525\u8524\u852d\u852e", "\u51b2\u51b5\u51bb\u51bb\u51b7\u51b5\u51b0", "\u1f8d\u1f8b\u1f8c\u1f8f\u1f88\u1f8c\u1f87\u1f8c"}, d2={"\u0202\u0223\u0225\u2266\u0254\u0256\u0240\u0224\u0202\u0209\u021e\u0209\u0247\u0204\u0209\u0206\u020f\u0247\u023b\u021c\u021a\u0201\u0206\u020f\u0253\u0241\u0224\u0202\u0209\u021e\u0209\u0247\u0204\u0209\u0206\u020f\u0247\u023b\u021c\u021a\u0201\u0206\u020f\u0253", "\u021c\u023d\u0238\u2278\u024a\u0248\u025e\u023a\u021c\u0217\u0200\u0217\u0259\u021a\u0217\u0218\u0211\u0259\u0225\u0202\u0204\u021f\u0218\u0211\u024d\u025f\u023a\u021c\u0217\u0200\u0217\u0259\u021a\u0217\u0218\u0211\u0259\u0225\u0202\u0204\u021f\u0218\u0211\u024d", "\u02ee\u02b1\u02be\u02bb\u02bc\u02bb\u02a6\u02ec\u02ee\u02ec\u02fa\u02fb\u0284", "\u01a8\u01fd\u01fa\u01fd\u01e0\u01aa\u01a8\u01aa\u01bc\u01bd\u01c2", "\u03eb\u03e9\u03f8\u03cf\u03e0\u03ed\u03ff\u03ff\u03b0\u03b2\u03a4\u03a5\u03c0\u03e6\u03ed\u03fa\u03ed\u03a3\u03e0\u03ed\u03e2\u03eb\u03a3\u03cf\u03e0\u03ed\u03ff\u03ff\u03b7", "\u04ea\u04e3\u04f1\u04ea\u04c1\u04ed\u04e6\u04e7\u04be\u04bc\u04aa\u04ab\u04cb", "\u0199\u018d\u0189\u019d\u0190\u018f\u01c0\u01c2\u01d4\u01b0\u0196\u019d\u018a\u019d\u01d3\u0190\u019d\u0192\u019b\u01d3\u01b3\u019e\u0196\u0199\u019f\u0188\u01c7\u01d5\u01a6", "\u0362\u036d\u036e\u036f\u0364\u033d\u033f\u0329\u0328\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u034e\u0363\u036b\u0364\u0362\u0375\u033a", "{`\\{}fah31'&Cenyn cnah \\{}fah4", "\u0194\u0195\u018e\u0193\u019c\u0183\u01c6\u01c4\u01d2\u01d3\u01ac", "\u05aa\u05ab\u05b0\u05ad\u05a2\u05bd\u0585\u05a8\u05a8\u05f8\u05fa\u05ec\u05ed\u0592", "\u023c\u022a\u0222\u023f\u0277\u0275\u0263\u0262\u021d", "\u0162\u0174\u017c\u0161\u0129\u012b\u013d\u015f\u013c\u0143", "\u02c5\u02d3\u02db\u02c6\u0282\u028e\u028c\u029a\u02f8\u029b\u02e4", "\u0689\u069f\u0697\u068a\u06c2\u06c0\u06d6\u06b4\u06b7\u06d7\u06a8", "\u030d\u0302\u0305\u030a\u0307\u0302\u0311\u030e\u0357\u0355\u0343\u0342\u033d"})
public final class Class3590 {
    public static int field7996 = 34425705;
    public static double field7997;
    public static float field7998;
    public static float field7999;
    public static double field8000;
    public static double field8001;
    public static double field8002;

    private static String N3P3K9WM2ifeLcSJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        k\u200e = "Display server response time in ms";
        field7998 = Float.intBitsToFloat(1056483306);
        field8000 = Double.longBitsToDouble(4598244797708540276L);
        field8001 = Double.longBitsToDouble(4600481751627282382L);
        field7999 = Float.intBitsToFloat(1035182744);
        field7997 = Double.longBitsToDouble(4592762626874999800L);
        bl\u200e = "Opacity";
        field8002 = Double.longBitsToDouble(4602251050293676440L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 2HlwwGQgiVtii7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3590.N3P3K9WM2ifeLcSJ(k2, -472328234));
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
                int a2 = Integer.parseInt(Class3590.N3P3K9WM2ifeLcSJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3590.N3P3K9WM2ifeLcSJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3590.N3P3K9WM2ifeLcSJ(k2, -472328234) + " " + l2 + " " + m2);
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

