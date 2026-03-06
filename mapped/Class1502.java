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

@HACHIMI_CLIENT(mv=100, d1={"\u73d8\u73d5\u73db\u73d9\u73d5\u73db\u73db\u73dd", "\u0b80\u0b85\u0b80\u0b80\u0b82\u0b87\u0b86\u0b81", "\u8c4e\u8c4b\u8c40\u8c40\u8c49\u8c48\u8c4e\u8c4c", "\u0972\u097f\u0976\u0971\u0971\u0975\u0972\u0974", "\u6dd4\u6dd7\u6dda\u6dd1\u6dda\u6dd4\u6dd3\u6dd7", "\ud055\ud051\ud053\ud051\ud052\ud054\ud050\ud056", "\ub7ba\ub7ba\ub7b9\ub7bb\ub7be\ub7bd\ub7b9\ub7bb", "\ue6d5\ue6d2\ue6d5\ue6d6\ue6d3\ue6d1\ue6d8", "\u7ad4\u7adc\u7ad6\u7ad7\u7ad2\u7adc\u7ad7\u7adc", "\u6119\u6115\u611a\u6119\u611f\u6118\u611d\u611e", "\u7dc5\u7dc7\u7dc7\u7dc4\u7dc2\u7dc9\u7dc7\u7dc3", "\u9568\u956e\u956a\u9566\u9566\u956b\u9567\u956d", "\u8bbe\u8bb9\u8bb8\u8bba\u8bba\u8bb9\u8bba\u8bbf", "\u7e13\u7e11\u7e17\u7e1c\u7e11\u7e17\u7e1c\u7e13", "\ue4df\ue4df\ue4db\ue4dd\ue4d9\ue4dd\ue4df", "\u832f\u8328\u832a\u8328\u832e\u832e\u8328\u832d", "\udebc\udeb0\udeb0\udeb1\udebb\udebf\udeb8\udeb0"}, d2={"\u0263\u0265\u0252\u220a\u0238\u023a\u022c\u0248\u026e\u0265\u0272\u0265\u022b\u0268\u0265\u026a\u0263\u022b\u0257\u0270\u0276\u026d\u026a\u0263\u023f\u022d\u0248\u026e\u0265\u0272\u0265\u022b\u0268\u0265\u026a\u0263\u022b\u0257\u0270\u0276\u026d\u026a\u0263\u023f", "Y_i\u2030\u0002\u0000\u0016rT_H_\u0011R_PY\u0011mJLWPY\u0005\u0017rT_H_\u0011R_PY\u0011mJLWPY\u0005", "\u0634\u0632\u060b\u265d\u066f\u066d\u067b\u061f\u0639\u0632\u0625\u0632\u067c\u063f\u0632\u063d\u0634\u067c\u0600\u0627\u0621\u063a\u063d\u0634\u0668\u067a\u061f\u0639\u0632\u0625\u0632\u067c\u063f\u0632\u063d\u0634\u067c\u0600\u0627\u0621\u063a\u063d\u0634\u0668", "\u0528\u0577\u0578\u057d\u057a\u057d\u0560\u052a\u0528\u052a\u053c\u053d\u0542", "\u07d8\u078d\u078a\u078d\u0790\u07da\u07d8\u07da\u07cc\u07cd\u07b2", "\u02a2\u02a0\u02b1\u0286\u02a9\u02a4\u02b6\u02b6\u02f9\u02fb\u02ed\u02ec\u0289\u02af\u02a4\u02b3\u02a4\u02ea\u02a9\u02a4\u02ab\u02a2\u02ea\u0286\u02a9\u02a4\u02b6\u02b6\u02fe", "\u077c\u0775\u0767\u077c\u0757\u077b\u0770\u0771\u0728\u072a\u073c\u073d\u075d", "\u034f\u035b\u035f\u034b\u0346\u0359\u0316\u0314\u0302\u0366\u0340\u034b\u035c\u034b\u0305\u0346\u034b\u0344\u034d\u0305\u0365\u0348\u0340\u034f\u0349\u035e\u0311\u0303\u0370", "\u0244\u024b\u0248\u0249\u0242\u021b\u0219\u020f\u020e\u026b\u024d\u0246\u0251\u0246\u0208\u024b\u0246\u0249\u0240\u0208\u0268\u0245\u024d\u0242\u0244\u0253\u021c", "\u057d\u0566\u055a\u057d\u057b\u0560\u0567\u056e\u0535\u0537\u0521\u0520\u0545\u0563\u0568\u057f\u0568\u0526\u0565\u0568\u0567\u056e\u0526\u055a\u057d\u057b\u0560\u0567\u056e\u0532", "\u05eb\u05ea\u05f1\u05ec\u05e3\u05fc\u05b9\u05bb\u05ad\u05ac\u05d3", "\u071c\u071d\u0706\u071b\u0714\u070b\u0733\u071e\u071e\u074e\u074c\u075a\u075b\u0724", "\u0789\u079f\u0797\u078a\u07c2\u07c0\u07d6\u07d7\u07a8", "\u04f4\u04e2\u04ea\u04f7\u04bf\u04bd\u04ab\u04c9\u04aa\u04d5", "\u048f\u0499\u0491\u048c\u04c8\u04c4\u04c6\u04d0\u04b2\u04d1\u04ae", "0&.3{yo\r\u000en\u0011", "\u026c\u0263\u0264\u026b\u0266\u0263\u0270\u026f\u0236\u0234\u0222\u0223\u025c"})
public final class Class1502 {
    public static float field5667;
    public static int field5668 = -1514551089;
    public static float field5669 = 0.26829463f;
    public static float field5670;
    public static float field5671;
    public static int field5672 = 1967684198;

    private static String aS73lTmeKwRTJTJ6(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite m2e4ejqgvpjty6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        HACHIMI_CLIENT p2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class1502.aS73lTmeKwRTJTJ6(k2, -1745835116));
                    p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) break block7;
                    n4 = 46911;
                    n3 = n4;
                    if (n3 == 46910) throw new Exception("Outdated metadata version");
                    if (n3 == 46911) break block8;
                    break block9;
                }
                n4 = 46910;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 46910) throw new Exception("Outdated metadata version");
                if (n3 != 46911) break block9;
            }
            do {
                n4 = 46909;
                n3 = n4;
                if (n3 == 46910) throw new Exception("Outdated metadata version");
            } while (n3 == 46911);
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1502.aS73lTmeKwRTJTJ6(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1502.aS73lTmeKwRTJTJ6(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1502.aS73lTmeKwRTJTJ6(k2, -1745835116) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field5670 = Float.intBitsToFloat(1045371120);
        field5667 = Float.intBitsToFloat(1061628721);
        field5671 = Float.intBitsToFloat(1050325406);
        ab\u200e = "MaxTicks";
        aq\u200e = "AntiCollide";
        ar\u200e = " ";
    }
}

