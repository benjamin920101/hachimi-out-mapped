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
@HACHIMI_CLIENT(mv=100, d1={"\u5190\u519d\u5197\u519d\u5197\u5192\u5191\u5197", "\u844a\u8443\u8442\u844c\u8448\u844b\u844f\u844a", "\u8e07\u8e04\u8e02\u8e03\u8e0b\u8e0b\u8e0a\u8e00", "\u8f5e\u8f5a\u8f58\u8f5b\u8f5d\u8f5d\u8f5c\u8f51", "\u51c7\u51c2\u51ca\u51c1\u51c1\u51c0\u51c1", "\u7d48\u7d49\u7d49\u7d4d\u7d42\u7d4e\u7d4c\u7d4c", "\u154f\u154e\u1548\u154c\u1548\u1549\u154c\u1544", "\ubd8e\ubd85\ubd88\ubd85\ubd8c\ubd84\ubd88\ubd8f", "\u4a85\u4a88\u4a82\u4a88\u4a80\u4a89\u4a86\u4a85", "\ud4d3\ud4d4\ud4d4\ud4d4\ud4d9\ud4d8\ud4d0", "\uc2f5\uc2fc\uc2f8\uc2fe\uc2f5\uc2fb\uc2f9", "\u1924\u192f\u1927\u192e\u192f\u1925\u1923\u1924", "\ub159\ub154\ub159\ub15f\ub15c\ub15f\ub155\ub158", "\u5e08\u5e0f\u5e04\u5e09\u5e04\u5e0c\u5e0b\u5e0a"}, d2={"\u0414\u044b\u0444\u0441\u0446\u0441\u045c\u0416\u0414\u0416\u0400\u0401\u047e", "\u0681\u06d4\u06d3\u06d4\u06c9\u0683\u0681\u0683\u0695\u0694\u06eb", "\u0340\u0342\u0353\u0364\u034b\u0346\u0354\u0354\u031b\u0319\u030f\u030e\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0364\u034b\u0346\u0354\u0354\u031c", "\u042b\u0422\u0430\u042b\u0400\u042c\u0427\u0426\u047f\u047d\u046b\u046a\u040a", "\u0235\u0221\u0225\u0231\u023c\u0223\u026c\u026e\u0278\u021c\u023a\u0231\u0226\u0231\u027f\u023c\u0231\u023e\u0237\u027f\u021f\u0232\u023a\u0235\u0233\u0224\u026b\u0279\u020a", "\u06d0\u06df\u06dc\u06dd\u06d6\u068f\u068d\u069b\u069a\u06ff\u06d9\u06d2\u06c5\u06d2\u069c\u06df\u06d2\u06dd\u06d4\u069c\u06fc\u06d1\u06d9\u06d6\u06d0\u06c7\u0688", "\u02f6\u02ed\u02d1\u02f6\u02f0\u02eb\u02ec\u02e5\u02be\u02bc\u02aa\u02ab\u02ce\u02e8\u02e3\u02f4\u02e3\u02ad\u02ee\u02e3\u02ec\u02e5\u02ad\u02d1\u02f6\u02f0\u02eb\u02ec\u02e5\u02b9", "\u0742\u0743\u0758\u0745\u074a\u0755\u0710\u0712\u0704\u0705\u077a", "\u0224\u0225\u023e\u0223\u022c\u0233\u020b\u0226\u0226\u0276\u0274\u0262\u0263\u021c", "\u0416\u0400\u0408\u0415\u045d\u045f\u0449\u0448\u0437", "\u0762\u0774\u077c\u0761\u0729\u072b\u073d\u075f\u073c\u0743", "\u06c6\u06d0\u06d8\u06c5\u0681\u068d\u068f\u0699\u06fb\u0698\u06e7", "\u0232\u0224\u022c\u0231\u0279\u027b\u026d\u020f\u020c\u026c\u0213", "\u036c\u0363\u0364\u036b\u0366\u0363\u0370\u036f\u0336\u0334\u0322\u0323\u035c"})
public final class Class1689 {
    public static int field6265 = 219421083;
    public static float field6266 = Float.intBitsToFloat(0x3F000000);

    private static String 6YBvgMeBYTjjWpid(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite YNWwYydCTplA1U(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1689.6YBvgMeBYTjjWpid(k2, -606535911));
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
                int a2 = Integer.parseInt(Class1689.6YBvgMeBYTjjWpid(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1689.6YBvgMeBYTjjWpid(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1689.6YBvgMeBYTjjWpid(k2, -606535911) + " " + l2 + " " + m2);
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

