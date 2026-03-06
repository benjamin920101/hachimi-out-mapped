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
@HACHIMI_CLIENT(mv=100, d1={"\u250a\u2504\u250f\u2504\u250c\u2505\u250a\u2504", "\u26ff\u26fa\u26fd\u26f8\u26fd\u26ff\u26f9\u26ff", "\u2cad\u2cae\u2ca8\u2ca9\u2ca4\u2ca4\u2caf\u2caf", "\u820d\u820d\u820b\u820d\u8209\u8208\u8208\u820a", "\u6bd0\u6bda\u6bdb\u6bd2\u6bd2\u6bd5\u6bda\u6bd6", "\u26ca\u26cf\u26c9\u26ce\u26cf\u26c1\u26ce\u26c0", "\u6df5\u6df7\u6df4\u6dff\u6df3\u6df3\u6df4\u6df1", "\ua9a6\ua9a5\ua9a4\ua9a4\ua9a3\ua9a0\ua9a3\ua9a2", "\u345c\u3450\u345c\u345e\u3459\u345d\u3458\u345e", "\u36d5\u36dc\u36d0\u36d5\u36d3\u36d5\u36d2\u36d1", "\u4f1d\u4f1c\u4f1a\u4f19\u4f1f\u4f19\u4f1b\u4f1c", "\u38ea\u38ed\u38ee\u38e5\u38e4\u38eb\u38ec\u38e5", "\u18df\u18d4\u18db\u18db\u18d9\u18d4\u18d9", "\u76de\u76d7\u76d8\u76dc\u76de\u76dc\u76db\u76da", "\u97ef\u97ec\u97e2\u97e9\u97e9\u97ec\u97eb\u97e8", "\u8b50\u8b59\u8b53\u8b57\u8b51\u8b50\u8b53\u8b52"}, d2={"\u0463\u0456\u0466\u241f\u042d\u042f\u0439\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0442\u0465\u0463\u0478\u047f\u0476\u042a\u0438\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0442\u0465\u0463\u0478\u047f\u0476\u042a", "\u03ca\u03ff\u03c0\u23b6\u0384\u0386\u0390\u03f4\u03d2\u03d9\u03ce\u03d9\u0397\u03d4\u03d9\u03d6\u03df\u0397\u03eb\u03cc\u03ca\u03d1\u03d6\u03df\u0383\u0391\u03f4\u03d2\u03d9\u03ce\u03d9\u0397\u03d4\u03d9\u03d6\u03df\u0397\u03eb\u03cc\u03ca\u03d1\u03d6\u03df\u0383", "\u045f\u0400\u040f\u040a\u040d\u040a\u0417\u045d\u045f\u045d\u044b\u044a\u0435", "\u0006STSN\u0004\u0006\u0004\u0012\u0013l", "\u03e7\u03e5\u03f4\u03c3\u03ec\u03e1\u03f3\u03f3\u03bc\u03be\u03a8\u03a9\u03cc\u03ea\u03e1\u03f6\u03e1\u03af\u03ec\u03e1\u03ee\u03e7\u03af\u03c3\u03ec\u03e1\u03f3\u03f3\u03bb", "\u00e7\u00ee\u00fc\u00e7\u00cc\u00e0\u00eb\u00ea\u00b3\u00b1\u00a7\u00a6\u00c6", "\u07ff\u07eb\u07ef\u07fb\u07f6\u07e9\u07a6\u07a4\u07b2\u07d6\u07f0\u07fb\u07ec\u07fb\u07b5\u07f6\u07fb\u07f4\u07fd\u07b5\u07d5\u07f8\u07f0\u07ff\u07f9\u07ee\u07a1\u07b3\u07c0", "\u0287\u0288\u028b\u028a\u0281\u02d8\u02da\u02cc\u02cd\u02a8\u028e\u0285\u0292\u0285\u02cb\u0288\u0285\u028a\u0283\u02cb\u02ab\u0286\u028e\u0281\u0287\u0290\u02df", "\u04a8\u04b3\u048f\u04a8\u04ae\u04b5\u04b2\u04bb\u04e0\u04e2\u04f4\u04f5\u0490\u04b6\u04bd\u04aa\u04bd\u04f3\u04b0\u04bd\u04b2\u04bb\u04f3\u048f\u04a8\u04ae\u04b5\u04b2\u04bb\u04e7", "\u0256\u0257\u024c\u0251\u025e\u0241\u0204\u0206\u0210\u0211\u026e", "\u016f\u016e\u0175\u0168\u0167\u0178\u0140\u016d\u016d\u013d\u013f\u0129\u0128\u0157", "\u00ec\u00fa\u00f2\u00ef\u00a7\u00a5\u00b3\u00b2\u00cd", "PFNS\u001b\u0019\u000fm\u000eq", "\u07e4\u07f2\u07fa\u07e7\u07a3\u07af\u07ad\u07bb\u07d9\u07ba\u07c5", "\u0500\u0516\u051e\u0503\u054b\u0549\u055f\u053d\u053e\u055e\u0521", "\u0189\u0186\u0181\u018e\u0183\u0186\u0195\u018a\u01d3\u01d1\u01c7\u01c6\u01b9"})
public final class Class3527 {
    public static int field7804 = 262639453;
    public static float field7805;
    public static double field7806;
    public static float field7807;

    private static String YmHfqyTjoliT9A1J(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7807 = Float.intBitsToFloat(1119092736);
        aD\u200e = "KEEP";
        field7806 = Double.longBitsToDouble(4599489228147001098L);
        br\u200e = "Accounts for explosion block destruction when calculating damages";
        field7805 = Float.intBitsToFloat(1064236712);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 19FqdYy9QtKyle(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3527.YmHfqyTjoliT9A1J(k2, -1635293292));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block10: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3527.YmHfqyTjoliT9A1J(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 55255 : 55254;
            block11: while (true) {
                switch (n3) {
                    case 55255: {
                        n3 = 55253;
                        continue block11;
                    }
                    case 55254: {
                        String c2 = Class3527.YmHfqyTjoliT9A1J(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block10;
                    }
                    default: {
                        continue block10;
                    }
                }
                break;
            }
        }
        int n4 = s2.isEmpty() ? 52716 : 52717;
        block12: while (true) {
            switch (n4) {
                case 52717: {
                    n4 = 52715;
                    continue block12;
                }
                case 52716: {
                    throw new Exception("Can't find method in " + Class3527.YmHfqyTjoliT9A1J(k2, -1635293292) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

