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
@HACHIMI_CLIENT(mv=100, d1={"\u415d\u415e\u415d\u4157\u415e\u4156\u415c\u415e", "\u405f\u4058\u405f\u4054\u405c\u4054\u4054\u405d", "\u2d94\u2d96\u2d90\u2d91\u2d91\u2d9f\u2d90\u2d93", "\u8168\u816b\u8166\u816a\u816d\u8168\u816e\u816d", "\u8c6f\u8c63\u8c6d\u8c62\u8c6f\u8c6b\u8c6b\u8c6b", "\ub56d\ub56d\ub56d\ub56d\ub56b\ub56d\ub56c\ub560", "\ua0b2\ua0b7\ua0b6\ua0b2\ua0b0\ua0b7\ua0b7\ua0b1", "\u5308\u530c\u5309\u530b\u5305\u530a\u530e\u5309", "\ub658\ub65d\ub65b\ub65a\ub65d\ub65c\ub658\ub65c", "\u1d28\u1d25\u1d2a\u1d2e\u1d2d\u1d2b\u1d28\u1d28", "\u2418\u2412\u241f\u2413\u241c\u241c\u241b\u2412", "\u8558\u855f\u855e\u855a\u855c\u855d\u855e\u8553", "\ubc76\ubc74\ubc76\ubc72\ubc70\ubc74\ubc72\ubc7c", "\u6fa8\u6fa8\u6faf\u6faf\u6fa4\u6fa5\u6fa4\u6fac", "\uac17\uac14\uac10\uac12\uac14\uac11\uac13\uac15"}, d2={"\u0004\b\u001f\u207fMOY=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016JX=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016J", "\u0367\u0338\u0337\u0332\u0335\u0332\u032f\u0365\u0367\u0365\u0373\u0372\u030d", "\u0360\u0335\u0332\u0335\u0328\u0362\u0360\u0362\u0374\u0375\u030a", "\u07ff\u07fd\u07ec\u07db\u07f4\u07f9\u07eb\u07eb\u07a4\u07a6\u07b0\u07b1\u07d4\u07f2\u07f9\u07ee\u07f9\u07b7\u07f4\u07f9\u07f6\u07ff\u07b7\u07db\u07f4\u07f9\u07eb\u07eb\u07a3", "\u03aa\u03a3\u03b1\u03aa\u0381\u03ad\u03a6\u03a7\u03fe\u03fc\u03ea\u03eb\u038b", "\u0082\u0096\u0092\u0086\u008b\u0094\u00db\u00d9\u00cf\u00ab\u008d\u0086\u0091\u0086\u00c8\u008b\u0086\u0089\u0080\u00c8\u00a8\u0085\u008d\u0082\u0084\u0093\u00dc\u00ce\u00bd", "\u010e\u0101\u0102\u0103\u0108\u0151\u0153\u0145\u0144\u0121\u0107\u010c\u011b\u010c\u0142\u0101\u010c\u0103\u010a\u0142\u0122\u010f\u0107\u0108\u010e\u0119\u0156", "\u02ad\u02b6\u028a\u02ad\u02ab\u02b0\u02b7\u02be\u02e5\u02e7\u02f1\u02f0\u0295\u02b3\u02b8\u02af\u02b8\u02f6\u02b5\u02b8\u02b7\u02be\u02f6\u028a\u02ad\u02ab\u02b0\u02b7\u02be\u02e2", "\u053d\u053c\u0527\u053a\u0535\u052a\u056f\u056d\u057b\u057a\u0505", "\u047b\u047a\u0461\u047c\u0473\u046c\u0454\u0479\u0479\u0429\u042b\u043d\u043c\u0443", "\u0423\u0435\u043d\u0420\u0468\u046a\u047c\u047d\u0402", "\u028b\u029d\u0295\u0288\u02c0\u02c2\u02d4\u02b6\u02d5\u02aa", "\u0301\u0317\u031f\u0302\u0346\u034a\u0348\u035e\u033c\u035f\u0320", "\u03d4\u03c2\u03ca\u03d7\u039f\u039d\u038b\u03e9\u03ea\u038a\u03f5", "\u01ef\u01e0\u01e7\u01e8\u01e5\u01e0\u01f3\u01ec\u01b5\u01b7\u01a1\u01a0\u01df"})
public final class Class1117 {
    public static float field4506;
    public static float field4507 = 0.11934161f;
    public static double field4508;

    /*
     * WARNING - void declaration
     */
    private static CallSite 237I07UyFezDcH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1117.fAmfqw64aDZ70jKm(k2, 70334304));
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
                int a2 = Integer.parseInt(Class1117.fAmfqw64aDZ70jKm(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1117.fAmfqw64aDZ70jKm(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1117.fAmfqw64aDZ70jKm(k2, 70334304) + " " + l2 + " " + m2);
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
        R\u200e = "Removes the slowdown effect caused by walking over SoulSand blocks";
        field4506 = Float.intBitsToFloat(1060961292);
        field4508 = Double.longBitsToDouble(4602661936719206982L);
    }

    private static String fAmfqw64aDZ70jKm(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

