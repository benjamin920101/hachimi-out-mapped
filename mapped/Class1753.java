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
@HACHIMI_CLIENT(mv=100, d1={"\ub1ad\ub1ae\ub1ad\ub1ac\ub1ab\ub1a1\ub1aa\ub1ae", "\u2a33\u2a35\u2a33\u2a32\u2a38\u2a30\u2a35\u2a33", "\u99f7\u99fe\u99f4\u99f0\u99f6\u99f1\u99f0", "\u23b6\u23b3\u23b3\u23b2\u23b1\u23b6\u23b0\u23b2", "\ub180\ub185\ub183\ub183\ub181\ub181\ub184\ub184", "\ue106\ue10b\ue103\ue10b\ue100\ue103\ue105\ue107", "\u3101\u3107\u3104\u3100\u3103\u3102\u3103\u3106", "\u321c\u321b\u321b\u321e\u321a\u3213\u321c\u321e", "\u6e18\u6e19\u6e1e\u6e12\u6e13\u6e13", "\u50ac\u50a9\u50aa\u50ae\u50ac\u50af\u50ac\u50ab", "\u225a\u2250\u225c\u225f\u225f\u2258\u225d\u225c", "\u87f7\u87f7\u87f2\u87f0\u87ff\u87f1\u87f6\u87f4", "\u947c\u9471\u947e\u9479\u9478\u947f\u9479\u947f", "\u4ece\u4ecc\u4ecc\u4ecd\u4ec5\u4ec4\u4eca\u4ec8", "\u1398\u1397\u139a\u139a\u1396\u139b\u139e\u139e", "\u67dd\u67de\u67d8\u67df\u67da\u67dc\u67da\u67da", "\u9b5d\u9b5f\u9b5f\u9b5d\u9b58\u9b5d\u9b59\u9b5f"}, d2={"\u0293\u028e\u0299\u22f5\u02c7\u02c5\u02d3\u02b7\u0291\u029a\u028d\u029a\u02d4\u0297\u029a\u0295\u029c\u02d4\u02a8\u028f\u0289\u0292\u0295\u029c\u02c0\u02d2\u02b7\u0291\u029a\u028d\u029a\u02d4\u0297\u029a\u0295\u029c\u02d4\u02a8\u028f\u0289\u0292\u0295\u029c\u02c0", "\u00b9\u00a4\u00b2\u20df\u00ed\u00ef\u00f9\u009d\u00bb\u00b0\u00a7\u00b0\u00fe\u00bd\u00b0\u00bf\u00b6\u00fe\u0082\u00a5\u00a3\u00b8\u00bf\u00b6\u00ea\u00f8\u009d\u00bb\u00b0\u00a7\u00b0\u00fe\u00bd\u00b0\u00bf\u00b6\u00fe\u0082\u00a5\u00a3\u00b8\u00bf\u00b6\u00ea", "\u02d3\u02ce\u02df\u22b5\u0287\u0285\u0293\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02e8\u02cf\u02c9\u02d2\u02d5\u02dc\u0280\u0292\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02e8\u02cf\u02c9\u02d2\u02d5\u02dc\u0280", "\u042f\u0470\u047f\u047a\u047d\u047a\u0467\u042d\u042f\u042d\u043b\u043a\u0445", "\u0741\u0714\u0713\u0714\u0709\u0743\u0741\u0743\u0755\u0754\u072b", "\u0760\u0762\u0773\u0744\u076b\u0766\u0774\u0774\u073b\u0739\u072f\u072e\u074b\u076d\u0766\u0771\u0766\u0728\u076b\u0766\u0769\u0760\u0728\u0744\u076b\u0766\u0774\u0774\u073c", "\u03d4\u03dd\u03cf\u03d4\u03ff\u03d3\u03d8\u03d9\u0380\u0382\u0394\u0395\u03f5", "\u038e\u039a\u039e\u038a\u0387\u0398\u03d7\u03d5\u03c3\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03a4\u0389\u0381\u038e\u0388\u039f\u03d0\u03c2\u03b1", "\u04bd\u04b2\u04b1\u04b0\u04bb\u04e2\u04e0\u04f6\u04f7\u0492\u04b4\u04bf\u04a8\u04bf\u04f1\u04b2\u04bf\u04b0\u04b9\u04f1\u0491\u04bc\u04b4\u04bb\u04bd\u04aa\u04e5", "\u0537\u052c\u0510\u0537\u0531\u052a\u052d\u0524\u057f\u057d\u056b\u056a\u050f\u0529\u0522\u0535\u0522\u056c\u052f\u0522\u052d\u0524\u056c\u0510\u0537\u0531\u052a\u052d\u0524\u0578", "\u0588\u0589\u0592\u058f\u0580\u059f\u05da\u05d8\u05ce\u05cf\u05b0", "\u0560\u0561\u057a\u0567\u0568\u0577\u054f\u0562\u0562\u0532\u0530\u0526\u0527\u0558", "aw\u007fb*(>?@", "\u07f2\u07e4\u07ec\u07f1\u07b9\u07bb\u07ad\u07cf\u07ac\u07d3", "\u03ce\u03d8\u03d0\u03cd\u0389\u0385\u0387\u0391\u03f3\u0390\u03ef", "\u07a1\u07b7\u07bf\u07a2\u07ea\u07e8\u07fe\u079c\u079f\u07ff\u0780", "xwp\u007frwd{\" 67H"})
public final class Class1753 {
    public static double field6581;

    static {
        x\u200e = "NoHitDelay";
        R\u200e = "ClientCommand - mode: %s";
        W\u200e = "Indicator offset";
        field6581 = Double.longBitsToDouble(4604730808835187874L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 3EGEP0DwnL2xs1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1753.d2VGBGMdm1lRn3AS(k2, -80072153));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1753.d2VGBGMdm1lRn3AS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1753.d2VGBGMdm1lRn3AS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 15726 : 15725;
        block7: while (true) {
            switch (n3) {
                case 15726: {
                    n3 = 15724;
                    continue block7;
                }
                case 15725: {
                    throw new Exception("Can't find method in " + Class1753.d2VGBGMdm1lRn3AS(k2, -80072153) + " " + l2 + " " + m2);
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

    private static String d2VGBGMdm1lRn3AS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

