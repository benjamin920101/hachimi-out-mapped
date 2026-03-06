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
@HACHIMI_CLIENT(mv=100, d1={"\u19e0\u19e3\u19e1\u19e8\u19e7\u19e7\u19e9\u19e1", "\u8773\u8773\u8775\u8776\u8775\u8772\u8771\u8775", "\u11bd\u11b8\u11b9\u11be\u11bf\u11bb\u11b9\u11be", "\u493b\u493c\u4937\u493e\u493b\u493d\u493f\u4936", "\u85b3\u85b3\u85b2\u85b5\u85b4\u85b5\u85b1\u85b5", "\ud3f8\ud3fb\ud3fd\ud3fc\ud3f8\ud3fe\ud3f9\ud3fc", "\u4ad5\u4ad5\u4add\u4add\u4ad4\u4ad5\u4ad6\u4add", "\uae45\uae43\uae4d\uae43\uae45\uae47\uae45\uae43", "\u74e2\u74ed\u74e7\u74e1\u74e0\u74e6\u74e1\u74e2", "\u4e4a\u4e46\u4e43\u4e45\u4e44\u4e43\u4e4b", "\ub40a\ub40d\ub408\ub40a\ub40f\ub406\ub408\ub408", "\u2b47\u2b43\u2b46\u2b45\u2b4a\u2b47\u2b47\u2b43", "\ud4a2\ud4a0\ud4a5\ud4a5\ud4a6\ud4a4\ud4a7\ud4a7", "\ua61b\ua61f\ua61c\ua618\ua61f\ua61b\ua618\ua61c", "\u2362\u236f\u236f\u2362\u2366\u2364\u2361\u2364", "\ub651\ub653\ub65f\ub653\ub653\ub650\ub656\ub656", "\ub6ad\ub6ac\ub6ad\ub6af\ub6a8\ub6a2\ub6af\ub6a9", "\uada4\uada1\uada0\uada8\uada0\uada5\uada3\uada6", "\u7ce9\u7cea\u7cee\u7cea\u7cec\u7cea\u7ce9\u7ce8"}, d2={"\u05fb\u05f8\u05d0\u2587\u05b5\u05b7\u05a1\u05c5\u05e3\u05e8\u05ff\u05e8\u05a6\u05e5\u05e8\u05e7\u05ee\u05a6\u05da\u05fd\u05fb\u05e0\u05e7\u05ee\u05b2\u05a0\u05c5\u05e3\u05e8\u05ff\u05e8\u05a6\u05e5\u05e8\u05e7\u05ee\u05a6\u05da\u05fd\u05fb\u05e0\u05e7\u05ee\u05b2", "\u045a\u0459\u0472\u2426\u0414\u0416\u0400\u0464\u0442\u0449\u045e\u0449\u0407\u0444\u0449\u0446\u044f\u0407\u047b\u045c\u045a\u0441\u0446\u044f\u0413\u0401\u0464\u0442\u0449\u045e\u0449\u0407\u0444\u0449\u0446\u044f\u0407\u047b\u045c\u045a\u0441\u0446\u044f\u0413", "~~m\u200202$@fmzm#`mbk#_x~ebk7%@fmzm#`mbk#_x~ebk7", "\u0015\u0015\u0005\u2069[YO+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H4\u0013\u0015\u000e\t\u0000\\N+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H4\u0013\u0015\u000e\t\u0000\\", "\u02e6\u02e6\u02f7\u229a\u02a8\u02aa\u02bc\u02d8\u02fe\u02f5\u02e2\u02f5\u02bb\u02f8\u02f5\u02fa\u02f3\u02bb\u02c7\u02e0\u02e6\u02fd\u02fa\u02f3\u02af\u02bd\u02d8\u02fe\u02f5\u02e2\u02f5\u02bb\u02f8\u02f5\u02fa\u02f3\u02bb\u02c7\u02e0\u02e6\u02fd\u02fa\u02f3\u02af", "\u0786\u07d9\u07d6\u07d3\u07d4\u07d3\u07ce\u0784\u0786\u0784\u0792\u0793\u07ec", "E\u0010\u0017\u0010\rGEGQP/", "\u0640\u0642\u0653\u0664\u064b\u0646\u0654\u0654\u061b\u0619\u060f\u060e\u066b\u064d\u0646\u0651\u0646\u0608\u064b\u0646\u0649\u0640\u0608\u0664\u064b\u0646\u0654\u0654\u061c", "\u001a\u0013\u0001\u001a1\u001d\u0016\u0017NLZ[;", "1%!58'hj|\u0018>5\"5{85:3{\u001b6>17 o}\u000e", "\u0547\u0548\u054b\u054a\u0541\u0518\u051a\u050c\u050d\u0568\u054e\u0545\u0552\u0545\u050b\u0548\u0545\u054a\u0543\u050b\u056b\u0546\u054e\u0541\u0547\u0550\u051f", "\u0375\u036e\u0352\u0375\u0373\u0368\u036f\u0366\u033d\u033f\u0329\u0328\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0352\u0375\u0373\u0368\u036f\u0366\u033a", "\u0424\u0425\u043e\u0423\u042c\u0433\u0476\u0474\u0462\u0463\u041c", "PQJWXG\u007fRR\u0002\u0000\u0016\u0017h", "\u03a1\u03b7\u03bf\u03a2\u03ea\u03e8\u03fe\u03ff\u0380", "\u04bd\u04ab\u04a3\u04be\u04f6\u04f4\u04e2\u0480\u04e3\u049c", "\u03c4\u03d2\u03da\u03c7\u0383\u038f\u038d\u039b\u03f9\u039a\u03e5", "\u00e1\u00f7\u00ff\u00e2\u00aa\u00a8\u00be\u00dc\u00df\u00bf\u00c0", "\u068f\u0680\u0687\u0688\u0685\u0680\u0693\u068c\u06d5\u06d7\u06c1\u06c0\u06bf"})
public final class Class5553 {
    public static double field10509;
    public static double field10510;
    public static float field10511;
    public static float field10512 = 0.8880185f;
    public static float field10513;
    public static int field10514 = 1;

