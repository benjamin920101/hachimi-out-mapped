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
@HACHIMI_CLIENT(mv=100, d1={"\ua407\ua409\ua408\ua408\ua407\ua40e\ua40d", "\u80c2\u80c0\u80c0\u80c3\u80c4\u80c0\u80c3\u80cf", "\u5537\u553b\u5532\u5536\u5530\u5535\u5536\u553b", "\uba33\uba36\uba35\uba35\uba36\uba30\uba35\uba37", "\u6445\u6445\u6444\u6440\u6447\u6443\u6442\u6445", "\u5f61\u5f67\u5f64\u5f61\u5f6b\u5f66\u5f6a\u5f6a", "\ub7c2\ub7c7\ub7c2\ub7c1\ub7c7\ub7cd\ub7c2\ub7cc", "\u6a1b\u6a12\u6a1d\u6a19\u6a1e\u6a1e\u6a1f", "\u0a98\u0a9f\u0a95\u0a9f\u0a94\u0a9a\u0a94\u0a9f", "\ua01c\ua019\ua01e\ua01f\ua019\ua01b\ua01c\ua01b", "\uc208\uc20e\uc20e\uc200\uc20e\uc20e\uc209\uc20e", "\u1d6f\u1d6d\u1d6b\u1d68\u1d68\u1d6c\u1d6d\u1d6d", "\u3049\u304b\u3048\u304d\u3043\u3042\u3049\u304f", "\u0d71\u0d72\u0d78\u0d70\u0d78\u0d71\u0d74\u0d77"}, d2={"\u07b0\u07ef\u07e0\u07e5\u07e2\u07e5\u07f8\u07b2\u07b0\u07b2\u07a4\u07a5\u07da", "\u05be\u05eb\u05ec\u05eb\u05f6\u05bc\u05be\u05bc\u05aa\u05ab\u05d4", "\u0644\u0646\u0657\u0660\u064f\u0642\u0650\u0650\u061f\u061d\u060b\u060a\u066f\u0649\u0642\u0655\u0642\u060c\u064f\u0642\u064d\u0644\u060c\u0660\u064f\u0642\u0650\u0650\u0618", "\u0349\u0340\u0352\u0349\u0362\u034e\u0345\u0344\u031d\u031f\u0309\u0308\u0368", "\u0279\u026d\u0269\u027d\u0270\u026f\u0220\u0222\u0234\u0250\u0276\u027d\u026a\u027d\u0233\u0270\u027d\u0272\u027b\u0233\u0253\u027e\u0276\u0279\u027f\u0268\u0227\u0235\u0246", "\u03c2\u03cd\u03ce\u03cf\u03c4\u039d\u039f\u0389\u0388\u03ed\u03cb\u03c0\u03d7\u03c0\u038e\u03cd\u03c0\u03cf\u03c6\u038e\u03ee\u03c3\u03cb\u03c4\u03c2\u03d5\u039a", "\u029a\u0281\u02bd\u029a\u029c\u0287\u0280\u0289\u02d2\u02d0\u02c6\u02c7\u02a2\u0284\u028f\u0298\u028f\u02c1\u0282\u028f\u0280\u0289\u02c1\u02bd\u029a\u029c\u0287\u0280\u0289\u02d5", "\u078a\u078b\u0790\u078d\u0782\u079d\u07d8\u07da\u07cc\u07cd\u07b2", "\u0499\u0498\u0483\u049e\u0491\u048e\u04b6\u049b\u049b\u04cb\u04c9\u04df\u04de\u04a1", "\u061c\u060a\u0602\u061f\u0657\u0655\u0643\u0642\u063d", "\u054f\u0559\u0551\u054c\u0504\u0506\u0510\u0572\u0511\u056e", "\u05a9\u05bf\u05b7\u05aa\u05ee\u05e2\u05e0\u05f6\u0594\u05f7\u0588", "\u02ba\u02ac\u02a4\u02b9\u02f1\u02f3\u02e5\u0287\u0284\u02e4\u029b", "\u07bd\u07b2\u07b5\u07ba\u07b7\u07b2\u07a1\u07be\u07e7\u07e5\u07f3\u07f2\u078d"})
public final class Class1779 {
    public static int field6660 = 3;
    public static float field6661 = Float.intBitsToFloat(1128792064);
    public static int field6662 = 1663972435;
    public static float field6663;
    public static double field6664;

    /*
     * Enabled aggressive block sorting
     */
    private static String QnewOewlDh22D2Wn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 39104 : 39105;
            block5: while (true) {
                switch (n2) {
                    case 39105: {
                        n2 = 39103;
                        continue block5;
                    }
                    case 39104: {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 6vo7cOZj6wBqTq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1779.QnewOewlDh22D2Wn(k2, -426562832));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1779.QnewOewlDh22D2Wn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1779.QnewOewlDh22D2Wn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 23790 : 23791;
        block7: while (true) {
            switch (n3) {
                case 23791: {
                    n3 = 23789;
                    continue block7;
                }
                case 23790: {
                    throw new Exception("Can't find method in " + Class1779.QnewOewlDh22D2Wn(k2, -426562832) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field6664 = Double.longBitsToDouble(4601749381085241766L);
        field6663 = Float.intBitsToFloat(1120403456);
    }
}

