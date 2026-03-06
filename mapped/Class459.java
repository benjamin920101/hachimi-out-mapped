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

@HACHIMI_CLIENT(mv=100, d1={"\u3ec0\u3ec6\u3ec5\u3ec0\u3ec2\u3ec1\u3ec3\u3ec2", "\u1353\u1351\u1354\u135d\u1355\u1350\u1352", "\u71c8\u71cb\u71cf\u71c6\u71ca\u71cb\u71ca\u71ce", "\u22bb\u22b8\u22b9\u22ba\u22bb\u22bb\u22bb\u22b8", "\u0112\u0113\u011f\u0117\u011e\u0111\u0112\u0117", "\ude94\ude97\ude94\ude9a\ude9a\ude9a\ude92\ude9a", "\u6a20\u6a25\u6a21\u6a2d\u6a23\u6a2d\u6a20\u6a26", "\ua897\ua892\ua893\ua897\ua894\ua896\ua89c\ua890", "\u8e73\u8e76\u8e72\u8e75\u8e77\u8e7d\u8e70\u8e71", "\uc85f\uc85d\uc85e\uc85c\uc85e\uc85e\uc859", "\u5fd0\u5fd3\u5fd1\u5fde\u5fd6\u5fd0\u5fd1", "\u5244\u5240\u5247\u5247\u5241\u5247\u5247\u524f", "\u32fb\u32fe\u32f7\u32fd\u32fa\u32fc\u32fa\u32ff", "\u147d\u147a\u147a\u147b\u147e\u147e\u1470\u1479", "\u92dd\u92d9\u92da\u92d7\u92d6\u92d7\u92d8\u92d9", "\uc328\uc32e\uc32e\uc32d\uc32a\uc32f\uc32c\uc328", "\uc183\uc181\uc184\uc183\uc186\uc181\uc182\uc183"}, d2={"\u02ff\u02ec\u02f2\u2296\u02a4\u02a6\u02b0\u02d4\u02f2\u02f9\u02ee\u02f9\u02b7\u02f4\u02f9\u02f6\u02ff\u02b7\u02cb\u02ec\u02ea\u02f1\u02f6\u02ff\u02a3\u02b1\u02d4\u02f2\u02f9\u02ee\u02f9\u02b7\u02f4\u02f9\u02f6\u02ff\u02b7\u02cb\u02ec\u02ea\u02f1\u02f6\u02ff\u02a3", "\u0505\u0516\u0509\u256c\u055e\u055c\u054a\u052e\u0508\u0503\u0514\u0503\u054d\u050e\u0503\u050c\u0505\u054d\u0531\u0516\u0510\u050b\u050c\u0505\u0559\u054b\u052e\u0508\u0503\u0514\u0503\u054d\u050e\u0503\u050c\u0505\u054d\u0531\u0516\u0510\u050b\u050c\u0505\u0559", "\u021f\u020c\u0214\u2276\u0244\u0246\u0250\u0234\u0212\u0219\u020e\u0219\u0257\u0214\u0219\u0216\u021f\u0257\u022b\u020c\u020a\u0211\u0216\u021f\u0243\u0251\u0234\u0212\u0219\u020e\u0219\u0257\u0214\u0219\u0216\u021f\u0257\u022b\u020c\u020a\u0211\u0216\u021f\u0243", "\u0156\u0109\u0106\u0103\u0104\u0103\u011e\u0154\u0156\u0154\u0142\u0143\u013c", "\u0231\u0264\u0263\u0264\u0279\u0233\u0231\u0233\u0225\u0224\u025b", "\u00ac\u00ae\u00bf\u0088\u00a7\u00aa\u00b8\u00b8\u00f7\u00f5\u00e3\u00e2\u0087\u00a1\u00aa\u00bd\u00aa\u00e4\u00a7\u00aa\u00a5\u00ac\u00e4\u0088\u00a7\u00aa\u00b8\u00b8\u00f0", "\u02e4\u02ed\u02ff\u02e4\u02cf\u02e3\u02e8\u02e9\u02b0\u02b2\u02a4\u02a5\u02c5", "\u078c\u0798\u079c\u0788\u0785\u079a\u07d5\u07d7\u07c1\u07a5\u0783\u0788\u079f\u0788\u07c6\u0785\u0788\u0787\u078e\u07c6\u07a6\u078b\u0783\u078c\u078a\u079d\u07d2\u07c0\u07b3", "\u019f\u0190\u0193\u0192\u0199\u01c0\u01c2\u01d4\u01d5\u01b0\u0196\u019d\u018a\u019d\u01d3\u0190\u019d\u0192\u019b\u01d3\u01b3\u019e\u0196\u0199\u019f\u0188\u01c7", "\u07ab\u07b0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e3\u07e1\u07f7\u07f6\u0793\u07b5\u07be\u07a9\u07be\u07f0\u07b3\u07be\u07b1\u07b8\u07f0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e4", "\u0134\u0135\u012e\u0133\u013c\u0123\u0166\u0164\u0172\u0173\u010c", "\u0127\u0126\u013d\u0120\u012f\u0130\u0108\u0125\u0125\u0175\u0177\u0161\u0160\u011f", "\u00a2\u00b4\u00bc\u00a1\u00e9\u00eb\u00fd\u00fc\u0083", "\u035d\u034b\u0343\u035e\u0316\u0314\u0302\u0360\u0303\u037c", "\u04c3\u04d5\u04dd\u04c0\u0484\u0488\u048a\u049c\u04fe\u049d\u04e2", "\u03ff\u03e9\u03e1\u03fc\u03b4\u03b6\u03a0\u03c2\u03c1\u03a1\u03de", "\u056c\u0563\u0564\u056b\u0566\u0563\u0570\u056f\u0536\u0534\u0522\u0523\u055c"})
public final class Class459 {
    public static int field2417 = -385350529;
    public static double field2418;
    public static float field2419 = 0.33365393f;
    public static int field2420 = -1621621102;
    public static float field2421;
    public static float field2422 = 0.5634354f;

    /*
     * Enabled aggressive block sorting
     */
    private static String glVcd4XIEkG5FyQh(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 19731 : 19730;
            block5: while (true) {
                switch (n2) {
                    case 19731: {
                        n2 = 19729;
                        continue block5;
                    }
                    case 19730: {
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
    private static CallSite E9iRLyAUSONDTf(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class459.glVcd4XIEkG5FyQh(k2, 607081144));
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
                int a2 = Integer.parseInt(Class459.glVcd4XIEkG5FyQh(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class459.glVcd4XIEkG5FyQh(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class459.glVcd4XIEkG5FyQh(k2, 607081144) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field2421 = Float.intBitsToFloat(1059856605);
        field2418 = Double.longBitsToDouble(4595976256159849864L);
        D\u200e = "The speed of the entity while moving";
        L\u200e = "Search";
        an\u200e = "fonts";
    }
}

