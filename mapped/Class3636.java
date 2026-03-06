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

@HACHIMI_CLIENT(mv=100, d1={"\uaa5a\uaa59\uaa5b\uaa5e\uaa56\uaa57\uaa56", "\u6df2\u6dfe\u6df2\u6df5\u6df2\u6df2\u6df3\u6df1", "\ub2b6\ub2b8\ub2b7\ub2b7\ub2b6\ub2b6\ub2b9", "\u5ec7\u5ec6\u5ec3\u5ec1\u5ec5\u5ec7\u5ec1\u5ec0", "\u0c3d\u0c3a\u0c3e\u0c39\u0c3e\u0c3f\u0c3d\u0c3f", "\udd02\udd0a\udd01\udd00\udd00\udd0a\udd0b\udd02", "\uad95\uad9a\uad94\uad94\uad9e\uad99\uad9d", "\ua23f\ua23a\ua23f\ua233\ua238", "\udc00\udc0c\udc0d\udc0b\udc01\udc09\udc0b", "\u3d42\u3d42\u3d46\u3d47\u3d42\u3d4e\u3d41\u3d47", "\u042b\u0429\u0422\u042b\u0422\u0428\u042d\u042e", "\ue063\ue061\ue061\ue061\ue068\ue061\ue063\ue061", "\u5fbf\u5fb4\u5fbf\u5fbb\u5fb5\u5fbd\u5fba\u5fb4", "\u64e8\u64e2\u64ed\u64e9\u64e8\u64e8\u64e3\u64e8"}, d2={"\u053d\u0562\u056d\u0568\u056f\u0568\u0575\u053f\u053d\u053f\u0529\u0528\u0557", "\u022d\u0278\u027f\u0278\u0265\u022f\u022d\u022f\u0239\u0238\u0247", "\u0316\u0314\u0305\u0332\u031d\u0310\u0302\u0302\u034d\u034f\u0359\u0358\u033d\u031b\u0310\u0307\u0310\u035e\u031d\u0310\u031f\u0316\u035e\u0332\u031d\u0310\u0302\u0302\u034a", "\u02cf\u02c6\u02d4\u02cf\u02e4\u02c8\u02c3\u02c2\u029b\u0299\u028f\u028e\u02ee", "\u07c3\u07d7\u07d3\u07c7\u07ca\u07d5\u079a\u0798\u078e\u07ea\u07cc\u07c7\u07d0\u07c7\u0789\u07ca\u07c7\u07c8\u07c1\u0789\u07e9\u07c4\u07cc\u07c3\u07c5\u07d2\u079d\u078f\u07fc", "\u0722\u072d\u072e\u072f\u0724\u077d\u077f\u0769\u0768\u070d\u072b\u0720\u0737\u0720\u076e\u072d\u0720\u072f\u0726\u076e\u070e\u0723\u072b\u0724\u0722\u0735\u077a", "\u0344\u035f\u0363\u0344\u0342\u0359\u035e\u0357\u030c\u030e\u0318\u0319\u037c\u035a\u0351\u0346\u0351\u031f\u035c\u0351\u035e\u0357\u031f\u0363\u0344\u0342\u0359\u035e\u0357\u030b", "\u07fe\u07ff\u07e4\u07f9\u07f6\u07e9\u07ac\u07ae\u07b8\u07b9\u07c6", "\u030d\u030c\u0317\u030a\u0305\u031a\u0322\u030f\u030f\u035f\u035d\u034b\u034a\u0335", "RDLQ\u0019\u001b\r\fs", "gqyd,.8Z9F", "\u0749\u075f\u0757\u074a\u070e\u0702\u0700\u0716\u0774\u0717\u0768", "\u0553\u0545\u054d\u0550\u0518\u051a\u050c\u056e\u056d\u050d\u0572", "\u0356\u0359\u035e\u0351\u035c\u0359\u034a\u0355\u030c\u030e\u0318\u0319\u0366"})
public final class Class3636 {
    public static double field8124;
    public static float field8125;
    public static double field8126;
    public static double field8127;
    public static double field8128;

    /*
     * WARNING - void declaration
     */
    private static CallSite j7Jzw5CzNelzvQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3636.ZKQGdutuFa4PP24N(k2, -1297451470));
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
                int a2 = Integer.parseInt(Class3636.ZKQGdutuFa4PP24N(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3636.ZKQGdutuFa4PP24N(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3636.ZKQGdutuFa4PP24N(k2, -1297451470) + " " + l2 + " " + m2);
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
        field8128 = Double.longBitsToDouble(4598785351846129086L);
        field8127 = Double.longBitsToDouble(4606931577699046987L);
        field8126 = Double.longBitsToDouble(4599077644569744466L);
        field8125 = Float.intBitsToFloat(1061163397);
        field8124 = Double.longBitsToDouble(4600266068912483126L);
    }

    private static String ZKQGdutuFa4PP24N(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

