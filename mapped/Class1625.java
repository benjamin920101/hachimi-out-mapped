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

@HACHIMI_CLIENT(mv=100, d1={"\ua712\ua713\ua711\ua715\ua713\ua710\ua71f", "\ud98b\ud989\ud981\ud989\ud980\ud98f\ud98b\ud989", "\u6f95\u6f99\u6f99\u6f9b\u6f9b\u6f9c\u6f94", "\ub4f4\ub4f4\ub4f4\ub4ff\ub4fe\ub4fd\ub4f9", "\u7b7c\u7b7c\u7b7c\u7b77\u7b7c\u7b7b\u7b77\u7b78", "\uce0c\uce08\uce0d\uce09\uce08\uce07\uce07\uce0c", "\u6f12\u6f1f\u6f14\u6f14\u6f14\u6f13\u6f15\u6f10", "\u5f13\u5f13\u5f14\u5f16\u5f12\u5f10\u5f10", "\u9971\u9974\u9975\u9977\u9971\u9971\u9974\u9970", "\u42d9\u42d2\u42d2\u42d2\u42d9\u42d9\u42df", "\u9ab7\u9ab5\u9ab1\u9abf\u9ab1\u9ab4\u9ab4\u9ab3", "\u30d8\u30d0\u30d8\u30d1\u30da\u30dd\u30dc", "\ua41a\ua419\ua41f\ua41d\ua41a\ua419\ua41e\ua41e", "\uab2c\uab2d\uab2d\uab2c\uab2a\uab2b\uab2b\uab2b", "\ud20d\ud20d\ud206\ud20d\ud20c\ud208\ud20e\ud20e"}, d2={"\u0669\u0647\u0650\u260c\u063e\u063c\u062a\u064e\u0668\u0663\u0674\u0663\u062d\u066e\u0663\u066c\u0665\u062d\u0651\u0676\u0670\u066b\u066c\u0665\u0639\u062b\u064e\u0668\u0663\u0674\u0663\u062d\u066e\u0663\u066c\u0665\u062d\u0651\u0676\u0670\u066b\u066c\u0665\u0639", "\u012e\u0171\u017e\u017b\u017c\u017b\u0166\u012c\u012e\u012c\u013a\u013b\u0144", "\u0389\u03dc\u03db\u03dc\u03c1\u038b\u0389\u038b\u039d\u039c\u03e3", "\u0013\u0011\u00007\u0018\u0015\u0007\u0007HJ\\]8\u001e\u0015\u0002\u0015[\u0018\u0015\u001a\u0013[7\u0018\u0015\u0007\u0007O", "\u0753\u075a\u0748\u0753\u0778\u0754\u075f\u075e\u0707\u0705\u0713\u0712\u0772", "^JNZWH\u0007\u0005\u0013wQZMZ\u0014WZU\\\u0014tYQ^XO\u0000\u0012a", "\u0353\u035c\u035f\u035e\u0355\u030c\u030e\u0318\u0319\u037c\u035a\u0351\u0346\u0351\u031f\u035c\u0351\u035e\u0357\u031f\u037f\u0352\u035a\u0355\u0353\u0344\u030b", "\u06b6\u06ad\u0691\u06b6\u06b0\u06ab\u06ac\u06a5\u06fe\u06fc\u06ea\u06eb\u068e\u06a8\u06a3\u06b4\u06a3\u06ed\u06ae\u06a3\u06ac\u06a5\u06ed\u0691\u06b6\u06b0\u06ab\u06ac\u06a5\u06f9", "\u02fa\u02fb\u02e0\u02fd\u02f2\u02ed\u02a8\u02aa\u02bc\u02bd\u02c2", "\u0461\u0460\u047b\u0466\u0469\u0476\u044e\u0463\u0463\u0433\u0431\u0427\u0426\u0459", "\u0147\u0151\u0159\u0144\u010c\u010e\u0118\u0119\u0166", "\u04ca\u04dc\u04d4\u04c9\u0481\u0483\u0495\u04f7\u0494\u04eb", "\u07c1\u07d7\u07df\u07c2\u0786\u078a\u0788\u079e\u07fc\u079f\u07e0", "\u03d9\u03cf\u03c7\u03da\u0392\u0390\u0386\u03e4\u03e7\u0387\u03f8", "\u0192\u019d\u019a\u0195\u0198\u019d\u018e\u0191\u01c8\u01ca\u01dc\u01dd\u01a2"})
public final class Class1625 {
    public static float field6053;
    public static int field6054 = 0;
    public static double field6055;

    private static String yi3wnAn4id52e8HW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aZ\u200e = "FogStart";
        field6055 = Double.longBitsToDouble(4603721640738886283L);
        field6053 = Float.intBitsToFloat(1059086585);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite IWBrAkqxMs8NXx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1625.yi3wnAn4id52e8HW(k2, -631821251));
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
                int a2 = Integer.parseInt(Class1625.yi3wnAn4id52e8HW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1625.yi3wnAn4id52e8HW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1625.yi3wnAn4id52e8HW(k2, -631821251) + " " + l2 + " " + m2);
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

