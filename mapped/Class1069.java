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

@HACHIMI_CLIENT(mv=100, d1={"\u5ab2\u5ab4\u5ab4\u5ab2\u5abf\u5ab6\u5abe\u5ab1", "\uaa8c\uaa8c\uaa8c\uaa8c\uaa89\uaa8f\uaa88\uaa8b", "\u0555\u0554\u0553\u0551\u055f\u0556\u0550\u0557", "\u81a7\u81aa\u81a1\u81ab\u81ab\u81a2\u81a1\u81a2", "\u5ee2\u5ee6\u5ee7\u5ee0\u5ee5\u5ee8\u5ee0\u5ee8", "\u481f\u481f\u4816\u481f\u481e\u4819\u4818\u481a", "\u3b66\u3b60\u3b64\u3b60\u3b66\u3b6d\u3b64\u3b6c", "\u1d3d\u1d3f\u1d3b\u1d3b\u1d3c\u1d3b\u1d3c", "\u42cb\u42cb\u42cd\u42c8\u42c9\u42cc\u42ce\u42ce", "\u7730\u7735\u7737\u7733\u7730\u7738\u7732\u7731", "\ub4b1\ub4b1\ub4b0\ub4bb\ub4b3\ub4b3\ub4bb\ub4b5", "\u62e9\u62ee\u62eb\u62e5\u62ee\u62e4\u62ed\u62ec", "\u537f\u537f\u537a\u537b\u5378\u537d\u5371", "\u3074\u3076\u3074\u3074\u3071\u307d\u307c\u3072", "\u35b8\u35b2\u35b3\u35bf\u35b2\u35be\u35ba\u35b2", "\u51d5\u51d2\u51de\u51d5\u51df\u51d5\u51d1\u51d5"}, d2={"\u041d\u043a\u041d\u247c\u044e\u044c\u045a\u043e\u0418\u0413\u0404\u0413\u045d\u041e\u0413\u041c\u0415\u045d\u0421\u0406\u0400\u041b\u041c\u0415\u0449\u045b\u043e\u0418\u0413\u0404\u0413\u045d\u041e\u0413\u041c\u0415\u045d\u0421\u0406\u0400\u041b\u041c\u0415\u0449", "\u0790\u07b7\u078f\u27f1\u07c3\u07c1\u07d7\u07b3\u0795\u079e\u0789\u079e\u07d0\u0793\u079e\u0791\u0798\u07d0\u07ac\u078b\u078d\u0796\u0791\u0798\u07c4\u07d6\u07b3\u0795\u079e\u0789\u079e\u07d0\u0793\u079e\u0791\u0798\u07d0\u07ac\u078b\u078d\u0796\u0791\u0798\u07c4", "\u062f\u0670\u067f\u067a\u067d\u067a\u0667\u062d\u062f\u062d\u063b\u063a\u0645", "\u0238\u026d\u026a\u026d\u0270\u023a\u0238\u023a\u022c\u022d\u0252", "\u04d9\u04db\u04ca\u04fd\u04d2\u04df\u04cd\u04cd\u0482\u0480\u0496\u0497\u04f2\u04d4\u04df\u04c8\u04df\u0491\u04d2\u04df\u04d0\u04d9\u0491\u04fd\u04d2\u04df\u04cd\u04cd\u0485", "\u0593\u059a\u0588\u0593\u05b8\u0594\u059f\u059e\u05c7\u05c5\u05d3\u05d2\u05b2", "\u04d7\u04c3\u04c7\u04d3\u04de\u04c1\u048e\u048c\u049a\u04fe\u04d8\u04d3\u04c4\u04d3\u049d\u04de\u04d3\u04dc\u04d5\u049d\u04fd\u04d0\u04d8\u04d7\u04d1\u04c6\u0489\u049b\u04e8", "\u02b7\u02b8\u02bb\u02ba\u02b1\u02e8\u02ea\u02fc\u02fd\u0298\u02be\u02b5\u02a2\u02b5\u02fb\u02b8\u02b5\u02ba\u02b3\u02fb\u029b\u02b6\u02be\u02b1\u02b7\u02a0\u02ef", "\u030c\u0317\u032b\u030c\u030a\u0311\u0316\u031f\u0344\u0346\u0350\u0351\u0334\u0312\u0319\u030e\u0319\u0357\u0314\u0319\u0316\u031f\u0357\u032b\u030c\u030a\u0311\u0316\u031f\u0343", "\u03f6\u03f7\u03ec\u03f1\u03fe\u03e1\u03a4\u03a6\u03b0\u03b1\u03ce", "\u0745\u0744\u075f\u0742\u074d\u0752\u076a\u0747\u0747\u0717\u0715\u0703\u0702\u077d", "\u01e8\u01fe\u01f6\u01eb\u01a3\u01a1\u01b7\u01b6\u01c9", "\u01f8\u01ee\u01e6\u01fb\u01b3\u01b1\u01a7\u01c5\u01a6\u01d9", "\u010b\u011d\u0115\u0108\u014c\u0140\u0142\u0154\u0136\u0155\u012a", "\u0098\u008e\u0086\u009b\u00d3\u00d1\u00c7\u00a5\u00a6\u00c6\u00b9", "\u0321\u032e\u0329\u0326\u032b\u032e\u033d\u0322\u037b\u0379\u036f\u036e\u0311"})
public final class Class1069 {
    public static float field4357;
    public static float field4358;
    public static double field4359;
    public static double field4360;

    /*
     * WARNING - void declaration
     */
    private static CallSite iNNJ95r9flTlwT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1069.O6WqelcbYbaISojq(k2, 867923617));
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
                int a2 = Integer.parseInt(Class1069.O6WqelcbYbaISojq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1069.O6WqelcbYbaISojq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1069.O6WqelcbYbaISojq(k2, 867923617) + " " + l2 + " " + m2);
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
        K\u200e = "NONE";
        field4358 = Float.intBitsToFloat(1053140072);
        field4357 = Float.intBitsToFloat(1055964764);
        field4359 = Double.longBitsToDouble(4568609923121288704L);
        field4360 = Double.longBitsToDouble(4604420234971177522L);
        bJ\u200e = "AccelerateSpeed";
    }

    private static String O6WqelcbYbaISojq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

