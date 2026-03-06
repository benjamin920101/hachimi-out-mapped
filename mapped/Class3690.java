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

@HACHIMI_CLIENT(mv=100, d1={"\ue05a\ue05f\ue05a\ue05f\ue05d\ue05d\ue05c\ue05b", "\u7cc9\u7ccc\u7ccb\u7cc9\u7cc9\u7cc8", "\u0ba0\u0ba4\u0ba0\u0ba9\u0ba8\u0ba8\u0ba8\u0ba7", "\u0f22\u0f26\u0f25\u0f20\u0f26\u0f27\u0f22\u0f21", "\u549f\u549d\u549f\u549a\u549c\u549d\u5498\u549a", "\u995e\u9959\u995b\u995c\u995f\u9950\u995e\u995f", "\u9fde\u9fde\u9fdd\u9fd5\u9fda\u9fdd\u9fd8\u9fd8", "\u83d6\u83d7\u83db\u83db\u83d6\u83d4\u83d5\u83d3", "\u9b8f\u9b8d\u9b81\u9b8a\u9b8e\u9b81\u9b81\u9b88", "\u20b3\u20bc\u20b3\u20b6\u20b5\u20b1\u20b0\u20bd", "\u0a64\u0a62\u0a61\u0a66\u0a60\u0a60\u0a64\u0a64", "\u0ed4\u0ed6\u0ed0\u0ed7\u0ed6\u0ed3\u0ed5\u0ed0", "\ubbf8\ubbf1\ubbf0\ubbfb\ubbfe\ubbff\ubbfd\ubbfb", "\u6f3a\u6f39\u6f3c\u6f3c\u6f38\u6f3d\u6f39\u6f3e"}, d2={"\u0265\u023a\u0235\u0230\u0237\u0230\u022d\u0267\u0265\u0267\u0271\u0270\u020f", "\u0223\u0276\u0271\u0276\u026b\u0221\u0223\u0221\u0237\u0236\u0249", "\u06c3\u06c1\u06d0\u06e7\u06c8\u06c5\u06d7\u06d7\u0698\u069a\u068c\u068d\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06e7\u06c8\u06c5\u06d7\u06d7\u069f", "\u0230\u0239\u022b\u0230\u021b\u0237\u023c\u023d\u0264\u0266\u0270\u0271\u0211", "\u0004\u0010\u0014\u0000\r\u0012]_I-\u000b\u0000\u0017\u0000N\r\u0000\u000f\u0006N.\u0003\u000b\u0004\u0002\u0015ZH;", "\u0527\u0528\u052b\u052a\u0521\u0578\u057a\u056c\u056d\u0508\u052e\u0525\u0532\u0525\u056b\u0528\u0525\u052a\u0523\u056b\u050b\u0526\u052e\u0521\u0527\u0530\u057f", "\u0798\u0783\u07bf\u0798\u079e\u0785\u0782\u078b\u07d0\u07d2\u07c4\u07c5\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07bf\u0798\u079e\u0785\u0782\u078b\u07d7", "\u063a\u063b\u0620\u063d\u0632\u062d\u0668\u066a\u067c\u067d\u0602", "\u03ce\u03cf\u03d4\u03c9\u03c6\u03d9\u03e1\u03cc\u03cc\u039c\u039e\u0388\u0389\u03f6", "\u044c\u045a\u0452\u044f\u0407\u0405\u0413\u0412\u046d", "\u01be\u01a8\u01a0\u01bd\u01f5\u01f7\u01e1\u0183\u01e0\u019f", "\u0103\u0115\u011d\u0100\u0144\u0148\u014a\u015c\u013e\u015d\u0122", "\u0743\u0755\u075d\u0740\u0708\u070a\u071c\u077e\u077d\u071d\u0762", "\u0308\u0307\u0300\u030f\u0302\u0307\u0314\u030b\u0352\u0350\u0346\u0347\u0338"})
public final class Class3690 {
    public static float field8284 = Float.intBitsToFloat(1055225526);
    public static float field8285 = 0.5420178f;

    private static String Bq9dlrbIAtd994tD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite YVxb94YojlpWwd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3690.Bq9dlrbIAtd994tD(k2, -1783683462));
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
                int a2 = Integer.parseInt(Class3690.Bq9dlrbIAtd994tD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3690.Bq9dlrbIAtd994tD(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3690.Bq9dlrbIAtd994tD(k2, -1783683462) + " " + l2 + " " + m2);
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

