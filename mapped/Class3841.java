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

@HACHIMI_CLIENT(mv=100, d1={"\u989b\u9898\u989a\u9899\u989a\u989a\u9898\u989c", "\ua738\ua73b\ua73f\ua737\ua736\ua73f\ua73c\ua73a", "\u54fa\u54fa\u54f7\u54f6\u54f9\u54fc\u54fa\u54fb", "\u2467\u2462\u246c\u2465\u2461\u2461\u2466\u2462", "\u18d7\u18d7\u18dd\u18d2\u18d3\u18d7\u18d3\u18d4", "\u3e1d\u3e1c\u3e10\u3e10\u3e1a\u3e10\u3e18\u3e1e", "\u4cac\u4ca0\u4cab\u4ca8\u4ca0\u4cab\u4caf\u4cae", "\u4e67\u4e66\u4e65\u4e64\u4e65\u4e62\u4e67\u4e63", "\ua4ec\ua4ea\ua4e0\ua4ee\ua4eb\ua4ee\ua4e0\ua4eb", "\u494e\u494d\u494a\u494b\u494b\u494f\u494a\u494b", "\uc901\uc906\uc907\uc90b\uc901\uc900\uc907\uc905", "\u2454\u2458\u245e\u2455\u2459\u2459\u2458", "\u5525\u5525\u5527\u5527\u5528\u5529", "\uce88\uce8a\uce8f\uce8a\uce88\uce8e\uce8c"}, d2={"\u0086\u00d9\u00d6\u00d3\u00d4\u00d3\u00ce\u0084\u0086\u0084\u0092\u0093\u00ec", "\u02a0\u02f5\u02f2\u02f5\u02e8\u02a2\u02a0\u02a2\u02b4\u02b5\u02ca", "\u0774\u0776\u0767\u0750\u077f\u0772\u0760\u0760\u072f\u072d\u073b\u073a\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0750\u077f\u0772\u0760\u0760\u0728", "\u07fd\u07f4\u07e6\u07fd\u07d6\u07fa\u07f1\u07f0\u07a9\u07ab\u07bd\u07bc\u07dc", "\u02dc\u02c8\u02cc\u02d8\u02d5\u02ca\u0285\u0287\u0291\u02f5\u02d3\u02d8\u02cf\u02d8\u0296\u02d5\u02d8\u02d7\u02de\u0296\u02f6\u02db\u02d3\u02dc\u02da\u02cd\u0282\u0290\u02e3", "\u045b\u0454\u0457\u0456\u045d\u0404\u0406\u0410\u0411\u0474\u0452\u0459\u044e\u0459\u0417\u0454\u0459\u0456\u045f\u0417\u0477\u045a\u0452\u045d\u045b\u044c\u0403", "\u031a\u0301\u033d\u031a\u031c\u0307\u0300\u0309\u0352\u0350\u0346\u0347\u0322\u0304\u030f\u0318\u030f\u0341\u0302\u030f\u0300\u0309\u0341\u033d\u031a\u031c\u0307\u0300\u0309\u0355", "\u062c\u062d\u0636\u062b\u0624\u063b\u067e\u067c\u066a\u066b\u0614", "\u0551\u0550\u054b\u0556\u0559\u0546\u057e\u0553\u0553\u0503\u0501\u0517\u0516\u0569", "\u0524\u0532\u053a\u0527\u056f\u056d\u057b\u057a\u0505", "\u0704\u0712\u071a\u0707\u074f\u074d\u075b\u0739\u075a\u0725", "\u04f0\u04e6\u04ee\u04f3\u04b7\u04bb\u04b9\u04af\u04cd\u04ae\u04d1", "\u0674\u0662\u066a\u0677\u063f\u063d\u062b\u0649\u064a\u062a\u0655", "\u065d\u0652\u0655\u065a\u0657\u0652\u0641\u065e\u0607\u0605\u0613\u0612\u066d"})
public final class Class3841 {
    public static float field8705;
    public static float field8706 = 0.5722843f;
    public static double field8707;
    public static int field8708 = 705389529;
    public static float field8709 = 0.84814763f;
    public static double field8710;
    public static double field8711;
    public static float field8712;

    private static String BsDwmTa7Ar8lwjSG(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite NEPFNt2jn5l1W9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3841.BsDwmTa7Ar8lwjSG(k2, 1905847165));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 44188 : 44187;
        block6: while (true) {
            switch (n3) {
                case 44188: {
                    n3 = 44186;
                    continue block6;
                }
                case 44187: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3841.BsDwmTa7Ar8lwjSG(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3841.BsDwmTa7Ar8lwjSG(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3841.BsDwmTa7Ar8lwjSG(k2, 1905847165) + " " + l2 + " " + m2);
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
        field8712 = Float.intBitsToFloat(1052451988);
        field8705 = Float.intBitsToFloat(1062231167);
        field8707 = Double.longBitsToDouble(4604445317841705799L);
        field8710 = Double.longBitsToDouble(4580786023279761600L);
        field8711 = Double.longBitsToDouble(4604356985513590601L);
    }
}

