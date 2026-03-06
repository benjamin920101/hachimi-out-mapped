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
@HACHIMI_CLIENT(mv=100, d1={"\uaefe\uaefe\uaef8\uaefb\uaefb\uaef1\uaef8\uaef8", "\u5fcc\u5fc0\u5fcd\u5fc9\u5fcb\u5fc1\u5fc0\u5fc1", "\u5e31\u5e35\u5e3d\u5e31\u5e33\u5e33\u5e33\u5e36", "\ua551\ua556\ua552\ua551\ua553\ua550\ua555\ua553", "\u71d3\u71d3\u71d3\u71d2\u71df\u71d1\u71df\u71d6", "\u56b6\u56b2\u56b4\u56b6\u56b2\u56b2\u56b0\u56b2", "\u8017\u8016\u8013\u8012\u8013\u801c\u8016\u8011", "\ucb3f\ucb3c\ucb33\ucb3a\ucb3d\ucb3d\ucb32\ucb38", "\u4a08\u4a02\u4a0b\u4a09\u4a03\u4a03\u4a08\u4a03", "\u54bc\u54bf\u54be\u54ba\u54b8\u54bb\u54b7\u54b6", "\u1610\u161b\u1617\u1612\u161a\u161a\u1610\u1611", "\ue56a\ue56b\ue56a\ue569\ue560\ue56f\ue560", "\u51d4\u51d7\u51d6\u51d3\u51d2\u51d0\u51d7", "\u15b4\u15b4\u15b5\u15b4\u15b2\u15b1\u15b6\u15b3", "\u28ef\u28e6\u28e1\u28ee\u28e0\u28e1\u28e3", "\u9bd1\u9bdc\u9bd6\u9bdc\u9bd2\u9bd2\u9bd1\u9bd0", "\ue22a\ue22a\ue22a\ue228\ue22e\ue22f\ue223\ue22e"}, d2={"EnO\u202d\u001f\u001d\u000boIBUB\fOBMD\fpWQJMD\u0018\noIBUB\fOBMD\fpWQJMD\u0018", "\u0434\u041f\u043f\u245c\u046e\u046c\u047a\u041e\u0438\u0433\u0424\u0433\u047d\u043e\u0433\u043c\u0435\u047d\u0401\u0426\u0420\u043b\u043c\u0435\u0469\u047b\u041e\u0438\u0433\u0424\u0433\u047d\u043e\u0433\u043c\u0435\u047d\u0401\u0426\u0420\u043b\u043c\u0435\u0469", "\u02ab\u0280\u02a3\u22c3\u02f1\u02f3\u02e5\u0281\u02a7\u02ac\u02bb\u02ac\u02e2\u02a1\u02ac\u02a3\u02aa\u02e2\u029e\u02b9\u02bf\u02a4\u02a3\u02aa\u02f6\u02e4\u0281\u02a7\u02ac\u02bb\u02ac\u02e2\u02a1\u02ac\u02a3\u02aa\u02e2\u029e\u02b9\u02bf\u02a4\u02a3\u02aa\u02f6", "\u0089\u00d6\u00d9\u00dc\u00db\u00dc\u00c1\u008b\u0089\u008b\u009d\u009c\u00e3", "\u0460\u0435\u0432\u0435\u0428\u0462\u0460\u0462\u0474\u0475\u040a", "\u07ec\u07ee\u07ff\u07c8\u07e7\u07ea\u07f8\u07f8\u07b7\u07b5\u07a3\u07a2\u07c7\u07e1\u07ea\u07fd\u07ea\u07a4\u07e7\u07ea\u07e5\u07ec\u07a4\u07c8\u07e7\u07ea\u07f8\u07f8\u07b0", "\u03ad\u03a4\u03b6\u03ad\u0386\u03aa\u03a1\u03a0\u03f9\u03fb\u03ed\u03ec\u038c", "\u0588\u059c\u0598\u058c\u0581\u059e\u05d1\u05d3\u05c5\u05a1\u0587\u058c\u059b\u058c\u05c2\u0581\u058c\u0583\u058a\u05c2\u05a2\u058f\u0587\u0588\u058e\u0599\u05d6\u05c4\u05b7", "\u02d2\u02dd\u02de\u02df\u02d4\u028d\u028f\u0299\u0298\u02fd\u02db\u02d0\u02c7\u02d0\u029e\u02dd\u02d0\u02df\u02d6\u029e\u02fe\u02d3\u02db\u02d4\u02d2\u02c5\u028a", "\u009c\u0087\u00bb\u009c\u009a\u0081\u0086\u008f\u00d4\u00d6\u00c0\u00c1\u00a4\u0082\u0089\u009e\u0089\u00c7\u0084\u0089\u0086\u008f\u00c7\u00bb\u009c\u009a\u0081\u0086\u008f\u00d3", "\u070c\u070d\u0716\u070b\u0704\u071b\u075e\u075c\u074a\u074b\u0734", "\u001d\u001c\u0007\u001a\u0015\n2\u001f\u001fOM[Z%", "\u073f\u0729\u0721\u073c\u0774\u0776\u0760\u0761\u071e", "\u0326\u0330\u0338\u0325\u036d\u036f\u0379\u031b\u0378\u0307", "\u011e\u0108\u0100\u011d\u0159\u0155\u0157\u0141\u0123\u0140\u013f", "\u0683\u0695\u069d\u0680\u06c8\u06ca\u06dc\u06be\u06bd\u06dd\u06a2", "\u03b6\u03b9\u03be\u03b1\u03bc\u03b9\u03aa\u03b5\u03ec\u03ee\u03f8\u03f9\u0386"})
public final class Class4109 {
    public static float field9526;
    public static float field9527;
    public static double field9528;
    public static float field9529;
    public static double field9530;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite QnpAWAa1gPMQrv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4109.15JUjVDTeV7UlgS5(k2, -1993366527));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4109.15JUjVDTeV7UlgS5(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4109.15JUjVDTeV7UlgS5(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 6597 : 6598;
        block7: while (true) {
            switch (n3) {
                case 6598: {
                    n3 = 6596;
                    continue block7;
                }
                case 6597: {
                    throw new Exception("Can't find method in " + Class4109.15JUjVDTeV7UlgS5(k2, -1993366527) + " " + l2 + " " + m2);
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

    static {
        R\u200e = "INTERACT_AT";
        field9527 = Float.intBitsToFloat(1051188460);
        field9529 = Float.intBitsToFloat(1059636155);
        aw\u200e = "Assume block has broken";
        field9528 = Double.longBitsToDouble(4604346535061507219L);
        field9526 = Float.intBitsToFloat(1093664768);
        field9530 = Double.longBitsToDouble(4596576503368930504L);
        cj\u200e = "X";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 15JUjVDTeV7UlgS5(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 59798 : 59799;
            block5: while (true) {
                switch (n2) {
                    case 59799: {
                        n2 = 59797;
                        continue block5;
                    }
                    case 59798: {
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
}

