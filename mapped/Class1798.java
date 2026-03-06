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

@HACHIMI_CLIENT(mv=100, d1={"\u05ce\u05c2\u05cf\u05c8\u05c2\u05cf\u05ca\u05cc", "\u2365\u2365\u2369\u2364\u2364\u2365\u2367\u2363", "\u6c8e\u6c86\u6c8f\u6c8d\u6c89\u6c8a\u6c8d\u6c8d", "\u4a4a\u4a49\u4a4b\u4a4e\u4a4b\u4a44\u4a49", "\ua5cd\ua5cc\ua5c8\ua5cc\ua5c9\ua5c8\ua5cd\ua5cc", "\uce51\uce57\uce53\uce56\uce53\uce55\uce5c\uce57", "\u3487\u3480\u348d\u3483\u3487\u3480\u3481\u3485", "\u8e4c\u8e48\u8e45\u8e4c\u8e44\u8e4d\u8e45\u8e4f", "\u86c8\u86cf\u86c9\u86ce\u86cc\u86c8\u86cd\u86c3", "\ub268\ub26c\ub26b\ub260\ub26b\ub26b\ub26d\ub260", "\u51f1\u51f7\u51fd\u51f1\u51f7\u51f1\u51f4\u51f3", "\u8931\u8934\u8931\u8933\u8936\u893e\u8932\u8932", "\uc952\uc956\uc957\uc958\uc950\uc954\uc956\uc956", "\u2d65\u2d6c\u2d64\u2d61\u2d63\u2d67\u2d63\u2d61", "\u89d7\u89d5\u89d1\u89d5\u89d5\u89d2\u89d7\u89d4"}, d2={"\u0358\u037a\u034c\u2332\u0300\u0302\u0314\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u036f\u0348\u034e\u0355\u0352\u035b\u0307\u0315\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u036f\u0348\u034e\u0355\u0352\u035b\u0307", "\u024f\u0210\u021f\u021a\u021d\u021a\u0207\u024d\u024f\u024d\u025b\u025a\u0225", "\u05ad\u05f8\u05ff\u05f8\u05e5\u05af\u05ad\u05af\u05b9\u05b8\u05c7", "\u0092\u0090\u0081\u00b6\u0099\u0094\u0086\u0086\u00c9\u00cb\u00dd\u00dc\u00b9\u009f\u0094\u0083\u0094\u00da\u0099\u0094\u009b\u0092\u00da\u00b6\u0099\u0094\u0086\u0086\u00ce", "\u0142\u014b\u0159\u0142\u0169\u0145\u014e\u014f\u0116\u0114\u0102\u0103\u0163", "\u02f1\u02e5\u02e1\u02f5\u02f8\u02e7\u02a8\u02aa\u02bc\u02d8\u02fe\u02f5\u02e2\u02f5\u02bb\u02f8\u02f5\u02fa\u02f3\u02bb\u02db\u02f6\u02fe\u02f1\u02f7\u02e0\u02af\u02bd\u02ce", ":567<egqp\u001538/8v587>v\u0016;3<:-b", "\u0417\u040c\u0430\u0417\u0411\u040a\u040d\u0404\u045f\u045d\u044b\u044a\u042f\u0409\u0402\u0415\u0402\u044c\u040f\u0402\u040d\u0404\u044c\u0430\u0417\u0411\u040a\u040d\u0404\u0458", "\u0222\u0223\u0238\u0225\u022a\u0235\u0270\u0272\u0264\u0265\u021a", "\u023e\u023f\u0224\u0239\u0236\u0229\u0211\u023c\u023c\u026c\u026e\u0278\u0279\u0206", "\u076d\u077b\u0773\u076e\u0726\u0724\u0732\u0733\u074c", "\u05d2\u05c4\u05cc\u05d1\u0599\u059b\u058d\u05ef\u058c\u05f3", "\u02cd\u02db\u02d3\u02ce\u028a\u0286\u0284\u0292\u02f0\u0293\u02ec", "\u05a8\u05be\u05b6\u05ab\u05e3\u05e1\u05f7\u0595\u0596\u05f6\u0589", "\u0513\u051c\u051b\u0514\u0519\u051c\u050f\u0510\u0549\u054b\u055d\u055c\u0523"})
public final class Class1798 {
    public static double field6717;
    public static double field6718;
    public static float field6719;
    public static double field6720;

    static {
        field6720 = Double.longBitsToDouble(4567434522307386112L);
        field6718 = Double.longBitsToDouble(4598224141190561984L);
        w\u200e = "Ping";
        field6717 = Double.longBitsToDouble(4599862841176661126L);
        field6719 = Float.intBitsToFloat(1063327604);
    }

    private static String EB4i7a6w4lQjOOBv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite tEVqfVNY6ex8Pq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1798.EB4i7a6w4lQjOOBv(k2, -1725874507));
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
                int a2 = Integer.parseInt(Class1798.EB4i7a6w4lQjOOBv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1798.EB4i7a6w4lQjOOBv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1798.EB4i7a6w4lQjOOBv(k2, -1725874507) + " " + l2 + " " + m2);
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

