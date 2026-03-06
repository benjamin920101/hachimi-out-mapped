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

@HACHIMI_CLIENT(mv=100, d1={"\u3af7\u3af7\u3af5\u3af7\u3af4\u3af5\u3af0", "\u5e1a\u5e1e\u5e18\u5e15\u5e15\u5e18\u5e1c\u5e1d", "\u123b\u123b\u123b\u123d\u123e\u123d\u123b\u123e", "\u9c14\u9c14\u9c12\u9c11\u9c19\u9c19\u9c17\u9c14", "\ue39c\ue39b\ue39a\ue396\ue397\ue39f\ue39c\ue39b", "\u8f77\u8f73\u8f72\u8f70\u8f77\u8f7f\u8f72\u8f77", "\u1db2\u1db0\u1dbe\u1db1\u1dbe\u1dbf\u1db7\u1db1", "\ue715\ue715\ue714\ue715\ue719\ue713\ue715\ue719", "\u109f\u1091\u1091\u109c\u109b\u1098\u109c\u109e", "\u84e0\u84e4\u84e0\u84e2\u84e5\u84e5\u84eb\u84e6", "\uc7aa\uc7aa\uc7a6\uc7a7\uc7a9\uc7ab\uc7ac\uc7ad", "\ub825\ub825\ub820\ub820\ub828\ub822\ub821\ub820", "\u21d0\u21d3\u21d4\u21d2\u21d5\u21dc\u21d7\u21dd", "\ua8cd\ua8cb\ua8cb\ua8c9\ua8c0\ua8cf\ua8c8\ua8ca"}, d2={"\u0089\u00d6\u00d9\u00dc\u00db\u00dc\u00c1\u008b\u0089\u008b\u009d\u009c\u00e3", "\u0751\u0704\u0703\u0704\u0719\u0753\u0751\u0753\u0745\u0744\u073b", "\u051e\u051c\u050d\u053a\u0515\u0518\u050a\u050a\u0545\u0547\u0551\u0550\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u053a\u0515\u0518\u050a\u050a\u0542", "\u01c0\u01c9\u01db\u01c0\u01eb\u01c7\u01cc\u01cd\u0194\u0196\u0180\u0181\u01e1", "\u02cf\u02db\u02df\u02cb\u02c6\u02d9\u0296\u0294\u0282\u02e6\u02c0\u02cb\u02dc\u02cb\u0285\u02c6\u02cb\u02c4\u02cd\u0285\u02e5\u02c8\u02c0\u02cf\u02c9\u02de\u0291\u0283\u02f0", "\u07f6\u07f9\u07fa\u07fb\u07f0\u07a9\u07ab\u07bd\u07bc\u07d9\u07ff\u07f4\u07e3\u07f4\u07ba\u07f9\u07f4\u07fb\u07f2\u07ba\u07da\u07f7\u07ff\u07f0\u07f6\u07e1\u07ae", "+0\f+-618cawv\u00135>)>p3>18p\f+-618d", "\u0689\u0688\u0693\u068e\u0681\u069e\u06db\u06d9\u06cf\u06ce\u06b1", "\u056f\u056e\u0575\u0568\u0567\u0578\u0540\u056d\u056d\u053d\u053f\u0529\u0528\u0557", "\u00a7\u00b1\u00b9\u00a4\u00ec\u00ee\u00f8\u00f9\u0086", "\u06bd\u06ab\u06a3\u06be\u06f6\u06f4\u06e2\u0680\u06e3\u069c", "\u0145\u0153\u015b\u0146\u0102\u010e\u010c\u011a\u0178\u011b\u0164", "\u04a3\u04b5\u04bd\u04a0\u04e8\u04ea\u04fc\u049e\u049d\u04fd\u0482", "\u0435\u043a\u043d\u0432\u043f\u043a\u0429\u0436\u046f\u046d\u047b\u047a\u0405"})
public final class Class1693 {
    public static float field6276 = Float.intBitsToFloat(1052623094);
    public static float field6277 = Float.intBitsToFloat(1059722030);

    /*
     * WARNING - void declaration
     */
    private static CallSite uFOHMl4vnCIKzh(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1693.SZkZB3R9LzzaLNLT(k2, 677635480));
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
                int a2 = Integer.parseInt(Class1693.SZkZB3R9LzzaLNLT(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1693.SZkZB3R9LzzaLNLT(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1693.SZkZB3R9LzzaLNLT(k2, 677635480) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String SZkZB3R9LzzaLNLT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

