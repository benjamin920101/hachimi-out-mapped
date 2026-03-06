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

@HACHIMI_CLIENT(mv=100, d1={"\u881d\u881c\u881f\u881e\u8818\u8818\u8813\u8818", "\u51b4\u51bd\u51bc\u51be\u51b4\u51b5\u51b9", "\ua6c4\ua6c0\ua6c2\ua6c3\ua6c0\ua6c2\ua6c0\ua6c5", "\u820b\u8200\u820a\u8200\u820d\u8200\u820a\u8201", "\u3e16\u3e16\u3e12\u3e13\u3e15\u3e12\u3e10\u3e11", "\u87ee\u87eb\u87e6\u87e7\u87ec\u87ea\u87e6\u87ef", "\u7e64\u7e68\u7e65\u7e67\u7e61\u7e62\u7e69\u7e61", "\ub842\ub841\ub846\ub844\ub846\ub841\ub843\ub84c", "\u0138\u0132\u013c\u0133\u013f\u0138\u013f\u0138", "\u0b08\u0b09\u0b03\u0b0c\u0b03\u0b08\u0b08\u0b02", "\ud6b3\ud6b0\ud6b5\ud6b8\ud6b4\ud6b5\ud6b2\ud6b2", "\u2b08\u2b0d\u2b0b\u2b0a\u2b0c\u2b09\u2b0e\u2b09", "\u8498\u8498\u849e\u8499\u8497\u849d\u849f", "\u4f8d\u4f8d\u4f8c\u4f8f\u4f84\u4f88\u4f89\u4f8b"}, d2={"\u076b\u0734\u073b\u073e\u0739\u073e\u0723\u0769\u076b\u0769\u077f\u077e\u0701", "\u0500\u0555\u0552\u0555\u0548\u0502\u0500\u0502\u0514\u0515\u056a", "~|mZuxjj%'10Usxox6uxw~6Zuxjj\"", "\u0115\u011c\u010e\u0115\u013e\u0112\u0119\u0118\u0141\u0143\u0155\u0154\u0134", "\u0672\u0666\u0662\u0676\u067b\u0664\u062b\u0629\u063f\u065b\u067d\u0676\u0661\u0676\u0638\u067b\u0676\u0679\u0670\u0638\u0658\u0675\u067d\u0672\u0674\u0663\u062c\u063e\u064d", "\u0744\u074b\u0748\u0749\u0742\u071b\u0719\u070f\u070e\u076b\u074d\u0746\u0751\u0746\u0708\u074b\u0746\u0749\u0740\u0708\u0768\u0745\u074d\u0742\u0744\u0753\u071c", "\u05d2\u05c9\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059a\u0598\u058e\u058f\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d", "\u07d3\u07d2\u07c9\u07d4\u07db\u07c4\u0781\u0783\u0795\u0794\u07eb", "\u026f\u026e\u0275\u0268\u0267\u0278\u0240\u026d\u026d\u023d\u023f\u0229\u0228\u0257", "\u02c9\u02df\u02d7\u02ca\u0282\u0280\u0296\u0297\u02e8", "\u025b\u024d\u0245\u0258\u0210\u0212\u0204\u0266\u0205\u027a", "\u0721\u0737\u073f\u0722\u0766\u076a\u0768\u077e\u071c\u077f\u0700", "\u0786\u0790\u0798\u0785\u07cd\u07cf\u07d9\u07bb\u07b8\u07d8\u07a7", "\u07f4\u07fb\u07fc\u07f3\u07fe\u07fb\u07e8\u07f7\u07ae\u07ac\u07ba\u07bb\u07c4"})
public final class Class4172 {
    public static float field9721;
    public static float field9722;
    public static double field9723;

    private static String z326cjV7O1oNgYew(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9723 = Double.longBitsToDouble(4604256518090839137L);
        field9721 = Float.intBitsToFloat(1051683826);
        field9722 = Float.intBitsToFloat(0x3F333333);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ejq44rbYI4SU9w(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4172.z326cjV7O1oNgYew(k2, -732717945));
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
                int a2 = Integer.parseInt(Class4172.z326cjV7O1oNgYew(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4172.z326cjV7O1oNgYew(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4172.z326cjV7O1oNgYew(k2, -732717945) + " " + l2 + " " + m2);
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

