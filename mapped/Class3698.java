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
@HACHIMI_CLIENT(mv=100, d1={"\u1f5e\u1f59\u1f5c\u1f5e\u1f5d\u1f55\u1f54\u1f58", "\u5940\u5941\u594b\u5944\u5946\u594a\u5943\u5940", "\u82d4\u82d3\u82d4\u82d2\u82d6\u82d1\u82d0\u82d3", "\ue49e\ue49e\ue49f\ue49f\ue49d\ue49e\ue49f\ue492", "\u52e2\u52eb\u52e7\u52eb\u52e0\u52eb\u52e4\u52e0", "\u3ca0\u3cac\u3ca5\u3ca7\u3ca3\u3ca1\u3ca2\u3ca0", "\u36f4\u36f5\u36f6\u36f6\u36f2\u36f5\u36f3\u36f1", "\u3792\u3795\u3799\u3794\u3794\u3791\u3799\u3797", "\ue0f8\ue0fa\ue0fb\ue0f3\ue0fd\ue0fc\ue0ff\ue0ff", "\u14eb\u14eb\u14ec\u14e8\u14ea\u14ec\u14ef\u14e7", "\u882f\u8820\u882d\u8828\u8821\u882e\u882d\u882f", "\u379b\u379b\u3792\u379a\u379c\u379f\u3799\u379c", "\uad9f\uad9c\uad9d\uad9d\uad95\uad98\uad9f\uad98", "\ue328\ue32c\ue32f\ue32c\ue32b\ue32a\ue32a\ue329", "\u1e56\u1e59\u1e51\u1e56\u1e53\u1e58\u1e58", "\ud8f5\ud8f5\ud8f0\ud8f7\ud8f1\ud8f7\ud8f0\ud8f1"}, d2={"\u0758\u0748\u074c\u2733\u0701\u0703\u0715\u0771\u0757\u075c\u074b\u075c\u0712\u0751\u075c\u0753\u075a\u0712\u076e\u0749\u074f\u0754\u0753\u075a\u0706\u0714\u0771\u0757\u075c\u074b\u075c\u0712\u0751\u075c\u0753\u075a\u0712\u076e\u0749\u074f\u0754\u0753\u075a\u0706", "\u00ab\u00bb\u00bc\u20c0\u00f2\u00f0\u00e6\u0082\u00a4\u00af\u00b8\u00af\u00e1\u00a2\u00af\u00a0\u00a9\u00e1\u009d\u00ba\u00bc\u00a7\u00a0\u00a9\u00f5\u00e7\u0082\u00a4\u00af\u00b8\u00af\u00e1\u00a2\u00af\u00a0\u00a9\u00e1\u009d\u00ba\u00bc\u00a7\u00a0\u00a9\u00f5", "\u0485\u04da\u04d5\u04d0\u04d7\u04d0\u04cd\u0487\u0485\u0487\u0491\u0490\u04ef", "\u04c7\u0492\u0495\u0492\u048f\u04c5\u04c7\u04c5\u04d3\u04d2\u04ad", "\u07d1\u07d3\u07c2\u07f5\u07da\u07d7\u07c5\u07c5\u078a\u0788\u079e\u079f\u07fa\u07dc\u07d7\u07c0\u07d7\u0799\u07da\u07d7\u07d8\u07d1\u0799\u07f5\u07da\u07d7\u07c5\u07c5\u078d", "\u053c\u0535\u0527\u053c\u0517\u053b\u0530\u0531\u0568\u056a\u057c\u057d\u051d", "\u02d9\u02cd\u02c9\u02dd\u02d0\u02cf\u0280\u0282\u0294\u02f0\u02d6\u02dd\u02ca\u02dd\u0293\u02d0\u02dd\u02d2\u02db\u0293\u02f3\u02de\u02d6\u02d9\u02df\u02c8\u0287\u0295\u02e6", "\u06ff\u06f0\u06f3\u06f2\u06f9\u06a0\u06a2\u06b4\u06b5\u06d0\u06f6\u06fd\u06ea\u06fd\u06b3\u06f0\u06fd\u06f2\u06fb\u06b3\u06d3\u06fe\u06f6\u06f9\u06ff\u06e8\u06a7", "\u0099\u0082\u00be\u0099\u009f\u0084\u0083\u008a\u00d1\u00d3\u00c5\u00c4\u00a1\u0087\u008c\u009b\u008c\u00c2\u0081\u008c\u0083\u008a\u00c2\u00be\u0099\u009f\u0084\u0083\u008a\u00d6", "\u026b\u026a\u0271\u026c\u0263\u027c\u0239\u023b\u022d\u022c\u0253", "\u0731\u0730\u072b\u0736\u0739\u0726\u071e\u0733\u0733\u0763\u0761\u0777\u0776\u0709", "\u06f7\u06e1\u06e9\u06f4\u06bc\u06be\u06a8\u06a9\u06d6", "}kc~64\"@#\\", "\u066a\u067c\u0674\u0669\u062d\u0621\u0623\u0635\u0657\u0634\u064b", "\u0083\u0095\u009d\u0080\u00c8\u00ca\u00dc\u00be\u00bd\u00dd\u00a2", "\u0463\u046c\u046b\u0464\u0469\u046c\u047f\u0460\u0439\u043b\u042d\u042c\u0453"})
public final class Class3698 {
    public static double field8312;
    public static double field8313;
    public static double field8314;
    public static long field8315 = -4622182373769394905L;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 29WNCIlAegl1W1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3698.Wn7h8wKCjLUGt5s6(k2, -1909493257));
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
                int a2 = Integer.parseInt(Class3698.Wn7h8wKCjLUGt5s6(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3698.Wn7h8wKCjLUGt5s6(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 28354 : 28355;
        block7: while (true) {
            switch (n3) {
                case 28355: {
                    n3 = 28353;
                    continue block7;
                }
                case 28354: {
                    throw new Exception("Can't find method in " + Class3698.Wn7h8wKCjLUGt5s6(k2, -1909493257) + " " + l2 + " " + m2);
                }
            }
            break;
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
        e\u200e = "The render color for items";
        field8313 = Double.longBitsToDouble(4604376474184217684L);
        K\u200e = "HandSwing - hand: %s";
        field8314 = Double.longBitsToDouble(4610685218510194460L);
        field8312 = Double.longBitsToDouble(4606406803820056688L);
    }

    private static String Wn7h8wKCjLUGt5s6(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

