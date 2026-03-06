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

@HACHIMI_CLIENT(mv=100, d1={"\ub46c\ub46c\ub46d\ub461\ub46c\ub460\ub468\ub46c", "\u34a8\u34a4\u34af\u34ac\u34ae\u34ac\u34af\u34aa", "\u2b16\u2b11\u2b15\u2b1a\u2b17\u2b16\u2b11\u2b15", "\uc1f9\uc1f9\uc1f9\uc1f0\uc1fe\uc1ff\uc1fe\uc1ff", "\u8bec\u8bed\u8be8\u8be8\u8be9\u8beb\u8beb\u8bed", "\u7bb6\u7bb6\u7bb6\u7bb1\u7bbf\u7bb0\u7bbf\u7bb5", "\u2ae7\u2aea\u2ae6\u2ae5\u2ae1\u2ae0\u2aeb\u2ae4", "\u2319\u231b\u2319\u231f\u2319\u2318\u2311\u231f", "\u0578\u0571\u0574\u0575\u0571\u0571\u0578", "\uc555\uc556\uc553\uc550\uc558\uc557\uc556\uc552", "\u71bf\u71bf\u71b5\u71b4\u71b5\u71b4\u71b8\u71ba", "\u74c1\u74c4\u74c7\u74c1\u74c1\u74c2\u74c4\u74c1", "\ue284\ue282\ue28b\ue280\ue287\ue280\ue28a\ue28a", "\u1d64\u1d61\u1d61\u1d66\u1d67\u1d63\u1d67\u1d63"}, d2={"\u01bf\u01e0\u01ef\u01ea\u01ed\u01ea\u01f7\u01bd\u01bf\u01bd\u01ab\u01aa\u01d5", "\u03ae\u03fb\u03fc\u03fb\u03e6\u03ac\u03ae\u03ac\u03ba\u03bb\u03c4", "\u06ac\u06ae\u06bf\u0688\u06a7\u06aa\u06b8\u06b8\u06f7\u06f5\u06e3\u06e2\u0687\u06a1\u06aa\u06bd\u06aa\u06e4\u06a7\u06aa\u06a5\u06ac\u06e4\u0688\u06a7\u06aa\u06b8\u06b8\u06f0", "\u06b1\u06b8\u06aa\u06b1\u069a\u06b6\u06bd\u06bc\u06e5\u06e7\u06f1\u06f0\u0690", "\u06b8\u06ac\u06a8\u06bc\u06b1\u06ae\u06e1\u06e3\u06f5\u0691\u06b7\u06bc\u06ab\u06bc\u06f2\u06b1\u06bc\u06b3\u06ba\u06f2\u0692\u06bf\u06b7\u06b8\u06be\u06a9\u06e6\u06f4\u0687", "\u02ea\u02e5\u02e6\u02e7\u02ec\u02b5\u02b7\u02a1\u02a0\u02c5\u02e3\u02e8\u02ff\u02e8\u02a6\u02e5\u02e8\u02e7\u02ee\u02a6\u02c6\u02eb\u02e3\u02ec\u02ea\u02fd\u02b2", "\u0215\u020e\u0232\u0215\u0213\u0208\u020f\u0206\u025d\u025f\u0249\u0248\u022d\u020b\u0200\u0217\u0200\u024e\u020d\u0200\u020f\u0206\u024e\u0232\u0215\u0213\u0208\u020f\u0206\u025a", "\u07e1\u07e0\u07fb\u07e6\u07e9\u07f6\u07b3\u07b1\u07a7\u07a6\u07d9", "\u0183\u0182\u0199\u0184\u018b\u0194\u01ac\u0181\u0181\u01d1\u01d3\u01c5\u01c4\u01bb", "\u069a\u068c\u0684\u0699\u06d1\u06d3\u06c5\u06c4\u06bb", "\u0453\u0445\u044d\u0450\u0418\u041a\u040c\u046e\u040d\u0472", "\u0426\u0430\u0438\u0425\u0461\u046d\u046f\u0479\u041b\u0478\u0407", "\u0000\u0016\u001e\u0003KI_=>^!", "\u062a\u0625\u0622\u062d\u0620\u0625\u0636\u0629\u0670\u0672\u0664\u0665\u061a"})
public final class Class1311 {
    public static int field5085 = 708489871;
    public static float field5086 = 0.39459914f;
    public static double field5087 = Double.longBitsToDouble(4603468330140801554L);
    public static double field5088 = Double.longBitsToDouble(4583321898634939008L);

    private static String DjkE1GtpaHHbcuOW(String a2, int b2) {
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
    private static CallSite D9Bp9SBDOZ6yLQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1311.DjkE1GtpaHHbcuOW(k2, -1191721856));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1311.DjkE1GtpaHHbcuOW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 58606 : 58605;
            block7: while (true) {
                switch (n3) {
                    case 58606: {
                        n3 = 58604;
                        continue block7;
                    }
                    case 58605: {
                        String c2 = Class1311.DjkE1GtpaHHbcuOW(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1311.DjkE1GtpaHHbcuOW(k2, -1191721856) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

