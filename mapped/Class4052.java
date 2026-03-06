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
@HACHIMI_CLIENT(mv=100, d1={"\u2dd8\u2dde\u2dd5\u2dd8\u2ddc\u2ddf\u2dd5\u2dd8", "\uab3f\uab35\uab3b\uab3e\uab3c\uab3c\uab39\uab34", "\ue260\ue261\ue262\ue265\ue26d\ue264\ue260\ue261", "\ucaa0\ucaa2\ucaa0\ucaa7\ucaa7\ucaa0\ucaa3\ucaa6", "\ube41\ube40\ube43\ube46\ube4b\ube4b\ube45\ube45", "\u7f31\u7f37\u7f35\u7f37\u7f35\u7f37\u7f35\u7f37", "\ud732\ud731\ud737\ud734\ud73f\ud731\ud735\ud730", "\uaa78\uaa71\uaa7e\uaa7d\uaa7d\uaa7d\uaa70\uaa78", "\u1a2f\u1a28\u1a22\u1a29\u1a29\u1a2d\u1a2e\u1a2b", "\u1fb9\u1fb9\u1fb9\u1fb4\u1fba\u1fbc\u1fb8\u1fbb", "\u61aa\u61ad\u61a0\u61a9\u61ab\u61a9\u61ae\u61ad", "\u5207\u5201\u5206\u5206\u5201\u5204\u5205\u5203", "\uc7e6\uc7ef\uc7eb\uc7ee\uc7e7\uc7ef\uc7e6", "\u8a65\u8a65\u8a69\u8a65\u8a69\u8a64\u8a63\u8a61", "\u23c1\u23c0\u23c1\u23c0\u23c5\u23c7\u23c0\u23c0", "\u7d1d\u7d10\u7d1d\u7d19\u7d1d\u7d1e\u7d10\u7d1d"}, d2={"\u0325\u030e\u032d\u2346\u0374\u0376\u0360\u0304\u0322\u0329\u033e\u0329\u0367\u0324\u0329\u0326\u032f\u0367\u031b\u033c\u033a\u0321\u0326\u032f\u0373\u0361\u0304\u0322\u0329\u033e\u0329\u0367\u0324\u0329\u0326\u032f\u0367\u031b\u033c\u033a\u0321\u0326\u032f\u0373", "\u0085\u00ae\u008e\u20e6\u00d4\u00d6\u00c0\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00bb\u009c\u009a\u0081\u0086\u008f\u00d3\u00c1\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00bb\u009c\u009a\u0081\u0086\u008f\u00d3", "\u0342\u031d\u0312\u0317\u0310\u0317\u030a\u0340\u0342\u0340\u0356\u0357\u0328", "\u0123\u0176\u0171\u0176\u016b\u0121\u0123\u0121\u0137\u0136\u0149", "\u04d1\u04d3\u04c2\u04f5\u04da\u04d7\u04c5\u04c5\u048a\u0488\u049e\u049f\u04fa\u04dc\u04d7\u04c0\u04d7\u0499\u04da\u04d7\u04d8\u04d1\u0499\u04f5\u04da\u04d7\u04c5\u04c5\u048d", "\u0424\u042d\u043f\u0424\u040f\u0423\u0428\u0429\u0470\u0472\u0464\u0465\u0405", "\u0331\u0325\u0321\u0335\u0338\u0327\u0368\u036a\u037c\u0318\u033e\u0335\u0322\u0335\u037b\u0338\u0335\u033a\u0333\u037b\u031b\u0336\u033e\u0331\u0337\u0320\u036f\u037d\u030e", "\u047b\u0474\u0477\u0476\u047d\u0424\u0426\u0430\u0431\u0454\u0472\u0479\u046e\u0479\u0437\u0474\u0479\u0476\u047f\u0437\u0457\u047a\u0472\u047d\u047b\u046c\u0423", "\u0255\u024e\u0272\u0255\u0253\u0248\u024f\u0246\u021d\u021f\u0209\u0208\u026d\u024b\u0240\u0257\u0240\u020e\u024d\u0240\u024f\u0246\u020e\u0272\u0255\u0253\u0248\u024f\u0246\u021a", "\u03d5\u03d4\u03cf\u03d2\u03dd\u03c2\u0387\u0385\u0393\u0392\u03ed", "\u0458\u0459\u0442\u045f\u0450\u044f\u0477\u045a\u045a\u040a\u0408\u041e\u041f\u0460", "\u0139\u012f\u0127\u013a\u0172\u0170\u0166\u0167\u0118", "\u071e\u0708\u0700\u071d\u0755\u0757\u0741\u0723\u0740\u073f", "\u020f\u0219\u0211\u020c\u0248\u0244\u0246\u0250\u0232\u0251\u022e", "\u070f\u0719\u0711\u070c\u0744\u0746\u0750\u0732\u0731\u0751\u072e", "\u0789\u0786\u0781\u078e\u0783\u0786\u0795\u078a\u07d3\u07d1\u07c7\u07c6\u07b9"})
public final class Class4052 {
    public static double field9350 = 0.7431430808904431;
    public static float field9351 = 0.3636784f;
    public static double field9352;

    /*
     * WARNING - void declaration
     */
    private static CallSite 7LtfvSl6jnwcSN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4052.etlT8y3wKQAlt16e(k2, 1166828508));
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
                int a2 = Integer.parseInt(Class4052.etlT8y3wKQAlt16e(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4052.etlT8y3wKQAlt16e(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4052.etlT8y3wKQAlt16e(k2, 1166828508) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String etlT8y3wKQAlt16e(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        c\u200e = "create/del/load";
        field9352 = Double.longBitsToDouble(4603080004397068363L);
        ay\u200e = "Sync bow release to server ticks";
    }
}

