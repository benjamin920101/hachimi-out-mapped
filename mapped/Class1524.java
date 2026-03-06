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
@HACHIMI_CLIENT(mv=100, d1={"\u23ab\u23ae\u23ad\u23aa\u23a4\u23a4\u23a5\u23ad", "\u062d\u062a\u0623\u0629\u062a\u062c\u0629\u0622", "\u53f9\u53fc\u53fa\u53f8\u53f8\u53f5\u53fc\u53fe", "\ubd9a\ubd9e\ubd9c\ubd99\ubd90\ubd90\ubd99\ubd9f", "\u439d\u439f\u4396\u4396\u439e\u439d\u439c\u439f", "\u126a\u126f\u126b\u126f\u126b\u1267\u126d\u126f", "\u2025\u2025\u2029\u2023\u2022\u2022\u2023\u2021", "\u7846\u7846\u7840\u7847\u7849\u7845\u7844\u7845", "\u49f7\u49f4\u49f1\u49f7\u49fb\u49fa\u49f2\u49f6", "\ub97f\ub97b\ub978\ub97c\ub97c\ub97e\ub97f", "\u0b81\u0b8c\u0b8f\u0b8a\u0b8d\u0b8e\u0b8b", "\u6388\u638b\u6388\u638b\u6389\u638d\u638a\u6386", "\u7143\u7145\u7145\u714f\u7144\u7147\u7147\u714e", "\ud605\ud603\ud605\ud607\ud604\ud603\ud60e\ud604", "\uad08\uad08\uad03\uad0b\uad0e\uad08\uad09\uad0e", "\u8dfc\u8df1\u8dfc\u8df8\u8df1\u8df8\u8dfc\u8df1"}, d2={"\u00b4\u0083\u00b4\u20ca\u00f8\u00fa\u00ec\u0088\u00ae\u00a5\u00b2\u00a5\u00eb\u00a8\u00a5\u00aa\u00a3\u00eb\u0097\u00b0\u00b6\u00ad\u00aa\u00a3\u00ff\u00ed\u0088\u00ae\u00a5\u00b2\u00a5\u00eb\u00a8\u00a5\u00aa\u00a3\u00eb\u0097\u00b0\u00b6\u00ad\u00aa\u00a3\u00ff", "\u02a2\u0295\u02a3\u22dc\u02ee\u02ec\u02fa\u029e\u02b8\u02b3\u02a4\u02b3\u02fd\u02be\u02b3\u02bc\u02b5\u02fd\u0281\u02a6\u02a0\u02bb\u02bc\u02b5\u02e9\u02fb\u029e\u02b8\u02b3\u02a4\u02b3\u02fd\u02be\u02b3\u02bc\u02b5\u02fd\u0281\u02a6\u02a0\u02bb\u02bc\u02b5\u02e9", "\u070e\u0751\u075e\u075b\u075c\u075b\u0746\u070c\u070e\u070c\u071a\u071b\u0764", "\u0365\u0330\u0337\u0330\u032d\u0367\u0365\u0367\u0371\u0370\u030f", "\u0413\u0411\u0400\u0437\u0418\u0415\u0407\u0407\u0448\u044a\u045c\u045d\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0437\u0418\u0415\u0407\u0407\u044f", "\u070a\u0703\u0711\u070a\u0721\u070d\u0706\u0707\u075e\u075c\u074a\u074b\u072b", "\u0426\u0432\u0436\u0422\u042f\u0430\u047f\u047d\u046b\u040f\u0429\u0422\u0435\u0422\u046c\u042f\u0422\u042d\u0424\u046c\u040c\u0421\u0429\u0426\u0420\u0437\u0478\u046a\u0419", "\u0203\u020c\u020f\u020e\u0205\u025c\u025e\u0248\u0249\u022c\u020a\u0201\u0216\u0201\u024f\u020c\u0201\u020e\u0207\u024f\u022f\u0202\u020a\u0205\u0203\u0214\u025b", "\u0691\u068a\u06b6\u0691\u0697\u068c\u068b\u0682\u06d9\u06db\u06cd\u06cc\u06a9\u068f\u0684\u0693\u0684\u06ca\u0689\u0684\u068b\u0682\u06ca\u06b6\u0691\u0697\u068c\u068b\u0682\u06de", "\u0749\u0748\u0753\u074e\u0741\u075e\u071b\u0719\u070f\u070e\u0771", "\u036d\u036c\u0377\u036a\u0365\u037a\u0342\u036f\u036f\u033f\u033d\u032b\u032a\u0355", "\u013b\u012d\u0125\u0138\u0170\u0172\u0164\u0165\u011a", "\u0249\u025f\u0257\u024a\u0202\u0200\u0216\u0274\u0217\u0268", "\u01b2\u01a4\u01ac\u01b1\u01f5\u01f9\u01fb\u01ed\u018f\u01ec\u0193", "\u07df\u07c9\u07c1\u07dc\u0794\u0796\u0780\u07e2\u07e1\u0781\u07fe", "\u0251\u025e\u0259\u0256\u025b\u025e\u024d\u0252\u020b\u0209\u021f\u021e\u0261"})
public final class Class1524 {
    public static String field5749;
    public static double field5750;
    public static float field5751;
    public static float field5752;
    public static float field5753;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite hvKVC5onNNS9L6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1524.4HISrrj3HaGxCM3D(k2, 966077513));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1524.4HISrrj3HaGxCM3D(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1524.4HISrrj3HaGxCM3D(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1524.4HISrrj3HaGxCM3D(k2, 966077513) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 2682 : 2681;
        block7: while (true) {
            switch (n3) {
                case 2682: {
                    n3 = 2680;
                    continue block7;
                }
                case 2681: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 4HISrrj3HaGxCM3D(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5751 = Float.intBitsToFloat(0x41100000);
        field5753 = Float.intBitsToFloat(1063422111);
        bu\u200e = "The maximum range the entity can be attacked through walls";
        field5749 = "-Xrunjdwp";
        field5750 = Double.longBitsToDouble(4591095423925545728L);
        field5752 = Float.intBitsToFloat(1062183622);
    }
}

