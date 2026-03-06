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
@HACHIMI_CLIENT(mv=100, d1={"\ub06a\ub06d\ub060\ub06d\ub06c\ub06c\ub06d\ub06e", "\ubb9e\ubb9b\ubb9a\ubb94\ubb99\ubb9a\ubb9c\ubb99", "\u1e1a\u1e1f\u1e1c\u1e1a\u1e13\u1e18\u1e1b\u1e19", "\u34cd\u34cd\u34cb\u34ca\u34ca\u34cf\u34cb\u34c9", "\u2a2d\u2a2f\u2a26\u2a29\u2a2d\u2a29\u2a29\u2a29", "\u3039\u303a\u3038\u303c\u303d\u3038\u303f\u303e", "\u6056\u6052\u6055\u6055\u6054\u6052\u6050\u6056", "\uaf15\uaf11\uaf15\uaf11\uaf15\uaf11\uaf14", "\ub3e1\ub3e7\ub3e0\ub3e3\ub3ec\ub3e2\ub3e6\ub3e0", "\u9e81\u9e84\u9e87\u9e82\u9e82\u9e86\u9e8d\u9e87", "\uce2c\uce29\uce2b\uce2a\uce2d\uce2f\uce2e\uce29", "\u7112\u7113\u7111\u711c\u711d\u7114\u7111", "\u91f4\u91f7\u91fb\u91f4\u91f4\u91fb\u91f3\u91f1", "\u6f1e\u6f1f\u6f12\u6f12\u6f14\u6f11\u6f17"}, d2={"\u072f\u0770\u077f\u077a\u077d\u077a\u0767\u072d\u072f\u072d\u073b\u073a\u0745", "\u04cb\u049e\u0499\u049e\u0483\u04c9\u04cb\u04c9\u04df\u04de\u04a1", "\u02d5\u02d7\u02c6\u02f1\u02de\u02d3\u02c1\u02c1\u028e\u028c\u029a\u029b\u02fe\u02d8\u02d3\u02c4\u02d3\u029d\u02de\u02d3\u02dc\u02d5\u029d\u02f1\u02de\u02d3\u02c1\u02c1\u0289", "\u0729\u0720\u0732\u0729\u0702\u072e\u0725\u0724\u077d\u077f\u0769\u0768\u0708", "\u0589\u059d\u0599\u058d\u0580\u059f\u05d0\u05d2\u05c4\u05a0\u0586\u058d\u059a\u058d\u05c3\u0580\u058d\u0582\u058b\u05c3\u05a3\u058e\u0586\u0589\u058f\u0598\u05d7\u05c5\u05b6", "\u05a4\u05ab\u05a8\u05a9\u05a2\u05fb\u05f9\u05ef\u05ee\u058b\u05ad\u05a6\u05b1\u05a6\u05e8\u05ab\u05a6\u05a9\u05a0\u05e8\u0588\u05a5\u05ad\u05a2\u05a4\u05b3\u05fc", "\u0231\u022a\u0216\u0231\u0237\u022c\u022b\u0222\u0279\u027b\u026d\u026c\u0209\u022f\u0224\u0233\u0224\u026a\u0229\u0224\u022b\u0222\u026a\u0216\u0231\u0237\u022c\u022b\u0222\u027e", "\u0003\u0002\u0019\u0004\u000b\u0014QSED;", "\u07df\u07de\u07c5\u07d8\u07d7\u07c8\u07f0\u07dd\u07dd\u078d\u078f\u0799\u0798\u07e7", "\u00ad\u00bb\u00b3\u00ae\u00e6\u00e4\u00f2\u00f3\u008c", "\u032c\u033a\u0332\u032f\u0367\u0365\u0373\u0311\u0372\u030d", "\u012a\u013c\u0134\u0129\u016d\u0161\u0163\u0175\u0117\u0174\u010b", "\u06db\u06cd\u06c5\u06d8\u0690\u0692\u0684\u06e6\u06e5\u0685\u06fa", "\u05dd\u05d2\u05d5\u05da\u05d7\u05d2\u05c1\u05de\u0587\u0585\u0593\u0592\u05ed"})
public final class Class1507 {
    public static double field5680;
    public static double field5681;
    public static int field5682 = -874167735;
    public static double field5683 = 0.09792755463245884;
    public static float field5684;
    public static float field5685;
    public static double field5686;
    public static float field5687;
    public static float field5688;
    public static float field5689;

    static {
        field5681 = Double.longBitsToDouble(4603886393520503188L);
        field5686 = Double.longBitsToDouble(4604519057252864521L);
        field5689 = Float.intBitsToFloat(1058722283);
        field5680 = Double.longBitsToDouble(4605163744959577814L);
        field5687 = Float.intBitsToFloat(1041158156);
        field5684 = Float.intBitsToFloat(1053129586);
        field5685 = Float.intBitsToFloat(1053843342);
        field5688 = Float.intBitsToFloat(1064321350);
    }

    private static String jGwtQGwb87WdJoVL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 8IFFYFX6707keM(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1507.jGwtQGwb87WdJoVL(k2, -1208271996));
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
                int a2 = Integer.parseInt(Class1507.jGwtQGwb87WdJoVL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1507.jGwtQGwb87WdJoVL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1507.jGwtQGwb87WdJoVL(k2, -1208271996) + " " + l2 + " " + m2);
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

