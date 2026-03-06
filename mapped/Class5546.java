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

@HACHIMI_CLIENT(mv=100, d1={"\u2cf5\u2cf2\u2cf7\u2cf1\u2cf6\u2cf0\u2cf9\u2cf0", "\u287e\u287e\u287a\u2879\u2879\u287b\u2871", "\u4490\u4494\u449a\u4495\u4495\u4495\u4495\u4495", "\ub608\ub605\ub60b\ub60d\ub60b\ub60d\ub605\ub60c", "\u0ced\u0ceb\u0cec\u0cef\u0ced\u0cea\u0cea\u0cee", "\u4fdf\u4fd1\u4fd9\u4fd0\u4fd0\u4fdc\u4fdc", "\u20f9\u20f3\u20fb\u20f9\u20fd\u20f9\u20fe\u20f9", "\u86cc\u86cb\u86ce\u86cf\u86ce\u86ce\u86c9\u86cc", "\u2cfd\u2cf5\u2cf5\u2cfa\u2cff\u2cfc\u2cfa\u2cff", "\u1b08\u1b0a\u1b01\u1b0b\u1b0d\u1b08\u1b00\u1b0a", "\u12fe\u12fe\u12ff\u12fe\u12fa\u12fb\u12fc\u12f4", "\u82ab\u82ad\u82ab\u82ad\u82af\u82a4\u82ad\u82ab", "\ua731\ua731\ua734\ua732\ua731\ua731\ua73c\ua731", "\u2edb\u2edf\u2edd\u2ed3\u2ede\u2edc\u2edb\u2edf", "\ubc08\ubc09\ubc0f\ubc0e\ubc07\ubc0d\ubc09\ubc0c", "\u82f3\u82fb\u82fc\u82f8\u82fd\u82fc\u82f3", "\ue597\ue594\ue59a\ue593\ue594\ue594\ue592\ue595"}, d2={"\u0772\u076b\u077f\u2712\u0720\u0722\u0734\u0750\u0776\u077d\u076a\u077d\u0733\u0770\u077d\u0772\u077b\u0733\u074f\u0768\u076e\u0775\u0772\u077b\u0727\u0735\u0750\u0776\u077d\u076a\u077d\u0733\u0770\u077d\u0772\u077b\u0733\u074f\u0768\u076e\u0775\u0772\u077b\u0727", "\u0775\u076c\u077f\u2715\u0727\u0725\u0733\u0757\u0771\u077a\u076d\u077a\u0734\u0777\u077a\u0775\u077c\u0734\u0748\u076f\u0769\u0772\u0775\u077c\u0720\u0732\u0757\u0771\u077a\u076d\u077a\u0734\u0777\u077a\u0775\u077c\u0734\u0748\u076f\u0769\u0772\u0775\u077c\u0720", "\u00a1\u00b8\u00aa\u20c1\u00f3\u00f1\u00e7\u0083\u00a5\u00ae\u00b9\u00ae\u00e0\u00a3\u00ae\u00a1\u00a8\u00e0\u009c\u00bb\u00bd\u00a6\u00a1\u00a8\u00f4\u00e6\u0083\u00a5\u00ae\u00b9\u00ae\u00e0\u00a3\u00ae\u00a1\u00a8\u00e0\u009c\u00bb\u00bd\u00a6\u00a1\u00a8\u00f4", "\u0474\u042b\u0424\u0421\u0426\u0421\u043c\u0476\u0474\u0476\u0460\u0461\u041e", "\u072c\u0779\u077e\u0779\u0764\u072e\u072c\u072e\u0738\u0739\u0746", "\u059b\u0599\u0588\u05bf\u0590\u059d\u058f\u058f\u05c0\u05c2\u05d4\u05d5\u05b0\u0596\u059d\u058a\u059d\u05d3\u0590\u059d\u0592\u059b\u05d3\u05bf\u0590\u059d\u058f\u058f\u05c7", "\r\u0004\u0016\r&\n\u0001\u0000Y[ML,", "\u0445\u0451\u0455\u0441\u044c\u0453\u041c\u041e\u0408\u046c\u044a\u0441\u0456\u0441\u040f\u044c\u0441\u044e\u0447\u040f\u046f\u0442\u044a\u0445\u0443\u0454\u041b\u0409\u047a", "\u011c\u0113\u0110\u0111\u011a\u0143\u0141\u0157\u0156\u0133\u0115\u011e\u0109\u011e\u0150\u0113\u011e\u0111\u0118\u0150\u0130\u011d\u0115\u011a\u011c\u010b\u0144", "\u0209\u0212\u022e\u0209\u020f\u0214\u0213\u021a\u0241\u0243\u0255\u0254\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u022e\u0209\u020f\u0214\u0213\u021a\u0246", "\u034c\u034d\u0356\u034b\u0344\u035b\u031e\u031c\u030a\u030b\u0374", "\u03db\u03da\u03c1\u03dc\u03d3\u03cc\u03f4\u03d9\u03d9\u0389\u038b\u039d\u039c\u03e3", "\u06ce\u06d8\u06d0\u06cd\u0685\u0687\u0691\u0690\u06ef", "\u0018\u000e\u0006\u001bSQG%F9", "\u078a\u079c\u0794\u0789\u07cd\u07c1\u07c3\u07d5\u07b7\u07d4\u07ab", "\u047c\u046a\u0462\u047f\u0437\u0435\u0423\u0441\u0442\u0422\u045d", "\u014e\u0141\u0146\u0149\u0144\u0141\u0152\u014d\u0114\u0116\u0100\u0101\u017e"})
public final class Class5546 {
    public static double field10497;
    public static float field10498 = 0.98084205f;
    public static float field10499;
    public static float field10500;

    /*
     * WARNING - void declaration
     */
    private static CallSite nbe6a4zJaM2FNw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5546.vaeFJw08M5yeP7DO(k2, 1127221454));
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
                int a2 = Integer.parseInt(Class5546.vaeFJw08M5yeP7DO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5546.vaeFJw08M5yeP7DO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5546.vaeFJw08M5yeP7DO(k2, 1127221454) + " " + l2 + " " + m2);
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
        c\u200e = "saved";
        field10497 = Double.longBitsToDouble(-4611686018427387904L);
        field10499 = Float.intBitsToFloat(1062986217);
        J\u200e = "Removes the slowdown effect caused by shields";
        field10500 = Float.intBitsToFloat(1041259020);
        bq\u200e = "Speed to accelerate as";
    }

    private static String vaeFJw08M5yeP7DO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

