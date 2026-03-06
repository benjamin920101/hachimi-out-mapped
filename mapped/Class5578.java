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
@HACHIMI_CLIENT(mv=100, d1={"\uda8f\uda85\uda88\uda85\uda8e\uda85\uda8d\uda8d", "\ue6f2\ue6f5\ue6f4\ue6f2\ue6f9\ue6f3\ue6f3", "\u8256\u8250\u8257\u8257\u825e\u8250\u825e", "\u2d34\u2d3d\u2d39\u2d35\u2d35\u2d35", "\u9a32\u9a37\u9a36\u9a36\u9a3d\u9a30\u9a34\u9a31", "\u91db\u91db\u91d8\u91d8\u91dd\u91db\u91d7\u91d8", "\uccff\uccfd\uccf8\uccfd\uccff\uccfa\uccfc\uccf8", "\uc226\uc225\uc223\uc223\uc224\uc22c\uc22d\uc226", "\ucd18\ucd1d\ucd1c\ucd11\ucd1d\ucd1d\ucd1b\ucd10", "\u54ec\u54ee\u54e8\u54ef\u54e9\u54ef\u54ea\u54ee", "\u3c81\u3c88\u3c82\u3c83\u3c89\u3c89\u3c87\u3c88", "\ue3b1\ue3b5\ue3b6\ue3b4\ue3b2\ue3b2\ue3b1\ue3ba", "\u9e39\u9e34\u9e3d\u9e3c\u9e34\u9e39\u9e3f\u9e39", "\u00e8\u00ed\u00eb\u00e8\u00e5\u00ea\u00eb\u00eb", "\u7dac\u7da8\u7da5\u7dac\u7da9\u7daa\u7dab\u7daf", "\u239f\u2394\u2398\u239e\u239f\u239f\u2395\u239b", "\u26cf\u26c5\u26c5\u26cb\u26ce\u26cb\u26ce\u26cb"}, d2={"\u0319\u031c\u0328\u2364\u0356\u0354\u0342\u0326\u0300\u030b\u031c\u030b\u0345\u0306\u030b\u0304\u030d\u0345\u0339\u031e\u0318\u0303\u0304\u030d\u0351\u0343\u0326\u0300\u030b\u031c\u030b\u0345\u0306\u030b\u0304\u030d\u0345\u0339\u031e\u0318\u0303\u0304\u030d\u0351", "\u045c\u0459\u046c\u2421\u0413\u0411\u0407\u0463\u0445\u044e\u0459\u044e\u0400\u0443\u044e\u0441\u0448\u0400\u047c\u045b\u045d\u0446\u0441\u0448\u0414\u0406\u0463\u0445\u044e\u0459\u044e\u0400\u0443\u044e\u0441\u0448\u0400\u047c\u045b\u045d\u0446\u0441\u0448\u0414", "\u03aa\u03af\u039d\u23d7\u03e5\u03e7\u03f1\u0395\u03b3\u03b8\u03af\u03b8\u03f6\u03b5\u03b8\u03b7\u03be\u03f6\u038a\u03ad\u03ab\u03b0\u03b7\u03be\u03e2\u03f0\u0395\u03b3\u03b8\u03af\u03b8\u03f6\u03b5\u03b8\u03b7\u03be\u03f6\u038a\u03ad\u03ab\u03b0\u03b7\u03be\u03e2", "\u06b7\u06e8\u06e7\u06e2\u06e5\u06e2\u06ff\u06b5\u06b7\u06b5\u06a3\u06a2\u06dd", "\u046f\u043a\u043d\u043a\u0427\u046d\u046f\u046d\u047b\u047a\u0405", "\u07e9\u07eb\u07fa\u07cd\u07e2\u07ef\u07fd\u07fd\u07b2\u07b0\u07a6\u07a7\u07c2\u07e4\u07ef\u07f8\u07ef\u07a1\u07e2\u07ef\u07e0\u07e9\u07a1\u07cd\u07e2\u07ef\u07fd\u07fd\u07b5", "\u07bd\u07b4\u07a6\u07bd\u0796\u07ba\u07b1\u07b0\u07e9\u07eb\u07fd\u07fc\u079c", "\u07d9\u07cd\u07c9\u07dd\u07d0\u07cf\u0780\u0782\u0794\u07f0\u07d6\u07dd\u07ca\u07dd\u0793\u07d0\u07dd\u07d2\u07db\u0793\u07f3\u07de\u07d6\u07d9\u07df\u07c8\u0787\u0795\u07e6", "\u040d\u0402\u0401\u0400\u040b\u0452\u0450\u0446\u0447\u0422\u0404\u040f\u0418\u040f\u0441\u0402\u040f\u0400\u0409\u0441\u0421\u040c\u0404\u040b\u040d\u041a\u0455", "\u0113\u0108\u0134\u0113\u0115\u010e\u0109\u0100\u015b\u0159\u014f\u014e\u012b\u010d\u0106\u0111\u0106\u0148\u010b\u0106\u0109\u0100\u0148\u0134\u0113\u0115\u010e\u0109\u0100\u015c", "\u04d7\u04d6\u04cd\u04d0\u04df\u04c0\u0485\u0487\u0491\u0490\u04ef", "\u001a\u001b\u0000\u001d\u0012\r5\u0018\u0018HJ\\]\"", "\u052e\u0538\u0530\u052d\u0565\u0567\u0571\u0570\u050f", "\u02c5\u02d3\u02db\u02c6\u028e\u028c\u029a\u02f8\u029b\u02e4", "\u039f\u0389\u0381\u039c\u03d8\u03d4\u03d6\u03c0\u03a2\u03c1\u03be", "\u0507\u0511\u0519\u0504\u054c\u054e\u0558\u053a\u0539\u0559\u0526", "DKLCNKXG\u001e\u001c\n\u000bt"})
public final class Class5578 {
    public static float field10594 = Float.intBitsToFloat(1064082648);
    public static float field10595 = 0.59429234f;
    public static float field10596 = Float.intBitsToFloat(1043693848);
    public static float field10597;

    private static String MODgRbifw2GTGalM(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 27jr97ZaWVkB1B(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5578.MODgRbifw2GTGalM(k2, 527014377));
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
                int a2 = Integer.parseInt(Class5578.MODgRbifw2GTGalM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5578.MODgRbifw2GTGalM(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5578.MODgRbifw2GTGalM(k2, 527014377) + " " + l2 + " " + m2);
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
        u\u200e = "Verdana";
        field10597 = Float.intBitsToFloat(1100480512);
        aZ\u200e = "Correct your throw angle";
        ca\u200e = "Grim";
    }
}

