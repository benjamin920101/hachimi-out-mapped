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

@HACHIMI_CLIENT(mv=100, d1={"\ue0bc\ue0bf\ue0b9\ue0bd\ue0b8\ue0b9\ue0bf\ue0b8", "\u03cb\u03ce\u03ca\u03c0\u03ce\u03cb\u03ca\u03ce", "\uaea2\uaea1\uaea1\uaea2\uaeaf\uaeae\uaea3\uaea7", "\u95d4\u95d2\u95d4\u95d6\u95d0\u95d3\u95d2", "\u414e\u414d\u414e\u414d\u4145\u414c\u4149\u414a", "\u1cd4\u1cd0\u1cd5\u1cd7\u1cd5\u1cd7\u1cd5\u1cd0", "\u0f3d\u0f38\u0f39\u0f3e\u0f38\u0f38\u0f33\u0f3e", "\ue2d2\ue2d6\ue2d0\ue2d2\ue2d4\ue2d9\ue2d3\ue2d2", "\u7288\u7288\u728e\u7288\u728a\u7285\u728f\u728b", "\u427f\u427f\u427a\u427d\u4275\u427c\u4274\u427d", "\u62c0\u62ce\u62c3\u62c7\u62c3\u62ce\u62ce\u62c2", "\u8c74\u8c7d\u8c7c\u8c7d\u8c79\u8c7b", "\u6e39\u6e3d\u6e39\u6e3b\u6e3a\u6e3e\u6e3a\u6e3b", "\ucb0f\ucb03\ucb0e\ucb02\ucb03\ucb03\ucb0b\ucb08"}, d2={"\u076f\u0730\u073f\u073a\u073d\u073a\u0727\u076d\u076f\u076d\u077b\u077a\u0705", "\u0652\u0607\u0600\u0607\u061a\u0650\u0652\u0650\u0646\u0647\u0638", "\u025b\u0259\u0248\u027f\u0250\u025d\u024f\u024f\u0200\u0202\u0214\u0215\u0270\u0256\u025d\u024a\u025d\u0213\u0250\u025d\u0252\u025b\u0213\u027f\u0250\u025d\u024f\u024f\u0207", "\u0503\u050a\u0518\u0503\u0528\u0504\u050f\u050e\u0557\u0555\u0543\u0542\u0522", "\u069f\u068b\u068f\u069b\u0696\u0689\u06c6\u06c4\u06d2\u06b6\u0690\u069b\u068c\u069b\u06d5\u0696\u069b\u0694\u069d\u06d5\u06b5\u0698\u0690\u069f\u0699\u068e\u06c1\u06d3\u06a0", "\u00f7\u00f8\u00fb\u00fa\u00f1\u00a8\u00aa\u00bc\u00bd\u00d8\u00fe\u00f5\u00e2\u00f5\u00bb\u00f8\u00f5\u00fa\u00f3\u00bb\u00db\u00f6\u00fe\u00f1\u00f7\u00e0\u00af", "\u044a\u0451\u046d\u044a\u044c\u0457\u0450\u0459\u0402\u0400\u0416\u0417\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405", "\u07f2\u07f3\u07e8\u07f5\u07fa\u07e5\u07a0\u07a2\u07b4\u07b5\u07ca", "\u0207\u0206\u021d\u0200\u020f\u0210\u0228\u0205\u0205\u0255\u0257\u0241\u0240\u023f", "\u036b\u037d\u0375\u0368\u0320\u0322\u0334\u0335\u034a", "\u0443\u0455\u045d\u0440\u0408\u040a\u041c\u047e\u041d\u0462", "\u06f2\u06e4\u06ec\u06f1\u06b5\u06b9\u06bb\u06ad\u06cf\u06ac\u06d3", "\u04d3\u04c5\u04cd\u04d0\u0498\u049a\u048c\u04ee\u04ed\u048d\u04f2", "\u056f\u0560\u0567\u0568\u0565\u0560\u0573\u056c\u0535\u0537\u0521\u0520\u055f"})
public final class Class1430 {
    public static double field5474 = Double.longBitsToDouble(4604756956151655560L);
    public static float field5475 = 0.96850866f;

    /*
     * WARNING - void declaration
     */
    private static CallSite F1dAd6N8acSNCW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1430.RQSb9ue2gwQQvkuj(k2, 2007189264));
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
                int a2 = Integer.parseInt(Class1430.RQSb9ue2gwQQvkuj(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1430.RQSb9ue2gwQQvkuj(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1430.RQSb9ue2gwQQvkuj(k2, 2007189264) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String RQSb9ue2gwQQvkuj(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

