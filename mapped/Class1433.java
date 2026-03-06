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

@HACHIMI_CLIENT(mv=100, d1={"\u2af7\u2afe\u2afe\u2aff\u2af8\u2afe\u2afe", "\ud050\ud050\ud057\ud052\ud057\ud053\ud051\ud052", "\u0d3a\u0d3b\u0d3b\u0d36\u0d38\u0d36\u0d36\u0d37", "\u7574\u7570\u7571\u7571\u7577\u7577\u7577\u7573", "\uc722\uc727\uc720\uc72e\uc727\uc725\uc726\uc72f", "\ud061\ud065\ud061\ud063\ud064\ud065\ud067\ud063", "\ue421\ue425\ue424\ue422\ue422\ue427\ue426\ue424", "\u592f\u592f\u592c\u592f\u5927\u592b\u592d\u592e", "\u13c0\u13c7\u13c4\u13c2\u13c2\u13c5\u13c1\u13c4", "\u903a\u9036\u9037\u9037\u903c\u9039\u903d\u903c", "\u8ce3\u8ce6\u8ce5\u8ce6\u8ce4\u8ce4\u8ce0\u8ceb", "\ue0af\ue0ac\ue0ae\ue0aa\ue0a5\ue0a4\ue0ad\ue0aa", "\u8b8d\u8b8f\u8b88\u8b8e\u8b8c\u8b88\u8b88\u8b8a", "\u6854\u6855\u6854\u6851\u6851\u6856\u6850\u685f"}, d2={"\u012e\u0171\u017e\u017b\u017c\u017b\u0166\u012c\u012e\u012c\u013a\u013b\u0144", "\u0243\u0216\u0211\u0216\u020b\u0241\u0243\u0241\u0257\u0256\u0229", "\u074d\u074f\u075e\u0769\u0746\u074b\u0759\u0759\u0716\u0714\u0702\u0703\u0766\u0740\u074b\u075c\u074b\u0705\u0746\u074b\u0744\u074d\u0705\u0769\u0746\u074b\u0759\u0759\u0711", "\u04d5\u04dc\u04ce\u04d5\u04fe\u04d2\u04d9\u04d8\u0481\u0483\u0495\u0494\u04f4", "\u0413\u0407\u0403\u0417\u041a\u0405\u044a\u0448\u045e\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0439\u0414\u041c\u0413\u0415\u0402\u044d\u045f\u042c", "\u03fd\u03f2\u03f1\u03f0\u03fb\u03a2\u03a0\u03b6\u03b7\u03d2\u03f4\u03ff\u03e8\u03ff\u03b1\u03f2\u03ff\u03f0\u03f9\u03b1\u03d1\u03fc\u03f4\u03fb\u03fd\u03ea\u03a5", "\u01cb\u01d0\u01ec\u01cb\u01cd\u01d6\u01d1\u01d8\u0183\u0181\u0197\u0196\u01f3\u01d5\u01de\u01c9\u01de\u0190\u01d3\u01de\u01d1\u01d8\u0190\u01ec\u01cb\u01cd\u01d6\u01d1\u01d8\u0184", "\u02d0\u02d1\u02ca\u02d7\u02d8\u02c7\u0282\u0280\u0296\u0297\u02e8", "\u041e\u041f\u0404\u0419\u0416\u0409\u0431\u041c\u041c\u044c\u044e\u0458\u0459\u0426", "\u0736\u0720\u0728\u0735\u077d\u077f\u0769\u0768\u0717", "\u0143\u0155\u015d\u0140\u0108\u010a\u011c\u017e\u011d\u0162", "\u052f\u0539\u0531\u052c\u0568\u0564\u0566\u0570\u0512\u0571\u050e", "\u0249\u025f\u0257\u024a\u0202\u0200\u0216\u0274\u0277\u0217\u0268", "zur}pufy \"45J"})
public final class Class1433 {
    public static int field5476 = -969202892;
    public static float field5477 = Float.intBitsToFloat(1041989216);

    private static String aF7rjYRHygFk2GIA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite JvqjePKnLRgS96(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1433.aF7rjYRHygFk2GIA(k2, -2097717297));
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
                int a2 = Integer.parseInt(Class1433.aF7rjYRHygFk2GIA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1433.aF7rjYRHygFk2GIA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1433.aF7rjYRHygFk2GIA(k2, -2097717297) + " " + l2 + " " + m2);
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

