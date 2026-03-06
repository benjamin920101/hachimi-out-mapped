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
@HACHIMI_CLIENT(mv=100, d1={"\u598d\u598c\u5988\u598d\u5989\u5989\u5989\u598e", "\uacf1\uacfc\uacf7\uacf6\uacfd\uacf6\uacf4\uacf4", "\u4b26\u4b28\u4b29\u4b22\u4b26\u4b26\u4b26\u4b25", "\ub830\ub830\ub830\ub835\ub837\ub83e\ub835\ub830", "\u7717\u7717\u771d\u7711\u7715\u771d\u7716\u7717", "\uacd7\uacd8\uacd8\uacd1\uacd5\uacd7\uacd0\uacd9", "\u746c\u7468\u7464\u746e\u746c\u7468\u746d\u7465", "\u8df0\u8df1\u8df3\u8df1\u8df5\u8dff\u8df5\u8df4", "\uc6a3\uc6a4\uc6a2\uc6a0\uc6a4\uc6ad\uc6ad\uc6ac", "\u83c8\u83cc\u83c8\u83cf\u83c8\u83cb\u83cf\u83ca", "\u3d45\u3d4c\u3d43\u3d43\u3d42\u3d45\u3d4c\u3d43", "\u9476\u9472\u9471\u9477\u947a\u9472\u9476\u9471", "\uc09a\uc092\uc09e\uc09e\uc09a\uc09f\uc09c", "\u8fec\u8fec\u8fe8\u8fe1\u8fef\u8fef\u8fe9\u8fee", "\u03bc\u03b8\u03b0\u03b0\u03bd\u03b8\u03bf\u03bf", "\ua113\ua112\ua119\ua111\ua116\ua117\ua111\ua112"}, d2={"\u0509\u053e\u0517\u2577\u0545\u0547\u0551\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u052a\u050d\u050b\u0510\u0517\u051e\u0542\u0550\u0535\u0513\u0518\u050f\u0518\u0556\u0515\u0518\u0517\u051e\u0556\u052a\u050d\u050b\u0510\u0517\u051e\u0542", "\u03d6\u03e1\u03c9\u23a8\u039a\u0398\u038e\u03ea\u03cc\u03c7\u03d0\u03c7\u0389\u03ca\u03c7\u03c8\u03c1\u0389\u03f5\u03d2\u03d4\u03cf\u03c8\u03c1\u039d\u038f\u03ea\u03cc\u03c7\u03d0\u03c7\u0389\u03ca\u03c7\u03c8\u03c1\u0389\u03f5\u03d2\u03d4\u03cf\u03c8\u03c1\u039d", "\u023a\u0265\u026a\u026f\u0268\u026f\u0272\u0238\u023a\u0238\u022e\u022f\u0250", "\u050f\u055a\u055d\u055a\u0547\u050d\u050f\u050d\u051b\u051a\u0565", "\u07d1\u07d3\u07c2\u07f5\u07da\u07d7\u07c5\u07c5\u078a\u0788\u079e\u079f\u07fa\u07dc\u07d7\u07c0\u07d7\u0799\u07da\u07d7\u07d8\u07d1\u0799\u07f5\u07da\u07d7\u07c5\u07c5\u078d", "\u001b\u0012\u0000\u001b0\u001c\u0017\u0016OM[Z:", "\u064a\u065e\u065a\u064e\u0643\u065c\u0613\u0611\u0607\u0663\u0645\u064e\u0659\u064e\u0600\u0643\u064e\u0641\u0648\u0600\u0660\u064d\u0645\u064a\u064c\u065b\u0614\u0606\u0675", "\u03f1\u03fe\u03fd\u03fc\u03f7\u03ae\u03ac\u03ba\u03bb\u03de\u03f8\u03f3\u03e4\u03f3\u03bd\u03fe\u03f3\u03fc\u03f5\u03bd\u03dd\u03f0\u03f8\u03f7\u03f1\u03e6\u03a9", "\u0435\u042e\u0412\u0435\u0433\u0428\u042f\u0426\u047d\u047f\u0469\u0468\u040d\u042b\u0420\u0437\u0420\u046e\u042d\u0420\u042f\u0426\u046e\u0412\u0435\u0433\u0428\u042f\u0426\u047a", "\u025b\u025a\u0241\u025c\u0253\u024c\u0209\u020b\u021d\u021c\u0263", "\u0414\u0415\u040e\u0413\u041c\u0403\u043b\u0416\u0416\u0446\u0444\u0452\u0453\u042c", "\u0396\u0380\u0388\u0395\u03dd\u03df\u03c9\u03c8\u03b7", "\u073c\u072a\u0722\u073f\u0777\u0775\u0763\u0701\u0762\u071d", "\u062f\u0639\u0631\u062c\u0668\u0664\u0666\u0670\u0612\u0671\u060e", "\u01c5\u01d3\u01db\u01c6\u018e\u018c\u019a\u01f8\u01fb\u019b\u01e4", "\u0735\u073a\u073d\u0732\u073f\u073a\u0729\u0736\u076f\u076d\u077b\u077a\u0705"})
public final class Class1066 {
    public static int field4346 = 829344318;
    public static float field4347;
    public static int field4348 = 695164364;
    public static float field4349;
    public static float field4350 = 0.17773283f;

    static {
        field4349 = Float.intBitsToFloat(1059621623);
        field4347 = Float.intBitsToFloat(1052774812);
        K\u200e = "Logs PlayerActionC2SPacket";
        aD\u200e = "Ticks";
    }

    private static String qywhBcJDaf0Yd4gF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 6QalBaqHDGJTJo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1066.qywhBcJDaf0Yd4gF(k2, -1991761131));
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
                int a2 = Integer.parseInt(Class1066.qywhBcJDaf0Yd4gF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1066.qywhBcJDaf0Yd4gF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1066.qywhBcJDaf0Yd4gF(k2, -1991761131) + " " + l2 + " " + m2);
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

