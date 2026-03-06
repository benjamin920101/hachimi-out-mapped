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
@HACHIMI_CLIENT(mv=100, d1={"\u84bc\u84b9\u84b0\u84bc\u84ba\u84b1\u84bc\u84ba", "\u9f09\u9f0f\u9f0e\u9f0e\u9f01\u9f0e\u9f0b\u9f0a", "\u0a43\u0a42\u0a45\u0a42\u0a40\u0a47\u0a49\u0a44", "\u5db5\u5db2\u5db7\u5db4\u5db0\u5dbf\u5dbf\u5db4", "\u3414\u3411\u3416\u3416\u3413\u3417\u3417\u3413", "\ua347\ua342\ua344\ua342\ua347\ua345\ua341\ua347", "\u17f1\u17f1\u17f6\u17f4\u17f3\u17f1\u17fc\u17f6", "\u1f50\u1f56\u1f53\u1f5b\u1f54\u1f52\u1f53\u1f5b", "\u2656\u2656\u265e\u2655\u2656\u2655\u2654\u2656", "\ue25b\ue25c\ue25e\ue25b\ue25f\ue25c\ue25c\ue259", "\u4ef5\u4ef7\u4ef7\u4ef6\u4efe\u4eff\u4ef4\u4ef6", "\ue584\ue583\ue580\ue586\ue580\ue580\ue586\ue587", "\u32a9\u32a4\u32a8\u32ab\u32a9\u32ae\u32a5\u32ac", "\u280e\u280b\u280c\u280b\u280c\u2809\u280d\u280d", "\ua495\ua492\ua494\ua495\ua496\ua492\ua49b", "\u13df\u13d6\u13db\u13d6\u13d8\u13d6\u13d6\u13d8", "\u8432\u8438\u8439\u8432\u8435\u8432\u8438", "\udaa8\udaa9\udaad\udaaa\udaaa\udaaa\udaa3\udaab", "\u7325\u7328\u7326\u7324\u7328\u7324\u7324\u7323"}, d2={"\u05e3\u05e4\u05cd\u2599\u05ab\u05a9\u05bf\u05db\u05fd\u05f6\u05e1\u05f6\u05b8\u05fb\u05f6\u05f9\u05f0\u05b8\u05c4\u05e3\u05e5\u05fe\u05f9\u05f0\u05ac\u05be\u05db\u05fd\u05f6\u05e1\u05f6\u05b8\u05fb\u05f6\u05f9\u05f0\u05b8\u05c4\u05e3\u05e5\u05fe\u05f9\u05f0\u05ac", "\u01d2\u01d2\u01c7\u21a8\u019a\u0198\u018e\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d\u018f\u01ea\u01cc\u01c7\u01d0\u01c7\u0189\u01ca\u01c7\u01c8\u01c1\u0189\u01f5\u01d2\u01d4\u01cf\u01c8\u01c1\u019d", "\u022d\u022d\u023b\u2257\u0265\u0267\u0271\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u020a\u022d\u022b\u0230\u0237\u023e\u0262\u0270\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u020a\u022d\u022b\u0230\u0237\u023e\u0262", "\u00e4\u00e4\u00f3\u209e\u00ac\u00ae\u00b8\u00dc\u00fa\u00f1\u00e6\u00f1\u00bf\u00fc\u00f1\u00fe\u00f7\u00bf\u00c3\u00e4\u00e2\u00f9\u00fe\u00f7\u00ab\u00b9\u00dc\u00fa\u00f1\u00e6\u00f1\u00bf\u00fc\u00f1\u00fe\u00f7\u00bf\u00c3\u00e4\u00e2\u00f9\u00fe\u00f7\u00ab", "\u009f\u009f\u008f\u20e5\u00d7\u00d5\u00c3\u00a7\u0081\u008a\u009d\u008a\u00c4\u0087\u008a\u0085\u008c\u00c4\u00b8\u009f\u0099\u0082\u0085\u008c\u00d0\u00c2\u00a7\u0081\u008a\u009d\u008a\u00c4\u0087\u008a\u0085\u008c\u00c4\u00b8\u009f\u0099\u0082\u0085\u008c\u00d0", "!~qtsti#!#54K", "\u0734\u0761\u0766\u0761\u077c\u0736\u0734\u0736\u0720\u0721\u075e", "\u07c5\u07c7\u07d6\u07e1\u07ce\u07c3\u07d1\u07d1\u079e\u079c\u078a\u078b\u07ee\u07c8\u07c3\u07d4\u07c3\u078d\u07ce\u07c3\u07cc\u07c5\u078d\u07e1\u07ce\u07c3\u07d1\u07d1\u0799", "\u048e\u0487\u0495\u048e\u04a5\u0489\u0482\u0483\u04da\u04d8\u04ce\u04cf\u04af", "\u0467\u0473\u0477\u0463\u046e\u0471\u043e\u043c\u042a\u044e\u0468\u0463\u0474\u0463\u042d\u046e\u0463\u046c\u0465\u042d\u044d\u0460\u0468\u0467\u0461\u0476\u0439\u042b\u0458", "\u04a0\u04af\u04ac\u04ad\u04a6\u04ff\u04fd\u04eb\u04ea\u048f\u04a9\u04a2\u04b5\u04a2\u04ec\u04af\u04a2\u04ad\u04a4\u04ec\u048c\u04a1\u04a9\u04a6\u04a0\u04b7\u04f8", "\u00ee\u00f5\u00c9\u00ee\u00e8\u00f3\u00f4\u00fd\u00a6\u00a4\u00b2\u00b3\u00d6\u00f0\u00fb\u00ec\u00fb\u00b5\u00f6\u00fb\u00f4\u00fd\u00b5\u00c9\u00ee\u00e8\u00f3\u00f4\u00fd\u00a1", "\u0465\u0464\u047f\u0462\u046d\u0472\u0437\u0435\u0423\u0422\u045d", "\u0520\u0521\u053a\u0527\u0528\u0537\u050f\u0522\u0522\u0572\u0570\u0566\u0567\u0518", "\u053b\u052d\u0525\u0538\u0570\u0572\u0564\u0565\u051a", "\u0557\u0541\u0549\u0554\u051c\u051e\u0508\u056a\u0509\u0576", "\u0391\u0387\u038f\u0392\u03d6\u03da\u03d8\u03ce\u03ac\u03cf\u03b0", "\u03e5\u03f3\u03fb\u03e6\u03ae\u03ac\u03ba\u03d8\u03db\u03bb\u03c4", "\u0341\u034e\u0349\u0346\u034b\u034e\u035d\u0342\u031b\u0319\u030f\u030e\u0371"})
public final class Class1611 {
    public static double field6021 = 0.6790753825739331;
    public static float field6022;
    public static float field6023 = 0.5169271f;
    public static double field6024;

    static {
        J\u200e = "Log";
        field6022 = Float.intBitsToFloat(1048869498);
        aF\u200e = "Silent";
        aJ\u200e = "AutoClip";
        field6024 = Double.longBitsToDouble(4601804225243008116L);
        aX\u200e = "m";
        bw\u200e = "How fast you hit the entity";
    }

    private static String 6Erl2BtyFFHOOKEl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite BWYJnYLhd3sKda(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1611.6Erl2BtyFFHOOKEl(k2, 1059685163));
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
                int a2 = Integer.parseInt(Class1611.6Erl2BtyFFHOOKEl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1611.6Erl2BtyFFHOOKEl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1611.6Erl2BtyFFHOOKEl(k2, 1059685163) + " " + l2 + " " + m2);
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

