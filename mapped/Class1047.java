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

@HACHIMI_CLIENT(mv=100, d1={"\u20ec\u20ee\u20e7\u20ef\u20ec\u20e7\u20ec\u20ef", "\u21e3\u21e4\u21e6\u21e8\u21e7\u21e9\u21e2\u21e9", "\u99b6\u99b4\u99b2\u99b8\u99b9\u99b0", "\u2678\u267a\u267c\u267e\u2678\u267d\u2673\u267f", "\u7615\u7619\u7619\u7615\u761f\u761b\u761e", "\ub522\ub526\ub527\ub52f\ub520\ub527\ub523", "\u314d\u314f\u3149\u3145\u314d\u314a\u314a\u3148", "\u6b1e\u6b1d\u6b18\u6b1c\u6b14\u6b1f\u6b15\u6b15", "\uc874\uc873\uc874\uc870\uc878\uc877\uc876\uc870", "\u2120\u2129\u2123\u2128\u2123\u2125\u2127\u2125", "\u3033\u3030\u3030\u3030\u3033\u3036\u3035\u3037", "\u3f32\u3f32\u3f30\u3f37\u3f36\u3f3e\u3f34\u3f37", "\u0d6c\u0d68\u0d6f\u0d6a\u0d66\u0d67\u0d6a\u0d6b", "\u1d20\u1d2f\u1d24\u1d21\u1d24\u1d24\u1d25\u1d21", "\u492e\u4922\u492a\u4928\u492b\u492c\u492f\u492c", "\u277b\u2776\u2777\u277f\u277f\u2777\u277d\u277b", "\u603c\u6038\u6036\u603f\u603d\u6037\u603b\u603c", "\u5ee7\u5ee4\u5ee5\u5ee2\u5ee3\u5ee0\u5ee2\u5eeb"}, d2={"\u00c4\u00c3\u00f0\u20a9\u009b\u0099\u008f\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009c\u008e\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009c", "\u0468\u046f\u0453\u2405\u0437\u0435\u0423\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430\u0422\u0447\u0461\u046a\u047d\u046a\u0424\u0467\u046a\u0465\u046c\u0424\u0458\u047f\u0479\u0462\u0465\u046c\u0430", "\u04e7\u04e0\u04dd\u248a\u04b8\u04ba\u04ac\u04c8\u04ee\u04e5\u04f2\u04e5\u04ab\u04e8\u04e5\u04ea\u04e3\u04ab\u04d7\u04f0\u04f6\u04ed\u04ea\u04e3\u04bf\u04ad\u04c8\u04ee\u04e5\u04f2\u04e5\u04ab\u04e8\u04e5\u04ea\u04e3\u04ab\u04d7\u04f0\u04f6\u04ed\u04ea\u04e3\u04bf", "\u0518\u051f\u0521\u2575\u0547\u0545\u0553\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0528\u050f\u0509\u0512\u0515\u051c\u0540\u0552\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0528\u050f\u0509\u0512\u0515\u051c\u0540", "\u066f\u0630\u063f\u063a\u063d\u063a\u0627\u066d\u066f\u066d\u067b\u067a\u0605", "\u0427\u0472\u0475\u0472\u046f\u0425\u0427\u0425\u0433\u0432\u044d", "\u0498\u049a\u048b\u04bc\u0493\u049e\u048c\u048c\u04c3\u04c1\u04d7\u04d6\u04b3\u0495\u049e\u0489\u049e\u04d0\u0493\u049e\u0491\u0498\u04d0\u04bc\u0493\u049e\u048c\u048c\u04c4", "\u0386\u038f\u039d\u0386\u03ad\u0381\u038a\u038b\u03d2\u03d0\u03c6\u03c7\u03a7", "\u054f\u055b\u055f\u054b\u0546\u0559\u0516\u0514\u0502\u0566\u0540\u054b\u055c\u054b\u0505\u0546\u054b\u0544\u054d\u0505\u0565\u0548\u0540\u054f\u0549\u055e\u0511\u0503\u0570", "\u00df\u00d0\u00d3\u00d2\u00d9\u0080\u0082\u0094\u0095\u00f0\u00d6\u00dd\u00ca\u00dd\u0093\u00d0\u00dd\u00d2\u00db\u0093\u00f3\u00de\u00d6\u00d9\u00df\u00c8\u0087", "\u05f2\u05e9\u05d5\u05f2\u05f4\u05ef\u05e8\u05e1\u05ba\u05b8\u05ae\u05af\u05ca\u05ec\u05e7\u05f0\u05e7\u05a9\u05ea\u05e7\u05e8\u05e1\u05a9\u05d5\u05f2\u05f4\u05ef\u05e8\u05e1\u05bd", "\u059d\u059c\u0587\u059a\u0595\u058a\u05cf\u05cd\u05db\u05da\u05a5", "\u05a6\u05a7\u05bc\u05a1\u05ae\u05b1\u0589\u05a4\u05a4\u05f4\u05f6\u05e0\u05e1\u059e", "\u05e1\u05f7\u05ff\u05e2\u05aa\u05a8\u05be\u05bf\u05c0", "\u034e\u0358\u0350\u034d\u0305\u0307\u0311\u0373\u0310\u036f", "\u0589\u059f\u0597\u058a\u05ce\u05c2\u05c0\u05d6\u05b4\u05d7\u05a8", "\u02d8\u02ce\u02c6\u02db\u0293\u0291\u0287\u02e5\u02e6\u0286\u02f9", "\u0322\u032d\u032a\u0325\u0328\u032d\u033e\u0321\u0378\u037a\u036c\u036d\u0312"})
public final class Class1047 {
    public static double field4288 = 0.8277762643068324;
    public static float field4289;
    public static float field4290 = 0.42870766f;
    public static double field4291;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite IaZ5iwvv1aCgmj(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1047.GQVsxaY6Wb4Zb1b4(k2, 356066942));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block10: {
                int n3;
                void e2;
                int n4 = f2 < q2.length ? 17896 : 17897;
                while (true) {
                    int n5;
                    if ((n5 = n4) == 17896) {
                        try {
                            int a2 = Integer.parseInt(Class1047.GQVsxaY6Wb4Zb1b4(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block10;
                        }
                    }
                    if (n5 != 17897) break block2;
                    n4 = 17895;
                }
                int n6 = e2 % 59557 != m2.intValue() ? 7522 : 7521;
                while ((n3 = n6) != 7521) {
                    if (n3 == 7522) {
                        n6 = 7520;
                        continue;
                    }
                    break block10;
                }
                String c2 = Class1047.GQVsxaY6Wb4Zb1b4(r2[f2], l2);
                String[] d2 = c2.split("<>");
                s2 = d2[0];
                t2 = d2[1];
                break;
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1047.GQVsxaY6Wb4Zb1b4(k2, 356066942) + " " + l2 + " " + m2);
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
        f\u200e = "MonstersFill";
        field4289 = Float.intBitsToFloat(1050166150);
        n\u200e = "saturation";
        v\u200e = "Invisibles";
        bH\u200e = "in places, number of blocks";
        field4291 = Double.longBitsToDouble(4605992183682535077L);
    }

    private static String GQVsxaY6Wb4Zb1b4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

