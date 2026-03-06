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
@HACHIMI_CLIENT(mv=100, d1={"\ua8a5\ua8a6\ua8a2\ua8a2\ua8ad\ua8a6\ua8a0\ua8a4", "\u5028\u5025\u5024\u502f\u502f\u502e\u5025\u502f", "\u8d56\u8d53\u8d57\u8d54\u8d55\u8d57\u8d5e\u8d53", "\u334a\u3348\u334a\u334c\u334e\u3349\u334c\u334d", "\u7792\u7796\u7797\u7797\u7794\u7792\u779f\u7797", "\u524d\u524a\u524d\u524b\u5248\u524b\u524e\u5248", "\uc6c4\uc6c6\uc6c0\uc6c8\uc6c8\uc6c4\uc6c8\uc6c9", "\u3b73\u3b70\u3b78\u3b78\u3b70\u3b76\u3b71\u3b73", "\u4795\u479f\u4795\u4793\u479f\u4794\u4791\u4796", "\u6342\u6340\u6348\u6345\u6349\u6341\u6341\u6348", "\ub016\ub015\ub012\ub016\ub010\ub010\ub010\ub013", "\ua8ff\ua8fb\ua8ff\ua8fa\ua8fa\ua8fe\ua8ff\ua8f2", "\u2131\u2133\u2136\u2132\u2136\u2134\u2133\u2133", "\u92a3\u92a4\u92a5\u92ad\u92a1\u92a2\u92a3\u92a4", "\udb97\udb95\udb96\udb95\udb90\udb93\udb95\udb9c", "\u11be\u11bd\u11bd\u11bf\u11b8\u11ba\u11b2\u11b3", "\uaee0\uaee7\uaee6\uaee3\uaee4\uaee4\uaee3\uaeef"}, d2={"\u04e7\u04e0\u04e5\u2487\u04b5\u04b7\u04a1\u04c5\u04e3\u04e8\u04ff\u04e8\u04a6\u04e5\u04e8\u04e7\u04ee\u04a6\u04da\u04fd\u04fb\u04e0\u04e7\u04ee\u04b2\u04a0\u04c5\u04e3\u04e8\u04ff\u04e8\u04a6\u04e5\u04e8\u04e7\u04ee\u04a6\u04da\u04fd\u04fb\u04e0\u04e7\u04ee\u04b2", "\u0416\u0411\u0415\u2476\u0444\u0446\u0450\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u042b\u040c\u040a\u0411\u0416\u041f\u0443\u0451\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u042b\u040c\u040a\u0411\u0416\u041f\u0443", "\u0611\u0616\u0611\u2671\u0643\u0641\u0657\u0633\u0615\u061e\u0609\u061e\u0650\u0613\u061e\u0611\u0618\u0650\u062c\u060b\u060d\u0616\u0611\u0618\u0644\u0656\u0633\u0615\u061e\u0609\u061e\u0650\u0613\u061e\u0611\u0618\u0650\u062c\u060b\u060d\u0616\u0611\u0618\u0644", "r-\"' ':prpfg\u0018", "\u00c6\u0093\u0094\u0093\u008e\u00c4\u00c6\u00c4\u00d2\u00d3\u00ac", "\u039e\u039c\u038d\u03ba\u0395\u0398\u038a\u038a\u03c5\u03c7\u03d1\u03d0\u03b5\u0393\u0398\u038f\u0398\u03d6\u0395\u0398\u0397\u039e\u03d6\u03ba\u0395\u0398\u038a\u038a\u03c2", "T]OT\u007fSXY\u0000\u0002\u0014\u0015u", "\u07a1\u07b5\u07b1\u07a5\u07a8\u07b7\u07f8\u07fa\u07ec\u0788\u07ae\u07a5\u07b2\u07a5\u07eb\u07a8\u07a5\u07aa\u07a3\u07eb\u078b\u07a6\u07ae\u07a1\u07a7\u07b0\u07ff\u07ed\u079e", "\u02e3\u02ec\u02ef\u02ee\u02e5\u02bc\u02be\u02a8\u02a9\u02cc\u02ea\u02e1\u02f6\u02e1\u02af\u02ec\u02e1\u02ee\u02e7\u02af\u02cf\u02e2\u02ea\u02e5\u02e3\u02f4\u02bb", "\u03eb\u03f0\u03cc\u03eb\u03ed\u03f6\u03f1\u03f8\u03a3\u03a1\u03b7\u03b6\u03d3\u03f5\u03fe\u03e9\u03fe\u03b0\u03f3\u03fe\u03f1\u03f8\u03b0\u03cc\u03eb\u03ed\u03f6\u03f1\u03f8\u03a4", "\u0523\u0522\u0539\u0524\u052b\u0534\u0571\u0573\u0565\u0564\u051b", "\u03ec\u03ed\u03f6\u03eb\u03e4\u03fb\u03c3\u03ee\u03ee\u03be\u03bc\u03aa\u03ab\u03d4", "\u0642\u0654\u065c\u0641\u0609\u060b\u061d\u061c\u0663", "\u0726\u0730\u0738\u0725\u076d\u076f\u0779\u071b\u0778\u0707", "\u028d\u029b\u0293\u028e\u02ca\u02c6\u02c4\u02d2\u02b0\u02d3\u02ac", "\u01f9\u01ef\u01e7\u01fa\u01b2\u01b0\u01a6\u01c4\u01c7\u01a7\u01d8", "\u06fd\u06f2\u06f5\u06fa\u06f7\u06f2\u06e1\u06fe\u06a7\u06a5\u06b3\u06b2\u06cd"})
public final class Class5619 {
    public static float field10729 = 0.47210813f;
    public static double field10730 = Double.longBitsToDouble(4596495329526147712L);

    static {
        t\u200e = "DragItemMove";
        H\u200e = "ALL";
        am\u200e = "F3";
    }

    private static String nJWf3icnyDaEQetE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1AqPlF609REXKv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5619.nJWf3icnyDaEQetE(k2, -642953722));
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
                int a2 = Integer.parseInt(Class5619.nJWf3icnyDaEQetE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5619.nJWf3icnyDaEQetE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5619.nJWf3icnyDaEQetE(k2, -642953722) + " " + l2 + " " + m2);
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

