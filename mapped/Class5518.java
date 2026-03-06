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

@HACHIMI_CLIENT(mv=100, d1={"\ub40b\ub40f\ub409\ub40d\ub40f\ub40e\ub40f\ub40d", "\u2a47\u2a4f\u2a40\u2a40\u2a42\u2a40\u2a4e\u2a46", "\u4589\u458b\u458a\u458a\u4585\u458c\u458e\u4584", "\u78db\u78df\u78de\u78d9\u78df\u78dd\u78de\u78d9", "\u8a62\u8a6d\u8a67\u8a64\u8a64\u8a66\u8a64\u8a67", "\u8f12\u8f1e\u8f14\u8f11\u8f11\u8f1e\u8f17\u8f10", "\u7d3c\u7d32\u7d32\u7d3d\u7d33\u7d33\u7d3a\u7d38", "\u88a7\u88a2\u88a0\u88a5\u88a4\u88a6\u88a1\u88a2", "\u434a\u434a\u4346\u434b\u434e\u434c\u434f\u434d", "\ud353\ud352\ud351\ud354\ud351\ud352\ud352\ud352", "\u19a4\u19ae\u19ae\u19af\u19a7\u19a0\u19af\u19a3", "\u214c\u214d\u2148\u214f\u214a\u214c\u2149\u2147", "\uc029\uc02e\uc02f\uc029\uc02b\uc02f\uc02d\uc02a", "\ua939\ua93f\ua93a\ua93d\ua93d\ua93a\ua93c\ua93d", "\u520b\u5208\u5208\u520b\u520f\u520f\u520f\u520e", "\u1750\u1755\u175a\u1750\u1752\u1750\u1751\u1754"}, d2={"\u06e4\u06d1\u06c5\u269a\u06a8\u06aa\u06bc\u06d8\u06fe\u06f5\u06e2\u06f5\u06bb\u06f8\u06f5\u06fa\u06f3\u06bb\u06c7\u06e0\u06e6\u06fd\u06fa\u06f3\u06af\u06bd\u06d8\u06fe\u06f5\u06e2\u06f5\u06bb\u06f8\u06f5\u06fa\u06f3\u06bb\u06c7\u06e0\u06e6\u06fd\u06fa\u06f3\u06af", "\u04bb\u048e\u0499\u24c5\u04f7\u04f5\u04e3\u0487\u04a1\u04aa\u04bd\u04aa\u04e4\u04a7\u04aa\u04a5\u04ac\u04e4\u0498\u04bf\u04b9\u04a2\u04a5\u04ac\u04f0\u04e2\u0487\u04a1\u04aa\u04bd\u04aa\u04e4\u04a7\u04aa\u04a5\u04ac\u04e4\u0498\u04bf\u04b9\u04a2\u04a5\u04ac\u04f0", "\u0310\u034f\u0340\u0345\u0342\u0345\u0358\u0312\u0310\u0312\u0304\u0305\u037a", "\u02de\u028b\u028c\u028b\u0296\u02dc\u02de\u02dc\u02ca\u02cb\u02b4", "\u00b2\u00b0\u00a1\u0096\u00b9\u00b4\u00a6\u00a6\u00e9\u00eb\u00fd\u00fc\u0099\u00bf\u00b4\u00a3\u00b4\u00fa\u00b9\u00b4\u00bb\u00b2\u00fa\u0096\u00b9\u00b4\u00a6\u00a6\u00ee", "\u03ee\u03e7\u03f5\u03ee\u03c5\u03e9\u03e2\u03e3\u03ba\u03b8\u03ae\u03af\u03cf", "\u031e\u030a\u030e\u031a\u0317\u0308\u0347\u0345\u0353\u0337\u0311\u031a\u030d\u031a\u0354\u0317\u031a\u0315\u031c\u0354\u0334\u0319\u0311\u031e\u0318\u030f\u0340\u0352\u0321", "\u01ea\u01e5\u01e6\u01e7\u01ec\u01b5\u01b7\u01a1\u01a0\u01c5\u01e3\u01e8\u01ff\u01e8\u01a6\u01e5\u01e8\u01e7\u01ee\u01a6\u01c6\u01eb\u01e3\u01ec\u01ea\u01fd\u01b2", "0+\u001706-*#xzlm\b.%2%k(%*#k\u001706-*#\u007f", "\u0097\u0096\u008d\u0090\u009f\u0080\u00c5\u00c7\u00d1\u00d0\u00af", "\u04d3\u04d2\u04c9\u04d4\u04db\u04c4\u04fc\u04d1\u04d1\u0481\u0483\u0495\u0494\u04eb", "\u0786\u0790\u0798\u0785\u07cd\u07cf\u07d9\u07d8\u07a7", "\u01b9\u01af\u01a7\u01ba\u01f2\u01f0\u01e6\u0184\u01e7\u0198", "\u0152\u0144\u014c\u0151\u0115\u0119\u011b\u010d\u016f\u010c\u0173", "\u0536\u0520\u0528\u0535\u057d\u057f\u0569\u050b\u0508\u0568\u0517", "\u0333\u033c\u033b\u0334\u0339\u033c\u032f\u0330\u0369\u036b\u037d\u037c\u0303"})
public final class Class5518 {
    public static int field10423 = -274508905;
    public static float field10424;
    public static float field10425;
    public static float field10426;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite LugpN1QVSKa2uA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        Class<?> o2 = Class.forName(Class5518.LgCwlNid1WXn9mdV(k2, 1462608393));
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
                int a2 = Integer.parseInt(Class5518.LgCwlNid1WXn9mdV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5518.LgCwlNid1WXn9mdV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5518.LgCwlNid1WXn9mdV(k2, 1462608393) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 29432 : 29433;
        while (true) {
            MethodHandle v2;
            int n4;
            if ((n4 = n3) == 29432) {
                MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            if (n4 != 29433) {
                v2 = h2.findStatic(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            n3 = 29431;
        }
    }

    private static String LgCwlNid1WXn9mdV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10425 = Float.intBitsToFloat(1027052544);
        field10424 = Float.intBitsToFloat(1057465808);
        field10426 = Float.intBitsToFloat(1063704947);
        aJ\u200e = "texelSize";
        bw\u200e = "Totem";
    }
}

