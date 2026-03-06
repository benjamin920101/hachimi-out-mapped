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
@HACHIMI_CLIENT(mv=100, d1={"\u2698\u2692\u269f\u269b\u269d\u269d\u269a", "\ub61e\ub61a\ub618\ub61b\ub61a\ub618\ub619\ub61a", "\uaa29\uaa22\uaa2a\uaa2d\uaa2d\uaa22\uaa29\uaa2b", "\u0210\u0211\u0211\u0212\u0215\u0212\u0211\u0217", "\u4f66\u4f6a\u4f66\u4f66\u4f62\u4f63\u4f66\u4f65", "\ud20c\ud200\ud20a\ud201\ud20c\ud201\ud200\ud20e", "\u9eec\u9ee6\u9ee8\u9eec\u9ee6\u9eee\u9eed\u9eee", "\u5485\u5486\u5480\u5482\u5480\u5483\u5487\u5489", "\u23df\u23dc\u23d8\u23de\u23df\u23d9\u23d4", "\u7b52\u7b53\u7b50\u7b50\u7b57\u7b5a\u7b57\u7b5b", "\ua289\ua283\ua28d\ua283\ua283\ua28e\ua28c\ua28d", "\u9b33\u9b36\u9b3f\u9b33\u9b3f\u9b30\u9b37\u9b36", "\u452d\u452a\u452e\u4522\u4522\u452d\u4529\u4522", "\u96a2\u96a5\u96a8\u96a2\u96a6\u96a7\u96a2\u96a5"}, d2={"\u07ef\u07b0\u07bf\u07ba\u07bd\u07ba\u07a7\u07ed\u07ef\u07ed\u07fb\u07fa\u0785", "\u0204\u0251\u0256\u0251\u024c\u0206\u0204\u0206\u0210\u0211\u026e", "\u044e\u044c\u045d\u046a\u0445\u0448\u045a\u045a\u0415\u0417\u0401\u0400\u0465\u0443\u0448\u045f\u0448\u0406\u0445\u0448\u0447\u044e\u0406\u046a\u0445\u0448\u045a\u045a\u0412", "\u0136\u013f\u012d\u0136\u011d\u0131\u013a\u013b\u0162\u0160\u0176\u0177\u0117", "\u0173\u0167\u0163\u0177\u017a\u0165\u012a\u0128\u013e\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0159\u0174\u017c\u0173\u0175\u0162\u012d\u013f\u014c", "\u01b4\u01bb\u01b8\u01b9\u01b2\u01eb\u01e9\u01ff\u01fe\u019b\u01bd\u01b6\u01a1\u01b6\u01f8\u01bb\u01b6\u01b9\u01b0\u01f8\u0198\u01b5\u01bd\u01b2\u01b4\u01a3\u01ec", "\u032e\u0335\u0309\u032e\u0328\u0333\u0334\u033d\u0366\u0364\u0372\u0373\u0316\u0330\u033b\u032c\u033b\u0375\u0336\u033b\u0334\u033d\u0375\u0309\u032e\u0328\u0333\u0334\u033d\u0361", "\u02a5\u02a4\u02bf\u02a2\u02ad\u02b2\u02f7\u02f5\u02e3\u02e2\u029d", "\u012b\u012a\u0131\u012c\u0123\u013c\u0104\u0129\u0129\u0179\u017b\u016d\u016c\u0113", "\u0505\u0513\u051b\u0506\u054e\u054c\u055a\u055b\u0524", "\u065a\u064c\u0644\u0659\u0611\u0613\u0605\u0667\u0604\u067b", "\u05ba\u05ac\u05a4\u05b9\u05fd\u05f1\u05f3\u05e5\u0587\u05e4\u059b", "lzro'%3QR2M", "\u020b\u0204\u0203\u020c\u0201\u0204\u0217\u0208\u0251\u0253\u0245\u0244\u023b"})
public final class Class1283 {
    public static double field5001 = Double.longBitsToDouble(4603115569442260360L);
    public static double field5002;
    public static double field5003;
    public static double field5004;
    public static double field5005;
    public static float field5006;
    public static double field5007;

    static {
        field5007 = Double.longBitsToDouble(0x4000000000000000L);
        field5003 = Double.longBitsToDouble(4600633148885405524L);
        field5006 = Float.intBitsToFloat(1060420320);
        field5002 = Double.longBitsToDouble(4601956857983933986L);
        field5004 = Double.longBitsToDouble(4605640931518987460L);
        field5005 = Double.longBitsToDouble(4605359236721993010L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 7TQPJN9ANWgryJ73(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 12075 : 12076;
            block5: while (true) {
                switch (n2) {
                    case 12076: {
                        n2 = 12074;
                        continue block5;
                    }
                    case 12075: {
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
    private static CallSite 7uvXpjIed1x9Z2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1283.7TQPJN9ANWgryJ73(k2, -2069471230));
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
                int a2 = Integer.parseInt(Class1283.7TQPJN9ANWgryJ73(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1283.7TQPJN9ANWgryJ73(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1283.7TQPJN9ANWgryJ73(k2, -2069471230) + " " + l2 + " " + m2);
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

