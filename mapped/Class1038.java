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
@HACHIMI_CLIENT(mv=100, d1={"\u9be4\u9be0\u9be8\u9be3\u9be6\u9be4\u9be3\u9be3", "\u8d7d\u8d78\u8d73\u8d73\u8d7a\u8d79\u8d7c\u8d7e", "\ud1b5\ud1b4\ud1b1\ud1ba\ud1b0\ud1b7\ud1bb\ud1bb", "\u6b96\u6b92\u6b92\u6b91\u6b94\u6b97\u6b95\u6b92", "\u0ca0\u0ca2\u0ca1\u0ca1\u0cae\u0ca1\u0ca5", "\u8e05\u8e03\u8e08\u8e00\u8e06\u8e05\u8e05\u8e00", "\u111c\u1111\u111e\u1119\u111d\u111b\u111f\u111b", "\u9ab4\u9ab0\u9ab1\u9ab2\u9ab1\u9ab4\u9ab1\u9ab3", "\u3843\u3841\u3841\u3849\u3844\u3840\u3844\u3849", "\ub7cf\ub7cc\ub7c9\ub7ca\ub7cd\ub7c9\ub7cf\ub7c8", "\udaf8\udafc\udafa\udaf9\udafb\udaff\udaf9\udaf8", "\u8cdd\u8cdf\u8cd9\u8cd8\u8cd3\u8cde\u8cd9\u8cda", "\ua171\ua172\ua175\ua173\ua173\ua17a\ua172\ua174", "\udfe4\udfe5\udfe1\udfe7\udfe5\udfe7\udfe4\udfec", "\u507e\u5071\u507a\u5070\u507d\u507b\u507c\u507b"}, d2={"\u0452\u0467\u044e\u243a\u0408\u040a\u041c\u0478\u045e\u0455\u0442\u0455\u041b\u0458\u0455\u045a\u0453\u041b\u0467\u0440\u0446\u045d\u045a\u0453\u040f\u041d\u0478\u045e\u0455\u0442\u0455\u041b\u0458\u0455\u045a\u0453\u041b\u0467\u0440\u0446\u045d\u045a\u0453\u040f", "\u049e\u04c1\u04ce\u04cb\u04cc\u04cb\u04d6\u049c\u049e\u049c\u048a\u048b\u04f4", "@\u0015\u0012\u0015\bB@BTU*", "\u00b8\u00ba\u00ab\u009c\u00b3\u00be\u00ac\u00ac\u00e3\u00e1\u00f7\u00f6\u0093\u00b5\u00be\u00a9\u00be\u00f0\u00b3\u00be\u00b1\u00b8\u00f0\u009c\u00b3\u00be\u00ac\u00ac\u00e4", "\u03cb\u03c2\u03d0\u03cb\u03e0\u03cc\u03c7\u03c6\u039f\u039d\u038b\u038a\u03ea", "\u0368\u037c\u0378\u036c\u0361\u037e\u0331\u0333\u0325\u0341\u0367\u036c\u037b\u036c\u0322\u0361\u036c\u0363\u036a\u0322\u0342\u036f\u0367\u0368\u036e\u0379\u0336\u0324\u0357", "\u0157\u0158\u015b\u015a\u0151\u0108\u010a\u011c\u011d\u0178\u015e\u0155\u0142\u0155\u011b\u0158\u0155\u015a\u0153\u011b\u017b\u0156\u015e\u0151\u0157\u0140\u010f", "\u01df\u01c4\u01f8\u01df\u01d9\u01c2\u01c5\u01cc\u0197\u0195\u0183\u0182\u01e7\u01c1\u01ca\u01dd\u01ca\u0184\u01c7\u01ca\u01c5\u01cc\u0184\u01f8\u01df\u01d9\u01c2\u01c5\u01cc\u0190", "\u0010\u0011\n\u0017\u0018\u0007B@VW(", "\u047c\u047d\u0466\u047b\u0474\u046b\u0453\u047e\u047e\u042e\u042c\u043a\u043b\u0444", "\u0286\u0290\u0298\u0285\u02cd\u02cf\u02d9\u02d8\u02a7", "\u0120\u0136\u013e\u0123\u016b\u0169\u017f\u011d\u017e\u0101", "\u0384\u0392\u039a\u0387\u03c3\u03cf\u03cd\u03db\u03b9\u03da\u03a5", "\u0393\u0385\u038d\u0390\u03d8\u03da\u03cc\u03ae\u03ad\u03cd\u03b2", "\u0297\u0298\u029f\u0290\u029d\u0298\u028b\u0294\u02cd\u02cf\u02d9\u02d8\u02a7"})
public final class Class1038 {
    public static float field4265;
    public static float field4266;
    public static float field4267 = 0.87076706f;
    public static float field4268;

    private static String 9vdXgxzQgr7dyG9t(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite S9Z6SlNDepzeNq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1038.9vdXgxzQgr7dyG9t(k2, 1948303949));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 29436 : 29435;
        block6: while (true) {
            switch (n3) {
                case 29436: {
                    n3 = 29434;
                    continue block6;
                }
                case 29435: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1038.9vdXgxzQgr7dyG9t(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1038.9vdXgxzQgr7dyG9t(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1038.9vdXgxzQgr7dyG9t(k2, 1948303949) + " " + l2 + " " + m2);
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
        field4268 = Float.intBitsToFloat(1063914681);
        field4265 = Float.intBitsToFloat(1051384836);
        aS\u200e = "The max number of ticks to hold a pickaxe for the packet mine";
        field4266 = Float.intBitsToFloat(1148846080);
    }
}

