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

@HACHIMI_CLIENT(mv=100, d1={"\u108b\u108c\u108c\u1082\u108a\u1088\u108e\u1088", "\u3644\u3648\u3645\u3645\u3642\u3648\u3649\u3641", "\u9ec0\u9ec1\u9ec5\u9ec6\u9ec6\u9ec1\u9ec5\u9ec4", "\u46b9\u46bf\u46b9\u46bf\u46bf\u46bb\u46b9\u46b8", "\u6d6e\u6d6c\u6d6f\u6d6e\u6d6e\u6d6b\u6d6d\u6d6a", "\ub3d0\ub3d0\ub3d6\ub3d6\ub3d7\ub3d2\ub3d3", "\u97b8\u97bd\u97b9\u97ba\u97bd\u97bf\u97b1\u97b1", "\u5fcc\u5fc9\u5fca\u5fcb\u5fc0\u5fc8\u5fc9\u5fca", "\ue555\ue551\ue557\ue550\ue556\ue551\ue552\ue559", "\u4850\u4857\u4851\u4851\u4852\u4850\u4857\u4857", "\ua093\ua091\ua097\ua093\ua091\ua095\ua094", "\u7481\u7480\u748b\u7484\u7486\u748a\u748b\u7487", "\u617c\u617f\u6171\u617b\u6171\u617b\u6179", "\u91c2\u91c3\u91c2\u91c6\u91c4\u91c5\u91c9\u91c0", "\uabaf\uabab\uabad\uaba9\uaba5\uaba5\uaba9", "\u020c\u0200\u0209\u0200\u020a\u0209\u0200\u0209", "\ue438\ue43e\ue43e\ue43d\ue43f\ue43e\ue43e\ue434"}, d2={"\u0376\u034b\u0377\u2315\u0327\u0325\u0333\u0357\u0371\u037a\u036d\u037a\u0334\u0377\u037a\u0375\u037c\u0334\u0348\u036f\u0369\u0372\u0375\u037c\u0320\u0332\u0357\u0371\u037a\u036d\u037a\u0334\u0377\u037a\u0375\u037c\u0334\u0348\u036f\u0369\u0372\u0375\u037c\u0320", "\u053b\u0506\u053b\u2558\u056a\u0568\u057e\u051a\u053c\u0537\u0520\u0537\u0579\u053a\u0537\u0538\u0531\u0579\u0505\u0522\u0524\u053f\u0538\u0531\u056d\u057f\u051a\u053c\u0537\u0520\u0537\u0579\u053a\u0537\u0538\u0531\u0579\u0505\u0522\u0524\u053f\u0538\u0531\u056d", "\u033d\u0300\u033e\u235e\u036c\u036e\u0378\u031c\u033a\u0331\u0326\u0331\u037f\u033c\u0331\u033e\u0337\u037f\u0303\u0324\u0322\u0339\u033e\u0337\u036b\u0379\u031c\u033a\u0331\u0326\u0331\u037f\u033c\u0331\u033e\u0337\u037f\u0303\u0324\u0322\u0339\u033e\u0337\u036b", "\u02e7\u02b8\u02b7\u02b2\u02b5\u02b2\u02af\u02e5\u02e7\u02e5\u02f3\u02f2\u028d", "\u0794\u07c1\u07c6\u07c1\u07dc\u0796\u0794\u0796\u0780\u0781\u07fe", "\u02d5\u02d7\u02c6\u02f1\u02de\u02d3\u02c1\u02c1\u028e\u028c\u029a\u029b\u02fe\u02d8\u02d3\u02c4\u02d3\u029d\u02de\u02d3\u02dc\u02d5\u029d\u02f1\u02de\u02d3\u02c1\u02c1\u0289", "\u06c1\u06c8\u06da\u06c1\u06ea\u06c6\u06cd\u06cc\u0695\u0697\u0681\u0680\u06e0", "\u05b5\u05a1\u05a5\u05b1\u05bc\u05a3\u05ec\u05ee\u05f8\u059c\u05ba\u05b1\u05a6\u05b1\u05ff\u05bc\u05b1\u05be\u05b7\u05ff\u059f\u05b2\u05ba\u05b5\u05b3\u05a4\u05eb\u05f9\u058a", "\u0767\u0768\u076b\u076a\u0761\u0738\u073a\u072c\u072d\u0748\u076e\u0765\u0772\u0765\u072b\u0768\u0765\u076a\u0763\u072b\u074b\u0766\u076e\u0761\u0767\u0770\u073f", "\u02a4\u02bf\u0283\u02a4\u02a2\u02b9\u02be\u02b7\u02ec\u02ee\u02f8\u02f9\u029c\u02ba\u02b1\u02a6\u02b1\u02ff\u02bc\u02b1\u02be\u02b7\u02ff\u0283\u02a4\u02a2\u02b9\u02be\u02b7\u02eb", "\u0338\u0339\u0322\u033f\u0330\u032f\u036a\u0368\u037e\u037f\u0300", "\u031a\u031b\u0300\u031d\u0312\u030d\u0335\u0318\u0318\u0348\u034a\u035c\u035d\u0322", "\u01e2\u01f4\u01fc\u01e1\u01a9\u01ab\u01bd\u01bc\u01c3", "\u01e5\u01f3\u01fb\u01e6\u01ae\u01ac\u01ba\u01d8\u01bb\u01c4", "m{sn*&$2P3L", "\u041f\u0409\u0401\u041c\u0454\u0456\u0440\u0422\u0421\u0441\u043e", "\u0141\u014e\u0149\u0146\u014b\u014e\u015d\u0142\u011b\u0119\u010f\u010e\u0171"})
public final class Class1499 {
    public static double field5655;
    public static double field5656 = 0.11704108423127324;
    public static int field5657 = -332337470;

    static {
        a\u200e = "[";
        e\u200e = "Mode";
        field5655 = Double.longBitsToDouble(4605763229088062328L);
        aW\u200e = "LSHIFT";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String bEtCJtR3BEdInZeQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 20352 : 20353;
            block5: while (true) {
                switch (n2) {
                    case 20353: {
                        n2 = 20351;
                        continue block5;
                    }
                    case 20352: {
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
    private static CallSite mY6hyjCeiSD66r(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1499.bEtCJtR3BEdInZeQ(k2, 1090069306));
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
                int a2 = Integer.parseInt(Class1499.bEtCJtR3BEdInZeQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1499.bEtCJtR3BEdInZeQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1499.bEtCJtR3BEdInZeQ(k2, 1090069306) + " " + l2 + " " + m2);
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

