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

@HACHIMI_CLIENT(mv=100, d1={"\uae87\uae80\uae8d\uae8c\uae87\uae81\uae83\uae86", "\u29e8\u29e9\u29e9\u29e9\u29ee\u29e9\u29ed", "\u5a8f\u5a8f\u5a8d\u5a8b\u5a80\u5a8b\u5a81\u5a89", "\uce88\uce8f\uce8f\uce8c\uce8d\uce8b\uce8f\uce8d", "\u8004\u8007\u8001\u8003\u8002\u8006\u8005\u8006", "\ua34c\ua348\ua34e\ua349\ua345\ua34d\ua34d\ua34f", "\ua5bd\ua5bd\ua5b4\ua5bf\ua5b8\ua5ba\ua5ba\ua5ba", "\ud380\ud385\ud385\ud38d\ud387\ud385\ud382\ud382", "\u9f55\u9f57\u9f56\u9f57\u9f52\u9f53\u9f50\u9f57", "\u2276\u2273\u2273\u227a\u2270\u2272\u2271", "\u9f85\u9f84\u9f84\u9f86\u9f83\u9f85\u9f8a", "\ud875\ud871\ud877\ud874\ud875\ud87d\ud871\ud872", "\u1e3f\u1e3e\u1e39\u1e3c\u1e3e\u1e38\u1e34\u1e39", "\ud0a9\ud0af\ud0a6\ud0ad\ud0af\ud0a9\ud0a9\ud0ae", "\u4534\u4530\u4531\u4535\u4531\u453a\u4536\u4537", "\u82d3\u82dd\u82de\u82db\u82d9\u82da\u82df", "\ub50c\ub50a\ub508\ub508\ub508\ub50f\ub501\ub509"}, d2={"\u07f6\u07dd\u07f1\u2792\u07a0\u07a2\u07b4\u07d0\u07f6\u07fd\u07ea\u07fd\u07b3\u07f0\u07fd\u07f2\u07fb\u07b3\u07cf\u07e8\u07ee\u07f5\u07f2\u07fb\u07a7\u07b5\u07d0\u07f6\u07fd\u07ea\u07fd\u07b3\u07f0\u07fd\u07f2\u07fb\u07b3\u07cf\u07e8\u07ee\u07f5\u07f2\u07fb\u07a7", "\u00bc\u0097\u00b8\u20d8\u00ea\u00e8\u00fe\u009a\u00bc\u00b7\u00a0\u00b7\u00f9\u00ba\u00b7\u00b8\u00b1\u00f9\u0085\u00a2\u00a4\u00bf\u00b8\u00b1\u00ed\u00ff\u009a\u00bc\u00b7\u00a0\u00b7\u00f9\u00ba\u00b7\u00b8\u00b1\u00f9\u0085\u00a2\u00a4\u00bf\u00b8\u00b1\u00ed", "\u0248\u0263\u024d\u222c\u021e\u021c\u020a\u026e\u0248\u0243\u0254\u0243\u020d\u024e\u0243\u024c\u0245\u020d\u0271\u0256\u0250\u024b\u024c\u0245\u0219\u020b\u026e\u0248\u0243\u0254\u0243\u020d\u024e\u0243\u024c\u0245\u020d\u0271\u0256\u0250\u024b\u024c\u0245\u0219", "\u001dBMHOHU\u001f\u001d\u001f\t\bw", "\u05fa\u05af\u05a8\u05af\u05b2\u05f8\u05fa\u05f8\u05ee\u05ef\u0590", "\u07a6\u07a4\u07b5\u0782\u07ad\u07a0\u07b2\u07b2\u07fd\u07ff\u07e9\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0782\u07ad\u07a0\u07b2\u07b2\u07fa", "\u074c\u0745\u0757\u074c\u0767\u074b\u0740\u0741\u0718\u071a\u070c\u070d\u076d", "\u074b\u075f\u075b\u074f\u0742\u075d\u0712\u0710\u0706\u0762\u0744\u074f\u0758\u074f\u0701\u0742\u074f\u0740\u0749\u0701\u0761\u074c\u0744\u074b\u074d\u075a\u0715\u0707\u0774", "\u0013\u001c\u001f\u001e\u0015LNXY<\u001a\u0011\u0006\u0011_\u001c\u0011\u001e\u0017_?\u0012\u001a\u0015\u0013\u0004K", "\u0321\u033a\u0306\u0321\u0327\u033c\u033b\u0332\u0369\u036b\u037d\u037c\u0319\u033f\u0334\u0323\u0334\u037a\u0339\u0334\u033b\u0332\u037a\u0306\u0321\u0327\u033c\u033b\u0332\u036e", "\u079a\u079b\u0780\u079d\u0792\u078d\u07c8\u07ca\u07dc\u07dd\u07a2", "\u0330\u0331\u032a\u0337\u0338\u0327\u031f\u0332\u0332\u0362\u0360\u0376\u0377\u0308", "\u0183\u0195\u019d\u0180\u01c8\u01ca\u01dc\u01dd\u01a2", "\u038d\u039b\u0393\u038e\u03c6\u03c4\u03d2\u03b0\u03d3\u03ac", "\u0233\u0225\u022d\u0230\u0274\u0278\u027a\u026c\u020e\u026d\u0212", "\u032e\u0338\u0330\u032d\u0365\u0367\u0371\u0313\u0310\u0370\u030f", "\u00bb\u00b4\u00b3\u00bc\u00b1\u00b4\u00a7\u00b8\u00e1\u00e3\u00f5\u00f4\u008b"})
public final class Class1378 {
    public static String field5318;
    public static double field5319;
    public static float field5320;
    public static double field5321;
    public static float field5322;
    public static double field5323;

    static {
        field5319 = Double.longBitsToDouble(4593308570629697400L);
        d\u200e = "PlayersBox";
        s\u200e = "Instant";
        field5318 = "configs";
        field5323 = Double.longBitsToDouble(4596033749186772692L);
        field5321 = Double.longBitsToDouble(4599767149673696998L);
        field5320 = Float.intBitsToFloat(1064657206);
        field5322 = Float.intBitsToFloat(1061252883);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite MVwnTLnTmodA5A(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1378.iCpWW9nDtqfJ9Qth(k2, -711653816));
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
                int a2 = Integer.parseInt(Class1378.iCpWW9nDtqfJ9Qth(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1378.iCpWW9nDtqfJ9Qth(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 50160 : 50161;
        block7: while (true) {
            switch (n3) {
                case 50161: {
                    n3 = 50159;
                    continue block7;
                }
                case 50160: {
                    throw new Exception("Can't find method in " + Class1378.iCpWW9nDtqfJ9Qth(k2, -711653816) + " " + l2 + " " + m2);
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

    /*
     * Enabled aggressive block sorting
     */
    private static String iCpWW9nDtqfJ9Qth(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        while (true) {
            int n2;
            int n3 = d2 >= a2.length() ? 50576 : 50575;
            while ((n2 = n3) != 50575) {
                if (n2 != 50576) {
                    return c2.toString();
                }
                n3 = 50574;
            }
            c2.append((char)(a2.charAt(d2) ^ b2));
            ++d2;
        }
    }
}

