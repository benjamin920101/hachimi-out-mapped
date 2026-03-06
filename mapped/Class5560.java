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

@HACHIMI_CLIENT(mv=100, d1={"\u315b\u3159\u315d\u315e\u315f\u315c\u3158", "\ub8ee\ub8e9\ub8e0\ub8ee\ub8ef\ub8ec\ub8e0\ub8ee", "\u3bbe\u3bba\u3bb8\u3bbe\u3bb8\u3bb8\u3bbc\u3bbc", "\uc3d2\uc3de\uc3da\uc3d2\uc3dc\uc3da\uc3d3", "\ua322\ua327\ua325\ua325\ua327\ua320\ua327\ua328", "\u0cf7\u0cf7\u0cfd\u0cf2\u0cf6\u0cf4\u0cf0\u0cf2", "\u9763\u9760\u9764\u9766\u9766\u976f\u976f\u9765", "\u70bb\u70bb\u70b8\u70b0\u70ba\u70b1\u70bc\u70bb", "\u1f25\u1f27\u1f21\u1f26\u1f23\u1f27\u1f2d\u1f21", "\u358b\u358d\u3582\u3582\u358a\u3582\u358f\u358e", "\u20f7\u20f6\u20f5\u20fb\u20fb\u20f5\u20f3\u20f5", "\u63e5\u63e3\u63e1\u63e5\u63e0\u63e3\u63e9\u63e6", "\u4372\u4372\u4376\u4374\u437f\u437e\u4372\u4373", "\u7b9d\u7b92\u7b93\u7b99\u7b9b\u7b92\u7b98", "\ubc65\ubc67\ubc63\ubc62\ubc61\ubc67\ubc61\ubc6a", "\ud0b5\ud0b0\ud0b6\ud0bc\ud0b3\ud0b1\ud0b4\ud0b7"}, d2={"\u0432\u0439\u0434\u2456\u0464\u0466\u0470\u0414\u0432\u0439\u042e\u0439\u0477\u0434\u0439\u0436\u043f\u0477\u040b\u042c\u042a\u0431\u0436\u043f\u0463\u0471\u0414\u0432\u0439\u042e\u0439\u0477\u0434\u0439\u0436\u043f\u0477\u040b\u042c\u042a\u0431\u0436\u043f\u0463", "\u0136\u013d\u0131\u2152\u0160\u0162\u0174\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167\u0175\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167", "\u02a0\u02ff\u02f0\u02f5\u02f2\u02f5\u02e8\u02a2\u02a0\u02a2\u02b4\u02b5\u02ca", "\u02f0\u02a5\u02a2\u02a5\u02b8\u02f2\u02f0\u02f2\u02e4\u02e5\u029a", "\u0378\u037a\u036b\u035c\u0373\u037e\u036c\u036c\u0323\u0321\u0337\u0336\u0353\u0375\u037e\u0369\u037e\u0330\u0373\u037e\u0371\u0378\u0330\u035c\u0373\u037e\u036c\u036c\u0324", "\u068a\u0683\u0691\u068a\u06a1\u068d\u0686\u0687\u06de\u06dc\u06ca\u06cb\u06ab", "\u00ac\u00b8\u00bc\u00a8\u00a5\u00ba\u00f5\u00f7\u00e1\u0085\u00a3\u00a8\u00bf\u00a8\u00e6\u00a5\u00a8\u00a7\u00ae\u00e6\u0086\u00ab\u00a3\u00ac\u00aa\u00bd\u00f2\u00e0\u0093", "\u05ea\u05e5\u05e6\u05e7\u05ec\u05b5\u05b7\u05a1\u05a0\u05c5\u05e3\u05e8\u05ff\u05e8\u05a6\u05e5\u05e8\u05e7\u05ee\u05a6\u05c6\u05eb\u05e3\u05ec\u05ea\u05fd\u05b2", "\u000b\u0010,\u000b\r\u0016\u0011\u0018CAWV3\u0015\u001e\t\u001eP\u0013\u001e\u0011\u0018P,\u000b\r\u0016\u0011\u0018D", "\u0787\u0786\u079d\u0780\u078f\u0790\u07d5\u07d7\u07c1\u07c0\u07bf", "\u0144\u0145\u015e\u0143\u014c\u0153\u016b\u0146\u0146\u0116\u0114\u0102\u0103\u017c", "\u0225\u0233\u023b\u0226\u026e\u026c\u027a\u027b\u0204", "\u0735\u0723\u072b\u0736\u077e\u077c\u076a\u0708\u076b\u0714", "cu}`$(*<^=B", "\u0654\u0642\u064a\u0657\u061f\u061d\u060b\u0669\u066a\u060a\u0675", "\f\u0003\u0004\u000b\u0006\u0003\u0010\u000fVTBC<"})
public final class Class5560 {
    public static double field10532;
    public static double field10533;

    static {
        H\u200e = "GET";
        aA\u200e = "Shaders";
        field10532 = Double.longBitsToDouble(4603570971689555080L);
        field10533 = Double.longBitsToDouble(4604311127791954097L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String XxJrQSXJWP65FQ2B(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 38136 : 38137;
            block5: while (true) {
                switch (n2) {
                    case 38137: {
                        n2 = 38135;
                        continue block5;
                    }
                    case 38136: {
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
     * WARNING - void declaration
     */
    private static CallSite rcA6JFcwST6O0a(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5560.XxJrQSXJWP65FQ2B(k2, 1946911850));
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
                int a2 = Integer.parseInt(Class5560.XxJrQSXJWP65FQ2B(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5560.XxJrQSXJWP65FQ2B(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5560.XxJrQSXJWP65FQ2B(k2, 1946911850) + " " + l2 + " " + m2);
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