    static {
        field10511 = Float.intBitsToFloat(1148846080);
        field10510 = Double.longBitsToDouble(4589708452245819884L);
        field10509 = Double.longBitsToDouble(4599632124002589456L);
        ah\u200e = "Static";
        aB\u200e = "Draw the outline of the block";
        aV\u200e = "Mode";
        bg\u200e = "radius";
        field10513 = Float.intBitsToFloat(1057282462);
        bC\u200e = "Box";
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite gF6eIHF4ika3pH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class5553.0A0ltJdGPNjBuSqJ(k2, -2079163691));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class5553.0A0ltJdGPNjBuSqJ(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class5553.0A0ltJdGPNjBuSqJ(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (s2.isEmpty()) break block7;
                    n4 = 47187;
                    n3 = n4;
                    if (n3 == 47186) throw new Exception("Can't find method in " + Class5553.0A0ltJdGPNjBuSqJ(k2, -2079163691) + " " + l2 + " " + m2);
                    if (n3 == 47187) break block8;
                    break block9;
                }
                n4 = 47186;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 47186) throw new Exception("Can't find method in " + Class5553.0A0ltJdGPNjBuSqJ(k2, -2079163691) + " " + l2 + " " + m2);
                if (n3 != 47187) break block9;
            }
            do {
                n4 = 47185;
                n3 = n4;
                if (n3 == 47186) throw new Exception("Can't find method in " + Class5553.0A0ltJdGPNjBuSqJ(k2, -2079163691) + " " + l2 + " " + m2);
            } while (n3 == 47187);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 0A0ltJdGPNjBuSqJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

