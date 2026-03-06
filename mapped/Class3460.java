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

@HACHIMI_CLIENT(mv=100, d1={"\u9174\u9176\u9171\u9176\u9172\u9170\u9174\u9171", "\u6354\u6356\u6357\u6357\u6357\u6356\u6358\u6355", "\ub3d9\ub3db\ub3db\ub3dd\ub3d8\ub3de\ub3d7\ub3df", "\ud5d9\ud5d3\ud5dc\ud5dd\ud5da\ud5d9\ud5d8\ud5dc", "\u2d24\u2d2f\u2d26\u2d21\u2d23\u2d25\u2d23\u2d2e", "\ua492\ua494\ua49a\ua495\ua49b\ua49b\ua493\ua497", "\u1535\u1533\u1532\u1536\u1534\u153a\u1537\u153a", "\u2675\u267e\u267f\u2670\u2676\u2676\u2671\u2670", "\u78e6\u78e1\u78eb\u78e0\u78e6\u78e6\u78e1\u78eb", "\u6c47\u6c43\u6c40\u6c46\u6c45\u6c43\u6c46\u6c45", "\u16dc\u16d5\u16da\u16db\u16db\u16de\u16df\u16d9", "\u54da\u54dd\u54d6\u54d8\u54da\u54df", "\u8cb2\u8cb7\u8cb4\u8cb1\u8cb6\u8cb1\u8cb3\u8cb7", "\u791c\u7910\u791b\u791a\u7919\u791f\u791e\u791c", "\u02ed\u02e8\u02e7\u02e8\u02ec\u02eb\u02ee\u02ee"}, d2={"\u07c1\u07d0\u07c1\u27a4\u0796\u0794\u0782\u07e6\u07c0\u07cb\u07dc\u07cb\u0785\u07c6\u07cb\u07c4\u07cd\u0785\u07f9\u07de\u07d8\u07c3\u07c4\u07cd\u0791\u0783\u07e6\u07c0\u07cb\u07dc\u07cb\u0785\u07c6\u07cb\u07c4\u07cd\u0785\u07f9\u07de\u07d8\u07c3\u07c4\u07cd\u0791", "\u00fc\u00a3\u00ac\u00a9\u00ae\u00a9\u00b4\u00fe\u00fc\u00fe\u00e8\u00e9\u0096", "\u00c1\u0094\u0093\u0094\u0089\u00c3\u00c1\u00c3\u00d5\u00d4\u00ab", "\u04b3\u04b1\u04a0\u0497\u04b8\u04b5\u04a7\u04a7\u04e8\u04ea\u04fc\u04fd\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0497\u04b8\u04b5\u04a7\u04a7\u04ef", "\u06c1\u06c8\u06da\u06c1\u06ea\u06c6\u06cd\u06cc\u0695\u0697\u0681\u0680\u06e0", "\u0524\u0530\u0534\u0520\u052d\u0532\u057d\u057f\u0569\u050d\u052b\u0520\u0537\u0520\u056e\u052d\u0520\u052f\u0526\u056e\u050e\u0523\u052b\u0524\u0522\u0535\u057a\u0568\u051b", "\u0363\u036c\u036f\u036e\u0365\u033c\u033e\u0328\u0329\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u034f\u0362\u036a\u0365\u0363\u0374\u033b", "\u0580\u059b\u05a7\u0580\u0586\u059d\u059a\u0593\u05c8\u05ca\u05dc\u05dd\u05b8\u059e\u0595\u0582\u0595\u05db\u0598\u0595\u059a\u0593\u05db\u05a7\u0580\u0586\u059d\u059a\u0593\u05cf", "\u0096\u0097\u008c\u0091\u009e\u0081\u00c4\u00c6\u00d0\u00d1\u00ae", "\u039b\u039a\u0381\u039c\u0393\u038c\u03b4\u0399\u0399\u03c9\u03cb\u03dd\u03dc\u03a3", "\u03dd\u03cb\u03c3\u03de\u0396\u0394\u0382\u0383\u03fc", "\u00a3\u00b5\u00bd\u00a0\u00e8\u00ea\u00fc\u009e\u00fd\u0082", "\u0564\u0572\u057a\u0567\u0523\u052f\u052d\u053b\u0559\u053a\u0545", "\u03be\u03a8\u03a0\u03bd\u03f5\u03f7\u03e1\u0383\u0380\u03e0\u039f", "\u044b\u0444\u0443\u044c\u0441\u0444\u0457\u0448\u0411\u0413\u0405\u0404\u047b"})
public final class Class3460 {
    public static double field7570;
    public static float field7571;
    public static float field7572 = 0.5889702f;
    public static float field7573;
    public static double field7574;
    public static int field7575 = 176067059;

    private static String yIAewmrc9SkNrwrq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7571 = Float.intBitsToFloat(0x42200000);
        field7574 = Double.longBitsToDouble(4600449537357098516L);
        field7573 = Float.intBitsToFloat(1041279404);
        bl\u200e = "FULL";
        field7570 = Double.longBitsToDouble(4599218517408400978L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite rUJ2u8tF20D3Hs(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3460.yIAewmrc9SkNrwrq(k2, 1760619009));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block6: while (true) {
            block12: {
                void e2;
                int n3 = f2 >= q2.length ? 37578 : 37577;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 37577) {
                        try {
                            int a2 = Integer.parseInt(Class3460.yIAewmrc9SkNrwrq(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block12;
                        }
                    }
                    if (n4 != 37578) break block6;
                    n3 = 37576;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3460.yIAewmrc9SkNrwrq(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        int n5 = s2.isEmpty() ? 52558 : 52559;
        block8: while (true) {
            switch (n5) {
                case 52559: {
                    n5 = 52557;
                    continue block8;
                }
                case 52558: {
                    throw new Exception("Can't find method in " + Class3460.yIAewmrc9SkNrwrq(k2, 1760619009) + " " + l2 + " " + m2);
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
}

