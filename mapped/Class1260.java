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
@HACHIMI_CLIENT(mv=100, d1={"\u9a67\u9a6d\u9a64\u9a60\u9a6d\u9a67\u9a60\u9a67", "\u118c\u1180\u118b\u118f\u118a\u118e\u118c\u118b", "\u475a\u4759\u475c\u475c\u475f\u4751\u4751", "\u0fe0\u0fe7\u0fec\u0fe7\u0fec\u0fe4\u0fe4\u0fe0", "\u6d7a\u6d7a\u6d78\u6d7f\u6d78\u6d7c\u6d7f\u6d79", "\ud734\ud73b\ud733\ud736\ud733\ud733\ud734\ud730", "\ub226\ub226\ub223\ub227\ub222\ub22c\ub224\ub221", "\ua959\ua95d\ua95c\ua959\ua95b\ua95d\ua95b", "\u2843\u2841\u2840\u2846\u2847\u284f\u2841\u2841", "\u8379\u8372\u8370\u8373\u8371\u8373\u8375", "\u013a\u013c\u0130\u0138\u013a\u0138\u013a\u013f", "\ucaba\ucabb\ucab6\ucab9\ucabc\ucabb\ucabf\ucab6", "\u7c9e\u7c9d\u7c98\u7c95\u7c99\u7c9b\u7c98\u7c95", "\ub969\ub96e\ub965\ub965\ub96f\ub96a\ub96e\ub969", "\u6cd4\u6cd6\u6cd5\u6cde\u6cd2\u6cd4\u6cd7\u6cd3"}, d2={"\u02ce\u02c6\u02ce\u22a4\u0296\u0294\u0282\u02e6\u02c0\u02cb\u02dc\u02cb\u0285\u02c6\u02cb\u02c4\u02cd\u0285\u02f9\u02de\u02d8\u02c3\u02c4\u02cd\u0291\u0283\u02e6\u02c0\u02cb\u02dc\u02cb\u0285\u02c6\u02cb\u02c4\u02cd\u0285\u02f9\u02de\u02d8\u02c3\u02c4\u02cd\u0291", "\u0580\u05df\u05d0\u05d5\u05d2\u05d5\u05c8\u0582\u0580\u0582\u0594\u0595\u05ea", "\u0697\u06c2\u06c5\u06c2\u06df\u0695\u0697\u0695\u0683\u0682\u06fd", "\u03d7\u03d5\u03c4\u03f3\u03dc\u03d1\u03c3\u03c3\u038c\u038e\u0398\u0399\u03fc\u03da\u03d1\u03c6\u03d1\u039f\u03dc\u03d1\u03de\u03d7\u039f\u03f3\u03dc\u03d1\u03c3\u03c3\u038b", "\u01d3\u01da\u01c8\u01d3\u01f8\u01d4\u01df\u01de\u0187\u0185\u0193\u0192\u01f2", "\u04e5\u04f1\u04f5\u04e1\u04ec\u04f3\u04bc\u04be\u04a8\u04cc\u04ea\u04e1\u04f6\u04e1\u04af\u04ec\u04e1\u04ee\u04e7\u04af\u04cf\u04e2\u04ea\u04e5\u04e3\u04f4\u04bb\u04a9\u04da", "\u0193\u019c\u019f\u019e\u0195\u01cc\u01ce\u01d8\u01d9\u01bc\u019a\u0191\u0186\u0191\u01df\u019c\u0191\u019e\u0197\u01df\u01bf\u0192\u019a\u0195\u0193\u0184\u01cb", "\u04c3\u04d8\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048b\u0489\u049f\u049e\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048c", "\u00ea\u00eb\u00f0\u00ed\u00e2\u00fd\u00b8\u00ba\u00ac\u00ad\u00d2", "\u05d8\u05d9\u05c2\u05df\u05d0\u05cf\u05f7\u05da\u05da\u058a\u0588\u059e\u059f\u05e0", "\u05f3\u05e5\u05ed\u05f0\u05b8\u05ba\u05ac\u05ad\u05d2", "}kc~64\"@#\\", "\u0502\u0514\u051c\u0501\u0545\u0549\u054b\u055d\u053f\u055c\u0523", "\u0595\u0583\u058b\u0596\u05de\u05dc\u05ca\u05a8\u05ab\u05cb\u05b4", "\u044d\u0442\u0445\u044a\u0447\u0442\u0451\u044e\u0417\u0415\u0403\u0402\u047d"})
public final class Class1260 {
    public static float field4930;
    public static double field4931;
    public static float field4932;
    public static double field4933 = 0.17318513190324802;

    private static String 34d916v61SAQo9rx(String a2, int b2) {
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
    private static CallSite w94P6AwGnmwz7J(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1260.34d916v61SAQo9rx(k2, -1675645449));
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
                int a2 = Integer.parseInt(Class1260.34d916v61SAQo9rx(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1260.34d916v61SAQo9rx(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1260.34d916v61SAQo9rx(k2, -1675645449) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 27269 : 27270;
        block7: while (true) {
            switch (n3) {
                case 27270: {
                    n3 = 27268;
                    continue block7;
                }
                case 27269: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field4932 = Float.intBitsToFloat(1056317552);
        field4930 = Float.intBitsToFloat(1061344599);
        field4931 = Double.longBitsToDouble(4604853098948083172L);
        bE\u200e = "Players";
    }
}

