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

@HACHIMI_CLIENT(mv=100, d1={"\u1901\u1903\u1904\u1900\u1901\u1901\u190b\u1904", "\u218f\u218e\u2183\u2188\u218a\u218b\u2182\u2182", "\u17ea\u17ee\u17e4\u17ef\u17e4\u17eb\u17e8\u17ef", "\ue0bd\ue0b8\ue0bc\ue0bc\ue0bb\ue0ba\ue0b6\ue0bc", "\u409a\u409b\u4098\u409f\u4099\u409c\u4094\u409c", "\u9e0a\u9e03\u9e0a\u9e0f\u9e0e\u9e03\u9e08\u9e0e", "\u290d\u2908\u2901\u290e\u2900\u2908\u290b\u290d", "\u645f\u6459\u6452\u645c\u645f\u6458\u6459\u645e", "\u7819\u7819\u7818\u781c\u7819\u781f\u781c\u7812", "\ub661\ub661\ub663\ub66b\ub661\ub664\ub665\ub666", "\ud0a2\ud0a6\ud0a6\ud0a1\ud0a5\ud0a8\ud0a1\ud0a4", "\ub9fe\ub9f6\ub9f6\ub9f6\ub9f6\ub9fe\ub9f9\ub9fd", "\uda88\uda8f\uda8f\uda8d\uda89\uda82\uda82", "\u9ef4\u9ef4\u9ef7\u9ef7\u9ef7\u9ef9\u9ef6\u9ef8", "\u71dd\u71df\u71df\u71dd\u71dc\u71df\u71db\u71d9", "\u24a4\u24a7\u24a0\u24a0\u24a3\u24a1\u24a4\u24a4"}, d2={"\u035c\u037d\u0378\u233d\u030f\u030d\u031b\u037f\u0359\u0352\u0345\u0352\u031c\u035f\u0352\u035d\u0354\u031c\u0360\u0347\u0341\u035a\u035d\u0354\u0308\u031a\u037f\u0359\u0352\u0345\u0352\u031c\u035f\u0352\u035d\u0354\u031c\u0360\u0347\u0341\u035a\u035d\u0354\u0308", "\u0505\u0524\u0526\u2564\u0556\u0554\u0542\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551\u0543\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551", "\u0589\u05d6\u05d9\u05dc\u05db\u05dc\u05c1\u058b\u0589\u058b\u059d\u059c\u05e3", "\u00fa\u00af\u00a8\u00af\u00b2\u00f8\u00fa\u00f8\u00ee\u00ef\u0090", "\u0284\u0286\u0297\u02a0\u028f\u0282\u0290\u0290\u02df\u02dd\u02cb\u02ca\u02af\u0289\u0282\u0295\u0282\u02cc\u028f\u0282\u028d\u0284\u02cc\u02a0\u028f\u0282\u0290\u0290\u02d8", "\u04f3\u04fa\u04e8\u04f3\u04d8\u04f4\u04ff\u04fe\u04a7\u04a5\u04b3\u04b2\u04d2", "\u0420\u0434\u0430\u0424\u0429\u0436\u0479\u047b\u046d\u0409\u042f\u0424\u0433\u0424\u046a\u0429\u0424\u042b\u0422\u046a\u040a\u0427\u042f\u0420\u0426\u0431\u047e\u046c\u041f", "\u0707\u0708\u070b\u070a\u0701\u0758\u075a\u074c\u074d\u0728\u070e\u0705\u0712\u0705\u074b\u0708\u0705\u070a\u0703\u074b\u072b\u0706\u070e\u0701\u0707\u0710\u075f", "\u07a0\u07bb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07e8\u07ea\u07fc\u07fd\u0798\u07be\u07b5\u07a2\u07b5\u07fb\u07b8\u07b5\u07ba\u07b3\u07fb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07ef", "\u0764\u0765\u077e\u0763\u076c\u0773\u0736\u0734\u0722\u0723\u075c", "\u01e7\u01e6\u01fd\u01e0\u01ef\u01f0\u01c8\u01e5\u01e5\u01b5\u01b7\u01a1\u01a0\u01df", "\u0130\u0126\u012e\u0133\u017b\u0179\u016f\u016e\u0111", "\u0283\u0295\u029d\u0280\u02c8\u02ca\u02dc\u02be\u02dd\u02a2", "\u058d\u059b\u0593\u058e\u05ca\u05c6\u05c4\u05d2\u05b0\u05d3\u05ac", "\u042a\u043c\u0434\u0429\u0461\u0463\u0475\u0417\u0414\u0474\u040b", "\u0517\u0518\u051f\u0510\u051d\u0518\u050b\u0514\u054d\u054f\u0559\u0558\u0527"})
public final class Class1054 {
    public static float field4320;
    public static float field4321;
    public static float field4322;
    public static float field4323;
    public static double field4324 = 0.5957245745400296;

    static {
        field4321 = Float.intBitsToFloat(1063374806);
        ad\u200e = "Pauses the current process while you are swimming";
        aI\u200e = "F11";
        field4322 = Float.intBitsToFloat(1034120592);
        field4320 = Float.intBitsToFloat(1052129196);
        field4323 = Float.intBitsToFloat(1064563088);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite zYTLAsrL2BVvHX(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1054.jH2y9KgYwAjCNZW1(k2, 687571392));
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
                int a2 = Integer.parseInt(Class1054.jH2y9KgYwAjCNZW1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1054.jH2y9KgYwAjCNZW1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1054.jH2y9KgYwAjCNZW1(k2, 687571392) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String jH2y9KgYwAjCNZW1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 19729 : 19728;
            block5: while (true) {
                switch (n2) {
                    case 19729: {
                        n2 = 19727;
                        continue block5;
                    }
                    case 19728: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

