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

@HACHIMI_CLIENT(mv=100, d1={"\uab5e\uab5d\uab58\uab59\uab5e\uab59\uab5f\uab53", "\u17bb\u17b7\u17b8\u17bd\u17bc\u17b9\u17ba\u17b8", "\ub3f7\ub3f8\ub3f2\ub3f6\ub3f1\ub3f2\ub3f7\ub3f4", "\u65a7\u65a1\u65a3\u65a7\u65a2\u65aa\u65a6\u65a4", "\ubc4d\ubc47\ubc43\ubc42\ubc44\ubc44\ubc44", "\uaebb\uaeb3\uaeb9\uaebe\uaebb\uaebb\uaebf\uaeba", "\uaba9\uaba8\uabac\uabae\uabae\uabac\uaba8\uabab", "\udff9\udff2\udffa\udffd\udffb\udff9\udffc", "\u4da1\u4da3\u4da5\u4da2\u4da6\u4da3\u4daa\u4da0", "\ue650\ue653\ue656\ue651\ue65b\ue65b\ue656\ue653", "\uad8b\uad80\uad8e\uad81\uad8e\uad81\uad8e\uad8d", "\u2d8e\u2d8d\u2d85\u2d8d\u2d8f\u2d8b\u2d8a\u2d85", "\u2114\u2116\u2113\u2111\u2112\u2115\u2116\u211d", "\u768a\u768a\u7689\u7689\u768c\u768a\u768a\u768a"}, d2={"\u071c\u0743\u074c\u0749\u074e\u0749\u0754\u071e\u071c\u071e\u0708\u0709\u0776", "\u0737\u0762\u0765\u0762\u077f\u0735\u0737\u0735\u0723\u0722\u075d", "\u00a6\u00a4\u00b5\u0082\u00ad\u00a0\u00b2\u00b2\u00fd\u00ff\u00e9\u00e8\u008d\u00ab\u00a0\u00b7\u00a0\u00ee\u00ad\u00a0\u00af\u00a6\u00ee\u0082\u00ad\u00a0\u00b2\u00b2\u00fa", "*#1*\u0001-&'~|jk\u000b", "\u0748\u075c\u0758\u074c\u0741\u075e\u0711\u0713\u0705\u0761\u0747\u074c\u075b\u074c\u0702\u0741\u074c\u0743\u074a\u0702\u0762\u074f\u0747\u0748\u074e\u0759\u0716\u0704\u0777", "\u0166\u0169\u016a\u016b\u0160\u0139\u013b\u012d\u012c\u0149\u016f\u0164\u0173\u0164\u012a\u0169\u0164\u016b\u0162\u012a\u014a\u0167\u016f\u0160\u0166\u0171\u013e", "\u043a\u0421\u041d\u043a\u043c\u0427\u0420\u0429\u0472\u0470\u0466\u0467\u0402\u0424\u042f\u0438\u042f\u0461\u0422\u042f\u0420\u0429\u0461\u041d\u043a\u043c\u0427\u0420\u0429\u0475", "\u031b\u031a\u0301\u031c\u0313\u030c\u0349\u034b\u035d\u035c\u0323", "\u078a\u078b\u0790\u078d\u0782\u079d\u07a5\u0788\u0788\u07d8\u07da\u07cc\u07cd\u07b2", "\u00d9\u00cf\u00c7\u00da\u0092\u0090\u0086\u0087\u00f8", "\u06e7\u06f1\u06f9\u06e4\u06ac\u06ae\u06b8\u06da\u06b9\u06c6", "\u05db\u05cd\u05c5\u05d8\u059c\u0590\u0592\u0584\u05e6\u0585\u05fa", "\u01b2\u01a4\u01ac\u01b1\u01f9\u01fb\u01ed\u018f\u018c\u01ec\u0193", "\u008f\u0080\u0087\u0088\u0085\u0080\u0093\u008c\u00d5\u00d7\u00c1\u00c0\u00bf"})
public final class Class4120 {
    public static int field9554 = 371976083;
    public static double field9555 = Double.longBitsToDouble(4602901051208800388L);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite M5dzaNOdAqJKmg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4120.T7GrlT3CvhDlOYiw(k2, -808123553));
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
                int a2 = Integer.parseInt(Class4120.T7GrlT3CvhDlOYiw(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4120.T7GrlT3CvhDlOYiw(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 42388 : 42389;
        block7: while (true) {
            switch (n3) {
                case 42389: {
                    n3 = 42387;
                    continue block7;
                }
                case 42388: {
                    throw new Exception("Can't find method in " + Class4120.T7GrlT3CvhDlOYiw(k2, -808123553) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String T7GrlT3CvhDlOYiw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

