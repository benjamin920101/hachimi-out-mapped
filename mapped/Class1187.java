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

@HACHIMI_CLIENT(mv=100, d1={"\u767a\u767f\u767e\u767b\u7675\u7674\u767d\u7674", "\u5e49\u5e45\u5e4a\u5e49\u5e4c\u5e45\u5e4c\u5e48", "\u1a11\u1a10\u1a19\u1a16\u1a15\u1a11\u1a17\u1a16", "\u3061\u3066\u3065\u306b\u3061\u3064\u3067\u306a", "\u62bf\u62b7\u62b1\u62b2\u62b3\u62b6\u62bf", "\u8e48\u8e4a\u8e4a\u8e49\u8e49\u8e4f\u8e4b\u8e4c", "\u202e\u202a\u2029\u202b\u2024\u2028\u202a\u2029", "\ue1e4\ue1e1\ue1e9\ue1e4\ue1e8\ue1e8\ue1e2\ue1e1", "\u84cc\u84cd\u84ce\u84c6\u84cc\u84c8\u84ce\u84cb", "\u5f59\u5f53\u5f5c\u5f52\u5f5b\u5f5f\u5f5e\u5f53", "\u98b2\u98b6\u98b2\u98b1\u98be\u98b4\u98b2\u98bf", "\ua6d9\ua6da\ua6db\ua6db\ua6d0\ua6de\ua6d0", "\u8178\u8178\u817b\u817b\u8170\u8171\u8178\u817a", "\ua8c6\ua8ca\ua8c5\ua8c6\ua8ca\ua8cb\ua8c3\ua8cb", "\u10d8\u10da\u10dc\u10d8\u10d8\u10dd\u10dd\u10d9", "\udc99\udc95\udc98\udc9f\udc98\udc94\udc9e\udc9d"}, d2={"\u0561\u0547\u0567\u250b\u0539\u053b\u052d\u0549\u056f\u0564\u0573\u0564\u052a\u0569\u0564\u056b\u0562\u052a\u0556\u0571\u0577\u056c\u056b\u0562\u053e\u052c\u0549\u056f\u0564\u0573\u0564\u052a\u0569\u0564\u056b\u0562\u052a\u0556\u0571\u0577\u056c\u056b\u0562\u053e", "\u03e6\u03c0\u03e1\u238c\u03be\u03bc\u03aa\u03ce\u03e8\u03e3\u03f4\u03e3\u03ad\u03ee\u03e3\u03ec\u03e5\u03ad\u03d1\u03f6\u03f0\u03eb\u03ec\u03e5\u03b9\u03ab\u03ce\u03e8\u03e3\u03f4\u03e3\u03ad\u03ee\u03e3\u03ec\u03e5\u03ad\u03d1\u03f6\u03f0\u03eb\u03ec\u03e5\u03b9", "\u05dd\u0582\u058d\u0588\u058f\u0588\u0595\u05df\u05dd\u05df\u05c9\u05c8\u05b7", "\u058d\u05d8\u05df\u05d8\u05c5\u058f\u058d\u058f\u0599\u0598\u05e7", "\u0252\u0250\u0241\u0276\u0259\u0254\u0246\u0246\u0209\u020b\u021d\u021c\u0279\u025f\u0254\u0243\u0254\u021a\u0259\u0254\u025b\u0252\u021a\u0276\u0259\u0254\u0246\u0246\u020e", "\u0679\u0670\u0662\u0679\u0652\u067e\u0675\u0674\u062d\u062f\u0639\u0638\u0658", "\u059a\u058e\u058a\u059e\u0593\u058c\u05c3\u05c1\u05d7\u05b3\u0595\u059e\u0589\u059e\u05d0\u0593\u059e\u0591\u0598\u05d0\u05b0\u059d\u0595\u059a\u059c\u058b\u05c4\u05d6\u05a5", "\u022d\u0222\u0221\u0220\u022b\u0272\u0270\u0266\u0267\u0202\u0224\u022f\u0238\u022f\u0261\u0222\u022f\u0220\u0229\u0261\u0201\u022c\u0224\u022b\u022d\u023a\u0275", "\u0513\u0508\u0534\u0513\u0515\u050e\u0509\u0500\u055b\u0559\u054f\u054e\u052b\u050d\u0506\u0511\u0506\u0548\u050b\u0506\u0509\u0500\u0548\u0534\u0513\u0515\u050e\u0509\u0500\u055c", "\u058d\u058c\u0597\u058a\u0585\u059a\u05df\u05dd\u05cb\u05ca\u05b5", "\u07c1\u07c0\u07db\u07c6\u07c9\u07d6\u07ee\u07c3\u07c3\u0793\u0791\u0787\u0786\u07f9", "\u02f4\u02e2\u02ea\u02f7\u02bf\u02bd\u02ab\u02aa\u02d5", "\u0569\u057f\u0577\u056a\u0522\u0520\u0536\u0554\u0537\u0548", "\u0247\u0251\u0259\u0244\u0200\u020c\u020e\u0218\u027a\u0219\u0266", "\u049d\u048b\u0483\u049e\u04d6\u04d4\u04c2\u04a0\u04a3\u04c3\u04bc", "\u04d7\u04d8\u04df\u04d0\u04dd\u04d8\u04cb\u04d4\u048d\u048f\u0499\u0498\u04e7"})
public final class Class1187 {
    public static float field4700;
    public static double field4701;

    private static String RVYL9f0XSwVrjubt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        o\u200e = "CRYSTAL";
        ah\u200e = "AES/CBC/PKCS5Padding";
        field4700 = Float.intBitsToFloat(1054463028);
        field4701 = Double.longBitsToDouble(4603006440279900819L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite sS1WXiLz4hMN2p(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1187.RVYL9f0XSwVrjubt(k2, 1397512179));
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
                int a2 = Integer.parseInt(Class1187.RVYL9f0XSwVrjubt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1187.RVYL9f0XSwVrjubt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1187.RVYL9f0XSwVrjubt(k2, 1397512179) + " " + l2 + " " + m2);
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

