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

@HACHIMI_CLIENT(mv=100, d1={"\u4f8d\u4f8e\u4f8d\u4f81\u4f81\u4f8d\u4f8d\u4f80", "\u7c05\u7c03\u7c06\u7c07\u7c02\u7c04\u7c03\u7c04", "\u111d\u111a\u1119\u1113\u1113\u111e\u111f\u1113", "\u2f8d\u2f8f\u2f89\u2f8e\u2f87\u2f86\u2f8b\u2f8a", "TVR^QQWV", "\u4dfb\u4df9\u4dfb\u4dff\u4df0\u4dfb\u4df0\u4dfa", "\u1404\u1407\u1406\u1403\u1406\u1407\u1406\u1400", "\u7efa\u7ef0\u7efb\u7ef0\u7ef9\u7efd\u7ef0\u7ef0", "\ue436\ue430\ue431\ue434\ue430\ue436\ue438", "\ubf09\ubf0e\ubf04\ubf05\ubf05\ubf0b\ubf0e", "\u36d4\u36d3\u36d5\u36d3\u36d7\u36d3\u36d2\u36d0", "\u4a6d\u4a6b\u4a6d\u4a6f\u4a63\u4a6b\u4a6d\u4a6a", "\ud266\ud26a\ud266\ud265\ud261\ud264\ud26a\ud261", "\u36d0\u36d8\u36d2\u36d0\u36d1\u36d4\u36d0\u36d6", "\u3082\u3085\u3080\u3086\u3087\u3085\u3087", "\u5c07\u5c03\u5c04\u5c05\u5c03\u5c06\u5c0a\u5c02"}, d2={"\u05ce\u05d3\u05f4\u25b2\u0580\u0582\u0594\u05f0\u05d6\u05dd\u05ca\u05dd\u0593\u05d0\u05dd\u05d2\u05db\u0593\u05ef\u05c8\u05ce\u05d5\u05d2\u05db\u0587\u0595\u05f0\u05d6\u05dd\u05ca\u05dd\u0593\u05d0\u05dd\u05d2\u05db\u0593\u05ef\u05c8\u05ce\u05d5\u05d2\u05db\u0587", "\u04e6\u04fb\u04dd\u249a\u04a8\u04aa\u04bc\u04d8\u04fe\u04f5\u04e2\u04f5\u04bb\u04f8\u04f5\u04fa\u04f3\u04bb\u04c7\u04e0\u04e6\u04fd\u04fa\u04f3\u04af\u04bd\u04d8\u04fe\u04f5\u04e2\u04f5\u04bb\u04f8\u04f5\u04fa\u04f3\u04bb\u04c7\u04e0\u04e6\u04fd\u04fa\u04f3\u04af", "\u06be\u06e1\u06ee\u06eb\u06ec\u06eb\u06f6\u06bc\u06be\u06bc\u06aa\u06ab\u06d4", "\u043a\u046f\u0468\u046f\u0472\u0438\u043a\u0438\u042e\u042f\u0450", "\u0476\u0474\u0465\u0452\u047d\u0470\u0462\u0462\u042d\u042f\u0439\u0438\u045d\u047b\u0470\u0467\u0470\u043e\u047d\u0470\u047f\u0476\u043e\u0452\u047d\u0470\u0462\u0462\u042a", "\u026a\u0263\u0271\u026a\u0241\u026d\u0266\u0267\u023e\u023c\u022a\u022b\u024b", "\u01d9\u01cd\u01c9\u01dd\u01d0\u01cf\u0180\u0182\u0194\u01f0\u01d6\u01dd\u01ca\u01dd\u0193\u01d0\u01dd\u01d2\u01db\u0193\u01f3\u01de\u01d6\u01d9\u01df\u01c8\u0187\u0195\u01e6", "\u07cc\u07c3\u07c0\u07c1\u07ca\u0793\u0791\u0787\u0786\u07e3\u07c5\u07ce\u07d9\u07ce\u0780\u07c3\u07ce\u07c1\u07c8\u0780\u07e0\u07cd\u07c5\u07ca\u07cc\u07db\u0794", "\u02a8\u02b3\u028f\u02a8\u02ae\u02b5\u02b2\u02bb\u02e0\u02e2\u02f4\u02f5\u0290\u02b6\u02bd\u02aa\u02bd\u02f3\u02b0\u02bd\u02b2\u02bb\u02f3\u028f\u02a8\u02ae\u02b5\u02b2\u02bb\u02e7", "\u06fc\u06fd\u06e6\u06fb\u06f4\u06eb\u06ae\u06ac\u06ba\u06bb\u06c4", "\u0647\u0646\u065d\u0640\u064f\u0650\u0668\u0645\u0645\u0615\u0617\u0601\u0600\u067f", "\u072b\u073d\u0735\u0728\u0760\u0762\u0774\u0775\u070a", "\u06fc\u06ea\u06e2\u06ff\u06b7\u06b5\u06a3\u06c1\u06a2\u06dd", "\u018e\u0198\u0190\u018d\u01c9\u01c5\u01c7\u01d1\u01b3\u01d0\u01af", "\u01c9\u01df\u01d7\u01ca\u0182\u0180\u0196\u01f4\u01f7\u0197\u01e8", "\u0550\u055f\u0558\u0557\u055a\u055f\u054c\u0553\u050a\u0508\u051e\u051f\u0560"})
public final class Class1586 {
    public static float field5928;
    public static double field5929;
    public static float field5930 = 0.6112391f;
    public static float field5931;
    public static int field5932 = 76018303;
    public static int field5933 = 397056780;
    public static float field5934 = 0.89546674f;
    public static double field5935;

    static {
        field5935 = Double.longBitsToDouble(4594635923596435036L);
        field5931 = Float.intBitsToFloat(1054041440);
        field5928 = Float.intBitsToFloat(1030236624);
        bk\u200e = "Valid block whitelist for wallhack";
        bE\u200e = "MaxTargets";
        field5929 = Double.longBitsToDouble(4604098643781050641L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite q9twcVL4V3cqL8(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1586.knAPLGtBiYQ3fWRz(k2, -1119981161));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1586.knAPLGtBiYQ3fWRz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 26237 : 26238;
            block7: while (true) {
                switch (n3) {
                    case 26238: {
                        n3 = 26236;
                        continue block7;
                    }
                    case 26237: {
                        String c2 = Class1586.knAPLGtBiYQ3fWRz(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1586.knAPLGtBiYQ3fWRz(k2, -1119981161) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String knAPLGtBiYQ3fWRz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

