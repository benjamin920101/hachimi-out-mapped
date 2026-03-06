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

@HACHIMI_CLIENT(mv=100, d1={"\u8c54\u8c52\u8c55\u8c55\u8c53\u8c57\u8c5f\u8c5e", "\uce78\uce7a\uce7d\uce7c\uce7a\uce78\uce7a\uce7d", "\ub085\ub086\ub087\ub081\ub08f\ub08f\ub081\ub087", "\uc21a\uc21c\uc21b\uc21e\uc21d\uc218\uc217\uc21c", "\u36b4\u36b2\u36b6\u36b5\u36b6\u36b7\u36b6\u36b4", "\u5549\u5546\u554b\u554f\u554a\u5548\u5546\u554d", "\uc1fa\uc1f6\uc1fe\uc1fc\uc1ff\uc1fe\uc1fa\uc1f6", "\ue453\ue455\ue457\ue454\ue454\ue454\ue451\ue457", "\u9086\u9080\u9080\u9084\u9080\u908b\u9087\u9087", "\uabf6\uabfc\uabfe\uabfd\uabfc\uabf7\uabff", "\u93bc\u93bb\u93bf\u93b1\u93bf\u93b8\u93bc\u93be", "\ue45e\ue458\ue459\ue45c\ue459\ue45f\ue45a", "\uad6c\uad6c\uad6b\uad6c\uad6a\uad6e\uad68\uad6f", "\u0346\u0346\u0344\u0346\u0341\u0340\u0346\u0340"}, d2={"\u03c9\u0396\u0399\u039c\u039b\u039c\u0381\u03cb\u03c9\u03cb\u03dd\u03dc\u03a3", "\u0238\u026d\u026a\u026d\u0270\u023a\u0238\u023a\u022c\u022d\u0252", "\u017f\u017d\u016c\u015b\u0174\u0179\u016b\u016b\u0124\u0126\u0130\u0131\u0154\u0172\u0179\u016e\u0179\u0137\u0174\u0179\u0176\u017f\u0137\u015b\u0174\u0179\u016b\u016b\u0123", "\u02ce\u02c7\u02d5\u02ce\u02e5\u02c9\u02c2\u02c3\u029a\u0298\u028e\u028f\u02ef", "\u076f\u077b\u077f\u076b\u0766\u0779\u0736\u0734\u0722\u0746\u0760\u076b\u077c\u076b\u0725\u0766\u076b\u0764\u076d\u0725\u0745\u0768\u0760\u076f\u0769\u077e\u0731\u0723\u0750", "\u054a\u0545\u0546\u0547\u054c\u0515\u0517\u0501\u0500\u0565\u0543\u0548\u055f\u0548\u0506\u0545\u0548\u0547\u054e\u0506\u0566\u054b\u0543\u054c\u054a\u055d\u0512", "\u0355\u034e\u0372\u0355\u0353\u0348\u034f\u0346\u031d\u031f\u0309\u0308\u036d\u034b\u0340\u0357\u0340\u030e\u034d\u0340\u034f\u0346\u030e\u0372\u0355\u0353\u0348\u034f\u0346\u031a", "\u02a1\u02a0\u02bb\u02a6\u02a9\u02b6\u02f3\u02f1\u02e7\u02e6\u0299", "\u035e\u035f\u0344\u0359\u0356\u0349\u0371\u035c\u035c\u030c\u030e\u0318\u0319\u0366", "\u00c2\u00d4\u00dc\u00c1\u0089\u008b\u009d\u009c\u00e3", "\u032d\u033b\u0333\u032e\u0366\u0364\u0372\u0310\u0373\u030c", "\u069e\u0688\u0680\u069d\u06d9\u06d5\u06d7\u06c1\u06a3\u06c0\u06bf", "\u0200\u0216\u021e\u0203\u024b\u0249\u025f\u023d\u023e\u025e\u0221", "\u03af\u03a0\u03a7\u03a8\u03a5\u03a0\u03b3\u03ac\u03f5\u03f7\u03e1\u03e0\u039f"})
public final class Class2406 {
    public static float field6800;
    public static double field6801;

    static {
        field6801 = Double.longBitsToDouble(4599600710908866672L);
        field6800 = Float.intBitsToFloat(1092616192);
    }

    private static String JJ0yJcASQ9B4UYIh(String a2, int b2) {
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
    private static CallSite iKgdN69Ss1F2jT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2406.JJ0yJcASQ9B4UYIh(k2, 1648683986));
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
                int a2 = Integer.parseInt(Class2406.JJ0yJcASQ9B4UYIh(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2406.JJ0yJcASQ9B4UYIh(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2406.JJ0yJcASQ9B4UYIh(k2, 1648683986) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 19511 : 19512;
        block7: while (true) {
            switch (n3) {
                case 19512: {
                    n3 = 19510;
                    continue block7;
                }
                case 19511: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

