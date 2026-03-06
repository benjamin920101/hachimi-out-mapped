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
@HACHIMI_CLIENT(mv=100, d1={"\ua376\ua371\ua376\ua373\ua370\ua371\ua373", "\u261a\u261c\u2618\u261b\u261c\u261b\u2616\u2618", "\u5c53\u5c56\u5c5c\u5c53\u5c57\u5c50\u5c57", "\u6312\u631c\u6314\u631d\u631d\u6314\u6317\u6315", "\u245e\u2455\u245e\u245d\u2459\u2459\u245a\u245b", "\u4856\u485c\u485c\u4850\u4850\u4855\u4856\u4854", "\u4aba\u4abf\u4abd\u4ab8\u4ab5\u4ab9\u4abc\u4ab8", "\u1e9d\u1e9a\u1e9a\u1e9e\u1e98\u1e9e\u1e99\u1e99", "\u39fb\u39f2\u39f9\u39ff\u39f2\u39f9\u39ff\u39fa", "\u9804\u9801\u9803\u9805\u9804\u9804\u9800\u9803", "\uab46\uab4f\uab4e\uab4f\uab44\uab47\uab45\uab46", "\u86c8\u86c9\u86c8\u86cc\u86c0\u86cb\u86cd\u86ca", "\u49bc\u49bb\u49ba\u49b9\u49b0\u49b1\u49be\u49b8", "\u1c54\u1c55\u1c53\u1c5f\u1c57\u1c5e\u1c52\u1c54", "\u4ca9\u4cac\u4caa\u4cad\u4cab\u4caf\u4cab\u4ca9", "\u8afd\u8afd\u8afb\u8afd\u8af7\u8af6\u8af9\u8af8"}, d2={"\u02f5\u02fc\u02d7\u229c\u02ae\u02ac\u02ba\u02de\u02f8\u02f3\u02e4\u02f3\u02bd\u02fe\u02f3\u02fc\u02f5\u02bd\u02c1\u02e6\u02e0\u02fb\u02fc\u02f5\u02a9\u02bb\u02de\u02f8\u02f3\u02e4\u02f3\u02bd\u02fe\u02f3\u02fc\u02f5\u02bd\u02c1\u02e6\u02e0\u02fb\u02fc\u02f5\u02a9", "\u06b2\u06bb\u0693\u26db\u06e9\u06eb\u06fd\u0699\u06bf\u06b4\u06a3\u06b4\u06fa\u06b9\u06b4\u06bb\u06b2\u06fa\u0686\u06a1\u06a7\u06bc\u06bb\u06b2\u06ee\u06fc\u0699\u06bf\u06b4\u06a3\u06b4\u06fa\u06b9\u06b4\u06bb\u06b2\u06fa\u0686\u06a1\u06a7\u06bc\u06bb\u06b2\u06ee", "\u062a\u0675\u067a\u067f\u0678\u067f\u0662\u0628\u062a\u0628\u063e\u063f\u0640", "\u0588\u05dd\u05da\u05dd\u05c0\u058a\u0588\u058a\u059c\u059d\u05e2", "\u0347\u0345\u0354\u0363\u034c\u0341\u0353\u0353\u031c\u031e\u0308\u0309\u036c\u034a\u0341\u0356\u0341\u030f\u034c\u0341\u034e\u0347\u030f\u0363\u034c\u0341\u0353\u0353\u031b", "\u05ed\u05e4\u05f6\u05ed\u05c6\u05ea\u05e1\u05e0\u05b9\u05bb\u05ad\u05ac\u05cc", "\u01bb\u01af\u01ab\u01bf\u01b2\u01ad\u01e2\u01e0\u01f6\u0192\u01b4\u01bf\u01a8\u01bf\u01f1\u01b2\u01bf\u01b0\u01b9\u01f1\u0191\u01bc\u01b4\u01bb\u01bd\u01aa\u01e5\u01f7\u0184", "\u0606\u0609\u060a\u060b\u0600\u0659\u065b\u064d\u064c\u0629\u060f\u0604\u0613\u0604\u064a\u0609\u0604\u060b\u0602\u064a\u062a\u0607\u060f\u0600\u0606\u0611\u065e", "\u0212\u0209\u0235\u0212\u0214\u020f\u0208\u0201\u025a\u0258\u024e\u024f\u022a\u020c\u0207\u0210\u0207\u0249\u020a\u0207\u0208\u0201\u0249\u0235\u0212\u0214\u020f\u0208\u0201\u025d", "\u043f\u043e\u0425\u0438\u0437\u0428\u046d\u046f\u0479\u0478\u0407", "\u0340\u0341\u035a\u0347\u0348\u0357\u036f\u0342\u0342\u0312\u0310\u0306\u0307\u0378", "\u0706\u0710\u0718\u0705\u074d\u074f\u0759\u0758\u0727", "\u07e2\u07f4\u07fc\u07e1\u07a9\u07ab\u07bd\u07df\u07bc\u07c3", "\u03e1\u03f7\u03ff\u03e2\u03a6\u03aa\u03a8\u03be\u03dc\u03bf\u03c0", "\u008a\u009c\u0094\u0089\u00c1\u00c3\u00d5\u00b7\u00b4\u00d4\u00ab", "\u028d\u0282\u0285\u028a\u0287\u0282\u0291\u028e\u02d7\u02d5\u02c3\u02c2\u02bd"})
public final class Class3254 {
    public static double field6988;
    public static int field6989 = 30475264;
    public static float field6990;
    public static double field6991;
    public static float field6992;

    static {
        ad\u200e = "Spin";
        field6988 = Double.longBitsToDouble(4603557831376134299L);
        az\u200e = "F8";
        field6991 = Double.longBitsToDouble(4576918229304087675L);
        field6990 = Float.intBitsToFloat(1020898528);
        field6992 = Float.intBitsToFloat(1041418068);
    }

    private static String 9oW8tdnXLxIL222W(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite FDbRiFryEmapbw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3254.9oW8tdnXLxIL222W(k2, -2067033104));
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
                int a2 = Integer.parseInt(Class3254.9oW8tdnXLxIL222W(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3254.9oW8tdnXLxIL222W(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 12407 : 12408;
        block7: while (true) {
            switch (n3) {
                case 12408: {
                    n3 = 12406;
                    continue block7;
                }
                case 12407: {
                    throw new Exception("Can't find method in " + Class3254.9oW8tdnXLxIL222W(k2, -2067033104) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

