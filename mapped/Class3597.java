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

@HACHIMI_CLIENT(mv=100, d1={"\u5fdd\u5fdc\u5fd5\u5fde\u5fdf\u5fd8\u5fd4\u5fdb", "\uc92d\uc92b\uc920\uc921\uc929\uc928\uc928\uc920", "\udfd7\udfd6\udfd9\udfd8\udfd3\udfd6\udfd2\udfd7", "\u0428\u042f\u0427\u0427\u0427\u0426\u0427\u042f", "\u6bc7\u6bc4\u6bca\u6bc1\u6bc2\u6bca\u6bc6", "\u55c5\u55c2\u55c4\u55c6\u55c1\u55c1\u55c4\u55c2", "\ub56b\ub56e\ub56b\ub56f\ub56e\ub569\ub561\ub56c", "\u81cb\u81ca\u81c2\u81c2\u81c4\u81c3\u81c6", "\u714d\u7145\u714f\u7148\u7144\u714b\u714a", "\u5604\u5600\u5605\u5606\u5608\u5602\u5600\u5602", "\u71b8\u71be\u71bc\u71ba\u71bf\u71bf\u71b7\u71b9", "\u0ff3\u0ffd\u0ff5\u0ff2\u0ff2\u0ff3\u0ffd\u0ffd", "\u39da\u39d4\u39df\u39d4\u39da\u39de\u39da\u39d8", "\ua40f\ua40a\ua408\ua408\ua40a\ua40e\ua40a\ua404", "\u0af2\u0afe\u0af0\u0af4\u0aff\u0af3\u0af4\u0af7", "\u546e\u5468\u5460\u5460\u5460\u5460\u546c\u546e", "\u22cc\u22cb\u22ca\u22cc\u22c0\u22cc\u22cc\u22cf", "\u5e22\u5e22\u5e27\u5e20\u5e2d\u5e25\u5e25"}, d2={"\u015f\u016c\u0141\u2125\u0117\u0115\u0103\u0167\u0141\u014a\u015d\u014a\u0104\u0147\u014a\u0145\u014c\u0104\u0178\u015f\u0159\u0142\u0145\u014c\u0110\u0102\u0167\u0141\u014a\u015d\u014a\u0104\u0147\u014a\u0145\u014c\u0104\u0178\u015f\u0159\u0142\u0145\u014c\u0110", "\u0469\u045a\u0476\u2413\u0421\u0423\u0435\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u044e\u0469\u046f\u0474\u0473\u047a\u0426\u0434\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u044e\u0469\u046f\u0474\u0473\u047a\u0426", "\u00b9\u008a\u00a1\u20c3\u00f1\u00f3\u00e5\u0081\u00a7\u00ac\u00bb\u00ac\u00e2\u00a1\u00ac\u00a3\u00aa\u00e2\u009e\u00b9\u00bf\u00a4\u00a3\u00aa\u00f6\u00e4\u0081\u00a7\u00ac\u00bb\u00ac\u00e2\u00a1\u00ac\u00a3\u00aa\u00e2\u009e\u00b9\u00bf\u00a4\u00a3\u00aa\u00f6", "\u0213\u0220\u020a\u2269\u025b\u0259\u024f\u022b\u020d\u0206\u0211\u0206\u0248\u020b\u0206\u0209\u0200\u0248\u0234\u0213\u0215\u020e\u0209\u0200\u025c\u024e\u022b\u020d\u0206\u0211\u0206\u0248\u020b\u0206\u0209\u0200\u0248\u0234\u0213\u0215\u020e\u0209\u0200\u025c", "\u0534\u056b\u0564\u0561\u0566\u0561\u057c\u0536\u0534\u0536\u0520\u0521\u055e", "\u07b3\u07e6\u07e1\u07e6\u07fb\u07b1\u07b3\u07b1\u07a7\u07a6\u07d9", "\u03b3\u03b1\u03a0\u0397\u03b8\u03b5\u03a7\u03a7\u03e8\u03ea\u03fc\u03fd\u0398\u03be\u03b5\u03a2\u03b5\u03fb\u03b8\u03b5\u03ba\u03b3\u03fb\u0397\u03b8\u03b5\u03a7\u03a7\u03ef", "\u0242\u024b\u0259\u0242\u0269\u0245\u024e\u024f\u0216\u0214\u0202\u0203\u0263", "\u00ce\u00da\u00de\u00ca\u00c7\u00d8\u0097\u0095\u0083\u00e7\u00c1\u00ca\u00dd\u00ca\u0084\u00c7\u00ca\u00c5\u00cc\u0084\u00e4\u00c9\u00c1\u00ce\u00c8\u00df\u0090\u0082\u00f1", "\u05d2\u05dd\u05de\u05df\u05d4\u058d\u058f\u0599\u0598\u05fd\u05db\u05d0\u05c7\u05d0\u059e\u05dd\u05d0\u05df\u05d6\u059e\u05fe\u05d3\u05db\u05d4\u05d2\u05c5\u058a", "\u070a\u0711\u072d\u070a\u070c\u0717\u0710\u0719\u0742\u0740\u0756\u0757\u0732\u0714\u071f\u0708\u071f\u0751\u0712\u071f\u0710\u0719\u0751\u072d\u070a\u070c\u0717\u0710\u0719\u0745", "\u03fc\u03fd\u03e6\u03fb\u03f4\u03eb\u03ae\u03ac\u03ba\u03bb\u03c4", "BCXEJUm@@\u0010\u0012\u0004\u0005z", "\u05f2\u05e4\u05ec\u05f1\u05b9\u05bb\u05ad\u05ac\u05d3", "\u03b5\u03a3\u03ab\u03b6\u03fe\u03fc\u03ea\u0388\u03eb\u0394", "\u02ea\u02fc\u02f4\u02e9\u02ad\u02a1\u02a3\u02b5\u02d7\u02b4\u02cb", "\u031f\u0309\u0301\u031c\u0354\u0356\u0340\u0322\u0321\u0341\u033e", "\u05ea\u05e5\u05e2\u05ed\u05e0\u05e5\u05f6\u05e9\u05b0\u05b2\u05a4\u05a5\u05da"})
public final class Class3597 {
    public static double field8013;
    public static int field8014 = 2076026408;
    public static float field8015;
    public static int field8016 = 895391862;
    public static double field8017;
    public static String field8018;
    public static int field8019 = 936971316;
    public static double field8020 = 0.011689468097383027;

    /*
     * Enabled aggressive block sorting
     */
    private static String mg76TkM38VYoITbB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 52115 : 52116;
            block5: while (true) {
                switch (n2) {
                    case 52116: {
                        n2 = 52114;
                        continue block5;
                    }
                    case 52115: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite a7CduPNltYSOYF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        HACHIMI_CLIENT p2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class3597.mg76TkM38VYoITbB(k2, 1167913282));
                    p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() >= 100) break block7;
                    n4 = 54570;
                    n3 = n4;
                    if (n3 == 54570) throw new Exception("Outdated metadata version");
                    if (n3 == 54571) break block8;
                    break block9;
                }
                n4 = 54571;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 54570) throw new Exception("Outdated metadata version");
                if (n3 != 54571) break block9;
            }
            do {
                n4 = 54569;
                n3 = n4;
                if (n3 == 54570) throw new Exception("Outdated metadata version");
            } while (n3 == 54571);
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3597.mg76TkM38VYoITbB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3597.mg76TkM38VYoITbB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3597.mg76TkM38VYoITbB(k2, 1167913282) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        v\u200e = "[C] ";
        field8017 = Double.longBitsToDouble(4605879445954404295L);
        field8018 = "dimension";
        Y\u200e = "BreakDelay";
        aH\u200e = "AutoTrap";
        field8013 = Double.longBitsToDouble(4601661205957476612L);
        field8015 = Float.intBitsToFloat(1014740864);
    }
}

